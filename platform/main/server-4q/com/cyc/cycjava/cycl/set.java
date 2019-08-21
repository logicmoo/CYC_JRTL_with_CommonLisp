package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.set;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.set.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.set.*; 
 public final class set extends SubLTranslatedFile {
    public static final SubLFile me = new set();

    public static final String myName = "com.cyc.cycjava.cycl.set";

    public static final String myFingerPrint = "cbe78d49a2eb4940be13953015bee7b37959e27d4f18fbe94d677ee48bafebdf";

    // defconstant
    public static final SubLSymbol $dtp_set$ = makeSymbol("*DTP-SET*");

    // deflexical
    public static final SubLSymbol $new_set_default_test_function$ = makeSymbol("*NEW-SET-DEFAULT-TEST-FUNCTION*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_set$ = makeSymbol("*CFASL-OPCODE-SET*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_legacy_set$ = makeSymbol("*CFASL-OPCODE-LEGACY-SET*");





    private static final SubLInteger $int$136 = makeInteger(136);

    public static final SubLList $list3 = list(makeSymbol("CONTENTS"), makeSymbol("TEST"));

    public static final SubLList $list4 = list(makeKeyword("CONTENTS"), makeKeyword("TEST"));

    public static final SubLList $list5 = list(makeSymbol("SET-STRUCT-CONTENTS"), makeSymbol("SET-STRUCT-TEST"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-SET-STRUCT-CONTENTS"), makeSymbol("_CSETF-SET-STRUCT-TEST"));

    public static final SubLSymbol PRINT_SET = makeSymbol("PRINT-SET");

    public static final SubLSymbol SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SET-P"));

    private static final SubLSymbol SET_STRUCT_CONTENTS = makeSymbol("SET-STRUCT-CONTENTS");

    private static final SubLSymbol _CSETF_SET_STRUCT_CONTENTS = makeSymbol("_CSETF-SET-STRUCT-CONTENTS");

    private static final SubLSymbol SET_STRUCT_TEST = makeSymbol("SET-STRUCT-TEST");

    private static final SubLSymbol _CSETF_SET_STRUCT_TEST = makeSymbol("_CSETF-SET-STRUCT-TEST");





    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SET = makeSymbol("MAKE-SET");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SET-METHOD");

    private static final SubLString $str22$_ = makeString("(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str24$_ = makeString(")");

    private static final SubLString $str25$_size_ = makeString(" size=");

    private static final SubLString $str26$_elements___S = makeString(" elements: ~S");











    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLList $list33 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list34 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $sym38$SET_VAR = makeUninternedSymbol("SET-VAR");





    private static final SubLSymbol $sym41$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym42$SOFAR_VAR = makeUninternedSymbol("SOFAR-VAR");

    private static final SubLSymbol $sym43$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLList $list44 = list(ZERO_INTEGER);

    private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");









    private static final SubLSymbol DO_SET_INTERNAL = makeSymbol("DO-SET-INTERNAL");

    private static final SubLList $list51 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list(makeKeyword("DONE"));

    private static final SubLSymbol $sym53$SOS = makeUninternedSymbol("SOS");



    private static final SubLList $list55 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET-OR-LIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym56$SOL = makeUninternedSymbol("SOL");









    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol CFASL_INPUT_SET = makeSymbol("CFASL-INPUT-SET");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SET_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SET-METHOD");

    private static final SubLInteger $int$67 = makeInteger(67);

    private static final SubLSymbol CFASL_INPUT_LEGACY_SET = makeSymbol("CFASL-INPUT-LEGACY-SET");

    private static final SubLString $$$Set_Module_Supercategory = makeString("Set Module Supercategory");

    private static final SubLString $str67$Set_Module_Change_Operation_Subca = makeString("Set Module Change Operation Subcategory");

    private static final SubLString $str68$Set_Module_Information_Subcategor = makeString("Set Module Information Subcategory");

    private static final SubLString $$$Set_Module_Iterator_Subcategory = makeString("Set Module Iterator Subcategory");

    private static final SubLString $$$Set_Module_Mapping_Subcategory = makeString("Set Module Mapping Subcategory");

    private static final SubLString $str71$Set_Module_Kitchen_Sink_Subcatego = makeString("Set Module Kitchen Sink Subcategory");

    private static final SubLString $$$Set_Module_Testing_Suite = makeString("Set Module Testing Suite");

    public static SubLObject set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_set(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject set_p(final SubLObject v_object) {
        return v_object.getClass() == $set_native.class ? T : NIL;
    }

    public static SubLObject set_struct_contents(final SubLObject v_object) {
        assert NIL != set_p(v_object) : "set.set_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject set_struct_test(final SubLObject v_object) {
        assert NIL != set_p(v_object) : "set.set_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_set_struct_contents(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_p(v_object) : "set.set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_set_struct_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_p(v_object) : "set.set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONTENTS)) {
                _csetf_set_struct_contents(v_new, current_value);
            } else
                if (pcase_var.eql($TEST)) {
                    _csetf_set_struct_test(v_new, current_value);
                } else {
                    Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SET, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONTENTS, set_struct_contents(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, set_struct_test(obj));
        funcall(visitor_fn, obj, $END, MAKE_SET, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_set(obj, visitor_fn);
    }

    public static SubLObject print_set(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str22$_, stream, UNPROVIDED, UNPROVIDED);
            princ(hash_table_utilities.hash_test_to_symbol(set_struct_test(v_object)), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_string(symbol_name(set_style(v_object)), stream, UNPROVIDED, UNPROVIDED);
            write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
            write_string($str25$_size_, stream, UNPROVIDED, UNPROVIDED);
            princ(set_size(v_object), stream);
            if (set_size(v_object).numL(TWENTY_INTEGER)) {
                format(stream, $str26$_elements___S, set_element_list(v_object));
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject set_style(final SubLObject v_set) {
        final SubLObject contents = set_struct_contents(v_set);
        if (contents.isList()) {
            return $LIST;
        }
        if (NIL != keyhash.keyhash_p(contents)) {
            return $KEYHASH;
        }
        return $SINGLETON;
    }

    public static SubLObject new_set(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = $new_set_default_test_function$.getGlobalValue();
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        assert NIL != integerp(size) : "Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) " + size;
        if (test.isSymbol()) {
            test = symbol_function(test);
        }
        final SubLObject v_set = make_set(UNPROVIDED);
        _csetf_set_struct_test(v_set, test);
        _csetf_set_struct_contents(v_set, set_contents.new_set_contents(size, test));
        return v_set;
    }

    public static SubLObject copy_set(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        final SubLObject new_set = new_set(set_test(v_set), ZERO_INTEGER);
        _csetf_set_struct_contents(new_set, set_contents.copy_set_contents(set_struct_contents(v_set)));
        return new_set;
    }

    public static SubLObject set_test(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_struct_test(v_set);
    }

    public static SubLObject set_size(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.set_contents_size(set_struct_contents(v_set));
    }

    public static SubLObject set_emptyP(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.set_contents_emptyP(set_struct_contents(v_set));
    }

    public static SubLObject set_or_list_emptyP(final SubLObject set_or_list) {
        if (NIL != set_p(set_or_list)) {
            return set_contents.set_contents_emptyP(set_struct_contents(set_or_list));
        }
        if (set_or_list.isList()) {
            return sublisp_null(set_or_list);
        }
        Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_);
        return NIL;
    }

    public static SubLObject empty_set_p(final SubLObject obj) {
        return makeBoolean((NIL != set_p(obj)) && (NIL != set_emptyP(obj)));
    }

    public static SubLObject non_empty_set_p(final SubLObject obj) {
        return makeBoolean((NIL != set_p(obj)) && (NIL == set_emptyP(obj)));
    }

    public static SubLObject set_memberP(final SubLObject element, final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.set_contents_memberP(element, set_struct_contents(v_set), set_struct_test(v_set));
    }

    public static SubLObject set_member_permissiveP(final SubLObject element, final SubLObject v_set) {
        if (NIL == set_p(v_set)) {
            return NIL;
        }
        return set_member_permissiveP(element, v_set);
    }

    public static SubLObject set_or_list_memberP(final SubLObject element, final SubLObject set_or_list) {
        if (NIL != set_p(set_or_list)) {
            return set_memberP(element, set_or_list);
        }
        if (set_or_list.isList()) {
            return subl_promotions.memberP(element, set_or_list, UNPROVIDED, UNPROVIDED);
        }
        Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_);
        return NIL;
    }

    public static SubLObject set_or_list_to_list(final SubLObject set_or_list) {
        if (NIL != set_p(set_or_list)) {
            return set_element_list(set_or_list);
        }
        if (set_or_list.isList()) {
            return set_or_list;
        }
        Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_);
        return NIL;
    }

    public static SubLObject set_matching_element(final SubLObject element, final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.set_contents_matching_element(element, set_struct_contents(v_set), set_struct_test(v_set));
    }

    public static SubLObject set_random_element(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.set_contents_random_element(set_struct_contents(v_set));
    }

    public static SubLObject set_add(final SubLObject element, final SubLObject v_set) {
        if (NIL == set_memberP(element, v_set)) {
            _csetf_set_struct_contents(v_set, set_contents.set_contents_add(element, set_struct_contents(v_set), set_struct_test(v_set)));
            return T;
        }
        return NIL;
    }

    public static SubLObject set_remove(final SubLObject element, final SubLObject v_set) {
        if (NIL != set_memberP(element, v_set)) {
            _csetf_set_struct_contents(v_set, set_contents.set_contents_delete(element, set_struct_contents(v_set), set_struct_test(v_set)));
            return T;
        }
        return NIL;
    }

    public static SubLObject clear_set(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        _csetf_set_struct_contents(v_set, set_contents.clear_set_contents(set_struct_contents(v_set)));
        return v_set;
    }

    public static SubLObject new_set_iterator(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.new_set_contents_iterator(set_struct_contents(v_set));
    }

    public static SubLObject do_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list33);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list33);
            if (NIL == member(current_$1, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list33);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!v_set.isAtom()) {
            final SubLObject set_var = $sym38$SET_VAR;
            return list(CLET, list(list(set_var, v_set)), listS(DO_SET, list(element_var, set_var, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject message_var = $sym41$MESSAGE_VAR;
            return list(CLET, list(list(message_var, progress_message)), listS(DO_SET, list(element_var, v_set, $PROGRESS_MESSAGE, message_var, $DONE, done), append(body, NIL)));
        }
        if (NIL != progress_message) {
            final SubLObject sofar_var = $sym42$SOFAR_VAR;
            final SubLObject total_var = $sym43$TOTAL_VAR;
            return list(CLET, list(bq_cons(sofar_var, $list44), list(total_var, list(SET_SIZE, v_set))), list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_SET, list(element_var, v_set, $DONE, done), list(CINC, sofar_var), list(NOTE_PERCENT_PROGRESS, sofar_var, total_var), append(body, NIL))));
        }
        return listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, v_set), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_set_permissive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list51);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list51);
            if (NIL == member(current_$2, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list51);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject sos = $sym53$SOS;
        return list(CLET, list(list(sos, v_set)), list(PWHEN, list(SET_P, sos), listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, sos), $DONE, done), append(body, NIL))));
    }

    public static SubLObject do_set_or_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject set_or_list = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        set_or_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$3, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list55);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject sol = $sym56$SOL;
        return list(CLET, list(list(sol, set_or_list)), list(PIF, list(SET_P, sol), listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, sol), $DONE, done), append(body, NIL)), list(PIF, list(LISTP, sol), listS(CSOME, list(element_var, sol, done), append(body, NIL)), list(ERROR, $str32$_A_is_neither_SET_P_nor_LISTP_, sol))));
    }

    public static SubLObject do_set_internal(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_struct_contents(v_set);
    }

    public static SubLObject map_set(final SubLObject function, final SubLObject v_set, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        set_contents.map_set_contents(function, set_struct_contents(v_set), args);
        return NIL;
    }

    public static SubLObject cfasl_output_object_set_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_set(v_object, stream);
    }

    public static SubLObject cfasl_output_set(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_set$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(set_test(v_object));
        final SubLObject size = set_size(v_object);
        cfasl_output(test, stream);
        cfasl_output(size, stream);
        final SubLObject set_contents_var = do_set_internal(v_object);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                cfasl_output(element, stream);
            }
        }
        return v_object;
    }

    public static SubLObject cfasl_input_set(final SubLObject stream) {
        SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject v_set = NIL;
        final SubLObject pcase_var = test;
        if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
            test = symbol_function(test);
        }
        v_set = new_set(test, size);
        _csetf_set_struct_contents(v_set, set_contents.cfasl_input_set_contents(stream, set_struct_contents(v_set), size, test));
        return v_set;
    }

    public static SubLObject cfasl_input_legacy_set(final SubLObject stream) {
        SubLObject v_set = NIL;
        v_set = new_set(UNPROVIDED, UNPROVIDED);
        cfasl_input_object(stream);
        _csetf_set_struct_contents(v_set, cfasl_input_object(stream));
        _csetf_set_struct_test(v_set, symbol_function(cfasl_input_object(stream)));
        return v_set;
    }

    public static SubLObject set_element_list(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        return set_contents.set_contents_element_list(set_struct_contents(v_set));
    }

    public static SubLObject set_rebuild(final SubLObject v_set) {
        assert NIL != set_p(v_set) : "set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) " + v_set;
        _csetf_set_struct_contents(v_set, set_contents.set_contents_rebuild(set_struct_contents(v_set)));
        return v_set;
    }

    public static SubLObject declare_set_file() {
        declareFunction(me, "set_print_function_trampoline", "SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "set_p", "SET-P", 1, 0, false);
        new set.$set_p$UnaryFunction();
        declareFunction(me, "set_struct_contents", "SET-STRUCT-CONTENTS", 1, 0, false);
        declareFunction(me, "set_struct_test", "SET-STRUCT-TEST", 1, 0, false);
        declareFunction(me, "_csetf_set_struct_contents", "_CSETF-SET-STRUCT-CONTENTS", 2, 0, false);
        declareFunction(me, "_csetf_set_struct_test", "_CSETF-SET-STRUCT-TEST", 2, 0, false);
        declareFunction(me, "make_set", "MAKE-SET", 0, 1, false);
        declareFunction(me, "visit_defstruct_set", "VISIT-DEFSTRUCT-SET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_set_method", "VISIT-DEFSTRUCT-OBJECT-SET-METHOD", 2, 0, false);
        declareFunction(me, "print_set", "PRINT-SET", 3, 0, false);
        declareFunction(me, "set_style", "SET-STYLE", 1, 0, false);
        declareFunction(me, "new_set", "NEW-SET", 0, 2, false);
        declareFunction(me, "copy_set", "COPY-SET", 1, 0, false);
        declareFunction(me, "set_test", "SET-TEST", 1, 0, false);
        declareFunction(me, "set_size", "SET-SIZE", 1, 0, false);
        declareFunction(me, "set_emptyP", "SET-EMPTY?", 1, 0, false);
        declareFunction(me, "set_or_list_emptyP", "SET-OR-LIST-EMPTY?", 1, 0, false);
        declareFunction(me, "empty_set_p", "EMPTY-SET-P", 1, 0, false);
        declareFunction(me, "non_empty_set_p", "NON-EMPTY-SET-P", 1, 0, false);
        declareFunction(me, "set_memberP", "SET-MEMBER?", 2, 0, false);
        declareFunction(me, "set_member_permissiveP", "SET-MEMBER-PERMISSIVE?", 2, 0, false);
        declareFunction(me, "set_or_list_memberP", "SET-OR-LIST-MEMBER?", 2, 0, false);
        declareFunction(me, "set_or_list_to_list", "SET-OR-LIST-TO-LIST", 1, 0, false);
        declareFunction(me, "set_matching_element", "SET-MATCHING-ELEMENT", 2, 0, false);
        declareFunction(me, "set_random_element", "SET-RANDOM-ELEMENT", 1, 0, false);
        declareFunction(me, "set_add", "SET-ADD", 2, 0, false);
        declareFunction(me, "set_remove", "SET-REMOVE", 2, 0, false);
        declareFunction(me, "clear_set", "CLEAR-SET", 1, 0, false);
        declareFunction(me, "new_set_iterator", "NEW-SET-ITERATOR", 1, 0, false);
        declareMacro(me, "do_set", "DO-SET");
        declareMacro(me, "do_set_permissive", "DO-SET-PERMISSIVE");
        declareMacro(me, "do_set_or_list", "DO-SET-OR-LIST");
        declareFunction(me, "do_set_internal", "DO-SET-INTERNAL", 1, 0, false);
        declareFunction(me, "map_set", "MAP-SET", 2, 1, false);
        declareFunction(me, "cfasl_output_object_set_method", "CFASL-OUTPUT-OBJECT-SET-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_set", "CFASL-OUTPUT-SET", 2, 0, false);
        declareFunction(me, "cfasl_input_set", "CFASL-INPUT-SET", 1, 0, false);
        new set.$cfasl_input_set$UnaryFunction();
        declareFunction(me, "cfasl_input_legacy_set", "CFASL-INPUT-LEGACY-SET", 1, 0, false);
        declareFunction(me, "set_element_list", "SET-ELEMENT-LIST", 1, 0, false);
        declareFunction(me, "set_rebuild", "SET-REBUILD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_set_file() {
        defconstant("*DTP-SET*", SET);
        deflexical("*NEW-SET-DEFAULT-TEST-FUNCTION*", symbol_function(EQL));
        defconstant("*CFASL-OPCODE-SET*", $int$60);
        defconstant("*CFASL-OPCODE-LEGACY-SET*", $int$67);
        return NIL;
    }

    public static SubLObject setup_set_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(SET_STRUCT_CONTENTS, _CSETF_SET_STRUCT_CONTENTS);
        def_csetf(SET_STRUCT_TEST, _CSETF_SET_STRUCT_TEST);
        identity(SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SET_METHOD));
        register_macro_helper(DO_SET_INTERNAL, DO_SET);
        register_cfasl_input_function($cfasl_opcode_set$.getGlobalValue(), CFASL_INPUT_SET);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SET_METHOD));
        register_cfasl_input_function($cfasl_opcode_legacy_set$.getGlobalValue(), CFASL_INPUT_LEGACY_SET);
        sunit_external.define_test_category($$$Set_Module_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($str67$Set_Module_Change_Operation_Subca, list($$$Set_Module_Supercategory));
        sunit_external.define_test_category($str68$Set_Module_Information_Subcategor, list($$$Set_Module_Supercategory));
        sunit_external.define_test_category($$$Set_Module_Iterator_Subcategory, list($$$Set_Module_Supercategory));
        sunit_external.define_test_category($$$Set_Module_Mapping_Subcategory, list($$$Set_Module_Supercategory));
        sunit_external.define_test_category($str71$Set_Module_Kitchen_Sink_Subcatego, list($$$Set_Module_Supercategory));
        sunit_external.define_test_suite($$$Set_Module_Testing_Suite, list($$$Set_Module_Supercategory), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_set_file();
    }

    @Override
    public void initializeVariables() {
        init_set_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_set_file();
    }

    static {














































































    }

    public static final class $set_native extends SubLStructNative {
        public SubLObject $contents;

        public SubLObject $test;

        private static final SubLStructDeclNative structDecl;

        private $set_native() {
            this.$contents = Lisp.NIL;
            this.$test = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$contents;
        }

        @Override
        public SubLObject getField3() {
            return this.$test;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$contents = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }

        static {
            structDecl = makeStructDeclNative($set_native.class, SET, SET_P, $list3, $list4, new String[]{ "$contents", "$test" }, $list5, $list6, PRINT_SET);
        }
    }

    public static final class $set_p$UnaryFunction extends UnaryFunction {
        public $set_p$UnaryFunction() {
            super(extractFunctionNamed("SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return set_p(arg1);
        }
    }

    public static final class $cfasl_input_set$UnaryFunction extends UnaryFunction {
        public $cfasl_input_set$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-SET"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_set(arg1);
        }
    }
}

/**
 * Total time: 207 ms
 */
