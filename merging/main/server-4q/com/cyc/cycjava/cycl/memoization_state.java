/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.sxhash_update_state;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MEMOIZATION-STATE
 * source file: /cyc/top/cycl/memoization-state.lisp
 * created:     2019/07/03 17:37:11
 */
public final class memoization_state extends SubLTranslatedFile implements V12 {
    public static final class $memoization_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$store;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$current_process;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$lock;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$name;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$should_clone;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$store = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$current_process = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$lock = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$name = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.this.$should_clone = value;
        }

        public SubLObject $store = Lisp.NIL;

        public SubLObject $current_process = Lisp.NIL;

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $name = Lisp.NIL;

        public SubLObject $should_clone = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.class, MEMOIZATION_STATE, MEMOIZATION_STATE_P, $list_alt78, $list_alt79, new String[]{ "$store", "$current_process", "$lock", "$name", "$should_clone" }, $list_alt80, $list_alt81, PRINT_MEMOIZATION_STATE);
    }

    public static final class $caching_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$store;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$zero_arg_results;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$lock;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$capacity;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$func_symbol;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$test;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$args_length;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$store = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$zero_arg_results = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$lock = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$capacity = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$func_symbol = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$test = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.memoization_state.$caching_state_native.this.$args_length = value;
        }

        public SubLObject $store = Lisp.NIL;

        public SubLObject $zero_arg_results = Lisp.NIL;

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $capacity = Lisp.NIL;

        public SubLObject $func_symbol = Lisp.NIL;

        public SubLObject $test = Lisp.NIL;

        public SubLObject $args_length = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.memoization_state.$caching_state_native.class, CACHING_STATE, CACHING_STATE_P, $list_alt37, $list_alt38, new String[]{ "$store", "$zero_arg_results", "$lock", "$capacity", "$func_symbol", "$test", "$args_length" }, $list_alt39, $list_alt40, PRINT_CACHING_STATE);
    }

    public static final SubLFile me = new memoization_state();

 public static final String myName = "com.cyc.cycjava.cycl.memoization_state";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical\ndefconstant")
    public static final SubLSymbol $global_caching_lock$ = makeSymbol("*GLOBAL-CACHING-LOCK*");

    // defvar
    // Caching mode function indicating what's enabled.
    /**
     * Caching mode function indicating what's enabled.
     */
    @LispMethod(comment = "Caching mode function indicating what\'s enabled.\ndefvar")
    public static final SubLSymbol $caching_mode_enabled$ = makeSymbol("*CACHING-MODE-ENABLED*");

    // defvar
    // Caching mode function indicating what's disabled.
    /**
     * Caching mode function indicating what's disabled.
     */
    @LispMethod(comment = "Caching mode function indicating what\'s disabled.\ndefvar")
    public static final SubLSymbol $caching_mode_disabled$ = makeSymbol("*CACHING-MODE-DISABLED*");

    // defparameter
    // Global caching and memoization are disabled when NIL.
    /**
     * Global caching and memoization are disabled when NIL.
     */
    @LispMethod(comment = "Global caching and memoization are disabled when NIL.\ndefparameter")
    public static final SubLSymbol $function_caching_enabledP$ = makeSymbol("*FUNCTION-CACHING-ENABLED?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $memoized_item_not_found$ = makeSymbol("*MEMOIZED-ITEM-NOT-FOUND*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_caching_state$ = makeSymbol("*DTP-CACHING-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_memoization_state$ = makeSymbol("*DTP-MEMOIZATION-STATE*");

    // deflexical
    /**
     * The list of possible triggers which can clear caches when they are triggered.
     * Note that :genl-preds-modified is also triggered on the addition or removal
     * of a #$genlInverse assertion.
     */
    @LispMethod(comment = "The list of possible triggers which can clear caches when they are triggered.\r\nNote that :genl-preds-modified is also triggered on the addition or removal\r\nof a #$genlInverse assertion.\ndeflexical\nThe list of possible triggers which can clear caches when they are triggered.\nNote that :genl-preds-modified is also triggered on the addition or removal\nof a #$genlInverse assertion.")
    private static final SubLSymbol $cache_clear_triggers$ = makeSymbol("*CACHE-CLEAR-TRIGGERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $suspend_clearing_mt_dependent_cachesP$ = makeSymbol("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $caching_n_sxhash_composite_value$ = makeSymbol("*CACHING-N-SXHASH-COMPOSITE-VALUE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$global_caching_lock = makeString("global-caching-lock");

    public static final SubLSymbol $caching_mode_should_monitor$ = makeSymbol("*CACHING-MODE-SHOULD-MONITOR*");

    public static final SubLSymbol $cache_monitor_hash$ = makeSymbol("*CACHE-MONITOR-HASH*");

    public static final SubLSymbol $cache_monitor_failure_hash$ = makeSymbol("*CACHE-MONITOR-FAILURE-HASH*");

    static private final SubLSymbol $sym4$_ = makeSymbol(">");

    static private final SubLString $str6$Cached_Function_Call___S__S___ = makeString("Cached Function Call: ~S(~S)~%");

    static private final SubLString $str7$Missed_Cached_Function_Call___S__ = makeString("Missed Cached Function Call: ~S(~S)~%");

    public static final SubLSymbol $allow_function_caching_to_be_disabled$ = makeSymbol("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*");

    static private final SubLList $list10 = list(list(makeSymbol("&KEY"), makeSymbol("DISABLE"), makeSymbol("ENABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list11 = list(makeKeyword("DISABLE"), makeKeyword("ENABLE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $str15$DISABLE_must_be__ALL = makeString("DISABLE must be :ALL");

    static private final SubLString $str16$ENABLE_must_be__ALL = makeString("ENABLE must be :ALL");

    static private final SubLList $list18 = list(list(makeSymbol("*CACHING-MODE-ENABLED*"), makeSymbol("*CACHING-MODE-ENABLED*")), list(makeSymbol("*CACHING-MODE-DISABLED*"), makeSymbol("*CACHING-MODE-DISABLED*")), list(makeSymbol("*FUNCTION-CACHING-ENABLED?*"), makeSymbol("*FUNCTION-CACHING-ENABLED?*")));

    private static final SubLSymbol CACHING_MODE_ENABLE = makeSymbol("CACHING-MODE-ENABLE");

    private static final SubLSymbol CACHING_MODE_DISABLE = makeSymbol("CACHING-MODE-DISABLE");

    private static final SubLInteger $int$167 = makeInteger(167);

    static private final SubLList $list22 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol MEMOIZATION_STATE_LOCK = makeSymbol("MEMOIZATION-STATE-LOCK");

    static private final SubLList $list26 = list(makeSymbol("RESULT"));

    private static final SubLSymbol WITH_WRITER_LOCK = makeSymbol("WITH-WRITER-LOCK");

    static private final SubLList $list28 = list(makeSymbol("LOCK"));

    static private final SubLList $list31 = list(list(RET, makeSymbol("RESULT")));

    private static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

    static private final SubLList $list34 = list(list(makeSymbol("LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol CACHING_STATE = makeSymbol("CACHING-STATE");

    private static final SubLSymbol CACHING_STATE_P = makeSymbol("CACHING-STATE-P");

    static private final SubLList $list38 = list(makeSymbol("STORE"), makeSymbol("ZERO-ARG-RESULTS"), makeSymbol("LOCK"), makeSymbol("CAPACITY"), makeSymbol("FUNC-SYMBOL"), makeSymbol("TEST"), makeSymbol("ARGS-LENGTH"));

    static private final SubLList $list39 = list(makeKeyword("STORE"), makeKeyword("ZERO-ARG-RESULTS"), $LOCK, makeKeyword("CAPACITY"), makeKeyword("FUNC-SYMBOL"), $TEST, makeKeyword("ARGS-LENGTH"));

    static private final SubLList $list40 = list(makeSymbol("CACHING-STATE-STORE"), makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS"), makeSymbol("CACHING-STATE-LOCK"), makeSymbol("CACHING-STATE-CAPACITY"), makeSymbol("CACHING-STATE-FUNC-SYMBOL"), makeSymbol("CACHING-STATE-TEST"), makeSymbol("CACHING-STATE-ARGS-LENGTH"));

    private static final SubLList $list41 = list(makeSymbol("_CSETF-CACHING-STATE-STORE"), makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS"), makeSymbol("_CSETF-CACHING-STATE-LOCK"), makeSymbol("_CSETF-CACHING-STATE-CAPACITY"), makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL"), makeSymbol("_CSETF-CACHING-STATE-TEST"), makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH"));

    private static final SubLSymbol PRINT_CACHING_STATE = makeSymbol("PRINT-CACHING-STATE");

    private static final SubLSymbol CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list44 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CACHING-STATE-P"));

    private static final SubLSymbol CACHING_STATE_STORE = makeSymbol("CACHING-STATE-STORE");

    private static final SubLSymbol _CSETF_CACHING_STATE_STORE = makeSymbol("_CSETF-CACHING-STATE-STORE");

    private static final SubLSymbol CACHING_STATE_ZERO_ARG_RESULTS = makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS");

    private static final SubLSymbol _CSETF_CACHING_STATE_ZERO_ARG_RESULTS = makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS");

    private static final SubLSymbol CACHING_STATE_LOCK = makeSymbol("CACHING-STATE-LOCK");

    private static final SubLSymbol _CSETF_CACHING_STATE_LOCK = makeSymbol("_CSETF-CACHING-STATE-LOCK");

    private static final SubLSymbol CACHING_STATE_CAPACITY = makeSymbol("CACHING-STATE-CAPACITY");

    private static final SubLSymbol _CSETF_CACHING_STATE_CAPACITY = makeSymbol("_CSETF-CACHING-STATE-CAPACITY");

    private static final SubLSymbol CACHING_STATE_FUNC_SYMBOL = makeSymbol("CACHING-STATE-FUNC-SYMBOL");

    private static final SubLSymbol _CSETF_CACHING_STATE_FUNC_SYMBOL = makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL");

    private static final SubLSymbol CACHING_STATE_TEST = makeSymbol("CACHING-STATE-TEST");

    private static final SubLSymbol _CSETF_CACHING_STATE_TEST = makeSymbol("_CSETF-CACHING-STATE-TEST");

    private static final SubLSymbol CACHING_STATE_ARGS_LENGTH = makeSymbol("CACHING-STATE-ARGS-LENGTH");

    private static final SubLSymbol _CSETF_CACHING_STATE_ARGS_LENGTH = makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH");

    private static final SubLSymbol $ZERO_ARG_RESULTS = makeKeyword("ZERO-ARG-RESULTS");

    private static final SubLString $str66$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CACHING_STATE = makeSymbol("MAKE-CACHING-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CACHING_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHING-STATE-METHOD");

    private static final SubLString $str76$__caching_state_function___A_lock = makeString("#<caching-state function: ~A lock: '~A' capacity: ~A test: ~S ~%    store: ");

    private static final SubLString $str77$_ = makeString(">");

    static private final SubLList $list78 = list(makeSymbol("CACHED-ARGS"), makeSymbol("RESULT"));

    static private final SubLList $list81 = list(makeSymbol("CACHED-ARGS"), makeSymbol("RESULTS"));

    private static final SubLList $list84 = list(makeSymbol("STORE"), makeSymbol("CURRENT-PROCESS"), makeSymbol("LOCK"), makeSymbol("NAME"), makeSymbol("SHOULD-CLONE"));

    private static final SubLList $list85 = list(makeKeyword("STORE"), makeKeyword("CURRENT-PROCESS"), $LOCK, $NAME, makeKeyword("SHOULD-CLONE"));

    private static final SubLList $list86 = list(makeSymbol("MEMOIZATION-STATE-STORE"), makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS"), makeSymbol("MEMOIZATION-STATE-LOCK"), makeSymbol("MEMOIZATION-STATE-NAME"), makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE"));

    private static final SubLList $list87 = list(makeSymbol("_CSETF-MEMOIZATION-STATE-STORE"), makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS"), makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK"), makeSymbol("_CSETF-MEMOIZATION-STATE-NAME"), makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE"));

    private static final SubLSymbol PRINT_MEMOIZATION_STATE = makeSymbol("PRINT-MEMOIZATION-STATE");

    private static final SubLSymbol MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list90 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MEMOIZATION-STATE-P"));

    private static final SubLSymbol MEMOIZATION_STATE_STORE = makeSymbol("MEMOIZATION-STATE-STORE");

    private static final SubLSymbol _CSETF_MEMOIZATION_STATE_STORE = makeSymbol("_CSETF-MEMOIZATION-STATE-STORE");

    private static final SubLSymbol MEMOIZATION_STATE_CURRENT_PROCESS = makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS");

    private static final SubLSymbol _CSETF_MEMOIZATION_STATE_CURRENT_PROCESS = makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS");

    private static final SubLSymbol _CSETF_MEMOIZATION_STATE_LOCK = makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK");

    private static final SubLSymbol MEMOIZATION_STATE_NAME = makeSymbol("MEMOIZATION-STATE-NAME");

    private static final SubLSymbol _CSETF_MEMOIZATION_STATE_NAME = makeSymbol("_CSETF-MEMOIZATION-STATE-NAME");

    private static final SubLSymbol MEMOIZATION_STATE_SHOULD_CLONE = makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE");

    private static final SubLSymbol _CSETF_MEMOIZATION_STATE_SHOULD_CLONE = makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE");

    private static final SubLSymbol MAKE_MEMOIZATION_STATE = makeSymbol("MAKE-MEMOIZATION-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MEMOIZATION_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MEMOIZATION-STATE-METHOD");

    private static final SubLSymbol READER_WRITER_LOCK_P = makeSymbol("READER-WRITER-LOCK-P");

    private static final SubLString $str108$memoization_state_clone_lock = makeString("memoization-state-clone-lock");

    private static final SubLString $str109$__memoization_state_name____A__lo = makeString("#<memoization-state name: '~A' lock: '~A' should-clone: ~A current-process: '~A' ~%    store: ~A ");

    private static final SubLString $str110$Clone__ = makeString("Clone: ");

    private static final SubLString $str111$Need_to_implement_dictionary_copy = makeString("Need to implement dictionary copy!");

    private static final SubLString $str112$implement_me_in__memoization_stat = makeString("implement me in: memoization-state-merge-cloned-state");

    private static final SubLSymbol $sym113$CACHING_STATE_RESULTS_HAS_ARGS_ = makeSymbol("CACHING-STATE-RESULTS-HAS-ARGS?");

    private static final SubLString $str115$Dont_know_how_to_determine_size_a = makeString("Dont know how to determine size and capacity for objects of type ~A.");

    private static final SubLSymbol $sym116$ORIGINAL_MEMOIZATION_PROCESS = makeUninternedSymbol("ORIGINAL-MEMOIZATION-PROCESS");

    private static final SubLSymbol $sym117$LOCAL_STATE = makeUninternedSymbol("LOCAL-STATE");

    public static final SubLSymbol $memoization_state$ = makeSymbol("*MEMOIZATION-STATE*");

    private static final SubLSymbol MEMOIZATION_STATE_ORIGINAL_PROCESS = makeSymbol("MEMOIZATION-STATE-ORIGINAL-PROCESS");

    private static final SubLSymbol MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS = makeSymbol("MEMOIZATION-STATE-POSSIBLY-CLEAR-ORIGINAL-PROCESS");

    private static final SubLString $str124$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol $sym125$STATE = makeUninternedSymbol("STATE");

    private static final SubLList $list126 = list(list(makeSymbol("NEW-MEMOIZATION-STATE")));

    private static final SubLList $list127 = list(list(makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym128$STATE = makeUninternedSymbol("STATE");

    private static final SubLSymbol PRINT_ONE_PER_LINE = makeSymbol("PRINT-ONE-PER-LINE");

    private static final SubLSymbol GATHER_MEMOIZATION_STATE_STATISTICS = makeSymbol("GATHER-MEMOIZATION-STATE-STATISTICS");

    private static final SubLSymbol $sym131$STATE = makeUninternedSymbol("STATE");

    private static final SubLList $list132 = list(list(makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE")));

    private static final SubLSymbol POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");

    private static final SubLSymbol $memoized_functions$ = makeSymbol("*MEMOIZED-FUNCTIONS*");

    private static final SubLSymbol DEFINE_MEMOIZED = makeSymbol("DEFINE-MEMOIZED");

    private static final SubLList $list138 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("CAPACITY"), makeSymbol("FACCESS"), makeSymbol("MEMOIZATION-STATE-FUNCTION"), makeSymbol("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list139 = list($TEST, makeKeyword("CAPACITY"), makeKeyword("FACCESS"), makeKeyword("MEMOIZATION-STATE-FUNCTION"), makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS"));

    private static final SubLSymbol $MEMOIZATION_STATE_FUNCTION = makeKeyword("MEMOIZATION-STATE-FUNCTION");

    private static final SubLSymbol $MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS = makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS");

    private static final SubLList $list143 = list(QUOTE, EQL);

    private static final SubLString $str144$Got_a_test_expression_of_length__ = makeString("Got a test expression of length: ~S for ~S~%");

    private static final SubLString $str147$Don_t_know_how_to_convert___S_to_ = makeString("Don't know how to convert: ~S to a test~%");

    private static final SubLSymbol $sym148$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");

    private static final SubLSymbol $sym149$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    private static final SubLSymbol $sym150$RESULTS = makeUninternedSymbol("RESULTS");

    private static final SubLSymbol NOTE_CACHED_FUNCTION_CALLED = makeSymbol("NOTE-CACHED-FUNCTION-CALLED");

    private static final SubLSymbol CACHING_DISABLED = makeSymbol("CACHING-DISABLED");

    private static final SubLList $list157 = list(NIL);

    private static final SubLSymbol MEMOIZATION_STATE_LOOKUP = makeSymbol("MEMOIZATION-STATE-LOOKUP");

    private static final SubLSymbol CREATE_CACHING_STATE = makeSymbol("CREATE-CACHING-STATE");

    private static final SubLSymbol MEMOIZATION_STATE_PUT = makeSymbol("MEMOIZATION-STATE-PUT");

    private static final SubLList $list162 = list(makeSymbol("*MEMOIZED-ITEM-NOT-FOUND*"));

    private static final SubLSymbol NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED = makeSymbol("NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED");

    private static final SubLSymbol CACHING_STATE_SET_ZERO_ARG_RESULTS = makeSymbol("CACHING-STATE-SET-ZERO-ARG-RESULTS");

    private static final SubLSymbol CACHING_STATE_PUT = makeSymbol("CACHING-STATE-PUT");

    private static final SubLSymbol CACHING_RESULTS = makeSymbol("CACHING-RESULTS");

    private static final SubLSymbol $sym168$SXHASH = makeUninternedSymbol("SXHASH");

    private static final SubLSymbol $sym169$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");

    private static final SubLSymbol $sym170$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    private static final SubLSymbol $sym171$RESULTS = makeUninternedSymbol("RESULTS");

    private static final SubLSymbol $sym172$COLLISIONS = makeUninternedSymbol("COLLISIONS");

    private static final SubLSymbol CACHING_STATE_LOOKUP = makeSymbol("CACHING-STATE-LOOKUP");

    private static final SubLSymbol CACHING_STATE_ENTER_MULTI_KEY_N = makeSymbol("CACHING-STATE-ENTER-MULTI-KEY-N");

    private static final SubLSymbol SXHASH_CALC_2 = makeSymbol("SXHASH-CALC-2");

    private static final SubLSymbol SXHASH_CALC_3 = makeSymbol("SXHASH-CALC-3");

    private static final SubLSymbol SXHASH_CALC_4 = makeSymbol("SXHASH-CALC-4");

    private static final SubLSymbol SXHASH_CALC_5 = makeSymbol("SXHASH-CALC-5");

    private static final SubLSymbol SXHASH_CALC_6 = makeSymbol("SXHASH-CALC-6");

    private static final SubLSymbol SXHASH_CALC_7 = makeSymbol("SXHASH-CALC-7");

    private static final SubLSymbol SXHASH_CALC_8 = makeSymbol("SXHASH-CALC-8");

    private static final SubLSymbol SXHASH_CALC_9 = makeSymbol("SXHASH-CALC-9");

    private static final SubLSymbol SXHASH_CALC_10 = makeSymbol("SXHASH-CALC-10");

    private static final SubLSymbol SXHASH_CALC_N = makeSymbol("SXHASH-CALC-N");

    private static final SubLSymbol CACHING_STATE_GET_ZERO_ARG_RESULTS = makeSymbol("CACHING-STATE-GET-ZERO-ARG-RESULTS");

    private static final SubLSymbol COLLISION = makeSymbol("COLLISION");

    private static final SubLList $list190 = list(list(makeSymbol("CACHED-ARGS"), list(makeSymbol("FIRST"), makeSymbol("COLLISION"))), list(makeSymbol("RESULTS2"), list(makeSymbol("SECOND"), makeSymbol("COLLISION"))));

    private static final SubLList $list191 = list(list(makeSymbol("FIRST"), makeSymbol("CACHED-ARGS")));

    private static final SubLList $list192 = list(makeSymbol("CPOP"), makeSymbol("CACHED-ARGS"));

    private static final SubLSymbol CACHED_ARGS = makeSymbol("CACHED-ARGS");

    static private final SubLList $list195 = list(makeSymbol("CNOT"), list(makeSymbol("REST"), makeSymbol("CACHED-ARGS")));

    private static final SubLList $list196 = list(list(RET, list(makeSymbol("CACHING-RESULTS"), makeSymbol("RESULTS2"))));

    private static final SubLSymbol CACHING_STATE_LOOKUP_MULTI_KEY_N = makeSymbol("CACHING-STATE-LOOKUP-MULTI-KEY-N");

    private static final SubLSymbol NOTE_MEMOIZED_FUNCTION = makeSymbol("NOTE-MEMOIZED-FUNCTION");

    private static final SubLSymbol $globally_cached_functions$ = makeSymbol("*GLOBALLY-CACHED-FUNCTIONS*");

    private static final SubLSymbol GLOBAL_CACHING_VARIABLE_NEW = makeSymbol("GLOBAL-CACHING-VARIABLE-NEW");

    private static final SubLString $str204$Clearing_all_globally_cached_func = makeString("Clearing all globally cached functions");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str207$____clearing_large_caching_state_ = makeString("~&  clearing large caching state: ~A (~A entries)~%");

    private static final SubLSymbol DEFINE_CACHED_NEW = makeSymbol("DEFINE-CACHED-NEW");

    private static final SubLList $list209 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("CAPACITY"), makeSymbol("FACCESS"), makeSymbol("SIZE"), makeSymbol("CLEAR-WHEN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list210 = list($TEST, makeKeyword("CAPACITY"), makeKeyword("FACCESS"), $SIZE, makeKeyword("CLEAR-WHEN"));

    private static final SubLList $list213 = list(makeSymbol("NAME"), list(makeSymbol("ARG")), list(makeSymbol("SIZE"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list214 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("SIZE"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list215 = list(makeKeyword("HL-STORE-MODIFIED"), makeKeyword("GENL-MT-MODIFIED"), makeKeyword("GENL-PREDS-MODIFIED"), makeKeyword("GENLS-MODIFIED"), makeKeyword("ISA-MODIFIED"), makeKeyword("QUOTED-ISA-MODIFIED"), makeKeyword("WFF-CONSTRAINT-MODIFIED"));

    private static final SubLSymbol CACHE_CLEAR_TRIGGER_P = makeSymbol("CACHE-CLEAR-TRIGGER-P");

    private static final SubLSymbol $sym217$RESULTS = makeUninternedSymbol("RESULTS");

    private static final SubLSymbol $sym218$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    private static final SubLSymbol CREATE_GLOBAL_CACHING_STATE_FOR_NAME = makeSymbol("CREATE-GLOBAL-CACHING-STATE-FOR-NAME");

    private static final SubLSymbol $sym220$SXHASH = makeUninternedSymbol("SXHASH");

    private static final SubLSymbol $sym221$RESULTS = makeUninternedSymbol("RESULTS");

    private static final SubLSymbol $sym222$COLLISIONS = makeUninternedSymbol("COLLISIONS");

    private static final SubLSymbol $sym223$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    private static final SubLString $$$global_caching_lock_for_ = makeString("global caching lock for ");

    private static final SubLString $str226$__A_RW_LOCK_ = makeString("*~A-RW-LOCK*");

    private static final SubLString $str227$__A_CACHING_STATE_ = makeString("*~A-CACHING-STATE*");

    private static final SubLString $str229$CLEAR__A = makeString("CLEAR-~A");

    static private final SubLList $list230 = list(makeSymbol("PROGN"));

    private static final SubLSymbol $HL_STORE_MODIFIED = makeKeyword("HL-STORE-MODIFIED");

    private static final SubLSymbol REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol $GENL_MT_MODIFIED = makeKeyword("GENL-MT-MODIFIED");

    private static final SubLSymbol REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol $GENL_PREDS_MODIFIED = makeKeyword("GENL-PREDS-MODIFIED");

    private static final SubLSymbol REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol $QUOTED_ISA_MODIFIED = makeKeyword("QUOTED-ISA-MODIFIED");

    private static final SubLSymbol REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol $WFF_CONSTRAINT_MODIFIED = makeKeyword("WFF-CONSTRAINT-MODIFIED");

    private static final SubLSymbol REGISTER_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACK = makeSymbol("REGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK");

    private static final SubLSymbol CS = makeSymbol("CS");

    private static final SubLList $list246 = list(list(makeSymbol("PWHEN"), makeSymbol("CS"), list(makeSymbol("CACHING-STATE-CLEAR"), makeSymbol("CS"))));

    private static final SubLList $list247 = list(list(RET, NIL));

    private static final SubLString $str248$REMOVE__A = makeString("REMOVE-~A");

    private static final SubLSymbol CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS = makeSymbol("CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS");

    public static final SubLSymbol $hl_store_cache_clear_callbacks$ = makeSymbol("*HL-STORE-CACHE-CLEAR-CALLBACKS*");

    public static final SubLSymbol $mt_dependent_cache_clear_callbacks$ = makeSymbol("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*");

    private static final SubLList $list252 = list(list(makeSymbol("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*"), T));

    public static final SubLSymbol $genl_preds_dependent_cache_clear_callbacks$ = makeSymbol("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*");

    public static final SubLSymbol $genls_dependent_cache_clear_callbacks$ = makeSymbol("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*");

    public static final SubLSymbol $wff_constraint_dependent_cache_clear_callbacks$ = makeSymbol("*WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACKS*");

    public static final SubLSymbol $isa_dependent_cache_clear_callbacks$ = makeSymbol("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*");

    public static final SubLSymbol $quoted_isa_dependent_cache_clear_callbacks$ = makeSymbol("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*");

    private static final SubLList $list258 = list(list(makeSymbol("ANSWER"), makeSymbol("&KEY"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("FORM"));

    private static final SubLList $list259 = list($TEST);

    private static final SubLList $list260 = list(makeSymbol("ERROR"), makeString("Unimplemented macro memoized-already."));

    private static final SubLList $list261 = list(makeSymbol("ERROR"), makeString("Unimplemented macro cached-already."));

    private static final SubLSymbol $sym262$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLList $list263 = list(makeSymbol("DEFINE-CACHED-NEW"), makeSymbol("DEFINE-MEMOIZED"));

    private static final SubLSymbol NOTE_GLOBALLY_CACHED_FUNCTION = makeSymbol("NOTE-GLOBALLY-CACHED-FUNCTION");

    private static final SubLString $str265$_A_INTERNAL = makeString("~A-INTERNAL");

    private static final SubLList $list267 = list(makeSymbol("EXTERNAL"), makeSymbol("API-PROVISIONAL"));

    private static final SubLSymbol REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");

    private static final SubLSymbol PUBLIC = makeSymbol("PUBLIC");

    private static final SubLSymbol API = makeSymbol("API");

    private static final SubLSymbol REGISTER_CYC_API_FUNCTION = makeSymbol("REGISTER-CYC-API-FUNCTION");

    private static final SubLList $list272 = list(makeString(""), NIL, NIL);

    private static final SubLList $list273 = list(makeSymbol("PRIVATE"), makeSymbol("PROTECTED"), makeSymbol("PUBLIC"));

    private static final SubLString $str274$_A_is_not_a_known_FACCESS_visibil = makeString("~A is not a known FACCESS visibility type for cached functions.");

    static final boolean assertionsDisabledSynth = true;

    public static final SubLObject note_cached_function_called_alt(SubLObject name) {
        {
            SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                {
                    SubLObject count = gethash_without_values(name, $cache_monitor_hash$.getGlobalValue(), ZERO_INTEGER);
                    count = add(ONE_INTEGER, count);
                    sethash(name, $cache_monitor_hash$.getGlobalValue(), count);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    public static SubLObject note_cached_function_called(final SubLObject name) {
        final SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject count = gethash_without_values(name, $cache_monitor_hash$.getGlobalValue(), ZERO_INTEGER);
            count = add(ONE_INTEGER, count);
            sethash(name, $cache_monitor_hash$.getGlobalValue(), count);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static final SubLObject note_cached_function_called_but_not_cached_alt(SubLObject name) {
        {
            SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                {
                    SubLObject count = gethash_without_values(name, $cache_monitor_failure_hash$.getGlobalValue(), ZERO_INTEGER);
                    count = add(ONE_INTEGER, count);
                    sethash(name, $cache_monitor_failure_hash$.getGlobalValue(), count);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    public static SubLObject note_cached_function_called_but_not_cached(final SubLObject name) {
        final SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject count = gethash_without_values(name, $cache_monitor_failure_hash$.getGlobalValue(), ZERO_INTEGER);
            count = add(ONE_INTEGER, count);
            sethash(name, $cache_monitor_failure_hash$.getGlobalValue(), count);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static final SubLObject show_function_caching_results_alt() {
        {
            SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                {
                    SubLObject calls = hash_table_utilities.hash_table_to_alist($cache_monitor_hash$.getGlobalValue());
                    SubLObject uncached_calls = hash_table_utilities.hash_table_to_alist($cache_monitor_failure_hash$.getGlobalValue());
                    calls = Sort.sort(calls, symbol_function($sym4$_), symbol_function(CDR));
                    uncached_calls = Sort.sort(uncached_calls, symbol_function($sym4$_), symbol_function(CDR));
                    {
                        SubLObject cdolist_list_var = calls;
                        SubLObject call = NIL;
                        for (call = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , call = cdolist_list_var.first()) {
                            format(T, $str_alt6$Cached_Function_Call___S__S___, call.first(), call.rest());
                        }
                    }
                    {
                        SubLObject cdolist_list_var = uncached_calls;
                        SubLObject call = NIL;
                        for (call = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , call = cdolist_list_var.first()) {
                            format(T, $str_alt7$Missed_Cached_Function_Call___S__, call.first(), call.rest());
                        }
                    }
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    public static SubLObject show_function_caching_results() {
        final SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            SubLObject calls = hash_table_utilities.hash_table_to_alist($cache_monitor_hash$.getGlobalValue());
            SubLObject uncached_calls = hash_table_utilities.hash_table_to_alist($cache_monitor_failure_hash$.getGlobalValue());
            calls = Sort.sort(calls, symbol_function($sym4$_), symbol_function(CDR));
            uncached_calls = Sort.sort(uncached_calls, symbol_function($sym4$_), symbol_function(CDR));
            SubLObject cdolist_list_var = calls;
            SubLObject call = NIL;
            call = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str6$Cached_Function_Call___S__S___, call.first(), call.rest());
                cdolist_list_var = cdolist_list_var.rest();
                call = cdolist_list_var.first();
            } 
            cdolist_list_var = uncached_calls;
            call = NIL;
            call = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str7$Missed_Cached_Function_Call___S__, call.first(), call.rest());
                cdolist_list_var = cdolist_list_var.rest();
                call = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static final SubLObject clear_function_caching_results_alt() {
        {
            SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                clrhash($cache_monitor_hash$.getGlobalValue());
                clrhash($cache_monitor_failure_hash$.getGlobalValue());
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    public static SubLObject clear_function_caching_results() {
        final SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            clrhash($cache_monitor_hash$.getGlobalValue());
            clrhash($cache_monitor_failure_hash$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with the specified caching assumptions.
     * DISABLE, if provided, must be :ALL and indicates all caching is disabled.
     * ENABLE, if provided, must be :ALL and indicates all caching is enabled.
     * If neither is provided, the caching assumptions are left unchanged.
     * If both are provided, DISABLE overrides ENABLE.
     */
    @LispMethod(comment = "Execute BODY with the specified caching assumptions.\r\nDISABLE, if provided, must be :ALL and indicates all caching is disabled.\r\nENABLE, if provided, must be :ALL and indicates all caching is enabled.\r\nIf neither is provided, the caching assumptions are left unchanged.\r\nIf both are provided, DISABLE overrides ENABLE.\nExecute BODY with the specified caching assumptions.\nDISABLE, if provided, must be :ALL and indicates all caching is disabled.\nENABLE, if provided, must be :ALL and indicates all caching is enabled.\nIf neither is provided, the caching assumptions are left unchanged.\nIf both are provided, DISABLE overrides ENABLE.")
    public static final SubLObject with_caching_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt10);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            if (NIL == member(current_1, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                        {
                            SubLObject disable_tail = property_list_member($DISABLE, current);
                            SubLObject disable = (NIL != disable_tail) ? ((SubLObject) (cadr(disable_tail))) : NIL;
                            SubLObject enable_tail = property_list_member($ENABLE, current);
                            SubLObject enable = (NIL != enable_tail) ? ((SubLObject) (cadr(enable_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != disable) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if ($ALL != disable) {
                                            Errors.error($str_alt15$DISABLE_must_be__ALL);
                                        }
                                    }
                                }
                                if (NIL != enable) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if ($ALL != enable) {
                                            Errors.error($str_alt16$ENABLE_must_be__ALL);
                                        }
                                    }
                                }
                                return listS(CLET, $list_alt18, append(NIL != enable ? ((SubLObject) (list(list(CACHING_MODE_ENABLE, enable)))) : NIL, NIL != disable ? ((SubLObject) (list(list(CACHING_MODE_DISABLE, disable)))) : NIL, body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY with the specified caching assumptions.
     * DISABLE, if provided, must be :ALL and indicates all caching is disabled.
     * ENABLE, if provided, must be :ALL and indicates all caching is enabled.
     * If neither is provided, the caching assumptions are left unchanged.
     * If both are provided, DISABLE overrides ENABLE.
     */
    @LispMethod(comment = "Execute BODY with the specified caching assumptions.\r\nDISABLE, if provided, must be :ALL and indicates all caching is disabled.\r\nENABLE, if provided, must be :ALL and indicates all caching is enabled.\r\nIf neither is provided, the caching assumptions are left unchanged.\r\nIf both are provided, DISABLE overrides ENABLE.\nExecute BODY with the specified caching assumptions.\nDISABLE, if provided, must be :ALL and indicates all caching is disabled.\nENABLE, if provided, must be :ALL and indicates all caching is enabled.\nIf neither is provided, the caching assumptions are left unchanged.\nIf both are provided, DISABLE overrides ENABLE.")
    public static SubLObject with_caching_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list10);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list10);
            if (NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list10);
        }
        final SubLObject disable_tail = property_list_member($DISABLE, current);
        final SubLObject disable = (NIL != disable_tail) ? cadr(disable_tail) : NIL;
        final SubLObject enable_tail = property_list_member($ENABLE, current);
        final SubLObject enable = (NIL != enable_tail) ? cadr(enable_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (((NIL != disable) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && ($ALL != disable)) {
            Errors.error($str15$DISABLE_must_be__ALL);
        }
        if (((NIL != enable) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && ($ALL != enable)) {
            Errors.error($str16$ENABLE_must_be__ALL);
        }
        return listS(CLET, $list18, append(NIL != enable ? list(list(CACHING_MODE_ENABLE, enable)) : NIL, NIL != disable ? list(list(CACHING_MODE_DISABLE, disable)) : NIL, body, NIL));
    }

    public static final SubLObject caching_mode_enable_alt(SubLObject enable) {
        if (enable == UNPROVIDED) {
            enable = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if ($ALL != enable) {
                    Errors.error($str_alt16$ENABLE_must_be__ALL);
                }
            }
            $function_caching_enabledP$.setDynamicValue(T, thread);
            $caching_mode_enabled$.setDynamicValue(enable, thread);
            return $function_caching_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject caching_mode_enable(SubLObject enable) {
        if (enable == UNPROVIDED) {
            enable = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ALL != enable)) {
            Errors.error($str16$ENABLE_must_be__ALL);
        }
        $function_caching_enabledP$.setDynamicValue(T, thread);
        $caching_mode_enabled$.setDynamicValue(enable, thread);
        return $function_caching_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject caching_mode_disable_alt(SubLObject disable) {
        if (disable == UNPROVIDED) {
            disable = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if ($ALL != disable) {
                    Errors.error($str_alt15$DISABLE_must_be__ALL);
                }
            }
            $function_caching_enabledP$.setDynamicValue(NIL, thread);
            $caching_mode_disabled$.setDynamicValue(disable, thread);
            return $function_caching_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject caching_mode_disable(SubLObject disable) {
        if (disable == UNPROVIDED) {
            disable = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ALL != disable)) {
            Errors.error($str15$DISABLE_must_be__ALL);
        }
        $function_caching_enabledP$.setDynamicValue(NIL, thread);
        $caching_mode_disabled$.setDynamicValue(disable, thread);
        return $function_caching_enabledP$.getDynamicValue(thread);
    }

    /**
     * Return T iff caching of FUNCTION is currently disabled.
     */
    @LispMethod(comment = "Return T iff caching of FUNCTION is currently disabled.")
    public static final SubLObject caching_disabled_alt(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $function_caching_enabledP$.getDynamicValue(thread)) {
                return T;
            }
            if (NIL == $caching_mode_disabled$.getDynamicValue(thread)) {
                return NIL;
            } else {
                if ($ALL != $caching_mode_disabled$.getDynamicValue(thread)) {
                    return subl_promotions.memberP(function, $caching_mode_disabled$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED);
                } else {
                    if ($ALL == $caching_mode_enabled$.getDynamicValue(thread)) {
                        return NIL;
                    } else {
                        return makeBoolean(NIL == subl_promotions.memberP(function, $caching_mode_enabled$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED));
                    }
                }
            }
        }
    }

    /**
     * Return T iff caching of FUNCTION is currently disabled.
     */
    @LispMethod(comment = "Return T iff caching of FUNCTION is currently disabled.")
    public static SubLObject caching_disabled(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $function_caching_enabledP$.getDynamicValue(thread)) {
            return T;
        }
        if (NIL == $caching_mode_disabled$.getDynamicValue(thread)) {
            return NIL;
        }
        if ($ALL != $caching_mode_disabled$.getDynamicValue(thread)) {
            return subl_promotions.memberP(function, $caching_mode_disabled$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED);
        }
        if ($ALL == $caching_mode_enabled$.getDynamicValue(thread)) {
            return NIL;
        }
        return makeBoolean(NIL == subl_promotions.memberP(function, $caching_mode_enabled$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED));
    }

    public static final SubLObject sxhash_calc_n_alt(SubLObject args_list) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            SubLObject cdolist_list_var = args_list;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                composite_state = sxhash_update_state(composite_state);
                composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg), composite_state), composite_hash);
            }
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_n(final SubLObject args_list) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        SubLObject cdolist_list_var = args_list;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg), composite_state), composite_hash);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        sxhash = composite_hash;
        return sxhash;
    }

    public static final SubLObject sxhash_calc_10_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8, SubLObject arg9, SubLObject arg10) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg9), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg10), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_10(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg9), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg10), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_9_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8, SubLObject arg9) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg9), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_9(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg9), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_8_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_8(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_7_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_7(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_6_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_6(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_5_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_5(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_4_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_4(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_3_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_3(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject sxhash_calc_2_alt(SubLObject arg1, SubLObject arg2) {
        {
            SubLObject sxhash = ZERO_INTEGER;
            SubLObject composite_state = FOUR_INTEGER;
            SubLObject composite_hash = $int$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
            sxhash = composite_hash;
            return sxhash;
        }
    }

    public static SubLObject sxhash_calc_2(final SubLObject arg1, final SubLObject arg2) {
        SubLObject sxhash = ZERO_INTEGER;
        SubLObject composite_state = FOUR_INTEGER;
        SubLObject composite_hash = $int$167;
        composite_state = sxhash_update_state(composite_state);
        composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = sxhash_update_state(composite_state);
        composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        return sxhash;
    }

    public static final SubLObject possibly_with_memoization_state_writer_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, list(list(LOCK, list(MEMOIZATION_STATE_LOCK, state))), list(PIF, LOCK, listS(CLET, $list_alt26, list(WITH_WRITER_LOCK, $list_alt28, listS(CSETQ, RESULT, append(body, NIL))), $list_alt31), bq_cons(RET, append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_memoization_state_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list(LOCK, list(MEMOIZATION_STATE_LOCK, state))), list(PIF, LOCK, listS(CLET, $list26, list(WITH_WRITER_LOCK, $list28, listS(CSETQ, RESULT, append(body, NIL))), $list31), bq_cons(RET, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static final SubLObject possibly_with_memoization_state_reader_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, list(list(LOCK, list(MEMOIZATION_STATE_LOCK, state))), list(PIF, LOCK, listS(CLET, $list_alt26, list(WITH_READER_LOCK, $list_alt28, listS(CSETQ, RESULT, append(body, NIL))), $list_alt31), bq_cons(RET, append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_memoization_state_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list(LOCK, list(MEMOIZATION_STATE_LOCK, state))), list(PIF, LOCK, listS(CLET, $list26, list(WITH_READER_LOCK, $list28, listS(CSETQ, RESULT, append(body, NIL))), $list31), bq_cons(RET, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static final SubLObject possibly_with_caching_state_writer_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject lock = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    lock = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, lock, listS(CLET, $list_alt26, list(WITH_WRITER_LOCK, list(lock), listS(CSETQ, RESULT, append(body, NIL))), $list_alt31), bq_cons(RET, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt34);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_caching_state_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        lock = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, lock, listS(CLET, $list26, list(WITH_WRITER_LOCK, list(lock), listS(CSETQ, RESULT, append(body, NIL))), $list31), bq_cons(RET, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list34);
        return NIL;
    }

    public static final SubLObject possibly_with_caching_state_reader_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject lock = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    lock = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, lock, listS(CLET, $list_alt26, list(WITH_READER_LOCK, list(lock), listS(CSETQ, RESULT, append(body, NIL))), $list_alt31), bq_cons(RET, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt34);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_caching_state_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        lock = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, lock, listS(CLET, $list26, list(WITH_READER_LOCK, list(lock), listS(CSETQ, RESULT, append(body, NIL))), $list31), bq_cons(RET, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list34);
        return NIL;
    }

    public static final SubLObject caching_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_caching_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject caching_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_caching_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject caching_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.memoization_state.$caching_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject caching_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.memoization_state.$caching_state_native.class ? T : NIL;
    }

    public static final SubLObject caching_state_store_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject caching_state_store(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject caching_state_zero_arg_results_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject caching_state_zero_arg_results(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject caching_state_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject caching_state_lock(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject caching_state_capacity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject caching_state_capacity(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject caching_state_func_symbol_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject caching_state_func_symbol(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject caching_state_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject caching_state_test(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject caching_state_args_length_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject caching_state_args_length(final SubLObject v_object) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_caching_state_store_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_caching_state_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_caching_state_zero_arg_results_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_caching_state_zero_arg_results(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_caching_state_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_caching_state_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_caching_state_capacity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_caching_state_capacity(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_caching_state_func_symbol_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_caching_state_func_symbol(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_caching_state_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_caching_state_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_caching_state_args_length_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHING_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_caching_state_args_length(final SubLObject v_object, final SubLObject value) {
        assert NIL != caching_state_p(v_object) : "! memoization_state.caching_state_p(v_object) " + "memoization_state.caching_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_caching_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.memoization_state.$caching_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STORE)) {
                        _csetf_caching_state_store(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ZERO_ARG_RESULTS)) {
                            _csetf_caching_state_zero_arg_results(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LOCK)) {
                                _csetf_caching_state_lock(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CAPACITY)) {
                                    _csetf_caching_state_capacity(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($FUNC_SYMBOL)) {
                                        _csetf_caching_state_func_symbol(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($TEST)) {
                                            _csetf_caching_state_test(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ARGS_LENGTH)) {
                                                _csetf_caching_state_args_length(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt64$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_caching_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.memoization_state.$caching_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STORE)) {
                _csetf_caching_state_store(v_new, current_value);
            } else
                if (pcase_var.eql($ZERO_ARG_RESULTS)) {
                    _csetf_caching_state_zero_arg_results(v_new, current_value);
                } else
                    if (pcase_var.eql($LOCK)) {
                        _csetf_caching_state_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($CAPACITY)) {
                            _csetf_caching_state_capacity(v_new, current_value);
                        } else
                            if (pcase_var.eql($FUNC_SYMBOL)) {
                                _csetf_caching_state_func_symbol(v_new, current_value);
                            } else
                                if (pcase_var.eql($TEST)) {
                                    _csetf_caching_state_test(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARGS_LENGTH)) {
                                        _csetf_caching_state_args_length(v_new, current_value);
                                    } else {
                                        Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_caching_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CACHING_STATE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STORE, caching_state_store(obj));
        funcall(visitor_fn, obj, $SLOT, $ZERO_ARG_RESULTS, caching_state_zero_arg_results(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, caching_state_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $CAPACITY, caching_state_capacity(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNC_SYMBOL, caching_state_func_symbol(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, caching_state_test(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGS_LENGTH, caching_state_args_length(obj));
        funcall(visitor_fn, obj, $END, MAKE_CACHING_STATE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_caching_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_caching_state(obj, visitor_fn);
    }

    public static final SubLObject create_caching_state_alt(SubLObject lock, SubLObject func_symbol, SubLObject func_args_length, SubLObject capacity, SubLObject test, SubLObject initial_size) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (initial_size == UNPROVIDED) {
            initial_size = ZERO_INTEGER;
        }
        {
            SubLObject cs = make_caching_state(UNPROVIDED);
            SubLTrampolineFile.enforceType(initial_size, NON_NEGATIVE_INTEGER_P);
            if (NIL != capacity) {
                SubLTrampolineFile.enforceType(capacity, POSITIVE_INTEGER_P);
            }
            SubLTrampolineFile.enforceType(func_symbol, SYMBOLP);
            if (test.isSymbol()) {
                test = symbol_function(test);
            }
            SubLTrampolineFile.enforceType(test, FUNCTION_SPEC_P);
            if (NIL != capacity) {
                _csetf_caching_state_store(cs, cache.new_cache(capacity, func_args_length.eql(ONE_INTEGER) ? ((SubLObject) (test)) : symbol_function(EQL)));
            } else {
                _csetf_caching_state_store(cs, dictionary.new_dictionary(func_args_length.eql(ONE_INTEGER) ? ((SubLObject) (test)) : symbol_function(EQL), initial_size));
            }
            _csetf_caching_state_lock(cs, lock);
            _csetf_caching_state_capacity(cs, capacity);
            _csetf_caching_state_func_symbol(cs, func_symbol);
            _csetf_caching_state_test(cs, test);
            _csetf_caching_state_args_length(cs, func_args_length);
            _csetf_caching_state_zero_arg_results(cs, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
            return cs;
        }
    }

    public static SubLObject create_caching_state(final SubLObject lock, final SubLObject func_symbol, final SubLObject func_args_length, SubLObject capacity, SubLObject test, SubLObject initial_size) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (initial_size == UNPROVIDED) {
            initial_size = ZERO_INTEGER;
        }
        final SubLObject cs = make_caching_state(UNPROVIDED);
        SubLTrampolineFile.enforceType(initial_size, NON_NEGATIVE_INTEGER_P);
        if (NIL != capacity) {
            SubLTrampolineFile.enforceType(capacity, POSITIVE_INTEGER_P);
        }
        SubLTrampolineFile.enforceType(func_symbol, SYMBOLP);
        if (test.isSymbol()) {
            test = symbol_function(test);
        }
        SubLTrampolineFile.enforceType(test, FUNCTION_SPEC_P);
        if (NIL != capacity) {
            _csetf_caching_state_store(cs, cache.new_cache(capacity, func_args_length.eql(ONE_INTEGER) ? test : symbol_function(EQL)));
        } else {
            _csetf_caching_state_store(cs, dictionary.new_dictionary(func_args_length.eql(ONE_INTEGER) ? test : symbol_function(EQL), initial_size));
        }
        _csetf_caching_state_lock(cs, lock);
        _csetf_caching_state_capacity(cs, capacity);
        _csetf_caching_state_func_symbol(cs, func_symbol);
        _csetf_caching_state_test(cs, test);
        _csetf_caching_state_args_length(cs, func_args_length);
        _csetf_caching_state_zero_arg_results(cs, $memoized_item_not_found$.getGlobalValue());
        return cs;
    }

    public static final SubLObject print_caching_state_internal_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt70$__caching_state_function___A_lock, new SubLObject[]{ caching_state_func_symbol(v_object), caching_state_lock(v_object), caching_state_capacity(v_object), caching_state_test(v_object) });
        if (NIL != caching_state_capacity(v_object)) {
            cache.cache_print(caching_state_store(v_object), stream, depth);
        } else {
            dictionary_utilities.print_dictionary_contents(caching_state_store(v_object), stream);
        }
        format(stream, $str_alt71$_);
        return v_object;
    }

    public static SubLObject print_caching_state_internal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str76$__caching_state_function___A_lock, new SubLObject[]{ caching_state_func_symbol(v_object), caching_state_lock(v_object), caching_state_capacity(v_object), caching_state_test(v_object) });
        format(stream, $str77$_);
        return v_object;
    }

    public static final SubLObject print_caching_state_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLTrampolineFile.enforceType(v_object, CACHING_STATE_P);
        if (NIL != caching_state_lock(v_object)) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = caching_state_lock(v_object);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = print_caching_state_internal(v_object, stream, depth);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return print_caching_state_internal(v_object, stream, depth);
        }
    }

    public static SubLObject print_caching_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        SubLTrampolineFile.enforceType(v_object, CACHING_STATE_P);
        if (NIL != caching_state_lock(v_object)) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = caching_state_lock(v_object);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = print_caching_state_internal(v_object, stream, depth);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return print_caching_state_internal(v_object, stream, depth);
    }

    public static final SubLObject caching_state_get_zero_arg_results_internal_alt(SubLObject caching_state) {
        return caching_state_zero_arg_results(caching_state);
    }

    public static SubLObject caching_state_get_zero_arg_results_internal(final SubLObject caching_state) {
        return caching_state_zero_arg_results(caching_state);
    }

    public static final SubLObject caching_state_get_zero_arg_results_alt(SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = caching_state_zero_arg_results(caching_state);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_zero_arg_results(caching_state);
        }
    }

    public static SubLObject caching_state_get_zero_arg_results(final SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_zero_arg_results(caching_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_zero_arg_results(caching_state);
    }

    public static final SubLObject caching_state_set_zero_arg_results_internal_alt(SubLObject caching_state, SubLObject val) {
        _csetf_caching_state_zero_arg_results(caching_state, val);
        return NIL;
    }

    public static SubLObject caching_state_set_zero_arg_results_internal(final SubLObject caching_state, final SubLObject val) {
        _csetf_caching_state_zero_arg_results(caching_state, val);
        return NIL;
    }

    public static final SubLObject caching_state_set_zero_arg_results_alt(SubLObject caching_state, SubLObject val, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    result = caching_state_set_zero_arg_results_internal(caching_state, val);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_set_zero_arg_results_internal(caching_state, val);
        }
    }

    public static SubLObject caching_state_set_zero_arg_results(final SubLObject caching_state, final SubLObject val, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_set_zero_arg_results_internal(caching_state, val);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_set_zero_arg_results_internal(caching_state, val);
    }

    public static final SubLObject caching_state_lookup_internal_alt(SubLObject caching_state, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $kw69$_MEMOIZED_ITEM_NOT_FOUND_;
        }
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_get_without_values(caching_state_store(caching_state), key, v_default);
        } else {
            return dictionary.dictionary_lookup(caching_state_store(caching_state), key, v_default);
        }
    }

    public static SubLObject caching_state_lookup_internal(final SubLObject caching_state, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $memoized_item_not_found$.getGlobalValue();
        }
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_get_without_values(caching_state_store(caching_state), key, v_default);
        }
        return dictionary.dictionary_lookup_without_values(caching_state_store(caching_state), key, v_default);
    }

    public static final SubLObject caching_state_lookup_alt(SubLObject caching_state, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $kw69$_MEMOIZED_ITEM_NOT_FOUND_;
        }
        if (NIL != caching_state_lock(caching_state)) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = caching_state_lock(caching_state);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = caching_state_lookup_internal(caching_state, key, v_default);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_lookup_internal(caching_state, key, v_default);
        }
    }

    public static SubLObject caching_state_lookup(final SubLObject caching_state, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $memoized_item_not_found$.getGlobalValue();
        }
        if (NIL != caching_state_lock(caching_state)) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_lookup_internal(caching_state, key, v_default);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_lookup_internal(caching_state, key, v_default);
    }

    public static final SubLObject caching_state_put_internal_alt(SubLObject caching_state, SubLObject key, SubLObject value) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_set(caching_state_store(caching_state), key, value);
        } else {
            return dictionary.dictionary_enter(caching_state_store(caching_state), key, value);
        }
    }

    public static SubLObject caching_state_put_internal(final SubLObject caching_state, final SubLObject key, final SubLObject value) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_set(caching_state_store(caching_state), key, value);
        }
        return dictionary.dictionary_enter(caching_state_store(caching_state), key, value);
    }

    public static final SubLObject caching_state_put_alt(SubLObject caching_state, SubLObject key, SubLObject value, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    result = caching_state_put_internal(caching_state, key, value);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_put_internal(caching_state, key, value);
        }
    }

    public static SubLObject caching_state_put(final SubLObject caching_state, final SubLObject key, final SubLObject value, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_put_internal(caching_state, key, value);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_put_internal(caching_state, key, value);
    }

    public static final SubLObject caching_state_clear_internal_alt(SubLObject caching_state) {
        if (NIL != caching_state_capacity(caching_state)) {
            cache.cache_clear(caching_state_store(caching_state));
        } else {
            dictionary.clear_dictionary(caching_state_store(caching_state));
        }
        _csetf_caching_state_zero_arg_results(caching_state, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
        return NIL;
    }

    public static SubLObject caching_state_clear_internal(final SubLObject caching_state) {
        if (NIL != caching_state_capacity(caching_state)) {
            cache.cache_clear(caching_state_store(caching_state));
        } else {
            dictionary.clear_dictionary(caching_state_store(caching_state));
        }
        _csetf_caching_state_zero_arg_results(caching_state, $memoized_item_not_found$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject caching_state_clear_alt(SubLObject caching_state) {
        if (NIL == caching_state) {
            return NIL;
        }
        SubLTrampolineFile.enforceType(caching_state, CACHING_STATE_P);
        if (NIL != caching_state_lock(caching_state)) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = caching_state_lock(caching_state);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    result = caching_state_clear_internal(caching_state);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_clear_internal(caching_state);
        }
    }

    public static SubLObject caching_state_clear(final SubLObject caching_state) {
        if (NIL == caching_state) {
            return NIL;
        }
        SubLTrampolineFile.enforceType(caching_state, CACHING_STATE_P);
        if (NIL != caching_state_lock(caching_state)) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_clear_internal(caching_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_clear_internal(caching_state);
    }

    public static final SubLObject caching_state_get_capacity_alt(SubLObject caching_state) {
        return caching_state_capacity(caching_state);
    }

    public static SubLObject caching_state_get_capacity(final SubLObject caching_state) {
        return caching_state_capacity(caching_state);
    }

    public static final SubLObject caching_state_get_func_symbol_alt(SubLObject caching_state) {
        return caching_state_func_symbol(caching_state);
    }

    public static SubLObject caching_state_get_func_symbol(final SubLObject caching_state) {
        return caching_state_func_symbol(caching_state);
    }

    public static final SubLObject caching_state_get_test_alt(SubLObject caching_state) {
        return caching_state_test(caching_state);
    }

    public static SubLObject caching_state_get_test(final SubLObject caching_state) {
        return caching_state_test(caching_state);
    }

    public static final SubLObject caching_state_keys_internal_alt(SubLObject caching_state) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_keys(caching_state_store(caching_state));
        } else {
            return dictionary.dictionary_keys(caching_state_store(caching_state));
        }
    }

    public static SubLObject caching_state_keys_internal(final SubLObject caching_state) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_keys(caching_state_store(caching_state));
        }
        return dictionary.dictionary_keys(caching_state_store(caching_state));
    }

    public static final SubLObject caching_state_keys_alt(SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = caching_state_keys_internal(caching_state);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_keys_internal(caching_state);
        }
    }

    public static SubLObject caching_state_keys(final SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_keys_internal(caching_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_keys_internal(caching_state);
    }

    public static final SubLObject caching_state_size_internal_alt(SubLObject caching_state) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_size(caching_state_store(caching_state));
        } else {
            return dictionary.dictionary_length(caching_state_store(caching_state));
        }
    }

    public static SubLObject caching_state_size_internal(final SubLObject caching_state) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_size(caching_state_store(caching_state));
        }
        return dictionary.dictionary_length(caching_state_store(caching_state));
    }

    public static final SubLObject caching_state_size_alt(SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = caching_state_size_internal(caching_state);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_size_internal(caching_state);
        }
    }

    public static SubLObject caching_state_size(final SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_size_internal(caching_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_size_internal(caching_state);
    }

    public static SubLObject caching_state_size_robust(final SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        if (NIL != caching_state) {
            return caching_state_size(caching_state, NIL != lock ? lock : caching_state_lock(caching_state));
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject caching_state_remove_internal_alt(SubLObject caching_state, SubLObject item) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_remove(caching_state_store(caching_state), item);
        } else {
            return dictionary.dictionary_remove(caching_state_store(caching_state), item);
        }
    }

    public static SubLObject caching_state_remove_internal(final SubLObject caching_state, final SubLObject item) {
        if (NIL != caching_state_capacity(caching_state)) {
            return cache.cache_remove(caching_state_store(caching_state), item);
        }
        return dictionary.dictionary_remove(caching_state_store(caching_state), item);
    }

    public static final SubLObject caching_state_remove_alt(SubLObject caching_state, SubLObject item, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    result = caching_state_remove_internal(caching_state, item);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_remove_internal(caching_state, item);
        }
    }

    public static SubLObject caching_state_remove(final SubLObject caching_state, final SubLObject item, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_remove_internal(caching_state, item);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_remove_internal(caching_state, item);
    }

    public static final SubLObject caching_state_remove_function_results_with_args_internal_alt(SubLObject caching_state, SubLObject args_list, SubLObject sxhash) {
        if (sxhash == UNPROVIDED) {
            sxhash = NIL;
        }
        {
            SubLObject args_count = length(args_list);
            if (args_count.eql(ZERO_INTEGER)) {
                _csetf_caching_state_zero_arg_results(caching_state, $kw69$_MEMOIZED_ITEM_NOT_FOUND_);
                return NIL;
            }
            if (args_count.eql(ONE_INTEGER)) {
                caching_state_remove_internal(caching_state, args_list.first());
                return NIL;
            }
        }
        if (NIL == sxhash) {
            sxhash = sxhash_calc_n(args_list);
        }
        {
            SubLObject collisions = caching_state_lookup_internal(caching_state, sxhash, UNPROVIDED);
            SubLObject cur = collisions;
            SubLObject prev = NIL;
            SubLObject args_length = length(args_list);
            SubLObject args_length_minus_one = subtract(args_length, ONE_INTEGER);
            SubLObject test = caching_state_test(caching_state);
            if (collisions == $kw69$_MEMOIZED_ITEM_NOT_FOUND_) {
                return NIL;
            }
            while (NIL != cur) {
                {
                    SubLObject datum = cur.first();
                    SubLObject current = datum;
                    SubLObject cached_args = NIL;
                    SubLObject result = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    cached_args = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    result = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(args_length); i = add(i, ONE_INTEGER)) {
                                if (NIL != funcall(test, args_list.first(), cached_args.first())) {
                                    if (i == args_length_minus_one) {
                                        if (cached_args.rest() == NIL) {
                                            if (NIL != prev) {
                                                return rplacd(prev, cur.rest());
                                            } else {
                                                if (NIL != cur.rest()) {
                                                    return caching_state_put_internal(caching_state, sxhash, cur.rest());
                                                } else {
                                                    return caching_state_remove_internal(caching_state, sxhash);
                                                }
                                            }
                                        }
                                    } else {
                                        args_list = args_list.rest();
                                        cached_args = cached_args.rest();
                                    }
                                } else {
                                    i = args_length;
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt72);
                    }
                }
                prev = cur;
                cur = cur.rest();
            } 
            return NIL;
        }
    }

    public static SubLObject caching_state_remove_function_results_with_args_internal(final SubLObject caching_state, SubLObject args_list, SubLObject sxhash) {
        if (sxhash == UNPROVIDED) {
            sxhash = NIL;
        }
        final SubLObject args_count = length(args_list);
        if (args_count.eql(ZERO_INTEGER)) {
            _csetf_caching_state_zero_arg_results(caching_state, $memoized_item_not_found$.getGlobalValue());
            return NIL;
        }
        if (args_count.eql(ONE_INTEGER)) {
            caching_state_remove_internal(caching_state, args_list.first());
            return NIL;
        }
        if (NIL == sxhash) {
            sxhash = sxhash_calc_n(args_list);
        }
        SubLObject cur;
        final SubLObject collisions = cur = caching_state_lookup_internal(caching_state, sxhash, UNPROVIDED);
        SubLObject prev = NIL;
        final SubLObject args_length = length(args_list);
        final SubLObject args_length_minus_one = subtract(args_length, ONE_INTEGER);
        final SubLObject test = caching_state_test(caching_state);
        if (collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            return NIL;
        }
        while (NIL != cur) {
            SubLObject current;
            final SubLObject datum = current = cur.first();
            SubLObject cached_args = NIL;
            SubLObject result = NIL;
            destructuring_bind_must_consp(current, datum, $list78);
            cached_args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            result = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(args_length); i = add(i, ONE_INTEGER)) {
                    if (NIL != funcall(test, args_list.first(), cached_args.first())) {
                        if (i.eql(args_length_minus_one)) {
                            if (cached_args.rest() == NIL) {
                                if (NIL != prev) {
                                    return rplacd(prev, cur.rest());
                                }
                                if (NIL != cur.rest()) {
                                    return caching_state_put_internal(caching_state, sxhash, cur.rest());
                                }
                                return caching_state_remove_internal(caching_state, sxhash);
                            }
                        } else {
                            args_list = args_list.rest();
                            cached_args = cached_args.rest();
                        }
                    } else {
                        i = args_length;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list78);
            }
            prev = cur;
            cur = cur.rest();
        } 
        return NIL;
    }

    public static final SubLObject caching_state_remove_function_results_with_args_alt(SubLObject caching_state, SubLObject args_list, SubLObject sxhash, SubLObject lock) {
        if (sxhash == UNPROVIDED) {
            sxhash = sxhash_calc_n(args_list);
        }
        if (lock == UNPROVIDED) {
            lock = (NIL != caching_state) ? ((SubLObject) (caching_state_lock(caching_state))) : NIL;
        }
        if (NIL == caching_state) {
            return NIL;
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    result = caching_state_remove_function_results_with_args_internal(caching_state, args_list, sxhash);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_remove_function_results_with_args_internal(caching_state, args_list, sxhash);
        }
    }

    public static SubLObject caching_state_remove_function_results_with_args(final SubLObject caching_state, final SubLObject args_list, SubLObject sxhash, SubLObject lock) {
        if (sxhash == UNPROVIDED) {
            sxhash = sxhash_calc_n(args_list);
        }
        if (lock == UNPROVIDED) {
            lock = (NIL != caching_state) ? caching_state_lock(caching_state) : NIL;
        }
        if (NIL == caching_state) {
            return NIL;
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_remove_function_results_with_args_internal(caching_state, args_list, sxhash);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_remove_function_results_with_args_internal(caching_state, args_list, sxhash);
    }

    public static final SubLObject caching_state_clone_internal_alt(SubLObject caching_state) {
        SubLTrampolineFile.enforceType(caching_state, CACHING_STATE_P);
        {
            SubLObject cloned_state = create_caching_state(caching_state_lock(caching_state), caching_state_func_symbol(caching_state), caching_state_args_length(caching_state), caching_state_get_test(caching_state), caching_state_capacity(caching_state), caching_state_size_internal(caching_state));
            if (NIL != caching_state_capacity(caching_state)) {
                _csetf_caching_state_store(cloned_state, cache.cache_copy(caching_state_store(caching_state)));
            } else {
                _csetf_caching_state_store(cloned_state, dictionary_utilities.copy_dictionary(caching_state_store(caching_state)));
            }
            _csetf_caching_state_zero_arg_results(cloned_state, caching_state_zero_arg_results(caching_state));
            {
                SubLObject cdolist_list_var = caching_state_keys_internal(cloned_state);
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    {
                        SubLObject value = caching_state_lookup_internal(cloned_state, key, UNPROVIDED);
                        SubLObject new_value = copy_list(value);
                        caching_state_put_internal(cloned_state, key, new_value);
                    }
                }
            }
            return cloned_state;
        }
    }

    public static SubLObject caching_state_clone_internal(final SubLObject caching_state) {
        SubLTrampolineFile.enforceType(caching_state, CACHING_STATE_P);
        final SubLObject cloned_state = create_caching_state(caching_state_lock(caching_state), caching_state_func_symbol(caching_state), caching_state_args_length(caching_state), caching_state_get_test(caching_state), caching_state_capacity(caching_state), caching_state_size_internal(caching_state));
        if (NIL != caching_state_capacity(caching_state)) {
            _csetf_caching_state_store(cloned_state, cache.cache_copy(caching_state_store(caching_state)));
        } else {
            _csetf_caching_state_store(cloned_state, dictionary_utilities.copy_dictionary(caching_state_store(caching_state)));
        }
        _csetf_caching_state_zero_arg_results(cloned_state, caching_state_zero_arg_results(caching_state));
        SubLObject cdolist_list_var = caching_state_keys_internal(cloned_state);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = caching_state_lookup_internal(cloned_state, key, UNPROVIDED);
            final SubLObject new_value = copy_list(value);
            caching_state_put_internal(cloned_state, key, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return cloned_state;
    }

    /**
     * Used for browsing a caching state
     */
    @LispMethod(comment = "Used for browsing a caching state")
    public static final SubLObject caching_state_store_as_dictionary_alt(SubLObject caching_state) {
        SubLTrampolineFile.enforceType(caching_state, CACHING_STATE_P);
        if (NIL != caching_state_lock(caching_state)) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = caching_state_lock(caching_state);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = (NIL != caching_state_capacity(caching_state)) ? ((SubLObject) (cache_utilities.cache_to_dictionary(caching_state_store(caching_state)))) : dictionary_utilities.copy_dictionary(caching_state_store(caching_state));
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return NIL != caching_state_capacity(caching_state) ? ((SubLObject) (cache_utilities.cache_to_dictionary(caching_state_store(caching_state)))) : dictionary_utilities.copy_dictionary(caching_state_store(caching_state));
        }
    }

    /**
     * Used for browsing a caching state
     */
    @LispMethod(comment = "Used for browsing a caching state")
    public static SubLObject caching_state_store_as_dictionary(final SubLObject caching_state) {
        SubLTrampolineFile.enforceType(caching_state, CACHING_STATE_P);
        if (NIL != caching_state_lock(caching_state)) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = (NIL != caching_state_capacity(caching_state)) ? cache_utilities.cache_to_dictionary(caching_state_store(caching_state)) : dictionary_utilities.copy_dictionary(caching_state_store(caching_state));
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return NIL != caching_state_capacity(caching_state) ? cache_utilities.cache_to_dictionary(caching_state_store(caching_state)) : dictionary_utilities.copy_dictionary(caching_state_store(caching_state));
    }

    public static final SubLObject caching_state_clone_alt(SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = lock;
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = caching_state_clone_internal(caching_state);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return caching_state_clone_internal(caching_state);
        }
    }

    public static SubLObject caching_state_clone(final SubLObject caching_state, SubLObject lock) {
        if (lock == UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_clone_internal(caching_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_clone_internal(caching_state);
    }

    /**
     * Returns T if the ARGS-LIST is cached in the given CACHING-STATE, returns NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the ARGS-LIST is cached in the given CACHING-STATE, returns NIL otherwise.")
    public static final SubLObject caching_state_multi_key_n_is_cached_alt(SubLObject caching_state, SubLObject args_list) {
        if (NIL == caching_state) {
            return NIL;
        }
        SubLTrampolineFile.checkType(caching_state, CACHING_STATE_P);
        SubLTrampolineFile.checkType(args_list, LISTP);
        return makeBoolean($kw69$_MEMOIZED_ITEM_NOT_FOUND_ != caching_state_lookup_multi_key_n(caching_state, args_list, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns T if the ARGS-LIST is cached in the given CACHING-STATE, returns NIL otherwise.
     */
    @LispMethod(comment = "Returns T if the ARGS-LIST is cached in the given CACHING-STATE, returns NIL otherwise.")
    public static SubLObject caching_state_multi_key_n_is_cached(final SubLObject caching_state, final SubLObject args_list) {
        if (NIL == caching_state) {
            return NIL;
        }
        assert NIL != caching_state_p(caching_state) : "! memoization_state.caching_state_p(caching_state) " + ("memoization_state.caching_state_p(caching_state) " + "CommonSymbols.NIL != memoization_state.caching_state_p(caching_state) ") + caching_state;
        assert NIL != listp(args_list) : "! listp(args_list) " + ("Types.listp(args_list) " + "CommonSymbols.NIL != Types.listp(args_list) ") + args_list;
        return makeBoolean(!$memoized_item_not_found$.getGlobalValue().eql(caching_state_lookup_multi_key_n(caching_state, args_list, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject caching_state_lookup_multi_key_n_alt(SubLObject caching_state, SubLObject args_list, SubLObject sxhash, SubLObject collisions) {
        if (sxhash == UNPROVIDED) {
            sxhash = $RECALC;
        }
        if (collisions == UNPROVIDED) {
            collisions = $RECALC;
        }
        if (NIL == caching_state) {
            return values($kw69$_MEMOIZED_ITEM_NOT_FOUND_, NIL, NIL);
        }
        if (NIL == args_list) {
            return values(caching_state_zero_arg_results(caching_state), NIL, NIL);
        }
        if (NIL == args_list.rest()) {
            return values(caching_state_lookup(caching_state, args_list.first(), $kw69$_MEMOIZED_ITEM_NOT_FOUND_), NIL, NIL);
        }
        if (sxhash == $RECALC) {
            sxhash = sxhash_calc_n(args_list);
        }
        if (collisions == $RECALC) {
            collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        }
        {
            SubLObject test = caching_state_test(caching_state);
            SubLObject args_length = length(args_list);
            SubLObject args_length_minus_one = subtract(args_length, ONE_INTEGER);
            if (!collisions.isList()) {
                return values($kw69$_MEMOIZED_ITEM_NOT_FOUND_, sxhash, NIL);
            }
            {
                SubLObject cdolist_list_var = collisions;
                SubLObject collision = NIL;
                for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                    {
                        SubLObject datum = collision;
                        SubLObject current = datum;
                        SubLObject cached_args = NIL;
                        SubLObject results = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt75);
                        cached_args = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt75);
                        results = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(args_length); i = add(i, ONE_INTEGER)) {
                                    if (NIL != funcall(test, args_list.first(), cached_args.first())) {
                                        if (i == args_length_minus_one) {
                                            if (cached_args.rest() == NIL) {
                                                return values(results, sxhash, collisions);
                                            }
                                        } else {
                                            args_list = args_list.rest();
                                            cached_args = cached_args.rest();
                                        }
                                    } else {
                                        i = args_length;
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt75);
                        }
                    }
                }
            }
            return values($kw69$_MEMOIZED_ITEM_NOT_FOUND_, sxhash, collisions);
        }
    }

    public static SubLObject caching_state_lookup_multi_key_n(final SubLObject caching_state, SubLObject args_list, SubLObject sxhash, SubLObject collisions) {
        if (sxhash == UNPROVIDED) {
            sxhash = $RECALC;
        }
        if (collisions == UNPROVIDED) {
            collisions = $RECALC;
        }
        if (NIL == caching_state) {
            return values($memoized_item_not_found$.getGlobalValue(), NIL, NIL);
        }
        if (NIL == args_list) {
            return values(caching_state_zero_arg_results(caching_state), NIL, NIL);
        }
        if (NIL == args_list.rest()) {
            return values(caching_state_lookup(caching_state, args_list.first(), $memoized_item_not_found$.getGlobalValue()), NIL, NIL);
        }
        if (sxhash == $RECALC) {
            sxhash = sxhash_calc_n(args_list);
        }
        if (collisions == $RECALC) {
            collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        }
        final SubLObject test = caching_state_test(caching_state);
        final SubLObject args_length = length(args_list);
        final SubLObject args_length_minus_one = subtract(args_length, ONE_INTEGER);
        if (!collisions.isList()) {
            return values($memoized_item_not_found$.getGlobalValue(), sxhash, NIL);
        }
        SubLObject cdolist_list_var = collisions;
        SubLObject collision = NIL;
        collision = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = collision;
            SubLObject cached_args = NIL;
            SubLObject results = NIL;
            destructuring_bind_must_consp(current, datum, $list81);
            cached_args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list81);
            results = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(args_length); i = add(i, ONE_INTEGER)) {
                    if (NIL != funcall(test, args_list.first(), cached_args.first())) {
                        if (i.eql(args_length_minus_one)) {
                            if (cached_args.rest() == NIL) {
                                return values(results, sxhash, collisions);
                            }
                        } else {
                            args_list = args_list.rest();
                            cached_args = cached_args.rest();
                        }
                    } else {
                        i = args_length;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list81);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collision = cdolist_list_var.first();
        } 
        return values($memoized_item_not_found$.getGlobalValue(), sxhash, collisions);
    }

    public static final SubLObject caching_state_lookup_multi_key_1_alt(SubLObject caching_state, SubLObject arg1) {
        return caching_state_lookup(caching_state, arg1, UNPROVIDED);
    }

    public static SubLObject caching_state_lookup_multi_key_1(final SubLObject caching_state, final SubLObject arg1) {
        return caching_state_lookup(caching_state, arg1, UNPROVIDED);
    }

    /**
     * Cache in CACHING-STATE under hash code SXHASH the fact that ARGS-LIST returns the list of values RESULTS
     */
    @LispMethod(comment = "Cache in CACHING-STATE under hash code SXHASH the fact that ARGS-LIST returns the list of values RESULTS")
    public static final SubLObject caching_state_enter_multi_key_n_alt(SubLObject caching_state, SubLObject sxhash, SubLObject collisions, SubLObject results, SubLObject args_list) {
        if (!collisions.isList()) {
            collisions = NIL;
        }
        if (NIL == args_list) {
            _csetf_caching_state_zero_arg_results(caching_state, results);
            return NIL;
        }
        collisions = cons(list(args_list, results), collisions);
        caching_state_put(caching_state, sxhash, collisions, UNPROVIDED);
        return NIL;
    }

    /**
     * Cache in CACHING-STATE under hash code SXHASH the fact that ARGS-LIST returns the list of values RESULTS
     */
    @LispMethod(comment = "Cache in CACHING-STATE under hash code SXHASH the fact that ARGS-LIST returns the list of values RESULTS")
    public static SubLObject caching_state_enter_multi_key_n(final SubLObject caching_state, final SubLObject sxhash, SubLObject collisions, final SubLObject results, final SubLObject args_list) {
        if (!collisions.isList()) {
            collisions = NIL;
        }
        if (NIL == args_list) {
            _csetf_caching_state_zero_arg_results(caching_state, results);
            return NIL;
        }
        collisions = cons(list(args_list, results), collisions);
        caching_state_put(caching_state, sxhash, collisions, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject memoization_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_memoization_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject memoization_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_memoization_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject memoization_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject memoization_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.memoization_state.$memoization_state_native.class ? T : NIL;
    }

    public static final SubLObject memoization_state_store_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject memoization_state_store(final SubLObject v_object) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject memoization_state_current_process_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject memoization_state_current_process(final SubLObject v_object) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject memoization_state_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject memoization_state_lock(final SubLObject v_object) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject memoization_state_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject memoization_state_name(final SubLObject v_object) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject memoization_state_should_clone_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject memoization_state_should_clone(final SubLObject v_object) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_memoization_state_store_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_memoization_state_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_memoization_state_current_process_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_memoization_state_current_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_memoization_state_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_memoization_state_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_memoization_state_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_memoization_state_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_memoization_state_should_clone_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MEMOIZATION_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_memoization_state_should_clone(final SubLObject v_object, final SubLObject value) {
        assert NIL != memoization_state_p(v_object) : "! memoization_state.memoization_state_p(v_object) " + "memoization_state.memoization_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_memoization_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.memoization_state.$memoization_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STORE)) {
                        _csetf_memoization_state_store(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CURRENT_PROCESS)) {
                            _csetf_memoization_state_current_process(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LOCK)) {
                                _csetf_memoization_state_lock(v_new, current_value);
                            } else {
                                if (pcase_var.eql($NAME)) {
                                    _csetf_memoization_state_name(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SHOULD_CLONE)) {
                                        _csetf_memoization_state_should_clone(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt64$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_memoization_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.memoization_state.$memoization_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STORE)) {
                _csetf_memoization_state_store(v_new, current_value);
            } else
                if (pcase_var.eql($CURRENT_PROCESS)) {
                    _csetf_memoization_state_current_process(v_new, current_value);
                } else
                    if (pcase_var.eql($LOCK)) {
                        _csetf_memoization_state_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($NAME)) {
                            _csetf_memoization_state_name(v_new, current_value);
                        } else
                            if (pcase_var.eql($SHOULD_CLONE)) {
                                _csetf_memoization_state_should_clone(v_new, current_value);
                            } else {
                                Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_memoization_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MEMOIZATION_STATE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STORE, memoization_state_store(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_PROCESS, memoization_state_current_process(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, memoization_state_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, memoization_state_name(obj));
        funcall(visitor_fn, obj, $SLOT, $SHOULD_CLONE, memoization_state_should_clone(obj));
        funcall(visitor_fn, obj, $END, MAKE_MEMOIZATION_STATE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_memoization_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_memoization_state(obj, visitor_fn);
    }

    /**
     * Return a new memoization state suitable for WITH-MEMOIZATION-STATE
     */
    @LispMethod(comment = "Return a new memoization state suitable for WITH-MEMOIZATION-STATE")
    public static final SubLObject create_memoization_state_alt(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        if (should_clone == UNPROVIDED) {
            should_clone = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject ms = make_memoization_state(UNPROVIDED);
            if (NIL != name) {
                SubLTrampolineFile.enforceType(name, STRINGP);
            }
            if (NIL != lock) {
                SubLTrampolineFile.enforceType(lock, READER_WRITER_LOCK_P);
            }
            if (test.isSymbol()) {
                test = symbol_function(test);
            }
            SubLTrampolineFile.enforceType(test, FUNCTIONP);
            if ((NIL != should_clone) && (NIL == lock)) {
                lock = ReadWriteLocks.new_rw_lock($str_alt99$memoization_state_clone_lock);
            }
            _csetf_memoization_state_name(ms, name);
            _csetf_memoization_state_lock(ms, lock);
            _csetf_memoization_state_store(ms, dictionary.new_dictionary(test, UNPROVIDED));
            _csetf_memoization_state_current_process(ms, NIL);
            _csetf_memoization_state_should_clone(ms, should_clone);
            return ms;
        }
    }

    /**
     * Return a new memoization state suitable for WITH-MEMOIZATION-STATE
     */
    @LispMethod(comment = "Return a new memoization state suitable for WITH-MEMOIZATION-STATE")
    public static SubLObject create_memoization_state(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        if (should_clone == UNPROVIDED) {
            should_clone = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject ms = make_memoization_state(UNPROVIDED);
        if (NIL != name) {
            SubLTrampolineFile.enforceType(name, STRINGP);
        }
        if (NIL != lock) {
            SubLTrampolineFile.enforceType(lock, READER_WRITER_LOCK_P);
        }
        if (test.isSymbol()) {
            test = symbol_function(test);
        }
        SubLTrampolineFile.enforceType(test, FUNCTIONP);
        if ((NIL != should_clone) && (NIL == lock)) {
            lock = ReadWriteLocks.new_rw_lock($str108$memoization_state_clone_lock);
        }
        _csetf_memoization_state_name(ms, name);
        _csetf_memoization_state_lock(ms, lock);
        _csetf_memoization_state_store(ms, dictionary.new_dictionary(test, UNPROVIDED));
        _csetf_memoization_state_current_process(ms, NIL);
        _csetf_memoization_state_should_clone(ms, should_clone);
        return ms;
    }

    public static final SubLObject new_memoization_state_alt(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        if (should_clone == UNPROVIDED) {
            should_clone = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return create_memoization_state(name, lock, should_clone, test);
    }

    public static SubLObject new_memoization_state(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (lock == UNPROVIDED) {
            lock = NIL;
        }
        if (should_clone == UNPROVIDED) {
            should_clone = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return create_memoization_state(name, lock, should_clone, test);
    }

    public static final SubLObject print_memoization_state_internal_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt100$__memoization_state_name____A__lo, new SubLObject[]{ memoization_state_name(v_object), memoization_state_lock(v_object), memoization_state_should_clone(v_object), memoization_state_current_process(v_object), memoization_state_store(v_object) });
        dictionary_utilities.print_dictionary_contents(memoization_state_store(v_object), stream);
        format(stream, $str_alt71$_);
        return v_object;
    }

    public static SubLObject print_memoization_state_internal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str109$__memoization_state_name____A__lo, new SubLObject[]{ memoization_state_name(v_object), memoization_state_lock(v_object), memoization_state_should_clone(v_object), memoization_state_current_process(v_object), memoization_state_store(v_object) });
        format(stream, $str77$_);
        return v_object;
    }

    public static final SubLObject print_memoization_state_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject lock = memoization_state_lock(v_object);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                        result = print_memoization_state_internal(v_object, stream, depth);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return print_memoization_state_internal(v_object, stream, depth);
            }
        }
    }

    public static SubLObject print_memoization_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject lock = memoization_state_lock(v_object);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = print_memoization_state_internal(v_object, stream, depth);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return print_memoization_state_internal(v_object, stream, depth);
    }

    public static final SubLObject memoization_state_lookup_internal_alt(SubLObject v_memoization_state, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup(memoization_state_store(v_memoization_state), key, v_default);
    }

    public static SubLObject memoization_state_lookup_internal(final SubLObject v_memoization_state, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return dictionary.dictionary_lookup_without_values(memoization_state_store(v_memoization_state), key, v_default);
    }

    public static final SubLObject memoization_state_lookup_alt(SubLObject v_memoization_state, SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                        result = memoization_state_lookup_internal(v_memoization_state, key, v_default);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_lookup_internal(v_memoization_state, key, v_default);
            }
        }
    }

    public static SubLObject memoization_state_lookup(final SubLObject v_memoization_state, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = memoization_state_lookup_internal(v_memoization_state, key, v_default);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_lookup_internal(v_memoization_state, key, v_default);
    }

    public static final SubLObject memoization_state_get_caching_state_for_function_alt(SubLObject v_memoization_state, SubLObject func_symbol) {
        if (NIL == v_memoization_state) {
            return NIL;
        }
        SubLTrampolineFile.checkType(v_memoization_state, MEMOIZATION_STATE_P);
        SubLTrampolineFile.checkType(func_symbol, SYMBOLP);
        return memoization_state_lookup(v_memoization_state, func_symbol, UNPROVIDED);
    }

    public static SubLObject memoization_state_get_caching_state_for_function(final SubLObject v_memoization_state, final SubLObject func_symbol) {
        if (NIL == v_memoization_state) {
            return NIL;
        }
        assert NIL != memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
        assert NIL != symbolp(func_symbol) : "! symbolp(func_symbol) " + ("Types.symbolp(func_symbol) " + "CommonSymbols.NIL != Types.symbolp(func_symbol) ") + func_symbol;
        return memoization_state_lookup(v_memoization_state, func_symbol, UNPROVIDED);
    }

    public static final SubLObject memoization_state_put_internal_alt(SubLObject v_memoization_state, SubLObject key, SubLObject value) {
        return dictionary.dictionary_enter(memoization_state_store(v_memoization_state), key, value);
    }

    public static SubLObject memoization_state_put_internal(final SubLObject v_memoization_state, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(memoization_state_store(v_memoization_state), key, value);
    }

    public static final SubLObject memoization_state_put_alt(SubLObject v_memoization_state, SubLObject key, SubLObject value) {
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        result = memoization_state_put_internal(v_memoization_state, key, value);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_put_internal(v_memoization_state, key, value);
            }
        }
    }

    public static SubLObject memoization_state_put(final SubLObject v_memoization_state, final SubLObject key, final SubLObject value) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_put_internal(v_memoization_state, key, value);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_put_internal(v_memoization_state, key, value);
    }

    public static final SubLObject memoization_state_remove_internal_alt(SubLObject v_memoization_state, SubLObject key) {
        return dictionary.dictionary_remove(memoization_state_store(v_memoization_state), key);
    }

    public static SubLObject memoization_state_remove_internal(final SubLObject v_memoization_state, final SubLObject key) {
        return dictionary.dictionary_remove(memoization_state_store(v_memoization_state), key);
    }

    public static final SubLObject memoization_state_remove_alt(SubLObject v_memoization_state, SubLObject key) {
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        result = memoization_state_remove_internal(v_memoization_state, key);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_remove_internal(v_memoization_state, key);
            }
        }
    }

    public static SubLObject memoization_state_remove(final SubLObject v_memoization_state, final SubLObject key) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_remove_internal(v_memoization_state, key);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_remove_internal(v_memoization_state, key);
    }

    public static final SubLObject memoization_state_clear_internal_alt(SubLObject v_memoization_state) {
        return dictionary.clear_dictionary(memoization_state_store(v_memoization_state));
    }

    public static SubLObject memoization_state_clear_internal(final SubLObject v_memoization_state) {
        return dictionary.clear_dictionary(memoization_state_store(v_memoization_state));
    }

    public static final SubLObject memoization_state_clear_alt(SubLObject v_memoization_state) {
        if (NIL == v_memoization_state) {
            return NIL;
        }
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        result = memoization_state_clear_internal(v_memoization_state);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_clear_internal(v_memoization_state);
            }
        }
    }

    public static SubLObject memoization_state_clear(final SubLObject v_memoization_state) {
        if (NIL == v_memoization_state) {
            return NIL;
        }
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_clear_internal(v_memoization_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_clear_internal(v_memoization_state);
    }

    public static final SubLObject memoization_state_get_test_alt(SubLObject v_memoization_state) {
        return dictionary.dictionary_test(memoization_state_store(v_memoization_state));
    }

    public static SubLObject memoization_state_get_test(final SubLObject v_memoization_state) {
        return dictionary.dictionary_test(memoization_state_store(v_memoization_state));
    }

    public static final SubLObject memoization_state_get_lock_alt(SubLObject v_memoization_state) {
        return memoization_state_lock(v_memoization_state);
    }

    public static SubLObject memoization_state_get_lock(final SubLObject v_memoization_state) {
        return memoization_state_lock(v_memoization_state);
    }

    public static final SubLObject memoization_state_get_name_alt(SubLObject v_memoization_state) {
        return memoization_state_name(v_memoization_state);
    }

    public static SubLObject memoization_state_get_name(final SubLObject v_memoization_state) {
        return memoization_state_name(v_memoization_state);
    }

    public static final SubLObject memoization_state_get_should_clone_alt(SubLObject v_memoization_state) {
        return memoization_state_should_clone(v_memoization_state);
    }

    public static SubLObject memoization_state_get_should_clone(final SubLObject v_memoization_state) {
        return memoization_state_should_clone(v_memoization_state);
    }

    public static final SubLObject memoization_state_get_current_process_internal_alt(SubLObject v_memoization_state) {
        return memoization_state_current_process(v_memoization_state);
    }

    public static SubLObject memoization_state_get_current_process_internal(final SubLObject v_memoization_state) {
        return memoization_state_current_process(v_memoization_state);
    }

    public static final SubLObject memoization_state_get_current_process_alt(SubLObject v_memoization_state) {
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                        result = memoization_state_get_current_process_internal(v_memoization_state);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_get_current_process_internal(v_memoization_state);
            }
        }
    }

    public static SubLObject memoization_state_get_current_process(final SubLObject v_memoization_state) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = memoization_state_get_current_process_internal(v_memoization_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_get_current_process_internal(v_memoization_state);
    }

    public static final SubLObject memoization_state_keys_internal_alt(SubLObject v_memoization_state) {
        return dictionary.dictionary_keys(memoization_state_store(v_memoization_state));
    }

    public static SubLObject memoization_state_keys_internal(final SubLObject v_memoization_state) {
        return dictionary.dictionary_keys(memoization_state_store(v_memoization_state));
    }

    public static final SubLObject memoization_state_keys_alt(SubLObject v_memoization_state) {
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                        result = memoization_state_keys_internal(v_memoization_state);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_keys_internal(v_memoization_state);
            }
        }
    }

    public static SubLObject memoization_state_keys(final SubLObject v_memoization_state) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = memoization_state_keys_internal(v_memoization_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_keys_internal(v_memoization_state);
    }

    public static final SubLObject memoization_state_set_current_process_internal_alt(SubLObject v_memoization_state, SubLObject current_process) {
        _csetf_memoization_state_current_process(v_memoization_state, current_process);
        return v_memoization_state;
    }

    public static SubLObject memoization_state_set_current_process_internal(final SubLObject v_memoization_state, final SubLObject current_process) {
        _csetf_memoization_state_current_process(v_memoization_state, current_process);
        return v_memoization_state;
    }

    public static final SubLObject memoization_state_set_current_process_alt(SubLObject v_memoization_state, SubLObject current_process) {
        {
            SubLObject lock = memoization_state_lock(v_memoization_state);
            if (NIL != lock) {
                {
                    SubLObject result = NIL;
                    SubLObject rw_lock_var = lock;
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        result = memoization_state_set_current_process_internal(v_memoization_state, current_process);
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                    return result;
                }
            } else {
                return memoization_state_set_current_process_internal(v_memoization_state, current_process);
            }
        }
    }

    public static SubLObject memoization_state_set_current_process(final SubLObject v_memoization_state, final SubLObject current_process) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_set_current_process_internal(v_memoization_state, current_process);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_set_current_process_internal(v_memoization_state, current_process);
    }

    public static final SubLObject memoization_state_clone_alt(SubLObject v_memoization_state) {
        SubLTrampolineFile.enforceType(v_memoization_state, MEMOIZATION_STATE_P);
        {
            SubLObject cloned_state = NIL;
            SubLObject rw_lock_var = memoization_state_lock(v_memoization_state);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                cloned_state = create_memoization_state(cconcatenate($str_alt101$Clone__, memoization_state_name(v_memoization_state)), NIL, NIL, symbol_function(EQL));
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            Errors.error($str_alt102$Need_to_implement_dictionary_copy);
            _csetf_memoization_state_store(cloned_state, NIL);
            {
                SubLObject cdolist_list_var = memoization_state_keys_internal(cloned_state);
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    {
                        SubLObject value = memoization_state_lookup_internal(cloned_state, key, UNPROVIDED);
                        SubLObject new_value = caching_state_clone(value, UNPROVIDED);
                        memoization_state_put_internal(cloned_state, key, new_value);
                    }
                }
            }
            return cloned_state;
        }
    }

    public static SubLObject memoization_state_clone(final SubLObject v_memoization_state) {
        SubLTrampolineFile.enforceType(v_memoization_state, MEMOIZATION_STATE_P);
        SubLObject cloned_state = NIL;
        final SubLObject rw_lock_var = memoization_state_lock(v_memoization_state);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            cloned_state = create_memoization_state(cconcatenate($str110$Clone__, memoization_state_name(v_memoization_state)), NIL, NIL, symbol_function(EQL));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        Errors.error($str111$Need_to_implement_dictionary_copy);
        _csetf_memoization_state_store(cloned_state, NIL);
        SubLObject cdolist_list_var = memoization_state_keys_internal(cloned_state);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = memoization_state_lookup_internal(cloned_state, key, UNPROVIDED);
            final SubLObject new_value = caching_state_clone(value, UNPROVIDED);
            memoization_state_put_internal(cloned_state, key, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return cloned_state;
    }

    public static final SubLObject memoization_state_merge_cloned_state_alt(SubLObject cloned_state, SubLObject orig_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.enforceType(cloned_state, MEMOIZATION_STATE_P);
            SubLTrampolineFile.enforceType(orig_state, MEMOIZATION_STATE_P);
            {
                SubLObject rw_lock_var = memoization_state_lock(orig_state);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    {
                        SubLObject cdolist_list_var = memoization_state_keys_internal(cloned_state);
                        SubLObject the_function_symbol = NIL;
                        for (the_function_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , the_function_symbol = cdolist_list_var.first()) {
                            {
                                SubLObject cloned_caching_state = memoization_state_lookup(cloned_state, the_function_symbol, UNPROVIDED);
                                SubLObject orig_caching_state = memoization_state_lookup(orig_state, the_function_symbol, UNPROVIDED);
                                if (NIL != orig_caching_state) {
                                    {
                                        SubLObject cdolist_list_var_2 = caching_state_keys_internal(cloned_state);
                                        SubLObject sxhash = NIL;
                                        for (sxhash = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , sxhash = cdolist_list_var_2.first()) {
                                            {
                                                SubLObject prev_cloned_results = caching_state_lookup_internal(cloned_caching_state, sxhash, UNPROVIDED);
                                                SubLObject orig_results = caching_state_lookup_internal(orig_caching_state, sxhash, UNPROVIDED);
                                                SubLObject arg_list_cache = make_hash_table(multiply(TWO_INTEGER, length(prev_cloned_results)), symbol_function(EQUAL), UNPROVIDED);
                                                if (orig_results == $kw69$_MEMOIZED_ITEM_NOT_FOUND_) {
                                                    caching_state_put_internal(orig_caching_state, sxhash, prev_cloned_results);
                                                } else {
                                                    {
                                                        SubLObject cdolist_list_var_3 = orig_results;
                                                        SubLObject orig_result = NIL;
                                                        for (orig_result = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , orig_result = cdolist_list_var_3.first()) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject prev_args = orig_result;
                                                                SubLObject prev_result = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                sethash(prev_args, arg_list_cache, prev_result);
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var_4 = prev_cloned_results;
                                                        SubLObject prev_cloned_result = NIL;
                                                        for (prev_cloned_result = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , prev_cloned_result = cdolist_list_var_4.first()) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject prev_args = prev_cloned_result;
                                                                SubLObject prev_result = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != gethash(arg_list_cache, prev_args, UNPROVIDED)) {
                                                                    Errors.error($str_alt103$implement_me_in__memoization_stat);
                                                                    orig_results = remove_if(symbol_function($sym104$CACHING_STATE_RESULTS_HAS_ARGS_), orig_results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                orig_results = cons(prev_cloned_result, orig_results);
                                                            }
                                                        }
                                                    }
                                                    caching_state_put_internal(orig_caching_state, sxhash, orig_results);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    memoization_state_put_internal(orig_state, the_function_symbol, caching_state_clone(cloned_caching_state, UNPROVIDED));
                                }
                            }
                        }
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject memoization_state_merge_cloned_state(final SubLObject cloned_state, final SubLObject orig_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(cloned_state, MEMOIZATION_STATE_P);
        SubLTrampolineFile.enforceType(orig_state, MEMOIZATION_STATE_P);
        final SubLObject rw_lock_var = memoization_state_lock(orig_state);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject cdolist_list_var = memoization_state_keys_internal(cloned_state);
            SubLObject the_function_symbol = NIL;
            the_function_symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cloned_caching_state = memoization_state_lookup(cloned_state, the_function_symbol, UNPROVIDED);
                final SubLObject orig_caching_state = memoization_state_lookup(orig_state, the_function_symbol, UNPROVIDED);
                if (NIL != orig_caching_state) {
                    SubLObject cdolist_list_var_$2 = caching_state_keys_internal(cloned_state);
                    SubLObject sxhash = NIL;
                    sxhash = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject prev_cloned_results = caching_state_lookup_internal(cloned_caching_state, sxhash, UNPROVIDED);
                        SubLObject orig_results = caching_state_lookup_internal(orig_caching_state, sxhash, UNPROVIDED);
                        final SubLObject arg_list_cache = make_hash_table(multiply(TWO_INTEGER, length(prev_cloned_results)), symbol_function(EQUAL), UNPROVIDED);
                        if (orig_results.eql($memoized_item_not_found$.getGlobalValue())) {
                            caching_state_put_internal(orig_caching_state, sxhash, prev_cloned_results);
                        } else {
                            SubLObject cdolist_list_var_$3 = orig_results;
                            SubLObject orig_result = NIL;
                            orig_result = cdolist_list_var_$3.first();
                            while (NIL != cdolist_list_var_$3) {
                                thread.resetMultipleValues();
                                final SubLObject prev_args = orig_result;
                                final SubLObject prev_result = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                sethash(prev_args, arg_list_cache, prev_result);
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                orig_result = cdolist_list_var_$3.first();
                            } 
                            SubLObject cdolist_list_var_$4 = prev_cloned_results;
                            SubLObject prev_cloned_result = NIL;
                            prev_cloned_result = cdolist_list_var_$4.first();
                            while (NIL != cdolist_list_var_$4) {
                                thread.resetMultipleValues();
                                final SubLObject prev_args = prev_cloned_result;
                                final SubLObject prev_result = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != gethash(arg_list_cache, prev_args, UNPROVIDED)) {
                                    Errors.error($str112$implement_me_in__memoization_stat);
                                    orig_results = remove_if(symbol_function($sym113$CACHING_STATE_RESULTS_HAS_ARGS_), orig_results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                orig_results = cons(prev_cloned_result, orig_results);
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                prev_cloned_result = cdolist_list_var_$4.first();
                            } 
                            caching_state_put_internal(orig_caching_state, sxhash, orig_results);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        sxhash = cdolist_list_var_$2.first();
                    } 
                } else {
                    memoization_state_put_internal(orig_state, the_function_symbol, caching_state_clone(cloned_caching_state, UNPROVIDED));
                }
                cdolist_list_var = cdolist_list_var.rest();
                the_function_symbol = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static final SubLObject caching_state_results_has_argsP_alt(SubLObject caching_state_resutls, SubLObject args) {
        return equal(args, caching_state_resutls.first());
    }

    public static SubLObject caching_state_results_has_argsP(final SubLObject caching_state_results, final SubLObject args) {
        return equal(args, caching_state_results.first());
    }

    public static SubLObject gather_memoization_state_statistics(final SubLObject v_memoization_state) {
        SubLTrampolineFile.enforceType(v_memoization_state, MEMOIZATION_STATE_P);
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (NIL != lock) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = gather_memoization_state_statistics_unlocked(v_memoization_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return gather_memoization_state_statistics_unlocked(v_memoization_state);
    }

    public static SubLObject gather_memoization_state_statistics_unlocked(final SubLObject v_memoization_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stats = NIL;
        SubLObject cdolist_list_var = memoization_state_keys_internal(v_memoization_state);
        SubLObject the_function_symbol = NIL;
        the_function_symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject caching_state = memoization_state_lookup(v_memoization_state, the_function_symbol, UNPROVIDED);
            final SubLObject store = caching_state_store(caching_state);
            thread.resetMultipleValues();
            final SubLObject size = gather_caching_state_store_statistics(store);
            final SubLObject capacity = thread.secondMultipleValue();
            thread.resetMultipleValues();
            stats = cons(list(the_function_symbol, size, capacity), stats);
            cdolist_list_var = cdolist_list_var.rest();
            the_function_symbol = cdolist_list_var.first();
        } 
        return Sort.sort(stats, $sym4$_, SECOND);
    }

    public static SubLObject gather_caching_state_store_statistics(final SubLObject store) {
        if (NIL != map_utilities.map_p(store)) {
            return values(map_utilities.map_size(store), map_utilities.map_size(store));
        }
        if (NIL != cache.cache_p(store)) {
            return values(cache.cache_size(store), cache.cache_capacity(store));
        }
        Errors.error($str115$Dont_know_how_to_determine_size_a, type_of(store));
        return NIL;
    }

    /**
     * Return the current memoization state, or NIL if none.
     */
    @LispMethod(comment = "Return the current memoization state, or NIL if none.")
    public static final SubLObject current_memoization_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $memoization_state$.getDynamicValue(thread);
        }
    }

    /**
     * Return the current memoization state, or NIL if none.
     */
    @LispMethod(comment = "Return the current memoization state, or NIL if none.")
    public static SubLObject current_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $memoization_state$.getDynamicValue(thread);
    }

    /**
     * Execute BODY assuming STATE is the memoization state.
     * If state is NIL, then no memoization is used. Note: tests where
     * added to verify that multiple threads are not currently
     * using the same memoization state at the exact same time...these tests
     * are on a best effort basis. It would be incorrect to write code that depends
     * on this check. The side effects of using the same memoization states simultaneously
     * in multiple threads can lead to infinite processor use that is not interruptibe
     * by any mechanism other than restarting the image.
     */
    @LispMethod(comment = "Execute BODY assuming STATE is the memoization state.\r\nIf state is NIL, then no memoization is used. Note: tests where\r\nadded to verify that multiple threads are not currently\r\nusing the same memoization state at the exact same time...these tests\r\nare on a best effort basis. It would be incorrect to write code that depends\r\non this check. The side effects of using the same memoization states simultaneously\r\nin multiple threads can lead to infinite processor use that is not interruptibe\r\nby any mechanism other than restarting the image.\nExecute BODY assuming STATE is the memoization state.\nIf state is NIL, then no memoization is used. Note: tests where\nadded to verify that multiple threads are not currently\nusing the same memoization state at the exact same time...these tests\nare on a best effort basis. It would be incorrect to write code that depends\non this check. The side effects of using the same memoization states simultaneously\nin multiple threads can lead to infinite processor use that is not interruptibe\nby any mechanism other than restarting the image.")
    public static final SubLObject with_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject state = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    state = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject original_memoization_process = $sym105$ORIGINAL_MEMOIZATION_PROCESS;
                            SubLObject current_proc = $sym106$CURRENT_PROC;
                            SubLObject local_state = $sym107$LOCAL_STATE;
                            return list(CLET, list(list(local_state, state), list($memoization_state$, local_state), bq_cons(original_memoization_process, $list_alt109)), list(PWHEN, list(CAND, local_state, list(CNOT, list(MEMOIZATION_STATE_LOCK, local_state))), list(CSETQ, original_memoization_process, list(MEMOIZATION_STATE_GET_CURRENT_PROCESS_INTERNAL, local_state)), list(CLET, list(bq_cons(current_proc, $list_alt114)), list(PIF, list(EQ, NIL, original_memoization_process), list(MEMOIZATION_STATE_SET_CURRENT_PROCESS_INTERNAL, local_state, current_proc), listS(PWHEN, list(CNOT, list(EQ, original_memoization_process, current_proc)), $list_alt116)))), bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, list(CAND, local_state, list(EQ, NIL, original_memoization_process)), listS(MEMOIZATION_STATE_SET_CURRENT_PROCESS_INTERNAL, local_state, $list_alt109))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY assuming STATE is the memoization state.
     * If state is NIL, then no memoization is used. Note: tests where
     * added to verify that multiple threads are not currently
     * using the same memoization state at the exact same time...these tests
     * are on a best effort basis. It would be incorrect to write code that depends
     * on this check. The side effects of using the same memoization states simultaneously
     * in multiple threads can lead to infinite processor use that is not interruptibe
     * by any mechanism other than restarting the image.
     */
    @LispMethod(comment = "Execute BODY assuming STATE is the memoization state.\r\nIf state is NIL, then no memoization is used. Note: tests where\r\nadded to verify that multiple threads are not currently\r\nusing the same memoization state at the exact same time...these tests\r\nare on a best effort basis. It would be incorrect to write code that depends\r\non this check. The side effects of using the same memoization states simultaneously\r\nin multiple threads can lead to infinite processor use that is not interruptibe\r\nby any mechanism other than restarting the image.\nExecute BODY assuming STATE is the memoization state.\nIf state is NIL, then no memoization is used. Note: tests where\nadded to verify that multiple threads are not currently\nusing the same memoization state at the exact same time...these tests\nare on a best effort basis. It would be incorrect to write code that depends\non this check. The side effects of using the same memoization states simultaneously\nin multiple threads can lead to infinite processor use that is not interruptibe\nby any mechanism other than restarting the image.")
    public static SubLObject with_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject original_memoization_process = $sym116$ORIGINAL_MEMOIZATION_PROCESS;
            final SubLObject local_state = $sym117$LOCAL_STATE;
            return list(CLET, list(list(local_state, state), list($memoization_state$, local_state), list(original_memoization_process, list(MEMOIZATION_STATE_ORIGINAL_PROCESS, local_state))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS, local_state, original_memoization_process)));
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static SubLObject memoization_state_original_process(final SubLObject local_state) {
        SubLObject original_process = NIL;
        if ((NIL != local_state) && (NIL == memoization_state_lock(local_state))) {
            original_process = memoization_state_get_current_process_internal(local_state);
            final SubLObject current_proc = current_process();
            if (NIL == original_process) {
                memoization_state_set_current_process_internal(local_state, current_proc);
            } else
                if (!original_process.eql(current_proc)) {
                    Errors.warn($str124$Invalid_attempt_to_reuse_memoizat);
                }

        }
        return original_process;
    }

    public static SubLObject memoization_state_possibly_clear_original_process(final SubLObject local_state, final SubLObject original_process) {
        if ((NIL != local_state) && (NIL == original_process)) {
            memoization_state_set_current_process_internal(local_state, NIL);
        }
        return NIL;
    }

    public static final SubLObject possibly_clone_memoization_state_alt(SubLObject v_memoization_state) {
        return v_memoization_state;
    }

    public static SubLObject possibly_clone_memoization_state(final SubLObject v_memoization_state) {
        return v_memoization_state;
    }

    public static final SubLObject possibly_merge_back_memoization_state_alt(SubLObject cloned_state, SubLObject orig_state, SubLObject old_state) {
        return NIL;
    }

    public static SubLObject possibly_merge_back_memoization_state(final SubLObject cloned_state, final SubLObject orig_state, final SubLObject old_state) {
        return NIL;
    }

    /**
     * Execute BODY within a new, clean memoization state.
     */
    @LispMethod(comment = "Execute BODY within a new, clean memoization state.")
    public static final SubLObject with_new_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject state = $sym118$STATE;
            return list(CLET, list(bq_cons(state, $list_alt119)), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
    }

    /**
     * Execute BODY within a new, clean memoization state.
     */
    @LispMethod(comment = "Execute BODY within a new, clean memoization state.")
    public static SubLObject with_new_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject state = $sym125$STATE;
        return list(CLET, list(bq_cons(state, $list126)), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
    }

    public static SubLObject with_new_profiled_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list127);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list127);
        stream = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state = $sym128$STATE;
            return list(CLET, list(bq_cons(state, $list126)), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)), list(PRINT_ONE_PER_LINE, list(GATHER_MEMOIZATION_STATE_STATISTICS, state), stream));
        }
        cdestructuring_bind_error(datum, $list127);
        return NIL;
    }

    /**
     * Execute BODY within a memoization state, using the current one if possible,
     * and a new one if necessary.
     */
    @LispMethod(comment = "Execute BODY within a memoization state, using the current one if possible,\r\nand a new one if necessary.\nExecute BODY within a memoization state, using the current one if possible,\nand a new one if necessary.")
    public static final SubLObject with_possibly_new_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject state = $sym121$STATE;
            return list(CLET, list(bq_cons(state, $list_alt122)), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
    }

    /**
     * Execute BODY within a memoization state, using the current one if possible,
     * and a new one if necessary.
     */
    @LispMethod(comment = "Execute BODY within a memoization state, using the current one if possible,\r\nand a new one if necessary.\nExecute BODY within a memoization state, using the current one if possible,\nand a new one if necessary.")
    public static SubLObject with_possibly_new_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject state = $sym131$STATE;
        return list(CLET, list(bq_cons(state, $list132)), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
    }

    public static final SubLObject possibly_new_memoization_state_alt() {
        {
            SubLObject current = current_memoization_state();
            if (NIL == memoization_state_p(current)) {
                current = create_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return current;
        }
    }

    public static SubLObject possibly_new_memoization_state() {
        SubLObject current = current_memoization_state();
        if (NIL == memoization_state_p(current)) {
            current = create_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return current;
    }

    /**
     * Clear the memoization for FUNCTION-SYMBOL in memoization STATE.
     * deprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function state function-symbol))
     */
    @LispMethod(comment = "Clear the memoization for FUNCTION-SYMBOL in memoization STATE.\r\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function state function-symbol))\nClear the memoization for FUNCTION-SYMBOL in memoization STATE.\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function state function-symbol))")
    public static final SubLObject clear_memoization_alt(SubLObject state, SubLObject function_symbol) {
        SubLTrampolineFile.checkType(state, MEMOIZATION_STATE_P);
        SubLTrampolineFile.checkType(function_symbol, SYMBOLP);
        {
            SubLObject caching_state = memoization_state_lookup(state, function_symbol, UNPROVIDED);
            if (NIL != caching_state) {
                caching_state_clear(caching_state);
            }
        }
        return state;
    }

    /**
     * Clear the memoization for FUNCTION-SYMBOL in memoization STATE.
     * deprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function state function-symbol))
     */
    @LispMethod(comment = "Clear the memoization for FUNCTION-SYMBOL in memoization STATE.\r\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function state function-symbol))\nClear the memoization for FUNCTION-SYMBOL in memoization STATE.\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function state function-symbol))")
    public static SubLObject clear_memoization(final SubLObject state, final SubLObject function_symbol) {
        assert NIL != memoization_state_p(state) : "! memoization_state.memoization_state_p(state) " + ("memoization_state.memoization_state_p(state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(state) ") + state;
        assert NIL != symbolp(function_symbol) : "! symbolp(function_symbol) " + ("Types.symbolp(function_symbol) " + "CommonSymbols.NIL != Types.symbolp(function_symbol) ") + function_symbol;
        final SubLObject caching_state = memoization_state_lookup(state, function_symbol, UNPROVIDED);
        if (NIL != caching_state) {
            caching_state_clear(caching_state);
        }
        return state;
    }

    /**
     * Clear the currently active memoization for FUNCTION-SYMBOL, if any.
     * deprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function (current-memoization-state) function-symbol))
     */
    @LispMethod(comment = "Clear the currently active memoization for FUNCTION-SYMBOL, if any.\r\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function (current-memoization-state) function-symbol))\nClear the currently active memoization for FUNCTION-SYMBOL, if any.\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function (current-memoization-state) function-symbol))")
    public static final SubLObject clear_current_memoization_alt(SubLObject function_symbol) {
        SubLTrampolineFile.checkType(function_symbol, SYMBOLP);
        {
            SubLObject state = current_memoization_state();
            return clear_memoization(state, function_symbol);
        }
    }

    /**
     * Clear the currently active memoization for FUNCTION-SYMBOL, if any.
     * deprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function (current-memoization-state) function-symbol))
     */
    @LispMethod(comment = "Clear the currently active memoization for FUNCTION-SYMBOL, if any.\r\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function (current-memoization-state) function-symbol))\nClear the currently active memoization for FUNCTION-SYMBOL, if any.\ndeprecated Use: (caching-state-clear (memoization-state-get-caching-state-for-function (current-memoization-state) function-symbol))")
    public static SubLObject clear_current_memoization(final SubLObject function_symbol) {
        assert NIL != symbolp(function_symbol) : "! symbolp(function_symbol) " + ("Types.symbolp(function_symbol) " + "CommonSymbols.NIL != Types.symbolp(function_symbol) ") + function_symbol;
        final SubLObject state = current_memoization_state();
        return clear_memoization(state, function_symbol);
    }

    /**
     * Clear the memoization for all functions in memoization STATE.
     * deprecated Use: (memoization-state-clear state)
     */
    @LispMethod(comment = "Clear the memoization for all functions in memoization STATE.\r\ndeprecated Use: (memoization-state-clear state)\nClear the memoization for all functions in memoization STATE.\ndeprecated Use: (memoization-state-clear state)")
    public static final SubLObject clear_all_memoization_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, MEMOIZATION_STATE_P);
        memoization_state_clear(state);
        return state;
    }

    /**
     * Clear the memoization for all functions in memoization STATE.
     * deprecated Use: (memoization-state-clear state)
     */
    @LispMethod(comment = "Clear the memoization for all functions in memoization STATE.\r\ndeprecated Use: (memoization-state-clear state)\nClear the memoization for all functions in memoization STATE.\ndeprecated Use: (memoization-state-clear state)")
    public static SubLObject clear_all_memoization(final SubLObject state) {
        assert NIL != memoization_state_p(state) : "! memoization_state.memoization_state_p(state) " + ("memoization_state.memoization_state_p(state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(state) ") + state;
        memoization_state_clear(state);
        return state;
    }

    /**
     * Clear all currently active memoization, if any.
     * deprecated Use: (memoization-state-clear (current-memoization-state))
     */
    @LispMethod(comment = "Clear all currently active memoization, if any.\r\ndeprecated Use: (memoization-state-clear (current-memoization-state))\nClear all currently active memoization, if any.\ndeprecated Use: (memoization-state-clear (current-memoization-state))")
    public static final SubLObject clear_all_current_memoization_alt() {
        {
            SubLObject state = current_memoization_state();
            if (NIL != state) {
                return clear_all_memoization(state);
            }
        }
        return NIL;
    }

    /**
     * Clear all currently active memoization, if any.
     * deprecated Use: (memoization-state-clear (current-memoization-state))
     */
    @LispMethod(comment = "Clear all currently active memoization, if any.\r\ndeprecated Use: (memoization-state-clear (current-memoization-state))\nClear all currently active memoization, if any.\ndeprecated Use: (memoization-state-clear (current-memoization-state))")
    public static SubLObject clear_all_current_memoization() {
        final SubLObject state = current_memoization_state();
        if (NIL != state) {
            return clear_all_memoization(state);
        }
        return NIL;
    }

    public static SubLObject memoization_state_remove_function_results_with_args(final SubLObject state, final SubLObject function_symbol, final SubLObject args_list) {
        if ((NIL != memoization_state_p(state)) && function_symbol.isSymbol()) {
            final SubLObject caching_state = memoization_state_lookup(state, function_symbol, UNPROVIDED);
            if (NIL != caching_state) {
                return caching_state_remove_function_results_with_args(caching_state, args_list, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject current_memoization_state_remove_function_results_with_args(final SubLObject function_symbol, final SubLObject args_list) {
        final SubLObject state = current_memoization_state();
        if (NIL != state) {
            return memoization_state_remove_function_results_with_args(state, function_symbol, args_list);
        }
        return NIL;
    }

    public static final SubLObject note_memoized_function_alt(SubLObject function_symbol) {
        {
            SubLObject item_var = function_symbol;
            if (NIL == member(item_var, $memoized_functions$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $memoized_functions$.setGlobalValue(cons(item_var, $memoized_functions$.getGlobalValue()));
            }
        }
        return function_symbol;
    }

    public static SubLObject note_memoized_function(final SubLObject function_symbol) {
        if (NIL == member(function_symbol, $memoized_functions$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $memoized_functions$.setGlobalValue(cons(function_symbol, $memoized_functions$.getGlobalValue()));
        }
        return function_symbol;
    }

    public static final SubLObject memoized_functions_alt() {
        return list_utilities.remove_if_not(FBOUNDP, $memoized_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject memoized_functions() {
        return list_utilities.remove_if_not(FBOUNDP, $memoized_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Define NAME as a memoized function with ARGS and BODY.
     * TEST is the equality test used for looking up previous calls to equivalent ARGS.
     * If TEST is not provided, #'EQL is used.
     * If CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.
     * If FACCESS is provided, the method is declaimed to have that FACCESS level.
     */
    @LispMethod(comment = "Define NAME as a memoized function with ARGS and BODY.\r\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\r\nIf TEST is not provided, #\'EQL is used.\r\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\r\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.\nDefine NAME as a memoized function with ARGS and BODY.\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\nIf TEST is not provided, #\'EQL is used.\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.")
    public static final SubLObject define_memoized_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt128);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt128);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject args = current;
                    current = temp;
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    {
                        SubLObject temp_5 = current.rest();
                        current = current.first();
                        {
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt128);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt128);
                                if (NIL == member(current_6, $list_alt129, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt128);
                            }
                            {
                                SubLObject test_tail = property_list_member($TEST, current);
                                SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : NIL;
                                SubLObject capacity_tail = property_list_member($CAPACITY, current);
                                SubLObject capacity = (NIL != capacity_tail) ? ((SubLObject) (cadr(capacity_tail))) : NIL;
                                SubLObject faccess_tail = property_list_member($FACCESS, current);
                                SubLObject faccess = (NIL != faccess_tail) ? ((SubLObject) (cadr(faccess_tail))) : NIL;
                                SubLObject memoization_state_function_tail = property_list_member($MEMOIZATION_STATE_FUNCTION, current);
                                SubLObject memoization_state_function = (NIL != memoization_state_function_tail) ? ((SubLObject) (cadr(memoization_state_function_tail))) : NIL;
                                SubLObject memoization_state_function_arg_positions_tail = property_list_member($MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS, current);
                                SubLObject memoization_state_function_arg_positions = (NIL != memoization_state_function_arg_positions_tail) ? ((SubLObject) (cadr(memoization_state_function_arg_positions_tail))) : NIL;
                                current = temp_5;
                                {
                                    SubLObject body = current;
                                    return define_memoized_internal(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define NAME as a memoized function with ARGS and BODY.
     * TEST is the equality test used for looking up previous calls to equivalent ARGS.
     * If TEST is not provided, #'EQL is used.
     * If CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.
     * If FACCESS is provided, the method is declaimed to have that FACCESS level.
     */
    @LispMethod(comment = "Define NAME as a memoized function with ARGS and BODY.\r\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\r\nIf TEST is not provided, #\'EQL is used.\r\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\r\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.\nDefine NAME as a memoized function with ARGS and BODY.\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\nIf TEST is not provided, #\'EQL is used.\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.")
    public static SubLObject define_memoized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        final SubLObject temp = current.rest();
        final SubLObject args;
        current = args = current.first();
        current = temp;
        destructuring_bind_must_consp(current, datum, $list138);
        final SubLObject temp_$5 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list138);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list138);
            if (NIL == member(current_$6, $list139, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list138);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : NIL;
        final SubLObject capacity_tail = property_list_member($CAPACITY, current);
        final SubLObject capacity = (NIL != capacity_tail) ? cadr(capacity_tail) : NIL;
        final SubLObject faccess_tail = property_list_member($FACCESS, current);
        final SubLObject faccess = (NIL != faccess_tail) ? cadr(faccess_tail) : NIL;
        final SubLObject memoization_state_function_tail = property_list_member($MEMOIZATION_STATE_FUNCTION, current);
        final SubLObject memoization_state_function = (NIL != memoization_state_function_tail) ? cadr(memoization_state_function_tail) : NIL;
        final SubLObject memoization_state_function_arg_positions_tail = property_list_member($MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS, current);
        final SubLObject memoization_state_function_arg_positions = (NIL != memoization_state_function_arg_positions_tail) ? cadr(memoization_state_function_arg_positions_tail) : NIL;
        final SubLObject body;
        current = body = temp_$5;
        return define_memoized_internal(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
    }

    public static final SubLObject macro_test_to_run_time_test_alt(SubLObject test) {
        if (NIL == test) {
            return $list_alt133;
        }
        if (test.isCons()) {
            if (length(test).numG(TWO_INTEGER)) {
                Errors.error($str_alt134$Got_a_test_expression_of_length__, length(test), test);
            }
            if (QUOTE == test.first()) {
                return test;
            }
            if (FUNCTION == test.first()) {
                return list(QUOTE, hash_table_utilities.hash_test_to_symbol(eval(test)));
            }
            Errors.error($str_alt137$Don_t_know_how_to_convert___S_to_, test);
        } else {
            if (test.isFunction()) {
                return list(QUOTE, hash_table_utilities.hash_test_to_symbol(eval(test)));
            }
            return list(QUOTE, test);
        }
        return NIL;
    }

    public static SubLObject macro_test_to_run_time_test(final SubLObject test) {
        if (NIL == test) {
            return $list143;
        }
        if (test.isCons()) {
            if (length(test).numG(TWO_INTEGER)) {
                Errors.error($str144$Got_a_test_expression_of_length__, length(test), test);
            }
            if (QUOTE == test.first()) {
                return test;
            }
            if (FUNCTION == test.first()) {
                return list(QUOTE, hash_table_utilities.hash_test_to_symbol(eval(test)));
            }
            Errors.error($str147$Don_t_know_how_to_convert___S_to_, test);
            return NIL;
        } else {
            if (test.isFunction()) {
                return list(QUOTE, hash_table_utilities.hash_test_to_symbol(eval(test)));
            }
            return list(QUOTE, test);
        }
    }

    public static final SubLObject define_memoized_internal_alt(SubLObject name, SubLObject args, SubLObject test, SubLObject capacity, SubLObject faccess, SubLObject memoization_state_function, SubLObject memoization_state_function_arg_positions, SubLObject body) {
        {
            SubLObject formal_args = define_formal_args(args);
            SubLObject pcase_var = length(formal_args);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return define_memoized_internal_0_or_1(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return define_memoized_internal_0_or_1(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
                } else {
                    return define_memoized_internal_n(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
                }
            }
        }
    }

    public static SubLObject define_memoized_internal(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject capacity, final SubLObject faccess, final SubLObject memoization_state_function, final SubLObject memoization_state_function_arg_positions, final SubLObject body) {
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject pcase_var = length(formal_args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return define_memoized_internal_0_or_1(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return define_memoized_internal_0_or_1(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
        }
        return define_memoized_internal_n(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
    }

    /**
     * Macro expander for DEFINE-MEMOIZED
     */
    @LispMethod(comment = "Macro expander for DEFINE-MEMOIZED")
    public static final SubLObject define_memoized_internal_0_or_1_alt(SubLObject name, SubLObject args, SubLObject test, SubLObject capacity, SubLObject faccess, SubLObject memoization_state_function, SubLObject memoization_state_function_arg_positions, SubLObject body) {
        {
            SubLObject v_memoization_state = $sym138$MEMOIZATION_STATE;
            SubLObject caching_state = $sym139$CACHING_STATE;
            SubLObject results = $sym140$RESULTS;
            SubLObject internal_function = caching_internal_function(name);
            SubLObject internal_test = macro_test_to_run_time_test(test);
            SubLObject formal_args = define_formal_args(args);
            return listS(PROGN, note_memoized_function_code(name), caching_internal_function_code(internal_function, args, body), append(NIL != faccess ? ((SubLObject) (list(list(DECLAIM, list(FACCESS, faccess, name))))) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? ((SubLObject) (list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))))) : NIL, list(list(CLET, list(list(v_memoization_state, lookup_memoization_state_code(memoization_state_function, name, memoization_state_function_arg_positions, formal_args)), bq_cons(caching_state, $list_alt109)), list(PUNLESS, v_memoization_state, list(RET, bq_cons(internal_function, append(formal_args, NIL)))), list(CSETQ, caching_state, list(MEMOIZATION_STATE_LOOKUP, v_memoization_state, list(QUOTE, name))), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_CACHING_STATE, list(MEMOIZATION_STATE_LOCK, v_memoization_state), list(QUOTE, name), length(formal_args), capacity, internal_test)), list(MEMOIZATION_STATE_PUT, v_memoization_state, list(QUOTE, name), caching_state)), list(CLET, list(list(results, caching_lookup_code(caching_state, formal_args, ZERO_INTEGER, NIL, NIL))), listS(PWHEN, listS(EQ, results, $list_alt151), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))))) : NIL, list(list(CSETQ, results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL)))), NIL == formal_args ? ((SubLObject) (list(CACHING_STATE_SET_ZERO_ARG_RESULTS, caching_state, results))) : listS(CACHING_STATE_PUT, caching_state, append(formal_args, list(results)))))), list(RET, list(CACHING_RESULTS, results))))))))));
        }
    }

    /**
     * Macro expander for DEFINE-MEMOIZED
     */
    @LispMethod(comment = "Macro expander for DEFINE-MEMOIZED")
    public static SubLObject define_memoized_internal_0_or_1(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject capacity, final SubLObject faccess, final SubLObject memoization_state_function, final SubLObject memoization_state_function_arg_positions, final SubLObject body) {
        final SubLObject v_memoization_state = $sym148$MEMOIZATION_STATE;
        final SubLObject caching_state = $sym149$CACHING_STATE;
        final SubLObject results = $sym150$RESULTS;
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        final SubLObject formal_args = define_formal_args(args);
        return listS(PROGN, note_memoized_function_code(name), caching_internal_function_code(internal_function, args, body), append(NIL != faccess ? list(list(DECLAIM, list(FACCESS, faccess, name))) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))) : NIL, list(list(CLET, list(list(v_memoization_state, lookup_memoization_state_code(memoization_state_function, name, memoization_state_function_arg_positions, formal_args)), bq_cons(caching_state, $list157)), list(PUNLESS, v_memoization_state, list(RET, bq_cons(internal_function, append(formal_args, NIL)))), list(CSETQ, caching_state, list(MEMOIZATION_STATE_LOOKUP, v_memoization_state, list(QUOTE, name))), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_CACHING_STATE, list(MEMOIZATION_STATE_LOCK, v_memoization_state), list(QUOTE, name), length(formal_args), capacity, internal_test)), list(MEMOIZATION_STATE_PUT, v_memoization_state, list(QUOTE, name), caching_state)), list(CLET, list(list(results, caching_lookup_code(caching_state, formal_args, ZERO_INTEGER, NIL, NIL))), listS(PWHEN, listS(EQ, results, $list162), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))) : NIL, list(list(CSETQ, results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL)))), NIL == formal_args ? list(CACHING_STATE_SET_ZERO_ARG_RESULTS, caching_state, results) : listS(CACHING_STATE_PUT, caching_state, append(formal_args, list(results)))))), list(RET, list(CACHING_RESULTS, results))))))))));
    }

    /**
     * Macro expander for DEFINE-MEMOIZED
     */
    @LispMethod(comment = "Macro expander for DEFINE-MEMOIZED")
    public static final SubLObject define_memoized_internal_n_alt(SubLObject name, SubLObject args, SubLObject test, SubLObject capacity, SubLObject faccess, SubLObject memoization_state_function, SubLObject memoization_state_function_arg_positions, SubLObject body) {
        {
            SubLObject sxhash = $sym157$SXHASH;
            SubLObject v_memoization_state = $sym158$MEMOIZATION_STATE;
            SubLObject caching_state = $sym159$CACHING_STATE;
            SubLObject results = $sym160$RESULTS;
            SubLObject collisions = $sym161$COLLISIONS;
            SubLObject internal_function = caching_internal_function(name);
            SubLObject internal_test = macro_test_to_run_time_test(test);
            SubLObject formal_args = define_formal_args(args);
            return listS(PROGN, note_memoized_function_code(name), caching_internal_function_code(internal_function, args, body), append(NIL != faccess ? ((SubLObject) (list(list(DECLAIM, list(FACCESS, faccess, name))))) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? ((SubLObject) (list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))))) : NIL, list(list(CLET, list(list(v_memoization_state, lookup_memoization_state_code(memoization_state_function, name, memoization_state_function_arg_positions, formal_args)), bq_cons(caching_state, $list_alt109)), list(PUNLESS, v_memoization_state, list(RET, bq_cons(internal_function, append(formal_args, NIL)))), list(CSETQ, caching_state, list(MEMOIZATION_STATE_LOOKUP, v_memoization_state, list(QUOTE, name))), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_CACHING_STATE, list(MEMOIZATION_STATE_LOCK, v_memoization_state), list(QUOTE, name), length(formal_args), capacity, internal_test)), list(MEMOIZATION_STATE_PUT, v_memoization_state, list(QUOTE, name), caching_state)), listS(CLET, list(list(sxhash, caching_sxhash_code(formal_args)), list(collisions, list(CACHING_STATE_LOOKUP, caching_state, sxhash))), list(PWHEN, list(CNOT, listS(EQ, collisions, $list_alt151)), caching_lookup_code(caching_state, formal_args, sxhash, collisions, internal_test)), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))))) : NIL, list(list(CLET, list(list(results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL))))), list(CACHING_STATE_ENTER_MULTI_KEY_N, caching_state, sxhash, collisions, results, bq_cons(LIST, append(formal_args, NIL))), list(RET, list(CACHING_RESULTS, results)))))))))))));
        }
    }

    /**
     * Macro expander for DEFINE-MEMOIZED
     */
    @LispMethod(comment = "Macro expander for DEFINE-MEMOIZED")
    public static SubLObject define_memoized_internal_n(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject capacity, final SubLObject faccess, final SubLObject memoization_state_function, final SubLObject memoization_state_function_arg_positions, final SubLObject body) {
        final SubLObject sxhash = $sym168$SXHASH;
        final SubLObject v_memoization_state = $sym169$MEMOIZATION_STATE;
        final SubLObject caching_state = $sym170$CACHING_STATE;
        final SubLObject results = $sym171$RESULTS;
        final SubLObject collisions = $sym172$COLLISIONS;
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        final SubLObject formal_args = define_formal_args(args);
        return listS(PROGN, note_memoized_function_code(name), caching_internal_function_code(internal_function, args, body), append(NIL != faccess ? list(list(DECLAIM, list(FACCESS, faccess, name))) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))) : NIL, list(list(CLET, list(list(v_memoization_state, lookup_memoization_state_code(memoization_state_function, name, memoization_state_function_arg_positions, formal_args)), bq_cons(caching_state, $list157)), list(PUNLESS, v_memoization_state, list(RET, bq_cons(internal_function, append(formal_args, NIL)))), list(CSETQ, caching_state, list(MEMOIZATION_STATE_LOOKUP, v_memoization_state, list(QUOTE, name))), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_CACHING_STATE, list(MEMOIZATION_STATE_LOCK, v_memoization_state), list(QUOTE, name), length(formal_args), capacity, internal_test)), list(MEMOIZATION_STATE_PUT, v_memoization_state, list(QUOTE, name), caching_state)), listS(CLET, list(list(sxhash, caching_sxhash_code(formal_args)), list(collisions, list(CACHING_STATE_LOOKUP, caching_state, sxhash))), list(PWHEN, list(CNOT, listS(EQ, collisions, $list162)), caching_lookup_code(caching_state, formal_args, sxhash, collisions, internal_test)), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))) : NIL, list(list(CLET, list(list(results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL))))), list(CACHING_STATE_ENTER_MULTI_KEY_N, caching_state, sxhash, collisions, results, bq_cons(LIST, append(formal_args, NIL))), list(RET, list(CACHING_RESULTS, results)))))))))))));
    }

    public static final SubLObject caching_sxhash_code_alt(SubLObject formal_args) {
        {
            SubLObject arg_list_length = length(formal_args);
            SubLObject tmp = formal_args;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            SubLObject arg3 = NIL;
            SubLObject arg4 = NIL;
            SubLObject arg5 = NIL;
            SubLObject arg6 = NIL;
            SubLObject arg7 = NIL;
            SubLObject arg8 = NIL;
            SubLObject arg9 = NIL;
            SubLObject arg10 = NIL;
            if (arg_list_length.numL(ELEVEN_INTEGER)) {
                arg1 = tmp.first();
                tmp = tmp.rest();
                arg2 = tmp.first();
                tmp = tmp.rest();
                arg3 = tmp.first();
                tmp = tmp.rest();
                arg4 = tmp.first();
                tmp = tmp.rest();
                arg5 = tmp.first();
                tmp = tmp.rest();
                arg6 = tmp.first();
                tmp = tmp.rest();
                arg7 = tmp.first();
                tmp = tmp.rest();
                arg8 = tmp.first();
                tmp = tmp.rest();
                arg9 = tmp.first();
                tmp = tmp.rest();
                arg10 = tmp.first();
            }
            if (TWO_INTEGER == arg_list_length) {
                return list(SXHASH_CALC_2, arg1, arg2);
            } else {
                if (THREE_INTEGER == arg_list_length) {
                    return list(SXHASH_CALC_3, arg1, arg2, arg3);
                } else {
                    if (FOUR_INTEGER == arg_list_length) {
                        return list(SXHASH_CALC_4, arg1, arg2, arg3, arg4);
                    } else {
                        if (FIVE_INTEGER == arg_list_length) {
                            return list(SXHASH_CALC_5, arg1, arg2, arg3, arg4, arg5);
                        } else {
                            if (SIX_INTEGER == arg_list_length) {
                                return list(SXHASH_CALC_6, arg1, arg2, arg3, arg4, arg5, arg6);
                            } else {
                                if (SEVEN_INTEGER == arg_list_length) {
                                    return list(SXHASH_CALC_7, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
                                } else {
                                    if (EIGHT_INTEGER == arg_list_length) {
                                        return list(new SubLObject[]{ SXHASH_CALC_8, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
                                    } else {
                                        if (NINE_INTEGER == arg_list_length) {
                                            return list(new SubLObject[]{ SXHASH_CALC_9, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
                                        } else {
                                            if (TEN_INTEGER == arg_list_length) {
                                                return list(new SubLObject[]{ SXHASH_CALC_10, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
                                            } else {
                                                return list(SXHASH_CALC_N, bq_cons(LIST, append(formal_args, NIL)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject caching_sxhash_code(final SubLObject formal_args) {
        final SubLObject arg_list_length = length(formal_args);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject arg3 = NIL;
        SubLObject arg4 = NIL;
        SubLObject arg5 = NIL;
        SubLObject arg6 = NIL;
        SubLObject arg7 = NIL;
        SubLObject arg8 = NIL;
        SubLObject arg9 = NIL;
        SubLObject arg10 = NIL;
        if (arg_list_length.numL(ELEVEN_INTEGER)) {
            arg1 = formal_args.first();
            SubLObject tmp = formal_args.rest();
            arg2 = tmp.first();
            tmp = tmp.rest();
            arg3 = tmp.first();
            tmp = tmp.rest();
            arg4 = tmp.first();
            tmp = tmp.rest();
            arg5 = tmp.first();
            tmp = tmp.rest();
            arg6 = tmp.first();
            tmp = tmp.rest();
            arg7 = tmp.first();
            tmp = tmp.rest();
            arg8 = tmp.first();
            tmp = tmp.rest();
            arg9 = tmp.first();
            tmp = tmp.rest();
            arg10 = tmp.first();
        }
        if (TWO_INTEGER.eql(arg_list_length)) {
            return list(SXHASH_CALC_2, arg1, arg2);
        }
        if (THREE_INTEGER.eql(arg_list_length)) {
            return list(SXHASH_CALC_3, arg1, arg2, arg3);
        }
        if (FOUR_INTEGER.eql(arg_list_length)) {
            return list(SXHASH_CALC_4, arg1, arg2, arg3, arg4);
        }
        if (FIVE_INTEGER.eql(arg_list_length)) {
            return list(SXHASH_CALC_5, arg1, arg2, arg3, arg4, arg5);
        }
        if (SIX_INTEGER.eql(arg_list_length)) {
            return list(SXHASH_CALC_6, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        if (SEVEN_INTEGER.eql(arg_list_length)) {
            return list(SXHASH_CALC_7, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
        if (EIGHT_INTEGER.eql(arg_list_length)) {
            return list(new SubLObject[]{ SXHASH_CALC_8, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        }
        if (NINE_INTEGER.eql(arg_list_length)) {
            return list(new SubLObject[]{ SXHASH_CALC_9, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
        }
        if (TEN_INTEGER.eql(arg_list_length)) {
            return list(new SubLObject[]{ SXHASH_CALC_10, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
        }
        return list(SXHASH_CALC_N, bq_cons(LIST, append(formal_args, NIL)));
    }

    public static final SubLObject caching_lookup_code_alt(SubLObject caching_state, SubLObject formal_args, SubLObject sxhash, SubLObject collisions, SubLObject test) {
        {
            SubLObject arg_list_length = length(formal_args);
            SubLObject tmp = formal_args;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            SubLObject arg3 = NIL;
            SubLObject arg4 = NIL;
            SubLObject arg5 = NIL;
            SubLObject arg6 = NIL;
            SubLObject arg7 = NIL;
            SubLObject arg8 = NIL;
            SubLObject arg9 = NIL;
            SubLObject arg10 = NIL;
            test = eval(test);
            if (arg_list_length.numL(ELEVEN_INTEGER)) {
                arg1 = tmp.first();
                tmp = tmp.rest();
                arg2 = tmp.first();
                tmp = tmp.rest();
                arg3 = tmp.first();
                tmp = tmp.rest();
                arg4 = tmp.first();
                tmp = tmp.rest();
                arg5 = tmp.first();
                tmp = tmp.rest();
                arg6 = tmp.first();
                tmp = tmp.rest();
                arg7 = tmp.first();
                tmp = tmp.rest();
                arg8 = tmp.first();
                tmp = tmp.rest();
                arg9 = tmp.first();
                tmp = tmp.rest();
                arg10 = tmp.first();
            }
            if (ZERO_INTEGER == arg_list_length) {
                return list(CACHING_STATE_GET_ZERO_ARG_RESULTS, caching_state);
            } else {
                if (ONE_INTEGER == arg_list_length) {
                    return listS(CACHING_STATE_LOOKUP, caching_state, arg1, $list_alt151);
                } else {
                    if (TWO_INTEGER == arg_list_length) {
                        return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg2, $list_alt179)), $list_alt183))));
                    } else {
                        if (THREE_INTEGER == arg_list_length) {
                            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg3, $list_alt179)), $list_alt183)))));
                        } else {
                            if (FOUR_INTEGER == arg_list_length) {
                                return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg4, $list_alt179)), $list_alt183))))));
                            } else {
                                if (FIVE_INTEGER == arg_list_length) {
                                    return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg4, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg5, $list_alt179)), $list_alt183)))))));
                                } else {
                                    if (SIX_INTEGER == arg_list_length) {
                                        return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg4, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg5, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg6, $list_alt179)), $list_alt183))))))));
                                    } else {
                                        if (SEVEN_INTEGER == arg_list_length) {
                                            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg4, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg5, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg6, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg7, $list_alt179)), $list_alt183)))))))));
                                        } else {
                                            if (EIGHT_INTEGER == arg_list_length) {
                                                return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg4, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg5, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg6, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg7, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg8, $list_alt179)), $list_alt183))))))))));
                                            } else {
                                                if (NINE_INTEGER == arg_list_length) {
                                                    return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg4, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg5, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg6, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg7, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg8, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg9, $list_alt179)), $list_alt183)))))))))));
                                                } else {
                                                    if (TEN_INTEGER == arg_list_length) {
                                                        return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list_alt178, list(PWHEN, listS(test, arg1, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg2, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg3, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg4, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg5, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg6, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg7, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg8, $list_alt179), $list_alt180, list(PWHEN, listS(test, arg9, $list_alt179), $list_alt180, listS(PWHEN, list(CAND, CACHED_ARGS, $list_alt182, listS(test, arg10, $list_alt179)), $list_alt183))))))))))));
                                                    } else {
                                                        return list(CACHING_STATE_LOOKUP_MULTI_KEY_N, caching_state, bq_cons(LIST, append(formal_args, NIL)), sxhash, collisions);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject caching_lookup_code(final SubLObject caching_state, final SubLObject formal_args, final SubLObject sxhash, final SubLObject collisions, SubLObject test) {
        final SubLObject arg_list_length = length(formal_args);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject arg3 = NIL;
        SubLObject arg4 = NIL;
        SubLObject arg5 = NIL;
        SubLObject arg6 = NIL;
        SubLObject arg7 = NIL;
        SubLObject arg8 = NIL;
        SubLObject arg9 = NIL;
        SubLObject arg10 = NIL;
        test = eval(test);
        if (arg_list_length.numL(ELEVEN_INTEGER)) {
            arg1 = formal_args.first();
            SubLObject tmp = formal_args.rest();
            arg2 = tmp.first();
            tmp = tmp.rest();
            arg3 = tmp.first();
            tmp = tmp.rest();
            arg4 = tmp.first();
            tmp = tmp.rest();
            arg5 = tmp.first();
            tmp = tmp.rest();
            arg6 = tmp.first();
            tmp = tmp.rest();
            arg7 = tmp.first();
            tmp = tmp.rest();
            arg8 = tmp.first();
            tmp = tmp.rest();
            arg9 = tmp.first();
            tmp = tmp.rest();
            arg10 = tmp.first();
        }
        if (ZERO_INTEGER.eql(arg_list_length)) {
            return list(CACHING_STATE_GET_ZERO_ARG_RESULTS, caching_state);
        }
        if (ONE_INTEGER.eql(arg_list_length)) {
            return listS(CACHING_STATE_LOOKUP, caching_state, arg1, $list162);
        }
        if (TWO_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg2, $list191)), $list196))));
        }
        if (THREE_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg3, $list191)), $list196)))));
        }
        if (FOUR_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg4, $list191)), $list196))))));
        }
        if (FIVE_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, list(PWHEN, listS(test, arg4, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg5, $list191)), $list196)))))));
        }
        if (SIX_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, list(PWHEN, listS(test, arg4, $list191), $list192, list(PWHEN, listS(test, arg5, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg6, $list191)), $list196))))))));
        }
        if (SEVEN_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, list(PWHEN, listS(test, arg4, $list191), $list192, list(PWHEN, listS(test, arg5, $list191), $list192, list(PWHEN, listS(test, arg6, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg7, $list191)), $list196)))))))));
        }
        if (EIGHT_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, list(PWHEN, listS(test, arg4, $list191), $list192, list(PWHEN, listS(test, arg5, $list191), $list192, list(PWHEN, listS(test, arg6, $list191), $list192, list(PWHEN, listS(test, arg7, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg8, $list191)), $list196))))))))));
        }
        if (NINE_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, list(PWHEN, listS(test, arg4, $list191), $list192, list(PWHEN, listS(test, arg5, $list191), $list192, list(PWHEN, listS(test, arg6, $list191), $list192, list(PWHEN, listS(test, arg7, $list191), $list192, list(PWHEN, listS(test, arg8, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg9, $list191)), $list196)))))))))));
        }
        if (TEN_INTEGER.eql(arg_list_length)) {
            return list(CDOLIST, list(COLLISION, collisions), list(CLET, $list190, list(PWHEN, listS(test, arg1, $list191), $list192, list(PWHEN, listS(test, arg2, $list191), $list192, list(PWHEN, listS(test, arg3, $list191), $list192, list(PWHEN, listS(test, arg4, $list191), $list192, list(PWHEN, listS(test, arg5, $list191), $list192, list(PWHEN, listS(test, arg6, $list191), $list192, list(PWHEN, listS(test, arg7, $list191), $list192, list(PWHEN, listS(test, arg8, $list191), $list192, list(PWHEN, listS(test, arg9, $list191), $list192, listS(PWHEN, list(CAND, CACHED_ARGS, $list195, listS(test, arg10, $list191)), $list196))))))))))));
        }
        return list(CACHING_STATE_LOOKUP_MULTI_KEY_N, caching_state, bq_cons(LIST, append(formal_args, NIL)), sxhash, collisions);
    }

    public static final SubLObject lookup_memoization_state_code_alt(SubLObject memoization_state_function, SubLObject name, SubLObject memoization_state_function_arg_positions, SubLObject args) {
        if (NIL != memoization_state_function) {
            {
                SubLObject func = NIL;
                func = cons(memoization_state_function, func);
                {
                    SubLObject cdolist_list_var = memoization_state_function_arg_positions;
                    SubLObject arg_pos = NIL;
                    for (arg_pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_pos = cdolist_list_var.first()) {
                        SubLTrampolineFile.enforceType(arg_pos, NON_NEGATIVE_INTEGER_P);
                        if (arg_pos == ZERO_INTEGER) {
                            func = cons(list(MAKE_SYMBOL, symbol_name(name)), func);
                        } else {
                            func = cons(nth(subtract(arg_pos, ONE_INTEGER), args), func);
                        }
                    }
                }
                return nreverse(func);
            }
        } else {
            return $memoization_state$;
        }
    }

    public static SubLObject lookup_memoization_state_code(final SubLObject memoization_state_function, final SubLObject name, final SubLObject memoization_state_function_arg_positions, final SubLObject args) {
        if (NIL != memoization_state_function) {
            SubLObject func = NIL;
            func = cons(memoization_state_function, func);
            SubLObject cdolist_list_var = memoization_state_function_arg_positions;
            SubLObject arg_pos = NIL;
            arg_pos = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLTrampolineFile.enforceType(arg_pos, NON_NEGATIVE_INTEGER_P);
                if (arg_pos.eql(ZERO_INTEGER)) {
                    func = cons(list(MAKE_SYMBOL, symbol_name(name)), func);
                } else {
                    func = cons(nth(subtract(arg_pos, ONE_INTEGER), args), func);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_pos = cdolist_list_var.first();
            } 
            return nreverse(func);
        }
        return $memoization_state$;
    }

    public static final SubLObject note_memoized_function_code_alt(SubLObject internal_function) {
        return list(NOTE_MEMOIZED_FUNCTION, list(QUOTE, internal_function));
    }

    public static SubLObject note_memoized_function_code(final SubLObject internal_function) {
        return list(NOTE_MEMOIZED_FUNCTION, list(QUOTE, internal_function));
    }

    public static final SubLObject note_globally_cached_function_alt(SubLObject function_symbol) {
        {
            SubLObject item_var = function_symbol;
            if (NIL == member(item_var, $globally_cached_functions$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $globally_cached_functions$.setGlobalValue(cons(item_var, $globally_cached_functions$.getGlobalValue()));
            }
        }
        return function_symbol;
    }

    public static SubLObject note_globally_cached_function(final SubLObject function_symbol) {
        if (NIL == member(function_symbol, $globally_cached_functions$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $globally_cached_functions$.setGlobalValue(cons(function_symbol, $globally_cached_functions$.getGlobalValue()));
        }
        return function_symbol;
    }

    public static final SubLObject globally_cached_functions_alt() {
        return list_utilities.remove_if_not(FBOUNDP, $globally_cached_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject globally_cached_functions() {
        return list_utilities.remove_if_not(FBOUNDP, $globally_cached_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject global_cache_variables_alt() {
        return list_utilities.remove_if_not(BOUNDP, Mapping.mapcar(GLOBAL_CACHING_VARIABLE_NEW, globally_cached_functions()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject global_cache_variables() {
        return list_utilities.remove_if_not(BOUNDP, Mapping.mapcar(GLOBAL_CACHING_VARIABLE_NEW, globally_cached_functions()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject global_cache_variable_values_alt() {
        return Mapping.mapcar(SYMBOL_VALUE, global_cache_variables());
    }

    public static SubLObject global_cache_variable_values() {
        return Mapping.mapcar(SYMBOL_VALUE, global_cache_variables());
    }

    public static final SubLObject memoized_or_cached_functions_alt() {
        return append($memoized_functions$.getGlobalValue(), $globally_cached_functions$.getGlobalValue());
    }

    public static SubLObject memoized_or_cached_functions() {
        return append($memoized_functions$.getGlobalValue(), $globally_cached_functions$.getGlobalValue());
    }

    public static final SubLObject clear_all_globally_cached_functions() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = global_cache_variable_values();
                $progress_note$.setDynamicValue($str_alt191$Clearing_all_globally_cached_func, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject caching_state = NIL;
                            for (caching_state = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , caching_state = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != caching_state) {
                                    caching_state_clear(caching_state);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject clear_all_globally_cached_functions(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var = global_cache_variable_values();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str204$Clearing_all_globally_cached_func, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject caching_state = NIL;
                caching_state = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != caching_state_p(caching_state)) {
                        if (NIL != verboseP) {
                            final SubLObject caching_state_size = caching_state_size(caching_state, UNPROVIDED);
                            if (caching_state_size.numG($int$1000)) {
                                format_nil.force_format(T, $str207$____clearing_large_caching_state_, caching_state_size, caching_state_func_symbol(caching_state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        caching_state_clear(caching_state);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    caching_state = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Define NAME as a globally cached function with ARGS and BODY.
     * TEST is the equality test used for looking up previous calls to equivalent ARGS.
     * If TEST is not provided, #'EQL is used.
     * If CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.
     * If FACCESS is provided, the method is declaimed to have that FACCESS level.  Valid access levels include:
     * PRIVATE PROTECTED PUBLIC EXTERNAL API API-PROVISIONAL
     * SIZE, if provided, is an initial estimate for the number of items to be remembered.
     * CLEAR-WHEN, if provided, takes a cache-clear-trigger-p, and will clear the cache whenever a matching trigger event occurs.
     */
    @LispMethod(comment = "Define NAME as a globally cached function with ARGS and BODY.\r\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\r\nIf TEST is not provided, #\'EQL is used.\r\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\r\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.  Valid access levels include:\r\nPRIVATE PROTECTED PUBLIC EXTERNAL API API-PROVISIONAL\r\nSIZE, if provided, is an initial estimate for the number of items to be remembered.\r\nCLEAR-WHEN, if provided, takes a cache-clear-trigger-p, and will clear the cache whenever a matching trigger event occurs.\nDefine NAME as a globally cached function with ARGS and BODY.\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\nIf TEST is not provided, #\'EQL is used.\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.  Valid access levels include:\nPRIVATE PROTECTED PUBLIC EXTERNAL API API-PROVISIONAL\nSIZE, if provided, is an initial estimate for the number of items to be remembered.\nCLEAR-WHEN, if provided, takes a cache-clear-trigger-p, and will clear the cache whenever a matching trigger event occurs.")
    public static final SubLObject define_cached_new_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt194);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt194);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject args = current;
                    current = temp;
                    destructuring_bind_must_consp(current, datum, $list_alt194);
                    {
                        SubLObject temp_7 = current.rest();
                        current = current.first();
                        {
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_8 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt194);
                                current_8 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt194);
                                if (NIL == member(current_8, $list_alt195, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_8 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt194);
                            }
                            {
                                SubLObject test_tail = property_list_member($TEST, current);
                                SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : NIL;
                                SubLObject capacity_tail = property_list_member($CAPACITY, current);
                                SubLObject capacity = (NIL != capacity_tail) ? ((SubLObject) (cadr(capacity_tail))) : NIL;
                                SubLObject faccess_tail = property_list_member($FACCESS, current);
                                SubLObject faccess = (NIL != faccess_tail) ? ((SubLObject) (cadr(faccess_tail))) : NIL;
                                SubLObject size_tail = property_list_member($SIZE, current);
                                SubLObject size = (NIL != size_tail) ? ((SubLObject) (cadr(size_tail))) : NIL;
                                SubLObject clear_when_tail = property_list_member($CLEAR_WHEN, current);
                                SubLObject clear_when = (NIL != clear_when_tail) ? ((SubLObject) (cadr(clear_when_tail))) : NIL;
                                current = temp_7;
                                {
                                    SubLObject body = current;
                                    return define_cached_internal(name, args, test, size, capacity, faccess, clear_when, body);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define NAME as a globally cached function with ARGS and BODY.
     * TEST is the equality test used for looking up previous calls to equivalent ARGS.
     * If TEST is not provided, #'EQL is used.
     * If CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.
     * If FACCESS is provided, the method is declaimed to have that FACCESS level.  Valid access levels include:
     * PRIVATE PROTECTED PUBLIC EXTERNAL API API-PROVISIONAL
     * SIZE, if provided, is an initial estimate for the number of items to be remembered.
     * CLEAR-WHEN, if provided, takes a cache-clear-trigger-p, and will clear the cache whenever a matching trigger event occurs.
     */
    @LispMethod(comment = "Define NAME as a globally cached function with ARGS and BODY.\r\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\r\nIf TEST is not provided, #\'EQL is used.\r\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\r\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.  Valid access levels include:\r\nPRIVATE PROTECTED PUBLIC EXTERNAL API API-PROVISIONAL\r\nSIZE, if provided, is an initial estimate for the number of items to be remembered.\r\nCLEAR-WHEN, if provided, takes a cache-clear-trigger-p, and will clear the cache whenever a matching trigger event occurs.\nDefine NAME as a globally cached function with ARGS and BODY.\nTEST is the equality test used for looking up previous calls to equivalent ARGS.\nIf TEST is not provided, #\'EQL is used.\nIf CAPACITY is provided, only the most recently computed CAPACITY number of items are remembered.\nIf FACCESS is provided, the method is declaimed to have that FACCESS level.  Valid access levels include:\nPRIVATE PROTECTED PUBLIC EXTERNAL API API-PROVISIONAL\nSIZE, if provided, is an initial estimate for the number of items to be remembered.\nCLEAR-WHEN, if provided, takes a cache-clear-trigger-p, and will clear the cache whenever a matching trigger event occurs.")
    public static SubLObject define_cached_new(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list209);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list209);
        final SubLObject temp = current.rest();
        final SubLObject args;
        current = args = current.first();
        current = temp;
        destructuring_bind_must_consp(current, datum, $list209);
        final SubLObject temp_$8 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list209);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list209);
            if (NIL == member(current_$9, $list210, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list209);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : NIL;
        final SubLObject capacity_tail = property_list_member($CAPACITY, current);
        final SubLObject capacity = (NIL != capacity_tail) ? cadr(capacity_tail) : NIL;
        final SubLObject faccess_tail = property_list_member($FACCESS, current);
        final SubLObject faccess = (NIL != faccess_tail) ? cadr(faccess_tail) : NIL;
        final SubLObject size_tail = property_list_member($SIZE, current);
        final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
        final SubLObject clear_when_tail = property_list_member($CLEAR_WHEN, current);
        final SubLObject clear_when = (NIL != clear_when_tail) ? cadr(clear_when_tail) : NIL;
        final SubLObject body;
        current = body = temp_$8;
        return define_cached_internal(name, args, test, size, capacity, faccess, clear_when, body);
    }

    /**
     * obsolete : use define-cached-new
     */
    @LispMethod(comment = "obsolete : use define-cached-new")
    public static final SubLObject define_cached_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt198);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt198);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt198);
                    arg = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt198);
                        {
                            SubLObject temp_9 = current.rest();
                            current = current.first();
                            {
                                SubLObject size = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt198);
                                size = current.first();
                                current = current.rest();
                                {
                                    SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt198);
                                    current = current.rest();
                                    if (NIL == current) {
                                        current = temp_9;
                                        {
                                            SubLObject body = current;
                                            if (NIL != test) {
                                                return listS(DEFINE_CACHED_NEW, name, list(arg), list($SIZE, size, $TEST, test), append(body, NIL));
                                            } else {
                                                return listS(DEFINE_CACHED_NEW, name, list(arg), list($SIZE, size), append(body, NIL));
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt198);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt198);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * obsolete : use define-cached-new
     */
    @LispMethod(comment = "obsolete : use define-cached-new")
    public static SubLObject define_cached(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        arg = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            destructuring_bind_must_consp(current, datum, $list213);
            final SubLObject temp_$10 = current.rest();
            current = current.first();
            SubLObject size = NIL;
            destructuring_bind_must_consp(current, datum, $list213);
            size = current.first();
            current = current.rest();
            final SubLObject test = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list213);
            current = current.rest();
            if (NIL == current) {
                final SubLObject body;
                current = body = temp_$10;
                if (NIL != test) {
                    return listS(DEFINE_CACHED_NEW, name, list(arg), list($SIZE, size, $TEST, test), append(body, NIL));
                }
                return listS(DEFINE_CACHED_NEW, name, list(arg), list($SIZE, size), append(body, NIL));
            } else {
                cdestructuring_bind_error(datum, $list213);
            }
        } else {
            cdestructuring_bind_error(datum, $list213);
        }
        return NIL;
    }

    /**
     * obsolete : use define-cached-new
     */
    @LispMethod(comment = "obsolete : use define-cached-new")
    public static final SubLObject define_cached_multiarg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt199);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt199);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject args = current;
                    current = temp;
                    destructuring_bind_must_consp(current, datum, $list_alt199);
                    {
                        SubLObject temp_10 = current.rest();
                        current = current.first();
                        {
                            SubLObject size = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt199);
                            size = current.first();
                            current = current.rest();
                            {
                                SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt199);
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp_10;
                                    {
                                        SubLObject body = current;
                                        if (NIL != test) {
                                            return listS(DEFINE_CACHED_NEW, name, append(args, NIL), list($SIZE, size, $TEST, test), append(body, NIL));
                                        } else {
                                            return listS(DEFINE_CACHED_NEW, name, append(args, NIL), list($SIZE, size), append(body, NIL));
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt199);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * obsolete : use define-cached-new
     */
    @LispMethod(comment = "obsolete : use define-cached-new")
    public static SubLObject define_cached_multiarg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list214);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list214);
        final SubLObject temp = current.rest();
        final SubLObject args;
        current = args = current.first();
        current = temp;
        destructuring_bind_must_consp(current, datum, $list214);
        final SubLObject temp_$11 = current.rest();
        current = current.first();
        SubLObject size = NIL;
        destructuring_bind_must_consp(current, datum, $list214);
        size = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list214);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list214);
            return NIL;
        }
        final SubLObject body;
        current = body = temp_$11;
        if (NIL != test) {
            return listS(DEFINE_CACHED_NEW, name, append(args, NIL), list($SIZE, size, $TEST, test), append(body, NIL));
        }
        return listS(DEFINE_CACHED_NEW, name, append(args, NIL), list($SIZE, size), append(body, NIL));
    }

    public static final SubLObject cache_clear_trigger_p_alt(SubLObject v_object) {
        return member(v_object, $cache_clear_triggers$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject cache_clear_trigger_p(final SubLObject v_object) {
        if (NIL != atomic_cache_clear_trigger_p(v_object)) {
            return T;
        }
        if (NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject obj = NIL;
            obj = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == atomic_cache_clear_trigger_p(obj)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                obj = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject atomic_cache_clear_trigger_p(final SubLObject v_object) {
        return member(v_object, $cache_clear_triggers$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject define_cached_internal_alt(SubLObject name, SubLObject args, SubLObject test, SubLObject size, SubLObject capacity, SubLObject faccess, SubLObject clear_when, SubLObject body) {
        {
            SubLObject formal_args = define_formal_args(args);
            SubLObject pcase_var = length(formal_args);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return define_cached_internal_0_or_1(name, args, test, size, capacity, faccess, clear_when, body);
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return define_cached_internal_0_or_1(name, args, test, size, capacity, faccess, clear_when, body);
                } else {
                    return define_cached_internal_n(name, args, test, size, capacity, faccess, clear_when, body);
                }
            }
        }
    }

    public static SubLObject define_cached_internal(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject size, final SubLObject capacity, final SubLObject faccess, final SubLObject clear_when, final SubLObject body) {
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject pcase_var = length(formal_args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return define_cached_internal_0_or_1(name, args, test, size, capacity, faccess, clear_when, body);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return define_cached_internal_0_or_1(name, args, test, size, capacity, faccess, clear_when, body);
        }
        return define_cached_internal_n(name, args, test, size, capacity, faccess, clear_when, body);
    }

    /**
     * Macro expander for DEFINE-CACHED-NEW
     */
    @LispMethod(comment = "Macro expander for DEFINE-CACHED-NEW")
    public static final SubLObject define_cached_internal_0_or_1_alt(SubLObject name, SubLObject args, SubLObject test, SubLObject size, SubLObject capacity, SubLObject faccess, SubLObject clear_when, SubLObject body) {
        if (NIL == test) {
            test = symbol_function(EQL);
        }
        if (NIL == size) {
            size = ZERO_INTEGER;
        }
        if (NIL != clear_when) {
            SubLTrampolineFile.checkType(clear_when, CACHE_CLEAR_TRIGGER_P);
        }
        {
            SubLObject results = $sym202$RESULTS;
            SubLObject caching_state = $sym203$CACHING_STATE;
            SubLObject formal_args = define_formal_args(args);
            SubLObject caching_state_var = global_caching_variable_new(name);
            SubLObject args_length = length(formal_args);
            SubLObject internal_function = caching_internal_function(name);
            SubLObject internal_test = macro_test_to_run_time_test(test);
            return listS(PROGN, new SubLObject[]{ global_caching_variable_code(caching_state_var), global_caching_reset_code_new(name), global_caching_n_remove_code_new(name, args, caching_state_var), global_caching_note_function_code(name), caching_internal_function_code(internal_function, formal_args, body), append(NIL != faccess ? ((SubLObject) (caching_faccess_code(faccess, name, args))) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? ((SubLObject) (list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))))) : NIL, list(list(CLET, list(list(caching_state, caching_state_var)), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_GLOBAL_CACHING_STATE_FOR_NAME, list(QUOTE, name), list(QUOTE, caching_state_var), capacity, internal_test, args_length, size)), global_caching_register_reset_code_new(name, clear_when)), list(CLET, list(list(results, caching_lookup_code(caching_state, formal_args, ZERO_INTEGER, NIL, NIL))), listS(PWHEN, listS(EQ, results, $list_alt151), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))))) : NIL, list(list(CSETQ, results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL)))), NIL == formal_args ? ((SubLObject) (list(CACHING_STATE_SET_ZERO_ARG_RESULTS, caching_state, results))) : listS(CACHING_STATE_PUT, caching_state, append(formal_args, list(results)))))), list(RET, list(CACHING_RESULTS, results))))))))) });
        }
    }

    /**
     * Macro expander for DEFINE-CACHED-NEW
     */
    @LispMethod(comment = "Macro expander for DEFINE-CACHED-NEW")
    public static SubLObject define_cached_internal_0_or_1(final SubLObject name, final SubLObject args, SubLObject test, SubLObject size, final SubLObject capacity, final SubLObject faccess, final SubLObject clear_when, final SubLObject body) {
        if (NIL == test) {
            test = symbol_function(EQL);
        }
        if (NIL == size) {
            size = ZERO_INTEGER;
        }
        if (((NIL != clear_when) && (!assertionsDisabledSynth)) && (NIL == cache_clear_trigger_p(clear_when))) {
            throw new AssertionError(clear_when);
        }
        final SubLObject results = $sym217$RESULTS;
        final SubLObject caching_state = $sym218$CACHING_STATE;
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject caching_state_var = global_caching_variable_new(name);
        final SubLObject args_length = length(formal_args);
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        return listS(PROGN, new SubLObject[]{ global_caching_variable_code(caching_state_var), global_caching_reset_code_new(name), global_caching_n_remove_code_new(name, args, caching_state_var), global_caching_note_function_code(name), caching_internal_function_code(internal_function, formal_args, body), append(NIL != faccess ? caching_faccess_code(faccess, name, args) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))) : NIL, list(list(CLET, list(list(caching_state, caching_state_var)), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_GLOBAL_CACHING_STATE_FOR_NAME, list(QUOTE, name), list(QUOTE, caching_state_var), capacity, internal_test, args_length, size)), global_caching_register_reset_code_new(name, clear_when)), list(CLET, list(list(results, caching_lookup_code(caching_state, formal_args, ZERO_INTEGER, NIL, NIL))), listS(PWHEN, listS(EQ, results, $list162), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))) : NIL, list(list(CSETQ, results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL)))), NIL == formal_args ? list(CACHING_STATE_SET_ZERO_ARG_RESULTS, caching_state, results) : listS(CACHING_STATE_PUT, caching_state, append(formal_args, list(results)))))), list(RET, list(CACHING_RESULTS, results))))))))) });
    }

    /**
     * Macro expander for DEFINE-CACHED-NEW
     */
    @LispMethod(comment = "Macro expander for DEFINE-CACHED-NEW")
    public static final SubLObject define_cached_internal_n_alt(SubLObject name, SubLObject args, SubLObject test, SubLObject size, SubLObject capacity, SubLObject faccess, SubLObject clear_when, SubLObject body) {
        if (NIL == test) {
            test = symbol_function(EQL);
        }
        if (NIL == size) {
            size = ZERO_INTEGER;
        }
        if (NIL != clear_when) {
            SubLTrampolineFile.checkType(clear_when, CACHE_CLEAR_TRIGGER_P);
        }
        {
            SubLObject sxhash = $sym205$SXHASH;
            SubLObject results = $sym206$RESULTS;
            SubLObject collisions = $sym207$COLLISIONS;
            SubLObject caching_state = $sym208$CACHING_STATE;
            SubLObject formal_args = define_formal_args(args);
            SubLObject caching_state_var = global_caching_variable_new(name);
            SubLObject args_length = length(formal_args);
            SubLObject internal_function = caching_internal_function(name);
            SubLObject internal_test = macro_test_to_run_time_test(test);
            return listS(PROGN, new SubLObject[]{ global_caching_variable_code(caching_state_var), global_caching_reset_code_new(name), global_caching_n_remove_code_new(name, args, caching_state_var), global_caching_note_function_code(name), caching_internal_function_code(internal_function, formal_args, body), append(NIL != faccess ? ((SubLObject) (caching_faccess_code(faccess, name, args))) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? ((SubLObject) (list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))))) : NIL, list(list(CLET, list(list(caching_state, caching_state_var)), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_GLOBAL_CACHING_STATE_FOR_NAME, list(QUOTE, name), list(QUOTE, caching_state_var), capacity, internal_test, args_length, size)), global_caching_register_reset_code_new(name, clear_when)), listS(CLET, list(list(sxhash, caching_sxhash_code(formal_args)), list(collisions, list(CACHING_STATE_LOOKUP, caching_state, sxhash))), list(PWHEN, list(CNOT, listS(EQ, collisions, $list_alt151)), caching_lookup_code(caching_state, formal_args, sxhash, collisions, internal_test)), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? ((SubLObject) (list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))))) : NIL, list(list(CLET, list(list(results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL))))), list(CACHING_STATE_ENTER_MULTI_KEY_N, caching_state, sxhash, collisions, results, bq_cons(LIST, append(formal_args, NIL))), list(RET, list(CACHING_RESULTS, results)))))))))))) });
        }
    }

    /**
     * Macro expander for DEFINE-CACHED-NEW
     */
    @LispMethod(comment = "Macro expander for DEFINE-CACHED-NEW")
    public static SubLObject define_cached_internal_n(final SubLObject name, final SubLObject args, SubLObject test, SubLObject size, final SubLObject capacity, final SubLObject faccess, final SubLObject clear_when, final SubLObject body) {
        if (NIL == test) {
            test = symbol_function(EQL);
        }
        if (NIL == size) {
            size = ZERO_INTEGER;
        }
        if (((NIL != clear_when) && (!assertionsDisabledSynth)) && (NIL == cache_clear_trigger_p(clear_when))) {
            throw new AssertionError(clear_when);
        }
        final SubLObject sxhash = $sym220$SXHASH;
        final SubLObject results = $sym221$RESULTS;
        final SubLObject collisions = $sym222$COLLISIONS;
        final SubLObject caching_state = $sym223$CACHING_STATE;
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject caching_state_var = global_caching_variable_new(name);
        final SubLObject args_length = length(formal_args);
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        return listS(PROGN, new SubLObject[]{ global_caching_variable_code(caching_state_var), global_caching_reset_code_new(name), global_caching_n_remove_code_new(name, args, caching_state_var), global_caching_note_function_code(name), caching_internal_function_code(internal_function, formal_args, body), append(NIL != faccess ? caching_faccess_code(faccess, name, args) : NIL, list(listS(DEFINE, name, append(args, NIL), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED, list(QUOTE, name))) : NIL, NIL != $allow_function_caching_to_be_disabled$.getGlobalValue() ? list(list(PWHEN, list(CACHING_DISABLED, list(QUOTE, name)), list(RET, bq_cons(internal_function, append(formal_args, NIL))))) : NIL, list(list(CLET, list(list(caching_state, caching_state_var)), list(PUNLESS, caching_state, list(CSETQ, caching_state, list(CREATE_GLOBAL_CACHING_STATE_FOR_NAME, list(QUOTE, name), list(QUOTE, caching_state_var), capacity, internal_test, args_length, size)), global_caching_register_reset_code_new(name, clear_when)), listS(CLET, list(list(sxhash, caching_sxhash_code(formal_args)), list(collisions, list(CACHING_STATE_LOOKUP, caching_state, sxhash))), list(PWHEN, list(CNOT, listS(EQ, collisions, $list162)), caching_lookup_code(caching_state, formal_args, sxhash, collisions, internal_test)), append(NIL != $caching_mode_should_monitor$.getGlobalValue() ? list(list(NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, list(QUOTE, name))) : NIL, list(list(CLET, list(list(results, list(MULTIPLE_VALUE_LIST, bq_cons(internal_function, append(formal_args, NIL))))), list(CACHING_STATE_ENTER_MULTI_KEY_N, caching_state, sxhash, collisions, results, bq_cons(LIST, append(formal_args, NIL))), list(RET, list(CACHING_RESULTS, results)))))))))))) });
    }

    public static final SubLObject load_caching_state_contents_from_hash_table_alt(SubLObject caching_state, SubLObject hash_table) {
        SubLTrampolineFile.checkType(caching_state, CACHING_STATE_P);
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        if (NIL != caching_state_lock(caching_state)) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = caching_state_lock(caching_state);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    result = load_caching_state_contents_from_hash_table_internal(caching_state, hash_table);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return load_caching_state_contents_from_hash_table_internal(caching_state, hash_table);
        }
    }

    public static SubLObject load_caching_state_contents_from_hash_table(final SubLObject caching_state, final SubLObject hash_table) {
        assert NIL != caching_state_p(caching_state) : "! memoization_state.caching_state_p(caching_state) " + ("memoization_state.caching_state_p(caching_state) " + "CommonSymbols.NIL != memoization_state.caching_state_p(caching_state) ") + caching_state;
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        if (NIL != caching_state_lock(caching_state)) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = load_caching_state_contents_from_hash_table_internal(caching_state, hash_table);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return load_caching_state_contents_from_hash_table_internal(caching_state, hash_table);
    }

    public static final SubLObject load_caching_state_contents_from_hash_table_internal_alt(SubLObject caching_state, SubLObject hash_table) {
        caching_state_clear_internal(caching_state);
        {
            SubLObject keys = hash_table_utilities.hash_table_keys(hash_table);
            SubLObject cdolist_list_var = keys;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                if (NIL != key) {
                    caching_state_put_internal(caching_state, key, gethash(hash_table, key, UNPROVIDED));
                } else {
                    _csetf_caching_state_zero_arg_results(caching_state, gethash(hash_table, key, UNPROVIDED));
                }
            }
        }
        return NIL;
    }

    public static SubLObject load_caching_state_contents_from_hash_table_internal(final SubLObject caching_state, final SubLObject hash_table) {
        caching_state_clear_internal(caching_state);
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = hash_table_utilities.hash_table_keys(hash_table);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != key) {
                caching_state_put_internal(caching_state, key, gethash(hash_table, key, UNPROVIDED));
            } else {
                _csetf_caching_state_zero_arg_results(caching_state, gethash(hash_table, key, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject get_caching_state_contents_as_hash_table_alt(SubLObject caching_state) {
        SubLTrampolineFile.checkType(caching_state, CACHING_STATE_P);
        if (NIL != caching_state_lock(caching_state)) {
            {
                SubLObject result = NIL;
                SubLObject rw_lock_var = caching_state_lock(caching_state);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    result = get_caching_state_contents_as_hash_table_internal(caching_state);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return result;
            }
        } else {
            return get_caching_state_contents_as_hash_table_internal(caching_state);
        }
    }

    public static SubLObject get_caching_state_contents_as_hash_table(final SubLObject caching_state) {
        assert NIL != caching_state_p(caching_state) : "! memoization_state.caching_state_p(caching_state) " + ("memoization_state.caching_state_p(caching_state) " + "CommonSymbols.NIL != memoization_state.caching_state_p(caching_state) ") + caching_state;
        if (NIL != caching_state_lock(caching_state)) {
            SubLObject result = NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = get_caching_state_contents_as_hash_table_internal(caching_state);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return get_caching_state_contents_as_hash_table_internal(caching_state);
    }

    public static final SubLObject get_caching_state_contents_as_hash_table_internal_alt(SubLObject caching_state) {
        {
            SubLObject result = NIL;
            result = make_hash_table(caching_state_size_internal(caching_state), symbol_function(EQL), UNPROVIDED);
            {
                SubLObject keys = caching_state_keys_internal(caching_state);
                SubLObject cdolist_list_var = keys;
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    sethash(key, result, caching_state_lookup_internal(caching_state, key, UNPROVIDED));
                }
            }
            sethash(NIL, result, caching_state_zero_arg_results(caching_state));
            return result;
        }
    }

    public static SubLObject get_caching_state_contents_as_hash_table_internal(final SubLObject caching_state) {
        SubLObject result = NIL;
        result = make_hash_table(caching_state_size_internal(caching_state), symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = caching_state_keys_internal(caching_state);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(key, result, caching_state_lookup_internal(caching_state, key, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        sethash(NIL, result, caching_state_zero_arg_results(caching_state));
        return result;
    }

    /**
     * Returns the caching state for the globally cached function NAME. Note: ARGS-LENGTH CAPACITY and TEST *must*
     * be set to the the number of args, capacity and test that where used in the function declaration or unexpected bad
     * behaviour may result (if args-length is nil then a new caching state won't be made if one isn't already available.
     */
    @LispMethod(comment = "Returns the caching state for the globally cached function NAME. Note: ARGS-LENGTH CAPACITY and TEST *must*\r\nbe set to the the number of args, capacity and test that where used in the function declaration or unexpected bad\r\nbehaviour may result (if args-length is nil then a new caching state won\'t be made if one isn\'t already available.\nReturns the caching state for the globally cached function NAME. Note: ARGS-LENGTH CAPACITY and TEST *must*\nbe set to the the number of args, capacity and test that where used in the function declaration or unexpected bad\nbehaviour may result (if args-length is nil then a new caching state won\'t be made if one isn\'t already available.")
    public static final SubLObject get_caching_state_for_globally_cached_function_alt(SubLObject name, SubLObject args_length, SubLObject capacity, SubLObject test, SubLObject size) {
        if (args_length == UNPROVIDED) {
            args_length = NIL;
        }
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        {
            SubLObject caching_state_var = global_caching_variable_new(name);
            SubLObject val = symbol_value(caching_state_var);
            if (NIL == val) {
                val = create_global_caching_state_for_name(name, caching_state_var, capacity, test, args_length, size);
            }
            return val;
        }
    }

    /**
     * Returns the caching state for the globally cached function NAME. Note: ARGS-LENGTH CAPACITY and TEST *must*
     * be set to the the number of args, capacity and test that where used in the function declaration or unexpected bad
     * behaviour may result (if args-length is nil then a new caching state won't be made if one isn't already available.
     */
    @LispMethod(comment = "Returns the caching state for the globally cached function NAME. Note: ARGS-LENGTH CAPACITY and TEST *must*\r\nbe set to the the number of args, capacity and test that where used in the function declaration or unexpected bad\r\nbehaviour may result (if args-length is nil then a new caching state won\'t be made if one isn\'t already available.\nReturns the caching state for the globally cached function NAME. Note: ARGS-LENGTH CAPACITY and TEST *must*\nbe set to the the number of args, capacity and test that where used in the function declaration or unexpected bad\nbehaviour may result (if args-length is nil then a new caching state won\'t be made if one isn\'t already available.")
    public static SubLObject get_caching_state_for_globally_cached_function(final SubLObject name, SubLObject args_length, SubLObject capacity, SubLObject test, SubLObject size) {
        if (args_length == UNPROVIDED) {
            args_length = NIL;
        }
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        final SubLObject caching_state_var = global_caching_variable_new(name);
        SubLObject val = symbol_value(caching_state_var);
        if (NIL == val) {
            val = create_global_caching_state_for_name(name, caching_state_var, capacity, test, args_length, size);
        }
        return val;
    }

    public static final SubLObject create_global_caching_state_for_name_alt(SubLObject name, SubLObject cs_variable, SubLObject capacity, SubLObject test, SubLObject args_length, SubLObject size) {
        if (NIL == test) {
            test = symbol_function(EQL);
        }
        {
            SubLObject caching_state = NIL;
            SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                caching_state = symbol_value(cs_variable);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(ReadWriteLocks.new_rw_lock(cconcatenate($str_alt210$global_caching_lock_for_, symbol_name(name))), name, args_length, capacity, test, size);
                    set(cs_variable, caching_state);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return caching_state;
        }
    }

    public static SubLObject create_global_caching_state_for_name(final SubLObject name, final SubLObject cs_variable, final SubLObject capacity, SubLObject test, final SubLObject args_length, final SubLObject size) {
        if (NIL == test) {
            test = symbol_function(EQL);
        }
        SubLObject caching_state = NIL;
        final SubLObject rw_lock_var = $global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            caching_state = symbol_value(cs_variable);
            if (NIL == caching_state) {
                caching_state = create_caching_state(ReadWriteLocks.new_rw_lock(cconcatenate($$$global_caching_lock_for_, symbol_name(name))), name, args_length, capacity, test, size);
                set(cs_variable, caching_state);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return caching_state;
    }

    /**
     * Return the function-specific caching state for FUNCTION-SYMBOL within MEMOIZATION-STATE.
     */
    @LispMethod(comment = "Return the function-specific caching state for FUNCTION-SYMBOL within MEMOIZATION-STATE.")
    public static final SubLObject memoize_caching_state_for_function_new_alt(SubLObject v_memoization_state, SubLObject function_symbol) {
        if (NIL != v_memoization_state) {
            return memoization_state_lookup(v_memoization_state, function_symbol, NIL);
        }
        return NIL;
    }

    /**
     * Return the function-specific caching state for FUNCTION-SYMBOL within MEMOIZATION-STATE.
     */
    @LispMethod(comment = "Return the function-specific caching state for FUNCTION-SYMBOL within MEMOIZATION-STATE.")
    public static SubLObject memoize_caching_state_for_function_new(final SubLObject v_memoization_state, final SubLObject function_symbol) {
        if (NIL != v_memoization_state) {
            return memoization_state_lookup(v_memoization_state, function_symbol, NIL);
        }
        return NIL;
    }

    public static final SubLObject global_caching_reset_from_function_alt(SubLObject function_symbol) {
        {
            SubLObject var = global_caching_variable_new(function_symbol);
            SubLObject cs = (NIL != boundp(var)) ? ((SubLObject) (symbol_value(var))) : NIL;
            if (NIL != cs) {
                caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject global_caching_reset_from_function(final SubLObject function_symbol) {
        final SubLObject var = global_caching_variable_new(function_symbol);
        final SubLObject cs = (NIL != boundp(var)) ? symbol_value(var) : NIL;
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject global_caching_lock_alt(SubLObject name) {
        return intern(format(NIL, $str_alt211$__A_RW_LOCK_, name), UNPROVIDED);
    }

    public static SubLObject global_caching_lock(final SubLObject name) {
        return intern(format(NIL, $str226$__A_RW_LOCK_, name), UNPROVIDED);
    }

    public static final SubLObject global_caching_variable_new_alt(SubLObject name) {
        return intern(format(NIL, $str_alt212$__A_CACHING_STATE_, name), UNPROVIDED);
    }

    public static SubLObject global_caching_variable_new(final SubLObject name) {
        return intern(format(NIL, $str227$__A_CACHING_STATE_, name), UNPROVIDED);
    }

    public static final SubLObject global_caching_variable_code_alt(SubLObject caching_state) {
        return listS(DEFLEXICAL_PRIVATE, caching_state, $list_alt109);
    }

    public static SubLObject global_caching_variable_code(final SubLObject caching_state) {
        return listS(DEFLEXICAL_PRIVATE, caching_state, $list157);
    }

    public static final SubLObject global_caching_reset_function_alt(SubLObject name) {
        return intern(format(NIL, $str_alt214$CLEAR__A, name), UNPROVIDED);
    }

    public static SubLObject global_caching_reset_function(final SubLObject name) {
        return intern(format(NIL, $str229$CLEAR__A, name), UNPROVIDED);
    }

    public static final SubLObject global_caching_register_reset_code_new_alt(SubLObject name, SubLObject clear_when) {
        {
            SubLObject reset_function = global_caching_reset_function(name);
            SubLObject pcase_var = clear_when;
            if (pcase_var.eql($HL_STORE_MODIFIED)) {
                return list(REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
            } else {
                if (pcase_var.eql($GENL_MT_MODIFIED)) {
                    return list(REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
                } else {
                    if (pcase_var.eql($GENL_PREDS_MODIFIED)) {
                        return list(REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
                    } else {
                        if (pcase_var.eql($GENLS_MODIFIED)) {
                            return list(REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
                        } else {
                            if (pcase_var.eql($ISA_MODIFIED)) {
                                return list(REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
                            } else {
                                if (pcase_var.eql($QUOTED_ISA_MODIFIED)) {
                                    return list(REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
                                } else {
                                    return $list_alt227;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject global_caching_register_reset_code_new(final SubLObject name, final SubLObject clear_when) {
        if (NIL != atomic_cache_clear_trigger_p(clear_when)) {
            return global_caching_register_reset_code_atomic(name, clear_when);
        }
        SubLObject forms = NIL;
        SubLObject cdolist_list_var = clear_when;
        SubLObject clear = NIL;
        clear = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            forms = cons(global_caching_register_reset_code_atomic(name, clear), forms);
            cdolist_list_var = cdolist_list_var.rest();
            clear = cdolist_list_var.first();
        } 
        return NIL != forms ? cons(PROGN, forms) : $list230;
    }

    public static SubLObject global_caching_register_reset_code_atomic(final SubLObject name, final SubLObject clear_when) {
        final SubLObject reset_function = global_caching_reset_function(name);
        if (clear_when.eql($HL_STORE_MODIFIED)) {
            return list(REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        if (clear_when.eql($GENL_MT_MODIFIED)) {
            return list(REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        if (clear_when.eql($GENL_PREDS_MODIFIED)) {
            return list(REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        if (clear_when.eql($GENLS_MODIFIED)) {
            return list(REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        if (clear_when.eql($ISA_MODIFIED)) {
            return list(REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        if (clear_when.eql($QUOTED_ISA_MODIFIED)) {
            return list(REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        if (clear_when.eql($WFF_CONSTRAINT_MODIFIED)) {
            return list(REGISTER_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACK, list(QUOTE, reset_function));
        }
        return $list230;
    }

    public static final SubLObject global_caching_reset_code_new_alt(SubLObject name) {
        {
            SubLObject reset_function = global_caching_reset_function(name);
            SubLObject cs_var = global_caching_variable_new(name);
            return list(PROGN, listS(DEFINE, reset_function, NIL, listS(CLET, list(list(CS, cs_var)), $list_alt229), $list_alt230));
        }
    }

    public static SubLObject global_caching_reset_code_new(final SubLObject name) {
        final SubLObject reset_function = global_caching_reset_function(name);
        final SubLObject cs_var = global_caching_variable_new(name);
        return list(PROGN, listS(DEFINE, reset_function, NIL, listS(CLET, list(list(CS, cs_var)), $list246), $list247));
    }

    public static final SubLObject global_caching_remove_function_alt(SubLObject name) {
        return intern(format(NIL, $str_alt231$REMOVE__A, name), UNPROVIDED);
    }

    public static SubLObject global_caching_remove_function(final SubLObject name) {
        return intern(format(NIL, $str248$REMOVE__A, name), UNPROVIDED);
    }

    public static final SubLObject global_caching_n_remove_code_new_alt(SubLObject name, SubLObject args, SubLObject caching_state) {
        {
            SubLObject remove_function = global_caching_remove_function(name);
            SubLObject formal_args = define_formal_args(args);
            return list(DEFINE, remove_function, append(args, NIL), list(RET, list(CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS, caching_state, bq_cons(LIST, append(formal_args, NIL)))));
        }
    }

    public static SubLObject global_caching_n_remove_code_new(final SubLObject name, final SubLObject args, final SubLObject caching_state) {
        final SubLObject remove_function = global_caching_remove_function(name);
        final SubLObject formal_args = define_formal_args(args);
        return list(DEFINE, remove_function, append(args, NIL), list(RET, list(CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS, caching_state, bq_cons(LIST, append(formal_args, NIL)))));
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the HL store changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the HL store changes.")
    public static final SubLObject register_hl_store_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        {
            SubLObject item_var = callback;
            if (NIL == member(item_var, $hl_store_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $hl_store_cache_clear_callbacks$.setGlobalValue(cons(item_var, $hl_store_cache_clear_callbacks$.getGlobalValue()));
            }
        }
        return callback;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the HL store changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the HL store changes.")
    public static SubLObject register_hl_store_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $hl_store_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $hl_store_cache_clear_callbacks$.setGlobalValue(cons(callback, $hl_store_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the HL store changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the HL store changes.")
    public static final SubLObject deregister_hl_store_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        $hl_store_cache_clear_callbacks$.setGlobalValue(delete(callback, $hl_store_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the HL store changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the HL store changes.")
    public static SubLObject deregister_hl_store_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $hl_store_cache_clear_callbacks$.setGlobalValue(delete(callback, $hl_store_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Clears all HL store dependent caches, as registered by @xref register-hl-store-cache-clear-callback.
     */
    @LispMethod(comment = "Clears all HL store dependent caches, as registered by @xref register-hl-store-cache-clear-callback.")
    public static final SubLObject clear_hl_store_dependent_caches_alt() {
        {
            SubLObject cdolist_list_var = $hl_store_cache_clear_callbacks$.getGlobalValue();
            SubLObject callback = NIL;
            for (callback = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , callback = cdolist_list_var.first()) {
                if (NIL != fboundp(callback)) {
                    funcall(callback);
                }
            }
        }
        return NIL;
    }

    /**
     * Clears all HL store dependent caches, as registered by @xref register-hl-store-cache-clear-callback.
     */
    @LispMethod(comment = "Clears all HL store dependent caches, as registered by @xref register-hl-store-cache-clear-callback.")
    public static SubLObject clear_hl_store_dependent_caches() {
        SubLObject cdolist_list_var = $hl_store_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = NIL;
        callback = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fboundp(callback)) {
                funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the microtheory structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the microtheory structure changes.")
    public static final SubLObject register_mt_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        {
            SubLObject item_var = callback;
            if (NIL == member(item_var, $mt_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $mt_dependent_cache_clear_callbacks$.setGlobalValue(cons(item_var, $mt_dependent_cache_clear_callbacks$.getGlobalValue()));
            }
        }
        return callback;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the microtheory structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the microtheory structure changes.")
    public static SubLObject register_mt_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $mt_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $mt_dependent_cache_clear_callbacks$.setGlobalValue(cons(callback, $mt_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the microtheory structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the microtheory structure changes.")
    public static final SubLObject deregister_mt_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        $mt_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $mt_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the microtheory structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the microtheory structure changes.")
    public static SubLObject deregister_mt_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $mt_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $mt_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject clear_mt_dependent_cachesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(NIL == $suspend_clearing_mt_dependent_cachesP$.getDynamicValue(thread));
        }
    }

    public static SubLObject clear_mt_dependent_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $suspend_clearing_mt_dependent_cachesP$.getDynamicValue(thread));
    }

    public static final SubLObject without_clearing_mt_dependent_caches_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt235, append(body, NIL));
        }
    }

    public static SubLObject without_clearing_mt_dependent_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list252, append(body, NIL));
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the genlPreds structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the genlPreds structure changes.")
    public static final SubLObject register_genl_preds_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        {
            SubLObject item_var = callback;
            if (NIL == member(item_var, $genl_preds_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $genl_preds_dependent_cache_clear_callbacks$.setGlobalValue(cons(item_var, $genl_preds_dependent_cache_clear_callbacks$.getGlobalValue()));
            }
        }
        return callback;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the genlPreds structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the genlPreds structure changes.")
    public static SubLObject register_genl_preds_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $genl_preds_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $genl_preds_dependent_cache_clear_callbacks$.setGlobalValue(cons(callback, $genl_preds_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the genlPreds structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the genlPreds structure changes.")
    public static final SubLObject deregister_genl_preds_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        $genl_preds_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $genl_preds_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the genlPreds structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the genlPreds structure changes.")
    public static SubLObject deregister_genl_preds_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $genl_preds_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $genl_preds_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the genls structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the genls structure changes.")
    public static final SubLObject register_genls_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        {
            SubLObject item_var = callback;
            if (NIL == member(item_var, $genls_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $genls_dependent_cache_clear_callbacks$.setGlobalValue(cons(item_var, $genls_dependent_cache_clear_callbacks$.getGlobalValue()));
            }
        }
        return callback;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the genls structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the genls structure changes.")
    public static SubLObject register_genls_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $genls_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $genls_dependent_cache_clear_callbacks$.setGlobalValue(cons(callback, $genls_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the genls structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the genls structure changes.")
    public static final SubLObject deregister_genls_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        $genls_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $genls_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the genls structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the genls structure changes.")
    public static SubLObject deregister_genls_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $genls_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $genls_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject register_wff_constraint_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $wff_constraint_dependent_cache_clear_callbacks$.setGlobalValue(cons(callback, $wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    public static SubLObject deregister_wff_constraint_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $wff_constraint_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the isa structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the isa structure changes.")
    public static final SubLObject register_isa_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        {
            SubLObject item_var = callback;
            if (NIL == member(item_var, $isa_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $isa_dependent_cache_clear_callbacks$.setGlobalValue(cons(item_var, $isa_dependent_cache_clear_callbacks$.getGlobalValue()));
            }
        }
        return callback;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the isa structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the isa structure changes.")
    public static SubLObject register_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $isa_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $isa_dependent_cache_clear_callbacks$.setGlobalValue(cons(callback, $isa_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the isa structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the isa structure changes.")
    public static final SubLObject deregister_isa_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        $isa_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $isa_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the isa structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the isa structure changes.")
    public static SubLObject deregister_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $isa_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $isa_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.")
    public static final SubLObject register_quoted_isa_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        {
            SubLObject item_var = callback;
            if (NIL == member(item_var, $quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $quoted_isa_dependent_cache_clear_callbacks$.setGlobalValue(cons(item_var, $quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue()));
            }
        }
        return callback;
    }

    /**
     *
     *
     * @param CALLBACK,
     * 		a function-spec-p which should take zero arguments.
     * 		Registers CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.
     */
    @LispMethod(comment = "@param CALLBACK,\r\n\t\ta function-spec-p which should take zero arguments.\r\n\t\tRegisters CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.")
    public static SubLObject register_quoted_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        if (NIL == member(callback, $quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $quoted_isa_dependent_cache_clear_callbacks$.setGlobalValue(cons(callback, $quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.")
    public static final SubLObject deregister_quoted_isa_dependent_cache_clear_callback_alt(SubLObject callback) {
        SubLTrampolineFile.checkType(callback, FUNCTION_SPEC_P);
        $quoted_isa_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Deregisters CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.
     */
    @LispMethod(comment = "Deregisters CALLBACK as a function which will be funcalled each time the quotedIsa structure changes.")
    public static SubLObject deregister_quoted_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert NIL != function_spec_p(callback) : "! function_spec_p(callback) " + ("Types.function_spec_p(callback) " + "CommonSymbols.NIL != Types.function_spec_p(callback) ") + callback;
        $quoted_isa_dependent_cache_clear_callbacks$.setGlobalValue(delete(callback, $quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    /**
     * Store on ANSWER whether or not the memoized function call in FORM has been already memoized.
     */
    @LispMethod(comment = "Store on ANSWER whether or not the memoized function call in FORM has been already memoized.")
    public static final SubLObject memoized_already_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt240);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_answer = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    v_answer = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_11 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt240);
                            current_11 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt240);
                            if (NIL == member(current_11, $list_alt241, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_11 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt240);
                        }
                        {
                            SubLObject test_tail = property_list_member($TEST, current);
                            SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject form = current;
                                return $list_alt242;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Store on ANSWER whether or not the memoized function call in FORM has been already memoized.
     */
    @LispMethod(comment = "Store on ANSWER whether or not the memoized function call in FORM has been already memoized.")
    public static SubLObject memoized_already(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list258);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_answer = NIL;
        destructuring_bind_must_consp(current, datum, $list258);
        v_answer = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list258);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list258);
            if (NIL == member(current_$12, $list259, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list258);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : NIL;
        final SubLObject form;
        current = form = temp;
        return $list260;
    }

    /**
     * Store on ANSWER whether or not the cached function call in FORM has been already cached.
     */
    @LispMethod(comment = "Store on ANSWER whether or not the cached function call in FORM has been already cached.")
    public static final SubLObject cached_already_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt240);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_answer = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    v_answer = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_12 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt240);
                            current_12 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt240);
                            if (NIL == member(current_12, $list_alt241, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_12 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt240);
                        }
                        {
                            SubLObject test_tail = property_list_member($TEST, current);
                            SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject form = current;
                                return $list_alt243;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Store on ANSWER whether or not the cached function call in FORM has been already cached.
     */
    @LispMethod(comment = "Store on ANSWER whether or not the cached function call in FORM has been already cached.")
    public static SubLObject cached_already(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list258);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_answer = NIL;
        destructuring_bind_must_consp(current, datum, $list258);
        v_answer = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list258);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list258);
            if (NIL == member(current_$13, $list259, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list258);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : NIL;
        final SubLObject form;
        current = form = temp;
        return $list261;
    }

    /**
     * Return a list of all the formal args from the given ARGS pattern for a function.
     */
    @LispMethod(comment = "Return a list of all the formal args from the given ARGS pattern for a function.")
    public static final SubLObject define_formal_args_alt(SubLObject args) {
        {
            SubLObject formal_args = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (arg != $sym244$_OPTIONAL) {
                    if (arg.isCons()) {
                        formal_args = cons(arg.first(), formal_args);
                    } else {
                        formal_args = cons(arg, formal_args);
                    }
                }
            }
            return nreverse(formal_args);
        }
    }

    /**
     * Return a list of all the formal args from the given ARGS pattern for a function.
     */
    @LispMethod(comment = "Return a list of all the formal args from the given ARGS pattern for a function.")
    public static SubLObject define_formal_args(final SubLObject args) {
        SubLObject formal_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg != $sym262$_OPTIONAL) {
                if (arg.isCons()) {
                    formal_args = cons(arg.first(), formal_args);
                } else {
                    formal_args = cons(arg, formal_args);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(formal_args);
    }

    /**
     * Return as mutiple values the list of values in RESULTS.
     */
    @LispMethod(comment = "Return as mutiple values the list of values in RESULTS.")
    public static final SubLObject caching_results_alt(SubLObject results) {
        if (NIL != results.rest()) {
            return subl_promotions.values_list(results);
        } else {
            return results.first();
        }
    }

    /**
     * Return as mutiple values the list of values in RESULTS.
     */
    @LispMethod(comment = "Return as mutiple values the list of values in RESULTS.")
    public static SubLObject caching_results(final SubLObject results) {
        if (NIL != results.rest()) {
            return subl_promotions.values_list(results);
        }
        return results.first();
    }

    public static final SubLObject global_caching_note_function_code_alt(SubLObject internal_function) {
        return list(NOTE_GLOBALLY_CACHED_FUNCTION, list(QUOTE, internal_function));
    }

    public static SubLObject global_caching_note_function_code(final SubLObject internal_function) {
        return list(NOTE_GLOBALLY_CACHED_FUNCTION, list(QUOTE, internal_function));
    }

    public static final SubLObject caching_internal_function_alt(SubLObject name) {
        return intern(format(NIL, $str_alt247$_A_INTERNAL, name), UNPROVIDED);
    }

    public static SubLObject caching_internal_function(final SubLObject name) {
        return intern(format(NIL, $str265$_A_INTERNAL, name), UNPROVIDED);
    }

    public static final SubLObject caching_internal_function_code_alt(SubLObject internal_function, SubLObject args, SubLObject body) {
        return listS(DEFINE_PROTECTED, internal_function, append(args, NIL), append(body, NIL));
    }

    public static SubLObject caching_internal_function_code(final SubLObject internal_function, final SubLObject args, final SubLObject body) {
        return listS(DEFINE_PROTECTED, internal_function, append(args, NIL), append(body, NIL));
    }

    public static final SubLObject caching_faccess_code_alt(SubLObject faccess, SubLObject name, SubLObject args) {
        if (NIL != member(faccess, $list_alt249, UNPROVIDED, UNPROVIDED)) {
            return list(list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), list(DECLAIM, list(FACCESS, PUBLIC, name))));
        } else {
            if (faccess == API) {
                return list(list(PROGN, listS(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), args, $list_alt254), list(DECLAIM, list(FACCESS, PUBLIC, name))));
            } else {
                if (NIL != member(faccess, $list_alt255, UNPROVIDED, UNPROVIDED)) {
                    return list(list(DECLAIM, list(FACCESS, faccess, name)));
                } else {
                    Errors.warn($str_alt256$_A_is_not_a_known_FACCESS_visibil);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject caching_faccess_code(final SubLObject faccess, final SubLObject name, final SubLObject args) {
        if (NIL != member(faccess, $list267, UNPROVIDED, UNPROVIDED)) {
            return list(list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), list(DECLAIM, list(FACCESS, PUBLIC, name))));
        }
        if (faccess == API) {
            return list(list(PROGN, listS(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), args, $list272), list(DECLAIM, list(FACCESS, PUBLIC, name))));
        }
        if (NIL != member(faccess, $list273, UNPROVIDED, UNPROVIDED)) {
            return list(list(DECLAIM, list(FACCESS, faccess, name)));
        }
        Errors.warn($str274$_A_is_not_a_known_FACCESS_visibil);
        return NIL;
    }

    public static final SubLObject declare_memoization_state_file_alt() {
        declareFunction("note_cached_function_called", "NOTE-CACHED-FUNCTION-CALLED", 1, 0, false);
        declareFunction("note_cached_function_called_but_not_cached", "NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED", 1, 0, false);
        declareFunction("show_function_caching_results", "SHOW-FUNCTION-CACHING-RESULTS", 0, 0, false);
        declareFunction("clear_function_caching_results", "CLEAR-FUNCTION-CACHING-RESULTS", 0, 0, false);
        declareMacro("with_caching_mode", "WITH-CACHING-MODE");
        declareFunction("caching_mode_enable", "CACHING-MODE-ENABLE", 0, 1, false);
        declareFunction("caching_mode_disable", "CACHING-MODE-DISABLE", 0, 1, false);
        declareFunction("caching_disabled", "CACHING-DISABLED", 1, 0, false);
        declareFunction("sxhash_calc_n", "SXHASH-CALC-N", 1, 0, false);
        declareFunction("sxhash_calc_10", "SXHASH-CALC-10", 10, 0, false);
        declareFunction("sxhash_calc_9", "SXHASH-CALC-9", 9, 0, false);
        declareFunction("sxhash_calc_8", "SXHASH-CALC-8", 8, 0, false);
        declareFunction("sxhash_calc_7", "SXHASH-CALC-7", 7, 0, false);
        declareFunction("sxhash_calc_6", "SXHASH-CALC-6", 6, 0, false);
        declareFunction("sxhash_calc_5", "SXHASH-CALC-5", 5, 0, false);
        declareFunction("sxhash_calc_4", "SXHASH-CALC-4", 4, 0, false);
        declareFunction("sxhash_calc_3", "SXHASH-CALC-3", 3, 0, false);
        declareFunction("sxhash_calc_2", "SXHASH-CALC-2", 2, 0, false);
        declareMacro("possibly_with_memoization_state_writer_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-WRITER-LOCK");
        declareMacro("possibly_with_memoization_state_reader_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-READER-LOCK");
        declareMacro("possibly_with_caching_state_writer_lock", "POSSIBLY-WITH-CACHING-STATE-WRITER-LOCK");
        declareMacro("possibly_with_caching_state_reader_lock", "POSSIBLY-WITH-CACHING-STATE-READER-LOCK");
        declareFunction("caching_state_print_function_trampoline", "CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("caching_state_p", "CACHING-STATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.memoization_state.$caching_state_p$UnaryFunction();
        declareFunction("caching_state_store", "CACHING-STATE-STORE", 1, 0, false);
        declareFunction("caching_state_zero_arg_results", "CACHING-STATE-ZERO-ARG-RESULTS", 1, 0, false);
        declareFunction("caching_state_lock", "CACHING-STATE-LOCK", 1, 0, false);
        declareFunction("caching_state_capacity", "CACHING-STATE-CAPACITY", 1, 0, false);
        declareFunction("caching_state_func_symbol", "CACHING-STATE-FUNC-SYMBOL", 1, 0, false);
        declareFunction("caching_state_test", "CACHING-STATE-TEST", 1, 0, false);
        declareFunction("caching_state_args_length", "CACHING-STATE-ARGS-LENGTH", 1, 0, false);
        declareFunction("_csetf_caching_state_store", "_CSETF-CACHING-STATE-STORE", 2, 0, false);
        declareFunction("_csetf_caching_state_zero_arg_results", "_CSETF-CACHING-STATE-ZERO-ARG-RESULTS", 2, 0, false);
        declareFunction("_csetf_caching_state_lock", "_CSETF-CACHING-STATE-LOCK", 2, 0, false);
        declareFunction("_csetf_caching_state_capacity", "_CSETF-CACHING-STATE-CAPACITY", 2, 0, false);
        declareFunction("_csetf_caching_state_func_symbol", "_CSETF-CACHING-STATE-FUNC-SYMBOL", 2, 0, false);
        declareFunction("_csetf_caching_state_test", "_CSETF-CACHING-STATE-TEST", 2, 0, false);
        declareFunction("_csetf_caching_state_args_length", "_CSETF-CACHING-STATE-ARGS-LENGTH", 2, 0, false);
        declareFunction("make_caching_state", "MAKE-CACHING-STATE", 0, 1, false);
        declareFunction("create_caching_state", "CREATE-CACHING-STATE", 3, 3, false);
        declareFunction("print_caching_state_internal", "PRINT-CACHING-STATE-INTERNAL", 3, 0, false);
        declareFunction("print_caching_state", "PRINT-CACHING-STATE", 3, 0, false);
        declareFunction("caching_state_get_zero_arg_results_internal", "CACHING-STATE-GET-ZERO-ARG-RESULTS-INTERNAL", 1, 0, false);
        declareFunction("caching_state_get_zero_arg_results", "CACHING-STATE-GET-ZERO-ARG-RESULTS", 1, 1, false);
        declareFunction("caching_state_set_zero_arg_results_internal", "CACHING-STATE-SET-ZERO-ARG-RESULTS-INTERNAL", 2, 0, false);
        declareFunction("caching_state_set_zero_arg_results", "CACHING-STATE-SET-ZERO-ARG-RESULTS", 2, 1, false);
        declareFunction("caching_state_lookup_internal", "CACHING-STATE-LOOKUP-INTERNAL", 2, 1, false);
        declareFunction("caching_state_lookup", "CACHING-STATE-LOOKUP", 2, 1, false);
        declareFunction("caching_state_put_internal", "CACHING-STATE-PUT-INTERNAL", 3, 0, false);
        declareFunction("caching_state_put", "CACHING-STATE-PUT", 3, 1, false);
        declareFunction("caching_state_clear_internal", "CACHING-STATE-CLEAR-INTERNAL", 1, 0, false);
        declareFunction("caching_state_clear", "CACHING-STATE-CLEAR", 1, 0, false);
        declareFunction("caching_state_get_capacity", "CACHING-STATE-GET-CAPACITY", 1, 0, false);
        declareFunction("caching_state_get_func_symbol", "CACHING-STATE-GET-FUNC-SYMBOL", 1, 0, false);
        declareFunction("caching_state_get_test", "CACHING-STATE-GET-TEST", 1, 0, false);
        declareFunction("caching_state_keys_internal", "CACHING-STATE-KEYS-INTERNAL", 1, 0, false);
        declareFunction("caching_state_keys", "CACHING-STATE-KEYS", 1, 1, false);
        declareFunction("caching_state_size_internal", "CACHING-STATE-SIZE-INTERNAL", 1, 0, false);
        declareFunction("caching_state_size", "CACHING-STATE-SIZE", 1, 1, false);
        declareFunction("caching_state_remove_internal", "CACHING-STATE-REMOVE-INTERNAL", 2, 0, false);
        declareFunction("caching_state_remove", "CACHING-STATE-REMOVE", 2, 1, false);
        declareFunction("caching_state_remove_function_results_with_args_internal", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS-INTERNAL", 2, 1, false);
        declareFunction("caching_state_remove_function_results_with_args", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 2, false);
        declareFunction("caching_state_clone_internal", "CACHING-STATE-CLONE-INTERNAL", 1, 0, false);
        declareFunction("caching_state_store_as_dictionary", "CACHING-STATE-STORE-AS-DICTIONARY", 1, 0, false);
        declareFunction("caching_state_clone", "CACHING-STATE-CLONE", 1, 1, false);
        declareFunction("caching_state_multi_key_n_is_cached", "CACHING-STATE-MULTI-KEY-N-IS-CACHED", 2, 0, false);
        declareFunction("caching_state_lookup_multi_key_n", "CACHING-STATE-LOOKUP-MULTI-KEY-N", 2, 2, false);
        declareFunction("caching_state_lookup_multi_key_1", "CACHING-STATE-LOOKUP-MULTI-KEY-1", 2, 0, false);
        declareFunction("caching_state_enter_multi_key_n", "CACHING-STATE-ENTER-MULTI-KEY-N", 5, 0, false);
        declareFunction("memoization_state_print_function_trampoline", "MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("memoization_state_p", "MEMOIZATION-STATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.memoization_state.$memoization_state_p$UnaryFunction();
        declareFunction("memoization_state_store", "MEMOIZATION-STATE-STORE", 1, 0, false);
        declareFunction("memoization_state_current_process", "MEMOIZATION-STATE-CURRENT-PROCESS", 1, 0, false);
        declareFunction("memoization_state_lock", "MEMOIZATION-STATE-LOCK", 1, 0, false);
        declareFunction("memoization_state_name", "MEMOIZATION-STATE-NAME", 1, 0, false);
        declareFunction("memoization_state_should_clone", "MEMOIZATION-STATE-SHOULD-CLONE", 1, 0, false);
        declareFunction("_csetf_memoization_state_store", "_CSETF-MEMOIZATION-STATE-STORE", 2, 0, false);
        declareFunction("_csetf_memoization_state_current_process", "_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS", 2, 0, false);
        declareFunction("_csetf_memoization_state_lock", "_CSETF-MEMOIZATION-STATE-LOCK", 2, 0, false);
        declareFunction("_csetf_memoization_state_name", "_CSETF-MEMOIZATION-STATE-NAME", 2, 0, false);
        declareFunction("_csetf_memoization_state_should_clone", "_CSETF-MEMOIZATION-STATE-SHOULD-CLONE", 2, 0, false);
        declareFunction("make_memoization_state", "MAKE-MEMOIZATION-STATE", 0, 1, false);
        declareFunction("create_memoization_state", "CREATE-MEMOIZATION-STATE", 0, 4, false);
        declareFunction("new_memoization_state", "NEW-MEMOIZATION-STATE", 0, 4, false);
        declareFunction("print_memoization_state_internal", "PRINT-MEMOIZATION-STATE-INTERNAL", 3, 0, false);
        declareFunction("print_memoization_state", "PRINT-MEMOIZATION-STATE", 3, 0, false);
        declareFunction("memoization_state_lookup_internal", "MEMOIZATION-STATE-LOOKUP-INTERNAL", 2, 1, false);
        declareFunction("memoization_state_lookup", "MEMOIZATION-STATE-LOOKUP", 2, 1, false);
        declareFunction("memoization_state_get_caching_state_for_function", "MEMOIZATION-STATE-GET-CACHING-STATE-FOR-FUNCTION", 2, 0, false);
        declareFunction("memoization_state_put_internal", "MEMOIZATION-STATE-PUT-INTERNAL", 3, 0, false);
        declareFunction("memoization_state_put", "MEMOIZATION-STATE-PUT", 3, 0, false);
        declareFunction("memoization_state_remove_internal", "MEMOIZATION-STATE-REMOVE-INTERNAL", 2, 0, false);
        declareFunction("memoization_state_remove", "MEMOIZATION-STATE-REMOVE", 2, 0, false);
        declareFunction("memoization_state_clear_internal", "MEMOIZATION-STATE-CLEAR-INTERNAL", 1, 0, false);
        declareFunction("memoization_state_clear", "MEMOIZATION-STATE-CLEAR", 1, 0, false);
        declareFunction("memoization_state_get_test", "MEMOIZATION-STATE-GET-TEST", 1, 0, false);
        declareFunction("memoization_state_get_lock", "MEMOIZATION-STATE-GET-LOCK", 1, 0, false);
        declareFunction("memoization_state_get_name", "MEMOIZATION-STATE-GET-NAME", 1, 0, false);
        declareFunction("memoization_state_get_should_clone", "MEMOIZATION-STATE-GET-SHOULD-CLONE", 1, 0, false);
        declareFunction("memoization_state_get_current_process_internal", "MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL", 1, 0, false);
        declareFunction("memoization_state_get_current_process", "MEMOIZATION-STATE-GET-CURRENT-PROCESS", 1, 0, false);
        declareFunction("memoization_state_keys_internal", "MEMOIZATION-STATE-KEYS-INTERNAL", 1, 0, false);
        declareFunction("memoization_state_keys", "MEMOIZATION-STATE-KEYS", 1, 0, false);
        declareFunction("memoization_state_set_current_process_internal", "MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL", 2, 0, false);
        declareFunction("memoization_state_set_current_process", "MEMOIZATION-STATE-SET-CURRENT-PROCESS", 2, 0, false);
        declareFunction("memoization_state_clone", "MEMOIZATION-STATE-CLONE", 1, 0, false);
        declareFunction("memoization_state_merge_cloned_state", "MEMOIZATION-STATE-MERGE-CLONED-STATE", 2, 0, false);
        declareFunction("caching_state_results_has_argsP", "CACHING-STATE-RESULTS-HAS-ARGS?", 2, 0, false);
        declareFunction("current_memoization_state", "CURRENT-MEMOIZATION-STATE", 0, 0, false);
        declareMacro("with_memoization_state", "WITH-MEMOIZATION-STATE");
        declareFunction("possibly_clone_memoization_state", "POSSIBLY-CLONE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("possibly_merge_back_memoization_state", "POSSIBLY-MERGE-BACK-MEMOIZATION-STATE", 3, 0, false);
        declareMacro("with_new_memoization_state", "WITH-NEW-MEMOIZATION-STATE");
        declareMacro("with_possibly_new_memoization_state", "WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
        declareFunction("possibly_new_memoization_state", "POSSIBLY-NEW-MEMOIZATION-STATE", 0, 0, false);
        declareFunction("clear_memoization", "CLEAR-MEMOIZATION", 2, 0, false);
        declareFunction("clear_current_memoization", "CLEAR-CURRENT-MEMOIZATION", 1, 0, false);
        declareFunction("clear_all_memoization", "CLEAR-ALL-MEMOIZATION", 1, 0, false);
        declareFunction("clear_all_current_memoization", "CLEAR-ALL-CURRENT-MEMOIZATION", 0, 0, false);
        declareFunction("note_memoized_function", "NOTE-MEMOIZED-FUNCTION", 1, 0, false);
        declareFunction("memoized_functions", "MEMOIZED-FUNCTIONS", 0, 0, false);
        declareMacro("define_memoized", "DEFINE-MEMOIZED");
        declareFunction("macro_test_to_run_time_test", "MACRO-TEST-TO-RUN-TIME-TEST", 1, 0, false);
        declareFunction("define_memoized_internal", "DEFINE-MEMOIZED-INTERNAL", 8, 0, false);
        declareFunction("define_memoized_internal_0_or_1", "DEFINE-MEMOIZED-INTERNAL-0-OR-1", 8, 0, false);
        declareFunction("define_memoized_internal_n", "DEFINE-MEMOIZED-INTERNAL-N", 8, 0, false);
        declareFunction("caching_sxhash_code", "CACHING-SXHASH-CODE", 1, 0, false);
        declareFunction("caching_lookup_code", "CACHING-LOOKUP-CODE", 5, 0, false);
        declareFunction("lookup_memoization_state_code", "LOOKUP-MEMOIZATION-STATE-CODE", 4, 0, false);
        declareFunction("note_memoized_function_code", "NOTE-MEMOIZED-FUNCTION-CODE", 1, 0, false);
        declareFunction("note_globally_cached_function", "NOTE-GLOBALLY-CACHED-FUNCTION", 1, 0, false);
        declareFunction("globally_cached_functions", "GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
        declareFunction("global_cache_variables", "GLOBAL-CACHE-VARIABLES", 0, 0, false);
        declareFunction("global_cache_variable_values", "GLOBAL-CACHE-VARIABLE-VALUES", 0, 0, false);
        declareFunction("memoized_or_cached_functions", "MEMOIZED-OR-CACHED-FUNCTIONS", 0, 0, false);
        declareFunction("clear_all_globally_cached_functions", "CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
        declareMacro("define_cached_new", "DEFINE-CACHED-NEW");
        declareMacro("define_cached", "DEFINE-CACHED");
        declareMacro("define_cached_multiarg", "DEFINE-CACHED-MULTIARG");
        declareFunction("cache_clear_trigger_p", "CACHE-CLEAR-TRIGGER-P", 1, 0, false);
        declareFunction("define_cached_internal", "DEFINE-CACHED-INTERNAL", 8, 0, false);
        declareFunction("define_cached_internal_0_or_1", "DEFINE-CACHED-INTERNAL-0-OR-1", 8, 0, false);
        declareFunction("define_cached_internal_n", "DEFINE-CACHED-INTERNAL-N", 8, 0, false);
        declareFunction("load_caching_state_contents_from_hash_table", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE", 2, 0, false);
        declareFunction("load_caching_state_contents_from_hash_table_internal", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE-INTERNAL", 2, 0, false);
        declareFunction("get_caching_state_contents_as_hash_table", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE", 1, 0, false);
        declareFunction("get_caching_state_contents_as_hash_table_internal", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE-INTERNAL", 1, 0, false);
        declareFunction("get_caching_state_for_globally_cached_function", "GET-CACHING-STATE-FOR-GLOBALLY-CACHED-FUNCTION", 1, 4, false);
        declareFunction("create_global_caching_state_for_name", "CREATE-GLOBAL-CACHING-STATE-FOR-NAME", 6, 0, false);
        declareFunction("memoize_caching_state_for_function_new", "MEMOIZE-CACHING-STATE-FOR-FUNCTION-NEW", 2, 0, false);
        declareFunction("global_caching_reset_from_function", "GLOBAL-CACHING-RESET-FROM-FUNCTION", 1, 0, false);
        declareFunction("global_caching_lock", "GLOBAL-CACHING-LOCK", 1, 0, false);
        declareFunction("global_caching_variable_new", "GLOBAL-CACHING-VARIABLE-NEW", 1, 0, false);
        declareFunction("global_caching_variable_code", "GLOBAL-CACHING-VARIABLE-CODE", 1, 0, false);
        declareFunction("global_caching_reset_function", "GLOBAL-CACHING-RESET-FUNCTION", 1, 0, false);
        declareFunction("global_caching_register_reset_code_new", "GLOBAL-CACHING-REGISTER-RESET-CODE-NEW", 2, 0, false);
        declareFunction("global_caching_reset_code_new", "GLOBAL-CACHING-RESET-CODE-NEW", 1, 0, false);
        declareFunction("global_caching_remove_function", "GLOBAL-CACHING-REMOVE-FUNCTION", 1, 0, false);
        declareFunction("global_caching_n_remove_code_new", "GLOBAL-CACHING-N-REMOVE-CODE-NEW", 3, 0, false);
        declareFunction("register_hl_store_cache_clear_callback", "REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_hl_store_cache_clear_callback", "DEREGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("clear_hl_store_dependent_caches", "CLEAR-HL-STORE-DEPENDENT-CACHES", 0, 0, false);
        declareFunction("register_mt_dependent_cache_clear_callback", "REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_mt_dependent_cache_clear_callback", "DEREGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("clear_mt_dependent_cachesP", "CLEAR-MT-DEPENDENT-CACHES?", 0, 0, false);
        declareMacro("without_clearing_mt_dependent_caches", "WITHOUT-CLEARING-MT-DEPENDENT-CACHES");
        declareFunction("register_genl_preds_dependent_cache_clear_callback", "REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_genl_preds_dependent_cache_clear_callback", "DEREGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_genls_dependent_cache_clear_callback", "REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_genls_dependent_cache_clear_callback", "DEREGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_isa_dependent_cache_clear_callback", "REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_isa_dependent_cache_clear_callback", "DEREGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_quoted_isa_dependent_cache_clear_callback", "REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_quoted_isa_dependent_cache_clear_callback", "DEREGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareMacro("memoized_already", "MEMOIZED-ALREADY");
        declareMacro("cached_already", "CACHED-ALREADY");
        declareFunction("define_formal_args", "DEFINE-FORMAL-ARGS", 1, 0, false);
        declareFunction("caching_results", "CACHING-RESULTS", 1, 0, false);
        declareFunction("global_caching_note_function_code", "GLOBAL-CACHING-NOTE-FUNCTION-CODE", 1, 0, false);
        declareFunction("caching_internal_function", "CACHING-INTERNAL-FUNCTION", 1, 0, false);
        declareFunction("caching_internal_function_code", "CACHING-INTERNAL-FUNCTION-CODE", 3, 0, false);
        declareFunction("caching_faccess_code", "CACHING-FACCESS-CODE", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_memoization_state_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("note_cached_function_called", "NOTE-CACHED-FUNCTION-CALLED", 1, 0, false);
            declareFunction("note_cached_function_called_but_not_cached", "NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED", 1, 0, false);
            declareFunction("show_function_caching_results", "SHOW-FUNCTION-CACHING-RESULTS", 0, 0, false);
            declareFunction("clear_function_caching_results", "CLEAR-FUNCTION-CACHING-RESULTS", 0, 0, false);
            declareMacro("with_caching_mode", "WITH-CACHING-MODE");
            declareFunction("caching_mode_enable", "CACHING-MODE-ENABLE", 0, 1, false);
            declareFunction("caching_mode_disable", "CACHING-MODE-DISABLE", 0, 1, false);
            declareFunction("caching_disabled", "CACHING-DISABLED", 1, 0, false);
            declareFunction("sxhash_calc_n", "SXHASH-CALC-N", 1, 0, false);
            declareFunction("sxhash_calc_10", "SXHASH-CALC-10", 10, 0, false);
            declareFunction("sxhash_calc_9", "SXHASH-CALC-9", 9, 0, false);
            declareFunction("sxhash_calc_8", "SXHASH-CALC-8", 8, 0, false);
            declareFunction("sxhash_calc_7", "SXHASH-CALC-7", 7, 0, false);
            declareFunction("sxhash_calc_6", "SXHASH-CALC-6", 6, 0, false);
            declareFunction("sxhash_calc_5", "SXHASH-CALC-5", 5, 0, false);
            declareFunction("sxhash_calc_4", "SXHASH-CALC-4", 4, 0, false);
            declareFunction("sxhash_calc_3", "SXHASH-CALC-3", 3, 0, false);
            declareFunction("sxhash_calc_2", "SXHASH-CALC-2", 2, 0, false);
            declareMacro("possibly_with_memoization_state_writer_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-WRITER-LOCK");
            declareMacro("possibly_with_memoization_state_reader_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-READER-LOCK");
            declareMacro("possibly_with_caching_state_writer_lock", "POSSIBLY-WITH-CACHING-STATE-WRITER-LOCK");
            declareMacro("possibly_with_caching_state_reader_lock", "POSSIBLY-WITH-CACHING-STATE-READER-LOCK");
            declareFunction("caching_state_print_function_trampoline", "CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("caching_state_p", "CACHING-STATE-P", 1, 0, false);
            new memoization_state.$caching_state_p$UnaryFunction();
            declareFunction("caching_state_store", "CACHING-STATE-STORE", 1, 0, false);
            declareFunction("caching_state_zero_arg_results", "CACHING-STATE-ZERO-ARG-RESULTS", 1, 0, false);
            declareFunction("caching_state_lock", "CACHING-STATE-LOCK", 1, 0, false);
            declareFunction("caching_state_capacity", "CACHING-STATE-CAPACITY", 1, 0, false);
            declareFunction("caching_state_func_symbol", "CACHING-STATE-FUNC-SYMBOL", 1, 0, false);
            declareFunction("caching_state_test", "CACHING-STATE-TEST", 1, 0, false);
            declareFunction("caching_state_args_length", "CACHING-STATE-ARGS-LENGTH", 1, 0, false);
            declareFunction("_csetf_caching_state_store", "_CSETF-CACHING-STATE-STORE", 2, 0, false);
            declareFunction("_csetf_caching_state_zero_arg_results", "_CSETF-CACHING-STATE-ZERO-ARG-RESULTS", 2, 0, false);
            declareFunction("_csetf_caching_state_lock", "_CSETF-CACHING-STATE-LOCK", 2, 0, false);
            declareFunction("_csetf_caching_state_capacity", "_CSETF-CACHING-STATE-CAPACITY", 2, 0, false);
            declareFunction("_csetf_caching_state_func_symbol", "_CSETF-CACHING-STATE-FUNC-SYMBOL", 2, 0, false);
            declareFunction("_csetf_caching_state_test", "_CSETF-CACHING-STATE-TEST", 2, 0, false);
            declareFunction("_csetf_caching_state_args_length", "_CSETF-CACHING-STATE-ARGS-LENGTH", 2, 0, false);
            declareFunction("make_caching_state", "MAKE-CACHING-STATE", 0, 1, false);
            declareFunction("visit_defstruct_caching_state", "VISIT-DEFSTRUCT-CACHING-STATE", 2, 0, false);
            declareFunction("visit_defstruct_object_caching_state_method", "VISIT-DEFSTRUCT-OBJECT-CACHING-STATE-METHOD", 2, 0, false);
            declareFunction("create_caching_state", "CREATE-CACHING-STATE", 3, 3, false);
            declareFunction("print_caching_state_internal", "PRINT-CACHING-STATE-INTERNAL", 3, 0, false);
            declareFunction("print_caching_state", "PRINT-CACHING-STATE", 3, 0, false);
            declareFunction("caching_state_get_zero_arg_results_internal", "CACHING-STATE-GET-ZERO-ARG-RESULTS-INTERNAL", 1, 0, false);
            declareFunction("caching_state_get_zero_arg_results", "CACHING-STATE-GET-ZERO-ARG-RESULTS", 1, 1, false);
            declareFunction("caching_state_set_zero_arg_results_internal", "CACHING-STATE-SET-ZERO-ARG-RESULTS-INTERNAL", 2, 0, false);
            declareFunction("caching_state_set_zero_arg_results", "CACHING-STATE-SET-ZERO-ARG-RESULTS", 2, 1, false);
            declareFunction("caching_state_lookup_internal", "CACHING-STATE-LOOKUP-INTERNAL", 2, 1, false);
            declareFunction("caching_state_lookup", "CACHING-STATE-LOOKUP", 2, 1, false);
            declareFunction("caching_state_put_internal", "CACHING-STATE-PUT-INTERNAL", 3, 0, false);
            declareFunction("caching_state_put", "CACHING-STATE-PUT", 3, 1, false);
            declareFunction("caching_state_clear_internal", "CACHING-STATE-CLEAR-INTERNAL", 1, 0, false);
            declareFunction("caching_state_clear", "CACHING-STATE-CLEAR", 1, 0, false);
            declareFunction("caching_state_get_capacity", "CACHING-STATE-GET-CAPACITY", 1, 0, false);
            declareFunction("caching_state_get_func_symbol", "CACHING-STATE-GET-FUNC-SYMBOL", 1, 0, false);
            declareFunction("caching_state_get_test", "CACHING-STATE-GET-TEST", 1, 0, false);
            declareFunction("caching_state_keys_internal", "CACHING-STATE-KEYS-INTERNAL", 1, 0, false);
            declareFunction("caching_state_keys", "CACHING-STATE-KEYS", 1, 1, false);
            declareFunction("caching_state_size_internal", "CACHING-STATE-SIZE-INTERNAL", 1, 0, false);
            declareFunction("caching_state_size", "CACHING-STATE-SIZE", 1, 1, false);
            declareFunction("caching_state_size_robust", "CACHING-STATE-SIZE-ROBUST", 1, 1, false);
            declareFunction("caching_state_remove_internal", "CACHING-STATE-REMOVE-INTERNAL", 2, 0, false);
            declareFunction("caching_state_remove", "CACHING-STATE-REMOVE", 2, 1, false);
            declareFunction("caching_state_remove_function_results_with_args_internal", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS-INTERNAL", 2, 1, false);
            declareFunction("caching_state_remove_function_results_with_args", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 2, false);
            declareFunction("caching_state_clone_internal", "CACHING-STATE-CLONE-INTERNAL", 1, 0, false);
            declareFunction("caching_state_store_as_dictionary", "CACHING-STATE-STORE-AS-DICTIONARY", 1, 0, false);
            declareFunction("caching_state_clone", "CACHING-STATE-CLONE", 1, 1, false);
            declareFunction("caching_state_multi_key_n_is_cached", "CACHING-STATE-MULTI-KEY-N-IS-CACHED", 2, 0, false);
            declareFunction("caching_state_lookup_multi_key_n", "CACHING-STATE-LOOKUP-MULTI-KEY-N", 2, 2, false);
            declareFunction("caching_state_lookup_multi_key_1", "CACHING-STATE-LOOKUP-MULTI-KEY-1", 2, 0, false);
            declareFunction("caching_state_enter_multi_key_n", "CACHING-STATE-ENTER-MULTI-KEY-N", 5, 0, false);
            declareFunction("memoization_state_print_function_trampoline", "MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("memoization_state_p", "MEMOIZATION-STATE-P", 1, 0, false);
            new memoization_state.$memoization_state_p$UnaryFunction();
            declareFunction("memoization_state_store", "MEMOIZATION-STATE-STORE", 1, 0, false);
            declareFunction("memoization_state_current_process", "MEMOIZATION-STATE-CURRENT-PROCESS", 1, 0, false);
            declareFunction("memoization_state_lock", "MEMOIZATION-STATE-LOCK", 1, 0, false);
            declareFunction("memoization_state_name", "MEMOIZATION-STATE-NAME", 1, 0, false);
            declareFunction("memoization_state_should_clone", "MEMOIZATION-STATE-SHOULD-CLONE", 1, 0, false);
            declareFunction("_csetf_memoization_state_store", "_CSETF-MEMOIZATION-STATE-STORE", 2, 0, false);
            declareFunction("_csetf_memoization_state_current_process", "_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS", 2, 0, false);
            declareFunction("_csetf_memoization_state_lock", "_CSETF-MEMOIZATION-STATE-LOCK", 2, 0, false);
            declareFunction("_csetf_memoization_state_name", "_CSETF-MEMOIZATION-STATE-NAME", 2, 0, false);
            declareFunction("_csetf_memoization_state_should_clone", "_CSETF-MEMOIZATION-STATE-SHOULD-CLONE", 2, 0, false);
            declareFunction("make_memoization_state", "MAKE-MEMOIZATION-STATE", 0, 1, false);
            declareFunction("visit_defstruct_memoization_state", "VISIT-DEFSTRUCT-MEMOIZATION-STATE", 2, 0, false);
            declareFunction("visit_defstruct_object_memoization_state_method", "VISIT-DEFSTRUCT-OBJECT-MEMOIZATION-STATE-METHOD", 2, 0, false);
            declareFunction("create_memoization_state", "CREATE-MEMOIZATION-STATE", 0, 4, false);
            declareFunction("new_memoization_state", "NEW-MEMOIZATION-STATE", 0, 4, false);
            declareFunction("print_memoization_state_internal", "PRINT-MEMOIZATION-STATE-INTERNAL", 3, 0, false);
            declareFunction("print_memoization_state", "PRINT-MEMOIZATION-STATE", 3, 0, false);
            declareFunction("memoization_state_lookup_internal", "MEMOIZATION-STATE-LOOKUP-INTERNAL", 2, 1, false);
            declareFunction("memoization_state_lookup", "MEMOIZATION-STATE-LOOKUP", 2, 1, false);
            declareFunction("memoization_state_get_caching_state_for_function", "MEMOIZATION-STATE-GET-CACHING-STATE-FOR-FUNCTION", 2, 0, false);
            declareFunction("memoization_state_put_internal", "MEMOIZATION-STATE-PUT-INTERNAL", 3, 0, false);
            declareFunction("memoization_state_put", "MEMOIZATION-STATE-PUT", 3, 0, false);
            declareFunction("memoization_state_remove_internal", "MEMOIZATION-STATE-REMOVE-INTERNAL", 2, 0, false);
            declareFunction("memoization_state_remove", "MEMOIZATION-STATE-REMOVE", 2, 0, false);
            declareFunction("memoization_state_clear_internal", "MEMOIZATION-STATE-CLEAR-INTERNAL", 1, 0, false);
            declareFunction("memoization_state_clear", "MEMOIZATION-STATE-CLEAR", 1, 0, false);
            declareFunction("memoization_state_get_test", "MEMOIZATION-STATE-GET-TEST", 1, 0, false);
            declareFunction("memoization_state_get_lock", "MEMOIZATION-STATE-GET-LOCK", 1, 0, false);
            declareFunction("memoization_state_get_name", "MEMOIZATION-STATE-GET-NAME", 1, 0, false);
            declareFunction("memoization_state_get_should_clone", "MEMOIZATION-STATE-GET-SHOULD-CLONE", 1, 0, false);
            declareFunction("memoization_state_get_current_process_internal", "MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL", 1, 0, false);
            declareFunction("memoization_state_get_current_process", "MEMOIZATION-STATE-GET-CURRENT-PROCESS", 1, 0, false);
            declareFunction("memoization_state_keys_internal", "MEMOIZATION-STATE-KEYS-INTERNAL", 1, 0, false);
            declareFunction("memoization_state_keys", "MEMOIZATION-STATE-KEYS", 1, 0, false);
            declareFunction("memoization_state_set_current_process_internal", "MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL", 2, 0, false);
            declareFunction("memoization_state_set_current_process", "MEMOIZATION-STATE-SET-CURRENT-PROCESS", 2, 0, false);
            declareFunction("memoization_state_clone", "MEMOIZATION-STATE-CLONE", 1, 0, false);
            declareFunction("memoization_state_merge_cloned_state", "MEMOIZATION-STATE-MERGE-CLONED-STATE", 2, 0, false);
            declareFunction("caching_state_results_has_argsP", "CACHING-STATE-RESULTS-HAS-ARGS?", 2, 0, false);
            declareFunction("gather_memoization_state_statistics", "GATHER-MEMOIZATION-STATE-STATISTICS", 1, 0, false);
            declareFunction("gather_memoization_state_statistics_unlocked", "GATHER-MEMOIZATION-STATE-STATISTICS-UNLOCKED", 1, 0, false);
            declareFunction("gather_caching_state_store_statistics", "GATHER-CACHING-STATE-STORE-STATISTICS", 1, 0, false);
            declareFunction("current_memoization_state", "CURRENT-MEMOIZATION-STATE", 0, 0, false);
            declareMacro("with_memoization_state", "WITH-MEMOIZATION-STATE");
            declareFunction("memoization_state_original_process", "MEMOIZATION-STATE-ORIGINAL-PROCESS", 1, 0, false);
            declareFunction("memoization_state_possibly_clear_original_process", "MEMOIZATION-STATE-POSSIBLY-CLEAR-ORIGINAL-PROCESS", 2, 0, false);
            declareFunction("possibly_clone_memoization_state", "POSSIBLY-CLONE-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("possibly_merge_back_memoization_state", "POSSIBLY-MERGE-BACK-MEMOIZATION-STATE", 3, 0, false);
            declareMacro("with_new_memoization_state", "WITH-NEW-MEMOIZATION-STATE");
            declareMacro("with_new_profiled_memoization_state", "WITH-NEW-PROFILED-MEMOIZATION-STATE");
            declareMacro("with_possibly_new_memoization_state", "WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
            declareFunction("possibly_new_memoization_state", "POSSIBLY-NEW-MEMOIZATION-STATE", 0, 0, false);
            declareFunction("clear_memoization", "CLEAR-MEMOIZATION", 2, 0, false);
            declareFunction("clear_current_memoization", "CLEAR-CURRENT-MEMOIZATION", 1, 0, false);
            declareFunction("clear_all_memoization", "CLEAR-ALL-MEMOIZATION", 1, 0, false);
            declareFunction("clear_all_current_memoization", "CLEAR-ALL-CURRENT-MEMOIZATION", 0, 0, false);
            declareFunction("memoization_state_remove_function_results_with_args", "MEMOIZATION-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 3, 0, false);
            declareFunction("current_memoization_state_remove_function_results_with_args", "CURRENT-MEMOIZATION-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 0, false);
            declareFunction("note_memoized_function", "NOTE-MEMOIZED-FUNCTION", 1, 0, false);
            declareFunction("memoized_functions", "MEMOIZED-FUNCTIONS", 0, 0, false);
            declareMacro("define_memoized", "DEFINE-MEMOIZED");
            declareFunction("macro_test_to_run_time_test", "MACRO-TEST-TO-RUN-TIME-TEST", 1, 0, false);
            declareFunction("define_memoized_internal", "DEFINE-MEMOIZED-INTERNAL", 8, 0, false);
            declareFunction("define_memoized_internal_0_or_1", "DEFINE-MEMOIZED-INTERNAL-0-OR-1", 8, 0, false);
            declareFunction("define_memoized_internal_n", "DEFINE-MEMOIZED-INTERNAL-N", 8, 0, false);
            declareFunction("caching_sxhash_code", "CACHING-SXHASH-CODE", 1, 0, false);
            declareFunction("caching_lookup_code", "CACHING-LOOKUP-CODE", 5, 0, false);
            declareFunction("lookup_memoization_state_code", "LOOKUP-MEMOIZATION-STATE-CODE", 4, 0, false);
            declareFunction("note_memoized_function_code", "NOTE-MEMOIZED-FUNCTION-CODE", 1, 0, false);
            declareFunction("note_globally_cached_function", "NOTE-GLOBALLY-CACHED-FUNCTION", 1, 0, false);
            declareFunction("globally_cached_functions", "GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
            declareFunction("global_cache_variables", "GLOBAL-CACHE-VARIABLES", 0, 0, false);
            declareFunction("global_cache_variable_values", "GLOBAL-CACHE-VARIABLE-VALUES", 0, 0, false);
            declareFunction("memoized_or_cached_functions", "MEMOIZED-OR-CACHED-FUNCTIONS", 0, 0, false);
            declareFunction("clear_all_globally_cached_functions", "CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS", 0, 1, false);
            declareMacro("define_cached_new", "DEFINE-CACHED-NEW");
            declareMacro("define_cached", "DEFINE-CACHED");
            declareMacro("define_cached_multiarg", "DEFINE-CACHED-MULTIARG");
            declareFunction("cache_clear_trigger_p", "CACHE-CLEAR-TRIGGER-P", 1, 0, false);
            declareFunction("atomic_cache_clear_trigger_p", "ATOMIC-CACHE-CLEAR-TRIGGER-P", 1, 0, false);
            declareFunction("define_cached_internal", "DEFINE-CACHED-INTERNAL", 8, 0, false);
            declareFunction("define_cached_internal_0_or_1", "DEFINE-CACHED-INTERNAL-0-OR-1", 8, 0, false);
            declareFunction("define_cached_internal_n", "DEFINE-CACHED-INTERNAL-N", 8, 0, false);
            declareFunction("load_caching_state_contents_from_hash_table", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE", 2, 0, false);
            declareFunction("load_caching_state_contents_from_hash_table_internal", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE-INTERNAL", 2, 0, false);
            declareFunction("get_caching_state_contents_as_hash_table", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE", 1, 0, false);
            declareFunction("get_caching_state_contents_as_hash_table_internal", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE-INTERNAL", 1, 0, false);
            declareFunction("get_caching_state_for_globally_cached_function", "GET-CACHING-STATE-FOR-GLOBALLY-CACHED-FUNCTION", 1, 4, false);
            declareFunction("create_global_caching_state_for_name", "CREATE-GLOBAL-CACHING-STATE-FOR-NAME", 6, 0, false);
            declareFunction("memoize_caching_state_for_function_new", "MEMOIZE-CACHING-STATE-FOR-FUNCTION-NEW", 2, 0, false);
            declareFunction("global_caching_reset_from_function", "GLOBAL-CACHING-RESET-FROM-FUNCTION", 1, 0, false);
            declareFunction("global_caching_lock", "GLOBAL-CACHING-LOCK", 1, 0, false);
            declareFunction("global_caching_variable_new", "GLOBAL-CACHING-VARIABLE-NEW", 1, 0, false);
            declareFunction("global_caching_variable_code", "GLOBAL-CACHING-VARIABLE-CODE", 1, 0, false);
            declareFunction("global_caching_reset_function", "GLOBAL-CACHING-RESET-FUNCTION", 1, 0, false);
            declareFunction("global_caching_register_reset_code_new", "GLOBAL-CACHING-REGISTER-RESET-CODE-NEW", 2, 0, false);
            declareFunction("global_caching_register_reset_code_atomic", "GLOBAL-CACHING-REGISTER-RESET-CODE-ATOMIC", 2, 0, false);
            declareFunction("global_caching_reset_code_new", "GLOBAL-CACHING-RESET-CODE-NEW", 1, 0, false);
            declareFunction("global_caching_remove_function", "GLOBAL-CACHING-REMOVE-FUNCTION", 1, 0, false);
            declareFunction("global_caching_n_remove_code_new", "GLOBAL-CACHING-N-REMOVE-CODE-NEW", 3, 0, false);
            declareFunction("register_hl_store_cache_clear_callback", "REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_hl_store_cache_clear_callback", "DEREGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("clear_hl_store_dependent_caches", "CLEAR-HL-STORE-DEPENDENT-CACHES", 0, 0, false);
            declareFunction("register_mt_dependent_cache_clear_callback", "REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_mt_dependent_cache_clear_callback", "DEREGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("clear_mt_dependent_cachesP", "CLEAR-MT-DEPENDENT-CACHES?", 0, 0, false);
            declareMacro("without_clearing_mt_dependent_caches", "WITHOUT-CLEARING-MT-DEPENDENT-CACHES");
            declareFunction("register_genl_preds_dependent_cache_clear_callback", "REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_genl_preds_dependent_cache_clear_callback", "DEREGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("register_genls_dependent_cache_clear_callback", "REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_genls_dependent_cache_clear_callback", "DEREGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("register_wff_constraint_dependent_cache_clear_callback", "REGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_wff_constraint_dependent_cache_clear_callback", "DEREGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("register_isa_dependent_cache_clear_callback", "REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_isa_dependent_cache_clear_callback", "DEREGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("register_quoted_isa_dependent_cache_clear_callback", "REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareFunction("deregister_quoted_isa_dependent_cache_clear_callback", "DEREGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
            declareMacro("memoized_already", "MEMOIZED-ALREADY");
            declareMacro("cached_already", "CACHED-ALREADY");
            declareFunction("define_formal_args", "DEFINE-FORMAL-ARGS", 1, 0, false);
            declareFunction("caching_results", "CACHING-RESULTS", 1, 0, false);
            declareFunction("global_caching_note_function_code", "GLOBAL-CACHING-NOTE-FUNCTION-CODE", 1, 0, false);
            declareFunction("caching_internal_function", "CACHING-INTERNAL-FUNCTION", 1, 0, false);
            declareFunction("caching_internal_function_code", "CACHING-INTERNAL-FUNCTION-CODE", 3, 0, false);
            declareFunction("caching_faccess_code", "CACHING-FACCESS-CODE", 3, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("clear_all_globally_cached_functions", "CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_memoization_state_file_Previous() {
        declareFunction("note_cached_function_called", "NOTE-CACHED-FUNCTION-CALLED", 1, 0, false);
        declareFunction("note_cached_function_called_but_not_cached", "NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED", 1, 0, false);
        declareFunction("show_function_caching_results", "SHOW-FUNCTION-CACHING-RESULTS", 0, 0, false);
        declareFunction("clear_function_caching_results", "CLEAR-FUNCTION-CACHING-RESULTS", 0, 0, false);
        declareMacro("with_caching_mode", "WITH-CACHING-MODE");
        declareFunction("caching_mode_enable", "CACHING-MODE-ENABLE", 0, 1, false);
        declareFunction("caching_mode_disable", "CACHING-MODE-DISABLE", 0, 1, false);
        declareFunction("caching_disabled", "CACHING-DISABLED", 1, 0, false);
        declareFunction("sxhash_calc_n", "SXHASH-CALC-N", 1, 0, false);
        declareFunction("sxhash_calc_10", "SXHASH-CALC-10", 10, 0, false);
        declareFunction("sxhash_calc_9", "SXHASH-CALC-9", 9, 0, false);
        declareFunction("sxhash_calc_8", "SXHASH-CALC-8", 8, 0, false);
        declareFunction("sxhash_calc_7", "SXHASH-CALC-7", 7, 0, false);
        declareFunction("sxhash_calc_6", "SXHASH-CALC-6", 6, 0, false);
        declareFunction("sxhash_calc_5", "SXHASH-CALC-5", 5, 0, false);
        declareFunction("sxhash_calc_4", "SXHASH-CALC-4", 4, 0, false);
        declareFunction("sxhash_calc_3", "SXHASH-CALC-3", 3, 0, false);
        declareFunction("sxhash_calc_2", "SXHASH-CALC-2", 2, 0, false);
        declareMacro("possibly_with_memoization_state_writer_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-WRITER-LOCK");
        declareMacro("possibly_with_memoization_state_reader_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-READER-LOCK");
        declareMacro("possibly_with_caching_state_writer_lock", "POSSIBLY-WITH-CACHING-STATE-WRITER-LOCK");
        declareMacro("possibly_with_caching_state_reader_lock", "POSSIBLY-WITH-CACHING-STATE-READER-LOCK");
        declareFunction("caching_state_print_function_trampoline", "CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("caching_state_p", "CACHING-STATE-P", 1, 0, false);
        new memoization_state.$caching_state_p$UnaryFunction();
        declareFunction("caching_state_store", "CACHING-STATE-STORE", 1, 0, false);
        declareFunction("caching_state_zero_arg_results", "CACHING-STATE-ZERO-ARG-RESULTS", 1, 0, false);
        declareFunction("caching_state_lock", "CACHING-STATE-LOCK", 1, 0, false);
        declareFunction("caching_state_capacity", "CACHING-STATE-CAPACITY", 1, 0, false);
        declareFunction("caching_state_func_symbol", "CACHING-STATE-FUNC-SYMBOL", 1, 0, false);
        declareFunction("caching_state_test", "CACHING-STATE-TEST", 1, 0, false);
        declareFunction("caching_state_args_length", "CACHING-STATE-ARGS-LENGTH", 1, 0, false);
        declareFunction("_csetf_caching_state_store", "_CSETF-CACHING-STATE-STORE", 2, 0, false);
        declareFunction("_csetf_caching_state_zero_arg_results", "_CSETF-CACHING-STATE-ZERO-ARG-RESULTS", 2, 0, false);
        declareFunction("_csetf_caching_state_lock", "_CSETF-CACHING-STATE-LOCK", 2, 0, false);
        declareFunction("_csetf_caching_state_capacity", "_CSETF-CACHING-STATE-CAPACITY", 2, 0, false);
        declareFunction("_csetf_caching_state_func_symbol", "_CSETF-CACHING-STATE-FUNC-SYMBOL", 2, 0, false);
        declareFunction("_csetf_caching_state_test", "_CSETF-CACHING-STATE-TEST", 2, 0, false);
        declareFunction("_csetf_caching_state_args_length", "_CSETF-CACHING-STATE-ARGS-LENGTH", 2, 0, false);
        declareFunction("make_caching_state", "MAKE-CACHING-STATE", 0, 1, false);
        declareFunction("visit_defstruct_caching_state", "VISIT-DEFSTRUCT-CACHING-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_caching_state_method", "VISIT-DEFSTRUCT-OBJECT-CACHING-STATE-METHOD", 2, 0, false);
        declareFunction("create_caching_state", "CREATE-CACHING-STATE", 3, 3, false);
        declareFunction("print_caching_state_internal", "PRINT-CACHING-STATE-INTERNAL", 3, 0, false);
        declareFunction("print_caching_state", "PRINT-CACHING-STATE", 3, 0, false);
        declareFunction("caching_state_get_zero_arg_results_internal", "CACHING-STATE-GET-ZERO-ARG-RESULTS-INTERNAL", 1, 0, false);
        declareFunction("caching_state_get_zero_arg_results", "CACHING-STATE-GET-ZERO-ARG-RESULTS", 1, 1, false);
        declareFunction("caching_state_set_zero_arg_results_internal", "CACHING-STATE-SET-ZERO-ARG-RESULTS-INTERNAL", 2, 0, false);
        declareFunction("caching_state_set_zero_arg_results", "CACHING-STATE-SET-ZERO-ARG-RESULTS", 2, 1, false);
        declareFunction("caching_state_lookup_internal", "CACHING-STATE-LOOKUP-INTERNAL", 2, 1, false);
        declareFunction("caching_state_lookup", "CACHING-STATE-LOOKUP", 2, 1, false);
        declareFunction("caching_state_put_internal", "CACHING-STATE-PUT-INTERNAL", 3, 0, false);
        declareFunction("caching_state_put", "CACHING-STATE-PUT", 3, 1, false);
        declareFunction("caching_state_clear_internal", "CACHING-STATE-CLEAR-INTERNAL", 1, 0, false);
        declareFunction("caching_state_clear", "CACHING-STATE-CLEAR", 1, 0, false);
        declareFunction("caching_state_get_capacity", "CACHING-STATE-GET-CAPACITY", 1, 0, false);
        declareFunction("caching_state_get_func_symbol", "CACHING-STATE-GET-FUNC-SYMBOL", 1, 0, false);
        declareFunction("caching_state_get_test", "CACHING-STATE-GET-TEST", 1, 0, false);
        declareFunction("caching_state_keys_internal", "CACHING-STATE-KEYS-INTERNAL", 1, 0, false);
        declareFunction("caching_state_keys", "CACHING-STATE-KEYS", 1, 1, false);
        declareFunction("caching_state_size_internal", "CACHING-STATE-SIZE-INTERNAL", 1, 0, false);
        declareFunction("caching_state_size", "CACHING-STATE-SIZE", 1, 1, false);
        declareFunction("caching_state_size_robust", "CACHING-STATE-SIZE-ROBUST", 1, 1, false);
        declareFunction("caching_state_remove_internal", "CACHING-STATE-REMOVE-INTERNAL", 2, 0, false);
        declareFunction("caching_state_remove", "CACHING-STATE-REMOVE", 2, 1, false);
        declareFunction("caching_state_remove_function_results_with_args_internal", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS-INTERNAL", 2, 1, false);
        declareFunction("caching_state_remove_function_results_with_args", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 2, false);
        declareFunction("caching_state_clone_internal", "CACHING-STATE-CLONE-INTERNAL", 1, 0, false);
        declareFunction("caching_state_store_as_dictionary", "CACHING-STATE-STORE-AS-DICTIONARY", 1, 0, false);
        declareFunction("caching_state_clone", "CACHING-STATE-CLONE", 1, 1, false);
        declareFunction("caching_state_multi_key_n_is_cached", "CACHING-STATE-MULTI-KEY-N-IS-CACHED", 2, 0, false);
        declareFunction("caching_state_lookup_multi_key_n", "CACHING-STATE-LOOKUP-MULTI-KEY-N", 2, 2, false);
        declareFunction("caching_state_lookup_multi_key_1", "CACHING-STATE-LOOKUP-MULTI-KEY-1", 2, 0, false);
        declareFunction("caching_state_enter_multi_key_n", "CACHING-STATE-ENTER-MULTI-KEY-N", 5, 0, false);
        declareFunction("memoization_state_print_function_trampoline", "MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("memoization_state_p", "MEMOIZATION-STATE-P", 1, 0, false);
        new memoization_state.$memoization_state_p$UnaryFunction();
        declareFunction("memoization_state_store", "MEMOIZATION-STATE-STORE", 1, 0, false);
        declareFunction("memoization_state_current_process", "MEMOIZATION-STATE-CURRENT-PROCESS", 1, 0, false);
        declareFunction("memoization_state_lock", "MEMOIZATION-STATE-LOCK", 1, 0, false);
        declareFunction("memoization_state_name", "MEMOIZATION-STATE-NAME", 1, 0, false);
        declareFunction("memoization_state_should_clone", "MEMOIZATION-STATE-SHOULD-CLONE", 1, 0, false);
        declareFunction("_csetf_memoization_state_store", "_CSETF-MEMOIZATION-STATE-STORE", 2, 0, false);
        declareFunction("_csetf_memoization_state_current_process", "_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS", 2, 0, false);
        declareFunction("_csetf_memoization_state_lock", "_CSETF-MEMOIZATION-STATE-LOCK", 2, 0, false);
        declareFunction("_csetf_memoization_state_name", "_CSETF-MEMOIZATION-STATE-NAME", 2, 0, false);
        declareFunction("_csetf_memoization_state_should_clone", "_CSETF-MEMOIZATION-STATE-SHOULD-CLONE", 2, 0, false);
        declareFunction("make_memoization_state", "MAKE-MEMOIZATION-STATE", 0, 1, false);
        declareFunction("visit_defstruct_memoization_state", "VISIT-DEFSTRUCT-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_memoization_state_method", "VISIT-DEFSTRUCT-OBJECT-MEMOIZATION-STATE-METHOD", 2, 0, false);
        declareFunction("create_memoization_state", "CREATE-MEMOIZATION-STATE", 0, 4, false);
        declareFunction("new_memoization_state", "NEW-MEMOIZATION-STATE", 0, 4, false);
        declareFunction("print_memoization_state_internal", "PRINT-MEMOIZATION-STATE-INTERNAL", 3, 0, false);
        declareFunction("print_memoization_state", "PRINT-MEMOIZATION-STATE", 3, 0, false);
        declareFunction("memoization_state_lookup_internal", "MEMOIZATION-STATE-LOOKUP-INTERNAL", 2, 1, false);
        declareFunction("memoization_state_lookup", "MEMOIZATION-STATE-LOOKUP", 2, 1, false);
        declareFunction("memoization_state_get_caching_state_for_function", "MEMOIZATION-STATE-GET-CACHING-STATE-FOR-FUNCTION", 2, 0, false);
        declareFunction("memoization_state_put_internal", "MEMOIZATION-STATE-PUT-INTERNAL", 3, 0, false);
        declareFunction("memoization_state_put", "MEMOIZATION-STATE-PUT", 3, 0, false);
        declareFunction("memoization_state_remove_internal", "MEMOIZATION-STATE-REMOVE-INTERNAL", 2, 0, false);
        declareFunction("memoization_state_remove", "MEMOIZATION-STATE-REMOVE", 2, 0, false);
        declareFunction("memoization_state_clear_internal", "MEMOIZATION-STATE-CLEAR-INTERNAL", 1, 0, false);
        declareFunction("memoization_state_clear", "MEMOIZATION-STATE-CLEAR", 1, 0, false);
        declareFunction("memoization_state_get_test", "MEMOIZATION-STATE-GET-TEST", 1, 0, false);
        declareFunction("memoization_state_get_lock", "MEMOIZATION-STATE-GET-LOCK", 1, 0, false);
        declareFunction("memoization_state_get_name", "MEMOIZATION-STATE-GET-NAME", 1, 0, false);
        declareFunction("memoization_state_get_should_clone", "MEMOIZATION-STATE-GET-SHOULD-CLONE", 1, 0, false);
        declareFunction("memoization_state_get_current_process_internal", "MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL", 1, 0, false);
        declareFunction("memoization_state_get_current_process", "MEMOIZATION-STATE-GET-CURRENT-PROCESS", 1, 0, false);
        declareFunction("memoization_state_keys_internal", "MEMOIZATION-STATE-KEYS-INTERNAL", 1, 0, false);
        declareFunction("memoization_state_keys", "MEMOIZATION-STATE-KEYS", 1, 0, false);
        declareFunction("memoization_state_set_current_process_internal", "MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL", 2, 0, false);
        declareFunction("memoization_state_set_current_process", "MEMOIZATION-STATE-SET-CURRENT-PROCESS", 2, 0, false);
        declareFunction("memoization_state_clone", "MEMOIZATION-STATE-CLONE", 1, 0, false);
        declareFunction("memoization_state_merge_cloned_state", "MEMOIZATION-STATE-MERGE-CLONED-STATE", 2, 0, false);
        declareFunction("caching_state_results_has_argsP", "CACHING-STATE-RESULTS-HAS-ARGS?", 2, 0, false);
        declareFunction("gather_memoization_state_statistics", "GATHER-MEMOIZATION-STATE-STATISTICS", 1, 0, false);
        declareFunction("gather_memoization_state_statistics_unlocked", "GATHER-MEMOIZATION-STATE-STATISTICS-UNLOCKED", 1, 0, false);
        declareFunction("gather_caching_state_store_statistics", "GATHER-CACHING-STATE-STORE-STATISTICS", 1, 0, false);
        declareFunction("current_memoization_state", "CURRENT-MEMOIZATION-STATE", 0, 0, false);
        declareMacro("with_memoization_state", "WITH-MEMOIZATION-STATE");
        declareFunction("memoization_state_original_process", "MEMOIZATION-STATE-ORIGINAL-PROCESS", 1, 0, false);
        declareFunction("memoization_state_possibly_clear_original_process", "MEMOIZATION-STATE-POSSIBLY-CLEAR-ORIGINAL-PROCESS", 2, 0, false);
        declareFunction("possibly_clone_memoization_state", "POSSIBLY-CLONE-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("possibly_merge_back_memoization_state", "POSSIBLY-MERGE-BACK-MEMOIZATION-STATE", 3, 0, false);
        declareMacro("with_new_memoization_state", "WITH-NEW-MEMOIZATION-STATE");
        declareMacro("with_new_profiled_memoization_state", "WITH-NEW-PROFILED-MEMOIZATION-STATE");
        declareMacro("with_possibly_new_memoization_state", "WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
        declareFunction("possibly_new_memoization_state", "POSSIBLY-NEW-MEMOIZATION-STATE", 0, 0, false);
        declareFunction("clear_memoization", "CLEAR-MEMOIZATION", 2, 0, false);
        declareFunction("clear_current_memoization", "CLEAR-CURRENT-MEMOIZATION", 1, 0, false);
        declareFunction("clear_all_memoization", "CLEAR-ALL-MEMOIZATION", 1, 0, false);
        declareFunction("clear_all_current_memoization", "CLEAR-ALL-CURRENT-MEMOIZATION", 0, 0, false);
        declareFunction("memoization_state_remove_function_results_with_args", "MEMOIZATION-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 3, 0, false);
        declareFunction("current_memoization_state_remove_function_results_with_args", "CURRENT-MEMOIZATION-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 0, false);
        declareFunction("note_memoized_function", "NOTE-MEMOIZED-FUNCTION", 1, 0, false);
        declareFunction("memoized_functions", "MEMOIZED-FUNCTIONS", 0, 0, false);
        declareMacro("define_memoized", "DEFINE-MEMOIZED");
        declareFunction("macro_test_to_run_time_test", "MACRO-TEST-TO-RUN-TIME-TEST", 1, 0, false);
        declareFunction("define_memoized_internal", "DEFINE-MEMOIZED-INTERNAL", 8, 0, false);
        declareFunction("define_memoized_internal_0_or_1", "DEFINE-MEMOIZED-INTERNAL-0-OR-1", 8, 0, false);
        declareFunction("define_memoized_internal_n", "DEFINE-MEMOIZED-INTERNAL-N", 8, 0, false);
        declareFunction("caching_sxhash_code", "CACHING-SXHASH-CODE", 1, 0, false);
        declareFunction("caching_lookup_code", "CACHING-LOOKUP-CODE", 5, 0, false);
        declareFunction("lookup_memoization_state_code", "LOOKUP-MEMOIZATION-STATE-CODE", 4, 0, false);
        declareFunction("note_memoized_function_code", "NOTE-MEMOIZED-FUNCTION-CODE", 1, 0, false);
        declareFunction("note_globally_cached_function", "NOTE-GLOBALLY-CACHED-FUNCTION", 1, 0, false);
        declareFunction("globally_cached_functions", "GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
        declareFunction("global_cache_variables", "GLOBAL-CACHE-VARIABLES", 0, 0, false);
        declareFunction("global_cache_variable_values", "GLOBAL-CACHE-VARIABLE-VALUES", 0, 0, false);
        declareFunction("memoized_or_cached_functions", "MEMOIZED-OR-CACHED-FUNCTIONS", 0, 0, false);
        declareFunction("clear_all_globally_cached_functions", "CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS", 0, 1, false);
        declareMacro("define_cached_new", "DEFINE-CACHED-NEW");
        declareMacro("define_cached", "DEFINE-CACHED");
        declareMacro("define_cached_multiarg", "DEFINE-CACHED-MULTIARG");
        declareFunction("cache_clear_trigger_p", "CACHE-CLEAR-TRIGGER-P", 1, 0, false);
        declareFunction("atomic_cache_clear_trigger_p", "ATOMIC-CACHE-CLEAR-TRIGGER-P", 1, 0, false);
        declareFunction("define_cached_internal", "DEFINE-CACHED-INTERNAL", 8, 0, false);
        declareFunction("define_cached_internal_0_or_1", "DEFINE-CACHED-INTERNAL-0-OR-1", 8, 0, false);
        declareFunction("define_cached_internal_n", "DEFINE-CACHED-INTERNAL-N", 8, 0, false);
        declareFunction("load_caching_state_contents_from_hash_table", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE", 2, 0, false);
        declareFunction("load_caching_state_contents_from_hash_table_internal", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE-INTERNAL", 2, 0, false);
        declareFunction("get_caching_state_contents_as_hash_table", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE", 1, 0, false);
        declareFunction("get_caching_state_contents_as_hash_table_internal", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE-INTERNAL", 1, 0, false);
        declareFunction("get_caching_state_for_globally_cached_function", "GET-CACHING-STATE-FOR-GLOBALLY-CACHED-FUNCTION", 1, 4, false);
        declareFunction("create_global_caching_state_for_name", "CREATE-GLOBAL-CACHING-STATE-FOR-NAME", 6, 0, false);
        declareFunction("memoize_caching_state_for_function_new", "MEMOIZE-CACHING-STATE-FOR-FUNCTION-NEW", 2, 0, false);
        declareFunction("global_caching_reset_from_function", "GLOBAL-CACHING-RESET-FROM-FUNCTION", 1, 0, false);
        declareFunction("global_caching_lock", "GLOBAL-CACHING-LOCK", 1, 0, false);
        declareFunction("global_caching_variable_new", "GLOBAL-CACHING-VARIABLE-NEW", 1, 0, false);
        declareFunction("global_caching_variable_code", "GLOBAL-CACHING-VARIABLE-CODE", 1, 0, false);
        declareFunction("global_caching_reset_function", "GLOBAL-CACHING-RESET-FUNCTION", 1, 0, false);
        declareFunction("global_caching_register_reset_code_new", "GLOBAL-CACHING-REGISTER-RESET-CODE-NEW", 2, 0, false);
        declareFunction("global_caching_register_reset_code_atomic", "GLOBAL-CACHING-REGISTER-RESET-CODE-ATOMIC", 2, 0, false);
        declareFunction("global_caching_reset_code_new", "GLOBAL-CACHING-RESET-CODE-NEW", 1, 0, false);
        declareFunction("global_caching_remove_function", "GLOBAL-CACHING-REMOVE-FUNCTION", 1, 0, false);
        declareFunction("global_caching_n_remove_code_new", "GLOBAL-CACHING-N-REMOVE-CODE-NEW", 3, 0, false);
        declareFunction("register_hl_store_cache_clear_callback", "REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_hl_store_cache_clear_callback", "DEREGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("clear_hl_store_dependent_caches", "CLEAR-HL-STORE-DEPENDENT-CACHES", 0, 0, false);
        declareFunction("register_mt_dependent_cache_clear_callback", "REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_mt_dependent_cache_clear_callback", "DEREGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("clear_mt_dependent_cachesP", "CLEAR-MT-DEPENDENT-CACHES?", 0, 0, false);
        declareMacro("without_clearing_mt_dependent_caches", "WITHOUT-CLEARING-MT-DEPENDENT-CACHES");
        declareFunction("register_genl_preds_dependent_cache_clear_callback", "REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_genl_preds_dependent_cache_clear_callback", "DEREGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_genls_dependent_cache_clear_callback", "REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_genls_dependent_cache_clear_callback", "DEREGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_wff_constraint_dependent_cache_clear_callback", "REGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_wff_constraint_dependent_cache_clear_callback", "DEREGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_isa_dependent_cache_clear_callback", "REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_isa_dependent_cache_clear_callback", "DEREGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("register_quoted_isa_dependent_cache_clear_callback", "REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareFunction("deregister_quoted_isa_dependent_cache_clear_callback", "DEREGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        declareMacro("memoized_already", "MEMOIZED-ALREADY");
        declareMacro("cached_already", "CACHED-ALREADY");
        declareFunction("define_formal_args", "DEFINE-FORMAL-ARGS", 1, 0, false);
        declareFunction("caching_results", "CACHING-RESULTS", 1, 0, false);
        declareFunction("global_caching_note_function_code", "GLOBAL-CACHING-NOTE-FUNCTION-CODE", 1, 0, false);
        declareFunction("caching_internal_function", "CACHING-INTERNAL-FUNCTION", 1, 0, false);
        declareFunction("caching_internal_function_code", "CACHING-INTERNAL-FUNCTION-CODE", 3, 0, false);
        declareFunction("caching_faccess_code", "CACHING-FACCESS-CODE", 3, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$global_caching_lock = makeString("global-caching-lock");

    static private final SubLString $str_alt6$Cached_Function_Call___S__S___ = makeString("Cached Function Call: ~S(~S)~%");

    static private final SubLString $str_alt7$Missed_Cached_Function_Call___S__ = makeString("Missed Cached Function Call: ~S(~S)~%");

    static private final SubLList $list_alt10 = list(list(makeSymbol("&KEY"), makeSymbol("DISABLE"), makeSymbol("ENABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(makeKeyword("DISABLE"), makeKeyword("ENABLE"));

    static private final SubLString $str_alt15$DISABLE_must_be__ALL = makeString("DISABLE must be :ALL");

    static private final SubLString $str_alt16$ENABLE_must_be__ALL = makeString("ENABLE must be :ALL");

    static private final SubLList $list_alt18 = list(list(makeSymbol("*CACHING-MODE-ENABLED*"), makeSymbol("*CACHING-MODE-ENABLED*")), list(makeSymbol("*CACHING-MODE-DISABLED*"), makeSymbol("*CACHING-MODE-DISABLED*")), list(makeSymbol("*FUNCTION-CACHING-ENABLED?*"), makeSymbol("*FUNCTION-CACHING-ENABLED?*")));

    static private final SubLList $list_alt22 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt26 = list(makeSymbol("RESULT"));

    static private final SubLList $list_alt28 = list(makeSymbol("LOCK"));

    static private final SubLList $list_alt31 = list(list(RET, makeSymbol("RESULT")));

    static private final SubLList $list_alt34 = list(list(makeSymbol("LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject init_memoization_state_file_alt() {
        defconstant("*GLOBAL-CACHING-LOCK*", ReadWriteLocks.new_rw_lock($str_alt0$global_caching_lock));
        deflexical("*CACHING-MODE-SHOULD-MONITOR*", NIL != boundp($caching_mode_should_monitor$) ? ((SubLObject) ($caching_mode_should_monitor$.getGlobalValue())) : NIL);
        deflexical("*CACHE-MONITOR-HASH*", NIL != boundp($cache_monitor_hash$) ? ((SubLObject) ($cache_monitor_hash$.getGlobalValue())) : make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*CACHE-MONITOR-FAILURE-HASH*", NIL != boundp($cache_monitor_failure_hash$) ? ((SubLObject) ($cache_monitor_failure_hash$.getGlobalValue())) : make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*", NIL != boundp($allow_function_caching_to_be_disabled$) ? ((SubLObject) ($allow_function_caching_to_be_disabled$.getGlobalValue())) : NIL);
        defvar("*CACHING-MODE-ENABLED*", $ALL);
        defvar("*CACHING-MODE-DISABLED*", NIL);
        defparameter("*FUNCTION-CACHING-ENABLED?*", T);
        defconstant("*DTP-CACHING-STATE*", CACHING_STATE);
        defconstant("*DTP-MEMOIZATION-STATE*", MEMOIZATION_STATE);
        defparameter("*MEMOIZATION-STATE*", NIL);
        deflexical("*MEMOIZED-FUNCTIONS*", NIL != boundp($memoized_functions$) ? ((SubLObject) ($memoized_functions$.getGlobalValue())) : NIL);
        deflexical("*GLOBALLY-CACHED-FUNCTIONS*", NIL != boundp($globally_cached_functions$) ? ((SubLObject) ($globally_cached_functions$.getGlobalValue())) : NIL);
        deflexical("*CACHE-CLEAR-TRIGGERS*", $list_alt200);
        deflexical("*HL-STORE-CACHE-CLEAR-CALLBACKS*", NIL != boundp($hl_store_cache_clear_callbacks$) ? ((SubLObject) ($hl_store_cache_clear_callbacks$.getGlobalValue())) : NIL);
        deflexical("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($mt_dependent_cache_clear_callbacks$) ? ((SubLObject) ($mt_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
        defparameter("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*", NIL);
        deflexical("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($genl_preds_dependent_cache_clear_callbacks$) ? ((SubLObject) ($genl_preds_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
        deflexical("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($genls_dependent_cache_clear_callbacks$) ? ((SubLObject) ($genls_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
        deflexical("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($isa_dependent_cache_clear_callbacks$) ? ((SubLObject) ($isa_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
        deflexical("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($quoted_isa_dependent_cache_clear_callbacks$) ? ((SubLObject) ($quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
        defconstant("*CACHING-N-SXHASH-COMPOSITE-VALUE*", $int$167);
        return NIL;
    }

    public static SubLObject init_memoization_state_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*GLOBAL-CACHING-LOCK*", ReadWriteLocks.new_rw_lock($str0$global_caching_lock));
            deflexical("*CACHING-MODE-SHOULD-MONITOR*", SubLTrampolineFile.maybeDefault($caching_mode_should_monitor$, $caching_mode_should_monitor$, NIL));
            deflexical("*CACHE-MONITOR-HASH*", SubLTrampolineFile.maybeDefault($cache_monitor_hash$, $cache_monitor_hash$, () -> make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED)));
            deflexical("*CACHE-MONITOR-FAILURE-HASH*", SubLTrampolineFile.maybeDefault($cache_monitor_failure_hash$, $cache_monitor_failure_hash$, () -> make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED)));
            deflexical("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*", SubLTrampolineFile.maybeDefault($allow_function_caching_to_be_disabled$, $allow_function_caching_to_be_disabled$, NIL));
            defvar("*CACHING-MODE-ENABLED*", $ALL);
            defvar("*CACHING-MODE-DISABLED*", NIL);
            defparameter("*FUNCTION-CACHING-ENABLED?*", T);
            defconstant("*MEMOIZED-ITEM-NOT-FOUND*", $kw35$_MEMOIZED_ITEM_NOT_FOUND_);
            defconstant("*DTP-CACHING-STATE*", CACHING_STATE);
            defconstant("*DTP-MEMOIZATION-STATE*", MEMOIZATION_STATE);
            defparameter("*MEMOIZATION-STATE*", NIL);
            deflexical("*MEMOIZED-FUNCTIONS*", SubLTrampolineFile.maybeDefault($memoized_functions$, $memoized_functions$, NIL));
            deflexical("*GLOBALLY-CACHED-FUNCTIONS*", SubLTrampolineFile.maybeDefault($globally_cached_functions$, $globally_cached_functions$, NIL));
            deflexical("*CACHE-CLEAR-TRIGGERS*", $list215);
            deflexical("*HL-STORE-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($hl_store_cache_clear_callbacks$, $hl_store_cache_clear_callbacks$, NIL));
            deflexical("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($mt_dependent_cache_clear_callbacks$, $mt_dependent_cache_clear_callbacks$, NIL));
            defparameter("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*", NIL);
            deflexical("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($genl_preds_dependent_cache_clear_callbacks$, $genl_preds_dependent_cache_clear_callbacks$, NIL));
            deflexical("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($genls_dependent_cache_clear_callbacks$, $genls_dependent_cache_clear_callbacks$, NIL));
            deflexical("*WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($wff_constraint_dependent_cache_clear_callbacks$, $wff_constraint_dependent_cache_clear_callbacks$, NIL));
            deflexical("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($isa_dependent_cache_clear_callbacks$, $isa_dependent_cache_clear_callbacks$, NIL));
            deflexical("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($quoted_isa_dependent_cache_clear_callbacks$, $quoted_isa_dependent_cache_clear_callbacks$, NIL));
            defconstant("*CACHING-N-SXHASH-COMPOSITE-VALUE*", $int$167);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*GLOBAL-CACHING-LOCK*", ReadWriteLocks.new_rw_lock($str_alt0$global_caching_lock));
            deflexical("*CACHING-MODE-SHOULD-MONITOR*", NIL != boundp($caching_mode_should_monitor$) ? ((SubLObject) ($caching_mode_should_monitor$.getGlobalValue())) : NIL);
            deflexical("*CACHE-MONITOR-HASH*", NIL != boundp($cache_monitor_hash$) ? ((SubLObject) ($cache_monitor_hash$.getGlobalValue())) : make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED));
            deflexical("*CACHE-MONITOR-FAILURE-HASH*", NIL != boundp($cache_monitor_failure_hash$) ? ((SubLObject) ($cache_monitor_failure_hash$.getGlobalValue())) : make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED));
            deflexical("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*", NIL != boundp($allow_function_caching_to_be_disabled$) ? ((SubLObject) ($allow_function_caching_to_be_disabled$.getGlobalValue())) : NIL);
            deflexical("*MEMOIZED-FUNCTIONS*", NIL != boundp($memoized_functions$) ? ((SubLObject) ($memoized_functions$.getGlobalValue())) : NIL);
            deflexical("*GLOBALLY-CACHED-FUNCTIONS*", NIL != boundp($globally_cached_functions$) ? ((SubLObject) ($globally_cached_functions$.getGlobalValue())) : NIL);
            deflexical("*CACHE-CLEAR-TRIGGERS*", $list_alt200);
            deflexical("*HL-STORE-CACHE-CLEAR-CALLBACKS*", NIL != boundp($hl_store_cache_clear_callbacks$) ? ((SubLObject) ($hl_store_cache_clear_callbacks$.getGlobalValue())) : NIL);
            deflexical("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($mt_dependent_cache_clear_callbacks$) ? ((SubLObject) ($mt_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
            deflexical("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($genl_preds_dependent_cache_clear_callbacks$) ? ((SubLObject) ($genl_preds_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
            deflexical("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($genls_dependent_cache_clear_callbacks$) ? ((SubLObject) ($genls_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
            deflexical("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($isa_dependent_cache_clear_callbacks$) ? ((SubLObject) ($isa_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
            deflexical("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", NIL != boundp($quoted_isa_dependent_cache_clear_callbacks$) ? ((SubLObject) ($quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_memoization_state_file_Previous() {
        deflexical("*GLOBAL-CACHING-LOCK*", ReadWriteLocks.new_rw_lock($str0$global_caching_lock));
        deflexical("*CACHING-MODE-SHOULD-MONITOR*", SubLTrampolineFile.maybeDefault($caching_mode_should_monitor$, $caching_mode_should_monitor$, NIL));
        deflexical("*CACHE-MONITOR-HASH*", SubLTrampolineFile.maybeDefault($cache_monitor_hash$, $cache_monitor_hash$, () -> make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*CACHE-MONITOR-FAILURE-HASH*", SubLTrampolineFile.maybeDefault($cache_monitor_failure_hash$, $cache_monitor_failure_hash$, () -> make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*", SubLTrampolineFile.maybeDefault($allow_function_caching_to_be_disabled$, $allow_function_caching_to_be_disabled$, NIL));
        defvar("*CACHING-MODE-ENABLED*", $ALL);
        defvar("*CACHING-MODE-DISABLED*", NIL);
        defparameter("*FUNCTION-CACHING-ENABLED?*", T);
        defconstant("*MEMOIZED-ITEM-NOT-FOUND*", $kw35$_MEMOIZED_ITEM_NOT_FOUND_);
        defconstant("*DTP-CACHING-STATE*", CACHING_STATE);
        defconstant("*DTP-MEMOIZATION-STATE*", MEMOIZATION_STATE);
        defparameter("*MEMOIZATION-STATE*", NIL);
        deflexical("*MEMOIZED-FUNCTIONS*", SubLTrampolineFile.maybeDefault($memoized_functions$, $memoized_functions$, NIL));
        deflexical("*GLOBALLY-CACHED-FUNCTIONS*", SubLTrampolineFile.maybeDefault($globally_cached_functions$, $globally_cached_functions$, NIL));
        deflexical("*CACHE-CLEAR-TRIGGERS*", $list215);
        deflexical("*HL-STORE-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($hl_store_cache_clear_callbacks$, $hl_store_cache_clear_callbacks$, NIL));
        deflexical("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($mt_dependent_cache_clear_callbacks$, $mt_dependent_cache_clear_callbacks$, NIL));
        defparameter("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*", NIL);
        deflexical("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($genl_preds_dependent_cache_clear_callbacks$, $genl_preds_dependent_cache_clear_callbacks$, NIL));
        deflexical("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($genls_dependent_cache_clear_callbacks$, $genls_dependent_cache_clear_callbacks$, NIL));
        deflexical("*WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($wff_constraint_dependent_cache_clear_callbacks$, $wff_constraint_dependent_cache_clear_callbacks$, NIL));
        deflexical("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($isa_dependent_cache_clear_callbacks$, $isa_dependent_cache_clear_callbacks$, NIL));
        deflexical("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", SubLTrampolineFile.maybeDefault($quoted_isa_dependent_cache_clear_callbacks$, $quoted_isa_dependent_cache_clear_callbacks$, NIL));
        defconstant("*CACHING-N-SXHASH-COMPOSITE-VALUE*", $int$167);
        return NIL;
    }

    static private final SubLList $list_alt37 = list(makeSymbol("STORE"), makeSymbol("ZERO-ARG-RESULTS"), makeSymbol("LOCK"), makeSymbol("CAPACITY"), makeSymbol("FUNC-SYMBOL"), makeSymbol("TEST"), makeSymbol("ARGS-LENGTH"));

    static private final SubLList $list_alt38 = list(makeKeyword("STORE"), makeKeyword("ZERO-ARG-RESULTS"), $LOCK, makeKeyword("CAPACITY"), makeKeyword("FUNC-SYMBOL"), $TEST, makeKeyword("ARGS-LENGTH"));

    static private final SubLList $list_alt39 = list(makeSymbol("CACHING-STATE-STORE"), makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS"), makeSymbol("CACHING-STATE-LOCK"), makeSymbol("CACHING-STATE-CAPACITY"), makeSymbol("CACHING-STATE-FUNC-SYMBOL"), makeSymbol("CACHING-STATE-TEST"), makeSymbol("CACHING-STATE-ARGS-LENGTH"));

    static private final SubLList $list_alt40 = list(makeSymbol("_CSETF-CACHING-STATE-STORE"), makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS"), makeSymbol("_CSETF-CACHING-STATE-LOCK"), makeSymbol("_CSETF-CACHING-STATE-CAPACITY"), makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL"), makeSymbol("_CSETF-CACHING-STATE-TEST"), makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH"));

    public static final SubLObject setup_memoization_state_file_alt() {
        declare_defglobal($caching_mode_should_monitor$);
        declare_defglobal($cache_monitor_hash$);
        declare_defglobal($cache_monitor_failure_hash$);
        declare_defglobal($allow_function_caching_to_be_disabled$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_caching_state$.getGlobalValue(), symbol_function(CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CACHING_STATE_STORE, _CSETF_CACHING_STATE_STORE);
        def_csetf(CACHING_STATE_ZERO_ARG_RESULTS, _CSETF_CACHING_STATE_ZERO_ARG_RESULTS);
        def_csetf(CACHING_STATE_LOCK, _CSETF_CACHING_STATE_LOCK);
        def_csetf(CACHING_STATE_CAPACITY, _CSETF_CACHING_STATE_CAPACITY);
        def_csetf(CACHING_STATE_FUNC_SYMBOL, _CSETF_CACHING_STATE_FUNC_SYMBOL);
        def_csetf(CACHING_STATE_TEST, _CSETF_CACHING_STATE_TEST);
        def_csetf(CACHING_STATE_ARGS_LENGTH, _CSETF_CACHING_STATE_ARGS_LENGTH);
        identity(CACHING_STATE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_memoization_state$.getGlobalValue(), symbol_function(MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(MEMOIZATION_STATE_STORE, _CSETF_MEMOIZATION_STATE_STORE);
        def_csetf(MEMOIZATION_STATE_CURRENT_PROCESS, _CSETF_MEMOIZATION_STATE_CURRENT_PROCESS);
        def_csetf(MEMOIZATION_STATE_LOCK, _CSETF_MEMOIZATION_STATE_LOCK);
        def_csetf(MEMOIZATION_STATE_NAME, _CSETF_MEMOIZATION_STATE_NAME);
        def_csetf(MEMOIZATION_STATE_SHOULD_CLONE, _CSETF_MEMOIZATION_STATE_SHOULD_CLONE);
        identity(MEMOIZATION_STATE);
        register_macro_helper(POSSIBLY_NEW_MEMOIZATION_STATE, WITH_POSSIBLY_NEW_MEMOIZATION_STATE);
        declare_defglobal($memoized_functions$);
        register_external_symbol(DEFINE_MEMOIZED);
        declare_defglobal($globally_cached_functions$);
        Storage.register_low_memory_callback(symbol_function(CLEAR_ALL_GLOBALLY_CACHED_FUNCTIONS));
        register_external_symbol(DEFINE_CACHED_NEW);
        declare_defglobal($hl_store_cache_clear_callbacks$);
        declare_defglobal($mt_dependent_cache_clear_callbacks$);
        declare_defglobal($genl_preds_dependent_cache_clear_callbacks$);
        declare_defglobal($genls_dependent_cache_clear_callbacks$);
        declare_defglobal($isa_dependent_cache_clear_callbacks$);
        declare_defglobal($quoted_isa_dependent_cache_clear_callbacks$);
        register_macro_helper(CACHING_RESULTS, $list_alt245);
        return NIL;
    }

    public static SubLObject setup_memoization_state_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($caching_mode_should_monitor$);
            declare_defglobal($cache_monitor_hash$);
            declare_defglobal($cache_monitor_failure_hash$);
            declare_defglobal($allow_function_caching_to_be_disabled$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_caching_state$.getGlobalValue(), symbol_function(CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list44);
            def_csetf(CACHING_STATE_STORE, _CSETF_CACHING_STATE_STORE);
            def_csetf(CACHING_STATE_ZERO_ARG_RESULTS, _CSETF_CACHING_STATE_ZERO_ARG_RESULTS);
            def_csetf(CACHING_STATE_LOCK, _CSETF_CACHING_STATE_LOCK);
            def_csetf(CACHING_STATE_CAPACITY, _CSETF_CACHING_STATE_CAPACITY);
            def_csetf(CACHING_STATE_FUNC_SYMBOL, _CSETF_CACHING_STATE_FUNC_SYMBOL);
            def_csetf(CACHING_STATE_TEST, _CSETF_CACHING_STATE_TEST);
            def_csetf(CACHING_STATE_ARGS_LENGTH, _CSETF_CACHING_STATE_ARGS_LENGTH);
            identity(CACHING_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_caching_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHING_STATE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_memoization_state$.getGlobalValue(), symbol_function(MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list90);
            def_csetf(MEMOIZATION_STATE_STORE, _CSETF_MEMOIZATION_STATE_STORE);
            def_csetf(MEMOIZATION_STATE_CURRENT_PROCESS, _CSETF_MEMOIZATION_STATE_CURRENT_PROCESS);
            def_csetf(MEMOIZATION_STATE_LOCK, _CSETF_MEMOIZATION_STATE_LOCK);
            def_csetf(MEMOIZATION_STATE_NAME, _CSETF_MEMOIZATION_STATE_NAME);
            def_csetf(MEMOIZATION_STATE_SHOULD_CLONE, _CSETF_MEMOIZATION_STATE_SHOULD_CLONE);
            identity(MEMOIZATION_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_memoization_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MEMOIZATION_STATE_METHOD));
            register_macro_helper(MEMOIZATION_STATE_ORIGINAL_PROCESS, WITH_MEMOIZATION_STATE);
            register_macro_helper(MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS, WITH_MEMOIZATION_STATE);
            register_macro_helper(POSSIBLY_NEW_MEMOIZATION_STATE, WITH_POSSIBLY_NEW_MEMOIZATION_STATE);
            declare_defglobal($memoized_functions$);
            register_external_symbol(DEFINE_MEMOIZED);
            declare_defglobal($globally_cached_functions$);
            register_external_symbol(DEFINE_CACHED_NEW);
            declare_defglobal($hl_store_cache_clear_callbacks$);
            declare_defglobal($mt_dependent_cache_clear_callbacks$);
            declare_defglobal($genl_preds_dependent_cache_clear_callbacks$);
            declare_defglobal($genls_dependent_cache_clear_callbacks$);
            declare_defglobal($wff_constraint_dependent_cache_clear_callbacks$);
            declare_defglobal($isa_dependent_cache_clear_callbacks$);
            declare_defglobal($quoted_isa_dependent_cache_clear_callbacks$);
            register_macro_helper(CACHING_RESULTS, $list263);
        }
        if (SubLFiles.USE_V2) {
            Storage.register_low_memory_callback(symbol_function(CLEAR_ALL_GLOBALLY_CACHED_FUNCTIONS));
            register_macro_helper(CACHING_RESULTS, $list_alt245);
        }
        return NIL;
    }

    public static SubLObject setup_memoization_state_file_Previous() {
        declare_defglobal($caching_mode_should_monitor$);
        declare_defglobal($cache_monitor_hash$);
        declare_defglobal($cache_monitor_failure_hash$);
        declare_defglobal($allow_function_caching_to_be_disabled$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_caching_state$.getGlobalValue(), symbol_function(CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list44);
        def_csetf(CACHING_STATE_STORE, _CSETF_CACHING_STATE_STORE);
        def_csetf(CACHING_STATE_ZERO_ARG_RESULTS, _CSETF_CACHING_STATE_ZERO_ARG_RESULTS);
        def_csetf(CACHING_STATE_LOCK, _CSETF_CACHING_STATE_LOCK);
        def_csetf(CACHING_STATE_CAPACITY, _CSETF_CACHING_STATE_CAPACITY);
        def_csetf(CACHING_STATE_FUNC_SYMBOL, _CSETF_CACHING_STATE_FUNC_SYMBOL);
        def_csetf(CACHING_STATE_TEST, _CSETF_CACHING_STATE_TEST);
        def_csetf(CACHING_STATE_ARGS_LENGTH, _CSETF_CACHING_STATE_ARGS_LENGTH);
        identity(CACHING_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_caching_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHING_STATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_memoization_state$.getGlobalValue(), symbol_function(MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list90);
        def_csetf(MEMOIZATION_STATE_STORE, _CSETF_MEMOIZATION_STATE_STORE);
        def_csetf(MEMOIZATION_STATE_CURRENT_PROCESS, _CSETF_MEMOIZATION_STATE_CURRENT_PROCESS);
        def_csetf(MEMOIZATION_STATE_LOCK, _CSETF_MEMOIZATION_STATE_LOCK);
        def_csetf(MEMOIZATION_STATE_NAME, _CSETF_MEMOIZATION_STATE_NAME);
        def_csetf(MEMOIZATION_STATE_SHOULD_CLONE, _CSETF_MEMOIZATION_STATE_SHOULD_CLONE);
        identity(MEMOIZATION_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_memoization_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MEMOIZATION_STATE_METHOD));
        register_macro_helper(MEMOIZATION_STATE_ORIGINAL_PROCESS, WITH_MEMOIZATION_STATE);
        register_macro_helper(MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS, WITH_MEMOIZATION_STATE);
        register_macro_helper(POSSIBLY_NEW_MEMOIZATION_STATE, WITH_POSSIBLY_NEW_MEMOIZATION_STATE);
        declare_defglobal($memoized_functions$);
        register_external_symbol(DEFINE_MEMOIZED);
        declare_defglobal($globally_cached_functions$);
        register_external_symbol(DEFINE_CACHED_NEW);
        declare_defglobal($hl_store_cache_clear_callbacks$);
        declare_defglobal($mt_dependent_cache_clear_callbacks$);
        declare_defglobal($genl_preds_dependent_cache_clear_callbacks$);
        declare_defglobal($genls_dependent_cache_clear_callbacks$);
        declare_defglobal($wff_constraint_dependent_cache_clear_callbacks$);
        declare_defglobal($isa_dependent_cache_clear_callbacks$);
        declare_defglobal($quoted_isa_dependent_cache_clear_callbacks$);
        register_macro_helper(CACHING_RESULTS, $list263);
        return NIL;
    }

    static private final SubLString $str_alt64$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final SubLSymbol $kw69$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt70$__caching_state_function___A_lock = makeString("#<caching-state function: ~A lock: '~A' capacity: ~A test: ~S ~%    store: ");

    static private final SubLString $str_alt71$_ = makeString(">");

    static private final SubLList $list_alt72 = list(makeSymbol("CACHED-ARGS"), makeSymbol("RESULT"));

    static private final SubLList $list_alt75 = list(makeSymbol("CACHED-ARGS"), makeSymbol("RESULTS"));

    static private final SubLList $list_alt78 = list(makeSymbol("STORE"), makeSymbol("CURRENT-PROCESS"), makeSymbol("LOCK"), makeSymbol("NAME"), makeSymbol("SHOULD-CLONE"));

    static private final SubLList $list_alt79 = list(makeKeyword("STORE"), makeKeyword("CURRENT-PROCESS"), $LOCK, $NAME, makeKeyword("SHOULD-CLONE"));

    static private final SubLList $list_alt80 = list(makeSymbol("MEMOIZATION-STATE-STORE"), makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS"), makeSymbol("MEMOIZATION-STATE-LOCK"), makeSymbol("MEMOIZATION-STATE-NAME"), makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE"));

    static private final SubLList $list_alt81 = list(makeSymbol("_CSETF-MEMOIZATION-STATE-STORE"), makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS"), makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK"), makeSymbol("_CSETF-MEMOIZATION-STATE-NAME"), makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE"));

    static private final SubLString $str_alt99$memoization_state_clone_lock = makeString("memoization-state-clone-lock");

    @Override
    public void declareFunctions() {
        declare_memoization_state_file();
    }

    static private final SubLString $str_alt100$__memoization_state_name____A__lo = makeString("#<memoization-state name: '~A' lock: '~A' should-clone: ~A current-process: '~A' ~%    store: ~A ");

    @Override
    public void initializeVariables() {
        init_memoization_state_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_memoization_state_file();
    }

    static private final SubLString $str_alt101$Clone__ = makeString("Clone: ");

    

    static private final SubLString $str_alt102$Need_to_implement_dictionary_copy = makeString("Need to implement dictionary copy!");

    static private final SubLString $str_alt103$implement_me_in__memoization_stat = makeString("implement me in: memoization-state-merge-cloned-state");

    static private final SubLSymbol $sym104$CACHING_STATE_RESULTS_HAS_ARGS_ = makeSymbol("CACHING-STATE-RESULTS-HAS-ARGS?");

    static private final SubLSymbol $sym105$ORIGINAL_MEMOIZATION_PROCESS = makeUninternedSymbol("ORIGINAL-MEMOIZATION-PROCESS");

    static private final SubLSymbol $sym106$CURRENT_PROC = makeUninternedSymbol("CURRENT-PROC");

    static private final SubLSymbol $sym107$LOCAL_STATE = makeUninternedSymbol("LOCAL-STATE");

    static private final SubLList $list_alt109 = list(NIL);

    private static final SubLSymbol MEMOIZATION_STATE_GET_CURRENT_PROCESS_INTERNAL = makeSymbol("MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL");

    static private final SubLList $list_alt114 = list(list(makeSymbol("CURRENT-PROCESS")));

    private static final SubLSymbol MEMOIZATION_STATE_SET_CURRENT_PROCESS_INTERNAL = makeSymbol("MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL");

    static private final SubLList $list_alt116 = list(list(makeSymbol("ERROR"), makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.")));

    static private final SubLSymbol $sym118$STATE = makeUninternedSymbol("STATE");

    static private final SubLList $list_alt119 = list(list(makeSymbol("NEW-MEMOIZATION-STATE")));

    static private final SubLSymbol $sym121$STATE = makeUninternedSymbol("STATE");

    static private final SubLList $list_alt122 = list(list(makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE")));

    static private final SubLList $list_alt128 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("CAPACITY"), makeSymbol("FACCESS"), makeSymbol("MEMOIZATION-STATE-FUNCTION"), makeSymbol("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt129 = list($TEST, makeKeyword("CAPACITY"), makeKeyword("FACCESS"), makeKeyword("MEMOIZATION-STATE-FUNCTION"), makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS"));

    static private final SubLList $list_alt133 = list(QUOTE, EQL);

    static private final SubLString $str_alt134$Got_a_test_expression_of_length__ = makeString("Got a test expression of length: ~S for ~S~%");

    static private final SubLString $str_alt137$Don_t_know_how_to_convert___S_to_ = makeString("Don't know how to convert: ~S to a test~%");

    static private final SubLSymbol $sym138$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");

    public static final class $caching_state_p$UnaryFunction extends UnaryFunction {
        public $caching_state_p$UnaryFunction() {
            super(extractFunctionNamed("CACHING-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return caching_state_p(arg1);
        }
    }

    static private final SubLSymbol $sym139$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    static private final SubLSymbol $sym140$RESULTS = makeUninternedSymbol("RESULTS");

    static private final SubLList $list_alt151 = list(makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&"));

    static private final SubLSymbol $sym157$SXHASH = makeUninternedSymbol("SXHASH");

    static private final SubLSymbol $sym158$MEMOIZATION_STATE = makeUninternedSymbol("MEMOIZATION-STATE");

    static private final SubLSymbol $sym159$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    static private final SubLSymbol $sym160$RESULTS = makeUninternedSymbol("RESULTS");

    static private final SubLSymbol $sym161$COLLISIONS = makeUninternedSymbol("COLLISIONS");

    public static final class $memoization_state_p$UnaryFunction extends UnaryFunction {
        public $memoization_state_p$UnaryFunction() {
            super(extractFunctionNamed("MEMOIZATION-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return memoization_state_p(arg1);
        }
    }

    static private final SubLList $list_alt178 = list(list(makeSymbol("CACHED-ARGS"), list(makeSymbol("FIRST"), makeSymbol("COLLISION"))), list(makeSymbol("RESULTS2"), list(makeSymbol("SECOND"), makeSymbol("COLLISION"))));

    static private final SubLList $list_alt179 = list(list(makeSymbol("FIRST"), makeSymbol("CACHED-ARGS")));

    static private final SubLList $list_alt180 = list(makeSymbol("CPOP"), makeSymbol("CACHED-ARGS"));

    static private final SubLList $list_alt182 = list(makeSymbol("CNOT"), list(makeSymbol("REST"), makeSymbol("CACHED-ARGS")));

    static private final SubLList $list_alt183 = list(list(RET, list(makeSymbol("CACHING-RESULTS"), makeSymbol("RESULTS2"))));

    static private final SubLString $str_alt191$Clearing_all_globally_cached_func = makeString("Clearing all globally cached functions");

    private static final SubLSymbol CLEAR_ALL_GLOBALLY_CACHED_FUNCTIONS = makeSymbol("CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS");

    static private final SubLList $list_alt194 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("CAPACITY"), makeSymbol("FACCESS"), makeSymbol("SIZE"), makeSymbol("CLEAR-WHEN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt195 = list($TEST, makeKeyword("CAPACITY"), makeKeyword("FACCESS"), $SIZE, makeKeyword("CLEAR-WHEN"));

    static private final SubLList $list_alt198 = list(makeSymbol("NAME"), list(makeSymbol("ARG")), list(makeSymbol("SIZE"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt199 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARGS")), list(makeSymbol("SIZE"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt200 = list(makeKeyword("HL-STORE-MODIFIED"), makeKeyword("GENL-MT-MODIFIED"), makeKeyword("GENL-PREDS-MODIFIED"), makeKeyword("GENLS-MODIFIED"), makeKeyword("ISA-MODIFIED"), makeKeyword("QUOTED-ISA-MODIFIED"));

    static private final SubLSymbol $sym202$RESULTS = makeUninternedSymbol("RESULTS");

    static private final SubLSymbol $sym203$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    static private final SubLSymbol $sym205$SXHASH = makeUninternedSymbol("SXHASH");

    static private final SubLSymbol $sym206$RESULTS = makeUninternedSymbol("RESULTS");

    static private final SubLSymbol $sym207$COLLISIONS = makeUninternedSymbol("COLLISIONS");

    static private final SubLSymbol $sym208$CACHING_STATE = makeUninternedSymbol("CACHING-STATE");

    static private final SubLString $str_alt210$global_caching_lock_for_ = makeString("global caching lock for ");

    static private final SubLString $str_alt211$__A_RW_LOCK_ = makeString("*~A-RW-LOCK*");

    static private final SubLString $str_alt212$__A_CACHING_STATE_ = makeString("*~A-CACHING-STATE*");

    static private final SubLString $str_alt214$CLEAR__A = makeString("CLEAR-~A");

    static private final SubLList $list_alt227 = list(makeSymbol("PROGN"));

    static private final SubLList $list_alt229 = list(list(makeSymbol("PWHEN"), makeSymbol("CS"), list(makeSymbol("CACHING-STATE-CLEAR"), makeSymbol("CS"))));

    static private final SubLList $list_alt230 = list(list(RET, NIL));

    static private final SubLString $str_alt231$REMOVE__A = makeString("REMOVE-~A");

    static private final SubLList $list_alt235 = list(list(makeSymbol("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*"), T));

    static private final SubLList $list_alt240 = list(list(makeSymbol("ANSWER"), makeSymbol("&KEY"), makeSymbol("TEST")), makeSymbol("&BODY"), makeSymbol("FORM"));

    static private final SubLList $list_alt241 = list($TEST);

    static private final SubLList $list_alt242 = list(makeSymbol("ERROR"), makeString("Unimplemented macro memoized-already."));

    static private final SubLList $list_alt243 = list(makeSymbol("ERROR"), makeString("Unimplemented macro cached-already."));

    static private final SubLSymbol $sym244$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLList $list_alt245 = list(makeSymbol("DEFINE-CACHED-NEW"), makeSymbol("DEFINE-MEMOIZED"));

    static private final SubLString $str_alt247$_A_INTERNAL = makeString("~A-INTERNAL");

    static private final SubLList $list_alt249 = list(makeSymbol("EXTERNAL"), makeSymbol("API-PROVISIONAL"));

    static private final SubLList $list_alt254 = list(makeString(""), NIL, NIL);

    static private final SubLList $list_alt255 = list(makeSymbol("PRIVATE"), makeSymbol("PROTECTED"), makeSymbol("PUBLIC"));

    static private final SubLString $str_alt256$_A_is_not_a_known_FACCESS_visibil = makeString("~A is not a known FACCESS visibility type for cached functions.");
}

/**
 * Total time: 1105 ms synthetic
 */
