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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hierarchical_visitor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hierarchical_visitor";
    public static final String myFingerPrint = "daa21d8cd23bf8098ebf592338c37940844ef721fbdf7f0bed361f074e99e2de";
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1750L)
    public static SubLSymbol $default_hierarchical_visitor_noop_callback$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLSymbol $dtp_hierarchical_visitor$;
    private static final SubLSymbol $sym0$FALSE;
    private static final SubLSymbol $sym1$HIERARCHICAL_VISITOR;
    private static final SubLSymbol $sym2$HIERARCHICAL_VISITOR_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_HIERACHICAL_VISITOR;
    private static final SubLSymbol $sym8$HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$HIER_VISIT_BEGIN_PATH_FN;
    private static final SubLSymbol $sym11$_CSETF_HIER_VISIT_BEGIN_PATH_FN;
    private static final SubLSymbol $sym12$HIER_VISIT_END_PATH_FN;
    private static final SubLSymbol $sym13$_CSETF_HIER_VISIT_END_PATH_FN;
    private static final SubLSymbol $sym14$HIER_VISIT_ACCEPT_NODE_FN;
    private static final SubLSymbol $sym15$_CSETF_HIER_VISIT_ACCEPT_NODE_FN;
    private static final SubLSymbol $sym16$HIER_VISIT_BEGIN_VISIT_FN;
    private static final SubLSymbol $sym17$_CSETF_HIER_VISIT_BEGIN_VISIT_FN;
    private static final SubLSymbol $sym18$HIER_VISIT_END_VISIT_FN;
    private static final SubLSymbol $sym19$_CSETF_HIER_VISIT_END_VISIT_FN;
    private static final SubLSymbol $sym20$HIER_VISIT_PARAM;
    private static final SubLSymbol $sym21$_CSETF_HIER_VISIT_PARAM;
    private static final SubLSymbol $kw22$BEGIN_PATH_FN;
    private static final SubLSymbol $kw23$END_PATH_FN;
    private static final SubLSymbol $kw24$ACCEPT_NODE_FN;
    private static final SubLSymbol $kw25$BEGIN_VISIT_FN;
    private static final SubLSymbol $kw26$END_VISIT_FN;
    private static final SubLSymbol $kw27$PARAM;
    private static final SubLString $str28$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw29$BEGIN;
    private static final SubLSymbol $sym30$MAKE_HIERARCHICAL_VISITOR;
    private static final SubLSymbol $kw31$SLOT;
    private static final SubLSymbol $kw32$END;
    private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_HIERARCHICAL_VISITOR_METHOD;
    private static final SubLString $str34$__Visit__;
    private static final SubLString $str35$__Path__;
    private static final SubLString $str36$_Node__;
    private static final SubLString $str37$_;
    private static final SubLString $str38$__;
    private static final SubLString $str39$__Param__;
    private static final SubLSymbol $sym40$PRINT_HIER_VISITOR_BEGIN_VISIT;
    private static final SubLSymbol $sym41$PRINT_HIER_VISITOR_BEGIN_PATH;
    private static final SubLSymbol $sym42$PRINT_HIER_VISITOR_ACCEPT_NODE;
    private static final SubLSymbol $sym43$PRINT_HIER_VISITOR_END_PATH;
    private static final SubLSymbol $sym44$PRINT_HIER_VISITOR_END_VISIT;
    private static final SubLString $str45$__Begin_visit_of__A___;
    private static final SubLString $str46$__End_visit_of__A___;
    private static final SubLString $str47$__Begin_path__A__;
    private static final SubLString $str48$__End_path__A__;
    private static final SubLString $str49$__Node__A__;
    private static final SubLString $str50$CHECKING_OFF_VISITED_NODES_FN_exp;
    private static final SubLString $str51$GATHER_VISITED_NODE_PATHS_FN_expe;
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hierarchical_visitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hierachical_visitor(v_object, stream, (SubLObject)hierarchical_visitor.ZERO_INTEGER);
        return (SubLObject)hierarchical_visitor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hierarchical_visitor_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $hierarchical_visitor_native.class) ? hierarchical_visitor.T : hierarchical_visitor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hier_visit_begin_path_fn(final SubLObject v_object) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hier_visit_end_path_fn(final SubLObject v_object) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hier_visit_accept_node_fn(final SubLObject v_object) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hier_visit_begin_visit_fn(final SubLObject v_object) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hier_visit_end_visit_fn(final SubLObject v_object) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject hier_visit_param(final SubLObject v_object) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject _csetf_hier_visit_begin_path_fn(final SubLObject v_object, final SubLObject value) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject _csetf_hier_visit_end_path_fn(final SubLObject v_object, final SubLObject value) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject _csetf_hier_visit_accept_node_fn(final SubLObject v_object, final SubLObject value) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject _csetf_hier_visit_begin_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject _csetf_hier_visit_end_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject _csetf_hier_visit_param(final SubLObject v_object, final SubLObject value) {
        assert hierarchical_visitor.NIL != hierarchical_visitor_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject make_hierarchical_visitor(SubLObject arglist) {
        if (arglist == hierarchical_visitor.UNPROVIDED) {
            arglist = (SubLObject)hierarchical_visitor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $hierarchical_visitor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)hierarchical_visitor.NIL, next = arglist; hierarchical_visitor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)hierarchical_visitor.$kw22$BEGIN_PATH_FN)) {
                _csetf_hier_visit_begin_path_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)hierarchical_visitor.$kw23$END_PATH_FN)) {
                _csetf_hier_visit_end_path_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)hierarchical_visitor.$kw24$ACCEPT_NODE_FN)) {
                _csetf_hier_visit_accept_node_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)hierarchical_visitor.$kw25$BEGIN_VISIT_FN)) {
                _csetf_hier_visit_begin_visit_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)hierarchical_visitor.$kw26$END_VISIT_FN)) {
                _csetf_hier_visit_end_visit_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)hierarchical_visitor.$kw27$PARAM)) {
                _csetf_hier_visit_param(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)hierarchical_visitor.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject visit_defstruct_hierarchical_visitor(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw29$BEGIN, (SubLObject)hierarchical_visitor.$sym30$MAKE_HIERARCHICAL_VISITOR, (SubLObject)hierarchical_visitor.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw31$SLOT, (SubLObject)hierarchical_visitor.$kw22$BEGIN_PATH_FN, hier_visit_begin_path_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw31$SLOT, (SubLObject)hierarchical_visitor.$kw23$END_PATH_FN, hier_visit_end_path_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw31$SLOT, (SubLObject)hierarchical_visitor.$kw24$ACCEPT_NODE_FN, hier_visit_accept_node_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw31$SLOT, (SubLObject)hierarchical_visitor.$kw25$BEGIN_VISIT_FN, hier_visit_begin_visit_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw31$SLOT, (SubLObject)hierarchical_visitor.$kw26$END_VISIT_FN, hier_visit_end_visit_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw31$SLOT, (SubLObject)hierarchical_visitor.$kw27$PARAM, hier_visit_param(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)hierarchical_visitor.$kw32$END, (SubLObject)hierarchical_visitor.$sym30$MAKE_HIERARCHICAL_VISITOR, (SubLObject)hierarchical_visitor.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 1945L)
    public static SubLObject visit_defstruct_object_hierarchical_visitor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hierarchical_visitor(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 2478L)
    public static SubLObject print_hierachical_visitor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hierarchical_visitor.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.T);
            streams_high.write_string((SubLObject)hierarchical_visitor.$str34$__Visit__, stream, (SubLObject)hierarchical_visitor.UNPROVIDED, (SubLObject)hierarchical_visitor.UNPROVIDED);
            print_high.princ(hier_visit_begin_visit_fn(v_object), stream);
            streams_high.write_string((SubLObject)hierarchical_visitor.$str35$__Path__, stream, (SubLObject)hierarchical_visitor.UNPROVIDED, (SubLObject)hierarchical_visitor.UNPROVIDED);
            print_high.princ(hier_visit_begin_path_fn(v_object), stream);
            streams_high.write_string((SubLObject)hierarchical_visitor.$str36$_Node__, stream, (SubLObject)hierarchical_visitor.UNPROVIDED, (SubLObject)hierarchical_visitor.UNPROVIDED);
            print_high.princ(hier_visit_accept_node_fn(v_object), stream);
            streams_high.write_string((SubLObject)hierarchical_visitor.$str37$_, stream, (SubLObject)hierarchical_visitor.UNPROVIDED, (SubLObject)hierarchical_visitor.UNPROVIDED);
            print_high.princ(hier_visit_end_path_fn(v_object), stream);
            streams_high.write_string((SubLObject)hierarchical_visitor.$str38$__, stream, (SubLObject)hierarchical_visitor.UNPROVIDED, (SubLObject)hierarchical_visitor.UNPROVIDED);
            print_high.princ(hier_visit_end_path_fn(v_object), stream);
            streams_high.write_string((SubLObject)hierarchical_visitor.$str39$__Param__, stream, (SubLObject)hierarchical_visitor.UNPROVIDED, (SubLObject)hierarchical_visitor.UNPROVIDED);
            print_high.princ(hier_visit_param(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 3164L)
    public static SubLObject new_hiearchical_visitor(final SubLObject begin_visit_fn, final SubLObject begin_path_fn, final SubLObject accept_node_fn, final SubLObject end_path_fn, final SubLObject end_visit_fn, SubLObject param) {
        if (param == hierarchical_visitor.UNPROVIDED) {
            param = (SubLObject)hierarchical_visitor.NIL;
        }
        final SubLObject hier_visit = make_hierarchical_visitor((SubLObject)hierarchical_visitor.UNPROVIDED);
        _csetf_hier_visit_begin_visit_fn(hier_visit, begin_visit_fn);
        _csetf_hier_visit_begin_path_fn(hier_visit, begin_path_fn);
        _csetf_hier_visit_accept_node_fn(hier_visit, accept_node_fn);
        _csetf_hier_visit_end_path_fn(hier_visit, end_path_fn);
        _csetf_hier_visit_end_visit_fn(hier_visit, end_visit_fn);
        _csetf_hier_visit_param(hier_visit, param);
        return hier_visit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 3837L)
    public static SubLObject new_simple_hierarchical_visitor(final SubLObject begin_path_fn, final SubLObject accept_node_fn, final SubLObject end_path_fn, SubLObject param) {
        if (param == hierarchical_visitor.UNPROVIDED) {
            param = (SubLObject)hierarchical_visitor.NIL;
        }
        return new_hiearchical_visitor(hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), begin_path_fn, accept_node_fn, end_path_fn, hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), param);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 4351L)
    public static SubLObject hierarchical_visitor_begin_visit(final SubLObject hier_visitor) {
        return Functions.funcall(hier_visit_begin_visit_fn(hier_visitor), hier_visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 4628L)
    public static SubLObject hierarchical_visitor_end_visit(final SubLObject hier_visitor) {
        return Functions.funcall(hier_visit_end_visit_fn(hier_visitor), hier_visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 4901L)
    public static SubLObject show_hierarchical_visitor_node(final SubLObject hier_visitor, final SubLObject node) {
        return Functions.funcall(hier_visit_accept_node_fn(hier_visitor), hier_visitor, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 5175L)
    public static SubLObject show_hierarchical_visitor_path_begin(final SubLObject hier_visitor, final SubLObject path) {
        return Functions.funcall(hier_visit_begin_path_fn(hier_visitor), hier_visitor, path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 5482L)
    public static SubLObject show_hierarchical_visitor_path_end(final SubLObject hier_visitor, final SubLObject path) {
        return Functions.funcall(hier_visit_end_path_fn(hier_visitor), hier_visitor, path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 5786L)
    public static SubLObject set_hierarchical_visitor_parameter(final SubLObject hier_visitor, final SubLObject new_param) {
        final SubLObject old_param = get_hierarchical_visitor_parameter(hier_visitor);
        _csetf_hier_visit_param(hier_visitor, new_param);
        return old_param;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 6283L)
    public static SubLObject get_hierarchical_visitor_parameter(final SubLObject hier_visitor) {
        return hier_visit_param(hier_visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 6620L)
    public static SubLObject new_hierarchical_print_visitor() {
        return new_hiearchical_visitor((SubLObject)hierarchical_visitor.$sym40$PRINT_HIER_VISITOR_BEGIN_VISIT, (SubLObject)hierarchical_visitor.$sym41$PRINT_HIER_VISITOR_BEGIN_PATH, (SubLObject)hierarchical_visitor.$sym42$PRINT_HIER_VISITOR_ACCEPT_NODE, (SubLObject)hierarchical_visitor.$sym43$PRINT_HIER_VISITOR_END_PATH, (SubLObject)hierarchical_visitor.$sym44$PRINT_HIER_VISITOR_END_VISIT, (SubLObject)hierarchical_visitor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 7167L)
    public static SubLObject print_hier_visitor_begin_visit(final SubLObject visitor) {
        return PrintLow.format((SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.$str45$__Begin_visit_of__A___, visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 7279L)
    public static SubLObject print_hier_visitor_end_visit(final SubLObject visitor) {
        return PrintLow.format((SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.$str46$__End_visit_of__A___, visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 7387L)
    public static SubLObject print_hier_visitor_begin_path(final SubLObject visitor, final SubLObject path) {
        return PrintLow.format((SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.$str47$__Begin_path__A__, path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 7514L)
    public static SubLObject print_hier_visitor_end_path(final SubLObject visitor, final SubLObject path) {
        return PrintLow.format((SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.$str48$__End_path__A__, path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 7637L)
    public static SubLObject print_hier_visitor_accept_node(final SubLObject visitor, final SubLObject node) {
        return PrintLow.format((SubLObject)hierarchical_visitor.T, (SubLObject)hierarchical_visitor.$str49$__Node__A__, node, visitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 7767L)
    public static SubLObject new_no_op_hierarchical_visitor() {
        return new_simple_hierarchical_visitor(hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), (SubLObject)hierarchical_visitor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 8298L)
    public static SubLObject new_node_only_hierarchical_visitor(final SubLObject node_visit_fn, SubLObject param) {
        if (param == hierarchical_visitor.UNPROVIDED) {
            param = (SubLObject)hierarchical_visitor.NIL;
        }
        return new_simple_hierarchical_visitor(hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), node_visit_fn, hierarchical_visitor.$default_hierarchical_visitor_noop_callback$.getGlobalValue(), param);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 8903L)
    public static SubLObject prin1_visited_node_paths_fn(final SubLObject visitor, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = conses_high.second(node);
        final SubLObject raw_stream = get_hierarchical_visitor_parameter(visitor);
        final SubLObject stream = (hierarchical_visitor.NIL == raw_stream) ? StreamsLow.$standard_output$.getDynamicValue(thread) : raw_stream;
        print_high.prin1(path, stream);
        streams_high.terpri(stream);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 9293L)
    public static SubLObject checking_off_visited_nodes_fn(final SubLObject visitor, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = conses_high.second(node);
        final SubLObject expected_paths = get_hierarchical_visitor_parameter(visitor);
        if (hierarchical_visitor.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && hierarchical_visitor.NIL == set.set_p(expected_paths)) {
            Errors.error((SubLObject)hierarchical_visitor.$str50$CHECKING_OFF_VISITED_NODES_FN_exp);
        }
        set.set_remove(path, expected_paths);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchical-visitor.lisp", position = 9834L)
    public static SubLObject gather_visited_node_paths_fn(final SubLObject visitor, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = conses_high.second(node);
        final SubLObject visited_paths = get_hierarchical_visitor_parameter(visitor);
        if (hierarchical_visitor.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && hierarchical_visitor.NIL == set.set_p(visited_paths)) {
            Errors.error((SubLObject)hierarchical_visitor.$str51$GATHER_VISITED_NODE_PATHS_FN_expe);
        }
        set.set_add(path, visited_paths);
        return node;
    }
    
    public static SubLObject declare_hierarchical_visitor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hierarchical_visitor_print_function_trampoline", "HIERARCHICAL-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hierarchical_visitor_p", "HIERARCHICAL-VISITOR-P", 1, 0, false);
        new $hierarchical_visitor_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hier_visit_begin_path_fn", "HIER-VISIT-BEGIN-PATH-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hier_visit_end_path_fn", "HIER-VISIT-END-PATH-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hier_visit_accept_node_fn", "HIER-VISIT-ACCEPT-NODE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hier_visit_begin_visit_fn", "HIER-VISIT-BEGIN-VISIT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hier_visit_end_visit_fn", "HIER-VISIT-END-VISIT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hier_visit_param", "HIER-VISIT-PARAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "_csetf_hier_visit_begin_path_fn", "_CSETF-HIER-VISIT-BEGIN-PATH-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "_csetf_hier_visit_end_path_fn", "_CSETF-HIER-VISIT-END-PATH-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "_csetf_hier_visit_accept_node_fn", "_CSETF-HIER-VISIT-ACCEPT-NODE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "_csetf_hier_visit_begin_visit_fn", "_CSETF-HIER-VISIT-BEGIN-VISIT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "_csetf_hier_visit_end_visit_fn", "_CSETF-HIER-VISIT-END-VISIT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "_csetf_hier_visit_param", "_CSETF-HIER-VISIT-PARAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "make_hierarchical_visitor", "MAKE-HIERARCHICAL-VISITOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "visit_defstruct_hierarchical_visitor", "VISIT-DEFSTRUCT-HIERARCHICAL-VISITOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "visit_defstruct_object_hierarchical_visitor_method", "VISIT-DEFSTRUCT-OBJECT-HIERARCHICAL-VISITOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "print_hierachical_visitor", "PRINT-HIERACHICAL-VISITOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "new_hiearchical_visitor", "NEW-HIEARCHICAL-VISITOR", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "new_simple_hierarchical_visitor", "NEW-SIMPLE-HIERARCHICAL-VISITOR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hierarchical_visitor_begin_visit", "HIERARCHICAL-VISITOR-BEGIN-VISIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "hierarchical_visitor_end_visit", "HIERARCHICAL-VISITOR-END-VISIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "show_hierarchical_visitor_node", "SHOW-HIERARCHICAL-VISITOR-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "show_hierarchical_visitor_path_begin", "SHOW-HIERARCHICAL-VISITOR-PATH-BEGIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "show_hierarchical_visitor_path_end", "SHOW-HIERARCHICAL-VISITOR-PATH-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "set_hierarchical_visitor_parameter", "SET-HIERARCHICAL-VISITOR-PARAMETER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "get_hierarchical_visitor_parameter", "GET-HIERARCHICAL-VISITOR-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "new_hierarchical_print_visitor", "NEW-HIERARCHICAL-PRINT-VISITOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "print_hier_visitor_begin_visit", "PRINT-HIER-VISITOR-BEGIN-VISIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "print_hier_visitor_end_visit", "PRINT-HIER-VISITOR-END-VISIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "print_hier_visitor_begin_path", "PRINT-HIER-VISITOR-BEGIN-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "print_hier_visitor_end_path", "PRINT-HIER-VISITOR-END-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "print_hier_visitor_accept_node", "PRINT-HIER-VISITOR-ACCEPT-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "new_no_op_hierarchical_visitor", "NEW-NO-OP-HIERARCHICAL-VISITOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "new_node_only_hierarchical_visitor", "NEW-NODE-ONLY-HIERARCHICAL-VISITOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "prin1_visited_node_paths_fn", "PRIN1-VISITED-NODE-PATHS-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "checking_off_visited_nodes_fn", "CHECKING-OFF-VISITED-NODES-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchical_visitor", "gather_visited_node_paths_fn", "GATHER-VISITED-NODE-PATHS-FN", 2, 0, false);
        return (SubLObject)hierarchical_visitor.NIL;
    }
    
    public static SubLObject init_hierarchical_visitor_file() {
        hierarchical_visitor.$default_hierarchical_visitor_noop_callback$ = SubLFiles.deflexical("*DEFAULT-HIERARCHICAL-VISITOR-NOOP-CALLBACK*", Symbols.symbol_function((SubLObject)hierarchical_visitor.$sym0$FALSE));
        hierarchical_visitor.$dtp_hierarchical_visitor$ = SubLFiles.defconstant("*DTP-HIERARCHICAL-VISITOR*", (SubLObject)hierarchical_visitor.$sym1$HIERARCHICAL_VISITOR);
        return (SubLObject)hierarchical_visitor.NIL;
    }
    
    public static SubLObject setup_hierarchical_visitor_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), hierarchical_visitor.$dtp_hierarchical_visitor$.getGlobalValue(), Symbols.symbol_function((SubLObject)hierarchical_visitor.$sym8$HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)hierarchical_visitor.$list9);
        Structures.def_csetf((SubLObject)hierarchical_visitor.$sym10$HIER_VISIT_BEGIN_PATH_FN, (SubLObject)hierarchical_visitor.$sym11$_CSETF_HIER_VISIT_BEGIN_PATH_FN);
        Structures.def_csetf((SubLObject)hierarchical_visitor.$sym12$HIER_VISIT_END_PATH_FN, (SubLObject)hierarchical_visitor.$sym13$_CSETF_HIER_VISIT_END_PATH_FN);
        Structures.def_csetf((SubLObject)hierarchical_visitor.$sym14$HIER_VISIT_ACCEPT_NODE_FN, (SubLObject)hierarchical_visitor.$sym15$_CSETF_HIER_VISIT_ACCEPT_NODE_FN);
        Structures.def_csetf((SubLObject)hierarchical_visitor.$sym16$HIER_VISIT_BEGIN_VISIT_FN, (SubLObject)hierarchical_visitor.$sym17$_CSETF_HIER_VISIT_BEGIN_VISIT_FN);
        Structures.def_csetf((SubLObject)hierarchical_visitor.$sym18$HIER_VISIT_END_VISIT_FN, (SubLObject)hierarchical_visitor.$sym19$_CSETF_HIER_VISIT_END_VISIT_FN);
        Structures.def_csetf((SubLObject)hierarchical_visitor.$sym20$HIER_VISIT_PARAM, (SubLObject)hierarchical_visitor.$sym21$_CSETF_HIER_VISIT_PARAM);
        Equality.identity((SubLObject)hierarchical_visitor.$sym1$HIERARCHICAL_VISITOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), hierarchical_visitor.$dtp_hierarchical_visitor$.getGlobalValue(), Symbols.symbol_function((SubLObject)hierarchical_visitor.$sym33$VISIT_DEFSTRUCT_OBJECT_HIERARCHICAL_VISITOR_METHOD));
        return (SubLObject)hierarchical_visitor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_hierarchical_visitor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_hierarchical_visitor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_hierarchical_visitor_file();
    }
    
    static {
        me = (SubLFile)new hierarchical_visitor();
        hierarchical_visitor.$default_hierarchical_visitor_noop_callback$ = null;
        hierarchical_visitor.$dtp_hierarchical_visitor$ = null;
        $sym0$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym1$HIERARCHICAL_VISITOR = SubLObjectFactory.makeSymbol("HIERARCHICAL-VISITOR");
        $sym2$HIERARCHICAL_VISITOR_P = SubLObjectFactory.makeSymbol("HIERARCHICAL-VISITOR-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BEGIN-PATH-FN"), (SubLObject)SubLObjectFactory.makeSymbol("END-PATH-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-NODE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEGIN-PATH-FN"), (SubLObject)SubLObjectFactory.makeKeyword("END-PATH-FN"), (SubLObject)SubLObjectFactory.makeKeyword("ACCEPT-NODE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("PARAM"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIER-VISIT-BEGIN-PATH-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HIER-VISIT-END-PATH-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HIER-VISIT-ACCEPT-NODE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HIER-VISIT-BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HIER-VISIT-END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HIER-VISIT-PARAM"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-PARAM"));
        $sym7$PRINT_HIERACHICAL_VISITOR = SubLObjectFactory.makeSymbol("PRINT-HIERACHICAL-VISITOR");
        $sym8$HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HIERARCHICAL-VISITOR-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HIERARCHICAL-VISITOR-P"));
        $sym10$HIER_VISIT_BEGIN_PATH_FN = SubLObjectFactory.makeSymbol("HIER-VISIT-BEGIN-PATH-FN");
        $sym11$_CSETF_HIER_VISIT_BEGIN_PATH_FN = SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN");
        $sym12$HIER_VISIT_END_PATH_FN = SubLObjectFactory.makeSymbol("HIER-VISIT-END-PATH-FN");
        $sym13$_CSETF_HIER_VISIT_END_PATH_FN = SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN");
        $sym14$HIER_VISIT_ACCEPT_NODE_FN = SubLObjectFactory.makeSymbol("HIER-VISIT-ACCEPT-NODE-FN");
        $sym15$_CSETF_HIER_VISIT_ACCEPT_NODE_FN = SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN");
        $sym16$HIER_VISIT_BEGIN_VISIT_FN = SubLObjectFactory.makeSymbol("HIER-VISIT-BEGIN-VISIT-FN");
        $sym17$_CSETF_HIER_VISIT_BEGIN_VISIT_FN = SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN");
        $sym18$HIER_VISIT_END_VISIT_FN = SubLObjectFactory.makeSymbol("HIER-VISIT-END-VISIT-FN");
        $sym19$_CSETF_HIER_VISIT_END_VISIT_FN = SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN");
        $sym20$HIER_VISIT_PARAM = SubLObjectFactory.makeSymbol("HIER-VISIT-PARAM");
        $sym21$_CSETF_HIER_VISIT_PARAM = SubLObjectFactory.makeSymbol("_CSETF-HIER-VISIT-PARAM");
        $kw22$BEGIN_PATH_FN = SubLObjectFactory.makeKeyword("BEGIN-PATH-FN");
        $kw23$END_PATH_FN = SubLObjectFactory.makeKeyword("END-PATH-FN");
        $kw24$ACCEPT_NODE_FN = SubLObjectFactory.makeKeyword("ACCEPT-NODE-FN");
        $kw25$BEGIN_VISIT_FN = SubLObjectFactory.makeKeyword("BEGIN-VISIT-FN");
        $kw26$END_VISIT_FN = SubLObjectFactory.makeKeyword("END-VISIT-FN");
        $kw27$PARAM = SubLObjectFactory.makeKeyword("PARAM");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_HIERARCHICAL_VISITOR = SubLObjectFactory.makeSymbol("MAKE-HIERARCHICAL-VISITOR");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_HIERARCHICAL_VISITOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HIERARCHICAL-VISITOR-METHOD");
        $str34$__Visit__ = SubLObjectFactory.makeString(" (Visit: ");
        $str35$__Path__ = SubLObjectFactory.makeString(" (Path: ");
        $str36$_Node__ = SubLObjectFactory.makeString(" Node: ");
        $str37$_ = SubLObjectFactory.makeString(" ");
        $str38$__ = SubLObjectFactory.makeString(") ");
        $str39$__Param__ = SubLObjectFactory.makeString(") Param: ");
        $sym40$PRINT_HIER_VISITOR_BEGIN_VISIT = SubLObjectFactory.makeSymbol("PRINT-HIER-VISITOR-BEGIN-VISIT");
        $sym41$PRINT_HIER_VISITOR_BEGIN_PATH = SubLObjectFactory.makeSymbol("PRINT-HIER-VISITOR-BEGIN-PATH");
        $sym42$PRINT_HIER_VISITOR_ACCEPT_NODE = SubLObjectFactory.makeSymbol("PRINT-HIER-VISITOR-ACCEPT-NODE");
        $sym43$PRINT_HIER_VISITOR_END_PATH = SubLObjectFactory.makeSymbol("PRINT-HIER-VISITOR-END-PATH");
        $sym44$PRINT_HIER_VISITOR_END_VISIT = SubLObjectFactory.makeSymbol("PRINT-HIER-VISITOR-END-VISIT");
        $str45$__Begin_visit_of__A___ = SubLObjectFactory.makeString("~&Begin visit of ~A.~%");
        $str46$__End_visit_of__A___ = SubLObjectFactory.makeString("~&End visit of ~A.~%");
        $str47$__Begin_path__A__ = SubLObjectFactory.makeString("~&Begin path ~A~%");
        $str48$__End_path__A__ = SubLObjectFactory.makeString("~&End path ~A~%");
        $str49$__Node__A__ = SubLObjectFactory.makeString("~&Node ~A~%");
        $str50$CHECKING_OFF_VISITED_NODES_FN_exp = SubLObjectFactory.makeString("CHECKING-OFF-VISITED-NODES-FN expects a SET-P of expected paths as visitor parameter.");
        $str51$GATHER_VISITED_NODE_PATHS_FN_expe = SubLObjectFactory.makeString("GATHER-VISITED-NODE-PATHS-FN expects a SET-P of expected paths as visitor paramter.");
    }
    
    public static final class $hierarchical_visitor_native extends SubLStructNative
    {
        public SubLObject $begin_path_fn;
        public SubLObject $end_path_fn;
        public SubLObject $accept_node_fn;
        public SubLObject $begin_visit_fn;
        public SubLObject $end_visit_fn;
        public SubLObject $param;
        private static final SubLStructDeclNative structDecl;
        
        public $hierarchical_visitor_native() {
            this.$begin_path_fn = (SubLObject)CommonSymbols.NIL;
            this.$end_path_fn = (SubLObject)CommonSymbols.NIL;
            this.$accept_node_fn = (SubLObject)CommonSymbols.NIL;
            this.$begin_visit_fn = (SubLObject)CommonSymbols.NIL;
            this.$end_visit_fn = (SubLObject)CommonSymbols.NIL;
            this.$param = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$hierarchical_visitor_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$begin_path_fn;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$end_path_fn;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$accept_node_fn;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$begin_visit_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$end_visit_fn;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$param;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$begin_path_fn = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$end_path_fn = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$accept_node_fn = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$begin_visit_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$end_visit_fn = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$param = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$hierarchical_visitor_native.class, hierarchical_visitor.$sym1$HIERARCHICAL_VISITOR, hierarchical_visitor.$sym2$HIERARCHICAL_VISITOR_P, hierarchical_visitor.$list3, hierarchical_visitor.$list4, new String[] { "$begin_path_fn", "$end_path_fn", "$accept_node_fn", "$begin_visit_fn", "$end_visit_fn", "$param" }, hierarchical_visitor.$list5, hierarchical_visitor.$list6, hierarchical_visitor.$sym7$PRINT_HIERACHICAL_VISITOR);
        }
    }
    
    public static final class $hierarchical_visitor_p$UnaryFunction extends UnaryFunction
    {
        public $hierarchical_visitor_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HIERARCHICAL-VISITOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hierarchical_visitor.hierarchical_visitor_p(arg1);
        }
    }
}

/*

	Total time: 145 ms
	
*/