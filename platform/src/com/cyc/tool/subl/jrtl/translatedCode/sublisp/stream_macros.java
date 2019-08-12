/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public class stream_macros extends SubLTranslatedFile {
    public static SubLObject cwith_output_to_string(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream_var = SubLNil.NIL;
        SubLObject result_var = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        stream_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        result_var = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            return list(CLET, list(stream_var), list(CUNWIND_PROTECT, listS(PROGN, listS(CSETQ, stream_var, $list6), append(body, list(list(CSETF, result_var, list(GET_OUTPUT_STREAM_STRING, stream_var))))), list(CLOSE, stream_var)));
        }
        cdestructuring_bind_error(datum, $list2);
        return SubLNil.NIL;
    }

    public static SubLObject declare_stream_macros_file() {
        declareMacro("ensure_private_stream", "ENSURE-PRIVATE-STREAM");
        declareFunction("ensure_private_stream_internal", "ENSURE-PRIVATE-STREAM-INTERNAL", 1, 0, false);
        declareMacro("cwith_output_to_string", "CWITH-OUTPUT-TO-STRING");
        declareMacro("with_input_from_string", "WITH-INPUT-FROM-STRING");
        declareFunction("with_input_from_string_internal", "WITH-INPUT-FROM-STRING-INTERNAL", 6, 0, false);
        declareMacro("with_open_stream", "WITH-OPEN-STREAM");
        declareMacro("with_open_file", "WITH-OPEN-FILE");
        declareMacro("with_bounding_index_designators", "WITH-BOUNDING-INDEX-DESIGNATORS");
        declareMacro("with_stream_lock", "WITH-STREAM-LOCK");
        declareMacro("synonym_stream_p", "SYNONYM-STREAM-P");
        return SubLNil.NIL;
    }

    public static SubLObject ensure_private_stream(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return ensure_private_stream_internal(body);
    }

    public static SubLObject ensure_private_stream_internal(SubLObject body) {
        return listS(CLET, $list1, append(body, SubLNil.NIL));
    }

    public static SubLObject init_stream_macros_file() {
        defvar("*STREAM-REQUIRES-LOCKING*", T);
        return SubLNil.NIL;
    }

    public static SubLObject setup_stream_macros_file() {
        return SubLNil.NIL;
    }

    public static SubLObject synonym_stream_p(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject stream = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        stream = current.first();
        current = current.rest();
        if (SubLNil.NIL == current)
            return listS(EQ, list(STREAM_STREAM_TYPE, stream), $list43);

        cdestructuring_bind_error(datum, $list41);
        return SubLNil.NIL;
    }

    public static SubLObject with_bounding_index_designators(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject sequence = SubLNil.NIL;
        SubLObject start_var = SubLNil.NIL;
        SubLObject end_var = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        sequence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        start_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        end_var = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            SubLObject length = make_symbol($$$LENGTH);
            return listS(CLET, new SubLObject[]{ list(list(length, list(LENGTH, sequence))), list(PUNLESS, start_var, listS(CSETF, start_var, $list28)), list(PUNLESS, end_var, list(CSETF, end_var, length)), list(MUST, listS($sym30$__, start_var, $list28), $str31$Negative_start_index__D_given_for, start_var, sequence), list(MUST, list($sym32$__, end_var, length), $str33$The_end_index__D_given_for__S_is_, end_var, sequence, length), list(MUST, list($sym32$__, start_var, end_var), $str34$The_start_index__D_given_for__S_i, start_var, sequence, end_var), append(body, SubLNil.NIL) });
        }
        cdestructuring_bind_error(datum, $list24);
        return SubLNil.NIL;
    }

    public static SubLObject with_input_from_string(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = SubLNil.NIL;
        SubLObject string = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = SubLNil.NIL;
        SubLObject rest = current;
        SubLObject bad = SubLNil.NIL;
        SubLObject current_$1 = SubLNil.NIL;
        while (SubLNil.NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list10);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list10);
            if (SubLNil.NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED))
                bad = T;

            if (current_$1 == $ALLOW_OTHER_KEYS)
                allow_other_keys_p = rest.first();

            rest = rest.rest();
        } 
        if ((SubLNil.NIL != bad) && (SubLNil.NIL == allow_other_keys_p))
            cdestructuring_bind_error(datum, $list10);

        SubLObject index_tail = property_list_member($INDEX, current);
        SubLObject index = (SubLNil.NIL != index_tail) ? cadr(index_tail) : SubLNil.NIL;
        SubLObject start_tail = property_list_member($START, current);
        SubLObject start = (SubLNil.NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        SubLObject end_tail = property_list_member($END, current);
        SubLObject end = (SubLNil.NIL != end_tail) ? cadr(end_tail) : SubLNil.NIL;
        SubLObject body;
        current = body = temp;
        return with_input_from_string_internal(var, string, index, start, end, body);
    }

    public static SubLObject with_input_from_string_internal(SubLObject var, SubLObject string, SubLObject index, SubLObject start, SubLObject end, SubLObject body) {
        return list(CLET, list(var), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, var, list(MAKE_PRIVATE_STRING_INPUT_STREAM, string, start, end)), append(body, SubLNil.NIL != index ? list(list(CSETF, index, list(STREAM_INPUT_INDEX, var))) : SubLNil.NIL, SubLNil.NIL)), list(CLOSE, var)));
    }

    public static SubLObject with_open_file(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = SubLNil.NIL;
        SubLObject filespec = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        filespec = current.first();
        SubLObject keys;
        current = keys = current.rest();
        SubLObject body;
        current = body = temp;
        return listS(WITH_OPEN_STREAM, list(stream, listS(OPEN, filespec, append(keys, SubLNil.NIL))), append(body, SubLNil.NIL));
    }

    public static SubLObject with_open_stream(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = SubLNil.NIL;
        SubLObject stream = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        stream = current.first();
        current = current.rest();
        if (SubLNil.NIL == current) {
            SubLObject body;
            current = body = temp;
            SubLObject stream_var = make_symbol($str19$STREAM_VAR);
            return list(CLET, list(stream_var), list(CUNWIND_PROTECT, list(PROGN, list(CSETQ, stream_var, stream), listS(CLET, list(list(var, stream_var)), append(body, SubLNil.NIL))), list(PWHEN, stream_var, list(CLOSE, stream_var))));
        }
        cdestructuring_bind_error(datum, $list18);
        return SubLNil.NIL;
    }

    public static SubLObject with_stream_lock(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject stream = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        stream = current.first();
        SubLObject body;
        current = body = current.rest();
        SubLObject lock = make_symbol($str36$LOCK_VAR);
        return list(CLET, list(list(lock, list(STREAM_LOCK, stream))), list(PIF, list(LOCK_P, lock), list(WITH_LOCK_HELD, list(lock), bq_cons(PROGN, append(body, SubLNil.NIL))), bq_cons(PROGN, append(body, SubLNil.NIL))));
    }

    public static final SubLFile me = new stream_macros();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros";

    // defvar
    public static final SubLSymbol $stream_requires_locking$ = makeSymbol("*STREAM-REQUIRES-LOCKING*");



    public static final SubLList $list1 = list(list(makeSymbol("*STREAM-REQUIRES-LOCKING*"), SubLNil.NIL));

    public static final SubLList $list2 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("RESULT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));







    public static final SubLList $list6 = list(list(makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")));







    public static final SubLList $list10 = list(list(makeSymbol("VAR"), makeSymbol("STRING"), makeSymbol("&KEY"), makeSymbol("INDEX"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list11 = list(makeKeyword("INDEX"), makeKeyword("START"), makeKeyword("END"));

    public static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    public static final SubLSymbol MAKE_PRIVATE_STRING_INPUT_STREAM = makeSymbol("MAKE-PRIVATE-STRING-INPUT-STREAM");

    public static final SubLSymbol STREAM_INPUT_INDEX = makeSymbol("STREAM-INPUT-INDEX");

    public static final SubLList $list18 = list(list(makeSymbol("VAR"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $str19$STREAM_VAR = makeString("STREAM-VAR");



    public static final SubLList $list21 = list(list(makeSymbol("STREAM"), makeSymbol("FILESPEC"), makeSymbol("&REST"), makeSymbol("KEYS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol WITH_OPEN_STREAM = makeSymbol("WITH-OPEN-STREAM");

    public static final SubLSymbol OPEN = makeSymbol("OPEN");

    public static final SubLList $list24 = list(list(makeSymbol("SEQUENCE"), makeSymbol("START-VAR"), makeSymbol("END-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$LENGTH = makeString("LENGTH");





    public static final SubLList $list28 = list(ZERO_INTEGER);



    public static final SubLSymbol $sym30$__ = makeSymbol(">=");

    public static final SubLString $str31$Negative_start_index__D_given_for = makeString("Negative start index ~D given for ~S.");

    public static final SubLSymbol $sym32$__ = makeSymbol("<=");

    public static final SubLString $str33$The_end_index__D_given_for__S_is_ = makeString("The end index ~D given for ~S is greater than the length, ~D.");

    public static final SubLString $str34$The_start_index__D_given_for__S_i = makeString("The start index ~D given for ~S is greater than the end index ~D.");

    public static final SubLList $list35 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $str36$LOCK_VAR = makeString("LOCK-VAR");

    public static final SubLSymbol STREAM_LOCK = makeSymbol("STREAM-LOCK");







    public static final SubLList $list41 = list(makeSymbol("STREAM"));

    public static final SubLSymbol STREAM_STREAM_TYPE = makeSymbol("STREAM-STREAM-TYPE");

    public static final SubLList $list43 = list(makeKeyword("SYNONYM"));

    static {














































    }

    @Override
    public void declareFunctions() {
        declare_stream_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_stream_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_stream_macros_file();
    }
}

