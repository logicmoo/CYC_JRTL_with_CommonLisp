/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INTEGER-SEQUENCE-GENERATOR
 * source file: /cyc/top/cycl/integer-sequence-generator.lisp
 * created:     2019/07/03 17:37:13
 */
public final class integer_sequence_generator extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $integer_sequence_generator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$lock;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$current;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$start;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$limit;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$delta;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$current = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$start = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$limit = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.this.$delta = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $current = Lisp.NIL;

        public SubLObject $start = Lisp.NIL;

        public SubLObject $limit = Lisp.NIL;

        public SubLObject $delta = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.class, INTEGER_SEQUENCE_GENERATOR, INTEGER_SEQUENCE_GENERATOR_P, $list_alt2, $list_alt3, new String[]{ "$lock", "$current", "$start", "$limit", "$delta" }, $list_alt4, $list_alt5, PRINT_INTEGER_SEQUENCE_GENERATOR);
    }

    public static final SubLFile me = new integer_sequence_generator();

 public static final String myName = "com.cyc.cycjava.cycl.integer_sequence_generator";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_integer_sequence_generator$ = makeSymbol("*DTP-INTEGER-SEQUENCE-GENERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_wide_opcode_isg$ = makeSymbol("*CFASL-WIDE-OPCODE-ISG*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR = makeSymbol("INTEGER-SEQUENCE-GENERATOR");

    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");

    static private final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("CURRENT"), makeSymbol("START"), makeSymbol("LIMIT"), makeSymbol("DELTA"));

    static private final SubLList $list3 = list($LOCK, makeKeyword("CURRENT"), makeKeyword("START"), makeKeyword("LIMIT"), makeKeyword("DELTA"));

    static private final SubLList $list4 = list(makeSymbol("ISG-LOCK"), makeSymbol("ISG-CURRENT"), makeSymbol("ISG-START"), makeSymbol("ISG-LIMIT"), makeSymbol("ISG-DELTA"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-ISG-LOCK"), makeSymbol("_CSETF-ISG-CURRENT"), makeSymbol("_CSETF-ISG-START"), makeSymbol("_CSETF-ISG-LIMIT"), makeSymbol("_CSETF-ISG-DELTA"));

    private static final SubLSymbol PRINT_INTEGER_SEQUENCE_GENERATOR = makeSymbol("PRINT-INTEGER-SEQUENCE-GENERATOR");

    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLObject integer_sequence_generator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_integer_sequence_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject integer_sequence_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_integer_sequence_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject integer_sequence_generator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject integer_sequence_generator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native.class ? T : NIL;
    }

    public static final SubLObject isg_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject isg_lock(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject isg_current_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject isg_current(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject isg_start_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject isg_start(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject isg_limit_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.getField5();
    }

    public static SubLObject isg_limit(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject isg_delta_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.getField6();
    }

    public static SubLObject isg_delta(final SubLObject v_object) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_isg_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_isg_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_isg_current_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_isg_current(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_isg_start_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_isg_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_isg_limit_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_isg_limit(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_isg_delta_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTEGER_SEQUENCE_GENERATOR_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_isg_delta(final SubLObject v_object, final SubLObject value) {
        assert NIL != integer_sequence_generator_p(v_object) : "! integer_sequence_generator.integer_sequence_generator_p(v_object) " + "integer_sequence_generator.integer_sequence_generator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_integer_sequence_generator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_isg_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CURRENT)) {
                            _csetf_isg_current(v_new, current_value);
                        } else {
                            if (pcase_var.eql($START)) {
                                _csetf_isg_start(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LIMIT)) {
                                    _csetf_isg_limit(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DELTA)) {
                                        _csetf_isg_delta(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_integer_sequence_generator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.integer_sequence_generator.$integer_sequence_generator_native();
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

    public static final SubLObject print_integer_sequence_generator_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject start = isg_start(v_object);
            SubLObject current = isg_current(v_object);
            SubLObject limit = isg_limit(v_object);
            SubLObject delta = isg_delta(v_object);
            format(stream, $str_alt24$__ISG_From__A, start);
            if (NIL != limit) {
                format(stream, $str_alt25$_to__A, limit);
            }
            format(stream, $str_alt26$_by__A, delta);
            format(stream, $str_alt27$_at__A_, current);
        }
        return v_object;
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

    /**
     *
     *
     * @unknown This method is for the use by the deserializer only.
     */
    @LispMethod(comment = "@unknown This method is for the use by the deserializer only.")
    public static final SubLObject fast_forward_isg_alt(SubLObject isg, SubLObject current) {
        SubLTrampolineFile.checkType(isg, INTEGER_SEQUENCE_GENERATOR_P);
        {
            SubLObject lock = isg_lock(isg);
            SubLObject lock_1 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_1);
                _csetf_isg_current(isg, current);
            } finally {
                if (NIL != release) {
                    release_lock(lock_1);
                }
            }
        }
        return isg;
    }

    /**
     *
     *
     * @unknown This method is for the use by the deserializer only.
     */
    @LispMethod(comment = "@unknown This method is for the use by the deserializer only.")
    public static SubLObject fast_forward_isg(final SubLObject isg, final SubLObject current) {
        assert NIL != integer_sequence_generator_p(isg) : "! integer_sequence_generator.integer_sequence_generator_p(isg) " + ("integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) ") + isg;
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

    /**
     * Create an Integer Sequence Generator to range from START to LIMIT in DELTA increments.
     * If LIMIT is NIL, it means there is no limit enforced.
     */
    @LispMethod(comment = "Create an Integer Sequence Generator to range from START to LIMIT in DELTA increments.\r\nIf LIMIT is NIL, it means there is no limit enforced.\nCreate an Integer Sequence Generator to range from START to LIMIT in DELTA increments.\nIf LIMIT is NIL, it means there is no limit enforced.")
    public static final SubLObject new_integer_sequence_generator_alt(SubLObject start, SubLObject limit, SubLObject delta) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(start, INTEGERP);
            SubLTrampolineFile.checkType(delta, INTEGERP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (delta.isZero()) {
                    Errors.error($$$DELTA_must_not_be_zero);
                }
            }
            if (NIL != limit) {
                SubLTrampolineFile.checkType(limit, INTEGERP);
            }
            {
                SubLObject isg = make_integer_sequence_generator(UNPROVIDED);
                SubLObject lock = make_lock($$$ISG);
                _csetf_isg_lock(isg, lock);
                _csetf_isg_start(isg, start);
                _csetf_isg_limit(isg, limit);
                _csetf_isg_delta(isg, delta);
                return integer_sequence_generator_reset(isg);
            }
        }
    }

    /**
     * Create an Integer Sequence Generator to range from START to LIMIT in DELTA increments.
     * If LIMIT is NIL, it means there is no limit enforced.
     */
    @LispMethod(comment = "Create an Integer Sequence Generator to range from START to LIMIT in DELTA increments.\r\nIf LIMIT is NIL, it means there is no limit enforced.\nCreate an Integer Sequence Generator to range from START to LIMIT in DELTA increments.\nIf LIMIT is NIL, it means there is no limit enforced.")
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
        assert NIL != integerp(start) : "! integerp(start) " + ("Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) ") + start;
        assert NIL != integerp(delta) : "! integerp(delta) " + ("Types.integerp(delta) " + "CommonSymbols.NIL != Types.integerp(delta) ") + delta;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && delta.isZero()) {
            Errors.error($$$DELTA_must_not_be_zero);
        }
        if (((NIL != limit) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(limit))) {
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

    /**
     * Reset an Integer Sequence Generator to its original state.
     */
    @LispMethod(comment = "Reset an Integer Sequence Generator to its original state.")
    public static final SubLObject integer_sequence_generator_reset_alt(SubLObject isg) {
        SubLTrampolineFile.checkType(isg, INTEGER_SEQUENCE_GENERATOR_P);
        {
            SubLObject lock = isg_lock(isg);
            SubLObject lock_2 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_2);
                _csetf_isg_current(isg, isg_start(isg));
            } finally {
                if (NIL != release) {
                    release_lock(lock_2);
                }
            }
        }
        return isg;
    }

    /**
     * Reset an Integer Sequence Generator to its original state.
     */
    @LispMethod(comment = "Reset an Integer Sequence Generator to its original state.")
    public static SubLObject integer_sequence_generator_reset(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "! integer_sequence_generator.integer_sequence_generator_p(isg) " + ("integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) ") + isg;
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

    /**
     * Return the next integer in the sequence from ISG.
     */
    @LispMethod(comment = "Return the next integer in the sequence from ISG.")
    public static final SubLObject integer_sequence_generator_next_alt(SubLObject isg) {
        SubLTrampolineFile.checkType(isg, INTEGER_SEQUENCE_GENERATOR_P);
        {
            SubLObject lock = isg_lock(isg);
            SubLObject current = NIL;
            SubLObject lock_3 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_3);
                {
                    SubLObject limit = isg_limit(isg);
                    SubLObject delta = isg_delta(isg);
                    current = isg_current(isg);
                    if (NIL != limit) {
                        if (NIL != (delta.isNegative() ? ((SubLObject) (numLE(current, limit))) : numGE(current, limit))) {
                            current = NIL;
                        }
                    }
                    if (NIL != current) {
                        _csetf_isg_current(isg, add(isg_current(isg), delta));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_3);
                }
            }
            if (NIL != current) {
                return current;
            }
            Errors.error($str_alt31$Integer_Sequence_Generator__S_has, isg);
            return NIL;
        }
    }

    @LispMethod(comment = "Return the next integer in the sequence from ISG.")
    public static SubLObject integer_sequence_generator_next(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "! integer_sequence_generator.integer_sequence_generator_p(isg) " + ("integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) ") + isg;
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
        assert NIL != integer_sequence_generator_p(isg) : "! integer_sequence_generator.integer_sequence_generator_p(isg) " + ("integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) ") + isg;
        return isg_start(isg);
    }

    public static SubLObject get_integer_sequence_generator_recent(final SubLObject isg) {
        assert NIL != integer_sequence_generator_p(isg) : "! integer_sequence_generator.integer_sequence_generator_p(isg) " + ("integer_sequence_generator.integer_sequence_generator_p(isg) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) ") + isg;
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

    public static final SubLObject cfasl_output_object_integer_sequence_generator_method_alt(SubLObject v_object, SubLObject stream) {
        cfasl_wide_output_isg(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_output_object_integer_sequence_generator_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_isg(v_object, stream);
        return v_object;
    }

    public static final SubLObject cfasl_wide_output_isg_alt(SubLObject isg, SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_isg$.getGlobalValue(), stream);
        cfasl_output_isg_internal(isg, stream);
        return isg;
    }

    public static SubLObject cfasl_wide_output_isg(final SubLObject isg, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_isg$.getGlobalValue(), stream);
        cfasl_output_isg_internal(isg, stream);
        return isg;
    }

    public static final SubLObject cfasl_output_isg_internal_alt(SubLObject isg, SubLObject stream) {
        {
            SubLObject lock = isg_lock(isg);
            SubLObject current = NIL;
            SubLObject start = NIL;
            SubLObject delta = NIL;
            SubLObject limit = NIL;
            SubLObject lock_4 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_4);
                current = isg_current(isg);
                start = isg_start(isg);
                limit = isg_limit(isg);
                delta = isg_delta(isg);
            } finally {
                if (NIL != release) {
                    release_lock(lock_4);
                }
            }
            cfasl_output(current, stream);
            cfasl_output(start, stream);
            cfasl_output(limit, stream);
            cfasl_output(delta, stream);
        }
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

    public static final SubLObject cfasl_input_isg_alt(SubLObject stream) {
        {
            SubLObject current = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject start = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject limit = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject delta = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject isg = new_integer_sequence_generator(start, limit, delta);
            return fast_forward_isg(isg, current);
        }
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
        declareFunction("integer_sequence_generator_print_function_trampoline", "INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("integer_sequence_generator_p", "INTEGER-SEQUENCE-GENERATOR-P", 1, 0, false);
        new integer_sequence_generator.$integer_sequence_generator_p$UnaryFunction();
        declareFunction("isg_lock", "ISG-LOCK", 1, 0, false);
        declareFunction("isg_current", "ISG-CURRENT", 1, 0, false);
        declareFunction("isg_start", "ISG-START", 1, 0, false);
        declareFunction("isg_limit", "ISG-LIMIT", 1, 0, false);
        declareFunction("isg_delta", "ISG-DELTA", 1, 0, false);
        declareFunction("_csetf_isg_lock", "_CSETF-ISG-LOCK", 2, 0, false);
        declareFunction("_csetf_isg_current", "_CSETF-ISG-CURRENT", 2, 0, false);
        declareFunction("_csetf_isg_start", "_CSETF-ISG-START", 2, 0, false);
        declareFunction("_csetf_isg_limit", "_CSETF-ISG-LIMIT", 2, 0, false);
        declareFunction("_csetf_isg_delta", "_CSETF-ISG-DELTA", 2, 0, false);
        declareFunction("make_integer_sequence_generator", "MAKE-INTEGER-SEQUENCE-GENERATOR", 0, 1, false);
        declareFunction("visit_defstruct_integer_sequence_generator", "VISIT-DEFSTRUCT-INTEGER-SEQUENCE-GENERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_integer_sequence_generator_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
        declareFunction("print_integer_sequence_generator", "PRINT-INTEGER-SEQUENCE-GENERATOR", 3, 0, false);
        declareFunction("fast_forward_isg", "FAST-FORWARD-ISG", 2, 0, false);
        declareFunction("new_integer_sequence_generator", "NEW-INTEGER-SEQUENCE-GENERATOR", 0, 3, false);
        declareFunction("integer_sequence_generator_reset", "INTEGER-SEQUENCE-GENERATOR-RESET", 1, 0, false);
        declareFunction("integer_sequence_generator_next", "INTEGER-SEQUENCE-GENERATOR-NEXT", 1, 0, false);
        declareFunction("get_integer_sequence_generator_start", "GET-INTEGER-SEQUENCE-GENERATOR-START", 1, 0, false);
        declareFunction("get_integer_sequence_generator_recent", "GET-INTEGER-SEQUENCE-GENERATOR-RECENT", 1, 0, false);
        declareFunction("cfasl_output_object_integer_sequence_generator_method", "CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_isg", "CFASL-WIDE-OUTPUT-ISG", 2, 0, false);
        declareFunction("cfasl_output_isg_internal", "CFASL-OUTPUT-ISG-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_isg", "CFASL-INPUT-ISG", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("LOCK"), makeSymbol("CURRENT"), makeSymbol("START"), makeSymbol("LIMIT"), makeSymbol("DELTA"));

    static private final SubLList $list_alt3 = list($LOCK, makeKeyword("CURRENT"), makeKeyword("START"), makeKeyword("LIMIT"), makeKeyword("DELTA"));

    static private final SubLList $list_alt4 = list(makeSymbol("ISG-LOCK"), makeSymbol("ISG-CURRENT"), makeSymbol("ISG-START"), makeSymbol("ISG-LIMIT"), makeSymbol("ISG-DELTA"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-ISG-LOCK"), makeSymbol("_CSETF-ISG-CURRENT"), makeSymbol("_CSETF-ISG-START"), makeSymbol("_CSETF-ISG-LIMIT"), makeSymbol("_CSETF-ISG-DELTA"));

    static private final SubLString $str_alt23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt24$__ISG_From__A = makeString("#<ISG:From ~A");

    static private final SubLString $str_alt25$_to__A = makeString(" to ~A");

    static private final SubLString $str_alt26$_by__A = makeString(" by ~A");

    static private final SubLString $str_alt27$_at__A_ = makeString(" at ~A>");

    public static SubLObject init_integer_sequence_generator_file() {
        defconstant("*DTP-INTEGER-SEQUENCE-GENERATOR*", INTEGER_SEQUENCE_GENERATOR);
        defconstant("*CFASL-WIDE-OPCODE-ISG*", $int$130);
        return NIL;
    }

    static private final SubLString $str_alt31$Integer_Sequence_Generator__S_has = makeString("Integer Sequence Generator ~S has been exhausted");

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

    static {
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
