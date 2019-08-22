/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RDF-BLANK-NODE
 * source file: /cyc/top/cycl/rdf/rdf-blank-node.lisp
 * created:     2019/07/03 17:38:13
 */
public final class rdf_blank_node extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rdf_blank_node();

 public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_blank_node";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rdf_blank_node$ = makeSymbol("*DTP-RDF-BLANK-NODE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RDF_BLANK_NODE = makeSymbol("RDF-BLANK-NODE");

    private static final SubLSymbol RDF_BLANK_NODE_P = makeSymbol("RDF-BLANK-NODE-P");

    static private final SubLList $list2 = list(makeSymbol("ID"));

    static private final SubLList $list3 = list(makeKeyword("ID"));

    static private final SubLList $list4 = list(makeSymbol("RDF-BNODE-ID"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-RDF-BNODE-ID"));

    private static final SubLSymbol PRINT_RDF_BLANK_NODE = makeSymbol("PRINT-RDF-BLANK-NODE");

    private static final SubLSymbol RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RDF-BLANK-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-BLANK-NODE-P"));

    private static final SubLSymbol RDF_BNODE_ID = makeSymbol("RDF-BNODE-ID");

    private static final SubLSymbol _CSETF_RDF_BNODE_ID = makeSymbol("_CSETF-RDF-BNODE-ID");

    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RDF_BLANK_NODE = makeSymbol("MAKE-RDF-BLANK-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-BLANK-NODE-METHOD");

    private static final SubLString $str18$_RDF_BLANK_NODE__S_ = makeString("<RDF-BLANK-NODE ~S>");

    private static final SubLSymbol SXHASH_RDF_BLANK_NODE_METHOD = makeSymbol("SXHASH-RDF-BLANK-NODE-METHOD");

    // Definitions
    public static final SubLObject rdf_blank_node_equal_p_alt(SubLObject node1, SubLObject node2) {
        return equal(com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_blank_node_id(node1), com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_blank_node_id(node2));
    }

    // Definitions
    public static SubLObject rdf_blank_node_equal_p(final SubLObject node1, final SubLObject node2) {
        return equal(rdf_blank_node.rdf_blank_node_id(node1), rdf_blank_node.rdf_blank_node_id(node2));
    }

    public static final SubLObject rdf_blank_node_L_alt(SubLObject node1, SubLObject node2) {
        {
            SubLObject id1 = com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_blank_node_id(node1);
            SubLObject id2 = com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_blank_node_id(node2);
            return id1.isString() && id2.isString() ? ((SubLObject) (Strings.stringL(id1, id2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : id1.isNumber() && id2.isNumber() ? ((SubLObject) (numL(id1, id2))) : Strings.stringL(princ_to_string(id1), princ_to_string(id2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rdf_blank_node_L(final SubLObject node1, final SubLObject node2) {
        final SubLObject id1 = rdf_blank_node.rdf_blank_node_id(node1);
        final SubLObject id2 = rdf_blank_node.rdf_blank_node_id(node2);
        return id1.isString() && id2.isString() ? Strings.stringL(id1, id2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : id1.isNumber() && id2.isNumber() ? numL(id1, id2) : Strings.stringL(princ_to_string(id1), princ_to_string(id2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_blank_node_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rdf.rdf_blank_node.print_rdf_blank_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_blank_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rdf_blank_node.print_rdf_blank_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rdf_blank_node_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_blank_node.$rdf_blank_node_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rdf_blank_node_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_blank_node.$rdf_blank_node_native.class ? T : NIL;
    }

    public static final SubLObject rdf_bnode_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RDF_BLANK_NODE_P);
        return v_object.getField2();
    }

    public static SubLObject rdf_bnode_id(final SubLObject v_object) {
        assert NIL != rdf_blank_node.rdf_blank_node_p(v_object) : "! rdf_blank_node.rdf_blank_node_p(v_object) " + "rdf_blank_node.rdf_blank_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_rdf_bnode_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_BLANK_NODE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdf_bnode_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_blank_node.rdf_blank_node_p(v_object) : "! rdf_blank_node.rdf_blank_node_p(v_object) " + "rdf_blank_node.rdf_blank_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_rdf_blank_node_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_blank_node.$rdf_blank_node_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        com.cyc.cycjava.cycl.rdf.rdf_blank_node._csetf_rdf_bnode_id(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rdf_blank_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_blank_node.$rdf_blank_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                rdf_blank_node._csetf_rdf_bnode_id(v_new, current_value);
            } else {
                Errors.error(rdf_blank_node.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_blank_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rdf_blank_node.MAKE_RDF_BLANK_NODE, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, rdf_blank_node.rdf_bnode_id(obj));
        funcall(visitor_fn, obj, $END, rdf_blank_node.MAKE_RDF_BLANK_NODE, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_blank_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rdf_blank_node.visit_defstruct_rdf_blank_node(obj, visitor_fn);
    }

    public static final SubLObject print_rdf_blank_node_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt12$_RDF_BLANK_NODE__S_, com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_bnode_id(v_object));
        return v_object;
    }

    public static SubLObject print_rdf_blank_node(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, rdf_blank_node.$str18$_RDF_BLANK_NODE__S_, rdf_blank_node.rdf_bnode_id(v_object));
        return v_object;
    }

    public static final SubLObject new_rdf_blank_node_alt(SubLObject id) {
        {
            SubLObject bnode = com.cyc.cycjava.cycl.rdf.rdf_blank_node.make_rdf_blank_node(UNPROVIDED);
            com.cyc.cycjava.cycl.rdf.rdf_blank_node._csetf_rdf_bnode_id(bnode, id);
            return bnode;
        }
    }

    public static SubLObject new_rdf_blank_node(final SubLObject id) {
        final SubLObject bnode = rdf_blank_node.make_rdf_blank_node(UNPROVIDED);
        rdf_blank_node._csetf_rdf_bnode_id(bnode, id);
        return bnode;
    }

    public static final SubLObject rdf_blank_node_id_string_alt(SubLObject bnode) {
        SubLTrampolineFile.checkType(bnode, RDF_BLANK_NODE_P);
        return princ_to_string(com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_bnode_id(bnode));
    }

    public static SubLObject rdf_blank_node_id_string(final SubLObject bnode) {
        assert NIL != rdf_blank_node.rdf_blank_node_p(bnode) : "! rdf_blank_node.rdf_blank_node_p(bnode) " + ("rdf_blank_node.rdf_blank_node_p(bnode) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(bnode) ") + bnode;
        return princ_to_string(rdf_blank_node.rdf_bnode_id(bnode));
    }

    public static final SubLObject rdf_blank_node_id_alt(SubLObject bnode) {
        SubLTrampolineFile.checkType(bnode, RDF_BLANK_NODE_P);
        return com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_bnode_id(bnode);
    }

    public static SubLObject rdf_blank_node_id(final SubLObject bnode) {
        assert NIL != rdf_blank_node.rdf_blank_node_p(bnode) : "! rdf_blank_node.rdf_blank_node_p(bnode) " + ("rdf_blank_node.rdf_blank_node_p(bnode) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(bnode) ") + bnode;
        return rdf_blank_node.rdf_bnode_id(bnode);
    }

    public static final SubLObject sxhash_rdf_blank_node_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.rdf.rdf_blank_node.sxhash_rdf_blank_node(v_object);
    }

    public static SubLObject sxhash_rdf_blank_node_method(final SubLObject v_object) {
        return rdf_blank_node.sxhash_rdf_blank_node(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_rdf_blank_node_alt(SubLObject bnode) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.rdf.rdf_blank_node.rdf_bnode_id(bnode));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_rdf_blank_node(final SubLObject bnode) {
        return Sxhash.sxhash(rdf_blank_node.rdf_bnode_id(bnode));
    }

    public static SubLObject declare_rdf_blank_node_file() {
        declareFunction("rdf_blank_node_equal_p", "RDF-BLANK-NODE-EQUAL-P", 2, 0, false);
        declareFunction("rdf_blank_node_L", "RDF-BLANK-NODE-<", 2, 0, false);
        declareFunction("rdf_blank_node_print_function_trampoline", "RDF-BLANK-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rdf_blank_node_p", "RDF-BLANK-NODE-P", 1, 0, false);
        new rdf_blank_node.$rdf_blank_node_p$UnaryFunction();
        declareFunction("rdf_bnode_id", "RDF-BNODE-ID", 1, 0, false);
        declareFunction("_csetf_rdf_bnode_id", "_CSETF-RDF-BNODE-ID", 2, 0, false);
        declareFunction("make_rdf_blank_node", "MAKE-RDF-BLANK-NODE", 0, 1, false);
        declareFunction("visit_defstruct_rdf_blank_node", "VISIT-DEFSTRUCT-RDF-BLANK-NODE", 2, 0, false);
        declareFunction("visit_defstruct_object_rdf_blank_node_method", "VISIT-DEFSTRUCT-OBJECT-RDF-BLANK-NODE-METHOD", 2, 0, false);
        declareFunction("print_rdf_blank_node", "PRINT-RDF-BLANK-NODE", 3, 0, false);
        declareFunction("new_rdf_blank_node", "NEW-RDF-BLANK-NODE", 1, 0, false);
        declareFunction("rdf_blank_node_id_string", "RDF-BLANK-NODE-ID-STRING", 1, 0, false);
        declareFunction("rdf_blank_node_id", "RDF-BLANK-NODE-ID", 1, 0, false);
        declareFunction("sxhash_rdf_blank_node_method", "SXHASH-RDF-BLANK-NODE-METHOD", 1, 0, false);
        declareFunction("sxhash_rdf_blank_node", "SXHASH-RDF-BLANK-NODE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_blank_node_file() {
        defconstant("*DTP-RDF-BLANK-NODE*", rdf_blank_node.RDF_BLANK_NODE);
        return NIL;
    }

    public static SubLObject setup_rdf_blank_node_file() {
        register_method($print_object_method_table$.getGlobalValue(), rdf_blank_node.$dtp_rdf_blank_node$.getGlobalValue(), symbol_function(rdf_blank_node.RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rdf_blank_node.$list8);
        def_csetf(rdf_blank_node.RDF_BNODE_ID, rdf_blank_node._CSETF_RDF_BNODE_ID);
        identity(rdf_blank_node.RDF_BLANK_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_blank_node.$dtp_rdf_blank_node$.getGlobalValue(), symbol_function(rdf_blank_node.VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD));
        note_funcall_helper_function(rdf_blank_node.PRINT_RDF_BLANK_NODE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_blank_node.$dtp_rdf_blank_node$.getGlobalValue(), symbol_function(rdf_blank_node.SXHASH_RDF_BLANK_NODE_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("ID"));

    static private final SubLList $list_alt3 = list(makeKeyword("ID"));

    static private final SubLList $list_alt4 = list(makeSymbol("RDF-BNODE-ID"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-RDF-BNODE-ID"));

    static private final SubLString $str_alt11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void declareFunctions() {
        rdf_blank_node.declare_rdf_blank_node_file();
    }

    static private final SubLString $str_alt12$_RDF_BLANK_NODE__S_ = makeString("<RDF-BLANK-NODE ~S>");

    @Override
    public void initializeVariables() {
        rdf_blank_node.init_rdf_blank_node_file();
    }

    @Override
    public void runTopLevelForms() {
        rdf_blank_node.setup_rdf_blank_node_file();
    }

    

    public static final class $rdf_blank_node_native extends SubLStructNative {
        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        public $rdf_blank_node_native() {
            rdf_blank_node.$rdf_blank_node_native.this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rdf_blank_node.$rdf_blank_node_native.this.$id;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rdf_blank_node.$rdf_blank_node_native.this.$id = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rdf.rdf_blank_node.$rdf_blank_node_native.class, rdf_blank_node.RDF_BLANK_NODE, rdf_blank_node.RDF_BLANK_NODE_P, rdf_blank_node.$list2, rdf_blank_node.$list3, new String[]{ "$id" }, rdf_blank_node.$list4, rdf_blank_node.$list5, rdf_blank_node.PRINT_RDF_BLANK_NODE);
        }
    }

    public static final class $rdf_blank_node_p$UnaryFunction extends UnaryFunction {
        public $rdf_blank_node_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-BLANK-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_blank_node.rdf_blank_node_p(arg1);
        }
    }
}

/**
 * Total time: 100 ms
 */
