package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class nlp_db_metrics
    extends
      SubLTranslatedFile
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
  public static SubLObject with_link_metrics_statement(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stmt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    stmt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym8$WITH_SQL_STATEMENT, reader.bq_cons( stmt, $list9 ), ConsesLow.list( $sym10$PWHEN, ConsesLow.list( $sym11$SDBC_ERROR_P, stmt ), ConsesLow.list( $sym12$SDBC_ERROR_THROW, stmt ) ),
          ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 1816L)
  public static SubLObject with_link_metrics_result_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rs = NIL;
    SubLObject query = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    rs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    query = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym14$WITH_SQL_RESULT_SET, ConsesLow.listS( rs, query, $list9 ), ConsesLow.list( $sym10$PWHEN, ConsesLow.list( $sym11$SDBC_ERROR_P, rs ), ConsesLow.list( $sym12$SDBC_ERROR_THROW, rs ) ),
          ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 2227L)
  public static SubLObject do_link_metrics_result_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rs = NIL;
    SubLObject query = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    rs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    query = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym15$WITH_LINK_METRICS_RESULT_SET, ConsesLow.list( rs, query ), ConsesLow.list( $sym10$PWHEN, ConsesLow.list( $sym16$SQL_RESULT_SET_P, rs ), ConsesLow.listS( $sym17$WHILE, ConsesLow.list(
          $sym18$SQLRS_NEXT, rs ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 2428L)
  public static SubLObject do_link_metrics_corpus(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sentence_id = NIL;
    SubLObject sentence = NIL;
    SubLObject corpus = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    sentence_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    corpus = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym20$CLET, ConsesLow.list( sentence_id, sentence ), ConsesLow.listS( $sym21$DO_LINK_METRICS_RESULT_SET, ConsesLow.list( $sym22$RS, ConsesLow.list( $sym23$FORMAT_NIL,
          $str24$SELECT_sentence_id__sentence_cont, ConsesLow.list( $sym25$POSTGRESQL_ESCAPE_STRING, corpus ) ) ), ConsesLow.listS( $sym26$CSETQ, sentence_id, $list27 ), ConsesLow.listS( $sym26$CSETQ, sentence,
              $list28 ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 2957L)
  public static SubLObject do_link_metrics_link_structures(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject linkage_id = NIL;
    SubLObject ls = NIL;
    SubLObject sentence_id = NIL;
    SubLObject sentence = NIL;
    SubLObject start = NIL;
    SubLObject duration = NIL;
    SubLObject run_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    linkage_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    ls = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    sentence_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    start = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    duration = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    run_id = current.first();
    current = current.rest();
    final SubLObject lexicon = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list29 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym20$CLET, ConsesLow.list( linkage_id, ls, sentence_id, sentence, start, duration ), ConsesLow.listS( $sym21$DO_LINK_METRICS_RESULT_SET, new SubLObject[] { ConsesLow.list( $sym22$RS,
          ConsesLow.list( $sym23$FORMAT_NIL, $str30$SELECT_raw_linkage_id__raw_linkag, run_id ) ), ConsesLow.listS( $sym26$CSETQ, linkage_id, $list27 ), ConsesLow.listS( $sym26$CSETQ, sentence_id, $list31 ), ConsesLow
              .listS( $sym26$CSETQ, sentence, $list32 ), ConsesLow.list( $sym26$CSETQ, ls, ConsesLow.list( $sym33$FIF, $list34, NIL, ConsesLow.list( $sym35$FIRST, ConsesLow.listS( $sym36$NEW_LINK_STRUCTURES, $list37,
                  lexicon, sentence, $list38 ) ) ) ), ConsesLow.listS( $sym26$CSETQ, start, $list39 ), ConsesLow.listS( $sym26$CSETQ, duration, $list40 ), ConsesLow.append( body, NIL )
      } ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 3945L)
  public static SubLObject update_lexicon_statistics(final SubLObject macroform, final SubLObject environment)
  {
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
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    v_linkage = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    lex_verb_count = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    lex_noun_count = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    lex_adj_count = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    lex_adv_count = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    verb_interps_counts = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    noun_interps_counts = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    adj_interps_counts = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    adv_interps_counts = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym42$PROGN, ConsesLow.list( new SubLObject[] { $sym10$PWHEN, v_linkage, ConsesLow.list( $sym43$CINC, lex_verb_count, ConsesLow.listS( $sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, $list45 ) ),
        ConsesLow.list( $sym43$CINC, lex_noun_count, ConsesLow.listS( $sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, $list46 ) ), ConsesLow.list( $sym43$CINC, lex_adj_count, ConsesLow.listS( $sym44$LINKAGE_LEXIFIED_COUNT,
            v_linkage, $list47 ) ), ConsesLow.list( $sym43$CINC, lex_adv_count, ConsesLow.listS( $sym44$LINKAGE_LEXIFIED_COUNT, v_linkage, $list48 ) ), ConsesLow.list( $sym49$CDOLIST, ConsesLow.list( $sym50$COUNT,
                ConsesLow.listS( $sym51$LINKAGE_INTERPS_COUNT, v_linkage, $list45 ) ), ConsesLow.list( $sym52$CPUSH, $sym50$COUNT, verb_interps_counts ) ), ConsesLow.list( $sym49$CDOLIST, ConsesLow.list( $sym50$COUNT,
                    ConsesLow.listS( $sym51$LINKAGE_INTERPS_COUNT, v_linkage, $list46 ) ), ConsesLow.list( $sym52$CPUSH, $sym50$COUNT, noun_interps_counts ) ), ConsesLow.list( $sym49$CDOLIST, ConsesLow.list(
                        $sym50$COUNT, ConsesLow.listS( $sym51$LINKAGE_INTERPS_COUNT, v_linkage, $list47 ) ), ConsesLow.list( $sym52$CPUSH, $sym50$COUNT, adj_interps_counts ) ), ConsesLow.list( $sym49$CDOLIST, ConsesLow
                            .list( $sym50$COUNT, ConsesLow.listS( $sym51$LINKAGE_INTERPS_COUNT, v_linkage, $list48 ) ), ConsesLow.list( $sym52$CPUSH, $sym50$COUNT, adv_interps_counts ) )
      } ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 4952L)
  public static SubLObject db_raw_linkage_run(final SubLObject corpus, SubLObject comment)
  {
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( corpus ) : corpus;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    SubLObject i = ZERO_INTEGER;
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject run_id = insert_run( stmt, ONE_INTEGER, corpus, comment );
      SubLObject sentence_id = NIL;
      SubLObject sentence = NIL;
      SubLObject rs = NIL;
      SubLObject statement = NIL;
      SubLObject connection_$1 = NIL;
      try
      {
        connection_$1 = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list(
            new SubLObject[]
            { $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ),
              $kw57$PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
            } ) );
        if( NIL != sdbc.sql_open_connection_p( connection_$1 ) )
        {
          statement = sdbc.sqlc_create_statement( connection_$1 );
        }
        else
        {
          statement = connection_$1;
        }
        if( NIL != sdbc.sql_open_statement_p( statement ) )
        {
          rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( corpus ) ),
            $str60$___________________________AND_se
          } ), UNPROVIDED );
        }
        else
        {
          rs = statement;
        }
        if( NIL != sdbc.sdbc_error_p( rs ) )
        {
          sdbc.sdbc_error_throw( rs );
        }
        if( NIL != sdbc.sql_result_set_p( rs ) )
        {
          while ( NIL != sdbc.sqlrs_next( rs ))
          {
            sentence_id = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
            sentence = sdbc.sqlrs_get_object( rs, TWO_INTEGER );
            i = Numbers.add( i, ONE_INTEGER );
            SubLObject error = NIL;
            PrintLow.format( T, $str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp( UNPROVIDED ), sentence_id, sentence
            } );
            streams_high.finish_output( UNPROVIDED );
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  insert_raw_linkage( stmt, sentence, run_id, sentence_id, NIL );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            }
            finally
            {
              thread.throwStack.pop();
            }
            if( NIL != error )
            {
              Errors.warn( error );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection_$1 ) )
          {
            sdbc.sqlc_close( connection_$1 );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 5718L)
  public static SubLObject db_word_linkage_run(final SubLObject corpus, SubLObject comment)
  {
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( corpus ) : corpus;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    SubLObject i = ZERO_INTEGER;
    final SubLObject lexicon = object.new_class_instance( $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION );
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject run_id = insert_run( stmt, TWO_INTEGER, corpus, comment );
      SubLObject raw_linkage = NIL;
      SubLObject raw_linkage_id = NIL;
      SubLObject terror = NIL;
      SubLObject sentence_id = NIL;
      SubLObject sentence = NIL;
      SubLObject rs = NIL;
      SubLObject statement = NIL;
      SubLObject connection_$2 = NIL;
      try
      {
        connection_$2 = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list(
            new SubLObject[]
            { $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ),
              $kw57$PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
            } ) );
        if( NIL != sdbc.sql_open_connection_p( connection_$2 ) )
        {
          statement = sdbc.sqlc_create_statement( connection_$2 );
        }
        else
        {
          statement = connection_$2;
        }
        if( NIL != sdbc.sql_open_statement_p( statement ) )
        {
          rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( corpus ) ),
            $str60$___________________________AND_se
          } ), UNPROVIDED );
        }
        else
        {
          rs = statement;
        }
        if( NIL != sdbc.sdbc_error_p( rs ) )
        {
          sdbc.sdbc_error_throw( rs );
        }
        if( NIL != sdbc.sql_result_set_p( rs ) )
        {
          while ( NIL != sdbc.sqlrs_next( rs ))
          {
            sentence_id = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
            sentence = sdbc.sqlrs_get_object( rs, TWO_INTEGER );
            i = Numbers.add( i, ONE_INTEGER );
            terror = NIL;
            PrintLow.format( T, $str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp( UNPROVIDED ), sentence_id, sentence
            } );
            streams_high.finish_output( UNPROVIDED );
            if( NIL != sentence )
            {
              final SubLObject connection_$3 = sdbc.sqls_get_connection( stmt );
              final SubLObject auto_commit = sdbc.sqlc_get_auto_commit( connection_$3 );
              SubLObject commit_error = NIL;
              SubLObject rollback_result = NIL;
              SubLObject auto_commit_result = NIL;
              SubLObject errors = NIL;
              if( NIL != sdbc.sdbc_error_p( auto_commit ) )
              {
                errors = ConsesLow.cons( auto_commit, errors );
              }
              else
              {
                sdbc.sqlc_set_error_handling( connection_$3, $kw64$THROW );
                try
                {
                  thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
                  try
                  {
                    Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                    try
                    {
                      if( NIL != auto_commit )
                      {
                        sdbc.sqlc_set_auto_commit( connection_$3, NIL );
                      }
                      thread.resetMultipleValues();
                      final SubLObject raw_linkage_$4 = insert_raw_linkage( stmt, sentence, run_id, sentence_id, lexicon );
                      final SubLObject raw_linkage_id_$5 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      raw_linkage = raw_linkage_$4;
                      raw_linkage_id = raw_linkage_id_$5;
                      insert_word_linkage( stmt, sentence, raw_linkage, raw_linkage_id );
                      sdbc.sqlc_commit( connection_$3 );
                    }
                    catch( final Throwable catch_var )
                    {
                      Errors.handleThrowable( catch_var, NIL );
                    }
                  }
                  finally
                  {
                    Errors.$error_handler$.rebind( _prev_bind_0, thread );
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  commit_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                }
                finally
                {
                  thread.throwStack.pop();
                }
                sdbc.sqlc_set_error_handling( connection_$3, $kw65$RETURN );
                if( NIL != commit_error )
                {
                  errors = ConsesLow.cons( sdbc.sqls_handle_commit_error( commit_error ), errors );
                  rollback_result = sdbc.sqls_handle_rollback( connection_$3 );
                  if( NIL != sdbc.sdbc_error_p( rollback_result ) )
                  {
                    errors = ConsesLow.cons( rollback_result, errors );
                  }
                }
                if( NIL != auto_commit )
                {
                  auto_commit_result = sdbc.sqlc_set_auto_commit( connection_$3, T );
                }
                if( NIL != sdbc.sdbc_error_p( auto_commit_result ) )
                {
                  errors = ConsesLow.cons( auto_commit_result, errors );
                }
              }
              if( NIL != errors )
              {
                terror = sdbc.sqls_handle_transaction_errors( errors );
              }
              if( NIL == terror )
              {
                continue;
              }
              sdbc.sdbc_error_warn( terror );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection_$2 ) )
          {
            sdbc.sqlc_close( connection_$2 );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 6795L)
  public static SubLObject db_full_linkage_run(final SubLObject corpus, SubLObject comment)
  {
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( corpus ) : corpus;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    SubLObject i = ZERO_INTEGER;
    final SubLObject lexicon = object.new_class_instance( $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION );
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject run_id = insert_run( stmt, THREE_INTEGER, corpus, comment );
      SubLObject raw_linkage = NIL;
      SubLObject raw_linkage_id = NIL;
      SubLObject terror = NIL;
      SubLObject sentence_id = NIL;
      SubLObject sentence = NIL;
      SubLObject rs = NIL;
      SubLObject statement = NIL;
      SubLObject connection_$6 = NIL;
      try
      {
        connection_$6 = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list(
            new SubLObject[]
            { $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ),
              $kw57$PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
            } ) );
        if( NIL != sdbc.sql_open_connection_p( connection_$6 ) )
        {
          statement = sdbc.sqlc_create_statement( connection_$6 );
        }
        else
        {
          statement = connection_$6;
        }
        if( NIL != sdbc.sql_open_statement_p( statement ) )
        {
          rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( corpus ) ),
            $str60$___________________________AND_se
          } ), UNPROVIDED );
        }
        else
        {
          rs = statement;
        }
        if( NIL != sdbc.sdbc_error_p( rs ) )
        {
          sdbc.sdbc_error_throw( rs );
        }
        if( NIL != sdbc.sql_result_set_p( rs ) )
        {
          while ( NIL != sdbc.sqlrs_next( rs ))
          {
            sentence_id = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
            sentence = sdbc.sqlrs_get_object( rs, TWO_INTEGER );
            i = Numbers.add( i, ONE_INTEGER );
            terror = NIL;
            PrintLow.format( T, $str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp( UNPROVIDED ), sentence_id, sentence
            } );
            streams_high.finish_output( UNPROVIDED );
            final SubLObject connection_$7 = sdbc.sqls_get_connection( stmt );
            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit( connection_$7 );
            SubLObject commit_error = NIL;
            SubLObject rollback_result = NIL;
            SubLObject auto_commit_result = NIL;
            SubLObject errors = NIL;
            if( NIL != sdbc.sdbc_error_p( auto_commit ) )
            {
              errors = ConsesLow.cons( auto_commit, errors );
            }
            else
            {
              sdbc.sqlc_set_error_handling( connection_$7, $kw64$THROW );
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    if( NIL != auto_commit )
                    {
                      sdbc.sqlc_set_auto_commit( connection_$7, NIL );
                    }
                    thread.resetMultipleValues();
                    final SubLObject raw_linkage_$8 = insert_raw_linkage( stmt, sentence, run_id, sentence_id, lexicon );
                    final SubLObject raw_linkage_id_$9 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    raw_linkage = raw_linkage_$8;
                    raw_linkage_id = raw_linkage_id_$9;
                    insert_full_linkage( stmt, raw_linkage, raw_linkage_id, lexicon );
                    sdbc.sqlc_commit( connection_$7 );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                commit_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              sdbc.sqlc_set_error_handling( connection_$7, $kw65$RETURN );
              if( NIL != commit_error )
              {
                errors = ConsesLow.cons( sdbc.sqls_handle_commit_error( commit_error ), errors );
                rollback_result = sdbc.sqls_handle_rollback( connection_$7 );
                if( NIL != sdbc.sdbc_error_p( rollback_result ) )
                {
                  errors = ConsesLow.cons( rollback_result, errors );
                }
              }
              if( NIL != auto_commit )
              {
                auto_commit_result = sdbc.sqlc_set_auto_commit( connection_$7, T );
              }
              if( NIL != sdbc.sdbc_error_p( auto_commit_result ) )
              {
                errors = ConsesLow.cons( auto_commit_result, errors );
              }
            }
            if( NIL != errors )
            {
              terror = sdbc.sqls_handle_transaction_errors( errors );
            }
            if( NIL != terror )
            {
              sdbc.sdbc_error_warn( terror );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection_$6 ) )
          {
            sdbc.sqlc_close( connection_$6 );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 7810L)
  public static SubLObject db_link_cyclification_run(final SubLObject corpus, SubLObject comment)
  {
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( corpus ) : corpus;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    SubLObject i = ZERO_INTEGER;
    final SubLObject lexicon = object.new_class_instance( $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION );
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject run_id = insert_run( stmt, FOUR_INTEGER, corpus, comment );
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
      try
      {
        connection_$10 = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list(
            new SubLObject[]
            { $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ),
              $kw57$PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
            } ) );
        if( NIL != sdbc.sql_open_connection_p( connection_$10 ) )
        {
          statement = sdbc.sqlc_create_statement( connection_$10 );
        }
        else
        {
          statement = connection_$10;
        }
        if( NIL != sdbc.sql_open_statement_p( statement ) )
        {
          rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( corpus ) ),
            $str60$___________________________AND_se
          } ), UNPROVIDED );
        }
        else
        {
          rs = statement;
        }
        if( NIL != sdbc.sdbc_error_p( rs ) )
        {
          sdbc.sdbc_error_throw( rs );
        }
        if( NIL != sdbc.sql_result_set_p( rs ) )
        {
          while ( NIL != sdbc.sqlrs_next( rs ))
          {
            sentence_id = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
            sentence = sdbc.sqlrs_get_object( rs, TWO_INTEGER );
            i = Numbers.add( i, ONE_INTEGER );
            terror = NIL;
            SubLObject error = NIL;
            PrintLow.format( T, $str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp( UNPROVIDED ), sentence_id, sentence
            } );
            streams_high.finish_output( UNPROVIDED );
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  final SubLObject connection_$11 = sdbc.sqls_get_connection( stmt );
                  final SubLObject auto_commit = sdbc.sqlc_get_auto_commit( connection_$11 );
                  SubLObject commit_error = NIL;
                  SubLObject rollback_result = NIL;
                  SubLObject auto_commit_result = NIL;
                  SubLObject errors = NIL;
                  if( NIL != sdbc.sdbc_error_p( auto_commit ) )
                  {
                    errors = ConsesLow.cons( auto_commit, errors );
                  }
                  else
                  {
                    sdbc.sqlc_set_error_handling( connection_$11, $kw64$THROW );
                    try
                    {
                      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                      final SubLObject _prev_bind_0_$12 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                        try
                        {
                          if( NIL != auto_commit )
                          {
                            sdbc.sqlc_set_auto_commit( connection_$11, NIL );
                          }
                          thread.resetMultipleValues();
                          final SubLObject raw_linkage_$13 = insert_raw_linkage( stmt, sentence, run_id, sentence_id, lexicon );
                          final SubLObject raw_linkage_id_$14 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          raw_linkage = raw_linkage_$13;
                          raw_linkage_id = raw_linkage_id_$14;
                          thread.resetMultipleValues();
                          final SubLObject v_linkage_$15 = insert_full_linkage( stmt, raw_linkage, raw_linkage_id, lexicon );
                          final SubLObject linkage_id_$16 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          v_linkage = v_linkage_$15;
                          linkage_id = linkage_id_$16;
                          insert_link_cyclification( stmt, v_linkage, linkage_id, lexicon );
                          sdbc.sqlc_commit( connection_$11 );
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$12, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      commit_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                    sdbc.sqlc_set_error_handling( connection_$11, $kw65$RETURN );
                    if( NIL != commit_error )
                    {
                      errors = ConsesLow.cons( sdbc.sqls_handle_commit_error( commit_error ), errors );
                      rollback_result = sdbc.sqls_handle_rollback( connection_$11 );
                      if( NIL != sdbc.sdbc_error_p( rollback_result ) )
                      {
                        errors = ConsesLow.cons( rollback_result, errors );
                      }
                    }
                    if( NIL != auto_commit )
                    {
                      auto_commit_result = sdbc.sqlc_set_auto_commit( connection_$11, T );
                    }
                    if( NIL != sdbc.sdbc_error_p( auto_commit_result ) )
                    {
                      errors = ConsesLow.cons( auto_commit_result, errors );
                    }
                  }
                  if( NIL != errors )
                  {
                    terror = sdbc.sqls_handle_transaction_errors( errors );
                  }
                  if( NIL != terror )
                  {
                    sdbc.sdbc_error_warn( terror );
                  }
                  if( NIL != v_linkage )
                  {
                    lex_verb_count = Numbers.add( lex_verb_count, linkage_lexified_count( v_linkage, $sym66$VERB_LINK_WORD_P ) );
                    lex_noun_count = Numbers.add( lex_noun_count, linkage_lexified_count( v_linkage, $sym67$NOUN_LINK_WORD_P ) );
                    lex_adj_count = Numbers.add( lex_adj_count, linkage_lexified_count( v_linkage, $sym68$ADJECTIVE_LINK_WORD_P ) );
                    lex_adv_count = Numbers.add( lex_adv_count, linkage_lexified_count( v_linkage, $sym69$ADVERB_LINK_WORD_P ) );
                    SubLObject cdolist_list_var = linkage_interps_count( v_linkage, $sym66$VERB_LINK_WORD_P );
                    SubLObject count = NIL;
                    count = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      verb_interps_counts = ConsesLow.cons( count, verb_interps_counts );
                      cdolist_list_var = cdolist_list_var.rest();
                      count = cdolist_list_var.first();
                    }
                    cdolist_list_var = linkage_interps_count( v_linkage, $sym67$NOUN_LINK_WORD_P );
                    count = NIL;
                    count = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      noun_interps_counts = ConsesLow.cons( count, noun_interps_counts );
                      cdolist_list_var = cdolist_list_var.rest();
                      count = cdolist_list_var.first();
                    }
                    cdolist_list_var = linkage_interps_count( v_linkage, $sym68$ADJECTIVE_LINK_WORD_P );
                    count = NIL;
                    count = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      adj_interps_counts = ConsesLow.cons( count, adj_interps_counts );
                      cdolist_list_var = cdolist_list_var.rest();
                      count = cdolist_list_var.first();
                    }
                    cdolist_list_var = linkage_interps_count( v_linkage, $sym69$ADVERB_LINK_WORD_P );
                    count = NIL;
                    count = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      adv_interps_counts = ConsesLow.cons( count, adv_interps_counts );
                      cdolist_list_var = cdolist_list_var.rest();
                      count = cdolist_list_var.first();
                    }
                  }
                }
                catch( final Throwable catch_var2 )
                {
                  Errors.handleThrowable( catch_var2, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0, thread );
              }
            }
            catch( final Throwable ccatch_env_var2 )
            {
              error = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            }
            finally
            {
              thread.throwStack.pop();
            }
            if( NIL != error )
            {
              Errors.warn( error );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection_$10 ) )
          {
            sdbc.sqlc_close( connection_$10 );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      insert_run_statistics( stmt, run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count, verb_interps_counts, noun_interps_counts, adj_interps_counts, adv_interps_counts );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 9796L)
  public static SubLObject db_ebmt_cyclification_run(final SubLObject corpus, SubLObject comment)
  {
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( corpus ) : corpus;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    SubLObject i = ZERO_INTEGER;
    final SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon( UNPROVIDED );
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject run_id = insert_run( stmt, FIVE_INTEGER, corpus, comment );
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
      try
      {
        connection_$17 = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list(
            new SubLObject[]
            { $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ),
              $kw57$PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
            } ) );
        if( NIL != sdbc.sql_open_connection_p( connection_$17 ) )
        {
          statement = sdbc.sqlc_create_statement( connection_$17 );
        }
        else
        {
          statement = connection_$17;
        }
        if( NIL != sdbc.sql_open_statement_p( statement ) )
        {
          rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str59$SELECT_sentence_id__sentence_cont, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( corpus ) ),
            $str60$___________________________AND_se
          } ), UNPROVIDED );
        }
        else
        {
          rs = statement;
        }
        if( NIL != sdbc.sdbc_error_p( rs ) )
        {
          sdbc.sdbc_error_throw( rs );
        }
        if( NIL != sdbc.sql_result_set_p( rs ) )
        {
          while ( NIL != sdbc.sqlrs_next( rs ))
          {
            sentence_id = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
            sentence = sdbc.sqlrs_get_object( rs, TWO_INTEGER );
            i = Numbers.add( i, ONE_INTEGER );
            terror = NIL;
            PrintLow.format( T, $str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp( UNPROVIDED ), sentence_id, sentence
            } );
            streams_high.finish_output( UNPROVIDED );
            final SubLObject connection_$18 = sdbc.sqls_get_connection( stmt );
            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit( connection_$18 );
            SubLObject commit_error = NIL;
            SubLObject rollback_result = NIL;
            SubLObject auto_commit_result = NIL;
            SubLObject errors = NIL;
            if( NIL != sdbc.sdbc_error_p( auto_commit ) )
            {
              errors = ConsesLow.cons( auto_commit, errors );
            }
            else
            {
              sdbc.sqlc_set_error_handling( connection_$18, $kw64$THROW );
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    if( NIL != auto_commit )
                    {
                      sdbc.sqlc_set_auto_commit( connection_$18, NIL );
                    }
                    thread.resetMultipleValues();
                    final SubLObject raw_linkage_$19 = insert_raw_linkage( stmt, sentence, run_id, sentence_id, lexicon );
                    final SubLObject raw_linkage_id_$20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    raw_linkage = raw_linkage_$19;
                    raw_linkage_id = raw_linkage_id_$20;
                    thread.resetMultipleValues();
                    final SubLObject v_linkage_$21 = insert_full_linkage( stmt, raw_linkage, raw_linkage_id, lexicon );
                    final SubLObject linkage_id_$22 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_linkage = v_linkage_$21;
                    linkage_id = linkage_id_$22;
                    insert_ebmt_cyclification( stmt, v_linkage, linkage_id, lexicon, sentence );
                    sdbc.sqlc_commit( connection_$18 );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                commit_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              sdbc.sqlc_set_error_handling( connection_$18, $kw65$RETURN );
              if( NIL != commit_error )
              {
                errors = ConsesLow.cons( sdbc.sqls_handle_commit_error( commit_error ), errors );
                rollback_result = sdbc.sqls_handle_rollback( connection_$18 );
                if( NIL != sdbc.sdbc_error_p( rollback_result ) )
                {
                  errors = ConsesLow.cons( rollback_result, errors );
                }
              }
              if( NIL != auto_commit )
              {
                auto_commit_result = sdbc.sqlc_set_auto_commit( connection_$18, T );
              }
              if( NIL != sdbc.sdbc_error_p( auto_commit_result ) )
              {
                errors = ConsesLow.cons( auto_commit_result, errors );
              }
            }
            if( NIL != errors )
            {
              terror = sdbc.sqls_handle_transaction_errors( errors );
            }
            if( NIL != terror )
            {
              sdbc.sdbc_error_warn( terror );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection_$17 ) )
          {
            sdbc.sqlc_close( connection_$17 );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 11003L)
  public static SubLObject db_cached_ebmt_cyclification_run(final SubLObject old_run_id, SubLObject comment)
  {
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( old_run_id ) : old_run_id;
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    SubLObject i = ZERO_INTEGER;
    final SubLObject lexicon = ebmt_template_parser.new_ebmt_lexicon( UNPROVIDED );
    final SubLObject corpus = db_get_run_corpus( old_run_id );
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject run_id = insert_run( stmt, FIVE_INTEGER, corpus, comment );
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
      try
      {
        connection_$23 = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list(
            new SubLObject[]
            { $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ),
              $kw57$PROXY_SERVER, $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
            } ) );
        if( NIL != sdbc.sql_open_connection_p( connection_$23 ) )
        {
          statement = sdbc.sqlc_create_statement( connection_$23 );
        }
        else
        {
          statement = connection_$23;
        }
        if( NIL != sdbc.sql_open_statement_p( statement ) )
        {
          rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str71$SELECT_raw_linkage_id__raw_linkag, new SubLObject[] { format_nil.format_nil_a_no_copy( old_run_id ),
            $str72$__________________________AND_raw
          } ), UNPROVIDED );
        }
        else
        {
          rs = statement;
        }
        if( NIL != sdbc.sdbc_error_p( rs ) )
        {
          sdbc.sdbc_error_throw( rs );
        }
        if( NIL != sdbc.sql_result_set_p( rs ) )
        {
          while ( NIL != sdbc.sqlrs_next( rs ))
          {
            linkage_id = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
            sentence_id = sdbc.sqlrs_get_object( rs, THREE_INTEGER );
            sentence = sdbc.sqlrs_get_object( rs, FOUR_INTEGER );
            ls = ( NIL != sdbc.sql_null_p( sdbc.sqlrs_get_object( rs, TWO_INTEGER ) ) ) ? NIL
                : linkage.new_link_structures( reader.read_from_string( sdbc.sqlrs_get_object( rs, TWO_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), lexicon, sentence, T ).first();
            start = sdbc.sqlrs_get_object( rs, FIVE_INTEGER );
            duration = sdbc.sqlrs_get_object( rs, SIX_INTEGER );
            i = Numbers.add( i, ONE_INTEGER );
            terror = NIL;
            PrintLow.format( T, $str61$___a___a___a__, new SubLObject[] { iso_8601_timestamp( UNPROVIDED ), linkage_id, ls
            } );
            streams_high.finish_output( UNPROVIDED );
            final SubLObject connection_$24 = sdbc.sqls_get_connection( stmt );
            final SubLObject auto_commit = sdbc.sqlc_get_auto_commit( connection_$24 );
            SubLObject commit_error = NIL;
            SubLObject rollback_result = NIL;
            SubLObject auto_commit_result = NIL;
            SubLObject errors = NIL;
            if( NIL != sdbc.sdbc_error_p( auto_commit ) )
            {
              errors = ConsesLow.cons( auto_commit, errors );
            }
            else
            {
              sdbc.sqlc_set_error_handling( connection_$24, $kw64$THROW );
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    if( NIL != auto_commit )
                    {
                      sdbc.sqlc_set_auto_commit( connection_$24, NIL );
                    }
                    thread.resetMultipleValues();
                    final SubLObject raw_linkage_$25 = insert_cached_raw_linkage( stmt, run_id, sentence_id, ls, start, duration );
                    final SubLObject raw_linkage_id_$26 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    raw_linkage = raw_linkage_$25;
                    raw_linkage_id = raw_linkage_id_$26;
                    thread.resetMultipleValues();
                    final SubLObject v_linkage_$27 = insert_full_linkage( stmt, raw_linkage, raw_linkage_id, lexicon );
                    final SubLObject linkage_id_$28 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_linkage = v_linkage_$27;
                    linkage_id = linkage_id_$28;
                    insert_ebmt_cyclification( stmt, v_linkage, linkage_id, lexicon, sentence );
                    sdbc.sqlc_commit( connection_$24 );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                commit_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              sdbc.sqlc_set_error_handling( connection_$24, $kw65$RETURN );
              if( NIL != commit_error )
              {
                errors = ConsesLow.cons( sdbc.sqls_handle_commit_error( commit_error ), errors );
                rollback_result = sdbc.sqls_handle_rollback( connection_$24 );
                if( NIL != sdbc.sdbc_error_p( rollback_result ) )
                {
                  errors = ConsesLow.cons( rollback_result, errors );
                }
              }
              if( NIL != auto_commit )
              {
                auto_commit_result = sdbc.sqlc_set_auto_commit( connection_$24, T );
              }
              if( NIL != sdbc.sdbc_error_p( auto_commit_result ) )
              {
                errors = ConsesLow.cons( auto_commit_result, errors );
              }
            }
            if( NIL != errors )
            {
              terror = sdbc.sqls_handle_transaction_errors( errors );
            }
            if( NIL != terror )
            {
              sdbc.sdbc_error_warn( terror );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection_$23 ) )
          {
            sdbc.sqlc_close( connection_$23 );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return i;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 12266L)
  public static SubLObject db_get_run_corpus(final SubLObject run_id)
  {
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str73$SELECT_corpus_name________FROM_ru, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id ), $str74$________AND_run_corpus_id___corpu
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 12582L)
  public static SubLObject link_metrics_delete_run(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject error = NIL;
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      final SubLObject connection_$29 = sdbc.sqls_get_connection( stmt );
      final SubLObject auto_commit = sdbc.sqlc_get_auto_commit( connection_$29 );
      SubLObject commit_error = NIL;
      SubLObject rollback_result = NIL;
      SubLObject auto_commit_result = NIL;
      SubLObject errors = NIL;
      if( NIL != sdbc.sdbc_error_p( auto_commit ) )
      {
        errors = ConsesLow.cons( auto_commit, errors );
      }
      else
      {
        sdbc.sqlc_set_error_handling( connection_$29, $kw64$THROW );
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym62$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              if( NIL != auto_commit )
              {
                sdbc.sqlc_set_auto_commit( connection_$29, NIL );
              }
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str75$DELETE_FROM_justification________, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str76$DELETE_FROM_cyclifications_______, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str77$DELETE_FROM_link_cyclification___, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str78$DELETE_FROM_full_linkage_________, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str79$DELETE_FROM_word_linkage_________, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str80$DELETE_FROM_raw_linkage__________, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str81$DELETE_FROM_run_statistics_______, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str82$DELETE_FROM_run____________WHERE_, format_nil.format_nil_a_no_copy( run_id ) ) );
              sdbc.sqlc_commit( connection_$29 );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          commit_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        sdbc.sqlc_set_error_handling( connection_$29, $kw65$RETURN );
        if( NIL != commit_error )
        {
          errors = ConsesLow.cons( sdbc.sqls_handle_commit_error( commit_error ), errors );
          rollback_result = sdbc.sqls_handle_rollback( connection_$29 );
          if( NIL != sdbc.sdbc_error_p( rollback_result ) )
          {
            errors = ConsesLow.cons( rollback_result, errors );
          }
        }
        if( NIL != auto_commit )
        {
          auto_commit_result = sdbc.sqlc_set_auto_commit( connection_$29, T );
        }
        if( NIL != sdbc.sdbc_error_p( auto_commit_result ) )
        {
          errors = ConsesLow.cons( auto_commit_result, errors );
        }
      }
      if( NIL != errors )
      {
        error = sdbc.sqls_handle_transaction_errors( errors );
      }
      if( NIL != sdbc.sdbc_error_p( error ) )
      {
        sdbc.sdbc_error_warn( error );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 14789L)
  public static SubLObject link_metrics_sentence_count(final SubLObject run_id)
  {
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str83$SELECT_count_sentence_id_________, format_nil.format_nil_a_no_copy( run_id ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 15124L)
  public static SubLObject link_metrics_avg_interpretation_count(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject counts = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str84$SELECT_link_cyclification_id_____, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id ), $str85$____________GROUP_BY_link_cyclifi
        } ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          counts = ConsesLow.cons( sdbc.sqlrs_get_object( rs, TWO_INTEGER ), counts );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = link_metrics_no_interpretation_count( run_id ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      counts = ConsesLow.cons( ZERO_INTEGER, counts );
    }
    return ( NIL != counts ) ? number_utilities.mean( counts ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 16002L)
  public static SubLObject link_metrics_median_interpretation_count(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject counts = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str84$SELECT_link_cyclification_id_____, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id ), $str85$____________GROUP_BY_link_cyclifi
        } ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          counts = ConsesLow.cons( sdbc.sqlrs_get_object( rs, TWO_INTEGER ), counts );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = link_metrics_no_interpretation_count( run_id ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      counts = ConsesLow.cons( ZERO_INTEGER, counts );
    }
    return ( NIL != counts ) ? number_utilities.median( counts, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 16885L)
  public static SubLObject link_metrics_no_interpretation_count(final SubLObject run_id)
  {
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str86$SELECT_COUNT_link_cyclification_i, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id ), $str87$________AND_NOT_EXISTS___________
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 17535L)
  public static SubLObject link_metrics_failed_link_parse_sentences(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject sentences = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str88$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy( run_id ) ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          sentences = ConsesLow.cons( sdbc.sqlrs_get_object( rs, ONE_INTEGER ), sentences );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 18051L)
  public static SubLObject link_metrics_succeeded_link_parse_sentences(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject sentences = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str89$SELECT_sentence_contents_________, format_nil.format_nil_a_no_copy( run_id ) ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          sentences = ConsesLow.cons( sdbc.sqlrs_get_object( rs, ONE_INTEGER ), sentences );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 18574L)
  public static SubLObject link_metrics_avg_lexified_word_count(final SubLObject run_id)
  {
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str90$SELECT_AVG_lexified_count________, format_nil.format_nil_a_no_copy( run_id ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 19013L)
  public static SubLObject link_metrics_median_lexified_word_count(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject counts = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str91$SELECT_lexified_count____________, format_nil.format_nil_a_no_copy( run_id ) ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          if( NIL == sdbc.sql_null_p( sdbc.sqlrs_get_object( rs, ONE_INTEGER ) ) )
          {
            counts = ConsesLow.cons( sdbc.sqlrs_get_object( rs, ONE_INTEGER ), counts );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return number_utilities.median( counts, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 19583L)
  public static SubLObject link_metrics_raw_linkage_diffs(final SubLObject run_id1, final SubLObject run_id2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id1 ) : run_id1;
    assert NIL != subl_promotions.positive_integer_p( run_id2 ) : run_id2;
    SubLObject count = ZERO_INTEGER;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str92$SELECT_sentence_contents__raw_lin, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id1 ), $str93$____________AND_raw_linkage2_run_,
          format_nil.format_nil_a_no_copy( run_id2 ), $str94$____________AND_raw_linkage1_sent
        } ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      while ( NIL != sdbc.sqlrs_next( rs ))
      {
        PrintLow.format( T, $str95$_a____a____a____a____a___________, new SubLObject[] { sdbc.sqlrs_get_object( rs, ONE_INTEGER ), run_id1, sdbc.sqlrs_get_object( rs, TWO_INTEGER ), run_id2, sdbc.sqlrs_get_object( rs,
            THREE_INTEGER )
        } );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 20678L)
  public static SubLObject link_metrics_lexified_verb_count(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str96$lex_verb_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 20865L)
  public static SubLObject link_metrics_lexified_noun_count(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str97$lex_noun_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21052L)
  public static SubLObject link_metrics_lexified_adj_count(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str98$lex_adj_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21242L)
  public static SubLObject link_metrics_lexified_adv_count(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str99$lex_adv_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21429L)
  public static SubLObject link_metrics_mean_verb_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str100$mean_verb_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21625L)
  public static SubLObject link_metrics_mean_noun_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str101$mean_noun_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 21820L)
  public static SubLObject link_metrics_mean_adj_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str102$mean_adj_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22018L)
  public static SubLObject link_metrics_mean_adv_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str103$mean_adv_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22213L)
  public static SubLObject link_metrics_median_verb_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str104$med_verb_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22409L)
  public static SubLObject link_metrics_median_noun_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str105$med_noun_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22604L)
  public static SubLObject link_metrics_median_adj_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str106$med_adj_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22802L)
  public static SubLObject link_metrics_median_adv_interps(final SubLObject run_id)
  {
    return link_metrics_run_value( run_id, $str107$med_adv_lexes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 22997L)
  public static SubLObject time_count_failed_table(final SubLObject run_id, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int108$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    final SubLObject times = Hashtables.make_hash_table( $int109$1024, EQL, UNPROVIDED );
    SubLObject table = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str110$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy( run_id ) ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          final SubLObject time = Numbers.truncate( Numbers.divide( sdbc.sqlrs_get_object( rs, ONE_INTEGER ), n ), UNPROVIDED );
          Hashtables.sethash( time, times, number_utilities.f_1X( Hashtables.gethash( time, times, ZERO_INTEGER ) ) );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject time = NIL;
    SubLObject count = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( times );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        time = Hashtables.getEntryKey( cdohash_entry );
        count = Hashtables.getEntryValue( cdohash_entry );
        table = ConsesLow.cons( ConsesLow.list( Numbers.multiply( time, n ), count ), table );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sort.sort( table, $sym111$_, $sym112$CAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 23774L)
  public static SubLObject time_count_succeeded_table(final SubLObject run_id, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int108$1000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    final SubLObject times = Hashtables.make_hash_table( $int109$1024, EQL, UNPROVIDED );
    SubLObject table = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str113$SELECT_duration_____________FROM_, format_nil.format_nil_a_no_copy( run_id ) ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          final SubLObject time = Numbers.truncate( Numbers.divide( sdbc.sqlrs_get_object( rs, ONE_INTEGER ), n ), UNPROVIDED );
          Hashtables.sethash( time, times, number_utilities.f_1X( Hashtables.gethash( time, times, ZERO_INTEGER ) ) );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject time = NIL;
    SubLObject count = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( times );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        time = Hashtables.getEntryKey( cdohash_entry );
        count = Hashtables.getEntryValue( cdohash_entry );
        table = ConsesLow.cons( ConsesLow.list( Numbers.multiply( time, n ), count ), table );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sort.sort( table, $sym111$_, $sym112$CAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 24515L)
  public static SubLObject length_count_failed_table(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    final SubLObject lengths = Hashtables.make_hash_table( $int109$1024, EQL, UNPROVIDED );
    SubLObject table = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str114$SELECT_sentence_contents_________, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id ), $str115$____________AND_sentence_id___sen
        } ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          final SubLObject sentence = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
          final SubLObject length = document.sentence_length( document.new_sentence( sentence, UNPROVIDED ) );
          Hashtables.sethash( length, lengths, number_utilities.f_1X( Hashtables.gethash( length, lengths, ZERO_INTEGER ) ) );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject length2 = NIL;
    SubLObject count = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( lengths );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        length2 = Hashtables.getEntryKey( cdohash_entry );
        count = Hashtables.getEntryValue( cdohash_entry );
        table = ConsesLow.cons( ConsesLow.list( length2, count ), table );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sort.sort( table, $sym111$_, $sym112$CAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 25358L)
  public static SubLObject length_count_succeeded_table(final SubLObject run_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    final SubLObject lengths = Hashtables.make_hash_table( $int109$1024, EQL, UNPROVIDED );
    SubLObject table = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str116$SELECT_sentence_contents_________, new SubLObject[] { format_nil.format_nil_a_no_copy( run_id ), $str115$____________AND_sentence_id___sen
        } ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          final SubLObject sentence = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
          final SubLObject length = document.sentence_length( document.new_sentence( sentence, UNPROVIDED ) );
          Hashtables.sethash( length, lengths, number_utilities.f_1X( Hashtables.gethash( length, lengths, ZERO_INTEGER ) ) );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject length2 = NIL;
    SubLObject count = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( lengths );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        length2 = Hashtables.getEntryKey( cdohash_entry );
        count = Hashtables.getEntryValue( cdohash_entry );
        table = ConsesLow.cons( ConsesLow.list( length2, count ), table );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sort.sort( table, $sym111$_, $sym112$CAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 26209L)
  public static SubLObject print_table(final SubLObject table, SubLObject out)
  {
    if( out == UNPROVIDED )
    {
      out = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject cdolist_list_var = table;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( out, $str117$_a_t_a_T__, entry.first(), conses_high.second( entry ) );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 26378L)
  public static SubLObject generate_tables(final SubLObject run_id, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int108$1000;
    }
    assert NIL != subl_promotions.positive_integer_p( run_id ) : run_id;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( $str118$_home_aldag_time_count_failed_100, $kw119$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str120$Unable_to_open__S, $str118$_home_aldag_time_count_failed_100 );
      }
      final SubLObject out = stream;
      print_table( time_count_failed_table( run_id, n ), out );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    stream = NIL;
    try
    {
      stream = compatibility.open_text( $str121$_home_aldag_time_count_succeeded_, $kw119$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str120$Unable_to_open__S, $str121$_home_aldag_time_count_succeeded_ );
      }
      final SubLObject out = stream;
      print_table( time_count_succeeded_table( run_id, n ), out );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
      }
    }
    stream = NIL;
    try
    {
      stream = compatibility.open_text( $str122$_home_aldag_length_count_failed_1, $kw119$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str120$Unable_to_open__S, $str122$_home_aldag_length_count_failed_1 );
      }
      final SubLObject out = stream;
      print_table( length_count_failed_table( run_id ), out );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_3 );
      }
    }
    stream = NIL;
    try
    {
      stream = compatibility.open_text( $str123$_home_aldag_length_count_succeede, $kw119$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str120$Unable_to_open__S, $str123$_home_aldag_length_count_succeede );
      }
      final SubLObject out = stream;
      print_table( length_count_succeeded_table( run_id ), out );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values4 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_4 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 27029L)
  public static SubLObject nlp_db_metrics_corpora()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.copy_seq( $str124$SELECT_id__name__comment_FROM_cor ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      while ( NIL != sdbc.sqlrs_next( rs ))
      {
        result = ConsesLow.cons( ConsesLow.list( $kw125$ID, sdbc.sqlrs_get_object( rs, ONE_INTEGER ), $kw126$NAME, sdbc.sqlrs_get_object( rs, TWO_INTEGER ), $kw127$COMMENT, sdbc.sqlrs_get_object( rs, THREE_INTEGER ) ),
            result );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 27496L)
  public static SubLObject nlp_db_metrics_corpus_size(final SubLObject corpus_id)
  {
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str128$SELECT_COUNT_id__from_sentence_wh, new SubLObject[] { format_nil.format_nil_a_no_copy( corpus_id ), $str129$_
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 27738L)
  public static SubLObject nlp_db_metrics_runs(final SubLObject corpus_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, Sequences.cconcatenate( $str130$SELECT_id__type__comment__kb__rev, format_nil.format_nil_a_no_copy( corpus_id ) ), UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      while ( NIL != sdbc.sqlrs_next( rs ))
      {
        result = ConsesLow.cons( ConsesLow.list( new SubLObject[] { $kw125$ID, sdbc.sqlrs_get_object( rs, ONE_INTEGER ), $kw131$TYPE, sdbc.sqlrs_get_object( rs, TWO_INTEGER ), $kw127$COMMENT, sdbc.sqlrs_get_object( rs,
            THREE_INTEGER ), $kw132$KB, sdbc.sqlrs_get_object( rs, FOUR_INTEGER ), $kw133$REVISION, sdbc.sqlrs_get_object( rs, FIVE_INTEGER ), $kw134$START, sdbc.sqlrs_get_object( rs, SIX_INTEGER )
        } ), result );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 28362L)
  public static SubLObject nlp_db_metrics_add_corpus(SubLObject name, SubLObject comment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    comment = ( NIL != comment ) ? string_utilities.quote_string( postgresql_escape_string( comment ), $str135$_ ) : $sym136$NULL;
    name = ( NIL != comment ) ? string_utilities.quote_string( postgresql_escape_string( name ), $str135$_ ) : $sym136$NULL;
    SubLObject result = NIL;
    SubLObject stmt = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        stmt = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        stmt = connection;
      }
      if( NIL != sdbc.sdbc_error_p( stmt ) )
      {
        sdbc.sdbc_error_throw( stmt );
      }
      result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str137$INSERT_INTO_corpus_name__comment_, new SubLObject[] { format_nil.format_nil_a_no_copy( name ), $str138$__, format_nil.format_nil_a_no_copy(
          comment ), $str139$__
      } ) );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 28982L)
  public static SubLObject add_sentence_to_corpus(final SubLObject corpus_id, SubLObject sentence_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == nlp_db_metrics_sentence_in_corpusP( corpus_id, sentence_string ) )
    {
      sentence_string = string_utilities.quote_string( postgresql_escape_string( sentence_string ), $str135$_ );
      SubLObject result = NIL;
      SubLObject stmt = NIL;
      SubLObject connection = NIL;
      try
      {
        connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
          $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
          $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
        } ) );
        if( NIL != sdbc.sql_open_connection_p( connection ) )
        {
          stmt = sdbc.sqlc_create_statement( connection );
        }
        else
        {
          stmt = connection;
        }
        if( NIL != sdbc.sdbc_error_p( stmt ) )
        {
          sdbc.sdbc_error_throw( stmt );
        }
        result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str140$INSERT_INTO_sentence_corpus_id__c, new SubLObject[] { format_nil.format_nil_a_no_copy( corpus_id ), $str138$__, format_nil
            .format_nil_a_no_copy( sentence_string ), $str139$__
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != sdbc.sql_connection_p( connection ) )
          {
            sdbc.sqlc_close( connection );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 29564L)
  public static SubLObject nlp_db_metrics_sentence_in_corpusP(final SubLObject corpus_id, SubLObject sentence_string)
  {
    sentence_string = string_utilities.quote_string( postgresql_escape_string( sentence_string ), $str135$_ );
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str141$SELECT_id_from_sentence_WHERE_cor, new SubLObject[] { format_nil.format_nil_a_no_copy( corpus_id ), $str142$_AND_contents_, format_nil
        .format_nil_a_no_copy( sentence_string ), $str129$_
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 29932L)
  public static SubLObject avg_sentence_length_failed(final SubLObject run_id)
  {
    SubLObject lengths = NIL;
    SubLObject cdolist_list_var = link_metrics_failed_link_parse_sentences( run_id );
    SubLObject s = NIL;
    s = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lengths = ConsesLow.cons( Sequences.length( string_utilities.split_string( s, UNPROVIDED ) ), lengths );
      cdolist_list_var = cdolist_list_var.rest();
      s = cdolist_list_var.first();
    }
    return number_utilities.mean( lengths );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30160L)
  public static SubLObject median_sentence_length_failed(final SubLObject run_id)
  {
    SubLObject lengths = NIL;
    SubLObject cdolist_list_var = link_metrics_failed_link_parse_sentences( run_id );
    SubLObject s = NIL;
    s = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lengths = ConsesLow.cons( Sequences.length( string_utilities.split_string( s, UNPROVIDED ) ), lengths );
      cdolist_list_var = cdolist_list_var.rest();
      s = cdolist_list_var.first();
    }
    return number_utilities.median( lengths, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30387L)
  public static SubLObject avg_sentence_length_succeeded(final SubLObject run_id)
  {
    SubLObject lengths = NIL;
    SubLObject cdolist_list_var = link_metrics_succeeded_link_parse_sentences( run_id );
    SubLObject s = NIL;
    s = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lengths = ConsesLow.cons( Sequences.length( string_utilities.split_string( s, UNPROVIDED ) ), lengths );
      cdolist_list_var = cdolist_list_var.rest();
      s = cdolist_list_var.first();
    }
    return number_utilities.mean( lengths );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30615L)
  public static SubLObject median_sentence_length_succeeded(final SubLObject run_id)
  {
    SubLObject lengths = NIL;
    SubLObject cdolist_list_var = link_metrics_succeeded_link_parse_sentences( run_id );
    SubLObject s = NIL;
    s = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lengths = ConsesLow.cons( Sequences.length( string_utilities.split_string( s, UNPROVIDED ) ), lengths );
      cdolist_list_var = cdolist_list_var.rest();
      s = cdolist_list_var.first();
    }
    return number_utilities.median( lengths, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 30848L)
  public static SubLObject db_get_word_linkage(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    assert NIL != Types.stringp( sentence ) : sentence;
    assert NIL != sdbc.sql_statement_p( stmt ) : stmt;
    if( NIL != lexicon && !assertionsDisabledInClass && NIL == abstract_lexicon.abstract_lexicon_p( lexicon ) )
    {
      throw new AssertionError( lexicon );
    }
    final SubLObject ls = db_get_link_structure( sentence, stmt, lexicon );
    SubLObject tagged_sent = NIL;
    if( NIL != ls )
    {
      tagged_sent = linkage.words_to_sentence( linkage.ls_words( ls ) );
      pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), tagged_sent );
      linkage.auxify_sentence( tagged_sent );
      return word_linkage.new_word_linkage_from_link_structure( ls, tagged_sent, sentence, lexicon );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 31592L)
  public static SubLObject db_get_linkage(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    assert NIL != Types.stringp( sentence ) : sentence;
    assert NIL != sdbc.sql_statement_p( stmt ) : stmt;
    if( NIL != lexicon && !assertionsDisabledInClass && NIL == abstract_lexicon.abstract_lexicon_p( lexicon ) )
    {
      throw new AssertionError( lexicon );
    }
    final SubLObject ls = db_get_link_structure( sentence, stmt, lexicon );
    SubLObject tagged_sent = NIL;
    if( NIL != ls )
    {
      tagged_sent = linkage.words_to_sentence( linkage.ls_words( ls ) );
      pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), tagged_sent );
      linkage.auxify_sentence( tagged_sent );
      return linkage.new_linkage_from_link_structure( ls, tagged_sent, object.new_class_instance( $sym145$PARSE_TREE_CONTEXT ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 32350L)
  public static SubLObject insert_run(final SubLObject stmt, final SubLObject type, final SubLObject corpus, SubLObject comment)
  {
    comment = ( NIL != comment ) ? string_utilities.quote_string( postgresql_escape_string( comment ), $str135$_ ) : $sym136$NULL;
    final SubLObject corpus_id = get_corpus_id( stmt, corpus );
    final SubLObject timestamp = iso_8601_timestamp( UNPROVIDED );
    final SubLObject id = get_postgresql_nextval( stmt, $str146$run_id_seq );
    final SubLObject kb = control_vars.kb_loaded();
    final SubLObject revision = system_info.cyc_revision_string();
    final SubLObject result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str147$INSERT_INTO_run_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str138$__, format_nil
        .format_nil_a_no_copy( type ), $str138$__, format_nil.format_nil_a_no_copy( comment ), $str148$__, format_nil.format_nil_a_no_copy( kb ), $str149$____, format_nil.format_nil_a_no_copy( revision ), $str150$___,
      format_nil.format_nil_a_no_copy( corpus_id ), $str151$___, format_nil.format_nil_a_no_copy( timestamp ), $str152$__
    } ) );
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 33154L)
  public static SubLObject insert_raw_linkage(final SubLObject stmt, final SubLObject sentence, final SubLObject run_id, final SubLObject sentence_id, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start = NIL;
    SubLObject duration = NIL;
    SubLObject ls = NIL;
    SubLObject contents = NIL;
    SubLObject id = NIL;
    SubLObject result = NIL;
    start = iso_8601_timestamp( UNPROVIDED );
    final SubLObject time_var = Time.get_internal_real_time();
    ls = linkage.link_parse( sentence, linkage.$link_parse_options$.getDynamicValue( thread ), lexicon, UNPROVIDED ).first();
    duration = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    duration = Numbers.truncate( Numbers.multiply( duration, $int108$1000 ), UNPROVIDED );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      contents = ( NIL != ls ) ? string_utilities.quote_string( postgresql_escape_string( print_high.prin1_to_string( ConsesLow.list( linkage.ls_words( ls ), linkage.ls_links( ls ), linkage.ls_diagram( ls ), linkage
          .ls_tree( ls ) ) ) ), $str135$_ ) : $sym136$NULL;
      id = get_postgresql_nextval( stmt, $str153$raw_linkage_id_seq );
      result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str138$__, format_nil.format_nil_a_no_copy(
          run_id ), $str138$__, format_nil.format_nil_a_no_copy( sentence_id ), $str138$__, format_nil.format_nil_a_no_copy( contents ), $str151$___, format_nil.format_nil_a_no_copy( start ), $str150$___, format_nil
              .format_nil_a_no_copy( duration ), $str155$_
      } ) );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    return Values.values( ls, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 33998L)
  public static SubLObject insert_cached_raw_linkage(final SubLObject stmt, final SubLObject run_id, final SubLObject sentence_id, final SubLObject ls, final SubLObject start, final SubLObject duration)
  {
    final SubLObject contents = ( NIL != ls ) ? string_utilities.quote_string( postgresql_escape_string( print_high.prin1_to_string( ConsesLow.list( linkage.ls_words( ls ), linkage.ls_links( ls ), linkage.ls_diagram(
        ls ), linkage.ls_tree( ls ) ) ) ), $str135$_ ) : $sym136$NULL;
    final SubLObject id = get_postgresql_nextval( stmt, $str153$raw_linkage_id_seq );
    final SubLObject result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str154$INSERT_INTO_raw_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str138$__, format_nil
        .format_nil_a_no_copy( run_id ), $str138$__, format_nil.format_nil_a_no_copy( sentence_id ), $str138$__, format_nil.format_nil_a_no_copy( contents ), $str151$___, format_nil.format_nil_a_no_copy( start ),
      $str150$___, format_nil.format_nil_a_no_copy( duration ), $str155$_
    } ) );
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    return Values.values( ls, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 34600L)
  public static SubLObject insert_word_linkage(final SubLObject stmt, final SubLObject sentence, final SubLObject raw_linkage, final SubLObject raw_linkage_id)
  {
    SubLObject tagged_sent = NIL;
    if( NIL != raw_linkage )
    {
      tagged_sent = linkage.words_to_sentence( linkage.ls_words( raw_linkage ) );
      pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), tagged_sent );
      linkage.auxify_sentence( tagged_sent );
    }
    final SubLObject v_word_linkage = ( NIL != raw_linkage ) ? word_linkage.new_word_linkage_from_link_structure( raw_linkage, tagged_sent, sentence, T ) : NIL;
    final SubLObject word_count = ( NIL != v_word_linkage ) ? methods.funcall_instance_method_with_0_args( v_word_linkage, $sym156$LENGTH ) : $sym136$NULL;
    final SubLObject xml = ( NIL != v_word_linkage ) ? string_utilities.quote_string( postgresql_escape_string( methods.funcall_instance_method_with_0_args( v_word_linkage, $sym157$XML ) ), $str135$_ ) : $sym136$NULL;
    final SubLObject id = get_postgresql_nextval( stmt, $str158$word_linkage_id_seq );
    final SubLObject result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str159$INSERT_INTO_word_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str138$__, format_nil
        .format_nil_a_no_copy( xml ), $str138$__, format_nil.format_nil_a_no_copy( raw_linkage_id ), $str138$__, format_nil.format_nil_a_no_copy( word_count ), $str155$_
    } ) );
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 35506L)
  public static SubLObject insert_full_linkage(final SubLObject stmt, final SubLObject raw_linkage, final SubLObject raw_linkage_id, final SubLObject lexicon)
  {
    SubLObject tagged_sent = NIL;
    if( NIL != raw_linkage )
    {
      tagged_sent = linkage.words_to_sentence( linkage.ls_words( raw_linkage ) );
      pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), tagged_sent );
      linkage.auxify_sentence( tagged_sent );
    }
    final SubLObject v_linkage = ( NIL != raw_linkage ) ? linkage.new_linkage_from_link_structure( raw_linkage, tagged_sent, object.new_class_instance( $sym145$PARSE_TREE_CONTEXT ) ) : NIL;
    final SubLObject word_count = ( NIL != v_linkage ) ? methods.funcall_instance_method_with_0_args( v_linkage, $sym156$LENGTH ) : $sym136$NULL;
    final SubLObject xml = ( NIL != v_linkage ) ? string_utilities.quote_string( postgresql_escape_string( methods.funcall_instance_method_with_0_args( v_linkage, $sym157$XML ) ), $str135$_ ) : $sym136$NULL;
    final SubLObject id = get_postgresql_nextval( stmt, $str160$full_linkage_id_seq );
    SubLObject lexified_count = NIL;
    SubLObject result = NIL;
    if( NIL != v_linkage )
    {
      methods.funcall_instance_method_with_1_args( v_linkage, $sym161$LEXIFY, lexicon );
      lexified_count = linkage_lexified_count( v_linkage, $sym162$LINK_WORD_P );
    }
    if( NIL == lexified_count )
    {
      lexified_count = $sym136$NULL;
    }
    result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str163$INSERT_INTO_full_linkage_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str138$__, format_nil.format_nil_a_no_copy( xml ),
      $str138$__, format_nil.format_nil_a_no_copy( raw_linkage_id ), $str138$__, format_nil.format_nil_a_no_copy( word_count ), $str138$__, format_nil.format_nil_a_no_copy( lexified_count ), $str155$_
    } ) );
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    return Values.values( v_linkage, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 36668L)
  public static SubLObject insert_link_cyclification(final SubLObject stmt, final SubLObject v_linkage, final SubLObject linkage_id, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    SubLObject timed_outP = NIL;
    SubLObject start = $sym136$NULL;
    SubLObject duration = $sym136$NULL;
    if( NIL != v_linkage )
    {
      start = string_utilities.quote_string( iso_8601_timestamp( UNPROVIDED ), $str135$_ );
      final SubLObject time_var = Time.get_internal_real_time();
      final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
      try
      {
        thread.throwStack.push( tag );
        final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
        try
        {
          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
          SubLObject timer = NIL;
          try
          {
            final SubLObject _prev_bind_0_$30 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
              timer = subl_macro_promotions.with_timeout_start_timer( $link_metrics_cyclification_timeout$.getDynamicValue( thread ), tag );
              cycls = methods.funcall_instance_method_with_1_args( v_linkage, $sym164$CYCLIFY, ConsesLow.list( $kw165$LEXICON, lexicon ) );
            }
            finally
            {
              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$30, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              subl_macro_promotions.with_timeout_stop_timer( timer );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
            }
          }
        }
        finally
        {
          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
      }
      finally
      {
        thread.throwStack.pop();
      }
      duration = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      duration = Numbers.truncate( Numbers.multiply( duration, $int108$1000 ), UNPROVIDED );
      if( NIL != timed_outP )
      {
        Errors.warn( $str166$timed_out__ );
      }
    }
    final SubLObject id = get_postgresql_nextval( stmt, $str167$link_cyclification_id_seq );
    SubLObject result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str168$INSERT_INTO_link_cyclification_VA, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str138$__, format_nil
        .format_nil_a_no_copy( linkage_id ), $str138$__, format_nil.format_nil_a_no_copy( start ), $str138$__, format_nil.format_nil_a_no_copy( duration ), $str155$_
    } ) );
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    SubLObject cdolist_list_var = cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject xml = postgresql_escape_string( cycl_to_xml( cycl ) );
      result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str169$INSERT_INTO_cyclifications_VALUES, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str151$___, format_nil.format_nil_a_no_copy(
          xml ), $str152$__
      } ) );
      if( NIL != sdbc.sdbc_error_p( result ) )
      {
        sdbc.sdbc_error_throw( result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return Values.values( cycls, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 37711L)
  public static SubLObject insert_ebmt_cyclification(final SubLObject stmt, final SubLObject v_linkage, final SubLObject linkage_id, final SubLObject lexicon, final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    SubLObject justifications = NIL;
    SubLObject weights = NIL;
    SubLObject start = $sym136$NULL;
    SubLObject duration = $sym136$NULL;
    if( NIL != v_linkage )
    {
      start = string_utilities.quote_string( iso_8601_timestamp( UNPROVIDED ), $str135$_ );
      final SubLObject time_var = Time.get_internal_real_time();
      thread.resetMultipleValues();
      final SubLObject cycls_$32 = ebmt_template_parser.ebmt_parse_linkage( v_linkage, sentence, lexicon, $const170$InferencePSC );
      final SubLObject justifications_$33 = thread.secondMultipleValue();
      final SubLObject weights_$34 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      cycls = cycls_$32;
      justifications = justifications_$33;
      weights = weights_$34;
      duration = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      duration = Numbers.truncate( Numbers.multiply( duration, $int108$1000 ), UNPROVIDED );
    }
    final SubLObject cyclf_id = get_postgresql_nextval( stmt, $str167$link_cyclification_id_seq );
    SubLObject result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str168$INSERT_INTO_link_cyclification_VA, new SubLObject[] { format_nil.format_nil_a_no_copy( cyclf_id ), $str138$__, format_nil
        .format_nil_a_no_copy( linkage_id ), $str138$__, format_nil.format_nil_a_no_copy( start ), $str138$__, format_nil.format_nil_a_no_copy( duration ), $str155$_
    } ) );
    if( NIL != sdbc.sdbc_error_p( result ) )
    {
      sdbc.sdbc_error_throw( result );
    }
    SubLObject cycl = NIL;
    SubLObject cycl_$35 = NIL;
    SubLObject j = NIL;
    SubLObject j_$36 = NIL;
    cycl = cycls;
    cycl_$35 = cycl.first();
    j = justifications;
    j_$36 = j.first();
    while ( NIL != j || NIL != cycl)
    {
      final SubLObject xml = postgresql_escape_string( cycl_to_xml( cycl_$35 ) );
      final SubLObject justification = postgresql_escape_string( print_high.princ_to_string( j_$36 ) );
      final SubLObject cid = get_postgresql_nextval( stmt, $str171$cyclifications_id_seq );
      result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str169$INSERT_INTO_cyclifications_VALUES, new SubLObject[] { format_nil.format_nil_a_no_copy( cyclf_id ), $str151$___, format_nil
          .format_nil_a_no_copy( xml ), $str150$___, format_nil.format_nil_a_no_copy( cid ), $str155$_
      } ) );
      if( NIL != sdbc.sdbc_error_p( result ) )
      {
        sdbc.sdbc_error_throw( result );
      }
      result = sdbc.sqls_execute_update( stmt, Sequences.cconcatenate( $str172$INSERT_INTO_justification_VALUES_, new SubLObject[] { format_nil.format_nil_a_no_copy( cid ), $str151$___, format_nil.format_nil_a_no_copy(
          justification ), $str152$__
      } ) );
      if( NIL != sdbc.sdbc_error_p( result ) )
      {
        sdbc.sdbc_error_throw( result );
      }
      cycl = cycl.rest();
      cycl_$35 = cycl.first();
      j = j.rest();
      j_$36 = j.first();
    }
    return Values.values( cycls, cyclf_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 39146L)
  public static SubLObject insert_run_statistics(final SubLObject stmt, final SubLObject run_id, final SubLObject lex_verb_count, final SubLObject lex_noun_count, final SubLObject lex_adj_count,
      final SubLObject lex_adv_count, final SubLObject verb_interps_counts, final SubLObject noun_interps_counts, final SubLObject adj_interps_counts, final SubLObject adv_interps_counts)
  {
    if( NIL != lex_verb_count && NIL != lex_noun_count && NIL != lex_adj_count && NIL != lex_adv_count && NIL != verb_interps_counts && NIL != noun_interps_counts && NIL != adj_interps_counts
        && NIL != adv_interps_counts )
    {
      final SubLObject result = sdbc.sqls_execute_update( stmt, PrintLow.format( NIL, $str173$INSERT_INTO_run_statistics_VALUES, new SubLObject[] { run_id, lex_verb_count, lex_noun_count, lex_adj_count, lex_adv_count,
        number_utilities.mean( verb_interps_counts ), number_utilities.median( verb_interps_counts, UNPROVIDED, UNPROVIDED ), number_utilities.mean( noun_interps_counts ), number_utilities.median( noun_interps_counts,
            UNPROVIDED, UNPROVIDED ), number_utilities.mean( adj_interps_counts ), number_utilities.median( adj_interps_counts, UNPROVIDED, UNPROVIDED ), number_utilities.mean( adv_interps_counts ), number_utilities
                .median( adv_interps_counts, UNPROVIDED, UNPROVIDED )
      } ) );
      if( NIL != sdbc.sdbc_error_p( result ) )
      {
        sdbc.sdbc_error_throw( result );
      }
      return run_id;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 40125L)
  public static SubLObject db_get_link_structure(final SubLObject sentence, final SubLObject stmt, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLObject rs = sdbc.sqls_execute_query( stmt, Sequences.cconcatenate( $str174$SELECT_raw_linkage_contents______, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( sentence ) ),
      $str175$________________ORDER_BY_raw_link
    } ), UNPROVIDED );
    if( NIL != sdbc.sdbc_error_p( rs ) )
    {
      sdbc.sdbc_error_throw( rs );
    }
    if( NIL != sdbc.sqlrs_next( rs ) && NIL != sdbc.sqlrs_get_object( rs, ONE_INTEGER ) )
    {
      return linkage.new_link_structures( reader.read_from_string( sdbc.sqlrs_get_object( rs, ONE_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), lexicon, sentence, T ).first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41063L)
  public static SubLObject link_metrics_single_sql_value(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( query ) : query;
    SubLObject result = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( $link_metric_db$.getDynamicValue( thread ), $link_metric_user$.getDynamicValue( thread ), $link_metric_password$.getDynamicValue( thread ), ConsesLow.list( new SubLObject[] {
        $kw54$DBMS_SERVER, $link_metric_dbms_server$.getDynamicValue( thread ), $kw55$PORT, sdbc.$sql_port$.getGlobalValue(), $kw56$SUBPROTOCOL, $link_metric_subprotocol$.getDynamicValue( thread ), $kw57$PROXY_SERVER,
        $link_metric_proxy_server$.getDynamicValue( thread ), $kw58$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue()
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, query, UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sdbc_error_p( rs ) )
      {
        sdbc.sdbc_error_throw( rs );
      }
      if( NIL != sdbc.sqlrs_next( rs ) )
      {
        result = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != sdbc.sql_null_p( result ) ) ? NIL : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41389L)
  public static SubLObject link_metrics_run_value(final SubLObject run_id, final SubLObject column)
  {
    return link_metrics_single_sql_value( Sequences.cconcatenate( $str176$SELECT_, new SubLObject[] { format_nil.format_nil_a_no_copy( column ), $str177$_________FROM_run_statistics_____, format_nil.format_nil_a_no_copy(
        run_id )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41594L)
  public static SubLObject linkage_lexified_count(final SubLObject v_linkage, final SubLObject type)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject word = NIL;
    final SubLObject vector_var = instances.get_slot( v_linkage, $sym178$WORDS );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject w;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      w = ( word = Vectors.aref( vector_var, element_num ) );
      if( NIL != Functions.funcall( type, word ) && NIL != methods.funcall_instance_method_with_0_args( word, $sym179$GET_LEXES ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 41880L)
  public static SubLObject linkage_interps_count(final SubLObject v_linkage, final SubLObject type)
  {
    SubLObject counts = NIL;
    SubLObject word = NIL;
    final SubLObject vector_var = instances.get_slot( v_linkage, $sym178$WORDS );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject w;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      w = ( word = Vectors.aref( vector_var, element_num ) );
      if( NIL != Functions.funcall( type, word ) )
      {
        counts = ConsesLow.cons( Sequences.length( methods.funcall_instance_method_with_0_args( word, $sym179$GET_LEXES ) ), counts );
      }
    }
    return counts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 42176L)
  public static SubLObject postgresql_escape_string(final SubLObject string)
  {
    return string_utilities.string_substitute( $str180$__, $str135$_, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 42354L)
  public static SubLObject get_corpus_id(final SubLObject stmt, final SubLObject corpus)
  {
    final SubLObject rs = sdbc.sqls_execute_query( stmt, Sequences.cconcatenate( $str181$SELECT_id_FROM_corpus_WHERE_name_, new SubLObject[] { format_nil.format_nil_a_no_copy( postgresql_escape_string( corpus ) ),
      $str135$_
    } ), UNPROVIDED );
    if( NIL != sdbc.sdbc_error_p( rs ) )
    {
      sdbc.sdbc_error_throw( rs );
    }
    if( NIL == sdbc.sqlrs_next( rs ) )
    {
      Errors.error( $str182$Can_t_determine_id_for_unknown_co, corpus );
    }
    return sdbc.sqlrs_get_object( rs, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 42729L)
  public static SubLObject get_postgresql_nextval(final SubLObject stmt, final SubLObject sequence)
  {
    final SubLObject rs = sdbc.sqls_execute_query( stmt, Sequences.cconcatenate( $str183$SELECT_nextval__, new SubLObject[] { format_nil.format_nil_a_no_copy( sequence ), $str152$__
    } ), UNPROVIDED );
    SubLObject nextval = NIL;
    if( NIL != sdbc.sdbc_error_p( rs ) )
    {
      sdbc.sdbc_error_throw( rs );
    }
    sdbc.sqlrs_next( rs );
    nextval = sdbc.sqlrs_get_object( rs, ONE_INTEGER );
    return nextval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 43090L)
  public static SubLObject iso_8601_timestamp(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == universal_time )
    {
      universal_time = Time.get_universal_time();
    }
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject date = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return PrintLow.format( NIL, $str184$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[] { year, month, date, hour, minute, second
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nlp-db-metrics.lisp", position = 43515L)
  public static SubLObject cycl_to_xml(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject xml = NIL;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( NIL, thread );
      try
      {
        xml_vars.$xml_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        cycml.cycml_serialize_term( cycl );
        xml = streams_high.get_output_stream_string( xml_vars.$xml_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return xml;
  }

  public static SubLObject declare_nlp_db_metrics_file()
  {
    SubLFiles.declareMacro( me, "with_link_metrics_statement", "WITH-LINK-METRICS-STATEMENT" );
    SubLFiles.declareMacro( me, "with_link_metrics_result_set", "WITH-LINK-METRICS-RESULT-SET" );
    SubLFiles.declareMacro( me, "do_link_metrics_result_set", "DO-LINK-METRICS-RESULT-SET" );
    SubLFiles.declareMacro( me, "do_link_metrics_corpus", "DO-LINK-METRICS-CORPUS" );
    SubLFiles.declareMacro( me, "do_link_metrics_link_structures", "DO-LINK-METRICS-LINK-STRUCTURES" );
    SubLFiles.declareMacro( me, "update_lexicon_statistics", "UPDATE-LEXICON-STATISTICS" );
    SubLFiles.declareFunction( me, "db_raw_linkage_run", "DB-RAW-LINKAGE-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "db_word_linkage_run", "DB-WORD-LINKAGE-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "db_full_linkage_run", "DB-FULL-LINKAGE-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "db_link_cyclification_run", "DB-LINK-CYCLIFICATION-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "db_ebmt_cyclification_run", "DB-EBMT-CYCLIFICATION-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "db_cached_ebmt_cyclification_run", "DB-CACHED-EBMT-CYCLIFICATION-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "db_get_run_corpus", "DB-GET-RUN-CORPUS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_delete_run", "LINK-METRICS-DELETE-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_sentence_count", "LINK-METRICS-SENTENCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_avg_interpretation_count", "LINK-METRICS-AVG-INTERPRETATION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_median_interpretation_count", "LINK-METRICS-MEDIAN-INTERPRETATION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_no_interpretation_count", "LINK-METRICS-NO-INTERPRETATION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_failed_link_parse_sentences", "LINK-METRICS-FAILED-LINK-PARSE-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_succeeded_link_parse_sentences", "LINK-METRICS-SUCCEEDED-LINK-PARSE-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_avg_lexified_word_count", "LINK-METRICS-AVG-LEXIFIED-WORD-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_median_lexified_word_count", "LINK-METRICS-MEDIAN-LEXIFIED-WORD-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_raw_linkage_diffs", "LINK-METRICS-RAW-LINKAGE-DIFFS", 2, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_lexified_verb_count", "LINK-METRICS-LEXIFIED-VERB-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_lexified_noun_count", "LINK-METRICS-LEXIFIED-NOUN-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_lexified_adj_count", "LINK-METRICS-LEXIFIED-ADJ-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_lexified_adv_count", "LINK-METRICS-LEXIFIED-ADV-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_mean_verb_interps", "LINK-METRICS-MEAN-VERB-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_mean_noun_interps", "LINK-METRICS-MEAN-NOUN-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_mean_adj_interps", "LINK-METRICS-MEAN-ADJ-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_mean_adv_interps", "LINK-METRICS-MEAN-ADV-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_median_verb_interps", "LINK-METRICS-MEDIAN-VERB-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_median_noun_interps", "LINK-METRICS-MEDIAN-NOUN-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_median_adj_interps", "LINK-METRICS-MEDIAN-ADJ-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_median_adv_interps", "LINK-METRICS-MEDIAN-ADV-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "time_count_failed_table", "TIME-COUNT-FAILED-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "time_count_succeeded_table", "TIME-COUNT-SUCCEEDED-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "length_count_failed_table", "LENGTH-COUNT-FAILED-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "length_count_succeeded_table", "LENGTH-COUNT-SUCCEEDED-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "print_table", "PRINT-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_tables", "GENERATE-TABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "nlp_db_metrics_corpora", "NLP-DB-METRICS-CORPORA", 0, 0, false );
    SubLFiles.declareFunction( me, "nlp_db_metrics_corpus_size", "NLP-DB-METRICS-CORPUS-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "nlp_db_metrics_runs", "NLP-DB-METRICS-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "nlp_db_metrics_add_corpus", "NLP-DB-METRICS-ADD-CORPUS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_sentence_to_corpus", "ADD-SENTENCE-TO-CORPUS", 2, 0, false );
    SubLFiles.declareFunction( me, "nlp_db_metrics_sentence_in_corpusP", "NLP-DB-METRICS-SENTENCE-IN-CORPUS?", 2, 0, false );
    SubLFiles.declareFunction( me, "avg_sentence_length_failed", "AVG-SENTENCE-LENGTH-FAILED", 1, 0, false );
    SubLFiles.declareFunction( me, "median_sentence_length_failed", "MEDIAN-SENTENCE-LENGTH-FAILED", 1, 0, false );
    SubLFiles.declareFunction( me, "avg_sentence_length_succeeded", "AVG-SENTENCE-LENGTH-SUCCEEDED", 1, 0, false );
    SubLFiles.declareFunction( me, "median_sentence_length_succeeded", "MEDIAN-SENTENCE-LENGTH-SUCCEEDED", 1, 0, false );
    SubLFiles.declareFunction( me, "db_get_word_linkage", "DB-GET-WORD-LINKAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "db_get_linkage", "DB-GET-LINKAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "insert_run", "INSERT-RUN", 4, 0, false );
    SubLFiles.declareFunction( me, "insert_raw_linkage", "INSERT-RAW-LINKAGE", 5, 0, false );
    SubLFiles.declareFunction( me, "insert_cached_raw_linkage", "INSERT-CACHED-RAW-LINKAGE", 6, 0, false );
    SubLFiles.declareFunction( me, "insert_word_linkage", "INSERT-WORD-LINKAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "insert_full_linkage", "INSERT-FULL-LINKAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "insert_link_cyclification", "INSERT-LINK-CYCLIFICATION", 4, 0, false );
    SubLFiles.declareFunction( me, "insert_ebmt_cyclification", "INSERT-EBMT-CYCLIFICATION", 5, 0, false );
    SubLFiles.declareFunction( me, "insert_run_statistics", "INSERT-RUN-STATISTICS", 10, 0, false );
    SubLFiles.declareFunction( me, "db_get_link_structure", "DB-GET-LINK-STRUCTURE", 2, 1, false );
    SubLFiles.declareFunction( me, "link_metrics_single_sql_value", "LINK-METRICS-SINGLE-SQL-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "link_metrics_run_value", "LINK-METRICS-RUN-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "linkage_lexified_count", "LINKAGE-LEXIFIED-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "linkage_interps_count", "LINKAGE-INTERPS-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "postgresql_escape_string", "POSTGRESQL-ESCAPE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_corpus_id", "GET-CORPUS-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_postgresql_nextval", "GET-POSTGRESQL-NEXTVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "iso_8601_timestamp", "ISO-8601-TIMESTAMP", 0, 1, false );
    SubLFiles.declareFunction( me, "cycl_to_xml", "CYCL-TO-XML", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_nlp_db_metrics_file()
  {
    $link_metric_db$ = SubLFiles.defparameter( "*LINK-METRIC-DB*", $str0$nlp_metrics );
    $link_metric_user$ = SubLFiles.defparameter( "*LINK-METRIC-USER*", $str1$postgres );
    $link_metric_dbms_server$ = SubLFiles.defparameter( "*LINK-METRIC-DBMS-SERVER*", $str2$cyc11_cyc_com );
    $link_metric_password$ = SubLFiles.defparameter( "*LINK-METRIC-PASSWORD*", $str3$ );
    $link_metric_subprotocol$ = SubLFiles.defparameter( "*LINK-METRIC-SUBPROTOCOL*", $str4$postgresql );
    $link_metric_proxy_server$ = SubLFiles.defparameter( "*LINK-METRIC-PROXY-SERVER*", $str5$billie_cyc_com );
    $link_metrics_cyclification_timeout$ = SubLFiles.defparameter( "*LINK-METRICS-CYCLIFICATION-TIMEOUT*", Numbers.multiply( FIVE_INTEGER, $int6$60 ) );
    return NIL;
  }

  public static SubLObject setup_nlp_db_metrics_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nlp_db_metrics_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nlp_db_metrics_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nlp_db_metrics_file();
  }
  static
  {
    me = new nlp_db_metrics();
    $link_metric_db$ = null;
    $link_metric_user$ = null;
    $link_metric_dbms_server$ = null;
    $link_metric_password$ = null;
    $link_metric_subprotocol$ = null;
    $link_metric_proxy_server$ = null;
    $link_metrics_cyclification_timeout$ = null;
    $str0$nlp_metrics = makeString( "nlp_metrics" );
    $str1$postgres = makeString( "postgres" );
    $str2$cyc11_cyc_com = makeString( "cyc11.cyc.com" );
    $str3$ = makeString( "" );
    $str4$postgresql = makeString( "postgresql" );
    $str5$billie_cyc_com = makeString( "billie.cyc.com" );
    $int6$60 = makeInteger( 60 );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "STMT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym8$WITH_SQL_STATEMENT = makeSymbol( "WITH-SQL-STATEMENT" );
    $list9 = ConsesLow.list( new SubLObject[] { makeSymbol( "*LINK-METRIC-DB*" ), makeSymbol( "*LINK-METRIC-USER*" ), makeSymbol( "*LINK-METRIC-PASSWORD*" ), makeKeyword( "DBMS-SERVER" ), makeSymbol(
        "*LINK-METRIC-DBMS-SERVER*" ), makeKeyword( "SUBPROTOCOL" ), makeSymbol( "*LINK-METRIC-SUBPROTOCOL*" ), makeKeyword( "PROXY-SERVER" ), makeSymbol( "*LINK-METRIC-PROXY-SERVER*" )
    } );
    $sym10$PWHEN = makeSymbol( "PWHEN" );
    $sym11$SDBC_ERROR_P = makeSymbol( "SDBC-ERROR-P" );
    $sym12$SDBC_ERROR_THROW = makeSymbol( "SDBC-ERROR-THROW" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "RS" ), makeSymbol( "QUERY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym14$WITH_SQL_RESULT_SET = makeSymbol( "WITH-SQL-RESULT-SET" );
    $sym15$WITH_LINK_METRICS_RESULT_SET = makeSymbol( "WITH-LINK-METRICS-RESULT-SET" );
    $sym16$SQL_RESULT_SET_P = makeSymbol( "SQL-RESULT-SET-P" );
    $sym17$WHILE = makeSymbol( "WHILE" );
    $sym18$SQLRS_NEXT = makeSymbol( "SQLRS-NEXT" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE-ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "CORPUS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym20$CLET = makeSymbol( "CLET" );
    $sym21$DO_LINK_METRICS_RESULT_SET = makeSymbol( "DO-LINK-METRICS-RESULT-SET" );
    $sym22$RS = makeSymbol( "RS" );
    $sym23$FORMAT_NIL = makeSymbol( "FORMAT-NIL" );
    $str24$SELECT_sentence_id__sentence_cont = makeString(
        "SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = '~a'\n                         AND sentence.corpus_id = corpus.id" );
    $sym25$POSTGRESQL_ESCAPE_STRING = makeSymbol( "POSTGRESQL-ESCAPE-STRING" );
    $sym26$CSETQ = makeSymbol( "CSETQ" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), ONE_INTEGER ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), TWO_INTEGER ) );
    $list29 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "LINKAGE-ID" ), makeSymbol( "LS" ), makeSymbol( "SENTENCE-ID" ), makeSymbol( "SENTENCE" ), makeSymbol( "START" ), makeSymbol( "DURATION" ),
      makeSymbol( "RUN-ID" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LEXICON" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str30$SELECT_raw_linkage_id__raw_linkag = makeString(
        "SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = ~a\n                         AND raw_linkage.sentence_id = sentence.id" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), THREE_INTEGER ) );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), FOUR_INTEGER ) );
    $sym33$FIF = makeSymbol( "FIF" );
    $list34 = ConsesLow.list( makeSymbol( "SQL-NULL-P" ), ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), TWO_INTEGER ) );
    $sym35$FIRST = makeSymbol( "FIRST" );
    $sym36$NEW_LINK_STRUCTURES = makeSymbol( "NEW-LINK-STRUCTURES" );
    $list37 = ConsesLow.list( makeSymbol( "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), TWO_INTEGER ) );
    $list38 = ConsesLow.list( T );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), FIVE_INTEGER ) );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQLRS-GET-OBJECT" ), makeSymbol( "RS" ), SIX_INTEGER ) );
    $list41 = ConsesLow.list( new SubLObject[] { makeSymbol( "LINKAGE" ), makeSymbol( "LEX-VERB-COUNT" ), makeSymbol( "LEX-NOUN-COUNT" ), makeSymbol( "LEX-ADJ-COUNT" ), makeSymbol( "LEX-ADV-COUNT" ), makeSymbol(
        "VERB-INTERPS-COUNTS" ), makeSymbol( "NOUN-INTERPS-COUNTS" ), makeSymbol( "ADJ-INTERPS-COUNTS" ), makeSymbol( "ADV-INTERPS-COUNTS" )
    } );
    $sym42$PROGN = makeSymbol( "PROGN" );
    $sym43$CINC = makeSymbol( "CINC" );
    $sym44$LINKAGE_LEXIFIED_COUNT = makeSymbol( "LINKAGE-LEXIFIED-COUNT" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERB-LINK-WORD-P" ) ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOUN-LINK-WORD-P" ) ) );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADJECTIVE-LINK-WORD-P" ) ) );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADVERB-LINK-WORD-P" ) ) );
    $sym49$CDOLIST = makeSymbol( "CDOLIST" );
    $sym50$COUNT = makeSymbol( "COUNT" );
    $sym51$LINKAGE_INTERPS_COUNT = makeSymbol( "LINKAGE-INTERPS-COUNT" );
    $sym52$CPUSH = makeSymbol( "CPUSH" );
    $sym53$STRINGP = makeSymbol( "STRINGP" );
    $kw54$DBMS_SERVER = makeKeyword( "DBMS-SERVER" );
    $kw55$PORT = makeKeyword( "PORT" );
    $kw56$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
    $kw57$PROXY_SERVER = makeKeyword( "PROXY-SERVER" );
    $kw58$TIMEOUT = makeKeyword( "TIMEOUT" );
    $str59$SELECT_sentence_id__sentence_cont = makeString( "SELECT sentence.id, sentence.contents \n                         FROM sentence, corpus\n                         WHERE corpus.name = '" );
    $str60$___________________________AND_se = makeString( "'\n                         AND sentence.corpus_id = corpus.id" );
    $str61$___a___a___a__ = makeString( "~%~a, ~a: ~a~%" );
    $sym62$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym63$CYCLIFIER_LEXICON_W_O_FABRICATION = makeSymbol( "CYCLIFIER-LEXICON-W/O-FABRICATION" );
    $kw64$THROW = makeKeyword( "THROW" );
    $kw65$RETURN = makeKeyword( "RETURN" );
    $sym66$VERB_LINK_WORD_P = makeSymbol( "VERB-LINK-WORD-P" );
    $sym67$NOUN_LINK_WORD_P = makeSymbol( "NOUN-LINK-WORD-P" );
    $sym68$ADJECTIVE_LINK_WORD_P = makeSymbol( "ADJECTIVE-LINK-WORD-P" );
    $sym69$ADVERB_LINK_WORD_P = makeSymbol( "ADVERB-LINK-WORD-P" );
    $sym70$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $str71$SELECT_raw_linkage_id__raw_linkag = makeString(
        "SELECT raw_linkage.id, raw_linkage.contents, sentence.id, sentence.contents, raw_linkage.start, raw_linkage.duration\n                         FROM sentence, raw_linkage\n                         WHERE raw_linkage.run_id = " );
    $str72$__________________________AND_raw = makeString( "\n                         AND raw_linkage.sentence_id = sentence.id" );
    $str73$SELECT_corpus_name________FROM_ru = makeString( "SELECT corpus.name\n       FROM run, corpus\n       WHERE run.id = " );
    $str74$________AND_run_corpus_id___corpu = makeString( "\n       AND run.corpus_id = corpus.id" );
    $str75$DELETE_FROM_justification________ = makeString(
        "DELETE FROM justification\n           WHERE justification.cyclf_id = cyclifications.id\n           AND cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str76$DELETE_FROM_cyclifications_______ = makeString(
        "DELETE FROM cyclifications\n           WHERE cyclifications.link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str77$DELETE_FROM_link_cyclification___ = makeString(
        "DELETE FROM link_cyclification\n           WHERE link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str78$DELETE_FROM_full_linkage_________ = makeString( "DELETE FROM full_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str79$DELETE_FROM_word_linkage_________ = makeString( "DELETE FROM word_linkage\n           WHERE word_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str80$DELETE_FROM_raw_linkage__________ = makeString( "DELETE FROM raw_linkage\n           WHERE raw_linkage.run_id = " );
    $str81$DELETE_FROM_run_statistics_______ = makeString( "DELETE FROM run_statistics\n           WHERE run_id = " );
    $str82$DELETE_FROM_run____________WHERE_ = makeString( "DELETE FROM run\n           WHERE run.id = " );
    $str83$SELECT_count_sentence_id_________ = makeString( "SELECT count(sentence_id)\n       FROM raw_linkage\n       WHERE run_id = " );
    $str84$SELECT_link_cyclification_id_____ = makeString(
        "SELECT link_cyclification.id, \n                  COUNT(xml) AS cycl_counts\n           FROM link_cyclification, cyclifications\n           WHERE link_cyclf_id = link_cyclification.id\n           AND link_cyclification.linkage_id = full_linkage.id\n           AND full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str85$____________GROUP_BY_link_cyclifi = makeString( "\n           GROUP BY link_cyclification.id" );
    $str86$SELECT_COUNT_link_cyclification_i = makeString(
        "SELECT COUNT(link_cyclification.id)\n       FROM link_cyclification\n       WHERE link_cyclification.linkage_id = full_linkage.id\n       AND full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = " );
    $str87$________AND_NOT_EXISTS___________ = makeString(
        "\n       AND NOT EXISTS\n          (SELECT link_cyclf_id\n           FROM cyclifications\n           WHERE link_cyclification.id = cyclifications.link_cyclf_id)" );
    $str88$SELECT_sentence_contents_________ = makeString(
        "SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NULL\n           AND sentence_id = sentence.id\n           AND run_id = " );
    $str89$SELECT_sentence_contents_________ = makeString(
        "SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents IS NOT NULL\n           AND sentence_id = sentence.id\n           AND run_id = " );
    $str90$SELECT_AVG_lexified_count________ = makeString(
        "SELECT AVG(lexified_count)\n       FROM full_linkage, raw_linkage\n       WHERE full_linkage.raw_linkage_id = raw_linkage.id\n       AND raw_linkage.run_id = " );
    $str91$SELECT_lexified_count____________ = makeString(
        "SELECT lexified_count\n           FROM full_linkage, raw_linkage\n           WHERE full_linkage.raw_linkage_id = raw_linkage.id\n           AND raw_linkage.run_id = " );
    $str92$SELECT_sentence_contents__raw_lin = makeString(
        "SELECT sentence.contents, raw_linkage1.contents, raw_linkage2.contents\n           FROM sentence,\n                raw_linkage AS raw_linkage1,\n                raw_linkage AS raw_linkage2\n           WHERE raw_linkage1.run_id = " );
    $str93$____________AND_raw_linkage2_run_ = makeString( "\n           AND raw_linkage2.run_id = " );
    $str94$____________AND_raw_linkage1_sent = makeString(
        "\n           AND raw_linkage1.sentence_id = raw_linkage2.sentence_id\n           AND raw_linkage1.sentence_id = sentence.id\n           AND raw_linkage1.contents <> raw_linkage2.contents" );
    $str95$_a____a____a____a____a___________ = makeString( "~a~%=~a=~%~a~%=~a=~%~a~%=============================================~%" );
    $str96$lex_verb_count = makeString( "lex_verb_count" );
    $str97$lex_noun_count = makeString( "lex_noun_count" );
    $str98$lex_adj_count = makeString( "lex_adj_count" );
    $str99$lex_adv_count = makeString( "lex_adv_count" );
    $str100$mean_verb_lexes = makeString( "mean_verb_lexes" );
    $str101$mean_noun_lexes = makeString( "mean_noun_lexes" );
    $str102$mean_adj_lexes = makeString( "mean_adj_lexes" );
    $str103$mean_adv_lexes = makeString( "mean_adv_lexes" );
    $str104$med_verb_lexes = makeString( "med_verb_lexes" );
    $str105$med_noun_lexes = makeString( "med_noun_lexes" );
    $str106$med_adj_lexes = makeString( "med_adj_lexes" );
    $str107$med_adv_lexes = makeString( "med_adv_lexes" );
    $int108$1000 = makeInteger( 1000 );
    $int109$1024 = makeInteger( 1024 );
    $str110$SELECT_duration_____________FROM_ = makeString( "SELECT duration \n           FROM raw_linkage\n           WHERE contents is NULL\n           AND run_id = " );
    $sym111$_ = makeSymbol( "<" );
    $sym112$CAR = makeSymbol( "CAR" );
    $str113$SELECT_duration_____________FROM_ = makeString( "SELECT duration \n           FROM raw_linkage\n           WHERE contents is NOT NULL\n           AND run_id = " );
    $str114$SELECT_sentence_contents_________ = makeString( "SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NULL\n           AND run_id = " );
    $str115$____________AND_sentence_id___sen = makeString( "\n           AND sentence.id = sentence_id" );
    $str116$SELECT_sentence_contents_________ = makeString( "SELECT sentence.contents\n           FROM sentence, raw_linkage\n           WHERE raw_linkage.contents is NOT NULL\n           AND run_id = " );
    $str117$_a_t_a_T__ = makeString( "~a~t~a~T~%" );
    $str118$_home_aldag_time_count_failed_100 = makeString( "/home/aldag/time-count-failed-100.txt" );
    $kw119$OUTPUT = makeKeyword( "OUTPUT" );
    $str120$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str121$_home_aldag_time_count_succeeded_ = makeString( "/home/aldag/time-count-succeeded-100.txt" );
    $str122$_home_aldag_length_count_failed_1 = makeString( "/home/aldag/length-count-failed-100.txt" );
    $str123$_home_aldag_length_count_succeede = makeString( "/home/aldag/length-count-succeeded-100.txt" );
    $str124$SELECT_id__name__comment_FROM_cor = makeString( "SELECT id, name, comment FROM corpus" );
    $kw125$ID = makeKeyword( "ID" );
    $kw126$NAME = makeKeyword( "NAME" );
    $kw127$COMMENT = makeKeyword( "COMMENT" );
    $str128$SELECT_COUNT_id__from_sentence_wh = makeString( "SELECT COUNT(id) from sentence where corpus_id=" );
    $str129$_ = makeString( ";" );
    $str130$SELECT_id__type__comment__kb__rev = makeString( "SELECT id, type, comment, kb, revision, start FROM run where corpus_id = " );
    $kw131$TYPE = makeKeyword( "TYPE" );
    $kw132$KB = makeKeyword( "KB" );
    $kw133$REVISION = makeKeyword( "REVISION" );
    $kw134$START = makeKeyword( "START" );
    $str135$_ = makeString( "'" );
    $sym136$NULL = makeSymbol( "NULL" );
    $str137$INSERT_INTO_corpus_name__comment_ = makeString( "INSERT INTO corpus(name, comment) VALUES(" );
    $str138$__ = makeString( ", " );
    $str139$__ = makeString( ");" );
    $str140$INSERT_INTO_sentence_corpus_id__c = makeString( "INSERT INTO sentence(corpus_id, contents) VALUES(" );
    $str141$SELECT_id_from_sentence_WHERE_cor = makeString( "SELECT id from sentence WHERE corpus_id=" );
    $str142$_AND_contents_ = makeString( " AND contents=" );
    $sym143$SQL_STATEMENT_P = makeSymbol( "SQL-STATEMENT-P" );
    $sym144$ABSTRACT_LEXICON_P = makeSymbol( "ABSTRACT-LEXICON-P" );
    $sym145$PARSE_TREE_CONTEXT = makeSymbol( "PARSE-TREE-CONTEXT" );
    $str146$run_id_seq = makeString( "run_id_seq" );
    $str147$INSERT_INTO_run_VALUES_ = makeString( "INSERT INTO run VALUES(" );
    $str148$__ = makeString( ",'" );
    $str149$____ = makeString( "', '" );
    $str150$___ = makeString( "', " );
    $str151$___ = makeString( ", '" );
    $str152$__ = makeString( "')" );
    $str153$raw_linkage_id_seq = makeString( "raw_linkage_id_seq" );
    $str154$INSERT_INTO_raw_linkage_VALUES_ = makeString( "INSERT INTO raw_linkage VALUES(" );
    $str155$_ = makeString( ")" );
    $sym156$LENGTH = makeSymbol( "LENGTH" );
    $sym157$XML = makeSymbol( "XML" );
    $str158$word_linkage_id_seq = makeString( "word_linkage_id_seq" );
    $str159$INSERT_INTO_word_linkage_VALUES_ = makeString( "INSERT INTO word_linkage VALUES(" );
    $str160$full_linkage_id_seq = makeString( "full_linkage_id_seq" );
    $sym161$LEXIFY = makeSymbol( "LEXIFY" );
    $sym162$LINK_WORD_P = makeSymbol( "LINK-WORD-P" );
    $str163$INSERT_INTO_full_linkage_VALUES_ = makeString( "INSERT INTO full_linkage VALUES(" );
    $sym164$CYCLIFY = makeSymbol( "CYCLIFY" );
    $kw165$LEXICON = makeKeyword( "LEXICON" );
    $str166$timed_out__ = makeString( "timed out~%" );
    $str167$link_cyclification_id_seq = makeString( "link_cyclification_id_seq" );
    $str168$INSERT_INTO_link_cyclification_VA = makeString( "INSERT INTO link_cyclification VALUES(" );
    $str169$INSERT_INTO_cyclifications_VALUES = makeString( "INSERT INTO cyclifications VALUES(" );
    $const170$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str171$cyclifications_id_seq = makeString( "cyclifications_id_seq" );
    $str172$INSERT_INTO_justification_VALUES_ = makeString( "INSERT INTO justification VALUES(" );
    $str173$INSERT_INTO_run_statistics_VALUES = makeString( "INSERT INTO run_statistics VALUES(~a, ~a, ~a, ~a, ~a, ~f, ~f, ~f, ~f, ~f, ~f, ~f, ~f)" );
    $str174$SELECT_raw_linkage_contents______ = makeString(
        "SELECT raw_linkage.contents \n             FROM raw_linkage, sentence \n             WHERE raw_linkage.contents IS NOT NULL \n             AND raw_linkage.sentence_id = sentence.id \n             AND sentence.contents = '" );
    $str175$________________ORDER_BY_raw_link = makeString( "' \n             ORDER BY raw_linkage.start DESC\n             LIMIT 1" );
    $str176$SELECT_ = makeString( "SELECT " );
    $str177$_________FROM_run_statistics_____ = makeString( " \n       FROM run_statistics \n       WHERE run_id = " );
    $sym178$WORDS = makeSymbol( "WORDS" );
    $sym179$GET_LEXES = makeSymbol( "GET-LEXES" );
    $str180$__ = makeString( "\\'" );
    $str181$SELECT_id_FROM_corpus_WHERE_name_ = makeString( "SELECT id FROM corpus WHERE name = '" );
    $str182$Can_t_determine_id_for_unknown_co = makeString( "Can't determine id for unknown corpus ~a" );
    $str183$SELECT_nextval__ = makeString( "SELECT nextval('" );
    $str184$_4__0D__2__0D__2__0D__2__0D__2__0 = makeString( "~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D" );
  }
}
/*
 * 
 * Total time: 1489 ms synthetic
 */