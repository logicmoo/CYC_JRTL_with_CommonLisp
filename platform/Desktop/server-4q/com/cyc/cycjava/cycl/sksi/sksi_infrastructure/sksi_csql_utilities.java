package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_csql_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities";
    public static final String myFingerPrint = "e354e949bc74d02718f5f20dcc63514453d87026fcd3346ba3d948007bbe8111";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2805L)
    private static SubLSymbol $csql_where_clause_commutative_comparison_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 3139L)
    private static SubLSymbol $csql_where_clause_non_commutative_comparison_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 3501L)
    private static SubLSymbol $csql_where_clause_reflexive_comparison_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 3723L)
    private static SubLSymbol $csql_where_clause_anti_reflexive_comparison_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 3852L)
    private static SubLSymbol $csql_where_clause_negated_comparison_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 3975L)
    private static SubLSymbol $csql_where_clause_comparison_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4175L)
    private static SubLSymbol $csql_where_clause_terminal_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4294L)
    private static SubLSymbol $csql_other_operators$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4455L)
    public static SubLSymbol $csql_true$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4493L)
    public static SubLSymbol $csql_false$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 14336L)
    private static SubLSymbol $csql_comparison_relation_negations$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 42407L)
    private static SubLSymbol $sql_regular_expression_meta_characters$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$FROM;
    private static final SubLSymbol $kw7$WHERE;
    private static final SubLSymbol $kw8$SELECT;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$FIELD;
    private static final SubLSymbol $kw11$TABLE_ALIAS;
    private static final SubLSymbol $kw12$TABLE;
    private static final SubLSymbol $kw13$EVAL;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLObject $const16$CSQLOr;
    private static final SubLObject $const17$CSQLAnd;
    private static final SubLSymbol $sym18$CSQL_WHERE_SUBCLAUSE_P;
    private static final SubLList $list19;
    private static final SubLObject $const20$CSQLLessThan;
    private static final SubLObject $const21$CSQLLessThanOrEqualTo;
    private static final SubLObject $const22$CSQLGreaterThan;
    private static final SubLObject $const23$CSQLGreaterThanOrEqualTo;
    private static final SubLObject $const24$CSQLNotEqual;
    private static final SubLObject $const25$CSQLLike;
    private static final SubLObject $const26$CSQLStringSubword;
    private static final SubLObject $const27$CSQLSubstring;
    private static final SubLObject $const28$CSQLSubstring_CaseInsensitive;
    private static final SubLObject $const29$CSQLDifferent;
    private static final SubLObject $const30$CSQLLaterThan;
    private static final SubLObject $const31$CSQLNot;
    private static final SubLSymbol $kw32$NOT_NULL;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$LISTP;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$DICTIONARY_P;
    private static final SubLList $list37;
    private static final SubLString $str38$subject;
    private static final SubLString $str39$predicate;
    private static final SubLString $str40$object;
    private static final SubLList $list41;
    private static final SubLObject $const42$CSQLEquals;
    private static final SubLList $list43;
    private static final SubLObject $const44$CSQLExists;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$UNKNOWN_SENTENCE;
    private static final SubLSymbol $kw48$EXISTENTIAL_VARIABLES;
    private static final SubLSymbol $sym49$CSQL_FIELD__;
    private static final SubLSymbol $kw50$LITERAL;
    private static final SubLString $str51$_VAR;
    private static final SubLSymbol $sym52$CSQL_COMPARISON_PREDICATE_P;
    private static final SubLSymbol $sym53$LITERAL_PREDICATE;
    private static final SubLString $str54$Could_not_correctly_order_compari;
    private static final SubLSymbol $kw55$VARIABLES;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLString $str60$malformed_csql_expression__a__exp;
    private static final SubLList $list61;
    private static final SubLString $str62$malformed_csql_expression__a__exp;
    private static final SubLList $list63;
    private static final SubLString $str64$malformed_csql_expression__a__exp;
    private static final SubLSymbol $sym65$CSQL_FIELD_TABLE_NAME;
    private static final SubLString $str66$__;
    private static final SubLSymbol $sym67$SQL_REGULAR_EXPRESSION_CHAR_P;
    private static final SubLObject $const68$CSQLStrictlyEquals;
    private static final SubLList $list69;
    private static final SubLObject $const70$CSQLUnlike;
    private static final SubLList $list71;
    private static final SubLObject $const72$fieldIndexicalsEqual;
    private static final SubLObject $const73$fieldIndexicalsComparison;
    private static final SubLObject $const74$fieldValue;
    private static final SubLObject $const75$fieldValueComparison_Inverse;
    private static final SubLObject $const76$fieldValueComparison;
    private static final SubLObject $const77$numericallyEquals;
    private static final SubLObject $const78$FieldValueFn;
    private static final SubLSymbol $kw79$UNREFORMULATABLE;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$SELECT_KEYWORD;
    private static final SubLSymbol $sym82$SELECT_FIELDS;
    private static final SubLSymbol $sym83$FROM_CLAUSE;
    private static final SubLSymbol $sym84$WHERE_CLAUSE;
    private static final SubLSymbol $sym85$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym86$_OPTIONAL;
    private static final SubLSymbol $sym87$IGNORE;
    private static final SubLSymbol $sym88$CLET;
    private static final SubLSymbol $sym89$SECOND;
    private static final SubLString $str90$SKSI_CSQL_Utilities_Category;
    private static final SubLString $str91$SKSI_Category;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2158L)
    public static SubLObject csql_expression_operator(final SubLObject csql) {
        return csql.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2423L)
    public static SubLObject csql_expression_arguments(final SubLObject csql) {
        return csql.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2492L)
    public static SubLObject csql_expression_arg(final SubLObject csql, final SubLObject n) {
        return ConsesLow.nth(n, csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2559L)
    public static SubLObject csql_expression_arg1(final SubLObject csql) {
        return csql_expression_arg(csql, (SubLObject)sksi_csql_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2641L)
    public static SubLObject csql_expression_arg2(final SubLObject csql) {
        return csql_expression_arg(csql, (SubLObject)sksi_csql_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 2723L)
    public static SubLObject csql_expression_arg3(final SubLObject csql) {
        return csql_expression_arg(csql, (SubLObject)sksi_csql_utilities.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4533L)
    public static SubLObject csql_true_p(final SubLObject expression) {
        return Equality.eq(sksi_csql_utilities.$csql_true$.getGlobalValue(), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4615L)
    public static SubLObject csql_false_p(final SubLObject expression) {
        return Equality.eq(sksi_csql_utilities.$csql_false$.getGlobalValue(), expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4698L)
    public static SubLObject csql_where_clause_commutative_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_commutative_comparison_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 4858L)
    public static SubLObject csql_where_clause_non_commutative_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_non_commutative_comparison_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5025L)
    public static SubLObject csql_where_clause_reflexive_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_reflexive_comparison_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5180L)
    public static SubLObject csql_where_clause_anti_reflexive_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_anti_reflexive_comparison_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5345L)
    public static SubLObject csql_where_clause_negated_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_negated_comparison_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5496L)
    public static SubLObject csql_where_clause_comparison_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_comparison_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5631L)
    public static SubLObject csql_where_clause_boolean_logical_operator_p(final SubLObject v_object) {
        return fort_types_interface.csql_logical_connective_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5745L)
    public static SubLObject csql_where_clause_quantifier_logical_operator_p(final SubLObject v_object) {
        return fort_types_interface.csql_quantifier_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 5854L)
    public static SubLObject csql_where_clause_logical_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL != fort_types_interface.csql_logical_connective_p(v_object) || sksi_csql_utilities.NIL != fort_types_interface.csql_quantifier_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 6005L)
    public static SubLObject csql_where_clause_terminal_operator_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_where_clause_terminal_operators$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 6136L)
    public static SubLObject csql_where_clause_commutative_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL != csql_where_clause_commutative_comparison_operator_p(v_object) || sksi_csql_utilities.NIL != csql_where_clause_boolean_logical_operator_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 6344L)
    public static SubLObject csql_where_clause_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL != csql_where_clause_comparison_operator_p(v_object) || sksi_csql_utilities.NIL != csql_where_clause_logical_operator_p(v_object) || sksi_csql_utilities.NIL != csql_where_clause_terminal_operator_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 6579L)
    public static SubLObject csql_operator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL != list_utilities.member_eqP(v_object, sksi_csql_utilities.$csql_other_operators$.getGlobalValue()) || sksi_csql_utilities.NIL != csql_where_clause_operator_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 6729L)
    public static SubLObject csql_from_clause_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && sksi_csql_utilities.$kw6$FROM == csql_expression_operator(csql) && sksi_csql_utilities.NIL != list_utilities.lengthE(csql, (SubLObject)sksi_csql_utilities.TWO_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 6886L)
    public static SubLObject csql_where_clause_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && sksi_csql_utilities.$kw7$WHERE == csql_expression_operator(csql) && sksi_csql_utilities.NIL != list_utilities.lengthE(csql, (SubLObject)sksi_csql_utilities.TWO_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 7045L)
    public static SubLObject csql_select_query_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && sksi_csql_utilities.$kw8$SELECT == csql_expression_operator(csql));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 7175L)
    public static SubLObject make_csql_expression(final SubLObject operator, final SubLObject args) {
        return (SubLObject)ConsesLow.cons(operator, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 7261L)
    public static SubLObject make_pfi_for_csql_field_expression(final SubLObject field_exp, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == sksi_csql_utilities.UNPROVIDED) {
            from_expression = (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLObject field_name = csql_field_expression_field_name(field_exp);
        final SubLObject table_name = csql_field_expression_table_name(field_exp);
        final SubLObject sks_name = sksi_kb_accessors.sk_source_name(sk_source);
        SubLObject pfi = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(sks_name, field_name, from_expression);
        SubLObject table_alias = (SubLObject)sksi_csql_utilities.NIL;
        if (!table_name.equal(sks_name)) {
            table_alias = string_utilities.string_to_integer(sksi_query_datastructures.table_alias_alias_suffix(table_name, sks_name));
            if (table_alias.isInteger()) {
                pfi = sksi_kb_accessors.pfi_alias_naut_for_pfi_and_alias_index(pfi, table_alias);
            }
        }
        return pfi;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 7933L)
    public static SubLObject csql_field_expression_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && sksi_csql_utilities.NIL != list_utilities.member_eqP(csql_expression_operator(csql), (SubLObject)sksi_csql_utilities.$list9));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8093L)
    public static SubLObject construct_csql_field_expression(final SubLObject field_name, final SubLObject table_name, final SubLObject table_namespace) {
        return (SubLObject)((sksi_csql_utilities.NIL != table_namespace) ? ConsesLow.list((SubLObject)sksi_csql_utilities.$kw10$FIELD, field_name, table_name, table_namespace) : ConsesLow.list((SubLObject)sksi_csql_utilities.$kw10$FIELD, field_name, table_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8307L)
    public static SubLObject csql_field_expression_field_name(final SubLObject csql) {
        return csql_expression_arg1(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8400L)
    public static SubLObject csql_field_expression_table_name(final SubLObject csql) {
        return csql_expression_arg2(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8493L)
    public static SubLObject csql_field_expression_namespace(final SubLObject csql) {
        return csql_expression_arg3(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8585L)
    public static SubLObject csql_field_expression_has_namespaceP(final SubLObject csql) {
        return list_utilities.lengthGE(csql, (SubLObject)sksi_csql_utilities.FOUR_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8672L)
    public static SubLObject make_table_alias(final SubLObject table_name, final SubLObject alias, final SubLObject namespace) {
        return (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw11$TABLE_ALIAS, table_name, alias, namespace);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8793L)
    public static SubLObject csql_table_expression_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && csql_expression_operator(csql) == sksi_csql_utilities.$kw12$TABLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 8926L)
    public static SubLObject csql_table_expression_table_name(final SubLObject csql) {
        return csql_expression_arg1(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9019L)
    public static SubLObject csql_table_expression_alias(final SubLObject csql) {
        return csql_expression_arg2(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9107L)
    public static SubLObject csql_table_expression_namespace(final SubLObject csql) {
        return csql_expression_arg3(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9199L)
    public static SubLObject csql_table_expression_has_namespaceP(final SubLObject csql) {
        return list_utilities.lengthGE(csql, (SubLObject)sksi_csql_utilities.FOUR_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9286L)
    public static SubLObject csql_eval_expression_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && csql_expression_operator(csql) == sksi_csql_utilities.$kw13$EVAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9417L)
    public static SubLObject csql_functional_expression_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && sksi_csql_utilities.NIL != fort_types_interface.csql_function_p(csql_expression_operator(csql)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9561L)
    public static SubLObject boolean_csqlP(final SubLObject csql) {
        SubLObject select_keyword = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject tables = (SubLObject)sksi_csql_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_csql_utilities.$list14);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_utilities.$list14);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_utilities.$list14);
        tables = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_utilities.$list14);
        current = current.rest();
        final SubLObject orderby = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_utilities.$list14);
        current = current.rest();
        if (sksi_csql_utilities.NIL == current) {
            return boolean_csql_selectP(fields);
        }
        cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_csql_utilities.$list14);
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9772L)
    public static SubLObject boolean_csql_selectP(final SubLObject select) {
        return Equality.equal(select, (SubLObject)sksi_csql_utilities.$list15);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 9860L)
    public static SubLObject csql_where_subclause_with_operator_p(final SubLObject csql, final SubLObject operator) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isCons() && csql_expression_operator(csql).eql(operator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10021L)
    public static SubLObject csql_disjunction_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const16$CSQLOr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10128L)
    public static SubLObject csql_disjunction_disjuncts(final SubLObject csql) {
        return csql.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10202L)
    public static SubLObject make_csql_implicit_conjunction(final SubLObject csql) {
        return (SubLObject)ConsesLow.list(csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10280L)
    public static SubLObject csql_conjunction_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL != csql_explicit_conjunction_p(csql) || sksi_csql_utilities.NIL != csql_implicit_conjunction_p(csql));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10515L)
    public static SubLObject csql_explicit_conjunction_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const17$CSQLAnd);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10632L)
    public static SubLObject csql_implicit_conjunction_p(final SubLObject csql) {
        return list_utilities.list_of_type_p((SubLObject)sksi_csql_utilities.$sym18$CSQL_WHERE_SUBCLAUSE_P, csql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10741L)
    public static SubLObject csql_conjunction_conjuncts(final SubLObject csql) {
        if (sksi_csql_utilities.NIL != csql_explicit_conjunction_p(csql)) {
            return csql.rest();
        }
        if (sksi_csql_utilities.NIL != csql_implicit_conjunction_p(csql)) {
            return csql;
        }
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 10923L)
    public static SubLObject csql_equality_relation_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)sksi_csql_utilities.$list19);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11043L)
    public static SubLObject csql_equal_clause_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isCons() && sksi_csql_utilities.NIL != csql_equality_relation_p(csql_expression_operator(csql)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11190L)
    public static SubLObject csql_L_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const20$CSQLLessThan);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11301L)
    public static SubLObject csql_LE_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const21$CSQLLessThanOrEqualTo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11421L)
    public static SubLObject csql_G_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const22$CSQLGreaterThan);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11534L)
    public static SubLObject csql_GE_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const23$CSQLGreaterThanOrEqualTo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11657L)
    public static SubLObject csql_LG_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const24$CSQLNotEqual);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11768L)
    public static SubLObject csql_like_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const25$CSQLLike);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11877L)
    public static SubLObject csql_subword_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const26$CSQLStringSubword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 11998L)
    public static SubLObject csql_substring_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const27$CSQLSubstring);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 12117L)
    public static SubLObject csql_isubstring_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const28$CSQLSubstring_CaseInsensitive);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 12253L)
    public static SubLObject csql_different_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const29$CSQLDifferent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 12372L)
    public static SubLObject csql_later_than_clause_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const30$CSQLLaterThan);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 12492L)
    public static SubLObject csql_negation_p(final SubLObject csql) {
        return csql_where_subclause_with_operator_p(csql, sksi_csql_utilities.$const31$CSQLNot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 12598L)
    public static SubLObject csql_comparison_clause_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isCons() && (sksi_csql_utilities.NIL != fort_types_interface.csql_comparison_predicate_p(csql_expression_operator(csql)) || csql_expression_operator(csql) == sksi_csql_utilities.$kw32$NOT_NULL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 12834L)
    public static SubLObject csql_where_subclause_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL != csql_explicit_conjunction_p(csql) || sksi_csql_utilities.NIL != csql_comparison_clause_p(csql) || sksi_csql_utilities.NIL != csql_negation_p(csql));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 13090L)
    public static SubLObject csql_comparison_or_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && sksi_csql_utilities.NIL != list_utilities.member_eqP(csql_expression_operator(csql), (SubLObject)sksi_csql_utilities.$list33));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 13246L)
    public static SubLObject csql_comparison_and_p(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(csql.isList() && csql_expression_operator(csql).eql(sksi_csql_utilities.$const17$CSQLAnd));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 13383L)
    public static SubLObject csql_conjoin_expressions(final SubLObject expressions) {
        assert sksi_csql_utilities.NIL != Types.listp(expressions) : expressions;
        final SubLObject pcase_var = Sequences.length(expressions);
        if (pcase_var.eql((SubLObject)sksi_csql_utilities.ZERO_INTEGER)) {
            return sksi_csql_utilities.$csql_true$.getGlobalValue();
        }
        if (pcase_var.eql((SubLObject)sksi_csql_utilities.ONE_INTEGER)) {
            return expressions.first();
        }
        return make_csql_expression(sksi_csql_utilities.$const17$CSQLAnd, expressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 13838L)
    public static SubLObject csql_disjoin_expressions(final SubLObject expressions) {
        assert sksi_csql_utilities.NIL != Types.listp(expressions) : expressions;
        final SubLObject pcase_var = Sequences.length(expressions);
        if (pcase_var.eql((SubLObject)sksi_csql_utilities.ZERO_INTEGER)) {
            return sksi_csql_utilities.$csql_false$.getGlobalValue();
        }
        if (pcase_var.eql((SubLObject)sksi_csql_utilities.ONE_INTEGER)) {
            return expressions.first();
        }
        return make_csql_expression(sksi_csql_utilities.$const16$CSQLOr, expressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 14098L)
    public static SubLObject csql_negate_expression(final SubLObject expression) {
        if (sksi_csql_utilities.NIL != csql_true_p(expression)) {
            return sksi_csql_utilities.$csql_false$.getGlobalValue();
        }
        if (sksi_csql_utilities.NIL != csql_false_p(expression)) {
            return sksi_csql_utilities.$csql_true$.getGlobalValue();
        }
        return (SubLObject)ConsesLow.list(sksi_csql_utilities.$const31$CSQLNot, expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 14912L)
    public static SubLObject csql_negate_comparison_relation(final SubLObject relation) {
        return conses_high.assoc(relation, sksi_csql_utilities.$csql_comparison_relation_negations$.getGlobalValue(), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 15040L)
    public static SubLObject make_csql_query(final SubLObject select, final SubLObject from, final SubLObject where, SubLObject canonicalizeP) {
        if (canonicalizeP == sksi_csql_utilities.UNPROVIDED) {
            canonicalizeP = (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLObject csql = make_csql_query_int(select, from, where);
        if (sksi_csql_utilities.NIL != canonicalizeP) {
            return canonicalize_csql(csql, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        }
        return csql;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 15691L)
    public static SubLObject make_csql_query_int(final SubLObject select, final SubLObject from, final SubLObject where) {
        final SubLObject where_exp = contract_where_clause(where);
        SubLObject select_exp = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject from_exp = (SubLObject)sksi_csql_utilities.NIL;
        if (select.isInteger()) {
            select_exp = select;
        }
        else if (select.isCons()) {
            SubLObject cdolist_list_var = select;
            SubLObject each_select = (SubLObject)sksi_csql_utilities.NIL;
            each_select = cdolist_list_var.first();
            while (sksi_csql_utilities.NIL != cdolist_list_var) {
                assert sksi_csql_utilities.NIL != Types.listp(each_select) : each_select;
                final SubLObject pcase_var = csql_expression_operator(each_select);
                if (pcase_var.eql((SubLObject)sksi_csql_utilities.$kw10$FIELD)) {
                    select_exp = (SubLObject)ConsesLow.cons(each_select, select_exp);
                }
                else if (pcase_var.eql((SubLObject)sksi_csql_utilities.$kw13$EVAL)) {
                    select_exp = (SubLObject)ConsesLow.cons(each_select, select_exp);
                }
                else {
                    select_exp = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)sksi_csql_utilities.$kw10$FIELD, each_select), select_exp);
                }
                cdolist_list_var = cdolist_list_var.rest();
                each_select = cdolist_list_var.first();
            }
            select_exp = Sequences.nreverse(select_exp);
        }
        else if (sksi_csql_utilities.NIL == select) {
            select_exp = (SubLObject)sksi_csql_utilities.$list15;
        }
        SubLObject cdolist_list_var = from;
        SubLObject each_from = (SubLObject)sksi_csql_utilities.NIL;
        each_from = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            if (sksi_csql_utilities.$kw12$TABLE == csql_expression_operator(each_from)) {
                final SubLObject alias = conses_high.third(each_from);
                if (sksi_csql_utilities.NIL != list_utilities.tree_find(alias, select, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED) || sksi_csql_utilities.NIL != list_utilities.tree_find(alias, where, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                    from_exp = (SubLObject)ConsesLow.cons(each_from, from_exp);
                }
            }
            else {
                final SubLObject alias = conses_high.second(each_from);
                if (sksi_csql_utilities.NIL != list_utilities.tree_find(alias, select, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED) || sksi_csql_utilities.NIL != list_utilities.tree_find(alias, where, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                    from_exp = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)sksi_csql_utilities.$kw12$TABLE, each_from), from_exp);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            each_from = cdolist_list_var.first();
        }
        if (sksi_csql_utilities.NIL != where_exp) {
            return (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw8$SELECT, select_exp, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw6$FROM, from_exp), (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw7$WHERE, where_exp));
        }
        return (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw8$SELECT, select_exp, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw6$FROM, from_exp));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 17048L)
    public static SubLObject make_sparql_csql_query(final SubLObject select, final SubLObject from, final SubLObject where, SubLObject equivalent_field_map, SubLObject comparison_literal_reorderings) {
        if (equivalent_field_map == sksi_csql_utilities.UNPROVIDED) {
            equivalent_field_map = (SubLObject)sksi_csql_utilities.NIL;
        }
        if (comparison_literal_reorderings == sksi_csql_utilities.UNPROVIDED) {
            comparison_literal_reorderings = (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_csql_utilities.NIL != equivalent_field_map && !sksi_csql_utilities.assertionsDisabledInClass && sksi_csql_utilities.NIL == dictionary.dictionary_p(equivalent_field_map)) {
            throw new AssertionError(equivalent_field_map);
        }
        final SubLObject where_exp = contract_where_clause(where);
        SubLObject select_fields = select;
        SubLObject all_fields = conses_high.copy_list(select_fields);
        final SubLObject perform_final_variable_substitutionP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == equivalent_field_map);
        SubLObject existential_scope_fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject all_csql_equals = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject triples = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject literals = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject unknown_sentence_literals = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL == equivalent_field_map) {
            equivalent_field_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(select_fields));
        }
        SubLObject cdolist_list_var = from;
        SubLObject table = (SubLObject)sksi_csql_utilities.NIL;
        table = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = table;
            SubLObject table_short_name = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject table_name = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list37);
            table_short_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list37);
            table_name = current.first();
            current = current.rest();
            final SubLObject namespace = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_csql_utilities.$list37);
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw10$FIELD, (SubLObject)sksi_csql_utilities.$str38$subject, table_name), (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw10$FIELD, (SubLObject)sksi_csql_utilities.$str39$predicate, table_name), (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw10$FIELD, (SubLObject)sksi_csql_utilities.$str40$object, table_name)), triples);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list37);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        SubLObject comparison_literals = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject cdolist_list_var2 = where_exp;
        SubLObject where_expression = (SubLObject)sksi_csql_utilities.NIL;
        where_expression = cdolist_list_var2.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = where_expression;
            SubLObject field_keyword = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject expression1 = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_csql_utilities.$list41);
            field_keyword = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_csql_utilities.$list41);
            expression1 = current2.first();
            current2 = current2.rest();
            final SubLObject expression2 = (SubLObject)(current2.isCons() ? current2.first() : sksi_csql_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current2, datum2, (SubLObject)sksi_csql_utilities.$list41);
            current2 = current2.rest();
            if (sksi_csql_utilities.NIL == current2) {
                if (!sksi_csql_utilities.$const42$CSQLEquals.eql(field_keyword) && !sksi_csql_utilities.$const31$CSQLNot.eql(field_keyword)) {
                    comparison_literals = (SubLObject)ConsesLow.cons(where_expression, comparison_literals);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_csql_utilities.$list41);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            where_expression = cdolist_list_var2.first();
        }
        literals = ConsesLow.append(literals, comparison_literals);
        cdolist_list_var = where_exp;
        SubLObject where_expression2 = (SubLObject)sksi_csql_utilities.NIL;
        where_expression2 = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression2;
            SubLObject field_keyword2 = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject expression3 = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            field_keyword2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            expression3 = current.first();
            current = current.rest();
            final SubLObject expression4 = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (sksi_csql_utilities.$const42$CSQLEquals.eql(field_keyword2) && sksi_csql_utilities.NIL != csql_field_p(expression3) && sksi_csql_utilities.NIL != csql_field_p(expression4)) {
                    all_csql_equals = (SubLObject)ConsesLow.cons(where_expression2, all_csql_equals);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression2 = cdolist_list_var.first();
        }
        cdolist_list_var = where_exp;
        where_expression2 = (SubLObject)sksi_csql_utilities.NIL;
        where_expression2 = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression2;
            SubLObject field_keyword2 = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject expression3 = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            field_keyword2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            expression3 = current.first();
            current = current.rest();
            final SubLObject expression4 = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (sksi_csql_utilities.$const31$CSQLNot.eql(field_keyword2)) {
                    SubLObject current_$2;
                    final SubLObject datum_$1 = current_$2 = expression3;
                    SubLObject field_keyword_2 = (SubLObject)sksi_csql_utilities.NIL;
                    SubLObject expression1_2 = (SubLObject)sksi_csql_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)sksi_csql_utilities.$list43);
                    field_keyword_2 = current_$2.first();
                    current_$2 = current_$2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)sksi_csql_utilities.$list43);
                    expression1_2 = current_$2.first();
                    current_$2 = current_$2.rest();
                    final SubLObject expression2_2 = (SubLObject)(current_$2.isCons() ? current_$2.first() : sksi_csql_utilities.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$2, datum_$1, (SubLObject)sksi_csql_utilities.$list43);
                    current_$2 = current_$2.rest();
                    if (sksi_csql_utilities.NIL == current_$2) {
                        if (sksi_csql_utilities.$const44$CSQLExists.eql(field_keyword_2)) {
                            SubLObject current_$3;
                            final SubLObject datum_$2 = current_$3 = expression1_2;
                            SubLObject select_keyword = (SubLObject)sksi_csql_utilities.NIL;
                            SubLObject unknown_sentence_select = (SubLObject)sksi_csql_utilities.NIL;
                            SubLObject unknown_sentence_from = (SubLObject)sksi_csql_utilities.NIL;
                            SubLObject unknown_sentence_where = (SubLObject)sksi_csql_utilities.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)sksi_csql_utilities.$list45);
                            select_keyword = current_$3.first();
                            current_$3 = current_$3.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)sksi_csql_utilities.$list45);
                            unknown_sentence_select = current_$3.first();
                            current_$3 = current_$3.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)sksi_csql_utilities.$list45);
                            unknown_sentence_from = current_$3.first();
                            current_$3 = current_$3.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)sksi_csql_utilities.$list45);
                            unknown_sentence_where = current_$3.first();
                            current_$3 = current_$3.rest();
                            if (sksi_csql_utilities.NIL == current_$3) {
                                unknown_sentence_from = unknown_sentence_from.rest().first();
                                unknown_sentence_where = unknown_sentence_where.rest().first();
                                final SubLObject unknown_sentence_equivalent_field_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(select_fields));
                                SubLObject unknown_sentence_from_2 = (SubLObject)sksi_csql_utilities.NIL;
                                SubLObject cdolist_list_var_$5 = unknown_sentence_from;
                                SubLObject unknown_sentence_from_table = (SubLObject)sksi_csql_utilities.NIL;
                                unknown_sentence_from_table = cdolist_list_var_$5.first();
                                while (sksi_csql_utilities.NIL != cdolist_list_var_$5) {
                                    unknown_sentence_from_2 = (SubLObject)ConsesLow.cons(unknown_sentence_from_table.rest(), unknown_sentence_from_2);
                                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                    unknown_sentence_from_table = cdolist_list_var_$5.first();
                                }
                                unknown_sentence_from_2 = Sequences.nreverse(unknown_sentence_from_2);
                                thread.resetMultipleValues();
                                final SubLObject unknown_sentence_csql = make_sparql_csql_query(unknown_sentence_select, unknown_sentence_from_2, unknown_sentence_where, unknown_sentence_equivalent_field_map, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                                final SubLObject unknown_sentence_equivalent_field_map_$6 = thread.secondMultipleValue();
                                final SubLObject unknown_sentence_field_index_map = thread.thirdMultipleValue();
                                final SubLObject unknown_sentence_existential_scope_fields = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(unknown_sentence_equivalent_field_map_$6)); sksi_csql_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject canon_field = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    dictionary.dictionary_enter(equivalent_field_map, field, canon_field);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                SubLObject current_$4;
                                final SubLObject datum_$3 = current_$4 = unknown_sentence_csql;
                                SubLObject select_keyword_$9 = (SubLObject)sksi_csql_utilities.NIL;
                                SubLObject unknown_sentence_fields = (SubLObject)sksi_csql_utilities.NIL;
                                SubLObject unknown_sentence_tables = (SubLObject)sksi_csql_utilities.NIL;
                                SubLObject unknown_sentence_where_$10 = (SubLObject)sksi_csql_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)sksi_csql_utilities.$list46);
                                select_keyword_$9 = current_$4.first();
                                current_$4 = current_$4.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)sksi_csql_utilities.$list46);
                                unknown_sentence_fields = current_$4.first();
                                current_$4 = current_$4.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)sksi_csql_utilities.$list46);
                                unknown_sentence_tables = current_$4.first();
                                current_$4 = current_$4.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)sksi_csql_utilities.$list46);
                                unknown_sentence_where_$10 = current_$4.first();
                                current_$4 = current_$4.rest();
                                if (sksi_csql_utilities.NIL == current_$4) {
                                    final SubLObject unknown_sentence_variables = unknown_sentence_fields.rest();
                                    final SubLObject unknown_sentence_where_exp = conses_high.getf(unknown_sentence_where_$10, (SubLObject)sksi_csql_utilities.$kw7$WHERE, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                                    unknown_sentence_literals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw47$UNKNOWN_SENTENCE, reader.bq_cons((SubLObject)sksi_csql_utilities.$kw48$EXISTENTIAL_VARIABLES, ConsesLow.append(unknown_sentence_existential_scope_fields, (SubLObject)sksi_csql_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw7$WHERE, unknown_sentence_where_exp)), unknown_sentence_literals);
                                    SubLObject cdolist_list_var_$6 = unknown_sentence_variables;
                                    SubLObject unknown_sentence_variable = (SubLObject)sksi_csql_utilities.NIL;
                                    unknown_sentence_variable = cdolist_list_var_$6.first();
                                    while (sksi_csql_utilities.NIL != cdolist_list_var_$6) {
                                        final SubLObject item_var = unknown_sentence_variable;
                                        if (sksi_csql_utilities.NIL == conses_high.member(item_var, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                                            all_fields = (SubLObject)ConsesLow.cons(item_var, all_fields);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        unknown_sentence_variable = cdolist_list_var_$6.first();
                                    }
                                    SubLObject cdolist_list_var_$7 = unknown_sentence_existential_scope_fields;
                                    SubLObject unknown_sentence_existential_scope_field = (SubLObject)sksi_csql_utilities.NIL;
                                    unknown_sentence_existential_scope_field = cdolist_list_var_$7.first();
                                    while (sksi_csql_utilities.NIL != cdolist_list_var_$7) {
                                        SubLObject item_var = unknown_sentence_existential_scope_field;
                                        if (sksi_csql_utilities.NIL == conses_high.member(item_var, existential_scope_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                                            existential_scope_fields = (SubLObject)ConsesLow.cons(item_var, existential_scope_fields);
                                        }
                                        item_var = unknown_sentence_existential_scope_field;
                                        if (sksi_csql_utilities.NIL == conses_high.member(item_var, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                                            all_fields = (SubLObject)ConsesLow.cons(item_var, all_fields);
                                        }
                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                        unknown_sentence_existential_scope_field = cdolist_list_var_$7.first();
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)sksi_csql_utilities.$list46);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$2, (SubLObject)sksi_csql_utilities.$list45);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)sksi_csql_utilities.$list43);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression2 = cdolist_list_var.first();
        }
        cdolist_list_var = where_exp;
        where_expression2 = (SubLObject)sksi_csql_utilities.NIL;
        where_expression2 = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression2;
            SubLObject field_keyword2 = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject expression3 = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            field_keyword2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            expression3 = current.first();
            current = current.rest();
            final SubLObject expression4 = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (sksi_csql_utilities.$const42$CSQLEquals.eql(field_keyword2) && (sksi_csql_utilities.NIL == csql_field_p(expression3) || sksi_csql_utilities.NIL == csql_field_p(expression4))) {
                    triples = list_utilities.tree_substitute(triples, expression3, expression4);
                    select_fields = list_utilities.tree_substitute(select_fields, expression3, expression4);
                    all_fields = list_utilities.tree_substitute(all_fields, expression3, expression4);
                    literals = list_utilities.tree_substitute(literals, expression3, expression4);
                    unknown_sentence_literals = list_utilities.tree_substitute(unknown_sentence_literals, expression3, expression4);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list41);
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
        select_fields = Sort.sort(Sequences.remove_duplicates(select_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_csql_utilities.$sym49$CSQL_FIELD__), (SubLObject)sksi_csql_utilities.UNPROVIDED);
        all_fields = list_utilities.remove_duplicates_from_end(all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        all_fields = ConsesLow.append(select_fields, Sort.sort(conses_high.set_difference(all_fields, select_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED));
        SubLObject v_variables = select_fields;
        cdolist_list_var2 = triples;
        SubLObject triple = (SubLObject)sksi_csql_utilities.NIL;
        triple = cdolist_list_var2.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var2) {
            literals = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw50$LITERAL, (SubLObject)ConsesLow.list(conses_high.second(triple), triple.first(), conses_high.third(triple))), literals);
            cdolist_list_var2 = cdolist_list_var2.rest();
            triple = cdolist_list_var2.first();
        }
        final SubLObject field_index_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(all_fields));
        if (sksi_csql_utilities.NIL != perform_final_variable_substitutionP) {
            SubLObject list_var = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject field2 = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject field_index = (SubLObject)sksi_csql_utilities.NIL;
            list_var = all_fields;
            field2 = list_var.first();
            for (field_index = (SubLObject)sksi_csql_utilities.ZERO_INTEGER; sksi_csql_utilities.NIL != list_var; list_var = list_var.rest(), field2 = list_var.first(), field_index = Numbers.add((SubLObject)sksi_csql_utilities.ONE_INTEGER, field_index)) {
                final SubLObject variable_name = Sequences.cconcatenate((SubLObject)sksi_csql_utilities.$str51$_VAR, format_nil.format_nil_a(field_index));
                final SubLObject variable = Packages.intern(variable_name, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                dictionary.dictionary_enter(field_index_map, field2, field_index);
                v_variables = Sequences.substitute(variable, field2, v_variables, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                literals = list_utilities.tree_substitute(literals, field2, variable);
                unknown_sentence_literals = list_utilities.tree_substitute(unknown_sentence_literals, field2, variable);
            }
        }
        literals = list_utilities.remove_duplicates_from_end(literals, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        if (sksi_csql_utilities.NIL != comparison_literal_reorderings) {
            final SubLObject literal_count_verify = comparison_literal_reorderings.first();
            final SubLObject comparison_literal_index_list = comparison_literal_reorderings.rest();
            if (Sequences.length(literals).eql(literal_count_verify) && sksi_csql_utilities.NIL != list_utilities.every_in_list((SubLObject)sksi_csql_utilities.$sym52$CSQL_COMPARISON_PREDICATE_P, conses_high.last(literals, Sequences.length(comparison_literal_index_list)), (SubLObject)sksi_csql_utilities.$sym53$LITERAL_PREDICATE)) {
                final SubLObject new_literals = (SubLObject)ConsesLow.make_list(Sequences.length(literals), (SubLObject)sksi_csql_utilities.UNPROVIDED);
                SubLObject new_literal_index = (SubLObject)sksi_csql_utilities.ZERO_INTEGER;
                SubLObject doneP = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject list_var2 = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject literal = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject literal_index = (SubLObject)sksi_csql_utilities.NIL;
                list_var2 = literals;
                literal = list_var2.first();
                for (literal_index = (SubLObject)sksi_csql_utilities.ZERO_INTEGER; sksi_csql_utilities.NIL == doneP && sksi_csql_utilities.NIL != list_var2; list_var2 = list_var2.rest(), literal = list_var2.first(), literal_index = Numbers.add((SubLObject)sksi_csql_utilities.ONE_INTEGER, literal_index)) {
                    while (sksi_csql_utilities.NIL != subl_promotions.memberP(new_literal_index, comparison_literal_index_list, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                        new_literal_index = Numbers.add(new_literal_index, (SubLObject)sksi_csql_utilities.ONE_INTEGER);
                    }
                    if (new_literal_index.numGE(literal_count_verify)) {
                        doneP = (SubLObject)sksi_csql_utilities.T;
                    }
                    if (sksi_csql_utilities.NIL == doneP) {
                        ConsesLow.set_nth(new_literal_index, new_literals, literal);
                    }
                    new_literal_index = Numbers.add(new_literal_index, (SubLObject)sksi_csql_utilities.ONE_INTEGER);
                }
                SubLObject comparison_literal = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject comparison_literal_$15 = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject comparison_literal_index = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject comparison_literal_index_$16 = (SubLObject)sksi_csql_utilities.NIL;
                comparison_literal = list_utilities.last_n(Sequences.length(comparison_literal_index_list), literals);
                comparison_literal_$15 = comparison_literal.first();
                comparison_literal_index = comparison_literal_index_list;
                comparison_literal_index_$16 = comparison_literal_index.first();
                while (sksi_csql_utilities.NIL != comparison_literal_index || sksi_csql_utilities.NIL != comparison_literal) {
                    ConsesLow.set_nth(comparison_literal_index_$16, new_literals, comparison_literal_$15);
                    comparison_literal = comparison_literal.rest();
                    comparison_literal_$15 = comparison_literal.first();
                    comparison_literal_index = comparison_literal_index.rest();
                    comparison_literal_index_$16 = comparison_literal_index.first();
                }
                literals = new_literals;
            }
            else {
                Errors.warn((SubLObject)sksi_csql_utilities.$str54$Could_not_correctly_order_compari);
            }
        }
        literals = ConsesLow.append(literals, unknown_sentence_literals);
        final SubLObject csql = (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw8$SELECT, reader.bq_cons((SubLObject)sksi_csql_utilities.$kw55$VARIABLES, ConsesLow.append(v_variables, (SubLObject)sksi_csql_utilities.NIL)), (SubLObject)sksi_csql_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$kw7$WHERE, literals));
        return Values.values(csql, equivalent_field_map, field_index_map, existential_scope_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 27652L)
    public static SubLObject determine_sparql_equivalent_fields_classes(final SubLObject fields, final SubLObject where_expressions, SubLObject equivalent_field_map, SubLObject existential_scope_fields) {
        if (equivalent_field_map == sksi_csql_utilities.UNPROVIDED) {
            equivalent_field_map = (SubLObject)sksi_csql_utilities.NIL;
        }
        if (existential_scope_fields == sksi_csql_utilities.UNPROVIDED) {
            existential_scope_fields = (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_csql_utilities.NIL != equivalent_field_map && !sksi_csql_utilities.assertionsDisabledInClass && sksi_csql_utilities.NIL == dictionary.dictionary_p(equivalent_field_map)) {
            throw new AssertionError(equivalent_field_map);
        }
        final SubLObject equivalence_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(fields));
        final SubLObject exemplar_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(fields));
        SubLObject all_fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject universal_scope_fields = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL != dictionary.dictionary_p(equivalent_field_map)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equivalent_field_map)); sksi_csql_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject canonical_field = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject item_var = field;
                if (sksi_csql_utilities.NIL == conses_high.member(item_var, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                    all_fields = (SubLObject)ConsesLow.cons(item_var, all_fields);
                }
                item_var = canonical_field;
                if (sksi_csql_utilities.NIL == conses_high.member(item_var, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                    all_fields = (SubLObject)ConsesLow.cons(item_var, all_fields);
                }
                set.set_add(canonical_field, exemplar_set);
                SubLObject canonical_set = dictionary.dictionary_lookup(equivalence_map, canonical_field, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                if (sksi_csql_utilities.NIL == set.set_p(canonical_set)) {
                    canonical_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
                }
                set.set_add(field, canonical_set);
                dictionary.dictionary_enter(equivalence_map, field, canonical_set);
                dictionary.dictionary_enter(equivalence_map, canonical_field, canonical_set);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        SubLObject cdolist_list_var = fields;
        SubLObject field = (SubLObject)sksi_csql_utilities.NIL;
        field = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var2 = field;
            if (sksi_csql_utilities.NIL == conses_high.member(item_var2, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                all_fields = (SubLObject)ConsesLow.cons(item_var2, all_fields);
            }
            set.set_add(field, exemplar_set);
            if (sksi_csql_utilities.NIL == set.set_p(dictionary.dictionary_lookup(equivalence_map, field, (SubLObject)sksi_csql_utilities.UNPROVIDED))) {
                final SubLObject starting_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.TWO_INTEGER);
                set.set_add(field, starting_set);
                dictionary.dictionary_enter(equivalence_map, field, starting_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        }
        cdolist_list_var = where_expressions;
        SubLObject where_expression = (SubLObject)sksi_csql_utilities.NIL;
        where_expression = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = where_expression;
            SubLObject field_keyword = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject expression1 = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            field_keyword = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            expression1 = current.first();
            current = current.rest();
            final SubLObject expression2 = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_csql_utilities.$list41);
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (sksi_csql_utilities.$const42$CSQLEquals.eql(field_keyword) && sksi_csql_utilities.NIL != csql_field_p(expression1) && sksi_csql_utilities.NIL != csql_field_p(expression2)) {
                    thread.resetMultipleValues();
                    final SubLObject favored_field = sort_2_csql_fields(expression1, expression2);
                    final SubLObject disfavored_field = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject favored_set = dictionary.dictionary_lookup_without_values(equivalence_map, favored_field, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                    SubLObject disfavored_set = dictionary.dictionary_lookup_without_values(equivalence_map, disfavored_field, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                    if (sksi_csql_utilities.NIL == set.set_p(favored_set)) {
                        SubLObject item_var3 = favored_field;
                        if (sksi_csql_utilities.NIL == conses_high.member(item_var3, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                            all_fields = (SubLObject)ConsesLow.cons(item_var3, all_fields);
                        }
                        set.set_add(favored_field, exemplar_set);
                        favored_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.TWO_INTEGER);
                        set.set_add(favored_field, favored_set);
                        dictionary.dictionary_enter(equivalence_map, favored_field, favored_set);
                        item_var3 = favored_field;
                        if (sksi_csql_utilities.NIL == conses_high.member(item_var3, universal_scope_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                            universal_scope_fields = (SubLObject)ConsesLow.cons(item_var3, universal_scope_fields);
                        }
                    }
                    if (sksi_csql_utilities.NIL == set.set_p(disfavored_set)) {
                        SubLObject item_var3 = disfavored_field;
                        if (sksi_csql_utilities.NIL == conses_high.member(item_var3, all_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                            all_fields = (SubLObject)ConsesLow.cons(item_var3, all_fields);
                        }
                        disfavored_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.TWO_INTEGER);
                        set.set_add(disfavored_field, disfavored_set);
                        dictionary.dictionary_enter(equivalence_map, disfavored_field, disfavored_set);
                        item_var3 = disfavored_field;
                        if (sksi_csql_utilities.NIL == conses_high.member(item_var3, universal_scope_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                            universal_scope_fields = (SubLObject)ConsesLow.cons(item_var3, universal_scope_fields);
                        }
                    }
                    if (!favored_set.eql(disfavored_set)) {
                        final SubLObject set_contents_var = set.do_set_internal(disfavored_set);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject disfavored_field_$17;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_csql_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_csql_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            disfavored_field_$17 = set_contents.do_set_contents_next(basis_object, state);
                            if (sksi_csql_utilities.NIL != set_contents.do_set_contents_element_validP(state, disfavored_field_$17)) {
                                set.set_remove(disfavored_field_$17, exemplar_set);
                                set.set_add(disfavored_field_$17, favored_set);
                                dictionary.dictionary_enter(equivalence_map, disfavored_field_$17, favored_set);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list41);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        }
        final SubLObject canonical_field_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(all_fields));
        final SubLObject set_contents_var2 = set.do_set_internal(exemplar_set);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject canonical_field2;
        SubLObject equivalence_set;
        SubLObject set_contents_var_$18;
        SubLObject basis_object_$19;
        SubLObject state_$20;
        SubLObject field2;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sksi_csql_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sksi_csql_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            canonical_field2 = set_contents.do_set_contents_next(basis_object2, state2);
            if (sksi_csql_utilities.NIL != set_contents.do_set_contents_element_validP(state2, canonical_field2)) {
                equivalence_set = dictionary.dictionary_lookup(equivalence_map, canonical_field2, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                set_contents_var_$18 = set.do_set_internal(equivalence_set);
                for (basis_object_$19 = set_contents.do_set_contents_basis_object(set_contents_var_$18), state_$20 = (SubLObject)sksi_csql_utilities.NIL, state_$20 = set_contents.do_set_contents_initial_state(basis_object_$19, set_contents_var_$18); sksi_csql_utilities.NIL == set_contents.do_set_contents_doneP(basis_object_$19, state_$20); state_$20 = set_contents.do_set_contents_update_state(state_$20)) {
                    field2 = set_contents.do_set_contents_next(basis_object_$19, state_$20);
                    if (sksi_csql_utilities.NIL != set_contents.do_set_contents_element_validP(state_$20, field2)) {
                        dictionary.dictionary_enter(canonical_field_map, field2, canonical_field2);
                    }
                }
            }
        }
        SubLObject all_universal_scope_fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject cdolist_list_var2 = universal_scope_fields;
        SubLObject universal_scope_field = (SubLObject)sksi_csql_utilities.NIL;
        universal_scope_field = cdolist_list_var2.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var2) {
            final SubLObject set_var = dictionary.dictionary_lookup(equivalence_map, universal_scope_field, (SubLObject)sksi_csql_utilities.UNPROVIDED);
            final SubLObject set_contents_var3 = set.do_set_internal(set_var);
            SubLObject basis_object3;
            SubLObject state3;
            SubLObject equivalent_field;
            SubLObject item_var4;
            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)sksi_csql_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); sksi_csql_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                equivalent_field = set_contents.do_set_contents_next(basis_object3, state3);
                if (sksi_csql_utilities.NIL != set_contents.do_set_contents_element_validP(state3, equivalent_field)) {
                    item_var4 = equivalent_field;
                    if (sksi_csql_utilities.NIL == conses_high.member(item_var4, all_universal_scope_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                        all_universal_scope_fields = (SubLObject)ConsesLow.cons(item_var4, all_universal_scope_fields);
                    }
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            universal_scope_field = cdolist_list_var2.first();
        }
        cdolist_list_var2 = list_utilities.fast_delete_duplicates(conses_high.set_difference(all_fields, all_universal_scope_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        SubLObject existential_scope_field = (SubLObject)sksi_csql_utilities.NIL;
        existential_scope_field = cdolist_list_var2.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var2) {
            final SubLObject item_var5 = existential_scope_field;
            if (sksi_csql_utilities.NIL == conses_high.member(item_var5, existential_scope_fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_csql_utilities.IDENTITY))) {
                existential_scope_fields = (SubLObject)ConsesLow.cons(item_var5, existential_scope_fields);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            existential_scope_field = cdolist_list_var2.first();
        }
        return Values.values(canonical_field_map, existential_scope_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 32602L)
    public static SubLObject sort_2_csql_fields(final SubLObject field1, final SubLObject field2) {
        if (sksi_csql_utilities.NIL != csql_field_L(field2, field1)) {
            return Values.values(field2, field1);
        }
        return Values.values(field1, field2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 32764L)
    public static SubLObject csql_field_L(final SubLObject field1, final SubLObject field2) {
        if (field1.equal(field2)) {
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        if (sksi_csql_utilities.NIL != kb_utilities.term_L(conses_high.third(field1), conses_high.third(field2), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_csql_utilities.T;
        }
        if (sksi_csql_utilities.NIL != kb_utilities.term_L(conses_high.third(field2), conses_high.third(field1), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        if (sksi_csql_utilities.NIL != kb_utilities.term_L(conses_high.second(field1), conses_high.second(field2), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_csql_utilities.T;
        }
        if (sksi_csql_utilities.NIL != kb_utilities.term_L(conses_high.second(field2), conses_high.second(field1), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 33134L)
    public static SubLObject canonicalize_csql(final SubLObject csql, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.T;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.T;
        }
        SubLObject keyword = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject from = (SubLObject)sksi_csql_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_csql_utilities.$list56);
        keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_utilities.$list56);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_utilities.$list56);
        from = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_utilities.$list56);
        current = current.rest();
        if (sksi_csql_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_csql_utilities.$list56);
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLObject new_fields = canonicalize_csql_fields_clause(fields, copyP, stableP);
        final SubLObject new_from = canonicalize_csql_from_clause(from, copyP, stableP);
        final SubLObject new_where = (SubLObject)((sksi_csql_utilities.NIL != where) ? canonicalize_csql_where_clause(where, copyP, stableP) : sksi_csql_utilities.NIL);
        if (sksi_csql_utilities.NIL != where) {
            return (SubLObject)ConsesLow.list(keyword, new_fields, new_from, new_where);
        }
        return (SubLObject)ConsesLow.list(keyword, new_fields, new_from);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 33911L)
    public static SubLObject canonicalize_csql_fields_clause(final SubLObject fields, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.T;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.T;
        }
        if (fields.equal((SubLObject)sksi_csql_utilities.$list15)) {
            return fields;
        }
        return kb_utilities.sort_terms(fields, copyP, stableP, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 34109L)
    public static SubLObject canonicalize_csql_from_clause(final SubLObject from, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.T;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.T;
        }
        SubLObject keyword = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject tables = (SubLObject)sksi_csql_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(from, from, (SubLObject)sksi_csql_utilities.$list57);
        keyword = from.first();
        SubLObject current = from.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, from, (SubLObject)sksi_csql_utilities.$list57);
        tables = current.first();
        current = current.rest();
        if (sksi_csql_utilities.NIL == current) {
            final SubLObject new_tables = canonicalize_csql_tables_clause(tables, copyP, stableP);
            return (SubLObject)ConsesLow.list(keyword, new_tables);
        }
        cdestructuring_bind.cdestructuring_bind_error(from, (SubLObject)sksi_csql_utilities.$list57);
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 34359L)
    public static SubLObject canonicalize_csql_tables_clause(final SubLObject tables, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.T;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.T;
        }
        return kb_utilities.sort_terms(tables, copyP, stableP, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 34494L)
    public static SubLObject canonicalize_csql_where_clause(final SubLObject where, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.NIL;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.NIL;
        }
        SubLObject keyword = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject where_clause = (SubLObject)sksi_csql_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(where, where, (SubLObject)sksi_csql_utilities.$list58);
        keyword = where.first();
        SubLObject current = where.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, where, (SubLObject)sksi_csql_utilities.$list58);
        where_clause = current.first();
        current = current.rest();
        if (sksi_csql_utilities.NIL == current) {
            final SubLObject new_where_clause = canonicalize_csql_stripped_where_clause(where_clause, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
            return (SubLObject)ConsesLow.list(keyword, new_where_clause);
        }
        cdestructuring_bind.cdestructuring_bind_error(where, (SubLObject)sksi_csql_utilities.$list58);
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 34782L)
    public static SubLObject canonicalize_csql_stripped_where_clause(final SubLObject where_clause, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.NIL;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.NIL;
        }
        SubLObject new_where_clause = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject cdolist_list_var = where_clause;
        SubLObject where_exp = (SubLObject)sksi_csql_utilities.NIL;
        where_exp = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            new_where_clause = (SubLObject)ConsesLow.cons(canonicalize_csql_where_expression(where_exp, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED), new_where_clause);
            cdolist_list_var = cdolist_list_var.rest();
            where_exp = cdolist_list_var.first();
        }
        return kb_utilities.sort_terms(new_where_clause, (SubLObject)sksi_csql_utilities.NIL, (SubLObject)sksi_csql_utilities.T, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 35097L)
    public static SubLObject canonicalize_csql_where_expression(final SubLObject where_exp, SubLObject copyP, SubLObject stableP) {
        if (copyP == sksi_csql_utilities.UNPROVIDED) {
            copyP = (SubLObject)sksi_csql_utilities.NIL;
        }
        if (stableP == sksi_csql_utilities.UNPROVIDED) {
            stableP = (SubLObject)sksi_csql_utilities.NIL;
        }
        if (!where_exp.isList()) {
            return where_exp;
        }
        final SubLObject operator = csql_expression_operator(where_exp);
        final SubLObject v_arguments = csql_expression_arguments(where_exp);
        if (sksi_csql_utilities.NIL != csql_where_clause_terminal_operator_p(operator)) {
            return where_exp;
        }
        SubLObject new_arguments = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject cdolist_list_var = v_arguments;
        SubLObject argument = (SubLObject)sksi_csql_utilities.NIL;
        argument = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            new_arguments = (SubLObject)ConsesLow.cons(canonicalize_csql_where_expression(argument, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED), new_arguments);
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        if (sksi_csql_utilities.NIL != csql_where_clause_commutative_operator_p(operator)) {
            new_arguments = kb_utilities.sort_terms(new_arguments, (SubLObject)sksi_csql_utilities.NIL, (SubLObject)sksi_csql_utilities.T, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        }
        else {
            new_arguments = Sequences.nreverse(new_arguments);
        }
        return make_csql_expression(operator, new_arguments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 35885L)
    public static SubLObject simplify_csql_query(final SubLObject csql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject new_tables = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject new_where_clause = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject select_keyword = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject fields = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject from = (SubLObject)sksi_csql_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_csql_utilities.$list59);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_utilities.$list59);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_utilities.$list59);
        from = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_csql_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_utilities.$list59);
        current = current.rest();
        if (sksi_csql_utilities.NIL == current) {
            if (sksi_csql_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_csql_utilities.$kw8$SELECT != select_keyword) {
                Errors.error((SubLObject)sksi_csql_utilities.$str60$malformed_csql_expression__a__exp, csql);
            }
            SubLObject current_$22;
            final SubLObject datum_$21 = current_$22 = from;
            SubLObject from_keyword = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject tables = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)sksi_csql_utilities.$list61);
            from_keyword = current_$22.first();
            current_$22 = current_$22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)sksi_csql_utilities.$list61);
            tables = current_$22.first();
            current_$22 = current_$22.rest();
            if (sksi_csql_utilities.NIL == current_$22) {
                if (sksi_csql_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_csql_utilities.$kw6$FROM != from_keyword) {
                    Errors.error((SubLObject)sksi_csql_utilities.$str62$malformed_csql_expression__a__exp, from);
                }
                if (sksi_csql_utilities.NIL != where) {
                    SubLObject current_$23;
                    final SubLObject datum_$22 = current_$23 = where;
                    SubLObject where_keyword = (SubLObject)sksi_csql_utilities.NIL;
                    SubLObject where_clause = (SubLObject)sksi_csql_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$23, datum_$22, (SubLObject)sksi_csql_utilities.$list63);
                    where_keyword = current_$23.first();
                    current_$23 = current_$23.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$23, datum_$22, (SubLObject)sksi_csql_utilities.$list63);
                    where_clause = current_$23.first();
                    current_$23 = current_$23.rest();
                    if (sksi_csql_utilities.NIL == current_$23) {
                        if (sksi_csql_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_csql_utilities.$kw7$WHERE != where_keyword) {
                            Errors.error((SubLObject)sksi_csql_utilities.$str64$malformed_csql_expression__a__exp, where);
                        }
                        thread.resetMultipleValues();
                        final SubLObject new_fields_$25 = simplify_csql_expressions(fields, tables, where_clause);
                        final SubLObject new_tables_$26 = thread.secondMultipleValue();
                        final SubLObject new_where_clause_$27 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        new_fields = new_fields_$25;
                        new_tables = new_tables_$26;
                        new_where_clause = new_where_clause_$27;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$22, (SubLObject)sksi_csql_utilities.$list63);
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject new_fields_$26 = simplify_csql_expressions(fields, tables, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                    final SubLObject new_tables_$27 = thread.secondMultipleValue();
                    final SubLObject new_where_clause_$28 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    new_fields = new_fields_$26;
                    new_tables = new_tables_$27;
                    new_where_clause = new_where_clause_$28;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$21, (SubLObject)sksi_csql_utilities.$list61);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_csql_utilities.$list59);
        }
        return make_csql_query(new_fields, new_tables, new_where_clause, (SubLObject)sksi_csql_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 37065L)
    public static SubLObject simplify_csql_expressions(final SubLObject fields, final SubLObject tables, SubLObject where) {
        if (where == sksi_csql_utilities.UNPROVIDED) {
            where = (SubLObject)sksi_csql_utilities.NIL;
        }
        return (sksi_csql_utilities.NIL != where) ? simplify_csql_expressions_with_where_clause(fields, tables, where) : simplify_csql_expressions_without_where_clause(fields, tables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 37313L)
    public static SubLObject csql_field_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && sksi_csql_utilities.NIL != list_utilities.lengthGE(v_object, (SubLObject)sksi_csql_utilities.THREE_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED) && sksi_csql_utilities.NIL != list_utilities.lengthLE(v_object, (SubLObject)sksi_csql_utilities.FOUR_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED) && sksi_csql_utilities.$kw10$FIELD == v_object.first() && conses_high.second(v_object).isString() && conses_high.third(v_object).isString() && (sksi_csql_utilities.NIL == conses_high.fourth(v_object) || conses_high.fourth(v_object).isString()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 37636L)
    public static SubLObject csql_field_name(final SubLObject field) {
        return (sksi_csql_utilities.$kw10$FIELD == field.first()) ? conses_high.second(field) : field.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 37770L)
    public static SubLObject csql_field_table_name(final SubLObject field) {
        return (sksi_csql_utilities.$kw10$FIELD == field.first()) ? conses_high.third(field) : conses_high.second(field);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 37913L)
    public static SubLObject csql_field_namespace(final SubLObject field) {
        return (sksi_csql_utilities.$kw10$FIELD == field.first()) ? conses_high.fourth(field) : conses_high.third(field);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 38053L)
    public static SubLObject csql_table_name(final SubLObject table) {
        return (sksi_csql_utilities.$kw12$TABLE == table.first()) ? conses_high.second(table) : table.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 38188L)
    public static SubLObject csql_table_alias(final SubLObject table) {
        return (sksi_csql_utilities.$kw12$TABLE == table.first()) ? ((sksi_csql_utilities.NIL != list_utilities.lengthE(table, (SubLObject)sksi_csql_utilities.THREE_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED)) ? conses_high.third(table) : conses_high.second(table)) : ((sksi_csql_utilities.NIL != list_utilities.lengthE(table, (SubLObject)sksi_csql_utilities.TWO_INTEGER, (SubLObject)sksi_csql_utilities.UNPROVIDED)) ? conses_high.second(table) : table.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 38469L)
    public static SubLObject simplify_csql_expressions_with_where_clause(final SubLObject fields, final SubLObject tables, SubLObject where) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        where = contract_where_clause(where);
        thread.resetMultipleValues();
        final SubLObject new_tables = csql_eliminate_unnecessary_joins(tables, where);
        final SubLObject new_where = thread.secondMultipleValue();
        final SubLObject alist = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_fields = conses_high.sublis(alist, fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
        return Values.values(new_fields, new_tables, new_where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 38817L)
    public static SubLObject simplify_csql_expressions_without_where_clause(final SubLObject fields, final SubLObject tables) {
        SubLObject new_tables = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject cdolist_list_var = tables;
        SubLObject table = (SubLObject)sksi_csql_utilities.NIL;
        table = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            if (sksi_csql_utilities.NIL != subl_promotions.memberP(csql_table_alias(table), fields, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.$sym65$CSQL_FIELD_TABLE_NAME)) {
                new_tables = (SubLObject)ConsesLow.cons(table, new_tables);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return Values.values(fields, new_tables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 39106L)
    public static SubLObject simplify_where_expressions(final SubLObject where_expressions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_csql_utilities.NIL == csql_conjunction_p(where_expressions)) {
            return where_expressions;
        }
        SubLObject value_table = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), Sequences.length(where_expressions));
        SubLObject new_where_expressions = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject failP = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL == failP) {
            SubLObject csome_list_var = where_expressions;
            SubLObject where_expression = (SubLObject)sksi_csql_utilities.NIL;
            where_expression = csome_list_var.first();
            while (sksi_csql_utilities.NIL == failP && sksi_csql_utilities.NIL != csome_list_var) {
                final SubLObject operator = where_expression.first();
                if (sksi_csql_utilities.NIL != csql_equality_relation_p(operator)) {
                    final SubLObject arg1 = csql_expression_arg1(where_expression);
                    final SubLObject arg2 = csql_expression_arg2(where_expression);
                    if (sksi_csql_utilities.NIL != csql_field_expression_p(arg1) && sksi_csql_utilities.NIL != csql_ground_term_p(arg2)) {
                        thread.resetMultipleValues();
                        final SubLObject failP_$31 = inconsistent_where_expressionP(arg1, arg2, value_table);
                        final SubLObject value_table_$32 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        failP = failP_$31;
                        value_table = value_table_$32;
                    }
                    else if (sksi_csql_utilities.NIL != csql_field_expression_p(arg2) && sksi_csql_utilities.NIL != csql_ground_term_p(arg1)) {
                        thread.resetMultipleValues();
                        final SubLObject failP_$32 = inconsistent_where_expressionP(arg2, arg1, value_table);
                        final SubLObject value_table_$33 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        failP = failP_$32;
                        value_table = value_table_$33;
                    }
                }
                if (sksi_csql_utilities.NIL == failP) {
                    new_where_expressions = (SubLObject)ConsesLow.cons(where_expression, new_where_expressions);
                }
                csome_list_var = csome_list_var.rest();
                where_expression = csome_list_var.first();
            }
        }
        return (sksi_csql_utilities.NIL != failP) ? sksi_csql_utilities.$csql_false$.getGlobalValue() : Sequences.nreverse(new_where_expressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 40687L)
    public static SubLObject inconsistent_where_expressionP(final SubLObject field, final SubLObject value, final SubLObject value_table) {
        final SubLObject current_values = dictionary.dictionary_lookup_without_values(value_table, field, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        SubLObject failP = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL == failP) {
            SubLObject csome_list_var = current_values;
            SubLObject current_value = (SubLObject)sksi_csql_utilities.NIL;
            current_value = csome_list_var.first();
            while (sksi_csql_utilities.NIL == failP && sksi_csql_utilities.NIL != csome_list_var) {
                if (sksi_csql_utilities.NIL != csql_ground_term_p(current_value)) {
                    failP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == csql_unify_possible(value, current_value));
                }
                csome_list_var = csome_list_var.rest();
                current_value = csome_list_var.first();
            }
        }
        if (sksi_csql_utilities.NIL == failP) {
            dictionary_utilities.dictionary_push(value_table, field, value);
        }
        return Values.values(failP, value_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 41263L)
    public static SubLObject csql_unify_possible(final SubLObject obj1, final SubLObject obj2) {
        if (sksi_csql_utilities.NIL != csql_comparison_or_p(obj1)) {
            SubLObject successP = (SubLObject)sksi_csql_utilities.NIL;
            if (sksi_csql_utilities.NIL == successP) {
                SubLObject csome_list_var = csql_expression_arguments(obj1);
                SubLObject obj3 = (SubLObject)sksi_csql_utilities.NIL;
                obj3 = csome_list_var.first();
                while (sksi_csql_utilities.NIL == successP && sksi_csql_utilities.NIL != csome_list_var) {
                    if (sksi_csql_utilities.NIL != csql_unify_possible(obj3, obj2)) {
                        successP = (SubLObject)sksi_csql_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                }
            }
            return successP;
        }
        if (sksi_csql_utilities.NIL != csql_comparison_and_p(obj1)) {
            SubLObject failureP = (SubLObject)sksi_csql_utilities.NIL;
            if (sksi_csql_utilities.NIL == failureP) {
                SubLObject csome_list_var = csql_expression_arguments(obj1);
                SubLObject obj3 = (SubLObject)sksi_csql_utilities.NIL;
                obj3 = csome_list_var.first();
                while (sksi_csql_utilities.NIL == failureP && sksi_csql_utilities.NIL != csome_list_var) {
                    if (sksi_csql_utilities.NIL == csql_unify_possible(obj3, obj2)) {
                        failureP = (SubLObject)sksi_csql_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == failureP);
        }
        if (sksi_csql_utilities.NIL != csql_comparison_or_p(obj2)) {
            SubLObject successP = (SubLObject)sksi_csql_utilities.NIL;
            if (sksi_csql_utilities.NIL == successP) {
                SubLObject csome_list_var = csql_expression_arguments(obj2);
                SubLObject obj3 = (SubLObject)sksi_csql_utilities.NIL;
                obj3 = csome_list_var.first();
                while (sksi_csql_utilities.NIL == successP && sksi_csql_utilities.NIL != csome_list_var) {
                    if (sksi_csql_utilities.NIL != csql_unify_possible(obj1, obj3)) {
                        successP = (SubLObject)sksi_csql_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                }
            }
            return successP;
        }
        if (sksi_csql_utilities.NIL != csql_comparison_and_p(obj2)) {
            SubLObject failureP = (SubLObject)sksi_csql_utilities.NIL;
            if (sksi_csql_utilities.NIL == failureP) {
                SubLObject csome_list_var = csql_expression_arguments(obj2);
                SubLObject obj3 = (SubLObject)sksi_csql_utilities.NIL;
                obj3 = csome_list_var.first();
                while (sksi_csql_utilities.NIL == failureP && sksi_csql_utilities.NIL != csome_list_var) {
                    if (sksi_csql_utilities.NIL == csql_unify_possible(obj1, obj3)) {
                        failureP = (SubLObject)sksi_csql_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    obj3 = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == failureP);
        }
        return csql_unify_possible_int(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 42604L)
    public static SubLObject sql_regular_expression_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && sksi_csql_utilities.NIL != Sequences.find(v_object, sksi_csql_utilities.$sql_regular_expression_meta_characters$.getGlobalValue(), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 42766L)
    public static SubLObject sql_regular_expression_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && sksi_csql_utilities.NIL != Sequences.find_if((SubLObject)sksi_csql_utilities.$sym67$SQL_REGULAR_EXPRESSION_CHAR_P, v_object, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 42920L)
    public static SubLObject csql_unify_possible_int(final SubLObject obj1, final SubLObject obj2) {
        if (sksi_csql_utilities.NIL != sql_regular_expression_string_p(obj1) || sksi_csql_utilities.NIL != sql_regular_expression_string_p(obj2)) {
            return (SubLObject)sksi_csql_utilities.T;
        }
        return unification.unify_possible(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 43129L)
    public static SubLObject csql_ground_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == csql_field_expression_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 43423L)
    public static SubLObject contract_where_clause(final SubLObject where) {
        final SubLObject rev_where = Sequences.delete_duplicates((sksi_csql_utilities.NIL != csql_explicit_conjunction_p(where) || sksi_csql_utilities.NIL != csql_disjunction_p(where)) ? csql_expression_arguments(where) : where, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        SubLObject new_where = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject cdolist_list_var = rev_where;
        SubLObject where_expression = (SubLObject)sksi_csql_utilities.NIL;
        where_expression = cdolist_list_var.first();
        while (sksi_csql_utilities.NIL != cdolist_list_var) {
            final SubLObject new_expression = contract_where_expression(where_expression);
            if (sksi_csql_utilities.NIL == csql_true_p(new_expression)) {
                if (new_expression.isCons() && sksi_csql_utilities.$const17$CSQLAnd.eql(csql_expression_operator(new_expression)) && sksi_csql_utilities.NIL == csql_disjunction_p(where)) {
                    SubLObject cdolist_list_var_$35 = csql_expression_arguments(new_expression);
                    SubLObject sub_expression = (SubLObject)sksi_csql_utilities.NIL;
                    sub_expression = cdolist_list_var_$35.first();
                    while (sksi_csql_utilities.NIL != cdolist_list_var_$35) {
                        new_where = (SubLObject)ConsesLow.cons(sub_expression, new_where);
                        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                        sub_expression = cdolist_list_var_$35.first();
                    }
                }
                else {
                    new_where = (SubLObject)ConsesLow.cons(new_expression, new_where);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        }
        new_where = Sequences.delete_duplicates(new_where, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        if (sksi_csql_utilities.NIL != csql_disjunction_p(where)) {
            new_where = csql_disjoin_expressions(new_where);
        }
        new_where = Sequences.nreverse(new_where);
        return new_where;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 44830L)
    public static SubLObject contract_where_expression(final SubLObject where) {
        if (sksi_csql_utilities.NIL != csql_true_p(where)) {
            return where;
        }
        if (sksi_csql_utilities.NIL != csql_false_p(where)) {
            return where;
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = csql_expression_operator(where);
        if (pcase_var.eql(sksi_csql_utilities.$const68$CSQLStrictlyEquals)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject right = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            right = current.first();
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (left.equal(right)) {
                    return sksi_csql_utilities.$csql_true$.getGlobalValue();
                }
                if (sksi_csql_utilities.NIL != kb_utilities.term_L(right, left, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(operator, right, left);
                }
                return where;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list69);
            }
        }
        else if (pcase_var.eql(sksi_csql_utilities.$const24$CSQLNotEqual)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject right = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            right = current.first();
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (left.equal(right)) {
                    return sksi_csql_utilities.$csql_false$.getGlobalValue();
                }
                if (sksi_csql_utilities.NIL != kb_utilities.term_L(right, left, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(operator, right, left);
                }
                return where;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list69);
            }
        }
        else if (pcase_var.eql(sksi_csql_utilities.$const42$CSQLEquals) || pcase_var.eql(sksi_csql_utilities.$const25$CSQLLike)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject right = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            right = current.first();
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (left.equal(right)) {
                    return sksi_csql_utilities.$csql_true$.getGlobalValue();
                }
                if (sksi_csql_utilities.NIL != csql_field_expression_p(left) && sksi_csql_utilities.NIL != csql_field_expression_p(right) && sksi_csql_utilities.NIL != kb_utilities.term_L(right, left, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(operator, right, left);
                }
                return where;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list69);
            }
        }
        else if (pcase_var.eql(sksi_csql_utilities.$const29$CSQLDifferent) || pcase_var.eql(sksi_csql_utilities.$const70$CSQLUnlike)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject right = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            right = current.first();
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (left.equal(right)) {
                    return sksi_csql_utilities.$csql_false$.getGlobalValue();
                }
                if (sksi_csql_utilities.NIL != csql_field_expression_p(left) && sksi_csql_utilities.NIL != csql_field_expression_p(right) && sksi_csql_utilities.NIL != kb_utilities.term_L(right, left, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(operator, right, left);
                }
                return where;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list69);
            }
        }
        else {
            if (pcase_var.eql(sksi_csql_utilities.$const17$CSQLAnd)) {
                SubLObject new_expressions = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject doneP = (SubLObject)sksi_csql_utilities.NIL;
                if (sksi_csql_utilities.NIL == doneP) {
                    SubLObject csome_list_var = Sequences.delete_duplicates(csql_expression_arguments(where), Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                    SubLObject expression = (SubLObject)sksi_csql_utilities.NIL;
                    expression = csome_list_var.first();
                    while (sksi_csql_utilities.NIL == doneP && sksi_csql_utilities.NIL != csome_list_var) {
                        final SubLObject new_expression = contract_where_expression(expression);
                        if (sksi_csql_utilities.NIL == csql_true_p(new_expression)) {
                            if (sksi_csql_utilities.NIL != csql_false_p(new_expression)) {
                                new_expressions = (SubLObject)ConsesLow.list(sksi_csql_utilities.$csql_false$.getGlobalValue());
                                doneP = (SubLObject)sksi_csql_utilities.T;
                            }
                            else if (sksi_csql_utilities.$const17$CSQLAnd.eql(csql_expression_operator(new_expression))) {
                                new_expressions = ConsesLow.append(csql_expression_arguments(new_expression), new_expressions);
                            }
                            else {
                                new_expressions = (SubLObject)ConsesLow.cons(new_expression, new_expressions);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        expression = csome_list_var.first();
                    }
                }
                new_expressions = Sequences.delete_duplicates(new_expressions, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                return csql_conjoin_expressions(new_expressions);
            }
            if (pcase_var.eql(sksi_csql_utilities.$const16$CSQLOr)) {
                SubLObject new_expressions = (SubLObject)sksi_csql_utilities.NIL;
                SubLObject doneP = (SubLObject)sksi_csql_utilities.NIL;
                if (sksi_csql_utilities.NIL == doneP) {
                    SubLObject csome_list_var = Sequences.delete_duplicates(csql_expression_arguments(where), Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                    SubLObject expression = (SubLObject)sksi_csql_utilities.NIL;
                    expression = csome_list_var.first();
                    while (sksi_csql_utilities.NIL == doneP && sksi_csql_utilities.NIL != csome_list_var) {
                        final SubLObject new_expression = contract_where_expression(expression);
                        if (sksi_csql_utilities.NIL != csql_true_p(new_expression)) {
                            new_expressions = (SubLObject)ConsesLow.list(sksi_csql_utilities.$csql_true$.getGlobalValue());
                            doneP = (SubLObject)sksi_csql_utilities.T;
                        }
                        else if (sksi_csql_utilities.NIL == csql_false_p(new_expression)) {
                            if (sksi_csql_utilities.$const16$CSQLOr.eql(csql_expression_operator(new_expression))) {
                                new_expressions = ConsesLow.append(csql_expression_arguments(new_expression), new_expressions);
                            }
                            else {
                                new_expressions = (SubLObject)ConsesLow.cons(new_expression, new_expressions);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        expression = csome_list_var.first();
                    }
                }
                new_expressions = Sequences.delete_duplicates(new_expressions, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED, (SubLObject)sksi_csql_utilities.UNPROVIDED);
                return csql_disjoin_expressions(new_expressions);
            }
            return where;
        }
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 49139L)
    public static SubLObject csql_eliminate_unnecessary_joins(final SubLObject tables, final SubLObject where) {
        return Values.values(tables, where, (SubLObject)sksi_csql_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 49250L)
    public static SubLObject csql_where_find_joins(final SubLObject where) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject field_map = csql_where_find_field_map(where);
        final SubLObject joins = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(field_map)); sksi_csql_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject field1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject join_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject table1 = csql_field_table_name(field1);
            SubLObject cdolist_list_var = join_list;
            SubLObject field2 = (SubLObject)sksi_csql_utilities.NIL;
            field2 = cdolist_list_var.first();
            while (sksi_csql_utilities.NIL != cdolist_list_var) {
                final SubLObject table2 = csql_field_table_name(field2);
                dictionary_utilities.dictionary_pushnew(joins, table1, table2, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
                dictionary_utilities.dictionary_pushnew(joins, table2, table1, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                field2 = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return joins;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 49739L)
    public static SubLObject csql_where_find_field_map(final SubLObject where) {
        return csql_where_find_field_map_int(where, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 49862L)
    public static SubLObject csql_where_find_field_map_int(final SubLObject where, final SubLObject field_map) {
        if (sksi_csql_utilities.NIL != csql_equal_clause_p(where)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where);
            SubLObject left = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject right = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            right = current.first();
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                if (sksi_csql_utilities.NIL != csql_field_expression_p(left) && sksi_csql_utilities.NIL != csql_field_expression_p(right)) {
                    dictionary_utilities.dictionary_pushnew(field_map, left, right, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
                    dictionary_utilities.dictionary_pushnew(field_map, right, left, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQUAL), (SubLObject)sksi_csql_utilities.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list69);
            }
        }
        else if (sksi_csql_utilities.NIL != csql_conjunction_p(where)) {
            SubLObject cdolist_list_var = csql_conjunction_conjuncts(where);
            SubLObject conjunct = (SubLObject)sksi_csql_utilities.NIL;
            conjunct = cdolist_list_var.first();
            while (sksi_csql_utilities.NIL != cdolist_list_var) {
                csql_where_find_field_map_int(conjunct, field_map);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
        }
        return field_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 50531L)
    public static SubLObject csql_remove_redundant_select_fields(final SubLObject fields, final SubLObject where_clause) {
        return fields;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 51067L)
    public static SubLObject csql_where_clause_field_equals_some_fieldP(final SubLObject where_clause, final SubLObject field1, final SubLObject fields) {
        SubLObject equalP = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL == equalP) {
            SubLObject csome_list_var = fields;
            SubLObject field2 = (SubLObject)sksi_csql_utilities.NIL;
            field2 = csome_list_var.first();
            while (sksi_csql_utilities.NIL == equalP && sksi_csql_utilities.NIL != csome_list_var) {
                if (sksi_csql_utilities.NIL != csql_where_clause_field_equals_fieldP(where_clause, field1, field2)) {
                    equalP = (SubLObject)sksi_csql_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                field2 = csome_list_var.first();
            }
        }
        return equalP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 51333L)
    public static SubLObject csql_where_clause_field_equals_fieldP(final SubLObject where_clause, final SubLObject field1, final SubLObject field2) {
        SubLObject equalP = Equality.equal(field1, field2);
        if (sksi_csql_utilities.NIL == equalP) {
            SubLObject csome_list_var = where_clause;
            SubLObject where_exp = (SubLObject)sksi_csql_utilities.NIL;
            where_exp = csome_list_var.first();
            while (sksi_csql_utilities.NIL == equalP && sksi_csql_utilities.NIL != csome_list_var) {
                if (sksi_csql_utilities.NIL != csql_where_expression_field_equals_fieldP(where_exp, field1, field2)) {
                    equalP = (SubLObject)sksi_csql_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                where_exp = csome_list_var.first();
            }
        }
        return equalP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 51628L)
    public static SubLObject csql_where_expression_field_equals_fieldP(final SubLObject where_expression, SubLObject field1, SubLObject field2) {
        if (sksi_csql_utilities.$kw10$FIELD != csql_expression_operator(field1)) {
            field1 = (SubLObject)ConsesLow.cons((SubLObject)sksi_csql_utilities.$kw10$FIELD, field1);
        }
        if (sksi_csql_utilities.$kw10$FIELD != csql_expression_operator(field2)) {
            field2 = (SubLObject)ConsesLow.cons((SubLObject)sksi_csql_utilities.$kw10$FIELD, field2);
        }
        return csql_where_expression_field_equals_fieldP_int(where_expression, field1, field2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 52004L)
    public static SubLObject csql_where_expression_field_equals_fieldP_int(final SubLObject where_expression, final SubLObject field1, final SubLObject field2) {
        if (sksi_csql_utilities.NIL != csql_true_p(where_expression)) {
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        if (sksi_csql_utilities.NIL != csql_false_p(where_expression)) {
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = csql_expression_operator(where_expression);
        if (pcase_var.eql(sksi_csql_utilities.$const68$CSQLStrictlyEquals) || pcase_var.eql(sksi_csql_utilities.$const42$CSQLEquals) || pcase_var.eql(sksi_csql_utilities.$const25$CSQLLike)) {
            SubLObject current;
            final SubLObject datum = current = csql_expression_arguments(where_expression);
            SubLObject left = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject right = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list69);
            right = current.first();
            current = current.rest();
            if (sksi_csql_utilities.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean((left.equal(field1) && right.equal(field2)) || (left.equal(field2) && right.equal(field1)));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list69);
            return (SubLObject)sksi_csql_utilities.NIL;
        }
        else {
            if (pcase_var.eql(sksi_csql_utilities.$const17$CSQLAnd)) {
                SubLObject equalP = (SubLObject)sksi_csql_utilities.NIL;
                if (sksi_csql_utilities.NIL == equalP) {
                    SubLObject csome_list_var = csql_expression_arguments(where_expression);
                    SubLObject conjunct = (SubLObject)sksi_csql_utilities.NIL;
                    conjunct = csome_list_var.first();
                    while (sksi_csql_utilities.NIL == equalP && sksi_csql_utilities.NIL != csome_list_var) {
                        if (sksi_csql_utilities.NIL != csql_where_expression_field_equals_fieldP_int(conjunct, field1, field2)) {
                            equalP = (SubLObject)sksi_csql_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        conjunct = csome_list_var.first();
                    }
                }
                return equalP;
            }
            if (pcase_var.eql(sksi_csql_utilities.$const16$CSQLOr)) {
                SubLObject maybe_not_equalP = (SubLObject)sksi_csql_utilities.NIL;
                if (sksi_csql_utilities.NIL == maybe_not_equalP) {
                    SubLObject csome_list_var = csql_expression_arguments(where_expression);
                    SubLObject disjunct = (SubLObject)sksi_csql_utilities.NIL;
                    disjunct = csome_list_var.first();
                    while (sksi_csql_utilities.NIL == maybe_not_equalP && sksi_csql_utilities.NIL != csome_list_var) {
                        if (sksi_csql_utilities.NIL == csql_where_expression_field_equals_fieldP_int(disjunct, field1, field2)) {
                            maybe_not_equalP = (SubLObject)sksi_csql_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        disjunct = csome_list_var.first();
                    }
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == maybe_not_equalP);
            }
            return (SubLObject)sksi_csql_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 53495L)
    public static SubLObject csql_to_el(final SubLObject csql, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == sksi_csql_utilities.UNPROVIDED) {
            from_expression = (SubLObject)sksi_csql_utilities.NIL;
        }
        return cycl_utilities.hl_to_el(csql_to_cycl(csql, sk_source, from_expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 54021L)
    public static SubLObject csql_to_cycl(final SubLObject csql, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == sksi_csql_utilities.UNPROVIDED) {
            from_expression = (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject row_in_source_claims_cycl = csql_to_cycl_int(csql, sk_source, from_expression);
        final SubLObject source_claims_cycl = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_csql_utilities.NIL != row_in_source_claims_cycl && sksi_csql_utilities.NIL != source_claims_cycl) {
            return simplify_where_expressions(el_utilities.make_conjunction(reader.bq_cons(row_in_source_claims_cycl, (SubLObject)sksi_csql_utilities.$list71)));
        }
        if (sksi_csql_utilities.NIL != row_in_source_claims_cycl) {
            return row_in_source_claims_cycl;
        }
        if (sksi_csql_utilities.NIL != source_claims_cycl) {
            return source_claims_cycl;
        }
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 54596L)
    public static SubLObject csql_to_cycl_int(final SubLObject csql, final SubLObject sk_source, SubLObject from_expression) {
        if (from_expression == sksi_csql_utilities.UNPROVIDED) {
            from_expression = (SubLObject)sksi_csql_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject row_in_source_claims_cycl = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject source_claims_cycl = (SubLObject)sksi_csql_utilities.NIL;
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
            row_in_source_claims_cycl = simplifier.simplify_cycl_sentence_syntax(row_in_source_claims_cycl, (SubLObject)sksi_csql_utilities.UNPROVIDED);
            source_claims_cycl = simplifier.simplify_cycl_sentence_syntax(source_claims_cycl, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(row_in_source_claims_cycl, source_claims_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 55316L)
    public static SubLObject csql_to_cycl_recursive(final SubLObject csql, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_csql_utilities.NIL != csql_comparison_clause_p(csql)) {
            return construct_field_value_sentence(csql, sk_source, from_expression);
        }
        if (sksi_csql_utilities.NIL != csql_negation_p(csql)) {
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims = csql_to_cycl_recursive(conses_high.second(csql), sk_source, from_expression);
            final SubLObject source_claims = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject neg_row_in_source_claims = (SubLObject)((sksi_csql_utilities.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims)) ? el_utilities.make_negation(row_in_source_claims) : sksi_csql_utilities.NIL);
            final SubLObject neg_source_claims = (SubLObject)((sksi_csql_utilities.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims)) ? el_utilities.make_negation(source_claims) : sksi_csql_utilities.NIL);
            return Values.values(neg_row_in_source_claims, neg_source_claims);
        }
        if (sksi_csql_utilities.NIL != csql_conjunction_p(csql)) {
            final SubLObject csql_conjuncts = csql_conjunction_conjuncts(csql);
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims2 = csql_to_cycl_recursive_2(csql_conjuncts, sk_source, from_expression);
            final SubLObject source_claims2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject conj_row_in_source_claims = (SubLObject)((sksi_csql_utilities.NIL != row_in_source_claims2) ? el_utilities.make_conjunction(row_in_source_claims2) : sksi_csql_utilities.NIL);
            final SubLObject conj_source_claims = (SubLObject)((sksi_csql_utilities.NIL != source_claims2) ? el_utilities.make_conjunction(source_claims2) : sksi_csql_utilities.NIL);
            return Values.values(conj_row_in_source_claims, conj_source_claims);
        }
        if (sksi_csql_utilities.NIL != csql_disjunction_p(csql)) {
            final SubLObject csql_disjuncts = csql_disjunction_disjuncts(csql);
            thread.resetMultipleValues();
            final SubLObject row_in_source_claims2 = csql_to_cycl_recursive_2(csql_disjuncts, sk_source, from_expression);
            final SubLObject source_claims2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject dis_row_in_source_claims = (SubLObject)((sksi_csql_utilities.NIL != row_in_source_claims2) ? el_utilities.make_disjunction(row_in_source_claims2) : sksi_csql_utilities.NIL);
            final SubLObject dis_source_claims = (SubLObject)((sksi_csql_utilities.NIL != source_claims2) ? el_utilities.make_disjunction(source_claims2) : sksi_csql_utilities.NIL);
            return Values.values(dis_row_in_source_claims, dis_source_claims);
        }
        return Values.values((SubLObject)sksi_csql_utilities.NIL, (SubLObject)sksi_csql_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 57329L)
    public static SubLObject csql_to_cycl_recursive_2(final SubLObject csql_forms, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject row_in_source_claims_forms = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject source_claims_forms = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject not_supportedP = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL == not_supportedP) {
            SubLObject csome_list_var = csql_forms;
            SubLObject csql_form = (SubLObject)sksi_csql_utilities.NIL;
            csql_form = csome_list_var.first();
            while (sksi_csql_utilities.NIL == not_supportedP && sksi_csql_utilities.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject row_in_source_claims_form = csql_to_cycl_recursive(csql_form, sk_source, from_expression);
                final SubLObject source_claims_form = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_csql_utilities.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims_form)) {
                    row_in_source_claims_forms = (SubLObject)ConsesLow.cons(row_in_source_claims_form, row_in_source_claims_forms);
                }
                if (sksi_csql_utilities.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims_form)) {
                    source_claims_forms = (SubLObject)ConsesLow.cons(source_claims_form, source_claims_forms);
                }
                if (sksi_csql_utilities.NIL == row_in_source_claims_form && sksi_csql_utilities.NIL == source_claims_form) {
                    not_supportedP = (SubLObject)sksi_csql_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                csql_form = csome_list_var.first();
            }
        }
        if (sksi_csql_utilities.NIL != not_supportedP) {
            return Values.values((SubLObject)sksi_csql_utilities.NIL, (SubLObject)sksi_csql_utilities.NIL);
        }
        return Values.values(Sequences.nreverse(row_in_source_claims_forms), Sequences.nreverse(source_claims_forms));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 58278L)
    public static SubLObject construct_field_value_sentence(final SubLObject where_clause, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLObject operator = where_clause.first();
        final SubLObject arg1 = conses_high.second(where_clause);
        final SubLObject arg2 = conses_high.third(where_clause);
        if (sksi_csql_utilities.NIL != csql_field_expression_p(arg1) && sksi_csql_utilities.NIL != csql_field_expression_p(arg2)) {
            return Values.values(construct_field_value_sentence_two_pfis(operator, arg1, arg2, sk_source, from_expression), (SubLObject)sksi_csql_utilities.NIL);
        }
        if (sksi_csql_utilities.NIL != csql_field_expression_p(arg1) || sksi_csql_utilities.NIL != csql_field_expression_p(arg2)) {
            return Values.values(construct_field_value_sentence_one_pfi(operator, arg1, arg2, sk_source, from_expression), (SubLObject)sksi_csql_utilities.NIL);
        }
        if (sksi_csql_utilities.NIL != csql_eval_expression_p(arg1) || sksi_csql_utilities.NIL != csql_eval_expression_p(arg2)) {
            return Values.values((SubLObject)sksi_csql_utilities.NIL, construct_field_value_sentence_eval_exp(operator, arg1, arg2, sk_source, from_expression));
        }
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 59144L)
    public static SubLObject construct_field_value_sentence_two_pfis(final SubLObject operator, final SubLObject field1, final SubLObject field2, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject field1_name = conses_high.second(field1);
        final SubLObject table1_name = conses_high.third(field1);
        final SubLObject field2_name = conses_high.second(field2);
        final SubLObject table2_name = conses_high.third(field2);
        SubLObject pfi1 = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject pfi2 = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject field_indexical_sentence = (SubLObject)sksi_csql_utilities.NIL;
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
            field_indexical_sentence = ((sksi_csql_utilities.NIL != csql_equality_relation_p(operator)) ? el_utilities.make_binary_formula(sksi_csql_utilities.$const72$fieldIndexicalsEqual, pfi1, pfi2) : el_utilities.make_ternary_formula(sksi_csql_utilities.$const73$fieldIndexicalsComparison, pfi1, pfi2, sksi_kb_accessors.csql_operator_to_cycl_operator(operator)));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return field_indexical_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 60142L)
    public static SubLObject construct_field_value_sentence_one_pfi(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject field = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject field_name = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject table_name = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject value = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject physical_field_indexical = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject field_value_sentence = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject inverseP = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL != csql_field_expression_p(arg1) && sksi_csql_utilities.NIL == csql_field_expression_p(arg2)) {
            field = arg1;
            value = arg2;
        }
        else if (sksi_csql_utilities.NIL == csql_field_expression_p(arg1) && sksi_csql_utilities.NIL != csql_field_expression_p(arg2)) {
            field = arg2;
            value = arg1;
            inverseP = (SubLObject)sksi_csql_utilities.T;
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sk_source));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            field_name = conses_high.second(field);
            table_name = conses_high.third(field);
            physical_field_indexical = sksi_kb_accessors.physical_field_indexical_for_sks_and_field_names(table_name, field_name, from_expression);
            if (sksi_csql_utilities.NIL != csql_equality_relation_p(operator)) {
                if (sksi_csql_utilities.NIL != csql_disjunction_p(value)) {
                    SubLObject disjuncts = (SubLObject)sksi_csql_utilities.NIL;
                    SubLObject cdolist_list_var = value.rest();
                    SubLObject each_value = (SubLObject)sksi_csql_utilities.NIL;
                    each_value = cdolist_list_var.first();
                    while (sksi_csql_utilities.NIL != cdolist_list_var) {
                        disjuncts = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(sksi_csql_utilities.$const74$fieldValue, physical_field_indexical, each_value), disjuncts);
                        cdolist_list_var = cdolist_list_var.rest();
                        each_value = cdolist_list_var.first();
                    }
                    field_value_sentence = el_utilities.make_disjunction(Sequences.nreverse(disjuncts));
                }
                else {
                    field_value_sentence = el_utilities.make_binary_formula(sksi_csql_utilities.$const74$fieldValue, physical_field_indexical, value);
                }
            }
            else if (sksi_csql_utilities.NIL != inverseP) {
                field_value_sentence = el_utilities.make_ternary_formula(sksi_csql_utilities.$const75$fieldValueComparison_Inverse, physical_field_indexical, value, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
            }
            else {
                field_value_sentence = el_utilities.make_ternary_formula(sksi_csql_utilities.$const76$fieldValueComparison, physical_field_indexical, value, sksi_kb_accessors.csql_operator_to_cycl_operator(operator));
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return field_value_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 62108L)
    public static SubLObject construct_field_value_sentence_eval_exp(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject sk_source, final SubLObject from_expression) {
        final SubLObject cycl_operator = (operator.eql(sksi_csql_utilities.$const42$CSQLEquals) && (arg1.isNumber() || arg2.isNumber())) ? sksi_csql_utilities.$const77$numericallyEquals : sksi_kb_accessors.csql_operator_to_cycl_operator(operator);
        SubLObject arg1_cycl = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject arg2_cycl = (SubLObject)sksi_csql_utilities.NIL;
        if (sksi_csql_utilities.NIL != csql_eval_expression_p(arg1)) {
            arg1_cycl = construct_field_value_sentence_eval_exp_int(csql_expression_arg1(arg1), sk_source, from_expression);
        }
        else {
            arg1_cycl = arg1;
        }
        if (sksi_csql_utilities.NIL != csql_eval_expression_p(arg2)) {
            arg2_cycl = construct_field_value_sentence_eval_exp_int(csql_expression_arg1(arg2), sk_source, from_expression);
        }
        else {
            arg2_cycl = arg2;
        }
        return el_utilities.make_el_formula(cycl_operator, (SubLObject)ConsesLow.list(arg1_cycl, arg2_cycl), (SubLObject)sksi_csql_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 63017L)
    public static SubLObject construct_field_value_sentence_eval_exp_int(final SubLObject eval_expression, final SubLObject sk_source, final SubLObject from_expression) {
        if (eval_expression.isAtom()) {
            return eval_expression;
        }
        if (sksi_csql_utilities.NIL != csql_field_expression_p(eval_expression)) {
            return el_utilities.make_el_formula(sksi_csql_utilities.$const78$FieldValueFn, (SubLObject)ConsesLow.list(make_pfi_for_csql_field_expression(eval_expression, sk_source, from_expression)), (SubLObject)sksi_csql_utilities.UNPROVIDED);
        }
        if (sksi_csql_utilities.NIL != csql_functional_expression_p(eval_expression)) {
            final SubLObject operator = csql_expression_operator(eval_expression);
            final SubLObject cycl_operator = sksi_kb_accessors.csql_operator_to_cycl_operator(operator);
            final SubLObject args = csql_expression_arguments(eval_expression);
            SubLObject new_args = (SubLObject)sksi_csql_utilities.NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = (SubLObject)sksi_csql_utilities.NIL;
            arg = cdolist_list_var.first();
            while (sksi_csql_utilities.NIL != cdolist_list_var) {
                new_args = (SubLObject)ConsesLow.cons(construct_field_value_sentence_eval_exp_int(arg, sk_source, from_expression), new_args);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            new_args = Sequences.nreverse(new_args);
            return el_utilities.make_el_formula(cycl_operator, new_args, (SubLObject)sksi_csql_utilities.UNPROVIDED);
        }
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 63965L)
    public static SubLObject invalid_csql_expressionP(final SubLObject csql) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_csql_utilities.NIL == csql || sksi_csql_utilities.NIL != cycl_utilities.expression_find((SubLObject)sksi_csql_utilities.$kw79$UNREFORMULATABLE, csql, (SubLObject)sksi_csql_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_csql_utilities.EQ), (SubLObject)sksi_csql_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-utilities.lisp", position = 64300L)
    public static SubLObject destructure_csql_select_query(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject select = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject from = (SubLObject)sksi_csql_utilities.NIL;
        SubLObject where = (SubLObject)sksi_csql_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list80);
        select = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list80);
        from = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list80);
        where = current.first();
        current = current.rest();
        if (sksi_csql_utilities.NIL == current) {
            current = temp;
            SubLObject select_query = (SubLObject)sksi_csql_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_utilities.$list80);
            select_query = current.first();
            final SubLObject body;
            current = (body = current.rest());
            final SubLObject select_keyword = (SubLObject)sksi_csql_utilities.$sym81$SELECT_KEYWORD;
            final SubLObject select_fields = (SubLObject)sksi_csql_utilities.$sym82$SELECT_FIELDS;
            final SubLObject from_clause = (SubLObject)sksi_csql_utilities.$sym83$FROM_CLAUSE;
            final SubLObject where_clause = (SubLObject)sksi_csql_utilities.$sym84$WHERE_CLAUSE;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$sym85$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(select_keyword, select_fields, from_clause, (SubLObject)sksi_csql_utilities.$sym86$_OPTIONAL, where_clause), select_query, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$sym87$IGNORE, select_keyword), (SubLObject)ConsesLow.listS((SubLObject)sksi_csql_utilities.$sym88$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(select, select_fields), (SubLObject)ConsesLow.list(from, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$sym89$SECOND, from_clause)), (SubLObject)ConsesLow.list(where, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$sym89$SECOND, where_clause))), ConsesLow.append(body, (SubLObject)sksi_csql_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_csql_utilities.$list80);
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    public static SubLObject declare_sksi_csql_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_expression_operator", "CSQL-EXPRESSION-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_expression_arguments", "CSQL-EXPRESSION-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_expression_arg", "CSQL-EXPRESSION-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_expression_arg1", "CSQL-EXPRESSION-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_expression_arg2", "CSQL-EXPRESSION-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_expression_arg3", "CSQL-EXPRESSION-ARG3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_true_p", "CSQL-TRUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_false_p", "CSQL-FALSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_non_commutative_comparison_operator_p", "CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_anti_reflexive_comparison_operator_p", "CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_negated_comparison_operator_p", "CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_comparison_operator_p", "CSQL-WHERE-CLAUSE-COMPARISON-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_boolean_logical_operator_p", "CSQL-WHERE-CLAUSE-BOOLEAN-LOGICAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_quantifier_logical_operator_p", "CSQL-WHERE-CLAUSE-QUANTIFIER-LOGICAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_logical_operator_p", "CSQL-WHERE-CLAUSE-LOGICAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_terminal_operator_p", "CSQL-WHERE-CLAUSE-TERMINAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_commutative_operator_p", "CSQL-WHERE-CLAUSE-COMMUTATIVE-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_operator_p", "CSQL-WHERE-CLAUSE-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_operator_p", "CSQL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_from_clause_p", "CSQL-FROM-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_p", "CSQL-WHERE-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_select_query_p", "CSQL-SELECT-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_csql_expression", "MAKE-CSQL-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_pfi_for_csql_field_expression", "MAKE-PFI-FOR-CSQL-FIELD-EXPRESSION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_expression_p", "CSQL-FIELD-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "construct_csql_field_expression", "CONSTRUCT-CSQL-FIELD-EXPRESSION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_expression_field_name", "CSQL-FIELD-EXPRESSION-FIELD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_expression_table_name", "CSQL-FIELD-EXPRESSION-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_expression_namespace", "CSQL-FIELD-EXPRESSION-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_expression_has_namespaceP", "CSQL-FIELD-EXPRESSION-HAS-NAMESPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_table_alias", "MAKE-TABLE-ALIAS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_expression_p", "CSQL-TABLE-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_expression_table_name", "CSQL-TABLE-EXPRESSION-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_expression_alias", "CSQL-TABLE-EXPRESSION-ALIAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_expression_namespace", "CSQL-TABLE-EXPRESSION-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_expression_has_namespaceP", "CSQL-TABLE-EXPRESSION-HAS-NAMESPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_eval_expression_p", "CSQL-EVAL-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_functional_expression_p", "CSQL-FUNCTIONAL-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "boolean_csqlP", "BOOLEAN-CSQL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "boolean_csql_selectP", "BOOLEAN-CSQL-SELECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_subclause_with_operator_p", "CSQL-WHERE-SUBCLAUSE-WITH-OPERATOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_disjunction_p", "CSQL-DISJUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_disjunction_disjuncts", "CSQL-DISJUNCTION-DISJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_csql_implicit_conjunction", "MAKE-CSQL-IMPLICIT-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_conjunction_p", "CSQL-CONJUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_explicit_conjunction_p", "CSQL-EXPLICIT-CONJUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_implicit_conjunction_p", "CSQL-IMPLICIT-CONJUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_conjunction_conjuncts", "CSQL-CONJUNCTION-CONJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_equality_relation_p", "CSQL-EQUALITY-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_equal_clause_p", "CSQL-EQUAL-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_L_clause_p", "CSQL-<-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_LE_clause_p", "CSQL-<=-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_G_clause_p", "CSQL->-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_GE_clause_p", "CSQL->=-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_LG_clause_p", "CSQL-<>-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_like_clause_p", "CSQL-LIKE-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_subword_clause_p", "CSQL-SUBWORD-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_substring_clause_p", "CSQL-SUBSTRING-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_isubstring_clause_p", "CSQL-ISUBSTRING-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_different_clause_p", "CSQL-DIFFERENT-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_later_than_clause_p", "CSQL-LATER-THAN-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_negation_p", "CSQL-NEGATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_comparison_clause_p", "CSQL-COMPARISON-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_subclause_p", "CSQL-WHERE-SUBCLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_comparison_or_p", "CSQL-COMPARISON-OR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_comparison_and_p", "CSQL-COMPARISON-AND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_conjoin_expressions", "CSQL-CONJOIN-EXPRESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_disjoin_expressions", "CSQL-DISJOIN-EXPRESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_negate_expression", "CSQL-NEGATE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_negate_comparison_relation", "CSQL-NEGATE-COMPARISON-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_csql_query", "MAKE-CSQL-QUERY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_csql_query_int", "MAKE-CSQL-QUERY-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "make_sparql_csql_query", "MAKE-SPARQL-CSQL-QUERY", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "determine_sparql_equivalent_fields_classes", "DETERMINE-SPARQL-EQUIVALENT-FIELDS-CLASSES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "sort_2_csql_fields", "SORT-2-CSQL-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_L", "CSQL-FIELD-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql", "CANONICALIZE-CSQL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql_fields_clause", "CANONICALIZE-CSQL-FIELDS-CLAUSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql_from_clause", "CANONICALIZE-CSQL-FROM-CLAUSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql_tables_clause", "CANONICALIZE-CSQL-TABLES-CLAUSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql_where_clause", "CANONICALIZE-CSQL-WHERE-CLAUSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql_stripped_where_clause", "CANONICALIZE-CSQL-STRIPPED-WHERE-CLAUSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "canonicalize_csql_where_expression", "CANONICALIZE-CSQL-WHERE-EXPRESSION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "simplify_csql_query", "SIMPLIFY-CSQL-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "simplify_csql_expressions", "SIMPLIFY-CSQL-EXPRESSIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_p", "CSQL-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_name", "CSQL-FIELD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_table_name", "CSQL-FIELD-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_field_namespace", "CSQL-FIELD-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_name", "CSQL-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_table_alias", "CSQL-TABLE-ALIAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "simplify_csql_expressions_with_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITH-WHERE-CLAUSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "simplify_csql_expressions_without_where_clause", "SIMPLIFY-CSQL-EXPRESSIONS-WITHOUT-WHERE-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "simplify_where_expressions", "SIMPLIFY-WHERE-EXPRESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "inconsistent_where_expressionP", "INCONSISTENT-WHERE-EXPRESSION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_unify_possible", "CSQL-UNIFY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "sql_regular_expression_char_p", "SQL-REGULAR-EXPRESSION-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "sql_regular_expression_string_p", "SQL-REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_unify_possible_int", "CSQL-UNIFY-POSSIBLE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_ground_term_p", "CSQL-GROUND-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "contract_where_clause", "CONTRACT-WHERE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "contract_where_expression", "CONTRACT-WHERE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_eliminate_unnecessary_joins", "CSQL-ELIMINATE-UNNECESSARY-JOINS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_find_joins", "CSQL-WHERE-FIND-JOINS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_find_field_map", "CSQL-WHERE-FIND-FIELD-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_find_field_map_int", "CSQL-WHERE-FIND-FIELD-MAP-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_remove_redundant_select_fields", "CSQL-REMOVE-REDUNDANT-SELECT-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_field_equals_some_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-SOME-FIELD?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_clause_field_equals_fieldP", "CSQL-WHERE-CLAUSE-FIELD-EQUALS-FIELD?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_expression_field_equals_fieldP", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_where_expression_field_equals_fieldP_int", "CSQL-WHERE-EXPRESSION-FIELD-EQUALS-FIELD?-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_to_el", "CSQL-TO-EL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_to_cycl", "CSQL-TO-CYCL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_to_cycl_int", "CSQL-TO-CYCL-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_to_cycl_recursive", "CSQL-TO-CYCL-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "csql_to_cycl_recursive_2", "CSQL-TO-CYCL-RECURSIVE-2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "construct_field_value_sentence", "CONSTRUCT-FIELD-VALUE-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "construct_field_value_sentence_two_pfis", "CONSTRUCT-FIELD-VALUE-SENTENCE-TWO-PFIS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "construct_field_value_sentence_one_pfi", "CONSTRUCT-FIELD-VALUE-SENTENCE-ONE-PFI", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "construct_field_value_sentence_eval_exp", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "construct_field_value_sentence_eval_exp_int", "CONSTRUCT-FIELD-VALUE-SENTENCE-EVAL-EXP-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "invalid_csql_expressionP", "INVALID-CSQL-EXPRESSION?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities", "destructure_csql_select_query", "DESTRUCTURE-CSQL-SELECT-QUERY");
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    public static SubLObject init_sksi_csql_utilities_file() {
        sksi_csql_utilities.$csql_where_clause_commutative_comparison_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-COMMUTATIVE-COMPARISON-OPERATORS*", (SubLObject)sksi_csql_utilities.$list0);
        sksi_csql_utilities.$csql_where_clause_non_commutative_comparison_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-NON-COMMUTATIVE-COMPARISON-OPERATORS*", (SubLObject)sksi_csql_utilities.$list1);
        sksi_csql_utilities.$csql_where_clause_reflexive_comparison_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-REFLEXIVE-COMPARISON-OPERATORS*", (SubLObject)sksi_csql_utilities.$list2);
        sksi_csql_utilities.$csql_where_clause_anti_reflexive_comparison_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-ANTI-REFLEXIVE-COMPARISON-OPERATORS*", (SubLObject)sksi_csql_utilities.$list3);
        sksi_csql_utilities.$csql_where_clause_negated_comparison_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-NEGATED-COMPARISON-OPERATORS*", (SubLObject)sksi_csql_utilities.$list3);
        sksi_csql_utilities.$csql_where_clause_comparison_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-COMPARISON-OPERATORS*", ConsesLow.append(sksi_csql_utilities.$csql_where_clause_commutative_comparison_operators$.getGlobalValue(), sksi_csql_utilities.$csql_where_clause_non_commutative_comparison_operators$.getGlobalValue()));
        sksi_csql_utilities.$csql_where_clause_terminal_operators$ = SubLFiles.deflexical("*CSQL-WHERE-CLAUSE-TERMINAL-OPERATORS*", (SubLObject)sksi_csql_utilities.$list4);
        sksi_csql_utilities.$csql_other_operators$ = SubLFiles.deflexical("*CSQL-OTHER-OPERATORS*", (SubLObject)sksi_csql_utilities.$list5);
        sksi_csql_utilities.$csql_true$ = SubLFiles.deflexical("*CSQL-TRUE*", (SubLObject)sksi_csql_utilities.T);
        sksi_csql_utilities.$csql_false$ = SubLFiles.deflexical("*CSQL-FALSE*", (SubLObject)sksi_csql_utilities.NIL);
        sksi_csql_utilities.$csql_comparison_relation_negations$ = SubLFiles.deflexical("*CSQL-COMPARISON-RELATION-NEGATIONS*", (SubLObject)sksi_csql_utilities.$list35);
        sksi_csql_utilities.$sql_regular_expression_meta_characters$ = SubLFiles.defconstant("*SQL-REGULAR-EXPRESSION-META-CHARACTERS*", (SubLObject)sksi_csql_utilities.$str66$__);
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_csql_utilities_file() {
        sunit_external.define_test_category((SubLObject)sksi_csql_utilities.$str90$SKSI_CSQL_Utilities_Category, (SubLObject)ConsesLow.list((SubLObject)sksi_csql_utilities.$str91$SKSI_Category));
        return (SubLObject)sksi_csql_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_sksi_csql_utilities_file();
    }
    
    public void initializeVariables() {
        init_sksi_csql_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_sksi_csql_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_csql_utilities();
        sksi_csql_utilities.$csql_where_clause_commutative_comparison_operators$ = null;
        sksi_csql_utilities.$csql_where_clause_non_commutative_comparison_operators$ = null;
        sksi_csql_utilities.$csql_where_clause_reflexive_comparison_operators$ = null;
        sksi_csql_utilities.$csql_where_clause_anti_reflexive_comparison_operators$ = null;
        sksi_csql_utilities.$csql_where_clause_negated_comparison_operators$ = null;
        sksi_csql_utilities.$csql_where_clause_comparison_operators$ = null;
        sksi_csql_utilities.$csql_where_clause_terminal_operators$ = null;
        sksi_csql_utilities.$csql_other_operators$ = null;
        sksi_csql_utilities.$csql_true$ = null;
        sksi_csql_utilities.$csql_false$ = null;
        sksi_csql_utilities.$csql_comparison_relation_negations$ = null;
        sksi_csql_utilities.$sql_regular_expression_meta_characters$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNotEqual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLTimesFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLPlusFn")));
        $list1 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDifferenceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLQuotientFn")), SubLObjectFactory.makeKeyword("IN"), SubLObjectFactory.makeKeyword("BETWEEN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLike")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLUnlike")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLike-CaseInsensitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSubstring")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStringSubword")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSubstring-CaseInsensitive")) });
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLike")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLike-CaseInsensitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSubstring")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSubstring-CaseInsensitive")));
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNotEqual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLUnlike")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDifferent")));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeKeyword("VALUES"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("KEY-VALUE"));
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SELECT"), SubLObjectFactory.makeKeyword("INSERT"), SubLObjectFactory.makeKeyword("DELETE"), SubLObjectFactory.makeKeyword("FROM"), SubLObjectFactory.makeKeyword("INTO"), SubLObjectFactory.makeKeyword("WHERE"), SubLObjectFactory.makeKeyword("FIELD"), SubLObjectFactory.makeKeyword("TABLE"), SubLObjectFactory.makeKeyword("KEY"), SubLObjectFactory.makeKeyword("KEY-VALUE"), SubLObjectFactory.makeKeyword("COUNT"), SubLObjectFactory.makeKeyword("ALL") });
        $kw6$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw7$WHERE = SubLObjectFactory.makeKeyword("WHERE");
        $kw8$SELECT = SubLObjectFactory.makeKeyword("SELECT");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeKeyword("KEY"), (SubLObject)SubLObjectFactory.makeKeyword("KEY-VALUE"));
        $kw10$FIELD = SubLObjectFactory.makeKeyword("FIELD");
        $kw11$TABLE_ALIAS = SubLObjectFactory.makeKeyword("TABLE-ALIAS");
        $kw12$TABLE = SubLObjectFactory.makeKeyword("TABLE");
        $kw13$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERBY"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $const16$CSQLOr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLOr"));
        $const17$CSQLAnd = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLAnd"));
        $sym18$CSQL_WHERE_SUBCLAUSE_P = SubLObjectFactory.makeSymbol("CSQL-WHERE-SUBCLAUSE-P");
        $list19 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")));
        $const20$CSQLLessThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThan"));
        $const21$CSQLLessThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThanOrEqualTo"));
        $const22$CSQLGreaterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan"));
        $const23$CSQLGreaterThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThanOrEqualTo"));
        $const24$CSQLNotEqual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNotEqual"));
        $const25$CSQLLike = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLike"));
        $const26$CSQLStringSubword = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStringSubword"));
        $const27$CSQLSubstring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSubstring"));
        $const28$CSQLSubstring_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSubstring-CaseInsensitive"));
        $const29$CSQLDifferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDifferent"));
        $const30$CSQLLaterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLaterThan"));
        $const31$CSQLNot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNot"));
        $kw32$NOT_NULL = SubLObjectFactory.makeKeyword("NOT-NULL");
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLOr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")));
        $sym34$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNotEqual"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNotEqual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThanOrEqualTo"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThan"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThanOrEqualTo"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLGreaterThanOrEqualTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLLessThan"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDifferent"))), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLDifferent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals"))));
        $sym36$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE-SHORT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $str38$subject = SubLObjectFactory.makeString("subject");
        $str39$predicate = SubLObjectFactory.makeString("predicate");
        $str40$object = SubLObjectFactory.makeString("object");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2"));
        $const42$CSQLEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-KEYWORD-2"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION1-2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION2-2"));
        $const44$CSQLExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLExists"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-SELECT"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-FROM"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-WHERE"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-WHERE"));
        $kw47$UNKNOWN_SENTENCE = SubLObjectFactory.makeKeyword("UNKNOWN-SENTENCE");
        $kw48$EXISTENTIAL_VARIABLES = SubLObjectFactory.makeKeyword("EXISTENTIAL-VARIABLES");
        $sym49$CSQL_FIELD__ = SubLObjectFactory.makeSymbol("CSQL-FIELD-<");
        $kw50$LITERAL = SubLObjectFactory.makeKeyword("LITERAL");
        $str51$_VAR = SubLObjectFactory.makeString("?VAR");
        $sym52$CSQL_COMPARISON_PREDICATE_P = SubLObjectFactory.makeSymbol("CSQL-COMPARISON-PREDICATE-P");
        $sym53$LITERAL_PREDICATE = SubLObjectFactory.makeSymbol("LITERAL-PREDICATE");
        $str54$Could_not_correctly_order_compari = SubLObjectFactory.makeString("Could not correctly order comparison literals in SPARQL SKSI query, they will be stuck at the end");
        $kw55$VARIABLES = SubLObjectFactory.makeKeyword("VARIABLES");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-CLAUSE"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"));
        $str60$malformed_csql_expression__a__exp = SubLObjectFactory.makeString("malformed csql expression ~a, expected :select");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"));
        $str62$malformed_csql_expression__a__exp = SubLObjectFactory.makeString("malformed csql expression ~a, expected :from");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-CLAUSE"));
        $str64$malformed_csql_expression__a__exp = SubLObjectFactory.makeString("malformed csql expression ~a, expected :where");
        $sym65$CSQL_FIELD_TABLE_NAME = SubLObjectFactory.makeSymbol("CSQL-FIELD-TABLE-NAME");
        $str66$__ = SubLObjectFactory.makeString("_%");
        $sym67$SQL_REGULAR_EXPRESSION_CHAR_P = SubLObjectFactory.makeSymbol("SQL-REGULAR-EXPRESSION-CHAR-P");
        $const68$CSQLStrictlyEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals"));
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT"));
        $const70$CSQLUnlike = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLUnlike"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-CLAIMS-CYCL"));
        $const72$fieldIndexicalsEqual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldIndexicalsEqual"));
        $const73$fieldIndexicalsComparison = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldIndexicalsComparison"));
        $const74$fieldValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValue"));
        $const75$fieldValueComparison_Inverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValueComparison-Inverse"));
        $const76$fieldValueComparison = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValueComparison"));
        $const77$numericallyEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numericallyEquals"));
        $const78$FieldValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FieldValueFn"));
        $kw79$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE")), (SubLObject)SubLObjectFactory.makeSymbol("SELECT-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym81$SELECT_KEYWORD = SubLObjectFactory.makeUninternedSymbol("SELECT-KEYWORD");
        $sym82$SELECT_FIELDS = SubLObjectFactory.makeUninternedSymbol("SELECT-FIELDS");
        $sym83$FROM_CLAUSE = SubLObjectFactory.makeUninternedSymbol("FROM-CLAUSE");
        $sym84$WHERE_CLAUSE = SubLObjectFactory.makeUninternedSymbol("WHERE-CLAUSE");
        $sym85$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym86$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $sym87$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym88$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym89$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str90$SKSI_CSQL_Utilities_Category = SubLObjectFactory.makeString("SKSI CSQL Utilities Category");
        $str91$SKSI_Category = SubLObjectFactory.makeString("SKSI Category");
    }
}

/*

	Total time: 744 ms
	 synthetic 
*/