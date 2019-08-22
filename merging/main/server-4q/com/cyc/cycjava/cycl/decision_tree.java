/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class decision_tree extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new decision_tree();

 public static final String myName = "com.cyc.cycjava.cycl.decision_tree";


    // defparameter
    /**
     * If specified as T, then transform field name strings to canonical keywords;
     * if NIL, leave them alone.
     */
    @LispMethod(comment = "If specified as T, then transform field name strings to canonical keywords;\r\nif NIL, leave them alone.\ndefparameter\nIf specified as T, then transform field name strings to canonical keywords;\nif NIL, leave them alone.")
    public static final SubLSymbol $decision_tree_parser_transform_field_stringP$ = makeSymbol("*DECISION-TREE-PARSER-TRANSFORM-FIELD-STRING?*");

    // defparameter
    /**
     * If specified as T, then the count strings are included in the leaf
     * information; if NIL, they are not.
     */
    @LispMethod(comment = "If specified as T, then the count strings are included in the leaf\r\ninformation; if NIL, they are not.\ndefparameter\nIf specified as T, then the count strings are included in the leaf\ninformation; if NIL, they are not.")
    public static final SubLSymbol $decision_tree_parser_keep_countsP$ = makeSymbol("*DECISION-TREE-PARSER-KEEP-COUNTS?*");

    // defparameter
    /**
     * If specified, then the decision tree parsing process will preserve the infix
     * representation of the original; if false, the lambda style prefix notion will
     * be used instead.
     */
    @LispMethod(comment = "If specified, then the decision tree parsing process will preserve the infix\r\nrepresentation of the original; if false, the lambda style prefix notion will\r\nbe used instead.\ndefparameter\nIf specified, then the decision tree parsing process will preserve the infix\nrepresentation of the original; if false, the lambda style prefix notion will\nbe used instead.")
    public static final SubLSymbol $decision_tree_parser_output_infixP$ = makeSymbol("*DECISION-TREE-PARSER-OUTPUT-INFIX?*");

    // defparameter
    /**
     * If specified as T, then convert the data values that are floats into integers
     * (since Weka does not support a non-float integer type.
     */
    @LispMethod(comment = "If specified as T, then convert the data values that are floats into integers\r\n(since Weka does not support a non-float integer type.\ndefparameter\nIf specified as T, then convert the data values that are floats into integers\n(since Weka does not support a non-float integer type.")
    public static final SubLSymbol $decision_tree_parse_numbers_as_integersP$ = makeSymbol("*DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $decision_tree_lookup_function$ = makeSymbol("*DECISION-TREE-LOOKUP-FUNCTION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("GT"), makeKeyword("LT"), makeKeyword("GE"), makeKeyword("LE"), makeKeyword("EQ"), makeKeyword("NE"));

    static private final SubLList $list1 = list(makeString(">"), makeString(">="), makeString("<"), makeString("<="), makeString("="), makeString("!="));

    static private final SubLString $str2$_ = makeString(">");

    static private final SubLString $str4$__ = makeString(">=");

    static private final SubLString $str6$_ = makeString("<");

    static private final SubLString $str8$__ = makeString("<=");

    static private final SubLString $str10$_ = makeString("=");

    static private final SubLString $str12$__ = makeString("!=");

    static private final SubLString $str14$Unexpected_decision_tree_comparat = makeString("Unexpected decision tree comparator-string ~s");

    static private final SubLString $str15$Unexpected_decision_tree_comparat = makeString("Unexpected decision tree comparator ~s");

    static private final SubLString $str16$Dont_know_how_to_negate_decision_ = makeString("Dont know how to negate decision tree operator ~A.");

    private static final SubLSymbol DECISION_TREE_COMPARATOR_STRING_P = makeSymbol("DECISION-TREE-COMPARATOR-STRING-P");

    private static final SubLSymbol DECISION_TREE_NODE_P = makeSymbol("DECISION-TREE-NODE-P");

    static private final SubLList $list20 = list(CHAR_lparen, CHAR_rparen, CHAR_slash);

    private static final SubLSymbol DECISION_TREE_LEAF_NODE_P = makeSymbol("DECISION-TREE-LEAF-NODE-P");

    static private final SubLString $str24$_ = makeString("|");

    static private final SubLString $$$_ = makeString(" ");

    static private final SubLList $list26 = list(makeSymbol("COMPARISON-VALUE-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("RETURN-VALUE"), makeSymbol("COUNTS-STRING"));

    private static final SubLSymbol DECISION_TREE_P = makeSymbol("DECISION-TREE-P");

    static private final SubLList $list28 = list(makeSymbol("FIELD"), makeSymbol("COMPARATOR"), makeSymbol("COMPARISON-VALUE"), makeSymbol("IF-NODE"), makeSymbol("ELSE-NODE"));

    static private final SubLString $str30$A_value_for__s_must_be_provided_i = makeString("A value for ~s must be provided in ~s");

    private static final SubLSymbol HIERARCHICAL_VISITOR_P = makeSymbol("HIERARCHICAL-VISITOR-P");

    static private final SubLList $list34 = list(makeSymbol("TASK"), makeSymbol("PATH"), makeSymbol("&OPTIONAL"), makeSymbol("NODE"));

    static private final SubLList $list36 = list(makeSymbol("ELEM1"), makeSymbol("ELEM2"), makeSymbol("ELEM3"), makeSymbol("IF-CLAUSE"), makeSymbol("ELSE-CLAUSE"));

    static private final SubLString $str37$Cannot_determine_the_node_type_fo = makeString("Cannot determine the node-type for ~A.");

    static private final SubLString $str38$Invalid_state_transition__A_in_vi = makeString("Invalid state transition ~A in visiting of DECISION-TREE");

    // Definitions
    public static final SubLObject decision_tree_comparison_operator_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list_alt0, UNPROVIDED, UNPROVIDED);
    }

    // Definitions
    public static SubLObject decision_tree_comparison_operator_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list0, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject decision_tree_comparator_string_p_alt(SubLObject v_object) {
        return list_utilities.member_equalP(v_object, $list_alt1);
    }

    public static SubLObject decision_tree_comparator_string_p(final SubLObject v_object) {
        return list_utilities.member_equalP(v_object, $list1);
    }

    public static final SubLObject decision_tree_canonicalize_comparator_string_alt(SubLObject comparator_string) {
        if ($str_alt2$_.equal(comparator_string)) {
            return $GT;
        } else {
            if ($str_alt4$__.equal(comparator_string)) {
                return $GE;
            } else {
                if ($str_alt6$_.equal(comparator_string)) {
                    return $LT;
                } else {
                    if ($str_alt8$__.equal(comparator_string)) {
                        return $LE;
                    } else {
                        if ($str_alt10$_.equal(comparator_string)) {
                            return $EQ;
                        } else {
                            if ($str_alt12$__.equal(comparator_string)) {
                                return $NE;
                            } else {
                                return Errors.error($str_alt14$Unexpected_decision_tree_comparat, comparator_string);
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject decision_tree_compare_alt(SubLObject comparator, SubLObject field_value, SubLObject comparison_value) {
        {
            SubLObject pcase_var = comparator;
            if (pcase_var.eql($GT)) {
                return numG(field_value, comparison_value);
            } else {
                if (pcase_var.eql($GE)) {
                    return numGE(field_value, comparison_value);
                } else {
                    if (pcase_var.eql($LT)) {
                        return numL(field_value, comparison_value);
                    } else {
                        if (pcase_var.eql($LE)) {
                            return numLE(field_value, comparison_value);
                        } else {
                            if (pcase_var.eql($EQ)) {
                                return equal(field_value, comparison_value);
                            } else {
                                if (pcase_var.eql($NE)) {
                                    return makeBoolean(NIL == com.cyc.cycjava.cycl.decision_tree.decision_tree_compare($EQ, field_value, comparison_value));
                                } else {
                                    return Errors.error($str_alt15$Unexpected_decision_tree_comparat, comparator);
                                }
                            }
                        }
                    }
                }
            }
        }
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

    /**
     *
     *
     * @unknown This is SO NOT exploiting symmetry ...
     */
    @LispMethod(comment = "@unknown This is SO NOT exploiting symmetry ...")
    public static final SubLObject decision_tree_operator_negate_alt(SubLObject operator) {
        {
            SubLObject pcase_var = operator;
            if (pcase_var.eql($GT)) {
                return $LE;
            } else {
                if (pcase_var.eql($GE)) {
                    return $LT;
                } else {
                    if (pcase_var.eql($LE)) {
                        return $GT;
                    } else {
                        if (pcase_var.eql($LT)) {
                            return $GE;
                        } else {
                            if (pcase_var.eql($EQ)) {
                                return $NE;
                            } else {
                                if (pcase_var.eql($NE)) {
                                    return $EQ;
                                } else {
                                    return Errors.error($str_alt16$Dont_know_how_to_negate_decision_, operator);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown This is SO NOT exploiting symmetry ...
     */
    @LispMethod(comment = "@unknown This is SO NOT exploiting symmetry ...")
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

    /**
     * Transform the decision tree field name if that is interesting.
     */
    @LispMethod(comment = "Transform the decision tree field name if that is interesting.")
    public static final SubLObject decision_tree_field_from_field_name_alt(SubLObject field_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.sublisp_boolean($decision_tree_parser_transform_field_stringP$.getDynamicValue(thread))) {
                return make_keyword(Strings.string_upcase(field_string, UNPROVIDED, UNPROVIDED));
            } else {
                return field_string;
            }
        }
    }

    /**
     * Transform the decision tree field name if that is interesting.
     */
    @LispMethod(comment = "Transform the decision tree field name if that is interesting.")
    public static SubLObject decision_tree_field_from_field_name(final SubLObject field_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.sublisp_boolean($decision_tree_parser_transform_field_stringP$.getDynamicValue(thread))) {
            return make_keyword(Strings.string_upcase(field_string, UNPROVIDED, UNPROVIDED));
        }
        return field_string;
    }

    /**
     * Assumes that the terminal values are either numbers or keywords
     */
    @LispMethod(comment = "Assumes that the terminal values are either numbers or keywords")
    public static final SubLObject new_decision_tree_non_leaf_node_alt(SubLObject field_string, SubLObject comparator_string, SubLObject comparison_value_string, SubLObject if_node, SubLObject else_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(field_string, STRINGP);
            SubLTrampolineFile.checkType(comparator_string, DECISION_TREE_COMPARATOR_STRING_P);
            SubLTrampolineFile.checkType(comparison_value_string, STRINGP);
            SubLTrampolineFile.checkType(if_node, DECISION_TREE_NODE_P);
            SubLTrampolineFile.checkType(else_node, DECISION_TREE_NODE_P);
            {
                SubLObject field = com.cyc.cycjava.cycl.decision_tree.decision_tree_field_from_field_name(field_string);
                SubLObject comparator = com.cyc.cycjava.cycl.decision_tree.decision_tree_canonicalize_comparator_string(comparator_string);
                SubLObject comparison_value = com.cyc.cycjava.cycl.decision_tree.decision_tree_string_to_number(comparison_value_string);
                if (NIL == comparison_value) {
                    comparison_value = com.cyc.cycjava.cycl.decision_tree.decision_tree_field_from_field_name(comparison_value_string);
                }
                if (NIL != $decision_tree_parser_output_infixP$.getDynamicValue(thread)) {
                    return list(field, comparator, comparison_value, if_node, else_node);
                } else {
                    return list(comparator, field, comparison_value, if_node, else_node);
                }
            }
        }
    }

    /**
     * Assumes that the terminal values are either numbers or keywords
     */
    @LispMethod(comment = "Assumes that the terminal values are either numbers or keywords")
    public static SubLObject new_decision_tree_non_leaf_node(final SubLObject field_string, final SubLObject comparator_string, final SubLObject comparison_value_string, final SubLObject if_node, final SubLObject else_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(field_string) : "! stringp(field_string) " + ("Types.stringp(field_string) " + "CommonSymbols.NIL != Types.stringp(field_string) ") + field_string;
        assert NIL != decision_tree_comparator_string_p(comparator_string) : "! decision_tree.decision_tree_comparator_string_p(comparator_string) " + ("decision_tree.decision_tree_comparator_string_p(comparator_string) " + "CommonSymbols.NIL != decision_tree.decision_tree_comparator_string_p(comparator_string) ") + comparator_string;
        assert NIL != stringp(comparison_value_string) : "! stringp(comparison_value_string) " + ("Types.stringp(comparison_value_string) " + "CommonSymbols.NIL != Types.stringp(comparison_value_string) ") + comparison_value_string;
        assert NIL != decision_tree_node_p(if_node) : "! decision_tree.decision_tree_node_p(if_node) " + ("decision_tree.decision_tree_node_p(if_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_node_p(if_node) ") + if_node;
        assert NIL != decision_tree_node_p(else_node) : "! decision_tree.decision_tree_node_p(else_node) " + ("decision_tree.decision_tree_node_p(else_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_node_p(else_node) ") + else_node;
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

    /**
     * Convert a string to a number. If *DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*
     * is T, then truncate successfully parsed floats to integers.
     *
     * @return NIL or numberp
     */
    @LispMethod(comment = "Convert a string to a number. If *DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*\r\nis T, then truncate successfully parsed floats to integers.\r\n\r\n@return NIL or numberp\nConvert a string to a number. If *DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*\nis T, then truncate successfully parsed floats to integers.")
    public static final SubLObject decision_tree_string_to_number_alt(SubLObject value_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject raw_result = string_utilities.string_to_number(value_string);
                if ((NIL != $decision_tree_parse_numbers_as_integersP$.getDynamicValue(thread)) && raw_result.isDouble()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject integer = truncate(raw_result, UNPROVIDED);
                        SubLObject scrap = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return integer;
                    }
                }
                return raw_result;
            }
        }
    }

    /**
     * Convert a string to a number. If *DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*
     * is T, then truncate successfully parsed floats to integers.
     *
     * @return NIL or numberp
     */
    @LispMethod(comment = "Convert a string to a number. If *DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*\r\nis T, then truncate successfully parsed floats to integers.\r\n\r\n@return NIL or numberp\nConvert a string to a number. If *DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*\nis T, then truncate successfully parsed floats to integers.")
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

    /**
     *
     *
     * @unknown this is agnostic about the operator order
     */
    @LispMethod(comment = "@unknown this is agnostic about the operator order")
    public static final SubLObject decision_tree_non_leaf_node_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown this is agnostic about the operator order
     */
    @LispMethod(comment = "@unknown this is agnostic about the operator order")
    public static SubLObject decision_tree_non_leaf_node_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FIVE_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject new_decision_tree_leaf_node_alt(SubLObject return_value_string, SubLObject count_string) {
        if (count_string == UNPROVIDED) {
            count_string = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.sublisp_boolean($decision_tree_parser_transform_field_stringP$.getDynamicValue(thread))) {
                {
                    SubLObject return_value = read_from_string_ignoring_errors(return_value_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return list(return_value);
                }
            }
            if (NIL == list_utilities.sublisp_boolean($decision_tree_parser_keep_countsP$.getDynamicValue(thread))) {
                return list(return_value_string);
            }
            {
                SubLObject pieces = string_utilities.string_tokenize(count_string, $list_alt20, NIL, NIL, T, UNPROVIDED, UNPROVIDED);
                SubLObject numbers = Mapping.mapcar(READ_FROM_STRING_IGNORING_ERRORS, pieces);
                return cons(return_value_string, numbers);
            }
        }
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

    public static final SubLObject decision_tree_leaf_node_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.singletonP(v_object)) {
            return T;
        }
        return makeBoolean((v_object.isCons() && v_object.first().isString()) && (NIL != list_utilities.list_of_type_p(NUMBERP, v_object.rest())));
    }

    public static SubLObject decision_tree_leaf_node_p(final SubLObject v_object) {
        if (NIL != list_utilities.singletonP(v_object)) {
            return T;
        }
        return makeBoolean((v_object.isCons() && v_object.first().isString()) && (NIL != list_utilities.list_of_type_p(NUMBERP, v_object.rest())));
    }

    public static final SubLObject decision_tree_leaf_node_return_value_alt(SubLObject leaf_node) {
        SubLTrampolineFile.checkType(leaf_node, DECISION_TREE_LEAF_NODE_P);
        return leaf_node.first();
    }

    public static SubLObject decision_tree_leaf_node_return_value(final SubLObject leaf_node) {
        assert NIL != decision_tree_leaf_node_p(leaf_node) : "! decision_tree.decision_tree_leaf_node_p(leaf_node) " + ("decision_tree.decision_tree_leaf_node_p(leaf_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_leaf_node_p(leaf_node) ") + leaf_node;
        return leaf_node.first();
    }

    public static final SubLObject decision_tree_node_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_non_leaf_node_p(v_object)) || (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_leaf_node_p(v_object)));
    }

    public static SubLObject decision_tree_node_p(final SubLObject v_object) {
        return makeBoolean((NIL != decision_tree_non_leaf_node_p(v_object)) || (NIL != decision_tree_leaf_node_p(v_object)));
    }

    public static final SubLObject new_decision_tree_from_root_node_alt(SubLObject root_node) {
        SubLTrampolineFile.checkType(root_node, DECISION_TREE_NODE_P);
        return root_node;
    }

    public static SubLObject new_decision_tree_from_root_node(final SubLObject root_node) {
        assert NIL != decision_tree_node_p(root_node) : "! decision_tree.decision_tree_node_p(root_node) " + ("decision_tree.decision_tree_node_p(root_node) " + "CommonSymbols.NIL != decision_tree.decision_tree_node_p(root_node) ") + root_node;
        return root_node;
    }

    public static final SubLObject decision_tree_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.decision_tree.decision_tree_node_p(v_object);
    }

    public static SubLObject decision_tree_p(final SubLObject v_object) {
        return decision_tree_node_p(v_object);
    }

    public static final SubLObject decision_tree_root_node_alt(SubLObject tree) {
        return tree;
    }

    public static SubLObject decision_tree_root_node(final SubLObject tree) {
        return tree;
    }

    public static final SubLObject new_decision_tree_from_weka_j48_format_alt(SubLObject decision_tree_string) {
        {
            SubLObject tree = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_input_stream(decision_tree_string, ZERO_INTEGER, NIL);
                {
                    SubLObject root_node = com.cyc.cycjava.cycl.decision_tree.new_decision_tree_node_from_weka_j48_format(stream, NIL);
                    tree = com.cyc.cycjava.cycl.decision_tree.new_decision_tree_from_root_node(root_node);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return tree;
        }
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

    /**
     *
     *
     * @param ELSE-DEPTH
     * 		nil or integerp; the depth at which we expect to find the else clause of our parent node.
     */
    @LispMethod(comment = "@param ELSE-DEPTH\r\n\t\tnil or integerp; the depth at which we expect to find the else clause of our parent node.")
    public static final SubLObject new_decision_tree_node_from_weka_j48_format_alt(SubLObject stream, SubLObject else_depth) {
        {
            SubLObject line = read_line(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject tokens = string_utilities.string_tokenize(line, cons(CHAR_colon, string_utilities.whitespace_chars()), NIL, NIL, T, UNPROVIDED, UNPROVIDED);
            SubLObject depth = ZERO_INTEGER;
            while (NIL != Strings.string_equal(tokens.first(), $str_alt24$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                depth = add(depth, ONE_INTEGER);
                tokens = tokens.rest();
            } 
            {
                SubLObject field = tokens.first();
                SubLObject comparator_string = second(tokens);
                tokens = tokens.rest().rest();
                while (NIL == com.cyc.cycjava.cycl.decision_tree.decision_tree_comparator_string_p(comparator_string)) {
                    field = cconcatenate(field, new SubLObject[]{ $str_alt25$_, comparator_string });
                    comparator_string = tokens.first();
                    tokens = tokens.rest();
                } 
                {
                    SubLObject datum = tokens;
                    SubLObject current = datum;
                    SubLObject comparison_value_string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    comparison_value_string = current.first();
                    current = current.rest();
                    {
                        SubLObject return_value = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt26);
                        current = current.rest();
                        {
                            SubLObject counts_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt26);
                            current = current.rest();
                            if (NIL == current) {
                                if (!depth.eql(else_depth)) {
                                    {
                                        SubLObject if_node = (NIL != return_value) ? ((SubLObject) (com.cyc.cycjava.cycl.decision_tree.new_decision_tree_leaf_node(return_value, counts_string))) : com.cyc.cycjava.cycl.decision_tree.new_decision_tree_node_from_weka_j48_format(stream, NIL);
                                        SubLObject else_node = com.cyc.cycjava.cycl.decision_tree.new_decision_tree_node_from_weka_j48_format(stream, depth);
                                        return com.cyc.cycjava.cycl.decision_tree.new_decision_tree_non_leaf_node(field, comparator_string, comparison_value_string, if_node, else_node);
                                    }
                                } else {
                                    if (NIL != return_value) {
                                        return com.cyc.cycjava.cycl.decision_tree.new_decision_tree_leaf_node(return_value, counts_string);
                                    } else {
                                        return com.cyc.cycjava.cycl.decision_tree.new_decision_tree_node_from_weka_j48_format(stream, NIL);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt26);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ELSE-DEPTH
     * 		nil or integerp; the depth at which we expect to find the else clause of our parent node.
     */
    @LispMethod(comment = "@param ELSE-DEPTH\r\n\t\tnil or integerp; the depth at which we expect to find the else clause of our parent node.")
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

    public static final SubLObject evaluate_decision_tree_alt(SubLObject tree, SubLObject plist) {
        SubLTrampolineFile.checkType(tree, DECISION_TREE_P);
        return com.cyc.cycjava.cycl.decision_tree.evaluate_decision_tree_node(com.cyc.cycjava.cycl.decision_tree.decision_tree_root_node(tree), plist);
    }

    public static SubLObject evaluate_decision_tree(final SubLObject tree, final SubLObject plist) {
        assert NIL != decision_tree_p(tree) : "! decision_tree.decision_tree_p(tree) " + ("decision_tree.decision_tree_p(tree) " + "CommonSymbols.NIL != decision_tree.decision_tree_p(tree) ") + tree;
        return evaluate_decision_tree_node(decision_tree_root_node(tree), plist);
    }

    public static final SubLObject evaluate_decision_tree_node_alt(SubLObject node, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_leaf_node_p(node)) {
                return com.cyc.cycjava.cycl.decision_tree.decision_tree_leaf_node_return_value(node);
            } else {
                {
                    SubLObject datum = node;
                    SubLObject current = datum;
                    SubLObject field = NIL;
                    SubLObject comparator = NIL;
                    SubLObject comparison_value = NIL;
                    SubLObject if_node = NIL;
                    SubLObject else_node = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    field = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    comparator = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    comparison_value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    if_node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    else_node = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject field_value = com.cyc.cycjava.cycl.decision_tree.decision_tree_retrieve_value(plist, field, $UNPROVIDED, UNPROVIDED);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if ($UNPROVIDED == field_value) {
                                    Errors.error($str_alt30$A_value_for__s_must_be_provided_i, field, plist);
                                }
                            }
                            if (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_compare(comparator, field_value, comparison_value)) {
                                return com.cyc.cycjava.cycl.decision_tree.evaluate_decision_tree_node(if_node, plist);
                            } else {
                                return com.cyc.cycjava.cycl.decision_tree.evaluate_decision_tree_node(else_node, plist);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt28);
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject decision_tree_retrieve_value_alt(SubLObject data, SubLObject key, SubLObject unprovided_value, SubLObject decision_tree_value_lookup_function) {
        if (unprovided_value == UNPROVIDED) {
            unprovided_value = NIL;
        }
        if (decision_tree_value_lookup_function == UNPROVIDED) {
            decision_tree_value_lookup_function = $decision_tree_lookup_function$.getDynamicValue();
        }
        return funcall(decision_tree_value_lookup_function, data, key, unprovided_value);
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

    public static final SubLObject decision_tree_properties_alt(SubLObject tree) {
        {
            SubLObject properties_set = set.new_set(symbol_function(EQ), UNPROVIDED);
            return set.set_element_list(com.cyc.cycjava.cycl.decision_tree.decision_tree_properties_recursive(com.cyc.cycjava.cycl.decision_tree.decision_tree_root_node(tree), properties_set));
        }
    }

    public static SubLObject decision_tree_properties(final SubLObject tree) {
        final SubLObject properties_set = set.new_set(symbol_function(EQ), UNPROVIDED);
        return set.set_element_list(decision_tree_properties_recursive(decision_tree_root_node(tree), properties_set));
    }

    public static final SubLObject decision_tree_properties_recursive_alt(SubLObject node, SubLObject v_set) {
        if (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_leaf_node_p(node)) {
            return v_set;
        } else {
            {
                SubLObject datum = node;
                SubLObject current = datum;
                SubLObject field = NIL;
                SubLObject comparator = NIL;
                SubLObject comparison_value = NIL;
                SubLObject if_node = NIL;
                SubLObject else_node = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt28);
                field = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt28);
                comparator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt28);
                comparison_value = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt28);
                if_node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt28);
                else_node = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(field, v_set);
                    com.cyc.cycjava.cycl.decision_tree.decision_tree_properties_recursive(if_node, v_set);
                    return com.cyc.cycjava.cycl.decision_tree.decision_tree_properties_recursive(else_node, v_set);
                } else {
                    cdestructuring_bind_error(datum, $list_alt28);
                }
            }
        }
        return NIL;
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

    /**
     * Apply the hierarchical visitor to the nodes in a decision tree.
     *
     * @see HIEARCHICAL-VISITOR for the visitor's API
     */
    @LispMethod(comment = "Apply the hierarchical visitor to the nodes in a decision tree.\r\n\r\n@see HIEARCHICAL-VISITOR for the visitor\'s API")
    public static final SubLObject visit_decision_tree_hierarchically_alt(SubLObject dec_tree, SubLObject visitor) {
        SubLTrampolineFile.checkType(visitor, HIERARCHICAL_VISITOR_P);
        hierarchical_visitor.hierarchical_visitor_begin_visit(visitor);
        {
            SubLObject stack = stacks.create_stack();
            stacks.stack_push(list($VISIT, NIL, dec_tree), stack);
            while (NIL == stacks.stack_empty_p(stack)) {
                {
                    SubLObject current_task = stacks.stack_pop(stack);
                    SubLObject datum = current_task;
                    SubLObject current = datum;
                    SubLObject task = NIL;
                    SubLObject path = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    task = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    path = current.first();
                    current = current.rest();
                    {
                        SubLObject node = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt34);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = task;
                                if (pcase_var.eql($VISIT)) {
                                    hierarchical_visitor.show_hierarchical_visitor_path_begin(visitor, path);
                                    stacks.stack_push(list($FINISH, path), stack);
                                    if (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_non_leaf_node_p(node)) {
                                        {
                                            SubLObject datum_1 = node;
                                            SubLObject current_2 = datum_1;
                                            SubLObject elem1 = NIL;
                                            SubLObject elem2 = NIL;
                                            SubLObject elem3 = NIL;
                                            SubLObject if_clause = NIL;
                                            SubLObject else_clause = NIL;
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt36);
                                            elem1 = current_2.first();
                                            current_2 = current_2.rest();
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt36);
                                            elem2 = current_2.first();
                                            current_2 = current_2.rest();
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt36);
                                            elem3 = current_2.first();
                                            current_2 = current_2.rest();
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt36);
                                            if_clause = current_2.first();
                                            current_2 = current_2.rest();
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt36);
                                            else_clause = current_2.first();
                                            current_2 = current_2.rest();
                                            if (NIL == current_2) {
                                                {
                                                    SubLObject comparison = list(elem1, elem2, elem3);
                                                    SubLObject if_path = cons(comparison, path);
                                                    SubLObject negated_comparison = com.cyc.cycjava.cycl.decision_tree.visit_dectree_negate_comparison(comparison);
                                                    SubLObject else_path = cons(negated_comparison, path);
                                                    stacks.stack_push(list($VISIT, if_path, if_clause), stack);
                                                    stacks.stack_push(list($VISIT, else_path, else_clause), stack);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum_1, $list_alt36);
                                            }
                                        }
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_leaf_node_p(node)) {
                                            hierarchical_visitor.show_hierarchical_visitor_node(visitor, node);
                                        } else {
                                            Errors.error($str_alt37$Cannot_determine_the_node_type_fo, node);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($FINISH)) {
                                        hierarchical_visitor.show_hierarchical_visitor_path_end(visitor, path);
                                    } else {
                                        Errors.error($str_alt38$Invalid_state_transition__A_in_vi, current_task);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt34);
                        }
                    }
                }
            } 
        }
        hierarchical_visitor.hierarchical_visitor_end_visit(visitor);
        return visitor;
    }

    /**
     * Apply the hierarchical visitor to the nodes in a decision tree.
     *
     * @see HIEARCHICAL-VISITOR for the visitor's API
     */
    @LispMethod(comment = "Apply the hierarchical visitor to the nodes in a decision tree.\r\n\r\n@see HIEARCHICAL-VISITOR for the visitor\'s API")
    public static SubLObject visit_decision_tree_hierarchically(final SubLObject dec_tree, final SubLObject visitor) {
        assert NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) : "! hierarchical_visitor.hierarchical_visitor_p(visitor) " + ("hierarchical_visitor.hierarchical_visitor_p(visitor) " + "CommonSymbols.NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) ") + visitor;
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

    /**
     * Take a brute force conversion approach to the comparison,
     * flipping any operator into its negated form. The code will therefore
     * work correctly for pre-, in- and postfix expressions that are
     * syntactically well-formed.
     */
    @LispMethod(comment = "Take a brute force conversion approach to the comparison,\r\nflipping any operator into its negated form. The code will therefore\r\nwork correctly for pre-, in- and postfix expressions that are\r\nsyntactically well-formed.\nTake a brute force conversion approach to the comparison,\nflipping any operator into its negated form. The code will therefore\nwork correctly for pre-, in- and postfix expressions that are\nsyntactically well-formed.")
    public static final SubLObject visit_dectree_negate_comparison_alt(SubLObject comparison) {
        {
            SubLObject negated_comparison = NIL;
            SubLObject cdolist_list_var = comparison;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.decision_tree.decision_tree_comparison_operator_p(v_term)) {
                    {
                        SubLObject flipped_operator = com.cyc.cycjava.cycl.decision_tree.decision_tree_operator_negate(v_term);
                        negated_comparison = cons(flipped_operator, negated_comparison);
                    }
                } else {
                    negated_comparison = cons(v_term, negated_comparison);
                }
            }
            return nreverse(negated_comparison);
        }
    }

    @LispMethod(comment = "Take a brute force conversion approach to the comparison,\r\nflipping any operator into its negated form. The code will therefore\r\nwork correctly for pre-, in- and postfix expressions that are\r\nsyntactically well-formed.\nTake a brute force conversion approach to the comparison,\nflipping any operator into its negated form. The code will therefore\nwork correctly for pre-, in- and postfix expressions that are\nsyntactically well-formed.")
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
    }/**
     * Take a brute force conversion approach to the comparison,
     * flipping any operator into its negated form. The code will therefore
     * work correctly for pre-, in- and postfix expressions that are
     * syntactically well-formed.
     */


    public static SubLObject declare_decision_tree_file() {
        declareFunction("decision_tree_comparison_operator_p", "DECISION-TREE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("decision_tree_comparator_string_p", "DECISION-TREE-COMPARATOR-STRING-P", 1, 0, false);
        declareFunction("decision_tree_canonicalize_comparator_string", "DECISION-TREE-CANONICALIZE-COMPARATOR-STRING", 1, 0, false);
        declareFunction("decision_tree_compare", "DECISION-TREE-COMPARE", 3, 0, false);
        declareFunction("decision_tree_operator_negate", "DECISION-TREE-OPERATOR-NEGATE", 1, 0, false);
        declareFunction("decision_tree_field_from_field_name", "DECISION-TREE-FIELD-FROM-FIELD-NAME", 1, 0, false);
        declareFunction("new_decision_tree_non_leaf_node", "NEW-DECISION-TREE-NON-LEAF-NODE", 5, 0, false);
        declareFunction("decision_tree_string_to_number", "DECISION-TREE-STRING-TO-NUMBER", 1, 0, false);
        declareFunction("decision_tree_non_leaf_node_p", "DECISION-TREE-NON-LEAF-NODE-P", 1, 0, false);
        declareFunction("new_decision_tree_leaf_node", "NEW-DECISION-TREE-LEAF-NODE", 1, 1, false);
        declareFunction("decision_tree_leaf_node_p", "DECISION-TREE-LEAF-NODE-P", 1, 0, false);
        declareFunction("decision_tree_leaf_node_return_value", "DECISION-TREE-LEAF-NODE-RETURN-VALUE", 1, 0, false);
        declareFunction("decision_tree_node_p", "DECISION-TREE-NODE-P", 1, 0, false);
        declareFunction("new_decision_tree_from_root_node", "NEW-DECISION-TREE-FROM-ROOT-NODE", 1, 0, false);
        declareFunction("decision_tree_p", "DECISION-TREE-P", 1, 0, false);
        declareFunction("decision_tree_root_node", "DECISION-TREE-ROOT-NODE", 1, 0, false);
        declareFunction("new_decision_tree_from_weka_j48_format", "NEW-DECISION-TREE-FROM-WEKA-J48-FORMAT", 1, 0, false);
        declareFunction("new_decision_tree_node_from_weka_j48_format", "NEW-DECISION-TREE-NODE-FROM-WEKA-J48-FORMAT", 2, 0, false);
        declareFunction("evaluate_decision_tree", "EVALUATE-DECISION-TREE", 2, 0, false);
        declareFunction("evaluate_decision_tree_node", "EVALUATE-DECISION-TREE-NODE", 2, 0, false);
        declareFunction("decision_tree_retrieve_value", "DECISION-TREE-RETRIEVE-VALUE", 2, 2, false);
        declareFunction("decision_tree_properties", "DECISION-TREE-PROPERTIES", 1, 0, false);
        declareFunction("decision_tree_properties_recursive", "DECISION-TREE-PROPERTIES-RECURSIVE", 2, 0, false);
        declareFunction("visit_decision_tree_hierarchically", "VISIT-DECISION-TREE-HIERARCHICALLY", 2, 0, false);
        declareFunction("visit_dectree_negate_comparison", "VISIT-DECTREE-NEGATE-COMPARISON", 1, 0, false);
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

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("GT"), makeKeyword("LT"), makeKeyword("GE"), makeKeyword("LE"), makeKeyword("EQ"), makeKeyword("NE"));

    static private final SubLList $list_alt1 = list(makeString(">"), makeString(">="), makeString("<"), makeString("<="), makeString("="), makeString("!="));

    static private final SubLString $str_alt2$_ = makeString(">");

    static private final SubLString $str_alt4$__ = makeString(">=");

    static private final SubLString $str_alt6$_ = makeString("<");

    static private final SubLString $str_alt8$__ = makeString("<=");

    static private final SubLString $str_alt10$_ = makeString("=");

    static private final SubLString $str_alt12$__ = makeString("!=");

    static private final SubLString $str_alt14$Unexpected_decision_tree_comparat = makeString("Unexpected decision tree comparator-string ~s");

    static private final SubLString $str_alt15$Unexpected_decision_tree_comparat = makeString("Unexpected decision tree comparator ~s");

    static private final SubLString $str_alt16$Dont_know_how_to_negate_decision_ = makeString("Dont know how to negate decision tree operator ~A.");

    static private final SubLList $list_alt20 = list(CHAR_lparen, CHAR_rparen, CHAR_slash);

    static private final SubLString $str_alt24$_ = makeString("|");

    static private final SubLString $str_alt25$_ = makeString(" ");

    static private final SubLList $list_alt26 = list(makeSymbol("COMPARISON-VALUE-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("RETURN-VALUE"), makeSymbol("COUNTS-STRING"));

    static private final SubLList $list_alt28 = list(makeSymbol("FIELD"), makeSymbol("COMPARATOR"), makeSymbol("COMPARISON-VALUE"), makeSymbol("IF-NODE"), makeSymbol("ELSE-NODE"));

    static private final SubLString $str_alt30$A_value_for__s_must_be_provided_i = makeString("A value for ~s must be provided in ~s");

    static private final SubLList $list_alt34 = list(makeSymbol("TASK"), makeSymbol("PATH"), makeSymbol("&OPTIONAL"), makeSymbol("NODE"));

    static private final SubLList $list_alt36 = list(makeSymbol("ELEM1"), makeSymbol("ELEM2"), makeSymbol("ELEM3"), makeSymbol("IF-CLAUSE"), makeSymbol("ELSE-CLAUSE"));

    static private final SubLString $str_alt37$Cannot_determine_the_node_type_fo = makeString("Cannot determine the node-type for ~A.");

    static private final SubLString $str_alt38$Invalid_state_transition__A_in_vi = makeString("Invalid state transition ~A in visiting of DECISION-TREE");
}

/**
 * Total time: 185 ms
 */
