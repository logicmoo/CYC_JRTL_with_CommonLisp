package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.subcyclifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
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

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subcyclifier.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.subcyclifier.*; 
 public final class subcyclifier extends SubLTranslatedFile {
    public static final SubLFile me = new subcyclifier();

    public static final String myName = "com.cyc.cycjava.cycl.subcyclifier";

    public static final String myFingerPrint = "1a52cdac748c469de4d3d2df790c311e2fdac9b16423af009d40d9ad0051083f";

    // defconstant
    public static final SubLSymbol $dtp_cyclifier_pool$ = makeSymbol("*DTP-CYCLIFIER-POOL*");

    // Internal Constants
    public static final SubLSymbol SUBCYCLIFIER = makeSymbol("SUBCYCLIFIER");

    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLICABLE-P"), list(makeSymbol("OBJECT"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("OBJECT"))));



    public static final SubLList $list3 = list(makeSymbol("CLET"), list(list(makeSymbol("POOL"), list(makeSymbol("GET-SUBCYCLIFIER-POOL"), makeSymbol("SELF"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("POOL"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("CYCLIFIER-POOL-CYCLIFY"), makeSymbol("POOL"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), makeSymbol("CYCLS"), list(makeSymbol("RET"), makeSymbol("CYCLS")))));

    public static final SubLSymbol DATE_CYCLIFIER = makeSymbol("DATE-CYCLIFIER");



    public static final SubLList $list6 = list(makeSymbol("SUBCYCLIFIER"));

    public static final SubLList $list7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLICABLE-P"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE");

    public static final SubLSymbol APPLICABLE_P = makeSymbol("APPLICABLE-P");

    public static final SubLList $list14 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list15 = list(makeSymbol("TREE"));

    public static final SubLList $list16 = list(makeString("@param TREE parse-tree-interface-p; the tree to be checked for applicability of this cyclifier\n   @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("CYCLIFIABLE-NOUN-PHRASE-P"), makeSymbol("TREE")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER)))));



    public static final SubLSymbol DATE_CYCLIFIER_APPLICABLE_P_METHOD = makeSymbol("DATE-CYCLIFIER-APPLICABLE-P-METHOD");



    public static final SubLList $list20 = list(makeString("@param TREE parse-tree-interface-p; the tree that needs cyclification\n   @return listp; a list of cycl translations of TREE"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("APPLICABLE-P")), makeSymbol("TREE")), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-REFS"))))), list(makeSymbol("DATES0"), list(makeSymbol("FWHEN"), makeSymbol("REF"), list(makeSymbol("PARSE-DATE-FROM-STRING"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))))), list(makeSymbol("DATES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DATE"), makeSymbol("DATES0")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("equals")), makeSymbol("REF"), makeSymbol("DATE")), makeSymbol("DATES"))), list(makeSymbol("RET"), makeSymbol("DATES")))));





    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    public static final SubLSymbol DATE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol("DATE-CYCLIFIER-CYCLIFY-METHOD");

    public static final SubLSymbol CYCLIFIER_POOL = makeSymbol("CYCLIFIER-POOL");

    public static final SubLSymbol CYCLIFIER_POOL_P = makeSymbol("CYCLIFIER-POOL-P");

    public static final SubLList $list27 = list(makeSymbol("CYCLIFIERS"));

    public static final SubLList $list28 = list(makeKeyword("CYCLIFIERS"));

    public static final SubLList $list29 = list(makeSymbol("CYCLIFIER-POOL-CYCLIFIERS"));

    public static final SubLList $list30 = list(makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS"));

    public static final SubLSymbol CYCLIFIER_POOL_PRINT = makeSymbol("CYCLIFIER-POOL-PRINT");

    public static final SubLSymbol CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list33 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYCLIFIER-POOL-P"));

    private static final SubLSymbol CYCLIFIER_POOL_CYCLIFIERS = makeSymbol("CYCLIFIER-POOL-CYCLIFIERS");

    private static final SubLSymbol _CSETF_CYCLIFIER_POOL_CYCLIFIERS = makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS");



    private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CYCLIFIER_POOL = makeSymbol("MAKE-CYCLIFIER-POOL");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD");

    private static final SubLString $str43$__CYCLIFIER_POOL__ = makeString("#<CYCLIFIER-POOL: ");

    private static final SubLString $str44$_ = makeString(">");



    public static SubLObject subcyclifier_p(final SubLObject v_subcyclifier) {
        return interfaces.subloop_instanceof_interface(v_subcyclifier, SUBCYCLIFIER);
    }

    public static SubLObject with_subcyclifier_assistance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list3, append(body, NIL));
    }

    public static SubLObject subcyclifier_cyclify(final SubLObject tree) {
        final SubLObject pool = cyclifier.get_subcyclifier_pool(tree);
        if (NIL != pool) {
            return cyclifier_pool_cyclify(pool, tree);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_date_cyclifier_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_date_cyclifier_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject date_cyclifier_p(final SubLObject date_cyclifier) {
        return classes.subloop_instanceof_class(date_cyclifier, DATE_CYCLIFIER);
    }

    public static SubLObject date_cyclifier_applicable_p_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != cyclifier_interface.cyclifiable_noun_phrase_p(tree)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_SISTER, MINUS_ONE_INTEGER))) && (NIL != cyclifier_interface.prepositional_or_particle_word_p(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, MINUS_ONE_INTEGER))));
    }

    public static SubLObject date_cyclifier_cyclify_method(final SubLObject self, final SubLObject tree) {
        if (NIL != methods.funcall_instance_method_with_1_args(self, APPLICABLE_P, tree)) {
            final SubLObject ref = methods.funcall_instance_method_with_0_args(tree, GET_REFS).first();
            final SubLObject dates0 = (NIL != ref) ? date_utilities.parse_date_from_string(methods.funcall_instance_method_with_0_args(tree, GET_STRING)) : NIL;
            SubLObject dates2 = NIL;
            SubLObject cdolist_list_var = dates0;
            SubLObject date = NIL;
            date = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dates2 = cons(list($$equals, ref, date), dates2);
                cdolist_list_var = cdolist_list_var.rest();
                date = cdolist_list_var.first();
            } 
            return dates2;
        }
        return NIL;
    }

    public static SubLObject cyclifier_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cyclifier_pool_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cyclifier_pool_p(final SubLObject v_object) {
        return v_object.getClass() == $cyclifier_pool_native.class ? T : NIL;
    }

    public static SubLObject cyclifier_pool_cyclifiers(final SubLObject v_object) {
        assert NIL != cyclifier_pool_p(v_object) : "subcyclifier.cyclifier_pool_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_cyclifier_pool_cyclifiers(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclifier_pool_p(v_object) : "subcyclifier.cyclifier_pool_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_cyclifier_pool(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cyclifier_pool_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCLIFIERS)) {
                _csetf_cyclifier_pool_cyclifiers(v_new, current_value);
            } else {
                Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cyclifier_pool(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CYCLIFIER_POOL, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCLIFIERS, cyclifier_pool_cyclifiers(obj));
        funcall(visitor_fn, obj, $END, MAKE_CYCLIFIER_POOL, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cyclifier_pool_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyclifier_pool(obj, visitor_fn);
    }

    public static SubLObject cyclifier_pool_print(final SubLObject pool, final SubLObject stream, final SubLObject depth) {
        write_string($str43$__CYCLIFIER_POOL__, stream, UNPROVIDED, UNPROVIDED);
        princ(cyclifier_pool_cyclifiers(pool), stream);
        write_string($str44$_, stream, UNPROVIDED, UNPROVIDED);
        return pool;
    }

    public static SubLObject new_cyclifier_pool(final SubLObject cyclifiers) {
        assert NIL != listp(cyclifiers) : "Types.listp(cyclifiers) " + "CommonSymbols.NIL != Types.listp(cyclifiers) " + cyclifiers;
        final SubLObject pool = make_cyclifier_pool(UNPROVIDED);
        SubLObject cdolist_list_var = reverse(cyclifiers);
        SubLObject v_cyclifier = NIL;
        v_cyclifier = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cyclifier_pool_add(pool, v_cyclifier);
            cdolist_list_var = cdolist_list_var.rest();
            v_cyclifier = cdolist_list_var.first();
        } 
        return pool;
    }

    public static SubLObject cyclifier_pool_add(final SubLObject pool, final SubLObject v_cyclifier) {
        assert NIL != cyclifier_pool_p(pool) : "subcyclifier.cyclifier_pool_p(pool) " + "CommonSymbols.NIL != subcyclifier.cyclifier_pool_p(pool) " + pool;
        _csetf_cyclifier_pool_cyclifiers(pool, cons(v_cyclifier, cyclifier_pool_cyclifiers(pool)));
        return pool;
    }

    public static SubLObject cyclifier_pool_cyclify(final SubLObject pool, final SubLObject v_object) {
        assert NIL != cyclifier_pool_p(pool) : "subcyclifier.cyclifier_pool_p(pool) " + "CommonSymbols.NIL != subcyclifier.cyclifier_pool_p(pool) " + pool;
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = cyclifier_pool_cyclifiers(pool);
            SubLObject v_cyclifier = NIL;
            v_cyclifier = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (NIL != methods.funcall_instance_method_with_1_args(v_cyclifier, APPLICABLE_P, v_object)) {
                    result = methods.funcall_instance_method_with_1_args(v_cyclifier, CYCLIFY, v_object);
                }
                csome_list_var = csome_list_var.rest();
                v_cyclifier = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject declare_subcyclifier_file() {
        declareFunction(me, "subcyclifier_p", "SUBCYCLIFIER-P", 1, 0, false);
        declareMacro(me, "with_subcyclifier_assistance", "WITH-SUBCYCLIFIER-ASSISTANCE");
        declareFunction(me, "subcyclifier_cyclify", "SUBCYCLIFIER-CYCLIFY", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_date_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_date_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE", 1, 0, false);
        declareFunction(me, "date_cyclifier_p", "DATE-CYCLIFIER-P", 1, 0, false);
        declareFunction(me, "date_cyclifier_applicable_p_method", "DATE-CYCLIFIER-APPLICABLE-P-METHOD", 2, 0, false);
        declareFunction(me, "date_cyclifier_cyclify_method", "DATE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false);
        declareFunction(me, "cyclifier_pool_print_function_trampoline", "CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cyclifier_pool_p", "CYCLIFIER-POOL-P", 1, 0, false);
        new subcyclifier.$cyclifier_pool_p$UnaryFunction();
        declareFunction(me, "cyclifier_pool_cyclifiers", "CYCLIFIER-POOL-CYCLIFIERS", 1, 0, false);
        declareFunction(me, "_csetf_cyclifier_pool_cyclifiers", "_CSETF-CYCLIFIER-POOL-CYCLIFIERS", 2, 0, false);
        declareFunction(me, "make_cyclifier_pool", "MAKE-CYCLIFIER-POOL", 0, 1, false);
        declareFunction(me, "visit_defstruct_cyclifier_pool", "VISIT-DEFSTRUCT-CYCLIFIER-POOL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cyclifier_pool_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD", 2, 0, false);
        declareFunction(me, "cyclifier_pool_print", "CYCLIFIER-POOL-PRINT", 3, 0, false);
        declareFunction(me, "new_cyclifier_pool", "NEW-CYCLIFIER-POOL", 1, 0, false);
        declareFunction(me, "cyclifier_pool_add", "CYCLIFIER-POOL-ADD", 2, 0, false);
        declareFunction(me, "cyclifier_pool_cyclify", "CYCLIFIER-POOL-CYCLIFY", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_subcyclifier_file() {
        defconstant("*DTP-CYCLIFIER-POOL*", CYCLIFIER_POOL);
        return NIL;
    }

    public static SubLObject setup_subcyclifier_file() {
        interfaces.new_interface(SUBCYCLIFIER, NIL, NIL, $list1);
        classes.subloop_new_class(DATE_CYCLIFIER, OBJECT, $list6, NIL, $list7);
        classes.class_set_implements_slot_listeners(DATE_CYCLIFIER, NIL);
        classes.subloop_note_class_initialization_function(DATE_CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS);
        classes.subloop_note_instance_initialization_function(DATE_CYCLIFIER, SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE);
        subloop_reserved_initialize_date_cyclifier_class(DATE_CYCLIFIER);
        methods.methods_incorporate_instance_method(APPLICABLE_P, DATE_CYCLIFIER, $list14, $list15, $list16);
        methods.subloop_register_instance_method(DATE_CYCLIFIER, APPLICABLE_P, DATE_CYCLIFIER_APPLICABLE_P_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY, DATE_CYCLIFIER, $list14, $list15, $list20);
        methods.subloop_register_instance_method(DATE_CYCLIFIER, CYCLIFY, DATE_CYCLIFIER_CYCLIFY_METHOD);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cyclifier_pool$.getGlobalValue(), symbol_function(CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list33);
        def_csetf(CYCLIFIER_POOL_CYCLIFIERS, _CSETF_CYCLIFIER_POOL_CYCLIFIERS);
        identity(CYCLIFIER_POOL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyclifier_pool$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subcyclifier_file();
    }

    @Override
    public void initializeVariables() {
        init_subcyclifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subcyclifier_file();
    }

    static {
















































    }

    public static final class $cyclifier_pool_native extends SubLStructNative {
        public SubLObject $cyclifiers;

        private static final SubLStructDeclNative structDecl;

        private $cyclifier_pool_native() {
            this.$cyclifiers = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cyclifiers;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cyclifiers = value;
        }

        static {
            structDecl = makeStructDeclNative($cyclifier_pool_native.class, CYCLIFIER_POOL, CYCLIFIER_POOL_P, $list27, $list28, new String[]{ "$cyclifiers" }, $list29, $list30, CYCLIFIER_POOL_PRINT);
        }
    }

    public static final class $cyclifier_pool_p$UnaryFunction extends UnaryFunction {
        public $cyclifier_pool_p$UnaryFunction() {
            super(extractFunctionNamed("CYCLIFIER-POOL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyclifier_pool_p(arg1);
        }
    }
}

/**
 * Total time: 169 ms
 */
