/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.user_interaction_agenda.ui_agenda;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_domain_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_generation_interaction_mt;
import static com.cyc.cycjava.cycl.user_interaction_agenda.uia_parsing_interaction_mt;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
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
 * module:      RKF-PREDICATE-CREATOR
 * source file: /cyc/top/cycl/rkf-predicate-creator.lisp
 * created:     2019/07/03 17:38:00
 */
public final class rkf_predicate_creator extends SubLTranslatedFile implements V12 {
    public static final class $pc_session_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$interaction;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$mode;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$arity;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$full_examples;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$arg_examples;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$constraints_via_examples;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$generalized_constraints;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$template;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$predicate;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$interaction = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$mode = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$arity = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$full_examples = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$arg_examples = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$constraints_via_examples = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$generalized_constraints = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$template = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.this.$predicate = value;
        }

        public SubLObject $interaction = Lisp.NIL;

        public SubLObject $mode = Lisp.NIL;

        public SubLObject $arity = Lisp.NIL;

        public SubLObject $full_examples = Lisp.NIL;

        public SubLObject $arg_examples = Lisp.NIL;

        public SubLObject $constraints_via_examples = Lisp.NIL;

        public SubLObject $generalized_constraints = Lisp.NIL;

        public SubLObject $template = Lisp.NIL;

        public SubLObject $predicate = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.class, PC_SESSION, PC_SESSION_P, $list_alt9, $list_alt10, new String[]{ "$interaction", "$mode", "$arity", "$full_examples", "$arg_examples", "$constraints_via_examples", "$generalized_constraints", "$template", "$predicate" }, $list_alt11, $list_alt12, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new rkf_predicate_creator();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pc_session_modes$ = makeSymbol("*PC-SESSION-MODES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pc_session_constraint_predicates$ = makeSymbol("*PC-SESSION-CONSTRAINT-PREDICATES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_pc_session$ = makeSymbol("*DTP-PC-SESSION*");

    // defparameter
    // Assume that argGenls are indication of an intended type-level predicate
    /**
     * Assume that argGenls are indication of an intended type-level predicate
     */
    @LispMethod(comment = "Assume that argGenls are indication of an intended type-level predicate\ndefparameter")
    private static final SubLSymbol $pc_downgrade_typelevelpreds_isas$ = makeSymbol("*PC-DOWNGRADE-TYPELEVELPREDS-ISAS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $predicate_type_for_arity_query$ = makeSymbol("*PREDICATE-TYPE-FOR-ARITY-QUERY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $pc_lock$ = makeSymbol("*PC-LOCK*");

    static private final SubLString $$$Predicate_Creator_lock = makeString("Predicate Creator lock");

    static private final SubLList $list3 = list(makeSymbol("*PC-LOCK*"));

    static private final SubLList $list4 = list(makeKeyword("NEW"), makeKeyword("ARITY"), makeKeyword("EXAMPLES"), makeKeyword("CONSTRAINTS"), makeKeyword("TEMPLATE"), makeKeyword("READY"), $DONE);

    static private final SubLList $list5 = list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"));

    static private final SubLList $list6 = list(makeSymbol("ARG"), makeSymbol("PRED"), makeSymbol("VALUE"));

    private static final SubLSymbol PC_SESSION = makeSymbol("PC-SESSION");

    private static final SubLSymbol PC_SESSION_P = makeSymbol("PC-SESSION-P");

    static private final SubLList $list9 = list(new SubLObject[]{ makeSymbol("INTERACTION"), makeSymbol("MODE"), makeSymbol("ARITY"), makeSymbol("FULL-EXAMPLES"), makeSymbol("ARG-EXAMPLES"), makeSymbol("CONSTRAINTS-VIA-EXAMPLES"), makeSymbol("GENERALIZED-CONSTRAINTS"), makeSymbol("TEMPLATE"), makeSymbol("PREDICATE") });

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("INTERACTION"), $MODE, makeKeyword("ARITY"), makeKeyword("FULL-EXAMPLES"), makeKeyword("ARG-EXAMPLES"), makeKeyword("CONSTRAINTS-VIA-EXAMPLES"), makeKeyword("GENERALIZED-CONSTRAINTS"), makeKeyword("TEMPLATE"), makeKeyword("PREDICATE") });

    static private final SubLList $list11 = list(new SubLObject[]{ makeSymbol("PC-SESSION-INTERACTION"), makeSymbol("PC-SESSION-MODE"), makeSymbol("PC-SESSION-ARITY"), makeSymbol("PC-SESSION-FULL-EXAMPLES"), makeSymbol("PC-SESSION-ARG-EXAMPLES"), makeSymbol("PC-SESSION-CONSTRAINTS-VIA-EXAMPLES"), makeSymbol("PC-SESSION-GENERALIZED-CONSTRAINTS"), makeSymbol("PC-SESSION-TEMPLATE"), makeSymbol("PC-SESSION-PREDICATE") });

    static private final SubLList $list12 = list(new SubLObject[]{ makeSymbol("_CSETF-PC-SESSION-INTERACTION"), makeSymbol("_CSETF-PC-SESSION-MODE"), makeSymbol("_CSETF-PC-SESSION-ARITY"), makeSymbol("_CSETF-PC-SESSION-FULL-EXAMPLES"), makeSymbol("_CSETF-PC-SESSION-ARG-EXAMPLES"), makeSymbol("_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES"), makeSymbol("_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS"), makeSymbol("_CSETF-PC-SESSION-TEMPLATE"), makeSymbol("_CSETF-PC-SESSION-PREDICATE") });

    private static final SubLSymbol PC_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PC-SESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list15 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PC-SESSION-P"));

    private static final SubLSymbol PC_SESSION_INTERACTION = makeSymbol("PC-SESSION-INTERACTION");

    private static final SubLSymbol _CSETF_PC_SESSION_INTERACTION = makeSymbol("_CSETF-PC-SESSION-INTERACTION");

    private static final SubLSymbol PC_SESSION_MODE = makeSymbol("PC-SESSION-MODE");

    private static final SubLSymbol _CSETF_PC_SESSION_MODE = makeSymbol("_CSETF-PC-SESSION-MODE");

    private static final SubLSymbol PC_SESSION_ARITY = makeSymbol("PC-SESSION-ARITY");

    private static final SubLSymbol _CSETF_PC_SESSION_ARITY = makeSymbol("_CSETF-PC-SESSION-ARITY");

    private static final SubLSymbol PC_SESSION_FULL_EXAMPLES = makeSymbol("PC-SESSION-FULL-EXAMPLES");

    private static final SubLSymbol _CSETF_PC_SESSION_FULL_EXAMPLES = makeSymbol("_CSETF-PC-SESSION-FULL-EXAMPLES");

    private static final SubLSymbol PC_SESSION_ARG_EXAMPLES = makeSymbol("PC-SESSION-ARG-EXAMPLES");

    private static final SubLSymbol _CSETF_PC_SESSION_ARG_EXAMPLES = makeSymbol("_CSETF-PC-SESSION-ARG-EXAMPLES");

    private static final SubLSymbol PC_SESSION_CONSTRAINTS_VIA_EXAMPLES = makeSymbol("PC-SESSION-CONSTRAINTS-VIA-EXAMPLES");

    private static final SubLSymbol _CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES = makeSymbol("_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES");

    private static final SubLSymbol PC_SESSION_GENERALIZED_CONSTRAINTS = makeSymbol("PC-SESSION-GENERALIZED-CONSTRAINTS");

    private static final SubLSymbol _CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS = makeSymbol("_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS");

    private static final SubLSymbol PC_SESSION_TEMPLATE = makeSymbol("PC-SESSION-TEMPLATE");

    private static final SubLSymbol _CSETF_PC_SESSION_TEMPLATE = makeSymbol("_CSETF-PC-SESSION-TEMPLATE");

    private static final SubLSymbol PC_SESSION_PREDICATE = makeSymbol("PC-SESSION-PREDICATE");

    private static final SubLSymbol _CSETF_PC_SESSION_PREDICATE = makeSymbol("_CSETF-PC-SESSION-PREDICATE");

    private static final SubLSymbol $CONSTRAINTS_VIA_EXAMPLES = makeKeyword("CONSTRAINTS-VIA-EXAMPLES");

    private static final SubLString $str43$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PC_SESSION = makeSymbol("MAKE-PC-SESSION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PC-SESSION-METHOD");

    private static final SubLSymbol PC_SESSION_MODE_P = makeSymbol("PC-SESSION-MODE-P");

    private static final SubLSymbol PC_SESSION_FULL_EXAMPLE_P = makeSymbol("PC-SESSION-FULL-EXAMPLE-P");

    private static final SubLSymbol PC_SESSION_EXAMPLE_P = makeSymbol("PC-SESSION-EXAMPLE-P");

    private static final SubLSymbol PC_SESSION_CONSTRAINT_LIST_P = makeSymbol("PC-SESSION-CONSTRAINT-LIST-P");

    private static final SubLSymbol PC_SESSION_CONSTRAINT_P = makeSymbol("PC-SESSION-CONSTRAINT-P");

    private static final SubLSymbol PC_SESSION_TEMPLATE_P = makeSymbol("PC-SESSION-TEMPLATE-P");

    private static final SubLList $list60 = list(makeKeyword("ARITY"));

    private static final SubLList $list61 = list(makeKeyword("ARITY"), makeKeyword("EXAMPLES"));

    private static final SubLList $list62 = list(makeKeyword("ARITY"), makeKeyword("EXAMPLES"), makeKeyword("CONSTRAINTS"));

    private static final SubLList $list63 = list(makeSymbol("EXAMPLE-ARG"), makeSymbol("EXAMPLE-VALUE"));







    private static final SubLList $list71 = list(makeSymbol("ARG"), makeSymbol("CONSTRAINT-PRED"), makeSymbol("VALUE"));

    private static final SubLString $$$Predicate = makeString("Predicate");

    private static final SubLSymbol $sym73$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol $sym76$_ = makeSymbol("<");



    private static final SubLList $list78 = list(reader_make_constant_shell("thereExists"), makeSymbol("?GENL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeKeyword("COL"), reader_make_constant_shell("RelationshipTypeByArity")), list(reader_make_constant_shell("isa"), makeSymbol("?GENL"), reader_make_constant_shell("RelationshipTypeByArity")), list(reader_make_constant_shell("genls"), makeKeyword("COL"), reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("genls"), makeKeyword("COL"), makeSymbol("?GENL")), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("arity"), makeSymbol("?GENL"), makeKeyword("ARITY")))));

    private static final SubLSymbol CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT = makeSymbol("CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT");



    private static final SubLSymbol $cached_predicate_type_for_arity_any_mt_caching_state$ = makeSymbol("*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*");



    private static final SubLObject $$assertTemplate_Reln = reader_make_constant_shell("assertTemplate-Reln");





    private static final SubLSymbol GENERIC_KEYWORD_ARG = makeSymbol("GENERIC-KEYWORD-ARG");

    private static final SubLString $str88$ARG_A = makeString("ARG~A");

    private static final SubLSymbol $generic_keyword_arg_caching_state$ = makeSymbol("*GENERIC-KEYWORD-ARG-CACHING-STATE*");

    public static final SubLObject with_pc_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt3, append(body, NIL));
        }
    }

    public static SubLObject with_pc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list3, append(body, NIL));
    }

    public static final SubLObject pc_session_mode_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $pc_session_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pc_session_mode_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $pc_session_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject pc_session_contraint_predicate_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $pc_session_constraint_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pc_session_contraint_predicate_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find(v_object, $pc_session_constraint_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject pc_session_full_example_p_alt(SubLObject v_object) {
        if (v_object.isCons() && (NIL != list_utilities.proper_list_p(v_object))) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (NIL == pc_session_example_p(item)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pc_session_full_example_p(final SubLObject v_object) {
        if (v_object.isCons() && (NIL != list_utilities.proper_list_p(v_object))) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == pc_session_example_p(item)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject pc_session_example_p_alt(SubLObject v_object) {
        return term.first_order_termP(v_object);
    }

    public static SubLObject pc_session_example_p(final SubLObject v_object) {
        return term.first_order_termP(v_object);
    }

    public static final SubLObject pc_session_template_p_alt(SubLObject v_object) {
        if ((NIL == v_object) || (NIL != list_utilities.proper_list_p(v_object))) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (!(item.isString() || item.isKeyword())) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pc_session_template_p(final SubLObject v_object) {
        if ((NIL == v_object) || (NIL != list_utilities.proper_list_p(v_object))) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((!item.isString()) && (!item.isKeyword())) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject pc_session_constraint_list_p_alt(SubLObject constraints) {
        if ((NIL == constraints) || (NIL != list_utilities.proper_list_p(constraints))) {
            {
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint = NIL;
                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                    if (NIL == pc_session_constraint_p(constraint)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pc_session_constraint_list_p(final SubLObject constraints) {
        if ((NIL == constraints) || (NIL != list_utilities.proper_list_p(constraints))) {
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == pc_session_constraint_p(constraint)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject pc_session_constraint_p_alt(SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) {
            {
                SubLObject datum = v_object;
                SubLObject current = datum;
                SubLObject arg = NIL;
                SubLObject pred = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt6);
                arg = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt6);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt6);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean(((NIL != subl_promotions.positive_integer_p(arg)) && (NIL != pc_session_contraint_predicate_p(pred))) && (NIL != term.first_order_termP(value)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt6);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pc_session_constraint_p(final SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) {
            SubLObject arg = NIL;
            SubLObject pred = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list6);
            arg = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list6);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list6);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(((NIL != subl_promotions.positive_integer_p(arg)) && (NIL != pc_session_contraint_predicate_p(pred))) && (NIL != term.first_order_termP(value)));
            }
            cdestructuring_bind_error(v_object, $list6);
        }
        return NIL;
    }

    public static final SubLObject pc_session_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pc_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject pc_session_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject pc_session_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native.class ? T : NIL;
    }

    public static final SubLObject pc_session_interaction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField2();
    }

    public static SubLObject pc_session_interaction(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pc_session_mode_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField3();
    }

    public static SubLObject pc_session_mode(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject pc_session_arity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField4();
    }

    public static SubLObject pc_session_arity(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject pc_session_full_examples_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField5();
    }

    public static SubLObject pc_session_full_examples(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject pc_session_arg_examples_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField6();
    }

    public static SubLObject pc_session_arg_examples(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject pc_session_constraints_via_examples_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField7();
    }

    public static SubLObject pc_session_constraints_via_examples(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject pc_session_generalized_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField8();
    }

    public static SubLObject pc_session_generalized_constraints(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject pc_session_template_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField9();
    }

    public static SubLObject pc_session_template(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject pc_session_predicate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.getField10();
    }

    public static SubLObject pc_session_predicate(final SubLObject v_object) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_pc_session_interaction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pc_session_interaction(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pc_session_mode_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pc_session_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pc_session_arity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pc_session_arity(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pc_session_full_examples_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pc_session_full_examples(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pc_session_arg_examples_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pc_session_arg_examples(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_pc_session_constraints_via_examples_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_pc_session_constraints_via_examples(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_pc_session_generalized_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_pc_session_generalized_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_pc_session_template_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_pc_session_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_pc_session_predicate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PC_SESSION_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_pc_session_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != pc_session_p(v_object) : "! rkf_predicate_creator.pc_session_p(v_object) " + "rkf_predicate_creator.pc_session_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_pc_session_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INTERACTION)) {
                        _csetf_pc_session_interaction(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MODE)) {
                            _csetf_pc_session_mode(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ARITY)) {
                                _csetf_pc_session_arity(v_new, current_value);
                            } else {
                                if (pcase_var.eql($FULL_EXAMPLES)) {
                                    _csetf_pc_session_full_examples(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ARG_EXAMPLES)) {
                                        _csetf_pc_session_arg_examples(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($CONSTRAINTS_VIA_EXAMPLES)) {
                                            _csetf_pc_session_constraints_via_examples(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($GENERALIZED_CONSTRAINTS)) {
                                                _csetf_pc_session_generalized_constraints(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($TEMPLATE)) {
                                                    _csetf_pc_session_template(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($PREDICATE)) {
                                                        _csetf_pc_session_predicate(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt42$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_pc_session(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_predicate_creator.$pc_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERACTION)) {
                _csetf_pc_session_interaction(v_new, current_value);
            } else
                if (pcase_var.eql($MODE)) {
                    _csetf_pc_session_mode(v_new, current_value);
                } else
                    if (pcase_var.eql($ARITY)) {
                        _csetf_pc_session_arity(v_new, current_value);
                    } else
                        if (pcase_var.eql($FULL_EXAMPLES)) {
                            _csetf_pc_session_full_examples(v_new, current_value);
                        } else
                            if (pcase_var.eql($ARG_EXAMPLES)) {
                                _csetf_pc_session_arg_examples(v_new, current_value);
                            } else
                                if (pcase_var.eql($CONSTRAINTS_VIA_EXAMPLES)) {
                                    _csetf_pc_session_constraints_via_examples(v_new, current_value);
                                } else
                                    if (pcase_var.eql($GENERALIZED_CONSTRAINTS)) {
                                        _csetf_pc_session_generalized_constraints(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TEMPLATE)) {
                                            _csetf_pc_session_template(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PREDICATE)) {
                                                _csetf_pc_session_predicate(v_new, current_value);
                                            } else {
                                                Errors.error($str43$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pc_session(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PC_SESSION, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERACTION, pc_session_interaction(obj));
        funcall(visitor_fn, obj, $SLOT, $MODE, pc_session_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $ARITY, pc_session_arity(obj));
        funcall(visitor_fn, obj, $SLOT, $FULL_EXAMPLES, pc_session_full_examples(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_EXAMPLES, pc_session_arg_examples(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS_VIA_EXAMPLES, pc_session_constraints_via_examples(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERALIZED_CONSTRAINTS, pc_session_generalized_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE, pc_session_template(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, pc_session_predicate(obj));
        funcall(visitor_fn, obj, $END, MAKE_PC_SESSION, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pc_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pc_session(obj, visitor_fn);
    }

    public static final SubLObject new_pc_session_alt(SubLObject interaction) {
        SubLTrampolineFile.checkType(interaction, USER_INTERACTION_P);
        {
            SubLObject session = make_pc_session(UNPROVIDED);
            _csetf_pc_session_interaction(session, interaction);
            pc_session_note_mode(session, $NEW);
            return session;
        }
    }

    public static SubLObject new_pc_session(final SubLObject interaction) {
        assert NIL != user_interaction_agenda.user_interaction_p(interaction) : "! user_interaction_agenda.user_interaction_p(interaction) " + ("user_interaction_agenda.user_interaction_p(interaction) " + "CommonSymbols.NIL != user_interaction_agenda.user_interaction_p(interaction) ") + interaction;
        final SubLObject session = make_pc_session(UNPROVIDED);
        _csetf_pc_session_interaction(session, interaction);
        pc_session_note_mode(session, $NEW);
        return session;
    }

    public static final SubLObject pc_session_note_mode_alt(SubLObject session, SubLObject mode) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(mode, PC_SESSION_MODE_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_mode(session, mode);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_note_mode(final SubLObject session, final SubLObject mode) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != pc_session_mode_p(mode) : "! rkf_predicate_creator.pc_session_mode_p(mode) " + ("rkf_predicate_creator.pc_session_mode_p(mode) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_mode_p(mode) ") + mode;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_mode(session, mode);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_note_arity_alt(SubLObject session, SubLObject v_arity) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(v_arity, POSITIVE_INTEGER_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_arity(session, v_arity);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_note_arity(final SubLObject session, final SubLObject v_arity) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != subl_promotions.positive_integer_p(v_arity) : "! subl_promotions.positive_integer_p(v_arity) " + ("subl_promotions.positive_integer_p(v_arity) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(v_arity) ") + v_arity;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_arity(session, v_arity);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_clear_full_examples_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_full_examples(session, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_clear_full_examples(final SubLObject session) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_full_examples(session, NIL);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_add_full_example_alt(SubLObject session, SubLObject full_example) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(full_example, PC_SESSION_FULL_EXAMPLE_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = full_example;
                    if (NIL == member(item_var, pc_session_full_examples(session), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        _csetf_pc_session_full_examples(session, cons(item_var, pc_session_full_examples(session)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_add_full_example(final SubLObject session, final SubLObject full_example) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != pc_session_full_example_p(full_example) : "! rkf_predicate_creator.pc_session_full_example_p(full_example) " + ("rkf_predicate_creator.pc_session_full_example_p(full_example) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_full_example_p(full_example) ") + full_example;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            if (NIL == member(full_example, pc_session_full_examples(session), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                _csetf_pc_session_full_examples(session, cons(full_example, pc_session_full_examples(session)));
            }
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_rem_full_example_alt(SubLObject session, SubLObject full_example) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(full_example, PC_SESSION_FULL_EXAMPLE_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_full_examples(session, delete(full_example, pc_session_full_examples(session), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_rem_full_example(final SubLObject session, final SubLObject full_example) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != pc_session_full_example_p(full_example) : "! rkf_predicate_creator.pc_session_full_example_p(full_example) " + ("rkf_predicate_creator.pc_session_full_example_p(full_example) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_full_example_p(full_example) ") + full_example;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_full_examples(session, delete(full_example, pc_session_full_examples(session), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_clear_arg_examples_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_arg_examples(session, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_clear_arg_examples(final SubLObject session) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_arg_examples(session, NIL);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_add_arg_example_alt(SubLObject session, SubLObject arg, SubLObject example) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(arg, POSITIVE_INTEGER_P);
        SubLTrampolineFile.checkType(example, PC_SESSION_EXAMPLE_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = list(arg, example);
                    if (NIL == member(item_var, pc_session_arg_examples(session), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        _csetf_pc_session_arg_examples(session, cons(item_var, pc_session_arg_examples(session)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_add_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != subl_promotions.positive_integer_p(arg) : "! subl_promotions.positive_integer_p(arg) " + ("subl_promotions.positive_integer_p(arg) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(arg) ") + arg;
        assert NIL != pc_session_example_p(example) : "! rkf_predicate_creator.pc_session_example_p(example) " + ("rkf_predicate_creator.pc_session_example_p(example) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_example_p(example) ") + example;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            final SubLObject item_var = list(arg, example);
            if (NIL == member(item_var, pc_session_arg_examples(session), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                _csetf_pc_session_arg_examples(session, cons(item_var, pc_session_arg_examples(session)));
            }
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_rem_arg_example_alt(SubLObject session, SubLObject arg, SubLObject example) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(arg, POSITIVE_INTEGER_P);
        SubLTrampolineFile.checkType(example, PC_SESSION_EXAMPLE_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_arg_examples(session, delete(list(arg, example), pc_session_arg_examples(session), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_rem_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != subl_promotions.positive_integer_p(arg) : "! subl_promotions.positive_integer_p(arg) " + ("subl_promotions.positive_integer_p(arg) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(arg) ") + arg;
        assert NIL != pc_session_example_p(example) : "! rkf_predicate_creator.pc_session_example_p(example) " + ("rkf_predicate_creator.pc_session_example_p(example) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_example_p(example) ") + example;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_arg_examples(session, delete(list(arg, example), pc_session_arg_examples(session), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_note_constraints_via_examples_alt(SubLObject session, SubLObject constraints) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(constraints, PC_SESSION_CONSTRAINT_LIST_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_constraints_via_examples(session, constraints);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_note_constraints_via_examples(final SubLObject session, final SubLObject constraints) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != pc_session_constraint_list_p(constraints) : "! rkf_predicate_creator.pc_session_constraint_list_p(constraints) " + ("rkf_predicate_creator.pc_session_constraint_list_p(constraints) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_constraint_list_p(constraints) ") + constraints;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_constraints_via_examples(session, constraints);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_clear_generalized_constraints_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_generalized_constraints(session, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_clear_generalized_constraints(final SubLObject session) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_generalized_constraints(session, NIL);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_clear_generalized_constraints_for_arg_alt(SubLObject session, SubLObject arg) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(arg, POSITIVE_INTEGER_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_generalized_constraints(session, delete(arg, pc_session_generalized_constraints(session), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_clear_generalized_constraints_for_arg(final SubLObject session, final SubLObject arg) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != subl_promotions.positive_integer_p(arg) : "! subl_promotions.positive_integer_p(arg) " + ("subl_promotions.positive_integer_p(arg) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(arg) ") + arg;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_generalized_constraints(session, delete(arg, pc_session_generalized_constraints(session), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_add_generalized_constraint_alt(SubLObject session, SubLObject constraint) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(constraint, PC_SESSION_CONSTRAINT_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = constraint;
                    if (NIL == member(item_var, pc_session_generalized_constraints(session), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        _csetf_pc_session_generalized_constraints(session, cons(item_var, pc_session_generalized_constraints(session)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_add_generalized_constraint(final SubLObject session, final SubLObject constraint) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != pc_session_constraint_p(constraint) : "! rkf_predicate_creator.pc_session_constraint_p(constraint) " + ("rkf_predicate_creator.pc_session_constraint_p(constraint) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_constraint_p(constraint) ") + constraint;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            if (NIL == member(constraint, pc_session_generalized_constraints(session), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                _csetf_pc_session_generalized_constraints(session, cons(constraint, pc_session_generalized_constraints(session)));
            }
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_clear_template_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_template(session, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_clear_template(final SubLObject session) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_template(session, NIL);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_note_template_alt(SubLObject session, SubLObject template) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(template, PC_SESSION_TEMPLATE_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_template(session, template);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_note_template(final SubLObject session, final SubLObject template) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != pc_session_template_p(template) : "! rkf_predicate_creator.pc_session_template_p(template) " + ("rkf_predicate_creator.pc_session_template_p(template) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_template_p(template) ") + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_template(session, template);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_note_predicate_alt(SubLObject session, SubLObject predicate) {
        SubLTrampolineFile.checkType(session, PC_SESSION_P);
        SubLTrampolineFile.checkType(predicate, FORT_P);
        {
            SubLObject lock = $pc_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_pc_session_predicate(session, predicate);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_note_predicate(final SubLObject session, final SubLObject predicate) {
        assert NIL != pc_session_p(session) : "! rkf_predicate_creator.pc_session_p(session) " + ("rkf_predicate_creator.pc_session_p(session) " + "CommonSymbols.NIL != rkf_predicate_creator.pc_session_p(session) ") + session;
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        SubLObject release = NIL;
        try {
            release = seize_lock($pc_lock$.getGlobalValue());
            _csetf_pc_session_predicate(session, predicate);
        } finally {
            if (NIL != release) {
                release_lock($pc_lock$.getGlobalValue());
            }
        }
        return session;
    }

    public static final SubLObject pc_session_full_example_formulas_alt(SubLObject session) {
        {
            SubLObject predicate = pc_session_predicate(session);
            SubLObject full_examples = pc_session_full_examples(session);
            SubLObject formulas = NIL;
            SubLObject cdolist_list_var = full_examples;
            SubLObject full_example = NIL;
            for (full_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , full_example = cdolist_list_var.first()) {
                {
                    SubLObject formula = bq_cons(predicate, append(full_example, NIL));
                    formulas = cons(formula, formulas);
                }
            }
            return formulas;
        }
    }

    public static SubLObject pc_session_full_example_formulas(final SubLObject session) {
        final SubLObject predicate = pc_session_predicate(session);
        final SubLObject full_examples = pc_session_full_examples(session);
        SubLObject formulas = NIL;
        SubLObject cdolist_list_var = full_examples;
        SubLObject full_example = NIL;
        full_example = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject formula = bq_cons(predicate, append(full_example, NIL));
            formulas = cons(formula, formulas);
            cdolist_list_var = cdolist_list_var.rest();
            full_example = cdolist_list_var.first();
        } 
        return formulas;
    }

    public static final SubLObject pc_session_switch_mode_alt(SubLObject session, SubLObject mode) {
        if (NIL != subl_promotions.memberP(mode, $list_alt54, UNPROVIDED, UNPROVIDED)) {
            pc_session_clear_full_examples(session);
            pc_session_clear_arg_examples(session);
            pc_session_update_constraints_via_examples(session);
        }
        if (NIL != subl_promotions.memberP(mode, $list_alt55, UNPROVIDED, UNPROVIDED)) {
            pc_session_clear_generalized_constraints(session);
        }
        if (NIL != subl_promotions.memberP(mode, $list_alt56, UNPROVIDED, UNPROVIDED)) {
            pc_session_clear_template(session);
        }
        pc_session_note_mode(session, mode);
        return session;
    }

    public static SubLObject pc_session_switch_mode(final SubLObject session, final SubLObject mode) {
        if (NIL != subl_promotions.memberP(mode, $list60, UNPROVIDED, UNPROVIDED)) {
            pc_session_clear_full_examples(session);
            pc_session_clear_arg_examples(session);
            pc_session_update_constraints_via_examples(session);
        }
        if (NIL != subl_promotions.memberP(mode, $list61, UNPROVIDED, UNPROVIDED)) {
            pc_session_clear_generalized_constraints(session);
        }
        if (NIL != subl_promotions.memberP(mode, $list62, UNPROVIDED, UNPROVIDED)) {
            pc_session_clear_template(session);
        }
        pc_session_note_mode(session, mode);
        return session;
    }

    public static final SubLObject pc_session_arg_examples_for_arg_alt(SubLObject session, SubLObject arg) {
        {
            SubLObject arg_examples = pc_session_arg_examples(session);
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = arg_examples;
            SubLObject arg_example = NIL;
            for (arg_example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_example = cdolist_list_var.first()) {
                {
                    SubLObject datum = arg_example;
                    SubLObject current = datum;
                    SubLObject example_arg = NIL;
                    SubLObject example_value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    example_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    example_value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (arg.numE(example_arg)) {
                            v_answer = cons(example_value, v_answer);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
            v_answer = nreverse(v_answer);
            return v_answer;
        }
    }

    public static SubLObject pc_session_arg_examples_for_arg(final SubLObject session, final SubLObject arg) {
        final SubLObject arg_examples = pc_session_arg_examples(session);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = arg_examples;
        SubLObject arg_example = NIL;
        arg_example = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_example;
            SubLObject example_arg = NIL;
            SubLObject example_value = NIL;
            destructuring_bind_must_consp(current, datum, $list63);
            example_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list63);
            example_value = current.first();
            current = current.rest();
            if (NIL == current) {
                if (arg.numE(example_arg)) {
                    v_answer = cons(example_value, v_answer);
                }
            } else {
                cdestructuring_bind_error(datum, $list63);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_example = cdolist_list_var.first();
        } 
        v_answer = nreverse(v_answer);
        return v_answer;
    }

    public static final SubLObject pc_session_agenda_alt(SubLObject session) {
        {
            SubLObject interaction = pc_session_interaction(session);
            return ui_agenda(interaction);
        }
    }

    public static SubLObject pc_session_agenda(final SubLObject session) {
        final SubLObject interaction = pc_session_interaction(session);
        return user_interaction_agenda.ui_agenda(interaction);
    }

    public static final SubLObject pc_session_domain_interaction_mt_alt(SubLObject session) {
        {
            SubLObject v_agenda = pc_session_agenda(session);
            SubLObject domain_interaction_mt = uia_domain_interaction_mt(v_agenda);
            return domain_interaction_mt;
        }
    }

    public static SubLObject pc_session_domain_interaction_mt(final SubLObject session) {
        final SubLObject v_agenda = pc_session_agenda(session);
        final SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
        return domain_interaction_mt;
    }

    public static final SubLObject pc_session_generation_interaction_mt_alt(SubLObject session) {
        {
            SubLObject v_agenda = pc_session_agenda(session);
            SubLObject generation_interaction_mt = uia_generation_interaction_mt(v_agenda, UNPROVIDED);
            return generation_interaction_mt;
        }
    }

    public static SubLObject pc_session_generation_interaction_mt(final SubLObject session) {
        final SubLObject v_agenda = pc_session_agenda(session);
        final SubLObject generation_interaction_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, UNPROVIDED);
        return generation_interaction_mt;
    }

    public static final SubLObject pc_session_parsing_interaction_mt_alt(SubLObject session) {
        {
            SubLObject v_agenda = pc_session_agenda(session);
            SubLObject parsing_interaction_mt = uia_parsing_interaction_mt(v_agenda);
            return parsing_interaction_mt;
        }
    }

    public static SubLObject pc_session_parsing_interaction_mt(final SubLObject session) {
        final SubLObject v_agenda = pc_session_agenda(session);
        final SubLObject parsing_interaction_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
        return parsing_interaction_mt;
    }

    public static final SubLObject pc_session_update_constraints_via_examples_alt(SubLObject session) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_mt = pc_session_domain_interaction_mt(session);
                SubLObject v_arity = pc_session_arity(session);
                SubLObject new_constraints = NIL;
                if (v_arity.isInteger()) {
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                            {
                                SubLObject arg = add(i, ONE_INTEGER);
                                SubLObject arg_examples = pc_session_arg_examples_for_arg(session, arg);
                                thread.resetMultipleValues();
                                {
                                    SubLObject isa_constraints = rkf_ontology_utilities.rkf_narrowest_type_constraints(arg_examples, domain_mt);
                                    SubLObject genls_constraints = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((NIL != genls_constraints) && (NIL != $pc_downgrade_typelevelpreds_isas$.getDynamicValue(thread))) {
                                        new_constraints = cons(list(arg, $$argIsa, $$Collection), new_constraints);
                                    } else {
                                        {
                                            SubLObject cdolist_list_var = isa_constraints;
                                            SubLObject constraint = NIL;
                                            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                                new_constraints = cons(list(arg, $$argIsa, constraint), new_constraints);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = genls_constraints;
                                        SubLObject constraint = NIL;
                                        for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                            new_constraints = cons(list(arg, $$argGenl, constraint), new_constraints);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                new_constraints = nreverse(new_constraints);
                pc_session_note_constraints_via_examples(session, new_constraints);
            }
            return session;
        }
    }

    public static SubLObject pc_session_update_constraints_via_examples(final SubLObject session) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_mt = pc_session_domain_interaction_mt(session);
        final SubLObject v_arity = pc_session_arity(session);
        SubLObject new_constraints = NIL;
        if (v_arity.isInteger()) {
            SubLObject i;
            SubLObject arg;
            SubLObject arg_examples;
            SubLObject isa_constraints;
            SubLObject genls_constraints;
            SubLObject cdolist_list_var;
            SubLObject constraint;
            for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                arg = add(i, ONE_INTEGER);
                arg_examples = pc_session_arg_examples_for_arg(session, arg);
                thread.resetMultipleValues();
                isa_constraints = rkf_ontology_utilities.rkf_narrowest_type_constraints(arg_examples, domain_mt);
                genls_constraints = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != genls_constraints) && (NIL != $pc_downgrade_typelevelpreds_isas$.getDynamicValue(thread))) {
                    new_constraints = cons(list(arg, $$argIsa, $$Collection), new_constraints);
                } else {
                    cdolist_list_var = isa_constraints;
                    constraint = NIL;
                    constraint = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        new_constraints = cons(list(arg, $$argIsa, constraint), new_constraints);
                        cdolist_list_var = cdolist_list_var.rest();
                        constraint = cdolist_list_var.first();
                    } 
                }
                cdolist_list_var = genls_constraints;
                constraint = NIL;
                constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    new_constraints = cons(list(arg, $$argGenl, constraint), new_constraints);
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint = cdolist_list_var.first();
                } 
            }
        }
        new_constraints = nreverse(new_constraints);
        pc_session_note_constraints_via_examples(session, new_constraints);
        return session;
    }

    /**
     * Create a new Predicate Creator session for the user INTERACTION.
     */
    @LispMethod(comment = "Create a new Predicate Creator session for the user INTERACTION.")
    public static final SubLObject pc_session_act_create_alt(SubLObject interaction) {
        {
            SubLObject session = new_pc_session(interaction);
            pc_session_switch_mode(session, $ARITY);
            return session;
        }
    }

    /**
     * Create a new Predicate Creator session for the user INTERACTION.
     */
    @LispMethod(comment = "Create a new Predicate Creator session for the user INTERACTION.")
    public static SubLObject pc_session_act_create(final SubLObject interaction) {
        final SubLObject session = new_pc_session(interaction);
        pc_session_switch_mode(session, $ARITY);
        return session;
    }

    /**
     * In Predicate Creator SESSION, note the ARITY for the new predicate.
     */
    @LispMethod(comment = "In Predicate Creator SESSION, note the ARITY for the new predicate.")
    public static final SubLObject pc_session_act_set_arity_alt(SubLObject session, SubLObject v_arity) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($ARITY)) {
                pc_session_note_arity(session, v_arity);
                pc_session_note_mode(session, $EXAMPLES);
            } else {
                if (pcase_var.eql($EXAMPLES) || pcase_var.eql($CONSTRAINTS)) {
                    pc_session_switch_mode(session, $ARITY);
                    pc_session_act_set_arity(session, v_arity);
                }
            }
        }
        return session;
    }

    /**
     * In Predicate Creator SESSION, note the ARITY for the new predicate.
     */
    @LispMethod(comment = "In Predicate Creator SESSION, note the ARITY for the new predicate.")
    public static SubLObject pc_session_act_set_arity(final SubLObject session, final SubLObject v_arity) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($ARITY)) {
            pc_session_note_arity(session, v_arity);
            pc_session_note_mode(session, $EXAMPLES);
        } else
            if (pcase_var.eql($EXAMPLES) || pcase_var.eql($CONSTRAINTS)) {
                pc_session_switch_mode(session, $ARITY);
                pc_session_act_set_arity(session, v_arity);
            }

        return session;
    }

    public static final SubLObject pc_session_act_add_full_example_alt(SubLObject session, SubLObject full_example) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($ARITY)) {
                pc_session_act_set_arity(session, length(full_example));
                pc_session_act_add_full_example(session, full_example);
            } else {
                if (pcase_var.eql($EXAMPLES)) {
                    pc_session_add_full_example(session, full_example);
                    {
                        SubLObject list_var = NIL;
                        SubLObject example = NIL;
                        SubLObject index = NIL;
                        for (list_var = full_example, example = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , example = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject arg = add(index, ONE_INTEGER);
                                pc_session_add_arg_example(session, arg, example);
                            }
                        }
                    }
                    pc_session_update_constraints_via_examples(session);
                } else {
                    if (pcase_var.eql($CONSTRAINTS)) {
                        pc_session_switch_mode(session, $EXAMPLES);
                        pc_session_act_add_full_example(session, full_example);
                    }
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_add_full_example(final SubLObject session, final SubLObject full_example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($ARITY)) {
            pc_session_act_set_arity(session, length(full_example));
            pc_session_act_add_full_example(session, full_example);
        } else
            if (pcase_var.eql($EXAMPLES)) {
                pc_session_add_full_example(session, full_example);
                SubLObject list_var = NIL;
                SubLObject example = NIL;
                SubLObject index = NIL;
                list_var = full_example;
                example = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , example = list_var.first() , index = add(ONE_INTEGER, index)) {
                    final SubLObject arg = add(index, ONE_INTEGER);
                    pc_session_add_arg_example(session, arg, example);
                }
                pc_session_update_constraints_via_examples(session);
            } else
                if (pcase_var.eql($CONSTRAINTS)) {
                    pc_session_switch_mode(session, $EXAMPLES);
                    pc_session_act_add_full_example(session, full_example);
                }


        return session;
    }

    public static final SubLObject pc_session_act_rem_full_example_alt(SubLObject session, SubLObject full_example) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($EXAMPLES)) {
                pc_session_rem_full_example(session, full_example);
                {
                    SubLObject list_var = NIL;
                    SubLObject example = NIL;
                    SubLObject index = NIL;
                    for (list_var = full_example, example = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , example = list_var.first() , index = add(ONE_INTEGER, index)) {
                        {
                            SubLObject arg = add(index, ONE_INTEGER);
                            pc_session_rem_arg_example(session, arg, example);
                        }
                    }
                }
                pc_session_update_constraints_via_examples(session);
            } else {
                if (pcase_var.eql($CONSTRAINTS)) {
                    pc_session_switch_mode(session, $EXAMPLES);
                    pc_session_act_rem_full_example(session, full_example);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_rem_full_example(final SubLObject session, final SubLObject full_example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($EXAMPLES)) {
            pc_session_rem_full_example(session, full_example);
            SubLObject list_var = NIL;
            SubLObject example = NIL;
            SubLObject index = NIL;
            list_var = full_example;
            example = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , example = list_var.first() , index = add(ONE_INTEGER, index)) {
                final SubLObject arg = add(index, ONE_INTEGER);
                pc_session_rem_arg_example(session, arg, example);
            }
            pc_session_update_constraints_via_examples(session);
        } else
            if (pcase_var.eql($CONSTRAINTS)) {
                pc_session_switch_mode(session, $EXAMPLES);
                pc_session_act_rem_full_example(session, full_example);
            }

        return session;
    }

    public static final SubLObject pc_session_act_add_arg_example_alt(SubLObject session, SubLObject arg, SubLObject example) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($EXAMPLES)) {
                pc_session_add_arg_example(session, arg, example);
                pc_session_update_constraints_via_examples(session);
            } else {
                if (pcase_var.eql($CONSTRAINTS)) {
                    pc_session_switch_mode(session, $EXAMPLES);
                    pc_session_act_add_arg_example(session, arg, example);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_add_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($EXAMPLES)) {
            pc_session_add_arg_example(session, arg, example);
            pc_session_update_constraints_via_examples(session);
        } else
            if (pcase_var.eql($CONSTRAINTS)) {
                pc_session_switch_mode(session, $EXAMPLES);
                pc_session_act_add_arg_example(session, arg, example);
            }

        return session;
    }

    public static final SubLObject pc_session_act_rem_arg_example_alt(SubLObject session, SubLObject arg, SubLObject example) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($EXAMPLES)) {
                pc_session_rem_arg_example(session, arg, example);
                pc_session_update_constraints_via_examples(session);
            } else {
                if (pcase_var.eql($CONSTRAINTS)) {
                    pc_session_switch_mode(session, $EXAMPLES);
                    pc_session_act_rem_arg_example(session, arg, example);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_rem_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($EXAMPLES)) {
            pc_session_rem_arg_example(session, arg, example);
            pc_session_update_constraints_via_examples(session);
        } else
            if (pcase_var.eql($CONSTRAINTS)) {
                pc_session_switch_mode(session, $EXAMPLES);
                pc_session_act_rem_arg_example(session, arg, example);
            }

        return session;
    }

    public static final SubLObject pc_session_act_accept_examples_alt(SubLObject session) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($EXAMPLES)) {
                pc_session_switch_mode(session, $CONSTRAINTS);
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_accept_examples(final SubLObject session) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($EXAMPLES)) {
            pc_session_switch_mode(session, $CONSTRAINTS);
        }
        return session;
    }

    public static final SubLObject pc_session_act_clear_all_generalized_constraints_alt(SubLObject session) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($CONSTRAINTS)) {
                pc_session_clear_generalized_constraints(session);
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_clear_all_generalized_constraints(final SubLObject session) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($CONSTRAINTS)) {
            pc_session_clear_generalized_constraints(session);
        }
        return session;
    }

    public static final SubLObject pc_session_act_clear_generalized_constraints_alt(SubLObject session, SubLObject arg) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($CONSTRAINTS)) {
                pc_session_clear_generalized_constraints_for_arg(session, arg);
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_clear_generalized_constraints(final SubLObject session, final SubLObject arg) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($CONSTRAINTS)) {
            pc_session_clear_generalized_constraints_for_arg(session, arg);
        }
        return session;
    }

    public static final SubLObject pc_session_act_add_generalized_constraint_alt(SubLObject session, SubLObject arg, SubLObject constraint_pred, SubLObject value) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($CONSTRAINTS)) {
                {
                    SubLObject constraint = list(arg, constraint_pred, value);
                    pc_session_add_generalized_constraint(session, constraint);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_add_generalized_constraint(final SubLObject session, final SubLObject arg, final SubLObject constraint_pred, final SubLObject value) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($CONSTRAINTS)) {
            final SubLObject constraint = list(arg, constraint_pred, value);
            pc_session_add_generalized_constraint(session, constraint);
        }
        return session;
    }

    public static final SubLObject pc_session_act_accept_generalized_constraints_alt(SubLObject session) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($CONSTRAINTS)) {
                pc_session_switch_mode(session, $TEMPLATE);
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_accept_generalized_constraints(final SubLObject session) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($CONSTRAINTS)) {
            pc_session_switch_mode(session, $TEMPLATE);
        }
        return session;
    }

    public static final SubLObject pc_session_act_note_template_alt(SubLObject session, SubLObject template) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($TEMPLATE)) {
                pc_session_note_template(session, template);
                pc_session_switch_mode(session, $READY);
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_note_template(final SubLObject session, final SubLObject template) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($TEMPLATE)) {
            pc_session_note_template(session, template);
            pc_session_switch_mode(session, $READY);
        }
        return session;
    }

    public static final SubLObject pc_session_act_complete_alt(SubLObject session, SubLObject domain_mt, SubLObject generation_mt, SubLObject parsing_mt) {
        {
            SubLObject pcase_var = pc_session_mode(session);
            if (pcase_var.eql($READY)) {
                {
                    SubLObject predicate = pc_session_create_predicate(session, domain_mt);
                    pc_session_note_predicate(session, predicate);
                    pc_session_assert_arity(session, predicate, domain_mt);
                    pc_session_assert_constraints(session, predicate, domain_mt);
                    pc_session_switch_mode(session, $DONE);
                }
            }
        }
        return session;
    }

    public static SubLObject pc_session_act_complete(final SubLObject session, final SubLObject domain_mt, final SubLObject generation_mt, final SubLObject parsing_mt) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql($READY)) {
            final SubLObject predicate = pc_session_create_predicate(session, domain_mt);
            pc_session_note_predicate(session, predicate);
            pc_session_assert_arity(session, predicate, domain_mt);
            pc_session_assert_constraints(session, predicate, domain_mt);
            pc_session_switch_mode(session, $DONE);
        }
        return session;
    }

    public static final SubLObject pc_session_act_complete_from_examples_alt(SubLObject pc_session) {
        {
            SubLObject constraints = pc_session_constraints_via_examples(pc_session);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                {
                    SubLObject datum = constraint;
                    SubLObject current = datum;
                    SubLObject arg = NIL;
                    SubLObject constraint_pred = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    constraint_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        pc_session_act_add_generalized_constraint(pc_session, arg, constraint_pred, value);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt65);
                    }
                }
            }
            pc_session_act_accept_generalized_constraints(pc_session);
        }
        {
            SubLObject template = NIL;
            pc_session_act_note_template(pc_session, template);
        }
        {
            SubLObject domain_interaction_mt = pc_session_domain_interaction_mt(pc_session);
            SubLObject generation_mt = pc_session_generation_interaction_mt(pc_session);
            SubLObject parsing_mt = pc_session_parsing_interaction_mt(pc_session);
            pc_session_act_complete(pc_session, domain_interaction_mt, generation_mt, parsing_mt);
        }
        return pc_session;
    }

    public static SubLObject pc_session_act_complete_from_examples(final SubLObject pc_session) {
        SubLObject cdolist_list_var;
        final SubLObject constraints = cdolist_list_var = pc_session_constraints_via_examples(pc_session);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject arg = NIL;
            SubLObject constraint_pred = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list71);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list71);
            constraint_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list71);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                pc_session_act_add_generalized_constraint(pc_session, arg, constraint_pred, value);
            } else {
                cdestructuring_bind_error(datum, $list71);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        pc_session_act_accept_generalized_constraints(pc_session);
        final SubLObject template = NIL;
        pc_session_act_note_template(pc_session, template);
        final SubLObject domain_interaction_mt = pc_session_domain_interaction_mt(pc_session);
        final SubLObject generation_mt = pc_session_generation_interaction_mt(pc_session);
        final SubLObject parsing_mt = pc_session_parsing_interaction_mt(pc_session);
        pc_session_act_complete(pc_session, domain_interaction_mt, generation_mt, parsing_mt);
        return pc_session;
    }

    public static final SubLObject pc_session_create_predicate_alt(SubLObject session, SubLObject domain_mt) {
        {
            SubLObject predicate = rkf_term_utilities.rkf_create($$$Predicate, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return predicate;
        }
    }

    public static SubLObject pc_session_create_predicate(final SubLObject session, final SubLObject domain_mt) {
        final SubLObject predicate = rkf_term_utilities.rkf_create($$$Predicate, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return predicate;
    }

    public static final SubLObject pc_session_assert_arity_alt(SubLObject session, SubLObject predicate, SubLObject domain_mt) {
        {
            SubLObject v_arity = pc_session_arity(session);
            SubLObject formula = pc_session_compute_arity_formula(predicate, v_arity, domain_mt);
            rkf_assertion_utilities.rkf_assert(formula, domain_mt, UNPROVIDED, UNPROVIDED);
        }
        return predicate;
    }

    public static SubLObject pc_session_assert_arity(final SubLObject session, final SubLObject predicate, final SubLObject domain_mt) {
        final SubLObject v_arity = pc_session_arity(session);
        final SubLObject formula = pc_session_compute_arity_formula(predicate, v_arity, domain_mt);
        rkf_assertion_utilities.rkf_assert(formula, domain_mt, UNPROVIDED, UNPROVIDED);
        return predicate;
    }

    public static final SubLObject pc_session_assert_constraints_alt(SubLObject session, SubLObject predicate, SubLObject domain_mt) {
        {
            SubLObject constraints = pc_session_generalized_constraints(session);
            constraints = pc_session_sort_constraints(constraints);
            {
                SubLObject cdolist_list_var = constraints;
                SubLObject constraint = NIL;
                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                    {
                        SubLObject datum = constraint;
                        SubLObject current = datum;
                        SubLObject arg = NIL;
                        SubLObject constraint_pred = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt65);
                        arg = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt65);
                        constraint_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt65);
                        value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject formula = list(constraint_pred, predicate, arg, value);
                                rkf_assertion_utilities.rkf_assert(formula, domain_mt, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt65);
                        }
                    }
                }
            }
        }
        return predicate;
    }

    public static SubLObject pc_session_assert_constraints(final SubLObject session, final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject constraints = pc_session_generalized_constraints(session);
        SubLObject cdolist_list_var;
        constraints = cdolist_list_var = pc_session_sort_constraints(constraints);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject arg = NIL;
            SubLObject constraint_pred = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list71);
            arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list71);
            constraint_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list71);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject formula = list(constraint_pred, predicate, arg, value);
                rkf_assertion_utilities.rkf_assert(formula, domain_mt, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list71);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return predicate;
    }

    public static final SubLObject pc_session_sort_constraints_alt(SubLObject constraints) {
        constraints = copy_list(constraints);
        constraints = Sort.sort(constraints, symbol_function($sym67$GENERALITY_ESTIMATE_), symbol_function(THIRD));
        constraints = list_utilities.stable_sort_via_position(constraints, $pc_session_constraint_predicates$.getGlobalValue(), symbol_function(EQL), symbol_function(SECOND));
        constraints = Sort.stable_sort(constraints, symbol_function($sym70$_), symbol_function(FIRST));
        return constraints;
    }

    public static SubLObject pc_session_sort_constraints(SubLObject constraints) {
        constraints = copy_list(constraints);
        constraints = Sort.sort(constraints, symbol_function($sym73$GENERALITY_ESTIMATE_), symbol_function(THIRD));
        constraints = list_utilities.stable_sort_via_position(constraints, $pc_session_constraint_predicates$.getGlobalValue(), symbol_function(EQL), symbol_function(SECOND));
        constraints = Sort.stable_sort(constraints, symbol_function($sym76$_), symbol_function(FIRST));
        return constraints;
    }

    public static final SubLObject pc_session_assert_generation_template_alt(SubLObject session, SubLObject predicate, SubLObject generation_mt) {
        {
            SubLObject template = pc_session_template(session);
            SubLObject formula = pc_session_compute_generation_template_formula(predicate, template, generation_mt);
            rkf_assertion_utilities.rkf_assert(formula, generation_mt, UNPROVIDED, UNPROVIDED);
            return predicate;
        }
    }

    public static SubLObject pc_session_assert_generation_template(final SubLObject session, final SubLObject predicate, final SubLObject generation_mt) {
        final SubLObject template = pc_session_template(session);
        final SubLObject formula = pc_session_compute_generation_template_formula(predicate, template, generation_mt);
        rkf_assertion_utilities.rkf_assert(formula, generation_mt, UNPROVIDED, UNPROVIDED);
        return predicate;
    }

    public static final SubLObject pc_session_assert_parsing_template_alt(SubLObject session, SubLObject predicate, SubLObject parsing_mt) {
        {
            SubLObject template = pc_session_template(session);
            SubLObject formula = pc_session_compute_parsing_template_formula(predicate, template, parsing_mt);
            rkf_assertion_utilities.rkf_assert(formula, parsing_mt, UNPROVIDED, UNPROVIDED);
            return predicate;
        }
    }

    public static SubLObject pc_session_assert_parsing_template(final SubLObject session, final SubLObject predicate, final SubLObject parsing_mt) {
        final SubLObject template = pc_session_template(session);
        final SubLObject formula = pc_session_compute_parsing_template_formula(predicate, template, parsing_mt);
        rkf_assertion_utilities.rkf_assert(formula, parsing_mt, UNPROVIDED, UNPROVIDED);
        return predicate;
    }

    public static final SubLObject pc_session_compute_arity_formula_alt(SubLObject predicate, SubLObject v_arity, SubLObject domain_mt) {
        {
            SubLObject collection = rkf_predicate_type_for_arity(v_arity, domain_mt);
            return list($$isa, predicate, collection);
        }
    }

    public static SubLObject pc_session_compute_arity_formula(final SubLObject predicate, final SubLObject v_arity, final SubLObject domain_mt) {
        final SubLObject collection = rkf_predicate_type_for_arity(v_arity, domain_mt);
        return list($$isa, predicate, collection);
    }

    public static final SubLObject rkf_predicate_type_for_arity_alt(SubLObject v_arity, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return cached_predicate_type_for_arity_any_mt(v_arity);
    }

    public static SubLObject rkf_predicate_type_for_arity(final SubLObject v_arity, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return cached_predicate_type_for_arity_any_mt(v_arity);
    }

    public static final SubLObject clear_cached_predicate_type_for_arity_any_mt_alt() {
        {
            SubLObject cs = $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_predicate_type_for_arity_any_mt() {
        final SubLObject cs = $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_predicate_type_for_arity_any_mt_alt(SubLObject v_arity) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue(), list(v_arity), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_predicate_type_for_arity_any_mt(final SubLObject v_arity) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue(), list(v_arity), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_predicate_type_for_arity_any_mt_internal_alt(SubLObject v_arity) {
        {
            SubLObject query = subst(v_arity, $ARITY, $predicate_type_for_arity_query$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            return ask_utilities.ask_variable($COL, query, $$InferencePSC, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
        }
    }

    public static SubLObject cached_predicate_type_for_arity_any_mt_internal(final SubLObject v_arity) {
        final SubLObject query = subst(v_arity, $ARITY, $predicate_type_for_arity_query$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        return ask_utilities.ask_variable($COL, query, $$InferencePSC, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject cached_predicate_type_for_arity_any_mt_alt(SubLObject v_arity) {
        {
            SubLObject caching_state = $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT, $cached_predicate_type_for_arity_any_mt_caching_state$, NIL, EQL, ONE_INTEGER, FIVE_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_arity, $kw77$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw77$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cached_predicate_type_for_arity_any_mt_internal(v_arity)));
                    memoization_state.caching_state_put(caching_state, v_arity, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_predicate_type_for_arity_any_mt(final SubLObject v_arity) {
        SubLObject caching_state = $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT, $cached_predicate_type_for_arity_any_mt_caching_state$, NIL, EQL, ONE_INTEGER, FIVE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_arity, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_predicate_type_for_arity_any_mt_internal(v_arity)));
            memoization_state.caching_state_put(caching_state, v_arity, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject pc_session_compute_generation_template_formula_alt(SubLObject predicate, SubLObject template, SubLObject generation_mt) {
        {
            SubLObject generation_template = pc_session_compute_generation_template(template);
            return list($$genTemplate, predicate, generation_template);
        }
    }

    public static SubLObject pc_session_compute_generation_template_formula(final SubLObject predicate, final SubLObject template, final SubLObject generation_mt) {
        final SubLObject generation_template = pc_session_compute_generation_template(template);
        return list($$genTemplate, predicate, generation_template);
    }

    public static final SubLObject pc_session_compute_generation_template_alt(SubLObject template) {
        {
            SubLObject template_terms = NIL;
            SubLObject cdolist_list_var = template;
            SubLObject template_item = NIL;
            for (template_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_item = cdolist_list_var.first()) {
                if (template_item.isString()) {
                    template_terms = cons(list($$BestNLPhraseOfStringFn, template_item), template_terms);
                } else {
                    if (template_item.isKeyword()) {
                        template_terms = cons(list($$TermParaphraseFn, template_item), template_terms);
                    }
                }
            }
            template_terms = nreverse(template_terms);
            return bq_cons($$ConcatenatePhrasesFn, append(template_terms, NIL));
        }
    }

    public static SubLObject pc_session_compute_generation_template(final SubLObject template) {
        SubLObject template_terms = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject template_item = NIL;
        template_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (template_item.isString()) {
                template_terms = cons(make_unary_formula(pph_functions.bestnlphraseofstringfn(), template_item), template_terms);
            } else
                if (template_item.isKeyword()) {
                    template_terms = cons(make_unary_formula(pph_functions.termparaphrasefn(), template_item), template_terms);
                }

            cdolist_list_var = cdolist_list_var.rest();
            template_item = cdolist_list_var.first();
        } 
        template_terms = nreverse(template_terms);
        return make_el_formula(pph_functions.concatenatephrasesfn(), template_terms, UNPROVIDED);
    }

    public static final SubLObject pc_session_compute_parsing_template_formula_alt(SubLObject predicate, SubLObject template, SubLObject parsing_mt) {
        {
            SubLObject syntax_template = pc_session_compute_parsing_syntax_template(template);
            SubLObject semantics_template = pc_session_compute_parsing_semantics_template(predicate, template);
            return list($$assertTemplate_Reln, $$STemplate, predicate, syntax_template, semantics_template);
        }
    }

    public static SubLObject pc_session_compute_parsing_template_formula(final SubLObject predicate, final SubLObject template, final SubLObject parsing_mt) {
        final SubLObject syntax_template = pc_session_compute_parsing_syntax_template(template);
        final SubLObject semantics_template = pc_session_compute_parsing_semantics_template(predicate, template);
        return list($$assertTemplate_Reln, $$STemplate, predicate, syntax_template, semantics_template);
    }

    public static final SubLObject pc_session_compute_parsing_syntax_template_alt(SubLObject template) {
        {
            SubLObject template_terms = NIL;
            SubLObject cdolist_list_var = template;
            SubLObject template_item = NIL;
            for (template_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_item = cdolist_list_var.first()) {
                if (template_item.isString()) {
                    {
                        SubLObject strings = standard_tokenization.standard_raw_tokenization(template_item);
                        SubLObject cdolist_list_var_1 = strings;
                        SubLObject string = NIL;
                        for (string = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , string = cdolist_list_var_1.first()) {
                            template_terms = cons(string, template_terms);
                        }
                    }
                } else {
                    if (template_item.isKeyword()) {
                        template_terms = cons(list($$NPTemplate, template_item), template_terms);
                    }
                }
            }
            template_terms = nreverse(template_terms);
            return template_terms;
        }
    }

    public static SubLObject pc_session_compute_parsing_syntax_template(final SubLObject template) {
        SubLObject template_terms = NIL;
        SubLObject cdolist_list_var = template;
        SubLObject template_item = NIL;
        template_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (template_item.isString()) {
                SubLObject cdolist_list_var_$1;
                final SubLObject strings = cdolist_list_var_$1 = standard_tokenization.standard_raw_tokenization(template_item);
                SubLObject string = NIL;
                string = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    template_terms = cons(string, template_terms);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    string = cdolist_list_var_$1.first();
                } 
            } else
                if (template_item.isKeyword()) {
                    template_terms = cons(list($$NPTemplate, template_item), template_terms);
                }

            cdolist_list_var = cdolist_list_var.rest();
            template_item = cdolist_list_var.first();
        } 
        template_terms = nreverse(template_terms);
        return template_terms;
    }

    public static final SubLObject pc_session_compute_parsing_semantics_template_alt(SubLObject predicate, SubLObject v_arity) {
        return generic_relation_template_of_arity(predicate, v_arity);
    }

    public static SubLObject pc_session_compute_parsing_semantics_template(final SubLObject predicate, final SubLObject v_arity) {
        return generic_relation_template_of_arity(predicate, v_arity);
    }

    public static final SubLObject generic_relation_template_alt(SubLObject relation) {
        {
            SubLObject v_arity = arity.min_arity(relation);
            return generic_relation_template_of_arity(relation, v_arity);
        }
    }

    public static SubLObject generic_relation_template(final SubLObject relation) {
        final SubLObject v_arity = arity.min_arity(relation);
        return generic_relation_template_of_arity(relation, v_arity);
    }

    public static final SubLObject generic_relation_template_of_arity_alt(SubLObject relation, SubLObject v_arity) {
        {
            SubLObject args = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                args = cons(generic_keyword_arg(add(i, ONE_INTEGER)), args);
            }
            args = nreverse(args);
            return make_formula(relation, args, UNPROVIDED);
        }
    }

    public static SubLObject generic_relation_template_of_arity(final SubLObject relation, final SubLObject v_arity) {
        SubLObject args = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            args = cons(generic_keyword_arg(add(i, ONE_INTEGER)), args);
        }
        args = nreverse(args);
        return make_formula(relation, args, UNPROVIDED);
    }

    public static final SubLObject clear_generic_keyword_arg_alt() {
        {
            SubLObject cs = $generic_keyword_arg_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_generic_keyword_arg() {
        final SubLObject cs = $generic_keyword_arg_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_generic_keyword_arg_alt(SubLObject n) {
        return memoization_state.caching_state_remove_function_results_with_args($generic_keyword_arg_caching_state$.getGlobalValue(), list(n), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_generic_keyword_arg(final SubLObject n) {
        return memoization_state.caching_state_remove_function_results_with_args($generic_keyword_arg_caching_state$.getGlobalValue(), list(n), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generic_keyword_arg_internal_alt(SubLObject n) {
        {
            SubLObject string = format(NIL, $str_alt86$ARG_A, n);
            return values(string_utilities.keyword_from_string(string));
        }
    }

    public static SubLObject generic_keyword_arg_internal(final SubLObject n) {
        final SubLObject string = format(NIL, $str88$ARG_A, n);
        return values(string_utilities.keyword_from_string(string));
    }

    public static final SubLObject generic_keyword_arg_alt(SubLObject n) {
        {
            SubLObject caching_state = $generic_keyword_arg_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GENERIC_KEYWORD_ARG, $generic_keyword_arg_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, n, $kw77$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw77$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(generic_keyword_arg_internal(n)));
                    memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject generic_keyword_arg(final SubLObject n) {
        SubLObject caching_state = $generic_keyword_arg_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GENERIC_KEYWORD_ARG, $generic_keyword_arg_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(generic_keyword_arg_internal(n)));
            memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_rkf_predicate_creator_file() {
        declareMacro("with_pc_lock", "WITH-PC-LOCK");
        declareFunction("pc_session_mode_p", "PC-SESSION-MODE-P", 1, 0, false);
        declareFunction("pc_session_contraint_predicate_p", "PC-SESSION-CONTRAINT-PREDICATE-P", 1, 0, false);
        declareFunction("pc_session_full_example_p", "PC-SESSION-FULL-EXAMPLE-P", 1, 0, false);
        declareFunction("pc_session_example_p", "PC-SESSION-EXAMPLE-P", 1, 0, false);
        declareFunction("pc_session_template_p", "PC-SESSION-TEMPLATE-P", 1, 0, false);
        declareFunction("pc_session_constraint_list_p", "PC-SESSION-CONSTRAINT-LIST-P", 1, 0, false);
        declareFunction("pc_session_constraint_p", "PC-SESSION-CONSTRAINT-P", 1, 0, false);
        declareFunction("pc_session_print_function_trampoline", "PC-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pc_session_p", "PC-SESSION-P", 1, 0, false);
        new rkf_predicate_creator.$pc_session_p$UnaryFunction();
        declareFunction("pc_session_interaction", "PC-SESSION-INTERACTION", 1, 0, false);
        declareFunction("pc_session_mode", "PC-SESSION-MODE", 1, 0, false);
        declareFunction("pc_session_arity", "PC-SESSION-ARITY", 1, 0, false);
        declareFunction("pc_session_full_examples", "PC-SESSION-FULL-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_arg_examples", "PC-SESSION-ARG-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_constraints_via_examples", "PC-SESSION-CONSTRAINTS-VIA-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_generalized_constraints", "PC-SESSION-GENERALIZED-CONSTRAINTS", 1, 0, false);
        declareFunction("pc_session_template", "PC-SESSION-TEMPLATE", 1, 0, false);
        declareFunction("pc_session_predicate", "PC-SESSION-PREDICATE", 1, 0, false);
        declareFunction("_csetf_pc_session_interaction", "_CSETF-PC-SESSION-INTERACTION", 2, 0, false);
        declareFunction("_csetf_pc_session_mode", "_CSETF-PC-SESSION-MODE", 2, 0, false);
        declareFunction("_csetf_pc_session_arity", "_CSETF-PC-SESSION-ARITY", 2, 0, false);
        declareFunction("_csetf_pc_session_full_examples", "_CSETF-PC-SESSION-FULL-EXAMPLES", 2, 0, false);
        declareFunction("_csetf_pc_session_arg_examples", "_CSETF-PC-SESSION-ARG-EXAMPLES", 2, 0, false);
        declareFunction("_csetf_pc_session_constraints_via_examples", "_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false);
        declareFunction("_csetf_pc_session_generalized_constraints", "_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_pc_session_template", "_CSETF-PC-SESSION-TEMPLATE", 2, 0, false);
        declareFunction("_csetf_pc_session_predicate", "_CSETF-PC-SESSION-PREDICATE", 2, 0, false);
        declareFunction("make_pc_session", "MAKE-PC-SESSION", 0, 1, false);
        declareFunction("visit_defstruct_pc_session", "VISIT-DEFSTRUCT-PC-SESSION", 2, 0, false);
        declareFunction("visit_defstruct_object_pc_session_method", "VISIT-DEFSTRUCT-OBJECT-PC-SESSION-METHOD", 2, 0, false);
        declareFunction("new_pc_session", "NEW-PC-SESSION", 1, 0, false);
        declareFunction("pc_session_note_mode", "PC-SESSION-NOTE-MODE", 2, 0, false);
        declareFunction("pc_session_note_arity", "PC-SESSION-NOTE-ARITY", 2, 0, false);
        declareFunction("pc_session_clear_full_examples", "PC-SESSION-CLEAR-FULL-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_add_full_example", "PC-SESSION-ADD-FULL-EXAMPLE", 2, 0, false);
        declareFunction("pc_session_rem_full_example", "PC-SESSION-REM-FULL-EXAMPLE", 2, 0, false);
        declareFunction("pc_session_clear_arg_examples", "PC-SESSION-CLEAR-ARG-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_add_arg_example", "PC-SESSION-ADD-ARG-EXAMPLE", 3, 0, false);
        declareFunction("pc_session_rem_arg_example", "PC-SESSION-REM-ARG-EXAMPLE", 3, 0, false);
        declareFunction("pc_session_note_constraints_via_examples", "PC-SESSION-NOTE-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false);
        declareFunction("pc_session_clear_generalized_constraints", "PC-SESSION-CLEAR-GENERALIZED-CONSTRAINTS", 1, 0, false);
        declareFunction("pc_session_clear_generalized_constraints_for_arg", "PC-SESSION-CLEAR-GENERALIZED-CONSTRAINTS-FOR-ARG", 2, 0, false);
        declareFunction("pc_session_add_generalized_constraint", "PC-SESSION-ADD-GENERALIZED-CONSTRAINT", 2, 0, false);
        declareFunction("pc_session_clear_template", "PC-SESSION-CLEAR-TEMPLATE", 1, 0, false);
        declareFunction("pc_session_note_template", "PC-SESSION-NOTE-TEMPLATE", 2, 0, false);
        declareFunction("pc_session_note_predicate", "PC-SESSION-NOTE-PREDICATE", 2, 0, false);
        declareFunction("pc_session_full_example_formulas", "PC-SESSION-FULL-EXAMPLE-FORMULAS", 1, 0, false);
        declareFunction("pc_session_switch_mode", "PC-SESSION-SWITCH-MODE", 2, 0, false);
        declareFunction("pc_session_arg_examples_for_arg", "PC-SESSION-ARG-EXAMPLES-FOR-ARG", 2, 0, false);
        declareFunction("pc_session_agenda", "PC-SESSION-AGENDA", 1, 0, false);
        declareFunction("pc_session_domain_interaction_mt", "PC-SESSION-DOMAIN-INTERACTION-MT", 1, 0, false);
        declareFunction("pc_session_generation_interaction_mt", "PC-SESSION-GENERATION-INTERACTION-MT", 1, 0, false);
        declareFunction("pc_session_parsing_interaction_mt", "PC-SESSION-PARSING-INTERACTION-MT", 1, 0, false);
        declareFunction("pc_session_update_constraints_via_examples", "PC-SESSION-UPDATE-CONSTRAINTS-VIA-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_act_create", "PC-SESSION-ACT-CREATE", 1, 0, false);
        declareFunction("pc_session_act_set_arity", "PC-SESSION-ACT-SET-ARITY", 2, 0, false);
        declareFunction("pc_session_act_add_full_example", "PC-SESSION-ACT-ADD-FULL-EXAMPLE", 2, 0, false);
        declareFunction("pc_session_act_rem_full_example", "PC-SESSION-ACT-REM-FULL-EXAMPLE", 2, 0, false);
        declareFunction("pc_session_act_add_arg_example", "PC-SESSION-ACT-ADD-ARG-EXAMPLE", 3, 0, false);
        declareFunction("pc_session_act_rem_arg_example", "PC-SESSION-ACT-REM-ARG-EXAMPLE", 3, 0, false);
        declareFunction("pc_session_act_accept_examples", "PC-SESSION-ACT-ACCEPT-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_act_clear_all_generalized_constraints", "PC-SESSION-ACT-CLEAR-ALL-GENERALIZED-CONSTRAINTS", 1, 0, false);
        declareFunction("pc_session_act_clear_generalized_constraints", "PC-SESSION-ACT-CLEAR-GENERALIZED-CONSTRAINTS", 2, 0, false);
        declareFunction("pc_session_act_add_generalized_constraint", "PC-SESSION-ACT-ADD-GENERALIZED-CONSTRAINT", 4, 0, false);
        declareFunction("pc_session_act_accept_generalized_constraints", "PC-SESSION-ACT-ACCEPT-GENERALIZED-CONSTRAINTS", 1, 0, false);
        declareFunction("pc_session_act_note_template", "PC-SESSION-ACT-NOTE-TEMPLATE", 2, 0, false);
        declareFunction("pc_session_act_complete", "PC-SESSION-ACT-COMPLETE", 4, 0, false);
        declareFunction("pc_session_act_complete_from_examples", "PC-SESSION-ACT-COMPLETE-FROM-EXAMPLES", 1, 0, false);
        declareFunction("pc_session_create_predicate", "PC-SESSION-CREATE-PREDICATE", 2, 0, false);
        declareFunction("pc_session_assert_arity", "PC-SESSION-ASSERT-ARITY", 3, 0, false);
        declareFunction("pc_session_assert_constraints", "PC-SESSION-ASSERT-CONSTRAINTS", 3, 0, false);
        declareFunction("pc_session_sort_constraints", "PC-SESSION-SORT-CONSTRAINTS", 1, 0, false);
        declareFunction("pc_session_assert_generation_template", "PC-SESSION-ASSERT-GENERATION-TEMPLATE", 3, 0, false);
        declareFunction("pc_session_assert_parsing_template", "PC-SESSION-ASSERT-PARSING-TEMPLATE", 3, 0, false);
        declareFunction("pc_session_compute_arity_formula", "PC-SESSION-COMPUTE-ARITY-FORMULA", 3, 0, false);
        declareFunction("rkf_predicate_type_for_arity", "RKF-PREDICATE-TYPE-FOR-ARITY", 1, 1, false);
        declareFunction("clear_cached_predicate_type_for_arity_any_mt", "CLEAR-CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 0, 0, false);
        declareFunction("remove_cached_predicate_type_for_arity_any_mt", "REMOVE-CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 1, 0, false);
        declareFunction("cached_predicate_type_for_arity_any_mt_internal", "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-INTERNAL", 1, 0, false);
        declareFunction("cached_predicate_type_for_arity_any_mt", "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 1, 0, false);
        declareFunction("pc_session_compute_generation_template_formula", "PC-SESSION-COMPUTE-GENERATION-TEMPLATE-FORMULA", 3, 0, false);
        declareFunction("pc_session_compute_generation_template", "PC-SESSION-COMPUTE-GENERATION-TEMPLATE", 1, 0, false);
        declareFunction("pc_session_compute_parsing_template_formula", "PC-SESSION-COMPUTE-PARSING-TEMPLATE-FORMULA", 3, 0, false);
        declareFunction("pc_session_compute_parsing_syntax_template", "PC-SESSION-COMPUTE-PARSING-SYNTAX-TEMPLATE", 1, 0, false);
        declareFunction("pc_session_compute_parsing_semantics_template", "PC-SESSION-COMPUTE-PARSING-SEMANTICS-TEMPLATE", 2, 0, false);
        declareFunction("generic_relation_template", "GENERIC-RELATION-TEMPLATE", 1, 0, false);
        declareFunction("generic_relation_template_of_arity", "GENERIC-RELATION-TEMPLATE-OF-ARITY", 2, 0, false);
        declareFunction("clear_generic_keyword_arg", "CLEAR-GENERIC-KEYWORD-ARG", 0, 0, false);
        declareFunction("remove_generic_keyword_arg", "REMOVE-GENERIC-KEYWORD-ARG", 1, 0, false);
        declareFunction("generic_keyword_arg_internal", "GENERIC-KEYWORD-ARG-INTERNAL", 1, 0, false);
        declareFunction("generic_keyword_arg", "GENERIC-KEYWORD-ARG", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("*PC-LOCK*"));

    static private final SubLList $list_alt4 = list(makeKeyword("NEW"), makeKeyword("ARITY"), makeKeyword("EXAMPLES"), makeKeyword("CONSTRAINTS"), makeKeyword("TEMPLATE"), makeKeyword("READY"), $DONE);

    static private final SubLList $list_alt5 = list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"));

    static private final SubLList $list_alt6 = list(makeSymbol("ARG"), makeSymbol("PRED"), makeSymbol("VALUE"));

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeSymbol("INTERACTION"), makeSymbol("MODE"), makeSymbol("ARITY"), makeSymbol("FULL-EXAMPLES"), makeSymbol("ARG-EXAMPLES"), makeSymbol("CONSTRAINTS-VIA-EXAMPLES"), makeSymbol("GENERALIZED-CONSTRAINTS"), makeSymbol("TEMPLATE"), makeSymbol("PREDICATE") });

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("INTERACTION"), $MODE, makeKeyword("ARITY"), makeKeyword("FULL-EXAMPLES"), makeKeyword("ARG-EXAMPLES"), makeKeyword("CONSTRAINTS-VIA-EXAMPLES"), makeKeyword("GENERALIZED-CONSTRAINTS"), makeKeyword("TEMPLATE"), makeKeyword("PREDICATE") });

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("PC-SESSION-INTERACTION"), makeSymbol("PC-SESSION-MODE"), makeSymbol("PC-SESSION-ARITY"), makeSymbol("PC-SESSION-FULL-EXAMPLES"), makeSymbol("PC-SESSION-ARG-EXAMPLES"), makeSymbol("PC-SESSION-CONSTRAINTS-VIA-EXAMPLES"), makeSymbol("PC-SESSION-GENERALIZED-CONSTRAINTS"), makeSymbol("PC-SESSION-TEMPLATE"), makeSymbol("PC-SESSION-PREDICATE") });

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeSymbol("_CSETF-PC-SESSION-INTERACTION"), makeSymbol("_CSETF-PC-SESSION-MODE"), makeSymbol("_CSETF-PC-SESSION-ARITY"), makeSymbol("_CSETF-PC-SESSION-FULL-EXAMPLES"), makeSymbol("_CSETF-PC-SESSION-ARG-EXAMPLES"), makeSymbol("_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES"), makeSymbol("_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS"), makeSymbol("_CSETF-PC-SESSION-TEMPLATE"), makeSymbol("_CSETF-PC-SESSION-PREDICATE") });

    static private final SubLString $str_alt42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final SubLObject init_rkf_predicate_creator_file_alt() {
        deflexical("*PC-LOCK*", NIL != boundp($pc_lock$) ? ((SubLObject) ($pc_lock$.getGlobalValue())) : make_lock($$$Predicate_Creator_lock));
        deflexical("*PC-SESSION-MODES*", $list_alt4);
        deflexical("*PC-SESSION-CONSTRAINT-PREDICATES*", $list_alt5);
        defconstant("*DTP-PC-SESSION*", PC_SESSION);
        defparameter("*PC-DOWNGRADE-TYPELEVELPREDS-ISAS*", T);
        deflexical("*PREDICATE-TYPE-FOR-ARITY-QUERY*", $list_alt72);
        deflexical("*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*", NIL);
        deflexical("*GENERIC-KEYWORD-ARG-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_rkf_predicate_creator_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*PC-LOCK*", SubLTrampolineFile.maybeDefault($pc_lock$, $pc_lock$, () -> make_lock($$$Predicate_Creator_lock)));
            deflexical("*PC-SESSION-MODES*", $list4);
            deflexical("*PC-SESSION-CONSTRAINT-PREDICATES*", $list5);
            defconstant("*DTP-PC-SESSION*", PC_SESSION);
            defparameter("*PC-DOWNGRADE-TYPELEVELPREDS-ISAS*", T);
            deflexical("*PREDICATE-TYPE-FOR-ARITY-QUERY*", $list78);
            deflexical("*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*", NIL);
            deflexical("*GENERIC-KEYWORD-ARG-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PC-LOCK*", NIL != boundp($pc_lock$) ? ((SubLObject) ($pc_lock$.getGlobalValue())) : make_lock($$$Predicate_Creator_lock));
            deflexical("*PREDICATE-TYPE-FOR-ARITY-QUERY*", $list_alt72);
        }
        return NIL;
    }

    public static SubLObject init_rkf_predicate_creator_file_Previous() {
        deflexical("*PC-LOCK*", SubLTrampolineFile.maybeDefault($pc_lock$, $pc_lock$, () -> make_lock($$$Predicate_Creator_lock)));
        deflexical("*PC-SESSION-MODES*", $list4);
        deflexical("*PC-SESSION-CONSTRAINT-PREDICATES*", $list5);
        defconstant("*DTP-PC-SESSION*", PC_SESSION);
        defparameter("*PC-DOWNGRADE-TYPELEVELPREDS-ISAS*", T);
        deflexical("*PREDICATE-TYPE-FOR-ARITY-QUERY*", $list78);
        deflexical("*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*", NIL);
        deflexical("*GENERIC-KEYWORD-ARG-CACHING-STATE*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt54 = list(makeKeyword("ARITY"));

    static private final SubLList $list_alt55 = list(makeKeyword("ARITY"), makeKeyword("EXAMPLES"));

    public static SubLObject setup_rkf_predicate_creator_file() {
        declare_defglobal($pc_lock$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pc_session$.getGlobalValue(), symbol_function(PC_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list15);
        def_csetf(PC_SESSION_INTERACTION, _CSETF_PC_SESSION_INTERACTION);
        def_csetf(PC_SESSION_MODE, _CSETF_PC_SESSION_MODE);
        def_csetf(PC_SESSION_ARITY, _CSETF_PC_SESSION_ARITY);
        def_csetf(PC_SESSION_FULL_EXAMPLES, _CSETF_PC_SESSION_FULL_EXAMPLES);
        def_csetf(PC_SESSION_ARG_EXAMPLES, _CSETF_PC_SESSION_ARG_EXAMPLES);
        def_csetf(PC_SESSION_CONSTRAINTS_VIA_EXAMPLES, _CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES);
        def_csetf(PC_SESSION_GENERALIZED_CONSTRAINTS, _CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS);
        def_csetf(PC_SESSION_TEMPLATE, _CSETF_PC_SESSION_TEMPLATE);
        def_csetf(PC_SESSION_PREDICATE, _CSETF_PC_SESSION_PREDICATE);
        identity(PC_SESSION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pc_session$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD));
        memoization_state.note_globally_cached_function(CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT);
        memoization_state.note_globally_cached_function(GENERIC_KEYWORD_ARG);
        return NIL;
    }

    static private final SubLList $list_alt56 = list(makeKeyword("ARITY"), makeKeyword("EXAMPLES"), makeKeyword("CONSTRAINTS"));

    static private final SubLList $list_alt57 = list(makeSymbol("EXAMPLE-ARG"), makeSymbol("EXAMPLE-VALUE"));

    static private final SubLList $list_alt65 = list(makeSymbol("ARG"), makeSymbol("CONSTRAINT-PRED"), makeSymbol("VALUE"));

    static private final SubLSymbol $sym67$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    static private final SubLSymbol $sym70$_ = makeSymbol("<");

    static private final SubLList $list_alt72 = list(reader_make_constant_shell("thereExists"), makeSymbol("?GENL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeKeyword("COL"), reader_make_constant_shell("RelationshipTypeByArity")), list(reader_make_constant_shell("isa"), makeSymbol("?GENL"), reader_make_constant_shell("RelationshipTypeByArity")), list(reader_make_constant_shell("genls"), makeKeyword("COL"), reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("genls"), makeKeyword("COL"), makeSymbol("?GENL")), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("arity"), makeSymbol("?GENL"), makeKeyword("ARITY")))));

    @Override
    public void declareFunctions() {
        declare_rkf_predicate_creator_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_predicate_creator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_predicate_creator_file();
    }

    static {
    }

    public static final SubLSymbol $kw77$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");







    static private final SubLString $str_alt86$ARG_A = makeString("ARG~A");

    public static final class $pc_session_p$UnaryFunction extends UnaryFunction {
        public $pc_session_p$UnaryFunction() {
            super(extractFunctionNamed("PC-SESSION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pc_session_p(arg1);
        }
    }
}

/**
 * Total time: 299 ms
 */
