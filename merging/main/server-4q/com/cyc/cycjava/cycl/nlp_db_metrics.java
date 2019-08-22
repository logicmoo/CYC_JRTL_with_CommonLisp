/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NLP-DB-METRICS
 * source file: /cyc/top/cycl/nlp-db-metrics.lisp
 * created:     2019/07/03 17:38:59
 */
public final class nlp_db_metrics extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt3$ = makeString("");

    public static final SubLFile me = new nlp_db_metrics();

 public static final String myName = "com.cyc.cycjava.cycl.nlp_db_metrics";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metric_db$ = makeSymbol("*LINK-METRIC-DB*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metric_user$ = makeSymbol("*LINK-METRIC-USER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metric_dbms_server$ = makeSymbol("*LINK-METRIC-DBMS-SERVER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metric_password$ = makeSymbol("*LINK-METRIC-PASSWORD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metric_subprotocol$ = makeSymbol("*LINK-METRIC-SUBPROTOCOL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metric_proxy_server$ = makeSymbol("*LINK-METRIC-PROXY-SERVER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $link_metrics_cyclification_timeout$ = makeSymbol("*LINK-METRICS-CYCLIFICATION-TIMEOUT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$nlp_metrics = makeString("nlp_metrics");

    static private final SubLString $$$postgres = makeString("postgres");

    static private final SubLString $str2$cyc11_cyc_com = makeString("cyc11.cyc.com");

    static private final SubLString $str3$ = makeString("");

    static private final SubLString $$$postgresql = makeString("postgresql");

    static private final SubLString $str5$billie_cyc_com = makeString("billie.cyc.com");

    private static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLList $list7 = list(list(makeSymbol("STMT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_SQL_STATEMENT = makeSymbol("WITH-SQL-STATEMENT");

    static private final SubLList $list9 = list(new SubLObject[]{ makeSymbol("*LINK-METRIC-DB*"), makeSymbol("*LINK-METRIC-USER*"), makeSymbol("*LINK-METRIC-PASSWORD*"), makeKeyword("DBMS-SERVER"), makeSymbol("*LINK-METRIC-DBMS-SERVER*"), makeKeyword("SUBPROTOCOL"), makeSymbol("*LINK-METRIC-SUBPROTOCOL*"), makeKeyword("PROXY-SERVER"), makeSymbol("*LINK-METRIC-PROXY-SERVER*") });

    private static final SubLSymbol SDBC_ERROR_P = makeSymbol("SDBC-ERROR-P");

    private static final SubLSymbol SDBC_ERROR_THROW = makeSymbol("SDBC-ERROR-THROW");

    static private final SubLList $list13 = list(list(makeSymbol("RS"), makeSymbol("QUERY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_SQL_RESULT_SET = makeSymbol("WITH-SQL-RESULT-SET");

    private static final SubLSymbol WITH_LINK_METRICS_RESULT_SET = makeSymbol("WITH-LINK-METRICS-RESULT-SET");

    private static final SubLSymbol SQL_RESULT_SET_P = makeSymbol("SQL-RESULT-SET-P");

    private static final SubLSymbol SQLRS_NEXT = makeSymbol("SQLRS-NEXT");

    static private final SubLList $list19 = list(list(makeSymbol("SENTENCE-ID"), makeSymbol("SENTENCE"), makeSymbol("CORPUS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_LINK_METRICS_RESULT_SET = makeSymbol("DO-LINK-METRICS-RESULT-SET");

    static private final SubLString $str24$SELECT_sentence_id__sentence_cont = makeString("SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = \'~a\'\n                         AND sentence.corpus_id = corpus.id");

    private static final SubLSymbol POSTGRESQL_ESCAPE_STRING = makeSymbol("POSTGRESQL-ESCAPE-STRING");

    static private final SubLList $list27 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), ONE_INTEGER));

    static private final SubLList $list28 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), TWO_INTEGER));

    static private final SubLList $list29 = list(list(new SubLObject[]{ makeSymbol("LINKAGE-ID"), makeSymbol("LS"), makeSymbol("SENTENCE-ID"), makeSymbol("SENTENCE"), makeSymbol("START"), makeSymbol("DURATION"), makeSymbol("RUN-ID"), makeSymbol("&OPTIONAL"), makeSymbol("LEXICON") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str30$SELECT_raw_linkage_id__raw_linkag = makeString("SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ~a\n                         AND raw_linkage.sentence_id = sentence.id");

    static private final SubLList $list31 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), THREE_INTEGER));

    static private final SubLList $list32 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), FOUR_INTEGER));

    static private final SubLList $list34 = list(makeSymbol("SQL-NULL-P"), list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), TWO_INTEGER));

    private static final SubLSymbol NEW_LINK_STRUCTURES = makeSymbol("NEW-LINK-STRUCTURES");

    static private final SubLList $list37 = list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), TWO_INTEGER));

    static private final SubLList $list38 = list(T);

    static private final SubLList $list39 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), FIVE_INTEGER));

    static private final SubLList $list40 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), SIX_INTEGER));

    static private final SubLList $list41 = list(new SubLObject[]{ makeSymbol("LINKAGE"), makeSymbol("LEX-VERB-COUNT"), makeSymbol("LEX-NOUN-COUNT"), makeSymbol("LEX-ADJ-COUNT"), makeSymbol("LEX-ADV-COUNT"), makeSymbol("VERB-INTERPS-COUNTS"), makeSymbol("NOUN-INTERPS-COUNTS"), makeSymbol("ADJ-INTERPS-COUNTS"), makeSymbol("ADV-INTERPS-COUNTS") });

    private static final SubLSymbol LINKAGE_LEXIFIED_COUNT = makeSymbol("LINKAGE-LEXIFIED-COUNT");

    static private final SubLList $list45 = list(list(QUOTE, makeSymbol("VERB-LINK-WORD-P")));

    static private final SubLList $list46 = list(list(QUOTE, makeSymbol("NOUN-LINK-WORD-P")));

    static private final SubLList $list47 = list(list(QUOTE, makeSymbol("ADJECTIVE-LINK-WORD-P")));

    static private final SubLList $list48 = list(list(QUOTE, makeSymbol("ADVERB-LINK-WORD-P")));

    private static final SubLSymbol LINKAGE_INTERPS_COUNT = makeSymbol("LINKAGE-INTERPS-COUNT");

    static private final SubLString $str59$SELECT_sentence_id__sentence_cont = makeString("SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = \'");

    static private final SubLString $str60$___________________________AND_se = makeString("\'\n                         AND sentence.corpus_id = corpus.id");

    static private final SubLString $str61$___a___a___a__ = makeString("~%~a, ~a: ~a~%");

    static private final SubLSymbol $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION = makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION");

    private static final SubLSymbol NOUN_LINK_WORD_P = makeSymbol("NOUN-LINK-WORD-P");

    private static final SubLSymbol ADJECTIVE_LINK_WORD_P = makeSymbol("ADJECTIVE-LINK-WORD-P");

    private static final SubLSymbol ADVERB_LINK_WORD_P = makeSymbol("ADVERB-LINK-WORD-P");

    static private final SubLString $str71$SELECT_raw_linkage_id__raw_linkag = makeString("SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ");

    static private final SubLString $str72$__________________________AND_raw = makeString("\n                         AND raw_linkage.sentence_id = sentence.id");

    static private final SubLString $str73$SELECT_corpus_name________FROM_ru = makeString("SELECT corpus.name\n       FROM run, corpus\n       WHERE run.id = ");

    static private final SubLString $str74$________AND_run_corpus_id___corpu = makeString("\n       AND run.corpus_id = corpus.id");

    static private final SubLString $str75$DELETE_FROM_justification________ = makeString("DELETE FROM justification\n           WHERE justification.cyclf_id = cyclifications.id\n           AND cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str76$DELETE_FROM_cyclifications_______ = makeString("DELETE FROM cyclifications\n           WHERE cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str77$DELETE_FROM_link_cyclification___ = makeString("DELETE FROM link_cyclification\n           WHERE link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str78$DELETE_FROM_full_linkage_________ = makeString("DELETE FROM full_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str79$DELETE_FROM_word_linkage_________ = makeString("DELETE FROM word_linkage\n           WHERE word_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str80$DELETE_FROM_raw_linkage__________ = makeString("DELETE FROM raw_linkage\n           WHERE raw_linkage.run_id = ");

    static private final SubLString $str81$DELETE_FROM_run_statistics_______ = makeString("DELETE FROM run_statistics\n           WHERE run_id = ");

    static private final SubLString $str82$DELETE_FROM_run____________WHERE_ = makeString("DELETE FROM run\n           WHERE run.id = ");

    static private final SubLString $str83$SELECT_count_sentence_id_________ = makeString("SELECT count(sentence_id)\n       FROM raw_linkage\n       WHERE run_id = ");

    static private final SubLString $str84$SELECT_link_cyclification_id_____ = makeString("SELECT link_cyclification.id, \n                  COUNT(xml) AS cycl_counts\n           FROM link_cyclification, cyclifications\n           WHERE link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str85$____________GROUP_BY_link_cyclifi = makeString("\n           GROUP BY link_cyclification.id");

    static private final SubLString $str86$SELECT_COUNT_link_cyclification_i = makeString("SELECT COUNT(link_cyclification.id)\n       FROM link_cyclification\n       WHERE link_cyclification.linkage_id = full_linkage.id\n       AND full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = ");

    static private final SubLString $str87$________AND_NOT_EXISTS___________ = makeString("\n       AND NOT EXISTS\n          (SELECT link_cyclf_id\n           FROM cyclifications\n           WHERE link_cyclification.id = cyclifications.link_cyclf_id)");

    static private final SubLString $str88$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NULL\n           AND sentence_id = sentence.id\n           AND run_id = ");

    static private final SubLString $str89$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NOT NULL\n           AND sentence_id = sentence.id\n           AND run_id = ");

    static private final SubLString $str90$SELECT_AVG_lexified_count________ = makeString("SELECT AVG(lexified_count)\n       FROM full_linkage, raw_linkage\n       WHERE full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = ");

    static private final SubLString $str91$SELECT_lexified_count____________ = makeString("SELECT lexified_count\n           FROM full_linkage, raw_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str92$SELECT_sentence_contents__raw_lin = makeString("SELECT sentence.contents, raw_linkage1.contents, raw_linkage2.contents\n           FROM sentence,\n                raw_linkage AS raw_linkage1,\n                raw_linkage AS raw_linkage2\n           WHERE raw_linkage1.run_id = ");

    static private final SubLString $str93$____________AND_raw_linkage2_run_ = makeString("\n           AND raw_linkage2.run_id = ");

    static private final SubLString $str94$____________AND_raw_linkage1_sent = makeString("\n           AND raw_linkage1.sentence_id = raw_linkage2.sentence_id\n           AND raw_linkage1.sentence_id = sentence.id\n           AND raw_linkage1.contents <> raw_linkage2.contents");

    static private final SubLString $str95$_a____a____a____a____a___________ = makeString("~a~%=~a=~%~a~%=~a=~%~a~%=============================================~%");

    static private final SubLString $str96$lex_verb_count = makeString("lex_verb_count");

    static private final SubLString $str97$lex_noun_count = makeString("lex_noun_count");

    static private final SubLString $str98$lex_adj_count = makeString("lex_adj_count");

    static private final SubLString $str99$lex_adv_count = makeString("lex_adv_count");

    static private final SubLString $str100$mean_verb_lexes = makeString("mean_verb_lexes");

    static private final SubLString $str101$mean_noun_lexes = makeString("mean_noun_lexes");

    static private final SubLString $str102$mean_adj_lexes = makeString("mean_adj_lexes");

    static private final SubLString $str103$mean_adv_lexes = makeString("mean_adv_lexes");

    static private final SubLString $str104$med_verb_lexes = makeString("med_verb_lexes");

    static private final SubLString $str105$med_noun_lexes = makeString("med_noun_lexes");

    static private final SubLString $str106$med_adj_lexes = makeString("med_adj_lexes");

    static private final SubLString $str107$med_adv_lexes = makeString("med_adv_lexes");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    static private final SubLString $str110$SELECT_duration_____________FROM_ = makeString("SELECT duration \n           FROM raw_linkage\n           WHERE contents is NULL\n           AND run_id = ");

    static private final SubLSymbol $sym111$_ = makeSymbol("<");

    static private final SubLString $str113$SELECT_duration_____________FROM_ = makeString("SELECT duration \n           FROM raw_linkage\n           WHERE contents is NOT NULL\n           AND run_id = ");

    static private final SubLString $str114$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NULL\n           AND run_id = ");

    static private final SubLString $str115$____________AND_sentence_id___sen = makeString("\n           AND sentence.id = sentence_id");

    static private final SubLString $str116$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NOT NULL\n           AND run_id = ");

    static private final SubLString $str117$_a_t_a_T__ = makeString("~a~t~a~T~%");

    static private final SubLString $str118$_home_aldag_time_count_failed_100 = makeString("/home/aldag/time-count-failed-100.txt");

    static private final SubLString $str120$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str121$_home_aldag_time_count_succeeded_ = makeString("/home/aldag/time-count-succeeded-100.txt");

    static private final SubLString $str122$_home_aldag_length_count_failed_1 = makeString("/home/aldag/length-count-failed-100.txt");

    static private final SubLString $str123$_home_aldag_length_count_succeede = makeString("/home/aldag/length-count-succeeded-100.txt");

    static private final SubLString $str124$SELECT_id__name__comment_FROM_cor = makeString("SELECT id, name, comment FROM corpus");

    static private final SubLString $str128$SELECT_COUNT_id__from_sentence_wh = makeString("SELECT COUNT(id) from sentence where corpus_id=");

    static private final SubLString $str129$_ = makeString(";");

    static private final SubLString $str130$SELECT_id__type__comment__kb__rev = makeString("SELECT id, type, comment, kb, revision, start FROM run where corpus_id = ");

    static private final SubLString $str135$_ = makeString("'");

    static private final SubLString $str137$INSERT_INTO_corpus_name__comment_ = makeString("INSERT INTO corpus(name, comment) VALUES(");

    static private final SubLString $str138$__ = makeString(", ");

    static private final SubLString $str139$__ = makeString(");");

    static private final SubLString $str140$INSERT_INTO_sentence_corpus_id__c = makeString("INSERT INTO sentence(corpus_id, contents) VALUES(");

    static private final SubLString $str141$SELECT_id_from_sentence_WHERE_cor = makeString("SELECT id from sentence WHERE corpus_id=");

    static private final SubLString $str142$_AND_contents_ = makeString(" AND contents=");

    private static final SubLSymbol SQL_STATEMENT_P = makeSymbol("SQL-STATEMENT-P");

    static private final SubLString $str146$run_id_seq = makeString("run_id_seq");

    static private final SubLString $str147$INSERT_INTO_run_VALUES_ = makeString("INSERT INTO run VALUES(");

    static private final SubLString $str148$__ = makeString(",'");

    static private final SubLString $str149$____ = makeString("', '");

    static private final SubLString $str150$___ = makeString("', ");

    static private final SubLString $str151$___ = makeString(", '");

    static private final SubLString $str152$__ = makeString("')");

    static private final SubLString $str153$raw_linkage_id_seq = makeString("raw_linkage_id_seq");

    static private final SubLString $str154$INSERT_INTO_raw_linkage_VALUES_ = makeString("INSERT INTO raw_linkage VALUES(");

    static private final SubLString $str155$_ = makeString(")");

    static private final SubLString $str158$word_linkage_id_seq = makeString("word_linkage_id_seq");

    static private final SubLString $str159$INSERT_INTO_word_linkage_VALUES_ = makeString("INSERT INTO word_linkage VALUES(");

    static private final SubLString $str160$full_linkage_id_seq = makeString("full_linkage_id_seq");

    private static final SubLSymbol LINK_WORD_P = makeSymbol("LINK-WORD-P");

    static private final SubLString $str163$INSERT_INTO_full_linkage_VALUES_ = makeString("INSERT INTO full_linkage VALUES(");

    static private final SubLString $str166$timed_out__ = makeString("timed out~%");

    static private final SubLString $str167$link_cyclification_id_seq = makeString("link_cyclification_id_seq");

    static private final SubLString $str168$INSERT_INTO_link_cyclification_VA = makeString("INSERT INTO link_cyclification VALUES(");

    static private final SubLString $str169$INSERT_INTO_cyclifications_VALUES = makeString("INSERT INTO cyclifications VALUES(");



    static private final SubLString $str171$cyclifications_id_seq = makeString("cyclifications_id_seq");

    static private final SubLString $str172$INSERT_INTO_justification_VALUES_ = makeString("INSERT INTO justification VALUES(");

    static private final SubLString $str173$INSERT_INTO_run_statistics_VALUES = makeString("INSERT INTO run_statistics VALUES(~a, ~a, ~a, ~a, ~a, ~f, ~f, ~f, ~f, ~f, ~f, ~f, ~f)");

    static private final SubLString $str174$SELECT_raw_linkage_contents______ = makeString("SELECT raw_linkage.contents \n             FROM raw_linkage, sentence \n             WHERE raw_linkage.contents IS NOT NULL \n             AND raw_linkage.sentence_id = sentence.id \n             AND sentence.contents = \'");

    static private final SubLString $str175$________________ORDER_BY_raw_link = makeString("\' \n             ORDER BY raw_linkage.start DESC\n             LIMIT 1");

    static private final SubLString $$$SELECT_ = makeString("SELECT ");

    static private final SubLString $str177$_________FROM_run_statistics_____ = makeString(" \n       FROM run_statistics \n       WHERE run_id = ");

    static private final SubLString $str180$__ = makeString("\\\'");

    static private final SubLString $str181$SELECT_id_FROM_corpus_WHERE_name_ = makeString("SELECT id FROM corpus WHERE name = '");

    static private final SubLString $str182$Can_t_determine_id_for_unknown_co = makeString("Can't determine id for unknown corpus ~a");

    static private final SubLString $str183$SELECT_nextval__ = makeString("SELECT nextval('");

    static private final SubLString $str184$_4__0D__2__0D__2__0D__2__0D__2__0 = makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D");

    public static final SubLObject with_link_metrics_statement_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stmt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    stmt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(WITH_SQL_STATEMENT, bq_cons(stmt, $list_alt9), list(PWHEN, list(SDBC_ERROR_P, stmt), list(SDBC_ERROR_THROW, stmt)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_link_metrics_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stmt = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        stmt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_SQL_STATEMENT, bq_cons(stmt, $list9), list(PWHEN, list(SDBC_ERROR_P, stmt), list(SDBC_ERROR_THROW, stmt)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject with_link_metrics_result_set_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject rs = NIL;
                    SubLObject query = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    rs = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    query = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(WITH_SQL_RESULT_SET, listS(rs, query, $list_alt9), list(PWHEN, list(SDBC_ERROR_P, rs), list(SDBC_ERROR_THROW, rs)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt13);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_link_metrics_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = NIL;
        SubLObject query = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        rs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        query = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_SQL_RESULT_SET, listS(rs, query, $list9), list(PWHEN, list(SDBC_ERROR_P, rs), list(SDBC_ERROR_THROW, rs)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list13);
        return NIL;
    }

    public static final SubLObject do_link_metrics_result_set_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject rs = NIL;
                    SubLObject query = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    rs = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    query = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_LINK_METRICS_RESULT_SET, list(rs, query), list(PWHEN, list(SQL_RESULT_SET_P, rs), listS(WHILE, list(SQLRS_NEXT, rs), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt13);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_link_metrics_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = NIL;
        SubLObject query = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        rs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        query = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_LINK_METRICS_RESULT_SET, list(rs, query), list(PWHEN, list(SQL_RESULT_SET_P, rs), listS(WHILE, list(SQLRS_NEXT, rs), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list13);
        return NIL;
    }

    public static final SubLObject do_link_metrics_corpus_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sentence_id = NIL;
                    SubLObject sentence = NIL;
                    SubLObject corpus = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    sentence_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    corpus = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, list(sentence_id, sentence), listS(DO_LINK_METRICS_RESULT_SET, list(RS, list(FORMAT_NIL, $str_alt24$SELECT_sentence_id__sentence_cont, list(POSTGRESQL_ESCAPE_STRING, corpus))), listS(CSETQ, sentence_id, $list_alt27), listS(CSETQ, sentence, $list_alt28), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt19);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_link_metrics_corpus(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_id = NIL;
        SubLObject sentence = NIL;
        SubLObject corpus = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        sentence_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        corpus = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(sentence_id, sentence), listS(DO_LINK_METRICS_RESULT_SET, list(RS, list(FORMAT_NIL, $str24$SELECT_sentence_id__sentence_cont, list(POSTGRESQL_ESCAPE_STRING, corpus))), listS(CSETQ, sentence_id, $list27), listS(CSETQ, sentence, $list28), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list19);
        return NIL;
    }

    public static final SubLObject do_link_metrics_link_structures_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject linkage_id = NIL;
                    SubLObject ls = NIL;
                    SubLObject sentence_id = NIL;
                    SubLObject sentence = NIL;
                    SubLObject start = NIL;
                    SubLObject duration = NIL;
                    SubLObject run_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    linkage_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    ls = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    sentence_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    duration = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    run_id = current.first();
                    current = current.rest();
                    {
                        SubLObject lexicon = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt29);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(linkage_id, ls, sentence_id, sentence, start, duration), listS(DO_LINK_METRICS_RESULT_SET, new SubLObject[]{ list(RS, list(FORMAT_NIL, $str_alt30$SELECT_raw_linkage_id__raw_linkag, run_id)), listS(CSETQ, linkage_id, $list_alt27), listS(CSETQ, sentence_id, $list_alt31), listS(CSETQ, sentence, $list_alt32), list(CSETQ, ls, list(FIF, $list_alt34, NIL, list(FIRST, listS(NEW_LINK_STRUCTURES, $list_alt37, lexicon, sentence, $list_alt38)))), listS(CSETQ, start, $list_alt39), listS(CSETQ, duration, $list_alt40), append(body, NIL) }));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt29);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_link_metrics_link_structures(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject linkage_id = NIL;
        SubLObject ls = NIL;
        SubLObject sentence_id = NIL;
        SubLObject sentence = NIL;
        SubLObject start = NIL;
        SubLObject duration = NIL;
        SubLObject run_id = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        linkage_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        ls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        sentence_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        start = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        duration = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        run_id = current.first();
        current = current.rest();
        final SubLObject lexicon = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list29);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(linkage_id, ls, sentence_id, sentence, start, duration), listS(DO_LINK_METRICS_RESULT_SET, new SubLObject[]{ list(RS, list(FORMAT_NIL, $str30$SELECT_raw_linkage_id__raw_linkag, run_id)), listS(CSETQ, linkage_id, $list27), listS(CSETQ, sentence_id, $list31), listS(CSETQ, sentence, $list32), list(CSETQ, ls, list(FIF, $list34, NIL, list(FIRST, listS(NEW_LINK_STRUCTURES, $list37, lexicon, sentence, $list38)))), listS(CSETQ, start, $list39), listS(CSETQ, duration, $list40), append(body, NIL) }));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static final SubLObject update_lexicon_statistics_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_linkage = NIL;
            SubLObject lex_verb_count = NIL;
            SubLObject lex_noun_count = NIL;
            SubLObject lex_adj_count = NIL;
            SubLObject lex_adv_count = NIL;
            SubLObject verb_interps_counts = NIL;
            SubLObject noun_interps_counts = NIL;
            SubLObject adj_interps_counts = NIL;
            SubLObject adv_interps_counts = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            v_linkage = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            lex_verb_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            lex_noun_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            lex_adj_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            lex_adv_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            verb_interps_counts = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            noun_interps_counts = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            adj_interps_counts = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt41);
            adv_interps_counts = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, list(new SubLObject[]{ PWHEN, v_linkage, list(CINC, lex_verb_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list_alt45)), list(CINC, lex_noun_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list_alt46)), list(CINC, lex_adj_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list_alt47)), list(CINC, lex_adv_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list_alt48)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list_alt45)), list(CPUSH, COUNT, verb_interps_counts)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list_alt46)), list(CPUSH, COUNT, noun_interps_counts)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list_alt47)), list(CPUSH, COUNT, adj_interps_counts)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list_alt48)), list(CPUSH, COUNT, adv_interps_counts)) }));
            } else {
                cdestructuring_bind_error(datum, $list_alt41);
            }
        }
        return NIL;
    }

    public static SubLObject update_lexicon_statistics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_linkage = NIL;
        SubLObject lex_verb_count = NIL;
        SubLObject lex_noun_count = NIL;
        SubLObject lex_adj_count = NIL;
        SubLObject lex_adv_count = NIL;
        SubLObject verb_interps_counts = NIL;
        SubLObject noun_interps_counts = NIL;
        SubLObject adj_interps_counts = NIL;
        SubLObject adv_interps_counts = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        v_linkage = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        lex_verb_count = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        lex_noun_count = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        lex_adj_count = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        lex_adv_count = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        verb_interps_counts = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        noun_interps_counts = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        adj_interps_counts = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        adv_interps_counts = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(new SubLObject[]{ PWHEN, v_linkage, list(CINC, lex_verb_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list45)), list(CINC, lex_noun_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list46)), list(CINC, lex_adj_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list47)), list(CINC, lex_adv_count, listS(LINKAGE_LEXIFIED_COUNT, v_linkage, $list48)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list45)), list(CPUSH, COUNT, verb_interps_counts)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list46)), list(CPUSH, COUNT, noun_interps_counts)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list47)), list(CPUSH, COUNT, adj_interps_counts)), list(CDOLIST, list(COUNT, listS(LINKAGE_INTERPS_COUNT, v_linkage, $list48)), list(CPUSH, COUNT, adv_interps_counts)) }));
        }
        cdestructuring_bind_error(datum, $list41);
        return NIL;
    }

    public static final SubLObject db_raw_linkage_run_alt(SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(corpus, STRINGP);
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject run_id = com.cyc.cycjava.cycl.nlp_db_metrics.insert_run(stmt, ONE_INTEGER, corpus, comment);
                        SubLObject sentence_id = NIL;
                        SubLObject sentence = NIL;
                        SubLObject rs = NIL;
                        SubLObject statement = NIL;
                        SubLObject connection_1 = NIL;
                        try {
                            connection_1 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                            if (NIL != sdbc.sql_open_connection_p(connection_1)) {
                                statement = sdbc.sqlc_create_statement(connection_1);
                            } else {
                                statement = connection_1;
                            }
                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(corpus)), $str_alt60$___________________________AND_se }), UNPROVIDED);
                            } else {
                                rs = statement;
                            }
                            if (NIL != sdbc.sdbc_error_p(rs)) {
                                sdbc.sdbc_error_throw(rs);
                            }
                            if (NIL != sdbc.sql_result_set_p(rs)) {
                                while (NIL != sdbc.sqlrs_next(rs)) {
                                    sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                    sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                                    i = add(i, ONE_INTEGER);
                                    {
                                        SubLObject error = NIL;
                                        format(T, $str_alt61$___a___a___a__, new SubLObject[]{ com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                                        finish_output(UNPROVIDED);
                                        try {
                                            {
                                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        com.cyc.cycjava.cycl.nlp_db_metrics.insert_raw_linkage(stmt, sentence, run_id, sentence_id, NIL);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        }
                                        if (NIL != error) {
                                            Errors.warn(error);
                                        }
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != sdbc.sql_connection_p(connection_1)) {
                                        sdbc.sqlc_close(connection_1);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    public static SubLObject db_raw_linkage_run(final SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(corpus) : "! stringp(corpus) " + ("Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) ") + corpus;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        SubLObject i = ZERO_INTEGER;
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, ONE_INTEGER, corpus, comment);
            SubLObject sentence_id = NIL;
            SubLObject sentence = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection_$1 = NIL;
            try {
                connection_$1 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection_$1)) {
                    statement = sdbc.sqlc_create_statement(connection_$1);
                } else {
                    statement = connection_$1;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, cconcatenate($str59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), $str60$___________________________AND_se }), UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                        i = add(i, ONE_INTEGER);
                        SubLObject error = NIL;
                        format(T, $str61$___a___a___a__, new SubLObject[]{ iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                        finish_output(UNPROVIDED);
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    insert_raw_linkage(stmt, sentence, run_id, sentence_id, NIL);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != error) {
                            Errors.warn(error);
                        }
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection_$1)) {
                        sdbc.sqlc_close(connection_$1);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    public static final SubLObject db_word_linkage_run_alt(SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(corpus, STRINGP);
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject lexicon = object.new_class_instance($sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject run_id = com.cyc.cycjava.cycl.nlp_db_metrics.insert_run(stmt, TWO_INTEGER, corpus, comment);
                        SubLObject raw_linkage = NIL;
                        SubLObject raw_linkage_id = NIL;
                        SubLObject terror = NIL;
                        SubLObject sentence_id = NIL;
                        SubLObject sentence = NIL;
                        SubLObject rs = NIL;
                        SubLObject statement = NIL;
                        SubLObject connection_2 = NIL;
                        try {
                            connection_2 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                            if (NIL != sdbc.sql_open_connection_p(connection_2)) {
                                statement = sdbc.sqlc_create_statement(connection_2);
                            } else {
                                statement = connection_2;
                            }
                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(corpus)), $str_alt60$___________________________AND_se }), UNPROVIDED);
                            } else {
                                rs = statement;
                            }
                            if (NIL != sdbc.sdbc_error_p(rs)) {
                                sdbc.sdbc_error_throw(rs);
                            }
                            if (NIL != sdbc.sql_result_set_p(rs)) {
                                while (NIL != sdbc.sqlrs_next(rs)) {
                                    sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                    sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                                    i = add(i, ONE_INTEGER);
                                    terror = NIL;
                                    format(T, $str_alt61$___a___a___a__, new SubLObject[]{ com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                                    finish_output(UNPROVIDED);
                                    if (NIL != sentence) {
                                        {
                                            SubLObject connection_3 = sdbc.sqls_get_connection(stmt);
                                            SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_3);
                                            SubLObject commit_error = NIL;
                                            SubLObject rollback_result = NIL;
                                            SubLObject auto_commit_result = NIL;
                                            SubLObject errors = NIL;
                                            if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                                errors = cons(auto_commit, errors);
                                            } else {
                                                sdbc.sqlc_set_error_handling(connection_3, $THROW);
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                if (NIL != auto_commit) {
                                                                    sdbc.sqlc_set_auto_commit(connection_3, NIL);
                                                                }
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject raw_linkage_4 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                                                    SubLObject raw_linkage_id_5 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    raw_linkage = raw_linkage_4;
                                                                    raw_linkage_id = raw_linkage_id_5;
                                                                }
                                                                com.cyc.cycjava.cycl.nlp_db_metrics.insert_word_linkage(stmt, sentence, raw_linkage, raw_linkage_id);
                                                                sdbc.sqlc_commit(connection_3);
                                                            } catch (Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                }
                                                sdbc.sqlc_set_error_handling(connection_3, $RETURN);
                                                if (NIL != commit_error) {
                                                    errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                    rollback_result = sdbc.sqls_handle_rollback(connection_3);
                                                    if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                        errors = cons(rollback_result, errors);
                                                    }
                                                }
                                                if (NIL != auto_commit) {
                                                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_3, T);
                                                }
                                                if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                    errors = cons(auto_commit_result, errors);
                                                }
                                            }
                                            if (NIL != errors) {
                                                terror = sdbc.sqls_handle_transaction_errors(errors);
                                            }
                                        }
                                        if (NIL != terror) {
                                            sdbc.sdbc_error_warn(terror);
                                        }
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != sdbc.sql_connection_p(connection_2)) {
                                        sdbc.sqlc_close(connection_2);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    public static SubLObject db_word_linkage_run(final SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(corpus) : "! stringp(corpus) " + ("Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) ") + corpus;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        SubLObject i = ZERO_INTEGER;
        final SubLObject lexicon = object.new_class_instance($sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, TWO_INTEGER, corpus, comment);
            SubLObject raw_linkage = NIL;
            SubLObject raw_linkage_id = NIL;
            SubLObject terror = NIL;
            SubLObject sentence_id = NIL;
            SubLObject sentence = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection_$2 = NIL;
            try {
                connection_$2 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection_$2)) {
                    statement = sdbc.sqlc_create_statement(connection_$2);
                } else {
                    statement = connection_$2;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, cconcatenate($str59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), $str60$___________________________AND_se }), UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                        i = add(i, ONE_INTEGER);
                        terror = NIL;
                        format(T, $str61$___a___a___a__, new SubLObject[]{ iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                        finish_output(UNPROVIDED);
                        if (NIL != sentence) {
                            final SubLObject connection_$3 = sdbc.sqls_get_connection(stmt);
                            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$3);
                            SubLObject commit_error = NIL;
                            SubLObject rollback_result = NIL;
                            SubLObject auto_commit_result = NIL;
                            SubLObject errors = NIL;
                            if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                errors = cons(auto_commit, errors);
                            } else {
                                sdbc.sqlc_set_error_handling(connection_$3, $THROW);
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (NIL != auto_commit) {
                                                sdbc.sqlc_set_auto_commit(connection_$3, NIL);
                                            }
                                            thread.resetMultipleValues();
                                            final SubLObject raw_linkage_$4 = insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                            final SubLObject raw_linkage_id_$5 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            raw_linkage = raw_linkage_$4;
                                            raw_linkage_id = raw_linkage_id_$5;
                                            insert_word_linkage(stmt, sentence, raw_linkage, raw_linkage_id);
                                            sdbc.sqlc_commit(connection_$3);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                sdbc.sqlc_set_error_handling(connection_$3, $RETURN);
                                if (NIL != commit_error) {
                                    errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                    rollback_result = sdbc.sqls_handle_rollback(connection_$3);
                                    if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                        errors = cons(rollback_result, errors);
                                    }
                                }
                                if (NIL != auto_commit) {
                                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$3, T);
                                }
                                if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                    errors = cons(auto_commit_result, errors);
                                }
                            }
                            if (NIL != errors) {
                                terror = sdbc.sqls_handle_transaction_errors(errors);
                            }
                            if (NIL == terror) {
                                continue;
                            }
                            sdbc.sdbc_error_warn(terror);
                        }
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection_$2)) {
                        sdbc.sqlc_close(connection_$2);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    public static final SubLObject db_full_linkage_run_alt(SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(corpus, STRINGP);
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject lexicon = object.new_class_instance($sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject run_id = com.cyc.cycjava.cycl.nlp_db_metrics.insert_run(stmt, THREE_INTEGER, corpus, comment);
                        SubLObject raw_linkage = NIL;
                        SubLObject raw_linkage_id = NIL;
                        SubLObject terror = NIL;
                        SubLObject sentence_id = NIL;
                        SubLObject sentence = NIL;
                        SubLObject rs = NIL;
                        SubLObject statement = NIL;
                        SubLObject connection_6 = NIL;
                        try {
                            connection_6 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                            if (NIL != sdbc.sql_open_connection_p(connection_6)) {
                                statement = sdbc.sqlc_create_statement(connection_6);
                            } else {
                                statement = connection_6;
                            }
                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(corpus)), $str_alt60$___________________________AND_se }), UNPROVIDED);
                            } else {
                                rs = statement;
                            }
                            if (NIL != sdbc.sdbc_error_p(rs)) {
                                sdbc.sdbc_error_throw(rs);
                            }
                            if (NIL != sdbc.sql_result_set_p(rs)) {
                                while (NIL != sdbc.sqlrs_next(rs)) {
                                    sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                    sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                                    i = add(i, ONE_INTEGER);
                                    terror = NIL;
                                    format(T, $str_alt61$___a___a___a__, new SubLObject[]{ com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                                    finish_output(UNPROVIDED);
                                    {
                                        SubLObject connection_7 = sdbc.sqls_get_connection(stmt);
                                        SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_7);
                                        SubLObject commit_error = NIL;
                                        SubLObject rollback_result = NIL;
                                        SubLObject auto_commit_result = NIL;
                                        SubLObject errors = NIL;
                                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                            errors = cons(auto_commit, errors);
                                        } else {
                                            sdbc.sqlc_set_error_handling(connection_7, $THROW);
                                            try {
                                                {
                                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            if (NIL != auto_commit) {
                                                                sdbc.sqlc_set_auto_commit(connection_7, NIL);
                                                            }
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject raw_linkage_8 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                                                SubLObject raw_linkage_id_9 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                raw_linkage = raw_linkage_8;
                                                                raw_linkage_id = raw_linkage_id_9;
                                                            }
                                                            com.cyc.cycjava.cycl.nlp_db_metrics.insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                                            sdbc.sqlc_commit(connection_7);
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                            sdbc.sqlc_set_error_handling(connection_7, $RETURN);
                                            if (NIL != commit_error) {
                                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                rollback_result = sdbc.sqls_handle_rollback(connection_7);
                                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                    errors = cons(rollback_result, errors);
                                                }
                                            }
                                            if (NIL != auto_commit) {
                                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_7, T);
                                            }
                                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                errors = cons(auto_commit_result, errors);
                                            }
                                        }
                                        if (NIL != errors) {
                                            terror = sdbc.sqls_handle_transaction_errors(errors);
                                        }
                                    }
                                    if (NIL != terror) {
                                        sdbc.sdbc_error_warn(terror);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != sdbc.sql_connection_p(connection_6)) {
                                        sdbc.sqlc_close(connection_6);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    public static SubLObject db_full_linkage_run(final SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(corpus) : "! stringp(corpus) " + ("Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) ") + corpus;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        SubLObject i = ZERO_INTEGER;
        final SubLObject lexicon = object.new_class_instance($sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, THREE_INTEGER, corpus, comment);
            SubLObject raw_linkage = NIL;
            SubLObject raw_linkage_id = NIL;
            SubLObject terror = NIL;
            SubLObject sentence_id = NIL;
            SubLObject sentence = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection_$6 = NIL;
            try {
                connection_$6 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection_$6)) {
                    statement = sdbc.sqlc_create_statement(connection_$6);
                } else {
                    statement = connection_$6;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, cconcatenate($str59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), $str60$___________________________AND_se }), UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                        i = add(i, ONE_INTEGER);
                        terror = NIL;
                        format(T, $str61$___a___a___a__, new SubLObject[]{ iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                        finish_output(UNPROVIDED);
                        final SubLObject connection_$7 = sdbc.sqls_get_connection(stmt);
                        final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$7);
                        SubLObject commit_error = NIL;
                        SubLObject rollback_result = NIL;
                        SubLObject auto_commit_result = NIL;
                        SubLObject errors = NIL;
                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = cons(auto_commit, errors);
                        } else {
                            sdbc.sqlc_set_error_handling(connection_$7, $THROW);
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (NIL != auto_commit) {
                                            sdbc.sqlc_set_auto_commit(connection_$7, NIL);
                                        }
                                        thread.resetMultipleValues();
                                        final SubLObject raw_linkage_$8 = insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                        final SubLObject raw_linkage_id_$9 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        raw_linkage = raw_linkage_$8;
                                        raw_linkage_id = raw_linkage_id_$9;
                                        insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                        sdbc.sqlc_commit(connection_$7);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$7, $RETURN);
                            if (NIL != commit_error) {
                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_$7);
                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = cons(rollback_result, errors);
                                }
                            }
                            if (NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$7, T);
                            }
                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = cons(auto_commit_result, errors);
                            }
                        }
                        if (NIL != errors) {
                            terror = sdbc.sqls_handle_transaction_errors(errors);
                        }
                        if (NIL != terror) {
                            sdbc.sdbc_error_warn(terror);
                        }
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection_$6)) {
                        sdbc.sqlc_close(connection_$6);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    public static final SubLObject db_link_cyclification_run_alt(SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(corpus, STRINGP);
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject lexicon = object.new_class_instance($sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject run_id = com.cyc.cycjava.cycl.nlp_db_metrics.insert_run(stmt, FOUR_INTEGER, corpus, comment);
                        SubLObject raw_linkage = NIL;
                        SubLObject raw_linkage_id = NIL;
                        SubLObject v_linkage = NIL;
                        SubLObject linkage_id = NIL;
                        SubLObject lex_verb_count = ZERO_INTEGER;
                        SubLObject lex_noun_count = ZERO_INTEGER;
                        SubLObject lex_adj_count = ZERO_INTEGER;
                        SubLObject lex_adv_count = ZERO_INTEGER;
                        SubLObject verb_interps_counts = NIL;
                        SubLObject noun_interps_counts = NIL;
                        SubLObject adj_interps_counts = NIL;
                        SubLObject adv_interps_counts = NIL;
                        SubLObject terror = NIL;
                        SubLObject sentence_id = NIL;
                        SubLObject sentence = NIL;
                        SubLObject rs = NIL;
                        SubLObject statement = NIL;
                        SubLObject connection_10 = NIL;
                        try {
                            connection_10 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                            if (NIL != sdbc.sql_open_connection_p(connection_10)) {
                                statement = sdbc.sqlc_create_statement(connection_10);
                            } else {
                                statement = connection_10;
                            }
                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(corpus)), $str_alt60$___________________________AND_se }), UNPROVIDED);
                            } else {
                                rs = statement;
                            }
                            if (NIL != sdbc.sdbc_error_p(rs)) {
                                sdbc.sdbc_error_throw(rs);
                            }
                            if (NIL != sdbc.sql_result_set_p(rs)) {
                                while (NIL != sdbc.sqlrs_next(rs)) {
                                    sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                    sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                                    i = add(i, ONE_INTEGER);
                                    terror = NIL;
                                    {
                                        SubLObject error = NIL;
                                        format(T, $str_alt61$___a___a___a__, new SubLObject[]{ com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                                        finish_output(UNPROVIDED);
                                        try {
                                            {
                                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        {
                                                            SubLObject connection_11 = sdbc.sqls_get_connection(stmt);
                                                            SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_11);
                                                            SubLObject commit_error = NIL;
                                                            SubLObject rollback_result = NIL;
                                                            SubLObject auto_commit_result = NIL;
                                                            SubLObject errors = NIL;
                                                            if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                                                errors = cons(auto_commit, errors);
                                                            } else {
                                                                sdbc.sqlc_set_error_handling(connection_11, $THROW);
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_12 = Errors.$error_handler$.currentBinding(thread);
                                                                        try {
                                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                            try {
                                                                                if (NIL != auto_commit) {
                                                                                    sdbc.sqlc_set_auto_commit(connection_11, NIL);
                                                                                }
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject raw_linkage_13 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                                                                    SubLObject raw_linkage_id_14 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    raw_linkage = raw_linkage_13;
                                                                                    raw_linkage_id = raw_linkage_id_14;
                                                                                }
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject v_linkage_15 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                                                                    SubLObject linkage_id_16 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    v_linkage = v_linkage_15;
                                                                                    linkage_id = linkage_id_16;
                                                                                }
                                                                                com.cyc.cycjava.cycl.nlp_db_metrics.insert_link_cyclification(stmt, v_linkage, linkage_id, lexicon);
                                                                                sdbc.sqlc_commit(connection_11);
                                                                            } catch (Throwable catch_var) {
                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                            }
                                                                        } finally {
                                                                            Errors.$error_handler$.rebind(_prev_bind_0_12, thread);
                                                                        }
                                                                    }
                                                                } catch (Throwable ccatch_env_var) {
                                                                    commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                }
                                                                sdbc.sqlc_set_error_handling(connection_11, $RETURN);
                                                                if (NIL != commit_error) {
                                                                    errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                                    rollback_result = sdbc.sqls_handle_rollback(connection_11);
                                                                    if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                                        errors = cons(rollback_result, errors);
                                                                    }
                                                                }
                                                                if (NIL != auto_commit) {
                                                                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_11, T);
                                                                }
                                                                if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                                    errors = cons(auto_commit_result, errors);
                                                                }
                                                            }
                                                            if (NIL != errors) {
                                                                terror = sdbc.sqls_handle_transaction_errors(errors);
                                                            }
                                                        }
                                                        if (NIL != terror) {
                                                            sdbc.sdbc_error_warn(terror);
                                                        }
                                                        if (NIL != v_linkage) {
                                                            lex_verb_count = add(lex_verb_count, com.cyc.cycjava.cycl.nlp_db_metrics.linkage_lexified_count(v_linkage, VERB_LINK_WORD_P));
                                                            lex_noun_count = add(lex_noun_count, com.cyc.cycjava.cycl.nlp_db_metrics.linkage_lexified_count(v_linkage, NOUN_LINK_WORD_P));
                                                            lex_adj_count = add(lex_adj_count, com.cyc.cycjava.cycl.nlp_db_metrics.linkage_lexified_count(v_linkage, ADJECTIVE_LINK_WORD_P));
                                                            lex_adv_count = add(lex_adv_count, com.cyc.cycjava.cycl.nlp_db_metrics.linkage_lexified_count(v_linkage, ADVERB_LINK_WORD_P));
                                                            {
                                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.linkage_interps_count(v_linkage, VERB_LINK_WORD_P);
                                                                SubLObject count = NIL;
                                                                for (count = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , count = cdolist_list_var.first()) {
                                                                    verb_interps_counts = cons(count, verb_interps_counts);
                                                                }
                                                            }
                                                            {
                                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.linkage_interps_count(v_linkage, NOUN_LINK_WORD_P);
                                                                SubLObject count = NIL;
                                                                for (count = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , count = cdolist_list_var.first()) {
                                                                    noun_interps_counts = cons(count, noun_interps_counts);
                                                                }
                                                            }
                                                            {
                                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.linkage_interps_count(v_linkage, ADJECTIVE_LINK_WORD_P);
                                                                SubLObject count = NIL;
                                                                for (count = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , count = cdolist_list_var.first()) {
                                                                    adj_interps_counts = cons(count, adj_interps_counts);
                                                                }
                                                            }
                                                            {
                                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.linkage_interps_count(v_linkage, ADVERB_LINK_WORD_P);
                                                                SubLObject count = NIL;
                                                                for (count = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , count = cdolist_list_var.first()) {
                                                                    adv_interps_counts = cons(count, adv_interps_counts);
                                                                }
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
                                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        }
                                        if (NIL != error) {
                                            Errors.warn(error);
                                        }
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != sdbc.sql_connection_p(connection_10)) {
                                        sdbc.sqlc_close(connection_10);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        com.cyc.cycjava.cycl.nlp_db_metrics.insert_run_statistics(stmt, run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, verb_interps_counts, noun_interps_counts, adj_interps_counts, adv_interps_counts);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    public static SubLObject db_link_cyclification_run(final SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(corpus) : "! stringp(corpus) " + ("Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) ") + corpus;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        SubLObject i = ZERO_INTEGER;
        final SubLObject lexicon = object.new_class_instance($sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, FOUR_INTEGER, corpus, comment);
            SubLObject raw_linkage = NIL;
            SubLObject raw_linkage_id = NIL;
            SubLObject v_linkage = NIL;
            SubLObject linkage_id = NIL;
            SubLObject lex_verb_count = ZERO_INTEGER;
            SubLObject lex_noun_count = ZERO_INTEGER;
            SubLObject lex_adj_count = ZERO_INTEGER;
            SubLObject lex_adv_count = ZERO_INTEGER;
            SubLObject verb_interps_counts = NIL;
            SubLObject noun_interps_counts = NIL;
            SubLObject adj_interps_counts = NIL;
            SubLObject adv_interps_counts = NIL;
            SubLObject terror = NIL;
            SubLObject sentence_id = NIL;
            SubLObject sentence = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection_$10 = NIL;
            try {
                connection_$10 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection_$10)) {
                    statement = sdbc.sqlc_create_statement(connection_$10);
                } else {
                    statement = connection_$10;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, cconcatenate($str59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), $str60$___________________________AND_se }), UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                        i = add(i, ONE_INTEGER);
                        terror = NIL;
                        SubLObject error = NIL;
                        format(T, $str61$___a___a___a__, new SubLObject[]{ iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                        finish_output(UNPROVIDED);
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    final SubLObject connection_$11 = sdbc.sqls_get_connection(stmt);
                                    final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$11);
                                    SubLObject commit_error = NIL;
                                    SubLObject rollback_result = NIL;
                                    SubLObject auto_commit_result = NIL;
                                    SubLObject errors = NIL;
                                    if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                        errors = cons(auto_commit, errors);
                                    } else {
                                        sdbc.sqlc_set_error_handling(connection_$11, $THROW);
                                        try {
                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$12 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if (NIL != auto_commit) {
                                                        sdbc.sqlc_set_auto_commit(connection_$11, NIL);
                                                    }
                                                    thread.resetMultipleValues();
                                                    final SubLObject raw_linkage_$13 = insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                                    final SubLObject raw_linkage_id_$14 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    raw_linkage = raw_linkage_$13;
                                                    raw_linkage_id = raw_linkage_id_$14;
                                                    thread.resetMultipleValues();
                                                    final SubLObject v_linkage_$15 = insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                                    final SubLObject linkage_id_$16 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    v_linkage = v_linkage_$15;
                                                    linkage_id = linkage_id_$16;
                                                    insert_link_cyclification(stmt, v_linkage, linkage_id, lexicon);
                                                    sdbc.sqlc_commit(connection_$11);
                                                } catch (final Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var) {
                                            commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                        sdbc.sqlc_set_error_handling(connection_$11, $RETURN);
                                        if (NIL != commit_error) {
                                            errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                            rollback_result = sdbc.sqls_handle_rollback(connection_$11);
                                            if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                errors = cons(rollback_result, errors);
                                            }
                                        }
                                        if (NIL != auto_commit) {
                                            auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$11, T);
                                        }
                                        if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                            errors = cons(auto_commit_result, errors);
                                        }
                                    }
                                    if (NIL != errors) {
                                        terror = sdbc.sqls_handle_transaction_errors(errors);
                                    }
                                    if (NIL != terror) {
                                        sdbc.sdbc_error_warn(terror);
                                    }
                                    if (NIL != v_linkage) {
                                        lex_verb_count = add(lex_verb_count, linkage_lexified_count(v_linkage, VERB_LINK_WORD_P));
                                        lex_noun_count = add(lex_noun_count, linkage_lexified_count(v_linkage, NOUN_LINK_WORD_P));
                                        lex_adj_count = add(lex_adj_count, linkage_lexified_count(v_linkage, ADJECTIVE_LINK_WORD_P));
                                        lex_adv_count = add(lex_adv_count, linkage_lexified_count(v_linkage, ADVERB_LINK_WORD_P));
                                        SubLObject cdolist_list_var = linkage_interps_count(v_linkage, VERB_LINK_WORD_P);
                                        SubLObject count = NIL;
                                        count = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            verb_interps_counts = cons(count, verb_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        } 
                                        cdolist_list_var = linkage_interps_count(v_linkage, NOUN_LINK_WORD_P);
                                        count = NIL;
                                        count = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            noun_interps_counts = cons(count, noun_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        } 
                                        cdolist_list_var = linkage_interps_count(v_linkage, ADJECTIVE_LINK_WORD_P);
                                        count = NIL;
                                        count = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            adj_interps_counts = cons(count, adj_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        } 
                                        cdolist_list_var = linkage_interps_count(v_linkage, ADVERB_LINK_WORD_P);
                                        count = NIL;
                                        count = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            adv_interps_counts = cons(count, adv_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        } 
                                    }
                                } catch (final Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != error) {
                            Errors.warn(error);
                        }
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection_$10)) {
                        sdbc.sqlc_close(connection_$10);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            insert_run_statistics(stmt, run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, verb_interps_counts, noun_interps_counts, adj_interps_counts, adv_interps_counts);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    public static final SubLObject db_ebmt_cyclification_run_alt(SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(corpus, STRINGP);
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED);
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject run_id = com.cyc.cycjava.cycl.nlp_db_metrics.insert_run(stmt, FIVE_INTEGER, corpus, comment);
                        SubLObject raw_linkage = NIL;
                        SubLObject raw_linkage_id = NIL;
                        SubLObject v_linkage = NIL;
                        SubLObject linkage_id = NIL;
                        SubLObject terror = NIL;
                        SubLObject sentence_id = NIL;
                        SubLObject sentence = NIL;
                        SubLObject rs = NIL;
                        SubLObject statement = NIL;
                        SubLObject connection_17 = NIL;
                        try {
                            connection_17 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                            if (NIL != sdbc.sql_open_connection_p(connection_17)) {
                                statement = sdbc.sqlc_create_statement(connection_17);
                            } else {
                                statement = connection_17;
                            }
                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(corpus)), $str_alt60$___________________________AND_se }), UNPROVIDED);
                            } else {
                                rs = statement;
                            }
                            if (NIL != sdbc.sdbc_error_p(rs)) {
                                sdbc.sdbc_error_throw(rs);
                            }
                            if (NIL != sdbc.sql_result_set_p(rs)) {
                                while (NIL != sdbc.sqlrs_next(rs)) {
                                    sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                    sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                                    i = add(i, ONE_INTEGER);
                                    terror = NIL;
                                    format(T, $str_alt61$___a___a___a__, new SubLObject[]{ com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                                    finish_output(UNPROVIDED);
                                    {
                                        SubLObject connection_18 = sdbc.sqls_get_connection(stmt);
                                        SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_18);
                                        SubLObject commit_error = NIL;
                                        SubLObject rollback_result = NIL;
                                        SubLObject auto_commit_result = NIL;
                                        SubLObject errors = NIL;
                                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                            errors = cons(auto_commit, errors);
                                        } else {
                                            sdbc.sqlc_set_error_handling(connection_18, $THROW);
                                            try {
                                                {
                                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            if (NIL != auto_commit) {
                                                                sdbc.sqlc_set_auto_commit(connection_18, NIL);
                                                            }
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject raw_linkage_19 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                                                SubLObject raw_linkage_id_20 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                raw_linkage = raw_linkage_19;
                                                                raw_linkage_id = raw_linkage_id_20;
                                                            }
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject v_linkage_21 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                                                SubLObject linkage_id_22 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                v_linkage = v_linkage_21;
                                                                linkage_id = linkage_id_22;
                                                            }
                                                            com.cyc.cycjava.cycl.nlp_db_metrics.insert_ebmt_cyclification(stmt, v_linkage, linkage_id, lexicon, sentence);
                                                            sdbc.sqlc_commit(connection_18);
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                            sdbc.sqlc_set_error_handling(connection_18, $RETURN);
                                            if (NIL != commit_error) {
                                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                rollback_result = sdbc.sqls_handle_rollback(connection_18);
                                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                    errors = cons(rollback_result, errors);
                                                }
                                            }
                                            if (NIL != auto_commit) {
                                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_18, T);
                                            }
                                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                errors = cons(auto_commit_result, errors);
                                            }
                                        }
                                        if (NIL != errors) {
                                            terror = sdbc.sqls_handle_transaction_errors(errors);
                                        }
                                    }
                                    if (NIL != terror) {
                                        sdbc.sdbc_error_warn(terror);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != sdbc.sql_connection_p(connection_17)) {
                                        sdbc.sqlc_close(connection_17);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    public static SubLObject db_ebmt_cyclification_run(final SubLObject corpus, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(corpus) : "! stringp(corpus) " + ("Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) ") + corpus;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        SubLObject i = ZERO_INTEGER;
        final SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED);
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, FIVE_INTEGER, corpus, comment);
            SubLObject raw_linkage = NIL;
            SubLObject raw_linkage_id = NIL;
            SubLObject v_linkage = NIL;
            SubLObject linkage_id = NIL;
            SubLObject terror = NIL;
            SubLObject sentence_id = NIL;
            SubLObject sentence = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection_$17 = NIL;
            try {
                connection_$17 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection_$17)) {
                    statement = sdbc.sqlc_create_statement(connection_$17);
                } else {
                    statement = connection_$17;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, cconcatenate($str59$SELECT_sentence_id__sentence_cont, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), $str60$___________________________AND_se }), UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                        i = add(i, ONE_INTEGER);
                        terror = NIL;
                        format(T, $str61$___a___a___a__, new SubLObject[]{ iso_8601_timestamp(UNPROVIDED), sentence_id, sentence });
                        finish_output(UNPROVIDED);
                        final SubLObject connection_$18 = sdbc.sqls_get_connection(stmt);
                        final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$18);
                        SubLObject commit_error = NIL;
                        SubLObject rollback_result = NIL;
                        SubLObject auto_commit_result = NIL;
                        SubLObject errors = NIL;
                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = cons(auto_commit, errors);
                        } else {
                            sdbc.sqlc_set_error_handling(connection_$18, $THROW);
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (NIL != auto_commit) {
                                            sdbc.sqlc_set_auto_commit(connection_$18, NIL);
                                        }
                                        thread.resetMultipleValues();
                                        final SubLObject raw_linkage_$19 = insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                        final SubLObject raw_linkage_id_$20 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        raw_linkage = raw_linkage_$19;
                                        raw_linkage_id = raw_linkage_id_$20;
                                        thread.resetMultipleValues();
                                        final SubLObject v_linkage_$21 = insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                        final SubLObject linkage_id_$22 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        v_linkage = v_linkage_$21;
                                        linkage_id = linkage_id_$22;
                                        insert_ebmt_cyclification(stmt, v_linkage, linkage_id, lexicon, sentence);
                                        sdbc.sqlc_commit(connection_$18);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$18, $RETURN);
                            if (NIL != commit_error) {
                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_$18);
                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = cons(rollback_result, errors);
                                }
                            }
                            if (NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$18, T);
                            }
                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = cons(auto_commit_result, errors);
                            }
                        }
                        if (NIL != errors) {
                            terror = sdbc.sqls_handle_transaction_errors(errors);
                        }
                        if (NIL != terror) {
                            sdbc.sdbc_error_warn(terror);
                        }
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection_$17)) {
                        sdbc.sqlc_close(connection_$17);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    public static final SubLObject db_cached_ebmt_cyclification_run_alt(SubLObject old_run_id, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(old_run_id, POSITIVE_INTEGER_P);
            if (NIL != comment) {
                SubLTrampolineFile.checkType(comment, STRINGP);
            }
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED);
                SubLObject corpus = com.cyc.cycjava.cycl.nlp_db_metrics.db_get_run_corpus(old_run_id);
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject run_id = com.cyc.cycjava.cycl.nlp_db_metrics.insert_run(stmt, FIVE_INTEGER, corpus, comment);
                        SubLObject raw_linkage = NIL;
                        SubLObject raw_linkage_id = NIL;
                        SubLObject v_linkage = NIL;
                        SubLObject terror = NIL;
                        SubLObject linkage_id = NIL;
                        SubLObject ls = NIL;
                        SubLObject sentence_id = NIL;
                        SubLObject sentence = NIL;
                        SubLObject start = NIL;
                        SubLObject duration = NIL;
                        SubLObject rs = NIL;
                        SubLObject statement = NIL;
                        SubLObject connection_23 = NIL;
                        try {
                            connection_23 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                            if (NIL != sdbc.sql_open_connection_p(connection_23)) {
                                statement = sdbc.sqlc_create_statement(connection_23);
                            } else {
                                statement = connection_23;
                            }
                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt71$SELECT_raw_linkage_id__raw_linkag, new SubLObject[]{ format_nil.format_nil_a_no_copy(old_run_id), $str_alt72$__________________________AND_raw }), UNPROVIDED);
                            } else {
                                rs = statement;
                            }
                            if (NIL != sdbc.sdbc_error_p(rs)) {
                                sdbc.sdbc_error_throw(rs);
                            }
                            if (NIL != sdbc.sql_result_set_p(rs)) {
                                while (NIL != sdbc.sqlrs_next(rs)) {
                                    linkage_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                    sentence_id = sdbc.sqlrs_get_object(rs, THREE_INTEGER);
                                    sentence = sdbc.sqlrs_get_object(rs, FOUR_INTEGER);
                                    ls = (NIL != sdbc.sql_null_p(sdbc.sqlrs_get_object(rs, TWO_INTEGER))) ? ((SubLObject) (NIL)) : linkage.new_link_structures(read_from_string(sdbc.sqlrs_get_object(rs, TWO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon, sentence, T).first();
                                    start = sdbc.sqlrs_get_object(rs, FIVE_INTEGER);
                                    duration = sdbc.sqlrs_get_object(rs, SIX_INTEGER);
                                    i = add(i, ONE_INTEGER);
                                    terror = NIL;
                                    format(T, $str_alt61$___a___a___a__, new SubLObject[]{ com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), linkage_id, ls });
                                    finish_output(UNPROVIDED);
                                    {
                                        SubLObject connection_24 = sdbc.sqls_get_connection(stmt);
                                        SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_24);
                                        SubLObject commit_error = NIL;
                                        SubLObject rollback_result = NIL;
                                        SubLObject auto_commit_result = NIL;
                                        SubLObject errors = NIL;
                                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                                            errors = cons(auto_commit, errors);
                                        } else {
                                            sdbc.sqlc_set_error_handling(connection_24, $THROW);
                                            try {
                                                {
                                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            if (NIL != auto_commit) {
                                                                sdbc.sqlc_set_auto_commit(connection_24, NIL);
                                                            }
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject raw_linkage_25 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_cached_raw_linkage(stmt, run_id, sentence_id, ls, start, duration);
                                                                SubLObject raw_linkage_id_26 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                raw_linkage = raw_linkage_25;
                                                                raw_linkage_id = raw_linkage_id_26;
                                                            }
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject v_linkage_27 = com.cyc.cycjava.cycl.nlp_db_metrics.insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                                                SubLObject linkage_id_28 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                v_linkage = v_linkage_27;
                                                                linkage_id = linkage_id_28;
                                                            }
                                                            com.cyc.cycjava.cycl.nlp_db_metrics.insert_ebmt_cyclification(stmt, v_linkage, linkage_id, lexicon, sentence);
                                                            sdbc.sqlc_commit(connection_24);
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                            sdbc.sqlc_set_error_handling(connection_24, $RETURN);
                                            if (NIL != commit_error) {
                                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                rollback_result = sdbc.sqls_handle_rollback(connection_24);
                                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                    errors = cons(rollback_result, errors);
                                                }
                                            }
                                            if (NIL != auto_commit) {
                                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_24, T);
                                            }
                                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                errors = cons(auto_commit_result, errors);
                                            }
                                        }
                                        if (NIL != errors) {
                                            terror = sdbc.sqls_handle_transaction_errors(errors);
                                        }
                                    }
                                    if (NIL != terror) {
                                        sdbc.sdbc_error_warn(terror);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != sdbc.sql_connection_p(connection_23)) {
                                        sdbc.sqlc_close(connection_23);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return i;
            }
        }
    }

    public static SubLObject db_cached_ebmt_cyclification_run(final SubLObject old_run_id, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(old_run_id) : "! subl_promotions.positive_integer_p(old_run_id) " + ("subl_promotions.positive_integer_p(old_run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(old_run_id) ") + old_run_id;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        SubLObject i = ZERO_INTEGER;
        final SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED);
        final SubLObject corpus = db_get_run_corpus(old_run_id);
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, FIVE_INTEGER, corpus, comment);
            SubLObject raw_linkage = NIL;
            SubLObject raw_linkage_id = NIL;
            SubLObject v_linkage = NIL;
            SubLObject terror = NIL;
            SubLObject linkage_id = NIL;
            SubLObject ls = NIL;
            SubLObject sentence_id = NIL;
            SubLObject sentence = NIL;
            SubLObject start = NIL;
            SubLObject duration = NIL;
            SubLObject rs = NIL;
            SubLObject statement = NIL;
            SubLObject connection_$23 = NIL;
            try {
                connection_$23 = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection_$23)) {
                    statement = sdbc.sqlc_create_statement(connection_$23);
                } else {
                    statement = connection_$23;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, cconcatenate($str71$SELECT_raw_linkage_id__raw_linkag, new SubLObject[]{ format_nil.format_nil_a_no_copy(old_run_id), $str72$__________________________AND_raw }), UNPROVIDED);
                } else {
                    rs = statement;
                }
                if (NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        linkage_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        sentence_id = sdbc.sqlrs_get_object(rs, THREE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, FOUR_INTEGER);
                        ls = (NIL != sdbc.sql_null_p(sdbc.sqlrs_get_object(rs, TWO_INTEGER))) ? NIL : linkage.new_link_structures(read_from_string(sdbc.sqlrs_get_object(rs, TWO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon, sentence, T).first();
                        start = sdbc.sqlrs_get_object(rs, FIVE_INTEGER);
                        duration = sdbc.sqlrs_get_object(rs, SIX_INTEGER);
                        i = add(i, ONE_INTEGER);
                        terror = NIL;
                        format(T, $str61$___a___a___a__, new SubLObject[]{ iso_8601_timestamp(UNPROVIDED), linkage_id, ls });
                        finish_output(UNPROVIDED);
                        final SubLObject connection_$24 = sdbc.sqls_get_connection(stmt);
                        final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$24);
                        SubLObject commit_error = NIL;
                        SubLObject rollback_result = NIL;
                        SubLObject auto_commit_result = NIL;
                        SubLObject errors = NIL;
                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = cons(auto_commit, errors);
                        } else {
                            sdbc.sqlc_set_error_handling(connection_$24, $THROW);
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (NIL != auto_commit) {
                                            sdbc.sqlc_set_auto_commit(connection_$24, NIL);
                                        }
                                        thread.resetMultipleValues();
                                        final SubLObject raw_linkage_$25 = insert_cached_raw_linkage(stmt, run_id, sentence_id, ls, start, duration);
                                        final SubLObject raw_linkage_id_$26 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        raw_linkage = raw_linkage_$25;
                                        raw_linkage_id = raw_linkage_id_$26;
                                        thread.resetMultipleValues();
                                        final SubLObject v_linkage_$27 = insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                        final SubLObject linkage_id_$28 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        v_linkage = v_linkage_$27;
                                        linkage_id = linkage_id_$28;
                                        insert_ebmt_cyclification(stmt, v_linkage, linkage_id, lexicon, sentence);
                                        sdbc.sqlc_commit(connection_$24);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$24, $RETURN);
                            if (NIL != commit_error) {
                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_$24);
                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = cons(rollback_result, errors);
                                }
                            }
                            if (NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$24, T);
                            }
                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = cons(auto_commit_result, errors);
                            }
                        }
                        if (NIL != errors) {
                            terror = sdbc.sqls_handle_transaction_errors(errors);
                        }
                        if (NIL != terror) {
                            sdbc.sdbc_error_warn(terror);
                        }
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection_$23)) {
                        sdbc.sqlc_close(connection_$23);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }

    /**
     * returns the corpus used in run RUN-ID
     */
    @LispMethod(comment = "returns the corpus used in run RUN-ID")
    public static final SubLObject db_get_run_corpus_alt(SubLObject run_id) {
        SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt73$SELECT_corpus_name________FROM_ru, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str_alt74$________AND_run_corpus_id___corpu }));
    }

    /**
     * returns the corpus used in run RUN-ID
     */
    @LispMethod(comment = "returns the corpus used in run RUN-ID")
    public static SubLObject db_get_run_corpus(final SubLObject run_id) {
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        return link_metrics_single_sql_value(cconcatenate($str73$SELECT_corpus_name________FROM_ru, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str74$________AND_run_corpus_id___corpu }));
    }

    public static final SubLObject link_metrics_delete_run_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject error = NIL;
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    {
                        SubLObject connection_29 = sdbc.sqls_get_connection(stmt);
                        SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_29);
                        SubLObject commit_error = NIL;
                        SubLObject rollback_result = NIL;
                        SubLObject auto_commit_result = NIL;
                        SubLObject errors = NIL;
                        if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = cons(auto_commit, errors);
                        } else {
                            sdbc.sqlc_set_error_handling(connection_29, $THROW);
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (NIL != auto_commit) {
                                                sdbc.sqlc_set_auto_commit(connection_29, NIL);
                                            }
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt75$DELETE_FROM_justification________, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt76$DELETE_FROM_cyclifications_______, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt77$DELETE_FROM_link_cyclification___, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt78$DELETE_FROM_full_linkage_________, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt79$DELETE_FROM_word_linkage_________, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt80$DELETE_FROM_raw_linkage__________, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt81$DELETE_FROM_run_statistics_______, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqls_execute_update(stmt, cconcatenate($str_alt82$DELETE_FROM_run____________WHERE_, format_nil.format_nil_a_no_copy(run_id)));
                                            sdbc.sqlc_commit(connection_29);
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            }
                            sdbc.sqlc_set_error_handling(connection_29, $RETURN);
                            if (NIL != commit_error) {
                                errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_29);
                                if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = cons(rollback_result, errors);
                                }
                            }
                            if (NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_29, T);
                            }
                            if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = cons(auto_commit_result, errors);
                            }
                        }
                        if (NIL != errors) {
                            error = sdbc.sqls_handle_transaction_errors(errors);
                        }
                    }
                    if (NIL != sdbc.sdbc_error_p(error)) {
                        sdbc.sdbc_error_warn(error);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject link_metrics_delete_run(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject error = NIL;
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject connection_$29 = sdbc.sqls_get_connection(stmt);
            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$29);
            SubLObject commit_error = NIL;
            SubLObject rollback_result = NIL;
            SubLObject auto_commit_result = NIL;
            SubLObject errors = NIL;
            if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                errors = cons(auto_commit, errors);
            } else {
                sdbc.sqlc_set_error_handling(connection_$29, $THROW);
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (NIL != auto_commit) {
                                sdbc.sqlc_set_auto_commit(connection_$29, NIL);
                            }
                            sdbc.sqls_execute_update(stmt, cconcatenate($str75$DELETE_FROM_justification________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str76$DELETE_FROM_cyclifications_______, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str77$DELETE_FROM_link_cyclification___, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str78$DELETE_FROM_full_linkage_________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str79$DELETE_FROM_word_linkage_________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str80$DELETE_FROM_raw_linkage__________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str81$DELETE_FROM_run_statistics_______, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, cconcatenate($str82$DELETE_FROM_run____________WHERE_, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqlc_commit(connection_$29);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                sdbc.sqlc_set_error_handling(connection_$29, $RETURN);
                if (NIL != commit_error) {
                    errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                    rollback_result = sdbc.sqls_handle_rollback(connection_$29);
                    if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                        errors = cons(rollback_result, errors);
                    }
                }
                if (NIL != auto_commit) {
                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$29, T);
                }
                if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                    errors = cons(auto_commit_result, errors);
                }
            }
            if (NIL != errors) {
                error = sdbc.sqls_handle_transaction_errors(errors);
            }
            if (NIL != sdbc.sdbc_error_p(error)) {
                sdbc.sdbc_error_warn(error);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    /**
     * returns the number of sentences processed in run RUN-ID
     */
    @LispMethod(comment = "returns the number of sentences processed in run RUN-ID")
    public static final SubLObject link_metrics_sentence_count_alt(SubLObject run_id) {
        SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt83$SELECT_count_sentence_id_________, format_nil.format_nil_a_no_copy(run_id)));
    }

    /**
     * returns the number of sentences processed in run RUN-ID
     */
    @LispMethod(comment = "returns the number of sentences processed in run RUN-ID")
    public static SubLObject link_metrics_sentence_count(final SubLObject run_id) {
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        return link_metrics_single_sql_value(cconcatenate($str83$SELECT_count_sentence_id_________, format_nil.format_nil_a_no_copy(run_id)));
    }

    /**
     * returns the mean (average) number of cycl interpretations per sentence
     * resulting in a linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the mean (average) number of cycl interpretations per sentence\r\nresulting in a linkage in run TESTRUN-ID\nreturns the mean (average) number of cycl interpretations per sentence\nresulting in a linkage in run TESTRUN-ID")
    public static final SubLObject link_metrics_avg_interpretation_count_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject counts = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt84$SELECT_link_cyclification_id_____, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str_alt85$____________GROUP_BY_link_cyclifi }), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            counts = cons(sdbc.sqlrs_get_object(rs, TWO_INTEGER), counts);
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject cdotimes_end_var = com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_no_interpretation_count(run_id);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        counts = cons(ZERO_INTEGER, counts);
                    }
                }
                return NIL != counts ? ((SubLObject) (number_utilities.mean(counts))) : NIL;
            }
        }
    }

    /**
     * returns the mean (average) number of cycl interpretations per sentence
     * resulting in a linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the mean (average) number of cycl interpretations per sentence\r\nresulting in a linkage in run TESTRUN-ID\nreturns the mean (average) number of cycl interpretations per sentence\nresulting in a linkage in run TESTRUN-ID")
    public static SubLObject link_metrics_avg_interpretation_count(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject counts = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str84$SELECT_link_cyclification_id_____, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str85$____________GROUP_BY_link_cyclifi }), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    counts = cons(sdbc.sqlrs_get_object(rs, TWO_INTEGER), counts);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = link_metrics_no_interpretation_count(run_id), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            counts = cons(ZERO_INTEGER, counts);
        }
        return NIL != counts ? number_utilities.mean(counts) : NIL;
    }

    /**
     * returns the mean (average) number of cycl interpretations per sentence
     * resulting in a linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the mean (average) number of cycl interpretations per sentence\r\nresulting in a linkage in run TESTRUN-ID\nreturns the mean (average) number of cycl interpretations per sentence\nresulting in a linkage in run TESTRUN-ID")
    public static final SubLObject link_metrics_median_interpretation_count_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject counts = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt84$SELECT_link_cyclification_id_____, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str_alt85$____________GROUP_BY_link_cyclifi }), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            counts = cons(sdbc.sqlrs_get_object(rs, TWO_INTEGER), counts);
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject cdotimes_end_var = com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_no_interpretation_count(run_id);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        counts = cons(ZERO_INTEGER, counts);
                    }
                }
                return NIL != counts ? ((SubLObject) (number_utilities.median(counts, UNPROVIDED))) : NIL;
            }
        }
    }

    /**
     * returns the mean (average) number of cycl interpretations per sentence
     * resulting in a linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the mean (average) number of cycl interpretations per sentence\r\nresulting in a linkage in run TESTRUN-ID\nreturns the mean (average) number of cycl interpretations per sentence\nresulting in a linkage in run TESTRUN-ID")
    public static SubLObject link_metrics_median_interpretation_count(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject counts = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str84$SELECT_link_cyclification_id_____, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str85$____________GROUP_BY_link_cyclifi }), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    counts = cons(sdbc.sqlrs_get_object(rs, TWO_INTEGER), counts);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = link_metrics_no_interpretation_count(run_id), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            counts = cons(ZERO_INTEGER, counts);
        }
        return NIL != counts ? number_utilities.median(counts, UNPROVIDED, UNPROVIDED) : NIL;
    }

    /**
     * returns the number of sentences in run TESTRUN-ID that had a linkage but no cycl
     */
    @LispMethod(comment = "returns the number of sentences in run TESTRUN-ID that had a linkage but no cycl")
    public static final SubLObject link_metrics_no_interpretation_count_alt(SubLObject run_id) {
        SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt86$SELECT_COUNT_link_cyclification_i, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str_alt87$________AND_NOT_EXISTS___________ }));
    }

    /**
     * returns the number of sentences in run TESTRUN-ID that had a linkage but no cycl
     */
    @LispMethod(comment = "returns the number of sentences in run TESTRUN-ID that had a linkage but no cycl")
    public static SubLObject link_metrics_no_interpretation_count(final SubLObject run_id) {
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        return link_metrics_single_sql_value(cconcatenate($str86$SELECT_COUNT_link_cyclification_i, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str87$________AND_NOT_EXISTS___________ }));
    }

    /**
     * returns all sentences that had no linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns all sentences that had no linkage in run TESTRUN-ID")
    public static final SubLObject link_metrics_failed_link_parse_sentences_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject sentences = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt88$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            sentences = cons(sdbc.sqlrs_get_object(rs, ONE_INTEGER), sentences);
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return sentences;
            }
        }
    }

    /**
     * returns all sentences that had no linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns all sentences that had no linkage in run TESTRUN-ID")
    public static SubLObject link_metrics_failed_link_parse_sentences(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject sentences = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str88$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    sentences = cons(sdbc.sqlrs_get_object(rs, ONE_INTEGER), sentences);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return sentences;
    }

    /**
     * returns all sentences that had no linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns all sentences that had no linkage in run TESTRUN-ID")
    public static final SubLObject link_metrics_succeeded_link_parse_sentences_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject sentences = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt89$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            sentences = cons(sdbc.sqlrs_get_object(rs, ONE_INTEGER), sentences);
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return sentences;
            }
        }
    }

    /**
     * returns all sentences that had no linkage in run TESTRUN-ID
     */
    @LispMethod(comment = "returns all sentences that had no linkage in run TESTRUN-ID")
    public static SubLObject link_metrics_succeeded_link_parse_sentences(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject sentences = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str89$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    sentences = cons(sdbc.sqlrs_get_object(rs, ONE_INTEGER), sentences);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return sentences;
    }

    /**
     * returns the mean (average) number of lexified words in a sentence
     * in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the mean (average) number of lexified words in a sentence\r\nin run TESTRUN-ID\nreturns the mean (average) number of lexified words in a sentence\nin run TESTRUN-ID")
    public static final SubLObject link_metrics_avg_lexified_word_count_alt(SubLObject run_id) {
        SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt90$SELECT_AVG_lexified_count________, format_nil.format_nil_a_no_copy(run_id)));
    }

    /**
     * returns the mean (average) number of lexified words in a sentence
     * in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the mean (average) number of lexified words in a sentence\r\nin run TESTRUN-ID\nreturns the mean (average) number of lexified words in a sentence\nin run TESTRUN-ID")
    public static SubLObject link_metrics_avg_lexified_word_count(final SubLObject run_id) {
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        return link_metrics_single_sql_value(cconcatenate($str90$SELECT_AVG_lexified_count________, format_nil.format_nil_a_no_copy(run_id)));
    }

    /**
     * returns the median number of lexified words in a sentence
     * in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of lexified words in a sentence\r\nin run TESTRUN-ID\nreturns the median number of lexified words in a sentence\nin run TESTRUN-ID")
    public static final SubLObject link_metrics_median_lexified_word_count_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject counts = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt91$SELECT_lexified_count____________, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            if (NIL == sdbc.sql_null_p(sdbc.sqlrs_get_object(rs, ONE_INTEGER))) {
                                counts = cons(sdbc.sqlrs_get_object(rs, ONE_INTEGER), counts);
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return number_utilities.median(counts, UNPROVIDED);
            }
        }
    }

    /**
     * returns the median number of lexified words in a sentence
     * in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of lexified words in a sentence\r\nin run TESTRUN-ID\nreturns the median number of lexified words in a sentence\nin run TESTRUN-ID")
    public static SubLObject link_metrics_median_lexified_word_count(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject counts = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str91$SELECT_lexified_count____________, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    if (NIL == sdbc.sql_null_p(sdbc.sqlrs_get_object(rs, ONE_INTEGER))) {
                        counts = cons(sdbc.sqlrs_get_object(rs, ONE_INTEGER), counts);
                    }
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return number_utilities.median(counts, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns a result set with all differences in raw-linkage output between
     * RUN-ID1 and RUN-ID2
     */
    @LispMethod(comment = "returns a result set with all differences in raw-linkage output between\r\nRUN-ID1 and RUN-ID2\nreturns a result set with all differences in raw-linkage output between\nRUN-ID1 and RUN-ID2")
    public static final SubLObject link_metrics_raw_linkage_diffs_alt(SubLObject run_id1, SubLObject run_id2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id1, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(run_id2, POSITIVE_INTEGER_P);
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt92$SELECT_sentence_contents__raw_lin, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id1), $str_alt93$____________AND_raw_linkage2_run_, format_nil.format_nil_a_no_copy(run_id2), $str_alt94$____________AND_raw_linkage1_sent }), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        format(T, $str_alt95$_a____a____a____a____a___________, new SubLObject[]{ sdbc.sqlrs_get_object(rs, ONE_INTEGER), run_id1, sdbc.sqlrs_get_object(rs, TWO_INTEGER), run_id2, sdbc.sqlrs_get_object(rs, THREE_INTEGER) });
                        count = add(count, ONE_INTEGER);
                    } 
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return count;
            }
        }
    }

    /**
     * returns a result set with all differences in raw-linkage output between
     * RUN-ID1 and RUN-ID2
     */
    @LispMethod(comment = "returns a result set with all differences in raw-linkage output between\r\nRUN-ID1 and RUN-ID2\nreturns a result set with all differences in raw-linkage output between\nRUN-ID1 and RUN-ID2")
    public static SubLObject link_metrics_raw_linkage_diffs(final SubLObject run_id1, final SubLObject run_id2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id1) : "! subl_promotions.positive_integer_p(run_id1) " + ("subl_promotions.positive_integer_p(run_id1) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id1) ") + run_id1;
        assert NIL != subl_promotions.positive_integer_p(run_id2) : "! subl_promotions.positive_integer_p(run_id2) " + ("subl_promotions.positive_integer_p(run_id2) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id2) ") + run_id2;
        SubLObject count = ZERO_INTEGER;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str92$SELECT_sentence_contents__raw_lin, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id1), $str93$____________AND_raw_linkage2_run_, format_nil.format_nil_a_no_copy(run_id2), $str94$____________AND_raw_linkage1_sent }), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            while (NIL != sdbc.sqlrs_next(rs)) {
                format(T, $str95$_a____a____a____a____a___________, new SubLObject[]{ sdbc.sqlrs_get_object(rs, ONE_INTEGER), run_id1, sdbc.sqlrs_get_object(rs, TWO_INTEGER), run_id2, sdbc.sqlrs_get_object(rs, THREE_INTEGER) });
                count = add(count, ONE_INTEGER);
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return count;
    }

    /**
     * returns the number of verbs with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of verbs with lexification in run TESTRUN-ID")
    public static final SubLObject link_metrics_lexified_verb_count_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt96$lex_verb_count);
    }

    /**
     * returns the number of verbs with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of verbs with lexification in run TESTRUN-ID")
    public static SubLObject link_metrics_lexified_verb_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str96$lex_verb_count);
    }

    /**
     * returns the number of nouns with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of nouns with lexification in run TESTRUN-ID")
    public static final SubLObject link_metrics_lexified_noun_count_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt97$lex_noun_count);
    }

    /**
     * returns the number of nouns with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of nouns with lexification in run TESTRUN-ID")
    public static SubLObject link_metrics_lexified_noun_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str97$lex_noun_count);
    }

    /**
     * returns the number of adjectives with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of adjectives with lexification in run TESTRUN-ID")
    public static final SubLObject link_metrics_lexified_adj_count_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt98$lex_adj_count);
    }

    /**
     * returns the number of adjectives with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of adjectives with lexification in run TESTRUN-ID")
    public static SubLObject link_metrics_lexified_adj_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str98$lex_adj_count);
    }

    /**
     * returns the number of adverbs with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of adverbs with lexification in run TESTRUN-ID")
    public static final SubLObject link_metrics_lexified_adv_count_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt99$lex_adv_count);
    }

    /**
     * returns the number of adverbs with lexification in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the number of adverbs with lexification in run TESTRUN-ID")
    public static SubLObject link_metrics_lexified_adv_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str99$lex_adv_count);
    }

    /**
     * returns the average number of interpretations of verbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of verbs in run TESTRUN-ID")
    public static final SubLObject link_metrics_mean_verb_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt100$mean_verb_lexes);
    }

    /**
     * returns the average number of interpretations of verbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of verbs in run TESTRUN-ID")
    public static SubLObject link_metrics_mean_verb_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str100$mean_verb_lexes);
    }

    /**
     * returns the average number of interpretations of nouns in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of nouns in run TESTRUN-ID")
    public static final SubLObject link_metrics_mean_noun_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt101$mean_noun_lexes);
    }

    /**
     * returns the average number of interpretations of nouns in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of nouns in run TESTRUN-ID")
    public static SubLObject link_metrics_mean_noun_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str101$mean_noun_lexes);
    }

    /**
     * returns the average number of interpretations of adjectives in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of adjectives in run TESTRUN-ID")
    public static final SubLObject link_metrics_mean_adj_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt102$mean_adj_lexes);
    }

    /**
     * returns the average number of interpretations of adjectives in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of adjectives in run TESTRUN-ID")
    public static SubLObject link_metrics_mean_adj_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str102$mean_adj_lexes);
    }

    /**
     * returns the average number of interpretations of adverbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of adverbs in run TESTRUN-ID")
    public static final SubLObject link_metrics_mean_adv_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt103$mean_adv_lexes);
    }

    /**
     * returns the average number of interpretations of adverbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the average number of interpretations of adverbs in run TESTRUN-ID")
    public static SubLObject link_metrics_mean_adv_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str103$mean_adv_lexes);
    }

    /**
     * returns the median number of interpretations of verbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of verbs in run TESTRUN-ID")
    public static final SubLObject link_metrics_median_verb_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt104$med_verb_lexes);
    }

    /**
     * returns the median number of interpretations of verbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of verbs in run TESTRUN-ID")
    public static SubLObject link_metrics_median_verb_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str104$med_verb_lexes);
    }

    /**
     * returns the median number of interpretations of nouns in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of nouns in run TESTRUN-ID")
    public static final SubLObject link_metrics_median_noun_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt105$med_noun_lexes);
    }

    /**
     * returns the median number of interpretations of nouns in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of nouns in run TESTRUN-ID")
    public static SubLObject link_metrics_median_noun_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str105$med_noun_lexes);
    }

    /**
     * returns the median number of interpretations of adjectives in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of adjectives in run TESTRUN-ID")
    public static final SubLObject link_metrics_median_adj_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt106$med_adj_lexes);
    }

    /**
     * returns the median number of interpretations of adjectives in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of adjectives in run TESTRUN-ID")
    public static SubLObject link_metrics_median_adj_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str106$med_adj_lexes);
    }

    /**
     * returns the median number of interpretations of adverbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of adverbs in run TESTRUN-ID")
    public static final SubLObject link_metrics_median_adv_interps_alt(SubLObject run_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_run_value(run_id, $str_alt107$med_adv_lexes);
    }

    /**
     * returns the median number of interpretations of adverbs in run TESTRUN-ID
     */
    @LispMethod(comment = "returns the median number of interpretations of adverbs in run TESTRUN-ID")
    public static SubLObject link_metrics_median_adv_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, $str107$med_adv_lexes);
    }

    /**
     * returns a time/count table for failed sentences: a list of list entries whose first
     * element is the link parse time and whose second element is the count
     */
    @LispMethod(comment = "returns a time/count table for failed sentences: a list of list entries whose first\r\nelement is the link parse time and whose second element is the count\nreturns a time/count table for failed sentences: a list of list entries whose first\nelement is the link parse time and whose second element is the count")
    public static final SubLObject time_count_failed_table_alt(SubLObject run_id, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$1000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject times = make_hash_table($int$1024, EQL, UNPROVIDED);
                SubLObject table = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt110$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            {
                                SubLObject time = truncate(divide(sdbc.sqlrs_get_object(rs, ONE_INTEGER), n), UNPROVIDED);
                                sethash(time, times, number_utilities.f_1X(gethash(time, times, ZERO_INTEGER)));
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject time = NIL;
                    SubLObject count = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(times);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                time = getEntryKey(cdohash_entry);
                                count = getEntryValue(cdohash_entry);
                                table = cons(list(multiply(time, n), count), table);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                return Sort.sort(table, $sym111$_, CAR);
            }
        }
    }

    /**
     * returns a time/count table for failed sentences: a list of list entries whose first
     * element is the link parse time and whose second element is the count
     */
    @LispMethod(comment = "returns a time/count table for failed sentences: a list of list entries whose first\r\nelement is the link parse time and whose second element is the count\nreturns a time/count table for failed sentences: a list of list entries whose first\nelement is the link parse time and whose second element is the count")
    public static SubLObject time_count_failed_table(final SubLObject run_id, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        final SubLObject times = make_hash_table($int$1024, EQL, UNPROVIDED);
        SubLObject table = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str110$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject time = truncate(divide(sdbc.sqlrs_get_object(rs, ONE_INTEGER), n), UNPROVIDED);
                    sethash(time, times, number_utilities.f_1X(gethash(time, times, ZERO_INTEGER)));
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject time = NIL;
        SubLObject count = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(times);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                time = getEntryKey(cdohash_entry);
                count = getEntryValue(cdohash_entry);
                table = cons(list(multiply(time, n), count), table);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, $sym111$_, CAR);
    }

    /**
     * returns a time/count table for succeeded sentences: a list of list entries whose first
     * element is the link parse time and whose second element is the count
     */
    @LispMethod(comment = "returns a time/count table for succeeded sentences: a list of list entries whose first\r\nelement is the link parse time and whose second element is the count\nreturns a time/count table for succeeded sentences: a list of list entries whose first\nelement is the link parse time and whose second element is the count")
    public static final SubLObject time_count_succeeded_table_alt(SubLObject run_id, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$1000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject times = make_hash_table($int$1024, EQL, UNPROVIDED);
                SubLObject table = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt113$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            {
                                SubLObject time = truncate(divide(sdbc.sqlrs_get_object(rs, ONE_INTEGER), n), UNPROVIDED);
                                sethash(time, times, number_utilities.f_1X(gethash(time, times, ZERO_INTEGER)));
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject time = NIL;
                    SubLObject count = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(times);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                time = getEntryKey(cdohash_entry);
                                count = getEntryValue(cdohash_entry);
                                table = cons(list(multiply(time, n), count), table);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                return Sort.sort(table, $sym111$_, CAR);
            }
        }
    }

    /**
     * returns a time/count table for succeeded sentences: a list of list entries whose first
     * element is the link parse time and whose second element is the count
     */
    @LispMethod(comment = "returns a time/count table for succeeded sentences: a list of list entries whose first\r\nelement is the link parse time and whose second element is the count\nreturns a time/count table for succeeded sentences: a list of list entries whose first\nelement is the link parse time and whose second element is the count")
    public static SubLObject time_count_succeeded_table(final SubLObject run_id, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        final SubLObject times = make_hash_table($int$1024, EQL, UNPROVIDED);
        SubLObject table = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str113$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy(run_id)), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject time = truncate(divide(sdbc.sqlrs_get_object(rs, ONE_INTEGER), n), UNPROVIDED);
                    sethash(time, times, number_utilities.f_1X(gethash(time, times, ZERO_INTEGER)));
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject time = NIL;
        SubLObject count = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(times);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                time = getEntryKey(cdohash_entry);
                count = getEntryValue(cdohash_entry);
                table = cons(list(multiply(time, n), count), table);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, $sym111$_, CAR);
    }

    /**
     * returns a length/count table for failed sentences: a list of list entries whose first
     * element is the sentence length and whose second element is the count
     */
    @LispMethod(comment = "returns a length/count table for failed sentences: a list of list entries whose first\r\nelement is the sentence length and whose second element is the count\nreturns a length/count table for failed sentences: a list of list entries whose first\nelement is the sentence length and whose second element is the count")
    public static final SubLObject length_count_failed_table_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject lengths = make_hash_table($int$1024, EQL, UNPROVIDED);
                SubLObject table = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt114$SELECT_sentence_contents_________, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str_alt115$____________AND_sentence_id___sen }), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            {
                                SubLObject sentence = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                SubLObject length = document.sentence_length(document.new_sentence(sentence, UNPROVIDED));
                                sethash(length, lengths, number_utilities.f_1X(gethash(length, lengths, ZERO_INTEGER)));
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject length = NIL;
                    SubLObject count = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(lengths);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                length = getEntryKey(cdohash_entry);
                                count = getEntryValue(cdohash_entry);
                                table = cons(list(length, count), table);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                return Sort.sort(table, $sym111$_, CAR);
            }
        }
    }

    /**
     * returns a length/count table for failed sentences: a list of list entries whose first
     * element is the sentence length and whose second element is the count
     */
    @LispMethod(comment = "returns a length/count table for failed sentences: a list of list entries whose first\r\nelement is the sentence length and whose second element is the count\nreturns a length/count table for failed sentences: a list of list entries whose first\nelement is the sentence length and whose second element is the count")
    public static SubLObject length_count_failed_table(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        final SubLObject lengths = make_hash_table($int$1024, EQL, UNPROVIDED);
        SubLObject table = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str114$SELECT_sentence_contents_________, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str115$____________AND_sentence_id___sen }), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject sentence = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    final SubLObject length = document.sentence_length(document.new_sentence(sentence, UNPROVIDED));
                    sethash(length, lengths, number_utilities.f_1X(gethash(length, lengths, ZERO_INTEGER)));
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject length2 = NIL;
        SubLObject count = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(lengths);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                length2 = getEntryKey(cdohash_entry);
                count = getEntryValue(cdohash_entry);
                table = cons(list(length2, count), table);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, $sym111$_, CAR);
    }

    /**
     * returns a length/count table for succeeded sentences: a list of list entries whose first
     * element is the sentence length and whose second element is the count
     */
    @LispMethod(comment = "returns a length/count table for succeeded sentences: a list of list entries whose first\r\nelement is the sentence length and whose second element is the count\nreturns a length/count table for succeeded sentences: a list of list entries whose first\nelement is the sentence length and whose second element is the count")
    public static final SubLObject length_count_succeeded_table_alt(SubLObject run_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
            {
                SubLObject lengths = make_hash_table($int$1024, EQL, UNPROVIDED);
                SubLObject table = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt116$SELECT_sentence_contents_________, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str_alt115$____________AND_sentence_id___sen }), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sql_result_set_p(rs)) {
                        while (NIL != sdbc.sqlrs_next(rs)) {
                            {
                                SubLObject sentence = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                                SubLObject length = document.sentence_length(document.new_sentence(sentence, UNPROVIDED));
                                sethash(length, lengths, number_utilities.f_1X(gethash(length, lengths, ZERO_INTEGER)));
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject length = NIL;
                    SubLObject count = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(lengths);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                length = getEntryKey(cdohash_entry);
                                count = getEntryValue(cdohash_entry);
                                table = cons(list(length, count), table);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                return Sort.sort(table, $sym111$_, CAR);
            }
        }
    }

    /**
     * returns a length/count table for succeeded sentences: a list of list entries whose first
     * element is the sentence length and whose second element is the count
     */
    @LispMethod(comment = "returns a length/count table for succeeded sentences: a list of list entries whose first\r\nelement is the sentence length and whose second element is the count\nreturns a length/count table for succeeded sentences: a list of list entries whose first\nelement is the sentence length and whose second element is the count")
    public static SubLObject length_count_succeeded_table(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        final SubLObject lengths = make_hash_table($int$1024, EQL, UNPROVIDED);
        SubLObject table = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str116$SELECT_sentence_contents_________, new SubLObject[]{ format_nil.format_nil_a_no_copy(run_id), $str115$____________AND_sentence_id___sen }), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject sentence = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    final SubLObject length = document.sentence_length(document.new_sentence(sentence, UNPROVIDED));
                    sethash(length, lengths, number_utilities.f_1X(gethash(length, lengths, ZERO_INTEGER)));
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject length2 = NIL;
        SubLObject count = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(lengths);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                length2 = getEntryKey(cdohash_entry);
                count = getEntryValue(cdohash_entry);
                table = cons(list(length2, count), table);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, $sym111$_, CAR);
    }

    public static final SubLObject print_table_alt(SubLObject table, SubLObject out) {
        if (out == UNPROVIDED) {
            out = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = table;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                format(out, $str_alt117$_a_t_a_T__, entry.first(), second(entry));
            }
        }
        return NIL;
    }

    public static SubLObject print_table(final SubLObject table, SubLObject out) {
        if (out == UNPROVIDED) {
            out = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = table;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(out, $str117$_a_t_a_T__, entry.first(), second(entry));
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject generate_tables_alt(SubLObject run_id, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$1000;
        }
        SubLTrampolineFile.checkType(run_id, POSITIVE_INTEGER_P);
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text($str_alt118$_home_aldag_time_count_failed_100, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt120$Unable_to_open__S, $str_alt118$_home_aldag_time_count_failed_100);
                }
                {
                    SubLObject out = stream;
                    com.cyc.cycjava.cycl.nlp_db_metrics.print_table(com.cyc.cycjava.cycl.nlp_db_metrics.time_count_failed_table(run_id, n), out);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text($str_alt121$_home_aldag_time_count_succeeded_, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt120$Unable_to_open__S, $str_alt121$_home_aldag_time_count_succeeded_);
                }
                {
                    SubLObject out = stream;
                    com.cyc.cycjava.cycl.nlp_db_metrics.print_table(com.cyc.cycjava.cycl.nlp_db_metrics.time_count_succeeded_table(run_id, n), out);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text($str_alt122$_home_aldag_length_count_failed_1, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt120$Unable_to_open__S, $str_alt122$_home_aldag_length_count_failed_1);
                }
                {
                    SubLObject out = stream;
                    com.cyc.cycjava.cycl.nlp_db_metrics.print_table(com.cyc.cycjava.cycl.nlp_db_metrics.length_count_failed_table(run_id), out);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text($str_alt123$_home_aldag_length_count_succeede, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt120$Unable_to_open__S, $str_alt123$_home_aldag_length_count_succeede);
                }
                {
                    SubLObject out = stream;
                    com.cyc.cycjava.cycl.nlp_db_metrics.print_table(com.cyc.cycjava.cycl.nlp_db_metrics.length_count_succeeded_table(run_id), out);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject generate_tables(final SubLObject run_id, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$1000;
        }
        assert NIL != subl_promotions.positive_integer_p(run_id) : "! subl_promotions.positive_integer_p(run_id) " + ("subl_promotions.positive_integer_p(run_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(run_id) ") + run_id;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text($str118$_home_aldag_time_count_failed_100, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str120$Unable_to_open__S, $str118$_home_aldag_time_count_failed_100);
            }
            final SubLObject out = stream;
            print_table(time_count_failed_table(run_id, n), out);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        stream = NIL;
        try {
            stream = compatibility.open_text($str121$_home_aldag_time_count_succeeded_, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str120$Unable_to_open__S, $str121$_home_aldag_time_count_succeeded_);
            }
            final SubLObject out = stream;
            print_table(time_count_succeeded_table(run_id, n), out);
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        stream = NIL;
        try {
            stream = compatibility.open_text($str122$_home_aldag_length_count_failed_1, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str120$Unable_to_open__S, $str122$_home_aldag_length_count_failed_1);
            }
            final SubLObject out = stream;
            print_table(length_count_failed_table(run_id), out);
        } finally {
            final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_3);
            }
        }
        stream = NIL;
        try {
            stream = compatibility.open_text($str123$_home_aldag_length_count_succeede, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str120$Unable_to_open__S, $str123$_home_aldag_length_count_succeede);
            }
            final SubLObject out = stream;
            print_table(length_count_succeeded_table(run_id), out);
        } finally {
            final SubLObject _prev_bind_4 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values4 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values4);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_4);
            }
        }
        return NIL;
    }

    /**
     * Returns basic information about each of the corpora in the DB
     */
    @LispMethod(comment = "Returns basic information about each of the corpora in the DB")
    public static final SubLObject nlp_db_metrics_corpora_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, copy_seq($str_alt124$SELECT_id__name__comment_FROM_cor), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        result = cons(list($ID, sdbc.sqlrs_get_object(rs, ONE_INTEGER), $NAME, sdbc.sqlrs_get_object(rs, TWO_INTEGER), $COMMENT, sdbc.sqlrs_get_object(rs, THREE_INTEGER)), result);
                    } 
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns basic information about each of the corpora in the DB
     */
    @LispMethod(comment = "Returns basic information about each of the corpora in the DB")
    public static SubLObject nlp_db_metrics_corpora() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, copy_seq($str124$SELECT_id__name__comment_FROM_cor), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            while (NIL != sdbc.sqlrs_next(rs)) {
                result = cons(list($ID, sdbc.sqlrs_get_object(rs, ONE_INTEGER), $NAME, sdbc.sqlrs_get_object(rs, TWO_INTEGER), $COMMENT, sdbc.sqlrs_get_object(rs, THREE_INTEGER)), result);
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     * How many sentences are in the corpus CORPUS-ID?
     */
    @LispMethod(comment = "How many sentences are in the corpus CORPUS-ID?")
    public static final SubLObject nlp_db_metrics_corpus_size_alt(SubLObject corpus_id) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt128$SELECT_COUNT_id__from_sentence_wh, new SubLObject[]{ format_nil.format_nil_a_no_copy(corpus_id), $str_alt129$_ }));
    }

    /**
     * How many sentences are in the corpus CORPUS-ID?
     */
    @LispMethod(comment = "How many sentences are in the corpus CORPUS-ID?")
    public static SubLObject nlp_db_metrics_corpus_size(final SubLObject corpus_id) {
        return link_metrics_single_sql_value(cconcatenate($str128$SELECT_COUNT_id__from_sentence_wh, new SubLObject[]{ format_nil.format_nil_a_no_copy(corpus_id), $str129$_ }));
    }/**
     * How many sentences are in the corpus CORPUS-ID?
     */


    /**
     * Returns basic information about each run for a particular CORPUS-ID
     */
    @LispMethod(comment = "Returns basic information about each run for a particular CORPUS-ID")
    public static final SubLObject nlp_db_metrics_runs_alt(SubLObject corpus_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, cconcatenate($str_alt130$SELECT_id__type__comment__kb__rev, format_nil.format_nil_a_no_copy(corpus_id)), UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    while (NIL != sdbc.sqlrs_next(rs)) {
                        result = cons(list(new SubLObject[]{ $ID, sdbc.sqlrs_get_object(rs, ONE_INTEGER), $TYPE, sdbc.sqlrs_get_object(rs, TWO_INTEGER), $COMMENT, sdbc.sqlrs_get_object(rs, THREE_INTEGER), $KB, sdbc.sqlrs_get_object(rs, FOUR_INTEGER), $REVISION, sdbc.sqlrs_get_object(rs, FIVE_INTEGER), $START, sdbc.sqlrs_get_object(rs, SIX_INTEGER) }), result);
                    } 
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns basic information about each run for a particular CORPUS-ID
     */
    @LispMethod(comment = "Returns basic information about each run for a particular CORPUS-ID")
    public static SubLObject nlp_db_metrics_runs(final SubLObject corpus_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, cconcatenate($str130$SELECT_id__type__comment__kb__rev, format_nil.format_nil_a_no_copy(corpus_id)), UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            while (NIL != sdbc.sqlrs_next(rs)) {
                result = cons(list(new SubLObject[]{ $ID, sdbc.sqlrs_get_object(rs, ONE_INTEGER), $TYPE, sdbc.sqlrs_get_object(rs, TWO_INTEGER), $COMMENT, sdbc.sqlrs_get_object(rs, THREE_INTEGER), $KB, sdbc.sqlrs_get_object(rs, FOUR_INTEGER), $REVISION, sdbc.sqlrs_get_object(rs, FIVE_INTEGER), $START, sdbc.sqlrs_get_object(rs, SIX_INTEGER) }), result);
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     * Create a new corpus with NAME and COMMENT
     */
    @LispMethod(comment = "Create a new corpus with NAME and COMMENT")
    public static final SubLObject nlp_db_metrics_add_corpus_alt(SubLObject name, SubLObject comment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            comment = (NIL != comment) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(comment), $str_alt135$_))) : NULL;
            name = (NIL != comment) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(name), $str_alt135$_))) : NULL;
            {
                SubLObject result = NIL;
                SubLObject stmt = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        stmt = sdbc.sqlc_create_statement(connection);
                    } else {
                        stmt = connection;
                    }
                    if (NIL != sdbc.sdbc_error_p(stmt)) {
                        sdbc.sdbc_error_throw(stmt);
                    }
                    result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt137$INSERT_INTO_corpus_name__comment_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt138$__, format_nil.format_nil_a_no_copy(comment), $str_alt139$__ }));
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Create a new corpus with NAME and COMMENT
     */
    @LispMethod(comment = "Create a new corpus with NAME and COMMENT")
    public static SubLObject nlp_db_metrics_add_corpus(SubLObject name, SubLObject comment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        comment = (NIL != comment) ? string_utilities.quote_string(postgresql_escape_string(comment), $str135$_) : NULL;
        name = (NIL != comment) ? string_utilities.quote_string(postgresql_escape_string(name), $str135$_) : NULL;
        SubLObject result = NIL;
        SubLObject stmt = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            } else {
                stmt = connection;
            }
            if (NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            result = sdbc.sqls_execute_update(stmt, cconcatenate($str137$INSERT_INTO_corpus_name__comment_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str138$__, format_nil.format_nil_a_no_copy(comment), $str139$__ }));
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     * Add SENTENCE-STRING to CORPUS-ID, unless a sentence with the same string is already in CORPUS-ID
     */
    @LispMethod(comment = "Add SENTENCE-STRING to CORPUS-ID, unless a sentence with the same string is already in CORPUS-ID")
    public static final SubLObject add_sentence_to_corpus_alt(SubLObject corpus_id, SubLObject sentence_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.nlp_db_metrics.nlp_db_metrics_sentence_in_corpusP(corpus_id, sentence_string)) {
                sentence_string = string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(sentence_string), $str_alt135$_);
                {
                    SubLObject result = NIL;
                    SubLObject stmt = NIL;
                    SubLObject connection = NIL;
                    try {
                        connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            stmt = sdbc.sqlc_create_statement(connection);
                        } else {
                            stmt = connection;
                        }
                        if (NIL != sdbc.sdbc_error_p(stmt)) {
                            sdbc.sdbc_error_throw(stmt);
                        }
                        result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt140$INSERT_INTO_sentence_corpus_id__c, new SubLObject[]{ format_nil.format_nil_a_no_copy(corpus_id), $str_alt138$__, format_nil.format_nil_a_no_copy(sentence_string), $str_alt139$__ }));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != sdbc.sql_connection_p(connection)) {
                                    sdbc.sqlc_close(connection);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     * Add SENTENCE-STRING to CORPUS-ID, unless a sentence with the same string is already in CORPUS-ID
     */
    @LispMethod(comment = "Add SENTENCE-STRING to CORPUS-ID, unless a sentence with the same string is already in CORPUS-ID")
    public static SubLObject add_sentence_to_corpus(final SubLObject corpus_id, SubLObject sentence_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nlp_db_metrics_sentence_in_corpusP(corpus_id, sentence_string)) {
            sentence_string = string_utilities.quote_string(postgresql_escape_string(sentence_string), $str135$_);
            SubLObject result = NIL;
            SubLObject stmt = NIL;
            SubLObject connection = NIL;
            try {
                connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    stmt = sdbc.sqlc_create_statement(connection);
                } else {
                    stmt = connection;
                }
                if (NIL != sdbc.sdbc_error_p(stmt)) {
                    sdbc.sdbc_error_throw(stmt);
                }
                result = sdbc.sqls_execute_update(stmt, cconcatenate($str140$INSERT_INTO_sentence_corpus_id__c, new SubLObject[]{ format_nil.format_nil_a_no_copy(corpus_id), $str138$__, format_nil.format_nil_a_no_copy(sentence_string), $str139$__ }));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection)) {
                        sdbc.sqlc_close(connection);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        return NIL;
    }/**
     * Add SENTENCE-STRING to CORPUS-ID, unless a sentence with the same string is already in CORPUS-ID
     */


    /**
     * Is SENTENCE-STRING already in CORPUS-ID?
     */
    @LispMethod(comment = "Is SENTENCE-STRING already in CORPUS-ID?")
    public static final SubLObject nlp_db_metrics_sentence_in_corpusP_alt(SubLObject corpus_id, SubLObject sentence_string) {
        sentence_string = string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(sentence_string), $str_alt135$_);
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt141$SELECT_id_from_sentence_WHERE_cor, new SubLObject[]{ format_nil.format_nil_a_no_copy(corpus_id), $str_alt142$_AND_contents_, format_nil.format_nil_a_no_copy(sentence_string), $str_alt129$_ }));
    }

    /**
     * Is SENTENCE-STRING already in CORPUS-ID?
     */
    @LispMethod(comment = "Is SENTENCE-STRING already in CORPUS-ID?")
    public static SubLObject nlp_db_metrics_sentence_in_corpusP(final SubLObject corpus_id, SubLObject sentence_string) {
        sentence_string = string_utilities.quote_string(postgresql_escape_string(sentence_string), $str135$_);
        return link_metrics_single_sql_value(cconcatenate($str141$SELECT_id_from_sentence_WHERE_cor, new SubLObject[]{ format_nil.format_nil_a_no_copy(corpus_id), $str142$_AND_contents_, format_nil.format_nil_a_no_copy(sentence_string), $str129$_ }));
    }/**
     * Is SENTENCE-STRING already in CORPUS-ID?
     */


    public static final SubLObject avg_sentence_length_failed_alt(SubLObject run_id) {
        {
            SubLObject lengths = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_failed_link_parse_sentences(run_id);
            SubLObject s = NIL;
            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            }
            return number_utilities.mean(lengths);
        }
    }

    public static SubLObject avg_sentence_length_failed(final SubLObject run_id) {
        SubLObject lengths = NIL;
        SubLObject cdolist_list_var = link_metrics_failed_link_parse_sentences(run_id);
        SubLObject s = NIL;
        s = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        } 
        return number_utilities.mean(lengths);
    }

    public static final SubLObject median_sentence_length_failed_alt(SubLObject run_id) {
        {
            SubLObject lengths = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_failed_link_parse_sentences(run_id);
            SubLObject s = NIL;
            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            }
            return number_utilities.median(lengths, UNPROVIDED);
        }
    }

    public static SubLObject median_sentence_length_failed(final SubLObject run_id) {
        SubLObject lengths = NIL;
        SubLObject cdolist_list_var = link_metrics_failed_link_parse_sentences(run_id);
        SubLObject s = NIL;
        s = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        } 
        return number_utilities.median(lengths, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject avg_sentence_length_succeeded_alt(SubLObject run_id) {
        {
            SubLObject lengths = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_succeeded_link_parse_sentences(run_id);
            SubLObject s = NIL;
            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            }
            return number_utilities.mean(lengths);
        }
    }

    public static SubLObject avg_sentence_length_succeeded(final SubLObject run_id) {
        SubLObject lengths = NIL;
        SubLObject cdolist_list_var = link_metrics_succeeded_link_parse_sentences(run_id);
        SubLObject s = NIL;
        s = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        } 
        return number_utilities.mean(lengths);
    }

    public static final SubLObject median_sentence_length_succeeded_alt(SubLObject run_id) {
        {
            SubLObject lengths = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_succeeded_link_parse_sentences(run_id);
            SubLObject s = NIL;
            for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            }
            return number_utilities.median(lengths, UNPROVIDED);
        }
    }

    public static SubLObject median_sentence_length_succeeded(final SubLObject run_id) {
        SubLObject lengths = NIL;
        SubLObject cdolist_list_var = link_metrics_succeeded_link_parse_sentences(run_id);
        SubLObject s = NIL;
        s = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lengths = cons(length(string_utilities.split_string(s, UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        } 
        return number_utilities.median(lengths, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param SENTENCE
    stringp;
     * 		
     * @param STMT
    sql-statement-p;
     * 		
     * @param LEXICON
    abstract-lexicon-p;
     * 		
     * @return vectorp; a word linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT
     */
    @LispMethod(comment = "@param SENTENCE\nstringp;\r\n\t\t\r\n@param STMT\nsql-statement-p;\r\n\t\t\r\n@param LEXICON\nabstract-lexicon-p;\r\n\t\t\r\n@return vectorp; a word linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT")
    public static final SubLObject db_get_word_linkage_alt(SubLObject sentence, SubLObject stmt, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLTrampolineFile.checkType(sentence, STRINGP);
        SubLTrampolineFile.checkType(stmt, SQL_STATEMENT_P);
        if (NIL != lexicon) {
            SubLTrampolineFile.checkType(lexicon, ABSTRACT_LEXICON_P);
        }
        {
            SubLObject ls = com.cyc.cycjava.cycl.nlp_db_metrics.db_get_link_structure(sentence, stmt, lexicon);
            SubLObject tagged_sent = NIL;
            if (NIL != ls) {
                tagged_sent = linkage.words_to_sentence(linkage.ls_words(ls));
                pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
                linkage.auxify_sentence(tagged_sent);
                return word_linkage.new_word_linkage_from_link_structure(ls, tagged_sent, sentence, lexicon);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    stringp;
     * 		
     * @param STMT
    sql-statement-p;
     * 		
     * @param LEXICON
    abstract-lexicon-p;
     * 		
     * @return vectorp; a word linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT
     */
    @LispMethod(comment = "@param SENTENCE\nstringp;\r\n\t\t\r\n@param STMT\nsql-statement-p;\r\n\t\t\r\n@param LEXICON\nabstract-lexicon-p;\r\n\t\t\r\n@return vectorp; a word linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT")
    public static SubLObject db_get_word_linkage(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        assert NIL != stringp(sentence) : "! stringp(sentence) " + ("Types.stringp(sentence) " + "CommonSymbols.NIL != Types.stringp(sentence) ") + sentence;
        assert NIL != sdbc.sql_statement_p(stmt) : "! sdbc.sql_statement_p(stmt) " + ("sdbc.sql_statement_p(stmt) " + "CommonSymbols.NIL != sdbc.sql_statement_p(stmt) ") + stmt;
        if (((NIL != lexicon) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == abstract_lexicon.abstract_lexicon_p(lexicon))) {
            throw new AssertionError(lexicon);
        }
        final SubLObject ls = db_get_link_structure(sentence, stmt, lexicon);
        SubLObject tagged_sent = NIL;
        if (NIL != ls) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(ls));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
            return word_linkage.new_word_linkage_from_link_structure(ls, tagged_sent, sentence, lexicon);
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    stringp;
     * 		
     * @param STMT
    sql-statement-p;
     * 		
     * @param LEXICON
    abstract-lexicon-p;
     * 		
     * @return vectorp; a full linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT
     */
    @LispMethod(comment = "@param SENTENCE\nstringp;\r\n\t\t\r\n@param STMT\nsql-statement-p;\r\n\t\t\r\n@param LEXICON\nabstract-lexicon-p;\r\n\t\t\r\n@return vectorp; a full linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT")
    public static final SubLObject db_get_linkage_alt(SubLObject sentence, SubLObject stmt, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLTrampolineFile.checkType(sentence, STRINGP);
        SubLTrampolineFile.checkType(stmt, SQL_STATEMENT_P);
        if (NIL != lexicon) {
            SubLTrampolineFile.checkType(lexicon, ABSTRACT_LEXICON_P);
        }
        {
            SubLObject ls = com.cyc.cycjava.cycl.nlp_db_metrics.db_get_link_structure(sentence, stmt, lexicon);
            SubLObject tagged_sent = NIL;
            if (NIL != ls) {
                tagged_sent = linkage.words_to_sentence(linkage.ls_words(ls));
                pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
                linkage.auxify_sentence(tagged_sent);
                return linkage.new_linkage_from_link_structure(ls, tagged_sent, object.new_class_instance(PARSE_TREE_CONTEXT));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    stringp;
     * 		
     * @param STMT
    sql-statement-p;
     * 		
     * @param LEXICON
    abstract-lexicon-p;
     * 		
     * @return vectorp; a full linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT
     */
    @LispMethod(comment = "@param SENTENCE\nstringp;\r\n\t\t\r\n@param STMT\nsql-statement-p;\r\n\t\t\r\n@param LEXICON\nabstract-lexicon-p;\r\n\t\t\r\n@return vectorp; a full linkage created from the newest link structure in the database for SENTENCE and LEXICON, using STMT")
    public static SubLObject db_get_linkage(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        assert NIL != stringp(sentence) : "! stringp(sentence) " + ("Types.stringp(sentence) " + "CommonSymbols.NIL != Types.stringp(sentence) ") + sentence;
        assert NIL != sdbc.sql_statement_p(stmt) : "! sdbc.sql_statement_p(stmt) " + ("sdbc.sql_statement_p(stmt) " + "CommonSymbols.NIL != sdbc.sql_statement_p(stmt) ") + stmt;
        if (((NIL != lexicon) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == abstract_lexicon.abstract_lexicon_p(lexicon))) {
            throw new AssertionError(lexicon);
        }
        final SubLObject ls = db_get_link_structure(sentence, stmt, lexicon);
        SubLObject tagged_sent = NIL;
        if (NIL != ls) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(ls));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
            return linkage.new_linkage_from_link_structure(ls, tagged_sent, object.new_class_instance(PARSE_TREE_CONTEXT));
        }
        return NIL;
    }

    /**
     *
     *
     * @param STMT
     * 		sql-statement-p; a statement to the relevant testing database
     * 		records a new test run in the database and returns a unique id for the run
     */
    @LispMethod(comment = "@param STMT\r\n\t\tsql-statement-p; a statement to the relevant testing database\r\n\t\trecords a new test run in the database and returns a unique id for the run")
    public static final SubLObject insert_run_alt(SubLObject stmt, SubLObject type, SubLObject corpus, SubLObject comment) {
        comment = (NIL != comment) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(comment), $str_alt135$_))) : NULL;
        {
            SubLObject corpus_id = com.cyc.cycjava.cycl.nlp_db_metrics.get_corpus_id(stmt, corpus);
            SubLObject timestamp = com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED);
            SubLObject id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt146$run_id_seq);
            SubLObject kb = kb_loaded();
            SubLObject revision = system_info.cyc_revision_string();
            SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt147$INSERT_INTO_run_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt138$__, format_nil.format_nil_a_no_copy(type), $str_alt138$__, format_nil.format_nil_a_no_copy(comment), $str_alt148$__, format_nil.format_nil_a_no_copy(kb), $str_alt149$____, format_nil.format_nil_a_no_copy(revision), $str_alt150$___, format_nil.format_nil_a_no_copy(corpus_id), $str_alt151$___, format_nil.format_nil_a_no_copy(timestamp), $str_alt152$__ }));
            if (NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            return id;
        }
    }

    /**
     *
     *
     * @param STMT
     * 		sql-statement-p; a statement to the relevant testing database
     * 		records a new test run in the database and returns a unique id for the run
     */
    @LispMethod(comment = "@param STMT\r\n\t\tsql-statement-p; a statement to the relevant testing database\r\n\t\trecords a new test run in the database and returns a unique id for the run")
    public static SubLObject insert_run(final SubLObject stmt, final SubLObject type, final SubLObject corpus, SubLObject comment) {
        comment = (NIL != comment) ? string_utilities.quote_string(postgresql_escape_string(comment), $str135$_) : NULL;
        final SubLObject corpus_id = get_corpus_id(stmt, corpus);
        final SubLObject timestamp = iso_8601_timestamp(UNPROVIDED);
        final SubLObject id = get_postgresql_nextval(stmt, $str146$run_id_seq);
        final SubLObject kb = kb_loaded();
        final SubLObject revision = system_info.cyc_revision_string();
        final SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str147$INSERT_INTO_run_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str138$__, format_nil.format_nil_a_no_copy(type), $str138$__, format_nil.format_nil_a_no_copy(comment), $str148$__, format_nil.format_nil_a_no_copy(kb), $str149$____, format_nil.format_nil_a_no_copy(revision), $str150$___, format_nil.format_nil_a_no_copy(corpus_id), $str151$___, format_nil.format_nil_a_no_copy(timestamp), $str152$__ }));
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return id;
    }

    public static final SubLObject insert_raw_linkage_alt(SubLObject stmt, SubLObject sentence, SubLObject run_id, SubLObject sentence_id, SubLObject lexicon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start = NIL;
                SubLObject duration = NIL;
                SubLObject ls = NIL;
                SubLObject contents = NIL;
                SubLObject id = NIL;
                SubLObject result = NIL;
                start = com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED);
                {
                    SubLObject time_var = get_internal_real_time();
                    ls = linkage.link_parse(sentence, linkage.$link_parse_options$.getDynamicValue(thread), lexicon, UNPROVIDED).first();
                    duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    duration = truncate(multiply(duration, $int$1000), UNPROVIDED);
                }
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        contents = (NIL != ls) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(prin1_to_string(list(linkage.ls_words(ls), linkage.ls_links(ls), linkage.ls_diagram(ls), linkage.ls_tree(ls)))), $str_alt135$_))) : NULL;
                        id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt153$raw_linkage_id_seq);
                        result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt138$__, format_nil.format_nil_a_no_copy(run_id), $str_alt138$__, format_nil.format_nil_a_no_copy(sentence_id), $str_alt138$__, format_nil.format_nil_a_no_copy(contents), $str_alt151$___, format_nil.format_nil_a_no_copy(start), $str_alt150$___, format_nil.format_nil_a_no_copy(duration), $str_alt155$_ }));
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != sdbc.sdbc_error_p(result)) {
                    sdbc.sdbc_error_throw(result);
                }
                return values(ls, id);
            }
        }
    }

    public static SubLObject insert_raw_linkage(final SubLObject stmt, final SubLObject sentence, final SubLObject run_id, final SubLObject sentence_id, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start = NIL;
        SubLObject duration = NIL;
        SubLObject ls = NIL;
        SubLObject contents = NIL;
        SubLObject id = NIL;
        SubLObject result = NIL;
        start = iso_8601_timestamp(UNPROVIDED);
        final SubLObject time_var = get_internal_real_time();
        ls = linkage.link_parse(sentence, linkage.$link_parse_options$.getDynamicValue(thread), lexicon, UNPROVIDED).first();
        duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        duration = truncate(multiply(duration, $int$1000), UNPROVIDED);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            contents = (NIL != ls) ? string_utilities.quote_string(postgresql_escape_string(prin1_to_string(list(linkage.ls_words(ls), linkage.ls_links(ls), linkage.ls_diagram(ls), linkage.ls_tree(ls)))), $str135$_) : NULL;
            id = get_postgresql_nextval(stmt, $str153$raw_linkage_id_seq);
            result = sdbc.sqls_execute_update(stmt, cconcatenate($str154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str138$__, format_nil.format_nil_a_no_copy(run_id), $str138$__, format_nil.format_nil_a_no_copy(sentence_id), $str138$__, format_nil.format_nil_a_no_copy(contents), $str151$___, format_nil.format_nil_a_no_copy(start), $str150$___, format_nil.format_nil_a_no_copy(duration), $str155$_ }));
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return values(ls, id);
    }

    public static final SubLObject insert_cached_raw_linkage_alt(SubLObject stmt, SubLObject run_id, SubLObject sentence_id, SubLObject ls, SubLObject start, SubLObject duration) {
        {
            SubLObject contents = (NIL != ls) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(prin1_to_string(list(linkage.ls_words(ls), linkage.ls_links(ls), linkage.ls_diagram(ls), linkage.ls_tree(ls)))), $str_alt135$_))) : NULL;
            SubLObject id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt153$raw_linkage_id_seq);
            SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt138$__, format_nil.format_nil_a_no_copy(run_id), $str_alt138$__, format_nil.format_nil_a_no_copy(sentence_id), $str_alt138$__, format_nil.format_nil_a_no_copy(contents), $str_alt151$___, format_nil.format_nil_a_no_copy(start), $str_alt150$___, format_nil.format_nil_a_no_copy(duration), $str_alt155$_ }));
            if (NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            return values(ls, id);
        }
    }

    public static SubLObject insert_cached_raw_linkage(final SubLObject stmt, final SubLObject run_id, final SubLObject sentence_id, final SubLObject ls, final SubLObject start, final SubLObject duration) {
        final SubLObject contents = (NIL != ls) ? string_utilities.quote_string(postgresql_escape_string(prin1_to_string(list(linkage.ls_words(ls), linkage.ls_links(ls), linkage.ls_diagram(ls), linkage.ls_tree(ls)))), $str135$_) : NULL;
        final SubLObject id = get_postgresql_nextval(stmt, $str153$raw_linkage_id_seq);
        final SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str138$__, format_nil.format_nil_a_no_copy(run_id), $str138$__, format_nil.format_nil_a_no_copy(sentence_id), $str138$__, format_nil.format_nil_a_no_copy(contents), $str151$___, format_nil.format_nil_a_no_copy(start), $str150$___, format_nil.format_nil_a_no_copy(duration), $str155$_ }));
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return values(ls, id);
    }

    public static final SubLObject insert_word_linkage_alt(SubLObject stmt, SubLObject sentence, SubLObject raw_linkage, SubLObject raw_linkage_id) {
        {
            SubLObject tagged_sent = NIL;
            if (NIL != raw_linkage) {
                tagged_sent = linkage.words_to_sentence(linkage.ls_words(raw_linkage));
                pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
                linkage.auxify_sentence(tagged_sent);
            }
            {
                SubLObject v_word_linkage = (NIL != raw_linkage) ? ((SubLObject) (word_linkage.new_word_linkage_from_link_structure(raw_linkage, tagged_sent, sentence, T))) : NIL;
                SubLObject word_count = (NIL != v_word_linkage) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(v_word_linkage, LENGTH))) : NULL;
                SubLObject xml = (NIL != v_word_linkage) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(methods.funcall_instance_method_with_0_args(v_word_linkage, XML)), $str_alt135$_))) : NULL;
                SubLObject id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt158$word_linkage_id_seq);
                SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt159$INSERT_INTO_word_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt138$__, format_nil.format_nil_a_no_copy(xml), $str_alt138$__, format_nil.format_nil_a_no_copy(raw_linkage_id), $str_alt138$__, format_nil.format_nil_a_no_copy(word_count), $str_alt155$_ }));
                if (NIL != sdbc.sdbc_error_p(result)) {
                    sdbc.sdbc_error_throw(result);
                }
                return id;
            }
        }
    }

    public static SubLObject insert_word_linkage(final SubLObject stmt, final SubLObject sentence, final SubLObject raw_linkage, final SubLObject raw_linkage_id) {
        SubLObject tagged_sent = NIL;
        if (NIL != raw_linkage) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(raw_linkage));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
        }
        final SubLObject v_word_linkage = (NIL != raw_linkage) ? word_linkage.new_word_linkage_from_link_structure(raw_linkage, tagged_sent, sentence, T) : NIL;
        final SubLObject word_count = (NIL != v_word_linkage) ? methods.funcall_instance_method_with_0_args(v_word_linkage, LENGTH) : NULL;
        final SubLObject xml = (NIL != v_word_linkage) ? string_utilities.quote_string(postgresql_escape_string(methods.funcall_instance_method_with_0_args(v_word_linkage, XML)), $str135$_) : NULL;
        final SubLObject id = get_postgresql_nextval(stmt, $str158$word_linkage_id_seq);
        final SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str159$INSERT_INTO_word_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str138$__, format_nil.format_nil_a_no_copy(xml), $str138$__, format_nil.format_nil_a_no_copy(raw_linkage_id), $str138$__, format_nil.format_nil_a_no_copy(word_count), $str155$_ }));
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return id;
    }

    public static final SubLObject insert_full_linkage_alt(SubLObject stmt, SubLObject raw_linkage, SubLObject raw_linkage_id, SubLObject lexicon) {
        {
            SubLObject tagged_sent = NIL;
            if (NIL != raw_linkage) {
                tagged_sent = linkage.words_to_sentence(linkage.ls_words(raw_linkage));
                pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
                linkage.auxify_sentence(tagged_sent);
            }
            {
                SubLObject v_linkage = (NIL != raw_linkage) ? ((SubLObject) (linkage.new_linkage_from_link_structure(raw_linkage, tagged_sent, object.new_class_instance(PARSE_TREE_CONTEXT)))) : NIL;
                SubLObject word_count = (NIL != v_linkage) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(v_linkage, LENGTH))) : NULL;
                SubLObject xml = (NIL != v_linkage) ? ((SubLObject) (string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(methods.funcall_instance_method_with_0_args(v_linkage, XML)), $str_alt135$_))) : NULL;
                SubLObject id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt160$full_linkage_id_seq);
                SubLObject lexified_count = NIL;
                SubLObject result = NIL;
                if (NIL != v_linkage) {
                    methods.funcall_instance_method_with_1_args(v_linkage, LEXIFY, lexicon);
                    lexified_count = com.cyc.cycjava.cycl.nlp_db_metrics.linkage_lexified_count(v_linkage, LINK_WORD_P);
                }
                if (NIL == lexified_count) {
                    lexified_count = NULL;
                }
                result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt163$INSERT_INTO_full_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt138$__, format_nil.format_nil_a_no_copy(xml), $str_alt138$__, format_nil.format_nil_a_no_copy(raw_linkage_id), $str_alt138$__, format_nil.format_nil_a_no_copy(word_count), $str_alt138$__, format_nil.format_nil_a_no_copy(lexified_count), $str_alt155$_ }));
                if (NIL != sdbc.sdbc_error_p(result)) {
                    sdbc.sdbc_error_throw(result);
                }
                return values(v_linkage, id);
            }
        }
    }

    public static SubLObject insert_full_linkage(final SubLObject stmt, final SubLObject raw_linkage, final SubLObject raw_linkage_id, final SubLObject lexicon) {
        SubLObject tagged_sent = NIL;
        if (NIL != raw_linkage) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(raw_linkage));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
        }
        final SubLObject v_linkage = (NIL != raw_linkage) ? linkage.new_linkage_from_link_structure(raw_linkage, tagged_sent, object.new_class_instance(PARSE_TREE_CONTEXT)) : NIL;
        final SubLObject word_count = (NIL != v_linkage) ? methods.funcall_instance_method_with_0_args(v_linkage, LENGTH) : NULL;
        final SubLObject xml = (NIL != v_linkage) ? string_utilities.quote_string(postgresql_escape_string(methods.funcall_instance_method_with_0_args(v_linkage, XML)), $str135$_) : NULL;
        final SubLObject id = get_postgresql_nextval(stmt, $str160$full_linkage_id_seq);
        SubLObject lexified_count = NIL;
        SubLObject result = NIL;
        if (NIL != v_linkage) {
            methods.funcall_instance_method_with_1_args(v_linkage, LEXIFY, lexicon);
            lexified_count = linkage_lexified_count(v_linkage, LINK_WORD_P);
        }
        if (NIL == lexified_count) {
            lexified_count = NULL;
        }
        result = sdbc.sqls_execute_update(stmt, cconcatenate($str163$INSERT_INTO_full_linkage_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str138$__, format_nil.format_nil_a_no_copy(xml), $str138$__, format_nil.format_nil_a_no_copy(raw_linkage_id), $str138$__, format_nil.format_nil_a_no_copy(word_count), $str138$__, format_nil.format_nil_a_no_copy(lexified_count), $str155$_ }));
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return values(v_linkage, id);
    }

    public static final SubLObject insert_link_cyclification_alt(SubLObject stmt, SubLObject v_linkage, SubLObject linkage_id, SubLObject lexicon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycls = NIL;
                SubLObject timed_outP = NIL;
                SubLObject start = NULL;
                SubLObject duration = NULL;
                if (NIL != v_linkage) {
                    start = string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), $str_alt135$_);
                    {
                        SubLObject time_var = get_internal_real_time();
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
                                                    SubLObject _prev_bind_0_30 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                    try {
                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer = with_timeout_start_timer($link_metrics_cyclification_timeout$.getDynamicValue(thread), tag);
                                                        cycls = methods.funcall_instance_method_with_1_args(v_linkage, CYCLIFY, list($LEXICON, lexicon));
                                                    } finally {
                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        with_timeout_stop_timer(timer);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
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
                        duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        duration = truncate(multiply(duration, $int$1000), UNPROVIDED);
                    }
                    if (NIL != timed_outP) {
                        Errors.warn($str_alt166$timed_out__);
                    }
                }
                {
                    SubLObject id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt167$link_cyclification_id_seq);
                    SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt168$INSERT_INTO_link_cyclification_VA, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt138$__, format_nil.format_nil_a_no_copy(linkage_id), $str_alt138$__, format_nil.format_nil_a_no_copy(start), $str_alt138$__, format_nil.format_nil_a_no_copy(duration), $str_alt155$_ }));
                    if (NIL != sdbc.sdbc_error_p(result)) {
                        sdbc.sdbc_error_throw(result);
                    }
                    {
                        SubLObject cdolist_list_var = cycls;
                        SubLObject cycl = NIL;
                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                            {
                                SubLObject xml = com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(com.cyc.cycjava.cycl.nlp_db_metrics.cycl_to_xml(cycl));
                                result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt169$INSERT_INTO_cyclifications_VALUES, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str_alt151$___, format_nil.format_nil_a_no_copy(xml), $str_alt152$__ }));
                                if (NIL != sdbc.sdbc_error_p(result)) {
                                    sdbc.sdbc_error_throw(result);
                                }
                            }
                        }
                    }
                    return values(cycls, id);
                }
            }
        }
    }

    public static SubLObject insert_link_cyclification(final SubLObject stmt, final SubLObject v_linkage, final SubLObject linkage_id, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        SubLObject timed_outP = NIL;
        SubLObject start = NULL;
        SubLObject duration = NULL;
        if (NIL != v_linkage) {
            start = string_utilities.quote_string(iso_8601_timestamp(UNPROVIDED), $str135$_);
            final SubLObject time_var = get_internal_real_time();
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$30 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer($link_metrics_cyclification_timeout$.getDynamicValue(thread), tag);
                            cycls = methods.funcall_instance_method_with_1_args(v_linkage, CYCLIFY, list($LEXICON, lexicon));
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$30, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
            duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            duration = truncate(multiply(duration, $int$1000), UNPROVIDED);
            if (NIL != timed_outP) {
                Errors.warn($str166$timed_out__);
            }
        }
        final SubLObject id = get_postgresql_nextval(stmt, $str167$link_cyclification_id_seq);
        SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str168$INSERT_INTO_link_cyclification_VA, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str138$__, format_nil.format_nil_a_no_copy(linkage_id), $str138$__, format_nil.format_nil_a_no_copy(start), $str138$__, format_nil.format_nil_a_no_copy(duration), $str155$_ }));
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject xml = postgresql_escape_string(cycl_to_xml(cycl));
            result = sdbc.sqls_execute_update(stmt, cconcatenate($str169$INSERT_INTO_cyclifications_VALUES, new SubLObject[]{ format_nil.format_nil_a_no_copy(id), $str151$___, format_nil.format_nil_a_no_copy(xml), $str152$__ }));
            if (NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return values(cycls, id);
    }

    public static final SubLObject insert_ebmt_cyclification_alt(SubLObject stmt, SubLObject v_linkage, SubLObject linkage_id, SubLObject lexicon, SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycls = NIL;
                SubLObject justifications = NIL;
                SubLObject weights = NIL;
                SubLObject start = NULL;
                SubLObject duration = NULL;
                if (NIL != v_linkage) {
                    start = string_utilities.quote_string(com.cyc.cycjava.cycl.nlp_db_metrics.iso_8601_timestamp(UNPROVIDED), $str_alt135$_);
                    {
                        SubLObject time_var = get_internal_real_time();
                        thread.resetMultipleValues();
                        {
                            SubLObject cycls_32 = ebmt_template_parser.ebmt_parse_linkage(v_linkage, sentence, lexicon, $$InferencePSC);
                            SubLObject justifications_33 = thread.secondMultipleValue();
                            SubLObject weights_34 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            cycls = cycls_32;
                            justifications = justifications_33;
                            weights = weights_34;
                        }
                        duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        duration = truncate(multiply(duration, $int$1000), UNPROVIDED);
                    }
                }
                {
                    SubLObject cyclf_id = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt167$link_cyclification_id_seq);
                    SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt168$INSERT_INTO_link_cyclification_VA, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyclf_id), $str_alt138$__, format_nil.format_nil_a_no_copy(linkage_id), $str_alt138$__, format_nil.format_nil_a_no_copy(start), $str_alt138$__, format_nil.format_nil_a_no_copy(duration), $str_alt155$_ }));
                    if (NIL != sdbc.sdbc_error_p(result)) {
                        sdbc.sdbc_error_throw(result);
                    }
                    {
                        SubLObject cycl = NIL;
                        SubLObject cycl_35 = NIL;
                        SubLObject j = NIL;
                        SubLObject j_36 = NIL;
                        for (cycl = cycls, cycl_35 = cycl.first(), j = justifications, j_36 = j.first(); !((NIL == j) && (NIL == cycl)); cycl = cycl.rest() , cycl_35 = cycl.first() , j = j.rest() , j_36 = j.first()) {
                            {
                                SubLObject xml = com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(com.cyc.cycjava.cycl.nlp_db_metrics.cycl_to_xml(cycl_35));
                                SubLObject justification = com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(princ_to_string(j_36));
                                SubLObject cid = com.cyc.cycjava.cycl.nlp_db_metrics.get_postgresql_nextval(stmt, $str_alt171$cyclifications_id_seq);
                                result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt169$INSERT_INTO_cyclifications_VALUES, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyclf_id), $str_alt151$___, format_nil.format_nil_a_no_copy(xml), $str_alt150$___, format_nil.format_nil_a_no_copy(cid), $str_alt155$_ }));
                                if (NIL != sdbc.sdbc_error_p(result)) {
                                    sdbc.sdbc_error_throw(result);
                                }
                                result = sdbc.sqls_execute_update(stmt, cconcatenate($str_alt172$INSERT_INTO_justification_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cid), $str_alt151$___, format_nil.format_nil_a_no_copy(justification), $str_alt152$__ }));
                                if (NIL != sdbc.sdbc_error_p(result)) {
                                    sdbc.sdbc_error_throw(result);
                                }
                            }
                        }
                    }
                    return values(cycls, cyclf_id);
                }
            }
        }
    }

    public static SubLObject insert_ebmt_cyclification(final SubLObject stmt, final SubLObject v_linkage, final SubLObject linkage_id, final SubLObject lexicon, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        SubLObject justifications = NIL;
        SubLObject weights = NIL;
        SubLObject start = NULL;
        SubLObject duration = NULL;
        if (NIL != v_linkage) {
            start = string_utilities.quote_string(iso_8601_timestamp(UNPROVIDED), $str135$_);
            final SubLObject time_var = get_internal_real_time();
            thread.resetMultipleValues();
            final SubLObject cycls_$32 = ebmt_template_parser.ebmt_parse_linkage(v_linkage, sentence, lexicon, $$InferencePSC);
            final SubLObject justifications_$33 = thread.secondMultipleValue();
            final SubLObject weights_$34 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            cycls = cycls_$32;
            justifications = justifications_$33;
            weights = weights_$34;
            duration = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            duration = truncate(multiply(duration, $int$1000), UNPROVIDED);
        }
        final SubLObject cyclf_id = get_postgresql_nextval(stmt, $str167$link_cyclification_id_seq);
        SubLObject result = sdbc.sqls_execute_update(stmt, cconcatenate($str168$INSERT_INTO_link_cyclification_VA, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyclf_id), $str138$__, format_nil.format_nil_a_no_copy(linkage_id), $str138$__, format_nil.format_nil_a_no_copy(start), $str138$__, format_nil.format_nil_a_no_copy(duration), $str155$_ }));
        if (NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        SubLObject cycl = NIL;
        SubLObject cycl_$35 = NIL;
        SubLObject j = NIL;
        SubLObject j_$36 = NIL;
        cycl = cycls;
        cycl_$35 = cycl.first();
        j = justifications;
        j_$36 = j.first();
        while ((NIL != j) || (NIL != cycl)) {
            final SubLObject xml = postgresql_escape_string(cycl_to_xml(cycl_$35));
            final SubLObject justification = postgresql_escape_string(princ_to_string(j_$36));
            final SubLObject cid = get_postgresql_nextval(stmt, $str171$cyclifications_id_seq);
            result = sdbc.sqls_execute_update(stmt, cconcatenate($str169$INSERT_INTO_cyclifications_VALUES, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyclf_id), $str151$___, format_nil.format_nil_a_no_copy(xml), $str150$___, format_nil.format_nil_a_no_copy(cid), $str155$_ }));
            if (NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            result = sdbc.sqls_execute_update(stmt, cconcatenate($str172$INSERT_INTO_justification_VALUES_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cid), $str151$___, format_nil.format_nil_a_no_copy(justification), $str152$__ }));
            if (NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            cycl = cycl.rest();
            cycl_$35 = cycl.first();
            j = j.rest();
            j_$36 = j.first();
        } 
        return values(cycls, cyclf_id);
    }

    public static final SubLObject insert_run_statistics_alt(SubLObject stmt, SubLObject run_id, SubLObject lex_verb_count, SubLObject lex_noun_count, SubLObject lex_adj_count, SubLObject lex_adv_count, SubLObject verb_interps_counts, SubLObject noun_interps_counts, SubLObject adj_interps_counts, SubLObject adv_interps_counts) {
        if ((((((((NIL != lex_verb_count) && (NIL != lex_noun_count)) && (NIL != lex_adj_count)) && (NIL != lex_adv_count)) && (NIL != verb_interps_counts)) && (NIL != noun_interps_counts)) && (NIL != adj_interps_counts)) && (NIL != adv_interps_counts)) {
            {
                SubLObject result = sdbc.sqls_execute_update(stmt, format(NIL, $str_alt173$INSERT_INTO_run_statistics_VALUES, new SubLObject[]{ run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, number_utilities.mean(verb_interps_counts), number_utilities.median(verb_interps_counts, UNPROVIDED), number_utilities.mean(noun_interps_counts), number_utilities.median(noun_interps_counts, UNPROVIDED), number_utilities.mean(adj_interps_counts), number_utilities.median(adj_interps_counts, UNPROVIDED), number_utilities.mean(adv_interps_counts), number_utilities.median(adv_interps_counts, UNPROVIDED) }));
                if (NIL != sdbc.sdbc_error_p(result)) {
                    sdbc.sdbc_error_throw(result);
                }
                return run_id;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject insert_run_statistics(final SubLObject stmt, final SubLObject run_id, final SubLObject lex_verb_count, final SubLObject lex_noun_count, final SubLObject lex_adj_count, final SubLObject lex_adv_count, final SubLObject verb_interps_counts, final SubLObject noun_interps_counts, final SubLObject adj_interps_counts, final SubLObject adv_interps_counts) {
        if ((((((((NIL != lex_verb_count) && (NIL != lex_noun_count)) && (NIL != lex_adj_count)) && (NIL != lex_adv_count)) && (NIL != verb_interps_counts)) && (NIL != noun_interps_counts)) && (NIL != adj_interps_counts)) && (NIL != adv_interps_counts)) {
            final SubLObject result = sdbc.sqls_execute_update(stmt, format(NIL, $str173$INSERT_INTO_run_statistics_VALUES, new SubLObject[]{ run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, number_utilities.mean(verb_interps_counts), number_utilities.median(verb_interps_counts, UNPROVIDED, UNPROVIDED), number_utilities.mean(noun_interps_counts), number_utilities.median(noun_interps_counts, UNPROVIDED, UNPROVIDED), number_utilities.mean(adj_interps_counts), number_utilities.median(adj_interps_counts, UNPROVIDED, UNPROVIDED), number_utilities.mean(adv_interps_counts), number_utilities.median(adv_interps_counts, UNPROVIDED, UNPROVIDED) }));
            if (NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            return run_id;
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    stringp;
     * 		
     * @param STMT
    sql-statement-p;
     * 		
     * @param LEXICON
    abstract-lexicon-p;
     * 		
     * @return vectorp; the newest link structure in the database for SENTENCE and LEXICON, using STMT
     */
    @LispMethod(comment = "@param SENTENCE\nstringp;\r\n\t\t\r\n@param STMT\nsql-statement-p;\r\n\t\t\r\n@param LEXICON\nabstract-lexicon-p;\r\n\t\t\r\n@return vectorp; the newest link structure in the database for SENTENCE and LEXICON, using STMT")
    public static final SubLObject db_get_link_structure_alt(SubLObject sentence, SubLObject stmt, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        {
            SubLObject rs = sdbc.sqls_execute_query(stmt, cconcatenate($str_alt174$SELECT_raw_linkage_contents______, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(sentence)), $str_alt175$________________ORDER_BY_raw_link }), UNPROVIDED);
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sqlrs_next(rs)) {
                if (NIL != sdbc.sqlrs_get_object(rs, ONE_INTEGER)) {
                    return linkage.new_link_structures(read_from_string(sdbc.sqlrs_get_object(rs, ONE_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon, sentence, T).first();
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    stringp;
     * 		
     * @param STMT
    sql-statement-p;
     * 		
     * @param LEXICON
    abstract-lexicon-p;
     * 		
     * @return vectorp; the newest link structure in the database for SENTENCE and LEXICON, using STMT
     */
    @LispMethod(comment = "@param SENTENCE\nstringp;\r\n\t\t\r\n@param STMT\nsql-statement-p;\r\n\t\t\r\n@param LEXICON\nabstract-lexicon-p;\r\n\t\t\r\n@return vectorp; the newest link structure in the database for SENTENCE and LEXICON, using STMT")
    public static SubLObject db_get_link_structure(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLObject rs = sdbc.sqls_execute_query(stmt, cconcatenate($str174$SELECT_raw_linkage_contents______, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(sentence)), $str175$________________ORDER_BY_raw_link }), UNPROVIDED);
        if (NIL != sdbc.sdbc_error_p(rs)) {
            sdbc.sdbc_error_throw(rs);
        }
        if ((NIL != sdbc.sqlrs_next(rs)) && (NIL != sdbc.sqlrs_get_object(rs, ONE_INTEGER))) {
            return linkage.new_link_structures(read_from_string(sdbc.sqlrs_get_object(rs, ONE_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon, sentence, T).first();
        }
        return NIL;
    }

    public static final SubLObject link_metrics_single_sql_value_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(query, STRINGP);
            {
                SubLObject result = NIL;
                SubLObject rs = NIL;
                SubLObject statement = NIL;
                SubLObject connection = NIL;
                try {
                    connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    } else {
                        statement = connection;
                    }
                    if (NIL != sdbc.sql_open_statement_p(statement)) {
                        rs = sdbc.sqls_execute_query(statement, query, UNPROVIDED);
                    } else {
                        rs = statement;
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sdbc_error_p(rs)) {
                        sdbc.sdbc_error_throw(rs);
                    }
                    if (NIL != sdbc.sqlrs_next(rs)) {
                        result = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL != sdbc.sql_null_p(result) ? ((SubLObject) (NIL)) : result;
            }
        }
    }

    public static SubLObject link_metrics_single_sql_value(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(query) : "! stringp(query) " + ("Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) ") + query;
        SubLObject result = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection($link_metric_db$.getDynamicValue(thread), $link_metric_user$.getDynamicValue(thread), $link_metric_password$.getDynamicValue(thread), list(new SubLObject[]{ $DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue(thread), $PORT, sdbc.$sql_port$.getGlobalValue(), $SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue(thread), $PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue(thread), $TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL != sdbc.sqlrs_next(rs)) {
                result = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != sdbc.sql_null_p(result) ? NIL : result;
    }

    public static final SubLObject link_metrics_run_value_alt(SubLObject run_id, SubLObject column) {
        return com.cyc.cycjava.cycl.nlp_db_metrics.link_metrics_single_sql_value(cconcatenate($str_alt176$SELECT_, new SubLObject[]{ format_nil.format_nil_a_no_copy(column), $str_alt177$_________FROM_run_statistics_____, format_nil.format_nil_a_no_copy(run_id) }));
    }

    public static SubLObject link_metrics_run_value(final SubLObject run_id, final SubLObject column) {
        return link_metrics_single_sql_value(cconcatenate($$$SELECT_, new SubLObject[]{ format_nil.format_nil_a_no_copy(column), $str177$_________FROM_run_statistics_____, format_nil.format_nil_a_no_copy(run_id) }));
    }

    /**
     * returns the number of words with TYPE in LINKAGE with some lexification
     */
    @LispMethod(comment = "returns the number of words with TYPE in LINKAGE with some lexification")
    public static final SubLObject linkage_lexified_count_alt(SubLObject v_linkage, SubLObject type) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject word = NIL;
            SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject w = aref(vector_var, element_num);
                    word = w;
                    if ((NIL != funcall(type, word)) && (NIL != methods.funcall_instance_method_with_0_args(word, GET_LEXES))) {
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            return count;
        }
    }

    @LispMethod(comment = "returns the number of words with TYPE in LINKAGE with some lexification")
    public static SubLObject linkage_lexified_count(final SubLObject v_linkage, final SubLObject type) {
        SubLObject count = ZERO_INTEGER;
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            if ((NIL != funcall(type, word)) && (NIL != methods.funcall_instance_method_with_0_args(word, GET_LEXES))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }/**
     * returns the number of words with TYPE in LINKAGE with some lexification
     */


    /**
     * returns a list of the number of interpretations for words of TYPE in LINKAGE
     */
    @LispMethod(comment = "returns a list of the number of interpretations for words of TYPE in LINKAGE")
    public static final SubLObject linkage_interps_count_alt(SubLObject v_linkage, SubLObject type) {
        {
            SubLObject counts = NIL;
            SubLObject word = NIL;
            SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject w = aref(vector_var, element_num);
                    word = w;
                    if (NIL != funcall(type, word)) {
                        counts = cons(length(methods.funcall_instance_method_with_0_args(word, GET_LEXES)), counts);
                    }
                }
            }
            return counts;
        }
    }

    @LispMethod(comment = "returns a list of the number of interpretations for words of TYPE in LINKAGE")
    public static SubLObject linkage_interps_count(final SubLObject v_linkage, final SubLObject type) {
        SubLObject counts = NIL;
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            if (NIL != funcall(type, word)) {
                counts = cons(length(methods.funcall_instance_method_with_0_args(word, GET_LEXES)), counts);
            }
        }
        return counts;
    }/**
     * returns a list of the number of interpretations for words of TYPE in LINKAGE
     */


    /**
     * returns a new version of STRING with appropriate escapes for meta characters
     */
    @LispMethod(comment = "returns a new version of STRING with appropriate escapes for meta characters")
    public static final SubLObject postgresql_escape_string_alt(SubLObject string) {
        return string_utilities.string_substitute($str_alt180$__, $str_alt135$_, string, UNPROVIDED);
    }

    @LispMethod(comment = "returns a new version of STRING with appropriate escapes for meta characters")
    public static SubLObject postgresql_escape_string(final SubLObject string) {
        return string_utilities.string_substitute($str180$__, $str135$_, string, UNPROVIDED);
    }/**
     * returns a new version of STRING with appropriate escapes for meta characters
     */


    public static final SubLObject get_corpus_id_alt(SubLObject stmt, SubLObject corpus) {
        {
            SubLObject rs = sdbc.sqls_execute_query(stmt, cconcatenate($str_alt181$SELECT_id_FROM_corpus_WHERE_name_, new SubLObject[]{ format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.nlp_db_metrics.postgresql_escape_string(corpus)), $str_alt135$_ }), UNPROVIDED);
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (NIL == sdbc.sqlrs_next(rs)) {
                Errors.error($str_alt182$Can_t_determine_id_for_unknown_co, corpus);
            }
            return sdbc.sqlrs_get_object(rs, ONE_INTEGER);
        }
    }

    public static SubLObject get_corpus_id(final SubLObject stmt, final SubLObject corpus) {
        final SubLObject rs = sdbc.sqls_execute_query(stmt, cconcatenate($str181$SELECT_id_FROM_corpus_WHERE_name_, new SubLObject[]{ format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), $str135$_ }), UNPROVIDED);
        if (NIL != sdbc.sdbc_error_p(rs)) {
            sdbc.sdbc_error_throw(rs);
        }
        if (NIL == sdbc.sqlrs_next(rs)) {
            Errors.error($str182$Can_t_determine_id_for_unknown_co, corpus);
        }
        return sdbc.sqlrs_get_object(rs, ONE_INTEGER);
    }

    /**
     * returns the next value of postgresql SEQUENCE using statement STMT
     */
    @LispMethod(comment = "returns the next value of postgresql SEQUENCE using statement STMT")
    public static final SubLObject get_postgresql_nextval_alt(SubLObject stmt, SubLObject sequence) {
        {
            SubLObject rs = sdbc.sqls_execute_query(stmt, cconcatenate($str_alt183$SELECT_nextval__, new SubLObject[]{ format_nil.format_nil_a_no_copy(sequence), $str_alt152$__ }), UNPROVIDED);
            SubLObject nextval = NIL;
            if (NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            sdbc.sqlrs_next(rs);
            nextval = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
            return nextval;
        }
    }

    @LispMethod(comment = "returns the next value of postgresql SEQUENCE using statement STMT")
    public static SubLObject get_postgresql_nextval(final SubLObject stmt, final SubLObject sequence) {
        final SubLObject rs = sdbc.sqls_execute_query(stmt, cconcatenate($str183$SELECT_nextval__, new SubLObject[]{ format_nil.format_nil_a_no_copy(sequence), $str152$__ }), UNPROVIDED);
        SubLObject nextval = NIL;
        if (NIL != sdbc.sdbc_error_p(rs)) {
            sdbc.sdbc_error_throw(rs);
        }
        sdbc.sqlrs_next(rs);
        nextval = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
        return nextval;
    }/**
     * returns the next value of postgresql SEQUENCE using statement STMT
     */


    /**
     * returns a timestamp (date and time) in ISO-8601 format without timezone
     */
    @LispMethod(comment = "returns a timestamp (date and time) in ISO-8601 format without timezone")
    public static final SubLObject iso_8601_timestamp_alt(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == universal_time) {
                universal_time = get_universal_time();
            }
            thread.resetMultipleValues();
            {
                SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                SubLObject date = thread.fourthMultipleValue();
                SubLObject month = thread.fifthMultipleValue();
                SubLObject year = thread.sixthMultipleValue();
                thread.resetMultipleValues();
                return format(NIL, $str_alt184$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[]{ year, month, date, hour, minute, second });
            }
        }
    }

    @LispMethod(comment = "returns a timestamp (date and time) in ISO-8601 format without timezone")
    public static SubLObject iso_8601_timestamp(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == universal_time) {
            universal_time = get_universal_time();
        }
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return format(NIL, $str184$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[]{ year, month, date, hour, minute, second });
    }/**
     * returns a timestamp (date and time) in ISO-8601 format without timezone
     */


    /**
     * returns the xml string representation of expression CYCL
     */
    @LispMethod(comment = "returns the xml string representation of expression CYCL")
    public static final SubLObject cycl_to_xml_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xml = NIL;
                {
                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(NIL, thread);
                        try {
                            xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            cycml.cycml_serialize_term(cycl);
                            xml = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
                        } finally {
                            {
                                SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                }
                            }
                        }
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                }
                return xml;
            }
        }
    }

    @LispMethod(comment = "returns the xml string representation of expression CYCL")
    public static SubLObject cycl_to_xml(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml = NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(NIL, thread);
            try {
                xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                cycml.cycml_serialize_term(cycl);
                xml = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return xml;
    }/**
     * returns the xml string representation of expression CYCL
     */


    public static SubLObject declare_nlp_db_metrics_file() {
        declareMacro("with_link_metrics_statement", "WITH-LINK-METRICS-STATEMENT");
        declareMacro("with_link_metrics_result_set", "WITH-LINK-METRICS-RESULT-SET");
        declareMacro("do_link_metrics_result_set", "DO-LINK-METRICS-RESULT-SET");
        declareMacro("do_link_metrics_corpus", "DO-LINK-METRICS-CORPUS");
        declareMacro("do_link_metrics_link_structures", "DO-LINK-METRICS-LINK-STRUCTURES");
        declareMacro("update_lexicon_statistics", "UPDATE-LEXICON-STATISTICS");
        declareFunction("db_raw_linkage_run", "DB-RAW-LINKAGE-RUN", 1, 1, false);
        declareFunction("db_word_linkage_run", "DB-WORD-LINKAGE-RUN", 1, 1, false);
        declareFunction("db_full_linkage_run", "DB-FULL-LINKAGE-RUN", 1, 1, false);
        declareFunction("db_link_cyclification_run", "DB-LINK-CYCLIFICATION-RUN", 1, 1, false);
        declareFunction("db_ebmt_cyclification_run", "DB-EBMT-CYCLIFICATION-RUN", 1, 1, false);
        declareFunction("db_cached_ebmt_cyclification_run", "DB-CACHED-EBMT-CYCLIFICATION-RUN", 1, 1, false);
        declareFunction("db_get_run_corpus", "DB-GET-RUN-CORPUS", 1, 0, false);
        declareFunction("link_metrics_delete_run", "LINK-METRICS-DELETE-RUN", 1, 0, false);
        declareFunction("link_metrics_sentence_count", "LINK-METRICS-SENTENCE-COUNT", 1, 0, false);
        declareFunction("link_metrics_avg_interpretation_count", "LINK-METRICS-AVG-INTERPRETATION-COUNT", 1, 0, false);
        declareFunction("link_metrics_median_interpretation_count", "LINK-METRICS-MEDIAN-INTERPRETATION-COUNT", 1, 0, false);
        declareFunction("link_metrics_no_interpretation_count", "LINK-METRICS-NO-INTERPRETATION-COUNT", 1, 0, false);
        declareFunction("link_metrics_failed_link_parse_sentences", "LINK-METRICS-FAILED-LINK-PARSE-SENTENCES", 1, 0, false);
        declareFunction("link_metrics_succeeded_link_parse_sentences", "LINK-METRICS-SUCCEEDED-LINK-PARSE-SENTENCES", 1, 0, false);
        declareFunction("link_metrics_avg_lexified_word_count", "LINK-METRICS-AVG-LEXIFIED-WORD-COUNT", 1, 0, false);
        declareFunction("link_metrics_median_lexified_word_count", "LINK-METRICS-MEDIAN-LEXIFIED-WORD-COUNT", 1, 0, false);
        declareFunction("link_metrics_raw_linkage_diffs", "LINK-METRICS-RAW-LINKAGE-DIFFS", 2, 0, false);
        declareFunction("link_metrics_lexified_verb_count", "LINK-METRICS-LEXIFIED-VERB-COUNT", 1, 0, false);
        declareFunction("link_metrics_lexified_noun_count", "LINK-METRICS-LEXIFIED-NOUN-COUNT", 1, 0, false);
        declareFunction("link_metrics_lexified_adj_count", "LINK-METRICS-LEXIFIED-ADJ-COUNT", 1, 0, false);
        declareFunction("link_metrics_lexified_adv_count", "LINK-METRICS-LEXIFIED-ADV-COUNT", 1, 0, false);
        declareFunction("link_metrics_mean_verb_interps", "LINK-METRICS-MEAN-VERB-INTERPS", 1, 0, false);
        declareFunction("link_metrics_mean_noun_interps", "LINK-METRICS-MEAN-NOUN-INTERPS", 1, 0, false);
        declareFunction("link_metrics_mean_adj_interps", "LINK-METRICS-MEAN-ADJ-INTERPS", 1, 0, false);
        declareFunction("link_metrics_mean_adv_interps", "LINK-METRICS-MEAN-ADV-INTERPS", 1, 0, false);
        declareFunction("link_metrics_median_verb_interps", "LINK-METRICS-MEDIAN-VERB-INTERPS", 1, 0, false);
        declareFunction("link_metrics_median_noun_interps", "LINK-METRICS-MEDIAN-NOUN-INTERPS", 1, 0, false);
        declareFunction("link_metrics_median_adj_interps", "LINK-METRICS-MEDIAN-ADJ-INTERPS", 1, 0, false);
        declareFunction("link_metrics_median_adv_interps", "LINK-METRICS-MEDIAN-ADV-INTERPS", 1, 0, false);
        declareFunction("time_count_failed_table", "TIME-COUNT-FAILED-TABLE", 1, 1, false);
        declareFunction("time_count_succeeded_table", "TIME-COUNT-SUCCEEDED-TABLE", 1, 1, false);
        declareFunction("length_count_failed_table", "LENGTH-COUNT-FAILED-TABLE", 1, 0, false);
        declareFunction("length_count_succeeded_table", "LENGTH-COUNT-SUCCEEDED-TABLE", 1, 0, false);
        declareFunction("print_table", "PRINT-TABLE", 1, 1, false);
        declareFunction("generate_tables", "GENERATE-TABLES", 1, 1, false);
        declareFunction("nlp_db_metrics_corpora", "NLP-DB-METRICS-CORPORA", 0, 0, false);
        declareFunction("nlp_db_metrics_corpus_size", "NLP-DB-METRICS-CORPUS-SIZE", 1, 0, false);
        declareFunction("nlp_db_metrics_runs", "NLP-DB-METRICS-RUNS", 1, 0, false);
        declareFunction("nlp_db_metrics_add_corpus", "NLP-DB-METRICS-ADD-CORPUS", 2, 0, false);
        declareFunction("add_sentence_to_corpus", "ADD-SENTENCE-TO-CORPUS", 2, 0, false);
        declareFunction("nlp_db_metrics_sentence_in_corpusP", "NLP-DB-METRICS-SENTENCE-IN-CORPUS?", 2, 0, false);
        declareFunction("avg_sentence_length_failed", "AVG-SENTENCE-LENGTH-FAILED", 1, 0, false);
        declareFunction("median_sentence_length_failed", "MEDIAN-SENTENCE-LENGTH-FAILED", 1, 0, false);
        declareFunction("avg_sentence_length_succeeded", "AVG-SENTENCE-LENGTH-SUCCEEDED", 1, 0, false);
        declareFunction("median_sentence_length_succeeded", "MEDIAN-SENTENCE-LENGTH-SUCCEEDED", 1, 0, false);
        declareFunction("db_get_word_linkage", "DB-GET-WORD-LINKAGE", 2, 1, false);
        declareFunction("db_get_linkage", "DB-GET-LINKAGE", 2, 1, false);
        declareFunction("insert_run", "INSERT-RUN", 4, 0, false);
        declareFunction("insert_raw_linkage", "INSERT-RAW-LINKAGE", 5, 0, false);
        declareFunction("insert_cached_raw_linkage", "INSERT-CACHED-RAW-LINKAGE", 6, 0, false);
        declareFunction("insert_word_linkage", "INSERT-WORD-LINKAGE", 4, 0, false);
        declareFunction("insert_full_linkage", "INSERT-FULL-LINKAGE", 4, 0, false);
        declareFunction("insert_link_cyclification", "INSERT-LINK-CYCLIFICATION", 4, 0, false);
        declareFunction("insert_ebmt_cyclification", "INSERT-EBMT-CYCLIFICATION", 5, 0, false);
        declareFunction("insert_run_statistics", "INSERT-RUN-STATISTICS", 10, 0, false);
        declareFunction("db_get_link_structure", "DB-GET-LINK-STRUCTURE", 2, 1, false);
        declareFunction("link_metrics_single_sql_value", "LINK-METRICS-SINGLE-SQL-VALUE", 1, 0, false);
        declareFunction("link_metrics_run_value", "LINK-METRICS-RUN-VALUE", 2, 0, false);
        declareFunction("linkage_lexified_count", "LINKAGE-LEXIFIED-COUNT", 2, 0, false);
        declareFunction("linkage_interps_count", "LINKAGE-INTERPS-COUNT", 2, 0, false);
        declareFunction("postgresql_escape_string", "POSTGRESQL-ESCAPE-STRING", 1, 0, false);
        declareFunction("get_corpus_id", "GET-CORPUS-ID", 2, 0, false);
        declareFunction("get_postgresql_nextval", "GET-POSTGRESQL-NEXTVAL", 2, 0, false);
        declareFunction("iso_8601_timestamp", "ISO-8601-TIMESTAMP", 0, 1, false);
        declareFunction("cycl_to_xml", "CYCL-TO-XML", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nlp_db_metrics_file() {
        defparameter("*LINK-METRIC-DB*", $str0$nlp_metrics);
        defparameter("*LINK-METRIC-USER*", $$$postgres);
        defparameter("*LINK-METRIC-DBMS-SERVER*", $str2$cyc11_cyc_com);
        defparameter("*LINK-METRIC-PASSWORD*", $str3$);
        defparameter("*LINK-METRIC-SUBPROTOCOL*", $$$postgresql);
        defparameter("*LINK-METRIC-PROXY-SERVER*", $str5$billie_cyc_com);
        defparameter("*LINK-METRICS-CYCLIFICATION-TIMEOUT*", multiply(FIVE_INTEGER, $int$60));
        return NIL;
    }

    public static SubLObject setup_nlp_db_metrics_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nlp_db_metrics_file();
    }

    @Override
    public void initializeVariables() {
        init_nlp_db_metrics_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nlp_db_metrics_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$nlp_metrics = makeString("nlp_metrics");

    static private final SubLString $str_alt2$cyc11_cyc_com = makeString("cyc11.cyc.com");

    static private final SubLString $str_alt5$billie_cyc_com = makeString("billie.cyc.com");

    static private final SubLList $list_alt7 = list(list(makeSymbol("STMT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeSymbol("*LINK-METRIC-DB*"), makeSymbol("*LINK-METRIC-USER*"), makeSymbol("*LINK-METRIC-PASSWORD*"), makeKeyword("DBMS-SERVER"), makeSymbol("*LINK-METRIC-DBMS-SERVER*"), makeKeyword("SUBPROTOCOL"), makeSymbol("*LINK-METRIC-SUBPROTOCOL*"), makeKeyword("PROXY-SERVER"), makeSymbol("*LINK-METRIC-PROXY-SERVER*") });

    static private final SubLList $list_alt13 = list(list(makeSymbol("RS"), makeSymbol("QUERY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("SENTENCE-ID"), makeSymbol("SENTENCE"), makeSymbol("CORPUS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt24$SELECT_sentence_id__sentence_cont = makeString("SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = \'~a\'\n                         AND sentence.corpus_id = corpus.id");

    static private final SubLList $list_alt27 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), ONE_INTEGER));

    static private final SubLList $list_alt28 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), TWO_INTEGER));

    static private final SubLList $list_alt29 = list(list(new SubLObject[]{ makeSymbol("LINKAGE-ID"), makeSymbol("LS"), makeSymbol("SENTENCE-ID"), makeSymbol("SENTENCE"), makeSymbol("START"), makeSymbol("DURATION"), makeSymbol("RUN-ID"), makeSymbol("&OPTIONAL"), makeSymbol("LEXICON") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt30$SELECT_raw_linkage_id__raw_linkag = makeString("SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ~a\n                         AND raw_linkage.sentence_id = sentence.id");

    static private final SubLList $list_alt31 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), THREE_INTEGER));

    static private final SubLList $list_alt32 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), FOUR_INTEGER));

    static private final SubLList $list_alt34 = list(makeSymbol("SQL-NULL-P"), list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), TWO_INTEGER));

    static private final SubLList $list_alt37 = list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), TWO_INTEGER));

    static private final SubLList $list_alt38 = list(T);

    static private final SubLList $list_alt39 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), FIVE_INTEGER));

    static private final SubLList $list_alt40 = list(list(makeSymbol("SQLRS-GET-OBJECT"), makeSymbol("RS"), SIX_INTEGER));

    static private final SubLList $list_alt41 = list(new SubLObject[]{ makeSymbol("LINKAGE"), makeSymbol("LEX-VERB-COUNT"), makeSymbol("LEX-NOUN-COUNT"), makeSymbol("LEX-ADJ-COUNT"), makeSymbol("LEX-ADV-COUNT"), makeSymbol("VERB-INTERPS-COUNTS"), makeSymbol("NOUN-INTERPS-COUNTS"), makeSymbol("ADJ-INTERPS-COUNTS"), makeSymbol("ADV-INTERPS-COUNTS") });

    static private final SubLList $list_alt45 = list(list(QUOTE, makeSymbol("VERB-LINK-WORD-P")));

    static private final SubLList $list_alt46 = list(list(QUOTE, makeSymbol("NOUN-LINK-WORD-P")));

    static private final SubLList $list_alt47 = list(list(QUOTE, makeSymbol("ADJECTIVE-LINK-WORD-P")));

    static private final SubLList $list_alt48 = list(list(QUOTE, makeSymbol("ADVERB-LINK-WORD-P")));

    static private final SubLString $str_alt59$SELECT_sentence_id__sentence_cont = makeString("SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = \'");

    static private final SubLString $str_alt60$___________________________AND_se = makeString("\'\n                         AND sentence.corpus_id = corpus.id");

    static private final SubLString $str_alt61$___a___a___a__ = makeString("~%~a, ~a: ~a~%");

    static private final SubLString $str_alt71$SELECT_raw_linkage_id__raw_linkag = makeString("SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ");

    static private final SubLString $str_alt72$__________________________AND_raw = makeString("\n                         AND raw_linkage.sentence_id = sentence.id");

    static private final SubLString $str_alt73$SELECT_corpus_name________FROM_ru = makeString("SELECT corpus.name\n       FROM run, corpus\n       WHERE run.id = ");

    static private final SubLString $str_alt74$________AND_run_corpus_id___corpu = makeString("\n       AND run.corpus_id = corpus.id");

    static private final SubLString $str_alt75$DELETE_FROM_justification________ = makeString("DELETE FROM justification\n           WHERE justification.cyclf_id = cyclifications.id\n           AND cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt76$DELETE_FROM_cyclifications_______ = makeString("DELETE FROM cyclifications\n           WHERE cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt77$DELETE_FROM_link_cyclification___ = makeString("DELETE FROM link_cyclification\n           WHERE link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt78$DELETE_FROM_full_linkage_________ = makeString("DELETE FROM full_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt79$DELETE_FROM_word_linkage_________ = makeString("DELETE FROM word_linkage\n           WHERE word_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt80$DELETE_FROM_raw_linkage__________ = makeString("DELETE FROM raw_linkage\n           WHERE raw_linkage.run_id = ");

    static private final SubLString $str_alt81$DELETE_FROM_run_statistics_______ = makeString("DELETE FROM run_statistics\n           WHERE run_id = ");

    static private final SubLString $str_alt82$DELETE_FROM_run____________WHERE_ = makeString("DELETE FROM run\n           WHERE run.id = ");

    static private final SubLString $str_alt83$SELECT_count_sentence_id_________ = makeString("SELECT count(sentence_id)\n       FROM raw_linkage\n       WHERE run_id = ");

    static private final SubLString $str_alt84$SELECT_link_cyclification_id_____ = makeString("SELECT link_cyclification.id, \n                  COUNT(xml) AS cycl_counts\n           FROM link_cyclification, cyclifications\n           WHERE link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt85$____________GROUP_BY_link_cyclifi = makeString("\n           GROUP BY link_cyclification.id");

    static private final SubLString $str_alt86$SELECT_COUNT_link_cyclification_i = makeString("SELECT COUNT(link_cyclification.id)\n       FROM link_cyclification\n       WHERE link_cyclification.linkage_id = full_linkage.id\n       AND full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = ");

    static private final SubLString $str_alt87$________AND_NOT_EXISTS___________ = makeString("\n       AND NOT EXISTS\n          (SELECT link_cyclf_id\n           FROM cyclifications\n           WHERE link_cyclification.id = cyclifications.link_cyclf_id)");

    static private final SubLString $str_alt88$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NULL\n           AND sentence_id = sentence.id\n           AND run_id = ");

    static private final SubLString $str_alt89$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NOT NULL\n           AND sentence_id = sentence.id\n           AND run_id = ");

    static private final SubLString $str_alt90$SELECT_AVG_lexified_count________ = makeString("SELECT AVG(lexified_count)\n       FROM full_linkage, raw_linkage\n       WHERE full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = ");

    static private final SubLString $str_alt91$SELECT_lexified_count____________ = makeString("SELECT lexified_count\n           FROM full_linkage, raw_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");

    static private final SubLString $str_alt92$SELECT_sentence_contents__raw_lin = makeString("SELECT sentence.contents, raw_linkage1.contents, raw_linkage2.contents\n           FROM sentence,\n                raw_linkage AS raw_linkage1,\n                raw_linkage AS raw_linkage2\n           WHERE raw_linkage1.run_id = ");

    static private final SubLString $str_alt93$____________AND_raw_linkage2_run_ = makeString("\n           AND raw_linkage2.run_id = ");

    static private final SubLString $str_alt94$____________AND_raw_linkage1_sent = makeString("\n           AND raw_linkage1.sentence_id = raw_linkage2.sentence_id\n           AND raw_linkage1.sentence_id = sentence.id\n           AND raw_linkage1.contents <> raw_linkage2.contents");

    static private final SubLString $str_alt95$_a____a____a____a____a___________ = makeString("~a~%=~a=~%~a~%=~a=~%~a~%=============================================~%");

    static private final SubLString $str_alt96$lex_verb_count = makeString("lex_verb_count");

    static private final SubLString $str_alt97$lex_noun_count = makeString("lex_noun_count");

    static private final SubLString $str_alt98$lex_adj_count = makeString("lex_adj_count");

    static private final SubLString $str_alt99$lex_adv_count = makeString("lex_adv_count");

    static private final SubLString $str_alt100$mean_verb_lexes = makeString("mean_verb_lexes");

    static private final SubLString $str_alt101$mean_noun_lexes = makeString("mean_noun_lexes");

    static private final SubLString $str_alt102$mean_adj_lexes = makeString("mean_adj_lexes");

    static private final SubLString $str_alt103$mean_adv_lexes = makeString("mean_adv_lexes");

    static private final SubLString $str_alt104$med_verb_lexes = makeString("med_verb_lexes");

    static private final SubLString $str_alt105$med_noun_lexes = makeString("med_noun_lexes");

    static private final SubLString $str_alt106$med_adj_lexes = makeString("med_adj_lexes");

    static private final SubLString $str_alt107$med_adv_lexes = makeString("med_adv_lexes");

    static private final SubLString $str_alt110$SELECT_duration_____________FROM_ = makeString("SELECT duration \n           FROM raw_linkage\n           WHERE contents is NULL\n           AND run_id = ");

    static private final SubLString $str_alt113$SELECT_duration_____________FROM_ = makeString("SELECT duration \n           FROM raw_linkage\n           WHERE contents is NOT NULL\n           AND run_id = ");

    static private final SubLString $str_alt114$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NULL\n           AND run_id = ");

    static private final SubLString $str_alt115$____________AND_sentence_id___sen = makeString("\n           AND sentence.id = sentence_id");

    static private final SubLString $str_alt116$SELECT_sentence_contents_________ = makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NOT NULL\n           AND run_id = ");

    static private final SubLString $str_alt117$_a_t_a_T__ = makeString("~a~t~a~T~%");

    static private final SubLString $str_alt118$_home_aldag_time_count_failed_100 = makeString("/home/aldag/time-count-failed-100.txt");

    static private final SubLString $str_alt120$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt121$_home_aldag_time_count_succeeded_ = makeString("/home/aldag/time-count-succeeded-100.txt");

    static private final SubLString $str_alt122$_home_aldag_length_count_failed_1 = makeString("/home/aldag/length-count-failed-100.txt");

    static private final SubLString $str_alt123$_home_aldag_length_count_succeede = makeString("/home/aldag/length-count-succeeded-100.txt");

    static private final SubLString $str_alt124$SELECT_id__name__comment_FROM_cor = makeString("SELECT id, name, comment FROM corpus");

    static private final SubLString $str_alt128$SELECT_COUNT_id__from_sentence_wh = makeString("SELECT COUNT(id) from sentence where corpus_id=");

    static private final SubLString $str_alt129$_ = makeString(";");

    static private final SubLString $str_alt130$SELECT_id__type__comment__kb__rev = makeString("SELECT id, type, comment, kb, revision, start FROM run where corpus_id = ");

    static private final SubLString $str_alt135$_ = makeString("'");

    static private final SubLString $str_alt137$INSERT_INTO_corpus_name__comment_ = makeString("INSERT INTO corpus(name, comment) VALUES(");

    static private final SubLString $str_alt138$__ = makeString(", ");

    static private final SubLString $str_alt139$__ = makeString(");");

    static private final SubLString $str_alt140$INSERT_INTO_sentence_corpus_id__c = makeString("INSERT INTO sentence(corpus_id, contents) VALUES(");

    static private final SubLString $str_alt141$SELECT_id_from_sentence_WHERE_cor = makeString("SELECT id from sentence WHERE corpus_id=");

    static private final SubLString $str_alt142$_AND_contents_ = makeString(" AND contents=");

    static private final SubLString $str_alt146$run_id_seq = makeString("run_id_seq");

    static private final SubLString $str_alt147$INSERT_INTO_run_VALUES_ = makeString("INSERT INTO run VALUES(");

    static private final SubLString $str_alt148$__ = makeString(",'");

    static private final SubLString $str_alt149$____ = makeString("', '");

    static private final SubLString $str_alt150$___ = makeString("', ");

    static private final SubLString $str_alt151$___ = makeString(", '");

    static private final SubLString $str_alt152$__ = makeString("')");

    static private final SubLString $str_alt153$raw_linkage_id_seq = makeString("raw_linkage_id_seq");

    static private final SubLString $str_alt154$INSERT_INTO_raw_linkage_VALUES_ = makeString("INSERT INTO raw_linkage VALUES(");

    static private final SubLString $str_alt155$_ = makeString(")");

    static private final SubLString $str_alt158$word_linkage_id_seq = makeString("word_linkage_id_seq");

    static private final SubLString $str_alt159$INSERT_INTO_word_linkage_VALUES_ = makeString("INSERT INTO word_linkage VALUES(");

    static private final SubLString $str_alt160$full_linkage_id_seq = makeString("full_linkage_id_seq");

    static private final SubLString $str_alt163$INSERT_INTO_full_linkage_VALUES_ = makeString("INSERT INTO full_linkage VALUES(");

    static private final SubLString $str_alt166$timed_out__ = makeString("timed out~%");

    static private final SubLString $str_alt167$link_cyclification_id_seq = makeString("link_cyclification_id_seq");

    static private final SubLString $str_alt168$INSERT_INTO_link_cyclification_VA = makeString("INSERT INTO link_cyclification VALUES(");

    static private final SubLString $str_alt169$INSERT_INTO_cyclifications_VALUES = makeString("INSERT INTO cyclifications VALUES(");

    static private final SubLString $str_alt171$cyclifications_id_seq = makeString("cyclifications_id_seq");

    static private final SubLString $str_alt172$INSERT_INTO_justification_VALUES_ = makeString("INSERT INTO justification VALUES(");

    static private final SubLString $str_alt173$INSERT_INTO_run_statistics_VALUES = makeString("INSERT INTO run_statistics VALUES(~a, ~a, ~a, ~a, ~a, ~f, ~f, ~f, ~f, ~f, ~f, ~f, ~f)");

    static private final SubLString $str_alt174$SELECT_raw_linkage_contents______ = makeString("SELECT raw_linkage.contents \n             FROM raw_linkage, sentence \n             WHERE raw_linkage.contents IS NOT NULL \n             AND raw_linkage.sentence_id = sentence.id \n             AND sentence.contents = \'");

    static private final SubLString $str_alt175$________________ORDER_BY_raw_link = makeString("\' \n             ORDER BY raw_linkage.start DESC\n             LIMIT 1");

    static private final SubLString $str_alt176$SELECT_ = makeString("SELECT ");

    static private final SubLString $str_alt177$_________FROM_run_statistics_____ = makeString(" \n       FROM run_statistics \n       WHERE run_id = ");

    static private final SubLString $str_alt180$__ = makeString("\\\'");

    static private final SubLString $str_alt181$SELECT_id_FROM_corpus_WHERE_name_ = makeString("SELECT id FROM corpus WHERE name = '");

    static private final SubLString $str_alt182$Can_t_determine_id_for_unknown_co = makeString("Can't determine id for unknown corpus ~a");

    static private final SubLString $str_alt183$SELECT_nextval__ = makeString("SELECT nextval('");

    static private final SubLString $str_alt184$_4__0D__2__0D__2__0D__2__0D__2__0 = makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D");
}

/**
 * Total time: 1489 ms synthetic
 */
