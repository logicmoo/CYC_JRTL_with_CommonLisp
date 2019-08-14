/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class external_interfaces extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt50$ = makeString("");

    public static final SubLFile me = new external_interfaces();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.external_interfaces";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $quirk_host$ = makeSymbol("*QUIRK-HOST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $quirk_port$ = makeSymbol("*QUIRK-PORT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $talent_path$ = makeSymbol("*TALENT-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $npp_default$ = makeSymbol("*NPP-DEFAULT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $shallow_parse_path$ = makeSymbol("*SHALLOW-PARSE-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dependency_parse_path$ = makeSymbol("*DEPENDENCY-PARSE-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $guruqa_retrieve_passage_path$ = makeSymbol("*GURUQA-RETRIEVE-PASSAGE-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $guruqa_answer_indexes_path$ = makeSymbol("*GURUQA-ANSWER-INDEXES-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $resporator_path$ = makeSymbol("*RESPORATOR-PATH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $guruqa_wizard$ = makeSymbol("*GURUQA-WIZARD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dict_db_user$ = makeSymbol("*DICT-DB-USER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dict_db_passwd$ = makeSymbol("*DICT-DB-PASSWD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dict_db$ = makeSymbol("*DICT-DB*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dict_host$ = makeSymbol("*DICT-HOST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dict_conn$ = makeSymbol("*DICT-CONN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $dict_stmt$ = makeSymbol("*DICT-STMT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $all_external_services$ = makeSymbol("*ALL-EXTERNAL-SERVICES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$mongo_cyc_com = makeString("mongo.cyc.com");

    private static final SubLInteger $int$8080 = makeInteger(8080);

    static private final SubLString $str2$_users_textract_showtalent = makeString("/users/textract/showtalent");

    static private final SubLString $str3$_users_textract_sexpr_shallow = makeString("/users/textract/sexpr-shallow");

    static private final SubLString $str4$_users_supertagger_sexprlda = makeString("/users/supertagger/sexprlda");

    static private final SubLString $str5$_users_textract_documentWindow = makeString("/users/textract/documentWindow");

    static private final SubLString $str6$_users_textract_guruqaIds = makeString("/users/textract/guruqaIds");

    static private final SubLString $str7$_users_textract_sexprresporator = makeString("/users/textract/sexprresporator");

    private static final SubLSymbol CYCL_GURUQA_QUERY_WIZARD = makeSymbol("CYCL-GURUQA-QUERY-WIZARD");



    static private final SubLString $str11$__mt___A = makeString("~&mt: ~A");

    static private final SubLString $str12$__wiz___A = makeString("~&wiz: ~A");

    static private final SubLString $str13$__cyc_expr___S_of_type__S = makeString("~&cyc-expr: ~S of type ~S");

    private static final SubLSymbol HOLISTIC_GURUQA_QUERY = makeSymbol("HOLISTIC-GURUQA-QUERY");

    static private final SubLString $str15$__guruqa_query_expr___A = makeString("~&guruqa query expr: ~A");

    static private final SubLString $str17$__guruqa_query_str___A = makeString("~&guruqa query str: ~A");

    static private final SubLString $str18$_________________________________ = makeString("~%====================================================================");

    static private final SubLString $str19$___A = makeString("~%~A");

    static private final SubLString $str20$_____S = makeString("~%~%~S");

    static private final SubLString $str23$___S = makeString("~%~S");

    static private final SubLString $$$query = makeString("query");

    static private final SubLString $$$text = makeString("text");

    private static final SubLSymbol QUIRK_LEXICON = makeSymbol("QUIRK-LEXICON");



    static private final SubLString $$$doc = makeString("doc");

    static private final SubLString $$$start = makeString("start");

    static private final SubLString $$$length = makeString("length");

    static private final SubLString $str40$_P_ = makeString("<P>");

    static private final SubLString $str41$__P_ = makeString("</P>");

    static private final SubLString $$$npp = makeString("npp");

    static private final SubLString $str44$_users_supertagger_old_sexprlda = makeString("/users/supertagger_old/sexprlda");

    private static final SubLSymbol STRIP_STEMS = makeSymbol("STRIP-STEMS");

    static private final SubLList $list47 = list(makeKeyword("S1"));

    static private final SubLString $$$ini = makeString("ini");

    static private final SubLString $$$mahler = makeString("mahler");

    static private final SubLString $str50$ = makeString("");

    static private final SubLString $$$dict2 = makeString("dict2");

    static private final SubLString $$$elmore = makeString("elmore");

    private static final SubLInteger $int$9999 = makeInteger(9999);

    static private final SubLString $$$postgresql = makeString("postgresql");

    static private final SubLString $str58$select_occurrences__documents__te = makeString("select occurrences, documents, term from dict where term = '~A' and corpus = 'AQUAINT-Corpus';");

    static private final SubLString $str59$__ = makeString("''");

    static private final SubLString $str60$_ = makeString("'");

    private static final SubLSymbol LEMUR_QUERY = makeSymbol("LEMUR-QUERY");

    private static final SubLSymbol GET_CORPUS_PATH_MAPPING = makeSymbol("GET-CORPUS-PATH-MAPPING");

    static private final SubLString $str63$Unsupported_corpus__a = makeString("Unsupported corpus ~a");

    static private final SubLString $str64$_inesgraph_cgi = makeString("/inesgraph.cgi");

    static private final SubLString $str66$___A_____ = makeString("~{~A~^ ~}");

    static private final SubLString $str67$_qaga_cgi = makeString("/qaga.cgi");

    static private final SubLString $str68$_applepie_cgi = makeString("/applepie.cgi");

    static private final SubLString $str69$_minipar_cgi = makeString("/minipar.cgi");

    static private final SubLString $str70$_bash_cgi = makeString("/bash.cgi");

    static private final SubLString $$$command = makeString("command");

    static private final SubLString $str72$_parse_date_cgi = makeString("/parse-date.cgi");

    static private final SubLString $$$datestring = makeString("datestring");

    static private final SubLString $$$year = makeString("year");

    static private final SubLString $$$month = makeString("month");

    static private final SubLString $$$day = makeString("day");

    static private final SubLString $$$hour = makeString("hour");

    static private final SubLString $$$minute = makeString("minute");

    static private final SubLString $$$second = makeString("second");

    static private final SubLString $str80$_qack_cgi = makeString("/qack.cgi");

    static private final SubLString $str81$_wordnet_cgi = makeString("/wordnet.cgi");

    static private final SubLList $list83 = list(list(makeString("type"), makeString("q")));

    static private final SubLString $str84$_questions_cgi = makeString("/questions.cgi");

    static private final SubLList $list85 = list(makeString("localhost"));

    static private final SubLString $$$Guest = makeString("Guest");

    static private final SubLString $str87$_cgi_bin_users_mahler_check_cyc_s = makeString("/cgi-bin/users/mahler/check_cyc_servers.perl");

    static private final SubLString $$$servers = makeString("servers");

    static private final SubLString $str90$_corpus_frequency_cgi = makeString("/corpus-frequency.cgi");

    static private final SubLString $$$dbfile = makeString("dbfile");

    static private final SubLString $$$word = makeString("word");

    static private final SubLString $$$pos = makeString("pos");

    public static final SubLObject $list94 = _constant_94_initializer();



    public static final SubLObject get_guruqa_wizard_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $guruqa_wizard$.getDynamicValue(thread)) {
                $guruqa_wizard$.setDynamicValue(object.new_class_instance(CYCL_GURUQA_QUERY_WIZARD), thread);
            }
            return $guruqa_wizard$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_guruqa_wizard() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $guruqa_wizard$.getDynamicValue(thread)) {
            $guruqa_wizard$.setDynamicValue(object.new_class_instance(CYCL_GURUQA_QUERY_WIZARD), thread);
        }
        return $guruqa_wizard$.getDynamicValue(thread);
    }

    public static final SubLObject compute_guruqa_query_alt(SubLObject cyc_expr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expr = NIL;
                SubLObject str = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        format(T, $str_alt11$__mt___A, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        format(T, $str_alt12$__wiz___A, com.cyc.cycjava.cycl.quirk.external_interfaces.get_guruqa_wizard());
                        format(T, $str_alt13$__cyc_expr___S_of_type__S, cyc_expr, type_of(cyc_expr));
                        expr = methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.quirk.external_interfaces.get_guruqa_wizard(), HOLISTIC_GURUQA_QUERY, cyc_expr);
                        format(T, $str_alt15$__guruqa_query_expr___A, expr);
                        str = methods.funcall_instance_method_with_0_args(expr, TO_STRING);
                        format(T, $str_alt17$__guruqa_query_str___A, str);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return expr;
            }
        }
    }

    public static SubLObject compute_guruqa_query(final SubLObject cyc_expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expr = NIL;
        SubLObject str = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            format(T, $str11$__mt___A, mt_relevance_macros.$mt$.getDynamicValue(thread));
            format(T, $str12$__wiz___A, get_guruqa_wizard());
            format(T, $str13$__cyc_expr___S_of_type__S, cyc_expr, type_of(cyc_expr));
            expr = methods.funcall_instance_method_with_1_args(get_guruqa_wizard(), HOLISTIC_GURUQA_QUERY, cyc_expr);
            format(T, $str15$__guruqa_query_expr___A, expr);
            str = methods.funcall_instance_method_with_0_args(expr, TO_STRING);
            format(T, $str17$__guruqa_query_str___A, str);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return expr;
    }

    public static final SubLObject secretarize_cycl_alt(SubLObject cycl, SubLObject guruqa_wizard, SubLObject secretary, SubLObject method) {
        if (method == UNPROVIDED) {
            method = HOLISTIC_GURUQA_QUERY;
        }
        {
            SubLObject passages = com.cyc.cycjava.cycl.quirk.external_interfaces.guruqa_passages_for_cycl(cycl, guruqa_wizard, method);
            SubLObject cdolist_list_var = passages;
            SubLObject passage = NIL;
            for (passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , passage = cdolist_list_var.first()) {
                format(T, $str_alt18$_________________________________);
                format(T, $str_alt19$___A, passage);
                format(T, $str_alt20$_____S, methods.funcall_instance_method_with_2_args(secretary, ASK, cycl, passage));
            }
            return T;
        }
    }

    public static SubLObject secretarize_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, final SubLObject secretary, SubLObject method) {
        if (method == UNPROVIDED) {
            method = HOLISTIC_GURUQA_QUERY;
        }
        SubLObject cdolist_list_var;
        final SubLObject passages = cdolist_list_var = guruqa_passages_for_cycl(cycl, guruqa_wizard, method);
        SubLObject passage = NIL;
        passage = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str18$_________________________________);
            format(T, $str19$___A, passage);
            format(T, $str20$_____S, methods.funcall_instance_method_with_2_args(secretary, ASK, cycl, passage));
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @param CYCL,
     * 		a CycL query.
     * @param GURUQA-WIZARD,
     * 		an instance of the SubLOOP class cycl-guruqa-query-wizard
     * @return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.
    This is a utility function for easier testing and uses the default values
    of the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CYCL,\r\n\t\ta CycL query.\r\n@param GURUQA-WIZARD,\r\n\t\tan instance of the SubLOOP class cycl-guruqa-query-wizard\r\n@return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.\r\nThis is a utility function for easier testing and uses the default values\r\nof the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.\r\n@unknown bertolo")
    public static final SubLObject guruqa_passages_for_cycl_alt(SubLObject cycl, SubLObject guruqa_wizard, SubLObject method) {
        if (method == UNPROVIDED) {
            method = HOLISTIC_GURUQA_QUERY;
        }
        SubLTrampolineFile.checkType(cycl, EL_FORMULA_P);
        {
            SubLObject query = methods.funcall_instance_method_with_1_args(guruqa_wizard, method, cycl);
            SubLObject query_string = methods.funcall_instance_method_with_0_args(query, TO_STRING);
            format(T, $str_alt23$___S, query_string);
            return com.cyc.cycjava.cycl.quirk.external_interfaces.guruqa_passages_for_query(query_string);
        }
    }

    /**
     *
     *
     * @param CYCL,
     * 		a CycL query.
     * @param GURUQA-WIZARD,
     * 		an instance of the SubLOOP class cycl-guruqa-query-wizard
     * @return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.
    This is a utility function for easier testing and uses the default values
    of the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CYCL,\r\n\t\ta CycL query.\r\n@param GURUQA-WIZARD,\r\n\t\tan instance of the SubLOOP class cycl-guruqa-query-wizard\r\n@return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.\r\nThis is a utility function for easier testing and uses the default values\r\nof the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.\r\n@unknown bertolo")
    public static SubLObject guruqa_passages_for_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, SubLObject method) {
        if (method == UNPROVIDED) {
            method = HOLISTIC_GURUQA_QUERY;
        }
        assert NIL != el_formula_p(cycl) : "! el_utilities.el_formula_p(cycl) " + ("el_utilities.el_formula_p(cycl) " + "CommonSymbols.NIL != el_utilities.el_formula_p(cycl) ") + cycl;
        final SubLObject query = methods.funcall_instance_method_with_1_args(guruqa_wizard, method, cycl);
        final SubLObject query_string = methods.funcall_instance_method_with_0_args(query, TO_STRING);
        format(T, $str23$___S, query_string);
        return guruqa_passages_for_query(query_string);
    }

    /**
     *
     *
     * @param QUERY,
     * 		a string encoding a well formed GuruQA query.
     * @return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.
    This is a utility function for easier testing and uses the default values
    of the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param QUERY,\r\n\t\ta string encoding a well formed GuruQA query.\r\n@return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.\r\nThis is a utility function for easier testing and uses the default values\r\nof the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.\r\n@unknown bertolo")
    public static final SubLObject guruqa_passages_for_query_alt(SubLObject query) {
        SubLTrampolineFile.checkType(query, STRINGP);
        {
            SubLObject indices = com.cyc.cycjava.cycl.quirk.external_interfaces.guruqa_answer_indexes(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject passages = NIL;
            SubLObject cdolist_list_var = indices;
            SubLObject index = NIL;
            for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                {
                    SubLObject doc = getf(index, $DOC, UNPROVIDED);
                    SubLObject sent = getf(index, $SENT, UNPROVIDED);
                    SubLObject passage = com.cyc.cycjava.cycl.quirk.external_interfaces.guruqa_retrieve_passage(doc, sent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    passages = cons(passage, passages);
                }
            }
            return com.cyc.cycjava.cycl.quirk.external_interfaces.strip_tags(passages);
        }
    }

    /**
     *
     *
     * @param QUERY,
     * 		a string encoding a well formed GuruQA query.
     * @return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.
    This is a utility function for easier testing and uses the default values
    of the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param QUERY,\r\n\t\ta string encoding a well formed GuruQA query.\r\n@return LIST-OF-STRINGS, all TREC passages relevant to the input QUERY.\r\nThis is a utility function for easier testing and uses the default values\r\nof the optional parameters of guruqa-answer-indexes and guruqa-retrieve-passage.\r\n@unknown bertolo")
    public static SubLObject guruqa_passages_for_query(final SubLObject query) {
        assert NIL != stringp(query) : "! stringp(query) " + ("Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) ") + query;
        final SubLObject indices = guruqa_answer_indexes(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject passages = NIL;
        SubLObject cdolist_list_var = indices;
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject doc = getf(index, $DOC, UNPROVIDED);
            final SubLObject sent = getf(index, $SENT, UNPROVIDED);
            final SubLObject passage = guruqa_retrieve_passage(doc, sent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            passages = cons(passage, passages);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return strip_tags(passages);
    }

    /**
     *
     *
     * @return a LIST-OF-INDEXES, each indes is of the form
    (:RANK 4 :LEN 1 :DOCID "XIE19960117.0233" :DOC 82795 :WEIGHT 568175.32377d0 :SENT 5 :SIZE 419 :SCORE 4000099.0d0)
     */
    @LispMethod(comment = "@return a LIST-OF-INDEXES, each indes is of the form\r\n(:RANK 4 :LEN 1 :DOCID \"XIE19960117.0233\" :DOC 82795 :WEIGHT 568175.32377d0 :SENT 5 :SIZE 419 :SCORE 4000099.0d0)")
    public static final SubLObject guruqa_answer_indexes_alt(SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $guruqa_answer_indexes_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$query, query)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return a LIST-OF-INDEXES, each indes is of the form
    (:RANK 4 :LEN 1 :DOCID "XIE19960117.0233" :DOC 82795 :WEIGHT 568175.32377d0 :SENT 5 :SIZE 419 :SCORE 4000099.0d0)
     */
    @LispMethod(comment = "@return a LIST-OF-INDEXES, each indes is of the form\r\n(:RANK 4 :LEN 1 :DOCID \"XIE19960117.0233\" :DOC 82795 :WEIGHT 568175.32377d0 :SENT 5 :SIZE 419 :SCORE 4000099.0d0)")
    public static SubLObject guruqa_answer_indexes(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $guruqa_answer_indexes_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$query, query)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return a ASSOCIATION-LIST  of the form ((token1 . string1) ...)
     */
    @LispMethod(comment = "@return a ASSOCIATION-LIST  of the form ((token1 . string1) ...)")
    public static final SubLObject resporator_alt(SubLObject text, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $resporator_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, text)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return a ASSOCIATION-LIST  of the form ((token1 . string1) ...)
     */
    @LispMethod(comment = "@return a ASSOCIATION-LIST  of the form ((token1 . string1) ...)")
    public static SubLObject resporator(final SubLObject text, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $resporator_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, text)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject resporatorXX_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject lexicon = object.new_class_instance(QUIRK_LEXICON);
            SubLObject typings = NIL;
            methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.quirk.external_interfaces.resporator(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject typing = NIL;
                for (typing = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typing = cdolist_list_var.first()) {
                    if (typing.first().eql(PERSON)) {
                        {
                            SubLObject entity = typing.rest();
                            SubLObject tokens = string_utilities.split_string(entity, UNPROVIDED);
                            SubLObject new_tokens = NIL;
                            SubLObject titleP = NIL;
                            if (NIL == titleP) {
                                {
                                    SubLObject csome_list_var = reverse(tokens);
                                    SubLObject token = NIL;
                                    for (token = csome_list_var.first(); !((NIL != titleP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , token = csome_list_var.first()) {
                                        {
                                            SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, token);
                                            if (NIL != lexes) {
                                                if (NIL == titleP) {
                                                    {
                                                        SubLObject csome_list_var_1 = lexes;
                                                        SubLObject lex = NIL;
                                                        for (lex = csome_list_var_1.first(); !((NIL != titleP) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , lex = csome_list_var_1.first()) {
                                                            if (NIL != isa.isa_in_any_mtP(methods.funcall_instance_method_with_1_args(lex, GET, $DENOT), $$PersonTypeByOccupation)) {
                                                                titleP = T;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == titleP) {
                                                new_tokens = cons(token, new_tokens);
                                            }
                                        }
                                    }
                                }
                            }
                            typings = cons(cons(PERSON, string_utilities.bunge(new_tokens, UNPROVIDED)), typings);
                        }
                    } else {
                        typings = cons(typing, typings);
                    }
                }
            }
            return typings;
        }
    }

    public static SubLObject resporatorXX(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject lexicon = object.new_class_instance(QUIRK_LEXICON);
        SubLObject typings = NIL;
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
        SubLObject cdolist_list_var = resporator(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject typing = NIL;
        typing = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (typing.first().eql(PERSON)) {
                final SubLObject entity = typing.rest();
                final SubLObject tokens = string_utilities.split_string(entity, UNPROVIDED);
                SubLObject new_tokens = NIL;
                SubLObject titleP = NIL;
                if (NIL == titleP) {
                    SubLObject csome_list_var = reverse(tokens);
                    SubLObject token = NIL;
                    token = csome_list_var.first();
                    while ((NIL == titleP) && (NIL != csome_list_var)) {
                        final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, token);
                        if ((NIL != lexes) && (NIL == titleP)) {
                            SubLObject csome_list_var_$1 = lexes;
                            SubLObject lex = NIL;
                            lex = csome_list_var_$1.first();
                            while ((NIL == titleP) && (NIL != csome_list_var_$1)) {
                                if (NIL != isa.isa_in_any_mtP(methods.funcall_instance_method_with_1_args(lex, GET, $DENOT), $$PersonTypeByOccupation)) {
                                    titleP = T;
                                }
                                csome_list_var_$1 = csome_list_var_$1.rest();
                                lex = csome_list_var_$1.first();
                            } 
                        }
                        if (NIL == titleP) {
                            new_tokens = cons(token, new_tokens);
                        }
                        csome_list_var = csome_list_var.rest();
                        token = csome_list_var.first();
                    } 
                }
                typings = cons(cons(PERSON, string_utilities.bunge(new_tokens, UNPROVIDED)), typings);
            } else {
                typings = cons(typing, typings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            typing = cdolist_list_var.first();
        } 
        return typings;
    }

    public static final SubLObject guruqa_retrieve_passage_alt(SubLObject doc, SubLObject sent, SubLObject len, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (len == UNPROVIDED) {
            len = ONE_INTEGER;
        }
        if (path == UNPROVIDED) {
            path = $guruqa_retrieve_passage_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return com.cyc.cycjava.cycl.quirk.external_interfaces.strip_tags(web_utilities.http_retrieve(list(list($$$doc, doc), list($$$start, sent), list($$$length, len)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject guruqa_retrieve_passage(final SubLObject doc, final SubLObject sent, SubLObject len, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (len == UNPROVIDED) {
            len = ONE_INTEGER;
        }
        if (path == UNPROVIDED) {
            path = $guruqa_retrieve_passage_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return strip_tags(web_utilities.http_retrieve(list(list($$$doc, doc), list($$$start, sent), list($$$length, len)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject strip_tags_alt(SubLObject string) {
        return string_utilities.trim_whitespace(string_utilities.remove_substring(string_utilities.remove_substring(string, $str_alt40$_P_), $str_alt41$__P_));
    }

    public static SubLObject strip_tags(final SubLObject string) {
        return string_utilities.trim_whitespace(string_utilities.remove_substring(string_utilities.remove_substring(string, $str40$_P_), $str41$__P_));
    }

    public static final SubLObject guruqa_answer_coordinates_alt(SubLObject v_answer) {
        {
            SubLObject datum = v_answer;
            SubLObject current = datum;
            SubLObject doc_tail = property_list_member($DOC, current);
            SubLObject doc = (NIL != doc_tail) ? ((SubLObject) (cadr(doc_tail))) : NIL;
            SubLObject sent_tail = property_list_member($SENT, current);
            SubLObject sent = (NIL != sent_tail) ? ((SubLObject) (cadr(sent_tail))) : NIL;
            SubLObject len_tail = property_list_member($LEN, current);
            SubLObject len = (NIL != len_tail) ? ((SubLObject) (cadr(len_tail))) : NIL;
            return list(doc, sent, len);
        }
    }

    public static SubLObject guruqa_answer_coordinates(final SubLObject v_answer) {
        final SubLObject doc_tail = property_list_member($DOC, v_answer);
        final SubLObject doc = (NIL != doc_tail) ? cadr(doc_tail) : NIL;
        final SubLObject sent_tail = property_list_member($SENT, v_answer);
        final SubLObject sent = (NIL != sent_tail) ? cadr(sent_tail) : NIL;
        final SubLObject len_tail = property_list_member($LEN, v_answer);
        final SubLObject len = (NIL != len_tail) ? cadr(len_tail) : NIL;
        return list(doc, sent, len);
    }

    public static final SubLObject dependency_parse_alt(SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (npp == UNPROVIDED) {
            npp = $npp_default$.getDynamicValue();
        }
        if (path == UNPROVIDED) {
            path = $dependency_parse_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, substitute(CHAR_space, CHAR_newline, remove(CHAR_return, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), list($$$npp, npp)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject dependency_parse(final SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (npp == UNPROVIDED) {
            npp = $npp_default$.getDynamicValue();
        }
        if (path == UNPROVIDED) {
            path = $dependency_parse_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, substitute(CHAR_space, CHAR_newline, remove(CHAR_return, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), list($$$npp, npp)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject dependency_parse_old_alt(SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (npp == UNPROVIDED) {
            npp = $npp_default$.getDynamicValue();
        }
        if (path == UNPROVIDED) {
            path = $str_alt44$_users_supertagger_old_sexprlda;
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, substitute(CHAR_space, CHAR_newline, remove(CHAR_return, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), list($$$npp, npp)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject dependency_parse_old(final SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (npp == UNPROVIDED) {
            npp = $npp_default$.getDynamicValue();
        }
        if (path == UNPROVIDED) {
            path = $str44$_users_supertagger_old_sexprlda;
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, substitute(CHAR_space, CHAR_newline, remove(CHAR_return, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), list($$$npp, npp)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject shallow_parse_alt(SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $shallow_parse_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return Mapping.mapcar(symbol_function(STRIP_STEMS), com.cyc.cycjava.cycl.quirk.external_interfaces.stem_parse(str, path, host, port, method));
    }

    public static SubLObject shallow_parse(final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $shallow_parse_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return Mapping.mapcar(symbol_function(STRIP_STEMS), stem_parse(str, path, host, port, method));
    }

    public static final SubLObject strip_stems_alt(SubLObject parse) {
        return parse.isCons() ? ((SubLObject) (parse.first() == $ROOT ? ((SubLObject) (cadr(parse))) : Mapping.mapcar(symbol_function(STRIP_STEMS), parse))) : parse;
    }

    public static SubLObject strip_stems(final SubLObject parse) {
        return parse.isCons() ? parse.first() == $ROOT ? cadr(parse) : Mapping.mapcar(symbol_function(STRIP_STEMS), parse) : parse;
    }

    public static final SubLObject stem_parse_alt(SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $shallow_parse_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return remove($list_alt47, read_from_string(web_utilities.http_retrieve(list(list($$$text, str)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject stem_parse(final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $shallow_parse_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return remove($list47, read_from_string(web_utilities.http_retrieve(list(list($$$text, str)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject run_talent_alt(SubLObject ini, SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $talent_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return web_utilities.http_retrieve(list(list($$$ini, ini), list($$$text, str)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_talent(final SubLObject ini, final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = $talent_path$.getDynamicValue();
        }
        if (host == UNPROVIDED) {
            host = $quirk_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $quirk_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return web_utilities.http_retrieve(list(list($$$ini, ini), list($$$text, str)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject dict_connection_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sdbc.sql_open_connection_p($dict_conn$.getDynamicValue(thread))) {
                {
                    SubLObject connection = sdbc.new_sql_connection($dict_db$.getDynamicValue(thread), $dict_db_user$.getDynamicValue(thread), $dict_db_passwd$.getDynamicValue(thread), list($DBMS_SERVER, $dict_host$.getDynamicValue(thread), $PORT, $int$9999, $SUBPROTOCOL, $$$postgresql));
                    if (NIL != sdbc.sdbc_error_p(connection)) {
                        sdbc.sdbc_error_throw(connection);
                    }
                    $dict_conn$.setDynamicValue(connection, thread);
                }
            }
            return $dict_conn$.getDynamicValue(thread);
        }
    }

    public static SubLObject dict_connection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sdbc.sql_open_connection_p($dict_conn$.getDynamicValue(thread))) {
            final SubLObject connection = sdbc.new_sql_connection($dict_db$.getDynamicValue(thread), $dict_db_user$.getDynamicValue(thread), $dict_db_passwd$.getDynamicValue(thread), list($DBMS_SERVER, $dict_host$.getDynamicValue(thread), $PORT, $int$9999, $SUBPROTOCOL, $$$postgresql));
            if (NIL != sdbc.sdbc_error_p(connection)) {
                sdbc.sdbc_error_throw(connection);
            }
            $dict_conn$.setDynamicValue(connection, thread);
        }
        return $dict_conn$.getDynamicValue(thread);
    }

    public static final SubLObject dict_statement_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sdbc.sql_open_statement_p($dict_stmt$.getDynamicValue(thread))) {
                {
                    SubLObject statement = sdbc.sqlc_create_statement(com.cyc.cycjava.cycl.quirk.external_interfaces.dict_connection());
                    if (NIL != sdbc.sdbc_error_p(statement)) {
                        sdbc.sdbc_error_throw(statement);
                    }
                    $dict_stmt$.setDynamicValue(statement, thread);
                }
            }
            return $dict_stmt$.getDynamicValue(thread);
        }
    }

    public static SubLObject dict_statement() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sdbc.sql_open_statement_p($dict_stmt$.getDynamicValue(thread))) {
            final SubLObject statement = sdbc.sqlc_create_statement(dict_connection());
            if (NIL != sdbc.sdbc_error_p(statement)) {
                sdbc.sdbc_error_throw(statement);
            }
            $dict_stmt$.setDynamicValue(statement, thread);
        }
        return $dict_stmt$.getDynamicValue(thread);
    }

    public static final SubLObject guruqa_indexed_string_entry_alt(SubLObject str) {
        return sdbc.sqls_execute_query(com.cyc.cycjava.cycl.quirk.external_interfaces.dict_statement(), format(NIL, $str_alt58$select_occurrences__documents__te, string_utilities.string_substitute($str_alt59$__, $str_alt60$_, str, UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject guruqa_indexed_string_entry(final SubLObject str) {
        return sdbc.sqls_execute_query(dict_statement(), format(NIL, $str58$select_occurrences__documents__te, string_utilities.string_substitute($str59$__, $str60$_, str, UNPROVIDED)), UNPROVIDED);
    }

    /**
     *
     *
     * @param CORPUS
     * 		stringp; the symbolic name of the corpus
     * @return stringp; the fully qualified path to the appropriate parameter file for CORPUS
     */
    @LispMethod(comment = "@param CORPUS\r\n\t\tstringp; the symbolic name of the corpus\r\n@return stringp; the fully qualified path to the appropriate parameter file for CORPUS")
    public static final SubLObject get_word_graph_path_alt(SubLObject corpus) {
        {
            SubLObject path = assoc(corpus, methods.funcall_class_method_with_0_args(LEMUR_QUERY, GET_CORPUS_PATH_MAPPING), EQUALP, UNPROVIDED).rest();
            if (NIL == path) {
                Errors.error($str_alt63$Unsupported_corpus__a, corpus);
            }
            return path;
        }
    }

    /**
     *
     *
     * @param CORPUS
     * 		stringp; the symbolic name of the corpus
     * @return stringp; the fully qualified path to the appropriate parameter file for CORPUS
     */
    @LispMethod(comment = "@param CORPUS\r\n\t\tstringp; the symbolic name of the corpus\r\n@return stringp; the fully qualified path to the appropriate parameter file for CORPUS")
    public static SubLObject get_word_graph_path(final SubLObject corpus) {
        final SubLObject path = assoc(corpus, methods.funcall_class_method_with_0_args(LEMUR_QUERY, GET_CORPUS_PATH_MAPPING), EQUALP, UNPROVIDED).rest();
        if (NIL == path) {
            Errors.error($str63$Unsupported_corpus__a, corpus);
        }
        return path;
    }

    public static final SubLObject get_word_graph_alt(SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt64$_inesgraph_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        SubLTrampolineFile.checkType(query, LISTP);
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, format(NIL, $str_alt66$___A_____, query)), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_word_graph(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str64$_inesgraph_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        assert NIL != listp(query) : "! listp(query) " + ("Types.listp(query) " + "CommonSymbols.NIL != Types.listp(query) ") + query;
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, format(NIL, $str66$___A_____, query)), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown list of property lists of the form
    ((:TEXT "*FIRST* French *WOMAN* *ASTRONAUT* Sent into *SPACE*"
    :DOCID "XIE19960817.0048.0"
    :SCORE 0.0128162d0
    :AUGMENT ("flight" "astronauts" "first" "woman" "russian" "space" "shuttle")
    )
    ... )
     */
    @LispMethod(comment = "@unknown list of property lists of the form\r\n((:TEXT \"*FIRST* French *WOMAN* *ASTRONAUT* Sent into *SPACE*\"\r\n:DOCID \"XIE19960817.0048.0\"\r\n:SCORE 0.0128162d0\r\n:AUGMENT (\"flight\" \"astronauts\" \"first\" \"woman\" \"russian\" \"space\" \"shuttle\")\r\n)\r\n... )")
    public static final SubLObject ask_qaga_alt(SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt67$_qaga_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        SubLTrampolineFile.checkType(query, LISTP);
        return read_from_string(web_utilities.http_retrieve(list(list($$$query, format(NIL, $str_alt66$___A_____, query))), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown list of property lists of the form
    ((:TEXT "*FIRST* French *WOMAN* *ASTRONAUT* Sent into *SPACE*"
    :DOCID "XIE19960817.0048.0"
    :SCORE 0.0128162d0
    :AUGMENT ("flight" "astronauts" "first" "woman" "russian" "space" "shuttle")
    )
    ... )
     */
    @LispMethod(comment = "@unknown list of property lists of the form\r\n((:TEXT \"*FIRST* French *WOMAN* *ASTRONAUT* Sent into *SPACE*\"\r\n:DOCID \"XIE19960817.0048.0\"\r\n:SCORE 0.0128162d0\r\n:AUGMENT (\"flight\" \"astronauts\" \"first\" \"woman\" \"russian\" \"space\" \"shuttle\")\r\n)\r\n... )")
    public static SubLObject ask_qaga(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str67$_qaga_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        assert NIL != listp(query) : "! listp(query) " + ("Types.listp(query) " + "CommonSymbols.NIL != Types.listp(query) ") + query;
        return read_from_string(web_utilities.http_retrieve(list(list($$$query, format(NIL, $str66$___A_____, query))), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject applepie_parse_alt(SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt68$_applepie_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, query)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject applepie_parse(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str68$_applepie_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, query)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject minipar_parse_alt(SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt69$_minipar_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, query)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject minipar_parse(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str69$_minipar_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, query)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ask_bash_alt(SubLObject command, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt70$_bash_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return web_utilities.http_retrieve(list(list($$$command, command)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ask_bash(final SubLObject command, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str70$_bash_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return web_utilities.http_retrieve(list(list($$$command, command)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return positive-integer-p; the meaning of DATESTRING in extended-universal-date format, or
    nil if DATESTRING can't be parsed to a date. The parameters YEAR, MONTH, DAY, HOUR, MINUTE
    and SECOND will overwrite the values of these parameters in DATESTRING
     */
    @LispMethod(comment = "@return positive-integer-p; the meaning of DATESTRING in extended-universal-date format, or\r\nnil if DATESTRING can\'t be parsed to a date. The parameters YEAR, MONTH, DAY, HOUR, MINUTE\r\nand SECOND will overwrite the values of these parameters in DATESTRING")
    public static final SubLObject parse_date_alt(SubLObject datestring, SubLObject year, SubLObject month, SubLObject day, SubLObject hour, SubLObject minute, SubLObject second, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options) {
        if (year == UNPROVIDED) {
            year = $str_alt50$;
        }
        if (month == UNPROVIDED) {
            month = $str_alt50$;
        }
        if (day == UNPROVIDED) {
            day = $str_alt50$;
        }
        if (hour == UNPROVIDED) {
            hour = $str_alt50$;
        }
        if (minute == UNPROVIDED) {
            minute = $str_alt50$;
        }
        if (second == UNPROVIDED) {
            second = $str_alt50$;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt72$_parse_date_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (cgi_method == UNPROVIDED) {
            cgi_method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(listS(list($$$datestring, datestring), new SubLObject[]{ list($$$year, year), list($$$month, month), list($$$day, day), list($$$hour, hour), list($$$minute, minute), list($$$second, second), append(options, NIL) }), path, host, port, cgi_method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return positive-integer-p; the meaning of DATESTRING in extended-universal-date format, or
    nil if DATESTRING can't be parsed to a date. The parameters YEAR, MONTH, DAY, HOUR, MINUTE
    and SECOND will overwrite the values of these parameters in DATESTRING
     */
    @LispMethod(comment = "@return positive-integer-p; the meaning of DATESTRING in extended-universal-date format, or\r\nnil if DATESTRING can\'t be parsed to a date. The parameters YEAR, MONTH, DAY, HOUR, MINUTE\r\nand SECOND will overwrite the values of these parameters in DATESTRING")
    public static SubLObject parse_date(final SubLObject datestring, SubLObject year, SubLObject month, SubLObject day, SubLObject hour, SubLObject minute, SubLObject second, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options) {
        if (year == UNPROVIDED) {
            year = $str50$;
        }
        if (month == UNPROVIDED) {
            month = $str50$;
        }
        if (day == UNPROVIDED) {
            day = $str50$;
        }
        if (hour == UNPROVIDED) {
            hour = $str50$;
        }
        if (minute == UNPROVIDED) {
            minute = $str50$;
        }
        if (second == UNPROVIDED) {
            second = $str50$;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str72$_parse_date_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (cgi_method == UNPROVIDED) {
            cgi_method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(listS(list($$$datestring, datestring), new SubLObject[]{ list($$$year, year), list($$$month, month), list($$$day, day), list($$$hour, hour), list($$$minute, minute), list($$$second, second), append(options, NIL) }), path, host, port, cgi_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ask_qack_alt(SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject options) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt80$_qack_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, query), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ask_qack(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject options) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str80$_qack_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, query), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject invoke_wordnet_alt(SubLObject params, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt81$_wordnet_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (cgi_method == UNPROVIDED) {
            cgi_method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(params, path, host, port, cgi_method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject invoke_wordnet(final SubLObject params, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str81$_wordnet_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (cgi_method == UNPROVIDED) {
            cgi_method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(params, path, host, port, cgi_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject glimpse_passages_for_query_alt(SubLObject query) {
        {
            SubLObject res = NIL;
            SubLObject cdolist_list_var = search_engine.ask_glimpse(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject ans = NIL;
            for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                {
                    SubLObject datum = ans;
                    SubLObject current = datum;
                    SubLObject text_tail = property_list_member($TEXT, current);
                    SubLObject text = (NIL != text_tail) ? ((SubLObject) (cadr(text_tail))) : NIL;
                    res = cons(text, res);
                }
            }
            return res;
        }
    }

    public static SubLObject glimpse_passages_for_query(final SubLObject query) {
        SubLObject res = NIL;
        SubLObject cdolist_list_var = search_engine.ask_glimpse(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        ans = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = ans;
            final SubLObject text_tail = property_list_member($TEXT, current);
            final SubLObject text = (NIL != text_tail) ? cadr(text_tail) : NIL;
            res = cons(text, res);
            cdolist_list_var = cdolist_list_var.rest();
            ans = cdolist_list_var.first();
        } 
        return res;
    }

    /**
     *
     *
     * @param QUERY
     * 		is a google query string
     * @return a list of questions
     */
    @LispMethod(comment = "@param QUERY\r\n\t\tis a google query string\r\n@return a list of questions")
    public static final SubLObject web_mine_questions_alt(SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == UNPROVIDED) {
            options = $list_alt83;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt84$_questions_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, query), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param QUERY
     * 		is a google query string
     * @return a list of questions
     */
    @LispMethod(comment = "@param QUERY\r\n\t\tis a google query string\r\n@return a list of questions")
    public static SubLObject web_mine_questions(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == UNPROVIDED) {
            options = $list83;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str84$_questions_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, query), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_cyc_images_alt(SubLObject servers, SubLObject user, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (servers == UNPROVIDED) {
            servers = $list_alt85;
        }
        if (user == UNPROVIDED) {
            user = $$$Guest;
        }
        if (path == UNPROVIDED) {
            path = $str_alt87$_cgi_bin_users_mahler_check_cyc_s;
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$servers, format(NIL, $str_alt66$___A_____, servers)), list(USER, user)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cyc_images(SubLObject servers, SubLObject user, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (servers == UNPROVIDED) {
            servers = $list85;
        }
        if (user == UNPROVIDED) {
            user = $$$Guest;
        }
        if (path == UNPROVIDED) {
            path = $str87$_cgi_bin_users_mahler_check_cyc_s;
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(list(list($$$servers, format(NIL, $str66$___A_____, servers)), list(USER, user)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_corpus_count_probability_alt(SubLObject corpus_db_path, SubLObject word, SubLObject part_of_speech, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt90$_corpus_frequency_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        SubLTrampolineFile.checkType(corpus_db_path, STRINGP);
        SubLTrampolineFile.checkType(word, STRINGP);
        SubLTrampolineFile.checkType(part_of_speech, STRINGP);
        {
            SubLObject query = list(list($$$dbfile, corpus_db_path), list($$$word, word), list($$$pos, part_of_speech));
            return web_utilities.http_retrieve(query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject get_corpus_count_probability(final SubLObject corpus_db_path, final SubLObject word, final SubLObject part_of_speech, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str90$_corpus_frequency_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        assert NIL != stringp(corpus_db_path) : "! stringp(corpus_db_path) " + ("Types.stringp(corpus_db_path) " + "CommonSymbols.NIL != Types.stringp(corpus_db_path) ") + corpus_db_path;
        assert NIL != stringp(word) : "! stringp(word) " + ("Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) ") + word;
        assert NIL != stringp(part_of_speech) : "! stringp(part_of_speech) " + ("Types.stringp(part_of_speech) " + "CommonSymbols.NIL != Types.stringp(part_of_speech) ") + part_of_speech;
        final SubLObject query = list(list($$$dbfile, corpus_db_path), list($$$word, word), list($$$pos, part_of_speech));
        return web_utilities.http_retrieve(query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns 3 lists: working services, non-working services and timed out services
     */
    @LispMethod(comment = "returns 3 lists: working services, non-working services and timed out services")
    public static final SubLObject services_report_alt(SubLObject services) {
        if (services == UNPROVIDED) {
            services = $all_external_services$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(services, LISTP);
            {
                SubLObject services_up = NIL;
                SubLObject services_down = NIL;
                SubLObject services_timed_out = NIL;
                SubLObject timed_outP = NIL;
                SubLObject error = NIL;
                SubLObject cdolist_list_var = services;
                SubLObject service = NIL;
                for (service = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , service = cdolist_list_var.first()) {
                    {
                        SubLObject call = service.first();
                        SubLObject result = service.rest();
                        timed_outP = NIL;
                        {
                            SubLObject tag = with_timeout_make_tag();
                            try {
                                {
                                    SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                                    try {
                                        $within_with_timeout$.bind(T, thread);
                                        {
                                            SubLObject timer = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                    try {
                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer = with_timeout_start_timer($int$30, tag);
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_3 = Errors.$error_handler$.currentBinding(thread);
                                                                try {
                                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                    try {
                                                                        if (eval(call).equal(result)) {
                                                                            services_up = cons(service.first().first(), services_up);
                                                                        } else {
                                                                            services_down = cons(service.first().first(), services_down);
                                                                        }
                                                                    } catch (Throwable catch_var) {
                                                                        Errors.handleThrowable(catch_var, NIL);
                                                                    }
                                                                } finally {
                                                                    Errors.$error_handler$.rebind(_prev_bind_0_3, thread);
                                                                }
                                                            }
                                                        } catch (Throwable ccatch_env_var) {
                                                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                        }
                                                        if (NIL != error) {
                                                            services_down = cons(service.first().first(), services_down);
                                                            Errors.warn(error);
                                                        }
                                                    } finally {
                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        with_timeout_stop_timer(timer);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        $within_with_timeout$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                        }
                        if (NIL != timed_outP) {
                            services_timed_out = cons(service.first().first(), services_timed_out);
                        }
                    }
                }
                return values(services_up, services_down, services_timed_out);
            }
        }
    }

    /**
     * returns 3 lists: working services, non-working services and timed out services
     */
    @LispMethod(comment = "returns 3 lists: working services, non-working services and timed out services")
    public static SubLObject services_report(SubLObject services) {
        if (services == UNPROVIDED) {
            services = $all_external_services$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(services) : "! listp(services) " + ("Types.listp(services) " + "CommonSymbols.NIL != Types.listp(services) ") + services;
        SubLObject services_up = NIL;
        SubLObject services_down = NIL;
        SubLObject services_timed_out = NIL;
        SubLObject timed_outP = NIL;
        SubLObject error = NIL;
        SubLObject cdolist_list_var = services;
        SubLObject service = NIL;
        service = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject call = service.first();
            final SubLObject result = service.rest();
            timed_outP = NIL;
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$2 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer($int$30, tag);
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (eval(call).equal(result)) {
                                            services_up = cons(service.first().first(), services_up);
                                        } else {
                                            services_down = cons(service.first().first(), services_down);
                                        }
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != error) {
                                services_down = cons(service.first().first(), services_down);
                                Errors.warn(error);
                            }
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                timed_outP = Errors.handleThrowable(ccatch_env_var2, tag);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != timed_outP) {
                services_timed_out = cons(service.first().first(), services_timed_out);
            }
            cdolist_list_var = cdolist_list_var.rest();
            service = cdolist_list_var.first();
        } 
        return values(services_up, services_down, services_timed_out);
    }

    public static SubLObject declare_external_interfaces_file() {
        declareFunction("get_guruqa_wizard", "GET-GURUQA-WIZARD", 0, 0, false);
        declareFunction("compute_guruqa_query", "COMPUTE-GURUQA-QUERY", 1, 0, false);
        declareFunction("secretarize_cycl", "SECRETARIZE-CYCL", 3, 1, false);
        declareFunction("guruqa_passages_for_cycl", "GURUQA-PASSAGES-FOR-CYCL", 2, 1, false);
        declareFunction("guruqa_passages_for_query", "GURUQA-PASSAGES-FOR-QUERY", 1, 0, false);
        declareFunction("guruqa_answer_indexes", "GURUQA-ANSWER-INDEXES", 1, 4, false);
        declareFunction("resporator", "RESPORATOR", 1, 4, false);
        declareFunction("resporatorXX", "RESPORATOR++", 1, 0, false);
        declareFunction("guruqa_retrieve_passage", "GURUQA-RETRIEVE-PASSAGE", 2, 5, false);
        declareFunction("strip_tags", "STRIP-TAGS", 1, 0, false);
        declareFunction("guruqa_answer_coordinates", "GURUQA-ANSWER-COORDINATES", 1, 0, false);
        declareFunction("dependency_parse", "DEPENDENCY-PARSE", 1, 5, false);
        declareFunction("dependency_parse_old", "DEPENDENCY-PARSE-OLD", 1, 5, false);
        declareFunction("shallow_parse", "SHALLOW-PARSE", 1, 4, false);
        declareFunction("strip_stems", "STRIP-STEMS", 1, 0, false);
        declareFunction("stem_parse", "STEM-PARSE", 1, 4, false);
        declareFunction("run_talent", "RUN-TALENT", 2, 4, false);
        declareFunction("dict_connection", "DICT-CONNECTION", 0, 0, false);
        declareFunction("dict_statement", "DICT-STATEMENT", 0, 0, false);
        declareFunction("guruqa_indexed_string_entry", "GURUQA-INDEXED-STRING-ENTRY", 1, 0, false);
        declareFunction("get_word_graph_path", "GET-WORD-GRAPH-PATH", 1, 0, false);
        declareFunction("get_word_graph", "GET-WORD-GRAPH", 1, 5, false);
        declareFunction("ask_qaga", "ASK-QAGA", 1, 4, false);
        declareFunction("applepie_parse", "APPLEPIE-PARSE", 1, 4, false);
        declareFunction("minipar_parse", "MINIPAR-PARSE", 1, 4, false);
        declareFunction("ask_bash", "ASK-BASH", 1, 4, false);
        declareFunction("parse_date", "PARSE-DATE", 1, 11, false);
        declareFunction("ask_qack", "ASK-QACK", 1, 5, false);
        declareFunction("invoke_wordnet", "INVOKE-WORDNET", 1, 5, false);
        declareFunction("glimpse_passages_for_query", "GLIMPSE-PASSAGES-FOR-QUERY", 1, 0, false);
        declareFunction("web_mine_questions", "WEB-MINE-QUESTIONS", 1, 5, false);
        declareFunction("get_cyc_images", "GET-CYC-IMAGES", 0, 6, false);
        declareFunction("get_corpus_count_probability", "GET-CORPUS-COUNT-PROBABILITY", 3, 4, false);
        declareFunction("services_report", "SERVICES-REPORT", 0, 1, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$mongo_cyc_com = makeString("mongo.cyc.com");

    static private final SubLString $str_alt2$_users_textract_showtalent = makeString("/users/textract/showtalent");

    public static SubLObject init_external_interfaces_file() {
        defparameter("*QUIRK-HOST*", $str0$mongo_cyc_com);
        defparameter("*QUIRK-PORT*", $int$8080);
        defparameter("*TALENT-PATH*", $str2$_users_textract_showtalent);
        defparameter("*NPP-DEFAULT*", ZERO_INTEGER);
        defparameter("*SHALLOW-PARSE-PATH*", $str3$_users_textract_sexpr_shallow);
        defparameter("*DEPENDENCY-PARSE-PATH*", $str4$_users_supertagger_sexprlda);
        defparameter("*GURUQA-RETRIEVE-PASSAGE-PATH*", $str5$_users_textract_documentWindow);
        defparameter("*GURUQA-ANSWER-INDEXES-PATH*", $str6$_users_textract_guruqaIds);
        defparameter("*RESPORATOR-PATH*", $str7$_users_textract_sexprresporator);
        defparameter("*GURUQA-WIZARD*", NIL);
        defparameter("*DICT-DB-USER*", $$$mahler);
        defparameter("*DICT-DB-PASSWD*", $str50$);
        defparameter("*DICT-DB*", $$$dict2);
        defparameter("*DICT-HOST*", $$$elmore);
        defparameter("*DICT-CONN*", NIL);
        defparameter("*DICT-STMT*", NIL);
        defparameter("*ALL-EXTERNAL-SERVICES*", $list94);
        return NIL;
    }

    static private final SubLString $str_alt3$_users_textract_sexpr_shallow = makeString("/users/textract/sexpr-shallow");

    static private final SubLString $str_alt4$_users_supertagger_sexprlda = makeString("/users/supertagger/sexprlda");

    static private final SubLString $str_alt5$_users_textract_documentWindow = makeString("/users/textract/documentWindow");

    static private final SubLString $str_alt6$_users_textract_guruqaIds = makeString("/users/textract/guruqaIds");

    static private final SubLString $str_alt7$_users_textract_sexprresporator = makeString("/users/textract/sexprresporator");

    static private final SubLString $str_alt11$__mt___A = makeString("~&mt: ~A");

    static private final SubLString $str_alt12$__wiz___A = makeString("~&wiz: ~A");

    static private final SubLString $str_alt13$__cyc_expr___S_of_type__S = makeString("~&cyc-expr: ~S of type ~S");

    public static SubLObject setup_external_interfaces_file() {
        return NIL;
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_94_initializer_alt() {
        return list(new SubLObject[]{ list(list(makeSymbol("CHARNIAK-PARSE"), makeString("The cat sat on the mat.")), list(makeKeyword("S1"), list(makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("The")), list(makeKeyword("NN"), makeString("cat"))), list(makeKeyword("VP"), list(makeKeyword("VBD"), makeString("sat")), list(makeKeyword("PP"), list(makeKeyword("IN"), makeString("on")), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("the")), list(makeKeyword("NN"), makeString("mat"))))), list(makeKeyword("."), makeString("."))))), list(list(makeSymbol("STANFORD-PARSE"), makeString("The cat sat on the mat.")), makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("The")), list(makeKeyword("NN"), makeString("cat"))), list(makeKeyword("VP"), list(makeKeyword("VBD"), makeString("sat")), list(makeKeyword("PP"), list(makeKeyword("IN"), makeString("on")), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("the")), list(makeKeyword("NN"), makeString("mat"))))), list(makeKeyword("."), makeString("."))), list(list(makeSymbol("DEPENDENCY-PARSE"), makeString("The cat sat on the mat.")), list(new SubLObject[]{ $WORD, makeString("sat"), makeKeyword("TAG"), makeString("A_nx0Vpx1"), makeKeyword("INDEX"), TWO_INTEGER, $ARGS, list(list(new SubLObject[]{ $WORD, makeString("cat"), makeKeyword("TAG"), makeString("A_NXN"), makeKeyword("INDEX"), ONE_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), list(list(new SubLObject[]{ $WORD, makeString("The"), makeKeyword("TAG"), makeString("B_Dnx"), makeKeyword("INDEX"), ZERO_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), NIL })) }), list(new SubLObject[]{ $WORD, makeString("on"), makeKeyword("TAG"), makeString("A_PXPnx"), makeKeyword("INDEX"), THREE_INTEGER, $ARGS, list(list(new SubLObject[]{ $WORD, makeString("mat."), makeKeyword("TAG"), makeString("A_NXN"), makeKeyword("INDEX"), FIVE_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), list(list(new SubLObject[]{ $WORD, makeString("the"), makeKeyword("TAG"), makeString("B_Dnx"), makeKeyword("INDEX"), FOUR_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), NIL })) })), makeKeyword("MODIFIERS"), NIL })), makeKeyword("MODIFIERS"), NIL })), list(list(makeSymbol("STEM-PARSE"), makeString("The cat sat on the mat.")), list(makeKeyword("S1"), list(makeKeyword("SUB"), list(makeKeyword("NP"), list(makeKeyword("DT"), list($ROOT, makeString("The"), makeString("the"))), list(makeKeyword("NN"), list($ROOT, makeString("cat"), makeString("cat"))))), list(makeKeyword("VG"), list(makeKeyword("VBD"), list($ROOT, makeString("sat"), makeString("sit")))), list(makeKeyword("PP"), list(makeKeyword("IN"), list($ROOT, makeString("on"), makeString("on"))), list(makeKeyword("NP"), list(makeKeyword("DT"), list($ROOT, makeString("the"), makeString("the"))), list(makeKeyword("NN"), list($ROOT, makeString("mat"), makeString("mat"))))), list(makeKeyword("."), makeString(".")))), list(list(makeSymbol("GURUQA-ANSWER-INDEXES"), makeString("Udine")), list(new SubLObject[]{ $RANK, ONE_INTEGER, makeKeyword("LEN"), ONE_INTEGER, makeKeyword("DOCID"), makeString("NA.18541"), makeKeyword("DOC"), makeInteger(33671), makeKeyword("WEIGHT"), makeDouble(0.155536824074), $SENT, makeInteger(21), $SIZE, makeInteger(227), makeKeyword("SCORE"), makeDouble(1.0) })), cons(list(makeSymbol("GURUQA-RETRIEVE-PASSAGE"), makeInteger(33671), makeInteger(21)), makeString("A prior Italian Senate\ninvestigation report states that in 1989 a steel company in Udine that had\n$70 million worth of contracts with Iraq was referred by BNL Rome to seek\nfinancing from BNL Atlanta, where it obtained credit. \n")), list(new SubLObject[]{ list(makeSymbol("ASK-LEMUR"), makeString("Jawien")), list(makeString("NYT19990128.0498.29"), makeDouble(19.979052515738), makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication.")), list(makeString("NYT19990128.0498.1"), ZERO_INTEGER, makeString("Jerzy Turowicz, who skirmished with communist censors for nearly four decades to produce a Polish Catholic weekly that became widely known as ``the only free newspaper from Berlin to Vladivostok,'' died on Wednesday in Krakow, Poland.")), list(makeString("NYT19990128.0498.2"), ZERO_INTEGER, makeString("He was 86 and had suffered a heart attack.")), list(makeString("NYT19990128.0498.3"), ZERO_INTEGER, makeString("News of Turowicz's death was brought to Pope John Paul II while he was about to celebrate Mass in St. Louis.")), list(makeString("NYT19990128.0498.4"), ZERO_INTEGER, makeString("He then prayed for the soul of the man who had been described as his closest friend at the time of his election to the papacy in 1978.")), list(makeString("NYT19990128.0498.5"), ZERO_INTEGER, makeString("In the years after communism fell in their native Poland in 1989, they differed over issues like abortion, but their friendship went back to a time when Turowicz published the pope's poems and essays while he was still Karol Wojtyla, a priest from Krakow.")), list(makeString("NYT19990128.0498.6"), ZERO_INTEGER, makeString("The death was front-page news all over Poland, and Thursday's issues of Gazeta Wyborcza, a Warsaw daily, devoted eight pages to Turowicz, including a poem about him by Czeslaw Milosz, the 1980 Nobel laureate in literature.")), list(makeString("NYT19990128.0498.7"), ZERO_INTEGER, makeString("In an editorial, the paper said Turowicz ``was the moral authority of several generations of Polish intellectuals; a wonderful essayist and a rational commentator on everything.''")), list(makeString("NYT19990128.0498.8"), ZERO_INTEGER, makeString("Referring to his Krakow-based publication, whose name means The Universal Weekly, the editorial added, ``For more than a half century he established Tygodnik Powszechny as an achievement without precedent in the annals of Polish culture, an achievement that for many years provided the only light in the dark Polish tunnel.``")), list(makeString("NYT19990128.0498.9"), ZERO_INTEGER, makeString("The magazine was founded in 1945, sponsored by Adam Sapieha, who was then Archbishop of Krakow.")) }), list(list(makeSymbol("RESPORATOR"), makeString("The cat sat on the mat.")), cons(makeSymbol("THING"), makeString("cat")), cons(makeSymbol("VEHICLE"), makeString("cat")), cons(makeSymbol("THING"), makeString("mat"))), list(new SubLObject[]{ list(makeSymbol("GET-WORD-GRAPH"), list(QUOTE, list(makeString("Jawien")))), list(makeString("forced"), makeString("write")), list(makeString("gazeta"), makeString("eight")), list(makeString("heart"), makeString("86")), list(makeString("never"), makeString("forced"), makeString("think")), list(makeString("decades"), makeString("died"), makeString("skirmished"), makeString("four")), list(makeString("featured"), makeString("stringent")), list(makeString("enraging"), makeString("direct"), makeString("independence")), list(makeString("aroused"), makeString("trouble")), list(makeString("issues"), makeString("including"), makeString("1989"), makeString("nobel")), list(makeString("differed"), makeString("went"), makeString("wojtyla"), makeString("poems"), makeString("priest"), makeString("abortion")), list(makeString("including"), makeString("news"), makeString("word")), list(makeString("stalin"), makeString("three"), makeString("soviet"), makeString("perhaps")), list(makeString("sapieha"), makeString("archbishop")), list(makeString("perhaps"), makeString("ordered"), makeString("1953"), makeString("despot"), makeString("boldest"), makeString("act")), list(makeString("news"), makeString("death"), makeString("paul")), list(makeString("poet"), makeString("origins")), list(makeString("everything"), makeString("free"), makeString("1986")), list(makeString("polish"), makeString("weekly")), list(new SubLObject[]{ makeString("elsewhere"), makeString("1951"), makeString("semitic"), makeString("1968"), makeString("antoni"), makeString("jewish"), makeString("editor"), makeString("mounted"), makeString("government") }), list(makeString("perspective"), makeString("believe"), makeString("reader"), makeString("newspaper")), list(makeString("abortion"), makeString("native"), makeString("karol")), list(makeString("years"), makeString("1945"), makeString("krakow")), list(makeString("control"), makeString("took"), makeString("moved"), makeString("enraging")), list(makeString("intellectuals"), makeString("wonderful"), makeString("generations")), list(makeString("editorial"), makeString("polish"), makeString("annals"), makeString("weekly"), makeString("culture")), list(makeString("stringent"), makeString("less")), list(makeString("east"), makeString("great")), list(makeString("word"), makeString("removed"), makeString("dashes"), makeString("something"), makeString("instituted"), makeString("show")), list(makeString("soviet"), makeString("three")), list(makeString("antoni"), makeString("figure")), list(makeString("collaborating"), makeString("turned")), list(makeString("leaders"), makeString("elsewhere"), makeString("deal"), makeString("bloc"), makeString("articles"), makeString("publishing")), list(makeString("publication"), makeString("use")), list(makeString("publish"), makeString("party"), makeString("occurred")), list(makeString("figure"), makeString("poet"), makeString("contributing"), makeString("instance"), makeString("anti"), makeString("invited"), makeString("number")), list(makeString("established"), makeString("light")), list(makeString("periods"), makeString("censorship")), list(makeString("tell"), makeString("same")), list(makeString("paper"), makeString("taken"), makeString("catholic")), list(makeString("ways"), makeString("aroused"), makeString("found"), makeString("sensitized"), makeString("conspiratorially")), list(makeString("1945"), makeString("adam"), makeString("founded")), list(makeString("despot"), makeString("publish")), list(makeString("pax"), makeString("refused")), list(makeString("daily"), makeString("warsaw"), makeString("laureate"), makeString("pages"), makeString("literature"), makeString("wyborcza")), list(makeString("publishing"), makeString("religion"), makeString("politics")), list(makeString("skirmished"), makeString("jerzy")), list(makeString("pages"), makeString("1980")), list(makeString("editor"), makeString("1951"), makeString("church")), list(makeString("literature"), makeString("poem"), makeString("devoted"), makeString("thursday")), list(makeString("newspaper"), makeString("known")), list(makeString("essayist"), makeString("everything"), makeString("moral"), makeString("editorial")), list(makeString("poems"), makeString("election"), makeString("time")), list(makeString("election"), makeString("closest")), list(makeString("jerzy"), makeString("nearly"), makeString("became"), makeString("vladivostok")), list(makeString("1986"), makeString("never"), makeString("free")), list(makeString("mass"), makeString("ii"), makeString("celebrate")), list(makeString("times"), makeString("censors"), makeString("articles"), makeString("leaders"), makeString("poles")), list(makeString("turowicz"), makeString("suffered"), makeString("pope")), list(makeString("added"), makeString("powszechny")), list(makeString("1989"), makeString("differed"), makeString("nobel")), list(makeString("troops"), makeString("led"), makeString("suppressed")), list(makeString("practice"), makeString("readers")), list(makeString("church"), makeString("communist"), makeString("officials")), list(makeString("invited"), makeString("scale")), list(makeString("communists"), makeString("collaborating")), list(makeString("eight"), makeString("front")), list(makeString("paul"), makeString("john")), list(makeString("leadership"), makeString("krakow"), makeString("years")), list(makeString("known"), makeString("issues"), makeString("poland")), list(makeString("krakow"), makeString("1945")), list(makeString("rational"), makeString("intellectuals")), list(makeString("prayed"), makeString("man")), list(makeString("adam"), makeString("sponsored"), makeString("sapieha")), list(makeString("catholic"), makeString("wednesday")), list(makeString("semitic"), makeString("shunned")), list(makeString("1951"), makeString("stalin"), makeString("control"), makeString("officials"), makeString("church")), list(makeString("wednesday"), makeString("decades")), list(makeString("taken"), makeString("wednesday"), makeString("called"), makeString("catholic")), list(makeString("moral"), makeString("everything"), makeString("1986"), makeString("authority"), makeString("annals"), makeString("editorial")), list(makeString("poland"), makeString("issues"), makeString("turowicz"), makeString("pope")), list(makeString("trouble"), makeString("things")), list(makeString("little"), makeString("perspective"), makeString("ways"), makeString("leaders"), makeString("times"), makeString("poles")), list(makeString("front"), makeString("page")), list(makeString("instituted"), makeString("practice")), list(makeString("time"), makeString("election")), list(makeString("three"), makeString("worker")), list(makeString("shown"), makeString("slawomir")), list(makeString("adding"), makeString("view"), makeString("shown"), makeString("us"), makeString("lies"), makeString("playwright")), list(makeString("say"), makeString("article"), makeString("essayist")), list(makeString("poles"), makeString("perspective"), makeString("newspaper")), list(makeString("provided"), makeString("use"), makeString("publication")), list(makeString("suffered"), makeString("attack")), list(makeString("wyborcza"), makeString("gazeta")), list(makeString("john"), makeString("brought"), makeString("mass")), list(makeString("attack"), makeString("heart")), list(makeString("believe"), makeString("tell"), makeString("adding")), list(makeString("things"), makeString("say")), list(makeString("annals"), makeString("tunnel"), makeString("culture")), list(makeString("called"), makeString("result"), makeString("group"), makeString("pax"), makeString("communists")), list(new SubLObject[]{ makeString("tunnel"), makeString("achievement"), makeString("based"), makeString("universal"), makeString("tygodnik"), makeString("name"), makeString("means"), makeString("precedent"), makeString("established"), makeString("provided"), makeString("added") }), list(makeString("nobel"), makeString("including"), makeString("daily"), makeString("news"), makeString("word"), makeString("paul")), list(new SubLObject[]{ makeString("worker"), makeString("poznan"), makeString("hungarian"), makeString("troops"), makeString("new"), makeString("rebellion"), makeString("leadership"), makeString("credibility"), makeString("uprisings"), makeString("sought"), makeString("returned") }), list(makeString("andrzej"), makeString("pseudonym")), list(makeString("generations"), makeString("paper"), makeString("taken"), makeString("commentator")), list(makeString("articles"), makeString("elsewhere"), makeString("bloc"), makeString("editor")), list(makeString("use"), makeString("andrzej"), makeString("pieces"), makeString("continued")), list(makeString("closest"), makeString("described"), makeString("papacy"), makeString("1978"), makeString("prayed"), makeString("friend"), makeString("soul")), list(makeString("officials"), makeString("stalin"), makeString("soviet")), list(makeString("article"), makeString("essayist"), makeString("moral"), makeString("periods"), makeString("idiotism")), list(makeString("deal"), makeString("east")), list(makeString("1968"), makeString("published")), list(makeString("pieces"), makeString("ran"), makeString("jawien")), list(makeString("bloc"), makeString("deal")), list(makeString("authority"), makeString("rational")), list(makeString("idiotism"), makeString("kisielewski"), makeString("featured")) }), list(list(makeSymbol("ASK-QAGA"), list(QUOTE, list(makeString("Jawien")))), makeString("*TUROWICZ* ran it on the *FRONT* *PAGE* under a pseudonym Andrzej *JAWIEN* which the future pope continued to use on his pieces in the publication "), makeString("He alone and nobody else lives in our hearts and symbolizes our dignity and pride said Al Musawir al Arabi *WEEKLY* in a *FRONT* *PAGE* editorial "), makeString("He ordered it done and was given the metal *FRONT* *PAGE* press plate as a souvenir "), makeString("A *FRONT* *PAGE* story of the first issue said that the exposition is profoundly and positively influencing the society and the economy in Yunnan ")), list(list(makeSymbol("ASK-GLIMPSE"), makeString("Jawien")), list($FILE, makeString("19990128_NYT.dir"), makeKeyword("ARTICLE"), makeInteger(467), $LINE, makeInteger(69), $TEXT, makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication."))), cons(list(makeSymbol("PARSE-DATE"), makeString("August 3, 1966")), makeInteger("19660803000000")), list(list(makeSymbol("INVOKE-WORDNET"), list(QUOTE, list(list(makeString("class"), makeString("word")), list(makeString("pos"), makeString("noun")), list(makeString("form"), makeString("sky")), list(makeString("method"), makeString("getSenses"))))), makeSymbol("LIST"), list(makeSymbol("NEW-SENSE-PROXY"), list(makeSymbol("NEW-SYNSET-PROXY"), makeString("noun"), makeInteger(7748403), makeString("outer space as viewed from the earth")), makeString("sky"))) });
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static SubLObject _constant_94_initializer() {
        return list(new SubLObject[]{ list(list(makeSymbol("CHARNIAK-PARSE"), makeString("The cat sat on the mat.")), list(makeKeyword("S1"), list(makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("The")), list(makeKeyword("NN"), makeString("cat"))), list(makeKeyword("VP"), list(makeKeyword("VBD"), makeString("sat")), list(makeKeyword("PP"), list(makeKeyword("IN"), makeString("on")), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("the")), list(makeKeyword("NN"), makeString("mat"))))), list(makeKeyword("."), makeString("."))))), list(list(makeSymbol("STANFORD-PARSE"), makeString("The cat sat on the mat.")), makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("The")), list(makeKeyword("NN"), makeString("cat"))), list(makeKeyword("VP"), list(makeKeyword("VBD"), makeString("sat")), list(makeKeyword("PP"), list(makeKeyword("IN"), makeString("on")), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("the")), list(makeKeyword("NN"), makeString("mat"))))), list(makeKeyword("."), makeString("."))), list(list(makeSymbol("DEPENDENCY-PARSE"), makeString("The cat sat on the mat.")), list(new SubLObject[]{ $WORD, makeString("sat"), makeKeyword("TAG"), makeString("A_nx0Vpx1"), makeKeyword("INDEX"), TWO_INTEGER, $ARGS, list(list(new SubLObject[]{ $WORD, makeString("cat"), makeKeyword("TAG"), makeString("A_NXN"), makeKeyword("INDEX"), ONE_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), list(list(new SubLObject[]{ $WORD, makeString("The"), makeKeyword("TAG"), makeString("B_Dnx"), makeKeyword("INDEX"), ZERO_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), NIL })) }), list(new SubLObject[]{ $WORD, makeString("on"), makeKeyword("TAG"), makeString("A_PXPnx"), makeKeyword("INDEX"), THREE_INTEGER, $ARGS, list(list(new SubLObject[]{ $WORD, makeString("mat."), makeKeyword("TAG"), makeString("A_NXN"), makeKeyword("INDEX"), FIVE_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), list(list(new SubLObject[]{ $WORD, makeString("the"), makeKeyword("TAG"), makeString("B_Dnx"), makeKeyword("INDEX"), FOUR_INTEGER, $ARGS, NIL, makeKeyword("MODIFIERS"), NIL })) })), makeKeyword("MODIFIERS"), NIL })), makeKeyword("MODIFIERS"), NIL })), list(list(makeSymbol("STEM-PARSE"), makeString("The cat sat on the mat.")), list(makeKeyword("S1"), list(makeKeyword("SUB"), list(makeKeyword("NP"), list(makeKeyword("DT"), list($ROOT, makeString("The"), makeString("the"))), list(makeKeyword("NN"), list($ROOT, makeString("cat"), makeString("cat"))))), list(makeKeyword("VG"), list(makeKeyword("VBD"), list($ROOT, makeString("sat"), makeString("sit")))), list(makeKeyword("PP"), list(makeKeyword("IN"), list($ROOT, makeString("on"), makeString("on"))), list(makeKeyword("NP"), list(makeKeyword("DT"), list($ROOT, makeString("the"), makeString("the"))), list(makeKeyword("NN"), list($ROOT, makeString("mat"), makeString("mat"))))), list(makeKeyword("."), makeString(".")))), list(list(makeSymbol("GURUQA-ANSWER-INDEXES"), makeString("Udine")), list(new SubLObject[]{ $RANK, ONE_INTEGER, makeKeyword("LEN"), ONE_INTEGER, makeKeyword("DOCID"), makeString("NA.18541"), makeKeyword("DOC"), makeInteger(33671), makeKeyword("WEIGHT"), makeDouble(0.155536824074), $SENT, makeInteger(21), $SIZE, makeInteger(227), makeKeyword("SCORE"), makeDouble(1.0) })), cons(list(makeSymbol("GURUQA-RETRIEVE-PASSAGE"), makeInteger(33671), makeInteger(21)), makeString("A prior Italian Senate\ninvestigation report states that in 1989 a steel company in Udine that had\n$70 million worth of contracts with Iraq was referred by BNL Rome to seek\nfinancing from BNL Atlanta, where it obtained credit. \n")), list(new SubLObject[]{ list(makeSymbol("ASK-LEMUR"), makeString("Jawien")), list(makeString("NYT19990128.0498.29"), makeDouble(19.979052515738), makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication.")), list(makeString("NYT19990128.0498.1"), ZERO_INTEGER, makeString("Jerzy Turowicz, who skirmished with communist censors for nearly four decades to produce a Polish Catholic weekly that became widely known as ``the only free newspaper from Berlin to Vladivostok,'' died on Wednesday in Krakow, Poland.")), list(makeString("NYT19990128.0498.2"), ZERO_INTEGER, makeString("He was 86 and had suffered a heart attack.")), list(makeString("NYT19990128.0498.3"), ZERO_INTEGER, makeString("News of Turowicz's death was brought to Pope John Paul II while he was about to celebrate Mass in St. Louis.")), list(makeString("NYT19990128.0498.4"), ZERO_INTEGER, makeString("He then prayed for the soul of the man who had been described as his closest friend at the time of his election to the papacy in 1978.")), list(makeString("NYT19990128.0498.5"), ZERO_INTEGER, makeString("In the years after communism fell in their native Poland in 1989, they differed over issues like abortion, but their friendship went back to a time when Turowicz published the pope's poems and essays while he was still Karol Wojtyla, a priest from Krakow.")), list(makeString("NYT19990128.0498.6"), ZERO_INTEGER, makeString("The death was front-page news all over Poland, and Thursday's issues of Gazeta Wyborcza, a Warsaw daily, devoted eight pages to Turowicz, including a poem about him by Czeslaw Milosz, the 1980 Nobel laureate in literature.")), list(makeString("NYT19990128.0498.7"), ZERO_INTEGER, makeString("In an editorial, the paper said Turowicz ``was the moral authority of several generations of Polish intellectuals; a wonderful essayist and a rational commentator on everything.''")), list(makeString("NYT19990128.0498.8"), ZERO_INTEGER, makeString("Referring to his Krakow-based publication, whose name means The Universal Weekly, the editorial added, ``For more than a half century he established Tygodnik Powszechny as an achievement without precedent in the annals of Polish culture, an achievement that for many years provided the only light in the dark Polish tunnel.``")), list(makeString("NYT19990128.0498.9"), ZERO_INTEGER, makeString("The magazine was founded in 1945, sponsored by Adam Sapieha, who was then Archbishop of Krakow.")) }), list(list(makeSymbol("RESPORATOR"), makeString("The cat sat on the mat.")), cons(makeSymbol("THING"), makeString("cat")), cons(makeSymbol("VEHICLE"), makeString("cat")), cons(makeSymbol("THING"), makeString("mat"))), list(new SubLObject[]{ list(makeSymbol("GET-WORD-GRAPH"), list(QUOTE, list(makeString("Jawien")))), list(makeString("forced"), makeString("write")), list(makeString("gazeta"), makeString("eight")), list(makeString("heart"), makeString("86")), list(makeString("never"), makeString("forced"), makeString("think")), list(makeString("decades"), makeString("died"), makeString("skirmished"), makeString("four")), list(makeString("featured"), makeString("stringent")), list(makeString("enraging"), makeString("direct"), makeString("independence")), list(makeString("aroused"), makeString("trouble")), list(makeString("issues"), makeString("including"), makeString("1989"), makeString("nobel")), list(makeString("differed"), makeString("went"), makeString("wojtyla"), makeString("poems"), makeString("priest"), makeString("abortion")), list(makeString("including"), makeString("news"), makeString("word")), list(makeString("stalin"), makeString("three"), makeString("soviet"), makeString("perhaps")), list(makeString("sapieha"), makeString("archbishop")), list(makeString("perhaps"), makeString("ordered"), makeString("1953"), makeString("despot"), makeString("boldest"), makeString("act")), list(makeString("news"), makeString("death"), makeString("paul")), list(makeString("poet"), makeString("origins")), list(makeString("everything"), makeString("free"), makeString("1986")), list(makeString("polish"), makeString("weekly")), list(new SubLObject[]{ makeString("elsewhere"), makeString("1951"), makeString("semitic"), makeString("1968"), makeString("antoni"), makeString("jewish"), makeString("editor"), makeString("mounted"), makeString("government") }), list(makeString("perspective"), makeString("believe"), makeString("reader"), makeString("newspaper")), list(makeString("abortion"), makeString("native"), makeString("karol")), list(makeString("years"), makeString("1945"), makeString("krakow")), list(makeString("control"), makeString("took"), makeString("moved"), makeString("enraging")), list(makeString("intellectuals"), makeString("wonderful"), makeString("generations")), list(makeString("editorial"), makeString("polish"), makeString("annals"), makeString("weekly"), makeString("culture")), list(makeString("stringent"), makeString("less")), list(makeString("east"), makeString("great")), list(makeString("word"), makeString("removed"), makeString("dashes"), makeString("something"), makeString("instituted"), makeString("show")), list(makeString("soviet"), makeString("three")), list(makeString("antoni"), makeString("figure")), list(makeString("collaborating"), makeString("turned")), list(makeString("leaders"), makeString("elsewhere"), makeString("deal"), makeString("bloc"), makeString("articles"), makeString("publishing")), list(makeString("publication"), makeString("use")), list(makeString("publish"), makeString("party"), makeString("occurred")), list(makeString("figure"), makeString("poet"), makeString("contributing"), makeString("instance"), makeString("anti"), makeString("invited"), makeString("number")), list(makeString("established"), makeString("light")), list(makeString("periods"), makeString("censorship")), list(makeString("tell"), makeString("same")), list(makeString("paper"), makeString("taken"), makeString("catholic")), list(makeString("ways"), makeString("aroused"), makeString("found"), makeString("sensitized"), makeString("conspiratorially")), list(makeString("1945"), makeString("adam"), makeString("founded")), list(makeString("despot"), makeString("publish")), list(makeString("pax"), makeString("refused")), list(makeString("daily"), makeString("warsaw"), makeString("laureate"), makeString("pages"), makeString("literature"), makeString("wyborcza")), list(makeString("publishing"), makeString("religion"), makeString("politics")), list(makeString("skirmished"), makeString("jerzy")), list(makeString("pages"), makeString("1980")), list(makeString("editor"), makeString("1951"), makeString("church")), list(makeString("literature"), makeString("poem"), makeString("devoted"), makeString("thursday")), list(makeString("newspaper"), makeString("known")), list(makeString("essayist"), makeString("everything"), makeString("moral"), makeString("editorial")), list(makeString("poems"), makeString("election"), makeString("time")), list(makeString("election"), makeString("closest")), list(makeString("jerzy"), makeString("nearly"), makeString("became"), makeString("vladivostok")), list(makeString("1986"), makeString("never"), makeString("free")), list(makeString("mass"), makeString("ii"), makeString("celebrate")), list(makeString("times"), makeString("censors"), makeString("articles"), makeString("leaders"), makeString("poles")), list(makeString("turowicz"), makeString("suffered"), makeString("pope")), list(makeString("added"), makeString("powszechny")), list(makeString("1989"), makeString("differed"), makeString("nobel")), list(makeString("troops"), makeString("led"), makeString("suppressed")), list(makeString("practice"), makeString("readers")), list(makeString("church"), makeString("communist"), makeString("officials")), list(makeString("invited"), makeString("scale")), list(makeString("communists"), makeString("collaborating")), list(makeString("eight"), makeString("front")), list(makeString("paul"), makeString("john")), list(makeString("leadership"), makeString("krakow"), makeString("years")), list(makeString("known"), makeString("issues"), makeString("poland")), list(makeString("krakow"), makeString("1945")), list(makeString("rational"), makeString("intellectuals")), list(makeString("prayed"), makeString("man")), list(makeString("adam"), makeString("sponsored"), makeString("sapieha")), list(makeString("catholic"), makeString("wednesday")), list(makeString("semitic"), makeString("shunned")), list(makeString("1951"), makeString("stalin"), makeString("control"), makeString("officials"), makeString("church")), list(makeString("wednesday"), makeString("decades")), list(makeString("taken"), makeString("wednesday"), makeString("called"), makeString("catholic")), list(makeString("moral"), makeString("everything"), makeString("1986"), makeString("authority"), makeString("annals"), makeString("editorial")), list(makeString("poland"), makeString("issues"), makeString("turowicz"), makeString("pope")), list(makeString("trouble"), makeString("things")), list(makeString("little"), makeString("perspective"), makeString("ways"), makeString("leaders"), makeString("times"), makeString("poles")), list(makeString("front"), makeString("page")), list(makeString("instituted"), makeString("practice")), list(makeString("time"), makeString("election")), list(makeString("three"), makeString("worker")), list(makeString("shown"), makeString("slawomir")), list(makeString("adding"), makeString("view"), makeString("shown"), makeString("us"), makeString("lies"), makeString("playwright")), list(makeString("say"), makeString("article"), makeString("essayist")), list(makeString("poles"), makeString("perspective"), makeString("newspaper")), list(makeString("provided"), makeString("use"), makeString("publication")), list(makeString("suffered"), makeString("attack")), list(makeString("wyborcza"), makeString("gazeta")), list(makeString("john"), makeString("brought"), makeString("mass")), list(makeString("attack"), makeString("heart")), list(makeString("believe"), makeString("tell"), makeString("adding")), list(makeString("things"), makeString("say")), list(makeString("annals"), makeString("tunnel"), makeString("culture")), list(makeString("called"), makeString("result"), makeString("group"), makeString("pax"), makeString("communists")), list(new SubLObject[]{ makeString("tunnel"), makeString("achievement"), makeString("based"), makeString("universal"), makeString("tygodnik"), makeString("name"), makeString("means"), makeString("precedent"), makeString("established"), makeString("provided"), makeString("added") }), list(makeString("nobel"), makeString("including"), makeString("daily"), makeString("news"), makeString("word"), makeString("paul")), list(new SubLObject[]{ makeString("worker"), makeString("poznan"), makeString("hungarian"), makeString("troops"), makeString("new"), makeString("rebellion"), makeString("leadership"), makeString("credibility"), makeString("uprisings"), makeString("sought"), makeString("returned") }), list(makeString("andrzej"), makeString("pseudonym")), list(makeString("generations"), makeString("paper"), makeString("taken"), makeString("commentator")), list(makeString("articles"), makeString("elsewhere"), makeString("bloc"), makeString("editor")), list(makeString("use"), makeString("andrzej"), makeString("pieces"), makeString("continued")), list(makeString("closest"), makeString("described"), makeString("papacy"), makeString("1978"), makeString("prayed"), makeString("friend"), makeString("soul")), list(makeString("officials"), makeString("stalin"), makeString("soviet")), list(makeString("article"), makeString("essayist"), makeString("moral"), makeString("periods"), makeString("idiotism")), list(makeString("deal"), makeString("east")), list(makeString("1968"), makeString("published")), list(makeString("pieces"), makeString("ran"), makeString("jawien")), list(makeString("bloc"), makeString("deal")), list(makeString("authority"), makeString("rational")), list(makeString("idiotism"), makeString("kisielewski"), makeString("featured")) }), list(list(makeSymbol("ASK-QAGA"), list(QUOTE, list(makeString("Jawien")))), makeString("*TUROWICZ* ran it on the *FRONT* *PAGE* under a pseudonym Andrzej *JAWIEN* which the future pope continued to use on his pieces in the publication "), makeString("He alone and nobody else lives in our hearts and symbolizes our dignity and pride said Al Musawir al Arabi *WEEKLY* in a *FRONT* *PAGE* editorial "), makeString("He ordered it done and was given the metal *FRONT* *PAGE* press plate as a souvenir "), makeString("A *FRONT* *PAGE* story of the first issue said that the exposition is profoundly and positively influencing the society and the economy in Yunnan ")), list(list(makeSymbol("ASK-GLIMPSE"), makeString("Jawien")), list($FILE, makeString("19990128_NYT.dir"), makeKeyword("ARTICLE"), makeInteger(467), $LINE, makeInteger(69), $TEXT, makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication."))), cons(list(makeSymbol("PARSE-DATE"), makeString("August 3, 1966")), makeInteger("19660803000000")), list(list(makeSymbol("INVOKE-WORDNET"), list(QUOTE, list(list(makeString("class"), makeString("word")), list(makeString("pos"), makeString("noun")), list(makeString("form"), makeString("sky")), list(makeString("method"), makeString("getSenses"))))), makeSymbol("LIST"), list(makeSymbol("NEW-SENSE-PROXY"), list(makeSymbol("NEW-SYNSET-PROXY"), makeString("noun"), makeInteger(7748403), makeString("outer space as viewed from the earth")), makeString("sky"))) });
    }

    static private final SubLString $str_alt15$__guruqa_query_expr___A = makeString("~&guruqa query expr: ~A");

    static private final SubLString $str_alt17$__guruqa_query_str___A = makeString("~&guruqa query str: ~A");

    static private final SubLString $str_alt18$_________________________________ = makeString("~%====================================================================");

    static private final SubLString $str_alt19$___A = makeString("~%~A");

    static private final SubLString $str_alt20$_____S = makeString("~%~%~S");

    static private final SubLString $str_alt23$___S = makeString("~%~S");

    static private final SubLString $str_alt40$_P_ = makeString("<P>");

    static private final SubLString $str_alt41$__P_ = makeString("</P>");

    static private final SubLString $str_alt44$_users_supertagger_old_sexprlda = makeString("/users/supertagger_old/sexprlda");

    static private final SubLList $list_alt47 = list(makeKeyword("S1"));

    static private final SubLString $str_alt58$select_occurrences__documents__te = makeString("select occurrences, documents, term from dict where term = '~A' and corpus = 'AQUAINT-Corpus';");

    static private final SubLString $str_alt59$__ = makeString("''");

    static private final SubLString $str_alt60$_ = makeString("'");

    static private final SubLString $str_alt63$Unsupported_corpus__a = makeString("Unsupported corpus ~a");

    static private final SubLString $str_alt64$_inesgraph_cgi = makeString("/inesgraph.cgi");

    static private final SubLString $str_alt66$___A_____ = makeString("~{~A~^ ~}");

    static private final SubLString $str_alt67$_qaga_cgi = makeString("/qaga.cgi");

    static private final SubLString $str_alt68$_applepie_cgi = makeString("/applepie.cgi");

    static private final SubLString $str_alt69$_minipar_cgi = makeString("/minipar.cgi");

    static private final SubLString $str_alt70$_bash_cgi = makeString("/bash.cgi");

    static private final SubLString $str_alt72$_parse_date_cgi = makeString("/parse-date.cgi");

    static private final SubLString $str_alt80$_qack_cgi = makeString("/qack.cgi");

    static private final SubLString $str_alt81$_wordnet_cgi = makeString("/wordnet.cgi");

    static private final SubLList $list_alt83 = list(list(makeString("type"), makeString("q")));

    static private final SubLString $str_alt84$_questions_cgi = makeString("/questions.cgi");

    static private final SubLList $list_alt85 = list(makeString("localhost"));

    static private final SubLString $str_alt87$_cgi_bin_users_mahler_check_cyc_s = makeString("/cgi-bin/users/mahler/check_cyc_servers.perl");

    static private final SubLString $str_alt90$_corpus_frequency_cgi = makeString("/corpus-frequency.cgi");

    public static final SubLObject $list_alt94 = com.cyc.cycjava.cycl.quirk.external_interfaces._constant_94_initializer();

    @Override
    public void declareFunctions() {
        declare_external_interfaces_file();
    }

    @Override
    public void initializeVariables() {
        init_external_interfaces_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_external_interfaces_file();
    }

    static {
    }
}

/**
 * Total time: 424 ms
 */
