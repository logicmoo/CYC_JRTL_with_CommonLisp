package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.decision_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.decision_tree.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class decision_tree extends SubLTranslatedFile {
    public static final SubLFile me = new decision_tree();

    public static final String myName = "com.cyc.cycjava.cycl.decision_tree";

    public static final String myFingerPrint = "ce0849fd3eccc3f6809999090d58edbe6963fa55b758e73fa2a5a9511dd36a07";

    // defparameter
    /**
     * If specified as T, then transform field name strings to canonical keywords;
     * if NIL, leave them alone.
     */
    public static final SubLSymbol $decision_tree_parser_transform_field_stringP$ = makeSymbol("*DECISION-TREE-PARSER-TRANSFORM-FIELD-STRING?*");

    // defparameter
    /**
     * If specified as T, then the count strings are included in the leaf
     * information; if NIL, they are not.
     */
    public static final SubLSymbol $decision_tree_parser_keep_countsP$ = makeSymbol("*DECISION-TREE-PARSER-KEEP-COUNTS?*");

    // defparameter
    /**
     * If specified, then the decision tree parsing process will preserve the infix
     * representation of the original; if false, the lambda style prefix notion will
     * be used instead.
     */
    public static final SubLSymbol $decision_tree_parser_output_infixP$ = makeSymbol("*DECISION-TREE-PARSER-OUTPUT-INFIX?*");

    // defparameter
    /**
     * If specified as T, then convert the data values that are floats into integers
     * (since Weka does not support a non-float integer type.
     */
    public static final SubLSymbol $decision_tree_parse_numbers_as_integersP$ = makeSymbol("*DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*");

    // defparameter
    public static final SubLSymbol $decision_tree_lookup_function$ = makeSymbol("*DECISION-TREE-LOOKUP-FUNCTION*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("GT"), makeKeyword("LT"), makeKeyword("GE"), makeKeyword("LE"), makeKeyword("EQ"), makeKeyword("NE"));

    public static final SubLList $list1 = list(makeString(">"), makeString(">="), makeString("<"), makeString("<="), makeString("="), makeString("!="));

    public static final SubLString $str2$_ = makeString(">");



    public static final SubLString $str4$__ = makeString(">=");



    public static final SubLString $str6$_ = makeString("<");



    public static final SubLString $str8$__ = makeString("<=");



    public static final SubLString $str10$_ = makeString("=");



    public static final SubLString $str12$__ = makeString("!=");



    public static final SubLString $str14$Unexpected_decision_tree_comparat = makeString("Unexpected decision tree comparator-string ~s");

    public static final SubLString $str15$Unexpected_decision_tree_comparat = makeString("Unexpected decision tree comparator ~s");

    public static final SubLString $str16$Dont_know_how_to_negate_decision_ = makeString("Dont know how to negate decision tree operator ~A.");



    public static final SubLSymbol DECISION_TREE_COMPARATOR_STRING_P = makeSymbol("DECISION-TREE-COMPARATOR-STRING-P");

    public static final SubLSymbol DECISION_TREE_NODE_P = makeSymbol("DECISION-TREE-NODE-P");

    public static final SubLList $list20 = list(CHAR_lparen, CHAR_rparen, CHAR_slash);





    public static final SubLSymbol DECISION_TREE_LEAF_NODE_P = makeSymbol("DECISION-TREE-LEAF-NODE-P");

    public static final SubLString $str24$_ = makeString("|");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLList $list26 = list(makeSymbol("COMPARISON-VALUE-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("RETURN-VALUE"), makeSymbol("COUNTS-STRING"));

    public static final SubLSymbol DECISION_TREE_P = makeSymbol("DECISION-TREE-P");

    public static final SubLList $list28 = list(makeSymbol("FIELD"), makeSymbol("COMPARATOR"), makeSymbol("COMPARISON-VALUE"), makeSymbol("IF-NODE"), makeSymbol("ELSE-NODE"));



    public static final SubLString $str30$A_value_for__s_must_be_provided_i = makeString("A value for ~s must be provided in ~s");



    public static final SubLSymbol HIERARCHICAL_VISITOR_P = makeSymbol("HIERARCHICAL-VISITOR-P");



    public static final SubLList $list34 = list(makeSymbol("TASK"), makeSymbol("PATH"), makeSymbol("&OPTIONAL"), makeSymbol("NODE"));



    public static final SubLList $list36 = list(makeSymbol("ELEM1"), makeSymbol("ELEM2"), makeSymbol("ELEM3"), makeSymbol("IF-CLAUSE"), makeSymbol("ELSE-CLAUSE"));

    public static final SubLString $str37$Cannot_determine_the_node_type_fo = makeString("Cannot determine the node-type for ~A.");

    public static final SubLString $str38$Invalid_state_transition__A_in_vi = makeString("Invalid state transition ~A in visiting of DECISION-TREE");

    public static SubLObject decision_tree_comparison_operator_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list0, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject decision_tree_comparator_string_p(final SubLObject v_object) {
        return list_utilities.member_equalP(v_object, $list1);
    }

    public static SubLObject decision_tree_canonicalize_comparator_string(final SubLObject comparator_string) {
        if ($str2$_.equal(comparator_string)) {
            return $GT;
        }
        if ($str4$__.equal(comparator_string)) {
            return $GE;
        }
        if ($str6$_.equal(comparator_string)) {
            return $LT;
        }
        if ($str8$__.equal(comparator_string)) {
            return $LE;
        }
        if ($str10$_.equal(comparator_string)) {
            return $EQ;
        }
        if ($str12$__.equal(comparator_string)) {
            return $NE;
        }
        return Errors.error($str14$Unexpected_decision_tree_comparat, comparator_string);
    }

    public static SubLObject decision_tree_compare(final SubLObject comparator, final SubLObject field_value, final SubLObject comparison_value) {
        if (comparator.eql($GT)) {
            return numG(field_value, comparison_value);
        }
        if (comparator.eql($GE)) {
            return numGE(field_value, comparison_value);
        }
        if (comparator.eql($LT)) {
            return numL(field_value, comparison_value);
        }
        if (comparator.eql($LE)) {
            return numLE(field_value, comparison_value);
        }
        if (comparator.eql($EQ)) {
            return equal(field_value, comparison_value);
        }
        if (comparator.eql($NE)) {
            return makeBoolean(NIL == decision_tree_compare($EQ, field_value, comparison_value));
        }
        return Errors.error($str15$Unexpected_decision_tree_comparat, comparator);
    }

    public static SubLObject decision_tree_operator_negate(final SubLObject operator) {
        if (operator.eql($GT)) {
            return $LE;
        }
        if (operator.eql($GE)) {
            return $LT;
        }
        if (operator.eql($LE)) {
            return $GT;
        }
        if (operator.eql($LT)) {
            return $GE;
        }
        if (operator.eql($EQ)) {
            return $NE;
        }
        if (operator.eql($NE)) {
            return $EQ;
        }
        return Errors.error($str16$Dont_know_how_to_negate_decision_, operator);
    }

    public static SubLObject decision_tree_field_from_field_name(final SubLObject field_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.sublisp_boolean($decision_tree_parser_transform_field_stringP$.getDynamicValue(thread))) {
            return make_keyword(Strings.string_upcase(field_string, UNPROVIDED, UNPROVIDED));
        }
        return field_string;
    }

    public static SubLObject new_decision_tree_non_leaf_node(final SubLObject field_string, final SubLObject comparator_string, final SubLObject comparison_value_string, final SubLObject if_node, final SubLObject else_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(field_string) : "Types.stringp(field_string) " + "CommonSymbols.NIL != Types.stringp(field_string) " + field_string;
        assert NIL != decision_tree_comparator_string_p(comparator_string) : "decision_tree.decision_tree_comparator_string_p(comparator_string) " + "CommonSymbols.NIL != decision_tree.decision_tree_comparator_string_p(comparator_string) " + comparator_string;
        assert NIL != stringp(comparison_value_string) : "Types.stringp(comparison_value_string) " + "CommonSymbols.NIL != Types.stringp(comparison_value_string) " + comparison_value_string;
        assert NIL != decision_tree_node_p(if_node) : "decision_tree.decision_tree_node_p(if_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_node_p(if_node) " + if_node;
        assert NIL != decision_tree_node_p(else_node) : "decision_tree.decision_tree_node_p(else_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_node_p(else_node) " + else_node;
        final SubLObject field = decision_tree_field_from_field_name(field_string);
        final SubLObject comparator = decision_tree_canonicalize_comparator_string(comparator_string);
        SubLObject comparison_value = decision_tree_string_to_number(comparison_value_string);
        if (NIL == comparison_value) {
            comparison_value = decision_tree_field_from_field_name(comparison_value_string);
        }
        if (NIL != $decision_tree_parser_output_infixP$.getDynamicValue(thread)) {
            return list(field, comparator, comparison_value, if_node, else_node);
        }
        return list(comparator, field, comparison_value, if_node, else_node);
    }

    public static SubLObject decision_tree_string_to_number(final SubLObject value_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_result = string_utilities.string_to_number(value_string);
        if ((NIL != $decision_tree_parse_numbers_as_integersP$.getDynamicValue(thread)) && raw_result.isDouble()) {
            thread.resetMultipleValues();
            final SubLObject integer = truncate(raw_result, UNPROVIDED);
            final SubLObject scrap = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return integer;
        }
        return raw_result;
    }

    public static SubLObject decision_tree_non_leaf_node_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject new_decision_tree_leaf_node(final SubLObject return_value_string, SubLObject count_string) {
        if (count_string == UNPROVIDED) {
            count_string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.sublisp_boolean($decision_tree_parser_transform_field_stringP$.getDynamicValue(thread))) {
            final SubLObject return_value = read_from_string_ignoring_errors(return_value_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list(return_value);
        }
        if (NIL == list_utilities.sublisp_boolean($decision_tree_parser_keep_countsP$.getDynamicValue(thread))) {
            return list(return_value_string);
        }
        final SubLObject pieces = string_utilities.string_tokenize(count_string, $list20, NIL, NIL, T, UNPROVIDED, UNPROVIDED);
        final SubLObject numbers = Mapping.mapcar(READ_FROM_STRING_IGNORING_ERRORS, pieces);
        return cons(return_value_string, numbers);
    }

    public static SubLObject decision_tree_leaf_node_p(final SubLObject v_object) {
        if (NIL != list_utilities.singletonP(v_object)) {
            return T;
        }
        return makeBoolean((v_object.isCons() && v_object.first().isString()) && (NIL != list_utilities.list_of_type_p(NUMBERP, v_object.rest())));
    }

    public static SubLObject decision_tree_leaf_node_return_value(final SubLObject leaf_node) {
        assert NIL != decision_tree_leaf_node_p(leaf_node) : "decision_tree.decision_tree_leaf_node_p(leaf_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_leaf_node_p(leaf_node) " + leaf_node;
        return leaf_node.first();
    }

    public static SubLObject decision_tree_node_p(final SubLObject v_object) {
        return makeBoolean((NIL != decision_tree_non_leaf_node_p(v_object)) || (NIL != decision_tree_leaf_node_p(v_object)));
    }

    public static SubLObject new_decision_tree_from_root_node(final SubLObject root_node) {
        assert NIL != decision_tree_node_p(root_node) : "decision_tree.decision_tree_node_p(root_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_node_p(root_node) " + root_node;
        return root_node;
    }

    public static SubLObject decision_tree_p(final SubLObject v_object) {
        return decision_tree_node_p(v_object);
    }

    public static SubLObject decision_tree_root_node(final SubLObject tree) {
        return tree;
    }

    public static SubLObject new_decision_tree_from_weka_j48_format(final SubLObject decision_tree_string) {
        SubLObject tree = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(decision_tree_string, ZERO_INTEGER, NIL);
            final SubLObject root_node = new_decision_tree_node_from_weka_j48_format(stream, NIL);
            tree = new_decision_tree_from_root_node(root_node);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return tree;
    }

    public static SubLObject new_decision_tree_node_from_weka_j48_format(final SubLObject stream, final SubLObject else_depth) {
        final SubLObject line = string_utilities.network_read_line(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject tokens = string_utilities.string_tokenize(line, cons(CHAR_colon, string_utilities.whitespace_chars()), NIL, NIL, T, UNPROVIDED, UNPROVIDED);
        SubLObject depth = ZERO_INTEGER;
        while (NIL != Strings.string_equal(tokens.first(), $str24$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            depth = add(depth, ONE_INTEGER);
            tokens = tokens.rest();
        } 
        SubLObject field = tokens.first();
        SubLObject comparator_string;
        for (comparator_string = second(tokens), tokens = tokens.rest().rest(); NIL == decision_tree_comparator_string_p(comparator_string); comparator_string = tokens.first() , tokens = tokens.rest()) {
            field = cconcatenate(field, new SubLObject[]{ $$$_, comparator_string });
        }
        SubLObject current;
        final SubLObject datum = current = tokens;
        SubLObject comparison_value_string = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        comparison_value_string = current.first();
        current = current.rest();
        final SubLObject return_value = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        final SubLObject counts_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list26);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list26);
            return NIL;
        }
        if (!depth.eql(else_depth)) {
            final SubLObject if_node = (NIL != return_value) ? new_decision_tree_leaf_node(return_value, counts_string) : new_decision_tree_node_from_weka_j48_format(stream, NIL);
            final SubLObject else_node = new_decision_tree_node_from_weka_j48_format(stream, depth);
            return new_decision_tree_non_leaf_node(field, comparator_string, comparison_value_string, if_node, else_node);
        }
        if (NIL != return_value) {
            return new_decision_tree_leaf_node(return_value, counts_string);
        }
        return new_decision_tree_node_from_weka_j48_format(stream, NIL);
    }

    public static SubLObject evaluate_decision_tree(final SubLObject tree, final SubLObject plist) {
        assert NIL != decision_tree_p(tree) : "decision_tree.decision_tree_p(tree) " + "CommonSymbols.NIL != decision_tree.decision_tree_p(tree) " + tree;
        return evaluate_decision_tree_node(decision_tree_root_node(tree), plist);
    }

    public static SubLObject evaluate_decision_tree_node(final SubLObject node, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != decision_tree_leaf_node_p(node)) {
            return decision_tree_leaf_node_return_value(node);
        }
        SubLObject field = NIL;
        SubLObject comparator = NIL;
        SubLObject comparison_value = NIL;
        SubLObject if_node = NIL;
        SubLObject else_node = NIL;
        destructuring_bind_must_consp(node, node, $list28);
        field = node.first();
        SubLObject current = node.rest();
        destructuring_bind_must_consp(current, node, $list28);
        comparator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, node, $list28);
        comparison_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, node, $list28);
        if_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, node, $list28);
        else_node = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(node, $list28);
            return NIL;
        }
        final SubLObject field_value = decision_tree_retrieve_value(plist, field, $UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($UNPROVIDED == field_value)) {
            Errors.error($str30$A_value_for__s_must_be_provided_i, field, plist);
        }
        if (NIL != decision_tree_compare(comparator, field_value, comparison_value)) {
            return evaluate_decision_tree_node(if_node, plist);
        }
        return evaluate_decision_tree_node(else_node, plist);
    }

    public static SubLObject decision_tree_retrieve_value(final SubLObject data, final SubLObject key, SubLObject unprovided_value, SubLObject decision_tree_value_lookup_function) {
        if (unprovided_value == UNPROVIDED) {
            unprovided_value = NIL;
        }
        if (decision_tree_value_lookup_function == UNPROVIDED) {
            decision_tree_value_lookup_function = $decision_tree_lookup_function$.getDynamicValue();
        }
        return funcall(decision_tree_value_lookup_function, data, key, unprovided_value);
    }

    public static SubLObject decision_tree_properties(final SubLObject tree) {
        final SubLObject properties_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        return set.set_element_list(decision_tree_properties_recursive(decision_tree_root_node(tree), properties_set));
    }

    public static SubLObject decision_tree_properties_recursive(final SubLObject node, final SubLObject v_set) {
        if (NIL != decision_tree_leaf_node_p(node)) {
            return v_set;
        }
        SubLObject field = NIL;
        SubLObject comparator = NIL;
        SubLObject comparison_value = NIL;
        SubLObject if_node = NIL;
        SubLObject else_node = NIL;
        destructuring_bind_must_consp(node, node, $list28);
        field = node.first();
        SubLObject current = node.rest();
        destructuring_bind_must_consp(current, node, $list28);
        comparator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, node, $list28);
        comparison_value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, node, $list28);
        if_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, node, $list28);
        else_node = current.first();
        current = current.rest();
        if (NIL == current) {
            set.set_add(field, v_set);
            decision_tree_properties_recursive(if_node, v_set);
            return decision_tree_properties_recursive(else_node, v_set);
        }
        cdestructuring_bind_error(node, $list28);
        return NIL;
    }

    public static SubLObject visit_decision_tree_hierarchically(final SubLObject dec_tree, final SubLObject visitor) {
        assert NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) : "hierarchical_visitor.hierarchical_visitor_p(visitor) " + "CommonSymbols.NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) " + visitor;
        hierarchical_visitor.hierarchical_visitor_begin_visit(visitor);
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(list($VISIT, NIL, dec_tree), stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject current_task = stacks.stack_pop(stack);
            SubLObject current;
            final SubLObject datum = current = current_task;
            SubLObject task = NIL;
            SubLObject path = NIL;
            destructuring_bind_must_consp(current, datum, $list34);
            task = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list34);
            path = current.first();
            current = current.rest();
            final SubLObject node = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list34);
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = task;
                if (pcase_var.eql($VISIT)) {
                    hierarchical_visitor.show_hierarchical_visitor_path_begin(visitor, path);
                    stacks.stack_push(list($FINISH, path), stack);
                    if (NIL != decision_tree_non_leaf_node_p(node)) {
                        SubLObject current_$2;
                        final SubLObject datum_$1 = current_$2 = node;
                        SubLObject elem1 = NIL;
                        SubLObject elem2 = NIL;
                        SubLObject elem3 = NIL;
                        SubLObject if_clause = NIL;
                        SubLObject else_clause = NIL;
                        destructuring_bind_must_consp(current_$2, datum_$1, $list36);
                        elem1 = current_$2.first();
                        current_$2 = current_$2.rest();
                        destructuring_bind_must_consp(current_$2, datum_$1, $list36);
                        elem2 = current_$2.first();
                        current_$2 = current_$2.rest();
                        destructuring_bind_must_consp(current_$2, datum_$1, $list36);
                        elem3 = current_$2.first();
                        current_$2 = current_$2.rest();
                        destructuring_bind_must_consp(current_$2, datum_$1, $list36);
                        if_clause = current_$2.first();
                        current_$2 = current_$2.rest();
                        destructuring_bind_must_consp(current_$2, datum_$1, $list36);
                        else_clause = current_$2.first();
                        current_$2 = current_$2.rest();
                        if (NIL == current_$2) {
                            final SubLObject comparison = list(elem1, elem2, elem3);
                            final SubLObject if_path = cons(comparison, path);
                            final SubLObject negated_comparison = visit_dectree_negate_comparison(comparison);
                            final SubLObject else_path = cons(negated_comparison, path);
                            stacks.stack_push(list($VISIT, if_path, if_clause), stack);
                            stacks.stack_push(list($VISIT, else_path, else_clause), stack);
                        } else {
                            cdestructuring_bind_error(datum_$1, $list36);
                        }
                    } else
                        if (NIL != decision_tree_leaf_node_p(node)) {
                            hierarchical_visitor.show_hierarchical_visitor_node(visitor, node);
                        } else {
                            Errors.error($str37$Cannot_determine_the_node_type_fo, node);
                        }

                } else
                    if (pcase_var.eql($FINISH)) {
                        hierarchical_visitor.show_hierarchical_visitor_path_end(visitor, path);
                    } else {
                        Errors.error($str38$Invalid_state_transition__A_in_vi, current_task);
                    }

            } else {
                cdestructuring_bind_error(datum, $list34);
            }
        } 
        hierarchical_visitor.hierarchical_visitor_end_visit(visitor);
        return visitor;
    }

    public static SubLObject visit_dectree_negate_comparison(final SubLObject comparison) {
        SubLObject negated_comparison = NIL;
        SubLObject cdolist_list_var = comparison;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != decision_tree_comparison_operator_p(v_term)) {
                final SubLObject flipped_operator = decision_tree_operator_negate(v_term);
                negated_comparison = cons(flipped_operator, negated_comparison);
            } else {
                negated_comparison = cons(v_term, negated_comparison);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(negated_comparison);
    }

    public static SubLObject declare_decision_tree_file() {
        declareFunction(me, "decision_tree_comparison_operator_p", "DECISION-TREE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction(me, "decision_tree_comparator_string_p", "DECISION-TREE-COMPARATOR-STRING-P", 1, 0, false);
        declareFunction(me, "decision_tree_canonicalize_comparator_string", "DECISION-TREE-CANONICALIZE-COMPARATOR-STRING", 1, 0, false);
        declareFunction(me, "decision_tree_compare", "DECISION-TREE-COMPARE", 3, 0, false);
        declareFunction(me, "decision_tree_operator_negate", "DECISION-TREE-OPERATOR-NEGATE", 1, 0, false);
        declareFunction(me, "decision_tree_field_from_field_name", "DECISION-TREE-FIELD-FROM-FIELD-NAME", 1, 0, false);
        declareFunction(me, "new_decision_tree_non_leaf_node", "NEW-DECISION-TREE-NON-LEAF-NODE", 5, 0, false);
        declareFunction(me, "decision_tree_string_to_number", "DECISION-TREE-STRING-TO-NUMBER", 1, 0, false);
        declareFunction(me, "decision_tree_non_leaf_node_p", "DECISION-TREE-NON-LEAF-NODE-P", 1, 0, false);
        declareFunction(me, "new_decision_tree_leaf_node", "NEW-DECISION-TREE-LEAF-NODE", 1, 1, false);
        declareFunction(me, "decision_tree_leaf_node_p", "DECISION-TREE-LEAF-NODE-P", 1, 0, false);
        declareFunction(me, "decision_tree_leaf_node_return_value", "DECISION-TREE-LEAF-NODE-RETURN-VALUE", 1, 0, false);
        declareFunction(me, "decision_tree_node_p", "DECISION-TREE-NODE-P", 1, 0, false);
        declareFunction(me, "new_decision_tree_from_root_node", "NEW-DECISION-TREE-FROM-ROOT-NODE", 1, 0, false);
        declareFunction(me, "decision_tree_p", "DECISION-TREE-P", 1, 0, false);
        declareFunction(me, "decision_tree_root_node", "DECISION-TREE-ROOT-NODE", 1, 0, false);
        declareFunction(me, "new_decision_tree_from_weka_j48_format", "NEW-DECISION-TREE-FROM-WEKA-J48-FORMAT", 1, 0, false);
        declareFunction(me, "new_decision_tree_node_from_weka_j48_format", "NEW-DECISION-TREE-NODE-FROM-WEKA-J48-FORMAT", 2, 0, false);
        declareFunction(me, "evaluate_decision_tree", "EVALUATE-DECISION-TREE", 2, 0, false);
        declareFunction(me, "evaluate_decision_tree_node", "EVALUATE-DECISION-TREE-NODE", 2, 0, false);
        declareFunction(me, "decision_tree_retrieve_value", "DECISION-TREE-RETRIEVE-VALUE", 2, 2, false);
        declareFunction(me, "decision_tree_properties", "DECISION-TREE-PROPERTIES", 1, 0, false);
        declareFunction(me, "decision_tree_properties_recursive", "DECISION-TREE-PROPERTIES-RECURSIVE", 2, 0, false);
        declareFunction(me, "visit_decision_tree_hierarchically", "VISIT-DECISION-TREE-HIERARCHICALLY", 2, 0, false);
        declareFunction(me, "visit_dectree_negate_comparison", "VISIT-DECTREE-NEGATE-COMPARISON", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_decision_tree_file() {
        defparameter("*DECISION-TREE-PARSER-TRANSFORM-FIELD-STRING?*", T);
        defparameter("*DECISION-TREE-PARSER-KEEP-COUNTS?*", NIL);
        defparameter("*DECISION-TREE-PARSER-OUTPUT-INFIX?*", T);
        defparameter("*DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*", NIL);
        defparameter("*DECISION-TREE-LOOKUP-FUNCTION*", GETF);
        return NIL;
    }

    public static SubLObject setup_decision_tree_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_decision_tree_file();
    }

    @Override
    public void initializeVariables() {
        init_decision_tree_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_decision_tree_file();
    }

    static {













































    }
}

/**
 * Total time: 185 ms
 */
