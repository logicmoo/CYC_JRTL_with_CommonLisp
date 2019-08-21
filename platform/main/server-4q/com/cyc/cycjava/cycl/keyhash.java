package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.keyhash;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.keyhash.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.keyhash.*; 
 public final class keyhash extends SubLTranslatedFile {
    public static final SubLFile me = new keyhash();

    public static final String myName = "com.cyc.cycjava.cycl.keyhash";

    public static final String myFingerPrint = "3ee8348a59c71557c9acc373ecdb23c285615a19693f590f7440f7b0b52c18f8";

    // defconstant
    public static final SubLSymbol $dtp_keyhash$ = makeSymbol("*DTP-KEYHASH*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_keyhash$ = makeSymbol("*CFASL-OPCODE-KEYHASH*");

    // Internal Constants
    public static final SubLSymbol KEYHASH = makeSymbol("KEYHASH");

    public static final SubLSymbol KEYHASH_P = makeSymbol("KEYHASH-P");

    private static final SubLInteger $int$137 = makeInteger(137);

    public static final SubLList $list3 = list(makeSymbol("NODES"), makeSymbol("TEST"), makeSymbol("COUNT"), makeSymbol("HASH-STASH"));

    public static final SubLList $list4 = list(makeKeyword("NODES"), makeKeyword("TEST"), makeKeyword("COUNT"), makeKeyword("HASH-STASH"));

    public static final SubLList $list5 = list(makeSymbol("KHASH-NODES"), makeSymbol("KHASH-TEST"), makeSymbol("KHASH-COUNT"), makeSymbol("KHASH-HASH-STASH"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-KHASH-NODES"), makeSymbol("_CSETF-KHASH-TEST"), makeSymbol("_CSETF-KHASH-COUNT"), makeSymbol("_CSETF-KHASH-HASH-STASH"));

    public static final SubLSymbol PRINT_KEY_HASH = makeSymbol("PRINT-KEY-HASH");

    public static final SubLSymbol KEYHASH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KEYHASH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KEYHASH-P"));

    private static final SubLSymbol KHASH_NODES = makeSymbol("KHASH-NODES");

    private static final SubLSymbol _CSETF_KHASH_NODES = makeSymbol("_CSETF-KHASH-NODES");

    private static final SubLSymbol KHASH_TEST = makeSymbol("KHASH-TEST");

    private static final SubLSymbol _CSETF_KHASH_TEST = makeSymbol("_CSETF-KHASH-TEST");

    private static final SubLSymbol KHASH_COUNT = makeSymbol("KHASH-COUNT");

    private static final SubLSymbol _CSETF_KHASH_COUNT = makeSymbol("_CSETF-KHASH-COUNT");

    private static final SubLSymbol KHASH_HASH_STASH = makeSymbol("KHASH-HASH-STASH");

    private static final SubLSymbol _CSETF_KHASH_HASH_STASH = makeSymbol("_CSETF-KHASH-HASH-STASH");









    private static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_KEYHASH = makeSymbol("MAKE-KEYHASH");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str29$_ = makeString("/");

    private static final SubLSymbol $keyhash_empty_key$ = makeSymbol("*KEYHASH-EMPTY-KEY*");

    private static final SubLString $$$The_Empty_KEYHASH_Key = makeString("The Empty KEYHASH Key");

    public static final SubLList $list32 = list(makeSymbol("VAL"));

    public static final SubLList $list33 = list(makeSymbol("*KEYHASH-EMPTY-KEY*"));

    public static final SubLList $list34 = list(makeKeyword("VALUES"), NIL);

    private static final SubLSymbol LEGACY_KEYHASH_FORMAT_P = makeSymbol("LEGACY-KEYHASH-FORMAT-P");





    private static final SubLList $list38 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list39 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym42$THE_VALUE = makeUninternedSymbol("THE-VALUE");



    private static final SubLSymbol DO_KEYHASH_NODES = makeSymbol("DO-KEYHASH-NODES");



    public static final SubLList $list46 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_KEYHASH = makeSymbol("DO-KEYHASH");

    public static final SubLList $list48 = list(makeSymbol("DO-KEYHASH"), makeSymbol("DO-SET-CONTENTS"));

    private static final SubLSymbol KEYHASH_EMPTY_KEY = makeSymbol("KEYHASH-EMPTY-KEY");

    private static final SubLList $list50 = list(makeSymbol("DO-SET-CONTENTS"));

    private static final SubLSymbol DO_KEYHASH_VALID_KEY_P = makeSymbol("DO-KEYHASH-VALID-KEY-P");



    private static final SubLInteger $int$68 = makeInteger(68);

    private static final SubLSymbol CFASL_INPUT_KEYHASH = makeSymbol("CFASL-INPUT-KEYHASH");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_KEYHASH_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-KEYHASH-METHOD");

    public static SubLObject keyhash_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_key_hash(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject keyhash_p(final SubLObject v_object) {
        return v_object.getClass() == $keyhash_native.class ? T : NIL;
    }

    public static SubLObject khash_nodes(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject khash_test(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject khash_count(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject khash_hash_stash(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_khash_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_khash_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_khash_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_khash_hash_stash(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "keyhash.keyhash_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_keyhash(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $keyhash_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NODES)) {
                _csetf_khash_nodes(v_new, current_value);
            } else
                if (pcase_var.eql($TEST)) {
                    _csetf_khash_test(v_new, current_value);
                } else
                    if (pcase_var.eql($COUNT)) {
                        _csetf_khash_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($HASH_STASH)) {
                            _csetf_khash_hash_stash(v_new, current_value);
                        } else {
                            Errors.error($str22$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_keyhash(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KEYHASH, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NODES, khash_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, khash_test(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, khash_count(obj));
        funcall(visitor_fn, obj, $SLOT, $HASH_STASH, khash_hash_stash(obj));
        funcall(visitor_fn, obj, $END, MAKE_KEYHASH, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_keyhash_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_keyhash(obj, visitor_fn);
    }

    public static SubLObject print_key_hash(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            princ(keyhash_test(v_object), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(keyhash_count(v_object), stream);
            write_string($str29$_, stream, UNPROVIDED, UNPROVIDED);
            princ(keyhash_capacity(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject is_empty_keyhash_key_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject val = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        val = current.first();
        current = current.rest();
        if (NIL == current) {
            return listS(EQ, val, $list33);
        }
        cdestructuring_bind_error(datum, $list32);
        return NIL;
    }

    public static SubLObject set_keyhash_nodes(final SubLObject v_keyhash, final SubLObject nodes) {
        _csetf_khash_nodes(v_keyhash, nodes);
        return v_keyhash;
    }

    public static SubLObject keyhash_nodes(final SubLObject v_keyhash) {
        return khash_nodes(v_keyhash);
    }

    public static SubLObject allocate_keyhash_nodes(final SubLObject size, final SubLObject test) {
        return make_hash_table(size, test, $list34);
    }

    public static SubLObject clear_all_keyhash_nodes(final SubLObject v_keyhash) {
        clrhash(keyhash_nodes(v_keyhash));
        return v_keyhash;
    }

    public static SubLObject keyhash_test_internal(final SubLObject v_keyhash) {
        return hash_table_test(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_count_internal(final SubLObject v_keyhash) {
        return hash_table_count(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_capacity_internal(final SubLObject v_keyhash) {
        return hash_table_size(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_matching_key_internal(final SubLObject key, final SubLObject v_keyhash) {
        return gethash_without_values(key, keyhash_nodes(v_keyhash), UNPROVIDED);
    }

    public static SubLObject keyhash_set_key(final SubLObject key, final SubLObject v_keyhash) {
        sethash(key, keyhash_nodes(v_keyhash), key);
        return key;
    }

    public static SubLObject keyhash_remove_key(final SubLObject key, final SubLObject v_keyhash) {
        return remhash(key, keyhash_nodes(v_keyhash));
    }

    public static SubLObject new_keyhash_iterator_internal(final SubLObject v_keyhash) {
        return iteration.new_hash_table_keys_iterator(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_random_key_internal(final SubLObject v_keyhash) {
        return hash_table_utilities.hash_table_random_key(keyhash_nodes(v_keyhash));
    }

    public static SubLObject legacy_keyhash_test_function(final SubLObject v_keyhash) {
        return khash_test(v_keyhash);
    }

    public static SubLObject clear_legacy_keyhash_data(final SubLObject v_keyhash) {
        _csetf_khash_test(v_keyhash, NIL);
        _csetf_khash_count(v_keyhash, NIL);
        _csetf_khash_hash_stash(v_keyhash, NIL);
        return v_keyhash;
    }

    public static SubLObject legacy_keyhash_format_p(final SubLObject v_keyhash) {
        return vectorp(keyhash_nodes(v_keyhash));
    }

    public static SubLObject new_keyhash_format_p(final SubLObject v_keyhash) {
        return hash_table_p(keyhash_nodes(v_keyhash));
    }

    public static SubLObject maybe_swizzle_old_vector_to_hash(final SubLObject v_keyhash) {
        if (NIL == new_keyhash_format_p(v_keyhash)) {
            SubLTrampolineFile.enforceType(v_keyhash, LEGACY_KEYHASH_FORMAT_P);
            final SubLObject old_nodes = keyhash_nodes(v_keyhash);
            final SubLObject size = length(old_nodes);
            final SubLObject test = legacy_keyhash_test_function(v_keyhash);
            clear_legacy_keyhash_data(v_keyhash);
            set_keyhash_nodes(v_keyhash, allocate_keyhash_nodes(size, test));
            final SubLObject vector_var = old_nodes;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject key;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                key = aref(vector_var, element_num);
                if (!key.eql($keyhash_empty_key$.getGlobalValue())) {
                    setkeyhash(key, v_keyhash);
                }
            }
        }
        return v_keyhash;
    }

    public static SubLObject new_keyhash(final SubLObject size, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != fixnump(size) : "Types.fixnump(size) " + "CommonSymbols.NIL != Types.fixnump(size) " + size;
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        if (test.isFunction()) {
            test = hash_table_utilities.hash_test_to_symbol(test);
        }
        final SubLObject v_keyhash = make_keyhash(UNPROVIDED);
        set_keyhash_nodes(v_keyhash, allocate_keyhash_nodes(size, test));
        return v_keyhash;
    }

    public static SubLObject clrkeyhash(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        clear_all_keyhash_nodes(v_keyhash);
        return v_keyhash;
    }

    public static SubLObject keyhash_test(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_test_internal(v_keyhash);
    }

    public static SubLObject keyhash_count(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_count_internal(v_keyhash);
    }

    public static SubLObject keyhash_capacity(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        return keyhash_capacity_internal(v_keyhash);
    }

    public static SubLObject getkeyhash(final SubLObject key, final SubLObject v_keyhash) {
        final SubLObject matching_key = keyhash_matching_key(key, v_keyhash);
        return list_utilities.sublisp_boolean(matching_key);
    }

    public static SubLObject keyhash_matching_key(final SubLObject key, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_matching_key_internal(key, v_keyhash);
    }

    public static SubLObject setkeyhash(final SubLObject key, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_set_key(key, v_keyhash);
    }

    public static SubLObject remkeyhash(final SubLObject key, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_remove_key(key, v_keyhash);
    }

    public static SubLObject new_keyhash_iterator(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return new_keyhash_iterator_internal(v_keyhash);
    }

    public static SubLObject keyhash_iterator_next(final SubLObject it) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject element = iteration.iteration_next(it);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return NIL != validP ? element : $keyhash_empty_key$.getGlobalValue();
    }

    public static SubLObject do_keyhash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject v_keyhash = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        v_keyhash = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list38);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list38);
            if (NIL == member(current_$1, $list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject the_value = $sym42$THE_VALUE;
        return listS(DO_HASH_TABLE, list(key, the_value, list(DO_KEYHASH_NODES, v_keyhash), $DONE, done), list(IGNORE, the_value), append(body, NIL));
    }

    public static SubLObject some_keyhash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject v_keyhash = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        v_keyhash = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        done = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_KEYHASH, list(key, v_keyhash, $DONE, done), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    public static SubLObject do_keyhash_nodes(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_nodes(v_keyhash);
    }

    public static SubLObject keyhash_empty_key() {
        return $keyhash_empty_key$.getGlobalValue();
    }

    public static SubLObject do_keyhash_valid_key_p(final SubLObject key) {
        return keyhash_valid_key_p(key);
    }

    public static SubLObject keyhash_valid_key_p(final SubLObject key) {
        return makeBoolean(!key.eql($keyhash_empty_key$.getGlobalValue()));
    }

    public static SubLObject mapkeyhash(final SubLObject function, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        final SubLObject cdohash_table = do_keyhash_nodes(v_keyhash);
        SubLObject node_key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                node_key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                funcall(function, node_key);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject cfasl_output_object_keyhash_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_keyhash(v_object, stream);
    }

    public static SubLObject cfasl_output_keyhash(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_keyhash$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(keyhash_test(v_object));
        final SubLObject size = keyhash_count(v_object);
        cfasl_output(test, stream);
        cfasl_output(size, stream);
        final SubLObject cdohash_table = do_keyhash_nodes(v_object);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                cfasl_output(key, stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_object;
    }

    public static SubLObject cfasl_input_keyhash(final SubLObject stream) {
        final SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject test = NIL;
        SubLObject v_keyhash = NIL;
        final SubLObject pcase_var = type;
        if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
            test = symbol_function(type);
        }
        v_keyhash = new_keyhash(size, test);
        SubLObject index;
        SubLObject key;
        for (index = NIL, index = ZERO_INTEGER; index.numL(size); index = add(index, ONE_INTEGER)) {
            key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            setkeyhash(key, v_keyhash);
        }
        return v_keyhash;
    }

    public static SubLObject copy_keyhash(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        final SubLObject size = keyhash_count(v_keyhash);
        final SubLObject test = keyhash_test(v_keyhash);
        final SubLObject new_keyhash = new_keyhash(size, test);
        final SubLObject cdohash_table = do_keyhash_nodes(v_keyhash);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                setkeyhash(key, new_keyhash);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return new_keyhash;
    }

    public static SubLObject keyhash_random_key(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) " + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_random_key_internal(v_keyhash);
    }

    public static SubLObject declare_keyhash_file() {
        declareFunction(me, "keyhash_print_function_trampoline", "KEYHASH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "keyhash_p", "KEYHASH-P", 1, 0, false);
        new keyhash.$keyhash_p$UnaryFunction();
        declareFunction(me, "khash_nodes", "KHASH-NODES", 1, 0, false);
        declareFunction(me, "khash_test", "KHASH-TEST", 1, 0, false);
        declareFunction(me, "khash_count", "KHASH-COUNT", 1, 0, false);
        declareFunction(me, "khash_hash_stash", "KHASH-HASH-STASH", 1, 0, false);
        declareFunction(me, "_csetf_khash_nodes", "_CSETF-KHASH-NODES", 2, 0, false);
        declareFunction(me, "_csetf_khash_test", "_CSETF-KHASH-TEST", 2, 0, false);
        declareFunction(me, "_csetf_khash_count", "_CSETF-KHASH-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_khash_hash_stash", "_CSETF-KHASH-HASH-STASH", 2, 0, false);
        declareFunction(me, "make_keyhash", "MAKE-KEYHASH", 0, 1, false);
        declareFunction(me, "visit_defstruct_keyhash", "VISIT-DEFSTRUCT-KEYHASH", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_keyhash_method", "VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD", 2, 0, false);
        declareFunction(me, "print_key_hash", "PRINT-KEY-HASH", 3, 0, false);
        declareMacro(me, "is_empty_keyhash_key_p", "IS-EMPTY-KEYHASH-KEY-P");
        declareFunction(me, "set_keyhash_nodes", "SET-KEYHASH-NODES", 2, 0, false);
        declareFunction(me, "keyhash_nodes", "KEYHASH-NODES", 1, 0, false);
        declareFunction(me, "allocate_keyhash_nodes", "ALLOCATE-KEYHASH-NODES", 2, 0, false);
        declareFunction(me, "clear_all_keyhash_nodes", "CLEAR-ALL-KEYHASH-NODES", 1, 0, false);
        declareFunction(me, "keyhash_test_internal", "KEYHASH-TEST-INTERNAL", 1, 0, false);
        declareFunction(me, "keyhash_count_internal", "KEYHASH-COUNT-INTERNAL", 1, 0, false);
        declareFunction(me, "keyhash_capacity_internal", "KEYHASH-CAPACITY-INTERNAL", 1, 0, false);
        declareFunction(me, "keyhash_matching_key_internal", "KEYHASH-MATCHING-KEY-INTERNAL", 2, 0, false);
        declareFunction(me, "keyhash_set_key", "KEYHASH-SET-KEY", 2, 0, false);
        declareFunction(me, "keyhash_remove_key", "KEYHASH-REMOVE-KEY", 2, 0, false);
        declareFunction(me, "new_keyhash_iterator_internal", "NEW-KEYHASH-ITERATOR-INTERNAL", 1, 0, false);
        declareFunction(me, "keyhash_random_key_internal", "KEYHASH-RANDOM-KEY-INTERNAL", 1, 0, false);
        declareFunction(me, "legacy_keyhash_test_function", "LEGACY-KEYHASH-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "clear_legacy_keyhash_data", "CLEAR-LEGACY-KEYHASH-DATA", 1, 0, false);
        declareFunction(me, "legacy_keyhash_format_p", "LEGACY-KEYHASH-FORMAT-P", 1, 0, false);
        declareFunction(me, "new_keyhash_format_p", "NEW-KEYHASH-FORMAT-P", 1, 0, false);
        declareFunction(me, "maybe_swizzle_old_vector_to_hash", "MAYBE-SWIZZLE-OLD-VECTOR-TO-HASH", 1, 0, false);
        declareFunction(me, "new_keyhash", "NEW-KEYHASH", 1, 1, false);
        declareFunction(me, "clrkeyhash", "CLRKEYHASH", 1, 0, false);
        declareFunction(me, "keyhash_test", "KEYHASH-TEST", 1, 0, false);
        declareFunction(me, "keyhash_count", "KEYHASH-COUNT", 1, 0, false);
        declareFunction(me, "keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
        declareFunction(me, "getkeyhash", "GETKEYHASH", 2, 0, false);
        declareFunction(me, "keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
        declareFunction(me, "setkeyhash", "SETKEYHASH", 2, 0, false);
        declareFunction(me, "remkeyhash", "REMKEYHASH", 2, 0, false);
        declareFunction(me, "new_keyhash_iterator", "NEW-KEYHASH-ITERATOR", 1, 0, false);
        declareFunction(me, "keyhash_iterator_next", "KEYHASH-ITERATOR-NEXT", 1, 0, false);
        declareMacro(me, "do_keyhash", "DO-KEYHASH");
        declareMacro(me, "some_keyhash", "SOME-KEYHASH");
        declareFunction(me, "do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
        declareFunction(me, "keyhash_empty_key", "KEYHASH-EMPTY-KEY", 0, 0, false);
        declareFunction(me, "do_keyhash_valid_key_p", "DO-KEYHASH-VALID-KEY-P", 1, 0, false);
        declareFunction(me, "keyhash_valid_key_p", "KEYHASH-VALID-KEY-P", 1, 0, false);
        declareFunction(me, "mapkeyhash", "MAPKEYHASH", 2, 0, false);
        declareFunction(me, "cfasl_output_object_keyhash_method", "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_keyhash", "CFASL-OUTPUT-KEYHASH", 2, 0, false);
        declareFunction(me, "cfasl_input_keyhash", "CFASL-INPUT-KEYHASH", 1, 0, false);
        declareFunction(me, "copy_keyhash", "COPY-KEYHASH", 1, 0, false);
        declareFunction(me, "keyhash_random_key", "KEYHASH-RANDOM-KEY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_keyhash_file() {
        defconstant("*DTP-KEYHASH*", KEYHASH);
        deflexical("*KEYHASH-EMPTY-KEY*", SubLTrampolineFile.maybeDefault($keyhash_empty_key$, $keyhash_empty_key$, () -> make_symbol($$$The_Empty_KEYHASH_Key)));
        defconstant("*CFASL-OPCODE-KEYHASH*", $int$68);
        return NIL;
    }

    public static SubLObject setup_keyhash_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(KEYHASH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(KHASH_NODES, _CSETF_KHASH_NODES);
        def_csetf(KHASH_TEST, _CSETF_KHASH_TEST);
        def_csetf(KHASH_COUNT, _CSETF_KHASH_COUNT);
        def_csetf(KHASH_HASH_STASH, _CSETF_KHASH_HASH_STASH);
        identity(KEYHASH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD));
        declare_defglobal($keyhash_empty_key$);
        register_macro_helper(DO_KEYHASH_NODES, $list48);
        register_macro_helper(KEYHASH_EMPTY_KEY, $list50);
        register_macro_helper(DO_KEYHASH_VALID_KEY_P, $list50);
        register_cfasl_input_function($cfasl_opcode_keyhash$.getGlobalValue(), CFASL_INPUT_KEYHASH);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_KEYHASH_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_keyhash_file();
    }

    @Override
    public void initializeVariables() {
        init_keyhash_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_keyhash_file();
    }

    static {




























































    }

    public static final class $keyhash_native extends SubLStructNative {
        public SubLObject $nodes;

        public SubLObject $test;

        public SubLObject $count;

        public SubLObject $hash_stash;

        private static final SubLStructDeclNative structDecl;

        private $keyhash_native() {
            this.$nodes = Lisp.NIL;
            this.$test = Lisp.NIL;
            this.$count = Lisp.NIL;
            this.$hash_stash = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$nodes;
        }

        @Override
        public SubLObject getField3() {
            return this.$test;
        }

        @Override
        public SubLObject getField4() {
            return this.$count;
        }

        @Override
        public SubLObject getField5() {
            return this.$hash_stash;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$nodes = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$count = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$hash_stash = value;
        }

        static {
            structDecl = makeStructDeclNative($keyhash_native.class, KEYHASH, KEYHASH_P, $list3, $list4, new String[]{ "$nodes", "$test", "$count", "$hash_stash" }, $list5, $list6, PRINT_KEY_HASH);
        }
    }

    public static final class $keyhash_p$UnaryFunction extends UnaryFunction {
        public $keyhash_p$UnaryFunction() {
            super(extractFunctionNamed("KEYHASH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return keyhash_p(arg1);
        }
    }
}

/**
 * Total time: 210 ms
 */
