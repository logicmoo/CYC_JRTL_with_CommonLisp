package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nlp_db_metrics extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nlp_db_metrics";
    public static final String myFingerPrint = "97ab68b18efb77d599febaf5b8dc213f929fcc1e7a62ed29c263ef5cc1da6931";
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 975L)
    private static SubLSymbol $link_metric_db$;
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1053L)
    private static SubLSymbol $link_metric_user$;
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1106L)
    private static SubLSymbol $link_metric_dbms_server$;
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1171L)
    private static SubLSymbol $link_metric_password$;
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1220L)
    private static SubLSymbol $link_metric_subprotocol$;
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1282L)
    private static SubLSymbol $link_metric_proxy_server$;
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1349L)
    private static SubLSymbol $link_metrics_cyclification_timeout$;
    private static final SubLString $str0$nlp_metrics;
    private static final SubLString $str1$postgres;
    private static final SubLString $str2$cyc11_cyc_com;
    private static final SubLString $str3$;
    private static final SubLString $str4$postgresql;
    private static final SubLString $str5$billie_cyc_com;
    private static final SubLInteger $int6$60;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$WITH_SQL_STATEMENT;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PWHEN;
    private static final SubLSymbol $sym11$SDBC_ERROR_P;
    private static final SubLSymbol $sym12$SDBC_ERROR_THROW;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$WITH_SQL_RESULT_SET;
    private static final SubLSymbol $sym15$WITH_LINK_METRICS_RESULT_SET;
    private static final SubLSymbol $sym16$SQL_RESULT_SET_P;
    private static final SubLSymbol $sym17$WHILE;
    private static final SubLSymbol $sym18$SQLRS_NEXT;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$CLET;
    private static final SubLSymbol $sym21$DO_LINK_METRICS_RESULT_SET;
    private static final SubLSymbol $sym22$RS;
    private static final SubLSymbol $sym23$FORMAT_NIL;
    private static final SubLString $str24$SELECT_sentence_id__sentence_cont;
    private static final SubLSymbol $sym25$POSTGRESQL_ESCAPE_STRING;
    private static final SubLSymbol $sym26$CSETQ;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLString $str30$SELECT_raw_linkage_id__raw_linkag;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$FIF;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$FIRST;
    private static final SubLSymbol $sym36$NEW_LINK_STRUCTURES;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$PROGN;
    private static final SubLSymbol $sym43$CINC;
    private static final SubLSymbol $sym44$LINKAGE_LEXIFIED_COUNT;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$CDOLIST;
    private static final SubLSymbol $sym50$COUNT;
    private static final SubLSymbol $sym51$LINKAGE_INTERPS_COUNT;
    private static final SubLSymbol $sym52$CPUSH;
    private static final SubLSymbol $sym53$STRINGP;
    private static final SubLSymbol $kw54$DBMS_SERVER;
    private static final SubLSymbol $kw55$PORT;
    private static final SubLSymbol $kw56$SUBPROTOCOL;
    private static final SubLSymbol $kw57$PROXY_SERVER;
    private static final SubLSymbol $kw58$TIMEOUT;
    private static final SubLString $str59$SELECT_sentence_id__sentence_cont;
    private static final SubLString $str60$___________________________AND_se;
    private static final SubLString $str61$___a___a___a__;
    private static final SubLSymbol $sym62$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION;
    private static final SubLSymbol $kw64$THROW;
    private static final SubLSymbol $kw65$RETURN;
    private static final SubLSymbol $sym66$VERB_LINK_WORD_P;
    private static final SubLSymbol $sym67$NOUN_LINK_WORD_P;
    private static final SubLSymbol $sym68$ADJECTIVE_LINK_WORD_P;
    private static final SubLSymbol $sym69$ADVERB_LINK_WORD_P;
    private static final SubLSymbol $sym70$POSITIVE_INTEGER_P;
    private static final SubLString $str71$SELECT_raw_linkage_id__raw_linkag;
    private static final SubLString $str72$__________________________AND_raw;
    private static final SubLString $str73$SELECT_corpus_name________FROM_ru;
    private static final SubLString $str74$________AND_run_corpus_id___corpu;
    private static final SubLString $str75$DELETE_FROM_justification________;
    private static final SubLString $str76$DELETE_FROM_cyclifications_______;
    private static final SubLString $str77$DELETE_FROM_link_cyclification___;
    private static final SubLString $str78$DELETE_FROM_full_linkage_________;
    private static final SubLString $str79$DELETE_FROM_word_linkage_________;
    private static final SubLString $str80$DELETE_FROM_raw_linkage__________;
    private static final SubLString $str81$DELETE_FROM_run_statistics_______;
    private static final SubLString $str82$DELETE_FROM_run____________WHERE_;
    private static final SubLString $str83$SELECT_count_sentence_id_________;
    private static final SubLString $str84$SELECT_link_cyclification_id_____;
    private static final SubLString $str85$____________GROUP_BY_link_cyclifi;
    private static final SubLString $str86$SELECT_COUNT_link_cyclification_i;
    private static final SubLString $str87$________AND_NOT_EXISTS___________;
    private static final SubLString $str88$SELECT_sentence_contents_________;
    private static final SubLString $str89$SELECT_sentence_contents_________;
    private static final SubLString $str90$SELECT_AVG_lexified_count________;
    private static final SubLString $str91$SELECT_lexified_count____________;
    private static final SubLString $str92$SELECT_sentence_contents__raw_lin;
    private static final SubLString $str93$____________AND_raw_linkage2_run_;
    private static final SubLString $str94$____________AND_raw_linkage1_sent;
    private static final SubLString $str95$_a____a____a____a____a___________;
    private static final SubLString $str96$lex_verb_count;
    private static final SubLString $str97$lex_noun_count;
    private static final SubLString $str98$lex_adj_count;
    private static final SubLString $str99$lex_adv_count;
    private static final SubLString $str100$mean_verb_lexes;
    private static final SubLString $str101$mean_noun_lexes;
    private static final SubLString $str102$mean_adj_lexes;
    private static final SubLString $str103$mean_adv_lexes;
    private static final SubLString $str104$med_verb_lexes;
    private static final SubLString $str105$med_noun_lexes;
    private static final SubLString $str106$med_adj_lexes;
    private static final SubLString $str107$med_adv_lexes;
    private static final SubLInteger $int108$1000;
    private static final SubLInteger $int109$1024;
    private static final SubLString $str110$SELECT_duration_____________FROM_;
    private static final SubLSymbol $sym111$_;
    private static final SubLSymbol $sym112$CAR;
    private static final SubLString $str113$SELECT_duration_____________FROM_;
    private static final SubLString $str114$SELECT_sentence_contents_________;
    private static final SubLString $str115$____________AND_sentence_id___sen;
    private static final SubLString $str116$SELECT_sentence_contents_________;
    private static final SubLString $str117$_a_t_a_T__;
    private static final SubLString $str118$_home_aldag_time_count_failed_100;
    private static final SubLSymbol $kw119$OUTPUT;
    private static final SubLString $str120$Unable_to_open__S;
    private static final SubLString $str121$_home_aldag_time_count_succeeded_;
    private static final SubLString $str122$_home_aldag_length_count_failed_1;
    private static final SubLString $str123$_home_aldag_length_count_succeede;
    private static final SubLString $str124$SELECT_id__name__comment_FROM_cor;
    private static final SubLSymbol $kw125$ID;
    private static final SubLSymbol $kw126$NAME;
    private static final SubLSymbol $kw127$COMMENT;
    private static final SubLString $str128$SELECT_COUNT_id__from_sentence_wh;
    private static final SubLString $str129$_;
    private static final SubLString $str130$SELECT_id__type__comment__kb__rev;
    private static final SubLSymbol $kw131$TYPE;
    private static final SubLSymbol $kw132$KB;
    private static final SubLSymbol $kw133$REVISION;
    private static final SubLSymbol $kw134$START;
    private static final SubLString $str135$_;
    private static final SubLSymbol $sym136$NULL;
    private static final SubLString $str137$INSERT_INTO_corpus_name__comment_;
    private static final SubLString $str138$__;
    private static final SubLString $str139$__;
    private static final SubLString $str140$INSERT_INTO_sentence_corpus_id__c;
    private static final SubLString $str141$SELECT_id_from_sentence_WHERE_cor;
    private static final SubLString $str142$_AND_contents_;
    private static final SubLSymbol $sym143$SQL_STATEMENT_P;
    private static final SubLSymbol $sym144$ABSTRACT_LEXICON_P;
    private static final SubLSymbol $sym145$PARSE_TREE_CONTEXT;
    private static final SubLString $str146$run_id_seq;
    private static final SubLString $str147$INSERT_INTO_run_VALUES_;
    private static final SubLString $str148$__;
    private static final SubLString $str149$____;
    private static final SubLString $str150$___;
    private static final SubLString $str151$___;
    private static final SubLString $str152$__;
    private static final SubLString $str153$raw_linkage_id_seq;
    private static final SubLString $str154$INSERT_INTO_raw_linkage_VALUES_;
    private static final SubLString $str155$_;
    private static final SubLSymbol $sym156$LENGTH;
    private static final SubLSymbol $sym157$XML;
    private static final SubLString $str158$word_linkage_id_seq;
    private static final SubLString $str159$INSERT_INTO_word_linkage_VALUES_;
    private static final SubLString $str160$full_linkage_id_seq;
    private static final SubLSymbol $sym161$LEXIFY;
    private static final SubLSymbol $sym162$LINK_WORD_P;
    private static final SubLString $str163$INSERT_INTO_full_linkage_VALUES_;
    private static final SubLSymbol $sym164$CYCLIFY;
    private static final SubLSymbol $kw165$LEXICON;
    private static final SubLString $str166$timed_out__;
    private static final SubLString $str167$link_cyclification_id_seq;
    private static final SubLString $str168$INSERT_INTO_link_cyclification_VA;
    private static final SubLString $str169$INSERT_INTO_cyclifications_VALUES;
    private static final SubLObject $const170$InferencePSC;
    private static final SubLString $str171$cyclifications_id_seq;
    private static final SubLString $str172$INSERT_INTO_justification_VALUES_;
    private static final SubLString $str173$INSERT_INTO_run_statistics_VALUES;
    private static final SubLString $str174$SELECT_raw_linkage_contents______;
    private static final SubLString $str175$________________ORDER_BY_raw_link;
    private static final SubLString $str176$SELECT_;
    private static final SubLString $str177$_________FROM_run_statistics_____;
    private static final SubLSymbol $sym178$WORDS;
    private static final SubLSymbol $sym179$GET_LEXES;
    private static final SubLString $str180$__;
    private static final SubLString $str181$SELECT_id_FROM_corpus_WHERE_name_;
    private static final SubLString $str182$Can_t_determine_id_for_unknown_co;
    private static final SubLString $str183$SELECT_nextval__;
    private static final SubLString $str184$_4__0D__2__0D__2__0D__2__0D__2__0;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1419L)
    public static SubLObject with_link_metrics_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list7);
        stmt = current.first();
        current = current.rest();
        if (nlp_db_metrics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym8$WITH_SQL_STATEMENT, reader.bq_cons(stmt, (SubLObject)nlp_db_metrics.$list9), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym11$SDBC_ERROR_P, stmt), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym12$SDBC_ERROR_THROW, stmt)), ConsesLow.append(body, (SubLObject)nlp_db_metrics.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nlp_db_metrics.$list7);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1816L)
    public static SubLObject with_link_metrics_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject query = (SubLObject)nlp_db_metrics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list13);
        rs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list13);
        query = current.first();
        current = current.rest();
        if (nlp_db_metrics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym14$WITH_SQL_RESULT_SET, (SubLObject)ConsesLow.listS(rs, query, (SubLObject)nlp_db_metrics.$list9), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym11$SDBC_ERROR_P, rs), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym12$SDBC_ERROR_THROW, rs)), ConsesLow.append(body, (SubLObject)nlp_db_metrics.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nlp_db_metrics.$list13);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 2227L)
    public static SubLObject do_link_metrics_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject query = (SubLObject)nlp_db_metrics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list13);
        rs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list13);
        query = current.first();
        current = current.rest();
        if (nlp_db_metrics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym15$WITH_LINK_METRICS_RESULT_SET, (SubLObject)ConsesLow.list(rs, query), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym10$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym16$SQL_RESULT_SET_P, rs), (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym17$WHILE, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym18$SQLRS_NEXT, rs), ConsesLow.append(body, (SubLObject)nlp_db_metrics.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nlp_db_metrics.$list13);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 2428L)
    public static SubLObject do_link_metrics_corpus(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
        SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
        SubLObject corpus = (SubLObject)nlp_db_metrics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list19);
        sentence_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list19);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list19);
        corpus = current.first();
        current = current.rest();
        if (nlp_db_metrics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym20$CLET, (SubLObject)ConsesLow.list(sentence_id, sentence), (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym21$DO_LINK_METRICS_RESULT_SET, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym22$RS, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym23$FORMAT_NIL, (SubLObject)nlp_db_metrics.$str24$SELECT_sentence_id__sentence_cont, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym25$POSTGRESQL_ESCAPE_STRING, corpus))), (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, sentence_id, (SubLObject)nlp_db_metrics.$list27), (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, sentence, (SubLObject)nlp_db_metrics.$list28), ConsesLow.append(body, (SubLObject)nlp_db_metrics.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nlp_db_metrics.$list19);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 2957L)
    public static SubLObject do_link_metrics_link_structures(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject linkage_id = (SubLObject)nlp_db_metrics.NIL;
        SubLObject ls = (SubLObject)nlp_db_metrics.NIL;
        SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
        SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
        SubLObject start = (SubLObject)nlp_db_metrics.NIL;
        SubLObject duration = (SubLObject)nlp_db_metrics.NIL;
        SubLObject run_id = (SubLObject)nlp_db_metrics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        linkage_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        ls = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        sentence_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        start = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        duration = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        run_id = current.first();
        current = current.rest();
        final SubLObject lexicon = (SubLObject)(current.isCons() ? current.first() : nlp_db_metrics.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)nlp_db_metrics.$list29);
        current = current.rest();
        if (nlp_db_metrics.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym20$CLET, (SubLObject)ConsesLow.list(linkage_id, ls, sentence_id, sentence, start, duration), (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym21$DO_LINK_METRICS_RESULT_SET, new SubLObject[] { ConsesLow.list((SubLObject)nlp_db_metrics.$sym22$RS, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym23$FORMAT_NIL, (SubLObject)nlp_db_metrics.$str30$SELECT_raw_linkage_id__raw_linkag, run_id)), ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, linkage_id, (SubLObject)nlp_db_metrics.$list27), ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, sentence_id, (SubLObject)nlp_db_metrics.$list31), ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, sentence, (SubLObject)nlp_db_metrics.$list32), ConsesLow.list((SubLObject)nlp_db_metrics.$sym26$CSETQ, ls, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym33$FIF, (SubLObject)nlp_db_metrics.$list34, (SubLObject)nlp_db_metrics.NIL, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym35$FIRST, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym36$NEW_LINK_STRUCTURES, (SubLObject)nlp_db_metrics.$list37, lexicon, sentence, (SubLObject)nlp_db_metrics.$list38)))), ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, start, (SubLObject)nlp_db_metrics.$list39), ConsesLow.listS((SubLObject)nlp_db_metrics.$sym26$CSETQ, duration, (SubLObject)nlp_db_metrics.$list40), ConsesLow.append(body, (SubLObject)nlp_db_metrics.NIL) }));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nlp_db_metrics.$list29);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 3945L)
    public static SubLObject update_lexicon_statistics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_linkage = (SubLObject)nlp_db_metrics.NIL;
        SubLObject lex_verb_count = (SubLObject)nlp_db_metrics.NIL;
        SubLObject lex_noun_count = (SubLObject)nlp_db_metrics.NIL;
        SubLObject lex_adj_count = (SubLObject)nlp_db_metrics.NIL;
        SubLObject lex_adv_count = (SubLObject)nlp_db_metrics.NIL;
        SubLObject verb_interps_counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject noun_interps_counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject adj_interps_counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject adv_interps_counts = (SubLObject)nlp_db_metrics.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        v_linkage = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        lex_verb_count = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        lex_noun_count = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        lex_adj_count = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        lex_adv_count = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        verb_interps_counts = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        noun_interps_counts = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        adj_interps_counts = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nlp_db_metrics.$list41);
        adv_interps_counts = current.first();
        current = current.rest();
        if (nlp_db_metrics.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym42$PROGN, (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$sym10$PWHEN, v_linkage, ConsesLow.list((SubLObject)nlp_db_metrics.$sym43$CINC, lex_verb_count, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list45)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym43$CINC, lex_noun_count, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list46)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym43$CINC, lex_adj_count, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list47)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym43$CINC, lex_adv_count, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list48)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym49$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym50$COUNT, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym51$LINKAGE_INTERPS_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list45)), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym52$CPUSH, (SubLObject)nlp_db_metrics.$sym50$COUNT, verb_interps_counts)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym49$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym50$COUNT, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym51$LINKAGE_INTERPS_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list46)), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym52$CPUSH, (SubLObject)nlp_db_metrics.$sym50$COUNT, noun_interps_counts)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym49$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym50$COUNT, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym51$LINKAGE_INTERPS_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list47)), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym52$CPUSH, (SubLObject)nlp_db_metrics.$sym50$COUNT, adj_interps_counts)), ConsesLow.list((SubLObject)nlp_db_metrics.$sym49$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym50$COUNT, (SubLObject)ConsesLow.listS((SubLObject)nlp_db_metrics.$sym51$LINKAGE_INTERPS_COUNT, v_linkage, (SubLObject)nlp_db_metrics.$list48)), (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$sym52$CPUSH, (SubLObject)nlp_db_metrics.$sym50$COUNT, adv_interps_counts)) }));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nlp_db_metrics.$list41);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 4952L)
    public static SubLObject db_raw_linkage_run(final SubLObject corpus, SubLObject comment) {
        if (comment == nlp_db_metrics.UNPROVIDED) {
            comment = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != Types.stringp(corpus) : corpus;
        if (nlp_db_metrics.NIL != comment && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        SubLObject i = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, (SubLObject)nlp_db_metrics.ONE_INTEGER, corpus, comment);
            SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
            SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection_$1 = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection_$1 = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection_$1)) {
                    statement = sdbc.sqlc_create_statement(connection_$1);
                }
                else {
                    statement = connection_$1;
                }
                if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), nlp_db_metrics.$str60$___________________________AND_se }), (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                else {
                    rs = statement;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                    while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER);
                        i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        SubLObject error = (SubLObject)nlp_db_metrics.NIL;
                        PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), sentence_id, sentence });
                        streams_high.finish_output((SubLObject)nlp_db_metrics.UNPROVIDED);
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    insert_raw_linkage(stmt, sentence, run_id, sentence_id, (SubLObject)nlp_db_metrics.NIL);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (nlp_db_metrics.NIL != error) {
                            Errors.warn(error);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection_$1)) {
                        sdbc.sqlc_close(connection_$1);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 5718L)
    public static SubLObject db_word_linkage_run(final SubLObject corpus, SubLObject comment) {
        if (comment == nlp_db_metrics.UNPROVIDED) {
            comment = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != Types.stringp(corpus) : corpus;
        if (nlp_db_metrics.NIL != comment && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        SubLObject i = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        final SubLObject lexicon = object.new_class_instance((SubLObject)nlp_db_metrics.$sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, (SubLObject)nlp_db_metrics.TWO_INTEGER, corpus, comment);
            SubLObject raw_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject raw_linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject terror = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
            SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection_$2 = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection_$2 = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection_$2)) {
                    statement = sdbc.sqlc_create_statement(connection_$2);
                }
                else {
                    statement = connection_$2;
                }
                if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), nlp_db_metrics.$str60$___________________________AND_se }), (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                else {
                    rs = statement;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                    while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER);
                        i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        terror = (SubLObject)nlp_db_metrics.NIL;
                        PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), sentence_id, sentence });
                        streams_high.finish_output((SubLObject)nlp_db_metrics.UNPROVIDED);
                        if (nlp_db_metrics.NIL != sentence) {
                            final SubLObject connection_$3 = sdbc.sqls_get_connection(stmt);
                            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$3);
                            SubLObject commit_error = (SubLObject)nlp_db_metrics.NIL;
                            SubLObject rollback_result = (SubLObject)nlp_db_metrics.NIL;
                            SubLObject auto_commit_result = (SubLObject)nlp_db_metrics.NIL;
                            SubLObject errors = (SubLObject)nlp_db_metrics.NIL;
                            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit)) {
                                errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                            }
                            else {
                                sdbc.sqlc_set_error_handling(connection_$3, (SubLObject)nlp_db_metrics.$kw64$THROW);
                                try {
                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (nlp_db_metrics.NIL != auto_commit) {
                                                sdbc.sqlc_set_auto_commit(connection_$3, (SubLObject)nlp_db_metrics.NIL);
                                            }
                                            thread.resetMultipleValues();
                                            final SubLObject raw_linkage_$4 = insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                            final SubLObject raw_linkage_id_$5 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            raw_linkage = raw_linkage_$4;
                                            raw_linkage_id = raw_linkage_id_$5;
                                            insert_word_linkage(stmt, sentence, raw_linkage, raw_linkage_id);
                                            sdbc.sqlc_commit(connection_$3);
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                sdbc.sqlc_set_error_handling(connection_$3, (SubLObject)nlp_db_metrics.$kw65$RETURN);
                                if (nlp_db_metrics.NIL != commit_error) {
                                    errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                    rollback_result = sdbc.sqls_handle_rollback(connection_$3);
                                    if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                        errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                    }
                                }
                                if (nlp_db_metrics.NIL != auto_commit) {
                                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$3, (SubLObject)nlp_db_metrics.T);
                                }
                                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                    errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                                }
                            }
                            if (nlp_db_metrics.NIL != errors) {
                                terror = sdbc.sqls_handle_transaction_errors(errors);
                            }
                            if (nlp_db_metrics.NIL == terror) {
                                continue;
                            }
                            sdbc.sdbc_error_warn(terror);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection_$2)) {
                        sdbc.sqlc_close(connection_$2);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 6795L)
    public static SubLObject db_full_linkage_run(final SubLObject corpus, SubLObject comment) {
        if (comment == nlp_db_metrics.UNPROVIDED) {
            comment = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != Types.stringp(corpus) : corpus;
        if (nlp_db_metrics.NIL != comment && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        SubLObject i = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        final SubLObject lexicon = object.new_class_instance((SubLObject)nlp_db_metrics.$sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, (SubLObject)nlp_db_metrics.THREE_INTEGER, corpus, comment);
            SubLObject raw_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject raw_linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject terror = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
            SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection_$6 = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection_$6 = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection_$6)) {
                    statement = sdbc.sqlc_create_statement(connection_$6);
                }
                else {
                    statement = connection_$6;
                }
                if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), nlp_db_metrics.$str60$___________________________AND_se }), (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                else {
                    rs = statement;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                    while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER);
                        i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        terror = (SubLObject)nlp_db_metrics.NIL;
                        PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), sentence_id, sentence });
                        streams_high.finish_output((SubLObject)nlp_db_metrics.UNPROVIDED);
                        final SubLObject connection_$7 = sdbc.sqls_get_connection(stmt);
                        final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$7);
                        SubLObject commit_error = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject rollback_result = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject auto_commit_result = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject errors = (SubLObject)nlp_db_metrics.NIL;
                        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                        }
                        else {
                            sdbc.sqlc_set_error_handling(connection_$7, (SubLObject)nlp_db_metrics.$kw64$THROW);
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (nlp_db_metrics.NIL != auto_commit) {
                                            sdbc.sqlc_set_auto_commit(connection_$7, (SubLObject)nlp_db_metrics.NIL);
                                        }
                                        thread.resetMultipleValues();
                                        final SubLObject raw_linkage_$8 = insert_raw_linkage(stmt, sentence, run_id, sentence_id, lexicon);
                                        final SubLObject raw_linkage_id_$9 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        raw_linkage = raw_linkage_$8;
                                        raw_linkage_id = raw_linkage_id_$9;
                                        insert_full_linkage(stmt, raw_linkage, raw_linkage_id, lexicon);
                                        sdbc.sqlc_commit(connection_$7);
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$7, (SubLObject)nlp_db_metrics.$kw65$RETURN);
                            if (nlp_db_metrics.NIL != commit_error) {
                                errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_$7);
                                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                }
                            }
                            if (nlp_db_metrics.NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$7, (SubLObject)nlp_db_metrics.T);
                            }
                            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                            }
                        }
                        if (nlp_db_metrics.NIL != errors) {
                            terror = sdbc.sqls_handle_transaction_errors(errors);
                        }
                        if (nlp_db_metrics.NIL != terror) {
                            sdbc.sdbc_error_warn(terror);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection_$6)) {
                        sdbc.sqlc_close(connection_$6);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 7810L)
    public static SubLObject db_link_cyclification_run(final SubLObject corpus, SubLObject comment) {
        if (comment == nlp_db_metrics.UNPROVIDED) {
            comment = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != Types.stringp(corpus) : corpus;
        if (nlp_db_metrics.NIL != comment && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        SubLObject i = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        final SubLObject lexicon = object.new_class_instance((SubLObject)nlp_db_metrics.$sym63$CYCLIFIER_LEXICON_W_O_FABRICATION);
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, (SubLObject)nlp_db_metrics.FOUR_INTEGER, corpus, comment);
            SubLObject raw_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject raw_linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject v_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject lex_verb_count = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
            SubLObject lex_noun_count = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
            SubLObject lex_adj_count = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
            SubLObject lex_adv_count = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
            SubLObject verb_interps_counts = (SubLObject)nlp_db_metrics.NIL;
            SubLObject noun_interps_counts = (SubLObject)nlp_db_metrics.NIL;
            SubLObject adj_interps_counts = (SubLObject)nlp_db_metrics.NIL;
            SubLObject adv_interps_counts = (SubLObject)nlp_db_metrics.NIL;
            SubLObject terror = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
            SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection_$10 = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection_$10 = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection_$10)) {
                    statement = sdbc.sqlc_create_statement(connection_$10);
                }
                else {
                    statement = connection_$10;
                }
                if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), nlp_db_metrics.$str60$___________________________AND_se }), (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                else {
                    rs = statement;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                    while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER);
                        i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        terror = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject error = (SubLObject)nlp_db_metrics.NIL;
                        PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), sentence_id, sentence });
                        streams_high.finish_output((SubLObject)nlp_db_metrics.UNPROVIDED);
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    final SubLObject connection_$11 = sdbc.sqls_get_connection(stmt);
                                    final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$11);
                                    SubLObject commit_error = (SubLObject)nlp_db_metrics.NIL;
                                    SubLObject rollback_result = (SubLObject)nlp_db_metrics.NIL;
                                    SubLObject auto_commit_result = (SubLObject)nlp_db_metrics.NIL;
                                    SubLObject errors = (SubLObject)nlp_db_metrics.NIL;
                                    if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit)) {
                                        errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                                    }
                                    else {
                                        sdbc.sqlc_set_error_handling(connection_$11, (SubLObject)nlp_db_metrics.$kw64$THROW);
                                        try {
                                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$12 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if (nlp_db_metrics.NIL != auto_commit) {
                                                        sdbc.sqlc_set_auto_commit(connection_$11, (SubLObject)nlp_db_metrics.NIL);
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
                                                }
                                                catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var) {
                                            commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        sdbc.sqlc_set_error_handling(connection_$11, (SubLObject)nlp_db_metrics.$kw65$RETURN);
                                        if (nlp_db_metrics.NIL != commit_error) {
                                            errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                            rollback_result = sdbc.sqls_handle_rollback(connection_$11);
                                            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                            }
                                        }
                                        if (nlp_db_metrics.NIL != auto_commit) {
                                            auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$11, (SubLObject)nlp_db_metrics.T);
                                        }
                                        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                            errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                                        }
                                    }
                                    if (nlp_db_metrics.NIL != errors) {
                                        terror = sdbc.sqls_handle_transaction_errors(errors);
                                    }
                                    if (nlp_db_metrics.NIL != terror) {
                                        sdbc.sdbc_error_warn(terror);
                                    }
                                    if (nlp_db_metrics.NIL != v_linkage) {
                                        lex_verb_count = Numbers.add(lex_verb_count, linkage_lexified_count(v_linkage, (SubLObject)nlp_db_metrics.$sym66$VERB_LINK_WORD_P));
                                        lex_noun_count = Numbers.add(lex_noun_count, linkage_lexified_count(v_linkage, (SubLObject)nlp_db_metrics.$sym67$NOUN_LINK_WORD_P));
                                        lex_adj_count = Numbers.add(lex_adj_count, linkage_lexified_count(v_linkage, (SubLObject)nlp_db_metrics.$sym68$ADJECTIVE_LINK_WORD_P));
                                        lex_adv_count = Numbers.add(lex_adv_count, linkage_lexified_count(v_linkage, (SubLObject)nlp_db_metrics.$sym69$ADVERB_LINK_WORD_P));
                                        SubLObject cdolist_list_var = linkage_interps_count(v_linkage, (SubLObject)nlp_db_metrics.$sym66$VERB_LINK_WORD_P);
                                        SubLObject count = (SubLObject)nlp_db_metrics.NIL;
                                        count = cdolist_list_var.first();
                                        while (nlp_db_metrics.NIL != cdolist_list_var) {
                                            verb_interps_counts = (SubLObject)ConsesLow.cons(count, verb_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        }
                                        cdolist_list_var = linkage_interps_count(v_linkage, (SubLObject)nlp_db_metrics.$sym67$NOUN_LINK_WORD_P);
                                        count = (SubLObject)nlp_db_metrics.NIL;
                                        count = cdolist_list_var.first();
                                        while (nlp_db_metrics.NIL != cdolist_list_var) {
                                            noun_interps_counts = (SubLObject)ConsesLow.cons(count, noun_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        }
                                        cdolist_list_var = linkage_interps_count(v_linkage, (SubLObject)nlp_db_metrics.$sym68$ADJECTIVE_LINK_WORD_P);
                                        count = (SubLObject)nlp_db_metrics.NIL;
                                        count = cdolist_list_var.first();
                                        while (nlp_db_metrics.NIL != cdolist_list_var) {
                                            adj_interps_counts = (SubLObject)ConsesLow.cons(count, adj_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        }
                                        cdolist_list_var = linkage_interps_count(v_linkage, (SubLObject)nlp_db_metrics.$sym69$ADVERB_LINK_WORD_P);
                                        count = (SubLObject)nlp_db_metrics.NIL;
                                        count = cdolist_list_var.first();
                                        while (nlp_db_metrics.NIL != cdolist_list_var) {
                                            adv_interps_counts = (SubLObject)ConsesLow.cons(count, adv_interps_counts);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            count = cdolist_list_var.first();
                                        }
                                    }
                                }
                                catch (Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, (SubLObject)nlp_db_metrics.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var2) {
                            error = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (nlp_db_metrics.NIL != error) {
                            Errors.warn(error);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection_$10)) {
                        sdbc.sqlc_close(connection_$10);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            insert_run_statistics(stmt, run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, verb_interps_counts, noun_interps_counts, adj_interps_counts, adv_interps_counts);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 9796L)
    public static SubLObject db_ebmt_cyclification_run(final SubLObject corpus, SubLObject comment) {
        if (comment == nlp_db_metrics.UNPROVIDED) {
            comment = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != Types.stringp(corpus) : corpus;
        if (nlp_db_metrics.NIL != comment && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        SubLObject i = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        final SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon((SubLObject)nlp_db_metrics.UNPROVIDED);
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, (SubLObject)nlp_db_metrics.FIVE_INTEGER, corpus, comment);
            SubLObject raw_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject raw_linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject v_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject terror = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
            SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection_$17 = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection_$17 = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection_$17)) {
                    statement = sdbc.sqlc_create_statement(connection_$17);
                }
                else {
                    statement = connection_$17;
                }
                if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), nlp_db_metrics.$str60$___________________________AND_se }), (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                else {
                    rs = statement;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                    while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                        sentence_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER);
                        i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        terror = (SubLObject)nlp_db_metrics.NIL;
                        PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), sentence_id, sentence });
                        streams_high.finish_output((SubLObject)nlp_db_metrics.UNPROVIDED);
                        final SubLObject connection_$18 = sdbc.sqls_get_connection(stmt);
                        final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$18);
                        SubLObject commit_error = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject rollback_result = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject auto_commit_result = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject errors = (SubLObject)nlp_db_metrics.NIL;
                        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                        }
                        else {
                            sdbc.sqlc_set_error_handling(connection_$18, (SubLObject)nlp_db_metrics.$kw64$THROW);
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (nlp_db_metrics.NIL != auto_commit) {
                                            sdbc.sqlc_set_auto_commit(connection_$18, (SubLObject)nlp_db_metrics.NIL);
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
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$18, (SubLObject)nlp_db_metrics.$kw65$RETURN);
                            if (nlp_db_metrics.NIL != commit_error) {
                                errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_$18);
                                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                }
                            }
                            if (nlp_db_metrics.NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$18, (SubLObject)nlp_db_metrics.T);
                            }
                            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                            }
                        }
                        if (nlp_db_metrics.NIL != errors) {
                            terror = sdbc.sqls_handle_transaction_errors(errors);
                        }
                        if (nlp_db_metrics.NIL != terror) {
                            sdbc.sdbc_error_warn(terror);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection_$17)) {
                        sdbc.sqlc_close(connection_$17);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 11003L)
    public static SubLObject db_cached_ebmt_cyclification_run(final SubLObject old_run_id, SubLObject comment) {
        if (comment == nlp_db_metrics.UNPROVIDED) {
            comment = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(old_run_id) : old_run_id;
        if (nlp_db_metrics.NIL != comment && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        SubLObject i = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        final SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon((SubLObject)nlp_db_metrics.UNPROVIDED);
        final SubLObject corpus = db_get_run_corpus(old_run_id);
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject run_id = insert_run(stmt, (SubLObject)nlp_db_metrics.FIVE_INTEGER, corpus, comment);
            SubLObject raw_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject raw_linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject v_linkage = (SubLObject)nlp_db_metrics.NIL;
            SubLObject terror = (SubLObject)nlp_db_metrics.NIL;
            SubLObject linkage_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject ls = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence_id = (SubLObject)nlp_db_metrics.NIL;
            SubLObject sentence = (SubLObject)nlp_db_metrics.NIL;
            SubLObject start = (SubLObject)nlp_db_metrics.NIL;
            SubLObject duration = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
            SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection_$23 = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection_$23 = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection_$23)) {
                    statement = sdbc.sqlc_create_statement(connection_$23);
                }
                else {
                    statement = connection_$23;
                }
                if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                    rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str71$SELECT_raw_linkage_id__raw_linkag, new SubLObject[] { format_nil.format_nil_a_no_copy(old_run_id), nlp_db_metrics.$str72$__________________________AND_raw }), (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                else {
                    rs = statement;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                    sdbc.sdbc_error_throw(rs);
                }
                if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                    while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                        linkage_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        sentence_id = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.THREE_INTEGER);
                        sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.FOUR_INTEGER);
                        ls = (SubLObject)((nlp_db_metrics.NIL != sdbc.sql_null_p(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER))) ? nlp_db_metrics.NIL : linkage.new_link_structures(reader.read_from_string(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER), (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED), lexicon, sentence, (SubLObject)nlp_db_metrics.T).first());
                        start = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.FIVE_INTEGER);
                        duration = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.SIX_INTEGER);
                        i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                        terror = (SubLObject)nlp_db_metrics.NIL;
                        PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), linkage_id, ls });
                        streams_high.finish_output((SubLObject)nlp_db_metrics.UNPROVIDED);
                        final SubLObject connection_$24 = sdbc.sqls_get_connection(stmt);
                        final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$24);
                        SubLObject commit_error = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject rollback_result = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject auto_commit_result = (SubLObject)nlp_db_metrics.NIL;
                        SubLObject errors = (SubLObject)nlp_db_metrics.NIL;
                        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit)) {
                            errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                        }
                        else {
                            sdbc.sqlc_set_error_handling(connection_$24, (SubLObject)nlp_db_metrics.$kw64$THROW);
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (nlp_db_metrics.NIL != auto_commit) {
                                            sdbc.sqlc_set_auto_commit(connection_$24, (SubLObject)nlp_db_metrics.NIL);
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
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$24, (SubLObject)nlp_db_metrics.$kw65$RETURN);
                            if (nlp_db_metrics.NIL != commit_error) {
                                errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                rollback_result = sdbc.sqls_handle_rollback(connection_$24);
                                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                    errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                }
                            }
                            if (nlp_db_metrics.NIL != auto_commit) {
                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$24, (SubLObject)nlp_db_metrics.T);
                            }
                            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                            }
                        }
                        if (nlp_db_metrics.NIL != errors) {
                            terror = sdbc.sqls_handle_transaction_errors(errors);
                        }
                        if (nlp_db_metrics.NIL != terror) {
                            sdbc.sdbc_error_warn(terror);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection_$23)) {
                        sdbc.sqlc_close(connection_$23);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 12266L)
    public static SubLObject db_get_run_corpus(final SubLObject run_id) {
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str73$SELECT_corpus_name________FROM_ru, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str74$________AND_run_corpus_id___corpu }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 12582L)
    public static SubLObject link_metrics_delete_run(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject error = (SubLObject)nlp_db_metrics.NIL;
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            final SubLObject connection_$29 = sdbc.sqls_get_connection(stmt);
            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$29);
            SubLObject commit_error = (SubLObject)nlp_db_metrics.NIL;
            SubLObject rollback_result = (SubLObject)nlp_db_metrics.NIL;
            SubLObject auto_commit_result = (SubLObject)nlp_db_metrics.NIL;
            SubLObject errors = (SubLObject)nlp_db_metrics.NIL;
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit)) {
                errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
            }
            else {
                sdbc.sqlc_set_error_handling(connection_$29, (SubLObject)nlp_db_metrics.$kw64$THROW);
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)nlp_db_metrics.$sym62$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (nlp_db_metrics.NIL != auto_commit) {
                                sdbc.sqlc_set_auto_commit(connection_$29, (SubLObject)nlp_db_metrics.NIL);
                            }
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str75$DELETE_FROM_justification________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str76$DELETE_FROM_cyclifications_______, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str77$DELETE_FROM_link_cyclification___, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str78$DELETE_FROM_full_linkage_________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str79$DELETE_FROM_word_linkage_________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str80$DELETE_FROM_raw_linkage__________, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str81$DELETE_FROM_run_statistics_______, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str82$DELETE_FROM_run____________WHERE_, format_nil.format_nil_a_no_copy(run_id)));
                            sdbc.sqlc_commit(connection_$29);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)nlp_db_metrics.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                sdbc.sqlc_set_error_handling(connection_$29, (SubLObject)nlp_db_metrics.$kw65$RETURN);
                if (nlp_db_metrics.NIL != commit_error) {
                    errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                    rollback_result = sdbc.sqls_handle_rollback(connection_$29);
                    if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rollback_result)) {
                        errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                    }
                }
                if (nlp_db_metrics.NIL != auto_commit) {
                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$29, (SubLObject)nlp_db_metrics.T);
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                    errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                }
            }
            if (nlp_db_metrics.NIL != errors) {
                error = sdbc.sqls_handle_transaction_errors(errors);
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(error)) {
                sdbc.sdbc_error_warn(error);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 14789L)
    public static SubLObject link_metrics_sentence_count(final SubLObject run_id) {
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str83$SELECT_count_sentence_id_________, format_nil.format_nil_a_no_copy(run_id)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 15124L)
    public static SubLObject link_metrics_avg_interpretation_count(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str84$SELECT_link_cyclification_id_____, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str85$____________GROUP_BY_link_cyclifi }), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    counts = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER), counts);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = link_metrics_no_interpretation_count(run_id), i = (SubLObject)nlp_db_metrics.NIL, i = (SubLObject)nlp_db_metrics.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER)) {
            counts = (SubLObject)ConsesLow.cons((SubLObject)nlp_db_metrics.ZERO_INTEGER, counts);
        }
        return (SubLObject)((nlp_db_metrics.NIL != counts) ? number_utilities.mean(counts) : nlp_db_metrics.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 16002L)
    public static SubLObject link_metrics_median_interpretation_count(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str84$SELECT_link_cyclification_id_____, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str85$____________GROUP_BY_link_cyclifi }), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    counts = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER), counts);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = link_metrics_no_interpretation_count(run_id), i = (SubLObject)nlp_db_metrics.NIL, i = (SubLObject)nlp_db_metrics.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)nlp_db_metrics.ONE_INTEGER)) {
            counts = (SubLObject)ConsesLow.cons((SubLObject)nlp_db_metrics.ZERO_INTEGER, counts);
        }
        return (SubLObject)((nlp_db_metrics.NIL != counts) ? number_utilities.median(counts, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED) : nlp_db_metrics.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 16885L)
    public static SubLObject link_metrics_no_interpretation_count(final SubLObject run_id) {
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str86$SELECT_COUNT_link_cyclification_i, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str87$________AND_NOT_EXISTS___________ }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 17535L)
    public static SubLObject link_metrics_failed_link_parse_sentences(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject sentences = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str88$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy(run_id)), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    sentences = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), sentences);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 18051L)
    public static SubLObject link_metrics_succeeded_link_parse_sentences(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject sentences = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str89$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy(run_id)), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    sentences = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), sentences);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 18574L)
    public static SubLObject link_metrics_avg_lexified_word_count(final SubLObject run_id) {
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str90$SELECT_AVG_lexified_count________, format_nil.format_nil_a_no_copy(run_id)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 19013L)
    public static SubLObject link_metrics_median_lexified_word_count(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str91$SELECT_lexified_count____________, format_nil.format_nil_a_no_copy(run_id)), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    if (nlp_db_metrics.NIL == sdbc.sql_null_p(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER))) {
                        counts = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), counts);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return number_utilities.median(counts, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 19583L)
    public static SubLObject link_metrics_raw_linkage_diffs(final SubLObject run_id1, final SubLObject run_id2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id1) : run_id1;
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id2) : run_id2;
        SubLObject count = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str92$SELECT_sentence_contents__raw_lin, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id1), nlp_db_metrics.$str93$____________AND_raw_linkage2_run_, format_nil.format_nil_a_no_copy(run_id2), nlp_db_metrics.$str94$____________AND_raw_linkage1_sent }), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                PrintLow.format((SubLObject)nlp_db_metrics.T, (SubLObject)nlp_db_metrics.$str95$_a____a____a____a____a___________, new SubLObject[] { sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), run_id1, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER), run_id2, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.THREE_INTEGER) });
                count = Numbers.add(count, (SubLObject)nlp_db_metrics.ONE_INTEGER);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 20678L)
    public static SubLObject link_metrics_lexified_verb_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str96$lex_verb_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 20865L)
    public static SubLObject link_metrics_lexified_noun_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str97$lex_noun_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21052L)
    public static SubLObject link_metrics_lexified_adj_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str98$lex_adj_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21242L)
    public static SubLObject link_metrics_lexified_adv_count(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str99$lex_adv_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21429L)
    public static SubLObject link_metrics_mean_verb_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str100$mean_verb_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21625L)
    public static SubLObject link_metrics_mean_noun_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str101$mean_noun_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21820L)
    public static SubLObject link_metrics_mean_adj_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str102$mean_adj_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22018L)
    public static SubLObject link_metrics_mean_adv_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str103$mean_adv_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22213L)
    public static SubLObject link_metrics_median_verb_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str104$med_verb_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22409L)
    public static SubLObject link_metrics_median_noun_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str105$med_noun_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22604L)
    public static SubLObject link_metrics_median_adj_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str106$med_adj_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22802L)
    public static SubLObject link_metrics_median_adv_interps(final SubLObject run_id) {
        return link_metrics_run_value(run_id, (SubLObject)nlp_db_metrics.$str107$med_adv_lexes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22997L)
    public static SubLObject time_count_failed_table(final SubLObject run_id, SubLObject n) {
        if (n == nlp_db_metrics.UNPROVIDED) {
            n = (SubLObject)nlp_db_metrics.$int108$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        final SubLObject times = Hashtables.make_hash_table((SubLObject)nlp_db_metrics.$int109$1024, (SubLObject)nlp_db_metrics.EQL, (SubLObject)nlp_db_metrics.UNPROVIDED);
        SubLObject table = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str110$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy(run_id)), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject time = Numbers.truncate(Numbers.divide(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), n), (SubLObject)nlp_db_metrics.UNPROVIDED);
                    Hashtables.sethash(time, times, number_utilities.f_1X(Hashtables.gethash(time, times, (SubLObject)nlp_db_metrics.ZERO_INTEGER)));
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject time = (SubLObject)nlp_db_metrics.NIL;
        SubLObject count = (SubLObject)nlp_db_metrics.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(times);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                time = Hashtables.getEntryKey(cdohash_entry);
                count = Hashtables.getEntryValue(cdohash_entry);
                table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Numbers.multiply(time, n), count), table);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, (SubLObject)nlp_db_metrics.$sym111$_, (SubLObject)nlp_db_metrics.$sym112$CAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 23774L)
    public static SubLObject time_count_succeeded_table(final SubLObject run_id, SubLObject n) {
        if (n == nlp_db_metrics.UNPROVIDED) {
            n = (SubLObject)nlp_db_metrics.$int108$1000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        final SubLObject times = Hashtables.make_hash_table((SubLObject)nlp_db_metrics.$int109$1024, (SubLObject)nlp_db_metrics.EQL, (SubLObject)nlp_db_metrics.UNPROVIDED);
        SubLObject table = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str113$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy(run_id)), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject time = Numbers.truncate(Numbers.divide(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), n), (SubLObject)nlp_db_metrics.UNPROVIDED);
                    Hashtables.sethash(time, times, number_utilities.f_1X(Hashtables.gethash(time, times, (SubLObject)nlp_db_metrics.ZERO_INTEGER)));
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject time = (SubLObject)nlp_db_metrics.NIL;
        SubLObject count = (SubLObject)nlp_db_metrics.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(times);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                time = Hashtables.getEntryKey(cdohash_entry);
                count = Hashtables.getEntryValue(cdohash_entry);
                table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Numbers.multiply(time, n), count), table);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, (SubLObject)nlp_db_metrics.$sym111$_, (SubLObject)nlp_db_metrics.$sym112$CAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 24515L)
    public static SubLObject length_count_failed_table(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        final SubLObject lengths = Hashtables.make_hash_table((SubLObject)nlp_db_metrics.$int109$1024, (SubLObject)nlp_db_metrics.EQL, (SubLObject)nlp_db_metrics.UNPROVIDED);
        SubLObject table = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str114$SELECT_sentence_contents_________, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str115$____________AND_sentence_id___sen }), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                    final SubLObject length = document.sentence_length(document.new_sentence(sentence, (SubLObject)nlp_db_metrics.UNPROVIDED));
                    Hashtables.sethash(length, lengths, number_utilities.f_1X(Hashtables.gethash(length, lengths, (SubLObject)nlp_db_metrics.ZERO_INTEGER)));
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject length2 = (SubLObject)nlp_db_metrics.NIL;
        SubLObject count = (SubLObject)nlp_db_metrics.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(lengths);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                length2 = Hashtables.getEntryKey(cdohash_entry);
                count = Hashtables.getEntryValue(cdohash_entry);
                table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(length2, count), table);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, (SubLObject)nlp_db_metrics.$sym111$_, (SubLObject)nlp_db_metrics.$sym112$CAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 25358L)
    public static SubLObject length_count_succeeded_table(final SubLObject run_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        final SubLObject lengths = Hashtables.make_hash_table((SubLObject)nlp_db_metrics.$int109$1024, (SubLObject)nlp_db_metrics.EQL, (SubLObject)nlp_db_metrics.UNPROVIDED);
        SubLObject table = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str116$SELECT_sentence_contents_________, new SubLObject[] { format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str115$____________AND_sentence_id___sen }), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sql_result_set_p(rs)) {
                while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                    final SubLObject sentence = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
                    final SubLObject length = document.sentence_length(document.new_sentence(sentence, (SubLObject)nlp_db_metrics.UNPROVIDED));
                    Hashtables.sethash(length, lengths, number_utilities.f_1X(Hashtables.gethash(length, lengths, (SubLObject)nlp_db_metrics.ZERO_INTEGER)));
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject length2 = (SubLObject)nlp_db_metrics.NIL;
        SubLObject count = (SubLObject)nlp_db_metrics.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(lengths);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                length2 = Hashtables.getEntryKey(cdohash_entry);
                count = Hashtables.getEntryValue(cdohash_entry);
                table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(length2, count), table);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(table, (SubLObject)nlp_db_metrics.$sym111$_, (SubLObject)nlp_db_metrics.$sym112$CAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 26209L)
    public static SubLObject print_table(final SubLObject table, SubLObject out) {
        if (out == nlp_db_metrics.UNPROVIDED) {
            out = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = table;
        SubLObject entry = (SubLObject)nlp_db_metrics.NIL;
        entry = cdolist_list_var.first();
        while (nlp_db_metrics.NIL != cdolist_list_var) {
            PrintLow.format(out, (SubLObject)nlp_db_metrics.$str117$_a_t_a_T__, entry.first(), conses_high.second(entry));
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 26378L)
    public static SubLObject generate_tables(final SubLObject run_id, SubLObject n) {
        if (n == nlp_db_metrics.UNPROVIDED) {
            n = (SubLObject)nlp_db_metrics.$int108$1000;
        }
        assert nlp_db_metrics.NIL != subl_promotions.positive_integer_p(run_id) : run_id;
        SubLObject stream = (SubLObject)nlp_db_metrics.NIL;
        try {
            stream = compatibility.open_text((SubLObject)nlp_db_metrics.$str118$_home_aldag_time_count_failed_100, (SubLObject)nlp_db_metrics.$kw119$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)nlp_db_metrics.$str120$Unable_to_open__S, (SubLObject)nlp_db_metrics.$str118$_home_aldag_time_count_failed_100);
            }
            final SubLObject out = stream;
            print_table(time_count_failed_table(run_id, n), out);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)nlp_db_metrics.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        stream = (SubLObject)nlp_db_metrics.NIL;
        try {
            stream = compatibility.open_text((SubLObject)nlp_db_metrics.$str121$_home_aldag_time_count_succeeded_, (SubLObject)nlp_db_metrics.$kw119$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)nlp_db_metrics.$str120$Unable_to_open__S, (SubLObject)nlp_db_metrics.$str121$_home_aldag_time_count_succeeded_);
            }
            final SubLObject out = stream;
            print_table(time_count_succeeded_table(run_id, n), out);
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)nlp_db_metrics.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        stream = (SubLObject)nlp_db_metrics.NIL;
        try {
            stream = compatibility.open_text((SubLObject)nlp_db_metrics.$str122$_home_aldag_length_count_failed_1, (SubLObject)nlp_db_metrics.$kw119$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)nlp_db_metrics.$str120$Unable_to_open__S, (SubLObject)nlp_db_metrics.$str122$_home_aldag_length_count_failed_1);
            }
            final SubLObject out = stream;
            print_table(length_count_failed_table(run_id), out);
        }
        finally {
            final SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)nlp_db_metrics.T);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
            }
        }
        stream = (SubLObject)nlp_db_metrics.NIL;
        try {
            stream = compatibility.open_text((SubLObject)nlp_db_metrics.$str123$_home_aldag_length_count_succeede, (SubLObject)nlp_db_metrics.$kw119$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)nlp_db_metrics.$str120$Unable_to_open__S, (SubLObject)nlp_db_metrics.$str123$_home_aldag_length_count_succeede);
            }
            final SubLObject out = stream;
            print_table(length_count_succeeded_table(run_id), out);
        }
        finally {
            final SubLObject _prev_bind_4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)nlp_db_metrics.T);
                final SubLObject _values4 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)nlp_db_metrics.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_4);
            }
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 27029L)
    public static SubLObject nlp_db_metrics_corpora() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.copy_seq((SubLObject)nlp_db_metrics.$str124$SELECT_id__name__comment_FROM_cor), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$kw125$ID, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), (SubLObject)nlp_db_metrics.$kw126$NAME, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER), (SubLObject)nlp_db_metrics.$kw127$COMMENT, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.THREE_INTEGER)), result);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 27496L)
    public static SubLObject nlp_db_metrics_corpus_size(final SubLObject corpus_id) {
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str128$SELECT_COUNT_id__from_sentence_wh, new SubLObject[] { format_nil.format_nil_a_no_copy(corpus_id), nlp_db_metrics.$str129$_ }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 27738L)
    public static SubLObject nlp_db_metrics_runs(final SubLObject corpus_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str130$SELECT_id__type__comment__kb__rev, format_nil.format_nil_a_no_copy(corpus_id)), (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            while (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw125$ID, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), nlp_db_metrics.$kw131$TYPE, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.TWO_INTEGER), nlp_db_metrics.$kw127$COMMENT, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.THREE_INTEGER), nlp_db_metrics.$kw132$KB, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.FOUR_INTEGER), nlp_db_metrics.$kw133$REVISION, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.FIVE_INTEGER), nlp_db_metrics.$kw134$START, sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.SIX_INTEGER) }), result);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 28362L)
    public static SubLObject nlp_db_metrics_add_corpus(SubLObject name, SubLObject comment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        comment = (SubLObject)((nlp_db_metrics.NIL != comment) ? string_utilities.quote_string(postgresql_escape_string(comment), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
        name = (SubLObject)((nlp_db_metrics.NIL != comment) ? string_utilities.quote_string(postgresql_escape_string(name), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
        SubLObject result = (SubLObject)nlp_db_metrics.NIL;
        SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                stmt = sdbc.sqlc_create_statement(connection);
            }
            else {
                stmt = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                sdbc.sdbc_error_throw(stmt);
            }
            result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str137$INSERT_INTO_corpus_name__comment_, new SubLObject[] { format_nil.format_nil_a_no_copy(name), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(comment), nlp_db_metrics.$str139$__ }));
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 28982L)
    public static SubLObject add_sentence_to_corpus(final SubLObject corpus_id, SubLObject sentence_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nlp_db_metrics.NIL == nlp_db_metrics_sentence_in_corpusP(corpus_id, sentence_string)) {
            sentence_string = string_utilities.quote_string(postgresql_escape_string(sentence_string), (SubLObject)nlp_db_metrics.$str135$_);
            SubLObject result = (SubLObject)nlp_db_metrics.NIL;
            SubLObject stmt = (SubLObject)nlp_db_metrics.NIL;
            SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
            try {
                connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
                if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                    stmt = sdbc.sqlc_create_statement(connection);
                }
                else {
                    stmt = connection;
                }
                if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(stmt)) {
                    sdbc.sdbc_error_throw(stmt);
                }
                result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str140$INSERT_INTO_sentence_corpus_id__c, new SubLObject[] { format_nil.format_nil_a_no_copy(corpus_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(sentence_string), nlp_db_metrics.$str139$__ }));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                        sdbc.sqlc_close(connection);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 29564L)
    public static SubLObject nlp_db_metrics_sentence_in_corpusP(final SubLObject corpus_id, SubLObject sentence_string) {
        sentence_string = string_utilities.quote_string(postgresql_escape_string(sentence_string), (SubLObject)nlp_db_metrics.$str135$_);
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str141$SELECT_id_from_sentence_WHERE_cor, new SubLObject[] { format_nil.format_nil_a_no_copy(corpus_id), nlp_db_metrics.$str142$_AND_contents_, format_nil.format_nil_a_no_copy(sentence_string), nlp_db_metrics.$str129$_ }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 29932L)
    public static SubLObject avg_sentence_length_failed(final SubLObject run_id) {
        SubLObject lengths = (SubLObject)nlp_db_metrics.NIL;
        SubLObject cdolist_list_var = link_metrics_failed_link_parse_sentences(run_id);
        SubLObject s = (SubLObject)nlp_db_metrics.NIL;
        s = cdolist_list_var.first();
        while (nlp_db_metrics.NIL != cdolist_list_var) {
            lengths = (SubLObject)ConsesLow.cons(Sequences.length(string_utilities.split_string(s, (SubLObject)nlp_db_metrics.UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        }
        return number_utilities.mean(lengths);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30160L)
    public static SubLObject median_sentence_length_failed(final SubLObject run_id) {
        SubLObject lengths = (SubLObject)nlp_db_metrics.NIL;
        SubLObject cdolist_list_var = link_metrics_failed_link_parse_sentences(run_id);
        SubLObject s = (SubLObject)nlp_db_metrics.NIL;
        s = cdolist_list_var.first();
        while (nlp_db_metrics.NIL != cdolist_list_var) {
            lengths = (SubLObject)ConsesLow.cons(Sequences.length(string_utilities.split_string(s, (SubLObject)nlp_db_metrics.UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        }
        return number_utilities.median(lengths, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30387L)
    public static SubLObject avg_sentence_length_succeeded(final SubLObject run_id) {
        SubLObject lengths = (SubLObject)nlp_db_metrics.NIL;
        SubLObject cdolist_list_var = link_metrics_succeeded_link_parse_sentences(run_id);
        SubLObject s = (SubLObject)nlp_db_metrics.NIL;
        s = cdolist_list_var.first();
        while (nlp_db_metrics.NIL != cdolist_list_var) {
            lengths = (SubLObject)ConsesLow.cons(Sequences.length(string_utilities.split_string(s, (SubLObject)nlp_db_metrics.UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        }
        return number_utilities.mean(lengths);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30615L)
    public static SubLObject median_sentence_length_succeeded(final SubLObject run_id) {
        SubLObject lengths = (SubLObject)nlp_db_metrics.NIL;
        SubLObject cdolist_list_var = link_metrics_succeeded_link_parse_sentences(run_id);
        SubLObject s = (SubLObject)nlp_db_metrics.NIL;
        s = cdolist_list_var.first();
        while (nlp_db_metrics.NIL != cdolist_list_var) {
            lengths = (SubLObject)ConsesLow.cons(Sequences.length(string_utilities.split_string(s, (SubLObject)nlp_db_metrics.UNPROVIDED)), lengths);
            cdolist_list_var = cdolist_list_var.rest();
            s = cdolist_list_var.first();
        }
        return number_utilities.median(lengths, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30848L)
    public static SubLObject db_get_word_linkage(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon) {
        if (lexicon == nlp_db_metrics.UNPROVIDED) {
            lexicon = (SubLObject)nlp_db_metrics.NIL;
        }
        assert nlp_db_metrics.NIL != Types.stringp(sentence) : sentence;
        assert nlp_db_metrics.NIL != sdbc.sql_statement_p(stmt) : stmt;
        if (nlp_db_metrics.NIL != lexicon && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == abstract_lexicon.abstract_lexicon_p(lexicon)) {
            throw new AssertionError(lexicon);
        }
        final SubLObject ls = db_get_link_structure(sentence, stmt, lexicon);
        SubLObject tagged_sent = (SubLObject)nlp_db_metrics.NIL;
        if (nlp_db_metrics.NIL != ls) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(ls));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
            return word_linkage.new_word_linkage_from_link_structure(ls, tagged_sent, sentence, lexicon);
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 31592L)
    public static SubLObject db_get_linkage(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon) {
        if (lexicon == nlp_db_metrics.UNPROVIDED) {
            lexicon = (SubLObject)nlp_db_metrics.NIL;
        }
        assert nlp_db_metrics.NIL != Types.stringp(sentence) : sentence;
        assert nlp_db_metrics.NIL != sdbc.sql_statement_p(stmt) : stmt;
        if (nlp_db_metrics.NIL != lexicon && !nlp_db_metrics.assertionsDisabledInClass && nlp_db_metrics.NIL == abstract_lexicon.abstract_lexicon_p(lexicon)) {
            throw new AssertionError(lexicon);
        }
        final SubLObject ls = db_get_link_structure(sentence, stmt, lexicon);
        SubLObject tagged_sent = (SubLObject)nlp_db_metrics.NIL;
        if (nlp_db_metrics.NIL != ls) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(ls));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
            return linkage.new_linkage_from_link_structure(ls, tagged_sent, object.new_class_instance((SubLObject)nlp_db_metrics.$sym145$PARSE_TREE_CONTEXT));
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 32350L)
    public static SubLObject insert_run(final SubLObject stmt, final SubLObject type, final SubLObject corpus, SubLObject comment) {
        comment = (SubLObject)((nlp_db_metrics.NIL != comment) ? string_utilities.quote_string(postgresql_escape_string(comment), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
        final SubLObject corpus_id = get_corpus_id(stmt, corpus);
        final SubLObject timestamp = iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED);
        final SubLObject id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str146$run_id_seq);
        final SubLObject kb = control_vars.kb_loaded();
        final SubLObject revision = system_info.cyc_revision_string();
        final SubLObject result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str147$INSERT_INTO_run_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(type), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(comment), nlp_db_metrics.$str148$__, format_nil.format_nil_a_no_copy(kb), nlp_db_metrics.$str149$____, format_nil.format_nil_a_no_copy(revision), nlp_db_metrics.$str150$___, format_nil.format_nil_a_no_copy(corpus_id), nlp_db_metrics.$str151$___, format_nil.format_nil_a_no_copy(timestamp), nlp_db_metrics.$str152$__ }));
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 33154L)
    public static SubLObject insert_raw_linkage(final SubLObject stmt, final SubLObject sentence, final SubLObject run_id, final SubLObject sentence_id, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start = (SubLObject)nlp_db_metrics.NIL;
        SubLObject duration = (SubLObject)nlp_db_metrics.NIL;
        SubLObject ls = (SubLObject)nlp_db_metrics.NIL;
        SubLObject contents = (SubLObject)nlp_db_metrics.NIL;
        SubLObject id = (SubLObject)nlp_db_metrics.NIL;
        SubLObject result = (SubLObject)nlp_db_metrics.NIL;
        start = iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED);
        final SubLObject time_var = Time.get_internal_real_time();
        ls = linkage.link_parse(sentence, linkage.$link_parse_options$.getDynamicValue(thread), lexicon, (SubLObject)nlp_db_metrics.UNPROVIDED).first();
        duration = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        duration = Numbers.truncate(Numbers.multiply(duration, (SubLObject)nlp_db_metrics.$int108$1000), (SubLObject)nlp_db_metrics.UNPROVIDED);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)nlp_db_metrics.NIL, thread);
            contents = (SubLObject)((nlp_db_metrics.NIL != ls) ? string_utilities.quote_string(postgresql_escape_string(print_high.prin1_to_string((SubLObject)ConsesLow.list(linkage.ls_words(ls), linkage.ls_links(ls), linkage.ls_diagram(ls), linkage.ls_tree(ls)))), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
            id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str153$raw_linkage_id_seq);
            result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(sentence_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(contents), nlp_db_metrics.$str151$___, format_nil.format_nil_a_no_copy(start), nlp_db_metrics.$str150$___, format_nil.format_nil_a_no_copy(duration), nlp_db_metrics.$str155$_ }));
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return Values.values(ls, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 33998L)
    public static SubLObject insert_cached_raw_linkage(final SubLObject stmt, final SubLObject run_id, final SubLObject sentence_id, final SubLObject ls, final SubLObject start, final SubLObject duration) {
        final SubLObject contents = (SubLObject)((nlp_db_metrics.NIL != ls) ? string_utilities.quote_string(postgresql_escape_string(print_high.prin1_to_string((SubLObject)ConsesLow.list(linkage.ls_words(ls), linkage.ls_links(ls), linkage.ls_diagram(ls), linkage.ls_tree(ls)))), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
        final SubLObject id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str153$raw_linkage_id_seq);
        final SubLObject result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(run_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(sentence_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(contents), nlp_db_metrics.$str151$___, format_nil.format_nil_a_no_copy(start), nlp_db_metrics.$str150$___, format_nil.format_nil_a_no_copy(duration), nlp_db_metrics.$str155$_ }));
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return Values.values(ls, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 34600L)
    public static SubLObject insert_word_linkage(final SubLObject stmt, final SubLObject sentence, final SubLObject raw_linkage, final SubLObject raw_linkage_id) {
        SubLObject tagged_sent = (SubLObject)nlp_db_metrics.NIL;
        if (nlp_db_metrics.NIL != raw_linkage) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(raw_linkage));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
        }
        final SubLObject v_word_linkage = (SubLObject)((nlp_db_metrics.NIL != raw_linkage) ? word_linkage.new_word_linkage_from_link_structure(raw_linkage, tagged_sent, sentence, (SubLObject)nlp_db_metrics.T) : nlp_db_metrics.NIL);
        final SubLObject word_count = (SubLObject)((nlp_db_metrics.NIL != v_word_linkage) ? methods.funcall_instance_method_with_0_args(v_word_linkage, (SubLObject)nlp_db_metrics.$sym156$LENGTH) : nlp_db_metrics.$sym136$NULL);
        final SubLObject xml = (SubLObject)((nlp_db_metrics.NIL != v_word_linkage) ? string_utilities.quote_string(postgresql_escape_string(methods.funcall_instance_method_with_0_args(v_word_linkage, (SubLObject)nlp_db_metrics.$sym157$XML)), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
        final SubLObject id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str158$word_linkage_id_seq);
        final SubLObject result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str159$INSERT_INTO_word_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(xml), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(raw_linkage_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(word_count), nlp_db_metrics.$str155$_ }));
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 35506L)
    public static SubLObject insert_full_linkage(final SubLObject stmt, final SubLObject raw_linkage, final SubLObject raw_linkage_id, final SubLObject lexicon) {
        SubLObject tagged_sent = (SubLObject)nlp_db_metrics.NIL;
        if (nlp_db_metrics.NIL != raw_linkage) {
            tagged_sent = linkage.words_to_sentence(linkage.ls_words(raw_linkage));
            pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
            linkage.auxify_sentence(tagged_sent);
        }
        final SubLObject v_linkage = (SubLObject)((nlp_db_metrics.NIL != raw_linkage) ? linkage.new_linkage_from_link_structure(raw_linkage, tagged_sent, object.new_class_instance((SubLObject)nlp_db_metrics.$sym145$PARSE_TREE_CONTEXT)) : nlp_db_metrics.NIL);
        final SubLObject word_count = (SubLObject)((nlp_db_metrics.NIL != v_linkage) ? methods.funcall_instance_method_with_0_args(v_linkage, (SubLObject)nlp_db_metrics.$sym156$LENGTH) : nlp_db_metrics.$sym136$NULL);
        final SubLObject xml = (SubLObject)((nlp_db_metrics.NIL != v_linkage) ? string_utilities.quote_string(postgresql_escape_string(methods.funcall_instance_method_with_0_args(v_linkage, (SubLObject)nlp_db_metrics.$sym157$XML)), (SubLObject)nlp_db_metrics.$str135$_) : nlp_db_metrics.$sym136$NULL);
        final SubLObject id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str160$full_linkage_id_seq);
        SubLObject lexified_count = (SubLObject)nlp_db_metrics.NIL;
        SubLObject result = (SubLObject)nlp_db_metrics.NIL;
        if (nlp_db_metrics.NIL != v_linkage) {
            methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)nlp_db_metrics.$sym161$LEXIFY, lexicon);
            lexified_count = linkage_lexified_count(v_linkage, (SubLObject)nlp_db_metrics.$sym162$LINK_WORD_P);
        }
        if (nlp_db_metrics.NIL == lexified_count) {
            lexified_count = (SubLObject)nlp_db_metrics.$sym136$NULL;
        }
        result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str163$INSERT_INTO_full_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(xml), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(raw_linkage_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(word_count), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(lexified_count), nlp_db_metrics.$str155$_ }));
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        return Values.values(v_linkage, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 36668L)
    public static SubLObject insert_link_cyclification(final SubLObject stmt, final SubLObject v_linkage, final SubLObject linkage_id, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = (SubLObject)nlp_db_metrics.NIL;
        SubLObject timed_outP = (SubLObject)nlp_db_metrics.NIL;
        SubLObject start = (SubLObject)nlp_db_metrics.$sym136$NULL;
        SubLObject duration = (SubLObject)nlp_db_metrics.$sym136$NULL;
        if (nlp_db_metrics.NIL != v_linkage) {
            start = string_utilities.quote_string(iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), (SubLObject)nlp_db_metrics.$str135$_);
            final SubLObject time_var = Time.get_internal_real_time();
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                try {
                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)nlp_db_metrics.T, thread);
                    SubLObject timer = (SubLObject)nlp_db_metrics.NIL;
                    try {
                        final SubLObject _prev_bind_0_$30 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)nlp_db_metrics.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = subl_macro_promotions.with_timeout_start_timer(nlp_db_metrics.$link_metrics_cyclification_timeout$.getDynamicValue(thread), tag);
                            cycls = methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)nlp_db_metrics.$sym164$CYCLIFY, (SubLObject)ConsesLow.list((SubLObject)nlp_db_metrics.$kw165$LEXICON, lexicon));
                        }
                        finally {
                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            subl_macro_promotions.with_timeout_stop_timer(timer);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                }
                finally {
                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            }
            finally {
                thread.throwStack.pop();
            }
            duration = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            duration = Numbers.truncate(Numbers.multiply(duration, (SubLObject)nlp_db_metrics.$int108$1000), (SubLObject)nlp_db_metrics.UNPROVIDED);
            if (nlp_db_metrics.NIL != timed_outP) {
                Errors.warn((SubLObject)nlp_db_metrics.$str166$timed_out__);
            }
        }
        final SubLObject id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str167$link_cyclification_id_seq);
        SubLObject result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str168$INSERT_INTO_link_cyclification_VA, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(linkage_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(start), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(duration), nlp_db_metrics.$str155$_ }));
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        SubLObject cdolist_list_var = cycls;
        SubLObject cycl = (SubLObject)nlp_db_metrics.NIL;
        cycl = cdolist_list_var.first();
        while (nlp_db_metrics.NIL != cdolist_list_var) {
            final SubLObject xml = postgresql_escape_string(cycl_to_xml(cycl));
            result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str169$INSERT_INTO_cyclifications_VALUES, new SubLObject[] { format_nil.format_nil_a_no_copy(id), nlp_db_metrics.$str151$___, format_nil.format_nil_a_no_copy(xml), nlp_db_metrics.$str152$__ }));
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        }
        return Values.values(cycls, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 37711L)
    public static SubLObject insert_ebmt_cyclification(final SubLObject stmt, final SubLObject v_linkage, final SubLObject linkage_id, final SubLObject lexicon, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = (SubLObject)nlp_db_metrics.NIL;
        SubLObject justifications = (SubLObject)nlp_db_metrics.NIL;
        SubLObject weights = (SubLObject)nlp_db_metrics.NIL;
        SubLObject start = (SubLObject)nlp_db_metrics.$sym136$NULL;
        SubLObject duration = (SubLObject)nlp_db_metrics.$sym136$NULL;
        if (nlp_db_metrics.NIL != v_linkage) {
            start = string_utilities.quote_string(iso_8601_timestamp((SubLObject)nlp_db_metrics.UNPROVIDED), (SubLObject)nlp_db_metrics.$str135$_);
            final SubLObject time_var = Time.get_internal_real_time();
            thread.resetMultipleValues();
            final SubLObject cycls_$32 = ebmt_template_parser.ebmt_parse_linkage(v_linkage, sentence, lexicon, nlp_db_metrics.$const170$InferencePSC);
            final SubLObject justifications_$33 = thread.secondMultipleValue();
            final SubLObject weights_$34 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            cycls = cycls_$32;
            justifications = justifications_$33;
            weights = weights_$34;
            duration = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            duration = Numbers.truncate(Numbers.multiply(duration, (SubLObject)nlp_db_metrics.$int108$1000), (SubLObject)nlp_db_metrics.UNPROVIDED);
        }
        final SubLObject cyclf_id = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str167$link_cyclification_id_seq);
        SubLObject result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str168$INSERT_INTO_link_cyclification_VA, new SubLObject[] { format_nil.format_nil_a_no_copy(cyclf_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(linkage_id), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(start), nlp_db_metrics.$str138$__, format_nil.format_nil_a_no_copy(duration), nlp_db_metrics.$str155$_ }));
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
            sdbc.sdbc_error_throw(result);
        }
        SubLObject cycl = (SubLObject)nlp_db_metrics.NIL;
        SubLObject cycl_$35 = (SubLObject)nlp_db_metrics.NIL;
        SubLObject j = (SubLObject)nlp_db_metrics.NIL;
        SubLObject j_$36 = (SubLObject)nlp_db_metrics.NIL;
        cycl = cycls;
        cycl_$35 = cycl.first();
        j = justifications;
        j_$36 = j.first();
        while (nlp_db_metrics.NIL != j || nlp_db_metrics.NIL != cycl) {
            final SubLObject xml = postgresql_escape_string(cycl_to_xml(cycl_$35));
            final SubLObject justification = postgresql_escape_string(print_high.princ_to_string(j_$36));
            final SubLObject cid = get_postgresql_nextval(stmt, (SubLObject)nlp_db_metrics.$str171$cyclifications_id_seq);
            result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str169$INSERT_INTO_cyclifications_VALUES, new SubLObject[] { format_nil.format_nil_a_no_copy(cyclf_id), nlp_db_metrics.$str151$___, format_nil.format_nil_a_no_copy(xml), nlp_db_metrics.$str150$___, format_nil.format_nil_a_no_copy(cid), nlp_db_metrics.$str155$_ }));
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            result = sdbc.sqls_execute_update(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str172$INSERT_INTO_justification_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy(cid), nlp_db_metrics.$str151$___, format_nil.format_nil_a_no_copy(justification), nlp_db_metrics.$str152$__ }));
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            cycl = cycl.rest();
            cycl_$35 = cycl.first();
            j = j.rest();
            j_$36 = j.first();
        }
        return Values.values(cycls, cyclf_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 39146L)
    public static SubLObject insert_run_statistics(final SubLObject stmt, final SubLObject run_id, final SubLObject lex_verb_count, final SubLObject lex_noun_count, final SubLObject lex_adj_count, final SubLObject lex_adv_count, final SubLObject verb_interps_counts, final SubLObject noun_interps_counts, final SubLObject adj_interps_counts, final SubLObject adv_interps_counts) {
        if (nlp_db_metrics.NIL != lex_verb_count && nlp_db_metrics.NIL != lex_noun_count && nlp_db_metrics.NIL != lex_adj_count && nlp_db_metrics.NIL != lex_adv_count && nlp_db_metrics.NIL != verb_interps_counts && nlp_db_metrics.NIL != noun_interps_counts && nlp_db_metrics.NIL != adj_interps_counts && nlp_db_metrics.NIL != adv_interps_counts) {
            final SubLObject result = sdbc.sqls_execute_update(stmt, PrintLow.format((SubLObject)nlp_db_metrics.NIL, (SubLObject)nlp_db_metrics.$str173$INSERT_INTO_run_statistics_VALUES, new SubLObject[] { run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, number_utilities.mean(verb_interps_counts), number_utilities.median(verb_interps_counts, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED), number_utilities.mean(noun_interps_counts), number_utilities.median(noun_interps_counts, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED), number_utilities.mean(adj_interps_counts), number_utilities.median(adj_interps_counts, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED), number_utilities.mean(adv_interps_counts), number_utilities.median(adv_interps_counts, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED) }));
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(result)) {
                sdbc.sdbc_error_throw(result);
            }
            return run_id;
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 40125L)
    public static SubLObject db_get_link_structure(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon) {
        if (lexicon == nlp_db_metrics.UNPROVIDED) {
            lexicon = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLObject rs = sdbc.sqls_execute_query(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str174$SELECT_raw_linkage_contents______, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(sentence)), nlp_db_metrics.$str175$________________ORDER_BY_raw_link }), (SubLObject)nlp_db_metrics.UNPROVIDED);
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
            sdbc.sdbc_error_throw(rs);
        }
        if (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs) && nlp_db_metrics.NIL != sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER)) {
            return linkage.new_link_structures(reader.read_from_string(sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER), (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED, (SubLObject)nlp_db_metrics.UNPROVIDED), lexicon, sentence, (SubLObject)nlp_db_metrics.T).first();
        }
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41063L)
    public static SubLObject link_metrics_single_sql_value(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nlp_db_metrics.NIL != Types.stringp(query) : query;
        SubLObject result = (SubLObject)nlp_db_metrics.NIL;
        SubLObject rs = (SubLObject)nlp_db_metrics.NIL;
        SubLObject statement = (SubLObject)nlp_db_metrics.NIL;
        SubLObject connection = (SubLObject)nlp_db_metrics.NIL;
        try {
            connection = sdbc.new_sql_connection(nlp_db_metrics.$link_metric_db$.getDynamicValue(thread), nlp_db_metrics.$link_metric_user$.getDynamicValue(thread), nlp_db_metrics.$link_metric_password$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { nlp_db_metrics.$kw54$DBMS_SERVER, nlp_db_metrics.$link_metric_dbms_server$.getDynamicValue(thread), nlp_db_metrics.$kw55$PORT, sdbc.$sql_port$.getGlobalValue(), nlp_db_metrics.$kw56$SUBPROTOCOL, nlp_db_metrics.$link_metric_subprotocol$.getDynamicValue(thread), nlp_db_metrics.$kw57$PROXY_SERVER, nlp_db_metrics.$link_metric_proxy_server$.getDynamicValue(thread), nlp_db_metrics.$kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (nlp_db_metrics.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (nlp_db_metrics.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, query, (SubLObject)nlp_db_metrics.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
                sdbc.sdbc_error_throw(rs);
            }
            if (nlp_db_metrics.NIL != sdbc.sqlrs_next(rs)) {
                result = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nlp_db_metrics.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)((nlp_db_metrics.NIL != sdbc.sql_null_p(result)) ? nlp_db_metrics.NIL : result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41389L)
    public static SubLObject link_metrics_run_value(final SubLObject run_id, final SubLObject column) {
        return link_metrics_single_sql_value(Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str176$SELECT_, new SubLObject[] { format_nil.format_nil_a_no_copy(column), nlp_db_metrics.$str177$_________FROM_run_statistics_____, format_nil.format_nil_a_no_copy(run_id) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41594L)
    public static SubLObject linkage_lexified_count(final SubLObject v_linkage, final SubLObject type) {
        SubLObject count = (SubLObject)nlp_db_metrics.ZERO_INTEGER;
        SubLObject word = (SubLObject)nlp_db_metrics.NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, (SubLObject)nlp_db_metrics.$sym178$WORDS);
        final SubLObject backwardP_var = (SubLObject)nlp_db_metrics.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)nlp_db_metrics.NIL, v_iteration = (SubLObject)nlp_db_metrics.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)nlp_db_metrics.ONE_INTEGER)) {
            element_num = ((nlp_db_metrics.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)nlp_db_metrics.ONE_INTEGER) : v_iteration);
            w = (word = Vectors.aref(vector_var, element_num));
            if (nlp_db_metrics.NIL != Functions.funcall(type, word) && nlp_db_metrics.NIL != methods.funcall_instance_method_with_0_args(word, (SubLObject)nlp_db_metrics.$sym179$GET_LEXES)) {
                count = Numbers.add(count, (SubLObject)nlp_db_metrics.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41880L)
    public static SubLObject linkage_interps_count(final SubLObject v_linkage, final SubLObject type) {
        SubLObject counts = (SubLObject)nlp_db_metrics.NIL;
        SubLObject word = (SubLObject)nlp_db_metrics.NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, (SubLObject)nlp_db_metrics.$sym178$WORDS);
        final SubLObject backwardP_var = (SubLObject)nlp_db_metrics.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)nlp_db_metrics.NIL, v_iteration = (SubLObject)nlp_db_metrics.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)nlp_db_metrics.ONE_INTEGER)) {
            element_num = ((nlp_db_metrics.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)nlp_db_metrics.ONE_INTEGER) : v_iteration);
            w = (word = Vectors.aref(vector_var, element_num));
            if (nlp_db_metrics.NIL != Functions.funcall(type, word)) {
                counts = (SubLObject)ConsesLow.cons(Sequences.length(methods.funcall_instance_method_with_0_args(word, (SubLObject)nlp_db_metrics.$sym179$GET_LEXES)), counts);
            }
        }
        return counts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 42176L)
    public static SubLObject postgresql_escape_string(final SubLObject string) {
        return string_utilities.string_substitute((SubLObject)nlp_db_metrics.$str180$__, (SubLObject)nlp_db_metrics.$str135$_, string, (SubLObject)nlp_db_metrics.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 42354L)
    public static SubLObject get_corpus_id(final SubLObject stmt, final SubLObject corpus) {
        final SubLObject rs = sdbc.sqls_execute_query(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str181$SELECT_id_FROM_corpus_WHERE_name_, new SubLObject[] { format_nil.format_nil_a_no_copy(postgresql_escape_string(corpus)), nlp_db_metrics.$str135$_ }), (SubLObject)nlp_db_metrics.UNPROVIDED);
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
            sdbc.sdbc_error_throw(rs);
        }
        if (nlp_db_metrics.NIL == sdbc.sqlrs_next(rs)) {
            Errors.error((SubLObject)nlp_db_metrics.$str182$Can_t_determine_id_for_unknown_co, corpus);
        }
        return sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 42729L)
    public static SubLObject get_postgresql_nextval(final SubLObject stmt, final SubLObject sequence) {
        final SubLObject rs = sdbc.sqls_execute_query(stmt, Sequences.cconcatenate((SubLObject)nlp_db_metrics.$str183$SELECT_nextval__, new SubLObject[] { format_nil.format_nil_a_no_copy(sequence), nlp_db_metrics.$str152$__ }), (SubLObject)nlp_db_metrics.UNPROVIDED);
        SubLObject nextval = (SubLObject)nlp_db_metrics.NIL;
        if (nlp_db_metrics.NIL != sdbc.sdbc_error_p(rs)) {
            sdbc.sdbc_error_throw(rs);
        }
        sdbc.sqlrs_next(rs);
        nextval = sdbc.sqlrs_get_object(rs, (SubLObject)nlp_db_metrics.ONE_INTEGER);
        return nextval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 43090L)
    public static SubLObject iso_8601_timestamp(SubLObject universal_time) {
        if (universal_time == nlp_db_metrics.UNPROVIDED) {
            universal_time = (SubLObject)nlp_db_metrics.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nlp_db_metrics.NIL == universal_time) {
            universal_time = Time.get_universal_time();
        }
        thread.resetMultipleValues();
        final SubLObject second = Time.decode_universal_time(universal_time, (SubLObject)nlp_db_metrics.UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return PrintLow.format((SubLObject)nlp_db_metrics.NIL, (SubLObject)nlp_db_metrics.$str184$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[] { year, month, date, hour, minute, second });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 43515L)
    public static SubLObject cycl_to_xml(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject xml = (SubLObject)nlp_db_metrics.NIL;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind((SubLObject)nlp_db_metrics.NIL, thread);
            try {
                xml_vars.$xml_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                cycml.cycml_serialize_term(cycl);
                xml = streams_high.get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nlp_db_metrics.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)nlp_db_metrics.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return xml;
    }
    
    public static SubLObject declare_nlp_db_metrics_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nlp_db_metrics", "with_link_metrics_statement", "WITH-LINK-METRICS-STATEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nlp_db_metrics", "with_link_metrics_result_set", "WITH-LINK-METRICS-RESULT-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nlp_db_metrics", "do_link_metrics_result_set", "DO-LINK-METRICS-RESULT-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nlp_db_metrics", "do_link_metrics_corpus", "DO-LINK-METRICS-CORPUS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nlp_db_metrics", "do_link_metrics_link_structures", "DO-LINK-METRICS-LINK-STRUCTURES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nlp_db_metrics", "update_lexicon_statistics", "UPDATE-LEXICON-STATISTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_raw_linkage_run", "DB-RAW-LINKAGE-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_word_linkage_run", "DB-WORD-LINKAGE-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_full_linkage_run", "DB-FULL-LINKAGE-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_link_cyclification_run", "DB-LINK-CYCLIFICATION-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_ebmt_cyclification_run", "DB-EBMT-CYCLIFICATION-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_cached_ebmt_cyclification_run", "DB-CACHED-EBMT-CYCLIFICATION-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_get_run_corpus", "DB-GET-RUN-CORPUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_delete_run", "LINK-METRICS-DELETE-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_sentence_count", "LINK-METRICS-SENTENCE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_avg_interpretation_count", "LINK-METRICS-AVG-INTERPRETATION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_median_interpretation_count", "LINK-METRICS-MEDIAN-INTERPRETATION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_no_interpretation_count", "LINK-METRICS-NO-INTERPRETATION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_failed_link_parse_sentences", "LINK-METRICS-FAILED-LINK-PARSE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_succeeded_link_parse_sentences", "LINK-METRICS-SUCCEEDED-LINK-PARSE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_avg_lexified_word_count", "LINK-METRICS-AVG-LEXIFIED-WORD-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_median_lexified_word_count", "LINK-METRICS-MEDIAN-LEXIFIED-WORD-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_raw_linkage_diffs", "LINK-METRICS-RAW-LINKAGE-DIFFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_lexified_verb_count", "LINK-METRICS-LEXIFIED-VERB-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_lexified_noun_count", "LINK-METRICS-LEXIFIED-NOUN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_lexified_adj_count", "LINK-METRICS-LEXIFIED-ADJ-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_lexified_adv_count", "LINK-METRICS-LEXIFIED-ADV-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_mean_verb_interps", "LINK-METRICS-MEAN-VERB-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_mean_noun_interps", "LINK-METRICS-MEAN-NOUN-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_mean_adj_interps", "LINK-METRICS-MEAN-ADJ-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_mean_adv_interps", "LINK-METRICS-MEAN-ADV-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_median_verb_interps", "LINK-METRICS-MEDIAN-VERB-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_median_noun_interps", "LINK-METRICS-MEDIAN-NOUN-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_median_adj_interps", "LINK-METRICS-MEDIAN-ADJ-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_median_adv_interps", "LINK-METRICS-MEDIAN-ADV-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "time_count_failed_table", "TIME-COUNT-FAILED-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "time_count_succeeded_table", "TIME-COUNT-SUCCEEDED-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "length_count_failed_table", "LENGTH-COUNT-FAILED-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "length_count_succeeded_table", "LENGTH-COUNT-SUCCEEDED-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "print_table", "PRINT-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "generate_tables", "GENERATE-TABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "nlp_db_metrics_corpora", "NLP-DB-METRICS-CORPORA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "nlp_db_metrics_corpus_size", "NLP-DB-METRICS-CORPUS-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "nlp_db_metrics_runs", "NLP-DB-METRICS-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "nlp_db_metrics_add_corpus", "NLP-DB-METRICS-ADD-CORPUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "add_sentence_to_corpus", "ADD-SENTENCE-TO-CORPUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "nlp_db_metrics_sentence_in_corpusP", "NLP-DB-METRICS-SENTENCE-IN-CORPUS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "avg_sentence_length_failed", "AVG-SENTENCE-LENGTH-FAILED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "median_sentence_length_failed", "MEDIAN-SENTENCE-LENGTH-FAILED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "avg_sentence_length_succeeded", "AVG-SENTENCE-LENGTH-SUCCEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "median_sentence_length_succeeded", "MEDIAN-SENTENCE-LENGTH-SUCCEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_get_word_linkage", "DB-GET-WORD-LINKAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_get_linkage", "DB-GET-LINKAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_run", "INSERT-RUN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_raw_linkage", "INSERT-RAW-LINKAGE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_cached_raw_linkage", "INSERT-CACHED-RAW-LINKAGE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_word_linkage", "INSERT-WORD-LINKAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_full_linkage", "INSERT-FULL-LINKAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_link_cyclification", "INSERT-LINK-CYCLIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_ebmt_cyclification", "INSERT-EBMT-CYCLIFICATION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "insert_run_statistics", "INSERT-RUN-STATISTICS", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "db_get_link_structure", "DB-GET-LINK-STRUCTURE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_single_sql_value", "LINK-METRICS-SINGLE-SQL-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "link_metrics_run_value", "LINK-METRICS-RUN-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "linkage_lexified_count", "LINKAGE-LEXIFIED-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "linkage_interps_count", "LINKAGE-INTERPS-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "postgresql_escape_string", "POSTGRESQL-ESCAPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "get_corpus_id", "GET-CORPUS-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "get_postgresql_nextval", "GET-POSTGRESQL-NEXTVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "iso_8601_timestamp", "ISO-8601-TIMESTAMP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nlp_db_metrics", "cycl_to_xml", "CYCL-TO-XML", 1, 0, false);
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    public static SubLObject init_nlp_db_metrics_file() {
        nlp_db_metrics.$link_metric_db$ = SubLFiles.defparameter("*LINK-METRIC-DB*", (SubLObject)nlp_db_metrics.$str0$nlp_metrics);
        nlp_db_metrics.$link_metric_user$ = SubLFiles.defparameter("*LINK-METRIC-USER*", (SubLObject)nlp_db_metrics.$str1$postgres);
        nlp_db_metrics.$link_metric_dbms_server$ = SubLFiles.defparameter("*LINK-METRIC-DBMS-SERVER*", (SubLObject)nlp_db_metrics.$str2$cyc11_cyc_com);
        nlp_db_metrics.$link_metric_password$ = SubLFiles.defparameter("*LINK-METRIC-PASSWORD*", (SubLObject)nlp_db_metrics.$str3$);
        nlp_db_metrics.$link_metric_subprotocol$ = SubLFiles.defparameter("*LINK-METRIC-SUBPROTOCOL*", (SubLObject)nlp_db_metrics.$str4$postgresql);
        nlp_db_metrics.$link_metric_proxy_server$ = SubLFiles.defparameter("*LINK-METRIC-PROXY-SERVER*", (SubLObject)nlp_db_metrics.$str5$billie_cyc_com);
        nlp_db_metrics.$link_metrics_cyclification_timeout$ = SubLFiles.defparameter("*LINK-METRICS-CYCLIFICATION-TIMEOUT*", Numbers.multiply((SubLObject)nlp_db_metrics.FIVE_INTEGER, (SubLObject)nlp_db_metrics.$int6$60));
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    public static SubLObject setup_nlp_db_metrics_file() {
        return (SubLObject)nlp_db_metrics.NIL;
    }
    
    public void declareFunctions() {
        declare_nlp_db_metrics_file();
    }
    
    public void initializeVariables() {
        init_nlp_db_metrics_file();
    }
    
    public void runTopLevelForms() {
        setup_nlp_db_metrics_file();
    }
    
    static {
        me = (SubLFile)new nlp_db_metrics();
        nlp_db_metrics.$link_metric_db$ = null;
        nlp_db_metrics.$link_metric_user$ = null;
        nlp_db_metrics.$link_metric_dbms_server$ = null;
        nlp_db_metrics.$link_metric_password$ = null;
        nlp_db_metrics.$link_metric_subprotocol$ = null;
        nlp_db_metrics.$link_metric_proxy_server$ = null;
        nlp_db_metrics.$link_metrics_cyclification_timeout$ = null;
        $str0$nlp_metrics = SubLObjectFactory.makeString("nlp_metrics");
        $str1$postgres = SubLObjectFactory.makeString("postgres");
        $str2$cyc11_cyc_com = SubLObjectFactory.makeString("cyc11.cyc.com");
        $str3$ = SubLObjectFactory.makeString("");
        $str4$postgresql = SubLObjectFactory.makeString("postgresql");
        $str5$billie_cyc_com = SubLObjectFactory.makeString("billie.cyc.com");
        $int6$60 = SubLObjectFactory.makeInteger(60);
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STMT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$WITH_SQL_STATEMENT = SubLObjectFactory.makeSymbol("WITH-SQL-STATEMENT");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("*LINK-METRIC-DB*"), SubLObjectFactory.makeSymbol("*LINK-METRIC-USER*"), SubLObjectFactory.makeSymbol("*LINK-METRIC-PASSWORD*"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeSymbol("*LINK-METRIC-DBMS-SERVER*"), SubLObjectFactory.makeKeyword("SUBPROTOCOL"), SubLObjectFactory.makeSymbol("*LINK-METRIC-SUBPROTOCOL*"), SubLObjectFactory.makeKeyword("PROXY-SERVER"), SubLObjectFactory.makeSymbol("*LINK-METRIC-PROXY-SERVER*") });
        $sym10$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym11$SDBC_ERROR_P = SubLObjectFactory.makeSymbol("SDBC-ERROR-P");
        $sym12$SDBC_ERROR_THROW = SubLObjectFactory.makeSymbol("SDBC-ERROR-THROW");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym14$WITH_SQL_RESULT_SET = SubLObjectFactory.makeSymbol("WITH-SQL-RESULT-SET");
        $sym15$WITH_LINK_METRICS_RESULT_SET = SubLObjectFactory.makeSymbol("WITH-LINK-METRICS-RESULT-SET");
        $sym16$SQL_RESULT_SET_P = SubLObjectFactory.makeSymbol("SQL-RESULT-SET-P");
        $sym17$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym18$SQLRS_NEXT = SubLObjectFactory.makeSymbol("SQLRS-NEXT");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym20$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym21$DO_LINK_METRICS_RESULT_SET = SubLObjectFactory.makeSymbol("DO-LINK-METRICS-RESULT-SET");
        $sym22$RS = SubLObjectFactory.makeSymbol("RS");
        $sym23$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str24$SELECT_sentence_id__sentence_cont = SubLObjectFactory.makeString("SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = '~a'\n                         AND sentence.corpus_id = corpus.id");
        $sym25$POSTGRESQL_ESCAPE_STRING = SubLObjectFactory.makeSymbol("POSTGRESQL-ESCAPE-STRING");
        $sym26$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.ONE_INTEGER));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.TWO_INTEGER));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LINKAGE-ID"), SubLObjectFactory.makeSymbol("LS"), SubLObjectFactory.makeSymbol("SENTENCE-ID"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("START"), SubLObjectFactory.makeSymbol("DURATION"), SubLObjectFactory.makeSymbol("RUN-ID"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("LEXICON") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str30$SELECT_raw_linkage_id__raw_linkag = SubLObjectFactory.makeString("SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ~a\n                         AND raw_linkage.sentence_id = sentence.id");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.THREE_INTEGER));
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.FOUR_INTEGER));
        $sym33$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQL-NULL-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.TWO_INTEGER));
        $sym35$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym36$NEW_LINK_STRUCTURES = SubLObjectFactory.makeSymbol("NEW-LINK-STRUCTURES");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.TWO_INTEGER));
        $list38 = ConsesLow.list((SubLObject)nlp_db_metrics.T);
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.FIVE_INTEGER));
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQLRS-GET-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)nlp_db_metrics.SIX_INTEGER));
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LINKAGE"), SubLObjectFactory.makeSymbol("LEX-VERB-COUNT"), SubLObjectFactory.makeSymbol("LEX-NOUN-COUNT"), SubLObjectFactory.makeSymbol("LEX-ADJ-COUNT"), SubLObjectFactory.makeSymbol("LEX-ADV-COUNT"), SubLObjectFactory.makeSymbol("VERB-INTERPS-COUNTS"), SubLObjectFactory.makeSymbol("NOUN-INTERPS-COUNTS"), SubLObjectFactory.makeSymbol("ADJ-INTERPS-COUNTS"), SubLObjectFactory.makeSymbol("ADV-INTERPS-COUNTS") });
        $sym42$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym43$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym44$LINKAGE_LEXIFIED_COUNT = SubLObjectFactory.makeSymbol("LINKAGE-LEXIFIED-COUNT");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERB-LINK-WORD-P")));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOUN-LINK-WORD-P")));
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVE-LINK-WORD-P")));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERB-LINK-WORD-P")));
        $sym49$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym50$COUNT = SubLObjectFactory.makeSymbol("COUNT");
        $sym51$LINKAGE_INTERPS_COUNT = SubLObjectFactory.makeSymbol("LINKAGE-INTERPS-COUNT");
        $sym52$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym53$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw54$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw55$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw56$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $kw57$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $kw58$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $str59$SELECT_sentence_id__sentence_cont = SubLObjectFactory.makeString("SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = '");
        $str60$___________________________AND_se = SubLObjectFactory.makeString("'\n                         AND sentence.corpus_id = corpus.id");
        $str61$___a___a___a__ = SubLObjectFactory.makeString("~%~a, ~a: ~a~%");
        $sym62$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION");
        $kw64$THROW = SubLObjectFactory.makeKeyword("THROW");
        $kw65$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $sym66$VERB_LINK_WORD_P = SubLObjectFactory.makeSymbol("VERB-LINK-WORD-P");
        $sym67$NOUN_LINK_WORD_P = SubLObjectFactory.makeSymbol("NOUN-LINK-WORD-P");
        $sym68$ADJECTIVE_LINK_WORD_P = SubLObjectFactory.makeSymbol("ADJECTIVE-LINK-WORD-P");
        $sym69$ADVERB_LINK_WORD_P = SubLObjectFactory.makeSymbol("ADVERB-LINK-WORD-P");
        $sym70$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $str71$SELECT_raw_linkage_id__raw_linkag = SubLObjectFactory.makeString("SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ");
        $str72$__________________________AND_raw = SubLObjectFactory.makeString("\n                         AND raw_linkage.sentence_id = sentence.id");
        $str73$SELECT_corpus_name________FROM_ru = SubLObjectFactory.makeString("SELECT corpus.name\n       FROM run, corpus\n       WHERE run.id = ");
        $str74$________AND_run_corpus_id___corpu = SubLObjectFactory.makeString("\n       AND run.corpus_id = corpus.id");
        $str75$DELETE_FROM_justification________ = SubLObjectFactory.makeString("DELETE FROM justification\n           WHERE justification.cyclf_id = cyclifications.id\n           AND cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str76$DELETE_FROM_cyclifications_______ = SubLObjectFactory.makeString("DELETE FROM cyclifications\n           WHERE cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str77$DELETE_FROM_link_cyclification___ = SubLObjectFactory.makeString("DELETE FROM link_cyclification\n           WHERE link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str78$DELETE_FROM_full_linkage_________ = SubLObjectFactory.makeString("DELETE FROM full_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str79$DELETE_FROM_word_linkage_________ = SubLObjectFactory.makeString("DELETE FROM word_linkage\n           WHERE word_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str80$DELETE_FROM_raw_linkage__________ = SubLObjectFactory.makeString("DELETE FROM raw_linkage\n           WHERE raw_linkage.run_id = ");
        $str81$DELETE_FROM_run_statistics_______ = SubLObjectFactory.makeString("DELETE FROM run_statistics\n           WHERE run_id = ");
        $str82$DELETE_FROM_run____________WHERE_ = SubLObjectFactory.makeString("DELETE FROM run\n           WHERE run.id = ");
        $str83$SELECT_count_sentence_id_________ = SubLObjectFactory.makeString("SELECT count(sentence_id)\n       FROM raw_linkage\n       WHERE run_id = ");
        $str84$SELECT_link_cyclification_id_____ = SubLObjectFactory.makeString("SELECT link_cyclification.id, \n                  COUNT(xml) AS cycl_counts\n           FROM link_cyclification, cyclifications\n           WHERE link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str85$____________GROUP_BY_link_cyclifi = SubLObjectFactory.makeString("\n           GROUP BY link_cyclification.id");
        $str86$SELECT_COUNT_link_cyclification_i = SubLObjectFactory.makeString("SELECT COUNT(link_cyclification.id)\n       FROM link_cyclification\n       WHERE link_cyclification.linkage_id = full_linkage.id\n       AND full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = ");
        $str87$________AND_NOT_EXISTS___________ = SubLObjectFactory.makeString("\n       AND NOT EXISTS\n          (SELECT link_cyclf_id\n           FROM cyclifications\n           WHERE link_cyclification.id = cyclifications.link_cyclf_id)");
        $str88$SELECT_sentence_contents_________ = SubLObjectFactory.makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NULL\n           AND sentence_id = sentence.id\n           AND run_id = ");
        $str89$SELECT_sentence_contents_________ = SubLObjectFactory.makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NOT NULL\n           AND sentence_id = sentence.id\n           AND run_id = ");
        $str90$SELECT_AVG_lexified_count________ = SubLObjectFactory.makeString("SELECT AVG(lexified_count)\n       FROM full_linkage, raw_linkage\n       WHERE full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = ");
        $str91$SELECT_lexified_count____________ = SubLObjectFactory.makeString("SELECT lexified_count\n           FROM full_linkage, raw_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = ");
        $str92$SELECT_sentence_contents__raw_lin = SubLObjectFactory.makeString("SELECT sentence.contents, raw_linkage1.contents, raw_linkage2.contents\n           FROM sentence,\n                raw_linkage AS raw_linkage1,\n                raw_linkage AS raw_linkage2\n           WHERE raw_linkage1.run_id = ");
        $str93$____________AND_raw_linkage2_run_ = SubLObjectFactory.makeString("\n           AND raw_linkage2.run_id = ");
        $str94$____________AND_raw_linkage1_sent = SubLObjectFactory.makeString("\n           AND raw_linkage1.sentence_id = raw_linkage2.sentence_id\n           AND raw_linkage1.sentence_id = sentence.id\n           AND raw_linkage1.contents <> raw_linkage2.contents");
        $str95$_a____a____a____a____a___________ = SubLObjectFactory.makeString("~a~%=~a=~%~a~%=~a=~%~a~%=============================================~%");
        $str96$lex_verb_count = SubLObjectFactory.makeString("lex_verb_count");
        $str97$lex_noun_count = SubLObjectFactory.makeString("lex_noun_count");
        $str98$lex_adj_count = SubLObjectFactory.makeString("lex_adj_count");
        $str99$lex_adv_count = SubLObjectFactory.makeString("lex_adv_count");
        $str100$mean_verb_lexes = SubLObjectFactory.makeString("mean_verb_lexes");
        $str101$mean_noun_lexes = SubLObjectFactory.makeString("mean_noun_lexes");
        $str102$mean_adj_lexes = SubLObjectFactory.makeString("mean_adj_lexes");
        $str103$mean_adv_lexes = SubLObjectFactory.makeString("mean_adv_lexes");
        $str104$med_verb_lexes = SubLObjectFactory.makeString("med_verb_lexes");
        $str105$med_noun_lexes = SubLObjectFactory.makeString("med_noun_lexes");
        $str106$med_adj_lexes = SubLObjectFactory.makeString("med_adj_lexes");
        $str107$med_adv_lexes = SubLObjectFactory.makeString("med_adv_lexes");
        $int108$1000 = SubLObjectFactory.makeInteger(1000);
        $int109$1024 = SubLObjectFactory.makeInteger(1024);
        $str110$SELECT_duration_____________FROM_ = SubLObjectFactory.makeString("SELECT duration \n           FROM raw_linkage\n           WHERE contents is NULL\n           AND run_id = ");
        $sym111$_ = SubLObjectFactory.makeSymbol("<");
        $sym112$CAR = SubLObjectFactory.makeSymbol("CAR");
        $str113$SELECT_duration_____________FROM_ = SubLObjectFactory.makeString("SELECT duration \n           FROM raw_linkage\n           WHERE contents is NOT NULL\n           AND run_id = ");
        $str114$SELECT_sentence_contents_________ = SubLObjectFactory.makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NULL\n           AND run_id = ");
        $str115$____________AND_sentence_id___sen = SubLObjectFactory.makeString("\n           AND sentence.id = sentence_id");
        $str116$SELECT_sentence_contents_________ = SubLObjectFactory.makeString("SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NOT NULL\n           AND run_id = ");
        $str117$_a_t_a_T__ = SubLObjectFactory.makeString("~a~t~a~T~%");
        $str118$_home_aldag_time_count_failed_100 = SubLObjectFactory.makeString("/home/aldag/time-count-failed-100.txt");
        $kw119$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str120$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str121$_home_aldag_time_count_succeeded_ = SubLObjectFactory.makeString("/home/aldag/time-count-succeeded-100.txt");
        $str122$_home_aldag_length_count_failed_1 = SubLObjectFactory.makeString("/home/aldag/length-count-failed-100.txt");
        $str123$_home_aldag_length_count_succeede = SubLObjectFactory.makeString("/home/aldag/length-count-succeeded-100.txt");
        $str124$SELECT_id__name__comment_FROM_cor = SubLObjectFactory.makeString("SELECT id, name, comment FROM corpus");
        $kw125$ID = SubLObjectFactory.makeKeyword("ID");
        $kw126$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw127$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $str128$SELECT_COUNT_id__from_sentence_wh = SubLObjectFactory.makeString("SELECT COUNT(id) from sentence where corpus_id=");
        $str129$_ = SubLObjectFactory.makeString(";");
        $str130$SELECT_id__type__comment__kb__rev = SubLObjectFactory.makeString("SELECT id, type, comment, kb, revision, start FROM run where corpus_id = ");
        $kw131$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw132$KB = SubLObjectFactory.makeKeyword("KB");
        $kw133$REVISION = SubLObjectFactory.makeKeyword("REVISION");
        $kw134$START = SubLObjectFactory.makeKeyword("START");
        $str135$_ = SubLObjectFactory.makeString("'");
        $sym136$NULL = SubLObjectFactory.makeSymbol("NULL");
        $str137$INSERT_INTO_corpus_name__comment_ = SubLObjectFactory.makeString("INSERT INTO corpus(name, comment) VALUES(");
        $str138$__ = SubLObjectFactory.makeString(", ");
        $str139$__ = SubLObjectFactory.makeString(");");
        $str140$INSERT_INTO_sentence_corpus_id__c = SubLObjectFactory.makeString("INSERT INTO sentence(corpus_id, contents) VALUES(");
        $str141$SELECT_id_from_sentence_WHERE_cor = SubLObjectFactory.makeString("SELECT id from sentence WHERE corpus_id=");
        $str142$_AND_contents_ = SubLObjectFactory.makeString(" AND contents=");
        $sym143$SQL_STATEMENT_P = SubLObjectFactory.makeSymbol("SQL-STATEMENT-P");
        $sym144$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
        $sym145$PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT");
        $str146$run_id_seq = SubLObjectFactory.makeString("run_id_seq");
        $str147$INSERT_INTO_run_VALUES_ = SubLObjectFactory.makeString("INSERT INTO run VALUES(");
        $str148$__ = SubLObjectFactory.makeString(",'");
        $str149$____ = SubLObjectFactory.makeString("', '");
        $str150$___ = SubLObjectFactory.makeString("', ");
        $str151$___ = SubLObjectFactory.makeString(", '");
        $str152$__ = SubLObjectFactory.makeString("')");
        $str153$raw_linkage_id_seq = SubLObjectFactory.makeString("raw_linkage_id_seq");
        $str154$INSERT_INTO_raw_linkage_VALUES_ = SubLObjectFactory.makeString("INSERT INTO raw_linkage VALUES(");
        $str155$_ = SubLObjectFactory.makeString(")");
        $sym156$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym157$XML = SubLObjectFactory.makeSymbol("XML");
        $str158$word_linkage_id_seq = SubLObjectFactory.makeString("word_linkage_id_seq");
        $str159$INSERT_INTO_word_linkage_VALUES_ = SubLObjectFactory.makeString("INSERT INTO word_linkage VALUES(");
        $str160$full_linkage_id_seq = SubLObjectFactory.makeString("full_linkage_id_seq");
        $sym161$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym162$LINK_WORD_P = SubLObjectFactory.makeSymbol("LINK-WORD-P");
        $str163$INSERT_INTO_full_linkage_VALUES_ = SubLObjectFactory.makeString("INSERT INTO full_linkage VALUES(");
        $sym164$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $kw165$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $str166$timed_out__ = SubLObjectFactory.makeString("timed out~%");
        $str167$link_cyclification_id_seq = SubLObjectFactory.makeString("link_cyclification_id_seq");
        $str168$INSERT_INTO_link_cyclification_VA = SubLObjectFactory.makeString("INSERT INTO link_cyclification VALUES(");
        $str169$INSERT_INTO_cyclifications_VALUES = SubLObjectFactory.makeString("INSERT INTO cyclifications VALUES(");
        $const170$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str171$cyclifications_id_seq = SubLObjectFactory.makeString("cyclifications_id_seq");
        $str172$INSERT_INTO_justification_VALUES_ = SubLObjectFactory.makeString("INSERT INTO justification VALUES(");
        $str173$INSERT_INTO_run_statistics_VALUES = SubLObjectFactory.makeString("INSERT INTO run_statistics VALUES(~a, ~a, ~a, ~a, ~a, ~f, ~f, ~f, ~f, ~f, ~f, ~f, ~f)");
        $str174$SELECT_raw_linkage_contents______ = SubLObjectFactory.makeString("SELECT raw_linkage.contents \n             FROM raw_linkage, sentence \n             WHERE raw_linkage.contents IS NOT NULL \n             AND raw_linkage.sentence_id = sentence.id \n             AND sentence.contents = '");
        $str175$________________ORDER_BY_raw_link = SubLObjectFactory.makeString("' \n             ORDER BY raw_linkage.start DESC\n             LIMIT 1");
        $str176$SELECT_ = SubLObjectFactory.makeString("SELECT ");
        $str177$_________FROM_run_statistics_____ = SubLObjectFactory.makeString(" \n       FROM run_statistics \n       WHERE run_id = ");
        $sym178$WORDS = SubLObjectFactory.makeSymbol("WORDS");
        $sym179$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $str180$__ = SubLObjectFactory.makeString("\\'");
        $str181$SELECT_id_FROM_corpus_WHERE_name_ = SubLObjectFactory.makeString("SELECT id FROM corpus WHERE name = '");
        $str182$Can_t_determine_id_for_unknown_co = SubLObjectFactory.makeString("Can't determine id for unknown corpus ~a");
        $str183$SELECT_nextval__ = SubLObjectFactory.makeString("SELECT nextval('");
        $str184$_4__0D__2__0D__2__0D__2__0D__2__0 = SubLObjectFactory.makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D");
    }
}

/*

	Total time: 1489 ms
	 synthetic 
*/