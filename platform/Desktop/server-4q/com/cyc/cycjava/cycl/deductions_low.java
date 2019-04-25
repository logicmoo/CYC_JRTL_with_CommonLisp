package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deductions_low extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.deductions_low";
    public static final String myFingerPrint = "d677bf9b954711f473d3f0d657bc3c192f74045ecfd62b74b755df6b5249ddc9";
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLSymbol $dtp_deduction_content$;
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 4447L)
    private static SubLSymbol $bug_34058_backward_compatibility_deduction_dump_support_enabledP$;
    private static final SubLSymbol $sym0$DEDUCTION_CONTENT;
    private static final SubLSymbol $sym1$DEDUCTION_CONTENT_P;
    private static final SubLInteger $int2$149;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym8$DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$D_CONTENT_TV;
    private static final SubLSymbol $sym11$_CSETF_D_CONTENT_TV;
    private static final SubLSymbol $sym12$D_CONTENT_SUPPORTED_OBJECT;
    private static final SubLSymbol $sym13$_CSETF_D_CONTENT_SUPPORTED_OBJECT;
    private static final SubLSymbol $sym14$D_CONTENT_SUPPORTS;
    private static final SubLSymbol $sym15$_CSETF_D_CONTENT_SUPPORTS;
    private static final SubLSymbol $sym16$D_CONTENT_BINDINGS;
    private static final SubLSymbol $sym17$_CSETF_D_CONTENT_BINDINGS;
    private static final SubLSymbol $sym18$D_CONTENT_PRAGMATIC_SUPPORT_MTS;
    private static final SubLSymbol $sym19$_CSETF_D_CONTENT_PRAGMATIC_SUPPORT_MTS;
    private static final SubLSymbol $kw20$TV;
    private static final SubLSymbol $kw21$SUPPORTED_OBJECT;
    private static final SubLSymbol $kw22$SUPPORTS;
    private static final SubLSymbol $kw23$BINDINGS;
    private static final SubLSymbol $kw24$PRAGMATIC_SUPPORT_MTS;
    private static final SubLString $str25$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw26$BEGIN;
    private static final SubLSymbol $sym27$MAKE_DEDUCTION_CONTENT;
    private static final SubLSymbol $kw28$SLOT;
    private static final SubLSymbol $kw29$END;
    private static final SubLSymbol $sym30$VISIT_DEFSTRUCT_OBJECT_DEDUCTION_CONTENT_METHOD;
    private static final SubLSymbol $kw31$UNKNOWN;
    private static final SubLSymbol $sym32$DEDUCTION_P;
    private static final SubLSymbol $kw33$TRUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject deduction_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)deductions_low.ZERO_INTEGER);
        return (SubLObject)deductions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject deduction_content_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $deduction_content_native.class) ? deductions_low.T : deductions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject d_content_tv(final SubLObject v_object) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject d_content_supported_object(final SubLObject v_object) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject d_content_supports(final SubLObject v_object) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject d_content_bindings(final SubLObject v_object) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject d_content_pragmatic_support_mts(final SubLObject v_object) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject _csetf_d_content_tv(final SubLObject v_object, final SubLObject value) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject _csetf_d_content_supported_object(final SubLObject v_object, final SubLObject value) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject _csetf_d_content_supports(final SubLObject v_object, final SubLObject value) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject _csetf_d_content_bindings(final SubLObject v_object, final SubLObject value) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject _csetf_d_content_pragmatic_support_mts(final SubLObject v_object, final SubLObject value) {
        assert deductions_low.NIL != deduction_content_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject make_deduction_content(SubLObject arglist) {
        if (arglist == deductions_low.UNPROVIDED) {
            arglist = (SubLObject)deductions_low.NIL;
        }
        final SubLObject v_new = (SubLObject)new $deduction_content_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)deductions_low.NIL, next = arglist; deductions_low.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)deductions_low.$kw20$TV)) {
                _csetf_d_content_tv(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)deductions_low.$kw21$SUPPORTED_OBJECT)) {
                _csetf_d_content_supported_object(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)deductions_low.$kw22$SUPPORTS)) {
                _csetf_d_content_supports(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)deductions_low.$kw23$BINDINGS)) {
                _csetf_d_content_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)deductions_low.$kw24$PRAGMATIC_SUPPORT_MTS)) {
                _csetf_d_content_pragmatic_support_mts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)deductions_low.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject visit_defstruct_deduction_content(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw26$BEGIN, (SubLObject)deductions_low.$sym27$MAKE_DEDUCTION_CONTENT, (SubLObject)deductions_low.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw28$SLOT, (SubLObject)deductions_low.$kw20$TV, d_content_tv(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw28$SLOT, (SubLObject)deductions_low.$kw21$SUPPORTED_OBJECT, d_content_supported_object(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw28$SLOT, (SubLObject)deductions_low.$kw22$SUPPORTS, d_content_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw28$SLOT, (SubLObject)deductions_low.$kw23$BINDINGS, d_content_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw28$SLOT, (SubLObject)deductions_low.$kw24$PRAGMATIC_SUPPORT_MTS, d_content_pragmatic_support_mts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deductions_low.$kw29$END, (SubLObject)deductions_low.$sym27$MAKE_DEDUCTION_CONTENT, (SubLObject)deductions_low.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1199L)
    public static SubLObject visit_defstruct_object_deduction_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_deduction_content(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 1452L)
    public static SubLObject create_deduction_content(final SubLObject id, final SubLObject supported_object, final SubLObject supports, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_low.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_low.NIL;
        }
        if (pragmatic_support_mts == deductions_low.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_low.NIL;
        }
        SubLObject deduction_content = (SubLObject)deductions_low.NIL;
        deduction_content = make_deduction_content((SubLObject)deductions_low.UNPROVIDED);
        _csetf_d_content_supported_object(deduction_content, supported_object);
        _csetf_d_content_supports(deduction_content, supports);
        _csetf_d_content_tv(deduction_content, (SubLObject)deductions_low.$kw31$UNKNOWN);
        _csetf_d_content_bindings(deduction_content, v_bindings);
        _csetf_d_content_pragmatic_support_mts(deduction_content, pragmatic_support_mts);
        deduction_manager.register_deduction_content(id, deduction_content);
        return deduction_content;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 2313L)
    public static SubLObject destroy_deduction_content(final SubLObject id) {
        final SubLObject deduction_content = deduction_manager.lookup_deduction_content(id);
        if (deductions_low.NIL != deduction_content_p(deduction_content)) {
            deduction_manager.deregister_deduction_content(id);
            _csetf_d_content_tv(deduction_content, (SubLObject)deductions_low.NIL);
            _csetf_d_content_supported_object(deduction_content, (SubLObject)deductions_low.NIL);
            _csetf_d_content_supports(deduction_content, (SubLObject)deductions_low.NIL);
            _csetf_d_content_bindings(deduction_content, (SubLObject)deductions_low.NIL);
            _csetf_d_content_pragmatic_support_mts(deduction_content, (SubLObject)deductions_low.NIL);
            return (SubLObject)deductions_low.T;
        }
        return (SubLObject)deductions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 2894L)
    public static SubLObject lookup_deduction_tv(final SubLObject id) {
        return d_content_tv(deduction_manager.lookup_deduction_content(id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3011L)
    public static SubLObject lookup_deduction_supported_object(final SubLObject id) {
        return d_content_supported_object(deduction_manager.lookup_deduction_content(id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3135L)
    public static SubLObject lookup_deduction_supports(final SubLObject id) {
        return d_content_supports(deduction_manager.lookup_deduction_content(id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3244L)
    public static SubLObject lookup_deduction_bindings(final SubLObject id) {
        return d_content_bindings(deduction_manager.lookup_deduction_content(id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3352L)
    public static SubLObject lookup_deduction_pragmatic_support_mts(final SubLObject id) {
        return d_content_pragmatic_support_mts(deduction_manager.lookup_deduction_content(id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3486L)
    public static SubLObject set_deduction_tv(final SubLObject id, final SubLObject new_tv) {
        _csetf_d_content_tv(deduction_manager.lookup_deduction_content(id), new_tv);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3657L)
    public static SubLObject set_deduction_supports(final SubLObject id, final SubLObject new_supports) {
        _csetf_d_content_supports(deduction_manager.lookup_deduction_content(id), new_supports);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 3895L)
    public static SubLObject set_deduction_bindings(final SubLObject id, final SubLObject new_supports) {
        _csetf_d_content_bindings(deduction_manager.lookup_deduction_content(id), new_supports);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 4133L)
    public static SubLObject set_deduction_pragmatic_support_mts(final SubLObject id, final SubLObject new_supports) {
        _csetf_d_content_pragmatic_support_mts(deduction_manager.lookup_deduction_content(id), new_supports);
        deduction_manager.mark_deduction_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 4694L)
    public static SubLObject dump_deduction_content(final SubLObject deduction, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_output(deduction_tv(deduction), stream);
        cfasl.cfasl_output(deductions_high.deduction_supported_object(deduction), stream);
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject v_bindings = deduction_bindings_internal(deduction);
        final SubLObject pragmatic_support_mts = deduction_pragmatic_support_mts_internal(deduction);
        if (deductions_low.NIL != deductions_low.$bug_34058_backward_compatibility_deduction_dump_support_enabledP$.getDynamicValue(thread) || (deductions_low.NIL == v_bindings && deductions_low.NIL == pragmatic_support_mts)) {
            cfasl.cfasl_output(deductions_high.deduction_supports(deduction), stream);
        }
        else {
            final SubLObject support_details_vector = Vectors.make_vector((SubLObject)deductions_low.THREE_INTEGER, (SubLObject)deductions_low.UNPROVIDED);
            Vectors.set_aref(support_details_vector, (SubLObject)deductions_low.ZERO_INTEGER, supports);
            Vectors.set_aref(support_details_vector, (SubLObject)deductions_low.ONE_INTEGER, v_bindings);
            Vectors.set_aref(support_details_vector, (SubLObject)deductions_low.TWO_INTEGER, pragmatic_support_mts);
            cfasl.cfasl_output(support_details_vector, stream);
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 6013L)
    public static SubLObject load_deduction_content(final SubLObject deduction, final SubLObject stream) {
        final SubLObject id = deduction_handles.deduction_id(deduction);
        final SubLObject tv = cfasl.cfasl_input(stream, (SubLObject)deductions_low.UNPROVIDED, (SubLObject)deductions_low.UNPROVIDED);
        final SubLObject assertion = cfasl.cfasl_input(stream, (SubLObject)deductions_low.UNPROVIDED, (SubLObject)deductions_low.UNPROVIDED);
        final SubLObject support_details = cfasl.cfasl_input(stream, (SubLObject)deductions_low.UNPROVIDED, (SubLObject)deductions_low.UNPROVIDED);
        SubLObject supports = (SubLObject)deductions_low.NIL;
        SubLObject v_bindings = (SubLObject)deductions_low.NIL;
        SubLObject pragmatic_support_mts = (SubLObject)deductions_low.NIL;
        if (support_details.isVector()) {
            supports = Vectors.aref(support_details, (SubLObject)deductions_low.ZERO_INTEGER);
            v_bindings = Vectors.aref(support_details, (SubLObject)deductions_low.ONE_INTEGER);
            pragmatic_support_mts = Vectors.aref(support_details, (SubLObject)deductions_low.TWO_INTEGER);
        }
        else {
            supports = support_details;
        }
        load_deduction_content_int(id, assertion, supports, v_bindings, pragmatic_support_mts, tv);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 6767L)
    public static SubLObject load_deduction_content_int(final SubLObject id, final SubLObject assertion, final SubLObject supports, final SubLObject v_bindings, final SubLObject pragmatic_support_mts, final SubLObject tv) {
        final SubLObject deduction_content = create_deduction_content(id, assertion, supports, v_bindings, pragmatic_support_mts);
        _csetf_d_content_tv(deduction_content, tv);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 7040L)
    public static SubLObject kb_create_deduction_kb_store(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_low.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_low.NIL;
        }
        if (pragmatic_support_mts == deductions_low.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_low.NIL;
        }
        final SubLObject internal_id = deduction_handles.make_deduction_id();
        final SubLObject deduction = deduction_handles.make_deduction_shell(internal_id);
        kb_create_deduction_int(deduction, internal_id, assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
        return internal_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 7713L)
    public static SubLObject kb_create_deduction_int(final SubLObject deduction, final SubLObject internal_id, final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_low.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_low.NIL;
        }
        if (pragmatic_support_mts == deductions_low.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_low.NIL;
        }
        final SubLObject tv = enumeration_types.tv_from_truth_strength(truth, strength);
        create_deduction_content(internal_id, assertion, supports, v_bindings, pragmatic_support_mts);
        reset_deduction_tv(deduction, tv);
        if (deductions_low.NIL != assertion_handles.assertion_p(assertion)) {
            assertions_low.add_new_assertion_argument(assertion, deduction);
        }
        add_deduction_dependents(deduction);
        return (SubLObject)deductions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 8313L)
    public static SubLObject kb_create_deduction_cyc(final SubLObject internal_id) {
        return deduction_handles.make_deduction_shell(internal_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 8540L)
    public static SubLObject kb_manifest_deduction(final SubLObject deduction, final SubLObject internal_id, final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_low.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_low.NIL;
        }
        if (pragmatic_support_mts == deductions_low.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_low.NIL;
        }
        final SubLObject tv = enumeration_types.tv_from_truth_strength(truth, strength);
        create_deduction_content(internal_id, assertion, supports, v_bindings, pragmatic_support_mts);
        reset_deduction_tv(deduction, tv);
        if (deductions_low.NIL != assertion_handles.assertion_p(assertion)) {
            assertions_low.add_new_assertion_argument(assertion, deduction);
        }
        add_deduction_dependents(deduction);
        return (SubLObject)deductions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 9136L)
    public static SubLObject add_deduction_dependents(final SubLObject deduction) {
        assert deductions_low.NIL != deduction_handles.deduction_p(deduction) : deduction;
        SubLObject cdolist_list_var = deduction_supports_internal(deduction);
        SubLObject support = (SubLObject)deductions_low.NIL;
        support = cdolist_list_var.first();
        while (deductions_low.NIL != cdolist_list_var) {
            if (deductions_low.NIL != assertion_handles.assertion_p(support)) {
                assertions_low.add_assertion_dependent(support, deduction);
            }
            else if (deductions_low.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                kb_hl_supports_low.kb_hl_support_add_dependent_int(support, deduction);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 9611L)
    public static SubLObject kb_remove_deduction_internal(final SubLObject deduction) {
        final SubLObject id = deduction_handles.deduction_id(deduction);
        destroy_deduction_content(id);
        deduction_handles.deregister_deduction_id(id);
        deduction_handles.free_deduction(deduction);
        return (SubLObject)deductions_low.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 9975L)
    public static SubLObject remove_deduction_dependents(final SubLObject deduction) {
        assert deductions_low.NIL != deduction_handles.deduction_p(deduction) : deduction;
        SubLObject cdolist_list_var = deduction_supports_internal(deduction);
        SubLObject support = (SubLObject)deductions_low.NIL;
        support = cdolist_list_var.first();
        while (deductions_low.NIL != cdolist_list_var) {
            if (deductions_low.NIL != assertion_handles.valid_assertionP(support, (SubLObject)deductions_low.UNPROVIDED)) {
                assertions_low.remove_assertion_dependent(support, deduction);
            }
            else if (deductions_low.NIL != kb_hl_support_handles.valid_kb_hl_supportP(support, (SubLObject)deductions_low.UNPROVIDED)) {
                kb_hl_supports_low.kb_hl_support_remove_dependent_int(support, deduction);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 10472L)
    public static SubLObject reset_deduction_tv(final SubLObject deduction, final SubLObject new_tv) {
        set_deduction_tv(deduction_handles.deduction_id(deduction), new_tv);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 10994L)
    public static SubLObject kb_set_deduction_strength_internal(final SubLObject deduction, final SubLObject new_strength) {
        final SubLObject truth = arguments.argument_truth(deduction);
        final SubLObject new_tv = enumeration_types.tv_from_truth_strength(truth, new_strength);
        return reset_deduction_tv(deduction, new_tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 11374L)
    public static SubLObject reset_deduction_supports(final SubLObject deduction, final SubLObject new_supports) {
        set_deduction_supports(deduction_handles.deduction_id(deduction), new_supports);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 11856L)
    public static SubLObject reset_deduction_bindings(final SubLObject deduction, final SubLObject new_bindings) {
        set_deduction_bindings(deduction_handles.deduction_id(deduction), new_bindings);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 12332L)
    public static SubLObject reset_deduction_pragmatic_support_mts(final SubLObject deduction, final SubLObject new_pragmatic_support_mts) {
        set_deduction_pragmatic_support_mts(deduction_handles.deduction_id(deduction), new_pragmatic_support_mts);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 12917L)
    public static SubLObject find_deduction_internal(SubLObject supported_object, final SubLObject supports, final SubLObject truth) {
        SubLObject deduction = (SubLObject)deductions_low.NIL;
        if (deductions_low.NIL != arguments.hl_support_p(supported_object)) {
            final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(supported_object);
            if (deductions_low.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
                supported_object = kb_hl_support;
            }
        }
        if (deductions_low.NIL != assertion_handles.assertion_p(supported_object)) {
            SubLObject rest;
            SubLObject argument;
            for (rest = (SubLObject)deductions_low.NIL, rest = assertions_high.assertion_arguments(supported_object); deductions_low.NIL == deduction && deductions_low.NIL != rest; rest = rest.rest()) {
                argument = rest.first();
                if (deductions_low.NIL != deduction_handles.deduction_p(argument) && deductions_low.NIL != deduction_matches_specification(argument, supported_object, supports, truth)) {
                    deduction = argument;
                }
            }
        }
        else if (deductions_low.NIL != kb_hl_support_handles.kb_hl_support_p(supported_object)) {
            SubLObject rest;
            SubLObject argument;
            SubLObject hl_support;
            for (rest = (SubLObject)deductions_low.NIL, rest = kb_hl_supports_interface.kb_kb_hl_support_arguments(supported_object); deductions_low.NIL == deduction && deductions_low.NIL != rest; rest = rest.rest()) {
                argument = rest.first();
                if (deductions_low.NIL != deduction_handles.deduction_p(argument)) {
                    hl_support = kb_hl_supports_low.kb_hl_support_hl_support_int(supported_object);
                    if (deductions_low.NIL != deduction_matches_specification(argument, hl_support, supports, truth)) {
                        deduction = argument;
                    }
                }
            }
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 14016L)
    public static SubLObject deduction_matches_specification(final SubLObject deduction, final SubLObject supported_object, final SubLObject supports, SubLObject truth) {
        if (truth == deductions_low.UNPROVIDED) {
            truth = (SubLObject)deductions_low.$kw33$TRUE;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(supported_object.equal(deductions_high.deduction_supported_object(deduction)) && truth.eql(arguments.argument_truth(deduction)) && deductions_low.NIL != deductions_high.deduction_supports_equal(supports, deductions_high.deduction_supports(deduction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 14392L)
    public static SubLObject deduction_supported_object_internal(final SubLObject deduction) {
        return lookup_deduction_supported_object(deduction_handles.deduction_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 14681L)
    public static SubLObject deduction_tv(final SubLObject deduction) {
        assert deductions_low.NIL != deduction_handles.deduction_p(deduction) : deduction;
        return lookup_deduction_tv(deduction_handles.deduction_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 14996L)
    public static SubLObject deduction_supports_internal(final SubLObject deduction) {
        return lookup_deduction_supports(deduction_handles.deduction_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 15247L)
    public static SubLObject deduction_truth_internal(final SubLObject deduction) {
        return enumeration_types.tv_truth(deduction_tv(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 15475L)
    public static SubLObject deduction_strength_internal(final SubLObject deduction) {
        return enumeration_types.tv_strength(deduction_tv(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 15712L)
    public static SubLObject deduction_bindings_internal(final SubLObject deduction) {
        return lookup_deduction_bindings(deduction_handles.deduction_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-low.lisp", position = 15963L)
    public static SubLObject deduction_pragmatic_support_mts_internal(final SubLObject deduction) {
        return lookup_deduction_pragmatic_support_mts(deduction_handles.deduction_id(deduction));
    }
    
    public static SubLObject declare_deductions_low_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_content_print_function_trampoline", "DEDUCTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_content_p", "DEDUCTION-CONTENT-P", 1, 0, false);
        new $deduction_content_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "d_content_tv", "D-CONTENT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "d_content_supported_object", "D-CONTENT-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "d_content_supports", "D-CONTENT-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "d_content_bindings", "D-CONTENT-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "d_content_pragmatic_support_mts", "D-CONTENT-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "_csetf_d_content_tv", "_CSETF-D-CONTENT-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "_csetf_d_content_supported_object", "_CSETF-D-CONTENT-SUPPORTED-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "_csetf_d_content_supports", "_CSETF-D-CONTENT-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "_csetf_d_content_bindings", "_CSETF-D-CONTENT-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "_csetf_d_content_pragmatic_support_mts", "_CSETF-D-CONTENT-PRAGMATIC-SUPPORT-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "make_deduction_content", "MAKE-DEDUCTION-CONTENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "visit_defstruct_deduction_content", "VISIT-DEFSTRUCT-DEDUCTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "visit_defstruct_object_deduction_content_method", "VISIT-DEFSTRUCT-OBJECT-DEDUCTION-CONTENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "create_deduction_content", "CREATE-DEDUCTION-CONTENT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "destroy_deduction_content", "DESTROY-DEDUCTION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "lookup_deduction_tv", "LOOKUP-DEDUCTION-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "lookup_deduction_supported_object", "LOOKUP-DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "lookup_deduction_supports", "LOOKUP-DEDUCTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "lookup_deduction_bindings", "LOOKUP-DEDUCTION-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "lookup_deduction_pragmatic_support_mts", "LOOKUP-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "set_deduction_tv", "SET-DEDUCTION-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "set_deduction_supports", "SET-DEDUCTION-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "set_deduction_bindings", "SET-DEDUCTION-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "set_deduction_pragmatic_support_mts", "SET-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "dump_deduction_content", "DUMP-DEDUCTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "load_deduction_content", "LOAD-DEDUCTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "load_deduction_content_int", "LOAD-DEDUCTION-CONTENT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "kb_create_deduction_kb_store", "KB-CREATE-DEDUCTION-KB-STORE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "kb_create_deduction_int", "KB-CREATE-DEDUCTION-INT", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "kb_create_deduction_cyc", "KB-CREATE-DEDUCTION-CYC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "kb_manifest_deduction", "KB-MANIFEST-DEDUCTION", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "add_deduction_dependents", "ADD-DEDUCTION-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "kb_remove_deduction_internal", "KB-REMOVE-DEDUCTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "remove_deduction_dependents", "REMOVE-DEDUCTION-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "reset_deduction_tv", "RESET-DEDUCTION-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "kb_set_deduction_strength_internal", "KB-SET-DEDUCTION-STRENGTH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "reset_deduction_supports", "RESET-DEDUCTION-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "reset_deduction_bindings", "RESET-DEDUCTION-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "reset_deduction_pragmatic_support_mts", "RESET-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "find_deduction_internal", "FIND-DEDUCTION-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_matches_specification", "DEDUCTION-MATCHES-SPECIFICATION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_supported_object_internal", "DEDUCTION-SUPPORTED-OBJECT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_tv", "DEDUCTION-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_supports_internal", "DEDUCTION-SUPPORTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_truth_internal", "DEDUCTION-TRUTH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_strength_internal", "DEDUCTION-STRENGTH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_bindings_internal", "DEDUCTION-BINDINGS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_low", "deduction_pragmatic_support_mts_internal", "DEDUCTION-PRAGMATIC-SUPPORT-MTS-INTERNAL", 1, 0, false);
        return (SubLObject)deductions_low.NIL;
    }
    
    public static SubLObject init_deductions_low_file() {
        deductions_low.$dtp_deduction_content$ = SubLFiles.defconstant("*DTP-DEDUCTION-CONTENT*", (SubLObject)deductions_low.$sym0$DEDUCTION_CONTENT);
        deductions_low.$bug_34058_backward_compatibility_deduction_dump_support_enabledP$ = SubLFiles.defparameter("*BUG-34058-BACKWARD-COMPATIBILITY-DEDUCTION-DUMP-SUPPORT-ENABLED?*", (SubLObject)deductions_low.NIL);
        return (SubLObject)deductions_low.NIL;
    }
    
    public static SubLObject setup_deductions_low_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), deductions_low.$dtp_deduction_content$.getGlobalValue(), Symbols.symbol_function((SubLObject)deductions_low.$sym8$DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)deductions_low.$list9);
        Structures.def_csetf((SubLObject)deductions_low.$sym10$D_CONTENT_TV, (SubLObject)deductions_low.$sym11$_CSETF_D_CONTENT_TV);
        Structures.def_csetf((SubLObject)deductions_low.$sym12$D_CONTENT_SUPPORTED_OBJECT, (SubLObject)deductions_low.$sym13$_CSETF_D_CONTENT_SUPPORTED_OBJECT);
        Structures.def_csetf((SubLObject)deductions_low.$sym14$D_CONTENT_SUPPORTS, (SubLObject)deductions_low.$sym15$_CSETF_D_CONTENT_SUPPORTS);
        Structures.def_csetf((SubLObject)deductions_low.$sym16$D_CONTENT_BINDINGS, (SubLObject)deductions_low.$sym17$_CSETF_D_CONTENT_BINDINGS);
        Structures.def_csetf((SubLObject)deductions_low.$sym18$D_CONTENT_PRAGMATIC_SUPPORT_MTS, (SubLObject)deductions_low.$sym19$_CSETF_D_CONTENT_PRAGMATIC_SUPPORT_MTS);
        Equality.identity((SubLObject)deductions_low.$sym0$DEDUCTION_CONTENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), deductions_low.$dtp_deduction_content$.getGlobalValue(), Symbols.symbol_function((SubLObject)deductions_low.$sym30$VISIT_DEFSTRUCT_OBJECT_DEDUCTION_CONTENT_METHOD));
        return (SubLObject)deductions_low.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_deductions_low_file();
    }
    
    @Override
	public void initializeVariables() {
        init_deductions_low_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_deductions_low_file();
    }
    
    static {
        me = (SubLFile)new deductions_low();
        deductions_low.$dtp_deduction_content$ = null;
        deductions_low.$bug_34058_backward_compatibility_deduction_dump_support_enabledP$ = null;
        $sym0$DEDUCTION_CONTENT = SubLObjectFactory.makeSymbol("DEDUCTION-CONTENT");
        $sym1$DEDUCTION_CONTENT_P = SubLObjectFactory.makeSymbol("DEDUCTION-CONTENT-P");
        $int2$149 = SubLObjectFactory.makeInteger(149);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMATIC-SUPPORT-MTS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORT-MTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D-CONTENT-TV"), (SubLObject)SubLObjectFactory.makeSymbol("D-CONTENT-SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("D-CONTENT-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("D-CONTENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("D-CONTENT-PRAGMATIC-SUPPORT-MTS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-TV"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-SUPPORTED-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-PRAGMATIC-SUPPORT-MTS"));
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$DEDUCTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DEDUCTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-CONTENT-P"));
        $sym10$D_CONTENT_TV = SubLObjectFactory.makeSymbol("D-CONTENT-TV");
        $sym11$_CSETF_D_CONTENT_TV = SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-TV");
        $sym12$D_CONTENT_SUPPORTED_OBJECT = SubLObjectFactory.makeSymbol("D-CONTENT-SUPPORTED-OBJECT");
        $sym13$_CSETF_D_CONTENT_SUPPORTED_OBJECT = SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-SUPPORTED-OBJECT");
        $sym14$D_CONTENT_SUPPORTS = SubLObjectFactory.makeSymbol("D-CONTENT-SUPPORTS");
        $sym15$_CSETF_D_CONTENT_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-SUPPORTS");
        $sym16$D_CONTENT_BINDINGS = SubLObjectFactory.makeSymbol("D-CONTENT-BINDINGS");
        $sym17$_CSETF_D_CONTENT_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-BINDINGS");
        $sym18$D_CONTENT_PRAGMATIC_SUPPORT_MTS = SubLObjectFactory.makeSymbol("D-CONTENT-PRAGMATIC-SUPPORT-MTS");
        $sym19$_CSETF_D_CONTENT_PRAGMATIC_SUPPORT_MTS = SubLObjectFactory.makeSymbol("_CSETF-D-CONTENT-PRAGMATIC-SUPPORT-MTS");
        $kw20$TV = SubLObjectFactory.makeKeyword("TV");
        $kw21$SUPPORTED_OBJECT = SubLObjectFactory.makeKeyword("SUPPORTED-OBJECT");
        $kw22$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw23$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw24$PRAGMATIC_SUPPORT_MTS = SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORT-MTS");
        $str25$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw26$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym27$MAKE_DEDUCTION_CONTENT = SubLObjectFactory.makeSymbol("MAKE-DEDUCTION-CONTENT");
        $kw28$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw29$END = SubLObjectFactory.makeKeyword("END");
        $sym30$VISIT_DEFSTRUCT_OBJECT_DEDUCTION_CONTENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DEDUCTION-CONTENT-METHOD");
        $kw31$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym32$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $kw33$TRUE = SubLObjectFactory.makeKeyword("TRUE");
    }
    
    public static final class $deduction_content_native extends SubLStructNative
    {
        public SubLObject $tv;
        public SubLObject $supported_object;
        public SubLObject $supports;
        public SubLObject $bindings;
        public SubLObject $pragmatic_support_mts;
        private static final SubLStructDeclNative structDecl;
        
        public $deduction_content_native() {
            this.$tv = (SubLObject)CommonSymbols.NIL;
            this.$supported_object = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$pragmatic_support_mts = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$deduction_content_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$tv;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$supported_object;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$supports;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$bindings;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$pragmatic_support_mts;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$tv = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$supported_object = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$bindings = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$pragmatic_support_mts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$deduction_content_native.class, deductions_low.$sym0$DEDUCTION_CONTENT, deductions_low.$sym1$DEDUCTION_CONTENT_P, deductions_low.$list3, deductions_low.$list4, new String[] { "$tv", "$supported_object", "$supports", "$bindings", "$pragmatic_support_mts" }, deductions_low.$list5, deductions_low.$list6, deductions_low.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $deduction_content_p$UnaryFunction extends UnaryFunction
    {
        public $deduction_content_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DEDUCTION-CONTENT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return deductions_low.deduction_content_p(arg1);
        }
    }
}

/*

	Total time: 175 ms
	
*/