package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sxhash_external extends SubLTranslatedFile {
    public static final SubLFile me = new sxhash_external();

    public static final String myName = "com.cyc.cycjava.cycl.sxhash_external";

    public static final String myFingerPrint = "61a4a80447ff730f851ceae8803ae61c6c25b83d3873749dc02d1e720724d48b";

    // defparameter
    private static final SubLSymbol $sxhash_external_depth$ = makeSymbol("*SXHASH-EXTERNAL-DEPTH*");

    // defconstant
    private static final SubLSymbol $sxhash_external_maximum_depth$ = makeSymbol("*SXHASH-EXTERNAL-MAXIMUM-DEPTH*");

    // defconstant
    /**
     * Sequence position limit in the sxhash-external computation of a list or
     * vector.
     */
    private static final SubLSymbol $sxhash_external_maximum_length$ = makeSymbol("*SXHASH-EXTERNAL-MAXIMUM-LENGTH*");

    // defconstant
    /**
     * The number of bits used in the internal integer computations done by
     * sxhash-external.
     */
    private static final SubLSymbol $sxhash_external_bit_limit$ = makeSymbol("*SXHASH-EXTERNAL-BIT-LIMIT*");

    // defconstant
    // The largest fixnum to allow for sxhash-external computations.
    private static final SubLSymbol $sxhash_external_fixnum_limit$ = makeSymbol("*SXHASH-EXTERNAL-FIXNUM-LIMIT*");

    // defconstant
    /**
     * The bits of the internal computation returned as the  sxhash-external
     * value.
     */
    private static final SubLSymbol $sxhash_external_ensure_fixnum_bytespec$ = makeSymbol("*SXHASH-EXTERNAL-ENSURE-FIXNUM-BYTESPEC*");

    // deflexical
    public static final SubLSymbol $sxhash_external_method_table$ = makeSymbol("*SXHASH-EXTERNAL-METHOD-TABLE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("HASH")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list2 = list(list(makeSymbol("*SXHASH-EXTERNAL-DEPTH*"), list(makeSymbol("+"), makeSymbol("*SXHASH-EXTERNAL-DEPTH*"), ONE_INTEGER)), list(makeSymbol("_SXHASH-EXTERNAL-STATE"), FOUR_INTEGER));



    public static final SubLList $list4 = list(ZERO_INTEGER);

    public static final SubLList $list5 = list(makeSymbol("HASH"), makeSymbol("VALUE"));



    public static final SubLList $list7 = list(makeSymbol("CSETQ"), makeSymbol("_SXHASH-EXTERNAL-STATE"), list(makeSymbol("SXHASH-EXTERNAL-UPDATE-STATE"), makeSymbol("_SXHASH-EXTERNAL-STATE")));

    public static final SubLSymbol SXHASH_EXTERNAL_UPDATE_HASH = makeSymbol("SXHASH-EXTERNAL-UPDATE-HASH");

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

    private static final SubLInteger $int$27 = makeInteger(27);

    public static SubLObject sxhash_external_fixnump(final SubLObject integer) {
        return numLE(integer, $sxhash_external_fixnum_limit$.getGlobalValue());
    }

    public static SubLObject sxhash_external_ensure_fixnum(final SubLObject integer) {
        if (integer.isNegative()) {
            return sxhash_external_ensure_fixnum(abs(integer));
        }
        if (NIL != sxhash_external_fixnump(integer)) {
            return integer;
        }
        return bytes.ldb($sxhash_external_ensure_fixnum_bytespec$.getGlobalValue(), integer);
    }

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

    public static SubLObject sxhash_external_update_state(final SubLObject state) {
        return sxhash_update_state(state);
    }

    public static SubLObject sxhash_external_update_hash(final SubLObject hash, final SubLObject state, final SubLObject value) {
        return logxor(sxhash_external_rot(value, state), hash);
    }

    public static SubLObject sxhash_external(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $sxhash_external_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject sxhash_external_integer(final SubLObject integer) {
        return sxhash_external_ensure_fixnum(integer);
    }

    public static SubLObject sxhash_external_integer_method(final SubLObject v_object) {
        return sxhash_external_integer(v_object);
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

    public static SubLObject sxhash_external_float_method(final SubLObject v_object) {
        return sxhash_external_float(v_object);
    }

    public static SubLObject sxhash_external_character(final SubLObject character) {
        return logand(char_code(character), $int$223);
    }

    public static SubLObject sxhash_external_character_method(final SubLObject v_object) {
        return sxhash_external_character(v_object);
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

    public static SubLObject sxhash_external_string_method(final SubLObject v_object) {
        return sxhash_external_string(v_object);
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

    public static SubLObject sxhash_external_package_method(final SubLObject v_object) {
        return sxhash_external_package(v_object);
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

    public static SubLObject sxhash_external_symbol_method(final SubLObject v_object) {
        return sxhash_external_symbol(v_object);
    }

    public static SubLObject sxhash_external_guid(final SubLObject guid) {
        return sxhash_external(Guids.guid_to_string(guid));
    }

    public static SubLObject sxhash_external_guid_method(final SubLObject v_object) {
        return sxhash_external_guid(v_object);
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

    public static SubLObject sxhash_external_cons_method(final SubLObject v_object) {
        return sxhash_external_cons(v_object);
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
        declareFunction(me, "sxhash_external_fixnump", "SXHASH-EXTERNAL-FIXNUMP", 1, 0, false);
        declareFunction(me, "sxhash_external_ensure_fixnum", "SXHASH-EXTERNAL-ENSURE-FIXNUM", 1, 0, false);
        declareMacro(me, "compute_sxhash_external_composite", "COMPUTE-SXHASH-EXTERNAL-COMPOSITE");
        declareMacro(me, "sxhash_external_composite_update", "SXHASH-EXTERNAL-COMPOSITE-UPDATE");
        declareFunction(me, "sxhash_external_rot", "SXHASH-EXTERNAL-ROT", 2, 0, false);
        declareFunction(me, "sxhash_external_update_state", "SXHASH-EXTERNAL-UPDATE-STATE", 1, 0, false);
        declareFunction(me, "sxhash_external_update_hash", "SXHASH-EXTERNAL-UPDATE-HASH", 3, 0, false);
        declareFunction(me, "sxhash_external", "SXHASH-EXTERNAL", 1, 0, false);
        declareFunction(me, "sxhash_external_integer", "SXHASH-EXTERNAL-INTEGER", 1, 0, false);
        declareFunction(me, "sxhash_external_integer_method", "SXHASH-EXTERNAL-INTEGER-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_float", "SXHASH-EXTERNAL-FLOAT", 1, 0, false);
        declareFunction(me, "sxhash_external_float_method", "SXHASH-EXTERNAL-FLOAT-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_character", "SXHASH-EXTERNAL-CHARACTER", 1, 0, false);
        declareFunction(me, "sxhash_external_character_method", "SXHASH-EXTERNAL-CHARACTER-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_string", "SXHASH-EXTERNAL-STRING", 1, 0, false);
        declareFunction(me, "sxhash_external_string_new", "SXHASH-EXTERNAL-STRING-NEW", 1, 0, false);
        declareFunction(me, "sxhash_external_string_method", "SXHASH-EXTERNAL-STRING-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_package", "SXHASH-EXTERNAL-PACKAGE", 1, 0, false);
        declareFunction(me, "sxhash_external_package_method", "SXHASH-EXTERNAL-PACKAGE-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_symbol", "SXHASH-EXTERNAL-SYMBOL", 1, 0, false);
        declareFunction(me, "clear_cached_symbol_sxhash_external_codes", "CLEAR-CACHED-SYMBOL-SXHASH-EXTERNAL-CODES", 0, 0, false);
        declareFunction(me, "cache_all_symbol_sxhash_external_codes", "CACHE-ALL-SYMBOL-SXHASH-EXTERNAL-CODES", 0, 0, false);
        declareFunction(me, "sxhash_external_symbol_method", "SXHASH-EXTERNAL-SYMBOL-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_guid", "SXHASH-EXTERNAL-GUID", 1, 0, false);
        declareFunction(me, "sxhash_external_guid_method", "SXHASH-EXTERNAL-GUID-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_cons", "SXHASH-EXTERNAL-CONS", 1, 0, false);
        declareFunction(me, "sxhash_external_cons_method", "SXHASH-EXTERNAL-CONS-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_vector", "SXHASH-EXTERNAL-VECTOR", 1, 0, false);
        declareFunction(me, "sxhash_external_vector_method", "SXHASH-EXTERNAL-VECTOR-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_external_string_standalone", "SXHASH-EXTERNAL-STRING-STANDALONE", 1, 0, false);
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

    @Override
    public void declareFunctions() {
        declare_sxhash_external_file();
    }

    @Override
    public void initializeVariables() {
        init_sxhash_external_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sxhash_external_file();
    }

    
}

/**
 * Total time: 106 ms
 */
