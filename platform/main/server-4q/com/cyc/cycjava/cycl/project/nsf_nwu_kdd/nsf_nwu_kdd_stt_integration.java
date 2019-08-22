/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.project.nsf_nwu_kdd;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.glob;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.nl_api_datastructures;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      NSF-NWU-KDD-STT-INTEGRATION
 *  source file: /cyc/top/cycl/project/nsf-nwu-kdd/nsf-nwu-kdd-stt-integration.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class nsf_nwu_kdd_stt_integration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private nsf_nwu_kdd_stt_integration() {
    }

    public static final SubLFile me = new nsf_nwu_kdd_stt_integration();


    // // Definitions
    public static final SubLObject get_actively_tracked_stt_cases() {
        {
            SubLObject most_recent_case_pred = constants_high.find_constant($$$mostRecentCaseInStt);
            SubLObject stt_mt = constants_high.find_constant($$$SttMt);
            if ((NIL != constant_handles.valid_constant(most_recent_case_pred, T)) && (NIL != constant_handles.valid_constant(stt_mt, T))) {
                return ask_utilities.query_template($list_alt3, list($$and, $list_alt5, bq_cons(most_recent_case_pred, $list_alt6)), stt_mt, UNPROVIDED);
            }
        }
        return NIL;
    }



    /**
     * Establish a file for concept tagging. We actually read the file immediately
     * into memory for right now, but this need not be the case.
     */
    public static final SubLObject begin_concept_tagging_exernal_file(SubLObject filename, SubLObject skip_lines) {
        if (skip_lines == UNPROVIDED) {
            skip_lines = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_document = NIL;
                SubLObject iterator = NIL;
                SubLObject id = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt10$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(skip_lines); i = add(i, ONE_INTEGER)) {
                            read_line(s, NIL, $EOF, UNPROVIDED);
                        }
			v_document = document.new_document(s, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                iterator = concept_tagger.tag_concepts(v_document, UNPROVIDED);
                id = glob.glob_enter($document_glob$.getGlobalValue(), iterator);
                return id;
            }
        }
    }

    /**
     * Return T or NIL depending on whether the sentence iterator is finished or not.
     */
    public static final SubLObject has_concept_tagging_next_sentenceP(SubLObject iterator_id) {
        {
            SubLObject iterator = glob.glob_lookup($document_glob$.getGlobalValue(), iterator_id, UNPROVIDED);
            if (NIL != iteration.iterator_p(iterator)) {
                return makeBoolean(NIL == iteration.iteration_done(iterator));
            }
        }
        return NIL;
    }

    /**
     * Return the concept tagging of the current sentence as a list of CycL terms.
     */
    public static final SubLObject concept_tag_current_sentence(SubLObject iterator_id) {
        {
            SubLObject iterator = glob.glob_lookup($document_glob$.getGlobalValue(), iterator_id, UNPROVIDED);
            if (NIL != iteration.iterator_p(iterator)) {
                {
                    SubLObject sentence = iteration.iteration_next(iterator);
                    SubLObject concepts = concept_tagging_sentence_to_concepts(sentence);
                    return concepts;
                }
            }
        }
        return NIL;
    }

    /**
     * Drop the memory maintained by the iterator.
     */
    public static final SubLObject end_concept_tagging_external_file(SubLObject iterator_id) {
        {
            SubLObject iterator = glob.glob_lookup($document_glob$.getGlobalValue(), iterator_id, UNPROVIDED);
            if (NIL != iteration.iterator_p(iterator)) {
                glob.glob_remove($document_glob$.getGlobalValue(), iterator_id);
            }
        }
        return NIL;
    }

    /**
     * This method does what the other four do in one fell swoop.
     */
    public static final SubLObject compile_concept_tagging_for_external_file(SubLObject filename, SubLObject skip_lines) {
        if (skip_lines == UNPROVIDED) {
            skip_lines = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_document = NIL;
                SubLObject iterator = NIL;
                SubLObject taggings = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt10$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(skip_lines); i = add(i, ONE_INTEGER)) {
                            read_line(s, NIL, $EOF, UNPROVIDED);
                        }
			v_document = document.new_document(s, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                iterator = concept_tagger.tag_concepts(v_document, UNPROVIDED);
                {
                    SubLObject sentence_number = ONE_INTEGER;
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject sentence = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject concepts = concept_tagging_sentence_to_concepts(sentence);
                                    if (NIL != concepts) {
                                        taggings = cons(list(sentence_number, concepts), taggings);
                                    }
                                    sentence_number = add(sentence_number, ONE_INTEGER);
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                return nreverse(taggings);
            }
        }
    }

    public static final SubLObject compile_externalized_concept_tagging_for_external_file(SubLObject filename, SubLObject skip_lines) {
        if (skip_lines == UNPROVIDED) {
            skip_lines = ZERO_INTEGER;
        }
        {
            SubLObject taggings = compile_concept_tagging_for_external_file(filename, skip_lines);
            SubLObject externalized_taggings = NIL;
            SubLObject cdolist_list_var = taggings;
            SubLObject tagging = NIL;
            for (tagging = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tagging = cdolist_list_var.first()) {
                {
                    SubLObject datum = tagging;
                    SubLObject current = datum;
                    SubLObject sentence_number = NIL;
                    SubLObject concepts = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    sentence_number = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    concepts = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        externalized_taggings = cons(list(sentence_number, Mapping.mapcar(HL_EXTERNAL_ID_STRING, concepts)), externalized_taggings);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt17);
                    }
                }
            }
            return nreverse(externalized_taggings);
        }
    }

    public static final SubLObject concept_tagging_sentence_to_concepts(SubLObject sentence) {
        {
            SubLObject concepts = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject vector_var = document.sentence_yield(sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    SubLObject cdolist_list_var = document.word_interps(word);
                    SubLObject interp = NIL;
                    for (interp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , interp = cdolist_list_var.first()) {
                        set.set_add(nl_api_datastructures.get_nl_interp_cycl(interp), concepts);
                    }
                }
            }
            return set.set_element_list(concepts);
        }
    }

    public static final SubLObject declare_nsf_nwu_kdd_stt_integration_file() {
        declareFunction("get_actively_tracked_stt_cases", "GET-ACTIVELY-TRACKED-STT-CASES", 0, 0, false);
        declareFunction("begin_concept_tagging_exernal_file", "BEGIN-CONCEPT-TAGGING-EXERNAL-FILE", 1, 1, false);
        declareFunction("has_concept_tagging_next_sentenceP", "HAS-CONCEPT-TAGGING-NEXT-SENTENCE?", 1, 0, false);
        declareFunction("concept_tag_current_sentence", "CONCEPT-TAG-CURRENT-SENTENCE", 1, 0, false);
        declareFunction("end_concept_tagging_external_file", "END-CONCEPT-TAGGING-EXTERNAL-FILE", 1, 0, false);
        declareFunction("compile_concept_tagging_for_external_file", "COMPILE-CONCEPT-TAGGING-FOR-EXTERNAL-FILE", 1, 1, false);
        declareFunction("compile_externalized_concept_tagging_for_external_file", "COMPILE-EXTERNALIZED-CONCEPT-TAGGING-FOR-EXTERNAL-FILE", 1, 1, false);
        declareFunction("concept_tagging_sentence_to_concepts", "CONCEPT-TAGGING-SENTENCE-TO-CONCEPTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_nsf_nwu_kdd_stt_integration_file() {
        deflexical("*DOCUMENT-GLOB*", NIL != boundp($document_glob$) ? ((SubLObject) ($document_glob$.getGlobalValue())) : glob.new_glob(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_nsf_nwu_kdd_stt_integration_file() {
                access_macros.register_external_symbol(GET_ACTIVELY_TRACKED_STT_CASES);
        subl_macro_promotions.declare_defglobal($document_glob$);
        access_macros.register_external_symbol(BEGIN_CONCEPT_TAGGING_EXERNAL_FILE);
        access_macros.register_external_symbol($sym12$HAS_CONCEPT_TAGGING_NEXT_SENTENCE_);
        access_macros.register_external_symbol(CONCEPT_TAG_CURRENT_SENTENCE);
        access_macros.register_external_symbol(END_CONCEPT_TAGGING_EXTERNAL_FILE);
        access_macros.register_external_symbol(COMPILE_CONCEPT_TAGGING_FOR_EXTERNAL_FILE);
        access_macros.register_external_symbol(COMPILE_EXTERNALIZED_CONCEPT_TAGGING_FOR_EXTERNAL_FILE);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol GET_ACTIVELY_TRACKED_STT_CASES = makeSymbol("GET-ACTIVELY-TRACKED-STT-CASES");

    static private final SubLString $$$mostRecentCaseInStt = makeString("mostRecentCaseInStt");

    static private final SubLString $$$SttMt = makeString("SttMt");

    static private final SubLList $list_alt3 = list(makeSymbol("?EVENT"), makeSymbol("?CASE-MT"), makeSymbol("?TOPIC"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt5 = list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?CASE-MT"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell(makeString("KidnappingSomeone"))));

    static private final SubLList $list_alt6 = list(makeSymbol("??TYPE"), makeSymbol("?TOPIC"), makeSymbol("?CASE-MT"));

    public static final SubLSymbol $document_glob$ = makeSymbol("*DOCUMENT-GLOB*");

    private static final SubLSymbol BEGIN_CONCEPT_TAGGING_EXERNAL_FILE = makeSymbol("BEGIN-CONCEPT-TAGGING-EXERNAL-FILE");



    static private final SubLString $str_alt10$Unable_to_open__S = makeString("Unable to open ~S");



    static private final SubLSymbol $sym12$HAS_CONCEPT_TAGGING_NEXT_SENTENCE_ = makeSymbol("HAS-CONCEPT-TAGGING-NEXT-SENTENCE?");

    private static final SubLSymbol CONCEPT_TAG_CURRENT_SENTENCE = makeSymbol("CONCEPT-TAG-CURRENT-SENTENCE");

    private static final SubLSymbol END_CONCEPT_TAGGING_EXTERNAL_FILE = makeSymbol("END-CONCEPT-TAGGING-EXTERNAL-FILE");

    private static final SubLSymbol COMPILE_CONCEPT_TAGGING_FOR_EXTERNAL_FILE = makeSymbol("COMPILE-CONCEPT-TAGGING-FOR-EXTERNAL-FILE");

    private static final SubLSymbol COMPILE_EXTERNALIZED_CONCEPT_TAGGING_FOR_EXTERNAL_FILE = makeSymbol("COMPILE-EXTERNALIZED-CONCEPT-TAGGING-FOR-EXTERNAL-FILE");

    static private final SubLList $list_alt17 = list(makeSymbol("SENTENCE-NUMBER"), makeSymbol("CONCEPTS"));

    private static final SubLSymbol HL_EXTERNAL_ID_STRING = makeSymbol("HL-EXTERNAL-ID-STRING");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_nsf_nwu_kdd_stt_integration_file();
    }

    @Override
    public void initializeVariables() {
        init_nsf_nwu_kdd_stt_integration_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nsf_nwu_kdd_stt_integration_file();
    }
}

