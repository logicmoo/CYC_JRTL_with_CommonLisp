/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HIERARCHICAL-VISITOR
 * source file: /cyc/top/cycl/hierarchical-visitor.lisp
 * created:     2019/07/03 17:37:15
 */
public final class hierarchical_visitor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new hierarchical_visitor();



    // deflexical
    @LispMethod(comment = "The default value to use for a hierarchical visitor when\r\nthe callback is not supposed to do anything.\ndeflexical\nThe default value to use for a hierarchical visitor when\nthe callback is not supposed to do anything.")
    // Definitions
    /**
     * The default value to use for a hierarchical visitor when
     * the callback is not supposed to do anything.
     */
    public static final SubLSymbol $default_hierarchical_visitor_noop_callback$ = makeSymbol("*DEFAULT-HIERARCHICAL-VISITOR-NOOP-CALLBACK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_hierarchical_visitor$ = makeSymbol("*DTP-HIERARCHICAL-VISITOR*");

    private static final SubLSymbol HIERARCHICAL_VISITOR = makeSymbol("HIERARCHICAL-VISITOR");

    private static final SubLSymbol HIERARCHICAL_VISITOR_P = makeSymbol("HIERARCHICAL-VISITOR-P");

    static private final SubLList $list3 = list(makeSymbol("BEGIN-PATH-FN"), makeSymbol("END-PATH-FN"), makeSymbol("ACCEPT-NODE-FN"), makeSymbol("BEGIN-VISIT-FN"), makeSymbol("END-VISIT-FN"), makeSymbol("PARAM"));

    static private final SubLList $list4 = list(makeKeyword("BEGIN-PATH-FN"), makeKeyword("END-PATH-FN"), makeKeyword("ACCEPT-NODE-FN"), makeKeyword("BEGIN-VISIT-FN"), makeKeyword("END-VISIT-FN"), makeKeyword("PARAM"));

    static private final SubLList $list5 = list(makeSymbol("HIER-VISIT-BEGIN-PATH-FN"), makeSymbol("HIER-VISIT-END-PATH-FN"), makeSymbol("HIER-VISIT-ACCEPT-NODE-FN"), makeSymbol("HIER-VISIT-BEGIN-VISIT-FN"), makeSymbol("HIER-VISIT-END-VISIT-FN"), makeSymbol("HIER-VISIT-PARAM"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN"), makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN"), makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN"), makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN"), makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN"), makeSymbol("_CSETF-HIER-VISIT-PARAM"));

    private static final SubLSymbol PRINT_HIERACHICAL_VISITOR = makeSymbol("PRINT-HIERACHICAL-VISITOR");

    private static final SubLSymbol HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HIERARCHICAL-VISITOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HIERARCHICAL-VISITOR-P"));

    private static final SubLSymbol HIER_VISIT_BEGIN_PATH_FN = makeSymbol("HIER-VISIT-BEGIN-PATH-FN");

    private static final SubLSymbol _CSETF_HIER_VISIT_BEGIN_PATH_FN = makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN");

    private static final SubLSymbol HIER_VISIT_END_PATH_FN = makeSymbol("HIER-VISIT-END-PATH-FN");

    private static final SubLSymbol _CSETF_HIER_VISIT_END_PATH_FN = makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN");

    private static final SubLSymbol HIER_VISIT_ACCEPT_NODE_FN = makeSymbol("HIER-VISIT-ACCEPT-NODE-FN");

    private static final SubLSymbol _CSETF_HIER_VISIT_ACCEPT_NODE_FN = makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN");

    private static final SubLSymbol HIER_VISIT_BEGIN_VISIT_FN = makeSymbol("HIER-VISIT-BEGIN-VISIT-FN");

    private static final SubLSymbol _CSETF_HIER_VISIT_BEGIN_VISIT_FN = makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN");

    private static final SubLSymbol HIER_VISIT_END_VISIT_FN = makeSymbol("HIER-VISIT-END-VISIT-FN");

    private static final SubLSymbol _CSETF_HIER_VISIT_END_VISIT_FN = makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN");

    private static final SubLSymbol HIER_VISIT_PARAM = makeSymbol("HIER-VISIT-PARAM");

    private static final SubLSymbol _CSETF_HIER_VISIT_PARAM = makeSymbol("_CSETF-HIER-VISIT-PARAM");

    private static final SubLSymbol $BEGIN_PATH_FN = makeKeyword("BEGIN-PATH-FN");

    private static final SubLSymbol $END_PATH_FN = makeKeyword("END-PATH-FN");

    private static final SubLSymbol $ACCEPT_NODE_FN = makeKeyword("ACCEPT-NODE-FN");

    private static final SubLSymbol $BEGIN_VISIT_FN = makeKeyword("BEGIN-VISIT-FN");

    private static final SubLSymbol $END_VISIT_FN = makeKeyword("END-VISIT-FN");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_HIERARCHICAL_VISITOR = makeSymbol("MAKE-HIERARCHICAL-VISITOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HIERARCHICAL_VISITOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HIERARCHICAL-VISITOR-METHOD");

    private static final SubLString $str34$__Visit__ = makeString(" (Visit: ");

    private static final SubLString $str35$__Path__ = makeString(" (Path: ");

    private static final SubLString $str36$_Node__ = makeString(" Node: ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str38$__ = makeString(") ");

    private static final SubLString $str39$__Param__ = makeString(") Param: ");

    private static final SubLSymbol PRINT_HIER_VISITOR_BEGIN_VISIT = makeSymbol("PRINT-HIER-VISITOR-BEGIN-VISIT");

    private static final SubLSymbol PRINT_HIER_VISITOR_BEGIN_PATH = makeSymbol("PRINT-HIER-VISITOR-BEGIN-PATH");

    private static final SubLSymbol PRINT_HIER_VISITOR_ACCEPT_NODE = makeSymbol("PRINT-HIER-VISITOR-ACCEPT-NODE");

    private static final SubLSymbol PRINT_HIER_VISITOR_END_PATH = makeSymbol("PRINT-HIER-VISITOR-END-PATH");

    private static final SubLSymbol PRINT_HIER_VISITOR_END_VISIT = makeSymbol("PRINT-HIER-VISITOR-END-VISIT");

    private static final SubLString $str45$__Begin_visit_of__A___ = makeString("~&Begin visit of ~A.~%");

    private static final SubLString $str46$__End_visit_of__A___ = makeString("~&End visit of ~A.~%");

    private static final SubLString $str47$__Begin_path__A__ = makeString("~&Begin path ~A~%");

    private static final SubLString $str48$__End_path__A__ = makeString("~&End path ~A~%");

    private static final SubLString $str49$__Node__A__ = makeString("~&Node ~A~%");

    private static final SubLString $str50$CHECKING_OFF_VISITED_NODES_FN_exp = makeString("CHECKING-OFF-VISITED-NODES-FN expects a SET-P of expected paths as visitor parameter.");

    private static final SubLString $str51$GATHER_VISITED_NODE_PATHS_FN_expe = makeString("GATHER-VISITED-NODE-PATHS-FN expects a SET-P of expected paths as visitor paramter.");

    public static final SubLObject hierarchical_visitor_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_hierachical_visitor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hierarchical_visitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hierachical_visitor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject hierarchical_visitor_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.hierarchical_visitor.$hierarchical_visitor_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject hierarchical_visitor_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.hierarchical_visitor.$hierarchical_visitor_native.class ? T : NIL;
    }

    public static final SubLObject hier_visit_begin_path_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.getField2();
    }

    public static SubLObject hier_visit_begin_path_fn(final SubLObject v_object) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject hier_visit_end_path_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.getField3();
    }

    public static SubLObject hier_visit_end_path_fn(final SubLObject v_object) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject hier_visit_accept_node_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.getField4();
    }

    public static SubLObject hier_visit_accept_node_fn(final SubLObject v_object) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject hier_visit_begin_visit_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.getField5();
    }

    public static SubLObject hier_visit_begin_visit_fn(final SubLObject v_object) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject hier_visit_end_visit_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.getField6();
    }

    public static SubLObject hier_visit_end_visit_fn(final SubLObject v_object) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject hier_visit_param_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.getField7();
    }

    public static SubLObject hier_visit_param(final SubLObject v_object) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_hier_visit_begin_path_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hier_visit_begin_path_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_hier_visit_end_path_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hier_visit_end_path_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_hier_visit_accept_node_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_hier_visit_accept_node_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_hier_visit_begin_visit_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_hier_visit_begin_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_hier_visit_end_visit_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_hier_visit_end_visit_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_hier_visit_param_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HIERARCHICAL_VISITOR_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_hier_visit_param(final SubLObject v_object, final SubLObject value) {
        assert NIL != hierarchical_visitor_p(v_object) : "! hierarchical_visitor.hierarchical_visitor_p(v_object) " + "hierarchical_visitor.hierarchical_visitor_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_hierarchical_visitor_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.hierarchical_visitor.$hierarchical_visitor_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($BEGIN_PATH_FN)) {
                        _csetf_hier_visit_begin_path_fn(v_new, current_value);
                    } else {
                        if (pcase_var.eql($END_PATH_FN)) {
                            _csetf_hier_visit_end_path_fn(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ACCEPT_NODE_FN)) {
                                _csetf_hier_visit_accept_node_fn(v_new, current_value);
                            } else {
                                if (pcase_var.eql($BEGIN_VISIT_FN)) {
                                    _csetf_hier_visit_begin_visit_fn(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($END_VISIT_FN)) {
                                        _csetf_hier_visit_end_visit_fn(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PARAM)) {
                                            _csetf_hier_visit_param(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt27$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_hierarchical_visitor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.hierarchical_visitor.$hierarchical_visitor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BEGIN_PATH_FN)) {
                _csetf_hier_visit_begin_path_fn(v_new, current_value);
            } else
                if (pcase_var.eql($END_PATH_FN)) {
                    _csetf_hier_visit_end_path_fn(v_new, current_value);
                } else
                    if (pcase_var.eql($ACCEPT_NODE_FN)) {
                        _csetf_hier_visit_accept_node_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql($BEGIN_VISIT_FN)) {
                            _csetf_hier_visit_begin_visit_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($END_VISIT_FN)) {
                                _csetf_hier_visit_end_visit_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARAM)) {
                                    _csetf_hier_visit_param(v_new, current_value);
                                } else {
                                    Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hierarchical_visitor(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HIERARCHICAL_VISITOR, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BEGIN_PATH_FN, hier_visit_begin_path_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $END_PATH_FN, hier_visit_end_path_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCEPT_NODE_FN, hier_visit_accept_node_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $BEGIN_VISIT_FN, hier_visit_begin_visit_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $END_VISIT_FN, hier_visit_end_visit_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAM, hier_visit_param(obj));
        funcall(visitor_fn, obj, $END, MAKE_HIERARCHICAL_VISITOR, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hierarchical_visitor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hierarchical_visitor(obj, visitor_fn);
    }

    public static final SubLObject print_hierachical_visitor_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt28$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write_string($str_alt30$__Visit__, stream, UNPROVIDED, UNPROVIDED);
                    princ(hier_visit_begin_visit_fn(v_object), stream);
                    write_string($str_alt31$__Path__, stream, UNPROVIDED, UNPROVIDED);
                    princ(hier_visit_begin_path_fn(v_object), stream);
                    write_string($str_alt32$_Node__, stream, UNPROVIDED, UNPROVIDED);
                    princ(hier_visit_accept_node_fn(v_object), stream);
                    write_string($str_alt33$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(hier_visit_end_path_fn(v_object), stream);
                    write_string($str_alt34$__, stream, UNPROVIDED, UNPROVIDED);
                    princ(hier_visit_end_path_fn(v_object), stream);
                    write_string($str_alt35$__Param__, stream, UNPROVIDED, UNPROVIDED);
                    princ(hier_visit_param(v_object), stream);
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_hierachical_visitor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str34$__Visit__, stream, UNPROVIDED, UNPROVIDED);
            princ(hier_visit_begin_visit_fn(v_object), stream);
            write_string($str35$__Path__, stream, UNPROVIDED, UNPROVIDED);
            princ(hier_visit_begin_path_fn(v_object), stream);
            write_string($str36$_Node__, stream, UNPROVIDED, UNPROVIDED);
            princ(hier_visit_accept_node_fn(v_object), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(hier_visit_end_path_fn(v_object), stream);
            write_string($str38$__, stream, UNPROVIDED, UNPROVIDED);
            princ(hier_visit_end_path_fn(v_object), stream);
            write_string($str39$__Param__, stream, UNPROVIDED, UNPROVIDED);
            princ(hier_visit_param(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    /**
     * Create a new hierarchical visitor object.
     */
    @LispMethod(comment = "Create a new hierarchical visitor object.")
    public static final SubLObject new_hiearchical_visitor_alt(SubLObject begin_visit_fn, SubLObject begin_path_fn, SubLObject accept_node_fn, SubLObject end_path_fn, SubLObject end_visit_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        {
            SubLObject hier_visit = make_hierarchical_visitor(UNPROVIDED);
            _csetf_hier_visit_begin_visit_fn(hier_visit, begin_visit_fn);
            _csetf_hier_visit_begin_path_fn(hier_visit, begin_path_fn);
            _csetf_hier_visit_accept_node_fn(hier_visit, accept_node_fn);
            _csetf_hier_visit_end_path_fn(hier_visit, end_path_fn);
            _csetf_hier_visit_end_visit_fn(hier_visit, end_visit_fn);
            _csetf_hier_visit_param(hier_visit, param);
            return hier_visit;
        }
    }

    /**
     * Create a new hierarchical visitor object.
     */
    @LispMethod(comment = "Create a new hierarchical visitor object.")
    public static SubLObject new_hiearchical_visitor(final SubLObject begin_visit_fn, final SubLObject begin_path_fn, final SubLObject accept_node_fn, final SubLObject end_path_fn, final SubLObject end_visit_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        final SubLObject hier_visit = make_hierarchical_visitor(UNPROVIDED);
        _csetf_hier_visit_begin_visit_fn(hier_visit, begin_visit_fn);
        _csetf_hier_visit_begin_path_fn(hier_visit, begin_path_fn);
        _csetf_hier_visit_accept_node_fn(hier_visit, accept_node_fn);
        _csetf_hier_visit_end_path_fn(hier_visit, end_path_fn);
        _csetf_hier_visit_end_visit_fn(hier_visit, end_visit_fn);
        _csetf_hier_visit_param(hier_visit, param);
        return hier_visit;
    }

    /**
     * Make a hierarchical visitor that skips the begin/end visit notification and
     * requires no parameter.
     */
    @LispMethod(comment = "Make a hierarchical visitor that skips the begin/end visit notification and\r\nrequires no parameter.\nMake a hierarchical visitor that skips the begin/end visit notification and\nrequires no parameter.")
    public static final SubLObject new_simple_hierarchical_visitor_alt(SubLObject begin_path_fn, SubLObject accept_node_fn, SubLObject end_path_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        return new_hiearchical_visitor($default_hierarchical_visitor_noop_callback$.getGlobalValue(), begin_path_fn, accept_node_fn, end_path_fn, $default_hierarchical_visitor_noop_callback$.getGlobalValue(), param);
    }

    /**
     * Make a hierarchical visitor that skips the begin/end visit notification and
     * requires no parameter.
     */
    @LispMethod(comment = "Make a hierarchical visitor that skips the begin/end visit notification and\r\nrequires no parameter.\nMake a hierarchical visitor that skips the begin/end visit notification and\nrequires no parameter.")
    public static SubLObject new_simple_hierarchical_visitor(final SubLObject begin_path_fn, final SubLObject accept_node_fn, final SubLObject end_path_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        return new_hiearchical_visitor($default_hierarchical_visitor_noop_callback$.getGlobalValue(), begin_path_fn, accept_node_fn, end_path_fn, $default_hierarchical_visitor_noop_callback$.getGlobalValue(), param);
    }

    /**
     * Inform the hierarchical visitor that the visit is about to begin.
     * The result of the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Inform the hierarchical visitor that the visit is about to begin.\r\nThe result of the responsible callback is the result of the call.\nInform the hierarchical visitor that the visit is about to begin.\nThe result of the responsible callback is the result of the call.")
    public static final SubLObject hierarchical_visitor_begin_visit_alt(SubLObject hier_visitor) {
        return funcall(hier_visit_begin_visit_fn(hier_visitor), hier_visitor);
    }

    /**
     * Inform the hierarchical visitor that the visit is about to begin.
     * The result of the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Inform the hierarchical visitor that the visit is about to begin.\r\nThe result of the responsible callback is the result of the call.\nInform the hierarchical visitor that the visit is about to begin.\nThe result of the responsible callback is the result of the call.")
    public static SubLObject hierarchical_visitor_begin_visit(final SubLObject hier_visitor) {
        return funcall(hier_visit_begin_visit_fn(hier_visitor), hier_visitor);
    }

    /**
     * Inform the hierarchical visitor that the visit is about to begin.
     * The result of the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Inform the hierarchical visitor that the visit is about to begin.\r\nThe result of the responsible callback is the result of the call.\nInform the hierarchical visitor that the visit is about to begin.\nThe result of the responsible callback is the result of the call.")
    public static final SubLObject hierarchical_visitor_end_visit_alt(SubLObject hier_visitor) {
        return funcall(hier_visit_end_visit_fn(hier_visitor), hier_visitor);
    }

    /**
     * Inform the hierarchical visitor that the visit is about to begin.
     * The result of the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Inform the hierarchical visitor that the visit is about to begin.\r\nThe result of the responsible callback is the result of the call.\nInform the hierarchical visitor that the visit is about to begin.\nThe result of the responsible callback is the result of the call.")
    public static SubLObject hierarchical_visitor_end_visit(final SubLObject hier_visitor) {
        return funcall(hier_visit_end_visit_fn(hier_visitor), hier_visitor);
    }

    /**
     * Shows the hierarchical visitor the current leaf node. The result of
     * the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Shows the hierarchical visitor the current leaf node. The result of\r\nthe responsible callback is the result of the call.\nShows the hierarchical visitor the current leaf node. The result of\nthe responsible callback is the result of the call.")
    public static final SubLObject show_hierarchical_visitor_node_alt(SubLObject hier_visitor, SubLObject node) {
        return funcall(hier_visit_accept_node_fn(hier_visitor), hier_visitor, node);
    }

    @LispMethod(comment = "Shows the hierarchical visitor the current leaf node. The result of\r\nthe responsible callback is the result of the call.\nShows the hierarchical visitor the current leaf node. The result of\nthe responsible callback is the result of the call.")
    public static SubLObject show_hierarchical_visitor_node(final SubLObject hier_visitor, final SubLObject node) {
        return funcall(hier_visit_accept_node_fn(hier_visitor), hier_visitor, node);
    }

    /**
     * Shows the hierarchical visitor the current path whose children are
     * about to begin. The result of the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Shows the hierarchical visitor the current path whose children are\r\nabout to begin. The result of the responsible callback is the result of the call.\nShows the hierarchical visitor the current path whose children are\nabout to begin. The result of the responsible callback is the result of the call.")
    public static final SubLObject show_hierarchical_visitor_path_begin_alt(SubLObject hier_visitor, SubLObject path) {
        return funcall(hier_visit_begin_path_fn(hier_visitor), hier_visitor, path);
    }

    @LispMethod(comment = "Shows the hierarchical visitor the current path whose children are\r\nabout to begin. The result of the responsible callback is the result of the call.\nShows the hierarchical visitor the current path whose children are\nabout to begin. The result of the responsible callback is the result of the call.")
    public static SubLObject show_hierarchical_visitor_path_begin(final SubLObject hier_visitor, final SubLObject path) {
        return funcall(hier_visit_begin_path_fn(hier_visitor), hier_visitor, path);
    }

    /**
     * Shows the hierarchical visitor the current path whose children were just
     * all shown. The result of the responsible callback is the result of the call.
     */
    @LispMethod(comment = "Shows the hierarchical visitor the current path whose children were just\r\nall shown. The result of the responsible callback is the result of the call.\nShows the hierarchical visitor the current path whose children were just\nall shown. The result of the responsible callback is the result of the call.")
    public static final SubLObject show_hierarchical_visitor_path_end_alt(SubLObject hier_visitor, SubLObject path) {
        return funcall(hier_visit_end_path_fn(hier_visitor), hier_visitor, path);
    }

    @LispMethod(comment = "Shows the hierarchical visitor the current path whose children were just\r\nall shown. The result of the responsible callback is the result of the call.\nShows the hierarchical visitor the current path whose children were just\nall shown. The result of the responsible callback is the result of the call.")
    public static SubLObject show_hierarchical_visitor_path_end(final SubLObject hier_visitor, final SubLObject path) {
        return funcall(hier_visit_end_path_fn(hier_visitor), hier_visitor, path);
    }

    /**
     * Mutate the hierarchical visitor to have a new parameter than the
     * one the visitor was instantiated with. This method is intended for use
     * by the visitor itself, e.g. for initialization during the
     * begin-visit callback.
     *
     * @return the old value of the parameter
     */
    @LispMethod(comment = "Mutate the hierarchical visitor to have a new parameter than the\r\none the visitor was instantiated with. This method is intended for use\r\nby the visitor itself, e.g. for initialization during the\r\nbegin-visit callback.\r\n\r\n@return the old value of the parameter\nMutate the hierarchical visitor to have a new parameter than the\none the visitor was instantiated with. This method is intended for use\nby the visitor itself, e.g. for initialization during the\nbegin-visit callback.")
    public static final SubLObject set_hierarchical_visitor_parameter_alt(SubLObject hier_visitor, SubLObject new_param) {
        {
            SubLObject old_param = get_hierarchical_visitor_parameter(hier_visitor);
            _csetf_hier_visit_param(hier_visitor, new_param);
            return old_param;
        }
    }

    @LispMethod(comment = "Mutate the hierarchical visitor to have a new parameter than the\r\none the visitor was instantiated with. This method is intended for use\r\nby the visitor itself, e.g. for initialization during the\r\nbegin-visit callback.\r\n\r\n@return the old value of the parameter\nMutate the hierarchical visitor to have a new parameter than the\none the visitor was instantiated with. This method is intended for use\nby the visitor itself, e.g. for initialization during the\nbegin-visit callback.")
    public static SubLObject set_hierarchical_visitor_parameter(final SubLObject hier_visitor, final SubLObject new_param) {
        final SubLObject old_param = get_hierarchical_visitor_parameter(hier_visitor);
        _csetf_hier_visit_param(hier_visitor, new_param);
        return old_param;
    }

    /**
     * Provide access to the parameter for the hierarchical visitor.
     * This method is expected to be called from within the callback
     * of the hierarchical visitor.
     *
     * @return the parameter provided during the visitor construction
     */
    @LispMethod(comment = "Provide access to the parameter for the hierarchical visitor.\r\nThis method is expected to be called from within the callback\r\nof the hierarchical visitor.\r\n\r\n@return the parameter provided during the visitor construction\nProvide access to the parameter for the hierarchical visitor.\nThis method is expected to be called from within the callback\nof the hierarchical visitor.")
    public static final SubLObject get_hierarchical_visitor_parameter_alt(SubLObject hier_visitor) {
        return hier_visit_param(hier_visitor);
    }

    @LispMethod(comment = "Provide access to the parameter for the hierarchical visitor.\r\nThis method is expected to be called from within the callback\r\nof the hierarchical visitor.\r\n\r\n@return the parameter provided during the visitor construction\nProvide access to the parameter for the hierarchical visitor.\nThis method is expected to be called from within the callback\nof the hierarchical visitor.")
    public static SubLObject get_hierarchical_visitor_parameter(final SubLObject hier_visitor) {
        return hier_visit_param(hier_visitor);
    }

    /**
     * A print visitor that merely traces the values being passed in.
     */
    @LispMethod(comment = "A print visitor that merely traces the values being passed in.")
    public static final SubLObject new_hierarchical_print_visitor_alt() {
        return new_hiearchical_visitor(PRINT_HIER_VISITOR_BEGIN_VISIT, PRINT_HIER_VISITOR_BEGIN_PATH, PRINT_HIER_VISITOR_ACCEPT_NODE, PRINT_HIER_VISITOR_END_PATH, PRINT_HIER_VISITOR_END_VISIT, UNPROVIDED);
    }

    @LispMethod(comment = "A print visitor that merely traces the values being passed in.")
    public static SubLObject new_hierarchical_print_visitor() {
        return new_hiearchical_visitor(PRINT_HIER_VISITOR_BEGIN_VISIT, PRINT_HIER_VISITOR_BEGIN_PATH, PRINT_HIER_VISITOR_ACCEPT_NODE, PRINT_HIER_VISITOR_END_PATH, PRINT_HIER_VISITOR_END_VISIT, UNPROVIDED);
    }

    public static final SubLObject print_hier_visitor_begin_visit_alt(SubLObject visitor) {
        return format(T, $str_alt42$__Begin_visit_of__A___, visitor);
    }

    public static SubLObject print_hier_visitor_begin_visit(final SubLObject visitor) {
        return format(T, $str45$__Begin_visit_of__A___, visitor);
    }

    public static final SubLObject print_hier_visitor_end_visit_alt(SubLObject visitor) {
        return format(T, $str_alt43$__End_visit_of__A___, visitor);
    }

    public static SubLObject print_hier_visitor_end_visit(final SubLObject visitor) {
        return format(T, $str46$__End_visit_of__A___, visitor);
    }

    public static final SubLObject print_hier_visitor_begin_path_alt(SubLObject visitor, SubLObject path) {
        return format(T, $str_alt44$__Begin_path__A__, path);
    }

    public static SubLObject print_hier_visitor_begin_path(final SubLObject visitor, final SubLObject path) {
        return format(T, $str47$__Begin_path__A__, path);
    }

    public static final SubLObject print_hier_visitor_end_path_alt(SubLObject visitor, SubLObject path) {
        return format(T, $str_alt45$__End_path__A__, path);
    }

    public static SubLObject print_hier_visitor_end_path(final SubLObject visitor, final SubLObject path) {
        return format(T, $str48$__End_path__A__, path);
    }

    public static final SubLObject print_hier_visitor_accept_node_alt(SubLObject visitor, SubLObject node) {
        return format(T, $str_alt46$__Node__A__, node, visitor);
    }

    public static SubLObject print_hier_visitor_accept_node(final SubLObject visitor, final SubLObject node) {
        return format(T, $str49$__Node__A__, node, visitor);
    }

    /**
     * A visitor that does nothing with each element.
     */
    @LispMethod(comment = "A visitor that does nothing with each element.")
    public static final SubLObject new_no_op_hierarchical_visitor_alt() {
        return new_simple_hierarchical_visitor($default_hierarchical_visitor_noop_callback$.getGlobalValue(), $default_hierarchical_visitor_noop_callback$.getGlobalValue(), $default_hierarchical_visitor_noop_callback$.getGlobalValue(), UNPROVIDED);
    }

    @LispMethod(comment = "A visitor that does nothing with each element.")
    public static SubLObject new_no_op_hierarchical_visitor() {
        return new_simple_hierarchical_visitor($default_hierarchical_visitor_noop_callback$.getGlobalValue(), $default_hierarchical_visitor_noop_callback$.getGlobalValue(), $default_hierarchical_visitor_noop_callback$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject new_node_only_hierarchical_visitor(final SubLObject node_visit_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        return new_simple_hierarchical_visitor($default_hierarchical_visitor_noop_callback$.getGlobalValue(), node_visit_fn, $default_hierarchical_visitor_noop_callback$.getGlobalValue(), param);
    }

    public static SubLObject prin1_visited_node_paths_fn(final SubLObject visitor, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = second(node);
        final SubLObject raw_stream = get_hierarchical_visitor_parameter(visitor);
        final SubLObject stream = (NIL == raw_stream) ? StreamsLow.$standard_output$.getDynamicValue(thread) : raw_stream;
        prin1(path, stream);
        terpri(stream);
        return node;
    }

    public static SubLObject checking_off_visited_nodes_fn(final SubLObject visitor, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = second(node);
        final SubLObject expected_paths = get_hierarchical_visitor_parameter(visitor);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set.set_p(expected_paths))) {
            Errors.error($str50$CHECKING_OFF_VISITED_NODES_FN_exp);
        }
        set.set_remove(path, expected_paths);
        return node;
    }

    public static SubLObject gather_visited_node_paths_fn(final SubLObject visitor, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = second(node);
        final SubLObject visited_paths = get_hierarchical_visitor_parameter(visitor);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set.set_p(visited_paths))) {
            Errors.error($str51$GATHER_VISITED_NODE_PATHS_FN_expe);
        }
        set.set_add(path, visited_paths);
        return node;
    }

    public static SubLObject declare_hierarchical_visitor_file() {
        declareFunction("hierarchical_visitor_print_function_trampoline", "HIERARCHICAL-VISITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hierarchical_visitor_p", "HIERARCHICAL-VISITOR-P", 1, 0, false);
        new hierarchical_visitor.$hierarchical_visitor_p$UnaryFunction();
        declareFunction("hier_visit_begin_path_fn", "HIER-VISIT-BEGIN-PATH-FN", 1, 0, false);
        declareFunction("hier_visit_end_path_fn", "HIER-VISIT-END-PATH-FN", 1, 0, false);
        declareFunction("hier_visit_accept_node_fn", "HIER-VISIT-ACCEPT-NODE-FN", 1, 0, false);
        declareFunction("hier_visit_begin_visit_fn", "HIER-VISIT-BEGIN-VISIT-FN", 1, 0, false);
        declareFunction("hier_visit_end_visit_fn", "HIER-VISIT-END-VISIT-FN", 1, 0, false);
        declareFunction("hier_visit_param", "HIER-VISIT-PARAM", 1, 0, false);
        declareFunction("_csetf_hier_visit_begin_path_fn", "_CSETF-HIER-VISIT-BEGIN-PATH-FN", 2, 0, false);
        declareFunction("_csetf_hier_visit_end_path_fn", "_CSETF-HIER-VISIT-END-PATH-FN", 2, 0, false);
        declareFunction("_csetf_hier_visit_accept_node_fn", "_CSETF-HIER-VISIT-ACCEPT-NODE-FN", 2, 0, false);
        declareFunction("_csetf_hier_visit_begin_visit_fn", "_CSETF-HIER-VISIT-BEGIN-VISIT-FN", 2, 0, false);
        declareFunction("_csetf_hier_visit_end_visit_fn", "_CSETF-HIER-VISIT-END-VISIT-FN", 2, 0, false);
        declareFunction("_csetf_hier_visit_param", "_CSETF-HIER-VISIT-PARAM", 2, 0, false);
        declareFunction("make_hierarchical_visitor", "MAKE-HIERARCHICAL-VISITOR", 0, 1, false);
        declareFunction("visit_defstruct_hierarchical_visitor", "VISIT-DEFSTRUCT-HIERARCHICAL-VISITOR", 2, 0, false);
        declareFunction("visit_defstruct_object_hierarchical_visitor_method", "VISIT-DEFSTRUCT-OBJECT-HIERARCHICAL-VISITOR-METHOD", 2, 0, false);
        declareFunction("print_hierachical_visitor", "PRINT-HIERACHICAL-VISITOR", 3, 0, false);
        declareFunction("new_hiearchical_visitor", "NEW-HIEARCHICAL-VISITOR", 5, 1, false);
        declareFunction("new_simple_hierarchical_visitor", "NEW-SIMPLE-HIERARCHICAL-VISITOR", 3, 1, false);
        declareFunction("hierarchical_visitor_begin_visit", "HIERARCHICAL-VISITOR-BEGIN-VISIT", 1, 0, false);
        declareFunction("hierarchical_visitor_end_visit", "HIERARCHICAL-VISITOR-END-VISIT", 1, 0, false);
        declareFunction("show_hierarchical_visitor_node", "SHOW-HIERARCHICAL-VISITOR-NODE", 2, 0, false);
        declareFunction("show_hierarchical_visitor_path_begin", "SHOW-HIERARCHICAL-VISITOR-PATH-BEGIN", 2, 0, false);
        declareFunction("show_hierarchical_visitor_path_end", "SHOW-HIERARCHICAL-VISITOR-PATH-END", 2, 0, false);
        declareFunction("set_hierarchical_visitor_parameter", "SET-HIERARCHICAL-VISITOR-PARAMETER", 2, 0, false);
        declareFunction("get_hierarchical_visitor_parameter", "GET-HIERARCHICAL-VISITOR-PARAMETER", 1, 0, false);
        declareFunction("new_hierarchical_print_visitor", "NEW-HIERARCHICAL-PRINT-VISITOR", 0, 0, false);
        declareFunction("print_hier_visitor_begin_visit", "PRINT-HIER-VISITOR-BEGIN-VISIT", 1, 0, false);
        declareFunction("print_hier_visitor_end_visit", "PRINT-HIER-VISITOR-END-VISIT", 1, 0, false);
        declareFunction("print_hier_visitor_begin_path", "PRINT-HIER-VISITOR-BEGIN-PATH", 2, 0, false);
        declareFunction("print_hier_visitor_end_path", "PRINT-HIER-VISITOR-END-PATH", 2, 0, false);
        declareFunction("print_hier_visitor_accept_node", "PRINT-HIER-VISITOR-ACCEPT-NODE", 2, 0, false);
        declareFunction("new_no_op_hierarchical_visitor", "NEW-NO-OP-HIERARCHICAL-VISITOR", 0, 0, false);
        declareFunction("new_node_only_hierarchical_visitor", "NEW-NODE-ONLY-HIERARCHICAL-VISITOR", 1, 1, false);
        declareFunction("prin1_visited_node_paths_fn", "PRIN1-VISITED-NODE-PATHS-FN", 2, 0, false);
        declareFunction("checking_off_visited_nodes_fn", "CHECKING-OFF-VISITED-NODES-FN", 2, 0, false);
        declareFunction("gather_visited_node_paths_fn", "GATHER-VISITED-NODE-PATHS-FN", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("BEGIN-PATH-FN"), makeSymbol("END-PATH-FN"), makeSymbol("ACCEPT-NODE-FN"), makeSymbol("BEGIN-VISIT-FN"), makeSymbol("END-VISIT-FN"), makeSymbol("PARAM"));

    static private final SubLList $list_alt4 = list(makeKeyword("BEGIN-PATH-FN"), makeKeyword("END-PATH-FN"), makeKeyword("ACCEPT-NODE-FN"), makeKeyword("BEGIN-VISIT-FN"), makeKeyword("END-VISIT-FN"), makeKeyword("PARAM"));

    static private final SubLList $list_alt5 = list(makeSymbol("HIER-VISIT-BEGIN-PATH-FN"), makeSymbol("HIER-VISIT-END-PATH-FN"), makeSymbol("HIER-VISIT-ACCEPT-NODE-FN"), makeSymbol("HIER-VISIT-BEGIN-VISIT-FN"), makeSymbol("HIER-VISIT-END-VISIT-FN"), makeSymbol("HIER-VISIT-PARAM"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-HIER-VISIT-BEGIN-PATH-FN"), makeSymbol("_CSETF-HIER-VISIT-END-PATH-FN"), makeSymbol("_CSETF-HIER-VISIT-ACCEPT-NODE-FN"), makeSymbol("_CSETF-HIER-VISIT-BEGIN-VISIT-FN"), makeSymbol("_CSETF-HIER-VISIT-END-VISIT-FN"), makeSymbol("_CSETF-HIER-VISIT-PARAM"));

    static private final SubLString $str_alt27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt28$__ = makeString("#<");

    static private final SubLString $str_alt30$__Visit__ = makeString(" (Visit: ");

    public static SubLObject init_hierarchical_visitor_file() {
        deflexical("*DEFAULT-HIERARCHICAL-VISITOR-NOOP-CALLBACK*", symbol_function(FALSE));
        defconstant("*DTP-HIERARCHICAL-VISITOR*", HIERARCHICAL_VISITOR);
        return NIL;
    }

    static private final SubLString $str_alt31$__Path__ = makeString(" (Path: ");

    static private final SubLString $str_alt32$_Node__ = makeString(" Node: ");

    static private final SubLString $str_alt33$_ = makeString(" ");

    public static SubLObject setup_hierarchical_visitor_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_hierarchical_visitor$.getGlobalValue(), symbol_function(HIERARCHICAL_VISITOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(HIER_VISIT_BEGIN_PATH_FN, _CSETF_HIER_VISIT_BEGIN_PATH_FN);
        def_csetf(HIER_VISIT_END_PATH_FN, _CSETF_HIER_VISIT_END_PATH_FN);
        def_csetf(HIER_VISIT_ACCEPT_NODE_FN, _CSETF_HIER_VISIT_ACCEPT_NODE_FN);
        def_csetf(HIER_VISIT_BEGIN_VISIT_FN, _CSETF_HIER_VISIT_BEGIN_VISIT_FN);
        def_csetf(HIER_VISIT_END_VISIT_FN, _CSETF_HIER_VISIT_END_VISIT_FN);
        def_csetf(HIER_VISIT_PARAM, _CSETF_HIER_VISIT_PARAM);
        identity(HIERARCHICAL_VISITOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hierarchical_visitor$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HIERARCHICAL_VISITOR_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt34$__ = makeString(") ");

    static private final SubLString $str_alt35$__Param__ = makeString(") Param: ");

    static private final SubLString $str_alt42$__Begin_visit_of__A___ = makeString("~&Begin visit of ~A.~%");

    static private final SubLString $str_alt43$__End_visit_of__A___ = makeString("~&End visit of ~A.~%");

    static private final SubLString $str_alt44$__Begin_path__A__ = makeString("~&Begin path ~A~%");

    @Override
    public void declareFunctions() {
        declare_hierarchical_visitor_file();
    }

    static private final SubLString $str_alt45$__End_path__A__ = makeString("~&End path ~A~%");

    @Override
    public void initializeVariables() {
        init_hierarchical_visitor_file();
    }

    static private final SubLString $str_alt46$__Node__A__ = makeString("~&Node ~A~%");

    @Override
    public void runTopLevelForms() {
        setup_hierarchical_visitor_file();
    }

    static {
    }

    public static final class $hierarchical_visitor_native extends SubLStructNative {
        public SubLObject $begin_path_fn;

        public SubLObject $end_path_fn;

        public SubLObject $accept_node_fn;

        public SubLObject $begin_visit_fn;

        public SubLObject $end_visit_fn;

        public SubLObject $param;

        private static final SubLStructDeclNative structDecl;

        public $hierarchical_visitor_native() {
            hierarchical_visitor.$hierarchical_visitor_native.this.$begin_path_fn = Lisp.NIL;
            hierarchical_visitor.$hierarchical_visitor_native.this.$end_path_fn = Lisp.NIL;
            hierarchical_visitor.$hierarchical_visitor_native.this.$accept_node_fn = Lisp.NIL;
            hierarchical_visitor.$hierarchical_visitor_native.this.$begin_visit_fn = Lisp.NIL;
            hierarchical_visitor.$hierarchical_visitor_native.this.$end_visit_fn = Lisp.NIL;
            hierarchical_visitor.$hierarchical_visitor_native.this.$param = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$begin_path_fn;
        }

        @Override
        public SubLObject getField3() {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$end_path_fn;
        }

        @Override
        public SubLObject getField4() {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$accept_node_fn;
        }

        @Override
        public SubLObject getField5() {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$begin_visit_fn;
        }

        @Override
        public SubLObject getField6() {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$end_visit_fn;
        }

        @Override
        public SubLObject getField7() {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$param;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$begin_path_fn = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$end_path_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$accept_node_fn = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$begin_visit_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$end_visit_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return hierarchical_visitor.$hierarchical_visitor_native.this.$param = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.hierarchical_visitor.$hierarchical_visitor_native.class, HIERARCHICAL_VISITOR, HIERARCHICAL_VISITOR_P, $list3, $list4, new String[]{ "$begin_path_fn", "$end_path_fn", "$accept_node_fn", "$begin_visit_fn", "$end_visit_fn", "$param" }, $list5, $list6, PRINT_HIERACHICAL_VISITOR);
        }
    }

    public static final class $hierarchical_visitor_p$UnaryFunction extends UnaryFunction {
        public $hierarchical_visitor_p$UnaryFunction() {
            super(extractFunctionNamed("HIERARCHICAL-VISITOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hierarchical_visitor_p(arg1);
        }
    }
}

/**
 * Total time: 145 ms
 */
