/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.$sxhash_bit_limit$;
import static com.cyc.cycjava.cycl.utilities_macros.sxhash_update_state;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integer_decode_float;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logior;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.lognot;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.list_all_packages;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.makeSymbolIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.package_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.symbolIteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.symbolIteratorNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_bignum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_character$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_float$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_string$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_symbol$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_vector$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SXHASH-EXTERNAL
 * source file: /cyc/top/cycl/sxhash-external.lisp
 * created:     2019/07/03 17:37:10
 */
public final class sxhash_external extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sxhash_external();

 public static final String myName = "com.cyc.cycjava.cycl.sxhash_external";


    // defparameter
    // Definitions
    /**
     * The recursion depth of SXHASH-EXTERNAL.
     */
    @LispMethod(comment = "The recursion depth of SXHASH-EXTERNAL.\ndefparameter")
    private static final SubLSymbol $sxhash_external_depth$ = makeSymbol("*SXHASH-EXTERNAL-DEPTH*");

    // defconstant
    /**
     * Recursion depth limit in the sxhash-external computation of a list or vector.
     */
    @LispMethod(comment = "Recursion depth limit in the sxhash-external computation of a list or vector.\ndefconstant")
    private static final SubLSymbol $sxhash_external_maximum_depth$ = makeSymbol("*SXHASH-EXTERNAL-MAXIMUM-DEPTH*");

    // defconstant
    /**
     * Sequence position limit in the sxhash-external computation of a list or
     * vector.
     */
    @LispMethod(comment = "Sequence position limit in the sxhash-external computation of a list or\r\nvector.\ndefconstant\nSequence position limit in the sxhash-external computation of a list or\nvector.")
    private static final SubLSymbol $sxhash_external_maximum_length$ = makeSymbol("*SXHASH-EXTERNAL-MAXIMUM-LENGTH*");

    // defconstant
    /**
     * The number of bits used in the internal integer computations done by
     * sxhash-external.
     */
    @LispMethod(comment = "The number of bits used in the internal integer computations done by\r\nsxhash-external.\ndefconstant\nThe number of bits used in the internal integer computations done by\nsxhash-external.")
    private static final SubLSymbol $sxhash_external_bit_limit$ = makeSymbol("*SXHASH-EXTERNAL-BIT-LIMIT*");

    // defconstant
    // The largest fixnum to allow for sxhash-external computations.
    /**
     * The largest fixnum to allow for sxhash-external computations.
     */
    @LispMethod(comment = "The largest fixnum to allow for sxhash-external computations.\ndefconstant")
    private static final SubLSymbol $sxhash_external_fixnum_limit$ = makeSymbol("*SXHASH-EXTERNAL-FIXNUM-LIMIT*");

    // defconstant
    /**
     * The bits of the internal computation returned as the  sxhash-external
     * value.
     *
     *
     * The bits of the internal computation returned as the final sxhash-external value.
     */
    /**
     * The bits of the internal computation returned as the final sxhash-external value.
     */
    @LispMethod(comment = "The bits of the internal computation returned as the  sxhash-external\r\nvalue.\r\n\r\n\r\nThe bits of the internal computation returned as the final sxhash-external value.\ndefconstant\nThe bits of the internal computation returned as the  sxhash-external\nvalue.\n\n\nThe bits of the internal computation returned as the final sxhash-external value.")
    private static final SubLSymbol $sxhash_external_ensure_fixnum_bytespec$ = makeSymbol("*SXHASH-EXTERNAL-ENSURE-FIXNUM-BYTESPEC*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $sxhash_external_method_table$ = makeSymbol("*SXHASH-EXTERNAL-METHOD-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("HASH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(list(makeSymbol("*SXHASH-EXTERNAL-DEPTH*"), list(makeSymbol("+"), makeSymbol("*SXHASH-EXTERNAL-DEPTH*"), ONE_INTEGER)), list(makeSymbol("_SXHASH-EXTERNAL-STATE"), FOUR_INTEGER));

    static private final SubLList $list4 = list(ZERO_INTEGER);

    static private final SubLList $list5 = list(makeSymbol("HASH"), makeSymbol("VALUE"));

    static private final SubLList $list7 = list(makeSymbol("CSETQ"), makeSymbol("_SXHASH-EXTERNAL-STATE"), list(makeSymbol("SXHASH-EXTERNAL-UPDATE-STATE"), makeSymbol("_SXHASH-EXTERNAL-STATE")));

    private static final SubLSymbol SXHASH_EXTERNAL_UPDATE_HASH = makeSymbol("SXHASH-EXTERNAL-UPDATE-HASH");

    public static final SubLSymbol _SXHASH_EXTERNAL_STATE = makeSymbol("_SXHASH-EXTERNAL-STATE");

    private static final SubLList $list10 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-ROT"), makeSymbol("SXHASH-EXTERNAL-UPDATE-STATE"), makeSymbol("SXHASH-EXTERNAL-UPDATE-HASH"));

    private static final SubLList $list12 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-INTEGER"), makeSymbol("SXHASH-EXTERNAL-FLOAT"), makeSymbol("SXHASH-EXTERNAL-CHARACTER"), makeSymbol("SXHASH-EXTERNAL-STRING"), makeSymbol("SXHASH-EXTERNAL-PACKAGE"), makeSymbol("SXHASH-EXTERNAL-SYMBOL"), makeSymbol("SXHASH-EXTERNAL-GUID"));

    private static final SubLSymbol SXHASH_EXTERNAL_INTEGER_METHOD = makeSymbol("SXHASH-EXTERNAL-INTEGER-METHOD");

    private static final SubLInteger $int$89 = makeInteger(89);

    private static final SubLSymbol SXHASH_EXTERNAL_FLOAT_METHOD = makeSymbol("SXHASH-EXTERNAL-FLOAT-METHOD");

    private static final SubLInteger $int$223 = makeInteger(223);

    private static final SubLSymbol SXHASH_EXTERNAL_CHARACTER_METHOD = makeSymbol("SXHASH-EXTERNAL-CHARACTER-METHOD");

    private static final SubLInteger $int$131 = makeInteger(131);

    private static final SubLSymbol SXHASH_EXTERNAL_STRING_METHOD = makeSymbol("SXHASH-EXTERNAL-STRING-METHOD");

    private static final SubLInteger $int$229 = makeInteger(229);

    private static final SubLSymbol SXHASH_EXTERNAL_PACKAGE_METHOD = makeSymbol("SXHASH-EXTERNAL-PACKAGE-METHOD");

    private static final SubLInteger $int$263 = makeInteger(263);

    private static final SubLSymbol SXHASH_EXTERNAL_SYMBOL_METHOD = makeSymbol("SXHASH-EXTERNAL-SYMBOL-METHOD");

    private static final SubLSymbol SXHASH_EXTERNAL_GUID_METHOD = makeSymbol("SXHASH-EXTERNAL-GUID-METHOD");

    private static final SubLList $list27 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-CONS"), makeSymbol("SXHASH-EXTERNAL-VECTOR"));

    private static final SubLInteger $int$167 = makeInteger(167);

    private static final SubLSymbol SXHASH_EXTERNAL_CONS_METHOD = makeSymbol("SXHASH-EXTERNAL-CONS-METHOD");

    private static final SubLInteger $int$199 = makeInteger(199);

    private static final SubLSymbol SXHASH_EXTERNAL_VECTOR_METHOD = makeSymbol("SXHASH-EXTERNAL-VECTOR-METHOD");

    private static final SubLObject $ic32 = vector(new SubLObject[]{ SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER });



    public static final SubLObject sxhash_external_fixnump_alt(SubLObject integer) {
        return numLE(integer, $sxhash_external_ensure_fixnum_bytespec$.getGlobalValue());
    }

    public static SubLObject sxhash_external_fixnump(final SubLObject integer) {
        return numLE(integer, $sxhash_external_fixnum_limit$.getGlobalValue());
    }

    /**
     * Return a fixnum constructed from the least significant bits of INTEGER.
     */
    @LispMethod(comment = "Return a fixnum constructed from the least significant bits of INTEGER.")
    public static final SubLObject sxhash_external_ensure_fixnum_alt(SubLObject integer) {
        if (NIL != com.cyc.cycjava.cycl.sxhash_external.sxhash_external_fixnump(integer)) {
            return integer;
        } else {
            return bytes.ldb($sxhash_external_ensure_fixnum_bytespec$.getGlobalValue(), integer);
        }
    }

    /**
     * Return a fixnum constructed from the least significant bits of INTEGER.
     */
    @LispMethod(comment = "Return a fixnum constructed from the least significant bits of INTEGER.")
    public static SubLObject sxhash_external_ensure_fixnum(final SubLObject integer) {
        if (integer.isNegative()) {
            return sxhash_external_ensure_fixnum(abs(integer));
        }
        if (NIL != sxhash_external_fixnump(integer)) {
            return integer;
        }
        return bytes.ldb($sxhash_external_ensure_fixnum_bytespec$.getGlobalValue(), integer);
    }

    /**
     * Initialize a variable HASH on which a composite hash code is accumulated in BODY.
     */
    @LispMethod(comment = "Initialize a variable HASH on which a composite hash code is accumulated in BODY.")
    public static final SubLObject compute_sxhash_external_composite_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hash = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    hash = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt2, listS(CSETQ, hash, $list_alt4), append(body, NIL));
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
     * Initialize a variable HASH on which a composite hash code is accumulated in BODY.
     */
    @LispMethod(comment = "Initialize a variable HASH on which a composite hash code is accumulated in BODY.")
    public static SubLObject compute_sxhash_external_composite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hash = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        hash = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list2, listS(CSETQ, hash, $list4), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Merge VALUE into the variable HASH which stores a composite hash code.
     */
    @LispMethod(comment = "Merge VALUE into the variable HASH which stores a composite hash code.")
    public static final SubLObject sxhash_external_composite_update_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject hash = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            hash = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, $list_alt7, list(CSETQ, hash, list(SXHASH_EXTERNAL_UPDATE_HASH, hash, _SXHASH_EXTERNAL_STATE, value)));
            } else {
                cdestructuring_bind_error(datum, $list_alt5);
            }
        }
        return NIL;
    }

    /**
     * Merge VALUE into the variable HASH which stores a composite hash code.
     */
    @LispMethod(comment = "Merge VALUE into the variable HASH which stores a composite hash code.")
    public static SubLObject sxhash_external_composite_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject hash = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        hash = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, $list7, list(CSETQ, hash, list(SXHASH_EXTERNAL_UPDATE_HASH, hash, _SXHASH_EXTERNAL_STATE, value)));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    /**
     * Rotate the highest HIGH-BITS number of bits of FIXNUM around to the low-bits.
     */
    @LispMethod(comment = "Rotate the highest HIGH-BITS number of bits of FIXNUM around to the low-bits.")
    public static final SubLObject sxhash_external_rot_alt(SubLObject fixnum, SubLObject high_bits) {
        if (high_bits.numGE($sxhash_external_bit_limit$.getGlobalValue())) {
            return fixnum;
        } else {
            {
                SubLObject rest_bits = subtract($sxhash_external_bit_limit$.getGlobalValue(), high_bits);
                SubLObject high_fixnum = ash(fixnum, minus(rest_bits));
                SubLObject low_mask = lognot(ash(MINUS_ONE_INTEGER, rest_bits));
                SubLObject low_fixnum = logand(fixnum, low_mask);
                SubLObject low_rotated = ash(low_fixnum, high_bits);
                SubLObject result = logior(high_fixnum, low_rotated);
                return result;
            }
        }
    }

    /**
     * Rotate the highest HIGH-BITS number of bits of FIXNUM around to the low-bits.
     */
    @LispMethod(comment = "Rotate the highest HIGH-BITS number of bits of FIXNUM around to the low-bits.")
    public static SubLObject sxhash_external_rot(final SubLObject fixnum, final SubLObject high_bits) {
        if (high_bits.numGE($sxhash_external_bit_limit$.getGlobalValue())) {
            return fixnum;
        }
        final SubLObject rest_bits = subtract($sxhash_external_bit_limit$.getGlobalValue(), high_bits);
        final SubLObject high_fixnum = ash(fixnum, minus(rest_bits));
        final SubLObject low_mask = lognot(ash(MINUS_ONE_INTEGER, rest_bits));
        final SubLObject low_fixnum = logand(fixnum, low_mask);
        final SubLObject low_rotated = ash(low_fixnum, high_bits);
        final SubLObject result = logior(high_fixnum, low_rotated);
        return result;
    }

    /**
     * Update the composite hash STATE
     */
    @LispMethod(comment = "Update the composite hash STATE")
    public static final SubLObject sxhash_external_update_state_alt(SubLObject state) {
        return sxhash_update_state(state);
    }

    /**
     * Update the composite hash STATE
     */
    @LispMethod(comment = "Update the composite hash STATE")
    public static SubLObject sxhash_external_update_state(final SubLObject state) {
        return sxhash_update_state(state);
    }

    /**
     * Update the hash code HASH using STATE and a hew hash VALUE.
     */
    @LispMethod(comment = "Update the hash code HASH using STATE and a hew hash VALUE.")
    public static final SubLObject sxhash_external_update_hash_alt(SubLObject hash, SubLObject state, SubLObject value) {
        return logxor(com.cyc.cycjava.cycl.sxhash_external.sxhash_external_rot(value, state), hash);
    }

    /**
     * Update the hash code HASH using STATE and a hew hash VALUE.
     */
    @LispMethod(comment = "Update the hash code HASH using STATE and a hew hash VALUE.")
    public static SubLObject sxhash_external_update_hash(final SubLObject hash, final SubLObject state, final SubLObject value) {
        return logxor(sxhash_external_rot(value, state), hash);
    }

    public static final SubLObject sxhash_external_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $sxhash_external_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return ZERO_INTEGER;
        }
    }

    public static SubLObject sxhash_external(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $sxhash_external_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject sxhash_external_integer_alt(SubLObject integer) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_ensure_fixnum(integer);
    }

    public static SubLObject sxhash_external_integer(final SubLObject integer) {
        return sxhash_external_ensure_fixnum(integer);
    }

    public static final SubLObject sxhash_external_integer_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_integer(v_object);
    }

    public static SubLObject sxhash_external_integer_method(final SubLObject v_object) {
        return sxhash_external_integer(v_object);
    }

    public static final SubLObject sxhash_external_float_alt(SubLObject v_float) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = NIL;
                {
                    SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                    try {
                        $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject _sxhash_external_state = FOUR_INTEGER;
                            hash = ZERO_INTEGER;
                            hash = $int$89;
                            thread.resetMultipleValues();
                            {
                                SubLObject signif = integer_decode_float(v_float);
                                SubLObject exp = thread.secondMultipleValue();
                                SubLObject sign = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, com.cyc.cycjava.cycl.sxhash_external.sxhash_external(signif));
                                _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                exp = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(exp, _sxhash_external_state, com.cyc.cycjava.cycl.sxhash_external.sxhash_external(signif));
                                _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                sign = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(sign, _sxhash_external_state, com.cyc.cycjava.cycl.sxhash_external.sxhash_external(signif));
                            }
                        }
                    } finally {
                        $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_float(final SubLObject v_float) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = NIL;
        final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
        try {
            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            SubLObject _sxhash_external_state = FOUR_INTEGER;
            hash = ZERO_INTEGER;
            hash = $int$89;
            thread.resetMultipleValues();
            final SubLObject signif = integer_decode_float(v_float);
            final SubLObject exp = thread.secondMultipleValue();
            final SubLObject sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
            hash = sxhash_external_update_hash(hash, _sxhash_external_state, sxhash_external(signif));
            _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
            hash = sxhash_external_update_hash(hash, _sxhash_external_state, sxhash_external(exp));
            _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
            hash = sxhash_external_update_hash(hash, _sxhash_external_state, sxhash_external(sign));
        } finally {
            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
        }
        return hash;
    }

    public static final SubLObject sxhash_external_float_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_float(v_object);
    }

    public static SubLObject sxhash_external_float_method(final SubLObject v_object) {
        return sxhash_external_float(v_object);
    }

    public static final SubLObject sxhash_external_character_alt(SubLObject character) {
        return logand(char_code(character), $int$223);
    }

    public static SubLObject sxhash_external_character(final SubLObject character) {
        return logand(char_code(character), $int$223);
    }

    public static final SubLObject sxhash_external_character_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_character(v_object);
    }

    public static SubLObject sxhash_external_character_method(final SubLObject v_object) {
        return sxhash_external_character(v_object);
    }

    public static final SubLObject sxhash_external_string_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = NIL;
                {
                    SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                    try {
                        $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject _sxhash_external_state = FOUR_INTEGER;
                            hash = ZERO_INTEGER;
                            hash = $int$131;
                            {
                                SubLObject total = length(string);
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                                    {
                                        SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_character(Strings.sublisp_char(string, i));
                                        _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                        hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                    }
                                }
                            }
                        }
                    } finally {
                        $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = NIL;
        final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
        try {
            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            SubLObject _sxhash_external_state = FOUR_INTEGER;
            hash = ZERO_INTEGER;
            hash = $int$131;
            SubLObject total;
            SubLObject i;
            SubLObject subhash;
            for (total = length(string), i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                subhash = sxhash_external_character(Strings.sublisp_char(string, i));
                _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
            }
        } finally {
            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
        }
        return hash;
    }

    public static final SubLObject sxhash_external_string_new_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = NIL;
                {
                    SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                    try {
                        $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject _sxhash_external_state = FOUR_INTEGER;
                            hash = ZERO_INTEGER;
                            hash = $int$131;
                            {
                                SubLObject length = length(string);
                                {
                                    SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_ensure_fixnum(length);
                                    _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                    hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                }
                                {
                                    SubLObject range_marker = $int$32;
                                    SubLObject step = ONE_INTEGER;
                                    SubLObject index = ZERO_INTEGER;
                                    while (index.numL(length)) {
                                        {
                                            SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_character(Strings.sublisp_char(string, index));
                                            _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                            hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                        }
                                        if (index.numG(range_marker)) {
                                            step = add(step, step);
                                            if (step.numG($int$32)) {
                                                index = length;
                                            } else {
                                                range_marker = range_marker;
                                            }
                                        }
                                        index = add(index, step);
                                    } 
                                }
                            }
                        }
                    } finally {
                        $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_string_new(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = NIL;
        final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
        try {
            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            SubLObject _sxhash_external_state = FOUR_INTEGER;
            hash = ZERO_INTEGER;
            hash = $int$131;
            final SubLObject length = length(string);
            final SubLObject subhash = sxhash_external_ensure_fixnum(length);
            _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
            hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
            SubLObject range_marker = $int$32;
            for (SubLObject step = ONE_INTEGER, index = ZERO_INTEGER; index.numL(length); index = add(index, step)) {
                final SubLObject subhash2 = sxhash_external_character(Strings.sublisp_char(string, index));
                _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash2);
                if (index.numG(range_marker)) {
                    step = add(step, step);
                    if (step.numG($int$32)) {
                        index = length;
                    } else {
                        // range_marker = range_marker;
                    }
                }
            }
        } finally {
            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
        }
        return hash;
    }

    public static final SubLObject sxhash_external_string_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_string(v_object);
    }

    public static SubLObject sxhash_external_string_method(final SubLObject v_object) {
        return sxhash_external_string(v_object);
    }

    public static final SubLObject sxhash_external_package_alt(SubLObject v_package) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = NIL;
                {
                    SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                    try {
                        $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject _sxhash_external_state = FOUR_INTEGER;
                            hash = ZERO_INTEGER;
                            hash = $int$229;
                            {
                                SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_string(package_name(v_package));
                                _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                            }
                        }
                    } finally {
                        $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_package(final SubLObject v_package) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = NIL;
        final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
        try {
            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            SubLObject _sxhash_external_state = FOUR_INTEGER;
            hash = ZERO_INTEGER;
            hash = $int$229;
            final SubLObject subhash = sxhash_external_string(package_name(v_package));
            _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
            hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
        } finally {
            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
        }
        return hash;
    }

    public static final SubLObject sxhash_external_package_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_package(v_object);
    }

    public static SubLObject sxhash_external_package_method(final SubLObject v_object) {
        return sxhash_external_package(v_object);
    }

    public static final SubLObject sxhash_external_symbol_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = get(symbol, $SXHASH_EXTERNAL, UNPROVIDED);
                if (NIL == hash) {
                    {
                        SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                        try {
                            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                            {
                                SubLObject _sxhash_external_state = FOUR_INTEGER;
                                hash = ZERO_INTEGER;
                                hash = $int$263;
                                {
                                    SubLObject v_package = symbol_package(symbol);
                                    if (NIL != v_package) {
                                        {
                                            SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_package(v_package);
                                            _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                            hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                        }
                                    }
                                }
                                {
                                    SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_string(symbol_name(symbol));
                                    _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                    hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                }
                            }
                        } finally {
                            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                        }
                    }
                    put(symbol, $SXHASH_EXTERNAL, hash);
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_symbol(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = get(symbol, $SXHASH_EXTERNAL, UNPROVIDED);
        if (NIL == hash) {
            final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
            try {
                $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                SubLObject _sxhash_external_state = FOUR_INTEGER;
                hash = ZERO_INTEGER;
                hash = $int$263;
                final SubLObject v_package = symbol_package(symbol);
                if (NIL != v_package) {
                    final SubLObject subhash = sxhash_external_package(v_package);
                    _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                    hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                }
                final SubLObject subhash2 = sxhash_external_string(symbol_name(symbol));
                _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash2);
            } finally {
                $sxhash_external_depth$.rebind(_prev_bind_0, thread);
            }
            put(symbol, $SXHASH_EXTERNAL, hash);
        }
        return hash;
    }

    /**
     * Utility for forgetting any currently cached sxhash codes.
     */
    @LispMethod(comment = "Utility for forgetting any currently cached sxhash codes.")
    public static final SubLObject clear_cached_symbol_sxhash_external_codes_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = list_all_packages();
            SubLObject v_package = NIL;
            for (v_package = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_package = cdolist_list_var.first()) {
                {
                    SubLObject cdo_symbols_package = v_package;
                    SubLObject cdo_symbols_iterator = NIL;
                    SubLObject symbol = NIL;
                    {
                        final Iterator cdo_symbols_iterator_1 = makeSymbolIterator(cdo_symbols_package);
                        while (symbolIteratorHasNext(cdo_symbols_iterator_1)) {
                            symbol = symbolIteratorNext(cdo_symbols_iterator_1);
                            if (NIL != get(symbol, $SXHASH_EXTERNAL, UNPROVIDED)) {
                                total = add(total, ONE_INTEGER);
                                remprop(symbol, $SXHASH_EXTERNAL);
                            }
                        } 
                    }
                }
            }
            return total;
        }
    }

    @LispMethod(comment = "Utility for forgetting any currently cached sxhash codes.")
    public static SubLObject clear_cached_symbol_sxhash_external_codes() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = list_all_packages();
        SubLObject v_package = NIL;
        v_package = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cdo_symbols_package = v_package;
            final SubLObject cdo_symbols_iterator = NIL;
            SubLObject symbol = NIL;
            final Iterator cdo_symbols_iterator_$1 = makeSymbolIterator(cdo_symbols_package);
            while (symbolIteratorHasNext(cdo_symbols_iterator_$1)) {
                symbol = symbolIteratorNext(cdo_symbols_iterator_$1);
                if (NIL != get(symbol, $SXHASH_EXTERNAL, UNPROVIDED)) {
                    total = add(total, ONE_INTEGER);
                    remprop(symbol, $SXHASH_EXTERNAL);
                }
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_package = cdolist_list_var.first();
        } 
        return total;
    }

    /**
     * Compute & cache all sxhash codes for all known symbols.
     */
    @LispMethod(comment = "Compute & cache all sxhash codes for all known symbols.")
    public static final SubLObject cache_all_symbol_sxhash_external_codes_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = list_all_packages();
            SubLObject v_package = NIL;
            for (v_package = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_package = cdolist_list_var.first()) {
                {
                    SubLObject cdo_symbols_package = v_package;
                    SubLObject cdo_symbols_iterator = NIL;
                    SubLObject symbol = NIL;
                    {
                        final Iterator cdo_symbols_iterator_2 = makeSymbolIterator(cdo_symbols_package);
                        while (symbolIteratorHasNext(cdo_symbols_iterator_2)) {
                            symbol = symbolIteratorNext(cdo_symbols_iterator_2);
                            if (NIL == get(symbol, $SXHASH_EXTERNAL, UNPROVIDED)) {
                                total = add(total, ONE_INTEGER);
                                com.cyc.cycjava.cycl.sxhash_external.sxhash_external(symbol);
                            }
                        } 
                    }
                }
            }
            return total;
        }
    }

    @LispMethod(comment = "Compute & cache all sxhash codes for all known symbols.")
    public static SubLObject cache_all_symbol_sxhash_external_codes() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = list_all_packages();
        SubLObject v_package = NIL;
        v_package = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cdo_symbols_package = v_package;
            final SubLObject cdo_symbols_iterator = NIL;
            SubLObject symbol = NIL;
            final Iterator cdo_symbols_iterator_$2 = makeSymbolIterator(cdo_symbols_package);
            while (symbolIteratorHasNext(cdo_symbols_iterator_$2)) {
                symbol = symbolIteratorNext(cdo_symbols_iterator_$2);
                if (NIL == get(symbol, $SXHASH_EXTERNAL, UNPROVIDED)) {
                    total = add(total, ONE_INTEGER);
                    sxhash_external(symbol);
                }
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_package = cdolist_list_var.first();
        } 
        return total;
    }

    public static final SubLObject sxhash_external_symbol_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_symbol(v_object);
    }

    public static SubLObject sxhash_external_symbol_method(final SubLObject v_object) {
        return sxhash_external_symbol(v_object);
    }

    public static final SubLObject sxhash_external_guid_alt(SubLObject guid) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external(Guids.guid_to_string(guid));
    }

    public static SubLObject sxhash_external_guid(final SubLObject guid) {
        return sxhash_external(Guids.guid_to_string(guid));
    }

    public static final SubLObject sxhash_external_guid_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_guid(v_object);
    }

    public static SubLObject sxhash_external_guid_method(final SubLObject v_object) {
        return sxhash_external_guid(v_object);
    }

    public static final SubLObject sxhash_external_cons_alt(SubLObject cons) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = NIL;
                {
                    SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                    try {
                        $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject _sxhash_external_state = FOUR_INTEGER;
                            hash = ZERO_INTEGER;
                            hash = $int$167;
                            if (!$sxhash_external_depth$.getDynamicValue(thread).numG($sxhash_external_maximum_depth$.getGlobalValue())) {
                                {
                                    SubLObject tail = NIL;
                                    SubLObject i = NIL;
                                    for (tail = cons, i = ZERO_INTEGER; !(i.numGE($sxhash_external_maximum_length$.getGlobalValue()) || tail.isAtom()); tail = tail.rest() , i = add(i, ONE_INTEGER)) {
                                        {
                                            SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external(tail.first());
                                            _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                            hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                        }
                                    }
                                    if (!i.numGE($sxhash_external_maximum_length$.getGlobalValue())) {
                                        if (NIL != tail) {
                                            {
                                                SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external(tail);
                                                _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                                hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_cons(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = NIL;
        final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
        try {
            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            SubLObject _sxhash_external_state = FOUR_INTEGER;
            hash = ZERO_INTEGER;
            hash = $int$167;
            if (!$sxhash_external_depth$.getDynamicValue(thread).numG($sxhash_external_maximum_depth$.getGlobalValue())) {
                SubLObject tail;
                SubLObject i;
                SubLObject subhash;
                for (tail = NIL, i = NIL, tail = cons, i = ZERO_INTEGER; (!i.numGE($sxhash_external_maximum_length$.getGlobalValue())) && (!tail.isAtom()); tail = tail.rest() , i = add(i, ONE_INTEGER)) {
                    subhash = sxhash_external(tail.first());
                    _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                    hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                }
                if ((!i.numGE($sxhash_external_maximum_length$.getGlobalValue())) && (NIL != tail)) {
                    subhash = sxhash_external(tail);
                    _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                    hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                }
            }
        } finally {
            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
        }
        return hash;
    }

    public static final SubLObject sxhash_external_cons_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_cons(v_object);
    }

    public static SubLObject sxhash_external_cons_method(final SubLObject v_object) {
        return sxhash_external_cons(v_object);
    }

    public static final SubLObject sxhash_external_vector_alt(SubLObject vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = NIL;
                {
                    SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
                    try {
                        $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                        {
                            SubLObject _sxhash_external_state = FOUR_INTEGER;
                            hash = ZERO_INTEGER;
                            hash = $int$199;
                            if (!$sxhash_external_depth$.getDynamicValue(thread).numG($sxhash_external_maximum_depth$.getGlobalValue())) {
                                {
                                    SubLObject total = min(length(vector), $sxhash_external_maximum_length$.getGlobalValue());
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                                        {
                                            SubLObject subhash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external(aref(vector, i));
                                            _sxhash_external_state = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_state(_sxhash_external_state);
                                            hash = com.cyc.cycjava.cycl.sxhash_external.sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $sxhash_external_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    public static SubLObject sxhash_external_vector(final SubLObject vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hash = NIL;
        final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding(thread);
        try {
            $sxhash_external_depth$.bind(add($sxhash_external_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            SubLObject _sxhash_external_state = FOUR_INTEGER;
            hash = ZERO_INTEGER;
            hash = $int$199;
            if (!$sxhash_external_depth$.getDynamicValue(thread).numG($sxhash_external_maximum_depth$.getGlobalValue())) {
                SubLObject total;
                SubLObject i;
                SubLObject subhash;
                for (total = min(length(vector), $sxhash_external_maximum_length$.getGlobalValue()), i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                    subhash = sxhash_external(aref(vector, i));
                    _sxhash_external_state = sxhash_external_update_state(_sxhash_external_state);
                    hash = sxhash_external_update_hash(hash, _sxhash_external_state, subhash);
                }
            }
        } finally {
            $sxhash_external_depth$.rebind(_prev_bind_0, thread);
        }
        return hash;
    }

    public static final SubLObject sxhash_external_vector_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external.sxhash_external_vector(v_object);
    }

    public static SubLObject sxhash_external_vector_method(final SubLObject v_object) {
        return sxhash_external_vector(v_object);
    }

    public static SubLObject sxhash_external_string_standalone(final SubLObject string) {
        final SubLObject total = length(string);
        final SubLObject state_vector = $ic32;
        SubLObject state = FOUR_INTEGER;
        SubLObject hash = $int$131;
        SubLObject i;
        SubLObject subhash;
        SubLObject fixnum;
        SubLObject high_bits;
        SubLObject bit_limit;
        SubLObject result;
        SubLObject rest_bits;
        SubLObject high_fixnum;
        SubLObject low_mask;
        SubLObject low_fixnum;
        SubLObject low_rotated;
        for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
            subhash = logand(char_code(Strings.sublisp_char(string, i)), $int$223);
            state = aref(state_vector, state);
            fixnum = subhash;
            high_bits = state;
            bit_limit = $int$27;
            result = NIL;
            if (high_bits.numGE(bit_limit)) {
                result = fixnum;
            } else {
                rest_bits = subtract(bit_limit, high_bits);
                high_fixnum = ash(fixnum, minus(rest_bits));
                low_mask = lognot(ash(MINUS_ONE_INTEGER, rest_bits));
                low_fixnum = logand(fixnum, low_mask);
                low_rotated = ash(low_fixnum, high_bits);
                result = logior(high_fixnum, low_rotated);
            }
            hash = logxor(result, hash);
        }
        return hash;
    }

    public static SubLObject declare_sxhash_external_file() {
        declareFunction("sxhash_external_fixnump", "SXHASH-EXTERNAL-FIXNUMP", 1, 0, false);
        declareFunction("sxhash_external_ensure_fixnum", "SXHASH-EXTERNAL-ENSURE-FIXNUM", 1, 0, false);
        declareMacro("compute_sxhash_external_composite", "COMPUTE-SXHASH-EXTERNAL-COMPOSITE");
        declareMacro("sxhash_external_composite_update", "SXHASH-EXTERNAL-COMPOSITE-UPDATE");
        declareFunction("sxhash_external_rot", "SXHASH-EXTERNAL-ROT", 2, 0, false);
        declareFunction("sxhash_external_update_state", "SXHASH-EXTERNAL-UPDATE-STATE", 1, 0, false);
        declareFunction("sxhash_external_update_hash", "SXHASH-EXTERNAL-UPDATE-HASH", 3, 0, false);
        declareFunction("sxhash_external", "SXHASH-EXTERNAL", 1, 0, false);
        declareFunction("sxhash_external_integer", "SXHASH-EXTERNAL-INTEGER", 1, 0, false);
        declareFunction("sxhash_external_integer_method", "SXHASH-EXTERNAL-INTEGER-METHOD", 1, 0, false);
        declareFunction("sxhash_external_float", "SXHASH-EXTERNAL-FLOAT", 1, 0, false);
        declareFunction("sxhash_external_float_method", "SXHASH-EXTERNAL-FLOAT-METHOD", 1, 0, false);
        declareFunction("sxhash_external_character", "SXHASH-EXTERNAL-CHARACTER", 1, 0, false);
        declareFunction("sxhash_external_character_method", "SXHASH-EXTERNAL-CHARACTER-METHOD", 1, 0, false);
        declareFunction("sxhash_external_string", "SXHASH-EXTERNAL-STRING", 1, 0, false);
        declareFunction("sxhash_external_string_new", "SXHASH-EXTERNAL-STRING-NEW", 1, 0, false);
        declareFunction("sxhash_external_string_method", "SXHASH-EXTERNAL-STRING-METHOD", 1, 0, false);
        declareFunction("sxhash_external_package", "SXHASH-EXTERNAL-PACKAGE", 1, 0, false);
        declareFunction("sxhash_external_package_method", "SXHASH-EXTERNAL-PACKAGE-METHOD", 1, 0, false);
        declareFunction("sxhash_external_symbol", "SXHASH-EXTERNAL-SYMBOL", 1, 0, false);
        declareFunction("clear_cached_symbol_sxhash_external_codes", "CLEAR-CACHED-SYMBOL-SXHASH-EXTERNAL-CODES", 0, 0, false);
        declareFunction("cache_all_symbol_sxhash_external_codes", "CACHE-ALL-SYMBOL-SXHASH-EXTERNAL-CODES", 0, 0, false);
        declareFunction("sxhash_external_symbol_method", "SXHASH-EXTERNAL-SYMBOL-METHOD", 1, 0, false);
        declareFunction("sxhash_external_guid", "SXHASH-EXTERNAL-GUID", 1, 0, false);
        declareFunction("sxhash_external_guid_method", "SXHASH-EXTERNAL-GUID-METHOD", 1, 0, false);
        declareFunction("sxhash_external_cons", "SXHASH-EXTERNAL-CONS", 1, 0, false);
        declareFunction("sxhash_external_cons_method", "SXHASH-EXTERNAL-CONS-METHOD", 1, 0, false);
        declareFunction("sxhash_external_vector", "SXHASH-EXTERNAL-VECTOR", 1, 0, false);
        declareFunction("sxhash_external_vector_method", "SXHASH-EXTERNAL-VECTOR-METHOD", 1, 0, false);
        declareFunction("sxhash_external_string_standalone", "SXHASH-EXTERNAL-STRING-STANDALONE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sxhash_external_file() {
        defparameter("*SXHASH-EXTERNAL-DEPTH*", ZERO_INTEGER);
        defconstant("*SXHASH-EXTERNAL-MAXIMUM-DEPTH*", EIGHT_INTEGER);
        defconstant("*SXHASH-EXTERNAL-MAXIMUM-LENGTH*", EIGHT_INTEGER);
        defconstant("*SXHASH-EXTERNAL-BIT-LIMIT*", $sxhash_bit_limit$.getGlobalValue());
        defconstant("*SXHASH-EXTERNAL-FIXNUM-LIMIT*", subtract(expt(TWO_INTEGER, $sxhash_external_bit_limit$.getGlobalValue()), ONE_INTEGER));
        defconstant("*SXHASH-EXTERNAL-ENSURE-FIXNUM-BYTESPEC*", bytes.sublisp_byte($sxhash_external_bit_limit$.getGlobalValue(), ZERO_INTEGER));
        deflexical("*SXHASH-EXTERNAL-METHOD-TABLE*", make_vector($int$256, NIL));
        return NIL;
    }

    public static SubLObject setup_sxhash_external_file() {
        SubLSpecialOperatorDeclarations.proclaim($list10);
        SubLSpecialOperatorDeclarations.proclaim($list12);
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_bignum$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_INTEGER_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_fixnum$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_INTEGER_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_float$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_FLOAT_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_character$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_CHARACTER_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_STRING_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_package$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_PACKAGE_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_SYMBOL_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_GUID_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list27);
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_CONS_METHOD));
        register_method($sxhash_external_method_table$.getGlobalValue(), $dtp_vector$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_VECTOR_METHOD));
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("HASH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list(list(makeSymbol("*SXHASH-EXTERNAL-DEPTH*"), list(makeSymbol("+"), makeSymbol("*SXHASH-EXTERNAL-DEPTH*"), ONE_INTEGER)), list(makeSymbol("_SXHASH-EXTERNAL-STATE"), FOUR_INTEGER));

    @Override
    public void declareFunctions() {
        declare_sxhash_external_file();
    }

    static private final SubLList $list_alt4 = list(ZERO_INTEGER);

    static private final SubLList $list_alt5 = list(makeSymbol("HASH"), makeSymbol("VALUE"));

    @Override
    public void initializeVariables() {
        init_sxhash_external_file();
    }

    static private final SubLList $list_alt7 = list(makeSymbol("CSETQ"), makeSymbol("_SXHASH-EXTERNAL-STATE"), list(makeSymbol("SXHASH-EXTERNAL-UPDATE-STATE"), makeSymbol("_SXHASH-EXTERNAL-STATE")));

    @Override
    public void runTopLevelForms() {
        setup_sxhash_external_file();
    }

    
}

/**
 * Total time: 106 ms
 */
