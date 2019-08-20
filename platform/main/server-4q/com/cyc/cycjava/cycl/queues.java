/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_wide_opcode;
import static com.cyc.cycjava.cycl.cfasl.register_wide_cfasl_opcode_input_function;
import static com.cyc.cycjava.cycl.list_utilities.delete_first;
import static com.cyc.cycjava.cycl.list_utilities.first_n;
import static com.cyc.cycjava.cycl.list_utilities.last_one;
import static com.cyc.cycjava.cycl.list_utilities.nadd_to_end;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUEUES
 * source file: /cyc/top/cycl/queues.lisp
 * created:     2019/07/03 17:37:13
 */
public final class queues extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_priority_queue_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, PRIORITY_QUEUE_TEST_CASE, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_priority_queue_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_locked_priority_queue_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, LOCKED_PRIORITY_QUEUE_TEST_CASE, LP_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_locked_priority_queue_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_priority_queue_test_case_p_queue(SubLObject priority_queue_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(priority_queue_test_case, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject set_locked_priority_queue_test_case_lp_queue(SubLObject locked_priority_queue_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(locked_priority_queue_test_case, value, THREE_INTEGER, LP_QUEUE);
    }

    public static final SubLObject priority_queue_test_case_p(SubLObject priority_queue_test_case) {
        return classes.subloop_instanceof_class(priority_queue_test_case, PRIORITY_QUEUE_TEST_CASE);
    }

    public static final SubLObject locked_priority_queue_test_case_p(SubLObject locked_priority_queue_test_case) {
        return classes.subloop_instanceof_class(locked_priority_queue_test_case, LOCKED_PRIORITY_QUEUE_TEST_CASE);
    }

    public static final SubLObject get_priority_queue_test_case_p_queue(SubLObject priority_queue_test_case) {
        return classes.subloop_get_access_protected_instance_slot(priority_queue_test_case, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_locked_priority_queue_test_case_lp_queue(SubLObject locked_priority_queue_test_case) {
        return classes.subloop_get_access_protected_instance_slot(locked_priority_queue_test_case, THREE_INTEGER, LP_QUEUE);
    }

    // Definitions
    public static final class $queue_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.queues.$queue_native.this.$num;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.queues.$queue_native.this.$elements;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.queues.$queue_native.this.$last;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$queue_native.this.$num = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$queue_native.this.$elements = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$queue_native.this.$last = value;
        }

        public SubLObject $num = Lisp.NIL;

        public SubLObject $elements = Lisp.NIL;

        public SubLObject $last = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.queues.$queue_native.class, QUEUE, QUEUE_P, $list_alt2, $list_alt3, new String[]{ "$num", "$elements", "$last" }, $list_alt4, $list_alt5, PRINT_QUEUE);
    }

    public static final class $locked_queue_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.queues.$locked_queue_native.this.$lock;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.queues.$locked_queue_native.this.$queue;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$locked_queue_native.this.$lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$locked_queue_native.this.$queue = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $queue = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.queues.$locked_queue_native.class, LOCKED_QUEUE, LOCKED_QUEUE_P, $list_alt98, $list_alt99, new String[]{ "$lock", "$queue" }, $list_alt100, $list_alt101, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $lazy_priority_queue_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.this.$ordered_items;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.this.$new_items;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.this.$ordered_items = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.this.$new_items = value;
        }

        public SubLObject $ordered_items = Lisp.NIL;

        public SubLObject $new_items = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.class, LAZY_PRIORITY_QUEUE, LAZY_PRIORITY_QUEUE_P, $list_alt80, $list_alt81, new String[]{ "$ordered_items", "$new_items" }, $list_alt82, $list_alt83, PRINT_LAZY_P_QUEUE);
    }

    public static final SubLFile me = new queues();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_queue$ = makeSymbol("*DTP-QUEUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_wide_opcode_queue$ = makeSymbol("*CFASL-WIDE-OPCODE-QUEUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_priority_queue$ = makeSymbol("*DTP-PRIORITY-QUEUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_lazy_priority_queue$ = makeSymbol("*DTP-LAZY-PRIORITY-QUEUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_locked_queue$ = makeSymbol("*DTP-LOCKED-QUEUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_locked_p_queue$ = makeSymbol("*DTP-LOCKED-P-QUEUE*");

    static private final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"), makeSymbol("LAST"));

    static private final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"), $LAST);

    static private final SubLList $list4 = list(makeSymbol("Q-NUM"), makeSymbol("Q-ELEMENTS"), makeSymbol("Q-LAST"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-Q-NUM"), makeSymbol("_CSETF-Q-ELEMENTS"), makeSymbol("_CSETF-Q-LAST"));

    private static final SubLSymbol PRINT_QUEUE = makeSymbol("PRINT-QUEUE");

    private static final SubLSymbol QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("QUEUE-P"));

    private static final SubLSymbol Q_NUM = makeSymbol("Q-NUM");

    private static final SubLSymbol _CSETF_Q_NUM = makeSymbol("_CSETF-Q-NUM");

    private static final SubLSymbol Q_ELEMENTS = makeSymbol("Q-ELEMENTS");

    private static final SubLSymbol _CSETF_Q_ELEMENTS = makeSymbol("_CSETF-Q-ELEMENTS");

    private static final SubLSymbol Q_LAST = makeSymbol("Q-LAST");

    private static final SubLSymbol _CSETF_Q_LAST = makeSymbol("_CSETF-Q-LAST");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_QUEUE = makeSymbol("MAKE-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD");

    private static final SubLString $str24$size_ = makeString("size=");

    private static final SubLList $list25 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list26 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS");

    private static final SubLSymbol DO_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS");

    private static final SubLSymbol $sym32$Q = makeUninternedSymbol("Q");

    private static final SubLSymbol $sym33$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLString $str41$__Queue_length____a = makeString("~%Queue length : ~a");

    private static final SubLString $str42$__Queue_contents__ = makeString("~%Queue contents :");

    private static final SubLString $str43$___s = makeString("~%~s");

    private static final SubLInteger $int$131 = makeInteger(131);

    private static final SubLSymbol CFASL_INPUT_QUEUE = makeSymbol("CFASL-INPUT-QUEUE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_QUEUE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-QUEUE-METHOD");

    private static final SubLString $str47$We_promised_to_write__A_elements_ = makeString("We promised to write ~A elements but wrote ~A.");

    private static final SubLSymbol PRIORITY_QUEUE = makeSymbol("PRIORITY-QUEUE");

    private static final SubLSymbol PRIORITY_QUEUE_P = makeSymbol("PRIORITY-QUEUE-P");

    static private final SubLList $list50 = list(makeSymbol("NUM"), makeSymbol("MAX-SIZE"), makeSymbol("RANK-FUNC"), makeSymbol("COMP-FUNC"), makeSymbol("TREE"));

    private static final SubLList $list51 = list(makeKeyword("NUM"), makeKeyword("MAX-SIZE"), makeKeyword("RANK-FUNC"), makeKeyword("COMP-FUNC"), $TREE);

    private static final SubLList $list52 = list(makeSymbol("P-QUEUE-NUM"), makeSymbol("P-QUEUE-MAX-SIZE"), makeSymbol("P-QUEUE-RANK-FUNC"), makeSymbol("P-QUEUE-COMP-FUNC"), makeSymbol("P-QUEUE-TREE"));

    private static final SubLList $list53 = list(makeSymbol("_CSETF-P-QUEUE-NUM"), makeSymbol("_CSETF-P-QUEUE-MAX-SIZE"), makeSymbol("_CSETF-P-QUEUE-RANK-FUNC"), makeSymbol("_CSETF-P-QUEUE-COMP-FUNC"), makeSymbol("_CSETF-P-QUEUE-TREE"));

    private static final SubLSymbol PRINT_P_QUEUE = makeSymbol("PRINT-P-QUEUE");

    private static final SubLSymbol PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list56 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PRIORITY-QUEUE-P"));

    private static final SubLSymbol P_QUEUE_NUM = makeSymbol("P-QUEUE-NUM");

    private static final SubLSymbol _CSETF_P_QUEUE_NUM = makeSymbol("_CSETF-P-QUEUE-NUM");

    private static final SubLSymbol P_QUEUE_MAX_SIZE = makeSymbol("P-QUEUE-MAX-SIZE");

    private static final SubLSymbol _CSETF_P_QUEUE_MAX_SIZE = makeSymbol("_CSETF-P-QUEUE-MAX-SIZE");

    private static final SubLSymbol P_QUEUE_RANK_FUNC = makeSymbol("P-QUEUE-RANK-FUNC");

    private static final SubLSymbol _CSETF_P_QUEUE_RANK_FUNC = makeSymbol("_CSETF-P-QUEUE-RANK-FUNC");

    private static final SubLSymbol P_QUEUE_COMP_FUNC = makeSymbol("P-QUEUE-COMP-FUNC");

    private static final SubLSymbol _CSETF_P_QUEUE_COMP_FUNC = makeSymbol("_CSETF-P-QUEUE-COMP-FUNC");

    private static final SubLSymbol P_QUEUE_TREE = makeSymbol("P-QUEUE-TREE");

    private static final SubLSymbol _CSETF_P_QUEUE_TREE = makeSymbol("_CSETF-P-QUEUE-TREE");

    private static final SubLSymbol MAKE_PRIORITY_QUEUE = makeSymbol("MAKE-PRIORITY-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD");

    private static final SubLSymbol $sym73$_ = makeSymbol("<");

    private static final SubLSymbol PQ_COLLISION_ENTER = makeSymbol("PQ-COLLISION-ENTER");

    private static final SubLSymbol PQ_COLLISION_REMOVE = makeSymbol("PQ-COLLISION-REMOVE");

    private static final SubLSymbol PQ_COLLISION_EMPTY = makeSymbol("PQ-COLLISION-EMPTY");

    private static final SubLList $list77 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("PRIORITY-QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym78$KEY_VAR = makeUninternedSymbol("KEY-VAR");

    private static final SubLSymbol $sym79$COLLISIONS_VAR = makeUninternedSymbol("COLLISIONS-VAR");

    private static final SubLSymbol DO_BTREE_INDEX = makeSymbol("DO-BTREE-INDEX");

    private static final SubLSymbol DO_PRIORITY_QUEUE_ELEMENTS_BTREE = makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS-BTREE");

    private static final SubLSymbol DO_PRIORITY_QUEUE_ELEMENTS = makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS");

    private static final SubLSymbol LAZY_PRIORITY_QUEUE = makeSymbol("LAZY-PRIORITY-QUEUE");

    private static final SubLSymbol LAZY_PRIORITY_QUEUE_P = makeSymbol("LAZY-PRIORITY-QUEUE-P");

    private static final SubLList $list86 = list(makeSymbol("ORDERED-ITEMS"), makeSymbol("NEW-ITEMS"));

    private static final SubLList $list87 = list(makeKeyword("ORDERED-ITEMS"), makeKeyword("NEW-ITEMS"));

    private static final SubLList $list88 = list(makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("LAZY-P-QUEUE-NEW-ITEMS"));

    private static final SubLList $list89 = list(makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS"));

    private static final SubLSymbol PRINT_LAZY_P_QUEUE = makeSymbol("PRINT-LAZY-P-QUEUE");

    private static final SubLSymbol LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list92 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LAZY-PRIORITY-QUEUE-P"));

    private static final SubLSymbol LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS");

    private static final SubLSymbol _CSETF_LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS");

    private static final SubLSymbol LAZY_P_QUEUE_NEW_ITEMS = makeSymbol("LAZY-P-QUEUE-NEW-ITEMS");

    private static final SubLSymbol _CSETF_LAZY_P_QUEUE_NEW_ITEMS = makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS");

    private static final SubLSymbol MAKE_LAZY_PRIORITY_QUEUE = makeSymbol("MAKE-LAZY-PRIORITY-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD");

    private static final SubLString $str101$___S_new_ = makeString(" (~S new)");

    private static final SubLSymbol $sym102$_ = makeSymbol(">");

    private static final SubLList $list103 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("LPQ"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol LAZY_PRIORITY_QUEUE_ELEMENTS = makeSymbol("LAZY-PRIORITY-QUEUE-ELEMENTS");

    private static final SubLSymbol LOCKED_QUEUE = makeSymbol("LOCKED-QUEUE");

    private static final SubLSymbol LOCKED_QUEUE_P = makeSymbol("LOCKED-QUEUE-P");

    private static final SubLList $list107 = list(makeSymbol("LOCK"), makeSymbol("QUEUE"));

    private static final SubLList $list108 = list($LOCK, makeKeyword("QUEUE"));

    private static final SubLList $list109 = list(makeSymbol("LOCKED-QUEUE-LOCK"), makeSymbol("LOCKED-QUEUE-QUEUE"));

    private static final SubLList $list110 = list(makeSymbol("_CSETF-LOCKED-QUEUE-LOCK"), makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE"));

    private static final SubLSymbol LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list113 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LOCKED-QUEUE-P"));

    private static final SubLSymbol LOCKED_QUEUE_LOCK = makeSymbol("LOCKED-QUEUE-LOCK");

    private static final SubLSymbol _CSETF_LOCKED_QUEUE_LOCK = makeSymbol("_CSETF-LOCKED-QUEUE-LOCK");

    private static final SubLSymbol LOCKED_QUEUE_QUEUE = makeSymbol("LOCKED-QUEUE-QUEUE");

    private static final SubLSymbol _CSETF_LOCKED_QUEUE_QUEUE = makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE");

    private static final SubLSymbol MAKE_LOCKED_QUEUE = makeSymbol("MAKE-LOCKED-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD");

    private static final SubLString $$$Queue_Lock = makeString("Queue Lock");

    private static final SubLSymbol LOCKED_P_QUEUE = makeSymbol("LOCKED-P-QUEUE");

    private static final SubLSymbol LOCKED_P_QUEUE_P = makeSymbol("LOCKED-P-QUEUE-P");

    private static final SubLList $list125 = list(makeSymbol("LOCK"), makeSymbol("PRIORITY-QUEUE"));

    private static final SubLList $list126 = list($LOCK, makeKeyword("PRIORITY-QUEUE"));

    private static final SubLList $list127 = list(makeSymbol("LP-QUEUE-LOCK"), makeSymbol("LP-QUEUE-PRIORITY-QUEUE"));

    private static final SubLList $list128 = list(makeSymbol("_CSETF-LP-QUEUE-LOCK"), makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE"));

    private static final SubLSymbol PRINT_LP_QUEUE = makeSymbol("PRINT-LP-QUEUE");

    private static final SubLSymbol LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list131 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LOCKED-P-QUEUE-P"));

    private static final SubLSymbol LP_QUEUE_LOCK = makeSymbol("LP-QUEUE-LOCK");

    private static final SubLSymbol _CSETF_LP_QUEUE_LOCK = makeSymbol("_CSETF-LP-QUEUE-LOCK");

    private static final SubLSymbol LP_QUEUE_PRIORITY_QUEUE = makeSymbol("LP-QUEUE-PRIORITY-QUEUE");

    private static final SubLSymbol _CSETF_LP_QUEUE_PRIORITY_QUEUE = makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE");

    private static final SubLSymbol MAKE_LOCKED_P_QUEUE = makeSymbol("MAKE-LOCKED-P-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD");

    private static final SubLString $str139$_tree_ = makeString(" tree=");

    private static final SubLString $$$Queues_Module_Supercategory = makeString("Queues Module Supercategory");

    private static final SubLString $$$Priority_Queue_Subcategory = makeString("Priority Queue Subcategory");

    private static final SubLString $$$Priority_Queue_Testing_Suite = makeString("Priority Queue Testing Suite");

    private static final SubLString $$$Locked_Priority_Queue_Subcategory = makeString("Locked Priority Queue Subcategory");

    private static final SubLString $str144$Locked_Priority_Queue_Testing_Sui = makeString("Locked Priority Queue Testing Suite");

    public static final SubLObject queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$queue_native.class ? T : NIL;
    }

    public static final SubLObject q_num_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QUEUE_P);
        return v_object.getField2();
    }

    public static SubLObject q_num(final SubLObject v_object) {
        assert NIL != queue_p(v_object) : "! queues.queue_p(v_object) " + "queues.queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject q_elements_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QUEUE_P);
        return v_object.getField3();
    }

    public static SubLObject q_elements(final SubLObject v_object) {
        assert NIL != queue_p(v_object) : "! queues.queue_p(v_object) " + "queues.queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject q_last_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, QUEUE_P);
        return v_object.getField4();
    }

    public static SubLObject q_last(final SubLObject v_object) {
        assert NIL != queue_p(v_object) : "! queues.queue_p(v_object) " + "queues.queue_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_q_num_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QUEUE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_q_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != queue_p(v_object) : "! queues.queue_p(v_object) " + "queues.queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_q_elements_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QUEUE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_q_elements(final SubLObject v_object, final SubLObject value) {
        assert NIL != queue_p(v_object) : "! queues.queue_p(v_object) " + "queues.queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_q_last_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, QUEUE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_q_last(final SubLObject v_object, final SubLObject value) {
        assert NIL != queue_p(v_object) : "! queues.queue_p(v_object) " + "queues.queue_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.queues.$queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NUM)) {
                        _csetf_q_num(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ELEMENTS)) {
                            _csetf_q_elements(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LAST)) {
                                _csetf_q_last(v_new, current_value);
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

    public static SubLObject make_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.queues.$queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUM)) {
                _csetf_q_num(v_new, current_value);
            } else
                if (pcase_var.eql($ELEMENTS)) {
                    _csetf_q_elements(v_new, current_value);
                } else
                    if (pcase_var.eql($LAST)) {
                        _csetf_q_last(v_new, current_value);
                    } else {
                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_QUEUE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUM, q_num(obj));
        funcall(visitor_fn, obj, $SLOT, $ELEMENTS, q_elements(obj));
        funcall(visitor_fn, obj, $SLOT, $LAST, q_last(obj));
        funcall(visitor_fn, obj, $END, MAKE_QUEUE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_queue(obj, visitor_fn);
    }

    public static final SubLObject print_queue_alt(SubLObject queue, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(queue, stream);
            } else {
                {
                    SubLObject v_object = queue;
                    SubLObject stream_1 = stream;
                    write_string($str_alt18$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    write_string($str_alt20$size_, stream, UNPROVIDED, UNPROVIDED);
                    princ(queue_size(queue), stream);
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return queue;
        }
    }

    public static SubLObject print_queue(final SubLObject queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(queue, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, queue, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(queue_size(queue), stream);
            print_macros.print_unreadable_object_postamble(stream, queue, T, T);
        }
        return queue;
    }

    public static SubLObject create_queue(SubLObject initial_elements) {
        if (initial_elements == UNPROVIDED) {
            initial_elements = NIL;
        }
        final SubLObject queue = clear_queue(make_queue(UNPROVIDED));
        if (NIL != initial_elements) {
            enqueue_all(initial_elements, queue);
        }
        return queue;
    }

    /**
     * Clear QUEUE and return it.
     */
    @LispMethod(comment = "Clear QUEUE and return it.")
    public static final SubLObject clear_queue_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        _csetf_q_num(queue, ZERO_INTEGER);
        _csetf_q_elements(queue, NIL);
        _csetf_q_last(queue, NIL);
        return queue;
    }

    /**
     * Clear QUEUE and return it.
     */
    @LispMethod(comment = "Clear QUEUE and return it.")
    public static SubLObject clear_queue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        _csetf_q_num(queue, ZERO_INTEGER);
        _csetf_q_elements(queue, NIL);
        _csetf_q_last(queue, NIL);
        return queue;
    }

    /**
     * Return T iff QUEUE is empty.
     */
    @LispMethod(comment = "Return T iff QUEUE is empty.")
    public static final SubLObject queue_empty_p_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return sublisp_null(q_elements(queue));
    }

    /**
     * Return T iff QUEUE is empty.
     */
    @LispMethod(comment = "Return T iff QUEUE is empty.")
    public static SubLObject queue_empty_p(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return sublisp_null(q_elements(queue));
    }

    public static SubLObject queue_not_empty_p(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return list_utilities.sublisp_boolean(q_elements(queue));
    }

    /**
     * Return the number of elements in QUEUE.
     */
    @LispMethod(comment = "Return the number of elements in QUEUE.")
    public static final SubLObject queue_size_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return q_num(queue);
    }

    /**
     * Return the number of elements in QUEUE.
     */
    @LispMethod(comment = "Return the number of elements in QUEUE.")
    public static SubLObject queue_size(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return q_num(queue);
    }

    /**
     * Return a list of the elements in QUEUE.
     */
    @LispMethod(comment = "Return a list of the elements in QUEUE.")
    public static final SubLObject queue_elements_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return copy_list(q_elements(queue));
    }

    /**
     * Return a list of the elements in QUEUE.
     */
    @LispMethod(comment = "Return a list of the elements in QUEUE.")
    public static SubLObject queue_elements(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return copy_list(q_elements(queue));
    }

    /**
     * Add ITEM to end of QUEUE.  Returns QUEUE.
     */
    @LispMethod(comment = "Add ITEM to end of QUEUE.  Returns QUEUE.")
    public static final SubLObject enqueue_alt(SubLObject item, SubLObject queue) {
        {
            SubLObject new_cell = list(item);
            if (NIL != queue_empty_p(queue)) {
                _csetf_q_elements(queue, new_cell);
            } else {
                rplacd(q_last(queue), new_cell);
            }
            _csetf_q_num(queue, add(q_num(queue), ONE_INTEGER));
            _csetf_q_last(queue, new_cell);
        }
        return queue;
    }

    /**
     * Add ITEM to end of QUEUE.  Returns QUEUE.
     */
    @LispMethod(comment = "Add ITEM to end of QUEUE.  Returns QUEUE.")
    public static SubLObject enqueue(final SubLObject item, final SubLObject queue) {
        final SubLObject new_cell = list(item);
        if (NIL != queue_empty_p(queue)) {
            _csetf_q_elements(queue, new_cell);
        } else {
            rplacd(q_last(queue), new_cell);
        }
        _csetf_q_num(queue, add(q_num(queue), ONE_INTEGER));
        _csetf_q_last(queue, new_cell);
        return queue;
    }

    /**
     * Add all list items on ITEMS to QUEUE. Returns QUEUE.
     */
    @LispMethod(comment = "Add all list items on ITEMS to QUEUE. Returns QUEUE.")
    public static final SubLObject enqueue_all_alt(SubLObject items, SubLObject queue) {
        {
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                enqueue(item, queue);
            }
        }
        return queue;
    }

    /**
     * Add all list items on ITEMS to QUEUE. Returns QUEUE.
     */
    @LispMethod(comment = "Add all list items on ITEMS to QUEUE. Returns QUEUE.")
    public static SubLObject enqueue_all(final SubLObject items, final SubLObject queue) {
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            enqueue(item, queue);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return queue;
    }

    /**
     * Remove and return the first item in QUEUE.
     */
    @LispMethod(comment = "Remove and return the first item in QUEUE.")
    public static final SubLObject dequeue_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        if (NIL == queue_empty_p(queue)) {
            {
                SubLObject elements = q_elements(queue);
                SubLObject item = elements.first();
                SubLObject rest = elements.rest();
                _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
                _csetf_q_elements(queue, rest);
                if (NIL == rest) {
                    _csetf_q_last(queue, NIL);
                }
                return item;
            }
        }
        return NIL;
    }

    /**
     * Remove and return the first item in QUEUE.
     */
    @LispMethod(comment = "Remove and return the first item in QUEUE.")
    public static SubLObject dequeue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        if (NIL == queue_empty_p(queue)) {
            final SubLObject elements = q_elements(queue);
            final SubLObject item = elements.first();
            final SubLObject rest = elements.rest();
            _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
            _csetf_q_elements(queue, rest);
            if (NIL == rest) {
                _csetf_q_last(queue, NIL);
            }
            return item;
        }
        return NIL;
    }

    public static SubLObject dequeue_all(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        final SubLObject elements = q_elements(queue);
        clear_queue(queue);
        return elements;
    }

    /**
     * Remove the first item, immediately put it back onto the QUEUE
     * and then return the so jiggled item
     *
     * @return first item at invocation time.
     */
    @LispMethod(comment = "Remove the first item, immediately put it back onto the QUEUE\r\nand then return the so jiggled item\r\n\r\n@return first item at invocation time.\nRemove the first item, immediately put it back onto the QUEUE\nand then return the so jiggled item")
    public static final SubLObject requeue_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        {
            SubLObject item = dequeue(queue);
            enqueue(item, queue);
            return item;
        }
    }

    /**
     * Remove the first item, immediately put it back onto the QUEUE
     * and then return the so jiggled item
     *
     * @return first item at invocation time.
     */
    @LispMethod(comment = "Remove the first item, immediately put it back onto the QUEUE\r\nand then return the so jiggled item\r\n\r\n@return first item at invocation time.\nRemove the first item, immediately put it back onto the QUEUE\nand then return the so jiggled item")
    public static SubLObject requeue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        final SubLObject item = dequeue(queue);
        enqueue(item, queue);
        return item;
    }

    /**
     * Remove all occurances of ITEM from QUEUE. Returns QUEUE.
     */
    @LispMethod(comment = "Remove all occurances of ITEM from QUEUE. Returns QUEUE.")
    public static final SubLObject remqueue_alt(SubLObject item, SubLObject queue, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        {
            SubLObject last = q_last(queue);
            SubLObject back = NIL;
            SubLObject next = NIL;
            for (next = q_elements(queue); NIL != next; next = next.rest()) {
                if (NIL != funcall(test, next.first(), item)) {
                    _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
                    if (next == last) {
                        _csetf_q_last(queue, back);
                    }
                    if (next == q_elements(queue)) {
                        _csetf_q_elements(queue, next.rest());
                    } else {
                        rplacd(back, next.rest());
                    }
                } else {
                    back = next;
                }
            }
            return queue;
        }
    }

    /**
     * Remove all occurances of ITEM from QUEUE. Returns QUEUE.
     */
    @LispMethod(comment = "Remove all occurances of ITEM from QUEUE. Returns QUEUE.")
    public static SubLObject remqueue(final SubLObject item, final SubLObject queue, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        final SubLObject last = q_last(queue);
        SubLObject back = NIL;
        SubLObject next;
        for (next = NIL, next = q_elements(queue); NIL != next; next = next.rest()) {
            if (NIL != funcall(test, next.first(), item)) {
                _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
                if (next.eql(last)) {
                    _csetf_q_last(queue, back);
                }
                if (next.eql(q_elements(queue))) {
                    _csetf_q_elements(queue, next.rest());
                } else {
                    rplacd(back, next.rest());
                }
            } else {
                back = next;
            }
        }
        return queue;
    }

    /**
     * Remove the last element of QUEUE. Returns QUEUE.
     */
    @LispMethod(comment = "Remove the last element of QUEUE. Returns QUEUE.")
    public static final SubLObject remlast_queue_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        if (NIL != queue_empty_p(queue)) {
            return queue;
        } else {
            if (queue_size(queue).numE(ONE_INTEGER)) {
                return clear_queue(queue);
            } else {
                {
                    SubLObject back = NIL;
                    SubLObject last = q_last(queue);
                    SubLObject next = NIL;
                    for (next = q_elements(queue); next != last; next = next.rest()) {
                        back = next;
                    }
                    _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
                    _csetf_q_last(queue, back);
                    rplacd(back, next.rest());
                    return queue;
                }
            }
        }
    }

    /**
     * Remove the last element of QUEUE. Returns QUEUE.
     */
    @LispMethod(comment = "Remove the last element of QUEUE. Returns QUEUE.")
    public static SubLObject remlast_queue(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        if (NIL != queue_empty_p(queue)) {
            return queue;
        }
        if (queue_size(queue).numE(ONE_INTEGER)) {
            return clear_queue(queue);
        }
        SubLObject back = NIL;
        SubLObject last;
        SubLObject next;
        for (last = q_last(queue), next = NIL, next = q_elements(queue); !next.eql(last); next = next.rest()) {
            back = next;
        }
        _csetf_q_num(queue, subtract(q_num(queue), ONE_INTEGER));
        _csetf_q_last(queue, back);
        rplacd(back, next.rest());
        return queue;
    }

    /**
     * Return the first occurrance of ITEM in QUEUE.
     */
    @LispMethod(comment = "Return the first occurrance of ITEM in QUEUE.")
    public static final SubLObject queue_find_alt(SubLObject item, SubLObject queue, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return find(item, q_elements(queue), test, key, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the first occurrance of ITEM in QUEUE.
     */
    @LispMethod(comment = "Return the first occurrance of ITEM in QUEUE.")
    public static SubLObject queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return find(item, q_elements(queue), test, key, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the first occurrance of ITEM in QUEUE.
     */
    @LispMethod(comment = "Return the first occurrance of ITEM in QUEUE.")
    public static final SubLObject queue_find_if_alt(SubLObject test, SubLObject queue, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return find_if(test, q_elements(queue), key, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the first occurrance of ITEM in QUEUE.
     */
    @LispMethod(comment = "Return the first occurrance of ITEM in QUEUE.")
    public static SubLObject queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return find_if(test, q_elements(queue), key, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the first item on QUEUE without perturbing the queue.
     */
    @LispMethod(comment = "Return the first item on QUEUE without perturbing the queue.")
    public static final SubLObject queue_peek_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return q_elements(queue).first();
    }

    /**
     * Return the first item on QUEUE without perturbing the queue.
     */
    @LispMethod(comment = "Return the first item on QUEUE without perturbing the queue.")
    public static SubLObject queue_peek(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return q_elements(queue).first();
    }

    /**
     * return the first N items on QUEUE without perturbing the queue.
     */
    @LispMethod(comment = "return the first N items on QUEUE without perturbing the queue.")
    public static final SubLObject queue_peek_n_alt(SubLObject queue, SubLObject n) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return first_n(n, q_elements(queue));
    }

    /**
     * return the first N items on QUEUE without perturbing the queue.
     */
    @LispMethod(comment = "return the first N items on QUEUE without perturbing the queue.")
    public static SubLObject queue_peek_n(final SubLObject queue, final SubLObject n) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return list_utilities.first_n(n, q_elements(queue));
    }

    /**
     * Returns an iterator for the elements of QUEUE.
     */
    @LispMethod(comment = "Returns an iterator for the elements of QUEUE.")
    public static final SubLObject new_queue_iterator_alt(SubLObject queue) {
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        return iteration.new_list_iterator(q_elements(queue));
    }

    /**
     * Returns an iterator for the elements of QUEUE.
     */
    @LispMethod(comment = "Returns an iterator for the elements of QUEUE.")
    public static SubLObject new_queue_iterator(final SubLObject queue) {
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        return iteration.new_list_iterator(q_elements(queue));
    }

    public static final SubLObject do_queue_elements_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item_var = NIL;
                    SubLObject queue = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    item_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    queue = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt22);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt22);
                            if (NIL == member(current_2, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(item_var, list(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, queue), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject queue = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list25);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list25);
            if (NIL == member(current_$1, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list25);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(item_var, list(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, queue), $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_queue_elements_queue_elements_alt(SubLObject queue) {
        return q_elements(queue);
    }

    public static SubLObject do_queue_elements_queue_elements(final SubLObject queue) {
        return q_elements(queue);
    }

    public static final SubLObject do_queue_dequeue_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item_var = NIL;
                    SubLObject queue = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    item_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    queue = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt22);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt22);
                            if (NIL == member(current_3, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject q = $sym29$Q;
                                SubLObject done_var = $sym30$DONE_VAR;
                                return list(CLET, list(list(q, queue), list(done_var, bq_cons(COR, append(NIL != done ? ((SubLObject) (list(done))) : NIL, list(list(QUEUE_EMPTY_P, q)))))), list(WHILE, list(CNOT, done_var), listS(CLET, list(list(item_var, list(DEQUEUE, q))), append(body, list(list(CSETQ, done_var, bq_cons(COR, append(NIL != done ? ((SubLObject) (list(done))) : NIL, list(list(QUEUE_EMPTY_P, q))))))))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_queue_dequeue(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject queue = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list25);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list25);
            if (NIL == member(current_$2, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list25);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject q = $sym32$Q;
        final SubLObject done_var = $sym33$DONE_VAR;
        return list(CLET, list(list(q, queue), list(done_var, bq_cons(COR, append(NIL != done ? list(done) : NIL, list(list(QUEUE_EMPTY_P, q)))))), list(WHILE, list(CNOT, done_var), listS(CLET, list(list(item_var, list(DEQUEUE, q))), append(body, list(list(CSETQ, done_var, bq_cons(COR, append(NIL != done ? list(done) : NIL, list(list(QUEUE_EMPTY_P, q))))))))));
    }

    public static final SubLObject queue_copy_alt(SubLObject queue) {
        {
            SubLObject copy = create_queue();
            SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                enqueue(item, copy);
            }
            return copy;
        }
    }

    public static SubLObject queue_copy(final SubLObject queue) {
        final SubLObject copy = create_queue(UNPROVIDED);
        SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            enqueue(item, copy);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return copy;
    }

    public static final SubLObject print_queue_contents_alt(SubLObject queue, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt38$__Queue_length____a, queue_size(queue));
        format(stream, $str_alt39$__Queue_contents__);
        {
            SubLObject cdolist_list_var = q_elements(queue);
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                format(stream, $str_alt40$___s, item);
            }
        }
        return NIL;
    }

    public static SubLObject print_queue_contents(final SubLObject queue, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str41$__Queue_length____a, queue_size(queue));
        format(stream, $str42$__Queue_contents__);
        SubLObject cdolist_list_var = q_elements(queue);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str43$___s, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cfasl_output_object_queue_method_alt(SubLObject v_object, SubLObject stream) {
        cfasl_wide_output_queue(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_output_object_queue_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_queue(v_object, stream);
        return v_object;
    }

    public static final SubLObject cfasl_wide_output_queue_alt(SubLObject queue, SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_queue$.getGlobalValue(), stream);
        cfasl_output_queue_internal(queue, stream);
        return queue;
    }

    public static SubLObject cfasl_wide_output_queue(final SubLObject queue, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_queue$.getGlobalValue(), stream);
        cfasl_output_queue_internal(queue, stream);
        return queue;
    }

    public static final SubLObject cfasl_output_queue_internal_alt(SubLObject queue, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject size = queue_size(queue);
                SubLObject counter = ZERO_INTEGER;
                cfasl_output(size, stream);
                {
                    SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
                    SubLObject curr = NIL;
                    for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , curr = cdolist_list_var.first()) {
                        cfasl_output(curr, stream);
                        counter = add(counter, ONE_INTEGER);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!counter.numE(size)) {
                        Errors.error($str_alt44$We_promised_to_write__A_elements_, size, counter);
                    }
                }
            }
            return queue;
        }
    }

    public static SubLObject cfasl_output_queue_internal(final SubLObject queue, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = queue_size(queue);
        SubLObject counter = ZERO_INTEGER;
        cfasl_output(size, stream);
        SubLObject cdolist_list_var = do_queue_elements_queue_elements(queue);
        SubLObject curr = NIL;
        curr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cfasl_output(curr, stream);
            counter = add(counter, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        } 
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter.numE(size))) {
            Errors.error($str47$We_promised_to_write__A_elements_, size, counter);
        }
        return queue;
    }

    public static final SubLObject cfasl_input_queue_alt(SubLObject stream) {
        {
            SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject queue = create_queue();
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject item = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    enqueue(item, queue);
                }
            }
            return queue;
        }
    }

    public static SubLObject cfasl_input_queue(final SubLObject stream) {
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject queue = create_queue(UNPROVIDED);
        SubLObject i;
        SubLObject item;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            item = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            enqueue(item, queue);
        }
        return queue;
    }

    public static final SubLObject priority_queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_p_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_p_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject priority_queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$priority_queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject priority_queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$priority_queue_native.class ? T : NIL;
    }

    public static final SubLObject p_queue_num_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.getField2();
    }

    public static SubLObject p_queue_num(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject p_queue_max_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.getField3();
    }

    public static SubLObject p_queue_max_size(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject p_queue_rank_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.getField4();
    }

    public static SubLObject p_queue_rank_func(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject p_queue_comp_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.getField5();
    }

    public static SubLObject p_queue_comp_func(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject p_queue_tree_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.getField6();
    }

    public static SubLObject p_queue_tree(final SubLObject v_object) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_p_queue_num_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_p_queue_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_p_queue_max_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_p_queue_max_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_p_queue_rank_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_p_queue_rank_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_p_queue_comp_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_p_queue_comp_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_p_queue_tree_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PRIORITY_QUEUE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_p_queue_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != priority_queue_p(v_object) : "! queues.priority_queue_p(v_object) " + "queues.priority_queue_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_priority_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.queues.$priority_queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NUM)) {
                        _csetf_p_queue_num(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MAX_SIZE)) {
                            _csetf_p_queue_max_size(v_new, current_value);
                        } else {
                            if (pcase_var.eql($RANK_FUNC)) {
                                _csetf_p_queue_rank_func(v_new, current_value);
                            } else {
                                if (pcase_var.eql($COMP_FUNC)) {
                                    _csetf_p_queue_comp_func(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TREE)) {
                                        _csetf_p_queue_tree(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_priority_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.queues.$priority_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUM)) {
                _csetf_p_queue_num(v_new, current_value);
            } else
                if (pcase_var.eql($MAX_SIZE)) {
                    _csetf_p_queue_max_size(v_new, current_value);
                } else
                    if (pcase_var.eql($RANK_FUNC)) {
                        _csetf_p_queue_rank_func(v_new, current_value);
                    } else
                        if (pcase_var.eql($COMP_FUNC)) {
                            _csetf_p_queue_comp_func(v_new, current_value);
                        } else
                            if (pcase_var.eql($TREE)) {
                                _csetf_p_queue_tree(v_new, current_value);
                            } else {
                                Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_priority_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PRIORITY_QUEUE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUM, p_queue_num(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_SIZE, p_queue_max_size(obj));
        funcall(visitor_fn, obj, $SLOT, $RANK_FUNC, p_queue_rank_func(obj));
        funcall(visitor_fn, obj, $SLOT, $COMP_FUNC, p_queue_comp_func(obj));
        funcall(visitor_fn, obj, $SLOT, $TREE, p_queue_tree(obj));
        funcall(visitor_fn, obj, $END, MAKE_PRIORITY_QUEUE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_priority_queue(obj, visitor_fn);
    }

    public static final SubLObject print_p_queue_alt(SubLObject p_queue, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(p_queue, stream);
            } else {
                {
                    SubLObject v_object = p_queue;
                    SubLObject stream_4 = stream;
                    write_string($str_alt18$__, stream_4, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_4 });
                    write_char(CHAR_space, stream_4);
                    write_string($str_alt20$size_, stream, UNPROVIDED, UNPROVIDED);
                    princ(p_queue_size(p_queue), stream);
                    write_char(CHAR_space, stream_4);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_4, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_4);
                }
            }
            return p_queue;
        }
    }

    public static SubLObject print_p_queue(final SubLObject p_queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(p_queue, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, p_queue, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(p_queue_size(p_queue), stream);
            print_macros.print_unreadable_object_postamble(stream, p_queue, T, T);
        }
        return p_queue;
    }

    /**
     * Create and return a new priority queue.
     */
    @LispMethod(comment = "Create and return a new priority queue.")
    public static final SubLObject create_p_queue_alt(SubLObject max_size, SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym67$_);
        }
        {
            SubLObject pq = make_priority_queue(UNPROVIDED);
            _csetf_p_queue_num(pq, ZERO_INTEGER);
            _csetf_p_queue_max_size(pq, max_size);
            _csetf_p_queue_rank_func(pq, rank_func);
            _csetf_p_queue_comp_func(pq, comp_func);
            _csetf_p_queue_tree(pq, NIL);
            return pq;
        }
    }

    /**
     * Create and return a new priority queue.
     */
    @LispMethod(comment = "Create and return a new priority queue.")
    public static SubLObject create_p_queue(final SubLObject max_size, SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym73$_);
        }
        if (rank_func.isSymbol()) {
            rank_func = symbol_function(rank_func);
        }
        if (comp_func.isSymbol()) {
            comp_func = symbol_function(comp_func);
        }
        final SubLObject pq = make_priority_queue(UNPROVIDED);
        _csetf_p_queue_num(pq, ZERO_INTEGER);
        _csetf_p_queue_max_size(pq, max_size);
        _csetf_p_queue_rank_func(pq, rank_func);
        _csetf_p_queue_comp_func(pq, comp_func);
        _csetf_p_queue_tree(pq, NIL);
        return pq;
    }

    public static SubLObject p_queue_clear(final SubLObject priority_queue) {
        _csetf_p_queue_num(priority_queue, ZERO_INTEGER);
        _csetf_p_queue_tree(priority_queue, NIL);
        return priority_queue;
    }

    /**
     * Return the number of elements in PRIORITY-QUEUE.
     */
    @LispMethod(comment = "Return the number of elements in PRIORITY-QUEUE.")
    public static final SubLObject p_queue_size_alt(SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        return p_queue_num(priority_queue);
    }

    /**
     * Return the number of elements in PRIORITY-QUEUE.
     */
    @LispMethod(comment = "Return the number of elements in PRIORITY-QUEUE.")
    public static SubLObject p_queue_size(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        return p_queue_num(priority_queue);
    }

    /**
     * Return T iff PRIORITY-QUEUE is empty.
     */
    @LispMethod(comment = "Return T iff PRIORITY-QUEUE is empty.")
    public static final SubLObject p_queue_empty_p_alt(SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        return numE(p_queue_size(priority_queue), ZERO_INTEGER);
    }

    /**
     * Return T iff PRIORITY-QUEUE is empty.
     */
    @LispMethod(comment = "Return T iff PRIORITY-QUEUE is empty.")
    public static SubLObject p_queue_empty_p(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        return numE(p_queue_size(priority_queue), ZERO_INTEGER);
    }

    /**
     * Return T iff PRIORITY-QUEUE is full.
     */
    @LispMethod(comment = "Return T iff PRIORITY-QUEUE is full.")
    public static final SubLObject p_queue_full_p_alt(SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        return makeBoolean(p_queue_max_size(priority_queue).isFixnum() && p_queue_size(priority_queue).numE(p_queue_max_size(priority_queue)));
    }

    /**
     * Return T iff PRIORITY-QUEUE is full.
     */
    @LispMethod(comment = "Return T iff PRIORITY-QUEUE is full.")
    public static SubLObject p_queue_full_p(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        return makeBoolean(p_queue_max_size(priority_queue).isFixnum() && p_queue_size(priority_queue).numE(p_queue_max_size(priority_queue)));
    }

    public static final SubLObject p_queue_best_alt(SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        {
            SubLObject best = binary_tree.btree_find_best(p_queue_tree(priority_queue));
            if (NIL != binary_tree.btree_p(best)) {
                return pq_collision_next(binary_tree.bt_state(best));
            }
        }
        return NIL;
    }

    public static SubLObject p_queue_best(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        final SubLObject best = binary_tree.btree_find_best(p_queue_tree(priority_queue));
        if (NIL != binary_tree.btree_p(best)) {
            return pq_collision_next(binary_tree.bt_state(best));
        }
        return NIL;
    }

    public static final SubLObject p_queue_worst_alt(SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        {
            SubLObject worst = binary_tree.btree_find_worst(p_queue_tree(priority_queue));
            if (NIL != binary_tree.btree_p(worst)) {
                return pq_collision_last(binary_tree.bt_state(worst));
            }
        }
        return NIL;
    }

    public static SubLObject p_queue_worst(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        final SubLObject worst = binary_tree.btree_find_worst(p_queue_tree(priority_queue));
        if (NIL != binary_tree.btree_p(worst)) {
            return pq_collision_last(binary_tree.bt_state(worst));
        }
        return NIL;
    }

    public static final SubLObject p_enqueue_alt(SubLObject item, SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        {
            SubLObject bumpedP = p_queue_full_p(priority_queue);
            if (NIL != bumpedP) {
                {
                    SubLObject worst = p_queue_worst(priority_queue);
                    if (NIL != funcall(p_queue_comp_func(priority_queue), funcall(p_queue_rank_func(priority_queue), item), funcall(p_queue_rank_func(priority_queue), worst))) {
                        {
                            SubLObject bumped_item = p_dequeue(priority_queue, T);
                            p_enqueue(item, priority_queue);
                            return values(priority_queue, bumpedP, bumped_item);
                        }
                    } else {
                        return values(priority_queue, bumpedP, item);
                    }
                }
            } else {
                {
                    SubLObject ans = binary_tree.btree_insert(item, funcall(p_queue_rank_func(priority_queue), item), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), symbol_function(PQ_COLLISION_ENTER));
                    if (ans != p_queue_tree(priority_queue)) {
                        _csetf_p_queue_tree(priority_queue, ans);
                    }
                    _csetf_p_queue_num(priority_queue, add(p_queue_num(priority_queue), ONE_INTEGER));
                    return values(priority_queue, bumpedP, NIL);
                }
            }
        }
    }

    public static SubLObject p_enqueue(final SubLObject item, final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        final SubLObject bumpedP = p_queue_full_p(priority_queue);
        if (NIL == bumpedP) {
            final SubLObject ans = binary_tree.btree_insert(item, funcall(p_queue_rank_func(priority_queue), item), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), symbol_function(PQ_COLLISION_ENTER));
            if (!ans.eql(p_queue_tree(priority_queue))) {
                _csetf_p_queue_tree(priority_queue, ans);
            }
            _csetf_p_queue_num(priority_queue, add(p_queue_num(priority_queue), ONE_INTEGER));
            return values(priority_queue, bumpedP, NIL);
        }
        final SubLObject worst = p_queue_worst(priority_queue);
        if (NIL != funcall(p_queue_comp_func(priority_queue), funcall(p_queue_rank_func(priority_queue), item), funcall(p_queue_rank_func(priority_queue), worst))) {
            final SubLObject bumped_item = p_dequeue(priority_queue, T);
            p_enqueue(item, priority_queue);
            return values(priority_queue, bumpedP, bumped_item);
        }
        return values(priority_queue, bumpedP, item);
    }

    public static final SubLObject p_dequeue_alt(SubLObject priority_queue, SubLObject worstP) {
        if (worstP == UNPROVIDED) {
            worstP = NIL;
        }
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        if (NIL == p_queue_empty_p(priority_queue)) {
            {
                SubLObject remove = (NIL != worstP) ? ((SubLObject) (p_queue_worst(priority_queue))) : p_queue_best(priority_queue);
                SubLObject ans = binary_tree.btree_remove(remove, funcall(p_queue_rank_func(priority_queue), remove), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), symbol_function(PQ_COLLISION_REMOVE), symbol_function(PQ_COLLISION_EMPTY));
                if (ans != p_queue_tree(priority_queue)) {
                    _csetf_p_queue_tree(priority_queue, ans);
                }
                _csetf_p_queue_num(priority_queue, subtract(p_queue_num(priority_queue), ONE_INTEGER));
                return remove;
            }
        }
        return NIL;
    }

    public static SubLObject p_dequeue(final SubLObject priority_queue, SubLObject worstP) {
        if (worstP == UNPROVIDED) {
            worstP = NIL;
        }
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        if (NIL == p_queue_empty_p(priority_queue)) {
            final SubLObject remove = (NIL != worstP) ? p_queue_worst(priority_queue) : p_queue_best(priority_queue);
            final SubLObject ans = binary_tree.btree_remove(remove, funcall(p_queue_rank_func(priority_queue), remove), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), symbol_function(PQ_COLLISION_REMOVE), symbol_function(PQ_COLLISION_EMPTY));
            if (!ans.eql(p_queue_tree(priority_queue))) {
                _csetf_p_queue_tree(priority_queue, ans);
            }
            _csetf_p_queue_num(priority_queue, subtract(p_queue_num(priority_queue), ONE_INTEGER));
            return remove;
        }
        return NIL;
    }

    public static final SubLObject do_priority_queue_elements_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt71);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item_var = NIL;
                    SubLObject priority_queue = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt71);
                    item_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt71);
                    priority_queue = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt71);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt71);
                            if (NIL == member(current_5, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt71);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject key_var = $sym72$KEY_VAR;
                                SubLObject collisions_var = $sym73$COLLISIONS_VAR;
                                return list(DO_BTREE_INDEX, list(key_var, collisions_var, list(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, priority_queue), $DONE, done), list(IGNORE, key_var), listS(DO_LIST, list(item_var, collisions_var, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_priority_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject priority_queue = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        priority_queue = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$3, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key_var = $sym78$KEY_VAR;
        final SubLObject collisions_var = $sym79$COLLISIONS_VAR;
        return list(DO_BTREE_INDEX, list(key_var, collisions_var, list(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, priority_queue), $DONE, done), list(IGNORE, key_var), listS(DO_LIST, list(item_var, collisions_var, $DONE, done), append(body, NIL)));
    }

    public static final SubLObject do_priority_queue_elements_btree_alt(SubLObject priority_queue) {
        SubLTrampolineFile.checkType(priority_queue, PRIORITY_QUEUE_P);
        return p_queue_tree(priority_queue);
    }

    public static SubLObject do_priority_queue_elements_btree(final SubLObject priority_queue) {
        assert NIL != priority_queue_p(priority_queue) : "! queues.priority_queue_p(priority_queue) " + ("queues.priority_queue_p(priority_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(priority_queue) ") + priority_queue;
        return p_queue_tree(priority_queue);
    }

    /**
     * Return a list of the elements of PRIORITY-QUEUE in priority order
     */
    @LispMethod(comment = "Return a list of the elements of PRIORITY-QUEUE in priority order")
    public static final SubLObject p_queue_elements_alt(SubLObject priority_queue) {
        {
            SubLObject items = NIL;
            SubLObject stack = NIL;
            SubLObject subtree = do_priority_queue_elements_btree(priority_queue);
            for (; NIL != subtree;) {
                {
                    SubLObject key_var = binary_tree.do_btree_index_key(subtree);
                    SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
                    SubLObject cdolist_list_var = collisions_var;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        items = cons(item, items);
                    }
                }
                {
                    SubLObject lower = binary_tree.do_btree_lower(subtree);
                    SubLObject higher = binary_tree.do_btree_higher(subtree);
                    if (NIL != lower) {
                        if (NIL != higher) {
                            stack = cons(higher, stack);
                        }
                        subtree = lower;
                    } else {
                        if (NIL != higher) {
                            subtree = higher;
                        } else {
                            subtree = stack.first();
                            stack = stack.rest();
                        }
                    }
                }
            }
            stack = NIL;
            {
                SubLObject comp_func = p_queue_comp_func(priority_queue);
                SubLObject rank_func = p_queue_rank_func(priority_queue);
                items = Sort.sort(items, comp_func, rank_func);
            }
            return items;
        }
    }

    /**
     * Return a list of the elements of PRIORITY-QUEUE in priority order
     */
    @LispMethod(comment = "Return a list of the elements of PRIORITY-QUEUE in priority order")
    public static SubLObject p_queue_elements(final SubLObject priority_queue) {
        SubLObject items = NIL;
        SubLObject stack = NIL;
        SubLObject subtree = do_priority_queue_elements_btree(priority_queue);
        while (NIL != subtree) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            SubLObject cdolist_list_var;
            final SubLObject collisions_var = cdolist_list_var = binary_tree.do_btree_index_value(subtree);
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                items = cons(item, items);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (NIL != lower) {
                if (NIL != higher) {
                    stack = cons(higher, stack);
                }
                subtree = lower;
            } else
                if (NIL != higher) {
                    subtree = higher;
                } else {
                    subtree = stack.first();
                    stack = stack.rest();
                }

        } 
        stack = NIL;
        final SubLObject comp_func = p_queue_comp_func(priority_queue);
        final SubLObject rank_func = p_queue_rank_func(priority_queue);
        items = Sort.sort(items, comp_func, rank_func);
        return items;
    }

    /**
     * Return the first occurrence of ITEM in QUEUE.
     */
    @LispMethod(comment = "Return the first occurrence of ITEM in QUEUE.")
    public static final SubLObject p_queue_find_alt(SubLObject item, SubLObject queue, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(queue, PRIORITY_QUEUE_P);
        {
            SubLObject found = NIL;
            SubLObject stack = NIL;
            SubLObject subtree = do_priority_queue_elements_btree(queue);
            for (; !((NIL != found) || (NIL == subtree));) {
                {
                    SubLObject key_var = binary_tree.do_btree_index_key(subtree);
                    SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
                    SubLObject rest = NIL;
                    for (rest = collisions_var; !((NIL != found) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject this_item = rest.first();
                            if (NIL != funcall(test, item, funcall(key, this_item))) {
                                found = this_item;
                            }
                        }
                    }
                }
                {
                    SubLObject lower = binary_tree.do_btree_lower(subtree);
                    SubLObject higher = binary_tree.do_btree_higher(subtree);
                    if (NIL != lower) {
                        if (NIL != higher) {
                            stack = cons(higher, stack);
                        }
                        subtree = lower;
                    } else {
                        if (NIL != higher) {
                            subtree = higher;
                        } else {
                            subtree = stack.first();
                            stack = stack.rest();
                        }
                    }
                }
            }
            stack = NIL;
            return found;
        }
    }

    /**
     * Return the first occurrence of ITEM in QUEUE.
     */
    @LispMethod(comment = "Return the first occurrence of ITEM in QUEUE.")
    public static SubLObject p_queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != priority_queue_p(queue) : "! queues.priority_queue_p(queue) " + ("queues.priority_queue_p(queue) " + "CommonSymbols.NIL != queues.priority_queue_p(queue) ") + queue;
        SubLObject found = NIL;
        SubLObject stack = NIL;
        SubLObject subtree = do_priority_queue_elements_btree(queue);
        while ((NIL == found) && (NIL != subtree)) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            final SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
            SubLObject rest;
            SubLObject this_item;
            for (rest = NIL, rest = collisions_var; (NIL == found) && (NIL != rest); rest = rest.rest()) {
                this_item = rest.first();
                if (NIL != funcall(test, item, funcall(key, this_item))) {
                    found = this_item;
                }
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (NIL != lower) {
                if (NIL != higher) {
                    stack = cons(higher, stack);
                }
                subtree = lower;
            } else
                if (NIL != higher) {
                    subtree = higher;
                } else {
                    subtree = stack.first();
                    stack = stack.rest();
                }

        } 
        stack = NIL;
        return found;
    }

    /**
     * Return the first item in QUEUE that returns non-NIL for TEST.
     */
    @LispMethod(comment = "Return the first item in QUEUE that returns non-NIL for TEST.")
    public static final SubLObject p_queue_find_if_alt(SubLObject test, SubLObject queue, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(queue, PRIORITY_QUEUE_P);
        {
            SubLObject found = NIL;
            SubLObject stack = NIL;
            SubLObject subtree = do_priority_queue_elements_btree(queue);
            for (; !((NIL != found) || (NIL == subtree));) {
                {
                    SubLObject key_var = binary_tree.do_btree_index_key(subtree);
                    SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
                    SubLObject rest = NIL;
                    for (rest = collisions_var; !((NIL != found) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject this_item = rest.first();
                            if (NIL != funcall(test, funcall(key, this_item))) {
                                found = this_item;
                            }
                        }
                    }
                }
                {
                    SubLObject lower = binary_tree.do_btree_lower(subtree);
                    SubLObject higher = binary_tree.do_btree_higher(subtree);
                    if (NIL != lower) {
                        if (NIL != higher) {
                            stack = cons(higher, stack);
                        }
                        subtree = lower;
                    } else {
                        if (NIL != higher) {
                            subtree = higher;
                        } else {
                            subtree = stack.first();
                            stack = stack.rest();
                        }
                    }
                }
            }
            stack = NIL;
            return found;
        }
    }

    /**
     * Return the first item in QUEUE that returns non-NIL for TEST.
     */
    @LispMethod(comment = "Return the first item in QUEUE that returns non-NIL for TEST.")
    public static SubLObject p_queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != priority_queue_p(queue) : "! queues.priority_queue_p(queue) " + ("queues.priority_queue_p(queue) " + "CommonSymbols.NIL != queues.priority_queue_p(queue) ") + queue;
        SubLObject found = NIL;
        SubLObject stack = NIL;
        SubLObject subtree = do_priority_queue_elements_btree(queue);
        while ((NIL == found) && (NIL != subtree)) {
            final SubLObject key_var = binary_tree.do_btree_index_key(subtree);
            final SubLObject collisions_var = binary_tree.do_btree_index_value(subtree);
            SubLObject rest;
            SubLObject this_item;
            for (rest = NIL, rest = collisions_var; (NIL == found) && (NIL != rest); rest = rest.rest()) {
                this_item = rest.first();
                if (NIL != funcall(test, funcall(key, this_item))) {
                    found = this_item;
                }
            }
            final SubLObject lower = binary_tree.do_btree_lower(subtree);
            final SubLObject higher = binary_tree.do_btree_higher(subtree);
            if (NIL != lower) {
                if (NIL != higher) {
                    stack = cons(higher, stack);
                }
                subtree = lower;
            } else
                if (NIL != higher) {
                    subtree = higher;
                } else {
                    subtree = stack.first();
                    stack = stack.rest();
                }

        } 
        stack = NIL;
        return found;
    }

    /**
     * Returns the list within the queue implementation that results from entering
     * a new item which has the same key as others on this queue list.
     */
    @LispMethod(comment = "Returns the list within the queue implementation that results from entering\r\na new item which has the same key as others on this queue list.\nReturns the list within the queue implementation that results from entering\na new item which has the same key as others on this queue list.")
    public static final SubLObject pq_collision_enter_alt(SubLObject item, SubLObject queue) {
        return nadd_to_end(item, queue);
    }

    /**
     * Returns the list within the queue implementation that results from entering
     * a new item which has the same key as others on this queue list.
     */
    @LispMethod(comment = "Returns the list within the queue implementation that results from entering\r\na new item which has the same key as others on this queue list.\nReturns the list within the queue implementation that results from entering\na new item which has the same key as others on this queue list.")
    public static SubLObject pq_collision_enter(final SubLObject item, final SubLObject queue) {
        return list_utilities.nadd_to_end(item, queue);
    }

    /**
     * Returns the next item within the queue implementation that is obtained from a
     * list of same-named keys.
     */
    @LispMethod(comment = "Returns the next item within the queue implementation that is obtained from a\r\nlist of same-named keys.\nReturns the next item within the queue implementation that is obtained from a\nlist of same-named keys.")
    public static final SubLObject pq_collision_next_alt(SubLObject queue) {
        return queue.first();
    }

    /**
     * Returns the next item within the queue implementation that is obtained from a
     * list of same-named keys.
     */
    @LispMethod(comment = "Returns the next item within the queue implementation that is obtained from a\r\nlist of same-named keys.\nReturns the next item within the queue implementation that is obtained from a\nlist of same-named keys.")
    public static SubLObject pq_collision_next(final SubLObject queue) {
        return queue.first();
    }

    /**
     * Returns the last item within the queue implementation that is obtained from a
     * list of same-named keys.
     */
    @LispMethod(comment = "Returns the last item within the queue implementation that is obtained from a\r\nlist of same-named keys.\nReturns the last item within the queue implementation that is obtained from a\nlist of same-named keys.")
    public static final SubLObject pq_collision_last_alt(SubLObject queue) {
        return last_one(queue);
    }

    /**
     * Returns the last item within the queue implementation that is obtained from a
     * list of same-named keys.
     */
    @LispMethod(comment = "Returns the last item within the queue implementation that is obtained from a\r\nlist of same-named keys.\nReturns the last item within the queue implementation that is obtained from a\nlist of same-named keys.")
    public static SubLObject pq_collision_last(final SubLObject queue) {
        return list_utilities.last_one(queue);
    }

    /**
     * Returns the list within the queue implementation that results from removing
     * an item which has the same key as others on this queue list.
     */
    @LispMethod(comment = "Returns the list within the queue implementation that results from removing\r\nan item which has the same key as others on this queue list.\nReturns the list within the queue implementation that results from removing\nan item which has the same key as others on this queue list.")
    public static final SubLObject pq_collision_remove_alt(SubLObject item, SubLObject queue) {
        return delete_first(item, queue, UNPROVIDED);
    }

    /**
     * Returns the list within the queue implementation that results from removing
     * an item which has the same key as others on this queue list.
     */
    @LispMethod(comment = "Returns the list within the queue implementation that results from removing\r\nan item which has the same key as others on this queue list.\nReturns the list within the queue implementation that results from removing\nan item which has the same key as others on this queue list.")
    public static SubLObject pq_collision_remove(final SubLObject item, final SubLObject queue) {
        return list_utilities.delete_first(item, queue, UNPROVIDED);
    }

    /**
     * Returns T iff the queue implementation list is empty, in the case where the
     * list would contain same-named keys for queue items.
     */
    @LispMethod(comment = "Returns T iff the queue implementation list is empty, in the case where the\r\nlist would contain same-named keys for queue items.\nReturns T iff the queue implementation list is empty, in the case where the\nlist would contain same-named keys for queue items.")
    public static final SubLObject pq_collision_empty_alt(SubLObject queue) {
        return sublisp_null(queue);
    }

    /**
     * Returns T iff the queue implementation list is empty, in the case where the
     * list would contain same-named keys for queue items.
     */
    @LispMethod(comment = "Returns T iff the queue implementation list is empty, in the case where the\r\nlist would contain same-named keys for queue items.\nReturns T iff the queue implementation list is empty, in the case where the\nlist would contain same-named keys for queue items.")
    public static SubLObject pq_collision_empty(final SubLObject queue) {
        return sublisp_null(queue);
    }

    public static final SubLObject lazy_priority_queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_lazy_p_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject lazy_priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_lazy_p_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject lazy_priority_queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject lazy_priority_queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native.class ? T : NIL;
    }

    public static final SubLObject lazy_p_queue_ordered_items_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LAZY_PRIORITY_QUEUE_P);
        return v_object.getField2();
    }

    public static SubLObject lazy_p_queue_ordered_items(final SubLObject v_object) {
        assert NIL != lazy_priority_queue_p(v_object) : "! queues.lazy_priority_queue_p(v_object) " + "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject lazy_p_queue_new_items_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LAZY_PRIORITY_QUEUE_P);
        return v_object.getField3();
    }

    public static SubLObject lazy_p_queue_new_items(final SubLObject v_object) {
        assert NIL != lazy_priority_queue_p(v_object) : "! queues.lazy_priority_queue_p(v_object) " + "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_lazy_p_queue_ordered_items_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LAZY_PRIORITY_QUEUE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_lazy_p_queue_ordered_items(final SubLObject v_object, final SubLObject value) {
        assert NIL != lazy_priority_queue_p(v_object) : "! queues.lazy_priority_queue_p(v_object) " + "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_lazy_p_queue_new_items_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LAZY_PRIORITY_QUEUE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_lazy_p_queue_new_items(final SubLObject v_object, final SubLObject value) {
        assert NIL != lazy_priority_queue_p(v_object) : "! queues.lazy_priority_queue_p(v_object) " + "queues.lazy_priority_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_lazy_priority_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ORDERED_ITEMS)) {
                        _csetf_lazy_p_queue_ordered_items(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NEW_ITEMS)) {
                            _csetf_lazy_p_queue_new_items(v_new, current_value);
                        } else {
                            Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_lazy_priority_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.queues.$lazy_priority_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ORDERED_ITEMS)) {
                _csetf_lazy_p_queue_ordered_items(v_new, current_value);
            } else
                if (pcase_var.eql($NEW_ITEMS)) {
                    _csetf_lazy_p_queue_new_items(v_new, current_value);
                } else {
                    Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_lazy_priority_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LAZY_PRIORITY_QUEUE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ORDERED_ITEMS, lazy_p_queue_ordered_items(obj));
        funcall(visitor_fn, obj, $SLOT, $NEW_ITEMS, lazy_p_queue_new_items(obj));
        funcall(visitor_fn, obj, $END, MAKE_LAZY_PRIORITY_QUEUE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_lazy_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_lazy_priority_queue(obj, visitor_fn);
    }

    public static final SubLObject print_lazy_p_queue_alt(SubLObject lpq, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(lpq, stream);
            } else {
                {
                    SubLObject v_object = lpq;
                    SubLObject stream_6 = stream;
                    write_string($str_alt18$__, stream_6, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_6 });
                    write_char(CHAR_space, stream_6);
                    write_string($str_alt20$size_, stream, UNPROVIDED, UNPROVIDED);
                    princ(lazy_priority_queue_size(lpq), stream);
                    {
                        SubLObject additions = queue_size(lazy_p_queue_new_items(lpq));
                        if (!additions.isZero()) {
                            format(stream, $str_alt92$___S_new_, additions);
                        }
                    }
                    write_char(CHAR_space, stream_6);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_6, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_6);
                }
            }
            return lpq;
        }
    }

    public static SubLObject print_lazy_p_queue(final SubLObject lpq, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(lpq, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, lpq, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(lazy_priority_queue_size(lpq), stream);
            final SubLObject additions = queue_size(lazy_p_queue_new_items(lpq));
            if (!additions.isZero()) {
                format(stream, $str101$___S_new_, additions);
            }
            print_macros.print_unreadable_object_postamble(stream, lpq, T, T);
        }
        return lpq;
    }

    public static final SubLObject new_lazy_priority_queue_alt(SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym93$_);
        }
        {
            SubLObject lpq = make_lazy_priority_queue(UNPROVIDED);
            _csetf_lazy_p_queue_ordered_items(lpq, create_p_queue(NIL, rank_func, comp_func));
            _csetf_lazy_p_queue_new_items(lpq, create_queue());
            return lpq;
        }
    }

    public static SubLObject new_lazy_priority_queue(final SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym102$_);
        }
        final SubLObject lpq = make_lazy_priority_queue(UNPROVIDED);
        _csetf_lazy_p_queue_ordered_items(lpq, create_p_queue(NIL, rank_func, comp_func));
        _csetf_lazy_p_queue_new_items(lpq, create_queue(UNPROVIDED));
        return lpq;
    }

    public static final SubLObject do_lazy_priority_queue_elements_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt94);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject item_var = NIL;
                    SubLObject lpq = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt94);
                    item_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt94);
                    lpq = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt94);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt94);
                            if (NIL == member(current_7, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt94);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(item_var, list(LAZY_PRIORITY_QUEUE_ELEMENTS, lpq), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_lazy_priority_queue_elements(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item_var = NIL;
        SubLObject lpq = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        item_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        lpq = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list103);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list103);
            if (NIL == member(current_$4, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list103);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(item_var, list(LAZY_PRIORITY_QUEUE_ELEMENTS, lpq), $DONE, done), append(body, NIL));
    }

    public static final SubLObject lazy_priority_queue_size_alt(SubLObject lpq) {
        SubLTrampolineFile.checkType(lpq, LAZY_PRIORITY_QUEUE_P);
        return add(p_queue_size(lazy_p_queue_ordered_items(lpq)), queue_size(lazy_p_queue_new_items(lpq)));
    }

    public static SubLObject lazy_priority_queue_size(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "! queues.lazy_priority_queue_p(lpq) " + ("queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) ") + lpq;
        return add(p_queue_size(lazy_p_queue_ordered_items(lpq)), queue_size(lazy_p_queue_new_items(lpq)));
    }

    public static final SubLObject lazy_priority_queue_empty_p_alt(SubLObject lpq) {
        return zerop(lazy_priority_queue_size(lpq));
    }

    public static SubLObject lazy_priority_queue_empty_p(final SubLObject lpq) {
        return zerop(lazy_priority_queue_size(lpq));
    }

    public static final SubLObject lazy_priority_queue_peek_alt(SubLObject lpq) {
        SubLTrampolineFile.checkType(lpq, LAZY_PRIORITY_QUEUE_P);
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_best(lazy_p_queue_ordered_items(lpq));
    }

    public static SubLObject lazy_priority_queue_peek(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "! queues.lazy_priority_queue_p(lpq) " + ("queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) ") + lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_best(lazy_p_queue_ordered_items(lpq));
    }

    public static final SubLObject lazy_priority_queue_elements_alt(SubLObject lpq) {
        SubLTrampolineFile.checkType(lpq, LAZY_PRIORITY_QUEUE_P);
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_elements(lazy_p_queue_ordered_items(lpq));
    }

    public static SubLObject lazy_priority_queue_elements(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "! queues.lazy_priority_queue_p(lpq) " + ("queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) ") + lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_queue_elements(lazy_p_queue_ordered_items(lpq));
    }

    public static final SubLObject lazy_priority_queue_add_alt(SubLObject lpq, SubLObject item) {
        SubLTrampolineFile.checkType(lpq, LAZY_PRIORITY_QUEUE_P);
        enqueue(item, lazy_p_queue_new_items(lpq));
        return lpq;
    }

    public static SubLObject lazy_priority_queue_add(final SubLObject lpq, final SubLObject item) {
        assert NIL != lazy_priority_queue_p(lpq) : "! queues.lazy_priority_queue_p(lpq) " + ("queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) ") + lpq;
        enqueue(item, lazy_p_queue_new_items(lpq));
        return lpq;
    }

    public static final SubLObject lazy_priority_queue_remove_alt(SubLObject lpq) {
        SubLTrampolineFile.checkType(lpq, LAZY_PRIORITY_QUEUE_P);
        ensure_lazy_priority_queue_ordered(lpq);
        return p_dequeue(lazy_p_queue_ordered_items(lpq), UNPROVIDED);
    }

    public static SubLObject lazy_priority_queue_remove(final SubLObject lpq) {
        assert NIL != lazy_priority_queue_p(lpq) : "! queues.lazy_priority_queue_p(lpq) " + ("queues.lazy_priority_queue_p(lpq) " + "CommonSymbols.NIL != queues.lazy_priority_queue_p(lpq) ") + lpq;
        ensure_lazy_priority_queue_ordered(lpq);
        return p_dequeue(lazy_p_queue_ordered_items(lpq), UNPROVIDED);
    }

    public static final SubLObject ensure_lazy_priority_queue_ordered_alt(SubLObject lpq) {
        {
            SubLObject ordered_items = lazy_p_queue_ordered_items(lpq);
            SubLObject new_items = lazy_p_queue_new_items(lpq);
            while (NIL == queue_empty_p(new_items)) {
                p_enqueue(dequeue(new_items), ordered_items);
            } 
        }
        return lpq;
    }

    public static SubLObject ensure_lazy_priority_queue_ordered(final SubLObject lpq) {
        final SubLObject ordered_items = lazy_p_queue_ordered_items(lpq);
        final SubLObject new_items = lazy_p_queue_new_items(lpq);
        while (NIL == queue_empty_p(new_items)) {
            p_enqueue(dequeue(new_items), ordered_items);
        } 
        return lpq;
    }

    public static final SubLObject locked_queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject locked_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject locked_queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$locked_queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject locked_queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$locked_queue_native.class ? T : NIL;
    }

    public static final SubLObject locked_queue_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LOCKED_QUEUE_P);
        return v_object.getField2();
    }

    public static SubLObject locked_queue_lock(final SubLObject v_object) {
        assert NIL != locked_queue_p(v_object) : "! queues.locked_queue_p(v_object) " + "queues.locked_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject locked_queue_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LOCKED_QUEUE_P);
        return v_object.getField3();
    }

    public static SubLObject locked_queue_queue(final SubLObject v_object) {
        assert NIL != locked_queue_p(v_object) : "! queues.locked_queue_p(v_object) " + "queues.locked_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_locked_queue_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LOCKED_QUEUE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_locked_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_queue_p(v_object) : "! queues.locked_queue_p(v_object) " + "queues.locked_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_locked_queue_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LOCKED_QUEUE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_locked_queue_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_queue_p(v_object) : "! queues.locked_queue_p(v_object) " + "queues.locked_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_locked_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.queues.$locked_queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_locked_queue_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($QUEUE)) {
                            _csetf_locked_queue_queue(v_new, current_value);
                        } else {
                            Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_locked_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.queues.$locked_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_locked_queue_lock(v_new, current_value);
            } else
                if (pcase_var.eql($QUEUE)) {
                    _csetf_locked_queue_queue(v_new, current_value);
                } else {
                    Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_locked_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LOCKED_QUEUE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, locked_queue_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $QUEUE, locked_queue_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_LOCKED_QUEUE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_locked_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_queue(obj, visitor_fn);
    }

    public static final SubLObject create_locked_queue_alt() {
        {
            SubLObject lq = make_locked_queue(UNPROVIDED);
            _csetf_locked_queue_queue(lq, create_queue());
            _csetf_locked_queue_lock(lq, make_lock($$$Queue_Lock));
            return lq;
        }
    }

    public static SubLObject create_locked_queue() {
        final SubLObject lq = make_locked_queue(UNPROVIDED);
        _csetf_locked_queue_queue(lq, create_queue(UNPROVIDED));
        _csetf_locked_queue_lock(lq, make_lock($$$Queue_Lock));
        return lq;
    }

    /**
     * Clear LQ and return it.
     */
    @LispMethod(comment = "Clear LQ and return it.")
    public static final SubLObject clear_locked_queue_alt(SubLObject lq) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_queue_p(lq)) {
                {
                    SubLObject lock = locked_queue_lock(lq);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = clear_queue(locked_queue_queue(lq));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Clear LQ and return it.")
    public static SubLObject clear_locked_queue(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = clear_queue(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return T iff LQ is empty.
     */
    @LispMethod(comment = "Return T iff LQ is empty.")
    public static final SubLObject locked_queue_empty_p_alt(SubLObject lq) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_queue_p(lq)) {
                {
                    SubLObject lock = locked_queue_lock(lq);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = queue_empty_p(locked_queue_queue(lq));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return T iff LQ is empty.")
    public static SubLObject locked_queue_empty_p(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = queue_empty_p(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return the number of elements in LQ.
     */
    @LispMethod(comment = "Return the number of elements in LQ.")
    public static final SubLObject locked_queue_size_alt(SubLObject lq) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_queue_p(lq)) {
                {
                    SubLObject lock = locked_queue_lock(lq);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = queue_size(locked_queue_queue(lq));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return the number of elements in LQ.")
    public static SubLObject locked_queue_size(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = queue_size(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return a list of the elements in LQ.
     */
    @LispMethod(comment = "Return a list of the elements in LQ.")
    public static final SubLObject locked_queue_elements_alt(SubLObject lq) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_queue_p(lq)) {
                {
                    SubLObject lock = locked_queue_lock(lq);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = queue_elements(locked_queue_queue(lq));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return a list of the elements in LQ.")
    public static SubLObject locked_queue_elements(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = queue_elements(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Add ITEM to end of LQ.  Returns LQ.
     */
    @LispMethod(comment = "Add ITEM to end of LQ.  Returns LQ.")
    public static final SubLObject locked_enqueue_alt(SubLObject item, SubLObject lq) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_queue_p(lq)) {
                {
                    SubLObject lock = locked_queue_lock(lq);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = enqueue(item, locked_queue_queue(lq));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Add ITEM to end of LQ.  Returns LQ.")
    public static SubLObject locked_enqueue(final SubLObject item, final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = enqueue(item, locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Remove and return the first item in LQ.
     */
    @LispMethod(comment = "Remove and return the first item in LQ.")
    public static final SubLObject locked_dequeue_alt(SubLObject lq) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_queue_p(lq)) {
                {
                    SubLObject lock = locked_queue_lock(lq);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = dequeue(locked_queue_queue(lq));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Remove and return the first item in LQ.")
    public static SubLObject locked_dequeue(final SubLObject lq) {
        SubLObject ans = NIL;
        if (NIL != locked_queue_p(lq)) {
            final SubLObject lock = locked_queue_lock(lq);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = dequeue(locked_queue_queue(lq));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    public static final SubLObject locked_p_queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_lp_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject locked_p_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_lp_queue(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject locked_p_queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$locked_p_queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject locked_p_queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.queues.$locked_p_queue_native.class ? T : NIL;
    }

    public static final SubLObject lp_queue_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LOCKED_P_QUEUE_P);
        return v_object.getField2();
    }

    public static SubLObject lp_queue_lock(final SubLObject v_object) {
        assert NIL != locked_p_queue_p(v_object) : "! queues.locked_p_queue_p(v_object) " + "queues.locked_p_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject lp_queue_priority_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LOCKED_P_QUEUE_P);
        return v_object.getField3();
    }

    public static SubLObject lp_queue_priority_queue(final SubLObject v_object) {
        assert NIL != locked_p_queue_p(v_object) : "! queues.locked_p_queue_p(v_object) " + "queues.locked_p_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_lp_queue_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LOCKED_P_QUEUE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_lp_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_p_queue_p(v_object) : "! queues.locked_p_queue_p(v_object) " + "queues.locked_p_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_lp_queue_priority_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LOCKED_P_QUEUE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_lp_queue_priority_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != locked_p_queue_p(v_object) : "! queues.locked_p_queue_p(v_object) " + "queues.locked_p_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_locked_p_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.queues.$locked_p_queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_lp_queue_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PRIORITY_QUEUE)) {
                            _csetf_lp_queue_priority_queue(v_new, current_value);
                        } else {
                            Errors.error($str_alt17$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_locked_p_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.queues.$locked_p_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_lp_queue_lock(v_new, current_value);
            } else
                if (pcase_var.eql($PRIORITY_QUEUE)) {
                    _csetf_lp_queue_priority_queue(v_new, current_value);
                } else {
                    Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_locked_p_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LOCKED_P_QUEUE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, lp_queue_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIORITY_QUEUE, lp_queue_priority_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_LOCKED_P_QUEUE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_locked_p_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_locked_p_queue(obj, visitor_fn);
    }

    /**
     * Readably print the LOCKED-PRIORITY-QUEUE object.
     */
    @LispMethod(comment = "Readably print the LOCKED-PRIORITY-QUEUE object.")
    public static final SubLObject print_lp_queue_alt(SubLObject lp_queue, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(lp_queue, stream);
            } else {
                {
                    SubLObject v_object = lp_queue;
                    SubLObject stream_8 = stream;
                    write_string($str_alt18$__, stream_8, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_8 });
                    write_char(CHAR_space, stream_8);
                    write_string($str_alt20$size_, stream, UNPROVIDED, UNPROVIDED);
                    princ(lp_queue_size(lp_queue), stream);
                    write_string($str_alt124$_tree_, stream, UNPROVIDED, UNPROVIDED);
                    princ(p_queue_tree(lp_queue_priority_queue(lp_queue)), stream);
                    write_char(CHAR_space, stream_8);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_8, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_8);
                }
            }
            return lp_queue;
        }
    }

    @LispMethod(comment = "Readably print the LOCKED-PRIORITY-QUEUE object.")
    public static SubLObject print_lp_queue(final SubLObject lp_queue, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(lp_queue, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, lp_queue, T, T);
            write_string($str24$size_, stream, UNPROVIDED, UNPROVIDED);
            princ(lp_queue_size(lp_queue), stream);
            write_string($str139$_tree_, stream, UNPROVIDED, UNPROVIDED);
            princ(p_queue_tree(lp_queue_priority_queue(lp_queue)), stream);
            print_macros.print_unreadable_object_postamble(stream, lp_queue, T, T);
        }
        return lp_queue;
    }

    /**
     * Creates a locked priority queue of the given MAX-SIZE.
     */
    @LispMethod(comment = "Creates a locked priority queue of the given MAX-SIZE.")
    public static final SubLObject create_lp_queue_alt(SubLObject max_size, SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym67$_);
        }
        {
            SubLObject lp_queue = make_locked_p_queue(UNPROVIDED);
            _csetf_lp_queue_priority_queue(lp_queue, create_p_queue(max_size, rank_func, comp_func));
            _csetf_lp_queue_lock(lp_queue, make_lock($$$Queue_Lock));
            return lp_queue;
        }
    }

    @LispMethod(comment = "Creates a locked priority queue of the given MAX-SIZE.")
    public static SubLObject create_lp_queue(final SubLObject max_size, final SubLObject rank_func, SubLObject comp_func) {
        if (comp_func == UNPROVIDED) {
            comp_func = symbol_function($sym73$_);
        }
        final SubLObject lp_queue = make_locked_p_queue(UNPROVIDED);
        _csetf_lp_queue_priority_queue(lp_queue, create_p_queue(max_size, rank_func, comp_func));
        _csetf_lp_queue_lock(lp_queue, make_lock($$$Queue_Lock));
        return lp_queue;
    }

    /**
     * Return the number of elements in lp-queue.
     */
    @LispMethod(comment = "Return the number of elements in lp-queue.")
    public static final SubLObject lp_queue_size_alt(SubLObject lp_queue) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_p_queue_p(lp_queue)) {
                {
                    SubLObject lock = lp_queue_lock(lp_queue);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = p_queue_size(lp_queue_priority_queue(lp_queue));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return the number of elements in lp-queue.")
    public static SubLObject lp_queue_size(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_size(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return T iff lp-queue is empty.
     */
    @LispMethod(comment = "Return T iff lp-queue is empty.")
    public static final SubLObject lp_queue_empty_p_alt(SubLObject lp_queue) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_p_queue_p(lp_queue)) {
                {
                    SubLObject lock = lp_queue_lock(lp_queue);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = p_queue_empty_p(lp_queue_priority_queue(lp_queue));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Return T iff lp-queue is empty.
     */
    @LispMethod(comment = "Return T iff lp-queue is empty.")
    public static SubLObject lp_queue_empty_p(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_empty_p(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return T iff lp-queue is full.
     */
    @LispMethod(comment = "Return T iff lp-queue is full.")
    public static final SubLObject lp_queue_full_p_alt(SubLObject lp_queue) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_p_queue_p(lp_queue)) {
                {
                    SubLObject lock = lp_queue_lock(lp_queue);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = p_queue_full_p(lp_queue_priority_queue(lp_queue));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Return T iff lp-queue is full.
     */
    @LispMethod(comment = "Return T iff lp-queue is full.")
    public static SubLObject lp_queue_full_p(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_full_p(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return the LP-QUEUE element with best priority.
     */
    @LispMethod(comment = "Return the LP-QUEUE element with best priority.")
    public static final SubLObject lp_queue_best_alt(SubLObject lp_queue) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_p_queue_p(lp_queue)) {
                {
                    SubLObject lock = lp_queue_lock(lp_queue);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = p_queue_best(lp_queue_priority_queue(lp_queue));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return the LP-QUEUE element with best priority.")
    public static SubLObject lp_queue_best(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_best(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }

    /**
     * Return the LP-QUEUE element with worst priority.
     */
    @LispMethod(comment = "Return the LP-QUEUE element with worst priority.")
    public static final SubLObject lp_queue_worst_alt(SubLObject lp_queue) {
        {
            SubLObject ans = NIL;
            if (NIL != locked_p_queue_p(lp_queue)) {
                {
                    SubLObject lock = lp_queue_lock(lp_queue);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = p_queue_worst(lp_queue_priority_queue(lp_queue));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return the LP-QUEUE element with worst priority.")
    public static SubLObject lp_queue_worst(final SubLObject lp_queue) {
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_queue_worst(lp_queue_priority_queue(lp_queue));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }/**
     * Return the LP-QUEUE element with worst priority.
     */


    /**
     * Add ITEM to LP-QUEUE and if the queue is full, then the worst item is bumped from the queue.
     * Returns multiple values lp-queue, bumped? bumped-item.
     */
    @LispMethod(comment = "Add ITEM to LP-QUEUE and if the queue is full, then the worst item is bumped from the queue.\r\nReturns multiple values lp-queue, bumped? bumped-item.\nAdd ITEM to LP-QUEUE and if the queue is full, then the worst item is bumped from the queue.\nReturns multiple values lp-queue, bumped? bumped-item.")
    public static final SubLObject lp_enqueue_alt(SubLObject item, SubLObject lp_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != locked_p_queue_p(lp_queue)) {
                    {
                        SubLObject lock = lp_queue_lock(lp_queue);
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            thread.resetMultipleValues();
                            {
                                SubLObject queue = p_enqueue(item, lp_queue_priority_queue(lp_queue));
                                SubLObject bumpedP = thread.secondMultipleValue();
                                SubLObject bumped_item = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                ans = list(lp_queue, bumpedP, bumped_item);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                    }
                }
                return subl_promotions.values_list(ans);
            }
        }
    }

    @LispMethod(comment = "Add ITEM to LP-QUEUE and if the queue is full, then the worst item is bumped from the queue.\r\nReturns multiple values lp-queue, bumped? bumped-item.\nAdd ITEM to LP-QUEUE and if the queue is full, then the worst item is bumped from the queue.\nReturns multiple values lp-queue, bumped? bumped-item.")
    public static SubLObject lp_enqueue(final SubLObject item, final SubLObject lp_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                thread.resetMultipleValues();
                final SubLObject queue = p_enqueue(item, lp_queue_priority_queue(lp_queue));
                final SubLObject bumpedP = thread.secondMultipleValue();
                final SubLObject bumped_item = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                ans = list(lp_queue, bumpedP, bumped_item);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return subl_promotions.values_list(ans);
    }

    /**
     * When WORST? is nil (default), remove and return the best item in LP-QUEUE.
     * Otherwise return the worst item in LP-QUEUE.
     */
    @LispMethod(comment = "When WORST? is nil (default), remove and return the best item in LP-QUEUE.\r\nOtherwise return the worst item in LP-QUEUE.\nWhen WORST? is nil (default), remove and return the best item in LP-QUEUE.\nOtherwise return the worst item in LP-QUEUE.")
    public static final SubLObject lp_dequeue_alt(SubLObject lp_queue, SubLObject worstP) {
        if (worstP == UNPROVIDED) {
            worstP = NIL;
        }
        {
            SubLObject ans = NIL;
            if (NIL != locked_p_queue_p(lp_queue)) {
                {
                    SubLObject lock = lp_queue_lock(lp_queue);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        ans = p_dequeue(lp_queue_priority_queue(lp_queue), worstP);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "When WORST? is nil (default), remove and return the best item in LP-QUEUE.\r\nOtherwise return the worst item in LP-QUEUE.\nWhen WORST? is nil (default), remove and return the best item in LP-QUEUE.\nOtherwise return the worst item in LP-QUEUE.")
    public static SubLObject lp_dequeue(final SubLObject lp_queue, SubLObject worstP) {
        if (worstP == UNPROVIDED) {
            worstP = NIL;
        }
        SubLObject ans = NIL;
        if (NIL != locked_p_queue_p(lp_queue)) {
            final SubLObject lock = lp_queue_lock(lp_queue);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = p_dequeue(lp_queue_priority_queue(lp_queue), worstP);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return ans;
    }/**
     * When WORST? is nil (default), remove and return the best item in LP-QUEUE.
     * Otherwise return the worst item in LP-QUEUE.
     */


    public static final SubLObject declare_queues_file_alt() {
        declareFunction("queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("queue_p", "QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.queues.$queue_p$UnaryFunction();
        declareFunction("q_num", "Q-NUM", 1, 0, false);
        declareFunction("q_elements", "Q-ELEMENTS", 1, 0, false);
        declareFunction("q_last", "Q-LAST", 1, 0, false);
        declareFunction("_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false);
        declareFunction("_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false);
        declareFunction("_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false);
        declareFunction("make_queue", "MAKE-QUEUE", 0, 1, false);
        declareFunction("print_queue", "PRINT-QUEUE", 3, 0, false);
        declareFunction("create_queue", "CREATE-QUEUE", 0, 0, false);
        declareFunction("clear_queue", "CLEAR-QUEUE", 1, 0, false);
        declareFunction("queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("queue_size", "QUEUE-SIZE", 1, 0, false);
        declareFunction("queue_elements", "QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("enqueue", "ENQUEUE", 2, 0, false);
        declareFunction("enqueue_all", "ENQUEUE-ALL", 2, 0, false);
        declareFunction("dequeue", "DEQUEUE", 1, 0, false);
        declareFunction("requeue", "REQUEUE", 1, 0, false);
        declareFunction("remqueue", "REMQUEUE", 2, 1, false);
        declareFunction("remlast_queue", "REMLAST-QUEUE", 1, 0, false);
        declareFunction("queue_find", "QUEUE-FIND", 2, 2, false);
        declareFunction("queue_find_if", "QUEUE-FIND-IF", 2, 1, false);
        declareFunction("queue_peek", "QUEUE-PEEK", 1, 0, false);
        declareFunction("queue_peek_n", "QUEUE-PEEK-N", 2, 0, false);
        declareFunction("new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false);
        declareMacro("do_queue_elements", "DO-QUEUE-ELEMENTS");
        declareFunction("do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false);
        declareMacro("do_queue_dequeue", "DO-QUEUE-DEQUEUE");
        declareFunction("queue_copy", "QUEUE-COPY", 1, 0, false);
        declareFunction("print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false);
        declareFunction("cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false);
        declareFunction("cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false);
        declareFunction("priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.queues.$priority_queue_p$UnaryFunction();
        declareFunction("p_queue_num", "P-QUEUE-NUM", 1, 0, false);
        declareFunction("p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false);
        declareFunction("p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false);
        declareFunction("p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false);
        declareFunction("p_queue_tree", "P-QUEUE-TREE", 1, 0, false);
        declareFunction("_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false);
        declareFunction("_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false);
        declareFunction("_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false);
        declareFunction("_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false);
        declareFunction("_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false);
        declareFunction("make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false);
        declareFunction("print_p_queue", "PRINT-P-QUEUE", 3, 0, false);
        declareFunction("create_p_queue", "CREATE-P-QUEUE", 2, 1, false);
        declareFunction("p_queue_size", "P-QUEUE-SIZE", 1, 0, false);
        declareFunction("p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false);
        declareFunction("p_queue_best", "P-QUEUE-BEST", 1, 0, false);
        declareFunction("p_queue_worst", "P-QUEUE-WORST", 1, 0, false);
        declareFunction("p_enqueue", "P-ENQUEUE", 2, 0, false);
        declareFunction("p_dequeue", "P-DEQUEUE", 1, 1, false);
        declareMacro("do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS");
        declareFunction("do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false);
        declareFunction("p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("p_queue_find", "P-QUEUE-FIND", 2, 2, false);
        declareFunction("p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false);
        declareFunction("pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false);
        new com.cyc.cycjava.cycl.queues.$pq_collision_enter$BinaryFunction();
        declareFunction("pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false);
        declareFunction("pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false);
        declareFunction("pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false);
        new com.cyc.cycjava.cycl.queues.$pq_collision_remove$BinaryFunction();
        declareFunction("pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false);
        new com.cyc.cycjava.cycl.queues.$pq_collision_empty$UnaryFunction();
        declareFunction("lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.queues.$lazy_priority_queue_p$UnaryFunction();
        declareFunction("lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false);
        declareFunction("lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false);
        declareFunction("_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false);
        declareFunction("_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false);
        declareFunction("make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false);
        declareFunction("print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false);
        declareFunction("new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false);
        declareMacro("do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS");
        declareFunction("lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false);
        declareFunction("lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false);
        declareFunction("lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false);
        declareFunction("lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false);
        declareFunction("ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false);
        declareFunction("locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.queues.$locked_queue_p$UnaryFunction();
        declareFunction("locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false);
        declareFunction("locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false);
        declareFunction("_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false);
        declareFunction("_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false);
        declareFunction("make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false);
        declareFunction("create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false);
        declareFunction("clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false);
        declareFunction("locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false);
        declareFunction("locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false);
        declareFunction("locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false);
        declareFunction("locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.queues.$locked_p_queue_p$UnaryFunction();
        declareFunction("lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false);
        declareFunction("lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false);
        declareFunction("_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false);
        declareFunction("_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false);
        declareFunction("make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false);
        declareFunction("print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false);
        declareFunction("create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false);
        declareFunction("lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false);
        declareFunction("lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false);
        declareFunction("lp_queue_best", "LP-QUEUE-BEST", 1, 0, false);
        declareFunction("lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false);
        declareFunction("lp_enqueue", "LP-ENQUEUE", 2, 0, false);
        declareFunction("lp_dequeue", "LP-DEQUEUE", 1, 1, false);
        declareFunction("get_priority_queue_test_case_p_queue", "GET-PRIORITY-QUEUE-TEST-CASE-P-QUEUE", 1, 0, false);
        declareFunction("set_priority_queue_test_case_p_queue", "SET-PRIORITY-QUEUE-TEST-CASE-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_priority_queue_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-PRIORITY-QUEUE-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_priority_queue_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-PRIORITY-QUEUE-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("priority_queue_test_case_p", "PRIORITY-QUEUE-TEST-CASE-P", 1, 0, false);
        declareFunction("get_locked_priority_queue_test_case_lp_queue", "GET-LOCKED-PRIORITY-QUEUE-TEST-CASE-LP-QUEUE", 1, 0, false);
        declareFunction("set_locked_priority_queue_test_case_lp_queue", "SET-LOCKED-PRIORITY-QUEUE-TEST-CASE-LP-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_locked_priority_queue_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-LOCKED-PRIORITY-QUEUE-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_locked_priority_queue_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-LOCKED-PRIORITY-QUEUE-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("locked_priority_queue_test_case_p", "LOCKED-PRIORITY-QUEUE-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_queues_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("queue_p", "QUEUE-P", 1, 0, false);
            new queues.$queue_p$UnaryFunction();
            declareFunction("q_num", "Q-NUM", 1, 0, false);
            declareFunction("q_elements", "Q-ELEMENTS", 1, 0, false);
            declareFunction("q_last", "Q-LAST", 1, 0, false);
            declareFunction("_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false);
            declareFunction("_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false);
            declareFunction("_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false);
            declareFunction("make_queue", "MAKE-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_queue", "VISIT-DEFSTRUCT-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_queue_method", "VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD", 2, 0, false);
            declareFunction("print_queue", "PRINT-QUEUE", 3, 0, false);
            declareFunction("create_queue", "CREATE-QUEUE", 0, 1, false);
            declareFunction("clear_queue", "CLEAR-QUEUE", 1, 0, false);
            declareFunction("queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false);
            declareFunction("queue_not_empty_p", "QUEUE-NOT-EMPTY-P", 1, 0, false);
            declareFunction("queue_size", "QUEUE-SIZE", 1, 0, false);
            declareFunction("queue_elements", "QUEUE-ELEMENTS", 1, 0, false);
            declareFunction("enqueue", "ENQUEUE", 2, 0, false);
            declareFunction("enqueue_all", "ENQUEUE-ALL", 2, 0, false);
            declareFunction("dequeue", "DEQUEUE", 1, 0, false);
            declareFunction("dequeue_all", "DEQUEUE-ALL", 1, 0, false);
            declareFunction("requeue", "REQUEUE", 1, 0, false);
            declareFunction("remqueue", "REMQUEUE", 2, 1, false);
            declareFunction("remlast_queue", "REMLAST-QUEUE", 1, 0, false);
            declareFunction("queue_find", "QUEUE-FIND", 2, 2, false);
            declareFunction("queue_find_if", "QUEUE-FIND-IF", 2, 1, false);
            declareFunction("queue_peek", "QUEUE-PEEK", 1, 0, false);
            declareFunction("queue_peek_n", "QUEUE-PEEK-N", 2, 0, false);
            declareFunction("new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false);
            declareMacro("do_queue_elements", "DO-QUEUE-ELEMENTS");
            declareFunction("do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false);
            declareMacro("do_queue_dequeue", "DO-QUEUE-DEQUEUE");
            declareFunction("queue_copy", "QUEUE-COPY", 1, 0, false);
            declareFunction("print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false);
            declareFunction("cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false);
            declareFunction("cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false);
            declareFunction("cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false);
            declareFunction("cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false);
            declareFunction("priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false);
            new queues.$priority_queue_p$UnaryFunction();
            declareFunction("p_queue_num", "P-QUEUE-NUM", 1, 0, false);
            declareFunction("p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false);
            declareFunction("p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false);
            declareFunction("p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false);
            declareFunction("p_queue_tree", "P-QUEUE-TREE", 1, 0, false);
            declareFunction("_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false);
            declareFunction("_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false);
            declareFunction("_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false);
            declareFunction("_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false);
            declareFunction("_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false);
            declareFunction("make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_priority_queue", "VISIT-DEFSTRUCT-PRIORITY-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD", 2, 0, false);
            declareFunction("print_p_queue", "PRINT-P-QUEUE", 3, 0, false);
            declareFunction("create_p_queue", "CREATE-P-QUEUE", 2, 1, false);
            declareFunction("p_queue_clear", "P-QUEUE-CLEAR", 1, 0, false);
            declareFunction("p_queue_size", "P-QUEUE-SIZE", 1, 0, false);
            declareFunction("p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false);
            declareFunction("p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false);
            declareFunction("p_queue_best", "P-QUEUE-BEST", 1, 0, false);
            declareFunction("p_queue_worst", "P-QUEUE-WORST", 1, 0, false);
            declareFunction("p_enqueue", "P-ENQUEUE", 2, 0, false);
            declareFunction("p_dequeue", "P-DEQUEUE", 1, 1, false);
            declareMacro("do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS");
            declareFunction("do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false);
            declareFunction("p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false);
            declareFunction("p_queue_find", "P-QUEUE-FIND", 2, 2, false);
            declareFunction("p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false);
            declareFunction("pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false);
            new queues.$pq_collision_enter$BinaryFunction();
            declareFunction("pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false);
            declareFunction("pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false);
            declareFunction("pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false);
            new queues.$pq_collision_remove$BinaryFunction();
            declareFunction("pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false);
            new queues.$pq_collision_empty$UnaryFunction();
            declareFunction("lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false);
            new queues.$lazy_priority_queue_p$UnaryFunction();
            declareFunction("lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false);
            declareFunction("lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false);
            declareFunction("_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false);
            declareFunction("_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false);
            declareFunction("make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_lazy_priority_queue", "VISIT-DEFSTRUCT-LAZY-PRIORITY-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_lazy_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD", 2, 0, false);
            declareFunction("print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false);
            declareFunction("new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false);
            declareMacro("do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS");
            declareFunction("lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false);
            declareFunction("lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false);
            declareFunction("lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false);
            declareFunction("lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false);
            declareFunction("lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false);
            declareFunction("lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false);
            declareFunction("ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false);
            declareFunction("locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false);
            new queues.$locked_queue_p$UnaryFunction();
            declareFunction("locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false);
            declareFunction("locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false);
            declareFunction("_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false);
            declareFunction("_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false);
            declareFunction("make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_locked_queue", "VISIT-DEFSTRUCT-LOCKED-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_locked_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD", 2, 0, false);
            declareFunction("create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false);
            declareFunction("clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false);
            declareFunction("locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false);
            declareFunction("locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false);
            declareFunction("locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false);
            declareFunction("locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false);
            declareFunction("locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false);
            declareFunction("locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false);
            new queues.$locked_p_queue_p$UnaryFunction();
            declareFunction("lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false);
            declareFunction("lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false);
            declareFunction("_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false);
            declareFunction("_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false);
            declareFunction("make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_locked_p_queue", "VISIT-DEFSTRUCT-LOCKED-P-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_locked_p_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD", 2, 0, false);
            declareFunction("print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false);
            declareFunction("create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false);
            declareFunction("lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false);
            declareFunction("lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false);
            declareFunction("lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false);
            declareFunction("lp_queue_best", "LP-QUEUE-BEST", 1, 0, false);
            declareFunction("lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false);
            declareFunction("lp_enqueue", "LP-ENQUEUE", 2, 0, false);
            declareFunction("lp_dequeue", "LP-DEQUEUE", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("create_queue", "CREATE-QUEUE", 0, 0, false);
            declareFunction("get_priority_queue_test_case_p_queue", "GET-PRIORITY-QUEUE-TEST-CASE-P-QUEUE", 1, 0, false);
            declareFunction("set_priority_queue_test_case_p_queue", "SET-PRIORITY-QUEUE-TEST-CASE-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_priority_queue_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-PRIORITY-QUEUE-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_priority_queue_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-PRIORITY-QUEUE-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("priority_queue_test_case_p", "PRIORITY-QUEUE-TEST-CASE-P", 1, 0, false);
            declareFunction("get_locked_priority_queue_test_case_lp_queue", "GET-LOCKED-PRIORITY-QUEUE-TEST-CASE-LP-QUEUE", 1, 0, false);
            declareFunction("set_locked_priority_queue_test_case_lp_queue", "SET-LOCKED-PRIORITY-QUEUE-TEST-CASE-LP-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_locked_priority_queue_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-LOCKED-PRIORITY-QUEUE-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_locked_priority_queue_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-LOCKED-PRIORITY-QUEUE-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("locked_priority_queue_test_case_p", "LOCKED-PRIORITY-QUEUE-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject init_queues_file() {
        defconstant("*DTP-QUEUE*", QUEUE);
        defconstant("*CFASL-WIDE-OPCODE-QUEUE*", $int$131);
        defconstant("*DTP-PRIORITY-QUEUE*", PRIORITY_QUEUE);
        defconstant("*DTP-LAZY-PRIORITY-QUEUE*", LAZY_PRIORITY_QUEUE);
        defconstant("*DTP-LOCKED-QUEUE*", LOCKED_QUEUE);
        defconstant("*DTP-LOCKED-P-QUEUE*", LOCKED_P_QUEUE);
        return NIL;
    }

    public static final SubLObject setup_queues_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(Q_NUM, _CSETF_Q_NUM);
        def_csetf(Q_ELEMENTS, _CSETF_Q_ELEMENTS);
        def_csetf(Q_LAST, _CSETF_Q_LAST);
        identity(QUEUE);
        register_macro_helper(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, DO_QUEUE_ELEMENTS);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_queue$.getGlobalValue(), CFASL_INPUT_QUEUE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(P_QUEUE_NUM, _CSETF_P_QUEUE_NUM);
        def_csetf(P_QUEUE_MAX_SIZE, _CSETF_P_QUEUE_MAX_SIZE);
        def_csetf(P_QUEUE_RANK_FUNC, _CSETF_P_QUEUE_RANK_FUNC);
        def_csetf(P_QUEUE_COMP_FUNC, _CSETF_P_QUEUE_COMP_FUNC);
        def_csetf(P_QUEUE_TREE, _CSETF_P_QUEUE_TREE);
        identity(PRIORITY_QUEUE);
        register_macro_helper(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, DO_PRIORITY_QUEUE_ELEMENTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(LAZY_P_QUEUE_ORDERED_ITEMS, _CSETF_LAZY_P_QUEUE_ORDERED_ITEMS);
        def_csetf(LAZY_P_QUEUE_NEW_ITEMS, _CSETF_LAZY_P_QUEUE_NEW_ITEMS);
        identity(LAZY_PRIORITY_QUEUE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(LOCKED_QUEUE_LOCK, _CSETF_LOCKED_QUEUE_LOCK);
        def_csetf(LOCKED_QUEUE_QUEUE, _CSETF_LOCKED_QUEUE_QUEUE);
        identity(LOCKED_QUEUE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(LP_QUEUE_LOCK, _CSETF_LP_QUEUE_LOCK);
        def_csetf(LP_QUEUE_PRIORITY_QUEUE, _CSETF_LP_QUEUE_PRIORITY_QUEUE);
        identity(LOCKED_P_QUEUE);
        sunit_external.define_test_category($$$Queues_Module_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($$$Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
        sunit_external.define_test_suite($$$Priority_Queue_Testing_Suite, list($$$Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(PRIORITY_QUEUE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(PRIORITY_QUEUE_TEST_CASE);
        classes.subloop_new_class(PRIORITY_QUEUE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt130);
        classes.class_set_implements_slot_listeners(PRIORITY_QUEUE_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(PRIORITY_QUEUE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PRIORITY_QUEUE_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(PRIORITY_QUEUE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PRIORITY_QUEUE_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_priority_queue_test_case_class(PRIORITY_QUEUE_TEST_CASE);
        sunit_macros.define_test_case_postamble(PRIORITY_QUEUE_TEST_CASE, $$$queues, $$$cycl, $list_alt148);
        sunit_macros.def_test_method_register(PRIORITY_QUEUE_TEST_CASE, TEST);
        sunit_external.define_test_category($$$Locked_Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
        sunit_external.define_test_suite($str_alt151$Locked_Priority_Queue_Testing_Sui, list($$$Locked_Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(LOCKED_PRIORITY_QUEUE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(LOCKED_PRIORITY_QUEUE_TEST_CASE);
        classes.subloop_new_class(LOCKED_PRIORITY_QUEUE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt153);
        classes.class_set_implements_slot_listeners(LOCKED_PRIORITY_QUEUE_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(LOCKED_PRIORITY_QUEUE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_LOCKED_PRIORITY_QUEUE_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(LOCKED_PRIORITY_QUEUE_TEST_CASE, $sym156$SUBLOOP_RESERVED_INITIALIZE_LOCKED_PRIORITY_QUEUE_TEST_CASE_INSTA);
        subloop_reserved_initialize_locked_priority_queue_test_case_class(LOCKED_PRIORITY_QUEUE_TEST_CASE);
        sunit_macros.define_test_case_postamble(LOCKED_PRIORITY_QUEUE_TEST_CASE, $$$queues, $$$cycl, $list_alt157);
        sunit_macros.def_test_method_register(LOCKED_PRIORITY_QUEUE_TEST_CASE, TEST);
        return NIL;
    }

    public static SubLObject setup_queues_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(Q_NUM, _CSETF_Q_NUM);
            def_csetf(Q_ELEMENTS, _CSETF_Q_ELEMENTS);
            def_csetf(Q_LAST, _CSETF_Q_LAST);
            identity(QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD));
            register_macro_helper(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, DO_QUEUE_ELEMENTS);
            register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_queue$.getGlobalValue(), CFASL_INPUT_QUEUE);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_QUEUE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list56);
            def_csetf(P_QUEUE_NUM, _CSETF_P_QUEUE_NUM);
            def_csetf(P_QUEUE_MAX_SIZE, _CSETF_P_QUEUE_MAX_SIZE);
            def_csetf(P_QUEUE_RANK_FUNC, _CSETF_P_QUEUE_RANK_FUNC);
            def_csetf(P_QUEUE_COMP_FUNC, _CSETF_P_QUEUE_COMP_FUNC);
            def_csetf(P_QUEUE_TREE, _CSETF_P_QUEUE_TREE);
            identity(PRIORITY_QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD));
            register_macro_helper(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, DO_PRIORITY_QUEUE_ELEMENTS);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list92);
            def_csetf(LAZY_P_QUEUE_ORDERED_ITEMS, _CSETF_LAZY_P_QUEUE_ORDERED_ITEMS);
            def_csetf(LAZY_P_QUEUE_NEW_ITEMS, _CSETF_LAZY_P_QUEUE_NEW_ITEMS);
            identity(LAZY_PRIORITY_QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list113);
            def_csetf(LOCKED_QUEUE_LOCK, _CSETF_LOCKED_QUEUE_LOCK);
            def_csetf(LOCKED_QUEUE_QUEUE, _CSETF_LOCKED_QUEUE_QUEUE);
            identity(LOCKED_QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list131);
            def_csetf(LP_QUEUE_LOCK, _CSETF_LP_QUEUE_LOCK);
            def_csetf(LP_QUEUE_PRIORITY_QUEUE, _CSETF_LP_QUEUE_PRIORITY_QUEUE);
            identity(LOCKED_P_QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD));
            sunit_external.define_test_category($$$Queues_Module_Supercategory, UNPROVIDED);
            sunit_external.define_test_category($$$Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
            sunit_external.define_test_suite($$$Priority_Queue_Testing_Suite, list($$$Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
            sunit_external.define_test_category($$$Locked_Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
            sunit_external.define_test_suite($str144$Locked_Priority_Queue_Testing_Sui, list($$$Locked_Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(PRIORITY_QUEUE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(PRIORITY_QUEUE_TEST_CASE);
            classes.subloop_new_class(PRIORITY_QUEUE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt130);
            classes.class_set_implements_slot_listeners(PRIORITY_QUEUE_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(PRIORITY_QUEUE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PRIORITY_QUEUE_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(PRIORITY_QUEUE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PRIORITY_QUEUE_TEST_CASE_INSTANCE);
            subloop_reserved_initialize_priority_queue_test_case_class(PRIORITY_QUEUE_TEST_CASE);
            sunit_macros.define_test_case_postamble(PRIORITY_QUEUE_TEST_CASE, $$$queues, $$$cycl, $list_alt148);
            sunit_macros.def_test_method_register(PRIORITY_QUEUE_TEST_CASE, TEST);
            sunit_external.define_test_suite($str_alt151$Locked_Priority_Queue_Testing_Sui, list($$$Locked_Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(LOCKED_PRIORITY_QUEUE_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(LOCKED_PRIORITY_QUEUE_TEST_CASE);
            classes.subloop_new_class(LOCKED_PRIORITY_QUEUE_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt153);
            classes.class_set_implements_slot_listeners(LOCKED_PRIORITY_QUEUE_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(LOCKED_PRIORITY_QUEUE_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_LOCKED_PRIORITY_QUEUE_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(LOCKED_PRIORITY_QUEUE_TEST_CASE, $sym156$SUBLOOP_RESERVED_INITIALIZE_LOCKED_PRIORITY_QUEUE_TEST_CASE_INSTA);
            subloop_reserved_initialize_locked_priority_queue_test_case_class(LOCKED_PRIORITY_QUEUE_TEST_CASE);
            sunit_macros.define_test_case_postamble(LOCKED_PRIORITY_QUEUE_TEST_CASE, $$$queues, $$$cycl, $list_alt157);
            sunit_macros.def_test_method_register(LOCKED_PRIORITY_QUEUE_TEST_CASE, TEST);
        }
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_queues_file();
    }

    @Override
    public void initializeVariables() {
        init_queues_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_queues_file();
    }

    static {
    }

    public static final class $queue_p$UnaryFunction extends UnaryFunction {
        public $queue_p$UnaryFunction() {
            super(extractFunctionNamed("QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return queue_p(arg1);
        }
    }

    public static final class $priority_queue_native extends SubLStructNative {
        public SubLObject $num;

        public SubLObject $max_size;

        public SubLObject $rank_func;

        public SubLObject $comp_func;

        public SubLObject $tree;

        private static final SubLStructDeclNative structDecl;

        public $priority_queue_native() {
            queues.$priority_queue_native.this.$num = Lisp.NIL;
            queues.$priority_queue_native.this.$max_size = Lisp.NIL;
            queues.$priority_queue_native.this.$rank_func = Lisp.NIL;
            queues.$priority_queue_native.this.$comp_func = Lisp.NIL;
            queues.$priority_queue_native.this.$tree = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return queues.$priority_queue_native.this.$num;
        }

        @Override
        public SubLObject getField3() {
            return queues.$priority_queue_native.this.$max_size;
        }

        @Override
        public SubLObject getField4() {
            return queues.$priority_queue_native.this.$rank_func;
        }

        @Override
        public SubLObject getField5() {
            return queues.$priority_queue_native.this.$comp_func;
        }

        @Override
        public SubLObject getField6() {
            return queues.$priority_queue_native.this.$tree;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return queues.$priority_queue_native.this.$num = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return queues.$priority_queue_native.this.$max_size = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return queues.$priority_queue_native.this.$rank_func = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return queues.$priority_queue_native.this.$comp_func = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return queues.$priority_queue_native.this.$tree = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.queues.$priority_queue_native.class, PRIORITY_QUEUE, PRIORITY_QUEUE_P, $list50, $list51, new String[]{ "$num", "$max_size", "$rank_func", "$comp_func", "$tree" }, $list52, $list53, PRINT_P_QUEUE);
        }
    }

    public static final class $priority_queue_p$UnaryFunction extends UnaryFunction {
        public $priority_queue_p$UnaryFunction() {
            super(extractFunctionNamed("PRIORITY-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return priority_queue_p(arg1);
        }
    }

    public static final class $pq_collision_enter$BinaryFunction extends BinaryFunction {
        public $pq_collision_enter$BinaryFunction() {
            super(extractFunctionNamed("PQ-COLLISION-ENTER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pq_collision_enter(arg1, arg2);
        }
    }

    public static final class $pq_collision_remove$BinaryFunction extends BinaryFunction {
        public $pq_collision_remove$BinaryFunction() {
            super(extractFunctionNamed("PQ-COLLISION-REMOVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pq_collision_remove(arg1, arg2);
        }
    }

    public static final class $pq_collision_empty$UnaryFunction extends UnaryFunction {
        public $pq_collision_empty$UnaryFunction() {
            super(extractFunctionNamed("PQ-COLLISION-EMPTY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pq_collision_empty(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"), makeSymbol("LAST"));

    static private final SubLList $list_alt3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"), $LAST);

    static private final SubLList $list_alt4 = list(makeSymbol("Q-NUM"), makeSymbol("Q-ELEMENTS"), makeSymbol("Q-LAST"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-Q-NUM"), makeSymbol("_CSETF-Q-ELEMENTS"), makeSymbol("_CSETF-Q-LAST"));

    public static final class $lazy_priority_queue_p$UnaryFunction extends UnaryFunction {
        public $lazy_priority_queue_p$UnaryFunction() {
            super(extractFunctionNamed("LAZY-PRIORITY-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return lazy_priority_queue_p(arg1);
        }
    }

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt18$__ = makeString("#<");

    static private final SubLString $str_alt20$size_ = makeString("size=");

    static private final SubLList $list_alt22 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list($DONE);

    static private final SubLSymbol $sym29$Q = makeUninternedSymbol("Q");

    public static final class $locked_queue_p$UnaryFunction extends UnaryFunction {
        public $locked_queue_p$UnaryFunction() {
            super(extractFunctionNamed("LOCKED-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return locked_queue_p(arg1);
        }
    }

    static private final SubLSymbol $sym30$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    static private final SubLString $str_alt38$__Queue_length____a = makeString("~%Queue length : ~a");

    static private final SubLString $str_alt39$__Queue_contents__ = makeString("~%Queue contents :");

    public static final class $locked_p_queue_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $priority_queue;

        private static final SubLStructDeclNative structDecl;

        public $locked_p_queue_native() {
            queues.$locked_p_queue_native.this.$lock = Lisp.NIL;
            queues.$locked_p_queue_native.this.$priority_queue = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return queues.$locked_p_queue_native.this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return queues.$locked_p_queue_native.this.$priority_queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return queues.$locked_p_queue_native.this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return queues.$locked_p_queue_native.this.$priority_queue = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.queues.$locked_p_queue_native.class, LOCKED_P_QUEUE, LOCKED_P_QUEUE_P, $list125, $list126, new String[]{ "$lock", "$priority_queue" }, $list127, $list128, PRINT_LP_QUEUE);
        }
    }

    static private final SubLString $str_alt40$___s = makeString("~%~s");

    static private final SubLString $str_alt44$We_promised_to_write__A_elements_ = makeString("We promised to write ~A elements but wrote ~A.");

    static private final SubLList $list_alt47 = list(makeSymbol("NUM"), makeSymbol("MAX-SIZE"), makeSymbol("RANK-FUNC"), makeSymbol("COMP-FUNC"), makeSymbol("TREE"));

    static private final SubLList $list_alt48 = list(makeKeyword("NUM"), makeKeyword("MAX-SIZE"), makeKeyword("RANK-FUNC"), makeKeyword("COMP-FUNC"), $TREE);

    static private final SubLList $list_alt49 = list(makeSymbol("P-QUEUE-NUM"), makeSymbol("P-QUEUE-MAX-SIZE"), makeSymbol("P-QUEUE-RANK-FUNC"), makeSymbol("P-QUEUE-COMP-FUNC"), makeSymbol("P-QUEUE-TREE"));

    public static final class $locked_p_queue_p$UnaryFunction extends UnaryFunction {
        public $locked_p_queue_p$UnaryFunction() {
            super(extractFunctionNamed("LOCKED-P-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return locked_p_queue_p(arg1);
        }
    }

    static private final SubLList $list_alt50 = list(makeSymbol("_CSETF-P-QUEUE-NUM"), makeSymbol("_CSETF-P-QUEUE-MAX-SIZE"), makeSymbol("_CSETF-P-QUEUE-RANK-FUNC"), makeSymbol("_CSETF-P-QUEUE-COMP-FUNC"), makeSymbol("_CSETF-P-QUEUE-TREE"));

    /**
     * Return a new, empty queue.
     *
     * @return 
     */
    @LispMethod(comment = "Return a new, empty queue.\r\n\r\n@return")
    public static final SubLObject create_queue_alt() {
        return clear_queue(make_queue(UNPROVIDED));
    }

    public static SubLObject declare_queues_file_Previous() {
        declareFunction("queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("queue_p", "QUEUE-P", 1, 0, false);
        new queues.$queue_p$UnaryFunction();
        declareFunction("q_num", "Q-NUM", 1, 0, false);
        declareFunction("q_elements", "Q-ELEMENTS", 1, 0, false);
        declareFunction("q_last", "Q-LAST", 1, 0, false);
        declareFunction("_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false);
        declareFunction("_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false);
        declareFunction("_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false);
        declareFunction("make_queue", "MAKE-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_queue", "VISIT-DEFSTRUCT-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_queue_method", "VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD", 2, 0, false);
        declareFunction("print_queue", "PRINT-QUEUE", 3, 0, false);
        declareFunction("create_queue", "CREATE-QUEUE", 0, 1, false);
        declareFunction("clear_queue", "CLEAR-QUEUE", 1, 0, false);
        declareFunction("queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("queue_not_empty_p", "QUEUE-NOT-EMPTY-P", 1, 0, false);
        declareFunction("queue_size", "QUEUE-SIZE", 1, 0, false);
        declareFunction("queue_elements", "QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("enqueue", "ENQUEUE", 2, 0, false);
        declareFunction("enqueue_all", "ENQUEUE-ALL", 2, 0, false);
        declareFunction("dequeue", "DEQUEUE", 1, 0, false);
        declareFunction("dequeue_all", "DEQUEUE-ALL", 1, 0, false);
        declareFunction("requeue", "REQUEUE", 1, 0, false);
        declareFunction("remqueue", "REMQUEUE", 2, 1, false);
        declareFunction("remlast_queue", "REMLAST-QUEUE", 1, 0, false);
        declareFunction("queue_find", "QUEUE-FIND", 2, 2, false);
        declareFunction("queue_find_if", "QUEUE-FIND-IF", 2, 1, false);
        declareFunction("queue_peek", "QUEUE-PEEK", 1, 0, false);
        declareFunction("queue_peek_n", "QUEUE-PEEK-N", 2, 0, false);
        declareFunction("new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false);
        declareMacro("do_queue_elements", "DO-QUEUE-ELEMENTS");
        declareFunction("do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false);
        declareMacro("do_queue_dequeue", "DO-QUEUE-DEQUEUE");
        declareFunction("queue_copy", "QUEUE-COPY", 1, 0, false);
        declareFunction("print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false);
        declareFunction("cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false);
        declareFunction("cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false);
        declareFunction("priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false);
        new queues.$priority_queue_p$UnaryFunction();
        declareFunction("p_queue_num", "P-QUEUE-NUM", 1, 0, false);
        declareFunction("p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false);
        declareFunction("p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false);
        declareFunction("p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false);
        declareFunction("p_queue_tree", "P-QUEUE-TREE", 1, 0, false);
        declareFunction("_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false);
        declareFunction("_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false);
        declareFunction("_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false);
        declareFunction("_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false);
        declareFunction("_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false);
        declareFunction("make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_priority_queue", "VISIT-DEFSTRUCT-PRIORITY-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD", 2, 0, false);
        declareFunction("print_p_queue", "PRINT-P-QUEUE", 3, 0, false);
        declareFunction("create_p_queue", "CREATE-P-QUEUE", 2, 1, false);
        declareFunction("p_queue_clear", "P-QUEUE-CLEAR", 1, 0, false);
        declareFunction("p_queue_size", "P-QUEUE-SIZE", 1, 0, false);
        declareFunction("p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false);
        declareFunction("p_queue_best", "P-QUEUE-BEST", 1, 0, false);
        declareFunction("p_queue_worst", "P-QUEUE-WORST", 1, 0, false);
        declareFunction("p_enqueue", "P-ENQUEUE", 2, 0, false);
        declareFunction("p_dequeue", "P-DEQUEUE", 1, 1, false);
        declareMacro("do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS");
        declareFunction("do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false);
        declareFunction("p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("p_queue_find", "P-QUEUE-FIND", 2, 2, false);
        declareFunction("p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false);
        declareFunction("pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false);
        new queues.$pq_collision_enter$BinaryFunction();
        declareFunction("pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false);
        declareFunction("pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false);
        declareFunction("pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false);
        new queues.$pq_collision_remove$BinaryFunction();
        declareFunction("pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false);
        new queues.$pq_collision_empty$UnaryFunction();
        declareFunction("lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false);
        new queues.$lazy_priority_queue_p$UnaryFunction();
        declareFunction("lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false);
        declareFunction("lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false);
        declareFunction("_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false);
        declareFunction("_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false);
        declareFunction("make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_lazy_priority_queue", "VISIT-DEFSTRUCT-LAZY-PRIORITY-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_lazy_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD", 2, 0, false);
        declareFunction("print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false);
        declareFunction("new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false);
        declareMacro("do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS");
        declareFunction("lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false);
        declareFunction("lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false);
        declareFunction("lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false);
        declareFunction("lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false);
        declareFunction("ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false);
        declareFunction("locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false);
        new queues.$locked_queue_p$UnaryFunction();
        declareFunction("locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false);
        declareFunction("locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false);
        declareFunction("_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false);
        declareFunction("_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false);
        declareFunction("make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_locked_queue", "VISIT-DEFSTRUCT-LOCKED-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_locked_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD", 2, 0, false);
        declareFunction("create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false);
        declareFunction("clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false);
        declareFunction("locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false);
        declareFunction("locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false);
        declareFunction("locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false);
        declareFunction("locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false);
        declareFunction("locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false);
        new queues.$locked_p_queue_p$UnaryFunction();
        declareFunction("lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false);
        declareFunction("lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false);
        declareFunction("_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false);
        declareFunction("_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false);
        declareFunction("make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_locked_p_queue", "VISIT-DEFSTRUCT-LOCKED-P-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_locked_p_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD", 2, 0, false);
        declareFunction("print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false);
        declareFunction("create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false);
        declareFunction("lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false);
        declareFunction("lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false);
        declareFunction("lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false);
        declareFunction("lp_queue_best", "LP-QUEUE-BEST", 1, 0, false);
        declareFunction("lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false);
        declareFunction("lp_enqueue", "LP-ENQUEUE", 2, 0, false);
        declareFunction("lp_dequeue", "LP-DEQUEUE", 1, 1, false);
        return NIL;
    }

    public static SubLObject setup_queues_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(Q_NUM, _CSETF_Q_NUM);
        def_csetf(Q_ELEMENTS, _CSETF_Q_ELEMENTS);
        def_csetf(Q_LAST, _CSETF_Q_LAST);
        identity(QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD));
        register_macro_helper(DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, DO_QUEUE_ELEMENTS);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_queue$.getGlobalValue(), CFASL_INPUT_QUEUE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list56);
        def_csetf(P_QUEUE_NUM, _CSETF_P_QUEUE_NUM);
        def_csetf(P_QUEUE_MAX_SIZE, _CSETF_P_QUEUE_MAX_SIZE);
        def_csetf(P_QUEUE_RANK_FUNC, _CSETF_P_QUEUE_RANK_FUNC);
        def_csetf(P_QUEUE_COMP_FUNC, _CSETF_P_QUEUE_COMP_FUNC);
        def_csetf(P_QUEUE_TREE, _CSETF_P_QUEUE_TREE);
        identity(PRIORITY_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD));
        register_macro_helper(DO_PRIORITY_QUEUE_ELEMENTS_BTREE, DO_PRIORITY_QUEUE_ELEMENTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list92);
        def_csetf(LAZY_P_QUEUE_ORDERED_ITEMS, _CSETF_LAZY_P_QUEUE_ORDERED_ITEMS);
        def_csetf(LAZY_P_QUEUE_NEW_ITEMS, _CSETF_LAZY_P_QUEUE_NEW_ITEMS);
        identity(LAZY_PRIORITY_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list113);
        def_csetf(LOCKED_QUEUE_LOCK, _CSETF_LOCKED_QUEUE_LOCK);
        def_csetf(LOCKED_QUEUE_QUEUE, _CSETF_LOCKED_QUEUE_QUEUE);
        identity(LOCKED_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list131);
        def_csetf(LP_QUEUE_LOCK, _CSETF_LP_QUEUE_LOCK);
        def_csetf(LP_QUEUE_PRIORITY_QUEUE, _CSETF_LP_QUEUE_PRIORITY_QUEUE);
        identity(LOCKED_P_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD));
        sunit_external.define_test_category($$$Queues_Module_Supercategory, UNPROVIDED);
        sunit_external.define_test_category($$$Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
        sunit_external.define_test_suite($$$Priority_Queue_Testing_Suite, list($$$Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        sunit_external.define_test_category($$$Locked_Priority_Queue_Subcategory, list($$$Queues_Module_Supercategory));
        sunit_external.define_test_suite($str144$Locked_Priority_Queue_Testing_Sui, list($$$Locked_Priority_Queue_Subcategory), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @return Return a new, empty queue.
     * @return 
     */
    /**
     * Return a new, empty queue.
     *
     * @return 
     */
    @LispMethod(comment = "@return Return a new, empty queue.\r\n@return")
    public static SubLObject create_queue() {
        return create_queue(NIL);
    }

    static private final SubLSymbol $sym67$_ = makeSymbol("<");

    static private final SubLList $list_alt71 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("PRIORITY-QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym72$KEY_VAR = makeUninternedSymbol("KEY-VAR");

    static private final SubLSymbol $sym73$COLLISIONS_VAR = makeUninternedSymbol("COLLISIONS-VAR");

    static private final SubLList $list_alt80 = list(makeSymbol("ORDERED-ITEMS"), makeSymbol("NEW-ITEMS"));

    static private final SubLList $list_alt81 = list(makeKeyword("ORDERED-ITEMS"), makeKeyword("NEW-ITEMS"));

    static private final SubLList $list_alt82 = list(makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("LAZY-P-QUEUE-NEW-ITEMS"));

    static private final SubLList $list_alt83 = list(makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS"));

    static private final SubLString $str_alt92$___S_new_ = makeString(" (~S new)");

    static private final SubLSymbol $sym93$_ = makeSymbol(">");

    static private final SubLList $list_alt94 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("LPQ"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt98 = list(makeSymbol("LOCK"), makeSymbol("QUEUE"));

    static private final SubLList $list_alt99 = list($LOCK, makeKeyword("QUEUE"));

    static private final SubLList $list_alt100 = list(makeSymbol("LOCKED-QUEUE-LOCK"), makeSymbol("LOCKED-QUEUE-QUEUE"));

    static private final SubLList $list_alt101 = list(makeSymbol("_CSETF-LOCKED-QUEUE-LOCK"), makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE"));

    static private final SubLList $list_alt113 = list(makeSymbol("LOCK"), makeSymbol("PRIORITY-QUEUE"));

    static private final SubLList $list_alt114 = list($LOCK, makeKeyword("PRIORITY-QUEUE"));

    static private final SubLList $list_alt115 = list(makeSymbol("LP-QUEUE-LOCK"), makeSymbol("LP-QUEUE-PRIORITY-QUEUE"));

    static private final SubLList $list_alt116 = list(makeSymbol("_CSETF-LP-QUEUE-LOCK"), makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE"));

    static private final SubLString $str_alt124$_tree_ = makeString(" tree=");

    private static final SubLSymbol PRIORITY_QUEUE_TEST_CASE = makeSymbol("PRIORITY-QUEUE-TEST-CASE");

    static private final SubLList $list_alt130 = list(list(makeSymbol("P-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PRIORITY_QUEUE_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRIORITY-QUEUE-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PRIORITY_QUEUE_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRIORITY-QUEUE-TEST-CASE-INSTANCE");

    static private final SubLString $$$queues = makeString("queues");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt148 = list(makeString("Priority Queue Subcategory"));

    static private final SubLString $str_alt151$Locked_Priority_Queue_Testing_Sui = makeString("Locked Priority Queue Testing Suite");

    private static final SubLSymbol LOCKED_PRIORITY_QUEUE_TEST_CASE = makeSymbol("LOCKED-PRIORITY-QUEUE-TEST-CASE");

    static private final SubLList $list_alt153 = list(list(makeSymbol("LP-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol LP_QUEUE = makeSymbol("LP-QUEUE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LOCKED_PRIORITY_QUEUE_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LOCKED-PRIORITY-QUEUE-TEST-CASE-CLASS");

    static private final SubLSymbol $sym156$SUBLOOP_RESERVED_INITIALIZE_LOCKED_PRIORITY_QUEUE_TEST_CASE_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LOCKED-PRIORITY-QUEUE-TEST-CASE-INSTANCE");

    static private final SubLList $list_alt157 = list(makeString("Locked Priority Queue Subcategory"));
}

/**
 * Total time: 508 ms
 */
