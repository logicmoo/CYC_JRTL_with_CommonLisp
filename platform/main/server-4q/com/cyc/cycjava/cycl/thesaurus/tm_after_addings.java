/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-AFTER-ADDINGS
 *  source file: /cyc/top/cycl/thesaurus/tm-after-addings.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_after_addings extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_after_addings() {
    }

    public static final SubLFile me = new tm_after_addings();


    // // Definitions
    public static final SubLObject add_thesaurus_vocab(SubLObject argument, SubLObject assertion) {
        {
            SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            SubLObject pcase_var = predicate;
            if (pcase_var.eql($$preferredTerm) || pcase_var.eql($$useFor)) {
            } else
                if (pcase_var.eql($$tmStoplistWord)) {
                    tm_datastructures.tm_add_stop_word(assertion);
                } else
                    if (pcase_var.eql($$tmSymbol) || pcase_var.eql($$tmInverseSymbol)) {
                        tm_datastructures.add_to_tm_abbreviation_hash(assertion);
                        if (NIL != tm_internals.thesaurus_predicateP(arg1)) {
                            tm_datastructures.init_tm_relation_predicate_map_from_kb();
                            tm_io.init_pred_symbol_order_from_kb();
                        }
                    } else
                        if (pcase_var.eql($$tmLexicalPredicate)) {
                            tm_lexical_index.add_predicate_to_lexical_indices(arg1);
                        } else
                            if (pcase_var.eql($$tmThesaurus)) {
                                tm_lexical_index.add_thesaurus_to_lexical_indices(arg1);
                            } else
                                if (pcase_var.eql($$broaderTerm)) {
                                    tm_internals.tm_possibly_demote_top(assertion);
                                } else {
                                    Errors.error($str_alt8$Unknown_predicate__S_given_to__S_, predicate, ADD_THESAURUS_VOCAB);
                                }





        }
        return NIL;
    }

    public static final SubLObject remove_thesaurus_vocab(SubLObject argument, SubLObject assertion) {
        if ((NIL != tm_datastructures.tm_init_file_loadedP()) || (NIL != tm_datastructures.tm_init_file_loadingP())) {
            {
                SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                SubLObject predicate = assertions_high.gaf_arg0(assertion);
                SubLObject pcase_var = predicate;
                if (pcase_var.eql($$preferredTerm) || pcase_var.eql($$useFor)) {
                } else
                    if (pcase_var.eql($$tmStoplistWord)) {
                        tm_datastructures.tm_remove_stop_word(assertion);
                    } else
                        if (pcase_var.eql($$tmSymbol) || pcase_var.eql($$tmInverseSymbol)) {
                            tm_datastructures.remove_from_tm_abbreviation_hash(assertion);
                            if (NIL != tm_internals.thesaurus_predicateP(arg1)) {
                                tm_datastructures.init_tm_relation_predicate_map_from_kb();
                            }
                        } else
                            if (pcase_var.eql($$tmLexicalPredicate)) {
                                tm_lexical_index.remove_predicate_from_lexical_indices(arg1);
                            } else
                                if (pcase_var.eql($$tmThesaurus)) {
                                    tm_lexical_index.remove_thesaurus_from_lexical_indices(arg1);
                                } else {
                                    Errors.error($str_alt8$Unknown_predicate__S_given_to__S_, predicate, REMOVE_THESAURUS_VOCAB);
                                }




            }
        }
        return NIL;
    }

    public static final SubLObject add_lexpred(SubLObject argument, SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            if (NIL != tm_internals.tm_lexical_predicateP(predicate)) {
                tm_datastructures.tm_add_lexical_entry(assertion);
            }
            return NIL;
        }
    }

    public static final SubLObject remove_lexpred(SubLObject argument, SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            if (NIL != tm_internals.tm_lexical_predicateP(predicate)) {
                tm_datastructures.tm_remove_lexical_entry(assertion);
            }
            return NIL;
        }
    }

    public static final SubLObject add_name_string(SubLObject argument, SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            if (predicate == $$tmNameString) {
                tm_datastructures.add_to_tm_name_string_hash(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_name_string(SubLObject argument, SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            if (predicate == $$tmNameString) {
                tm_datastructures.remove_from_tm_name_string_hash(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject add_tm_http_user_id(SubLObject argument, SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            if (predicate == $$tmHttpUserID) {
                tm_datastructures.tm_add_to_user_id_hash(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_tm_http_user_id(SubLObject argument, SubLObject assertion) {
        {
            SubLObject predicate = assertions_high.gaf_arg0(assertion);
            if (predicate == $$tmHttpUserID) {
                tm_datastructures.tm_remove_from_user_id_hash(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_tm_after_addings_file() {
        declareFunction("add_thesaurus_vocab", "ADD-THESAURUS-VOCAB", 2, 0, false);
        declareFunction("remove_thesaurus_vocab", "REMOVE-THESAURUS-VOCAB", 2, 0, false);
        declareFunction("add_lexpred", "ADD-LEXPRED", 2, 0, false);
        declareFunction("remove_lexpred", "REMOVE-LEXPRED", 2, 0, false);
        declareFunction("add_name_string", "ADD-NAME-STRING", 2, 0, false);
        declareFunction("remove_name_string", "REMOVE-NAME-STRING", 2, 0, false);
        declareFunction("add_tm_http_user_id", "ADD-TM-HTTP-USER-ID", 2, 0, false);
        declareFunction("remove_tm_http_user_id", "REMOVE-TM-HTTP-USER-ID", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_after_addings_file() {
        return NIL;
    }

    public static final SubLObject setup_tm_after_addings_file() {
                utilities_macros.register_kb_function(ADD_THESAURUS_VOCAB);
        utilities_macros.register_kb_function(REMOVE_THESAURUS_VOCAB);
        utilities_macros.register_kb_function(ADD_LEXPRED);
        utilities_macros.register_kb_function(REMOVE_LEXPRED);
        utilities_macros.register_kb_function(ADD_NAME_STRING);
        utilities_macros.register_kb_function(REMOVE_NAME_STRING);
        utilities_macros.register_kb_function(ADD_TM_HTTP_USER_ID);
        utilities_macros.register_kb_function(REMOVE_TM_HTTP_USER_ID);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    public static final SubLObject $$tmStoplistWord = constant_handles.reader_make_constant_shell(makeString("tmStoplistWord"));

    public static final SubLObject $$tmSymbol = constant_handles.reader_make_constant_shell(makeString("tmSymbol"));

    public static final SubLObject $$tmInverseSymbol = constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol"));

    public static final SubLObject $$tmLexicalPredicate = constant_handles.reader_make_constant_shell(makeString("tmLexicalPredicate"));

    public static final SubLObject $$tmThesaurus = constant_handles.reader_make_constant_shell(makeString("tmThesaurus"));

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));

    static private final SubLString $str_alt8$Unknown_predicate__S_given_to__S_ = makeString("Unknown predicate ~S given to ~S.");

    private static final SubLSymbol ADD_THESAURUS_VOCAB = makeSymbol("ADD-THESAURUS-VOCAB");

    private static final SubLSymbol REMOVE_THESAURUS_VOCAB = makeSymbol("REMOVE-THESAURUS-VOCAB");

    private static final SubLSymbol ADD_LEXPRED = makeSymbol("ADD-LEXPRED");

    private static final SubLSymbol REMOVE_LEXPRED = makeSymbol("REMOVE-LEXPRED");

    public static final SubLObject $$tmNameString = constant_handles.reader_make_constant_shell(makeString("tmNameString"));

    private static final SubLSymbol ADD_NAME_STRING = makeSymbol("ADD-NAME-STRING");

    private static final SubLSymbol REMOVE_NAME_STRING = makeSymbol("REMOVE-NAME-STRING");

    public static final SubLObject $$tmHttpUserID = constant_handles.reader_make_constant_shell(makeString("tmHttpUserID"));

    private static final SubLSymbol ADD_TM_HTTP_USER_ID = makeSymbol("ADD-TM-HTTP-USER-ID");

    private static final SubLSymbol REMOVE_TM_HTTP_USER_ID = makeSymbol("REMOVE-TM-HTTP-USER-ID");

    // // Initializers
    public void declareFunctions() {
        declare_tm_after_addings_file();
    }

    public void initializeVariables() {
        init_tm_after_addings_file();
    }

    public void runTopLevelForms() {
        setup_tm_after_addings_file();
    }
}

