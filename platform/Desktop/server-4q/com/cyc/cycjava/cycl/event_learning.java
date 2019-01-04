package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class event_learning extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.event_learning";
    public static final String myFingerPrint = "1ddb8861a1a7a97e2429a1552bc953467d8b36fda4619306977d06e8fc3a3ee3";
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1256L)
    private static SubLSymbol $event_finding_query_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1384L)
    private static SubLSymbol $event_learning_indexes_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1507L)
    private static SubLSymbol $event_learning_cyclist$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1649L)
    private static SubLSymbol $event_learner_head_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLSymbol $dtp_event_document$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 5879L)
    private static SubLSymbol $get_all_subevents_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 6188L)
    private static SubLSymbol $get_all_scripted_subevent_types_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 7112L)
    public static SubLSymbol $search_term_relevancy_too_high$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 7314L)
    public static SubLSymbol $search_term_relevancy_too_low$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 7451L)
    public static SubLSymbol $search_term_relevancy_accept$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 29502L)
    private static SubLSymbol $get_phrases_for_differentiated_event_types_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 31722L)
    private static SubLSymbol $differentiating_genls_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 38971L)
    private static SubLSymbol $subevents$;
    private static final SubLObject $const0$InferencePSC;
    private static final SubLObject $const1$TheUser;
    private static final SubLObject $const2$EventLearnerHeadMt;
    private static final SubLSymbol $sym3$EVENT_DOCUMENT;
    private static final SubLSymbol $sym4$EVENT_DOCUMENT_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym10$EVENT_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$EVENT_DOC_CYCL;
    private static final SubLSymbol $sym13$_CSETF_EVENT_DOC_CYCL;
    private static final SubLSymbol $sym14$EVENT_DOC_URL;
    private static final SubLSymbol $sym15$_CSETF_EVENT_DOC_URL;
    private static final SubLSymbol $sym16$EVENT_DOC_STRING;
    private static final SubLSymbol $sym17$_CSETF_EVENT_DOC_STRING;
    private static final SubLSymbol $sym18$EVENT_DOC_HTML_STRING;
    private static final SubLSymbol $sym19$_CSETF_EVENT_DOC_HTML_STRING;
    private static final SubLSymbol $kw20$CYCL;
    private static final SubLSymbol $kw21$URL;
    private static final SubLSymbol $kw22$STRING;
    private static final SubLSymbol $kw23$HTML_STRING;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_EVENT_DOCUMENT;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_EVENT_DOCUMENT_METHOD;
    private static final SubLObject $const30$WebPageAtURLFn;
    private static final SubLObject $const31$URLFn;
    private static final SubLObject $const32$ContentMtOfCDAFromEventTypeFn;
    private static final SubLObject $const33$URLReferentFn;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$CDOLIST;
    private static final SubLSymbol $sym37$SENTENCIFY_STRING;
    private static final SubLSymbol $sym38$GET_EVENT_DOC_STRING;
    private static final SubLString $str39$;
    private static final SubLSymbol $kw40$INPUT;
    private static final SubLString $str41$Unable_to_open__S;
    private static final SubLString $str42$_;
    private static final SubLSymbol $kw43$BACKWARD;
    private static final SubLObject $const44$facilitates_EventEvent;
    private static final SubLString $str45$Invalid_search_direction__A__no_o;
    private static final SubLSymbol $kw46$DIRECTION;
    private static final SubLSymbol $kw47$SEED_EVENT;
    private static final SubLSymbol $kw48$EVENT;
    private static final SubLObject $const49$assertedSentence;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $kw52$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw53$NOT_PROVIDED;
    private static final SubLSymbol $sym54$LINKED;
    private static final SubLSymbol $sym55$EVENT_ROOT;
    private static final SubLSymbol $sym56$THE_DIRECTION;
    private static final SubLSymbol $sym57$CLET;
    private static final SubLSymbol $sym58$PWHEN;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$CSETQ;
    private static final SubLSymbol $sym61$DICTIONARY_LOOKUP;
    private static final SubLSymbol $sym62$PUNLESS;
    private static final SubLSymbol $sym63$ERROR;
    private static final SubLString $str64$Cannot_walk_event_graph_generated;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$WALK_GRAPH_BREADTH_FIRST;
    private static final SubLSymbol $sym67$GET_ALL_SUBEVENTS;
    private static final SubLSymbol $sym68$_EVENT;
    private static final SubLObject $const69$properSubEvents;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$_GET_ALL_SUBEVENTS_CACHING_STATE_;
    private static final SubLSymbol $sym73$GET_ALL_SCRIPTED_SUBEVENT_TYPES;
    private static final SubLSymbol $sym74$_SUB_TYPE;
    private static final SubLObject $const75$and;
    private static final SubLObject $const76$isa;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$_GET_ALL_SCRIPTED_SUBEVENT_TYPES_CACHING_STATE_;
    private static final SubLInteger $int80$1000;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$_;
    private static final SubLSymbol $sym83$LENGTH;
    private static final SubLSymbol $sym84$_;
    private static final SubLSymbol $sym85$SECOND;
    private static final SubLString $str86$Cyc_rejected___S;
    private static final SubLSymbol $kw87$CLEARED;
    private static final SubLSymbol $sym88$_MT;
    private static final SubLObject $const89$definingMt;
    private static final SubLList $list90;
    private static final SubLString $str91$No_semantic_MT_found_for__S__retu;
    private static final SubLSymbol $sym92$_SPINDLE;
    private static final SubLObject $const93$mtSpindleCollector;
    private static final SubLString $str94$Added__S_new_templates_to_the_EBM;
    private static final SubLSymbol $kw95$GAF;
    private static final SubLObject $const96$Event;
    private static final SubLObject $const97$SBHLTimePredicate;
    private static final SubLObject $const98$Role;
    private static final SubLObject $const99$subEvents;
    private static final SubLSymbol $kw100$UNPROVIDED;
    private static final SubLSymbol $sym101$WEBSTORE_INDEX_DOC_COUNT;
    private static final SubLSymbol $kw102$IGNORE;
    private static final SubLList $list103;
    private static final SubLObject $const104$ActorSlot;
    private static final SubLSymbol $sym105$_HEAD;
    private static final SubLObject $const106$mtSpindleHead;
    private static final SubLList $list107;
    private static final SubLObject $const108$mtSpindleMember;
    private static final SubLString $str109$Failed_to_assert___S_in__S;
    private static final SubLSymbol $sym110$INDEXICAL_P;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$PROPER_SUPERSTRING_;
    private static final SubLSymbol $kw114$ALL;
    private static final SubLList $list115;
    private static final SubLObject $const116$Date;
    private static final SubLSymbol $sym117$GENERATE_ENGLISH_DAY_NAUT;
    private static final SubLObject $const118$Relation;
    private static final SubLObject $const119$Collection;
    private static final SubLSymbol $sym120$CYCL_EVENT_P;
    private static final SubLSymbol $sym121$FIRST;
    private static final SubLSymbol $sym122$GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$_STRING;
    private static final SubLObject $const125$termPhrases;
    private static final SubLList $list126;
    private static final SubLObject $const127$MtUnionFn;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$_GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES_CACHING_STATE_;
    private static final SubLSymbol $sym130$DIFFERENTIATING_GENLS;
    private static final SubLSymbol $kw131$GENL;
    private static final SubLObject $const132$genls;
    private static final SubLList $list133;
    private static final SubLObject $const134$unknownSentence;
    private static final SubLObject $const135$thereExists;
    private static final SubLSymbol $sym136$_OTHER_TYPE;
    private static final SubLObject $const137$elementOf;
    private static final SubLObject $const138$TheSet;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$_DIFFERENTIATING_GENLS_CACHING_STATE_;
    private static final SubLSymbol $sym141$CLEAR_DIFFERENTIATING_GENLS;
    private static final SubLSymbol $sym142$GET_STRING;
    private static final SubLSymbol $sym143$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str144$__;
    private static final SubLString $str145$_;
    private static final SubLSymbol $kw146$GENERAL;
    private static final SubLSymbol $kw147$SPECIFIC;
    private static final SubLSymbol $sym148$LAMBDA_SUBEVENT_;
    private static final SubLObject $const149$TheFn;
    private static final SubLString $str150$No_substitution_done_for__S;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$PREDICATE_P;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$GREATER_LENGTH_P;
    private static final SubLList $list155;
    private static final SubLString $str156$Failed_to_assert__S_in__S_because;
    private static final SubLString $str157$GatheredEvent;
    private static final SubLSymbol $kw158$UPCASE;
    private static final SubLString $str159$Failed_to_assert___S_in__S__;
    private static final SubLString $str160$NOT_WFF___S__;
    private static final SubLSymbol $sym161$SEARCH;
    private static final SubLString $str162$_s_is_not_present_in_input_linkag;
    private static final SubLSymbol $sym163$WORDS;
    private static final SubLSymbol $sym164$LINK_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject event_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)event_learning.ZERO_INTEGER);
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject event_document_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $event_document_native.class) ? event_learning.T : event_learning.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject event_doc_cycl(final SubLObject v_object) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject event_doc_url(final SubLObject v_object) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject event_doc_string(final SubLObject v_object) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject event_doc_html_string(final SubLObject v_object) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject _csetf_event_doc_cycl(final SubLObject v_object, final SubLObject value) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject _csetf_event_doc_url(final SubLObject v_object, final SubLObject value) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject _csetf_event_doc_string(final SubLObject v_object, final SubLObject value) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject _csetf_event_doc_html_string(final SubLObject v_object, final SubLObject value) {
        assert event_learning.NIL != event_document_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject make_event_document(SubLObject arglist) {
        if (arglist == event_learning.UNPROVIDED) {
            arglist = (SubLObject)event_learning.NIL;
        }
        final SubLObject v_new = (SubLObject)new $event_document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)event_learning.NIL, next = arglist; event_learning.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)event_learning.$kw20$CYCL)) {
                _csetf_event_doc_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_learning.$kw21$URL)) {
                _csetf_event_doc_url(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_learning.$kw22$STRING)) {
                _csetf_event_doc_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_learning.$kw23$HTML_STRING)) {
                _csetf_event_doc_html_string(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)event_learning.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject visit_defstruct_event_document(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)event_learning.$kw25$BEGIN, (SubLObject)event_learning.$sym26$MAKE_EVENT_DOCUMENT, (SubLObject)event_learning.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)event_learning.$kw27$SLOT, (SubLObject)event_learning.$kw20$CYCL, event_doc_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_learning.$kw27$SLOT, (SubLObject)event_learning.$kw21$URL, event_doc_url(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_learning.$kw27$SLOT, (SubLObject)event_learning.$kw22$STRING, event_doc_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_learning.$kw27$SLOT, (SubLObject)event_learning.$kw23$HTML_STRING, event_doc_html_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_learning.$kw28$END, (SubLObject)event_learning.$sym26$MAKE_EVENT_DOCUMENT, (SubLObject)event_learning.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1718L)
    public static SubLObject visit_defstruct_object_event_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_document(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 1867L)
    public static SubLObject new_event_document(final SubLObject url, SubLObject string) {
        if (string == event_learning.UNPROVIDED) {
            string = (SubLObject)event_learning.NIL;
        }
        final SubLObject doc = make_event_document((SubLObject)event_learning.UNPROVIDED);
        final SubLObject cycl = (SubLObject)ConsesLow.list(event_learning.$const30$WebPageAtURLFn, (SubLObject)ConsesLow.list(event_learning.$const31$URLFn, url));
        _csetf_event_doc_url(doc, url);
        _csetf_event_doc_string(doc, string);
        _csetf_event_doc_cycl(doc, cycl);
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 2235L)
    public static SubLObject get_event_doc_string(final SubLObject doc) {
        return event_doc_string(doc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 2345L)
    public static SubLObject get_event_doc_url(final SubLObject doc) {
        return event_doc_url(doc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 2449L)
    public static SubLObject get_event_doc_content_mt(final SubLObject doc) {
        return narts_high.nart_substitute((SubLObject)ConsesLow.listS(event_learning.$const32$ContentMtOfCDAFromEventTypeFn, (SubLObject)ConsesLow.list(event_learning.$const33$URLReferentFn, get_event_doc_url(doc)), (SubLObject)event_learning.$list34));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 2680L)
    public static SubLObject set_event_doc_string(final SubLObject doc, final SubLObject string) {
        _csetf_event_doc_string(doc, string);
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 2840L)
    public static SubLObject set_event_doc_url(final SubLObject doc, final SubLObject url) {
        _csetf_event_doc_url(doc, url);
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 2985L)
    public static SubLObject do_event_doc_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence_var = (SubLObject)event_learning.NIL;
        SubLObject doc = (SubLObject)event_learning.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list35);
        sentence_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list35);
        doc = current.first();
        current = current.rest();
        if (event_learning.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)event_learning.$sym36$CDOLIST, (SubLObject)ConsesLow.list(sentence_var, (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym37$SENTENCIFY_STRING, (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym38$GET_EVENT_DOC_STRING, doc))), ConsesLow.append(body, (SubLObject)event_learning.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_learning.$list35);
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 3207L)
    public static SubLObject event_document_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject line_no = (SubLObject)event_learning.ZERO_INTEGER;
        SubLObject doc_string = (SubLObject)event_learning.$str39$;
        SubLObject url = (SubLObject)event_learning.NIL;
        SubLObject stream = (SubLObject)event_learning.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)event_learning.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)event_learning.$kw40$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)event_learning.$str41$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$1 = stream_var;
                SubLObject line_number_var = (SubLObject)event_learning.NIL;
                SubLObject line = (SubLObject)event_learning.NIL;
                line_number_var = (SubLObject)event_learning.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$1); event_learning.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$1)) {
                    line_no = Numbers.add(line_no, (SubLObject)event_learning.ONE_INTEGER);
                    if (line_no.numE((SubLObject)event_learning.THREE_INTEGER)) {
                        if (event_learning.NIL != string_utilities.empty_string_p(line)) {
                            url = file;
                        }
                        else {
                            url = line;
                        }
                    }
                    if (line_no.numG((SubLObject)event_learning.SEVEN_INTEGER)) {
                        doc_string = Sequences.cconcatenate(doc_string, new SubLObject[] { event_learning.$str42$_, line });
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)event_learning.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)event_learning.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return new_event_document(url, doc_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 3696L)
    public static SubLObject gather_event_graph_from_seed(final SubLObject seed_event, final SubLObject elmt, SubLObject direction, SubLObject predicate) {
        if (direction == event_learning.UNPROVIDED) {
            direction = (SubLObject)event_learning.$kw43$BACKWARD;
        }
        if (predicate == event_learning.UNPROVIDED) {
            predicate = event_learning.$const44$facilitates_EventEvent;
        }
        if (direction != event_learning.$kw43$BACKWARD) {
            Errors.error((SubLObject)event_learning.$str45$Invalid_search_direction__A__no_o, direction);
        }
        final SubLObject v_graph = dictionary.new_dictionary((SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        dictionary.dictionary_enter(v_graph, (SubLObject)event_learning.$kw46$DIRECTION, direction);
        dictionary.dictionary_enter(v_graph, (SubLObject)event_learning.$kw47$SEED_EVENT, seed_event);
        final SubLObject seen = set.new_set((SubLObject)event_learning.EQL, (SubLObject)event_learning.UNPROVIDED);
        final SubLObject todo = queues.create_queue((SubLObject)event_learning.UNPROVIDED);
        queues.enqueue(seed_event, todo);
        set.set_add(seed_event, seen);
        while (event_learning.NIL == queues.queue_empty_p(todo)) {
            SubLObject current = (SubLObject)event_learning.NIL;
            SubLObject chained = (SubLObject)event_learning.NIL;
            current = queues.dequeue(todo);
            final SubLObject variable_token = (SubLObject)event_learning.$kw48$EVENT;
            final SubLObject sentence = el_utilities.make_unary_formula(event_learning.$const49$assertedSentence, el_utilities.make_binary_formula(predicate, variable_token, current));
            chained = ask_utilities.query_variable(variable_token, sentence, elmt, (SubLObject)event_learning.UNPROVIDED);
            dictionary.dictionary_enter(v_graph, current, chained);
            SubLObject cdolist_list_var = chained;
            SubLObject child = (SubLObject)event_learning.NIL;
            child = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                if (event_learning.NIL == set.set_memberP(child, seen)) {
                    set.set_add(child, seen);
                    queues.enqueue(child, todo);
                }
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
        }
        return v_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 4841L)
    public static SubLObject walk_event_graph(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject current_$2 = (SubLObject)event_learning.NIL;
        SubLObject event_graph = (SubLObject)event_learning.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list50);
        current_$2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list50);
        event_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)event_learning.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)event_learning.NIL;
        SubLObject current_$3 = (SubLObject)event_learning.NIL;
        while (event_learning.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_learning.$list50);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)event_learning.$list50);
            if (event_learning.NIL == conses_high.member(current_$3, (SubLObject)event_learning.$list51, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                bad = (SubLObject)event_learning.T;
            }
            if (current_$3 == event_learning.$kw52$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (event_learning.NIL != bad && event_learning.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_learning.$list50);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)event_learning.$kw46$DIRECTION, current);
        final SubLObject direction = (SubLObject)((event_learning.NIL != direction_tail) ? conses_high.cadr(direction_tail) : event_learning.$kw53$NOT_PROVIDED);
        final SubLObject body;
        current = (body = temp);
        final SubLObject linked = (SubLObject)event_learning.$sym54$LINKED;
        final SubLObject event_root = (SubLObject)event_learning.$sym55$EVENT_ROOT;
        final SubLObject the_direction = (SubLObject)event_learning.$sym56$THE_DIRECTION;
        return (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym57$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(the_direction, direction)), (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym58$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)event_learning.EQ, the_direction, (SubLObject)event_learning.$list59), (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym60$CSETQ, the_direction, (SubLObject)ConsesLow.listS((SubLObject)event_learning.$sym61$DICTIONARY_LOOKUP, event_graph, (SubLObject)event_learning.$list51))), (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym62$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)event_learning.EQ, the_direction, (SubLObject)ConsesLow.listS((SubLObject)event_learning.$sym61$DICTIONARY_LOOKUP, event_graph, (SubLObject)event_learning.$list51)), (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym63$ERROR, (SubLObject)event_learning.$str64$Cannot_walk_event_graph_generated, (SubLObject)ConsesLow.listS((SubLObject)event_learning.$sym61$DICTIONARY_LOOKUP, event_graph, (SubLObject)event_learning.$list51), the_direction)), (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym57$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(event_root, (SubLObject)ConsesLow.listS((SubLObject)event_learning.$sym61$DICTIONARY_LOOKUP, event_graph, (SubLObject)event_learning.$list65))), (SubLObject)ConsesLow.listS((SubLObject)event_learning.$sym66$WALK_GRAPH_BREADTH_FIRST, (SubLObject)ConsesLow.list(event_root, current_$2, linked), (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym60$CSETQ, linked, (SubLObject)ConsesLow.list((SubLObject)event_learning.$sym61$DICTIONARY_LOOKUP, event_graph, current_$2)), ConsesLow.append(body, (SubLObject)event_learning.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 5754L)
    public static SubLObject is_root_of_event_graph_p(final SubLObject v_term, final SubLObject event_graph) {
        return Equality.eq(v_term, dictionary.dictionary_lookup(event_graph, (SubLObject)event_learning.$kw47$SEED_EVENT, (SubLObject)event_learning.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 5879L)
    public static SubLObject clear_get_all_subevents() {
        final SubLObject cs = event_learning.$get_all_subevents_caching_state$.getGlobalValue();
        if (event_learning.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 5879L)
    public static SubLObject remove_get_all_subevents(final SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args(event_learning.$get_all_subevents_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(event), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 5879L)
    public static SubLObject get_all_subevents_internal(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable((SubLObject)event_learning.$sym68$_EVENT, (SubLObject)ConsesLow.listS(event_learning.$const69$properSubEvents, event, (SubLObject)event_learning.$list70), event_learning.$event_finding_query_mt$.getDynamicValue(thread), (SubLObject)event_learning.$list71);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 5879L)
    public static SubLObject get_all_subevents(final SubLObject event) {
        SubLObject caching_state = event_learning.$get_all_subevents_caching_state$.getGlobalValue();
        if (event_learning.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)event_learning.$sym67$GET_ALL_SUBEVENTS, (SubLObject)event_learning.$sym72$_GET_ALL_SUBEVENTS_CACHING_STATE_, (SubLObject)event_learning.TEN_INTEGER, (SubLObject)event_learning.EQ, (SubLObject)event_learning.ONE_INTEGER, (SubLObject)event_learning.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, event, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_all_subevents_internal(event)));
            memoization_state.caching_state_put(caching_state, event, results, (SubLObject)event_learning.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 6188L)
    public static SubLObject clear_get_all_scripted_subevent_types() {
        final SubLObject cs = event_learning.$get_all_scripted_subevent_types_caching_state$.getGlobalValue();
        if (event_learning.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 6188L)
    public static SubLObject remove_get_all_scripted_subevent_types(final SubLObject event) {
        return memoization_state.caching_state_remove_function_results_with_args(event_learning.$get_all_scripted_subevent_types_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(event), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 6188L)
    public static SubLObject get_all_scripted_subevent_types_internal(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subevent_types = ask_utilities.query_variable((SubLObject)event_learning.$sym74$_SUB_TYPE, (SubLObject)ConsesLow.listS(event_learning.$const75$and, (SubLObject)ConsesLow.listS(event_learning.$const76$isa, event, (SubLObject)event_learning.$list77), (SubLObject)event_learning.$list78), event_learning.$event_finding_query_mt$.getDynamicValue(thread), (SubLObject)event_learning.UNPROVIDED);
        subevent_types = Sequences.cconcatenate(isa.min_isa(event, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED), subevent_types);
        return subevent_types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 6188L)
    public static SubLObject get_all_scripted_subevent_types(final SubLObject event) {
        SubLObject caching_state = event_learning.$get_all_scripted_subevent_types_caching_state$.getGlobalValue();
        if (event_learning.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)event_learning.$sym73$GET_ALL_SCRIPTED_SUBEVENT_TYPES, (SubLObject)event_learning.$sym79$_GET_ALL_SCRIPTED_SUBEVENT_TYPES_CACHING_STATE_, (SubLObject)event_learning.TEN_INTEGER, (SubLObject)event_learning.EQ, (SubLObject)event_learning.ONE_INTEGER, (SubLObject)event_learning.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, event, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_all_scripted_subevent_types_internal(event)));
            memoization_state.caching_state_put(caching_state, event, results, (SubLObject)event_learning.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 6806L)
    public static SubLObject best_docs_for_search_strings(final SubLObject search_strings) {
        final SubLObject docs = (SubLObject)event_learning.NIL;
        return docs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 7597L)
    public static SubLObject best_docs_for_search_terms(final SubLObject search_terms) {
        final SubLObject file_infos = best_files_for_search_terms(search_terms);
        SubLObject documents = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = file_infos;
        SubLObject file_info = (SubLObject)event_learning.NIL;
        file_info = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject file = file_info.first();
            documents = (SubLObject)ConsesLow.cons(event_document_from_file(file), documents);
            cdolist_list_var = cdolist_list_var.rest();
            file_info = cdolist_list_var.first();
        }
        return Sequences.nreverse(documents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 7910L)
    public static SubLObject best_files_for_search_terms(final SubLObject search_terms) {
        final SubLObject file_ranking = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject ranked_list = cdolist_list_var = get_ranked_search_term_list(search_terms);
        SubLObject ranking = (SubLObject)event_learning.NIL;
        ranking = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ranking;
            SubLObject v_term = (SubLObject)event_learning.NIL;
            SubLObject count = (SubLObject)event_learning.NIL;
            SubLObject search_term = (SubLObject)event_learning.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list81);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list81);
            count = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list81);
            search_term = current.first();
            current = current.rest();
            if (event_learning.NIL == current) {
                SubLObject cdolist_list_var_$4;
                final SubLObject files = cdolist_list_var_$4 = lucene_index.ws_index_search_for_pathnames(lucene_index.lucene_symbolic_query_to_string(search_term), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
                SubLObject file = (SubLObject)event_learning.NIL;
                file = cdolist_list_var_$4.first();
                while (event_learning.NIL != cdolist_list_var_$4) {
                    dictionary_utilities.dictionary_push(file_ranking, file, ranking);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    file = cdolist_list_var_$4.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_learning.$list81);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ranking = cdolist_list_var.first();
        }
        final SubLObject final_ranking = dictionary_utilities.dictionary_to_alist(file_ranking);
        return Sort.sort(final_ranking, Symbols.symbol_function((SubLObject)event_learning.$sym82$_), Symbols.symbol_function((SubLObject)event_learning.$sym83$LENGTH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 8769L)
    public static SubLObject get_ranked_search_term_list(final SubLObject search_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ranked_list = (SubLObject)event_learning.NIL;
        final SubLObject search_term_to_term = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_terms)); event_learning.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject search_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (!search_term.isFixnum()) {
                dictionary.dictionary_enter(search_term_to_term, search_term, v_term);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(search_terms)); event_learning.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject search_term2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (count.isFixnum() && count.isPositive()) {
                final SubLObject v_term2 = dictionary.dictionary_lookup(search_term_to_term, search_term2, search_term2);
                ranked_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term2, count, search_term2), ranked_list);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(ranked_list, Symbols.symbol_function((SubLObject)event_learning.$sym84$_), Symbols.symbol_function((SubLObject)event_learning.$sym85$SECOND));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 9448L)
    public static SubLObject event_learner_assert(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assert_result = (SubLObject)event_learning.NIL;
        SubLObject error = (SubLObject)event_learning.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(event_learning.$event_learning_cyclist$.getDynamicValue(thread), thread);
            thread.resetMultipleValues();
            final SubLObject assert_result_$5 = ke.ke_assert_now(formula, mt, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            final SubLObject error_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            assert_result = assert_result_$5;
            error = error_$6;
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return Values.values(assert_result, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 9711L)
    public static SubLObject extract_event_facts_from_doc(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject facts = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = document.sentencify_string(get_event_doc_string(doc));
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject interpretations = el_utilities.remove_el_duplicates(ebmt_template_parser.ebmt_parse(sentence, event_learning.$event_learner_head_mt$.getDynamicValue(thread), (SubLObject)event_learning.NIL), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            if (event_learning.NIL != interpretations) {
                facts = (SubLObject)ConsesLow.cons(interpretations, facts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return facts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 10139L)
    public static SubLObject best_interpretations_of_facts(final SubLObject facts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_facts = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = facts;
        SubLObject interpretations = (SubLObject)event_learning.NIL;
        interpretations = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject best_interpretations = (SubLObject)event_learning.NIL;
            SubLObject doneP = (SubLObject)event_learning.NIL;
            if (event_learning.NIL == doneP) {
                SubLObject csome_list_var = interpretations;
                SubLObject interpretation = (SubLObject)event_learning.NIL;
                interpretation = csome_list_var.first();
                while (event_learning.NIL == doneP && event_learning.NIL != csome_list_var) {
                    if (event_learning.NIL != rkf_query_utilities.rkf_known(interpretation, event_learning.$event_learner_head_mt$.getDynamicValue(thread), (SubLObject)event_learning.UNPROVIDED)) {
                        best_interpretations = (SubLObject)ConsesLow.list(interpretation);
                        doneP = (SubLObject)event_learning.T;
                    }
                    else if (event_learning.NIL != rkf_contradiction_finder.rkf_rejected(interpretation, event_learning.$event_learner_head_mt$.getDynamicValue(thread), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                        Errors.warn((SubLObject)event_learning.$str86$Cyc_rejected___S, interpretation);
                    }
                    else {
                        final SubLObject item_var = interpretation;
                        if (event_learning.NIL == conses_high.member(item_var, best_interpretations, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                            best_interpretations = (SubLObject)ConsesLow.cons(item_var, best_interpretations);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    interpretation = csome_list_var.first();
                }
            }
            if (event_learning.NIL != best_interpretations) {
                final SubLObject item_var2 = Sequences.nreverse(best_interpretations).first();
                if (event_learning.NIL == conses_high.member(item_var2, best_facts, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                    best_facts = (SubLObject)ConsesLow.cons(item_var2, best_facts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interpretations = cdolist_list_var.first();
        }
        return best_facts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 11207L)
    public static SubLObject clear_all_event_learning_caches() {
        clear_get_phrases_for_differentiated_event_types();
        clear_differentiating_genls();
        clear_get_all_subevents();
        clear_get_all_scripted_subevent_types();
        return (SubLObject)event_learning.$kw87$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 11432L)
    public static SubLObject event_learning_semantic_mt(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject semantic_mt = ask_utilities.query_variable((SubLObject)event_learning.$sym88$_MT, (SubLObject)ConsesLow.listS(event_learning.$const89$definingMt, event, (SubLObject)event_learning.$list90), event_learning.$const0$InferencePSC, (SubLObject)event_learning.UNPROVIDED).first();
        if (event_learning.NIL == semantic_mt) {
            Errors.warn((SubLObject)event_learning.$str91$No_semantic_MT_found_for__S__retu, event, mt_relevance_macros.$mt$.getDynamicValue(thread));
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        return semantic_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 12072L)
    public static SubLObject gather_facts_from_seed_event(final SubLObject event) {
        final SubLObject semantic_mt = event_learning_semantic_mt(event);
        final SubLObject event_source_spindle = ask_utilities.query_variable((SubLObject)event_learning.$sym92$_SPINDLE, (SubLObject)ConsesLow.list(event_learning.$const93$mtSpindleCollector, (SubLObject)event_learning.$sym92$_SPINDLE, semantic_mt), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED).first();
        return gather_more_facts_about_seed_event(event, semantic_mt, event_source_spindle);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 12495L)
    public static SubLObject gather_more_facts_about_seed_event(final SubLObject event, final SubLObject semantic_mt, final SubLObject event_source_spindle) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject overall_confirmed_facts = (SubLObject)event_learning.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject known_facts = represented_facts_for_event(event);
            final SubLObject search_strings = search_strings_for_sentences_and_event(known_facts, event);
            final SubLObject documents = best_docs_for_search_strings(search_strings);
            SubLObject enoughP = (SubLObject)event_learning.NIL;
            SubLObject list_var = (SubLObject)event_learning.NIL;
            SubLObject v_document = (SubLObject)event_learning.NIL;
            SubLObject doc_num = (SubLObject)event_learning.NIL;
            list_var = documents;
            v_document = list_var.first();
            for (doc_num = (SubLObject)event_learning.ZERO_INTEGER; event_learning.NIL == enoughP && event_learning.NIL != list_var; list_var = list_var.rest(), v_document = list_var.first(), doc_num = Numbers.add((SubLObject)event_learning.ONE_INTEGER, doc_num)) {
                thread.resetMultipleValues();
                final SubLObject confirmed_facts = learn_new_templates_for_known_facts(v_document, known_facts, event);
                final SubLObject num_new_templates = thread.secondMultipleValue();
                thread.resetMultipleValues();
                overall_confirmed_facts = Sequences.cconcatenate(confirmed_facts, overall_confirmed_facts);
                if (Sequences.length(overall_confirmed_facts).numGE(Sequences.length(known_facts))) {
                    enoughP = (SubLObject)event_learning.T;
                }
                Errors.warn((SubLObject)event_learning.$str94$Added__S_new_templates_to_the_EBM, num_new_templates);
            }
            SubLObject cdolist_list_var = documents;
            v_document = (SubLObject)event_learning.NIL;
            v_document = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                learn_new_facts_for_event_in_document(event, v_document, event_source_spindle);
                cdolist_list_var = cdolist_list_var.rest();
                v_document = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return overall_confirmed_facts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 14300L)
    public static SubLObject get_represented_facts_for_event(final SubLObject event, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)event_learning.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            results = represented_facts_for_event(event);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 14630L)
    public static SubLObject get_search_strings_for_represented_event(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == event_learning.UNPROVIDED) {
            facts = (SubLObject)event_learning.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (event_learning.NIL == facts) {
            facts = get_represented_facts_for_event(event, elmt);
        }
        SubLObject search_strings = (SubLObject)event_learning.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            search_strings = search_strings_for_sentences_and_event(facts, event);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return search_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 15224L)
    public static SubLObject get_search_terms_for_represented_event(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == event_learning.UNPROVIDED) {
            facts = (SubLObject)event_learning.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (event_learning.NIL == facts) {
            facts = get_represented_facts_for_event(event, elmt);
        }
        SubLObject search_terms = (SubLObject)event_learning.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(elmt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            search_terms = search_terms_for_sentences_and_event(facts, event, (SubLObject)event_learning.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return search_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 15808L)
    public static SubLObject get_best_documents_for_represented_event_via_terms(final SubLObject event, final SubLObject elmt, SubLObject facts) {
        if (facts == event_learning.UNPROVIDED) {
            facts = (SubLObject)event_learning.NIL;
        }
        final SubLObject search_terms = get_search_terms_for_represented_event(event, elmt, facts);
        return best_docs_for_search_terms(search_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 16042L)
    public static SubLObject represented_facts_for_event(final SubLObject event) {
        SubLObject subevents = get_all_subevents(event);
        SubLObject subevent_types = get_all_scripted_subevent_types(event);
        SubLObject sentences = (SubLObject)event_learning.NIL;
        if (event_learning.NIL == conses_high.member(event, subevents, Symbols.symbol_function((SubLObject)event_learning.EQL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
            subevents = (SubLObject)ConsesLow.cons(event, subevents);
        }
        subevent_types = conses_high.union(cycl_utilities.hl_to_el(isa.min_isa(event, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)), subevent_types, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED);
        SubLObject cdolist_list_var = subevents;
        SubLObject subevent = (SubLObject)event_learning.NIL;
        subevent = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            if (event_learning.NIL != conses_high.intersection(cycl_utilities.hl_to_el(isa.all_isa(subevent, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)), subevent_types, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED)) {
                final SubLObject pred_var = (SubLObject)event_learning.NIL;
                if (event_learning.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(subevent, (SubLObject)event_learning.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(subevent, (SubLObject)event_learning.NIL, pred_var);
                    SubLObject done_var = (SubLObject)event_learning.NIL;
                    final SubLObject token_var = (SubLObject)event_learning.NIL;
                    while (event_learning.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (event_learning.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)event_learning.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)event_learning.$kw95$GAF, (SubLObject)event_learning.NIL, (SubLObject)event_learning.NIL);
                                SubLObject done_var_$7 = (SubLObject)event_learning.NIL;
                                final SubLObject token_var_$8 = (SubLObject)event_learning.NIL;
                                while (event_learning.NIL == done_var_$7) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                    final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(assertion));
                                    if (event_learning.NIL != valid_$9) {
                                        final SubLObject arg0 = cycl_utilities.formula_arg0(assertion);
                                        final SubLObject arg2 = cycl_utilities.formula_arg2(assertion, (SubLObject)event_learning.UNPROVIDED);
                                        if ((event_learning.NIL != genl_predicates.genl_predP(arg0, event_learning.$const76$isa, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) && event_learning.NIL != genls.genlP(arg2, event_learning.$const96$Event, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) || event_learning.NIL != isa.isaP(arg0, event_learning.$const97$SBHLTimePredicate, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) || event_learning.NIL != isa.isaP(arg0, event_learning.$const98$Role, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) || event_learning.NIL != genl_predicates.genl_predP(arg0, event_learning.$const99$subEvents, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                                            final SubLObject item_var = uncanonicalizer.assertion_el_formula(assertion);
                                            if (event_learning.NIL == conses_high.member(item_var, sentences, (SubLObject)event_learning.EQUALP, Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                                                sentences = (SubLObject)ConsesLow.cons(item_var, sentences);
                                            }
                                        }
                                    }
                                    done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(event_learning.NIL == valid_$9);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)event_learning.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (event_learning.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(event_learning.NIL == valid);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subevent = cdolist_list_var.first();
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 17289L)
    public static SubLObject webstore_index_doc_count(final SubLObject query, SubLObject host, SubLObject port) {
        if (host == event_learning.UNPROVIDED) {
            host = (SubLObject)event_learning.$kw100$UNPROVIDED;
        }
        if (port == event_learning.UNPROVIDED) {
            port = (SubLObject)event_learning.$kw100$UNPROVIDED;
        }
        final SubLObject query_string = lucene_index.lucene_symbolic_query_to_string(query);
        if (event_learning.$kw100$UNPROVIDED == host) {
            host = lucene_index.get_ws_index_host();
        }
        if (event_learning.$kw100$UNPROVIDED == port) {
            port = lucene_index.get_ws_index_port();
        }
        return lucene_index.ws_index_count(query_string, host, port);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 17771L)
    public static SubLObject search_terms_for_sentences_and_event(final SubLObject sentences, final SubLObject event, SubLObject doc_count_fn) {
        if (doc_count_fn == event_learning.UNPROVIDED) {
            doc_count_fn = (SubLObject)event_learning.NIL;
        }
        if (event_learning.NIL == doc_count_fn) {
            doc_count_fn = Symbols.symbol_function((SubLObject)event_learning.$sym101$WEBSTORE_INDEX_DOC_COUNT);
        }
        final SubLObject terms_seen = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
        SubLObject cdolist_list_var = pph_utilities.pph_salient_generalizations(event, (SubLObject)event_learning.THREE_INTEGER, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        SubLObject event_type = (SubLObject)event_learning.NIL;
        event_type = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            potentially_add_term_for_searching(event_type, terms_seen, doc_count_fn);
            cdolist_list_var = cdolist_list_var.rest();
            event_type = cdolist_list_var.first();
        }
        cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10;
            final SubLObject terms = cdolist_list_var_$10 = cycl_utilities.formula_terms(sentence, (SubLObject)event_learning.$kw102$IGNORE);
            SubLObject v_term = (SubLObject)event_learning.NIL;
            v_term = cdolist_list_var_$10.first();
            while (event_learning.NIL != cdolist_list_var_$10) {
                potentially_add_term_for_searching(v_term, terms_seen, doc_count_fn);
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                v_term = cdolist_list_var_$10.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return terms_seen;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 18545L)
    public static SubLObject potentially_add_term_for_searching(final SubLObject v_term, final SubLObject terms_seen, final SubLObject doc_count_fn) {
        if (event_learning.NIL == dictionary.dictionary_lookup(terms_seen, v_term, (SubLObject)event_learning.UNPROVIDED)) {
            SubLObject search_term = v_term;
            if (event_learning.NIL != date_utilities.date_p(search_term)) {
                final SubLObject range_start = date_utilities.date_before(search_term, (SubLObject)event_learning.$list103);
                search_term = lucene_index.construct_symbolic_terminus_post_quem_query(range_start);
            }
            final SubLObject count = Functions.funcall(doc_count_fn, search_term);
            dictionary.dictionary_enter(terms_seen, search_term, count);
            if (!search_term.eql(v_term)) {
                dictionary.dictionary_enter(terms_seen, v_term, search_term);
            }
            if (event_learning.NIL != cycl_grammar.cycl_nat_p(v_term) && count.isZero()) {
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(v_term, (SubLObject)event_learning.$kw102$IGNORE);
                SubLObject formula_term = (SubLObject)event_learning.NIL;
                formula_term = cdolist_list_var.first();
                while (event_learning.NIL != cdolist_list_var) {
                    potentially_add_term_for_searching(formula_term, terms_seen, doc_count_fn);
                    cdolist_list_var = cdolist_list_var.rest();
                    formula_term = cdolist_list_var.first();
                }
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 19555L)
    public static SubLObject search_strings_for_sentences_and_event(final SubLObject sentences, final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject event_type = pph_utilities.pph_salient_generalization(event, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        SubLObject search_strings = (SubLObject)((event_learning.NIL != event_type) ? pph_methods_lexicon.all_phrases_for_term(event_type, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) : event_learning.NIL);
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            if (event_learning.NIL != isa.isaP(cycl_utilities.formula_arg0(sentence), event_learning.$const104$ActorSlot, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                try {
                    nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.bind((SubLObject)event_learning.NIL, thread);
                    pph_vars.$pph_demerit_cutoff$.bind((SubLObject)event_learning.TWO_INTEGER, thread);
                    final SubLObject actor_slot_value = pph_main.generate_phrase(cycl_utilities.formula_arg2(sentence, (SubLObject)event_learning.UNPROVIDED), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
                    if (event_learning.NIL != actor_slot_value) {
                        final SubLObject item_var = actor_slot_value;
                        if (event_learning.NIL == conses_high.member(item_var, search_strings, (SubLObject)event_learning.EQUAL, Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                            search_strings = (SubLObject)ConsesLow.cons(item_var, search_strings);
                        }
                    }
                }
                finally {
                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                    nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return search_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 20280L)
    public static SubLObject learn_new_facts_for_event_in_document(final SubLObject event, final SubLObject v_document, final SubLObject event_source_spindle) {
        final SubLObject facts = best_interpretations_of_facts(extract_event_facts_from_doc(v_document));
        SubLObject sentences_to_assert = (SubLObject)event_learning.NIL;
        if (event_learning.NIL != facts) {
            SubLObject content_mt = get_event_doc_content_mt(v_document);
            if (event_learning.NIL == nart_handles.nart_p(content_mt)) {
                final SubLObject spindle_head = ask_utilities.query_variable((SubLObject)event_learning.$sym105$_HEAD, (SubLObject)ConsesLow.listS(event_learning.$const106$mtSpindleHead, event_source_spindle, (SubLObject)event_learning.$list107), event_learning.$const0$InferencePSC, (SubLObject)event_learning.UNPROVIDED).first();
                event_learner_assert((SubLObject)ConsesLow.list(event_learning.$const108$mtSpindleMember, event_source_spindle, content_mt), spindle_head);
                content_mt = narts_high.nart_substitute(content_mt);
            }
            SubLObject cdolist_list_var = facts;
            SubLObject fact = (SubLObject)event_learning.NIL;
            fact = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                final SubLObject assert_formula = substitute_event_for_indexical(fact, event);
                if (event_learning.NIL != assert_formula) {
                    final SubLObject item_var = assert_formula;
                    if (event_learning.NIL == conses_high.member(item_var, sentences_to_assert, Symbols.symbol_function((SubLObject)event_learning.EQL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                        sentences_to_assert = (SubLObject)ConsesLow.cons(item_var, sentences_to_assert);
                    }
                    if (event_learning.NIL == event_learner_assert(assert_formula, content_mt)) {
                        Errors.warn((SubLObject)event_learning.$str109$Failed_to_assert___S_in__S, assert_formula, content_mt);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                fact = cdolist_list_var.first();
            }
        }
        return sentences_to_assert;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 21622L)
    public static SubLObject substitute_event_for_indexical(SubLObject sentence, final SubLObject event) {
        final SubLObject indexicals = cycl_utilities.expression_gather(sentence, (SubLObject)event_learning.$sym110$INDEXICAL_P, (SubLObject)event_learning.NIL, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        final SubLObject subevents = get_all_subevents(event);
        final SubLObject subevent_types = get_all_scripted_subevent_types(event);
        SubLObject cdolist_list_var = indexicals;
        SubLObject indexical = (SubLObject)event_learning.NIL;
        indexical = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, (SubLObject)event_learning.UNPROVIDED);
            if (event_learning.NIL != subl_promotions.memberP(indexical_event_type, subevent_types, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED)) {
                SubLObject subevent_type = (SubLObject)event_learning.NIL;
                if (event_learning.NIL == subevent_type) {
                    SubLObject csome_list_var = subevents;
                    SubLObject subevent = (SubLObject)event_learning.NIL;
                    subevent = csome_list_var.first();
                    while (event_learning.NIL == subevent_type && event_learning.NIL != csome_list_var) {
                        if (event_learning.NIL == subevent_type) {
                            SubLObject csome_list_var_$11 = cycl_utilities.hl_to_el(isa.min_isa(subevent, event_learning.$const0$InferencePSC, (SubLObject)event_learning.UNPROVIDED));
                            SubLObject sub_type = (SubLObject)event_learning.NIL;
                            sub_type = csome_list_var_$11.first();
                            while (event_learning.NIL == subevent_type && event_learning.NIL != csome_list_var_$11) {
                                if (sub_type.equal(indexical_event_type)) {
                                    sentence = cycl_utilities.expression_subst(subevent, indexical, sentence, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
                                    subevent_type = sub_type;
                                }
                                csome_list_var_$11 = csome_list_var_$11.rest();
                                sub_type = csome_list_var_$11.first();
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        subevent = csome_list_var.first();
                    }
                }
                if (event_learning.NIL == subevent_type) {
                    sentence = cycl_utilities.expression_subst(event, indexical, sentence, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
                }
            }
            else {
                sentence = cycl_utilities.expression_subst(event, indexical, sentence, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        }
        return Values.values(sentence, indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 23056L)
    public static SubLObject event_learning_valid_sentP(final SubLObject sent) {
        return sent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 23265L)
    public static SubLObject learn_new_templates_for_known_facts(final SubLObject v_document, final SubLObject known_facts, final SubLObject event) {
        final SubLObject fact_strings_pairs = get_markers_for_sentences(known_facts);
        final SubLObject subevent_structure_sentences = subevent_sentences_from_sentences(known_facts);
        SubLObject num_templates_added = (SubLObject)event_learning.ZERO_INTEGER;
        final SubLObject confirmed_facts = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = document.sentencify_string(get_event_doc_string(v_document));
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            if (event_learning.NIL != event_learning_valid_sentP(sentence)) {
                final SubLObject fact_pairs_for_sentence = calculate_fact_pairs_for_sentences(sentence, fact_strings_pairs);
                if (event_learning.NIL != fact_pairs_for_sentence) {
                    num_templates_added = Numbers.add(num_templates_added, learn_templates_for_sentence(sentence, fact_pairs_for_sentence, event, subevent_structure_sentences));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Values.values(confirmed_facts, num_templates_added);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 24485L)
    public static SubLObject calculate_fact_pairs_for_sentences(final SubLObject sentence, final SubLObject fact_strings_pairs) {
        SubLObject fact_pairs_for_sentence = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = fact_strings_pairs;
        SubLObject fact_with_strings = (SubLObject)event_learning.NIL;
        fact_with_strings = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = fact_with_strings;
            SubLObject fact = (SubLObject)event_learning.NIL;
            SubLObject marker_strings = (SubLObject)event_learning.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list111);
            fact = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list111);
            marker_strings = current.first();
            current = current.rest();
            if (event_learning.NIL == current) {
                SubLObject valid_marker_groups = (SubLObject)event_learning.NIL;
                SubLObject cdolist_list_var_$12 = marker_strings;
                SubLObject marker_group = (SubLObject)event_learning.NIL;
                marker_group = cdolist_list_var_$12.first();
                while (event_learning.NIL != cdolist_list_var_$12) {
                    SubLObject valid_markers = (SubLObject)event_learning.NIL;
                    SubLObject cdolist_list_var_$13 = marker_group;
                    SubLObject marker = (SubLObject)event_learning.NIL;
                    marker = cdolist_list_var_$13.first();
                    while (event_learning.NIL != cdolist_list_var_$13) {
                        if (event_learning.NIL != string_utilities.subwordP(marker, sentence, (SubLObject)event_learning.$list112, (SubLObject)event_learning.UNPROVIDED)) {
                            valid_markers = (SubLObject)ConsesLow.cons(marker, valid_markers);
                        }
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        marker = cdolist_list_var_$13.first();
                    }
                    if (event_learning.NIL != valid_markers) {
                        final SubLObject item_var = valid_markers;
                        if (event_learning.NIL == conses_high.member(item_var, valid_marker_groups, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                            valid_marker_groups = (SubLObject)ConsesLow.cons(item_var, valid_marker_groups);
                        }
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    marker_group = cdolist_list_var_$12.first();
                }
                if (Sequences.length(valid_marker_groups).numG((SubLObject)event_learning.ONE_INTEGER)) {
                    fact_pairs_for_sentence = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fact, list_utilities.remove_subsumed_items(list_utilities.flatten(valid_marker_groups), (SubLObject)event_learning.$sym113$PROPER_SUPERSTRING_, (SubLObject)event_learning.UNPROVIDED)), fact_pairs_for_sentence);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_learning.$list111);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact_with_strings = cdolist_list_var.first();
        }
        return fact_pairs_for_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 25578L)
    public static SubLObject subevent_sentences_from_sentences(final SubLObject sentences) {
        SubLObject result = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            if (event_learning.NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), event_learning.$const99$subEvents, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(sentence, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 25803L)
    public static SubLObject phrases_for_individual(final SubLObject individual) {
        SubLObject phrases = pph_methods_lexicon.all_phrases_for_term(individual, (SubLObject)event_learning.$kw114$ALL, (SubLObject)event_learning.$list115, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        if (event_learning.NIL != isa.isaP(individual, event_learning.$const116$Date, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
            final SubLObject info = pph_types.pph_method_info((SubLObject)event_learning.$sym117$GENERATE_ENGLISH_DAY_NAUT, (SubLObject)event_learning.NIL);
            pph_types.pph_deregister_method_info((SubLObject)event_learning.$sym117$GENERATE_ENGLISH_DAY_NAUT, info);
            try {
                final SubLObject item_var = pph_main.generate_phrase(individual, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
                if (event_learning.NIL == conses_high.member(item_var, phrases, (SubLObject)event_learning.EQUAL, Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                    phrases = (SubLObject)ConsesLow.cons(item_var, phrases);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)event_learning.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    pph_types.pph_register_method_info((SubLObject)event_learning.$sym117$GENERATE_ENGLISH_DAY_NAUT, info);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return phrases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 26259L)
    public static SubLObject get_markers_for_sentences(final SubLObject cycl_sentences) {
        final SubLObject all_event_types = get_all_event_types_from_sentences(cycl_sentences, (SubLObject)event_learning.UNPROVIDED);
        final SubLObject subevent_sentences = subevent_sentences_from_sentences(cycl_sentences);
        SubLObject result_strings = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = cycl_sentences;
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject markers_for_sentence = (SubLObject)event_learning.NIL;
            if (event_learning.NIL == subl_promotions.memberP(sentence, subevent_sentences, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED)) {
                final SubLObject predicate = cycl_utilities.formula_operator(sentence);
                final SubLObject allow_collectionsP = genl_predicates.genl_predP(predicate, event_learning.$const76$isa, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
                SubLObject cdolist_list_var_$14;
                final SubLObject args = cdolist_list_var_$14 = cycl_utilities.formula_args(sentence, (SubLObject)event_learning.$kw102$IGNORE);
                SubLObject arg = (SubLObject)event_learning.NIL;
                arg = cdolist_list_var_$14.first();
                while (event_learning.NIL != cdolist_list_var_$14) {
                    markers_for_sentence = collect_marker_for_individual_cycl_term(arg, all_event_types, allow_collectionsP, markers_for_sentence);
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    arg = cdolist_list_var_$14.first();
                }
            }
            result_strings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sentence, markers_for_sentence), result_strings);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return result_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 27302L)
    public static SubLObject collect_marker_for_individual_cycl_term(final SubLObject v_term, final SubLObject all_event_types, final SubLObject allow_collectionsP, SubLObject markers_for_sentence) {
        if (markers_for_sentence == event_learning.UNPROVIDED) {
            markers_for_sentence = (SubLObject)event_learning.NIL;
        }
        if (event_learning.NIL != isa.isaP(v_term, event_learning.$const96$Event, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
            SubLObject phrases = (SubLObject)event_learning.NIL;
            SubLObject cdolist_list_var = isa.min_isa(v_term, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            SubLObject event_type = (SubLObject)event_learning.NIL;
            event_type = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                phrases = Sequences.cconcatenate(marker_strings_for_event_type(event_type, all_event_types, (SubLObject)event_learning.UNPROVIDED), phrases);
                cdolist_list_var = cdolist_list_var.rest();
                event_type = cdolist_list_var.first();
            }
            final SubLObject item_var = phrases;
            if (event_learning.NIL == conses_high.member(item_var, markers_for_sentence, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                markers_for_sentence = (SubLObject)ConsesLow.cons(item_var, markers_for_sentence);
            }
        }
        else if (event_learning.NIL == isa.isaP(v_term, event_learning.$const118$Relation, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) && (event_learning.NIL != allow_collectionsP || event_learning.NIL == isa.isaP(v_term, event_learning.$const119$Collection, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED))) {
            final SubLObject item_var2 = pph_methods_lexicon.all_phrases_for_term(v_term, (SubLObject)event_learning.$kw114$ALL, (SubLObject)event_learning.$list115, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            if (event_learning.NIL == conses_high.member(item_var2, markers_for_sentence, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                markers_for_sentence = (SubLObject)ConsesLow.cons(item_var2, markers_for_sentence);
            }
        }
        if (event_learning.NIL != cycl_grammar.cycl_nat_p(v_term)) {
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(v_term, (SubLObject)event_learning.$kw102$IGNORE);
            SubLObject sub_term = (SubLObject)event_learning.NIL;
            sub_term = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                markers_for_sentence = collect_marker_for_individual_cycl_term(sub_term, all_event_types, allow_collectionsP, markers_for_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                sub_term = cdolist_list_var.first();
            }
        }
        return markers_for_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 28374L)
    public static SubLObject get_all_event_types_from_sentences(final SubLObject sentences, SubLObject mt) {
        if (mt == event_learning.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject events = list_utilities.tree_gather(sentences, (SubLObject)event_learning.$sym120$CYCL_EVENT_P, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        SubLObject event_types = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = events;
        SubLObject event = (SubLObject)event_learning.NIL;
        event = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            event_types = Sequences.cconcatenate(isa.min_isa(event, mt, (SubLObject)event_learning.UNPROVIDED), event_types);
            cdolist_list_var = cdolist_list_var.rest();
            event = cdolist_list_var.first();
        }
        return event_types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 28658L)
    public static SubLObject cycl_event_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(event_learning.NIL != forts.fort_p(obj) && event_learning.NIL != isa.isa_in_any_mtP(obj, event_learning.$const96$Event));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 28758L)
    public static SubLObject marker_strings_for_event_type(final SubLObject event_type, final SubLObject reference_event_types, SubLObject mt) {
        if (mt == event_learning.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject non_shared_genls_list = differentiate_genls_lists(conses_high.union((SubLObject)ConsesLow.list(event_type), reference_event_types, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED), mt);
        final SubLObject differentiated_phrase_list = get_phrases_for_differentiated_event_types(non_shared_genls_list, (SubLObject)event_learning.UNPROVIDED);
        return conses_high.second(Sequences.find(event_type, differentiated_phrase_list, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.$sym121$FIRST, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 29502L)
    public static SubLObject clear_get_phrases_for_differentiated_event_types() {
        final SubLObject cs = event_learning.$get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
        if (event_learning.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 29502L)
    public static SubLObject remove_get_phrases_for_differentiated_event_types(final SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == event_learning.UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(event_learning.$get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(differentiated_event_types, semantic_mt), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 29502L)
    public static SubLObject get_phrases_for_differentiated_event_types_internal(final SubLObject differentiated_event_types, final SubLObject semantic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possibly_duplicate_results = (SubLObject)event_learning.NIL;
        SubLObject final_results = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = differentiated_event_types;
        SubLObject event_type_differentia = (SubLObject)event_learning.NIL;
        event_type_differentia = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject phrases = (SubLObject)event_learning.NIL;
            SubLObject current;
            final SubLObject datum = current = event_type_differentia;
            SubLObject event_type = (SubLObject)event_learning.NIL;
            SubLObject differentiated_genls = (SubLObject)event_learning.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list123);
            event_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list123);
            differentiated_genls = current.first();
            current = current.rest();
            if (event_learning.NIL == current) {
                SubLObject cdolist_list_var_$15 = differentiated_genls;
                SubLObject differentiated_event_type = (SubLObject)event_learning.NIL;
                differentiated_event_type = cdolist_list_var_$15.first();
                while (event_learning.NIL != cdolist_list_var_$15) {
                    phrases = conses_high.union(phrases, ask_utilities.query_variable((SubLObject)event_learning.$sym124$_STRING, (SubLObject)ConsesLow.listS(event_learning.$const125$termPhrases, differentiated_event_type, (SubLObject)event_learning.$list126), (SubLObject)ConsesLow.list(event_learning.$const127$MtUnionFn, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), semantic_mt), (SubLObject)event_learning.UNPROVIDED), (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED);
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    differentiated_event_type = cdolist_list_var_$15.first();
                }
                possibly_duplicate_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(event_type, phrases), possibly_duplicate_results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_learning.$list123);
            }
            cdolist_list_var = cdolist_list_var.rest();
            event_type_differentia = cdolist_list_var.first();
        }
        cdolist_list_var = possibly_duplicate_results;
        SubLObject result_item = (SubLObject)event_learning.NIL;
        result_item = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = result_item;
            SubLObject event_type2 = (SubLObject)event_learning.NIL;
            SubLObject phrases2 = (SubLObject)event_learning.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)event_learning.$list128);
            event_type2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)event_learning.$list128);
            phrases2 = current2.first();
            current2 = current2.rest();
            if (event_learning.NIL == current2) {
                SubLObject my_good_phrases = (SubLObject)event_learning.NIL;
                SubLObject cdolist_list_var_$16 = phrases2;
                SubLObject phrase = (SubLObject)event_learning.NIL;
                phrase = cdolist_list_var_$16.first();
                while (event_learning.NIL != cdolist_list_var_$16) {
                    if (event_learning.NIL == Sequences.find(phrase, possibly_duplicate_results, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.$sym85$SECOND, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                        my_good_phrases = (SubLObject)ConsesLow.cons(phrase, my_good_phrases);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    phrase = cdolist_list_var_$16.first();
                }
                final_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(event_type2, my_good_phrases), final_results);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)event_learning.$list128);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result_item = cdolist_list_var.first();
        }
        return final_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 29502L)
    public static SubLObject get_phrases_for_differentiated_event_types(final SubLObject differentiated_event_types, SubLObject semantic_mt) {
        if (semantic_mt == event_learning.UNPROVIDED) {
            semantic_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = event_learning.$get_phrases_for_differentiated_event_types_caching_state$.getGlobalValue();
        if (event_learning.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)event_learning.$sym122$GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES, (SubLObject)event_learning.$sym129$_GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES_CACHING_STATE_, (SubLObject)event_learning.NIL, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.TWO_INTEGER, (SubLObject)event_learning.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(differentiated_event_types, semantic_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)event_learning.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)event_learning.NIL;
            collision = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (differentiated_event_types.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (event_learning.NIL != cached_args && event_learning.NIL == cached_args.rest() && semantic_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_phrases_for_differentiated_event_types_internal(differentiated_event_types, semantic_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(differentiated_event_types, semantic_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 30932L)
    public static SubLObject differentiate_genls_lists(final SubLObject colls, SubLObject mt) {
        if (mt == event_learning.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result_list = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = colls;
        SubLObject coll = (SubLObject)event_learning.NIL;
        coll = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject others = Sequences.remove(coll, colls, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            final SubLObject differentiating_genls = differentiating_genls(coll, others, mt);
            result_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coll, differentiating_genls), result_list);
            cdolist_list_var = cdolist_list_var.rest();
            coll = cdolist_list_var.first();
        }
        return result_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 31722L)
    public static SubLObject clear_differentiating_genls() {
        final SubLObject cs = event_learning.$differentiating_genls_caching_state$.getGlobalValue();
        if (event_learning.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 31722L)
    public static SubLObject remove_differentiating_genls(final SubLObject coll, final SubLObject differentia, SubLObject mt) {
        if (mt == event_learning.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(event_learning.$differentiating_genls_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(coll, differentia, mt), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 31722L)
    public static SubLObject differentiating_genls_internal(final SubLObject coll, final SubLObject differentia, final SubLObject mt) {
        return ask_utilities.query_variable((SubLObject)event_learning.$kw131$GENL, (SubLObject)ConsesLow.list(event_learning.$const75$and, (SubLObject)ConsesLow.listS(event_learning.$const132$genls, coll, (SubLObject)event_learning.$list133), (SubLObject)ConsesLow.list(event_learning.$const134$unknownSentence, (SubLObject)ConsesLow.list(event_learning.$const135$thereExists, (SubLObject)event_learning.$sym136$_OTHER_TYPE, (SubLObject)ConsesLow.listS(event_learning.$const75$and, (SubLObject)ConsesLow.list(event_learning.$const137$elementOf, (SubLObject)event_learning.$sym136$_OTHER_TYPE, reader.bq_cons(event_learning.$const138$TheSet, differentia)), (SubLObject)event_learning.$list139)))), mt, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 31722L)
    public static SubLObject differentiating_genls(final SubLObject coll, final SubLObject differentia, SubLObject mt) {
        if (mt == event_learning.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = event_learning.$differentiating_genls_caching_state$.getGlobalValue();
        if (event_learning.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)event_learning.$sym130$DIFFERENTIATING_GENLS, (SubLObject)event_learning.$sym140$_DIFFERENTIATING_GENLS_CACHING_STATE_, (SubLObject)event_learning.NIL, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.THREE_INTEGER, (SubLObject)event_learning.ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)event_learning.$sym141$CLEAR_DIFFERENTIATING_GENLS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(coll, differentia, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)event_learning.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)event_learning.NIL;
            collision = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (coll.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (differentia.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (event_learning.NIL != cached_args && event_learning.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(differentiating_genls_internal(coll, differentia, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(coll, differentia, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 32288L)
    public static SubLObject partial_linkage(final SubLObject v_word_linkage, SubLObject sorted_nl_markers) {
        SubLObject selected_links = (SubLObject)event_learning.NIL;
        while (Sequences.length(sorted_nl_markers).numG((SubLObject)event_learning.ONE_INTEGER)) {
            selected_links = conses_high.nunion(selected_links, linkage_path_between(v_word_linkage, sorted_nl_markers.first(), conses_high.second(sorted_nl_markers)), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            sorted_nl_markers = sorted_nl_markers.rest();
        }
        return selected_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 32676L)
    public static SubLObject linkword_strings_in_linkage_links(final SubLObject links) {
        SubLObject linkword_strings = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)event_learning.NIL;
        link = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject item_var = methods.funcall_instance_method_with_0_args(linkage.link_left_word(link), (SubLObject)event_learning.$sym142$GET_STRING);
            if (event_learning.NIL == conses_high.member(item_var, linkword_strings, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                linkword_strings = (SubLObject)ConsesLow.cons(item_var, linkword_strings);
            }
            item_var = methods.funcall_instance_method_with_0_args(linkage.link_right_word(link), (SubLObject)event_learning.$sym142$GET_STRING);
            if (event_learning.NIL == conses_high.member(item_var, linkword_strings, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                linkword_strings = (SubLObject)ConsesLow.cons(item_var, linkword_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return linkword_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 33102L)
    public static SubLObject event_learning_create_template(final SubLObject nl, final SubLObject cycl, final SubLObject nl_markers, SubLObject allow_multiple_matchesP) {
        if (allow_multiple_matchesP == event_learning.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)event_learning.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical_cycl = ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, event_learning.$const0$InferencePSC);
        SubLObject err_msg = (SubLObject)event_learning.NIL;
        SubLObject v_linkage = (SubLObject)event_learning.NIL;
        SubLObject mapped_terms = (SubLObject)event_learning.NIL;
        SubLObject cycl_term_vars = (SubLObject)event_learning.NIL;
        SubLObject nl_term_vars = (SubLObject)event_learning.NIL;
        SubLObject relevant_links = (SubLObject)event_learning.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)event_learning.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject v_linkage_$17 = ebmt_template_parser.ebmt_linkage_and_mapped_terms(nl, cycl, ebmt_template_parser.new_ebmt_lexicon((SubLObject)event_learning.UNPROVIDED), (SubLObject)event_learning.NIL);
                    final SubLObject mapped_terms_$18 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_linkage = v_linkage_$17;
                    mapped_terms = mapped_terms_$18;
                    thread.resetMultipleValues();
                    final SubLObject cycl_term_vars_$19 = ebmt_template_parser.ebmt_mapped_term_vars(nl, cycl, mapped_terms, v_linkage, allow_multiple_matchesP);
                    final SubLObject nl_term_vars_$20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cycl_term_vars = cycl_term_vars_$19;
                    nl_term_vars = nl_term_vars_$20;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)event_learning.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (event_learning.NIL != err_msg) {
            Errors.warn(string_utilities.string_subst((SubLObject)event_learning.$str144$__, (SubLObject)event_learning.$str145$_, err_msg, (SubLObject)event_learning.UNPROVIDED));
            return (SubLObject)event_learning.NIL;
        }
        relevant_links = partial_linkage(v_linkage, nl_markers);
        if (event_learning.NIL == relevant_links) {
            return (SubLObject)event_learning.NIL;
        }
        final SubLObject relevant_nl_terms = linkword_strings_in_linkage_links(relevant_links);
        SubLObject cdolist_list_var = mapped_terms;
        SubLObject cycl_nl_mapped_pair = (SubLObject)event_learning.NIL;
        cycl_nl_mapped_pair = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject nl_term = cycl_nl_mapped_pair.rest();
            final SubLObject cycl_term = cycl_nl_mapped_pair.first();
            if (event_learning.NIL == subl_promotions.memberP(nl_term, relevant_nl_terms, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED)) {
                cycl_term_vars = list_utilities.alist_remove(cycl_term_vars, cycl_term, Symbols.symbol_function((SubLObject)event_learning.EQ));
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_nl_mapped_pair = cdolist_list_var.first();
        }
        return ebmt_template_parser.new_ebmt_template((SubLObject)ConsesLow.list(nl, cycl, nl_markers), (SubLObject)((event_learning.NIL != cycl_term_vars) ? event_learning.$kw146$GENERAL : event_learning.$kw147$SPECIFIC), ebmt_template_parser.ebmt_linkset_from_linkage_links(relevant_links, nl_term_vars), (event_learning.NIL != cycl_term_vars) ? ebmt_template_parser.ebmt_cycl_with_vars(el_utilities.copy_expression(canonical_cycl), cycl_term_vars) : canonical_cycl, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 35430L)
    public static SubLObject event_learning_create_and_add_template(final SubLObject nl, final SubLObject cycl, final SubLObject nl_markers, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (allow_multiple_matchesP == event_learning.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)event_learning.T;
        }
        if (verboseP == event_learning.UNPROVIDED) {
            verboseP = (SubLObject)event_learning.NIL;
        }
        final SubLObject template = event_learning_create_template(nl, cycl, nl_markers, allow_multiple_matchesP);
        if (event_learning.NIL != template) {
            ebmt_template_parser._csetf_ebmt_template_indexing_result(template, ebmt_template_parser.ebmt_index_template(template, (SubLObject)event_learning.NIL, verboseP));
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 36307L)
    public static SubLObject strings_sorted_by_offset(final SubLObject strings, final SubLObject nl_sentence) {
        SubLObject string_offset_pairs = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)event_learning.NIL;
        string = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            string_offset_pairs = conses_high.acons(string, Sequences.search(string, nl_sentence, (SubLObject)event_learning.EQUALP, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED), string_offset_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return list_utilities.alist_keys(list_utilities.sort_alist_by_values(string_offset_pairs, (SubLObject)event_learning.$sym84$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 36690L)
    public static SubLObject learn_templates_for_sentence(final SubLObject nl_sentence, final SubLObject fact_string_event_tuples, final SubLObject event, SubLObject subevent_structure_sentences) {
        if (subevent_structure_sentences == event_learning.UNPROVIDED) {
            subevent_structure_sentences = (SubLObject)event_learning.NIL;
        }
        final SubLObject raw_subevents = get_all_subevents(event);
        final SubLObject subevents = (SubLObject)((event_learning.NIL == raw_subevents) ? ConsesLow.list(event) : raw_subevents);
        final SubLObject grouped_tuples = group_sentences_by_subevent(fact_string_event_tuples, subevents, subevent_structure_sentences);
        final SubLObject best_tuple_groups = pick_best_tuple_groups(grouped_tuples);
        SubLObject num_templates_added = (SubLObject)event_learning.ZERO_INTEGER;
        SubLObject cdolist_list_var = best_tuple_groups;
        SubLObject fact_group = (SubLObject)event_learning.NIL;
        fact_group = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject full_fact = el_utilities.remove_el_duplicates(simplifier.conjoin(Mapping.mapcar((SubLObject)event_learning.$sym121$FIRST, fact_group), (SubLObject)event_learning.UNPROVIDED), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            final SubLObject strings = Sequences.remove_duplicates(Sequences.remove((SubLObject)event_learning.NIL, list_utilities.flatten(Mapping.mapcar((SubLObject)event_learning.$sym85$SECOND, fact_group)), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED), (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            if (event_learning.NIL != strings) {
                final SubLObject strings_for_partial_linkage = strings_sorted_by_offset(strings, nl_sentence);
                final SubLObject template_cycl = get_event_learning_templated_cycl(full_fact, event);
                if (event_learning.NIL != event_learning_create_and_add_template(nl_sentence, template_cycl, strings_for_partial_linkage, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                    num_templates_added = Numbers.add(num_templates_added, (SubLObject)event_learning.ONE_INTEGER);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact_group = cdolist_list_var.first();
        }
        return num_templates_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 38224L)
    public static SubLObject pick_best_tuple_groups(final SubLObject tuple_groups) {
        SubLObject result = (SubLObject)event_learning.NIL;
        SubLObject max_length = (SubLObject)event_learning.ZERO_INTEGER;
        SubLObject cdolist_list_var = tuple_groups;
        SubLObject tuple_group = (SubLObject)event_learning.NIL;
        tuple_group = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            if (Sequences.length(tuple_group).numG(max_length)) {
                max_length = Sequences.length(tuple_group);
                result = (SubLObject)ConsesLow.list(tuple_group);
            }
            else if (Sequences.length(tuple_group).numE(max_length)) {
                result = (SubLObject)ConsesLow.cons(tuple_group, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple_group = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 39011L)
    public static SubLObject group_sentences_by_subevent(final SubLObject sentence_string_pairs, final SubLObject subevents, SubLObject subevent_structures_sentences) {
        if (subevent_structures_sentences == event_learning.UNPROVIDED) {
            subevent_structures_sentences = (SubLObject)event_learning.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)event_learning.NIL;
        final SubLObject sentences_by_event = dictionary.new_dictionary((SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        final SubLObject _prev_bind_0 = event_learning.$subevents$.currentBinding(thread);
        try {
            event_learning.$subevents$.bind(subevents, thread);
            SubLObject cdolist_list_var = sentence_string_pairs;
            SubLObject pair = (SubLObject)event_learning.NIL;
            pair = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$21;
                final SubLObject my_subevents = cdolist_list_var_$21 = cycl_utilities.expression_gather(pair.first(), (SubLObject)event_learning.$sym148$LAMBDA_SUBEVENT_, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
                SubLObject my_subevent = (SubLObject)event_learning.NIL;
                my_subevent = cdolist_list_var_$21.first();
                while (event_learning.NIL != cdolist_list_var_$21) {
                    dictionary_utilities.dictionary_push(sentences_by_event, my_subevent, pair);
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    my_subevent = cdolist_list_var_$21.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        finally {
            event_learning.$subevents$.rebind(_prev_bind_0, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentences_by_event)); event_learning.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject subevent = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject good_sentences;
            final SubLObject raw_sentences = good_sentences = dictionary.dictionary_lookup(sentences_by_event, subevent, (SubLObject)event_learning.UNPROVIDED);
            SubLObject cdolist_list_var2 = subevent_structures_sentences;
            SubLObject se_struct_sent = (SubLObject)event_learning.NIL;
            se_struct_sent = cdolist_list_var2.first();
            while (event_learning.NIL != cdolist_list_var2) {
                if (cycl_utilities.formula_arg2(se_struct_sent, (SubLObject)event_learning.UNPROVIDED).equalp(subevent)) {
                    good_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(se_struct_sent), good_sentences);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                se_struct_sent = cdolist_list_var2.first();
            }
            result = (SubLObject)ConsesLow.cons(good_sentences, result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 39902L)
    public static SubLObject lambda_subeventP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(obj, event_learning.$subevents$.getDynamicValue(thread), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 39977L)
    public static SubLObject group_tuples(final SubLObject tuples, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary((SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
        SubLObject result = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)event_learning.NIL;
        tuple = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_push(v_dictionary, Functions.funcall(key, tuple), tuple);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); event_learning.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject dict_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(v_dictionary, dict_key, (SubLObject)event_learning.UNPROVIDED), result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 40288L)
    public static SubLObject get_event_learning_templated_cycl(SubLObject cycl, final SubLObject event) {
        SubLObject subevents = get_all_subevents(event);
        SubLObject subevent_types = get_all_scripted_subevent_types(event);
        if (event_learning.NIL == conses_high.member(event, subevents, Symbols.symbol_function((SubLObject)event_learning.EQL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
            subevents = (SubLObject)ConsesLow.cons(event, subevents);
        }
        subevent_types = conses_high.union(cycl_utilities.hl_to_el(isa.min_isa(event, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)), subevent_types, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED);
        SubLObject cdolist_list_var = subevents;
        SubLObject subevent = (SubLObject)event_learning.NIL;
        subevent = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject subevent_type = (SubLObject)event_learning.NIL;
            if (event_learning.NIL == subevent_type) {
                SubLObject csome_list_var = cycl_utilities.hl_to_el(isa.min_isa(subevent, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED));
                SubLObject sub_type = (SubLObject)event_learning.NIL;
                sub_type = csome_list_var.first();
                while (event_learning.NIL == subevent_type && event_learning.NIL != csome_list_var) {
                    if (event_learning.NIL != subl_promotions.memberP(sub_type, subevent_types, (SubLObject)event_learning.EQUAL, (SubLObject)event_learning.UNPROVIDED)) {
                        subevent_type = sub_type;
                    }
                    csome_list_var = csome_list_var.rest();
                    sub_type = csome_list_var.first();
                }
            }
            if (event_learning.NIL != subevent_type) {
                cycl = cycl_utilities.expression_subst((SubLObject)ConsesLow.list(event_learning.$const149$TheFn, subevent_type), subevent, cycl, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            }
            else {
                Errors.warn((SubLObject)event_learning.$str150$No_substitution_done_for__S, subevent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subevent = cdolist_list_var.first();
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 41331L)
    public static SubLObject search_strings_for_event_type(final SubLObject event_type) {
        final SubLObject search_strings = (SubLObject)event_learning.$list151;
        return search_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 41687L)
    public static SubLObject find_possible_known_events_for_fact(final SubLObject event_type, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical = cycl_utilities.expression_gather(sentence, (SubLObject)event_learning.$sym110$INDEXICAL_P, (SubLObject)event_learning.NIL, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED).first();
        final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, (SubLObject)event_learning.UNPROVIDED);
        final SubLObject query_sentence = cycl_utilities.expression_subst((SubLObject)event_learning.$sym68$_EVENT, indexical, sentence, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
        final SubLObject matching_events = ask_utilities.query_variable((SubLObject)event_learning.$sym68$_EVENT, (SubLObject)ConsesLow.list(event_learning.$const75$and, (SubLObject)ConsesLow.list(event_learning.$const76$isa, (SubLObject)event_learning.$sym68$_EVENT, event_type), (SubLObject)ConsesLow.list(event_learning.$const76$isa, (SubLObject)event_learning.$sym68$_EVENT, indexical_event_type), query_sentence), event_learning.$event_finding_query_mt$.getDynamicValue(thread), (SubLObject)event_learning.UNPROVIDED);
        return matching_events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 42331L)
    public static SubLObject preds_in_cycl_sentences(final SubLObject sentences) {
        SubLObject preds = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)event_learning.NIL;
        sentence = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            preds = conses_high.union(preds, cycl_utilities.expression_gather(sentence, (SubLObject)event_learning.$sym152$PREDICATE_P, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 42529L)
    public static SubLObject best_event_facts_pair(final SubLObject event_facts_pair1, final SubLObject event_facts_pair2) {
        final SubLObject facts1 = conses_high.second(event_facts_pair1);
        final SubLObject preds1 = preds_in_cycl_sentences(facts1);
        final SubLObject facts2 = conses_high.second(event_facts_pair2);
        final SubLObject preds2 = preds_in_cycl_sentences(facts2);
        SubLObject cdolist_list_var;
        final SubLObject ranked_preds = cdolist_list_var = (SubLObject)event_learning.$list153;
        SubLObject pred = (SubLObject)event_learning.NIL;
        pred = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            if (event_learning.NIL != subl_promotions.memberP(pred, preds1, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) && event_learning.NIL == subl_promotions.memberP(pred, preds2, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                return event_facts_pair1;
            }
            if (event_learning.NIL != subl_promotions.memberP(pred, preds2, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED) && event_learning.NIL == subl_promotions.memberP(pred, preds1, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED)) {
                return event_facts_pair2;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 43270L)
    public static SubLObject find_best_event(final SubLObject event_facts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        list_utilities.sort_alist_by_values(event_facts, (SubLObject)event_learning.$sym154$GREATER_LENGTH_P);
        SubLObject max_length = (SubLObject)event_learning.ZERO_INTEGER;
        SubLObject events = (SubLObject)event_learning.NIL;
        SubLObject doneP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject event;
        SubLObject facts;
        for (doneP = (SubLObject)event_learning.NIL, rest = (SubLObject)event_learning.NIL, rest = event_facts; event_learning.NIL == doneP && event_learning.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            event = (SubLObject)event_learning.NIL;
            facts = (SubLObject)event_learning.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_learning.$list155);
            event = current.first();
            current = (facts = current.rest());
            if (Sequences.length(facts).numGE(max_length)) {
                max_length = Sequences.length(facts);
                events = (SubLObject)ConsesLow.cons(event, events);
            }
            else {
                doneP = (SubLObject)event_learning.T;
            }
        }
        if (Sequences.length(events).numG((SubLObject)event_learning.ONE_INTEGER)) {
            SubLObject best_event = events.first();
            SubLObject best_event_facts = list_utilities.alist_lookup(event_facts, events.first(), Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
            SubLObject cdolist_list_var = events.rest();
            SubLObject potential_best_event = (SubLObject)event_learning.NIL;
            potential_best_event = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                final SubLObject potential_best_event_facts = list_utilities.alist_lookup(event_facts, potential_best_event, Symbols.symbol_function((SubLObject)event_learning.EQUAL), (SubLObject)event_learning.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject best_event_$22 = best_event_facts_pair((SubLObject)ConsesLow.list(best_event, best_event_facts), (SubLObject)ConsesLow.list(potential_best_event, potential_best_event_facts));
                final SubLObject best_event_facts_$23 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                best_event = best_event_$22;
                best_event_facts = best_event_facts_$23;
                if (event_learning.NIL == best_event) {
                    return (SubLObject)event_learning.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                potential_best_event = cdolist_list_var.first();
            }
            return best_event;
        }
        return events.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 44301L)
    public static SubLObject update_event(final SubLObject event, final SubLObject facts, final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = get_event_doc_content_mt(doc);
        SubLObject cdolist_list_var = facts;
        SubLObject fact = (SubLObject)event_learning.NIL;
        fact = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject formula = substitute_event_for_indexical(fact, event);
            thread.resetMultipleValues();
            final SubLObject assert_result = event_learner_assert(formula, mt);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (event_learning.NIL == assert_result) {
                Errors.warn((SubLObject)event_learning.$str156$Failed_to_assert__S_in__S_because, formula, mt, error);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fact = cdolist_list_var.first();
        }
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 44904L)
    public static SubLObject find_and_update_event(final SubLObject event_type, final SubLObject facts, final SubLObject doc) {
        SubLObject event_facts = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = facts;
        SubLObject interpretations = (SubLObject)event_learning.NIL;
        interpretations = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = interpretations;
            SubLObject interpretation = (SubLObject)event_learning.NIL;
            interpretation = cdolist_list_var_$24.first();
            while (event_learning.NIL != cdolist_list_var_$24) {
                SubLObject cdolist_list_var_$25 = find_possible_known_events_for_fact(event_type, interpretation);
                SubLObject event = (SubLObject)event_learning.NIL;
                event = cdolist_list_var_$25.first();
                while (event_learning.NIL != cdolist_list_var_$25) {
                    event_facts = list_utilities.alist_pushnew(event_facts, event, interpretation, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.EQUAL));
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    event = cdolist_list_var_$25.first();
                }
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                interpretation = cdolist_list_var_$24.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            interpretations = cdolist_list_var.first();
        }
        if (event_learning.NIL != event_facts) {
            final SubLObject event2 = find_best_event(event_facts);
            update_event(event2, list_utilities.alist_lookup(event_facts, event2, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED), doc);
            return event2;
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 45719L)
    public static SubLObject facts_sufficient_to_make_eventP(final SubLObject event_type, final SubLObject facts) {
        return (SubLObject)event_learning.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 45834L)
    public static SubLObject make_new_event(final SubLObject event_type, final SubLObject sentences, final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_mt = get_event_doc_content_mt(doc);
        final SubLObject event_name = (SubLObject)event_learning.$str157$GatheredEvent;
        SubLObject event = (SubLObject)event_learning.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(event_learning.$event_learning_cyclist$.getDynamicValue(thread), thread);
            event = rkf_term_utilities.create_new_constant(event_name, (SubLObject)ConsesLow.list(event_type), (SubLObject)event_learning.NIL, assertion_mt, (SubLObject)event_learning.$str39$, (SubLObject)event_learning.NIL, (SubLObject)event_learning.$kw158$UPCASE, (SubLObject)event_learning.T, (SubLObject)event_learning.UNPROVIDED);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)event_learning.NIL;
            sentence = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject assertion_formula = substitute_event_for_indexical(sentence, event);
                final SubLObject indexicals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject assertion_formulae = (SubLObject)ConsesLow.list(assertion_formula);
                SubLObject cdolist_list_var_$26 = indexicals;
                SubLObject indexical = (SubLObject)event_learning.NIL;
                indexical = cdolist_list_var_$26.first();
                while (event_learning.NIL != cdolist_list_var_$26) {
                    final SubLObject indexical_event_type = cycl_utilities.formula_arg1(indexical, (SubLObject)event_learning.UNPROVIDED);
                    final SubLObject item_var = (SubLObject)ConsesLow.list(event_learning.$const76$isa, event, indexical_event_type);
                    if (event_learning.NIL == conses_high.member(item_var, assertion_formulae, Symbols.symbol_function((SubLObject)event_learning.EQUAL), Symbols.symbol_function((SubLObject)event_learning.IDENTITY))) {
                        assertion_formulae = (SubLObject)ConsesLow.cons(item_var, assertion_formulae);
                    }
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    indexical = cdolist_list_var_$26.first();
                }
                SubLObject cdolist_list_var_$27 = assertion_formulae;
                SubLObject assertion_formula_$28 = (SubLObject)event_learning.NIL;
                assertion_formula_$28 = cdolist_list_var_$27.first();
                while (event_learning.NIL != cdolist_list_var_$27) {
                    if (event_learning.NIL != wff.el_wff_assertibleP(assertion_formula_$28, assertion_mt, (SubLObject)event_learning.UNPROVIDED)) {
                        if (event_learning.NIL == event_learner_assert(assertion_formula_$28, assertion_mt)) {
                            Errors.warn((SubLObject)event_learning.$str159$Failed_to_assert___S_in__S__, assertion_formula_$28, assertion_mt);
                        }
                    }
                    else {
                        Errors.warn((SubLObject)event_learning.$str160$NOT_WFF___S__, assertion_formula_$28);
                    }
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    assertion_formula_$28 = cdolist_list_var_$27.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 47180L)
    public static SubLObject find_new_events(final SubLObject event_type) {
        final SubLObject search_strings = search_strings_for_event_type(event_type);
        final SubLObject docs = best_docs_for_search_strings(search_strings);
        SubLObject new_events = (SubLObject)event_learning.NIL;
        SubLObject cdolist_list_var = docs;
        SubLObject doc = (SubLObject)event_learning.NIL;
        doc = cdolist_list_var.first();
        while (event_learning.NIL != cdolist_list_var) {
            final SubLObject facts = extract_event_facts_from_doc(doc);
            if (event_learning.NIL == find_and_update_event(event_type, facts, doc) && event_learning.NIL != facts_sufficient_to_make_eventP(event_type, facts)) {
                final SubLObject facts_for_new_event = best_interpretations_of_facts(facts);
                new_events = (SubLObject)ConsesLow.cons(make_new_event(event_type, facts_for_new_event, doc), new_events);
            }
            cdolist_list_var = cdolist_list_var.rest();
            doc = cdolist_list_var.first();
        }
        return new_events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 47864L)
    public static SubLObject linkage_path_between(final SubLObject v_linkage, final SubLObject string1, final SubLObject string2) {
        SubLObject link_word1 = methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)event_learning.$sym161$SEARCH, string1);
        SubLObject link_word2 = methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)event_learning.$sym161$SEARCH, string2);
        final SubLObject path_queue = queues.create_queue((SubLObject)event_learning.UNPROVIDED);
        if (event_learning.NIL == link_word1) {
            link_word1 = methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)event_learning.$sym161$SEARCH, string_utilities.split_string(string1, (SubLObject)event_learning.UNPROVIDED).first());
            if (event_learning.NIL == link_word1) {
                Errors.error((SubLObject)event_learning.$str162$_s_is_not_present_in_input_linkag, string1, instances.get_slot(v_linkage, (SubLObject)event_learning.$sym163$WORDS));
            }
        }
        if (event_learning.NIL == link_word2) {
            link_word2 = methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)event_learning.$sym161$SEARCH, list_utilities.last_one(string_utilities.split_string(string2, (SubLObject)event_learning.UNPROVIDED)));
            if (event_learning.NIL == link_word2) {
                Errors.error((SubLObject)event_learning.$str162$_s_is_not_present_in_input_linkag, string2, instances.get_slot(v_linkage, (SubLObject)event_learning.$sym163$WORDS));
            }
        }
        queues.enqueue((SubLObject)ConsesLow.list(link_word1), path_queue);
        return list_utilities.find_all_if((SubLObject)event_learning.$sym164$LINK_P, linkage_path_between_int(link_word2, path_queue), (SubLObject)event_learning.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 48662L)
    public static SubLObject linkage_path_between_int(final SubLObject goal_link_word, final SubLObject active_paths) {
        SubLObject active_path = (SubLObject)event_learning.NIL;
        while (event_learning.NIL == queues.queue_empty_p(active_paths)) {
            active_path = queues.dequeue(active_paths);
            final SubLObject current_word = active_path.first();
            final SubLObject all_paths_from_word = conses_high.union(word_linkage.get_word_linkage_word_right_links(current_word), word_linkage.get_word_linkage_word_left_links(current_word), (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            final SubLObject explored_links = list_utilities.find_all_if((SubLObject)event_learning.$sym164$LINK_P, active_path, (SubLObject)event_learning.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject unexplored_paths_from_word = cdolist_list_var = conses_high.set_difference(all_paths_from_word, explored_links, (SubLObject)event_learning.UNPROVIDED, (SubLObject)event_learning.UNPROVIDED);
            SubLObject possibly_good_link = (SubLObject)event_learning.NIL;
            possibly_good_link = cdolist_list_var.first();
            while (event_learning.NIL != cdolist_list_var) {
                if (link_other_word(possibly_good_link, current_word).equal(goal_link_word)) {
                    return Sequences.cconcatenate((SubLObject)ConsesLow.list(goal_link_word, possibly_good_link), active_path);
                }
                queues.enqueue((SubLObject)ConsesLow.cons(link_other_word(possibly_good_link, current_word), (SubLObject)ConsesLow.cons(possibly_good_link, conses_high.copy_list(active_path))), active_paths);
                cdolist_list_var = cdolist_list_var.rest();
                possibly_good_link = cdolist_list_var.first();
            }
        }
        return (SubLObject)event_learning.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-learning.lisp", position = 49604L)
    public static SubLObject link_other_word(final SubLObject link, final SubLObject word) {
        if (word.equal(linkage.link_right_word(link))) {
            return linkage.link_left_word(link);
        }
        return linkage.link_right_word(link);
    }
    
    public static SubLObject declare_event_learning_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_document_print_function_trampoline", "EVENT-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_document_p", "EVENT-DOCUMENT-P", 1, 0, false);
        new $event_document_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_doc_cycl", "EVENT-DOC-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_doc_url", "EVENT-DOC-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_doc_string", "EVENT-DOC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_doc_html_string", "EVENT-DOC-HTML-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "_csetf_event_doc_cycl", "_CSETF-EVENT-DOC-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "_csetf_event_doc_url", "_CSETF-EVENT-DOC-URL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "_csetf_event_doc_string", "_CSETF-EVENT-DOC-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "_csetf_event_doc_html_string", "_CSETF-EVENT-DOC-HTML-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "make_event_document", "MAKE-EVENT-DOCUMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "visit_defstruct_event_document", "VISIT-DEFSTRUCT-EVENT-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "visit_defstruct_object_event_document_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-DOCUMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "new_event_document", "NEW-EVENT-DOCUMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_event_doc_string", "GET-EVENT-DOC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_event_doc_url", "GET-EVENT-DOC-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_event_doc_content_mt", "GET-EVENT-DOC-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "set_event_doc_string", "SET-EVENT-DOC-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "set_event_doc_url", "SET-EVENT-DOC-URL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_learning", "do_event_doc_sentences", "DO-EVENT-DOC-SENTENCES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_document_from_file", "EVENT-DOCUMENT-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "gather_event_graph_from_seed", "GATHER-EVENT-GRAPH-FROM-SEED", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_learning", "walk_event_graph", "WALK-EVENT-GRAPH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "is_root_of_event_graph_p", "IS-ROOT-OF-EVENT-GRAPH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "clear_get_all_subevents", "CLEAR-GET-ALL-SUBEVENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "remove_get_all_subevents", "REMOVE-GET-ALL-SUBEVENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_all_subevents_internal", "GET-ALL-SUBEVENTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_all_subevents", "GET-ALL-SUBEVENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "clear_get_all_scripted_subevent_types", "CLEAR-GET-ALL-SCRIPTED-SUBEVENT-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "remove_get_all_scripted_subevent_types", "REMOVE-GET-ALL-SCRIPTED-SUBEVENT-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_all_scripted_subevent_types_internal", "GET-ALL-SCRIPTED-SUBEVENT-TYPES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_all_scripted_subevent_types", "GET-ALL-SCRIPTED-SUBEVENT-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "best_docs_for_search_strings", "BEST-DOCS-FOR-SEARCH-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "best_docs_for_search_terms", "BEST-DOCS-FOR-SEARCH-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "best_files_for_search_terms", "BEST-FILES-FOR-SEARCH-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_ranked_search_term_list", "GET-RANKED-SEARCH-TERM-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_learner_assert", "EVENT-LEARNER-ASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "extract_event_facts_from_doc", "EXTRACT-EVENT-FACTS-FROM-DOC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "best_interpretations_of_facts", "BEST-INTERPRETATIONS-OF-FACTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "clear_all_event_learning_caches", "CLEAR-ALL-EVENT-LEARNING-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_learning_semantic_mt", "EVENT-LEARNING-SEMANTIC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "gather_facts_from_seed_event", "GATHER-FACTS-FROM-SEED-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "gather_more_facts_about_seed_event", "GATHER-MORE-FACTS-ABOUT-SEED-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_represented_facts_for_event", "GET-REPRESENTED-FACTS-FOR-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_search_strings_for_represented_event", "GET-SEARCH-STRINGS-FOR-REPRESENTED-EVENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_search_terms_for_represented_event", "GET-SEARCH-TERMS-FOR-REPRESENTED-EVENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_best_documents_for_represented_event_via_terms", "GET-BEST-DOCUMENTS-FOR-REPRESENTED-EVENT-VIA-TERMS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "represented_facts_for_event", "REPRESENTED-FACTS-FOR-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "webstore_index_doc_count", "WEBSTORE-INDEX-DOC-COUNT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "search_terms_for_sentences_and_event", "SEARCH-TERMS-FOR-SENTENCES-AND-EVENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "potentially_add_term_for_searching", "POTENTIALLY-ADD-TERM-FOR-SEARCHING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "search_strings_for_sentences_and_event", "SEARCH-STRINGS-FOR-SENTENCES-AND-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "learn_new_facts_for_event_in_document", "LEARN-NEW-FACTS-FOR-EVENT-IN-DOCUMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "substitute_event_for_indexical", "SUBSTITUTE-EVENT-FOR-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_learning_valid_sentP", "EVENT-LEARNING-VALID-SENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "learn_new_templates_for_known_facts", "LEARN-NEW-TEMPLATES-FOR-KNOWN-FACTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "calculate_fact_pairs_for_sentences", "CALCULATE-FACT-PAIRS-FOR-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "subevent_sentences_from_sentences", "SUBEVENT-SENTENCES-FROM-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "phrases_for_individual", "PHRASES-FOR-INDIVIDUAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_markers_for_sentences", "GET-MARKERS-FOR-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "collect_marker_for_individual_cycl_term", "COLLECT-MARKER-FOR-INDIVIDUAL-CYCL-TERM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_all_event_types_from_sentences", "GET-ALL-EVENT-TYPES-FROM-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "cycl_event_p", "CYCL-EVENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "marker_strings_for_event_type", "MARKER-STRINGS-FOR-EVENT-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "clear_get_phrases_for_differentiated_event_types", "CLEAR-GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "remove_get_phrases_for_differentiated_event_types", "REMOVE-GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_phrases_for_differentiated_event_types_internal", "GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_phrases_for_differentiated_event_types", "GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "differentiate_genls_lists", "DIFFERENTIATE-GENLS-LISTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "clear_differentiating_genls", "CLEAR-DIFFERENTIATING-GENLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "remove_differentiating_genls", "REMOVE-DIFFERENTIATING-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "differentiating_genls_internal", "DIFFERENTIATING-GENLS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "differentiating_genls", "DIFFERENTIATING-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "partial_linkage", "PARTIAL-LINKAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "linkword_strings_in_linkage_links", "LINKWORD-STRINGS-IN-LINKAGE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_learning_create_template", "EVENT-LEARNING-CREATE-TEMPLATE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "event_learning_create_and_add_template", "EVENT-LEARNING-CREATE-AND-ADD-TEMPLATE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "strings_sorted_by_offset", "STRINGS-SORTED-BY-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "learn_templates_for_sentence", "LEARN-TEMPLATES-FOR-SENTENCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "pick_best_tuple_groups", "PICK-BEST-TUPLE-GROUPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "group_sentences_by_subevent", "GROUP-SENTENCES-BY-SUBEVENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "lambda_subeventP", "LAMBDA-SUBEVENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "group_tuples", "GROUP-TUPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "get_event_learning_templated_cycl", "GET-EVENT-LEARNING-TEMPLATED-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "search_strings_for_event_type", "SEARCH-STRINGS-FOR-EVENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "find_possible_known_events_for_fact", "FIND-POSSIBLE-KNOWN-EVENTS-FOR-FACT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "preds_in_cycl_sentences", "PREDS-IN-CYCL-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "best_event_facts_pair", "BEST-EVENT-FACTS-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "find_best_event", "FIND-BEST-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "update_event", "UPDATE-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "find_and_update_event", "FIND-AND-UPDATE-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "facts_sufficient_to_make_eventP", "FACTS-SUFFICIENT-TO-MAKE-EVENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "make_new_event", "MAKE-NEW-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "find_new_events", "FIND-NEW-EVENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "linkage_path_between", "LINKAGE-PATH-BETWEEN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "linkage_path_between_int", "LINKAGE-PATH-BETWEEN-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_learning", "link_other_word", "LINK-OTHER-WORD", 2, 0, false);
        return (SubLObject)event_learning.NIL;
    }
    
    public static SubLObject init_event_learning_file() {
        event_learning.$event_finding_query_mt$ = SubLFiles.defparameter("*EVENT-FINDING-QUERY-MT*", event_learning.$const0$InferencePSC);
        event_learning.$event_learning_indexes_templates$ = SubLFiles.defparameter("*EVENT-LEARNING-INDEXES-TEMPLATES*", (SubLObject)event_learning.T);
        event_learning.$event_learning_cyclist$ = SubLFiles.defparameter("*EVENT-LEARNING-CYCLIST*", event_learning.$const1$TheUser);
        event_learning.$event_learner_head_mt$ = SubLFiles.defparameter("*EVENT-LEARNER-HEAD-MT*", event_learning.$const2$EventLearnerHeadMt);
        event_learning.$dtp_event_document$ = SubLFiles.defconstant("*DTP-EVENT-DOCUMENT*", (SubLObject)event_learning.$sym3$EVENT_DOCUMENT);
        event_learning.$get_all_subevents_caching_state$ = SubLFiles.deflexical("*GET-ALL-SUBEVENTS-CACHING-STATE*", (SubLObject)event_learning.NIL);
        event_learning.$get_all_scripted_subevent_types_caching_state$ = SubLFiles.deflexical("*GET-ALL-SCRIPTED-SUBEVENT-TYPES-CACHING-STATE*", (SubLObject)event_learning.NIL);
        event_learning.$search_term_relevancy_too_high$ = SubLFiles.defparameter("*SEARCH-TERM-RELEVANCY-TOO-HIGH*", (SubLObject)event_learning.$int80$1000);
        event_learning.$search_term_relevancy_too_low$ = SubLFiles.defparameter("*SEARCH-TERM-RELEVANCY-TOO-LOW*", (SubLObject)event_learning.ZERO_INTEGER);
        event_learning.$search_term_relevancy_accept$ = SubLFiles.defparameter("*SEARCH-TERM-RELEVANCY-ACCEPT*", (SubLObject)event_learning.TEN_INTEGER);
        event_learning.$get_phrases_for_differentiated_event_types_caching_state$ = SubLFiles.deflexical("*GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-CACHING-STATE*", (SubLObject)event_learning.NIL);
        event_learning.$differentiating_genls_caching_state$ = SubLFiles.deflexical("*DIFFERENTIATING-GENLS-CACHING-STATE*", (SubLObject)event_learning.NIL);
        event_learning.$subevents$ = SubLFiles.defparameter("*SUBEVENTS*", (SubLObject)event_learning.NIL);
        return (SubLObject)event_learning.NIL;
    }
    
    public static SubLObject setup_event_learning_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), event_learning.$dtp_event_document$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_learning.$sym10$EVENT_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)event_learning.$list11);
        Structures.def_csetf((SubLObject)event_learning.$sym12$EVENT_DOC_CYCL, (SubLObject)event_learning.$sym13$_CSETF_EVENT_DOC_CYCL);
        Structures.def_csetf((SubLObject)event_learning.$sym14$EVENT_DOC_URL, (SubLObject)event_learning.$sym15$_CSETF_EVENT_DOC_URL);
        Structures.def_csetf((SubLObject)event_learning.$sym16$EVENT_DOC_STRING, (SubLObject)event_learning.$sym17$_CSETF_EVENT_DOC_STRING);
        Structures.def_csetf((SubLObject)event_learning.$sym18$EVENT_DOC_HTML_STRING, (SubLObject)event_learning.$sym19$_CSETF_EVENT_DOC_HTML_STRING);
        Equality.identity((SubLObject)event_learning.$sym3$EVENT_DOCUMENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_learning.$dtp_event_document$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_learning.$sym29$VISIT_DEFSTRUCT_OBJECT_EVENT_DOCUMENT_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)event_learning.$sym67$GET_ALL_SUBEVENTS);
        memoization_state.note_globally_cached_function((SubLObject)event_learning.$sym73$GET_ALL_SCRIPTED_SUBEVENT_TYPES);
        memoization_state.note_globally_cached_function((SubLObject)event_learning.$sym122$GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES);
        memoization_state.note_globally_cached_function((SubLObject)event_learning.$sym130$DIFFERENTIATING_GENLS);
        return (SubLObject)event_learning.NIL;
    }
    
    public void declareFunctions() {
        declare_event_learning_file();
    }
    
    public void initializeVariables() {
        init_event_learning_file();
    }
    
    public void runTopLevelForms() {
        setup_event_learning_file();
    }
    
    static {
        me = (SubLFile)new event_learning();
        event_learning.$event_finding_query_mt$ = null;
        event_learning.$event_learning_indexes_templates$ = null;
        event_learning.$event_learning_cyclist$ = null;
        event_learning.$event_learner_head_mt$ = null;
        event_learning.$dtp_event_document$ = null;
        event_learning.$get_all_subevents_caching_state$ = null;
        event_learning.$get_all_scripted_subevent_types_caching_state$ = null;
        event_learning.$search_term_relevancy_too_high$ = null;
        event_learning.$search_term_relevancy_too_low$ = null;
        event_learning.$search_term_relevancy_accept$ = null;
        event_learning.$get_phrases_for_differentiated_event_types_caching_state$ = null;
        event_learning.$differentiating_genls_caching_state$ = null;
        event_learning.$subevents$ = null;
        $const0$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const1$TheUser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheUser"));
        $const2$EventLearnerHeadMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EventLearnerHeadMt"));
        $sym3$EVENT_DOCUMENT = SubLObjectFactory.makeSymbol("EVENT-DOCUMENT");
        $sym4$EVENT_DOCUMENT_P = SubLObjectFactory.makeSymbol("EVENT-DOCUMENT-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-STRING"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("URL"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-STRING"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-DOC-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-DOC-URL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-DOC-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-DOC-HTML-STRING"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-URL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-HTML-STRING"));
        $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym10$EVENT_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EVENT-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-DOCUMENT-P"));
        $sym12$EVENT_DOC_CYCL = SubLObjectFactory.makeSymbol("EVENT-DOC-CYCL");
        $sym13$_CSETF_EVENT_DOC_CYCL = SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-CYCL");
        $sym14$EVENT_DOC_URL = SubLObjectFactory.makeSymbol("EVENT-DOC-URL");
        $sym15$_CSETF_EVENT_DOC_URL = SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-URL");
        $sym16$EVENT_DOC_STRING = SubLObjectFactory.makeSymbol("EVENT-DOC-STRING");
        $sym17$_CSETF_EVENT_DOC_STRING = SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-STRING");
        $sym18$EVENT_DOC_HTML_STRING = SubLObjectFactory.makeSymbol("EVENT-DOC-HTML-STRING");
        $sym19$_CSETF_EVENT_DOC_HTML_STRING = SubLObjectFactory.makeSymbol("_CSETF-EVENT-DOC-HTML-STRING");
        $kw20$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw21$URL = SubLObjectFactory.makeKeyword("URL");
        $kw22$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw23$HTML_STRING = SubLObjectFactory.makeKeyword("HTML-STRING");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_EVENT_DOCUMENT = SubLObjectFactory.makeSymbol("MAKE-EVENT-DOCUMENT");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_EVENT_DOCUMENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-DOCUMENT-METHOD");
        $const30$WebPageAtURLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebPageAtURLFn"));
        $const31$URLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URLFn"));
        $const32$ContentMtOfCDAFromEventTypeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtOfCDAFromEventTypeFn"));
        $const33$URLReferentFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URLReferentFn"));
        $list34 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EBMT-EnglishToCycL")));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DOC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym37$SENTENCIFY_STRING = SubLObjectFactory.makeSymbol("SENTENCIFY-STRING");
        $sym38$GET_EVENT_DOC_STRING = SubLObjectFactory.makeSymbol("GET-EVENT-DOC-STRING");
        $str39$ = SubLObjectFactory.makeString("");
        $kw40$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str41$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str42$_ = SubLObjectFactory.makeString(" ");
        $kw43$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $const44$facilitates_EventEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facilitates-EventEvent"));
        $str45$Invalid_search_direction__A__no_o = SubLObjectFactory.makeString("Invalid search direction ~A: no other direction is currently imlemented.");
        $kw46$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw47$SEED_EVENT = SubLObjectFactory.makeKeyword("SEED-EVENT");
        $kw48$EVENT = SubLObjectFactory.makeKeyword("EVENT");
        $const49$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-GRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-PROVIDED"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"));
        $kw52$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw53$NOT_PROVIDED = SubLObjectFactory.makeKeyword("NOT-PROVIDED");
        $sym54$LINKED = SubLObjectFactory.makeUninternedSymbol("LINKED");
        $sym55$EVENT_ROOT = SubLObjectFactory.makeUninternedSymbol("EVENT-ROOT");
        $sym56$THE_DIRECTION = SubLObjectFactory.makeUninternedSymbol("THE-DIRECTION");
        $sym57$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym58$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-PROVIDED"));
        $sym60$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym61$DICTIONARY_LOOKUP = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $sym62$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym63$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str64$Cannot_walk_event_graph_generated = SubLObjectFactory.makeString("Cannot walk event graph generated in direction ~A in direction ~A.~%");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEED-EVENT"));
        $sym66$WALK_GRAPH_BREADTH_FIRST = SubLObjectFactory.makeSymbol("WALK-GRAPH-BREADTH-FIRST");
        $sym67$GET_ALL_SUBEVENTS = SubLObjectFactory.makeSymbol("GET-ALL-SUBEVENTS");
        $sym68$_EVENT = SubLObjectFactory.makeSymbol("?EVENT");
        $const69$properSubEvents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents"));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?EVENT"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)event_learning.NIL);
        $sym72$_GET_ALL_SUBEVENTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-ALL-SUBEVENTS-CACHING-STATE*");
        $sym73$GET_ALL_SCRIPTED_SUBEVENT_TYPES = SubLObjectFactory.makeSymbol("GET-ALL-SCRIPTED-SUBEVENT-TYPES");
        $sym74$_SUB_TYPE = SubLObjectFactory.makeSymbol("?SUB-TYPE");
        $const75$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const76$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"));
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?DIRECT-SUB-TYPE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateProperSubSituationTypes")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateProperSubSituationTypes")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?DIRECT-SUB-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateProperSubSituationTypes")), (SubLObject)SubLObjectFactory.makeSymbol("?DIRECT-SUB-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SUB-TYPE"))))));
        $sym79$_GET_ALL_SCRIPTED_SUBEVENT_TYPES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-ALL-SCRIPTED-SUBEVENT-TYPES-CACHING-STATE*");
        $int80$1000 = SubLObjectFactory.makeInteger(1000);
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TERM"));
        $sym82$_ = SubLObjectFactory.makeSymbol(">");
        $sym83$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym84$_ = SubLObjectFactory.makeSymbol("<");
        $sym85$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str86$Cyc_rejected___S = SubLObjectFactory.makeString("Cyc rejected: ~S");
        $kw87$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym88$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const89$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $str91$No_semantic_MT_found_for__S__retu = SubLObjectFactory.makeString("No semantic MT found for ~S, returning default value: ~S");
        $sym92$_SPINDLE = SubLObjectFactory.makeSymbol("?SPINDLE");
        $const93$mtSpindleCollector = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtSpindleCollector"));
        $str94$Added__S_new_templates_to_the_EBM = SubLObjectFactory.makeString("Added ~S new templates to the EBMT Template Index");
        $kw95$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const96$Event = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event"));
        $const97$SBHLTimePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SBHLTimePredicate"));
        $const98$Role = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Role"));
        $const99$subEvents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subEvents"));
        $kw100$UNPROVIDED = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $sym101$WEBSTORE_INDEX_DOC_COUNT = SubLObjectFactory.makeSymbol("WEBSTORE-INDEX-DOC-COUNT");
        $kw102$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list103 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HoursDuration")), (SubLObject)event_learning.ONE_INTEGER);
        $const104$ActorSlot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ActorSlot"));
        $sym105$_HEAD = SubLObjectFactory.makeSymbol("?HEAD");
        $const106$mtSpindleHead = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtSpindleHead"));
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HEAD"));
        $const108$mtSpindleMember = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtSpindleMember"));
        $str109$Failed_to_assert___S_in__S = SubLObjectFactory.makeString("Failed to assert: ~S in ~S");
        $sym110$INDEXICAL_P = SubLObjectFactory.makeSymbol("INDEXICAL-P");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FACT"), (SubLObject)SubLObjectFactory.makeSymbol("MARKER-STRINGS"));
        $list112 = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_hyphen });
        $sym113$PROPER_SUPERSTRING_ = SubLObjectFactory.makeSymbol("PROPER-SUPERSTRING?");
        $kw114$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $const116$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $sym117$GENERATE_ENGLISH_DAY_NAUT = SubLObjectFactory.makeSymbol("GENERATE-ENGLISH-DAY-NAUT");
        $const118$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $const119$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym120$CYCL_EVENT_P = SubLObjectFactory.makeSymbol("CYCL-EVENT-P");
        $sym121$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym122$GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES = SubLObjectFactory.makeSymbol("GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DIFFERENTIATED-GENLS"));
        $sym124$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $const125$termPhrases = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $list126 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordStrings")), (SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $const127$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASES"));
        $sym129$_GET_PHRASES_FOR_DIFFERENTIATED_EVENT_TYPES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-PHRASES-FOR-DIFFERENTIATED-EVENT-TYPES-CACHING-STATE*");
        $sym130$DIFFERENTIATING_GENLS = SubLObjectFactory.makeSymbol("DIFFERENTIATING-GENLS");
        $kw131$GENL = SubLObjectFactory.makeKeyword("GENL");
        $const132$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL"));
        $const134$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const135$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym136$_OTHER_TYPE = SubLObjectFactory.makeSymbol("?OTHER-TYPE");
        $const137$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $const138$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $list139 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?OTHER-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")));
        $sym140$_DIFFERENTIATING_GENLS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DIFFERENTIATING-GENLS-CACHING-STATE*");
        $sym141$CLEAR_DIFFERENTIATING_GENLS = SubLObjectFactory.makeSymbol("CLEAR-DIFFERENTIATING-GENLS");
        $sym142$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym143$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str144$__ = SubLObjectFactory.makeString("~~");
        $str145$_ = SubLObjectFactory.makeString("~");
        $kw146$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $kw147$SPECIFIC = SubLObjectFactory.makeKeyword("SPECIFIC");
        $sym148$LAMBDA_SUBEVENT_ = SubLObjectFactory.makeSymbol("LAMBDA-SUBEVENT?");
        $const149$TheFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn"));
        $str150$No_substitution_done_for__S = SubLObjectFactory.makeString("No substitution done for ~S");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("kidnapping"), (SubLObject)SubLObjectFactory.makeString("ransom"));
        $sym152$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $list153 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("crimeVictim")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentCaptured")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")));
        $sym154$GREATER_LENGTH_P = SubLObjectFactory.makeSymbol("GREATER-LENGTH-P");
        $list155 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("FACTS"));
        $str156$Failed_to_assert__S_in__S_because = SubLObjectFactory.makeString("Failed to assert ~S in ~S because: ~%~S");
        $str157$GatheredEvent = SubLObjectFactory.makeString("GatheredEvent");
        $kw158$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $str159$Failed_to_assert___S_in__S__ = SubLObjectFactory.makeString("Failed to assert: ~S in ~S~%");
        $str160$NOT_WFF___S__ = SubLObjectFactory.makeString("NOT-WFF: ~S~%");
        $sym161$SEARCH = SubLObjectFactory.makeSymbol("SEARCH");
        $str162$_s_is_not_present_in_input_linkag = SubLObjectFactory.makeString("~s is not present in input linkage~% Words: ~S");
        $sym163$WORDS = SubLObjectFactory.makeSymbol("WORDS");
        $sym164$LINK_P = SubLObjectFactory.makeSymbol("LINK-P");
    }
    
    public static final class $event_document_native extends SubLStructNative
    {
        public SubLObject $cycl;
        public SubLObject $url;
        public SubLObject $string;
        public SubLObject $html_string;
        private static final SubLStructDeclNative structDecl;
        
        public $event_document_native() {
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$url = (SubLObject)CommonSymbols.NIL;
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$html_string = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$event_document_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl;
        }
        
        public SubLObject getField3() {
            return this.$url;
        }
        
        public SubLObject getField4() {
            return this.$string;
        }
        
        public SubLObject getField5() {
            return this.$html_string;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$url = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$string = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$html_string = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$event_document_native.class, event_learning.$sym3$EVENT_DOCUMENT, event_learning.$sym4$EVENT_DOCUMENT_P, event_learning.$list5, event_learning.$list6, new String[] { "$cycl", "$url", "$string", "$html_string" }, event_learning.$list7, event_learning.$list8, event_learning.$sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $event_document_p$UnaryFunction extends UnaryFunction
    {
        public $event_document_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EVENT-DOCUMENT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return event_learning.event_document_p(arg1);
        }
    }
}

/*

	Total time: 548 ms
	
*/