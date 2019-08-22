/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.function_terms.naut_to_nart;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.obsolete.cnat_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_dictionary_iterator;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_iterator;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_null_iterator;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_doneP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_finalize;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_next;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-LINK-ITERATORS
 * source file: /cyc/top/cycl/sbhl/sbhl-link-iterators.lisp
 * created:     2019/07/03 17:37:19
 */
public final class sbhl_link_iterators extends SubLTranslatedFile implements V12 {
    public static final class $sbhl_module_tv_link_node_search_state_iterator_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$tv_link_iterator;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$current_tv;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$current_remaining_nodes;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$module;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$parent_node;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$direction;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$mt;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$genl_inverse_modeP;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$tv_link_iterator = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$current_tv = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$current_remaining_nodes = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$module = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$parent_node = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$direction = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$mt = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.this.$genl_inverse_modeP = value;
        }

        public SubLObject $tv_link_iterator = Lisp.NIL;

        public SubLObject $current_tv = Lisp.NIL;

        public SubLObject $current_remaining_nodes = Lisp.NIL;

        public SubLObject $module = Lisp.NIL;

        public SubLObject $parent_node = Lisp.NIL;

        public SubLObject $direction = Lisp.NIL;

        public SubLObject $mt = Lisp.NIL;

        public SubLObject $genl_inverse_modeP = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.class, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list_alt59, $list_alt60, new String[]{ "$tv_link_iterator", "$current_tv", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$genl_inverse_modeP" }, $list_alt61, $list_alt62, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // Definitions
    public static final class $sbhl_link_node_search_state_iterator_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.this.$sbhl_link_node_search_state;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.this.$remaining_modules;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.this.$module_node_search_state_iterator;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.this.$sbhl_link_node_search_state = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.this.$remaining_modules = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.this.$module_node_search_state_iterator = value;
        }

        public SubLObject $sbhl_link_node_search_state = Lisp.NIL;

        public SubLObject $remaining_modules = Lisp.NIL;

        public SubLObject $module_node_search_state_iterator = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.class, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list_alt2, $list_alt3, new String[]{ "$sbhl_link_node_search_state", "$remaining_modules", "$module_node_search_state_iterator" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new sbhl_link_iterators();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_link_node_search_state_iterator_state$ = makeSymbol("*DTP-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_module_direction_link_search_state_iterator_state$ = makeSymbol("*DTP-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_module_tv_link_node_search_state_iterator_state$ = makeSymbol("*DTP-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sbhl_module_naut_link_node_search_state_iterator_state$ = makeSymbol("*DTP-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_link_node_search_state_iterator_state_store$ = makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_module_direction_link_search_state_iterator_state_store$ = makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_module_tv_link_node_search_state_iterator_state_store$ = makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_module_naut_link_node_search_state_iterator_state_store$ = makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_link_iterator_resourcingP$ = makeSymbol("*SBHL-LINK-ITERATOR-RESOURCING?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P");

    static private final SubLList $list2 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("REMAINING-MODULES"), makeSymbol("MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLList $list3 = list(makeKeyword("SBHL-LINK-NODE-SEARCH-STATE"), makeKeyword("REMAINING-MODULES"), makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLList $list4 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLSymbol $sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P"));

    private static final SubLSymbol $sym9$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_ = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE");

    private static final SubLSymbol $sym10$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_ = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES");

    private static final SubLSymbol $sym12$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES");

    private static final SubLSymbol $sym13$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR");

    private static final SubLSymbol $sym14$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR");

    private static final SubLSymbol $SBHL_LINK_NODE_SEARCH_STATE = makeKeyword("SBHL-LINK-NODE-SEARCH-STATE");

    private static final SubLSymbol $MODULE_NODE_SEARCH_STATE_ITERATOR = makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("MAKE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLString $str28$_a_is_neither_an_SBHL_node__FORT_ = makeString("~a is neither an SBHL node (FORT) nor a NAUT.  Returning a null-iterator.");

    private static final SubLString $str29$No__a_direction_links_for__a_with = makeString("No ~a direction links for ~a with module ~a.  Returning a null-iterator.");

    private static final SubLString $str30$No_generating_functions_for_direc = makeString("No generating functions for direction ~a, TV ~a, and module ~a.  Returning a null-iterator.");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P");

    private static final SubLList $list33 = list(makeSymbol("MT-LINK-ITERATOR"), makeSymbol("TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("GRAPH-LINK"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("GENL-INVERSE-MODE?"));

    private static final SubLList $list34 = list(makeKeyword("MT-LINK-ITERATOR"), makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR"), makeKeyword("GRAPH-LINK"), makeKeyword("MODULE"), $NODE, makeKeyword("DIRECTION"), makeKeyword("GENL-INVERSE-MODE?"));

    private static final SubLList $list35 = list(makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    private static final SubLList $list36 = list(makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    private static final SubLSymbol $sym37$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list38 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P"));

    private static final SubLSymbol $sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR");

    private static final SubLSymbol $sym40$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_ = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR");

    private static final SubLSymbol $sym41$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR");

    private static final SubLSymbol $sym42$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_ = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK");

    private static final SubLSymbol $sym44$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE");

    private static final SubLSymbol $sym46$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE");

    private static final SubLSymbol $sym48$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    private static final SubLSymbol $sym50$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    private static final SubLSymbol $sym51$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $sym52$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $MT_LINK_ITERATOR = makeKeyword("MT-LINK-ITERATOR");

    private static final SubLSymbol $TV_LINK_SEARCH_STATE_ITERATOR = makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR");

    private static final SubLSymbol $kw59$GENL_INVERSE_MODE_ = makeKeyword("GENL-INVERSE-MODE?");

    private static final SubLSymbol MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE = makeSymbol("MAKE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_IT = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-METHOD");

    static private final SubLList $list62 = list(makeSymbol("MT"), makeSymbol("TV-LINKS"));

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P");

    private static final SubLList $list68 = list(makeSymbol("TV-LINK-ITERATOR"), makeSymbol("CURRENT-TV"), makeSymbol("CURRENT-REMAINING-NODES"), makeSymbol("MODULE"), makeSymbol("PARENT-NODE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("GENL-INVERSE-MODE?"));

    private static final SubLList $list69 = list(makeKeyword("TV-LINK-ITERATOR"), makeKeyword("CURRENT-TV"), makeKeyword("CURRENT-REMAINING-NODES"), makeKeyword("MODULE"), makeKeyword("PARENT-NODE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("GENL-INVERSE-MODE?"));

    private static final SubLList $list70 = list(makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    private static final SubLList $list71 = list(makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    private static final SubLSymbol $sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list73 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P"));

    private static final SubLSymbol $sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR");

    private static final SubLSymbol $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV");

    private static final SubLSymbol $sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV");

    private static final SubLSymbol $sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    private static final SubLSymbol $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");

    private static final SubLSymbol $sym81$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    private static final SubLSymbol $sym83$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    private static final SubLSymbol $sym85$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");

    private static final SubLSymbol _CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");

    private static final SubLSymbol $sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $sym89$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_ = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $TV_LINK_ITERATOR = makeKeyword("TV-LINK-ITERATOR");

    private static final SubLSymbol $CURRENT_REMAINING_NODES = makeKeyword("CURRENT-REMAINING-NODES");

    private static final SubLSymbol MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("MAKE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol $sym96$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITER = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD");

    private static final SubLList $list97 = list(makeSymbol("TV"), makeSymbol("LINKS"));

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P");

    private static final SubLList $list103 = list(new SubLObject[]{ makeSymbol("GENERATING-FUNCTIONS"), makeSymbol("CURRENT-GENERATING-FUNCTION"), makeSymbol("CURRENT-REMAINING-NODES"), makeSymbol("MODULE"), makeSymbol("PARENT-NODE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("GENL-INVERSE-MODE?") });

    private static final SubLList $list104 = list(new SubLObject[]{ makeKeyword("GENERATING-FUNCTIONS"), makeKeyword("CURRENT-GENERATING-FUNCTION"), makeKeyword("CURRENT-REMAINING-NODES"), makeKeyword("MODULE"), makeKeyword("PARENT-NODE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("TV"), makeKeyword("GENL-INVERSE-MODE?") });

    private static final SubLList $list105 = list(new SubLObject[]{ makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?") });

    private static final SubLList $list106 = list(new SubLObject[]{ makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?") });

    private static final SubLSymbol $sym107$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list108 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P"));

    private static final SubLSymbol $sym109$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS");

    private static final SubLSymbol $sym110$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS");

    private static final SubLSymbol $sym111$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION");

    private static final SubLSymbol $sym112$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION");

    private static final SubLSymbol $sym113$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    private static final SubLSymbol $sym114$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");

    private static final SubLSymbol $sym116$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");

    private static final SubLSymbol $sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    private static final SubLSymbol $sym118$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    private static final SubLSymbol $sym120$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");

    private static final SubLSymbol _CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV");

    private static final SubLSymbol _CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV");

    private static final SubLSymbol $sym125$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $sym126$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    private static final SubLSymbol $CURRENT_GENERATING_FUNCTION = makeKeyword("CURRENT-GENERATING-FUNCTION");

    private static final SubLSymbol MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("MAKE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");

    private static final SubLSymbol $sym131$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_IT = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLList $list136 = list(list(makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-LINK-ITERATOR-RESOURCING?*"), T));

    private static final SubLSymbol WITH_SBHL_ITERATOR_RESOURCING = makeSymbol("WITH-SBHL-ITERATOR-RESOURCING");

    private static final SubLSymbol WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING = makeSymbol("WITH-SBHL-LINK-ITERATOR-STATE-RESOURCING");

    public static final SubLObject sbhl_link_node_search_state_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_link_node_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_link_node_search_state_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_state_remaining_modules_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_link_node_search_state_iterator_state_remaining_modules(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_iterator_state_remaining_modules_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_sbhl_link_node_search_state_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SBHL_LINK_NODE_SEARCH_STATE)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(v_new, current_value);
                    } else {
                        if (pcase_var.eql($REMAINING_MODULES)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MODULE_NODE_SEARCH_STATE_ITERATOR)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(v_new, current_value);
                            } else {
                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sbhl_link_node_search_state_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(sbhl_link_iterators.$SBHL_LINK_NODE_SEARCH_STATE)) {
                sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(v_new, current_value);
            } else
                if (pcase_var.eql($REMAINING_MODULES)) {
                    sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(v_new, current_value);
                } else
                    if (pcase_var.eql(sbhl_link_iterators.$MODULE_NODE_SEARCH_STATE_ITERATOR)) {
                        sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(v_new, current_value);
                    } else {
                        Errors.error(sbhl_link_iterators.$str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_link_node_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_link_iterators.MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$SBHL_LINK_NODE_SEARCH_STATE, sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(obj));
        funcall(visitor_fn, obj, $SLOT, $REMAINING_MODULES, sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_remaining_modules(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$MODULE_NODE_SEARCH_STATE_ITERATOR, sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(obj));
        funcall(visitor_fn, obj, $END, sbhl_link_iterators.MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_link_node_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_link_iterators.visit_defstruct_sbhl_link_node_search_state_iterator_state(obj, visitor_fn);
    }

    public static final SubLObject generate_new_sbhl_link_node_search_state_iterator_state_alt(SubLObject sbhl_link_node_search_state) {
        {
            SubLObject state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_or_create_sbhl_link_node_search_state_iterator_state();
            SubLObject module = sbhl_search_datastructures.get_sbhl_link_node_search_state_module(sbhl_link_node_search_state);
            SubLObject accessible_link_preds = sbhl_module_utilities.get_sbhl_accessible_link_preds(module);
            SubLObject first_module = (NIL != accessible_link_preds) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module(accessible_link_preds.first()))) : module;
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(state, sbhl_link_node_search_state);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(state, NIL != accessible_link_preds ? ((SubLObject) (Mapping.mapcar(GET_SBHL_MODULE, accessible_link_preds.rest()))) : NIL);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state, com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_sbhl_module_link_node_search_state_iterator(first_module, sbhl_link_node_search_state));
            return state;
        }
    }

    public static SubLObject generate_new_sbhl_link_node_search_state_iterator_state(final SubLObject sbhl_link_node_search_state) {
        final SubLObject state = sbhl_link_iterators.find_or_create_sbhl_link_node_search_state_iterator_state();
        final SubLObject module = sbhl_search_datastructures.get_sbhl_link_node_search_state_module(sbhl_link_node_search_state);
        final SubLObject accessible_link_preds = sbhl_module_utilities.get_sbhl_accessible_link_preds(module);
        final SubLObject first_module = (NIL != accessible_link_preds) ? sbhl_module_vars.get_sbhl_module(accessible_link_preds.first()) : module;
        sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(state, sbhl_link_node_search_state);
        sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(state, NIL != accessible_link_preds ? Mapping.mapcar(GET_SBHL_MODULE, accessible_link_preds.rest()) : NIL);
        sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state, sbhl_link_iterators.new_sbhl_module_link_node_search_state_iterator(first_module, sbhl_link_node_search_state));
        return state;
    }

    public static final SubLObject get_sbhl_link_node_search_state_iterator_state_next_module_alt(SubLObject state) {
        {
            SubLObject remaining_modules = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_remaining_modules(state);
            if (NIL != remaining_modules) {
                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(state, remaining_modules.rest());
            }
            return remaining_modules.first();
        }
    }

    public static SubLObject get_sbhl_link_node_search_state_iterator_state_next_module(final SubLObject state) {
        final SubLObject remaining_modules = sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_remaining_modules(state);
        if (NIL != remaining_modules) {
            sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(state, remaining_modules.rest());
        }
        return remaining_modules.first();
    }

    public static final SubLObject update_sbhl_link_node_search_state_iterator_state_alt(SubLObject state) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state)) {
            sbhl_iteration_finalize(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state));
        }
        {
            SubLObject next_module = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.get_sbhl_link_node_search_state_iterator_state_next_module(state);
            SubLObject iterator = NIL;
            if (NIL != next_module) {
                iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_sbhl_module_link_node_search_state_iterator(next_module, com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(state));
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state, iterator);
        }
        return state;
    }

    public static SubLObject update_sbhl_link_node_search_state_iterator_state(final SubLObject state) {
        if (NIL != sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state)) {
            sbhl_iteration_finalize(sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state));
        }
        final SubLObject next_module = sbhl_link_iterators.get_sbhl_link_node_search_state_iterator_state_next_module(state);
        SubLObject iterator = NIL;
        if (NIL != next_module) {
            iterator = sbhl_link_iterators.new_sbhl_module_link_node_search_state_iterator(next_module, sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(state));
        }
        sbhl_link_iterators._csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state, iterator);
        return state;
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_state_doneP_alt(SubLObject state) {
        return makeBoolean((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_remaining_modules(state)) && ((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state)) || (NIL != sbhl_iteration_doneP(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state)))));
    }

    public static SubLObject sbhl_link_node_search_state_iterator_state_doneP(final SubLObject state) {
        return makeBoolean((NIL == sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_remaining_modules(state)) && ((NIL == sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state)) || (NIL != sbhl_iteration_doneP(sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state)))));
    }

    public static final SubLObject new_sbhl_link_node_search_state_iterator_alt(SubLObject sbhl_search_state) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.generate_new_sbhl_link_node_search_state_iterator_state(sbhl_search_state), SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_link_node_search_state_iterator(final SubLObject sbhl_search_state) {
        return new_sbhl_iterator(sbhl_link_iterators.generate_new_sbhl_link_node_search_state_iterator_state(sbhl_search_state), sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_done_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_doneP(state);
    }

    public static SubLObject sbhl_link_node_search_state_iterator_done(final SubLObject state) {
        return sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_doneP(state);
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_next_alt(SubLObject state) {
        {
            SubLObject sbhl_link_node_search_state = NIL;
            SubLObject premature_haltP = NIL;
            while (!((NIL != sbhl_link_node_search_state) || (NIL != premature_haltP))) {
                sbhl_link_node_search_state = sbhl_iteration_next(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state));
                if (NIL == sbhl_link_node_search_state) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.update_sbhl_link_node_search_state_iterator_state(state);
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_doneP(state)) {
                        premature_haltP = T;
                    }
                }
            } 
            return sbhl_link_node_search_state;
        }
    }

    public static SubLObject sbhl_link_node_search_state_iterator_next(final SubLObject state) {
        SubLObject sbhl_link_node_search_state = NIL;
        SubLObject premature_haltP = NIL;
        while ((NIL == sbhl_link_node_search_state) && (NIL == premature_haltP)) {
            sbhl_link_node_search_state = sbhl_iteration_next(sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state));
            if (NIL == sbhl_link_node_search_state) {
                sbhl_link_iterators.update_sbhl_link_node_search_state_iterator_state(state);
                if (NIL == sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_doneP(state)) {
                    continue;
                }
                premature_haltP = T;
            }
        } 
        return sbhl_link_node_search_state;
    }

    public static final SubLObject sbhl_link_node_search_state_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject sbhl_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state);
            SubLObject result = makeBoolean((NIL == sbhl_iterator) || (NIL != sbhl_iteration_finalize(sbhl_iterator)));
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.release_sbhl_link_node_search_state_iterator_state(state);
            return result;
        }
    }

    public static SubLObject sbhl_link_node_search_state_iterator_finalize(final SubLObject state) {
        final SubLObject sbhl_iterator = sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(state);
        final SubLObject result = makeBoolean((NIL == sbhl_iterator) || (NIL != sbhl_iteration_finalize(sbhl_iterator)));
        sbhl_link_iterators.release_sbhl_link_node_search_state_iterator_state(state);
        return result;
    }

    public static final SubLObject new_sbhl_module_link_node_search_state_iterator_alt(SubLObject module, SubLObject sbhl_link_node_search_state) {
        {
            SubLObject node = function_terms.naut_to_nart(sbhl_search_datastructures.get_sbhl_link_node_search_state_node(sbhl_link_node_search_state));
            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_fort_sbhl_module_link_node_search_state_iterator(module, node, sbhl_link_node_search_state);
            } else {
                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_naut_sbhl_module_link_node_search_state_iterator(module, node, sbhl_link_node_search_state);
                } else {
                    sbhl_paranoia.sbhl_error(THREE_INTEGER, $str_alt22$_a_is_neither_an_SBHL_node__FORT_, node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return new_sbhl_null_iterator();
                }
            }
        }
    }

    public static SubLObject new_sbhl_module_link_node_search_state_iterator(final SubLObject module, final SubLObject sbhl_link_node_search_state) {
        final SubLObject node = naut_to_nart(sbhl_search_datastructures.get_sbhl_link_node_search_state_node(sbhl_link_node_search_state));
        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
            return sbhl_link_iterators.new_fort_sbhl_module_link_node_search_state_iterator(module, node, sbhl_link_node_search_state);
        }
        if (NIL != cnat_p(node, UNPROVIDED)) {
            return sbhl_link_iterators.new_naut_sbhl_module_link_node_search_state_iterator(module, node, sbhl_link_node_search_state);
        }
        sbhl_paranoia.sbhl_error(THREE_INTEGER, sbhl_link_iterators.$str28$_a_is_neither_an_SBHL_node__FORT_, node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return new_sbhl_null_iterator();
    }

    public static final SubLObject new_fort_sbhl_module_link_node_search_state_iterator_alt(SubLObject module, SubLObject node, SubLObject sbhl_link_node_search_state) {
        {
            SubLObject graph_link = sbhl_graphs.get_sbhl_graph_link(node, module);
            if (NIL != graph_link) {
                {
                    SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
                    SubLObject genl_inverse_modeP = (NIL != sbhl_search_vars.flip_genl_inverse_modeP(module, UNPROVIDED)) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state)))) : sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
                    return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_sbhl_module_direction_link_search_state_iterator(direction, graph_link, module, node, genl_inverse_modeP);
                }
            } else {
                {
                    SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt23$No__a_direction_links_for__a_with, direction, node, module, UNPROVIDED, UNPROVIDED);
                    return new_sbhl_null_iterator();
                }
            }
        }
    }

    public static SubLObject new_fort_sbhl_module_link_node_search_state_iterator(final SubLObject module, final SubLObject node, final SubLObject sbhl_link_node_search_state) {
        final SubLObject graph_link = sbhl_graphs.get_sbhl_graph_link(node, module);
        if (NIL != graph_link) {
            final SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
            final SubLObject genl_inverse_modeP = (NIL != sbhl_search_vars.flip_genl_inverse_modeP(module, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state)) : sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
            return sbhl_link_iterators.new_sbhl_module_direction_link_search_state_iterator(direction, graph_link, module, node, genl_inverse_modeP);
        }
        final SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
        sbhl_paranoia.sbhl_error(FIVE_INTEGER, sbhl_link_iterators.$str29$No__a_direction_links_for__a_with, direction, node, module, UNPROVIDED, UNPROVIDED);
        return new_sbhl_null_iterator();
    }

    public static final SubLObject new_naut_sbhl_module_link_node_search_state_iterator_alt(SubLObject module, SubLObject node, SubLObject sbhl_link_node_search_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
                SubLObject tv = sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread);
                SubLObject generating_functions = sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, tv, module);
                if (NIL != generating_functions) {
                    {
                        SubLObject mt = sbhl_search_datastructures.get_sbhl_link_node_search_state_mt(sbhl_link_node_search_state);
                        SubLObject genl_inverse_modeP = (NIL != sbhl_search_vars.flip_genl_inverse_modeP(module, UNPROVIDED)) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state)))) : sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
                        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_sbhl_module_naut_link_node_search_state_iterator(module, node, generating_functions, direction, mt, tv, genl_inverse_modeP);
                    }
                } else {
                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt24$No_generating_functions_for_direc, direction, tv, module, UNPROVIDED, UNPROVIDED);
                    return new_sbhl_null_iterator();
                }
            }
        }
    }

    public static SubLObject new_naut_sbhl_module_link_node_search_state_iterator(final SubLObject module, final SubLObject node, final SubLObject sbhl_link_node_search_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction(sbhl_link_node_search_state);
        final SubLObject tv = sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread);
        final SubLObject generating_functions = sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(direction, tv, module);
        if (NIL != generating_functions) {
            final SubLObject mt = sbhl_search_datastructures.get_sbhl_link_node_search_state_mt(sbhl_link_node_search_state);
            final SubLObject genl_inverse_modeP = (NIL != sbhl_search_vars.flip_genl_inverse_modeP(module, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state)) : sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(sbhl_link_node_search_state);
            return sbhl_link_iterators.new_sbhl_module_naut_link_node_search_state_iterator(module, node, generating_functions, direction, mt, tv, genl_inverse_modeP);
        }
        sbhl_paranoia.sbhl_error(FIVE_INTEGER, sbhl_link_iterators.$str30$No_generating_functions_for_direc, direction, tv, module, UNPROVIDED, UNPROVIDED);
        return new_sbhl_null_iterator();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_graph_link_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_graph_link(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_module(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_node(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_direction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_direction(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_direction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_sbhl_module_direction_link_search_state_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MT_LINK_ITERATOR)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TV_LINK_SEARCH_STATE_ITERATOR)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GRAPH_LINK)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MODULE)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_module(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($NODE)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_node(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DIRECTION)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_direction(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($kw52$GENL_INVERSE_MODE_)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                                            }
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

    public static SubLObject make_sbhl_module_direction_link_search_state_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(sbhl_link_iterators.$MT_LINK_ITERATOR)) {
                sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(v_new, current_value);
            } else
                if (pcase_var.eql(sbhl_link_iterators.$TV_LINK_SEARCH_STATE_ITERATOR)) {
                    sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(v_new, current_value);
                } else
                    if (pcase_var.eql($GRAPH_LINK)) {
                        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link(v_new, current_value);
                    } else
                        if (pcase_var.eql($MODULE)) {
                            sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_module(v_new, current_value);
                        } else
                            if (pcase_var.eql($NODE)) {
                                sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_node(v_new, current_value);
                            } else
                                if (pcase_var.eql($DIRECTION)) {
                                    sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_direction(v_new, current_value);
                                } else
                                    if (pcase_var.eql(sbhl_link_iterators.$kw59$GENL_INVERSE_MODE_)) {
                                        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(v_new, current_value);
                                    } else {
                                        Errors.error(sbhl_link_iterators.$str18$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_module_direction_link_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_link_iterators.MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$MT_LINK_ITERATOR, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$TV_LINK_SEARCH_STATE_ITERATOR, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH_LINK, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_graph_link(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_module(obj));
        funcall(visitor_fn, obj, $SLOT, $NODE, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_node(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_direction(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$kw59$GENL_INVERSE_MODE_, sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(obj));
        funcall(visitor_fn, obj, $END, sbhl_link_iterators.MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_module_direction_link_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_link_iterators.visit_defstruct_sbhl_module_direction_link_search_state_iterator_state(obj, visitor_fn);
    }

    public static final SubLObject generate_new_sbhl_module_direction_link_search_state_iterator_state_alt(SubLObject direction, SubLObject graph_link, SubLObject module, SubLObject node, SubLObject genl_inverse_modeP) {
        {
            SubLObject state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_or_create_sbhl_module_direction_link_search_state_iterator_state();
            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(graph_link, direction, module);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state, NIL != mt_links ? ((SubLObject) (new_sbhl_dictionary_iterator(mt_links))) : new_sbhl_null_iterator());
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state, new_sbhl_null_iterator());
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link(state, graph_link);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_module(state, module);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_node(state, node);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_direction(state, direction);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(state, genl_inverse_modeP);
            return state;
        }
    }

    public static SubLObject generate_new_sbhl_module_direction_link_search_state_iterator_state(final SubLObject direction, final SubLObject graph_link, final SubLObject module, final SubLObject node, final SubLObject genl_inverse_modeP) {
        final SubLObject state = sbhl_link_iterators.find_or_create_sbhl_module_direction_link_search_state_iterator_state();
        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(graph_link, direction, module);
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state, NIL != mt_links ? new_sbhl_dictionary_iterator(mt_links) : new_sbhl_null_iterator());
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state, new_sbhl_null_iterator());
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link(state, graph_link);
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_module(state, module);
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_node(state, node);
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_direction(state, direction);
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(state, genl_inverse_modeP);
        return state;
    }

    public static final SubLObject update_sbhl_module_direction_link_search_state_iterator_state_alt(SubLObject state) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)) {
            sbhl_iteration_finalize(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state));
        }
        {
            SubLObject mt_link_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state);
            SubLObject mt_link_pair = sbhl_iteration_next(mt_link_iterator);
            SubLObject new_tv_link_iterator = NIL;
            if (NIL != mt_link_pair) {
                {
                    SubLObject datum = mt_link_pair;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject tv_links = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    tv_links = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                            {
                                SubLObject module = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_module(state);
                                SubLObject node = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_node(state);
                                SubLObject direction = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_direction(state);
                                SubLObject genl_inverse_modeP = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(state);
                                new_tv_link_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.new_sbhl_module_tv_link_node_search_state_iterator(tv_links, module, node, direction, mt, genl_inverse_modeP);
                            }
                        } else {
                            new_tv_link_iterator = new_sbhl_null_iterator();
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt53);
                    }
                }
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state, new_tv_link_iterator);
        }
        return state;
    }

    public static SubLObject update_sbhl_module_direction_link_search_state_iterator_state(final SubLObject state) {
        if (NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)) {
            sbhl_iteration_finalize(sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state));
        }
        final SubLObject mt_link_iterator = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state);
        final SubLObject mt_link_pair = sbhl_iteration_next(mt_link_iterator);
        SubLObject new_tv_link_iterator = NIL;
        if (NIL != mt_link_pair) {
            SubLObject current;
            final SubLObject datum = current = mt_link_pair;
            SubLObject mt = NIL;
            SubLObject tv_links = NIL;
            destructuring_bind_must_consp(current, datum, sbhl_link_iterators.$list62);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, sbhl_link_iterators.$list62);
            tv_links = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != relevant_mtP(mt)) {
                    final SubLObject module = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_module(state);
                    final SubLObject node = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_node(state);
                    final SubLObject direction = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_direction(state);
                    final SubLObject genl_inverse_modeP = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(state);
                    new_tv_link_iterator = sbhl_link_iterators.new_sbhl_module_tv_link_node_search_state_iterator(tv_links, module, node, direction, mt, genl_inverse_modeP);
                } else {
                    new_tv_link_iterator = new_sbhl_null_iterator();
                }
            } else {
                cdestructuring_bind_error(datum, sbhl_link_iterators.$list62);
            }
        }
        sbhl_link_iterators._csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state, new_tv_link_iterator);
        return state;
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_doneP_alt(SubLObject state) {
        return makeBoolean((NIL != sbhl_iteration_doneP(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state))) && ((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)) || (NIL != sbhl_iteration_doneP(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)))));
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_doneP(final SubLObject state) {
        return makeBoolean((NIL != sbhl_iteration_doneP(sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state))) && ((NIL == sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)) || (NIL != sbhl_iteration_doneP(sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)))));
    }

    public static final SubLObject new_sbhl_module_direction_link_search_state_iterator_alt(SubLObject direction, SubLObject graph_link, SubLObject module, SubLObject node, SubLObject genl_inverse_modeP) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.generate_new_sbhl_module_direction_link_search_state_iterator_state(direction, graph_link, module, node, genl_inverse_modeP), SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT, SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_module_direction_link_search_state_iterator(final SubLObject direction, final SubLObject graph_link, final SubLObject module, final SubLObject node, final SubLObject genl_inverse_modeP) {
        return new_sbhl_iterator(sbhl_link_iterators.generate_new_sbhl_module_direction_link_search_state_iterator_state(direction, graph_link, module, node, genl_inverse_modeP), sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE, sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT, sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_done_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_doneP(state);
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_done(final SubLObject state) {
        return sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_doneP(state);
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_next_alt(SubLObject state) {
        {
            SubLObject search_state = NIL;
            SubLObject premature_haltP = NIL;
            while (!((NIL != search_state) || (NIL != premature_haltP))) {
                search_state = sbhl_iteration_next(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state));
                if (NIL == search_state) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.update_sbhl_module_direction_link_search_state_iterator_state(state);
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)) {
                        premature_haltP = T;
                    }
                }
            } 
            return search_state;
        }
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_next(final SubLObject state) {
        SubLObject search_state = NIL;
        SubLObject premature_haltP = NIL;
        while ((NIL == search_state) && (NIL == premature_haltP)) {
            search_state = sbhl_iteration_next(sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state));
            if (NIL == search_state) {
                sbhl_link_iterators.update_sbhl_module_direction_link_search_state_iterator_state(state);
                if (NIL != sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state)) {
                    continue;
                }
                premature_haltP = T;
            }
        } 
        return search_state;
    }

    public static final SubLObject sbhl_module_direction_link_search_state_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject mt_sbhl_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state);
            SubLObject tv_sbhl_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state);
            SubLObject result_mt = makeBoolean((NIL == mt_sbhl_iterator) || (NIL != sbhl_iteration_finalize(mt_sbhl_iterator)));
            SubLObject result_tv = makeBoolean((NIL == tv_sbhl_iterator) || (NIL != sbhl_iteration_finalize(tv_sbhl_iterator)));
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.release_sbhl_module_direction_link_search_state_iterator_state(state);
            return makeBoolean((NIL != result_mt) && (NIL != result_tv));
        }
    }

    public static SubLObject sbhl_module_direction_link_search_state_iterator_finalize(final SubLObject state) {
        final SubLObject mt_sbhl_iterator = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(state);
        final SubLObject tv_sbhl_iterator = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(state);
        final SubLObject result_mt = makeBoolean((NIL == mt_sbhl_iterator) || (NIL != sbhl_iteration_finalize(mt_sbhl_iterator)));
        final SubLObject result_tv = makeBoolean((NIL == tv_sbhl_iterator) || (NIL != sbhl_iteration_finalize(tv_sbhl_iterator)));
        sbhl_link_iterators.release_sbhl_module_direction_link_search_state_iterator_state(state);
        return makeBoolean((NIL != result_mt) && (NIL != result_tv));
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_current_tv_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_current_tv(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_module(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_parent_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_parent_node(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_direction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_direction(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_mt(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_sbhl_module_tv_link_node_search_state_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TV_LINK_ITERATOR)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CURRENT_TV)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CURRENT_REMAINING_NODES)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MODULE)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_module(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PARENT_NODE)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DIRECTION)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MT)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($kw52$GENL_INVERSE_MODE_)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_sbhl_module_tv_link_node_search_state_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql(sbhl_link_iterators.$TV_LINK_ITERATOR)) {
                sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(v_new, current_value);
            } else
                if (pcase_var.eql($CURRENT_TV)) {
                    sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(v_new, current_value);
                } else
                    if (pcase_var.eql(sbhl_link_iterators.$CURRENT_REMAINING_NODES)) {
                        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(v_new, current_value);
                    } else
                        if (pcase_var.eql($MODULE)) {
                            sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_module(v_new, current_value);
                        } else
                            if (pcase_var.eql($PARENT_NODE)) {
                                sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node(v_new, current_value);
                            } else
                                if (pcase_var.eql($DIRECTION)) {
                                    sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MT)) {
                                        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql(sbhl_link_iterators.$kw59$GENL_INVERSE_MODE_)) {
                                            sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(v_new, current_value);
                                        } else {
                                            Errors.error(sbhl_link_iterators.$str18$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_module_tv_link_node_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_link_iterators.MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$TV_LINK_ITERATOR, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_TV, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_tv(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$CURRENT_REMAINING_NODES, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_module(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_NODE, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_parent_node(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_direction(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_mt(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$kw59$GENL_INVERSE_MODE_, sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(obj));
        funcall(visitor_fn, obj, $END, sbhl_link_iterators.MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_module_tv_link_node_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_link_iterators.visit_defstruct_sbhl_module_tv_link_node_search_state_iterator_state(obj, visitor_fn);
    }

    public static final SubLObject generate_new_sbhl_module_tv_link_node_search_state_iterator_state_alt(SubLObject tv_links, SubLObject module, SubLObject parent_node, SubLObject direction, SubLObject mt, SubLObject genl_inverse_modeP) {
        {
            SubLObject state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_or_create_sbhl_module_tv_link_node_search_state_iterator_state();
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state, new_sbhl_dictionary_iterator(tv_links));
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(state, NIL);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state, NIL);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_module(state, module);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node(state, parent_node);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction(state, direction);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt(state, mt);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(state, genl_inverse_modeP);
            return state;
        }
    }

    public static SubLObject generate_new_sbhl_module_tv_link_node_search_state_iterator_state(final SubLObject tv_links, final SubLObject module, final SubLObject parent_node, final SubLObject direction, final SubLObject mt, final SubLObject genl_inverse_modeP) {
        final SubLObject state = sbhl_link_iterators.find_or_create_sbhl_module_tv_link_node_search_state_iterator_state();
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state, new_sbhl_dictionary_iterator(tv_links));
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(state, NIL);
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state, NIL);
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_module(state, module);
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node(state, parent_node);
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction(state, direction);
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt(state, mt);
        sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(state, genl_inverse_modeP);
        return state;
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_doneP_alt(SubLObject state) {
        return makeBoolean((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state)) && (NIL != sbhl_iteration_doneP(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state))));
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_doneP(final SubLObject state) {
        return makeBoolean((NIL == sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state)) && (NIL != sbhl_iteration_doneP(sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state))));
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state_alt(SubLObject state) {
        {
            SubLObject sbhl_link_node_search_state = NIL;
            while (!((NIL != sbhl_link_node_search_state) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_doneP(state)))) {
                {
                    SubLObject remaining_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state);
                    if (NIL != remaining_nodes) {
                        sbhl_link_node_search_state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(remaining_nodes.first(), state);
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state, remaining_nodes.rest());
                    } else {
                        {
                            SubLObject tv_link_pair = sbhl_iteration_next(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state));
                            if (NIL != tv_link_pair) {
                                {
                                    SubLObject datum = tv_link_pair;
                                    SubLObject current = datum;
                                    SubLObject tv = NIL;
                                    SubLObject links = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt85);
                                    tv = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt85);
                                    links = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(state, tv);
                                            sbhl_link_node_search_state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(links.first(), state);
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state, links.rest());
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt85);
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            return sbhl_link_node_search_state;
        }
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(final SubLObject state) {
        SubLObject sbhl_link_node_search_state = NIL;
        while ((NIL == sbhl_link_node_search_state) && (NIL == sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_doneP(state))) {
            final SubLObject remaining_nodes = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state);
            if (NIL != remaining_nodes) {
                sbhl_link_node_search_state = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(remaining_nodes.first(), state);
                sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state, remaining_nodes.rest());
            } else {
                final SubLObject tv_link_pair = sbhl_iteration_next(sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state));
                if (NIL == tv_link_pair) {
                    continue;
                }
                SubLObject current;
                final SubLObject datum = current = tv_link_pair;
                SubLObject tv = NIL;
                SubLObject links = NIL;
                destructuring_bind_must_consp(current, datum, sbhl_link_iterators.$list97);
                tv = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, sbhl_link_iterators.$list97);
                links = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                        continue;
                    }
                    sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(state, tv);
                    sbhl_link_node_search_state = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(links.first(), state);
                    sbhl_link_iterators._csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(state, links.rest());
                } else {
                    cdestructuring_bind_error(datum, sbhl_link_iterators.$list97);
                }
            }
        } 
        return sbhl_link_node_search_state;
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state_alt(SubLObject node, SubLObject state) {
        {
            SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_tv(state);
            SubLObject module = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_module(state);
            SubLObject parent_node = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_parent_node(state);
            SubLObject direction = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_direction(state);
            SubLObject mt = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_mt(state);
            SubLObject genl_inverse_modeP = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(state);
            return sbhl_search_datastructures.new_sbhl_link_node_search_state(node, module, direction, mt, tv, parent_node, genl_inverse_modeP, UNPROVIDED);
        }
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(final SubLObject node, final SubLObject state) {
        final SubLObject tv = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_current_tv(state);
        final SubLObject module = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_module(state);
        final SubLObject parent_node = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_parent_node(state);
        final SubLObject direction = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_direction(state);
        final SubLObject mt = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_mt(state);
        final SubLObject genl_inverse_modeP = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(state);
        return sbhl_search_datastructures.new_sbhl_link_node_search_state(node, module, direction, mt, tv, parent_node, genl_inverse_modeP, UNPROVIDED);
    }

    public static final SubLObject new_sbhl_module_tv_link_node_search_state_iterator_alt(SubLObject tv_links, SubLObject module, SubLObject parent_node, SubLObject direction, SubLObject mt, SubLObject genl_inverse_modeP) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.generate_new_sbhl_module_tv_link_node_search_state_iterator_state(tv_links, module, parent_node, direction, mt, genl_inverse_modeP), SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_module_tv_link_node_search_state_iterator(final SubLObject tv_links, final SubLObject module, final SubLObject parent_node, final SubLObject direction, final SubLObject mt, final SubLObject genl_inverse_modeP) {
        return new_sbhl_iterator(sbhl_link_iterators.generate_new_sbhl_module_tv_link_node_search_state_iterator_state(tv_links, module, parent_node, direction, mt, genl_inverse_modeP), sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_done_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_doneP(state);
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_done(final SubLObject state) {
        return sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_doneP(state);
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_next_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(state);
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_next(final SubLObject state) {
        return sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(state);
    }

    public static final SubLObject sbhl_module_tv_link_node_search_state_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject sbhl_iterator = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state);
            SubLObject result = makeBoolean((NIL == sbhl_iterator) || (NIL != sbhl_iteration_finalize(sbhl_iterator)));
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.release_sbhl_module_tv_link_node_search_state_iterator_state(state);
            return result;
        }
    }

    public static SubLObject sbhl_module_tv_link_node_search_state_iterator_finalize(final SubLObject state) {
        final SubLObject sbhl_iterator = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(state);
        final SubLObject result = makeBoolean((NIL == sbhl_iterator) || (NIL != sbhl_iteration_finalize(sbhl_iterator)));
        sbhl_link_iterators.release_sbhl_module_tv_link_node_search_state_iterator_state(state);
        return result;
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_generating_functions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_module_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_module(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_parent_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_parent_node(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_direction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_direction(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_mt(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_tv_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_tv(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_module_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) : "! sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(v_object) " + "sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_sbhl_module_naut_link_node_search_state_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($GENERATING_FUNCTIONS)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CURRENT_GENERATING_FUNCTION)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CURRENT_REMAINING_NODES)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MODULE)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_module(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PARENT_NODE)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DIRECTION)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MT)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($TV)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($kw52$GENL_INVERSE_MODE_)) {
                                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_sbhl_module_naut_link_node_search_state_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($GENERATING_FUNCTIONS)) {
                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(v_new, current_value);
            } else
                if (pcase_var.eql(sbhl_link_iterators.$CURRENT_GENERATING_FUNCTION)) {
                    sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(v_new, current_value);
                } else
                    if (pcase_var.eql(sbhl_link_iterators.$CURRENT_REMAINING_NODES)) {
                        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(v_new, current_value);
                    } else
                        if (pcase_var.eql($MODULE)) {
                            sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_module(v_new, current_value);
                        } else
                            if (pcase_var.eql($PARENT_NODE)) {
                                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node(v_new, current_value);
                            } else
                                if (pcase_var.eql($DIRECTION)) {
                                    sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MT)) {
                                        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TV)) {
                                            sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv(v_new, current_value);
                                        } else
                                            if (pcase_var.eql(sbhl_link_iterators.$kw59$GENL_INVERSE_MODE_)) {
                                                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(v_new, current_value);
                                            } else {
                                                Errors.error(sbhl_link_iterators.$str18$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_module_naut_link_node_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sbhl_link_iterators.MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $GENERATING_FUNCTIONS, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$CURRENT_GENERATING_FUNCTION, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$CURRENT_REMAINING_NODES, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULE, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_module(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_NODE, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_parent_node(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_direction(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $TV, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_tv(obj));
        funcall(visitor_fn, obj, $SLOT, sbhl_link_iterators.$kw59$GENL_INVERSE_MODE_, sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(obj));
        funcall(visitor_fn, obj, $END, sbhl_link_iterators.MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_module_naut_link_node_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sbhl_link_iterators.visit_defstruct_sbhl_module_naut_link_node_search_state_iterator_state(obj, visitor_fn);
    }

    public static final SubLObject generate_new_sbhl_module_naut_link_node_search_state_iterator_state_alt(SubLObject generating_functions, SubLObject module, SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject genl_inverse_modeP) {
        {
            SubLObject state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_or_create_sbhl_module_naut_link_node_search_state_iterator_state();
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state, generating_functions);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(state, NIL);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state, NIL);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_module(state, module);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node(state, node);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction(state, direction);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt(state, mt);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv(state, tv);
            com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(state, genl_inverse_modeP);
            return state;
        }
    }

    public static SubLObject generate_new_sbhl_module_naut_link_node_search_state_iterator_state(final SubLObject generating_functions, final SubLObject module, final SubLObject node, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject genl_inverse_modeP) {
        final SubLObject state = sbhl_link_iterators.find_or_create_sbhl_module_naut_link_node_search_state_iterator_state();
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state, generating_functions);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(state, NIL);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state, NIL);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_module(state, module);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node(state, node);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction(state, direction);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt(state, mt);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv(state, tv);
        sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(state, genl_inverse_modeP);
        return state;
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_doneP_alt(SubLObject state) {
        return makeBoolean((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state)) && (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state)));
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_doneP(final SubLObject state) {
        return makeBoolean((NIL == sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state)) && (NIL == sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state)));
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state_alt(SubLObject state) {
        {
            SubLObject sbhl_link_node_search_state = NIL;
            while (!((NIL != sbhl_link_node_search_state) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_doneP(state)))) {
                {
                    SubLObject remaining_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state);
                    if (NIL != remaining_nodes) {
                        sbhl_link_node_search_state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(remaining_nodes.first(), state);
                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state, remaining_nodes.rest());
                    } else {
                        {
                            SubLObject remaining_generating_functions = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state);
                            if (NIL != remaining_generating_functions) {
                                {
                                    SubLObject generating_function = remaining_generating_functions.first();
                                    SubLObject node = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_parent_node(state);
                                    SubLObject new_nodes = funcall(generating_function, node);
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state, remaining_generating_functions.rest());
                                    com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(state, generating_function);
                                    if (NIL != new_nodes) {
                                        sbhl_link_node_search_state = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(new_nodes.first(), state);
                                        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state, new_nodes.rest());
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            return sbhl_link_node_search_state;
        }
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(final SubLObject state) {
        SubLObject sbhl_link_node_search_state = NIL;
        while ((NIL == sbhl_link_node_search_state) && (NIL == sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_doneP(state))) {
            final SubLObject remaining_nodes = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state);
            if (NIL != remaining_nodes) {
                sbhl_link_node_search_state = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(remaining_nodes.first(), state);
                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state, remaining_nodes.rest());
            } else {
                final SubLObject remaining_generating_functions = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state);
                if (NIL == remaining_generating_functions) {
                    continue;
                }
                final SubLObject generating_function = remaining_generating_functions.first();
                final SubLObject node = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_parent_node(state);
                final SubLObject new_nodes = funcall(generating_function, node);
                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(state, remaining_generating_functions.rest());
                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(state, generating_function);
                if (NIL == new_nodes) {
                    continue;
                }
                sbhl_link_node_search_state = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(new_nodes.first(), state);
                sbhl_link_iterators._csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(state, new_nodes.rest());
            }
        } 
        return sbhl_link_node_search_state;
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state_alt(SubLObject node, SubLObject state) {
        {
            SubLObject generating_function = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(state);
            SubLObject module = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_module(state);
            SubLObject parent_node = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_parent_node(state);
            SubLObject direction = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_direction(state);
            SubLObject mt = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_mt(state);
            SubLObject tv = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_tv(state);
            SubLObject genl_inverse_modeP = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(state);
            return sbhl_search_datastructures.new_sbhl_link_node_search_state(node, module, direction, mt, tv, parent_node, genl_inverse_modeP, generating_function);
        }
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(final SubLObject node, final SubLObject state) {
        final SubLObject generating_function = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(state);
        final SubLObject module = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_module(state);
        final SubLObject parent_node = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_parent_node(state);
        final SubLObject direction = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_direction(state);
        final SubLObject mt = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_mt(state);
        final SubLObject tv = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_tv(state);
        final SubLObject genl_inverse_modeP = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(state);
        return sbhl_search_datastructures.new_sbhl_link_node_search_state(node, module, direction, mt, tv, parent_node, genl_inverse_modeP, generating_function);
    }

    public static final SubLObject new_sbhl_module_naut_link_node_search_state_iterator_alt(SubLObject module, SubLObject node, SubLObject generating_functions, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject genl_inverse_modeP) {
        return new_sbhl_iterator(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.generate_new_sbhl_module_naut_link_node_search_state_iterator_state(generating_functions, module, node, direction, mt, tv, genl_inverse_modeP), SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static SubLObject new_sbhl_module_naut_link_node_search_state_iterator(final SubLObject module, final SubLObject node, final SubLObject generating_functions, final SubLObject direction, final SubLObject mt, final SubLObject tv, final SubLObject genl_inverse_modeP) {
        return new_sbhl_iterator(sbhl_link_iterators.generate_new_sbhl_module_naut_link_node_search_state_iterator_state(generating_functions, module, node, direction, mt, tv, genl_inverse_modeP), sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE);
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_done_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_doneP(state);
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_done(final SubLObject state) {
        return sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_doneP(state);
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_next_alt(SubLObject state) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(state);
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_next(final SubLObject state) {
        return sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(state);
    }

    public static final SubLObject sbhl_module_naut_link_node_search_state_iterator_finalize_alt(SubLObject state) {
        com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.release_sbhl_module_naut_link_node_search_state_iterator_state(state);
        return T;
    }

    public static SubLObject sbhl_module_naut_link_node_search_state_iterator_finalize(final SubLObject state) {
        sbhl_link_iterators.release_sbhl_module_naut_link_node_search_state_iterator_state(state);
        return T;
    }

    public static final SubLObject within_sbhl_link_iterator_resourcingP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_link_iterator_resourcingP$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_sbhl_link_iterator_resourcingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_link_iterators.$sbhl_link_iterator_resourcingP$.getDynamicValue(thread);
    }

    public static final SubLObject with_sbhl_link_iterator_state_resourcing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt121, append(body, NIL));
        }
    }

    public static SubLObject with_sbhl_link_iterator_state_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, sbhl_link_iterators.$list136, append(body, NIL));
    }

    public static final SubLObject with_sbhl_link_iterator_resourcing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SBHL_ITERATOR_RESOURCING, bq_cons(WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING, append(body, NIL)));
        }
    }

    public static SubLObject with_sbhl_link_iterator_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(sbhl_link_iterators.WITH_SBHL_ITERATOR_RESOURCING, bq_cons(sbhl_link_iterators.WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING, append(body, NIL)));
    }

    public static final SubLObject find_or_create_sbhl_link_node_search_state_iterator_state_alt() {
        {
            SubLObject iterator_state_shell = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_sbhl_link_node_search_state_iterator_state();
            return NIL != iterator_state_shell ? ((SubLObject) (iterator_state_shell)) : com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.make_sbhl_link_node_search_state_iterator_state(UNPROVIDED);
        }
    }

    public static SubLObject find_or_create_sbhl_link_node_search_state_iterator_state() {
        final SubLObject iterator_state_shell = sbhl_link_iterators.find_sbhl_link_node_search_state_iterator_state();
        return NIL != iterator_state_shell ? iterator_state_shell : sbhl_link_iterators.make_sbhl_link_node_search_state_iterator_state(UNPROVIDED);
    }

    public static final SubLObject find_sbhl_link_node_search_state_iterator_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? ((SubLObject) (sbhl_search_datastructures.sbhl_stack_pop($sbhl_link_node_search_state_iterator_state_store$.getDynamicValue(thread)))) : NIL;
        }
    }

    public static SubLObject find_sbhl_link_node_search_state_iterator_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? sbhl_search_datastructures.sbhl_stack_pop(sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_store$.getDynamicValue(thread)) : NIL;
    }

    public static final SubLObject release_sbhl_link_node_search_state_iterator_state_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
                sbhl_search_datastructures.sbhl_stack_push(state, $sbhl_link_node_search_state_iterator_state_store$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject release_sbhl_link_node_search_state_iterator_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
            sbhl_search_datastructures.sbhl_stack_push(state, sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_store$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject find_or_create_sbhl_module_direction_link_search_state_iterator_state_alt() {
        {
            SubLObject iterator_state_shell = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_sbhl_module_direction_link_search_state_iterator_state();
            return NIL != iterator_state_shell ? ((SubLObject) (iterator_state_shell)) : com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.make_sbhl_module_direction_link_search_state_iterator_state(UNPROVIDED);
        }
    }

    public static SubLObject find_or_create_sbhl_module_direction_link_search_state_iterator_state() {
        final SubLObject iterator_state_shell = sbhl_link_iterators.find_sbhl_module_direction_link_search_state_iterator_state();
        return NIL != iterator_state_shell ? iterator_state_shell : sbhl_link_iterators.make_sbhl_module_direction_link_search_state_iterator_state(UNPROVIDED);
    }

    public static final SubLObject find_sbhl_module_direction_link_search_state_iterator_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? ((SubLObject) (sbhl_search_datastructures.sbhl_stack_pop($sbhl_module_direction_link_search_state_iterator_state_store$.getDynamicValue(thread)))) : NIL;
        }
    }

    public static SubLObject find_sbhl_module_direction_link_search_state_iterator_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? sbhl_search_datastructures.sbhl_stack_pop(sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_store$.getDynamicValue(thread)) : NIL;
    }

    public static final SubLObject release_sbhl_module_direction_link_search_state_iterator_state_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
                sbhl_search_datastructures.sbhl_stack_push(state, $sbhl_module_direction_link_search_state_iterator_state_store$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject release_sbhl_module_direction_link_search_state_iterator_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
            sbhl_search_datastructures.sbhl_stack_push(state, sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_store$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject find_or_create_sbhl_module_tv_link_node_search_state_iterator_state_alt() {
        {
            SubLObject iterator_state_shell = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_sbhl_module_tv_link_node_search_state_iterator_state();
            return NIL != iterator_state_shell ? ((SubLObject) (iterator_state_shell)) : com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.make_sbhl_module_tv_link_node_search_state_iterator_state(UNPROVIDED);
        }
    }

    public static SubLObject find_or_create_sbhl_module_tv_link_node_search_state_iterator_state() {
        final SubLObject iterator_state_shell = sbhl_link_iterators.find_sbhl_module_tv_link_node_search_state_iterator_state();
        return NIL != iterator_state_shell ? iterator_state_shell : sbhl_link_iterators.make_sbhl_module_tv_link_node_search_state_iterator_state(UNPROVIDED);
    }

    public static final SubLObject find_sbhl_module_tv_link_node_search_state_iterator_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? ((SubLObject) (sbhl_search_datastructures.sbhl_stack_pop($sbhl_module_tv_link_node_search_state_iterator_state_store$.getDynamicValue(thread)))) : NIL;
        }
    }

    public static SubLObject find_sbhl_module_tv_link_node_search_state_iterator_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? sbhl_search_datastructures.sbhl_stack_pop(sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_store$.getDynamicValue(thread)) : NIL;
    }

    public static final SubLObject release_sbhl_module_tv_link_node_search_state_iterator_state_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
                sbhl_search_datastructures.sbhl_stack_push(state, $sbhl_module_tv_link_node_search_state_iterator_state_store$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject release_sbhl_module_tv_link_node_search_state_iterator_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
            sbhl_search_datastructures.sbhl_stack_push(state, sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_store$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject find_or_create_sbhl_module_naut_link_node_search_state_iterator_state_alt() {
        {
            SubLObject iterator_state_shell = com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.find_sbhl_module_naut_link_node_search_state_iterator_state();
            return NIL != iterator_state_shell ? ((SubLObject) (iterator_state_shell)) : com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.make_sbhl_module_naut_link_node_search_state_iterator_state(UNPROVIDED);
        }
    }

    public static SubLObject find_or_create_sbhl_module_naut_link_node_search_state_iterator_state() {
        final SubLObject iterator_state_shell = sbhl_link_iterators.find_sbhl_module_naut_link_node_search_state_iterator_state();
        return NIL != iterator_state_shell ? iterator_state_shell : sbhl_link_iterators.make_sbhl_module_naut_link_node_search_state_iterator_state(UNPROVIDED);
    }

    public static final SubLObject find_sbhl_module_naut_link_node_search_state_iterator_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? ((SubLObject) (sbhl_search_datastructures.sbhl_stack_pop($sbhl_module_naut_link_node_search_state_iterator_state_store$.getDynamicValue(thread)))) : NIL;
        }
    }

    public static SubLObject find_sbhl_module_naut_link_node_search_state_iterator_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP() ? sbhl_search_datastructures.sbhl_stack_pop(sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_store$.getDynamicValue(thread)) : NIL;
    }

    public static final SubLObject release_sbhl_module_naut_link_node_search_state_iterator_state_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
                sbhl_search_datastructures.sbhl_stack_push(state, $sbhl_module_naut_link_node_search_state_iterator_state_store$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject release_sbhl_module_naut_link_node_search_state_iterator_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_link_iterators.within_sbhl_link_iterator_resourcingP()) {
            sbhl_search_datastructures.sbhl_stack_push(state, sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_store$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject declare_sbhl_link_iterators_file() {
        declareFunction("sbhl_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_state_p", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false);
        new sbhl_link_iterators.$sbhl_link_node_search_state_iterator_state_p$UnaryFunction();
        declareFunction("sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_state_remaining_modules", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR", 1, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_iterator_state_remaining_modules", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES", 2, 0, false);
        declareFunction("_csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR", 2, 0, false);
        declareFunction("make_sbhl_link_node_search_state_iterator_state", "MAKE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_link_node_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_link_node_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("generate_new_sbhl_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        declareFunction("get_sbhl_link_node_search_state_iterator_state_next_module", "GET-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-MODULE", 1, 0, false);
        declareFunction("update_sbhl_link_node_search_state_iterator_state", "UPDATE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_state_doneP", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false);
        declareFunction("new_sbhl_link_node_search_state_iterator", "NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_done", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_next", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_link_node_search_state_iterator_finalize", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_sbhl_module_link_node_search_state_iterator", "NEW-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 2, 0, false);
        declareFunction("new_fort_sbhl_module_link_node_search_state_iterator", "NEW-FORT-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 3, 0, false);
        declareFunction("new_naut_sbhl_module_link_node_search_state_iterator", "NEW-NAUT-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 3, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_p", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false);
        new sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction();
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_graph_link", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_module", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_node", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_direction", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR", 2, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR", 2, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK", 2, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_node", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE", 2, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false);
        declareFunction("_csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false);
        declareFunction("make_sbhl_module_direction_link_search_state_iterator_state", "MAKE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_module_direction_link_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_module_direction_link_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("generate_new_sbhl_module_direction_link_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 5, 0, false);
        declareFunction("update_sbhl_module_direction_link_search_state_iterator_state", "UPDATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_doneP", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE?", 1, 0, false);
        declareFunction("new_sbhl_module_direction_link_search_state_iterator", "NEW-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR", 5, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_done", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_next", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_module_direction_link_search_state_iterator_finalize", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_p", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false);
        new sbhl_link_iterators.$sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction();
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_current_tv", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_module", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_parent_node", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_direction", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_mt", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 2, 0, false);
        declareFunction("_csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false);
        declareFunction("make_sbhl_module_tv_link_node_search_state_iterator_state", "MAKE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_module_tv_link_node_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_module_tv_link_node_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("generate_new_sbhl_module_tv_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 6, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_doneP", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
        declareFunction("new_sbhl_module_tv_link_node_search_state_iterator", "NEW-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR", 6, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_done", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_next", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_module_tv_link_node_search_state_iterator_finalize", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_p", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false);
        new sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction();
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_generating_functions", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_module", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_parent_node", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_direction", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_mt", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_tv", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV", 2, 0, false);
        declareFunction("_csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false);
        declareFunction("make_sbhl_module_naut_link_node_search_state_iterator_state", "MAKE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_sbhl_module_naut_link_node_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_sbhl_module_naut_link_node_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("generate_new_sbhl_module_naut_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 7, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_doneP", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
        declareFunction("new_sbhl_module_naut_link_node_search_state_iterator", "NEW-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR", 7, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_done", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_next", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sbhl_module_naut_link_node_search_state_iterator_finalize", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("within_sbhl_link_iterator_resourcingP", "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?", 0, 0, false);
        declareMacro("with_sbhl_link_iterator_state_resourcing", "WITH-SBHL-LINK-ITERATOR-STATE-RESOURCING");
        declareMacro("with_sbhl_link_iterator_resourcing", "WITH-SBHL-LINK-ITERATOR-RESOURCING");
        declareFunction("find_or_create_sbhl_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("find_sbhl_link_node_search_state_iterator_state", "FIND-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("release_sbhl_link_node_search_state_iterator_state", "RELEASE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        declareFunction("find_or_create_sbhl_module_direction_link_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("find_sbhl_module_direction_link_search_state_iterator_state", "FIND-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("release_sbhl_module_direction_link_search_state_iterator_state", "RELEASE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        declareFunction("find_or_create_sbhl_module_tv_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("find_sbhl_module_tv_link_node_search_state_iterator_state", "FIND-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("release_sbhl_module_tv_link_node_search_state_iterator_state", "RELEASE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        declareFunction("find_or_create_sbhl_module_naut_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("find_sbhl_module_naut_link_node_search_state_iterator_state", "FIND-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
        declareFunction("release_sbhl_module_naut_link_node_search_state_iterator_state", "RELEASE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("REMAINING-MODULES"), makeSymbol("MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLList $list_alt3 = list(makeKeyword("SBHL-LINK-NODE-SEARCH-STATE"), makeKeyword("REMAINING-MODULES"), makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLList $list_alt4 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR"));

    static private final SubLSymbol $sym8$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_ = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE");

    static private final SubLSymbol $sym9$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_ = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE");

    static private final SubLSymbol $sym11$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES");

    static private final SubLSymbol $sym12$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR");

    static private final SubLSymbol $sym13$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR");

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt22$_a_is_neither_an_SBHL_node__FORT_ = makeString("~a is neither an SBHL node (FORT) nor a NAUT.  Returning a null-iterator.");

    static private final SubLString $str_alt23$No__a_direction_links_for__a_with = makeString("No ~a direction links for ~a with module ~a.  Returning a null-iterator.");

    static private final SubLString $str_alt24$No_generating_functions_for_direc = makeString("No generating functions for direction ~a, TV ~a, and module ~a.  Returning a null-iterator.");

    static private final SubLList $list_alt27 = list(makeSymbol("MT-LINK-ITERATOR"), makeSymbol("TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("GRAPH-LINK"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("GENL-INVERSE-MODE?"));

    static private final SubLList $list_alt28 = list(makeKeyword("MT-LINK-ITERATOR"), makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR"), makeKeyword("GRAPH-LINK"), makeKeyword("MODULE"), $NODE, makeKeyword("DIRECTION"), makeKeyword("GENL-INVERSE-MODE?"));

    static private final SubLList $list_alt29 = list(makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    static private final SubLList $list_alt30 = list(makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    static private final SubLSymbol $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLSymbol $sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR");

    static private final SubLSymbol $sym33$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_ = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR");

    static private final SubLSymbol $sym34$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR");

    static private final SubLSymbol $sym35$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_ = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR");

    static private final SubLSymbol $sym37$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK");

    static private final SubLSymbol $sym39$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE");

    static private final SubLSymbol $sym41$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE");

    static private final SubLSymbol $sym43$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    static private final SubLSymbol $sym44$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    static private final SubLSymbol $sym45$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    public static final SubLSymbol $kw52$GENL_INVERSE_MODE_ = makeKeyword("GENL-INVERSE-MODE?");

    static private final SubLList $list_alt53 = list(makeSymbol("MT"), makeSymbol("TV-LINKS"));

    static private final SubLList $list_alt59 = list(makeSymbol("TV-LINK-ITERATOR"), makeSymbol("CURRENT-TV"), makeSymbol("CURRENT-REMAINING-NODES"), makeSymbol("MODULE"), makeSymbol("PARENT-NODE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("GENL-INVERSE-MODE?"));

    static private final SubLList $list_alt60 = list(makeKeyword("TV-LINK-ITERATOR"), makeKeyword("CURRENT-TV"), makeKeyword("CURRENT-REMAINING-NODES"), makeKeyword("MODULE"), makeKeyword("PARENT-NODE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("GENL-INVERSE-MODE?"));

    static private final SubLList $list_alt61 = list(makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    static private final SubLList $list_alt62 = list(makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));

    static private final SubLSymbol $sym63$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLSymbol $sym64$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR");

    static private final SubLSymbol $sym65$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR");

    static private final SubLSymbol $sym67$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV");

    static private final SubLSymbol $sym68$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    static private final SubLSymbol $sym69$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    static private final SubLSymbol $sym71$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");

    static private final SubLSymbol $sym73$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    static private final SubLSymbol $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    static private final SubLSymbol $sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    static private final SubLSymbol $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_ = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    static private final SubLList $list_alt85 = list(makeSymbol("TV"), makeSymbol("LINKS"));

    public static SubLObject init_sbhl_link_iterators_file() {
        defconstant("*DTP-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        defconstant("*DTP-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE*", sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE);
        defconstant("*DTP-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        defconstant("*DTP-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        defparameter("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
        defparameter("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
        defparameter("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
        defparameter("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
        defparameter("*SBHL-LINK-ITERATOR-RESOURCING?*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt91 = list(new SubLObject[]{ makeSymbol("GENERATING-FUNCTIONS"), makeSymbol("CURRENT-GENERATING-FUNCTION"), makeSymbol("CURRENT-REMAINING-NODES"), makeSymbol("MODULE"), makeSymbol("PARENT-NODE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("GENL-INVERSE-MODE?") });

    public static final SubLObject setup_sbhl_link_iterators_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function($sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL));
        def_csetf($sym8$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_, $sym9$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_);
        def_csetf(SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES, $sym11$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL);
        def_csetf($sym12$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA, $sym13$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA);
        identity(SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), symbol_function($sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
        def_csetf($sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT, $sym33$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_);
        def_csetf($sym34$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE, $sym35$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_);
        def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK, $sym37$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA);
        def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym39$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD);
        def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE, $sym41$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD);
        def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym43$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR);
        def_csetf($sym44$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym45$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN);
        identity(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function($sym63$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI));
        def_csetf($sym64$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER, $sym65$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI);
        def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV, $sym67$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
        def_csetf($sym68$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA, $sym69$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
        def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym71$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL);
        def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE, $sym73$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN);
        def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC);
        def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, _CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
        def_csetf($sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE, $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_);
        identity(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function($sym95$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
        def_csetf($sym96$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING, $sym97$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
        def_csetf($sym98$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE, $sym99$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
        def_csetf($sym100$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE, $sym101$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
        def_csetf(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym103$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD);
        def_csetf($sym104$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD, $sym105$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR);
        def_csetf(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym107$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR);
        def_csetf(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, _CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
        def_csetf(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV, _CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV);
        def_csetf($sym112$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym113$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
        identity(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        return NIL;
    }

    public static SubLObject setup_sbhl_link_iterators_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list8);
            def_csetf(sbhl_link_iterators.$sym9$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_, sbhl_link_iterators.$sym10$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_);
            def_csetf(sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES, sbhl_link_iterators.$sym12$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL);
            def_csetf(sbhl_link_iterators.$sym13$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA, sbhl_link_iterators.$sym14$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA);
            identity(sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym23$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE));
            register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym37$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list38);
            def_csetf(sbhl_link_iterators.$sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT, sbhl_link_iterators.$sym40$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_);
            def_csetf(sbhl_link_iterators.$sym41$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE, sbhl_link_iterators.$sym42$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK, sbhl_link_iterators.$sym44$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE, sbhl_link_iterators.$sym46$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE, sbhl_link_iterators.$sym48$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION, sbhl_link_iterators.$sym50$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR);
            def_csetf(sbhl_link_iterators.$sym51$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, sbhl_link_iterators.$sym52$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN);
            identity(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym61$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_IT));
            register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list73);
            def_csetf(sbhl_link_iterators.$sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER, sbhl_link_iterators.$sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV, sbhl_link_iterators.$sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
            def_csetf(sbhl_link_iterators.$sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA, sbhl_link_iterators.$sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, sbhl_link_iterators.$sym81$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE, sbhl_link_iterators.$sym83$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, sbhl_link_iterators.$sym85$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, sbhl_link_iterators._CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
            def_csetf(sbhl_link_iterators.$sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE, sbhl_link_iterators.$sym89$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_);
            identity(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym96$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITER));
            register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym107$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
            SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list108);
            def_csetf(sbhl_link_iterators.$sym109$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING, sbhl_link_iterators.$sym110$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
            def_csetf(sbhl_link_iterators.$sym111$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE, sbhl_link_iterators.$sym112$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
            def_csetf(sbhl_link_iterators.$sym113$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE, sbhl_link_iterators.$sym114$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, sbhl_link_iterators.$sym116$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD);
            def_csetf(sbhl_link_iterators.$sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD, sbhl_link_iterators.$sym118$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, sbhl_link_iterators.$sym120$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, sbhl_link_iterators._CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
            def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV, sbhl_link_iterators._CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV);
            def_csetf(sbhl_link_iterators.$sym125$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, sbhl_link_iterators.$sym126$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
            identity(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym131$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_IT));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym8$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_, $sym9$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_);
            def_csetf(SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES, $sym11$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL);
            def_csetf($sym12$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA, $sym13$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), symbol_function($sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
            def_csetf($sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT, $sym33$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_);
            def_csetf($sym34$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE, $sym35$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_);
            def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK, $sym37$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA);
            def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym39$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD);
            def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE, $sym41$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD);
            def_csetf(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym43$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR);
            def_csetf($sym44$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym45$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function($sym63$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI));
            def_csetf($sym64$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER, $sym65$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI);
            def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV, $sym67$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
            def_csetf($sym68$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA, $sym69$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
            def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym71$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL);
            def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE, $sym73$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN);
            def_csetf(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC);
            def_csetf($sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE, $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function($sym95$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
            def_csetf($sym96$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING, $sym97$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
            def_csetf($sym98$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE, $sym99$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
            def_csetf($sym100$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE, $sym101$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
            def_csetf(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym103$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD);
            def_csetf($sym104$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD, $sym105$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR);
            def_csetf(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym107$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR);
            def_csetf($sym112$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym113$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
        }
        return NIL;
    }

    public static SubLObject setup_sbhl_link_iterators_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list8);
        def_csetf(sbhl_link_iterators.$sym9$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_, sbhl_link_iterators.$sym10$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_);
        def_csetf(sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES, sbhl_link_iterators.$sym12$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL);
        def_csetf(sbhl_link_iterators.$sym13$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA, sbhl_link_iterators.$sym14$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA);
        identity(sbhl_link_iterators.SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym23$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE));
        register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym37$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list38);
        def_csetf(sbhl_link_iterators.$sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT, sbhl_link_iterators.$sym40$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_);
        def_csetf(sbhl_link_iterators.$sym41$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE, sbhl_link_iterators.$sym42$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK, sbhl_link_iterators.$sym44$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE, sbhl_link_iterators.$sym46$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE, sbhl_link_iterators.$sym48$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION, sbhl_link_iterators.$sym50$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR);
        def_csetf(sbhl_link_iterators.$sym51$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, sbhl_link_iterators.$sym52$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN);
        identity(sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym61$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_IT));
        register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list73);
        def_csetf(sbhl_link_iterators.$sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER, sbhl_link_iterators.$sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV, sbhl_link_iterators.$sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
        def_csetf(sbhl_link_iterators.$sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA, sbhl_link_iterators.$sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, sbhl_link_iterators.$sym81$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE, sbhl_link_iterators.$sym83$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, sbhl_link_iterators.$sym85$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, sbhl_link_iterators._CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
        def_csetf(sbhl_link_iterators.$sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE, sbhl_link_iterators.$sym89$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_);
        identity(sbhl_link_iterators.SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym96$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITER));
        register_method($print_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym107$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
        SubLSpecialOperatorDeclarations.proclaim(sbhl_link_iterators.$list108);
        def_csetf(sbhl_link_iterators.$sym109$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING, sbhl_link_iterators.$sym110$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
        def_csetf(sbhl_link_iterators.$sym111$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE, sbhl_link_iterators.$sym112$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
        def_csetf(sbhl_link_iterators.$sym113$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE, sbhl_link_iterators.$sym114$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, sbhl_link_iterators.$sym116$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD);
        def_csetf(sbhl_link_iterators.$sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD, sbhl_link_iterators.$sym118$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, sbhl_link_iterators.$sym120$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, sbhl_link_iterators._CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
        def_csetf(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV, sbhl_link_iterators._CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV);
        def_csetf(sbhl_link_iterators.$sym125$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, sbhl_link_iterators.$sym126$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
        identity(sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_link_iterators.$dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), symbol_function(sbhl_link_iterators.$sym131$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_IT));
        return NIL;
    }

    static private final SubLList $list_alt92 = list(new SubLObject[]{ makeKeyword("GENERATING-FUNCTIONS"), makeKeyword("CURRENT-GENERATING-FUNCTION"), makeKeyword("CURRENT-REMAINING-NODES"), makeKeyword("MODULE"), makeKeyword("PARENT-NODE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("TV"), makeKeyword("GENL-INVERSE-MODE?") });

    static private final SubLList $list_alt93 = list(new SubLObject[]{ makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?") });

    static private final SubLList $list_alt94 = list(new SubLObject[]{ makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?") });

    static private final SubLSymbol $sym95$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLSymbol $sym96$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS");

    static private final SubLSymbol $sym97$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS");

    static private final SubLSymbol $sym98$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION");

    static private final SubLSymbol $sym99$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION");

    static private final SubLSymbol $sym100$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    static private final SubLSymbol $sym101$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");

    static private final SubLSymbol $sym103$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");

    static private final SubLSymbol $sym104$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    static private final SubLSymbol $sym105$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");

    static private final SubLSymbol $sym107$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");

    static private final SubLSymbol $sym112$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    static private final SubLSymbol $sym113$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");

    static private final SubLList $list_alt121 = list(list(makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-LINK-ITERATOR-RESOURCING?*"), T));

    @Override
    public void declareFunctions() {
        sbhl_link_iterators.declare_sbhl_link_iterators_file();
    }

    @Override
    public void initializeVariables() {
        sbhl_link_iterators.init_sbhl_link_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        sbhl_link_iterators.setup_sbhl_link_iterators_file();
    }

    

    public static final class $sbhl_link_node_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $sbhl_link_node_search_state_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_link_iterators.sbhl_link_node_search_state_iterator_state_p(arg1);
        }
    }

    public static final class $sbhl_module_direction_link_search_state_iterator_state_native extends SubLStructNative {
        public SubLObject $mt_link_iterator;

        public SubLObject $tv_link_search_state_iterator;

        public SubLObject $graph_link;

        public SubLObject $module;

        public SubLObject $node;

        public SubLObject $direction;

        public SubLObject $genl_inverse_modeP;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_module_direction_link_search_state_iterator_state_native() {
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$mt_link_iterator = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$tv_link_search_state_iterator = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$graph_link = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$module = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$node = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$direction = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$genl_inverse_modeP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$mt_link_iterator;
        }

        @Override
        public SubLObject getField3() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$tv_link_search_state_iterator;
        }

        @Override
        public SubLObject getField4() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$graph_link;
        }

        @Override
        public SubLObject getField5() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$module;
        }

        @Override
        public SubLObject getField6() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$node;
        }

        @Override
        public SubLObject getField7() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$direction;
        }

        @Override
        public SubLObject getField8() {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$genl_inverse_modeP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$mt_link_iterator = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$tv_link_search_state_iterator = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$graph_link = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$module = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$node = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$direction = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.this.$genl_inverse_modeP = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_direction_link_search_state_iterator_state_native.class, sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE, sbhl_link_iterators.SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P, sbhl_link_iterators.$list33, sbhl_link_iterators.$list34, new String[]{ "$mt_link_iterator", "$tv_link_search_state_iterator", "$graph_link", "$module", "$node", "$direction", "$genl_inverse_modeP" }, sbhl_link_iterators.$list35, sbhl_link_iterators.$list36, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_state_p(arg1);
        }
    }

    public static final class $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_state_p(arg1);
        }
    }

    public static final class $sbhl_module_naut_link_node_search_state_iterator_state_native extends SubLStructNative {
        public SubLObject $generating_functions;

        public SubLObject $current_generating_function;

        public SubLObject $current_remaining_nodes;

        public SubLObject $module;

        public SubLObject $parent_node;

        public SubLObject $direction;

        public SubLObject $mt;

        public SubLObject $tv;

        public SubLObject $genl_inverse_modeP;

        private static final SubLStructDeclNative structDecl;

        public $sbhl_module_naut_link_node_search_state_iterator_state_native() {
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$generating_functions = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$current_generating_function = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$current_remaining_nodes = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$module = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$parent_node = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$direction = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$mt = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$tv = Lisp.NIL;
            sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$genl_inverse_modeP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$generating_functions;
        }

        @Override
        public SubLObject getField3() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$current_generating_function;
        }

        @Override
        public SubLObject getField4() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$current_remaining_nodes;
        }

        @Override
        public SubLObject getField5() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$module;
        }

        @Override
        public SubLObject getField6() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$parent_node;
        }

        @Override
        public SubLObject getField7() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$direction;
        }

        @Override
        public SubLObject getField8() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$mt;
        }

        @Override
        public SubLObject getField9() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$tv;
        }

        @Override
        public SubLObject getField10() {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$genl_inverse_modeP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$generating_functions = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$current_generating_function = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$current_remaining_nodes = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$module = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$parent_node = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$direction = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$tv = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.this.$genl_inverse_modeP = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators.$sbhl_module_naut_link_node_search_state_iterator_state_native.class, sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, sbhl_link_iterators.SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, sbhl_link_iterators.$list103, sbhl_link_iterators.$list104, new String[]{ "$generating_functions", "$current_generating_function", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$tv", "$genl_inverse_modeP" }, sbhl_link_iterators.$list105, sbhl_link_iterators.$list106, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_state_p(arg1);
        }
    }
}

/**
 * Total time: 372 ms
 */
