package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.pph_question;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class quirk_java_gui extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_java_gui";
    public static final String myFingerPrint = "351dc5589e932d701f2ac6767f930a3d3f17366b27486a599221a25e79fdcf6e";
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 1721L)
    private static SubLSymbol $answer_gui_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 1998L)
    private static SubLSymbol $geq_store$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2057L)
    private static SubLSymbol $geq_entity_store$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLSymbol $dtp_gui_enabled_question$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 15060L)
    private static SubLSymbol $entity_graph_registry$;
    private static final SubLSymbol $sym0$SEMTRANS_LEXICON;
    private static final SubLSymbol $sym1$GUI_ENABLED_QUESTION;
    private static final SubLSymbol $sym2$GUI_ENABLED_QUESTION_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PPRINT_GEQ;
    private static final SubLSymbol $sym8$GUI_ENABLED_QUESTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GEQ_QUESTION_OBJECT;
    private static final SubLSymbol $sym11$_CSETF_GEQ_QUESTION_OBJECT;
    private static final SubLSymbol $sym12$GEQ_ANSWERS;
    private static final SubLSymbol $sym13$_CSETF_GEQ_ANSWERS;
    private static final SubLSymbol $sym14$GEQ_FOCUS_ENTITIES;
    private static final SubLSymbol $sym15$_CSETF_GEQ_FOCUS_ENTITIES;
    private static final SubLSymbol $sym16$GEQ_RESEARCH_DONE;
    private static final SubLSymbol $sym17$_CSETF_GEQ_RESEARCH_DONE;
    private static final SubLSymbol $kw18$QUESTION_OBJECT;
    private static final SubLSymbol $kw19$ANSWERS;
    private static final SubLSymbol $kw20$FOCUS_ENTITIES;
    private static final SubLSymbol $kw21$RESEARCH_DONE;
    private static final SubLString $str22$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw23$BEGIN;
    private static final SubLSymbol $sym24$MAKE_GUI_ENABLED_QUESTION;
    private static final SubLSymbol $kw25$SLOT;
    private static final SubLSymbol $kw26$END;
    private static final SubLSymbol $sym27$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_QUESTION_METHOD;
    private static final SubLString $str28$_GEQ___A_answers_;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$STRINGP;
    private static final SubLSymbol $sym31$ANSWER;
    private static final SubLSymbol $sym32$INTEGERP;
    private static final SubLSymbol $sym33$CONTENT;
    private static final SubLSymbol $sym34$JUSTIFICATION;
    private static final SubLSymbol $sym35$DOC_ID;
    private static final SubLSymbol $sym36$TEXT;
    private static final SubLString $str37$;
    private static final SubLSymbol $sym38$IDENTIFY_ENTITIES;
    private static final SubLSymbol $sym39$NAME;
    private static final SubLSymbol $sym40$ADD_PASSAGE;
    private static final SubLSymbol $sym41$GET_LABEL;
    private static final SubLSymbol $sym42$GET_CORE;
    private static final SubLObject $const43$Thing;
    private static final SubLSymbol $sym44$GET_ID;
    private static final SubLSymbol $sym45$CYC_GRAPH_NODE;
    private static final SubLSymbol $sym46$SET_CORE;
    private static final SubLSymbol $sym47$SET_LABEL;
    private static final SubLSymbol $sym48$INTERPOLATE_NODE;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$INTERPOLATE_CYC_TERM;
    private static final SubLObject $const51$isa;
    private static final SubLSymbol $sym52$GET;
    private static final SubLSymbol $kw53$INFLECTIONS;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$SEMTRANS;
    private static final SubLObject $const56$equals;
    private static final SubLString $str57$__;
    private static final SubLObject $const58$InstanceNamedFn;
    private static final SubLSymbol $sym59$GET_NODE_BY_ID;
    private static final SubLSymbol $sym60$GET_NODES_FROM_NODE;
    private static final SubLString $str61$no_answers__geq___S__;
    private static final SubLSymbol $sym62$ALL_TYPES;
    private static final SubLSymbol $kw63$ANY;
    private static final SubLObject $const64$EnglishParaphraseMt;
    private static final SubLSymbol $sym65$LEARN_TYPES_FROM_CORPORA;
    private static final SubLSymbol $sym66$RENDER;
    private static final SubLSymbol $sym67$INFERENCE_POOL_CREATED;
    private static final SubLSymbol $sym68$GENERATE_SALIENT_QUERIES;
    private static final SubLSymbol $sym69$GET_SALIENT_QUERIES;
    private static final SubLSymbol $kw70$ALL;
    private static final SubLSymbol $sym71$QUERY;
    private static final SubLObject $const72$Person;
    private static final SubLString $str73$Who_is_;
    private static final SubLString $str74$_;
    private static final SubLObject $const75$Organization;
    private static final SubLString $str76$What_is_;
    private static final SubLList $list77;
    private static final SubLObject $const78$EverythingPSC;
    private static final SubLInteger $int79$30;
    private static final SubLSymbol $sym80$PASSAGES;
    private static final SubLSymbol $sym81$GET_CONTENT;
    private static final SubLString $str82$__Could_not_open_file__A;
    private static final SubLSymbol $sym83$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw84$INPUT;
    private static final SubLString $str85$Unable_to_open__S;
    private static final SubLString $str86$___S;
    private static final SubLInteger $int87$10000000;
    private static final SubLString $str88$__File__A_is_too_big_for_me_to_di;
    private static final SubLString $str89$_home_elmore0_scratch_quirk_corpo;
    private static final SubLString $str90$_trec;
    private static final SubLSymbol $sym91$_TERM;
    private static final SubLObject $const92$wordIndexesCycTerm;
    private static final SubLObject $const93$KBContentTest_FullySpecified;
    private static final SubLObject $const94$CycLQuerySpecification;
    private static final SubLObject $const95$UnitOfMeasure;
    private static final SubLSymbol $sym96$RELEVANT_MT_IS_EVERYTHING;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 1819L)
    public static SubLObject get_answer_gui_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (quirk_java_gui.NIL == quirk_java_gui.$answer_gui_lexicon$.getDynamicValue(thread)) {
            quirk_java_gui.$answer_gui_lexicon$.setDynamicValue(object.new_class_instance((SubLObject)quirk_java_gui.$sym0$SEMTRANS_LEXICON), thread);
        }
        return quirk_java_gui.$answer_gui_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject gui_enabled_question_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_geq(v_object, stream, (SubLObject)quirk_java_gui.ZERO_INTEGER);
        return (SubLObject)quirk_java_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject gui_enabled_question_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $gui_enabled_question_native.class) ? quirk_java_gui.T : quirk_java_gui.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject geq_question_object(final SubLObject v_object) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject geq_answers(final SubLObject v_object) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject geq_focus_entities(final SubLObject v_object) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject geq_research_done(final SubLObject v_object) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject _csetf_geq_question_object(final SubLObject v_object, final SubLObject value) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject _csetf_geq_answers(final SubLObject v_object, final SubLObject value) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject _csetf_geq_focus_entities(final SubLObject v_object, final SubLObject value) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject _csetf_geq_research_done(final SubLObject v_object, final SubLObject value) {
        assert quirk_java_gui.NIL != gui_enabled_question_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject make_gui_enabled_question(SubLObject arglist) {
        if (arglist == quirk_java_gui.UNPROVIDED) {
            arglist = (SubLObject)quirk_java_gui.NIL;
        }
        final SubLObject v_new = (SubLObject)new $gui_enabled_question_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)quirk_java_gui.NIL, next = arglist; quirk_java_gui.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)quirk_java_gui.$kw18$QUESTION_OBJECT)) {
                _csetf_geq_question_object(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)quirk_java_gui.$kw19$ANSWERS)) {
                _csetf_geq_answers(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)quirk_java_gui.$kw20$FOCUS_ENTITIES)) {
                _csetf_geq_focus_entities(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)quirk_java_gui.$kw21$RESEARCH_DONE)) {
                _csetf_geq_research_done(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)quirk_java_gui.$str22$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject visit_defstruct_gui_enabled_question(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)quirk_java_gui.$kw23$BEGIN, (SubLObject)quirk_java_gui.$sym24$MAKE_GUI_ENABLED_QUESTION, (SubLObject)quirk_java_gui.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)quirk_java_gui.$kw25$SLOT, (SubLObject)quirk_java_gui.$kw18$QUESTION_OBJECT, geq_question_object(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)quirk_java_gui.$kw25$SLOT, (SubLObject)quirk_java_gui.$kw19$ANSWERS, geq_answers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)quirk_java_gui.$kw25$SLOT, (SubLObject)quirk_java_gui.$kw20$FOCUS_ENTITIES, geq_focus_entities(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)quirk_java_gui.$kw25$SLOT, (SubLObject)quirk_java_gui.$kw21$RESEARCH_DONE, geq_research_done(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)quirk_java_gui.$kw26$END, (SubLObject)quirk_java_gui.$sym24$MAKE_GUI_ENABLED_QUESTION, (SubLObject)quirk_java_gui.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2122L)
    public static SubLObject visit_defstruct_object_gui_enabled_question_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gui_enabled_question(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2276L)
    public static SubLObject pprint_geq(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)quirk_java_gui.$str28$_GEQ___A_answers_, Sequences.length(geq_answers(v_object)));
        return (SubLObject)quirk_java_gui.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2422L)
    public static SubLObject new_gui_enabled_question(final SubLObject question_string, SubLObject corpora) {
        if (corpora == quirk_java_gui.UNPROVIDED) {
            corpora = (SubLObject)quirk_java_gui.$list29;
        }
        assert quirk_java_gui.NIL != Types.stringp(question_string) : question_string;
        final SubLObject geq = make_gui_enabled_question((SubLObject)quirk_java_gui.UNPROVIDED);
        SubLObject question_object = question.new_question(question_string, corpora, (SubLObject)quirk_java_gui.UNPROVIDED);
        if (quirk_java_gui.NIL == question_object) {
            question_object = search_engine.new_lemur_query(question_string, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
        }
        _csetf_geq_question_object(geq, question_object);
        _csetf_geq_answers(geq, methods.funcall_instance_method_with_0_args(question_object, (SubLObject)quirk_java_gui.$sym31$ANSWER));
        return geq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 2884L)
    public static SubLObject get_geq_answer_by_index(final SubLObject geq, final SubLObject idx) {
        assert quirk_java_gui.NIL != Types.integerp(idx) : idx;
        final SubLObject answer_obj = ConsesLow.nth(idx, geq_answers(geq));
        SubLObject precise_answer = (SubLObject)quirk_java_gui.NIL;
        SubLObject id = (SubLObject)quirk_java_gui.NIL;
        SubLObject v_context = (SubLObject)quirk_java_gui.NIL;
        if (quirk_java_gui.NIL != answer.text_answer_p(answer_obj)) {
            precise_answer = instances.get_slot(answer_obj, (SubLObject)quirk_java_gui.$sym33$CONTENT);
            id = instances.get_slot(instances.get_slot(answer_obj, (SubLObject)quirk_java_gui.$sym34$JUSTIFICATION), (SubLObject)quirk_java_gui.$sym35$DOC_ID);
            v_context = instances.get_slot(instances.get_slot(answer_obj, (SubLObject)quirk_java_gui.$sym34$JUSTIFICATION), (SubLObject)quirk_java_gui.$sym36$TEXT);
        }
        else if (quirk_java_gui.NIL != search_engine.corpus_passage_p(answer_obj)) {
            id = instances.get_slot(answer_obj, (SubLObject)quirk_java_gui.$sym35$DOC_ID);
            v_context = instances.get_slot(answer_obj, (SubLObject)quirk_java_gui.$sym36$TEXT);
        }
        if (!precise_answer.isString()) {
            precise_answer = (SubLObject)quirk_java_gui.$str37$;
        }
        if (!id.isString()) {
            id = (SubLObject)quirk_java_gui.$str37$;
        }
        if (!v_context.isString()) {
            v_context = (SubLObject)quirk_java_gui.$str37$;
        }
        return (SubLObject)ConsesLow.list(precise_answer, id, v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 3633L)
    public static SubLObject identify_geq_entities_for_index(final SubLObject geq, final SubLObject idx) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (quirk_java_gui.NIL == quirk_java_gui.$geq_entity_store$.getDynamicValue(thread)) {
            quirk_java_gui.$geq_entity_store$.setDynamicValue(Hashtables.make_hash_table((SubLObject)quirk_java_gui.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)quirk_java_gui.EQUALP), (SubLObject)quirk_java_gui.UNPROVIDED), thread);
        }
        assert quirk_java_gui.NIL != Types.integerp(idx) : idx;
        if (quirk_java_gui.NIL != geq_research_done(geq)) {
            return geq;
        }
        final SubLObject answer_obj = ConsesLow.nth(idx, geq_answers(geq));
        final SubLObject passage = (quirk_java_gui.NIL != answer.answer_p(answer_obj)) ? instances.get_slot(answer_obj, (SubLObject)quirk_java_gui.$sym34$JUSTIFICATION) : answer_obj;
        if (quirk_java_gui.NIL != search_engine.corpus_passage_p(passage)) {
            SubLObject cdolist_list_var;
            final SubLObject entities = cdolist_list_var = methods.funcall_instance_method_with_1_args(passage, (SubLObject)quirk_java_gui.$sym38$IDENTIFY_ENTITIES, get_answer_gui_lexicon());
            SubLObject ent = (SubLObject)quirk_java_gui.NIL;
            ent = cdolist_list_var.first();
            while (quirk_java_gui.NIL != cdolist_list_var) {
                if (quirk_java_gui.NIL != focus_entity.textual_focus_entity_p(ent)) {
                    final SubLObject name = methods.funcall_instance_method_with_0_args(ent, (SubLObject)quirk_java_gui.$sym39$NAME);
                    final SubLObject stored_entity = Hashtables.gethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED);
                    if (quirk_java_gui.NIL != focus_entity.textual_focus_entity_p(stored_entity)) {
                        methods.funcall_instance_method_with_1_args(stored_entity, (SubLObject)quirk_java_gui.$sym40$ADD_PASSAGE, passage);
                        Hashtables.sethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), stored_entity);
                    }
                    else {
                        Hashtables.sethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), ent);
                    }
                    final SubLObject item_var = name;
                    if (quirk_java_gui.NIL == conses_high.member(item_var, geq_focus_entities(geq), (SubLObject)quirk_java_gui.EQUALP, Symbols.symbol_function((SubLObject)quirk_java_gui.IDENTITY))) {
                        _csetf_geq_focus_entities(geq, (SubLObject)ConsesLow.cons(item_var, geq_focus_entities(geq)));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ent = cdolist_list_var.first();
            }
        }
        return geq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 4563L)
    public static SubLObject answer_gui_question_int(final SubLObject question_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (quirk_java_gui.NIL == quirk_java_gui.$geq_store$.getDynamicValue(thread)) {
            quirk_java_gui.$geq_store$.setDynamicValue(Hashtables.make_hash_table((SubLObject)quirk_java_gui.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)quirk_java_gui.EQUALP), (SubLObject)quirk_java_gui.UNPROVIDED), thread);
        }
        final SubLObject stored_geq = Hashtables.gethash(question_string, quirk_java_gui.$geq_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject geq = (quirk_java_gui.NIL != stored_geq) ? stored_geq : new_gui_enabled_question(question_string, (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject length = Sequences.length(geq_answers(geq));
        SubLObject answer_triples = (SubLObject)quirk_java_gui.NIL;
        if (quirk_java_gui.NIL == stored_geq) {
            Hashtables.sethash(question_string, quirk_java_gui.$geq_store$.getDynamicValue(thread), geq);
        }
        if (quirk_java_gui.ZERO_INTEGER.numE(length)) {
            return (SubLObject)ConsesLow.list(generate_quirk_gui_empty_answer());
        }
        SubLObject i;
        for (i = (SubLObject)quirk_java_gui.NIL, i = (SubLObject)quirk_java_gui.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)quirk_java_gui.ONE_INTEGER)) {
            answer_triples = (SubLObject)ConsesLow.cons(get_geq_answer_by_index(geq, i), answer_triples);
        }
        return Sequences.nreverse(answer_triples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 5233L)
    public static SubLObject generate_quirk_gui_empty_answer() {
        return (SubLObject)ConsesLow.list((SubLObject)quirk_java_gui.$str37$, (SubLObject)quirk_java_gui.$str37$, (SubLObject)quirk_java_gui.$str37$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 5310L)
    public static SubLObject get_geq_entity_graph_root_description(final SubLObject geq_string, SubLObject rebuild) {
        if (rebuild == quirk_java_gui.UNPROVIDED) {
            rebuild = (SubLObject)quirk_java_gui.NIL;
        }
        final SubLObject root_node = build_geq_entity_graph(geq_string, rebuild);
        final SubLObject node_label = methods.funcall_instance_method_with_0_args(root_node, (SubLObject)quirk_java_gui.$sym41$GET_LABEL);
        final SubLObject type = (quirk_java_gui.NIL != methods.funcall_instance_method_with_0_args(root_node, (SubLObject)quirk_java_gui.$sym42$GET_CORE)) ? methods.funcall_instance_method_with_0_args(root_node, (SubLObject)quirk_java_gui.$sym42$GET_CORE) : quirk_java_gui.$const43$Thing;
        final SubLObject node_id = methods.funcall_instance_method_with_0_args(root_node, (SubLObject)quirk_java_gui.$sym44$GET_ID);
        return (SubLObject)ConsesLow.list(node_label, type, node_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 5636L)
    public static SubLObject build_geq_entity_graph(final SubLObject geq_string, SubLObject rebuild) {
        if (rebuild == quirk_java_gui.UNPROVIDED) {
            rebuild = (SubLObject)quirk_java_gui.NIL;
        }
        if (quirk_java_gui.NIL != get_graph_from_registry(geq_string) && quirk_java_gui.NIL == rebuild) {
            return get_root_node_from_registry(geq_string);
        }
        final SubLObject v_graph = graph.new_cyc_graph(geq_string);
        final SubLObject entity_triples = quirk_trampolines.identify_all_geq_entities(geq_string);
        final SubLObject root_node = object.new_class_instance((SubLObject)quirk_java_gui.$sym45$CYC_GRAPH_NODE);
        methods.funcall_instance_method_with_1_args(root_node, (SubLObject)quirk_java_gui.$sym46$SET_CORE, quirk_java_gui.$const43$Thing);
        methods.funcall_instance_method_with_1_args(root_node, (SubLObject)quirk_java_gui.$sym47$SET_LABEL, geq_string);
        methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)quirk_java_gui.$sym48$INTERPOLATE_NODE, root_node);
        SubLObject cdolist_list_var = entity_triples;
        SubLObject triple = (SubLObject)quirk_java_gui.NIL;
        triple = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = triple;
            SubLObject entity_name = (SubLObject)quirk_java_gui.NIL;
            SubLObject type = (SubLObject)quirk_java_gui.NIL;
            SubLObject type_name = (SubLObject)quirk_java_gui.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)quirk_java_gui.$list49);
            entity_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)quirk_java_gui.$list49);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)quirk_java_gui.$list49);
            type_name = current.first();
            current = current.rest();
            if (quirk_java_gui.NIL == current) {
                methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)quirk_java_gui.$sym50$INTERPOLATE_CYC_TERM, type);
                SubLObject cdolist_list_var_$1;
                final SubLObject entity_nodes = cdolist_list_var_$1 = create_smart_cyc_graph_nodes_from_type_name(type, entity_name);
                SubLObject node = (SubLObject)quirk_java_gui.NIL;
                node = cdolist_list_var_$1.first();
                while (quirk_java_gui.NIL != cdolist_list_var_$1) {
                    methods.funcall_instance_method_with_2_args(v_graph, (SubLObject)quirk_java_gui.$sym48$INTERPOLATE_NODE, node, quirk_java_gui.$const51$isa);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    node = cdolist_list_var_$1.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)quirk_java_gui.$list49);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        register_graph(v_graph, root_node);
        return root_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 6564L)
    public static SubLObject create_smart_cyc_graph_nodes_from_type_name(final SubLObject term_type, final SubLObject term_name) {
        final SubLObject lexes = methods.funcall_instance_method_with_1_args(get_answer_gui_lexicon(), (SubLObject)quirk_java_gui.$sym52$GET, term_name);
        SubLObject v_forts = (SubLObject)quirk_java_gui.NIL;
        SubLObject cyc_nodes = (SubLObject)quirk_java_gui.NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = (SubLObject)quirk_java_gui.NIL;
        lex = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            if (quirk_java_gui.NIL != abstract_lexicon.lex_entry_p(lex) && quirk_java_gui.NIL != conses_high.intersection(methods.funcall_instance_method_with_1_args(lex, (SubLObject)quirk_java_gui.$sym52$GET, (SubLObject)quirk_java_gui.$kw53$INFLECTIONS), (SubLObject)quirk_java_gui.$list54, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED)) {
                final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, (SubLObject)quirk_java_gui.$sym52$GET, (SubLObject)quirk_java_gui.$kw55$SEMTRANS);
                final SubLObject fort = (SubLObject)(quirk_java_gui.$const56$equals.eql(semtrans.first()) ? conses_high.third(semtrans) : quirk_java_gui.NIL);
                if (quirk_java_gui.NIL != forts.fort_p(fort) && quirk_java_gui.NIL != isa.isa_in_any_mtP(fort, term_type)) {
                    final SubLObject item_var = fort;
                    if (quirk_java_gui.NIL == conses_high.member(item_var, v_forts, Symbols.symbol_function((SubLObject)quirk_java_gui.EQL), Symbols.symbol_function((SubLObject)quirk_java_gui.IDENTITY))) {
                        v_forts = (SubLObject)ConsesLow.cons(item_var, v_forts);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        cdolist_list_var = v_forts;
        SubLObject fort2 = (SubLObject)quirk_java_gui.NIL;
        fort2 = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            final SubLObject other_name = pph_main.generate_phrase(fort2, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
            final SubLObject full_name = term_name.equalp(other_name) ? term_name : Sequences.cconcatenate(term_name, new SubLObject[] { quirk_java_gui.$str57$__, other_name });
            final SubLObject node = object.new_class_instance((SubLObject)quirk_java_gui.$sym45$CYC_GRAPH_NODE);
            methods.funcall_instance_method_with_1_args(node, (SubLObject)quirk_java_gui.$sym46$SET_CORE, fort2);
            methods.funcall_instance_method_with_1_args(node, (SubLObject)quirk_java_gui.$sym47$SET_LABEL, full_name);
            cyc_nodes = (SubLObject)ConsesLow.cons(node, cyc_nodes);
            cdolist_list_var = cdolist_list_var.rest();
            fort2 = cdolist_list_var.first();
        }
        if (quirk_java_gui.NIL == cyc_nodes) {
            final SubLObject node2 = object.new_class_instance((SubLObject)quirk_java_gui.$sym45$CYC_GRAPH_NODE);
            methods.funcall_instance_method_with_1_args(node2, (SubLObject)quirk_java_gui.$sym46$SET_CORE, (SubLObject)ConsesLow.list(quirk_java_gui.$const58$InstanceNamedFn, term_name, term_type));
            methods.funcall_instance_method_with_1_args(node2, (SubLObject)quirk_java_gui.$sym47$SET_LABEL, term_name);
            cyc_nodes = (SubLObject)ConsesLow.cons(node2, cyc_nodes);
        }
        return cyc_nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 7647L)
    public static SubLObject get_geq_entity_child_node_descriptions(final SubLObject node_id_string, final SubLObject root_label) {
        final SubLObject v_graph = get_graph_from_registry(root_label);
        final SubLObject node_id = reader.read_from_string_ignoring_errors(node_id_string, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject node = methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)quirk_java_gui.$sym59$GET_NODE_BY_ID, node_id);
        final SubLObject children = methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)quirk_java_gui.$sym60$GET_NODES_FROM_NODE, node);
        SubLObject result = (SubLObject)quirk_java_gui.NIL;
        SubLObject cdolist_list_var = children;
        SubLObject child = (SubLObject)quirk_java_gui.NIL;
        child = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(make_node_description(child), result);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 8058L)
    public static SubLObject make_node_description(final SubLObject node) {
        final SubLObject node_label = methods.funcall_instance_method_with_0_args(node, (SubLObject)quirk_java_gui.$sym41$GET_LABEL);
        final SubLObject type = (quirk_java_gui.NIL != methods.funcall_instance_method_with_0_args(node, (SubLObject)quirk_java_gui.$sym42$GET_CORE)) ? methods.funcall_instance_method_with_0_args(node, (SubLObject)quirk_java_gui.$sym42$GET_CORE) : quirk_java_gui.$const43$Thing;
        final SubLObject node_id = methods.funcall_instance_method_with_0_args(node, (SubLObject)quirk_java_gui.$sym44$GET_ID);
        return (SubLObject)ConsesLow.list(node_label, type, node_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 8280L)
    public static SubLObject identify_all_geq_entities_int(final SubLObject geq_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert quirk_java_gui.NIL != Types.stringp(geq_string) : geq_string;
        final SubLObject geq = Hashtables.gethash(geq_string, quirk_java_gui.$geq_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject length = (SubLObject)((quirk_java_gui.NIL != geq) ? Sequences.length(geq_answers(geq)) : quirk_java_gui.ZERO_INTEGER);
        SubLObject entity_triples = (SubLObject)quirk_java_gui.NIL;
        if (quirk_java_gui.ZERO_INTEGER.numE(length)) {
            Errors.warn((SubLObject)quirk_java_gui.$str61$no_answers__geq___S__, geq);
            return (SubLObject)quirk_java_gui.NIL;
        }
        if (quirk_java_gui.NIL == geq_research_done(geq)) {
            SubLObject i;
            for (i = (SubLObject)quirk_java_gui.NIL, i = (SubLObject)quirk_java_gui.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)quirk_java_gui.ONE_INTEGER)) {
                identify_geq_entities_for_index(geq, i);
            }
            _csetf_geq_research_done(geq, (SubLObject)quirk_java_gui.T);
        }
        SubLObject cdolist_list_var = geq_focus_entities(geq);
        SubLObject name = (SubLObject)quirk_java_gui.NIL;
        name = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject min_types = cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(Hashtables.gethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED), (SubLObject)quirk_java_gui.$sym62$ALL_TYPES);
            SubLObject type = (SubLObject)quirk_java_gui.NIL;
            type = cdolist_list_var_$2.first();
            while (quirk_java_gui.NIL != cdolist_list_var_$2) {
                final SubLObject type_name = pph_main.generate_phrase(type, (SubLObject)quirk_java_gui.$kw63$ANY, (SubLObject)quirk_java_gui.NIL, quirk_java_gui.$const64$EnglishParaphraseMt, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
                final SubLObject triple = (SubLObject)ConsesLow.list(name, type, type_name);
                entity_triples = (SubLObject)ConsesLow.cons(triple, entity_triples);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                type = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return entity_triples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 9482L)
    public static SubLObject research_entity(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert quirk_java_gui.NIL != Types.stringp(entity_name) : entity_name;
        final SubLObject entity = Hashtables.gethash(entity_name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED);
        SubLObject summary = (SubLObject)quirk_java_gui.NIL;
        if (quirk_java_gui.NIL != focus_entity.textual_focus_entity_p(entity)) {
            methods.funcall_instance_method_with_1_args(entity, (SubLObject)quirk_java_gui.$sym65$LEARN_TYPES_FROM_CORPORA, (SubLObject)quirk_java_gui.$list29);
        }
        summary = methods.funcall_instance_method_with_0_args(entity, (SubLObject)quirk_java_gui.$sym66$RENDER);
        return summary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 9799L)
    public static SubLObject get_followups_for_entity_int(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert quirk_java_gui.NIL != Types.stringp(entity_name) : entity_name;
        final SubLObject entity = Hashtables.gethash(entity_name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED);
        if (quirk_java_gui.NIL != focus_entity.textual_focus_entity_p(entity)) {
            if (quirk_java_gui.NIL == instances.get_slot(entity, (SubLObject)quirk_java_gui.$sym67$INFERENCE_POOL_CREATED)) {
                methods.funcall_instance_method_with_0_args(entity, (SubLObject)quirk_java_gui.$sym68$GENERATE_SALIENT_QUERIES);
            }
            final SubLObject queries = methods.funcall_instance_method_with_1_args(entity, (SubLObject)quirk_java_gui.$sym69$GET_SALIENT_QUERIES, (SubLObject)quirk_java_gui.$kw70$ALL);
            final SubLObject types = methods.funcall_instance_method_with_0_args(entity, (SubLObject)quirk_java_gui.$sym62$ALL_TYPES);
            final SubLObject name = methods.funcall_instance_method_with_0_args(entity, (SubLObject)quirk_java_gui.$sym39$NAME);
            SubLObject query_strings = (SubLObject)quirk_java_gui.NIL;
            SubLObject v_wh_question = (SubLObject)quirk_java_gui.NIL;
            SubLObject cdolist_list_var = queries;
            SubLObject q = (SubLObject)quirk_java_gui.NIL;
            q = cdolist_list_var.first();
            while (quirk_java_gui.NIL != cdolist_list_var) {
                if (quirk_java_gui.NIL != search_engine.cycl_query_p(q)) {
                    final SubLObject cycl = instances.get_slot(q, (SubLObject)quirk_java_gui.$sym71$QUERY);
                    final SubLObject qstring = compute_reasonable_quirk_followup_question(cycl);
                    if (!qstring.equal(string_utilities.$empty_string$.getGlobalValue())) {
                        query_strings = (SubLObject)ConsesLow.cons(qstring, query_strings);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                q = cdolist_list_var.first();
            }
            if (quirk_java_gui.NIL == v_wh_question) {
                SubLObject csome_list_var = types;
                SubLObject type = (SubLObject)quirk_java_gui.NIL;
                type = csome_list_var.first();
                while (quirk_java_gui.NIL == v_wh_question && quirk_java_gui.NIL != csome_list_var) {
                    if (quirk_java_gui.NIL != at_utilities.more_specific_p(type, quirk_java_gui.$const72$Person, (SubLObject)quirk_java_gui.UNPROVIDED)) {
                        v_wh_question = Sequences.cconcatenate((SubLObject)quirk_java_gui.$str73$Who_is_, new SubLObject[] { name, quirk_java_gui.$str74$_ });
                    }
                    else if (quirk_java_gui.NIL != at_utilities.more_specific_p(type, quirk_java_gui.$const75$Organization, (SubLObject)quirk_java_gui.UNPROVIDED)) {
                        v_wh_question = Sequences.cconcatenate((SubLObject)quirk_java_gui.$str76$What_is_, new SubLObject[] { name, quirk_java_gui.$str74$_ });
                    }
                    csome_list_var = csome_list_var.rest();
                    type = csome_list_var.first();
                }
            }
            if (quirk_java_gui.NIL != v_wh_question) {
                query_strings = (SubLObject)ConsesLow.cons(v_wh_question, query_strings);
            }
            return query_strings;
        }
        return (SubLObject)quirk_java_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 10898L)
    public static SubLObject compute_reasonable_quirk_followup_question(final SubLObject cycl_expression) {
        final SubLObject terms = list_utilities.flatten(cycl_expression);
        final SubLObject cyc_internal_terms = (SubLObject)quirk_java_gui.$list77;
        SubLObject question_string = string_utilities.$empty_string$.getGlobalValue();
        if (quirk_java_gui.NIL != conses_high.intersection(terms, cyc_internal_terms, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED)) {
            return question_string;
        }
        final SubLObject generated_question_string = pph_question.generate_question(cycl_expression, quirk_java_gui.$const64$EnglishParaphraseMt, quirk_java_gui.$const78$EverythingPSC, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject length = Sequences.length(string_utilities.string_tokenize(question_string, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED));
        if (quirk_java_gui.$int79$30.numG(length)) {
            question_string = generated_question_string;
        }
        return question_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 11450L)
    public static SubLObject get_passages_for_entity_int(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert quirk_java_gui.NIL != Types.stringp(entity_name) : entity_name;
        final SubLObject entity = Hashtables.gethash(entity_name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), (SubLObject)quirk_java_gui.UNPROVIDED);
        if (quirk_java_gui.NIL == focus_entity.textual_focus_entity_p(entity)) {
            return (SubLObject)quirk_java_gui.NIL;
        }
        final SubLObject ent_passages = instances.get_slot(entity, (SubLObject)quirk_java_gui.$sym80$PASSAGES);
        SubLObject listified_passages = (SubLObject)quirk_java_gui.NIL;
        SubLObject cdolist_list_var = ent_passages;
        SubLObject ent_p = (SubLObject)quirk_java_gui.NIL;
        ent_p = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            if (quirk_java_gui.NIL != search_engine.corpus_passage_p(ent_p)) {
                SubLObject id = instances.get_slot(ent_p, (SubLObject)quirk_java_gui.$sym35$DOC_ID);
                SubLObject content = methods.funcall_instance_method_with_0_args(ent_p, (SubLObject)quirk_java_gui.$sym81$GET_CONTENT);
                if (quirk_java_gui.NIL == id) {
                    id = (SubLObject)quirk_java_gui.$str37$;
                }
                if (quirk_java_gui.NIL == content) {
                    content = (SubLObject)quirk_java_gui.$str37$;
                }
                listified_passages = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(id, content), listified_passages);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ent_p = cdolist_list_var.first();
        }
        return listified_passages;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 12298L)
    public static SubLObject return_document_as_string_int(final SubLObject passage_doc_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert quirk_java_gui.NIL != Types.stringp(passage_doc_id) : passage_doc_id;
        final SubLObject doc_path = compute_full_cns_path(passage_doc_id);
        final SubLObject error_message = PrintLow.format((SubLObject)quirk_java_gui.NIL, (SubLObject)quirk_java_gui.$str82$__Could_not_open_file__A, passage_doc_id);
        SubLObject result = (SubLObject)quirk_java_gui.$str37$;
        SubLObject file_length = (SubLObject)quirk_java_gui.NIL;
        SubLObject error = (SubLObject)quirk_java_gui.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)quirk_java_gui.$sym83$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = (SubLObject)quirk_java_gui.NIL;
                    try {
                        stream = compatibility.open_text(doc_path, (SubLObject)quirk_java_gui.$kw84$INPUT);
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)quirk_java_gui.$str85$Unable_to_open__S, doc_path);
                        }
                        final SubLObject in = stream;
                        PrintLow.format((SubLObject)quirk_java_gui.T, (SubLObject)quirk_java_gui.$str86$___S, streams_high.file_length(in));
                        file_length = streams_high.file_length(in);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)quirk_java_gui.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)quirk_java_gui.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    if (file_length.numG((SubLObject)quirk_java_gui.$int87$10000000)) {
                        result = PrintLow.format((SubLObject)quirk_java_gui.NIL, (SubLObject)quirk_java_gui.$str88$__File__A_is_too_big_for_me_to_di, passage_doc_id, file_length);
                    }
                    else {
                        final SubLObject lines = file_utilities.read_text_file(doc_path);
                        if (lines.isCons()) {
                            SubLObject cdolist_list_var = lines;
                            SubLObject line = (SubLObject)quirk_java_gui.NIL;
                            line = cdolist_list_var.first();
                            while (quirk_java_gui.NIL != cdolist_list_var) {
                                result = Sequences.cconcatenate(result, new SubLObject[] { string_utilities.$new_line_string$.getGlobalValue(), line });
                                cdolist_list_var = cdolist_list_var.rest();
                                line = cdolist_list_var.first();
                            }
                        }
                        else {
                            result = error_message;
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)quirk_java_gui.NIL);
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
        if (quirk_java_gui.NIL != error) {
            result = error_message;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 13409L)
    public static SubLObject compute_full_cns_path(final SubLObject passage_doc_id) {
        final SubLObject cns_base = (SubLObject)quirk_java_gui.$str89$_home_elmore0_scratch_quirk_corpo;
        SubLObject index = (SubLObject)quirk_java_gui.ZERO_INTEGER;
        final SubLObject len = Sequences.length(passage_doc_id);
        SubLObject finished = Numbers.numE(index, len);
        SubLObject suffix = (SubLObject)quirk_java_gui.NIL;
        while (quirk_java_gui.NIL == finished) {
            final SubLObject v_char = string_utilities.char_from_end(passage_doc_id, index);
            finished = Equality.eql((SubLObject)Characters.CHAR_period, v_char);
            index = Numbers.add(index, (SubLObject)quirk_java_gui.ONE_INTEGER);
        }
        suffix = string_utilities.string_last_n(index, passage_doc_id);
        return Sequences.cconcatenate(cns_base, new SubLObject[] { string_utilities.post_remove(passage_doc_id, suffix, (SubLObject)quirk_java_gui.UNPROVIDED), quirk_java_gui.$str90$_trec });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 13890L)
    public static SubLObject topics_related_to_entity_int(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert quirk_java_gui.NIL != Types.stringp(entity_name) : entity_name;
        final SubLObject variable = (SubLObject)quirk_java_gui.$sym91$_TERM;
        final SubLObject search_term = string_utilities.quote_string(entity_name, (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject query = (SubLObject)ConsesLow.list(quirk_java_gui.$const92$wordIndexesCycTerm, search_term, variable);
        final SubLObject topics = backward.removal_ask_variable(variable, query, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
        SubLObject topic_triples = (SubLObject)quirk_java_gui.NIL;
        SubLObject cdolist_list_var = topics;
        SubLObject topic = (SubLObject)quirk_java_gui.NIL;
        topic = cdolist_list_var.first();
        while (quirk_java_gui.NIL != cdolist_list_var) {
            if (quirk_java_gui.NIL != kb_accessors.individualP(topic) && quirk_java_gui.NIL == isa.isa_in_any_mtP(topic, quirk_java_gui.$const93$KBContentTest_FullySpecified) && quirk_java_gui.NIL == isa.isa_in_any_mtP(topic, quirk_java_gui.$const94$CycLQuerySpecification) && quirk_java_gui.NIL == isa.isa_in_any_mtP(topic, quirk_java_gui.$const95$UnitOfMeasure)) {
                final SubLObject topic_name = pph_main.generate_phrase(topic, (SubLObject)quirk_java_gui.$kw63$ANY, (SubLObject)quirk_java_gui.NIL, quirk_java_gui.$const64$EnglishParaphraseMt, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
                SubLObject topic_types = (SubLObject)quirk_java_gui.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)quirk_java_gui.$sym96$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(quirk_java_gui.$const78$EverythingPSC, thread);
                    topic_types = isa.min_isa(topic, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                SubLObject cdolist_list_var_$4 = topic_types;
                SubLObject type = (SubLObject)quirk_java_gui.NIL;
                type = cdolist_list_var_$4.first();
                while (quirk_java_gui.NIL != cdolist_list_var_$4) {
                    if (quirk_java_gui.NIL != focus_entity.admissible_focus_entity_type(type)) {
                        final SubLObject type_name = pph_main.generate_phrase(type, (SubLObject)quirk_java_gui.$kw63$ANY, (SubLObject)quirk_java_gui.NIL, quirk_java_gui.$const64$EnglishParaphraseMt, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
                        topic_triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(topic_name, type, type_name), topic_triples);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    type = cdolist_list_var_$4.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            topic = cdolist_list_var.first();
        }
        return topic_triples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 15113L)
    public static SubLObject clear_quirk_java_gui_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.clrhash(quirk_java_gui.$geq_store$.getDynamicValue(thread));
        Hashtables.clrhash(quirk_java_gui.$geq_entity_store$.getDynamicValue(thread));
        quirk_java_gui.$entity_graph_registry$.setDynamicValue((SubLObject)quirk_java_gui.NIL, thread);
        return (SubLObject)quirk_java_gui.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 15264L)
    public static SubLObject get_label_for_node_in_graph(final SubLObject node_id_string, final SubLObject graph_id_string) {
        assert quirk_java_gui.NIL != Types.stringp(node_id_string) : node_id_string;
        assert quirk_java_gui.NIL != Types.stringp(graph_id_string) : graph_id_string;
        final SubLObject v_graph = dictionary.dictionary_lookup(get_entity_graph_registry(), graph_id_string, (SubLObject)quirk_java_gui.UNPROVIDED);
        final SubLObject id = reader.parse_integer(node_id_string, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED, (SubLObject)quirk_java_gui.UNPROVIDED);
        return methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(v_graph, (SubLObject)quirk_java_gui.$sym59$GET_NODE_BY_ID, id), (SubLObject)quirk_java_gui.$sym41$GET_LABEL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 15603L)
    public static SubLObject get_entity_graph_registry() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (quirk_java_gui.NIL == dictionary.dictionary_p(quirk_java_gui.$entity_graph_registry$.getDynamicValue(thread))) {
            quirk_java_gui.$entity_graph_registry$.setDynamicValue(dictionary.new_dictionary((SubLObject)quirk_java_gui.EQUALP, (SubLObject)quirk_java_gui.FOUR_INTEGER), thread);
        }
        return quirk_java_gui.$entity_graph_registry$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 15796L)
    public static SubLObject register_graph(final SubLObject v_graph, final SubLObject root_node) {
        dictionary.dictionary_enter(get_entity_graph_registry(), instances.get_slot(v_graph, (SubLObject)quirk_java_gui.$sym39$NAME), (SubLObject)ConsesLow.list(v_graph, root_node));
        return (SubLObject)quirk_java_gui.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 15953L)
    public static SubLObject get_graph_from_registry(final SubLObject string) {
        return dictionary.dictionary_lookup(get_entity_graph_registry(), string, (SubLObject)quirk_java_gui.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-java-gui.lisp", position = 16075L)
    public static SubLObject get_root_node_from_registry(final SubLObject string) {
        return conses_high.second(dictionary.dictionary_lookup(get_entity_graph_registry(), string, (SubLObject)quirk_java_gui.UNPROVIDED));
    }
    
    public static SubLObject declare_quirk_java_gui_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_answer_gui_lexicon", "GET-ANSWER-GUI-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "gui_enabled_question_print_function_trampoline", "GUI-ENABLED-QUESTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "gui_enabled_question_p", "GUI-ENABLED-QUESTION-P", 1, 0, false);
        new $gui_enabled_question_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "geq_question_object", "GEQ-QUESTION-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "geq_answers", "GEQ-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "geq_focus_entities", "GEQ-FOCUS-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "geq_research_done", "GEQ-RESEARCH-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "_csetf_geq_question_object", "_CSETF-GEQ-QUESTION-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "_csetf_geq_answers", "_CSETF-GEQ-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "_csetf_geq_focus_entities", "_CSETF-GEQ-FOCUS-ENTITIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "_csetf_geq_research_done", "_CSETF-GEQ-RESEARCH-DONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "make_gui_enabled_question", "MAKE-GUI-ENABLED-QUESTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "visit_defstruct_gui_enabled_question", "VISIT-DEFSTRUCT-GUI-ENABLED-QUESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "visit_defstruct_object_gui_enabled_question_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-QUESTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "pprint_geq", "PPRINT-GEQ", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "new_gui_enabled_question", "NEW-GUI-ENABLED-QUESTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_geq_answer_by_index", "GET-GEQ-ANSWER-BY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "identify_geq_entities_for_index", "IDENTIFY-GEQ-ENTITIES-FOR-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "answer_gui_question_int", "ANSWER-GUI-QUESTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "generate_quirk_gui_empty_answer", "GENERATE-QUIRK-GUI-EMPTY-ANSWER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_geq_entity_graph_root_description", "GET-GEQ-ENTITY-GRAPH-ROOT-DESCRIPTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "build_geq_entity_graph", "BUILD-GEQ-ENTITY-GRAPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "create_smart_cyc_graph_nodes_from_type_name", "CREATE-SMART-CYC-GRAPH-NODES-FROM-TYPE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_geq_entity_child_node_descriptions", "GET-GEQ-ENTITY-CHILD-NODE-DESCRIPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "make_node_description", "MAKE-NODE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "identify_all_geq_entities_int", "IDENTIFY-ALL-GEQ-ENTITIES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "research_entity", "RESEARCH-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_followups_for_entity_int", "GET-FOLLOWUPS-FOR-ENTITY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "compute_reasonable_quirk_followup_question", "COMPUTE-REASONABLE-QUIRK-FOLLOWUP-QUESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_passages_for_entity_int", "GET-PASSAGES-FOR-ENTITY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "return_document_as_string_int", "RETURN-DOCUMENT-AS-STRING-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "compute_full_cns_path", "COMPUTE-FULL-CNS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "topics_related_to_entity_int", "TOPICS-RELATED-TO-ENTITY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "clear_quirk_java_gui_caches", "CLEAR-QUIRK-JAVA-GUI-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_label_for_node_in_graph", "GET-LABEL-FOR-NODE-IN-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_entity_graph_registry", "GET-ENTITY-GRAPH-REGISTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "register_graph", "REGISTER-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_graph_from_registry", "GET-GRAPH-FROM-REGISTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_java_gui", "get_root_node_from_registry", "GET-ROOT-NODE-FROM-REGISTRY", 1, 0, false);
        return (SubLObject)quirk_java_gui.NIL;
    }
    
    public static SubLObject init_quirk_java_gui_file() {
        quirk_java_gui.$answer_gui_lexicon$ = SubLFiles.defvar("*ANSWER-GUI-LEXICON*", (SubLObject)quirk_java_gui.NIL);
        quirk_java_gui.$geq_store$ = SubLFiles.defvar("*GEQ-STORE*", Hashtables.make_hash_table((SubLObject)quirk_java_gui.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)quirk_java_gui.EQUALP), (SubLObject)quirk_java_gui.UNPROVIDED));
        quirk_java_gui.$geq_entity_store$ = SubLFiles.defvar("*GEQ-ENTITY-STORE*", Hashtables.make_hash_table((SubLObject)quirk_java_gui.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)quirk_java_gui.EQUALP), (SubLObject)quirk_java_gui.UNPROVIDED));
        quirk_java_gui.$dtp_gui_enabled_question$ = SubLFiles.defconstant("*DTP-GUI-ENABLED-QUESTION*", (SubLObject)quirk_java_gui.$sym1$GUI_ENABLED_QUESTION);
        quirk_java_gui.$entity_graph_registry$ = SubLFiles.defvar("*ENTITY-GRAPH-REGISTRY*", (SubLObject)quirk_java_gui.NIL);
        return (SubLObject)quirk_java_gui.NIL;
    }
    
    public static SubLObject setup_quirk_java_gui_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), quirk_java_gui.$dtp_gui_enabled_question$.getGlobalValue(), Symbols.symbol_function((SubLObject)quirk_java_gui.$sym8$GUI_ENABLED_QUESTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)quirk_java_gui.$list9);
        Structures.def_csetf((SubLObject)quirk_java_gui.$sym10$GEQ_QUESTION_OBJECT, (SubLObject)quirk_java_gui.$sym11$_CSETF_GEQ_QUESTION_OBJECT);
        Structures.def_csetf((SubLObject)quirk_java_gui.$sym12$GEQ_ANSWERS, (SubLObject)quirk_java_gui.$sym13$_CSETF_GEQ_ANSWERS);
        Structures.def_csetf((SubLObject)quirk_java_gui.$sym14$GEQ_FOCUS_ENTITIES, (SubLObject)quirk_java_gui.$sym15$_CSETF_GEQ_FOCUS_ENTITIES);
        Structures.def_csetf((SubLObject)quirk_java_gui.$sym16$GEQ_RESEARCH_DONE, (SubLObject)quirk_java_gui.$sym17$_CSETF_GEQ_RESEARCH_DONE);
        Equality.identity((SubLObject)quirk_java_gui.$sym1$GUI_ENABLED_QUESTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), quirk_java_gui.$dtp_gui_enabled_question$.getGlobalValue(), Symbols.symbol_function((SubLObject)quirk_java_gui.$sym27$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_QUESTION_METHOD));
        return (SubLObject)quirk_java_gui.NIL;
    }
    
    public void declareFunctions() {
        declare_quirk_java_gui_file();
    }
    
    public void initializeVariables() {
        init_quirk_java_gui_file();
    }
    
    public void runTopLevelForms() {
        setup_quirk_java_gui_file();
    }
    
    static {
        me = (SubLFile)new quirk_java_gui();
        quirk_java_gui.$answer_gui_lexicon$ = null;
        quirk_java_gui.$geq_store$ = null;
        quirk_java_gui.$geq_entity_store$ = null;
        quirk_java_gui.$dtp_gui_enabled_question$ = null;
        quirk_java_gui.$entity_graph_registry$ = null;
        $sym0$SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON");
        $sym1$GUI_ENABLED_QUESTION = SubLObjectFactory.makeSymbol("GUI-ENABLED-QUESTION");
        $sym2$GUI_ENABLED_QUESTION_P = SubLObjectFactory.makeSymbol("GUI-ENABLED-QUESTION-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-ENTITIES"), (SubLObject)SubLObjectFactory.makeSymbol("RESEARCH-DONE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUESTION-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWERS"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUS-ENTITIES"), (SubLObject)SubLObjectFactory.makeKeyword("RESEARCH-DONE"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GEQ-QUESTION-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("GEQ-ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("GEQ-FOCUS-ENTITIES"), (SubLObject)SubLObjectFactory.makeSymbol("GEQ-RESEARCH-DONE"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEQ-QUESTION-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEQ-ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEQ-FOCUS-ENTITIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GEQ-RESEARCH-DONE"));
        $sym7$PPRINT_GEQ = SubLObjectFactory.makeSymbol("PPRINT-GEQ");
        $sym8$GUI_ENABLED_QUESTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GUI-ENABLED-QUESTION-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GUI-ENABLED-QUESTION-P"));
        $sym10$GEQ_QUESTION_OBJECT = SubLObjectFactory.makeSymbol("GEQ-QUESTION-OBJECT");
        $sym11$_CSETF_GEQ_QUESTION_OBJECT = SubLObjectFactory.makeSymbol("_CSETF-GEQ-QUESTION-OBJECT");
        $sym12$GEQ_ANSWERS = SubLObjectFactory.makeSymbol("GEQ-ANSWERS");
        $sym13$_CSETF_GEQ_ANSWERS = SubLObjectFactory.makeSymbol("_CSETF-GEQ-ANSWERS");
        $sym14$GEQ_FOCUS_ENTITIES = SubLObjectFactory.makeSymbol("GEQ-FOCUS-ENTITIES");
        $sym15$_CSETF_GEQ_FOCUS_ENTITIES = SubLObjectFactory.makeSymbol("_CSETF-GEQ-FOCUS-ENTITIES");
        $sym16$GEQ_RESEARCH_DONE = SubLObjectFactory.makeSymbol("GEQ-RESEARCH-DONE");
        $sym17$_CSETF_GEQ_RESEARCH_DONE = SubLObjectFactory.makeSymbol("_CSETF-GEQ-RESEARCH-DONE");
        $kw18$QUESTION_OBJECT = SubLObjectFactory.makeKeyword("QUESTION-OBJECT");
        $kw19$ANSWERS = SubLObjectFactory.makeKeyword("ANSWERS");
        $kw20$FOCUS_ENTITIES = SubLObjectFactory.makeKeyword("FOCUS-ENTITIES");
        $kw21$RESEARCH_DONE = SubLObjectFactory.makeKeyword("RESEARCH-DONE");
        $str22$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw23$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym24$MAKE_GUI_ENABLED_QUESTION = SubLObjectFactory.makeSymbol("MAKE-GUI-ENABLED-QUESTION");
        $kw25$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw26$END = SubLObjectFactory.makeKeyword("END");
        $sym27$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_QUESTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-QUESTION-METHOD");
        $str28$_GEQ___A_answers_ = SubLObjectFactory.makeString("<GEQ: ~A answers>");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("CNSjan2004"));
        $sym30$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym31$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym32$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym33$CONTENT = SubLObjectFactory.makeSymbol("CONTENT");
        $sym34$JUSTIFICATION = SubLObjectFactory.makeSymbol("JUSTIFICATION");
        $sym35$DOC_ID = SubLObjectFactory.makeSymbol("DOC-ID");
        $sym36$TEXT = SubLObjectFactory.makeSymbol("TEXT");
        $str37$ = SubLObjectFactory.makeString("");
        $sym38$IDENTIFY_ENTITIES = SubLObjectFactory.makeSymbol("IDENTIFY-ENTITIES");
        $sym39$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym40$ADD_PASSAGE = SubLObjectFactory.makeSymbol("ADD-PASSAGE");
        $sym41$GET_LABEL = SubLObjectFactory.makeSymbol("GET-LABEL");
        $sym42$GET_CORE = SubLObjectFactory.makeSymbol("GET-CORE");
        $const43$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym44$GET_ID = SubLObjectFactory.makeSymbol("GET-ID");
        $sym45$CYC_GRAPH_NODE = SubLObjectFactory.makeSymbol("CYC-GRAPH-NODE");
        $sym46$SET_CORE = SubLObjectFactory.makeSymbol("SET-CORE");
        $sym47$SET_LABEL = SubLObjectFactory.makeSymbol("SET-LABEL");
        $sym48$INTERPOLATE_NODE = SubLObjectFactory.makeSymbol("INTERPOLATE-NODE");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-NAME"));
        $sym50$INTERPOLATE_CYC_TERM = SubLObjectFactory.makeSymbol("INTERPOLATE-CYC-TERM");
        $const51$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym52$GET = SubLObjectFactory.makeSymbol("GET");
        $kw53$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $list54 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnNonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")));
        $kw55$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $const56$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $str57$__ = SubLObjectFactory.makeString(", ");
        $const58$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $sym59$GET_NODE_BY_ID = SubLObjectFactory.makeSymbol("GET-NODE-BY-ID");
        $sym60$GET_NODES_FROM_NODE = SubLObjectFactory.makeSymbol("GET-NODES-FROM-NODE");
        $str61$no_answers__geq___S__ = SubLObjectFactory.makeString("no-answers~%geq: ~S~%");
        $sym62$ALL_TYPES = SubLObjectFactory.makeSymbol("ALL-TYPES");
        $kw63$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const64$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $sym65$LEARN_TYPES_FROM_CORPORA = SubLObjectFactory.makeSymbol("LEARN-TYPES-FROM-CORPORA");
        $sym66$RENDER = SubLObjectFactory.makeSymbol("RENDER");
        $sym67$INFERENCE_POOL_CREATED = SubLObjectFactory.makeSymbol("INFERENCE-POOL-CREATED");
        $sym68$GENERATE_SALIENT_QUERIES = SubLObjectFactory.makeSymbol("GENERATE-SALIENT-QUERIES");
        $sym69$GET_SALIENT_QUERIES = SubLObjectFactory.makeSymbol("GET-SALIENT-QUERIES");
        $kw70$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym71$QUERY = SubLObjectFactory.makeSymbol("QUERY");
        $const72$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $str73$Who_is_ = SubLObjectFactory.makeString("Who is ");
        $str74$_ = SubLObjectFactory.makeString("?");
        $const75$Organization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"));
        $str76$What_is_ = SubLObjectFactory.makeString("What is ");
        $list77 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")));
        $const78$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int79$30 = SubLObjectFactory.makeInteger(30);
        $sym80$PASSAGES = SubLObjectFactory.makeSymbol("PASSAGES");
        $sym81$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $str82$__Could_not_open_file__A = SubLObjectFactory.makeString("~%Could not open file ~A");
        $sym83$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw84$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str85$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str86$___S = SubLObjectFactory.makeString("~%~S");
        $int87$10000000 = SubLObjectFactory.makeInteger(10000000);
        $str88$__File__A_is_too_big_for_me_to_di = SubLObjectFactory.makeString("~%File ~A is too big for me to display (~S characters)...");
        $str89$_home_elmore0_scratch_quirk_corpo = SubLObjectFactory.makeString("/home/elmore0/scratch/quirk/corpora/CNSjan2004trec/");
        $str90$_trec = SubLObjectFactory.makeString(".trec");
        $sym91$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const92$wordIndexesCycTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordIndexesCycTerm"));
        $const93$KBContentTest_FullySpecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentTest-FullySpecified"));
        $const94$CycLQuerySpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $const95$UnitOfMeasure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"));
        $sym96$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
    }
    
    public static final class $gui_enabled_question_native extends SubLStructNative
    {
        public SubLObject $question_object;
        public SubLObject $answers;
        public SubLObject $focus_entities;
        public SubLObject $research_done;
        private static final SubLStructDeclNative structDecl;
        
        public $gui_enabled_question_native() {
            this.$question_object = (SubLObject)CommonSymbols.NIL;
            this.$answers = (SubLObject)CommonSymbols.NIL;
            this.$focus_entities = (SubLObject)CommonSymbols.NIL;
            this.$research_done = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$gui_enabled_question_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$question_object;
        }
        
        public SubLObject getField3() {
            return this.$answers;
        }
        
        public SubLObject getField4() {
            return this.$focus_entities;
        }
        
        public SubLObject getField5() {
            return this.$research_done;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$question_object = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$answers = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$focus_entities = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$research_done = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$gui_enabled_question_native.class, quirk_java_gui.$sym1$GUI_ENABLED_QUESTION, quirk_java_gui.$sym2$GUI_ENABLED_QUESTION_P, quirk_java_gui.$list3, quirk_java_gui.$list4, new String[] { "$question_object", "$answers", "$focus_entities", "$research_done" }, quirk_java_gui.$list5, quirk_java_gui.$list6, quirk_java_gui.$sym7$PPRINT_GEQ);
        }
    }
    
    public static final class $gui_enabled_question_p$UnaryFunction extends UnaryFunction
    {
        public $gui_enabled_question_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GUI-ENABLED-QUESTION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return quirk_java_gui.gui_enabled_question_p(arg1);
        }
    }
}

/*

	Total time: 259 ms
	
*/