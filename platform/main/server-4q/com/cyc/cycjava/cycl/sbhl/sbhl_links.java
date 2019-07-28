package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.sbhl.sbhl_links.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_links extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_links();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_links";

    public static final String myFingerPrint = "aa4cbadd21758409fd330e063ba7cfae7b717f4c23247dbf5a86222c5c7008d6";

    // defconstant
    public static final SubLSymbol $dtp_sbhl_directed_link$ = makeSymbol("*DTP-SBHL-DIRECTED-LINK*");

    // defconstant
    public static final SubLSymbol $dtp_sbhl_undirected_link$ = makeSymbol("*DTP-SBHL-UNDIRECTED-LINK*");

    // Internal Constants
    public static final SubLSymbol SBHL_DIRECTED_LINK = makeSymbol("SBHL-DIRECTED-LINK");

    public static final SubLSymbol SBHL_DIRECTED_LINK_P = makeSymbol("SBHL-DIRECTED-LINK-P");

    private static final SubLInteger $int$220 = makeInteger(220);

    public static final SubLList $list3 = list(makeSymbol("PREDICATE-LINKS"), makeSymbol("INVERSE-LINKS"));

    public static final SubLList $list4 = list(makeKeyword("PREDICATE-LINKS"), makeKeyword("INVERSE-LINKS"));

    public static final SubLList $list5 = list(makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS"), makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS"));

    public static final SubLSymbol PRINT_LINK = makeSymbol("PRINT-LINK");

    public static final SubLSymbol SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-DIRECTED-LINK-P"));

    private static final SubLSymbol SBHL_DIRECTED_LINK_PREDICATE_LINKS = makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS");

    private static final SubLSymbol _CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS = makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS");

    private static final SubLSymbol SBHL_DIRECTED_LINK_INVERSE_LINKS = makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS");

    private static final SubLSymbol _CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS = makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS");





    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SBHL_DIRECTED_LINK = makeSymbol("MAKE-SBHL-DIRECTED-LINK");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-DIRECTED-LINK-METHOD");

    private static final SubLSymbol SBHL_UNDIRECTED_LINK = makeSymbol("SBHL-UNDIRECTED-LINK");

    private static final SubLSymbol SBHL_UNDIRECTED_LINK_P = makeSymbol("SBHL-UNDIRECTED-LINK-P");

    private static final SubLInteger $int$221 = makeInteger(221);

    private static final SubLList $list25 = list(makeSymbol("LINKS"));

    private static final SubLList $list26 = list(makeKeyword("LINKS"));

    private static final SubLList $list27 = list(makeSymbol("SBHL-UNDIRECTED-LINK-LINKS"));

    private static final SubLList $list28 = list(makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS"));

    private static final SubLSymbol SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list30 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-UNDIRECTED-LINK-P"));

    private static final SubLSymbol SBHL_UNDIRECTED_LINK_LINKS = makeSymbol("SBHL-UNDIRECTED-LINK-LINKS");

    private static final SubLSymbol _CSETF_SBHL_UNDIRECTED_LINK_LINKS = makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS");



    private static final SubLSymbol MAKE_SBHL_UNDIRECTED_LINK = makeSymbol("MAKE-SBHL-UNDIRECTED-LINK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD");





    private static final SubLString $str38$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");



    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str43$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLSymbol SBHL_DIRECTED_DIRECTION_P = makeSymbol("SBHL-DIRECTED-DIRECTION-P");

    private static final SubLSymbol SBHL_MT_LINKS_OBJECT_P = makeSymbol("SBHL-MT-LINKS-OBJECT-P");

    private static final SubLSymbol SBHL_TV_LINKS_OBJECT_P = makeSymbol("SBHL-TV-LINKS-OBJECT-P");

    private static final SubLSymbol SBHL_MT_OBJECT_P = makeSymbol("SBHL-MT-OBJECT-P");

    private static final SubLSymbol SBHL_LINK_TRUTH_VALUE_P = makeSymbol("SBHL-LINK-TRUTH-VALUE-P");

    private static final SubLSymbol SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");

    private static final SubLString $str50$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLSymbol SBHL_LINK_NODES_OBJECT_P = makeSymbol("SBHL-LINK-NODES-OBJECT-P");

    public static SubLObject sbhl_directed_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_directed_link_p(final SubLObject v_object) {
        return v_object.getClass() == sbhl_links.$sbhl_directed_link_native.class ? T : NIL;
    }

    public static SubLObject sbhl_directed_link_predicate_links(final SubLObject v_object) {
        assert NIL != sbhl_directed_link_p(v_object) : "sbhl_links.sbhl_directed_link_p(v_object) " + "CommonSymbols.NIL != sbhl_links.sbhl_directed_link_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject sbhl_directed_link_inverse_links(final SubLObject v_object) {
        assert NIL != sbhl_directed_link_p(v_object) : "sbhl_links.sbhl_directed_link_p(v_object) " + "CommonSymbols.NIL != sbhl_links.sbhl_directed_link_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sbhl_directed_link_predicate_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_directed_link_p(v_object) : "sbhl_links.sbhl_directed_link_p(v_object) " + "CommonSymbols.NIL != sbhl_links.sbhl_directed_link_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_directed_link_inverse_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_directed_link_p(v_object) : "sbhl_links.sbhl_directed_link_p(v_object) " + "CommonSymbols.NIL != sbhl_links.sbhl_directed_link_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sbhl_directed_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new sbhl_links.$sbhl_directed_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PREDICATE_LINKS)) {
                _csetf_sbhl_directed_link_predicate_links(v_new, current_value);
            } else
                if (pcase_var.eql($INVERSE_LINKS)) {
                    _csetf_sbhl_directed_link_inverse_links(v_new, current_value);
                } else {
                    Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_directed_link(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SBHL_DIRECTED_LINK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PREDICATE_LINKS, sbhl_directed_link_predicate_links(obj));
        funcall(visitor_fn, obj, $SLOT, $INVERSE_LINKS, sbhl_directed_link_inverse_links(obj));
        funcall(visitor_fn, obj, $END, MAKE_SBHL_DIRECTED_LINK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_directed_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_directed_link(obj, visitor_fn);
    }

    public static SubLObject sbhl_undirected_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_undirected_link_p(final SubLObject v_object) {
        return v_object.getClass() == sbhl_links.$sbhl_undirected_link_native.class ? T : NIL;
    }

    public static SubLObject sbhl_undirected_link_links(final SubLObject v_object) {
        assert NIL != sbhl_undirected_link_p(v_object) : "sbhl_links.sbhl_undirected_link_p(v_object) " + "CommonSymbols.NIL != sbhl_links.sbhl_undirected_link_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sbhl_undirected_link_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_undirected_link_p(v_object) : "sbhl_links.sbhl_undirected_link_p(v_object) " + "CommonSymbols.NIL != sbhl_links.sbhl_undirected_link_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_sbhl_undirected_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new sbhl_links.$sbhl_undirected_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LINKS)) {
                _csetf_sbhl_undirected_link_links(v_new, current_value);
            } else {
                Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_undirected_link(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SBHL_UNDIRECTED_LINK, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LINKS, sbhl_undirected_link_links(obj));
        funcall(visitor_fn, obj, $END, MAKE_SBHL_UNDIRECTED_LINK, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_undirected_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_undirected_link(obj, visitor_fn);
    }

    public static SubLObject print_link(final SubLObject link, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(link, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, link, T, NIL);
            print_macros.print_unreadable_object_postamble(stream, link, T, T);
        }
        return NIL;
    }

    public static SubLObject create_sbhl_directed_link(final SubLObject direction, final SubLObject mt_links) {
        final SubLObject direction_link = make_sbhl_directed_link(UNPROVIDED);
        set_sbhl_directed_link(direction_link, direction, mt_links);
        return direction_link;
    }

    public static SubLObject create_sbhl_undirected_link(final SubLObject mt_links) {
        final SubLObject direction_link = make_sbhl_undirected_link(UNPROVIDED);
        set_sbhl_undirected_link(direction_link, mt_links);
        return direction_link;
    }

    public static SubLObject create_sbhl_direction_link(final SubLObject direction, final SubLObject mt_links, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject direction_link = NIL;
        direction_link = (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? create_sbhl_directed_link(direction, mt_links) : create_sbhl_undirected_link(mt_links);
        return direction_link;
    }

    public static SubLObject sbhl_direction_link_p(final SubLObject d_link) {
        return makeBoolean((NIL != sbhl_directed_link_p(d_link)) || (NIL != sbhl_undirected_link_p(d_link)));
    }

    public static SubLObject any_sbhl_links_p(final SubLObject node, final SubLObject pred) {
        return list_utilities.sublisp_boolean(sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(pred)));
    }

    public static SubLObject any_sbhl_predicate_links_p(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_utilities.sbhl_predicate_p(pred))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, pred, SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, pred, SBHL_PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, pred, SBHL_PREDICATE_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, pred, SBHL_PREDICATE_P);
                    }


        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        final SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (NIL == direction_link) {
            return NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return list_utilities.sublisp_boolean(sbhl_directed_link_predicate_links(direction_link));
        }
        return list_utilities.sublisp_boolean(sbhl_undirected_link_links(direction_link));
    }

    public static SubLObject get_sbhl_directed_mt_links(final SubLObject directed_link, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
            return sbhl_directed_link_predicate_links(directed_link);
        }
        if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
            return sbhl_directed_link_inverse_links(directed_link);
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_directed_direction_p(direction))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                    }


        }
        return NIL;
    }

    public static SubLObject get_sbhl_undirected_mt_links(final SubLObject undirected_link) {
        return sbhl_undirected_link_links(undirected_link);
    }

    public static SubLObject get_sbhl_mt_links(final SubLObject direction_link, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject mt_links = NIL;
        mt_links = (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? get_sbhl_directed_mt_links(direction_link, direction) : get_sbhl_undirected_mt_links(direction_link);
        return mt_links;
    }

    public static SubLObject set_sbhl_directed_link(final SubLObject directed_link, final SubLObject direction, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_directed_link_p(directed_link))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, directed_link, SBHL_DIRECTED_LINK_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_directed_direction_p(direction))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, direction, SBHL_DIRECTED_DIRECTION_P);
                    }


        }
        if (((NIL != value) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_mt_links_object_p(value))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                    }


        }
        if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
            _csetf_sbhl_directed_link_predicate_links(directed_link, value);
        } else
            if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
                _csetf_sbhl_directed_link_inverse_links(directed_link, value);
            }

        return NIL;
    }

    public static SubLObject set_sbhl_undirected_link(final SubLObject undirected_link, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_undirected_link_p(undirected_link))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, undirected_link, SBHL_UNDIRECTED_LINK_P);
                    }


        }
        if (((NIL != value) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_mt_links_object_p(value))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, value, SBHL_MT_LINKS_OBJECT_P);
                    }


        }
        _csetf_sbhl_undirected_link_links(undirected_link, value);
        return NIL;
    }

    public static SubLObject set_sbhl_direction_link(final SubLObject direction_link, final SubLObject direction, final SubLObject value, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            set_sbhl_directed_link(direction_link, direction, value);
        } else {
            set_sbhl_undirected_link(direction_link, value);
        }
        return NIL;
    }

    public static SubLObject remove_sbhl_direction_link(final SubLObject direction_link, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        set_sbhl_direction_link(direction_link, direction, NIL, module);
        return NIL;
    }

    public static SubLObject create_sbhl_mt_links(final SubLObject mt, final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                    }


        }
        final SubLObject mt_links = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        dictionary.dictionary_enter(mt_links, mt, tv_links);
        return mt_links;
    }

    public static SubLObject sbhl_mt_links_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject sbhl_wf_mt_links_p(final SubLObject mt_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP;
        SubLObject iteration_state;
        for (invalidP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == invalidP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sbhl_link_vars.sbhl_mt_object_p(mt)) {
                if (NIL == sbhl_wf_tv_links_p(tv_links)) {
                    invalidP = T;
                }
            } else {
                invalidP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == invalidP);
    }

    public static SubLObject get_sbhl_graph_mt_links(final SubLObject node, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module);
    }

    public static SubLObject get_sbhl_graph_link_mts(final SubLObject node, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return dictionary.dictionary_keys(get_sbhl_graph_mt_links(node, direction, module));
    }

    public static SubLObject get_sbhl_tv_links(final SubLObject mt_links, final SubLObject mt) {
        return dictionary.dictionary_lookup_without_values(mt_links, mt, UNPROVIDED);
    }

    public static SubLObject set_sbhl_mt_links(final SubLObject mt_links, final SubLObject mt, final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tv_links) {
            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_tv_links_object_p(tv_links))) {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var.eql($ERROR)) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($CERROR)) {
                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($WARN)) {
                            Errors.warn($str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                        } else {
                            Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                        }


            }
            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var.eql($ERROR)) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($CERROR)) {
                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($WARN)) {
                            Errors.warn($str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                        } else {
                            Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                        }


            }
            dictionary.dictionary_enter(mt_links, mt, tv_links);
        } else {
            dictionary.dictionary_remove(mt_links, mt);
        }
        return NIL;
    }

    public static SubLObject remove_sbhl_mt_link_from_graph(final SubLObject node, final SubLObject mt, final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        dictionary.dictionary_remove(get_sbhl_mt_links(direction_link, direction, module), mt);
        return NIL;
    }

    public static SubLObject remove_sbhl_mt_link_from_relevant_directions(final SubLObject node, final SubLObject mt, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
        SubLObject direction = NIL;
        direction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remove_sbhl_mt_link_from_graph(node, mt, direction, module);
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject remove_sbhl_mt_link(final SubLObject mt_links, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_mt_links_object_p(mt_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, mt_links, SBHL_MT_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_mt_object_p(mt))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, mt, SBHL_MT_OBJECT_P);
                    }


        }
        dictionary.dictionary_remove(mt_links, mt);
        return NIL;
    }

    public static SubLObject create_sbhl_tv_links(final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    }


        }
        final SubLObject tv_links = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        push_onto_sbhl_tv_links(tv_links, truth, node);
        return tv_links;
    }

    public static SubLObject sbhl_tv_links_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject sbhl_wf_tv_links_p(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP;
        SubLObject iteration_state;
        for (invalidP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == invalidP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_link = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                final SubLObject sol = tv_link;
                if (NIL != set.set_p(sol)) {
                    final SubLObject set_contents_var = set.do_set_internal(sol);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject linked_node;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == invalidP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        linked_node = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, linked_node)) && (NIL == sbhl_link_vars.sbhl_node_object_p(linked_node))) {
                            invalidP = T;
                        }
                    }
                } else
                    if (sol.isList()) {
                        if (NIL == invalidP) {
                            SubLObject csome_list_var = sol;
                            SubLObject linked_node2 = NIL;
                            linked_node2 = csome_list_var.first();
                            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                                if (NIL == sbhl_link_vars.sbhl_node_object_p(linked_node2)) {
                                    invalidP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                linked_node2 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str50$_A_is_neither_SET_P_nor_LISTP_, sol);
                    }

            } else {
                invalidP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == invalidP);
    }

    public static SubLObject get_sbhl_graph_tv_links(final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return get_sbhl_tv_links(get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module), mt);
    }

    public static SubLObject get_sbhl_link_nodes(final SubLObject tv_links, final SubLObject truth) {
        return dictionary.dictionary_lookup(tv_links, truth, UNPROVIDED);
    }

    public static SubLObject member_of_tv_linksP(final SubLObject node, final SubLObject truth, final SubLObject tv_links) {
        if (NIL != dictionary.dictionary_p(tv_links)) {
            return set.set_or_list_memberP(node, get_sbhl_link_nodes(tv_links, truth));
        }
        return NIL;
    }

    public static SubLObject any_sbhl_true_link_nodes_p(final SubLObject tv_links) {
        SubLObject foundP = NIL;
        final SubLObject sol = sbhl_link_vars.$sbhl_true_link_truth_values$.getGlobalValue();
        if (NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject truth;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                truth = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, truth)) && (NIL != get_sbhl_link_nodes(tv_links, truth))) {
                    foundP = T;
                }
            }
        } else
            if (sol.isList()) {
                SubLObject csome_list_var = sol;
                SubLObject truth2 = NIL;
                truth2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != get_sbhl_link_nodes(tv_links, truth2)) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    truth2 = csome_list_var.first();
                } 
            } else {
                Errors.error($str50$_A_is_neither_SET_P_nor_LISTP_, sol);
            }

        return foundP;
    }

    public static SubLObject set_sbhl_tv_links(final SubLObject tv_links, final SubLObject truth, SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if (value.isList()) {
            final SubLObject node_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = value;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(item, node_set);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            value = node_set;
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_nodes_object_p(value))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, value, SBHL_LINK_NODES_OBJECT_P);
                    }


        }
        dictionary.dictionary_enter(tv_links, truth, value);
        return NIL;
    }

    public static SubLObject push_onto_sbhl_tv_links(final SubLObject tv_links, final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    }


        }
        SubLObject node_set = get_sbhl_link_nodes(tv_links, truth);
        if (NIL == node_set) {
            node_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            dictionary.dictionary_enter(tv_links, truth, node_set);
        }
        if (node_set.isList()) {
            tv_links_to_set_from_list(tv_links);
            node_set = get_sbhl_link_nodes(tv_links, truth);
        }
        set.set_add(node, node_set);
        return tv_links;
    }

    public static SubLObject tv_links_to_set_from_list(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dictionary_contents = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_link = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (tv_link.isList()) {
                final SubLObject node_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject cdolist_list_var = tv_link;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    set.set_add(item, node_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                new_dictionary_contents = cons(cons(truth, node_set), new_dictionary_contents);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(tv_links);
        SubLObject cdolist_list_var2 = new_dictionary_contents;
        SubLObject entry = NIL;
        entry = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            dictionary.dictionary_enter(tv_links, entry.first(), entry.rest());
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        } 
        return tv_links;
    }

    public static SubLObject remove_sbhl_tv_link_node(final SubLObject tv_links, final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    }


        }
        SubLObject node_set = get_sbhl_link_nodes(tv_links, truth);
        if (node_set.isList()) {
            if (NIL == node_set) {
                return tv_links;
            }
            final SubLObject anode_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            set_utilities.set_add_all(node_set, anode_set);
            node_set = anode_set;
            dictionary.dictionary_enter(tv_links, truth, node_set);
        }
        set.set_remove(node, node_set);
        return tv_links;
    }

    public static SubLObject remove_sbhl_tv_link(final SubLObject tv_links, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_tv_links_object_p(tv_links))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, tv_links, SBHL_TV_LINKS_OBJECT_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    } else {
                        Errors.warn($str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str38$_A_is_not_a__A, truth, SBHL_LINK_TRUTH_VALUE_P);
                    }


        }
        dictionary.dictionary_remove(tv_links, truth);
        return NIL;
    }

    public static SubLObject declare_sbhl_links_file() {
        declareFunction(me, "sbhl_directed_link_print_function_trampoline", "SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sbhl_directed_link_p", "SBHL-DIRECTED-LINK-P", 1, 0, false);
        new sbhl_links.$sbhl_directed_link_p$UnaryFunction();
        declareFunction(me, "sbhl_directed_link_predicate_links", "SBHL-DIRECTED-LINK-PREDICATE-LINKS", 1, 0, false);
        declareFunction(me, "sbhl_directed_link_inverse_links", "SBHL-DIRECTED-LINK-INVERSE-LINKS", 1, 0, false);
        declareFunction(me, "_csetf_sbhl_directed_link_predicate_links", "_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_directed_link_inverse_links", "_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS", 2, 0, false);
        declareFunction(me, "make_sbhl_directed_link", "MAKE-SBHL-DIRECTED-LINK", 0, 1, false);
        declareFunction(me, "visit_defstruct_sbhl_directed_link", "VISIT-DEFSTRUCT-SBHL-DIRECTED-LINK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sbhl_directed_link_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-DIRECTED-LINK-METHOD", 2, 0, false);
        declareFunction(me, "sbhl_undirected_link_print_function_trampoline", "SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sbhl_undirected_link_p", "SBHL-UNDIRECTED-LINK-P", 1, 0, false);
        new sbhl_links.$sbhl_undirected_link_p$UnaryFunction();
        declareFunction(me, "sbhl_undirected_link_links", "SBHL-UNDIRECTED-LINK-LINKS", 1, 0, false);
        declareFunction(me, "_csetf_sbhl_undirected_link_links", "_CSETF-SBHL-UNDIRECTED-LINK-LINKS", 2, 0, false);
        declareFunction(me, "make_sbhl_undirected_link", "MAKE-SBHL-UNDIRECTED-LINK", 0, 1, false);
        declareFunction(me, "visit_defstruct_sbhl_undirected_link", "VISIT-DEFSTRUCT-SBHL-UNDIRECTED-LINK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sbhl_undirected_link_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD", 2, 0, false);
        declareFunction(me, "print_link", "PRINT-LINK", 3, 0, false);
        declareFunction(me, "create_sbhl_directed_link", "CREATE-SBHL-DIRECTED-LINK", 2, 0, false);
        declareFunction(me, "create_sbhl_undirected_link", "CREATE-SBHL-UNDIRECTED-LINK", 1, 0, false);
        declareFunction(me, "create_sbhl_direction_link", "CREATE-SBHL-DIRECTION-LINK", 3, 0, false);
        declareFunction(me, "sbhl_direction_link_p", "SBHL-DIRECTION-LINK-P", 1, 0, false);
        declareFunction(me, "any_sbhl_links_p", "ANY-SBHL-LINKS-P", 2, 0, false);
        declareFunction(me, "any_sbhl_predicate_links_p", "ANY-SBHL-PREDICATE-LINKS-P", 2, 0, false);
        declareFunction(me, "get_sbhl_directed_mt_links", "GET-SBHL-DIRECTED-MT-LINKS", 2, 0, false);
        declareFunction(me, "get_sbhl_undirected_mt_links", "GET-SBHL-UNDIRECTED-MT-LINKS", 1, 0, false);
        declareFunction(me, "get_sbhl_mt_links", "GET-SBHL-MT-LINKS", 3, 0, false);
        declareFunction(me, "set_sbhl_directed_link", "SET-SBHL-DIRECTED-LINK", 3, 0, false);
        declareFunction(me, "set_sbhl_undirected_link", "SET-SBHL-UNDIRECTED-LINK", 2, 0, false);
        declareFunction(me, "set_sbhl_direction_link", "SET-SBHL-DIRECTION-LINK", 4, 0, false);
        declareFunction(me, "remove_sbhl_direction_link", "REMOVE-SBHL-DIRECTION-LINK", 3, 0, false);
        declareFunction(me, "create_sbhl_mt_links", "CREATE-SBHL-MT-LINKS", 2, 0, false);
        declareFunction(me, "sbhl_mt_links_object_p", "SBHL-MT-LINKS-OBJECT-P", 1, 0, false);
        declareFunction(me, "sbhl_wf_mt_links_p", "SBHL-WF-MT-LINKS-P", 1, 0, false);
        declareFunction(me, "get_sbhl_graph_mt_links", "GET-SBHL-GRAPH-MT-LINKS", 3, 0, false);
        declareFunction(me, "get_sbhl_graph_link_mts", "GET-SBHL-GRAPH-LINK-MTS", 3, 0, false);
        declareFunction(me, "get_sbhl_tv_links", "GET-SBHL-TV-LINKS", 2, 0, false);
        declareFunction(me, "set_sbhl_mt_links", "SET-SBHL-MT-LINKS", 3, 0, false);
        declareFunction(me, "remove_sbhl_mt_link_from_graph", "REMOVE-SBHL-MT-LINK-FROM-GRAPH", 4, 0, false);
        declareFunction(me, "remove_sbhl_mt_link_from_relevant_directions", "REMOVE-SBHL-MT-LINK-FROM-RELEVANT-DIRECTIONS", 3, 0, false);
        declareFunction(me, "remove_sbhl_mt_link", "REMOVE-SBHL-MT-LINK", 2, 0, false);
        declareFunction(me, "create_sbhl_tv_links", "CREATE-SBHL-TV-LINKS", 2, 0, false);
        declareFunction(me, "sbhl_tv_links_object_p", "SBHL-TV-LINKS-OBJECT-P", 1, 0, false);
        declareFunction(me, "sbhl_wf_tv_links_p", "SBHL-WF-TV-LINKS-P", 1, 0, false);
        declareFunction(me, "get_sbhl_graph_tv_links", "GET-SBHL-GRAPH-TV-LINKS", 4, 0, false);
        declareFunction(me, "get_sbhl_link_nodes", "GET-SBHL-LINK-NODES", 2, 0, false);
        declareFunction(me, "member_of_tv_linksP", "MEMBER-OF-TV-LINKS?", 3, 0, false);
        declareFunction(me, "any_sbhl_true_link_nodes_p", "ANY-SBHL-TRUE-LINK-NODES-P", 1, 0, false);
        declareFunction(me, "set_sbhl_tv_links", "SET-SBHL-TV-LINKS", 3, 0, false);
        declareFunction(me, "push_onto_sbhl_tv_links", "PUSH-ONTO-SBHL-TV-LINKS", 3, 0, false);
        declareFunction(me, "tv_links_to_set_from_list", "TV-LINKS-TO-SET-FROM-LIST", 1, 0, false);
        declareFunction(me, "remove_sbhl_tv_link_node", "REMOVE-SBHL-TV-LINK-NODE", 3, 0, false);
        declareFunction(me, "remove_sbhl_tv_link", "REMOVE-SBHL-TV-LINK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_links_file() {
        defconstant("*DTP-SBHL-DIRECTED-LINK*", SBHL_DIRECTED_LINK);
        defconstant("*DTP-SBHL-UNDIRECTED-LINK*", SBHL_UNDIRECTED_LINK);
        return NIL;
    }

    public static SubLObject setup_sbhl_links_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_directed_link$.getGlobalValue(), symbol_function(SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(SBHL_DIRECTED_LINK_PREDICATE_LINKS, _CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS);
        def_csetf(SBHL_DIRECTED_LINK_INVERSE_LINKS, _CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS);
        identity(SBHL_DIRECTED_LINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_directed_link$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_undirected_link$.getGlobalValue(), symbol_function(SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list30);
        def_csetf(SBHL_UNDIRECTED_LINK_LINKS, _CSETF_SBHL_UNDIRECTED_LINK_LINKS);
        identity(SBHL_UNDIRECTED_LINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_undirected_link$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_links_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_links_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_links_file();
    }

    static {























































    }

    public static final class $sbhl_directed_link_native extends SubLStructNative {
        public SubLObject $predicate_links;

        public SubLObject $inverse_links;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_directed_link_native() {
            this.$predicate_links = Lisp.NIL;
            this.$inverse_links = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$predicate_links;
        }

        @Override
        public SubLObject getField3() {
            return this.$inverse_links;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$predicate_links = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$inverse_links = value;
        }

        static {
            structDecl = makeStructDeclNative(sbhl_links.$sbhl_directed_link_native.class, SBHL_DIRECTED_LINK, SBHL_DIRECTED_LINK_P, $list3, $list4, new String[]{ "$predicate_links", "$inverse_links" }, $list5, $list6, PRINT_LINK);
        }
    }

    public static final class $sbhl_directed_link_p$UnaryFunction extends UnaryFunction {
        public $sbhl_directed_link_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-DIRECTED-LINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_directed_link_p(arg1);
        }
    }

    public static final class $sbhl_undirected_link_native extends SubLStructNative {
        public SubLObject $links;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_undirected_link_native() {
            this.$links = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$links;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$links = value;
        }

        static {
            structDecl = makeStructDeclNative(sbhl_links.$sbhl_undirected_link_native.class, SBHL_UNDIRECTED_LINK, SBHL_UNDIRECTED_LINK_P, $list25, $list26, new String[]{ "$links" }, $list27, $list28, PRINT_LINK);
        }
    }

    public static final class $sbhl_undirected_link_p$UnaryFunction extends UnaryFunction {
        public $sbhl_undirected_link_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-UNDIRECTED-LINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_undirected_link_p(arg1);
        }
    }
}

/**
 * Total time: 288 ms
 */
