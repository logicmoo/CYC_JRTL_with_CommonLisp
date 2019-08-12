/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      BIJECTION
 * source file: /cyc/top/cycl/bijection.lisp
 * created:     2019/07/03 17:37:14
 */
public final class bijection extends SubLTranslatedFile implements V12 {
    public static final class $bijection_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$size;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$database;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$inverse_database;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$test;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$size = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$database = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$inverse_database = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.bijection.$bijection_native.this.$test = value;
        }

        public SubLObject $size = Lisp.NIL;

        public SubLObject $database = Lisp.NIL;

        public SubLObject $inverse_database = Lisp.NIL;

        public SubLObject $test = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.bijection.$bijection_native.class, BIJECTION, BIJECTION_P, $list_alt4, $list_alt5, new String[]{ "$size", "$database", "$inverse_database", "$test" }, $list_alt6, $list_alt7, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new bijection();

 public static final String myName = "com.cyc.cycjava.cycl.bijection";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bijection_high_water_mark$ = makeSymbol("*BIJECTION-HIGH-WATER-MARK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bijection_low_water_mark$ = makeSymbol("*BIJECTION-LOW-WATER-MARK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_bijection$ = makeSymbol("*DTP-BIJECTION*");





    private static final SubLSymbol BIJECTION = makeSymbol("BIJECTION");

    private static final SubLSymbol BIJECTION_P = makeSymbol("BIJECTION-P");

    static private final SubLList $list4 = list(makeSymbol("SIZE"), makeSymbol("DATABASE"), makeSymbol("INVERSE-DATABASE"), makeSymbol("TEST"));

    static private final SubLList $list5 = list($SIZE, makeKeyword("DATABASE"), makeKeyword("INVERSE-DATABASE"), $TEST);

    static private final SubLList $list6 = list(makeSymbol("BIJECTION-SIZE"), makeSymbol("BIJECTION-DATABASE"), makeSymbol("BIJECTION-INVERSE-DATABASE"), makeSymbol("BIJECTION-TEST"));

    static private final SubLList $list7 = list(makeSymbol("_CSETF-BIJECTION-SIZE"), makeSymbol("_CSETF-BIJECTION-DATABASE"), makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE"), makeSymbol("_CSETF-BIJECTION-TEST"));

    private static final SubLSymbol BIJECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BIJECTION-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list37 = list($DONE);

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

    public static final SubLObject bijection_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject bijection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject bijection_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.bijection.$bijection_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject bijection_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.bijection.$bijection_native.class ? T : NIL;
    }

    public static final SubLObject bijection_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.getField2();
    }

    public static SubLObject bijection_size(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject bijection_database_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.getField3();
    }

    public static SubLObject bijection_database(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject bijection_inverse_database_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.getField4();
    }

    public static SubLObject bijection_inverse_database(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject bijection_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.getField5();
    }

    public static SubLObject bijection_test(final SubLObject v_object) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_bijection_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_bijection_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_bijection_database_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_bijection_database(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_bijection_inverse_database_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_bijection_inverse_database(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_bijection_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BIJECTION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_bijection_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != bijection_p(v_object) : "! bijection.bijection_p(v_object) " + "bijection.bijection_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_bijection_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.bijection.$bijection_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SIZE)) {
                        _csetf_bijection_size(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DATABASE)) {
                            _csetf_bijection_database(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INVERSE_DATABASE)) {
                                _csetf_bijection_inverse_database(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TEST)) {
                                    _csetf_bijection_test(v_new, current_value);
                                } else {
                                    Errors.error($str_alt22$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_bijection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.bijection.$bijection_native();
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

    /**
     * Return the current style of bijection BIJECTION
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of bijection BIJECTION\r\n\r\n@return type-symbol.")
    public static final SubLObject bijection_style_alt(SubLObject v_bijection) {
        {
            SubLObject database = bijection_database(v_bijection);
            if (database.isList()) {
                return $ALIST;
            } else {
                if (database.isHashtable()) {
                    return $HASHTABLE;
                } else {
                    return $UNKNOWN;
                }
            }
        }
    }

    /**
     * Return the current style of bijection BIJECTION
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of bijection BIJECTION\r\n\r\n@return type-symbol.")
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

    public static final SubLObject bijection_style_error_alt(SubLObject v_bijection) {
        return Errors.error($str_alt26$Corrupted_bijection__unsupported_, bijection_style(v_bijection));
    }

    public static SubLObject bijection_style_error(final SubLObject v_bijection) {
        return Errors.error($str32$Corrupted_bijection__unsupported_, bijection_style(v_bijection));
    }

    public static final SubLObject bijection_lookup_alist_style_alt(SubLObject v_bijection, SubLObject key, SubLObject not_found) {
        {
            SubLObject test = bijection_test(v_bijection);
            SubLObject alist = bijection_database(v_bijection);
            SubLObject pair = assoc(key, alist, test, UNPROVIDED);
            return NIL != pair ? ((SubLObject) (values(pair.rest(), T))) : values(not_found, NIL);
        }
    }

    public static SubLObject bijection_lookup_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject pair = assoc(key, alist, test, UNPROVIDED);
        return NIL != pair ? values(pair.rest(), T) : values(not_found, NIL);
    }

    public static final SubLObject bijection_enter_alist_style_alt(SubLObject v_bijection, SubLObject key, SubLObject value) {
        {
            SubLObject test = bijection_test(v_bijection);
            SubLObject alist = bijection_database(v_bijection);
            SubLObject key_pair = assoc(key, alist, test, UNPROVIDED);
            SubLObject value_pair = rassoc(value, alist, test, UNPROVIDED);
            if ((NIL != key_pair) && (NIL != value_pair)) {
                if (!((NIL != funcall(test, key, value_pair.first())) && (NIL != funcall(test, key_pair.rest(), value)))) {
                    rplacd(key_pair, value);
                    _csetf_bijection_database(v_bijection, list_utilities.delete_first(value_pair, alist, UNPROVIDED));
                }
            } else {
                if (NIL != key_pair) {
                    rplacd(key_pair, value);
                } else {
                    if (NIL != value_pair) {
                        rplaca(value_pair, key);
                    } else {
                        _csetf_bijection_database(v_bijection, acons(key, value, alist));
                        _csetf_bijection_size(v_bijection, add(bijection_size(v_bijection), ONE_INTEGER));
                        if (bijection_size(v_bijection).numG($bijection_high_water_mark$.getGlobalValue())) {
                            make_hashtable_bijection_from_alist(v_bijection);
                        }
                    }
                }
            }
        }
        return values(key, value);
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

    public static final SubLObject bijection_remove_alist_style_alt(SubLObject v_bijection, SubLObject key) {
        {
            SubLObject test = bijection_test(v_bijection);
            SubLObject alist = bijection_database(v_bijection);
            SubLObject key_pair = assoc(key, alist, test, UNPROVIDED);
            SubLObject value = NIL;
            if (NIL != key_pair) {
                _csetf_bijection_database(v_bijection, list_utilities.delete_first(key_pair, alist, UNPROVIDED));
                value = key_pair.rest();
                _csetf_bijection_size(v_bijection, subtract(bijection_size(v_bijection), ONE_INTEGER));
            }
            return values(key, value);
        }
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

    public static final SubLObject bijection_inverse_lookup_alist_style_alt(SubLObject v_bijection, SubLObject value, SubLObject not_found) {
        {
            SubLObject test = bijection_test(v_bijection);
            SubLObject alist = bijection_database(v_bijection);
            SubLObject pair = rassoc(value, alist, test, UNPROVIDED);
            return NIL != pair ? ((SubLObject) (values(pair.first(), T))) : values(not_found, NIL);
        }
    }

    public static SubLObject bijection_inverse_lookup_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject pair = rassoc(value, alist, test, UNPROVIDED);
        return NIL != pair ? values(pair.first(), T) : values(not_found, NIL);
    }

    public static final SubLObject bijection_inverse_enter_alist_style_alt(SubLObject v_bijection, SubLObject value, SubLObject key) {
        return bijection_enter_alist_style(v_bijection, key, value);
    }

    public static SubLObject bijection_inverse_enter_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        return bijection_enter_alist_style(v_bijection, key, value);
    }

    public static final SubLObject bijection_inverse_remove_alist_style_alt(SubLObject v_bijection, SubLObject value) {
        {
            SubLObject test = bijection_test(v_bijection);
            SubLObject alist = bijection_database(v_bijection);
            SubLObject value_pair = rassoc(value, alist, test, UNPROVIDED);
            SubLObject key = NIL;
            if (NIL != value_pair) {
                _csetf_bijection_database(v_bijection, list_utilities.delete_first(value_pair, alist, UNPROVIDED));
                key = value_pair.first();
                _csetf_bijection_size(v_bijection, subtract(bijection_size(v_bijection), ONE_INTEGER));
            }
            return values(key, value);
        }
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

    public static final SubLObject make_hashtable_bijection_from_alist_alt(SubLObject v_bijection) {
        {
            SubLObject test = bijection_test(v_bijection);
            SubLObject old_database = bijection_database(v_bijection);
            SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
            SubLObject new_inverse = list_utilities.alist_to_reverse_hash_table(old_database, test);
            _csetf_bijection_database(v_bijection, new_database);
            _csetf_bijection_inverse_database(v_bijection, new_inverse);
        }
        return v_bijection;
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

    public static final SubLObject bijection_lookup_hashtable_style_alt(SubLObject v_bijection, SubLObject key, SubLObject not_found) {
        return gethash(key, bijection_database(v_bijection), not_found);
    }

    public static SubLObject bijection_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found) {
        return gethash(key, bijection_database(v_bijection), not_found);
    }

    public static final SubLObject bijection_enter_hashtable_style_alt(SubLObject v_bijection, SubLObject key, SubLObject value) {
        {
            SubLObject table = bijection_database(v_bijection);
            SubLObject inverse = bijection_inverse_database(v_bijection);
            sethash(key, table, value);
            sethash(value, inverse, key);
            _csetf_bijection_size(v_bijection, hash_table_count(table));
        }
        return values(key, value);
    }

    public static SubLObject bijection_enter_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        sethash(key, table, value);
        sethash(value, inverse, key);
        _csetf_bijection_size(v_bijection, hash_table_count(table));
        return values(key, value);
    }

    public static final SubLObject bijection_remove_hashtable_style_alt(SubLObject v_bijection, SubLObject key) {
        {
            SubLObject table = bijection_database(v_bijection);
            SubLObject value = gethash(key, table, UNPROVIDED);
            return NIL != value ? ((SubLObject) (bijection_remove_hashtable_style_int(v_bijection, key, value))) : values(key, value);
        }
    }

    public static SubLObject bijection_remove_hashtable_style(final SubLObject v_bijection, final SubLObject key) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject value = gethash(key, table, UNPROVIDED);
        return NIL != value ? bijection_remove_hashtable_style_int(v_bijection, key, value) : values(key, value);
    }

    public static final SubLObject bijection_inverse_lookup_hashtable_style_alt(SubLObject v_bijection, SubLObject value, SubLObject not_found) {
        return gethash(value, bijection_inverse_database(v_bijection), not_found);
    }

    public static SubLObject bijection_inverse_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found) {
        return gethash(value, bijection_inverse_database(v_bijection), not_found);
    }

    public static final SubLObject bijection_inverse_enter_hashtable_style_alt(SubLObject v_bijection, SubLObject value, SubLObject key) {
        return bijection_enter_hashtable_style(v_bijection, key, value);
    }

    public static SubLObject bijection_inverse_enter_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        return bijection_enter_hashtable_style(v_bijection, key, value);
    }

    public static final SubLObject bijection_inverse_remove_hashtable_style_alt(SubLObject v_bijection, SubLObject value) {
        {
            SubLObject inverse = bijection_inverse_database(v_bijection);
            SubLObject key = gethash(value, inverse, UNPROVIDED);
            return NIL != key ? ((SubLObject) (bijection_remove_hashtable_style_int(v_bijection, key, value))) : values(key, value);
        }
    }

    public static SubLObject bijection_inverse_remove_hashtable_style(final SubLObject v_bijection, final SubLObject value) {
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        final SubLObject key = gethash(value, inverse, UNPROVIDED);
        return NIL != key ? bijection_remove_hashtable_style_int(v_bijection, key, value) : values(key, value);
    }

    public static final SubLObject bijection_remove_hashtable_style_int_alt(SubLObject v_bijection, SubLObject key, SubLObject value) {
        {
            SubLObject table = bijection_database(v_bijection);
            SubLObject inverse = bijection_inverse_database(v_bijection);
            SubLObject table_removedP = remhash(key, table);
            SubLObject inverse_removedP = remhash(value, inverse);
            if ((NIL != table_removedP) && (NIL != inverse_removedP)) {
                _csetf_bijection_size(v_bijection, hash_table_count(table));
                if (bijection_size(v_bijection).numL($bijection_low_water_mark$.getGlobalValue())) {
                    make_alist_bijection_from_hashtable(v_bijection);
                }
            } else {
                if ((NIL != table_removedP) || (NIL != inverse_removedP)) {
                    Errors.error($str_alt27$Malformed_bijection_);
                }
            }
        }
        return values(key, value);
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

    public static final SubLObject make_alist_bijection_from_hashtable_alt(SubLObject v_bijection) {
        {
            SubLObject old_database = bijection_database(v_bijection);
            SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
            _csetf_bijection_database(v_bijection, new_database);
            _csetf_bijection_inverse_database(v_bijection, NIL);
        }
        return v_bijection;
    }

    public static SubLObject make_alist_bijection_from_hashtable(final SubLObject v_bijection) {
        final SubLObject old_database = bijection_database(v_bijection);
        final SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
        _csetf_bijection_database(v_bijection, new_database);
        _csetf_bijection_inverse_database(v_bijection, NIL);
        return v_bijection;
    }

    /**
     * Allocate a new bijection with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return bijection
     */
    @LispMethod(comment = "Allocate a new bijection with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return bijection\nAllocate a new bijection with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static final SubLObject new_bijection_alt(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        SubLTrampolineFile.checkType(size, INTEGERP);
        if (test.isSymbol()) {
            test = symbol_function(test);
        }
        {
            SubLObject v_bijection = make_bijection(UNPROVIDED);
            clear_bijection(v_bijection);
            _csetf_bijection_test(v_bijection, test);
            if (size.numG($bijection_high_water_mark$.getGlobalValue())) {
                _csetf_bijection_database(v_bijection, make_hash_table(size, test, UNPROVIDED));
                _csetf_bijection_inverse_database(v_bijection, make_hash_table(size, test, UNPROVIDED));
            }
            return v_bijection;
        }
    }

    /**
     * Allocate a new bijection with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return bijection
     */
    @LispMethod(comment = "Allocate a new bijection with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return bijection\nAllocate a new bijection with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static SubLObject new_bijection(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        assert NIL != integerp(size) : "! integerp(size) " + ("Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) ") + size;
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

    /**
     * Reset a bijection to the status of being just allocated.
     *
     * @return bijection
     */
    @LispMethod(comment = "Reset a bijection to the status of being just allocated.\r\n\r\n@return bijection")
    public static final SubLObject clear_bijection_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        _csetf_bijection_size(v_bijection, ZERO_INTEGER);
        _csetf_bijection_database(v_bijection, NIL);
        _csetf_bijection_inverse_database(v_bijection, NIL);
        return v_bijection;
    }

    /**
     * Reset a bijection to the status of being just allocated.
     *
     * @return bijection
     */
    @LispMethod(comment = "Reset a bijection to the status of being just allocated.\r\n\r\n@return bijection")
    public static SubLObject clear_bijection(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        _csetf_bijection_size(v_bijection, ZERO_INTEGER);
        _csetf_bijection_database(v_bijection, NIL);
        _csetf_bijection_inverse_database(v_bijection, NIL);
        return v_bijection;
    }

    /**
     * Return T iff BIJECTION is empty.
     */
    @LispMethod(comment = "Return T iff BIJECTION is empty.")
    public static final SubLObject bijection_empty_p_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        return zerop(bijection_size(v_bijection));
    }

    /**
     * Return T iff BIJECTION is empty.
     */
    @LispMethod(comment = "Return T iff BIJECTION is empty.")
    public static SubLObject bijection_empty_p(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        return zerop(bijection_size(v_bijection));
    }

    /**
     * Return T iff OBJECT is a bijection that is not empty.
     */
    @LispMethod(comment = "Return T iff OBJECT is a bijection that is not empty.")
    public static final SubLObject non_empty_bijection_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != bijection_p(v_object)) && (NIL == bijection_empty_p(v_object)));
    }

    /**
     * Return T iff OBJECT is a bijection that is not empty.
     */
    @LispMethod(comment = "Return T iff OBJECT is a bijection that is not empty.")
    public static SubLObject non_empty_bijection_p(final SubLObject v_object) {
        return makeBoolean((NIL != bijection_p(v_object)) && (NIL == bijection_empty_p(v_object)));
    }

    /**
     * Return the value mapped from KEY in BIJECTION.
     * Return the formal <tt>not-found</tt> if there was no entry.
     * Return a second value of T iff KEY was found.
     */
    @LispMethod(comment = "Return the value mapped from KEY in BIJECTION.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the value mapped from KEY in BIJECTION.\nReturn the formal <tt>not-found</tt> if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static final SubLObject bijection_lookup_alt(SubLObject v_bijection, SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return bijection_lookup_alist_style(v_bijection, key, not_found);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return bijection_lookup_hashtable_style(v_bijection, key, not_found);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    /**
     * Return the value mapped from KEY in BIJECTION.
     * Return the formal <tt>not-found</tt> if there was no entry.
     * Return a second value of T iff KEY was found.
     */
    @LispMethod(comment = "Return the value mapped from KEY in BIJECTION.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the value mapped from KEY in BIJECTION.\nReturn the formal <tt>not-found</tt> if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static SubLObject bijection_lookup(final SubLObject v_bijection, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_lookup_alist_style(v_bijection, key, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_lookup_hashtable_style(v_bijection, key, not_found);
        }
        return bijection_style_error(v_bijection);
    }

    /**
     * Return the key mapped to VALUE in BIJECTION.
     * Return the formal <tt>not-found</tt> if there was no entry.
     * Return a second value of T iff KEY was found.
     */
    @LispMethod(comment = "Return the key mapped to VALUE in BIJECTION.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the key mapped to VALUE in BIJECTION.\nReturn the formal <tt>not-found</tt> if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static final SubLObject bijection_inverse_lookup_alt(SubLObject v_bijection, SubLObject value, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return bijection_inverse_lookup_alist_style(v_bijection, value, not_found);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return bijection_inverse_lookup_hashtable_style(v_bijection, value, not_found);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    @LispMethod(comment = "Return the key mapped to VALUE in BIJECTION.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the key mapped to VALUE in BIJECTION.\nReturn the formal <tt>not-found</tt> if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static SubLObject bijection_inverse_lookup(final SubLObject v_bijection, final SubLObject value, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_inverse_lookup_alist_style(v_bijection, value, not_found);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_inverse_lookup_hashtable_style(v_bijection, value, not_found);
        }
        return bijection_style_error(v_bijection);
    }

    /**
     * Note that KEY and VALUE map to each other in BIJECTION.
     *
     * @return key
     * @return value
     */
    @LispMethod(comment = "Note that KEY and VALUE map to each other in BIJECTION.\r\n\r\n@return key\r\n@return value")
    public static final SubLObject bijection_enter_alt(SubLObject v_bijection, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return bijection_enter_alist_style(v_bijection, key, value);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return bijection_enter_hashtable_style(v_bijection, key, value);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    @LispMethod(comment = "Note that KEY and VALUE map to each other in BIJECTION.\r\n\r\n@return key\r\n@return value")
    public static SubLObject bijection_enter(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_enter_alist_style(v_bijection, key, value);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_enter_hashtable_style(v_bijection, key, value);
        }
        return bijection_style_error(v_bijection);
    }

    /**
     * Note that VALUE and KEY map to each other in BIJECTION.
     *
     * @return key
     * @return value
     */
    @LispMethod(comment = "Note that VALUE and KEY map to each other in BIJECTION.\r\n\r\n@return key\r\n@return value")
    public static final SubLObject bijection_inverse_enter_alt(SubLObject v_bijection, SubLObject value, SubLObject key) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return bijection_inverse_enter_alist_style(v_bijection, value, key);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return bijection_inverse_enter_hashtable_style(v_bijection, value, key);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    @LispMethod(comment = "Note that VALUE and KEY map to each other in BIJECTION.\r\n\r\n@return key\r\n@return value")
    public static SubLObject bijection_inverse_enter(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_inverse_enter_alist_style(v_bijection, value, key);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_inverse_enter_hashtable_style(v_bijection, value, key);
        }
        return bijection_style_error(v_bijection);
    }

    /**
     * Remove any mapping for KEY in BIJECTION.
     *
     * @return key iff found, else NIL
     * @return value
     */
    @LispMethod(comment = "Remove any mapping for KEY in BIJECTION.\r\n\r\n@return key iff found, else NIL\r\n@return value")
    public static final SubLObject bijection_remove_alt(SubLObject v_bijection, SubLObject key) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return bijection_remove_alist_style(v_bijection, key);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return bijection_remove_hashtable_style(v_bijection, key);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    @LispMethod(comment = "Remove any mapping for KEY in BIJECTION.\r\n\r\n@return key iff found, else NIL\r\n@return value")
    public static SubLObject bijection_remove(final SubLObject v_bijection, final SubLObject key) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_remove_alist_style(v_bijection, key);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_remove_hashtable_style(v_bijection, key);
        }
        return bijection_style_error(v_bijection);
    }

    /**
     * Remove any mapping for VALUE in BIJECTION.
     *
     * @return key iff found, else NIL
     * @return value
     */
    @LispMethod(comment = "Remove any mapping for VALUE in BIJECTION.\r\n\r\n@return key iff found, else NIL\r\n@return value")
    public static final SubLObject bijection_inverse_remove_alt(SubLObject v_bijection, SubLObject value) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return bijection_inverse_remove_alist_style(v_bijection, value);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return bijection_inverse_remove_hashtable_style(v_bijection, value);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    @LispMethod(comment = "Remove any mapping for VALUE in BIJECTION.\r\n\r\n@return key iff found, else NIL\r\n@return value")
    public static SubLObject bijection_inverse_remove(final SubLObject v_bijection, final SubLObject value) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return bijection_inverse_remove_alist_style(v_bijection, value);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return bijection_inverse_remove_hashtable_style(v_bijection, value);
        }
        return bijection_style_error(v_bijection);
    }

    /**
     * Returns an iterator for BIJECTION.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for BIJECTION.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for BIJECTION.\nValues returned are tuples of the form (<key> <value>).")
    public static final SubLObject new_bijection_iterator_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject database = bijection_database(v_bijection);
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return iteration.new_alist_iterator(database);
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return iteration.new_hash_table_iterator(database);
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    @LispMethod(comment = "Returns an iterator for BIJECTION.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for BIJECTION.\nValues returned are tuples of the form (<key> <value>).")
    public static SubLObject new_bijection_iterator(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
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

    /**
     * Iterate over BIJECTION, binding KEY and VALUE to each key and value indexed.
     * BODY is executed once within the scope of each binding of KEY VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over BIJECTION, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over BIJECTION, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_bijection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject v_bijection = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    v_bijection = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt30);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt30);
                            if (NIL == member(current_1, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt30);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject bijection_var = $sym34$BIJECTION_VAR;
                                return list(CLET, list(list(bijection_var, v_bijection)), list(PCASE, list(DO_BIJECTION_STYLE, bijection_var), list($ALIST, listS(DO_ALIST, list(key, value, list(DO_BIJECTION_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list($HASHTABLE, listS(DO_HASH_TABLE, list(key, value, list(DO_BIJECTION_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list(OTHERWISE, list(BIJECTION_STYLE_ERROR, bijection_var))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over BIJECTION, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over BIJECTION, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
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

    /**
     * Iterate over BIJECTION, binding VALUE and KEY to each value and key indexed.
     * BODY is executed once within the scope of each binding of VALUE KEY.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over BIJECTION, binding VALUE and KEY to each value and key indexed.\r\nBODY is executed once within the scope of each binding of VALUE KEY.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over BIJECTION, binding VALUE and KEY to each value and key indexed.\nBODY is executed once within the scope of each binding of VALUE KEY.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_bijection_inverse_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject value = NIL;
                    SubLObject key = NIL;
                    SubLObject v_bijection = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    v_bijection = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt43);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt43);
                            if (NIL == member(current_2, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt43);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject bijection_var = $sym44$BIJECTION_VAR;
                                return list(CLET, list(list(bijection_var, v_bijection)), list(PCASE, list(DO_BIJECTION_STYLE, bijection_var), list($ALIST, listS(DO_ALIST, list(key, value, list(DO_BIJECTION_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list($HASHTABLE, listS(DO_HASH_TABLE, list(value, key, list(DO_BIJECTION_INVERSE_DATABASE, bijection_var), $DONE, done), append(body, NIL))), list(OTHERWISE, list(BIJECTION_STYLE_ERROR, bijection_var))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over BIJECTION, binding VALUE and KEY to each value and key indexed.\r\nBODY is executed once within the scope of each binding of VALUE KEY.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over BIJECTION, binding VALUE and KEY to each value and key indexed.\nBODY is executed once within the scope of each binding of VALUE KEY.\nIteration halts as soon as DONE becomes non-nil.")
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

    public static final SubLObject do_bijection_style_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        return bijection_style(v_bijection);
    }

    public static SubLObject do_bijection_style(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        return bijection_style(v_bijection);
    }

    public static final SubLObject do_bijection_database_alt(SubLObject v_bijection) {
        return bijection_database(v_bijection);
    }

    public static SubLObject do_bijection_database(final SubLObject v_bijection) {
        return bijection_database(v_bijection);
    }

    public static final SubLObject do_bijection_inverse_database_alt(SubLObject v_bijection) {
        return bijection_inverse_database(v_bijection);
    }

    public static SubLObject do_bijection_inverse_database(final SubLObject v_bijection) {
        return bijection_inverse_database(v_bijection);
    }

    /**
     *
     *
     * @param BIJECTION
     * 		bijection; @return list; a list of all keys of BIJECTION
     */
    @LispMethod(comment = "@param BIJECTION\r\n\t\tbijection; @return list; a list of all keys of BIJECTION")
    public static final SubLObject bijection_keys_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return list_utilities.alist_keys(bijection_database(v_bijection));
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_utilities.hash_table_keys(bijection_database(v_bijection));
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    /**
     *
     *
     * @param BIJECTION
     * 		bijection; @return list; a list of all keys of BIJECTION
     */
    @LispMethod(comment = "@param BIJECTION\r\n\t\tbijection; @return list; a list of all keys of BIJECTION")
    public static SubLObject bijection_keys(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return list_utilities.alist_keys(bijection_database(v_bijection));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(bijection_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    /**
     *
     *
     * @param BIJECTION
     * 		bijection; @return list; a list of all values of BIJECTION
     */
    @LispMethod(comment = "@param BIJECTION\r\n\t\tbijection; @return list; a list of all values of BIJECTION")
    public static final SubLObject bijection_values_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return list_utilities.alist_values(bijection_database(v_bijection));
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_utilities.hash_table_keys(bijection_inverse_database(v_bijection));
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    /**
     *
     *
     * @param BIJECTION
     * 		bijection; @return list; a list of all values of BIJECTION
     */
    @LispMethod(comment = "@param BIJECTION\r\n\t\tbijection; @return list; a list of all values of BIJECTION")
    public static SubLObject bijection_values(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return list_utilities.alist_values(bijection_database(v_bijection));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(bijection_inverse_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    public static final SubLObject bijection_to_alist_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                return values(copy_tree(bijection_database(v_bijection)), bijection_test(v_bijection));
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return hash_table_utilities.hash_table_to_alist(bijection_database(v_bijection));
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    public static SubLObject bijection_to_alist(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql($ALIST)) {
            return values(copy_tree(bijection_database(v_bijection)), bijection_test(v_bijection));
        }
        if (pcase_var.eql($HASHTABLE)) {
            return hash_table_utilities.hash_table_to_alist(bijection_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }

    public static final SubLObject bijection_to_hashtable_alt(SubLObject v_bijection) {
        SubLTrampolineFile.checkType(v_bijection, BIJECTION_P);
        {
            SubLObject pcase_var = bijection_style(v_bijection);
            if (pcase_var.eql($ALIST)) {
                {
                    SubLObject alist = bijection_database(v_bijection);
                    SubLObject test = bijection_test(v_bijection);
                    return values(list_utilities.alist_to_hash_table(alist, test), list_utilities.alist_to_reverse_hash_table(alist, test));
                }
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    return values(bijection_database(v_bijection), bijection_inverse_database(v_bijection));
                } else {
                    return bijection_style_error(v_bijection);
                }
            }
        }
    }

    public static SubLObject bijection_to_hashtable(final SubLObject v_bijection) {
        assert NIL != bijection_p(v_bijection) : "! bijection.bijection_p(v_bijection) " + ("bijection.bijection_p(v_bijection) " + "CommonSymbols.NIL != bijection.bijection_p(v_bijection) ") + v_bijection;
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

    public static final SubLObject print_bijection_contents_alt(SubLObject v_bijection, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject bijection_var = v_bijection;
            SubLObject pcase_var = do_bijection_style(bijection_var);
            if (pcase_var.eql($ALIST)) {
                {
                    SubLObject cdolist_list_var = do_bijection_database(bijection_var);
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject key = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt47);
                            key = current.first();
                            current = current.rest();
                            value = current;
                            format(stream, $str_alt48$_S______S__, key, value);
                        }
                    }
                }
            } else {
                if (pcase_var.eql($HASHTABLE)) {
                    {
                        SubLObject cdohash_table = do_bijection_database(bijection_var);
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    key = getEntryKey(cdohash_entry);
                                    value = getEntryValue(cdohash_entry);
                                    format(stream, $str_alt48$_S______S__, key, value);
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                } else {
                    bijection_style_error(bijection_var);
                }
            }
        }
        return NIL;
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
        declareFunction("bijection_print_function_trampoline", "BIJECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("bijection_p", "BIJECTION-P", 1, 0, false);
        new bijection.$bijection_p$UnaryFunction();
        declareFunction("bijection_size", "BIJECTION-SIZE", 1, 0, false);
        declareFunction("bijection_database", "BIJECTION-DATABASE", 1, 0, false);
        declareFunction("bijection_inverse_database", "BIJECTION-INVERSE-DATABASE", 1, 0, false);
        declareFunction("bijection_test", "BIJECTION-TEST", 1, 0, false);
        declareFunction("_csetf_bijection_size", "_CSETF-BIJECTION-SIZE", 2, 0, false);
        declareFunction("_csetf_bijection_database", "_CSETF-BIJECTION-DATABASE", 2, 0, false);
        declareFunction("_csetf_bijection_inverse_database", "_CSETF-BIJECTION-INVERSE-DATABASE", 2, 0, false);
        declareFunction("_csetf_bijection_test", "_CSETF-BIJECTION-TEST", 2, 0, false);
        declareFunction("make_bijection", "MAKE-BIJECTION", 0, 1, false);
        declareFunction("visit_defstruct_bijection", "VISIT-DEFSTRUCT-BIJECTION", 2, 0, false);
        declareFunction("visit_defstruct_object_bijection_method", "VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD", 2, 0, false);
        declareFunction("bijection_style", "BIJECTION-STYLE", 1, 0, false);
        declareFunction("bijection_style_error", "BIJECTION-STYLE-ERROR", 1, 0, false);
        declareFunction("bijection_lookup_alist_style", "BIJECTION-LOOKUP-ALIST-STYLE", 3, 0, false);
        declareFunction("bijection_enter_alist_style", "BIJECTION-ENTER-ALIST-STYLE", 3, 0, false);
        declareFunction("bijection_remove_alist_style", "BIJECTION-REMOVE-ALIST-STYLE", 2, 0, false);
        declareFunction("bijection_inverse_lookup_alist_style", "BIJECTION-INVERSE-LOOKUP-ALIST-STYLE", 3, 0, false);
        declareFunction("bijection_inverse_enter_alist_style", "BIJECTION-INVERSE-ENTER-ALIST-STYLE", 3, 0, false);
        declareFunction("bijection_inverse_remove_alist_style", "BIJECTION-INVERSE-REMOVE-ALIST-STYLE", 2, 0, false);
        declareFunction("make_hashtable_bijection_from_alist", "MAKE-HASHTABLE-BIJECTION-FROM-ALIST", 1, 0, false);
        declareFunction("bijection_lookup_hashtable_style", "BIJECTION-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("bijection_enter_hashtable_style", "BIJECTION-ENTER-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("bijection_remove_hashtable_style", "BIJECTION-REMOVE-HASHTABLE-STYLE", 2, 0, false);
        declareFunction("bijection_inverse_lookup_hashtable_style", "BIJECTION-INVERSE-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("bijection_inverse_enter_hashtable_style", "BIJECTION-INVERSE-ENTER-HASHTABLE-STYLE", 3, 0, false);
        declareFunction("bijection_inverse_remove_hashtable_style", "BIJECTION-INVERSE-REMOVE-HASHTABLE-STYLE", 2, 0, false);
        declareFunction("bijection_remove_hashtable_style_int", "BIJECTION-REMOVE-HASHTABLE-STYLE-INT", 3, 0, false);
        declareFunction("make_alist_bijection_from_hashtable", "MAKE-ALIST-BIJECTION-FROM-HASHTABLE", 1, 0, false);
        declareFunction("new_bijection", "NEW-BIJECTION", 0, 2, false);
        declareFunction("clear_bijection", "CLEAR-BIJECTION", 1, 0, false);
        declareFunction("bijection_empty_p", "BIJECTION-EMPTY-P", 1, 0, false);
        declareFunction("non_empty_bijection_p", "NON-EMPTY-BIJECTION-P", 1, 0, false);
        declareFunction("bijection_lookup", "BIJECTION-LOOKUP", 2, 1, false);
        declareFunction("bijection_inverse_lookup", "BIJECTION-INVERSE-LOOKUP", 2, 1, false);
        declareFunction("bijection_enter", "BIJECTION-ENTER", 3, 0, false);
        declareFunction("bijection_inverse_enter", "BIJECTION-INVERSE-ENTER", 3, 0, false);
        declareFunction("bijection_remove", "BIJECTION-REMOVE", 2, 0, false);
        declareFunction("bijection_inverse_remove", "BIJECTION-INVERSE-REMOVE", 2, 0, false);
        declareFunction("new_bijection_iterator", "NEW-BIJECTION-ITERATOR", 1, 0, false);
        declareMacro("do_bijection", "DO-BIJECTION");
        declareMacro("do_bijection_inverse", "DO-BIJECTION-INVERSE");
        declareFunction("do_bijection_style", "DO-BIJECTION-STYLE", 1, 0, false);
        declareFunction("do_bijection_database", "DO-BIJECTION-DATABASE", 1, 0, false);
        declareFunction("do_bijection_inverse_database", "DO-BIJECTION-INVERSE-DATABASE", 1, 0, false);
        declareFunction("bijection_keys", "BIJECTION-KEYS", 1, 0, false);
        declareFunction("bijection_values", "BIJECTION-VALUES", 1, 0, false);
        declareFunction("bijection_to_alist", "BIJECTION-TO-ALIST", 1, 0, false);
        declareFunction("bijection_to_hashtable", "BIJECTION-TO-HASHTABLE", 1, 0, false);
        declareFunction("print_bijection_contents", "PRINT-BIJECTION-CONTENTS", 1, 1, false);
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

    static {
    }

    static private final SubLList $list_alt4 = list(makeSymbol("SIZE"), makeSymbol("DATABASE"), makeSymbol("INVERSE-DATABASE"), makeSymbol("TEST"));

    static private final SubLList $list_alt5 = list($SIZE, makeKeyword("DATABASE"), makeKeyword("INVERSE-DATABASE"), $TEST);

    static private final SubLList $list_alt6 = list(makeSymbol("BIJECTION-SIZE"), makeSymbol("BIJECTION-DATABASE"), makeSymbol("BIJECTION-INVERSE-DATABASE"), makeSymbol("BIJECTION-TEST"));

    static private final SubLList $list_alt7 = list(makeSymbol("_CSETF-BIJECTION-SIZE"), makeSymbol("_CSETF-BIJECTION-DATABASE"), makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE"), makeSymbol("_CSETF-BIJECTION-TEST"));

    public static final class $bijection_p$UnaryFunction extends UnaryFunction {
        public $bijection_p$UnaryFunction() {
            super(extractFunctionNamed("BIJECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return bijection_p(arg1);
        }
    }

    static private final SubLString $str_alt22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt26$Corrupted_bijection__unsupported_ = makeString("Corrupted bijection; unsupported style ~S.~%");

    static private final SubLString $str_alt27$Malformed_bijection_ = makeString("Malformed bijection.");

    static private final SubLList $list_alt30 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("BIJECTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt31 = list($DONE);

    static private final SubLSymbol $sym34$BIJECTION_VAR = makeUninternedSymbol("BIJECTION-VAR");

    static private final SubLList $list_alt43 = list(list(makeSymbol("VALUE"), makeSymbol("KEY"), makeSymbol("BIJECTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym44$BIJECTION_VAR = makeUninternedSymbol("BIJECTION-VAR");

    static private final SubLList $list_alt47 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt48$_S______S__ = makeString("~S <-> ~S~%");
}

/**
 * Total time: 224 ms
 */
