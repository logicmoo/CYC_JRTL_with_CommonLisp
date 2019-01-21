package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wordnet extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wordnet";
    public static final String myFingerPrint = "b4171696557533b7662be8c4ab371e6496ee3e12f5c10828cf5c869e6cb94e99";
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 1098L)
    private static SubLSymbol $wordnet_core_constants$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$VALID_CONSTANT_;
    private static final SubLSymbol $sym2$LOAD_WORDNET;
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 1326L)
    public static SubLObject initialize_wordnet_kb_feature() {
        if (wordnet.NIL != list_utilities.every_in_list((SubLObject)wordnet.$sym1$VALID_CONSTANT_, wordnet.$wordnet_core_constants$.getGlobalValue(), (SubLObject)wordnet.UNPROVIDED)) {
            kb_control_vars.set_wordnet_kb_loaded();
        }
        else {
            kb_control_vars.unset_wordnet_kb_loaded();
        }
        return kb_control_vars.wordnet_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 1670L)
    public static SubLObject wordnet_word_p(final SubLObject string, final SubLObject pos) {
        return (SubLObject)wordnet.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 1892L)
    public static SubLObject pos_according_to_wn(final SubLObject string) {
        return (SubLObject)wordnet.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 2132L)
    public static SubLObject wn_direct_denots_of_string(final SubLObject string, SubLObject part_of_speech) {
        if (part_of_speech == wordnet.UNPROVIDED) {
            part_of_speech = (SubLObject)wordnet.NIL;
        }
        return (SubLObject)wordnet.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 2978L)
    public static SubLObject denots_of_stringXpos_with_synset_boosters(final SubLObject term_string, final SubLObject pos) {
        return (SubLObject)wordnet.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet.lisp", position = 5175L)
    public static SubLObject load_wordnet(SubLObject directory_path) {
        if (directory_path == wordnet.UNPROVIDED) {
            directory_path = (SubLObject)wordnet.NIL;
        }
        return (SubLObject)wordnet.NIL;
    }
    
    public static SubLObject declare_wordnet_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet", "initialize_wordnet_kb_feature", "INITIALIZE-WORDNET-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet", "wordnet_word_p", "WORDNET-WORD-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet", "pos_according_to_wn", "POS-ACCORDING-TO-WN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet", "wn_direct_denots_of_string", "WN-DIRECT-DENOTS-OF-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet", "denots_of_stringXpos_with_synset_boosters", "DENOTS-OF-STRING&POS-WITH-SYNSET-BOOSTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet", "load_wordnet", "LOAD-WORDNET", 0, 1, false);
        return (SubLObject)wordnet.NIL;
    }
    
    public static SubLObject init_wordnet_file() {
        wordnet.$wordnet_core_constants$ = SubLFiles.deflexical("*WORDNET-CORE-CONSTANTS*", (SubLObject)wordnet.$list0);
        return (SubLObject)wordnet.NIL;
    }
    
    public static SubLObject setup_wordnet_file() {
        access_macros.define_obsolete_register((SubLObject)wordnet.$sym2$LOAD_WORDNET, (SubLObject)wordnet.NIL);
        return (SubLObject)wordnet.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wordnet_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wordnet_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wordnet_file();
    }
    
    static {
        me = (SubLFile)new wordnet();
        wordnet.$wordnet_core_constants$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept")));
        $sym1$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $sym2$LOAD_WORDNET = SubLObjectFactory.makeSymbol("LOAD-WORDNET");
    }
}

/*

	Total time: 100 ms
	
*/