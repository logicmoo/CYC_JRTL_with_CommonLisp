/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_equal_clause_p;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities.csql_field_name;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charNE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_csql_sparql_interpretation extends SubLTranslatedFile implements V12 {
    public static final SubLObject write_sparql_oracle_sem_prefix_header(SubLObject stream) {
        {
            SubLObject prefix = $str_alt7$ORACLE_SEM_FS_NS;
            SubLObject timeout = $int$300;
            SubLObject parallelism = ONE_INTEGER;
            SubLObject prefix_uri = cconcatenate($str_alt9$http___oracle_com_semtech_timeout, new SubLObject[]{ format_nil.format_nil_a_no_copy(ceiling(timeout, UNPROVIDED)), $str_alt10$_ordered, format_nil.format_nil_a_no_copy(parallelism.numG(ONE_INTEGER) ? ((SubLObject) (cconcatenate($str_alt11$_dop_, format_nil.format_nil_a_no_copy(parallelism)))) : $str_alt12$), $str_alt13$_plain_sql_opt_f });
            format(stream, $str_alt6$PREFIX__A__, prefix);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_uri_tag(prefix_uri, stream);
            terpri(stream);
        }
        return NIL;
    }

    public static final SubLObject csql_field_p(SubLObject v_object) {
        return makeBoolean((((v_object.isList() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && ($FIELD == v_object.first())) && second(v_object).isString()) && third(v_object).isString());
    }

    static private final SubLString $str_alt12$ = makeString("");

    // Definitions
    /**
     * When non-nil, the SPARQL backend includes Oracle query assumptions.
     */
    // defvar
    @LispMethod(comment = "When non-nil, the SPARQL backend includes Oracle query assumptions.\ndefvar")
    private static final SubLSymbol $sparql_oracle_backendP$ = makeSymbol("*SPARQL-ORACLE-BACKEND?*");

    public static final SubLFile me = new sksi_csql_sparql_interpretation();



    // defvar
    /**
     * When non-nil, an integer to use as an overriding LIMIT for any SPARQL query.
     */
    @LispMethod(comment = "When non-nil, an integer to use as an overriding LIMIT for any SPARQL query.\ndefvar")
    public static final SubLSymbol $sparql_limit_override$ = makeSymbol("*SPARQL-LIMIT-OVERRIDE*");

    // defvar
    /**
     * When non-nil, an integer to use as an overriding OFFSET for any SPARQL query.
     */
    @LispMethod(comment = "When non-nil, an integer to use as an overriding OFFSET for any SPARQL query.\ndefvar")
    public static final SubLSymbol $sparql_offset_override$ = makeSymbol("*SPARQL-OFFSET-OVERRIDE*");

    // defparameter
    /**
     * Parameter set before a recursive sparql query to add finding the graph to the
     * query.
     */
    @LispMethod(comment = "Parameter set before a recursive sparql query to add finding the graph to the\r\nquery.\ndefparameter\nParameter set before a recursive sparql query to add finding the graph to the\nquery.")
    public static final SubLSymbol $sksi_sparql_ist_graph_variable$ = makeSymbol("*SKSI-SPARQL-IST-GRAPH-VARIABLE*");

    // defparameter
    /**
     * Parameter set inside a recursive sparql query to provide graph bindings to
     * the caller.
     */
    @LispMethod(comment = "Parameter set inside a recursive sparql query to provide graph bindings to\r\nthe caller.\ndefparameter\nParameter set inside a recursive sparql query to provide graph bindings to\nthe caller.")
    public static final SubLSymbol $sksi_sparql_ist_graph_result$ = makeSymbol("*SKSI-SPARQL-IST-GRAPH-RESULT*");

    // defparameter
    /**
     * When this is enabled (via :all or :first-rest) we assume the sparql query
     * will do no cross-graph querying, (i.e. for ccf no queries comparing patients)
     * and so can assume the graph used for the first literal is sufficent for the
     * rest of the literals. :all means wrap GRAPH ?G once around the etire query
     * whie :first-rest mean wrap bothe the first literal and the rest of the
     * literals in a GRAPH ?G block.
     */
    @LispMethod(comment = "When this is enabled (via :all or :first-rest) we assume the sparql query\r\nwill do no cross-graph querying, (i.e. for ccf no queries comparing patients)\r\nand so can assume the graph used for the first literal is sufficent for the\r\nrest of the literals. :all means wrap GRAPH ?G once around the etire query\r\nwhie :first-rest mean wrap bothe the first literal and the rest of the\r\nliterals in a GRAPH ?G block.\ndefparameter\nWhen this is enabled (via :all or :first-rest) we assume the sparql query\nwill do no cross-graph querying, (i.e. for ccf no queries comparing patients)\nand so can assume the graph used for the first literal is sufficent for the\nrest of the literals. :all means wrap GRAPH ?G once around the etire query\nwhie :first-rest mean wrap bothe the first literal and the rest of the\nliterals in a GRAPH ?G block.")
    private static final SubLSymbol $sksi_sparql_graph_optimization_enabledP$ = makeSymbol("*SKSI-SPARQL-GRAPH-OPTIMIZATION-ENABLED?*");

    // defparameter
    /**
     * When non-nil, all non-literal expressions in a SPARQL query are postponed to
     * the last part of the query so as to maximize the number of contiguous
     * literals in a conjunctive SPARQL query.
     */
    @LispMethod(comment = "When non-nil, all non-literal expressions in a SPARQL query are postponed to\r\nthe last part of the query so as to maximize the number of contiguous\r\nliterals in a conjunctive SPARQL query.\ndefparameter\nWhen non-nil, all non-literal expressions in a SPARQL query are postponed to\nthe last part of the query so as to maximize the number of contiguous\nliterals in a conjunctive SPARQL query.")
    private static final SubLSymbol $sksi_sparql_maximize_literal_conjunctionP$ = makeSymbol("*SKSI-SPARQL-MAXIMIZE-LITERAL-CONJUNCTION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_sparql_force_date_comparisons_as_stringsP$ = makeSymbol("*SKSI-SPARQL-FORCE-DATE-COMPARISONS-AS-STRINGS?*");

    // defparameter
    /**
     * When non-nil, a SPARQL identifier like rdf:type is expanded into its full URI
     * form like <http://www/w3.org/2000/02/22-rdf-syntax-ns#type>
     */
    @LispMethod(comment = "When non-nil, a SPARQL identifier like rdf:type is expanded into its full URI\r\nform like <http://www/w3.org/2000/02/22-rdf-syntax-ns#type>\ndefparameter\nWhen non-nil, a SPARQL identifier like rdf:type is expanded into its full URI\nform like <http://www/w3.org/2000/02/22-rdf-syntax-ns#type>")
    public static final SubLSymbol $sparql_expand_identifier_stringsP$ = makeSymbol("*SPARQL-EXPAND-IDENTIFIER-STRINGS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $test_access_path_alist$ = makeSymbol("*TEST-ACCESS-PATH-ALIST*");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list1 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str4$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");

    private static final SubLString $str6$_A = makeString("~A");

    private static final SubLString $$$BASE_ = makeString("BASE ");

    private static final SubLList $list8 = cons(makeSymbol("PREFIX"), makeSymbol("PREFIX-URI"));

    private static final SubLString $str9$PREFIX__A__ = makeString("PREFIX ~A: ");

    private static final SubLList $list11 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("LIMIT"), makeSymbol("OFFSET"));

    private static final SubLString $$$ASK = makeString("ASK");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$SELECT = makeString("SELECT");

    private static final SubLString $$$WHERE = makeString("WHERE");

    private static final SubLString $str16$_ = makeString("{");

    private static final SubLString $str17$GRAPH__CONTEXT = makeString("GRAPH ?CONTEXT");

    private static final SubLString $str18$___ = makeString(" { ");

    static private final SubLString $str19$_ = makeString("}");

    private static final SubLString $$$LIMIT = makeString("LIMIT");

    private static final SubLString $$$OFFSET = makeString("OFFSET");

    private static final SubLString $str22$__ = makeString(" *");

    private static final SubLList $list23 = list(makeSymbol("VARIABLES-KEYWORD"), makeSymbol("&REST"), makeSymbol("VARIABLES"));

    private static final SubLString $str25$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :variables");

    private static final SubLString $str26$__A = makeString(" ~A");

    static private final SubLList $list27 = list(makeKeyword("COUNT"), makeKeyword("ALL"));

    private static final SubLString $$$subject = makeString("subject");

    private static final SubLString $str30$_subj = makeString("?subj");

    private static final SubLString $$$predicate = makeString("predicate");

    private static final SubLString $str32$_pred = makeString("?pred");

    private static final SubLString $$$object = makeString("object");

    private static final SubLString $str34$_obj = makeString("?obj");

    private static final SubLString $str35$Unsupported_SPARQL_field_name__S = makeString("Unsupported SPARQL field name ~S");

    private static final SubLList $list36 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-EXPRESSIONS"));

    private static final SubLString $str38$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :where");

    private static final SubLString $str39$GRAPH__G____ = makeString("GRAPH ?G {~%");

    private static final SubLString $str41$___ = makeString("}~%");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $str43$__ = makeString(" .");



    private static final SubLSymbol CSQL_LITERAL_WHERE_EXPRESSION_P = makeSymbol("CSQL-LITERAL-WHERE-EXPRESSION-P");

    private static final SubLList $list47 = list(makeSymbol("LITERAL-KEYWORD"), makeSymbol("LITERAL"));

    private static final SubLList $list49 = list(makeSymbol("EXPRESSION-KEYWORD"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLString $str51$Unexpected_where_clause____S = makeString("Unexpected where-clause : ~S");

    private static final SubLList $list52 = list(makeSymbol("CSQL-OPERATOR"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLObject $$Sparql_P_TheProgram = reader_make_constant_shell("Sparql-P-TheProgram");

    private static final SubLString $str54$CSQL_operator__A_missing___csqlOp = makeString("CSQL operator ~A missing #$csqlOperatorToSQLOperator for #$Sparql-P-TheProgram.");

    private static final SubLString $str55$__FILTER__ = makeString("  FILTER (");



    private static final SubLString $str57$_A_ = makeString("~A ");

    private static final SubLString $str58$____ = makeString(" || ");

    private static final SubLString $str59$Set_arguments_only_supported_for_ = makeString("Set arguments only supported for #$CSQLEqualsAny");

    private static final SubLString $str60$_ = makeString(")");

    private static final SubLList $list61 = list(makeSymbol("UNKNOWN-SENTENCE-KEYWORD"), makeSymbol("EXISTENTIAL-VARS-LIST"), makeSymbol("SUB-WHERE"));

    private static final SubLList $list62 = cons(makeSymbol("EXISTENTIAL-VARS-KEYWORD"), makeSymbol("EXISTENTIAL-VARS"));

    private static final SubLString $str63$OPTIONAL____ = makeString("OPTIONAL {~%");

    private static final SubLString $str64$FILTER__ = makeString("FILTER (");

    private static final SubLString $str65$__bound__A__ = makeString(" !bound(~A) ");

    private static final SubLString $str66$___ = makeString("|| ");

    private static final SubLString $str67$___ = makeString(")~%");

    private static final SubLList $list68 = list(makeSymbol("LITERAL-KEYWORD"), list(makeSymbol("PREDICATE"), makeSymbol("SUBJECT"), makeSymbol("OBJECT")));

    private static final SubLSymbol CSQL_DISJUNCTION_P = makeSymbol("CSQL-DISJUNCTION-P");

    private static final SubLString $str70$__ = makeString(" {");

    private static final SubLString $$$___UNION = makeString("   UNION");

    private static final SubLList $list72 = list(makeSymbol("ONE-SUBJECT"), makeSymbol("ONE-PREDICATE"), makeSymbol("ONE-OBJECT"));

    private static final SubLString $str73$___ = makeString(" } ");

    private static final SubLString $str74$_ = makeString(".");





    private static final SubLString $str78$STR_ = makeString("STR(");

    private static final SubLString $str79$xsd_dateTime_ = makeString("xsd:dateTime(");

    private static final SubLString $str80$xsd_dateTime__ = makeString("xsd:dateTime(\"");

    private static final SubLString $str81$__ = makeString("\")");

    private static final SubLString $str82$xsd_string_ = makeString("xsd:string(");

    private static final SubLString $str83$xsd_float_ = makeString("xsd:float(");

    private static final SubLString $str84$xsd_float__F_ = makeString("xsd:float(~F)");

    private static final SubLString $str85$Unexpected_where_clause_argument_ = makeString("Unexpected where-clause argument : ~A");

    private static final SubLString $str86$Unexpected_equality_clause____S = makeString("Unexpected equality-clause : ~S");

    private static final SubLList $list87 = list(makeSymbol("EQUALITY"), makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));

    private static final SubLString $str88$Time_to_support_multiple___A_cons = makeString("Time to support multiple ~~A constraints : ~S");

    private static final SubLString $str89$Time_to_handle_constraint____S = makeString("Time to handle constraint : ~S");

    private static final SubLString $str90$_ = makeString("<");

    private static final SubLString $str91$_ = makeString(">");

    private static final SubLSymbol SPARQL_UNESCAPED_IDENTIFIER_CHAR_P = makeSymbol("SPARQL-UNESCAPED-IDENTIFIER-CHAR-P");

    private static final SubLList $list93 = list(CHAR_colon, CHAR_hyphen, CHAR_underbar);

    private static final SubLList $list94 = list(makeSymbol("LIMIT-KEYWORD"), makeSymbol("LIMIT-NUMBER"));

    private static final SubLString $str96$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :limit");

    private static final SubLList $list97 = list(makeSymbol("OFFSET-KEYWORD"), makeSymbol("OFFSET-NUMBER"));

    private static final SubLString $str99$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :offset");

    private static final SubLString $str100$__ = makeString("_:");

    private static final SubLString $str101$_ = makeString(":");

    private static final SubLSymbol $sym102$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str103$Could_not_find_expanded_prefix_fo = makeString("Could not find expanded-prefix for ~A in map ~A~%");

    private static final SubLString $str104$_F = makeString("~F");

    private static final SubLList $list105 = list(makeString("true"), makeString("false"));

    private static final SubLString $str106$__xsd_boolean = makeString("^^xsd:boolean");

    private static final SubLList $list107 = list(cons(reader_make_constant_shell("baseNamespaceForSKS"), makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), list(reader_make_constant_shell("nameSpacePrefixForSKS"), cons(makeString("owl"), makeString("http://www/w3.org/2000/07/owl#")), cons(makeString("ptrec"), makeString("http://clevelandclinicfoundation.org/cidr/patientrecord#")), cons(makeString("rdf"), makeString("http://www/w3.org/2000/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www/w3.org/2000/01/rdf-schema#")), cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"))));

    private static final SubLSymbol TEST_CSQL_TO_SPARQL = makeSymbol("TEST-CSQL-TO-SPARQL");

    private static final SubLList $list115 = list(list(list(list(makeKeyword("SELECT"), list(list(makeKeyword("FIELD"), makeString("object"), makeString("default"))), list($FROM, list(list(makeKeyword("TABLE"), makeString("default")))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("predicate"), makeString("default")), makeString("rdf:type")), list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("subject"), makeString("default")), makeString("foo")))))), makeString("BASE <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#>\nPREFIX owl: <http://www/w3.org/2000/07/owl#>\nPREFIX ptrec: <http://clevelandclinicfoundation.org/cidr/patientrecord#>\nPREFIX rdf: <http://www/w3.org/2000/02/22-rdf-syntax-ns#>\nPREFIX rdfs: <http://www/w3.org/2000/01/rdf-schema#>\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\nSELECT ?obj\nWHERE {\n  \"foo\" rdf:type ?obj  .\n}\n")), list(list(list(makeKeyword("SELECT"), list(list(makeKeyword("FIELD"), makeString("object"), makeString("default"), NIL)), list($FROM, list(list(makeKeyword("TABLE"), makeString("default"), NIL))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("predicate"), makeString("default"), NIL), makeString("rdf:type")), list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("subject"), makeString("default"), NIL), makeString("foo")))))), makeString("BASE <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#>\nPREFIX owl: <http://www/w3.org/2000/07/owl#>\nPREFIX ptrec: <http://clevelandclinicfoundation.org/cidr/patientrecord#>\nPREFIX rdf: <http://www/w3.org/2000/02/22-rdf-syntax-ns#>\nPREFIX rdfs: <http://www/w3.org/2000/01/rdf-schema#>\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\nSELECT ?obj\nWHERE {\n  \"foo\" rdf:type ?obj  .\n}\n")));

    public static final SubLObject csql_to_sparql_alt(SubLObject csql, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sparql = NIL;
                SubLObject message_var = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if ($SELECT != csql.first()) {
                                        Errors.error($str_alt2$malformed_csql_expression__a__exp, csql);
                                    }
                                }
                                {
                                    SubLObject header_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_compute_header(access_path);
                                    SubLObject select_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql_select(csql, access_path);
                                    if (header_string.isString() && select_string.isString()) {
                                        sparql = cconcatenate(header_string, select_string);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (message_var.isString()) {
                    Errors.warn($str_alt3$_A, message_var);
                }
                return sparql;
            }
        }
    }

    public static SubLObject csql_to_sparql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sparql = NIL;
        SubLObject message_var = NIL;
        final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
        eval($list1);
        try {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SELECT != csql.first())) {
                            Errors.error($str4$malformed_csql_expression__a__exp, csql);
                        }
                        final SubLObject header_string = sparql_compute_header(access_path);
                        final SubLObject select_string = csql_to_sparql_select(csql, access_path);
                        if (header_string.isString() && select_string.isString()) {
                            sparql = cconcatenate(header_string, select_string);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str6$_A, message_var);
        }
        return sparql;
    }

    public static final SubLObject sparql_compute_header_alt(SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject header_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject base_uri = sksi_access_path.access_path_rdf_base(access_path);
                        if (NIL != base_uri) {
                            princ($str_alt4$BASE_, stream);
                            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_uri_tag(base_uri, stream);
                            terpri(stream);
                        }
                    }
                    {
                        SubLObject prefix_map = sksi_access_path.access_path_rdf_prefix_map(access_path);
                        SubLObject cdolist_list_var = prefix_map;
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject prefix = NIL;
                                SubLObject prefix_uri = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt5);
                                prefix = current.first();
                                current = current.rest();
                                prefix_uri = current;
                                format(stream, $str_alt6$PREFIX__A__, prefix);
                                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_uri_tag(prefix_uri, stream);
                                terpri(stream);
                            }
                        }
                    }
                    if (NIL != $sparql_oracle_backendP$.getDynamicValue(thread)) {
                        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.write_sparql_oracle_sem_prefix_header(stream);
                    }
                    header_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return header_string;
            }
        }
    }

    public static SubLObject sparql_compute_header(final SubLObject access_path) {
        SubLObject header_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject base_uri = sksi_access_path.access_path_rdf_base(access_path);
            if (NIL != base_uri) {
                princ($$$BASE_, stream);
                sparql_write_uri_tag(base_uri, stream);
                terpri(stream);
            }
            SubLObject cdolist_list_var;
            final SubLObject prefix_map = cdolist_list_var = sksi_access_path.access_path_rdf_prefix_map(access_path);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject prefix = NIL;
                SubLObject prefix_uri = NIL;
                destructuring_bind_must_consp(current, datum, $list8);
                prefix = current.first();
                current = prefix_uri = current.rest();
                sparql_write_prefix_uri_pair(prefix, prefix_uri, stream);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            header_string = get_output_stream_string(stream);
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
        return header_string;
    }

    public static SubLObject sparql_write_prefix_uri_pair(final SubLObject prefix, final SubLObject prefix_uri, final SubLObject stream) {
        format(stream, $str9$PREFIX__A__, prefix);
        sparql_write_uri_tag(prefix_uri, stream);
        terpri(stream);
        return NIL;
    }

    public static final SubLObject sparql_write_uri_tag_alt(SubLObject uri, SubLObject stream) {
        SubLTrampolineFile.checkType(uri, STRINGP);
        write_char(CHAR_less, stream);
        princ(uri, stream);
        write_char(CHAR_greater, stream);
        return NIL;
    }

    public static SubLObject sparql_write_uri_tag(final SubLObject uri, final SubLObject stream) {
        assert NIL != stringp(uri) : "! stringp(uri) " + ("Types.stringp(uri) " + "CommonSymbols.NIL != Types.stringp(uri) ") + uri;
        write_char(CHAR_less, stream);
        princ(uri, stream);
        write_char(CHAR_greater, stream);
        return NIL;
    }

    public static final SubLObject csql_to_sparql_select_alt(SubLObject csql, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject select_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject datum = csql;
                        SubLObject current = datum;
                        SubLObject select_keyword = NIL;
                        SubLObject fields = NIL;
                        SubLObject from = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt15);
                        select_keyword = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt15);
                        fields = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt15);
                        from = current.first();
                        current = current.rest();
                        {
                            SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt15);
                            current = current.rest();
                            {
                                SubLObject limit = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt15);
                                current = current.rest();
                                {
                                    SubLObject offset = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt15);
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if ($SELECT != select_keyword) {
                                                Errors.error($str_alt2$malformed_csql_expression__a__exp, csql);
                                            }
                                        }
                                        {
                                            SubLObject fields_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql_fields(fields);
                                            SubLObject where_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql_where(where, access_path);
                                            SubLObject limit_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql_limit(limit, access_path);
                                            SubLObject offset_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql_offset(offset, access_path);
                                            princ($$$SELECT, stream);
                                            princ(fields_string, stream);
                                            terpri(stream);
                                            princ($$$WHERE, stream);
                                            princ($str_alt18$_, stream);
                                            princ($str_alt19$_, stream);
                                            terpri(stream);
                                            if (NIL != $sksi_sparql_ist_graph_variable$.getDynamicValue(thread)) {
                                                princ($str_alt20$GRAPH__CONTEXT, stream);
                                                princ($str_alt21$___, stream);
                                                terpri(stream);
                                            }
                                            princ(where_string, stream);
                                            if (NIL != $sksi_sparql_ist_graph_variable$.getDynamicValue(thread)) {
                                                princ($str_alt22$_, stream);
                                            }
                                            princ($str_alt22$_, stream);
                                            if (NIL != $sparql_limit_override$.getDynamicValue(thread)) {
                                                limit_string = princ_to_string($sparql_limit_override$.getDynamicValue(thread));
                                            }
                                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_boolean_select_fields_p(fields)) {
                                                limit_string = $$$1;
                                            }
                                            if (NIL != limit_string) {
                                                terpri(stream);
                                                princ($$$LIMIT, stream);
                                                princ($str_alt18$_, stream);
                                                princ(limit_string, stream);
                                            }
                                            if (NIL != $sparql_offset_override$.getDynamicValue(thread)) {
                                                offset_string = princ_to_string($sparql_offset_override$.getDynamicValue(thread));
                                            }
                                            if (NIL != offset_string) {
                                                terpri(stream);
                                                princ($$$OFFSET, stream);
                                                princ($str_alt18$_, stream);
                                                princ(offset_string, stream);
                                            }
                                            terpri(stream);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt15);
                                    }
                                }
                            }
                        }
                    }
                    select_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return select_string;
            }
        }
    }

    public static SubLObject csql_to_sparql_select(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject select_keyword = NIL;
            SubLObject fields = NIL;
            SubLObject from = NIL;
            destructuring_bind_must_consp(csql, csql, $list11);
            select_keyword = csql.first();
            SubLObject current = csql.rest();
            destructuring_bind_must_consp(current, csql, $list11);
            fields = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, csql, $list11);
            from = current.first();
            current = current.rest();
            final SubLObject where = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list11);
            current = current.rest();
            final SubLObject limit = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list11);
            current = current.rest();
            final SubLObject offset = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list11);
            current = current.rest();
            if (NIL == current) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SELECT != select_keyword)) {
                    Errors.error($str4$malformed_csql_expression__a__exp, csql);
                }
                if (NIL != csql_boolean_select_fields_p(fields)) {
                    princ($$$ASK, stream);
                    princ($$$_, stream);
                } else {
                    final SubLObject fields_string = csql_to_sparql_fields(fields);
                    princ($$$SELECT, stream);
                    princ(fields_string, stream);
                    terpri(stream);
                    princ($$$WHERE, stream);
                    princ($$$_, stream);
                }
                final SubLObject where_string = csql_to_sparql_where(where, access_path);
                princ($str16$_, stream);
                terpri(stream);
                if (NIL != $sksi_sparql_ist_graph_variable$.getDynamicValue(thread)) {
                    princ($str17$GRAPH__CONTEXT, stream);
                    princ($str18$___, stream);
                    terpri(stream);
                }
                princ(where_string, stream);
                if (NIL != $sksi_sparql_ist_graph_variable$.getDynamicValue(thread)) {
                    princ($str19$_, stream);
                }
                princ($str19$_, stream);
                SubLObject limit_string = csql_to_sparql_limit(limit, access_path);
                if (NIL != $sparql_limit_override$.getDynamicValue(thread)) {
                    limit_string = princ_to_string($sparql_limit_override$.getDynamicValue(thread));
                }
                if (NIL != limit_string) {
                    terpri(stream);
                    princ($$$LIMIT, stream);
                    princ($$$_, stream);
                    princ(limit_string, stream);
                }
                SubLObject offset_string = csql_to_sparql_offset(offset, access_path);
                if (NIL != $sparql_offset_override$.getDynamicValue(thread)) {
                    offset_string = princ_to_string($sparql_offset_override$.getDynamicValue(thread));
                }
                if (NIL != offset_string) {
                    terpri(stream);
                    princ($$$OFFSET, stream);
                    princ($$$_, stream);
                    princ(offset_string, stream);
                }
                terpri(stream);
            } else {
                cdestructuring_bind_error(csql, $list11);
            }
            select_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return select_string;
    }

    public static final SubLObject csql_to_sparql_fields_alt(SubLObject fields) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fields_string = NIL;
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_boolean_select_fields_p(fields)) {
                    fields_string = $str_alt26$__;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_variables_fields_p(fields)) {
                        {
                            SubLObject datum = fields;
                            SubLObject current = datum;
                            SubLObject variables_keyword = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt27);
                            variables_keyword = current.first();
                            current = current.rest();
                            {
                                SubLObject v_variables = current;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if ($VARIABLES != variables_keyword) {
                                        Errors.error($str_alt29$malformed_csql_expression__a__exp, fields);
                                    }
                                }
                                if (NIL == v_variables) {
                                    fields_string = $str_alt26$__;
                                } else {
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject cdolist_list_var = v_variables;
                                                SubLObject variable = NIL;
                                                for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                                                    format(stream, $str_alt30$__A, variable);
                                                }
                                            }
                                            fields_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject cdolist_list_var = fields;
                                    SubLObject field = NIL;
                                    for (field = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field = cdolist_list_var.first()) {
                                        {
                                            SubLObject variable_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_field_variable_name(field);
                                            format(stream, $str_alt30$__A, variable_name);
                                        }
                                    }
                                }
                                fields_string = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return fields_string;
            }
        }
    }

    public static SubLObject csql_to_sparql_fields(final SubLObject fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fields_string = NIL;
        if (NIL != csql_boolean_select_fields_p(fields)) {
            fields_string = $str22$__;
        } else
            if (NIL != csql_variables_fields_p(fields)) {
                SubLObject variables_keyword = NIL;
                destructuring_bind_must_consp(fields, fields, $list23);
                variables_keyword = fields.first();
                final SubLObject v_variables;
                final SubLObject current = v_variables = fields.rest();
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($VARIABLES != variables_keyword)) {
                    Errors.error($str25$malformed_csql_expression__a__exp, fields);
                }
                if (NIL == v_variables) {
                    fields_string = $str22$__;
                } else {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        SubLObject cdolist_list_var = v_variables;
                        SubLObject variable = NIL;
                        variable = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            format(stream, $str26$__A, variable);
                            cdolist_list_var = cdolist_list_var.rest();
                            variable = cdolist_list_var.first();
                        } 
                        fields_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            } else {
                SubLObject stream2 = NIL;
                try {
                    stream2 = make_private_string_output_stream();
                    SubLObject cdolist_list_var2 = fields;
                    SubLObject field = NIL;
                    field = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject variable_name = sparql_field_variable_name(field);
                        format(stream2, $str26$__A, variable_name);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        field = cdolist_list_var2.first();
                    } 
                    fields_string = get_output_stream_string(stream2);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        close(stream2, UNPROVIDED);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            }

        return fields_string;
    }

    public static final SubLObject csql_boolean_select_fields_p_alt(SubLObject fields) {
        return makeBoolean((NIL == fields) || fields.equal($list_alt31));
    }

    public static SubLObject csql_boolean_select_fields_p(final SubLObject fields) {
        return makeBoolean((NIL == fields) || fields.equal($list27));
    }

    public static final SubLObject csql_variables_fields_p_alt(SubLObject fields) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(fields)) && ($VARIABLES == fields.first())) && (NIL != list_utilities.every_in_list(EL_VARIABLE_P, fields.rest(), UNPROVIDED)));
    }

    public static SubLObject csql_variables_fields_p(final SubLObject fields) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(fields)) && ($VARIABLES == fields.first())) && (NIL != list_utilities.every_in_list(EL_VARIABLE_P, fields.rest(), UNPROVIDED)));
    }

    public static final SubLObject sparql_field_variable_name_alt(SubLObject field) {
        {
            SubLObject field_name = second(field);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_field_name_to_variable_name(field_name);
        }
    }

    public static SubLObject sparql_field_variable_name(final SubLObject field) {
        final SubLObject field_name = second(field);
        return sparql_field_name_to_variable_name(field_name);
    }

    public static final SubLObject sparql_field_name_to_variable_name_alt(SubLObject field_name) {
        if (field_name.equal($$$subject)) {
            return $str_alt34$_subj;
        } else {
            if (field_name.equal($$$predicate)) {
                return $str_alt36$_pred;
            } else {
                if (field_name.equal($$$object)) {
                    return $str_alt38$_obj;
                } else {
                    return Errors.error($str_alt39$Unsupported_SPARQL_field_name__S, field_name);
                }
            }
        }
    }

    public static SubLObject sparql_field_name_to_variable_name(final SubLObject field_name) {
        if (field_name.equal($$$subject)) {
            return $str30$_subj;
        }
        if (field_name.equal($$$predicate)) {
            return $str32$_pred;
        }
        if (field_name.equal($$$object)) {
            return $str34$_obj;
        }
        return Errors.error($str35$Unsupported_SPARQL_field_name__S, field_name);
    }

    public static final SubLObject csql_to_sparql_where_alt(SubLObject where, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject where_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject datum = where;
                        SubLObject current = datum;
                        SubLObject where_keyword = NIL;
                        SubLObject where_expressions = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt40);
                        where_keyword = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt40);
                        where_expressions = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if ($WHERE != where_keyword) {
                                    Errors.error($str_alt42$malformed_csql_expression__a__exp, where);
                                }
                            }
                            where_expressions = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_normalize_where_expressions_for_sparql(where_expressions);
                            if (NIL != $sksi_sparql_maximize_literal_conjunctionP$.getDynamicValue(thread)) {
                                where_expressions = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_maximize_literal_conjunction(where_expressions);
                            }
                            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_literal_where_espressions_p(where_expressions)) {
                                if (NIL != $sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread)) {
                                    format(stream, $str_alt43$GRAPH__G____);
                                }
                                {
                                    SubLObject where_expression = where_expressions.first();
                                    SubLObject where_expression_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_string(where_expression, access_path);
                                    princ(where_expression_string, stream);
                                    if ($sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread) == $FIRST_REST) {
                                        format(stream, $str_alt45$___);
                                    }
                                }
                                if ($sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread) == $FIRST_REST) {
                                    format(stream, $str_alt43$GRAPH__G____);
                                }
                                {
                                    SubLObject cdolist_list_var = where_expressions.rest();
                                    SubLObject where_expression = NIL;
                                    for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                                        {
                                            SubLObject where_expression_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_string(where_expression, access_path);
                                            princ(where_expression_string, stream);
                                        }
                                    }
                                }
                                if (NIL != $sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread)) {
                                    format(stream, $str_alt45$___);
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject subject_constraints = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_categorize_where_expressions(where_expressions);
                                    SubLObject predicate_constraints = thread.secondMultipleValue();
                                    SubLObject object_constraints = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    princ($str_alt46$__, stream);
                                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraints($$$subject, subject_constraints, access_path, stream);
                                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraints($$$predicate, predicate_constraints, access_path, stream);
                                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraints($$$object, object_constraints, access_path, stream);
                                    princ($str_alt47$__, stream);
                                    terpri(stream);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt40);
                        }
                    }
                    where_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return where_string;
            }
        }
    }

    public static SubLObject csql_to_sparql_where(final SubLObject where, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject where_keyword = NIL;
            SubLObject where_expressions = NIL;
            destructuring_bind_must_consp(where, where, $list36);
            where_keyword = where.first();
            SubLObject current = where.rest();
            destructuring_bind_must_consp(current, where, $list36);
            where_expressions = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($WHERE != where_keyword)) {
                    Errors.error($str38$malformed_csql_expression__a__exp, where);
                }
                where_expressions = csql_normalize_where_expressions_for_sparql(where_expressions);
                if (NIL != $sksi_sparql_maximize_literal_conjunctionP$.getDynamicValue(thread)) {
                    where_expressions = sparql_maximize_literal_conjunction(where_expressions);
                }
                if (NIL != csql_literal_where_espressions_p(where_expressions)) {
                    if (NIL != $sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread)) {
                        format(stream, $str39$GRAPH__G____);
                    }
                    final SubLObject where_expression = where_expressions.first();
                    final SubLObject where_expression_string = sparql_literal_where_expression_string(where_expression, access_path);
                    princ(where_expression_string, stream);
                    if ($sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread) == $FIRST_REST) {
                        format(stream, $str41$___);
                    }
                    if ($sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread) == $FIRST_REST) {
                        format(stream, $str39$GRAPH__G____);
                    }
                    SubLObject cdolist_list_var = where_expressions.rest();
                    SubLObject where_expression2 = NIL;
                    where_expression2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject where_expression_string2 = sparql_literal_where_expression_string(where_expression2, access_path);
                        princ(where_expression_string2, stream);
                        cdolist_list_var = cdolist_list_var.rest();
                        where_expression2 = cdolist_list_var.first();
                    } 
                    if (NIL != $sksi_sparql_graph_optimization_enabledP$.getDynamicValue(thread)) {
                        format(stream, $str41$___);
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject subject_constraints = sparql_categorize_where_expressions(where_expressions);
                    final SubLObject predicate_constraints = thread.secondMultipleValue();
                    final SubLObject object_constraints = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    princ($$$__, stream);
                    sparql_write_constraints($$$subject, subject_constraints, access_path, stream);
                    sparql_write_constraints($$$predicate, predicate_constraints, access_path, stream);
                    sparql_write_constraints($$$object, object_constraints, access_path, stream);
                    princ($str43$__, stream);
                    terpri(stream);
                }
            } else {
                cdestructuring_bind_error(where, $list36);
            }
            where_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return where_string;
    }

    public static final SubLObject csql_normalize_where_expressions_for_sparql_alt(SubLObject where_expressions) {
        {
            SubLObject csql_different_equality_map = dictionary.new_dictionary(symbol_function(EQUAL), length(where_expressions));
            SubLObject new_where_expressions = NIL;
            SubLObject cdolist_list_var = where_expressions;
            SubLObject where_expression = NIL;
            for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                if (where_expression.first() == $$CSQLDifferent) {
                    {
                        SubLObject arg1 = second(where_expression);
                        SubLObject arg2 = third(where_expression);
                        if (!arg1.equal(dictionary.dictionary_lookup(csql_different_equality_map, arg2, UNPROVIDED))) {
                            new_where_expressions = cons(where_expression, new_where_expressions);
                            dictionary.dictionary_enter(csql_different_equality_map, arg1, arg2);
                        }
                    }
                } else {
                    new_where_expressions = cons(where_expression, new_where_expressions);
                }
            }
            return nreverse(new_where_expressions);
        }
    }

    public static SubLObject csql_normalize_where_expressions_for_sparql(final SubLObject where_expressions) {
        final SubLObject csql_different_equality_map = dictionary.new_dictionary(symbol_function(EQUAL), length(where_expressions));
        SubLObject new_where_expressions = NIL;
        SubLObject cdolist_list_var = where_expressions;
        SubLObject where_expression = NIL;
        where_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (where_expression.first().eql($$CSQLDifferent)) {
                final SubLObject arg1 = second(where_expression);
                final SubLObject arg2 = third(where_expression);
                if (!arg1.equal(dictionary.dictionary_lookup(csql_different_equality_map, arg2, UNPROVIDED))) {
                    new_where_expressions = cons(where_expression, new_where_expressions);
                    dictionary.dictionary_enter(csql_different_equality_map, arg1, arg2);
                }
            } else {
                new_where_expressions = cons(where_expression, new_where_expressions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        } 
        return nreverse(new_where_expressions);
    }

    public static final SubLObject sparql_maximize_literal_conjunction_alt(SubLObject where_expressions) {
        return list_utilities.stable_sort_via_test(copy_list(where_expressions), CSQL_LITERAL_WHERE_EXPRESSION_P, UNPROVIDED);
    }

    public static SubLObject sparql_maximize_literal_conjunction(final SubLObject where_expressions) {
        return list_utilities.stable_sort_via_test(copy_list(where_expressions), CSQL_LITERAL_WHERE_EXPRESSION_P, UNPROVIDED);
    }

    public static final SubLObject csql_literal_where_espressions_p_alt(SubLObject where_expressions) {
        return list_utilities.simple_tree_findP($LITERAL, where_expressions);
    }

    public static SubLObject csql_literal_where_espressions_p(final SubLObject where_expressions) {
        return list_utilities.simple_tree_findP($LITERAL, where_expressions);
    }

    public static final SubLObject csql_sparql_supported_where_expression_p_alt(SubLObject where_expression) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_literal_where_expression_p(where_expression)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_sparql_filter_where_expression_p(where_expression))) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_sparql_unknown_sentence_where_expression_p(where_expression)));
    }

    public static SubLObject csql_sparql_supported_where_expression_p(final SubLObject where_expression) {
        return makeBoolean(((NIL != csql_literal_where_expression_p(where_expression)) || (NIL != csql_sparql_filter_where_expression_p(where_expression))) || (NIL != csql_sparql_unknown_sentence_where_expression_p(where_expression)));
    }

    public static final SubLObject csql_literal_where_expression_p_alt(SubLObject where_expression) {
        if ((NIL != list_utilities.proper_list_p(where_expression)) && (NIL != list_utilities.lengthE(where_expression, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject datum = where_expression;
                SubLObject current = datum;
                SubLObject literal_keyword = NIL;
                SubLObject literal = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt51);
                literal_keyword = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt51);
                literal = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((((((literal_keyword == $LITERAL) && (NIL != list_utilities.proper_list_p(literal))) && (NIL != list_utilities.lengthE(literal, THREE_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_literal_where_expression_resolved_field_p(literal.first()))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_literal_where_expression_resolved_field_p(second(literal)))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_literal_where_expression_resolved_field_p(third(literal)))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt51);
                }
            }
        }
        return NIL;
    }

    public static SubLObject csql_literal_where_expression_p(final SubLObject where_expression) {
        if ((NIL != list_utilities.proper_list_p(where_expression)) && (NIL != list_utilities.lengthE(where_expression, TWO_INTEGER, UNPROVIDED))) {
            SubLObject literal_keyword = NIL;
            SubLObject literal = NIL;
            destructuring_bind_must_consp(where_expression, where_expression, $list47);
            literal_keyword = where_expression.first();
            SubLObject current = where_expression.rest();
            destructuring_bind_must_consp(current, where_expression, $list47);
            literal = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((((((literal_keyword == $LITERAL) && (NIL != list_utilities.proper_list_p(literal))) && (NIL != list_utilities.lengthE(literal, THREE_INTEGER, UNPROVIDED))) && (NIL != csql_literal_where_expression_resolved_field_p(literal.first()))) && (NIL != csql_literal_where_expression_resolved_field_p(second(literal)))) && (NIL != csql_literal_where_expression_resolved_field_p(third(literal)))) {
                    return T;
                }
            } else {
                cdestructuring_bind_error(where_expression, $list47);
            }
        }
        return NIL;
    }

    public static final SubLObject csql_literal_where_expression_resolved_field_p_alt(SubLObject literal_expression_field) {
        return makeBoolean(!(literal_expression_field.isList() && ($FIELD == literal_expression_field.first())));
    }

    public static SubLObject csql_literal_where_expression_resolved_field_p(final SubLObject literal_expression_field) {
        return makeBoolean((!literal_expression_field.isList()) || ($FIELD != literal_expression_field.first()));
    }

    public static final SubLObject csql_sparql_unknown_sentence_where_expression_p_alt(SubLObject where_expression) {
        {
            SubLObject datum = where_expression;
            SubLObject current = datum;
            SubLObject expression_keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            expression_keyword = current.first();
            current = current.rest();
            {
                SubLObject rest = current;
                if (expression_keyword == $UNKNOWN_SENTENCE) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject csql_sparql_unknown_sentence_where_expression_p(final SubLObject where_expression) {
        SubLObject expression_keyword = NIL;
        destructuring_bind_must_consp(where_expression, where_expression, $list49);
        expression_keyword = where_expression.first();
        final SubLObject rest;
        final SubLObject current = rest = where_expression.rest();
        if (expression_keyword == $UNKNOWN_SENTENCE) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject csql_sparql_filter_where_expression_p_alt(SubLObject where_expression) {
        {
            SubLObject datum = where_expression;
            SubLObject current = datum;
            SubLObject expression_keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            expression_keyword = current.first();
            current = current.rest();
            {
                SubLObject rest = current;
                if (NIL != forts.fort_p(expression_keyword)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject csql_sparql_filter_where_expression_p(final SubLObject where_expression) {
        SubLObject expression_keyword = NIL;
        destructuring_bind_must_consp(where_expression, where_expression, $list49);
        expression_keyword = where_expression.first();
        final SubLObject rest;
        final SubLObject current = rest = where_expression.rest();
        if (NIL != forts.fort_p(expression_keyword)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject sparql_literal_where_expression_string_alt(SubLObject where_expression, SubLObject access_path) {
        {
            SubLObject where_expression_string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_sparql_filter_where_expression_p(where_expression)) {
                    {
                        SubLObject datum = where_expression;
                        SubLObject current = datum;
                        SubLObject csql_operator = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt55);
                        csql_operator = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt55);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt55);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject operator_string = sksi_kb_accessors.csql_operator_to_sql_operator(csql_operator, $$Sparql_P_TheProgram);
                                if (!operator_string.isString()) {
                                    Errors.error($str_alt57$CSQL_operator__A_missing___csqlOp, csql_operator);
                                } else {
                                    format(stream, $str_alt58$__FILTER__);
                                    if (csql_operator == $$CSQLEqualsAny) {
                                        {
                                            SubLObject arg2_set_items = el_set_items(arg2);
                                            SubLObject arg2_set_size = length(arg2_set_items);
                                            SubLObject datatype = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_datatype(csql_operator, arg2_set_items);
                                            SubLObject list_var = NIL;
                                            SubLObject arg2_elem = NIL;
                                            SubLObject item_index = NIL;
                                            for (list_var = arg2_set_items, arg2_elem = list_var.first(), item_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg2_elem = list_var.first() , item_index = add(ONE_INTEGER, item_index)) {
                                                format(stream, $str_alt60$_A_, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_arg_string(arg1, access_path, datatype));
                                                princ(operator_string, stream);
                                                format(stream, $str_alt30$__A, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_arg_string(arg2_elem, access_path, datatype));
                                                if (item_index.numL(subtract(arg2_set_size, ONE_INTEGER))) {
                                                    format(stream, $str_alt61$____);
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL != el_set_p(arg2)) {
                                            Errors.error($str_alt62$Set_arguments_only_supported_for_);
                                        } else {
                                            {
                                                SubLObject datatype = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_datatype(csql_operator, list(arg1, arg2));
                                                format(stream, $str_alt60$_A_, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_arg_string(arg1, access_path, datatype));
                                                princ(operator_string, stream);
                                                format(stream, $str_alt30$__A, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_where_expression_arg_string(arg2, access_path, datatype));
                                            }
                                        }
                                    }
                                    format(stream, $str_alt63$_);
                                    terpri(stream);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt55);
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_sparql_unknown_sentence_where_expression_p(where_expression)) {
                        {
                            SubLObject datum = where_expression;
                            SubLObject current = datum;
                            SubLObject unknown_sentence_keyword = NIL;
                            SubLObject existential_vars_list = NIL;
                            SubLObject sub_where = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt64);
                            unknown_sentence_keyword = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt64);
                            existential_vars_list = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt64);
                            sub_where = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject datum_1 = existential_vars_list;
                                    SubLObject current_2 = datum_1;
                                    SubLObject existential_vars_keyword = NIL;
                                    SubLObject existential_vars = NIL;
                                    destructuring_bind_must_consp(current_2, datum_1, $list_alt65);
                                    existential_vars_keyword = current_2.first();
                                    current_2 = current_2.rest();
                                    existential_vars = current_2;
                                    existential_vars = list_utilities.fast_delete_duplicates(existential_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject sub_where_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql_where(sub_where, access_path);
                                        format(stream, $str_alt66$OPTIONAL____);
                                        princ(sub_where_string, stream);
                                        format(stream, $str_alt45$___);
                                        format(stream, $str_alt67$FILTER__);
                                        {
                                            SubLObject existential_vars_count = length(existential_vars);
                                            SubLObject list_var = NIL;
                                            SubLObject existential_var = NIL;
                                            SubLObject num_var = NIL;
                                            for (list_var = existential_vars, existential_var = list_var.first(), num_var = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , existential_var = list_var.first() , num_var = add(ONE_INTEGER, num_var)) {
                                                format(stream, $str_alt68$__bound__A__, existential_var);
                                                if (num_var.numL(subtract(existential_vars_count, ONE_INTEGER))) {
                                                    princ($str_alt69$___, stream);
                                                }
                                            }
                                        }
                                        format(stream, $str_alt70$___);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt64);
                            }
                        }
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_literal_where_expression_p(where_expression)) {
                            {
                                SubLObject datum = where_expression;
                                SubLObject current = datum;
                                SubLObject literal_keyword = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt71);
                                literal_keyword = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt71);
                                {
                                    SubLObject temp = current.rest();
                                    current = current.first();
                                    {
                                        SubLObject predicate = NIL;
                                        SubLObject subject = NIL;
                                        SubLObject v_object = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt71);
                                        predicate = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt71);
                                        subject = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt71);
                                        v_object = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            current = temp;
                                            if (NIL == current) {
                                                princ($str_alt46$__, stream);
                                                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraint(subject, access_path, stream);
                                                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraint(predicate, access_path, stream);
                                                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraint(v_object, access_path, stream);
                                                princ($str_alt72$_, stream);
                                                terpri(stream);
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt71);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt71);
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt73$Unexpected_where_clause____S, where_expression);
                        }
                    }
                }
                where_expression_string = get_output_stream_string(stream);
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
            return where_expression_string;
        }
    }

    public static SubLObject sparql_literal_where_expression_string(final SubLObject where_expression, final SubLObject access_path) {
        SubLObject where_expression_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            if (NIL != csql_sparql_filter_where_expression_p(where_expression)) {
                output_sparql_literal_where_expression_from_csql_filter_where_expression(where_expression, stream, access_path);
            } else
                if (NIL != csql_sparql_unknown_sentence_where_expression_p(where_expression)) {
                    output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression(where_expression, stream, access_path);
                } else
                    if (NIL != csql_literal_where_expression_p(where_expression)) {
                        output_sparql_literal_where_expression_from_csql_literal_where_expression(where_expression, stream, access_path);
                    } else {
                        Errors.error($str51$Unexpected_where_clause____S, where_expression);
                    }


            where_expression_string = get_output_stream_string(stream);
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
        return where_expression_string;
    }

    public static SubLObject output_sparql_literal_where_expression_from_csql_filter_where_expression(final SubLObject where_expression, final SubLObject stream, final SubLObject access_path) {
        SubLObject csql_operator = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(where_expression, where_expression, $list52);
        csql_operator = where_expression.first();
        SubLObject current = where_expression.rest();
        destructuring_bind_must_consp(current, where_expression, $list52);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, where_expression, $list52);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject operator_string = sksi_kb_accessors.csql_operator_to_sql_operator(csql_operator, $$Sparql_P_TheProgram);
            if (!operator_string.isString()) {
                Errors.error($str54$CSQL_operator__A_missing___csqlOp, csql_operator);
            } else {
                format(stream, $str55$__FILTER__);
                if (csql_operator.eql($$CSQLEqualsAny)) {
                    final SubLObject arg2_set_items = el_set_items(arg2);
                    final SubLObject arg2_set_size = length(arg2_set_items);
                    final SubLObject datatype = sparql_literal_where_expression_datatype(csql_operator, arg2_set_items);
                    SubLObject list_var = NIL;
                    SubLObject arg2_elem = NIL;
                    SubLObject item_index = NIL;
                    list_var = arg2_set_items;
                    arg2_elem = list_var.first();
                    for (item_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg2_elem = list_var.first() , item_index = add(ONE_INTEGER, item_index)) {
                        format(stream, $str57$_A_, sparql_literal_where_expression_arg_string(arg1, access_path, datatype));
                        princ(operator_string, stream);
                        format(stream, $str26$__A, sparql_literal_where_expression_arg_string(arg2_elem, access_path, datatype));
                        if (item_index.numL(subtract(arg2_set_size, ONE_INTEGER))) {
                            format(stream, $str58$____);
                        }
                    }
                } else
                    if (NIL != el_set_p(arg2)) {
                        Errors.error($str59$Set_arguments_only_supported_for_);
                    } else {
                        final SubLObject datatype2 = sparql_literal_where_expression_datatype(csql_operator, list(arg1, arg2));
                        format(stream, $str57$_A_, sparql_literal_where_expression_arg_string(arg1, access_path, datatype2));
                        princ(operator_string, stream);
                        format(stream, $str26$__A, sparql_literal_where_expression_arg_string(arg2, access_path, datatype2));
                    }

                format(stream, $str60$_);
                terpri(stream);
            }
        } else {
            cdestructuring_bind_error(where_expression, $list52);
        }
        return stream;
    }

    public static SubLObject output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression(final SubLObject where_expression, final SubLObject stream, final SubLObject access_path) {
        SubLObject unknown_sentence_keyword = NIL;
        SubLObject existential_vars_list = NIL;
        SubLObject sub_where = NIL;
        destructuring_bind_must_consp(where_expression, where_expression, $list61);
        unknown_sentence_keyword = where_expression.first();
        SubLObject current = where_expression.rest();
        destructuring_bind_must_consp(current, where_expression, $list61);
        existential_vars_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, where_expression, $list61);
        sub_where = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = existential_vars_list;
            SubLObject existential_vars_keyword = NIL;
            SubLObject existential_vars = NIL;
            destructuring_bind_must_consp(current_$2, datum_$1, $list62);
            existential_vars_keyword = current_$2.first();
            current_$2 = existential_vars = current_$2.rest();
            existential_vars = list_utilities.fast_delete_duplicates(existential_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject sub_where_string = csql_to_sparql_where(sub_where, access_path);
            format(stream, $str63$OPTIONAL____);
            princ(sub_where_string, stream);
            format(stream, $str41$___);
            format(stream, $str64$FILTER__);
            final SubLObject existential_vars_count = length(existential_vars);
            SubLObject list_var = NIL;
            SubLObject existential_var = NIL;
            SubLObject num_var = NIL;
            list_var = existential_vars;
            existential_var = list_var.first();
            for (num_var = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , existential_var = list_var.first() , num_var = add(ONE_INTEGER, num_var)) {
                format(stream, $str65$__bound__A__, existential_var);
                if (num_var.numL(subtract(existential_vars_count, ONE_INTEGER))) {
                    princ($str66$___, stream);
                }
            }
            format(stream, $str67$___);
        } else {
            cdestructuring_bind_error(where_expression, $list61);
        }
        return stream;
    }

    public static SubLObject output_sparql_literal_where_expression_from_csql_literal_where_expression(final SubLObject where_expression, final SubLObject stream, final SubLObject access_path) {
        SubLObject literal_keyword = NIL;
        destructuring_bind_must_consp(where_expression, where_expression, $list68);
        literal_keyword = where_expression.first();
        SubLObject current = where_expression.rest();
        destructuring_bind_must_consp(current, where_expression, $list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject predicate = NIL;
        SubLObject subject = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, where_expression, $list68);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, where_expression, $list68);
        subject = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, where_expression, $list68);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            if (NIL == current) {
                output_sparql_literal_where_expression_from_spo(subject, predicate, v_object, stream, access_path, UNPROVIDED);
            } else {
                cdestructuring_bind_error(where_expression, $list68);
            }
        } else {
            cdestructuring_bind_error(where_expression, $list68);
        }
        return stream;
    }

    public static SubLObject output_sparql_literal_where_expression_from_spo(final SubLObject subject, final SubLObject predicate, final SubLObject v_object, final SubLObject stream, final SubLObject access_path, SubLObject nestedP) {
        if (nestedP == UNPROVIDED) {
            nestedP = NIL;
        }
        if (((NIL != list_utilities.tree_find_if(CSQL_DISJUNCTION_P, subject, UNPROVIDED)) || (NIL != list_utilities.tree_find_if(CSQL_DISJUNCTION_P, predicate, UNPROVIDED))) || (NIL != list_utilities.tree_find_if(CSQL_DISJUNCTION_P, v_object, UNPROVIDED))) {
            final SubLObject subjects = unpack_csql_disjunctions(subject);
            final SubLObject predicates = unpack_csql_disjunctions(predicate);
            final SubLObject objects = unpack_csql_disjunctions(v_object);
            final SubLObject combos = list_utilities.cartesian_product(list(subjects, predicates, objects), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            princ($str70$__, stream);
            SubLObject list_var = NIL;
            SubLObject combo = NIL;
            SubLObject n = NIL;
            list_var = combos;
            combo = list_var.first();
            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , combo = list_var.first() , n = add(ONE_INTEGER, n)) {
                if (n.numG(ZERO_INTEGER)) {
                    terpri(stream);
                    princ($$$___UNION, stream);
                }
                princ($str70$__, stream);
                SubLObject current;
                final SubLObject datum = current = combo;
                SubLObject one_subject = NIL;
                SubLObject one_predicate = NIL;
                SubLObject one_object = NIL;
                destructuring_bind_must_consp(current, datum, $list72);
                one_subject = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list72);
                one_predicate = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list72);
                one_object = current.first();
                current = current.rest();
                if (NIL == current) {
                    output_sparql_literal_where_expression_from_spo(one_subject, one_predicate, one_object, stream, access_path, T);
                } else {
                    cdestructuring_bind_error(datum, $list72);
                }
                princ($str73$___, stream);
            }
            princ($str73$___, stream);
        } else {
            princ($$$__, stream);
            sparql_write_constraint(subject, access_path, stream);
            sparql_write_constraint(predicate, access_path, stream);
            sparql_write_constraint(v_object, access_path, stream);
            if (NIL == nestedP) {
                princ($str74$_, stream);
            }
        }
        if (NIL == nestedP) {
            terpri(stream);
        }
        return stream;
    }

    public static SubLObject unpack_csql_disjunctions(final SubLObject v_term) {
        return NIL != sksi_csql_utilities.csql_disjunction_p(v_term) ? sksi_csql_utilities.csql_disjunction_disjuncts(v_term) : list(v_term);
    }

    /**
     * Return the datatype used for the variables in the literal so that more efficient SPARQL can be generated.
     */
    @LispMethod(comment = "Return the datatype used for the variables in the literal so that more efficient SPARQL can be generated.")
    public static final SubLObject sparql_literal_where_expression_datatype_alt(SubLObject csql_operator, SubLObject where_expression_args) {
        if (csql_operator == $$CSQLLaterThan) {
            return $DATE;
        } else {
            if (csql_operator == $$CSQLLaterThanOrCooriginatingWith) {
                return $DATE;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return the datatype used for the variables in the literal so that more efficient SPARQL can be generated.
     */
    @LispMethod(comment = "Return the datatype used for the variables in the literal so that more efficient SPARQL can be generated.")
    public static SubLObject sparql_literal_where_expression_datatype(final SubLObject csql_operator, final SubLObject where_expression_args) {
        if (csql_operator.eql($$CSQLLaterThan)) {
            return $DATE;
        }
        if (csql_operator.eql($$CSQLLaterThanOrCooriginatingWith)) {
            return $DATE;
        }
        return NIL;
    }

    public static final SubLObject sparql_literal_where_expression_arg_string_alt(SubLObject where_expression_arg, SubLObject access_path, SubLObject datatype) {
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        {
            SubLObject result = NIL;
            if (datatype == $DATE) {
                if (NIL != cycl_grammar.el_variable_p(where_expression_arg)) {
                    result = cconcatenate($str_alt77$STR_, new SubLObject[]{ format_nil.format_nil_a_no_copy(where_expression_arg), $str_alt63$_ });
                } else {
                    {
                        SubLObject stripped_date_string = string_utilities.get_substring_between_tags(where_expression_arg, $str_alt78$xsd_dateTime__, $str_alt79$__, UNPROVIDED, UNPROVIDED);
                        if (NIL != stripped_date_string) {
                            result = format_nil.format_nil_s(stripped_date_string);
                        } else {
                            result = format_nil.format_nil_s(where_expression_arg);
                        }
                    }
                }
            } else {
                if (where_expression_arg.isString() && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.possible_rdf_literal_string_p(where_expression_arg))) {
                    result = format_nil.format_nil_a(where_expression_arg);
                } else {
                    if (where_expression_arg.isString()) {
                        result = cconcatenate($str_alt80$xsd_string_, new SubLObject[]{ format_nil.format_nil_s_no_copy(where_expression_arg), $str_alt63$_ });
                    } else {
                        if (where_expression_arg.isInteger()) {
                            result = cconcatenate($str_alt81$xsd_float_, new SubLObject[]{ format_nil.format_nil_d_no_copy(where_expression_arg), $str_alt63$_ });
                        } else {
                            if (where_expression_arg.isNumber()) {
                                result = format(NIL, $str_alt82$xsd_float__F_, where_expression_arg);
                            } else {
                                if (NIL != cycl_grammar.el_variable_p(where_expression_arg)) {
                                    result = format_nil.format_nil_a(where_expression_arg);
                                } else {
                                    Errors.error($str_alt83$Unexpected_where_clause_argument_, where_expression_arg);
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject sparql_literal_where_expression_arg_string(final SubLObject where_expression_arg, final SubLObject access_path, SubLObject datatype) {
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (datatype == $DATE) {
            if (NIL != cycl_grammar.el_variable_p(where_expression_arg)) {
                if (NIL != $sksi_sparql_force_date_comparisons_as_stringsP$.getDynamicValue(thread)) {
                    result = cconcatenate($str78$STR_, new SubLObject[]{ format_nil.format_nil_a_no_copy(where_expression_arg), $str60$_ });
                } else {
                    result = cconcatenate($str79$xsd_dateTime_, new SubLObject[]{ format_nil.format_nil_a_no_copy(where_expression_arg), $str60$_ });
                }
            } else {
                final SubLObject stripped_date_string = string_utilities.get_substring_between_tags(where_expression_arg, $str80$xsd_dateTime__, $str81$__, UNPROVIDED, UNPROVIDED);
                if ((NIL != $sksi_sparql_force_date_comparisons_as_stringsP$.getDynamicValue(thread)) && (NIL != stripped_date_string)) {
                    result = format_nil.format_nil_s(stripped_date_string);
                } else {
                    result = format_nil.format_nil_a(where_expression_arg);
                }
            }
        } else
            if (NIL != sparql_identifier_p(where_expression_arg)) {
                result = sparql_possibly_expand_identifier_string(where_expression_arg, access_path);
            } else
                if (where_expression_arg.isString() && (NIL != possible_rdf_literal_string_p(where_expression_arg))) {
                    result = format_nil.format_nil_a(where_expression_arg);
                } else
                    if (where_expression_arg.isString()) {
                        result = cconcatenate($str82$xsd_string_, new SubLObject[]{ format_nil.format_nil_s_no_copy(where_expression_arg), $str60$_ });
                    } else
                        if (where_expression_arg.isInteger()) {
                            result = cconcatenate($str83$xsd_float_, new SubLObject[]{ format_nil.format_nil_d_no_copy(where_expression_arg), $str60$_ });
                        } else
                            if (where_expression_arg.isNumber()) {
                                result = format(NIL, $str84$xsd_float__F_, where_expression_arg);
                            } else
                                if (NIL != cycl_grammar.el_variable_p(where_expression_arg)) {
                                    result = format_nil.format_nil_a(where_expression_arg);
                                } else {
                                    Errors.error($str85$Unexpected_where_clause_argument_, where_expression_arg);
                                }






        return result;
    }

    public static final SubLObject possible_rdf_literal_string_p_alt(SubLObject string) {
        if (string.isString()) {
            {
                SubLObject colon_pos = position(CHAR_colon, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return makeBoolean((colon_pos.isInteger() && colon_pos.numG(ZERO_INTEGER)) && colon_pos.numL(subtract(length(string), ONE_INTEGER)));
            }
        }
        return NIL;
    }

    public static SubLObject possible_rdf_literal_string_p(final SubLObject string) {
        if (string.isString()) {
            final SubLObject colon_pos = position(CHAR_colon, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return makeBoolean((colon_pos.isInteger() && colon_pos.numG(ZERO_INTEGER)) && colon_pos.numL(subtract(length(string), ONE_INTEGER)));
        }
        return NIL;
    }

    public static final SubLObject sparql_categorize_where_expressions_alt(SubLObject where_expressions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subject_constraints = NIL;
                SubLObject predicate_constraints = NIL;
                SubLObject object_constraints = NIL;
                SubLObject cdolist_list_var = where_expressions;
                SubLObject where_expression = NIL;
                for (where_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , where_expression = cdolist_list_var.first()) {
                    if (NIL != csql_equal_clause_p(where_expression)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject field_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_categorize_equality_clause(where_expression);
                            SubLObject constraint = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (field_name.equal($$$subject)) {
                                subject_constraints = cons(constraint, subject_constraints);
                            } else {
                                if (field_name.equal($$$predicate)) {
                                    predicate_constraints = cons(constraint, predicate_constraints);
                                } else {
                                    if (field_name.equal($$$object)) {
                                        object_constraints = cons(constraint, object_constraints);
                                    } else {
                                        Errors.error($str_alt84$Unexpected_equality_clause____S, where_expression);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(nreverse(subject_constraints), nreverse(predicate_constraints), nreverse(object_constraints));
            }
        }
    }

    public static SubLObject sparql_categorize_where_expressions(final SubLObject where_expressions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subject_constraints = NIL;
        SubLObject predicate_constraints = NIL;
        SubLObject object_constraints = NIL;
        SubLObject cdolist_list_var = where_expressions;
        SubLObject where_expression = NIL;
        where_expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sksi_csql_utilities.csql_equal_clause_p(where_expression)) {
                thread.resetMultipleValues();
                final SubLObject field_name = sparql_categorize_equality_clause(where_expression);
                final SubLObject constraint = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (field_name.equal($$$subject)) {
                    subject_constraints = cons(constraint, subject_constraints);
                } else
                    if (field_name.equal($$$predicate)) {
                        predicate_constraints = cons(constraint, predicate_constraints);
                    } else
                        if (field_name.equal($$$object)) {
                            object_constraints = cons(constraint, object_constraints);
                        } else {
                            Errors.error($str86$Unexpected_equality_clause____S, where_expression);
                        }


            }
            cdolist_list_var = cdolist_list_var.rest();
            where_expression = cdolist_list_var.first();
        } 
        return values(nreverse(subject_constraints), nreverse(predicate_constraints), nreverse(object_constraints));
    }

    public static final SubLObject sparql_categorize_equality_clause_alt(SubLObject equality_clause) {
        {
            SubLObject datum = equality_clause;
            SubLObject current = datum;
            SubLObject equality = NIL;
            SubLObject expression1 = NIL;
            SubLObject expression2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            equality = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            expression1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt85);
            expression2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_field_p(expression1)) && (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_field_p(expression2))) {
                    {
                        SubLObject field_name = csql_field_name(expression1);
                        return values(field_name, expression2);
                    }
                } else {
                    return Errors.error($str_alt84$Unexpected_equality_clause____S, equality_clause);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt85);
            }
        }
        return NIL;
    }

    public static SubLObject sparql_categorize_equality_clause(final SubLObject equality_clause) {
        SubLObject equality = NIL;
        SubLObject expression1 = NIL;
        SubLObject expression2 = NIL;
        destructuring_bind_must_consp(equality_clause, equality_clause, $list87);
        equality = equality_clause.first();
        SubLObject current = equality_clause.rest();
        destructuring_bind_must_consp(current, equality_clause, $list87);
        expression1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, equality_clause, $list87);
        expression2 = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(equality_clause, $list87);
            return NIL;
        }
        if ((NIL != sksi_csql_utilities.csql_field_p(expression1)) && (NIL == sksi_csql_utilities.csql_field_p(expression2))) {
            final SubLObject field_name = sksi_csql_utilities.csql_field_name(expression1);
            return values(field_name, expression2);
        }
        return Errors.error($str86$Unexpected_equality_clause____S, equality_clause);
    }

    public static final SubLObject sparql_write_constraints_alt(SubLObject field_name, SubLObject constraints, SubLObject access_path, SubLObject stream) {
        if (NIL == constraints) {
            princ(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_field_name_to_variable_name(field_name), stream);
            write_string($str_alt18$_, stream, UNPROVIDED, UNPROVIDED);
        } else {
            if (NIL != list_utilities.singletonP(constraints)) {
                {
                    SubLObject constraint = constraints.first();
                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_write_constraint(constraint, access_path, stream);
                }
            } else {
                Errors.error($str_alt86$Time_to_support_multiple___A_cons, field_name, constraints);
            }
        }
        return NIL;
    }

    public static SubLObject sparql_write_constraints(final SubLObject field_name, final SubLObject constraints, final SubLObject access_path, final SubLObject stream) {
        if (NIL == constraints) {
            princ(sparql_field_name_to_variable_name(field_name), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != list_utilities.singletonP(constraints)) {
                final SubLObject constraint = constraints.first();
                sparql_write_constraint(constraint, access_path, stream);
            } else {
                Errors.error($str88$Time_to_support_multiple___A_cons, field_name, constraints);
            }

        return NIL;
    }

    public static final SubLObject sparql_write_constraint_alt(SubLObject constraint, SubLObject access_path, SubLObject stream) {
        {
            SubLObject constraint_string = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_field_p(constraint)) {
                {
                    SubLObject field = constraint;
                    SubLObject field_name = csql_field_name(field);
                    SubLObject variable_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_field_name_to_variable_name(field_name);
                    constraint_string = variable_name;
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_identifier_p(constraint)) {
                    constraint_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_possibly_expand_identifier_string(constraint, access_path);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_p(constraint)) {
                        constraint_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_literal_string(constraint);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_variable_p(constraint)) {
                            constraint_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_variable_string(constraint);
                        } else {
                            return Errors.error($str_alt87$Time_to_handle_constraint____S, constraint);
                        }
                    }
                }
            }
            format(stream, $str_alt60$_A_, constraint_string);
            return NIL;
        }
    }

    public static SubLObject sparql_write_constraint(final SubLObject constraint, final SubLObject access_path, final SubLObject stream) {
        SubLObject constraint_string = NIL;
        if (NIL != sksi_csql_utilities.csql_field_p(constraint)) {
            final SubLObject field_name = sksi_csql_utilities.csql_field_name(constraint);
            final SubLObject variable_name = constraint_string = sparql_field_name_to_variable_name(field_name);
        } else
            if (NIL != sparql_identifier_p(constraint)) {
                constraint_string = sparql_possibly_expand_identifier_string(constraint, access_path);
            } else
                if (NIL != sparql_literal_p(constraint)) {
                    constraint_string = sparql_literal_string(constraint);
                } else {
                    if (NIL == sparql_variable_p(constraint)) {
                        return Errors.error($str89$Time_to_handle_constraint____S, constraint);
                    }
                    constraint_string = sparql_variable_string(constraint);
                }


        format(stream, $str57$_A_, constraint_string);
        return NIL;
    }

    public static final SubLObject sparql_possibly_expand_identifier_string_alt(SubLObject string, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_identifier_p(string)) {
                return string;
            }
            if (NIL != $sparql_expand_identifier_stringsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_expanded_identifier_string(string, access_path);
            } else {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_identifier_string(string);
            }
        }
    }

    public static SubLObject sparql_possibly_expand_identifier_string(SubLObject string, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sparql_identifier_p(string)) {
            return string;
        }
        if (NIL != sparql_bnode_identifier_p(string)) {
            final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
            if (NIL != sksi_sks_interaction.sparql_oracle_subprotocolP(subprotocol)) {
                string = cconcatenate($str90$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(string), $str91$_ });
            }
            return string;
        }
        if (NIL != sparql_unescaped_identifier_string_p(string)) {
            return sparql_identifier_string(string);
        }
        if (NIL != $sparql_expand_identifier_stringsP$.getDynamicValue(thread)) {
            return sparql_expanded_identifier_string(string, access_path);
        }
        return sparql_identifier_string(string);
    }

    public static SubLObject sparql_unescaped_identifier_string_p(final SubLObject string) {
        return makeBoolean(string.isString() && (NIL == list_utilities.find_if_not(symbol_function(SPARQL_UNESCAPED_IDENTIFIER_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject sparql_unescaped_identifier_char_p(final SubLObject v_char) {
        return makeBoolean((NIL != alphanumericp(v_char)) || (NIL != list_utilities.member_eqP(v_char, $list93)));
    }

    public static final SubLObject csql_to_sparql_limit_alt(SubLObject limit, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != limit) {
                {
                    SubLObject datum = limit;
                    SubLObject current = datum;
                    SubLObject limit_keyword = NIL;
                    SubLObject limit_number = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    limit_keyword = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    limit_number = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if ($LIMIT != limit_keyword) {
                                Errors.error($str_alt90$malformed_csql_expression__a__exp, limit);
                            }
                        }
                        return princ_to_string(limit_number);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt88);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject csql_to_sparql_limit(final SubLObject limit, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != limit) {
            SubLObject limit_keyword = NIL;
            SubLObject limit_number = NIL;
            destructuring_bind_must_consp(limit, limit, $list94);
            limit_keyword = limit.first();
            SubLObject current = limit.rest();
            destructuring_bind_must_consp(current, limit, $list94);
            limit_number = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($LIMIT != limit_keyword)) {
                    Errors.error($str96$malformed_csql_expression__a__exp, limit);
                }
                return princ_to_string(limit_number);
            }
            cdestructuring_bind_error(limit, $list94);
        }
        return NIL;
    }

    public static final SubLObject csql_to_sparql_offset_alt(SubLObject offset, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != offset) {
                {
                    SubLObject datum = offset;
                    SubLObject current = datum;
                    SubLObject offset_keyword = NIL;
                    SubLObject offset_number = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt91);
                    offset_keyword = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt91);
                    offset_number = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if ($OFFSET != offset_keyword) {
                                Errors.error($str_alt93$malformed_csql_expression__a__exp, offset);
                            }
                        }
                        return princ_to_string(offset_number);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt91);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject csql_to_sparql_offset(final SubLObject offset, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != offset) {
            SubLObject offset_keyword = NIL;
            SubLObject offset_number = NIL;
            destructuring_bind_must_consp(offset, offset, $list97);
            offset_keyword = offset.first();
            SubLObject current = offset.rest();
            destructuring_bind_must_consp(current, offset, $list97);
            offset_number = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($OFFSET != offset_keyword)) {
                    Errors.error($str99$malformed_csql_expression__a__exp, offset);
                }
                return princ_to_string(offset_number);
            }
            cdestructuring_bind_error(offset, $list97);
        }
        return NIL;
    }

    public static final SubLObject sparql_identifier_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_bnode_identifier_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_abbreviated_uri_p(v_object))) || (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_expanded_uri_p(v_object)));
    }

    public static SubLObject sparql_identifier_p(final SubLObject v_object) {
        return makeBoolean(((NIL != sparql_bnode_identifier_p(v_object)) || (NIL != sparql_abbreviated_uri_p(v_object))) || (NIL != sparql_expanded_uri_p(v_object)));
    }

    public static final SubLObject sparql_bnode_identifier_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str_alt94$__))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_valid_uri_identifier_string_p(v_object, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject sparql_bnode_identifier_p(final SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str100$__))) && (NIL != sparql_valid_uri_identifier_string_p(v_object, TWO_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject sparql_abbreviated_uri_p_alt(SubLObject v_object) {
        if (v_object.isString()) {
            {
                SubLObject string = v_object;
                SubLObject prefix_end = position(CHAR_colon, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return makeBoolean(((prefix_end.isInteger() && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_valid_uri_prefix_string_p(string, ZERO_INTEGER, prefix_end))) && (NIL == string_utilities.starts_with(v_object, $str_alt94$__))) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_valid_uri_identifier_string_p(string, number_utilities.f_1X(prefix_end), UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static SubLObject sparql_abbreviated_uri_p(final SubLObject v_object) {
        if (v_object.isString()) {
            final SubLObject prefix_end = position(CHAR_colon, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return makeBoolean(((prefix_end.isInteger() && (NIL != sparql_valid_uri_prefix_string_p(v_object, ZERO_INTEGER, prefix_end))) && (NIL == string_utilities.starts_with(v_object, $str100$__))) && (NIL != sparql_valid_uri_identifier_string_p(v_object, number_utilities.f_1X(prefix_end), UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject sparql_expanded_uri_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str_alt95$_))) && (NIL != string_utilities.ends_with(v_object, $str_alt96$_, UNPROVIDED)));
    }

    public static SubLObject sparql_expanded_uri_p(final SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str90$_))) && (NIL != string_utilities.ends_with(v_object, $str91$_, UNPROVIDED)));
    }

    public static final SubLObject sparql_identifier_string_alt(SubLObject identifier) {
        SubLTrampolineFile.checkType(identifier, STRINGP);
        return identifier;
    }

    public static SubLObject sparql_identifier_string(final SubLObject identifier) {
        assert NIL != stringp(identifier) : "! stringp(identifier) " + ("Types.stringp(identifier) " + "CommonSymbols.NIL != Types.stringp(identifier) ") + identifier;
        return identifier;
    }

    public static final SubLObject sparql_expanded_identifier_string_alt(SubLObject identifier, SubLObject access_path) {
        SubLTrampolineFile.checkType(identifier, STRINGP);
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_abbreviated_uri_p(identifier)) {
            {
                SubLObject prefix_map = sksi_access_path.access_path_rdf_prefix_map(access_path);
                SubLObject prefix_end_pos = search($str_alt97$_, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != subl_promotions.positive_integer_p(prefix_end_pos)) {
                    {
                        SubLObject prefix = string_utilities.substring(identifier, ZERO_INTEGER, prefix_end_pos);
                        SubLObject suffix = string_utilities.substring(identifier, add(ONE_INTEGER, prefix_end_pos), UNPROVIDED);
                        SubLObject expanded_prefix = list_utilities.alist_lookup(prefix_map, prefix, $sym98$STRING_, UNPROVIDED);
                        if (!expanded_prefix.isString()) {
                            Errors.warn($str_alt99$Could_not_find_expanded_prefix_fo, prefix, prefix_map);
                            return identifier;
                        } else {
                            return cconcatenate($str_alt95$_, new SubLObject[]{ expanded_prefix, suffix, $str_alt96$_ });
                        }
                    }
                }
            }
        }
        return identifier;
    }

    public static SubLObject sparql_expanded_identifier_string(final SubLObject identifier, final SubLObject access_path) {
        assert NIL != stringp(identifier) : "! stringp(identifier) " + ("Types.stringp(identifier) " + "CommonSymbols.NIL != Types.stringp(identifier) ") + identifier;
        if (NIL != sparql_abbreviated_uri_p(identifier)) {
            final SubLObject prefix_map = sksi_access_path.access_path_rdf_prefix_map(access_path);
            final SubLObject prefix_end_pos = search($str101$_, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != subl_promotions.positive_integer_p(prefix_end_pos)) {
                final SubLObject prefix = string_utilities.substring(identifier, ZERO_INTEGER, prefix_end_pos);
                final SubLObject suffix = string_utilities.substring(identifier, add(ONE_INTEGER, prefix_end_pos), UNPROVIDED);
                final SubLObject expanded_prefix = list_utilities.alist_lookup(prefix_map, prefix, $sym102$STRING_, UNPROVIDED);
                if (!expanded_prefix.isString()) {
                    Errors.warn($str103$Could_not_find_expanded_prefix_fo, prefix, prefix_map);
                    return identifier;
                }
                return cconcatenate($str90$_, new SubLObject[]{ expanded_prefix, suffix, $str91$_ });
            }
        }
        return identifier;
    }

    public static final SubLObject sparql_valid_uri_prefix_string_p_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        if (start.numE(end)) {
            return T;
        } else {
            if (ONE_INTEGER.numE(subtract(end, start))) {
                {
                    SubLObject v_char = Strings.sublisp_char(string, start);
                    return makeBoolean((NIL != charNE(CHAR_underbar, v_char)) && (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_valid_uri_identifier_char_p(v_char)));
                }
            } else {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_valid_uri_identifier_string_p(string, start, end);
            }
        }
    }

    public static SubLObject sparql_valid_uri_prefix_string_p(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        if (start.numE(end)) {
            return T;
        }
        if (ONE_INTEGER.numE(subtract(end, start))) {
            final SubLObject v_char = Strings.sublisp_char(string, start);
            return makeBoolean((NIL != charNE(CHAR_underbar, v_char)) && (NIL != sparql_valid_uri_identifier_char_p(v_char)));
        }
        return sparql_valid_uri_identifier_string_p(string, start, end);
    }

    public static final SubLObject sparql_valid_uri_identifier_string_p_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        if (string.isString() && end.numG(start)) {
            {
                SubLObject string_var = string;
                SubLObject end_var = (NIL != end) ? ((SubLObject) (end)) : length(string_var);
                SubLObject end_var_3 = end_var;
                SubLObject char_num = NIL;
                for (char_num = start; !char_num.numGE(end_var_3); char_num = number_utilities.f_1X(char_num)) {
                    {
                        SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                        if (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_valid_uri_identifier_char_p(v_char)) {
                            return NIL;
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject sparql_valid_uri_identifier_string_p(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        if (string.isString() && end.numG(start)) {
            SubLObject end_var_$3;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = end_var_$3 = (NIL != end) ? end : length(string), char_num = NIL, char_num = start; !char_num.numGE(end_var_$3); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (NIL == sparql_valid_uri_identifier_char_p(v_char)) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject sparql_valid_uri_identifier_char_p_alt(SubLObject v_char) {
        return makeBoolean(((((NIL != alphanumericp(v_char)) || (NIL != charE(v_char, CHAR_hyphen))) || (NIL != charE(v_char, CHAR_underbar))) || (NIL != charE(v_char, CHAR_comma))) || (NIL != charE(v_char, CHAR_percent)));
    }

    public static SubLObject sparql_valid_uri_identifier_char_p(final SubLObject v_char) {
        return makeBoolean(((((NIL != alphanumericp(v_char)) || (NIL != charE(v_char, CHAR_hyphen))) || (NIL != charE(v_char, CHAR_underbar))) || (NIL != charE(v_char, CHAR_comma))) || (NIL != charE(v_char, CHAR_percent)));
    }

    public static final SubLObject sparql_literal_p_alt(SubLObject constraint) {
        return makeBoolean(constraint.isNumber() || (constraint.isString() && (NIL == com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.sparql_identifier_p(constraint))));
    }

    public static SubLObject sparql_literal_p(final SubLObject constraint) {
        return makeBoolean(constraint.isNumber() || (constraint.isString() && (NIL == sparql_identifier_p(constraint))));
    }

    public static final SubLObject sparql_literal_string_alt(SubLObject constraint) {
        if (constraint.isInteger()) {
            return format_nil.format_nil_d(constraint);
        } else {
            if (constraint.isNumber()) {
                return format(NIL, $str_alt100$_F, constraint);
            } else {
                return prin1_to_string(constraint);
            }
        }
    }

    public static SubLObject sparql_literal_string(final SubLObject constraint) {
        if (constraint.isInteger()) {
            return format_nil.format_nil_d(constraint);
        }
        if (constraint.isDouble()) {
            return format(NIL, $str104$_F, constraint);
        }
        if (NIL != list_utilities.member_equalP(constraint, $list105)) {
            return cconcatenate(format_nil.format_nil_s_no_copy(constraint), $str106$__xsd_boolean);
        }
        return prin1_to_string(constraint);
    }

    public static final SubLObject sparql_variable_p_alt(SubLObject constraint) {
        return cycl_grammar.el_variable_p(constraint);
    }

    public static SubLObject sparql_variable_p(final SubLObject constraint) {
        return cycl_grammar.el_variable_p(constraint);
    }

    public static final SubLObject sparql_variable_string_alt(SubLObject constraint) {
        return symbol_name(constraint);
    }

    public static SubLObject sparql_variable_string(final SubLObject constraint) {
        return symbol_name(constraint);
    }

    public static final SubLObject test_csql_to_sparql_alt(SubLObject csql, SubLObject access_path_alist) {
        {
            SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(access_path_alist, UNPROVIDED);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_sparql_interpretation.csql_to_sparql(csql, access_path);
        }
    }

    public static SubLObject test_csql_to_sparql(final SubLObject csql, SubLObject access_path_alist) {
        if (access_path_alist == UNPROVIDED) {
            access_path_alist = $test_access_path_alist$.getDynamicValue();
        }
        final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(access_path_alist, UNPROVIDED);
        return csql_to_sparql(csql, access_path);
    }

    public static final SubLObject declare_sksi_csql_sparql_interpretation_file_alt() {
        declareFunction("csql_to_sparql", "CSQL-TO-SPARQL", 2, 0, false);
        declareFunction("sparql_compute_header", "SPARQL-COMPUTE-HEADER", 1, 0, false);
        declareFunction("write_sparql_oracle_sem_prefix_header", "WRITE-SPARQL-ORACLE-SEM-PREFIX-HEADER", 1, 0, false);
        declareFunction("sparql_write_uri_tag", "SPARQL-WRITE-URI-TAG", 2, 0, false);
        declareFunction("csql_to_sparql_select", "CSQL-TO-SPARQL-SELECT", 2, 0, false);
        declareFunction("csql_to_sparql_fields", "CSQL-TO-SPARQL-FIELDS", 1, 0, false);
        declareFunction("csql_boolean_select_fields_p", "CSQL-BOOLEAN-SELECT-FIELDS-P", 1, 0, false);
        declareFunction("csql_variables_fields_p", "CSQL-VARIABLES-FIELDS-P", 1, 0, false);
        declareFunction("sparql_field_variable_name", "SPARQL-FIELD-VARIABLE-NAME", 1, 0, false);
        declareFunction("sparql_field_name_to_variable_name", "SPARQL-FIELD-NAME-TO-VARIABLE-NAME", 1, 0, false);
        declareFunction("csql_to_sparql_where", "CSQL-TO-SPARQL-WHERE", 2, 0, false);
        declareFunction("csql_normalize_where_expressions_for_sparql", "CSQL-NORMALIZE-WHERE-EXPRESSIONS-FOR-SPARQL", 1, 0, false);
        declareFunction("sparql_maximize_literal_conjunction", "SPARQL-MAXIMIZE-LITERAL-CONJUNCTION", 1, 0, false);
        declareFunction("csql_literal_where_espressions_p", "CSQL-LITERAL-WHERE-ESPRESSIONS-P", 1, 0, false);
        declareFunction("csql_sparql_supported_where_expression_p", "CSQL-SPARQL-SUPPORTED-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_literal_where_expression_p", "CSQL-LITERAL-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_literal_where_expression_resolved_field_p", "CSQL-LITERAL-WHERE-EXPRESSION-RESOLVED-FIELD-P", 1, 0, false);
        declareFunction("csql_sparql_unknown_sentence_where_expression_p", "CSQL-SPARQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_sparql_filter_where_expression_p", "CSQL-SPARQL-FILTER-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("sparql_literal_where_expression_string", "SPARQL-LITERAL-WHERE-EXPRESSION-STRING", 2, 0, false);
        declareFunction("sparql_literal_where_expression_datatype", "SPARQL-LITERAL-WHERE-EXPRESSION-DATATYPE", 2, 0, false);
        declareFunction("sparql_literal_where_expression_arg_string", "SPARQL-LITERAL-WHERE-EXPRESSION-ARG-STRING", 2, 1, false);
        declareFunction("possible_rdf_literal_string_p", "POSSIBLE-RDF-LITERAL-STRING-P", 1, 0, false);
        declareFunction("sparql_categorize_where_expressions", "SPARQL-CATEGORIZE-WHERE-EXPRESSIONS", 1, 0, false);
        declareFunction("sparql_categorize_equality_clause", "SPARQL-CATEGORIZE-EQUALITY-CLAUSE", 1, 0, false);
        declareFunction("sparql_write_constraints", "SPARQL-WRITE-CONSTRAINTS", 4, 0, false);
        declareFunction("sparql_write_constraint", "SPARQL-WRITE-CONSTRAINT", 3, 0, false);
        declareFunction("sparql_possibly_expand_identifier_string", "SPARQL-POSSIBLY-EXPAND-IDENTIFIER-STRING", 2, 0, false);
        declareFunction("csql_to_sparql_limit", "CSQL-TO-SPARQL-LIMIT", 2, 0, false);
        declareFunction("csql_to_sparql_offset", "CSQL-TO-SPARQL-OFFSET", 2, 0, false);
        declareFunction("sparql_identifier_p", "SPARQL-IDENTIFIER-P", 1, 0, false);
        declareFunction("sparql_bnode_identifier_p", "SPARQL-BNODE-IDENTIFIER-P", 1, 0, false);
        declareFunction("sparql_abbreviated_uri_p", "SPARQL-ABBREVIATED-URI-P", 1, 0, false);
        declareFunction("sparql_expanded_uri_p", "SPARQL-EXPANDED-URI-P", 1, 0, false);
        declareFunction("sparql_identifier_string", "SPARQL-IDENTIFIER-STRING", 1, 0, false);
        declareFunction("sparql_expanded_identifier_string", "SPARQL-EXPANDED-IDENTIFIER-STRING", 2, 0, false);
        declareFunction("sparql_valid_uri_prefix_string_p", "SPARQL-VALID-URI-PREFIX-STRING-P", 1, 2, false);
        declareFunction("sparql_valid_uri_identifier_string_p", "SPARQL-VALID-URI-IDENTIFIER-STRING-P", 1, 2, false);
        declareFunction("sparql_valid_uri_identifier_char_p", "SPARQL-VALID-URI-IDENTIFIER-CHAR-P", 1, 0, false);
        declareFunction("sparql_literal_p", "SPARQL-LITERAL-P", 1, 0, false);
        declareFunction("sparql_literal_string", "SPARQL-LITERAL-STRING", 1, 0, false);
        declareFunction("sparql_variable_p", "SPARQL-VARIABLE-P", 1, 0, false);
        declareFunction("sparql_variable_string", "SPARQL-VARIABLE-STRING", 1, 0, false);
        declareFunction("csql_field_p", "CSQL-FIELD-P", 1, 0, false);
        declareFunction("test_csql_to_sparql", "TEST-CSQL-TO-SPARQL", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_sksi_csql_sparql_interpretation_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("csql_to_sparql", "CSQL-TO-SPARQL", 2, 0, false);
            declareFunction("sparql_compute_header", "SPARQL-COMPUTE-HEADER", 1, 0, false);
            declareFunction("sparql_write_prefix_uri_pair", "SPARQL-WRITE-PREFIX-URI-PAIR", 3, 0, false);
            declareFunction("sparql_write_uri_tag", "SPARQL-WRITE-URI-TAG", 2, 0, false);
            declareFunction("csql_to_sparql_select", "CSQL-TO-SPARQL-SELECT", 2, 0, false);
            declareFunction("csql_to_sparql_fields", "CSQL-TO-SPARQL-FIELDS", 1, 0, false);
            declareFunction("csql_boolean_select_fields_p", "CSQL-BOOLEAN-SELECT-FIELDS-P", 1, 0, false);
            declareFunction("csql_variables_fields_p", "CSQL-VARIABLES-FIELDS-P", 1, 0, false);
            declareFunction("sparql_field_variable_name", "SPARQL-FIELD-VARIABLE-NAME", 1, 0, false);
            declareFunction("sparql_field_name_to_variable_name", "SPARQL-FIELD-NAME-TO-VARIABLE-NAME", 1, 0, false);
            declareFunction("csql_to_sparql_where", "CSQL-TO-SPARQL-WHERE", 2, 0, false);
            declareFunction("csql_normalize_where_expressions_for_sparql", "CSQL-NORMALIZE-WHERE-EXPRESSIONS-FOR-SPARQL", 1, 0, false);
            declareFunction("sparql_maximize_literal_conjunction", "SPARQL-MAXIMIZE-LITERAL-CONJUNCTION", 1, 0, false);
            declareFunction("csql_literal_where_espressions_p", "CSQL-LITERAL-WHERE-ESPRESSIONS-P", 1, 0, false);
            declareFunction("csql_sparql_supported_where_expression_p", "CSQL-SPARQL-SUPPORTED-WHERE-EXPRESSION-P", 1, 0, false);
            declareFunction("csql_literal_where_expression_p", "CSQL-LITERAL-WHERE-EXPRESSION-P", 1, 0, false);
            declareFunction("csql_literal_where_expression_resolved_field_p", "CSQL-LITERAL-WHERE-EXPRESSION-RESOLVED-FIELD-P", 1, 0, false);
            declareFunction("csql_sparql_unknown_sentence_where_expression_p", "CSQL-SPARQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION-P", 1, 0, false);
            declareFunction("csql_sparql_filter_where_expression_p", "CSQL-SPARQL-FILTER-WHERE-EXPRESSION-P", 1, 0, false);
            declareFunction("sparql_literal_where_expression_string", "SPARQL-LITERAL-WHERE-EXPRESSION-STRING", 2, 0, false);
            declareFunction("output_sparql_literal_where_expression_from_csql_filter_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-FILTER-WHERE-EXPRESSION", 3, 0, false);
            declareFunction("output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION", 3, 0, false);
            declareFunction("output_sparql_literal_where_expression_from_csql_literal_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-LITERAL-WHERE-EXPRESSION", 3, 0, false);
            declareFunction("output_sparql_literal_where_expression_from_spo", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-SPO", 5, 1, false);
            declareFunction("unpack_csql_disjunctions", "UNPACK-CSQL-DISJUNCTIONS", 1, 0, false);
            declareFunction("sparql_literal_where_expression_datatype", "SPARQL-LITERAL-WHERE-EXPRESSION-DATATYPE", 2, 0, false);
            declareFunction("sparql_literal_where_expression_arg_string", "SPARQL-LITERAL-WHERE-EXPRESSION-ARG-STRING", 2, 1, false);
            declareFunction("possible_rdf_literal_string_p", "POSSIBLE-RDF-LITERAL-STRING-P", 1, 0, false);
            declareFunction("sparql_categorize_where_expressions", "SPARQL-CATEGORIZE-WHERE-EXPRESSIONS", 1, 0, false);
            declareFunction("sparql_categorize_equality_clause", "SPARQL-CATEGORIZE-EQUALITY-CLAUSE", 1, 0, false);
            declareFunction("sparql_write_constraints", "SPARQL-WRITE-CONSTRAINTS", 4, 0, false);
            declareFunction("sparql_write_constraint", "SPARQL-WRITE-CONSTRAINT", 3, 0, false);
            declareFunction("sparql_possibly_expand_identifier_string", "SPARQL-POSSIBLY-EXPAND-IDENTIFIER-STRING", 2, 0, false);
            declareFunction("sparql_unescaped_identifier_string_p", "SPARQL-UNESCAPED-IDENTIFIER-STRING-P", 1, 0, false);
            declareFunction("sparql_unescaped_identifier_char_p", "SPARQL-UNESCAPED-IDENTIFIER-CHAR-P", 1, 0, false);
            declareFunction("csql_to_sparql_limit", "CSQL-TO-SPARQL-LIMIT", 2, 0, false);
            declareFunction("csql_to_sparql_offset", "CSQL-TO-SPARQL-OFFSET", 2, 0, false);
            declareFunction("sparql_identifier_p", "SPARQL-IDENTIFIER-P", 1, 0, false);
            declareFunction("sparql_bnode_identifier_p", "SPARQL-BNODE-IDENTIFIER-P", 1, 0, false);
            declareFunction("sparql_abbreviated_uri_p", "SPARQL-ABBREVIATED-URI-P", 1, 0, false);
            declareFunction("sparql_expanded_uri_p", "SPARQL-EXPANDED-URI-P", 1, 0, false);
            declareFunction("sparql_identifier_string", "SPARQL-IDENTIFIER-STRING", 1, 0, false);
            declareFunction("sparql_expanded_identifier_string", "SPARQL-EXPANDED-IDENTIFIER-STRING", 2, 0, false);
            declareFunction("sparql_valid_uri_prefix_string_p", "SPARQL-VALID-URI-PREFIX-STRING-P", 1, 2, false);
            declareFunction("sparql_valid_uri_identifier_string_p", "SPARQL-VALID-URI-IDENTIFIER-STRING-P", 1, 2, false);
            declareFunction("sparql_valid_uri_identifier_char_p", "SPARQL-VALID-URI-IDENTIFIER-CHAR-P", 1, 0, false);
            declareFunction("sparql_literal_p", "SPARQL-LITERAL-P", 1, 0, false);
            declareFunction("sparql_literal_string", "SPARQL-LITERAL-STRING", 1, 0, false);
            declareFunction("sparql_variable_p", "SPARQL-VARIABLE-P", 1, 0, false);
            declareFunction("sparql_variable_string", "SPARQL-VARIABLE-STRING", 1, 0, false);
            declareFunction("test_csql_to_sparql", "TEST-CSQL-TO-SPARQL", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("write_sparql_oracle_sem_prefix_header", "WRITE-SPARQL-ORACLE-SEM-PREFIX-HEADER", 1, 0, false);
            declareFunction("csql_field_p", "CSQL-FIELD-P", 1, 0, false);
            declareFunction("test_csql_to_sparql", "TEST-CSQL-TO-SPARQL", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_csql_sparql_interpretation_file_Previous() {
        declareFunction("csql_to_sparql", "CSQL-TO-SPARQL", 2, 0, false);
        declareFunction("sparql_compute_header", "SPARQL-COMPUTE-HEADER", 1, 0, false);
        declareFunction("sparql_write_prefix_uri_pair", "SPARQL-WRITE-PREFIX-URI-PAIR", 3, 0, false);
        declareFunction("sparql_write_uri_tag", "SPARQL-WRITE-URI-TAG", 2, 0, false);
        declareFunction("csql_to_sparql_select", "CSQL-TO-SPARQL-SELECT", 2, 0, false);
        declareFunction("csql_to_sparql_fields", "CSQL-TO-SPARQL-FIELDS", 1, 0, false);
        declareFunction("csql_boolean_select_fields_p", "CSQL-BOOLEAN-SELECT-FIELDS-P", 1, 0, false);
        declareFunction("csql_variables_fields_p", "CSQL-VARIABLES-FIELDS-P", 1, 0, false);
        declareFunction("sparql_field_variable_name", "SPARQL-FIELD-VARIABLE-NAME", 1, 0, false);
        declareFunction("sparql_field_name_to_variable_name", "SPARQL-FIELD-NAME-TO-VARIABLE-NAME", 1, 0, false);
        declareFunction("csql_to_sparql_where", "CSQL-TO-SPARQL-WHERE", 2, 0, false);
        declareFunction("csql_normalize_where_expressions_for_sparql", "CSQL-NORMALIZE-WHERE-EXPRESSIONS-FOR-SPARQL", 1, 0, false);
        declareFunction("sparql_maximize_literal_conjunction", "SPARQL-MAXIMIZE-LITERAL-CONJUNCTION", 1, 0, false);
        declareFunction("csql_literal_where_espressions_p", "CSQL-LITERAL-WHERE-ESPRESSIONS-P", 1, 0, false);
        declareFunction("csql_sparql_supported_where_expression_p", "CSQL-SPARQL-SUPPORTED-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_literal_where_expression_p", "CSQL-LITERAL-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_literal_where_expression_resolved_field_p", "CSQL-LITERAL-WHERE-EXPRESSION-RESOLVED-FIELD-P", 1, 0, false);
        declareFunction("csql_sparql_unknown_sentence_where_expression_p", "CSQL-SPARQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("csql_sparql_filter_where_expression_p", "CSQL-SPARQL-FILTER-WHERE-EXPRESSION-P", 1, 0, false);
        declareFunction("sparql_literal_where_expression_string", "SPARQL-LITERAL-WHERE-EXPRESSION-STRING", 2, 0, false);
        declareFunction("output_sparql_literal_where_expression_from_csql_filter_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-FILTER-WHERE-EXPRESSION", 3, 0, false);
        declareFunction("output_sparql_literal_where_expression_from_csql_unknown_sentence_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-UNKNOWN-SENTENCE-WHERE-EXPRESSION", 3, 0, false);
        declareFunction("output_sparql_literal_where_expression_from_csql_literal_where_expression", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-CSQL-LITERAL-WHERE-EXPRESSION", 3, 0, false);
        declareFunction("output_sparql_literal_where_expression_from_spo", "OUTPUT-SPARQL-LITERAL-WHERE-EXPRESSION-FROM-SPO", 5, 1, false);
        declareFunction("unpack_csql_disjunctions", "UNPACK-CSQL-DISJUNCTIONS", 1, 0, false);
        declareFunction("sparql_literal_where_expression_datatype", "SPARQL-LITERAL-WHERE-EXPRESSION-DATATYPE", 2, 0, false);
        declareFunction("sparql_literal_where_expression_arg_string", "SPARQL-LITERAL-WHERE-EXPRESSION-ARG-STRING", 2, 1, false);
        declareFunction("possible_rdf_literal_string_p", "POSSIBLE-RDF-LITERAL-STRING-P", 1, 0, false);
        declareFunction("sparql_categorize_where_expressions", "SPARQL-CATEGORIZE-WHERE-EXPRESSIONS", 1, 0, false);
        declareFunction("sparql_categorize_equality_clause", "SPARQL-CATEGORIZE-EQUALITY-CLAUSE", 1, 0, false);
        declareFunction("sparql_write_constraints", "SPARQL-WRITE-CONSTRAINTS", 4, 0, false);
        declareFunction("sparql_write_constraint", "SPARQL-WRITE-CONSTRAINT", 3, 0, false);
        declareFunction("sparql_possibly_expand_identifier_string", "SPARQL-POSSIBLY-EXPAND-IDENTIFIER-STRING", 2, 0, false);
        declareFunction("sparql_unescaped_identifier_string_p", "SPARQL-UNESCAPED-IDENTIFIER-STRING-P", 1, 0, false);
        declareFunction("sparql_unescaped_identifier_char_p", "SPARQL-UNESCAPED-IDENTIFIER-CHAR-P", 1, 0, false);
        declareFunction("csql_to_sparql_limit", "CSQL-TO-SPARQL-LIMIT", 2, 0, false);
        declareFunction("csql_to_sparql_offset", "CSQL-TO-SPARQL-OFFSET", 2, 0, false);
        declareFunction("sparql_identifier_p", "SPARQL-IDENTIFIER-P", 1, 0, false);
        declareFunction("sparql_bnode_identifier_p", "SPARQL-BNODE-IDENTIFIER-P", 1, 0, false);
        declareFunction("sparql_abbreviated_uri_p", "SPARQL-ABBREVIATED-URI-P", 1, 0, false);
        declareFunction("sparql_expanded_uri_p", "SPARQL-EXPANDED-URI-P", 1, 0, false);
        declareFunction("sparql_identifier_string", "SPARQL-IDENTIFIER-STRING", 1, 0, false);
        declareFunction("sparql_expanded_identifier_string", "SPARQL-EXPANDED-IDENTIFIER-STRING", 2, 0, false);
        declareFunction("sparql_valid_uri_prefix_string_p", "SPARQL-VALID-URI-PREFIX-STRING-P", 1, 2, false);
        declareFunction("sparql_valid_uri_identifier_string_p", "SPARQL-VALID-URI-IDENTIFIER-STRING-P", 1, 2, false);
        declareFunction("sparql_valid_uri_identifier_char_p", "SPARQL-VALID-URI-IDENTIFIER-CHAR-P", 1, 0, false);
        declareFunction("sparql_literal_p", "SPARQL-LITERAL-P", 1, 0, false);
        declareFunction("sparql_literal_string", "SPARQL-LITERAL-STRING", 1, 0, false);
        declareFunction("sparql_variable_p", "SPARQL-VARIABLE-P", 1, 0, false);
        declareFunction("sparql_variable_string", "SPARQL-VARIABLE-STRING", 1, 0, false);
        declareFunction("test_csql_to_sparql", "TEST-CSQL-TO-SPARQL", 1, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt2$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");

    static private final SubLString $str_alt3$_A = makeString("~A");

    static private final SubLString $str_alt4$BASE_ = makeString("BASE ");

    static private final SubLList $list_alt5 = cons(makeSymbol("PREFIX"), makeSymbol("PREFIX-URI"));

    static private final SubLString $str_alt6$PREFIX__A__ = makeString("PREFIX ~A: ");

    static private final SubLString $str_alt7$ORACLE_SEM_FS_NS = makeString("ORACLE_SEM_FS_NS");

    public static final SubLInteger $int$300 = makeInteger(300);

    static private final SubLString $str_alt9$http___oracle_com_semtech_timeout = makeString("http://oracle.com/semtech#timeout=");

    static private final SubLString $str_alt10$_ordered = makeString(",ordered");

    static private final SubLString $str_alt11$_dop_ = makeString(",dop=");

    static private final SubLString $str_alt13$_plain_sql_opt_f = makeString(",plain_sql_opt=f");

    static private final SubLList $list_alt15 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("LIMIT"), makeSymbol("OFFSET"));

    static private final SubLString $str_alt18$_ = makeString(" ");

    static private final SubLString $str_alt19$_ = makeString("{");

    static private final SubLString $str_alt20$GRAPH__CONTEXT = makeString("GRAPH ?CONTEXT");

    static private final SubLString $str_alt21$___ = makeString(" { ");

    static private final SubLString $str_alt22$_ = makeString("}");

    static private final SubLString $$$1 = makeString("1");

    static private final SubLString $str_alt26$__ = makeString(" *");

    static private final SubLList $list_alt27 = list(makeSymbol("VARIABLES-KEYWORD"), makeSymbol("&REST"), makeSymbol("VARIABLES"));

    static private final SubLString $str_alt29$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :variables");

    static private final SubLString $str_alt30$__A = makeString(" ~A");

    static private final SubLList $list_alt31 = list(makeKeyword("COUNT"), makeKeyword("ALL"));

    static private final SubLString $str_alt34$_subj = makeString("?subj");

    static private final SubLString $str_alt36$_pred = makeString("?pred");

    static private final SubLString $str_alt38$_obj = makeString("?obj");

    static private final SubLString $str_alt39$Unsupported_SPARQL_field_name__S = makeString("Unsupported SPARQL field name ~S");

    static private final SubLList $list_alt40 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-EXPRESSIONS"));

    static private final SubLString $str_alt42$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :where");

    static private final SubLString $str_alt43$GRAPH__G____ = makeString("GRAPH ?G {~%");

    static private final SubLString $str_alt45$___ = makeString("}~%");

    static private final SubLString $str_alt46$__ = makeString("  ");

    static private final SubLString $str_alt47$__ = makeString(" .");

    static private final SubLList $list_alt51 = list(makeSymbol("LITERAL-KEYWORD"), makeSymbol("LITERAL"));

    static private final SubLList $list_alt53 = list(makeSymbol("EXPRESSION-KEYWORD"), makeSymbol("&REST"), makeSymbol("REST"));

    static private final SubLList $list_alt55 = list(makeSymbol("CSQL-OPERATOR"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLString $str_alt57$CSQL_operator__A_missing___csqlOp = makeString("CSQL operator ~A missing #$csqlOperatorToSQLOperator for #$Sparql-P-TheProgram.");

    static private final SubLString $str_alt58$__FILTER__ = makeString("  FILTER (");

    public static final SubLObject init_sksi_csql_sparql_interpretation_file_alt() {
        defvar("*SPARQL-ORACLE-BACKEND?*", NIL);
        defvar("*SPARQL-LIMIT-OVERRIDE*", NIL);
        defvar("*SPARQL-OFFSET-OVERRIDE*", NIL);
        defparameter("*SKSI-SPARQL-IST-GRAPH-VARIABLE*", NIL);
        defparameter("*SKSI-SPARQL-IST-GRAPH-RESULT*", NIL);
        defparameter("*SKSI-SPARQL-GRAPH-OPTIMIZATION-ENABLED?*", NIL);
        defparameter("*SKSI-SPARQL-MAXIMIZE-LITERAL-CONJUNCTION?*", NIL);
        defparameter("*SPARQL-EXPAND-IDENTIFIER-STRINGS?*", T);
        return NIL;
    }

    public static SubLObject init_sksi_csql_sparql_interpretation_file() {
        if (SubLFiles.USE_V1) {
            defvar("*SPARQL-LIMIT-OVERRIDE*", NIL);
            defvar("*SPARQL-OFFSET-OVERRIDE*", NIL);
            defparameter("*SKSI-SPARQL-IST-GRAPH-VARIABLE*", NIL);
            defparameter("*SKSI-SPARQL-IST-GRAPH-RESULT*", NIL);
            defparameter("*SKSI-SPARQL-GRAPH-OPTIMIZATION-ENABLED?*", NIL);
            defparameter("*SKSI-SPARQL-MAXIMIZE-LITERAL-CONJUNCTION?*", NIL);
            defparameter("*SKSI-SPARQL-FORCE-DATE-COMPARISONS-AS-STRINGS?*", T);
            defparameter("*SPARQL-EXPAND-IDENTIFIER-STRINGS?*", T);
            defparameter("*TEST-ACCESS-PATH-ALIST*", $list107);
        }
        if (SubLFiles.USE_V2) {
            defvar("*SPARQL-ORACLE-BACKEND?*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_sksi_csql_sparql_interpretation_file_Previous() {
        defvar("*SPARQL-LIMIT-OVERRIDE*", NIL);
        defvar("*SPARQL-OFFSET-OVERRIDE*", NIL);
        defparameter("*SKSI-SPARQL-IST-GRAPH-VARIABLE*", NIL);
        defparameter("*SKSI-SPARQL-IST-GRAPH-RESULT*", NIL);
        defparameter("*SKSI-SPARQL-GRAPH-OPTIMIZATION-ENABLED?*", NIL);
        defparameter("*SKSI-SPARQL-MAXIMIZE-LITERAL-CONJUNCTION?*", NIL);
        defparameter("*SKSI-SPARQL-FORCE-DATE-COMPARISONS-AS-STRINGS?*", T);
        defparameter("*SPARQL-EXPAND-IDENTIFIER-STRINGS?*", T);
        defparameter("*TEST-ACCESS-PATH-ALIST*", $list107);
        return NIL;
    }

    static private final SubLString $str_alt60$_A_ = makeString("~A ");

    static private final SubLString $str_alt61$____ = makeString(" || ");

    static private final SubLString $str_alt62$Set_arguments_only_supported_for_ = makeString("Set arguments only supported for #$CSQLEqualsAny");

    static private final SubLString $str_alt63$_ = makeString(")");

    static private final SubLList $list_alt64 = list(makeSymbol("UNKNOWN-SENTENCE-KEYWORD"), makeSymbol("EXISTENTIAL-VARS-LIST"), makeSymbol("SUB-WHERE"));

    static private final SubLList $list_alt65 = cons(makeSymbol("EXISTENTIAL-VARS-KEYWORD"), makeSymbol("EXISTENTIAL-VARS"));

    public static final SubLObject setup_sksi_csql_sparql_interpretation_file_alt() {
        define_test_case_table_int(TEST_CSQL_TO_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt109);
        return NIL;
    }

    public static SubLObject setup_sksi_csql_sparql_interpretation_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(TEST_CSQL_TO_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list115);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_CSQL_TO_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt109);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_csql_sparql_interpretation_file_Previous() {
        define_test_case_table_int(TEST_CSQL_TO_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list115);
        return NIL;
    }

    static private final SubLString $str_alt66$OPTIONAL____ = makeString("OPTIONAL {~%");

    static private final SubLString $str_alt67$FILTER__ = makeString("FILTER (");

    static private final SubLString $str_alt68$__bound__A__ = makeString(" !bound(~A) ");

    @Override
    public void declareFunctions() {
        declare_sksi_csql_sparql_interpretation_file();
    }

    static private final SubLString $str_alt69$___ = makeString("|| ");

    @Override
    public void initializeVariables() {
        init_sksi_csql_sparql_interpretation_file();
    }

    static private final SubLString $str_alt70$___ = makeString(")~%");

    static private final SubLList $list_alt71 = list(makeSymbol("LITERAL-KEYWORD"), list(makeSymbol("PREDICATE"), makeSymbol("SUBJECT"), makeSymbol("OBJECT")));

    @Override
    public void runTopLevelForms() {
        setup_sksi_csql_sparql_interpretation_file();
    }

    static {
    }

    static private final SubLString $str_alt72$_ = makeString(".");

    static private final SubLString $str_alt73$Unexpected_where_clause____S = makeString("Unexpected where-clause : ~S");

    static private final SubLString $str_alt77$STR_ = makeString("STR(");

    static private final SubLString $str_alt78$xsd_dateTime__ = makeString("xsd:dateTime(\"");

    static private final SubLString $str_alt79$__ = makeString("\")");

    static private final SubLString $str_alt80$xsd_string_ = makeString("xsd:string(");

    static private final SubLString $str_alt81$xsd_float_ = makeString("xsd:float(");

    static private final SubLString $str_alt82$xsd_float__F_ = makeString("xsd:float(~F)");

    static private final SubLString $str_alt83$Unexpected_where_clause_argument_ = makeString("Unexpected where-clause argument : ~A");

    static private final SubLString $str_alt84$Unexpected_equality_clause____S = makeString("Unexpected equality-clause : ~S");

    static private final SubLList $list_alt85 = list(makeSymbol("EQUALITY"), makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));

    static private final SubLString $str_alt86$Time_to_support_multiple___A_cons = makeString("Time to support multiple ~~A constraints : ~S");

    static private final SubLString $str_alt87$Time_to_handle_constraint____S = makeString("Time to handle constraint : ~S");

    static private final SubLList $list_alt88 = list(makeSymbol("LIMIT-KEYWORD"), makeSymbol("LIMIT-NUMBER"));

    static private final SubLString $str_alt90$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :limit");

    static private final SubLList $list_alt91 = list(makeSymbol("OFFSET-KEYWORD"), makeSymbol("OFFSET-NUMBER"));

    static private final SubLString $str_alt93$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :offset");

    static private final SubLString $str_alt94$__ = makeString("_:");

    static private final SubLString $str_alt95$_ = makeString("<");

    static private final SubLString $str_alt96$_ = makeString(">");

    static private final SubLString $str_alt97$_ = makeString(":");

    static private final SubLSymbol $sym98$STRING_ = makeSymbol("STRING=");

    static private final SubLString $str_alt99$Could_not_find_expanded_prefix_fo = makeString("Could not find expanded-prefix for ~A in map ~A~%");

    static private final SubLString $str_alt100$_F = makeString("~F");

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt109 = list(list(list(list(makeKeyword("SELECT"), list(list(makeKeyword("FIELD"), makeString("object"), makeString("default"))), list($FROM, list(list(makeKeyword("TABLE"), makeString("default")))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("predicate"), makeString("default")), makeString("rdf:type")), list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("subject"), makeString("default")), makeString("foo"))))), list(cons(reader_make_constant_shell("baseNamespaceForSKS"), makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), list(reader_make_constant_shell("nameSpacePrefixForSKS"), cons(makeString("owl"), makeString("http://www/w3.org/2000/07/owl#")), cons(makeString("ptrec"), makeString("http://clevelandclinicfoundation.org/cidr/patientrecord#")), cons(makeString("rdf"), makeString("http://www/w3.org/2000/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www/w3.org/2000/01/rdf-schema#")), cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"))))), makeString("BASE <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#>\nPREFIX owl: <http://www/w3.org/2000/07/owl#>\nPREFIX ptrec: <http://clevelandclinicfoundation.org/cidr/patientrecord#>\nPREFIX rdf: <http://www/w3.org/2000/02/22-rdf-syntax-ns#>\nPREFIX rdfs: <http://www/w3.org/2000/01/rdf-schema#>\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\nSELECT ?obj\nWHERE {\n  \"foo\" <http://www/w3.org/2000/02/22-rdf-syntax-ns#type> ?obj  .\n}\n")));
}

/**
 * Total time: 402 ms
 */
