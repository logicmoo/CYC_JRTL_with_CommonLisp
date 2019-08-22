package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class wordnet extends SubLTranslatedFile {
    public static final SubLFile me = new wordnet();

    public static final String myName = "com.cyc.cycjava.cycl.wordnet";

    public static final String myFingerPrint = "b4171696557533b7662be8c4ab371e6496ee3e12f5c10828cf5c869e6cb94e99";

    // deflexical
    private static final SubLSymbol $wordnet_core_constants$ = makeSymbol("*WORDNET-CORE-CONSTANTS*");

    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("synonymousExternalConcept")));

    public static final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol LOAD_WORDNET = makeSymbol("LOAD-WORDNET");

    public static SubLObject initialize_wordnet_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $wordnet_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_wordnet_kb_loaded();
        } else {
            kb_control_vars.unset_wordnet_kb_loaded();
        }
        return kb_control_vars.wordnet_kb_loaded_p();
    }

    public static SubLObject wordnet_word_p(final SubLObject string, final SubLObject pos) {
        return NIL;
    }

    public static SubLObject pos_according_to_wn(final SubLObject string) {
        return NIL;
    }

    public static SubLObject wn_direct_denots_of_string(final SubLObject string, SubLObject part_of_speech) {
        if (part_of_speech == UNPROVIDED) {
            part_of_speech = NIL;
        }
        return NIL;
    }

    public static SubLObject denots_of_stringXpos_with_synset_boosters(final SubLObject term_string, final SubLObject pos) {
        return NIL;
    }

    public static SubLObject load_wordnet(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return NIL;
    }

    public static SubLObject declare_wordnet_file() {
        declareFunction(me, "initialize_wordnet_kb_feature", "INITIALIZE-WORDNET-KB-FEATURE", 0, 0, false);
        declareFunction(me, "wordnet_word_p", "WORDNET-WORD-P", 2, 0, false);
        declareFunction(me, "pos_according_to_wn", "POS-ACCORDING-TO-WN", 1, 0, false);
        declareFunction(me, "wn_direct_denots_of_string", "WN-DIRECT-DENOTS-OF-STRING", 1, 1, false);
        declareFunction(me, "denots_of_stringXpos_with_synset_boosters", "DENOTS-OF-STRING&POS-WITH-SYNSET-BOOSTERS", 2, 0, false);
        declareFunction(me, "load_wordnet", "LOAD-WORDNET", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_wordnet_file() {
        deflexical("*WORDNET-CORE-CONSTANTS*", $list0);
        return NIL;
    }

    public static SubLObject setup_wordnet_file() {
        define_obsolete_register(LOAD_WORDNET, NIL);
        return NIL;
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

    
}

/**
 * Total time: 100 ms
 */
