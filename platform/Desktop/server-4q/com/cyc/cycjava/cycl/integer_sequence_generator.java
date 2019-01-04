package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class integer_sequence_generator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.integer_sequence_generator";
    public static final String myFingerPrint = "75e0f470924e95d6caf6dd935ca8a5609c04ff0c5be17462b6189dcfcb3ae11c";
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLSymbol $dtp_integer_sequence_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4425L)
    private static SubLSymbol $cfasl_wide_opcode_isg$;
    private static final SubLSymbol $sym0$INTEGER_SEQUENCE_GENERATOR;
    private static final SubLSymbol $sym1$INTEGER_SEQUENCE_GENERATOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR;
    private static final SubLSymbol $sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ISG_LOCK;
    private static final SubLSymbol $sym10$_CSETF_ISG_LOCK;
    private static final SubLSymbol $sym11$ISG_CURRENT;
    private static final SubLSymbol $sym12$_CSETF_ISG_CURRENT;
    private static final SubLSymbol $sym13$ISG_START;
    private static final SubLSymbol $sym14$_CSETF_ISG_START;
    private static final SubLSymbol $sym15$ISG_LIMIT;
    private static final SubLSymbol $sym16$_CSETF_ISG_LIMIT;
    private static final SubLSymbol $sym17$ISG_DELTA;
    private static final SubLSymbol $sym18$_CSETF_ISG_DELTA;
    private static final SubLSymbol $kw19$LOCK;
    private static final SubLSymbol $kw20$CURRENT;
    private static final SubLSymbol $kw21$START;
    private static final SubLSymbol $kw22$LIMIT;
    private static final SubLSymbol $kw23$DELTA;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_INTEGER_SEQUENCE_GENERATOR;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD;
    private static final SubLString $str30$__ISG_From__A;
    private static final SubLString $str31$_to__A;
    private static final SubLString $str32$_by__A;
    private static final SubLString $str33$_at__A_;
    private static final SubLSymbol $sym34$INTEGERP;
    private static final SubLString $str35$DELTA_must_not_be_zero;
    private static final SubLString $str36$ISG;
    private static final SubLString $str37$Integer_Sequence_Generator__S_has;
    private static final SubLInteger $int38$130;
    private static final SubLSymbol $sym39$CFASL_INPUT_ISG;
    private static final SubLSymbol $sym40$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject integer_sequence_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_integer_sequence_generator(v_object, stream, (SubLObject)integer_sequence_generator.ZERO_INTEGER);
        return (SubLObject)integer_sequence_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject integer_sequence_generator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $integer_sequence_generator_native.class) ? integer_sequence_generator.T : integer_sequence_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject isg_lock(final SubLObject v_object) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject isg_current(final SubLObject v_object) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject isg_start(final SubLObject v_object) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject isg_limit(final SubLObject v_object) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject isg_delta(final SubLObject v_object) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject _csetf_isg_lock(final SubLObject v_object, final SubLObject value) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject _csetf_isg_current(final SubLObject v_object, final SubLObject value) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject _csetf_isg_start(final SubLObject v_object, final SubLObject value) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject _csetf_isg_limit(final SubLObject v_object, final SubLObject value) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject _csetf_isg_delta(final SubLObject v_object, final SubLObject value) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject make_integer_sequence_generator(SubLObject arglist) {
        if (arglist == integer_sequence_generator.UNPROVIDED) {
            arglist = (SubLObject)integer_sequence_generator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $integer_sequence_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)integer_sequence_generator.NIL, next = arglist; integer_sequence_generator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)integer_sequence_generator.$kw19$LOCK)) {
                _csetf_isg_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)integer_sequence_generator.$kw20$CURRENT)) {
                _csetf_isg_current(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)integer_sequence_generator.$kw21$START)) {
                _csetf_isg_start(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)integer_sequence_generator.$kw22$LIMIT)) {
                _csetf_isg_limit(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)integer_sequence_generator.$kw23$DELTA)) {
                _csetf_isg_delta(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)integer_sequence_generator.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject visit_defstruct_integer_sequence_generator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw25$BEGIN, (SubLObject)integer_sequence_generator.$sym26$MAKE_INTEGER_SEQUENCE_GENERATOR, (SubLObject)integer_sequence_generator.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw27$SLOT, (SubLObject)integer_sequence_generator.$kw19$LOCK, isg_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw27$SLOT, (SubLObject)integer_sequence_generator.$kw20$CURRENT, isg_current(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw27$SLOT, (SubLObject)integer_sequence_generator.$kw21$START, isg_start(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw27$SLOT, (SubLObject)integer_sequence_generator.$kw22$LIMIT, isg_limit(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw27$SLOT, (SubLObject)integer_sequence_generator.$kw23$DELTA, isg_delta(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)integer_sequence_generator.$kw28$END, (SubLObject)integer_sequence_generator.$sym26$MAKE_INTEGER_SEQUENCE_GENERATOR, (SubLObject)integer_sequence_generator.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
    public static SubLObject visit_defstruct_object_integer_sequence_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_integer_sequence_generator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1430L)
    public static SubLObject print_integer_sequence_generator(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject start = isg_start(v_object);
        final SubLObject current = isg_current(v_object);
        final SubLObject limit = isg_limit(v_object);
        final SubLObject delta = isg_delta(v_object);
        PrintLow.format(stream, (SubLObject)integer_sequence_generator.$str30$__ISG_From__A, start);
        if (integer_sequence_generator.NIL != limit) {
            PrintLow.format(stream, (SubLObject)integer_sequence_generator.$str31$_to__A, limit);
        }
        PrintLow.format(stream, (SubLObject)integer_sequence_generator.$str32$_by__A, delta);
        PrintLow.format(stream, (SubLObject)integer_sequence_generator.$str33$_at__A_, current);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1840L)
    public static SubLObject fast_forward_isg(final SubLObject isg, final SubLObject current) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(isg) : isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject release = (SubLObject)integer_sequence_generator.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_isg_current(isg, current);
        }
        finally {
            if (integer_sequence_generator.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return isg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 2114L)
    public static SubLObject new_integer_sequence_generator(SubLObject start, SubLObject limit, SubLObject delta) {
        if (start == integer_sequence_generator.UNPROVIDED) {
            start = (SubLObject)integer_sequence_generator.ZERO_INTEGER;
        }
        if (limit == integer_sequence_generator.UNPROVIDED) {
            limit = (SubLObject)integer_sequence_generator.NIL;
        }
        if (delta == integer_sequence_generator.UNPROVIDED) {
            delta = (SubLObject)integer_sequence_generator.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert integer_sequence_generator.NIL != Types.integerp(start) : start;
        assert integer_sequence_generator.NIL != Types.integerp(delta) : delta;
        if (integer_sequence_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && delta.isZero()) {
            Errors.error((SubLObject)integer_sequence_generator.$str35$DELTA_must_not_be_zero);
        }
        if (integer_sequence_generator.NIL != limit && !integer_sequence_generator.assertionsDisabledInClass && integer_sequence_generator.NIL == Types.integerp(limit)) {
            throw new AssertionError(limit);
        }
        final SubLObject isg = make_integer_sequence_generator((SubLObject)integer_sequence_generator.UNPROVIDED);
        final SubLObject lock = Locks.make_lock((SubLObject)integer_sequence_generator.$str36$ISG);
        _csetf_isg_lock(isg, lock);
        _csetf_isg_start(isg, start);
        _csetf_isg_limit(isg, limit);
        _csetf_isg_delta(isg, delta);
        return integer_sequence_generator_reset(isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 2777L)
    public static SubLObject integer_sequence_generator_reset(final SubLObject isg) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(isg) : isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject release = (SubLObject)integer_sequence_generator.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_isg_current(isg, isg_start(isg));
        }
        finally {
            if (integer_sequence_generator.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return isg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 3065L)
    public static SubLObject integer_sequence_generator_next(final SubLObject isg) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(isg) : isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject current = (SubLObject)integer_sequence_generator.NIL;
        SubLObject release = (SubLObject)integer_sequence_generator.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject limit = isg_limit(isg);
            final SubLObject delta = isg_delta(isg);
            current = isg_current(isg);
            if (integer_sequence_generator.NIL != limit && integer_sequence_generator.NIL != (delta.isNegative() ? Numbers.numLE(current, limit) : Numbers.numGE(current, limit))) {
                current = (SubLObject)integer_sequence_generator.NIL;
            }
            if (integer_sequence_generator.NIL != current) {
                _csetf_isg_current(isg, Numbers.add(isg_current(isg), delta));
            }
        }
        finally {
            if (integer_sequence_generator.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        if (integer_sequence_generator.NIL != current) {
            return current;
        }
        Errors.error((SubLObject)integer_sequence_generator.$str37$Integer_Sequence_Generator__S_has, isg);
        return (SubLObject)integer_sequence_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 3718L)
    public static SubLObject get_integer_sequence_generator_start(final SubLObject isg) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(isg) : isg;
        return isg_start(isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 3917L)
    public static SubLObject get_integer_sequence_generator_recent(final SubLObject isg) {
        assert integer_sequence_generator.NIL != integer_sequence_generator_p(isg) : isg;
        final SubLObject lock = isg_lock(isg);
        SubLObject recent = (SubLObject)integer_sequence_generator.NIL;
        SubLObject release = (SubLObject)integer_sequence_generator.NIL;
        try {
            release = Locks.seize_lock(lock);
            recent = isg_current(isg);
        }
        finally {
            if (integer_sequence_generator.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        if (!recent.numE(isg_start(isg))) {
            recent = Numbers.subtract(recent, isg_delta(isg));
        }
        return recent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4525L)
    public static SubLObject cfasl_output_object_integer_sequence_generator_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_isg(v_object, stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4664L)
    public static SubLObject cfasl_wide_output_isg(final SubLObject isg, final SubLObject stream) {
        cfasl.cfasl_output_wide_opcode(integer_sequence_generator.$cfasl_wide_opcode_isg$.getGlobalValue(), stream);
        cfasl_output_isg_internal(isg, stream);
        return isg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4831L)
    public static SubLObject cfasl_output_isg_internal(final SubLObject isg, final SubLObject stream) {
        final SubLObject lock = isg_lock(isg);
        SubLObject current = (SubLObject)integer_sequence_generator.NIL;
        SubLObject start = (SubLObject)integer_sequence_generator.NIL;
        SubLObject delta = (SubLObject)integer_sequence_generator.NIL;
        SubLObject limit = (SubLObject)integer_sequence_generator.NIL;
        SubLObject release = (SubLObject)integer_sequence_generator.NIL;
        try {
            release = Locks.seize_lock(lock);
            current = isg_current(isg);
            start = isg_start(isg);
            limit = isg_limit(isg);
            delta = isg_delta(isg);
        }
        finally {
            if (integer_sequence_generator.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        cfasl.cfasl_output(current, stream);
        cfasl.cfasl_output(start, stream);
        cfasl.cfasl_output(limit, stream);
        cfasl.cfasl_output(delta, stream);
        return isg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 5272L)
    public static SubLObject cfasl_input_isg(final SubLObject stream) {
        final SubLObject current = cfasl.cfasl_input(stream, (SubLObject)integer_sequence_generator.UNPROVIDED, (SubLObject)integer_sequence_generator.UNPROVIDED);
        final SubLObject start = cfasl.cfasl_input(stream, (SubLObject)integer_sequence_generator.UNPROVIDED, (SubLObject)integer_sequence_generator.UNPROVIDED);
        final SubLObject limit = cfasl.cfasl_input(stream, (SubLObject)integer_sequence_generator.UNPROVIDED, (SubLObject)integer_sequence_generator.UNPROVIDED);
        final SubLObject delta = cfasl.cfasl_input(stream, (SubLObject)integer_sequence_generator.UNPROVIDED, (SubLObject)integer_sequence_generator.UNPROVIDED);
        final SubLObject isg = new_integer_sequence_generator(start, limit, delta);
        return fast_forward_isg(isg, current);
    }
    
    public static SubLObject declare_integer_sequence_generator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "integer_sequence_generator_print_function_trampoline", "INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "integer_sequence_generator_p", "INTEGER-SEQUENCE-GENERATOR-P", 1, 0, false);
        new $integer_sequence_generator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "isg_lock", "ISG-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "isg_current", "ISG-CURRENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "isg_start", "ISG-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "isg_limit", "ISG-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "isg_delta", "ISG-DELTA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "_csetf_isg_lock", "_CSETF-ISG-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "_csetf_isg_current", "_CSETF-ISG-CURRENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "_csetf_isg_start", "_CSETF-ISG-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "_csetf_isg_limit", "_CSETF-ISG-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "_csetf_isg_delta", "_CSETF-ISG-DELTA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "make_integer_sequence_generator", "MAKE-INTEGER-SEQUENCE-GENERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "visit_defstruct_integer_sequence_generator", "VISIT-DEFSTRUCT-INTEGER-SEQUENCE-GENERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "visit_defstruct_object_integer_sequence_generator_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "print_integer_sequence_generator", "PRINT-INTEGER-SEQUENCE-GENERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "fast_forward_isg", "FAST-FORWARD-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "new_integer_sequence_generator", "NEW-INTEGER-SEQUENCE-GENERATOR", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "integer_sequence_generator_reset", "INTEGER-SEQUENCE-GENERATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "integer_sequence_generator_next", "INTEGER-SEQUENCE-GENERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "get_integer_sequence_generator_start", "GET-INTEGER-SEQUENCE-GENERATOR-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "get_integer_sequence_generator_recent", "GET-INTEGER-SEQUENCE-GENERATOR-RECENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "cfasl_output_object_integer_sequence_generator_method", "CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "cfasl_wide_output_isg", "CFASL-WIDE-OUTPUT-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "cfasl_output_isg_internal", "CFASL-OUTPUT-ISG-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.integer_sequence_generator", "cfasl_input_isg", "CFASL-INPUT-ISG", 1, 0, false);
        return (SubLObject)integer_sequence_generator.NIL;
    }
    
    public static SubLObject init_integer_sequence_generator_file() {
        integer_sequence_generator.$dtp_integer_sequence_generator$ = SubLFiles.defconstant("*DTP-INTEGER-SEQUENCE-GENERATOR*", (SubLObject)integer_sequence_generator.$sym0$INTEGER_SEQUENCE_GENERATOR);
        integer_sequence_generator.$cfasl_wide_opcode_isg$ = SubLFiles.defconstant("*CFASL-WIDE-OPCODE-ISG*", (SubLObject)integer_sequence_generator.$int38$130);
        return (SubLObject)integer_sequence_generator.NIL;
    }
    
    public static SubLObject setup_integer_sequence_generator_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), integer_sequence_generator.$dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)integer_sequence_generator.$sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)integer_sequence_generator.$list8);
        Structures.def_csetf((SubLObject)integer_sequence_generator.$sym9$ISG_LOCK, (SubLObject)integer_sequence_generator.$sym10$_CSETF_ISG_LOCK);
        Structures.def_csetf((SubLObject)integer_sequence_generator.$sym11$ISG_CURRENT, (SubLObject)integer_sequence_generator.$sym12$_CSETF_ISG_CURRENT);
        Structures.def_csetf((SubLObject)integer_sequence_generator.$sym13$ISG_START, (SubLObject)integer_sequence_generator.$sym14$_CSETF_ISG_START);
        Structures.def_csetf((SubLObject)integer_sequence_generator.$sym15$ISG_LIMIT, (SubLObject)integer_sequence_generator.$sym16$_CSETF_ISG_LIMIT);
        Structures.def_csetf((SubLObject)integer_sequence_generator.$sym17$ISG_DELTA, (SubLObject)integer_sequence_generator.$sym18$_CSETF_ISG_DELTA);
        Equality.identity((SubLObject)integer_sequence_generator.$sym0$INTEGER_SEQUENCE_GENERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), integer_sequence_generator.$dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)integer_sequence_generator.$sym29$VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD));
        cfasl.register_wide_cfasl_opcode_input_function(integer_sequence_generator.$cfasl_wide_opcode_isg$.getGlobalValue(), (SubLObject)integer_sequence_generator.$sym39$CFASL_INPUT_ISG);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), integer_sequence_generator.$dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function((SubLObject)integer_sequence_generator.$sym40$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD));
        return (SubLObject)integer_sequence_generator.NIL;
    }
    
    public void declareFunctions() {
        declare_integer_sequence_generator_file();
    }
    
    public void initializeVariables() {
        init_integer_sequence_generator_file();
    }
    
    public void runTopLevelForms() {
        setup_integer_sequence_generator_file();
    }
    
    static {
        me = (SubLFile)new integer_sequence_generator();
        integer_sequence_generator.$dtp_integer_sequence_generator$ = null;
        integer_sequence_generator.$cfasl_wide_opcode_isg$ = null;
        $sym0$INTEGER_SEQUENCE_GENERATOR = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR");
        $sym1$INTEGER_SEQUENCE_GENERATOR_P = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("DELTA"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT"), (SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("DELTA"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISG-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("ISG-CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("ISG-START"), (SubLObject)SubLObjectFactory.makeSymbol("ISG-LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("ISG-DELTA"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ISG-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ISG-CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ISG-START"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ISG-LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ISG-DELTA"));
        $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR = SubLObjectFactory.makeSymbol("PRINT-INTEGER-SEQUENCE-GENERATOR");
        $sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-P"));
        $sym9$ISG_LOCK = SubLObjectFactory.makeSymbol("ISG-LOCK");
        $sym10$_CSETF_ISG_LOCK = SubLObjectFactory.makeSymbol("_CSETF-ISG-LOCK");
        $sym11$ISG_CURRENT = SubLObjectFactory.makeSymbol("ISG-CURRENT");
        $sym12$_CSETF_ISG_CURRENT = SubLObjectFactory.makeSymbol("_CSETF-ISG-CURRENT");
        $sym13$ISG_START = SubLObjectFactory.makeSymbol("ISG-START");
        $sym14$_CSETF_ISG_START = SubLObjectFactory.makeSymbol("_CSETF-ISG-START");
        $sym15$ISG_LIMIT = SubLObjectFactory.makeSymbol("ISG-LIMIT");
        $sym16$_CSETF_ISG_LIMIT = SubLObjectFactory.makeSymbol("_CSETF-ISG-LIMIT");
        $sym17$ISG_DELTA = SubLObjectFactory.makeSymbol("ISG-DELTA");
        $sym18$_CSETF_ISG_DELTA = SubLObjectFactory.makeSymbol("_CSETF-ISG-DELTA");
        $kw19$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw20$CURRENT = SubLObjectFactory.makeKeyword("CURRENT");
        $kw21$START = SubLObjectFactory.makeKeyword("START");
        $kw22$LIMIT = SubLObjectFactory.makeKeyword("LIMIT");
        $kw23$DELTA = SubLObjectFactory.makeKeyword("DELTA");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_INTEGER_SEQUENCE_GENERATOR = SubLObjectFactory.makeSymbol("MAKE-INTEGER-SEQUENCE-GENERATOR");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD");
        $str30$__ISG_From__A = SubLObjectFactory.makeString("#<ISG:From ~A");
        $str31$_to__A = SubLObjectFactory.makeString(" to ~A");
        $str32$_by__A = SubLObjectFactory.makeString(" by ~A");
        $str33$_at__A_ = SubLObjectFactory.makeString(" at ~A>");
        $sym34$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str35$DELTA_must_not_be_zero = SubLObjectFactory.makeString("DELTA must not be zero");
        $str36$ISG = SubLObjectFactory.makeString("ISG");
        $str37$Integer_Sequence_Generator__S_has = SubLObjectFactory.makeString("Integer Sequence Generator ~S has been exhausted");
        $int38$130 = SubLObjectFactory.makeInteger(130);
        $sym39$CFASL_INPUT_ISG = SubLObjectFactory.makeSymbol("CFASL-INPUT-ISG");
        $sym40$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD");
    }
    
    public static final class $integer_sequence_generator_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $current;
        public SubLObject $start;
        public SubLObject $limit;
        public SubLObject $delta;
        private static final SubLStructDeclNative structDecl;
        
        public $integer_sequence_generator_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$current = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$limit = (SubLObject)CommonSymbols.NIL;
            this.$delta = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$integer_sequence_generator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$current;
        }
        
        public SubLObject getField4() {
            return this.$start;
        }
        
        public SubLObject getField5() {
            return this.$limit;
        }
        
        public SubLObject getField6() {
            return this.$delta;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$current = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$limit = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$delta = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$integer_sequence_generator_native.class, integer_sequence_generator.$sym0$INTEGER_SEQUENCE_GENERATOR, integer_sequence_generator.$sym1$INTEGER_SEQUENCE_GENERATOR_P, integer_sequence_generator.$list2, integer_sequence_generator.$list3, new String[] { "$lock", "$current", "$start", "$limit", "$delta" }, integer_sequence_generator.$list4, integer_sequence_generator.$list5, integer_sequence_generator.$sym6$PRINT_INTEGER_SEQUENCE_GENERATOR);
        }
    }
    
    public static final class $integer_sequence_generator_p$UnaryFunction extends UnaryFunction
    {
        public $integer_sequence_generator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INTEGER-SEQUENCE-GENERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return integer_sequence_generator.integer_sequence_generator_p(arg1);
        }
    }
}

/*

	Total time: 91 ms
	 synthetic 
*/