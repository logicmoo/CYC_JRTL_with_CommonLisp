package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pattern_match extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pattern_match";
    public static final String myFingerPrint = "57f74d5232215c437181a29fccc023b458d7985e877d92c91fc579d24342fe10";
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 1408L)
    private static SubLSymbol $pattern_matches_tree_bindings$;
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 1565L)
    public static SubLSymbol $pattern_matches_tree_atomic_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 1847L)
    public static SubLSymbol $pattern_matches_tree_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10015L)
    private static SubLSymbol $pattern_transform_tree_bindings$;
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10182L)
    public static SubLSymbol $pattern_transform_match_method$;
    private static final SubLSymbol $kw0$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym1$IGNORE_ERRORS_HANDLER;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw5$MATCH_METHOD;
    private static final SubLSymbol $sym6$TREE_MATCHES_PATTERN;
    private static final SubLSymbol $sym7$SUCCESS;
    private static final SubLSymbol $sym8$BINDINGS;
    private static final SubLSymbol $sym9$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym10$PWHEN;
    private static final SubLSymbol $sym11$CLET;
    private static final SubLSymbol $sym12$IGNORE;
    private static final SubLSymbol $sym13$ALIST_LOOKUP_WITHOUT_VALUES;
    private static final SubLSymbol $sym14$QUOTE;
    private static final SubLSymbol $kw15$ANYTHING;
    private static final SubLSymbol $kw16$NOTHING;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$BIND;
    private static final SubLSymbol $kw20$VALUE;
    private static final SubLSymbol $kw21$AND;
    private static final SubLSymbol $kw22$OR;
    private static final SubLSymbol $kw23$NOT;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$TEST;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$TREE_FIND;
    private static final SubLSymbol $kw31$TREE_FIND_IF;
    private static final SubLSymbol $kw32$QUOTE;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$PATTERN_MATCHES_TREE_RECURSIVE;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$KEYWORDP;
    private static final SubLSymbol $kw37$INPUT;
    private static final SubLSymbol $kw38$BINDINGS;
    private static final SubLList $list39;
    private static final SubLSymbol $kw40$TUPLE;
    private static final SubLSymbol $kw41$TEMPLATE;
    private static final SubLSymbol $kw42$CALL;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$WITH_TREE_PATTERN_BINDINGS;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$PATTERN_MATCHES_TREE;
    private static final SubLSymbol $kw52$OWNER;
    private static final SubLSymbol $kw53$CLASSES;
    private static final SubLSymbol $kw54$KB;
    private static final SubLSymbol $kw55$TINY;
    private static final SubLSymbol $kw56$WORKING_;
    private static final SubLList $list57;
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 2125L)
    public static SubLObject pattern_matches_tree(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)pattern_match.NIL;
        SubLObject v_bindings = (SubLObject)pattern_match.NIL;
        SubLObject ignore_errors_tag = (SubLObject)pattern_match.NIL;
        try {
            thread.throwStack.push(pattern_match.$kw0$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)pattern_match.$sym1$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$1 = pattern_match.$pattern_matches_tree_bindings$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_bindings$.bind((SubLObject)pattern_match.NIL, thread);
                        if (pattern_match.NIL != pattern_matches_tree_internal(pattern, tree)) {
                            success = (SubLObject)pattern_match.T;
                            v_bindings = Sequences.nreverse(pattern_match.$pattern_matches_tree_bindings$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pattern_match.$pattern_matches_tree_bindings$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)pattern_match.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)pattern_match.$kw0$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return subl_promotions.values2(success, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 2558L)
    public static SubLObject pattern_matches_tree_without_bindings(final SubLObject pattern, final SubLObject tree) {
        return pattern_matches_tree_internal(pattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 2890L)
    public static SubLObject tree_matches_pattern(final SubLObject tree, final SubLObject pattern) {
        return pattern_matches_tree(pattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 3026L)
    public static SubLObject with_tree_pattern_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_variables = (SubLObject)pattern_match.NIL;
        SubLObject tree = (SubLObject)pattern_match.NIL;
        SubLObject pattern = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list2);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list2);
        tree = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list2);
        pattern = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pattern_match.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pattern_match.NIL;
        SubLObject current_$2 = (SubLObject)pattern_match.NIL;
        while (pattern_match.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pattern_match.$list2);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pattern_match.$list2);
            if (pattern_match.NIL == conses_high.member(current_$2, (SubLObject)pattern_match.$list3, (SubLObject)pattern_match.UNPROVIDED, (SubLObject)pattern_match.UNPROVIDED)) {
                bad = (SubLObject)pattern_match.T;
            }
            if (current_$2 == pattern_match.$kw4$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pattern_match.NIL != bad && pattern_match.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pattern_match.$list2);
        }
        final SubLObject match_method_tail = cdestructuring_bind.property_list_member((SubLObject)pattern_match.$kw5$MATCH_METHOD, current);
        SubLObject match_method = (SubLObject)((pattern_match.NIL != match_method_tail) ? conses_high.cadr(match_method_tail) : pattern_match.NIL);
        final SubLObject body;
        current = (body = temp);
        if (pattern_match.NIL == match_method) {
            match_method = (SubLObject)pattern_match.$sym6$TREE_MATCHES_PATTERN;
        }
        final SubLObject success = (SubLObject)pattern_match.$sym7$SUCCESS;
        final SubLObject v_bindings = (SubLObject)pattern_match.$sym8$BINDINGS;
        final SubLObject variable_specs = pattern_bindings_variable_specs(v_variables, v_bindings);
        return (SubLObject)ConsesLow.listS((SubLObject)pattern_match.$sym9$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(success, v_bindings), (SubLObject)ConsesLow.list(match_method, tree, pattern), ConsesLow.append((SubLObject)((pattern_match.NIL != variable_specs) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pattern_match.$sym10$PWHEN, success, (SubLObject)ConsesLow.listS((SubLObject)pattern_match.$sym11$CLET, variable_specs, ConsesLow.append(body, (SubLObject)pattern_match.NIL)))) : ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pattern_match.$sym12$IGNORE, v_bindings), (SubLObject)ConsesLow.listS((SubLObject)pattern_match.$sym10$PWHEN, success, ConsesLow.append(body, (SubLObject)pattern_match.NIL)))), (SubLObject)pattern_match.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 3804L)
    public static SubLObject pattern_bindings_variable_specs(final SubLObject v_variables, final SubLObject bindings_var) {
        SubLObject variable_specs = (SubLObject)pattern_match.NIL;
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = (SubLObject)pattern_match.NIL;
        variable = cdolist_list_var.first();
        while (pattern_match.NIL != cdolist_list_var) {
            final SubLObject variable_spec = (SubLObject)ConsesLow.list(variable, (SubLObject)ConsesLow.list((SubLObject)pattern_match.$sym13$ALIST_LOOKUP_WITHOUT_VALUES, bindings_var, (SubLObject)ConsesLow.list((SubLObject)pattern_match.$sym14$QUOTE, variable)));
            variable_specs = (SubLObject)ConsesLow.cons(variable_spec, variable_specs);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return variable_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4107L)
    public static SubLObject pattern_matches_tree_internal(final SubLObject pattern, final SubLObject tree) {
        return pattern_matches_tree_recursive(pattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4293L)
    public static SubLObject pattern_matches_tree_atomic_method_funcall(final SubLObject method, final SubLObject tree) {
        return Functions.funcall(method, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4412L)
    public static SubLObject pattern_matches_tree_method_funcall(final SubLObject method, final SubLObject pattern, final SubLObject tree) {
        return Functions.funcall(method, pattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4526L)
    public static SubLObject pattern_matches_tree_recursive(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pattern.isAtom()) {
            if (pattern.eql((SubLObject)pattern_match.$kw15$ANYTHING)) {
                return (SubLObject)pattern_match.T;
            }
            if (pattern.eql((SubLObject)pattern_match.$kw16$NOTHING)) {
                return (SubLObject)pattern_match.NIL;
            }
            SubLObject cdolist_list_var = pattern_match.$pattern_matches_tree_atomic_methods$.getDynamicValue(thread);
            SubLObject method_info = (SubLObject)pattern_match.NIL;
            method_info = cdolist_list_var.first();
            while (pattern_match.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = method_info;
                SubLObject method_operator = (SubLObject)pattern_match.NIL;
                SubLObject method = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list17);
                method_operator = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list17);
                method = current.first();
                current = current.rest();
                if (pattern_match.NIL == current) {
                    if (method_operator.eql(pattern)) {
                        return pattern_matches_tree_atomic_method_funcall(method, tree);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pattern_match.$list17);
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_info = cdolist_list_var.first();
            }
            return Equality.equal(pattern, tree);
        }
        else {
            SubLObject pattern_operator = (SubLObject)pattern_match.NIL;
            SubLObject pattern_args = (SubLObject)pattern_match.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)pattern_match.$list18);
            pattern_operator = pattern.first();
            final SubLObject current2 = pattern_args = pattern.rest();
            final SubLObject pcase_var = pattern_operator;
            if (pcase_var.eql((SubLObject)pattern_match.$kw19$BIND)) {
                return pattern_matches_tree_bind(pattern, tree);
            }
            if (pcase_var.eql((SubLObject)pattern_match.$kw20$VALUE)) {
                return pattern_matches_tree_value(pattern, tree);
            }
            if (pcase_var.eql((SubLObject)pattern_match.$kw21$AND)) {
                return pattern_matches_tree_and(pattern, tree);
            }
            if (pcase_var.eql((SubLObject)pattern_match.$kw22$OR)) {
                return pattern_matches_tree_or(pattern, tree);
            }
            if (pcase_var.eql((SubLObject)pattern_match.$kw23$NOT)) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = pattern_args;
                SubLObject sub_pattern = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)pattern_match.$list24);
                sub_pattern = current_$4.first();
                current_$4 = current_$4.rest();
                if (pattern_match.NIL == current_$4) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(pattern_match.NIL == pattern_matches_tree_recursive(sub_pattern, tree));
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)pattern_match.$list24);
            }
            else if (pcase_var.eql((SubLObject)pattern_match.$kw25$TEST)) {
                final SubLObject extra_arg_count = Numbers.subtract(Sequences.length(pattern_args), (SubLObject)pattern_match.ONE_INTEGER);
                if (pattern_match.ZERO_INTEGER.eql(extra_arg_count)) {
                    SubLObject current_$5;
                    final SubLObject datum_$4 = current_$5 = pattern_args;
                    SubLObject test = (SubLObject)pattern_match.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)pattern_match.$list26);
                    test = current_$5.first();
                    current_$5 = current_$5.rest();
                    if (pattern_match.NIL == current_$5) {
                        return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall(test, tree));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$4, (SubLObject)pattern_match.$list26);
                }
                else if (pattern_match.ONE_INTEGER.eql(extra_arg_count)) {
                    SubLObject current_$6;
                    final SubLObject datum_$5 = current_$6 = pattern_args;
                    SubLObject test = (SubLObject)pattern_match.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)pattern_match.$list27);
                    test = current_$6.first();
                    current_$6 = current_$6.rest();
                    final SubLObject arg2 = (SubLObject)(current_$6.isCons() ? current_$6.first() : pattern_match.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$6, datum_$5, (SubLObject)pattern_match.$list27);
                    current_$6 = current_$6.rest();
                    if (pattern_match.NIL == current_$6) {
                        return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall_2(test, tree, arg2));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)pattern_match.$list27);
                }
                else if (pattern_match.TWO_INTEGER.eql(extra_arg_count)) {
                    SubLObject current_$7;
                    final SubLObject datum_$6 = current_$7 = pattern_args;
                    SubLObject test = (SubLObject)pattern_match.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)pattern_match.$list28);
                    test = current_$7.first();
                    current_$7 = current_$7.rest();
                    final SubLObject arg2 = (SubLObject)(current_$7.isCons() ? current_$7.first() : pattern_match.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$7, datum_$6, (SubLObject)pattern_match.$list28);
                    current_$7 = current_$7.rest();
                    final SubLObject arg3 = (SubLObject)(current_$7.isCons() ? current_$7.first() : pattern_match.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$7, datum_$6, (SubLObject)pattern_match.$list28);
                    current_$7 = current_$7.rest();
                    if (pattern_match.NIL == current_$7) {
                        return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall_3(test, tree, arg2, arg3));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)pattern_match.$list28);
                }
                else if (pattern_match.THREE_INTEGER.eql(extra_arg_count)) {
                    SubLObject current_$8;
                    final SubLObject datum_$7 = current_$8 = pattern_args;
                    SubLObject test = (SubLObject)pattern_match.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)pattern_match.$list29);
                    test = current_$8.first();
                    current_$8 = current_$8.rest();
                    final SubLObject arg2 = (SubLObject)(current_$8.isCons() ? current_$8.first() : pattern_match.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$8, datum_$7, (SubLObject)pattern_match.$list29);
                    current_$8 = current_$8.rest();
                    final SubLObject arg3 = (SubLObject)(current_$8.isCons() ? current_$8.first() : pattern_match.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$8, datum_$7, (SubLObject)pattern_match.$list29);
                    current_$8 = current_$8.rest();
                    final SubLObject arg4 = (SubLObject)(current_$8.isCons() ? current_$8.first() : pattern_match.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$8, datum_$7, (SubLObject)pattern_match.$list29);
                    current_$8 = current_$8.rest();
                    if (pattern_match.NIL == current_$8) {
                        return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall_4(test, tree, arg2, arg3, arg4));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$7, (SubLObject)pattern_match.$list29);
                }
            }
            else if (pcase_var.eql((SubLObject)pattern_match.$kw30$TREE_FIND)) {
                SubLObject current_$9;
                final SubLObject datum_$8 = current_$9 = pattern_args;
                SubLObject sub_pattern = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)pattern_match.$list24);
                sub_pattern = current_$9.first();
                current_$9 = current_$9.rest();
                if (pattern_match.NIL == current_$9) {
                    return pattern_matches_tree_tree_find(sub_pattern, tree);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$8, (SubLObject)pattern_match.$list24);
            }
            else if (pcase_var.eql((SubLObject)pattern_match.$kw31$TREE_FIND_IF)) {
                SubLObject current_$10;
                final SubLObject datum_$9 = current_$10 = pattern_args;
                SubLObject sub_pattern = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)pattern_match.$list24);
                sub_pattern = current_$10.first();
                current_$10 = current_$10.rest();
                if (pattern_match.NIL == current_$10) {
                    return pattern_matches_tree_tree_find_if(sub_pattern, tree);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)pattern_match.$list24);
            }
            else {
                if (!pcase_var.eql((SubLObject)pattern_match.$kw32$QUOTE)) {
                    SubLObject cdolist_list_var2 = pattern_match.$pattern_matches_tree_methods$.getDynamicValue(thread);
                    SubLObject method_info2 = (SubLObject)pattern_match.NIL;
                    method_info2 = cdolist_list_var2.first();
                    while (pattern_match.NIL != cdolist_list_var2) {
                        SubLObject current_$11;
                        final SubLObject datum_$10 = current_$11 = method_info2;
                        SubLObject method_operator2 = (SubLObject)pattern_match.NIL;
                        SubLObject method2 = (SubLObject)pattern_match.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$10, (SubLObject)pattern_match.$list17);
                        method_operator2 = current_$11.first();
                        current_$11 = current_$11.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$10, (SubLObject)pattern_match.$list17);
                        method2 = current_$11.first();
                        current_$11 = current_$11.rest();
                        if (pattern_match.NIL == current_$11) {
                            if (method_operator2.eql(pattern_operator)) {
                                return pattern_matches_tree_method_funcall(method2, pattern, tree);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$10, (SubLObject)pattern_match.$list17);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        method_info2 = cdolist_list_var2.first();
                    }
                    return pattern_matches_tree_cons(pattern, tree);
                }
                SubLObject current_$12;
                final SubLObject datum_$11 = current_$12 = pattern_args;
                SubLObject quoted_object = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)pattern_match.$list33);
                quoted_object = current_$12.first();
                current_$12 = current_$12.rest();
                if (pattern_match.NIL == current_$12) {
                    return Equality.equal(quoted_object, tree);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$11, (SubLObject)pattern_match.$list33);
            }
            return (SubLObject)pattern_match.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7086L)
    public static SubLObject pattern_matches_tree_bind(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = conses_high.second(pattern);
        pattern_match.$pattern_matches_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values(pattern_match.$pattern_matches_tree_bindings$.getDynamicValue(thread), variable, tree, Symbols.symbol_function((SubLObject)pattern_match.EQL)), thread);
        return (SubLObject)pattern_match.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7353L)
    public static SubLObject pattern_matches_tree_value(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = conses_high.second(pattern);
        thread.resetMultipleValues();
        final SubLObject value = list_utilities.alist_lookup(pattern_match.$pattern_matches_tree_bindings$.getDynamicValue(thread), variable, Symbols.symbol_function((SubLObject)pattern_match.EQL), (SubLObject)pattern_match.UNPROVIDED);
        final SubLObject presentP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pattern_match.NIL != presentP) {
            return pattern_matches_tree_recursive(value, tree);
        }
        return (SubLObject)pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7633L)
    public static SubLObject pattern_matches_tree_and(final SubLObject pattern, final SubLObject tree) {
        SubLObject cdolist_list_var = pattern.rest();
        SubLObject sub_pattern = (SubLObject)pattern_match.NIL;
        sub_pattern = cdolist_list_var.first();
        while (pattern_match.NIL != cdolist_list_var) {
            if (pattern_match.NIL == pattern_matches_tree_recursive(sub_pattern, tree)) {
                return (SubLObject)pattern_match.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_pattern = cdolist_list_var.first();
        }
        return (SubLObject)pattern_match.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7822L)
    public static SubLObject pattern_matches_tree_or(final SubLObject pattern, final SubLObject tree) {
        SubLObject cdolist_list_var = pattern.rest();
        SubLObject sub_pattern = (SubLObject)pattern_match.NIL;
        sub_pattern = cdolist_list_var.first();
        while (pattern_match.NIL != cdolist_list_var) {
            if (pattern_match.NIL != pattern_matches_tree_recursive(sub_pattern, tree)) {
                return (SubLObject)pattern_match.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_pattern = cdolist_list_var.first();
        }
        return (SubLObject)pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8008L)
    public static SubLObject pattern_matches_tree_test_funcall(final SubLObject test, final SubLObject tree) {
        if (pattern_match.NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_1(test, tree);
        }
        return (SubLObject)pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8171L)
    public static SubLObject pattern_matches_tree_test_funcall_2(final SubLObject test, final SubLObject tree, final SubLObject arg2) {
        if (pattern_match.NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_2(test, tree, arg2);
        }
        return (SubLObject)pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8346L)
    public static SubLObject pattern_matches_tree_test_funcall_3(final SubLObject test, final SubLObject tree, final SubLObject arg2, final SubLObject arg3) {
        if (pattern_match.NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_3(test, tree, arg2, arg3);
        }
        return (SubLObject)pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8531L)
    public static SubLObject pattern_matches_tree_test_funcall_4(final SubLObject test, final SubLObject tree, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (pattern_match.NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_4(test, tree, arg2, arg3, arg4);
        }
        return (SubLObject)pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8726L)
    public static SubLObject pattern_matches_tree_tree_find(final SubLObject sub_pattern, final SubLObject tree) {
        return list_utilities.tree_find(sub_pattern, tree, Symbols.symbol_function((SubLObject)pattern_match.$sym34$PATTERN_MATCHES_TREE_RECURSIVE), (SubLObject)pattern_match.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8864L)
    public static SubLObject pattern_matches_tree_tree_find_if(final SubLObject sub_pattern, final SubLObject tree) {
        return list_utilities.tree_find_if(sub_pattern, tree, (SubLObject)pattern_match.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8975L)
    public static SubLObject pattern_matches_tree_cons(final SubLObject pattern, final SubLObject tree) {
        if (tree.isAtom()) {
            return (SubLObject)pattern_match.NIL;
        }
        SubLObject pattern_operator = (SubLObject)pattern_match.NIL;
        SubLObject pattern_args = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)pattern_match.$list18);
        pattern_operator = pattern.first();
        final SubLObject current = pattern_args = pattern.rest();
        SubLObject tree_operator = (SubLObject)pattern_match.NIL;
        SubLObject tree_args = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tree, tree, (SubLObject)pattern_match.$list35);
        tree_operator = tree.first();
        final SubLObject current_$22 = tree_args = tree.rest();
        if (pattern_match.NIL == pattern_matches_tree_recursive(pattern_operator, tree_operator)) {
            return (SubLObject)pattern_match.NIL;
        }
        if (pattern_match.NIL != possibly_match_pattern_p(pattern_args)) {
            return pattern_matches_tree_recursive(pattern_args, tree_args);
        }
        SubLObject rest_pattern_args;
        SubLObject rest_tree_args;
        SubLObject next_pattern_arg;
        SubLObject next_tree_arg;
        for (rest_pattern_args = (SubLObject)pattern_match.NIL, rest_tree_args = (SubLObject)pattern_match.NIL, rest_pattern_args = pattern_args, rest_tree_args = tree_args; !rest_pattern_args.isAtom() && !rest_tree_args.isAtom(); rest_pattern_args = rest_pattern_args.rest(), rest_tree_args = rest_tree_args.rest()) {
            next_pattern_arg = rest_pattern_args.first();
            next_tree_arg = rest_tree_args.first();
            if (pattern_match.NIL == pattern_matches_tree_recursive(next_pattern_arg, next_tree_arg)) {
                return (SubLObject)pattern_match.NIL;
            }
        }
        return pattern_matches_tree_recursive(rest_pattern_args, rest_tree_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 9888L)
    public static SubLObject possibly_match_pattern_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && pattern_match.NIL != cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)pattern_match.$sym36$KEYWORDP), v_object, (SubLObject)pattern_match.UNPROVIDED, (SubLObject)pattern_match.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10242L)
    public static SubLObject pattern_transform_tree(final SubLObject pattern, final SubLObject tree, SubLObject v_bindings) {
        if (v_bindings == pattern_match.UNPROVIDED) {
            v_bindings = (SubLObject)pattern_match.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)pattern_match.NIL;
        SubLObject new_bindings = (SubLObject)pattern_match.NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_transform_tree_bindings$.currentBinding(thread);
        try {
            pattern_match.$pattern_transform_tree_bindings$.bind(v_bindings, thread);
            v_answer = pattern_transform_tree_internal(pattern, tree);
            new_bindings = pattern_match.$pattern_transform_tree_bindings$.getDynamicValue(thread);
        }
        finally {
            pattern_match.$pattern_transform_tree_bindings$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(v_answer, new_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10682L)
    public static SubLObject tree_pattern_transform(final SubLObject tree, final SubLObject pattern, SubLObject v_bindings) {
        if (v_bindings == pattern_match.UNPROVIDED) {
            v_bindings = (SubLObject)pattern_match.NIL;
        }
        return pattern_transform_tree(pattern, tree, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10918L)
    public static SubLObject pattern_transform_tree_internal(final SubLObject pattern, final SubLObject tree) {
        return pattern_transform_tree_recursive(pattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 11112L)
    public static SubLObject pattern_transform_tree_recursive(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!pattern.isAtom()) {
            SubLObject pattern_operator = (SubLObject)pattern_match.NIL;
            SubLObject pattern_args = (SubLObject)pattern_match.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)pattern_match.$list18);
            pattern_operator = pattern.first();
            final SubLObject current = pattern_args = pattern.rest();
            final SubLObject pcase_var = pattern_operator;
            if (pcase_var.eql((SubLObject)pattern_match.$kw20$VALUE)) {
                SubLObject current_$24;
                final SubLObject datum_$23 = current_$24 = pattern_args;
                SubLObject variable = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, (SubLObject)pattern_match.$list39);
                variable = current_$24.first();
                current_$24 = current_$24.rest();
                if (pattern_match.NIL == current_$24) {
                    return list_utilities.alist_lookup_without_values(pattern_match.$pattern_transform_tree_bindings$.getDynamicValue(thread), variable, Symbols.symbol_function((SubLObject)pattern_match.EQL), (SubLObject)pattern_match.NIL);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$23, (SubLObject)pattern_match.$list39);
            }
            else {
                if (pcase_var.eql((SubLObject)pattern_match.$kw40$TUPLE)) {
                    return pattern_transform_tuple(pattern, tree);
                }
                if (pcase_var.eql((SubLObject)pattern_match.$kw41$TEMPLATE)) {
                    return pattern_transform_template(pattern, tree);
                }
                if (pcase_var.eql((SubLObject)pattern_match.$kw42$CALL)) {
                    return pattern_transform_call(pattern, tree);
                }
                if (!pcase_var.eql((SubLObject)pattern_match.$kw32$QUOTE)) {
                    return pattern_transform_cons(pattern, tree);
                }
                SubLObject current_$25;
                final SubLObject datum_$24 = current_$25 = pattern_args;
                SubLObject quoted_object = (SubLObject)pattern_match.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$25, datum_$24, (SubLObject)pattern_match.$list33);
                quoted_object = current_$25.first();
                current_$25 = current_$25.rest();
                if (pattern_match.NIL == current_$25) {
                    return quoted_object;
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$24, (SubLObject)pattern_match.$list33);
            }
            return (SubLObject)pattern_match.NIL;
        }
        if (pattern.eql((SubLObject)pattern_match.$kw37$INPUT)) {
            return tree;
        }
        if (pattern.eql((SubLObject)pattern_match.$kw38$BINDINGS)) {
            return pattern_match.$pattern_transform_tree_bindings$.getDynamicValue(thread);
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 12111L)
    public static SubLObject pattern_transform_tuple(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)pattern_match.NIL;
        SubLObject v_variables = (SubLObject)pattern_match.NIL;
        SubLObject subpattern = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)pattern_match.$list43);
        operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)pattern_match.$list43);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)pattern_match.$list43);
        subpattern = current.first();
        current = current.rest();
        if (pattern_match.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)pattern_match.$list43);
            return (SubLObject)pattern_match.NIL;
        }
        if (!tree.isList() || !v_variables.isList() || pattern_match.NIL == list_utilities.lengthE(tree, Sequences.length(v_variables), (SubLObject)pattern_match.UNPROVIDED)) {
            return (SubLObject)pattern_match.NIL;
        }
        SubLObject variable = (SubLObject)pattern_match.NIL;
        SubLObject variable_$27 = (SubLObject)pattern_match.NIL;
        SubLObject subtree = (SubLObject)pattern_match.NIL;
        SubLObject subtree_$28 = (SubLObject)pattern_match.NIL;
        variable = v_variables;
        variable_$27 = variable.first();
        subtree = tree;
        subtree_$28 = subtree.first();
        while (pattern_match.NIL != subtree || pattern_match.NIL != variable) {
            pattern_match.$pattern_transform_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values(pattern_match.$pattern_transform_tree_bindings$.getDynamicValue(thread), variable_$27, subtree_$28, Symbols.symbol_function((SubLObject)pattern_match.EQL)), thread);
            variable = variable.rest();
            variable_$27 = variable.first();
            subtree = subtree.rest();
            subtree_$28 = subtree.first();
        }
        return pattern_transform_tree_recursive(subpattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 12749L)
    public static SubLObject pattern_transform_template(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)pattern_match.NIL;
        SubLObject match_pattern = (SubLObject)pattern_match.NIL;
        SubLObject subpattern = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)pattern_match.$list44);
        operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)pattern_match.$list44);
        match_pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)pattern_match.$list44);
        subpattern = current.first();
        current = current.rest();
        if (pattern_match.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)pattern_match.$list44);
            return (SubLObject)pattern_match.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject success = (pattern_match.NIL != pattern_match.$pattern_transform_match_method$.getDynamicValue(thread)) ? Functions.funcall(pattern_match.$pattern_transform_match_method$.getDynamicValue(thread), match_pattern, tree) : pattern_matches_tree(match_pattern, tree);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pattern_match.NIL == success) {
            return (SubLObject)pattern_match.NIL;
        }
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)pattern_match.NIL;
        binding = cdolist_list_var.first();
        while (pattern_match.NIL != cdolist_list_var) {
            SubLObject current_$30;
            final SubLObject datum_$29 = current_$30 = binding;
            SubLObject variable = (SubLObject)pattern_match.NIL;
            SubLObject value = (SubLObject)pattern_match.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)pattern_match.$list45);
            variable = current_$30.first();
            current_$30 = (value = current_$30.rest());
            pattern_match.$pattern_transform_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values(pattern_match.$pattern_transform_tree_bindings$.getDynamicValue(thread), variable, value, Symbols.symbol_function((SubLObject)pattern_match.EQL)), thread);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return pattern_transform_tree_recursive(subpattern, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 13432L)
    public static SubLObject pattern_transform_call(final SubLObject pattern, final SubLObject tree) {
        SubLObject operator = (SubLObject)pattern_match.NIL;
        SubLObject method = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)pattern_match.$list46);
        operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)pattern_match.$list46);
        method = current.first();
        SubLObject method_args;
        current = (method_args = current.rest());
        final SubLObject arg_count = Sequences.length(method_args);
        if (!arg_count.numLE((SubLObject)pattern_match.FOUR_INTEGER) || pattern_match.NIL == Symbols.fboundp(method)) {
            method_args = conses_high.copy_list(method_args);
            SubLObject rest_args;
            SubLObject next_arg;
            for (rest_args = (SubLObject)pattern_match.NIL, rest_args = method_args; !rest_args.isAtom(); rest_args = rest_args.rest()) {
                next_arg = rest_args.first();
                ConsesLow.rplaca(rest_args, pattern_transform_tree_recursive(next_arg, tree));
            }
            return eval_in_api.possibly_cyc_api_apply(method, method_args);
        }
        SubLObject current_$32;
        final SubLObject datum_$31 = current_$32 = method_args;
        SubLObject arg1 = (SubLObject)(current_$32.isCons() ? current_$32.first() : pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current_$32, datum_$31, (SubLObject)pattern_match.$list47);
        current_$32 = current_$32.rest();
        SubLObject arg2 = (SubLObject)(current_$32.isCons() ? current_$32.first() : pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current_$32, datum_$31, (SubLObject)pattern_match.$list47);
        current_$32 = current_$32.rest();
        SubLObject arg3 = (SubLObject)(current_$32.isCons() ? current_$32.first() : pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current_$32, datum_$31, (SubLObject)pattern_match.$list47);
        current_$32 = current_$32.rest();
        SubLObject arg4 = (SubLObject)(current_$32.isCons() ? current_$32.first() : pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current_$32, datum_$31, (SubLObject)pattern_match.$list47);
        current_$32 = current_$32.rest();
        if (pattern_match.NIL != current_$32) {
            cdestructuring_bind.cdestructuring_bind_error(datum_$31, (SubLObject)pattern_match.$list47);
            return (SubLObject)pattern_match.NIL;
        }
        if (pattern_match.ZERO_INTEGER.numL(arg_count)) {
            arg1 = pattern_transform_tree_recursive(arg1, tree);
            if (pattern_match.ONE_INTEGER.numL(arg_count)) {
                arg2 = pattern_transform_tree_recursive(arg2, tree);
                if (pattern_match.TWO_INTEGER.numL(arg_count)) {
                    arg3 = pattern_transform_tree_recursive(arg3, tree);
                    if (pattern_match.THREE_INTEGER.numL(arg_count)) {
                        arg4 = pattern_transform_tree_recursive(arg4, tree);
                    }
                }
            }
        }
        final SubLObject pcase_var = arg_count;
        if (pcase_var.eql((SubLObject)pattern_match.ZERO_INTEGER)) {
            return Functions.funcall(method);
        }
        if (pcase_var.eql((SubLObject)pattern_match.ONE_INTEGER)) {
            return Functions.funcall(method, arg1);
        }
        if (pcase_var.eql((SubLObject)pattern_match.TWO_INTEGER)) {
            return Functions.funcall(method, arg1, arg2);
        }
        if (pcase_var.eql((SubLObject)pattern_match.THREE_INTEGER)) {
            return Functions.funcall(method, arg1, arg2, arg3);
        }
        return Functions.funcall(method, arg1, arg2, arg3, arg4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 14728L)
    public static SubLObject pattern_transform_cons(final SubLObject pattern, final SubLObject tree) {
        final SubLObject v_answer = conses_high.copy_list(pattern);
        SubLObject rest_answer;
        for (rest_answer = (SubLObject)pattern_match.NIL, rest_answer = v_answer; !rest_answer.rest().isAtom(); rest_answer = rest_answer.rest()) {
            ConsesLow.rplaca(rest_answer, pattern_transform_tree_recursive(rest_answer.first(), tree));
        }
        ConsesLow.rplaca(rest_answer, pattern_transform_tree_recursive(rest_answer.first(), tree));
        if (pattern_match.NIL != rest_answer.rest()) {
            ConsesLow.rplacd(rest_answer, pattern_transform_tree_recursive(rest_answer.rest(), tree));
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 15197L)
    public static SubLObject with_formula_pattern_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_variables = (SubLObject)pattern_match.NIL;
        SubLObject formula = (SubLObject)pattern_match.NIL;
        SubLObject pattern = (SubLObject)pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list48);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list48);
        formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pattern_match.$list48);
        pattern = current.first();
        current = current.rest();
        if (pattern_match.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pattern_match.$sym49$WITH_TREE_PATTERN_BINDINGS, (SubLObject)ConsesLow.listS(v_variables, formula, pattern, (SubLObject)pattern_match.$list50), ConsesLow.append(body, (SubLObject)pattern_match.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pattern_match.$list48);
        return (SubLObject)pattern_match.NIL;
    }
    
    public static SubLObject declare_pattern_match_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree", "PATTERN-MATCHES-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_without_bindings", "PATTERN-MATCHES-TREE-WITHOUT-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "tree_matches_pattern", "TREE-MATCHES-PATTERN", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pattern_match", "with_tree_pattern_bindings", "WITH-TREE-PATTERN-BINDINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_bindings_variable_specs", "PATTERN-BINDINGS-VARIABLE-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_internal", "PATTERN-MATCHES-TREE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_atomic_method_funcall", "PATTERN-MATCHES-TREE-ATOMIC-METHOD-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_method_funcall", "PATTERN-MATCHES-TREE-METHOD-FUNCALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_recursive", "PATTERN-MATCHES-TREE-RECURSIVE", 2, 0, false);
        new $pattern_matches_tree_recursive$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_bind", "PATTERN-MATCHES-TREE-BIND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_value", "PATTERN-MATCHES-TREE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_and", "PATTERN-MATCHES-TREE-AND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_or", "PATTERN-MATCHES-TREE-OR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_test_funcall", "PATTERN-MATCHES-TREE-TEST-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_test_funcall_2", "PATTERN-MATCHES-TREE-TEST-FUNCALL-2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_test_funcall_3", "PATTERN-MATCHES-TREE-TEST-FUNCALL-3", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_test_funcall_4", "PATTERN-MATCHES-TREE-TEST-FUNCALL-4", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_tree_find", "PATTERN-MATCHES-TREE-TREE-FIND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_tree_find_if", "PATTERN-MATCHES-TREE-TREE-FIND-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_matches_tree_cons", "PATTERN-MATCHES-TREE-CONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "possibly_match_pattern_p", "POSSIBLY-MATCH-PATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_tree", "PATTERN-TRANSFORM-TREE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "tree_pattern_transform", "TREE-PATTERN-TRANSFORM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_tree_internal", "PATTERN-TRANSFORM-TREE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_tree_recursive", "PATTERN-TRANSFORM-TREE-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_tuple", "PATTERN-TRANSFORM-TUPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_template", "PATTERN-TRANSFORM-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_call", "PATTERN-TRANSFORM-CALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pattern_match", "pattern_transform_cons", "PATTERN-TRANSFORM-CONS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pattern_match", "with_formula_pattern_bindings", "WITH-FORMULA-PATTERN-BINDINGS");
        return (SubLObject)pattern_match.NIL;
    }
    
    public static SubLObject init_pattern_match_file() {
        pattern_match.$pattern_matches_tree_bindings$ = SubLFiles.defparameter("*PATTERN-MATCHES-TREE-BINDINGS*", (SubLObject)pattern_match.NIL);
        pattern_match.$pattern_matches_tree_atomic_methods$ = SubLFiles.defparameter("*PATTERN-MATCHES-TREE-ATOMIC-METHODS*", (SubLObject)pattern_match.NIL);
        pattern_match.$pattern_matches_tree_methods$ = SubLFiles.defparameter("*PATTERN-MATCHES-TREE-METHODS*", (SubLObject)pattern_match.NIL);
        pattern_match.$pattern_transform_tree_bindings$ = SubLFiles.defparameter("*PATTERN-TRANSFORM-TREE-BINDINGS*", (SubLObject)pattern_match.NIL);
        pattern_match.$pattern_transform_match_method$ = SubLFiles.defparameter("*PATTERN-TRANSFORM-MATCH-METHOD*", (SubLObject)pattern_match.NIL);
        return (SubLObject)pattern_match.NIL;
    }
    
    public static SubLObject setup_pattern_match_file() {
        generic_testing.define_test_case_table_int((SubLObject)pattern_match.$sym51$PATTERN_MATCHES_TREE, (SubLObject)ConsesLow.list(new SubLObject[] { pattern_match.$kw25$TEST, Symbols.symbol_function((SubLObject)pattern_match.EQUAL), pattern_match.$kw52$OWNER, pattern_match.NIL, pattern_match.$kw53$CLASSES, pattern_match.NIL, pattern_match.$kw54$KB, pattern_match.$kw55$TINY, pattern_match.$kw56$WORKING_, pattern_match.T }), (SubLObject)pattern_match.$list57);
        return (SubLObject)pattern_match.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pattern_match_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pattern_match_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pattern_match_file();
    }
    
    static {
        me = (SubLFile)new pattern_match();
        pattern_match.$pattern_matches_tree_bindings$ = null;
        pattern_match.$pattern_matches_tree_atomic_methods$ = null;
        pattern_match.$pattern_matches_tree_methods$ = null;
        pattern_match.$pattern_transform_tree_bindings$ = null;
        pattern_match.$pattern_transform_match_method$ = null;
        $kw0$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym1$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MATCH-METHOD"));
        $kw4$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw5$MATCH_METHOD = SubLObjectFactory.makeKeyword("MATCH-METHOD");
        $sym6$TREE_MATCHES_PATTERN = SubLObjectFactory.makeSymbol("TREE-MATCHES-PATTERN");
        $sym7$SUCCESS = SubLObjectFactory.makeUninternedSymbol("SUCCESS");
        $sym8$BINDINGS = SubLObjectFactory.makeUninternedSymbol("BINDINGS");
        $sym9$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym10$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym11$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym12$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym13$ALIST_LOOKUP_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("ALIST-LOOKUP-WITHOUT-VALUES");
        $sym14$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw15$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw16$NOTHING = SubLObjectFactory.makeKeyword("NOTHING");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"));
        $list18 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PATTERN-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-ARGS"));
        $kw19$BIND = SubLObjectFactory.makeKeyword("BIND");
        $kw20$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw21$AND = SubLObjectFactory.makeKeyword("AND");
        $kw22$OR = SubLObjectFactory.makeKeyword("OR");
        $kw23$NOT = SubLObjectFactory.makeKeyword("NOT");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-PATTERN"));
        $kw25$TEST = SubLObjectFactory.makeKeyword("TEST");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ARG3"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ARG3"), (SubLObject)SubLObjectFactory.makeSymbol("ARG4"));
        $kw30$TREE_FIND = SubLObjectFactory.makeKeyword("TREE-FIND");
        $kw31$TREE_FIND_IF = SubLObjectFactory.makeKeyword("TREE-FIND-IF");
        $kw32$QUOTE = SubLObjectFactory.makeKeyword("QUOTE");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTED-OBJECT"));
        $sym34$PATTERN_MATCHES_TREE_RECURSIVE = SubLObjectFactory.makeSymbol("PATTERN-MATCHES-TREE-RECURSIVE");
        $list35 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TREE-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-ARGS"));
        $sym36$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw37$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw38$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"));
        $kw40$TUPLE = SubLObjectFactory.makeKeyword("TUPLE");
        $kw41$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw42$CALL = SubLObjectFactory.makeKeyword("CALL");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SUBPATTERN"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBPATTERN"));
        $list45 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-ARGS"));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ARG3"), (SubLObject)SubLObjectFactory.makeSymbol("ARG4"));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym49$WITH_TREE_PATTERN_BINDINGS = SubLObjectFactory.makeSymbol("WITH-TREE-PATTERN-BINDINGS");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MATCH-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-MATCHES-PATTERN"));
        $sym51$PATTERN_MATCHES_TREE = SubLObjectFactory.makeSymbol("PATTERN-MATCHES-TREE");
        $kw52$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw53$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw54$KB = SubLObjectFactory.makeKeyword("KB");
        $kw55$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw56$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER)), (SubLObject)pattern_match.T, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER)), (SubLObject)pattern_match.T, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)pattern_match.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER)), (SubLObject)pattern_match.T, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")), (SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER, (SubLObject)pattern_match.FOUR_INTEGER, (SubLObject)pattern_match.FIVE_INTEGER)), (SubLObject)pattern_match.T, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)pattern_match.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)pattern_match.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)pattern_match.THREE_INTEGER, (SubLObject)pattern_match.FOUR_INTEGER, (SubLObject)pattern_match.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeKeyword("DIFFERENT"), (SubLObject)pattern_match.ONE_INTEGER, (SubLObject)pattern_match.TWO_INTEGER, (SubLObject)pattern_match.THREE_INTEGER, (SubLObject)pattern_match.FOUR_INTEGER, (SubLObject)pattern_match.FIVE_INTEGER))));
    }
    
    public static final class $pattern_matches_tree_recursive$BinaryFunction extends BinaryFunction
    {
        public $pattern_matches_tree_recursive$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PATTERN-MATCHES-TREE-RECURSIVE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pattern_match.pattern_matches_tree_recursive(arg1, arg2);
        }
    }
}

/*

	Total time: 248 ms
	
*/