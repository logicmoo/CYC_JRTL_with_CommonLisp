/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_member_of_list extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_member_of_list();





    static private final SubLList $list3 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THELIST"), makeSymbol("ELEMENTS")));

    private static final SubLSymbol $REMOVAL_MEMBER_OF_LIST_CHECK = makeKeyword("REMOVAL-MEMBER-OF-LIST-CHECK");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("memberOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheList"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REMOVAL-MEMBER-OF-LIST-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$memberOfList <fully-bound> (#$TheList . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$memberOfList #$Dog (#$TheList #$Dog #$Cat))") });

    private static final SubLSymbol $REMOVAL_NOT_MEMBER_OF_LIST_CHECK = makeKeyword("REMOVAL-NOT-MEMBER-OF-LIST-CHECK");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("memberOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheList"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REMOVAL-NOT-MEMBER-OF-LIST-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$memberOfList <fully-bound> (#$TheList . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$memberOfList #$Bird (#$TheList #$Dog #$Cat)))") });

    private static final SubLSymbol $REMOVAL_MEMBER_OF_LIST_UNIFY = makeKeyword("REMOVAL-MEMBER-OF-LIST-UNIFY");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("memberOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("TheList"), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("memberOfList"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("THE-LIST"))), list(makeKeyword("VALUE"), makeSymbol("THE-LIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("THE-LIST"))), makeKeyword("DOCUMENTATION"), makeString("(#$memberOfList <not fully-bound> (#$TheList . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$memberOfList ?WHAT (#$TheList #$Dog #$Cat))") });

    // Definitions
    public static final SubLObject removal_member_of_list_check_int_alt(SubLObject asent) {
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject element = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            element = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject thelist = NIL;
                    SubLObject elements = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    thelist = current.first();
                    current = current.rest();
                    elements = current;
                    current = temp;
                    if (NIL == current) {
                        return member(element, elements, symbol_function(EQUAL), UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject removal_member_of_list_check_int(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        element = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thelist = NIL;
        SubLObject elements = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        thelist = current.first();
        current = elements = current.rest();
        current = temp;
        if (NIL == current) {
            return member(element, elements, symbol_function(EQUAL), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject removal_member_of_list_check_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list.removal_member_of_list_check_int(asent);
    }

    public static SubLObject removal_member_of_list_check(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_member_of_list_check_int(asent);
    }

    public static final SubLObject removal_not_member_of_list_check_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list.removal_member_of_list_check_int(asent));
    }

    public static SubLObject removal_not_member_of_list_check(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(NIL == removal_member_of_list_check_int(asent));
    }

    static private final SubLList $list_alt1 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THELIST"), makeSymbol("ELEMENTS")));

    public static final SubLObject removal_member_of_list_unify_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject element = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            element = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject thelist = NIL;
                    SubLObject elements = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    thelist = current.first();
                    current = current.rest();
                    elements = current;
                    current = temp;
                    if (NIL == current) {
                        return length(elements);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_member_of_list_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        element = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thelist = NIL;
        SubLObject elements = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        thelist = current.first();
        current = elements = current.rest();
        current = temp;
        if (NIL == current) {
            return length(elements);
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("memberOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheList"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REMOVAL-MEMBER-OF-LIST-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$memberOfList <fully-bound> (#$TheList . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$memberOfList #$Dog (#$TheList #$Dog #$Cat))") });

    public static final SubLObject removal_member_of_list_unify_generate_alt(SubLObject the_list) {
        return iteration.new_list_iterator(cycl_utilities.formula_args(the_list, UNPROVIDED));
    }

    public static SubLObject removal_member_of_list_unify_generate(final SubLObject the_list) {
        return iteration.new_list_iterator(cycl_utilities.formula_args(the_list, UNPROVIDED));
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("memberOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell("TheList"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REMOVAL-NOT-MEMBER-OF-LIST-CHECK"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$memberOfList <fully-bound> (#$TheList . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$memberOfList #$Bird (#$TheList #$Dog #$Cat)))") });

    public static SubLObject declare_removal_modules_member_of_list_file() {
        declareFunction("removal_member_of_list_check_int", "REMOVAL-MEMBER-OF-LIST-CHECK-INT", 1, 0, false);
        declareFunction("removal_member_of_list_check", "REMOVAL-MEMBER-OF-LIST-CHECK", 1, 1, false);
        declareFunction("removal_not_member_of_list_check", "REMOVAL-NOT-MEMBER-OF-LIST-CHECK", 1, 1, false);
        declareFunction("removal_member_of_list_unify_cost", "REMOVAL-MEMBER-OF-LIST-UNIFY-COST", 1, 1, false);
        declareFunction("removal_member_of_list_unify_generate", "REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_member_of_list_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_member_of_list_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$memberOfList);
        inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_CHECK, $list_alt3);
        inference_modules.inference_removal_module($REMOVAL_NOT_MEMBER_OF_LIST_CHECK, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_UNIFY, $list_alt7);
        return NIL;
    }

    public static SubLObject setup_removal_modules_member_of_list_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$memberOfList);
            preference_modules.doomed_unless_arg_bindable($POS, $$memberOfList, TWO_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$memberOfList);
            inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_CHECK, $list5);
            inference_modules.inference_removal_module($REMOVAL_NOT_MEMBER_OF_LIST_CHECK, $list7);
            inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_UNIFY, $list9);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_CHECK, $list_alt3);
            inference_modules.inference_removal_module($REMOVAL_NOT_MEMBER_OF_LIST_CHECK, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_UNIFY, $list_alt7);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_member_of_list_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$memberOfList);
        preference_modules.doomed_unless_arg_bindable($POS, $$memberOfList, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$memberOfList);
        inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_CHECK, $list5);
        inference_modules.inference_removal_module($REMOVAL_NOT_MEMBER_OF_LIST_CHECK, $list7);
        inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_UNIFY, $list9);
        return NIL;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("memberOfList"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("NOT-FULLY-BOUND"), cons(reader_make_constant_shell("TheList"), makeKeyword("FULLY-BOUND"))), $COST, makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("memberOfList"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("THE-LIST"))), list(makeKeyword("VALUE"), makeSymbol("THE-LIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("memberOfList"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("THE-LIST"))), makeKeyword("DOCUMENTATION"), makeString("(#$memberOfList <not fully-bound> (#$TheList . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$memberOfList ?WHAT (#$TheList #$Dog #$Cat))") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_member_of_list_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_member_of_list_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_member_of_list_file();
    }

    static {
    }
}

/**
 * Total time: 30 ms
 */
