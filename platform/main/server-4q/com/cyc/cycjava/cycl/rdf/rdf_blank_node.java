package com.cyc.cycjava.cycl.rdf;


import com.cyc.cycjava.cycl.rdf.rdf_blank_node;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.rdf.rdf_blank_node.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rdf_blank_node extends SubLTranslatedFile {
    public static final SubLFile me = new rdf_blank_node();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_blank_node";

    public static final String myFingerPrint = "ac79f8de866576acdfc47139c8ce6a599084080c5b2be45ef0c7ccc10232937f";

    // defconstant
    public static final SubLSymbol $dtp_rdf_blank_node$ = makeSymbol("*DTP-RDF-BLANK-NODE*");

    // Internal Constants
    public static final SubLSymbol RDF_BLANK_NODE = makeSymbol("RDF-BLANK-NODE");

    public static final SubLSymbol RDF_BLANK_NODE_P = makeSymbol("RDF-BLANK-NODE-P");

    public static final SubLList $list2 = list(makeSymbol("ID"));

    public static final SubLList $list3 = list(makeKeyword("ID"));

    public static final SubLList $list4 = list(makeSymbol("RDF-BNODE-ID"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RDF-BNODE-ID"));

    public static final SubLSymbol PRINT_RDF_BLANK_NODE = makeSymbol("PRINT-RDF-BLANK-NODE");

    public static final SubLSymbol RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RDF-BLANK-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-BLANK-NODE-P"));

    private static final SubLSymbol RDF_BNODE_ID = makeSymbol("RDF-BNODE-ID");

    private static final SubLSymbol _CSETF_RDF_BNODE_ID = makeSymbol("_CSETF-RDF-BNODE-ID");



    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RDF_BLANK_NODE = makeSymbol("MAKE-RDF-BLANK-NODE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-BLANK-NODE-METHOD");

    private static final SubLString $str18$_RDF_BLANK_NODE__S_ = makeString("<RDF-BLANK-NODE ~S>");

    private static final SubLSymbol SXHASH_RDF_BLANK_NODE_METHOD = makeSymbol("SXHASH-RDF-BLANK-NODE-METHOD");

    public static SubLObject rdf_blank_node_equal_p(final SubLObject node1, final SubLObject node2) {
        return equal(rdf_blank_node_id(node1), rdf_blank_node_id(node2));
    }

    public static SubLObject rdf_blank_node_L(final SubLObject node1, final SubLObject node2) {
        final SubLObject id1 = rdf_blank_node_id(node1);
        final SubLObject id2 = rdf_blank_node_id(node2);
        return id1.isString() && id2.isString() ? Strings.stringL(id1, id2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : id1.isNumber() && id2.isNumber() ? numL(id1, id2) : Strings.stringL(princ_to_string(id1), princ_to_string(id2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_blank_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rdf_blank_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_blank_node_p(final SubLObject v_object) {
        return v_object.getClass() == rdf_blank_node.$rdf_blank_node_native.class ? T : NIL;
    }

    public static SubLObject rdf_bnode_id(final SubLObject v_object) {
        assert NIL != rdf_blank_node_p(v_object) : "rdf_blank_node.rdf_blank_node_p(v_object) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_rdf_bnode_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_blank_node_p(v_object) : "rdf_blank_node.rdf_blank_node_p(v_object) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_rdf_blank_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new rdf_blank_node.$rdf_blank_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_rdf_bnode_id(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_blank_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RDF_BLANK_NODE, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, rdf_bnode_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_RDF_BLANK_NODE, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_blank_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rdf_blank_node(obj, visitor_fn);
    }

    public static SubLObject print_rdf_blank_node(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str18$_RDF_BLANK_NODE__S_, rdf_bnode_id(v_object));
        return v_object;
    }

    public static SubLObject new_rdf_blank_node(final SubLObject id) {
        final SubLObject bnode = make_rdf_blank_node(UNPROVIDED);
        _csetf_rdf_bnode_id(bnode, id);
        return bnode;
    }

    public static SubLObject rdf_blank_node_id_string(final SubLObject bnode) {
        assert NIL != rdf_blank_node_p(bnode) : "rdf_blank_node.rdf_blank_node_p(bnode) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(bnode) " + bnode;
        return princ_to_string(rdf_bnode_id(bnode));
    }

    public static SubLObject rdf_blank_node_id(final SubLObject bnode) {
        assert NIL != rdf_blank_node_p(bnode) : "rdf_blank_node.rdf_blank_node_p(bnode) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(bnode) " + bnode;
        return rdf_bnode_id(bnode);
    }

    public static SubLObject sxhash_rdf_blank_node_method(final SubLObject v_object) {
        return sxhash_rdf_blank_node(v_object);
    }

    public static SubLObject sxhash_rdf_blank_node(final SubLObject bnode) {
        return Sxhash.sxhash(rdf_bnode_id(bnode));
    }

    public static SubLObject declare_rdf_blank_node_file() {
        declareFunction(me, "rdf_blank_node_equal_p", "RDF-BLANK-NODE-EQUAL-P", 2, 0, false);
        declareFunction(me, "rdf_blank_node_L", "RDF-BLANK-NODE-<", 2, 0, false);
        declareFunction(me, "rdf_blank_node_print_function_trampoline", "RDF-BLANK-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rdf_blank_node_p", "RDF-BLANK-NODE-P", 1, 0, false);
        new rdf_blank_node.$rdf_blank_node_p$UnaryFunction();
        declareFunction(me, "rdf_bnode_id", "RDF-BNODE-ID", 1, 0, false);
        declareFunction(me, "_csetf_rdf_bnode_id", "_CSETF-RDF-BNODE-ID", 2, 0, false);
        declareFunction(me, "make_rdf_blank_node", "MAKE-RDF-BLANK-NODE", 0, 1, false);
        declareFunction(me, "visit_defstruct_rdf_blank_node", "VISIT-DEFSTRUCT-RDF-BLANK-NODE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rdf_blank_node_method", "VISIT-DEFSTRUCT-OBJECT-RDF-BLANK-NODE-METHOD", 2, 0, false);
        declareFunction(me, "print_rdf_blank_node", "PRINT-RDF-BLANK-NODE", 3, 0, false);
        declareFunction(me, "new_rdf_blank_node", "NEW-RDF-BLANK-NODE", 1, 0, false);
        declareFunction(me, "rdf_blank_node_id_string", "RDF-BLANK-NODE-ID-STRING", 1, 0, false);
        declareFunction(me, "rdf_blank_node_id", "RDF-BLANK-NODE-ID", 1, 0, false);
        declareFunction(me, "sxhash_rdf_blank_node_method", "SXHASH-RDF-BLANK-NODE-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_rdf_blank_node", "SXHASH-RDF-BLANK-NODE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_blank_node_file() {
        defconstant("*DTP-RDF-BLANK-NODE*", RDF_BLANK_NODE);
        return NIL;
    }

    public static SubLObject setup_rdf_blank_node_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rdf_blank_node$.getGlobalValue(), symbol_function(RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RDF_BNODE_ID, _CSETF_RDF_BNODE_ID);
        identity(RDF_BLANK_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_blank_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD));
        note_funcall_helper_function(PRINT_RDF_BLANK_NODE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_blank_node$.getGlobalValue(), symbol_function(SXHASH_RDF_BLANK_NODE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_blank_node_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_blank_node_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rdf_blank_node_file();
    }

    static {






















    }

    public static final class $rdf_blank_node_native extends SubLStructNative {
        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        public $rdf_blank_node_native() {
            this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        static {
            structDecl = makeStructDeclNative(rdf_blank_node.$rdf_blank_node_native.class, RDF_BLANK_NODE, RDF_BLANK_NODE_P, $list2, $list3, new String[]{ "$id" }, $list4, $list5, PRINT_RDF_BLANK_NODE);
        }
    }

    public static final class $rdf_blank_node_p$UnaryFunction extends UnaryFunction {
        public $rdf_blank_node_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-BLANK-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_blank_node_p(arg1);
        }
    }
}

/**
 * Total time: 100 ms
 */
