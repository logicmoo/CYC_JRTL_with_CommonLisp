package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_member_of_list extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "25a320dc88bfc478418ec060a75ec7b0fdd0acf6e70184f8c63dcc8915e242ff";
    private static SubLObject $$memberOfList;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_MEMBER_OF_LIST_CHECK;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_NOT_MEMBER_OF_LIST_CHECK;
    private static SubLList $list7;
    private static SubLSymbol $REMOVAL_MEMBER_OF_LIST_UNIFY;
    private static SubLList $list9;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 1000L)
    public static SubLObject removal_member_of_list_check_int(SubLObject asent) {
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject thelist = NIL;
        SubLObject elements = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        thelist = current.first();
        current = (elements = current.rest());
        current = temp;
        if (NIL == current) {
            return conses_high.member(element, elements, Symbols.symbol_function(EQUAL), UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 1400L)
    public static SubLObject removal_member_of_list_check(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_member_of_list_check_int(asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 2200L)
    public static SubLObject removal_not_member_of_list_check(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(NIL == removal_member_of_list_check_int(asent));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 3100L)
    public static SubLObject removal_member_of_list_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject element = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject thelist = NIL;
        SubLObject elements = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
        thelist = current.first();
        current = (elements = current.rest());
        current = temp;
        if (NIL == current) {
            return Sequences.length(elements);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 3500L)
    public static SubLObject removal_member_of_list_unify_generate(SubLObject the_list) {
        return iteration.new_list_iterator(cycl_utilities.formula_args(the_list, UNPROVIDED));
    }

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

    public static SubLObject setup_removal_modules_member_of_list_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$memberOfList);
        preference_modules.doomed_unless_arg_bindable($POS, $$memberOfList, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$memberOfList);
        inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_CHECK, $list5);
        inference_modules.inference_removal_module($REMOVAL_NOT_MEMBER_OF_LIST_CHECK, $list7);
        inference_modules.inference_removal_module($REMOVAL_MEMBER_OF_LIST_UNIFY, $list9);
        return NIL;
    }

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
        me = new removal_modules_member_of_list();
        $$memberOfList = makeConstSym(("memberOfList"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $list3 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THELIST"), makeSymbol("ELEMENTS")));
        $REMOVAL_MEMBER_OF_LIST_CHECK = makeKeyword("REMOVAL-MEMBER-OF-LIST-CHECK");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("memberOfList")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("memberOfList")), makeKeyword("FULLY-BOUND"), cons(makeConstSym(("TheList")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MEMBER-OF-LIST-CHECK"), makeKeyword("INPUT")),
                makeKeyword("DOCUMENTATION"), makeString("(#$memberOfList <fully-bound> (#$TheList . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$memberOfList #$Dog (#$TheList #$Dog #$Cat))") });
        $REMOVAL_NOT_MEMBER_OF_LIST_CHECK = makeKeyword("REMOVAL-NOT-MEMBER-OF-LIST-CHECK");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("memberOfList")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("memberOfList")), makeKeyword("FULLY-BOUND"), cons(makeConstSym(("TheList")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NOT-MEMBER-OF-LIST-CHECK"), makeKeyword("INPUT")),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$memberOfList <fully-bound> (#$TheList . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$memberOfList #$Bird (#$TheList #$Dog #$Cat)))") });
        $REMOVAL_MEMBER_OF_LIST_UNIFY = makeKeyword("REMOVAL-MEMBER-OF-LIST-UNIFY");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("memberOfList")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("memberOfList")), makeKeyword("NOT-FULLY-BOUND"), cons(makeConstSym(("TheList")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("memberOfList")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("THE-LIST"))), list(makeKeyword("VALUE"), makeSymbol("THE-LIST"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("memberOfList")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("THE-LIST"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$memberOfList <not fully-bound> (#$TheList . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$memberOfList ?WHAT (#$TheList #$Dog #$Cat))") });
    }
}
/*
 *
 * Total time: 30 ms
 *
 */