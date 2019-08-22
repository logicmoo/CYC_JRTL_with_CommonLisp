package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_csql_interpretation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_csql_interpretation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation";

    public static final String myFingerPrint = "06ed67e87eb54fd21453192b3b5330a2f0275c4265cee3a84b51388a00fb1644";

    // deflexical
    private static final SubLSymbol $sql_backends_that_should_not_escape_single_quotes$ = makeSymbol("*SQL-BACKENDS-THAT-SHOULD-NOT-ESCAPE-SINGLE-QUOTES*");

    // deflexical
    private static final SubLSymbol $sql_wildcard_characters$ = makeSymbol("*SQL-WILDCARD-CHARACTERS*");



    public static final SubLSymbol SKSI_SUPPORTED_DATABASE_SERVER_PROGRAM_P = makeSymbol("SKSI-SUPPORTED-DATABASE-SERVER-PROGRAM-P");



    private static final SubLSymbol $sym3$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list4 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);











    private static final SubLString $str10$unknown_csql_operator__a_in_expre = makeString("unknown csql operator ~a in expression ~a");



    private static final SubLString $str12$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str13$csql_to_sql_failure___A_A = makeString("csql-to-sql failure: ~A~A");

    private static final SubLString $$$_problem_ = makeString(" problem ");

    private static final SubLString $str15$_ = makeString(".");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol TEST_CSQL_TO_SQL = makeSymbol("TEST-CSQL-TO-SQL");



    private static final SubLSymbol $sym20$STRING_ = makeSymbol("STRING=");











    private static final SubLObject $list26 = _constant_26_initializer();

    private static final SubLList $list27 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("ORDER-BY"));

    private static final SubLString $str28$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");



    private static final SubLString $$$SELECT_ = makeString("SELECT ");

    private static final SubLString $$$SELECT_DISTINCT_ = makeString("SELECT DISTINCT ");

    public static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$WHERE_ = makeString("WHERE ");

    private static final SubLString $$$_AND_ = makeString(" AND ");

    private static final SubLObject $$MSSQLServer = reader_make_constant_shell(makeString("MSSQLServer"));

    private static final SubLString $$$LIMIT_1 = makeString("LIMIT 1");

    private static final SubLList $list37 = list(makeKeyword("COUNT"), makeKeyword("ALL"));

    private static final SubLObject $$MySQL_TheProgram = reader_make_constant_shell(makeString("MySQL-TheProgram"));

    private static final SubLObject $$PostgreSQL = reader_make_constant_shell(makeString("PostgreSQL"));

    private static final SubLString $str40$_ = makeString("*");

    private static final SubLString $str41$ = makeString("");

    private static final SubLString $str42$COUNT___ = makeString("COUNT(*)");

    private static final SubLString $str43$TOP_1__ = makeString("TOP(1) ");



    private static final SubLString $$$_FROM_ = makeString(" FROM ");

    private static final SubLString $str46$__ = makeString(", ");

    private static final SubLString $str47$_AND__ = makeString(" AND (");

    private static final SubLString $str48$_IS_NOT_NULL_ = makeString(" IS NOT NULL)");

    private static final SubLString $str49$_ = makeString("(");

    private static final SubLList $list50 = list(makeSymbol("KEYWORD"), makeSymbol("FIELD-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TABLE-NAME"), makeSymbol("NAMESPACE"));

    private static final SubLList $list51 = list(makeSymbol("ORDER-BY-KEYWORD"), makeSymbol("FIELD-INFOS"));



    private static final SubLString $str53$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :order-by");

    private static final SubLString $$$ORDER_BY_ = makeString("ORDER BY ");

    private static final SubLList $list55 = list(makeSymbol("FIELD"), makeSymbol("&OPTIONAL"), makeSymbol("ORDER"));

    private static final SubLString $str56$__ = makeString("\\\'");

    private static final SubLString $str57$_ = makeString("'");

    private static final SubLList $list58 = list(makeString("\\\""));

    private static final SubLSymbol SKSI_REPLACE_DOUBLE_QUOTES_WITH_SINGLE_QUOTES_IN_SQL_STRING_INT = makeSymbol("SKSI-REPLACE-DOUBLE-QUOTES-WITH-SINGLE-QUOTES-IN-SQL-STRING-INT");

    private static final SubLString $str60$_ = makeString("\"");

    private static final SubLList $list61 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-EXPRESSIONS"));



    private static final SubLString $str63$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :where");

    private static final SubLList $list64 = list(reader_make_constant_shell(makeString("IBM-DB2-TheProgram")), reader_make_constant_shell(makeString("Sybase-IQ")), reader_make_constant_shell(makeString("PostgreSQL")));

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $str67$No_NAUTs_allowed_in_CSQL_where_ex = makeString("No NAUTs allowed in CSQL where expressions: ~a.");







    private static final SubLObject $$CSQLStrictlyEquals = reader_make_constant_shell(makeString("CSQLStrictlyEquals"));

    private static final SubLObject $$CSQLGreaterThan = reader_make_constant_shell(makeString("CSQLGreaterThan"));

    private static final SubLObject $$CSQLLessThan = reader_make_constant_shell(makeString("CSQLLessThan"));

    private static final SubLObject $$CSQLNotEqual = reader_make_constant_shell(makeString("CSQLNotEqual"));

    private static final SubLObject $$CSQLGreaterThanOrEqualTo = reader_make_constant_shell(makeString("CSQLGreaterThanOrEqualTo"));

    private static final SubLObject $$CSQLLessThanOrEqualTo = reader_make_constant_shell(makeString("CSQLLessThanOrEqualTo"));

    private static final SubLObject $$CSQLTimesFn = reader_make_constant_shell(makeString("CSQLTimesFn"));

    private static final SubLObject $$CSQLPlusFn = reader_make_constant_shell(makeString("CSQLPlusFn"));

    private static final SubLObject $$CSQLDifferenceFn = reader_make_constant_shell(makeString("CSQLDifferenceFn"));

    private static final SubLObject $$CSQLQuotientFn = reader_make_constant_shell(makeString("CSQLQuotientFn"));

    private static final SubLObject $$CSQLLike = reader_make_constant_shell(makeString("CSQLLike"));

    private static final SubLObject $$CSQLLike_CaseInsensitive = reader_make_constant_shell(makeString("CSQLLike-CaseInsensitive"));

    private static final SubLObject $$CSQLUnlike = reader_make_constant_shell(makeString("CSQLUnlike"));

    private static final SubLObject $$CSQLLaterThan = reader_make_constant_shell(makeString("CSQLLaterThan"));

    private static final SubLObject $$CSQLEquals = reader_make_constant_shell(makeString("CSQLEquals"));

    private static final SubLObject $$CSQLDifferent = reader_make_constant_shell(makeString("CSQLDifferent"));









    private static final SubLString $str91$unknown_csql_where_clause_operato = makeString("unknown csql where clause operator ~a in clause ~a");

    private static final SubLString $$$CYC = makeString("CYC");



    private static final SubLString $$$NULL = makeString("NULL");

    private static final SubLObject $$MSAccess = reader_make_constant_shell(makeString("MSAccess"));

    private static final SubLString $str96$DATEVALUE_ = makeString("DATEVALUE(");

    private static final SubLString $str97$_ = makeString(")");

    private static final SubLList $list98 = list(makeSymbol("FIELD"), makeSymbol("&OPTIONAL"), makeSymbol("TABLE"), makeSymbol("NAMESPACE"));

    private static final SubLList $list99 = list(makeSymbol("LEFT"), makeSymbol("RIGHT"));

    private static final SubLList $list100 = list(reader_make_constant_shell(makeString("CSQLNotEqual")), reader_make_constant_shell(makeString("CSQLUnlike")));

    private static final SubLObject $$CSQLAnd = reader_make_constant_shell(makeString("CSQLAnd"));

    private static final SubLObject $$CSQLOr = reader_make_constant_shell(makeString("CSQLOr"));

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLString $str104$unrecognized_comparison_list_oper = makeString("unrecognized comparison list operator ~a");



    private static final SubLString $str106$_f = makeString("~f");

    private static final SubLObject $$IBM_DB2_TheProgram = reader_make_constant_shell(makeString("IBM-DB2-TheProgram"));

    private static final SubLList $list108 = list(CHAR_quote, CHAR_quotation);

    private static final SubLString $str109$_a = makeString("~a");

    private static final SubLString $str110$Unknown_operator_syntax__a_for__a = makeString("Unknown operator syntax ~a for ~a in SQL flavor ~a");

    private static final SubLSymbol TEST_MAKE_SQL_FOR_WHERE_EXPRESSION_INT = makeSymbol("TEST-MAKE-SQL-FOR-WHERE-EXPRESSION-INT");

    private static final SubLList $list112 = list(list(list(list(reader_make_constant_shell(makeString("CSQLConcatenateStringsFn")), list(makeKeyword("FIELD"), makeString("SUPPLIER_NAME"), makeString("SUPPLIER826028")), makeString(" I hope this works")), reader_make_constant_shell(makeString("IBM-DB2-TheProgram"))), makeString("CONCAT(SUPPLIER826028.SUPPLIER_NAME, ' I hope this works')")), list(list(list(reader_make_constant_shell(makeString("CSQLSubstring")), makeString("64bit"), list(makeKeyword("FIELD"), makeString("OS"), makeString("DETAIL842333"))), reader_make_constant_shell(makeString("IBM-DB2-TheProgram"))), makeString("(DETAIL842333.OS LIKE '%64bit%')")));

    private static final SubLString $str113$__ = makeString("()");

    private static final SubLList $list114 = list(CHAR_percent, CHAR_underbar);

    private static final SubLSymbol $sym115$SQL_WILDCARD_CHARACTER_ = makeSymbol("SQL-WILDCARD-CHARACTER?");

    private static final SubLString $str116$_a_is_not___CSQLEquals_or___CSQLD = makeString("~a is not #$CSQLEquals or #$CSQLDifferent");

    private static final SubLList $list117 = list(makeSymbol("TEST"), makeSymbol("LOW"), makeSymbol("HIGH"));

    private static final SubLObject $$OracleDatabaseServer_TheProgram = reader_make_constant_shell(makeString("OracleDatabaseServer-TheProgram"));

    private static final SubLString $$$_BETWEEN_ = makeString(" BETWEEN ");

    public static final SubLString $str120$__ = makeString("((");

    private static final SubLString $str121$____ = makeString(" >= ");

    private static final SubLString $str122$__AND__ = makeString(") AND (");

    private static final SubLString $str123$____ = makeString(" <= ");

    private static final SubLString $str124$__ = makeString("))");

    private static final SubLList $list125 = list(makeSymbol("FIELD"), makeSymbol("LIST-OR-QUERY"));



    private static final SubLString $str127$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected a list beginning with :list or :select");

    private static final SubLString $str128$_IN__ = makeString(" IN (");

    private static final SubLSymbol DATABASE_DATE_STRING_CHAR_P = makeSymbol("DATABASE-DATE-STRING-CHAR-P");

    private static final SubLList $list130 = list(CHAR_space, CHAR_colon, CHAR_hyphen);

    public static final SubLList $list131 = list(makeSymbol("INSERT-KEYWORD"), makeSymbol("INTO"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"));

    private static final SubLSymbol $AUTO_INCREMENT_DEFAULT = makeKeyword("AUTO-INCREMENT-DEFAULT");

    private static final SubLString $$$INSERT_ = makeString("INSERT ");

    private static final SubLString $str134$__ = makeString(" (");

    public static final SubLList $list135 = list(makeSymbol("FIELD-KEYWORD"), makeSymbol("FIELD-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TABLE"), makeSymbol("NAMESPACE"));

    private static final SubLString $str136$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :field");



    public static final SubLList $list138 = list(makeSymbol("VALUES-KEYWORD"), makeSymbol("VALUE-LIST"));



    public static final SubLString $str140$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :values");

    private static final SubLString $str141$_VALUES__ = makeString(" VALUES (");

    private static final SubLObject $$ApacheDerby = reader_make_constant_shell(makeString("ApacheDerby"));

    private static final SubLSymbol $sym143$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $$$DEFAULT = makeString("DEFAULT");



    private static final SubLString $str146$_nextval = makeString(".nextval");

    private static final SubLString $str147$nextval_ = makeString("nextval(");



    private static final SubLString $str149$currval__ = makeString("currval('");

    private static final SubLString $str150$__ = makeString("')");

    private static final SubLString $str151$SQL_multiple_insert__key_ref_valu = makeString("SQL multiple insert :key-ref value referred to an insert in the same group for which the sequence name was not provided.");

    private static final SubLString $str152$CYC_KEY_ = makeString("CYC_KEY_");

    private static final SubLString $str153$_CYC_KEY_ = makeString("@CYC_KEY_");

    private static final SubLString $str154$unknown_sql_flavor_ = makeString("unknown sql-flavor ");



    private static final SubLString $$$_INTO_ = makeString(" INTO ");

    private static final SubLList $list157 = list(makeSymbol("DELETE-KEYWORD"), makeSymbol("FROM"), makeSymbol("WHERE"));

    private static final SubLString $$$DELETE_ = makeString("DELETE ");

    private static final SubLString $$$_WHERE_ = makeString(" WHERE ");



    public static final SubLList $list161 = list(makeSymbol("FIELD-NAME"), makeSymbol("VALUE"));

    private static final SubLString $str162$___DATEVALUE_ = makeString(" = DATEVALUE(");

    private static final SubLString $str163$___ = makeString(" = ");

    private static final SubLString $str164$_IS_NULL_ = makeString(" IS NULL)");

    private static final SubLList $list165 = list(makeSymbol("UPDATE-KEYWORD"), makeSymbol("TABLE-CLAUSE"), makeSymbol("SET-CLAUSE"), makeSymbol("WHERE-CLAUSE"));

    private static final SubLString $$$UPDATE_ = makeString("UPDATE ");

    private static final SubLString $$$_SET_ = makeString(" SET ");

    private static final SubLList $list168 = list(makeSymbol("SET-KEYWORD"), makeSymbol("SET-EXPRESSIONS"));



    private static final SubLString $str170$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :set");

    private static final SubLSymbol SQL_PARANTHESIS_CHARACTER_P = makeSymbol("SQL-PARANTHESIS-CHARACTER-P");

    private static final SubLList $list172 = list(CHAR_lparen, CHAR_rparen);

    private static final SubLString $$$DECLARE = makeString("DECLARE");

    private static final SubLString $str174$_VARCHAR2_999__ = makeString(" VARCHAR2(999);");

    private static final SubLString $$$BEGIN = makeString("BEGIN");

    public static final SubLList $list176 = list(makeSymbol("INTO"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"), makeSymbol("RETURNING-CHOICE"));

    private static final SubLString $$$INSERT = makeString("INSERT");

    private static final SubLString $str178$END_ = makeString("END;");

    private static final SubLList $list179 = list(makeSymbol("INTO"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"), makeSymbol("SEQUENCE-NAME"));

    private static final SubLString $str180$_ = makeString(";");

    private static final SubLString $$$_RETURNING_ = makeString(" RETURNING ");

    private static final SubLString $str182$_INTO_CYC_KEY_ = makeString(" INTO CYC_KEY_");

    private static final SubLString $str183$__ = makeString("; ");

    private static final SubLString $str184$select__CYC_KEY_ = makeString("select @CYC_KEY_");

    private static final SubLString $str185$__last_insert_id___ = makeString(":=last_insert_id();");

    private static final SubLString $str186$DECLARE__CYC_KEY_ = makeString("DECLARE @CYC_KEY_");

    private static final SubLString $str187$VARCHAR_999__ = makeString("VARCHAR(999);");

    private static final SubLString $str188$SET__CYC_KEY_ = makeString("SET @CYC_KEY_");

    private static final SubLString $str189$___SCOPE_IDENTITY___ = makeString(" = SCOPE_IDENTITY();");

    private static final SubLList $list190 = list(makeSymbol("FIELD-KEYWORD"), makeSymbol("FIELD-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TABLE-NAME"), makeSymbol("NAMESPACE"));

    private static final SubLList $list191 = list(makeSymbol("OPERATOR-KEYWORD"), makeSymbol("TABLES"));

    private static final SubLString $str192$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected ~a");

    private static final SubLList $list193 = list(makeSymbol("TABLE-KEYWORD"), makeSymbol("TABLE-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TABLE-AS"), makeSymbol("NAMESPACE"));



    private static final SubLString $str195$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :table");

    private static final SubLString $$$_AS_ = makeString(" AS ");

    private static final SubLList $list197 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    private static final SubLString $str198$malformed_csql_expression__a = makeString("malformed csql expression ~a");



    private static final SubLSymbol CAADR = makeSymbol("CAADR");



    private static final SubLList $list202 = list(makeSymbol("OPERATOR-KEYWORD"), makeSymbol("INTO"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"));

    private static final SubLString $str203$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :insert");

    private static final SubLList $list204 = list(makeSymbol("VALUES-KEYWORD"), makeSymbol("FIELD-VALUE-LIST"));

    private static final SubLList $list205 = list(makeSymbol("OPERATOR-KEYWORD"), makeSymbol("FROM"), makeSymbol("WHERE-CLAUSE"));

    private static final SubLString $str206$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :delete");

    private static final SubLList $list207 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-CONDITIONS"));

    private static final SubLSymbol CADADR = makeSymbol("CADADR");

    private static final SubLSymbol CSQL_EXPRESSION_ARG2 = makeSymbol("CSQL-EXPRESSION-ARG2");

    public static SubLObject csql_to_sql(final SubLObject csql, final SubLObject sql_flavor, SubLObject translation_style) {
        if (translation_style == UNPROVIDED) {
            translation_style = $NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_kb_accessors.sksi_supported_database_server_program_p(sql_flavor) : "sksi_kb_accessors.sksi_supported_database_server_program_p(sql_flavor) " + "CommonSymbols.NIL != sksi_kb_accessors.sksi_supported_database_server_program_p(sql_flavor) " + sql_flavor;
        final SubLObject operator = csql.first();
        SubLObject error_message = NIL;
        SubLObject sql = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject was_appendingP = eval($sym3$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                    eval($list4);
                    try {
                        final SubLObject pcase_var = operator;
                        if (pcase_var.eql($SELECT)) {
                            sql = csql_to_sql_select(csql, sql_flavor, translation_style, UNPROVIDED);
                        } else
                            if (pcase_var.eql($INSERT)) {
                                sql = csql_to_sql_insert(csql, sql_flavor);
                            } else
                                if (pcase_var.eql($INSERT_MULTIPLE)) {
                                    sql = csql_to_sql_insert_multiple(csql, sql_flavor);
                                } else
                                    if (pcase_var.eql($DELETE)) {
                                        sql = csql_to_sql_delete(csql, sql_flavor);
                                    } else
                                        if (pcase_var.eql($UPDATE)) {
                                            sql = csql_to_sql_update(csql, sql_flavor);
                                        } else {
                                            Errors.error($str10$unknown_csql_operator__a_in_expre, operator, csql);
                                        }




                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            eval(list(CSETQ, $sym3$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str12$__SKSI__A_, $str13$csql_to_sql_failure___A_A), new SubLObject[]{ ONE_INTEGER, error_message, NIL != inference_worker.currently_active_problem() ? cconcatenate($$$_problem_, new SubLObject[]{ format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_worker.currently_active_problem_store())), $str15$_, format_nil.format_nil_a_no_copy(inference_datastructures_problem.problem_suid(inference_worker.currently_active_problem())) }) : NIL });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            sql = NIL;
        }
        return sql;
    }

    public static SubLObject test_csql_to_sql(final SubLObject csql, final SubLObject sql_flavor, SubLObject translation_style) {
        if (translation_style == UNPROVIDED) {
            translation_style = $NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = csql_to_sql(csql, sql_flavor, translation_style);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject csql_to_sql_select(final SubLObject csql, final SubLObject sql_flavor, SubLObject translation_style, SubLObject replace_double_quotesP) {
        if (translation_style == UNPROVIDED) {
            translation_style = $NORMAL;
        }
        if (replace_double_quotesP == UNPROVIDED) {
            replace_double_quotesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject field_string = NIL;
        SubLObject where_string = NIL;
        SubLObject table_string = NIL;
        SubLObject where_expression = NIL;
        SubLObject sql = NIL;
        SubLObject boolean_queryP = NIL;
        SubLObject select_keyword = NIL;
        SubLObject fields = NIL;
        SubLObject from = NIL;
        destructuring_bind_must_consp(csql, csql, $list27);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list27);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list27);
        from = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list27);
        current = current.rest();
        final SubLObject order_by = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list27);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(csql, $list27);
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SELECT != select_keyword)) {
            Errors.error($str28$malformed_csql_expression__a__exp, csql);
        }
        thread.resetMultipleValues();
        final SubLObject field_string_$2 = sql_interpret_csql_fields_value_select(fields, sql_flavor, translation_style);
        final SubLObject where_string_$3 = thread.secondMultipleValue();
        final SubLObject boolean_queryP_$4 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        field_string = field_string_$2;
        where_string = where_string_$3;
        boolean_queryP = boolean_queryP_$4;
        if (!field_string.isString()) {
            return NIL;
        }
        table_string = sql_interpret_csql_from_value(from, sql_flavor);
        if (NIL != where) {
            where_expression = make_sql_for_where_clause(where, sql_flavor, replace_double_quotesP);
            if (NIL == where_expression) {
                return NIL;
            }
        }
        final SubLObject select_header = ((translation_style == $BATCH) || (NIL != boolean_queryP)) ? $$$SELECT_ : $$$SELECT_DISTINCT_;
        final SubLObject where_header = cconcatenate($$$_, new SubLObject[]{ format_nil.format_nil_percent(), $$$WHERE_ });
        if (NIL != where_expression) {
            if ((NIL == where_string) || (NIL != string_utilities.empty_string_p(where_string))) {
                where_string = where_expression;
            } else {
                where_string = cconcatenate(where_expression, new SubLObject[]{ format_nil.format_nil_percent(), $$$_AND_, where_string });
            }
        }
        if ((NIL == where_string) || (NIL != string_utilities.empty_string_p(where_string))) {
            sql = cconcatenate(select_header, new SubLObject[]{ field_string, table_string });
        } else {
            sql = cconcatenate(select_header, new SubLObject[]{ field_string, table_string, where_header, where_string });
        }
        if ((NIL != boolean_queryP) && (NIL == kb_utilities.kbeq(sql_flavor, $$MSSQLServer))) {
            sql = cconcatenate(sql, new SubLObject[]{ $$$_, format_nil.format_nil_percent(), $$$LIMIT_1 });
        }
        if (NIL != order_by) {
            final SubLObject order_by_sql = make_sql_for_order_by_clause(order_by, sql_flavor);
            if (order_by_sql.isString()) {
                sql = cconcatenate(sql, new SubLObject[]{ $$$_, order_by_sql });
            }
        }
        return sql;
    }

    public static SubLObject sql_interpret_csql_fields_value_select(final SubLObject fields, final SubLObject sql_flavor, SubLObject translation_style) {
        if (translation_style == UNPROVIDED) {
            translation_style = $NORMAL;
        }
        if (fields.equal($list37)) {
            if (sql_flavor.eql($$MySQL_TheProgram) || sql_flavor.eql($$PostgreSQL)) {
                return values($str40$_, $str41$, T);
            }
            return values($str42$COUNT___, $str41$, NIL);
        } else {
            if (!fields.isInteger()) {
                return sql_for_field_names_select(fields, sql_flavor, translation_style);
            }
            if (sql_flavor.eql($$MSSQLServer)) {
                return values(cconcatenate($str43$TOP_1__, format_nil.format_nil_a_no_copy(fields)), $str41$, T);
            }
            return values(string_utilities.object_to_string(fields), $str41$, T);
        }
    }

    public static SubLObject sql_interpret_csql_from_value(final SubLObject from, final SubLObject sql_flavor) {
        final SubLObject table_names = csql_extract_table_names(from, $FROM, sql_flavor);
        final SubLObject sql = $$$_FROM_;
        return cconcatenate(format_nil.format_nil_percent(), new SubLObject[]{ sql, sql_for_table_names(table_names, sql_flavor) });
    }

    public static SubLObject sql_for_field_names_select(final SubLObject fields, final SubLObject sql_flavor, SubLObject translation_style) {
        if (translation_style == UNPROVIDED) {
            translation_style = $NORMAL;
        }
        SubLObject select_sql = NIL;
        SubLObject where_sql = NIL;
        SubLObject cdolist_list_var = fields;
        SubLObject field = NIL;
        field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sksi_csql_utilities.csql_field_expression_p(field)) {
                final SubLObject field_sql = sql_for_field(field);
                if (select_sql.isString()) {
                    select_sql = cconcatenate(select_sql, new SubLObject[]{ $str46$__, field_sql });
                } else {
                    select_sql = field_sql;
                }
                if (translation_style == $NORMAL) {
                    if (NIL != where_sql) {
                        where_sql = cconcatenate(where_sql, new SubLObject[]{ format_nil.format_nil_percent(), $str47$_AND__, field_sql, $str48$_IS_NOT_NULL_ });
                    } else {
                        where_sql = cconcatenate($str49$_, new SubLObject[]{ field_sql, $str48$_IS_NOT_NULL_ });
                    }
                }
            } else
                if (NIL != sksi_csql_utilities.csql_eval_expression_p(field)) {
                    final SubLObject eval_sql = make_sql_for_where_expression_int(sksi_csql_utilities.csql_expression_arg(field, ONE_INTEGER), sql_flavor);
                    if (!eval_sql.isString()) {
                        return values(NIL, NIL, NIL);
                    }
                    if (select_sql.isString()) {
                        select_sql = cconcatenate(select_sql, new SubLObject[]{ $str46$__, eval_sql });
                    } else {
                        select_sql = eval_sql;
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        } 
        return values(select_sql, where_sql, NIL);
    }

    public static SubLObject sql_for_field(final SubLObject csql_field) {
        SubLObject keyword = NIL;
        SubLObject field_name = NIL;
        destructuring_bind_must_consp(csql_field, csql_field, $list50);
        keyword = csql_field.first();
        SubLObject current = csql_field.rest();
        destructuring_bind_must_consp(current, csql_field, $list50);
        field_name = current.first();
        current = current.rest();
        final SubLObject table_name = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql_field, $list50);
        current = current.rest();
        final SubLObject namespace = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql_field, $list50);
        current = current.rest();
        if (NIL == current) {
            final SubLObject field_sql = (NIL != table_name) ? NIL != namespace ? cconcatenate(namespace, new SubLObject[]{ $str15$_, table_name, $str15$_, field_name }) : cconcatenate(table_name, new SubLObject[]{ $str15$_, field_name }) : field_name;
            return field_sql;
        }
        cdestructuring_bind_error(csql_field, $list50);
        return NIL;
    }

    public static SubLObject make_sql_for_order_by_clause(final SubLObject order_by, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sql = $str41$;
        SubLObject order_by_keyword = NIL;
        SubLObject field_infos = NIL;
        destructuring_bind_must_consp(order_by, order_by, $list51);
        order_by_keyword = order_by.first();
        SubLObject current = order_by.rest();
        destructuring_bind_must_consp(current, order_by, $list51);
        field_infos = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ORDER_BY != order_by_keyword)) {
                Errors.error($str53$malformed_csql_subexpression__a__, order_by);
            }
            sql = cconcatenate(sql, $$$ORDER_BY_);
            final SubLObject last_field_info = list_utilities.last_one(field_infos);
            SubLObject cdolist_list_var = field_infos;
            SubLObject field_info = NIL;
            field_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$6;
                final SubLObject datum_$5 = current_$6 = field_info;
                SubLObject field = NIL;
                destructuring_bind_must_consp(current_$6, datum_$5, $list55);
                field = current_$6.first();
                current_$6 = current_$6.rest();
                final SubLObject order = (current_$6.isCons()) ? current_$6.first() : NIL;
                destructuring_bind_must_listp(current_$6, datum_$5, $list55);
                current_$6 = current_$6.rest();
                if (NIL == current_$6) {
                    final SubLObject field_sql = sql_for_field(field);
                    sql = cconcatenate(sql, field_sql);
                    if (order.isKeyword()) {
                        sql = cconcatenate(sql, new SubLObject[]{ $$$_, string_utilities.string_from_keyword(order) });
                    }
                    if (!field_info.equal(last_field_info)) {
                        sql = cconcatenate(sql, $str46$__);
                    }
                } else {
                    cdestructuring_bind_error(datum_$5, $list55);
                }
                cdolist_list_var = cdolist_list_var.rest();
                field_info = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(order_by, $list51);
        }
        return sql;
    }

    public static SubLObject sksi_escape_single_quote_in_sql_string(final SubLObject string) {
        return string_utilities.string_substitute($str56$__, $str57$_, string, UNPROVIDED);
    }

    public static SubLObject sksi_replace_double_quotes_with_single_quotes_in_sql_string(final SubLObject string) {
        final SubLObject tokens = string_utilities.string_tokenize(string, $list58, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return string_utilities.join_strings(Mapping.mapcar(SKSI_REPLACE_DOUBLE_QUOTES_WITH_SINGLE_QUOTES_IN_SQL_STRING_INT, tokens), $str60$_);
    }

    public static SubLObject sksi_replace_double_quotes_with_single_quotes_in_sql_string_int(final SubLObject string) {
        return string_utilities.string_substitute($str57$_, $str60$_, string, UNPROVIDED);
    }

    public static SubLObject make_sql_for_where_clause(final SubLObject where, final SubLObject sql_flavor, SubLObject replace_double_quotesP) {
        if (replace_double_quotesP == UNPROVIDED) {
            replace_double_quotesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where_keyword = NIL;
        SubLObject where_expressions = NIL;
        destructuring_bind_must_consp(where, where, $list61);
        where_keyword = where.first();
        SubLObject current = where.rest();
        destructuring_bind_must_consp(current, where, $list61);
        where_expressions = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(where, $list61);
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($WHERE != where_keyword)) {
            Errors.error($str63$malformed_csql_subexpression__a__, where);
        }
        where_expressions = sksi_csql_utilities.simplify_where_expressions(where_expressions);
        if (NIL != sksi_csql_utilities.csql_false_p(where_expressions)) {
            return NIL;
        }
        return make_sql_for_where_clause_int(where_expressions, sql_flavor, replace_double_quotesP);
    }

    public static SubLObject make_sql_for_where_clause_int(final SubLObject where_expressions, final SubLObject sql_flavor, SubLObject replace_double_quotesP) {
        if (replace_double_quotesP == UNPROVIDED) {
            replace_double_quotesP = T;
        }
        SubLObject sql_where_expressions = NIL;
        SubLObject cdolist_list_var = where_expressions;
        SubLObject where_expression = NIL;
        where_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject where_expression_sql = make_sql_for_where_expression(where_expression, sql_flavor);
            if (!where_expression_sql.isString()) {
                return NIL;
            }
            sql_where_expressions = cons(where_expression_sql, sql_where_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        } 
        SubLObject sql_where = string_utilities.join_strings(sql_where_expressions, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), $$$_AND_));
        if (NIL == list_utilities.member_kbeqP(sql_flavor, $sql_backends_that_should_not_escape_single_quotes$.getGlobalValue())) {
            sql_where = sksi_escape_single_quote_in_sql_string(sql_where);
        }
        if (NIL != replace_double_quotesP) {
            sql_where = sksi_replace_double_quotes_with_single_quotes_in_sql_string(sql_where);
        }
        return sql_where;
    }

    public static SubLObject make_sql_for_where_expression(final SubLObject where_exp, final SubLObject sql_flavor) {
        if (NIL == where_exp) {
            return $$$false;
        }
        if (where_exp == T) {
            return $$$true;
        }
        if (!where_exp.isList()) {
            return make_sql_for_csql_value(where_exp, sql_flavor);
        }
        if (NIL != term.nautP(where_exp, UNPROVIDED)) {
            Errors.error($str67$No_NAUTs_allowed_in_CSQL_where_ex, where_exp);
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = where_exp.first();
        if (pcase_var.eql($FIELD)) {
            return make_sql_for_field_expression(where_exp.rest(), sql_flavor);
        }
        if (pcase_var.eql($VALUE)) {
            return make_sql_for_csql_value(second(where_exp), sql_flavor);
        }
        if (pcase_var.eql($NOT_NULL)) {
            return cconcatenate($str49$_, new SubLObject[]{ make_sql_for_where_expression(second(where_exp), sql_flavor), $str48$_IS_NOT_NULL_ });
        }
        if (((((((((((((pcase_var.eql($$CSQLStrictlyEquals) || pcase_var.eql($$CSQLGreaterThan)) || pcase_var.eql($$CSQLLessThan)) || pcase_var.eql($$CSQLNotEqual)) || pcase_var.eql($$CSQLGreaterThanOrEqualTo)) || pcase_var.eql($$CSQLLessThanOrEqualTo)) || pcase_var.eql($$CSQLTimesFn)) || pcase_var.eql($$CSQLPlusFn)) || pcase_var.eql($$CSQLDifferenceFn)) || pcase_var.eql($$CSQLQuotientFn)) || pcase_var.eql($$CSQLLike)) || pcase_var.eql($$CSQLLike_CaseInsensitive)) || pcase_var.eql($$CSQLUnlike)) || pcase_var.eql($$CSQLLaterThan)) {
            return make_sql_for_comparison_or_arithmetic_or_like_or_ilike_or_unlike_or_later_than_expression(operator, where_exp.rest(), sql_flavor);
        }
        if (pcase_var.eql($$CSQLEquals) || pcase_var.eql($$CSQLDifferent)) {
            return make_sql_for_equal_different_expression(operator, where_exp.rest(), sql_flavor);
        }
        if (pcase_var.eql($BETWEEN)) {
            return make_sql_for_between_expression(where_exp.rest(), sql_flavor);
        }
        if (pcase_var.eql($IN)) {
            return make_sql_for_in_expression(where_exp.rest(), sql_flavor);
        }
        if (pcase_var.eql($EVAL)) {
            return make_sql_for_where_expression_int(sksi_csql_utilities.csql_expression_arg(where_exp, ONE_INTEGER), sql_flavor);
        }
        if (pcase_var.eql($RAW)) {
            final SubLObject sql = second(where_exp);
            return string_utilities.copy_string(sql);
        }
        if (NIL != fort_types_interface.csql_comparison_predicate_p(operator)) {
            return make_sql_for_where_expression_int(where_exp, sql_flavor);
        }
        if (NIL != fort_types_interface.csql_quantifier_p(operator)) {
            return make_sql_for_csql_quantifier_expression(operator, second(where_exp), sql_flavor);
        }
        if (NIL != fort_types_interface.csql_logical_connective_p(operator)) {
            return make_sql_for_csql_logical_connective_expression(operator, where_exp.rest(), sql_flavor);
        }
        Errors.error($str91$unknown_csql_where_clause_operato, operator, where_exp);
        return NIL;
    }

    public static SubLObject make_sql_for_csql_value(final SubLObject value, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sql = NIL;
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package($$$CYC), thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject old_priority = process_priority(current_process());
            try {
                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                final SubLObject _prev_bind_0_$7 = $package$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = $print_readably$.currentBinding(thread);
                final SubLObject _prev_bind_2_$9 = $read_eval$.currentBinding(thread);
                final SubLObject _prev_bind_3_$10 = $read_default_float_format$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    if (NIL != sdbc.sql_null_p(value)) {
                        sql = $$$NULL;
                    } else
                        if ((NIL != kb_utilities.kbeq(sql_flavor, $$MSAccess)) && (NIL != database_date_string_p(value))) {
                            sql = cconcatenate($str96$DATEVALUE_, new SubLObject[]{ format_nil.format_nil_s_no_copy(value), $str97$_ });
                        } else {
                            sql = format_nil.format_nil_s(value);
                        }

                } finally {
                    $read_default_float_format$.rebind(_prev_bind_3_$10, thread);
                    $read_eval$.rebind(_prev_bind_2_$9, thread);
                    $print_readably$.rebind(_prev_bind_1_$8, thread);
                    $package$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_process_priority(current_process(), old_priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $read_eval$.rebind(_prev_bind_4, thread);
            $print_readably$.rebind(_prev_bind_3, thread);
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
        return sql;
    }

    public static SubLObject make_sql_for_field_expression(final SubLObject exp, final SubLObject sql_flavor) {
        SubLObject field = NIL;
        destructuring_bind_must_consp(exp, exp, $list98);
        field = exp.first();
        SubLObject current = exp.rest();
        final SubLObject table = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, exp, $list98);
        current = current.rest();
        final SubLObject namespace = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, exp, $list98);
        current = current.rest();
        if (NIL == current) {
            return NIL != table ? NIL != namespace ? cconcatenate(namespace, new SubLObject[]{ $str15$_, table, $str15$_, field }) : cconcatenate(table, new SubLObject[]{ $str15$_, field }) : field;
        }
        cdestructuring_bind_error(exp, $list98);
        return NIL;
    }

    public static SubLObject csql_comparison_list_p(final SubLObject csql) {
        return makeBoolean((NIL != sksi_csql_utilities.csql_comparison_or_p(csql)) || (NIL != sksi_csql_utilities.csql_comparison_and_p(csql)));
    }

    public static SubLObject make_sql_for_comparison_or_arithmetic_or_like_or_ilike_or_unlike_or_later_than_expression(final SubLObject operator, final SubLObject exp, final SubLObject sql_flavor) {
        SubLObject left = NIL;
        SubLObject right = NIL;
        destructuring_bind_must_consp(exp, exp, $list99);
        left = exp.first();
        SubLObject current = exp.rest();
        destructuring_bind_must_consp(current, exp, $list99);
        right = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != csql_comparison_list_p(left)) {
                final SubLObject list_operator = left.first();
                if (NIL != list_utilities.member_eqP(operator, $list100)) {
                    final SubLObject pcase_var = list_operator;
                    if (pcase_var.eql($$CSQLAnd)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(left.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, elt, right), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLOr, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    if (pcase_var.eql($$TheList) || pcase_var.eql($$CSQLOr)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(left.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, elt, right), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLOr, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    Errors.error($str104$unrecognized_comparison_list_oper, list_operator);
                } else {
                    final SubLObject pcase_var = list_operator;
                    if (pcase_var.eql($$CSQLAnd)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(left.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, elt, right), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLAnd, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    if (pcase_var.eql($$TheList) || pcase_var.eql($$CSQLOr)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(left.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, elt, right), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLOr, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    Errors.error($str104$unrecognized_comparison_list_oper, list_operator);
                }
            } else {
                if (NIL == csql_comparison_list_p(right)) {
                    return make_sql_for_comparison_or_arithmetic_or_like_or_ilike_or_unlike_or_later_than_expression_int(operator, left, right, sql_flavor);
                }
                final SubLObject list_operator = right.first();
                if (NIL != list_utilities.member_eqP(operator, $list100)) {
                    final SubLObject pcase_var = list_operator;
                    if (pcase_var.eql($$CSQLAnd)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(right.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, left, elt), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLOr, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    if (pcase_var.eql($$TheList) || pcase_var.eql($$CSQLOr)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(right.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, left, elt), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLAnd, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    Errors.error($str104$unrecognized_comparison_list_oper, list_operator);
                } else {
                    final SubLObject pcase_var = list_operator;
                    if (pcase_var.eql($$CSQLAnd)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(right.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, left, elt), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLAnd, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    if (pcase_var.eql($$TheList) || pcase_var.eql($$CSQLOr)) {
                        SubLObject new_expression = NIL;
                        SubLObject cdolist_list_var = nreverse(right.rest());
                        SubLObject elt = NIL;
                        elt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_expression = cons(list(operator, left, elt), new_expression);
                            cdolist_list_var = cdolist_list_var.rest();
                            elt = cdolist_list_var.first();
                        } 
                        new_expression = cons($$CSQLOr, new_expression);
                        return make_sql_for_where_expression(new_expression, sql_flavor);
                    }
                    Errors.error($str104$unrecognized_comparison_list_oper, list_operator);
                }
            }
        } else {
            cdestructuring_bind_error(exp, $list99);
        }
        return NIL;
    }

    public static SubLObject make_sql_for_comparison_or_arithmetic_or_like_or_ilike_or_unlike_or_later_than_expression_int(final SubLObject operator, final SubLObject left, final SubLObject right, final SubLObject sql_flavor) {
        final SubLObject left_sql = make_sql_for_where_expression_int2(left, sql_flavor);
        final SubLObject right_sql = make_sql_for_where_expression_int2(right, sql_flavor);
        SubLObject sql = make_sql_for_where_expression_int(list(operator, list($SQL, left_sql), list($SQL, right_sql)), sql_flavor);
        if (sql.isString() && (NIL == string_utilities.starts_with(sql, $str49$_))) {
            sql = cconcatenate($str49$_, new SubLObject[]{ sql, $str97$_ });
        }
        return sql;
    }

    public static SubLObject make_sql_for_where_expression_int2(final SubLObject expression, final SubLObject sql_flavor) {
        if (NIL != sksi_csql_utilities.csql_functional_expression_p(expression)) {
            return make_sql_for_where_expression_int(expression, sql_flavor);
        }
        return make_sql_for_where_expression(expression, sql_flavor);
    }

    public static SubLObject make_sql_for_where_expression_int(final SubLObject where_exp, final SubLObject sql_flavor) {
        if (where_exp.isCons() && (where_exp.first() == $SQL)) {
            return second(where_exp);
        }
        if (NIL != sksi_csql_utilities.csql_field_expression_p(where_exp)) {
            return make_sql_for_field_expression(where_exp.rest(), sql_flavor);
        }
        if (where_exp.isNumber()) {
            if (where_exp.isInteger()) {
                return format_nil.format_nil_d(where_exp);
            }
            return format(NIL, $str106$_f, where_exp);
        } else {
            if (!where_exp.isString()) {
                if (NIL != fort_types_interface.csql_constant_p(where_exp)) {
                    if (NIL != sksi_kb_accessors.csql_operator_to_sql_function_syntaxP(where_exp, sql_flavor)) {
                        return make_sql_for_csql_function_expression(NIL, sksi_kb_accessors.csql_operator_to_sql_operator(where_exp, sql_flavor), sql_flavor);
                    }
                } else {
                    if (NIL != el_set_p(where_exp)) {
                        final SubLObject items = el_set_items(where_exp);
                        final SubLObject last_item_num = subtract(length(items), ONE_INTEGER);
                        SubLObject result_string = $str49$_;
                        SubLObject list_var = NIL;
                        SubLObject item = NIL;
                        SubLObject this_num = NIL;
                        list_var = items;
                        item = list_var.first();
                        for (this_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , this_num = add(ONE_INTEGER, this_num)) {
                            result_string = cconcatenate(result_string, make_sql_for_where_expression_int(item, sql_flavor));
                            if (this_num.numL(last_item_num)) {
                                result_string = cconcatenate(result_string, $str46$__);
                            }
                        }
                        result_string = cconcatenate(result_string, $str97$_);
                        return result_string;
                    }
                    if (where_exp.isCons()) {
                        final SubLObject csql_operator = where_exp.first();
                        final SubLObject sql_operator = sksi_kb_accessors.csql_operator_to_sql_operator(csql_operator, sql_flavor);
                        SubLObject result = NIL;
                        if (NIL != sksi_kb_accessors.csql_operator_to_sql_prefix_operator_syntaxP(csql_operator, sql_flavor)) {
                            final SubLObject args = where_exp.rest();
                            result = sql_operator;
                            SubLObject cdolist_list_var = args;
                            SubLObject arg = NIL;
                            arg = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject arg_sql = make_sql_for_where_expression_int(arg, sql_flavor);
                                if (!arg_sql.isString()) {
                                    return NIL;
                                }
                                result = cconcatenate(result, new SubLObject[]{ $$$_, arg_sql });
                                cdolist_list_var = cdolist_list_var.rest();
                                arg = cdolist_list_var.first();
                            } 
                        } else
                            if (NIL != sksi_kb_accessors.csql_operator_to_sql_infix_operator_syntaxP(csql_operator, sql_flavor)) {
                                final SubLObject args = where_exp.rest();
                                result = make_sql_for_where_expression_int(args.first(), sql_flavor);
                                if (!result.isString()) {
                                    return NIL;
                                }
                                SubLObject cdolist_list_var = args.rest();
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject arg_sql = make_sql_for_where_expression_int(arg, sql_flavor);
                                    if (!arg_sql.isString()) {
                                        return NIL;
                                    }
                                    result = cconcatenate(result, new SubLObject[]{ $$$_, sql_operator, $$$_, arg_sql });
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                            } else
                                if (NIL != sksi_kb_accessors.csql_operator_to_sql_inverse_infix_operator_syntaxP(csql_operator, sql_flavor)) {
                                    final SubLObject args = reverse(where_exp.rest());
                                    result = make_sql_for_where_expression_int(args.first(), sql_flavor);
                                    if (!result.isString()) {
                                        return NIL;
                                    }
                                    SubLObject cdolist_list_var = args.rest();
                                    SubLObject arg = NIL;
                                    arg = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject arg_sql = make_sql_for_where_expression_int(arg, sql_flavor);
                                        if (!arg_sql.isString()) {
                                            return NIL;
                                        }
                                        result = cconcatenate(result, new SubLObject[]{ $$$_, sql_operator, $$$_, arg_sql });
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arg = cdolist_list_var.first();
                                    } 
                                } else
                                    if (NIL != sksi_kb_accessors.csql_operator_to_sql_postfix_operator_syntaxP(csql_operator, sql_flavor)) {
                                        final SubLObject args = where_exp.rest();
                                        result = make_sql_for_where_expression_int(args.first(), sql_flavor);
                                        if (!result.isString()) {
                                            return NIL;
                                        }
                                        SubLObject cdolist_list_var = args.rest();
                                        SubLObject arg = NIL;
                                        arg = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject arg_sql = make_sql_for_where_expression_int(arg, sql_flavor);
                                            if (!arg_sql.isString()) {
                                                return NIL;
                                            }
                                            result = cconcatenate(result, new SubLObject[]{ $$$_, arg_sql });
                                            cdolist_list_var = cdolist_list_var.rest();
                                            arg = cdolist_list_var.first();
                                        } 
                                        result = cconcatenate(result, new SubLObject[]{ $$$_, sql_operator });
                                    } else {
                                        if (NIL != sksi_kb_accessors.csql_operator_to_sql_function_syntaxP(csql_operator, sql_flavor)) {
                                            return make_sql_for_csql_function_expression(where_exp, sql_operator, sql_flavor);
                                        }
                                        final SubLObject format_string_assertion = sksi_kb_accessors.csql_to_sql_translation_format_gaf(csql_operator, sql_flavor);
                                        final SubLObject args2 = where_exp.rest();
                                        SubLObject sql_format_string = NIL;
                                        SubLObject format_argument_list = NIL;
                                        if (NIL != format_string_assertion) {
                                            sql_format_string = assertions_high.gaf_arg3(format_string_assertion);
                                            format_argument_list = el_list_items(assertions_high.gaf_arg4(format_string_assertion));
                                            result = sql_format_string;
                                            SubLObject cdolist_list_var2 = format_argument_list;
                                            SubLObject argnum = NIL;
                                            argnum = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject arg2 = nth(number_utilities.f_1_(argnum), args2);
                                                final SubLObject arg_sql2 = make_sql_for_where_expression_int(arg2, sql_flavor);
                                                final SubLObject arg_unquoted = (arg_sql2.isString()) ? string_utilities.string_trim_symmetric_n($list108, arg_sql2, UNPROVIDED) : arg_sql2;
                                                if (!arg_unquoted.isString()) {
                                                    return NIL;
                                                }
                                                result = string_utilities.replace_substring_once(result, $str109$_a, arg_unquoted, UNPROVIDED);
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                argnum = cdolist_list_var2.first();
                                            } 
                                            return result;
                                        }
                                        Errors.error($str110$Unknown_operator_syntax__a_for__a, sksi_kb_accessors.csql_operator_to_sql_operator_syntax(csql_operator, sql_flavor), csql_operator, sql_flavor);
                                    }



                        if (result.isString()) {
                            result = cconcatenate($str49$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(result), $str97$_ });
                        }
                        return result;
                    }
                }
                return NIL;
            }
            if (NIL != kb_utilities.kbeq(sql_flavor, $$IBM_DB2_TheProgram)) {
                return cconcatenate($str57$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(where_exp), $str57$_ });
            }
            return format_nil.format_nil_s(where_exp);
        }
    }

    public static SubLObject test_make_sql_for_where_expression_int(final SubLObject where_exp, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = make_sql_for_where_expression_int(where_exp, sql_flavor);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject make_sql_for_csql_function_expression(final SubLObject where_exp, final SubLObject sql_operator, final SubLObject sql_flavor) {
        final SubLObject args = where_exp.rest();
        if (NIL == args) {
            return cconcatenate(format_nil.format_nil_a_no_copy(sql_operator), $str113$__);
        }
        if (NIL != list_utilities.member_eqP(NIL, args)) {
            return NIL;
        }
        SubLObject args_result = make_sql_for_where_expression_int(args.first(), sql_flavor);
        if (!args_result.isString()) {
            return NIL;
        }
        SubLObject cdolist_list_var = args.rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_sql = make_sql_for_where_expression_int(arg, sql_flavor);
            if (!arg_sql.isString()) {
                return NIL;
            }
            args_result = cconcatenate(args_result, new SubLObject[]{ $str46$__, arg_sql });
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (!args_result.isString()) {
            return NIL;
        }
        if (string_utilities.first_char(args_result).eql(CHAR_lparen)) {
            return cconcatenate(format_nil.format_nil_a_no_copy(sql_operator), format_nil.format_nil_a_no_copy(args_result));
        }
        return cconcatenate(format_nil.format_nil_a_no_copy(sql_operator), new SubLObject[]{ $str49$_, format_nil.format_nil_a_no_copy(args_result), $str97$_ });
    }

    public static SubLObject sql_wildcard_characterP(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $sql_wildcard_characters$.getGlobalValue());
    }

    public static SubLObject string_with_sql_wildcardP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if($sym115$SQL_WILDCARD_CHARACTER_, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject make_sql_for_equal_different_expression(final SubLObject operator, final SubLObject exp, final SubLObject sql_flavor) {
        final SubLObject value_exp_requires_like_unlikeP = makeBoolean((NIL != sksi_csql_utilities.csql_eval_expression_p(exp.first())) || (NIL != sksi_csql_utilities.csql_eval_expression_p(second(exp))));
        SubLObject new_operator = NIL;
        if (operator.eql($$CSQLEquals)) {
            if (NIL != value_exp_requires_like_unlikeP) {
                new_operator = $$CSQLLike;
            } else {
                new_operator = $$CSQLStrictlyEquals;
            }
        } else
            if (operator.eql($$CSQLDifferent)) {
                if (NIL != value_exp_requires_like_unlikeP) {
                    new_operator = $$CSQLUnlike;
                } else {
                    new_operator = $$CSQLNotEqual;
                }
            } else {
                Errors.error($str116$_a_is_not___CSQLEquals_or___CSQLD, operator);
            }

        return make_sql_for_where_expression(cons(new_operator, exp), sql_flavor);
    }

    public static SubLObject make_sql_for_between_expression(final SubLObject exp, final SubLObject sql_flavor) {
        SubLObject test = NIL;
        SubLObject low = NIL;
        SubLObject high = NIL;
        destructuring_bind_must_consp(exp, exp, $list117);
        test = exp.first();
        SubLObject current = exp.rest();
        destructuring_bind_must_consp(current, exp, $list117);
        low = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, exp, $list117);
        high = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(exp, $list117);
            return NIL;
        }
        final SubLObject test_sql = make_sql_for_where_expression(test, sql_flavor);
        final SubLObject low_sql = make_sql_for_where_expression(low, sql_flavor);
        final SubLObject high_sql = make_sql_for_where_expression(high, sql_flavor);
        if (((sql_flavor.eql($$MSAccess) || sql_flavor.eql($$MySQL_TheProgram)) || sql_flavor.eql($$OracleDatabaseServer_TheProgram)) || sql_flavor.eql($$PostgreSQL)) {
            return cconcatenate($str49$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(test_sql), $$$_BETWEEN_, format_nil.format_nil_s_no_copy(low_sql), $$$_AND_, format_nil.format_nil_s_no_copy(high_sql), $str97$_ });
        }
        return cconcatenate($str120$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(test_sql), $str121$____, format_nil.format_nil_s_no_copy(low_sql), $str122$__AND__, format_nil.format_nil_a_no_copy(test_sql), $str123$____, format_nil.format_nil_s_no_copy(high_sql), $str124$__ });
    }

    public static SubLObject make_sql_for_csql_logical_connective_expression(final SubLObject operator, final SubLObject args, final SubLObject sql_flavor) {
        SubLObject arg_sqls = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            arg_sqls = cons(list($SQL, make_sql_for_where_expression(arg, sql_flavor)), arg_sqls);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return make_sql_for_where_expression_int(sksi_csql_utilities.make_csql_expression(operator, nreverse(arg_sqls)), sql_flavor);
    }

    public static SubLObject make_sql_for_csql_quantifier_expression(final SubLObject operator, final SubLObject exp, final SubLObject sql_flavor) {
        final SubLObject exp_sql = csql_to_sql_select(exp, sql_flavor, $NORMAL, NIL);
        return make_sql_for_where_expression_int(list(operator, list($SQL, exp_sql)), sql_flavor);
    }

    public static SubLObject make_sql_for_in_expression(final SubLObject exp, final SubLObject sql_flavor) {
        SubLObject field = NIL;
        SubLObject list_or_query = NIL;
        destructuring_bind_must_consp(exp, exp, $list125);
        field = exp.first();
        SubLObject current = exp.rest();
        destructuring_bind_must_consp(current, exp, $list125);
        list_or_query = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject field_string = make_sql_for_where_expression(field, sql_flavor);
            final SubLObject list_or_query_operator = list_or_query.first();
            SubLObject list_or_query_string = NIL;
            final SubLObject pcase_var = list_or_query_operator;
            if (pcase_var.eql($SELECT)) {
                list_or_query_string = csql_to_sql_select(list_or_query, sql_flavor, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($LIST)) {
                    list_or_query_string = make_sql_for_in_expression_list(list_or_query.rest(), sql_flavor);
                } else {
                    Errors.error($str127$malformed_csql_subexpression__a__, list_or_query);
                }

            return cconcatenate($str49$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(field_string), $str128$_IN__, format_nil.format_nil_a_no_copy(list_or_query_string), $str124$__ });
        }
        cdestructuring_bind_error(exp, $list125);
        return NIL;
    }

    public static SubLObject make_sql_for_in_expression_list(final SubLObject list, final SubLObject sql_flavor) {
        SubLObject string_list = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string_list = cons(make_sql_for_csql_value(value, sql_flavor), string_list);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return string_utilities.join_strings(nreverse(string_list), $str46$__);
    }

    public static SubLObject database_date_string_p(final SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != list_utilities.lengthE(v_object, NINETEEN_INTEGER, UNPROVIDED))) && (NIL == list_utilities.find_if_not(DATABASE_DATE_STRING_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject database_date_string_char_p(final SubLObject v_char) {
        return makeBoolean((NIL != digit_char_p(v_char, UNPROVIDED)) || (NIL != list_utilities.member_eqP(v_char, $list130)));
    }

    public static SubLObject csql_to_sql_insert(final SubLObject csql, final SubLObject sql_flavor) {
        SubLObject insert_keyword = NIL;
        SubLObject into = NIL;
        SubLObject fields = NIL;
        SubLObject field_values = NIL;
        destructuring_bind_must_consp(csql, csql, $list131);
        insert_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list131);
        into = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list131);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list131);
        field_values = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != kb_utilities.kbeq(sql_flavor, $$MSSQLServer)) {
                SubLObject field_values_list = second(field_values);
                final SubLObject auto_incrementing_positions = list_utilities.all_positions($AUTO_INCREMENT_DEFAULT, field_values_list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != auto_incrementing_positions) {
                    fields = list_utilities.remove_nths(auto_incrementing_positions, fields);
                    field_values_list = list_utilities.remove_nths(auto_incrementing_positions, field_values_list);
                    field_values = list(field_values.first(), field_values_list);
                }
            }
            final SubLObject insert_header = $$$INSERT_;
            final SubLObject table_string = interpret_csql_into_value(into, sql_flavor);
            final SubLObject field_string = interpret_csql_fields_value_insert(fields, sql_flavor);
            final SubLObject values_string = sql_for_field_values(field_values, sql_flavor, UNPROVIDED);
            final SubLObject sql = cconcatenate(insert_header, new SubLObject[]{ table_string, field_string, values_string });
            return sql;
        }
        cdestructuring_bind_error(csql, $list131);
        return NIL;
    }

    public static SubLObject interpret_csql_fields_value_insert(final SubLObject fields, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sql = $str134$__;
        SubLObject current;
        final SubLObject datum = current = fields.first();
        SubLObject field_keyword = NIL;
        SubLObject field_name = NIL;
        destructuring_bind_must_consp(current, datum, $list135);
        field_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        field_name = current.first();
        current = current.rest();
        final SubLObject table = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list135);
        current = current.rest();
        final SubLObject namespace = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list135);
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($FIELD != field_keyword)) {
                Errors.error($str136$malformed_csql_subexpression__a__, fields.first());
            }
            assert NIL != stringp(field_name) : "Types.stringp(field_name) " + "CommonSymbols.NIL != Types.stringp(field_name) " + field_name;
            sql = cconcatenate(sql, field_name);
        } else {
            cdestructuring_bind_error(datum, $list135);
        }
        SubLObject cdolist_list_var = fields.rest();
        SubLObject field = NIL;
        field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = field;
            SubLObject field_keyword2 = NIL;
            SubLObject field_name2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list135);
            field_keyword2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list135);
            field_name2 = current2.first();
            current2 = current2.rest();
            final SubLObject table2 = (current2.isCons()) ? current2.first() : NIL;
            destructuring_bind_must_listp(current2, datum2, $list135);
            current2 = current2.rest();
            final SubLObject namespace2 = (current2.isCons()) ? current2.first() : NIL;
            destructuring_bind_must_listp(current2, datum2, $list135);
            current2 = current2.rest();
            if (NIL == current2) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($FIELD != field_keyword2)) {
                    Errors.error($str136$malformed_csql_subexpression__a__, fields.first());
                }
                assert NIL != stringp(field_name2) : "Types.stringp(field_name2) " + "CommonSymbols.NIL != Types.stringp(field_name2) " + field_name2;
                sql = cconcatenate(sql, new SubLObject[]{ $str46$__, field_name2 });
            } else {
                cdestructuring_bind_error(datum2, $list135);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        } 
        sql = cconcatenate(sql, $str97$_);
        return sql;
    }

    public static SubLObject sql_for_field_values(final SubLObject field_values, final SubLObject sql_flavor, SubLObject sequence_name_list) {
        if (sequence_name_list == UNPROVIDED) {
            sequence_name_list = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values_keyword = NIL;
        SubLObject value_list = NIL;
        destructuring_bind_must_consp(field_values, field_values, $list138);
        values_keyword = field_values.first();
        SubLObject current = field_values.rest();
        destructuring_bind_must_consp(current, field_values, $list138);
        value_list = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($VALUES != values_keyword)) {
                Errors.error($str140$malformed_csql_subexpression__a__, values_keyword);
            }
            SubLObject sql = $str141$_VALUES__;
            sql = cconcatenate(sql, make_sql_for_field_value(value_list.first(), sql_flavor, sequence_name_list));
            SubLObject cdolist_list_var = value_list.rest();
            SubLObject value = NIL;
            value = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sql = cconcatenate(sql, new SubLObject[]{ $str46$__, make_sql_for_field_value(value, sql_flavor, sequence_name_list) });
                cdolist_list_var = cdolist_list_var.rest();
                value = cdolist_list_var.first();
            } 
            sql = cconcatenate(sql, $str97$_);
            return sql;
        }
        cdestructuring_bind_error(field_values, $list138);
        return NIL;
    }

    public static SubLObject make_sql_for_field_value(final SubLObject value, final SubLObject sql_flavor, SubLObject sequence_name_list) {
        if (sequence_name_list == UNPROVIDED) {
            sequence_name_list = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sdbc.sql_null_p(value)) {
            return $$$NULL;
        }
        if (value.isNumber()) {
            final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                if (sql_flavor.eql($$ApacheDerby)) {
                    return string_utilities.object_to_string(value);
                }
                return cconcatenate($str57$_, new SubLObject[]{ sksi_escape_single_quote_in_sql_string(string_utilities.object_to_string(value)), $str57$_ });
            } finally {
                $read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == value) {
            return $$$false;
        }
        if (value == T) {
            return $$$true;
        }
        if (value == $AUTO_INCREMENT_DEFAULT) {
            if (sql_flavor.eql($$MySQL_TheProgram)) {
                return $$$NULL;
            }
            if (sql_flavor.eql($$PostgreSQL)) {
                return $$$DEFAULT;
            }
            if (sql_flavor.eql($$ApacheDerby)) {
                return $$$DEFAULT;
            }
        } else {
            if ((NIL != kb_utilities.kbeq(sql_flavor, $$MSAccess)) && (NIL != database_date_string_p(value))) {
                return cconcatenate($str96$DATEVALUE_, new SubLObject[]{ format_nil.format_nil_s_no_copy(value), $str97$_ });
            }
            if (value.isCons() && (value.first() == $NEXT_VALUE)) {
                if (sql_flavor.eql($$OracleDatabaseServer_TheProgram)) {
                    return cconcatenate(second(value), $str146$_nextval);
                }
                if (sql_flavor.eql($$PostgreSQL)) {
                    return cconcatenate($str147$nextval_, new SubLObject[]{ format_nil.format_nil_a_no_copy(second(value)), $str97$_ });
                }
            } else {
                if ((!value.isCons()) || (value.first() != $KEY_REF)) {
                    return cconcatenate($str57$_, new SubLObject[]{ sksi_escape_single_quote_in_sql_string(string_utilities.object_to_string(value)), $str57$_ });
                }
                if (sql_flavor.eql($$PostgreSQL)) {
                    final SubLObject sequence_name = nth(second(value), sequence_name_list);
                    if (NIL != sequence_name) {
                        return cconcatenate($str149$currval__, new SubLObject[]{ nth(second(value), sequence_name_list), $str150$__ });
                    }
                    Errors.error(cconcatenate($str151$SQL_multiple_insert__key_ref_valu, EMPTY_SUBL_OBJECT_ARRAY));
                } else {
                    if (sql_flavor.eql($$OracleDatabaseServer_TheProgram)) {
                        return cconcatenate($str152$CYC_KEY_, string_utilities.str(second(value)));
                    }
                    if (sql_flavor.eql($$MySQL_TheProgram)) {
                        return cconcatenate($str153$_CYC_KEY_, string_utilities.str(second(value)));
                    }
                    if (sql_flavor.eql($$MSSQLServer)) {
                        return cconcatenate($str153$_CYC_KEY_, string_utilities.str(second(value)));
                    }
                    Errors.error(cconcatenate($str154$unknown_sql_flavor_, string_utilities.str(sql_flavor)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject interpret_csql_into_value(final SubLObject into, final SubLObject sql_flavor) {
        final SubLObject table_names = csql_extract_table_names(into, $INTO, sql_flavor);
        final SubLObject sql = $$$_INTO_;
        return cconcatenate(sql, sql_for_table_names(table_names, sql_flavor));
    }

    public static SubLObject csql_to_sql_delete(final SubLObject csql, final SubLObject sql_flavor) {
        SubLObject delete_keyword = NIL;
        SubLObject from = NIL;
        SubLObject where = NIL;
        destructuring_bind_must_consp(csql, csql, $list157);
        delete_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list157);
        from = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list157);
        where = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(csql, $list157);
            return NIL;
        }
        final SubLObject delete_header = $$$DELETE_;
        final SubLObject table_string = sql_interpret_csql_from_value(from, sql_flavor);
        final SubLObject where_header = $$$_WHERE_;
        final SubLObject where_expression = make_sql_for_where_clause(where, sql_flavor, UNPROVIDED);
        SubLObject sql = NIL;
        if (NIL == where_expression) {
            return NIL;
        }
        sql = cconcatenate(delete_header, new SubLObject[]{ table_string, where_header, where_expression });
        return sql;
    }

    public static SubLObject construct_sql_delete_where_clause(final SubLObject fields, final SubLObject field_values, final SubLObject sql_flavor) {
        final SubLObject equals_pairs = list_utilities.make_pair_list(Mapping.mapcar(SECOND, fields), field_values);
        final SubLObject sql = sql_for_equals_pairs(equals_pairs, sql_flavor);
        return sql;
    }

    public static SubLObject sql_for_equals_pairs(final SubLObject equals_pairs, final SubLObject sql_flavor) {
        SubLObject sql = $str41$;
        if (NIL != equals_pairs) {
            sql = cconcatenate(sql, make_sql_for_equals_pair(equals_pairs.first(), sql_flavor));
            SubLObject cdolist_list_var = equals_pairs.rest();
            SubLObject equals_pair = NIL;
            equals_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sql = cconcatenate(sql, new SubLObject[]{ $$$_AND_, make_sql_for_equals_pair(equals_pair, sql_flavor) });
                cdolist_list_var = cdolist_list_var.rest();
                equals_pair = cdolist_list_var.first();
            } 
        }
        sql = sksi_replace_double_quotes_with_single_quotes_in_sql_string(sql);
        return sql;
    }

    public static SubLObject make_sql_for_equals_pair(final SubLObject equals_pair, final SubLObject sql_flavor) {
        SubLObject field_name = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(equals_pair, equals_pair, $list161);
        field_name = equals_pair.first();
        SubLObject current = equals_pair.rest();
        destructuring_bind_must_consp(current, equals_pair, $list161);
        value = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(equals_pair, $list161);
            return NIL;
        }
        if (NIL == value) {
            return cconcatenate($str49$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(field_name), $str164$_IS_NULL_ });
        }
        if (value.isString()) {
            value = sksi_escape_single_quote_in_sql_string(value);
        }
        if ((NIL != kb_utilities.kbeq(sql_flavor, $$MSAccess)) && (NIL != database_date_string_p(value))) {
            return cconcatenate($str49$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(field_name), $str162$___DATEVALUE_, format_nil.format_nil_s_no_copy(value), $str124$__ });
        }
        return cconcatenate($str49$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(field_name), $str163$___, format_nil.format_nil_s_no_copy(value), $str97$_ });
    }

    public static SubLObject csql_to_sql_update(final SubLObject csql, final SubLObject sql_flavor) {
        SubLObject update_keyword = NIL;
        SubLObject table_clause = NIL;
        SubLObject set_clause = NIL;
        SubLObject where_clause = NIL;
        destructuring_bind_must_consp(csql, csql, $list165);
        update_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list165);
        table_clause = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list165);
        set_clause = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list165);
        where_clause = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject update_header = $$$UPDATE_;
            final SubLObject set_header = $$$_SET_;
            final SubLObject where_header = $$$_WHERE_;
            final SubLObject table_string = second(table_clause.first());
            final SubLObject set_string = make_sql_for_set_clause(set_clause, sql_flavor);
            final SubLObject where_string = make_sql_for_where_clause(where_clause, sql_flavor, UNPROVIDED);
            final SubLObject sql = cconcatenate(update_header, new SubLObject[]{ table_string, set_header, set_string, where_header, where_string });
            return sql;
        }
        cdestructuring_bind_error(csql, $list165);
        return NIL;
    }

    public static SubLObject make_sql_for_set_clause(final SubLObject v_set, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject set_keyword = NIL;
        SubLObject set_expressions = NIL;
        destructuring_bind_must_consp(v_set, v_set, $list168);
        set_keyword = v_set.first();
        SubLObject current = v_set.rest();
        destructuring_bind_must_consp(current, v_set, $list168);
        set_expressions = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SET != set_keyword)) {
                Errors.error($str170$malformed_csql_subexpression__a__, v_set);
            }
            SubLObject sql = make_sql_for_where_clause_int(set_expressions, sql_flavor, UNPROVIDED);
            if (sql.isString()) {
                sql = string_utilities.string_substitute($str46$__, $$$_AND_, sql, UNPROVIDED);
                sql = remove_if(SQL_PARANTHESIS_CHARACTER_P, sql, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return sql;
            }
        } else {
            cdestructuring_bind_error(v_set, $list168);
        }
        return NIL;
    }

    public static SubLObject sql_paranthesis_character_p(final SubLObject v_char) {
        return list_utilities.member_eqP(v_char, $list172);
    }

    public static SubLObject csql_to_sql_insert_multiple(final SubLObject csql_list, final SubLObject sql_flavor) {
        if (sql_flavor.eql($$OracleDatabaseServer_TheProgram)) {
            SubLObject result = cconcatenate($$$DECLARE, string_utilities.$new_line_string$.getGlobalValue());
            SubLObject num_inserts;
            SubLObject insert_num;
            for (num_inserts = length(csql_list), insert_num = NIL, insert_num = ONE_INTEGER; !insert_num.eql(num_inserts); insert_num = add(insert_num, ONE_INTEGER)) {
                result = cconcatenate(result, new SubLObject[]{ $str152$CYC_KEY_, string_utilities.str(subtract(insert_num, ONE_INTEGER)), $str174$_VARCHAR2_999__, string_utilities.$new_line_string$.getGlobalValue() });
            }
            result = cconcatenate(result, new SubLObject[]{ $$$BEGIN, string_utilities.$new_line_string$.getGlobalValue() });
            SubLObject list_var = NIL;
            SubLObject csql = NIL;
            SubLObject counter = NIL;
            list_var = csql_list.rest();
            csql = list_var.first();
            for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , csql = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                SubLObject current;
                final SubLObject datum = current = csql;
                SubLObject into = NIL;
                SubLObject fields = NIL;
                SubLObject field_values = NIL;
                SubLObject returning_choice = NIL;
                destructuring_bind_must_consp(current, datum, $list176);
                into = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list176);
                fields = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list176);
                field_values = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list176);
                returning_choice = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject insert_header = $$$INSERT;
                    final SubLObject table_string = interpret_csql_into_value(into, sql_flavor);
                    final SubLObject field_string = interpret_csql_fields_value_insert(fields, sql_flavor);
                    final SubLObject values_string = sql_for_field_values(field_values, sql_flavor, UNPROVIDED);
                    final SubLObject returning_string = sql_for_returning_choice(returning_choice, counter, sql_flavor);
                    result = cconcatenate(result, new SubLObject[]{ insert_header, table_string, field_string, values_string, returning_string, string_utilities.$new_line_string$.getGlobalValue() });
                } else {
                    cdestructuring_bind_error(datum, $list176);
                }
            }
            return cconcatenate(result, $str178$END_);
        }
        if (sql_flavor.eql($$PostgreSQL)) {
            SubLObject sequence_names = NIL;
            SubLObject result2 = $str41$;
            SubLObject cdolist_list_var = csql_list.rest();
            SubLObject csql2 = NIL;
            csql2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current2;
                final SubLObject datum2 = current2 = csql2;
                SubLObject into2 = NIL;
                SubLObject fields2 = NIL;
                SubLObject field_values2 = NIL;
                SubLObject sequence_name = NIL;
                destructuring_bind_must_consp(current2, datum2, $list179);
                into2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                fields2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                field_values2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                sequence_name = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject insert_header2 = $$$INSERT;
                    final SubLObject table_string2 = interpret_csql_into_value(into2, sql_flavor);
                    final SubLObject field_string2 = interpret_csql_fields_value_insert(fields2, sql_flavor);
                    final SubLObject values_string2 = sql_for_field_values(field_values2, sql_flavor, sequence_names);
                    sequence_names = cons(sequence_name, sequence_names);
                    result2 = cconcatenate(result2, new SubLObject[]{ insert_header2, table_string2, field_string2, values_string2, $str180$_, string_utilities.$new_line_string$.getGlobalValue() });
                } else {
                    cdestructuring_bind_error(datum2, $list179);
                }
                cdolist_list_var = cdolist_list_var.rest();
                csql2 = cdolist_list_var.first();
            } 
            return result2;
        }
        if (sql_flavor.eql($$MySQL_TheProgram)) {
            SubLObject result = $str41$;
            SubLObject list_var2 = NIL;
            SubLObject csql3 = NIL;
            SubLObject counter2 = NIL;
            list_var2 = csql_list.rest();
            csql3 = list_var2.first();
            for (counter2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , csql3 = list_var2.first() , counter2 = add(ONE_INTEGER, counter2)) {
                SubLObject current2;
                final SubLObject datum2 = current2 = csql3;
                SubLObject into2 = NIL;
                SubLObject fields2 = NIL;
                SubLObject field_values2 = NIL;
                SubLObject sequence_name = NIL;
                destructuring_bind_must_consp(current2, datum2, $list179);
                into2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                fields2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                field_values2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                sequence_name = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject insert_header2 = $$$INSERT;
                    final SubLObject table_string2 = interpret_csql_into_value(into2, sql_flavor);
                    final SubLObject field_string2 = interpret_csql_fields_value_insert(fields2, sql_flavor);
                    final SubLObject values_string2 = sql_for_field_values(field_values2, sql_flavor, UNPROVIDED);
                    final SubLObject fetch_key_command = (NIL != sequence_name) ? sql_for_get_last_key(counter2, sql_flavor) : $str41$;
                    result = cconcatenate(result, new SubLObject[]{ insert_header2, table_string2, field_string2, values_string2, $str180$_, string_utilities.$new_line_string$.getGlobalValue(), fetch_key_command, string_utilities.$new_line_string$.getGlobalValue() });
                } else {
                    cdestructuring_bind_error(datum2, $list179);
                }
            }
            return result;
        }
        if (sql_flavor.eql($$MSSQLServer)) {
            SubLObject result = $str41$;
            SubLObject list_var2 = NIL;
            SubLObject csql3 = NIL;
            SubLObject counter2 = NIL;
            list_var2 = csql_list.rest();
            csql3 = list_var2.first();
            for (counter2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , csql3 = list_var2.first() , counter2 = add(ONE_INTEGER, counter2)) {
                SubLObject current2;
                final SubLObject datum2 = current2 = csql3;
                SubLObject into2 = NIL;
                SubLObject fields2 = NIL;
                SubLObject field_values2 = NIL;
                SubLObject sequence_name = NIL;
                destructuring_bind_must_consp(current2, datum2, $list179);
                into2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                fields2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                field_values2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list179);
                sequence_name = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject insert_header2 = $$$INSERT;
                    final SubLObject table_string2 = interpret_csql_into_value(into2, sql_flavor);
                    final SubLObject field_string2 = interpret_csql_fields_value_insert(fields2, sql_flavor);
                    final SubLObject values_string2 = sql_for_field_values(field_values2, sql_flavor, UNPROVIDED);
                    final SubLObject fetch_key_command = (NIL != sequence_name) ? sql_for_get_last_key(counter2, sql_flavor) : $str41$;
                    result = cconcatenate(result, new SubLObject[]{ insert_header2, table_string2, field_string2, values_string2, $str180$_, string_utilities.$new_line_string$.getGlobalValue(), fetch_key_command, string_utilities.$new_line_string$.getGlobalValue() });
                } else {
                    cdestructuring_bind_error(datum2, $list179);
                }
            }
            return result;
        }
        Errors.error(cconcatenate($str154$unknown_sql_flavor_, string_utilities.str(sql_flavor)));
        return NIL;
    }

    public static SubLObject sql_for_returning_choice(final SubLObject returning_choice, final SubLObject counter, final SubLObject sql_flavor) {
        if (NIL == returning_choice) {
            return $str180$_;
        }
        if (sql_flavor.eql($$OracleDatabaseServer_TheProgram)) {
            return cconcatenate($$$_RETURNING_, new SubLObject[]{ returning_choice, $str182$_INTO_CYC_KEY_, string_utilities.str(counter), $str180$_ });
        }
        if (sql_flavor.eql($$PostgreSQL)) {
            return cconcatenate($str183$__, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return NIL;
    }

    public static SubLObject sql_for_get_last_key(final SubLObject counter, final SubLObject sql_flavor) {
        if (sql_flavor.eql($$MySQL_TheProgram)) {
            return cconcatenate($str184$select__CYC_KEY_, new SubLObject[]{ string_utilities.str(counter), $str185$__last_insert_id___ });
        }
        if (sql_flavor.eql($$MSSQLServer)) {
            return cconcatenate($str186$DECLARE__CYC_KEY_, new SubLObject[]{ string_utilities.str(counter), $str187$VARCHAR_999__, string_utilities.$new_line_string$.getGlobalValue(), $str188$SET__CYC_KEY_, string_utilities.str(counter), $str189$___SCOPE_IDENTITY___ });
        }
        Errors.error(cconcatenate($str154$unknown_sql_flavor_, string_utilities.str(sql_flavor)));
        return NIL;
    }

    public static SubLObject csql_extract_field_names(final SubLObject fields, final SubLObject sql_flavor) {
        SubLObject field_names = NIL;
        SubLObject eval_values = NIL;
        SubLObject cdolist_list_var = fields;
        SubLObject field = NIL;
        field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sksi_csql_utilities.csql_field_expression_p(field)) {
                SubLObject current;
                final SubLObject datum = current = field;
                SubLObject field_keyword = NIL;
                SubLObject field_name = NIL;
                destructuring_bind_must_consp(current, datum, $list190);
                field_keyword = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list190);
                field_name = current.first();
                current = current.rest();
                final SubLObject table_name = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list190);
                current = current.rest();
                final SubLObject namespace = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list190);
                current = current.rest();
                if (NIL == current) {
                    SubLObject modified_field_name = field_name;
                    if (NIL != table_name) {
                        modified_field_name = cconcatenate(table_name, new SubLObject[]{ $str15$_, field_name });
                        if (NIL != namespace) {
                            modified_field_name = cconcatenate(namespace, new SubLObject[]{ $str15$_, modified_field_name });
                        }
                    }
                    field_names = cons(modified_field_name, field_names);
                } else {
                    cdestructuring_bind_error(datum, $list190);
                }
            } else
                if (NIL != sksi_csql_utilities.csql_eval_expression_p(field)) {
                    eval_values = cons(make_sql_for_where_expression_int(sksi_csql_utilities.csql_expression_arg(field, ONE_INTEGER), sql_flavor), eval_values);
                }

            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        } 
        return values(nreverse(field_names), nreverse(eval_values));
    }

    public static SubLObject csql_extract_table_names(final SubLObject csql, final SubLObject operator, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_names = NIL;
        SubLObject operator_keyword = NIL;
        SubLObject tables = NIL;
        destructuring_bind_must_consp(csql, csql, $list191);
        operator_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list191);
        tables = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!operator.eql(operator_keyword))) {
                Errors.error($str192$malformed_csql_subexpression__a__, operator_keyword, operator);
            }
            table_names = csql_extract_table_names_int(tables, sql_flavor);
        } else {
            cdestructuring_bind_error(csql, $list191);
        }
        return table_names;
    }

    public static SubLObject csql_extract_table_names_int(final SubLObject tables, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_names = NIL;
        SubLObject cdolist_list_var = tables;
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = table;
            SubLObject table_keyword = NIL;
            SubLObject table_name = NIL;
            destructuring_bind_must_consp(current, datum, $list193);
            table_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list193);
            table_name = current.first();
            current = current.rest();
            final SubLObject table_as = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list193);
            current = current.rest();
            final SubLObject namespace = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list193);
            current = current.rest();
            if (NIL == current) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($TABLE != table_keyword)) {
                    Errors.error($str195$malformed_csql_subexpression__a__, table);
                }
                assert NIL != stringp(table_name) : "Types.stringp(table_name) " + "CommonSymbols.NIL != Types.stringp(table_name) " + table_name;
                SubLObject modified_table_name = table_name;
                if (NIL != table_as) {
                    assert NIL != stringp(table_as) : "Types.stringp(table_as) " + "CommonSymbols.NIL != Types.stringp(table_as) " + table_as;
                    if (NIL != kb_utilities.kbeq(sql_flavor, $$OracleDatabaseServer_TheProgram)) {
                        modified_table_name = cconcatenate(table_name, new SubLObject[]{ $$$_, table_as });
                    } else {
                        modified_table_name = cconcatenate(table_name, new SubLObject[]{ $$$_AS_, table_as });
                    }
                }
                if (NIL != namespace) {
                    modified_table_name = cconcatenate(namespace, new SubLObject[]{ $str15$_, modified_table_name });
                }
                table_names = cons(modified_table_name, table_names);
            } else {
                cdestructuring_bind_error(datum, $list193);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return nreverse(table_names);
    }

    public static SubLObject sql_for_table_names(final SubLObject table_names, final SubLObject sql_flavor) {
        SubLObject sql = $str41$;
        sql = cconcatenate(sql, table_names.first());
        SubLObject cdolist_list_var = table_names.rest();
        SubLObject table_name = NIL;
        table_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sql = cconcatenate(sql, new SubLObject[]{ $str46$__, table_name });
            cdolist_list_var = cdolist_list_var.rest();
            table_name = cdolist_list_var.first();
        } 
        return sql;
    }

    public static SubLObject csql_to_key_and_value_expressions(final SubLObject csql, SubLObject physical_schema) {
        if (physical_schema == UNPROVIDED) {
            physical_schema = NIL;
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = csql.first();
        if (pcase_var.eql($SELECT)) {
            return csql_to_key_and_value_expressions_select(csql);
        }
        if (pcase_var.eql($INSERT)) {
            return csql_to_key_and_value_expressions_insert(csql, physical_schema);
        }
        if (pcase_var.eql($DELETE)) {
            return csql_to_key_and_value_expressions_delete(csql, physical_schema);
        }
        Errors.error($str10$unknown_csql_operator__a_in_expre, operator, csql);
        return NIL;
    }

    public static SubLObject csql_to_key_and_value_expressions_select(final SubLObject csql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_keyword = NIL;
        SubLObject fields = NIL;
        SubLObject from = NIL;
        destructuring_bind_must_consp(csql, csql, $list197);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list197);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list197);
        from = current.first();
        current = current.rest();
        final SubLObject where = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, csql, $list197);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(csql, $list197);
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SELECT != select_keyword)) {
            Errors.error($str198$malformed_csql_expression__a, csql);
        }
        final SubLObject where_fields = second(where);
        if (NIL != where_fields) {
            final SubLObject key = get_key_expression_from_where_fields(where_fields);
            final SubLObject key_value = get_key_value_expression_from_where_fields(where_fields);
            return values(key, key_value, T);
        }
        return values(NIL, NIL, NIL);
    }

    public static SubLObject get_key_expression_from_where_fields(final SubLObject where_fields) {
        return third(find($KEY, where_fields, symbol_function(EQ), CAADR, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_key_value_expression_from_where_fields(final SubLObject where_fields) {
        return third(find($KEY_VALUE, where_fields, symbol_function(EQ), CAADR, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject csql_to_key_and_value_expressions_insert(final SubLObject csql, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator_keyword = NIL;
        SubLObject into = NIL;
        SubLObject fields = NIL;
        SubLObject field_values = NIL;
        destructuring_bind_must_consp(csql, csql, $list202);
        operator_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list202);
        into = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list202);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list202);
        field_values = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (operator_keyword != $INSERT)) {
                Errors.error($str203$malformed_csql_subexpression__a__, operator_keyword);
            }
            SubLObject current_$13;
            final SubLObject datum_$12 = current_$13 = field_values;
            SubLObject values_keyword = NIL;
            SubLObject field_value_list = NIL;
            destructuring_bind_must_consp(current_$13, datum_$12, $list204);
            values_keyword = current_$13.first();
            current_$13 = current_$13.rest();
            destructuring_bind_must_consp(current_$13, datum_$12, $list204);
            field_value_list = current_$13.first();
            current_$13 = current_$13.rest();
            if (NIL == current_$13) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($VALUES != values_keyword)) {
                    Errors.error($str140$malformed_csql_subexpression__a__, values_keyword);
                }
                final SubLObject indexed_field_name = sksi_kb_accessors.sksi_determine_singly_indexed_schema_indexed_field(physical_schema);
                final SubLObject schema_field_name_list = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
                final SubLObject ordered_fields = list_utilities.sort_via_position(fields, schema_field_name_list, symbol_function(EQUAL), SECOND);
                final SubLObject key_position = position(indexed_field_name, ordered_fields, symbol_function(EQUAL), SECOND, UNPROVIDED, UNPROVIDED);
                final SubLObject key = nth(key_position, field_value_list);
                final SubLObject key_value_list = list_utilities.remove_nth(key_position, field_value_list);
                final SubLObject key_value = (NIL != list_utilities.singletonP(key_value_list)) ? key_value_list.first() : key_value_list;
                return values(key, key_value, NIL);
            }
            cdestructuring_bind_error(datum_$12, $list204);
        } else {
            cdestructuring_bind_error(csql, $list202);
        }
        return NIL;
    }

    public static SubLObject csql_to_key_and_value_expressions_delete(final SubLObject csql, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator_keyword = NIL;
        SubLObject from = NIL;
        SubLObject where_clause = NIL;
        destructuring_bind_must_consp(csql, csql, $list205);
        operator_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list205);
        from = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list205);
        where_clause = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (operator_keyword != $DELETE)) {
                Errors.error($str206$malformed_csql_subexpression__a__, operator_keyword);
            }
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = where_clause;
            SubLObject where_keyword = NIL;
            SubLObject where_conditions = NIL;
            destructuring_bind_must_consp(current_$15, datum_$14, $list207);
            where_keyword = current_$15.first();
            current_$15 = current_$15.rest();
            destructuring_bind_must_consp(current_$15, datum_$14, $list207);
            where_conditions = current_$15.first();
            current_$15 = current_$15.rest();
            if (NIL == current_$15) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($WHERE != where_keyword)) {
                    Errors.error($str63$malformed_csql_subexpression__a__, where_keyword);
                }
                final SubLObject indexed_field_name = sksi_kb_accessors.sksi_determine_singly_indexed_schema_indexed_field(physical_schema);
                final SubLObject schema_field_name_list = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
                final SubLObject key = sksi_csql_utilities.csql_expression_arg2(find(indexed_field_name, where_conditions, symbol_function(EQUAL), CADADR, UNPROVIDED, UNPROVIDED));
                final SubLObject ordered_where_conditions = list_utilities.sort_via_position(where_conditions, schema_field_name_list, symbol_function(EQUAL), CADADR);
                final SubLObject value_conditions = remove(indexed_field_name, ordered_where_conditions, symbol_function(EQUAL), CADADR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject key_value_list = Mapping.mapcar(CSQL_EXPRESSION_ARG2, value_conditions);
                final SubLObject key_value = (NIL != list_utilities.singletonP(key_value_list)) ? key_value_list.first() : key_value_list;
                return values(key, key_value, NIL);
            }
            cdestructuring_bind_error(datum_$14, $list207);
        } else {
            cdestructuring_bind_error(csql, $list205);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_csql_interpretation_file() {
        declareFunction(me, "csql_to_sql", "CSQL-TO-SQL", 2, 1, false);
        declareFunction(me, "test_csql_to_sql", "TEST-CSQL-TO-SQL", 2, 1, false);
        declareFunction(me, "csql_to_sql_select", "CSQL-TO-SQL-SELECT", 2, 2, false);
        declareFunction(me, "sql_interpret_csql_fields_value_select", "SQL-INTERPRET-CSQL-FIELDS-VALUE-SELECT", 2, 1, false);
        declareFunction(me, "sql_interpret_csql_from_value", "SQL-INTERPRET-CSQL-FROM-VALUE", 2, 0, false);
        declareFunction(me, "sql_for_field_names_select", "SQL-FOR-FIELD-NAMES-SELECT", 2, 1, false);
        declareFunction(me, "sql_for_field", "SQL-FOR-FIELD", 1, 0, false);
        declareFunction(me, "make_sql_for_order_by_clause", "MAKE-SQL-FOR-ORDER-BY-CLAUSE", 2, 0, false);
        declareFunction(me, "sksi_escape_single_quote_in_sql_string", "SKSI-ESCAPE-SINGLE-QUOTE-IN-SQL-STRING", 1, 0, false);
        declareFunction(me, "sksi_replace_double_quotes_with_single_quotes_in_sql_string", "SKSI-REPLACE-DOUBLE-QUOTES-WITH-SINGLE-QUOTES-IN-SQL-STRING", 1, 0, false);
        declareFunction(me, "sksi_replace_double_quotes_with_single_quotes_in_sql_string_int", "SKSI-REPLACE-DOUBLE-QUOTES-WITH-SINGLE-QUOTES-IN-SQL-STRING-INT", 1, 0, false);
        declareFunction(me, "make_sql_for_where_clause", "MAKE-SQL-FOR-WHERE-CLAUSE", 2, 1, false);
        declareFunction(me, "make_sql_for_where_clause_int", "MAKE-SQL-FOR-WHERE-CLAUSE-INT", 2, 1, false);
        declareFunction(me, "make_sql_for_where_expression", "MAKE-SQL-FOR-WHERE-EXPRESSION", 2, 0, false);
        declareFunction(me, "make_sql_for_csql_value", "MAKE-SQL-FOR-CSQL-VALUE", 2, 0, false);
        declareFunction(me, "make_sql_for_field_expression", "MAKE-SQL-FOR-FIELD-EXPRESSION", 2, 0, false);
        declareFunction(me, "csql_comparison_list_p", "CSQL-COMPARISON-LIST-P", 1, 0, false);
        declareFunction(me, "make_sql_for_comparison_or_arithmetic_or_like_or_ilike_or_unlike_or_later_than_expression", "MAKE-SQL-FOR-COMPARISON-OR-ARITHMETIC-OR-LIKE-OR-ILIKE-OR-UNLIKE-OR-LATER-THAN-EXPRESSION", 3, 0, false);
        declareFunction(me, "make_sql_for_comparison_or_arithmetic_or_like_or_ilike_or_unlike_or_later_than_expression_int", "MAKE-SQL-FOR-COMPARISON-OR-ARITHMETIC-OR-LIKE-OR-ILIKE-OR-UNLIKE-OR-LATER-THAN-EXPRESSION-INT", 4, 0, false);
        declareFunction(me, "make_sql_for_where_expression_int2", "MAKE-SQL-FOR-WHERE-EXPRESSION-INT2", 2, 0, false);
        declareFunction(me, "make_sql_for_where_expression_int", "MAKE-SQL-FOR-WHERE-EXPRESSION-INT", 2, 0, false);
        declareFunction(me, "test_make_sql_for_where_expression_int", "TEST-MAKE-SQL-FOR-WHERE-EXPRESSION-INT", 2, 0, false);
        declareFunction(me, "make_sql_for_csql_function_expression", "MAKE-SQL-FOR-CSQL-FUNCTION-EXPRESSION", 3, 0, false);
        declareFunction(me, "sql_wildcard_characterP", "SQL-WILDCARD-CHARACTER?", 1, 0, false);
        declareFunction(me, "string_with_sql_wildcardP", "STRING-WITH-SQL-WILDCARD?", 1, 0, false);
        declareFunction(me, "make_sql_for_equal_different_expression", "MAKE-SQL-FOR-EQUAL-DIFFERENT-EXPRESSION", 3, 0, false);
        declareFunction(me, "make_sql_for_between_expression", "MAKE-SQL-FOR-BETWEEN-EXPRESSION", 2, 0, false);
        declareFunction(me, "make_sql_for_csql_logical_connective_expression", "MAKE-SQL-FOR-CSQL-LOGICAL-CONNECTIVE-EXPRESSION", 3, 0, false);
        declareFunction(me, "make_sql_for_csql_quantifier_expression", "MAKE-SQL-FOR-CSQL-QUANTIFIER-EXPRESSION", 3, 0, false);
        declareFunction(me, "make_sql_for_in_expression", "MAKE-SQL-FOR-IN-EXPRESSION", 2, 0, false);
        declareFunction(me, "make_sql_for_in_expression_list", "MAKE-SQL-FOR-IN-EXPRESSION-LIST", 2, 0, false);
        declareFunction(me, "database_date_string_p", "DATABASE-DATE-STRING-P", 1, 0, false);
        declareFunction(me, "database_date_string_char_p", "DATABASE-DATE-STRING-CHAR-P", 1, 0, false);
        declareFunction(me, "csql_to_sql_insert", "CSQL-TO-SQL-INSERT", 2, 0, false);
        declareFunction(me, "interpret_csql_fields_value_insert", "INTERPRET-CSQL-FIELDS-VALUE-INSERT", 2, 0, false);
        declareFunction(me, "sql_for_field_values", "SQL-FOR-FIELD-VALUES", 2, 1, false);
        declareFunction(me, "make_sql_for_field_value", "MAKE-SQL-FOR-FIELD-VALUE", 2, 1, false);
        declareFunction(me, "interpret_csql_into_value", "INTERPRET-CSQL-INTO-VALUE", 2, 0, false);
        declareFunction(me, "csql_to_sql_delete", "CSQL-TO-SQL-DELETE", 2, 0, false);
        declareFunction(me, "construct_sql_delete_where_clause", "CONSTRUCT-SQL-DELETE-WHERE-CLAUSE", 3, 0, false);
        declareFunction(me, "sql_for_equals_pairs", "SQL-FOR-EQUALS-PAIRS", 2, 0, false);
        declareFunction(me, "make_sql_for_equals_pair", "MAKE-SQL-FOR-EQUALS-PAIR", 2, 0, false);
        declareFunction(me, "csql_to_sql_update", "CSQL-TO-SQL-UPDATE", 2, 0, false);
        declareFunction(me, "make_sql_for_set_clause", "MAKE-SQL-FOR-SET-CLAUSE", 2, 0, false);
        declareFunction(me, "sql_paranthesis_character_p", "SQL-PARANTHESIS-CHARACTER-P", 1, 0, false);
        declareFunction(me, "csql_to_sql_insert_multiple", "CSQL-TO-SQL-INSERT-MULTIPLE", 2, 0, false);
        declareFunction(me, "sql_for_returning_choice", "SQL-FOR-RETURNING-CHOICE", 3, 0, false);
        declareFunction(me, "sql_for_get_last_key", "SQL-FOR-GET-LAST-KEY", 2, 0, false);
        declareFunction(me, "csql_extract_field_names", "CSQL-EXTRACT-FIELD-NAMES", 2, 0, false);
        declareFunction(me, "csql_extract_table_names", "CSQL-EXTRACT-TABLE-NAMES", 3, 0, false);
        declareFunction(me, "csql_extract_table_names_int", "CSQL-EXTRACT-TABLE-NAMES-INT", 2, 0, false);
        declareFunction(me, "sql_for_table_names", "SQL-FOR-TABLE-NAMES", 2, 0, false);
        declareFunction(me, "csql_to_key_and_value_expressions", "CSQL-TO-KEY-AND-VALUE-EXPRESSIONS", 1, 1, false);
        declareFunction(me, "csql_to_key_and_value_expressions_select", "CSQL-TO-KEY-AND-VALUE-EXPRESSIONS-SELECT", 1, 0, false);
        declareFunction(me, "get_key_expression_from_where_fields", "GET-KEY-EXPRESSION-FROM-WHERE-FIELDS", 1, 0, false);
        declareFunction(me, "get_key_value_expression_from_where_fields", "GET-KEY-VALUE-EXPRESSION-FROM-WHERE-FIELDS", 1, 0, false);
        declareFunction(me, "csql_to_key_and_value_expressions_insert", "CSQL-TO-KEY-AND-VALUE-EXPRESSIONS-INSERT", 2, 0, false);
        declareFunction(me, "csql_to_key_and_value_expressions_delete", "CSQL-TO-KEY-AND-VALUE-EXPRESSIONS-DELETE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_csql_interpretation_file() {
        deflexical("*SQL-BACKENDS-THAT-SHOULD-NOT-ESCAPE-SINGLE-QUOTES*", $list64);
        deflexical("*SQL-WILDCARD-CHARACTERS*", $list114);
        return NIL;
    }

    public static SubLObject setup_sksi_csql_interpretation_file() {
        define_test_case_table_int(TEST_CSQL_TO_SQL, list(new SubLObject[]{ $TEST, $sym20$STRING_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list26);
        define_test_case_table_int(TEST_MAKE_SQL_FOR_WHERE_EXPRESSION_INT, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list112);
        return NIL;
    }

    private static SubLObject _constant_26_initializer() {
        return list(list(list(list(makeKeyword("SELECT"), list(new SubLObject[]{ list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("drug724294")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724301")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724301")), list(makeKeyword("EVAL"), list(reader_make_constant_shell(makeString("CSQLDateAfterFn")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(reader_make_constant_shell(makeString("CSQLSecondsDurationFn")), makeInteger(25920000)))) }), list(makeKeyword("FROM"), list(list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724301"), NIL), list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724299"), NIL), list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724295"), NIL), list(makeKeyword("TABLE"), makeString("drug"), makeString("drug724294"), NIL))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell(makeString("CSQLLaterThan")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724301")), list(reader_make_constant_shell(makeString("CSQLDateAfterFn")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(reader_make_constant_shell(makeString("CSQLSecondsDurationFn")), makeInteger(25920000)))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("drug724294"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("specific_class_cde"), makeString("drug724294")), makeString("H2F")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724295")), makeInteger("939621383841318230")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("claim_accepted_ind"), makeString("claim724299")), makeString("Y"))))), reader_make_constant_shell(makeString("PostgreSQL"))), makeString("SELECT DISTINCT drug724294.product_service_id, claim724295.patient_id, claim724299.phcy_claim_id, claim724299.product_service_id, claim724299.patient_id, claim724299.serviced_dte, claim724301.phcy_claim_id, claim724301.patient_id, claim724301.serviced_dte, (claim724299.serviced_dte + \'25920000 seconds\'::interval)\n FROM claim AS claim724301, claim AS claim724299, claim AS claim724295, drug AS drug724294 \nWHERE (claim724299.claim_accepted_ind = \'Y\')\n AND (claim724295.phcy_claim_id = 939621383841318230)\n AND (drug724294.specific_class_cde = \'H2F\')\n AND (claim724299.product_service_id = drug724294.product_service_id)\n AND (claim724295.patient_id = claim724299.patient_id)\n AND (claim724295.patient_id = claim724301.patient_id)\n AND (claim724299.patient_id = claim724301.patient_id)\n AND (claim724301.serviced_dte > (claim724299.serviced_dte + \'25920000 seconds\'::interval))\n AND (drug724294.product_service_id IS NOT NULL)\n AND (claim724295.patient_id IS NOT NULL)\n AND (claim724299.phcy_claim_id IS NOT NULL)\n AND (claim724299.product_service_id IS NOT NULL)\n AND (claim724299.patient_id IS NOT NULL)\n AND (claim724299.serviced_dte IS NOT NULL)\n AND (claim724301.phcy_claim_id IS NOT NULL)\n AND (claim724301.patient_id IS NOT NULL)\n AND (claim724301.serviced_dte IS NOT NULL)")), list(list(list(makeKeyword("SELECT"), list(new SubLObject[]{ list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("drug724294")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724301")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724301")), list(makeKeyword("EVAL"), list(reader_make_constant_shell(makeString("CSQLDateAfterFn")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(reader_make_constant_shell(makeString("CSQLSecondsDurationFn")), makeInteger(25920000)))) }), list(makeKeyword("FROM"), list(list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724301"), NIL), list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724299"), NIL), list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724295"), NIL), list(makeKeyword("TABLE"), makeString("drug"), makeString("drug724294"), NIL))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell(makeString("CSQLLaterThan")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724301")), list(reader_make_constant_shell(makeString("CSQLDateAfterFn")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(reader_make_constant_shell(makeString("CSQLMonthsDurationFn")), THREE_INTEGER))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("drug724294"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("specific_class_cde"), makeString("drug724294")), makeString("H2F")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724295")), makeInteger("939621383841318230")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("claim_accepted_ind"), makeString("claim724299")), makeString("Y"))))), reader_make_constant_shell(makeString("PostgreSQL"))), makeString("SELECT DISTINCT drug724294.product_service_id, claim724295.patient_id, claim724299.phcy_claim_id, claim724299.product_service_id, claim724299.patient_id, claim724299.serviced_dte, claim724301.phcy_claim_id, claim724301.patient_id, claim724301.serviced_dte, (claim724299.serviced_dte + \'25920000 seconds\'::interval)\n FROM claim AS claim724301, claim AS claim724299, claim AS claim724295, drug AS drug724294 \nWHERE (claim724299.claim_accepted_ind = \'Y\')\n AND (claim724295.phcy_claim_id = 939621383841318230)\n AND (drug724294.specific_class_cde = \'H2F\')\n AND (claim724299.product_service_id = drug724294.product_service_id)\n AND (claim724295.patient_id = claim724299.patient_id)\n AND (claim724295.patient_id = claim724301.patient_id)\n AND (claim724299.patient_id = claim724301.patient_id)\n AND (claim724301.serviced_dte > (claim724299.serviced_dte + \'3 months\'::interval))\n AND (drug724294.product_service_id IS NOT NULL)\n AND (claim724295.patient_id IS NOT NULL)\n AND (claim724299.phcy_claim_id IS NOT NULL)\n AND (claim724299.product_service_id IS NOT NULL)\n AND (claim724299.patient_id IS NOT NULL)\n AND (claim724299.serviced_dte IS NOT NULL)\n AND (claim724301.phcy_claim_id IS NOT NULL)\n AND (claim724301.patient_id IS NOT NULL)\n AND (claim724301.serviced_dte IS NOT NULL)")), list(list(list(makeKeyword("SELECT"), list(new SubLObject[]{ list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("drug724294")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724301")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724301")), list(makeKeyword("EVAL"), list(reader_make_constant_shell(makeString("CSQLDateAfterFn")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(reader_make_constant_shell(makeString("CSQLSecondsDurationFn")), makeInteger(25920000)))) }), list(makeKeyword("FROM"), list(list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724301"), NIL), list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724299"), NIL), list(makeKeyword("TABLE"), makeString("claim"), makeString("claim724295"), NIL), list(makeKeyword("TABLE"), makeString("drug"), makeString("drug724294"), NIL))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell(makeString("CSQLLaterThan")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724301")), list(reader_make_constant_shell(makeString("CSQLDateAfterFn")), list(makeKeyword("FIELD"), makeString("serviced_dte"), makeString("claim724299")), list(reader_make_constant_shell(makeString("CSQLYearsDurationFn")), ONE_INTEGER))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724301"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724295")), list(makeKeyword("FIELD"), makeString("patient_id"), makeString("claim724299"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("claim724299")), list(makeKeyword("FIELD"), makeString("product_service_id"), makeString("drug724294"))), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("specific_class_cde"), makeString("drug724294")), makeString("H2F")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("phcy_claim_id"), makeString("claim724295")), makeInteger("939621383841318230")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("claim_accepted_ind"), makeString("claim724299")), makeString("Y"))))), reader_make_constant_shell(makeString("PostgreSQL"))), makeString("SELECT DISTINCT drug724294.product_service_id, claim724295.patient_id, claim724299.phcy_claim_id, claim724299.product_service_id, claim724299.patient_id, claim724299.serviced_dte, claim724301.phcy_claim_id, claim724301.patient_id, claim724301.serviced_dte, (claim724299.serviced_dte + \'25920000 seconds\'::interval)\n FROM claim AS claim724301, claim AS claim724299, claim AS claim724295, drug AS drug724294 \nWHERE (claim724299.claim_accepted_ind = \'Y\')\n AND (claim724295.phcy_claim_id = 939621383841318230)\n AND (drug724294.specific_class_cde = \'H2F\')\n AND (claim724299.product_service_id = drug724294.product_service_id)\n AND (claim724295.patient_id = claim724299.patient_id)\n AND (claim724295.patient_id = claim724301.patient_id)\n AND (claim724299.patient_id = claim724301.patient_id)\n AND (claim724301.serviced_dte > (claim724299.serviced_dte + \'1 years\'::interval))\n AND (drug724294.product_service_id IS NOT NULL)\n AND (claim724295.patient_id IS NOT NULL)\n AND (claim724299.phcy_claim_id IS NOT NULL)\n AND (claim724299.product_service_id IS NOT NULL)\n AND (claim724299.patient_id IS NOT NULL)\n AND (claim724299.serviced_dte IS NOT NULL)\n AND (claim724301.phcy_claim_id IS NOT NULL)\n AND (claim724301.patient_id IS NOT NULL)\n AND (claim724301.serviced_dte IS NOT NULL)")));
    }

    @Override
    public void declareFunctions() {
        declare_sksi_csql_interpretation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_csql_interpretation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_csql_interpretation_file();
    }

    
}

/**
 * Total time: 737 ms
 */
