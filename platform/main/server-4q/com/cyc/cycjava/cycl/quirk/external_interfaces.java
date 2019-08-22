package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class external_interfaces extends SubLTranslatedFile {
    public static final SubLFile me = new external_interfaces();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.external_interfaces";

    public static final String myFingerPrint = "00cd743ddf8c0943c2d1a2490aaf24ab6513953dac482ce18937974e4b9e732f";

    // defparameter
    // Definitions
    public static final SubLSymbol $quirk_host$ = makeSymbol("*QUIRK-HOST*");

    // defparameter
    public static final SubLSymbol $quirk_port$ = makeSymbol("*QUIRK-PORT*");

    // defparameter
    public static final SubLSymbol $talent_path$ = makeSymbol("*TALENT-PATH*");

    // defparameter
    public static final SubLSymbol $npp_default$ = makeSymbol("*NPP-DEFAULT*");

    // defparameter
    public static final SubLSymbol $shallow_parse_path$ = makeSymbol("*SHALLOW-PARSE-PATH*");

    // defparameter
    public static final SubLSymbol $dependency_parse_path$ = makeSymbol("*DEPENDENCY-PARSE-PATH*");

    // defparameter
    public static final SubLSymbol $guruqa_retrieve_passage_path$ = makeSymbol("*GURUQA-RETRIEVE-PASSAGE-PATH*");

    // defparameter
    public static final SubLSymbol $guruqa_answer_indexes_path$ = makeSymbol("*GURUQA-ANSWER-INDEXES-PATH*");

    // defparameter
    public static final SubLSymbol $resporator_path$ = makeSymbol("*RESPORATOR-PATH*");

    // defparameter
    private static final SubLSymbol $guruqa_wizard$ = makeSymbol("*GURUQA-WIZARD*");

    // defparameter
    public static final SubLSymbol $dict_db_user$ = makeSymbol("*DICT-DB-USER*");

    // defparameter
    public static final SubLSymbol $dict_db_passwd$ = makeSymbol("*DICT-DB-PASSWD*");

    // defparameter
    public static final SubLSymbol $dict_db$ = makeSymbol("*DICT-DB*");

    // defparameter
    public static final SubLSymbol $dict_host$ = makeSymbol("*DICT-HOST*");

    // defparameter
    public static final SubLSymbol $dict_conn$ = makeSymbol("*DICT-CONN*");

    // defparameter
    public static final SubLSymbol $dict_stmt$ = makeSymbol("*DICT-STMT*");

    // defparameter
    public static final SubLSymbol $all_external_services$ = makeSymbol("*ALL-EXTERNAL-SERVICES*");

    // Internal Constants
    public static final SubLString $str0$mongo_cyc_com = makeString("mongo.cyc.com");

    private static final SubLInteger $int$8080 = makeInteger(8080);

    public static final SubLString $str2$_users_textract_showtalent = makeString("/users/textract/showtalent");

    public static final SubLString $str3$_users_textract_sexpr_shallow = makeString("/users/textract/sexpr-shallow");

    public static final SubLString $str4$_users_supertagger_sexprlda = makeString("/users/supertagger/sexprlda");

    public static final SubLString $str5$_users_textract_documentWindow = makeString("/users/textract/documentWindow");

    public static final SubLString $str6$_users_textract_guruqaIds = makeString("/users/textract/guruqaIds");

    public static final SubLString $str7$_users_textract_sexprresporator = makeString("/users/textract/sexprresporator");

    public static final SubLSymbol CYCL_GURUQA_QUERY_WIZARD = makeSymbol("CYCL-GURUQA-QUERY-WIZARD");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLString $str11$__mt___A = makeString("~&mt: ~A");

    public static final SubLString $str12$__wiz___A = makeString("~&wiz: ~A");

    public static final SubLString $str13$__cyc_expr___S_of_type__S = makeString("~&cyc-expr: ~S of type ~S");

    public static final SubLSymbol HOLISTIC_GURUQA_QUERY = makeSymbol("HOLISTIC-GURUQA-QUERY");

    public static final SubLString $str15$__guruqa_query_expr___A = makeString("~&guruqa query expr: ~A");



    public static final SubLString $str17$__guruqa_query_str___A = makeString("~&guruqa query str: ~A");

    public static final SubLString $str18$_________________________________ = makeString("~%====================================================================");

    public static final SubLString $str19$___A = makeString("~%~A");

    public static final SubLString $str20$_____S = makeString("~%~%~S");





    public static final SubLString $str23$___S = makeString("~%~S");









    public static final SubLString $$$query = makeString("query");

    public static final SubLString $$$text = makeString("text");

    public static final SubLSymbol QUIRK_LEXICON = makeSymbol("QUIRK-LEXICON");











    private static final SubLObject $$PersonTypeByOccupation = reader_make_constant_shell(makeString("PersonTypeByOccupation"));

    public static final SubLString $$$doc = makeString("doc");

    public static final SubLString $$$start = makeString("start");

    public static final SubLString $$$length = makeString("length");

    public static final SubLString $str40$_P_ = makeString("<P>");

    public static final SubLString $str41$__P_ = makeString("</P>");



    public static final SubLString $$$npp = makeString("npp");

    public static final SubLString $str44$_users_supertagger_old_sexprlda = makeString("/users/supertagger_old/sexprlda");

    public static final SubLSymbol STRIP_STEMS = makeSymbol("STRIP-STEMS");



    public static final SubLList $list47 = list(makeKeyword("S1"));

    public static final SubLString $$$ini = makeString("ini");

    public static final SubLString $$$mahler = makeString("mahler");

    public static final SubLString $str50$ = makeString("");

    public static final SubLString $$$dict2 = makeString("dict2");

    public static final SubLString $$$elmore = makeString("elmore");





    private static final SubLInteger $int$9999 = makeInteger(9999);



    public static final SubLString $$$postgresql = makeString("postgresql");

    public static final SubLString $str58$select_occurrences__documents__te = makeString("select occurrences, documents, term from dict where term = '~A' and corpus = 'AQUAINT-Corpus';");

    public static final SubLString $str59$__ = makeString("''");

    public static final SubLString $str60$_ = makeString("'");

    public static final SubLSymbol LEMUR_QUERY = makeSymbol("LEMUR-QUERY");

    public static final SubLSymbol GET_CORPUS_PATH_MAPPING = makeSymbol("GET-CORPUS-PATH-MAPPING");

    public static final SubLString $str63$Unsupported_corpus__a = makeString("Unsupported corpus ~a");

    public static final SubLString $str64$_inesgraph_cgi = makeString("/inesgraph.cgi");



    public static final SubLString $str66$___A_____ = makeString("~{~A~^ ~}");

    public static final SubLString $str67$_qaga_cgi = makeString("/qaga.cgi");

    public static final SubLString $str68$_applepie_cgi = makeString("/applepie.cgi");

    public static final SubLString $str69$_minipar_cgi = makeString("/minipar.cgi");

    public static final SubLString $str70$_bash_cgi = makeString("/bash.cgi");

    public static final SubLString $$$command = makeString("command");

    public static final SubLString $str72$_parse_date_cgi = makeString("/parse-date.cgi");

    public static final SubLString $$$datestring = makeString("datestring");

    public static final SubLString $$$year = makeString("year");

    public static final SubLString $$$month = makeString("month");

    public static final SubLString $$$day = makeString("day");

    public static final SubLString $$$hour = makeString("hour");

    public static final SubLString $$$minute = makeString("minute");

    public static final SubLString $$$second = makeString("second");

    public static final SubLString $str80$_qack_cgi = makeString("/qack.cgi");

    public static final SubLString $str81$_wordnet_cgi = makeString("/wordnet.cgi");



    public static final SubLList $list83 = list(list(makeString("type"), makeString("q")));

    public static final SubLString $str84$_questions_cgi = makeString("/questions.cgi");

    public static final SubLList $list85 = list(makeString("localhost"));

    public static final SubLString $$$Guest = makeString("Guest");

    public static final SubLString $str87$_cgi_bin_users_mahler_check_cyc_s = makeString("/cgi-bin/users/mahler/check_cyc_servers.perl");

    public static final SubLString $$$servers = makeString("servers");



    public static final SubLString $str90$_corpus_frequency_cgi = makeString("/corpus-frequency.cgi");

    public static final SubLString $$$dbfile = makeString("dbfile");

    public static final SubLString $$$word = makeString("word");

    public static final SubLString $$$pos = makeString("pos");

    public static final SubLObject $list94 = _constant_94_initializer();

    private static final SubLInteger $int$30 = makeInteger(30);



    public static SubLObject get_guruqa_wizard() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $guruqa_wizard$.getDynamicValue(thread)) {
            $guruqa_wizard$.setDynamicValue(object.new_class_instance(CYCL_GURUQA_QUERY_WIZARD), thread);
        }
        return $guruqa_wizard$.getDynamicValue(thread);
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

    public static SubLObject guruqa_passages_for_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, SubLObject method) {
        if (method == UNPROVIDED) {
            method = HOLISTIC_GURUQA_QUERY;
        }
        assert NIL != el_formula_p(cycl) : "el_utilities.el_formula_p(cycl) " + "CommonSymbols.NIL != el_utilities.el_formula_p(cycl) " + cycl;
        final SubLObject query = methods.funcall_instance_method_with_1_args(guruqa_wizard, method, cycl);
        final SubLObject query_string = methods.funcall_instance_method_with_0_args(query, TO_STRING);
        format(T, $str23$___S, query_string);
        return guruqa_passages_for_query(query_string);
    }

    public static SubLObject guruqa_passages_for_query(final SubLObject query) {
        assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
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

    public static SubLObject resporatorXX(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
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

    public static SubLObject strip_tags(final SubLObject string) {
        return string_utilities.trim_whitespace(string_utilities.remove_substring(string_utilities.remove_substring(string, $str40$_P_), $str41$__P_));
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

    public static SubLObject strip_stems(final SubLObject parse) {
        return parse.isCons() ? parse.first() == $ROOT ? cadr(parse) : Mapping.mapcar(symbol_function(STRIP_STEMS), parse) : parse;
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

    public static SubLObject guruqa_indexed_string_entry(final SubLObject str) {
        return sdbc.sqls_execute_query(dict_statement(), format(NIL, $str58$select_occurrences__documents__te, string_utilities.string_substitute($str59$__, $str60$_, str, UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject get_word_graph_path(final SubLObject corpus) {
        final SubLObject path = assoc(corpus, methods.funcall_class_method_with_0_args(LEMUR_QUERY, GET_CORPUS_PATH_MAPPING), EQUALP, UNPROVIDED).rest();
        if (NIL == path) {
            Errors.error($str63$Unsupported_corpus__a, corpus);
        }
        return path;
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
        assert NIL != listp(query) : "Types.listp(query) " + "CommonSymbols.NIL != Types.listp(query) " + query;
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, format(NIL, $str66$___A_____, query)), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

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
        assert NIL != listp(query) : "Types.listp(query) " + "CommonSymbols.NIL != Types.listp(query) " + query;
        return read_from_string(web_utilities.http_retrieve(list(list($$$query, format(NIL, $str66$___A_____, query))), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        assert NIL != stringp(corpus_db_path) : "Types.stringp(corpus_db_path) " + "CommonSymbols.NIL != Types.stringp(corpus_db_path) " + corpus_db_path;
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        assert NIL != stringp(part_of_speech) : "Types.stringp(part_of_speech) " + "CommonSymbols.NIL != Types.stringp(part_of_speech) " + part_of_speech;
        final SubLObject query = list(list($$$dbfile, corpus_db_path), list($$$word, word), list($$$pos, part_of_speech));
        return web_utilities.http_retrieve(query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject services_report(SubLObject services) {
        if (services == UNPROVIDED) {
            services = $all_external_services$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(services) : "Types.listp(services) " + "CommonSymbols.NIL != Types.listp(services) " + services;
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
        declareFunction(me, "get_guruqa_wizard", "GET-GURUQA-WIZARD", 0, 0, false);
        declareFunction(me, "compute_guruqa_query", "COMPUTE-GURUQA-QUERY", 1, 0, false);
        declareFunction(me, "secretarize_cycl", "SECRETARIZE-CYCL", 3, 1, false);
        declareFunction(me, "guruqa_passages_for_cycl", "GURUQA-PASSAGES-FOR-CYCL", 2, 1, false);
        declareFunction(me, "guruqa_passages_for_query", "GURUQA-PASSAGES-FOR-QUERY", 1, 0, false);
        declareFunction(me, "guruqa_answer_indexes", "GURUQA-ANSWER-INDEXES", 1, 4, false);
        declareFunction(me, "resporator", "RESPORATOR", 1, 4, false);
        declareFunction(me, "resporatorXX", "RESPORATOR++", 1, 0, false);
        declareFunction(me, "guruqa_retrieve_passage", "GURUQA-RETRIEVE-PASSAGE", 2, 5, false);
        declareFunction(me, "strip_tags", "STRIP-TAGS", 1, 0, false);
        declareFunction(me, "guruqa_answer_coordinates", "GURUQA-ANSWER-COORDINATES", 1, 0, false);
        declareFunction(me, "dependency_parse", "DEPENDENCY-PARSE", 1, 5, false);
        declareFunction(me, "dependency_parse_old", "DEPENDENCY-PARSE-OLD", 1, 5, false);
        declareFunction(me, "shallow_parse", "SHALLOW-PARSE", 1, 4, false);
        declareFunction(me, "strip_stems", "STRIP-STEMS", 1, 0, false);
        declareFunction(me, "stem_parse", "STEM-PARSE", 1, 4, false);
        declareFunction(me, "run_talent", "RUN-TALENT", 2, 4, false);
        declareFunction(me, "dict_connection", "DICT-CONNECTION", 0, 0, false);
        declareFunction(me, "dict_statement", "DICT-STATEMENT", 0, 0, false);
        declareFunction(me, "guruqa_indexed_string_entry", "GURUQA-INDEXED-STRING-ENTRY", 1, 0, false);
        declareFunction(me, "get_word_graph_path", "GET-WORD-GRAPH-PATH", 1, 0, false);
        declareFunction(me, "get_word_graph", "GET-WORD-GRAPH", 1, 5, false);
        declareFunction(me, "ask_qaga", "ASK-QAGA", 1, 4, false);
        declareFunction(me, "applepie_parse", "APPLEPIE-PARSE", 1, 4, false);
        declareFunction(me, "minipar_parse", "MINIPAR-PARSE", 1, 4, false);
        declareFunction(me, "ask_bash", "ASK-BASH", 1, 4, false);
        declareFunction(me, "parse_date", "PARSE-DATE", 1, 11, false);
        declareFunction(me, "ask_qack", "ASK-QACK", 1, 5, false);
        declareFunction(me, "invoke_wordnet", "INVOKE-WORDNET", 1, 5, false);
        declareFunction(me, "glimpse_passages_for_query", "GLIMPSE-PASSAGES-FOR-QUERY", 1, 0, false);
        declareFunction(me, "web_mine_questions", "WEB-MINE-QUESTIONS", 1, 5, false);
        declareFunction(me, "get_cyc_images", "GET-CYC-IMAGES", 0, 6, false);
        declareFunction(me, "get_corpus_count_probability", "GET-CORPUS-COUNT-PROBABILITY", 3, 4, false);
        declareFunction(me, "services_report", "SERVICES-REPORT", 0, 1, false);
        return NIL;
    }

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

    public static SubLObject setup_external_interfaces_file() {
        return NIL;
    }

    private static SubLObject _constant_94_initializer() {
        return list(new SubLObject[]{ list(list(makeSymbol("CHARNIAK-PARSE"), makeString("The cat sat on the mat.")), list(makeKeyword("S1"), list(makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("The")), list(makeKeyword("NN"), makeString("cat"))), list(makeKeyword("VP"), list(makeKeyword("VBD"), makeString("sat")), list(makeKeyword("PP"), list(makeKeyword("IN"), makeString("on")), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("the")), list(makeKeyword("NN"), makeString("mat"))))), list(makeKeyword("."), makeString("."))))), list(list(makeSymbol("STANFORD-PARSE"), makeString("The cat sat on the mat.")), makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("The")), list(makeKeyword("NN"), makeString("cat"))), list(makeKeyword("VP"), list(makeKeyword("VBD"), makeString("sat")), list(makeKeyword("PP"), list(makeKeyword("IN"), makeString("on")), list(makeKeyword("NP"), list(makeKeyword("DT"), makeString("the")), list(makeKeyword("NN"), makeString("mat"))))), list(makeKeyword("."), makeString("."))), list(list(makeSymbol("DEPENDENCY-PARSE"), makeString("The cat sat on the mat.")), list(new SubLObject[]{ makeKeyword("WORD"), makeString("sat"), makeKeyword("TAG"), makeString("A_nx0Vpx1"), makeKeyword("INDEX"), TWO_INTEGER, makeKeyword("ARGS"), list(list(new SubLObject[]{ makeKeyword("WORD"), makeString("cat"), makeKeyword("TAG"), makeString("A_NXN"), makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("ARGS"), NIL, makeKeyword("MODIFIERS"), list(list(new SubLObject[]{ makeKeyword("WORD"), makeString("The"), makeKeyword("TAG"), makeString("B_Dnx"), makeKeyword("INDEX"), ZERO_INTEGER, makeKeyword("ARGS"), NIL, makeKeyword("MODIFIERS"), NIL })) }), list(new SubLObject[]{ makeKeyword("WORD"), makeString("on"), makeKeyword("TAG"), makeString("A_PXPnx"), makeKeyword("INDEX"), THREE_INTEGER, makeKeyword("ARGS"), list(list(new SubLObject[]{ makeKeyword("WORD"), makeString("mat."), makeKeyword("TAG"), makeString("A_NXN"), makeKeyword("INDEX"), FIVE_INTEGER, makeKeyword("ARGS"), NIL, makeKeyword("MODIFIERS"), list(list(new SubLObject[]{ makeKeyword("WORD"), makeString("the"), makeKeyword("TAG"), makeString("B_Dnx"), makeKeyword("INDEX"), FOUR_INTEGER, makeKeyword("ARGS"), NIL, makeKeyword("MODIFIERS"), NIL })) })), makeKeyword("MODIFIERS"), NIL })), makeKeyword("MODIFIERS"), NIL })), list(list(makeSymbol("STEM-PARSE"), makeString("The cat sat on the mat.")), list(makeKeyword("S1"), list(makeKeyword("SUB"), list(makeKeyword("NP"), list(makeKeyword("DT"), list(makeKeyword("ROOT"), makeString("The"), makeString("the"))), list(makeKeyword("NN"), list(makeKeyword("ROOT"), makeString("cat"), makeString("cat"))))), list(makeKeyword("VG"), list(makeKeyword("VBD"), list(makeKeyword("ROOT"), makeString("sat"), makeString("sit")))), list(makeKeyword("PP"), list(makeKeyword("IN"), list(makeKeyword("ROOT"), makeString("on"), makeString("on"))), list(makeKeyword("NP"), list(makeKeyword("DT"), list(makeKeyword("ROOT"), makeString("the"), makeString("the"))), list(makeKeyword("NN"), list(makeKeyword("ROOT"), makeString("mat"), makeString("mat"))))), list(makeKeyword("."), makeString(".")))), list(list(makeSymbol("GURUQA-ANSWER-INDEXES"), makeString("Udine")), list(new SubLObject[]{ makeKeyword("RANK"), ONE_INTEGER, makeKeyword("LEN"), ONE_INTEGER, makeKeyword("DOCID"), makeString("NA.18541"), makeKeyword("DOC"), makeInteger(33671), makeKeyword("WEIGHT"), makeDouble(0.155536824074), makeKeyword("SENT"), makeInteger(21), makeKeyword("SIZE"), makeInteger(227), makeKeyword("SCORE"), makeDouble(1.0) })), cons(list(makeSymbol("GURUQA-RETRIEVE-PASSAGE"), makeInteger(33671), makeInteger(21)), makeString("A prior Italian Senate\ninvestigation report states that in 1989 a steel company in Udine that had\n$70 million worth of contracts with Iraq was referred by BNL Rome to seek\nfinancing from BNL Atlanta, where it obtained credit. \n")), list(new SubLObject[]{ list(makeSymbol("ASK-LEMUR"), makeString("Jawien")), list(makeString("NYT19990128.0498.29"), makeDouble(19.979052515738), makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication.")), list(makeString("NYT19990128.0498.1"), ZERO_INTEGER, makeString("Jerzy Turowicz, who skirmished with communist censors for nearly four decades to produce a Polish Catholic weekly that became widely known as ``the only free newspaper from Berlin to Vladivostok,'' died on Wednesday in Krakow, Poland.")), list(makeString("NYT19990128.0498.2"), ZERO_INTEGER, makeString("He was 86 and had suffered a heart attack.")), list(makeString("NYT19990128.0498.3"), ZERO_INTEGER, makeString("News of Turowicz's death was brought to Pope John Paul II while he was about to celebrate Mass in St. Louis.")), list(makeString("NYT19990128.0498.4"), ZERO_INTEGER, makeString("He then prayed for the soul of the man who had been described as his closest friend at the time of his election to the papacy in 1978.")), list(makeString("NYT19990128.0498.5"), ZERO_INTEGER, makeString("In the years after communism fell in their native Poland in 1989, they differed over issues like abortion, but their friendship went back to a time when Turowicz published the pope's poems and essays while he was still Karol Wojtyla, a priest from Krakow.")), list(makeString("NYT19990128.0498.6"), ZERO_INTEGER, makeString("The death was front-page news all over Poland, and Thursday's issues of Gazeta Wyborcza, a Warsaw daily, devoted eight pages to Turowicz, including a poem about him by Czeslaw Milosz, the 1980 Nobel laureate in literature.")), list(makeString("NYT19990128.0498.7"), ZERO_INTEGER, makeString("In an editorial, the paper said Turowicz ``was the moral authority of several generations of Polish intellectuals; a wonderful essayist and a rational commentator on everything.''")), list(makeString("NYT19990128.0498.8"), ZERO_INTEGER, makeString("Referring to his Krakow-based publication, whose name means The Universal Weekly, the editorial added, ``For more than a half century he established Tygodnik Powszechny as an achievement without precedent in the annals of Polish culture, an achievement that for many years provided the only light in the dark Polish tunnel.``")), list(makeString("NYT19990128.0498.9"), ZERO_INTEGER, makeString("The magazine was founded in 1945, sponsored by Adam Sapieha, who was then Archbishop of Krakow.")) }), list(list(makeSymbol("RESPORATOR"), makeString("The cat sat on the mat.")), cons(makeSymbol("THING"), makeString("cat")), cons(makeSymbol("VEHICLE"), makeString("cat")), cons(makeSymbol("THING"), makeString("mat"))), list(new SubLObject[]{ list(makeSymbol("GET-WORD-GRAPH"), list(makeSymbol("QUOTE"), list(makeString("Jawien")))), list(makeString("forced"), makeString("write")), list(makeString("gazeta"), makeString("eight")), list(makeString("heart"), makeString("86")), list(makeString("never"), makeString("forced"), makeString("think")), list(makeString("decades"), makeString("died"), makeString("skirmished"), makeString("four")), list(makeString("featured"), makeString("stringent")), list(makeString("enraging"), makeString("direct"), makeString("independence")), list(makeString("aroused"), makeString("trouble")), list(makeString("issues"), makeString("including"), makeString("1989"), makeString("nobel")), list(makeString("differed"), makeString("went"), makeString("wojtyla"), makeString("poems"), makeString("priest"), makeString("abortion")), list(makeString("including"), makeString("news"), makeString("word")), list(makeString("stalin"), makeString("three"), makeString("soviet"), makeString("perhaps")), list(makeString("sapieha"), makeString("archbishop")), list(makeString("perhaps"), makeString("ordered"), makeString("1953"), makeString("despot"), makeString("boldest"), makeString("act")), list(makeString("news"), makeString("death"), makeString("paul")), list(makeString("poet"), makeString("origins")), list(makeString("everything"), makeString("free"), makeString("1986")), list(makeString("polish"), makeString("weekly")), list(new SubLObject[]{ makeString("elsewhere"), makeString("1951"), makeString("semitic"), makeString("1968"), makeString("antoni"), makeString("jewish"), makeString("editor"), makeString("mounted"), makeString("government") }), list(makeString("perspective"), makeString("believe"), makeString("reader"), makeString("newspaper")), list(makeString("abortion"), makeString("native"), makeString("karol")), list(makeString("years"), makeString("1945"), makeString("krakow")), list(makeString("control"), makeString("took"), makeString("moved"), makeString("enraging")), list(makeString("intellectuals"), makeString("wonderful"), makeString("generations")), list(makeString("editorial"), makeString("polish"), makeString("annals"), makeString("weekly"), makeString("culture")), list(makeString("stringent"), makeString("less")), list(makeString("east"), makeString("great")), list(makeString("word"), makeString("removed"), makeString("dashes"), makeString("something"), makeString("instituted"), makeString("show")), list(makeString("soviet"), makeString("three")), list(makeString("antoni"), makeString("figure")), list(makeString("collaborating"), makeString("turned")), list(makeString("leaders"), makeString("elsewhere"), makeString("deal"), makeString("bloc"), makeString("articles"), makeString("publishing")), list(makeString("publication"), makeString("use")), list(makeString("publish"), makeString("party"), makeString("occurred")), list(makeString("figure"), makeString("poet"), makeString("contributing"), makeString("instance"), makeString("anti"), makeString("invited"), makeString("number")), list(makeString("established"), makeString("light")), list(makeString("periods"), makeString("censorship")), list(makeString("tell"), makeString("same")), list(makeString("paper"), makeString("taken"), makeString("catholic")), list(makeString("ways"), makeString("aroused"), makeString("found"), makeString("sensitized"), makeString("conspiratorially")), list(makeString("1945"), makeString("adam"), makeString("founded")), list(makeString("despot"), makeString("publish")), list(makeString("pax"), makeString("refused")), list(makeString("daily"), makeString("warsaw"), makeString("laureate"), makeString("pages"), makeString("literature"), makeString("wyborcza")), list(makeString("publishing"), makeString("religion"), makeString("politics")), list(makeString("skirmished"), makeString("jerzy")), list(makeString("pages"), makeString("1980")), list(makeString("editor"), makeString("1951"), makeString("church")), list(makeString("literature"), makeString("poem"), makeString("devoted"), makeString("thursday")), list(makeString("newspaper"), makeString("known")), list(makeString("essayist"), makeString("everything"), makeString("moral"), makeString("editorial")), list(makeString("poems"), makeString("election"), makeString("time")), list(makeString("election"), makeString("closest")), list(makeString("jerzy"), makeString("nearly"), makeString("became"), makeString("vladivostok")), list(makeString("1986"), makeString("never"), makeString("free")), list(makeString("mass"), makeString("ii"), makeString("celebrate")), list(makeString("times"), makeString("censors"), makeString("articles"), makeString("leaders"), makeString("poles")), list(makeString("turowicz"), makeString("suffered"), makeString("pope")), list(makeString("added"), makeString("powszechny")), list(makeString("1989"), makeString("differed"), makeString("nobel")), list(makeString("troops"), makeString("led"), makeString("suppressed")), list(makeString("practice"), makeString("readers")), list(makeString("church"), makeString("communist"), makeString("officials")), list(makeString("invited"), makeString("scale")), list(makeString("communists"), makeString("collaborating")), list(makeString("eight"), makeString("front")), list(makeString("paul"), makeString("john")), list(makeString("leadership"), makeString("krakow"), makeString("years")), list(makeString("known"), makeString("issues"), makeString("poland")), list(makeString("krakow"), makeString("1945")), list(makeString("rational"), makeString("intellectuals")), list(makeString("prayed"), makeString("man")), list(makeString("adam"), makeString("sponsored"), makeString("sapieha")), list(makeString("catholic"), makeString("wednesday")), list(makeString("semitic"), makeString("shunned")), list(makeString("1951"), makeString("stalin"), makeString("control"), makeString("officials"), makeString("church")), list(makeString("wednesday"), makeString("decades")), list(makeString("taken"), makeString("wednesday"), makeString("called"), makeString("catholic")), list(makeString("moral"), makeString("everything"), makeString("1986"), makeString("authority"), makeString("annals"), makeString("editorial")), list(makeString("poland"), makeString("issues"), makeString("turowicz"), makeString("pope")), list(makeString("trouble"), makeString("things")), list(makeString("little"), makeString("perspective"), makeString("ways"), makeString("leaders"), makeString("times"), makeString("poles")), list(makeString("front"), makeString("page")), list(makeString("instituted"), makeString("practice")), list(makeString("time"), makeString("election")), list(makeString("three"), makeString("worker")), list(makeString("shown"), makeString("slawomir")), list(makeString("adding"), makeString("view"), makeString("shown"), makeString("us"), makeString("lies"), makeString("playwright")), list(makeString("say"), makeString("article"), makeString("essayist")), list(makeString("poles"), makeString("perspective"), makeString("newspaper")), list(makeString("provided"), makeString("use"), makeString("publication")), list(makeString("suffered"), makeString("attack")), list(makeString("wyborcza"), makeString("gazeta")), list(makeString("john"), makeString("brought"), makeString("mass")), list(makeString("attack"), makeString("heart")), list(makeString("believe"), makeString("tell"), makeString("adding")), list(makeString("things"), makeString("say")), list(makeString("annals"), makeString("tunnel"), makeString("culture")), list(makeString("called"), makeString("result"), makeString("group"), makeString("pax"), makeString("communists")), list(new SubLObject[]{ makeString("tunnel"), makeString("achievement"), makeString("based"), makeString("universal"), makeString("tygodnik"), makeString("name"), makeString("means"), makeString("precedent"), makeString("established"), makeString("provided"), makeString("added") }), list(makeString("nobel"), makeString("including"), makeString("daily"), makeString("news"), makeString("word"), makeString("paul")), list(new SubLObject[]{ makeString("worker"), makeString("poznan"), makeString("hungarian"), makeString("troops"), makeString("new"), makeString("rebellion"), makeString("leadership"), makeString("credibility"), makeString("uprisings"), makeString("sought"), makeString("returned") }), list(makeString("andrzej"), makeString("pseudonym")), list(makeString("generations"), makeString("paper"), makeString("taken"), makeString("commentator")), list(makeString("articles"), makeString("elsewhere"), makeString("bloc"), makeString("editor")), list(makeString("use"), makeString("andrzej"), makeString("pieces"), makeString("continued")), list(makeString("closest"), makeString("described"), makeString("papacy"), makeString("1978"), makeString("prayed"), makeString("friend"), makeString("soul")), list(makeString("officials"), makeString("stalin"), makeString("soviet")), list(makeString("article"), makeString("essayist"), makeString("moral"), makeString("periods"), makeString("idiotism")), list(makeString("deal"), makeString("east")), list(makeString("1968"), makeString("published")), list(makeString("pieces"), makeString("ran"), makeString("jawien")), list(makeString("bloc"), makeString("deal")), list(makeString("authority"), makeString("rational")), list(makeString("idiotism"), makeString("kisielewski"), makeString("featured")) }), list(list(makeSymbol("ASK-QAGA"), list(makeSymbol("QUOTE"), list(makeString("Jawien")))), makeString("*TUROWICZ* ran it on the *FRONT* *PAGE* under a pseudonym Andrzej *JAWIEN* which the future pope continued to use on his pieces in the publication "), makeString("He alone and nobody else lives in our hearts and symbolizes our dignity and pride said Al Musawir al Arabi *WEEKLY* in a *FRONT* *PAGE* editorial "), makeString("He ordered it done and was given the metal *FRONT* *PAGE* press plate as a souvenir "), makeString("A *FRONT* *PAGE* story of the first issue said that the exposition is profoundly and positively influencing the society and the economy in Yunnan ")), list(list(makeSymbol("ASK-GLIMPSE"), makeString("Jawien")), list(makeKeyword("FILE"), makeString("19990128_NYT.dir"), makeKeyword("ARTICLE"), makeInteger(467), makeKeyword("LINE"), makeInteger(69), makeKeyword("TEXT"), makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication."))), cons(list(makeSymbol("PARSE-DATE"), makeString("August 3, 1966")), makeInteger("19660803000000")), list(list(makeSymbol("INVOKE-WORDNET"), list(makeSymbol("QUOTE"), list(list(makeString("class"), makeString("word")), list(makeString("pos"), makeString("noun")), list(makeString("form"), makeString("sky")), list(makeString("method"), makeString("getSenses"))))), makeSymbol("LIST"), list(makeSymbol("NEW-SENSE-PROXY"), list(makeSymbol("NEW-SYNSET-PROXY"), makeString("noun"), makeInteger(7748403), makeString("outer space as viewed from the earth")), makeString("sky"))) });
    }

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

    
}

/**
 * Total time: 424 ms
 */
