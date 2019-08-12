/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.abstract_lexicon.*;
import static com.cyc.cycjava.cycl.at_utilities.*;
import static com.cyc.cycjava.cycl.backward.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.dictionary.*;
import static com.cyc.cycjava.cycl.file_utilities.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.instances.*;
import static com.cyc.cycjava.cycl.isa.*;
import static com.cyc.cycjava.cycl.kb_accessors.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.methods.*;
import static com.cyc.cycjava.cycl.mt_relevance_macros.*;
import static com.cyc.cycjava.cycl.object.*;
import static com.cyc.cycjava.cycl.pph_main.*;
import static com.cyc.cycjava.cycl.pph_question.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUIRK-JAVA-GUI
 * source file: /cyc/top/cycl/quirk/quirk-java-gui.lisp
 * created:     2019/07/03 17:39:01
 */
public final class quirk_java_gui extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt31$ = makeString("");

    public static final SubLFile me = new quirk_java_gui();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_java_gui";


    // defvar
    // Definitions
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $answer_gui_lexicon$ = makeSymbol("*ANSWER-GUI-LEXICON*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $geq_store$ = makeSymbol("*GEQ-STORE*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $geq_entity_store$ = makeSymbol("*GEQ-ENTITY-STORE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_gui_enabled_question$ = makeSymbol("*DTP-GUI-ENABLED-QUESTION*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $entity_graph_registry$ = makeSymbol("*ENTITY-GRAPH-REGISTRY*");

    public static final SubLObject get_answer_gui_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $answer_gui_lexicon$.getDynamicValue(thread)) {
                $answer_gui_lexicon$.setDynamicValue(object.new_class_instance(SEMTRANS_LEXICON), thread);
            }
            return $answer_gui_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_answer_gui_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == quirk_java_gui.$answer_gui_lexicon$.getDynamicValue(thread)) {
            quirk_java_gui.$answer_gui_lexicon$.setDynamicValue(new_class_instance(SEMTRANS_LEXICON), thread);
        }
        return quirk_java_gui.$answer_gui_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject gui_enabled_question_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.quirk.quirk_java_gui.pprint_geq(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject gui_enabled_question_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        quirk_java_gui.pprint_geq(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject gui_enabled_question_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.quirk.quirk_java_gui.$gui_enabled_question_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject gui_enabled_question_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.quirk.quirk_java_gui.$gui_enabled_question_native.class ? T : NIL;
    }

    public static final SubLObject geq_question_object_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.getField2();
    }

    public static SubLObject geq_question_object(final SubLObject v_object) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject geq_answers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.getField3();
    }

    public static SubLObject geq_answers(final SubLObject v_object) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject geq_focus_entities_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.getField4();
    }

    public static SubLObject geq_focus_entities(final SubLObject v_object) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject geq_research_done_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.getField5();
    }

    public static SubLObject geq_research_done(final SubLObject v_object) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_geq_question_object_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_geq_question_object(final SubLObject v_object, final SubLObject value) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_geq_answers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_geq_answers(final SubLObject v_object, final SubLObject value) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_geq_focus_entities_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_geq_focus_entities(final SubLObject v_object, final SubLObject value) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_geq_research_done_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_QUESTION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_geq_research_done(final SubLObject v_object, final SubLObject value) {
        assert NIL != quirk_java_gui.gui_enabled_question_p(v_object) : "! quirk_java_gui.gui_enabled_question_p(v_object) " + "quirk_java_gui.gui_enabled_question_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_gui_enabled_question_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.quirk.quirk_java_gui.$gui_enabled_question_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($QUESTION_OBJECT)) {
                        com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_question_object(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ANSWERS)) {
                            com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_answers(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FOCUS_ENTITIES)) {
                                com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_focus_entities(v_new, current_value);
                            } else {
                                if (pcase_var.eql($RESEARCH_DONE)) {
                                    com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_research_done(v_new, current_value);
                                } else {
                                    Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_gui_enabled_question(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.quirk.quirk_java_gui.$gui_enabled_question_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($QUESTION_OBJECT)) {
                quirk_java_gui._csetf_geq_question_object(v_new, current_value);
            } else
                if (pcase_var.eql($ANSWERS)) {
                    quirk_java_gui._csetf_geq_answers(v_new, current_value);
                } else
                    if (pcase_var.eql($FOCUS_ENTITIES)) {
                        quirk_java_gui._csetf_geq_focus_entities(v_new, current_value);
                    } else
                        if (pcase_var.eql($RESEARCH_DONE)) {
                            quirk_java_gui._csetf_geq_research_done(v_new, current_value);
                        } else {
                            Errors.error(quirk_java_gui.$str22$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_gui_enabled_question(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, quirk_java_gui.MAKE_GUI_ENABLED_QUESTION, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $QUESTION_OBJECT, quirk_java_gui.geq_question_object(obj));
        funcall(visitor_fn, obj, $SLOT, $ANSWERS, quirk_java_gui.geq_answers(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCUS_ENTITIES, quirk_java_gui.geq_focus_entities(obj));
        funcall(visitor_fn, obj, $SLOT, $RESEARCH_DONE, quirk_java_gui.geq_research_done(obj));
        funcall(visitor_fn, obj, $END, quirk_java_gui.MAKE_GUI_ENABLED_QUESTION, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_gui_enabled_question_method(final SubLObject obj, final SubLObject visitor_fn) {
        return quirk_java_gui.visit_defstruct_gui_enabled_question(obj, visitor_fn);
    }

    public static final SubLObject pprint_geq_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt22$_GEQ___A_answers_, length(com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_answers(v_object)));
        return T;
    }

    public static SubLObject pprint_geq(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, quirk_java_gui.$str28$_GEQ___A_answers_, length(quirk_java_gui.geq_answers(v_object)));
        return T;
    }

    public static final SubLObject new_gui_enabled_question_alt(SubLObject question_string, SubLObject corpora) {
        if (corpora == UNPROVIDED) {
            corpora = $list_alt23;
        }
        SubLTrampolineFile.checkType(question_string, STRINGP);
        {
            SubLObject geq = com.cyc.cycjava.cycl.quirk.quirk_java_gui.make_gui_enabled_question(UNPROVIDED);
            SubLObject question_object = question.new_question(question_string, corpora, UNPROVIDED);
            if (NIL == question_object) {
                question_object = search_engine.new_lemur_query(question_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_question_object(geq, question_object);
            com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_answers(geq, methods.funcall_instance_method_with_0_args(question_object, ANSWER));
            return geq;
        }
    }

    public static SubLObject new_gui_enabled_question(final SubLObject question_string, SubLObject corpora) {
        if (corpora == UNPROVIDED) {
            corpora = quirk_java_gui.$list29;
        }
        assert NIL != stringp(question_string) : "! stringp(question_string) " + ("Types.stringp(question_string) " + "CommonSymbols.NIL != Types.stringp(question_string) ") + question_string;
        final SubLObject geq = quirk_java_gui.make_gui_enabled_question(UNPROVIDED);
        SubLObject question_object = question.new_question(question_string, corpora, UNPROVIDED);
        if (NIL == question_object) {
            question_object = search_engine.new_lemur_query(question_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        quirk_java_gui._csetf_geq_question_object(geq, question_object);
        quirk_java_gui._csetf_geq_answers(geq, funcall_instance_method_with_0_args(question_object, ANSWER));
        return geq;
    }

    public static final SubLObject get_geq_answer_by_index_alt(SubLObject geq, SubLObject idx) {
        SubLTrampolineFile.checkType(idx, INTEGERP);
        {
            SubLObject answer_obj = nth(idx, com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_answers(geq));
            SubLObject precise_answer = NIL;
            SubLObject id = NIL;
            SubLObject v_context = NIL;
            if (NIL != answer.text_answer_p(answer_obj)) {
                precise_answer = instances.get_slot(answer_obj, CONTENT);
                id = instances.get_slot(instances.get_slot(answer_obj, JUSTIFICATION), DOC_ID);
                v_context = instances.get_slot(instances.get_slot(answer_obj, JUSTIFICATION), TEXT);
            } else {
                if (NIL != search_engine.corpus_passage_p(answer_obj)) {
                    id = instances.get_slot(answer_obj, DOC_ID);
                    v_context = instances.get_slot(answer_obj, TEXT);
                }
            }
            if (!precise_answer.isString()) {
                precise_answer = $str_alt31$;
            }
            if (!id.isString()) {
                id = $str_alt31$;
            }
            if (!v_context.isString()) {
                v_context = $str_alt31$;
            }
            return list(precise_answer, id, v_context);
        }
    }

    public static SubLObject get_geq_answer_by_index(final SubLObject geq, final SubLObject idx) {
        assert NIL != integerp(idx) : "! integerp(idx) " + ("Types.integerp(idx) " + "CommonSymbols.NIL != Types.integerp(idx) ") + idx;
        final SubLObject answer_obj = nth(idx, quirk_java_gui.geq_answers(geq));
        SubLObject precise_answer = NIL;
        SubLObject id = NIL;
        SubLObject v_context = NIL;
        if (NIL != answer.text_answer_p(answer_obj)) {
            precise_answer = get_slot(answer_obj, CONTENT);
            id = get_slot(get_slot(answer_obj, JUSTIFICATION), DOC_ID);
            v_context = get_slot(get_slot(answer_obj, JUSTIFICATION), TEXT);
        } else
            if (NIL != search_engine.corpus_passage_p(answer_obj)) {
                id = get_slot(answer_obj, DOC_ID);
                v_context = get_slot(answer_obj, TEXT);
            }

        if (!precise_answer.isString()) {
            precise_answer = quirk_java_gui.$str37$;
        }
        if (!id.isString()) {
            id = quirk_java_gui.$str37$;
        }
        if (!v_context.isString()) {
            v_context = quirk_java_gui.$str37$;
        }
        return list(precise_answer, id, v_context);
    }

    public static final SubLObject identify_geq_entities_for_index_alt(SubLObject geq, SubLObject idx) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $geq_entity_store$.getDynamicValue(thread)) {
                $geq_entity_store$.setDynamicValue(make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
            }
            SubLTrampolineFile.checkType(idx, INTEGERP);
            if (NIL != com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_research_done(geq)) {
                return geq;
            }
            {
                SubLObject answer_obj = nth(idx, com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_answers(geq));
                SubLObject passage = (NIL != answer.answer_p(answer_obj)) ? ((SubLObject) (instances.get_slot(answer_obj, JUSTIFICATION))) : answer_obj;
                if (NIL != search_engine.corpus_passage_p(passage)) {
                    {
                        SubLObject entities = methods.funcall_instance_method_with_1_args(passage, IDENTIFY_ENTITIES, com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_answer_gui_lexicon());
                        SubLObject cdolist_list_var = entities;
                        SubLObject ent = NIL;
                        for (ent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ent = cdolist_list_var.first()) {
                            if (NIL != focus_entity.textual_focus_entity_p(ent)) {
                                {
                                    SubLObject name = methods.funcall_instance_method_with_0_args(ent, NAME);
                                    SubLObject stored_entity = gethash(name, $geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
                                    if (NIL != focus_entity.textual_focus_entity_p(stored_entity)) {
                                        methods.funcall_instance_method_with_1_args(stored_entity, ADD_PASSAGE, passage);
                                        sethash(name, $geq_entity_store$.getDynamicValue(thread), stored_entity);
                                    } else {
                                        sethash(name, $geq_entity_store$.getDynamicValue(thread), ent);
                                    }
                                    {
                                        SubLObject item_var = name;
                                        if (NIL == member(item_var, com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_focus_entities(geq), EQUALP, symbol_function(IDENTITY))) {
                                            com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_focus_entities(geq, cons(item_var, com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_focus_entities(geq)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return geq;
        }
    }

    public static SubLObject identify_geq_entities_for_index(final SubLObject geq, final SubLObject idx) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == quirk_java_gui.$geq_entity_store$.getDynamicValue(thread)) {
            quirk_java_gui.$geq_entity_store$.setDynamicValue(make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
        }
        assert NIL != integerp(idx) : "! integerp(idx) " + ("Types.integerp(idx) " + "CommonSymbols.NIL != Types.integerp(idx) ") + idx;
        if (NIL != quirk_java_gui.geq_research_done(geq)) {
            return geq;
        }
        final SubLObject answer_obj = nth(idx, quirk_java_gui.geq_answers(geq));
        final SubLObject passage = (NIL != answer.answer_p(answer_obj)) ? get_slot(answer_obj, JUSTIFICATION) : answer_obj;
        if (NIL != search_engine.corpus_passage_p(passage)) {
            SubLObject cdolist_list_var;
            final SubLObject entities = cdolist_list_var = funcall_instance_method_with_1_args(passage, quirk_java_gui.IDENTIFY_ENTITIES, quirk_java_gui.get_answer_gui_lexicon());
            SubLObject ent = NIL;
            ent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != focus_entity.textual_focus_entity_p(ent)) {
                    final SubLObject name = funcall_instance_method_with_0_args(ent, NAME);
                    final SubLObject stored_entity = gethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
                    if (NIL != focus_entity.textual_focus_entity_p(stored_entity)) {
                        funcall_instance_method_with_1_args(stored_entity, quirk_java_gui.ADD_PASSAGE, passage);
                        sethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), stored_entity);
                    } else {
                        sethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), ent);
                    }
                    final SubLObject item_var = name;
                    if (NIL == member(item_var, quirk_java_gui.geq_focus_entities(geq), EQUALP, symbol_function(IDENTITY))) {
                        quirk_java_gui._csetf_geq_focus_entities(geq, cons(item_var, quirk_java_gui.geq_focus_entities(geq)));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ent = cdolist_list_var.first();
            } 
        }
        return geq;
    }

    public static final SubLObject answer_gui_question_int_alt(SubLObject question_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $geq_store$.getDynamicValue(thread)) {
                $geq_store$.setDynamicValue(make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
            }
            {
                SubLObject stored_geq = gethash(question_string, $geq_store$.getDynamicValue(thread), UNPROVIDED);
                SubLObject geq = (NIL != stored_geq) ? ((SubLObject) (stored_geq)) : com.cyc.cycjava.cycl.quirk.quirk_java_gui.new_gui_enabled_question(question_string, UNPROVIDED);
                SubLObject length = length(com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_answers(geq));
                SubLObject answer_triples = NIL;
                if (NIL == stored_geq) {
                    sethash(question_string, $geq_store$.getDynamicValue(thread), geq);
                }
                if (ZERO_INTEGER.numE(length)) {
                    return list(com.cyc.cycjava.cycl.quirk.quirk_java_gui.generate_quirk_gui_empty_answer());
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                        answer_triples = cons(com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_geq_answer_by_index(geq, i), answer_triples);
                    }
                }
                return nreverse(answer_triples);
            }
        }
    }

    public static SubLObject answer_gui_question_int(final SubLObject question_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == quirk_java_gui.$geq_store$.getDynamicValue(thread)) {
            quirk_java_gui.$geq_store$.setDynamicValue(make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED), thread);
        }
        final SubLObject stored_geq = gethash(question_string, quirk_java_gui.$geq_store$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject geq = (NIL != stored_geq) ? stored_geq : quirk_java_gui.new_gui_enabled_question(question_string, UNPROVIDED);
        final SubLObject length = length(quirk_java_gui.geq_answers(geq));
        SubLObject answer_triples = NIL;
        if (NIL == stored_geq) {
            sethash(question_string, quirk_java_gui.$geq_store$.getDynamicValue(thread), geq);
        }
        if (ZERO_INTEGER.numE(length)) {
            return list(quirk_java_gui.generate_quirk_gui_empty_answer());
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            answer_triples = cons(quirk_java_gui.get_geq_answer_by_index(geq, i), answer_triples);
        }
        return nreverse(answer_triples);
    }

    public static final SubLObject generate_quirk_gui_empty_answer_alt() {
        return list($str_alt31$, $str_alt31$, $str_alt31$);
    }

    public static SubLObject generate_quirk_gui_empty_answer() {
        return list(quirk_java_gui.$str37$, quirk_java_gui.$str37$, quirk_java_gui.$str37$);
    }

    public static final SubLObject get_geq_entity_graph_root_description_alt(SubLObject geq_string, SubLObject rebuild) {
        if (rebuild == UNPROVIDED) {
            rebuild = NIL;
        }
        {
            SubLObject root_node = com.cyc.cycjava.cycl.quirk.quirk_java_gui.build_geq_entity_graph(geq_string, rebuild);
            SubLObject node_label = methods.funcall_instance_method_with_0_args(root_node, GET_LABEL);
            SubLObject type = (NIL != methods.funcall_instance_method_with_0_args(root_node, GET_CORE)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(root_node, GET_CORE))) : $$Thing;
            SubLObject node_id = methods.funcall_instance_method_with_0_args(root_node, GET_ID);
            return list(node_label, type, node_id);
        }
    }

    public static SubLObject get_geq_entity_graph_root_description(final SubLObject geq_string, SubLObject rebuild) {
        if (rebuild == UNPROVIDED) {
            rebuild = NIL;
        }
        final SubLObject root_node = quirk_java_gui.build_geq_entity_graph(geq_string, rebuild);
        final SubLObject node_label = funcall_instance_method_with_0_args(root_node, quirk_java_gui.GET_LABEL);
        final SubLObject type = (NIL != funcall_instance_method_with_0_args(root_node, quirk_java_gui.GET_CORE)) ? funcall_instance_method_with_0_args(root_node, quirk_java_gui.GET_CORE) : quirk_java_gui.$$Thing;
        final SubLObject node_id = funcall_instance_method_with_0_args(root_node, GET_ID);
        return list(node_label, type, node_id);
    }

    public static final SubLObject build_geq_entity_graph_alt(SubLObject geq_string, SubLObject rebuild) {
        if (rebuild == UNPROVIDED) {
            rebuild = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_graph_from_registry(geq_string)) {
            if (NIL == rebuild) {
                return com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_root_node_from_registry(geq_string);
            }
        }
        {
            SubLObject v_graph = graph.new_cyc_graph(geq_string);
            SubLObject entity_triples = quirk_trampolines.identify_all_geq_entities(geq_string);
            SubLObject root_node = object.new_class_instance(CYC_GRAPH_NODE);
            methods.funcall_instance_method_with_1_args(root_node, SET_CORE, $$Thing);
            methods.funcall_instance_method_with_1_args(root_node, SET_LABEL, geq_string);
            methods.funcall_instance_method_with_1_args(v_graph, INTERPOLATE_NODE, root_node);
            {
                SubLObject cdolist_list_var = entity_triples;
                SubLObject triple = NIL;
                for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                    {
                        SubLObject datum = triple;
                        SubLObject current = datum;
                        SubLObject entity_name = NIL;
                        SubLObject type = NIL;
                        SubLObject type_name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt43);
                        entity_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt43);
                        type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt43);
                        type_name = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            methods.funcall_instance_method_with_1_args(v_graph, INTERPOLATE_CYC_TERM, type);
                            {
                                SubLObject entity_nodes = com.cyc.cycjava.cycl.quirk.quirk_java_gui.create_smart_cyc_graph_nodes_from_type_name(type, entity_name);
                                SubLObject cdolist_list_var_1 = entity_nodes;
                                SubLObject node = NIL;
                                for (node = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , node = cdolist_list_var_1.first()) {
                                    methods.funcall_instance_method_with_2_args(v_graph, INTERPOLATE_NODE, node, $$isa);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt43);
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.quirk.quirk_java_gui.register_graph(v_graph, root_node);
            return root_node;
        }
    }

    public static SubLObject build_geq_entity_graph(final SubLObject geq_string, SubLObject rebuild) {
        if (rebuild == UNPROVIDED) {
            rebuild = NIL;
        }
        if ((NIL != quirk_java_gui.get_graph_from_registry(geq_string)) && (NIL == rebuild)) {
            return quirk_java_gui.get_root_node_from_registry(geq_string);
        }
        final SubLObject v_graph = graph.new_cyc_graph(geq_string);
        final SubLObject entity_triples = quirk_trampolines.identify_all_geq_entities(geq_string);
        final SubLObject root_node = new_class_instance(quirk_java_gui.CYC_GRAPH_NODE);
        funcall_instance_method_with_1_args(root_node, quirk_java_gui.SET_CORE, quirk_java_gui.$$Thing);
        funcall_instance_method_with_1_args(root_node, quirk_java_gui.SET_LABEL, geq_string);
        funcall_instance_method_with_1_args(v_graph, quirk_java_gui.INTERPOLATE_NODE, root_node);
        SubLObject cdolist_list_var = entity_triples;
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = triple;
            SubLObject entity_name = NIL;
            SubLObject type = NIL;
            SubLObject type_name = NIL;
            destructuring_bind_must_consp(current, datum, quirk_java_gui.$list49);
            entity_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, quirk_java_gui.$list49);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, quirk_java_gui.$list49);
            type_name = current.first();
            current = current.rest();
            if (NIL == current) {
                funcall_instance_method_with_1_args(v_graph, quirk_java_gui.INTERPOLATE_CYC_TERM, type);
                SubLObject cdolist_list_var_$1;
                final SubLObject entity_nodes = cdolist_list_var_$1 = quirk_java_gui.create_smart_cyc_graph_nodes_from_type_name(type, entity_name);
                SubLObject node = NIL;
                node = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    funcall_instance_method_with_2_args(v_graph, quirk_java_gui.INTERPOLATE_NODE, node, quirk_java_gui.$$isa);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    node = cdolist_list_var_$1.first();
                } 
            } else {
                cdestructuring_bind_error(datum, quirk_java_gui.$list49);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        quirk_java_gui.register_graph(v_graph, root_node);
        return root_node;
    }

    public static final SubLObject create_smart_cyc_graph_nodes_from_type_name_alt(SubLObject term_type, SubLObject term_name) {
        {
            SubLObject lexes = methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_answer_gui_lexicon(), GET, term_name);
            SubLObject v_forts = NIL;
            SubLObject cyc_nodes = NIL;
            {
                SubLObject cdolist_list_var = lexes;
                SubLObject lex = NIL;
                for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                    if (NIL != abstract_lexicon.lex_entry_p(lex)) {
                        if (NIL != intersection(methods.funcall_instance_method_with_1_args(lex, GET, $INFLECTIONS), $list_alt48, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
                                SubLObject fort = ($$equals.eql(semtrans.first())) ? ((SubLObject) (third(semtrans))) : NIL;
                                if ((NIL != forts.fort_p(fort)) && (NIL != isa.isa_in_any_mtP(fort, term_type))) {
                                    {
                                        SubLObject item_var = fort;
                                        if (NIL == member(item_var, v_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            v_forts = cons(item_var, v_forts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = v_forts;
                SubLObject fort = NIL;
                for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                    {
                        SubLObject other_name = pph_main.generate_phrase(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject full_name = (term_name.equalp(other_name)) ? ((SubLObject) (term_name)) : cconcatenate(term_name, new SubLObject[]{ $str_alt51$__, other_name });
                        SubLObject node = object.new_class_instance(CYC_GRAPH_NODE);
                        methods.funcall_instance_method_with_1_args(node, SET_CORE, fort);
                        methods.funcall_instance_method_with_1_args(node, SET_LABEL, full_name);
                        cyc_nodes = cons(node, cyc_nodes);
                    }
                }
            }
            if (NIL == cyc_nodes) {
                {
                    SubLObject node = object.new_class_instance(CYC_GRAPH_NODE);
                    methods.funcall_instance_method_with_1_args(node, SET_CORE, list($$InstanceNamedFn, term_name, term_type));
                    methods.funcall_instance_method_with_1_args(node, SET_LABEL, term_name);
                    cyc_nodes = cons(node, cyc_nodes);
                }
            }
            return cyc_nodes;
        }
    }

    public static SubLObject create_smart_cyc_graph_nodes_from_type_name(final SubLObject term_type, final SubLObject term_name) {
        final SubLObject lexes = funcall_instance_method_with_1_args(quirk_java_gui.get_answer_gui_lexicon(), GET, term_name);
        SubLObject v_forts = NIL;
        SubLObject cyc_nodes = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != lex_entry_p(lex)) && (NIL != intersection(funcall_instance_method_with_1_args(lex, GET, $INFLECTIONS), quirk_java_gui.$list54, UNPROVIDED, UNPROVIDED))) {
                final SubLObject semtrans = funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
                final SubLObject fort = (quirk_java_gui.$$equals.eql(semtrans.first())) ? third(semtrans) : NIL;
                if ((NIL != fort_p(fort)) && (NIL != isa_in_any_mtP(fort, term_type))) {
                    final SubLObject item_var = fort;
                    if (NIL == member(item_var, v_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                        v_forts = cons(item_var, v_forts);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        cdolist_list_var = v_forts;
        SubLObject fort2 = NIL;
        fort2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject other_name = generate_phrase(fort2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject full_name = (term_name.equalp(other_name)) ? term_name : cconcatenate(term_name, new SubLObject[]{ quirk_java_gui.$str57$__, other_name });
            final SubLObject node = new_class_instance(quirk_java_gui.CYC_GRAPH_NODE);
            funcall_instance_method_with_1_args(node, quirk_java_gui.SET_CORE, fort2);
            funcall_instance_method_with_1_args(node, quirk_java_gui.SET_LABEL, full_name);
            cyc_nodes = cons(node, cyc_nodes);
            cdolist_list_var = cdolist_list_var.rest();
            fort2 = cdolist_list_var.first();
        } 
        if (NIL == cyc_nodes) {
            final SubLObject node2 = new_class_instance(quirk_java_gui.CYC_GRAPH_NODE);
            funcall_instance_method_with_1_args(node2, quirk_java_gui.SET_CORE, list(quirk_java_gui.$$InstanceNamedFn, term_name, term_type));
            funcall_instance_method_with_1_args(node2, quirk_java_gui.SET_LABEL, term_name);
            cyc_nodes = cons(node2, cyc_nodes);
        }
        return cyc_nodes;
    }

    public static final SubLObject get_geq_entity_child_node_descriptions_alt(SubLObject node_id_string, SubLObject root_label) {
        {
            SubLObject v_graph = com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_graph_from_registry(root_label);
            SubLObject node_id = read_from_string_ignoring_errors(node_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject node = methods.funcall_instance_method_with_1_args(v_graph, GET_NODE_BY_ID, node_id);
            SubLObject children = methods.funcall_instance_method_with_1_args(v_graph, GET_NODES_FROM_NODE, node);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = children;
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.quirk.quirk_java_gui.make_node_description(child), result);
            }
            return result;
        }
    }

    public static SubLObject get_geq_entity_child_node_descriptions(final SubLObject node_id_string, final SubLObject root_label) {
        final SubLObject v_graph = quirk_java_gui.get_graph_from_registry(root_label);
        final SubLObject node_id = read_from_string_ignoring_errors(node_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject node = funcall_instance_method_with_1_args(v_graph, quirk_java_gui.GET_NODE_BY_ID, node_id);
        final SubLObject children = funcall_instance_method_with_1_args(v_graph, quirk_java_gui.GET_NODES_FROM_NODE, node);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(quirk_java_gui.make_node_description(child), result);
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject make_node_description_alt(SubLObject node) {
        {
            SubLObject node_label = methods.funcall_instance_method_with_0_args(node, GET_LABEL);
            SubLObject type = (NIL != methods.funcall_instance_method_with_0_args(node, GET_CORE)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(node, GET_CORE))) : $$Thing;
            SubLObject node_id = methods.funcall_instance_method_with_0_args(node, GET_ID);
            return list(node_label, type, node_id);
        }
    }

    public static SubLObject make_node_description(final SubLObject node) {
        final SubLObject node_label = funcall_instance_method_with_0_args(node, quirk_java_gui.GET_LABEL);
        final SubLObject type = (NIL != funcall_instance_method_with_0_args(node, quirk_java_gui.GET_CORE)) ? funcall_instance_method_with_0_args(node, quirk_java_gui.GET_CORE) : quirk_java_gui.$$Thing;
        final SubLObject node_id = funcall_instance_method_with_0_args(node, GET_ID);
        return list(node_label, type, node_id);
    }

    /**
     *
     *
     * @return listp; a list of triples of the following form (entity-string type-CycL type-string)
    The list will contain triple categorizing each of the entities into every type that is
    appropriate. The list of types for any given geq-string is the union of the min-isas of each
    of the identified entities.
     */
    @LispMethod(comment = "@return listp; a list of triples of the following form (entity-string type-CycL type-string)\r\nThe list will contain triple categorizing each of the entities into every type that is\r\nappropriate. The list of types for any given geq-string is the union of the min-isas of each\r\nof the identified entities.")
    public static final SubLObject identify_all_geq_entities_int_alt(SubLObject geq_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(geq_string, STRINGP);
            {
                SubLObject geq = gethash(geq_string, $geq_store$.getDynamicValue(thread), UNPROVIDED);
                SubLObject length = (NIL != geq) ? ((SubLObject) (length(com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_answers(geq)))) : ZERO_INTEGER;
                SubLObject entity_triples = NIL;
                if (ZERO_INTEGER.numE(length)) {
                    Errors.warn($str_alt55$no_answers__geq___S__, geq);
                    return NIL;
                }
                if (NIL == com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_research_done(geq)) {
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                            com.cyc.cycjava.cycl.quirk.quirk_java_gui.identify_geq_entities_for_index(geq, i);
                        }
                    }
                    com.cyc.cycjava.cycl.quirk.quirk_java_gui._csetf_geq_research_done(geq, T);
                }
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.quirk.quirk_java_gui.geq_focus_entities(geq);
                    SubLObject name = NIL;
                    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                        {
                            SubLObject min_types = methods.funcall_instance_method_with_0_args(gethash(name, $geq_entity_store$.getDynamicValue(thread), UNPROVIDED), ALL_TYPES);
                            SubLObject cdolist_list_var_2 = min_types;
                            SubLObject type = NIL;
                            for (type = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , type = cdolist_list_var_2.first()) {
                                {
                                    SubLObject type_name = pph_main.generate_phrase(type, $ANY, NIL, $$EnglishParaphraseMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject triple = list(name, type, type_name);
                                    entity_triples = cons(triple, entity_triples);
                                }
                            }
                        }
                    }
                }
                return entity_triples;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of triples of the following form (entity-string type-CycL type-string)
    The list will contain triple categorizing each of the entities into every type that is
    appropriate. The list of types for any given geq-string is the union of the min-isas of each
    of the identified entities.
     */
    @LispMethod(comment = "@return listp; a list of triples of the following form (entity-string type-CycL type-string)\r\nThe list will contain triple categorizing each of the entities into every type that is\r\nappropriate. The list of types for any given geq-string is the union of the min-isas of each\r\nof the identified entities.")
    public static SubLObject identify_all_geq_entities_int(final SubLObject geq_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(geq_string) : "! stringp(geq_string) " + ("Types.stringp(geq_string) " + "CommonSymbols.NIL != Types.stringp(geq_string) ") + geq_string;
        final SubLObject geq = gethash(geq_string, quirk_java_gui.$geq_store$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject length = (NIL != geq) ? length(quirk_java_gui.geq_answers(geq)) : ZERO_INTEGER;
        SubLObject entity_triples = NIL;
        if (ZERO_INTEGER.numE(length)) {
            Errors.warn(quirk_java_gui.$str61$no_answers__geq___S__, geq);
            return NIL;
        }
        if (NIL == quirk_java_gui.geq_research_done(geq)) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                quirk_java_gui.identify_geq_entities_for_index(geq, i);
            }
            quirk_java_gui._csetf_geq_research_done(geq, T);
        }
        SubLObject cdolist_list_var = quirk_java_gui.geq_focus_entities(geq);
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject min_types = cdolist_list_var_$2 = funcall_instance_method_with_0_args(gethash(name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), UNPROVIDED), ALL_TYPES);
            SubLObject type = NIL;
            type = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject type_name = generate_phrase(type, $ANY, NIL, quirk_java_gui.$$EnglishParaphraseMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject triple = list(name, type, type_name);
                entity_triples = cons(triple, entity_triples);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                type = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return entity_triples;
    }

    public static final SubLObject research_entity_alt(SubLObject entity_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(entity_name, STRINGP);
            {
                SubLObject entity = gethash(entity_name, $geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
                SubLObject summary = NIL;
                if (NIL != focus_entity.textual_focus_entity_p(entity)) {
                    methods.funcall_instance_method_with_1_args(entity, LEARN_TYPES_FROM_CORPORA, $list_alt23);
                }
                summary = methods.funcall_instance_method_with_0_args(entity, RENDER);
                return summary;
            }
        }
    }

    public static SubLObject research_entity(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(entity_name) : "! stringp(entity_name) " + ("Types.stringp(entity_name) " + "CommonSymbols.NIL != Types.stringp(entity_name) ") + entity_name;
        final SubLObject entity = gethash(entity_name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
        SubLObject summary = NIL;
        if (NIL != focus_entity.textual_focus_entity_p(entity)) {
            funcall_instance_method_with_1_args(entity, quirk_java_gui.LEARN_TYPES_FROM_CORPORA, quirk_java_gui.$list29);
        }
        summary = funcall_instance_method_with_0_args(entity, quirk_java_gui.RENDER);
        return summary;
    }

    public static final SubLObject get_followups_for_entity_int_alt(SubLObject entity_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(entity_name, STRINGP);
            {
                SubLObject entity = gethash(entity_name, $geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != focus_entity.textual_focus_entity_p(entity)) {
                    if (NIL == instances.get_slot(entity, INFERENCE_POOL_CREATED)) {
                        methods.funcall_instance_method_with_0_args(entity, GENERATE_SALIENT_QUERIES);
                    }
                    {
                        SubLObject queries = methods.funcall_instance_method_with_1_args(entity, GET_SALIENT_QUERIES, $ALL);
                        SubLObject types = methods.funcall_instance_method_with_0_args(entity, ALL_TYPES);
                        SubLObject name = methods.funcall_instance_method_with_0_args(entity, NAME);
                        SubLObject query_strings = NIL;
                        SubLObject v_wh_question = NIL;
                        SubLObject cdolist_list_var = queries;
                        SubLObject q = NIL;
                        for (q = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , q = cdolist_list_var.first()) {
                            if (NIL != search_engine.cycl_query_p(q)) {
                                {
                                    SubLObject cycl = instances.get_slot(q, QUERY);
                                    SubLObject qstring = com.cyc.cycjava.cycl.quirk.quirk_java_gui.compute_reasonable_quirk_followup_question(cycl);
                                    if (!qstring.equal(string_utilities.$empty_string$.getGlobalValue())) {
                                        query_strings = cons(qstring, query_strings);
                                    }
                                }
                            }
                        }
                        if (NIL == v_wh_question) {
                            {
                                SubLObject csome_list_var = types;
                                SubLObject type = NIL;
                                for (type = csome_list_var.first(); !((NIL != v_wh_question) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
                                    if (NIL != at_utilities.more_specific_p(type, $$Person, UNPROVIDED)) {
                                        v_wh_question = cconcatenate($str_alt67$Who_is_, new SubLObject[]{ name, $str_alt68$_ });
                                    } else {
                                        if (NIL != at_utilities.more_specific_p(type, $$Organization, UNPROVIDED)) {
                                            v_wh_question = cconcatenate($str_alt70$What_is_, new SubLObject[]{ name, $str_alt68$_ });
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != v_wh_question) {
                            query_strings = cons(v_wh_question, query_strings);
                        }
                        return query_strings;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject get_followups_for_entity_int(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(entity_name) : "! stringp(entity_name) " + ("Types.stringp(entity_name) " + "CommonSymbols.NIL != Types.stringp(entity_name) ") + entity_name;
        final SubLObject entity = gethash(entity_name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != focus_entity.textual_focus_entity_p(entity)) {
            if (NIL == get_slot(entity, quirk_java_gui.INFERENCE_POOL_CREATED)) {
                funcall_instance_method_with_0_args(entity, quirk_java_gui.GENERATE_SALIENT_QUERIES);
            }
            final SubLObject queries = funcall_instance_method_with_1_args(entity, quirk_java_gui.GET_SALIENT_QUERIES, $ALL);
            final SubLObject types = funcall_instance_method_with_0_args(entity, ALL_TYPES);
            final SubLObject name = funcall_instance_method_with_0_args(entity, NAME);
            SubLObject query_strings = NIL;
            SubLObject v_wh_question = NIL;
            SubLObject cdolist_list_var = queries;
            SubLObject q = NIL;
            q = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != search_engine.cycl_query_p(q)) {
                    final SubLObject cycl = get_slot(q, QUERY);
                    final SubLObject qstring = quirk_java_gui.compute_reasonable_quirk_followup_question(cycl);
                    if (!qstring.equal($empty_string$.getGlobalValue())) {
                        query_strings = cons(qstring, query_strings);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                q = cdolist_list_var.first();
            } 
            if (NIL == v_wh_question) {
                SubLObject csome_list_var = types;
                SubLObject type = NIL;
                type = csome_list_var.first();
                while ((NIL == v_wh_question) && (NIL != csome_list_var)) {
                    if (NIL != more_specific_p(type, quirk_java_gui.$$Person, UNPROVIDED)) {
                        v_wh_question = cconcatenate(quirk_java_gui.$$$Who_is_, new SubLObject[]{ name, quirk_java_gui.$str74$_ });
                    } else
                        if (NIL != more_specific_p(type, quirk_java_gui.$$Organization, UNPROVIDED)) {
                            v_wh_question = cconcatenate(quirk_java_gui.$$$What_is_, new SubLObject[]{ name, quirk_java_gui.$str74$_ });
                        }

                    csome_list_var = csome_list_var.rest();
                    type = csome_list_var.first();
                } 
            }
            if (NIL != v_wh_question) {
                query_strings = cons(v_wh_question, query_strings);
            }
            return query_strings;
        }
        return NIL;
    }

    public static final SubLObject compute_reasonable_quirk_followup_question_alt(SubLObject cycl_expression) {
        {
            SubLObject terms = list_utilities.flatten(cycl_expression);
            SubLObject cyc_internal_terms = $list_alt71;
            SubLObject question_string = string_utilities.$empty_string$.getGlobalValue();
            if (NIL != intersection(terms, cyc_internal_terms, UNPROVIDED, UNPROVIDED)) {
                return question_string;
            }
            {
                SubLObject generated_question_string = pph_question.generate_question(cycl_expression, $$EnglishParaphraseMt, $$EverythingPSC, UNPROVIDED, UNPROVIDED);
                SubLObject length = length(string_utilities.string_tokenize(question_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if ($int$30.numG(length)) {
                    question_string = generated_question_string;
                }
            }
            return question_string;
        }
    }

    public static SubLObject compute_reasonable_quirk_followup_question(final SubLObject cycl_expression) {
        final SubLObject terms = flatten(cycl_expression);
        final SubLObject cyc_internal_terms = quirk_java_gui.$list77;
        SubLObject question_string = $empty_string$.getGlobalValue();
        if (NIL != intersection(terms, cyc_internal_terms, UNPROVIDED, UNPROVIDED)) {
            return question_string;
        }
        final SubLObject generated_question_string = generate_question(cycl_expression, quirk_java_gui.$$EnglishParaphraseMt, quirk_java_gui.$$EverythingPSC, UNPROVIDED, UNPROVIDED);
        final SubLObject length = length(string_tokenize(question_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (quirk_java_gui.$int$30.numG(length)) {
            question_string = generated_question_string;
        }
        return question_string;
    }

    /**
     *
     *
     * @param ENTITY-NAME,
     * 		stringp. The name of a named entity.
     * @return listp; a list of passages relevant to that entity
    and represented as (SOURCE CONTENT) pairs.
     */
    @LispMethod(comment = "@param ENTITY-NAME,\r\n\t\tstringp. The name of a named entity.\r\n@return listp; a list of passages relevant to that entity\r\nand represented as (SOURCE CONTENT) pairs.")
    public static final SubLObject get_passages_for_entity_int_alt(SubLObject entity_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(entity_name, STRINGP);
            {
                SubLObject entity = gethash(entity_name, $geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == focus_entity.textual_focus_entity_p(entity)) {
                    return NIL;
                }
                {
                    SubLObject ent_passages = instances.get_slot(entity, PASSAGES);
                    SubLObject listified_passages = NIL;
                    SubLObject cdolist_list_var = ent_passages;
                    SubLObject ent_p = NIL;
                    for (ent_p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ent_p = cdolist_list_var.first()) {
                        if (NIL != search_engine.corpus_passage_p(ent_p)) {
                            {
                                SubLObject id = instances.get_slot(ent_p, DOC_ID);
                                SubLObject content = methods.funcall_instance_method_with_0_args(ent_p, GET_CONTENT);
                                if (NIL == id) {
                                    id = $str_alt31$;
                                }
                                if (NIL == content) {
                                    content = $str_alt31$;
                                }
                                listified_passages = cons(list(id, content), listified_passages);
                            }
                        }
                    }
                    return listified_passages;
                }
            }
        }
    }

    /**
     *
     *
     * @param ENTITY-NAME,
     * 		stringp. The name of a named entity.
     * @return listp; a list of passages relevant to that entity
    and represented as (SOURCE CONTENT) pairs.
     */
    @LispMethod(comment = "@param ENTITY-NAME,\r\n\t\tstringp. The name of a named entity.\r\n@return listp; a list of passages relevant to that entity\r\nand represented as (SOURCE CONTENT) pairs.")
    public static SubLObject get_passages_for_entity_int(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(entity_name) : "! stringp(entity_name) " + ("Types.stringp(entity_name) " + "CommonSymbols.NIL != Types.stringp(entity_name) ") + entity_name;
        final SubLObject entity = gethash(entity_name, quirk_java_gui.$geq_entity_store$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == focus_entity.textual_focus_entity_p(entity)) {
            return NIL;
        }
        final SubLObject ent_passages = get_slot(entity, PASSAGES);
        SubLObject listified_passages = NIL;
        SubLObject cdolist_list_var = ent_passages;
        SubLObject ent_p = NIL;
        ent_p = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != search_engine.corpus_passage_p(ent_p)) {
                SubLObject id = get_slot(ent_p, DOC_ID);
                SubLObject content = funcall_instance_method_with_0_args(ent_p, GET_CONTENT);
                if (NIL == id) {
                    id = quirk_java_gui.$str37$;
                }
                if (NIL == content) {
                    content = quirk_java_gui.$str37$;
                }
                listified_passages = cons(list(id, content), listified_passages);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ent_p = cdolist_list_var.first();
        } 
        return listified_passages;
    }

    /**
     *
     *
     * @param PASSAGE-DOC-ID,
     * 		stringp; a truncated path to a CNS document.
     * @return stringp; the content of that document as a string.
    This should really be re-implemented as a server.
     */
    @LispMethod(comment = "@param PASSAGE-DOC-ID,\r\n\t\tstringp; a truncated path to a CNS document.\r\n@return stringp; the content of that document as a string.\r\nThis should really be re-implemented as a server.")
    public static final SubLObject return_document_as_string_int_alt(SubLObject passage_doc_id) {
        SubLTrampolineFile.checkType(passage_doc_id, STRINGP);
        {
            SubLObject doc_path = com.cyc.cycjava.cycl.quirk.quirk_java_gui.compute_full_cns_path(passage_doc_id);
            SubLObject error_message = format(NIL, $str_alt76$__Could_not_open_file__A, passage_doc_id);
            SubLObject result = $str_alt31$;
            SubLObject file_length = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(doc_path, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt79$Unable_to_open__S, doc_path);
                                    }
                                    {
                                        SubLObject in = stream;
                                        format(T, $str_alt80$___S, file_length(in));
                                        file_length = file_length(in);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_3 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_3);
                                        }
                                    }
                                }
                            }
                            if (file_length.numG($int$10000000)) {
                                result = format(NIL, $str_alt82$__File__A_is_too_big_for_me_to_di, passage_doc_id, file_length);
                            } else {
                                {
                                    SubLObject lines = file_utilities.read_text_file(doc_path);
                                    if (lines.isCons()) {
                                        {
                                            SubLObject cdolist_list_var = lines;
                                            SubLObject line = NIL;
                                            for (line = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , line = cdolist_list_var.first()) {
                                                result = cconcatenate(result, new SubLObject[]{ string_utilities.$new_line_string$.getGlobalValue(), line });
                                            }
                                        }
                                    } else {
                                        result = error_message;
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                result = error_message;
            }
            return result;
        }
    }

    /**
     *
     *
     * @param PASSAGE-DOC-ID,
     * 		stringp; a truncated path to a CNS document.
     * @return stringp; the content of that document as a string.
    This should really be re-implemented as a server.
     */
    @LispMethod(comment = "@param PASSAGE-DOC-ID,\r\n\t\tstringp; a truncated path to a CNS document.\r\n@return stringp; the content of that document as a string.\r\nThis should really be re-implemented as a server.")
    public static SubLObject return_document_as_string_int(final SubLObject passage_doc_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(passage_doc_id) : "! stringp(passage_doc_id) " + ("Types.stringp(passage_doc_id) " + "CommonSymbols.NIL != Types.stringp(passage_doc_id) ") + passage_doc_id;
        final SubLObject doc_path = quirk_java_gui.compute_full_cns_path(passage_doc_id);
        final SubLObject error_message = format(NIL, quirk_java_gui.$str82$__Could_not_open_file__A, passage_doc_id);
        SubLObject result = quirk_java_gui.$str37$;
        SubLObject file_length = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(doc_path, $INPUT);
                        if (!stream.isStream()) {
                            Errors.error(quirk_java_gui.$str85$Unable_to_open__S, doc_path);
                        }
                        final SubLObject in = stream;
                        format(T, quirk_java_gui.$str86$___S, file_length(in));
                        file_length = file_length(in);
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    if (file_length.numG(quirk_java_gui.$int$10000000)) {
                        result = format(NIL, quirk_java_gui.$str88$__File__A_is_too_big_for_me_to_di, passage_doc_id, file_length);
                    } else {
                        final SubLObject lines = read_text_file(doc_path);
                        if (lines.isCons()) {
                            SubLObject cdolist_list_var = lines;
                            SubLObject line = NIL;
                            line = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                result = cconcatenate(result, new SubLObject[]{ $new_line_string$.getGlobalValue(), line });
                                cdolist_list_var = cdolist_list_var.rest();
                                line = cdolist_list_var.first();
                            } 
                        } else {
                            result = error_message;
                        }
                    }
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
            result = error_message;
        }
        return result;
    }

    public static final SubLObject compute_full_cns_path_alt(SubLObject passage_doc_id) {
        {
            SubLObject cns_base = $str_alt83$_home_elmore0_scratch_quirk_corpo;
            SubLObject index = ZERO_INTEGER;
            SubLObject len = length(passage_doc_id);
            SubLObject finished = numE(index, len);
            SubLObject suffix = NIL;
            while (NIL == finished) {
                {
                    SubLObject v_char = string_utilities.char_from_end(passage_doc_id, index);
                    finished = eql(CHAR_period, v_char);
                    index = add(index, ONE_INTEGER);
                }
            } 
            suffix = string_utilities.string_last_n(index, passage_doc_id);
            return cconcatenate(cns_base, new SubLObject[]{ string_utilities.post_remove(passage_doc_id, suffix, UNPROVIDED), $str_alt84$_trec });
        }
    }

    public static SubLObject compute_full_cns_path(final SubLObject passage_doc_id) {
        final SubLObject cns_base = quirk_java_gui.$str89$_home_elmore0_scratch_quirk_corpo;
        SubLObject index = ZERO_INTEGER;
        final SubLObject len = length(passage_doc_id);
        SubLObject finished = numE(index, len);
        SubLObject suffix = NIL;
        while (NIL == finished) {
            final SubLObject v_char = char_from_end(passage_doc_id, index);
            finished = eql(CHAR_period, v_char);
            index = add(index, ONE_INTEGER);
        } 
        suffix = string_last_n(index, passage_doc_id);
        return cconcatenate(cns_base, new SubLObject[]{ post_remove(passage_doc_id, suffix, UNPROVIDED), quirk_java_gui.$str90$_trec });
    }

    /**
     *
     *
     * @param ENTITY-NAME,
     * 		stringp; the name of an entity of interest;
     * @return listp; a list of triples of the form (FOLLOWUP-STRING
    FOLLOWUP-TYPE TYPE-STRING)
     */
    @LispMethod(comment = "@param ENTITY-NAME,\r\n\t\tstringp; the name of an entity of interest;\r\n@return listp; a list of triples of the form (FOLLOWUP-STRING\r\nFOLLOWUP-TYPE TYPE-STRING)")
    public static final SubLObject topics_related_to_entity_int_alt(SubLObject entity_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(entity_name, STRINGP);
            {
                SubLObject variable = $sym85$_TERM;
                SubLObject search_term = string_utilities.quote_string(entity_name, UNPROVIDED);
                SubLObject query = list($$wordIndexesCycTerm, search_term, variable);
                SubLObject topics = backward.removal_ask_variable(variable, query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject topic_triples = NIL;
                SubLObject cdolist_list_var = topics;
                SubLObject topic = NIL;
                for (topic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topic = cdolist_list_var.first()) {
                    if (NIL != kb_accessors.individualP(topic)) {
                        if (!(((NIL != isa.isa_in_any_mtP(topic, $$KBContentTest_FullySpecified)) || (NIL != isa.isa_in_any_mtP(topic, $$CycLQuerySpecification))) || (NIL != isa.isa_in_any_mtP(topic, $$UnitOfMeasure)))) {
                            {
                                SubLObject topic_name = pph_main.generate_phrase(topic, $ANY, NIL, $$EnglishParaphraseMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject topic_types = NIL;
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        topic_types = isa.min_isa(topic, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var_4 = topic_types;
                                    SubLObject type = NIL;
                                    for (type = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , type = cdolist_list_var_4.first()) {
                                        if (NIL != focus_entity.admissible_focus_entity_type(type)) {
                                            {
                                                SubLObject type_name = pph_main.generate_phrase(type, $ANY, NIL, $$EnglishParaphraseMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                topic_triples = cons(list(topic_name, type, type_name), topic_triples);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return topic_triples;
            }
        }
    }

    /**
     *
     *
     * @param ENTITY-NAME,
     * 		stringp; the name of an entity of interest;
     * @return listp; a list of triples of the form (FOLLOWUP-STRING
    FOLLOWUP-TYPE TYPE-STRING)
     */
    @LispMethod(comment = "@param ENTITY-NAME,\r\n\t\tstringp; the name of an entity of interest;\r\n@return listp; a list of triples of the form (FOLLOWUP-STRING\r\nFOLLOWUP-TYPE TYPE-STRING)")
    public static SubLObject topics_related_to_entity_int(final SubLObject entity_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(entity_name) : "! stringp(entity_name) " + ("Types.stringp(entity_name) " + "CommonSymbols.NIL != Types.stringp(entity_name) ") + entity_name;
        final SubLObject variable = quirk_java_gui.$sym91$_TERM;
        final SubLObject search_term = quote_string(entity_name, UNPROVIDED);
        final SubLObject query = list(quirk_java_gui.$$wordIndexesCycTerm, search_term, variable);
        final SubLObject topics = removal_ask_variable(variable, query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject topic_triples = NIL;
        SubLObject cdolist_list_var = topics;
        SubLObject topic = NIL;
        topic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((NIL != individualP(topic)) && (NIL == isa_in_any_mtP(topic, quirk_java_gui.$$KBContentTest_FullySpecified))) && (NIL == isa_in_any_mtP(topic, quirk_java_gui.$$CycLQuerySpecification))) && (NIL == isa_in_any_mtP(topic, quirk_java_gui.$$UnitOfMeasure))) {
                final SubLObject topic_name = generate_phrase(topic, $ANY, NIL, quirk_java_gui.$$EnglishParaphraseMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject topic_types = NIL;
                final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
                try {
                    $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    $mt$.bind(quirk_java_gui.$$EverythingPSC, thread);
                    topic_types = min_isa(topic, UNPROVIDED, UNPROVIDED);
                } finally {
                    $mt$.rebind(_prev_bind_2, thread);
                    $relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                SubLObject cdolist_list_var_$4 = topic_types;
                SubLObject type = NIL;
                type = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL != focus_entity.admissible_focus_entity_type(type)) {
                        final SubLObject type_name = generate_phrase(type, $ANY, NIL, quirk_java_gui.$$EnglishParaphraseMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        topic_triples = cons(list(topic_name, type, type_name), topic_triples);
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

    public static final SubLObject clear_quirk_java_gui_caches_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clrhash($geq_store$.getDynamicValue(thread));
            clrhash($geq_entity_store$.getDynamicValue(thread));
            $entity_graph_registry$.setDynamicValue(NIL, thread);
            return T;
        }
    }

    public static SubLObject clear_quirk_java_gui_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash(quirk_java_gui.$geq_store$.getDynamicValue(thread));
        clrhash(quirk_java_gui.$geq_entity_store$.getDynamicValue(thread));
        quirk_java_gui.$entity_graph_registry$.setDynamicValue(NIL, thread);
        return T;
    }

    public static final SubLObject get_label_for_node_in_graph_alt(SubLObject node_id_string, SubLObject graph_id_string) {
        SubLTrampolineFile.checkType(node_id_string, STRINGP);
        SubLTrampolineFile.checkType(graph_id_string, STRINGP);
        {
            SubLObject v_graph = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_entity_graph_registry(), graph_id_string, UNPROVIDED);
            SubLObject id = parse_integer(node_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(v_graph, GET_NODE_BY_ID, id), GET_LABEL);
        }
    }

    public static SubLObject get_label_for_node_in_graph(final SubLObject node_id_string, final SubLObject graph_id_string) {
        assert NIL != stringp(node_id_string) : "! stringp(node_id_string) " + ("Types.stringp(node_id_string) " + "CommonSymbols.NIL != Types.stringp(node_id_string) ") + node_id_string;
        assert NIL != stringp(graph_id_string) : "! stringp(graph_id_string) " + ("Types.stringp(graph_id_string) " + "CommonSymbols.NIL != Types.stringp(graph_id_string) ") + graph_id_string;
        final SubLObject v_graph = dictionary_lookup(quirk_java_gui.get_entity_graph_registry(), graph_id_string, UNPROVIDED);
        final SubLObject id = parse_integer(node_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return funcall_instance_method_with_0_args(funcall_instance_method_with_1_args(v_graph, quirk_java_gui.GET_NODE_BY_ID, id), quirk_java_gui.GET_LABEL);
    }

    public static final SubLObject get_entity_graph_registry_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == dictionary.dictionary_p($entity_graph_registry$.getDynamicValue(thread))) {
                $entity_graph_registry$.setDynamicValue(dictionary.new_dictionary(EQUALP, FOUR_INTEGER), thread);
            }
            return $entity_graph_registry$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_entity_graph_registry() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == dictionary_p(quirk_java_gui.$entity_graph_registry$.getDynamicValue(thread))) {
            quirk_java_gui.$entity_graph_registry$.setDynamicValue(new_dictionary(EQUALP, FOUR_INTEGER), thread);
        }
        return quirk_java_gui.$entity_graph_registry$.getDynamicValue(thread);
    }

    public static final SubLObject register_graph_alt(SubLObject v_graph, SubLObject root_node) {
        dictionary.dictionary_enter(com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_entity_graph_registry(), instances.get_slot(v_graph, NAME), list(v_graph, root_node));
        return T;
    }

    public static SubLObject register_graph(final SubLObject v_graph, final SubLObject root_node) {
        dictionary_enter(quirk_java_gui.get_entity_graph_registry(), get_slot(v_graph, NAME), list(v_graph, root_node));
        return T;
    }

    public static final SubLObject get_graph_from_registry_alt(SubLObject string) {
        return dictionary.dictionary_lookup(com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_entity_graph_registry(), string, UNPROVIDED).first();
    }

    public static SubLObject get_graph_from_registry(final SubLObject string) {
        return dictionary_lookup(quirk_java_gui.get_entity_graph_registry(), string, UNPROVIDED).first();
    }

    public static final SubLObject get_root_node_from_registry_alt(SubLObject string) {
        return second(dictionary.dictionary_lookup(com.cyc.cycjava.cycl.quirk.quirk_java_gui.get_entity_graph_registry(), string, UNPROVIDED));
    }

    public static SubLObject get_root_node_from_registry(final SubLObject string) {
        return second(dictionary_lookup(quirk_java_gui.get_entity_graph_registry(), string, UNPROVIDED));
    }

    public static SubLObject declare_quirk_java_gui_file() {
        declareFunction("get_answer_gui_lexicon", "GET-ANSWER-GUI-LEXICON", 0, 0, false);
        declareFunction("gui_enabled_question_print_function_trampoline", "GUI-ENABLED-QUESTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("gui_enabled_question_p", "GUI-ENABLED-QUESTION-P", 1, 0, false);
        new quirk_java_gui.$gui_enabled_question_p$UnaryFunction();
        declareFunction("geq_question_object", "GEQ-QUESTION-OBJECT", 1, 0, false);
        declareFunction("geq_answers", "GEQ-ANSWERS", 1, 0, false);
        declareFunction("geq_focus_entities", "GEQ-FOCUS-ENTITIES", 1, 0, false);
        declareFunction("geq_research_done", "GEQ-RESEARCH-DONE", 1, 0, false);
        declareFunction("_csetf_geq_question_object", "_CSETF-GEQ-QUESTION-OBJECT", 2, 0, false);
        declareFunction("_csetf_geq_answers", "_CSETF-GEQ-ANSWERS", 2, 0, false);
        declareFunction("_csetf_geq_focus_entities", "_CSETF-GEQ-FOCUS-ENTITIES", 2, 0, false);
        declareFunction("_csetf_geq_research_done", "_CSETF-GEQ-RESEARCH-DONE", 2, 0, false);
        declareFunction("make_gui_enabled_question", "MAKE-GUI-ENABLED-QUESTION", 0, 1, false);
        declareFunction("visit_defstruct_gui_enabled_question", "VISIT-DEFSTRUCT-GUI-ENABLED-QUESTION", 2, 0, false);
        declareFunction("visit_defstruct_object_gui_enabled_question_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-QUESTION-METHOD", 2, 0, false);
        declareFunction("pprint_geq", "PPRINT-GEQ", 3, 0, false);
        declareFunction("new_gui_enabled_question", "NEW-GUI-ENABLED-QUESTION", 1, 1, false);
        declareFunction("get_geq_answer_by_index", "GET-GEQ-ANSWER-BY-INDEX", 2, 0, false);
        declareFunction("identify_geq_entities_for_index", "IDENTIFY-GEQ-ENTITIES-FOR-INDEX", 2, 0, false);
        declareFunction("answer_gui_question_int", "ANSWER-GUI-QUESTION-INT", 1, 0, false);
        declareFunction("generate_quirk_gui_empty_answer", "GENERATE-QUIRK-GUI-EMPTY-ANSWER", 0, 0, false);
        declareFunction("get_geq_entity_graph_root_description", "GET-GEQ-ENTITY-GRAPH-ROOT-DESCRIPTION", 1, 1, false);
        declareFunction("build_geq_entity_graph", "BUILD-GEQ-ENTITY-GRAPH", 1, 1, false);
        declareFunction("create_smart_cyc_graph_nodes_from_type_name", "CREATE-SMART-CYC-GRAPH-NODES-FROM-TYPE-NAME", 2, 0, false);
        declareFunction("get_geq_entity_child_node_descriptions", "GET-GEQ-ENTITY-CHILD-NODE-DESCRIPTIONS", 2, 0, false);
        declareFunction("make_node_description", "MAKE-NODE-DESCRIPTION", 1, 0, false);
        declareFunction("identify_all_geq_entities_int", "IDENTIFY-ALL-GEQ-ENTITIES-INT", 1, 0, false);
        declareFunction("research_entity", "RESEARCH-ENTITY", 1, 0, false);
        declareFunction("get_followups_for_entity_int", "GET-FOLLOWUPS-FOR-ENTITY-INT", 1, 0, false);
        declareFunction("compute_reasonable_quirk_followup_question", "COMPUTE-REASONABLE-QUIRK-FOLLOWUP-QUESTION", 1, 0, false);
        declareFunction("get_passages_for_entity_int", "GET-PASSAGES-FOR-ENTITY-INT", 1, 0, false);
        declareFunction("return_document_as_string_int", "RETURN-DOCUMENT-AS-STRING-INT", 1, 0, false);
        declareFunction("compute_full_cns_path", "COMPUTE-FULL-CNS-PATH", 1, 0, false);
        declareFunction("topics_related_to_entity_int", "TOPICS-RELATED-TO-ENTITY-INT", 1, 0, false);
        declareFunction("clear_quirk_java_gui_caches", "CLEAR-QUIRK-JAVA-GUI-CACHES", 0, 0, false);
        declareFunction("get_label_for_node_in_graph", "GET-LABEL-FOR-NODE-IN-GRAPH", 2, 0, false);
        declareFunction("get_entity_graph_registry", "GET-ENTITY-GRAPH-REGISTRY", 0, 0, false);
        declareFunction("register_graph", "REGISTER-GRAPH", 2, 0, false);
        declareFunction("get_graph_from_registry", "GET-GRAPH-FROM-REGISTRY", 1, 0, false);
        declareFunction("get_root_node_from_registry", "GET-ROOT-NODE-FROM-REGISTRY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_quirk_java_gui_file() {
        defvar("*ANSWER-GUI-LEXICON*", NIL);
        defvar("*GEQ-STORE*", make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED));
        defvar("*GEQ-ENTITY-STORE*", make_hash_table(EIGHT_INTEGER, symbol_function(EQUALP), UNPROVIDED));
        defconstant("*DTP-GUI-ENABLED-QUESTION*", quirk_java_gui.GUI_ENABLED_QUESTION);
        defvar("*ENTITY-GRAPH-REGISTRY*", NIL);
        return NIL;
    }

    public static SubLObject setup_quirk_java_gui_file() {
        register_method($print_object_method_table$.getGlobalValue(), quirk_java_gui.$dtp_gui_enabled_question$.getGlobalValue(), symbol_function(quirk_java_gui.GUI_ENABLED_QUESTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(quirk_java_gui.$list9);
        def_csetf(quirk_java_gui.GEQ_QUESTION_OBJECT, quirk_java_gui._CSETF_GEQ_QUESTION_OBJECT);
        def_csetf(quirk_java_gui.GEQ_ANSWERS, quirk_java_gui._CSETF_GEQ_ANSWERS);
        def_csetf(quirk_java_gui.GEQ_FOCUS_ENTITIES, quirk_java_gui._CSETF_GEQ_FOCUS_ENTITIES);
        def_csetf(quirk_java_gui.GEQ_RESEARCH_DONE, quirk_java_gui._CSETF_GEQ_RESEARCH_DONE);
        identity(quirk_java_gui.GUI_ENABLED_QUESTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), quirk_java_gui.$dtp_gui_enabled_question$.getGlobalValue(), symbol_function(quirk_java_gui.VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_QUESTION_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        quirk_java_gui.declare_quirk_java_gui_file();
    }

    @Override
    public void initializeVariables() {
        quirk_java_gui.init_quirk_java_gui_file();
    }

    @Override
    public void runTopLevelForms() {
        quirk_java_gui.setup_quirk_java_gui_file();
    }

    static {
    }

    private static final SubLSymbol GUI_ENABLED_QUESTION = makeSymbol("GUI-ENABLED-QUESTION");

    private static final SubLSymbol GUI_ENABLED_QUESTION_P = makeSymbol("GUI-ENABLED-QUESTION-P");

    static private final SubLList $list3 = list(makeSymbol("QUESTION-OBJECT"), makeSymbol("ANSWERS"), makeSymbol("FOCUS-ENTITIES"), makeSymbol("RESEARCH-DONE"));

    static private final SubLList $list4 = list(makeKeyword("QUESTION-OBJECT"), makeKeyword("ANSWERS"), makeKeyword("FOCUS-ENTITIES"), makeKeyword("RESEARCH-DONE"));

    static private final SubLList $list5 = list(makeSymbol("GEQ-QUESTION-OBJECT"), makeSymbol("GEQ-ANSWERS"), makeSymbol("GEQ-FOCUS-ENTITIES"), makeSymbol("GEQ-RESEARCH-DONE"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-GEQ-QUESTION-OBJECT"), makeSymbol("_CSETF-GEQ-ANSWERS"), makeSymbol("_CSETF-GEQ-FOCUS-ENTITIES"), makeSymbol("_CSETF-GEQ-RESEARCH-DONE"));

    private static final SubLSymbol PPRINT_GEQ = makeSymbol("PPRINT-GEQ");

    private static final SubLSymbol GUI_ENABLED_QUESTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GUI-ENABLED-QUESTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GUI-ENABLED-QUESTION-P"));

    private static final SubLSymbol GEQ_QUESTION_OBJECT = makeSymbol("GEQ-QUESTION-OBJECT");

    private static final SubLSymbol _CSETF_GEQ_QUESTION_OBJECT = makeSymbol("_CSETF-GEQ-QUESTION-OBJECT");

    private static final SubLSymbol GEQ_ANSWERS = makeSymbol("GEQ-ANSWERS");

    private static final SubLSymbol _CSETF_GEQ_ANSWERS = makeSymbol("_CSETF-GEQ-ANSWERS");

    private static final SubLSymbol GEQ_FOCUS_ENTITIES = makeSymbol("GEQ-FOCUS-ENTITIES");

    private static final SubLSymbol _CSETF_GEQ_FOCUS_ENTITIES = makeSymbol("_CSETF-GEQ-FOCUS-ENTITIES");

    private static final SubLSymbol GEQ_RESEARCH_DONE = makeSymbol("GEQ-RESEARCH-DONE");

    private static final SubLSymbol _CSETF_GEQ_RESEARCH_DONE = makeSymbol("_CSETF-GEQ-RESEARCH-DONE");

    private static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_GUI_ENABLED_QUESTION = makeSymbol("MAKE-GUI-ENABLED-QUESTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_QUESTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-QUESTION-METHOD");

    private static final SubLString $str28$_GEQ___A_answers_ = makeString("<GEQ: ~A answers>");

    private static final SubLList $list29 = list(makeString("CNSjan2004"));

    private static final SubLString $str37$ = makeString("");

    private static final SubLSymbol IDENTIFY_ENTITIES = makeSymbol("IDENTIFY-ENTITIES");

    private static final SubLSymbol ADD_PASSAGE = makeSymbol("ADD-PASSAGE");

    private static final SubLSymbol GET_LABEL = makeSymbol("GET-LABEL");

    private static final SubLSymbol GET_CORE = makeSymbol("GET-CORE");



    private static final SubLSymbol CYC_GRAPH_NODE = makeSymbol("CYC-GRAPH-NODE");

    private static final SubLSymbol SET_CORE = makeSymbol("SET-CORE");

    private static final SubLSymbol SET_LABEL = makeSymbol("SET-LABEL");

    private static final SubLSymbol INTERPOLATE_NODE = makeSymbol("INTERPOLATE-NODE");

    private static final SubLList $list49 = list(makeSymbol("ENTITY-NAME"), makeSymbol("TYPE"), makeSymbol("TYPE-NAME"));

    private static final SubLSymbol INTERPOLATE_CYC_TERM = makeSymbol("INTERPOLATE-CYC-TERM");



    private static final SubLList $list54 = list(reader_make_constant_shell("pnNonPlural-Generic"), reader_make_constant_shell("pnSingular"));



    private static final SubLString $str57$__ = makeString(", ");



    private static final SubLSymbol GET_NODE_BY_ID = makeSymbol("GET-NODE-BY-ID");

    private static final SubLSymbol GET_NODES_FROM_NODE = makeSymbol("GET-NODES-FROM-NODE");

    private static final SubLString $str61$no_answers__geq___S__ = makeString("no-answers~%geq: ~S~%");



    private static final SubLSymbol LEARN_TYPES_FROM_CORPORA = makeSymbol("LEARN-TYPES-FROM-CORPORA");

    private static final SubLSymbol RENDER = makeSymbol("RENDER");

    private static final SubLSymbol INFERENCE_POOL_CREATED = makeSymbol("INFERENCE-POOL-CREATED");

    private static final SubLSymbol GENERATE_SALIENT_QUERIES = makeSymbol("GENERATE-SALIENT-QUERIES");

    private static final SubLSymbol GET_SALIENT_QUERIES = makeSymbol("GET-SALIENT-QUERIES");



    private static final SubLString $$$Who_is_ = makeString("Who is ");

    private static final SubLString $str74$_ = makeString("?");



    private static final SubLString $$$What_is_ = makeString("What is ");

    private static final SubLList $list77 = list(reader_make_constant_shell("unknownSentence"));





    private static final SubLString $str82$__Could_not_open_file__A = makeString("~%Could not open file ~A");

    private static final SubLString $str85$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str86$___S = makeString("~%~S");

    private static final SubLInteger $int$10000000 = makeInteger(10000000);

    private static final SubLString $str88$__File__A_is_too_big_for_me_to_di = makeString("~%File ~A is too big for me to display (~S characters)...");

    private static final SubLString $str89$_home_elmore0_scratch_quirk_corpo = makeString("/home/elmore0/scratch/quirk/corpora/CNSjan2004trec/");

    private static final SubLString $str90$_trec = makeString(".trec");

    private static final SubLSymbol $sym91$_TERM = makeSymbol("?TERM");



    private static final SubLObject $$KBContentTest_FullySpecified = reader_make_constant_shell("KBContentTest-FullySpecified");





    public static final class $gui_enabled_question_native extends SubLStructNative {
        public SubLObject $question_object;

        public SubLObject $answers;

        public SubLObject $focus_entities;

        public SubLObject $research_done;

        private static final SubLStructDeclNative structDecl;

        public $gui_enabled_question_native() {
            quirk_java_gui.$gui_enabled_question_native.this.$question_object = Lisp.NIL;
            quirk_java_gui.$gui_enabled_question_native.this.$answers = Lisp.NIL;
            quirk_java_gui.$gui_enabled_question_native.this.$focus_entities = Lisp.NIL;
            quirk_java_gui.$gui_enabled_question_native.this.$research_done = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return quirk_java_gui.$gui_enabled_question_native.this.$question_object;
        }

        @Override
        public SubLObject getField3() {
            return quirk_java_gui.$gui_enabled_question_native.this.$answers;
        }

        @Override
        public SubLObject getField4() {
            return quirk_java_gui.$gui_enabled_question_native.this.$focus_entities;
        }

        @Override
        public SubLObject getField5() {
            return quirk_java_gui.$gui_enabled_question_native.this.$research_done;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return quirk_java_gui.$gui_enabled_question_native.this.$question_object = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return quirk_java_gui.$gui_enabled_question_native.this.$answers = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return quirk_java_gui.$gui_enabled_question_native.this.$focus_entities = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return quirk_java_gui.$gui_enabled_question_native.this.$research_done = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.quirk.quirk_java_gui.$gui_enabled_question_native.class, quirk_java_gui.GUI_ENABLED_QUESTION, quirk_java_gui.GUI_ENABLED_QUESTION_P, quirk_java_gui.$list3, quirk_java_gui.$list4, new String[]{ "$question_object", "$answers", "$focus_entities", "$research_done" }, quirk_java_gui.$list5, quirk_java_gui.$list6, quirk_java_gui.PPRINT_GEQ);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("QUESTION-OBJECT"), makeSymbol("ANSWERS"), makeSymbol("FOCUS-ENTITIES"), makeSymbol("RESEARCH-DONE"));

    static private final SubLList $list_alt4 = list(makeKeyword("QUESTION-OBJECT"), makeKeyword("ANSWERS"), makeKeyword("FOCUS-ENTITIES"), makeKeyword("RESEARCH-DONE"));

    static private final SubLList $list_alt5 = list(makeSymbol("GEQ-QUESTION-OBJECT"), makeSymbol("GEQ-ANSWERS"), makeSymbol("GEQ-FOCUS-ENTITIES"), makeSymbol("GEQ-RESEARCH-DONE"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-GEQ-QUESTION-OBJECT"), makeSymbol("_CSETF-GEQ-ANSWERS"), makeSymbol("_CSETF-GEQ-FOCUS-ENTITIES"), makeSymbol("_CSETF-GEQ-RESEARCH-DONE"));

    public static final class $gui_enabled_question_p$UnaryFunction extends UnaryFunction {
        public $gui_enabled_question_p$UnaryFunction() {
            super(extractFunctionNamed("GUI-ENABLED-QUESTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return quirk_java_gui.gui_enabled_question_p(arg1);
        }
    }

    static private final SubLString $str_alt21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt22$_GEQ___A_answers_ = makeString("<GEQ: ~A answers>");

    static private final SubLList $list_alt23 = list(makeString("CNSjan2004"));

    static private final SubLList $list_alt43 = list(makeSymbol("ENTITY-NAME"), makeSymbol("TYPE"), makeSymbol("TYPE-NAME"));

    static private final SubLList $list_alt48 = list(reader_make_constant_shell("pnNonPlural-Generic"), reader_make_constant_shell("pnSingular"));

    static private final SubLString $str_alt51$__ = makeString(", ");

    static private final SubLString $str_alt55$no_answers__geq___S__ = makeString("no-answers~%geq: ~S~%");

    static private final SubLString $str_alt67$Who_is_ = makeString("Who is ");

    static private final SubLString $str_alt68$_ = makeString("?");

    static private final SubLString $str_alt70$What_is_ = makeString("What is ");

    static private final SubLList $list_alt71 = list(reader_make_constant_shell("unknownSentence"));

    static private final SubLString $str_alt76$__Could_not_open_file__A = makeString("~%Could not open file ~A");

    static private final SubLString $str_alt79$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt80$___S = makeString("~%~S");

    static private final SubLString $str_alt82$__File__A_is_too_big_for_me_to_di = makeString("~%File ~A is too big for me to display (~S characters)...");

    static private final SubLString $str_alt83$_home_elmore0_scratch_quirk_corpo = makeString("/home/elmore0/scratch/quirk/corpora/CNSjan2004trec/");

    static private final SubLString $str_alt84$_trec = makeString(".trec");

    static private final SubLSymbol $sym85$_TERM = makeSymbol("?TERM");
}

/**
 * Total time: 259 ms
 */
