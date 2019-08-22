/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.classes_utilities;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-LALR
 *  source file: /cyc/top/cycl/cyblack/cyblack-lalr.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_lalr extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_lalr() {
    }

    public static final SubLFile me = new cyblack_lalr();


    // // Definitions
    // defparameter
    public static final SubLSymbol $topcat$ = makeSymbol("*TOPCAT*");

    // defparameter
    public static final SubLSymbol $end_marker$ = makeSymbol("*END-MARKER*");

    // defparameter
    public static final SubLSymbol $glex$ = makeSymbol("*GLEX*");

    // defparameter
    public static final SubLSymbol $grules$ = makeSymbol("*GRULES*");

    // defparameter
    public static final SubLSymbol $gstart$ = makeSymbol("*GSTART*");

    // defparameter
    public static final SubLSymbol $gstarts$ = makeSymbol("*GSTARTS*");

    // defparameter
    public static final SubLSymbol $gcats$ = makeSymbol("*GCATS*");

    // defparameter
    public static final SubLSymbol $gfirsts$ = makeSymbol("*GFIRSTS*");

    // defparameter
    public static final SubLSymbol $gepsilons$ = makeSymbol("*GEPSILONS*");

    // defparameter
    public static final SubLSymbol $gexpansions$ = makeSymbol("*GEXPANSIONS*");



    // defparameter
    public static final SubLSymbol $state_list$ = makeSymbol("*STATE-LIST*");

    // defparameter
    private static final SubLSymbol $lalr_rule_method_name_counter$ = makeSymbol("*LALR-RULE-METHOD-NAME-COUNTER*");

    // defparameter
    private static final SubLSymbol $lalr_rule_method_name_prefix$ = makeSymbol("*LALR-RULE-METHOD-NAME-PREFIX*");

    // defparameter
    private static final SubLSymbol $lalr_rule_current_class_name$ = makeSymbol("*LALR-RULE-CURRENT-CLASS-NAME*");

    /**
     * Takes a grammar and produces the Lisp code for a parser for that grammar
     */
    public static final SubLObject make_parser(SubLObject parser_class, SubLObject super_class, SubLObject grammar, SubLObject lex, SubLObject lexifier, SubLObject top_cat, SubLObject end_marker, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            lalr_rule_reset_method_name_counter();
            $lalr_rule_current_class_name$.setDynamicValue(parser_class, thread);
            $end_marker$.setDynamicValue(end_marker, thread);
            $topcat$.setDynamicValue(top_cat, thread);
            $glex$.setDynamicValue(lex, thread);
            $gstart$.setDynamicValue(caar(grammar), thread);
            {
                SubLObject reversed_rules = NIL;
                SubLObject i = ZERO_INTEGER;
                SubLObject cdolist_list_var = grammar;
                SubLObject rule = NIL;
                for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                    i = add(i, ONE_INTEGER);
                    reversed_rules = cons(transform_rule(rule, i), reversed_rules);
                }
                $grules$.setDynamicValue(nreverse(reversed_rules), thread);
            }
            $gcats$.setDynamicValue(get_all_cats(), thread);
            {
                SubLObject gexpansions = NIL;
                SubLObject list_expression = $gcats$.getDynamicValue(thread);
                if (NIL == list_expression) {
                    gexpansions = NIL;
                } else
                    if (list_expression.isAtom()) {
                        gexpansions = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject cat = list_expression.first();
                                gexpansions = list(cons(cat, compute_expansion(cat)));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject cat = list_expression.first();
                                    gexpansions = list(cons(cat, compute_expansion(cat)));
                                    tail_cons = gexpansions;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject cat = NIL;
                                    for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                                        result = list(cons(cat, compute_expansion(cat)));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


                $gexpansions$.setDynamicValue(gexpansions, thread);
            }
            {
                SubLObject gepsilons = NIL;
                SubLObject list_expression = $gcats$.getDynamicValue(thread);
                if (NIL == list_expression) {
                    gepsilons = NIL;
                } else
                    if (list_expression.isAtom()) {
                        gepsilons = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject cat = list_expression.first();
                                gepsilons = (NIL != derives_eps(cat)) ? ((SubLObject) (list(cat))) : NIL;
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                gepsilons = NIL;
                                {
                                    SubLObject cdolist_list_var = list_expression;
                                    SubLObject cat = NIL;
                                    for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                                        result = (NIL != derives_eps(cat)) ? ((SubLObject) (list(cat))) : NIL;
                                        if (NIL != result) {
                                            if (NIL != tail_cons) {
                                                rplacd(tail_cons, result);
                                                tail_cons = last(result, UNPROVIDED);
                                            } else {
                                                gepsilons = (NIL != derives_eps(cat)) ? ((SubLObject) (list(cat))) : NIL;
                                                tail_cons = last(gepsilons, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }


                $gepsilons$.setDynamicValue(gepsilons, thread);
            }
            {
                SubLObject gstarts = NIL;
                SubLObject list_expression = $gcats$.getDynamicValue(thread);
                if (NIL == list_expression) {
                    gstarts = NIL;
                } else
                    if (list_expression.isAtom()) {
                        gstarts = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject cat = list_expression.first();
                                gstarts = list(cons(cat, first_terms(list(cat))));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject cat = list_expression.first();
                                    gstarts = list(cons(cat, first_terms(list(cat))));
                                    tail_cons = gstarts;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject cat = NIL;
                                    for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                                        result = list(cons(cat, first_terms(list(cat))));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


                $gstarts$.setDynamicValue(cons(list($end_marker$.getDynamicValue(thread), $end_marker$.getDynamicValue(thread)), gstarts), thread);
            }
            build_table();
            if ($lalr_debug$.getDynamicValue(thread).isList() && (NIL != member(PRINT_TABLE, $lalr_debug$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                print_table($state_list$.getDynamicValue(thread));
            }
            return build_parser(parser_class, super_class, $topcat$.getDynamicValue(thread), lex, lexifier, $state_list$.getDynamicValue(thread), lexicon);
        }
    }

    public static final class $lalr_rule_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_lalr.$lalr_rule_native.structDecl;
        }

        public SubLObject getField2() {
            return $no;
        }

        public SubLObject getField3() {
            return $mother;
        }

        public SubLObject getField4() {
            return $daughters;
        }

        public SubLObject getField5() {
            return $action;
        }

        public SubLObject getField6() {
            return $method_name;
        }

        public SubLObject getField7() {
            return $method_defn;
        }

        public SubLObject setField2(SubLObject value) {
            return $no = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $mother = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $daughters = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $action = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $method_name = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $method_defn = value;
        }

        public SubLObject $no = Lisp.NIL;

        public SubLObject $mother = Lisp.NIL;

        public SubLObject $daughters = Lisp.NIL;

        public SubLObject $action = Lisp.NIL;

        public SubLObject $method_name = Lisp.NIL;

        public SubLObject $method_defn = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_lalr.$lalr_rule_native.class, LALR_RULE, LALR_RULE_P, $list_alt5, $list_alt6, new String[]{ "$no", "$mother", "$daughters", "$action", "$method_name", "$method_defn" }, $list_alt7, $list_alt8, PRINT_LALR_RULE);
    }

    // defconstant
    public static final SubLSymbol $dtp_lalr_rule$ = makeSymbol("*DTP-LALR-RULE*");

    public static final SubLObject lalr_rule_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_lalr_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject lalr_rule_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_lalr.$lalr_rule_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $lalr_rule_p$UnaryFunction extends UnaryFunction {
        public $lalr_rule_p$UnaryFunction() {
            super(extractFunctionNamed("LALR-RULE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return lalr_rule_p(arg1);
        }
    }

    public static final SubLObject lalr_rule_no(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.getField2();
    }

    public static final SubLObject lalr_rule_mother(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.getField3();
    }

    public static final SubLObject lalr_rule_daughters(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.getField4();
    }

    public static final SubLObject lalr_rule_action(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.getField5();
    }

    public static final SubLObject lalr_rule_method_name(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.getField6();
    }

    public static final SubLObject lalr_rule_method_defn(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.getField7();
    }

    public static final SubLObject _csetf_lalr_rule_no(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_lalr_rule_mother(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_lalr_rule_daughters(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_lalr_rule_action(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_lalr_rule_method_name(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_lalr_rule_method_defn(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LALR_RULE_P);
        return v_object.setField7(value);
    }

    public static final SubLObject make_lalr_rule(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_lalr.$lalr_rule_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NO)) {
                        _csetf_lalr_rule_no(v_new, current_value);
                    } else
                        if (pcase_var.eql($MOTHER)) {
                            _csetf_lalr_rule_mother(v_new, current_value);
                        } else
                            if (pcase_var.eql($DAUGHTERS)) {
                                _csetf_lalr_rule_daughters(v_new, current_value);
                            } else
                                if (pcase_var.eql($ACTION)) {
                                    _csetf_lalr_rule_action(v_new, current_value);
                                } else
                                    if (pcase_var.eql($METHOD_NAME)) {
                                        _csetf_lalr_rule_method_name(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($METHOD_DEFN)) {
                                            _csetf_lalr_rule_method_defn(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                        }





                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_lalr_rule(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt30$__LALR_RULE__no__S__mother__S__da, new SubLObject[]{ lalr_rule_no(v_object), lalr_rule_mother(v_object), lalr_rule_daughters(v_object), lalr_rule_action(v_object), lalr_rule_method_name(v_object) });
        return v_object;
    }

    public static final SubLObject describe_lalr_rule(SubLObject rule) {
        format(T, $str_alt31$__Description_of_LALR_RULE_____S_, rule);
        format(T, $str_alt32$____no_____S, lalr_rule_no(rule));
        format(T, $str_alt33$____mother_____S, lalr_rule_mother(rule));
        format(T, $str_alt34$____daughters_____S, lalr_rule_daughters(rule));
        format(T, $str_alt35$____action_____S, lalr_rule_action(rule));
        format(T, $str_alt36$____method_name_____S, lalr_rule_method_name(rule));
        format(T, $str_alt37$____method_defn_____S, lalr_rule_method_defn(rule));
        return rule;
    }

    public static final SubLObject describe_lalr_rules(SubLObject rules) {
        {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                describe_lalr_rule(rule);
                format(T, $str_alt38$__);
            }
        }
        return rules;
    }

    public static final SubLObject lalr_rule_reset_method_name_counter() {
        $lalr_rule_method_name_counter$.setDynamicValue(ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static final SubLObject lalr_rule_allocate_method_name() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_name = intern(cconcatenate($lalr_rule_method_name_prefix$.getDynamicValue(thread), string_utilities.to_string($lalr_rule_method_name_counter$.getDynamicValue(thread))), UNPROVIDED);
                $lalr_rule_method_name_counter$.setDynamicValue(add($lalr_rule_method_name_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                return new_name;
            }
        }
    }

    public static final SubLObject create_lalr_rule(SubLObject no, SubLObject mother, SubLObject daughters, SubLObject action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_rule = make_lalr_rule(UNPROVIDED);
                _csetf_lalr_rule_no(new_rule, no);
                _csetf_lalr_rule_mother(new_rule, mother);
                _csetf_lalr_rule_daughters(new_rule, daughters);
                _csetf_lalr_rule_action(new_rule, action);
                if (NIL != action) {
                    _csetf_lalr_rule_method_name(new_rule, lalr_rule_allocate_method_name());
                    {
                        SubLObject datum = action;
                        SubLObject current = datum;
                        SubLObject lambda_symbol = NIL;
                        SubLObject lambda_list = NIL;
                        SubLObject expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        lambda_symbol = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        lambda_list = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt39);
                        expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            _csetf_lalr_rule_method_defn(new_rule, list(DEF_INSTANCE_METHOD, listS(lalr_rule_method_name(new_rule), $lalr_rule_current_class_name$.getDynamicValue(thread), $list_alt41), lambda_list, list(RET, expression)));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                    }
                } else {
                    _csetf_lalr_rule_method_name(new_rule, NIL);
                    _csetf_lalr_rule_method_defn(new_rule, NIL);
                }
                return new_rule;
            }
        }
    }

    public static final SubLObject transform_rule(SubLObject rule, SubLObject no) {
        return create_lalr_rule(no, rule.first(), butlast(cddr(rule), UNPROVIDED), last(rule, UNPROVIDED).first());
    }

    public static final SubLObject compute_expansion(SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject list_expression = $grules$.getDynamicValue(thread);
                if (NIL == list_expression) {
                    result = NIL;
                } else
                    if (list_expression.isAtom()) {
                        result = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject rule = list_expression.first();
                                result = (lalr_rule_mother(rule) == cat) ? ((SubLObject) (list(rule))) : NIL;
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result_1 = NIL;
                                result = NIL;
                                {
                                    SubLObject cdolist_list_var = list_expression;
                                    SubLObject rule = NIL;
                                    for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                        result_1 = (lalr_rule_mother(rule) == cat) ? ((SubLObject) (list(rule))) : NIL;
                                        if (NIL != result_1) {
                                            if (NIL != tail_cons) {
                                                rplacd(tail_cons, result_1);
                                                tail_cons = last(result_1, UNPROVIDED);
                                            } else {
                                                result = (lalr_rule_mother(rule) == cat) ? ((SubLObject) (list(rule))) : NIL;
                                                tail_cons = last(result, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }


                return result;
            }
        }
    }

    public static final SubLObject lalr_expand(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cat = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            cat = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CDR, listS(ASSOC, cat, $list_alt46));
            } else {
                cdestructuring_bind_error(datum, $list_alt43);
            }
        }
        return NIL;
    }

    public static final SubLObject get_all_cats_try(SubLObject deja_vu, SubLObject cat) {
        return NIL != find(cat, deja_vu, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (deja_vu)) : get_all_cats_try_rules(cons(cat, deja_vu), compute_expansion(cat));
    }

    public static final SubLObject get_all_cats_try_rules(SubLObject deja_vu, SubLObject rules) {
        return NIL != rules ? ((SubLObject) (get_all_cats_try_rules(get_all_cats_try_cats(deja_vu, lalr_rule_daughters(rules.first())), rules.rest()))) : deja_vu;
    }

    public static final SubLObject get_all_cats_try_cats(SubLObject deja_vu, SubLObject cats) {
        return NIL != cats ? ((SubLObject) (get_all_cats_try_cats(get_all_cats_try(deja_vu, cats.first()), cats.rest()))) : deja_vu;
    }

    public static final SubLObject get_all_cats() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return get_all_cats_try(NIL, $gstart$.getDynamicValue(thread));
        }
    }

    public static final SubLObject derives_eps_every(SubLObject deja_vu, SubLObject cat, SubLObject rule) {
        {
            SubLObject cdolist_list_var = lalr_rule_daughters(rule);
            SubLObject c1 = NIL;
            for (c1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c1 = cdolist_list_var.first()) {
                if (NIL == derives_eps_try(cons(cat, deja_vu), c1)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject derives_eps_some(SubLObject deja_vu, SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = assoc(cat, $gexpansions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                SubLObject rule = NIL;
                for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                    if (NIL != derives_eps_every(deja_vu, cat, rule)) {
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject derives_eps_try(SubLObject deja_vu, SubLObject cat) {
        if (NIL == find(cat, deja_vu, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return derives_eps_some(deja_vu, cat);
        }
        return NIL;
    }

    /**
     * t if c can be rewritten as the null string
     */
    public static final SubLObject derives_eps(SubLObject c) {
        return derives_eps_try(NIL, c);
    }

    /**
     * looks up the cache to see if c derives the null string
     */
    public static final SubLObject derives_epsilon(SubLObject c) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return member(c, $gepsilons$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject first_terms_first_ds(SubLObject cats) {
        return NIL != cats ? ((SubLObject) (NIL != derives_epsilon(cats.first()) ? ((SubLObject) (cons(cats.first(), first_terms_first_ds(cats.rest())))) : list(cats.first()))) : NIL;
    }

    public static final SubLObject first_terms_try(SubLObject deja_vu, SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(cat, deja_vu, UNPROVIDED, UNPROVIDED)) {
                return deja_vu;
            } else {
                {
                    SubLObject categories = NIL;
                    SubLObject list_expression = assoc(cat, $gexpansions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                    if (NIL == list_expression) {
                        categories = NIL;
                    } else
                        if (list_expression.isAtom()) {
                            categories = list(list_expression);
                        } else
                            if (NIL == list_expression.rest()) {
                                {
                                    SubLObject rule = list_expression.first();
                                    categories = copy_list(first_terms_first_ds(lalr_rule_daughters(rule)));
                                }
                            } else {
                                {
                                    SubLObject tail_cons = NIL;
                                    SubLObject result = NIL;
                                    categories = NIL;
                                    {
                                        SubLObject cdolist_list_var = list_expression;
                                        SubLObject rule = NIL;
                                        for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                            result = copy_list(first_terms_first_ds(lalr_rule_daughters(rule)));
                                            if (NIL != result) {
                                                if (NIL != tail_cons) {
                                                    rplacd(tail_cons, result);
                                                    tail_cons = last(result, UNPROVIDED);
                                                } else {
                                                    categories = copy_list(first_terms_first_ds(lalr_rule_daughters(rule)));
                                                    tail_cons = last(categories, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }


                    return first_terms_try_list(cons(cat, deja_vu), categories);
                }
            }
        }
    }

    public static final SubLObject first_terms_try_list(SubLObject deja_vu, SubLObject cats) {
        return NIL != cats ? ((SubLObject) (first_terms_try_list(first_terms_try(deja_vu, cats.first()), cats.rest()))) : deja_vu;
    }

    /**
     * the leading terminals of an expansion of catList
     */
    public static final SubLObject first_terms(SubLObject cat_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject list_expression = first_terms_try_list(NIL, first_terms_first_ds(cat_list));
                if (NIL == list_expression) {
                    result = NIL;
                } else
                    if (list_expression.isAtom()) {
                        result = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject v_term = list_expression.first();
                                result = (($end_marker$.getDynamicValue(thread) == v_term) || (NIL != find(v_term, $glex$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) (list(v_term))) : NIL;
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result_2 = NIL;
                                result = NIL;
                                {
                                    SubLObject cdolist_list_var = list_expression;
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                        result_2 = (($end_marker$.getDynamicValue(thread) == v_term) || (NIL != find(v_term, $glex$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) (list(v_term))) : NIL;
                                        if (NIL != result_2) {
                                            if (NIL != tail_cons) {
                                                rplacd(tail_cons, result_2);
                                                tail_cons = last(result_2, UNPROVIDED);
                                            } else {
                                                result = (($end_marker$.getDynamicValue(thread) == v_term) || (NIL != find(v_term, $glex$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) (list(v_term))) : NIL;
                                                tail_cons = last(result, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }


                return result;
            }
        }
    }

    public static final SubLObject first_terminals(SubLObject cat_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != cat_list ? ((SubLObject) (NIL != derives_epsilon(cat_list.first()) ? ((SubLObject) (union(assoc(cat_list.first(), $gstarts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest(), first_terminals(cat_list.rest()), UNPROVIDED, UNPROVIDED))) : assoc(cat_list.first(), $gstarts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest())) : NIL;
        }
    }

    public static final class $item_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_lalr.$item_native.structDecl;
        }

        public SubLObject getField2() {
            return $rule;
        }

        public SubLObject getField3() {
            return $pos;
        }

        public SubLObject getField4() {
            return $la;
        }

        public SubLObject setField2(SubLObject value) {
            return $rule = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $pos = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $la = value;
        }

        public SubLObject $rule = Lisp.NIL;

        public SubLObject $pos = Lisp.NIL;

        public SubLObject $la = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_lalr.$item_native.class, ITEM, ITEM_P, $list_alt49, $list_alt50, new String[]{ "$rule", "$pos", "$la" }, $list_alt51, $list_alt52, PRINT_ITEM);
    }

    // defconstant
    public static final SubLSymbol $dtp_item$ = makeSymbol("*DTP-ITEM*");

    public static final SubLObject item_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_item(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject item_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_lalr.$item_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $item_p$UnaryFunction extends UnaryFunction {
        public $item_p$UnaryFunction() {
            super(extractFunctionNamed("ITEM-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return item_p(arg1);
        }
    }

    public static final SubLObject item_rule(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITEM_P);
        return v_object.getField2();
    }

    public static final SubLObject item_pos(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITEM_P);
        return v_object.getField3();
    }

    public static final SubLObject item_la(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITEM_P);
        return v_object.getField4();
    }

    public static final SubLObject _csetf_item_rule(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITEM_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_item_pos(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITEM_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_item_la(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITEM_P);
        return v_object.setField4(value);
    }

    public static final SubLObject make_item(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_lalr.$item_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($RULE)) {
                        _csetf_item_rule(v_new, current_value);
                    } else
                        if (pcase_var.eql($POS)) {
                            _csetf_item_pos(v_new, current_value);
                        } else
                            if (pcase_var.eql($LA)) {
                                _csetf_item_la(v_new, current_value);
                            } else {
                                Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                            }


                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_item(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt64$__ITEM__rule__S__pos__S__la__S_, new SubLObject[]{ item_rule(v_object), item_pos(v_object), item_la(v_object) });
        return v_object;
    }

    public static final SubLObject create_item(SubLObject rule, SubLObject pos, SubLObject la) {
        {
            SubLObject new_item = make_item(UNPROVIDED);
            _csetf_item_rule(new_item, rule);
            _csetf_item_pos(new_item, pos);
            _csetf_item_la(new_item, la);
            return new_item;
        }
    }

    public static final SubLObject describe_item(SubLObject item) {
        format(T, $str_alt65$__Description_of_Item__S_, item);
        format(T, $str_alt66$____rule_____S, item_rule(item));
        format(T, $str_alt67$____pos_____S, item_pos(item));
        format(T, $str_alt68$____la_____S, item_la(item));
        return item;
    }

    public static final SubLObject item_daughters(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject i = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            i = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(LALR_RULE_DAUGHTERS, list(ITEM_RULE, i));
            } else {
                cdestructuring_bind_error(datum, $list_alt69);
            }
        }
        return NIL;
    }

    public static final SubLObject item_right(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject i = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            i = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(NTHCDR, list(ITEM_POS, i), list(ITEM_DAUGHTERS, i));
            } else {
                cdestructuring_bind_error(datum, $list_alt69);
            }
        }
        return NIL;
    }

    public static final SubLObject item_equal(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject i1 = NIL;
            SubLObject i2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            i1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt72);
            i2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAND, list(EQ, list(ITEM_RULE, i1), list(ITEM_RULE, i2)), list($sym74$_, list(ITEM_POS, i1), list(ITEM_POS, i2)), list(EQUAL, list(ITEM_LA, i1), list(ITEM_LA, i2)));
            } else {
                cdestructuring_bind_error(datum, $list_alt72);
            }
        }
        return NIL;
    }

    /**
     * T if the cores of c1 and c2 are equal
     */
    public static final SubLObject item_core_equal(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject c1 = NIL;
            SubLObject c2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            c1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt75);
            c2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAND, list(EQ, list(ITEM_RULE, c1), list(ITEM_RULE, c2)), list($sym74$_, list(ITEM_POS, c1), list(ITEM_POS, c2)));
            } else {
                cdestructuring_bind_error(datum, $list_alt75);
            }
        }
        return NIL;
    }

    public static final SubLObject close_items_check_items(SubLObject items, SubLObject la, SubLObject r) {
        {
            SubLObject cdolist_list_var = items;
            SubLObject i = NIL;
            for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                if (((r == item_rule(i)) && item_pos(i).numE(ZERO_INTEGER)) && item_la(i).equal(la)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * computes the closure of a set of items
     */
    public static final SubLObject close_items(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject to_do = items;
                while (NIL != to_do) {
                    {
                        SubLObject i = to_do.first();
                        to_do = to_do.rest();
                        if (NIL != nthcdr(item_pos(i), lalr_rule_daughters(item_rule(i)))) {
                            {
                                SubLObject cdolist_list_var = first_terminals(append(nthcdr(item_pos(i), lalr_rule_daughters(item_rule(i))).rest(), list(item_la(i))));
                                SubLObject la = NIL;
                                for (la = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , la = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_3 = assoc(nthcdr(item_pos(i), lalr_rule_daughters(item_rule(i))).first(), $gexpansions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                                        SubLObject r = NIL;
                                        for (r = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , r = cdolist_list_var_3.first()) {
                                            if (NIL == close_items_check_items(items, la, r)) {
                                                {
                                                    SubLObject v_new = create_item(r, ZERO_INTEGER, la);
                                                    items = cons(v_new, items);
                                                    to_do = cons(v_new, to_do);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
                return items;
            }
        }
    }

    public static final SubLObject shift_items_shift_item(SubLObject cat, SubLObject item) {
        if (nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item))).first() == cat) {
            return create_item(item_rule(item), number_utilities.f_1X(item_pos(item)), item_la(item));
        }
        return NIL;
    }

    /**
     * shifts a set of items over cat
     */
    public static final SubLObject shift_items(SubLObject items, SubLObject cat) {
        {
            SubLObject new_items = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject i = NIL;
            for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                {
                    SubLObject n = shift_items_shift_item(cat, i);
                    if (NIL != n) {
                        new_items = cons(n, new_items);
                    }
                }
            }
            return new_items;
        }
    }

    /**
     * returns the set of categories appearing to the right of the dot
     */
    public static final SubLObject items_right(SubLObject items) {
        {
            SubLObject right = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject i = NIL;
            for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                {
                    SubLObject d = nthcdr(item_pos(i), lalr_rule_daughters(item_rule(i))).first();
                    if ((NIL != d) && (NIL == find(d, right, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        right = cons(d, right);
                    }
                }
            }
            return right;
        }
    }

    public static final SubLObject compact_items_sort_key(SubLObject item) {
        return lalr_rule_no(item_rule(item));
    }

    /**
     * collapses items with the same core to compact items
     */
    public static final SubLObject compact_items(SubLObject items) {
        {
            SubLObject so_far = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject i = NIL;
            for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                {
                    SubLObject ci = NIL;
                    try {
                        {
                            SubLObject cdolist_list_var_4 = so_far;
                            SubLObject s = NIL;
                            for (s = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , s = cdolist_list_var_4.first()) {
                                if ((item_rule(s) == item_rule(i)) && item_pos(s).numE(item_pos(i))) {
                                    sublisp_throw(COMPACT_ITEMS_TAG, s);
                                }
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ci = Errors.handleThrowable(ccatch_env_var, COMPACT_ITEMS_TAG);
                    }
                    if (NIL != ci) {
                        _csetf_item_la(ci, cons(item_la(i), item_la(ci)));
                    } else {
                        so_far = cons(create_item(item_rule(i), item_pos(i), list(item_la(i))), so_far);
                    }
                }
            }
            return Sort.sort(so_far, symbol_function($sym77$_), symbol_function(COMPACT_ITEMS_SORT_KEY));
        }
    }

    /**
     * expands a list of compact items into items
     */
    public static final SubLObject expand_citems(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject place = NIL;
            SubLObject citems = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            place = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            citems = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject items_var = make_symbol($str_alt80$items_var);
                    SubLObject la_var = make_symbol($str_alt81$la_var);
                    return list(CLET, list(bq_cons(items_var, $list_alt83), bq_cons(la_var, $list_alt83)), list(CDOLIST, list(CI, citems), listS(CSETQ, la_var, $list_alt87), list(PUNLESS, list(LISTP, la_var), list(CSETQ, la_var, list(LIST, la_var))), list(CDOLIST, list(LA, la_var), list(CPUSH, $list_alt93, items_var))), list(CSETF, place, items_var));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt79);
            }
        }
        return NIL;
    }

    public static final SubLObject subsumes_citems_every_subset_p(SubLObject set1, SubLObject set2) {
        if (set1.isList() && set2.isList()) {
            return subsetp(set1, set2, UNPROVIDED, UNPROVIDED);
        }
        if (set1.isList()) {
            return makeBoolean((set1.isCons() && (NIL == set1.rest())) && set1.first().equal(set2));
        }
        if (set2.isList()) {
            return makeBoolean((set2.isCons() && (NIL == set2.rest())) && set2.first().equal(set1));
        }
        return equal(set1, set2);
    }

    public static final SubLObject subsumes_citems_every(SubLObject ci1s, SubLObject ci2s) {
        {
            SubLObject sublist1 = ci1s;
            SubLObject sublist2 = ci2s;
            SubLObject ci1 = NIL;
            SubLObject ci2 = NIL;
            while ((NIL != sublist1) && (NIL != sublist2)) {
                ci1 = sublist1.first();
                ci2 = sublist2.first();
                if (!(((item_rule(ci1) == item_rule(ci2)) && item_pos(ci1).numE(item_pos(ci2))) && (NIL != subsumes_citems_every_subset_p(item_la(ci1), item_la(ci2))))) {
                    return NIL;
                }
                sublist1 = sublist1.rest();
                sublist2 = sublist2.rest();
            } 
        }
        return T;
    }

    /**
     * T if the sorted set of items ci2s subsumes the sorted set ci1s
     */
    public static final SubLObject subsumes_citems(SubLObject ci1s, SubLObject ci2s) {
        if (length(ci1s).numE(length(ci2s))) {
            return subsumes_citems_every(ci1s, ci2s);
        }
        return NIL;
    }

    public static final SubLObject merge_citems_union(SubLObject set1, SubLObject set2) {
        if (NIL != list(set1)) {
            if (NIL != list(set2)) {
                return union(set1, set2, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL != subl_promotions.memberP(set2, set1, UNPROVIDED, UNPROVIDED)) {
                    return copy_list(set1);
                } else {
                    return cons(set2, copy_list(set1));
                }
            }
        } else {
            if (NIL != list(set2)) {
                if (NIL != subl_promotions.memberP(set1, set2, UNPROVIDED, UNPROVIDED)) {
                    return copy_list(set2);
                } else {
                    return cons(set1, copy_list(set2));
                }
            } else {
                if (set1.equal(set2)) {
                    return set1;
                } else {
                    return list(set1, set2);
                }
            }
        }
    }

    /**
     * Adds the las of ci1s to ci2s.  ci2s should subsume ci1s
     */
    public static final SubLObject merge_citems(SubLObject ci1s, SubLObject ci2s) {
        {
            SubLObject sublist1 = ci1s;
            SubLObject sublist2 = ci2s;
            SubLObject ci1 = NIL;
            SubLObject ci2 = NIL;
            while ((NIL != sublist1) && (NIL != sublist2)) {
                ci1 = sublist1.first();
                ci2 = sublist2.first();
                _csetf_item_la(ci2, merge_citems_union(item_la(ci1), item_la(ci2)));
                sublist1 = sublist1.rest();
                sublist2 = sublist2.rest();
            } 
        }
        return ci2s;
    }

    public static final class $state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_lalr.$state_native.structDecl;
        }

        public SubLObject getField2() {
            return $name;
        }

        public SubLObject getField3() {
            return $citems;
        }

        public SubLObject getField4() {
            return $shifts;
        }

        public SubLObject getField5() {
            return $conflict;
        }

        public SubLObject setField2(SubLObject value) {
            return $name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $citems = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $shifts = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $conflict = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $citems = Lisp.NIL;

        public SubLObject $shifts = Lisp.NIL;

        public SubLObject $conflict = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_lalr.$state_native.class, STATE, STATE_P, $list_alt97, $list_alt98, new String[]{ "$name", "$citems", "$shifts", "$conflict" }, $list_alt99, $list_alt100, PRINT_STATE);
    }

    // defconstant
    public static final SubLSymbol $dtp_state$ = makeSymbol("*DTP-STATE*");

    public static final SubLObject state_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject state_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_lalr.$state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $state_p$UnaryFunction extends UnaryFunction {
        public $state_p$UnaryFunction() {
            super(extractFunctionNamed("STATE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return state_p(arg1);
        }
    }

    public static final SubLObject state_name(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.getField2();
    }

    public static final SubLObject state_citems(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.getField3();
    }

    public static final SubLObject state_shifts(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.getField4();
    }

    public static final SubLObject state_conflict(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_state_name(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_state_citems(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_state_shifts(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_state_conflict(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_lalr.$state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_state_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($CITEMS)) {
                            _csetf_state_citems(v_new, current_value);
                        } else
                            if (pcase_var.eql($SHIFTS)) {
                                _csetf_state_shifts(v_new, current_value);
                            } else
                                if (pcase_var.eql($CONFLICT)) {
                                    _csetf_state_conflict(v_new, current_value);
                                } else {
                                    Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_state(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt115$__STATE__name__S__citems__S__shif, new SubLObject[]{ state_name(v_object), state_citems(v_object), state_shifts(v_object), state_conflict(v_object) });
        return v_object;
    }

    public static final SubLObject create_state(SubLObject name, SubLObject citems, SubLObject shifts, SubLObject conflict) {
        {
            SubLObject new_state = make_state(UNPROVIDED);
            _csetf_state_name(new_state, name);
            _csetf_state_citems(new_state, citems);
            _csetf_state_shifts(new_state, shifts);
            _csetf_state_conflict(new_state, conflict);
            return new_state;
        }
    }

    public static final class $shift_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_lalr.$shift_native.structDecl;
        }

        public SubLObject getField2() {
            return $cat;
        }

        public SubLObject getField3() {
            return $where;
        }

        public SubLObject setField2(SubLObject value) {
            return $cat = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $where = value;
        }

        public SubLObject $cat = Lisp.NIL;

        public SubLObject $where = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_lalr.$shift_native.class, SHIFT, SHIFT_P, $list_alt118, $list_alt119, new String[]{ "$cat", "$where" }, $list_alt120, $list_alt121, PRINT_SHIFT);
    }

    // defconstant
    public static final SubLSymbol $dtp_shift$ = makeSymbol("*DTP-SHIFT*");

    public static final SubLObject shift_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_shift(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject shift_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_lalr.$shift_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $shift_p$UnaryFunction extends UnaryFunction {
        public $shift_p$UnaryFunction() {
            super(extractFunctionNamed("SHIFT-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return shift_p(arg1);
        }
    }

    public static final SubLObject shift_cat(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SHIFT_P);
        return v_object.getField2();
    }

    public static final SubLObject shift_where(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SHIFT_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_shift_cat(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SHIFT_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_shift_where(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SHIFT_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_shift(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_lalr.$shift_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CAT)) {
                        _csetf_shift_cat(v_new, current_value);
                    } else
                        if (pcase_var.eql($WHERE)) {
                            _csetf_shift_where(v_new, current_value);
                        } else {
                            Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_shift(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt130$__SHIFT__cat__S__where__S_, shift_cat(v_object), shift_where(v_object));
        return v_object;
    }

    public static final SubLObject create_shift(SubLObject cat, SubLObject where) {
        {
            SubLObject new_shift = make_shift(UNPROVIDED);
            _csetf_shift_cat(new_shift, cat);
            _csetf_shift_where(new_shift, where);
            return new_shift;
        }
    }

    public static final SubLObject describe_shift(SubLObject shift) {
        format(T, $str_alt131$__Shift__S_, shift);
        format(T, $str_alt132$____cat_____S, shift_cat(shift));
        format(T, $str_alt133$____where_____S, shift_where(shift));
        return shift;
    }

    // defparameter
    public static final SubLSymbol $next_state_no$ = makeSymbol("*NEXT-STATE-NO*");

    public static final SubLObject lalr_lookup_all_core_equal(SubLObject ci1s, SubLObject ci2s) {
        {
            SubLObject sublist1 = ci1s;
            SubLObject sublist2 = ci2s;
            SubLObject ci1 = NIL;
            SubLObject ci2 = NIL;
            while ((NIL != sublist1) && (NIL != sublist2)) {
                ci1 = sublist1.first();
                ci2 = sublist2.first();
                if (!((item_rule(ci1) == item_rule(ci2)) && item_pos(ci1).numE(item_pos(ci2)))) {
                    return NIL;
                }
                sublist1 = sublist1.rest();
                sublist2 = sublist2.rest();
            } 
        }
        return T;
    }

    /**
     * finds a state with the same core items as citems if it exits
     */
    public static final SubLObject lalr_lookup(SubLObject citems) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $state_list$.getDynamicValue(thread);
                SubLObject state = NIL;
                for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                    if ((NIL != cyblack_utilities.cyblack_lengthE(citems, state_citems(state))) && (NIL != lalr_lookup_all_core_equal(citems, state_citems(state)))) {
                        return state;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * creates a new state and adds it to the state list
     */
    public static final SubLObject add_state(SubLObject citems) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $next_state_no$.setDynamicValue(add($next_state_no$.getDynamicValue(thread), ONE_INTEGER), thread);
            {
                SubLObject new_state = create_state(intern(cconcatenate($str_alt134$STATE_, string_utilities.to_string($next_state_no$.getDynamicValue(thread))), UNPROVIDED), citems, NIL, NIL);
                $state_list$.setDynamicValue(cons(new_state, $state_list$.getDynamicValue(thread)), thread);
                return new_state;
            }
        }
    }

    /**
     * returns the state name for this set of items
     */
    public static final SubLObject get_state_name(SubLObject items) {
        {
            SubLObject citems = compact_items(items);
            SubLObject state = lalr_lookup(citems);
            if (NIL == state) {
                state = add_state(citems);
                build_state(state, items);
            } else
                if (NIL != subsumes_citems(citems, state_citems(state))) {
                } else {
                    merge_citems(citems, state_citems(state));
                    follow_state(items);
                }

            return state_name(state);
        }
    }

    /**
     * creates the states that this state can goto
     */
    public static final SubLObject build_state(SubLObject state, SubLObject items) {
        {
            SubLObject closure = close_items(items);
            SubLObject cdolist_list_var = items_right(closure);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                _csetf_state_shifts(state, cons(create_shift(cat, get_state_name(shift_items(closure, cat))), state_shifts(state)));
            }
        }
        return NIL;
    }

    /**
     * percolates look-ahead onto descendant states of this state
     */
    public static final SubLObject follow_state(SubLObject items) {
        {
            SubLObject closure = close_items(items);
            SubLObject cdolist_list_var = items_right(closure);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                get_state_name(shift_items(closure, cat));
            }
        }
        return NIL;
    }

    /**
     * Actually builds the table
     */
    public static final SubLObject build_table() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $state_list$.setDynamicValue(NIL, thread);
            $next_state_no$.setDynamicValue(MINUS_ONE_INTEGER, thread);
            get_state_name(list(create_item(create_lalr_rule(ZERO_INTEGER, $topcat$.getDynamicValue(thread), list($gstart$.getDynamicValue(thread)), NIL), ZERO_INTEGER, $end_marker$.getDynamicValue(thread))));
            $state_list$.setDynamicValue(nreverse($state_list$.getDynamicValue(thread)), thread);
            return $state_list$.getDynamicValue(thread);
        }
    }

    /**
     * Prints the state table
     */
    public static final SubLObject print_table(SubLObject state_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $state_list$.currentBinding(thread);
                try {
                    $state_list$.bind(state_list, thread);
                    {
                        SubLObject cdolist_list_var = $state_list$.getDynamicValue(thread);
                        SubLObject state = NIL;
                        for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                            format(T, $str_alt135$_____a_, state_name(state));
                            {
                                SubLObject cdolist_list_var_5 = state_citems(state);
                                SubLObject citem = NIL;
                                for (citem = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , citem = cdolist_list_var_5.first()) {
                                    format(T, $str_alt136$_____a________a________a_______a_, new SubLObject[]{ lalr_rule_mother(item_rule(citem)), subseq(lalr_rule_daughters(item_rule(citem)), ZERO_INTEGER, item_pos(citem)), subseq(lalr_rule_daughters(item_rule(citem)), item_pos(citem), UNPROVIDED), item_la(citem) });
                                }
                            }
                            {
                                SubLObject cdolist_list_var_6 = state_shifts(state);
                                SubLObject shift = NIL;
                                for (shift = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , shift = cdolist_list_var_6.first()) {
                                    format(T, $str_alt137$______On__a_shift__a, shift_cat(shift), shift_where(shift));
                                }
                            }
                            {
                                SubLObject filtered_items = NIL;
                                SubLObject expanded_citems = NIL;
                                {
                                    SubLObject items_var = NIL;
                                    SubLObject la_var = NIL;
                                    SubLObject cdolist_list_var_7 = state_citems(state);
                                    SubLObject ci = NIL;
                                    for (ci = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , ci = cdolist_list_var_7.first()) {
                                        la_var = item_la(ci);
                                        if (!la_var.isList()) {
                                            la_var = list(la_var);
                                        }
                                        {
                                            SubLObject cdolist_list_var_8 = la_var;
                                            SubLObject la = NIL;
                                            for (la = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , la = cdolist_list_var_8.first()) {
                                                items_var = cons(create_item(item_rule(ci), item_pos(ci), la), items_var);
                                            }
                                        }
                                    }
                                    expanded_citems = items_var;
                                }
                                {
                                    SubLObject list_expression = close_items(expanded_citems);
                                    if (NIL == list_expression) {
                                        filtered_items = NIL;
                                    } else
                                        if (list_expression.isAtom()) {
                                            filtered_items = list(list_expression);
                                        } else
                                            if (NIL == list_expression.rest()) {
                                                {
                                                    SubLObject item = list_expression.first();
                                                    filtered_items = (NIL != nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item)))) ? ((SubLObject) (NIL)) : list(item);
                                                }
                                            } else {
                                                {
                                                    SubLObject tail_cons = NIL;
                                                    SubLObject result = NIL;
                                                    filtered_items = NIL;
                                                    {
                                                        SubLObject cdolist_list_var_9 = list_expression;
                                                        SubLObject item = NIL;
                                                        for (item = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , item = cdolist_list_var_9.first()) {
                                                            result = (NIL != nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item)))) ? ((SubLObject) (NIL)) : list(item);
                                                            if (NIL != result) {
                                                                if (NIL != tail_cons) {
                                                                    rplacd(tail_cons, result);
                                                                    tail_cons = last(result, UNPROVIDED);
                                                                } else {
                                                                    filtered_items = (NIL != nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item)))) ? ((SubLObject) (NIL)) : list(item);
                                                                    tail_cons = last(filtered_items, UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }


                                }
                                {
                                    SubLObject cdolist_list_var_10 = filtered_items;
                                    SubLObject reduce = NIL;
                                    for (reduce = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , reduce = cdolist_list_var_10.first()) {
                                        format(T, $str_alt138$______On____a___reduce____a______, new SubLObject[]{ item_la(reduce), lalr_rule_daughters(item_rule(reduce)), lalr_rule_mother(item_rule(reduce)) });
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    $state_list$.rebind(_prev_bind_0, thread);
                }
            }
            format(T, $str_alt38$__);
            return NIL;
        }
    }

    public static final SubLObject create_symbols_so_far_ref(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject symbols_so_far = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt139);
            symbols_so_far = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(LIST, symbols_so_far);
            } else {
                cdestructuring_bind_error(datum, $list_alt139);
            }
        }
        return NIL;
    }

    public static final SubLObject symbols_so_far_ref_deref(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject symbols_so_far_ref = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt140);
            symbols_so_far_ref = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAR, symbols_so_far_ref);
            } else {
                cdestructuring_bind_error(datum, $list_alt140);
            }
        }
        return NIL;
    }

    public static final SubLObject symbols_so_far_ref_push(SubLObject symbol, SubLObject symbols_so_far_ref) {
        rplaca(symbols_so_far_ref, cons(symbol, symbols_so_far_ref.first()));
        return symbols_so_far_ref;
    }

    public static final SubLObject translate_state_translate_shift(SubLObject state, SubLObject shift, SubLObject symbols_so_far_ref) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            symbols_so_far_ref_push(shift_cat(shift), symbols_so_far_ref);
            return bq_cons(shift_cat(shift), append(NIL != $lalr_debug$.getDynamicValue(thread) ? ((SubLObject) (list(list(PWHEN, $lalr_debug$, list(PRINC, format(NIL, $str_alt145$__Shift__a_to__a__, shift_cat(shift), shift_where(shift))))))) : NIL, list(list(SHIFT_FROM, SELF, list(QUOTE, state_name(state))), list(RET, bq_cons(shift_where(shift), $list_alt149)))));
        }
    }

    public static final SubLObject translate_state_translate_reduce_intersection(SubLObject set1, SubLObject set2) {
        if (set1.isList()) {
            if (set2.isList()) {
                return intersection(set1, set2, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL != subl_promotions.memberP(set2, set1, UNPROVIDED, UNPROVIDED)) {
                    return set2;
                } else {
                    return NIL;
                }
            }
        } else {
            if (set2.isList()) {
                if (NIL != subl_promotions.memberP(set1, set2, UNPROVIDED, UNPROVIDED)) {
                    return set1;
                } else {
                    return NIL;
                }
            } else {
                if (set1.equal(set2)) {
                    return set1;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject translate_state_translate_reduce(SubLObject state, SubLObject item, SubLObject symbols_so_far_ref) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != translate_state_translate_reduce_intersection(item_la(item), symbols_so_far_ref.first())) {
                _csetf_item_la(item, set_difference(item_la(item), symbols_so_far_ref.first(), UNPROVIDED, UNPROVIDED));
            }
            {
                SubLObject cdolist_list_var = item_la(item);
                SubLObject la = NIL;
                for (la = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , la = cdolist_list_var.first()) {
                    symbols_so_far_ref_push(la, symbols_so_far_ref);
                }
            }
            return bq_cons(item_la(item), append(NIL != $lalr_debug$.getDynamicValue(thread) ? ((SubLObject) (list(list(PWHEN, $lalr_debug$, list(PRINC, format(NIL, $str_alt150$Reduce____a_________a__, lalr_rule_daughters(item_rule(item)), lalr_rule_mother(item_rule(item)))))))) : NIL, list(list(RET, list(REDUCE_CAT, SELF, list(QUOTE, state_name(state)), list(QUOTE, lalr_rule_mother(item_rule(item))), item_pos(item), list(QUOTE, lalr_rule_method_name(item_rule(item))))))));
        }
    }

    /**
     * translates a state into lisp code that could appear in a labels form
     */
    public static final SubLObject translate_state(SubLObject state, SubLObject class_name) {
        {
            SubLObject reduces = NIL;
            SubLObject expanded_citems = NIL;
            SubLObject symbols_so_far_ref = list(NIL);
            SubLObject translate_shifts = NIL;
            SubLObject translate_reduces = NIL;
            {
                SubLObject items_var = NIL;
                SubLObject la_var = NIL;
                SubLObject cdolist_list_var = state_citems(state);
                SubLObject ci = NIL;
                for (ci = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ci = cdolist_list_var.first()) {
                    la_var = item_la(ci);
                    if (!la_var.isList()) {
                        la_var = list(la_var);
                    }
                    {
                        SubLObject cdolist_list_var_11 = la_var;
                        SubLObject la = NIL;
                        for (la = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , la = cdolist_list_var_11.first()) {
                            items_var = cons(create_item(item_rule(ci), item_pos(ci), la), items_var);
                        }
                    }
                }
                expanded_citems = items_var;
            }
            {
                SubLObject list_expression = close_items(expanded_citems);
                if (NIL == list_expression) {
                    reduces = NIL;
                } else
                    if (list_expression.isAtom()) {
                        reduces = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject item = list_expression.first();
                                reduces = (NIL != nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item)))) ? ((SubLObject) (NIL)) : list(item);
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                reduces = NIL;
                                {
                                    SubLObject cdolist_list_var = list_expression;
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                        result = (NIL != nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item)))) ? ((SubLObject) (NIL)) : list(item);
                                        if (NIL != result) {
                                            if (NIL != tail_cons) {
                                                rplacd(tail_cons, result);
                                                tail_cons = last(result, UNPROVIDED);
                                            } else {
                                                reduces = (NIL != nthcdr(item_pos(item), lalr_rule_daughters(item_rule(item)))) ? ((SubLObject) (NIL)) : list(item);
                                                tail_cons = last(reduces, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }


            }
            reduces = compact_items(reduces);
            {
                SubLObject list_expression = state_shifts(state);
                if (NIL == list_expression) {
                    translate_shifts = NIL;
                } else
                    if (list_expression.isAtom()) {
                        translate_shifts = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject shift = list_expression.first();
                                translate_shifts = list(translate_state_translate_shift(state, shift, symbols_so_far_ref));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject shift = list_expression.first();
                                    translate_shifts = list(translate_state_translate_shift(state, shift, symbols_so_far_ref));
                                    tail_cons = translate_shifts;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject shift = NIL;
                                    for (shift = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , shift = cdolist_list_var.first()) {
                                        result = list(translate_state_translate_shift(state, shift, symbols_so_far_ref));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


            }
            {
                SubLObject list_expression = reduces;
                if (NIL == list_expression) {
                    translate_reduces = NIL;
                } else
                    if (list_expression.isAtom()) {
                        translate_reduces = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject item = list_expression.first();
                                translate_reduces = list(translate_state_translate_reduce(state, item, symbols_so_far_ref));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject item = list_expression.first();
                                    translate_reduces = list(translate_state_translate_reduce(state, item, symbols_so_far_ref));
                                    tail_cons = translate_reduces;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject item = NIL;
                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                        result = list(translate_state_translate_reduce(state, item, symbols_so_far_ref));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


            }
            return list(DEF_INSTANCE_METHOD, listS(state_name(state), class_name, $list_alt152), NIL, listS(PCASE, $list_alt154, append(translate_shifts, translate_reduces, $list_alt155)));
        }
    }

    public static final SubLObject get_lalr_parser_top_cat(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, EIGHT_INTEGER, TOP_CAT);
    }

    public static final SubLObject set_lalr_parser_top_cat(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, EIGHT_INTEGER, TOP_CAT);
    }

    public static final SubLObject get_lalr_parser_state_stack(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, SEVEN_INTEGER, STATE_STACK);
    }

    public static final SubLObject set_lalr_parser_state_stack(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, SEVEN_INTEGER, STATE_STACK);
    }

    public static final SubLObject get_lalr_parser_val_stack(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, SIX_INTEGER, VAL_STACK);
    }

    public static final SubLObject set_lalr_parser_val_stack(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, SIX_INTEGER, VAL_STACK);
    }

    public static final SubLObject get_lalr_parser_val_la(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, FIVE_INTEGER, VAL_LA);
    }

    public static final SubLObject set_lalr_parser_val_la(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, FIVE_INTEGER, VAL_LA);
    }

    public static final SubLObject get_lalr_parser_cat_la(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, FOUR_INTEGER, CAT_LA);
    }

    public static final SubLObject set_lalr_parser_cat_la(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, FOUR_INTEGER, CAT_LA);
    }

    public static final SubLObject get_lalr_parser_parser_name(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, THREE_INTEGER, PARSER_NAME);
    }

    public static final SubLObject set_lalr_parser_parser_name(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, THREE_INTEGER, PARSER_NAME);
    }

    public static final SubLObject get_lalr_parser_lexforms(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, TWO_INTEGER, LEXFORMS);
    }

    public static final SubLObject set_lalr_parser_lexforms(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, TWO_INTEGER, LEXFORMS);
    }

    public static final SubLObject get_lalr_parser_lexicon(SubLObject lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(lalr_parser, ONE_INTEGER, LEXICON);
    }

    public static final SubLObject set_lalr_parser_lexicon(SubLObject lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lalr_parser, value, ONE_INTEGER, LEXICON);
    }

    public static final SubLObject subloop_reserved_initialize_lalr_parser_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_lalr_parser_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, LEXFORMS, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, PARSER_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, CAT_LA, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, VAL_LA, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, VAL_STACK, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, STATE_STACK, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, TOP_CAT, NIL);
        return NIL;
    }

    public static final SubLObject lalr_parser_p(SubLObject lalr_parser) {
        return classes.subloop_instanceof_class(lalr_parser, LALR_PARSER);
    }

    public static final SubLObject lalr_parser_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject top_cat = get_lalr_parser_top_cat(self);
            SubLObject parser_name = get_lalr_parser_parser_name(self);
            try {
                try {
                    object.object_initialize_method(self);
                    parser_name = NIL;
                    lalr_parser_clear_method(self);
                    top_cat = NIL;
                    sublisp_throw($sym175$OUTER_CATCH_FOR_LALR_PARSER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_top_cat(self, top_cat);
                            set_lalr_parser_parser_name(self, parser_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_clear_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject state_stack = get_lalr_parser_state_stack(self);
            SubLObject val_stack = get_lalr_parser_val_stack(self);
            SubLObject val_la = get_lalr_parser_val_la(self);
            SubLObject cat_la = get_lalr_parser_cat_la(self);
            try {
                try {
                    cat_la = NIL;
                    val_la = NIL;
                    val_stack = NIL;
                    state_stack = NIL;
                    sublisp_throw($sym179$OUTER_CATCH_FOR_LALR_PARSER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_state_stack(self, state_stack);
                            set_lalr_parser_val_stack(self, val_stack);
                            set_lalr_parser_val_la(self, val_la);
                            set_lalr_parser_cat_la(self, cat_la);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym179$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_lexicon_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject lexicon = get_lalr_parser_lexicon(self);
            try {
                try {
                    sublisp_throw($sym184$OUTER_CATCH_FOR_LALR_PARSER_METHOD, lexicon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_lexicon(self, lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym184$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_lexicon_method(SubLObject self, SubLObject new_lexicon) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject lexicon = get_lalr_parser_lexicon(self);
            try {
                try {
                    lexicon = copy_tree(new_lexicon);
                    sublisp_throw($sym189$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_lexicon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_lexicon(self, lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym189$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_lexforms_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject lexforms = get_lalr_parser_lexforms(self);
            try {
                try {
                    sublisp_throw($sym194$OUTER_CATCH_FOR_LALR_PARSER_METHOD, lexforms);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_lexforms(self, lexforms);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_lexforms_method(SubLObject self, SubLObject new_lexforms) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject lexforms = get_lalr_parser_lexforms(self);
            try {
                try {
                    lexforms = copy_list(new_lexforms);
                    sublisp_throw($sym199$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_lexforms);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_lexforms(self, lexforms);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym199$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_parser_name_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject parser_name = get_lalr_parser_parser_name(self);
            try {
                try {
                    sublisp_throw($sym203$OUTER_CATCH_FOR_LALR_PARSER_METHOD, parser_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_parser_name(self, parser_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym203$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_parser_name_method(SubLObject self, SubLObject new_parser_name) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject parser_name = get_lalr_parser_parser_name(self);
            try {
                try {
                    parser_name = new_parser_name;
                    sublisp_throw($sym208$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_parser_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_parser_name(self, parser_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym208$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_cat_la_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject cat_la = get_lalr_parser_cat_la(self);
            try {
                try {
                    sublisp_throw($sym212$OUTER_CATCH_FOR_LALR_PARSER_METHOD, cat_la);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_cat_la(self, cat_la);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym212$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_cat_la_method(SubLObject self, SubLObject new_cat_la) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject cat_la = get_lalr_parser_cat_la(self);
            try {
                try {
                    cat_la = new_cat_la;
                    sublisp_throw($sym217$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_cat_la);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_cat_la(self, cat_la);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym217$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_val_la_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_la = get_lalr_parser_val_la(self);
            try {
                try {
                    sublisp_throw($sym221$OUTER_CATCH_FOR_LALR_PARSER_METHOD, val_la);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_la(self, val_la);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_val_la_method(SubLObject self, SubLObject new_val_la) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_la = get_lalr_parser_val_la(self);
            try {
                try {
                    val_la = new_val_la;
                    sublisp_throw($sym226$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_val_la);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_la(self, val_la);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym226$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_val_stack_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_stack = get_lalr_parser_val_stack(self);
            try {
                try {
                    sublisp_throw($sym230$OUTER_CATCH_FOR_LALR_PARSER_METHOD, val_stack);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_stack(self, val_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym230$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_val_stack_method(SubLObject self, SubLObject new_val_stack) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_stack = get_lalr_parser_val_stack(self);
            try {
                try {
                    val_stack = new_val_stack;
                    sublisp_throw($sym235$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_val_stack);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_stack(self, val_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym235$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_val_stack_push_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_stack = get_lalr_parser_val_stack(self);
            try {
                try {
                    val_stack = cons(new_value, val_stack);
                    sublisp_throw($sym240$OUTER_CATCH_FOR_LALR_PARSER_METHOD, val_stack);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_stack(self, val_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_val_stack_pop_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_stack = get_lalr_parser_val_stack(self);
            try {
                try {
                    if (NIL != val_stack) {
                        {
                            SubLObject top_value = val_stack.first();
                            val_stack = val_stack.rest();
                            sublisp_throw($sym244$OUTER_CATCH_FOR_LALR_PARSER_METHOD, top_value);
                        }
                    }
                    sublisp_throw($sym244$OUTER_CATCH_FOR_LALR_PARSER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_stack(self, val_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym244$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_state_stack_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject state_stack = get_lalr_parser_state_stack(self);
            try {
                try {
                    sublisp_throw($sym248$OUTER_CATCH_FOR_LALR_PARSER_METHOD, state_stack);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_state_stack(self, state_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym248$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_state_stack_method(SubLObject self, SubLObject new_state_stack) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject state_stack = get_lalr_parser_state_stack(self);
            try {
                try {
                    state_stack = new_state_stack;
                    sublisp_throw($sym253$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_state_stack);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_state_stack(self, state_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym253$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_state_stack_push_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject state_stack = get_lalr_parser_state_stack(self);
            try {
                try {
                    state_stack = cons(new_value, state_stack);
                    sublisp_throw($sym257$OUTER_CATCH_FOR_LALR_PARSER_METHOD, state_stack);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_state_stack(self, state_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym257$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_state_stack_pop_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject state_stack = get_lalr_parser_state_stack(self);
            try {
                try {
                    if (NIL != state_stack) {
                        {
                            SubLObject top_value = state_stack.first();
                            state_stack = state_stack.rest();
                            sublisp_throw($sym261$OUTER_CATCH_FOR_LALR_PARSER_METHOD, top_value);
                        }
                    }
                    sublisp_throw($sym261$OUTER_CATCH_FOR_LALR_PARSER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_state_stack(self, state_stack);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_get_top_cat_method(SubLObject self) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject top_cat = get_lalr_parser_top_cat(self);
            try {
                try {
                    sublisp_throw($sym265$OUTER_CATCH_FOR_LALR_PARSER_METHOD, top_cat);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_top_cat(self, top_cat);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_set_top_cat_method(SubLObject self, SubLObject new_top_cat) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject top_cat = get_lalr_parser_top_cat(self);
            try {
                try {
                    top_cat = new_top_cat;
                    sublisp_throw($sym270$OUTER_CATCH_FOR_LALR_PARSER_METHOD, new_top_cat);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_top_cat(self, top_cat);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_next_input_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject lalr_parser_parse_error_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject lalr_parser_input_peek_method(SubLObject self) {
        if (NIL == lalr_parser_get_cat_la_method(self)) {
            {
                SubLObject v_new = methods.funcall_instance_method_with_0_args(self, NEXT_INPUT);
                lalr_parser_set_cat_la_method(self, list(v_new.first()));
                lalr_parser_set_val_la_method(self, list(v_new.rest()));
            }
        }
        return lalr_parser_get_cat_la_method(self).first();
    }

    public static final SubLObject lalr_parser_shift_from_method(SubLObject self, SubLObject name) {
        {
            SubLObject catch_var_for_lalr_parser_method = NIL;
            SubLObject val_la = get_lalr_parser_val_la(self);
            SubLObject cat_la = get_lalr_parser_cat_la(self);
            try {
                try {
                    lalr_parser_state_stack_push_method(self, name);
                    cat_la = cat_la.rest();
                    {
                        SubLObject top_val = val_la.first();
                        val_la = val_la.rest();
                        sublisp_throw($sym282$OUTER_CATCH_FOR_LALR_PARSER_METHOD, lalr_parser_val_stack_push_method(self, top_val));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_lalr_parser_val_la(self, val_la);
                            set_lalr_parser_cat_la(self, cat_la);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_LALR_PARSER_METHOD);
            }
            return catch_var_for_lalr_parser_method;
        }
    }

    public static final SubLObject lalr_parser_reduce_cat_method(SubLObject self, SubLObject name, SubLObject cat, SubLObject ndaughters, SubLObject action) {
        if (cat == lalr_parser_get_top_cat_method(self)) {
            return lalr_parser_val_stack_pop_method(self);
        } else {
            {
                SubLObject daughter_values = NIL;
                SubLObject state = name;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(ndaughters); i = add(i, ONE_INTEGER)) {
                    daughter_values = cons(lalr_parser_val_stack_pop_method(self), daughter_values);
                    state = lalr_parser_state_stack_pop_method(self);
                }
                lalr_parser_set_cat_la_method(self, cons(cat, lalr_parser_get_cat_la_method(self)));
                lalr_parser_set_val_la_method(self, cons(classes_utilities.apply_instance_method(self, action, daughter_values), lalr_parser_get_val_la_method(self)));
                return methods.funcall_instance_method_with_0_args(self, state);
            }
        }
    }

    public static final SubLObject lalr_parser_parse_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_cyblack_lalr_parser_lexifier(SubLObject cyblack_lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_lalr_parser, ELEVEN_INTEGER, LEXIFIER);
    }

    public static final SubLObject set_cyblack_lalr_parser_lexifier(SubLObject cyblack_lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_lalr_parser, value, ELEVEN_INTEGER, LEXIFIER);
    }

    public static final SubLObject get_cyblack_lalr_parser_current_token(SubLObject cyblack_lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_lalr_parser, TEN_INTEGER, CURRENT_TOKEN);
    }

    public static final SubLObject set_cyblack_lalr_parser_current_token(SubLObject cyblack_lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_lalr_parser, value, TEN_INTEGER, CURRENT_TOKEN);
    }

    public static final SubLObject get_cyblack_lalr_parser_tokens(SubLObject cyblack_lalr_parser) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_lalr_parser, NINE_INTEGER, TOKENS);
    }

    public static final SubLObject set_cyblack_lalr_parser_tokens(SubLObject cyblack_lalr_parser, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_lalr_parser, value, NINE_INTEGER, TOKENS);
    }

    public static final SubLObject get_cyblack_lalr_parser_opened_p(SubLObject cyblack_lalr_parser) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_lalr_parser);
            SubLObject slot = slots.slot_assoc(OPENED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_lalr_parser, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_lalr_parser));
    }

    public static final SubLObject set_cyblack_lalr_parser_opened_p(SubLObject cyblack_lalr_parser, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_lalr_parser);
            SubLObject slot = slots.slot_assoc(OPENED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_lalr_parser, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_lalr_parser, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_lalr_parser)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_lalr_parser_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_lalr_parser_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LALR_PARSER, OPENED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, LEXFORMS, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, PARSER_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, CAT_LA, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, VAL_LA, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, VAL_STACK, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, STATE_STACK, NIL);
        classes.subloop_initialize_slot(new_instance, LALR_PARSER, TOP_CAT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LALR_PARSER, TOKENS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LALR_PARSER, CURRENT_TOKEN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LALR_PARSER, LEXIFIER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_lalr_parser_p(SubLObject cyblack_lalr_parser) {
        return classes.subloop_instanceof_class(cyblack_lalr_parser, CYBLACK_LALR_PARSER);
    }

    public static final SubLObject cyblack_lalr_parser_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
            SubLObject current_token = get_cyblack_lalr_parser_current_token(self);
            SubLObject tokens = get_cyblack_lalr_parser_tokens(self);
            SubLObject opened_p = get_cyblack_lalr_parser_opened_p(self);
            try {
                try {
                    lalr_parser_initialize_method(self);
                    tokens = NIL;
                    current_token = NIL;
                    opened_p = NIL;
                    sublisp_throw($sym299$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_lalr_parser_current_token(self, current_token);
                            set_cyblack_lalr_parser_tokens(self, tokens);
                            set_cyblack_lalr_parser_opened_p(self, opened_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym299$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
            }
            return catch_var_for_cyblack_lalr_parser_method;
        }
    }

    public static final SubLObject cyblack_lalr_parser_get_tokens_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
            SubLObject tokens = get_cyblack_lalr_parser_tokens(self);
            try {
                try {
                    sublisp_throw($sym303$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, tokens);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_lalr_parser_tokens(self, tokens);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym303$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
            }
            return catch_var_for_cyblack_lalr_parser_method;
        }
    }

    public static final SubLObject cyblack_lalr_parser_set_tokens_method(SubLObject self, SubLObject new_tokens) {
        {
            SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
            SubLObject tokens = get_cyblack_lalr_parser_tokens(self);
            try {
                try {
                    tokens = copy_list(new_tokens);
                    sublisp_throw($sym308$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, new_tokens);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_lalr_parser_tokens(self, tokens);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
            }
            return catch_var_for_cyblack_lalr_parser_method;
        }
    }

    public static final SubLObject cyblack_lalr_parser_get_current_token_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
            SubLObject current_token = get_cyblack_lalr_parser_current_token(self);
            try {
                try {
                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, current_token);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_lalr_parser_current_token(self, current_token);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym312$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
            }
            return catch_var_for_cyblack_lalr_parser_method;
        }
    }

    public static final SubLObject cyblack_lalr_parser_set_current_token_method(SubLObject self, SubLObject new_token) {
        {
            SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
            SubLObject current_token = get_cyblack_lalr_parser_current_token(self);
            try {
                try {
                    current_token = new_token;
                    sublisp_throw($sym317$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, new_token);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_lalr_parser_current_token(self, current_token);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
            }
            return catch_var_for_cyblack_lalr_parser_method;
        }
    }

    public static final SubLObject cyblack_lalr_parser_get_lexifier_method(SubLObject self) {
        {
            SubLObject lexifier = get_cyblack_lalr_parser_lexifier(self);
            return lexifier;
        }
    }

    public static final SubLObject cyblack_lalr_parser_set_lexifier_method(SubLObject self, SubLObject new_lexifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
                SubLObject lexifier = get_cyblack_lalr_parser_lexifier(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_lexifier) || (NIL != cyblack_lexifier.cyblack_lexifier_p(new_lexifier)))) {
                                Errors.error($str_alt327$_SET_LEXIFIER__S____S_is_not_an_i, self, new_lexifier);
                            }
                        }
                        lexifier = new_lexifier;
                        sublisp_throw($sym326$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, new_lexifier);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_lalr_parser_lexifier(self, lexifier);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym326$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
                }
                return catch_var_for_cyblack_lalr_parser_method;
            }
        }
    }

    public static final SubLObject cyblack_lalr_parser_next_input_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
                SubLObject lexifier = get_cyblack_lalr_parser_lexifier(self);
                SubLObject current_token = get_cyblack_lalr_parser_current_token(self);
                SubLObject tokens = get_cyblack_lalr_parser_tokens(self);
                SubLObject lexicon = get_lalr_parser_lexicon(self);
                SubLObject opened_p = get_cyblack_lalr_parser_opened_p(self);
                try {
                    try {
                        if (NIL != lexifier) {
                            if (NIL == opened_p) {
                                methods.funcall_instance_method_with_0_args(lexifier, OPEN_SOURCE);
                                opened_p = T;
                            }
                            {
                                SubLObject lexeme = methods.funcall_instance_method_with_0_args(lexifier, GET_LEXEME);
                                if (NIL == lexeme) {
                                    current_token = NIL;
                                    methods.funcall_instance_method_with_0_args(lexifier, CLOSE_SOURCE);
                                    opened_p = NIL;
                                    sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, NIL);
                                }
                                current_token = methods.funcall_instance_method_with_0_args(lexeme, GET_TOKEN);
                                {
                                    SubLObject category = methods.funcall_instance_method_with_0_args(lexeme, GET_CATEGORY);
                                    sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, cons(category, list(category, current_token)));
                                }
                            }
                        } else {
                            if (NIL == tokens) {
                                current_token = NIL;
                                sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, NIL);
                            }
                            current_token = tokens.first();
                            tokens = tokens.rest();
                            {
                                SubLObject association = assoc(current_token, lexicon, UNPROVIDED, UNPROVIDED);
                                SubLObject category = (NIL != association) ? ((SubLObject) (cadr(association))) : NIL;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == category) {
                                        Errors.error($str_alt336$_NEXT_INPUT__S___Could_find_no_le, current_token);
                                    }
                                }
                                {
                                    SubLObject result = cons(category, list(category, current_token));
                                    sublisp_throw($sym330$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, result);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_lalr_parser_lexifier(self, lexifier);
                                set_cyblack_lalr_parser_current_token(self, current_token);
                                set_cyblack_lalr_parser_tokens(self, tokens);
                                set_lalr_parser_lexicon(self, lexicon);
                                set_cyblack_lalr_parser_opened_p(self, opened_p);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym330$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
                }
                return catch_var_for_cyblack_lalr_parser_method;
            }
        }
    }

    public static final SubLObject cyblack_lalr_parser_parse_error_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_lalr_parser_method = NIL;
            SubLObject current_token = get_cyblack_lalr_parser_current_token(self);
            try {
                try {
                    sublisp_throw($sym338$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD, current_token);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_lalr_parser_current_token(self, current_token);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_lalr_parser_method = Errors.handleThrowable(ccatch_env_var, $sym338$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD);
            }
            return catch_var_for_cyblack_lalr_parser_method;
        }
    }

    /**
     * returns an lalr(1) parser.  next-input must return 2 values!
     */
    public static final SubLObject build_parser(SubLObject parser_class, SubLObject super_class, SubLObject top_category, SubLObject lex, SubLObject lexifier, SubLObject state_list, SubLObject lexicon_table) {
        if (lexicon_table == UNPROVIDED) {
            lexicon_table = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $state_list$.currentBinding(thread);
                    try {
                        $state_list$.bind(state_list, thread);
                        {
                            SubLObject additional_method_defns = NIL;
                            SubLObject additional_method_decls = NIL;
                            SubLObject transformation_defns = NIL;
                            SubLObject transformation_decls = NIL;
                            SubLObject v_parser = NIL;
                            SubLObject list_expression = state_list;
                            if (NIL == list_expression) {
                                additional_method_defns = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    additional_method_defns = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject state = list_expression.first();
                                            additional_method_defns = list(translate_state(state, parser_class));
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result_12 = NIL;
                                            {
                                                SubLObject state = list_expression.first();
                                                additional_method_defns = list(translate_state(state, parser_class));
                                                tail_cons = additional_method_defns;
                                            }
                                            {
                                                SubLObject cdolist_list_var = list_expression.rest();
                                                SubLObject state = NIL;
                                                for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                                                    result_12 = list(translate_state(state, parser_class));
                                                    rplacd(tail_cons, result_12);
                                                    tail_cons = result_12;
                                                }
                                            }
                                        }
                                    }


                            {
                                SubLObject cdolist_list_var = additional_method_defns;
                                SubLObject method_defn = NIL;
                                for (method_defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method_defn = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = method_defn;
                                        SubLObject current = datum;
                                        SubLObject defsymbol = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt340);
                                        defsymbol = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt340);
                                        {
                                            SubLObject temp = current.rest();
                                            current = current.first();
                                            {
                                                SubLObject method_name = NIL;
                                                SubLObject class_name = NIL;
                                                SubLObject options = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt340);
                                                method_name = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt340);
                                                class_name = current.first();
                                                current = current.rest();
                                                options = current;
                                                current = temp;
                                                {
                                                    SubLObject lambda_list = NIL;
                                                    SubLObject body = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt340);
                                                    lambda_list = current.first();
                                                    current = current.rest();
                                                    body = current;
                                                    additional_method_decls = cons(listS(defsymbol, method_name, lambda_list, append(options, NIL)), additional_method_decls);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            additional_method_decls = nreverse(additional_method_decls);
                            {
                                SubLObject cdolist_list_var = $grules$.getDynamicValue(thread);
                                SubLObject rule = NIL;
                                for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                    if (NIL != lalr_rule_method_name(rule)) {
                                        {
                                            SubLObject datum = lalr_rule_method_defn(rule);
                                            SubLObject current = datum;
                                            SubLObject defsymbol = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt340);
                                            defsymbol = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt340);
                                            {
                                                SubLObject temp = current.rest();
                                                current = current.first();
                                                {
                                                    SubLObject method_name = NIL;
                                                    SubLObject class_name = NIL;
                                                    SubLObject options = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt340);
                                                    method_name = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt340);
                                                    class_name = current.first();
                                                    current = current.rest();
                                                    options = current;
                                                    current = temp;
                                                    {
                                                        SubLObject lambda_list = NIL;
                                                        SubLObject body = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list_alt340);
                                                        lambda_list = current.first();
                                                        current = current.rest();
                                                        body = current;
                                                        transformation_decls = cons(listS(defsymbol, method_name, lambda_list, $list_alt173), transformation_decls);
                                                        transformation_defns = cons(lalr_rule_method_defn(rule), transformation_defns);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            transformation_decls = nreverse(transformation_decls);
                            transformation_defns = nreverse(transformation_defns);
                            if (super_class == CYBLACK_LALR_PARSER) {
                                if (NIL != lexifier) {
                                    v_parser = list(DEF_INSTANCE_METHOD, listS(PARSE, parser_class, $list_alt341), NIL, $list_alt342, list(RET, bq_cons(state_name(state_list.first()), $list_alt149)));
                                } else {
                                    v_parser = list(DEF_INSTANCE_METHOD, listS(PARSE, parser_class, $list_alt341), $list_alt306, $list_alt342, $list_alt343, list(RET, bq_cons(state_name(state_list.first()), $list_alt149)));
                                }
                            } else {
                                v_parser = list(DEF_INSTANCE_METHOD, listS(PARSE, parser_class, $list_alt341), NIL, $list_alt342, list(RET, bq_cons(state_name(state_list.first()), $list_alt149)));
                            }
                            result = listS(PROGN, listS(DEFINE_CLASS, list(parser_class, $EXTENDS, super_class), $list_alt347, append(additional_method_decls, transformation_decls, $list_alt348)), listS(DEF_INSTANCE_METHOD, new SubLObject[]{ listS(INITIALIZE, parser_class, $list_alt173), NIL, $list_alt349, list(CSETQ, TOP_CAT, list(QUOTE, top_category)), list(CSETQ, LEXICON, list(COPY_TREE, list(QUOTE, lexicon_table))), list(CSETQ, LEXFORMS, list(COPY_LIST, list(QUOTE, lex))), listS(CSETQ, LEXIFIER, append(NIL != lexifier ? ((SubLObject) (list(list(NEW_CLASS_INSTANCE, list(QUOTE, lexifier))))) : $list_alt83, NIL)), $list_alt353 }), append(additional_method_defns, transformation_defns, list(v_parser)));
                        }
                    } finally {
                        $state_list$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $cyblack_lalr_grammar$ = makeSymbol("*CYBLACK-LALR-GRAMMAR*");

    // defparameter
    public static final SubLSymbol $cyblack_lalr_lexforms$ = makeSymbol("*CYBLACK-LALR-LEXFORMS*");

    // defparameter
    public static final SubLSymbol $cyblack_lalr_lexicon$ = makeSymbol("*CYBLACK-LALR-LEXICON*");

    /**
     * Enumerated values of type LALR-PARSER-OPTION.
     */
    // defconstant
    private static final SubLSymbol $valid_lalr_parser_options$ = makeSymbol("*VALID-LALR-PARSER-OPTIONS*");

    /**
     * Returns a list of all valid members of the LALR-PARSER-OPTION enumeration.
     */
    public static final SubLObject valid_lalr_parser_options() {
        return $valid_lalr_parser_options$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the LALR-PARSER-OPTION enumeration.
     */
    public static final SubLObject lalr_parser_option_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_lalr_parser_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the LALR-PARSER-OPTION enumeration to an integer encoding.
     */
    public static final SubLObject encode_lalr_parser_option(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_lalr_parser_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt359$_S___S_is_not_a_member_of_the__S_, ENCODE_LALR_PARSER_OPTION, value, LALR_PARSER_OPTION);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the LALR-PARSER-OPTION enumeration.
     */
    public static final SubLObject decode_lalr_parser_option(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_lalr_parser_options$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt361$_S___S_is_not_a_valid_encoding_of, DECODE_LALR_PARSER_OPTION, value, LALR_PARSER_OPTION);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the LALR-PARSER-OPTION enumeration.
     */
    public static final SubLObject lalr_parser_option_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == lalr_parser_option_p(value1)) {
                    Errors.error($str_alt363$_S___S_was_expected_to_be_a_membe, LALR_PARSER_OPTION_P, value1, LALR_PARSER_OPTION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == lalr_parser_option_p(value2)) {
                    Errors.error($str_alt363$_S___S_was_expected_to_be_a_membe, LALR_PARSER_OPTION_P, value2, LALR_PARSER_OPTION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_lalr_parser_options$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value1) {
                        return makeBoolean(value != value2);
                    } else
                        if (value == value2) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    /**
     * Provides a GREATERP predicate for members of the LALR-PARSER-OPTION enumeration.
     */
    public static final SubLObject lalr_parser_option_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == lalr_parser_option_p(value1)) {
                    Errors.error($str_alt363$_S___S_was_expected_to_be_a_membe, LALR_PARSER_OPTION_P, value1, LALR_PARSER_OPTION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == lalr_parser_option_p(value2)) {
                    Errors.error($str_alt363$_S___S_was_expected_to_be_a_membe, LALR_PARSER_OPTION_P, value2, LALR_PARSER_OPTION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_lalr_parser_options$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value2) {
                        return makeBoolean(value != value1);
                    } else
                        if (value == value1) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_grammar_rule_action(SubLObject lambda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((((lambda.isCons() && (lambda.first() == LAMBDA)) && lambda.rest().isCons()) && cadr(lambda).isList()) && cddr(lambda).isCons()) && (NIL == cddr(lambda).rest()))) {
                    Errors.error($str_alt366$DEFINE_LALR_PARSER___S_is_not_a_v, lambda);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_grammar_rule(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!rule.isList()) {
                    Errors.error($str_alt367$DEFINE_LALR_PARSER___S_is_not_a_v, rule);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((((((rule.isCons() && (NIL != rule.first())) && rule.first().isSymbol()) && (NIL != rule.rest())) && rule.rest().isCons()) && (cadr(rule) == $sym368$___)) && cddr(rule).isList())) {
                    Errors.error($str_alt369$DEFINE_LALR_PARSER___S_is_not_a_v, rule);
                }
            }
            {
                SubLObject last_cons = last(rule, UNPROVIDED);
                SubLObject lambda = last_cons.first();
                if (last_cons.isCons() && last_cons.first().isCons()) {
                    check_define_lalr_parser_options_grammar_rule_action(lambda);
                }
            }
            {
                SubLObject decomposition = butlast(cddr(rule), UNPROVIDED);
                if (NIL != decomposition) {
                    {
                        SubLObject cdolist_list_var = decomposition;
                        SubLObject cat = NIL;
                        for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!((NIL != cat) && cat.isSymbol())) {
                                    Errors.error($str_alt370$DEFINE_LALR_PARSER___S_is_not_a_v, cat);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_grammar(SubLObject grammar) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!grammar.isList()) {
                    Errors.error($str_alt371$DEFINE_LALR_PARSER___S_is_not_a_v, grammar);
                }
            }
            {
                SubLObject cdolist_list_var = grammar;
                SubLObject rule = NIL;
                for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                    check_define_lalr_parser_options_grammar_rule(rule);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_lexical(SubLObject lexical) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((((((lexical.isCons() && lexical.rest().isCons()) && (NIL == cddr(lexical))) && (NIL != lexical.first())) && lexical.first().isSymbol()) && (NIL != cadr(lexical))) && cadr(lexical).isSymbol())) {
                    Errors.error($str_alt372$DEFINE_LALR_PARSER___S_is_not_a_v, lexical);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_lexicon(SubLObject lexicon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!lexicon.isList()) {
                    Errors.error($str_alt373$DEFINE_LALR_PARSER___S_is_not_a_v, lexicon);
                }
            }
            {
                SubLObject cdolist_list_var = lexicon;
                SubLObject lexical = NIL;
                for (lexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexical = cdolist_list_var.first()) {
                    check_define_lalr_parser_options_lexical(lexical);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_lexifier(SubLObject lexifier_class) {
        if (NIL == classes.classes_implements_p(lexifier_class, CYBLACK_LEXIFIER)) {
            Errors.warn($str_alt375$DEFINE_LALR_PARSER___S_does_not_i, lexifier_class);
        }
        return NIL;
    }

    public static final SubLObject check_define_lalr_parser_options_lexforms(SubLObject lexforms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!lexforms.isList()) {
                    Errors.error($str_alt376$DEFINE_LALR_PARSER___S_is_not_a_v, lexforms);
                }
            }
            {
                SubLObject cdolist_list_var = lexforms;
                SubLObject lexform = NIL;
                for (lexform = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexform = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((NIL != lexform) && lexform.isSymbol())) {
                            Errors.error($str_alt377$DEFINE_LALR_PARSER___S_is_not_a_v, lexform);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options_to_category(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != category) && category.isSymbol())) {
                    Errors.error($str_alt378$DEFINE_LALR_PARSER___S_is_not_a_v, category);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_define_lalr_parser_options(SubLObject options_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(options_list.isList() && (NIL != evenp(length(options_list))))) {
                    Errors.error($str_alt379$DEFINE_LALR_PARSER___S_is_not_a_v, options_list);
                }
            }
            {
                SubLObject grammar_option = getf(options_list, $GRAMMAR, UNPROVIDED);
                SubLObject lexicon_option = getf(options_list, $LEXICON, UNPROVIDED);
                SubLObject lexifier_option = getf(options_list, $LEXIFIER, UNPROVIDED);
                SubLObject lexforms_option = getf(options_list, $LEXFORMS, UNPROVIDED);
                SubLObject top_category_option = getf(options_list, $TOP_CATEGORY, UNPROVIDED);
                if (!(((NIL != grammar_option) && ((NIL != lexicon_option) || (NIL != lexifier_option))) && (NIL != top_category_option))) {
                    Errors.error($str_alt385$DEFINE_LALR_PARSER__The_following, nconc(NIL != grammar_option ? ((SubLObject) (NIL)) : list($GRAMMAR), NIL != lexforms_option ? ((SubLObject) (NIL)) : list($LEXFORM), NIL != top_category_option ? ((SubLObject) (NIL)) : list($TOP_CATEGORY)));
                }
                check_define_lalr_parser_options_grammar(grammar_option);
                if (NIL != lexicon_option) {
                    check_define_lalr_parser_options_lexicon(lexicon_option);
                }
                if (NIL != lexifier_option) {
                    check_define_lalr_parser_options_lexifier(lexifier_option);
                }
                check_define_lalr_parser_options_lexforms(lexforms_option);
                check_define_lalr_parser_options_to_category(top_category_option);
            }
            return NIL;
        }
    }

    public static final SubLObject expand_define_lalr_parser(SubLObject parser_class, SubLObject options) {
        {
            SubLObject grammar = getf(options, $GRAMMAR, UNPROVIDED);
            SubLObject lexicon = getf(options, $LEXICON, UNPROVIDED);
            SubLObject lexifier = getf(options, $LEXIFIER, UNPROVIDED);
            SubLObject lexforms = getf(options, $LEXFORMS, UNPROVIDED);
            SubLObject top_category = getf(options, $TOP_CATEGORY, UNPROVIDED);
            SubLObject super_class = getf(options, $EXTENDS, UNPROVIDED);
            if (NIL == super_class) {
                super_class = LALR_PARSER;
            }
            return make_parser(parser_class, super_class, grammar, lexforms, lexifier, top_category, $sym387$_, lexicon);
        }
    }

    public static final SubLObject define_lalr_parser(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject parser_class = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt388);
                parser_class = current.first();
                current = current.rest();
                {
                    SubLObject options = current;
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((NIL != parser_class) && parser_class.isSymbol())) {
                            Errors.error($str_alt389$DEFINE_LALR_PARSER___S_is_not_a_v, parser_class);
                        }
                    }
                    check_define_lalr_parser_options(options);
                    return expand_define_lalr_parser(parser_class, options);
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_lalr_file() {
        declareFunction("make_parser", "MAKE-PARSER", 7, 1, false);
        declareFunction("lalr_rule_print_function_trampoline", "LALR-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("lalr_rule_p", "LALR-RULE-P", 1, 0, false);
        new cyblack_lalr.$lalr_rule_p$UnaryFunction();
        declareFunction("lalr_rule_no", "LALR-RULE-NO", 1, 0, false);
        declareFunction("lalr_rule_mother", "LALR-RULE-MOTHER", 1, 0, false);
        declareFunction("lalr_rule_daughters", "LALR-RULE-DAUGHTERS", 1, 0, false);
        declareFunction("lalr_rule_action", "LALR-RULE-ACTION", 1, 0, false);
        declareFunction("lalr_rule_method_name", "LALR-RULE-METHOD-NAME", 1, 0, false);
        declareFunction("lalr_rule_method_defn", "LALR-RULE-METHOD-DEFN", 1, 0, false);
        declareFunction("_csetf_lalr_rule_no", "_CSETF-LALR-RULE-NO", 2, 0, false);
        declareFunction("_csetf_lalr_rule_mother", "_CSETF-LALR-RULE-MOTHER", 2, 0, false);
        declareFunction("_csetf_lalr_rule_daughters", "_CSETF-LALR-RULE-DAUGHTERS", 2, 0, false);
        declareFunction("_csetf_lalr_rule_action", "_CSETF-LALR-RULE-ACTION", 2, 0, false);
        declareFunction("_csetf_lalr_rule_method_name", "_CSETF-LALR-RULE-METHOD-NAME", 2, 0, false);
        declareFunction("_csetf_lalr_rule_method_defn", "_CSETF-LALR-RULE-METHOD-DEFN", 2, 0, false);
        declareFunction("make_lalr_rule", "MAKE-LALR-RULE", 0, 1, false);
        declareFunction("print_lalr_rule", "PRINT-LALR-RULE", 3, 0, false);
        declareFunction("describe_lalr_rule", "DESCRIBE-LALR-RULE", 1, 0, false);
        declareFunction("describe_lalr_rules", "DESCRIBE-LALR-RULES", 1, 0, false);
        declareFunction("lalr_rule_reset_method_name_counter", "LALR-RULE-RESET-METHOD-NAME-COUNTER", 0, 0, false);
        declareFunction("lalr_rule_allocate_method_name", "LALR-RULE-ALLOCATE-METHOD-NAME", 0, 0, false);
        declareFunction("create_lalr_rule", "CREATE-LALR-RULE", 4, 0, false);
        declareFunction("transform_rule", "TRANSFORM-RULE", 2, 0, false);
        declareFunction("compute_expansion", "COMPUTE-EXPANSION", 1, 0, false);
        declareMacro("lalr_expand", "LALR-EXPAND");
        declareFunction("get_all_cats_try", "GET-ALL-CATS-TRY", 2, 0, false);
        declareFunction("get_all_cats_try_rules", "GET-ALL-CATS-TRY-RULES", 2, 0, false);
        declareFunction("get_all_cats_try_cats", "GET-ALL-CATS-TRY-CATS", 2, 0, false);
        declareFunction("get_all_cats", "GET-ALL-CATS", 0, 0, false);
        declareFunction("derives_eps_every", "DERIVES-EPS-EVERY", 3, 0, false);
        declareFunction("derives_eps_some", "DERIVES-EPS-SOME", 2, 0, false);
        declareFunction("derives_eps_try", "DERIVES-EPS-TRY", 2, 0, false);
        declareFunction("derives_eps", "DERIVES-EPS", 1, 0, false);
        declareFunction("derives_epsilon", "DERIVES-EPSILON", 1, 0, false);
        declareFunction("first_terms_first_ds", "FIRST-TERMS-FIRST-DS", 1, 0, false);
        declareFunction("first_terms_try", "FIRST-TERMS-TRY", 2, 0, false);
        declareFunction("first_terms_try_list", "FIRST-TERMS-TRY-LIST", 2, 0, false);
        declareFunction("first_terms", "FIRST-TERMS", 1, 0, false);
        declareFunction("first_terminals", "FIRST-TERMINALS", 1, 0, false);
        declareFunction("item_print_function_trampoline", "ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("item_p", "ITEM-P", 1, 0, false);
        new cyblack_lalr.$item_p$UnaryFunction();
        declareFunction("item_rule", "ITEM-RULE", 1, 0, false);
        declareFunction("item_pos", "ITEM-POS", 1, 0, false);
        declareFunction("item_la", "ITEM-LA", 1, 0, false);
        declareFunction("_csetf_item_rule", "_CSETF-ITEM-RULE", 2, 0, false);
        declareFunction("_csetf_item_pos", "_CSETF-ITEM-POS", 2, 0, false);
        declareFunction("_csetf_item_la", "_CSETF-ITEM-LA", 2, 0, false);
        declareFunction("make_item", "MAKE-ITEM", 0, 1, false);
        declareFunction("print_item", "PRINT-ITEM", 3, 0, false);
        declareFunction("create_item", "CREATE-ITEM", 3, 0, false);
        declareFunction("describe_item", "DESCRIBE-ITEM", 1, 0, false);
        declareMacro("item_daughters", "ITEM-DAUGHTERS");
        declareMacro("item_right", "ITEM-RIGHT");
        declareMacro("item_equal", "ITEM-EQUAL");
        declareMacro("item_core_equal", "ITEM-CORE-EQUAL");
        declareFunction("close_items_check_items", "CLOSE-ITEMS-CHECK-ITEMS", 3, 0, false);
        declareFunction("close_items", "CLOSE-ITEMS", 1, 0, false);
        declareFunction("shift_items_shift_item", "SHIFT-ITEMS-SHIFT-ITEM", 2, 0, false);
        declareFunction("shift_items", "SHIFT-ITEMS", 2, 0, false);
        declareFunction("items_right", "ITEMS-RIGHT", 1, 0, false);
        declareFunction("compact_items_sort_key", "COMPACT-ITEMS-SORT-KEY", 1, 0, false);
        declareFunction("compact_items", "COMPACT-ITEMS", 1, 0, false);
        declareMacro("expand_citems", "EXPAND-CITEMS");
        declareFunction("subsumes_citems_every_subset_p", "SUBSUMES-CITEMS-EVERY-SUBSET-P", 2, 0, false);
        declareFunction("subsumes_citems_every", "SUBSUMES-CITEMS-EVERY", 2, 0, false);
        declareFunction("subsumes_citems", "SUBSUMES-CITEMS", 2, 0, false);
        declareFunction("merge_citems_union", "MERGE-CITEMS-UNION", 2, 0, false);
        declareFunction("merge_citems", "MERGE-CITEMS", 2, 0, false);
        declareFunction("state_print_function_trampoline", "STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("state_p", "STATE-P", 1, 0, false);
        new cyblack_lalr.$state_p$UnaryFunction();
        declareFunction("state_name", "STATE-NAME", 1, 0, false);
        declareFunction("state_citems", "STATE-CITEMS", 1, 0, false);
        declareFunction("state_shifts", "STATE-SHIFTS", 1, 0, false);
        declareFunction("state_conflict", "STATE-CONFLICT", 1, 0, false);
        declareFunction("_csetf_state_name", "_CSETF-STATE-NAME", 2, 0, false);
        declareFunction("_csetf_state_citems", "_CSETF-STATE-CITEMS", 2, 0, false);
        declareFunction("_csetf_state_shifts", "_CSETF-STATE-SHIFTS", 2, 0, false);
        declareFunction("_csetf_state_conflict", "_CSETF-STATE-CONFLICT", 2, 0, false);
        declareFunction("make_state", "MAKE-STATE", 0, 1, false);
        declareFunction("print_state", "PRINT-STATE", 3, 0, false);
        declareFunction("create_state", "CREATE-STATE", 4, 0, false);
        declareFunction("shift_print_function_trampoline", "SHIFT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("shift_p", "SHIFT-P", 1, 0, false);
        new cyblack_lalr.$shift_p$UnaryFunction();
        declareFunction("shift_cat", "SHIFT-CAT", 1, 0, false);
        declareFunction("shift_where", "SHIFT-WHERE", 1, 0, false);
        declareFunction("_csetf_shift_cat", "_CSETF-SHIFT-CAT", 2, 0, false);
        declareFunction("_csetf_shift_where", "_CSETF-SHIFT-WHERE", 2, 0, false);
        declareFunction("make_shift", "MAKE-SHIFT", 0, 1, false);
        declareFunction("print_shift", "PRINT-SHIFT", 3, 0, false);
        declareFunction("create_shift", "CREATE-SHIFT", 2, 0, false);
        declareFunction("describe_shift", "DESCRIBE-SHIFT", 1, 0, false);
        declareFunction("lalr_lookup_all_core_equal", "LALR-LOOKUP-ALL-CORE-EQUAL", 2, 0, false);
        declareFunction("lalr_lookup", "LALR-LOOKUP", 1, 0, false);
        declareFunction("add_state", "ADD-STATE", 1, 0, false);
        declareFunction("get_state_name", "GET-STATE-NAME", 1, 0, false);
        declareFunction("build_state", "BUILD-STATE", 2, 0, false);
        declareFunction("follow_state", "FOLLOW-STATE", 1, 0, false);
        declareFunction("build_table", "BUILD-TABLE", 0, 0, false);
        declareFunction("print_table", "PRINT-TABLE", 1, 0, false);
        declareMacro("create_symbols_so_far_ref", "CREATE-SYMBOLS-SO-FAR-REF");
        declareMacro("symbols_so_far_ref_deref", "SYMBOLS-SO-FAR-REF-DEREF");
        declareFunction("symbols_so_far_ref_push", "SYMBOLS-SO-FAR-REF-PUSH", 2, 0, false);
        declareFunction("translate_state_translate_shift", "TRANSLATE-STATE-TRANSLATE-SHIFT", 3, 0, false);
        declareFunction("translate_state_translate_reduce_intersection", "TRANSLATE-STATE-TRANSLATE-REDUCE-INTERSECTION", 2, 0, false);
        declareFunction("translate_state_translate_reduce", "TRANSLATE-STATE-TRANSLATE-REDUCE", 3, 0, false);
        declareFunction("translate_state", "TRANSLATE-STATE", 2, 0, false);
        declareFunction("get_lalr_parser_top_cat", "GET-LALR-PARSER-TOP-CAT", 1, 0, false);
        declareFunction("set_lalr_parser_top_cat", "SET-LALR-PARSER-TOP-CAT", 2, 0, false);
        declareFunction("get_lalr_parser_state_stack", "GET-LALR-PARSER-STATE-STACK", 1, 0, false);
        declareFunction("set_lalr_parser_state_stack", "SET-LALR-PARSER-STATE-STACK", 2, 0, false);
        declareFunction("get_lalr_parser_val_stack", "GET-LALR-PARSER-VAL-STACK", 1, 0, false);
        declareFunction("set_lalr_parser_val_stack", "SET-LALR-PARSER-VAL-STACK", 2, 0, false);
        declareFunction("get_lalr_parser_val_la", "GET-LALR-PARSER-VAL-LA", 1, 0, false);
        declareFunction("set_lalr_parser_val_la", "SET-LALR-PARSER-VAL-LA", 2, 0, false);
        declareFunction("get_lalr_parser_cat_la", "GET-LALR-PARSER-CAT-LA", 1, 0, false);
        declareFunction("set_lalr_parser_cat_la", "SET-LALR-PARSER-CAT-LA", 2, 0, false);
        declareFunction("get_lalr_parser_parser_name", "GET-LALR-PARSER-PARSER-NAME", 1, 0, false);
        declareFunction("set_lalr_parser_parser_name", "SET-LALR-PARSER-PARSER-NAME", 2, 0, false);
        declareFunction("get_lalr_parser_lexforms", "GET-LALR-PARSER-LEXFORMS", 1, 0, false);
        declareFunction("set_lalr_parser_lexforms", "SET-LALR-PARSER-LEXFORMS", 2, 0, false);
        declareFunction("get_lalr_parser_lexicon", "GET-LALR-PARSER-LEXICON", 1, 0, false);
        declareFunction("set_lalr_parser_lexicon", "SET-LALR-PARSER-LEXICON", 2, 0, false);
        declareFunction("subloop_reserved_initialize_lalr_parser_class", "SUBLOOP-RESERVED-INITIALIZE-LALR-PARSER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_lalr_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-LALR-PARSER-INSTANCE", 1, 0, false);
        declareFunction("lalr_parser_p", "LALR-PARSER-P", 1, 0, false);
        declareFunction("lalr_parser_initialize_method", "LALR-PARSER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("lalr_parser_clear_method", "LALR-PARSER-CLEAR-METHOD", 1, 0, false);
        declareFunction("lalr_parser_get_lexicon_method", "LALR-PARSER-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_lexicon_method", "LALR-PARSER-SET-LEXICON-METHOD", 2, 0, false);
        declareFunction("lalr_parser_get_lexforms_method", "LALR-PARSER-GET-LEXFORMS-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_lexforms_method", "LALR-PARSER-SET-LEXFORMS-METHOD", 2, 0, false);
        declareFunction("lalr_parser_get_parser_name_method", "LALR-PARSER-GET-PARSER-NAME-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_parser_name_method", "LALR-PARSER-SET-PARSER-NAME-METHOD", 2, 0, false);
        declareFunction("lalr_parser_get_cat_la_method", "LALR-PARSER-GET-CAT-LA-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_cat_la_method", "LALR-PARSER-SET-CAT-LA-METHOD", 2, 0, false);
        declareFunction("lalr_parser_get_val_la_method", "LALR-PARSER-GET-VAL-LA-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_val_la_method", "LALR-PARSER-SET-VAL-LA-METHOD", 2, 0, false);
        declareFunction("lalr_parser_get_val_stack_method", "LALR-PARSER-GET-VAL-STACK-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_val_stack_method", "LALR-PARSER-SET-VAL-STACK-METHOD", 2, 0, false);
        declareFunction("lalr_parser_val_stack_push_method", "LALR-PARSER-VAL-STACK-PUSH-METHOD", 2, 0, false);
        declareFunction("lalr_parser_val_stack_pop_method", "LALR-PARSER-VAL-STACK-POP-METHOD", 1, 0, false);
        declareFunction("lalr_parser_get_state_stack_method", "LALR-PARSER-GET-STATE-STACK-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_state_stack_method", "LALR-PARSER-SET-STATE-STACK-METHOD", 2, 0, false);
        declareFunction("lalr_parser_state_stack_push_method", "LALR-PARSER-STATE-STACK-PUSH-METHOD", 2, 0, false);
        declareFunction("lalr_parser_state_stack_pop_method", "LALR-PARSER-STATE-STACK-POP-METHOD", 1, 0, false);
        declareFunction("lalr_parser_get_top_cat_method", "LALR-PARSER-GET-TOP-CAT-METHOD", 1, 0, false);
        declareFunction("lalr_parser_set_top_cat_method", "LALR-PARSER-SET-TOP-CAT-METHOD", 2, 0, false);
        declareFunction("lalr_parser_next_input_method", "LALR-PARSER-NEXT-INPUT-METHOD", 1, 0, false);
        declareFunction("lalr_parser_parse_error_method", "LALR-PARSER-PARSE-ERROR-METHOD", 1, 0, false);
        declareFunction("lalr_parser_input_peek_method", "LALR-PARSER-INPUT-PEEK-METHOD", 1, 0, false);
        declareFunction("lalr_parser_shift_from_method", "LALR-PARSER-SHIFT-FROM-METHOD", 2, 0, false);
        declareFunction("lalr_parser_reduce_cat_method", "LALR-PARSER-REDUCE-CAT-METHOD", 5, 0, false);
        declareFunction("lalr_parser_parse_method", "LALR-PARSER-PARSE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_lalr_parser_lexifier", "GET-CYBLACK-LALR-PARSER-LEXIFIER", 1, 0, false);
        declareFunction("set_cyblack_lalr_parser_lexifier", "SET-CYBLACK-LALR-PARSER-LEXIFIER", 2, 0, false);
        declareFunction("get_cyblack_lalr_parser_current_token", "GET-CYBLACK-LALR-PARSER-CURRENT-TOKEN", 1, 0, false);
        declareFunction("set_cyblack_lalr_parser_current_token", "SET-CYBLACK-LALR-PARSER-CURRENT-TOKEN", 2, 0, false);
        declareFunction("get_cyblack_lalr_parser_tokens", "GET-CYBLACK-LALR-PARSER-TOKENS", 1, 0, false);
        declareFunction("set_cyblack_lalr_parser_tokens", "SET-CYBLACK-LALR-PARSER-TOKENS", 2, 0, false);
        declareFunction("get_cyblack_lalr_parser_opened_p", "GET-CYBLACK-LALR-PARSER-OPENED-P", 1, 0, false);
        declareFunction("set_cyblack_lalr_parser_opened_p", "SET-CYBLACK-LALR-PARSER-OPENED-P", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_lalr_parser_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LALR-PARSER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_lalr_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LALR-PARSER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_lalr_parser_p", "CYBLACK-LALR-PARSER-P", 1, 0, false);
        declareFunction("cyblack_lalr_parser_initialize_method", "CYBLACK-LALR-PARSER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_lalr_parser_get_tokens_method", "CYBLACK-LALR-PARSER-GET-TOKENS-METHOD", 1, 0, false);
        declareFunction("cyblack_lalr_parser_set_tokens_method", "CYBLACK-LALR-PARSER-SET-TOKENS-METHOD", 2, 0, false);
        declareFunction("cyblack_lalr_parser_get_current_token_method", "CYBLACK-LALR-PARSER-GET-CURRENT-TOKEN-METHOD", 1, 0, false);
        declareFunction("cyblack_lalr_parser_set_current_token_method", "CYBLACK-LALR-PARSER-SET-CURRENT-TOKEN-METHOD", 2, 0, false);
        declareFunction("cyblack_lalr_parser_get_lexifier_method", "CYBLACK-LALR-PARSER-GET-LEXIFIER-METHOD", 1, 0, false);
        declareFunction("cyblack_lalr_parser_set_lexifier_method", "CYBLACK-LALR-PARSER-SET-LEXIFIER-METHOD", 2, 0, false);
        declareFunction("cyblack_lalr_parser_next_input_method", "CYBLACK-LALR-PARSER-NEXT-INPUT-METHOD", 1, 0, false);
        declareFunction("cyblack_lalr_parser_parse_error_method", "CYBLACK-LALR-PARSER-PARSE-ERROR-METHOD", 1, 0, false);
        declareFunction("build_parser", "BUILD-PARSER", 6, 1, false);
        declareFunction("valid_lalr_parser_options", "VALID-LALR-PARSER-OPTIONS", 0, 0, false);
        declareFunction("lalr_parser_option_p", "LALR-PARSER-OPTION-P", 1, 0, false);
        declareFunction("encode_lalr_parser_option", "ENCODE-LALR-PARSER-OPTION", 1, 0, false);
        declareFunction("decode_lalr_parser_option", "DECODE-LALR-PARSER-OPTION", 1, 0, false);
        declareFunction("lalr_parser_option_less_p", "LALR-PARSER-OPTION-LESS-P", 2, 0, false);
        declareFunction("lalr_parser_option_greater_p", "LALR-PARSER-OPTION-GREATER-P", 2, 0, false);
        declareFunction("check_define_lalr_parser_options_grammar_rule_action", "CHECK-DEFINE-LALR-PARSER-OPTIONS-GRAMMAR-RULE-ACTION", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_grammar_rule", "CHECK-DEFINE-LALR-PARSER-OPTIONS-GRAMMAR-RULE", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_grammar", "CHECK-DEFINE-LALR-PARSER-OPTIONS-GRAMMAR", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_lexical", "CHECK-DEFINE-LALR-PARSER-OPTIONS-LEXICAL", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_lexicon", "CHECK-DEFINE-LALR-PARSER-OPTIONS-LEXICON", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_lexifier", "CHECK-DEFINE-LALR-PARSER-OPTIONS-LEXIFIER", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_lexforms", "CHECK-DEFINE-LALR-PARSER-OPTIONS-LEXFORMS", 1, 0, false);
        declareFunction("check_define_lalr_parser_options_to_category", "CHECK-DEFINE-LALR-PARSER-OPTIONS-TO-CATEGORY", 1, 0, false);
        declareFunction("check_define_lalr_parser_options", "CHECK-DEFINE-LALR-PARSER-OPTIONS", 1, 0, false);
        declareFunction("expand_define_lalr_parser", "EXPAND-DEFINE-LALR-PARSER", 2, 0, false);
        declareMacro("define_lalr_parser", "DEFINE-LALR-PARSER");
        return NIL;
    }

    public static final SubLObject init_cyblack_lalr_file() {
        defparameter("*TOPCAT*", $sym0$_START);
        defparameter("*END-MARKER*", NIL);
        defparameter("*GLEX*", NIL);
        defparameter("*GRULES*", NIL);
        defparameter("*GSTART*", NIL);
        defparameter("*GSTARTS*", NIL);
        defparameter("*GCATS*", NIL);
        defparameter("*GFIRSTS*", NIL);
        defparameter("*GEPSILONS*", NIL);
        defparameter("*GEXPANSIONS*", NIL);
        defparameter("*LALR-DEBUG*", NIL);
        defparameter("*STATE-LIST*", NIL);
        defparameter("*LALR-RULE-METHOD-NAME-COUNTER*", ZERO_INTEGER);
        defparameter("*LALR-RULE-METHOD-NAME-PREFIX*", $str_alt1$TRANSFORM_METHOD_);
        defparameter("*LALR-RULE-CURRENT-CLASS-NAME*", NIL);
        defconstant("*DTP-LALR-RULE*", LALR_RULE);
        defconstant("*DTP-ITEM*", ITEM);
        defconstant("*DTP-STATE*", STATE);
        defconstant("*DTP-SHIFT*", SHIFT);
        defparameter("*NEXT-STATE-NO*", MINUS_ONE_INTEGER);
        defparameter("*CYBLACK-LALR-GRAMMAR*", $list_alt354);
        defparameter("*CYBLACK-LALR-LEXFORMS*", $list_alt355);
        defparameter("*CYBLACK-LALR-LEXICON*", $list_alt356);
        defconstant("*VALID-LALR-PARSER-OPTIONS*", $list_alt357);
        return NIL;
    }

    public static final SubLObject setup_cyblack_lalr_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_lalr_rule$.getGlobalValue(), symbol_function(LALR_RULE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(LALR_RULE_NO, _CSETF_LALR_RULE_NO);
        def_csetf(LALR_RULE_MOTHER, _CSETF_LALR_RULE_MOTHER);
        def_csetf(LALR_RULE_DAUGHTERS, _CSETF_LALR_RULE_DAUGHTERS);
        def_csetf(LALR_RULE_ACTION, _CSETF_LALR_RULE_ACTION);
        def_csetf(LALR_RULE_METHOD_NAME, _CSETF_LALR_RULE_METHOD_NAME);
        def_csetf(LALR_RULE_METHOD_DEFN, _CSETF_LALR_RULE_METHOD_DEFN);
        identity(LALR_RULE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_item$.getGlobalValue(), symbol_function(ITEM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ITEM_RULE, _CSETF_ITEM_RULE);
        def_csetf(ITEM_POS, _CSETF_ITEM_POS);
        def_csetf(ITEM_LA, _CSETF_ITEM_LA);
        identity(ITEM);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_state$.getGlobalValue(), symbol_function(STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(STATE_NAME, _CSETF_STATE_NAME);
        def_csetf(STATE_CITEMS, _CSETF_STATE_CITEMS);
        def_csetf(STATE_SHIFTS, _CSETF_STATE_SHIFTS);
        def_csetf(STATE_CONFLICT, _CSETF_STATE_CONFLICT);
        identity(STATE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_shift$.getGlobalValue(), symbol_function(SHIFT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SHIFT_CAT, _CSETF_SHIFT_CAT);
        def_csetf(SHIFT_WHERE, _CSETF_SHIFT_WHERE);
        identity(SHIFT);
        classes.subloop_new_class(LALR_PARSER, OBJECT, NIL, NIL, $list_alt158);
        classes.class_set_implements_slot_listeners(LALR_PARSER, NIL);
        classes.subloop_note_class_initialization_function(LALR_PARSER, SUBLOOP_RESERVED_INITIALIZE_LALR_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(LALR_PARSER, SUBLOOP_RESERVED_INITIALIZE_LALR_PARSER_INSTANCE);
        subloop_reserved_initialize_lalr_parser_class(LALR_PARSER);
        methods.methods_incorporate_instance_method(INITIALIZE, LALR_PARSER, $list_alt173, NIL, $list_alt174);
        methods.subloop_register_instance_method(LALR_PARSER, INITIALIZE, LALR_PARSER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, LALR_PARSER, $list_alt173, NIL, $list_alt178);
        methods.subloop_register_instance_method(LALR_PARSER, CLEAR, LALR_PARSER_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXICON, LALR_PARSER, $list_alt182, NIL, $list_alt183);
        methods.subloop_register_instance_method(LALR_PARSER, GET_LEXICON, LALR_PARSER_GET_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(SET_LEXICON, LALR_PARSER, $list_alt182, $list_alt187, $list_alt188);
        methods.subloop_register_instance_method(LALR_PARSER, SET_LEXICON, LALR_PARSER_SET_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXFORMS, LALR_PARSER, $list_alt192, NIL, $list_alt193);
        methods.subloop_register_instance_method(LALR_PARSER, GET_LEXFORMS, LALR_PARSER_GET_LEXFORMS_METHOD);
        methods.methods_incorporate_instance_method(SET_LEXFORMS, LALR_PARSER, $list_alt182, $list_alt197, $list_alt198);
        methods.subloop_register_instance_method(LALR_PARSER, SET_LEXFORMS, LALR_PARSER_SET_LEXFORMS_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSER_NAME, LALR_PARSER, $list_alt182, NIL, $list_alt202);
        methods.subloop_register_instance_method(LALR_PARSER, GET_PARSER_NAME, LALR_PARSER_GET_PARSER_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_PARSER_NAME, LALR_PARSER, $list_alt182, $list_alt206, $list_alt207);
        methods.subloop_register_instance_method(LALR_PARSER, SET_PARSER_NAME, LALR_PARSER_SET_PARSER_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_CAT_LA, LALR_PARSER, $list_alt182, NIL, $list_alt211);
        methods.subloop_register_instance_method(LALR_PARSER, GET_CAT_LA, LALR_PARSER_GET_CAT_LA_METHOD);
        methods.methods_incorporate_instance_method(SET_CAT_LA, LALR_PARSER, $list_alt182, $list_alt215, $list_alt216);
        methods.subloop_register_instance_method(LALR_PARSER, SET_CAT_LA, LALR_PARSER_SET_CAT_LA_METHOD);
        methods.methods_incorporate_instance_method(GET_VAL_LA, LALR_PARSER, $list_alt182, NIL, $list_alt220);
        methods.subloop_register_instance_method(LALR_PARSER, GET_VAL_LA, LALR_PARSER_GET_VAL_LA_METHOD);
        methods.methods_incorporate_instance_method(SET_VAL_LA, LALR_PARSER, $list_alt182, $list_alt224, $list_alt225);
        methods.subloop_register_instance_method(LALR_PARSER, SET_VAL_LA, LALR_PARSER_SET_VAL_LA_METHOD);
        methods.methods_incorporate_instance_method(GET_VAL_STACK, LALR_PARSER, $list_alt182, NIL, $list_alt229);
        methods.subloop_register_instance_method(LALR_PARSER, GET_VAL_STACK, LALR_PARSER_GET_VAL_STACK_METHOD);
        methods.methods_incorporate_instance_method(SET_VAL_STACK, LALR_PARSER, $list_alt182, $list_alt233, $list_alt234);
        methods.subloop_register_instance_method(LALR_PARSER, SET_VAL_STACK, LALR_PARSER_SET_VAL_STACK_METHOD);
        methods.methods_incorporate_instance_method(VAL_STACK_PUSH, LALR_PARSER, $list_alt182, $list_alt238, $list_alt239);
        methods.subloop_register_instance_method(LALR_PARSER, VAL_STACK_PUSH, LALR_PARSER_VAL_STACK_PUSH_METHOD);
        methods.methods_incorporate_instance_method(VAL_STACK_POP, LALR_PARSER, $list_alt182, NIL, $list_alt243);
        methods.subloop_register_instance_method(LALR_PARSER, VAL_STACK_POP, LALR_PARSER_VAL_STACK_POP_METHOD);
        methods.methods_incorporate_instance_method(GET_STATE_STACK, LALR_PARSER, $list_alt182, NIL, $list_alt247);
        methods.subloop_register_instance_method(LALR_PARSER, GET_STATE_STACK, LALR_PARSER_GET_STATE_STACK_METHOD);
        methods.methods_incorporate_instance_method(SET_STATE_STACK, LALR_PARSER, $list_alt182, $list_alt251, $list_alt252);
        methods.subloop_register_instance_method(LALR_PARSER, SET_STATE_STACK, LALR_PARSER_SET_STATE_STACK_METHOD);
        methods.methods_incorporate_instance_method(STATE_STACK_PUSH, LALR_PARSER, $list_alt182, $list_alt238, $list_alt256);
        methods.subloop_register_instance_method(LALR_PARSER, STATE_STACK_PUSH, LALR_PARSER_STATE_STACK_PUSH_METHOD);
        methods.methods_incorporate_instance_method(STATE_STACK_POP, LALR_PARSER, $list_alt182, NIL, $list_alt260);
        methods.subloop_register_instance_method(LALR_PARSER, STATE_STACK_POP, LALR_PARSER_STATE_STACK_POP_METHOD);
        methods.methods_incorporate_instance_method(GET_TOP_CAT, LALR_PARSER, $list_alt182, NIL, $list_alt264);
        methods.subloop_register_instance_method(LALR_PARSER, GET_TOP_CAT, LALR_PARSER_GET_TOP_CAT_METHOD);
        methods.methods_incorporate_instance_method(SET_TOP_CAT, LALR_PARSER, $list_alt182, $list_alt268, $list_alt269);
        methods.subloop_register_instance_method(LALR_PARSER, SET_TOP_CAT, LALR_PARSER_SET_TOP_CAT_METHOD);
        methods.methods_incorporate_instance_method(NEXT_INPUT, LALR_PARSER, $list_alt173, NIL, $list_alt273);
        methods.subloop_register_instance_method(LALR_PARSER, NEXT_INPUT, LALR_PARSER_NEXT_INPUT_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ERROR, LALR_PARSER, $list_alt173, NIL, $list_alt273);
        methods.subloop_register_instance_method(LALR_PARSER, PARSE_ERROR, LALR_PARSER_PARSE_ERROR_METHOD);
        methods.methods_incorporate_instance_method(INPUT_PEEK, LALR_PARSER, $list_alt152, NIL, $list_alt278);
        methods.subloop_register_instance_method(LALR_PARSER, INPUT_PEEK, LALR_PARSER_INPUT_PEEK_METHOD);
        methods.methods_incorporate_instance_method(SHIFT_FROM, LALR_PARSER, $list_alt173, $list_alt280, $list_alt281);
        methods.subloop_register_instance_method(LALR_PARSER, SHIFT_FROM, LALR_PARSER_SHIFT_FROM_METHOD);
        methods.methods_incorporate_instance_method(REDUCE_CAT, LALR_PARSER, $list_alt152, $list_alt284, $list_alt285);
        methods.subloop_register_instance_method(LALR_PARSER, REDUCE_CAT, LALR_PARSER_REDUCE_CAT_METHOD);
        methods.methods_incorporate_instance_method(PARSE, LALR_PARSER, $list_alt182, NIL, $list_alt273);
        methods.subloop_register_instance_method(LALR_PARSER, PARSE, LALR_PARSER_PARSE_METHOD);
        classes.subloop_new_class(CYBLACK_LALR_PARSER, LALR_PARSER, NIL, NIL, $list_alt290);
        classes.class_set_implements_slot_listeners(CYBLACK_LALR_PARSER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_LALR_PARSER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LALR_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_LALR_PARSER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LALR_PARSER_INSTANCE);
        subloop_reserved_initialize_cyblack_lalr_parser_class(CYBLACK_LALR_PARSER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_LALR_PARSER, $list_alt173, NIL, $list_alt298);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, INITIALIZE, CYBLACK_LALR_PARSER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_TOKENS, CYBLACK_LALR_PARSER, $list_alt182, NIL, $list_alt302);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, GET_TOKENS, CYBLACK_LALR_PARSER_GET_TOKENS_METHOD);
        methods.methods_incorporate_instance_method(SET_TOKENS, CYBLACK_LALR_PARSER, $list_alt182, $list_alt306, $list_alt307);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, SET_TOKENS, CYBLACK_LALR_PARSER_SET_TOKENS_METHOD);
        methods.methods_incorporate_instance_method(GET_CURRENT_TOKEN, CYBLACK_LALR_PARSER, $list_alt182, NIL, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, GET_CURRENT_TOKEN, CYBLACK_LALR_PARSER_GET_CURRENT_TOKEN_METHOD);
        methods.methods_incorporate_instance_method(SET_CURRENT_TOKEN, CYBLACK_LALR_PARSER, $list_alt182, $list_alt315, $list_alt316);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, SET_CURRENT_TOKEN, CYBLACK_LALR_PARSER_SET_CURRENT_TOKEN_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXIFIER, CYBLACK_LALR_PARSER, $list_alt320, NIL, $list_alt321);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, GET_LEXIFIER, CYBLACK_LALR_PARSER_GET_LEXIFIER_METHOD);
        methods.methods_incorporate_instance_method(SET_LEXIFIER, CYBLACK_LALR_PARSER, $list_alt182, $list_alt324, $list_alt325);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, SET_LEXIFIER, CYBLACK_LALR_PARSER_SET_LEXIFIER_METHOD);
        methods.methods_incorporate_instance_method(NEXT_INPUT, CYBLACK_LALR_PARSER, $list_alt173, NIL, $list_alt329);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, NEXT_INPUT, CYBLACK_LALR_PARSER_NEXT_INPUT_METHOD);
        methods.methods_incorporate_instance_method(PARSE_ERROR, CYBLACK_LALR_PARSER, $list_alt173, NIL, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_LALR_PARSER, PARSE_ERROR, CYBLACK_LALR_PARSER_PARSE_ERROR_METHOD);
        enumerations.enumerations_incorporate_definition(LALR_PARSER_OPTION, $list_alt357);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$_START = makeSymbol("$START");

    static private final SubLString $str_alt1$TRANSFORM_METHOD_ = makeString("TRANSFORM-METHOD-");

    private static final SubLSymbol PRINT_TABLE = makeSymbol("PRINT-TABLE");

    private static final SubLSymbol LALR_RULE = makeSymbol("LALR-RULE");

    private static final SubLSymbol LALR_RULE_P = makeSymbol("LALR-RULE-P");

    static private final SubLList $list_alt5 = list(makeSymbol("NO"), makeSymbol("MOTHER"), makeSymbol("DAUGHTERS"), makeSymbol("ACTION"), makeSymbol("METHOD-NAME"), makeSymbol("METHOD-DEFN"));

    static private final SubLList $list_alt6 = list(makeKeyword("NO"), makeKeyword("MOTHER"), makeKeyword("DAUGHTERS"), makeKeyword("ACTION"), makeKeyword("METHOD-NAME"), makeKeyword("METHOD-DEFN"));

    static private final SubLList $list_alt7 = list(makeSymbol("LALR-RULE-NO"), makeSymbol("LALR-RULE-MOTHER"), makeSymbol("LALR-RULE-DAUGHTERS"), makeSymbol("LALR-RULE-ACTION"), makeSymbol("LALR-RULE-METHOD-NAME"), makeSymbol("LALR-RULE-METHOD-DEFN"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-LALR-RULE-NO"), makeSymbol("_CSETF-LALR-RULE-MOTHER"), makeSymbol("_CSETF-LALR-RULE-DAUGHTERS"), makeSymbol("_CSETF-LALR-RULE-ACTION"), makeSymbol("_CSETF-LALR-RULE-METHOD-NAME"), makeSymbol("_CSETF-LALR-RULE-METHOD-DEFN"));

    private static final SubLSymbol PRINT_LALR_RULE = makeSymbol("PRINT-LALR-RULE");

    private static final SubLSymbol LALR_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LALR-RULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol LALR_RULE_NO = makeSymbol("LALR-RULE-NO");

    public static final SubLSymbol _CSETF_LALR_RULE_NO = makeSymbol("_CSETF-LALR-RULE-NO");

    private static final SubLSymbol LALR_RULE_MOTHER = makeSymbol("LALR-RULE-MOTHER");

    public static final SubLSymbol _CSETF_LALR_RULE_MOTHER = makeSymbol("_CSETF-LALR-RULE-MOTHER");

    private static final SubLSymbol LALR_RULE_DAUGHTERS = makeSymbol("LALR-RULE-DAUGHTERS");

    public static final SubLSymbol _CSETF_LALR_RULE_DAUGHTERS = makeSymbol("_CSETF-LALR-RULE-DAUGHTERS");

    private static final SubLSymbol LALR_RULE_ACTION = makeSymbol("LALR-RULE-ACTION");

    public static final SubLSymbol _CSETF_LALR_RULE_ACTION = makeSymbol("_CSETF-LALR-RULE-ACTION");

    private static final SubLSymbol LALR_RULE_METHOD_NAME = makeSymbol("LALR-RULE-METHOD-NAME");

    public static final SubLSymbol _CSETF_LALR_RULE_METHOD_NAME = makeSymbol("_CSETF-LALR-RULE-METHOD-NAME");

    private static final SubLSymbol LALR_RULE_METHOD_DEFN = makeSymbol("LALR-RULE-METHOD-DEFN");

    public static final SubLSymbol _CSETF_LALR_RULE_METHOD_DEFN = makeSymbol("_CSETF-LALR-RULE-METHOD-DEFN");





    private static final SubLSymbol $DAUGHTERS = makeKeyword("DAUGHTERS");





    private static final SubLSymbol $METHOD_DEFN = makeKeyword("METHOD-DEFN");

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt30$__LALR_RULE__no__S__mother__S__da = makeString("#<LALR-RULE: no=~S, mother=~S, daughters=~S, action=~S, method-name=~S");

    static private final SubLString $str_alt31$__Description_of_LALR_RULE_____S_ = makeString("~%Description of LALR-RULE -> ~S:");

    static private final SubLString $str_alt32$____no_____S = makeString("~%  no -> ~S");

    static private final SubLString $str_alt33$____mother_____S = makeString("~%  mother -> ~S");

    static private final SubLString $str_alt34$____daughters_____S = makeString("~%  daughters -> ~S");

    static private final SubLString $str_alt35$____action_____S = makeString("~%  action -> ~S");

    static private final SubLString $str_alt36$____method_name_____S = makeString("~%  method-name -> ~S");

    static private final SubLString $str_alt37$____method_defn_____S = makeString("~%  method-defn -> ~S");

    static private final SubLString $str_alt38$__ = makeString("~%");

    static private final SubLList $list_alt39 = list(makeSymbol("LAMBDA-SYMBOL"), makeSymbol("LAMBDA-LIST"), makeSymbol("EXPRESSION"));



    static private final SubLList $list_alt41 = list(makeKeyword("NO-MEMBER-VARIABLES"));



    static private final SubLList $list_alt43 = list(makeSymbol("CAT"));





    static private final SubLList $list_alt46 = list(makeSymbol("*GEXPANSIONS*"));



    private static final SubLSymbol ITEM_P = makeSymbol("ITEM-P");

    static private final SubLList $list_alt49 = list(makeSymbol("RULE"), makeSymbol("POS"), makeSymbol("LA"));

    static private final SubLList $list_alt50 = list($RULE, makeKeyword("POS"), makeKeyword("LA"));

    static private final SubLList $list_alt51 = list(makeSymbol("ITEM-RULE"), makeSymbol("ITEM-POS"), makeSymbol("ITEM-LA"));

    static private final SubLList $list_alt52 = list(makeSymbol("_CSETF-ITEM-RULE"), makeSymbol("_CSETF-ITEM-POS"), makeSymbol("_CSETF-ITEM-LA"));

    private static final SubLSymbol PRINT_ITEM = makeSymbol("PRINT-ITEM");

    private static final SubLSymbol ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol ITEM_RULE = makeSymbol("ITEM-RULE");

    public static final SubLSymbol _CSETF_ITEM_RULE = makeSymbol("_CSETF-ITEM-RULE");

    private static final SubLSymbol ITEM_POS = makeSymbol("ITEM-POS");

    public static final SubLSymbol _CSETF_ITEM_POS = makeSymbol("_CSETF-ITEM-POS");

    private static final SubLSymbol ITEM_LA = makeSymbol("ITEM-LA");

    public static final SubLSymbol _CSETF_ITEM_LA = makeSymbol("_CSETF-ITEM-LA");





    private static final SubLSymbol $LA = makeKeyword("LA");

    static private final SubLString $str_alt64$__ITEM__rule__S__pos__S__la__S_ = makeString("#<ITEM: rule=~S, pos=~S, la=~S>");

    static private final SubLString $str_alt65$__Description_of_Item__S_ = makeString("~%Description of Item ~S:");

    static private final SubLString $str_alt66$____rule_____S = makeString("~%  rule -> ~S");

    static private final SubLString $str_alt67$____pos_____S = makeString("~%  pos -> ~S");

    static private final SubLString $str_alt68$____la_____S = makeString("~%  la -> ~S");

    static private final SubLList $list_alt69 = list(makeSymbol("I"));



    private static final SubLSymbol ITEM_DAUGHTERS = makeSymbol("ITEM-DAUGHTERS");

    static private final SubLList $list_alt72 = list(makeSymbol("I1"), makeSymbol("I2"));



    static private final SubLSymbol $sym74$_ = makeSymbol("=");

    static private final SubLList $list_alt75 = list(makeSymbol("C1"), makeSymbol("C2"));

    private static final SubLSymbol COMPACT_ITEMS_TAG = makeSymbol("COMPACT-ITEMS-TAG");

    static private final SubLSymbol $sym77$_ = makeSymbol("<");

    private static final SubLSymbol COMPACT_ITEMS_SORT_KEY = makeSymbol("COMPACT-ITEMS-SORT-KEY");

    static private final SubLList $list_alt79 = list(makeSymbol("PLACE"), makeSymbol("CITEMS"));

    static private final SubLString $str_alt80$items_var = makeString("items-var");

    static private final SubLString $str_alt81$la_var = makeString("la-var");



    static private final SubLList $list_alt83 = list(NIL);



    private static final SubLSymbol CI = makeSymbol("CI");



    static private final SubLList $list_alt87 = list(list(makeSymbol("ITEM-LA"), makeSymbol("CI")));







    private static final SubLSymbol LA = makeSymbol("LA");



    static private final SubLList $list_alt93 = list(makeSymbol("CREATE-ITEM"), list(makeSymbol("ITEM-RULE"), makeSymbol("CI")), list(makeSymbol("ITEM-POS"), makeSymbol("CI")), makeSymbol("LA"));





    private static final SubLSymbol STATE_P = makeSymbol("STATE-P");

    static private final SubLList $list_alt97 = list(makeSymbol("NAME"), makeSymbol("CITEMS"), makeSymbol("SHIFTS"), makeSymbol("CONFLICT"));

    static private final SubLList $list_alt98 = list($NAME, makeKeyword("CITEMS"), makeKeyword("SHIFTS"), makeKeyword("CONFLICT"));

    static private final SubLList $list_alt99 = list(makeSymbol("STATE-NAME"), makeSymbol("STATE-CITEMS"), makeSymbol("STATE-SHIFTS"), makeSymbol("STATE-CONFLICT"));

    static private final SubLList $list_alt100 = list(makeSymbol("_CSETF-STATE-NAME"), makeSymbol("_CSETF-STATE-CITEMS"), makeSymbol("_CSETF-STATE-SHIFTS"), makeSymbol("_CSETF-STATE-CONFLICT"));

    private static final SubLSymbol PRINT_STATE = makeSymbol("PRINT-STATE");

    private static final SubLSymbol STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol STATE_NAME = makeSymbol("STATE-NAME");

    public static final SubLSymbol _CSETF_STATE_NAME = makeSymbol("_CSETF-STATE-NAME");

    private static final SubLSymbol STATE_CITEMS = makeSymbol("STATE-CITEMS");

    public static final SubLSymbol _CSETF_STATE_CITEMS = makeSymbol("_CSETF-STATE-CITEMS");

    private static final SubLSymbol STATE_SHIFTS = makeSymbol("STATE-SHIFTS");

    public static final SubLSymbol _CSETF_STATE_SHIFTS = makeSymbol("_CSETF-STATE-SHIFTS");

    private static final SubLSymbol STATE_CONFLICT = makeSymbol("STATE-CONFLICT");

    public static final SubLSymbol _CSETF_STATE_CONFLICT = makeSymbol("_CSETF-STATE-CONFLICT");



    private static final SubLSymbol $CITEMS = makeKeyword("CITEMS");

    private static final SubLSymbol $SHIFTS = makeKeyword("SHIFTS");



    static private final SubLString $str_alt115$__STATE__name__S__citems__S__shif = makeString("#<STATE: name=~S, citems=~S, shifts=~S, conflict=~S>");

    private static final SubLSymbol SHIFT = makeSymbol("SHIFT");

    private static final SubLSymbol SHIFT_P = makeSymbol("SHIFT-P");

    static private final SubLList $list_alt118 = list(makeSymbol("CAT"), makeSymbol("WHERE"));

    static private final SubLList $list_alt119 = list(makeKeyword("CAT"), makeKeyword("WHERE"));

    static private final SubLList $list_alt120 = list(makeSymbol("SHIFT-CAT"), makeSymbol("SHIFT-WHERE"));

    static private final SubLList $list_alt121 = list(makeSymbol("_CSETF-SHIFT-CAT"), makeSymbol("_CSETF-SHIFT-WHERE"));

    private static final SubLSymbol PRINT_SHIFT = makeSymbol("PRINT-SHIFT");

    private static final SubLSymbol SHIFT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SHIFT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol SHIFT_CAT = makeSymbol("SHIFT-CAT");

    public static final SubLSymbol _CSETF_SHIFT_CAT = makeSymbol("_CSETF-SHIFT-CAT");

    private static final SubLSymbol SHIFT_WHERE = makeSymbol("SHIFT-WHERE");

    public static final SubLSymbol _CSETF_SHIFT_WHERE = makeSymbol("_CSETF-SHIFT-WHERE");





    static private final SubLString $str_alt130$__SHIFT__cat__S__where__S_ = makeString("#<SHIFT: cat=~S, where=~S>");

    static private final SubLString $str_alt131$__Shift__S_ = makeString("~%Shift ~S:");

    static private final SubLString $str_alt132$____cat_____S = makeString("~%  cat -> ~S");

    static private final SubLString $str_alt133$____where_____S = makeString("~%  where -> ~S");

    static private final SubLString $str_alt134$STATE_ = makeString("STATE-");

    static private final SubLString $str_alt135$_____a_ = makeString("~%~%~a:");

    static private final SubLString $str_alt136$_____a________a________a_______a_ = makeString("~%  ~a -->~{ ~a~} .~{ ~a~}, ~{~a ~}");

    static private final SubLString $str_alt137$______On__a_shift__a = makeString("~%    On ~a shift ~a");

    static private final SubLString $str_alt138$______On____a___reduce____a______ = makeString("~%    On~{ ~a~} reduce~{ ~a~} --> ~a");

    static private final SubLList $list_alt139 = list(makeSymbol("SYMBOLS-SO-FAR"));

    static private final SubLList $list_alt140 = list(makeSymbol("SYMBOLS-SO-FAR-REF"));





    public static final SubLSymbol $lalr_debug$ = makeSymbol("*LALR-DEBUG*");



    static private final SubLString $str_alt145$__Shift__a_to__a__ = makeString("~%Shift ~a to ~a~%");

    private static final SubLSymbol SHIFT_FROM = makeSymbol("SHIFT-FROM");





    static private final SubLList $list_alt149 = list(makeSymbol("SELF"));

    static private final SubLString $str_alt150$Reduce____a_________a__ = makeString("Reduce ~{~a ~} --> ~a~%");

    private static final SubLSymbol REDUCE_CAT = makeSymbol("REDUCE-CAT");

    static private final SubLList $list_alt152 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));



    static private final SubLList $list_alt154 = list(makeSymbol("INPUT-PEEK"), makeSymbol("SELF"));

    static private final SubLList $list_alt155 = list(list(makeSymbol("OTHERWISE"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PARSE-ERROR"))))));

    private static final SubLSymbol LALR_PARSER = makeSymbol("LALR-PARSER");



    static private final SubLList $list_alt158 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXFORMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CAT-LA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VAL-LA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VAL-STACK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATE-STACK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TOP-CAT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXICON"), list(makeSymbol("NEW-LEXICON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXFORMS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXFORMS"), list(makeSymbol("NEW-LEXFORMS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSER-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARSER-NAME"), list(makeSymbol("NEW-PARSER-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CAT-LA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CAT-LA"), list(makeSymbol("NEW-CAT-LA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VAL-LA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VAL-LA"), list(makeSymbol("NEW-VAL-LA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VAL-STACK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VAL-STACK"), list(makeSymbol("NEW-VAL-STACK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VAL-STACK-PUSH"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VAL-STACK-POP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE-STACK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE-STACK"), list(makeSymbol("NEW-STATE-STACK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STATE-STACK-PUSH"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STATE-STACK-POP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOP-CAT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TOP-CAT"), list(makeSymbol("NEW-TOP-CAT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT-INPUT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ERROR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INPUT-PEEK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SHIFT-FROM"), list(makeSymbol("NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REDUCE-CAT"), list(makeSymbol("NAME"), makeSymbol("CAT"), makeSymbol("NDAUGHTERS"), makeSymbol("ACTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol TOP_CAT = makeSymbol("TOP-CAT");





    private static final SubLSymbol VAL_LA = makeSymbol("VAL-LA");

    private static final SubLSymbol CAT_LA = makeSymbol("CAT-LA");

    private static final SubLSymbol PARSER_NAME = makeSymbol("PARSER-NAME");

    private static final SubLSymbol LEXFORMS = makeSymbol("LEXFORMS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LALR_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LALR-PARSER-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LALR_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LALR-PARSER-INSTANCE");



    static private final SubLList $list_alt173 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt174 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PARSER-NAME"), NIL), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TOP-CAT"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym175$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_INITIALIZE_METHOD = makeSymbol("LALR-PARSER-INITIALIZE-METHOD");



    static private final SubLList $list_alt178 = list(list(makeSymbol("CSETQ"), makeSymbol("CAT-LA"), NIL), list(makeSymbol("CSETQ"), makeSymbol("VAL-LA"), NIL), list(makeSymbol("CSETQ"), makeSymbol("VAL-STACK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STATE-STACK"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym179$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_CLEAR_METHOD = makeSymbol("LALR-PARSER-CLEAR-METHOD");

    private static final SubLSymbol GET_LEXICON = makeSymbol("GET-LEXICON");

    static private final SubLList $list_alt182 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt183 = list(list(RET, makeSymbol("LEXICON")));

    static private final SubLSymbol $sym184$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_LEXICON_METHOD = makeSymbol("LALR-PARSER-GET-LEXICON-METHOD");



    static private final SubLList $list_alt187 = list(makeSymbol("NEW-LEXICON"));

    static private final SubLList $list_alt188 = list(list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-LEXICON"))), list(RET, makeSymbol("NEW-LEXICON")));

    static private final SubLSymbol $sym189$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_LEXICON_METHOD = makeSymbol("LALR-PARSER-SET-LEXICON-METHOD");

    private static final SubLSymbol GET_LEXFORMS = makeSymbol("GET-LEXFORMS");

    static private final SubLList $list_alt192 = list(NIL, makeKeyword("PUBLIC"));

    static private final SubLList $list_alt193 = list(list(RET, makeSymbol("LEXFORMS")));

    static private final SubLSymbol $sym194$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_LEXFORMS_METHOD = makeSymbol("LALR-PARSER-GET-LEXFORMS-METHOD");

    private static final SubLSymbol SET_LEXFORMS = makeSymbol("SET-LEXFORMS");

    static private final SubLList $list_alt197 = list(makeSymbol("NEW-LEXFORMS"));

    static private final SubLList $list_alt198 = list(list(makeSymbol("CSETQ"), makeSymbol("LEXFORMS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-LEXFORMS"))), list(RET, makeSymbol("NEW-LEXFORMS")));

    static private final SubLSymbol $sym199$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_LEXFORMS_METHOD = makeSymbol("LALR-PARSER-SET-LEXFORMS-METHOD");

    private static final SubLSymbol GET_PARSER_NAME = makeSymbol("GET-PARSER-NAME");

    static private final SubLList $list_alt202 = list(list(RET, makeSymbol("PARSER-NAME")));

    static private final SubLSymbol $sym203$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_PARSER_NAME_METHOD = makeSymbol("LALR-PARSER-GET-PARSER-NAME-METHOD");

    private static final SubLSymbol SET_PARSER_NAME = makeSymbol("SET-PARSER-NAME");

    static private final SubLList $list_alt206 = list(makeSymbol("NEW-PARSER-NAME"));

    static private final SubLList $list_alt207 = list(list(makeSymbol("CSETQ"), makeSymbol("PARSER-NAME"), makeSymbol("NEW-PARSER-NAME")), list(RET, makeSymbol("NEW-PARSER-NAME")));

    static private final SubLSymbol $sym208$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_PARSER_NAME_METHOD = makeSymbol("LALR-PARSER-SET-PARSER-NAME-METHOD");

    private static final SubLSymbol GET_CAT_LA = makeSymbol("GET-CAT-LA");

    static private final SubLList $list_alt211 = list(list(RET, makeSymbol("CAT-LA")));

    static private final SubLSymbol $sym212$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_CAT_LA_METHOD = makeSymbol("LALR-PARSER-GET-CAT-LA-METHOD");

    private static final SubLSymbol SET_CAT_LA = makeSymbol("SET-CAT-LA");

    static private final SubLList $list_alt215 = list(makeSymbol("NEW-CAT-LA"));

    static private final SubLList $list_alt216 = list(list(makeSymbol("CSETQ"), makeSymbol("CAT-LA"), makeSymbol("NEW-CAT-LA")), list(RET, makeSymbol("NEW-CAT-LA")));

    static private final SubLSymbol $sym217$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_CAT_LA_METHOD = makeSymbol("LALR-PARSER-SET-CAT-LA-METHOD");

    private static final SubLSymbol GET_VAL_LA = makeSymbol("GET-VAL-LA");

    static private final SubLList $list_alt220 = list(list(RET, makeSymbol("VAL-LA")));

    static private final SubLSymbol $sym221$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_VAL_LA_METHOD = makeSymbol("LALR-PARSER-GET-VAL-LA-METHOD");

    private static final SubLSymbol SET_VAL_LA = makeSymbol("SET-VAL-LA");

    static private final SubLList $list_alt224 = list(makeSymbol("NEW-VAL-LA"));

    static private final SubLList $list_alt225 = list(list(makeSymbol("CSETQ"), makeSymbol("VAL-LA"), makeSymbol("NEW-VAL-LA")), list(RET, makeSymbol("NEW-VAL-LA")));

    static private final SubLSymbol $sym226$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_VAL_LA_METHOD = makeSymbol("LALR-PARSER-SET-VAL-LA-METHOD");

    private static final SubLSymbol GET_VAL_STACK = makeSymbol("GET-VAL-STACK");

    static private final SubLList $list_alt229 = list(list(RET, makeSymbol("VAL-STACK")));

    static private final SubLSymbol $sym230$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_VAL_STACK_METHOD = makeSymbol("LALR-PARSER-GET-VAL-STACK-METHOD");

    private static final SubLSymbol SET_VAL_STACK = makeSymbol("SET-VAL-STACK");

    static private final SubLList $list_alt233 = list(makeSymbol("NEW-VAL-STACK"));

    static private final SubLList $list_alt234 = list(list(makeSymbol("CSETQ"), makeSymbol("VAL-STACK"), makeSymbol("NEW-VAL-STACK")), list(RET, makeSymbol("NEW-VAL-STACK")));

    static private final SubLSymbol $sym235$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_VAL_STACK_METHOD = makeSymbol("LALR-PARSER-SET-VAL-STACK-METHOD");

    private static final SubLSymbol VAL_STACK_PUSH = makeSymbol("VAL-STACK-PUSH");

    static private final SubLList $list_alt238 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt239 = list(list(makeSymbol("CPUSH"), makeSymbol("NEW-VALUE"), makeSymbol("VAL-STACK")), list(RET, makeSymbol("VAL-STACK")));

    static private final SubLSymbol $sym240$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_VAL_STACK_PUSH_METHOD = makeSymbol("LALR-PARSER-VAL-STACK-PUSH-METHOD");

    private static final SubLSymbol VAL_STACK_POP = makeSymbol("VAL-STACK-POP");

    static private final SubLList $list_alt243 = list(list(makeSymbol("PWHEN"), makeSymbol("VAL-STACK"), list(makeSymbol("CLET"), list(list(makeSymbol("TOP-VALUE"), list(makeSymbol("CAR"), makeSymbol("VAL-STACK")))), list(makeSymbol("CPOP"), makeSymbol("VAL-STACK")), list(RET, makeSymbol("TOP-VALUE")))), list(RET, NIL));

    static private final SubLSymbol $sym244$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_VAL_STACK_POP_METHOD = makeSymbol("LALR-PARSER-VAL-STACK-POP-METHOD");

    private static final SubLSymbol GET_STATE_STACK = makeSymbol("GET-STATE-STACK");

    static private final SubLList $list_alt247 = list(list(RET, makeSymbol("STATE-STACK")));

    static private final SubLSymbol $sym248$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_STATE_STACK_METHOD = makeSymbol("LALR-PARSER-GET-STATE-STACK-METHOD");

    private static final SubLSymbol SET_STATE_STACK = makeSymbol("SET-STATE-STACK");

    static private final SubLList $list_alt251 = list(makeSymbol("NEW-STATE-STACK"));

    static private final SubLList $list_alt252 = list(list(makeSymbol("CSETQ"), makeSymbol("STATE-STACK"), makeSymbol("NEW-STATE-STACK")), list(RET, makeSymbol("NEW-STATE-STACK")));

    static private final SubLSymbol $sym253$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_STATE_STACK_METHOD = makeSymbol("LALR-PARSER-SET-STATE-STACK-METHOD");

    private static final SubLSymbol STATE_STACK_PUSH = makeSymbol("STATE-STACK-PUSH");

    static private final SubLList $list_alt256 = list(list(makeSymbol("CPUSH"), makeSymbol("NEW-VALUE"), makeSymbol("STATE-STACK")), list(RET, makeSymbol("STATE-STACK")));

    static private final SubLSymbol $sym257$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_STATE_STACK_PUSH_METHOD = makeSymbol("LALR-PARSER-STATE-STACK-PUSH-METHOD");

    private static final SubLSymbol STATE_STACK_POP = makeSymbol("STATE-STACK-POP");

    static private final SubLList $list_alt260 = list(list(makeSymbol("PWHEN"), makeSymbol("STATE-STACK"), list(makeSymbol("CLET"), list(list(makeSymbol("TOP-VALUE"), list(makeSymbol("CAR"), makeSymbol("STATE-STACK")))), list(makeSymbol("CPOP"), makeSymbol("STATE-STACK")), list(RET, makeSymbol("TOP-VALUE")))), list(RET, NIL));

    static private final SubLSymbol $sym261$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_STATE_STACK_POP_METHOD = makeSymbol("LALR-PARSER-STATE-STACK-POP-METHOD");

    private static final SubLSymbol GET_TOP_CAT = makeSymbol("GET-TOP-CAT");

    static private final SubLList $list_alt264 = list(list(RET, makeSymbol("TOP-CAT")));

    static private final SubLSymbol $sym265$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_GET_TOP_CAT_METHOD = makeSymbol("LALR-PARSER-GET-TOP-CAT-METHOD");

    private static final SubLSymbol SET_TOP_CAT = makeSymbol("SET-TOP-CAT");

    static private final SubLList $list_alt268 = list(makeSymbol("NEW-TOP-CAT"));

    static private final SubLList $list_alt269 = list(list(makeSymbol("CSETQ"), makeSymbol("TOP-CAT"), makeSymbol("NEW-TOP-CAT")), list(RET, makeSymbol("NEW-TOP-CAT")));

    static private final SubLSymbol $sym270$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SET_TOP_CAT_METHOD = makeSymbol("LALR-PARSER-SET-TOP-CAT-METHOD");

    private static final SubLSymbol NEXT_INPUT = makeSymbol("NEXT-INPUT");

    static private final SubLList $list_alt273 = list(list(RET, NIL));

    private static final SubLSymbol LALR_PARSER_NEXT_INPUT_METHOD = makeSymbol("LALR-PARSER-NEXT-INPUT-METHOD");

    private static final SubLSymbol PARSE_ERROR = makeSymbol("PARSE-ERROR");

    private static final SubLSymbol LALR_PARSER_PARSE_ERROR_METHOD = makeSymbol("LALR-PARSER-PARSE-ERROR-METHOD");

    private static final SubLSymbol INPUT_PEEK = makeSymbol("INPUT-PEEK");

    static private final SubLList $list_alt278 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("GET-CAT-LA"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NEXT-INPUT"))))), list(makeSymbol("SET-CAT-LA"), makeSymbol("SELF"), list(makeSymbol("LIST"), list(makeSymbol("CAR"), makeSymbol("NEW")))), list(makeSymbol("SET-VAL-LA"), makeSymbol("SELF"), list(makeSymbol("LIST"), list(makeSymbol("CDR"), makeSymbol("NEW")))))), list(RET, list(makeSymbol("FIRST"), list(makeSymbol("GET-CAT-LA"), makeSymbol("SELF")))));

    private static final SubLSymbol LALR_PARSER_INPUT_PEEK_METHOD = makeSymbol("LALR-PARSER-INPUT-PEEK-METHOD");

    static private final SubLList $list_alt280 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt281 = list(list(makeSymbol("STATE-STACK-PUSH"), makeSymbol("SELF"), makeSymbol("NAME")), list(makeSymbol("CPOP"), makeSymbol("CAT-LA")), list(makeSymbol("CLET"), list(list(makeSymbol("TOP-VAL"), list(makeSymbol("CAR"), makeSymbol("VAL-LA")))), list(makeSymbol("CPOP"), makeSymbol("VAL-LA")), list(RET, list(makeSymbol("VAL-STACK-PUSH"), makeSymbol("SELF"), makeSymbol("TOP-VAL")))));

    static private final SubLSymbol $sym282$OUTER_CATCH_FOR_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LALR-PARSER-METHOD");

    private static final SubLSymbol LALR_PARSER_SHIFT_FROM_METHOD = makeSymbol("LALR-PARSER-SHIFT-FROM-METHOD");

    static private final SubLList $list_alt284 = list(makeSymbol("NAME"), makeSymbol("CAT"), makeSymbol("NDAUGHTERS"), makeSymbol("ACTION"));

    static private final SubLList $list_alt285 = list(list(makeSymbol("PIF"), list(EQ, makeSymbol("CAT"), list(makeSymbol("GET-TOP-CAT"), makeSymbol("SELF"))), list(RET, list(makeSymbol("VAL-STACK-POP"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("DAUGHTER-VALUES"), NIL), list(makeSymbol("STATE"), makeSymbol("NAME"))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("NDAUGHTERS")), list(makeSymbol("CPUSH"), list(makeSymbol("VAL-STACK-POP"), makeSymbol("SELF")), makeSymbol("DAUGHTER-VALUES")), list(makeSymbol("CSETQ"), makeSymbol("STATE"), list(makeSymbol("STATE-STACK-POP"), makeSymbol("SELF")))), list(makeSymbol("SET-CAT-LA"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("CAT"), list(makeSymbol("GET-CAT-LA"), makeSymbol("SELF")))), list(makeSymbol("SET-VAL-LA"), makeSymbol("SELF"), list(makeSymbol("CONS"), list(makeSymbol("APPLY-INSTANCE-METHOD"), makeSymbol("SELF"), makeSymbol("ACTION"), makeSymbol("DAUGHTER-VALUES")), list(makeSymbol("GET-VAL-LA"), makeSymbol("SELF")))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), makeSymbol("STATE"))))));

    private static final SubLSymbol LALR_PARSER_REDUCE_CAT_METHOD = makeSymbol("LALR-PARSER-REDUCE-CAT-METHOD");



    private static final SubLSymbol LALR_PARSER_PARSE_METHOD = makeSymbol("LALR-PARSER-PARSE-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER = makeSymbol("CYBLACK-LALR-PARSER");

    static private final SubLList $list_alt290 = list(new SubLObject[]{ list(makeSymbol("TOKENS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-TOKEN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXIFIER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OPENED-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOKENS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TOKENS"), list(makeSymbol("NEW-TOKENS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CURRENT-TOKEN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CURRENT-TOKEN"), list(makeSymbol("NEW-TOKEN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXIFIER"), list(makeSymbol("NEW-LEXIFIER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT-INPUT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-ERROR"), NIL, makeKeyword("PROTECTED")) });







    private static final SubLSymbol OPENED_P = makeSymbol("OPENED-P");

    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LALR_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LALR-PARSER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LALR_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LALR-PARSER-INSTANCE");

    static private final SubLList $list_alt298 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TOKENS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TOKEN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("OPENED-P"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym299$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER_INITIALIZE_METHOD = makeSymbol("CYBLACK-LALR-PARSER-INITIALIZE-METHOD");

    private static final SubLSymbol GET_TOKENS = makeSymbol("GET-TOKENS");

    static private final SubLList $list_alt302 = list(list(RET, makeSymbol("TOKENS")));

    static private final SubLSymbol $sym303$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER_GET_TOKENS_METHOD = makeSymbol("CYBLACK-LALR-PARSER-GET-TOKENS-METHOD");

    private static final SubLSymbol SET_TOKENS = makeSymbol("SET-TOKENS");

    static private final SubLList $list_alt306 = list(makeSymbol("NEW-TOKENS"));

    static private final SubLList $list_alt307 = list(list(makeSymbol("CSETQ"), makeSymbol("TOKENS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-TOKENS"))), list(RET, makeSymbol("NEW-TOKENS")));

    static private final SubLSymbol $sym308$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER_SET_TOKENS_METHOD = makeSymbol("CYBLACK-LALR-PARSER-SET-TOKENS-METHOD");

    private static final SubLSymbol GET_CURRENT_TOKEN = makeSymbol("GET-CURRENT-TOKEN");

    static private final SubLList $list_alt311 = list(list(RET, makeSymbol("CURRENT-TOKEN")));

    static private final SubLSymbol $sym312$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER_GET_CURRENT_TOKEN_METHOD = makeSymbol("CYBLACK-LALR-PARSER-GET-CURRENT-TOKEN-METHOD");

    private static final SubLSymbol SET_CURRENT_TOKEN = makeSymbol("SET-CURRENT-TOKEN");

    static private final SubLList $list_alt315 = list(makeSymbol("NEW-TOKEN"));

    static private final SubLList $list_alt316 = list(list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TOKEN"), makeSymbol("NEW-TOKEN")), list(RET, makeSymbol("NEW-TOKEN")));

    static private final SubLSymbol $sym317$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER_SET_CURRENT_TOKEN_METHOD = makeSymbol("CYBLACK-LALR-PARSER-SET-CURRENT-TOKEN-METHOD");

    private static final SubLSymbol GET_LEXIFIER = makeSymbol("GET-LEXIFIER");

    static private final SubLList $list_alt320 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt321 = list(list(RET, makeSymbol("LEXIFIER")));

    private static final SubLSymbol CYBLACK_LALR_PARSER_GET_LEXIFIER_METHOD = makeSymbol("CYBLACK-LALR-PARSER-GET-LEXIFIER-METHOD");

    private static final SubLSymbol SET_LEXIFIER = makeSymbol("SET-LEXIFIER");

    static private final SubLList $list_alt324 = list(makeSymbol("NEW-LEXIFIER"));

    static private final SubLList $list_alt325 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-LEXIFIER")), list(makeSymbol("CYBLACK-LEXIFIER-P"), makeSymbol("NEW-LEXIFIER"))), makeString("(SET-LEXIFIER ~S): ~S is not an instance of CYBLACK-LEXIFIER."), makeSymbol("SELF"), makeSymbol("NEW-LEXIFIER")), list(makeSymbol("CSETQ"), makeSymbol("LEXIFIER"), makeSymbol("NEW-LEXIFIER")), list(RET, makeSymbol("NEW-LEXIFIER")));

    static private final SubLSymbol $sym326$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    static private final SubLString $str_alt327$_SET_LEXIFIER__S____S_is_not_an_i = makeString("(SET-LEXIFIER ~S): ~S is not an instance of CYBLACK-LEXIFIER.");

    private static final SubLSymbol CYBLACK_LALR_PARSER_SET_LEXIFIER_METHOD = makeSymbol("CYBLACK-LALR-PARSER-SET-LEXIFIER-METHOD");

    static private final SubLList $list_alt329 = list(list(makeSymbol("PIF"), makeSymbol("LEXIFIER"), list(makeSymbol("PROGN"), list(makeSymbol("PUNLESS"), makeSymbol("OPENED-P"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXIFIER"), list(QUOTE, makeSymbol("OPEN-SOURCE"))), list(makeSymbol("CSETQ"), makeSymbol("OPENED-P"), T)), list(makeSymbol("CLET"), list(list(makeSymbol("LEXEME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXIFIER"), list(QUOTE, makeSymbol("GET-LEXEME"))))), list(makeSymbol("PUNLESS"), makeSymbol("LEXEME"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TOKEN"), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXIFIER"), list(QUOTE, makeSymbol("CLOSE-SOURCE"))), list(makeSymbol("CSETQ"), makeSymbol("OPENED-P"), NIL), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TOKEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXEME"), list(QUOTE, makeSymbol("GET-TOKEN")))), list(makeSymbol("CLET"), list(list(makeSymbol("CATEGORY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXEME"), list(QUOTE, makeSymbol("GET-CATEGORY"))))), list(RET, list(makeSymbol("CONS"), makeSymbol("CATEGORY"), list(makeSymbol("LIST"), makeSymbol("CATEGORY"), makeSymbol("CURRENT-TOKEN"))))))), list(makeSymbol("PROGN"), list(makeSymbol("PUNLESS"), makeSymbol("TOKENS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TOKEN"), NIL), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-TOKEN"), list(makeSymbol("CAR"), makeSymbol("TOKENS"))), list(makeSymbol("CPOP"), makeSymbol("TOKENS")), list(makeSymbol("CLET"), list(list(makeSymbol("ASSOCIATION"), list(makeSymbol("ASSOC"), makeSymbol("CURRENT-TOKEN"), makeSymbol("LEXICON"))), list(makeSymbol("CATEGORY"), list(makeSymbol("FIF"), makeSymbol("ASSOCIATION"), list(makeSymbol("CADR"), makeSymbol("ASSOCIATION")), NIL))), list(makeSymbol("MUST"), makeSymbol("CATEGORY"), makeString("(NEXT-INPUT ~S): Could find no lexical entry for ~S."), makeSymbol("CURRENT-TOKEN")), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("CONS"), makeSymbol("CATEGORY"), list(makeSymbol("LIST"), makeSymbol("CATEGORY"), makeSymbol("CURRENT-TOKEN"))))), list(RET, makeSymbol("RESULT")))))));

    static private final SubLSymbol $sym330$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol OPEN_SOURCE = makeSymbol("OPEN-SOURCE");

    private static final SubLSymbol GET_LEXEME = makeSymbol("GET-LEXEME");

    private static final SubLSymbol CLOSE_SOURCE = makeSymbol("CLOSE-SOURCE");

    private static final SubLSymbol GET_TOKEN = makeSymbol("GET-TOKEN");



    static private final SubLString $str_alt336$_NEXT_INPUT__S___Could_find_no_le = makeString("(NEXT-INPUT ~S): Could find no lexical entry for ~S.");

    private static final SubLSymbol CYBLACK_LALR_PARSER_NEXT_INPUT_METHOD = makeSymbol("CYBLACK-LALR-PARSER-NEXT-INPUT-METHOD");

    static private final SubLSymbol $sym338$OUTER_CATCH_FOR_CYBLACK_LALR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LALR-PARSER-METHOD");

    private static final SubLSymbol CYBLACK_LALR_PARSER_PARSE_ERROR_METHOD = makeSymbol("CYBLACK-LALR-PARSER-PARSE-ERROR-METHOD");

    static private final SubLList $list_alt340 = listS(makeSymbol("DEFSYMBOL"), listS(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME"), makeSymbol("OPTIONS")), makeSymbol("LAMBDA-LIST"), makeSymbol("BODY"));

    static private final SubLList $list_alt341 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt342 = list(makeSymbol("CLEAR"), makeSymbol("SELF"));

    static private final SubLList $list_alt343 = list(makeSymbol("SET-TOKENS"), makeSymbol("SELF"), makeSymbol("NEW-TOKENS"));







    static private final SubLList $list_alt347 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED"));

    static private final SubLList $list_alt348 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), NIL, makeKeyword("PUBLIC")));

    static private final SubLList $list_alt349 = list(makeSymbol("INITIALIZE"), makeSymbol("SUPER"));







    static private final SubLList $list_alt353 = list(list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt354 = list(list(makeSymbol("S"), makeSymbol("-->"), makeSymbol("NP"), makeSymbol("VP"), list(makeSymbol("LAMBDA"), list(makeSymbol("NP"), makeSymbol("VP")), list(makeSymbol("LIST"), list(QUOTE, makeSymbol("S")), makeSymbol("NP"), makeSymbol("VP")))), list(makeSymbol("NP"), makeSymbol("-->"), makeSymbol("DET"), makeSymbol("N"), list(makeSymbol("LAMBDA"), list(makeSymbol("DET"), makeSymbol("N")), list(makeSymbol("LIST"), list(QUOTE, makeSymbol("NP")), makeSymbol("DET"), makeSymbol("N")))), list(makeSymbol("NP"), makeSymbol("-->"), list(makeSymbol("LAMBDA"), NIL, list(QUOTE, list(makeSymbol("NP"))))), list(makeSymbol("VP"), makeSymbol("-->"), makeSymbol("V"), makeSymbol("NP"), list(makeSymbol("LAMBDA"), list(makeSymbol("V"), makeSymbol("NP")), list(makeSymbol("LIST"), list(QUOTE, makeSymbol("VP")), makeSymbol("V"), makeSymbol("NP")))), list(makeSymbol("VP"), makeSymbol("-->"), makeSymbol("V"), makeSymbol("S"), list(makeSymbol("LAMBDA"), list(makeSymbol("V"), makeSymbol("S")), list(makeSymbol("LIST"), list(QUOTE, makeSymbol("VP")), makeSymbol("V"), makeSymbol("S")))));

    static private final SubLList $list_alt355 = list(makeSymbol("DET"), makeSymbol("N"), makeSymbol("V"));

    static private final SubLList $list_alt356 = list(new SubLObject[]{ list(makeSymbol("THE"), makeSymbol("DET")), list(makeSymbol("MAN"), makeSymbol("N")), list(makeSymbol("WOMAN"), makeSymbol("N")), list(makeSymbol("CAT"), makeSymbol("N")), list(makeSymbol("DOG"), makeSymbol("N")), list(makeSymbol("LOVES"), makeSymbol("V")), list(makeSymbol("THINKS"), makeSymbol("V")), list(makeSymbol("HATES"), makeSymbol("V")), list(makeSymbol("$"), makeSymbol("$")) });

    static private final SubLList $list_alt357 = list(makeKeyword("EXTENDS"), makeKeyword("GRAMMAR"), makeKeyword("LEXICON"), makeKeyword("LEXFORMS"), makeKeyword("TOP-CATEGORY"));

    private static final SubLSymbol LALR_PARSER_OPTION = makeSymbol("LALR-PARSER-OPTION");

    static private final SubLString $str_alt359$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_LALR_PARSER_OPTION = makeSymbol("ENCODE-LALR-PARSER-OPTION");

    static private final SubLString $str_alt361$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_LALR_PARSER_OPTION = makeSymbol("DECODE-LALR-PARSER-OPTION");

    static private final SubLString $str_alt363$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol LALR_PARSER_OPTION_P = makeSymbol("LALR-PARSER-OPTION-P");

    private static final SubLSymbol LAMBDA = makeSymbol("LAMBDA");

    static private final SubLString $str_alt366$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid lambda expression. ~\n     An expression of the form (lambda <arg list> <expression>) was expected.");

    static private final SubLString $str_alt367$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid grammar rule.  A list was expected.");

    static private final SubLSymbol $sym368$___ = makeSymbol("-->");

    static private final SubLString $str_alt369$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid grammar rule.  ~\n     A list of the form (<category> --> <category>* [<lambda>]) was expected.");

    static private final SubLString $str_alt370$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid category.");

    static private final SubLString $str_alt371$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid grammar.  A list of grammar rules was expected.");

    static private final SubLString $str_alt372$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid lexical entry.  An expression ~\n     of the form (<lexeme> <category>) was expected.");

    static private final SubLString $str_alt373$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid lexicon.  A list of (<term> <category>) was expected.");

    private static final SubLSymbol CYBLACK_LEXIFIER = makeSymbol("CYBLACK-LEXIFIER");

    static private final SubLString $str_alt375$DEFINE_LALR_PARSER___S_does_not_i = makeString("DEFINE-LALR-PARSER: ~S does not implement CYBLACK-LEXIFIER.");

    static private final SubLString $str_alt376$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a value list of lexical form categories.  A list of symbols was expected.");

    static private final SubLString $str_alt377$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid lexical form category.  A non-nil symbol was expected.");

    static private final SubLString $str_alt378$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid category.  A non-nil symbol was expected.");

    static private final SubLString $str_alt379$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid options list.  A property list was expected.");

    private static final SubLSymbol $GRAMMAR = makeKeyword("GRAMMAR");



    private static final SubLSymbol $LEXIFIER = makeKeyword("LEXIFIER");

    private static final SubLSymbol $LEXFORMS = makeKeyword("LEXFORMS");

    private static final SubLSymbol $TOP_CATEGORY = makeKeyword("TOP-CATEGORY");

    static private final SubLString $str_alt385$DEFINE_LALR_PARSER__The_following = makeString("DEFINE-LALR-PARSER: The following required options are not specified: ~S");

    private static final SubLSymbol $LEXFORM = makeKeyword("LEXFORM");

    static private final SubLSymbol $sym387$_ = makeSymbol("$");

    static private final SubLList $list_alt388 = list(makeSymbol("PARSER-CLASS"), makeSymbol("&REST"), makeSymbol("OPTIONS"));

    static private final SubLString $str_alt389$DEFINE_LALR_PARSER___S_is_not_a_v = makeString("DEFINE-LALR-PARSER: ~S is not a valid class name.  A non-nil symbol was expected.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_lalr_file();
    }

    public void initializeVariables() {
        init_cyblack_lalr_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_lalr_file();
    }
}

