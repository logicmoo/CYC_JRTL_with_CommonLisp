/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.literals_variables;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CZER-GRAPH
 * source file: /cyc/top/cycl/czer-graph.lisp
 * created:     2019/07/03 17:37:30
 */
public final class czer_graph extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $v_colour_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_constant_list;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_nat_list;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_assertion_list;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$list_structure;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_var_positions;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_constant_list = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_nat_list = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_assertion_list = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$list_structure = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.czer_graph.$v_colour_native.this.$sorted_var_positions = value;
        }

        public SubLObject $sorted_constant_list = Lisp.NIL;

        public SubLObject $sorted_nat_list = Lisp.NIL;

        public SubLObject $sorted_assertion_list = Lisp.NIL;

        public SubLObject $list_structure = Lisp.NIL;

        public SubLObject $sorted_var_positions = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.czer_graph.$v_colour_native.class, V_COLOUR, V_COLOUR_P, $list_alt2, $list_alt3, new String[]{ "$sorted_constant_list", "$sorted_nat_list", "$sorted_assertion_list", "$list_structure", "$sorted_var_positions" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new czer_graph();

 public static final String myName = "com.cyc.cycjava.cycl.czer_graph";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_v_colour$ = makeSymbol("*DTP-V-COLOUR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_arc$ = makeSymbol("*DTP-ARC*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_vertex$ = makeSymbol("*DTP-VERTEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_graph_search_node$ = makeSymbol("*DTP-GRAPH-SEARCH-NODE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol V_COLOUR = makeSymbol("V-COLOUR");

    private static final SubLSymbol V_COLOUR_P = makeSymbol("V-COLOUR-P");

    static private final SubLList $list2 = list(makeSymbol("SORTED-CONSTANT-LIST"), makeSymbol("SORTED-NAT-LIST"), makeSymbol("SORTED-ASSERTION-LIST"), makeSymbol("LIST-STRUCTURE"), makeSymbol("SORTED-VAR-POSITIONS"));

    static private final SubLList $list3 = list(makeKeyword("SORTED-CONSTANT-LIST"), makeKeyword("SORTED-NAT-LIST"), makeKeyword("SORTED-ASSERTION-LIST"), makeKeyword("LIST-STRUCTURE"), makeKeyword("SORTED-VAR-POSITIONS"));

    static private final SubLList $list4 = list(makeSymbol("V-COLOUR-SORTED-CONSTANT-LIST"), makeSymbol("V-COLOUR-SORTED-NAT-LIST"), makeSymbol("V-COLOUR-SORTED-ASSERTION-LIST"), makeSymbol("V-COLOUR-LIST-STRUCTURE"), makeSymbol("V-COLOUR-SORTED-VAR-POSITIONS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-V-COLOUR-SORTED-CONSTANT-LIST"), makeSymbol("_CSETF-V-COLOUR-SORTED-NAT-LIST"), makeSymbol("_CSETF-V-COLOUR-SORTED-ASSERTION-LIST"), makeSymbol("_CSETF-V-COLOUR-LIST-STRUCTURE"), makeSymbol("_CSETF-V-COLOUR-SORTED-VAR-POSITIONS"));

    private static final SubLSymbol V_COLOUR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("V-COLOUR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("V-COLOUR-P"));

    private static final SubLSymbol V_COLOUR_SORTED_CONSTANT_LIST = makeSymbol("V-COLOUR-SORTED-CONSTANT-LIST");

    private static final SubLSymbol _CSETF_V_COLOUR_SORTED_CONSTANT_LIST = makeSymbol("_CSETF-V-COLOUR-SORTED-CONSTANT-LIST");

    private static final SubLSymbol V_COLOUR_SORTED_NAT_LIST = makeSymbol("V-COLOUR-SORTED-NAT-LIST");

    private static final SubLSymbol _CSETF_V_COLOUR_SORTED_NAT_LIST = makeSymbol("_CSETF-V-COLOUR-SORTED-NAT-LIST");

    private static final SubLSymbol V_COLOUR_SORTED_ASSERTION_LIST = makeSymbol("V-COLOUR-SORTED-ASSERTION-LIST");

    private static final SubLSymbol _CSETF_V_COLOUR_SORTED_ASSERTION_LIST = makeSymbol("_CSETF-V-COLOUR-SORTED-ASSERTION-LIST");

    private static final SubLSymbol V_COLOUR_LIST_STRUCTURE = makeSymbol("V-COLOUR-LIST-STRUCTURE");

    private static final SubLSymbol _CSETF_V_COLOUR_LIST_STRUCTURE = makeSymbol("_CSETF-V-COLOUR-LIST-STRUCTURE");

    private static final SubLSymbol V_COLOUR_SORTED_VAR_POSITIONS = makeSymbol("V-COLOUR-SORTED-VAR-POSITIONS");

    private static final SubLSymbol _CSETF_V_COLOUR_SORTED_VAR_POSITIONS = makeSymbol("_CSETF-V-COLOUR-SORTED-VAR-POSITIONS");

    private static final SubLSymbol $SORTED_CONSTANT_LIST = makeKeyword("SORTED-CONSTANT-LIST");

    private static final SubLSymbol $SORTED_NAT_LIST = makeKeyword("SORTED-NAT-LIST");

    private static final SubLSymbol $SORTED_ASSERTION_LIST = makeKeyword("SORTED-ASSERTION-LIST");

    private static final SubLSymbol $SORTED_VAR_POSITIONS = makeKeyword("SORTED-VAR-POSITIONS");

    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_V_COLOUR = makeSymbol("MAKE-V-COLOUR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_V_COLOUR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-V-COLOUR-METHOD");

    private static final SubLSymbol V_COLOUR_AS_LIST = makeSymbol("V-COLOUR-AS-LIST");

    private static final SubLSymbol ARC = makeSymbol("ARC");

    private static final SubLSymbol ARC_P = makeSymbol("ARC-P");

    private static final SubLList $list33 = list(makeSymbol("HEAD"), makeSymbol("COLOUR"));

    private static final SubLList $list34 = list($HEAD, makeKeyword("COLOUR"));

    private static final SubLList $list35 = list(makeSymbol("ARC-HEAD"), makeSymbol("ARC-COLOUR"));

    private static final SubLList $list36 = list(makeSymbol("_CSETF-ARC-HEAD"), makeSymbol("_CSETF-ARC-COLOUR"));

    private static final SubLSymbol PRINT_ARC = makeSymbol("PRINT-ARC");

    private static final SubLSymbol ARC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list39 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ARC-P"));

    private static final SubLSymbol ARC_HEAD = makeSymbol("ARC-HEAD");

    private static final SubLSymbol _CSETF_ARC_HEAD = makeSymbol("_CSETF-ARC-HEAD");

    private static final SubLSymbol ARC_COLOUR = makeSymbol("ARC-COLOUR");

    private static final SubLSymbol _CSETF_ARC_COLOUR = makeSymbol("_CSETF-ARC-COLOUR");

    private static final SubLSymbol MAKE_ARC = makeSymbol("MAKE-ARC");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ARC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ARC-METHOD");

    private static final SubLString $str48$__ARC__a_ = makeString("#<ARC:~a>");

    private static final SubLSymbol VERTEX = makeSymbol("VERTEX");

    private static final SubLSymbol VERTEX_P = makeSymbol("VERTEX-P");

    private static final SubLList $list52 = list(makeSymbol("ID"), makeSymbol("COLOUR"), makeSymbol("ARC-SET"));

    private static final SubLList $list53 = list(makeKeyword("ID"), makeKeyword("COLOUR"), makeKeyword("ARC-SET"));

    private static final SubLList $list54 = list(makeSymbol("VERTEX-ID"), makeSymbol("VERTEX-COLOUR"), makeSymbol("VERTEX-ARC-SET"));

    private static final SubLList $list55 = list(makeSymbol("_CSETF-VERTEX-ID"), makeSymbol("_CSETF-VERTEX-COLOUR"), makeSymbol("_CSETF-VERTEX-ARC-SET"));

    private static final SubLSymbol PRINT_VERTEX = makeSymbol("PRINT-VERTEX");

    private static final SubLSymbol VERTEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VERTEX-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list58 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("VERTEX-P"));

    private static final SubLSymbol VERTEX_ID = makeSymbol("VERTEX-ID");

    private static final SubLSymbol _CSETF_VERTEX_ID = makeSymbol("_CSETF-VERTEX-ID");

    private static final SubLSymbol VERTEX_COLOUR = makeSymbol("VERTEX-COLOUR");

    private static final SubLSymbol _CSETF_VERTEX_COLOUR = makeSymbol("_CSETF-VERTEX-COLOUR");

    private static final SubLSymbol VERTEX_ARC_SET = makeSymbol("VERTEX-ARC-SET");

    private static final SubLSymbol _CSETF_VERTEX_ARC_SET = makeSymbol("_CSETF-VERTEX-ARC-SET");

    private static final SubLSymbol MAKE_VERTEX = makeSymbol("MAKE-VERTEX");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VERTEX_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VERTEX-METHOD");

    private static final SubLString $str69$__VERTEX__a_ = makeString("#<VERTEX:~a>");

    private static final SubLString $str70$vertex_number__a_not_found = makeString("vertex number ~a not found");

    private static final SubLSymbol ARC_AS_SORTABLE_LIST = makeSymbol("ARC-AS-SORTABLE-LIST");

    private static final SubLSymbol ARC_AS_UNIFIABLE_LIST = makeSymbol("ARC-AS-UNIFIABLE-LIST");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLSymbol GRAPH_SEARCH_NODE = makeSymbol("GRAPH-SEARCH-NODE");

    private static final SubLSymbol GRAPH_SEARCH_NODE_P = makeSymbol("GRAPH-SEARCH-NODE-P");

    private static final SubLList $list78 = list(makeSymbol("VERTEX"), makeSymbol("SEARCH-HISTORY"));

    private static final SubLList $list79 = list(makeKeyword("VERTEX"), makeKeyword("SEARCH-HISTORY"));

    private static final SubLList $list80 = list(makeSymbol("GRAPH-SEARCH-NODE-VERTEX"), makeSymbol("GRAPH-SEARCH-NODE-SEARCH-HISTORY"));

    private static final SubLList $list81 = list(makeSymbol("_CSETF-GRAPH-SEARCH-NODE-VERTEX"), makeSymbol("_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY"));

    private static final SubLSymbol PRINT_GRAPH_SEARCH_NODE = makeSymbol("PRINT-GRAPH-SEARCH-NODE");

    private static final SubLSymbol GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GRAPH-SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list84 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GRAPH-SEARCH-NODE-P"));

    private static final SubLSymbol GRAPH_SEARCH_NODE_VERTEX = makeSymbol("GRAPH-SEARCH-NODE-VERTEX");

    private static final SubLSymbol _CSETF_GRAPH_SEARCH_NODE_VERTEX = makeSymbol("_CSETF-GRAPH-SEARCH-NODE-VERTEX");

    private static final SubLSymbol GRAPH_SEARCH_NODE_SEARCH_HISTORY = makeSymbol("GRAPH-SEARCH-NODE-SEARCH-HISTORY");

    private static final SubLSymbol _CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY = makeSymbol("_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY");

    private static final SubLSymbol MAKE_GRAPH_SEARCH_NODE = makeSymbol("MAKE-GRAPH-SEARCH-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GRAPH_SEARCH_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GRAPH-SEARCH-NODE-METHOD");

    private static final SubLString $str93$__NODE__s__s_ = makeString("#<NODE:~s ~s>");

    private static final SubLSymbol $sym94$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol INERT_VARIABLE = makeSymbol("INERT-VARIABLE");

    private static final SubLString $str98$graph_search_node___failed_to_com = makeString("graph-search-node-< failed to compare nodes ~%~s and ~%~s");

    private static final SubLSymbol $sym99$GRAPH_SEARCH_NODE__ = makeSymbol("GRAPH-SEARCH-NODE-<");

    private static final SubLString $str100$min_graph_search_node_failed_on_n = makeString("min-graph-search-node failed on nodes ~s");

    private static final SubLSymbol GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS = makeSymbol("GRAPH-SEARCH-NODE-AS-UNIFIABLE-SETS");

    private static final SubLSymbol GRAPH_SEARCH_NODE_AS_SORTABLE_SETS = makeSymbol("GRAPH-SEARCH-NODE-AS-SORTABLE-SETS");

    private static final SubLSymbol $sym103$VERTEX_SEARCH_STATE__ = makeSymbol("VERTEX-SEARCH-STATE-<");

    private static final SubLSymbol SORTED_CONSTANT_EXTERNAL_ID_LIST = makeSymbol("SORTED-CONSTANT-EXTERNAL-ID-LIST");

    private static final SubLSymbol $sym105$GUID_TREE__ = makeSymbol("GUID-TREE-<");

    private static final SubLSymbol $sym106$SAFE_GUID_ = makeSymbol("SAFE-GUID<");

    private static final SubLSymbol $sym107$SAFE_GUID_ = makeSymbol("SAFE-GUID=");

    public static final SubLObject v_colour_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject v_colour_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject v_colour_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$v_colour_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject v_colour_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$v_colour_native.class ? T : NIL;
    }

    public static final SubLObject v_colour_sorted_constant_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.getField2();
    }

    public static SubLObject v_colour_sorted_constant_list(final SubLObject v_object) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject v_colour_sorted_nat_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.getField3();
    }

    public static SubLObject v_colour_sorted_nat_list(final SubLObject v_object) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject v_colour_sorted_assertion_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.getField4();
    }

    public static SubLObject v_colour_sorted_assertion_list(final SubLObject v_object) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject v_colour_list_structure_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.getField5();
    }

    public static SubLObject v_colour_list_structure(final SubLObject v_object) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject v_colour_sorted_var_positions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.getField6();
    }

    public static SubLObject v_colour_sorted_var_positions(final SubLObject v_object) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_v_colour_sorted_constant_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_v_colour_sorted_constant_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_v_colour_sorted_nat_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_v_colour_sorted_nat_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_v_colour_sorted_assertion_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_v_colour_sorted_assertion_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_v_colour_list_structure_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_v_colour_list_structure(final SubLObject v_object, final SubLObject value) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_v_colour_sorted_var_positions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, V_COLOUR_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_v_colour_sorted_var_positions(final SubLObject v_object, final SubLObject value) {
        assert NIL != v_colour_p(v_object) : "! czer_graph.v_colour_p(v_object) " + "czer_graph.v_colour_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_v_colour_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$v_colour_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SORTED_CONSTANT_LIST)) {
                        _csetf_v_colour_sorted_constant_list(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SORTED_NAT_LIST)) {
                            _csetf_v_colour_sorted_nat_list(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SORTED_ASSERTION_LIST)) {
                                _csetf_v_colour_sorted_assertion_list(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LIST_STRUCTURE)) {
                                    _csetf_v_colour_list_structure(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SORTED_VAR_POSITIONS)) {
                                        _csetf_v_colour_sorted_var_positions(v_new, current_value);
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

    public static SubLObject make_v_colour(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$v_colour_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SORTED_CONSTANT_LIST)) {
                _csetf_v_colour_sorted_constant_list(v_new, current_value);
            } else
                if (pcase_var.eql($SORTED_NAT_LIST)) {
                    _csetf_v_colour_sorted_nat_list(v_new, current_value);
                } else
                    if (pcase_var.eql($SORTED_ASSERTION_LIST)) {
                        _csetf_v_colour_sorted_assertion_list(v_new, current_value);
                    } else
                        if (pcase_var.eql($LIST_STRUCTURE)) {
                            _csetf_v_colour_list_structure(v_new, current_value);
                        } else
                            if (pcase_var.eql($SORTED_VAR_POSITIONS)) {
                                _csetf_v_colour_sorted_var_positions(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_v_colour(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_V_COLOUR, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SORTED_CONSTANT_LIST, v_colour_sorted_constant_list(obj));
        funcall(visitor_fn, obj, $SLOT, $SORTED_NAT_LIST, v_colour_sorted_nat_list(obj));
        funcall(visitor_fn, obj, $SLOT, $SORTED_ASSERTION_LIST, v_colour_sorted_assertion_list(obj));
        funcall(visitor_fn, obj, $SLOT, $LIST_STRUCTURE, v_colour_list_structure(obj));
        funcall(visitor_fn, obj, $SLOT, $SORTED_VAR_POSITIONS, v_colour_sorted_var_positions(obj));
        funcall(visitor_fn, obj, $END, MAKE_V_COLOUR, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_v_colour_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_v_colour(obj, visitor_fn);
    }

    public static final SubLObject v_colour_as_list_alt(SubLObject v_colour) {
        return NIL != v_colour ? ((SubLObject) (list(v_colour_sorted_constant_list(v_colour), v_colour_sorted_nat_list(v_colour), v_colour_sorted_assertion_list(v_colour), v_colour_list_structure(v_colour), v_colour_sorted_var_positions(v_colour)))) : NIL;
    }

    public static SubLObject v_colour_as_list(final SubLObject v_colour) {
        return NIL != v_colour ? list(v_colour_sorted_constant_list(v_colour), v_colour_sorted_nat_list(v_colour), v_colour_sorted_assertion_list(v_colour), v_colour_list_structure(v_colour), v_colour_sorted_var_positions(v_colour)) : NIL;
    }

    public static final SubLObject v_colour_min_alt(SubLObject colours) {
        return list_utilities.tree_min(Mapping.mapcar(symbol_function(V_COLOUR_AS_LIST), colours));
    }

    public static SubLObject v_colour_min(final SubLObject colours) {
        return list_utilities.tree_min(Mapping.mapcar(symbol_function(V_COLOUR_AS_LIST), colours));
    }

    public static final SubLObject arc_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_arc(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject arc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_arc(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject arc_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$arc_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject arc_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$arc_native.class ? T : NIL;
    }

    public static final SubLObject arc_head_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARC_P);
        return v_object.getField2();
    }

    public static SubLObject arc_head(final SubLObject v_object) {
        assert NIL != arc_p(v_object) : "! czer_graph.arc_p(v_object) " + "czer_graph.arc_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject arc_colour_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARC_P);
        return v_object.getField3();
    }

    public static SubLObject arc_colour(final SubLObject v_object) {
        assert NIL != arc_p(v_object) : "! czer_graph.arc_p(v_object) " + "czer_graph.arc_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_arc_head_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARC_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_arc_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != arc_p(v_object) : "! czer_graph.arc_p(v_object) " + "czer_graph.arc_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_arc_colour_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARC_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_arc_colour(final SubLObject v_object, final SubLObject value) {
        assert NIL != arc_p(v_object) : "! czer_graph.arc_p(v_object) " + "czer_graph.arc_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_arc_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$arc_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HEAD)) {
                        _csetf_arc_head(v_new, current_value);
                    } else {
                        if (pcase_var.eql($COLOUR)) {
                            _csetf_arc_colour(v_new, current_value);
                        } else {
                            Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_arc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$arc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HEAD)) {
                _csetf_arc_head(v_new, current_value);
            } else
                if (pcase_var.eql($COLOUR)) {
                    _csetf_arc_colour(v_new, current_value);
                } else {
                    Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_arc(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ARC, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HEAD, arc_head(obj));
        funcall(visitor_fn, obj, $SLOT, $COLOUR, arc_colour(obj));
        funcall(visitor_fn, obj, $END, MAKE_ARC, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_arc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_arc(obj, visitor_fn);
    }

    public static final SubLObject print_arc_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt39$__ARC__a_, arc_as_unifiable_list(v_object));
        return NIL;
    }

    public static SubLObject print_arc(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str48$__ARC__a_, arc_as_unifiable_list(v_object));
        return NIL;
    }

    public static final SubLObject new_arc_alt(SubLObject head, SubLObject colour) {
        {
            SubLObject arc = make_arc(UNPROVIDED);
            _csetf_arc_head(arc, head);
            _csetf_arc_colour(arc, colour);
            return arc;
        }
    }

    public static SubLObject new_arc(final SubLObject head, final SubLObject colour) {
        final SubLObject arc = make_arc(UNPROVIDED);
        _csetf_arc_head(arc, head);
        _csetf_arc_colour(arc, colour);
        return arc;
    }

    public static final SubLObject arc_as_sortable_list_alt(SubLObject arc) {
        return list($VARIABLE, arc_colour(arc));
    }

    public static SubLObject arc_as_sortable_list(final SubLObject arc) {
        return list($VARIABLE, arc_colour(arc));
    }

    public static final SubLObject arc_as_unifiable_list_alt(SubLObject arc) {
        return list(cycl_variables.make_el_var(arc_head(arc)), arc_colour(arc));
    }

    public static SubLObject arc_as_unifiable_list(final SubLObject arc) {
        return list(cycl_variables.make_el_var(arc_head(arc)), arc_colour(arc));
    }

    public static final SubLObject colour_arc_alt(SubLObject arc_var, SubLObject tail_lit, SubLObject head_lit) {
        return list(list_utilities.tree_positions_bfs(arc_var, tail_lit, UNPROVIDED), list_utilities.tree_positions_bfs(arc_var, head_lit, UNPROVIDED));
    }

    public static SubLObject colour_arc(final SubLObject arc_var, final SubLObject tail_lit, final SubLObject head_lit) {
        return list(list_utilities.tree_positions_bfs(arc_var, tail_lit, UNPROVIDED), list_utilities.tree_positions_bfs(arc_var, head_lit, UNPROVIDED));
    }

    public static final SubLObject vertex_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_vertex(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject vertex_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_vertex(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject vertex_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$vertex_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject vertex_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$vertex_native.class ? T : NIL;
    }

    public static final SubLObject vertex_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VERTEX_P);
        return v_object.getField2();
    }

    public static SubLObject vertex_id(final SubLObject v_object) {
        assert NIL != vertex_p(v_object) : "! czer_graph.vertex_p(v_object) " + "czer_graph.vertex_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject vertex_colour_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VERTEX_P);
        return v_object.getField3();
    }

    public static SubLObject vertex_colour(final SubLObject v_object) {
        assert NIL != vertex_p(v_object) : "! czer_graph.vertex_p(v_object) " + "czer_graph.vertex_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject vertex_arc_set_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VERTEX_P);
        return v_object.getField4();
    }

    public static SubLObject vertex_arc_set(final SubLObject v_object) {
        assert NIL != vertex_p(v_object) : "! czer_graph.vertex_p(v_object) " + "czer_graph.vertex_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_vertex_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VERTEX_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_vertex_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != vertex_p(v_object) : "! czer_graph.vertex_p(v_object) " + "czer_graph.vertex_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_vertex_colour_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VERTEX_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_vertex_colour(final SubLObject v_object, final SubLObject value) {
        assert NIL != vertex_p(v_object) : "! czer_graph.vertex_p(v_object) " + "czer_graph.vertex_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_vertex_arc_set_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VERTEX_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_vertex_arc_set(final SubLObject v_object, final SubLObject value) {
        assert NIL != vertex_p(v_object) : "! czer_graph.vertex_p(v_object) " + "czer_graph.vertex_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_vertex_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$vertex_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_vertex_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($COLOUR)) {
                            _csetf_vertex_colour(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ARC_SET)) {
                                _csetf_vertex_arc_set(v_new, current_value);
                            } else {
                                Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_vertex(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$vertex_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_vertex_id(v_new, current_value);
            } else
                if (pcase_var.eql($COLOUR)) {
                    _csetf_vertex_colour(v_new, current_value);
                } else
                    if (pcase_var.eql($ARC_SET)) {
                        _csetf_vertex_arc_set(v_new, current_value);
                    } else {
                        Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_vertex(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_VERTEX, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, vertex_id(obj));
        funcall(visitor_fn, obj, $SLOT, $COLOUR, vertex_colour(obj));
        funcall(visitor_fn, obj, $SLOT, $ARC_SET, vertex_arc_set(obj));
        funcall(visitor_fn, obj, $END, MAKE_VERTEX, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_vertex_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_vertex(obj, visitor_fn);
    }

    public static final SubLObject print_vertex_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt57$__VERTEX__a_, vertex_as_unifiable_list(v_object));
        return NIL;
    }

    public static SubLObject print_vertex(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str69$__VERTEX__a_, vertex_as_unifiable_list(v_object));
        return NIL;
    }

    public static final SubLObject find_vertex_by_id_alt(SubLObject id, SubLObject vertices) {
        {
            SubLObject cdolist_list_var = vertices;
            SubLObject vertex = NIL;
            for (vertex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , vertex = cdolist_list_var.first()) {
                if (id.numE(vertex_id(vertex))) {
                    return vertex;
                }
            }
        }
        Errors.warn($str_alt58$vertex_number__a_not_found, id);
        return NIL;
    }

    public static SubLObject find_vertex_by_id(final SubLObject id, final SubLObject vertices) {
        SubLObject cdolist_list_var = vertices;
        SubLObject vertex = NIL;
        vertex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (id.numE(vertex_id(vertex))) {
                return vertex;
            }
            cdolist_list_var = cdolist_list_var.rest();
            vertex = cdolist_list_var.first();
        } 
        Errors.warn($str70$vertex_number__a_not_found, id);
        return NIL;
    }

    public static final SubLObject vertex_as_sortable_list_alt(SubLObject v) {
        return append(vertex_first_half_as_sortable_list(v), list(vertex_second_half_as_sortable_set(v)));
    }

    public static SubLObject vertex_as_sortable_list(final SubLObject v) {
        return append(vertex_first_half_as_sortable_list(v), list(vertex_second_half_as_sortable_set(v)));
    }

    public static final SubLObject vertex_as_unifiable_list_alt(SubLObject v) {
        return append(vertex_first_half_as_unifiable_list(v), list(vertex_second_half_as_unifiable_set(v)));
    }

    public static SubLObject vertex_as_unifiable_list(final SubLObject v) {
        return append(vertex_first_half_as_unifiable_list(v), list(vertex_second_half_as_unifiable_set(v)));
    }

    public static final SubLObject vertex_first_half_as_sortable_list_alt(SubLObject v) {
        return list($VARIABLE, v_colour_as_list(vertex_colour(v)));
    }

    public static SubLObject vertex_first_half_as_sortable_list(final SubLObject v) {
        return list($VARIABLE, v_colour_as_list(vertex_colour(v)));
    }

    public static final SubLObject vertex_first_half_as_unifiable_list_alt(SubLObject v) {
        return list(cycl_variables.make_el_var(vertex_id(v)), v_colour_as_list(vertex_colour(v)));
    }

    public static SubLObject vertex_first_half_as_unifiable_list(final SubLObject v) {
        return list(cycl_variables.make_el_var(vertex_id(v)), v_colour_as_list(vertex_colour(v)));
    }

    public static final SubLObject vertex_second_half_as_sortable_set_alt(SubLObject v) {
        return Mapping.mapcar(symbol_function(ARC_AS_SORTABLE_LIST), vertex_arc_set(v));
    }

    public static SubLObject vertex_second_half_as_sortable_set(final SubLObject v) {
        return Mapping.mapcar(symbol_function(ARC_AS_SORTABLE_LIST), vertex_arc_set(v));
    }

    public static final SubLObject vertex_second_half_as_unifiable_set_alt(SubLObject v) {
        return Mapping.mapcar(symbol_function(ARC_AS_UNIFIABLE_LIST), vertex_arc_set(v));
    }

    public static SubLObject vertex_second_half_as_unifiable_set(final SubLObject v) {
        return Mapping.mapcar(symbol_function(ARC_AS_UNIFIABLE_LIST), vertex_arc_set(v));
    }

    /**
     * Adds an edge v1->v2 of colour COLOUR.
     */
    @LispMethod(comment = "Adds an edge v1->v2 of colour COLOUR.")
    public static final SubLObject vertex_add_arc_alt(SubLObject v1, SubLObject head_id, SubLObject colour) {
        _csetf_vertex_arc_set(v1, cons(new_arc(head_id, colour), vertex_arc_set(v1)));
        return T;
    }

    /**
     * Adds an edge v1->v2 of colour COLOUR.
     */
    @LispMethod(comment = "Adds an edge v1->v2 of colour COLOUR.")
    public static SubLObject vertex_add_arc(final SubLObject v1, final SubLObject head_id, final SubLObject colour) {
        _csetf_vertex_arc_set(v1, cons(new_arc(head_id, colour), vertex_arc_set(v1)));
        return T;
    }

    /**
     *
     *
     * @param v;
    vertex
     * 		
     * @return colour; the colour of a vertex based on the information in LITERAL wrt ORIGINALS.
     */
    @LispMethod(comment = "@param v;\nvertex\r\n\t\t\r\n@return colour; the colour of a vertex based on the information in LITERAL wrt ORIGINALS.")
    public static final SubLObject colour_vertex_alt(SubLObject literal, SubLObject sorted_shared_vars) {
        {
            SubLObject colour = make_v_colour(UNPROVIDED);
            SubLObject sorted_var_positions = NIL;
            _csetf_v_colour_sorted_constant_list(colour, cycl_utilities.sorted_constant_internal_id_list(literal));
            _csetf_v_colour_sorted_nat_list(colour, Mapping.mapcar(symbol_function(NART_ID), cycl_utilities.sorted_nat_list(literal)));
            _csetf_v_colour_sorted_assertion_list(colour, Mapping.mapcar(symbol_function(ASSERTION_ID), cycl_utilities.sorted_assertion_list(literal)));
            _csetf_v_colour_list_structure(colour, list_utilities.list_structure(literal, MINUS_ONE_INTEGER));
            {
                SubLObject cdolist_list_var = sorted_shared_vars;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    sorted_var_positions = cons(list_utilities.tree_position_bfs(var, literal, UNPROVIDED), sorted_var_positions);
                }
            }
            _csetf_v_colour_sorted_var_positions(colour, sorted_var_positions);
            return colour;
        }
    }

    /**
     *
     *
     * @param v;
    vertex
     * 		
     * @return colour; the colour of a vertex based on the information in LITERAL wrt ORIGINALS.
     */
    @LispMethod(comment = "@param v;\nvertex\r\n\t\t\r\n@return colour; the colour of a vertex based on the information in LITERAL wrt ORIGINALS.")
    public static SubLObject colour_vertex(final SubLObject literal, final SubLObject sorted_shared_vars) {
        final SubLObject colour = make_v_colour(UNPROVIDED);
        SubLObject sorted_var_positions = NIL;
        _csetf_v_colour_sorted_constant_list(colour, cycl_utilities.sorted_constant_external_id_list(literal));
        _csetf_v_colour_sorted_nat_list(colour, Mapping.mapcar(symbol_function(NART_ID), cycl_utilities.sorted_nat_list(literal)));
        _csetf_v_colour_sorted_assertion_list(colour, Mapping.mapcar(symbol_function(ASSERTION_ID), cycl_utilities.sorted_assertion_list(literal)));
        _csetf_v_colour_list_structure(colour, list_utilities.list_structure(literal, MINUS_ONE_INTEGER));
        SubLObject cdolist_list_var = sorted_shared_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sorted_var_positions = cons(list_utilities.tree_position_bfs(var, literal, UNPROVIDED), sorted_var_positions);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        _csetf_v_colour_sorted_var_positions(colour, sorted_var_positions);
        return colour;
    }

    public static final SubLObject new_vertex_alt(SubLObject id, SubLObject literals, SubLObject sorted_shared_vars) {
        {
            SubLObject v = make_vertex(UNPROVIDED);
            SubLObject v_lit = nth(id, literals);
            _csetf_vertex_id(v, id);
            _csetf_vertex_colour(v, colour_vertex(v_lit, sorted_shared_vars));
            {
                SubLObject cdolist_list_var = list_utilities.tree_gather(v_lit, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    {
                        SubLObject cdotimes_end_var = length(literals);
                        SubLObject head_id = NIL;
                        for (head_id = ZERO_INTEGER; head_id.numL(cdotimes_end_var); head_id = add(head_id, ONE_INTEGER)) {
                            if (NIL != list_utilities.tree_find(var, nth(head_id, literals), UNPROVIDED, UNPROVIDED)) {
                                vertex_add_arc(v, head_id, colour_arc(var, v_lit, nth(head_id, literals)));
                            }
                        }
                    }
                }
            }
            return v;
        }
    }

    public static SubLObject new_vertex(final SubLObject id, final SubLObject literals, final SubLObject sorted_shared_vars) {
        final SubLObject v = make_vertex(UNPROVIDED);
        final SubLObject v_lit = nth(id, literals);
        _csetf_vertex_id(v, id);
        _csetf_vertex_colour(v, colour_vertex(v_lit, sorted_shared_vars));
        SubLObject cdolist_list_var = list_utilities.tree_gather(v_lit, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdotimes_end_var;
            SubLObject head_id;
            for (cdotimes_end_var = length(literals), head_id = NIL, head_id = ZERO_INTEGER; head_id.numL(cdotimes_end_var); head_id = add(head_id, ONE_INTEGER)) {
                if (NIL != list_utilities.tree_find(var, nth(head_id, literals), UNPROVIDED, UNPROVIDED)) {
                    vertex_add_arc(v, head_id, colour_arc(var, v_lit, nth(head_id, literals)));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return v;
    }

    public static final SubLObject graph_search_node_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_graph_search_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject graph_search_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_graph_search_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject graph_search_node_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$graph_search_node_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject graph_search_node_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.czer_graph.$graph_search_node_native.class ? T : NIL;
    }

    public static final SubLObject graph_search_node_vertex_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GRAPH_SEARCH_NODE_P);
        return v_object.getField2();
    }

    public static SubLObject graph_search_node_vertex(final SubLObject v_object) {
        assert NIL != graph_search_node_p(v_object) : "! czer_graph.graph_search_node_p(v_object) " + "czer_graph.graph_search_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject graph_search_node_search_history_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GRAPH_SEARCH_NODE_P);
        return v_object.getField3();
    }

    public static SubLObject graph_search_node_search_history(final SubLObject v_object) {
        assert NIL != graph_search_node_p(v_object) : "! czer_graph.graph_search_node_p(v_object) " + "czer_graph.graph_search_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_graph_search_node_vertex_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GRAPH_SEARCH_NODE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_graph_search_node_vertex(final SubLObject v_object, final SubLObject value) {
        assert NIL != graph_search_node_p(v_object) : "! czer_graph.graph_search_node_p(v_object) " + "czer_graph.graph_search_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_graph_search_node_search_history_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GRAPH_SEARCH_NODE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_graph_search_node_search_history(final SubLObject v_object, final SubLObject value) {
        assert NIL != graph_search_node_p(v_object) : "! czer_graph.graph_search_node_p(v_object) " + "czer_graph.graph_search_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_graph_search_node_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$graph_search_node_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($VERTEX)) {
                        _csetf_graph_search_node_vertex(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SEARCH_HISTORY)) {
                            _csetf_graph_search_node_search_history(v_new, current_value);
                        } else {
                            Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_graph_search_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.czer_graph.$graph_search_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VERTEX)) {
                _csetf_graph_search_node_vertex(v_new, current_value);
            } else
                if (pcase_var.eql($SEARCH_HISTORY)) {
                    _csetf_graph_search_node_search_history(v_new, current_value);
                } else {
                    Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_graph_search_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GRAPH_SEARCH_NODE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VERTEX, graph_search_node_vertex(obj));
        funcall(visitor_fn, obj, $SLOT, $SEARCH_HISTORY, graph_search_node_search_history(obj));
        funcall(visitor_fn, obj, $END, MAKE_GRAPH_SEARCH_NODE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_graph_search_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_graph_search_node(obj, visitor_fn);
    }

    public static final SubLObject print_graph_search_node_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt78$__NODE__s__s_, graph_search_node_vertex(v_object), graph_search_node_search_history(v_object));
        return NIL;
    }

    public static SubLObject print_graph_search_node(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str93$__NODE__s__s_, graph_search_node_vertex(v_object), graph_search_node_search_history(v_object));
        return NIL;
    }

    public static final SubLObject inert_variable_alt(SubLObject arg) {
        return $VARIABLE;
    }

    public static SubLObject inert_variable(final SubLObject arg) {
        return $VARIABLE;
    }

    public static final SubLObject graph_search_node_as_sortable_sets_alt(SubLObject node) {
        return transform_list_utilities.ntransform(graph_search_node_as_unifiable_sets(node), symbol_function($sym79$EL_VAR_), symbol_function(INERT_VARIABLE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject graph_search_node_as_sortable_sets(final SubLObject node) {
        return transform_list_utilities.ntransform(graph_search_node_as_unifiable_sets(node), symbol_function($sym94$EL_VAR_), symbol_function(INERT_VARIABLE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject graph_search_node_as_unifiable_sets_alt(SubLObject node) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = graph_search_node_search_history(node);
            SubLObject arc_vertex_pair = NIL;
            for (arc_vertex_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arc_vertex_pair = cdolist_list_var.first()) {
                {
                    SubLObject arc = arc_as_unifiable_list(arc_vertex_pair.first());
                    SubLObject v_info = vertex_first_half_as_unifiable_list(arc_vertex_pair.rest());
                    SubLObject v_arc_set = vertex_second_half_as_unifiable_set(arc_vertex_pair.rest());
                    result = cons(cons(cons($ARC, arc), cons(cons($VERTEX_INFO, v_info), v_arc_set)), result);
                }
            }
            return cons(cons(cons($VERTEX_INFO, vertex_first_half_as_unifiable_list(graph_search_node_vertex(node))), vertex_second_half_as_unifiable_set(graph_search_node_vertex(node))), result);
        }
    }

    public static SubLObject graph_search_node_as_unifiable_sets(final SubLObject node) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = graph_search_node_search_history(node);
        SubLObject arc_vertex_pair = NIL;
        arc_vertex_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arc = arc_as_unifiable_list(arc_vertex_pair.first());
            final SubLObject v_info = vertex_first_half_as_unifiable_list(arc_vertex_pair.rest());
            final SubLObject v_arc_set = vertex_second_half_as_unifiable_set(arc_vertex_pair.rest());
            result = cons(cons(cons($ARC, arc), cons(cons($VERTEX_INFO, v_info), v_arc_set)), result);
            cdolist_list_var = cdolist_list_var.rest();
            arc_vertex_pair = cdolist_list_var.first();
        } 
        return cons(cons(cons($VERTEX_INFO, vertex_first_half_as_unifiable_list(graph_search_node_vertex(node))), vertex_second_half_as_unifiable_set(graph_search_node_vertex(node))), result);
    }

    public static final SubLObject unify_graph_search_node_alt(SubLObject node1, SubLObject node2) {
        return unification_utilities.unify_sets(graph_search_node_as_unifiable_sets(node1), graph_search_node_as_unifiable_sets(node2), T, UNPROVIDED);
    }

    public static SubLObject unify_graph_search_node(final SubLObject node1, final SubLObject node2) {
        return unification_utilities.unify_sets(graph_search_node_as_unifiable_sets(node1), graph_search_node_as_unifiable_sets(node2), T, UNPROVIDED);
    }

    public static final SubLObject graph_search_nodes_isomorphicP_alt(SubLObject node1, SubLObject node2) {
        return equal(list(bindings.unification_success_token()), unify_graph_search_node(node1, node2));
    }

    public static SubLObject graph_search_nodes_isomorphicP(final SubLObject node1, final SubLObject node2) {
        return equal(list(bindings.unification_success_token()), unify_graph_search_node(node1, node2));
    }

    public static final SubLObject graph_search_node_L_alt(SubLObject node1, SubLObject node2) {
        {
            SubLObject sortable_node1 = graph_search_node_as_sortable_sets(node1);
            SubLObject sortable_node2 = graph_search_node_as_sortable_sets(node2);
            if (NIL != list_utilities.sets_L(sortable_node1, sortable_node2, UNPROVIDED)) {
                return T;
            } else {
                if (NIL != list_utilities.sets_L(sortable_node2, sortable_node1, UNPROVIDED)) {
                    return NIL;
                } else {
                    Errors.warn($str_alt83$graph_search_node___failed_to_com, node1, node2);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject graph_search_node_L(final SubLObject node1, final SubLObject node2) {
        final SubLObject sortable_node1 = graph_search_node_as_sortable_sets(node1);
        final SubLObject sortable_node2 = graph_search_node_as_sortable_sets(node2);
        if (NIL != list_utilities.sets_L(sortable_node1, sortable_node2, UNPROVIDED)) {
            return T;
        }
        if (NIL != list_utilities.sets_L(sortable_node2, sortable_node1, UNPROVIDED)) {
            return NIL;
        }
        Errors.warn($str98$graph_search_node___failed_to_com, node1, node2);
        return NIL;
    }

    public static final SubLObject min_graph_search_node_alt(SubLObject nodes) {
        if (NIL != list_utilities.singletonP(nodes)) {
            return nodes.first();
        }
        {
            SubLObject sorted_nodes = Sort.sort(copy_list(nodes), symbol_function($sym84$GRAPH_SEARCH_NODE__), UNPROVIDED);
            if (!sorted_nodes.first().equal(second(sorted_nodes))) {
                return sorted_nodes.first();
            }
        }
        Errors.warn($str_alt85$min_graph_search_node_failed_on_n, nodes);
        return nodes.first();
    }

    public static SubLObject min_graph_search_node(final SubLObject nodes) {
        if (NIL != list_utilities.singletonP(nodes)) {
            return nodes.first();
        }
        final SubLObject sorted_nodes = Sort.sort(copy_list(nodes), symbol_function($sym99$GRAPH_SEARCH_NODE__), UNPROVIDED);
        if (!sorted_nodes.first().equal(second(sorted_nodes))) {
            return sorted_nodes.first();
        }
        Errors.warn($str100$min_graph_search_node_failed_on_n, nodes);
        return nodes.first();
    }

    public static final SubLObject vertex_search_state_as_unifiable_sets_of_sets_alt(SubLObject state) {
        return Mapping.mapcar(symbol_function(GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS), state);
    }

    public static SubLObject vertex_search_state_as_unifiable_sets_of_sets(final SubLObject state) {
        return Mapping.mapcar(symbol_function(GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS), state);
    }

    public static final SubLObject vertex_search_state_as_sortable_sets_of_sets_alt(SubLObject state) {
        return Mapping.mapcar(symbol_function(GRAPH_SEARCH_NODE_AS_SORTABLE_SETS), state);
    }

    public static SubLObject vertex_search_state_as_sortable_sets_of_sets(final SubLObject state) {
        return Mapping.mapcar(symbol_function(GRAPH_SEARCH_NODE_AS_SORTABLE_SETS), state);
    }

    public static final SubLObject unify_vertex_search_state_alt(SubLObject state1, SubLObject state2) {
        return unification_utilities.unify_sets_of_sets(vertex_search_state_as_unifiable_sets_of_sets(state1), vertex_search_state_as_unifiable_sets_of_sets(state2), T, UNPROVIDED);
    }

    public static SubLObject unify_vertex_search_state(final SubLObject state1, final SubLObject state2) {
        return unification_utilities.unify_sets_of_sets(vertex_search_state_as_unifiable_sets_of_sets(state1), vertex_search_state_as_unifiable_sets_of_sets(state2), T, UNPROVIDED);
    }

    public static final SubLObject vertex_search_states_isomorphicP_alt(SubLObject state1, SubLObject state2) {
        return equal(list(bindings.unification_success_token()), unify_vertex_search_state(state1, state2));
    }

    public static SubLObject vertex_search_states_isomorphicP(final SubLObject state1, final SubLObject state2) {
        return equal(list(bindings.unification_success_token()), unify_vertex_search_state(state1, state2));
    }

    public static final SubLObject vertex_search_state_L_alt(SubLObject state1, SubLObject state2) {
        {
            SubLObject sortable_state1 = vertex_search_state_as_sortable_sets_of_sets(state1);
            SubLObject sortable_state2 = vertex_search_state_as_sortable_sets_of_sets(state2);
            return list_utilities.sets_of_sets_L(sortable_state1, sortable_state2, UNPROVIDED);
        }
    }

    public static SubLObject vertex_search_state_L(final SubLObject state1, final SubLObject state2) {
        final SubLObject sortable_state1 = vertex_search_state_as_sortable_sets_of_sets(state1);
        final SubLObject sortable_state2 = vertex_search_state_as_sortable_sets_of_sets(state2);
        return list_utilities.sets_of_sets_L(sortable_state1, sortable_state2, UNPROVIDED);
    }

    public static final SubLObject min_vertex_search_state_alt(SubLObject automorphism_set_size, SubLObject states) {
        if (automorphism_set_size.numE(length(states))) {
            return states.first();
        }
        {
            SubLObject sorted_states = Sort.sort(states, symbol_function($sym88$VERTEX_SEARCH_STATE__), UNPROVIDED);
            if (sorted_states.first().equal(nth(automorphism_set_size, sorted_states))) {
                return NIL;
            } else {
                return sorted_states.first();
            }
        }
    }

    public static SubLObject min_vertex_search_state(final SubLObject automorphism_set_size, final SubLObject states) {
        if (automorphism_set_size.numE(length(states))) {
            return states.first();
        }
        final SubLObject sorted_states = Sort.sort(states, symbol_function($sym103$VERTEX_SEARCH_STATE__), UNPROVIDED);
        if (sorted_states.first().equal(nth(automorphism_set_size, sorted_states))) {
            return NIL;
        }
        return sorted_states.first();
    }

    public static final SubLObject source_vertex_alt(SubLObject vertex_search_state) {
        {
            SubLObject cdolist_list_var = vertex_search_state;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                if (NIL == graph_search_node_search_history(node)) {
                    return graph_search_node_vertex(node);
                }
            }
        }
        return NIL;
    }

    public static SubLObject source_vertex(final SubLObject vertex_search_state) {
        SubLObject cdolist_list_var = vertex_search_state;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == graph_search_node_search_history(node)) {
                return graph_search_node_vertex(node);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return list; a set of vertex-search-nodes, each containing only one graph-search-node to start with.
     */
    @LispMethod(comment = "@return list; a set of vertex-search-nodes, each containing only one graph-search-node to start with.")
    public static final SubLObject init_graph_search_state_alt(SubLObject v_graph) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_graph;
            SubLObject vertex = NIL;
            for (vertex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , vertex = cdolist_list_var.first()) {
                result = cons(list(make_graph_search_node(list($VERTEX, vertex))), result);
            }
            return result;
        }
    }

    /**
     *
     *
     * @return list; a set of vertex-search-nodes, each containing only one graph-search-node to start with.
     */
    @LispMethod(comment = "@return list; a set of vertex-search-nodes, each containing only one graph-search-node to start with.")
    public static SubLObject init_graph_search_state(final SubLObject v_graph) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_graph;
        SubLObject vertex = NIL;
        vertex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(make_graph_search_node(list($VERTEX, vertex))), result);
            cdolist_list_var = cdolist_list_var.rest();
            vertex = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * If t, there's no point in searching further.
     */
    @LispMethod(comment = "If t, there\'s no point in searching further.")
    public static final SubLObject graph_search_state_covers_graphP_alt(SubLObject v_graph, SubLObject graph_search_state) {
        {
            SubLObject uncovered_vertexP = NIL;
            if (NIL == uncovered_vertexP) {
                {
                    SubLObject csome_list_var = graph_search_state;
                    SubLObject vertex_search_state = NIL;
                    for (vertex_search_state = csome_list_var.first(); !((NIL != uncovered_vertexP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , vertex_search_state = csome_list_var.first()) {
                        if (length(vertex_search_state).numGE(length(v_graph))) {
                            {
                                SubLObject searched_vertices = NIL;
                                SubLObject cdolist_list_var = vertex_search_state;
                                SubLObject node = NIL;
                                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                    {
                                        SubLObject item_var = vertex_id(graph_search_node_vertex(node));
                                        if (NIL == member(item_var, searched_vertices, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            searched_vertices = cons(item_var, searched_vertices);
                                        }
                                    }
                                }
                                uncovered_vertexP = numL(length(searched_vertices), length(v_graph));
                            }
                        } else {
                            uncovered_vertexP = T;
                        }
                    }
                }
            }
            return uncovered_vertexP;
        }
    }

    /**
     * If t, there's no point in searching further.
     */
    @LispMethod(comment = "If t, there\'s no point in searching further.")
    public static SubLObject graph_search_state_covers_graphP(final SubLObject v_graph, final SubLObject graph_search_state) {
        SubLObject uncovered_vertexP = NIL;
        if (NIL == uncovered_vertexP) {
            SubLObject csome_list_var = graph_search_state;
            SubLObject vertex_search_state = NIL;
            vertex_search_state = csome_list_var.first();
            while ((NIL == uncovered_vertexP) && (NIL != csome_list_var)) {
                if (length(vertex_search_state).numGE(length(v_graph))) {
                    SubLObject searched_vertices = NIL;
                    SubLObject cdolist_list_var = vertex_search_state;
                    SubLObject node = NIL;
                    node = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = vertex_id(graph_search_node_vertex(node));
                        if (NIL == member(item_var, searched_vertices, symbol_function(EQL), symbol_function(IDENTITY))) {
                            searched_vertices = cons(item_var, searched_vertices);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        node = cdolist_list_var.first();
                    } 
                    uncovered_vertexP = numL(length(searched_vertices), length(v_graph));
                } else {
                    uncovered_vertexP = T;
                }
                csome_list_var = csome_list_var.rest();
                vertex_search_state = csome_list_var.first();
            } 
        }
        return uncovered_vertexP;
    }

    /**
     *
     *
     * @param graph
     * 		graph; a list of vertices.
     * @return vertex; the least vertex in GRAPH, according to a stable sorting algorithm.
    It is guaranteed that for any isomorphic G and G', (least-vertex G) = (least-vertex G'),
    unless there is an automorphism in G which maps every element to a different element.
    In this case, it is guaranteed that (least-vertex G) is in the same automorphism set as (least-vertex G').
     */
    @LispMethod(comment = "@param graph\r\n\t\tgraph; a list of vertices.\r\n@return vertex; the least vertex in GRAPH, according to a stable sorting algorithm.\r\nIt is guaranteed that for any isomorphic G and G\', (least-vertex G) = (least-vertex G\'),\r\nunless there is an automorphism in G which maps every element to a different element.\r\nIn this case, it is guaranteed that (least-vertex G) is in the same automorphism set as (least-vertex G\').")
    public static final SubLObject least_vertex_alt(SubLObject v_graph, SubLObject automorphism_set_size) {
        if (automorphism_set_size == UNPROVIDED) {
            automorphism_set_size = ONE_INTEGER;
        }
        {
            SubLObject graph_search_state = init_graph_search_state(v_graph);
            SubLObject v_answer = least_vertex_recursive(v_graph, graph_search_state, automorphism_set_size);
            if (NIL != v_answer) {
                return v_answer;
            }
        }
        if (automorphism_set_size.numE(length(v_graph))) {
            return v_graph.first();
        } else {
            return least_vertex(v_graph, add(ONE_INTEGER, automorphism_set_size));
        }
    }

    /**
     *
     *
     * @param graph
     * 		graph; a list of vertices.
     * @return vertex; the least vertex in GRAPH, according to a stable sorting algorithm.
    It is guaranteed that for any isomorphic G and G', (least-vertex G) = (least-vertex G'),
    unless there is an automorphism in G which maps every element to a different element.
    In this case, it is guaranteed that (least-vertex G) is in the same automorphism set as (least-vertex G').
     */
    @LispMethod(comment = "@param graph\r\n\t\tgraph; a list of vertices.\r\n@return vertex; the least vertex in GRAPH, according to a stable sorting algorithm.\r\nIt is guaranteed that for any isomorphic G and G\', (least-vertex G) = (least-vertex G\'),\r\nunless there is an automorphism in G which maps every element to a different element.\r\nIn this case, it is guaranteed that (least-vertex G) is in the same automorphism set as (least-vertex G\').")
    public static SubLObject least_vertex(final SubLObject v_graph, SubLObject automorphism_set_size) {
        if (automorphism_set_size == UNPROVIDED) {
            automorphism_set_size = ONE_INTEGER;
        }
        final SubLObject graph_search_state = init_graph_search_state(v_graph);
        final SubLObject v_answer = least_vertex_recursive(v_graph, graph_search_state, automorphism_set_size);
        if (NIL != v_answer) {
            return v_answer;
        }
        if (automorphism_set_size.numE(length(v_graph))) {
            return v_graph.first();
        }
        return least_vertex(v_graph, add(ONE_INTEGER, automorphism_set_size));
    }

    public static final SubLObject least_vertex_recursive_alt(SubLObject v_graph, SubLObject graph_search_state, SubLObject automorphism_set_size) {
        {
            SubLObject min = min_vertex_search_state(automorphism_set_size, graph_search_state);
            if (NIL != min) {
                return source_vertex(min);
            }
        }
        if (NIL != graph_search_state_covers_graphP(v_graph, graph_search_state)) {
            return NIL;
        }
        {
            SubLObject new_graph_search_state = NIL;
            SubLObject cdolist_list_var = graph_search_state;
            SubLObject vertex_search_state = NIL;
            for (vertex_search_state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , vertex_search_state = cdolist_list_var.first()) {
                {
                    SubLObject new_vertex_search_state = vertex_search_state;
                    SubLObject cdolist_list_var_1 = vertex_search_state;
                    SubLObject from_node = NIL;
                    for (from_node = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , from_node = cdolist_list_var_1.first()) {
                        {
                            SubLObject from_vertex = graph_search_node_vertex(from_node);
                            SubLObject cdolist_list_var_2 = vertex_arc_set(from_vertex);
                            SubLObject arc = NIL;
                            for (arc = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , arc = cdolist_list_var_2.first()) {
                                {
                                    SubLObject to_vertex = find_vertex_by_id(arc_head(arc), v_graph);
                                    SubLObject new_history_pair = list(arc, from_vertex);
                                    SubLObject new_history = cons(new_history_pair, graph_search_node_search_history(from_node));
                                    SubLObject new_node = make_graph_search_node(list($VERTEX, to_vertex, $SEARCH_HISTORY, new_history));
                                    new_vertex_search_state = cons(new_node, new_vertex_search_state);
                                }
                            }
                        }
                    }
                    new_graph_search_state = cons(new_vertex_search_state, new_graph_search_state);
                }
            }
            return least_vertex_recursive(v_graph, new_graph_search_state, automorphism_set_size);
        }
    }

    public static SubLObject least_vertex_recursive(final SubLObject v_graph, final SubLObject graph_search_state, final SubLObject automorphism_set_size) {
        final SubLObject min = min_vertex_search_state(automorphism_set_size, graph_search_state);
        if (NIL != min) {
            return source_vertex(min);
        }
        if (NIL != graph_search_state_covers_graphP(v_graph, graph_search_state)) {
            return NIL;
        }
        SubLObject new_graph_search_state = NIL;
        SubLObject cdolist_list_var = graph_search_state;
        SubLObject vertex_search_state = NIL;
        vertex_search_state = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_vertex_search_state = vertex_search_state;
            SubLObject cdolist_list_var_$1 = vertex_search_state;
            SubLObject from_node = NIL;
            from_node = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject from_vertex = graph_search_node_vertex(from_node);
                SubLObject cdolist_list_var_$2 = vertex_arc_set(from_vertex);
                SubLObject arc = NIL;
                arc = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject to_vertex = find_vertex_by_id(arc_head(arc), v_graph);
                    final SubLObject new_history_pair = list(arc, from_vertex);
                    final SubLObject new_history = cons(new_history_pair, graph_search_node_search_history(from_node));
                    final SubLObject new_node = make_graph_search_node(list($VERTEX, to_vertex, $SEARCH_HISTORY, new_history));
                    new_vertex_search_state = cons(new_node, new_vertex_search_state);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    arc = cdolist_list_var_$2.first();
                } 
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                from_node = cdolist_list_var_$1.first();
            } 
            new_graph_search_state = cons(new_vertex_search_state, new_graph_search_state);
            cdolist_list_var = cdolist_list_var.rest();
            vertex_search_state = cdolist_list_var.first();
        } 
        return least_vertex_recursive(v_graph, new_graph_search_state, automorphism_set_size);
    }

    /**
     * Picks out the minimum literal wrt the ordering on Cyc constants, if it is unique.
     */
    @LispMethod(comment = "Picks out the minimum literal wrt the ordering on Cyc constants, if it is unique.")
    public static final SubLObject penultimate_resort_literals_alt(SubLObject literals) {
        {
            SubLObject literal = czer_main.default_preference_lit(literals);
            if (NIL != literal) {
                return list(literal);
            }
        }
        {
            SubLObject constant_lists = Mapping.mapcar(symbol_function(SORTED_CONSTANT_INTERNAL_ID_LIST), literals);
            SubLObject sorted_constant_lists = Sort.sort(copy_list(constant_lists), symbol_function($sym90$TREE__), UNPROVIDED);
            if (!sorted_constant_lists.first().equal(second(sorted_constant_lists))) {
                return list(nth(position(sorted_constant_lists.first(), constant_lists, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), literals));
            }
        }
        return literals;
    }

    /**
     * Picks out the minimum literal wrt the ordering on Cyc constants, if it is unique.
     */
    @LispMethod(comment = "Picks out the minimum literal wrt the ordering on Cyc constants, if it is unique.")
    public static SubLObject penultimate_resort_literals(final SubLObject literals) {
        final SubLObject literal = czer_main.default_preference_lit(literals);
        if (NIL != literal) {
            return list(literal);
        }
        final SubLObject constant_lists = Mapping.mapcar(symbol_function(SORTED_CONSTANT_EXTERNAL_ID_LIST), literals);
        final SubLObject sorted_constant_lists = Sort.sort(copy_list(constant_lists), symbol_function($sym105$GUID_TREE__), UNPROVIDED);
        if (!sorted_constant_lists.first().equal(second(sorted_constant_lists))) {
            return list(nth(position(sorted_constant_lists.first(), constant_lists, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), literals));
        }
        return literals;
    }

    public static SubLObject guid_tree_L(final SubLObject tree1, final SubLObject tree2) {
        return list_utilities.tree_L(tree1, tree2, symbol_function($sym106$SAFE_GUID_), symbol_function($sym107$SAFE_GUID_));
    }

    public static SubLObject safe_guidL(final SubLObject object1, final SubLObject object2) {
        return NIL != Guids.guid_p(object1) ? NIL != Guids.guid_p(object2) ? Guids.guidL(object1, object2) : NIL : NIL != Guids.guid_p(object2) ? T : NIL;
    }

    public static SubLObject safe_guidE(final SubLObject object1, final SubLObject object2) {
        if ((NIL != Guids.guid_p(object1)) && (NIL != Guids.guid_p(object2))) {
            return Guids.guidE(object1, object2);
        }
        return NIL;
    }

    public static final SubLObject last_resort_literal_alt(SubLObject literals, SubLObject originals) {
        {
            SubLObject sorted_shared_vars = compute_sorted_shared_vars(originals, literals);
            SubLObject v_graph = NIL;
            SubLObject cdotimes_end_var = length(literals);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject v = new_vertex(i, literals, sorted_shared_vars);
                    v_graph = cons(v, v_graph);
                }
            }
            return nth(vertex_id(least_vertex(v_graph, UNPROVIDED)), literals);
        }
    }

    public static SubLObject last_resort_literal(final SubLObject literals, final SubLObject originals) {
        final SubLObject sorted_shared_vars = compute_sorted_shared_vars(originals, literals);
        SubLObject v_graph = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject v;
        for (cdotimes_end_var = length(literals), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            v = new_vertex(i, literals, sorted_shared_vars);
            v_graph = cons(v, v_graph);
        }
        return nth(vertex_id(least_vertex(v_graph, UNPROVIDED)), literals);
    }

    /**
     * Optimized for the case where ORIGINALS is nil, as when called from the inference czer
     */
    @LispMethod(comment = "Optimized for the case where ORIGINALS is nil, as when called from the inference czer")
    public static final SubLObject compute_sorted_shared_vars_alt(SubLObject originals, SubLObject literals) {
        return NIL != originals ? ((SubLObject) (list_utilities.ordered_intersection(literals_variables(originals, symbol_function(VARIABLE_P)), literals_variables(literals, symbol_function(VARIABLE_P)), UNPROVIDED, UNPROVIDED))) : NIL;
    }

    /**
     * Optimized for the case where ORIGINALS is nil, as when called from the inference czer
     */
    @LispMethod(comment = "Optimized for the case where ORIGINALS is nil, as when called from the inference czer")
    public static SubLObject compute_sorted_shared_vars(final SubLObject originals, final SubLObject literals) {
        return NIL != originals ? list_utilities.ordered_intersection(literals_variables(originals, symbol_function(VARIABLE_P)), literals_variables(literals, symbol_function(VARIABLE_P)), UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject declare_czer_graph_file() {
        declareFunction("v_colour_print_function_trampoline", "V-COLOUR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("v_colour_p", "V-COLOUR-P", 1, 0, false);
        new czer_graph.$v_colour_p$UnaryFunction();
        declareFunction("v_colour_sorted_constant_list", "V-COLOUR-SORTED-CONSTANT-LIST", 1, 0, false);
        declareFunction("v_colour_sorted_nat_list", "V-COLOUR-SORTED-NAT-LIST", 1, 0, false);
        declareFunction("v_colour_sorted_assertion_list", "V-COLOUR-SORTED-ASSERTION-LIST", 1, 0, false);
        declareFunction("v_colour_list_structure", "V-COLOUR-LIST-STRUCTURE", 1, 0, false);
        declareFunction("v_colour_sorted_var_positions", "V-COLOUR-SORTED-VAR-POSITIONS", 1, 0, false);
        declareFunction("_csetf_v_colour_sorted_constant_list", "_CSETF-V-COLOUR-SORTED-CONSTANT-LIST", 2, 0, false);
        declareFunction("_csetf_v_colour_sorted_nat_list", "_CSETF-V-COLOUR-SORTED-NAT-LIST", 2, 0, false);
        declareFunction("_csetf_v_colour_sorted_assertion_list", "_CSETF-V-COLOUR-SORTED-ASSERTION-LIST", 2, 0, false);
        declareFunction("_csetf_v_colour_list_structure", "_CSETF-V-COLOUR-LIST-STRUCTURE", 2, 0, false);
        declareFunction("_csetf_v_colour_sorted_var_positions", "_CSETF-V-COLOUR-SORTED-VAR-POSITIONS", 2, 0, false);
        declareFunction("make_v_colour", "MAKE-V-COLOUR", 0, 1, false);
        declareFunction("visit_defstruct_v_colour", "VISIT-DEFSTRUCT-V-COLOUR", 2, 0, false);
        declareFunction("visit_defstruct_object_v_colour_method", "VISIT-DEFSTRUCT-OBJECT-V-COLOUR-METHOD", 2, 0, false);
        declareFunction("v_colour_as_list", "V-COLOUR-AS-LIST", 1, 0, false);
        declareFunction("v_colour_min", "V-COLOUR-MIN", 1, 0, false);
        declareFunction("arc_print_function_trampoline", "ARC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("arc_p", "ARC-P", 1, 0, false);
        new czer_graph.$arc_p$UnaryFunction();
        declareFunction("arc_head", "ARC-HEAD", 1, 0, false);
        declareFunction("arc_colour", "ARC-COLOUR", 1, 0, false);
        declareFunction("_csetf_arc_head", "_CSETF-ARC-HEAD", 2, 0, false);
        declareFunction("_csetf_arc_colour", "_CSETF-ARC-COLOUR", 2, 0, false);
        declareFunction("make_arc", "MAKE-ARC", 0, 1, false);
        declareFunction("visit_defstruct_arc", "VISIT-DEFSTRUCT-ARC", 2, 0, false);
        declareFunction("visit_defstruct_object_arc_method", "VISIT-DEFSTRUCT-OBJECT-ARC-METHOD", 2, 0, false);
        declareFunction("print_arc", "PRINT-ARC", 3, 0, false);
        declareFunction("new_arc", "NEW-ARC", 2, 0, false);
        declareFunction("arc_as_sortable_list", "ARC-AS-SORTABLE-LIST", 1, 0, false);
        declareFunction("arc_as_unifiable_list", "ARC-AS-UNIFIABLE-LIST", 1, 0, false);
        declareFunction("colour_arc", "COLOUR-ARC", 3, 0, false);
        declareFunction("vertex_print_function_trampoline", "VERTEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("vertex_p", "VERTEX-P", 1, 0, false);
        new czer_graph.$vertex_p$UnaryFunction();
        declareFunction("vertex_id", "VERTEX-ID", 1, 0, false);
        declareFunction("vertex_colour", "VERTEX-COLOUR", 1, 0, false);
        declareFunction("vertex_arc_set", "VERTEX-ARC-SET", 1, 0, false);
        declareFunction("_csetf_vertex_id", "_CSETF-VERTEX-ID", 2, 0, false);
        declareFunction("_csetf_vertex_colour", "_CSETF-VERTEX-COLOUR", 2, 0, false);
        declareFunction("_csetf_vertex_arc_set", "_CSETF-VERTEX-ARC-SET", 2, 0, false);
        declareFunction("make_vertex", "MAKE-VERTEX", 0, 1, false);
        declareFunction("visit_defstruct_vertex", "VISIT-DEFSTRUCT-VERTEX", 2, 0, false);
        declareFunction("visit_defstruct_object_vertex_method", "VISIT-DEFSTRUCT-OBJECT-VERTEX-METHOD", 2, 0, false);
        declareFunction("print_vertex", "PRINT-VERTEX", 3, 0, false);
        declareFunction("find_vertex_by_id", "FIND-VERTEX-BY-ID", 2, 0, false);
        declareFunction("vertex_as_sortable_list", "VERTEX-AS-SORTABLE-LIST", 1, 0, false);
        declareFunction("vertex_as_unifiable_list", "VERTEX-AS-UNIFIABLE-LIST", 1, 0, false);
        declareFunction("vertex_first_half_as_sortable_list", "VERTEX-FIRST-HALF-AS-SORTABLE-LIST", 1, 0, false);
        declareFunction("vertex_first_half_as_unifiable_list", "VERTEX-FIRST-HALF-AS-UNIFIABLE-LIST", 1, 0, false);
        declareFunction("vertex_second_half_as_sortable_set", "VERTEX-SECOND-HALF-AS-SORTABLE-SET", 1, 0, false);
        declareFunction("vertex_second_half_as_unifiable_set", "VERTEX-SECOND-HALF-AS-UNIFIABLE-SET", 1, 0, false);
        declareFunction("vertex_add_arc", "VERTEX-ADD-ARC", 3, 0, false);
        declareFunction("colour_vertex", "COLOUR-VERTEX", 2, 0, false);
        declareFunction("new_vertex", "NEW-VERTEX", 3, 0, false);
        declareFunction("graph_search_node_print_function_trampoline", "GRAPH-SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("graph_search_node_p", "GRAPH-SEARCH-NODE-P", 1, 0, false);
        new czer_graph.$graph_search_node_p$UnaryFunction();
        declareFunction("graph_search_node_vertex", "GRAPH-SEARCH-NODE-VERTEX", 1, 0, false);
        declareFunction("graph_search_node_search_history", "GRAPH-SEARCH-NODE-SEARCH-HISTORY", 1, 0, false);
        declareFunction("_csetf_graph_search_node_vertex", "_CSETF-GRAPH-SEARCH-NODE-VERTEX", 2, 0, false);
        declareFunction("_csetf_graph_search_node_search_history", "_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY", 2, 0, false);
        declareFunction("make_graph_search_node", "MAKE-GRAPH-SEARCH-NODE", 0, 1, false);
        declareFunction("visit_defstruct_graph_search_node", "VISIT-DEFSTRUCT-GRAPH-SEARCH-NODE", 2, 0, false);
        declareFunction("visit_defstruct_object_graph_search_node_method", "VISIT-DEFSTRUCT-OBJECT-GRAPH-SEARCH-NODE-METHOD", 2, 0, false);
        declareFunction("print_graph_search_node", "PRINT-GRAPH-SEARCH-NODE", 3, 0, false);
        declareFunction("inert_variable", "INERT-VARIABLE", 1, 0, false);
        declareFunction("graph_search_node_as_sortable_sets", "GRAPH-SEARCH-NODE-AS-SORTABLE-SETS", 1, 0, false);
        declareFunction("graph_search_node_as_unifiable_sets", "GRAPH-SEARCH-NODE-AS-UNIFIABLE-SETS", 1, 0, false);
        declareFunction("unify_graph_search_node", "UNIFY-GRAPH-SEARCH-NODE", 2, 0, false);
        declareFunction("graph_search_nodes_isomorphicP", "GRAPH-SEARCH-NODES-ISOMORPHIC?", 2, 0, false);
        declareFunction("graph_search_node_L", "GRAPH-SEARCH-NODE-<", 2, 0, false);
        declareFunction("min_graph_search_node", "MIN-GRAPH-SEARCH-NODE", 1, 0, false);
        declareFunction("vertex_search_state_as_unifiable_sets_of_sets", "VERTEX-SEARCH-STATE-AS-UNIFIABLE-SETS-OF-SETS", 1, 0, false);
        declareFunction("vertex_search_state_as_sortable_sets_of_sets", "VERTEX-SEARCH-STATE-AS-SORTABLE-SETS-OF-SETS", 1, 0, false);
        declareFunction("unify_vertex_search_state", "UNIFY-VERTEX-SEARCH-STATE", 2, 0, false);
        declareFunction("vertex_search_states_isomorphicP", "VERTEX-SEARCH-STATES-ISOMORPHIC?", 2, 0, false);
        declareFunction("vertex_search_state_L", "VERTEX-SEARCH-STATE-<", 2, 0, false);
        declareFunction("min_vertex_search_state", "MIN-VERTEX-SEARCH-STATE", 2, 0, false);
        declareFunction("source_vertex", "SOURCE-VERTEX", 1, 0, false);
        declareFunction("init_graph_search_state", "INIT-GRAPH-SEARCH-STATE", 1, 0, false);
        declareFunction("graph_search_state_covers_graphP", "GRAPH-SEARCH-STATE-COVERS-GRAPH?", 2, 0, false);
        declareFunction("least_vertex", "LEAST-VERTEX", 1, 1, false);
        declareFunction("least_vertex_recursive", "LEAST-VERTEX-RECURSIVE", 3, 0, false);
        declareFunction("penultimate_resort_literals", "PENULTIMATE-RESORT-LITERALS", 1, 0, false);
        declareFunction("guid_tree_L", "GUID-TREE-<", 2, 0, false);
        declareFunction("safe_guidL", "SAFE-GUID<", 2, 0, false);
        declareFunction("safe_guidE", "SAFE-GUID=", 2, 0, false);
        declareFunction("last_resort_literal", "LAST-RESORT-LITERAL", 2, 0, false);
        declareFunction("compute_sorted_shared_vars", "COMPUTE-SORTED-SHARED-VARS", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("SORTED-CONSTANT-LIST"), makeSymbol("SORTED-NAT-LIST"), makeSymbol("SORTED-ASSERTION-LIST"), makeSymbol("LIST-STRUCTURE"), makeSymbol("SORTED-VAR-POSITIONS"));

    static private final SubLList $list_alt3 = list(makeKeyword("SORTED-CONSTANT-LIST"), makeKeyword("SORTED-NAT-LIST"), makeKeyword("SORTED-ASSERTION-LIST"), makeKeyword("LIST-STRUCTURE"), makeKeyword("SORTED-VAR-POSITIONS"));

    static private final SubLList $list_alt4 = list(makeSymbol("V-COLOUR-SORTED-CONSTANT-LIST"), makeSymbol("V-COLOUR-SORTED-NAT-LIST"), makeSymbol("V-COLOUR-SORTED-ASSERTION-LIST"), makeSymbol("V-COLOUR-LIST-STRUCTURE"), makeSymbol("V-COLOUR-SORTED-VAR-POSITIONS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-V-COLOUR-SORTED-CONSTANT-LIST"), makeSymbol("_CSETF-V-COLOUR-SORTED-NAT-LIST"), makeSymbol("_CSETF-V-COLOUR-SORTED-ASSERTION-LIST"), makeSymbol("_CSETF-V-COLOUR-LIST-STRUCTURE"), makeSymbol("_CSETF-V-COLOUR-SORTED-VAR-POSITIONS"));

    static private final SubLString $str_alt23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt27 = list(makeSymbol("HEAD"), makeSymbol("COLOUR"));

    static private final SubLList $list_alt28 = list($HEAD, makeKeyword("COLOUR"));

    static private final SubLList $list_alt29 = list(makeSymbol("ARC-HEAD"), makeSymbol("ARC-COLOUR"));

    static private final SubLList $list_alt30 = list(makeSymbol("_CSETF-ARC-HEAD"), makeSymbol("_CSETF-ARC-COLOUR"));

    static private final SubLString $str_alt39$__ARC__a_ = makeString("#<ARC:~a>");

    static private final SubLList $list_alt43 = list(makeSymbol("ID"), makeSymbol("COLOUR"), makeSymbol("ARC-SET"));

    static private final SubLList $list_alt44 = list(makeKeyword("ID"), makeKeyword("COLOUR"), makeKeyword("ARC-SET"));

    static private final SubLList $list_alt45 = list(makeSymbol("VERTEX-ID"), makeSymbol("VERTEX-COLOUR"), makeSymbol("VERTEX-ARC-SET"));

    static private final SubLList $list_alt46 = list(makeSymbol("_CSETF-VERTEX-ID"), makeSymbol("_CSETF-VERTEX-COLOUR"), makeSymbol("_CSETF-VERTEX-ARC-SET"));

    public static SubLObject init_czer_graph_file() {
        defconstant("*DTP-V-COLOUR*", V_COLOUR);
        defconstant("*DTP-ARC*", ARC);
        defconstant("*DTP-VERTEX*", VERTEX);
        defconstant("*DTP-GRAPH-SEARCH-NODE*", GRAPH_SEARCH_NODE);
        return NIL;
    }

    public static SubLObject setup_czer_graph_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_v_colour$.getGlobalValue(), symbol_function(V_COLOUR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(V_COLOUR_SORTED_CONSTANT_LIST, _CSETF_V_COLOUR_SORTED_CONSTANT_LIST);
        def_csetf(V_COLOUR_SORTED_NAT_LIST, _CSETF_V_COLOUR_SORTED_NAT_LIST);
        def_csetf(V_COLOUR_SORTED_ASSERTION_LIST, _CSETF_V_COLOUR_SORTED_ASSERTION_LIST);
        def_csetf(V_COLOUR_LIST_STRUCTURE, _CSETF_V_COLOUR_LIST_STRUCTURE);
        def_csetf(V_COLOUR_SORTED_VAR_POSITIONS, _CSETF_V_COLOUR_SORTED_VAR_POSITIONS);
        identity(V_COLOUR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_v_colour$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_V_COLOUR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_arc$.getGlobalValue(), symbol_function(ARC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list39);
        def_csetf(ARC_HEAD, _CSETF_ARC_HEAD);
        def_csetf(ARC_COLOUR, _CSETF_ARC_COLOUR);
        identity(ARC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arc$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ARC_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_vertex$.getGlobalValue(), symbol_function(VERTEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list58);
        def_csetf(VERTEX_ID, _CSETF_VERTEX_ID);
        def_csetf(VERTEX_COLOUR, _CSETF_VERTEX_COLOUR);
        def_csetf(VERTEX_ARC_SET, _CSETF_VERTEX_ARC_SET);
        identity(VERTEX);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_vertex$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VERTEX_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_graph_search_node$.getGlobalValue(), symbol_function(GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list84);
        def_csetf(GRAPH_SEARCH_NODE_VERTEX, _CSETF_GRAPH_SEARCH_NODE_VERTEX);
        def_csetf(GRAPH_SEARCH_NODE_SEARCH_HISTORY, _CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY);
        identity(GRAPH_SEARCH_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_graph_search_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GRAPH_SEARCH_NODE_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt57$__VERTEX__a_ = makeString("#<VERTEX:~a>");

    static private final SubLString $str_alt58$vertex_number__a_not_found = makeString("vertex number ~a not found");

    static private final SubLList $list_alt66 = list(makeSymbol("VERTEX"), makeSymbol("SEARCH-HISTORY"));

    static private final SubLList $list_alt67 = list(makeKeyword("VERTEX"), makeKeyword("SEARCH-HISTORY"));

    static private final SubLList $list_alt68 = list(makeSymbol("GRAPH-SEARCH-NODE-VERTEX"), makeSymbol("GRAPH-SEARCH-NODE-SEARCH-HISTORY"));

    static private final SubLList $list_alt69 = list(makeSymbol("_CSETF-GRAPH-SEARCH-NODE-VERTEX"), makeSymbol("_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY"));

    static private final SubLString $str_alt78$__NODE__s__s_ = makeString("#<NODE:~s ~s>");

    static private final SubLSymbol $sym79$EL_VAR_ = makeSymbol("EL-VAR?");

    @Override
    public void declareFunctions() {
        declare_czer_graph_file();
    }

    static private final SubLString $str_alt83$graph_search_node___failed_to_com = makeString("graph-search-node-< failed to compare nodes ~%~s and ~%~s");

    @Override
    public void initializeVariables() {
        init_czer_graph_file();
    }

    static private final SubLSymbol $sym84$GRAPH_SEARCH_NODE__ = makeSymbol("GRAPH-SEARCH-NODE-<");

    @Override
    public void runTopLevelForms() {
        setup_czer_graph_file();
    }

    static private final SubLString $str_alt85$min_graph_search_node_failed_on_n = makeString("min-graph-search-node failed on nodes ~s");

    

    static private final SubLSymbol $sym88$VERTEX_SEARCH_STATE__ = makeSymbol("VERTEX-SEARCH-STATE-<");

    private static final SubLSymbol SORTED_CONSTANT_INTERNAL_ID_LIST = makeSymbol("SORTED-CONSTANT-INTERNAL-ID-LIST");

    static private final SubLSymbol $sym90$TREE__ = makeSymbol("TREE-<");

    public static final class $v_colour_p$UnaryFunction extends UnaryFunction {
        public $v_colour_p$UnaryFunction() {
            super(extractFunctionNamed("V-COLOUR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return v_colour_p(arg1);
        }
    }

    public static final class $arc_native extends SubLStructNative {
        public SubLObject $head;

        public SubLObject $colour;

        private static final SubLStructDeclNative structDecl;

        public $arc_native() {
            czer_graph.$arc_native.this.$head = Lisp.NIL;
            czer_graph.$arc_native.this.$colour = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return czer_graph.$arc_native.this.$head;
        }

        @Override
        public SubLObject getField3() {
            return czer_graph.$arc_native.this.$colour;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return czer_graph.$arc_native.this.$head = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return czer_graph.$arc_native.this.$colour = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.czer_graph.$arc_native.class, ARC, ARC_P, $list33, $list34, new String[]{ "$head", "$colour" }, $list35, $list36, PRINT_ARC);
        }
    }

    public static final class $arc_p$UnaryFunction extends UnaryFunction {
        public $arc_p$UnaryFunction() {
            super(extractFunctionNamed("ARC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return arc_p(arg1);
        }
    }

    public static final class $vertex_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $colour;

        public SubLObject $arc_set;

        private static final SubLStructDeclNative structDecl;

        public $vertex_native() {
            czer_graph.$vertex_native.this.$id = Lisp.NIL;
            czer_graph.$vertex_native.this.$colour = Lisp.NIL;
            czer_graph.$vertex_native.this.$arc_set = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return czer_graph.$vertex_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return czer_graph.$vertex_native.this.$colour;
        }

        @Override
        public SubLObject getField4() {
            return czer_graph.$vertex_native.this.$arc_set;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return czer_graph.$vertex_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return czer_graph.$vertex_native.this.$colour = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return czer_graph.$vertex_native.this.$arc_set = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.czer_graph.$vertex_native.class, VERTEX, VERTEX_P, $list52, $list53, new String[]{ "$id", "$colour", "$arc_set" }, $list54, $list55, PRINT_VERTEX);
        }
    }

    public static final class $vertex_p$UnaryFunction extends UnaryFunction {
        public $vertex_p$UnaryFunction() {
            super(extractFunctionNamed("VERTEX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return vertex_p(arg1);
        }
    }

    public static final class $graph_search_node_native extends SubLStructNative {
        public SubLObject $vertex;

        public SubLObject $search_history;

        private static final SubLStructDeclNative structDecl;

        public $graph_search_node_native() {
            czer_graph.$graph_search_node_native.this.$vertex = Lisp.NIL;
            czer_graph.$graph_search_node_native.this.$search_history = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return czer_graph.$graph_search_node_native.this.$vertex;
        }

        @Override
        public SubLObject getField3() {
            return czer_graph.$graph_search_node_native.this.$search_history;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return czer_graph.$graph_search_node_native.this.$vertex = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return czer_graph.$graph_search_node_native.this.$search_history = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.czer_graph.$graph_search_node_native.class, GRAPH_SEARCH_NODE, GRAPH_SEARCH_NODE_P, $list78, $list79, new String[]{ "$vertex", "$search_history" }, $list80, $list81, PRINT_GRAPH_SEARCH_NODE);
        }
    }

    public static final class $graph_search_node_p$UnaryFunction extends UnaryFunction {
        public $graph_search_node_p$UnaryFunction() {
            super(extractFunctionNamed("GRAPH-SEARCH-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return graph_search_node_p(arg1);
        }
    }
}

/**
 * Total time: 298 ms
 */
