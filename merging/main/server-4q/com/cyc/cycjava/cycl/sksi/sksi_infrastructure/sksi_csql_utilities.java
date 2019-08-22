/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_disjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.cycjava.cycl.sunit_macros;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-CSQL-UTILITIES
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp
 * created:     2019/07/03 17:37:53
 */
public final class sksi_csql_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject sksi_csql_to_cycl_translation_test_case_p(SubLObject sksi_csql_to_cycl_translation_test_case) {
        return classes.subloop_instanceof_class(sksi_csql_to_cycl_translation_test_case, SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE);
    }

    public static final SubLObject make_csql_field_expression(SubLObject field_name, SubLObject table_name, SubLObject operator) {
        if (operator == UNPROVIDED) {
            operator = $FIELD;
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_csql_expression(operator, list(field_name, table_name));
    }

    public static final SubLFile me = new sksi_csql_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_commutative_comparison_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_non_commutative_comparison_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_reflexive_comparison_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_anti_reflexive_comparison_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_negated_comparison_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_comparison_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-COMPARISON-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_where_clause_terminal_operators$ = makeSymbol("*CSQL-WHERE-CLAUSE-TERMINAL-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $csql_other_operators$ = makeSymbol("*CSQL-OTHER-OPERATORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $csql_true$ = makeSymbol("*CSQL-TRUE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $csql_false$ = makeSymbol("*CSQL-FALSE*");

    // deflexical
    /**
     * A-list that maps CSQL comparison relations to their negations.
     */
    @LispMethod(comment = "A-list that maps CSQL comparison relations to their negations.\ndeflexical")
    private static final SubLSymbol $csql_comparison_relation_negations$ = makeSymbol("*CSQL-COMPARISON-RELATION-NEGATIONS*");

    // defconstant
    /**
     * List of the meta-characters in PostgreSQL regular expressions -- to be
     * extended to include the ones in other SQL flavors
     */
    @LispMethod(comment = "List of the meta-characters in PostgreSQL regular expressions -- to be\r\nextended to include the ones in other SQL flavors\ndefconstant\nList of the meta-characters in PostgreSQL regular expressions -- to be\nextended to include the ones in other SQL flavors")
    private static final SubLSymbol $sql_regular_expression_meta_characters$ = makeSymbol("*SQL-REGULAR-EXPRESSION-META-CHARACTERS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLNotEqual"), reader_make_constant_shell("CSQLTimesFn"), reader_make_constant_shell("CSQLPlusFn"));

    static private final SubLList $list1 = list(new SubLObject[]{ reader_make_constant_shell("CSQLGreaterThan"), reader_make_constant_shell("CSQLLessThan"), reader_make_constant_shell("CSQLGreaterThanOrEqualTo"), reader_make_constant_shell("CSQLLessThanOrEqualTo"), reader_make_constant_shell("CSQLDifferenceFn"), reader_make_constant_shell("CSQLQuotientFn"), makeKeyword("IN"), makeKeyword("BETWEEN"), reader_make_constant_shell("CSQLLike"), reader_make_constant_shell("CSQLUnlike"), reader_make_constant_shell("CSQLLike-CaseInsensitive"), reader_make_constant_shell("CSQLSubstring"), reader_make_constant_shell("CSQLStringSubword"), reader_make_constant_shell("CSQLSubstring-CaseInsensitive") });

    static private final SubLList $list2 = list(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLEquals"), reader_make_constant_shell("CSQLLike"), reader_make_constant_shell("CSQLLike-CaseInsensitive"), reader_make_constant_shell("CSQLSubstring"), reader_make_constant_shell("CSQLSubstring-CaseInsensitive"));

    static private final SubLList $list3 = list(reader_make_constant_shell("CSQLNotEqual"), reader_make_constant_shell("CSQLUnlike"), reader_make_constant_shell("CSQLDifferent"));

    static private final SubLList $list4 = list(makeKeyword("FIELD"), makeKeyword("VALUES"), makeKeyword("VALUE"), $LIST, makeKeyword("KEY"), makeKeyword("KEY-VALUE"));

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SELECT"), makeKeyword("INSERT"), makeKeyword("DELETE"), $FROM, $INTO, makeKeyword("WHERE"), makeKeyword("FIELD"), makeKeyword("TABLE"), makeKeyword("KEY"), makeKeyword("KEY-VALUE"), makeKeyword("COUNT"), makeKeyword("ALL") });

    private static final SubLList $list9 = list(makeKeyword("FIELD"), makeKeyword("KEY"), makeKeyword("KEY-VALUE"));

    static private final SubLList $list14 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("TABLES"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("ORDERBY"));

    private static final SubLList $list15 = list(makeKeyword("COUNT"), makeKeyword("ALL"));





    private static final SubLSymbol CSQL_WHERE_SUBCLAUSE_P = makeSymbol("CSQL-WHERE-SUBCLAUSE-P");

    private static final SubLList $list19 = list(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLEquals"));

















    private static final SubLObject $$CSQLSubstring_CaseInsensitive = reader_make_constant_shell("CSQLSubstring-CaseInsensitive");







    private static final SubLList $list33 = list(reader_make_constant_shell("CSQLOr"), reader_make_constant_shell("TheList"));

    private static final SubLList $list35 = list(cons(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLNotEqual")), cons(reader_make_constant_shell("CSQLNotEqual"), reader_make_constant_shell("CSQLStrictlyEquals")), cons(reader_make_constant_shell("CSQLGreaterThan"), reader_make_constant_shell("CSQLLessThanOrEqualTo")), cons(reader_make_constant_shell("CSQLLessThanOrEqualTo"), reader_make_constant_shell("CSQLGreaterThan")), cons(reader_make_constant_shell("CSQLLessThan"), reader_make_constant_shell("CSQLGreaterThanOrEqualTo")), cons(reader_make_constant_shell("CSQLGreaterThanOrEqualTo"), reader_make_constant_shell("CSQLLessThan")), cons(reader_make_constant_shell("CSQLEquals"), reader_make_constant_shell("CSQLDifferent")), cons(reader_make_constant_shell("CSQLDifferent"), reader_make_constant_shell("CSQLEquals")));

    private static final SubLList $list37 = list(makeSymbol("TABLE-SHORT-NAME"), makeSymbol("TABLE-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("NAMESPACE"));

    private static final SubLString $$$subject = makeString("subject");

    private static final SubLString $$$predicate = makeString("predicate");

    private static final SubLString $$$object = makeString("object");

    private static final SubLList $list41 = list(makeSymbol("FIELD-KEYWORD"), makeSymbol("EXPRESSION1"), makeSymbol("&OPTIONAL"), makeSymbol("EXPRESSION2"));



    private static final SubLList $list43 = list(makeSymbol("FIELD-KEYWORD-2"), makeSymbol("EXPRESSION1-2"), makeSymbol("&OPTIONAL"), makeSymbol("EXPRESSION2-2"));



    static private final SubLList $list45 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("UNKNOWN-SENTENCE-SELECT"), makeSymbol("UNKNOWN-SENTENCE-FROM"), makeSymbol("UNKNOWN-SENTENCE-WHERE"));

    private static final SubLList $list46 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("UNKNOWN-SENTENCE-FIELDS"), makeSymbol("UNKNOWN-SENTENCE-TABLES"), makeSymbol("UNKNOWN-SENTENCE-WHERE"));

    private static final SubLSymbol $sym49$CSQL_FIELD__ = makeSymbol("CSQL-FIELD-<");

    private static final SubLString $str51$_VAR = makeString("?VAR");

    private static final SubLSymbol CSQL_COMPARISON_PREDICATE_P = makeSymbol("CSQL-COMPARISON-PREDICATE-P");

    private static final SubLSymbol LITERAL_PREDICATE = makeSymbol("LITERAL-PREDICATE");

    private static final SubLString $str54$Could_not_correctly_order_compari = makeString("Could not correctly order comparison literals in SPARQL SKSI query, they will be stuck at the end");

    static private final SubLList $list56 = list(makeSymbol("KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    static private final SubLList $list57 = list(makeSymbol("KEYWORD"), makeSymbol("TABLES"));

    static private final SubLList $list58 = list(makeSymbol("KEYWORD"), makeSymbol("WHERE-CLAUSE"));

    private static final SubLList $list59 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    private static final SubLString $str60$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");

    private static final SubLList $list61 = list(makeSymbol("FROM-KEYWORD"), makeSymbol("TABLES"));

    private static final SubLString $str62$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :from");

    private static final SubLList $list63 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-CLAUSE"));

    private static final SubLString $str64$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :where");

    private static final SubLSymbol CSQL_FIELD_TABLE_NAME = makeSymbol("CSQL-FIELD-TABLE-NAME");

    private static final SubLString $str66$__ = makeString("_%");

    private static final SubLSymbol SQL_REGULAR_EXPRESSION_CHAR_P = makeSymbol("SQL-REGULAR-EXPRESSION-CHAR-P");



    private static final SubLList $list69 = list(makeSymbol("LEFT"), makeSymbol("RIGHT"));



    private static final SubLList $list71 = list(makeSymbol("SOURCE-CLAIMS-CYCL"));







    private static final SubLObject $$fieldValueComparison_Inverse = reader_make_constant_shell("fieldValueComparison-Inverse");







    private static final SubLList $list80 = list(list(makeSymbol("SELECT"), makeSymbol("FROM"), makeSymbol("WHERE")), makeSymbol("SELECT-QUERY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym81$SELECT_KEYWORD = makeUninternedSymbol("SELECT-KEYWORD");

    private static final SubLSymbol $sym82$SELECT_FIELDS = makeUninternedSymbol("SELECT-FIELDS");

    private static final SubLSymbol $sym83$FROM_CLAUSE = makeUninternedSymbol("FROM-CLAUSE");

    private static final SubLSymbol $sym84$WHERE_CLAUSE = makeUninternedSymbol("WHERE-CLAUSE");

    private static final SubLSymbol $sym86$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLString $$$SKSI_CSQL_Utilities_Category = makeString("SKSI CSQL Utilities Category");

    private static final SubLString $$$SKSI_Category = makeString("SKSI Category");

    // Definitions
    public static final SubLObject csql_expression_operator_alt(SubLObject csql) {
        return csql.first();
    }

    // Definitions
    public static SubLObject csql_expression_operator(final SubLObject csql) {
        return csql.first();
    }

    public static final SubLObject csql_expression_arguments_alt(SubLObject csql) {
        return csql.rest();
    }

    public static SubLObject csql_expression_arguments(final SubLObject csql) {
        return csql.rest();
    }

    public static final SubLObject csql_expression_arg_alt(SubLObject csql, SubLObject n) {
        return nth(n, csql);
    }

    public static SubLObject csql_expression_arg(final SubLObject csql, final SubLObject n) {
        return nth(n, csql);
    }

    public static final SubLObject csql_expression_arg1_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg(csql, ONE_INTEGER);
    }

    public static SubLObject csql_expression_arg1(final SubLObject csql) {
        return csql_expression_arg(csql, ONE_INTEGER);
    }

    public static final SubLObject csql_expression_arg2_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg(csql, TWO_INTEGER);
    }

    public static SubLObject csql_expression_arg2(final SubLObject csql) {
        return csql_expression_arg(csql, TWO_INTEGER);
    }

    public static SubLObject csql_expression_arg3(final SubLObject csql) {
        return csql_expression_arg(csql, THREE_INTEGER);
    }

    public static final SubLObject csql_true_p_alt(SubLObject expression) {
        return eq($csql_true$.getGlobalValue(), expression);
    }

    public static SubLObject csql_true_p(final SubLObject expression) {
        return eq($csql_true$.getGlobalValue(), expression);
    }

    public static final SubLObject csql_false_p_alt(SubLObject expression) {
        return eq($csql_false$.getGlobalValue(), expression);
    }

    public static SubLObject csql_false_p(final SubLObject expression) {
        return eq($csql_false$.getGlobalValue(), expression);
    }

    public static final SubLObject csql_where_clause_commutative_comparison_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_commutative_comparison_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_commutative_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_commutative_comparison_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_non_commutative_comparison_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_non_commutative_comparison_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_non_commutative_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_non_commutative_comparison_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_reflexive_comparison_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_reflexive_comparison_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_reflexive_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_reflexive_comparison_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_anti_reflexive_comparison_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_anti_reflexive_comparison_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_anti_reflexive_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_anti_reflexive_comparison_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_negated_comparison_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_negated_comparison_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_negated_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_negated_comparison_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_comparison_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_comparison_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_comparison_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_boolean_logical_operator_p_alt(SubLObject v_object) {
        return fort_types_interface.csql_logical_connective_p(v_object);
    }

    public static SubLObject csql_where_clause_boolean_logical_operator_p(final SubLObject v_object) {
        return fort_types_interface.csql_logical_connective_p(v_object);
    }

    public static final SubLObject csql_where_clause_quantifier_logical_operator_p_alt(SubLObject v_object) {
        return fort_types_interface.csql_quantifier_p(v_object);
    }

    public static SubLObject csql_where_clause_quantifier_logical_operator_p(final SubLObject v_object) {
        return fort_types_interface.csql_quantifier_p(v_object);
    }

    public static final SubLObject csql_where_clause_logical_operator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != fort_types_interface.csql_logical_connective_p(v_object)) || (NIL != fort_types_interface.csql_quantifier_p(v_object)));
    }

    public static SubLObject csql_where_clause_logical_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != fort_types_interface.csql_logical_connective_p(v_object)) || (NIL != fort_types_interface.csql_quantifier_p(v_object)));
    }

    public static final SubLObject csql_where_clause_terminal_operator_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_terminal_operators$.getGlobalValue());
    }

    public static SubLObject csql_where_clause_terminal_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $csql_where_clause_terminal_operators$.getGlobalValue());
    }

    public static final SubLObject csql_where_clause_commutative_operator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_commutative_comparison_operator_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_boolean_logical_operator_p(v_object)));
    }

    public static SubLObject csql_where_clause_commutative_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != csql_where_clause_commutative_comparison_operator_p(v_object)) || (NIL != csql_where_clause_boolean_logical_operator_p(v_object)));
    }

    public static final SubLObject csql_where_clause_operator_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_comparison_operator_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_logical_operator_p(v_object))) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_terminal_operator_p(v_object)));
    }

    public static SubLObject csql_where_clause_operator_p(final SubLObject v_object) {
        return makeBoolean(((NIL != csql_where_clause_comparison_operator_p(v_object)) || (NIL != csql_where_clause_logical_operator_p(v_object))) || (NIL != csql_where_clause_terminal_operator_p(v_object)));
    }

    public static final SubLObject csql_operator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.member_eqP(v_object, $csql_other_operators$.getGlobalValue())) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_operator_p(v_object)));
    }

    public static SubLObject csql_operator_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.member_eqP(v_object, $csql_other_operators$.getGlobalValue())) || (NIL != csql_where_clause_operator_p(v_object)));
    }

    public static final SubLObject csql_from_clause_p_alt(SubLObject csql) {
        return makeBoolean((csql.isList() && ($FROM == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql))) && (NIL != list_utilities.lengthE(csql, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject csql_from_clause_p(final SubLObject csql) {
        return makeBoolean((csql.isList() && ($FROM == csql_expression_operator(csql))) && (NIL != list_utilities.lengthE(csql, TWO_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject csql_where_clause_p_alt(SubLObject csql) {
        return makeBoolean((csql.isList() && ($WHERE == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql))) && (NIL != list_utilities.lengthE(csql, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject csql_where_clause_p(final SubLObject csql) {
        return makeBoolean((csql.isList() && ($WHERE == csql_expression_operator(csql))) && (NIL != list_utilities.lengthE(csql, TWO_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject csql_select_query_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && ($SELECT == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql)));
    }

    public static SubLObject csql_select_query_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && ($SELECT == csql_expression_operator(csql)));
    }

    public static final SubLObject make_csql_expression_alt(SubLObject operator, SubLObject args) {
        return cons(operator, args);
    }

    public static SubLObject make_csql_expression(final SubLObject operator, final SubLObject args) {
        return cons(operator, args);
    }

    public static final SubLObject make_pfi_for_csql_field_expression_alt(SubLObject field_exp, SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        {
            SubLObject field_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_field_name(field_exp);
            SubLObject table_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_table_name(field_exp);
            SubLObject sks_name = sksi_kb_accessors.sk_source_name(sk_source);
            SubLObject pfi = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(sks_name, field_name, from_expression);
            SubLObject table_alias = NIL;
            if (!table_name.equal(sks_name)) {
                table_alias = string_utilities.string_to_integer(sksi_query_datastructures.table_alias_alias_suffix(table_name, sks_name));
                if (table_alias.isInteger()) {
                    pfi = sksi_kb_accessors.pfi_alias_naut_for_pfi_and_alias_index(pfi, table_alias);
                }
            }
            return pfi;
        }
    }

    public static SubLObject make_pfi_for_csql_field_expression(final SubLObject field_exp, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        final SubLObject field_name = csql_field_expression_field_name(field_exp);
        final SubLObject table_name = csql_field_expression_table_name(field_exp);
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sk_source);
        SubLObject pfi = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(sks_name, field_name, from_expression);
        SubLObject table_alias = NIL;
        if (!table_name.equal(sks_name)) {
            table_alias = string_utilities.string_to_integer(sksi_query_datastructures.table_alias_alias_suffix(table_name, sks_name));
            if (table_alias.isInteger()) {
                pfi = sksi_kb_accessors.pfi_alias_naut_for_pfi_and_alias_index(pfi, table_alias);
            }
        }
        return pfi;
    }

    public static final SubLObject csql_field_expression_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && (NIL != list_utilities.member_eqP(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql), $list_alt10)));
    }

    public static SubLObject csql_field_expression_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && (NIL != list_utilities.member_eqP(csql_expression_operator(csql), $list9)));
    }

    public static SubLObject construct_csql_field_expression(final SubLObject field_name, final SubLObject table_name, final SubLObject table_namespace) {
        return NIL != table_namespace ? list($FIELD, field_name, table_name, table_namespace) : list($FIELD, field_name, table_name);
    }

    public static final SubLObject csql_field_expression_field_name_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg1(csql);
    }

    public static SubLObject csql_field_expression_field_name(final SubLObject csql) {
        return csql_expression_arg1(csql);
    }

    public static final SubLObject csql_field_expression_table_name_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg2(csql);
    }

    public static SubLObject csql_field_expression_table_name(final SubLObject csql) {
        return csql_expression_arg2(csql);
    }

    public static SubLObject csql_field_expression_namespace(final SubLObject csql) {
        return csql_expression_arg3(csql);
    }

    public static SubLObject csql_field_expression_has_namespaceP(final SubLObject csql) {
        return list_utilities.lengthGE(csql, FOUR_INTEGER, UNPROVIDED);
    }

    public static SubLObject make_table_alias(final SubLObject table_name, final SubLObject alias, final SubLObject namespace) {
        return list($TABLE_ALIAS, table_name, alias, namespace);
    }

    public static final SubLObject csql_table_expression_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql) == $TABLE));
    }

    public static SubLObject csql_table_expression_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && (csql_expression_operator(csql) == $TABLE));
    }

    public static SubLObject csql_table_expression_table_name(final SubLObject csql) {
        return csql_expression_arg1(csql);
    }

    public static SubLObject csql_table_expression_alias(final SubLObject csql) {
        return csql_expression_arg2(csql);
    }

    public static SubLObject csql_table_expression_namespace(final SubLObject csql) {
        return csql_expression_arg3(csql);
    }

    public static SubLObject csql_table_expression_has_namespaceP(final SubLObject csql) {
        return list_utilities.lengthGE(csql, FOUR_INTEGER, UNPROVIDED);
    }

    public static final SubLObject csql_eval_expression_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql) == $EVAL));
    }

    public static SubLObject csql_eval_expression_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && (csql_expression_operator(csql) == $EVAL));
    }

    public static final SubLObject csql_functional_expression_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && (NIL != fort_types_interface.csql_function_p(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql))));
    }

    public static SubLObject csql_functional_expression_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && (NIL != fort_types_interface.csql_function_p(csql_expression_operator(csql))));
    }

    public static final SubLObject boolean_csqlP_alt(SubLObject csql) {
        {
            SubLObject datum = csql;
            SubLObject current = datum;
            SubLObject select_keyword = NIL;
            SubLObject fields = NIL;
            SubLObject tables = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            select_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            fields = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            tables = current.first();
            current = current.rest();
            {
                SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt13);
                current = current.rest();
                if (NIL == current) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.boolean_csql_selectP(fields);
                } else {
                    cdestructuring_bind_error(datum, $list_alt13);
                }
            }
        }
        return NIL;
    }

    public static SubLObject boolean_csqlP(final SubLObject csql) {
        SubLObject select_keyword = NIL;
        SubLObject fields = NIL;
        SubLObject tables = NIL;
        destructuring_bind_must_consp(csql, csql, $list14);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list14);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list14);
        tables = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list14);
        current = current.rest();
        final SubLObject orderby = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list14);
        current = current.rest();
        if (NIL == current) {
            return boolean_csql_selectP(fields);
        }
        cdestructuring_bind_error(csql, $list14);
        return NIL;
    }

    public static final SubLObject boolean_csql_selectP_alt(SubLObject select) {
        return equal(select, $list_alt14);
    }

    public static SubLObject boolean_csql_selectP(final SubLObject select) {
        return equal(select, $list15);
    }

    public static final SubLObject csql_where_subclause_with_operator_p_alt(SubLObject csql, SubLObject operator) {
        return makeBoolean(csql.isCons() && (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql) == operator));
    }

    public static SubLObject csql_where_subclause_with_operator_p(final SubLObject csql, final SubLObject operator) {
        return makeBoolean(csql.isCons() && csql_expression_operator(csql).eql(operator));
    }

    public static final SubLObject csql_disjunction_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLOr);
    }

    public static SubLObject csql_disjunction_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLOr);
    }

    public static final SubLObject csql_disjunction_disjuncts_alt(SubLObject csql) {
        return csql.rest();
    }

    public static SubLObject csql_disjunction_disjuncts(final SubLObject csql) {
        return csql.rest();
    }

    public static final SubLObject make_csql_implicit_conjunction_alt(SubLObject csql) {
        return list(csql);
    }

    public static SubLObject make_csql_implicit_conjunction(final SubLObject csql) {
        return list(csql);
    }

    public static final SubLObject csql_conjunction_p_alt(SubLObject csql) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_explicit_conjunction_p(csql)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_implicit_conjunction_p(csql)));
    }

    public static SubLObject csql_conjunction_p(final SubLObject csql) {
        return makeBoolean((NIL != csql_explicit_conjunction_p(csql)) || (NIL != csql_implicit_conjunction_p(csql)));
    }

    public static final SubLObject csql_explicit_conjunction_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLAnd);
    }

    public static SubLObject csql_explicit_conjunction_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLAnd);
    }

    public static final SubLObject csql_implicit_conjunction_p_alt(SubLObject csql) {
        return list_utilities.list_of_type_p(CSQL_WHERE_SUBCLAUSE_P, csql);
    }

    public static SubLObject csql_implicit_conjunction_p(final SubLObject csql) {
        return list_utilities.list_of_type_p(CSQL_WHERE_SUBCLAUSE_P, csql);
    }

    public static final SubLObject csql_conjunction_conjuncts_alt(SubLObject csql) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_explicit_conjunction_p(csql)) {
            return csql.rest();
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_implicit_conjunction_p(csql)) {
                return csql;
            }
        }
        return NIL;
    }

    public static SubLObject csql_conjunction_conjuncts(final SubLObject csql) {
        if (NIL != csql_explicit_conjunction_p(csql)) {
            return csql.rest();
        }
        if (NIL != csql_implicit_conjunction_p(csql)) {
            return csql;
        }
        return NIL;
    }

    public static final SubLObject csql_equality_relation_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list_alt18);
    }

    public static SubLObject csql_equality_relation_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list19);
    }

    public static final SubLObject csql_equal_clause_p_alt(SubLObject csql) {
        return makeBoolean(csql.isCons() && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_equality_relation_p(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql))));
    }

    public static SubLObject csql_equal_clause_p(final SubLObject csql) {
        return makeBoolean(csql.isCons() && (NIL != csql_equality_relation_p(csql_expression_operator(csql))));
    }

    public static final SubLObject csql_L_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLLessThan);
    }

    public static SubLObject csql_L_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLLessThan);
    }

    public static final SubLObject csql_LE_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLLessThanOrEqualTo);
    }

    public static SubLObject csql_LE_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLLessThanOrEqualTo);
    }

    public static final SubLObject csql_G_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLGreaterThan);
    }

    public static SubLObject csql_G_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLGreaterThan);
    }

    public static final SubLObject csql_GE_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLGreaterThanOrEqualTo);
    }

    public static SubLObject csql_GE_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLGreaterThanOrEqualTo);
    }

    public static final SubLObject csql_LG_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLNotEqual);
    }

    public static SubLObject csql_LG_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLNotEqual);
    }

    public static final SubLObject csql_like_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLLike);
    }

    public static SubLObject csql_like_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLLike);
    }

    public static final SubLObject csql_subword_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLStringSubword);
    }

    public static SubLObject csql_subword_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLStringSubword);
    }

    public static final SubLObject csql_substring_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLSubstring);
    }

    public static SubLObject csql_substring_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLSubstring);
    }

    public static final SubLObject csql_isubstring_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLSubstring_CaseInsensitive);
    }

    public static SubLObject csql_isubstring_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLSubstring_CaseInsensitive);
    }

    public static final SubLObject csql_different_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLDifferent);
    }

    public static SubLObject csql_different_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLDifferent);
    }

    public static final SubLObject csql_later_than_clause_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLLaterThan);
    }

    public static SubLObject csql_later_than_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLLaterThan);
    }

    public static final SubLObject csql_negation_p_alt(SubLObject csql) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_subclause_with_operator_p(csql, $$CSQLNot);
    }

    public static SubLObject csql_negation_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, $$CSQLNot);
    }

    public static final SubLObject csql_comparison_clause_p_alt(SubLObject csql) {
        return makeBoolean(csql.isCons() && ((NIL != fort_types_interface.csql_comparison_predicate_p(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql))) || (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql) == $NOT_NULL)));
    }

    public static SubLObject csql_comparison_clause_p(final SubLObject csql) {
        return makeBoolean(csql.isCons() && ((NIL != fort_types_interface.csql_comparison_predicate_p(csql_expression_operator(csql))) || (csql_expression_operator(csql) == $NOT_NULL)));
    }

    public static final SubLObject csql_where_subclause_p_alt(SubLObject csql) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_explicit_conjunction_p(csql)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_comparison_clause_p(csql))) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_negation_p(csql)));
    }

    public static SubLObject csql_where_subclause_p(final SubLObject csql) {
        return makeBoolean(((NIL != csql_explicit_conjunction_p(csql)) || (NIL != csql_comparison_clause_p(csql))) || (NIL != csql_negation_p(csql)));
    }

    public static final SubLObject csql_comparison_or_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && (NIL != list_utilities.member_eqP(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql), $list_alt32)));
    }

    public static SubLObject csql_comparison_or_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && (NIL != list_utilities.member_eqP(csql_expression_operator(csql), $list33)));
    }

    public static final SubLObject csql_comparison_and_p_alt(SubLObject csql) {
        return makeBoolean(csql.isList() && (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(csql) == $$CSQLAnd));
    }

    public static SubLObject csql_comparison_and_p(final SubLObject csql) {
        return makeBoolean(csql.isList() && csql_expression_operator(csql).eql($$CSQLAnd));
    }

    public static final SubLObject csql_conjoin_expressions_alt(SubLObject expressions) {
        SubLTrampolineFile.checkType(expressions, LISTP);
        {
            SubLObject pcase_var = length(expressions);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return $csql_true$.getGlobalValue();
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return expressions.first();
                } else {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_csql_expression($$CSQLAnd, expressions);
                }
            }
        }
    }

    public static SubLObject csql_conjoin_expressions(final SubLObject expressions) {
        assert NIL != listp(expressions) : "! listp(expressions) " + ("Types.listp(expressions) " + "CommonSymbols.NIL != Types.listp(expressions) ") + expressions;
        final SubLObject pcase_var = length(expressions);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return $csql_true$.getGlobalValue();
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return expressions.first();
        }
        return make_csql_expression($$CSQLAnd, expressions);
    }

    public static final SubLObject csql_disjoin_expressions_alt(SubLObject expressions) {
        SubLTrampolineFile.checkType(expressions, LISTP);
        {
            SubLObject pcase_var = length(expressions);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return $csql_false$.getGlobalValue();
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return expressions.first();
                } else {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_csql_expression($$CSQLOr, expressions);
                }
            }
        }
    }

    public static SubLObject csql_disjoin_expressions(final SubLObject expressions) {
        assert NIL != listp(expressions) : "! listp(expressions) " + ("Types.listp(expressions) " + "CommonSymbols.NIL != Types.listp(expressions) ") + expressions;
        final SubLObject pcase_var = length(expressions);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return $csql_false$.getGlobalValue();
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return expressions.first();
        }
        return make_csql_expression($$CSQLOr, expressions);
    }

    public static final SubLObject csql_negate_expression_alt(SubLObject expression) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_true_p(expression)) {
            return $csql_false$.getGlobalValue();
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_false_p(expression)) {
                return $csql_true$.getGlobalValue();
            } else {
                return list($$CSQLNot, expression);
            }
        }
    }

    public static SubLObject csql_negate_expression(final SubLObject expression) {
        if (NIL != csql_true_p(expression)) {
            return $csql_false$.getGlobalValue();
        }
        if (NIL != csql_false_p(expression)) {
            return $csql_true$.getGlobalValue();
        }
        return list($$CSQLNot, expression);
    }

    public static final SubLObject csql_negate_comparison_relation_alt(SubLObject relation) {
        return assoc(relation, $csql_comparison_relation_negations$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject csql_negate_comparison_relation(final SubLObject relation) {
        return assoc(relation, $csql_comparison_relation_negations$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    /**
     *
     *
     * @param SELECT;
     * 		listp : a list of pairs of field and table names
     * @param FROM;
     * 		listp : a list of table names
     * @param WHERE;
     * 		listp : a list of where expressions
     * @param CANONICALIZE?;
     * 		boolean : should the result be canonicalized?
     */
    @LispMethod(comment = "@param SELECT;\r\n\t\tlistp : a list of pairs of field and table names\r\n@param FROM;\r\n\t\tlistp : a list of table names\r\n@param WHERE;\r\n\t\tlistp : a list of where expressions\r\n@param CANONICALIZE?;\r\n\t\tboolean : should the result be canonicalized?")
    public static final SubLObject make_csql_query_alt(SubLObject select, SubLObject from, SubLObject where, SubLObject canonicalizeP) {
        if (canonicalizeP == UNPROVIDED) {
            canonicalizeP = NIL;
        }
        {
            SubLObject csql = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_csql_query_int(select, from, where);
            if (NIL != canonicalizeP) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql(csql, UNPROVIDED, UNPROVIDED);
            } else {
                return csql;
            }
        }
    }

    /**
     *
     *
     * @param SELECT;
     * 		listp : a list of pairs of field and table names
     * @param FROM;
     * 		listp : a list of table names
     * @param WHERE;
     * 		listp : a list of where expressions
     * @param CANONICALIZE?;
     * 		boolean : should the result be canonicalized?
     */
    @LispMethod(comment = "@param SELECT;\r\n\t\tlistp : a list of pairs of field and table names\r\n@param FROM;\r\n\t\tlistp : a list of table names\r\n@param WHERE;\r\n\t\tlistp : a list of where expressions\r\n@param CANONICALIZE?;\r\n\t\tboolean : should the result be canonicalized?")
    public static SubLObject make_csql_query(final SubLObject select, final SubLObject from, final SubLObject where, SubLObject canonicalizeP) {
        if (canonicalizeP == UNPROVIDED) {
            canonicalizeP = NIL;
        }
        final SubLObject csql = make_csql_query_int(select, from, where);
        if (NIL != canonicalizeP) {
            return canonicalize_csql(csql, UNPROVIDED, UNPROVIDED);
        }
        return csql;
    }

    public static final SubLObject make_csql_query_int_alt(SubLObject select, SubLObject from, SubLObject where) {
        {
            SubLObject where_exp = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.contract_where_clause(where);
            SubLObject select_exp = NIL;
            SubLObject from_exp = NIL;
            if (select.isInteger()) {
                select_exp = select;
            } else {
                if (select.isCons()) {
                    {
                        SubLObject cdolist_list_var = select;
                        SubLObject each_select = NIL;
                        for (each_select = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_select = cdolist_list_var.first()) {
                            SubLTrampolineFile.checkType(each_select, LISTP);
                            {
                                SubLObject pcase_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(each_select);
                                if (pcase_var.eql($FIELD)) {
                                    select_exp = cons(each_select, select_exp);
                                } else {
                                    if (pcase_var.eql($EVAL)) {
                                        select_exp = cons(each_select, select_exp);
                                    } else {
                                        select_exp = cons(cons($FIELD, each_select), select_exp);
                                    }
                                }
                            }
                        }
                    }
                    select_exp = nreverse(select_exp);
                } else {
                    if (NIL == select) {
                        select_exp = $list_alt14;
                    }
                }
            }
            {
                SubLObject cdolist_list_var = from;
                SubLObject each_from = NIL;
                for (each_from = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_from = cdolist_list_var.first()) {
                    if ($TABLE == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(each_from)) {
                        {
                            SubLObject alias = third(each_from);
                            if ((NIL != list_utilities.tree_find(alias, select, symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.tree_find(alias, where, symbol_function(EQUAL), UNPROVIDED))) {
                                from_exp = cons(each_from, from_exp);
                            }
                        }
                    } else {
                        {
                            SubLObject alias = second(each_from);
                            if ((NIL != list_utilities.tree_find(alias, select, symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.tree_find(alias, where, symbol_function(EQUAL), UNPROVIDED))) {
                                from_exp = cons(cons($TABLE, each_from), from_exp);
                            }
                        }
                    }
                }
            }
            if (NIL != where_exp) {
                return list($SELECT, select_exp, list($FROM, from_exp), list($WHERE, where_exp));
            } else {
                return list($SELECT, select_exp, list($FROM, from_exp));
            }
        }
    }

    public static SubLObject make_csql_query_int(final SubLObject select, final SubLObject from, final SubLObject where) {
        final SubLObject where_exp = contract_where_clause(where);
        SubLObject select_exp = NIL;
        SubLObject from_exp = NIL;
        if (select.isInteger()) {
            select_exp = select;
        } else
            if (select.isCons()) {
                SubLObject cdolist_list_var = select;
                SubLObject each_select = NIL;
                each_select = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assert NIL != listp(each_select) : "! listp(each_select) " + ("Types.listp(each_select) " + "CommonSymbols.NIL != Types.listp(each_select) ") + each_select;
                    final SubLObject pcase_var = csql_expression_operator(each_select);
                    if (pcase_var.eql($FIELD)) {
                        select_exp = cons(each_select, select_exp);
                    } else
                        if (pcase_var.eql($EVAL)) {
                            select_exp = cons(each_select, select_exp);
                        } else {
                            select_exp = cons(cons($FIELD, each_select), select_exp);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    each_select = cdolist_list_var.first();
                } 
                select_exp = nreverse(select_exp);
            } else
                if (NIL == select) {
                    select_exp = $list15;
                }


        SubLObject cdolist_list_var = from;
        SubLObject each_from = NIL;
        each_from = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($TABLE == csql_expression_operator(each_from)) {
                final SubLObject alias = third(each_from);
                if ((NIL != list_utilities.tree_find(alias, select, symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.tree_find(alias, where, symbol_function(EQUAL), UNPROVIDED))) {
                    from_exp = cons(each_from, from_exp);
                }
            } else {
                final SubLObject alias = second(each_from);
                if ((NIL != list_utilities.tree_find(alias, select, symbol_function(EQUAL), UNPROVIDED)) || (NIL != list_utilities.tree_find(alias, where, symbol_function(EQUAL), UNPROVIDED))) {
                    from_exp = cons(cons($TABLE, each_from), from_exp);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            each_from = cdolist_list_var.first();
        } 
        if (NIL != where_exp) {
            return list($SELECT, select_exp, list($FROM, from_exp), list($WHERE, where_exp));
        }
        return list($SELECT, select_exp, list($FROM, from_exp));
    }

    public static final SubLObject make_sparql_csql_query_alt(SubLObject select, SubLObject from, SubLObject where, SubLObject equivalent_field_map, SubLObject comparison_literal_reorderings) {
        if (equivalent_field_map == UNPROVIDED) {
            equivalent_field_map = NIL;
        }
        if (comparison_literal_reorderings == UNPROVIDED) {
            comparison_literal_reorderings = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != equivalent_field_map) {
                SubLTrampolineFile.checkType(equivalent_field_map, DICTIONARY_P);
            }
            {
                SubLObject where_exp = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.contract_where_clause(where);
                SubLObject select_fields = select;
                SubLObject all_fields = copy_list(select_fields);
                SubLObject perform_final_variable_substitutionP = makeBoolean(NIL == equivalent_field_map);
                SubLObject existential_scope_fields = NIL;
                SubLObject all_csql_equals = NIL;
                SubLObject triples = NIL;
                SubLObject literals = NIL;
                SubLObject unknown_sentence_literals = NIL;
                if (NIL == equivalent_field_map) {
                    equivalent_field_map = dictionary.new_dictionary(symbol_function(EQUAL), length(select_fields));
                }
                {
                    SubLObject cdolist_list_var = from;
                    SubLObject table = NIL;
                    for (table = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table = cdolist_list_var.first()) {
                        {
                            SubLObject datum = table;
                            SubLObject current = datum;
                            SubLObject table_short_name = NIL;
                            SubLObject table_name = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt36);
                            table_short_name = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt36);
                            table_name = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                triples = cons(list(list($FIELD, $$$subject, table_name), list($FIELD, $$$predicate, table_name), list($FIELD, $$$object, table_name)), triples);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt36);
                            }
                        }
                    }
                }
                {
                    SubLObject comparison_literals = NIL;
                    SubLObject cdolist_list_var = where_exp;
                    SubLObject where_expression = NIL;
                    for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                        {
                            SubLObject datum = where_expression;
                            SubLObject current = datum;
                            SubLObject field_keyword = NIL;
                            SubLObject expression1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            field_keyword = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            expression1 = current.first();
                            current = current.rest();
                            {
                                SubLObject expression2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt40);
                                current = current.rest();
                                if (NIL == current) {
                                    if (!(($$CSQLEquals == field_keyword) || ($$CSQLNot == field_keyword))) {
                                        comparison_literals = cons(where_expression, comparison_literals);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt40);
                                }
                            }
                        }
                    }
                    literals = append(literals, comparison_literals);
                }
                {
                    SubLObject cdolist_list_var = where_exp;
                    SubLObject where_expression = NIL;
                    for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                        {
                            SubLObject datum = where_expression;
                            SubLObject current = datum;
                            SubLObject field_keyword = NIL;
                            SubLObject expression1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            field_keyword = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            expression1 = current.first();
                            current = current.rest();
                            {
                                SubLObject expression2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt40);
                                current = current.rest();
                                if (NIL == current) {
                                    if ($$CSQLEquals == field_keyword) {
                                        if ((NIL != sksi_csql_sparql_interpretation.csql_field_p(expression1)) && (NIL != sksi_csql_sparql_interpretation.csql_field_p(expression2))) {
                                            all_csql_equals = cons(where_expression, all_csql_equals);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt40);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = where_exp;
                    SubLObject where_expression = NIL;
                    for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                        {
                            SubLObject datum = where_expression;
                            SubLObject current = datum;
                            SubLObject field_keyword = NIL;
                            SubLObject expression1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            field_keyword = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            expression1 = current.first();
                            current = current.rest();
                            {
                                SubLObject expression2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt40);
                                current = current.rest();
                                if (NIL == current) {
                                    if ($$CSQLNot == field_keyword) {
                                        {
                                            SubLObject datum_1 = expression1;
                                            SubLObject current_2 = datum_1;
                                            SubLObject field_keyword_2 = NIL;
                                            SubLObject expression1_2 = NIL;
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt42);
                                            field_keyword_2 = current_2.first();
                                            current_2 = current_2.rest();
                                            destructuring_bind_must_consp(current_2, datum_1, $list_alt42);
                                            expression1_2 = current_2.first();
                                            current_2 = current_2.rest();
                                            {
                                                SubLObject expression2_2 = (current_2.isCons()) ? ((SubLObject) (current_2.first())) : NIL;
                                                destructuring_bind_must_listp(current_2, datum_1, $list_alt42);
                                                current_2 = current_2.rest();
                                                if (NIL == current_2) {
                                                    if ($$CSQLExists == field_keyword_2) {
                                                        {
                                                            SubLObject datum_3 = expression1_2;
                                                            SubLObject current_4 = datum_3;
                                                            SubLObject select_keyword = NIL;
                                                            SubLObject unknown_sentence_select = NIL;
                                                            SubLObject unknown_sentence_from = NIL;
                                                            SubLObject unknown_sentence_where = NIL;
                                                            destructuring_bind_must_consp(current_4, datum_3, $list_alt44);
                                                            select_keyword = current_4.first();
                                                            current_4 = current_4.rest();
                                                            destructuring_bind_must_consp(current_4, datum_3, $list_alt44);
                                                            unknown_sentence_select = current_4.first();
                                                            current_4 = current_4.rest();
                                                            destructuring_bind_must_consp(current_4, datum_3, $list_alt44);
                                                            unknown_sentence_from = current_4.first();
                                                            current_4 = current_4.rest();
                                                            destructuring_bind_must_consp(current_4, datum_3, $list_alt44);
                                                            unknown_sentence_where = current_4.first();
                                                            current_4 = current_4.rest();
                                                            if (NIL == current_4) {
                                                                unknown_sentence_from = unknown_sentence_from.rest().first();
                                                                unknown_sentence_where = unknown_sentence_where.rest().first();
                                                                {
                                                                    SubLObject unknown_sentence_equivalent_field_map = dictionary.new_dictionary(symbol_function(EQUAL), length(select_fields));
                                                                    SubLObject unknown_sentence_from_2 = NIL;
                                                                    {
                                                                        SubLObject cdolist_list_var_5 = unknown_sentence_from;
                                                                        SubLObject unknown_sentence_from_table = NIL;
                                                                        for (unknown_sentence_from_table = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , unknown_sentence_from_table = cdolist_list_var_5.first()) {
                                                                            unknown_sentence_from_2 = cons(unknown_sentence_from_table.rest(), unknown_sentence_from_2);
                                                                        }
                                                                    }
                                                                    unknown_sentence_from_2 = nreverse(unknown_sentence_from_2);
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject unknown_sentence_csql = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_sparql_csql_query(unknown_sentence_select, unknown_sentence_from_2, unknown_sentence_where, unknown_sentence_equivalent_field_map, UNPROVIDED);
                                                                        SubLObject unknown_sentence_equivalent_field_map_6 = thread.secondMultipleValue();
                                                                        SubLObject unknown_sentence_field_index_map = thread.thirdMultipleValue();
                                                                        SubLObject unknown_sentence_existential_scope_fields = thread.fourthMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(unknown_sentence_equivalent_field_map_6));
                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    SubLObject canon_field = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    dictionary.dictionary_enter(equivalent_field_map, field, canon_field);
                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                }
                                                                            } 
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                        {
                                                                            SubLObject datum_7 = unknown_sentence_csql;
                                                                            SubLObject current_8 = datum_7;
                                                                            SubLObject select_keyword_9 = NIL;
                                                                            SubLObject unknown_sentence_fields = NIL;
                                                                            SubLObject unknown_sentence_tables = NIL;
                                                                            SubLObject unknown_sentence_where_10 = NIL;
                                                                            destructuring_bind_must_consp(current_8, datum_7, $list_alt45);
                                                                            select_keyword_9 = current_8.first();
                                                                            current_8 = current_8.rest();
                                                                            destructuring_bind_must_consp(current_8, datum_7, $list_alt45);
                                                                            unknown_sentence_fields = current_8.first();
                                                                            current_8 = current_8.rest();
                                                                            destructuring_bind_must_consp(current_8, datum_7, $list_alt45);
                                                                            unknown_sentence_tables = current_8.first();
                                                                            current_8 = current_8.rest();
                                                                            destructuring_bind_must_consp(current_8, datum_7, $list_alt45);
                                                                            unknown_sentence_where_10 = current_8.first();
                                                                            current_8 = current_8.rest();
                                                                            if (NIL == current_8) {
                                                                                {
                                                                                    SubLObject unknown_sentence_variables = unknown_sentence_fields.rest();
                                                                                    SubLObject unknown_sentence_where_exp = getf(unknown_sentence_where_10, $WHERE, UNPROVIDED);
                                                                                    unknown_sentence_literals = cons(list($UNKNOWN_SENTENCE, bq_cons($EXISTENTIAL_VARIABLES, append(unknown_sentence_existential_scope_fields, NIL)), list($WHERE, unknown_sentence_where_exp)), unknown_sentence_literals);
                                                                                    {
                                                                                        SubLObject cdolist_list_var_11 = unknown_sentence_variables;
                                                                                        SubLObject unknown_sentence_variable = NIL;
                                                                                        for (unknown_sentence_variable = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , unknown_sentence_variable = cdolist_list_var_11.first()) {
                                                                                            {
                                                                                                SubLObject item_var = unknown_sentence_variable;
                                                                                                if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                    all_fields = cons(item_var, all_fields);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject cdolist_list_var_12 = unknown_sentence_existential_scope_fields;
                                                                                        SubLObject unknown_sentence_existential_scope_field = NIL;
                                                                                        for (unknown_sentence_existential_scope_field = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , unknown_sentence_existential_scope_field = cdolist_list_var_12.first()) {
                                                                                            {
                                                                                                SubLObject item_var = unknown_sentence_existential_scope_field;
                                                                                                if (NIL == member(item_var, existential_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                    existential_scope_fields = cons(item_var, existential_scope_fields);
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject item_var = unknown_sentence_existential_scope_field;
                                                                                                if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                                    all_fields = cons(item_var, all_fields);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum_7, $list_alt45);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum_3, $list_alt44);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_1, $list_alt42);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt40);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = where_exp;
                    SubLObject where_expression = NIL;
                    for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                        {
                            SubLObject datum = where_expression;
                            SubLObject current = datum;
                            SubLObject field_keyword = NIL;
                            SubLObject expression1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            field_keyword = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            expression1 = current.first();
                            current = current.rest();
                            {
                                SubLObject expression2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt40);
                                current = current.rest();
                                if (NIL == current) {
                                    if ($$CSQLEquals == field_keyword) {
                                        if (!((NIL != sksi_csql_sparql_interpretation.csql_field_p(expression1)) && (NIL != sksi_csql_sparql_interpretation.csql_field_p(expression2)))) {
                                            triples = list_utilities.tree_substitute(triples, expression1, expression2);
                                            select_fields = list_utilities.tree_substitute(select_fields, expression1, expression2);
                                            all_fields = list_utilities.tree_substitute(all_fields, expression1, expression2);
                                            literals = list_utilities.tree_substitute(literals, expression1, expression2);
                                            unknown_sentence_literals = list_utilities.tree_substitute(unknown_sentence_literals, expression1, expression2);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt40);
                                }
                            }
                        }
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject equivalent_field_map_13 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.determine_sparql_equivalent_fields_classes(all_fields, all_csql_equals, equivalent_field_map, existential_scope_fields);
                    SubLObject existential_scope_fields_14 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    equivalent_field_map = equivalent_field_map_13;
                    existential_scope_fields = existential_scope_fields_14;
                }
                triples = list_utilities.tree_substitute_using_dictionary(triples, equivalent_field_map);
                select_fields = list_utilities.tree_substitute_using_dictionary(select_fields, equivalent_field_map);
                all_fields = list_utilities.tree_substitute_using_dictionary(all_fields, equivalent_field_map);
                literals = list_utilities.tree_substitute_using_dictionary(literals, equivalent_field_map);
                unknown_sentence_literals = list_utilities.tree_substitute_using_dictionary(unknown_sentence_literals, equivalent_field_map);
                select_fields = Sort.sort(remove_duplicates(select_fields, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym48$CSQL_FIELD__), UNPROVIDED);
                all_fields = list_utilities.remove_duplicates_from_end(all_fields, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                all_fields = append(select_fields, Sort.sort(set_difference(all_fields, select_fields, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED));
                {
                    SubLObject v_variables = select_fields;
                    SubLObject cdolist_list_var = triples;
                    SubLObject triple = NIL;
                    for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                        literals = cons(list($LITERAL, list(second(triple), triple.first(), third(triple))), literals);
                    }
                    {
                        SubLObject field_index_map = dictionary.new_dictionary(symbol_function(EQUAL), length(all_fields));
                        if (NIL != perform_final_variable_substitutionP) {
                            {
                                SubLObject list_var = NIL;
                                SubLObject field = NIL;
                                SubLObject field_index = NIL;
                                for (list_var = all_fields, field = list_var.first(), field_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , field = list_var.first() , field_index = add(ONE_INTEGER, field_index)) {
                                    {
                                        SubLObject variable_name = cconcatenate($str_alt50$_VAR, format_nil.format_nil_a(field_index));
                                        SubLObject variable = intern(variable_name, UNPROVIDED);
                                        dictionary.dictionary_enter(field_index_map, field, field_index);
                                        v_variables = substitute(variable, field, v_variables, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        literals = list_utilities.tree_substitute(literals, field, variable);
                                        unknown_sentence_literals = list_utilities.tree_substitute(unknown_sentence_literals, field, variable);
                                    }
                                }
                            }
                        }
                        literals = list_utilities.remove_duplicates_from_end(literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != comparison_literal_reorderings) {
                            {
                                SubLObject literal_count_verify = comparison_literal_reorderings.first();
                                SubLObject comparison_literal_index_list = comparison_literal_reorderings.rest();
                                if ((length(literals) == literal_count_verify) && (NIL != list_utilities.every_in_list(CSQL_COMPARISON_PREDICATE_P, last(literals, length(comparison_literal_index_list)), LITERAL_PREDICATE))) {
                                    {
                                        SubLObject new_literals = make_list(length(literals), UNPROVIDED);
                                        SubLObject new_literal_index = ZERO_INTEGER;
                                        SubLObject doneP = NIL;
                                        SubLObject list_var = NIL;
                                        SubLObject literal = NIL;
                                        SubLObject literal_index = NIL;
                                        for (list_var = literals, literal = list_var.first(), literal_index = ZERO_INTEGER; !((NIL != doneP) || (NIL == list_var)); list_var = list_var.rest() , literal = list_var.first() , literal_index = add(ONE_INTEGER, literal_index)) {
                                            while (NIL != subl_promotions.memberP(new_literal_index, comparison_literal_index_list, UNPROVIDED, UNPROVIDED)) {
                                                new_literal_index = add(new_literal_index, ONE_INTEGER);
                                            } 
                                            if (new_literal_index.numGE(literal_count_verify)) {
                                                doneP = T;
                                            }
                                            if (NIL == doneP) {
                                                set_nth(new_literal_index, new_literals, literal);
                                            }
                                            new_literal_index = add(new_literal_index, ONE_INTEGER);
                                        }
                                        {
                                            SubLObject comparison_literal = NIL;
                                            SubLObject comparison_literal_15 = NIL;
                                            SubLObject comparison_literal_index = NIL;
                                            SubLObject comparison_literal_index_16 = NIL;
                                            for (comparison_literal = list_utilities.last_n(length(comparison_literal_index_list), literals), comparison_literal_15 = comparison_literal.first(), comparison_literal_index = comparison_literal_index_list, comparison_literal_index_16 = comparison_literal_index.first(); !((NIL == comparison_literal_index) && (NIL == comparison_literal)); comparison_literal = comparison_literal.rest() , comparison_literal_15 = comparison_literal.first() , comparison_literal_index = comparison_literal_index.rest() , comparison_literal_index_16 = comparison_literal_index.first()) {
                                                set_nth(comparison_literal_index_16, new_literals, comparison_literal_15);
                                            }
                                        }
                                        literals = new_literals;
                                    }
                                } else {
                                    Errors.warn($str_alt53$Could_not_correctly_order_compari);
                                }
                            }
                        }
                        literals = append(literals, unknown_sentence_literals);
                        {
                            SubLObject csql = list($SELECT, bq_cons($VARIABLES, append(v_variables, NIL)), NIL, list($WHERE, literals));
                            return values(csql, equivalent_field_map, field_index_map, existential_scope_fields);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject make_sparql_csql_query(final SubLObject select, final SubLObject from, final SubLObject where, SubLObject equivalent_field_map, SubLObject comparison_literal_reorderings) {
        if (equivalent_field_map == UNPROVIDED) {
            equivalent_field_map = NIL;
        }
        if (comparison_literal_reorderings == UNPROVIDED) {
            comparison_literal_reorderings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != equivalent_field_map) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == dictionary.dictionary_p(equivalent_field_map))) {
            throw new AssertionError(equivalent_field_map);
        }
        final SubLObject where_exp = contract_where_clause(where);
        SubLObject select_fields = select;
        SubLObject all_fields = copy_list(select_fields);
        final SubLObject perform_final_variable_substitutionP = makeBoolean(NIL == equivalent_field_map);
        SubLObject existential_scope_fields = NIL;
        SubLObject all_csql_equals = NIL;
        SubLObject triples = NIL;
        SubLObject literals = NIL;
        SubLObject unknown_sentence_literals = NIL;
        if (NIL == equivalent_field_map) {
            equivalent_field_map = dictionary.new_dictionary(symbol_function(EQUAL), length(select_fields));
        }
        SubLObject cdolist_list_var = from;
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = table;
            SubLObject table_short_name = NIL;
            SubLObject table_name = NIL;
            destructuring_bind_must_consp(current, datum, $list37);
            table_short_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list37);
            table_name = current.first();
            current = current.rest();
            final SubLObject namespace = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list37);
            current = current.rest();
            if (NIL == current) {
                triples = cons(list(list($FIELD, $$$subject, table_name), list($FIELD, $$$predicate, table_name), list($FIELD, $$$object, table_name)), triples);
            } else {
                cdestructuring_bind_error(datum, $list37);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        SubLObject comparison_literals = NIL;
        SubLObject cdolist_list_var2 = where_exp;
        SubLObject where_expression = NIL;
        where_expression = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = where_expression;
            SubLObject field_keyword = NIL;
            SubLObject expression1 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list41);
            field_keyword = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list41);
            expression1 = current2.first();
            current2 = current2.rest();
            final SubLObject expression2 = (current2.isCons()) ? current2.first() : NIL;
            destructuring_bind_must_listp(current2, datum2, $list41);
            current2 = current2.rest();
            if (NIL == current2) {
                if ((!$$CSQLEquals.eql(field_keyword)) && (!$$CSQLNot.eql(field_keyword))) {
                    comparison_literals = cons(where_expression, comparison_literals);
                }
            } else {
                cdestructuring_bind_error(datum2, $list41);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            where_expression = cdolist_list_var2.first();
        } 
        literals = append(literals, comparison_literals);
        cdolist_list_var = where_exp;
        SubLObject where_expression2 = NIL;
        where_expression2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression2;
            SubLObject field_keyword2 = NIL;
            SubLObject expression3 = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            field_keyword2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list41);
            expression3 = current.first();
            current = current.rest();
            final SubLObject expression4 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list41);
            current = current.rest();
            if (NIL == current) {
                if (($$CSQLEquals.eql(field_keyword2) && (NIL != csql_field_p(expression3))) && (NIL != csql_field_p(expression4))) {
                    all_csql_equals = cons(where_expression2, all_csql_equals);
                }
            } else {
                cdestructuring_bind_error(datum, $list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression2 = cdolist_list_var.first();
        } 
        cdolist_list_var = where_exp;
        where_expression2 = NIL;
        where_expression2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression2;
            SubLObject field_keyword2 = NIL;
            SubLObject expression3 = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            field_keyword2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list41);
            expression3 = current.first();
            current = current.rest();
            final SubLObject expression4 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list41);
            current = current.rest();
            if (NIL == current) {
                if ($$CSQLNot.eql(field_keyword2)) {
                    SubLObject current_$2;
                    final SubLObject datum_$1 = current_$2 = expression3;
                    SubLObject field_keyword_2 = NIL;
                    SubLObject expression1_2 = NIL;
                    destructuring_bind_must_consp(current_$2, datum_$1, $list43);
                    field_keyword_2 = current_$2.first();
                    current_$2 = current_$2.rest();
                    destructuring_bind_must_consp(current_$2, datum_$1, $list43);
                    expression1_2 = current_$2.first();
                    current_$2 = current_$2.rest();
                    final SubLObject expression2_2 = (current_$2.isCons()) ? current_$2.first() : NIL;
                    destructuring_bind_must_listp(current_$2, datum_$1, $list43);
                    current_$2 = current_$2.rest();
                    if (NIL == current_$2) {
                        if ($$CSQLExists.eql(field_keyword_2)) {
                            SubLObject current_$3;
                            final SubLObject datum_$2 = current_$3 = expression1_2;
                            SubLObject select_keyword = NIL;
                            SubLObject unknown_sentence_select = NIL;
                            SubLObject unknown_sentence_from = NIL;
                            SubLObject unknown_sentence_where = NIL;
                            destructuring_bind_must_consp(current_$3, datum_$2, $list45);
                            select_keyword = current_$3.first();
                            current_$3 = current_$3.rest();
                            destructuring_bind_must_consp(current_$3, datum_$2, $list45);
                            unknown_sentence_select = current_$3.first();
                            current_$3 = current_$3.rest();
                            destructuring_bind_must_consp(current_$3, datum_$2, $list45);
                            unknown_sentence_from = current_$3.first();
                            current_$3 = current_$3.rest();
                            destructuring_bind_must_consp(current_$3, datum_$2, $list45);
                            unknown_sentence_where = current_$3.first();
                            current_$3 = current_$3.rest();
                            if (NIL == current_$3) {
                                unknown_sentence_from = unknown_sentence_from.rest().first();
                                unknown_sentence_where = unknown_sentence_where.rest().first();
                                final SubLObject unknown_sentence_equivalent_field_map = dictionary.new_dictionary(symbol_function(EQUAL), length(select_fields));
                                SubLObject unknown_sentence_from_2 = NIL;
                                SubLObject cdolist_list_var_$5 = unknown_sentence_from;
                                SubLObject unknown_sentence_from_table = NIL;
                                unknown_sentence_from_table = cdolist_list_var_$5.first();
                                while (NIL != cdolist_list_var_$5) {
                                    unknown_sentence_from_2 = cons(unknown_sentence_from_table.rest(), unknown_sentence_from_2);
                                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                    unknown_sentence_from_table = cdolist_list_var_$5.first();
                                } 
                                unknown_sentence_from_2 = nreverse(unknown_sentence_from_2);
                                thread.resetMultipleValues();
                                final SubLObject unknown_sentence_csql = make_sparql_csql_query(unknown_sentence_select, unknown_sentence_from_2, unknown_sentence_where, unknown_sentence_equivalent_field_map, UNPROVIDED);
                                final SubLObject unknown_sentence_equivalent_field_map_$6 = thread.secondMultipleValue();
                                final SubLObject unknown_sentence_field_index_map = thread.thirdMultipleValue();
                                final SubLObject unknown_sentence_existential_scope_fields = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(unknown_sentence_equivalent_field_map_$6)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject canon_field = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    dictionary.dictionary_enter(equivalent_field_map, field, canon_field);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                SubLObject current_$4;
                                final SubLObject datum_$3 = current_$4 = unknown_sentence_csql;
                                SubLObject select_keyword_$9 = NIL;
                                SubLObject unknown_sentence_fields = NIL;
                                SubLObject unknown_sentence_tables = NIL;
                                SubLObject unknown_sentence_where_$10 = NIL;
                                destructuring_bind_must_consp(current_$4, datum_$3, $list46);
                                select_keyword_$9 = current_$4.first();
                                current_$4 = current_$4.rest();
                                destructuring_bind_must_consp(current_$4, datum_$3, $list46);
                                unknown_sentence_fields = current_$4.first();
                                current_$4 = current_$4.rest();
                                destructuring_bind_must_consp(current_$4, datum_$3, $list46);
                                unknown_sentence_tables = current_$4.first();
                                current_$4 = current_$4.rest();
                                destructuring_bind_must_consp(current_$4, datum_$3, $list46);
                                unknown_sentence_where_$10 = current_$4.first();
                                current_$4 = current_$4.rest();
                                if (NIL == current_$4) {
                                    final SubLObject unknown_sentence_variables = unknown_sentence_fields.rest();
                                    final SubLObject unknown_sentence_where_exp = getf(unknown_sentence_where_$10, $WHERE, UNPROVIDED);
                                    unknown_sentence_literals = cons(list($UNKNOWN_SENTENCE, bq_cons($EXISTENTIAL_VARIABLES, append(unknown_sentence_existential_scope_fields, NIL)), list($WHERE, unknown_sentence_where_exp)), unknown_sentence_literals);
                                    SubLObject cdolist_list_var_$6 = unknown_sentence_variables;
                                    SubLObject unknown_sentence_variable = NIL;
                                    unknown_sentence_variable = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        final SubLObject item_var = unknown_sentence_variable;
                                        if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            all_fields = cons(item_var, all_fields);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        unknown_sentence_variable = cdolist_list_var_$6.first();
                                    } 
                                    SubLObject cdolist_list_var_$7 = unknown_sentence_existential_scope_fields;
                                    SubLObject unknown_sentence_existential_scope_field = NIL;
                                    unknown_sentence_existential_scope_field = cdolist_list_var_$7.first();
                                    while (NIL != cdolist_list_var_$7) {
                                        SubLObject item_var = unknown_sentence_existential_scope_field;
                                        if (NIL == member(item_var, existential_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            existential_scope_fields = cons(item_var, existential_scope_fields);
                                        }
                                        item_var = unknown_sentence_existential_scope_field;
                                        if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            all_fields = cons(item_var, all_fields);
                                        }
                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                        unknown_sentence_existential_scope_field = cdolist_list_var_$7.first();
                                    } 
                                } else {
                                    cdestructuring_bind_error(datum_$3, $list46);
                                }
                            } else {
                                cdestructuring_bind_error(datum_$2, $list45);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum_$1, $list43);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression2 = cdolist_list_var.first();
        } 
        cdolist_list_var = where_exp;
        where_expression2 = NIL;
        where_expression2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression2;
            SubLObject field_keyword2 = NIL;
            SubLObject expression3 = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            field_keyword2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list41);
            expression3 = current.first();
            current = current.rest();
            final SubLObject expression4 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list41);
            current = current.rest();
            if (NIL == current) {
                if ($$CSQLEquals.eql(field_keyword2) && ((NIL == csql_field_p(expression3)) || (NIL == csql_field_p(expression4)))) {
                    triples = list_utilities.tree_substitute(triples, expression3, expression4);
                    select_fields = list_utilities.tree_substitute(select_fields, expression3, expression4);
                    all_fields = list_utilities.tree_substitute(all_fields, expression3, expression4);
                    literals = list_utilities.tree_substitute(literals, expression3, expression4);
                    unknown_sentence_literals = list_utilities.tree_substitute(unknown_sentence_literals, expression3, expression4);
                }
            } else {
                cdestructuring_bind_error(datum, $list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression2 = cdolist_list_var.first();
        } 
        thread.resetMultipleValues();
        final SubLObject equivalent_field_map_$13 = determine_sparql_equivalent_fields_classes(all_fields, all_csql_equals, equivalent_field_map, existential_scope_fields);
        final SubLObject existential_scope_fields_$14 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        equivalent_field_map = equivalent_field_map_$13;
        existential_scope_fields = existential_scope_fields_$14;
        triples = list_utilities.tree_substitute_using_dictionary(triples, equivalent_field_map);
        select_fields = list_utilities.tree_substitute_using_dictionary(select_fields, equivalent_field_map);
        all_fields = list_utilities.tree_substitute_using_dictionary(all_fields, equivalent_field_map);
        literals = list_utilities.tree_substitute_using_dictionary(literals, equivalent_field_map);
        unknown_sentence_literals = list_utilities.tree_substitute_using_dictionary(unknown_sentence_literals, equivalent_field_map);
        select_fields = Sort.sort(remove_duplicates(select_fields, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym49$CSQL_FIELD__), UNPROVIDED);
        all_fields = list_utilities.remove_duplicates_from_end(all_fields, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        all_fields = append(select_fields, Sort.sort(set_difference(all_fields, select_fields, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED));
        SubLObject v_variables = select_fields;
        cdolist_list_var2 = triples;
        SubLObject triple = NIL;
        triple = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            literals = cons(list($LITERAL, list(second(triple), triple.first(), third(triple))), literals);
            cdolist_list_var2 = cdolist_list_var2.rest();
            triple = cdolist_list_var2.first();
        } 
        final SubLObject field_index_map = dictionary.new_dictionary(symbol_function(EQUAL), length(all_fields));
        if (NIL != perform_final_variable_substitutionP) {
            SubLObject list_var = NIL;
            SubLObject field2 = NIL;
            SubLObject field_index = NIL;
            list_var = all_fields;
            field2 = list_var.first();
            for (field_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , field2 = list_var.first() , field_index = add(ONE_INTEGER, field_index)) {
                final SubLObject variable_name = cconcatenate($str51$_VAR, format_nil.format_nil_a(field_index));
                final SubLObject variable = intern(variable_name, UNPROVIDED);
                dictionary.dictionary_enter(field_index_map, field2, field_index);
                v_variables = substitute(variable, field2, v_variables, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                literals = list_utilities.tree_substitute(literals, field2, variable);
                unknown_sentence_literals = list_utilities.tree_substitute(unknown_sentence_literals, field2, variable);
            }
        }
        literals = list_utilities.remove_duplicates_from_end(literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != comparison_literal_reorderings) {
            final SubLObject literal_count_verify = comparison_literal_reorderings.first();
            final SubLObject comparison_literal_index_list = comparison_literal_reorderings.rest();
            if (length(literals).eql(literal_count_verify) && (NIL != list_utilities.every_in_list(CSQL_COMPARISON_PREDICATE_P, last(literals, length(comparison_literal_index_list)), LITERAL_PREDICATE))) {
                final SubLObject new_literals = make_list(length(literals), UNPROVIDED);
                SubLObject new_literal_index = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject list_var2 = NIL;
                SubLObject literal = NIL;
                SubLObject literal_index = NIL;
                list_var2 = literals;
                literal = list_var2.first();
                for (literal_index = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var2); list_var2 = list_var2.rest() , literal = list_var2.first() , literal_index = add(ONE_INTEGER, literal_index)) {
                    while (NIL != subl_promotions.memberP(new_literal_index, comparison_literal_index_list, UNPROVIDED, UNPROVIDED)) {
                        new_literal_index = add(new_literal_index, ONE_INTEGER);
                    } 
                    if (new_literal_index.numGE(literal_count_verify)) {
                        doneP = T;
                    }
                    if (NIL == doneP) {
                        set_nth(new_literal_index, new_literals, literal);
                    }
                    new_literal_index = add(new_literal_index, ONE_INTEGER);
                }
                SubLObject comparison_literal = NIL;
                SubLObject comparison_literal_$15 = NIL;
                SubLObject comparison_literal_index = NIL;
                SubLObject comparison_literal_index_$16 = NIL;
                comparison_literal = list_utilities.last_n(length(comparison_literal_index_list), literals);
                comparison_literal_$15 = comparison_literal.first();
                comparison_literal_index = comparison_literal_index_list;
                comparison_literal_index_$16 = comparison_literal_index.first();
                while ((NIL != comparison_literal_index) || (NIL != comparison_literal)) {
                    set_nth(comparison_literal_index_$16, new_literals, comparison_literal_$15);
                    comparison_literal = comparison_literal.rest();
                    comparison_literal_$15 = comparison_literal.first();
                    comparison_literal_index = comparison_literal_index.rest();
                    comparison_literal_index_$16 = comparison_literal_index.first();
                } 
                literals = new_literals;
            } else {
                Errors.warn($str54$Could_not_correctly_order_compari);
            }
        }
        literals = append(literals, unknown_sentence_literals);
        final SubLObject csql = list($SELECT, bq_cons($VARIABLES, append(v_variables, NIL)), NIL, list($WHERE, literals));
        return values(csql, equivalent_field_map, field_index_map, existential_scope_fields);
    }

    public static final SubLObject determine_sparql_equivalent_fields_classes_alt(SubLObject fields, SubLObject where_expressions, SubLObject equivalent_field_map, SubLObject existential_scope_fields) {
        if (equivalent_field_map == UNPROVIDED) {
            equivalent_field_map = NIL;
        }
        if (existential_scope_fields == UNPROVIDED) {
            existential_scope_fields = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != equivalent_field_map) {
                SubLTrampolineFile.checkType(equivalent_field_map, DICTIONARY_P);
            }
            {
                SubLObject equivalence_map = dictionary.new_dictionary(symbol_function(EQUAL), length(fields));
                SubLObject exemplar_set = set.new_set(symbol_function(EQUAL), length(fields));
                SubLObject all_fields = NIL;
                SubLObject universal_scope_fields = NIL;
                if (NIL != dictionary.dictionary_p(equivalent_field_map)) {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equivalent_field_map));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject canonical_field = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject item_var = field;
                                    if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        all_fields = cons(item_var, all_fields);
                                    }
                                }
                                {
                                    SubLObject item_var = canonical_field;
                                    if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        all_fields = cons(item_var, all_fields);
                                    }
                                }
                                set.set_add(canonical_field, exemplar_set);
                                {
                                    SubLObject canonical_set = dictionary.dictionary_lookup(equivalence_map, canonical_field, UNPROVIDED);
                                    if (NIL == set.set_p(canonical_set)) {
                                        canonical_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                                    }
                                    set.set_add(field, canonical_set);
                                    dictionary.dictionary_enter(equivalence_map, field, canonical_set);
                                    dictionary.dictionary_enter(equivalence_map, canonical_field, canonical_set);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                {
                    SubLObject cdolist_list_var = fields;
                    SubLObject field = NIL;
                    for (field = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = field;
                            if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                all_fields = cons(item_var, all_fields);
                            }
                        }
                        set.set_add(field, exemplar_set);
                        if (NIL == set.set_p(dictionary.dictionary_lookup(equivalence_map, field, UNPROVIDED))) {
                            {
                                SubLObject starting_set = set.new_set(symbol_function(EQUAL), TWO_INTEGER);
                                set.set_add(field, starting_set);
                                dictionary.dictionary_enter(equivalence_map, field, starting_set);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = where_expressions;
                    SubLObject where_expression = NIL;
                    for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                        {
                            SubLObject datum = where_expression;
                            SubLObject current = datum;
                            SubLObject field_keyword = NIL;
                            SubLObject expression1 = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            field_keyword = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            expression1 = current.first();
                            current = current.rest();
                            {
                                SubLObject expression2 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt40);
                                current = current.rest();
                                if (NIL == current) {
                                    if ($$CSQLEquals == field_keyword) {
                                        if ((NIL != sksi_csql_sparql_interpretation.csql_field_p(expression1)) && (NIL != sksi_csql_sparql_interpretation.csql_field_p(expression2))) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject favored_field = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.sort_2_csql_fields(expression1, expression2);
                                                SubLObject disfavored_field = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject favored_set = dictionary.dictionary_lookup_without_values(equivalence_map, favored_field, UNPROVIDED);
                                                    SubLObject disfavored_set = dictionary.dictionary_lookup_without_values(equivalence_map, disfavored_field, UNPROVIDED);
                                                    if (NIL == set.set_p(favored_set)) {
                                                        {
                                                            SubLObject item_var = favored_field;
                                                            if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                all_fields = cons(item_var, all_fields);
                                                            }
                                                        }
                                                        set.set_add(favored_field, exemplar_set);
                                                        favored_set = set.new_set(symbol_function(EQUAL), TWO_INTEGER);
                                                        set.set_add(favored_field, favored_set);
                                                        dictionary.dictionary_enter(equivalence_map, favored_field, favored_set);
                                                        {
                                                            SubLObject item_var = favored_field;
                                                            if (NIL == member(item_var, universal_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                universal_scope_fields = cons(item_var, universal_scope_fields);
                                                            }
                                                        }
                                                    }
                                                    if (NIL == set.set_p(disfavored_set)) {
                                                        {
                                                            SubLObject item_var = disfavored_field;
                                                            if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                all_fields = cons(item_var, all_fields);
                                                            }
                                                        }
                                                        disfavored_set = set.new_set(symbol_function(EQUAL), TWO_INTEGER);
                                                        set.set_add(disfavored_field, disfavored_set);
                                                        dictionary.dictionary_enter(equivalence_map, disfavored_field, disfavored_set);
                                                        {
                                                            SubLObject item_var = disfavored_field;
                                                            if (NIL == member(item_var, universal_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                universal_scope_fields = cons(item_var, universal_scope_fields);
                                                            }
                                                        }
                                                    }
                                                    if (favored_set != disfavored_set) {
                                                        {
                                                            SubLObject set_contents_var = set.do_set_internal(disfavored_set);
                                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                            SubLObject state = NIL;
                                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                {
                                                                    SubLObject disfavored_field_17 = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, disfavored_field_17)) {
                                                                        set.set_remove(disfavored_field_17, exemplar_set);
                                                                        set.set_add(disfavored_field_17, favored_set);
                                                                        dictionary.dictionary_enter(equivalence_map, disfavored_field_17, favored_set);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt40);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject canonical_field_map = dictionary.new_dictionary(symbol_function(EQUAL), length(all_fields));
                    {
                        SubLObject set_contents_var = set.do_set_internal(exemplar_set);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject canonical_field = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, canonical_field)) {
                                    {
                                        SubLObject equivalence_set = dictionary.dictionary_lookup(equivalence_map, canonical_field, UNPROVIDED);
                                        SubLObject set_contents_var_18 = set.do_set_internal(equivalence_set);
                                        SubLObject basis_object_19 = set_contents.do_set_contents_basis_object(set_contents_var_18);
                                        SubLObject state_20 = NIL;
                                        for (state_20 = set_contents.do_set_contents_initial_state(basis_object_19, set_contents_var_18); NIL == set_contents.do_set_contents_doneP(basis_object_19, state_20); state_20 = set_contents.do_set_contents_update_state(state_20)) {
                                            {
                                                SubLObject field = set_contents.do_set_contents_next(basis_object_19, state_20);
                                                if (NIL != set_contents.do_set_contents_element_validP(state_20, field)) {
                                                    dictionary.dictionary_enter(canonical_field_map, field, canonical_field);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject all_universal_scope_fields = NIL;
                        {
                            SubLObject cdolist_list_var = universal_scope_fields;
                            SubLObject universal_scope_field = NIL;
                            for (universal_scope_field = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , universal_scope_field = cdolist_list_var.first()) {
                                {
                                    SubLObject set_contents_var = set.do_set_internal(dictionary.dictionary_lookup(equivalence_map, universal_scope_field, UNPROVIDED));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject equivalent_field = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, equivalent_field)) {
                                                {
                                                    SubLObject item_var = equivalent_field;
                                                    if (NIL == member(item_var, all_universal_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        all_universal_scope_fields = cons(item_var, all_universal_scope_fields);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = list_utilities.fast_delete_duplicates(set_difference(all_fields, all_universal_scope_fields, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject existential_scope_field = NIL;
                            for (existential_scope_field = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , existential_scope_field = cdolist_list_var.first()) {
                                {
                                    SubLObject item_var = existential_scope_field;
                                    if (NIL == member(item_var, existential_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        existential_scope_fields = cons(item_var, existential_scope_fields);
                                    }
                                }
                            }
                        }
                    }
                    return values(canonical_field_map, existential_scope_fields);
                }
            }
        }
    }

    public static SubLObject determine_sparql_equivalent_fields_classes(final SubLObject fields, final SubLObject where_expressions, SubLObject equivalent_field_map, SubLObject existential_scope_fields) {
        if (equivalent_field_map == UNPROVIDED) {
            equivalent_field_map = NIL;
        }
        if (existential_scope_fields == UNPROVIDED) {
            existential_scope_fields = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != equivalent_field_map) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == dictionary.dictionary_p(equivalent_field_map))) {
            throw new AssertionError(equivalent_field_map);
        }
        final SubLObject equivalence_map = dictionary.new_dictionary(symbol_function(EQUAL), length(fields));
        final SubLObject exemplar_set = set.new_set(symbol_function(EQUAL), length(fields));
        SubLObject all_fields = NIL;
        SubLObject universal_scope_fields = NIL;
        if (NIL != dictionary.dictionary_p(equivalent_field_map)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equivalent_field_map)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject canonical_field = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject item_var = field;
                if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    all_fields = cons(item_var, all_fields);
                }
                item_var = canonical_field;
                if (NIL == member(item_var, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    all_fields = cons(item_var, all_fields);
                }
                set.set_add(canonical_field, exemplar_set);
                SubLObject canonical_set = dictionary.dictionary_lookup(equivalence_map, canonical_field, UNPROVIDED);
                if (NIL == set.set_p(canonical_set)) {
                    canonical_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                }
                set.set_add(field, canonical_set);
                dictionary.dictionary_enter(equivalence_map, field, canonical_set);
                dictionary.dictionary_enter(equivalence_map, canonical_field, canonical_set);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        SubLObject cdolist_list_var = fields;
        SubLObject field = NIL;
        field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var2 = field;
            if (NIL == member(item_var2, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                all_fields = cons(item_var2, all_fields);
            }
            set.set_add(field, exemplar_set);
            if (NIL == set.set_p(dictionary.dictionary_lookup(equivalence_map, field, UNPROVIDED))) {
                final SubLObject starting_set = set.new_set(symbol_function(EQUAL), TWO_INTEGER);
                set.set_add(field, starting_set);
                dictionary.dictionary_enter(equivalence_map, field, starting_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        } 
        cdolist_list_var = where_expressions;
        SubLObject where_expression = NIL;
        where_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression;
            SubLObject field_keyword = NIL;
            SubLObject expression1 = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            field_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list41);
            expression1 = current.first();
            current = current.rest();
            final SubLObject expression2 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list41);
            current = current.rest();
            if (NIL == current) {
                if (($$CSQLEquals.eql(field_keyword) && (NIL != csql_field_p(expression1))) && (NIL != csql_field_p(expression2))) {
                    thread.resetMultipleValues();
                    final SubLObject favored_field = sort_2_csql_fields(expression1, expression2);
                    final SubLObject disfavored_field = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject favored_set = dictionary.dictionary_lookup_without_values(equivalence_map, favored_field, UNPROVIDED);
                    SubLObject disfavored_set = dictionary.dictionary_lookup_without_values(equivalence_map, disfavored_field, UNPROVIDED);
                    if (NIL == set.set_p(favored_set)) {
                        SubLObject item_var3 = favored_field;
                        if (NIL == member(item_var3, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            all_fields = cons(item_var3, all_fields);
                        }
                        set.set_add(favored_field, exemplar_set);
                        favored_set = set.new_set(symbol_function(EQUAL), TWO_INTEGER);
                        set.set_add(favored_field, favored_set);
                        dictionary.dictionary_enter(equivalence_map, favored_field, favored_set);
                        item_var3 = favored_field;
                        if (NIL == member(item_var3, universal_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            universal_scope_fields = cons(item_var3, universal_scope_fields);
                        }
                    }
                    if (NIL == set.set_p(disfavored_set)) {
                        SubLObject item_var3 = disfavored_field;
                        if (NIL == member(item_var3, all_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            all_fields = cons(item_var3, all_fields);
                        }
                        disfavored_set = set.new_set(symbol_function(EQUAL), TWO_INTEGER);
                        set.set_add(disfavored_field, disfavored_set);
                        dictionary.dictionary_enter(equivalence_map, disfavored_field, disfavored_set);
                        item_var3 = disfavored_field;
                        if (NIL == member(item_var3, universal_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            universal_scope_fields = cons(item_var3, universal_scope_fields);
                        }
                    }
                    if (!favored_set.eql(disfavored_set)) {
                        final SubLObject set_contents_var = set.do_set_internal(disfavored_set);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject disfavored_field_$17;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            disfavored_field_$17 = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, disfavored_field_$17)) {
                                set.set_remove(disfavored_field_$17, exemplar_set);
                                set.set_add(disfavored_field_$17, favored_set);
                                dictionary.dictionary_enter(equivalence_map, disfavored_field_$17, favored_set);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        } 
        final SubLObject canonical_field_map = dictionary.new_dictionary(symbol_function(EQUAL), length(all_fields));
        final SubLObject set_contents_var2 = set.do_set_internal(exemplar_set);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject canonical_field2;
        SubLObject equivalence_set;
        SubLObject set_contents_var_$18;
        SubLObject basis_object_$19;
        SubLObject state_$20;
        SubLObject field2;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            canonical_field2 = set_contents.do_set_contents_next(basis_object2, state2);
            if (NIL != set_contents.do_set_contents_element_validP(state2, canonical_field2)) {
                equivalence_set = dictionary.dictionary_lookup(equivalence_map, canonical_field2, UNPROVIDED);
                set_contents_var_$18 = set.do_set_internal(equivalence_set);
                for (basis_object_$19 = set_contents.do_set_contents_basis_object(set_contents_var_$18), state_$20 = NIL, state_$20 = set_contents.do_set_contents_initial_state(basis_object_$19, set_contents_var_$18); NIL == set_contents.do_set_contents_doneP(basis_object_$19, state_$20); state_$20 = set_contents.do_set_contents_update_state(state_$20)) {
                    field2 = set_contents.do_set_contents_next(basis_object_$19, state_$20);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$20, field2)) {
                        dictionary.dictionary_enter(canonical_field_map, field2, canonical_field2);
                    }
                }
            }
        }
        SubLObject all_universal_scope_fields = NIL;
        SubLObject cdolist_list_var2 = universal_scope_fields;
        SubLObject universal_scope_field = NIL;
        universal_scope_field = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject set_var = dictionary.dictionary_lookup(equivalence_map, universal_scope_field, UNPROVIDED);
            final SubLObject set_contents_var3 = set.do_set_internal(set_var);
            SubLObject basis_object3;
            SubLObject state3;
            SubLObject equivalent_field;
            SubLObject item_var4;
            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                equivalent_field = set_contents.do_set_contents_next(basis_object3, state3);
                if (NIL != set_contents.do_set_contents_element_validP(state3, equivalent_field)) {
                    item_var4 = equivalent_field;
                    if (NIL == member(item_var4, all_universal_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        all_universal_scope_fields = cons(item_var4, all_universal_scope_fields);
                    }
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            universal_scope_field = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = list_utilities.fast_delete_duplicates(set_difference(all_fields, all_universal_scope_fields, symbol_function(EQUAL), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject existential_scope_field = NIL;
        existential_scope_field = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject item_var5 = existential_scope_field;
            if (NIL == member(item_var5, existential_scope_fields, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                existential_scope_fields = cons(item_var5, existential_scope_fields);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            existential_scope_field = cdolist_list_var2.first();
        } 
        return values(canonical_field_map, existential_scope_fields);
    }

    public static final SubLObject sort_2_csql_fields_alt(SubLObject field1, SubLObject field2) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_L(field2, field1)) {
            return values(field2, field1);
        } else {
            return values(field1, field2);
        }
    }

    public static SubLObject sort_2_csql_fields(final SubLObject field1, final SubLObject field2) {
        if (NIL != csql_field_L(field2, field1)) {
            return values(field2, field1);
        }
        return values(field1, field2);
    }

    public static final SubLObject csql_field_L_alt(SubLObject field1, SubLObject field2) {
        if (field1.equal(field2)) {
            return NIL;
        } else {
            if (NIL != kb_utilities.term_L(third(field1), third(field2), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                if (NIL != kb_utilities.term_L(third(field2), third(field1), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                } else {
                    if (NIL != kb_utilities.term_L(second(field1), second(field2), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    } else {
                        if (NIL != kb_utilities.term_L(second(field2), second(field1), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return NIL;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject csql_field_L(final SubLObject field1, final SubLObject field2) {
        if (field1.equal(field2)) {
            return NIL;
        }
        if (NIL != kb_utilities.term_L(third(field1), third(field2), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != kb_utilities.term_L(third(field2), third(field1), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != kb_utilities.term_L(second(field1), second(field2), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != kb_utilities.term_L(second(field2), second(field1), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject canonicalize_csql_alt(SubLObject csql, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        {
            SubLObject datum = csql;
            SubLObject current = datum;
            SubLObject keyword = NIL;
            SubLObject fields = NIL;
            SubLObject from = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt55);
            fields = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt55);
            from = current.first();
            current = current.rest();
            {
                SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt55);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject new_fields = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_fields_clause(fields, copyP, stableP);
                        SubLObject new_from = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_from_clause(from, copyP, stableP);
                        SubLObject new_where = (NIL != where) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_where_clause(where, copyP, stableP))) : NIL;
                        if (NIL != where) {
                            return list(keyword, new_fields, new_from, new_where);
                        } else {
                            return list(keyword, new_fields, new_from);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt55);
                }
            }
        }
        return NIL;
    }

    public static SubLObject canonicalize_csql(final SubLObject csql, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        SubLObject keyword = NIL;
        SubLObject fields = NIL;
        SubLObject from = NIL;
        destructuring_bind_must_consp(csql, csql, $list56);
        keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list56);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list56);
        from = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list56);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(csql, $list56);
            return NIL;
        }
        final SubLObject new_fields = canonicalize_csql_fields_clause(fields, copyP, stableP);
        final SubLObject new_from = canonicalize_csql_from_clause(from, copyP, stableP);
        final SubLObject new_where = (NIL != where) ? canonicalize_csql_where_clause(where, copyP, stableP) : NIL;
        if (NIL != where) {
            return list(keyword, new_fields, new_from, new_where);
        }
        return list(keyword, new_fields, new_from);
    }

    public static final SubLObject canonicalize_csql_fields_clause_alt(SubLObject fields, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        if (fields.equal($list_alt14)) {
            return fields;
        } else {
            return kb_utilities.sort_terms(fields, copyP, stableP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject canonicalize_csql_fields_clause(final SubLObject fields, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        if (fields.equal($list15)) {
            return fields;
        }
        return kb_utilities.sort_terms(fields, copyP, stableP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject canonicalize_csql_from_clause_alt(SubLObject from, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        {
            SubLObject datum = from;
            SubLObject current = datum;
            SubLObject keyword = NIL;
            SubLObject tables = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt56);
            tables = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_tables = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_tables_clause(tables, copyP, stableP);
                    return list(keyword, new_tables);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt56);
            }
        }
        return NIL;
    }

    public static SubLObject canonicalize_csql_from_clause(final SubLObject from, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        SubLObject keyword = NIL;
        SubLObject tables = NIL;
        destructuring_bind_must_consp(from, from, $list57);
        keyword = from.first();
        SubLObject current = from.rest();
        destructuring_bind_must_consp(current, from, $list57);
        tables = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_tables = canonicalize_csql_tables_clause(tables, copyP, stableP);
            return list(keyword, new_tables);
        }
        cdestructuring_bind_error(from, $list57);
        return NIL;
    }

    public static final SubLObject canonicalize_csql_tables_clause_alt(SubLObject tables, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        return kb_utilities.sort_terms(tables, copyP, stableP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject canonicalize_csql_tables_clause(final SubLObject tables, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = T;
        }
        if (stableP == UNPROVIDED) {
            stableP = T;
        }
        return kb_utilities.sort_terms(tables, copyP, stableP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject canonicalize_csql_where_clause_alt(SubLObject where, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        {
            SubLObject datum = where;
            SubLObject current = datum;
            SubLObject keyword = NIL;
            SubLObject where_clause = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt57);
            where_clause = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_where_clause = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_stripped_where_clause(where_clause, UNPROVIDED, UNPROVIDED);
                    return list(keyword, new_where_clause);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt57);
            }
        }
        return NIL;
    }

    public static SubLObject canonicalize_csql_where_clause(final SubLObject where, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        SubLObject keyword = NIL;
        SubLObject where_clause = NIL;
        destructuring_bind_must_consp(where, where, $list58);
        keyword = where.first();
        SubLObject current = where.rest();
        destructuring_bind_must_consp(current, where, $list58);
        where_clause = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_where_clause = canonicalize_csql_stripped_where_clause(where_clause, UNPROVIDED, UNPROVIDED);
            return list(keyword, new_where_clause);
        }
        cdestructuring_bind_error(where, $list58);
        return NIL;
    }

    public static final SubLObject canonicalize_csql_stripped_where_clause_alt(SubLObject where_clause, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        {
            SubLObject new_where_clause = NIL;
            SubLObject cdolist_list_var = where_clause;
            SubLObject where_exp = NIL;
            for (where_exp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_exp = cdolist_list_var.first()) {
                new_where_clause = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_where_expression(where_exp, UNPROVIDED, UNPROVIDED), new_where_clause);
            }
            return kb_utilities.sort_terms(new_where_clause, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject canonicalize_csql_stripped_where_clause(final SubLObject where_clause, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        SubLObject new_where_clause = NIL;
        SubLObject cdolist_list_var = where_clause;
        SubLObject where_exp = NIL;
        where_exp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_where_clause = cons(canonicalize_csql_where_expression(where_exp, UNPROVIDED, UNPROVIDED), new_where_clause);
            cdolist_list_var = cdolist_list_var.rest();
            where_exp = cdolist_list_var.first();
        } 
        return kb_utilities.sort_terms(new_where_clause, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject canonicalize_csql_where_expression_alt(SubLObject where_exp, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        if (!where_exp.isList()) {
            return where_exp;
        }
        {
            SubLObject operator = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(where_exp);
            SubLObject v_arguments = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where_exp);
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_terminal_operator_p(operator)) {
                return where_exp;
            } else {
                {
                    SubLObject new_arguments = NIL;
                    SubLObject cdolist_list_var = v_arguments;
                    SubLObject argument = NIL;
                    for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                        new_arguments = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.canonicalize_csql_where_expression(argument, UNPROVIDED, UNPROVIDED), new_arguments);
                    }
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_commutative_operator_p(operator)) {
                        new_arguments = kb_utilities.sort_terms(new_arguments, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        new_arguments = nreverse(new_arguments);
                    }
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_csql_expression(operator, new_arguments);
                }
            }
        }
    }

    public static SubLObject canonicalize_csql_where_expression(final SubLObject where_exp, SubLObject copyP, SubLObject stableP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        if (!where_exp.isList()) {
            return where_exp;
        }
        final SubLObject operator = csql_expression_operator(where_exp);
        final SubLObject v_arguments = csql_expression_arguments(where_exp);
        if (NIL != csql_where_clause_terminal_operator_p(operator)) {
            return where_exp;
        }
        SubLObject new_arguments = NIL;
        SubLObject cdolist_list_var = v_arguments;
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_arguments = cons(canonicalize_csql_where_expression(argument, UNPROVIDED, UNPROVIDED), new_arguments);
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        if (NIL != csql_where_clause_commutative_operator_p(operator)) {
            new_arguments = kb_utilities.sort_terms(new_arguments, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            new_arguments = nreverse(new_arguments);
        }
        return make_csql_expression(operator, new_arguments);
    }

    public static final SubLObject simplify_csql_query_alt(SubLObject csql) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_fields = NIL;
                SubLObject new_tables = NIL;
                SubLObject new_where_clause = NIL;
                SubLObject datum = csql;
                SubLObject current = datum;
                SubLObject select_keyword = NIL;
                SubLObject fields = NIL;
                SubLObject from = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt58);
                select_keyword = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt58);
                fields = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt58);
                from = current.first();
                current = current.rest();
                {
                    SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt58);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if ($SELECT != select_keyword) {
                                Errors.error($str_alt59$malformed_csql_expression__a__exp, csql);
                            }
                        }
                        {
                            SubLObject datum_21 = from;
                            SubLObject current_22 = datum_21;
                            SubLObject from_keyword = NIL;
                            SubLObject tables = NIL;
                            destructuring_bind_must_consp(current_22, datum_21, $list_alt60);
                            from_keyword = current_22.first();
                            current_22 = current_22.rest();
                            destructuring_bind_must_consp(current_22, datum_21, $list_alt60);
                            tables = current_22.first();
                            current_22 = current_22.rest();
                            if (NIL == current_22) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if ($FROM != from_keyword) {
                                        Errors.error($str_alt61$malformed_csql_expression__a__exp, from);
                                    }
                                }
                                if (NIL != where) {
                                    {
                                        SubLObject datum_23 = where;
                                        SubLObject current_24 = datum_23;
                                        SubLObject where_keyword = NIL;
                                        SubLObject where_clause = NIL;
                                        destructuring_bind_must_consp(current_24, datum_23, $list_alt62);
                                        where_keyword = current_24.first();
                                        current_24 = current_24.rest();
                                        destructuring_bind_must_consp(current_24, datum_23, $list_alt62);
                                        where_clause = current_24.first();
                                        current_24 = current_24.rest();
                                        if (NIL == current_24) {
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if ($WHERE != where_keyword) {
                                                    Errors.error($str_alt63$malformed_csql_expression__a__exp, where);
                                                }
                                            }
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject new_fields_25 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.simplify_csql_expressions(fields, tables, where_clause);
                                                SubLObject new_tables_26 = thread.secondMultipleValue();
                                                SubLObject new_where_clause_27 = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                new_fields = new_fields_25;
                                                new_tables = new_tables_26;
                                                new_where_clause = new_where_clause_27;
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_23, $list_alt62);
                                        }
                                    }
                                } else {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_fields_28 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.simplify_csql_expressions(fields, tables, UNPROVIDED);
                                        SubLObject new_tables_29 = thread.secondMultipleValue();
                                        SubLObject new_where_clause_30 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        new_fields = new_fields_28;
                                        new_tables = new_tables_29;
                                        new_where_clause = new_where_clause_30;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_21, $list_alt60);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt58);
                    }
                }
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_csql_query(new_fields, new_tables, new_where_clause, NIL);
            }
        }
    }

    public static SubLObject simplify_csql_query(final SubLObject csql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_fields = NIL;
        SubLObject new_tables = NIL;
        SubLObject new_where_clause = NIL;
        SubLObject select_keyword = NIL;
        SubLObject fields = NIL;
        SubLObject from = NIL;
        destructuring_bind_must_consp(csql, csql, $list59);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list59);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list59);
        from = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list59);
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SELECT != select_keyword)) {
                Errors.error($str60$malformed_csql_expression__a__exp, csql);
            }
            SubLObject current_$22;
            final SubLObject datum_$21 = current_$22 = from;
            SubLObject from_keyword = NIL;
            SubLObject tables = NIL;
            destructuring_bind_must_consp(current_$22, datum_$21, $list61);
            from_keyword = current_$22.first();
            current_$22 = current_$22.rest();
            destructuring_bind_must_consp(current_$22, datum_$21, $list61);
            tables = current_$22.first();
            current_$22 = current_$22.rest();
            if (NIL == current_$22) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($FROM != from_keyword)) {
                    Errors.error($str62$malformed_csql_expression__a__exp, from);
                }
                if (NIL != where) {
                    SubLObject current_$23;
                    final SubLObject datum_$22 = current_$23 = where;
                    SubLObject where_keyword = NIL;
                    SubLObject where_clause = NIL;
                    destructuring_bind_must_consp(current_$23, datum_$22, $list63);
                    where_keyword = current_$23.first();
                    current_$23 = current_$23.rest();
                    destructuring_bind_must_consp(current_$23, datum_$22, $list63);
                    where_clause = current_$23.first();
                    current_$23 = current_$23.rest();
                    if (NIL == current_$23) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($WHERE != where_keyword)) {
                            Errors.error($str64$malformed_csql_expression__a__exp, where);
                        }
                        thread.resetMultipleValues();
                        final SubLObject new_fields_$25 = simplify_csql_expressions(fields, tables, where_clause);
                        final SubLObject new_tables_$26 = thread.secondMultipleValue();
                        final SubLObject new_where_clause_$27 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        new_fields = new_fields_$25;
                        new_tables = new_tables_$26;
                        new_where_clause = new_where_clause_$27;
                    } else {
                        cdestructuring_bind_error(datum_$22, $list63);
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject new_fields_$26 = simplify_csql_expressions(fields, tables, UNPROVIDED);
                    final SubLObject new_tables_$27 = thread.secondMultipleValue();
                    final SubLObject new_where_clause_$28 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    new_fields = new_fields_$26;
                    new_tables = new_tables_$27;
                    new_where_clause = new_where_clause_$28;
                }
            } else {
                cdestructuring_bind_error(datum_$21, $list61);
            }
        } else {
            cdestructuring_bind_error(csql, $list59);
        }
        return make_csql_query(new_fields, new_tables, new_where_clause, NIL);
    }

    public static final SubLObject simplify_csql_expressions_alt(SubLObject fields, SubLObject tables, SubLObject where) {
        if (where == UNPROVIDED) {
            where = NIL;
        }
        return NIL != where ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.simplify_csql_expressions_with_where_clause(fields, tables, where))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.simplify_csql_expressions_without_where_clause(fields, tables);
    }

    public static SubLObject simplify_csql_expressions(final SubLObject fields, final SubLObject tables, SubLObject where) {
        if (where == UNPROVIDED) {
            where = NIL;
        }
        return NIL != where ? simplify_csql_expressions_with_where_clause(fields, tables, where) : simplify_csql_expressions_without_where_clause(fields, tables);
    }

    public static SubLObject csql_field_p(final SubLObject v_object) {
        return makeBoolean((((((v_object.isList() && (NIL != list_utilities.lengthGE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.lengthLE(v_object, FOUR_INTEGER, UNPROVIDED))) && ($FIELD == v_object.first())) && second(v_object).isString()) && third(v_object).isString()) && ((NIL == fourth(v_object)) || fourth(v_object).isString()));
    }

    public static final SubLObject csql_field_name_alt(SubLObject field) {
        return $FIELD == field.first() ? ((SubLObject) (second(field))) : field.first();
    }

    public static SubLObject csql_field_name(final SubLObject field) {
        return $FIELD == field.first() ? second(field) : field.first();
    }

    public static final SubLObject csql_field_table_name_alt(SubLObject field) {
        return $FIELD == field.first() ? ((SubLObject) (third(field))) : second(field);
    }

    public static SubLObject csql_field_table_name(final SubLObject field) {
        return $FIELD == field.first() ? third(field) : second(field);
    }

    public static SubLObject csql_field_namespace(final SubLObject field) {
        return $FIELD == field.first() ? fourth(field) : third(field);
    }

    public static final SubLObject csql_table_name_alt(SubLObject table) {
        return $TABLE == table.first() ? ((SubLObject) (second(table))) : table.first();
    }

    public static SubLObject csql_table_name(final SubLObject table) {
        return $TABLE == table.first() ? second(table) : table.first();
    }

    public static final SubLObject csql_table_alias_alt(SubLObject table) {
        return $TABLE == table.first() ? ((SubLObject) (NIL != list_utilities.lengthE(table, THREE_INTEGER, UNPROVIDED) ? ((SubLObject) (third(table))) : second(table))) : NIL != list_utilities.lengthE(table, TWO_INTEGER, UNPROVIDED) ? ((SubLObject) (second(table))) : table.first();
    }

    public static SubLObject csql_table_alias(final SubLObject table) {
        return $TABLE == table.first() ? NIL != list_utilities.lengthE(table, THREE_INTEGER, UNPROVIDED) ? third(table) : second(table) : NIL != list_utilities.lengthE(table, TWO_INTEGER, UNPROVIDED) ? second(table) : table.first();
    }

    public static final SubLObject simplify_csql_expressions_with_where_clause_alt(SubLObject fields, SubLObject tables, SubLObject where) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            where = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.contract_where_clause(where);
            thread.resetMultipleValues();
            {
                SubLObject new_tables = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_eliminate_unnecessary_joins(tables, where);
                SubLObject new_where = thread.secondMultipleValue();
                SubLObject alist = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject new_fields = sublis(alist, fields, symbol_function(EQUAL), UNPROVIDED);
                    return values(new_fields, new_tables, new_where);
                }
            }
        }
    }

    public static SubLObject simplify_csql_expressions_with_where_clause(final SubLObject fields, final SubLObject tables, SubLObject where) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        where = contract_where_clause(where);
        thread.resetMultipleValues();
        final SubLObject new_tables = csql_eliminate_unnecessary_joins(tables, where);
        final SubLObject new_where = thread.secondMultipleValue();
        final SubLObject alist = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_fields = sublis(alist, fields, symbol_function(EQUAL), UNPROVIDED);
        return values(new_fields, new_tables, new_where);
    }

    public static final SubLObject simplify_csql_expressions_without_where_clause_alt(SubLObject fields, SubLObject tables) {
        {
            SubLObject new_tables = NIL;
            SubLObject cdolist_list_var = tables;
            SubLObject table = NIL;
            for (table = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table = cdolist_list_var.first()) {
                if (NIL != subl_promotions.memberP(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_table_alias(table), fields, symbol_function(EQUAL), CSQL_FIELD_TABLE_NAME)) {
                    new_tables = cons(table, new_tables);
                }
            }
            return values(fields, new_tables);
        }
    }

    public static SubLObject simplify_csql_expressions_without_where_clause(final SubLObject fields, final SubLObject tables) {
        SubLObject new_tables = NIL;
        SubLObject cdolist_list_var = tables;
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(csql_table_alias(table), fields, symbol_function(EQUAL), CSQL_FIELD_TABLE_NAME)) {
                new_tables = cons(table, new_tables);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return values(fields, new_tables);
    }

    public static final SubLObject simplify_where_expressions_alt(SubLObject where_expressions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_conjunction_p(where_expressions)) {
                return where_expressions;
            }
            {
                SubLObject value_table = dictionary.new_dictionary(symbol_function(EQUAL), length(where_expressions));
                SubLObject new_where_expressions = NIL;
                SubLObject failP = NIL;
                if (NIL == failP) {
                    {
                        SubLObject csome_list_var = where_expressions;
                        SubLObject where_expression = NIL;
                        for (where_expression = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , where_expression = csome_list_var.first()) {
                            {
                                SubLObject operator = where_expression.first();
                                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_equality_relation_p(operator)) {
                                    {
                                        SubLObject arg1 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg1(where_expression);
                                        SubLObject arg2 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg2(where_expression);
                                        if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg1)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_ground_term_p(arg2))) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject failP_31 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.inconsistent_where_expressionP(arg1, arg2, value_table);
                                                SubLObject value_table_32 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                failP = failP_31;
                                                value_table = value_table_32;
                                            }
                                        } else {
                                            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg2)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_ground_term_p(arg1))) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject failP_33 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.inconsistent_where_expressionP(arg2, arg1, value_table);
                                                    SubLObject value_table_34 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    failP = failP_33;
                                                    value_table = value_table_34;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == failP) {
                                new_where_expressions = cons(where_expression, new_where_expressions);
                            }
                        }
                    }
                }
                return NIL != failP ? ((SubLObject) ($csql_false$.getGlobalValue())) : nreverse(new_where_expressions);
            }
        }
    }

    public static SubLObject simplify_where_expressions(final SubLObject where_expressions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == csql_conjunction_p(where_expressions)) {
            return where_expressions;
        }
        SubLObject value_table = dictionary.new_dictionary(symbol_function(EQUAL), length(where_expressions));
        SubLObject new_where_expressions = NIL;
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = where_expressions;
            SubLObject where_expression = NIL;
            where_expression = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                final SubLObject operator = where_expression.first();
                if (NIL != csql_equality_relation_p(operator)) {
                    final SubLObject arg1 = csql_expression_arg1(where_expression);
                    final SubLObject arg2 = csql_expression_arg2(where_expression);
                    if ((NIL != csql_field_expression_p(arg1)) && (NIL != csql_ground_term_p(arg2))) {
                        thread.resetMultipleValues();
                        final SubLObject failP_$31 = inconsistent_where_expressionP(arg1, arg2, value_table);
                        final SubLObject value_table_$32 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        failP = failP_$31;
                        value_table = value_table_$32;
                    } else
                        if ((NIL != csql_field_expression_p(arg2)) && (NIL != csql_ground_term_p(arg1))) {
                            thread.resetMultipleValues();
                            final SubLObject failP_$32 = inconsistent_where_expressionP(arg2, arg1, value_table);
                            final SubLObject value_table_$33 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            failP = failP_$32;
                            value_table = value_table_$33;
                        }

                }
                if (NIL == failP) {
                    new_where_expressions = cons(where_expression, new_where_expressions);
                }
                csome_list_var = csome_list_var.rest();
                where_expression = csome_list_var.first();
            } 
        }
        return NIL != failP ? $csql_false$.getGlobalValue() : nreverse(new_where_expressions);
    }

    public static final SubLObject inconsistent_where_expressionP_alt(SubLObject field, SubLObject value, SubLObject value_table) {
        {
            SubLObject current_values = dictionary.dictionary_lookup_without_values(value_table, field, UNPROVIDED);
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = current_values;
                    SubLObject current_value = NIL;
                    for (current_value = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , current_value = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_ground_term_p(current_value)) {
                            failP = makeBoolean(NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_unify_possible(value, current_value));
                        }
                    }
                }
            }
            if (NIL == failP) {
                dictionary_utilities.dictionary_push(value_table, field, value);
            }
            return values(failP, value_table);
        }
    }

    public static SubLObject inconsistent_where_expressionP(final SubLObject field, final SubLObject value, final SubLObject value_table) {
        final SubLObject current_values = dictionary.dictionary_lookup_without_values(value_table, field, UNPROVIDED);
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = current_values;
            SubLObject current_value = NIL;
            current_value = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL != csql_ground_term_p(current_value)) {
                    failP = makeBoolean(NIL == csql_unify_possible(value, current_value));
                }
                csome_list_var = csome_list_var.rest();
                current_value = csome_list_var.first();
            } 
        }
        if (NIL == failP) {
            dictionary_utilities.dictionary_push(value_table, field, value);
        }
        return values(failP, value_table);
    }

    public static final SubLObject csql_unify_possible_alt(SubLObject obj1, SubLObject obj2) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_comparison_or_p(obj1)) {
            {
                SubLObject successP = NIL;
                if (NIL == successP) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(obj1);
                        SubLObject obj3 = NIL;
                        for (obj3 = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , obj3 = csome_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_unify_possible(obj3, obj2)) {
                                successP = T;
                            }
                        }
                    }
                }
                return successP;
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_comparison_and_p(obj1)) {
                {
                    SubLObject failureP = NIL;
                    if (NIL == failureP) {
                        {
                            SubLObject csome_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(obj1);
                            SubLObject obj3 = NIL;
                            for (obj3 = csome_list_var.first(); !((NIL != failureP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , obj3 = csome_list_var.first()) {
                                if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_unify_possible(obj3, obj2)) {
                                    failureP = T;
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == failureP);
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_comparison_or_p(obj2)) {
                    {
                        SubLObject successP = NIL;
                        if (NIL == successP) {
                            {
                                SubLObject csome_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(obj2);
                                SubLObject obj3 = NIL;
                                for (obj3 = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , obj3 = csome_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_unify_possible(obj1, obj3)) {
                                        successP = T;
                                    }
                                }
                            }
                        }
                        return successP;
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_comparison_and_p(obj2)) {
                        {
                            SubLObject failureP = NIL;
                            if (NIL == failureP) {
                                {
                                    SubLObject csome_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(obj2);
                                    SubLObject obj3 = NIL;
                                    for (obj3 = csome_list_var.first(); !((NIL != failureP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , obj3 = csome_list_var.first()) {
                                        if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_unify_possible(obj1, obj3)) {
                                            failureP = T;
                                        }
                                    }
                                }
                            }
                            return makeBoolean(NIL == failureP);
                        }
                    } else {
                        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_unify_possible_int(obj1, obj2);
                    }
                }
            }
        }
    }

    public static SubLObject csql_unify_possible(final SubLObject obj1, final SubLObject obj2) {
        if (NIL != csql_comparison_or_p(obj1)) {
            SubLObject successP = NIL;
            if (NIL == successP) {
                SubLObject csome_list_var = csql_expression_arguments(obj1);
                SubLObject obj3 = NIL;
                obj3 = csome_list_var.first();
                while ((NIL == successP) && (NIL != csome_list_var)) {
                    if (NIL != csql_unify_possible(obj3, obj2)) {
                        successP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                } 
            }
            return successP;
        }
        if (NIL != csql_comparison_and_p(obj1)) {
            SubLObject failureP = NIL;
            if (NIL == failureP) {
                SubLObject csome_list_var = csql_expression_arguments(obj1);
                SubLObject obj3 = NIL;
                obj3 = csome_list_var.first();
                while ((NIL == failureP) && (NIL != csome_list_var)) {
                    if (NIL == csql_unify_possible(obj3, obj2)) {
                        failureP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == failureP);
        }
        if (NIL != csql_comparison_or_p(obj2)) {
            SubLObject successP = NIL;
            if (NIL == successP) {
                SubLObject csome_list_var = csql_expression_arguments(obj2);
                SubLObject obj3 = NIL;
                obj3 = csome_list_var.first();
                while ((NIL == successP) && (NIL != csome_list_var)) {
                    if (NIL != csql_unify_possible(obj1, obj3)) {
                        successP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                } 
            }
            return successP;
        }
        if (NIL != csql_comparison_and_p(obj2)) {
            SubLObject failureP = NIL;
            if (NIL == failureP) {
                SubLObject csome_list_var = csql_expression_arguments(obj2);
                SubLObject obj3 = NIL;
                obj3 = csome_list_var.first();
                while ((NIL == failureP) && (NIL != csome_list_var)) {
                    if (NIL == csql_unify_possible(obj1, obj3)) {
                        failureP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == failureP);
        }
        return csql_unify_possible_int(obj1, obj2);
    }

    public static final SubLObject sql_regular_expression_char_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != find(v_object, $sql_regular_expression_meta_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject sql_regular_expression_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != find(v_object, $sql_regular_expression_meta_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject sql_regular_expression_string_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if(SQL_REGULAR_EXPRESSION_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject sql_regular_expression_string_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if(SQL_REGULAR_EXPRESSION_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject csql_unify_possible_int_alt(SubLObject obj1, SubLObject obj2) {
        if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.sql_regular_expression_string_p(obj1)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.sql_regular_expression_string_p(obj2))) {
            return T;
        }
        return unification.unify_possible(obj1, obj2);
    }

    public static SubLObject csql_unify_possible_int(final SubLObject obj1, final SubLObject obj2) {
        if ((NIL != sql_regular_expression_string_p(obj1)) || (NIL != sql_regular_expression_string_p(obj2))) {
            return T;
        }
        return unification.unify_possible(obj1, obj2);
    }

    public static final SubLObject csql_ground_term_p_alt(SubLObject v_object) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(v_object));
    }

    public static SubLObject csql_ground_term_p(final SubLObject v_object) {
        return makeBoolean(NIL == csql_field_expression_p(v_object));
    }

    public static final SubLObject contract_where_clause_alt(SubLObject where) {
        {
            SubLObject rev_where = delete_duplicates((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_explicit_conjunction_p(where)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjunction_p(where)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where))) : where, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject new_where = NIL;
            SubLObject cdolist_list_var = rev_where;
            SubLObject where_expression = NIL;
            for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                {
                    SubLObject new_expression = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.contract_where_expression(where_expression);
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_true_p(new_expression)) {
                    } else {
                        if ((new_expression.isCons() && ($$CSQLAnd == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(new_expression))) && (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjunction_p(where))) {
                            {
                                SubLObject cdolist_list_var_35 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(new_expression);
                                SubLObject sub_expression = NIL;
                                for (sub_expression = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , sub_expression = cdolist_list_var_35.first()) {
                                    new_where = cons(sub_expression, new_where);
                                }
                            }
                        } else {
                            new_where = cons(new_expression, new_where);
                        }
                    }
                }
            }
            new_where = delete_duplicates(new_where, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjunction_p(where)) {
                new_where = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjoin_expressions(new_where);
            }
            new_where = nreverse(new_where);
            return new_where;
        }
    }

    public static SubLObject contract_where_clause(final SubLObject where) {
        final SubLObject rev_where = delete_duplicates((NIL != csql_explicit_conjunction_p(where)) || (NIL != csql_disjunction_p(where)) ? csql_expression_arguments(where) : where, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_where = NIL;
        SubLObject cdolist_list_var = rev_where;
        SubLObject where_expression = NIL;
        where_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_expression = contract_where_expression(where_expression);
            if (NIL == csql_true_p(new_expression)) {
                if ((new_expression.isCons() && $$CSQLAnd.eql(csql_expression_operator(new_expression))) && (NIL == csql_disjunction_p(where))) {
                    SubLObject cdolist_list_var_$35 = csql_expression_arguments(new_expression);
                    SubLObject sub_expression = NIL;
                    sub_expression = cdolist_list_var_$35.first();
                    while (NIL != cdolist_list_var_$35) {
                        new_where = cons(sub_expression, new_where);
                        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                        sub_expression = cdolist_list_var_$35.first();
                    } 
                } else {
                    new_where = cons(new_expression, new_where);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        } 
        new_where = delete_duplicates(new_where, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != csql_disjunction_p(where)) {
            new_where = csql_disjoin_expressions(new_where);
        }
        new_where = nreverse(new_where);
        return new_where;
    }

    public static final SubLObject contract_where_expression_alt(SubLObject where) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_true_p(where)) {
            return where;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_false_p(where)) {
                return where;
            } else {
                {
                    SubLObject operator = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(where);
                    SubLObject pcase_var = operator;
                    if (pcase_var.eql($$CSQLStrictlyEquals)) {
                        {
                            SubLObject datum = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where);
                            SubLObject current = datum;
                            SubLObject left = NIL;
                            SubLObject right = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt68);
                            left = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt68);
                            right = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (left.equal(right)) {
                                    return $csql_true$.getGlobalValue();
                                } else {
                                    if (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        return list(operator, right, left);
                                    } else {
                                        return where;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt68);
                            }
                        }
                    } else {
                        if (pcase_var.eql($$CSQLNotEqual)) {
                            {
                                SubLObject datum = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where);
                                SubLObject current = datum;
                                SubLObject left = NIL;
                                SubLObject right = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt68);
                                left = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt68);
                                right = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (left.equal(right)) {
                                        return $csql_false$.getGlobalValue();
                                    } else {
                                        if (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            return list(operator, right, left);
                                        } else {
                                            return where;
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt68);
                                }
                            }
                        } else {
                            if (pcase_var.eql($$CSQLEquals) || pcase_var.eql($$CSQLLike)) {
                                {
                                    SubLObject datum = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where);
                                    SubLObject current = datum;
                                    SubLObject left = NIL;
                                    SubLObject right = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt68);
                                    left = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt68);
                                    right = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (left.equal(right)) {
                                            return $csql_true$.getGlobalValue();
                                        } else {
                                            if (((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(left)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(right))) && (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                return list(operator, right, left);
                                            } else {
                                                return where;
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt68);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($$CSQLDifferent) || pcase_var.eql($$CSQLUnlike)) {
                                    {
                                        SubLObject datum = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where);
                                        SubLObject current = datum;
                                        SubLObject left = NIL;
                                        SubLObject right = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt68);
                                        left = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt68);
                                        right = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (left.equal(right)) {
                                                return $csql_false$.getGlobalValue();
                                            } else {
                                                if (((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(left)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(right))) && (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                    return list(operator, right, left);
                                                } else {
                                                    return where;
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt68);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($$CSQLAnd)) {
                                        {
                                            SubLObject new_expressions = NIL;
                                            SubLObject doneP = NIL;
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = delete_duplicates(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject expression = NIL;
                                                    for (expression = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , expression = csome_list_var.first()) {
                                                        {
                                                            SubLObject new_expression = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.contract_where_expression(expression);
                                                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_true_p(new_expression)) {
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_false_p(new_expression)) {
                                                                    new_expressions = list($csql_false$.getGlobalValue());
                                                                    doneP = T;
                                                                } else {
                                                                    if ($$CSQLAnd == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(new_expression)) {
                                                                        new_expressions = append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(new_expression), new_expressions);
                                                                    } else {
                                                                        new_expressions = cons(new_expression, new_expressions);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            new_expressions = delete_duplicates(new_expressions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_conjoin_expressions(new_expressions);
                                        }
                                    } else {
                                        if (pcase_var.eql($$CSQLOr)) {
                                            {
                                                SubLObject new_expressions = NIL;
                                                SubLObject doneP = NIL;
                                                if (NIL == doneP) {
                                                    {
                                                        SubLObject csome_list_var = delete_duplicates(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject expression = NIL;
                                                        for (expression = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , expression = csome_list_var.first()) {
                                                            {
                                                                SubLObject new_expression = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.contract_where_expression(expression);
                                                                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_true_p(new_expression)) {
                                                                    new_expressions = list($csql_true$.getGlobalValue());
                                                                    doneP = T;
                                                                } else {
                                                                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_false_p(new_expression)) {
                                                                    } else {
                                                                        if ($$CSQLOr == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(new_expression)) {
                                                                            new_expressions = append(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(new_expression), new_expressions);
                                                                        } else {
                                                                            new_expressions = cons(new_expression, new_expressions);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                new_expressions = delete_duplicates(new_expressions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjoin_expressions(new_expressions);
                                            }
                                        } else {
                                            return where;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject contract_where_expression(final SubLObject where) {
        if (NIL != csql_true_p(where)) {
            return where;
        }
        if (NIL != csql_false_p(where)) {
            return where;
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = csql_expression_operator(where);
        if (pcase_var.eql($$CSQLStrictlyEquals)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = NIL;
            SubLObject right = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            left = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list69);
            right = current.first();
            current = current.rest();
            if (NIL == current) {
                if (left.equal(right)) {
                    return $csql_true$.getGlobalValue();
                }
                if (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return list(operator, right, left);
                }
                return where;
            } else {
                cdestructuring_bind_error(datum, $list69);
            }
        } else
            if (pcase_var.eql($$CSQLNotEqual)) {
                SubLObject current;
                final SubLObject datum = current = csql_expression_arguments(where);
                SubLObject left = NIL;
                SubLObject right = NIL;
                destructuring_bind_must_consp(current, datum, $list69);
                left = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list69);
                right = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (left.equal(right)) {
                        return $csql_false$.getGlobalValue();
                    }
                    if (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return list(operator, right, left);
                    }
                    return where;
                } else {
                    cdestructuring_bind_error(datum, $list69);
                }
            } else
                if (pcase_var.eql($$CSQLEquals) || pcase_var.eql($$CSQLLike)) {
                    SubLObject current;
                    final SubLObject datum = current = csql_expression_arguments(where);
                    SubLObject left = NIL;
                    SubLObject right = NIL;
                    destructuring_bind_must_consp(current, datum, $list69);
                    left = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list69);
                    right = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (left.equal(right)) {
                            return $csql_true$.getGlobalValue();
                        }
                        if (((NIL != csql_field_expression_p(left)) && (NIL != csql_field_expression_p(right))) && (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            return list(operator, right, left);
                        }
                        return where;
                    } else {
                        cdestructuring_bind_error(datum, $list69);
                    }
                } else
                    if (pcase_var.eql($$CSQLDifferent) || pcase_var.eql($$CSQLUnlike)) {
                        SubLObject current;
                        final SubLObject datum = current = csql_expression_arguments(where);
                        SubLObject left = NIL;
                        SubLObject right = NIL;
                        destructuring_bind_must_consp(current, datum, $list69);
                        left = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list69);
                        right = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (left.equal(right)) {
                                return $csql_false$.getGlobalValue();
                            }
                            if (((NIL != csql_field_expression_p(left)) && (NIL != csql_field_expression_p(right))) && (NIL != kb_utilities.term_L(right, left, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                return list(operator, right, left);
                            }
                            return where;
                        } else {
                            cdestructuring_bind_error(datum, $list69);
                        }
                    } else {
                        if (pcase_var.eql($$CSQLAnd)) {
                            SubLObject new_expressions = NIL;
                            SubLObject doneP = NIL;
                            if (NIL == doneP) {
                                SubLObject csome_list_var = delete_duplicates(csql_expression_arguments(where), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject expression = NIL;
                                expression = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject new_expression = contract_where_expression(expression);
                                    if (NIL == csql_true_p(new_expression)) {
                                        if (NIL != csql_false_p(new_expression)) {
                                            new_expressions = list($csql_false$.getGlobalValue());
                                            doneP = T;
                                        } else
                                            if ($$CSQLAnd.eql(csql_expression_operator(new_expression))) {
                                                new_expressions = append(csql_expression_arguments(new_expression), new_expressions);
                                            } else {
                                                new_expressions = cons(new_expression, new_expressions);
                                            }

                                    }
                                    csome_list_var = csome_list_var.rest();
                                    expression = csome_list_var.first();
                                } 
                            }
                            new_expressions = delete_duplicates(new_expressions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return csql_conjoin_expressions(new_expressions);
                        }
                        if (pcase_var.eql($$CSQLOr)) {
                            SubLObject new_expressions = NIL;
                            SubLObject doneP = NIL;
                            if (NIL == doneP) {
                                SubLObject csome_list_var = delete_duplicates(csql_expression_arguments(where), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject expression = NIL;
                                expression = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject new_expression = contract_where_expression(expression);
                                    if (NIL != csql_true_p(new_expression)) {
                                        new_expressions = list($csql_true$.getGlobalValue());
                                        doneP = T;
                                    } else
                                        if (NIL == csql_false_p(new_expression)) {
                                            if ($$CSQLOr.eql(csql_expression_operator(new_expression))) {
                                                new_expressions = append(csql_expression_arguments(new_expression), new_expressions);
                                            } else {
                                                new_expressions = cons(new_expression, new_expressions);
                                            }
                                        }

                                    csome_list_var = csome_list_var.rest();
                                    expression = csome_list_var.first();
                                } 
                            }
                            new_expressions = delete_duplicates(new_expressions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return csql_disjoin_expressions(new_expressions);
                        }
                        return where;
                    }



        return NIL;
    }

    public static final SubLObject csql_eliminate_unnecessary_joins_alt(SubLObject tables, SubLObject where) {
        return values(tables, where, NIL);
    }

    public static SubLObject csql_eliminate_unnecessary_joins(final SubLObject tables, final SubLObject where) {
        return values(tables, where, NIL);
    }

    public static final SubLObject csql_where_find_joins_alt(SubLObject where) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject field_map = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_find_field_map(where);
                SubLObject joins = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(field_map));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject field1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject join_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject table1 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_table_name(field1);
                            SubLObject cdolist_list_var = join_list;
                            SubLObject field2 = NIL;
                            for (field2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field2 = cdolist_list_var.first()) {
                                {
                                    SubLObject table2 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_table_name(field2);
                                    dictionary_utilities.dictionary_pushnew(joins, table1, table2, symbol_function(EQUAL), UNPROVIDED);
                                    dictionary_utilities.dictionary_pushnew(joins, table2, table1, symbol_function(EQUAL), UNPROVIDED);
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return joins;
            }
        }
    }

    public static SubLObject csql_where_find_joins(final SubLObject where) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject field_map = csql_where_find_field_map(where);
        final SubLObject joins = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(field_map)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject field1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject join_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject table1 = csql_field_table_name(field1);
            SubLObject cdolist_list_var = join_list;
            SubLObject field2 = NIL;
            field2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject table2 = csql_field_table_name(field2);
                dictionary_utilities.dictionary_pushnew(joins, table1, table2, symbol_function(EQUAL), UNPROVIDED);
                dictionary_utilities.dictionary_pushnew(joins, table2, table1, symbol_function(EQUAL), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                field2 = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return joins;
    }

    public static final SubLObject csql_where_find_field_map_alt(SubLObject where) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_find_field_map_int(where, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject csql_where_find_field_map(final SubLObject where) {
        return csql_where_find_field_map_int(where, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
    }

    public static final SubLObject csql_where_find_field_map_int_alt(SubLObject where, SubLObject field_map) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_equal_clause_p(where)) {
            {
                SubLObject datum = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where);
                SubLObject current = datum;
                SubLObject left = NIL;
                SubLObject right = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt68);
                left = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                right = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(left)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(right))) {
                        dictionary_utilities.dictionary_pushnew(field_map, left, right, symbol_function(EQUAL), UNPROVIDED);
                        dictionary_utilities.dictionary_pushnew(field_map, right, left, symbol_function(EQUAL), UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt68);
                }
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_conjunction_p(where)) {
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_conjunction_conjuncts(where);
                    SubLObject conjunct = NIL;
                    for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_find_field_map_int(conjunct, field_map);
                    }
                }
            }
        }
        return field_map;
    }

    public static SubLObject csql_where_find_field_map_int(final SubLObject where, final SubLObject field_map) {
        if (NIL != csql_equal_clause_p(where)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = NIL;
            SubLObject right = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            left = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list69);
            right = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != csql_field_expression_p(left)) && (NIL != csql_field_expression_p(right))) {
                    dictionary_utilities.dictionary_pushnew(field_map, left, right, symbol_function(EQUAL), UNPROVIDED);
                    dictionary_utilities.dictionary_pushnew(field_map, right, left, symbol_function(EQUAL), UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list69);
            }
        } else
            if (NIL != csql_conjunction_p(where)) {
                SubLObject cdolist_list_var = csql_conjunction_conjuncts(where);
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    csql_where_find_field_map_int(conjunct, field_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
            }

        return field_map;
    }

    public static final SubLObject csql_remove_redundant_select_fields_alt(SubLObject fields, SubLObject where_clause) {
        return fields;
    }

    public static SubLObject csql_remove_redundant_select_fields(final SubLObject fields, final SubLObject where_clause) {
        return fields;
    }

    public static final SubLObject csql_where_clause_field_equals_some_fieldP_alt(SubLObject where_clause, SubLObject field1, SubLObject fields) {
        {
            SubLObject equalP = NIL;
            if (NIL == equalP) {
                {
                    SubLObject csome_list_var = fields;
                    SubLObject field2 = NIL;
                    for (field2 = csome_list_var.first(); !((NIL != equalP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , field2 = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_clause_field_equals_fieldP(where_clause, field1, field2)) {
                            equalP = T;
                        }
                    }
                }
            }
            return equalP;
        }
    }

    public static SubLObject csql_where_clause_field_equals_some_fieldP(final SubLObject where_clause, final SubLObject field1, final SubLObject fields) {
        SubLObject equalP = NIL;
        if (NIL == equalP) {
            SubLObject csome_list_var = fields;
            SubLObject field2 = NIL;
            field2 = csome_list_var.first();
            while ((NIL == equalP) && (NIL != csome_list_var)) {
                if (NIL != csql_where_clause_field_equals_fieldP(where_clause, field1, field2)) {
                    equalP = T;
                }
                csome_list_var = csome_list_var.rest();
                field2 = csome_list_var.first();
            } 
        }
        return equalP;
    }

    public static final SubLObject csql_where_clause_field_equals_fieldP_alt(SubLObject where_clause, SubLObject field1, SubLObject field2) {
        {
            SubLObject equalP = equal(field1, field2);
            if (NIL == equalP) {
                {
                    SubLObject csome_list_var = where_clause;
                    SubLObject where_exp = NIL;
                    for (where_exp = csome_list_var.first(); !((NIL != equalP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , where_exp = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_expression_field_equals_fieldP(where_exp, field1, field2)) {
                            equalP = T;
                        }
                    }
                }
            }
            return equalP;
        }
    }

    public static SubLObject csql_where_clause_field_equals_fieldP(final SubLObject where_clause, final SubLObject field1, final SubLObject field2) {
        SubLObject equalP = equal(field1, field2);
        if (NIL == equalP) {
            SubLObject csome_list_var = where_clause;
            SubLObject where_exp = NIL;
            where_exp = csome_list_var.first();
            while ((NIL == equalP) && (NIL != csome_list_var)) {
                if (NIL != csql_where_expression_field_equals_fieldP(where_exp, field1, field2)) {
                    equalP = T;
                }
                csome_list_var = csome_list_var.rest();
                where_exp = csome_list_var.first();
            } 
        }
        return equalP;
    }

    public static final SubLObject csql_where_expression_field_equals_fieldP_alt(SubLObject where_expression, SubLObject field1, SubLObject field2) {
        if ($FIELD != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(field1)) {
            field1 = cons($FIELD, field1);
        }
        if ($FIELD != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(field2)) {
            field2 = cons($FIELD, field2);
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_expression_field_equals_fieldP_int(where_expression, field1, field2);
    }

    public static SubLObject csql_where_expression_field_equals_fieldP(final SubLObject where_expression, SubLObject field1, SubLObject field2) {
        if ($FIELD != csql_expression_operator(field1)) {
            field1 = cons($FIELD, field1);
        }
        if ($FIELD != csql_expression_operator(field2)) {
            field2 = cons($FIELD, field2);
        }
        return csql_where_expression_field_equals_fieldP_int(where_expression, field1, field2);
    }

    public static final SubLObject csql_where_expression_field_equals_fieldP_int_alt(SubLObject where_expression, SubLObject field1, SubLObject field2) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_true_p(where_expression)) {
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_false_p(where_expression)) {
                return NIL;
            } else {
                {
                    SubLObject operator = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(where_expression);
                    SubLObject pcase_var = operator;
                    if ((pcase_var.eql($$CSQLStrictlyEquals) || pcase_var.eql($$CSQLEquals)) || pcase_var.eql($$CSQLLike)) {
                        {
                            SubLObject datum = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where_expression);
                            SubLObject current = datum;
                            SubLObject left = NIL;
                            SubLObject right = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt68);
                            left = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt68);
                            right = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return makeBoolean((left.equal(field1) && right.equal(field2)) || (left.equal(field2) && right.equal(field1)));
                            } else {
                                cdestructuring_bind_error(datum, $list_alt68);
                            }
                        }
                    } else {
                        if (pcase_var.eql($$CSQLAnd)) {
                            {
                                SubLObject equalP = NIL;
                                if (NIL == equalP) {
                                    {
                                        SubLObject csome_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where_expression);
                                        SubLObject conjunct = NIL;
                                        for (conjunct = csome_list_var.first(); !((NIL != equalP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , conjunct = csome_list_var.first()) {
                                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_expression_field_equals_fieldP_int(conjunct, field1, field2)) {
                                                equalP = T;
                                            }
                                        }
                                    }
                                }
                                return equalP;
                            }
                        } else {
                            if (pcase_var.eql($$CSQLOr)) {
                                {
                                    SubLObject maybe_not_equalP = NIL;
                                    if (NIL == maybe_not_equalP) {
                                        {
                                            SubLObject csome_list_var = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(where_expression);
                                            SubLObject disjunct = NIL;
                                            for (disjunct = csome_list_var.first(); !((NIL != maybe_not_equalP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , disjunct = csome_list_var.first()) {
                                                if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_where_expression_field_equals_fieldP_int(disjunct, field1, field2)) {
                                                    maybe_not_equalP = T;
                                                }
                                            }
                                        }
                                    }
                                    return makeBoolean(NIL == maybe_not_equalP);
                                }
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject csql_where_expression_field_equals_fieldP_int(final SubLObject where_expression, final SubLObject field1, final SubLObject field2) {
        if (NIL != csql_true_p(where_expression)) {
            return NIL;
        }
        if (NIL != csql_false_p(where_expression)) {
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = csql_expression_operator(where_expression);
        if ((pcase_var.eql($$CSQLStrictlyEquals) || pcase_var.eql($$CSQLEquals)) || pcase_var.eql($$CSQLLike)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where_expression);
            SubLObject left = NIL;
            SubLObject right = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            left = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list69);
            right = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((left.equal(field1) && right.equal(field2)) || (left.equal(field2) && right.equal(field1)));
            }
            cdestructuring_bind_error(datum, $list69);
            return NIL;
        } else {
            if (pcase_var.eql($$CSQLAnd)) {
                SubLObject equalP = NIL;
                if (NIL == equalP) {
                    SubLObject csome_list_var = csql_expression_arguments(where_expression);
                    SubLObject conjunct = NIL;
                    conjunct = csome_list_var.first();
                    while ((NIL == equalP) && (NIL != csome_list_var)) {
                        if (NIL != csql_where_expression_field_equals_fieldP_int(conjunct, field1, field2)) {
                            equalP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        conjunct = csome_list_var.first();
                    } 
                }
                return equalP;
            }
            if (pcase_var.eql($$CSQLOr)) {
                SubLObject maybe_not_equalP = NIL;
                if (NIL == maybe_not_equalP) {
                    SubLObject csome_list_var = csql_expression_arguments(where_expression);
                    SubLObject disjunct = NIL;
                    disjunct = csome_list_var.first();
                    while ((NIL == maybe_not_equalP) && (NIL != csome_list_var)) {
                        if (NIL == csql_where_expression_field_equals_fieldP_int(disjunct, field1, field2)) {
                            maybe_not_equalP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        disjunct = csome_list_var.first();
                    } 
                }
                return makeBoolean(NIL == maybe_not_equalP);
            }
            return NIL;
        }
    }

    public static final SubLObject csql_to_el_alt(SubLObject csql, SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        return cycl_utilities.hl_to_el(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl(csql, sk_source, from_expression));
    }

    public static SubLObject csql_to_el(final SubLObject csql, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        return cycl_utilities.hl_to_el(csql_to_cycl(csql, sk_source, from_expression));
    }

    public static final SubLObject csql_to_cycl_alt(SubLObject csql, SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject row_in_source_claims_cycl = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl_int(csql, sk_source, from_expression);
                SubLObject source_claims_cycl = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != row_in_source_claims_cycl) && (NIL != source_claims_cycl)) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.simplify_where_expressions(make_conjunction(bq_cons(row_in_source_claims_cycl, $list_alt70)));
                } else {
                    if (NIL != row_in_source_claims_cycl) {
                        return row_in_source_claims_cycl;
                    } else {
                        if (NIL != source_claims_cycl) {
                            return source_claims_cycl;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject csql_to_cycl(final SubLObject csql, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject row_in_source_claims_cycl = csql_to_cycl_int(csql, sk_source, from_expression);
        final SubLObject source_claims_cycl = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != row_in_source_claims_cycl) && (NIL != source_claims_cycl)) {
            return simplify_where_expressions(make_conjunction(bq_cons(row_in_source_claims_cycl, $list71)));
        }
        if (NIL != row_in_source_claims_cycl) {
            return row_in_source_claims_cycl;
        }
        if (NIL != source_claims_cycl) {
            return source_claims_cycl;
        }
        return NIL;
    }

    public static final SubLObject csql_to_cycl_int_alt(SubLObject csql, SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject row_in_source_claims_cycl = NIL;
                SubLObject source_claims_cycl = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject row_in_source_claims_cycl_36 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl_recursive(csql, sk_source, from_expression);
                            SubLObject source_claims_cycl_37 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            row_in_source_claims_cycl = row_in_source_claims_cycl_36;
                            source_claims_cycl = source_claims_cycl_37;
                        }
                        row_in_source_claims_cycl = simplifier.simplify_cycl_sentence_syntax(row_in_source_claims_cycl, UNPROVIDED);
                        source_claims_cycl = simplifier.simplify_cycl_sentence_syntax(source_claims_cycl, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(row_in_source_claims_cycl, source_claims_cycl);
            }
        }
    }

    public static SubLObject csql_to_cycl_int(final SubLObject csql, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject row_in_source_claims_cycl = NIL;
        SubLObject source_claims_cycl = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims_cycl_$36 = csql_to_cycl_recursive(csql, sk_source, from_expression);
            final SubLObject source_claims_cycl_$37 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            row_in_source_claims_cycl = row_in_source_claims_cycl_$36;
            source_claims_cycl = source_claims_cycl_$37;
            row_in_source_claims_cycl = simplifier.simplify_cycl_sentence_syntax(row_in_source_claims_cycl, UNPROVIDED);
            source_claims_cycl = simplifier.simplify_cycl_sentence_syntax(source_claims_cycl, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(row_in_source_claims_cycl, source_claims_cycl);
    }

    public static final SubLObject csql_to_cycl_recursive_alt(SubLObject csql, SubLObject sk_source, SubLObject from_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_comparison_clause_p(csql)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence(csql, sk_source, from_expression);
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_negation_p(csql)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject row_in_source_claims = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl_recursive(second(csql), sk_source, from_expression);
                        SubLObject source_claims = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject neg_row_in_source_claims = (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims)) ? ((SubLObject) (make_negation(row_in_source_claims))) : NIL;
                            SubLObject neg_source_claims = (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims)) ? ((SubLObject) (make_negation(source_claims))) : NIL;
                            return values(neg_row_in_source_claims, neg_source_claims);
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_conjunction_p(csql)) {
                        {
                            SubLObject csql_conjuncts = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_conjunction_conjuncts(csql);
                            thread.resetMultipleValues();
                            {
                                SubLObject row_in_source_claims = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl_recursive_2(csql_conjuncts, sk_source, from_expression);
                                SubLObject source_claims = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject conj_row_in_source_claims = (NIL != row_in_source_claims) ? ((SubLObject) (make_conjunction(row_in_source_claims))) : NIL;
                                    SubLObject conj_source_claims = (NIL != source_claims) ? ((SubLObject) (make_conjunction(source_claims))) : NIL;
                                    return values(conj_row_in_source_claims, conj_source_claims);
                                }
                            }
                        }
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjunction_p(csql)) {
                            {
                                SubLObject csql_disjuncts = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjunction_disjuncts(csql);
                                thread.resetMultipleValues();
                                {
                                    SubLObject row_in_source_claims = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl_recursive_2(csql_disjuncts, sk_source, from_expression);
                                    SubLObject source_claims = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject dis_row_in_source_claims = (NIL != row_in_source_claims) ? ((SubLObject) (make_disjunction(row_in_source_claims))) : NIL;
                                        SubLObject dis_source_claims = (NIL != source_claims) ? ((SubLObject) (make_disjunction(source_claims))) : NIL;
                                        return values(dis_row_in_source_claims, dis_source_claims);
                                    }
                                }
                            }
                        } else {
                            return values(NIL, NIL);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject csql_to_cycl_recursive(final SubLObject csql, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != csql_comparison_clause_p(csql)) {
            return construct_field_value_sentence(csql, sk_source, from_expression);
        }
        if (NIL != csql_negation_p(csql)) {
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims = csql_to_cycl_recursive(second(csql), sk_source, from_expression);
            final SubLObject source_claims = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject neg_row_in_source_claims = (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims)) ? make_negation(row_in_source_claims) : NIL;
            final SubLObject neg_source_claims = (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims)) ? make_negation(source_claims) : NIL;
            return values(neg_row_in_source_claims, neg_source_claims);
        }
        if (NIL != csql_conjunction_p(csql)) {
            final SubLObject csql_conjuncts = csql_conjunction_conjuncts(csql);
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims2 = csql_to_cycl_recursive_2(csql_conjuncts, sk_source, from_expression);
            final SubLObject source_claims2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject conj_row_in_source_claims = (NIL != row_in_source_claims2) ? make_conjunction(row_in_source_claims2) : NIL;
            final SubLObject conj_source_claims = (NIL != source_claims2) ? make_conjunction(source_claims2) : NIL;
            return values(conj_row_in_source_claims, conj_source_claims);
        }
        if (NIL != csql_disjunction_p(csql)) {
            final SubLObject csql_disjuncts = csql_disjunction_disjuncts(csql);
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims2 = csql_to_cycl_recursive_2(csql_disjuncts, sk_source, from_expression);
            final SubLObject source_claims2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject dis_row_in_source_claims = (NIL != row_in_source_claims2) ? make_disjunction(row_in_source_claims2) : NIL;
            final SubLObject dis_source_claims = (NIL != source_claims2) ? make_disjunction(source_claims2) : NIL;
            return values(dis_row_in_source_claims, dis_source_claims);
        }
        return values(NIL, NIL);
    }

    public static final SubLObject csql_to_cycl_recursive_2_alt(SubLObject csql_forms, SubLObject sk_source, SubLObject from_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject row_in_source_claims_forms = NIL;
                SubLObject source_claims_forms = NIL;
                SubLObject not_supportedP = NIL;
                if (NIL == not_supportedP) {
                    {
                        SubLObject csome_list_var = csql_forms;
                        SubLObject csql_form = NIL;
                        for (csql_form = csome_list_var.first(); !((NIL != not_supportedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , csql_form = csome_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject row_in_source_claims_form = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_to_cycl_recursive(csql_form, sk_source, from_expression);
                                SubLObject source_claims_form = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims_form)) {
                                    row_in_source_claims_forms = cons(row_in_source_claims_form, row_in_source_claims_forms);
                                }
                                if (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims_form)) {
                                    source_claims_forms = cons(source_claims_form, source_claims_forms);
                                }
                                if (!((NIL != row_in_source_claims_form) || (NIL != source_claims_form))) {
                                    not_supportedP = T;
                                }
                            }
                        }
                    }
                }
                if (NIL != not_supportedP) {
                    return values(NIL, NIL);
                } else {
                    return values(nreverse(row_in_source_claims_forms), nreverse(source_claims_forms));
                }
            }
        }
    }

    public static SubLObject csql_to_cycl_recursive_2(final SubLObject csql_forms, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject row_in_source_claims_forms = NIL;
        SubLObject source_claims_forms = NIL;
        SubLObject not_supportedP = NIL;
        if (NIL == not_supportedP) {
            SubLObject csome_list_var = csql_forms;
            SubLObject csql_form = NIL;
            csql_form = csome_list_var.first();
            while ((NIL == not_supportedP) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject row_in_source_claims_form = csql_to_cycl_recursive(csql_form, sk_source, from_expression);
                final SubLObject source_claims_form = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims_form)) {
                    row_in_source_claims_forms = cons(row_in_source_claims_form, row_in_source_claims_forms);
                }
                if (NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims_form)) {
                    source_claims_forms = cons(source_claims_form, source_claims_forms);
                }
                if ((NIL == row_in_source_claims_form) && (NIL == source_claims_form)) {
                    not_supportedP = T;
                }
                csome_list_var = csome_list_var.rest();
                csql_form = csome_list_var.first();
            } 
        }
        if (NIL != not_supportedP) {
            return values(NIL, NIL);
        }
        return values(nreverse(row_in_source_claims_forms), nreverse(source_claims_forms));
    }

    public static final SubLObject construct_field_value_sentence_alt(SubLObject where_clause, SubLObject sk_source, SubLObject from_expression) {
        {
            SubLObject operator = where_clause.first();
            SubLObject arg1 = second(where_clause);
            SubLObject arg2 = third(where_clause);
            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg1)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg2))) {
                return values(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence_two_pfis(operator, arg1, arg2, sk_source, from_expression), NIL);
            } else {
                if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg1)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg2))) {
                    return values(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence_one_pfi(operator, arg1, arg2, sk_source, from_expression), NIL);
                } else {
                    if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_eval_expression_p(arg1)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_eval_expression_p(arg2))) {
                        return values(NIL, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence_eval_exp(operator, arg1, arg2, sk_source, from_expression));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject construct_field_value_sentence(final SubLObject where_clause, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLObject operator = where_clause.first();
        final SubLObject arg1 = second(where_clause);
        final SubLObject arg2 = third(where_clause);
        if ((NIL != csql_field_expression_p(arg1)) && (NIL != csql_field_expression_p(arg2))) {
            return values(construct_field_value_sentence_two_pfis(operator, arg1, arg2, sk_source, from_expression), NIL);
        }
        if ((NIL != csql_field_expression_p(arg1)) || (NIL != csql_field_expression_p(arg2))) {
            return values(construct_field_value_sentence_one_pfi(operator, arg1, arg2, sk_source, from_expression), NIL);
        }
        if ((NIL != csql_eval_expression_p(arg1)) || (NIL != csql_eval_expression_p(arg2))) {
            return values(NIL, construct_field_value_sentence_eval_exp(operator, arg1, arg2, sk_source, from_expression));
        }
        return NIL;
    }

    public static final SubLObject construct_field_value_sentence_two_pfis_alt(SubLObject operator, SubLObject field1, SubLObject field2, SubLObject sk_source, SubLObject from_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject field1_name = second(field1);
                SubLObject table1_name = third(field1);
                SubLObject field2_name = second(field2);
                SubLObject table2_name = third(field2);
                SubLObject pfi1 = NIL;
                SubLObject pfi2 = NIL;
                SubLObject field_indexical_sentence = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        pfi1 = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table1_name, field1_name, from_expression);
                        pfi2 = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table2_name, field2_name, from_expression);
                        field_indexical_sentence = (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_equality_relation_p(operator)) ? ((SubLObject) (make_binary_formula($$fieldIndexicalsEqual, pfi1, pfi2))) : make_ternary_formula($$fieldIndexicalsComparison, pfi1, pfi2, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return field_indexical_sentence;
            }
        }
    }

    public static SubLObject construct_field_value_sentence_two_pfis(final SubLObject operator, final SubLObject field1, final SubLObject field2, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject field1_name = second(field1);
        final SubLObject table1_name = third(field1);
        final SubLObject field2_name = second(field2);
        final SubLObject table2_name = third(field2);
        SubLObject pfi1 = NIL;
        SubLObject pfi2 = NIL;
        SubLObject field_indexical_sentence = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pfi1 = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table1_name, field1_name, from_expression);
            pfi2 = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table2_name, field2_name, from_expression);
            field_indexical_sentence = (NIL != csql_equality_relation_p(operator)) ? make_binary_formula($$fieldIndexicalsEqual, pfi1, pfi2) : make_ternary_formula($$fieldIndexicalsComparison, pfi1, pfi2, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return field_indexical_sentence;
    }

    public static final SubLObject construct_field_value_sentence_one_pfi_alt(SubLObject operator, SubLObject arg1, SubLObject arg2, SubLObject sk_source, SubLObject from_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject field = NIL;
                SubLObject field_name = NIL;
                SubLObject table_name = NIL;
                SubLObject value = NIL;
                SubLObject physical_field_indexical = NIL;
                SubLObject field_value_sentence = NIL;
                SubLObject inverseP = NIL;
                if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg1)) && (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg2))) {
                    field = arg1;
                    value = arg2;
                } else {
                    if ((NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg1)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(arg2))) {
                        field = arg2;
                        value = arg1;
                        inverseP = T;
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            field_name = second(field);
                            table_name = third(field);
                            physical_field_indexical = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table_name, field_name, from_expression);
                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_equality_relation_p(operator)) {
                                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_disjunction_p(value)) {
                                    {
                                        SubLObject disjuncts = NIL;
                                        SubLObject cdolist_list_var = value.rest();
                                        SubLObject each_value = NIL;
                                        for (each_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_value = cdolist_list_var.first()) {
                                            disjuncts = cons(make_binary_formula($$fieldValue, physical_field_indexical, each_value), disjuncts);
                                        }
                                        field_value_sentence = make_disjunction(nreverse(disjuncts));
                                    }
                                } else {
                                    field_value_sentence = make_binary_formula($$fieldValue, physical_field_indexical, value);
                                }
                            } else {
                                if (NIL != inverseP) {
                                    field_value_sentence = make_ternary_formula($$fieldValueComparison_Inverse, physical_field_indexical, value, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
                                } else {
                                    field_value_sentence = make_ternary_formula($$fieldValueComparison, physical_field_indexical, value, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return field_value_sentence;
            }
        }
    }

    public static SubLObject construct_field_value_sentence_one_pfi(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject field = NIL;
        SubLObject field_name = NIL;
        SubLObject table_name = NIL;
        SubLObject value = NIL;
        SubLObject physical_field_indexical = NIL;
        SubLObject field_value_sentence = NIL;
        SubLObject inverseP = NIL;
        if ((NIL != csql_field_expression_p(arg1)) && (NIL == csql_field_expression_p(arg2))) {
            field = arg1;
            value = arg2;
        } else
            if ((NIL == csql_field_expression_p(arg1)) && (NIL != csql_field_expression_p(arg2))) {
                field = arg2;
                value = arg1;
                inverseP = T;
            }

        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            field_name = second(field);
            table_name = third(field);
            physical_field_indexical = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table_name, field_name, from_expression);
            if (NIL != csql_equality_relation_p(operator)) {
                if (NIL != csql_disjunction_p(value)) {
                    SubLObject disjuncts = NIL;
                    SubLObject cdolist_list_var = value.rest();
                    SubLObject each_value = NIL;
                    each_value = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        disjuncts = cons(make_binary_formula($$fieldValue, physical_field_indexical, each_value), disjuncts);
                        cdolist_list_var = cdolist_list_var.rest();
                        each_value = cdolist_list_var.first();
                    } 
                    field_value_sentence = make_disjunction(nreverse(disjuncts));
                } else {
                    field_value_sentence = make_binary_formula($$fieldValue, physical_field_indexical, value);
                }
            } else
                if (NIL != inverseP) {
                    field_value_sentence = make_ternary_formula($$fieldValueComparison_Inverse, physical_field_indexical, value, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
                } else {
                    field_value_sentence = make_ternary_formula($$fieldValueComparison, physical_field_indexical, value, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return field_value_sentence;
    }

    public static final SubLObject construct_field_value_sentence_eval_exp_alt(SubLObject operator, SubLObject arg1, SubLObject arg2, SubLObject sk_source, SubLObject from_expression) {
        {
            SubLObject cycl_operator = ((operator == $$CSQLEquals) && (arg1.isNumber() || arg2.isNumber())) ? ((SubLObject) ($$numericallyEquals)) : sksi_kb_accessors.csql_operator_to_cycl_operator(operator);
            SubLObject arg1_cycl = NIL;
            SubLObject arg2_cycl = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_eval_expression_p(arg1)) {
                arg1_cycl = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence_eval_exp_int(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg1(arg1), sk_source, from_expression);
            } else {
                arg1_cycl = arg1;
            }
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_eval_expression_p(arg2)) {
                arg2_cycl = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence_eval_exp_int(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arg1(arg2), sk_source, from_expression);
            } else {
                arg2_cycl = arg2;
            }
            return make_el_formula(cycl_operator, list(arg1_cycl, arg2_cycl), UNPROVIDED);
        }
    }

    public static SubLObject construct_field_value_sentence_eval_exp(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLObject cycl_operator = (operator.eql($$CSQLEquals) && (arg1.isNumber() || arg2.isNumber())) ? $$numericallyEquals : sksi_kb_accessors.csql_operator_to_cycl_operator(operator);
        SubLObject arg1_cycl = NIL;
        SubLObject arg2_cycl = NIL;
        if (NIL != csql_eval_expression_p(arg1)) {
            arg1_cycl = construct_field_value_sentence_eval_exp_int(csql_expression_arg1(arg1), sk_source, from_expression);
        } else {
            arg1_cycl = arg1;
        }
        if (NIL != csql_eval_expression_p(arg2)) {
            arg2_cycl = construct_field_value_sentence_eval_exp_int(csql_expression_arg1(arg2), sk_source, from_expression);
        } else {
            arg2_cycl = arg2;
        }
        return make_el_formula(cycl_operator, list(arg1_cycl, arg2_cycl), UNPROVIDED);
    }

    public static final SubLObject construct_field_value_sentence_eval_exp_int_alt(SubLObject eval_expression, SubLObject sk_source, SubLObject from_expression) {
        if (eval_expression.isAtom()) {
            return eval_expression;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_expression_p(eval_expression)) {
                return make_el_formula($$FieldValueFn, list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.make_pfi_for_csql_field_expression(eval_expression, sk_source, from_expression)), UNPROVIDED);
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_functional_expression_p(eval_expression)) {
                    {
                        SubLObject operator = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_operator(eval_expression);
                        SubLObject cycl_operator = sksi_kb_accessors.csql_operator_to_cycl_operator(operator);
                        SubLObject args = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_expression_arguments(eval_expression);
                        SubLObject new_args = NIL;
                        SubLObject cdolist_list_var = args;
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            new_args = cons(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.construct_field_value_sentence_eval_exp_int(arg, sk_source, from_expression), new_args);
                        }
                        new_args = nreverse(new_args);
                        return make_el_formula(cycl_operator, new_args, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject construct_field_value_sentence_eval_exp_int(final SubLObject eval_expression, final SubLObject sk_source, final SubLObject from_expression) {
        if (eval_expression.isAtom()) {
            return eval_expression;
        }
        if (NIL != csql_field_expression_p(eval_expression)) {
            return make_el_formula($$FieldValueFn, list(make_pfi_for_csql_field_expression(eval_expression, sk_source, from_expression)), UNPROVIDED);
        }
        if (NIL != csql_functional_expression_p(eval_expression)) {
            final SubLObject operator = csql_expression_operator(eval_expression);
            final SubLObject cycl_operator = sksi_kb_accessors.csql_operator_to_cycl_operator(operator);
            final SubLObject args = csql_expression_arguments(eval_expression);
            SubLObject new_args = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_args = cons(construct_field_value_sentence_eval_exp_int(arg, sk_source, from_expression), new_args);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            new_args = nreverse(new_args);
            return make_el_formula(cycl_operator, new_args, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject invalid_csql_expressionP_alt(SubLObject csql) {
        return makeBoolean((NIL == csql) || (NIL != cycl_utilities.expression_find($UNREFORMULATABLE, csql, NIL, symbol_function(EQ), UNPROVIDED)));
    }

    public static SubLObject invalid_csql_expressionP(final SubLObject csql) {
        return makeBoolean((NIL == csql) || (NIL != cycl_utilities.expression_find($UNREFORMULATABLE, csql, NIL, symbol_function(EQ), UNPROVIDED)));
    }

    public static final SubLObject destructure_csql_select_query_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject select = NIL;
                    SubLObject from = NIL;
                    SubLObject where = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    select = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    from = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    where = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject select_query = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt79);
                            select_query = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                SubLObject select_keyword = $sym80$SELECT_KEYWORD;
                                SubLObject select_fields = $sym81$SELECT_FIELDS;
                                SubLObject from_clause = $sym82$FROM_CLAUSE;
                                SubLObject where_clause = $sym83$WHERE_CLAUSE;
                                return list(CDESTRUCTURING_BIND, list(select_keyword, select_fields, from_clause, $sym85$_OPTIONAL, where_clause), select_query, list(IGNORE, select_keyword), listS(CLET, list(list(select, select_fields), list(from, list(SECOND, from_clause)), list(where, list(SECOND, where_clause))), append(body, NIL)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt79);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_csql_select_query(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject select = NIL;
        SubLObject from = NIL;
        SubLObject where = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        select = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        from = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        where = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject select_query = NIL;
            destructuring_bind_must_consp(current, datum, $list80);
            select_query = current.first();
            final SubLObject body;
            current = body = current.rest();
            final SubLObject select_keyword = $sym81$SELECT_KEYWORD;
            final SubLObject select_fields = $sym82$SELECT_FIELDS;
            final SubLObject from_clause = $sym83$FROM_CLAUSE;
            final SubLObject where_clause = $sym84$WHERE_CLAUSE;
            return list(CDESTRUCTURING_BIND, list(select_keyword, select_fields, from_clause, $sym86$_OPTIONAL, where_clause), select_query, list(IGNORE, select_keyword), listS(CLET, list(list(select, select_fields), list(from, list(SECOND, from_clause)), list(where, list(SECOND, where_clause))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list80);
        return NIL;
    }

    public static final SubLObject declare_sksi_csql_utilities_file_alt() {
        declareFunction("csql_expression_operator", "CSQL-EXPRESSION-OPERATOR", 1, 0, false);
        declareFunction("csql_expression_arguments", "CSQL-EXPRESSION-ARGUMENTS", 1, 0, false);
        declareFunction("csql_expression_arg", "CSQL-EXPRESSION-ARG", 2, 0, false);
        declareFunction("csql_expression_arg1", "CSQL-EXPRESSION-ARG1", 1, 0, false);
        declareFunction("csql_expression_arg2", "CSQL-EXPRESSION-ARG2", 1, 0, false);
        declareFunction("csql_true_p", "CSQL-TRUE-P", 1, 0, false);
        declareFunction("csql_false_p", "CSQL-FALSE-P", 1, 0, false);
        declareFunction("csql_where_clause_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_non_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_anti_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_negated_comparison_operator_p", "CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_boolean_logical_operator_p", "CSQL-WHERE-CLAUSE-BOOLEAN-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_quantifier_logical_operator_p", "CSQL-WHERE-CLAUSE-QUANTIFIER-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_logical_operator_p", "CSQL-WHERE-CLAUSE-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_terminal_operator_p", "CSQL-WHERE-CLAUSE-TERMINAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_commutative_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_operator_p", "CSQL-WHERE-CLAUSE-OPERATOR-P", 1, 0, false);
        declareFunction("csql_operator_p", "CSQL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_from_clause_p", "CSQL-FROM-CLAUSE-P", 1, 0, false);
        declareFunction("csql_where_clause_p", "CSQL-WHERE-CLAUSE-P", 1, 0, false);
        declareFunction("csql_select_query_p", "CSQL-SELECT-QUERY-P", 1, 0, false);
        declareFunction("make_csql_expression", "MAKE-CSQL-EXPRESSION", 2, 0, false);
        declareFunction("make_pfi_for_csql_field_expression", "MAKE-PFI-FOR-CSQL-FIELD-EXPRESSION", 2, 1, false);
        declareFunction("make_csql_field_expression", "MAKE-CSQL-FIELD-EXPRESSION", 2, 1, false);
        declareFunction("csql_field_expression_p", "CSQL-FIELD-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_field_expression_field_name", "CSQL-FIELD-EXPRESSION-FIELD-NAME", 1, 0, false);
        declareFunction("csql_field_expression_table_name", "CSQL-FIELD-EXPRESSION-TABLE-NAME", 1, 0, false);
        declareFunction("csql_table_expression_p", "CSQL-TABLE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_eval_expression_p", "CSQL-EVAL-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_functional_expression_p", "CSQL-FUNCTIONAL-EXPRESSION-P", 1, 0, false);
        declareFunction("boolean_csqlP", "BOOLEAN-CSQL?", 1, 0, false);
        declareFunction("boolean_csql_selectP", "BOOLEAN-CSQL-SELECT?", 1, 0, false);
        declareFunction("csql_where_subclause_with_operator_p", "CSQL-WHERE-SUBCLAUSE-WITH-OPERATOR-P", 2, 0, false);
        declareFunction("csql_disjunction_p", "CSQL-DISJUNCTION-P", 1, 0, false);
        declareFunction("csql_disjunction_disjuncts", "CSQL-DISJUNCTION-DISJUNCTS", 1, 0, false);
        declareFunction("make_csql_implicit_conjunction", "MAKE-CSQL-IMPLICIT-CONJUNCTION", 1, 0, false);
        declareFunction("csql_conjunction_p", "CSQL-CONJUNCTION-P", 1, 0, false);
        declareFunction("csql_explicit_conjunction_p", "CSQL-EXPLICIT-CONJUNCTION-P", 1, 0, false);
        declareFunction("csql_implicit_conjunction_p", "CSQL-IMPLICIT-CONJUNCTION-P", 1, 0, false);
        declareFunction("csql_conjunction_conjuncts", "CSQL-CONJUNCTION-CONJUNCTS", 1, 0, false);
        declareFunction("csql_equality_relation_p", "CSQL-EQUALITY-RELATION-P", 1, 0, false);
        declareFunction("csql_equal_clause_p", "CSQL-EQUAL-CLAUSE-P", 1, 0, false);
        declareFunction("csql_L_clause_p", "CSQL-<-CLAUSE-P", 1, 0, false);
        declareFunction("csql_LE_clause_p", "CSQL-<=-CLAUSE-P", 1, 0, false);
        declareFunction("csql_G_clause_p", "CSQL->-CLAUSE-P", 1, 0, false);
        declareFunction("csql_GE_clause_p", "CSQL->=-CLAUSE-P", 1, 0, false);
        declareFunction("csql_LG_clause_p", "CSQL-<>-CLAUSE-P", 1, 0, false);
        declareFunction("csql_like_clause_p", "CSQL-LIKE-CLAUSE-P", 1, 0, false);
        declareFunction("csql_subword_clause_p", "CSQL-SUBWORD-CLAUSE-P", 1, 0, false);
        declareFunction("csql_substring_clause_p", "CSQL-SUBSTRING-CLAUSE-P", 1, 0, false);
        declareFunction("csql_isubstring_clause_p", "CSQL-ISUBSTRING-CLAUSE-P", 1, 0, false);
        declareFunction("csql_different_clause_p", "CSQL-DIFFERENT-CLAUSE-P", 1, 0, false);
        declareFunction("csql_later_than_clause_p", "CSQL-LATER-THAN-CLAUSE-P", 1, 0, false);
        declareFunction("csql_negation_p", "CSQL-NEGATION-P", 1, 0, false);
        declareFunction("csql_comparison_clause_p", "CSQL-COMPARISON-CLAUSE-P", 1, 0, false);
        declareFunction("csql_where_subclause_p", "CSQL-WHERE-SUBCLAUSE-P", 1, 0, false);
        declareFunction("csql_comparison_or_p", "CSQL-COMPARISON-OR-P", 1, 0, false);
        declareFunction("csql_comparison_and_p", "CSQL-COMPARISON-AND-P", 1, 0, false);
        declareFunction("csql_conjoin_expressions", "CSQL-CONJOIN-EXPRESSIONS", 1, 0, false);
        declareFunction("csql_disjoin_expressions", "CSQL-DISJOIN-EXPRESSIONS", 1, 0, false);
        declareFunction("csql_negate_expression", "CSQL-NEGATE-EXPRESSION", 1, 0, false);
        declareFunction("csql_negate_comparison_relation", "CSQL-NEGATE-COMPARISON-RELATION", 1, 0, false);
        declareFunction("make_csql_query", "MAKE-CSQL-QUERY", 3, 1, false);
        declareFunction("make_csql_query_int", "MAKE-CSQL-QUERY-INT", 3, 0, false);
        declareFunction("make_sparql_csql_query", "MAKE-SPARQL-CSQL-QUERY", 3, 2, false);
        declareFunction("determine_sparql_equivalent_fields_classes", "DETERMINE-SPARQL-EQUIVALENT-FIELDS-CLASSES", 2, 2, false);
        declareFunction("sort_2_csql_fields", "SORT-2-CSQL-FIELDS", 2, 0, false);
        declareFunction("csql_field_L", "CSQL-FIELD-<", 2, 0, false);
        declareFunction("canonicalize_csql", "CANONICALIZE-CSQL", 1, 2, false);
        declareFunction("canonicalize_csql_fields_clause", "CANONICALIZE-CSQL-FIELDS-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_from_clause", "CANONICALIZE-CSQL-FROM-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_tables_clause", "CANONICALIZE-CSQL-TABLES-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_where_clause", "CANONICALIZE-CSQL-WHERE-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_stripped_where_clause", "CANONICALIZE-CSQL-STRIPPED-WHERE-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_where_expression", "CANONICALIZE-CSQL-WHERE-EXPRESSION", 1, 2, false);
        declareFunction("simplify_csql_query", "SIMPLIFY-CSQL-QUERY", 1, 0, false);
        declareFunction("simplify_csql_expressions", "SIMPLIFY-CSQL-EXPRESSIONS", 2, 1, false);
        declareFunction("csql_field_name", "CSQL-FIELD-NAME", 1, 0, false);
        declareFunction("csql_field_table_name", "CSQL-FIELD-TABLE-NAME", 1, 0, false);
        declareFunction("csql_table_name", "CSQL-TABLE-NAME", 1, 0, false);
        declareFunction("csql_table_alias", "CSQL-TABLE-ALIAS", 1, 0, false);
        declareFunction("simplify_csql_expressions_with_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITH-WHERE-CLAUSE", 3, 0, false);
        declareFunction("simplify_csql_expressions_without_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITHOUT-WHERE-CLAUSE", 2, 0, false);
        declareFunction("simplify_where_expressions", "SIMPLIFY-WHERE-EXPRESSIONS", 1, 0, false);
        declareFunction("inconsistent_where_expressionP", "INCONSISTENT-WHERE-EXPRESSION?", 3, 0, false);
        declareFunction("csql_unify_possible", "CSQL-UNIFY-POSSIBLE", 2, 0, false);
        declareFunction("sql_regular_expression_char_p", "SQL-REGULAR-EXPRESSION-CHAR-P", 1, 0, false);
        declareFunction("sql_regular_expression_string_p", "SQL-REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        declareFunction("csql_unify_possible_int", "CSQL-UNIFY-POSSIBLE-INT", 2, 0, false);
        declareFunction("csql_ground_term_p", "CSQL-GROUND-TERM-P", 1, 0, false);
        declareFunction("contract_where_clause", "CONTRACT-WHERE-CLAUSE", 1, 0, false);
        declareFunction("contract_where_expression", "CONTRACT-WHERE-EXPRESSION", 1, 0, false);
        declareFunction("csql_eliminate_unnecessary_joins", "CSQL-ELIMINATE-UNNECESSARY-JOINS", 2, 0, false);
        declareFunction("csql_where_find_joins", "CSQL-WHERE-FIND-JOINS", 1, 0, false);
        declareFunction("csql_where_find_field_map", "CSQL-WHERE-FIND-FIELD-MAP", 1, 0, false);
        declareFunction("csql_where_find_field_map_int", "CSQL-WHERE-FIND-FIELD-MAP-INT", 2, 0, false);
        declareFunction("csql_remove_redundant_select_fields", "CSQL-REMOVE-REDUNDANT-SELECT-FIELDS", 2, 0, false);
        declareFunction("csql_where_clause_field_equals_some_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-SOME-FIELD?", 3, 0, false);
        declareFunction("csql_where_clause_field_equals_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-FIELD?", 3, 0, false);
        declareFunction("csql_where_expression_field_equals_fieldP", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?", 3, 0, false);
        declareFunction("csql_where_expression_field_equals_fieldP_int", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?-INT", 3, 0, false);
        declareFunction("csql_to_el", "CSQL-TO-EL", 2, 1, false);
        declareFunction("csql_to_cycl", "CSQL-TO-CYCL", 2, 1, false);
        declareFunction("csql_to_cycl_int", "CSQL-TO-CYCL-INT", 2, 1, false);
        declareFunction("csql_to_cycl_recursive", "CSQL-TO-CYCL-RECURSIVE", 3, 0, false);
        declareFunction("csql_to_cycl_recursive_2", "CSQL-TO-CYCL-RECURSIVE-2", 3, 0, false);
        declareFunction("construct_field_value_sentence", "CONSTRUCT-FIELD-VALUE-SENTENCE", 3, 0, false);
        declareFunction("construct_field_value_sentence_two_pfis", "CONSTRUCT-FIELD-VALUE-SENTENCE-TWO-PFIS", 5, 0, false);
        declareFunction("construct_field_value_sentence_one_pfi", "CONSTRUCT-FIELD-VALUE-SENTENCE-ONE-PFI", 5, 0, false);
        declareFunction("construct_field_value_sentence_eval_exp", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP", 5, 0, false);
        declareFunction("construct_field_value_sentence_eval_exp_int", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP-INT", 3, 0, false);
        declareFunction("invalid_csql_expressionP", "INVALID-CSQL-EXPRESSION?", 1, 0, false);
        declareMacro("destructure_csql_select_query", "DESTRUCTURE-CSQL-SELECT-QUERY");
        declareFunction("subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("sksi_csql_to_cycl_translation_test_case_p", "SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_sksi_csql_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("csql_expression_operator", "CSQL-EXPRESSION-OPERATOR", 1, 0, false);
            declareFunction("csql_expression_arguments", "CSQL-EXPRESSION-ARGUMENTS", 1, 0, false);
            declareFunction("csql_expression_arg", "CSQL-EXPRESSION-ARG", 2, 0, false);
            declareFunction("csql_expression_arg1", "CSQL-EXPRESSION-ARG1", 1, 0, false);
            declareFunction("csql_expression_arg2", "CSQL-EXPRESSION-ARG2", 1, 0, false);
            declareFunction("csql_expression_arg3", "CSQL-EXPRESSION-ARG3", 1, 0, false);
            declareFunction("csql_true_p", "CSQL-TRUE-P", 1, 0, false);
            declareFunction("csql_false_p", "CSQL-FALSE-P", 1, 0, false);
            declareFunction("csql_where_clause_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_non_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_anti_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_negated_comparison_operator_p", "CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMPARISON-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_boolean_logical_operator_p", "CSQL-WHERE-CLAUSE-BOOLEAN-LOGICAL-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_quantifier_logical_operator_p", "CSQL-WHERE-CLAUSE-QUANTIFIER-LOGICAL-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_logical_operator_p", "CSQL-WHERE-CLAUSE-LOGICAL-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_terminal_operator_p", "CSQL-WHERE-CLAUSE-TERMINAL-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_commutative_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-OPERATOR-P", 1, 0, false);
            declareFunction("csql_where_clause_operator_p", "CSQL-WHERE-CLAUSE-OPERATOR-P", 1, 0, false);
            declareFunction("csql_operator_p", "CSQL-OPERATOR-P", 1, 0, false);
            declareFunction("csql_from_clause_p", "CSQL-FROM-CLAUSE-P", 1, 0, false);
            declareFunction("csql_where_clause_p", "CSQL-WHERE-CLAUSE-P", 1, 0, false);
            declareFunction("csql_select_query_p", "CSQL-SELECT-QUERY-P", 1, 0, false);
            declareFunction("make_csql_expression", "MAKE-CSQL-EXPRESSION", 2, 0, false);
            declareFunction("make_pfi_for_csql_field_expression", "MAKE-PFI-FOR-CSQL-FIELD-EXPRESSION", 2, 1, false);
            declareFunction("csql_field_expression_p", "CSQL-FIELD-EXPRESSION-P", 1, 0, false);
            declareFunction("construct_csql_field_expression", "CONSTRUCT-CSQL-FIELD-EXPRESSION", 3, 0, false);
            declareFunction("csql_field_expression_field_name", "CSQL-FIELD-EXPRESSION-FIELD-NAME", 1, 0, false);
            declareFunction("csql_field_expression_table_name", "CSQL-FIELD-EXPRESSION-TABLE-NAME", 1, 0, false);
            declareFunction("csql_field_expression_namespace", "CSQL-FIELD-EXPRESSION-NAMESPACE", 1, 0, false);
            declareFunction("csql_field_expression_has_namespaceP", "CSQL-FIELD-EXPRESSION-HAS-NAMESPACE?", 1, 0, false);
            declareFunction("make_table_alias", "MAKE-TABLE-ALIAS", 3, 0, false);
            declareFunction("csql_table_expression_p", "CSQL-TABLE-EXPRESSION-P", 1, 0, false);
            declareFunction("csql_table_expression_table_name", "CSQL-TABLE-EXPRESSION-TABLE-NAME", 1, 0, false);
            declareFunction("csql_table_expression_alias", "CSQL-TABLE-EXPRESSION-ALIAS", 1, 0, false);
            declareFunction("csql_table_expression_namespace", "CSQL-TABLE-EXPRESSION-NAMESPACE", 1, 0, false);
            declareFunction("csql_table_expression_has_namespaceP", "CSQL-TABLE-EXPRESSION-HAS-NAMESPACE?", 1, 0, false);
            declareFunction("csql_eval_expression_p", "CSQL-EVAL-EXPRESSION-P", 1, 0, false);
            declareFunction("csql_functional_expression_p", "CSQL-FUNCTIONAL-EXPRESSION-P", 1, 0, false);
            declareFunction("boolean_csqlP", "BOOLEAN-CSQL?", 1, 0, false);
            declareFunction("boolean_csql_selectP", "BOOLEAN-CSQL-SELECT?", 1, 0, false);
            declareFunction("csql_where_subclause_with_operator_p", "CSQL-WHERE-SUBCLAUSE-WITH-OPERATOR-P", 2, 0, false);
            declareFunction("csql_disjunction_p", "CSQL-DISJUNCTION-P", 1, 0, false);
            declareFunction("csql_disjunction_disjuncts", "CSQL-DISJUNCTION-DISJUNCTS", 1, 0, false);
            declareFunction("make_csql_implicit_conjunction", "MAKE-CSQL-IMPLICIT-CONJUNCTION", 1, 0, false);
            declareFunction("csql_conjunction_p", "CSQL-CONJUNCTION-P", 1, 0, false);
            declareFunction("csql_explicit_conjunction_p", "CSQL-EXPLICIT-CONJUNCTION-P", 1, 0, false);
            declareFunction("csql_implicit_conjunction_p", "CSQL-IMPLICIT-CONJUNCTION-P", 1, 0, false);
            declareFunction("csql_conjunction_conjuncts", "CSQL-CONJUNCTION-CONJUNCTS", 1, 0, false);
            declareFunction("csql_equality_relation_p", "CSQL-EQUALITY-RELATION-P", 1, 0, false);
            declareFunction("csql_equal_clause_p", "CSQL-EQUAL-CLAUSE-P", 1, 0, false);
            declareFunction("csql_L_clause_p", "CSQL-<-CLAUSE-P", 1, 0, false);
            declareFunction("csql_LE_clause_p", "CSQL-<=-CLAUSE-P", 1, 0, false);
            declareFunction("csql_G_clause_p", "CSQL->-CLAUSE-P", 1, 0, false);
            declareFunction("csql_GE_clause_p", "CSQL->=-CLAUSE-P", 1, 0, false);
            declareFunction("csql_LG_clause_p", "CSQL-<>-CLAUSE-P", 1, 0, false);
            declareFunction("csql_like_clause_p", "CSQL-LIKE-CLAUSE-P", 1, 0, false);
            declareFunction("csql_subword_clause_p", "CSQL-SUBWORD-CLAUSE-P", 1, 0, false);
            declareFunction("csql_substring_clause_p", "CSQL-SUBSTRING-CLAUSE-P", 1, 0, false);
            declareFunction("csql_isubstring_clause_p", "CSQL-ISUBSTRING-CLAUSE-P", 1, 0, false);
            declareFunction("csql_different_clause_p", "CSQL-DIFFERENT-CLAUSE-P", 1, 0, false);
            declareFunction("csql_later_than_clause_p", "CSQL-LATER-THAN-CLAUSE-P", 1, 0, false);
            declareFunction("csql_negation_p", "CSQL-NEGATION-P", 1, 0, false);
            declareFunction("csql_comparison_clause_p", "CSQL-COMPARISON-CLAUSE-P", 1, 0, false);
            declareFunction("csql_where_subclause_p", "CSQL-WHERE-SUBCLAUSE-P", 1, 0, false);
            declareFunction("csql_comparison_or_p", "CSQL-COMPARISON-OR-P", 1, 0, false);
            declareFunction("csql_comparison_and_p", "CSQL-COMPARISON-AND-P", 1, 0, false);
            declareFunction("csql_conjoin_expressions", "CSQL-CONJOIN-EXPRESSIONS", 1, 0, false);
            declareFunction("csql_disjoin_expressions", "CSQL-DISJOIN-EXPRESSIONS", 1, 0, false);
            declareFunction("csql_negate_expression", "CSQL-NEGATE-EXPRESSION", 1, 0, false);
            declareFunction("csql_negate_comparison_relation", "CSQL-NEGATE-COMPARISON-RELATION", 1, 0, false);
            declareFunction("make_csql_query", "MAKE-CSQL-QUERY", 3, 1, false);
            declareFunction("make_csql_query_int", "MAKE-CSQL-QUERY-INT", 3, 0, false);
            declareFunction("make_sparql_csql_query", "MAKE-SPARQL-CSQL-QUERY", 3, 2, false);
            declareFunction("determine_sparql_equivalent_fields_classes", "DETERMINE-SPARQL-EQUIVALENT-FIELDS-CLASSES", 2, 2, false);
            declareFunction("sort_2_csql_fields", "SORT-2-CSQL-FIELDS", 2, 0, false);
            declareFunction("csql_field_L", "CSQL-FIELD-<", 2, 0, false);
            declareFunction("canonicalize_csql", "CANONICALIZE-CSQL", 1, 2, false);
            declareFunction("canonicalize_csql_fields_clause", "CANONICALIZE-CSQL-FIELDS-CLAUSE", 1, 2, false);
            declareFunction("canonicalize_csql_from_clause", "CANONICALIZE-CSQL-FROM-CLAUSE", 1, 2, false);
            declareFunction("canonicalize_csql_tables_clause", "CANONICALIZE-CSQL-TABLES-CLAUSE", 1, 2, false);
            declareFunction("canonicalize_csql_where_clause", "CANONICALIZE-CSQL-WHERE-CLAUSE", 1, 2, false);
            declareFunction("canonicalize_csql_stripped_where_clause", "CANONICALIZE-CSQL-STRIPPED-WHERE-CLAUSE", 1, 2, false);
            declareFunction("canonicalize_csql_where_expression", "CANONICALIZE-CSQL-WHERE-EXPRESSION", 1, 2, false);
            declareFunction("simplify_csql_query", "SIMPLIFY-CSQL-QUERY", 1, 0, false);
            declareFunction("simplify_csql_expressions", "SIMPLIFY-CSQL-EXPRESSIONS", 2, 1, false);
            declareFunction("csql_field_p", "CSQL-FIELD-P", 1, 0, false);
            declareFunction("csql_field_name", "CSQL-FIELD-NAME", 1, 0, false);
            declareFunction("csql_field_table_name", "CSQL-FIELD-TABLE-NAME", 1, 0, false);
            declareFunction("csql_field_namespace", "CSQL-FIELD-NAMESPACE", 1, 0, false);
            declareFunction("csql_table_name", "CSQL-TABLE-NAME", 1, 0, false);
            declareFunction("csql_table_alias", "CSQL-TABLE-ALIAS", 1, 0, false);
            declareFunction("simplify_csql_expressions_with_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITH-WHERE-CLAUSE", 3, 0, false);
            declareFunction("simplify_csql_expressions_without_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITHOUT-WHERE-CLAUSE", 2, 0, false);
            declareFunction("simplify_where_expressions", "SIMPLIFY-WHERE-EXPRESSIONS", 1, 0, false);
            declareFunction("inconsistent_where_expressionP", "INCONSISTENT-WHERE-EXPRESSION?", 3, 0, false);
            declareFunction("csql_unify_possible", "CSQL-UNIFY-POSSIBLE", 2, 0, false);
            declareFunction("sql_regular_expression_char_p", "SQL-REGULAR-EXPRESSION-CHAR-P", 1, 0, false);
            declareFunction("sql_regular_expression_string_p", "SQL-REGULAR-EXPRESSION-STRING-P", 1, 0, false);
            declareFunction("csql_unify_possible_int", "CSQL-UNIFY-POSSIBLE-INT", 2, 0, false);
            declareFunction("csql_ground_term_p", "CSQL-GROUND-TERM-P", 1, 0, false);
            declareFunction("contract_where_clause", "CONTRACT-WHERE-CLAUSE", 1, 0, false);
            declareFunction("contract_where_expression", "CONTRACT-WHERE-EXPRESSION", 1, 0, false);
            declareFunction("csql_eliminate_unnecessary_joins", "CSQL-ELIMINATE-UNNECESSARY-JOINS", 2, 0, false);
            declareFunction("csql_where_find_joins", "CSQL-WHERE-FIND-JOINS", 1, 0, false);
            declareFunction("csql_where_find_field_map", "CSQL-WHERE-FIND-FIELD-MAP", 1, 0, false);
            declareFunction("csql_where_find_field_map_int", "CSQL-WHERE-FIND-FIELD-MAP-INT", 2, 0, false);
            declareFunction("csql_remove_redundant_select_fields", "CSQL-REMOVE-REDUNDANT-SELECT-FIELDS", 2, 0, false);
            declareFunction("csql_where_clause_field_equals_some_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-SOME-FIELD?", 3, 0, false);
            declareFunction("csql_where_clause_field_equals_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-FIELD?", 3, 0, false);
            declareFunction("csql_where_expression_field_equals_fieldP", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?", 3, 0, false);
            declareFunction("csql_where_expression_field_equals_fieldP_int", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?-INT", 3, 0, false);
            declareFunction("csql_to_el", "CSQL-TO-EL", 2, 1, false);
            declareFunction("csql_to_cycl", "CSQL-TO-CYCL", 2, 1, false);
            declareFunction("csql_to_cycl_int", "CSQL-TO-CYCL-INT", 2, 1, false);
            declareFunction("csql_to_cycl_recursive", "CSQL-TO-CYCL-RECURSIVE", 3, 0, false);
            declareFunction("csql_to_cycl_recursive_2", "CSQL-TO-CYCL-RECURSIVE-2", 3, 0, false);
            declareFunction("construct_field_value_sentence", "CONSTRUCT-FIELD-VALUE-SENTENCE", 3, 0, false);
            declareFunction("construct_field_value_sentence_two_pfis", "CONSTRUCT-FIELD-VALUE-SENTENCE-TWO-PFIS", 5, 0, false);
            declareFunction("construct_field_value_sentence_one_pfi", "CONSTRUCT-FIELD-VALUE-SENTENCE-ONE-PFI", 5, 0, false);
            declareFunction("construct_field_value_sentence_eval_exp", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP", 5, 0, false);
            declareFunction("construct_field_value_sentence_eval_exp_int", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP-INT", 3, 0, false);
            declareFunction("invalid_csql_expressionP", "INVALID-CSQL-EXPRESSION?", 1, 0, false);
            declareMacro("destructure_csql_select_query", "DESTRUCTURE-CSQL-SELECT-QUERY");
        }
        if (SubLFiles.USE_V2) {
            declareFunction("make_csql_field_expression", "MAKE-CSQL-FIELD-EXPRESSION", 2, 1, false);
            declareFunction("subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("sksi_csql_to_cycl_translation_test_case_p", "SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_csql_utilities_file_Previous() {
        declareFunction("csql_expression_operator", "CSQL-EXPRESSION-OPERATOR", 1, 0, false);
        declareFunction("csql_expression_arguments", "CSQL-EXPRESSION-ARGUMENTS", 1, 0, false);
        declareFunction("csql_expression_arg", "CSQL-EXPRESSION-ARG", 2, 0, false);
        declareFunction("csql_expression_arg1", "CSQL-EXPRESSION-ARG1", 1, 0, false);
        declareFunction("csql_expression_arg2", "CSQL-EXPRESSION-ARG2", 1, 0, false);
        declareFunction("csql_expression_arg3", "CSQL-EXPRESSION-ARG3", 1, 0, false);
        declareFunction("csql_true_p", "CSQL-TRUE-P", 1, 0, false);
        declareFunction("csql_false_p", "CSQL-FALSE-P", 1, 0, false);
        declareFunction("csql_where_clause_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_non_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_anti_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_negated_comparison_operator_p", "CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMPARISON-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_boolean_logical_operator_p", "CSQL-WHERE-CLAUSE-BOOLEAN-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_quantifier_logical_operator_p", "CSQL-WHERE-CLAUSE-QUANTIFIER-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_logical_operator_p", "CSQL-WHERE-CLAUSE-LOGICAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_terminal_operator_p", "CSQL-WHERE-CLAUSE-TERMINAL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_commutative_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-OPERATOR-P", 1, 0, false);
        declareFunction("csql_where_clause_operator_p", "CSQL-WHERE-CLAUSE-OPERATOR-P", 1, 0, false);
        declareFunction("csql_operator_p", "CSQL-OPERATOR-P", 1, 0, false);
        declareFunction("csql_from_clause_p", "CSQL-FROM-CLAUSE-P", 1, 0, false);
        declareFunction("csql_where_clause_p", "CSQL-WHERE-CLAUSE-P", 1, 0, false);
        declareFunction("csql_select_query_p", "CSQL-SELECT-QUERY-P", 1, 0, false);
        declareFunction("make_csql_expression", "MAKE-CSQL-EXPRESSION", 2, 0, false);
        declareFunction("make_pfi_for_csql_field_expression", "MAKE-PFI-FOR-CSQL-FIELD-EXPRESSION", 2, 1, false);
        declareFunction("csql_field_expression_p", "CSQL-FIELD-EXPRESSION-P", 1, 0, false);
        declareFunction("construct_csql_field_expression", "CONSTRUCT-CSQL-FIELD-EXPRESSION", 3, 0, false);
        declareFunction("csql_field_expression_field_name", "CSQL-FIELD-EXPRESSION-FIELD-NAME", 1, 0, false);
        declareFunction("csql_field_expression_table_name", "CSQL-FIELD-EXPRESSION-TABLE-NAME", 1, 0, false);
        declareFunction("csql_field_expression_namespace", "CSQL-FIELD-EXPRESSION-NAMESPACE", 1, 0, false);
        declareFunction("csql_field_expression_has_namespaceP", "CSQL-FIELD-EXPRESSION-HAS-NAMESPACE?", 1, 0, false);
        declareFunction("make_table_alias", "MAKE-TABLE-ALIAS", 3, 0, false);
        declareFunction("csql_table_expression_p", "CSQL-TABLE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_table_expression_table_name", "CSQL-TABLE-EXPRESSION-TABLE-NAME", 1, 0, false);
        declareFunction("csql_table_expression_alias", "CSQL-TABLE-EXPRESSION-ALIAS", 1, 0, false);
        declareFunction("csql_table_expression_namespace", "CSQL-TABLE-EXPRESSION-NAMESPACE", 1, 0, false);
        declareFunction("csql_table_expression_has_namespaceP", "CSQL-TABLE-EXPRESSION-HAS-NAMESPACE?", 1, 0, false);
        declareFunction("csql_eval_expression_p", "CSQL-EVAL-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_functional_expression_p", "CSQL-FUNCTIONAL-EXPRESSION-P", 1, 0, false);
        declareFunction("boolean_csqlP", "BOOLEAN-CSQL?", 1, 0, false);
        declareFunction("boolean_csql_selectP", "BOOLEAN-CSQL-SELECT?", 1, 0, false);
        declareFunction("csql_where_subclause_with_operator_p", "CSQL-WHERE-SUBCLAUSE-WITH-OPERATOR-P", 2, 0, false);
        declareFunction("csql_disjunction_p", "CSQL-DISJUNCTION-P", 1, 0, false);
        declareFunction("csql_disjunction_disjuncts", "CSQL-DISJUNCTION-DISJUNCTS", 1, 0, false);
        declareFunction("make_csql_implicit_conjunction", "MAKE-CSQL-IMPLICIT-CONJUNCTION", 1, 0, false);
        declareFunction("csql_conjunction_p", "CSQL-CONJUNCTION-P", 1, 0, false);
        declareFunction("csql_explicit_conjunction_p", "CSQL-EXPLICIT-CONJUNCTION-P", 1, 0, false);
        declareFunction("csql_implicit_conjunction_p", "CSQL-IMPLICIT-CONJUNCTION-P", 1, 0, false);
        declareFunction("csql_conjunction_conjuncts", "CSQL-CONJUNCTION-CONJUNCTS", 1, 0, false);
        declareFunction("csql_equality_relation_p", "CSQL-EQUALITY-RELATION-P", 1, 0, false);
        declareFunction("csql_equal_clause_p", "CSQL-EQUAL-CLAUSE-P", 1, 0, false);
        declareFunction("csql_L_clause_p", "CSQL-<-CLAUSE-P", 1, 0, false);
        declareFunction("csql_LE_clause_p", "CSQL-<=-CLAUSE-P", 1, 0, false);
        declareFunction("csql_G_clause_p", "CSQL->-CLAUSE-P", 1, 0, false);
        declareFunction("csql_GE_clause_p", "CSQL->=-CLAUSE-P", 1, 0, false);
        declareFunction("csql_LG_clause_p", "CSQL-<>-CLAUSE-P", 1, 0, false);
        declareFunction("csql_like_clause_p", "CSQL-LIKE-CLAUSE-P", 1, 0, false);
        declareFunction("csql_subword_clause_p", "CSQL-SUBWORD-CLAUSE-P", 1, 0, false);
        declareFunction("csql_substring_clause_p", "CSQL-SUBSTRING-CLAUSE-P", 1, 0, false);
        declareFunction("csql_isubstring_clause_p", "CSQL-ISUBSTRING-CLAUSE-P", 1, 0, false);
        declareFunction("csql_different_clause_p", "CSQL-DIFFERENT-CLAUSE-P", 1, 0, false);
        declareFunction("csql_later_than_clause_p", "CSQL-LATER-THAN-CLAUSE-P", 1, 0, false);
        declareFunction("csql_negation_p", "CSQL-NEGATION-P", 1, 0, false);
        declareFunction("csql_comparison_clause_p", "CSQL-COMPARISON-CLAUSE-P", 1, 0, false);
        declareFunction("csql_where_subclause_p", "CSQL-WHERE-SUBCLAUSE-P", 1, 0, false);
        declareFunction("csql_comparison_or_p", "CSQL-COMPARISON-OR-P", 1, 0, false);
        declareFunction("csql_comparison_and_p", "CSQL-COMPARISON-AND-P", 1, 0, false);
        declareFunction("csql_conjoin_expressions", "CSQL-CONJOIN-EXPRESSIONS", 1, 0, false);
        declareFunction("csql_disjoin_expressions", "CSQL-DISJOIN-EXPRESSIONS", 1, 0, false);
        declareFunction("csql_negate_expression", "CSQL-NEGATE-EXPRESSION", 1, 0, false);
        declareFunction("csql_negate_comparison_relation", "CSQL-NEGATE-COMPARISON-RELATION", 1, 0, false);
        declareFunction("make_csql_query", "MAKE-CSQL-QUERY", 3, 1, false);
        declareFunction("make_csql_query_int", "MAKE-CSQL-QUERY-INT", 3, 0, false);
        declareFunction("make_sparql_csql_query", "MAKE-SPARQL-CSQL-QUERY", 3, 2, false);
        declareFunction("determine_sparql_equivalent_fields_classes", "DETERMINE-SPARQL-EQUIVALENT-FIELDS-CLASSES", 2, 2, false);
        declareFunction("sort_2_csql_fields", "SORT-2-CSQL-FIELDS", 2, 0, false);
        declareFunction("csql_field_L", "CSQL-FIELD-<", 2, 0, false);
        declareFunction("canonicalize_csql", "CANONICALIZE-CSQL", 1, 2, false);
        declareFunction("canonicalize_csql_fields_clause", "CANONICALIZE-CSQL-FIELDS-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_from_clause", "CANONICALIZE-CSQL-FROM-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_tables_clause", "CANONICALIZE-CSQL-TABLES-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_where_clause", "CANONICALIZE-CSQL-WHERE-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_stripped_where_clause", "CANONICALIZE-CSQL-STRIPPED-WHERE-CLAUSE", 1, 2, false);
        declareFunction("canonicalize_csql_where_expression", "CANONICALIZE-CSQL-WHERE-EXPRESSION", 1, 2, false);
        declareFunction("simplify_csql_query", "SIMPLIFY-CSQL-QUERY", 1, 0, false);
        declareFunction("simplify_csql_expressions", "SIMPLIFY-CSQL-EXPRESSIONS", 2, 1, false);
        declareFunction("csql_field_p", "CSQL-FIELD-P", 1, 0, false);
        declareFunction("csql_field_name", "CSQL-FIELD-NAME", 1, 0, false);
        declareFunction("csql_field_table_name", "CSQL-FIELD-TABLE-NAME", 1, 0, false);
        declareFunction("csql_field_namespace", "CSQL-FIELD-NAMESPACE", 1, 0, false);
        declareFunction("csql_table_name", "CSQL-TABLE-NAME", 1, 0, false);
        declareFunction("csql_table_alias", "CSQL-TABLE-ALIAS", 1, 0, false);
        declareFunction("simplify_csql_expressions_with_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITH-WHERE-CLAUSE", 3, 0, false);
        declareFunction("simplify_csql_expressions_without_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITHOUT-WHERE-CLAUSE", 2, 0, false);
        declareFunction("simplify_where_expressions", "SIMPLIFY-WHERE-EXPRESSIONS", 1, 0, false);
        declareFunction("inconsistent_where_expressionP", "INCONSISTENT-WHERE-EXPRESSION?", 3, 0, false);
        declareFunction("csql_unify_possible", "CSQL-UNIFY-POSSIBLE", 2, 0, false);
        declareFunction("sql_regular_expression_char_p", "SQL-REGULAR-EXPRESSION-CHAR-P", 1, 0, false);
        declareFunction("sql_regular_expression_string_p", "SQL-REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        declareFunction("csql_unify_possible_int", "CSQL-UNIFY-POSSIBLE-INT", 2, 0, false);
        declareFunction("csql_ground_term_p", "CSQL-GROUND-TERM-P", 1, 0, false);
        declareFunction("contract_where_clause", "CONTRACT-WHERE-CLAUSE", 1, 0, false);
        declareFunction("contract_where_expression", "CONTRACT-WHERE-EXPRESSION", 1, 0, false);
        declareFunction("csql_eliminate_unnecessary_joins", "CSQL-ELIMINATE-UNNECESSARY-JOINS", 2, 0, false);
        declareFunction("csql_where_find_joins", "CSQL-WHERE-FIND-JOINS", 1, 0, false);
        declareFunction("csql_where_find_field_map", "CSQL-WHERE-FIND-FIELD-MAP", 1, 0, false);
        declareFunction("csql_where_find_field_map_int", "CSQL-WHERE-FIND-FIELD-MAP-INT", 2, 0, false);
        declareFunction("csql_remove_redundant_select_fields", "CSQL-REMOVE-REDUNDANT-SELECT-FIELDS", 2, 0, false);
        declareFunction("csql_where_clause_field_equals_some_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-SOME-FIELD?", 3, 0, false);
        declareFunction("csql_where_clause_field_equals_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-FIELD?", 3, 0, false);
        declareFunction("csql_where_expression_field_equals_fieldP", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?", 3, 0, false);
        declareFunction("csql_where_expression_field_equals_fieldP_int", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?-INT", 3, 0, false);
        declareFunction("csql_to_el", "CSQL-TO-EL", 2, 1, false);
        declareFunction("csql_to_cycl", "CSQL-TO-CYCL", 2, 1, false);
        declareFunction("csql_to_cycl_int", "CSQL-TO-CYCL-INT", 2, 1, false);
        declareFunction("csql_to_cycl_recursive", "CSQL-TO-CYCL-RECURSIVE", 3, 0, false);
        declareFunction("csql_to_cycl_recursive_2", "CSQL-TO-CYCL-RECURSIVE-2", 3, 0, false);
        declareFunction("construct_field_value_sentence", "CONSTRUCT-FIELD-VALUE-SENTENCE", 3, 0, false);
        declareFunction("construct_field_value_sentence_two_pfis", "CONSTRUCT-FIELD-VALUE-SENTENCE-TWO-PFIS", 5, 0, false);
        declareFunction("construct_field_value_sentence_one_pfi", "CONSTRUCT-FIELD-VALUE-SENTENCE-ONE-PFI", 5, 0, false);
        declareFunction("construct_field_value_sentence_eval_exp", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP", 5, 0, false);
        declareFunction("construct_field_value_sentence_eval_exp_int", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP-INT", 3, 0, false);
        declareFunction("invalid_csql_expressionP", "INVALID-CSQL-EXPRESSION?", 1, 0, false);
        declareMacro("destructure_csql_select_query", "DESTRUCTURE-CSQL-SELECT-QUERY");
        return NIL;
    }

    public static final SubLObject init_sksi_csql_utilities_file_alt() {
        deflexical("*CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATORS*", $list_alt0);
        deflexical("*CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATORS*", $list_alt1);
        deflexical("*CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATORS*", $list_alt2);
        deflexical("*CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATORS*", $list_alt3);
        deflexical("*CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATORS*", $list_alt3);
        deflexical("*CSQL-WHERE-CLAUSE-COMPARISON-OPERATORS*", append($csql_where_clause_commutative_comparison_operators$.getGlobalValue(), $csql_where_clause_non_commutative_comparison_operators$.getGlobalValue()));
        deflexical("*CSQL-WHERE-CLAUSE-TERMINAL-OPERATORS*", $list_alt4);
        deflexical("*CSQL-OTHER-OPERATORS*", $list_alt5);
        deflexical("*CSQL-TRUE*", T);
        deflexical("*CSQL-FALSE*", NIL);
        deflexical("*CSQL-COMPARISON-RELATION-NEGATIONS*", $list_alt34);
        defconstant("*SQL-REGULAR-EXPRESSION-META-CHARACTERS*", $str_alt65$__);
        return NIL;
    }

    public static SubLObject init_sksi_csql_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATORS*", $list0);
            deflexical("*CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATORS*", $list1);
            deflexical("*CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATORS*", $list2);
            deflexical("*CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATORS*", $list3);
            deflexical("*CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATORS*", $list3);
            deflexical("*CSQL-WHERE-CLAUSE-COMPARISON-OPERATORS*", append($csql_where_clause_commutative_comparison_operators$.getGlobalValue(), $csql_where_clause_non_commutative_comparison_operators$.getGlobalValue()));
            deflexical("*CSQL-WHERE-CLAUSE-TERMINAL-OPERATORS*", $list4);
            deflexical("*CSQL-OTHER-OPERATORS*", $list5);
            deflexical("*CSQL-TRUE*", T);
            deflexical("*CSQL-FALSE*", NIL);
            deflexical("*CSQL-COMPARISON-RELATION-NEGATIONS*", $list35);
            defconstant("*SQL-REGULAR-EXPRESSION-META-CHARACTERS*", $str66$__);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CSQL-COMPARISON-RELATION-NEGATIONS*", $list_alt34);
            defconstant("*SQL-REGULAR-EXPRESSION-META-CHARACTERS*", $str_alt65$__);
        }
        return NIL;
    }

    public static SubLObject init_sksi_csql_utilities_file_Previous() {
        deflexical("*CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATORS*", $list0);
        deflexical("*CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATORS*", $list1);
        deflexical("*CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATORS*", $list2);
        deflexical("*CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATORS*", $list3);
        deflexical("*CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATORS*", $list3);
        deflexical("*CSQL-WHERE-CLAUSE-COMPARISON-OPERATORS*", append($csql_where_clause_commutative_comparison_operators$.getGlobalValue(), $csql_where_clause_non_commutative_comparison_operators$.getGlobalValue()));
        deflexical("*CSQL-WHERE-CLAUSE-TERMINAL-OPERATORS*", $list4);
        deflexical("*CSQL-OTHER-OPERATORS*", $list5);
        deflexical("*CSQL-TRUE*", T);
        deflexical("*CSQL-FALSE*", NIL);
        deflexical("*CSQL-COMPARISON-RELATION-NEGATIONS*", $list35);
        defconstant("*SQL-REGULAR-EXPRESSION-META-CHARACTERS*", $str66$__);
        return NIL;
    }

    public static final SubLObject setup_sksi_csql_utilities_file_alt() {
        sunit_external.define_test_category($$$SKSI_CSQL_Utilities_Category, list($$$SKSI_Category));
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE);
        classes.subloop_new_class(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt93);
        classes.class_set_implements_slot_listeners(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, $sym102$SUBLOOP_RESERVED_INITIALIZE_SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CA);
        classes.subloop_note_instance_initialization_function(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, $sym107$SUBLOOP_RESERVED_INITIALIZE_SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CA);
        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_class(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE);
        sunit_macros.define_test_case_postamble(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, $str_alt108$sksi_csql_utilities, $$$cycl, $list_alt110);
        sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_SIMPLE_TRANSLATION);
        sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_DISJUNCTIVE_VALUE);
        sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_CONJUNCTION_OF_DISJUNCTION);
        sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_ALIAS_TRANSLATION);
        return NIL;
    }

    public static SubLObject setup_sksi_csql_utilities_file() {
        if (SubLFiles.USE_V1) {
            sunit_external.define_test_category($$$SKSI_CSQL_Utilities_Category, list($$$SKSI_Category));
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE);
            classes.subloop_new_class(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt93);
            classes.class_set_implements_slot_listeners(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, $sym102$SUBLOOP_RESERVED_INITIALIZE_SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CA);
            classes.subloop_note_instance_initialization_function(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, $sym107$SUBLOOP_RESERVED_INITIALIZE_SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CA);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.subloop_reserved_initialize_sksi_csql_to_cycl_translation_test_case_class(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE);
            sunit_macros.define_test_case_postamble(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, $str_alt108$sksi_csql_utilities, $$$cycl, $list_alt110);
            sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_SIMPLE_TRANSLATION);
            sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_DISJUNCTIVE_VALUE);
            sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_CONJUNCTION_OF_DISJUNCTION);
            sunit_macros.def_test_method_register(SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE, SKSI_TRANSLATE_CSQL_TO_CYCL_ALIAS_TRANSLATION);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_csql_utilities_file_Previous() {
        sunit_external.define_test_category($$$SKSI_CSQL_Utilities_Category, list($$$SKSI_Category));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_csql_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_csql_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_csql_utilities_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLNotEqual"), reader_make_constant_shell("CSQLTimesFn"), reader_make_constant_shell("CSQLPlusFn"));

    static private final SubLList $list_alt1 = list(new SubLObject[]{ reader_make_constant_shell("CSQLGreaterThan"), reader_make_constant_shell("CSQLLessThan"), reader_make_constant_shell("CSQLGreaterThanOrEqualTo"), reader_make_constant_shell("CSQLLessThanOrEqualTo"), reader_make_constant_shell("CSQLDifferenceFn"), reader_make_constant_shell("CSQLQuotientFn"), makeKeyword("IN"), makeKeyword("BETWEEN"), reader_make_constant_shell("CSQLLike"), reader_make_constant_shell("CSQLUnlike"), reader_make_constant_shell("CSQLLike-CaseInsensitive"), reader_make_constant_shell("CSQLSubstring"), reader_make_constant_shell("CSQLStringSubword"), reader_make_constant_shell("CSQLSubstring-CaseInsensitive") });

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLEquals"), reader_make_constant_shell("CSQLLike"), reader_make_constant_shell("CSQLLike-CaseInsensitive"), reader_make_constant_shell("CSQLSubstring"), reader_make_constant_shell("CSQLSubstring-CaseInsensitive"));

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("CSQLNotEqual"), reader_make_constant_shell("CSQLUnlike"), reader_make_constant_shell("CSQLDifferent"));

    static private final SubLList $list_alt4 = list(makeKeyword("FIELD"), makeKeyword("VALUES"), makeKeyword("VALUE"), $LIST, makeKeyword("KEY"), makeKeyword("KEY-VALUE"));

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SELECT"), makeKeyword("INSERT"), makeKeyword("DELETE"), $FROM, $INTO, makeKeyword("WHERE"), makeKeyword("FIELD"), makeKeyword("TABLE"), makeKeyword("KEY"), makeKeyword("KEY-VALUE"), makeKeyword("COUNT"), makeKeyword("ALL") });

    static private final SubLList $list_alt10 = list(makeKeyword("FIELD"), makeKeyword("KEY"), makeKeyword("KEY-VALUE"));

    static private final SubLList $list_alt13 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("TABLES"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    static private final SubLList $list_alt14 = list(makeKeyword("COUNT"), makeKeyword("ALL"));

    static private final SubLList $list_alt18 = list(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLEquals"));

    static private final SubLList $list_alt32 = list(reader_make_constant_shell("CSQLOr"), reader_make_constant_shell("TheList"));

    static private final SubLList $list_alt34 = list(cons(reader_make_constant_shell("CSQLStrictlyEquals"), reader_make_constant_shell("CSQLNotEqual")), cons(reader_make_constant_shell("CSQLNotEqual"), reader_make_constant_shell("CSQLStrictlyEquals")), cons(reader_make_constant_shell("CSQLGreaterThan"), reader_make_constant_shell("CSQLLessThanOrEqualTo")), cons(reader_make_constant_shell("CSQLLessThanOrEqualTo"), reader_make_constant_shell("CSQLGreaterThan")), cons(reader_make_constant_shell("CSQLLessThan"), reader_make_constant_shell("CSQLGreaterThanOrEqualTo")), cons(reader_make_constant_shell("CSQLGreaterThanOrEqualTo"), reader_make_constant_shell("CSQLLessThan")), cons(reader_make_constant_shell("CSQLEquals"), reader_make_constant_shell("CSQLDifferent")), cons(reader_make_constant_shell("CSQLDifferent"), reader_make_constant_shell("CSQLEquals")));

    static private final SubLList $list_alt36 = list(makeSymbol("TABLE-SHORT-NAME"), makeSymbol("TABLE-NAME"));

    static private final SubLList $list_alt40 = list(makeSymbol("FIELD-KEYWORD"), makeSymbol("EXPRESSION1"), makeSymbol("&OPTIONAL"), makeSymbol("EXPRESSION2"));

    static private final SubLList $list_alt42 = list(makeSymbol("FIELD-KEYWORD-2"), makeSymbol("EXPRESSION1-2"), makeSymbol("&OPTIONAL"), makeSymbol("EXPRESSION2-2"));

    static private final SubLList $list_alt44 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("UNKNOWN-SENTENCE-SELECT"), makeSymbol("UNKNOWN-SENTENCE-FROM"), makeSymbol("UNKNOWN-SENTENCE-WHERE"));

    static private final SubLList $list_alt45 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("UNKNOWN-SENTENCE-FIELDS"), makeSymbol("UNKNOWN-SENTENCE-TABLES"), makeSymbol("UNKNOWN-SENTENCE-WHERE"));

    static private final SubLSymbol $sym48$CSQL_FIELD__ = makeSymbol("CSQL-FIELD-<");

    static private final SubLString $str_alt50$_VAR = makeString("?VAR");

    static private final SubLString $str_alt53$Could_not_correctly_order_compari = makeString("Could not correctly order comparison literals in SPARQL SKSI query, they will be stuck at the end");

    static private final SubLList $list_alt55 = list(makeSymbol("KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    static private final SubLList $list_alt56 = list(makeSymbol("KEYWORD"), makeSymbol("TABLES"));

    static private final SubLList $list_alt57 = list(makeSymbol("KEYWORD"), makeSymbol("WHERE-CLAUSE"));

    static private final SubLList $list_alt58 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    static private final SubLString $str_alt59$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");

    static private final SubLList $list_alt60 = list(makeSymbol("FROM-KEYWORD"), makeSymbol("TABLES"));

    static private final SubLString $str_alt61$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :from");

    static private final SubLList $list_alt62 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-CLAUSE"));

    static private final SubLString $str_alt63$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :where");

    static private final SubLString $str_alt65$__ = makeString("_%");

    static private final SubLList $list_alt68 = list(makeSymbol("LEFT"), makeSymbol("RIGHT"));

    static private final SubLList $list_alt70 = list(makeSymbol("SOURCE-CLAIMS-CYCL"));

    static private final SubLList $list_alt79 = list(list(makeSymbol("SELECT"), makeSymbol("FROM"), makeSymbol("WHERE")), makeSymbol("SELECT-QUERY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym80$SELECT_KEYWORD = makeUninternedSymbol("SELECT-KEYWORD");

    static private final SubLSymbol $sym81$SELECT_FIELDS = makeUninternedSymbol("SELECT-FIELDS");

    static private final SubLSymbol $sym82$FROM_CLAUSE = makeUninternedSymbol("FROM-CLAUSE");

    static private final SubLSymbol $sym83$WHERE_CLAUSE = makeUninternedSymbol("WHERE-CLAUSE");

    static private final SubLSymbol $sym85$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLSymbol SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CASE = makeSymbol("SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE");

    static private final SubLList $list_alt93 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-SIMPLE-TRANSLATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-DISJUNCTIVE-VALUE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-CONJUNCTION-OF-DISJUNCTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-ALIAS-TRANSLATION"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym102$SUBLOOP_RESERVED_INITIALIZE_SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-CLASS");

    static private final SubLSymbol $sym107$SUBLOOP_RESERVED_INITIALIZE_SKSI_CSQL_TO_CYCL_TRANSLATION_TEST_CA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SKSI-CSQL-TO-CYCL-TRANSLATION-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt108$sksi_csql_utilities = makeString("sksi-csql-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt110 = list(makeString("SKSI CSQL Utilities Category"));

    private static final SubLSymbol SKSI_TRANSLATE_CSQL_TO_CYCL_SIMPLE_TRANSLATION = makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-SIMPLE-TRANSLATION");

    private static final SubLSymbol SKSI_TRANSLATE_CSQL_TO_CYCL_DISJUNCTIVE_VALUE = makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-DISJUNCTIVE-VALUE");

    private static final SubLSymbol SKSI_TRANSLATE_CSQL_TO_CYCL_CONJUNCTION_OF_DISJUNCTION = makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-CONJUNCTION-OF-DISJUNCTION");

    private static final SubLSymbol SKSI_TRANSLATE_CSQL_TO_CYCL_ALIAS_TRANSLATION = makeSymbol("SKSI-TRANSLATE-CSQL-TO-CYCL-ALIAS-TRANSLATION");
}

/**
 * Total time: 744 ms synthetic
 */
