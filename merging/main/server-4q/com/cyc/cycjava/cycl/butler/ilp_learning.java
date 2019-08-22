/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.butler;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.rkf_contradiction_finder;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      ILP-LEARNING
 *  source file: /cyc/top/cycl/butler/ilp-learning.lisp
 *  created:     2019/07/03 17:39:04
 */
public final class ilp_learning extends SubLTranslatedFile implements V02 {
    // // Constructor
    private ilp_learning() {
    }

    public static final SubLFile me = new ilp_learning();

    public static final String myName = "com.cyc.cycjava.cycl.butler.ilp_learning";

    // // Definitions
    public static final SubLObject aleph_fileset_name() {
        return cconcatenate(foil_export.aleph_induction_fileset_name(), numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject aleph_assert_if_consistent(SubLObject gaf, SubLObject mt) {
        if (NIL == rkf_contradiction_finder.rkf_rejected(gaf, mt, UNPROVIDED, UNPROVIDED)) {
            return rkf_assertion_utilities.rkf_assert_with_implicature(gaf, mt, $NOW);
        }
        return $INCONSISTENT;
    }

    /**
     * Adds GAFs that have been evaluated to be true by human reviewers, to MT.
     */
    public static final SubLObject aleph_add_human_approved_gafs(SubLObject mt) {
        {
            SubLObject cdolist_list_var = ask_utilities.query_variable($sym2$_SENTENCE, $list_alt3, $$InferencePSC, UNPROVIDED);
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                aleph_assert_if_consistent(gaf, mt);
            }
        }
        return mt;
    }

    /**
     * Adds GAFs that have been verified by Google but not reviewed by humans, to
     * MT.
     */
    public static final SubLObject aleph_add_google_verified_only_gafs(SubLObject mt) {
        {
            SubLObject google_verified_gafs = ask_utilities.query_variable($sym2$_SENTENCE, $list_alt5, UNPROVIDED, UNPROVIDED);
            SubLObject reviewed_gafs = ask_utilities.query_variable($sym2$_SENTENCE, $list_alt6, $$InferencePSC, $list_alt7);
            SubLObject cdolist_list_var = set_difference(google_verified_gafs, reviewed_gafs, symbol_function(EQUAL), UNPROVIDED);
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                aleph_assert_if_consistent(gaf, mt);
            }
        }
        return mt;
    }

    public static final SubLObject declare_ilp_learning_file() {
        declareFunction("aleph_fileset_name", "ALEPH-FILESET-NAME", 0, 0, false);
        declareFunction("aleph_assert_if_consistent", "ALEPH-ASSERT-IF-CONSISTENT", 2, 0, false);
        declareFunction("aleph_add_human_approved_gafs", "ALEPH-ADD-HUMAN-APPROVED-GAFS", 1, 0, false);
        declareFunction("aleph_add_google_verified_only_gafs", "ALEPH-ADD-GOOGLE-VERIFIED-ONLY-GAFS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_ilp_learning_file() {
        return NIL;
    }

    public static final SubLObject setup_ilp_learning_file() {
                return NIL;
    }



    private static final SubLSymbol $INCONSISTENT = makeKeyword("INCONSISTENT");

    static private final SubLSymbol $sym2$_SENTENCE = makeSymbol("?SENTENCE");

    static private final SubLList $list_alt3 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVALUATION"), list(constant_handles.reader_make_constant_shell(makeString("evaluationOutputSentences")), makeSymbol("?EVALUATION"), list(constant_handles.reader_make_constant_shell(makeString("sentenceIsTrue")), makeSymbol("?SENTENCE"))));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    static private final SubLList $list_alt5 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MT"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("genlMt")), makeSymbol("?MT"), constant_handles.reader_make_constant_shell(makeString("WebSearchSuggestedSentencesMt"))), list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?MT"), list(constant_handles.reader_make_constant_shell(makeString("suggestedSentence")), makeSymbol("?SENTENCE")))));

    static private final SubLList $list_alt6 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MT"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PRED"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVALUATION"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("genlMt")), makeSymbol("?MT"), constant_handles.reader_make_constant_shell(makeString("WebSearchSuggestedSentencesMt"))), list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?MT"), list(constant_handles.reader_make_constant_shell(makeString("evaluationOutputSentences")), makeSymbol("?EVALUATION"), list(makeSymbol("?PRED"), makeSymbol("?SENTENCE"))))))));

    static private final SubLList $list_alt7 = list(makeKeyword("MAX-TIME"), makeInteger(60));

    // // Initializers
    public void declareFunctions() {
        declare_ilp_learning_file();
    }

    public void initializeVariables() {
        init_ilp_learning_file();
    }

    public void runTopLevelForms() {
        setup_ilp_learning_file();
    }
}

