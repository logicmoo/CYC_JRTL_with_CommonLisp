package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_wide_opcode;
import static com.cyc.cycjava.cycl.cfasl.register_wide_cfasl_opcode_input_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class integer_sequence_generator extends SubLTranslatedFile {
    public static final SubLFile me = new integer_sequence_generator();

    public static final String myName = "com.cyc.cycjava.cycl.integer_sequence_generator";

    public static final String myFingerPrint = "75e0f470924e95d6caf6dd935ca8a5609c04ff0c5be17462b6189dcfcb3ae11c";

    // defconstant
    public static final SubLSymbol $dtp_integer_sequence_generator$ = makeSymbol("*DTP-INTEGER-SEQUENCE-GENERATOR*");

    // defconstant
    private static final SubLSymbol $cfasl_wide_opcode_isg$ = makeSymbol("*CFASL-WIDE-OPCODE-ISG*");

    // Internal Constants
    public static final SubLSymbol INTEGER_SEQUENCE_GENERATOR = makeSymbol("INTEGER-SEQUENCE-GENERATOR");

    public static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");

    public static final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("CURRENT"), makeSymbol("START"), makeSymbol("LIMIT"), makeSymbol("DELTA"));

    public static final SubLList $list3 = list(makeKeyword("LOCK"), makeKeyword("CURRENT"), makeKeyword("START"), makeKeyword("LIMIT"), makeKeyword("DELTA"));

    public static final SubLList $list4 = list(makeSymbol("ISG-LOCK"), makeSymbol("ISG-CURRENT"), makeSymbol("ISG-START"), makeSymbol("ISG-LIMIT"), makeSymbol("ISG-DELTA"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-ISG-LOCK"), makeSymbol("_CSETF-ISG-CURRENT"), makeSymbol("_CSETF-ISG-START"), makeSymbol("_CSETF-ISG-LIMIT"), makeSymbol("_CSETF-ISG-DELTA"));

    public static final SubLSymbol PRINT_INTEGER_SEQUENCE_GENERATOR = makeSymbol("PRINT-INTEGER-SEQUENCE-GENERATOR");

    public static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INTEGER-SEQUENCE-GENERATOR-P"));

    private static final SubLSymbol ISG_LOCK = makeSymbol("ISG-LOCK");

    private static final SubLSymbol _CSETF_ISG_LOCK = makeSymbol("_CSETF-ISG-LOCK");

    private static final SubLSymbol ISG_CURRENT = makeSymbol("ISG-CURRENT");

    private static final SubLSymbol _CSETF_ISG_CURRENT = makeSymbol("_CSETF-ISG-CURRENT");

    private static final SubLSymbol ISG_START = makeSymbol("ISG-START");

    private static final SubLSymbol _CSETF_ISG_START = makeSymbol("_CSETF-ISG-START");

    private static final SubLSymbol ISG_LIMIT = makeSymbol("ISG-LIMIT");

    private static final SubLSymbol _CSETF_ISG_LIMIT = makeSymbol("_CSETF-ISG-LIMIT");

    private static final SubLSymbol ISG_DELTA = makeSymbol("ISG-DELTA");

    private static final SubLSymbol _CSETF_ISG_DELTA = makeSymbol("_CSETF-ISG-DELTA");











    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_INTEGER_SEQUENCE_GENERATOR = makeSymbol("MAKE-INTEGER-SEQUENCE-GENERATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD");

    private static final SubLString $str30$__ISG_From__A = makeString("#<ISG:From ~A");

    private static final SubLString $str31$_to__A = makeString(" to ~A");

    private static final SubLString $str32$_by__A = makeString(" by ~A");

    private static final SubLString $str33$_at__A_ = makeString(" at ~A>");



    private static final SubLString $$$DELTA_must_not_be_zero = makeString("DELTA must not be zero");

    private static final SubLString $$$ISG = makeString("ISG");

    private static final SubLString $str37$Integer_Sequence_Generator__S_has = makeString("Integer Sequence Generator ~S has been exhausted");

    private static final SubLInteger $int$130 = makeInteger(130);

    private static final SubLSymbol CFASL_INPUT_ISG = makeSymbol("CFASL-INPUT-ISG");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD");

    public static SubLObject integer_sequence_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_integer_sequence_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject integer_sequence_generator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$integer_sequence_generator_native.class ? T : NIL;
    }

    public static SubLObject isg_lock(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject isg_current(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject isg_start(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject isg_limit(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject isg_delta(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_isg_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_isg_current(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_isg_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_isg_limit(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_isg_delta(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_integer_sequence_generator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $integer_sequence_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_isg_lock(v_new, current_value);
            } else
                if (pcase_var.eql($CURRENT)) {
                    _csetf_isg_current(v_new, current_value);
                } else
                    if (pcase_var.eql($START)) {
                        _csetf_isg_start(v_new, current_value);
                    } else
                        if (pcase_var.eql($LIMIT)) {
                            _csetf_isg_limit(v_new, current_value);
                        } else
                            if (pcase_var.eql($DELTA)) {
                                _csetf_isg_delta(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_integer_sequence_generator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INTEGER_SEQUENCE_GENERATOR, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, isg_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT, isg_current(obj));
        funcall(visitor_fn, obj, $SLOT, $START, isg_start(obj));
        funcall(visitor_fn, obj, $SLOT, $LIMIT, isg_limit(obj));
        funcall(visitor_fn, obj, $SLOT, $DELTA, isg_delta(obj));
        funcall(visitor_fn, obj, $END, MAKE_INTEGER_SEQUENCE_GENERATOR, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_integer_sequence_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_integer_sequence_generator(obj, visitor_fn);
    }

    public static SubLObject print_integer_sequence_generator(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject start = isg_start(v_object);
        final SubLObject current = isg_current(v_object);
        final SubLObject limit = isg_limit(v_object);
        final SubLObject delta = isg_delta(v_object);
        format(stream, $str30$__ISG_From__A, start);
        if (NIL != limit) {
            format(stream, $str31$_to__A, limit);
        }
        format(stream, $str32$_by__A, delta);
        format(stream, $str33$_at__A_, current);
        return v_object;
    }

    public static SubLObject fast_forward_isg(final SubLObject isg, final SubLObject current) {
        assert NIL != integer_sequence_generator_p(isg) : "integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) " + isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_isg_current(isg, current);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return isg;
    }

    public static SubLObject new_integer_sequence_generator(SubLObject start, SubLObject limit, SubLObject delta) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(start) : "Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) " + start;
        assert NIL != integerp(delta) : "Types.integerp(delta) " + "CommonSymbols.NIL != Types.integerp(delta) " + delta;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && delta.isZero()) {
            Errors.error($$$DELTA_must_not_be_zero);
        }
        if (((NIL != limit) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(limit))) {
            throw new AssertionError(limit);
        }
        final SubLObject isg = make_integer_sequence_generator(UNPROVIDED);
        final SubLObject lock = make_lock($$$ISG);
        _csetf_isg_lock(isg, lock);
        _csetf_isg_start(isg, start);
        _csetf_isg_limit(isg, limit);
        _csetf_isg_delta(isg, delta);
        return integer_sequence_generator_reset(isg);
    }

    public static SubLObject integer_sequence_generator_reset(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) " + isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_isg_current(isg, isg_start(isg));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return isg;
    }

    public static SubLObject integer_sequence_generator_next(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) " + isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject current = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject limit = isg_limit(isg);
            final SubLObject delta = isg_delta(isg);
            current = isg_current(isg);
            if ((NIL != limit) && (NIL != (delta.isNegative() ? numLE(current, limit) : numGE(current, limit)))) {
                current = NIL;
            }
            if (NIL != current) {
                _csetf_isg_current(isg, add(isg_current(isg), delta));
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        if (NIL != current) {
            return current;
        }
        Errors.error($str37$Integer_Sequence_Generator__S_has, isg);
        return NIL;
    }

    public static SubLObject get_integer_sequence_generator_start(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) " + isg;
        return isg_start(isg);
    }

    public static SubLObject get_integer_sequence_generator_recent(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) " + isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject recent = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            recent = isg_current(isg);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        if (!recent.numE(isg_start(isg))) {
            recent = subtract(recent, isg_delta(isg));
        }
        return recent;
    }

    public static SubLObject cfasl_output_object_integer_sequence_generator_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_isg(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_wide_output_isg(final SubLObject isg, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_isg$.getGlobalValue(), stream);
        cfasl_output_isg_internal(isg, stream);
        return isg;
    }

    public static SubLObject cfasl_output_isg_internal(final SubLObject isg, final SubLObject stream) {
        final SubLObject lock = isg_lock(isg);
        SubLObject current = NIL;
        SubLObject start = NIL;
        SubLObject delta = NIL;
        SubLObject limit = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            current = isg_current(isg);
            start = isg_start(isg);
            limit = isg_limit(isg);
            delta = isg_delta(isg);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        cfasl_output(current, stream);
        cfasl_output(start, stream);
        cfasl_output(limit, stream);
        cfasl_output(delta, stream);
        return isg;
    }

    public static SubLObject cfasl_input_isg(final SubLObject stream) {
        final SubLObject current = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject start = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject limit = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject delta = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject isg = new_integer_sequence_generator(start, limit, delta);
        return fast_forward_isg(isg, current);
    }

    public static SubLObject declare_integer_sequence_generator_file() {
        declareFunction(me, "integer_sequence_generator_print_function_trampoline", "INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "integer_sequence_generator_p", "INTEGER-SEQUENCE-GENERATOR-P", 1, 0, false);
        new integer_sequence_generator.$integer_sequence_generator_p$UnaryFunction();
        declareFunction(me, "isg_lock", "ISG-LOCK", 1, 0, false);
        declareFunction(me, "isg_current", "ISG-CURRENT", 1, 0, false);
        declareFunction(me, "isg_start", "ISG-START", 1, 0, false);
        declareFunction(me, "isg_limit", "ISG-LIMIT", 1, 0, false);
        declareFunction(me, "isg_delta", "ISG-DELTA", 1, 0, false);
        declareFunction(me, "_csetf_isg_lock", "_CSETF-ISG-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_isg_current", "_CSETF-ISG-CURRENT", 2, 0, false);
        declareFunction(me, "_csetf_isg_start", "_CSETF-ISG-START", 2, 0, false);
        declareFunction(me, "_csetf_isg_limit", "_CSETF-ISG-LIMIT", 2, 0, false);
        declareFunction(me, "_csetf_isg_delta", "_CSETF-ISG-DELTA", 2, 0, false);
        declareFunction(me, "make_integer_sequence_generator", "MAKE-INTEGER-SEQUENCE-GENERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_integer_sequence_generator", "VISIT-DEFSTRUCT-INTEGER-SEQUENCE-GENERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_integer_sequence_generator_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
        declareFunction(me, "print_integer_sequence_generator", "PRINT-INTEGER-SEQUENCE-GENERATOR", 3, 0, false);
        declareFunction(me, "fast_forward_isg", "FAST-FORWARD-ISG", 2, 0, false);
        declareFunction(me, "new_integer_sequence_generator", "NEW-INTEGER-SEQUENCE-GENERATOR", 0, 3, false);
        declareFunction(me, "integer_sequence_generator_reset", "INTEGER-SEQUENCE-GENERATOR-RESET", 1, 0, false);
        declareFunction(me, "integer_sequence_generator_next", "INTEGER-SEQUENCE-GENERATOR-NEXT", 1, 0, false);
        declareFunction(me, "get_integer_sequence_generator_start", "GET-INTEGER-SEQUENCE-GENERATOR-START", 1, 0, false);
        declareFunction(me, "get_integer_sequence_generator_recent", "GET-INTEGER-SEQUENCE-GENERATOR-RECENT", 1, 0, false);
        declareFunction(me, "cfasl_output_object_integer_sequence_generator_method", "CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_wide_output_isg", "CFASL-WIDE-OUTPUT-ISG", 2, 0, false);
        declareFunction(me, "cfasl_output_isg_internal", "CFASL-OUTPUT-ISG-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_input_isg", "CFASL-INPUT-ISG", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_integer_sequence_generator_file() {
        defconstant("*DTP-INTEGER-SEQUENCE-GENERATOR*", INTEGER_SEQUENCE_GENERATOR);
        defconstant("*CFASL-WIDE-OPCODE-ISG*", $int$130);
        return NIL;
    }

    public static SubLObject setup_integer_sequence_generator_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), symbol_function(INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(ISG_LOCK, _CSETF_ISG_LOCK);
        def_csetf(ISG_CURRENT, _CSETF_ISG_CURRENT);
        def_csetf(ISG_START, _CSETF_ISG_START);
        def_csetf(ISG_LIMIT, _CSETF_ISG_LIMIT);
        def_csetf(ISG_DELTA, _CSETF_ISG_DELTA);
        identity(INTEGER_SEQUENCE_GENERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD));
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_isg$.getGlobalValue(), CFASL_INPUT_ISG);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_integer_sequence_generator_file();
    }

    @Override
    public void initializeVariables() {
        init_integer_sequence_generator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_integer_sequence_generator_file();
    }

    

    public static final class $integer_sequence_generator_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $current;

        public SubLObject $start;

        public SubLObject $limit;

        public SubLObject $delta;

        private static final SubLStructDeclNative structDecl;

        private $integer_sequence_generator_native() {
            this.$lock = Lisp.NIL;
            this.$current = Lisp.NIL;
            this.$start = Lisp.NIL;
            this.$limit = Lisp.NIL;
            this.$delta = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$current;
        }

        @Override
        public SubLObject getField4() {
            return this.$start;
        }

        @Override
        public SubLObject getField5() {
            return this.$limit;
        }

        @Override
        public SubLObject getField6() {
            return this.$delta;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$current = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$start = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$limit = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$delta = value;
        }

        static {
            structDecl = makeStructDeclNative($integer_sequence_generator_native.class, INTEGER_SEQUENCE_GENERATOR, INTEGER_SEQUENCE_GENERATOR_P, $list2, $list3, new String[]{ "$lock", "$current", "$start", "$limit", "$delta" }, $list4, $list5, PRINT_INTEGER_SEQUENCE_GENERATOR);
        }
    }

    public static final class $integer_sequence_generator_p$UnaryFunction extends UnaryFunction {
        public $integer_sequence_generator_p$UnaryFunction() {
            super(extractFunctionNamed("INTEGER-SEQUENCE-GENERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return integer_sequence_generator_p(arg1);
        }
    }
}

/**
 * Total time: 91 ms synthetic
 */
