/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GHL-SEARCH-VARS
 * source file: /cyc/top/cycl/ghl-search-vars.lisp
 * created:     2019/07/03 17:37:18
 */
public final class ghl_search_vars extends SubLTranslatedFile implements V12 {
    public static final SubLObject set_ghl_search_direction(SubLObject v_search, SubLObject direction) {
        graphl_search_vars.set_graphl_search_direction(ghl_graphl_search(v_search), direction);
        return NIL;
    }

    public static final SubLObject ghl_direction(SubLObject v_search) {
        return graphl_search_vars.graphl_direction(ghl_graphl_search(v_search));
    }

    public static final SubLFile me = new ghl_search_vars();



    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $ghl_search_property_defaults$ = makeSymbol("*GHL-SEARCH-PROPERTY-DEFAULTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ghl_search$ = makeSymbol("*DTP-GHL-SEARCH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $gt_args_swapped_p$ = makeSymbol("*GT-ARGS-SWAPPED-P*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeKeyword("DIRECTIONS"), makeKeyword("FORWARD")), cons(makeKeyword("TV"), makeKeyword("TRUE-DEF")), cons(makeKeyword("ORDER"), makeKeyword("BREADTH-FIRST")));

    private static final SubLSymbol GHL_SEARCH = makeSymbol("GHL-SEARCH");

    private static final SubLSymbol GHL_SEARCH_P = makeSymbol("GHL-SEARCH-P");

    static private final SubLList $list3 = list(makeSymbol("GRAPHL-SEARCH"), makeSymbol("PREDICATES"), makeSymbol("DIRECTIONS"), makeSymbol("TV"));

    static private final SubLList $list4 = list(makeKeyword("GRAPHL-SEARCH"), makeKeyword("PREDICATES"), makeKeyword("DIRECTIONS"), makeKeyword("TV"));

    static private final SubLList $list5 = list(makeSymbol("GHL-SEARCH-GRAPHL-SEARCH"), makeSymbol("GHL-SEARCH-PREDICATES"), makeSymbol("GHL-SEARCH-DIRECTIONS"), makeSymbol("GHL-SEARCH-TV"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH"), makeSymbol("_CSETF-GHL-SEARCH-PREDICATES"), makeSymbol("_CSETF-GHL-SEARCH-DIRECTIONS"), makeSymbol("_CSETF-GHL-SEARCH-TV"));

    private static final SubLSymbol PRINT_GHL_SEARCH = makeSymbol("PRINT-GHL-SEARCH");

    private static final SubLSymbol GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GHL-SEARCH-P"));

    private static final SubLSymbol GHL_SEARCH_GRAPHL_SEARCH = makeSymbol("GHL-SEARCH-GRAPHL-SEARCH");

    private static final SubLSymbol _CSETF_GHL_SEARCH_GRAPHL_SEARCH = makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH");

    private static final SubLSymbol GHL_SEARCH_PREDICATES = makeSymbol("GHL-SEARCH-PREDICATES");

    private static final SubLSymbol _CSETF_GHL_SEARCH_PREDICATES = makeSymbol("_CSETF-GHL-SEARCH-PREDICATES");

    private static final SubLSymbol GHL_SEARCH_DIRECTIONS = makeSymbol("GHL-SEARCH-DIRECTIONS");

    private static final SubLSymbol _CSETF_GHL_SEARCH_DIRECTIONS = makeSymbol("_CSETF-GHL-SEARCH-DIRECTIONS");

    private static final SubLSymbol GHL_SEARCH_TV = makeSymbol("GHL-SEARCH-TV");

    private static final SubLSymbol _CSETF_GHL_SEARCH_TV = makeSymbol("_CSETF-GHL-SEARCH-TV");

    private static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_GHL_SEARCH = makeSymbol("MAKE-GHL-SEARCH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD");

    private static final SubLString $str28$GHL_Search____a__ = makeString("GHL Search : ~a~%");

    private static final SubLString $str29$Predicates__a__ = makeString("Predicates ~a~%");

    private static final SubLString $str30$Directions__a__ = makeString("Directions ~a~%");

    private static final SubLString $str31$TV__s__ = makeString("TV ~s~%");

    private static final SubLList $list35 = cons(makeSymbol("PROP"), makeSymbol("VALUE"));

    private static final SubLSymbol $kw48$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");

    private static final SubLList $list49 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol NEW_GHL_SEARCH = makeSymbol("NEW-GHL-SEARCH");

    private static final SubLList $list52 = list(makeSymbol("RESET-GRAPHL-FINISHED"));

    private static final SubLSymbol DESTROY_GHL_SEARCH = makeSymbol("DESTROY-GHL-SEARCH");

    static private final SubLList $list56 = list(list(makeSymbol("DIR-VAR"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list57 = list(makeKeyword("DONE-VAR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DETERMINE_GHL_RELEVANT_DIRECTIONS = makeSymbol("DETERMINE-GHL-RELEVANT-DIRECTIONS");

    static private final SubLList $list63 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"));

    static private final SubLList $list64 = list(makeKeyword("FORWARD"));

    static private final SubLList $list65 = list(makeKeyword("BACKWARD"));

    private static final SubLList $list66 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sksi_gt_search_pred$ = makeSymbol("*SKSI-GT-SEARCH-PRED*");

    private static final SubLList $list68 = list(makeSymbol("USE-EM?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list71 = list(makeSymbol("BOOLEANP"));

    public static final SubLSymbol $ghl_uses_spec_preds_p$ = makeSymbol("*GHL-USES-SPEC-PREDS-P*");

    private static final SubLList $list73 = list(list(makeSymbol("*GHL-USES-SPEC-PREDS-P*"), T));

    private static final SubLList $list74 = list(list(makeSymbol("*GHL-USES-SPEC-PREDS-P*"), NIL));

    private static final SubLList $list75 = list(list(makeSymbol("*GT-ARGS-SWAPPED-P*"), NIL));

    private static final SubLList $list76 = list(list(makeSymbol("*GT-ARGS-SWAPPED-P*"), T));

    private static final SubLList $list77 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $ghl_trace_level$ = makeSymbol("*GHL-TRACE-LEVEL*");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    public static final SubLObject ghl_search_property_default_alt(SubLObject property) {
        return assoc(property, $ghl_search_property_defaults$.getGlobalValue(), symbol_function(EQ), UNPROVIDED).rest();
    }

    public static SubLObject ghl_search_property_default(final SubLObject property) {
        return assoc(property, $ghl_search_property_defaults$.getGlobalValue(), symbol_function(EQ), UNPROVIDED).rest();
    }

    public static final SubLObject ghl_search_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ghl_search(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ghl_search_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ghl_search(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ghl_search_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ghl_search_vars.$ghl_search_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ghl_search_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ghl_search_vars.$ghl_search_native.class ? T : NIL;
    }

    public static final SubLObject ghl_search_graphl_search_alt(SubLObject v_object) {
        checkType(v_object, ghl_search_vars.GHL_SEARCH_P);
        return (($ghl_search_native)v_object).$graphl_search;
    }

    public static SubLObject ghl_search_graphl_search(final SubLObject v_object) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ghl_search_predicates_alt(SubLObject v_object) {
        checkType(v_object, ghl_search_vars.GHL_SEARCH_P);
        return (($ghl_search_native)v_object).$predicates;
    }

    public static SubLObject ghl_search_predicates(final SubLObject v_object) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ghl_search_directions(final SubLObject v_object) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ghl_search_tv_alt(SubLObject v_object) {
        checkType(v_object, ghl_search_vars.GHL_SEARCH_P);
        return (($ghl_search_native)v_object).$tv;
    }

    public static SubLObject ghl_search_tv(final SubLObject v_object) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_ghl_search_graphl_search_alt(SubLObject v_object, SubLObject value) {
        checkType(v_object, ghl_search_vars.GHL_SEARCH_P);
        return (($ghl_search_native)v_object).$graphl_search = (value);
    }

    public static SubLObject _csetf_ghl_search_graphl_search(final SubLObject v_object, final SubLObject value) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ghl_search_predicates_alt(SubLObject v_object, SubLObject value) {
        checkType(v_object, ghl_search_vars.GHL_SEARCH_P);
        return (($ghl_search_native)v_object).$predicates = (value);
    }

    public static SubLObject _csetf_ghl_search_predicates(final SubLObject v_object, final SubLObject value) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ghl_search_directions(final SubLObject v_object, final SubLObject value) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ghl_search_tv_alt(SubLObject v_object, SubLObject value) {
        checkType(v_object, ghl_search_vars.GHL_SEARCH_P);
        return (($ghl_search_native)v_object).$tv = (value);
    }

    public static SubLObject _csetf_ghl_search_tv(final SubLObject v_object, final SubLObject value) {
        assert NIL != ghl_search_p(v_object) : "! ghl_search_vars.ghl_search_p(v_object) " + "ghl_search_vars.ghl_search_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_ghl_search_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.ghl_search_vars.$ghl_search_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($GRAPHL_SEARCH)) {
                        _csetf_ghl_search_graphl_search(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PREDICATES)) {
                            _csetf_ghl_search_predicates(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TV)) {
                                _csetf_ghl_search_tv(v_new, current_value);
                            } else {
                                Errors.error($str_alt18$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ghl_search(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.ghl_search_vars.$ghl_search_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($GRAPHL_SEARCH)) {
                _csetf_ghl_search_graphl_search(v_new, current_value);
            } else
                if (pcase_var.eql($PREDICATES)) {
                    _csetf_ghl_search_predicates(v_new, current_value);
                } else
                    if (pcase_var.eql($DIRECTIONS)) {
                        _csetf_ghl_search_directions(v_new, current_value);
                    } else
                        if (pcase_var.eql($TV)) {
                            _csetf_ghl_search_tv(v_new, current_value);
                        } else {
                            Errors.error($str22$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ghl_search(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GHL_SEARCH, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $GRAPHL_SEARCH, ghl_search_graphl_search(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATES, ghl_search_predicates(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTIONS, ghl_search_directions(obj));
        funcall(visitor_fn, obj, $SLOT, $TV, ghl_search_tv(obj));
        funcall(visitor_fn, obj, $END, MAKE_GHL_SEARCH, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ghl_search_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ghl_search(obj, visitor_fn);
    }

    public static final SubLObject print_ghl_search_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt19$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_ghl_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, NIL);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return NIL;
    }

    public static final SubLObject describe_ghl_search_alt(SubLObject v_object) {
        format(T, $str_alt22$GHL_Search____a__, v_object);
        format(T, $str_alt23$Predicates__a__, ghl_search_predicates(v_object));
        format(T, $str_alt24$TV__s__, ghl_search_tv(v_object));
        graphl_search_vars.describe_graphl_search(ghl_graphl_search(v_object));
        return NIL;
    }

    public static SubLObject describe_ghl_search(final SubLObject v_object) {
        format(T, $str28$GHL_Search____a__, v_object);
        format(T, $str29$Predicates__a__, ghl_search_predicates(v_object));
        format(T, $str30$Directions__a__, ghl_search_directions(v_object));
        format(T, $str31$TV__s__, ghl_search_tv(v_object));
        graphl_search_vars.describe_graphl_search(ghl_graphl_search(v_object));
        return NIL;
    }

    public static final SubLObject new_ghl_search_alt(SubLObject plist) {
        {
            SubLObject ghl_search = make_ghl_search(UNPROVIDED);
            SubLObject graphl_search = graphl_search_vars.new_graphl_search(NIL);
            set_ghl_graphl_search(ghl_search, graphl_search);
            set_ghl_search_properties(ghl_search, plist);
            return ghl_search;
        }
    }

    public static SubLObject new_ghl_search(final SubLObject plist) {
        final SubLObject ghl_search = make_ghl_search(UNPROVIDED);
        final SubLObject graphl_search = graphl_search_vars.new_graphl_search(NIL);
        set_ghl_graphl_search(ghl_search, graphl_search);
        set_ghl_search_properties(ghl_search, plist);
        return ghl_search;
    }

    public static final SubLObject destroy_ghl_search_alt(SubLObject graph_search) {
        graphl_search_vars.destroy_graphl_search(ghl_search_graphl_search(graph_search));
        _csetf_ghl_search_graphl_search(graph_search, $FREE);
        _csetf_ghl_search_predicates(graph_search, $FREE);
        _csetf_ghl_search_tv(graph_search, $FREE);
        return NIL;
    }

    public static SubLObject destroy_ghl_search(final SubLObject graph_search) {
        graphl_search_vars.destroy_graphl_search(ghl_search_graphl_search(graph_search));
        _csetf_ghl_search_graphl_search(graph_search, $FREE);
        _csetf_ghl_search_predicates(graph_search, $FREE);
        _csetf_ghl_search_directions(graph_search, $FREE);
        _csetf_ghl_search_tv(graph_search, $FREE);
        return NIL;
    }

    public static final SubLObject ghl_graphl_search_alt(SubLObject v_search) {
        return ghl_search_graphl_search(v_search);
    }

    public static SubLObject ghl_graphl_search(final SubLObject v_search) {
        return ghl_search_graphl_search(v_search);
    }

    public static final SubLObject ghl_relevant_predicates_alt(SubLObject v_search) {
        return ghl_search_predicates(v_search);
    }

    public static SubLObject ghl_relevant_predicates(final SubLObject v_search) {
        return ghl_search_predicates(v_search);
    }

    public static SubLObject ghl_relevant_directions(final SubLObject v_search) {
        return ghl_search_directions(v_search);
    }

    public static final SubLObject ghl_tv_alt(SubLObject v_search) {
        return ghl_search_tv(v_search);
    }

    public static SubLObject ghl_tv(final SubLObject v_search) {
        return ghl_search_tv(v_search);
    }

    public static final SubLObject ghl_result_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_result(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_result(final SubLObject v_search) {
        return graphl_search_vars.graphl_result(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_space_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_space(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_space(final SubLObject v_search) {
        return graphl_search_vars.graphl_space(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_space_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_goal_space(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_goal_space(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_space(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_truth_alt(SubLObject v_search) {
        return enumeration_types.tv_truth(ghl_tv(v_search));
    }

    public static SubLObject ghl_truth(final SubLObject v_search) {
        return enumeration_types.tv_truth(ghl_tv(v_search));
    }

    public static final SubLObject ghl_strength_alt(SubLObject v_search) {
        return enumeration_types.tv_strength(ghl_tv(v_search));
    }

    public static SubLObject ghl_strength(final SubLObject v_search) {
        return enumeration_types.tv_strength(ghl_tv(v_search));
    }

    public static final SubLObject ghl_compute_justifyP_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_compute_justifyP(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_compute_justifyP(final SubLObject v_search) {
        return graphl_search_vars.graphl_compute_justifyP(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_add_to_resultP_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_search_add_to_resultP(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_add_to_resultP(final SubLObject v_search) {
        return graphl_search_vars.graphl_search_add_to_resultP(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_search_goal(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_goal(final SubLObject v_search) {
        return graphl_search_vars.graphl_search_goal(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_fn_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_search_goal_fn(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_goal_fn(final SubLObject v_search) {
        return graphl_search_vars.graphl_search_goal_fn(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_cutoff_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_cutoff(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_cutoff(final SubLObject v_search) {
        return graphl_search_vars.graphl_cutoff(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_depth_cutoff_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_cutoff(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_depth_cutoff(final SubLObject v_search) {
        return graphl_search_vars.graphl_cutoff(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_order_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_order(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_order(final SubLObject v_search) {
        return graphl_search_vars.graphl_order(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_search_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_goal_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_goal_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_map_fn_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_map_fn(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_map_fn(final SubLObject v_search) {
        return graphl_search_vars.graphl_map_fn(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_map_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_map_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_map_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_map_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_depth_first_search_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_depth_first_search(final SubLObject v_search) {
        return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_breadth_first_search_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_breadth_first_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_breadth_first_search(final SubLObject v_search) {
        return graphl_search_vars.graphl_breadth_first_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_depth_marking_search_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_depth_marking_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_depth_marking_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_depth_marking_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_iterative_deepening_search_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_iterative_deepening_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_iterative_deepening_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_iterative_deepening_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_add_nodes_on_wind_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_add_nodes_on_wind_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_add_nodes_on_wind_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_add_nodes_on_wind_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_add_edges_on_unwind_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_add_edges_on_unwind_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_add_edges_on_unwind_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_add_edges_on_unwind_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_add_unwind_edges_now_p_alt(SubLObject v_search) {
        return graphl_graph_utilities.graphl_add_unwind_edges_now_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_add_unwind_edges_now_p(final SubLObject v_search) {
        return graphl_graph_utilities.graphl_add_unwind_edges_now_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_found_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_goal_found_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_goal_found_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_found_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_single_goal_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_single_goal_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_single_goal_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_single_goal_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_multiple_goals_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_multiple_goals_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_multiple_goals_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_multiple_goals_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_fn_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_goal_fn_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_goal_fn_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_goal_fn_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_depth_first_search_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_depth_first_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_breadth_first_search_p_alt(SubLObject v_search) {
        return graphl_search_vars.graphl_breadth_first_search_p(ghl_graphl_search(v_search));
    }

    public static SubLObject ghl_breadth_first_search_p(final SubLObject v_search) {
        return graphl_search_vars.graphl_breadth_first_search_p(ghl_graphl_search(v_search));
    }

    public static final SubLObject ghl_goal_found_condition_p_alt(SubLObject condition) {
        return graphl_search_vars.graphl_goal_found_condition_p(condition);
    }

    public static SubLObject ghl_goal_found_condition_p(final SubLObject condition) {
        return graphl_search_vars.graphl_goal_found_condition_p(condition);
    }

    public static final SubLObject ghl_transitive_search_p_alt(SubLObject v_search) {
        return eq(graphl_search_vars.graphl_type(ghl_graphl_search(v_search)), $TRANSITIVE_REASONING);
    }

    public static SubLObject ghl_transitive_search_p(final SubLObject v_search) {
        return eq(graphl_search_vars.graphl_type(ghl_graphl_search(v_search)), $TRANSITIVE_REASONING);
    }

    public static final SubLObject ghl_return_one_answer_p_alt(SubLObject v_search) {
        return ghl_goal_search_p(v_search);
    }

    public static SubLObject ghl_return_one_answer_p(final SubLObject v_search) {
        return ghl_goal_search_p(v_search);
    }

    public static final SubLObject ghl_relevant_predP_alt(SubLObject v_search, SubLObject pred) {
        if (ghl_search_predicates(v_search).isList()) {
            {
                SubLObject relevantP = NIL;
                if (NIL == relevantP) {
                    {
                        SubLObject csome_list_var = ghl_search_predicates(v_search);
                        SubLObject ghl_pred = NIL;
                        for (ghl_pred = csome_list_var.first(); !((NIL != relevantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ghl_pred = csome_list_var.first()) {
                            if (NIL != ghl_link_iterators.gt_relevant_predP(pred, ghl_pred)) {
                                relevantP = T;
                            }
                        }
                    }
                }
                return relevantP;
            }
        } else {
            return ghl_link_iterators.gt_relevant_predP(pred, ghl_search_predicates(pred));
        }
    }

    public static SubLObject ghl_relevant_predP(final SubLObject v_search, final SubLObject pred) {
        if (ghl_search_predicates(v_search).isList()) {
            SubLObject relevantP = NIL;
            if (NIL == relevantP) {
                SubLObject csome_list_var = ghl_search_predicates(v_search);
                SubLObject ghl_pred = NIL;
                ghl_pred = csome_list_var.first();
                while ((NIL == relevantP) && (NIL != csome_list_var)) {
                    if (NIL != ghl_link_iterators.gt_relevant_predP(pred, ghl_pred)) {
                        relevantP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    ghl_pred = csome_list_var.first();
                } 
            }
            return relevantP;
        }
        return ghl_link_iterators.gt_relevant_predP(pred, ghl_search_predicates(pred));
    }

    public static final SubLObject ghl_return_all_justificationsP_alt(SubLObject v_search) {
        return eq(ghl_compute_justifyP(v_search), $ALL);
    }

    public static SubLObject ghl_return_all_justificationsP(final SubLObject v_search) {
        return eq(ghl_compute_justifyP(v_search), $ALL);
    }

    public static final SubLObject set_ghl_search_properties_alt(SubLObject v_search, SubLObject plist) {
        {
            SubLObject cdolist_list_var = $ghl_search_property_defaults$.getGlobalValue();
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject prop = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    prop = current.first();
                    current = current.rest();
                    value = current;
                    if (NIL != value) {
                        set_ghl_search_property(v_search, prop, value);
                    }
                }
            }
        }
        {
            SubLObject remainder = NIL;
            for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject prop = remainder.first();
                    SubLObject val = cadr(remainder);
                    set_ghl_search_property(v_search, prop, val);
                }
            }
        }
        return v_search;
    }

    public static SubLObject set_ghl_search_properties(final SubLObject v_search, final SubLObject plist) {
        SubLObject cdolist_list_var = $ghl_search_property_defaults$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject prop = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list35);
            prop = current.first();
            current = value = current.rest();
            if (NIL != value) {
                set_ghl_search_property(v_search, prop, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        if ((NIL != getf(plist, $DIRECTION, UNPROVIDED)) && (NIL == getf(plist, $DIRECTIONS, UNPROVIDED))) {
            set_ghl_search_property(v_search, $DIRECTIONS, make_list(length(getf(plist, $PREDICATES, UNPROVIDED)), getf(plist, $DIRECTION, UNPROVIDED)));
        }
        SubLObject remainder;
        SubLObject prop2;
        SubLObject val;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            prop2 = remainder.first();
            val = cadr(remainder);
            set_ghl_search_property(v_search, prop2, val);
        }
        return v_search;
    }

    public static final SubLObject set_ghl_search_property_alt(SubLObject v_search, SubLObject property, SubLObject value) {
        if (NIL == value) {
            value = ghl_search_property_default(property);
        }
        {
            SubLObject graphl_search = ghl_graphl_search(v_search);
            SubLObject pcase_var = property;
            if (pcase_var.eql($PREDICATES)) {
                set_ghl_search_predicates(v_search, value);
            } else {
                if (pcase_var.eql($DIRECTION)) {
                    graphl_search_vars.set_graphl_search_direction(graphl_search, value);
                } else {
                    if (pcase_var.eql($TV)) {
                        set_ghl_search_tv(v_search, value);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            graphl_search_vars.set_graphl_search_type(graphl_search, value);
                        } else {
                            if (pcase_var.eql($ORDER)) {
                                graphl_search_vars.set_graphl_search_order(graphl_search, value);
                            } else {
                                if (pcase_var.eql($CUTOFF)) {
                                    graphl_search_vars.set_graphl_search_cutoff(graphl_search, value);
                                } else {
                                    if (pcase_var.eql($MARKING)) {
                                        graphl_search_vars.set_graphl_search_marking(graphl_search, value);
                                    } else {
                                        if (pcase_var.eql($MARKING_SPACE)) {
                                            graphl_search_vars.set_graphl_search_marking_space(graphl_search, value);
                                        } else {
                                            if (pcase_var.eql($GOAL)) {
                                                graphl_search_vars.set_graphl_search_goal(graphl_search, value);
                                            } else {
                                                if (pcase_var.eql($GOAL_FN)) {
                                                    graphl_search_vars.set_graphl_search_goal_fn(graphl_search, value);
                                                } else {
                                                    if (pcase_var.eql($GOAL_SPACE)) {
                                                        graphl_search_vars.set_graphl_search_goal_space(graphl_search, value);
                                                    } else {
                                                        if (pcase_var.eql($SATISFY_FN)) {
                                                            graphl_search_vars.set_graphl_search_satisfy_fn(graphl_search, value);
                                                        } else {
                                                            if (pcase_var.eql($MAP_FN)) {
                                                                graphl_search_vars.set_graphl_search_map_fn(graphl_search, value);
                                                            } else {
                                                                if (pcase_var.eql($JUSTIFY_)) {
                                                                    graphl_search_vars.set_graphl_search_justifyP(graphl_search, value);
                                                                } else {
                                                                    if (pcase_var.eql($kw41$ADD_TO_RESULT_)) {
                                                                        graphl_search_vars.set_graphl_search_add_to_resultP(graphl_search, value);
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
                }
            }
        }
        return v_search;
    }

    public static SubLObject set_ghl_search_property(final SubLObject v_search, final SubLObject property, SubLObject value) {
        if (NIL == value) {
            value = ghl_search_property_default(property);
        }
        final SubLObject graphl_search = ghl_graphl_search(v_search);
        if (property.eql($PREDICATES)) {
            set_ghl_search_predicates(v_search, value);
        } else
            if (property.eql($DIRECTIONS)) {
                set_ghl_search_directions(v_search, value);
            } else
                if (property.eql($TV)) {
                    set_ghl_search_tv(v_search, value);
                } else
                    if (property.eql($TYPE)) {
                        graphl_search_vars.set_graphl_search_type(graphl_search, value);
                    } else
                        if (property.eql($ORDER)) {
                            graphl_search_vars.set_graphl_search_order(graphl_search, value);
                        } else
                            if (property.eql($CUTOFF)) {
                                graphl_search_vars.set_graphl_search_cutoff(graphl_search, value);
                            } else
                                if (property.eql($MARKING)) {
                                    graphl_search_vars.set_graphl_search_marking(graphl_search, value);
                                } else
                                    if (property.eql($MARKING_SPACE)) {
                                        graphl_search_vars.set_graphl_search_marking_space(graphl_search, value);
                                    } else
                                        if (property.eql($GOAL)) {
                                            graphl_search_vars.set_graphl_search_goal(graphl_search, value);
                                        } else
                                            if (property.eql($GOAL_FN)) {
                                                graphl_search_vars.set_graphl_search_goal_fn(graphl_search, value);
                                            } else
                                                if (property.eql($GOAL_SPACE)) {
                                                    graphl_search_vars.set_graphl_search_goal_space(graphl_search, value);
                                                } else
                                                    if (property.eql($SATISFY_FN)) {
                                                        graphl_search_vars.set_graphl_search_satisfy_fn(graphl_search, value);
                                                    } else
                                                        if (property.eql($MAP_FN)) {
                                                            graphl_search_vars.set_graphl_search_map_fn(graphl_search, value);
                                                        } else
                                                            if (property.eql($JUSTIFY_)) {
                                                                graphl_search_vars.set_graphl_search_justifyP(graphl_search, value);
                                                            } else
                                                                if (property.eql($kw48$ADD_TO_RESULT_)) {
                                                                    graphl_search_vars.set_graphl_search_add_to_resultP(graphl_search, value);
                                                                }














        return v_search;
    }

    public static final SubLObject set_ghl_graphl_search_alt(SubLObject v_search, SubLObject graphl_search) {
        _csetf_ghl_search_graphl_search(v_search, graphl_search);
        return NIL;
    }

    public static SubLObject set_ghl_graphl_search(final SubLObject v_search, final SubLObject graphl_search) {
        _csetf_ghl_search_graphl_search(v_search, graphl_search);
        return NIL;
    }

    public static final SubLObject set_ghl_search_predicates_alt(SubLObject v_search, SubLObject predicates) {
        _csetf_ghl_search_predicates(v_search, predicates);
        return NIL;
    }

    public static SubLObject set_ghl_search_predicates(final SubLObject v_search, final SubLObject predicates) {
        _csetf_ghl_search_predicates(v_search, predicates);
        return NIL;
    }

    public static SubLObject set_ghl_search_directions(final SubLObject v_search, final SubLObject directions) {
        _csetf_ghl_search_directions(v_search, directions);
        return NIL;
    }

    public static final SubLObject set_ghl_search_tv_alt(SubLObject v_search, SubLObject tv) {
        _csetf_ghl_search_tv(v_search, tv);
        return NIL;
    }

    public static SubLObject set_ghl_search_tv(final SubLObject v_search, final SubLObject tv) {
        _csetf_ghl_search_tv(v_search, tv);
        return NIL;
    }

    public static final SubLObject set_ghl_search_order_alt(SubLObject v_search, SubLObject order) {
        graphl_search_vars.set_graphl_search_order(ghl_graphl_search(v_search), order);
        return NIL;
    }

    public static SubLObject set_ghl_search_order(final SubLObject v_search, final SubLObject order) {
        graphl_search_vars.set_graphl_search_order(ghl_graphl_search(v_search), order);
        return NIL;
    }

    public static final SubLObject set_ghl_search_cutoff_alt(SubLObject v_search, SubLObject cutoff_type) {
        graphl_search_vars.set_graphl_search_cutoff(ghl_graphl_search(v_search), cutoff_type);
        return NIL;
    }

    public static SubLObject set_ghl_search_cutoff(final SubLObject v_search, final SubLObject cutoff_type) {
        graphl_search_vars.set_graphl_search_cutoff(ghl_graphl_search(v_search), cutoff_type);
        return NIL;
    }

    public static final SubLObject set_ghl_search_marking_alt(SubLObject v_search, SubLObject marking) {
        graphl_search_vars.set_graphl_search_marking(ghl_graphl_search(v_search), marking);
        return NIL;
    }

    public static SubLObject set_ghl_search_marking(final SubLObject v_search, final SubLObject marking) {
        graphl_search_vars.set_graphl_search_marking(ghl_graphl_search(v_search), marking);
        return NIL;
    }

    public static final SubLObject set_ghl_search_marking_space_alt(SubLObject v_search, SubLObject marking_space) {
        graphl_search_vars.set_graphl_search_marking_space(ghl_graphl_search(v_search), marking_space);
        return NIL;
    }

    public static SubLObject set_ghl_search_marking_space(final SubLObject v_search, final SubLObject marking_space) {
        graphl_search_vars.set_graphl_search_marking_space(ghl_graphl_search(v_search), marking_space);
        return NIL;
    }

    public static final SubLObject set_ghl_search_goal_alt(SubLObject v_search, SubLObject goal) {
        graphl_search_vars.set_graphl_search_goal(ghl_graphl_search(v_search), goal);
        return NIL;
    }

    public static SubLObject set_ghl_search_goal(final SubLObject v_search, final SubLObject goal) {
        graphl_search_vars.set_graphl_search_goal(ghl_graphl_search(v_search), goal);
        return NIL;
    }

    public static final SubLObject set_ghl_search_goal_fn_alt(SubLObject v_search, SubLObject goal_fn) {
        graphl_search_vars.set_graphl_search_goal_fn(ghl_graphl_search(v_search), goal_fn);
        return NIL;
    }

    public static SubLObject set_ghl_search_goal_fn(final SubLObject v_search, final SubLObject goal_fn) {
        graphl_search_vars.set_graphl_search_goal_fn(ghl_graphl_search(v_search), goal_fn);
        return NIL;
    }

    public static final SubLObject set_ghl_search_goal_space_alt(SubLObject v_search, SubLObject goal_space) {
        graphl_search_vars.set_graphl_search_goal_space(ghl_graphl_search(v_search), goal_space);
        return NIL;
    }

    public static SubLObject set_ghl_search_goal_space(final SubLObject v_search, final SubLObject goal_space) {
        graphl_search_vars.set_graphl_search_goal_space(ghl_graphl_search(v_search), goal_space);
        return NIL;
    }

    public static final SubLObject set_ghl_search_satisfy_fn_alt(SubLObject v_search, SubLObject satisfy_fn) {
        graphl_search_vars.set_graphl_search_satisfy_fn(ghl_graphl_search(v_search), satisfy_fn);
        return NIL;
    }

    public static SubLObject set_ghl_search_satisfy_fn(final SubLObject v_search, final SubLObject satisfy_fn) {
        graphl_search_vars.set_graphl_search_satisfy_fn(ghl_graphl_search(v_search), satisfy_fn);
        return NIL;
    }

    public static final SubLObject set_ghl_search_map_fn_alt(SubLObject v_search, SubLObject map_fn) {
        graphl_search_vars.set_graphl_search_map_fn(ghl_graphl_search(v_search), map_fn);
        return NIL;
    }

    public static SubLObject set_ghl_search_map_fn(final SubLObject v_search, final SubLObject map_fn) {
        graphl_search_vars.set_graphl_search_map_fn(ghl_graphl_search(v_search), map_fn);
        return NIL;
    }

    public static final SubLObject set_ghl_search_justifyP_alt(SubLObject v_search, SubLObject justifyP) {
        graphl_search_vars.set_graphl_search_justifyP(ghl_graphl_search(v_search), justifyP);
        return NIL;
    }

    public static SubLObject set_ghl_search_justifyP(final SubLObject v_search, final SubLObject justifyP) {
        graphl_search_vars.set_graphl_search_justifyP(ghl_graphl_search(v_search), justifyP);
        return NIL;
    }

    public static final SubLObject set_ghl_search_result_alt(SubLObject v_search, SubLObject result) {
        graphl_search_vars.set_graphl_search_result(ghl_graphl_search(v_search), result);
        return NIL;
    }

    public static SubLObject set_ghl_search_result(final SubLObject v_search, final SubLObject result) {
        graphl_search_vars.set_graphl_search_result(ghl_graphl_search(v_search), result);
        return NIL;
    }

    public static final SubLObject set_ghl_goal_found_p_alt(SubLObject v_search, SubLObject found_p) {
        graphl_search_vars.set_graphl_search_goal_found_p(ghl_graphl_search(v_search), found_p);
        return NIL;
    }

    public static SubLObject set_ghl_goal_found_p(final SubLObject v_search, final SubLObject found_p) {
        graphl_search_vars.set_graphl_search_goal_found_p(ghl_graphl_search(v_search), found_p);
        return NIL;
    }

    public static final SubLObject ghl_set_result_alt(SubLObject v_search, SubLObject result) {
        set_ghl_search_result(v_search, result);
        return NIL;
    }

    public static SubLObject ghl_set_result(final SubLObject v_search, final SubLObject result) {
        set_ghl_search_result(v_search, result);
        return NIL;
    }

    public static final SubLObject ghl_add_node_to_result_alt(SubLObject v_search, SubLObject node) {
        graphl_search_vars.graphl_add_node_to_result(ghl_graphl_search(v_search), node);
        return NIL;
    }

    public static SubLObject ghl_add_node_to_result(final SubLObject v_search, final SubLObject node) {
        graphl_search_vars.graphl_add_node_to_result(ghl_graphl_search(v_search), node);
        return NIL;
    }

    public static final SubLObject ghl_add_to_result_alt(SubLObject v_search, SubLObject addition, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        graphl_search_vars.graphl_add_to_result(ghl_graphl_search(v_search), addition, test);
        return NIL;
    }

    public static SubLObject ghl_add_to_result(final SubLObject v_search, final SubLObject addition, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        graphl_search_vars.graphl_add_to_result(ghl_graphl_search(v_search), addition, test);
        return NIL;
    }

    public static final SubLObject ghl_append_to_result_alt(SubLObject v_search, SubLObject addition) {
        graphl_search_vars.graphl_append_to_result(ghl_graphl_search(v_search), addition);
        return NIL;
    }

    public static SubLObject ghl_append_to_result(final SubLObject v_search, final SubLObject addition) {
        graphl_search_vars.graphl_append_to_result(ghl_graphl_search(v_search), addition);
        return NIL;
    }

    public static final SubLObject with_ghl_search_initialized_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject search_var = NIL;
            SubLObject plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            search_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            plist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list(search_var, list(NEW_GHL_SEARCH, plist))), $list_alt45, append(body, list(list(DESTROY_GHL_SEARCH, search_var))));
            }
        }
    }

    public static SubLObject with_ghl_search_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject search_var = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        search_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        plist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list(search_var, list(NEW_GHL_SEARCH, plist))), $list52, append(body, list(list(DESTROY_GHL_SEARCH, search_var))));
    }

    public static final SubLObject reinitialize_ghl_spaces_alt(SubLObject v_search) {
        graphl_search_vars.reinitialize_graphl_spaces(ghl_graphl_search(v_search));
        return NIL;
    }

    public static SubLObject reinitialize_ghl_spaces(final SubLObject v_search) {
        graphl_search_vars.reinitialize_graphl_spaces(ghl_graphl_search(v_search));
        return NIL;
    }

    public static final SubLObject ghl_forward_direction_alt() {
        return graphl_search_vars.graphl_forward_direction();
    }

    public static SubLObject ghl_forward_direction() {
        return $FORWARD;
    }

    public static final SubLObject ghl_backward_direction_alt() {
        return graphl_search_vars.graphl_backward_direction();
    }

    public static SubLObject ghl_backward_direction() {
        return $BACKWARD;
    }

    public static final SubLObject ghl_forward_direction_p_alt(SubLObject direction) {
        return graphl_search_vars.graphl_forward_direction_p(direction);
    }

    public static SubLObject ghl_forward_direction_p(final SubLObject direction) {
        return eq(direction, $FORWARD);
    }

    public static final SubLObject do_ghl_relevant_directions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dir_var = NIL;
                    SubLObject direction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    dir_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    direction = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt47);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt47);
                            if (NIL == member(current_3, $list_alt48, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                        {
                            SubLObject done_var_tail = property_list_member($DONE_VAR, current);
                            SubLObject done_var = (NIL != done_var_tail) ? ((SubLObject) (cadr(done_var_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_GRAPHL_RELEVANT_DIRECTIONS, list(dir_var, direction, $DONE_VAR, done_var), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_ghl_relevant_directions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dir_var = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        dir_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list56);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list56);
            if (NIL == member(current_$1, $list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list56);
        }
        final SubLObject done_var_tail = property_list_member($DONE_VAR, current);
        final SubLObject done_var = (NIL != done_var_tail) ? cadr(done_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(dir_var, list(DETERMINE_GHL_RELEVANT_DIRECTIONS, direction), done_var), append(body, NIL));
    }

    public static final SubLObject ghl_opposite_direction_alt(SubLObject direction) {
        return graphl_search_vars.graphl_opposite_direction(direction);
    }

    public static SubLObject ghl_opposite_direction(final SubLObject direction) {
        if (direction.eql($FORWARD)) {
            return $BACKWARD;
        }
        if (direction.eql($BACKWARD)) {
            return $FORWARD;
        }
        return NIL;
    }

    /**
     * Direction to search when determining the predicate relation (PRED A B).
     * :forward corresponds to searching from A to B, e.g. (genls Dog Thing)
     * :backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin)
     */
    @LispMethod(comment = "Direction to search when determining the predicate relation (PRED A B).\r\n:forward corresponds to searching from A to B, e.g. (genls Dog Thing)\r\n:backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin)\nDirection to search when determining the predicate relation (PRED A B).\n:forward corresponds to searching from A to B, e.g. (genls Dog Thing)\n:backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin)")
    public static final SubLObject ghl_direction_for_predicate_relation_alt(SubLObject pred) {
        return ONE_INTEGER.eql(kb_accessors.fan_out_arg(pred, UNPROVIDED)) ? ((SubLObject) ($FORWARD)) : $BACKWARD;
    }

    /**
     * Direction to search when determining the predicate relation (PRED A B).
     * :forward corresponds to searching from A to B, e.g. (genls Dog Thing)
     * :backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin)
     */
    @LispMethod(comment = "Direction to search when determining the predicate relation (PRED A B).\r\n:forward corresponds to searching from A to B, e.g. (genls Dog Thing)\r\n:backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin)\nDirection to search when determining the predicate relation (PRED A B).\n:forward corresponds to searching from A to B, e.g. (genls Dog Thing)\n:backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin)")
    public static SubLObject ghl_direction_for_predicate_relation(final SubLObject pred) {
        return ONE_INTEGER.eql(kb_accessors.fan_out_arg(pred, UNPROVIDED)) ? $FORWARD : $BACKWARD;
    }

    public static final SubLObject ghl_fan_out_direction_alt(SubLObject pred) {
        {
            SubLObject pcase_var = kb_accessors.asserted_fan_out_arg(pred, UNPROVIDED);
            if (pcase_var.eql(ONE_INTEGER)) {
                return $BACKWARD;
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    return $FORWARD;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject ghl_fan_out_direction(final SubLObject pred) {
        final SubLObject pcase_var = kb_accessors.asserted_fan_out_arg(pred, UNPROVIDED);
        if (pcase_var.eql(ONE_INTEGER)) {
            return $BACKWARD;
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return $FORWARD;
        }
        return NIL;
    }

    public static SubLObject determine_ghl_relevant_directions(final SubLObject ghl_direction) {
        if (ghl_direction.eql($ACCESSIBLE)) {
            return $list63;
        }
        if (ghl_direction.eql($FORWARD)) {
            return $list64;
        }
        if (ghl_direction.eql($BACKWARD)) {
            return $list65;
        }
        return NIL;
    }

    public static final SubLObject with_sksi_gt_search_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            pred = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sksi_gt_search_pred$, pred)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_sksi_gt_search_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list66);
        pred = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sksi_gt_search_pred$, pred)), append(body, NIL));
    }

    public static final SubLObject ghl_uses_spec_preds_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ghl_uses_spec_preds_p$.getDynamicValue(thread);
        }
    }

    public static SubLObject ghl_uses_spec_preds_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ghl_uses_spec_preds_p$.getDynamicValue(thread);
    }

    public static final SubLObject with_ghl_spec_pred_use_p_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject use_emP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            use_emP = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, use_emP, $list_alt59), listS(CLET, list(list($ghl_uses_spec_preds_p$, use_emP)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_ghl_spec_pred_use_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject use_emP = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        use_emP = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, use_emP, $list71), listS(CLET, list(list($ghl_uses_spec_preds_p$, use_emP)), append(body, NIL)));
    }

    public static final SubLObject with_ghl_spec_pred_use_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt61, append(body, NIL));
        }
    }

    public static SubLObject with_ghl_spec_pred_use(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list73, append(body, NIL));
    }

    public static final SubLObject without_ghl_spec_pred_use_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt62, append(body, NIL));
        }
    }

    public static SubLObject without_ghl_spec_pred_use(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list74, append(body, NIL));
    }

    public static final SubLObject with_gt_args_unswapped_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt63, append(body, NIL));
        }
    }

    public static SubLObject with_gt_args_unswapped(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list75, append(body, NIL));
    }

    public static final SubLObject with_gt_args_swapped_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt64, append(body, NIL));
        }
    }

    public static SubLObject with_gt_args_swapped(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list76, append(body, NIL));
    }

    public static final SubLObject gt_args_swapped_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $gt_args_swapped_p$.getDynamicValue(thread);
        }
    }

    public static SubLObject gt_args_swapped_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $gt_args_swapped_p$.getDynamicValue(thread);
    }

    public static final SubLObject with_ghl_trace_level_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($ghl_trace_level$, level)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_ghl_trace_level(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($ghl_trace_level$, level)), append(body, NIL));
    }

    /**
     * If *ghl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *ghl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.
     */
    @LispMethod(comment = "If *ghl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *ghl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.")
    public static final SubLObject ghl_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($ghl_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, $ghl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    /**
     * If *ghl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *ghl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.
     */
    @LispMethod(comment = "If *ghl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *ghl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.")
    public static SubLObject ghl_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($ghl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $ghl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject declare_ghl_search_vars_file_alt() {
        declareFunction("ghl_search_property_default", "GHL-SEARCH-PROPERTY-DEFAULT", 1, 0, false);
        declareFunction("ghl_search_print_function_trampoline", "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ghl_search_p", "GHL-SEARCH-P", 1, 0, false);
        new com.cyc.cycjava.cycl.ghl_search_vars.$ghl_search_p$UnaryFunction();
        declareFunction("ghl_search_graphl_search", "GHL-SEARCH-GRAPHL-SEARCH", 1, 0, false);
        declareFunction("ghl_search_predicates", "GHL-SEARCH-PREDICATES", 1, 0, false);
        declareFunction("ghl_search_tv", "GHL-SEARCH-TV", 1, 0, false);
        declareFunction("_csetf_ghl_search_graphl_search", "_CSETF-GHL-SEARCH-GRAPHL-SEARCH", 2, 0, false);
        declareFunction("_csetf_ghl_search_predicates", "_CSETF-GHL-SEARCH-PREDICATES", 2, 0, false);
        declareFunction("_csetf_ghl_search_tv", "_CSETF-GHL-SEARCH-TV", 2, 0, false);
        declareFunction("make_ghl_search", "MAKE-GHL-SEARCH", 0, 1, false);
        declareFunction("print_ghl_search", "PRINT-GHL-SEARCH", 3, 0, false);
        declareFunction("describe_ghl_search", "DESCRIBE-GHL-SEARCH", 1, 0, false);
        declareFunction("new_ghl_search", "NEW-GHL-SEARCH", 1, 0, false);
        declareFunction("destroy_ghl_search", "DESTROY-GHL-SEARCH", 1, 0, false);
        declareFunction("ghl_graphl_search", "GHL-GRAPHL-SEARCH", 1, 0, false);
        declareFunction("ghl_relevant_predicates", "GHL-RELEVANT-PREDICATES", 1, 0, false);
        declareFunction("ghl_tv", "GHL-TV", 1, 0, false);
        declareFunction("ghl_result", "GHL-RESULT", 1, 0, false);
        declareFunction("ghl_space", "GHL-SPACE", 1, 0, false);
        declareFunction("ghl_goal_space", "GHL-GOAL-SPACE", 1, 0, false);
        declareFunction("ghl_direction", "GHL-DIRECTION", 1, 0, false);
        declareFunction("ghl_truth", "GHL-TRUTH", 1, 0, false);
        declareFunction("ghl_strength", "GHL-STRENGTH", 1, 0, false);
        declareFunction("ghl_compute_justifyP", "GHL-COMPUTE-JUSTIFY?", 1, 0, false);
        declareFunction("ghl_add_to_resultP", "GHL-ADD-TO-RESULT?", 1, 0, false);
        declareFunction("ghl_goal", "GHL-GOAL", 1, 0, false);
        declareFunction("ghl_goal_fn", "GHL-GOAL-FN", 1, 0, false);
        declareFunction("ghl_cutoff", "GHL-CUTOFF", 1, 0, false);
        declareFunction("ghl_depth_cutoff", "GHL-DEPTH-CUTOFF", 1, 0, false);
        declareFunction("ghl_order", "GHL-ORDER", 1, 0, false);
        declareFunction("ghl_goal_search_p", "GHL-GOAL-SEARCH-P", 1, 0, false);
        declareFunction("ghl_map_fn", "GHL-MAP-FN", 1, 0, false);
        declareFunction("ghl_map_p", "GHL-MAP-P", 1, 0, false);
        declareFunction("ghl_depth_first_search", "GHL-DEPTH-FIRST-SEARCH", 1, 0, false);
        declareFunction("ghl_breadth_first_search", "GHL-BREADTH-FIRST-SEARCH", 1, 0, false);
        declareFunction("ghl_depth_marking_search_p", "GHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
        declareFunction("ghl_iterative_deepening_search_p", "GHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
        declareFunction("ghl_add_nodes_on_wind_p", "GHL-ADD-NODES-ON-WIND-P", 1, 0, false);
        declareFunction("ghl_add_edges_on_unwind_p", "GHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
        declareFunction("ghl_add_unwind_edges_now_p", "GHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
        declareFunction("ghl_goal_found_p", "GHL-GOAL-FOUND-P", 1, 0, false);
        declareFunction("ghl_single_goal_p", "GHL-SINGLE-GOAL-P", 1, 0, false);
        declareFunction("ghl_multiple_goals_p", "GHL-MULTIPLE-GOALS-P", 1, 0, false);
        declareFunction("ghl_goal_fn_p", "GHL-GOAL-FN-P", 1, 0, false);
        declareFunction("ghl_depth_first_search_p", "GHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
        declareFunction("ghl_breadth_first_search_p", "GHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
        declareFunction("ghl_goal_found_condition_p", "GHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
        declareFunction("ghl_transitive_search_p", "GHL-TRANSITIVE-SEARCH-P", 1, 0, false);
        declareFunction("ghl_return_one_answer_p", "GHL-RETURN-ONE-ANSWER-P", 1, 0, false);
        declareFunction("ghl_relevant_predP", "GHL-RELEVANT-PRED?", 2, 0, false);
        declareFunction("ghl_return_all_justificationsP", "GHL-RETURN-ALL-JUSTIFICATIONS?", 1, 0, false);
        declareFunction("set_ghl_search_properties", "SET-GHL-SEARCH-PROPERTIES", 2, 0, false);
        declareFunction("set_ghl_search_property", "SET-GHL-SEARCH-PROPERTY", 3, 0, false);
        declareFunction("set_ghl_graphl_search", "SET-GHL-GRAPHL-SEARCH", 2, 0, false);
        declareFunction("set_ghl_search_predicates", "SET-GHL-SEARCH-PREDICATES", 2, 0, false);
        declareFunction("set_ghl_search_direction", "SET-GHL-SEARCH-DIRECTION", 2, 0, false);
        declareFunction("set_ghl_search_tv", "SET-GHL-SEARCH-TV", 2, 0, false);
        declareFunction("set_ghl_search_order", "SET-GHL-SEARCH-ORDER", 2, 0, false);
        declareFunction("set_ghl_search_cutoff", "SET-GHL-SEARCH-CUTOFF", 2, 0, false);
        declareFunction("set_ghl_search_marking", "SET-GHL-SEARCH-MARKING", 2, 0, false);
        declareFunction("set_ghl_search_marking_space", "SET-GHL-SEARCH-MARKING-SPACE", 2, 0, false);
        declareFunction("set_ghl_search_goal", "SET-GHL-SEARCH-GOAL", 2, 0, false);
        declareFunction("set_ghl_search_goal_fn", "SET-GHL-SEARCH-GOAL-FN", 2, 0, false);
        declareFunction("set_ghl_search_goal_space", "SET-GHL-SEARCH-GOAL-SPACE", 2, 0, false);
        declareFunction("set_ghl_search_satisfy_fn", "SET-GHL-SEARCH-SATISFY-FN", 2, 0, false);
        declareFunction("set_ghl_search_map_fn", "SET-GHL-SEARCH-MAP-FN", 2, 0, false);
        declareFunction("set_ghl_search_justifyP", "SET-GHL-SEARCH-JUSTIFY?", 2, 0, false);
        declareFunction("set_ghl_search_result", "SET-GHL-SEARCH-RESULT", 2, 0, false);
        declareFunction("set_ghl_goal_found_p", "SET-GHL-GOAL-FOUND-P", 2, 0, false);
        declareFunction("ghl_set_result", "GHL-SET-RESULT", 2, 0, false);
        declareFunction("ghl_add_node_to_result", "GHL-ADD-NODE-TO-RESULT", 2, 0, false);
        declareFunction("ghl_add_to_result", "GHL-ADD-TO-RESULT", 2, 1, false);
        declareFunction("ghl_append_to_result", "GHL-APPEND-TO-RESULT", 2, 0, false);
        declareMacro("with_ghl_search_initialized", "WITH-GHL-SEARCH-INITIALIZED");
        declareFunction("reinitialize_ghl_spaces", "REINITIALIZE-GHL-SPACES", 1, 0, false);
        declareFunction("ghl_forward_direction", "GHL-FORWARD-DIRECTION", 0, 0, false);
        declareFunction("ghl_backward_direction", "GHL-BACKWARD-DIRECTION", 0, 0, false);
        declareFunction("ghl_forward_direction_p", "GHL-FORWARD-DIRECTION-P", 1, 0, false);
        declareMacro("do_ghl_relevant_directions", "DO-GHL-RELEVANT-DIRECTIONS");
        declareFunction("ghl_opposite_direction", "GHL-OPPOSITE-DIRECTION", 1, 0, false);
        declareFunction("ghl_direction_for_predicate_relation", "GHL-DIRECTION-FOR-PREDICATE-RELATION", 1, 0, false);
        declareFunction("ghl_fan_out_direction", "GHL-FAN-OUT-DIRECTION", 1, 0, false);
        declareMacro("with_sksi_gt_search_pred", "WITH-SKSI-GT-SEARCH-PRED");
        declareFunction("ghl_uses_spec_preds_p", "GHL-USES-SPEC-PREDS-P", 0, 0, false);
        declareMacro("with_ghl_spec_pred_use_p", "WITH-GHL-SPEC-PRED-USE-P");
        declareMacro("with_ghl_spec_pred_use", "WITH-GHL-SPEC-PRED-USE");
        declareMacro("without_ghl_spec_pred_use", "WITHOUT-GHL-SPEC-PRED-USE");
        declareMacro("with_gt_args_unswapped", "WITH-GT-ARGS-UNSWAPPED");
        declareMacro("with_gt_args_swapped", "WITH-GT-ARGS-SWAPPED");
        declareFunction("gt_args_swapped_p", "GT-ARGS-SWAPPED-P", 0, 0, false);
        declareMacro("with_ghl_trace_level", "WITH-GHL-TRACE-LEVEL");
        declareFunction("ghl_error", "GHL-ERROR", 2, 5, false);
        return NIL;
    }

    public static SubLObject declare_ghl_search_vars_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("ghl_search_property_default", "GHL-SEARCH-PROPERTY-DEFAULT", 1, 0, false);
            declareFunction("ghl_search_print_function_trampoline", "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("ghl_search_p", "GHL-SEARCH-P", 1, 0, false);
            new ghl_search_vars.$ghl_search_p$UnaryFunction();
            declareFunction("ghl_search_graphl_search", "GHL-SEARCH-GRAPHL-SEARCH", 1, 0, false);
            declareFunction("ghl_search_predicates", "GHL-SEARCH-PREDICATES", 1, 0, false);
            declareFunction("ghl_search_directions", "GHL-SEARCH-DIRECTIONS", 1, 0, false);
            declareFunction("ghl_search_tv", "GHL-SEARCH-TV", 1, 0, false);
            declareFunction("_csetf_ghl_search_graphl_search", "_CSETF-GHL-SEARCH-GRAPHL-SEARCH", 2, 0, false);
            declareFunction("_csetf_ghl_search_predicates", "_CSETF-GHL-SEARCH-PREDICATES", 2, 0, false);
            declareFunction("_csetf_ghl_search_directions", "_CSETF-GHL-SEARCH-DIRECTIONS", 2, 0, false);
            declareFunction("_csetf_ghl_search_tv", "_CSETF-GHL-SEARCH-TV", 2, 0, false);
            declareFunction("make_ghl_search", "MAKE-GHL-SEARCH", 0, 1, false);
            declareFunction("visit_defstruct_ghl_search", "VISIT-DEFSTRUCT-GHL-SEARCH", 2, 0, false);
            declareFunction("visit_defstruct_object_ghl_search_method", "VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD", 2, 0, false);
            declareFunction("print_ghl_search", "PRINT-GHL-SEARCH", 3, 0, false);
            declareFunction("describe_ghl_search", "DESCRIBE-GHL-SEARCH", 1, 0, false);
            declareFunction("new_ghl_search", "NEW-GHL-SEARCH", 1, 0, false);
            declareFunction("destroy_ghl_search", "DESTROY-GHL-SEARCH", 1, 0, false);
            declareFunction("ghl_graphl_search", "GHL-GRAPHL-SEARCH", 1, 0, false);
            declareFunction("ghl_relevant_predicates", "GHL-RELEVANT-PREDICATES", 1, 0, false);
            declareFunction("ghl_relevant_directions", "GHL-RELEVANT-DIRECTIONS", 1, 0, false);
            declareFunction("ghl_tv", "GHL-TV", 1, 0, false);
            declareFunction("ghl_result", "GHL-RESULT", 1, 0, false);
            declareFunction("ghl_space", "GHL-SPACE", 1, 0, false);
            declareFunction("ghl_goal_space", "GHL-GOAL-SPACE", 1, 0, false);
            declareFunction("ghl_truth", "GHL-TRUTH", 1, 0, false);
            declareFunction("ghl_strength", "GHL-STRENGTH", 1, 0, false);
            declareFunction("ghl_compute_justifyP", "GHL-COMPUTE-JUSTIFY?", 1, 0, false);
            declareFunction("ghl_add_to_resultP", "GHL-ADD-TO-RESULT?", 1, 0, false);
            declareFunction("ghl_goal", "GHL-GOAL", 1, 0, false);
            declareFunction("ghl_goal_fn", "GHL-GOAL-FN", 1, 0, false);
            declareFunction("ghl_cutoff", "GHL-CUTOFF", 1, 0, false);
            declareFunction("ghl_depth_cutoff", "GHL-DEPTH-CUTOFF", 1, 0, false);
            declareFunction("ghl_order", "GHL-ORDER", 1, 0, false);
            declareFunction("ghl_goal_search_p", "GHL-GOAL-SEARCH-P", 1, 0, false);
            declareFunction("ghl_map_fn", "GHL-MAP-FN", 1, 0, false);
            declareFunction("ghl_map_p", "GHL-MAP-P", 1, 0, false);
            declareFunction("ghl_depth_first_search", "GHL-DEPTH-FIRST-SEARCH", 1, 0, false);
            declareFunction("ghl_breadth_first_search", "GHL-BREADTH-FIRST-SEARCH", 1, 0, false);
            declareFunction("ghl_depth_marking_search_p", "GHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
            declareFunction("ghl_iterative_deepening_search_p", "GHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
            declareFunction("ghl_add_nodes_on_wind_p", "GHL-ADD-NODES-ON-WIND-P", 1, 0, false);
            declareFunction("ghl_add_edges_on_unwind_p", "GHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
            declareFunction("ghl_add_unwind_edges_now_p", "GHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
            declareFunction("ghl_goal_found_p", "GHL-GOAL-FOUND-P", 1, 0, false);
            declareFunction("ghl_single_goal_p", "GHL-SINGLE-GOAL-P", 1, 0, false);
            declareFunction("ghl_multiple_goals_p", "GHL-MULTIPLE-GOALS-P", 1, 0, false);
            declareFunction("ghl_goal_fn_p", "GHL-GOAL-FN-P", 1, 0, false);
            declareFunction("ghl_depth_first_search_p", "GHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
            declareFunction("ghl_breadth_first_search_p", "GHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
            declareFunction("ghl_goal_found_condition_p", "GHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
            declareFunction("ghl_transitive_search_p", "GHL-TRANSITIVE-SEARCH-P", 1, 0, false);
            declareFunction("ghl_return_one_answer_p", "GHL-RETURN-ONE-ANSWER-P", 1, 0, false);
            declareFunction("ghl_relevant_predP", "GHL-RELEVANT-PRED?", 2, 0, false);
            declareFunction("ghl_return_all_justificationsP", "GHL-RETURN-ALL-JUSTIFICATIONS?", 1, 0, false);
            declareFunction("set_ghl_search_properties", "SET-GHL-SEARCH-PROPERTIES", 2, 0, false);
            declareFunction("set_ghl_search_property", "SET-GHL-SEARCH-PROPERTY", 3, 0, false);
            declareFunction("set_ghl_graphl_search", "SET-GHL-GRAPHL-SEARCH", 2, 0, false);
            declareFunction("set_ghl_search_predicates", "SET-GHL-SEARCH-PREDICATES", 2, 0, false);
            declareFunction("set_ghl_search_directions", "SET-GHL-SEARCH-DIRECTIONS", 2, 0, false);
            declareFunction("set_ghl_search_tv", "SET-GHL-SEARCH-TV", 2, 0, false);
            declareFunction("set_ghl_search_order", "SET-GHL-SEARCH-ORDER", 2, 0, false);
            declareFunction("set_ghl_search_cutoff", "SET-GHL-SEARCH-CUTOFF", 2, 0, false);
            declareFunction("set_ghl_search_marking", "SET-GHL-SEARCH-MARKING", 2, 0, false);
            declareFunction("set_ghl_search_marking_space", "SET-GHL-SEARCH-MARKING-SPACE", 2, 0, false);
            declareFunction("set_ghl_search_goal", "SET-GHL-SEARCH-GOAL", 2, 0, false);
            declareFunction("set_ghl_search_goal_fn", "SET-GHL-SEARCH-GOAL-FN", 2, 0, false);
            declareFunction("set_ghl_search_goal_space", "SET-GHL-SEARCH-GOAL-SPACE", 2, 0, false);
            declareFunction("set_ghl_search_satisfy_fn", "SET-GHL-SEARCH-SATISFY-FN", 2, 0, false);
            declareFunction("set_ghl_search_map_fn", "SET-GHL-SEARCH-MAP-FN", 2, 0, false);
            declareFunction("set_ghl_search_justifyP", "SET-GHL-SEARCH-JUSTIFY?", 2, 0, false);
            declareFunction("set_ghl_search_result", "SET-GHL-SEARCH-RESULT", 2, 0, false);
            declareFunction("set_ghl_goal_found_p", "SET-GHL-GOAL-FOUND-P", 2, 0, false);
            declareFunction("ghl_set_result", "GHL-SET-RESULT", 2, 0, false);
            declareFunction("ghl_add_node_to_result", "GHL-ADD-NODE-TO-RESULT", 2, 0, false);
            declareFunction("ghl_add_to_result", "GHL-ADD-TO-RESULT", 2, 1, false);
            declareFunction("ghl_append_to_result", "GHL-APPEND-TO-RESULT", 2, 0, false);
            declareMacro("with_ghl_search_initialized", "WITH-GHL-SEARCH-INITIALIZED");
            declareFunction("reinitialize_ghl_spaces", "REINITIALIZE-GHL-SPACES", 1, 0, false);
            declareFunction("ghl_forward_direction", "GHL-FORWARD-DIRECTION", 0, 0, false);
            declareFunction("ghl_backward_direction", "GHL-BACKWARD-DIRECTION", 0, 0, false);
            declareFunction("ghl_forward_direction_p", "GHL-FORWARD-DIRECTION-P", 1, 0, false);
            declareMacro("do_ghl_relevant_directions", "DO-GHL-RELEVANT-DIRECTIONS");
            declareFunction("ghl_opposite_direction", "GHL-OPPOSITE-DIRECTION", 1, 0, false);
            declareFunction("ghl_direction_for_predicate_relation", "GHL-DIRECTION-FOR-PREDICATE-RELATION", 1, 0, false);
            declareFunction("ghl_fan_out_direction", "GHL-FAN-OUT-DIRECTION", 1, 0, false);
            declareFunction("determine_ghl_relevant_directions", "DETERMINE-GHL-RELEVANT-DIRECTIONS", 1, 0, false);
            declareMacro("with_sksi_gt_search_pred", "WITH-SKSI-GT-SEARCH-PRED");
            declareFunction("ghl_uses_spec_preds_p", "GHL-USES-SPEC-PREDS-P", 0, 0, false);
            declareMacro("with_ghl_spec_pred_use_p", "WITH-GHL-SPEC-PRED-USE-P");
            declareMacro("with_ghl_spec_pred_use", "WITH-GHL-SPEC-PRED-USE");
            declareMacro("without_ghl_spec_pred_use", "WITHOUT-GHL-SPEC-PRED-USE");
            declareMacro("with_gt_args_unswapped", "WITH-GT-ARGS-UNSWAPPED");
            declareMacro("with_gt_args_swapped", "WITH-GT-ARGS-SWAPPED");
            declareFunction("gt_args_swapped_p", "GT-ARGS-SWAPPED-P", 0, 0, false);
            declareMacro("with_ghl_trace_level", "WITH-GHL-TRACE-LEVEL");
            declareFunction("ghl_error", "GHL-ERROR", 2, 5, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("ghl_direction", "GHL-DIRECTION", 1, 0, false);
            declareFunction("set_ghl_search_direction", "SET-GHL-SEARCH-DIRECTION", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_ghl_search_vars_file_Previous() {
        declareFunction("ghl_search_property_default", "GHL-SEARCH-PROPERTY-DEFAULT", 1, 0, false);
        declareFunction("ghl_search_print_function_trampoline", "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ghl_search_p", "GHL-SEARCH-P", 1, 0, false);
        new ghl_search_vars.$ghl_search_p$UnaryFunction();
        declareFunction("ghl_search_graphl_search", "GHL-SEARCH-GRAPHL-SEARCH", 1, 0, false);
        declareFunction("ghl_search_predicates", "GHL-SEARCH-PREDICATES", 1, 0, false);
        declareFunction("ghl_search_directions", "GHL-SEARCH-DIRECTIONS", 1, 0, false);
        declareFunction("ghl_search_tv", "GHL-SEARCH-TV", 1, 0, false);
        declareFunction("_csetf_ghl_search_graphl_search", "_CSETF-GHL-SEARCH-GRAPHL-SEARCH", 2, 0, false);
        declareFunction("_csetf_ghl_search_predicates", "_CSETF-GHL-SEARCH-PREDICATES", 2, 0, false);
        declareFunction("_csetf_ghl_search_directions", "_CSETF-GHL-SEARCH-DIRECTIONS", 2, 0, false);
        declareFunction("_csetf_ghl_search_tv", "_CSETF-GHL-SEARCH-TV", 2, 0, false);
        declareFunction("make_ghl_search", "MAKE-GHL-SEARCH", 0, 1, false);
        declareFunction("visit_defstruct_ghl_search", "VISIT-DEFSTRUCT-GHL-SEARCH", 2, 0, false);
        declareFunction("visit_defstruct_object_ghl_search_method", "VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD", 2, 0, false);
        declareFunction("print_ghl_search", "PRINT-GHL-SEARCH", 3, 0, false);
        declareFunction("describe_ghl_search", "DESCRIBE-GHL-SEARCH", 1, 0, false);
        declareFunction("new_ghl_search", "NEW-GHL-SEARCH", 1, 0, false);
        declareFunction("destroy_ghl_search", "DESTROY-GHL-SEARCH", 1, 0, false);
        declareFunction("ghl_graphl_search", "GHL-GRAPHL-SEARCH", 1, 0, false);
        declareFunction("ghl_relevant_predicates", "GHL-RELEVANT-PREDICATES", 1, 0, false);
        declareFunction("ghl_relevant_directions", "GHL-RELEVANT-DIRECTIONS", 1, 0, false);
        declareFunction("ghl_tv", "GHL-TV", 1, 0, false);
        declareFunction("ghl_result", "GHL-RESULT", 1, 0, false);
        declareFunction("ghl_space", "GHL-SPACE", 1, 0, false);
        declareFunction("ghl_goal_space", "GHL-GOAL-SPACE", 1, 0, false);
        declareFunction("ghl_truth", "GHL-TRUTH", 1, 0, false);
        declareFunction("ghl_strength", "GHL-STRENGTH", 1, 0, false);
        declareFunction("ghl_compute_justifyP", "GHL-COMPUTE-JUSTIFY?", 1, 0, false);
        declareFunction("ghl_add_to_resultP", "GHL-ADD-TO-RESULT?", 1, 0, false);
        declareFunction("ghl_goal", "GHL-GOAL", 1, 0, false);
        declareFunction("ghl_goal_fn", "GHL-GOAL-FN", 1, 0, false);
        declareFunction("ghl_cutoff", "GHL-CUTOFF", 1, 0, false);
        declareFunction("ghl_depth_cutoff", "GHL-DEPTH-CUTOFF", 1, 0, false);
        declareFunction("ghl_order", "GHL-ORDER", 1, 0, false);
        declareFunction("ghl_goal_search_p", "GHL-GOAL-SEARCH-P", 1, 0, false);
        declareFunction("ghl_map_fn", "GHL-MAP-FN", 1, 0, false);
        declareFunction("ghl_map_p", "GHL-MAP-P", 1, 0, false);
        declareFunction("ghl_depth_first_search", "GHL-DEPTH-FIRST-SEARCH", 1, 0, false);
        declareFunction("ghl_breadth_first_search", "GHL-BREADTH-FIRST-SEARCH", 1, 0, false);
        declareFunction("ghl_depth_marking_search_p", "GHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
        declareFunction("ghl_iterative_deepening_search_p", "GHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
        declareFunction("ghl_add_nodes_on_wind_p", "GHL-ADD-NODES-ON-WIND-P", 1, 0, false);
        declareFunction("ghl_add_edges_on_unwind_p", "GHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
        declareFunction("ghl_add_unwind_edges_now_p", "GHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
        declareFunction("ghl_goal_found_p", "GHL-GOAL-FOUND-P", 1, 0, false);
        declareFunction("ghl_single_goal_p", "GHL-SINGLE-GOAL-P", 1, 0, false);
        declareFunction("ghl_multiple_goals_p", "GHL-MULTIPLE-GOALS-P", 1, 0, false);
        declareFunction("ghl_goal_fn_p", "GHL-GOAL-FN-P", 1, 0, false);
        declareFunction("ghl_depth_first_search_p", "GHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
        declareFunction("ghl_breadth_first_search_p", "GHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
        declareFunction("ghl_goal_found_condition_p", "GHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
        declareFunction("ghl_transitive_search_p", "GHL-TRANSITIVE-SEARCH-P", 1, 0, false);
        declareFunction("ghl_return_one_answer_p", "GHL-RETURN-ONE-ANSWER-P", 1, 0, false);
        declareFunction("ghl_relevant_predP", "GHL-RELEVANT-PRED?", 2, 0, false);
        declareFunction("ghl_return_all_justificationsP", "GHL-RETURN-ALL-JUSTIFICATIONS?", 1, 0, false);
        declareFunction("set_ghl_search_properties", "SET-GHL-SEARCH-PROPERTIES", 2, 0, false);
        declareFunction("set_ghl_search_property", "SET-GHL-SEARCH-PROPERTY", 3, 0, false);
        declareFunction("set_ghl_graphl_search", "SET-GHL-GRAPHL-SEARCH", 2, 0, false);
        declareFunction("set_ghl_search_predicates", "SET-GHL-SEARCH-PREDICATES", 2, 0, false);
        declareFunction("set_ghl_search_directions", "SET-GHL-SEARCH-DIRECTIONS", 2, 0, false);
        declareFunction("set_ghl_search_tv", "SET-GHL-SEARCH-TV", 2, 0, false);
        declareFunction("set_ghl_search_order", "SET-GHL-SEARCH-ORDER", 2, 0, false);
        declareFunction("set_ghl_search_cutoff", "SET-GHL-SEARCH-CUTOFF", 2, 0, false);
        declareFunction("set_ghl_search_marking", "SET-GHL-SEARCH-MARKING", 2, 0, false);
        declareFunction("set_ghl_search_marking_space", "SET-GHL-SEARCH-MARKING-SPACE", 2, 0, false);
        declareFunction("set_ghl_search_goal", "SET-GHL-SEARCH-GOAL", 2, 0, false);
        declareFunction("set_ghl_search_goal_fn", "SET-GHL-SEARCH-GOAL-FN", 2, 0, false);
        declareFunction("set_ghl_search_goal_space", "SET-GHL-SEARCH-GOAL-SPACE", 2, 0, false);
        declareFunction("set_ghl_search_satisfy_fn", "SET-GHL-SEARCH-SATISFY-FN", 2, 0, false);
        declareFunction("set_ghl_search_map_fn", "SET-GHL-SEARCH-MAP-FN", 2, 0, false);
        declareFunction("set_ghl_search_justifyP", "SET-GHL-SEARCH-JUSTIFY?", 2, 0, false);
        declareFunction("set_ghl_search_result", "SET-GHL-SEARCH-RESULT", 2, 0, false);
        declareFunction("set_ghl_goal_found_p", "SET-GHL-GOAL-FOUND-P", 2, 0, false);
        declareFunction("ghl_set_result", "GHL-SET-RESULT", 2, 0, false);
        declareFunction("ghl_add_node_to_result", "GHL-ADD-NODE-TO-RESULT", 2, 0, false);
        declareFunction("ghl_add_to_result", "GHL-ADD-TO-RESULT", 2, 1, false);
        declareFunction("ghl_append_to_result", "GHL-APPEND-TO-RESULT", 2, 0, false);
        declareMacro("with_ghl_search_initialized", "WITH-GHL-SEARCH-INITIALIZED");
        declareFunction("reinitialize_ghl_spaces", "REINITIALIZE-GHL-SPACES", 1, 0, false);
        declareFunction("ghl_forward_direction", "GHL-FORWARD-DIRECTION", 0, 0, false);
        declareFunction("ghl_backward_direction", "GHL-BACKWARD-DIRECTION", 0, 0, false);
        declareFunction("ghl_forward_direction_p", "GHL-FORWARD-DIRECTION-P", 1, 0, false);
        declareMacro("do_ghl_relevant_directions", "DO-GHL-RELEVANT-DIRECTIONS");
        declareFunction("ghl_opposite_direction", "GHL-OPPOSITE-DIRECTION", 1, 0, false);
        declareFunction("ghl_direction_for_predicate_relation", "GHL-DIRECTION-FOR-PREDICATE-RELATION", 1, 0, false);
        declareFunction("ghl_fan_out_direction", "GHL-FAN-OUT-DIRECTION", 1, 0, false);
        declareFunction("determine_ghl_relevant_directions", "DETERMINE-GHL-RELEVANT-DIRECTIONS", 1, 0, false);
        declareMacro("with_sksi_gt_search_pred", "WITH-SKSI-GT-SEARCH-PRED");
        declareFunction("ghl_uses_spec_preds_p", "GHL-USES-SPEC-PREDS-P", 0, 0, false);
        declareMacro("with_ghl_spec_pred_use_p", "WITH-GHL-SPEC-PRED-USE-P");
        declareMacro("with_ghl_spec_pred_use", "WITH-GHL-SPEC-PRED-USE");
        declareMacro("without_ghl_spec_pred_use", "WITHOUT-GHL-SPEC-PRED-USE");
        declareMacro("with_gt_args_unswapped", "WITH-GT-ARGS-UNSWAPPED");
        declareMacro("with_gt_args_swapped", "WITH-GT-ARGS-SWAPPED");
        declareFunction("gt_args_swapped_p", "GT-ARGS-SWAPPED-P", 0, 0, false);
        declareMacro("with_ghl_trace_level", "WITH-GHL-TRACE-LEVEL");
        declareFunction("ghl_error", "GHL-ERROR", 2, 5, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("TV"), makeKeyword("TRUE-DEF")), cons(makeKeyword("ORDER"), makeKeyword("BREADTH-FIRST")));

    static private final SubLList $list_alt3 = list(makeSymbol("GRAPHL-SEARCH"), makeSymbol("PREDICATES"), makeSymbol("TV"));

    static private final SubLList $list_alt4 = list(makeKeyword("GRAPHL-SEARCH"), makeKeyword("PREDICATES"), makeKeyword("TV"));

    static private final SubLList $list_alt5 = list(makeSymbol("GHL-SEARCH-GRAPHL-SEARCH"), makeSymbol("GHL-SEARCH-PREDICATES"), makeSymbol("GHL-SEARCH-TV"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH"), makeSymbol("_CSETF-GHL-SEARCH-PREDICATES"), makeSymbol("_CSETF-GHL-SEARCH-TV"));

    static private final SubLString $str_alt18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt19$__ = makeString("#<");

    static private final SubLString $str_alt22$GHL_Search____a__ = makeString("GHL Search : ~a~%");

    static private final SubLString $str_alt23$Predicates__a__ = makeString("Predicates ~a~%");

    static private final SubLString $str_alt24$TV__s__ = makeString("TV ~s~%");

    static private final SubLList $list_alt28 = cons(makeSymbol("PROP"), makeSymbol("VALUE"));

    public static final SubLSymbol $kw41$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");

    static private final SubLList $list_alt42 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt45 = list(makeSymbol("RESET-GRAPHL-FINISHED"));

    public static SubLObject init_ghl_search_vars_file() {
        deflexical("*GHL-SEARCH-PROPERTY-DEFAULTS*", $list0);
        defconstant("*DTP-GHL-SEARCH*", GHL_SEARCH);
        defparameter("*SKSI-GT-SEARCH-PRED*", NIL);
        defparameter("*GHL-USES-SPEC-PREDS-P*", T);
        defparameter("*GT-ARGS-SWAPPED-P*", NIL);
        defparameter("*GHL-TRACE-LEVEL*", ONE_INTEGER);
        return NIL;
    }

    static private final SubLList $list_alt47 = list(list(makeSymbol("DIR-VAR"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt48 = list(makeKeyword("DONE-VAR"));

    private static final SubLSymbol DO_GRAPHL_RELEVANT_DIRECTIONS = makeSymbol("DO-GRAPHL-RELEVANT-DIRECTIONS");

    public static SubLObject setup_ghl_search_vars_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ghl_search$.getGlobalValue(), symbol_function(GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(GHL_SEARCH_GRAPHL_SEARCH, _CSETF_GHL_SEARCH_GRAPHL_SEARCH);
        def_csetf(GHL_SEARCH_PREDICATES, _CSETF_GHL_SEARCH_PREDICATES);
        def_csetf(GHL_SEARCH_DIRECTIONS, _CSETF_GHL_SEARCH_DIRECTIONS);
        def_csetf(GHL_SEARCH_TV, _CSETF_GHL_SEARCH_TV);
        identity(GHL_SEARCH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ghl_search$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt54 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt56 = list(makeSymbol("USE-EM?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt59 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("*GHL-USES-SPEC-PREDS-P*"), T));

    static private final SubLList $list_alt62 = list(list(makeSymbol("*GHL-USES-SPEC-PREDS-P*"), NIL));

    @Override
    public void declareFunctions() {
        declare_ghl_search_vars_file();
    }

    static private final SubLList $list_alt63 = list(list(makeSymbol("*GT-ARGS-SWAPPED-P*"), NIL));

    @Override
    public void initializeVariables() {
        init_ghl_search_vars_file();
    }

    static private final SubLList $list_alt64 = list(list(makeSymbol("*GT-ARGS-SWAPPED-P*"), T));

    @Override
    public void runTopLevelForms() {
        setup_ghl_search_vars_file();
    }

    static private final SubLList $list_alt65 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static {
    }

    public static final class $ghl_search_native extends SubLStructNative {
        public SubLObject $graphl_search;

        public SubLObject $predicates;

        public SubLObject $directions;

        public SubLObject $tv;

        private static final SubLStructDeclNative structDecl;

        public $ghl_search_native() {
            ghl_search_vars.$ghl_search_native.this.$graphl_search = Lisp.NIL;
            ghl_search_vars.$ghl_search_native.this.$predicates = Lisp.NIL;
            ghl_search_vars.$ghl_search_native.this.$directions = Lisp.NIL;
            ghl_search_vars.$ghl_search_native.this.$tv = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return ghl_search_vars.$ghl_search_native.this.$graphl_search;
        }

        @Override
        public SubLObject getField3() {
            return ghl_search_vars.$ghl_search_native.this.$predicates;
        }

        @Override
        public SubLObject getField4() {
            return ghl_search_vars.$ghl_search_native.this.$directions;
        }

        @Override
        public SubLObject getField5() {
            return ghl_search_vars.$ghl_search_native.this.$tv;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return ghl_search_vars.$ghl_search_native.this.$graphl_search = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return ghl_search_vars.$ghl_search_native.this.$predicates = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return ghl_search_vars.$ghl_search_native.this.$directions = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return ghl_search_vars.$ghl_search_native.this.$tv = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.ghl_search_vars.$ghl_search_native.class, GHL_SEARCH, GHL_SEARCH_P, $list3, $list4, new String[]{ "$graphl_search", "$predicates", "$directions", "$tv" }, $list5, $list6, PRINT_GHL_SEARCH);
        }
    }

    public static final class $ghl_search_p$UnaryFunction extends UnaryFunction {
        public $ghl_search_p$UnaryFunction() {
            super(extractFunctionNamed("GHL-SEARCH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ghl_search_p(arg1);
        }
    }
}

/**
 * Total time: 213 ms
 */
