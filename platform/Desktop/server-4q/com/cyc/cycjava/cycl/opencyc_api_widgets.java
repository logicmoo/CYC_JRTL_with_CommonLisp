package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class opencyc_api_widgets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.opencyc_api_widgets";
    public static final String myFingerPrint = "f1c4b962d02df577b7c50620ca05715a576374ffde6fcf1c77611b114b5bee9d";
    private static final SubLObject $const0$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $sym1$CYCL_SENTENCE_P;
    private static final SubLSymbol $sym2$HLMT_P;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF_ASSERT;
    private static final SubLList $list5;
    private static final SubLString $str6$Returns_an_English_explanation_of;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF;
    
    @SubLTranslatedFile.SubL(source = "cycl/opencyc-api-widgets.lisp", position = 843L)
    public static SubLObject opencyc_explanation_of_why_not_wff_assert(final SubLObject sentence, SubLObject mt) {
        if (mt == opencyc_api_widgets.UNPROVIDED) {
            mt = opencyc_api_widgets.$const0$CurrentWorldDataCollectorMt_NonHo;
        }
        enforceType(sentence, opencyc_api_widgets.$sym1$CYCL_SENTENCE_P);
        enforceType(mt, opencyc_api_widgets.$sym2$HLMT_P);
        return wff.explanation_of_why_not_wff_assert(sentence, mt, (SubLObject)opencyc_api_widgets.$list3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/opencyc-api-widgets.lisp", position = 1278L)
    public static SubLObject opencyc_explanation_of_why_not_wff(final SubLObject sentence, SubLObject mt) {
        if (mt == opencyc_api_widgets.UNPROVIDED) {
            mt = opencyc_api_widgets.$const0$CurrentWorldDataCollectorMt_NonHo;
        }
        enforceType(sentence, opencyc_api_widgets.$sym1$CYCL_SENTENCE_P);
        enforceType(mt, opencyc_api_widgets.$sym2$HLMT_P);
        return wff.explanation_of_why_not_wff(sentence, mt, (SubLObject)opencyc_api_widgets.$list3);
    }
    
    public static SubLObject declare_opencyc_api_widgets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.opencyc_api_widgets", "opencyc_explanation_of_why_not_wff_assert", "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.opencyc_api_widgets", "opencyc_explanation_of_why_not_wff", "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false);
        return (SubLObject)opencyc_api_widgets.NIL;
    }
    
    public static SubLObject init_opencyc_api_widgets_file() {
        return (SubLObject)opencyc_api_widgets.NIL;
    }
    
    public static SubLObject setup_opencyc_api_widgets_file() {
        utilities_macros.register_cyc_api_function((SubLObject)opencyc_api_widgets.$sym4$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF_ASSERT, (SubLObject)opencyc_api_widgets.$list5, (SubLObject)opencyc_api_widgets.$str6$Returns_an_English_explanation_of, (SubLObject)opencyc_api_widgets.$list7, (SubLObject)opencyc_api_widgets.$list8);
        utilities_macros.register_cyc_api_function((SubLObject)opencyc_api_widgets.$sym9$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF, (SubLObject)opencyc_api_widgets.$list5, (SubLObject)opencyc_api_widgets.$str6$Returns_an_English_explanation_of, (SubLObject)opencyc_api_widgets.$list7, (SubLObject)opencyc_api_widgets.$list8);
        return (SubLObject)opencyc_api_widgets.NIL;
    }
    
    public void declareFunctions() {
        declare_opencyc_api_widgets_file();
    }
    
    public void initializeVariables() {
        init_opencyc_api_widgets_file();
    }
    
    public void runTopLevelForms() {
        setup_opencyc_api_widgets_file();
    }
    
    static {
        me = (SubLFile)new opencyc_api_widgets();
        $const0$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym1$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $sym2$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IO-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $sym4$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF_ASSERT = SubLObjectFactory.makeSymbol("OPENCYC-EXPLANATION-OF-WHY-NOT-WFF-ASSERT");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"))));
        $str6$Returns_an_English_explanation_of = SubLObjectFactory.makeString("Returns an English explanation of why SENTENCE is not assertible in MT.  An assertible sentence results in a NIL return value.");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-OR-NIL-P"));
        $sym9$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF = SubLObjectFactory.makeSymbol("OPENCYC-EXPLANATION-OF-WHY-NOT-WFF");
    }
}

/*

	Total time: 89 ms
	
*/