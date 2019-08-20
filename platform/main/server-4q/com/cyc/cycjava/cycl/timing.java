/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.argnames_from_arglist;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class timing extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new timing();



    // defparameter
    @LispMethod(comment = "The storage place for timing runs, parameterized by some key\ndefparameter")
    private static final SubLSymbol $time_testing_environment$ = makeSymbol("*TIME-TESTING-ENVIRONMENT*");

    // defparameter
    @LispMethod(comment = "The storage place for the timing info in this run pertaining to a function\ndefparameter")
    private static final SubLSymbol $timing_table$ = makeSymbol("*TIMING-TABLE*");

    // defparameter
    @LispMethod(comment = "Do we want to time anything at all?\ndefparameter")
    /**
     * Do we want to time anything at all?
     */
    private static final SubLSymbol $utilize_timing_hooks$ = makeSymbol("*UTILIZE-TIMING-HOOKS*");

    // defparameter
    /**
     * a boolean describing scope of timing focus.. if true, everything deftimed
     * contributes to timing reports
     */
    @LispMethod(comment = "a boolean describing scope of timing focus.. if true, everything deftimed\r\ncontributes to timing reports\ndefparameter\na boolean describing scope of timing focus.. if true, everything deftimed\ncontributes to timing reports")
    private static final SubLSymbol $all_currently_active$ = makeSymbol("*ALL-CURRENTLY-ACTIVE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_timing_info$ = makeSymbol("*DTP-TIMING-INFO*");

    static private final SubLList $list1 = list(makeSymbol("*TIMING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER));

    static private final SubLList $list2 = list(list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), NIL), list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), NIL));

    static private final SubLList $list3 = list(list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), T), list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), T));

    static private final SubLList $list4 = list(makeSymbol("FUNCTIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list5 = list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), T);

    static private final SubLList $list6 = list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), NIL);

    public static final SubLSymbol $timed_funs$ = makeSymbol("*TIMED-FUNS*");

    static private final SubLString $$$Timing_info_cleared = makeString("Timing info cleared");

    static private final SubLString $$$Time_testing_environment_cleared = makeString("Time testing environment cleared");

    private static final SubLSymbol TIMING_INFO = makeSymbol("TIMING-INFO");

    private static final SubLSymbol TIMING_INFO_P = makeSymbol("TIMING-INFO-P");

    static private final SubLList $list12 = list(makeSymbol("COUNT"), makeSymbol("TOTAL"), makeSymbol("MAX"));

    static private final SubLList $list13 = list(makeKeyword("COUNT"), makeKeyword("TOTAL"), makeKeyword("MAX"));

    static private final SubLList $list14 = list(makeSymbol("TIMING-INFO-COUNT"), makeSymbol("TIMING-INFO-TOTAL"), makeSymbol("TIMING-INFO-MAX"));

    static private final SubLList $list15 = list(makeSymbol("_CSETF-TIMING-INFO-COUNT"), makeSymbol("_CSETF-TIMING-INFO-TOTAL"), makeSymbol("_CSETF-TIMING-INFO-MAX"));

    private static final SubLSymbol PRINT_TIMING_INFO = makeSymbol("PRINT-TIMING-INFO");

    private static final SubLSymbol TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list18 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TIMING-INFO-P"));

    private static final SubLSymbol TIMING_INFO_COUNT = makeSymbol("TIMING-INFO-COUNT");

    private static final SubLSymbol _CSETF_TIMING_INFO_COUNT = makeSymbol("_CSETF-TIMING-INFO-COUNT");

    private static final SubLSymbol TIMING_INFO_TOTAL = makeSymbol("TIMING-INFO-TOTAL");

    private static final SubLSymbol _CSETF_TIMING_INFO_TOTAL = makeSymbol("_CSETF-TIMING-INFO-TOTAL");

    private static final SubLSymbol TIMING_INFO_MAX = makeSymbol("TIMING-INFO-MAX");

    private static final SubLSymbol _CSETF_TIMING_INFO_MAX = makeSymbol("_CSETF-TIMING-INFO-MAX");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TIMING_INFO = makeSymbol("MAKE-TIMING-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TIMING-INFO-METHOD");

    private static final SubLString $str34$____TIMING_INFO__Count__S_Total__ = makeString("~&#<TIMING-INFO: Count=~S Total=~S Max=~S>~%");

    private static final SubLList $list35 = list(makeSymbol("DEFINING-FORM"), makeSymbol("FUN"), makeSymbol("ARGS"), makeSymbol("STUFF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym36$LOCAL_TIMER = makeUninternedSymbol("LOCAL-TIMER");

    private static final SubLSymbol $sym37$RESULT = makeUninternedSymbol("RESULT");

    private static final SubLString $str38$_IN_TIMER = makeString("-IN-TIMER");

    private static final SubLSymbol $sym41$TIME_FUNCTION_ = makeSymbol("TIME-FUNCTION?");

    private static final SubLSymbol RECORD_TIME = makeSymbol("RECORD-TIME");

    private static final SubLSymbol VALUES_LIST = makeSymbol("VALUES-LIST");

    private static final SubLList $list50 = list(makeSymbol("FUN"), makeSymbol("ARGS"), list(makeSymbol("&REST"), makeSymbol("STUFF")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFTIMED_GENERIC = makeSymbol("DEFTIMED-GENERIC");

    private static final SubLSymbol DEFINE_API = makeSymbol("DEFINE-API");

    /**
     * Conduct a fresh test... ignore results accumulated to this point,
     * they'll be accessible when you pop back out
     */
    @LispMethod(comment = "Conduct a fresh test... ignore results accumulated to this point,\r\nthey\'ll be accessible when you pop back out\nConduct a fresh test... ignore results accumulated to this point,\nthey\'ll be accessible when you pop back out")
    public static final SubLObject with_new_testing_environement_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, bq_cons($list_alt1, append(body, NIL)));
        }
    }

    /**
     * Conduct a fresh test... ignore results accumulated to this point,
     * they'll be accessible when you pop back out
     */
    @LispMethod(comment = "Conduct a fresh test... ignore results accumulated to this point,\r\nthey\'ll be accessible when you pop back out\nConduct a fresh test... ignore results accumulated to this point,\nthey\'ll be accessible when you pop back out")
    public static SubLObject with_new_testing_environement(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, bq_cons($list1, append(body, NIL)));
    }

    /**
     * Suspend timing within this block
     */
    @LispMethod(comment = "Suspend timing within this block")
    public static final SubLObject timing_no_functions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt2, append(body, NIL));
        }
    }

    /**
     * Suspend timing within this block
     */
    @LispMethod(comment = "Suspend timing within this block")
    public static SubLObject timing_no_functions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    /**
     * Time everything within the block
     */
    @LispMethod(comment = "Time everything within the block")
    public static final SubLObject timing_all_functions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt3, append(body, NIL));
        }
    }

    /**
     * Time everything within the block
     */
    @LispMethod(comment = "Time everything within the block")
    public static SubLObject timing_all_functions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list3, append(body, NIL));
    }

    /**
     * Time these functions within this block
     */
    @LispMethod(comment = "Time these functions within this block")
    public static final SubLObject timing_these_functions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject functions = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            functions = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list($list_alt5, $list_alt6, list($timed_funs$, functions)), append(body, NIL));
            }
        }
    }

    /**
     * Time these functions within this block
     */
    @LispMethod(comment = "Time these functions within this block")
    public static SubLObject timing_these_functions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject functions = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        functions = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list($list5, $list6, list($timed_funs$, functions)), append(body, NIL));
    }

    /**
     * Report for an individual function at the end of a timing run
     *
     * @return listp
     */
    @LispMethod(comment = "Report for an individual function at the end of a timing run\r\n\r\n@return listp")
    public static final SubLObject report_fun_alt(SubLObject fun) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject timing_info = gethash(fun, $timing_table$.getDynamicValue(thread), UNPROVIDED);
                return cons(fun, report_time(timing_info));
            }
        }
    }

    /**
     * Report for an individual function at the end of a timing run
     *
     * @return listp
     */
    @LispMethod(comment = "Report for an individual function at the end of a timing run\r\n\r\n@return listp")
    public static SubLObject report_fun(final SubLObject fun) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject timing_info = gethash(fun, $timing_table$.getDynamicValue(thread), UNPROVIDED);
        return cons(fun, report_time(timing_info));
    }

    /**
     * Calculates average and returns max of timing-info...
     * generally should be designed to get everything you want
     * reported except for function name, so you can judge update-timing-info
     * upon any changes made there.
     *
     * @return listp
     */
    @LispMethod(comment = "Calculates average and returns max of timing-info...\r\ngenerally should be designed to get everything you want\r\nreported except for function name, so you can judge update-timing-info\r\nupon any changes made there.\r\n\r\n@return listp\nCalculates average and returns max of timing-info...\ngenerally should be designed to get everything you want\nreported except for function name, so you can judge update-timing-info\nupon any changes made there.")
    public static final SubLObject report_time_alt(SubLObject timing_info) {
        {
            SubLObject count = timing_info_count(timing_info);
            SubLObject total = timing_info_total(timing_info);
            SubLObject max = timing_info_max(timing_info);
            SubLObject mean = divide(total, count);
            return list(mean, max);
        }
    }

    /**
     * Calculates average and returns max of timing-info...
     * generally should be designed to get everything you want
     * reported except for function name, so you can judge update-timing-info
     * upon any changes made there.
     *
     * @return listp
     */
    @LispMethod(comment = "Calculates average and returns max of timing-info...\r\ngenerally should be designed to get everything you want\r\nreported except for function name, so you can judge update-timing-info\r\nupon any changes made there.\r\n\r\n@return listp\nCalculates average and returns max of timing-info...\ngenerally should be designed to get everything you want\nreported except for function name, so you can judge update-timing-info\nupon any changes made there.")
    public static SubLObject report_time(final SubLObject timing_info) {
        final SubLObject count = timing_info_count(timing_info);
        final SubLObject total = timing_info_total(timing_info);
        final SubLObject max = timing_info_max(timing_info);
        final SubLObject mean = divide(total, count);
        return list(mean, max);
    }

    /**
     * Returns a list-form corresponding to current timing run...
     * destructive if reporting with key to larger environment
     *
     * @return listp; really a listy form... cl::pprint it in allegro
     */
    @LispMethod(comment = "Returns a list-form corresponding to current timing run...\r\ndestructive if reporting with key to larger environment\r\n\r\n@return listp; really a listy form... cl::pprint it in allegro\nReturns a list-form corresponding to current timing run...\ndestructive if reporting with key to larger environment")
    public static final SubLObject report_timing_info_alt(SubLObject key) {
        if (key == UNPROVIDED) {
            key = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accumulator = NIL;
                SubLObject cdohash_table = $timing_table$.getDynamicValue(thread);
                SubLObject fun = NIL;
                SubLObject info = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            fun = getEntryKey(cdohash_entry);
                            info = getEntryValue(cdohash_entry);
                            accumulator = cons(report_fun(fun), accumulator);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                if (NIL != key) {
                    sethash(key, $time_testing_environment$.getDynamicValue(thread), accumulator);
                    clear_timing_info();
                }
                return accumulator;
            }
        }
    }

    /**
     * Returns a list-form corresponding to current timing run...
     * destructive if reporting with key to larger environment
     *
     * @return listp; really a listy form... cl::pprint it in allegro
     */
    @LispMethod(comment = "Returns a list-form corresponding to current timing run...\r\ndestructive if reporting with key to larger environment\r\n\r\n@return listp; really a listy form... cl::pprint it in allegro\nReturns a list-form corresponding to current timing run...\ndestructive if reporting with key to larger environment")
    public static SubLObject report_timing_info(SubLObject key) {
        if (key == UNPROVIDED) {
            key = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accumulator = NIL;
        final SubLObject cdohash_table = $timing_table$.getDynamicValue(thread);
        SubLObject fun = NIL;
        SubLObject info = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                fun = getEntryKey(cdohash_entry);
                info = getEntryValue(cdohash_entry);
                accumulator = cons(report_fun(fun), accumulator);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        if (NIL != key) {
            sethash(key, $time_testing_environment$.getDynamicValue(thread), accumulator);
            clear_timing_info();
        }
        return accumulator;
    }

    /**
     * Retrieve the whole of the accumulated time testing environment
     *
     * @return listp; really a list form... cl::pprint it in allegro
     */
    @LispMethod(comment = "Retrieve the whole of the accumulated time testing environment\r\n\r\n@return listp; really a list form... cl::pprint it in allegro")
    public static final SubLObject report_time_testing_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accumulator = NIL;
                SubLObject cdohash_table = $time_testing_environment$.getDynamicValue(thread);
                SubLObject test_run = NIL;
                SubLObject info = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            test_run = getEntryKey(cdohash_entry);
                            info = getEntryValue(cdohash_entry);
                            accumulator = cons(cons(test_run, list(info)), accumulator);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return accumulator;
            }
        }
    }

    /**
     * Retrieve the whole of the accumulated time testing environment
     *
     * @return listp; really a list form... cl::pprint it in allegro
     */
    @LispMethod(comment = "Retrieve the whole of the accumulated time testing environment\r\n\r\n@return listp; really a list form... cl::pprint it in allegro")
    public static SubLObject report_time_testing_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accumulator = NIL;
        final SubLObject cdohash_table = $time_testing_environment$.getDynamicValue(thread);
        SubLObject test_run = NIL;
        SubLObject info = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                test_run = getEntryKey(cdohash_entry);
                info = getEntryValue(cdohash_entry);
                accumulator = cons(cons(test_run, list(info)), accumulator);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return accumulator;
    }

    /**
     * Clear the info in the current timing test
     */
    @LispMethod(comment = "Clear the info in the current timing test")
    public static final SubLObject clear_timing_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clrhash($timing_table$.getDynamicValue(thread));
            return $$$Timing_info_cleared;
        }
    }

    @LispMethod(comment = "Clear the info in the current timing test")
    public static SubLObject clear_timing_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($timing_table$.getDynamicValue(thread));
        return $$$Timing_info_cleared;
    }

    /**
     * Clear the time testing environment
     */
    @LispMethod(comment = "Clear the time testing environment")
    public static final SubLObject clear_time_testing_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clrhash($time_testing_environment$.getDynamicValue(thread));
            return $$$Time_testing_environment_cleared;
        }
    }

    @LispMethod(comment = "Clear the time testing environment")
    public static SubLObject clear_time_testing_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($time_testing_environment$.getDynamicValue(thread));
        return $$$Time_testing_environment_cleared;
    }

    public static final SubLObject timing_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_timing_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject timing_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_timing_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject timing_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.timing.$timing_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject timing_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.timing.$timing_info_native.class ? T : NIL;
    }

    public static final SubLObject timing_info_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TIMING_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject timing_info_count(final SubLObject v_object) {
        assert NIL != timing_info_p(v_object) : "! timing.timing_info_p(v_object) " + "timing.timing_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject timing_info_total_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TIMING_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject timing_info_total(final SubLObject v_object) {
        assert NIL != timing_info_p(v_object) : "! timing.timing_info_p(v_object) " + "timing.timing_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject timing_info_max_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TIMING_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject timing_info_max(final SubLObject v_object) {
        assert NIL != timing_info_p(v_object) : "! timing.timing_info_p(v_object) " + "timing.timing_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_timing_info_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TIMING_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_timing_info_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != timing_info_p(v_object) : "! timing.timing_info_p(v_object) " + "timing.timing_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_timing_info_total_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TIMING_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_timing_info_total(final SubLObject v_object, final SubLObject value) {
        assert NIL != timing_info_p(v_object) : "! timing.timing_info_p(v_object) " + "timing.timing_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_timing_info_max_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TIMING_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_timing_info_max(final SubLObject v_object, final SubLObject value) {
        assert NIL != timing_info_p(v_object) : "! timing.timing_info_p(v_object) " + "timing.timing_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_timing_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.timing.$timing_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($COUNT)) {
                        _csetf_timing_info_count(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TOTAL)) {
                            _csetf_timing_info_total(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MAX)) {
                                _csetf_timing_info_max(v_new, current_value);
                            } else {
                                Errors.error($str_alt27$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_timing_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.timing.$timing_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COUNT)) {
                _csetf_timing_info_count(v_new, current_value);
            } else
                if (pcase_var.eql($TOTAL)) {
                    _csetf_timing_info_total(v_new, current_value);
                } else
                    if (pcase_var.eql($MAX)) {
                        _csetf_timing_info_max(v_new, current_value);
                    } else {
                        Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_timing_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TIMING_INFO, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COUNT, timing_info_count(obj));
        funcall(visitor_fn, obj, $SLOT, $TOTAL, timing_info_total(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX, timing_info_max(obj));
        funcall(visitor_fn, obj, $END, MAKE_TIMING_INFO, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_timing_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_timing_info(obj, visitor_fn);
    }

    /**
     * Really just for debugging... but also good if you want to extend
     * functions and functionality in this section
     */
    @LispMethod(comment = "Really just for debugging... but also good if you want to extend\r\nfunctions and functionality in this section\nReally just for debugging... but also good if you want to extend\nfunctions and functionality in this section")
    public static final SubLObject print_timing_info_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt28$____TIMING_INFO__Count__S_Total__, new SubLObject[]{ timing_info_count(v_object), timing_info_total(v_object), timing_info_max(v_object) });
        return v_object;
    }

    @LispMethod(comment = "Really just for debugging... but also good if you want to extend\r\nfunctions and functionality in this section\nReally just for debugging... but also good if you want to extend\nfunctions and functionality in this section")
    public static SubLObject print_timing_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str34$____TIMING_INFO__Count__S_Total__, new SubLObject[]{ timing_info_count(v_object), timing_info_total(v_object), timing_info_max(v_object) });
        return v_object;
    }

    /**
     * So you've deftimed some function and now you're calling it...
     * Do you really want to time it?
     *
     * @return booleanp
     */
    @LispMethod(comment = "So you\'ve deftimed some function and now you\'re calling it...\r\nDo you really want to time it?\r\n\r\n@return booleanp\nSo you\'ve deftimed some function and now you\'re calling it...\nDo you really want to time it?")
    public static final SubLObject time_functionP_alt(SubLObject function_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $utilize_timing_hooks$.getDynamicValue(thread)) && ((NIL != $all_currently_active$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(function_name, $timed_funs$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))));
        }
    }

    @LispMethod(comment = "So you\'ve deftimed some function and now you\'re calling it...\r\nDo you really want to time it?\r\n\r\n@return booleanp\nSo you\'ve deftimed some function and now you\'re calling it...\nDo you really want to time it?")
    public static SubLObject time_functionP(final SubLObject function_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $utilize_timing_hooks$.getDynamicValue(thread)) && ((NIL != $all_currently_active$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(function_name, $timed_funs$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))));
    }

    /**
     * Update the timing info on function-name to reflect a run taking time: time
     *
     * @return timing-info-p
     */
    @LispMethod(comment = "Update the timing info on function-name to reflect a run taking time: time\r\n\r\n@return timing-info-p")
    public static final SubLObject record_time_alt(SubLObject function_name, SubLObject time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject timing_info = gethash(function_name, $timing_table$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != timing_info) {
                    update_timing_info(timing_info, time);
                } else {
                    sethash(function_name, $timing_table$.getDynamicValue(thread), new_timing_info(time));
                }
                return timing_info;
            }
        }
    }

    /**
     * Update the timing info on function-name to reflect a run taking time: time
     *
     * @return timing-info-p
     */
    @LispMethod(comment = "Update the timing info on function-name to reflect a run taking time: time\r\n\r\n@return timing-info-p")
    public static SubLObject record_time(final SubLObject function_name, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject timing_info = gethash(function_name, $timing_table$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != timing_info) {
            update_timing_info(timing_info, time);
        } else {
            sethash(function_name, $timing_table$.getDynamicValue(thread), new_timing_info(time));
        }
        return timing_info;
    }

    /**
     * Create a first piece of timing info with a run taking time: time
     *
     * @return timing-info-p
     */
    @LispMethod(comment = "Create a first piece of timing info with a run taking time: time\r\n\r\n@return timing-info-p")
    public static final SubLObject new_timing_info_alt(SubLObject time) {
        {
            SubLObject timing_info = make_timing_info(UNPROVIDED);
            _csetf_timing_info_count(timing_info, ONE_INTEGER);
            _csetf_timing_info_total(timing_info, time);
            _csetf_timing_info_max(timing_info, time);
            return timing_info;
        }
    }

    @LispMethod(comment = "Create a first piece of timing info with a run taking time: time\r\n\r\n@return timing-info-p")
    public static SubLObject new_timing_info(final SubLObject time) {
        final SubLObject timing_info = make_timing_info(UNPROVIDED);
        _csetf_timing_info_count(timing_info, ONE_INTEGER);
        _csetf_timing_info_total(timing_info, time);
        _csetf_timing_info_max(timing_info, time);
        return timing_info;
    }/**
     * Create a first piece of timing info with a run taking time: time
     *
     * @return timing-info-p
     */


    /**
     * Update the a piece of timing-info with a run taking time: time
     *
     * @return timing-info-p
     */
    @LispMethod(comment = "Update the a piece of timing-info with a run taking time: time\r\n\r\n@return timing-info-p")
    public static final SubLObject update_timing_info_alt(SubLObject timing_info, SubLObject time) {
        _csetf_timing_info_count(timing_info, add(timing_info_count(timing_info), ONE_INTEGER));
        _csetf_timing_info_total(timing_info, add(timing_info_total(timing_info), time));
        if (time.numG(timing_info_max(timing_info))) {
            _csetf_timing_info_max(timing_info, time);
        }
        return timing_info;
    }

    @LispMethod(comment = "Update the a piece of timing-info with a run taking time: time\r\n\r\n@return timing-info-p")
    public static SubLObject update_timing_info(final SubLObject timing_info, final SubLObject time) {
        _csetf_timing_info_count(timing_info, add(timing_info_count(timing_info), ONE_INTEGER));
        _csetf_timing_info_total(timing_info, add(timing_info_total(timing_info), time));
        if (time.numG(timing_info_max(timing_info))) {
            _csetf_timing_info_max(timing_info, time);
        }
        return timing_info;
    }/**
     * Update the a piece of timing-info with a run taking time: time
     *
     * @return timing-info-p
     */


    public static final SubLObject deftimed_generic_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject defining_form = NIL;
            SubLObject fun = NIL;
            SubLObject args = NIL;
            SubLObject stuff = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            defining_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt29);
            fun = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt29);
            args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt29);
            stuff = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject local_timer = $sym30$LOCAL_TIMER;
                SubLObject result = $sym31$RESULT;
                SubLObject f2 = intern(cconcatenate(symbol_name(fun), $str_alt32$_IN_TIMER), UNPROVIDED);
                return list(PROGN, listS(defining_form, fun, args, append(stuff, list(list(PIF, list($sym35$TIME_FUNCTION_, list(QUOTE, fun)), list(CLET, list(local_timer, result), list(CTIME, local_timer, list(CSETQ, result, list(MULTIPLE_VALUE_LIST, bq_cons(f2, append(argnames_from_arglist(args), NIL))))), list(RECORD_TIME, list(QUOTE, fun), local_timer), list(RET, list(VALUES_LIST, result))), list(RET, bq_cons(f2, append(argnames_from_arglist(args), NIL))))))), listS(DEFINE_PRIVATE, f2, args, append(body, NIL)));
            }
        }
    }

    public static SubLObject deftimed_generic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject defining_form = NIL;
        SubLObject fun = NIL;
        SubLObject args = NIL;
        SubLObject stuff = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        defining_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        stuff = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject local_timer = $sym36$LOCAL_TIMER;
        final SubLObject result = $sym37$RESULT;
        final SubLObject f2 = intern(cconcatenate(symbol_name(fun), $str38$_IN_TIMER), UNPROVIDED);
        return list(PROGN, listS(defining_form, fun, args, append(stuff, list(list(PIF, list($sym41$TIME_FUNCTION_, list(QUOTE, fun)), list(CLET, list(local_timer, result), list(CTIME, local_timer, list(CSETQ, result, list(MULTIPLE_VALUE_LIST, bq_cons(f2, append(argnames_from_arglist(args), NIL))))), list(RECORD_TIME, list(QUOTE, fun), local_timer), list(RET, list(VALUES_LIST, result))), list(RET, bq_cons(f2, append(argnames_from_arglist(args), NIL))))))), listS(DEFINE_PRIVATE, f2, args, append(body, NIL)));
    }

    public static final SubLObject deftimed_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fun = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            fun = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stuff = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return listS(DEFTIMED_GENERIC, DEFINE_PRIVATE, fun, args, stuff, append(body, NIL));
                    }
                }
            }
        }
    }

    public static SubLObject deftimed_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = stuff = current.first();
        final SubLObject body;
        current = body = temp;
        return listS(DEFTIMED_GENERIC, DEFINE_PRIVATE, fun, args, stuff, append(body, NIL));
    }

    public static final SubLObject deftimed_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fun = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            fun = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stuff = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return listS(DEFTIMED_GENERIC, DEFINE_PROTECTED, fun, args, stuff, append(body, NIL));
                    }
                }
            }
        }
    }

    public static SubLObject deftimed_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = stuff = current.first();
        final SubLObject body;
        current = body = temp;
        return listS(DEFTIMED_GENERIC, DEFINE_PROTECTED, fun, args, stuff, append(body, NIL));
    }

    public static final SubLObject deftimed_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fun = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            fun = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stuff = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return listS(DEFTIMED_GENERIC, DEFINE, fun, args, stuff, append(body, NIL));
                    }
                }
            }
        }
    }

    public static SubLObject deftimed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = stuff = current.first();
        final SubLObject body;
        current = body = temp;
        return listS(DEFTIMED_GENERIC, DEFINE, fun, args, stuff, append(body, NIL));
    }

    public static final SubLObject deftimed_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fun = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            fun = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stuff = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return listS(DEFTIMED_GENERIC, DEFINE_PUBLIC, fun, args, stuff, append(body, NIL));
                    }
                }
            }
        }
    }

    public static SubLObject deftimed_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = stuff = current.first();
        final SubLObject body;
        current = body = temp;
        return listS(DEFTIMED_GENERIC, DEFINE_PUBLIC, fun, args, stuff, append(body, NIL));
    }

    public static final SubLObject deftimed_api_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fun = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            fun = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stuff = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return listS(DEFTIMED_GENERIC, DEFINE_API, fun, args, stuff, append(body, NIL));
                    }
                }
            }
        }
    }

    public static SubLObject deftimed_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        fun = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = stuff = current.first();
        final SubLObject body;
        current = body = temp;
        return listS(DEFTIMED_GENERIC, DEFINE_API, fun, args, stuff, append(body, NIL));
    }

    public static SubLObject declare_timing_file() {
        declareMacro("with_new_testing_environement", "WITH-NEW-TESTING-ENVIRONEMENT");
        declareMacro("timing_no_functions", "TIMING-NO-FUNCTIONS");
        declareMacro("timing_all_functions", "TIMING-ALL-FUNCTIONS");
        declareMacro("timing_these_functions", "TIMING-THESE-FUNCTIONS");
        declareFunction("report_fun", "REPORT-FUN", 1, 0, false);
        declareFunction("report_time", "REPORT-TIME", 1, 0, false);
        declareFunction("report_timing_info", "REPORT-TIMING-INFO", 0, 1, false);
        declareFunction("report_time_testing_info", "REPORT-TIME-TESTING-INFO", 0, 0, false);
        declareFunction("clear_timing_info", "CLEAR-TIMING-INFO", 0, 0, false);
        declareFunction("clear_time_testing_info", "CLEAR-TIME-TESTING-INFO", 0, 0, false);
        declareFunction("timing_info_print_function_trampoline", "TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("timing_info_p", "TIMING-INFO-P", 1, 0, false);
        new timing.$timing_info_p$UnaryFunction();
        declareFunction("timing_info_count", "TIMING-INFO-COUNT", 1, 0, false);
        declareFunction("timing_info_total", "TIMING-INFO-TOTAL", 1, 0, false);
        declareFunction("timing_info_max", "TIMING-INFO-MAX", 1, 0, false);
        declareFunction("_csetf_timing_info_count", "_CSETF-TIMING-INFO-COUNT", 2, 0, false);
        declareFunction("_csetf_timing_info_total", "_CSETF-TIMING-INFO-TOTAL", 2, 0, false);
        declareFunction("_csetf_timing_info_max", "_CSETF-TIMING-INFO-MAX", 2, 0, false);
        declareFunction("make_timing_info", "MAKE-TIMING-INFO", 0, 1, false);
        declareFunction("visit_defstruct_timing_info", "VISIT-DEFSTRUCT-TIMING-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_timing_info_method", "VISIT-DEFSTRUCT-OBJECT-TIMING-INFO-METHOD", 2, 0, false);
        declareFunction("print_timing_info", "PRINT-TIMING-INFO", 3, 0, false);
        declareFunction("time_functionP", "TIME-FUNCTION?", 1, 0, false);
        declareFunction("record_time", "RECORD-TIME", 2, 0, false);
        declareFunction("new_timing_info", "NEW-TIMING-INFO", 1, 0, false);
        declareFunction("update_timing_info", "UPDATE-TIMING-INFO", 2, 0, false);
        declareMacro("deftimed_generic", "DEFTIMED-GENERIC");
        declareMacro("deftimed_private", "DEFTIMED-PRIVATE");
        declareMacro("deftimed_protected", "DEFTIMED-PROTECTED");
        declareMacro("deftimed", "DEFTIMED");
        declareMacro("deftimed_public", "DEFTIMED-PUBLIC");
        declareMacro("deftimed_api", "DEFTIMED-API");
        return NIL;
    }

    public static final SubLObject init_timing_file_alt() {
        defparameter("*TIME-TESTING-ENVIRONMENT*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*TIMING-TABLE*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*UTILIZE-TIMING-HOOKS*", T);
        defparameter("*ALL-CURRENTLY-ACTIVE*", NIL);
        defparameter("*TIMED-FUNS*", NIL);
        defconstant("*DTP-TIMING-INFO*", TIMING_INFO);
        return NIL;
    }

    public static SubLObject init_timing_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TIME-TESTING-ENVIRONMENT*", () -> make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*TIMING-TABLE*", () -> make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*UTILIZE-TIMING-HOOKS*", T);
            defparameter("*ALL-CURRENTLY-ACTIVE*", NIL);
            defparameter("*TIMED-FUNS*", NIL);
            defconstant("*DTP-TIMING-INFO*", TIMING_INFO);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*TIME-TESTING-ENVIRONMENT*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
            defparameter("*TIMING-TABLE*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_timing_file_Previous() {
        defparameter("*TIME-TESTING-ENVIRONMENT*", () -> make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*TIMING-TABLE*", () -> make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*UTILIZE-TIMING-HOOKS*", T);
        defparameter("*ALL-CURRENTLY-ACTIVE*", NIL);
        defparameter("*TIMED-FUNS*", NIL);
        defconstant("*DTP-TIMING-INFO*", TIMING_INFO);
        return NIL;
    }

    public static SubLObject setup_timing_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_timing_info$.getGlobalValue(), symbol_function(TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list18);
        def_csetf(TIMING_INFO_COUNT, _CSETF_TIMING_INFO_COUNT);
        def_csetf(TIMING_INFO_TOTAL, _CSETF_TIMING_INFO_TOTAL);
        def_csetf(TIMING_INFO_MAX, _CSETF_TIMING_INFO_MAX);
        identity(TIMING_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_timing_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_timing_file();
    }

    @Override
    public void initializeVariables() {
        init_timing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_timing_file();
    }

    static {
    }

    public static final class $timing_info_native extends SubLStructNative {
        public SubLObject $count;

        public SubLObject $total;

        public SubLObject $max;

        private static final SubLStructDeclNative structDecl;

        public $timing_info_native() {
            timing.$timing_info_native.this.$count = Lisp.NIL;
            timing.$timing_info_native.this.$total = Lisp.NIL;
            timing.$timing_info_native.this.$max = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return timing.$timing_info_native.this.$count;
        }

        @Override
        public SubLObject getField3() {
            return timing.$timing_info_native.this.$total;
        }

        @Override
        public SubLObject getField4() {
            return timing.$timing_info_native.this.$max;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return timing.$timing_info_native.this.$count = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return timing.$timing_info_native.this.$total = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return timing.$timing_info_native.this.$max = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.timing.$timing_info_native.class, TIMING_INFO, TIMING_INFO_P, $list12, $list13, new String[]{ "$count", "$total", "$max" }, $list14, $list15, PRINT_TIMING_INFO);
        }
    }

    public static final class $timing_info_p$UnaryFunction extends UnaryFunction {
        public $timing_info_p$UnaryFunction() {
            super(extractFunctionNamed("TIMING-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return timing_info_p(arg1);
        }
    }

    static private final SubLList $list_alt1 = list(makeSymbol("*TIMING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER));

    static private final SubLList $list_alt2 = list(list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), NIL), list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), NIL));

    static private final SubLList $list_alt3 = list(list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), T), list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), T));

    static private final SubLList $list_alt4 = list(makeSymbol("FUNCTIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), T);

    static private final SubLList $list_alt6 = list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), NIL);

    static private final SubLList $list_alt12 = list(makeSymbol("COUNT"), makeSymbol("TOTAL"), makeSymbol("MAX"));

    static private final SubLList $list_alt13 = list(makeKeyword("COUNT"), makeKeyword("TOTAL"), makeKeyword("MAX"));

    static private final SubLList $list_alt14 = list(makeSymbol("TIMING-INFO-COUNT"), makeSymbol("TIMING-INFO-TOTAL"), makeSymbol("TIMING-INFO-MAX"));

    static private final SubLList $list_alt15 = list(makeSymbol("_CSETF-TIMING-INFO-COUNT"), makeSymbol("_CSETF-TIMING-INFO-TOTAL"), makeSymbol("_CSETF-TIMING-INFO-MAX"));

    static private final SubLString $str_alt27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt28$____TIMING_INFO__Count__S_Total__ = makeString("~&#<TIMING-INFO: Count=~S Total=~S Max=~S>~%");

    static private final SubLList $list_alt29 = list(makeSymbol("DEFINING-FORM"), makeSymbol("FUN"), makeSymbol("ARGS"), makeSymbol("STUFF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym30$LOCAL_TIMER = makeUninternedSymbol("LOCAL-TIMER");

    static private final SubLSymbol $sym31$RESULT = makeUninternedSymbol("RESULT");

    static private final SubLString $str_alt32$_IN_TIMER = makeString("-IN-TIMER");

    static private final SubLSymbol $sym35$TIME_FUNCTION_ = makeSymbol("TIME-FUNCTION?");

    static private final SubLList $list_alt44 = list(makeSymbol("FUN"), makeSymbol("ARGS"), list(makeSymbol("&REST"), makeSymbol("STUFF")), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 306 ms
 */
