package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class quirk_trampolines extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_trampolines";
    public static final String myFingerPrint = "cea4b21512cb02c6b0e636ec47052283a9d6e8881ae5d18068dc1484c813cd83";
    private static final SubLSymbol $sym0$GET_PASSAGES_FOR_ENTITY;
    private static final SubLSymbol $sym1$RETURN_DOCUMENT_AS_STRING;
    private static final SubLSymbol $sym2$TOPICS_RELATED_TO_ENTITY;
    private static final SubLSymbol $sym3$ANSWER_GUI_QUESTION;
    private static final SubLSymbol $sym4$IDENTIFY_ALL_GEQ_ENTITIES;
    private static final SubLSymbol $sym5$GET_FOLLOWUPS_FOR_ENTITY;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-trampolines.lisp", position = 674L)
    public static SubLObject get_passages_for_entity(final SubLObject entity_name) {
        return quirk_java_gui.get_passages_for_entity_int(entity_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-trampolines.lisp", position = 824L)
    public static SubLObject return_document_as_string(final SubLObject passage_doc_id) {
        return quirk_java_gui.return_document_as_string_int(passage_doc_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-trampolines.lisp", position = 983L)
    public static SubLObject topics_related_to_entity(final SubLObject entity_name) {
        return quirk_java_gui.topics_related_to_entity_int(entity_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-trampolines.lisp", position = 1135L)
    public static SubLObject answer_gui_question(final SubLObject question_string) {
        return quirk_java_gui.answer_gui_question_int(question_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-trampolines.lisp", position = 1285L)
    public static SubLObject identify_all_geq_entities(final SubLObject geq_string) {
        return quirk_java_gui.identify_all_geq_entities_int(geq_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/quirk-trampolines.lisp", position = 1437L)
    public static SubLObject get_followups_for_entity(final SubLObject entity_name) {
        return quirk_java_gui.get_followups_for_entity_int(entity_name);
    }
    
    public static SubLObject declare_quirk_trampolines_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_trampolines", "get_passages_for_entity", "GET-PASSAGES-FOR-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_trampolines", "return_document_as_string", "RETURN-DOCUMENT-AS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_trampolines", "topics_related_to_entity", "TOPICS-RELATED-TO-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_trampolines", "answer_gui_question", "ANSWER-GUI-QUESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_trampolines", "identify_all_geq_entities", "IDENTIFY-ALL-GEQ-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.quirk_trampolines", "get_followups_for_entity", "GET-FOLLOWUPS-FOR-ENTITY", 1, 0, false);
        return (SubLObject)quirk_trampolines.NIL;
    }
    
    public static SubLObject init_quirk_trampolines_file() {
        return (SubLObject)quirk_trampolines.NIL;
    }
    
    public static SubLObject setup_quirk_trampolines_file() {
        access_macros.register_external_symbol((SubLObject)quirk_trampolines.$sym0$GET_PASSAGES_FOR_ENTITY);
        access_macros.register_external_symbol((SubLObject)quirk_trampolines.$sym1$RETURN_DOCUMENT_AS_STRING);
        access_macros.register_external_symbol((SubLObject)quirk_trampolines.$sym2$TOPICS_RELATED_TO_ENTITY);
        access_macros.register_external_symbol((SubLObject)quirk_trampolines.$sym3$ANSWER_GUI_QUESTION);
        access_macros.register_external_symbol((SubLObject)quirk_trampolines.$sym4$IDENTIFY_ALL_GEQ_ENTITIES);
        access_macros.register_external_symbol((SubLObject)quirk_trampolines.$sym5$GET_FOLLOWUPS_FOR_ENTITY);
        return (SubLObject)quirk_trampolines.NIL;
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
        me = (SubLFile)new quirk_trampolines();
        $sym0$GET_PASSAGES_FOR_ENTITY = SubLObjectFactory.makeSymbol("GET-PASSAGES-FOR-ENTITY");
        $sym1$RETURN_DOCUMENT_AS_STRING = SubLObjectFactory.makeSymbol("RETURN-DOCUMENT-AS-STRING");
        $sym2$TOPICS_RELATED_TO_ENTITY = SubLObjectFactory.makeSymbol("TOPICS-RELATED-TO-ENTITY");
        $sym3$ANSWER_GUI_QUESTION = SubLObjectFactory.makeSymbol("ANSWER-GUI-QUESTION");
        $sym4$IDENTIFY_ALL_GEQ_ENTITIES = SubLObjectFactory.makeSymbol("IDENTIFY-ALL-GEQ-ENTITIES");
        $sym5$GET_FOLLOWUPS_FOR_ENTITY = SubLObjectFactory.makeSymbol("GET-FOLLOWUPS-FOR-ENTITY");
    }
}

/*

	Total time: 64 ms
	
*/