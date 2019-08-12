/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DEFSTRUCT-SEQUENCE
 * source file: /cyc/top/cycl/defstruct-sequence.lisp
 * created:     2019/07/03 17:37:12
 */
public final class defstruct_sequence extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new defstruct_sequence();

 public static final String myName = "com.cyc.cycjava.cycl.defstruct_sequence";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("SLOTS"));

    private static final SubLSymbol DEFSTRUCT_VECTOR = makeSymbol("DEFSTRUCT-VECTOR");

    static private final SubLString $str3$A_simplified_version_of_DEFSTRUCT = makeString("A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");

    private static final SubLSymbol DEFSTRUCT_LIST = makeSymbol("DEFSTRUCT-LIST");

    static private final SubLString $str6$A_simplified_version_of_DEFSTRUCT = makeString("A simplified version of DEFSTRUCT that just creates and manipulates list objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");

    private static final SubLSymbol DEFSTRUCT_VECTOR_CONSTRUCTOR = makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR");

    private static final SubLSymbol DEFSTRUCT_LIST_CONSTRUCTOR = makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR");

    static private final SubLList $list9 = list(makeSymbol("PREDICATE"), makeSymbol("CONSTRUCTOR"), makeSymbol("SLOT-KEYS"), makeSymbol("GETTER-SETTER-PAIRS"));

    static private final SubLList $list11 = list(makeSymbol("OBJECT"));

    static private final SubLList $list14 = list(makeSymbol("VECTORP"), makeSymbol("OBJECT"));

    static private final SubLSymbol $sym15$_ = makeSymbol("=");

    static private final SubLList $list16 = list(list(makeSymbol("LENGTH"), makeSymbol("OBJECT")));

    static private final SubLList $list18 = list(list(makeSymbol("AREF"), makeSymbol("OBJECT"), ZERO_INTEGER));

    static private final SubLList $list19 = list(makeSymbol("CONSP"), makeSymbol("OBJECT"));

    static private final SubLList $list20 = list(list(makeSymbol("CAR"), makeSymbol("OBJECT")));

    static private final SubLList $list21 = list(makeSymbol("PROPER-LIST-P"), makeSymbol("OBJECT"));

    static private final SubLList $list22 = list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST"));

    static private final SubLList $list23 = list(makeSymbol("ARGLIST"));

    static private final SubLList $list24 = list(makeSymbol("GETTER"), makeSymbol("SETTER"));

    static private final SubLList $list29 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));

    static private final SubLList $list31 = list(makeSymbol("VALUE"));

    static private final SubLList $list32 = list(list(RET, makeSymbol("OBJECT")));

    static private final SubLString $str35$_P = makeString("-P");

    static private final SubLString $str36$MAKE_ = makeString("MAKE-");

    static private final SubLString $str37$_ = makeString("-");

    static private final SubLString $str38$SET_ = makeString("SET-");

    private static final SubLSymbol DEFSTRUCT_SEQUENCE_INTERNAL = makeSymbol("DEFSTRUCT-SEQUENCE-INTERNAL");

    private static final SubLList $list46 = list(list(list(makeKeyword("VECTOR"), makeSymbol("KMG"), list(makeSymbol("ONE"), makeSymbol("TWO"))), list(makeSymbol("PROGN"), list(makeSymbol("DEFINE"), makeSymbol("KMG-P"), list(makeSymbol("OBJECT")), list(RET, list(makeSymbol("CAND"), list(makeSymbol("VECTORP"), makeSymbol("OBJECT")), list(makeSymbol("="), THREE_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("OBJECT"))), list(EQ, list(QUOTE, makeSymbol("KMG")), list(makeSymbol("AREF"), makeSymbol("OBJECT"), ZERO_INTEGER))))), list(makeSymbol("DEFINE"), makeSymbol("MAKE-KMG"), list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST")), list(RET, list(makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR"), list(QUOTE, makeSymbol("KMG")), THREE_INTEGER, list(QUOTE, list(makeKeyword("ONE"), makeKeyword("TWO"))), makeSymbol("ARGLIST")))), list(makeSymbol("DEFINE"), makeSymbol("KMG-ONE"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("AREF"), makeSymbol("OBJECT"), ONE_INTEGER))), list(makeSymbol("DEFINE"), makeSymbol("KMG-TWO"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("AREF"), makeSymbol("OBJECT"), TWO_INTEGER))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-ONE"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-AREF"), makeSymbol("OBJECT"), ONE_INTEGER, makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-TWO"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-AREF"), makeSymbol("OBJECT"), TWO_INTEGER, makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(IDENTITY, list(QUOTE, makeSymbol("KMG"))))), list(list($LIST, makeSymbol("KMG"), list(makeSymbol("ONE"), makeSymbol("TWO"))), list(makeSymbol("PROGN"), list(makeSymbol("DEFINE"), makeSymbol("KMG-P"), list(makeSymbol("OBJECT")), list(RET, list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("OBJECT")), list(EQ, list(QUOTE, makeSymbol("KMG")), list(makeSymbol("CAR"), makeSymbol("OBJECT"))), list(makeSymbol("PROPER-LIST-P"), makeSymbol("OBJECT")), list(makeSymbol("="), THREE_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("OBJECT")))))), list(makeSymbol("DEFINE"), makeSymbol("MAKE-KMG"), list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST")), list(RET, list(makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR"), list(QUOTE, makeSymbol("KMG")), THREE_INTEGER, list(QUOTE, list(makeKeyword("ONE"), makeKeyword("TWO"))), makeSymbol("ARGLIST")))), list(makeSymbol("DEFINE"), makeSymbol("KMG-ONE"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("NTH"), ONE_INTEGER, makeSymbol("OBJECT")))), list(makeSymbol("DEFINE"), makeSymbol("KMG-TWO"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("NTH"), TWO_INTEGER, makeSymbol("OBJECT")))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-ONE"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-NTH"), ONE_INTEGER, makeSymbol("OBJECT"), makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-TWO"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-NTH"), TWO_INTEGER, makeSymbol("OBJECT"), makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(IDENTITY, list(QUOTE, makeSymbol("KMG"))))));

    // Definitions
    /**
     * A simplified version of DEFSTRUCT that just creates and manipulates vector objects.
     * NAME is a symbol (such as FOO) used to generate 4 classes of methods :
     * (1) a constructor MAKE-FOO (&optional arglist)
     * (2) a predicate FOO-P (object)
     * (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)
     * (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)
     */
    @LispMethod(comment = "A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\r\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\r\n(1) a constructor MAKE-FOO (&optional arglist)\r\n(2) a predicate FOO-P (object)\r\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\r\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)\nA simplified version of DEFSTRUCT that just creates and manipulates vector objects.\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\n(1) a constructor MAKE-FOO (&optional arglist)\n(2) a predicate FOO-P (object)\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)")
    public static final SubLObject defstruct_vector_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_slots = current;
                            return com.cyc.cycjava.cycl.defstruct_sequence.defstruct_sequence_internal($VECTOR, name, v_slots);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * A simplified version of DEFSTRUCT that just creates and manipulates vector objects.
     * NAME is a symbol (such as FOO) used to generate 4 classes of methods :
     * (1) a constructor MAKE-FOO (&optional arglist)
     * (2) a predicate FOO-P (object)
     * (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)
     * (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)
     */
    @LispMethod(comment = "A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\r\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\r\n(1) a constructor MAKE-FOO (&optional arglist)\r\n(2) a predicate FOO-P (object)\r\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\r\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)\nA simplified version of DEFSTRUCT that just creates and manipulates vector objects.\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\n(1) a constructor MAKE-FOO (&optional arglist)\n(2) a predicate FOO-P (object)\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)")
    public static SubLObject defstruct_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_slots;
            current = v_slots = temp;
            return defstruct_sequence_internal($VECTOR, name, v_slots);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * A simplified version of DEFSTRUCT that just creates and manipulates list objects.
     * NAME is a symbol (such as FOO) used to generate 4 classes of methods :
     * (1) a constructor MAKE-FOO (&optional arglist)
     * (2) a predicate FOO-P (object)
     * (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)
     * (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)
     */
    @LispMethod(comment = "A simplified version of DEFSTRUCT that just creates and manipulates list objects.\r\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\r\n(1) a constructor MAKE-FOO (&optional arglist)\r\n(2) a predicate FOO-P (object)\r\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\r\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)\nA simplified version of DEFSTRUCT that just creates and manipulates list objects.\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\n(1) a constructor MAKE-FOO (&optional arglist)\n(2) a predicate FOO-P (object)\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)")
    public static final SubLObject defstruct_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_slots = current;
                            return com.cyc.cycjava.cycl.defstruct_sequence.defstruct_sequence_internal($LIST, name, v_slots);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * A simplified version of DEFSTRUCT that just creates and manipulates list objects.
     * NAME is a symbol (such as FOO) used to generate 4 classes of methods :
     * (1) a constructor MAKE-FOO (&optional arglist)
     * (2) a predicate FOO-P (object)
     * (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)
     * (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)
     */
    @LispMethod(comment = "A simplified version of DEFSTRUCT that just creates and manipulates list objects.\r\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\r\n(1) a constructor MAKE-FOO (&optional arglist)\r\n(2) a predicate FOO-P (object)\r\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\r\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)\nA simplified version of DEFSTRUCT that just creates and manipulates list objects.\nNAME is a symbol (such as FOO) used to generate 4 classes of methods :\n(1) a constructor MAKE-FOO (&optional arglist)\n(2) a predicate FOO-P (object)\n(3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n(4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)")
    public static SubLObject defstruct_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_slots;
            current = v_slots = temp;
            return defstruct_sequence_internal($LIST, name, v_slots);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static final SubLObject defstruct_vector_constructor_alt(SubLObject type, SubLObject size, SubLObject slot_keys, SubLObject parameters) {
        {
            SubLObject vector = make_vector(size, NIL);
            set_aref(vector, ZERO_INTEGER, type);
            {
                SubLObject remainder = NIL;
                for (remainder = parameters; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject parameter = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLObject index = position(parameter, slot_keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        set_aref(vector, number_utilities.f_1X(index), value);
                    }
                }
            }
            return vector;
        }
    }

    public static SubLObject defstruct_vector_constructor(final SubLObject type, final SubLObject size, final SubLObject slot_keys, final SubLObject parameters) {
        final SubLObject vector = make_vector(size, NIL);
        set_aref(vector, ZERO_INTEGER, type);
        SubLObject remainder;
        SubLObject parameter;
        SubLObject value;
        SubLObject index;
        for (remainder = NIL, remainder = parameters; NIL != remainder; remainder = cddr(remainder)) {
            parameter = remainder.first();
            value = cadr(remainder);
            index = position(parameter, slot_keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            set_aref(vector, number_utilities.f_1X(index), value);
        }
        return vector;
    }

    public static final SubLObject defstruct_list_constructor_alt(SubLObject type, SubLObject size, SubLObject slot_keys, SubLObject parameters) {
        {
            SubLObject list = make_list(size, NIL);
            set_nth(ZERO_INTEGER, list, type);
            {
                SubLObject remainder = NIL;
                for (remainder = parameters; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject parameter = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLObject index = position(parameter, slot_keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        set_nth(number_utilities.f_1X(index), list, value);
                    }
                }
            }
            return list;
        }
    }

    public static SubLObject defstruct_list_constructor(final SubLObject type, final SubLObject size, final SubLObject slot_keys, final SubLObject parameters) {
        final SubLObject list = make_list(size, NIL);
        set_nth(ZERO_INTEGER, list, type);
        SubLObject remainder;
        SubLObject parameter;
        SubLObject value;
        SubLObject index;
        for (remainder = NIL, remainder = parameters; NIL != remainder; remainder = cddr(remainder)) {
            parameter = remainder.first();
            value = cadr(remainder);
            index = position(parameter, slot_keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            set_nth(number_utilities.f_1X(index), list, value);
        }
        return list;
    }

    public static final SubLObject defstruct_sequence_internal_alt(SubLObject type, SubLObject name, SubLObject v_slots) {
        {
            SubLObject data = com.cyc.cycjava.cycl.defstruct_sequence.defstruct_sequence_data(name, v_slots);
            SubLObject datum = data;
            SubLObject current = datum;
            SubLObject predicate = NIL;
            SubLObject constructor = NIL;
            SubLObject slot_keys = NIL;
            SubLObject getter_setter_pairs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            constructor = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            slot_keys = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            getter_setter_pairs = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject size = add(ONE_INTEGER, length(v_slots));
                    SubLObject predicate_method = NIL;
                    SubLObject constructor_method = NIL;
                    SubLObject getter_methods = NIL;
                    SubLObject setter_methods = NIL;
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($VECTOR)) {
                            predicate_method = list(DEFINE, predicate, $list_alt11, list(RET, list(CAND, $list_alt14, listS($sym15$_, size, $list_alt16), listS(EQ, list(QUOTE, name), $list_alt18))));
                        } else {
                            if (pcase_var.eql($LIST)) {
                                predicate_method = list(DEFINE, predicate, $list_alt11, list(RET, list(CAND, $list_alt19, listS(EQ, list(QUOTE, name), $list_alt20), $list_alt21, listS($sym15$_, size, $list_alt16))));
                            }
                        }
                    }
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($VECTOR)) {
                            constructor_method = list(DEFINE, constructor, $list_alt22, list(RET, listS(DEFSTRUCT_VECTOR_CONSTRUCTOR, list(QUOTE, name), size, list(QUOTE, slot_keys), $list_alt23)));
                        } else {
                            if (pcase_var.eql($LIST)) {
                                constructor_method = list(DEFINE, constructor, $list_alt22, list(RET, listS(DEFSTRUCT_LIST_CONSTRUCTOR, list(QUOTE, name), size, list(QUOTE, slot_keys), $list_alt23)));
                            }
                        }
                    }
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject cdolist_list_var = getter_setter_pairs;
                        SubLObject getter_setter_pair = NIL;
                        for (getter_setter_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , getter_setter_pair = cdolist_list_var.first()) {
                            index = add(index, ONE_INTEGER);
                            {
                                SubLObject datum_1 = getter_setter_pair;
                                SubLObject current_2 = datum_1;
                                SubLObject getter = NIL;
                                SubLObject setter = NIL;
                                destructuring_bind_must_consp(current_2, datum_1, $list_alt24);
                                getter = current_2.first();
                                current_2 = current_2.rest();
                                destructuring_bind_must_consp(current_2, datum_1, $list_alt24);
                                setter = current_2.first();
                                current_2 = current_2.rest();
                                if (NIL == current_2) {
                                    {
                                        SubLObject pcase_var = type;
                                        if (pcase_var.eql($VECTOR)) {
                                            getter_methods = cons(list(DEFINE, getter, $list_alt11, list(CHECK_TYPE, OBJECT, predicate), list(RET, list(AREF, OBJECT, index))), getter_methods);
                                        } else {
                                            if (pcase_var.eql($LIST)) {
                                                getter_methods = cons(list(DEFINE, getter, $list_alt11, list(CHECK_TYPE, OBJECT, predicate), list(RET, listS(NTH, index, $list_alt11))), getter_methods);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject pcase_var = type;
                                        if (pcase_var.eql($VECTOR)) {
                                            setter_methods = cons(listS(DEFINE, setter, $list_alt29, list(CHECK_TYPE, OBJECT, predicate), listS(SET_AREF, OBJECT, index, $list_alt31), $list_alt32), setter_methods);
                                        } else {
                                            if (pcase_var.eql($LIST)) {
                                                setter_methods = cons(listS(DEFINE, setter, $list_alt29, list(CHECK_TYPE, OBJECT, predicate), listS(SET_NTH, index, $list_alt29), $list_alt32), setter_methods);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_1, $list_alt24);
                                }
                            }
                        }
                    }
                    return listS(PROGN, predicate_method, constructor_method, append(nreverse(getter_methods), nreverse(setter_methods), list(list(IDENTITY, list(QUOTE, name)))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt9);
            }
        }
        return NIL;
    }

    public static SubLObject defstruct_sequence_internal(final SubLObject type, final SubLObject name, final SubLObject v_slots) {
        final SubLObject data = defstruct_sequence_data(name, v_slots);
        SubLObject current;
        final SubLObject datum = current = data;
        SubLObject predicate = NIL;
        SubLObject constructor = NIL;
        SubLObject slot_keys = NIL;
        SubLObject getter_setter_pairs = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        constructor = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        slot_keys = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        getter_setter_pairs = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject size = add(ONE_INTEGER, length(v_slots));
            SubLObject predicate_method = NIL;
            SubLObject constructor_method = NIL;
            SubLObject getter_methods = NIL;
            SubLObject setter_methods = NIL;
            if (type.eql($VECTOR)) {
                predicate_method = list(DEFINE, predicate, $list11, list(RET, list(CAND, $list14, listS($sym15$_, size, $list16), listS(EQ, list(QUOTE, name), $list18))));
            } else
                if (type.eql($LIST)) {
                    predicate_method = list(DEFINE, predicate, $list11, list(RET, list(CAND, $list19, listS(EQ, list(QUOTE, name), $list20), $list21, listS($sym15$_, size, $list16))));
                }

            if (type.eql($VECTOR)) {
                constructor_method = list(DEFINE, constructor, $list22, list(RET, listS(DEFSTRUCT_VECTOR_CONSTRUCTOR, list(QUOTE, name), size, list(QUOTE, slot_keys), $list23)));
            } else
                if (type.eql($LIST)) {
                    constructor_method = list(DEFINE, constructor, $list22, list(RET, listS(DEFSTRUCT_LIST_CONSTRUCTOR, list(QUOTE, name), size, list(QUOTE, slot_keys), $list23)));
                }

            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = getter_setter_pairs;
            SubLObject getter_setter_pair = NIL;
            getter_setter_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                index = add(index, ONE_INTEGER);
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = getter_setter_pair;
                SubLObject getter = NIL;
                SubLObject setter = NIL;
                destructuring_bind_must_consp(current_$2, datum_$1, $list24);
                getter = current_$2.first();
                current_$2 = current_$2.rest();
                destructuring_bind_must_consp(current_$2, datum_$1, $list24);
                setter = current_$2.first();
                current_$2 = current_$2.rest();
                if (NIL == current_$2) {
                    if (type.eql($VECTOR)) {
                        getter_methods = cons(list(DEFINE, getter, $list11, list(CHECK_TYPE, OBJECT, predicate), list(RET, list(AREF, OBJECT, index))), getter_methods);
                    } else
                        if (type.eql($LIST)) {
                            getter_methods = cons(list(DEFINE, getter, $list11, list(CHECK_TYPE, OBJECT, predicate), list(RET, listS(NTH, index, $list11))), getter_methods);
                        }

                    if (type.eql($VECTOR)) {
                        setter_methods = cons(listS(DEFINE, setter, $list29, list(CHECK_TYPE, OBJECT, predicate), listS(SET_AREF, OBJECT, index, $list31), $list32), setter_methods);
                    } else
                        if (type.eql($LIST)) {
                            setter_methods = cons(listS(DEFINE, setter, $list29, list(CHECK_TYPE, OBJECT, predicate), listS(SET_NTH, index, $list29), $list32), setter_methods);
                        }

                } else {
                    cdestructuring_bind_error(datum_$1, $list24);
                }
                cdolist_list_var = cdolist_list_var.rest();
                getter_setter_pair = cdolist_list_var.first();
            } 
            return listS(PROGN, predicate_method, constructor_method, append(nreverse(getter_methods), nreverse(setter_methods), list(list(IDENTITY, list(QUOTE, name)))));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("SLOTS"));

    static private final SubLString $str_alt3$A_simplified_version_of_DEFSTRUCT = makeString("A simplified version of DEFSTRUCT that just creates and manipulates vector objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");

    static private final SubLString $str_alt6$A_simplified_version_of_DEFSTRUCT = makeString("A simplified version of DEFSTRUCT that just creates and manipulates list objects.\n   NAME is a symbol (such as FOO) used to generate 4 classes of methods :\n   (1) a constructor MAKE-FOO (&optional arglist)\n   (2) a predicate FOO-P (object)\n   (3) for each SLOT in SLOTS, a getter of the form FOO-SLOT (object)\n   (4) for each SLOT in SLOTS, a setter of the form SET-FOO-SLOT (object value)");

    public static final SubLObject defstruct_sequence_data_alt(SubLObject name, SubLObject v_slots) {
        {
            SubLObject predicate = intern(cconcatenate(format_nil.format_nil_a_no_copy(name), $str_alt35$_P), $cyc_package$.getGlobalValue());
            SubLObject constructor = intern(cconcatenate($str_alt36$MAKE_, format_nil.format_nil_a_no_copy(name)), $cyc_package$.getGlobalValue());
            SubLObject slot_keys = NIL;
            SubLObject getter_setter_pairs = NIL;
            SubLObject cdolist_list_var = v_slots;
            SubLObject slot = NIL;
            for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot = cdolist_list_var.first()) {
                {
                    SubLObject slot_key = make_keyword(slot);
                    SubLObject getter = intern(cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str_alt37$_, format_nil.format_nil_a_no_copy(slot) }), $cyc_package$.getGlobalValue());
                    SubLObject setter = intern(cconcatenate($str_alt38$SET_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt37$_, format_nil.format_nil_a_no_copy(slot) }), $cyc_package$.getGlobalValue());
                    slot_keys = cons(slot_key, slot_keys);
                    getter_setter_pairs = cons(list(getter, setter), getter_setter_pairs);
                }
            }
            return list(predicate, constructor, nreverse(slot_keys), nreverse(getter_setter_pairs));
        }
    }

    public static SubLObject defstruct_sequence_data(final SubLObject name, final SubLObject v_slots) {
        final SubLObject predicate = intern(cconcatenate(format_nil.format_nil_a_no_copy(name), $str35$_P), $cyc_package$.getGlobalValue());
        final SubLObject constructor = intern(cconcatenate($str36$MAKE_, format_nil.format_nil_a_no_copy(name)), $cyc_package$.getGlobalValue());
        SubLObject slot_keys = NIL;
        SubLObject getter_setter_pairs = NIL;
        SubLObject cdolist_list_var = v_slots;
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject slot_key = make_keyword(slot);
            final SubLObject getter = intern(cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str37$_, format_nil.format_nil_a_no_copy(slot) }), $cyc_package$.getGlobalValue());
            final SubLObject setter = intern(cconcatenate($str38$SET_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str37$_, format_nil.format_nil_a_no_copy(slot) }), $cyc_package$.getGlobalValue());
            slot_keys = cons(slot_key, slot_keys);
            getter_setter_pairs = cons(list(getter, setter), getter_setter_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        return list(predicate, constructor, nreverse(slot_keys), nreverse(getter_setter_pairs));
    }

    static private final SubLList $list_alt9 = list(makeSymbol("PREDICATE"), makeSymbol("CONSTRUCTOR"), makeSymbol("SLOT-KEYS"), makeSymbol("GETTER-SETTER-PAIRS"));

    static private final SubLList $list_alt11 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt14 = list(makeSymbol("VECTORP"), makeSymbol("OBJECT"));

    static private final SubLList $list_alt16 = list(list(makeSymbol("LENGTH"), makeSymbol("OBJECT")));

    static private final SubLList $list_alt18 = list(list(makeSymbol("AREF"), makeSymbol("OBJECT"), ZERO_INTEGER));

    static private final SubLList $list_alt19 = list(makeSymbol("CONSP"), makeSymbol("OBJECT"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("CAR"), makeSymbol("OBJECT")));

    static private final SubLList $list_alt21 = list(makeSymbol("PROPER-LIST-P"), makeSymbol("OBJECT"));

    public static SubLObject declare_defstruct_sequence_file() {
        declareMacro("defstruct_vector", "DEFSTRUCT-VECTOR");
        declareMacro("defstruct_list", "DEFSTRUCT-LIST");
        declareFunction("defstruct_vector_constructor", "DEFSTRUCT-VECTOR-CONSTRUCTOR", 4, 0, false);
        declareFunction("defstruct_list_constructor", "DEFSTRUCT-LIST-CONSTRUCTOR", 4, 0, false);
        declareFunction("defstruct_sequence_internal", "DEFSTRUCT-SEQUENCE-INTERNAL", 3, 0, false);
        declareFunction("defstruct_sequence_data", "DEFSTRUCT-SEQUENCE-DATA", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt22 = list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST"));

    static private final SubLList $list_alt23 = list(makeSymbol("ARGLIST"));

    static private final SubLList $list_alt24 = list(makeSymbol("GETTER"), makeSymbol("SETTER"));

    static private final SubLList $list_alt29 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));

    static private final SubLList $list_alt31 = list(makeSymbol("VALUE"));

    static private final SubLList $list_alt32 = list(list(RET, makeSymbol("OBJECT")));

    public static SubLObject init_defstruct_sequence_file() {
        return NIL;
    }

    static private final SubLString $str_alt35$_P = makeString("-P");

    static private final SubLString $str_alt36$MAKE_ = makeString("MAKE-");

    public static final SubLObject setup_defstruct_sequence_file_alt() {
        register_cyc_api_macro(DEFSTRUCT_VECTOR, $list_alt0, $str_alt3$A_simplified_version_of_DEFSTRUCT);
        register_cyc_api_macro(DEFSTRUCT_LIST, $list_alt0, $str_alt6$A_simplified_version_of_DEFSTRUCT);
        register_external_symbol(DEFSTRUCT_VECTOR_CONSTRUCTOR);
        register_macro_helper(DEFSTRUCT_VECTOR_CONSTRUCTOR, DEFSTRUCT_VECTOR);
        register_external_symbol(DEFSTRUCT_LIST_CONSTRUCTOR);
        register_macro_helper(DEFSTRUCT_LIST_CONSTRUCTOR, DEFSTRUCT_LIST);
        define_test_case_table_int(DEFSTRUCT_SEQUENCE_INTERNAL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt47);
        return NIL;
    }

    public static SubLObject setup_defstruct_sequence_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_macro(DEFSTRUCT_VECTOR, $list0, $str3$A_simplified_version_of_DEFSTRUCT);
            register_cyc_api_macro(DEFSTRUCT_LIST, $list0, $str6$A_simplified_version_of_DEFSTRUCT);
            register_external_symbol(DEFSTRUCT_VECTOR_CONSTRUCTOR);
            register_macro_helper(DEFSTRUCT_VECTOR_CONSTRUCTOR, DEFSTRUCT_VECTOR);
            register_external_symbol(DEFSTRUCT_LIST_CONSTRUCTOR);
            register_macro_helper(DEFSTRUCT_LIST_CONSTRUCTOR, DEFSTRUCT_LIST);
            define_test_case_table_int(DEFSTRUCT_SEQUENCE_INTERNAL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list46);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(DEFSTRUCT_SEQUENCE_INTERNAL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt47);
        }
        return NIL;
    }

    public static SubLObject setup_defstruct_sequence_file_Previous() {
        register_cyc_api_macro(DEFSTRUCT_VECTOR, $list0, $str3$A_simplified_version_of_DEFSTRUCT);
        register_cyc_api_macro(DEFSTRUCT_LIST, $list0, $str6$A_simplified_version_of_DEFSTRUCT);
        register_external_symbol(DEFSTRUCT_VECTOR_CONSTRUCTOR);
        register_macro_helper(DEFSTRUCT_VECTOR_CONSTRUCTOR, DEFSTRUCT_VECTOR);
        register_external_symbol(DEFSTRUCT_LIST_CONSTRUCTOR);
        register_macro_helper(DEFSTRUCT_LIST_CONSTRUCTOR, DEFSTRUCT_LIST);
        define_test_case_table_int(DEFSTRUCT_SEQUENCE_INTERNAL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list46);
        return NIL;
    }

    static private final SubLString $str_alt37$_ = makeString("-");

    static private final SubLString $str_alt38$SET_ = makeString("SET-");

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt47 = list(list(list(makeKeyword("VECTOR"), makeSymbol("KMG"), list(makeSymbol("ONE"), makeSymbol("TWO"))), list(makeSymbol("PROGN"), list(makeSymbol("DEFINE"), makeSymbol("KMG-P"), list(makeSymbol("OBJECT")), list(RET, list(makeSymbol("CAND"), list(makeSymbol("VECTORP"), makeSymbol("OBJECT")), list(makeSymbol("="), THREE_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("OBJECT"))), list(EQ, list(QUOTE, makeSymbol("KMG")), list(makeSymbol("AREF"), makeSymbol("OBJECT"), ZERO_INTEGER))))), list(makeSymbol("DEFINE"), makeSymbol("MAKE-KMG"), list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST")), list(RET, list(makeSymbol("DEFSTRUCT-VECTOR-CONSTRUCTOR"), list(QUOTE, makeSymbol("KMG")), THREE_INTEGER, list(QUOTE, list(makeKeyword("ONE"), makeKeyword("TWO"))), makeSymbol("ARGLIST")))), list(makeSymbol("DEFINE"), makeSymbol("KMG-ONE"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("AREF"), makeSymbol("OBJECT"), ONE_INTEGER))), list(makeSymbol("DEFINE"), makeSymbol("KMG-TWO"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("AREF"), makeSymbol("OBJECT"), TWO_INTEGER))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-ONE"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-AREF"), makeSymbol("OBJECT"), ONE_INTEGER, makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-TWO"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-AREF"), makeSymbol("OBJECT"), TWO_INTEGER, makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(IDENTITY, list(QUOTE, makeSymbol("KMG"))))), list(list($LIST, makeSymbol("KMG"), list(makeSymbol("ONE"), makeSymbol("TWO"))), list(makeSymbol("PROGN"), list(makeSymbol("DEFINE"), makeSymbol("KMG-P"), list(makeSymbol("OBJECT")), list(RET, list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("OBJECT")), list(EQ, list(QUOTE, makeSymbol("KMG")), list(makeSymbol("CAR"), makeSymbol("OBJECT"))), list(makeSymbol("PROPER-LIST-P"), makeSymbol("OBJECT")), list(makeSymbol("="), THREE_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("OBJECT")))))), list(makeSymbol("DEFINE"), makeSymbol("MAKE-KMG"), list(makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST")), list(RET, list(makeSymbol("DEFSTRUCT-LIST-CONSTRUCTOR"), list(QUOTE, makeSymbol("KMG")), THREE_INTEGER, list(QUOTE, list(makeKeyword("ONE"), makeKeyword("TWO"))), makeSymbol("ARGLIST")))), list(makeSymbol("DEFINE"), makeSymbol("KMG-ONE"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("NTH"), ONE_INTEGER, makeSymbol("OBJECT")))), list(makeSymbol("DEFINE"), makeSymbol("KMG-TWO"), list(makeSymbol("OBJECT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(RET, list(makeSymbol("NTH"), TWO_INTEGER, makeSymbol("OBJECT")))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-ONE"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-NTH"), ONE_INTEGER, makeSymbol("OBJECT"), makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(makeSymbol("DEFINE"), makeSymbol("SET-KMG-TWO"), list(makeSymbol("OBJECT"), makeSymbol("VALUE")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("KMG-P")), list(makeSymbol("SET-NTH"), TWO_INTEGER, makeSymbol("OBJECT"), makeSymbol("VALUE")), list(RET, makeSymbol("OBJECT"))), list(IDENTITY, list(QUOTE, makeSymbol("KMG"))))));

    @Override
    public void declareFunctions() {
        declare_defstruct_sequence_file();
    }

    @Override
    public void initializeVariables() {
        init_defstruct_sequence_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_defstruct_sequence_file();
    }

    static {
    }
}

/**
 * Total time: 174 ms
 */
