package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class external_interfaces extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.external_interfaces";
    public static final String myFingerPrint = "00cd743ddf8c0943c2d1a2490aaf24ab6513953dac482ce18937974e4b9e732f";
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 764L)
    public static SubLSymbol $quirk_host$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 818L)
    public static SubLSymbol $quirk_port$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 858L)
    public static SubLSymbol $talent_path$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 923L)
    public static SubLSymbol $npp_default$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 961L)
    public static SubLSymbol $shallow_parse_path$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1036L)
    public static SubLSymbol $dependency_parse_path$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1112L)
    public static SubLSymbol $guruqa_retrieve_passage_path$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1198L)
    public static SubLSymbol $guruqa_answer_indexes_path$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1277L)
    public static SubLSymbol $resporator_path$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1351L)
    private static SubLSymbol $guruqa_wizard$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9681L)
    public static SubLSymbol $dict_db_user$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9721L)
    public static SubLSymbol $dict_db_passwd$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9756L)
    public static SubLSymbol $dict_db$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9789L)
    public static SubLSymbol $dict_host$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9825L)
    public static SubLSymbol $dict_conn$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9856L)
    public static SubLSymbol $dict_stmt$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 15945L)
    public static SubLSymbol $all_external_services$;
    private static final SubLString $str0$mongo_cyc_com;
    private static final SubLInteger $int1$8080;
    private static final SubLString $str2$_users_textract_showtalent;
    private static final SubLString $str3$_users_textract_sexpr_shallow;
    private static final SubLString $str4$_users_supertagger_sexprlda;
    private static final SubLString $str5$_users_textract_documentWindow;
    private static final SubLString $str6$_users_textract_guruqaIds;
    private static final SubLString $str7$_users_textract_sexprresporator;
    private static final SubLSymbol $sym8$CYCL_GURUQA_QUERY_WIZARD;
    private static final SubLSymbol $sym9$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const10$EverythingPSC;
    private static final SubLString $str11$__mt___A;
    private static final SubLString $str12$__wiz___A;
    private static final SubLString $str13$__cyc_expr___S_of_type__S;
    private static final SubLSymbol $sym14$HOLISTIC_GURUQA_QUERY;
    private static final SubLString $str15$__guruqa_query_expr___A;
    private static final SubLSymbol $sym16$TO_STRING;
    private static final SubLString $str17$__guruqa_query_str___A;
    private static final SubLString $str18$_________________________________;
    private static final SubLString $str19$___A;
    private static final SubLString $str20$_____S;
    private static final SubLSymbol $sym21$ASK;
    private static final SubLSymbol $sym22$EL_FORMULA_P;
    private static final SubLString $str23$___S;
    private static final SubLSymbol $sym24$STRINGP;
    private static final SubLSymbol $kw25$DOC;
    private static final SubLSymbol $kw26$SENT;
    private static final SubLSymbol $kw27$POST;
    private static final SubLString $str28$query;
    private static final SubLString $str29$text;
    private static final SubLSymbol $sym30$QUIRK_LEXICON;
    private static final SubLSymbol $sym31$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $kw32$OFF;
    private static final SubLSymbol $sym33$PERSON;
    private static final SubLSymbol $sym34$GET;
    private static final SubLSymbol $kw35$DENOT;
    private static final SubLObject $const36$PersonTypeByOccupation;
    private static final SubLString $str37$doc;
    private static final SubLString $str38$start;
    private static final SubLString $str39$length;
    private static final SubLString $str40$_P_;
    private static final SubLString $str41$__P_;
    private static final SubLSymbol $kw42$LEN;
    private static final SubLString $str43$npp;
    private static final SubLString $str44$_users_supertagger_old_sexprlda;
    private static final SubLSymbol $sym45$STRIP_STEMS;
    private static final SubLSymbol $kw46$ROOT;
    private static final SubLList $list47;
    private static final SubLString $str48$ini;
    private static final SubLString $str49$mahler;
    private static final SubLString $str50$;
    private static final SubLString $str51$dict2;
    private static final SubLString $str52$elmore;
    private static final SubLSymbol $kw53$DBMS_SERVER;
    private static final SubLSymbol $kw54$PORT;
    private static final SubLInteger $int55$9999;
    private static final SubLSymbol $kw56$SUBPROTOCOL;
    private static final SubLString $str57$postgresql;
    private static final SubLString $str58$select_occurrences__documents__te;
    private static final SubLString $str59$__;
    private static final SubLString $str60$_;
    private static final SubLSymbol $sym61$LEMUR_QUERY;
    private static final SubLSymbol $sym62$GET_CORPUS_PATH_MAPPING;
    private static final SubLString $str63$Unsupported_corpus__a;
    private static final SubLString $str64$_inesgraph_cgi;
    private static final SubLSymbol $sym65$LISTP;
    private static final SubLString $str66$___A_____;
    private static final SubLString $str67$_qaga_cgi;
    private static final SubLString $str68$_applepie_cgi;
    private static final SubLString $str69$_minipar_cgi;
    private static final SubLString $str70$_bash_cgi;
    private static final SubLString $str71$command;
    private static final SubLString $str72$_parse_date_cgi;
    private static final SubLString $str73$datestring;
    private static final SubLString $str74$year;
    private static final SubLString $str75$month;
    private static final SubLString $str76$day;
    private static final SubLString $str77$hour;
    private static final SubLString $str78$minute;
    private static final SubLString $str79$second;
    private static final SubLString $str80$_qack_cgi;
    private static final SubLString $str81$_wordnet_cgi;
    private static final SubLSymbol $kw82$TEXT;
    private static final SubLList $list83;
    private static final SubLString $str84$_questions_cgi;
    private static final SubLList $list85;
    private static final SubLString $str86$Guest;
    private static final SubLString $str87$_cgi_bin_users_mahler_check_cyc_s;
    private static final SubLString $str88$servers;
    private static final SubLSymbol $sym89$USER;
    private static final SubLString $str90$_corpus_frequency_cgi;
    private static final SubLString $str91$dbfile;
    private static final SubLString $str92$word;
    private static final SubLString $str93$pos;
    private static final SubLObject $list94;
    private static final SubLInteger $int95$30;
    private static final SubLSymbol $sym96$CATCH_ERROR_MESSAGE_HANDLER;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1484L)
    public static SubLObject get_guruqa_wizard() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (external_interfaces.NIL == external_interfaces.$guruqa_wizard$.getDynamicValue(thread)) {
            external_interfaces.$guruqa_wizard$.setDynamicValue(object.new_class_instance((SubLObject)external_interfaces.$sym8$CYCL_GURUQA_QUERY_WIZARD), thread);
        }
        return external_interfaces.$guruqa_wizard$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 1653L)
    public static SubLObject compute_guruqa_query(final SubLObject cyc_expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expr = (SubLObject)external_interfaces.NIL;
        SubLObject str = (SubLObject)external_interfaces.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)external_interfaces.$sym9$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(external_interfaces.$const10$EverythingPSC, thread);
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str11$__mt___A, mt_relevance_macros.$mt$.getDynamicValue(thread));
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str12$__wiz___A, get_guruqa_wizard());
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str13$__cyc_expr___S_of_type__S, cyc_expr, (SubLObject)Types.type_of(cyc_expr));
            expr = methods.funcall_instance_method_with_1_args(get_guruqa_wizard(), (SubLObject)external_interfaces.$sym14$HOLISTIC_GURUQA_QUERY, cyc_expr);
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str15$__guruqa_query_expr___A, expr);
            str = methods.funcall_instance_method_with_0_args(expr, (SubLObject)external_interfaces.$sym16$TO_STRING);
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str17$__guruqa_query_str___A, str);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return expr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 2193L)
    public static SubLObject secretarize_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, final SubLObject secretary, SubLObject method) {
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$sym14$HOLISTIC_GURUQA_QUERY;
        }
        SubLObject cdolist_list_var;
        final SubLObject passages = cdolist_list_var = guruqa_passages_for_cycl(cycl, guruqa_wizard, method);
        SubLObject passage = (SubLObject)external_interfaces.NIL;
        passage = cdolist_list_var.first();
        while (external_interfaces.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str18$_________________________________);
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str19$___A, passage);
            PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str20$_____S, methods.funcall_instance_method_with_2_args(secretary, (SubLObject)external_interfaces.$sym21$ASK, cycl, passage));
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
        }
        return (SubLObject)external_interfaces.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 2622L)
    public static SubLObject guruqa_passages_for_cycl(final SubLObject cycl, final SubLObject guruqa_wizard, SubLObject method) {
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$sym14$HOLISTIC_GURUQA_QUERY;
        }
        assert external_interfaces.NIL != el_utilities.el_formula_p(cycl) : cycl;
        final SubLObject query = methods.funcall_instance_method_with_1_args(guruqa_wizard, method, cycl);
        final SubLObject query_string = methods.funcall_instance_method_with_0_args(query, (SubLObject)external_interfaces.$sym16$TO_STRING);
        PrintLow.format((SubLObject)external_interfaces.T, (SubLObject)external_interfaces.$str23$___S, query_string);
        return guruqa_passages_for_query(query_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 3345L)
    public static SubLObject guruqa_passages_for_query(final SubLObject query) {
        assert external_interfaces.NIL != Types.stringp(query) : query;
        final SubLObject indices = guruqa_answer_indexes(query, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
        SubLObject passages = (SubLObject)external_interfaces.NIL;
        SubLObject cdolist_list_var = indices;
        SubLObject index = (SubLObject)external_interfaces.NIL;
        index = cdolist_list_var.first();
        while (external_interfaces.NIL != cdolist_list_var) {
            final SubLObject doc = conses_high.getf(index, (SubLObject)external_interfaces.$kw25$DOC, (SubLObject)external_interfaces.UNPROVIDED);
            final SubLObject sent = conses_high.getf(index, (SubLObject)external_interfaces.$kw26$SENT, (SubLObject)external_interfaces.UNPROVIDED);
            final SubLObject passage = guruqa_retrieve_passage(doc, sent, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
            passages = (SubLObject)ConsesLow.cons(passage, passages);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        }
        return strip_tags(passages);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 4015L)
    public static SubLObject guruqa_answer_indexes(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$guruqa_answer_indexes_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str28$query, query)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 4458L)
    public static SubLObject resporator(final SubLObject text, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$resporator_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, text)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 4770L)
    public static SubLObject resporatorXX(final SubLObject string) {
        assert external_interfaces.NIL != Types.stringp(string) : string;
        final SubLObject lexicon = object.new_class_instance((SubLObject)external_interfaces.$sym30$QUIRK_LEXICON);
        SubLObject typings = (SubLObject)external_interfaces.NIL;
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)external_interfaces.$sym31$SET_CASE_SENSITIVITY, (SubLObject)external_interfaces.$kw32$OFF);
        SubLObject cdolist_list_var = resporator(string, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
        SubLObject typing = (SubLObject)external_interfaces.NIL;
        typing = cdolist_list_var.first();
        while (external_interfaces.NIL != cdolist_list_var) {
            if (typing.first().eql((SubLObject)external_interfaces.$sym33$PERSON)) {
                final SubLObject entity = typing.rest();
                final SubLObject tokens = string_utilities.split_string(entity, (SubLObject)external_interfaces.UNPROVIDED);
                SubLObject new_tokens = (SubLObject)external_interfaces.NIL;
                SubLObject titleP = (SubLObject)external_interfaces.NIL;
                if (external_interfaces.NIL == titleP) {
                    SubLObject csome_list_var = Sequences.reverse(tokens);
                    SubLObject token = (SubLObject)external_interfaces.NIL;
                    token = csome_list_var.first();
                    while (external_interfaces.NIL == titleP && external_interfaces.NIL != csome_list_var) {
                        final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)external_interfaces.$sym34$GET, token);
                        if (external_interfaces.NIL != lexes && external_interfaces.NIL == titleP) {
                            SubLObject csome_list_var_$1 = lexes;
                            SubLObject lex = (SubLObject)external_interfaces.NIL;
                            lex = csome_list_var_$1.first();
                            while (external_interfaces.NIL == titleP && external_interfaces.NIL != csome_list_var_$1) {
                                if (external_interfaces.NIL != isa.isa_in_any_mtP(methods.funcall_instance_method_with_1_args(lex, (SubLObject)external_interfaces.$sym34$GET, (SubLObject)external_interfaces.$kw35$DENOT), external_interfaces.$const36$PersonTypeByOccupation)) {
                                    titleP = (SubLObject)external_interfaces.T;
                                }
                                csome_list_var_$1 = csome_list_var_$1.rest();
                                lex = csome_list_var_$1.first();
                            }
                        }
                        if (external_interfaces.NIL == titleP) {
                            new_tokens = (SubLObject)ConsesLow.cons(token, new_tokens);
                        }
                        csome_list_var = csome_list_var.rest();
                        token = csome_list_var.first();
                    }
                }
                typings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)external_interfaces.$sym33$PERSON, string_utilities.bunge(new_tokens, (SubLObject)external_interfaces.UNPROVIDED)), typings);
            }
            else {
                typings = (SubLObject)ConsesLow.cons(typing, typings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            typing = cdolist_list_var.first();
        }
        return typings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 5626L)
    public static SubLObject guruqa_retrieve_passage(final SubLObject doc, final SubLObject sent, SubLObject len, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (len == external_interfaces.UNPROVIDED) {
            len = (SubLObject)external_interfaces.ONE_INTEGER;
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$guruqa_retrieve_passage_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return strip_tags(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str37$doc, doc), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str38$start, sent), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str39$length, len)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 7679L)
    public static SubLObject strip_tags(final SubLObject string) {
        return string_utilities.trim_whitespace(string_utilities.remove_substring(string_utilities.remove_substring(string, (SubLObject)external_interfaces.$str40$_P_), (SubLObject)external_interfaces.$str41$__P_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 7801L)
    public static SubLObject guruqa_answer_coordinates(final SubLObject v_answer) {
        final SubLObject doc_tail = cdestructuring_bind.property_list_member((SubLObject)external_interfaces.$kw25$DOC, v_answer);
        final SubLObject doc = (SubLObject)((external_interfaces.NIL != doc_tail) ? conses_high.cadr(doc_tail) : external_interfaces.NIL);
        final SubLObject sent_tail = cdestructuring_bind.property_list_member((SubLObject)external_interfaces.$kw26$SENT, v_answer);
        final SubLObject sent = (SubLObject)((external_interfaces.NIL != sent_tail) ? conses_high.cadr(sent_tail) : external_interfaces.NIL);
        final SubLObject len_tail = cdestructuring_bind.property_list_member((SubLObject)external_interfaces.$kw42$LEN, v_answer);
        final SubLObject len = (SubLObject)((external_interfaces.NIL != len_tail) ? conses_high.cadr(len_tail) : external_interfaces.NIL);
        return (SubLObject)ConsesLow.list(doc, sent, len);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 7945L)
    public static SubLObject dependency_parse(final SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (npp == external_interfaces.UNPROVIDED) {
            npp = external_interfaces.$npp_default$.getDynamicValue();
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$dependency_parse_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, Sequences.remove((SubLObject)Characters.CHAR_return, str, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str43$npp, npp)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 8341L)
    public static SubLObject dependency_parse_old(final SubLObject str, SubLObject npp, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (npp == external_interfaces.UNPROVIDED) {
            npp = external_interfaces.$npp_default$.getDynamicValue();
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = (SubLObject)external_interfaces.$str44$_users_supertagger_old_sexprlda;
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, Sequences.remove((SubLObject)Characters.CHAR_return, str, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str43$npp, npp)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 8751L)
    public static SubLObject shallow_parse(final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$shallow_parse_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)external_interfaces.$sym45$STRIP_STEMS), stem_parse(str, path, host, port, method));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 8980L)
    public static SubLObject strip_stems(final SubLObject parse) {
        return parse.isCons() ? ((parse.first() == external_interfaces.$kw46$ROOT) ? conses_high.cadr(parse) : Mapping.mapcar(Symbols.symbol_function((SubLObject)external_interfaces.$sym45$STRIP_STEMS), parse)) : parse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9144L)
    public static SubLObject stem_parse(final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$shallow_parse_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return Sequences.remove((SubLObject)external_interfaces.$list47, reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, str)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), Symbols.symbol_function((SubLObject)external_interfaces.EQUALP), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9438L)
    public static SubLObject run_talent(final SubLObject ini, final SubLObject str, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = external_interfaces.$talent_path$.getDynamicValue();
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = external_interfaces.$quirk_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = external_interfaces.$quirk_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str48$ini, ini), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, str)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 9887L)
    public static SubLObject dict_connection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (external_interfaces.NIL == sdbc.sql_open_connection_p(external_interfaces.$dict_conn$.getDynamicValue(thread))) {
            final SubLObject connection = sdbc.new_sql_connection(external_interfaces.$dict_db$.getDynamicValue(thread), external_interfaces.$dict_db_user$.getDynamicValue(thread), external_interfaces.$dict_db_passwd$.getDynamicValue(thread), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$kw53$DBMS_SERVER, external_interfaces.$dict_host$.getDynamicValue(thread), (SubLObject)external_interfaces.$kw54$PORT, (SubLObject)external_interfaces.$int55$9999, (SubLObject)external_interfaces.$kw56$SUBPROTOCOL, (SubLObject)external_interfaces.$str57$postgresql));
            if (external_interfaces.NIL != sdbc.sdbc_error_p(connection)) {
                sdbc.sdbc_error_throw(connection);
            }
            external_interfaces.$dict_conn$.setDynamicValue(connection, thread);
        }
        return external_interfaces.$dict_conn$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 10283L)
    public static SubLObject dict_statement() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (external_interfaces.NIL == sdbc.sql_open_statement_p(external_interfaces.$dict_stmt$.getDynamicValue(thread))) {
            final SubLObject statement = sdbc.sqlc_create_statement(dict_connection());
            if (external_interfaces.NIL != sdbc.sdbc_error_p(statement)) {
                sdbc.sdbc_error_throw(statement);
            }
            external_interfaces.$dict_stmt$.setDynamicValue(statement, thread);
        }
        return external_interfaces.$dict_stmt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 10549L)
    public static SubLObject guruqa_indexed_string_entry(final SubLObject str) {
        return sdbc.sqls_execute_query(dict_statement(), PrintLow.format((SubLObject)external_interfaces.NIL, (SubLObject)external_interfaces.$str58$select_occurrences__documents__te, string_utilities.string_substitute((SubLObject)external_interfaces.$str59$__, (SubLObject)external_interfaces.$str60$_, str, (SubLObject)external_interfaces.UNPROVIDED)), (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 10802L)
    public static SubLObject get_word_graph_path(final SubLObject corpus) {
        final SubLObject path = conses_high.assoc(corpus, methods.funcall_class_method_with_0_args((SubLObject)external_interfaces.$sym61$LEMUR_QUERY, (SubLObject)external_interfaces.$sym62$GET_CORPUS_PATH_MAPPING), (SubLObject)external_interfaces.EQUALP, (SubLObject)external_interfaces.UNPROVIDED).rest();
        if (external_interfaces.NIL == path) {
            Errors.error((SubLObject)external_interfaces.$str63$Unsupported_corpus__a, corpus);
        }
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 11162L)
    public static SubLObject get_word_graph(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == external_interfaces.UNPROVIDED) {
            options = (SubLObject)external_interfaces.NIL;
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str64$_inesgraph_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        assert external_interfaces.NIL != Types.listp(query) : query;
        return reader.read_from_string(web_utilities.http_retrieve(reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str28$query, PrintLow.format((SubLObject)external_interfaces.NIL, (SubLObject)external_interfaces.$str66$___A_____, query)), ConsesLow.append(options, (SubLObject)external_interfaces.NIL)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 11509L)
    public static SubLObject ask_qaga(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str67$_qaga_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        assert external_interfaces.NIL != Types.listp(query) : query;
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str28$query, PrintLow.format((SubLObject)external_interfaces.NIL, (SubLObject)external_interfaces.$str66$___A_____, query))), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12123L)
    public static SubLObject applepie_parse(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str68$_applepie_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, query)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12387L)
    public static SubLObject minipar_parse(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str69$_minipar_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str29$text, query)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12658L)
    public static SubLObject ask_bash(final SubLObject command, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str70$_bash_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str71$command, command)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 12898L)
    public static SubLObject parse_date(final SubLObject datestring, SubLObject year, SubLObject month, SubLObject day, SubLObject hour, SubLObject minute, SubLObject second, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options) {
        if (year == external_interfaces.UNPROVIDED) {
            year = (SubLObject)external_interfaces.$str50$;
        }
        if (month == external_interfaces.UNPROVIDED) {
            month = (SubLObject)external_interfaces.$str50$;
        }
        if (day == external_interfaces.UNPROVIDED) {
            day = (SubLObject)external_interfaces.$str50$;
        }
        if (hour == external_interfaces.UNPROVIDED) {
            hour = (SubLObject)external_interfaces.$str50$;
        }
        if (minute == external_interfaces.UNPROVIDED) {
            minute = (SubLObject)external_interfaces.$str50$;
        }
        if (second == external_interfaces.UNPROVIDED) {
            second = (SubLObject)external_interfaces.$str50$;
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str72$_parse_date_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (cgi_method == external_interfaces.UNPROVIDED) {
            cgi_method = (SubLObject)external_interfaces.$kw27$POST;
        }
        if (options == external_interfaces.UNPROVIDED) {
            options = (SubLObject)external_interfaces.NIL;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str73$datestring, datestring), new SubLObject[] { ConsesLow.list((SubLObject)external_interfaces.$str74$year, year), ConsesLow.list((SubLObject)external_interfaces.$str75$month, month), ConsesLow.list((SubLObject)external_interfaces.$str76$day, day), ConsesLow.list((SubLObject)external_interfaces.$str77$hour, hour), ConsesLow.list((SubLObject)external_interfaces.$str78$minute, minute), ConsesLow.list((SubLObject)external_interfaces.$str79$second, second), ConsesLow.append(options, (SubLObject)external_interfaces.NIL) }), path, host, port, cgi_method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 13713L)
    public static SubLObject ask_qack(final SubLObject query, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject options) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str80$_qack_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        if (options == external_interfaces.UNPROVIDED) {
            options = (SubLObject)external_interfaces.NIL;
        }
        return reader.read_from_string(web_utilities.http_retrieve(reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str28$query, query), ConsesLow.append(options, (SubLObject)external_interfaces.NIL)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14002L)
    public static SubLObject invoke_wordnet(final SubLObject params, SubLObject path, SubLObject host, SubLObject port, SubLObject cgi_method, SubLObject options) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str81$_wordnet_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (cgi_method == external_interfaces.UNPROVIDED) {
            cgi_method = (SubLObject)external_interfaces.$kw27$POST;
        }
        if (options == external_interfaces.UNPROVIDED) {
            options = (SubLObject)external_interfaces.NIL;
        }
        return reader.read_from_string(web_utilities.http_retrieve(params, path, host, port, cgi_method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14316L)
    public static SubLObject glimpse_passages_for_query(final SubLObject query) {
        SubLObject res = (SubLObject)external_interfaces.NIL;
        SubLObject cdolist_list_var = search_engine.ask_glimpse(query, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
        SubLObject ans = (SubLObject)external_interfaces.NIL;
        ans = cdolist_list_var.first();
        while (external_interfaces.NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = ans;
            final SubLObject text_tail = cdestructuring_bind.property_list_member((SubLObject)external_interfaces.$kw82$TEXT, current);
            final SubLObject text = (SubLObject)((external_interfaces.NIL != text_tail) ? conses_high.cadr(text_tail) : external_interfaces.NIL);
            res = (SubLObject)ConsesLow.cons(text, res);
            cdolist_list_var = cdolist_list_var.rest();
            ans = cdolist_list_var.first();
        }
        return res;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14516L)
    public static SubLObject web_mine_questions(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == external_interfaces.UNPROVIDED) {
            options = (SubLObject)external_interfaces.$list83;
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str84$_questions_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve(reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str28$query, query), ConsesLow.append(options, (SubLObject)external_interfaces.NIL)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 14893L)
    public static SubLObject get_cyc_images(SubLObject servers, SubLObject user, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (servers == external_interfaces.UNPROVIDED) {
            servers = (SubLObject)external_interfaces.$list85;
        }
        if (user == external_interfaces.UNPROVIDED) {
            user = (SubLObject)external_interfaces.$str86$Guest;
        }
        if (path == external_interfaces.UNPROVIDED) {
            path = (SubLObject)external_interfaces.$str87$_cgi_bin_users_mahler_check_cyc_s;
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str88$servers, PrintLow.format((SubLObject)external_interfaces.NIL, (SubLObject)external_interfaces.$str66$___A_____, servers)), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$sym89$USER, user)), path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED), (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 15224L)
    public static SubLObject get_corpus_count_probability(final SubLObject corpus_db_path, final SubLObject word, final SubLObject part_of_speech, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == external_interfaces.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)external_interfaces.$str90$_corpus_frequency_cgi);
        }
        if (host == external_interfaces.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == external_interfaces.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == external_interfaces.UNPROVIDED) {
            method = (SubLObject)external_interfaces.$kw27$POST;
        }
        assert external_interfaces.NIL != Types.stringp(corpus_db_path) : corpus_db_path;
        assert external_interfaces.NIL != Types.stringp(word) : word;
        assert external_interfaces.NIL != Types.stringp(part_of_speech) : part_of_speech;
        final SubLObject query = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str91$dbfile, corpus_db_path), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str92$word, word), (SubLObject)ConsesLow.list((SubLObject)external_interfaces.$str93$pos, part_of_speech));
        return web_utilities.http_retrieve(query, path, host, port, method, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED, (SubLObject)external_interfaces.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/external-interfaces.lisp", position = 24829L)
    public static SubLObject services_report(SubLObject services) {
        if (services == external_interfaces.UNPROVIDED) {
            services = external_interfaces.$all_external_services$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert external_interfaces.NIL != Types.listp(services) : services;
        SubLObject services_up = (SubLObject)external_interfaces.NIL;
        SubLObject services_down = (SubLObject)external_interfaces.NIL;
        SubLObject services_timed_out = (SubLObject)external_interfaces.NIL;
        SubLObject timed_outP = (SubLObject)external_interfaces.NIL;
        SubLObject error = (SubLObject)external_interfaces.NIL;
        SubLObject cdolist_list_var = services;
        SubLObject service = (SubLObject)external_interfaces.NIL;
        service = cdolist_list_var.first();
        while (external_interfaces.NIL != cdolist_list_var) {
            final SubLObject call = service.first();
            final SubLObject result = service.rest();
            timed_outP = (SubLObject)external_interfaces.NIL;
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                try {
                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)external_interfaces.T, thread);
                    SubLObject timer = (SubLObject)external_interfaces.NIL;
                    try {
                        final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)external_interfaces.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)external_interfaces.$int95$30, tag);
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)external_interfaces.$sym96$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (Eval.eval(call).equal(result)) {
                                            services_up = (SubLObject)ConsesLow.cons(service.first().first(), services_up);
                                        }
                                        else {
                                            services_down = (SubLObject)ConsesLow.cons(service.first().first(), services_down);
                                        }
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)external_interfaces.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (external_interfaces.NIL != error) {
                                services_down = (SubLObject)ConsesLow.cons(service.first().first(), services_down);
                                Errors.warn(error);
                            }
                        }
                        finally {
                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)external_interfaces.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            subl_macro_promotions.with_timeout_stop_timer(timer);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                timed_outP = Errors.handleThrowable(ccatch_env_var2, tag);
            }
            finally {
                thread.throwStack.pop();
            }
            if (external_interfaces.NIL != timed_outP) {
                services_timed_out = (SubLObject)ConsesLow.cons(service.first().first(), services_timed_out);
            }
            cdolist_list_var = cdolist_list_var.rest();
            service = cdolist_list_var.first();
        }
        return Values.values(services_up, services_down, services_timed_out);
    }
    
    public static SubLObject declare_external_interfaces_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "get_guruqa_wizard", "GET-GURUQA-WIZARD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "compute_guruqa_query", "COMPUTE-GURUQA-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "secretarize_cycl", "SECRETARIZE-CYCL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "guruqa_passages_for_cycl", "GURUQA-PASSAGES-FOR-CYCL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "guruqa_passages_for_query", "GURUQA-PASSAGES-FOR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "guruqa_answer_indexes", "GURUQA-ANSWER-INDEXES", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "resporator", "RESPORATOR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "resporatorXX", "RESPORATOR++", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "guruqa_retrieve_passage", "GURUQA-RETRIEVE-PASSAGE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "strip_tags", "STRIP-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "guruqa_answer_coordinates", "GURUQA-ANSWER-COORDINATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "dependency_parse", "DEPENDENCY-PARSE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "dependency_parse_old", "DEPENDENCY-PARSE-OLD", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "shallow_parse", "SHALLOW-PARSE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "strip_stems", "STRIP-STEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "stem_parse", "STEM-PARSE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "run_talent", "RUN-TALENT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "dict_connection", "DICT-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "dict_statement", "DICT-STATEMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "guruqa_indexed_string_entry", "GURUQA-INDEXED-STRING-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "get_word_graph_path", "GET-WORD-GRAPH-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "get_word_graph", "GET-WORD-GRAPH", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "ask_qaga", "ASK-QAGA", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "applepie_parse", "APPLEPIE-PARSE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "minipar_parse", "MINIPAR-PARSE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "ask_bash", "ASK-BASH", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "parse_date", "PARSE-DATE", 1, 11, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "ask_qack", "ASK-QACK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "invoke_wordnet", "INVOKE-WORDNET", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "glimpse_passages_for_query", "GLIMPSE-PASSAGES-FOR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "web_mine_questions", "WEB-MINE-QUESTIONS", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "get_cyc_images", "GET-CYC-IMAGES", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "get_corpus_count_probability", "GET-CORPUS-COUNT-PROBABILITY", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.external_interfaces", "services_report", "SERVICES-REPORT", 0, 1, false);
        return (SubLObject)external_interfaces.NIL;
    }
    
    public static SubLObject init_external_interfaces_file() {
        external_interfaces.$quirk_host$ = SubLFiles.defparameter("*QUIRK-HOST*", (SubLObject)external_interfaces.$str0$mongo_cyc_com);
        external_interfaces.$quirk_port$ = SubLFiles.defparameter("*QUIRK-PORT*", (SubLObject)external_interfaces.$int1$8080);
        external_interfaces.$talent_path$ = SubLFiles.defparameter("*TALENT-PATH*", (SubLObject)external_interfaces.$str2$_users_textract_showtalent);
        external_interfaces.$npp_default$ = SubLFiles.defparameter("*NPP-DEFAULT*", (SubLObject)external_interfaces.ZERO_INTEGER);
        external_interfaces.$shallow_parse_path$ = SubLFiles.defparameter("*SHALLOW-PARSE-PATH*", (SubLObject)external_interfaces.$str3$_users_textract_sexpr_shallow);
        external_interfaces.$dependency_parse_path$ = SubLFiles.defparameter("*DEPENDENCY-PARSE-PATH*", (SubLObject)external_interfaces.$str4$_users_supertagger_sexprlda);
        external_interfaces.$guruqa_retrieve_passage_path$ = SubLFiles.defparameter("*GURUQA-RETRIEVE-PASSAGE-PATH*", (SubLObject)external_interfaces.$str5$_users_textract_documentWindow);
        external_interfaces.$guruqa_answer_indexes_path$ = SubLFiles.defparameter("*GURUQA-ANSWER-INDEXES-PATH*", (SubLObject)external_interfaces.$str6$_users_textract_guruqaIds);
        external_interfaces.$resporator_path$ = SubLFiles.defparameter("*RESPORATOR-PATH*", (SubLObject)external_interfaces.$str7$_users_textract_sexprresporator);
        external_interfaces.$guruqa_wizard$ = SubLFiles.defparameter("*GURUQA-WIZARD*", (SubLObject)external_interfaces.NIL);
        external_interfaces.$dict_db_user$ = SubLFiles.defparameter("*DICT-DB-USER*", (SubLObject)external_interfaces.$str49$mahler);
        external_interfaces.$dict_db_passwd$ = SubLFiles.defparameter("*DICT-DB-PASSWD*", (SubLObject)external_interfaces.$str50$);
        external_interfaces.$dict_db$ = SubLFiles.defparameter("*DICT-DB*", (SubLObject)external_interfaces.$str51$dict2);
        external_interfaces.$dict_host$ = SubLFiles.defparameter("*DICT-HOST*", (SubLObject)external_interfaces.$str52$elmore);
        external_interfaces.$dict_conn$ = SubLFiles.defparameter("*DICT-CONN*", (SubLObject)external_interfaces.NIL);
        external_interfaces.$dict_stmt$ = SubLFiles.defparameter("*DICT-STMT*", (SubLObject)external_interfaces.NIL);
        external_interfaces.$all_external_services$ = SubLFiles.defparameter("*ALL-EXTERNAL-SERVICES*", external_interfaces.$list94);
        return (SubLObject)external_interfaces.NIL;
    }
    
    public static SubLObject setup_external_interfaces_file() {
        return (SubLObject)external_interfaces.NIL;
    }
    
    private static SubLObject _constant_94_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARNIAK-PARSE"), (SubLObject)SubLObjectFactory.makeString("The cat sat on the mat.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)SubLObjectFactory.makeString("The")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeString("cat"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBD"), (SubLObject)SubLObjectFactory.makeString("sat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IN"), (SubLObject)SubLObjectFactory.makeString("on")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)SubLObjectFactory.makeString("the")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeString("mat"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("."), (SubLObject)SubLObjectFactory.makeString("."))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANFORD-PARSE"), (SubLObject)SubLObjectFactory.makeString("The cat sat on the mat.")), (SubLObject)SubLObjectFactory.makeKeyword("S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)SubLObjectFactory.makeString("The")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeString("cat"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBD"), (SubLObject)SubLObjectFactory.makeString("sat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IN"), (SubLObject)SubLObjectFactory.makeString("on")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)SubLObjectFactory.makeString("the")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeString("mat"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("."), (SubLObject)SubLObjectFactory.makeString("."))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENCY-PARSE"), (SubLObject)SubLObjectFactory.makeString("The cat sat on the mat.")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeString("sat"), SubLObjectFactory.makeKeyword("TAG"), SubLObjectFactory.makeString("A_nx0Vpx1"), SubLObjectFactory.makeKeyword("INDEX"), external_interfaces.TWO_INTEGER, SubLObjectFactory.makeKeyword("ARGS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeString("cat"), SubLObjectFactory.makeKeyword("TAG"), SubLObjectFactory.makeString("A_NXN"), SubLObjectFactory.makeKeyword("INDEX"), external_interfaces.ONE_INTEGER, SubLObjectFactory.makeKeyword("ARGS"), external_interfaces.NIL, SubLObjectFactory.makeKeyword("MODIFIERS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeString("The"), SubLObjectFactory.makeKeyword("TAG"), SubLObjectFactory.makeString("B_Dnx"), SubLObjectFactory.makeKeyword("INDEX"), external_interfaces.ZERO_INTEGER, SubLObjectFactory.makeKeyword("ARGS"), external_interfaces.NIL, SubLObjectFactory.makeKeyword("MODIFIERS"), external_interfaces.NIL })) }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeString("on"), SubLObjectFactory.makeKeyword("TAG"), SubLObjectFactory.makeString("A_PXPnx"), SubLObjectFactory.makeKeyword("INDEX"), external_interfaces.THREE_INTEGER, SubLObjectFactory.makeKeyword("ARGS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeString("mat."), SubLObjectFactory.makeKeyword("TAG"), SubLObjectFactory.makeString("A_NXN"), SubLObjectFactory.makeKeyword("INDEX"), external_interfaces.FIVE_INTEGER, SubLObjectFactory.makeKeyword("ARGS"), external_interfaces.NIL, SubLObjectFactory.makeKeyword("MODIFIERS"), ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeString("the"), SubLObjectFactory.makeKeyword("TAG"), SubLObjectFactory.makeString("B_Dnx"), SubLObjectFactory.makeKeyword("INDEX"), external_interfaces.FOUR_INTEGER, SubLObjectFactory.makeKeyword("ARGS"), external_interfaces.NIL, SubLObjectFactory.makeKeyword("MODIFIERS"), external_interfaces.NIL })) })), SubLObjectFactory.makeKeyword("MODIFIERS"), external_interfaces.NIL })), SubLObjectFactory.makeKeyword("MODIFIERS"), external_interfaces.NIL })), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STEM-PARSE"), (SubLObject)SubLObjectFactory.makeString("The cat sat on the mat.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeString("The"), (SubLObject)SubLObjectFactory.makeString("the"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("cat"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeString("sat"), (SubLObject)SubLObjectFactory.makeString("sit")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("on"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("the"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeString("mat"), (SubLObject)SubLObjectFactory.makeString("mat"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("."), (SubLObject)SubLObjectFactory.makeString(".")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GURUQA-ANSWER-INDEXES"), (SubLObject)SubLObjectFactory.makeString("Udine")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("RANK"), external_interfaces.ONE_INTEGER, SubLObjectFactory.makeKeyword("LEN"), external_interfaces.ONE_INTEGER, SubLObjectFactory.makeKeyword("DOCID"), SubLObjectFactory.makeString("NA.18541"), SubLObjectFactory.makeKeyword("DOC"), SubLObjectFactory.makeInteger(33671), SubLObjectFactory.makeKeyword("WEIGHT"), SubLObjectFactory.makeDouble(0.155536824074), SubLObjectFactory.makeKeyword("SENT"), SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeKeyword("SIZE"), SubLObjectFactory.makeInteger(227), SubLObjectFactory.makeKeyword("SCORE"), SubLObjectFactory.makeDouble(1.0) })), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GURUQA-RETRIEVE-PASSAGE"), (SubLObject)SubLObjectFactory.makeInteger(33671), (SubLObject)SubLObjectFactory.makeInteger(21)), (SubLObject)SubLObjectFactory.makeString("A prior Italian Senate\ninvestigation report states that in 1989 a steel company in Udine that had\n$70 million worth of contracts with Iraq was referred by BNL Rome to seek\nfinancing from BNL Atlanta, where it obtained credit. \n")), ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-LEMUR"), (SubLObject)SubLObjectFactory.makeString("Jawien")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.29"), (SubLObject)SubLObjectFactory.makeDouble(19.979052515738), (SubLObject)SubLObjectFactory.makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.1"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Jerzy Turowicz, who skirmished with communist censors for nearly four decades to produce a Polish Catholic weekly that became widely known as ``the only free newspaper from Berlin to Vladivostok,'' died on Wednesday in Krakow, Poland.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.2"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("He was 86 and had suffered a heart attack.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.3"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("News of Turowicz's death was brought to Pope John Paul II while he was about to celebrate Mass in St. Louis.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.4"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("He then prayed for the soul of the man who had been described as his closest friend at the time of his election to the papacy in 1978.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.5"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("In the years after communism fell in their native Poland in 1989, they differed over issues like abortion, but their friendship went back to a time when Turowicz published the pope's poems and essays while he was still Karol Wojtyla, a priest from Krakow.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.6"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("The death was front-page news all over Poland, and Thursday's issues of Gazeta Wyborcza, a Warsaw daily, devoted eight pages to Turowicz, including a poem about him by Czeslaw Milosz, the 1980 Nobel laureate in literature.")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.7"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("In an editorial, the paper said Turowicz ``was the moral authority of several generations of Polish intellectuals; a wonderful essayist and a rational commentator on everything.''")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.8"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Referring to his Krakow-based publication, whose name means The Universal Weekly, the editorial added, ``For more than a half century he established Tygodnik Powszechny as an achievement without precedent in the annals of Polish culture, an achievement that for many years provided the only light in the dark Polish tunnel.``")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NYT19990128.0498.9"), (SubLObject)external_interfaces.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("The magazine was founded in 1945, sponsored by Adam Sapieha, who was then Archbishop of Krakow.")) }), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR"), (SubLObject)SubLObjectFactory.makeString("The cat sat on the mat.")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("THING"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VEHICLE"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("THING"), (SubLObject)SubLObjectFactory.makeString("mat"))), ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORD-GRAPH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Jawien")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("forced"), (SubLObject)SubLObjectFactory.makeString("write")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("gazeta"), (SubLObject)SubLObjectFactory.makeString("eight")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("heart"), (SubLObject)SubLObjectFactory.makeString("86")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("never"), (SubLObject)SubLObjectFactory.makeString("forced"), (SubLObject)SubLObjectFactory.makeString("think")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("decades"), (SubLObject)SubLObjectFactory.makeString("died"), (SubLObject)SubLObjectFactory.makeString("skirmished"), (SubLObject)SubLObjectFactory.makeString("four")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("featured"), (SubLObject)SubLObjectFactory.makeString("stringent")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("enraging"), (SubLObject)SubLObjectFactory.makeString("direct"), (SubLObject)SubLObjectFactory.makeString("independence")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aroused"), (SubLObject)SubLObjectFactory.makeString("trouble")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("issues"), (SubLObject)SubLObjectFactory.makeString("including"), (SubLObject)SubLObjectFactory.makeString("1989"), (SubLObject)SubLObjectFactory.makeString("nobel")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("differed"), (SubLObject)SubLObjectFactory.makeString("went"), (SubLObject)SubLObjectFactory.makeString("wojtyla"), (SubLObject)SubLObjectFactory.makeString("poems"), (SubLObject)SubLObjectFactory.makeString("priest"), (SubLObject)SubLObjectFactory.makeString("abortion")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("including"), (SubLObject)SubLObjectFactory.makeString("news"), (SubLObject)SubLObjectFactory.makeString("word")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stalin"), (SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)SubLObjectFactory.makeString("soviet"), (SubLObject)SubLObjectFactory.makeString("perhaps")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sapieha"), (SubLObject)SubLObjectFactory.makeString("archbishop")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perhaps"), (SubLObject)SubLObjectFactory.makeString("ordered"), (SubLObject)SubLObjectFactory.makeString("1953"), (SubLObject)SubLObjectFactory.makeString("despot"), (SubLObject)SubLObjectFactory.makeString("boldest"), (SubLObject)SubLObjectFactory.makeString("act")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("news"), (SubLObject)SubLObjectFactory.makeString("death"), (SubLObject)SubLObjectFactory.makeString("paul")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("poet"), (SubLObject)SubLObjectFactory.makeString("origins")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("everything"), (SubLObject)SubLObjectFactory.makeString("free"), (SubLObject)SubLObjectFactory.makeString("1986")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("polish"), (SubLObject)SubLObjectFactory.makeString("weekly")), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("elsewhere"), SubLObjectFactory.makeString("1951"), SubLObjectFactory.makeString("semitic"), SubLObjectFactory.makeString("1968"), SubLObjectFactory.makeString("antoni"), SubLObjectFactory.makeString("jewish"), SubLObjectFactory.makeString("editor"), SubLObjectFactory.makeString("mounted"), SubLObjectFactory.makeString("government") }), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("perspective"), (SubLObject)SubLObjectFactory.makeString("believe"), (SubLObject)SubLObjectFactory.makeString("reader"), (SubLObject)SubLObjectFactory.makeString("newspaper")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("abortion"), (SubLObject)SubLObjectFactory.makeString("native"), (SubLObject)SubLObjectFactory.makeString("karol")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("years"), (SubLObject)SubLObjectFactory.makeString("1945"), (SubLObject)SubLObjectFactory.makeString("krakow")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("control"), (SubLObject)SubLObjectFactory.makeString("took"), (SubLObject)SubLObjectFactory.makeString("moved"), (SubLObject)SubLObjectFactory.makeString("enraging")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("intellectuals"), (SubLObject)SubLObjectFactory.makeString("wonderful"), (SubLObject)SubLObjectFactory.makeString("generations")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("editorial"), (SubLObject)SubLObjectFactory.makeString("polish"), (SubLObject)SubLObjectFactory.makeString("annals"), (SubLObject)SubLObjectFactory.makeString("weekly"), (SubLObject)SubLObjectFactory.makeString("culture")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("stringent"), (SubLObject)SubLObjectFactory.makeString("less")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("east"), (SubLObject)SubLObjectFactory.makeString("great")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("word"), (SubLObject)SubLObjectFactory.makeString("removed"), (SubLObject)SubLObjectFactory.makeString("dashes"), (SubLObject)SubLObjectFactory.makeString("something"), (SubLObject)SubLObjectFactory.makeString("instituted"), (SubLObject)SubLObjectFactory.makeString("show")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("soviet"), (SubLObject)SubLObjectFactory.makeString("three")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("antoni"), (SubLObject)SubLObjectFactory.makeString("figure")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("collaborating"), (SubLObject)SubLObjectFactory.makeString("turned")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("leaders"), (SubLObject)SubLObjectFactory.makeString("elsewhere"), (SubLObject)SubLObjectFactory.makeString("deal"), (SubLObject)SubLObjectFactory.makeString("bloc"), (SubLObject)SubLObjectFactory.makeString("articles"), (SubLObject)SubLObjectFactory.makeString("publishing")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("publication"), (SubLObject)SubLObjectFactory.makeString("use")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("publish"), (SubLObject)SubLObjectFactory.makeString("party"), (SubLObject)SubLObjectFactory.makeString("occurred")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("figure"), (SubLObject)SubLObjectFactory.makeString("poet"), (SubLObject)SubLObjectFactory.makeString("contributing"), (SubLObject)SubLObjectFactory.makeString("instance"), (SubLObject)SubLObjectFactory.makeString("anti"), (SubLObject)SubLObjectFactory.makeString("invited"), (SubLObject)SubLObjectFactory.makeString("number")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("established"), (SubLObject)SubLObjectFactory.makeString("light")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("periods"), (SubLObject)SubLObjectFactory.makeString("censorship")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tell"), (SubLObject)SubLObjectFactory.makeString("same")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("paper"), (SubLObject)SubLObjectFactory.makeString("taken"), (SubLObject)SubLObjectFactory.makeString("catholic")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ways"), (SubLObject)SubLObjectFactory.makeString("aroused"), (SubLObject)SubLObjectFactory.makeString("found"), (SubLObject)SubLObjectFactory.makeString("sensitized"), (SubLObject)SubLObjectFactory.makeString("conspiratorially")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1945"), (SubLObject)SubLObjectFactory.makeString("adam"), (SubLObject)SubLObjectFactory.makeString("founded")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("despot"), (SubLObject)SubLObjectFactory.makeString("publish")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pax"), (SubLObject)SubLObjectFactory.makeString("refused")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("daily"), (SubLObject)SubLObjectFactory.makeString("warsaw"), (SubLObject)SubLObjectFactory.makeString("laureate"), (SubLObject)SubLObjectFactory.makeString("pages"), (SubLObject)SubLObjectFactory.makeString("literature"), (SubLObject)SubLObjectFactory.makeString("wyborcza")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("publishing"), (SubLObject)SubLObjectFactory.makeString("religion"), (SubLObject)SubLObjectFactory.makeString("politics")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("skirmished"), (SubLObject)SubLObjectFactory.makeString("jerzy")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pages"), (SubLObject)SubLObjectFactory.makeString("1980")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("editor"), (SubLObject)SubLObjectFactory.makeString("1951"), (SubLObject)SubLObjectFactory.makeString("church")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("literature"), (SubLObject)SubLObjectFactory.makeString("poem"), (SubLObject)SubLObjectFactory.makeString("devoted"), (SubLObject)SubLObjectFactory.makeString("thursday")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("newspaper"), (SubLObject)SubLObjectFactory.makeString("known")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("essayist"), (SubLObject)SubLObjectFactory.makeString("everything"), (SubLObject)SubLObjectFactory.makeString("moral"), (SubLObject)SubLObjectFactory.makeString("editorial")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("poems"), (SubLObject)SubLObjectFactory.makeString("election"), (SubLObject)SubLObjectFactory.makeString("time")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("election"), (SubLObject)SubLObjectFactory.makeString("closest")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("jerzy"), (SubLObject)SubLObjectFactory.makeString("nearly"), (SubLObject)SubLObjectFactory.makeString("became"), (SubLObject)SubLObjectFactory.makeString("vladivostok")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1986"), (SubLObject)SubLObjectFactory.makeString("never"), (SubLObject)SubLObjectFactory.makeString("free")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("mass"), (SubLObject)SubLObjectFactory.makeString("ii"), (SubLObject)SubLObjectFactory.makeString("celebrate")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("times"), (SubLObject)SubLObjectFactory.makeString("censors"), (SubLObject)SubLObjectFactory.makeString("articles"), (SubLObject)SubLObjectFactory.makeString("leaders"), (SubLObject)SubLObjectFactory.makeString("poles")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("turowicz"), (SubLObject)SubLObjectFactory.makeString("suffered"), (SubLObject)SubLObjectFactory.makeString("pope")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("added"), (SubLObject)SubLObjectFactory.makeString("powszechny")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1989"), (SubLObject)SubLObjectFactory.makeString("differed"), (SubLObject)SubLObjectFactory.makeString("nobel")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("troops"), (SubLObject)SubLObjectFactory.makeString("led"), (SubLObject)SubLObjectFactory.makeString("suppressed")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("practice"), (SubLObject)SubLObjectFactory.makeString("readers")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("church"), (SubLObject)SubLObjectFactory.makeString("communist"), (SubLObject)SubLObjectFactory.makeString("officials")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("invited"), (SubLObject)SubLObjectFactory.makeString("scale")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("communists"), (SubLObject)SubLObjectFactory.makeString("collaborating")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eight"), (SubLObject)SubLObjectFactory.makeString("front")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("paul"), (SubLObject)SubLObjectFactory.makeString("john")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("leadership"), (SubLObject)SubLObjectFactory.makeString("krakow"), (SubLObject)SubLObjectFactory.makeString("years")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("known"), (SubLObject)SubLObjectFactory.makeString("issues"), (SubLObject)SubLObjectFactory.makeString("poland")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("krakow"), (SubLObject)SubLObjectFactory.makeString("1945")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rational"), (SubLObject)SubLObjectFactory.makeString("intellectuals")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prayed"), (SubLObject)SubLObjectFactory.makeString("man")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("adam"), (SubLObject)SubLObjectFactory.makeString("sponsored"), (SubLObject)SubLObjectFactory.makeString("sapieha")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("catholic"), (SubLObject)SubLObjectFactory.makeString("wednesday")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("semitic"), (SubLObject)SubLObjectFactory.makeString("shunned")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1951"), (SubLObject)SubLObjectFactory.makeString("stalin"), (SubLObject)SubLObjectFactory.makeString("control"), (SubLObject)SubLObjectFactory.makeString("officials"), (SubLObject)SubLObjectFactory.makeString("church")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("wednesday"), (SubLObject)SubLObjectFactory.makeString("decades")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("taken"), (SubLObject)SubLObjectFactory.makeString("wednesday"), (SubLObject)SubLObjectFactory.makeString("called"), (SubLObject)SubLObjectFactory.makeString("catholic")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("moral"), (SubLObject)SubLObjectFactory.makeString("everything"), (SubLObject)SubLObjectFactory.makeString("1986"), (SubLObject)SubLObjectFactory.makeString("authority"), (SubLObject)SubLObjectFactory.makeString("annals"), (SubLObject)SubLObjectFactory.makeString("editorial")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("poland"), (SubLObject)SubLObjectFactory.makeString("issues"), (SubLObject)SubLObjectFactory.makeString("turowicz"), (SubLObject)SubLObjectFactory.makeString("pope")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("trouble"), (SubLObject)SubLObjectFactory.makeString("things")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("little"), (SubLObject)SubLObjectFactory.makeString("perspective"), (SubLObject)SubLObjectFactory.makeString("ways"), (SubLObject)SubLObjectFactory.makeString("leaders"), (SubLObject)SubLObjectFactory.makeString("times"), (SubLObject)SubLObjectFactory.makeString("poles")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("front"), (SubLObject)SubLObjectFactory.makeString("page")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("instituted"), (SubLObject)SubLObjectFactory.makeString("practice")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("time"), (SubLObject)SubLObjectFactory.makeString("election")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)SubLObjectFactory.makeString("worker")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("shown"), (SubLObject)SubLObjectFactory.makeString("slawomir")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("adding"), (SubLObject)SubLObjectFactory.makeString("view"), (SubLObject)SubLObjectFactory.makeString("shown"), (SubLObject)SubLObjectFactory.makeString("us"), (SubLObject)SubLObjectFactory.makeString("lies"), (SubLObject)SubLObjectFactory.makeString("playwright")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("say"), (SubLObject)SubLObjectFactory.makeString("article"), (SubLObject)SubLObjectFactory.makeString("essayist")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("poles"), (SubLObject)SubLObjectFactory.makeString("perspective"), (SubLObject)SubLObjectFactory.makeString("newspaper")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("provided"), (SubLObject)SubLObjectFactory.makeString("use"), (SubLObject)SubLObjectFactory.makeString("publication")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("suffered"), (SubLObject)SubLObjectFactory.makeString("attack")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("wyborcza"), (SubLObject)SubLObjectFactory.makeString("gazeta")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("john"), (SubLObject)SubLObjectFactory.makeString("brought"), (SubLObject)SubLObjectFactory.makeString("mass")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("attack"), (SubLObject)SubLObjectFactory.makeString("heart")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("believe"), (SubLObject)SubLObjectFactory.makeString("tell"), (SubLObject)SubLObjectFactory.makeString("adding")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("things"), (SubLObject)SubLObjectFactory.makeString("say")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("annals"), (SubLObject)SubLObjectFactory.makeString("tunnel"), (SubLObject)SubLObjectFactory.makeString("culture")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("called"), (SubLObject)SubLObjectFactory.makeString("result"), (SubLObject)SubLObjectFactory.makeString("group"), (SubLObject)SubLObjectFactory.makeString("pax"), (SubLObject)SubLObjectFactory.makeString("communists")), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("tunnel"), SubLObjectFactory.makeString("achievement"), SubLObjectFactory.makeString("based"), SubLObjectFactory.makeString("universal"), SubLObjectFactory.makeString("tygodnik"), SubLObjectFactory.makeString("name"), SubLObjectFactory.makeString("means"), SubLObjectFactory.makeString("precedent"), SubLObjectFactory.makeString("established"), SubLObjectFactory.makeString("provided"), SubLObjectFactory.makeString("added") }), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("nobel"), (SubLObject)SubLObjectFactory.makeString("including"), (SubLObject)SubLObjectFactory.makeString("daily"), (SubLObject)SubLObjectFactory.makeString("news"), (SubLObject)SubLObjectFactory.makeString("word"), (SubLObject)SubLObjectFactory.makeString("paul")), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("worker"), SubLObjectFactory.makeString("poznan"), SubLObjectFactory.makeString("hungarian"), SubLObjectFactory.makeString("troops"), SubLObjectFactory.makeString("new"), SubLObjectFactory.makeString("rebellion"), SubLObjectFactory.makeString("leadership"), SubLObjectFactory.makeString("credibility"), SubLObjectFactory.makeString("uprisings"), SubLObjectFactory.makeString("sought"), SubLObjectFactory.makeString("returned") }), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("andrzej"), (SubLObject)SubLObjectFactory.makeString("pseudonym")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("generations"), (SubLObject)SubLObjectFactory.makeString("paper"), (SubLObject)SubLObjectFactory.makeString("taken"), (SubLObject)SubLObjectFactory.makeString("commentator")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("articles"), (SubLObject)SubLObjectFactory.makeString("elsewhere"), (SubLObject)SubLObjectFactory.makeString("bloc"), (SubLObject)SubLObjectFactory.makeString("editor")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("use"), (SubLObject)SubLObjectFactory.makeString("andrzej"), (SubLObject)SubLObjectFactory.makeString("pieces"), (SubLObject)SubLObjectFactory.makeString("continued")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("closest"), (SubLObject)SubLObjectFactory.makeString("described"), (SubLObject)SubLObjectFactory.makeString("papacy"), (SubLObject)SubLObjectFactory.makeString("1978"), (SubLObject)SubLObjectFactory.makeString("prayed"), (SubLObject)SubLObjectFactory.makeString("friend"), (SubLObject)SubLObjectFactory.makeString("soul")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("officials"), (SubLObject)SubLObjectFactory.makeString("stalin"), (SubLObject)SubLObjectFactory.makeString("soviet")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("article"), (SubLObject)SubLObjectFactory.makeString("essayist"), (SubLObject)SubLObjectFactory.makeString("moral"), (SubLObject)SubLObjectFactory.makeString("periods"), (SubLObject)SubLObjectFactory.makeString("idiotism")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("deal"), (SubLObject)SubLObjectFactory.makeString("east")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1968"), (SubLObject)SubLObjectFactory.makeString("published")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pieces"), (SubLObject)SubLObjectFactory.makeString("ran"), (SubLObject)SubLObjectFactory.makeString("jawien")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bloc"), (SubLObject)SubLObjectFactory.makeString("deal")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("authority"), (SubLObject)SubLObjectFactory.makeString("rational")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("idiotism"), (SubLObject)SubLObjectFactory.makeString("kisielewski"), (SubLObject)SubLObjectFactory.makeString("featured")) }), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-QAGA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Jawien")))), (SubLObject)SubLObjectFactory.makeString("*TUROWICZ* ran it on the *FRONT* *PAGE* under a pseudonym Andrzej *JAWIEN* which the future pope continued to use on his pieces in the publication "), (SubLObject)SubLObjectFactory.makeString("He alone and nobody else lives in our hearts and symbolizes our dignity and pride said Al Musawir al Arabi *WEEKLY* in a *FRONT* *PAGE* editorial "), (SubLObject)SubLObjectFactory.makeString("He ordered it done and was given the metal *FRONT* *PAGE* press plate as a souvenir "), (SubLObject)SubLObjectFactory.makeString("A *FRONT* *PAGE* story of the first issue said that the exposition is profoundly and positively influencing the society and the economy in Yunnan ")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-GLIMPSE"), (SubLObject)SubLObjectFactory.makeString("Jawien")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE"), (SubLObject)SubLObjectFactory.makeString("19990128_NYT.dir"), (SubLObject)SubLObjectFactory.makeKeyword("ARTICLE"), (SubLObject)SubLObjectFactory.makeInteger(467), (SubLObject)SubLObjectFactory.makeKeyword("LINE"), (SubLObject)SubLObjectFactory.makeInteger(69), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeString("Turowicz ran it on the front page under a pseudonym, Andrzej Jawien, which the future pope continued to use on his pieces in the publication."))), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATE"), (SubLObject)SubLObjectFactory.makeString("August 3, 1966")), (SubLObject)SubLObjectFactory.makeInteger("19660803000000")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVOKE-WORDNET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("class"), (SubLObject)SubLObjectFactory.makeString("word")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pos"), (SubLObject)SubLObjectFactory.makeString("noun")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("form"), (SubLObject)SubLObjectFactory.makeString("sky")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("method"), (SubLObject)SubLObjectFactory.makeString("getSenses"))))), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENSE-PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SYNSET-PROXY"), (SubLObject)SubLObjectFactory.makeString("noun"), (SubLObject)SubLObjectFactory.makeInteger(7748403), (SubLObject)SubLObjectFactory.makeString("outer space as viewed from the earth")), (SubLObject)SubLObjectFactory.makeString("sky"))) });
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
    
    static {
        me = (SubLFile)new external_interfaces();
        external_interfaces.$quirk_host$ = null;
        external_interfaces.$quirk_port$ = null;
        external_interfaces.$talent_path$ = null;
        external_interfaces.$npp_default$ = null;
        external_interfaces.$shallow_parse_path$ = null;
        external_interfaces.$dependency_parse_path$ = null;
        external_interfaces.$guruqa_retrieve_passage_path$ = null;
        external_interfaces.$guruqa_answer_indexes_path$ = null;
        external_interfaces.$resporator_path$ = null;
        external_interfaces.$guruqa_wizard$ = null;
        external_interfaces.$dict_db_user$ = null;
        external_interfaces.$dict_db_passwd$ = null;
        external_interfaces.$dict_db$ = null;
        external_interfaces.$dict_host$ = null;
        external_interfaces.$dict_conn$ = null;
        external_interfaces.$dict_stmt$ = null;
        external_interfaces.$all_external_services$ = null;
        $str0$mongo_cyc_com = SubLObjectFactory.makeString("mongo.cyc.com");
        $int1$8080 = SubLObjectFactory.makeInteger(8080);
        $str2$_users_textract_showtalent = SubLObjectFactory.makeString("/users/textract/showtalent");
        $str3$_users_textract_sexpr_shallow = SubLObjectFactory.makeString("/users/textract/sexpr-shallow");
        $str4$_users_supertagger_sexprlda = SubLObjectFactory.makeString("/users/supertagger/sexprlda");
        $str5$_users_textract_documentWindow = SubLObjectFactory.makeString("/users/textract/documentWindow");
        $str6$_users_textract_guruqaIds = SubLObjectFactory.makeString("/users/textract/guruqaIds");
        $str7$_users_textract_sexprresporator = SubLObjectFactory.makeString("/users/textract/sexprresporator");
        $sym8$CYCL_GURUQA_QUERY_WIZARD = SubLObjectFactory.makeSymbol("CYCL-GURUQA-QUERY-WIZARD");
        $sym9$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const10$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str11$__mt___A = SubLObjectFactory.makeString("~&mt: ~A");
        $str12$__wiz___A = SubLObjectFactory.makeString("~&wiz: ~A");
        $str13$__cyc_expr___S_of_type__S = SubLObjectFactory.makeString("~&cyc-expr: ~S of type ~S");
        $sym14$HOLISTIC_GURUQA_QUERY = SubLObjectFactory.makeSymbol("HOLISTIC-GURUQA-QUERY");
        $str15$__guruqa_query_expr___A = SubLObjectFactory.makeString("~&guruqa query expr: ~A");
        $sym16$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str17$__guruqa_query_str___A = SubLObjectFactory.makeString("~&guruqa query str: ~A");
        $str18$_________________________________ = SubLObjectFactory.makeString("~%====================================================================");
        $str19$___A = SubLObjectFactory.makeString("~%~A");
        $str20$_____S = SubLObjectFactory.makeString("~%~%~S");
        $sym21$ASK = SubLObjectFactory.makeSymbol("ASK");
        $sym22$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $str23$___S = SubLObjectFactory.makeString("~%~S");
        $sym24$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw25$DOC = SubLObjectFactory.makeKeyword("DOC");
        $kw26$SENT = SubLObjectFactory.makeKeyword("SENT");
        $kw27$POST = SubLObjectFactory.makeKeyword("POST");
        $str28$query = SubLObjectFactory.makeString("query");
        $str29$text = SubLObjectFactory.makeString("text");
        $sym30$QUIRK_LEXICON = SubLObjectFactory.makeSymbol("QUIRK-LEXICON");
        $sym31$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $kw32$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym33$PERSON = SubLObjectFactory.makeSymbol("PERSON");
        $sym34$GET = SubLObjectFactory.makeSymbol("GET");
        $kw35$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $const36$PersonTypeByOccupation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonTypeByOccupation"));
        $str37$doc = SubLObjectFactory.makeString("doc");
        $str38$start = SubLObjectFactory.makeString("start");
        $str39$length = SubLObjectFactory.makeString("length");
        $str40$_P_ = SubLObjectFactory.makeString("<P>");
        $str41$__P_ = SubLObjectFactory.makeString("</P>");
        $kw42$LEN = SubLObjectFactory.makeKeyword("LEN");
        $str43$npp = SubLObjectFactory.makeString("npp");
        $str44$_users_supertagger_old_sexprlda = SubLObjectFactory.makeString("/users/supertagger_old/sexprlda");
        $sym45$STRIP_STEMS = SubLObjectFactory.makeSymbol("STRIP-STEMS");
        $kw46$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("S1"));
        $str48$ini = SubLObjectFactory.makeString("ini");
        $str49$mahler = SubLObjectFactory.makeString("mahler");
        $str50$ = SubLObjectFactory.makeString("");
        $str51$dict2 = SubLObjectFactory.makeString("dict2");
        $str52$elmore = SubLObjectFactory.makeString("elmore");
        $kw53$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw54$PORT = SubLObjectFactory.makeKeyword("PORT");
        $int55$9999 = SubLObjectFactory.makeInteger(9999);
        $kw56$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $str57$postgresql = SubLObjectFactory.makeString("postgresql");
        $str58$select_occurrences__documents__te = SubLObjectFactory.makeString("select occurrences, documents, term from dict where term = '~A' and corpus = 'AQUAINT-Corpus';");
        $str59$__ = SubLObjectFactory.makeString("''");
        $str60$_ = SubLObjectFactory.makeString("'");
        $sym61$LEMUR_QUERY = SubLObjectFactory.makeSymbol("LEMUR-QUERY");
        $sym62$GET_CORPUS_PATH_MAPPING = SubLObjectFactory.makeSymbol("GET-CORPUS-PATH-MAPPING");
        $str63$Unsupported_corpus__a = SubLObjectFactory.makeString("Unsupported corpus ~a");
        $str64$_inesgraph_cgi = SubLObjectFactory.makeString("/inesgraph.cgi");
        $sym65$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str66$___A_____ = SubLObjectFactory.makeString("~{~A~^ ~}");
        $str67$_qaga_cgi = SubLObjectFactory.makeString("/qaga.cgi");
        $str68$_applepie_cgi = SubLObjectFactory.makeString("/applepie.cgi");
        $str69$_minipar_cgi = SubLObjectFactory.makeString("/minipar.cgi");
        $str70$_bash_cgi = SubLObjectFactory.makeString("/bash.cgi");
        $str71$command = SubLObjectFactory.makeString("command");
        $str72$_parse_date_cgi = SubLObjectFactory.makeString("/parse-date.cgi");
        $str73$datestring = SubLObjectFactory.makeString("datestring");
        $str74$year = SubLObjectFactory.makeString("year");
        $str75$month = SubLObjectFactory.makeString("month");
        $str76$day = SubLObjectFactory.makeString("day");
        $str77$hour = SubLObjectFactory.makeString("hour");
        $str78$minute = SubLObjectFactory.makeString("minute");
        $str79$second = SubLObjectFactory.makeString("second");
        $str80$_qack_cgi = SubLObjectFactory.makeString("/qack.cgi");
        $str81$_wordnet_cgi = SubLObjectFactory.makeString("/wordnet.cgi");
        $kw82$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("type"), (SubLObject)SubLObjectFactory.makeString("q")));
        $str84$_questions_cgi = SubLObjectFactory.makeString("/questions.cgi");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("localhost"));
        $str86$Guest = SubLObjectFactory.makeString("Guest");
        $str87$_cgi_bin_users_mahler_check_cyc_s = SubLObjectFactory.makeString("/cgi-bin/users/mahler/check_cyc_servers.perl");
        $str88$servers = SubLObjectFactory.makeString("servers");
        $sym89$USER = SubLObjectFactory.makeSymbol("USER");
        $str90$_corpus_frequency_cgi = SubLObjectFactory.makeString("/corpus-frequency.cgi");
        $str91$dbfile = SubLObjectFactory.makeString("dbfile");
        $str92$word = SubLObjectFactory.makeString("word");
        $str93$pos = SubLObjectFactory.makeString("pos");
        $list94 = _constant_94_initializer();
        $int95$30 = SubLObjectFactory.makeInteger(30);
        $sym96$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
    }
}

/*

	Total time: 424 ms
	
*/