package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.new_sbhl_iterator;
import static com.cyc.cycjava.cycl.utilities_macros.$structure_resourcing_enabled$;
import static com.cyc.cycjava.cycl.utilities_macros.$structure_resourcing_make_static$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.sbhl.sbhl_time_dates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class binary_tree extends SubLTranslatedFile {
    public static final SubLFile me = new binary_tree();

    public static final String myName = "com.cyc.cycjava.cycl.binary_tree";

    public static final String myFingerPrint = "b5cec37136debeba42ccb2e3dd8d92cc37b85e43ba665ad95f49a84c9bff7c52";

    // defconstant
    public static final SubLSymbol $dtp_btree$ = makeSymbol("*DTP-BTREE*");

    // deflexical
    // Free list for BTREE objects
    private static final SubLSymbol $btree_free_list$ = makeSymbol("*BTREE-FREE-LIST*");

    // deflexical
    // Lock for BTREE object free list
    private static final SubLSymbol $btree_free_lock$ = makeSymbol("*BTREE-FREE-LOCK*");

    // defparameter
    private static final SubLSymbol $validate_btrees$ = makeSymbol("*VALIDATE-BTREES*");

    // defparameter
    private static final SubLSymbol $btree_tags$ = makeSymbol("*BTREE-TAGS*");

    // defparameter
    private static final SubLSymbol $btree_remove_debugging$ = makeSymbol("*BTREE-REMOVE-DEBUGGING*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_btree$ = makeSymbol("*CFASL-OPCODE-BTREE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_legacy_btree_low$ = makeSymbol("*CFASL-OPCODE-LEGACY-BTREE-LOW*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_legacy_btree_high$ = makeSymbol("*CFASL-OPCODE-LEGACY-BTREE-HIGH*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_legacy_btree_leaf$ = makeSymbol("*CFASL-OPCODE-LEGACY-BTREE-LEAF*");

    // defparameter
    private static final SubLSymbol $btree_balance_vector_index$ = makeSymbol("*BTREE-BALANCE-VECTOR-INDEX*");

    // defparameter
    private static final SubLSymbol $btree_balance_vector$ = makeSymbol("*BTREE-BALANCE-VECTOR*");

    // defconstant
    public static final SubLSymbol $dtp_avl_tree$ = makeSymbol("*DTP-AVL-TREE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_avl_tree$ = makeSymbol("*CFASL-OPCODE-AVL-TREE*");

    // defparameter
    public static final SubLSymbol $print_avl_tree_node_dataP$ = makeSymbol("*PRINT-AVL-TREE-NODE-DATA?*");

    // defconstant
    public static final SubLSymbol $dtp_avl_tree_node$ = makeSymbol("*DTP-AVL-TREE-NODE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_avl_tree_node$ = makeSymbol("*CFASL-OPCODE-AVL-TREE-NODE*");

    // Internal Constants
    public static final SubLSymbol BTREE = makeSymbol("BTREE");

    public static final SubLSymbol BTREE_P = makeSymbol("BTREE-P");

    public static final SubLList $list2 = list(makeSymbol("TAG"), makeSymbol("STATE"), makeSymbol("LOWER"), makeSymbol("HIGHER"));

    public static final SubLList $list3 = list(makeKeyword("TAG"), makeKeyword("STATE"), makeKeyword("LOWER"), makeKeyword("HIGHER"));

    public static final SubLList $list4 = list(makeSymbol("BT-TAG"), makeSymbol("BT-STATE"), makeSymbol("BT-LOWER"), makeSymbol("BT-HIGHER"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-BT-TAG"), makeSymbol("_CSETF-BT-STATE"), makeSymbol("_CSETF-BT-LOWER"), makeSymbol("_CSETF-BT-HIGHER"));

    public static final SubLSymbol PRINT_BTREE = makeSymbol("PRINT-BTREE");

    public static final SubLSymbol BTREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BTREE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("BTREE-P"));

    private static final SubLSymbol BT_TAG = makeSymbol("BT-TAG");

    private static final SubLSymbol _CSETF_BT_TAG = makeSymbol("_CSETF-BT-TAG");

    private static final SubLSymbol BT_STATE = makeSymbol("BT-STATE");

    private static final SubLSymbol _CSETF_BT_STATE = makeSymbol("_CSETF-BT-STATE");

    private static final SubLSymbol BT_LOWER = makeSymbol("BT-LOWER");

    private static final SubLSymbol _CSETF_BT_LOWER = makeSymbol("_CSETF-BT-LOWER");

    private static final SubLSymbol BT_HIGHER = makeSymbol("BT-HIGHER");

    private static final SubLSymbol _CSETF_BT_HIGHER = makeSymbol("_CSETF-BT-HIGHER");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_BTREE = makeSymbol("MAKE-BTREE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_BTREE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-BTREE-METHOD");

    private static final SubLString $str27$__BT_ = makeString("#<BT:");

    private static final SubLString $str28$_ = makeString("@");

    private static final SubLString $str29$_ = makeString(":");

    private static final SubLString $str30$_ = makeString(">");

    private static final SubLString $str31$__S_ = makeString("[~S]");

    private static final SubLString $$$BTREE_resource_lock = makeString("BTREE resource lock");



    private static final SubLList $list34 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("BTREE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list35 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym38$SUBTREE = makeUninternedSymbol("SUBTREE");

    private static final SubLSymbol DO_BTREE = makeSymbol("DO-BTREE");



    private static final SubLSymbol DO_BTREE_INDEX_KEY = makeSymbol("DO-BTREE-INDEX-KEY");

    private static final SubLSymbol DO_BTREE_INDEX_VALUE = makeSymbol("DO-BTREE-INDEX-VALUE");

    private static final SubLSymbol DO_BTREE_INDEX = makeSymbol("DO-BTREE-INDEX");

    private static final SubLList $list44 = list(list(makeSymbol("VAR"), makeSymbol("BTREE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym45$STACK = makeUninternedSymbol("STACK");

    private static final SubLList $list46 = list(list(makeSymbol("QUOTE"), NIL));









    private static final SubLList $list51 = list(NIL);

    private static final SubLSymbol LOWER = makeSymbol("LOWER");

    private static final SubLSymbol DO_BTREE_LOWER = makeSymbol("DO-BTREE-LOWER");

    private static final SubLSymbol HIGHER = makeSymbol("HIGHER");

    private static final SubLSymbol DO_BTREE_HIGHER = makeSymbol("DO-BTREE-HIGHER");







    private static final SubLList $list59 = list(makeSymbol("LOWER"));

    private static final SubLList $list60 = list(makeSymbol("HIGHER"));





    private static final SubLString $str63$Binary_Tree__S_is_broken_before_i = makeString("Binary Tree ~S is broken before insert!");

    private static final SubLString $str64$Binary_Tree__S_is_broken_after_in = makeString("Binary Tree ~S is broken after insert!");

    private static final SubLString $str65$Binary_Tree__S_is_broken_before_r = makeString("Binary Tree ~S is broken before removal!");

    private static final SubLString $str66$Binary_Tree__S_is_broken_after_re = makeString("Binary Tree ~S is broken after removal!");



    private static final SubLSymbol GATHER_BTREE_TAG = makeSymbol("GATHER-BTREE-TAG");

    private static final SubLString $str69$_S_info_will_be_lost_inserting__S = makeString("~S info will be lost inserting ~S into ~S");

    private static final SubLString $str70$The_tags__S_were_lost_from_tree__ = makeString("The tags ~S were lost from tree ~S");

    private static final SubLSymbol CFASL_INPUT_BTREE = makeSymbol("CFASL-INPUT-BTREE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_BTREE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-BTREE-METHOD");

    private static final SubLSymbol CFASL_INPUT_LEGACY_BTREE_LOW = makeSymbol("CFASL-INPUT-LEGACY-BTREE-LOW");

    private static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol CFASL_INPUT_LEGACY_BTREE_HIGH = makeSymbol("CFASL-INPUT-LEGACY-BTREE-HIGH");

    private static final SubLInteger $int$22 = makeInteger(22);

    private static final SubLSymbol CFASL_INPUT_LEGACY_BTREE_LEAF = makeSymbol("CFASL-INPUT-LEGACY-BTREE-LEAF");

    private static final SubLSymbol BTREE_BALANCE_INSERT_NODE = makeSymbol("BTREE-BALANCE-INSERT-NODE");

    private static final SubLSymbol AVL_TREE = makeSymbol("AVL-TREE");

    private static final SubLSymbol AVL_TREE_P = makeSymbol("AVL-TREE-P");

    private static final SubLList $list81 = list(makeSymbol("ROOT"), makeSymbol("TEST"), makeSymbol("SIZE"));

    private static final SubLList $list82 = list(makeKeyword("ROOT"), makeKeyword("TEST"), makeKeyword("SIZE"));

    private static final SubLList $list83 = list(makeSymbol("AVLT-ROOT"), makeSymbol("AVLT-TEST"), makeSymbol("AVLT-SIZE"));

    private static final SubLList $list84 = list(makeSymbol("_CSETF-AVLT-ROOT"), makeSymbol("_CSETF-AVLT-TEST"), makeSymbol("_CSETF-AVLT-SIZE"));

    private static final SubLSymbol PRINT_AVL_TREE = makeSymbol("PRINT-AVL-TREE");

    private static final SubLSymbol AVL_TREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AVL-TREE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list87 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AVL-TREE-P"));

    private static final SubLSymbol AVLT_ROOT = makeSymbol("AVLT-ROOT");

    private static final SubLSymbol _CSETF_AVLT_ROOT = makeSymbol("_CSETF-AVLT-ROOT");

    private static final SubLSymbol AVLT_TEST = makeSymbol("AVLT-TEST");

    private static final SubLSymbol _CSETF_AVLT_TEST = makeSymbol("_CSETF-AVLT-TEST");

    private static final SubLSymbol AVLT_SIZE = makeSymbol("AVLT-SIZE");

    private static final SubLSymbol _CSETF_AVLT_SIZE = makeSymbol("_CSETF-AVLT-SIZE");







    private static final SubLSymbol MAKE_AVL_TREE = makeSymbol("MAKE-AVL-TREE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AVL_TREE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AVL-TREE-METHOD");

    private static final SubLString $str99$test__a_size__a = makeString("test=~a size=~a");





    private static final SubLSymbol AVL_TREE_ITERATOR_DONE = makeSymbol("AVL-TREE-ITERATOR-DONE");

    private static final SubLSymbol AVL_TREE_ITERATOR_NEXT = makeSymbol("AVL-TREE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_AVL_TREE_ITERATOR_DONE = makeSymbol("SBHL-AVL-TREE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_AVL_TREE_ITERATOR_NEXT = makeSymbol("SBHL-AVL-TREE-ITERATOR-NEXT");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol CFASL_INPUT_AVL_TREE = makeSymbol("CFASL-INPUT-AVL-TREE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-AVL-TREE-METHOD");

    private static final SubLList $list109 = list(MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER);

    private static final SubLSymbol $sym110$_ = makeSymbol("<");

    private static final SubLSymbol $sym111$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol $sym112$SBHL_DATE_ = makeSymbol("SBHL-DATE<");



    private static final SubLString $str114$AVL_tree__a_is_corrupt_ = makeString("AVL tree ~a is corrupt.");

    private static final SubLString $str115$AVL_tree__a_is_corrupt = makeString("AVL tree ~a is corrupt");

    public static final SubLList $list116 = list(makeSymbol("TREE"), makeSymbol("STACK"), makeSymbol("END"), makeSymbol("DIRECTION"));

    private static final SubLSymbol AVL_TREE_NODE = makeSymbol("AVL-TREE-NODE");

    private static final SubLSymbol AVL_TREE_NODE_P = makeSymbol("AVL-TREE-NODE-P");

    private static final SubLList $list119 = list(makeSymbol("DATA"), makeSymbol("BALANCE"), makeSymbol("LOWER"), makeSymbol("HIGHER"));

    private static final SubLList $list120 = list(makeKeyword("DATA"), makeKeyword("BALANCE"), makeKeyword("LOWER"), makeKeyword("HIGHER"));

    private static final SubLList $list121 = list(makeSymbol("AVLTN-DATA"), makeSymbol("AVLTN-BALANCE"), makeSymbol("AVLTN-LOWER"), makeSymbol("AVLTN-HIGHER"));

    private static final SubLList $list122 = list(makeSymbol("_CSETF-AVLTN-DATA"), makeSymbol("_CSETF-AVLTN-BALANCE"), makeSymbol("_CSETF-AVLTN-LOWER"), makeSymbol("_CSETF-AVLTN-HIGHER"));

    private static final SubLSymbol PRINT_AVL_TREE_NODE = makeSymbol("PRINT-AVL-TREE-NODE");

    private static final SubLSymbol AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AVL-TREE-NODE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list125 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AVL-TREE-NODE-P"));

    private static final SubLSymbol AVLTN_DATA = makeSymbol("AVLTN-DATA");

    private static final SubLSymbol _CSETF_AVLTN_DATA = makeSymbol("_CSETF-AVLTN-DATA");

    private static final SubLSymbol AVLTN_BALANCE = makeSymbol("AVLTN-BALANCE");

    private static final SubLSymbol _CSETF_AVLTN_BALANCE = makeSymbol("_CSETF-AVLTN-BALANCE");

    private static final SubLSymbol AVLTN_LOWER = makeSymbol("AVLTN-LOWER");

    private static final SubLSymbol _CSETF_AVLTN_LOWER = makeSymbol("_CSETF-AVLTN-LOWER");

    private static final SubLSymbol AVLTN_HIGHER = makeSymbol("AVLTN-HIGHER");

    private static final SubLSymbol _CSETF_AVLTN_HIGHER = makeSymbol("_CSETF-AVLTN-HIGHER");





    private static final SubLSymbol MAKE_AVL_TREE_NODE = makeSymbol("MAKE-AVL-TREE-NODE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AVL_TREE_NODE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AVL-TREE-NODE-METHOD");

    private static final SubLString $str138$__a_ = makeString("(~a)");

    private static final SubLString $str139$__Data______a = makeString("~%Data:    ~a");

    private static final SubLString $str140$__Balance___a = makeString("~%Balance: ~a");

    private static final SubLString $str141$__Lower_____a = makeString("~%Lower:   ~a");

    private static final SubLString $str142$__Higher____a = makeString("~%Higher:  ~a");

    private static final SubLString $str143$__ = makeString("~%");

    private static final SubLInteger $int$81 = makeInteger(81);

    private static final SubLSymbol CFASL_INPUT_AVL_TREE_NODE = makeSymbol("CFASL-INPUT-AVL-TREE-NODE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-AVL-TREE-NODE-METHOD");

    public static SubLObject btree_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_btree(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject btree_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$btree_native.class ? T : NIL;
    }

    public static SubLObject bt_tag(final SubLObject v_object) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject bt_state(final SubLObject v_object) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject bt_lower(final SubLObject v_object) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject bt_higher(final SubLObject v_object) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_bt_tag(final SubLObject v_object, final SubLObject value) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_bt_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_bt_lower(final SubLObject v_object, final SubLObject value) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_bt_higher(final SubLObject v_object, final SubLObject value) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_btree(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $btree_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TAG)) {
                _csetf_bt_tag(v_new, current_value);
            } else
                if (pcase_var.eql($STATE)) {
                    _csetf_bt_state(v_new, current_value);
                } else
                    if (pcase_var.eql($LOWER)) {
                        _csetf_bt_lower(v_new, current_value);
                    } else
                        if (pcase_var.eql($HIGHER)) {
                            _csetf_bt_higher(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_btree(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_BTREE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TAG, bt_tag(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, bt_state(obj));
        funcall(visitor_fn, obj, $SLOT, $LOWER, bt_lower(obj));
        funcall(visitor_fn, obj, $SLOT, $HIGHER, bt_higher(obj));
        funcall(visitor_fn, obj, $END, MAKE_BTREE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_btree_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_btree(obj, visitor_fn);
    }

    public static SubLObject print_btree(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject higher = bt_higher(v_object);
        final SubLObject lower = bt_lower(v_object);
        if (depth.numE(ZERO_INTEGER)) {
            princ($str27$__BT_, stream);
            if (NIL != lower) {
                print_btree(lower, stream, ONE_INTEGER);
            } else {
                princ($str28$_, stream);
            }
            princ($str29$_, stream);
            prin1(bt_tag(v_object), stream);
            princ($str29$_, stream);
            if (NIL != higher) {
                print_btree(higher, stream, ONE_INTEGER);
            } else {
                princ($str28$_, stream);
            }
            princ($str30$_, stream);
        } else {
            format(stream, $str31$__S_, bt_tag(v_object));
        }
        return v_object;
    }

    public static SubLObject make_static_btree() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_btree(UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    public static SubLObject init_btree(final SubLObject btree) {
        _csetf_bt_tag(btree, NIL);
        _csetf_bt_state(btree, NIL);
        _csetf_bt_lower(btree, NIL);
        _csetf_bt_higher(btree, NIL);
        return btree;
    }

    public static SubLObject free_btree_p(final SubLObject v_object) {
        return makeBoolean((NIL != btree_p(v_object)) && (bt_state(v_object) == $FREE));
    }

    public static SubLObject free_btree(SubLObject v_object) {
        assert NIL != btree_p(v_object) : "binary_tree.btree_p error :" + v_object;
        if (NIL == free_btree_p(v_object)) {
            v_object = init_btree(v_object);
            _csetf_bt_state(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($btree_free_lock$.getGlobalValue());
                    _csetf_bt_tag(v_object, $btree_free_list$.getGlobalValue());
                    $btree_free_list$.setGlobalValue(v_object);
                } finally {
                    if (NIL != release) {
                        release_lock($btree_free_lock$.getGlobalValue());
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject get_btree() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = NIL;
            SubLObject found = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($btree_free_lock$.getGlobalValue());
                v_object = $btree_free_list$.getGlobalValue();
                while ((NIL == found) && (NIL != v_object)) {
                    if (NIL != free_btree_p(v_object)) {
                        $btree_free_list$.setGlobalValue(bt_tag(v_object));
                        found = T;
                    } else {
                        v_object = bt_tag(v_object);
                    }
                } 
                if (NIL == found) {
                    if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_btree();
                    } else {
                        v_object = make_btree(UNPROVIDED);
                    }
                    $btree_free_list$.setGlobalValue(NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock($btree_free_lock$.getGlobalValue());
                }
            }
            return init_btree(v_object);
        }
        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_btree(make_static_btree());
        }
        return init_btree(make_btree(UNPROVIDED));
    }

    public static SubLObject free_entire_btree(final SubLObject btree) {
        if (NIL != btree_p(btree)) {
            free_entire_btree(bt_lower(btree));
            free_entire_btree(bt_higher(btree));
            final SubLObject state = bt_state(btree);
            if (NIL != btree_p(state)) {
                free_entire_btree(state);
            }
            free_btree(btree);
        }
        return NIL;
    }

    public static SubLObject do_btree_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject btree = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        btree = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list34);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list34);
            if (NIL == member(current_$1, $list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list34);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subtree = $sym38$SUBTREE;
        return list(DO_BTREE, list(subtree, btree, $DONE, done), listS(CLET, list(list(key, list(DO_BTREE_INDEX_KEY, subtree)), list(value, list(DO_BTREE_INDEX_VALUE, subtree))), append(body, NIL)));
    }

    public static SubLObject do_btree_index_key(final SubLObject btree) {
        return bt_tag(btree);
    }

    public static SubLObject do_btree_index_value(final SubLObject btree) {
        return bt_state(btree);
    }

    public static SubLObject do_btree(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject btree = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        btree = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list44);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list44);
            if (NIL == member(current_$2, $list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list44);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject stack = $sym45$STACK;
        return list(CLET, list(bq_cons(stack, $list46), list(var, btree)), listS(CDO, NIL, list(NIL != done ? list(COR, done, list(NULL, var)) : list(NULL, var), listS(CSETQ, stack, $list51)), append(body, list(list(CLET, list(list(LOWER, list(DO_BTREE_LOWER, var)), list(HIGHER, list(DO_BTREE_HIGHER, var))), list(PCOND, list(LOWER, list(PWHEN, HIGHER, list(CPUSH, HIGHER, stack)), listS(CSETQ, var, $list59)), list(HIGHER, listS(CSETQ, var, $list60)), list(T, list(CSETQ, var, list(CAR, stack)), list(CPOP, stack))))))));
    }

    public static SubLObject do_btree_lower(final SubLObject btree) {
        return bt_lower(btree);
    }

    public static SubLObject do_btree_higher(final SubLObject btree) {
        return bt_higher(btree);
    }

    public static SubLObject btree_insert(final SubLObject val, final SubLObject tag, final SubLObject btree, final SubLObject comp_func, final SubLObject add_val_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != $validate_btrees$.getDynamicValue(thread)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == btree_validate(btree, comp_func, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str63$Binary_Tree__S_is_broken_before_i, btree);
        }
        thread.resetMultipleValues();
        final SubLObject node = btree_find_aux(tag, btree, comp_func, T);
        final SubLObject back = thread.secondMultipleValue();
        thread.resetMultipleValues();
        _csetf_bt_state(node, NIL != add_val_func ? funcall(add_val_func, val, bt_state(node)) : NIL);
        final SubLObject ans = (NIL != btree) ? btree : node;
        if (((NIL != $validate_btrees$.getDynamicValue(thread)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == btree_validate(ans, comp_func, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str64$Binary_Tree__S_is_broken_after_in, ans);
        }
        return ans;
    }

    public static SubLObject btree_remove(final SubLObject val, final SubLObject tag, final SubLObject btree, final SubLObject comp_func, final SubLObject rem_val_func, SubLObject empty_func) {
        if (empty_func == UNPROVIDED) {
            empty_func = symbol_function(NULL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != $validate_btrees$.getDynamicValue(thread)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == btree_validate(btree, comp_func, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str65$Binary_Tree__S_is_broken_before_r, btree);
        }
        thread.resetMultipleValues();
        final SubLObject node = btree_find_aux(tag, btree, comp_func, UNPROVIDED);
        final SubLObject back = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject ans = btree;
        if (NIL != btree_p(node)) {
            _csetf_bt_state(node, funcall(rem_val_func, val, bt_state(node)));
            if (NIL != funcall(empty_func, bt_state(node))) {
                ans = btree_remove_aux(node, back, btree, comp_func);
            }
        }
        if (((NIL != $validate_btrees$.getDynamicValue(thread)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == btree_validate(ans, comp_func, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str66$Binary_Tree__S_is_broken_after_re, ans);
        }
        return ans;
    }

    public static SubLObject btree_find(final SubLObject tag, final SubLObject btree, final SubLObject comp_func) {
        return values(btree_find_aux(tag, btree, comp_func, UNPROVIDED));
    }

    public static SubLObject btree_find_best(final SubLObject btree) {
        SubLObject back = NIL;
        SubLObject next = NIL;
        back = NIL;
        for (next = btree; NIL != next; next = bt_lower(next)) {
            back = next;
        }
        return back;
    }

    public static SubLObject btree_find_worst(final SubLObject btree) {
        SubLObject back = NIL;
        SubLObject next = NIL;
        back = NIL;
        for (next = btree; NIL != next; next = bt_higher(next)) {
            back = next;
        }
        return back;
    }

    public static SubLObject map_btree(final SubLObject op, final SubLObject btree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != btree_p(btree)) {
            if (NIL != funcall(test, funcall(key, btree))) {
                funcall(op, funcall(key, btree));
            }
            map_btree(op, bt_lower(btree), test, key);
            map_btree(op, bt_higher(btree), test, key);
        }
        return NIL;
    }

    public static SubLObject map_btree_forward(final SubLObject op, final SubLObject btree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != btree_p(btree)) {
            map_btree_forward(op, bt_lower(btree), test, key);
            if (NIL != funcall(test, funcall(key, btree))) {
                funcall(op, funcall(key, btree));
            }
            map_btree_forward(op, bt_higher(btree), test, key);
        }
        return NIL;
    }

    public static SubLObject map_btree_backward(final SubLObject op, final SubLObject btree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != btree_p(btree)) {
            map_btree_backward(op, bt_higher(btree), test, key);
            if (NIL != funcall(test, funcall(key, btree))) {
                funcall(op, funcall(key, btree));
            }
            map_btree_backward(op, bt_lower(btree), test, key);
        }
        return NIL;
    }

    public static SubLObject gather_btree_tag(final SubLObject btree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $btree_tags$.setDynamicValue(cons(bt_tag(btree), $btree_tags$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject btree_tags(final SubLObject btree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $btree_tags$.currentBinding(thread);
        try {
            $btree_tags$.bind(NIL, thread);
            map_btree(symbol_function(GATHER_BTREE_TAG), btree, UNPROVIDED, UNPROVIDED);
            ans = nreverse($btree_tags$.getDynamicValue(thread));
        } finally {
            $btree_tags$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject btree_node_count(final SubLObject btree) {
        if (NIL == btree) {
            return ZERO_INTEGER;
        }
        return add(ONE_INTEGER, btree_node_count(bt_lower(btree)), btree_node_count(bt_higher(btree)));
    }

    public static SubLObject btree_deepest_depth(final SubLObject btree) {
        if (NIL == btree) {
            return ZERO_INTEGER;
        }
        return add(ONE_INTEGER, max(btree_deepest_depth(bt_lower(btree)), btree_deepest_depth(bt_higher(btree))));
    }

    public static SubLObject btree_shallowest_depth(final SubLObject btree) {
        if (NIL == btree) {
            return ZERO_INTEGER;
        }
        return add(ONE_INTEGER, min(btree_shallowest_depth(bt_lower(btree)), btree_shallowest_depth(bt_higher(btree))));
    }

    public static SubLObject btree_validate(final SubLObject btree, final SubLObject comp_func, SubLObject max_limit, SubLObject min_limit) {
        if (max_limit == UNPROVIDED) {
            max_limit = NIL;
        }
        if (min_limit == UNPROVIDED) {
            min_limit = NIL;
        }
        if (NIL == btree) {
            return T;
        }
        final SubLObject tag = bt_tag(btree);
        return makeBoolean(((((NIL == max_limit) || (NIL != funcall(comp_func, tag, max_limit))) && ((NIL == min_limit) || (NIL != funcall(comp_func, min_limit, tag)))) && (NIL != btree_validate(bt_lower(btree), comp_func, tag, min_limit))) && (NIL != btree_validate(bt_higher(btree), comp_func, max_limit, tag)));
    }

    public static SubLObject incomparable(final SubLObject func, final SubLObject obj1, final SubLObject obj2) {
        return makeBoolean((NIL == funcall(func, obj1, obj2)) && (NIL == funcall(func, obj2, obj1)));
    }

    public static SubLObject btree_find_aux(final SubLObject tag, final SubLObject btree, final SubLObject comp_func, SubLObject createP) {
        if (createP == UNPROVIDED) {
            createP = NIL;
        }
        SubLObject back = NIL;
        SubLObject next = NIL;
        back = NIL;
        for (next = btree; (NIL != next) && (NIL == incomparable(comp_func, tag, bt_tag(next))); next = (NIL != funcall(comp_func, tag, bt_tag(next))) ? bt_lower(next) : bt_higher(next)) {
            back = next;
        }
        if ((NIL == next) && (NIL != createP)) {
            final SubLObject v_new = get_btree();
            _csetf_bt_tag(v_new, tag);
            if (NIL != back) {
                btree_insert_aux(v_new, back, comp_func);
            }
            next = v_new;
        }
        return subl_promotions.values2(next, back);
    }

    public static SubLObject btree_insert_aux(final SubLObject v_new, final SubLObject old, final SubLObject comp_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall(comp_func, bt_tag(old), bt_tag(v_new))) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != bt_higher(old))) {
                Errors.error($str69$_S_info_will_be_lost_inserting__S, bt_higher(old), v_new, old);
            }
            _csetf_bt_higher(old, v_new);
        } else {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != bt_lower(old))) {
                Errors.error($str69$_S_info_will_be_lost_inserting__S, bt_lower(old), v_new, old);
            }
            _csetf_bt_lower(old, v_new);
        }
        return old;
    }

    public static SubLObject btree_remove_aux(final SubLObject node, final SubLObject back, final SubLObject top, final SubLObject comp_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject low = bt_lower(node);
        final SubLObject high = bt_higher(node);
        SubLObject replacement = NIL;
        SubLObject re_insert = NIL;
        SubLObject ans = top;
        SubLObject before = NIL;
        SubLObject after = NIL;
        if ((NIL != low) && (NIL != high)) {
            final SubLObject rand = random.random(TWO_INTEGER);
            replacement = (rand.numE(ZERO_INTEGER)) ? low : high;
            re_insert = (rand.numE(ZERO_INTEGER)) ? high : low;
        } else {
            replacement = (NIL != low) ? low : NIL != high ? high : NIL;
        }
        if (NIL != $btree_remove_debugging$.getDynamicValue(thread)) {
            before = btree_tags(ans);
        }
        if (NIL != re_insert) {
            btree_insert_tree(re_insert, replacement, comp_func);
        }
        if (NIL != back) {
            if (bt_lower(back).eql(node)) {
                _csetf_bt_lower(back, replacement);
            } else {
                _csetf_bt_higher(back, replacement);
            }
        } else {
            ans = replacement;
        }
        if (NIL != $btree_remove_debugging$.getDynamicValue(thread)) {
            after = cons(bt_tag(node), btree_tags(ans));
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subsetp(before, after, UNPROVIDED, UNPROVIDED))) {
                Errors.error($str70$The_tags__S_were_lost_from_tree__, set_difference(before, after, UNPROVIDED, UNPROVIDED));
            }
        }
        free_btree(node);
        return ans;
    }

    public static SubLObject btree_insert_tree(final SubLObject v_new, final SubLObject btree, final SubLObject comp_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject node = btree_find_aux(bt_tag(v_new), btree, comp_func, UNPROVIDED);
        final SubLObject back = thread.secondMultipleValue();
        thread.resetMultipleValues();
        btree_insert_aux(v_new, back, comp_func);
        return btree;
    }

    public static SubLObject cfasl_output_btree(final SubLObject btree, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_btree$.getGlobalValue(), stream);
        cfasl_output(bt_tag(btree), stream);
        cfasl_output(bt_state(btree), stream);
        cfasl_output(bt_lower(btree), stream);
        cfasl_output(bt_higher(btree), stream);
        return btree;
    }

    public static SubLObject cfasl_output_object_btree_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_btree(v_object, stream);
    }

    public static SubLObject cfasl_input_btree(final SubLObject stream) {
        SubLObject btree = NIL;
        btree = get_btree();
        _csetf_bt_tag(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_state(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_lower(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_higher(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return btree;
    }

    public static SubLObject cfasl_input_legacy_btree_low(final SubLObject stream) {
        SubLObject btree = NIL;
        btree = get_btree();
        _csetf_bt_tag(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_state(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_lower(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_higher(btree, NIL);
        return btree;
    }

    public static SubLObject cfasl_input_legacy_btree_high(final SubLObject stream) {
        SubLObject btree = NIL;
        btree = get_btree();
        _csetf_bt_tag(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_state(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_lower(btree, NIL);
        _csetf_bt_higher(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return btree;
    }

    public static SubLObject cfasl_input_legacy_btree_leaf(final SubLObject stream) {
        SubLObject btree = NIL;
        btree = get_btree();
        _csetf_bt_tag(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_state(btree, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_bt_lower(btree, NIL);
        _csetf_bt_higher(btree, NIL);
        return btree;
    }

    public static SubLObject btree_balancedP(final SubLObject btree) {
        if (add(ONE_INTEGER, btree_shallowest_depth(btree)).numL(btree_deepest_depth(btree))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject btree_balance(final SubLObject btree, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == btree) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject count = btree_node_count(btree);
        final SubLObject _prev_bind_0 = $btree_balance_vector$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $btree_balance_vector_index$.currentBinding(thread);
        try {
            $btree_balance_vector$.bind(make_vector(count, NIL), thread);
            $btree_balance_vector_index$.bind(ZERO_INTEGER, thread);
            map_btree_forward(symbol_function(BTREE_BALANCE_INSERT_NODE), btree, UNPROVIDED, UNPROVIDED);
            if (NIL != comp_func) {
                $btree_balance_vector$.setDynamicValue(Sort.sort($btree_balance_vector$.getDynamicValue(thread), comp_func, symbol_function(BT_TAG)), thread);
            }
            SubLObject index;
            SubLObject btree_$3;
            for (index = NIL, index = ZERO_INTEGER; index.numL(count); index = add(index, ONE_INTEGER)) {
                btree_$3 = aref($btree_balance_vector$.getDynamicValue(thread), index);
                _csetf_bt_lower(btree_$3, NIL);
                _csetf_bt_higher(btree_$3, NIL);
            }
            ans = btree_balance_recursive($btree_balance_vector$.getDynamicValue(thread), ZERO_INTEGER, count);
        } finally {
            $btree_balance_vector_index$.rebind(_prev_bind_2, thread);
            $btree_balance_vector$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject btree_balance_insert_node(final SubLObject btree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != btree_p(btree)) {
            set_aref($btree_balance_vector$.getDynamicValue(thread), $btree_balance_vector_index$.getDynamicValue(thread), btree);
            $btree_balance_vector_index$.setDynamicValue(add($btree_balance_vector_index$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return NIL;
    }

    public static SubLObject btree_balance_recursive(final SubLObject node_vector, final SubLObject low_index, final SubLObject high_index) {
        if (high_index.numE(low_index)) {
            return NIL;
        }
        if (high_index.numE(add(low_index, ONE_INTEGER))) {
            final SubLObject single_node = aref(node_vector, low_index);
            _csetf_bt_lower(single_node, NIL);
            _csetf_bt_higher(single_node, NIL);
            return single_node;
        }
        final SubLObject between_index = btree_balance_split_point(low_index, high_index);
        final SubLObject between_node = aref(node_vector, between_index);
        final SubLObject balanced_lower = btree_balance_recursive(node_vector, low_index, between_index);
        final SubLObject balanced_higher = btree_balance_recursive(node_vector, add(between_index, ONE_INTEGER), high_index);
        _csetf_bt_lower(between_node, balanced_lower);
        _csetf_bt_higher(between_node, balanced_higher);
        return between_node;
    }

    public static SubLObject btree_balance_split_point(final SubLObject low, final SubLObject high) {
        if (NIL != evenp(subtract(high, low))) {
            return subtract(integerDivide(add(high, low), TWO_INTEGER), random.random(TWO_INTEGER));
        }
        return integerDivide(add(low, high), TWO_INTEGER);
    }

    public static SubLObject avl_tree_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_avl_tree(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject avl_tree_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$avl_tree_native.class ? T : NIL;
    }

    public static SubLObject avlt_root(final SubLObject v_object) {
        assert NIL != avl_tree_p(v_object) : "binary_tree.avl_tree_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject avlt_test(final SubLObject v_object) {
        assert NIL != avl_tree_p(v_object) : "binary_tree.avl_tree_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject avlt_size(final SubLObject v_object) {
        assert NIL != avl_tree_p(v_object) : "binary_tree.avl_tree_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_avlt_root(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_p(v_object) : "binary_tree.avl_tree_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_avlt_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_p(v_object) : "binary_tree.avl_tree_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_avlt_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_p(v_object) : "binary_tree.avl_tree_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_avl_tree(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $avl_tree_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ROOT)) {
                _csetf_avlt_root(v_new, current_value);
            } else
                if (pcase_var.eql($TEST)) {
                    _csetf_avlt_test(v_new, current_value);
                } else
                    if (pcase_var.eql($SIZE)) {
                        _csetf_avlt_size(v_new, current_value);
                    } else {
                        Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_avl_tree(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AVL_TREE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ROOT, avlt_root(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, avlt_test(obj));
        funcall(visitor_fn, obj, $SLOT, $SIZE, avlt_size(obj));
        funcall(visitor_fn, obj, $END, MAKE_AVL_TREE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_avl_tree_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_avl_tree(obj, visitor_fn);
    }

    public static SubLObject print_avl_tree(final SubLObject avl_tree, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(avl_tree, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, avl_tree, T, T);
            format(stream, $str99$test__a_size__a, avlt_test(avl_tree), avlt_size(avl_tree));
            print_macros.print_unreadable_object_postamble(stream, avl_tree, T, T);
        }
        return avl_tree;
    }

    public static SubLObject new_avl_tree(final SubLObject sort_test) {
        assert NIL != function_spec_p(sort_test) : "Types.function_spec_p(sort_test) " + "CommonSymbols.NIL != Types.function_spec_p(sort_test) " + sort_test;
        final SubLObject tree = make_avl_tree(UNPROVIDED);
        _csetf_avlt_test(tree, sort_test);
        _csetf_avlt_size(tree, ZERO_INTEGER);
        return tree;
    }

    public static SubLObject avl_tree_sort_test(final SubLObject avl_tree) {
        return avlt_test(avl_tree);
    }

    public static SubLObject avl_tree_size(final SubLObject avl_tree) {
        return avlt_size(avl_tree);
    }

    public static SubLObject avl_tree_emptyP(final SubLObject avl_tree) {
        return sublisp_null(avlt_root(avl_tree));
    }

    public static SubLObject avl_tree_find(final SubLObject avl_tree, final SubLObject item) {
        return avl_tree_find_exact(avl_tree, avlt_root(avl_tree), item);
    }

    public static SubLObject avl_tree_find_least(final SubLObject avl_tree, SubLObject item, SubLObject strictP) {
        if (item == UNPROVIDED) {
            item = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return NIL != item ? avl_tree_find_bounded_below(avl_tree, avlt_root(avl_tree), item, strictP) : avl_tree_find_unbounded_below(avlt_root(avl_tree));
    }

    public static SubLObject avl_tree_find_greatest(final SubLObject avl_tree, SubLObject item, SubLObject strictP) {
        if (item == UNPROVIDED) {
            item = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return NIL != item ? avl_tree_find_bounded_above(avl_tree, avlt_root(avl_tree), item, strictP) : avl_tree_find_unbounded_above(avlt_root(avl_tree));
    }

    public static SubLObject avl_tree_insert(final SubLObject avl_tree, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_root = avl_tree_insert_and_rebalance(avl_tree, item);
        final SubLObject updatedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != updatedP) {
            _csetf_avlt_size(avl_tree, add(avlt_size(avl_tree), ONE_INTEGER));
            if (NIL != new_root) {
                _csetf_avlt_root(avl_tree, new_root);
            }
        }
        return avl_tree;
    }

    public static SubLObject avl_tree_remove(final SubLObject avl_tree, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == avl_tree_emptyP(avl_tree)) {
            thread.resetMultipleValues();
            final SubLObject new_root = avl_tree_remove_and_rebalance(avl_tree, item);
            final SubLObject updatedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != updatedP) {
                _csetf_avlt_size(avl_tree, subtract(avlt_size(avl_tree), ONE_INTEGER));
                _csetf_avlt_root(avl_tree, new_root);
            }
        }
        return avl_tree;
    }

    public static SubLObject clear_avl_tree(final SubLObject avl_tree) {
        _csetf_avlt_root(avl_tree, NIL);
        _csetf_avlt_size(avl_tree, ZERO_INTEGER);
        return avl_tree;
    }

    public static SubLObject copy_avl_tree(final SubLObject avl_tree) {
        final SubLObject root = avlt_root(avl_tree);
        final SubLObject test = avlt_test(avl_tree);
        final SubLObject size = avlt_size(avl_tree);
        final SubLObject new_tree = new_avl_tree(test);
        final SubLObject new_root = copy_avl_tree_node(root);
        _csetf_avlt_root(new_tree, new_root);
        _csetf_avlt_size(new_tree, size);
        return avl_tree;
    }

    public static SubLObject avl_trees_equalP(final SubLObject avl_tree1, final SubLObject avl_tree2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return makeBoolean((avlt_size(avl_tree1).eql(avlt_size(avl_tree2)) && misc_utilities.function_spec_function(avlt_test(avl_tree1)).eql(misc_utilities.function_spec_function(avlt_test(avl_tree2)))) && (NIL != avl_tree_nodes_equalP(avlt_root(avl_tree1), avlt_root(avl_tree2), test)));
    }

    public static SubLObject list_to_avl_tree(final SubLObject list, final SubLObject sort_test) {
        final SubLObject avl_tree = new_avl_tree(sort_test);
        SubLObject cdolist_list_var = list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            avl_tree_insert(avl_tree, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return avl_tree;
    }

    public static SubLObject new_avl_tree_iterator(final SubLObject avl_tree, SubLObject least, SubLObject greatest, SubLObject direction) {
        if (least == UNPROVIDED) {
            least = NIL;
        }
        if (greatest == UNPROVIDED) {
            greatest = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        return iteration.new_iterator(avl_tree_iterator_state(avl_tree, least, greatest, direction), AVL_TREE_ITERATOR_DONE, AVL_TREE_ITERATOR_NEXT, TRUE);
    }

    public static SubLObject new_avl_tree_sbhl_iterator(final SubLObject avl_tree, SubLObject least, SubLObject greatest, SubLObject direction) {
        if (least == UNPROVIDED) {
            least = NIL;
        }
        if (greatest == UNPROVIDED) {
            greatest = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        return new_sbhl_iterator(avl_tree_iterator_state(avl_tree, least, greatest, direction), SBHL_AVL_TREE_ITERATOR_DONE, SBHL_AVL_TREE_ITERATOR_NEXT, TRUE);
    }

    public static SubLObject cfasl_output_object_avl_tree_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_avl_tree(v_object, stream);
    }

    public static SubLObject cfasl_output_avl_tree(final SubLObject avl_tree, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_avl_tree$.getGlobalValue(), stream);
        final SubLObject root = avlt_root(avl_tree);
        final SubLObject test = avlt_test(avl_tree);
        final SubLObject size = avlt_size(avl_tree);
        cfasl_output(root, stream);
        cfasl_output(test, stream);
        cfasl_output(size, stream);
        return avl_tree;
    }

    public static SubLObject cfasl_input_avl_tree(final SubLObject stream) {
        final SubLObject root = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject avl_tree = NIL;
        avl_tree = make_avl_tree(UNPROVIDED);
        _csetf_avlt_root(avl_tree, root);
        _csetf_avlt_test(avl_tree, test);
        _csetf_avlt_size(avl_tree, size);
        return avl_tree;
    }

    public static SubLObject avl_tree_balancedP(final SubLObject avl_tree) {
        return avl_tree_balancedP_int(avlt_root(avl_tree));
    }

    public static SubLObject avl_tree_balancedP_int(final SubLObject node) {
        return makeBoolean((NIL == node) || (((NIL != subl_promotions.memberP(avl_tree_node_balance(node), $list109, symbol_function(EQL), UNPROVIDED)) && (NIL != avl_tree_balancedP_int(avl_tree_node_lower(node)))) && (NIL != avl_tree_balancedP_int(avl_tree_node_higher(node)))));
    }

    public static SubLObject avl_tree_height(final SubLObject avl_tree) {
        return avl_tree_node_height(avlt_root(avl_tree));
    }

    public static SubLObject avl_tree_node_height(final SubLObject node) {
        return NIL != node ? number_utilities.f_1X(max(avl_tree_node_height(avl_tree_node_lower(node)), avl_tree_node_height(avl_tree_node_higher(node)))) : ZERO_INTEGER;
    }

    public static SubLObject verify_avl_tree(final SubLObject avl_tree) {
        return makeBoolean((NIL != avl_tree_emptyP(avl_tree)) || (NIL != verify_avl_tree_int(avlt_root(avl_tree))));
    }

    public static SubLObject verify_avl_tree_int(final SubLObject node) {
        if (NIL == node) {
            return ZERO_INTEGER;
        }
        final SubLObject lower_depth = verify_avl_tree_int(avl_tree_node_lower(node));
        if (NIL == lower_depth) {
            return NIL;
        }
        final SubLObject higher_depth = verify_avl_tree_int(avl_tree_node_higher(node));
        if ((NIL != higher_depth) && subtract(higher_depth, lower_depth).eql(avl_tree_node_balance(node))) {
            return number_utilities.f_1X(max(higher_depth, lower_depth));
        }
        return NIL;
    }

    public static SubLObject avl_tree_less_thanP(final SubLObject avl_tree, final SubLObject item1, final SubLObject item2) {
        final SubLObject pcase_var = avl_tree_sort_test(avl_tree);
        if (pcase_var.eql($sym110$_)) {
            return numL(item1, item2);
        }
        if (pcase_var.eql($sym111$TERM__)) {
            return kb_utilities.term_L(item1, item2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($sym112$SBHL_DATE_)) {
            return sbhl_time_dates.sbhl_dateL(item1, item2);
        }
        return funcall(avl_tree_sort_test(avl_tree), item1, item2);
    }

    public static SubLObject avl_tree_greater_thanP(final SubLObject avl_tree, final SubLObject item1, final SubLObject item2) {
        return avl_tree_less_thanP(avl_tree, item2, item1);
    }

    public static SubLObject avl_tree_find_exact(final SubLObject tree, final SubLObject node, final SubLObject item) {
        if (NIL == node) {
            return NIL;
        }
        if (NIL != avl_tree_less_thanP(tree, item, avl_tree_node_data(node))) {
            return avl_tree_find_exact(tree, avl_tree_node_lower(node), item);
        }
        if (NIL != avl_tree_greater_thanP(tree, item, avl_tree_node_data(node))) {
            return avl_tree_find_exact(tree, avl_tree_node_higher(node), item);
        }
        return avl_tree_node_data(node);
    }

    public static SubLObject avl_tree_find_bounded_below(final SubLObject tree, final SubLObject node, final SubLObject item, final SubLObject strictP) {
        if (NIL == node) {
            return NIL;
        }
        if (NIL != avl_tree_less_thanP(tree, item, avl_tree_node_data(node))) {
            final SubLObject candidate = avl_tree_find_bounded_below(tree, avl_tree_node_lower(node), item, strictP);
            return NIL != candidate ? candidate : avl_tree_node_data(node);
        }
        if (NIL != avl_tree_greater_thanP(tree, item, avl_tree_node_data(node))) {
            return avl_tree_find_bounded_below(tree, avl_tree_node_higher(node), item, strictP);
        }
        return NIL != strictP ? avl_tree_find_bounded_below(tree, avl_tree_node_higher(node), item, strictP) : avl_tree_node_data(node);
    }

    public static SubLObject avl_tree_find_bounded_above(final SubLObject tree, final SubLObject node, final SubLObject item, final SubLObject strictP) {
        if (NIL == node) {
            return NIL;
        }
        if (NIL != avl_tree_greater_thanP(tree, item, avl_tree_node_data(node))) {
            final SubLObject candidate = avl_tree_find_bounded_above(tree, avl_tree_node_higher(node), item, strictP);
            return NIL != candidate ? candidate : avl_tree_node_data(node);
        }
        if (NIL != avl_tree_less_thanP(tree, item, avl_tree_node_data(node))) {
            return avl_tree_find_bounded_above(tree, avl_tree_node_lower(node), item, strictP);
        }
        return NIL != strictP ? avl_tree_find_bounded_above(tree, avl_tree_node_lower(node), item, strictP) : avl_tree_node_data(node);
    }

    public static SubLObject avl_tree_find_unbounded_below(final SubLObject node) {
        return NIL != node ? avl_tree_node_data(avl_tree_find_unbounded_below_int(node)) : NIL;
    }

    public static SubLObject avl_tree_find_unbounded_below_int(final SubLObject node) {
        return NIL != avl_tree_node_has_lower_nodeP(node) ? avl_tree_find_unbounded_below_int(avl_tree_node_lower(node)) : node;
    }

    public static SubLObject avl_tree_find_unbounded_above(final SubLObject node) {
        return NIL != node ? avl_tree_node_data(avl_tree_find_unbounded_above_int(node)) : NIL;
    }

    public static SubLObject avl_tree_find_unbounded_above_int(final SubLObject node) {
        return NIL != avl_tree_node_has_higher_nodeP(node) ? avl_tree_find_unbounded_above_int(avl_tree_node_higher(node)) : node;
    }

    public static SubLObject avl_tree_insert_and_rebalance(final SubLObject tree, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root = avlt_root(tree);
        if (NIL != root) {
            thread.resetMultipleValues();
            final SubLObject new_node = avl_tree_insert_item(tree, root, item);
            final SubLObject new_root = thread.secondMultipleValue();
            final SubLObject adjust_balanceP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return subl_promotions.values2(new_root, list_utilities.sublisp_boolean(new_node));
        }
        return subl_promotions.values2(new_avl_tree_node(item, ZERO_INTEGER, NIL, NIL), T);
    }

    public static SubLObject avl_tree_insert_item(final SubLObject tree, final SubLObject node, final SubLObject item) {
        final SubLObject data = avl_tree_node_data(node);
        if (NIL != avl_tree_less_thanP(tree, item, data)) {
            return avl_tree_insert_item_below(tree, node, item);
        }
        if (NIL != avl_tree_greater_thanP(tree, item, data)) {
            return avl_tree_insert_item_above(tree, node, item);
        }
        return subl_promotions.values3(NIL, NIL, NIL);
    }

    public static SubLObject avl_tree_insert_item_below(final SubLObject tree, final SubLObject node, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != avl_tree_node_has_lower_nodeP(node)) {
            thread.resetMultipleValues();
            final SubLObject new_node = avl_tree_insert_item(tree, avl_tree_node_lower(node), item);
            final SubLObject new_child = thread.secondMultipleValue();
            final SubLObject adjust_balanceP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == new_node) {
                return subl_promotions.values3(NIL, NIL, NIL);
            }
            if (NIL != new_child) {
                reset_avl_tree_node_lower(node, new_child);
            }
            if (NIL == adjust_balanceP) {
                return subl_promotions.values3(new_node, NIL, NIL);
            }
            decrement_avl_tree_node_balance(node, UNPROVIDED);
            final SubLObject pcase_var = avl_tree_node_balance(node);
            if (pcase_var.eql($int$_2)) {
                final SubLObject replacement_node = avl_tree_rebalance_at_node_negative(node);
                return subl_promotions.values3(new_node, replacement_node, NIL);
            }
            if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, T);
            }
            if (pcase_var.eql(ZERO_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, NIL);
            }
            return Errors.error($str114$AVL_tree__a_is_corrupt_, tree);
        } else {
            final SubLObject new_node = new_avl_tree_node(item, ZERO_INTEGER, NIL, NIL);
            reset_avl_tree_node_lower(node, new_node);
            decrement_avl_tree_node_balance(node, UNPROVIDED);
            final SubLObject pcase_var2 = avl_tree_node_balance(node);
            if (pcase_var2.eql(MINUS_ONE_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, T);
            }
            if (pcase_var2.eql(ZERO_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, NIL);
            }
            return Errors.error($str114$AVL_tree__a_is_corrupt_, tree);
        }
    }

    public static SubLObject avl_tree_insert_item_above(final SubLObject tree, final SubLObject node, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != avl_tree_node_has_higher_nodeP(node)) {
            thread.resetMultipleValues();
            final SubLObject new_node = avl_tree_insert_item(tree, avl_tree_node_higher(node), item);
            final SubLObject new_child = thread.secondMultipleValue();
            final SubLObject adjust_balanceP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL == new_node) {
                return subl_promotions.values3(NIL, NIL, NIL);
            }
            if (NIL != new_child) {
                reset_avl_tree_node_higher(node, new_child);
            }
            if (NIL == adjust_balanceP) {
                return subl_promotions.values3(new_node, NIL, NIL);
            }
            increment_avl_tree_node_balance(node, UNPROVIDED);
            final SubLObject pcase_var = avl_tree_node_balance(node);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, NIL);
            }
            if (pcase_var.eql(ONE_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, T);
            }
            if (pcase_var.eql(TWO_INTEGER)) {
                final SubLObject replacement_node = avl_tree_rebalance_at_node_positive(node);
                return subl_promotions.values3(new_node, replacement_node, NIL);
            }
            return Errors.error($str115$AVL_tree__a_is_corrupt, tree);
        } else {
            final SubLObject new_node = new_avl_tree_node(item, ZERO_INTEGER, NIL, NIL);
            reset_avl_tree_node_higher(node, new_node);
            increment_avl_tree_node_balance(node, UNPROVIDED);
            final SubLObject pcase_var2 = avl_tree_node_balance(node);
            if (pcase_var2.eql(ZERO_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, NIL);
            }
            if (pcase_var2.eql(ONE_INTEGER)) {
                return subl_promotions.values3(new_node, NIL, T);
            }
            return Errors.error($str114$AVL_tree__a_is_corrupt_, tree);
        }
    }

    public static SubLObject avl_tree_remove_and_rebalance(final SubLObject tree, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root = avlt_root(tree);
        if (NIL != root) {
            thread.resetMultipleValues();
            final SubLObject new_root = avl_tree_remove_item(tree, root, item);
            final SubLObject updatedP = thread.secondMultipleValue();
            final SubLObject adjust_balanceP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return subl_promotions.values2(new_root, updatedP);
        }
        return subl_promotions.values2(NIL, NIL);
    }

    public static SubLObject avl_tree_remove_item(final SubLObject tree, final SubLObject node, final SubLObject item) {
        if (NIL != avl_tree_less_thanP(tree, item, avl_tree_node_data(node))) {
            return avl_tree_remove_item_below(tree, node, item);
        }
        if (NIL != avl_tree_greater_thanP(tree, item, avl_tree_node_data(node))) {
            return avl_tree_remove_item_above(tree, node, item);
        }
        return avl_tree_remove_node(node);
    }

    public static SubLObject avl_tree_remove_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lower = avl_tree_node_lower(node);
        SubLObject higher = avl_tree_node_higher(node);
        if (NIL == higher) {
            return subl_promotions.values3(lower, T, T);
        }
        if (NIL != avl_tree_node_has_lower_nodeP(higher)) {
            thread.resetMultipleValues();
            SubLObject new_node = avl_tree_remove_node_int(node, higher);
            SubLObject adjust_balanceP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != adjust_balanceP) {
                SubLObject pcase_var = avl_tree_node_balance(higher);
                if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                    reset_avl_tree_node_balance(higher, ZERO_INTEGER);
                } else
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        reset_avl_tree_node_balance(higher, ONE_INTEGER);
                        adjust_balanceP = NIL;
                    } else
                        if (pcase_var.eql(ONE_INTEGER)) {
                            reset_avl_tree_node_balance(higher, TWO_INTEGER);
                            final SubLObject new_higher = avl_tree_rebalance_at_node_positive(higher);
                            reset_avl_tree_node_higher(new_node, new_higher);
                            adjust_balanceP = makeBoolean(!MINUS_ONE_INTEGER.eql(avl_tree_node_balance(new_higher)));
                        }


                if (NIL != adjust_balanceP) {
                    pcase_var = avl_tree_node_balance(new_node);
                    if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                        reset_avl_tree_node_balance(new_node, $int$_2);
                        new_node = avl_tree_rebalance_at_node_negative(new_node);
                        adjust_balanceP = makeBoolean(!ONE_INTEGER.eql(avl_tree_node_balance(new_node)));
                    } else
                        if (pcase_var.eql(ZERO_INTEGER)) {
                            reset_avl_tree_node_balance(new_node, MINUS_ONE_INTEGER);
                            adjust_balanceP = NIL;
                        } else
                            if (pcase_var.eql(ONE_INTEGER)) {
                                reset_avl_tree_node_balance(new_node, ZERO_INTEGER);
                            }


                }
            }
            return subl_promotions.values3(new_node, T, adjust_balanceP);
        }
        reset_avl_tree_node_lower(higher, lower);
        final SubLObject pcase_var2 = avl_tree_node_balance(node);
        if (pcase_var2.eql(MINUS_ONE_INTEGER)) {
            reset_avl_tree_node_balance(higher, $int$_2);
            higher = avl_tree_rebalance_at_node_negative(higher);
            return subl_promotions.values3(higher, T, makeBoolean(!ONE_INTEGER.eql(avl_tree_node_balance(higher))));
        }
        if (pcase_var2.eql(ZERO_INTEGER)) {
            reset_avl_tree_node_balance(higher, MINUS_ONE_INTEGER);
            return subl_promotions.values3(higher, T, NIL);
        }
        if (pcase_var2.eql(ONE_INTEGER)) {
            reset_avl_tree_node_balance(higher, ZERO_INTEGER);
            return subl_promotions.values3(higher, T, T);
        }
        return NIL;
    }

    public static SubLObject avl_tree_remove_node_int(final SubLObject dead_node, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lower = avl_tree_node_lower(node);
        if (NIL != avl_tree_node_has_lower_nodeP(lower)) {
            thread.resetMultipleValues();
            final SubLObject result_node = avl_tree_remove_node_int(dead_node, lower);
            SubLObject adjust_balanceP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != adjust_balanceP) {
                final SubLObject pcase_var = avl_tree_node_balance(lower);
                if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                    reset_avl_tree_node_balance(lower, ZERO_INTEGER);
                } else
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        reset_avl_tree_node_balance(lower, ONE_INTEGER);
                        adjust_balanceP = NIL;
                    } else
                        if (pcase_var.eql(ONE_INTEGER)) {
                            reset_avl_tree_node_balance(lower, TWO_INTEGER);
                            final SubLObject new_lower = avl_tree_rebalance_at_node_positive(lower);
                            reset_avl_tree_node_lower(node, new_lower);
                            if (MINUS_ONE_INTEGER.eql(avl_tree_node_balance(new_lower))) {
                                adjust_balanceP = NIL;
                            }
                        }


            }
            return subl_promotions.values2(result_node, adjust_balanceP);
        }
        reset_avl_tree_node_lower(lower, avl_tree_node_lower(dead_node));
        reset_avl_tree_node_lower(node, avl_tree_node_higher(lower));
        reset_avl_tree_node_higher(lower, avl_tree_node_higher(dead_node));
        reset_avl_tree_node_balance(lower, avl_tree_node_balance(dead_node));
        return subl_promotions.values2(lower, T);
    }

    public static SubLObject avl_tree_remove_item_below(final SubLObject tree, final SubLObject node, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == avl_tree_node_has_lower_nodeP(node)) {
            return subl_promotions.values3(NIL, NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject new_lower = avl_tree_remove_item(tree, avl_tree_node_lower(node), item);
        final SubLObject updatedP = thread.secondMultipleValue();
        SubLObject adjust_balanceP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != updatedP) {
            SubLObject result_node = node;
            reset_avl_tree_node_lower(node, new_lower);
            if (NIL != adjust_balanceP) {
                final SubLObject pcase_var = avl_tree_node_balance(node);
                if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                    reset_avl_tree_node_balance(node, ZERO_INTEGER);
                } else
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        reset_avl_tree_node_balance(node, ONE_INTEGER);
                        adjust_balanceP = NIL;
                    } else
                        if (pcase_var.eql(ONE_INTEGER)) {
                            reset_avl_tree_node_balance(node, TWO_INTEGER);
                            result_node = avl_tree_rebalance_at_node_positive(node);
                            adjust_balanceP = makeBoolean(!MINUS_ONE_INTEGER.eql(avl_tree_node_balance(result_node)));
                        }


            }
            return subl_promotions.values3(result_node, T, adjust_balanceP);
        }
        return subl_promotions.values3(NIL, NIL, NIL);
    }

    public static SubLObject avl_tree_remove_item_above(final SubLObject tree, final SubLObject node, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == avl_tree_node_has_higher_nodeP(node)) {
            return subl_promotions.values3(NIL, NIL, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject new_higher = avl_tree_remove_item(tree, avl_tree_node_higher(node), item);
        final SubLObject updatedP = thread.secondMultipleValue();
        SubLObject adjust_balanceP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != updatedP) {
            SubLObject result_node = node;
            reset_avl_tree_node_higher(node, new_higher);
            if (NIL != adjust_balanceP) {
                final SubLObject pcase_var = avl_tree_node_balance(node);
                if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                    reset_avl_tree_node_balance(node, $int$_2);
                    result_node = avl_tree_rebalance_at_node_negative(node);
                    adjust_balanceP = makeBoolean(!ONE_INTEGER.eql(avl_tree_node_balance(result_node)));
                } else
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        reset_avl_tree_node_balance(node, MINUS_ONE_INTEGER);
                        adjust_balanceP = NIL;
                    } else
                        if (pcase_var.eql(ONE_INTEGER)) {
                            reset_avl_tree_node_balance(node, ZERO_INTEGER);
                        }


            }
            return subl_promotions.values3(result_node, T, adjust_balanceP);
        }
        return subl_promotions.values3(NIL, NIL, NIL);
    }

    public static SubLObject avl_tree_rebalance_at_node_negative(final SubLObject node) {
        final SubLObject child = avl_tree_node_lower(node);
        final SubLObject child_higher = avl_tree_node_higher(child);
        final SubLObject pcase_var = avl_tree_node_balance(child);
        if (pcase_var.eql(MINUS_ONE_INTEGER)) {
            reset_avl_tree_node_higher(child, node);
            reset_avl_tree_node_lower(node, child_higher);
            reset_avl_tree_node_balance(child, ZERO_INTEGER);
            reset_avl_tree_node_balance(node, ZERO_INTEGER);
            return child;
        }
        if (pcase_var.eql(ZERO_INTEGER)) {
            reset_avl_tree_node_higher(child, node);
            reset_avl_tree_node_lower(node, child_higher);
            reset_avl_tree_node_balance(child, ONE_INTEGER);
            reset_avl_tree_node_balance(node, MINUS_ONE_INTEGER);
            return child;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            reset_avl_tree_node_higher(child, avl_tree_node_lower(child_higher));
            reset_avl_tree_node_lower(node, avl_tree_node_higher(child_higher));
            reset_avl_tree_node_higher(child_higher, node);
            reset_avl_tree_node_lower(child_higher, child);
            final SubLObject pcase_var_$4 = avl_tree_node_balance(child_higher);
            if (pcase_var_$4.eql(MINUS_ONE_INTEGER)) {
                reset_avl_tree_node_balance(node, ONE_INTEGER);
                reset_avl_tree_node_balance(child, ZERO_INTEGER);
            } else
                if (pcase_var_$4.eql(ZERO_INTEGER)) {
                    reset_avl_tree_node_balance(node, ZERO_INTEGER);
                    reset_avl_tree_node_balance(child, ZERO_INTEGER);
                } else
                    if (pcase_var_$4.eql(ONE_INTEGER)) {
                        reset_avl_tree_node_balance(node, ZERO_INTEGER);
                        reset_avl_tree_node_balance(child, MINUS_ONE_INTEGER);
                    }


            reset_avl_tree_node_balance(child_higher, ZERO_INTEGER);
            return child_higher;
        }
        return NIL;
    }

    public static SubLObject avl_tree_rebalance_at_node_positive(final SubLObject node) {
        final SubLObject child = avl_tree_node_higher(node);
        final SubLObject child_lower = avl_tree_node_lower(child);
        final SubLObject pcase_var = avl_tree_node_balance(child);
        if (pcase_var.eql(MINUS_ONE_INTEGER)) {
            reset_avl_tree_node_lower(child, avl_tree_node_higher(child_lower));
            reset_avl_tree_node_higher(node, avl_tree_node_lower(child_lower));
            reset_avl_tree_node_lower(child_lower, node);
            reset_avl_tree_node_higher(child_lower, child);
            final SubLObject pcase_var_$5 = avl_tree_node_balance(child_lower);
            if (pcase_var_$5.eql(MINUS_ONE_INTEGER)) {
                reset_avl_tree_node_balance(node, ZERO_INTEGER);
                reset_avl_tree_node_balance(child, ONE_INTEGER);
            } else
                if (pcase_var_$5.eql(ZERO_INTEGER)) {
                    reset_avl_tree_node_balance(node, ZERO_INTEGER);
                    reset_avl_tree_node_balance(child, ZERO_INTEGER);
                } else
                    if (pcase_var_$5.eql(ONE_INTEGER)) {
                        reset_avl_tree_node_balance(node, MINUS_ONE_INTEGER);
                        reset_avl_tree_node_balance(child, ZERO_INTEGER);
                    }


            reset_avl_tree_node_balance(child_lower, ZERO_INTEGER);
            return child_lower;
        }
        if (pcase_var.eql(ZERO_INTEGER)) {
            reset_avl_tree_node_lower(child, node);
            reset_avl_tree_node_higher(node, child_lower);
            reset_avl_tree_node_balance(child, MINUS_ONE_INTEGER);
            reset_avl_tree_node_balance(node, ONE_INTEGER);
            return child;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            reset_avl_tree_node_lower(child, node);
            reset_avl_tree_node_higher(node, child_lower);
            reset_avl_tree_node_balance(child, ZERO_INTEGER);
            reset_avl_tree_node_balance(node, ZERO_INTEGER);
            return child;
        }
        return NIL;
    }

    public static SubLObject avl_tree_iterator_state(final SubLObject avl_tree, final SubLObject least, final SubLObject greatest, final SubLObject direction) {
        final SubLObject stack = stacks.create_stack();
        final SubLObject end = (direction == $FORWARD) ? greatest : least;
        if (((NIL == least) || (NIL == greatest)) || (NIL == avl_tree_greater_thanP(avl_tree, least, greatest))) {
            if (direction == $FORWARD) {
                initialize_avl_tree_iterator_stack_forward(avl_tree, avlt_root(avl_tree), stack, least, greatest);
            } else {
                initialize_avl_tree_iterator_stack_backward(avl_tree, avlt_root(avl_tree), stack, least, greatest);
            }
        }
        return list(avl_tree, stack, end, direction);
    }

    public static SubLObject initialize_avl_tree_iterator_stack_forward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject least, final SubLObject greatest) {
        if (NIL == node) {
            return stack;
        }
        if (NIL == least) {
            if ((NIL == greatest) || (NIL == avl_tree_greater_thanP(tree, avl_tree_node_data(node), greatest))) {
                stacks.stack_push(node, stack);
            }
            return initialize_avl_tree_iterator_stack_forward(tree, avl_tree_node_lower(node), stack, least, greatest);
        }
        if (NIL != avl_tree_less_thanP(tree, least, avl_tree_node_data(node))) {
            if ((NIL == greatest) || (NIL == avl_tree_greater_thanP(tree, avl_tree_node_data(node), greatest))) {
                stacks.stack_push(node, stack);
            }
            return initialize_avl_tree_iterator_stack_forward(tree, avl_tree_node_lower(node), stack, least, greatest);
        }
        if (NIL != avl_tree_greater_thanP(tree, least, avl_tree_node_data(node))) {
            return initialize_avl_tree_iterator_stack_forward(tree, avl_tree_node_higher(node), stack, least, greatest);
        }
        stacks.stack_push(node, stack);
        return stack;
    }

    public static SubLObject initialize_avl_tree_iterator_stack_backward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject least, final SubLObject greatest) {
        if (NIL == node) {
            return stack;
        }
        if (NIL == greatest) {
            if ((NIL == least) || (NIL == avl_tree_less_thanP(tree, avl_tree_node_data(node), least))) {
                stacks.stack_push(node, stack);
            }
            return initialize_avl_tree_iterator_stack_backward(tree, avl_tree_node_higher(node), stack, least, greatest);
        }
        if (NIL != avl_tree_greater_thanP(tree, greatest, avl_tree_node_data(node))) {
            if ((NIL == least) || (NIL == avl_tree_less_thanP(tree, avl_tree_node_data(node), least))) {
                stacks.stack_push(node, stack);
            }
            return initialize_avl_tree_iterator_stack_backward(tree, avl_tree_node_higher(node), stack, least, greatest);
        }
        if (NIL != avl_tree_less_thanP(tree, greatest, avl_tree_node_data(node))) {
            return initialize_avl_tree_iterator_stack_backward(tree, avl_tree_node_lower(node), stack, least, greatest);
        }
        stacks.stack_push(node, stack);
        return stack;
    }

    public static SubLObject avl_tree_iterator_done(final SubLObject state) {
        SubLObject tree = NIL;
        SubLObject stack = NIL;
        SubLObject end = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(state, state, $list116);
        tree = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list116);
        stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list116);
        end = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list116);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            return stacks.stack_empty_p(stack);
        }
        cdestructuring_bind_error(state, $list116);
        return NIL;
    }

    public static SubLObject avl_tree_iterator_next(final SubLObject state) {
        SubLObject tree = NIL;
        SubLObject stack = NIL;
        SubLObject end = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(state, state, $list116);
        tree = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list116);
        stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list116);
        end = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list116);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject node = stacks.stack_pop(stack);
            final SubLObject data = avl_tree_node_data(node);
            if (direction == $FORWARD) {
                if ((NIL == end) || (NIL != avl_tree_less_thanP(tree, data, end))) {
                    avl_tree_iterator_next_forward(tree, avl_tree_node_higher(node), stack, end);
                }
            } else
                if ((NIL == end) || (NIL != avl_tree_greater_thanP(tree, data, end))) {
                    avl_tree_iterator_next_backward(tree, avl_tree_node_lower(node), stack, end);
                }

            return subl_promotions.values3(data, state, sublisp_null(data));
        }
        cdestructuring_bind_error(state, $list116);
        return NIL;
    }

    public static SubLObject avl_tree_iterator_next_forward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject end) {
        if (NIL != node) {
            if ((NIL == end) || (NIL == avl_tree_greater_thanP(tree, avl_tree_node_data(node), end))) {
                stacks.stack_push(node, stack);
            }
            avl_tree_iterator_next_forward(tree, avl_tree_node_lower(node), stack, end);
        }
        return stack;
    }

    public static SubLObject avl_tree_iterator_next_backward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject end) {
        if (NIL != node) {
            if ((NIL == end) || (NIL == avl_tree_less_thanP(tree, avl_tree_node_data(node), end))) {
                stacks.stack_push(node, stack);
            }
            avl_tree_iterator_next_backward(tree, avl_tree_node_higher(node), stack, end);
        }
        return stack;
    }

    public static SubLObject sbhl_avl_tree_iterator_done(final SubLObject state) {
        return avl_tree_iterator_done(state);
    }

    public static SubLObject sbhl_avl_tree_iterator_next(final SubLObject state) {
        SubLObject tree = NIL;
        SubLObject stack = NIL;
        SubLObject end = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(state, state, $list116);
        tree = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list116);
        stack = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list116);
        end = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list116);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject node = stacks.stack_pop(stack);
            SubLObject data = NIL;
            if (NIL != node) {
                data = avl_tree_node_data(node);
                if (direction == $FORWARD) {
                    if ((NIL == end) || (NIL != avl_tree_less_thanP(tree, data, end))) {
                        avl_tree_iterator_next_forward(tree, avl_tree_node_higher(node), stack, end);
                    }
                } else
                    if ((NIL == end) || (NIL != avl_tree_greater_thanP(tree, data, end))) {
                        avl_tree_iterator_next_backward(tree, avl_tree_node_lower(node), stack, end);
                    }

            }
            return data;
        }
        cdestructuring_bind_error(state, $list116);
        return NIL;
    }

    public static SubLObject avl_tree_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_avl_tree_node(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject avl_tree_node_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$avl_tree_node_native.class ? T : NIL;
    }

    public static SubLObject avltn_data(final SubLObject v_object) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject avltn_balance(final SubLObject v_object) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject avltn_lower(final SubLObject v_object) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject avltn_higher(final SubLObject v_object) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_avltn_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_avltn_balance(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_avltn_lower(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_avltn_higher(final SubLObject v_object, final SubLObject value) {
        assert NIL != avl_tree_node_p(v_object) : "binary_tree.avl_tree_node_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_avl_tree_node(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $avl_tree_node_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DATA)) {
                _csetf_avltn_data(v_new, current_value);
            } else
                if (pcase_var.eql($BALANCE)) {
                    _csetf_avltn_balance(v_new, current_value);
                } else
                    if (pcase_var.eql($LOWER)) {
                        _csetf_avltn_lower(v_new, current_value);
                    } else
                        if (pcase_var.eql($HIGHER)) {
                            _csetf_avltn_higher(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_avl_tree_node(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AVL_TREE_NODE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DATA, avltn_data(obj));
        funcall(visitor_fn, obj, $SLOT, $BALANCE, avltn_balance(obj));
        funcall(visitor_fn, obj, $SLOT, $LOWER, avltn_lower(obj));
        funcall(visitor_fn, obj, $SLOT, $HIGHER, avltn_higher(obj));
        funcall(visitor_fn, obj, $END, MAKE_AVL_TREE_NODE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_avl_tree_node_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_avl_tree_node(obj, visitor_fn);
    }

    public static SubLObject print_avl_tree_node(final SubLObject avl_tree_node, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(avl_tree_node, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, avl_tree_node, T, T);
            if (NIL != $print_avl_tree_node_dataP$.getDynamicValue(thread)) {
                format(stream, $str138$__a_, avltn_data(avl_tree_node));
            }
            print_macros.print_unreadable_object_postamble(stream, avl_tree_node, T, T);
        }
        return avl_tree_node;
    }

    public static SubLObject new_avl_tree_node(final SubLObject data, SubLObject balance, SubLObject lower, SubLObject higher) {
        if (balance == UNPROVIDED) {
            balance = ZERO_INTEGER;
        }
        if (lower == UNPROVIDED) {
            lower = NIL;
        }
        if (higher == UNPROVIDED) {
            higher = NIL;
        }
        final SubLObject node = make_avl_tree_node(UNPROVIDED);
        _csetf_avltn_data(node, data);
        _csetf_avltn_balance(node, balance);
        _csetf_avltn_lower(node, lower);
        _csetf_avltn_higher(node, higher);
        return node;
    }

    public static SubLObject avl_tree_node_data(final SubLObject avl_tree_node) {
        return avltn_data(avl_tree_node);
    }

    public static SubLObject avl_tree_node_balance(final SubLObject avl_tree_node) {
        return avltn_balance(avl_tree_node);
    }

    public static SubLObject avl_tree_node_lower(final SubLObject avl_tree_node) {
        return avltn_lower(avl_tree_node);
    }

    public static SubLObject avl_tree_node_higher(final SubLObject avl_tree_node) {
        return avltn_higher(avl_tree_node);
    }

    public static SubLObject increment_avl_tree_node_balance(final SubLObject avl_tree_node, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        _csetf_avltn_balance(avl_tree_node, add(avltn_balance(avl_tree_node), delta));
        return avl_tree_node;
    }

    public static SubLObject decrement_avl_tree_node_balance(final SubLObject avl_tree_node, SubLObject delta) {
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        _csetf_avltn_balance(avl_tree_node, subtract(avltn_balance(avl_tree_node), delta));
        return avl_tree_node;
    }

    public static SubLObject reset_avl_tree_node_balance(final SubLObject avl_tree_node, final SubLObject balance) {
        _csetf_avltn_balance(avl_tree_node, balance);
        return avl_tree_node;
    }

    public static SubLObject reset_avl_tree_node_lower(final SubLObject avl_tree_node, final SubLObject lower) {
        _csetf_avltn_lower(avl_tree_node, lower);
        return avl_tree_node;
    }

    public static SubLObject reset_avl_tree_node_higher(final SubLObject avl_tree_node, final SubLObject higher) {
        _csetf_avltn_higher(avl_tree_node, higher);
        return avl_tree_node;
    }

    public static SubLObject avl_tree_node_has_lower_nodeP(final SubLObject avl_tree_node) {
        return list_utilities.sublisp_boolean(avltn_lower(avl_tree_node));
    }

    public static SubLObject avl_tree_node_has_higher_nodeP(final SubLObject avl_tree_node) {
        return list_utilities.sublisp_boolean(avltn_higher(avl_tree_node));
    }

    public static SubLObject print_avl_tree_node_contents(final SubLObject avl_tree_node, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str139$__Data______a, avltn_data(avl_tree_node));
        format(stream, $str140$__Balance___a, avltn_balance(avl_tree_node));
        format(stream, $str141$__Lower_____a, avltn_lower(avl_tree_node));
        format(stream, $str142$__Higher____a, avltn_higher(avl_tree_node));
        format(stream, $str143$__);
        return NIL;
    }

    public static SubLObject copy_avl_tree_node(final SubLObject avl_tree_node) {
        final SubLObject data = avltn_data(avl_tree_node);
        final SubLObject balance = avltn_balance(avl_tree_node);
        SubLObject lower = avltn_lower(avl_tree_node);
        SubLObject higher = avltn_higher(avl_tree_node);
        if (NIL != avl_tree_node_p(lower)) {
            lower = copy_avl_tree_node(lower);
        }
        if (NIL != avl_tree_node_p(higher)) {
            higher = copy_avl_tree_node(higher);
        }
        return new_avl_tree_node(data, balance, lower, higher);
    }

    public static SubLObject avl_tree_nodes_equalP(final SubLObject avl_tree_node1, final SubLObject avl_tree_node2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (NIL == avl_tree_node1) {
            return sublisp_null(avl_tree_node2);
        }
        if (NIL == avl_tree_node2) {
            return NIL;
        }
        return makeBoolean(((NIL != funcall(test, avltn_data(avl_tree_node1), avltn_data(avl_tree_node2))) && (NIL != avl_tree_nodes_equalP(avltn_lower(avl_tree_node1), avltn_lower(avl_tree_node2), test))) && (NIL != avl_tree_nodes_equalP(avltn_higher(avl_tree_node1), avltn_higher(avl_tree_node2), test)));
    }

    public static SubLObject cfasl_output_object_avl_tree_node_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_avl_tree_node(v_object, stream);
    }

    public static SubLObject cfasl_output_avl_tree_node(final SubLObject node, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_avl_tree_node$.getGlobalValue(), stream);
        final SubLObject data = avltn_data(node);
        final SubLObject balance = avltn_balance(node);
        final SubLObject lower = avltn_lower(node);
        final SubLObject higher = avltn_higher(node);
        cfasl_output(data, stream);
        cfasl_output(balance, stream);
        cfasl_output(lower, stream);
        cfasl_output(higher, stream);
        return node;
    }

    public static SubLObject cfasl_input_avl_tree_node(final SubLObject stream) {
        final SubLObject data = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject balance = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject lower = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject higher = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject node = NIL;
        node = make_avl_tree_node(UNPROVIDED);
        _csetf_avltn_data(node, data);
        _csetf_avltn_balance(node, balance);
        _csetf_avltn_lower(node, lower);
        _csetf_avltn_higher(node, higher);
        return node;
    }

    public static SubLObject declare_binary_tree_file() {
        declareFunction(me, "btree_print_function_trampoline", "BTREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "btree_p", "BTREE-P", 1, 0, false);
        new binary_tree.$btree_p$UnaryFunction();
        declareFunction(me, "bt_tag", "BT-TAG", 1, 0, false);
        declareFunction(me, "bt_state", "BT-STATE", 1, 0, false);
        declareFunction(me, "bt_lower", "BT-LOWER", 1, 0, false);
        declareFunction(me, "bt_higher", "BT-HIGHER", 1, 0, false);
        declareFunction(me, "_csetf_bt_tag", "_CSETF-BT-TAG", 2, 0, false);
        declareFunction(me, "_csetf_bt_state", "_CSETF-BT-STATE", 2, 0, false);
        declareFunction(me, "_csetf_bt_lower", "_CSETF-BT-LOWER", 2, 0, false);
        declareFunction(me, "_csetf_bt_higher", "_CSETF-BT-HIGHER", 2, 0, false);
        declareFunction(me, "make_btree", "MAKE-BTREE", 0, 1, false);
        declareFunction(me, "visit_defstruct_btree", "VISIT-DEFSTRUCT-BTREE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_btree_method", "VISIT-DEFSTRUCT-OBJECT-BTREE-METHOD", 2, 0, false);
        declareFunction(me, "print_btree", "PRINT-BTREE", 3, 0, false);
        declareFunction(me, "make_static_btree", "MAKE-STATIC-BTREE", 0, 0, false);
        declareFunction(me, "init_btree", "INIT-BTREE", 1, 0, false);
        declareFunction(me, "free_btree_p", "FREE-BTREE-P", 1, 0, false);
        declareFunction(me, "free_btree", "FREE-BTREE", 1, 0, false);
        declareFunction(me, "get_btree", "GET-BTREE", 0, 0, false);
        declareFunction(me, "free_entire_btree", "FREE-ENTIRE-BTREE", 1, 0, false);
        declareMacro(me, "do_btree_index", "DO-BTREE-INDEX");
        declareFunction(me, "do_btree_index_key", "DO-BTREE-INDEX-KEY", 1, 0, false);
        declareFunction(me, "do_btree_index_value", "DO-BTREE-INDEX-VALUE", 1, 0, false);
        declareMacro(me, "do_btree", "DO-BTREE");
        declareFunction(me, "do_btree_lower", "DO-BTREE-LOWER", 1, 0, false);
        declareFunction(me, "do_btree_higher", "DO-BTREE-HIGHER", 1, 0, false);
        declareFunction(me, "btree_insert", "BTREE-INSERT", 5, 0, false);
        declareFunction(me, "btree_remove", "BTREE-REMOVE", 5, 1, false);
        declareFunction(me, "btree_find", "BTREE-FIND", 3, 0, false);
        declareFunction(me, "btree_find_best", "BTREE-FIND-BEST", 1, 0, false);
        declareFunction(me, "btree_find_worst", "BTREE-FIND-WORST", 1, 0, false);
        declareFunction(me, "map_btree", "MAP-BTREE", 2, 2, false);
        declareFunction(me, "map_btree_forward", "MAP-BTREE-FORWARD", 2, 2, false);
        declareFunction(me, "map_btree_backward", "MAP-BTREE-BACKWARD", 2, 2, false);
        declareFunction(me, "gather_btree_tag", "GATHER-BTREE-TAG", 1, 0, false);
        declareFunction(me, "btree_tags", "BTREE-TAGS", 1, 0, false);
        declareFunction(me, "btree_node_count", "BTREE-NODE-COUNT", 1, 0, false);
        declareFunction(me, "btree_deepest_depth", "BTREE-DEEPEST-DEPTH", 1, 0, false);
        declareFunction(me, "btree_shallowest_depth", "BTREE-SHALLOWEST-DEPTH", 1, 0, false);
        declareFunction(me, "btree_validate", "BTREE-VALIDATE", 2, 2, false);
        declareFunction(me, "incomparable", "INCOMPARABLE", 3, 0, false);
        declareFunction(me, "btree_find_aux", "BTREE-FIND-AUX", 3, 1, false);
        declareFunction(me, "btree_insert_aux", "BTREE-INSERT-AUX", 3, 0, false);
        declareFunction(me, "btree_remove_aux", "BTREE-REMOVE-AUX", 4, 0, false);
        declareFunction(me, "btree_insert_tree", "BTREE-INSERT-TREE", 3, 0, false);
        declareFunction(me, "cfasl_output_btree", "CFASL-OUTPUT-BTREE", 2, 0, false);
        declareFunction(me, "cfasl_output_object_btree_method", "CFASL-OUTPUT-OBJECT-BTREE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_input_btree", "CFASL-INPUT-BTREE", 1, 0, false);
        declareFunction(me, "cfasl_input_legacy_btree_low", "CFASL-INPUT-LEGACY-BTREE-LOW", 1, 0, false);
        declareFunction(me, "cfasl_input_legacy_btree_high", "CFASL-INPUT-LEGACY-BTREE-HIGH", 1, 0, false);
        declareFunction(me, "cfasl_input_legacy_btree_leaf", "CFASL-INPUT-LEGACY-BTREE-LEAF", 1, 0, false);
        declareFunction(me, "btree_balancedP", "BTREE-BALANCED?", 1, 0, false);
        declareFunction(me, "btree_balance", "BTREE-BALANCE", 1, 1, false);
        declareFunction(me, "btree_balance_insert_node", "BTREE-BALANCE-INSERT-NODE", 1, 0, false);
        declareFunction(me, "btree_balance_recursive", "BTREE-BALANCE-RECURSIVE", 3, 0, false);
        declareFunction(me, "btree_balance_split_point", "BTREE-BALANCE-SPLIT-POINT", 2, 0, false);
        declareFunction(me, "avl_tree_print_function_trampoline", "AVL-TREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "avl_tree_p", "AVL-TREE-P", 1, 0, false);
        new binary_tree.$avl_tree_p$UnaryFunction();
        declareFunction(me, "avlt_root", "AVLT-ROOT", 1, 0, false);
        declareFunction(me, "avlt_test", "AVLT-TEST", 1, 0, false);
        declareFunction(me, "avlt_size", "AVLT-SIZE", 1, 0, false);
        declareFunction(me, "_csetf_avlt_root", "_CSETF-AVLT-ROOT", 2, 0, false);
        declareFunction(me, "_csetf_avlt_test", "_CSETF-AVLT-TEST", 2, 0, false);
        declareFunction(me, "_csetf_avlt_size", "_CSETF-AVLT-SIZE", 2, 0, false);
        declareFunction(me, "make_avl_tree", "MAKE-AVL-TREE", 0, 1, false);
        declareFunction(me, "visit_defstruct_avl_tree", "VISIT-DEFSTRUCT-AVL-TREE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_avl_tree_method", "VISIT-DEFSTRUCT-OBJECT-AVL-TREE-METHOD", 2, 0, false);
        declareFunction(me, "print_avl_tree", "PRINT-AVL-TREE", 3, 0, false);
        declareFunction(me, "new_avl_tree", "NEW-AVL-TREE", 1, 0, false);
        declareFunction(me, "avl_tree_sort_test", "AVL-TREE-SORT-TEST", 1, 0, false);
        declareFunction(me, "avl_tree_size", "AVL-TREE-SIZE", 1, 0, false);
        declareFunction(me, "avl_tree_emptyP", "AVL-TREE-EMPTY?", 1, 0, false);
        declareFunction(me, "avl_tree_find", "AVL-TREE-FIND", 2, 0, false);
        declareFunction(me, "avl_tree_find_least", "AVL-TREE-FIND-LEAST", 1, 2, false);
        declareFunction(me, "avl_tree_find_greatest", "AVL-TREE-FIND-GREATEST", 1, 2, false);
        declareFunction(me, "avl_tree_insert", "AVL-TREE-INSERT", 2, 0, false);
        declareFunction(me, "avl_tree_remove", "AVL-TREE-REMOVE", 2, 0, false);
        declareFunction(me, "clear_avl_tree", "CLEAR-AVL-TREE", 1, 0, false);
        declareFunction(me, "copy_avl_tree", "COPY-AVL-TREE", 1, 0, false);
        declareFunction(me, "avl_trees_equalP", "AVL-TREES-EQUAL?", 2, 1, false);
        declareFunction(me, "list_to_avl_tree", "LIST-TO-AVL-TREE", 2, 0, false);
        declareFunction(me, "new_avl_tree_iterator", "NEW-AVL-TREE-ITERATOR", 1, 3, false);
        declareFunction(me, "new_avl_tree_sbhl_iterator", "NEW-AVL-TREE-SBHL-ITERATOR", 1, 3, false);
        declareFunction(me, "cfasl_output_object_avl_tree_method", "CFASL-OUTPUT-OBJECT-AVL-TREE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_avl_tree", "CFASL-OUTPUT-AVL-TREE", 2, 0, false);
        declareFunction(me, "cfasl_input_avl_tree", "CFASL-INPUT-AVL-TREE", 1, 0, false);
        declareFunction(me, "avl_tree_balancedP", "AVL-TREE-BALANCED?", 1, 0, false);
        declareFunction(me, "avl_tree_balancedP_int", "AVL-TREE-BALANCED?-INT", 1, 0, false);
        declareFunction(me, "avl_tree_height", "AVL-TREE-HEIGHT", 1, 0, false);
        declareFunction(me, "avl_tree_node_height", "AVL-TREE-NODE-HEIGHT", 1, 0, false);
        declareFunction(me, "verify_avl_tree", "VERIFY-AVL-TREE", 1, 0, false);
        declareFunction(me, "verify_avl_tree_int", "VERIFY-AVL-TREE-INT", 1, 0, false);
        declareFunction(me, "avl_tree_less_thanP", "AVL-TREE-LESS-THAN?", 3, 0, false);
        declareFunction(me, "avl_tree_greater_thanP", "AVL-TREE-GREATER-THAN?", 3, 0, false);
        declareFunction(me, "avl_tree_find_exact", "AVL-TREE-FIND-EXACT", 3, 0, false);
        declareFunction(me, "avl_tree_find_bounded_below", "AVL-TREE-FIND-BOUNDED-BELOW", 4, 0, false);
        declareFunction(me, "avl_tree_find_bounded_above", "AVL-TREE-FIND-BOUNDED-ABOVE", 4, 0, false);
        declareFunction(me, "avl_tree_find_unbounded_below", "AVL-TREE-FIND-UNBOUNDED-BELOW", 1, 0, false);
        declareFunction(me, "avl_tree_find_unbounded_below_int", "AVL-TREE-FIND-UNBOUNDED-BELOW-INT", 1, 0, false);
        declareFunction(me, "avl_tree_find_unbounded_above", "AVL-TREE-FIND-UNBOUNDED-ABOVE", 1, 0, false);
        declareFunction(me, "avl_tree_find_unbounded_above_int", "AVL-TREE-FIND-UNBOUNDED-ABOVE-INT", 1, 0, false);
        declareFunction(me, "avl_tree_insert_and_rebalance", "AVL-TREE-INSERT-AND-REBALANCE", 2, 0, false);
        declareFunction(me, "avl_tree_insert_item", "AVL-TREE-INSERT-ITEM", 3, 0, false);
        declareFunction(me, "avl_tree_insert_item_below", "AVL-TREE-INSERT-ITEM-BELOW", 3, 0, false);
        declareFunction(me, "avl_tree_insert_item_above", "AVL-TREE-INSERT-ITEM-ABOVE", 3, 0, false);
        declareFunction(me, "avl_tree_remove_and_rebalance", "AVL-TREE-REMOVE-AND-REBALANCE", 2, 0, false);
        declareFunction(me, "avl_tree_remove_item", "AVL-TREE-REMOVE-ITEM", 3, 0, false);
        declareFunction(me, "avl_tree_remove_node", "AVL-TREE-REMOVE-NODE", 1, 0, false);
        declareFunction(me, "avl_tree_remove_node_int", "AVL-TREE-REMOVE-NODE-INT", 2, 0, false);
        declareFunction(me, "avl_tree_remove_item_below", "AVL-TREE-REMOVE-ITEM-BELOW", 3, 0, false);
        declareFunction(me, "avl_tree_remove_item_above", "AVL-TREE-REMOVE-ITEM-ABOVE", 3, 0, false);
        declareFunction(me, "avl_tree_rebalance_at_node_negative", "AVL-TREE-REBALANCE-AT-NODE-NEGATIVE", 1, 0, false);
        declareFunction(me, "avl_tree_rebalance_at_node_positive", "AVL-TREE-REBALANCE-AT-NODE-POSITIVE", 1, 0, false);
        declareFunction(me, "avl_tree_iterator_state", "AVL-TREE-ITERATOR-STATE", 4, 0, false);
        declareFunction(me, "initialize_avl_tree_iterator_stack_forward", "INITIALIZE-AVL-TREE-ITERATOR-STACK-FORWARD", 5, 0, false);
        declareFunction(me, "initialize_avl_tree_iterator_stack_backward", "INITIALIZE-AVL-TREE-ITERATOR-STACK-BACKWARD", 5, 0, false);
        declareFunction(me, "avl_tree_iterator_done", "AVL-TREE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "avl_tree_iterator_next", "AVL-TREE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "avl_tree_iterator_next_forward", "AVL-TREE-ITERATOR-NEXT-FORWARD", 4, 0, false);
        declareFunction(me, "avl_tree_iterator_next_backward", "AVL-TREE-ITERATOR-NEXT-BACKWARD", 4, 0, false);
        declareFunction(me, "sbhl_avl_tree_iterator_done", "SBHL-AVL-TREE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "sbhl_avl_tree_iterator_next", "SBHL-AVL-TREE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "avl_tree_node_print_function_trampoline", "AVL-TREE-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "avl_tree_node_p", "AVL-TREE-NODE-P", 1, 0, false);
        new binary_tree.$avl_tree_node_p$UnaryFunction();
        declareFunction(me, "avltn_data", "AVLTN-DATA", 1, 0, false);
        declareFunction(me, "avltn_balance", "AVLTN-BALANCE", 1, 0, false);
        declareFunction(me, "avltn_lower", "AVLTN-LOWER", 1, 0, false);
        declareFunction(me, "avltn_higher", "AVLTN-HIGHER", 1, 0, false);
        declareFunction(me, "_csetf_avltn_data", "_CSETF-AVLTN-DATA", 2, 0, false);
        declareFunction(me, "_csetf_avltn_balance", "_CSETF-AVLTN-BALANCE", 2, 0, false);
        declareFunction(me, "_csetf_avltn_lower", "_CSETF-AVLTN-LOWER", 2, 0, false);
        declareFunction(me, "_csetf_avltn_higher", "_CSETF-AVLTN-HIGHER", 2, 0, false);
        declareFunction(me, "make_avl_tree_node", "MAKE-AVL-TREE-NODE", 0, 1, false);
        declareFunction(me, "visit_defstruct_avl_tree_node", "VISIT-DEFSTRUCT-AVL-TREE-NODE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_avl_tree_node_method", "VISIT-DEFSTRUCT-OBJECT-AVL-TREE-NODE-METHOD", 2, 0, false);
        declareFunction(me, "print_avl_tree_node", "PRINT-AVL-TREE-NODE", 3, 0, false);
        declareFunction(me, "new_avl_tree_node", "NEW-AVL-TREE-NODE", 1, 3, false);
        declareFunction(me, "avl_tree_node_data", "AVL-TREE-NODE-DATA", 1, 0, false);
        declareFunction(me, "avl_tree_node_balance", "AVL-TREE-NODE-BALANCE", 1, 0, false);
        declareFunction(me, "avl_tree_node_lower", "AVL-TREE-NODE-LOWER", 1, 0, false);
        declareFunction(me, "avl_tree_node_higher", "AVL-TREE-NODE-HIGHER", 1, 0, false);
        declareFunction(me, "increment_avl_tree_node_balance", "INCREMENT-AVL-TREE-NODE-BALANCE", 1, 1, false);
        declareFunction(me, "decrement_avl_tree_node_balance", "DECREMENT-AVL-TREE-NODE-BALANCE", 1, 1, false);
        declareFunction(me, "reset_avl_tree_node_balance", "RESET-AVL-TREE-NODE-BALANCE", 2, 0, false);
        declareFunction(me, "reset_avl_tree_node_lower", "RESET-AVL-TREE-NODE-LOWER", 2, 0, false);
        declareFunction(me, "reset_avl_tree_node_higher", "RESET-AVL-TREE-NODE-HIGHER", 2, 0, false);
        declareFunction(me, "avl_tree_node_has_lower_nodeP", "AVL-TREE-NODE-HAS-LOWER-NODE?", 1, 0, false);
        declareFunction(me, "avl_tree_node_has_higher_nodeP", "AVL-TREE-NODE-HAS-HIGHER-NODE?", 1, 0, false);
        declareFunction(me, "print_avl_tree_node_contents", "PRINT-AVL-TREE-NODE-CONTENTS", 1, 1, false);
        declareFunction(me, "copy_avl_tree_node", "COPY-AVL-TREE-NODE", 1, 0, false);
        declareFunction(me, "avl_tree_nodes_equalP", "AVL-TREE-NODES-EQUAL?", 2, 1, false);
        declareFunction(me, "cfasl_output_object_avl_tree_node_method", "CFASL-OUTPUT-OBJECT-AVL-TREE-NODE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_avl_tree_node", "CFASL-OUTPUT-AVL-TREE-NODE", 2, 0, false);
        declareFunction(me, "cfasl_input_avl_tree_node", "CFASL-INPUT-AVL-TREE-NODE", 1, 0, false);
        new binary_tree.$cfasl_input_avl_tree_node$UnaryFunction();
        return NIL;
    }

    public static SubLObject init_binary_tree_file() {
        defconstant("*DTP-BTREE*", BTREE);
        deflexical("*BTREE-FREE-LIST*", NIL);
        deflexical("*BTREE-FREE-LOCK*", make_lock($$$BTREE_resource_lock));
        defparameter("*VALIDATE-BTREES*", NIL);
        defparameter("*BTREE-TAGS*", NIL);
        defparameter("*BTREE-REMOVE-DEBUGGING*", NIL);
        defconstant("*CFASL-OPCODE-BTREE*", NINETEEN_INTEGER);
        defconstant("*CFASL-OPCODE-LEGACY-BTREE-LOW*", TWENTY_INTEGER);
        defconstant("*CFASL-OPCODE-LEGACY-BTREE-HIGH*", $int$21);
        defconstant("*CFASL-OPCODE-LEGACY-BTREE-LEAF*", $int$22);
        defparameter("*BTREE-BALANCE-VECTOR-INDEX*", ZERO_INTEGER);
        defparameter("*BTREE-BALANCE-VECTOR*", NIL);
        defconstant("*DTP-AVL-TREE*", AVL_TREE);
        defconstant("*CFASL-OPCODE-AVL-TREE*", $int$80);
        defparameter("*PRINT-AVL-TREE-NODE-DATA?*", T);
        defconstant("*DTP-AVL-TREE-NODE*", AVL_TREE_NODE);
        defconstant("*CFASL-OPCODE-AVL-TREE-NODE*", $int$81);
        return NIL;
    }

    public static SubLObject setup_binary_tree_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), symbol_function(BTREE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(BT_TAG, _CSETF_BT_TAG);
        def_csetf(BT_STATE, _CSETF_BT_STATE);
        def_csetf(BT_LOWER, _CSETF_BT_LOWER);
        def_csetf(BT_HIGHER, _CSETF_BT_HIGHER);
        identity(BTREE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_BTREE_METHOD));
        register_macro_helper(DO_BTREE_INDEX_KEY, DO_BTREE_INDEX);
        register_macro_helper(DO_BTREE_INDEX_VALUE, DO_BTREE_INDEX);
        register_macro_helper(DO_BTREE, DO_BTREE_INDEX);
        register_macro_helper(DO_BTREE_LOWER, DO_BTREE);
        register_macro_helper(DO_BTREE_HIGHER, DO_BTREE);
        register_cfasl_input_function($cfasl_opcode_btree$.getGlobalValue(), CFASL_INPUT_BTREE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BTREE_METHOD));
        register_cfasl_input_function($cfasl_opcode_legacy_btree_low$.getGlobalValue(), CFASL_INPUT_LEGACY_BTREE_LOW);
        register_cfasl_input_function($cfasl_opcode_legacy_btree_high$.getGlobalValue(), CFASL_INPUT_LEGACY_BTREE_HIGH);
        register_cfasl_input_function($cfasl_opcode_legacy_btree_leaf$.getGlobalValue(), CFASL_INPUT_LEGACY_BTREE_LEAF);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), symbol_function(AVL_TREE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list87);
        def_csetf(AVLT_ROOT, _CSETF_AVLT_ROOT);
        def_csetf(AVLT_TEST, _CSETF_AVLT_TEST);
        def_csetf(AVLT_SIZE, _CSETF_AVLT_SIZE);
        identity(AVL_TREE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AVL_TREE_METHOD));
        register_cfasl_input_function($cfasl_opcode_avl_tree$.getGlobalValue(), CFASL_INPUT_AVL_TREE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), symbol_function(AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list125);
        def_csetf(AVLTN_DATA, _CSETF_AVLTN_DATA);
        def_csetf(AVLTN_BALANCE, _CSETF_AVLTN_BALANCE);
        def_csetf(AVLTN_LOWER, _CSETF_AVLTN_LOWER);
        def_csetf(AVLTN_HIGHER, _CSETF_AVLTN_HIGHER);
        identity(AVL_TREE_NODE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AVL_TREE_NODE_METHOD));
        register_cfasl_input_function($cfasl_opcode_avl_tree_node$.getGlobalValue(), CFASL_INPUT_AVL_TREE_NODE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_binary_tree_file();
    }

    @Override
    public void initializeVariables() {
        init_binary_tree_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_binary_tree_file();
    }

    

    public static final class $btree_native extends SubLStructNative {
        public SubLObject $tag;

        public SubLObject $state;

        public SubLObject $lower;

        public SubLObject $higher;

        private static final SubLStructDeclNative structDecl;

        private $btree_native() {
            this.$tag = Lisp.NIL;
            this.$state = Lisp.NIL;
            this.$lower = Lisp.NIL;
            this.$higher = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$tag;
        }

        @Override
        public SubLObject getField3() {
            return this.$state;
        }

        @Override
        public SubLObject getField4() {
            return this.$lower;
        }

        @Override
        public SubLObject getField5() {
            return this.$higher;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$tag = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$lower = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$higher = value;
        }

        static {
            structDecl = makeStructDeclNative($btree_native.class, BTREE, BTREE_P, $list2, $list3, new String[]{ "$tag", "$state", "$lower", "$higher" }, $list4, $list5, PRINT_BTREE);
        }
    }

    public static final class $btree_p$UnaryFunction extends UnaryFunction {
        public $btree_p$UnaryFunction() {
            super(extractFunctionNamed("BTREE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return btree_p(arg1);
        }
    }

    public static final class $avl_tree_native extends SubLStructNative {
        public SubLObject $root;

        public SubLObject $test;

        public SubLObject $size;

        private static final SubLStructDeclNative structDecl;

        private $avl_tree_native() {
            this.$root = Lisp.NIL;
            this.$test = Lisp.NIL;
            this.$size = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$root;
        }

        @Override
        public SubLObject getField3() {
            return this.$test;
        }

        @Override
        public SubLObject getField4() {
            return this.$size;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$root = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$size = value;
        }

        static {
            structDecl = makeStructDeclNative($avl_tree_native.class, AVL_TREE, AVL_TREE_P, $list81, $list82, new String[]{ "$root", "$test", "$size" }, $list83, $list84, PRINT_AVL_TREE);
        }
    }

    public static final class $avl_tree_p$UnaryFunction extends UnaryFunction {
        public $avl_tree_p$UnaryFunction() {
            super(extractFunctionNamed("AVL-TREE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return avl_tree_p(arg1);
        }
    }

    public static final class $avl_tree_node_native extends SubLStructNative {
        public SubLObject $data;

        public SubLObject $balance;

        public SubLObject $lower;

        public SubLObject $higher;

        private static final SubLStructDeclNative structDecl;

        private $avl_tree_node_native() {
            this.$data = Lisp.NIL;
            this.$balance = Lisp.NIL;
            this.$lower = Lisp.NIL;
            this.$higher = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$data;
        }

        @Override
        public SubLObject getField3() {
            return this.$balance;
        }

        @Override
        public SubLObject getField4() {
            return this.$lower;
        }

        @Override
        public SubLObject getField5() {
            return this.$higher;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$data = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$balance = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$lower = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$higher = value;
        }

        static {
            structDecl = makeStructDeclNative($avl_tree_node_native.class, AVL_TREE_NODE, AVL_TREE_NODE_P, $list119, $list120, new String[]{ "$data", "$balance", "$lower", "$higher" }, $list121, $list122, PRINT_AVL_TREE_NODE);
        }
    }

    public static final class $avl_tree_node_p$UnaryFunction extends UnaryFunction {
        public $avl_tree_node_p$UnaryFunction() {
            super(extractFunctionNamed("AVL-TREE-NODE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return avl_tree_node_p(arg1);
        }
    }

    public static final class $cfasl_input_avl_tree_node$UnaryFunction extends UnaryFunction {
        public $cfasl_input_avl_tree_node$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-AVL-TREE-NODE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_avl_tree_node(arg1);
        }
    }
}

/**
 * Total time: 525 ms
 */
