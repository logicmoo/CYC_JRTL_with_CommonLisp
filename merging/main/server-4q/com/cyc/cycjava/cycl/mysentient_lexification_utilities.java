/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      MYSENTIENT-LEXIFICATION-UTILITIES
 *  source file: /cyc/top/cycl/mysentient-lexification-utilities.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class mysentient_lexification_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private mysentient_lexification_utilities() {
    }

    public static final SubLFile me = new mysentient_lexification_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.mysentient_lexification_utilities";

    // // Definitions
    /**
     *
     *
     * @param NL-SENTENCE
     * 		stringp; the natural language sentence that we want to lexify
     * @param CYCL-SENTENCE
     * 		cycl-sentence-p; the CycL sentence that corresponds to NL-SENTENCE
     * @param FORCE
     * 		pph-force-p; either :INTERROGATIVE or :DECLARATIVE
     * @param LANGUAGE
     * 		stringp; the xml-string corresponding to the language this is for;
     * 		it will be used to determine which Mt the templates should be asserted in
     * @return stringp; the generation for NL-SENTENCE after the assertion of the new templates
     */
    public static final SubLObject lexify_sentence(SubLObject nl_sentence, SubLObject cycl_sentence, SubLObject force, SubLObject language) {
        if (language == UNPROVIDED) {
            language = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject generation_template = query_sentence_lexifier.construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss(cycl_sentence, nl_sentence, force);
                SubLObject parsing_template = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject parsing_mt = myse_parsing_mt_for_language(language);
                    SubLObject generation_mt = myse_generation_mt_for_language(language);
                    SubLObject new_generation = NIL;
                    mysentient_utilities.myse_assert_wff_now(generation_template, generation_mt);
                    mysentient_utilities.myse_assert_wff_now(parsing_template, parsing_mt);
                    new_generation = pph_main.generate_text_wXsentential_force(cycl_sentence, force, $ANY, generation_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return new_generation;
                }
            }
        }
    }

    public static final SubLObject myse_generation_mt_for_language(SubLObject language_string) {
        return $$BritishEnglishParaphraseMt;
    }

    public static final SubLObject myse_parsing_mt_for_language(SubLObject language_string) {
        return $$EnglishTemplateMt;
    }

    public static final SubLObject declare_mysentient_lexification_utilities_file() {
        declareFunction("lexify_sentence", "LEXIFY-SENTENCE", 3, 1, false);
        declareFunction("myse_generation_mt_for_language", "MYSE-GENERATION-MT-FOR-LANGUAGE", 1, 0, false);
        declareFunction("myse_parsing_mt_for_language", "MYSE-PARSING-MT-FOR-LANGUAGE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mysentient_lexification_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_mysentient_lexification_utilities_file() {
                access_macros.register_external_symbol(LEXIFY_SENTENCE);
        return NIL;
    }





    public static final SubLObject $$BritishEnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("BritishEnglishParaphraseMt"));

    public static final SubLObject $$EnglishTemplateMt = constant_handles.reader_make_constant_shell(makeString("EnglishTemplateMt"));

    // // Initializers
    public void declareFunctions() {
        declare_mysentient_lexification_utilities_file();
    }

    public void initializeVariables() {
        init_mysentient_lexification_utilities_file();
    }

    public void runTopLevelForms() {
        setup_mysentient_lexification_utilities_file();
    }
}

