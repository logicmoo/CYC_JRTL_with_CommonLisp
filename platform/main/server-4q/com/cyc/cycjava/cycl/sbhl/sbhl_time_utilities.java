/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_operator;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_arg1;
import static com.cyc.cycjava.cycl.date_utilities.$beginning_of_time$;
import static com.cyc.cycjava.cycl.date_utilities.$end_of_time$;
import static com.cyc.cycjava.cycl.date_utilities.always_time_intervalP;
import static com.cyc.cycjava.cycl.date_utilities.beginning_of_timeP;
import static com.cyc.cycjava.cycl.date_utilities.end_of_timeP;
import static com.cyc.cycjava.cycl.date_utilities.extended_universal_date_for_date_final_second;
import static com.cyc.cycjava.cycl.date_utilities.extended_universal_date_for_date_initial_second;
import static com.cyc.cycjava.cycl.date_utilities.month_p;
import static com.cyc.cycjava.cycl.date_utilities.possibly_bind_temporal_indexical_in_object;
import static com.cyc.cycjava.cycl.date_utilities.possibly_hl_date_p;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.kb_control_vars.set_time_kb_loaded;
import static com.cyc.cycjava.cycl.kb_control_vars.time_kb_loaded_p;
import static com.cyc.cycjava.cycl.kb_control_vars.unset_time_kb_loaded;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.numeric_date_utilities.preceding_extended_universal_date;
import static com.cyc.cycjava.cycl.numeric_date_utilities.succeeding_extended_universal_date;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_module;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.get_sbhl_module_graph;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.$sbhl_time_predicates$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.get_sbhl_hl_time_predicates;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_vars.sbhl_temporality_activeP;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities.sksi_external_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.time_interval_utilities.valid_time_index_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-TIME-UTILITIES
 * source file: /cyc/top/cycl/sbhl/sbhl-time-utilities.lisp
 * created:     2019/07/03 17:37:36
 */
public final class sbhl_time_utilities extends SubLTranslatedFile implements V12 {
    public static final class $hl_start_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native.this.$interval;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native.this.$interval = value;
        }

        public SubLObject $interval = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native.class, HL_START, HL_START_P, $list_alt11, $list_alt12, new String[]{ "$interval" }, $list_alt13, $list_alt14, PRINT_HL_ENDPOINT);
    }

    public static final class $hl_end_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native.this.$interval;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native.this.$interval = value;
        }

        public SubLObject $interval = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native.class, HL_END, HL_END_P, $list_alt11, $list_alt12, new String[]{ "$interval" }, $list_alt24, $list_alt25, PRINT_HL_ENDPOINT);
    }

    public static final SubLFile me = new sbhl_time_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities";


    // deflexical
    // Definitions
    /**
     * A representative sample of the KB constants that time reasoning depends on.
     */
    @LispMethod(comment = "A representative sample of the KB constants that time reasoning depends on.\ndeflexical")
    private static final SubLSymbol $time_core_constants$ = makeSymbol("*TIME-CORE-CONSTANTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_hl_start$ = makeSymbol("*DTP-HL-START*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_hl_end$ = makeSymbol("*DTP-HL-END*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("weak-HL-TimePrecedence"), reader_make_constant_shell("strict-HL-TimePrecedence"), reader_make_constant_shell("successorStrict-HL-TimePrecedence"), reader_make_constant_shell("weakSuccessor-HL-TimePrecedence"));

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $hl_start_table_lock$ = makeSymbol("*HL-START-TABLE-LOCK*");

    static private final SubLString $str3$_hl_start_table_lock_ = makeString("*hl-start-table-lock*");

    public static final SubLSymbol $hl_start_table$ = makeSymbol("*HL-START-TABLE*");

    public static final SubLSymbol $hl_end_table_lock$ = makeSymbol("*HL-END-TABLE-LOCK*");

    static private final SubLString $str7$_hl_end_table_lock_ = makeString("*hl-end-table-lock*");

    public static final SubLSymbol $hl_end_table$ = makeSymbol("*HL-END-TABLE*");

    private static final SubLSymbol HL_START = makeSymbol("HL-START");

    private static final SubLSymbol HL_START_P = makeSymbol("HL-START-P");

    static private final SubLList $list11 = list(makeSymbol("INTERVAL"));

    static private final SubLList $list12 = list(makeKeyword("INTERVAL"));

    static private final SubLList $list13 = list(makeSymbol("HL-START-INTERVAL"));

    static private final SubLList $list14 = list(makeSymbol("_CSETF-HL-START-INTERVAL"));

    private static final SubLSymbol PRINT_HL_ENDPOINT = makeSymbol("PRINT-HL-ENDPOINT");

    private static final SubLSymbol HL_START_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-START-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HL-START-P"));

    private static final SubLSymbol HL_START_INTERVAL = makeSymbol("HL-START-INTERVAL");

    private static final SubLSymbol _CSETF_HL_START_INTERVAL = makeSymbol("_CSETF-HL-START-INTERVAL");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_HL_START = makeSymbol("MAKE-HL-START");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD");

    private static final SubLSymbol SXHASH_HL_START_METHOD = makeSymbol("SXHASH-HL-START-METHOD");

    private static final SubLSymbol HL_END = makeSymbol("HL-END");

    private static final SubLSymbol HL_END_P = makeSymbol("HL-END-P");

    private static final SubLList $list30 = list(makeSymbol("HL-END-INTERVAL"));

    private static final SubLList $list31 = list(makeSymbol("_CSETF-HL-END-INTERVAL"));

    private static final SubLSymbol HL_END_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-END-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list33 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HL-END-P"));

    private static final SubLSymbol HL_END_INTERVAL = makeSymbol("HL-END-INTERVAL");

    private static final SubLSymbol _CSETF_HL_END_INTERVAL = makeSymbol("_CSETF-HL-END-INTERVAL");

    private static final SubLSymbol MAKE_HL_END = makeSymbol("MAKE-HL-END");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD");

    private static final SubLSymbol SXHASH_HL_END_METHOD = makeSymbol("SXHASH-HL-END-METHOD");

    private static final SubLString $str39$_a = makeString("~a");

    private static final SubLString $str40$_a_is_not_a_valid_endpoint_p_ = makeString("~a is not a valid endpoint-p.");

    private static final SubLSymbol HL_ENDPOINT_P = makeSymbol("HL-ENDPOINT-P");

    private static final SubLList $list42 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));













    private static final SubLObject $$IntervalStartedByFn_Inclusive = reader_make_constant_shell("IntervalStartedByFn-Inclusive");



    private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell("IntervalEndedByFn-Inclusive");

    private static final SubLList $list55 = list(reader_make_constant_shell("TimeIntervalInclusiveFn"), reader_make_constant_shell("StartFn"), reader_make_constant_shell("EndFn"), reader_make_constant_shell("IntervalEndedByFn"), reader_make_constant_shell("IntervalStartedByFn-Inclusive"), reader_make_constant_shell("IntervalEndedByFn-Inclusive"));

    private static final SubLList $list56 = list(reader_make_constant_shell("TimeIntervalInclusiveFn"), reader_make_constant_shell("StartFn"), reader_make_constant_shell("EndFn"), reader_make_constant_shell("IntervalStartedByFn"), reader_make_constant_shell("IntervalStartedByFn-Inclusive"), reader_make_constant_shell("IntervalEndedByFn-Inclusive"));



    private static final SubLInteger $int$999 = makeInteger(999);



    private static final SubLInteger $int$59 = makeInteger(59);





















    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell("weak-HL-TimePrecedence");

    private static final SubLList $list72 = list(makeSymbol("NODE"), makeSymbol("LINK"));

    /**
     * Determines whether the portion of the KB necessary for time reasoning is loaded.
     * This is the KB analogue of the #+Cyc-Time feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for time reasoning is loaded.\r\nThis is the KB analogue of the #+Cyc-Time feature.\nDetermines whether the portion of the KB necessary for time reasoning is loaded.\nThis is the KB analogue of the #+Cyc-Time feature.")
    public static final SubLObject initialize_time_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $time_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_time_kb_loaded();
        } else {
            kb_control_vars.unset_time_kb_loaded();
        }
        return kb_control_vars.time_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for time reasoning is loaded.
     * This is the KB analogue of the #+Cyc-Time feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for time reasoning is loaded.\r\nThis is the KB analogue of the #+Cyc-Time feature.\nDetermines whether the portion of the KB necessary for time reasoning is loaded.\nThis is the KB analogue of the #+Cyc-Time feature.")
    public static SubLObject initialize_time_kb_feature() {
        if (NIL != every_in_list(sbhl_time_utilities.$sym1$VALID_CONSTANT_, sbhl_time_utilities.$time_core_constants$.getGlobalValue(), UNPROVIDED)) {
            set_time_kb_loaded();
        } else {
            unset_time_kb_loaded();
        }
        return time_kb_loaded_p();
    }

    public static final SubLObject initialize_hl_endpoint_tables_alt() {
        {
            SubLObject lock = $hl_start_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $hl_start_table$.setGlobalValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        {
            SubLObject lock = $hl_end_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $hl_end_table$.setGlobalValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject initialize_hl_endpoint_tables() {
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            sbhl_time_utilities.$hl_start_table$.setGlobalValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            sbhl_time_utilities.$hl_end_table$.setGlobalValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject hl_start_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.print_hl_endpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hl_start_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_time_utilities.print_hl_endpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject hl_start_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject hl_start_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native.class ? T : NIL;
    }

    public static final SubLObject hl_start_interval_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_START_P);
        return v_object.getField2();
    }

    public static SubLObject hl_start_interval(final SubLObject v_object) {
        assert NIL != sbhl_time_utilities.hl_start_p(v_object) : "! sbhl_time_utilities.hl_start_p(v_object) " + "sbhl_time_utilities.hl_start_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_hl_start_interval_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_START_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hl_start_interval(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_time_utilities.hl_start_p(v_object) : "! sbhl_time_utilities.hl_start_p(v_object) " + "sbhl_time_utilities.hl_start_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_hl_start_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INTERVAL)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities._csetf_hl_start_interval(v_new, current_value);
                    } else {
                        Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_hl_start(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERVAL)) {
                sbhl_time_utilities._csetf_hl_start_interval(v_new, current_value);
            } else {
                Errors.error(sbhl_time_utilities.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hl_start(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_time_utilities.MAKE_HL_START, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERVAL, sbhl_time_utilities.hl_start_interval(obj));
        funcall(visitor_fn, obj, $END, sbhl_time_utilities.MAKE_HL_START, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hl_start_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_time_utilities.visit_defstruct_hl_start(obj, visitor_fn);
    }

    public static final SubLObject sxhash_hl_start_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start_interval(v_object));
    }

    public static SubLObject sxhash_hl_start_method(final SubLObject v_object) {
        return Sxhash.sxhash(sbhl_time_utilities.hl_start_interval(v_object));
    }

    public static final SubLObject hl_end_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.print_hl_endpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hl_end_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sbhl_time_utilities.print_hl_endpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject hl_end_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject hl_end_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native.class ? T : NIL;
    }

    public static final SubLObject hl_end_interval_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_END_P);
        return v_object.getField2();
    }

    public static SubLObject hl_end_interval(final SubLObject v_object) {
        assert NIL != sbhl_time_utilities.hl_end_p(v_object) : "! sbhl_time_utilities.hl_end_p(v_object) " + "sbhl_time_utilities.hl_end_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_hl_end_interval_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_END_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hl_end_interval(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_time_utilities.hl_end_p(v_object) : "! sbhl_time_utilities.hl_end_p(v_object) " + "sbhl_time_utilities.hl_end_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_hl_end_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INTERVAL)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities._csetf_hl_end_interval(v_new, current_value);
                    } else {
                        Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_hl_end(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERVAL)) {
                sbhl_time_utilities._csetf_hl_end_interval(v_new, current_value);
            } else {
                Errors.error(sbhl_time_utilities.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hl_end(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_time_utilities.MAKE_HL_END, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERVAL, sbhl_time_utilities.hl_end_interval(obj));
        funcall(visitor_fn, obj, $END, sbhl_time_utilities.MAKE_HL_END, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hl_end_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_time_utilities.visit_defstruct_hl_end(obj, visitor_fn);
    }

    public static final SubLObject sxhash_hl_end_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end_interval(v_object));
    }

    public static SubLObject sxhash_hl_end_method(final SubLObject v_object) {
        return Sxhash.sxhash(sbhl_time_utilities.hl_end_interval(v_object));
    }

    public static final SubLObject print_hl_endpoint_alt(SubLObject hl_endpoint, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(hl_endpoint, stream);
            } else {
                {
                    SubLObject v_object = hl_endpoint;
                    SubLObject stream_1 = stream;
                    write_string($str_alt30$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    format(stream, $str_alt32$_a, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_interval_of_endpoint(hl_endpoint));
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_hl_endpoint(final SubLObject hl_endpoint, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(hl_endpoint, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, hl_endpoint, T, T);
            format(stream, sbhl_time_utilities.$str39$_a, sbhl_time_utilities.hl_interval_of_endpoint(hl_endpoint));
            print_macros.print_unreadable_object_postamble(stream, hl_endpoint, T, T);
        }
        return NIL;
    }

    /**
     *
     *
     * @return hl-start-p; Returns an hl-start object containing INTERVAL.
     */
    @LispMethod(comment = "@return hl-start-p; Returns an hl-start object containing INTERVAL.")
    public static final SubLObject new_hl_start_alt(SubLObject interval) {
        {
            SubLObject hl_start = com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.make_hl_start(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities._csetf_hl_start_interval(hl_start, interval);
            {
                SubLObject lock = $hl_start_table_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    sethash(interval, $hl_start_table$.getGlobalValue(), hl_start);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return hl_start;
        }
    }

    /**
     *
     *
     * @return hl-start-p; Returns an hl-start object containing INTERVAL.
     */
    @LispMethod(comment = "@return hl-start-p; Returns an hl-start object containing INTERVAL.")
    public static SubLObject new_hl_start(final SubLObject interval) {
        final SubLObject hl_start = sbhl_time_utilities.make_hl_start(UNPROVIDED);
        sbhl_time_utilities._csetf_hl_start_interval(hl_start, interval);
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            sethash(interval, sbhl_time_utilities.$hl_start_table$.getGlobalValue(), hl_start);
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        return hl_start;
    }

    /**
     *
     *
     * @return hl-end-p; Returns an hl-end object containing INTERVAL.
     */
    @LispMethod(comment = "@return hl-end-p; Returns an hl-end object containing INTERVAL.")
    public static final SubLObject new_hl_end_alt(SubLObject interval) {
        {
            SubLObject hl_end = com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.make_hl_end(UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities._csetf_hl_end_interval(hl_end, interval);
            {
                SubLObject lock = $hl_end_table_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    sethash(interval, $hl_end_table$.getGlobalValue(), hl_end);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return hl_end;
        }
    }

    /**
     *
     *
     * @return hl-end-p; Returns an hl-end object containing INTERVAL.
     */
    @LispMethod(comment = "@return hl-end-p; Returns an hl-end object containing INTERVAL.")
    public static SubLObject new_hl_end(final SubLObject interval) {
        final SubLObject hl_end = sbhl_time_utilities.make_hl_end(UNPROVIDED);
        sbhl_time_utilities._csetf_hl_end_interval(hl_end, interval);
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            sethash(interval, sbhl_time_utilities.$hl_end_table$.getGlobalValue(), hl_end);
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        return hl_end;
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is an hl start or end point.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is an hl start or end point.")
    public static final SubLObject hl_endpoint_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is an hl start or end point.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is an hl start or end point.")
    public static SubLObject hl_endpoint_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_time_utilities.hl_start_p(v_object)) || (NIL != sbhl_time_utilities.hl_end_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp;  Whether OBJECT is a valid node for sbhl-time graphs.
     */
    @LispMethod(comment = "@return booleanp;  Whether OBJECT is a valid node for sbhl-time graphs.")
    public static final SubLObject sbhl_time_node_object_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_endpoint_p(v_object);
    }

    /**
     *
     *
     * @return booleanp;  Whether OBJECT is a valid node for sbhl-time graphs.
     */
    @LispMethod(comment = "@return booleanp;  Whether OBJECT is a valid node for sbhl-time graphs.")
    public static SubLObject sbhl_time_node_object_p(final SubLObject v_object) {
        return sbhl_time_utilities.hl_endpoint_p(v_object);
    }

    /**
     *
     *
     * @return hl-time-interval-p; Returns the interval
     */
    @LispMethod(comment = "@return hl-time-interval-p; Returns the interval")
    public static final SubLObject hl_interval_of_endpoint_alt(SubLObject endpoint) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start_p(endpoint)) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start_interval(endpoint);
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end_p(endpoint)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end_interval(endpoint);
            } else {
                sbhl_paranoia.sbhl_error($str_alt34$_a_is_not_a_valid_endpoint_p_, endpoint, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return hl-time-interval-p; Returns the interval
     */
    @LispMethod(comment = "@return hl-time-interval-p; Returns the interval")
    public static SubLObject hl_interval_of_endpoint(final SubLObject endpoint) {
        if (NIL != sbhl_time_utilities.hl_start_p(endpoint)) {
            return sbhl_time_utilities.hl_start_interval(endpoint);
        }
        if (NIL != sbhl_time_utilities.hl_end_p(endpoint)) {
            return sbhl_time_utilities.hl_end_interval(endpoint);
        }
        sbhl_paranoia.sbhl_error(sbhl_time_utilities.$str40$_a_is_not_a_valid_endpoint_p_, endpoint, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject find_hl_start_alt(SubLObject time) {
        {
            SubLObject result = NIL;
            SubLObject lock = $hl_start_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = gethash(time, $hl_start_table$.getGlobalValue(), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject find_hl_start(final SubLObject time) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            result = gethash(time, sbhl_time_utilities.$hl_start_table$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static final SubLObject find_hl_end_alt(SubLObject time) {
        {
            SubLObject result = NIL;
            SubLObject lock = $hl_end_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = gethash(time, $hl_end_table$.getGlobalValue(), UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject find_hl_end(final SubLObject time) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            result = gethash(time, sbhl_time_utilities.$hl_end_table$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static final SubLObject remove_hl_start(SubLObject time) {
        {
            SubLObject lock = $hl_start_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                remhash(time, $hl_start_table$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject remove_hl_start(final SubLObject time, SubLObject hl_start) {
        if (hl_start == UNPROVIDED) {
            hl_start = NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            if (NIL == hl_start) {
                hl_start = gethash(time, sbhl_time_utilities.$hl_start_table$.getGlobalValue(), UNPROVIDED);
            }
            remhash(time, sbhl_time_utilities.$hl_start_table$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        sbhl_time_utilities.remove_hl_endpoint_backpointers(hl_start);
        return NIL;
    }

    public static final SubLObject remove_hl_end(SubLObject time) {
        {
            SubLObject lock = $hl_end_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                remhash(time, $hl_end_table$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject remove_hl_end(final SubLObject time, SubLObject hl_end) {
        if (hl_end == UNPROVIDED) {
            hl_end = NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            if (NIL == hl_end) {
                hl_end = gethash(time, sbhl_time_utilities.$hl_end_table$.getGlobalValue(), UNPROVIDED);
            }
            remhash(time, sbhl_time_utilities.$hl_end_table$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        sbhl_time_utilities.remove_hl_endpoint_backpointers(hl_end);
        return NIL;
    }

    /**
     * Removes POINT from the tables storing intervals and their starts and ends.
     */
    @LispMethod(comment = "Removes POINT from the tables storing intervals and their starts and ends.")
    public static final SubLObject remove_hl_endpoint_alt(SubLObject point) {
        SubLTrampolineFile.checkType(point, HL_ENDPOINT_P);
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start_p(point)) {
            com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.remove_hl_start(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_interval_of_endpoint(point));
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.remove_hl_end(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_interval_of_endpoint(point));
        }
        return NIL;
    }

    /**
     * Removes POINT from the tables storing intervals and their starts and ends.
     */
    @LispMethod(comment = "Removes POINT from the tables storing intervals and their starts and ends.")
    public static SubLObject remove_hl_endpoint(final SubLObject point) {
        assert NIL != sbhl_time_utilities.hl_endpoint_p(point) : "! sbhl_time_utilities.hl_endpoint_p(point) " + ("sbhl_time_utilities.hl_endpoint_p(point) " + "CommonSymbols.NIL != sbhl_time_utilities.hl_endpoint_p(point) ") + point;
        if (NIL != sbhl_time_utilities.hl_start_p(point)) {
            sbhl_time_utilities.remove_hl_start(sbhl_time_utilities.hl_interval_of_endpoint(point), UNPROVIDED);
        } else {
            sbhl_time_utilities.remove_hl_end(sbhl_time_utilities.hl_interval_of_endpoint(point), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject remove_hl_endpoint_backpointers(final SubLObject point) {
        assert NIL != sbhl_time_utilities.hl_endpoint_p(point) : "! sbhl_time_utilities.hl_endpoint_p(point) " + ("sbhl_time_utilities.hl_endpoint_p(point) " + "CommonSymbols.NIL != sbhl_time_utilities.hl_endpoint_p(point) ") + point;
        SubLObject cdolist_list_var = sbhl_time_vars.get_sbhl_hl_time_predicates();
        SubLObject sbhl_time_pred = NIL;
        sbhl_time_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module(sbhl_time_pred);
            sbhl_graphs.remove_sbhl_graph_link(point, module);
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_time_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Whether TIME is stored within some hl-start or hl-end object.
     */
    @LispMethod(comment = "@return booleanp; Whether TIME is stored within some hl-start or hl-end object.")
    public static final SubLObject time_stored_in_hl_p_alt(SubLObject time) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.find_hl_start(time)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.find_hl_end(time)));
    }

    /**
     *
     *
     * @return booleanp; Whether TIME is stored within some hl-start or hl-end object.
     */
    @LispMethod(comment = "@return booleanp; Whether TIME is stored within some hl-start or hl-end object.")
    public static SubLObject time_stored_in_hl_p(final SubLObject time) {
        return makeBoolean((NIL != sbhl_time_utilities.find_hl_start(time)) || (NIL != sbhl_time_utilities.find_hl_end(time)));
    }

    /**
     * the object representing the starting point of TIME at the HL
     */
    @LispMethod(comment = "the object representing the starting point of TIME at the HL")
    public static final SubLObject hl_start_alt(SubLObject time) {
        {
            SubLObject hl_start = com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.find_hl_start(time);
            if (NIL != hl_start) {
                return hl_start;
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.new_hl_start(time);
            }
        }
    }

    /**
     * the object representing the starting point of TIME at the HL
     */
    @LispMethod(comment = "the object representing the starting point of TIME at the HL")
    public static SubLObject hl_start(final SubLObject time) {
        final SubLObject hl_start = sbhl_time_utilities.find_hl_start(time);
        if (NIL != hl_start) {
            return hl_start;
        }
        return sbhl_time_utilities.new_hl_start(time);
    }

    /**
     * the object representing the ending point of TIME at the HL
     */
    @LispMethod(comment = "the object representing the ending point of TIME at the HL")
    public static final SubLObject hl_end_alt(SubLObject time) {
        {
            SubLObject hl_end = com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.find_hl_end(time);
            if (NIL != hl_end) {
                return hl_end;
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.new_hl_end(time);
            }
        }
    }

    /**
     * the object representing the ending point of TIME at the HL
     */
    @LispMethod(comment = "the object representing the ending point of TIME at the HL")
    public static SubLObject hl_end(final SubLObject time) {
        final SubLObject hl_end = sbhl_time_utilities.find_hl_end(time);
        if (NIL != hl_end) {
            return hl_end;
        }
        return sbhl_time_utilities.new_hl_end(time);
    }

    /**
     *
     *
     * @return hl-endpoint-p;  Returns the moment just before the start of EU-DATE.
     */
    @LispMethod(comment = "@return hl-endpoint-p;  Returns the moment just before the start of EU-DATE.")
    public static final SubLObject hl_date_predecessor_of_start_alt(SubLObject eu_date) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end(numeric_date_utilities.preceding_extended_universal_date(eu_date));
    }

    /**
     *
     *
     * @return hl-endpoint-p;  Returns the moment just before the start of EU-DATE.
     */
    @LispMethod(comment = "@return hl-endpoint-p;  Returns the moment just before the start of EU-DATE.")
    public static SubLObject hl_date_predecessor_of_start(final SubLObject eu_date) {
        return sbhl_time_utilities.hl_end(preceding_extended_universal_date(eu_date));
    }

    /**
     *
     *
     * @return hl-endpoint-p;  Returns the moment just after the end of EU-DATE.
     */
    @LispMethod(comment = "@return hl-endpoint-p;  Returns the moment just after the end of EU-DATE.")
    public static final SubLObject hl_date_successor_of_end_alt(SubLObject eu_date) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start(numeric_date_utilities.succeeding_extended_universal_date(eu_date));
    }

    /**
     *
     *
     * @return hl-endpoint-p;  Returns the moment just after the end of EU-DATE.
     */
    @LispMethod(comment = "@return hl-endpoint-p;  Returns the moment just after the end of EU-DATE.")
    public static SubLObject hl_date_successor_of_end(final SubLObject eu_date) {
        return sbhl_time_utilities.hl_start(succeeding_extended_universal_date(eu_date));
    }

    public static final SubLObject sbhl_time_arg_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != groundP(v_object, UNPROVIDED)) && (NIL == sksi_infrastructure_utilities.sksi_external_term_p(v_object)));
    }

    public static SubLObject sbhl_time_arg_p(final SubLObject v_object) {
        return makeBoolean((NIL != groundP(v_object, UNPROVIDED)) && (NIL == sksi_external_term_p(v_object)));
    }

    public static final SubLObject sbhl_time_inference_arg_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_arg_p(v_object)) && (((NIL != time_interval_utilities.date_interval_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_temporal_node_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start(v_object)))) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_temporal_node_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end(v_object)))));
    }

    public static SubLObject sbhl_time_inference_arg_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_time_utilities.sbhl_time_arg_p(v_object)) && (((NIL != valid_time_index_p(v_object)) || (NIL != sbhl_time_utilities.sbhl_temporal_node_p(sbhl_time_utilities.hl_start(v_object)))) || (NIL != sbhl_time_utilities.sbhl_temporal_node_p(sbhl_time_utilities.hl_end(v_object)))));
    }

    public static final SubLObject sbhl_time_inference_args_alt(SubLObject literal) {
        {
            SubLObject datum = literal_args(literal, UNPROVIDED);
            SubLObject current = datum;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return values(date_utilities.possibly_bind_temporal_indexical_in_object(arg1), date_utilities.possibly_bind_temporal_indexical_in_object(arg2));
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_time_inference_args(final SubLObject literal) {
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_time_utilities.$list42);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, sbhl_time_utilities.$list42);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return values(possibly_bind_temporal_indexical_in_object(arg1), possibly_bind_temporal_indexical_in_object(arg2));
        }
        cdestructuring_bind_error(datum, sbhl_time_utilities.$list42);
        return NIL;
    }

    public static final SubLObject sbhl_temporal_node_p_alt(SubLObject temporal_point) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_node_object_p(temporal_point)) {
            {
                SubLObject foundP = NIL;
                SubLObject rest = NIL;
                for (rest = get_sbhl_hl_time_predicates(); !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject pred = rest.first();
                        if (NIL != gethash(temporal_point, get_sbhl_module_graph(get_sbhl_module(pred)), UNPROVIDED)) {
                            foundP = T;
                        }
                    }
                }
                return foundP;
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_temporal_node_p(final SubLObject temporal_point) {
        if (NIL != sbhl_time_utilities.sbhl_time_node_object_p(temporal_point)) {
            SubLObject foundP;
            SubLObject rest;
            SubLObject pred;
            for (foundP = NIL, rest = NIL, rest = sbhl_time_vars.get_sbhl_hl_time_predicates(); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                pred = rest.first();
                if (NIL != gethash(temporal_point, sbhl_module_vars.get_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(pred)), UNPROVIDED)) {
                    foundP = T;
                }
            }
            return foundP;
        }
        return NIL;
    }

    /**
     * Is TEMPORAL-POINT an endpoint that occurs in a temporal link disjunction?
     */
    @LispMethod(comment = "Is TEMPORAL-POINT an endpoint that occurs in a temporal link disjunction?")
    public static final SubLObject temporal_link_disjunction_term_p_alt(SubLObject temporal_point) {
        return list_utilities.sublisp_boolean(gethash(temporal_point, $sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), UNPROVIDED));
    }

    @LispMethod(comment = "Is TEMPORAL-POINT an endpoint that occurs in a temporal link disjunction?")
    public static SubLObject temporal_link_disjunction_term_p(final SubLObject temporal_point) {
        return sublisp_boolean(gethash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject sbhl_temporality_term_p_alt(SubLObject v_term) {
        return makeBoolean(((((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_temporal_node_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start(v_term))) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_temporal_node_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end(v_term)))) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.temporal_link_disjunction_term_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start(v_term)))) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.temporal_link_disjunction_term_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end(v_term)))) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_endpoint_p(v_term)));
    }

    public static SubLObject sbhl_temporality_term_p(final SubLObject v_term) {
        return makeBoolean(((((NIL != sbhl_time_utilities.sbhl_temporal_node_p(sbhl_time_utilities.hl_start(v_term))) || (NIL != sbhl_time_utilities.sbhl_temporal_node_p(sbhl_time_utilities.hl_end(v_term)))) || (NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(sbhl_time_utilities.hl_start(v_term)))) || (NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(sbhl_time_utilities.hl_end(v_term)))) || (NIL != sbhl_time_utilities.hl_endpoint_p(v_term)));
    }

    public static final SubLObject valid_sbhl_time_literal_argsP_alt(SubLObject pred, SubLObject arg1, SubLObject arg2) {
        return makeBoolean((((NIL != sbhl_temporality_activeP()) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_predicate_p(pred))) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_arg_p(arg1))) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_arg_p(arg2)));
    }

    public static SubLObject valid_sbhl_time_literal_argsP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((((NIL != sbhl_time_vars.sbhl_temporality_activeP()) && (NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred))) && (NIL != sbhl_time_utilities.sbhl_time_arg_p(arg1))) && (NIL != sbhl_time_utilities.sbhl_time_arg_p(arg2)));
    }

    /**
     *
     *
     * @return booleanp;  Whether NODE passes filters used in generating results.
     */
    @LispMethod(comment = "@return booleanp;  Whether NODE passes filters used in generating results.")
    public static final SubLObject sbhl_node_passes_temporality_all_accesses_filtersP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $sbhl_temporality_dont_collect_dates_when_all_accessingP$.getDynamicValue(thread)) {
                if (NIL != date_utilities.possibly_hl_date_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_interval_of_endpoint(node))) {
                    return NIL;
                }
            }
            if ($sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == $START) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_start_p(node);
            } else {
                if ($sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == $END) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_end_p(node);
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @return booleanp;  Whether NODE passes filters used in generating results.
     */
    @LispMethod(comment = "@return booleanp;  Whether NODE passes filters used in generating results.")
    public static SubLObject sbhl_node_passes_temporality_all_accesses_filtersP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.getDynamicValue(thread)) && (NIL != possibly_hl_date_p(sbhl_time_utilities.hl_interval_of_endpoint(node)))) {
            return NIL;
        }
        if (sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == $START) {
            return sbhl_time_utilities.hl_start_p(node);
        }
        if (sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == $END) {
            return sbhl_time_utilities.hl_end_p(node);
        }
        return T;
    }

    /**
     *
     *
     * @return listp;  Returns all the intervals within each of the TEMPORAL-POINTS.
     */
    @LispMethod(comment = "@return listp;  Returns all the intervals within each of the TEMPORAL-POINTS.")
    public static final SubLObject point_args_alt(SubLObject temporal_points) {
        {
            SubLObject args = NIL;
            SubLObject cdolist_list_var = temporal_points;
            SubLObject point = NIL;
            for (point = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , point = cdolist_list_var.first()) {
                args = cons(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_interval_of_endpoint(point), args);
            }
            return args;
        }
    }

    /**
     *
     *
     * @return listp;  Returns all the intervals within each of the TEMPORAL-POINTS.
     */
    @LispMethod(comment = "@return listp;  Returns all the intervals within each of the TEMPORAL-POINTS.")
    public static SubLObject point_args(final SubLObject temporal_points) {
        SubLObject args = NIL;
        SubLObject cdolist_list_var = temporal_points;
        SubLObject point = NIL;
        point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            args = cons(sbhl_time_utilities.hl_interval_of_endpoint(point), args);
            cdolist_list_var = cdolist_list_var.rest();
            point = cdolist_list_var.first();
        } 
        return args;
    }

    public static final SubLObject sbhl_temporal_point_nartP_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_endpoint_p(v_term);
    }

    public static SubLObject sbhl_temporal_point_nartP(final SubLObject v_term) {
        return sbhl_time_utilities.hl_endpoint_p(v_term);
    }

    public static final SubLObject quasi_hl_start_alt(SubLObject time) {
        return list($START, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(time));
    }

    public static SubLObject quasi_hl_start(final SubLObject time) {
        return list($START, sbhl_time_utilities.start_arg(time));
    }

    public static final SubLObject quasi_hl_earliest_start_alt(SubLObject time) {
        return list($START, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.earliest_start_arg(time));
    }

    public static SubLObject quasi_hl_earliest_start(final SubLObject time) {
        return list($START, sbhl_time_utilities.earliest_start_arg(time));
    }

    public static final SubLObject quasi_hl_latest_start_alt(SubLObject time) {
        return list($START, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.latest_start_arg(time));
    }

    public static SubLObject quasi_hl_latest_start(final SubLObject time) {
        return list($START, sbhl_time_utilities.latest_start_arg(time));
    }

    public static final SubLObject quasi_hl_end_alt(SubLObject time) {
        return list($END, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(time));
    }

    public static SubLObject quasi_hl_end(final SubLObject time) {
        return list($END, sbhl_time_utilities.end_arg(time));
    }

    public static final SubLObject quasi_hl_latest_end_alt(SubLObject time) {
        return list($END, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.latest_end_arg(time));
    }

    public static SubLObject quasi_hl_latest_end(final SubLObject time) {
        return list($END, sbhl_time_utilities.latest_end_arg(time));
    }

    public static final SubLObject quasi_hl_earliest_end_alt(SubLObject time) {
        return list($END, com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.earliest_end_arg(time));
    }

    public static SubLObject quasi_hl_earliest_end(final SubLObject time) {
        return list($END, sbhl_time_utilities.earliest_end_arg(time));
    }

    public static final SubLObject sbhl_time_predicate_p_alt(SubLObject predicate) {
        return subl_promotions.memberP(predicate, $sbhl_time_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sbhl_time_predicate_p(final SubLObject predicate) {
        return memberP(predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sbhl_time_predicate_with_no_spec_pred_or_inverseP(final SubLObject predicate) {
        return makeBoolean((NIL != sbhl_time_utilities.sbhl_time_predicate_p(predicate)) && (NIL == genl_predicates.some_spec_pred_or_inverseP(predicate, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject conjunctive_temporal_relation_predP_alt(SubLObject pred) {
        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return NIL;
        }
        {
            SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTIVE_, $NOT_FOUND);
            if (NIL == booleanp(conjunctiveP)) {
                return NIL;
            }
            return conjunctiveP;
        }
    }

    public static SubLObject conjunctive_temporal_relation_predP(final SubLObject pred) {
        if (NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return NIL;
        }
        final SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTIVE_, $NOT_FOUND);
        if (NIL == booleanp(conjunctiveP)) {
            return NIL;
        }
        return conjunctiveP;
    }

    public static final SubLObject disjunctive_temporal_relation_predP_alt(SubLObject pred) {
        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return NIL;
        }
        {
            SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTIVE_, $NOT_FOUND);
            if (NIL == booleanp(conjunctiveP)) {
                return NIL;
            }
            return makeBoolean(NIL == conjunctiveP);
        }
    }

    public static SubLObject disjunctive_temporal_relation_predP(final SubLObject pred) {
        if (NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return NIL;
        }
        final SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTIVE_, $NOT_FOUND);
        if (NIL == booleanp(conjunctiveP)) {
            return NIL;
        }
        return makeBoolean(NIL == conjunctiveP);
    }

    public static final SubLObject earliest_start_arg_alt(SubLObject time) {
        {
            SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$SomeTimeInIntervalFn)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.earliest_start_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(time);
            }
        }
    }

    public static SubLObject earliest_start_arg(final SubLObject time) {
        final SubLObject pcase_var = formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$$SomeTimeInIntervalFn)) {
            return sbhl_time_utilities.earliest_start_arg(nat_arg1(time, UNPROVIDED));
        }
        return sbhl_time_utilities.start_arg(time);
    }

    public static final SubLObject latest_start_arg_alt(SubLObject time) {
        {
            SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$SomeTimeInIntervalFn)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.latest_end_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(time);
            }
        }
    }

    public static SubLObject latest_start_arg(final SubLObject time) {
        final SubLObject pcase_var = formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$$SomeTimeInIntervalFn)) {
            return sbhl_time_utilities.latest_end_arg(nat_arg1(time, UNPROVIDED));
        }
        return sbhl_time_utilities.start_arg(time);
    }

    public static final SubLObject start_arg_alt(SubLObject time) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.date_interval_nat_p(time)) {
            {
                SubLObject pcase_var = cycl_utilities.formula_operator(time);
                if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                } else {
                    if (pcase_var.eql($$TimeIntervalBetweenFn)) {
                        return numeric_date_utilities.succeeding_extended_universal_date(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED)));
                    } else {
                        if (pcase_var.eql($$StartFn) || pcase_var.eql($$EndFn)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                        } else {
                            if (pcase_var.eql($$IntervalStartedByFn)) {
                                return numeric_date_utilities.succeeding_extended_universal_date(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED)));
                            } else {
                                if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                                } else {
                                    if (pcase_var.eql($$IntervalEndedByFn)) {
                                        return date_utilities.$beginning_of_time$.getGlobalValue();
                                    } else {
                                        if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                                            return date_utilities.$beginning_of_time$.getGlobalValue();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.time_interval_nat_with_possibly_reducible_start_p(time)) {
                {
                    SubLObject pcase_var = cycl_utilities.formula_operator(time);
                    if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                    } else {
                        if (pcase_var.eql($$StartFn) || pcase_var.eql($$EndFn)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                        } else {
                            if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                            } else {
                                if (pcase_var.eql($$IntervalEndedByFn)) {
                                    return date_utilities.$beginning_of_time$.getGlobalValue();
                                } else {
                                    if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                                        return date_utilities.$beginning_of_time$.getGlobalValue();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (NIL != date_utilities.always_time_intervalP(time)) {
                    return date_utilities.$beginning_of_time$.getGlobalValue();
                } else {
                    if (NIL != date_utilities.beginning_of_timeP(time)) {
                        return time;
                    } else {
                        if (NIL != date_utilities.end_of_timeP(time)) {
                            return time;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p(time)) {
                                return date_utilities.extended_universal_date_for_date_initial_second(time);
                            } else {
                                if (NIL != groundP(time, UNPROVIDED)) {
                                    return time;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject start_arg(final SubLObject time) {
        if (NIL != sbhl_time_utilities.date_interval_nat_p(time)) {
            final SubLObject pcase_var = formula_operator(time);
            if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalInclusiveFn)) {
                return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalBetweenFn)) {
                return succeeding_extended_universal_date(sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$StartFn)) {
                return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$EndFn)) {
                return sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn)) {
                return succeeding_extended_universal_date(sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn_Inclusive)) {
                return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn)) {
                return $beginning_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn_Inclusive)) {
                return $beginning_of_time$.getGlobalValue();
            }
        } else
            if (NIL != sbhl_time_utilities.time_interval_nat_with_possibly_reducible_start_p(time)) {
                final SubLObject pcase_var = formula_operator(time);
                if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalInclusiveFn)) {
                    return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$StartFn)) {
                    return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$EndFn)) {
                    return sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn_Inclusive)) {
                    return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn)) {
                    return $beginning_of_time$.getGlobalValue();
                }
                if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn_Inclusive)) {
                    return $beginning_of_time$.getGlobalValue();
                }
            } else {
                if (NIL != always_time_intervalP(time)) {
                    return $beginning_of_time$.getGlobalValue();
                }
                if (NIL != beginning_of_timeP(time)) {
                    return time;
                }
                if (NIL != end_of_timeP(time)) {
                    return time;
                }
                if (NIL != sbhl_time_utilities.sbhl_time_el_date_p(time)) {
                    return extended_universal_date_for_date_initial_second(time);
                }
                if (NIL != groundP(time, UNPROVIDED)) {
                    return time;
                }
            }

        return NIL;
    }

    public static final SubLObject earliest_end_arg_alt(SubLObject time) {
        {
            SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$SomeTimeInIntervalFn)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.earliest_start_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(time);
            }
        }
    }

    public static SubLObject earliest_end_arg(final SubLObject time) {
        final SubLObject pcase_var = formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$$SomeTimeInIntervalFn)) {
            return sbhl_time_utilities.earliest_start_arg(nat_arg1(time, UNPROVIDED));
        }
        return sbhl_time_utilities.end_arg(time);
    }

    public static final SubLObject latest_end_arg_alt(SubLObject time) {
        {
            SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$SomeTimeInIntervalFn)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.latest_end_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(time);
            }
        }
    }

    public static SubLObject latest_end_arg(final SubLObject time) {
        final SubLObject pcase_var = formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$$SomeTimeInIntervalFn)) {
            return sbhl_time_utilities.latest_end_arg(nat_arg1(time, UNPROVIDED));
        }
        return sbhl_time_utilities.end_arg(time);
    }

    public static final SubLObject end_arg_alt(SubLObject time) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.date_interval_nat_p(time)) {
            {
                SubLObject pcase_var = cycl_utilities.formula_operator(time);
                if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg2(time, UNPROVIDED));
                } else {
                    if (pcase_var.eql($$TimeIntervalBetweenFn)) {
                        return numeric_date_utilities.preceding_extended_universal_date(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg2(time, UNPROVIDED)));
                    } else {
                        if (pcase_var.eql($$StartFn) || pcase_var.eql($$EndFn)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                        } else {
                            if (pcase_var.eql($$IntervalStartedByFn)) {
                                return date_utilities.$end_of_time$.getGlobalValue();
                            } else {
                                if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                                    return date_utilities.$end_of_time$.getGlobalValue();
                                } else {
                                    if (pcase_var.eql($$IntervalEndedByFn)) {
                                        return numeric_date_utilities.preceding_extended_universal_date(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED)));
                                    } else {
                                        if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.time_interval_nat_with_possibly_reducible_end_p(time)) {
                {
                    SubLObject pcase_var = cycl_utilities.formula_operator(time);
                    if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg2(time, UNPROVIDED));
                    } else {
                        if (pcase_var.eql($$StartFn) || pcase_var.eql($$EndFn)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                        } else {
                            if (pcase_var.eql($$IntervalStartedByFn)) {
                                return date_utilities.$end_of_time$.getGlobalValue();
                            } else {
                                if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                                    return date_utilities.$end_of_time$.getGlobalValue();
                                } else {
                                    if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (NIL != date_utilities.always_time_intervalP(time)) {
                    return date_utilities.$end_of_time$.getGlobalValue();
                } else {
                    if (NIL != date_utilities.beginning_of_timeP(time)) {
                        return time;
                    } else {
                        if (NIL != date_utilities.end_of_timeP(time)) {
                            return time;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p(time)) {
                                return date_utilities.extended_universal_date_for_date_final_second(time);
                            } else {
                                if (NIL != groundP(time, UNPROVIDED)) {
                                    return time;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject end_arg(final SubLObject time) {
        if (NIL != sbhl_time_utilities.date_interval_nat_p(time)) {
            final SubLObject pcase_var = formula_operator(time);
            if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalInclusiveFn)) {
                return sbhl_time_utilities.end_arg(formula_arg2(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalBetweenFn)) {
                return preceding_extended_universal_date(sbhl_time_utilities.start_arg(formula_arg2(time, UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$StartFn)) {
                return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$EndFn)) {
                return sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn)) {
                return $end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn_Inclusive)) {
                return $end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn)) {
                return preceding_extended_universal_date(sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn_Inclusive)) {
                return sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED));
            }
        } else
            if (NIL != sbhl_time_utilities.time_interval_nat_with_possibly_reducible_end_p(time)) {
                final SubLObject pcase_var = formula_operator(time);
                if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalInclusiveFn)) {
                    return sbhl_time_utilities.end_arg(formula_arg2(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$StartFn)) {
                    return sbhl_time_utilities.start_arg(formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$EndFn)) {
                    return sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn)) {
                    return $end_of_time$.getGlobalValue();
                }
                if (pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn_Inclusive)) {
                    return $end_of_time$.getGlobalValue();
                }
                if (pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn_Inclusive)) {
                    return sbhl_time_utilities.end_arg(formula_arg1(time, UNPROVIDED));
                }
            } else {
                if (NIL != always_time_intervalP(time)) {
                    return $end_of_time$.getGlobalValue();
                }
                if (NIL != beginning_of_timeP(time)) {
                    return time;
                }
                if (NIL != end_of_timeP(time)) {
                    return time;
                }
                if (NIL != sbhl_time_utilities.sbhl_time_el_date_p(time)) {
                    return extended_universal_date_for_date_final_second(time);
                }
                if (NIL != groundP(time, UNPROVIDED)) {
                    return time;
                }
            }

        return NIL;
    }

    /**
     *
     *
     * @return booleanp;  Whether OBJECT is the endpoint of a date.
     */
    @LispMethod(comment = "@return booleanp;  Whether OBJECT is the endpoint of a date.")
    public static final SubLObject hl_date_point_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_endpoint_p(v_object)) && (NIL != sbhl_time_dates.sbhl_date_p(com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.hl_interval_of_endpoint(v_object))));
    }

    /**
     *
     *
     * @return booleanp;  Whether OBJECT is the endpoint of a date.
     */
    @LispMethod(comment = "@return booleanp;  Whether OBJECT is the endpoint of a date.")
    public static SubLObject hl_date_point_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_time_utilities.hl_endpoint_p(v_object)) && (NIL != sbhl_time_dates.sbhl_date_p(sbhl_time_utilities.hl_interval_of_endpoint(v_object))));
    }

    /**
     * Is TIME a NAT that reduces to an (inclusive or exclusive)
     * interval between dates?
     */
    @LispMethod(comment = "Is TIME a NAT that reduces to an (inclusive or exclusive)\r\ninterval between dates?\nIs TIME a NAT that reduces to an (inclusive or exclusive)\ninterval between dates?")
    public static final SubLObject date_interval_nat_p_alt(SubLObject time) {
        if (NIL == cycl_grammar.cycl_nat_p(time)) {
            return NIL;
        }
        {
            SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$TimeIntervalInclusiveFn) || pcase_var.eql($$TimeIntervalBetweenFn)) {
                {
                    SubLObject arg1 = cycl_utilities.formula_arg1(time, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.formula_arg2(time, UNPROVIDED);
                    return makeBoolean(((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p(arg1)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.date_interval_nat_p(arg1))) && ((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p(arg2)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.date_interval_nat_p(arg2))));
                }
            } else {
                if (((((pcase_var.eql($$StartFn) || pcase_var.eql($$EndFn)) || pcase_var.eql($$IntervalStartedByFn)) || pcase_var.eql($$IntervalEndedByFn)) || pcase_var.eql($$IntervalStartedByFn_Inclusive)) || pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                    {
                        SubLObject arg1 = cycl_utilities.formula_arg1(time, UNPROVIDED);
                        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p(arg1)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.date_interval_nat_p(arg1)));
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "Is TIME a NAT that reduces to an (inclusive or exclusive)\r\ninterval between dates?\nIs TIME a NAT that reduces to an (inclusive or exclusive)\ninterval between dates?")
    public static SubLObject date_interval_nat_p(final SubLObject time) {
        if (NIL == cycl_nat_p(time)) {
            return NIL;
        }
        final SubLObject pcase_var = formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$$TimeIntervalInclusiveFn) || pcase_var.eql(sbhl_time_utilities.$$TimeIntervalBetweenFn)) {
            final SubLObject arg1 = formula_arg1(time, UNPROVIDED);
            final SubLObject arg2 = formula_arg2(time, UNPROVIDED);
            return makeBoolean(((NIL != sbhl_time_utilities.sbhl_time_el_date_p(arg1)) || (NIL != sbhl_time_utilities.date_interval_nat_p(arg1))) && ((NIL != sbhl_time_utilities.sbhl_time_el_date_p(arg2)) || (NIL != sbhl_time_utilities.date_interval_nat_p(arg2))));
        }
        if (((((pcase_var.eql(sbhl_time_utilities.$$StartFn) || pcase_var.eql(sbhl_time_utilities.$$EndFn)) || pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn)) || pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn)) || pcase_var.eql(sbhl_time_utilities.$$IntervalStartedByFn_Inclusive)) || pcase_var.eql(sbhl_time_utilities.$$IntervalEndedByFn_Inclusive)) {
            final SubLObject arg1 = formula_arg1(time, UNPROVIDED);
            return makeBoolean((NIL != sbhl_time_utilities.sbhl_time_el_date_p(arg1)) || (NIL != sbhl_time_utilities.date_interval_nat_p(arg1)));
        }
        return NIL;
    }

    public static final SubLObject time_interval_nat_with_possibly_reducible_start_p_alt(SubLObject time) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(time)) && (NIL != list_utilities.member_eqP(cycl_utilities.formula_operator(time), $list_alt50)));
    }

    public static SubLObject time_interval_nat_with_possibly_reducible_start_p(final SubLObject time) {
        return makeBoolean((NIL != cycl_nat_p(time)) && (NIL != member(formula_operator(time), sbhl_time_utilities.$list55, symbol_function(EQL), UNPROVIDED)));
    }

    public static final SubLObject time_interval_nat_with_possibly_reducible_end_p_alt(SubLObject time) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(time)) && (NIL != list_utilities.member_eqP(cycl_utilities.formula_operator(time), $list_alt51)));
    }

    public static SubLObject time_interval_nat_with_possibly_reducible_end_p(final SubLObject time) {
        return makeBoolean((NIL != cycl_nat_p(time)) && (NIL != memberP(formula_operator(time), sbhl_time_utilities.$list56, symbol_function(EQL), UNPROVIDED)));
    }

    /**
     * Return T iff OBJECT is a CycL date expression the arguments of
     * the function expressions in which are within appropriate ranges
     */
    @LispMethod(comment = "Return T iff OBJECT is a CycL date expression the arguments of\r\nthe function expressions in which are within appropriate ranges\nReturn T iff OBJECT is a CycL date expression the arguments of\nthe function expressions in which are within appropriate ranges")
    public static final SubLObject sbhl_time_el_date_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(v_object, NIL);
    }

    @LispMethod(comment = "Return T iff OBJECT is a CycL date expression the arguments of\r\nthe function expressions in which are within appropriate ranges\nReturn T iff OBJECT is a CycL date expression the arguments of\nthe function expressions in which are within appropriate ranges")
    public static SubLObject sbhl_time_el_date_p(final SubLObject v_object) {
        return sbhl_time_utilities.sbhl_time_el_date_p_recursive(v_object, NIL);
    }

    public static final SubLObject sbhl_time_el_date_p_recursive_alt(SubLObject v_object, SubLObject expected) {
        if (NIL == possibly_naut_p(v_object)) {
            return NIL;
        }
        {
            SubLObject function = cycl_utilities.formula_operator(v_object);
            if (!((NIL == expected) || (function == expected))) {
                return NIL;
            }
            {
                SubLObject pcase_var = function;
                if (pcase_var.eql($$SecondFn)) {
                    {
                        SubLObject second = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
                        return makeBoolean(((second.isInteger() && ZERO_INTEGER.numLE(second)) && second.numLE($int$59)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$MinuteFn)));
                    }
                } else {
                    if (pcase_var.eql($$MinuteFn)) {
                        {
                            SubLObject minute = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
                            return makeBoolean(((minute.isInteger() && ZERO_INTEGER.numLE(minute)) && minute.numLE($int$59)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$HourFn)));
                        }
                    } else {
                        if (pcase_var.eql($$HourFn)) {
                            {
                                SubLObject hour = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
                                return makeBoolean(((hour.isInteger() && ZERO_INTEGER.numLE(hour)) && hour.numLE($int$23)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$DayFn)));
                            }
                        } else {
                            if (pcase_var.eql($$DayFn)) {
                                {
                                    SubLObject day = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
                                    return makeBoolean(((day.isInteger() && ONE_INTEGER.numLE(day)) && day.numLE($int$31)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$MonthFn)));
                                }
                            } else {
                                if (pcase_var.eql($$MonthFn)) {
                                    {
                                        SubLObject month = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
                                        return makeBoolean((NIL != date_utilities.month_p(month)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$YearFn)));
                                    }
                                } else {
                                    if (pcase_var.eql($$QuarterFn)) {
                                        {
                                            SubLObject quarter = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
                                            return makeBoolean(((quarter.isInteger() && ONE_INTEGER.numLE(quarter)) && quarter.numLE(FOUR_INTEGER)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$YearFn)));
                                        }
                                    } else {
                                        if (pcase_var.eql($$YearFn)) {
                                            return integerp(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                                        } else {
                                            if (pcase_var.eql($$DecadeFn)) {
                                                return integerp(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                                            } else {
                                                if (pcase_var.eql($$CenturyFn)) {
                                                    return integerp(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                                                } else {
                                                    return NIL;
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

    public static SubLObject sbhl_time_el_date_p_recursive(final SubLObject v_object, final SubLObject expected) {
        if (NIL == possibly_naut_p(v_object)) {
            return NIL;
        }
        final SubLObject function = formula_operator(v_object);
        if ((NIL != expected) && (!function.eql(expected))) {
            return NIL;
        }
        final SubLObject pcase_var = function;
        if (pcase_var.eql(sbhl_time_utilities.$$MilliSecondFn)) {
            final SubLObject millisecond = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((millisecond.isInteger() && ZERO_INTEGER.numLE(millisecond)) && millisecond.numLE(sbhl_time_utilities.$int$999)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$SecondFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$SecondFn)) {
            final SubLObject second = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((second.isInteger() && ZERO_INTEGER.numLE(second)) && second.numLE(sbhl_time_utilities.$int$59)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$MinuteFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$MinuteFn)) {
            final SubLObject minute = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((minute.isInteger() && ZERO_INTEGER.numLE(minute)) && minute.numLE(sbhl_time_utilities.$int$59)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$HourFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$HourFn)) {
            final SubLObject hour = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((hour.isInteger() && ZERO_INTEGER.numLE(hour)) && hour.numLE(sbhl_time_utilities.$int$23)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$DayFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$DayFn)) {
            final SubLObject day = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((day.isInteger() && ONE_INTEGER.numLE(day)) && day.numLE(sbhl_time_utilities.$int$31)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$MonthFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$MonthFn)) {
            final SubLObject month = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean((NIL != month_p(month)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$YearFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$QuarterFn)) {
            final SubLObject quarter = formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((quarter.isInteger() && ONE_INTEGER.numLE(quarter)) && quarter.numLE(FOUR_INTEGER)) && (NIL != sbhl_time_utilities.sbhl_time_el_date_p_recursive(formula_arg2(v_object, UNPROVIDED), sbhl_time_utilities.$$YearFn)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$YearFn)) {
            return integerp(formula_arg1(v_object, UNPROVIDED));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$DecadeFn)) {
            return integerp(formula_arg1(v_object, UNPROVIDED));
        }
        if (pcase_var.eql(sbhl_time_utilities.$$CenturyFn)) {
            return integerp(formula_arg1(v_object, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject sbhl_weak_graph_busted_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject module = sbhl_module_vars.get_sbhl_module(sbhl_time_utilities.$$weak_HL_TimePrecedence);
        sbhl_graphs.swap_in_all_graph_links(module);
        final SubLObject iterator = map_utilities.new_map_iterator(sbhl_module_vars.get_sbhl_module_graph(module));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject link = NIL;
                destructuring_bind_must_consp(current, datum, sbhl_time_utilities.$list72);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, sbhl_time_utilities.$list72);
                link = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject interval_term = NIL;
                    if (NIL != sbhl_time_utilities.hl_start_p(node)) {
                        interval_term = sbhl_time_utilities.hl_start_interval(node);
                    } else
                        if (NIL != sbhl_time_utilities.hl_end_p(node)) {
                            interval_term = sbhl_time_utilities.hl_end_interval(node);
                        }

                    if ((NIL == narts_high.naut_p(interval_term)) && (NIL == forts.valid_fortP(interval_term))) {
                        result = cons(interval_term, result);
                    }
                } else {
                    cdestructuring_bind_error(datum, sbhl_time_utilities.$list72);
                }
            }
        }
        return nreverse(result);
    }

    public static final SubLObject declare_sbhl_time_utilities_file_alt() {
        declareFunction("initialize_time_kb_feature", "INITIALIZE-TIME-KB-FEATURE", 0, 0, false);
        declareFunction("initialize_hl_endpoint_tables", "INITIALIZE-HL-ENDPOINT-TABLES", 0, 0, false);
        declareFunction("hl_start_print_function_trampoline", "HL-START-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hl_start_p", "HL-START-P", 1, 0, false);
        new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_start_p$UnaryFunction();
        declareFunction("hl_start_interval", "HL-START-INTERVAL", 1, 0, false);
        declareFunction("_csetf_hl_start_interval", "_CSETF-HL-START-INTERVAL", 2, 0, false);
        declareFunction("make_hl_start", "MAKE-HL-START", 0, 1, false);
        declareFunction("sxhash_hl_start_method", "SXHASH-HL-START-METHOD", 1, 0, false);
        new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$sxhash_hl_start_method$UnaryFunction();
        declareFunction("hl_end_print_function_trampoline", "HL-END-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hl_end_p", "HL-END-P", 1, 0, false);
        new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$hl_end_p$UnaryFunction();
        declareFunction("hl_end_interval", "HL-END-INTERVAL", 1, 0, false);
        declareFunction("_csetf_hl_end_interval", "_CSETF-HL-END-INTERVAL", 2, 0, false);
        declareFunction("make_hl_end", "MAKE-HL-END", 0, 1, false);
        declareFunction("sxhash_hl_end_method", "SXHASH-HL-END-METHOD", 1, 0, false);
        new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$sxhash_hl_end_method$UnaryFunction();
        declareFunction("print_hl_endpoint", "PRINT-HL-ENDPOINT", 3, 0, false);
        declareFunction("new_hl_start", "NEW-HL-START", 1, 0, false);
        declareFunction("new_hl_end", "NEW-HL-END", 1, 0, false);
        declareFunction("hl_endpoint_p", "HL-ENDPOINT-P", 1, 0, false);
        declareFunction("sbhl_time_node_object_p", "SBHL-TIME-NODE-OBJECT-P", 1, 0, false);
        declareFunction("hl_interval_of_endpoint", "HL-INTERVAL-OF-ENDPOINT", 1, 0, false);
        declareFunction("find_hl_start", "FIND-HL-START", 1, 0, false);
        declareFunction("find_hl_end", "FIND-HL-END", 1, 0, false);
        declareFunction("remove_hl_start", "REMOVE-HL-START", 1, 0, false);
        declareFunction("remove_hl_end", "REMOVE-HL-END", 1, 0, false);
        declareFunction("remove_hl_endpoint", "REMOVE-HL-ENDPOINT", 1, 0, false);
        declareFunction("time_stored_in_hl_p", "TIME-STORED-IN-HL-P", 1, 0, false);
        declareFunction("hl_start", "HL-START", 1, 0, false);
        declareFunction("hl_end", "HL-END", 1, 0, false);
        declareFunction("hl_date_predecessor_of_start", "HL-DATE-PREDECESSOR-OF-START", 1, 0, false);
        declareFunction("hl_date_successor_of_end", "HL-DATE-SUCCESSOR-OF-END", 1, 0, false);
        declareFunction("sbhl_time_arg_p", "SBHL-TIME-ARG-P", 1, 0, false);
        declareFunction("sbhl_time_inference_arg_p", "SBHL-TIME-INFERENCE-ARG-P", 1, 0, false);
        declareFunction("sbhl_time_inference_args", "SBHL-TIME-INFERENCE-ARGS", 1, 0, false);
        declareFunction("sbhl_temporal_node_p", "SBHL-TEMPORAL-NODE-P", 1, 0, false);
        declareFunction("temporal_link_disjunction_term_p", "TEMPORAL-LINK-DISJUNCTION-TERM-P", 1, 0, false);
        declareFunction("sbhl_temporality_term_p", "SBHL-TEMPORALITY-TERM-P", 1, 0, false);
        declareFunction("valid_sbhl_time_literal_argsP", "VALID-SBHL-TIME-LITERAL-ARGS?", 3, 0, false);
        declareFunction("sbhl_node_passes_temporality_all_accesses_filtersP", "SBHL-NODE-PASSES-TEMPORALITY-ALL-ACCESSES-FILTERS?", 1, 0, false);
        declareFunction("point_args", "POINT-ARGS", 1, 0, false);
        declareFunction("sbhl_temporal_point_nartP", "SBHL-TEMPORAL-POINT-NART?", 1, 0, false);
        declareFunction("quasi_hl_start", "QUASI-HL-START", 1, 0, false);
        declareFunction("quasi_hl_earliest_start", "QUASI-HL-EARLIEST-START", 1, 0, false);
        declareFunction("quasi_hl_latest_start", "QUASI-HL-LATEST-START", 1, 0, false);
        declareFunction("quasi_hl_end", "QUASI-HL-END", 1, 0, false);
        declareFunction("quasi_hl_latest_end", "QUASI-HL-LATEST-END", 1, 0, false);
        declareFunction("quasi_hl_earliest_end", "QUASI-HL-EARLIEST-END", 1, 0, false);
        declareFunction("sbhl_time_predicate_p", "SBHL-TIME-PREDICATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities.$sbhl_time_predicate_p$UnaryFunction();
        declareFunction("conjunctive_temporal_relation_predP", "CONJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        declareFunction("disjunctive_temporal_relation_predP", "DISJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        declareFunction("earliest_start_arg", "EARLIEST-START-ARG", 1, 0, false);
        declareFunction("latest_start_arg", "LATEST-START-ARG", 1, 0, false);
        declareFunction("start_arg", "START-ARG", 1, 0, false);
        declareFunction("earliest_end_arg", "EARLIEST-END-ARG", 1, 0, false);
        declareFunction("latest_end_arg", "LATEST-END-ARG", 1, 0, false);
        declareFunction("end_arg", "END-ARG", 1, 0, false);
        declareFunction("hl_date_point_p", "HL-DATE-POINT-P", 1, 0, false);
        declareFunction("date_interval_nat_p", "DATE-INTERVAL-NAT-P", 1, 0, false);
        declareFunction("time_interval_nat_with_possibly_reducible_start_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-START-P", 1, 0, false);
        declareFunction("time_interval_nat_with_possibly_reducible_end_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-END-P", 1, 0, false);
        declareFunction("sbhl_time_el_date_p", "SBHL-TIME-EL-DATE-P", 1, 0, false);
        declareFunction("sbhl_time_el_date_p_recursive", "SBHL-TIME-EL-DATE-P-RECURSIVE", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_sbhl_time_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("initialize_time_kb_feature", "INITIALIZE-TIME-KB-FEATURE", 0, 0, false);
            declareFunction("initialize_hl_endpoint_tables", "INITIALIZE-HL-ENDPOINT-TABLES", 0, 0, false);
            declareFunction("hl_start_print_function_trampoline", "HL-START-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("hl_start_p", "HL-START-P", 1, 0, false);
            new sbhl_time_utilities.$hl_start_p$UnaryFunction();
            declareFunction("hl_start_interval", "HL-START-INTERVAL", 1, 0, false);
            declareFunction("_csetf_hl_start_interval", "_CSETF-HL-START-INTERVAL", 2, 0, false);
            declareFunction("make_hl_start", "MAKE-HL-START", 0, 1, false);
            declareFunction("visit_defstruct_hl_start", "VISIT-DEFSTRUCT-HL-START", 2, 0, false);
            declareFunction("visit_defstruct_object_hl_start_method", "VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD", 2, 0, false);
            declareFunction("sxhash_hl_start_method", "SXHASH-HL-START-METHOD", 1, 0, false);
            new sbhl_time_utilities.$sxhash_hl_start_method$UnaryFunction();
            declareFunction("hl_end_print_function_trampoline", "HL-END-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("hl_end_p", "HL-END-P", 1, 0, false);
            new sbhl_time_utilities.$hl_end_p$UnaryFunction();
            declareFunction("hl_end_interval", "HL-END-INTERVAL", 1, 0, false);
            declareFunction("_csetf_hl_end_interval", "_CSETF-HL-END-INTERVAL", 2, 0, false);
            declareFunction("make_hl_end", "MAKE-HL-END", 0, 1, false);
            declareFunction("visit_defstruct_hl_end", "VISIT-DEFSTRUCT-HL-END", 2, 0, false);
            declareFunction("visit_defstruct_object_hl_end_method", "VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD", 2, 0, false);
            declareFunction("sxhash_hl_end_method", "SXHASH-HL-END-METHOD", 1, 0, false);
            new sbhl_time_utilities.$sxhash_hl_end_method$UnaryFunction();
            declareFunction("print_hl_endpoint", "PRINT-HL-ENDPOINT", 3, 0, false);
            declareFunction("new_hl_start", "NEW-HL-START", 1, 0, false);
            declareFunction("new_hl_end", "NEW-HL-END", 1, 0, false);
            declareFunction("hl_endpoint_p", "HL-ENDPOINT-P", 1, 0, false);
            declareFunction("sbhl_time_node_object_p", "SBHL-TIME-NODE-OBJECT-P", 1, 0, false);
            declareFunction("hl_interval_of_endpoint", "HL-INTERVAL-OF-ENDPOINT", 1, 0, false);
            declareFunction("find_hl_start", "FIND-HL-START", 1, 0, false);
            declareFunction("find_hl_end", "FIND-HL-END", 1, 0, false);
            declareFunction("remove_hl_start", "REMOVE-HL-START", 1, 1, false);
            declareFunction("remove_hl_end", "REMOVE-HL-END", 1, 1, false);
            declareFunction("remove_hl_endpoint", "REMOVE-HL-ENDPOINT", 1, 0, false);
            declareFunction("remove_hl_endpoint_backpointers", "REMOVE-HL-ENDPOINT-BACKPOINTERS", 1, 0, false);
            declareFunction("time_stored_in_hl_p", "TIME-STORED-IN-HL-P", 1, 0, false);
            declareFunction("hl_start", "HL-START", 1, 0, false);
            declareFunction("hl_end", "HL-END", 1, 0, false);
            declareFunction("hl_date_predecessor_of_start", "HL-DATE-PREDECESSOR-OF-START", 1, 0, false);
            declareFunction("hl_date_successor_of_end", "HL-DATE-SUCCESSOR-OF-END", 1, 0, false);
            declareFunction("sbhl_time_arg_p", "SBHL-TIME-ARG-P", 1, 0, false);
            declareFunction("sbhl_time_inference_arg_p", "SBHL-TIME-INFERENCE-ARG-P", 1, 0, false);
            declareFunction("sbhl_time_inference_args", "SBHL-TIME-INFERENCE-ARGS", 1, 0, false);
            declareFunction("sbhl_temporal_node_p", "SBHL-TEMPORAL-NODE-P", 1, 0, false);
            declareFunction("temporal_link_disjunction_term_p", "TEMPORAL-LINK-DISJUNCTION-TERM-P", 1, 0, false);
            declareFunction("sbhl_temporality_term_p", "SBHL-TEMPORALITY-TERM-P", 1, 0, false);
            declareFunction("valid_sbhl_time_literal_argsP", "VALID-SBHL-TIME-LITERAL-ARGS?", 3, 0, false);
            declareFunction("sbhl_node_passes_temporality_all_accesses_filtersP", "SBHL-NODE-PASSES-TEMPORALITY-ALL-ACCESSES-FILTERS?", 1, 0, false);
            declareFunction("point_args", "POINT-ARGS", 1, 0, false);
            declareFunction("sbhl_temporal_point_nartP", "SBHL-TEMPORAL-POINT-NART?", 1, 0, false);
            declareFunction("quasi_hl_start", "QUASI-HL-START", 1, 0, false);
            declareFunction("quasi_hl_earliest_start", "QUASI-HL-EARLIEST-START", 1, 0, false);
            declareFunction("quasi_hl_latest_start", "QUASI-HL-LATEST-START", 1, 0, false);
            declareFunction("quasi_hl_end", "QUASI-HL-END", 1, 0, false);
            declareFunction("quasi_hl_latest_end", "QUASI-HL-LATEST-END", 1, 0, false);
            declareFunction("quasi_hl_earliest_end", "QUASI-HL-EARLIEST-END", 1, 0, false);
            declareFunction("sbhl_time_predicate_p", "SBHL-TIME-PREDICATE-P", 1, 0, false);
            new sbhl_time_utilities.$sbhl_time_predicate_p$UnaryFunction();
            declareFunction("sbhl_time_predicate_with_no_spec_pred_or_inverseP", "SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?", 1, 0, false);
            declareFunction("conjunctive_temporal_relation_predP", "CONJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
            declareFunction("disjunctive_temporal_relation_predP", "DISJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
            declareFunction("earliest_start_arg", "EARLIEST-START-ARG", 1, 0, false);
            declareFunction("latest_start_arg", "LATEST-START-ARG", 1, 0, false);
            declareFunction("start_arg", "START-ARG", 1, 0, false);
            declareFunction("earliest_end_arg", "EARLIEST-END-ARG", 1, 0, false);
            declareFunction("latest_end_arg", "LATEST-END-ARG", 1, 0, false);
            declareFunction("end_arg", "END-ARG", 1, 0, false);
            declareFunction("hl_date_point_p", "HL-DATE-POINT-P", 1, 0, false);
            declareFunction("date_interval_nat_p", "DATE-INTERVAL-NAT-P", 1, 0, false);
            declareFunction("time_interval_nat_with_possibly_reducible_start_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-START-P", 1, 0, false);
            declareFunction("time_interval_nat_with_possibly_reducible_end_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-END-P", 1, 0, false);
            declareFunction("sbhl_time_el_date_p", "SBHL-TIME-EL-DATE-P", 1, 0, false);
            declareFunction("sbhl_time_el_date_p_recursive", "SBHL-TIME-EL-DATE-P-RECURSIVE", 2, 0, false);
            declareFunction("sbhl_weak_graph_busted_forts", "SBHL-WEAK-GRAPH-BUSTED-FORTS", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("remove_hl_start", "REMOVE-HL-START", 1, 0, false);
            declareFunction("remove_hl_end", "REMOVE-HL-END", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sbhl_time_utilities_file_Previous() {
        declareFunction("initialize_time_kb_feature", "INITIALIZE-TIME-KB-FEATURE", 0, 0, false);
        declareFunction("initialize_hl_endpoint_tables", "INITIALIZE-HL-ENDPOINT-TABLES", 0, 0, false);
        declareFunction("hl_start_print_function_trampoline", "HL-START-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hl_start_p", "HL-START-P", 1, 0, false);
        new sbhl_time_utilities.$hl_start_p$UnaryFunction();
        declareFunction("hl_start_interval", "HL-START-INTERVAL", 1, 0, false);
        declareFunction("_csetf_hl_start_interval", "_CSETF-HL-START-INTERVAL", 2, 0, false);
        declareFunction("make_hl_start", "MAKE-HL-START", 0, 1, false);
        declareFunction("visit_defstruct_hl_start", "VISIT-DEFSTRUCT-HL-START", 2, 0, false);
        declareFunction("visit_defstruct_object_hl_start_method", "VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD", 2, 0, false);
        declareFunction("sxhash_hl_start_method", "SXHASH-HL-START-METHOD", 1, 0, false);
        new sbhl_time_utilities.$sxhash_hl_start_method$UnaryFunction();
        declareFunction("hl_end_print_function_trampoline", "HL-END-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hl_end_p", "HL-END-P", 1, 0, false);
        new sbhl_time_utilities.$hl_end_p$UnaryFunction();
        declareFunction("hl_end_interval", "HL-END-INTERVAL", 1, 0, false);
        declareFunction("_csetf_hl_end_interval", "_CSETF-HL-END-INTERVAL", 2, 0, false);
        declareFunction("make_hl_end", "MAKE-HL-END", 0, 1, false);
        declareFunction("visit_defstruct_hl_end", "VISIT-DEFSTRUCT-HL-END", 2, 0, false);
        declareFunction("visit_defstruct_object_hl_end_method", "VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD", 2, 0, false);
        declareFunction("sxhash_hl_end_method", "SXHASH-HL-END-METHOD", 1, 0, false);
        new sbhl_time_utilities.$sxhash_hl_end_method$UnaryFunction();
        declareFunction("print_hl_endpoint", "PRINT-HL-ENDPOINT", 3, 0, false);
        declareFunction("new_hl_start", "NEW-HL-START", 1, 0, false);
        declareFunction("new_hl_end", "NEW-HL-END", 1, 0, false);
        declareFunction("hl_endpoint_p", "HL-ENDPOINT-P", 1, 0, false);
        declareFunction("sbhl_time_node_object_p", "SBHL-TIME-NODE-OBJECT-P", 1, 0, false);
        declareFunction("hl_interval_of_endpoint", "HL-INTERVAL-OF-ENDPOINT", 1, 0, false);
        declareFunction("find_hl_start", "FIND-HL-START", 1, 0, false);
        declareFunction("find_hl_end", "FIND-HL-END", 1, 0, false);
        declareFunction("remove_hl_start", "REMOVE-HL-START", 1, 1, false);
        declareFunction("remove_hl_end", "REMOVE-HL-END", 1, 1, false);
        declareFunction("remove_hl_endpoint", "REMOVE-HL-ENDPOINT", 1, 0, false);
        declareFunction("remove_hl_endpoint_backpointers", "REMOVE-HL-ENDPOINT-BACKPOINTERS", 1, 0, false);
        declareFunction("time_stored_in_hl_p", "TIME-STORED-IN-HL-P", 1, 0, false);
        declareFunction("hl_start", "HL-START", 1, 0, false);
        declareFunction("hl_end", "HL-END", 1, 0, false);
        declareFunction("hl_date_predecessor_of_start", "HL-DATE-PREDECESSOR-OF-START", 1, 0, false);
        declareFunction("hl_date_successor_of_end", "HL-DATE-SUCCESSOR-OF-END", 1, 0, false);
        declareFunction("sbhl_time_arg_p", "SBHL-TIME-ARG-P", 1, 0, false);
        declareFunction("sbhl_time_inference_arg_p", "SBHL-TIME-INFERENCE-ARG-P", 1, 0, false);
        declareFunction("sbhl_time_inference_args", "SBHL-TIME-INFERENCE-ARGS", 1, 0, false);
        declareFunction("sbhl_temporal_node_p", "SBHL-TEMPORAL-NODE-P", 1, 0, false);
        declareFunction("temporal_link_disjunction_term_p", "TEMPORAL-LINK-DISJUNCTION-TERM-P", 1, 0, false);
        declareFunction("sbhl_temporality_term_p", "SBHL-TEMPORALITY-TERM-P", 1, 0, false);
        declareFunction("valid_sbhl_time_literal_argsP", "VALID-SBHL-TIME-LITERAL-ARGS?", 3, 0, false);
        declareFunction("sbhl_node_passes_temporality_all_accesses_filtersP", "SBHL-NODE-PASSES-TEMPORALITY-ALL-ACCESSES-FILTERS?", 1, 0, false);
        declareFunction("point_args", "POINT-ARGS", 1, 0, false);
        declareFunction("sbhl_temporal_point_nartP", "SBHL-TEMPORAL-POINT-NART?", 1, 0, false);
        declareFunction("quasi_hl_start", "QUASI-HL-START", 1, 0, false);
        declareFunction("quasi_hl_earliest_start", "QUASI-HL-EARLIEST-START", 1, 0, false);
        declareFunction("quasi_hl_latest_start", "QUASI-HL-LATEST-START", 1, 0, false);
        declareFunction("quasi_hl_end", "QUASI-HL-END", 1, 0, false);
        declareFunction("quasi_hl_latest_end", "QUASI-HL-LATEST-END", 1, 0, false);
        declareFunction("quasi_hl_earliest_end", "QUASI-HL-EARLIEST-END", 1, 0, false);
        declareFunction("sbhl_time_predicate_p", "SBHL-TIME-PREDICATE-P", 1, 0, false);
        new sbhl_time_utilities.$sbhl_time_predicate_p$UnaryFunction();
        declareFunction("sbhl_time_predicate_with_no_spec_pred_or_inverseP", "SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        declareFunction("conjunctive_temporal_relation_predP", "CONJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        declareFunction("disjunctive_temporal_relation_predP", "DISJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        declareFunction("earliest_start_arg", "EARLIEST-START-ARG", 1, 0, false);
        declareFunction("latest_start_arg", "LATEST-START-ARG", 1, 0, false);
        declareFunction("start_arg", "START-ARG", 1, 0, false);
        declareFunction("earliest_end_arg", "EARLIEST-END-ARG", 1, 0, false);
        declareFunction("latest_end_arg", "LATEST-END-ARG", 1, 0, false);
        declareFunction("end_arg", "END-ARG", 1, 0, false);
        declareFunction("hl_date_point_p", "HL-DATE-POINT-P", 1, 0, false);
        declareFunction("date_interval_nat_p", "DATE-INTERVAL-NAT-P", 1, 0, false);
        declareFunction("time_interval_nat_with_possibly_reducible_start_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-START-P", 1, 0, false);
        declareFunction("time_interval_nat_with_possibly_reducible_end_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-END-P", 1, 0, false);
        declareFunction("sbhl_time_el_date_p", "SBHL-TIME-EL-DATE-P", 1, 0, false);
        declareFunction("sbhl_time_el_date_p_recursive", "SBHL-TIME-EL-DATE-P-RECURSIVE", 2, 0, false);
        declareFunction("sbhl_weak_graph_busted_forts", "SBHL-WEAK-GRAPH-BUSTED-FORTS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_sbhl_time_utilities_file_alt() {
        deflexical("*TIME-CORE-CONSTANTS*", $list_alt0);
        deflexical("*HL-START-TABLE-LOCK*", NIL != boundp($hl_start_table_lock$) ? ((SubLObject) ($hl_start_table_lock$.getGlobalValue())) : make_lock($str_alt3$_hl_start_table_lock_));
        deflexical("*HL-START-TABLE*", NIL != boundp($hl_start_table$) ? ((SubLObject) ($hl_start_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*HL-END-TABLE-LOCK*", NIL != boundp($hl_end_table_lock$) ? ((SubLObject) ($hl_end_table_lock$.getGlobalValue())) : make_lock($str_alt7$_hl_end_table_lock_));
        deflexical("*HL-END-TABLE*", NIL != boundp($hl_end_table$) ? ((SubLObject) ($hl_end_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        defconstant("*DTP-HL-START*", HL_START);
        defconstant("*DTP-HL-END*", HL_END);
        return NIL;
    }

    public static SubLObject init_sbhl_time_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TIME-CORE-CONSTANTS*", sbhl_time_utilities.$list0);
            deflexical("*HL-START-TABLE-LOCK*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_start_table_lock$, sbhl_time_utilities.$hl_start_table_lock$, () -> make_lock(sbhl_time_utilities.$str3$_hl_start_table_lock_)));
            deflexical("*HL-START-TABLE*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_start_table$, sbhl_time_utilities.$hl_start_table$, () -> make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*HL-END-TABLE-LOCK*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_end_table_lock$, sbhl_time_utilities.$hl_end_table_lock$, () -> make_lock(sbhl_time_utilities.$str7$_hl_end_table_lock_)));
            deflexical("*HL-END-TABLE*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_end_table$, sbhl_time_utilities.$hl_end_table$, () -> make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED)));
            defconstant("*DTP-HL-START*", sbhl_time_utilities.HL_START);
            defconstant("*DTP-HL-END*", sbhl_time_utilities.HL_END);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*HL-START-TABLE-LOCK*", NIL != boundp($hl_start_table_lock$) ? ((SubLObject) ($hl_start_table_lock$.getGlobalValue())) : make_lock($str_alt3$_hl_start_table_lock_));
            deflexical("*HL-START-TABLE*", NIL != boundp($hl_start_table$) ? ((SubLObject) ($hl_start_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*HL-END-TABLE-LOCK*", NIL != boundp($hl_end_table_lock$) ? ((SubLObject) ($hl_end_table_lock$.getGlobalValue())) : make_lock($str_alt7$_hl_end_table_lock_));
            deflexical("*HL-END-TABLE*", NIL != boundp($hl_end_table$) ? ((SubLObject) ($hl_end_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_sbhl_time_utilities_file_Previous() {
        deflexical("*TIME-CORE-CONSTANTS*", sbhl_time_utilities.$list0);
        deflexical("*HL-START-TABLE-LOCK*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_start_table_lock$, sbhl_time_utilities.$hl_start_table_lock$, () -> make_lock(sbhl_time_utilities.$str3$_hl_start_table_lock_)));
        deflexical("*HL-START-TABLE*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_start_table$, sbhl_time_utilities.$hl_start_table$, () -> make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*HL-END-TABLE-LOCK*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_end_table_lock$, sbhl_time_utilities.$hl_end_table_lock$, () -> make_lock(sbhl_time_utilities.$str7$_hl_end_table_lock_)));
        deflexical("*HL-END-TABLE*", SubLTrampolineFile.maybeDefault(sbhl_time_utilities.$hl_end_table$, sbhl_time_utilities.$hl_end_table$, () -> make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED)));
        defconstant("*DTP-HL-START*", sbhl_time_utilities.HL_START);
        defconstant("*DTP-HL-END*", sbhl_time_utilities.HL_END);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("weak-HL-TimePrecedence"), reader_make_constant_shell("strict-HL-TimePrecedence"), reader_make_constant_shell("successorStrict-HL-TimePrecedence"), reader_make_constant_shell("weakSuccessor-HL-TimePrecedence"));

    public static SubLObject setup_sbhl_time_utilities_file() {
        declare_defglobal(sbhl_time_utilities.$hl_start_table_lock$);
        declare_defglobal(sbhl_time_utilities.$hl_start_table$);
        declare_defglobal(sbhl_time_utilities.$hl_end_table_lock$);
        declare_defglobal(sbhl_time_utilities.$hl_end_table$);
        register_method($print_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), symbol_function(sbhl_time_utilities.HL_START_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_time_utilities.$list17);
        def_csetf(sbhl_time_utilities.HL_START_INTERVAL, sbhl_time_utilities._CSETF_HL_START_INTERVAL);
        identity(sbhl_time_utilities.HL_START);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), symbol_function(sbhl_time_utilities.VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), symbol_function(sbhl_time_utilities.SXHASH_HL_START_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), symbol_function(sbhl_time_utilities.HL_END_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_time_utilities.$list33);
        def_csetf(sbhl_time_utilities.HL_END_INTERVAL, sbhl_time_utilities._CSETF_HL_END_INTERVAL);
        identity(sbhl_time_utilities.HL_END);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), symbol_function(sbhl_time_utilities.VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), symbol_function(sbhl_time_utilities.SXHASH_HL_END_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt3$_hl_start_table_lock_ = makeString("*hl-start-table-lock*");

    static private final SubLString $str_alt7$_hl_end_table_lock_ = makeString("*hl-end-table-lock*");

    static private final SubLList $list_alt11 = list(makeSymbol("INTERVAL"));

    static private final SubLList $list_alt12 = list(makeKeyword("INTERVAL"));

    static private final SubLList $list_alt13 = list(makeSymbol("HL-START-INTERVAL"));

    static private final SubLList $list_alt14 = list(makeSymbol("_CSETF-HL-START-INTERVAL"));

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void declareFunctions() {
        sbhl_time_utilities.declare_sbhl_time_utilities_file();
    }

    @Override
    public void initializeVariables() {
        sbhl_time_utilities.init_sbhl_time_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        sbhl_time_utilities.setup_sbhl_time_utilities_file();
    }

    static private final SubLList $list_alt24 = list(makeSymbol("HL-END-INTERVAL"));

    static {
    }

    static private final SubLList $list_alt25 = list(makeSymbol("_CSETF-HL-END-INTERVAL"));

    static private final SubLString $str_alt30$__ = makeString("#<");

    static private final SubLString $str_alt32$_a = makeString("~a");

    static private final SubLString $str_alt34$_a_is_not_a_valid_endpoint_p_ = makeString("~a is not a valid endpoint-p.");

    static private final SubLList $list_alt36 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    public static final class $hl_start_p$UnaryFunction extends UnaryFunction {
        public $hl_start_p$UnaryFunction() {
            super(extractFunctionNamed("HL-START-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.hl_start_p(arg1);
        }
    }

    public static final class $sxhash_hl_start_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_start_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-HL-START-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.sxhash_hl_start_method(arg1);
        }
    }

    static private final SubLList $list_alt50 = list(reader_make_constant_shell("TimeIntervalInclusiveFn"), reader_make_constant_shell("StartFn"), reader_make_constant_shell("EndFn"), reader_make_constant_shell("IntervalEndedByFn"), reader_make_constant_shell("IntervalStartedByFn-Inclusive"), reader_make_constant_shell("IntervalEndedByFn-Inclusive"));

    public static final class $hl_end_p$UnaryFunction extends UnaryFunction {
        public $hl_end_p$UnaryFunction() {
            super(extractFunctionNamed("HL-END-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.hl_end_p(arg1);
        }
    }

    static private final SubLList $list_alt51 = list(reader_make_constant_shell("TimeIntervalInclusiveFn"), reader_make_constant_shell("StartFn"), reader_make_constant_shell("EndFn"), reader_make_constant_shell("IntervalStartedByFn"), reader_make_constant_shell("IntervalStartedByFn-Inclusive"), reader_make_constant_shell("IntervalEndedByFn-Inclusive"));

    public static final class $sxhash_hl_end_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_end_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-HL-END-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.sxhash_hl_end_method(arg1);
        }
    }

    public static final class $sbhl_time_predicate_p$UnaryFunction extends UnaryFunction {
        public $sbhl_time_predicate_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-TIME-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.sbhl_time_predicate_p(arg1);
        }
    }
}

/**
 * Total time: 248 ms
 */
