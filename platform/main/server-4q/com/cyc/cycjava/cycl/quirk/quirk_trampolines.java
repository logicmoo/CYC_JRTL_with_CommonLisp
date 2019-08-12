/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUIRK-TRAMPOLINES
 * source file: /cyc/top/cycl/quirk/quirk-trampolines.lisp
 * created:     2019/07/03 17:39:00
 */
public final class quirk_trampolines extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new quirk_trampolines();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_trampolines";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GET_PASSAGES_FOR_ENTITY = makeSymbol("GET-PASSAGES-FOR-ENTITY");

    private static final SubLSymbol RETURN_DOCUMENT_AS_STRING = makeSymbol("RETURN-DOCUMENT-AS-STRING");

    private static final SubLSymbol TOPICS_RELATED_TO_ENTITY = makeSymbol("TOPICS-RELATED-TO-ENTITY");

    private static final SubLSymbol ANSWER_GUI_QUESTION = makeSymbol("ANSWER-GUI-QUESTION");

    private static final SubLSymbol IDENTIFY_ALL_GEQ_ENTITIES = makeSymbol("IDENTIFY-ALL-GEQ-ENTITIES");

    private static final SubLSymbol GET_FOLLOWUPS_FOR_ENTITY = makeSymbol("GET-FOLLOWUPS-FOR-ENTITY");

    // Definitions
    public static final SubLObject get_passages_for_entity_alt(SubLObject entity_name) {
        return quirk_java_gui.get_passages_for_entity_int(entity_name);
    }

    // Definitions
    public static SubLObject get_passages_for_entity(final SubLObject entity_name) {
        return quirk_java_gui.get_passages_for_entity_int(entity_name);
    }

    public static final SubLObject return_document_as_string_alt(SubLObject passage_doc_id) {
        return quirk_java_gui.return_document_as_string_int(passage_doc_id);
    }

    public static SubLObject return_document_as_string(final SubLObject passage_doc_id) {
        return quirk_java_gui.return_document_as_string_int(passage_doc_id);
    }

    public static final SubLObject topics_related_to_entity_alt(SubLObject entity_name) {
        return quirk_java_gui.topics_related_to_entity_int(entity_name);
    }

    public static SubLObject topics_related_to_entity(final SubLObject entity_name) {
        return quirk_java_gui.topics_related_to_entity_int(entity_name);
    }

    public static final SubLObject answer_gui_question_alt(SubLObject question_string) {
        return quirk_java_gui.answer_gui_question_int(question_string);
    }

    public static SubLObject answer_gui_question(final SubLObject question_string) {
        return quirk_java_gui.answer_gui_question_int(question_string);
    }

    public static final SubLObject identify_all_geq_entities_alt(SubLObject geq_string) {
        return quirk_java_gui.identify_all_geq_entities_int(geq_string);
    }

    public static SubLObject identify_all_geq_entities(final SubLObject geq_string) {
        return quirk_java_gui.identify_all_geq_entities_int(geq_string);
    }

    public static final SubLObject get_followups_for_entity_alt(SubLObject entity_name) {
        return quirk_java_gui.get_followups_for_entity_int(entity_name);
    }

    public static SubLObject get_followups_for_entity(final SubLObject entity_name) {
        return quirk_java_gui.get_followups_for_entity_int(entity_name);
    }

    public static SubLObject declare_quirk_trampolines_file() {
        declareFunction("get_passages_for_entity", "GET-PASSAGES-FOR-ENTITY", 1, 0, false);
        declareFunction("return_document_as_string", "RETURN-DOCUMENT-AS-STRING", 1, 0, false);
        declareFunction("topics_related_to_entity", "TOPICS-RELATED-TO-ENTITY", 1, 0, false);
        declareFunction("answer_gui_question", "ANSWER-GUI-QUESTION", 1, 0, false);
        declareFunction("identify_all_geq_entities", "IDENTIFY-ALL-GEQ-ENTITIES", 1, 0, false);
        declareFunction("get_followups_for_entity", "GET-FOLLOWUPS-FOR-ENTITY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_quirk_trampolines_file() {
        return NIL;
    }

    public static SubLObject setup_quirk_trampolines_file() {
        register_external_symbol(GET_PASSAGES_FOR_ENTITY);
        register_external_symbol(RETURN_DOCUMENT_AS_STRING);
        register_external_symbol(TOPICS_RELATED_TO_ENTITY);
        register_external_symbol(ANSWER_GUI_QUESTION);
        register_external_symbol(IDENTIFY_ALL_GEQ_ENTITIES);
        register_external_symbol(GET_FOLLOWUPS_FOR_ENTITY);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_quirk_trampolines_file();
    }

    @Override
    public void initializeVariables() {
        init_quirk_trampolines_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_quirk_trampolines_file();
    }

    static {
    }
}

/**
 * Total time: 64 ms
 */
