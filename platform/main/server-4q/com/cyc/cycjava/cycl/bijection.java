package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class bijection extends SubLTranslatedFile {
    public static final SubLFile me = new bijection();

    public static final String myName = "com.cyc.cycjava.cycl.bijection";

    public static final String myFingerPrint = "632cbf9f999b989008992d9b5d114ddb86ffde9ebe74a664e4abfd7417f92e57";

    // deflexical
    private static final SubLSymbol $bijection_high_water_mark$ = makeSymbol("*BIJECTION-HIGH-WATER-MARK*");

    // deflexical
    private static final SubLSymbol $bijection_low_water_mark$ = makeSymbol("*BIJECTION-LOW-WATER-MARK*");

    // defconstant
    public static final SubLSymbol $dtp_bijection$ = makeSymbol("*DTP-BIJECTION*");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLSymbol BIJECTION = makeSymbol("BIJECTION");

    public static final SubLSymbol BIJECTION_P = makeSymbol("BIJECTION-P");

    public static final SubLList $list4 = list(makeSymbol("SIZE"), makeSymbol("DATABASE"), makeSymbol("INVERSE-DATABASE"), makeSymbol("TEST"));

    public static final SubLList $list5 = list(makeKeyword("SIZE"), makeKeyword("DATABASE"), makeKeyword("INVERSE-DATABASE"), makeKeyword("TEST"));

    public static final SubLList $list6 = list(makeSymbol("BIJECTION-SIZE"), makeSymbol("BIJECTION-DATABASE"), makeSymbol("BIJECTION-INVERSE-DATABASE"), makeSymbol("BIJECTION-TEST"));

    public static final SubLList $list7 = list(makeSymbol("_CSETF-BIJECTION-SIZE"), makeSymbol("_CSETF-BIJECTION-DATABASE"), makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE"), makeSymbol("_CSETF-BIJECTION-TEST"));



    public static final SubLSymbol BIJECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BIJECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("BIJECTION-P"));

    private static final SubLSymbol BIJECTION_SIZE = makeSymbol("BIJECTION-SIZE");

    private static final SubLSymbol _CSETF_BIJECTION_SIZE = makeSymbol("_CSETF-BIJECTION-SIZE");

    private static final SubLSymbol BIJECTION_DATABASE = makeSymbol("BIJECTION-DATABASE");

    private static final SubLSymbol _CSETF_BIJECTION_DATABASE = makeSymbol("_CSETF-BIJECTION-DATABASE");

    private static final SubLSymbol BIJECTION_INVERSE_DATABASE = makeSymbol("BIJECTION-INVERSE-DATABASE");

    private static final SubLSymbol _CSETF_BIJECTION_INVERSE_DATABASE = makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE");

    private static final SubLSymbol BIJECTION_TEST = makeSymbol("BIJECTION-TEST");

    private static final SubLSymbol _CSETF_BIJECTION_TEST = makeSymbol("_CSETF-BIJECTION-TEST");









    private static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_BIJECTION = makeSymbol("MAKE-BIJECTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD");







    private static final SubLString $str32$Corrupted_bijection__unsupported_ = makeString("Corrupted bijection; unsupported style ~S.~%");

    private static final SubLString $str33$Malformed_bijection_ = makeString("Malformed ");





    private static final SubLList $list36 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("BIJECTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list37 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym40$BIJECTION_VAR = makeUninternedSymbol("BIJECTION-VAR");





    private static final SubLSymbol DO_BIJECTION_STYLE = makeSymbol("DO-BIJECTION-STYLE");



    private static final SubLSymbol DO_BIJECTION_DATABASE = makeSymbol("DO-BIJECTION-DATABASE");





    private static final SubLSymbol BIJECTION_STYLE_ERROR = makeSymbol("BIJECTION-STYLE-ERROR");

    private static final SubLList $list49 = list(list(makeSymbol("VALUE"), makeSymbol("KEY"), makeSymbol("BIJECTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym50$BIJECTION_VAR = makeUninternedSymbol("BIJECTION-VAR");

    private static final SubLSymbol DO_BIJECTION_INVERSE_DATABASE = makeSymbol("DO-BIJECTION-INVERSE-DATABASE");

    private static final SubLSymbol DO_BIJECTION = makeSymbol("DO-BIJECTION");

    private static final SubLList $list53 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $str54$_S______S__ = makeString("~S <-> ~S~%");

    public static SubLObject bijection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject bijection_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$bijection_native.class ? T : NIL;
    }

    public static SubLObject bijection_size(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject bijection_database(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject bijection_inverse_database(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject bijection_test(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_bijection_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_bijection_database(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_bijection_inverse_database(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_bijection_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "bijection.bijection_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_bijection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $bijection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SIZE)) {
                _csetf_bijection_size(v_new, current_value);
            } else
                if (pcase_var.eql($DATABASE)) {
                    _csetf_bijection_database(v_new, current_value);
                } else
                    if (pcase_var.eql($INVERSE_DATABASE)) {
                        _csetf_bijection_inverse_database(v_new, current_value);
                    } else
                        if (pcase_var.eql($TEST)) {
                            _csetf_bijection_test(v_new, current_value);
                        } else {
                            Errors.error($str23$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_bijection(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_BIJECTION, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SIZE, bijection_size(obj));
        funcall(visitor_fn, obj, $SLOT, $DATABASE, bijection_database(obj));
        funcall(visitor_fn, obj, $SLOT, $INVERSE_DATABASE, bijection_inverse_database(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, bijection_test(obj));
        funcall(visitor_fn, obj, $END, MAKE_BIJECTION, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_bijection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_bijection(obj, visitor_fn);
    }

    public static SubLObject bijection_style(final SubLObject v_bijection) {
        final SubLObject database = bijection_database(v_bijection);
        if (database.isList()) {
            return $ALIST;
        }
        if (database.isHashtable()) {
            return $HASHTABLE;
        }
        return $UNKNOWN;
    }

    public static SubLObject bijection_style_error(final SubLObject v_bijection) {
        return Errors.error($str32$Corrupted_bijection__unsupported_, bijection_style(v_bijection));
    }

    public static SubLObject bijection_lookup_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject pair = assoc(key, alist, test, UNPROVIDED);
        return NIL != pair ? values(pair.rest(), T) : values(not_found, NIL);
    }

    public static SubLObject bijection_enter_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject key_pair = assoc(key, alist, test, UNPROVIDED);
        final SubLObject value_pair = rassoc(value, alist, test, UNPROVIDED);
        if ((NIL != key_pair) && (NIL != value_pair)) {
            if ((NIL == funcall(test, key, value_pair.first())) || (NIL == funcall(test, key_pair.rest(), value))) {
                rplacd(key_pair, value);
                _csetf_bijection_database(v_bijection, list_utilities.delete_first(value_pair, alist, UNPROVIDED));
            }
        } else
            if (NIL != key_pair) {
                rplacd(key_pair, value);
            } else
                if (NIL != value_pair) {
                    rplaca(value_pair, key);
                } else {
                    _csetf_bijection_database(v_bijection, acons(key, value, alist));
                    _csetf_bijection_size(v_bijection, add(bijection_size(v_bijection), ONE_INTEGER));
                    if (bijection_size(v_bijection).numG($bijection_high_water_mark$.getGlobalValue())) {
                        make_hashtable_bijection_from_alist(v_bijection);
                    }
                }


        return values(key, value);
    }

    public static SubLObject bijection_remove_alist_style(final SubLObject v_bijection, final SubLObject key) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject key_pair = assoc(key, alist, test, UNPROVIDED);
        SubLObject value = NIL;
        if (NIL != key_pair) {
            _csetf_bijection_database(v_bijection, list_utilities.delete_first(key_pair, alist, UNPROVIDED));
            value = key_pair.rest();
            _csetf_bijection_size(v_bijection, subtract(bijection_size(v_bijection), ONE_INTEGER));
        }
        return values(key, value);
    }

    public static SubLObject bijection_inverse_lookup_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject pair = rassoc(value, alist, test, UNPROVIDED);
        return NIL != pair ? values(pair.first(), T) : values(not_found, NIL);
    }

    public static SubLObject bijection_inverse_enter_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        return bijection_enter_alist_style(v_bijection, key, value);
    }

    public static SubLObject bijection_inverse_remove_alist_style(final SubLObject v_bijection, final SubLObject value) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject value_pair = rassoc(value, alist, test, UNPROVIDED);
        SubLObject key = NIL;
        if (NIL != value_pair) {
            _csetf_bijection_database(v_bijection, list_utilities.delete_first(value_pair, alist, UNPROVIDED));
            key = value_pair.first();
            _csetf_bijection_size(v_bijection, subtract(bijection_size(v_bijection), ONE_INTEGER));
        }
        return values(key, value);
    }

    public static SubLObject make_hashtable_bijection_from_alist(final SubLObject v_bijection) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject old_database = bijection_database(v_bijection);
        final SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
        final SubLObject new_inverse = list_utilities.alist_to_reverse_hash_table(old_database, test);
        _csetf_bijection_database(v_bijection, new_database);
        _csetf_bijection_inverse_database(v_bijection, new_inverse);
        return v_bijection;
    }

    public static SubLObject bijection_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found) {
        return gethash(key, bijection_database(v_bijection), not_found);
    }

    public static SubLObject bijection_enter_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        sethash(key, table, value);
        sethash(value, inverse, key);
        _csetf_bijection_size(v_bijection, hash_table_count(table));
        return values(key, value);
    }

    public static SubLObject bijection_remove_hashtable_style(final SubLObject v_bijection, final SubLObject key) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject value = gethash(key, table, UNPROVIDED);
        return NIL != value ? bijection_remove_hashtable_style_int(v_bijection, key, value) : values(key, value);
    }

    public static SubLObject bijection_inverse_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found) {
        return gethash(value, bijection_inverse_database(v_bijection), not_found);
    }

    public static SubLObject bijection_inverse_enter_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        return bijection_enter_hashtable_style(v_bijection, key, value);
    }

    public static SubLObject bijection_inverse_remove_hashtable_style(final SubLObject v_bijection, final SubLObject value) {
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        final SubLObject key = gethash(value, inverse, UNPROVIDED);
        return NIL != key ? bijection_remove_hashtable_style_int(v_bijection, key, value) : values(key, value);
    }

    public static SubLObject bijection_remove_hashtable_style_int(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        final SubLObject table_removedP = remhash(key, table);
        final SubLObject inverse_removedP = remhash(value, inverse);
        if ((NIL != table_removedP) && (NIL != inverse_removedP)) {
            _csetf_bijection_size(v_bijection, hash_table_count(table));
            if (bijection_size(v_bijection).numL($bijection_low_water_mark$.getGlobalValue())) {
                make_alist_bijection_from_hashtable(v_bijection);
            }
        } else
            if ((NIL != table_removedP) || (NIL != inverse_removedP)) {
                Errors.error($str33$Malformed_bijection_);
            }

        return values(key, value);
    }

    public static SubLObject make_alist_bijection_from_hashtable(final SubLObject v_bijection) {
        final SubLObject old_database = bijection_database(v_bijection);
        final SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
        _csetf_bijection_database(v_bijection, new_database);
        _csetf_bijection_inverse_database(v_bijection, NIL);
        return v_bijection;
    }

    public static SubLObject new_bijection(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        assert NIL != integerp(size) : "Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) " + size;
        if (test.isSymbol()) {
            test = symbol_function(test);
        }
        final SubLObject v_bijection = make_bijection(UNPROVIDED);
        clear_bijection(v_bijection);
        _csetf_bijection_test(v_bijection, test);
        if (size.numG($bijection_high_water_mark$.getGlobalValue())) {
            _csetf_bijection_database(v_bijection, make_hash_table(size, test, UNPROVIDED));
            _csetf_bijection_inverse_database(v_bijection, make_hash_table(size, test, UNPROVIDED));
        }
        return v_bijection;
    }

    public static SubLObject clear_bijection(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        _csetf_bijection_size(v_bijection, ZERO_INTEGER);
        _csetf_bijection_database(v_bijection, NIL);
        _csetf_bijection_inverse_database(v_bijection, NIL);
        return v_bijection;
    }

    public static SubLObject bijection_empty_p(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        return zerop(bijection_size(v_bijection));
    }

    public static SubLObject non_empty_bijection_p(final SubLObject v_object) {
        return makeBoolean((NIL != bijection_p(v_object)) && (NIL == bijection_empty_p(v_object)));
    }

    public static SubLObject bijection_lookup(final SubLObject v_bijection, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_lookup_alist_style(v_bijection, key, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_lookup_hashtable_style(v_bijection, key, not_found);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_inverse_lookup(final SubLObject v_bijection, final SubLObject value, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_inverse_lookup_alist_style(v_bijection, value, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_inverse_lookup_hashtable_style(v_bijection, value, not_found);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_enter(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_enter_alist_style(v_bijection, key, value);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_enter_hashtable_style(v_bijection, key, value);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_inverse_enter(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_inverse_enter_alist_style(v_bijection, value, key);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_inverse_enter_hashtable_style(v_bijection, value, key);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_remove(final SubLObject v_bijection, final SubLObject key) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_remove_alist_style(v_bijection, key);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_remove_hashtable_style(v_bijection, key);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_inverse_remove(final SubLObject v_bijection, final SubLObject value) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_inverse_remove_alist_style(v_bijection, value);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_inverse_remove_hashtable_style(v_bijection, value);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject new_bijection_iterator(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject database = bijection_database(v_bijection);
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return iteration.new_alist_iterator(database);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return iteration.new_hash_table_iterator(database);
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject do_bijection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject v_bijection = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        v_bijection = current.first();
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
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject bijection_var = $sym40$BIJECTION_VAR;
        return list(CLET, list(list(bijection_var, v_bijection)), list(PCASE, list(DO_BIJECTION_STYLE, bijection_var), list($ALIST, listS(DO_ALIST, list(key, value, list(DO_BIJECTION_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list($HASHTABLE, listS(DO_HASH_TABLE, list(key, value, list(DO_BIJECTION_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list(OTHERWISE, list(BIJECTION_STYLE_ERROR, bijection_var))));
    }

    public static SubLObject do_bijection_inverse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        SubLObject key = NIL;
        SubLObject v_bijection = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        v_bijection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list49);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list49);
            if (NIL == member(current_$2, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list49);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject bijection_var = $sym50$BIJECTION_VAR;
        return list(CLET, list(list(bijection_var, v_bijection)), list(PCASE, list(DO_BIJECTION_STYLE, bijection_var), list($ALIST, listS(DO_ALIST, list(key, value, list(DO_BIJECTION_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list($HASHTABLE, listS(DO_HASH_TABLE, list(value, key, list(DO_BIJECTION_INVERSE_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list(OTHERWISE, list(BIJECTION_STYLE_ERROR, bijection_var))));
    }

    public static SubLObject do_bijection_style(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        return bijection_style(v_bijection);
    }

    public static SubLObject do_bijection_database(final SubLObject v_bijection) {
        return bijection_database(v_bijection);
    }

    public static SubLObject do_bijection_inverse_database(final SubLObject v_bijection) {
        return bijection_inverse_database(v_bijection);
    }

    public static SubLObject bijection_keys(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return list_utilities.alist_keys(bijection_database(v_bijection));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(bijection_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_values(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return list_utilities.alist_values(bijection_database(v_bijection));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(bijection_inverse_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_to_alist(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return values(copy_tree(bijection_database(v_bijection)), bijection_test(v_bijection));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_to_alist(bijection_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject bijection_to_hashtable(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) " + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            final SubLObject alist = bijection_database(v_bijection);
            final SubLObject test = bijection_test(v_bijection);
            return values(list_utilities.alist_to_hash_table(alist, test), list_utilities.alist_to_reverse_hash_table(alist, test));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return values(bijection_database(v_bijection), bijection_inverse_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    public static SubLObject print_bijection_contents(final SubLObject v_bijection, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject pcase_var = do_bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            SubLObject cdolist_list_var = do_bijection_database(v_bijection);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list53);
                key = current.first();
                current = value = current.rest();
                format(stream, $str54$_S______S__, key, value);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } else
            if (pcase_var.eql($HASHTABLE)) {
                final SubLObject cdohash_table = do_bijection_database(v_bijection);
                SubLObject key2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        format(stream, $str54$_S______S__, key2, value2);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } else {
                bijection_style_error(v_bijection);
            }

        return NIL;
    }

    public static SubLObject declare_bijection_file() {
        declareFunction(me, "bijection_print_function_trampoline", "BIJECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "bijection_p", "BIJECTION-P", 1, 0, false);
        new bijection.$bijection_p$UnaryFunction();
        declareFunction(me, "bijection_size", "BIJECTION-SIZE", 1, 0, false);
        declareFunction(me, "bijection_database", "BIJECTION-DATABASE", 1, 0, false);
        declareFunction(me, "bijection_inverse_database", "BIJECTION-INVERSE-DATABASE", 1, 0, false);
        declareFunction(me, "bijection_test", "BIJECTION-TEST", 1, 0, false);
        declareFunction(me, "_csetf_bijection_size", "_CSETF-BIJECTION-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_bijection_database", "_CSETF-BIJECTION-DATABASE", 2, 0, false);
        declareFunction(me, "_csetf_bijection_inverse_database", "_CSETF-BIJECTION-INVERSE-DATABASE", 2, 0, false);
        declareFunction(me, "_csetf_bijection_test", "_CSETF-BIJECTION-TEST", 2, 0, false);
        declareFunction(me, "make_bijection", "MAKE-BIJECTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_bijection", "VISIT-DEFSTRUCT-BIJECTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_bijection_method", "VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD", 2, 0, false);
        declareFunction(me, "bijection_style", "BIJECTION-STYLE", 1, 0, false);
        declareFunction(me, "bijection_style_error", "BIJECTION-STYLE-ERROR", 1, 0, false);
        declareFunction(me, "bijection_lookup_alist_style", "BIJECTION-LOOKUP-ALIST-STYLE", 3, 0, false);
        declareFunction(me, "bijection_enter_alist_style", "BIJECTION-ENTER-ALIST-STYLE", 3, 0, false);
        declareFunction(me, "bijection_remove_alist_style", "BIJECTION-REMOVE-ALIST-STYLE", 2, 0, false);
        declareFunction(me, "bijection_inverse_lookup_alist_style", "BIJECTION-INVERSE-LOOKUP-ALIST-STYLE", 3, 0, false);
        declareFunction(me, "bijection_inverse_enter_alist_style", "BIJECTION-INVERSE-ENTER-ALIST-STYLE", 3, 0, false);
        declareFunction(me, "bijection_inverse_remove_alist_style", "BIJECTION-INVERSE-REMOVE-ALIST-STYLE", 2, 0, false);
        declareFunction(me, "make_hashtable_bijection_from_alist", "MAKE-HASHTABLE-BIJECTION-FROM-ALIST", 1, 0, false);
        declareFunction(me, "bijection_lookup_hashtable_style", "BIJECTION-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        declareFunction(me, "bijection_enter_hashtable_style", "BIJECTION-ENTER-HASHTABLE-STYLE", 3, 0, false);
        declareFunction(me, "bijection_remove_hashtable_style", "BIJECTION-REMOVE-HASHTABLE-STYLE", 2, 0, false);
        declareFunction(me, "bijection_inverse_lookup_hashtable_style", "BIJECTION-INVERSE-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        declareFunction(me, "bijection_inverse_enter_hashtable_style", "BIJECTION-INVERSE-ENTER-HASHTABLE-STYLE", 3, 0, false);
        declareFunction(me, "bijection_inverse_remove_hashtable_style", "BIJECTION-INVERSE-REMOVE-HASHTABLE-STYLE", 2, 0, false);
        declareFunction(me, "bijection_remove_hashtable_style_int", "BIJECTION-REMOVE-HASHTABLE-STYLE-INT", 3, 0, false);
        declareFunction(me, "make_alist_bijection_from_hashtable", "MAKE-ALIST-BIJECTION-FROM-HASHTABLE", 1, 0, false);
        declareFunction(me, "new_bijection", "NEW-BIJECTION", 0, 2, false);
        declareFunction(me, "clear_bijection", "CLEAR-BIJECTION", 1, 0, false);
        declareFunction(me, "bijection_empty_p", "BIJECTION-EMPTY-P", 1, 0, false);
        declareFunction(me, "non_empty_bijection_p", "NON-EMPTY-BIJECTION-P", 1, 0, false);
        declareFunction(me, "bijection_lookup", "BIJECTION-LOOKUP", 2, 1, false);
        declareFunction(me, "bijection_inverse_lookup", "BIJECTION-INVERSE-LOOKUP", 2, 1, false);
        declareFunction(me, "bijection_enter", "BIJECTION-ENTER", 3, 0, false);
        declareFunction(me, "bijection_inverse_enter", "BIJECTION-INVERSE-ENTER", 3, 0, false);
        declareFunction(me, "bijection_remove", "BIJECTION-REMOVE", 2, 0, false);
        declareFunction(me, "bijection_inverse_remove", "BIJECTION-INVERSE-REMOVE", 2, 0, false);
        declareFunction(me, "new_bijection_iterator", "NEW-BIJECTION-ITERATOR", 1, 0, false);
        declareMacro(me, "do_bijection", "DO-BIJECTION");
        declareMacro(me, "do_bijection_inverse", "DO-BIJECTION-INVERSE");
        declareFunction(me, "do_bijection_style", "DO-BIJECTION-STYLE", 1, 0, false);
        declareFunction(me, "do_bijection_database", "DO-BIJECTION-DATABASE", 1, 0, false);
        declareFunction(me, "do_bijection_inverse_database", "DO-BIJECTION-INVERSE-DATABASE", 1, 0, false);
        declareFunction(me, "bijection_keys", "BIJECTION-KEYS", 1, 0, false);
        declareFunction(me, "bijection_values", "BIJECTION-VALUES", 1, 0, false);
        declareFunction(me, "bijection_to_alist", "BIJECTION-TO-ALIST", 1, 0, false);
        declareFunction(me, "bijection_to_hashtable", "BIJECTION-TO-HASHTABLE", 1, 0, false);
        declareFunction(me, "print_bijection_contents", "PRINT-BIJECTION-CONTENTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_bijection_file() {
        deflexical("*BIJECTION-HIGH-WATER-MARK*", $int$40);
        deflexical("*BIJECTION-LOW-WATER-MARK*", $int$30);
        defconstant("*DTP-BIJECTION*", BIJECTION);
        return NIL;
    }

    public static SubLObject setup_bijection_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_bijection$.getGlobalValue(), symbol_function(BIJECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list10);
        def_csetf(BIJECTION_SIZE, _CSETF_BIJECTION_SIZE);
        def_csetf(BIJECTION_DATABASE, _CSETF_BIJECTION_DATABASE);
        def_csetf(BIJECTION_INVERSE_DATABASE, _CSETF_BIJECTION_INVERSE_DATABASE);
        def_csetf(BIJECTION_TEST, _CSETF_BIJECTION_TEST);
        identity(BIJECTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_bijection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD));
        register_macro_helper(DO_BIJECTION_STYLE, DO_BIJECTION);
        register_macro_helper(DO_BIJECTION_DATABASE, DO_BIJECTION);
        register_macro_helper(DO_BIJECTION_INVERSE_DATABASE, DO_BIJECTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_bijection_file();
    }

    @Override
    public void initializeVariables() {
        init_bijection_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_bijection_file();
    }

    

    public static final class $bijection_native extends SubLStructNative {
        public SubLObject $size;

        public SubLObject $database;

        public SubLObject $inverse_database;

        public SubLObject $test;

        private static final SubLStructDeclNative structDecl;

        private $bijection_native() {
            this.$size = Lisp.NIL;
            this.$database = Lisp.NIL;
            this.$inverse_database = Lisp.NIL;
            this.$test = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$size;
        }

        @Override
        public SubLObject getField3() {
            return this.$database;
        }

        @Override
        public SubLObject getField4() {
            return this.$inverse_database;
        }

        @Override
        public SubLObject getField5() {
            return this.$test;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$database = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$inverse_database = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$test = value;
        }

        static {
            structDecl = makeStructDeclNative($bijection_native.class, BIJECTION, BIJECTION_P, $list4, $list5, new String[]{ "$size", "$database", "$inverse_database", "$test" }, $list6, $list7, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $bijection_p$UnaryFunction extends UnaryFunction {
        public $bijection_p$UnaryFunction() {
            super(extractFunctionNamed("BIJECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return bijection_p(arg1);
        }
    }
}

/**
 * Total time: 224 ms
 */
