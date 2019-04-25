package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_links extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_links";
    public static final String myFingerPrint = "aa4cbadd21758409fd330e063ba7cfae7b717f4c23247dbf5a86222c5c7008d6";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLSymbol $dtp_sbhl_directed_link$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLSymbol $dtp_sbhl_undirected_link$;
    private static final SubLSymbol $sym0$SBHL_DIRECTED_LINK;
    private static final SubLSymbol $sym1$SBHL_DIRECTED_LINK_P;
    private static final SubLInteger $int2$220;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_LINK;
    private static final SubLSymbol $sym8$SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$SBHL_DIRECTED_LINK_PREDICATE_LINKS;
    private static final SubLSymbol $sym11$_CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS;
    private static final SubLSymbol $sym12$SBHL_DIRECTED_LINK_INVERSE_LINKS;
    private static final SubLSymbol $sym13$_CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS;
    private static final SubLSymbol $kw14$PREDICATE_LINKS;
    private static final SubLSymbol $kw15$INVERSE_LINKS;
    private static final SubLString $str16$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw17$BEGIN;
    private static final SubLSymbol $sym18$MAKE_SBHL_DIRECTED_LINK;
    private static final SubLSymbol $kw19$SLOT;
    private static final SubLSymbol $kw20$END;
    private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD;
    private static final SubLSymbol $sym22$SBHL_UNDIRECTED_LINK;
    private static final SubLSymbol $sym23$SBHL_UNDIRECTED_LINK_P;
    private static final SubLInteger $int24$221;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$SBHL_UNDIRECTED_LINK_LINKS;
    private static final SubLSymbol $sym32$_CSETF_SBHL_UNDIRECTED_LINK_LINKS;
    private static final SubLSymbol $kw33$LINKS;
    private static final SubLSymbol $sym34$MAKE_SBHL_UNDIRECTED_LINK;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD;
    private static final SubLSymbol $sym36$SBHL_MODULE_P;
    private static final SubLSymbol $kw37$ERROR;
    private static final SubLString $str38$_A_is_not_a__A;
    private static final SubLSymbol $sym39$SBHL_PREDICATE_P;
    private static final SubLSymbol $kw40$CERROR;
    private static final SubLString $str41$continue_anyway;
    private static final SubLSymbol $kw42$WARN;
    private static final SubLString $str43$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLSymbol $sym44$SBHL_DIRECTED_DIRECTION_P;
    private static final SubLSymbol $sym45$SBHL_MT_LINKS_OBJECT_P;
    private static final SubLSymbol $sym46$SBHL_TV_LINKS_OBJECT_P;
    private static final SubLSymbol $sym47$SBHL_MT_OBJECT_P;
    private static final SubLSymbol $sym48$SBHL_LINK_TRUTH_VALUE_P;
    private static final SubLSymbol $sym49$SBHL_NODE_OBJECT_P;
    private static final SubLString $str50$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLSymbol $sym51$SBHL_LINK_NODES_OBJECT_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject sbhl_directed_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_link(v_object, stream, (SubLObject)sbhl_links.ZERO_INTEGER);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject sbhl_directed_link_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sbhl_directed_link_native.class) ? sbhl_links.T : sbhl_links.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject sbhl_directed_link_predicate_links(final SubLObject v_object) {
        assert sbhl_links.NIL != sbhl_directed_link_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject sbhl_directed_link_inverse_links(final SubLObject v_object) {
        assert sbhl_links.NIL != sbhl_directed_link_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject _csetf_sbhl_directed_link_predicate_links(final SubLObject v_object, final SubLObject value) {
        assert sbhl_links.NIL != sbhl_directed_link_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject _csetf_sbhl_directed_link_inverse_links(final SubLObject v_object, final SubLObject value) {
        assert sbhl_links.NIL != sbhl_directed_link_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject make_sbhl_directed_link(SubLObject arglist) {
        if (arglist == sbhl_links.UNPROVIDED) {
            arglist = (SubLObject)sbhl_links.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sbhl_directed_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sbhl_links.NIL, next = arglist; sbhl_links.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sbhl_links.$kw14$PREDICATE_LINKS)) {
                _csetf_sbhl_directed_link_predicate_links(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw15$INVERSE_LINKS)) {
                _csetf_sbhl_directed_link_inverse_links(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sbhl_links.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject visit_defstruct_sbhl_directed_link(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw17$BEGIN, (SubLObject)sbhl_links.$sym18$MAKE_SBHL_DIRECTED_LINK, (SubLObject)sbhl_links.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw19$SLOT, (SubLObject)sbhl_links.$kw14$PREDICATE_LINKS, sbhl_directed_link_predicate_links(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw19$SLOT, (SubLObject)sbhl_links.$kw15$INVERSE_LINKS, sbhl_directed_link_inverse_links(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw20$END, (SubLObject)sbhl_links.$sym18$MAKE_SBHL_DIRECTED_LINK, (SubLObject)sbhl_links.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 846L)
    public static SubLObject visit_defstruct_object_sbhl_directed_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_directed_link(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject sbhl_undirected_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_link(v_object, stream, (SubLObject)sbhl_links.ZERO_INTEGER);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject sbhl_undirected_link_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sbhl_undirected_link_native.class) ? sbhl_links.T : sbhl_links.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject sbhl_undirected_link_links(final SubLObject v_object) {
        assert sbhl_links.NIL != sbhl_undirected_link_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject _csetf_sbhl_undirected_link_links(final SubLObject v_object, final SubLObject value) {
        assert sbhl_links.NIL != sbhl_undirected_link_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject make_sbhl_undirected_link(SubLObject arglist) {
        if (arglist == sbhl_links.UNPROVIDED) {
            arglist = (SubLObject)sbhl_links.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sbhl_undirected_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sbhl_links.NIL, next = arglist; sbhl_links.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sbhl_links.$kw33$LINKS)) {
                _csetf_sbhl_undirected_link_links(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sbhl_links.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject visit_defstruct_sbhl_undirected_link(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw17$BEGIN, (SubLObject)sbhl_links.$sym34$MAKE_SBHL_UNDIRECTED_LINK, (SubLObject)sbhl_links.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw19$SLOT, (SubLObject)sbhl_links.$kw33$LINKS, sbhl_undirected_link_links(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_links.$kw20$END, (SubLObject)sbhl_links.$sym34$MAKE_SBHL_UNDIRECTED_LINK, (SubLObject)sbhl_links.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1706L)
    public static SubLObject visit_defstruct_object_sbhl_undirected_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_undirected_link(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1807L)
    public static SubLObject print_link(final SubLObject link, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(link, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, link, (SubLObject)sbhl_links.T, (SubLObject)sbhl_links.NIL);
            print_macros.print_unreadable_object_postamble(stream, link, (SubLObject)sbhl_links.T, (SubLObject)sbhl_links.T);
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 1948L)
    public static SubLObject create_sbhl_directed_link(final SubLObject direction, final SubLObject mt_links) {
        final SubLObject direction_link = make_sbhl_directed_link((SubLObject)sbhl_links.UNPROVIDED);
        set_sbhl_directed_link(direction_link, direction, mt_links);
        return direction_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 2674L)
    public static SubLObject create_sbhl_undirected_link(final SubLObject mt_links) {
        final SubLObject direction_link = make_sbhl_undirected_link((SubLObject)sbhl_links.UNPROVIDED);
        set_sbhl_undirected_link(direction_link, mt_links);
        return direction_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 2949L)
    public static SubLObject create_sbhl_direction_link(final SubLObject direction, final SubLObject mt_links, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject direction_link = (SubLObject)sbhl_links.NIL;
        direction_link = ((sbhl_links.NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? create_sbhl_directed_link(direction, mt_links) : create_sbhl_undirected_link(mt_links));
        return direction_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 3453L)
    public static SubLObject sbhl_direction_link_p(final SubLObject d_link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_links.NIL != sbhl_directed_link_p(d_link) || sbhl_links.NIL != sbhl_undirected_link_p(d_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 4073L)
    public static SubLObject any_sbhl_links_p(final SubLObject node, final SubLObject pred) {
        return list_utilities.sublisp_boolean(sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(pred)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 4278L)
    public static SubLObject any_sbhl_predicate_links_p(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_module_utilities.sbhl_predicate_p(pred)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, pred, (SubLObject)sbhl_links.$sym39$SBHL_PREDICATE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, pred, (SubLObject)sbhl_links.$sym39$SBHL_PREDICATE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, pred, (SubLObject)sbhl_links.$sym39$SBHL_PREDICATE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, pred, (SubLObject)sbhl_links.$sym39$SBHL_PREDICATE_P);
            }
        }
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        final SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (sbhl_links.NIL == direction_link) {
            return (SubLObject)sbhl_links.NIL;
        }
        if (sbhl_links.NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            return list_utilities.sublisp_boolean(sbhl_directed_link_predicate_links(direction_link));
        }
        return list_utilities.sublisp_boolean(sbhl_undirected_link_links(direction_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 4795L)
    public static SubLObject get_sbhl_directed_mt_links(final SubLObject directed_link, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
            return sbhl_directed_link_predicate_links(directed_link);
        }
        if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
            return sbhl_directed_link_inverse_links(directed_link);
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_directed_direction_p(direction)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P);
            }
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 5302L)
    public static SubLObject get_sbhl_undirected_mt_links(final SubLObject undirected_link) {
        return sbhl_undirected_link_links(undirected_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 5523L)
    public static SubLObject get_sbhl_mt_links(final SubLObject direction_link, final SubLObject direction, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject mt_links = (SubLObject)sbhl_links.NIL;
        mt_links = ((sbhl_links.NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) ? get_sbhl_directed_mt_links(direction_link, direction) : get_sbhl_undirected_mt_links(direction_link));
        return mt_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 5996L)
    public static SubLObject set_sbhl_directed_link(final SubLObject directed_link, final SubLObject direction, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_directed_link_p(directed_link)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, directed_link, (SubLObject)sbhl_links.$sym1$SBHL_DIRECTED_LINK_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, directed_link, (SubLObject)sbhl_links.$sym1$SBHL_DIRECTED_LINK_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, directed_link, (SubLObject)sbhl_links.$sym1$SBHL_DIRECTED_LINK_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, directed_link, (SubLObject)sbhl_links.$sym1$SBHL_DIRECTED_LINK_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_directed_direction_p(direction)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, direction, (SubLObject)sbhl_links.$sym44$SBHL_DIRECTED_DIRECTION_P);
            }
        }
        if (sbhl_links.NIL != value && sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_mt_links_object_p(value)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P);
            }
        }
        if (direction.eql(sbhl_link_vars.get_sbhl_forward_directed_direction())) {
            _csetf_sbhl_directed_link_predicate_links(directed_link, value);
        }
        else if (direction.eql(sbhl_link_vars.get_sbhl_backward_directed_direction())) {
            _csetf_sbhl_directed_link_inverse_links(directed_link, value);
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 6880L)
    public static SubLObject set_sbhl_undirected_link(final SubLObject undirected_link, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_undirected_link_p(undirected_link)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, undirected_link, (SubLObject)sbhl_links.$sym23$SBHL_UNDIRECTED_LINK_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, undirected_link, (SubLObject)sbhl_links.$sym23$SBHL_UNDIRECTED_LINK_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, undirected_link, (SubLObject)sbhl_links.$sym23$SBHL_UNDIRECTED_LINK_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, undirected_link, (SubLObject)sbhl_links.$sym23$SBHL_UNDIRECTED_LINK_P);
            }
        }
        if (sbhl_links.NIL != value && sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_mt_links_object_p(value)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P);
            }
        }
        _csetf_sbhl_undirected_link_links(undirected_link, value);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 7240L)
    public static SubLObject set_sbhl_direction_link(final SubLObject direction_link, final SubLObject direction, final SubLObject value, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_links.NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module)) {
            set_sbhl_directed_link(direction_link, direction, value);
        }
        else {
            set_sbhl_undirected_link(direction_link, value);
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 7671L)
    public static SubLObject remove_sbhl_direction_link(final SubLObject direction_link, final SubLObject direction, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        set_sbhl_direction_link(direction_link, direction, (SubLObject)sbhl_links.NIL, module);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 7959L)
    public static SubLObject create_sbhl_mt_links(final SubLObject mt, final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_tv_links_object_p(tv_links)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_mt_object_p(mt)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P);
            }
        }
        final SubLObject mt_links = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_links.EQUAL), (SubLObject)sbhl_links.UNPROVIDED);
        dictionary.dictionary_enter(mt_links, mt, tv_links);
        return mt_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 8513L)
    public static SubLObject sbhl_mt_links_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 8852L)
    public static SubLObject sbhl_wf_mt_links_p(final SubLObject mt_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP;
        SubLObject iteration_state;
        for (invalidP = (SubLObject)sbhl_links.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_links.NIL == invalidP && sbhl_links.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_links = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_links.NIL != sbhl_link_vars.sbhl_mt_object_p(mt)) {
                if (sbhl_links.NIL == sbhl_wf_tv_links_p(tv_links)) {
                    invalidP = (SubLObject)sbhl_links.T;
                }
            }
            else {
                invalidP = (SubLObject)sbhl_links.T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_links.NIL == invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 9314L)
    public static SubLObject get_sbhl_graph_mt_links(final SubLObject node, final SubLObject direction, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 9663L)
    public static SubLObject get_sbhl_graph_link_mts(final SubLObject node, final SubLObject direction, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return dictionary.dictionary_keys(get_sbhl_graph_mt_links(node, direction, module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 10012L)
    public static SubLObject get_sbhl_tv_links(final SubLObject mt_links, final SubLObject mt) {
        return dictionary.dictionary_lookup_without_values(mt_links, mt, (SubLObject)sbhl_links.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 10216L)
    public static SubLObject set_sbhl_mt_links(final SubLObject mt_links, final SubLObject mt, final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != tv_links) {
            if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_tv_links_object_p(tv_links)) {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                    Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
                }
                else {
                    Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                    Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
                }
            }
            if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_mt_object_p(mt)) {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                    Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P);
                }
                else {
                    Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                    Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P);
                }
            }
            dictionary.dictionary_enter(mt_links, mt, tv_links);
        }
        else {
            dictionary.dictionary_remove(mt_links, mt);
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 11036L)
    public static SubLObject remove_sbhl_mt_link_from_graph(final SubLObject node, final SubLObject mt, final SubLObject direction, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject direction_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        dictionary.dictionary_remove(get_sbhl_mt_links(direction_link, direction, module), mt);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 11479L)
    public static SubLObject remove_sbhl_mt_link_from_relevant_directions(final SubLObject node, final SubLObject mt, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
        SubLObject direction = (SubLObject)sbhl_links.NIL;
        direction = cdolist_list_var.first();
        while (sbhl_links.NIL != cdolist_list_var) {
            remove_sbhl_mt_link_from_graph(node, mt, direction, module);
            cdolist_list_var = cdolist_list_var.rest();
            direction = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 11956L)
    public static SubLObject remove_sbhl_mt_link(final SubLObject mt_links, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_mt_links_object_p(mt_links)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt_links, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt_links, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt_links, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt_links, (SubLObject)sbhl_links.$sym45$SBHL_MT_LINKS_OBJECT_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_mt_object_p(mt)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, mt, (SubLObject)sbhl_links.$sym47$SBHL_MT_OBJECT_P);
            }
        }
        dictionary.dictionary_remove(mt_links, mt);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 12211L)
    public static SubLObject create_sbhl_tv_links(final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P);
            }
        }
        final SubLObject tv_links = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sbhl_links.EQL), (SubLObject)sbhl_links.UNPROVIDED);
        push_onto_sbhl_tv_links(tv_links, truth, node);
        return tv_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 12754L)
    public static SubLObject sbhl_tv_links_object_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 13236L)
    public static SubLObject sbhl_wf_tv_links_p(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP;
        SubLObject iteration_state;
        for (invalidP = (SubLObject)sbhl_links.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_links.NIL == invalidP && sbhl_links.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_link = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_links.NIL != sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
                final SubLObject sol = tv_link;
                if (sbhl_links.NIL != set.set_p(sol)) {
                    final SubLObject set_contents_var = set.do_set_internal(sol);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject linked_node;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_links.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_links.NIL == invalidP && sbhl_links.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        linked_node = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_links.NIL != set_contents.do_set_contents_element_validP(state, linked_node) && sbhl_links.NIL == sbhl_link_vars.sbhl_node_object_p(linked_node)) {
                            invalidP = (SubLObject)sbhl_links.T;
                        }
                    }
                }
                else if (sol.isList()) {
                    if (sbhl_links.NIL == invalidP) {
                        SubLObject csome_list_var = sol;
                        SubLObject linked_node2 = (SubLObject)sbhl_links.NIL;
                        linked_node2 = csome_list_var.first();
                        while (sbhl_links.NIL == invalidP && sbhl_links.NIL != csome_list_var) {
                            if (sbhl_links.NIL == sbhl_link_vars.sbhl_node_object_p(linked_node2)) {
                                invalidP = (SubLObject)sbhl_links.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            linked_node2 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_links.$str50$_A_is_neither_SET_P_nor_LISTP_, sol);
                }
            }
            else {
                invalidP = (SubLObject)sbhl_links.T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_links.NIL == invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 13791L)
    public static SubLObject get_sbhl_graph_tv_links(final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject module) {
        assert sbhl_links.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return get_sbhl_tv_links(get_sbhl_mt_links(sbhl_graphs.get_sbhl_graph_link(node, module), direction, module), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 14273L)
    public static SubLObject get_sbhl_link_nodes(final SubLObject tv_links, final SubLObject truth) {
        return dictionary.dictionary_lookup(tv_links, truth, (SubLObject)sbhl_links.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 14440L)
    public static SubLObject member_of_tv_linksP(final SubLObject node, final SubLObject truth, final SubLObject tv_links) {
        if (sbhl_links.NIL != dictionary.dictionary_p(tv_links)) {
            return set.set_or_list_memberP(node, get_sbhl_link_nodes(tv_links, truth));
        }
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 14772L)
    public static SubLObject any_sbhl_true_link_nodes_p(final SubLObject tv_links) {
        SubLObject foundP = (SubLObject)sbhl_links.NIL;
        final SubLObject sol = sbhl_link_vars.$sbhl_true_link_truth_values$.getGlobalValue();
        if (sbhl_links.NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject truth;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_links.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_links.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                truth = set_contents.do_set_contents_next(basis_object, state);
                if (sbhl_links.NIL != set_contents.do_set_contents_element_validP(state, truth) && sbhl_links.NIL != get_sbhl_link_nodes(tv_links, truth)) {
                    foundP = (SubLObject)sbhl_links.T;
                }
            }
        }
        else if (sol.isList()) {
            SubLObject csome_list_var = sol;
            SubLObject truth2 = (SubLObject)sbhl_links.NIL;
            truth2 = csome_list_var.first();
            while (sbhl_links.NIL != csome_list_var) {
                if (sbhl_links.NIL != get_sbhl_link_nodes(tv_links, truth2)) {
                    foundP = (SubLObject)sbhl_links.T;
                }
                csome_list_var = csome_list_var.rest();
                truth2 = csome_list_var.first();
            }
        }
        else {
            Errors.error((SubLObject)sbhl_links.$str50$_A_is_neither_SET_P_nor_LISTP_, sol);
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 15051L)
    public static SubLObject set_sbhl_tv_links(final SubLObject tv_links, final SubLObject truth, SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_tv_links_object_p(tv_links)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
        }
        if (value.isList()) {
            final SubLObject node_set = set.new_set(Symbols.symbol_function((SubLObject)sbhl_links.EQUAL), (SubLObject)sbhl_links.UNPROVIDED);
            SubLObject cdolist_list_var = value;
            SubLObject item = (SubLObject)sbhl_links.NIL;
            item = cdolist_list_var.first();
            while (sbhl_links.NIL != cdolist_list_var) {
                set.set_add(item, node_set);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            value = node_set;
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_link_nodes_object_p(value)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym51$SBHL_LINK_NODES_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym51$SBHL_LINK_NODES_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym51$SBHL_LINK_NODES_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, value, (SubLObject)sbhl_links.$sym51$SBHL_LINK_NODES_OBJECT_P);
            }
        }
        dictionary.dictionary_enter(tv_links, truth, value);
        return (SubLObject)sbhl_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 15810L)
    public static SubLObject push_onto_sbhl_tv_links(final SubLObject tv_links, final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_tv_links_object_p(tv_links)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P);
            }
        }
        SubLObject node_set = get_sbhl_link_nodes(tv_links, truth);
        if (sbhl_links.NIL == node_set) {
            node_set = set.new_set(Symbols.symbol_function((SubLObject)sbhl_links.EQUAL), (SubLObject)sbhl_links.UNPROVIDED);
            dictionary.dictionary_enter(tv_links, truth, node_set);
        }
        if (node_set.isList()) {
            tv_links_to_set_from_list(tv_links);
            node_set = get_sbhl_link_nodes(tv_links, truth);
        }
        set.set_add(node, node_set);
        return tv_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 16538L)
    public static SubLObject tv_links_to_set_from_list(final SubLObject tv_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dictionary_contents = (SubLObject)sbhl_links.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_links.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tv_link = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (tv_link.isList()) {
                final SubLObject node_set = set.new_set(Symbols.symbol_function((SubLObject)sbhl_links.EQUAL), (SubLObject)sbhl_links.UNPROVIDED);
                SubLObject cdolist_list_var = tv_link;
                SubLObject item = (SubLObject)sbhl_links.NIL;
                item = cdolist_list_var.first();
                while (sbhl_links.NIL != cdolist_list_var) {
                    set.set_add(item, node_set);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                new_dictionary_contents = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(truth, node_set), new_dictionary_contents);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(tv_links);
        SubLObject cdolist_list_var2 = new_dictionary_contents;
        SubLObject entry = (SubLObject)sbhl_links.NIL;
        entry = cdolist_list_var2.first();
        while (sbhl_links.NIL != cdolist_list_var2) {
            dictionary.dictionary_enter(tv_links, entry.first(), entry.rest());
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        }
        return tv_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 17050L)
    public static SubLObject remove_sbhl_tv_link_node(final SubLObject tv_links, final SubLObject truth, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_tv_links_object_p(tv_links)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, node, (SubLObject)sbhl_links.$sym49$SBHL_NODE_OBJECT_P);
            }
        }
        SubLObject node_set = get_sbhl_link_nodes(tv_links, truth);
        if (node_set.isList()) {
            if (sbhl_links.NIL == node_set) {
                return tv_links;
            }
            final SubLObject anode_set = set.new_set(Symbols.symbol_function((SubLObject)sbhl_links.EQUAL), (SubLObject)sbhl_links.UNPROVIDED);
            set_utilities.set_add_all(node_set, anode_set);
            node_set = anode_set;
            dictionary.dictionary_enter(tv_links, truth, node_set);
        }
        set.set_remove(node, node_set);
        return tv_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-links.lisp", position = 17768L)
    public static SubLObject remove_sbhl_tv_link(final SubLObject tv_links, final SubLObject truth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_tv_links_object_p(tv_links)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, tv_links, (SubLObject)sbhl_links.$sym46$SBHL_TV_LINKS_OBJECT_P);
            }
        }
        if (sbhl_links.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_links.NIL == sbhl_link_vars.sbhl_link_truth_value_p(truth)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_links.$kw37$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw40$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_links.ONE_INTEGER, (SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED, (SubLObject)sbhl_links.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_links.$kw42$WARN)) {
                Errors.warn((SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_links.$str43$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_links.$str41$continue_anyway, (SubLObject)sbhl_links.$str38$_A_is_not_a__A, truth, (SubLObject)sbhl_links.$sym48$SBHL_LINK_TRUTH_VALUE_P);
            }
        }
        dictionary.dictionary_remove(tv_links, truth);
        return (SubLObject)sbhl_links.NIL;
    }
    
    public static SubLObject declare_sbhl_links_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_directed_link_print_function_trampoline", "SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_directed_link_p", "SBHL-DIRECTED-LINK-P", 1, 0, false);
        new $sbhl_directed_link_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_directed_link_predicate_links", "SBHL-DIRECTED-LINK-PREDICATE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_directed_link_inverse_links", "SBHL-DIRECTED-LINK-INVERSE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "_csetf_sbhl_directed_link_predicate_links", "_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "_csetf_sbhl_directed_link_inverse_links", "_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "make_sbhl_directed_link", "MAKE-SBHL-DIRECTED-LINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "visit_defstruct_sbhl_directed_link", "VISIT-DEFSTRUCT-SBHL-DIRECTED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "visit_defstruct_object_sbhl_directed_link_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-DIRECTED-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_undirected_link_print_function_trampoline", "SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_undirected_link_p", "SBHL-UNDIRECTED-LINK-P", 1, 0, false);
        new $sbhl_undirected_link_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_undirected_link_links", "SBHL-UNDIRECTED-LINK-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "_csetf_sbhl_undirected_link_links", "_CSETF-SBHL-UNDIRECTED-LINK-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "make_sbhl_undirected_link", "MAKE-SBHL-UNDIRECTED-LINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "visit_defstruct_sbhl_undirected_link", "VISIT-DEFSTRUCT-SBHL-UNDIRECTED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "visit_defstruct_object_sbhl_undirected_link_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "print_link", "PRINT-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "create_sbhl_directed_link", "CREATE-SBHL-DIRECTED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "create_sbhl_undirected_link", "CREATE-SBHL-UNDIRECTED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "create_sbhl_direction_link", "CREATE-SBHL-DIRECTION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_direction_link_p", "SBHL-DIRECTION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "any_sbhl_links_p", "ANY-SBHL-LINKS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "any_sbhl_predicate_links_p", "ANY-SBHL-PREDICATE-LINKS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_directed_mt_links", "GET-SBHL-DIRECTED-MT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_undirected_mt_links", "GET-SBHL-UNDIRECTED-MT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_mt_links", "GET-SBHL-MT-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "set_sbhl_directed_link", "SET-SBHL-DIRECTED-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "set_sbhl_undirected_link", "SET-SBHL-UNDIRECTED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "set_sbhl_direction_link", "SET-SBHL-DIRECTION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "remove_sbhl_direction_link", "REMOVE-SBHL-DIRECTION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "create_sbhl_mt_links", "CREATE-SBHL-MT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_mt_links_object_p", "SBHL-MT-LINKS-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_wf_mt_links_p", "SBHL-WF-MT-LINKS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_graph_mt_links", "GET-SBHL-GRAPH-MT-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_graph_link_mts", "GET-SBHL-GRAPH-LINK-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_tv_links", "GET-SBHL-TV-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "set_sbhl_mt_links", "SET-SBHL-MT-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "remove_sbhl_mt_link_from_graph", "REMOVE-SBHL-MT-LINK-FROM-GRAPH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "remove_sbhl_mt_link_from_relevant_directions", "REMOVE-SBHL-MT-LINK-FROM-RELEVANT-DIRECTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "remove_sbhl_mt_link", "REMOVE-SBHL-MT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "create_sbhl_tv_links", "CREATE-SBHL-TV-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_tv_links_object_p", "SBHL-TV-LINKS-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "sbhl_wf_tv_links_p", "SBHL-WF-TV-LINKS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_graph_tv_links", "GET-SBHL-GRAPH-TV-LINKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "get_sbhl_link_nodes", "GET-SBHL-LINK-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "member_of_tv_linksP", "MEMBER-OF-TV-LINKS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "any_sbhl_true_link_nodes_p", "ANY-SBHL-TRUE-LINK-NODES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "set_sbhl_tv_links", "SET-SBHL-TV-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "push_onto_sbhl_tv_links", "PUSH-ONTO-SBHL-TV-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "tv_links_to_set_from_list", "TV-LINKS-TO-SET-FROM-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "remove_sbhl_tv_link_node", "REMOVE-SBHL-TV-LINK-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_links", "remove_sbhl_tv_link", "REMOVE-SBHL-TV-LINK", 2, 0, false);
        return (SubLObject)sbhl_links.NIL;
    }
    
    public static SubLObject init_sbhl_links_file() {
        sbhl_links.$dtp_sbhl_directed_link$ = SubLFiles.defconstant("*DTP-SBHL-DIRECTED-LINK*", (SubLObject)sbhl_links.$sym0$SBHL_DIRECTED_LINK);
        sbhl_links.$dtp_sbhl_undirected_link$ = SubLFiles.defconstant("*DTP-SBHL-UNDIRECTED-LINK*", (SubLObject)sbhl_links.$sym22$SBHL_UNDIRECTED_LINK);
        return (SubLObject)sbhl_links.NIL;
    }
    
    public static SubLObject setup_sbhl_links_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_links.$sym8$SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sbhl_links.$list9);
        Structures.def_csetf((SubLObject)sbhl_links.$sym10$SBHL_DIRECTED_LINK_PREDICATE_LINKS, (SubLObject)sbhl_links.$sym11$_CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS);
        Structures.def_csetf((SubLObject)sbhl_links.$sym12$SBHL_DIRECTED_LINK_INVERSE_LINKS, (SubLObject)sbhl_links.$sym13$_CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS);
        Equality.identity((SubLObject)sbhl_links.$sym0$SBHL_DIRECTED_LINK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_links.$sym21$VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_links.$sym29$SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sbhl_links.$list30);
        Structures.def_csetf((SubLObject)sbhl_links.$sym31$SBHL_UNDIRECTED_LINK_LINKS, (SubLObject)sbhl_links.$sym32$_CSETF_SBHL_UNDIRECTED_LINK_LINKS);
        Equality.identity((SubLObject)sbhl_links.$sym22$SBHL_UNDIRECTED_LINK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_links.$sym35$VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD));
        return (SubLObject)sbhl_links.NIL;
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
        me = (SubLFile)new sbhl_links();
        sbhl_links.$dtp_sbhl_directed_link$ = null;
        sbhl_links.$dtp_sbhl_undirected_link$ = null;
        $sym0$SBHL_DIRECTED_LINK = SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK");
        $sym1$SBHL_DIRECTED_LINK_P = SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-P");
        $int2$220 = SubLObjectFactory.makeInteger(220);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-LINKS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-LINKS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS"));
        $sym7$PRINT_LINK = SubLObjectFactory.makeSymbol("PRINT-LINK");
        $sym8$SBHL_DIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-P"));
        $sym10$SBHL_DIRECTED_LINK_PREDICATE_LINKS = SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-PREDICATE-LINKS");
        $sym11$_CSETF_SBHL_DIRECTED_LINK_PREDICATE_LINKS = SubLObjectFactory.makeSymbol("_CSETF-SBHL-DIRECTED-LINK-PREDICATE-LINKS");
        $sym12$SBHL_DIRECTED_LINK_INVERSE_LINKS = SubLObjectFactory.makeSymbol("SBHL-DIRECTED-LINK-INVERSE-LINKS");
        $sym13$_CSETF_SBHL_DIRECTED_LINK_INVERSE_LINKS = SubLObjectFactory.makeSymbol("_CSETF-SBHL-DIRECTED-LINK-INVERSE-LINKS");
        $kw14$PREDICATE_LINKS = SubLObjectFactory.makeKeyword("PREDICATE-LINKS");
        $kw15$INVERSE_LINKS = SubLObjectFactory.makeKeyword("INVERSE-LINKS");
        $str16$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw17$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym18$MAKE_SBHL_DIRECTED_LINK = SubLObjectFactory.makeSymbol("MAKE-SBHL-DIRECTED-LINK");
        $kw19$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw20$END = SubLObjectFactory.makeKeyword("END");
        $sym21$VISIT_DEFSTRUCT_OBJECT_SBHL_DIRECTED_LINK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-DIRECTED-LINK-METHOD");
        $sym22$SBHL_UNDIRECTED_LINK = SubLObjectFactory.makeSymbol("SBHL-UNDIRECTED-LINK");
        $sym23$SBHL_UNDIRECTED_LINK_P = SubLObjectFactory.makeSymbol("SBHL-UNDIRECTED-LINK-P");
        $int24$221 = SubLObjectFactory.makeInteger(221);
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKS"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINKS"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-UNDIRECTED-LINK-LINKS"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS"));
        $sym29$SBHL_UNDIRECTED_LINK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SBHL-UNDIRECTED-LINK-PRINT-FUNCTION-TRAMPOLINE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-UNDIRECTED-LINK-P"));
        $sym31$SBHL_UNDIRECTED_LINK_LINKS = SubLObjectFactory.makeSymbol("SBHL-UNDIRECTED-LINK-LINKS");
        $sym32$_CSETF_SBHL_UNDIRECTED_LINK_LINKS = SubLObjectFactory.makeSymbol("_CSETF-SBHL-UNDIRECTED-LINK-LINKS");
        $kw33$LINKS = SubLObjectFactory.makeKeyword("LINKS");
        $sym34$MAKE_SBHL_UNDIRECTED_LINK = SubLObjectFactory.makeSymbol("MAKE-SBHL-UNDIRECTED-LINK");
        $sym35$VISIT_DEFSTRUCT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD");
        $sym36$SBHL_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-MODULE-P");
        $kw37$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str38$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym39$SBHL_PREDICATE_P = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-P");
        $kw40$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str41$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw42$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str43$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $sym44$SBHL_DIRECTED_DIRECTION_P = SubLObjectFactory.makeSymbol("SBHL-DIRECTED-DIRECTION-P");
        $sym45$SBHL_MT_LINKS_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-MT-LINKS-OBJECT-P");
        $sym46$SBHL_TV_LINKS_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-TV-LINKS-OBJECT-P");
        $sym47$SBHL_MT_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-MT-OBJECT-P");
        $sym48$SBHL_LINK_TRUTH_VALUE_P = SubLObjectFactory.makeSymbol("SBHL-LINK-TRUTH-VALUE-P");
        $sym49$SBHL_NODE_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-NODE-OBJECT-P");
        $str50$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $sym51$SBHL_LINK_NODES_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-LINK-NODES-OBJECT-P");
    }
    
    public static final class $sbhl_directed_link_native extends SubLStructNative
    {
        public SubLObject $predicate_links;
        public SubLObject $inverse_links;
        private static final SubLStructDeclNative structDecl;
        
        public $sbhl_directed_link_native() {
            this.$predicate_links = (SubLObject)CommonSymbols.NIL;
            this.$inverse_links = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sbhl_directed_link_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sbhl_directed_link_native.class, sbhl_links.$sym0$SBHL_DIRECTED_LINK, sbhl_links.$sym1$SBHL_DIRECTED_LINK_P, sbhl_links.$list3, sbhl_links.$list4, new String[] { "$predicate_links", "$inverse_links" }, sbhl_links.$list5, sbhl_links.$list6, sbhl_links.$sym7$PRINT_LINK);
        }
    }
    
    public static final class $sbhl_directed_link_p$UnaryFunction extends UnaryFunction
    {
        public $sbhl_directed_link_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-DIRECTED-LINK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_links.sbhl_directed_link_p(arg1);
        }
    }
    
    public static final class $sbhl_undirected_link_native extends SubLStructNative
    {
        public SubLObject $links;
        private static final SubLStructDeclNative structDecl;
        
        public $sbhl_undirected_link_native() {
            this.$links = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sbhl_undirected_link_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sbhl_undirected_link_native.class, sbhl_links.$sym22$SBHL_UNDIRECTED_LINK, sbhl_links.$sym23$SBHL_UNDIRECTED_LINK_P, sbhl_links.$list25, sbhl_links.$list26, new String[] { "$links" }, sbhl_links.$list27, sbhl_links.$list28, sbhl_links.$sym7$PRINT_LINK);
        }
    }
    
    public static final class $sbhl_undirected_link_p$UnaryFunction extends UnaryFunction
    {
        public $sbhl_undirected_link_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-UNDIRECTED-LINK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_links.sbhl_undirected_link_p(arg1);
        }
    }
}

/*

	Total time: 288 ms
	
*/