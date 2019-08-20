/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBCYCLIFIER
 * source file: /cyc/top/cycl/subcyclifier.lisp
 * created:     2019/07/03 17:38:53
 */
public final class subcyclifier extends SubLTranslatedFile implements V12 {
    public static final class $cyclifier_pool_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native.this.$cyclifiers;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native.this.$cyclifiers = value;
        }

        public SubLObject $cyclifiers = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native.class, CYCLIFIER_POOL, CYCLIFIER_POOL_P, $list_alt27, $list_alt28, new String[]{ "$cyclifiers" }, $list_alt29, $list_alt30, CYCLIFIER_POOL_PRINT);
    }

    public static final SubLFile me = new subcyclifier();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cyclifier_pool$ = makeSymbol("*DTP-CYCLIFIER-POOL*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SUBCYCLIFIER = makeSymbol("SUBCYCLIFIER");

    static private final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLICABLE-P"), list(makeSymbol("OBJECT"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("OBJECT"))));

    static private final SubLList $list3 = list(makeSymbol("CLET"), list(list(makeSymbol("POOL"), list(makeSymbol("GET-SUBCYCLIFIER-POOL"), makeSymbol("SELF"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("POOL"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("CYCLIFIER-POOL-CYCLIFY"), makeSymbol("POOL"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), makeSymbol("CYCLS"), list(RET, makeSymbol("CYCLS")))));

    private static final SubLSymbol DATE_CYCLIFIER = makeSymbol("DATE-CYCLIFIER");

    static private final SubLList $list6 = list(makeSymbol("SUBCYCLIFIER"));

    static private final SubLList $list7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLICABLE-P"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE");

    private static final SubLSymbol APPLICABLE_P = makeSymbol("APPLICABLE-P");

    static private final SubLList $list14 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list15 = list(makeSymbol("TREE"));

    static private final SubLList $list16 = list(makeString("@param TREE parse-tree-interface-p; the tree to be checked for applicability of this cyclifier\n   @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise"), list(RET, list(makeSymbol("CAND"), list(makeSymbol("CYCLIFIABLE-NOUN-PHRASE-P"), makeSymbol("TREE")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER)))));

    private static final SubLSymbol DATE_CYCLIFIER_APPLICABLE_P_METHOD = makeSymbol("DATE-CYCLIFIER-APPLICABLE-P-METHOD");

    static private final SubLList $list20 = list(makeString("@param TREE parse-tree-interface-p; the tree that needs cyclification\n   @return listp; a list of cycl translations of TREE"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("APPLICABLE-P")), makeSymbol("TREE")), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("DATES0"), list(makeSymbol("FWHEN"), makeSymbol("REF"), list(makeSymbol("PARSE-DATE-FROM-STRING"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-STRING")))))), list(makeSymbol("DATES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DATE"), makeSymbol("DATES0")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), reader_make_constant_shell("equals"), makeSymbol("REF"), makeSymbol("DATE")), makeSymbol("DATES"))), list(RET, makeSymbol("DATES")))));



    private static final SubLSymbol DATE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol("DATE-CYCLIFIER-CYCLIFY-METHOD");

    private static final SubLSymbol CYCLIFIER_POOL = makeSymbol("CYCLIFIER-POOL");

    private static final SubLSymbol CYCLIFIER_POOL_P = makeSymbol("CYCLIFIER-POOL-P");

    static private final SubLList $list27 = list(makeSymbol("CYCLIFIERS"));

    static private final SubLList $list28 = list(makeKeyword("CYCLIFIERS"));

    static private final SubLList $list29 = list(makeSymbol("CYCLIFIER-POOL-CYCLIFIERS"));

    static private final SubLList $list30 = list(makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS"));

    private static final SubLSymbol CYCLIFIER_POOL_PRINT = makeSymbol("CYCLIFIER-POOL-PRINT");

    private static final SubLSymbol CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list33 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYCLIFIER-POOL-P"));

    private static final SubLSymbol CYCLIFIER_POOL_CYCLIFIERS = makeSymbol("CYCLIFIER-POOL-CYCLIFIERS");

    private static final SubLSymbol _CSETF_CYCLIFIER_POOL_CYCLIFIERS = makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS");

    private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CYCLIFIER_POOL = makeSymbol("MAKE-CYCLIFIER-POOL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD");

    private static final SubLString $str43$__CYCLIFIER_POOL__ = makeString("#<CYCLIFIER-POOL: ");

    private static final SubLString $str44$_ = makeString(">");

    // Definitions
    public static final SubLObject subcyclifier_p_alt(SubLObject v_subcyclifier) {
        return interfaces.subloop_instanceof_interface(v_subcyclifier, SUBCYCLIFIER);
    }

    // Definitions
    public static SubLObject subcyclifier_p(final SubLObject v_subcyclifier) {
        return interfaces.subloop_instanceof_interface(v_subcyclifier, SUBCYCLIFIER);
    }

    public static final SubLObject with_subcyclifier_assistance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PROGN, $list_alt3, append(body, NIL));
        }
    }

    public static SubLObject with_subcyclifier_assistance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list3, append(body, NIL));
    }

    public static final SubLObject subcyclifier_cyclify_alt(SubLObject tree) {
        {
            SubLObject pool = cyclifier.get_subcyclifier_pool(tree);
            if (NIL != pool) {
                return cyclifier_pool_cyclify(pool, tree);
            }
        }
        return NIL;
    }

    public static SubLObject subcyclifier_cyclify(final SubLObject tree) {
        final SubLObject pool = cyclifier.get_subcyclifier_pool(tree);
        if (NIL != pool) {
            return cyclifier_pool_cyclify(pool, tree);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_date_cyclifier_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_date_cyclifier_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_date_cyclifier_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_date_cyclifier_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static final SubLObject date_cyclifier_p_alt(SubLObject date_cyclifier) {
        return classes.subloop_instanceof_class(date_cyclifier, DATE_CYCLIFIER);
    }

    public static SubLObject date_cyclifier_p(final SubLObject date_cyclifier) {
        return classes.subloop_instanceof_class(date_cyclifier, DATE_CYCLIFIER);
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-interface-p; the tree to be checked for applicability of this cyclifier
     * @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-interface-p; the tree to be checked for applicability of this cyclifier\r\n@return booleanp; t if this cyclifier can cyclify TREE, nil otherwise")
    public static final SubLObject date_cyclifier_applicable_p_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean(((NIL != cyclifier_interface.cyclifiable_noun_phrase_p(tree)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_SISTER, MINUS_ONE_INTEGER))) && (NIL != cyclifier_interface.prepositional_or_particle_word_p(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, MINUS_ONE_INTEGER))));
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-interface-p; the tree to be checked for applicability of this cyclifier
     * @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-interface-p; the tree to be checked for applicability of this cyclifier\r\n@return booleanp; t if this cyclifier can cyclify TREE, nil otherwise")
    public static SubLObject date_cyclifier_applicable_p_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != cyclifier_interface.cyclifiable_noun_phrase_p(tree)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_SISTER, MINUS_ONE_INTEGER))) && (NIL != cyclifier_interface.prepositional_or_particle_word_p(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, MINUS_ONE_INTEGER))));
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-interface-p; the tree that needs cyclification
     * @return listp; a list of cycl translations of TREE
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-interface-p; the tree that needs cyclification\r\n@return listp; a list of cycl translations of TREE")
    public static final SubLObject date_cyclifier_cyclify_method_alt(SubLObject self, SubLObject tree) {
        if (NIL != methods.funcall_instance_method_with_1_args(self, APPLICABLE_P, tree)) {
            {
                SubLObject ref = methods.funcall_instance_method_with_0_args(tree, GET_REFS).first();
                SubLObject dates0 = (NIL != ref) ? ((SubLObject) (date_utilities.parse_date_from_string(methods.funcall_instance_method_with_0_args(tree, GET_STRING)))) : NIL;
                SubLObject dates = NIL;
                SubLObject cdolist_list_var = dates0;
                SubLObject date = NIL;
                for (date = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , date = cdolist_list_var.first()) {
                    dates = cons(list($$equals, ref, date), dates);
                }
                return dates;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TREE
     * 		parse-tree-interface-p; the tree that needs cyclification
     * @return listp; a list of cycl translations of TREE
     */
    @LispMethod(comment = "@param TREE\r\n\t\tparse-tree-interface-p; the tree that needs cyclification\r\n@return listp; a list of cycl translations of TREE")
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

    public static final SubLObject cyclifier_pool_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        cyclifier_pool_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cyclifier_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cyclifier_pool_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cyclifier_pool_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cyclifier_pool_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native.class ? T : NIL;
    }

    public static final SubLObject cyclifier_pool_cyclifiers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCLIFIER_POOL_P);
        return v_object.getField2();
    }

    public static SubLObject cyclifier_pool_cyclifiers(final SubLObject v_object) {
        assert NIL != cyclifier_pool_p(v_object) : "! subcyclifier.cyclifier_pool_p(v_object) " + "subcyclifier.cyclifier_pool_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_cyclifier_pool_cyclifiers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCLIFIER_POOL_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cyclifier_pool_cyclifiers(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclifier_pool_p(v_object) : "! subcyclifier.cyclifier_pool_p(v_object) " + "subcyclifier.cyclifier_pool_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_cyclifier_pool_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCLIFIERS)) {
                        _csetf_cyclifier_pool_cyclifiers(v_new, current_value);
                    } else {
                        Errors.error($str_alt36$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cyclifier_pool(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.subcyclifier.$cyclifier_pool_native();
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

    /**
     * prints POOL to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "prints POOL to STREAM, ignoring DEPTH")
    public static final SubLObject cyclifier_pool_print_alt(SubLObject pool, SubLObject stream, SubLObject depth) {
        write_string($str_alt37$__CYCLIFIER_POOL__, stream, UNPROVIDED, UNPROVIDED);
        princ(cyclifier_pool_cyclifiers(pool), stream);
        write_string($str_alt38$_, stream, UNPROVIDED, UNPROVIDED);
        return pool;
    }

    /**
     * prints POOL to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "prints POOL to STREAM, ignoring DEPTH")
    public static SubLObject cyclifier_pool_print(final SubLObject pool, final SubLObject stream, final SubLObject depth) {
        write_string($str43$__CYCLIFIER_POOL__, stream, UNPROVIDED, UNPROVIDED);
        princ(cyclifier_pool_cyclifiers(pool), stream);
        write_string($str44$_, stream, UNPROVIDED, UNPROVIDED);
        return pool;
    }

    /**
     *
     *
     * @param SUBCYCLIFIERS
     * 		list; the inital members of this pool
     * @return cyclifier; a new cyclifier pool with initial cyclifiers SUBCYCLIFIERS
     */
    @LispMethod(comment = "@param SUBCYCLIFIERS\r\n\t\tlist; the inital members of this pool\r\n@return cyclifier; a new cyclifier pool with initial cyclifiers SUBCYCLIFIERS")
    public static final SubLObject new_cyclifier_pool_alt(SubLObject cyclifiers) {
        SubLTrampolineFile.checkType(cyclifiers, LISTP);
        {
            SubLObject pool = make_cyclifier_pool(UNPROVIDED);
            SubLObject cdolist_list_var = reverse(cyclifiers);
            SubLObject v_cyclifier = NIL;
            for (v_cyclifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_cyclifier = cdolist_list_var.first()) {
                cyclifier_pool_add(pool, v_cyclifier);
            }
            return pool;
        }
    }

    /**
     *
     *
     * @param SUBCYCLIFIERS
     * 		list; the inital members of this pool
     * @return cyclifier; a new cyclifier pool with initial cyclifiers SUBCYCLIFIERS
     */
    @LispMethod(comment = "@param SUBCYCLIFIERS\r\n\t\tlist; the inital members of this pool\r\n@return cyclifier; a new cyclifier pool with initial cyclifiers SUBCYCLIFIERS")
    public static SubLObject new_cyclifier_pool(final SubLObject cyclifiers) {
        assert NIL != listp(cyclifiers) : "! listp(cyclifiers) " + ("Types.listp(cyclifiers) " + "CommonSymbols.NIL != Types.listp(cyclifiers) ") + cyclifiers;
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

    /**
     *
     *
     * @param POOL;
    cyclifier-pool
     * 		
     * @param SUBCYCLIFIER;
     * 		the cyclifier to be added to POOL
     * 		Adds SUBCYCLIFIER to POOL
     */
    @LispMethod(comment = "@param POOL;\ncyclifier-pool\r\n\t\t\r\n@param SUBCYCLIFIER;\r\n\t\tthe cyclifier to be added to POOL\r\n\t\tAdds SUBCYCLIFIER to POOL")
    public static final SubLObject cyclifier_pool_add_alt(SubLObject pool, SubLObject v_cyclifier) {
        SubLTrampolineFile.checkType(pool, CYCLIFIER_POOL_P);
        _csetf_cyclifier_pool_cyclifiers(pool, cons(v_cyclifier, cyclifier_pool_cyclifiers(pool)));
        return pool;
    }

    /**
     *
     *
     * @param POOL;
    cyclifier-pool
     * 		
     * @param SUBCYCLIFIER;
     * 		the cyclifier to be added to POOL
     * 		Adds SUBCYCLIFIER to POOL
     */
    @LispMethod(comment = "@param POOL;\ncyclifier-pool\r\n\t\t\r\n@param SUBCYCLIFIER;\r\n\t\tthe cyclifier to be added to POOL\r\n\t\tAdds SUBCYCLIFIER to POOL")
    public static SubLObject cyclifier_pool_add(final SubLObject pool, final SubLObject v_cyclifier) {
        assert NIL != cyclifier_pool_p(pool) : "! subcyclifier.cyclifier_pool_p(pool) " + ("subcyclifier.cyclifier_pool_p(pool) " + "CommonSymbols.NIL != subcyclifier.cyclifier_pool_p(pool) ") + pool;
        _csetf_cyclifier_pool_cyclifiers(pool, cons(v_cyclifier, cyclifier_pool_cyclifiers(pool)));
        return pool;
    }

    /**
     *
     *
     * @param OBJECT
     * 		list; a property list of key value pairs whose info can be cyclified
     */
    @LispMethod(comment = "@param OBJECT\r\n\t\tlist; a property list of key value pairs whose info can be cyclified")
    public static final SubLObject cyclifier_pool_cyclify_alt(SubLObject pool, SubLObject v_object) {
        SubLTrampolineFile.checkType(pool, CYCLIFIER_POOL_P);
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = cyclifier_pool_cyclifiers(pool);
                    SubLObject v_cyclifier = NIL;
                    for (v_cyclifier = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_cyclifier = csome_list_var.first()) {
                        if (NIL != methods.funcall_instance_method_with_1_args(v_cyclifier, APPLICABLE_P, v_object)) {
                            result = methods.funcall_instance_method_with_1_args(v_cyclifier, CYCLIFY, v_object);
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param OBJECT
     * 		list; a property list of key value pairs whose info can be cyclified
     */
    @LispMethod(comment = "@param OBJECT\r\n\t\tlist; a property list of key value pairs whose info can be cyclified")
    public static SubLObject cyclifier_pool_cyclify(final SubLObject pool, final SubLObject v_object) {
        assert NIL != cyclifier_pool_p(pool) : "! subcyclifier.cyclifier_pool_p(pool) " + ("subcyclifier.cyclifier_pool_p(pool) " + "CommonSymbols.NIL != subcyclifier.cyclifier_pool_p(pool) ") + pool;
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

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLICABLE-P"), list(makeSymbol("OBJECT"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("OBJECT"))));

    static private final SubLList $list_alt3 = list(makeSymbol("CLET"), list(list(makeSymbol("POOL"), list(makeSymbol("GET-SUBCYCLIFIER-POOL"), makeSymbol("SELF"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("POOL"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("CYCLIFIER-POOL-CYCLIFY"), makeSymbol("POOL"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), makeSymbol("CYCLS"), list(RET, makeSymbol("CYCLS")))));

    public static SubLObject declare_subcyclifier_file() {
        declareFunction("subcyclifier_p", "SUBCYCLIFIER-P", 1, 0, false);
        declareMacro("with_subcyclifier_assistance", "WITH-SUBCYCLIFIER-ASSISTANCE");
        declareFunction("subcyclifier_cyclify", "SUBCYCLIFIER-CYCLIFY", 1, 0, false);
        declareFunction("subloop_reserved_initialize_date_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_date_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE", 1, 0, false);
        declareFunction("date_cyclifier_p", "DATE-CYCLIFIER-P", 1, 0, false);
        declareFunction("date_cyclifier_applicable_p_method", "DATE-CYCLIFIER-APPLICABLE-P-METHOD", 2, 0, false);
        declareFunction("date_cyclifier_cyclify_method", "DATE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false);
        declareFunction("cyclifier_pool_print_function_trampoline", "CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyclifier_pool_p", "CYCLIFIER-POOL-P", 1, 0, false);
        new subcyclifier.$cyclifier_pool_p$UnaryFunction();
        declareFunction("cyclifier_pool_cyclifiers", "CYCLIFIER-POOL-CYCLIFIERS", 1, 0, false);
        declareFunction("_csetf_cyclifier_pool_cyclifiers", "_CSETF-CYCLIFIER-POOL-CYCLIFIERS", 2, 0, false);
        declareFunction("make_cyclifier_pool", "MAKE-CYCLIFIER-POOL", 0, 1, false);
        declareFunction("visit_defstruct_cyclifier_pool", "VISIT-DEFSTRUCT-CYCLIFIER-POOL", 2, 0, false);
        declareFunction("visit_defstruct_object_cyclifier_pool_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD", 2, 0, false);
        declareFunction("cyclifier_pool_print", "CYCLIFIER-POOL-PRINT", 3, 0, false);
        declareFunction("new_cyclifier_pool", "NEW-CYCLIFIER-POOL", 1, 0, false);
        declareFunction("cyclifier_pool_add", "CYCLIFIER-POOL-ADD", 2, 0, false);
        declareFunction("cyclifier_pool_cyclify", "CYCLIFIER-POOL-CYCLIFY", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt6 = list(makeSymbol("SUBCYCLIFIER"));

    static private final SubLList $list_alt7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLICABLE-P"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt14 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt15 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt16 = list(makeString("@param TREE parse-tree-interface-p; the tree to be checked for applicability of this cyclifier\n   @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise"), list(RET, list(makeSymbol("CAND"), list(makeSymbol("CYCLIFIABLE-NOUN-PHRASE-P"), makeSymbol("TREE")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER)))));

    static private final SubLList $list_alt20 = list(makeString("@param TREE parse-tree-interface-p; the tree that needs cyclification\n   @return listp; a list of cycl translations of TREE"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("APPLICABLE-P")), makeSymbol("TREE")), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-REFS"))))), list(makeSymbol("DATES0"), list(makeSymbol("FWHEN"), makeSymbol("REF"), list(makeSymbol("PARSE-DATE-FROM-STRING"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-STRING")))))), list(makeSymbol("DATES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DATE"), makeSymbol("DATES0")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), reader_make_constant_shell("equals"), makeSymbol("REF"), makeSymbol("DATE")), makeSymbol("DATES"))), list(RET, makeSymbol("DATES")))));

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

    static private final SubLList $list_alt27 = list(makeSymbol("CYCLIFIERS"));

    static private final SubLList $list_alt28 = list(makeKeyword("CYCLIFIERS"));

    static private final SubLList $list_alt29 = list(makeSymbol("CYCLIFIER-POOL-CYCLIFIERS"));

    static private final SubLList $list_alt30 = list(makeSymbol("_CSETF-CYCLIFIER-POOL-CYCLIFIERS"));

    @Override
    public void declareFunctions() {
        declare_subcyclifier_file();
    }

    @Override
    public void initializeVariables() {
        init_subcyclifier_file();
    }

    static private final SubLString $str_alt36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void runTopLevelForms() {
        setup_subcyclifier_file();
    }

    static {
    }

    static private final SubLString $str_alt37$__CYCLIFIER_POOL__ = makeString("#<CYCLIFIER-POOL: ");

    static private final SubLString $str_alt38$_ = makeString(">");

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
