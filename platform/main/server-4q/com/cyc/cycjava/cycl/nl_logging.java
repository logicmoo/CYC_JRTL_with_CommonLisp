/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      NL-LOGGING
 *  source file: /cyc/top/cycl/nl-logging.lisp
 *  created:     2019/07/03 17:37:58
 */
public final class nl_logging extends SubLTranslatedFile implements V02 {
    // // Constructor
    private nl_logging() {
    }

    public static final SubLFile me = new nl_logging();


    // // Definitions
    /**
     * the directory where to store the logs
     */
    // defparameter
    private static final SubLSymbol $uia_logging_directory$ = makeSymbol("*UIA-LOGGING-DIRECTORY*");

    /**
     * the default reason of why a parse failed
     */
    // defparameter
    private static final SubLSymbol $default_failure_reason$ = makeSymbol("*DEFAULT-FAILURE-REASON*");

    /**
     * The person to notify if a problem arises
     */
    // defparameter
    private static final SubLSymbol $logging_admin$ = makeSymbol("*LOGGING-ADMIN*");

    // defparameter
    private static final SubLSymbol $uia_logging_dtd$ = makeSymbol("*UIA-LOGGING-DTD*");

    /**
     * Logs the specified parsing event
     */
    public static final SubLObject log_parsing_event(SubLObject utterance, SubLObject parses, SubLObject approved, SubLObject disapproved, SubLObject added, SubLObject discarded, SubLObject originator_case_id, SubLObject test_case_project, SubLObject test_case_priority, SubLObject parser_function, SubLObject template_category, SubLObject lexical_mt, SubLObject domain_mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = rkf_assisted_reader.$rkf_user$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(utterance, STRINGP);
            SubLTrampolineFile.checkType(parses, LISTP);
            SubLTrampolineFile.checkType(approved, LISTP);
            SubLTrampolineFile.checkType(disapproved, LISTP);
            SubLTrampolineFile.checkType(added, LISTP);
            SubLTrampolineFile.checkType(discarded, LISTP);
            lexical_mt = min_genl_mt_non_ephemeral(lexical_mt);
            domain_mt = min_genl_mt_non_ephemeral(domain_mt);
            {
                SubLObject test_case_id = Guids.guid_to_string(Guids.new_guid());
                SubLObject io_problemP = NIL;
                SubLObject cyclist_name = constants_high.constant_name(NIL != cyclist ? ((SubLObject) (cyclist)) : operation_communication.the_cyclist());
                SubLObject logging_path = new_logging_path(test_case_id, cyclist_name);
                SubLObject test_case_attrs = list(new SubLObject[]{ $$$kbState, control_vars.kb_loaded(), $$$patchLevel, system_info.cyc_revision_string(), $$$testCaseId, test_case_id, $$$originatorCaseId, originator_case_id, $$$testCaseCreator, cyclist_name, $$$testCaseProject, test_case_project, $$$testCasePriority, test_case_priority, $$$parserFunction, parser_function, $$$templateCategory, template_category, $$$lexicalMt, lexical_mt, $$$domainMt, domain_mt });
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream = compatibility.open_text(logging_path, $OUTPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt19$Unable_to_open__S, logging_path);
                                        }
                                        {
                                            SubLObject _prev_bind_0_2 = xml_vars.$xml_stream$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_stream$.bind(stream, thread);
                                                xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                xml_utilities.xml_markup($uia_logging_dtd$.getDynamicValue(thread));
                                                {
                                                    SubLObject name_var = $$$RTPTestCase;
                                                    xml_utilities.xml_start_tag_internal(name_var, test_case_attrs, NIL);
                                                    {
                                                        SubLObject name_var_3 = $$$textInput;
                                                        xml_utilities.xml_start_tag_internal(name_var_3, NIL, NIL);
                                                        xml_utilities.xml_markup(utterance);
                                                        xml_utilities.xml_end_tag_internal(name_var_3);
                                                    }
                                                    {
                                                        SubLObject name_var_4 = $$$parsesToEvaluate;
                                                        xml_utilities.xml_start_tag_internal(name_var_4, NIL, NIL);
                                                        parses_to_xml(unpack_parses(parses));
                                                        xml_utilities.xml_end_tag_internal(name_var_4);
                                                    }
                                                    {
                                                        SubLObject name_var_5 = $$$approvedParses;
                                                        xml_utilities.xml_start_tag_internal(name_var_5, NIL, NIL);
                                                        parses_to_xml(unpack_parses(approved));
                                                        xml_utilities.xml_end_tag_internal(name_var_5);
                                                    }
                                                    {
                                                        SubLObject name_var_6 = $$$disapprovedParses;
                                                        xml_utilities.xml_start_tag_internal(name_var_6, NIL, NIL);
                                                        disapproved_parses_to_xml(unpack_parses(disapproved));
                                                        xml_utilities.xml_end_tag_internal(name_var_6);
                                                    }
                                                    {
                                                        SubLObject name_var_7 = $$$addedParses;
                                                        xml_utilities.xml_start_tag_internal(name_var_7, NIL, NIL);
                                                        parses_to_xml(unpack_parses(added));
                                                        xml_utilities.xml_end_tag_internal(name_var_7);
                                                    }
                                                    {
                                                        SubLObject name_var_8 = $$$discardedParses;
                                                        xml_utilities.xml_start_tag_internal(name_var_8, NIL, NIL);
                                                        parses_to_xml(unpack_parses(discarded));
                                                        xml_utilities.xml_end_tag_internal(name_var_8);
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var);
                                                }
                                            } finally {
                                                xml_vars.$xml_stream$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream.isStream()) {
                                                    close(stream, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    io_problemP = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                if (NIL != io_problemP) {
                    return handle_io_problem(io_problemP);
                } else {
                    return logging_path;
                }
            }
        }
    }

    public static final SubLObject handle_io_problem(SubLObject message) {
        Errors.warn(message);
        return NIL;
    }

    /**
     * Writes a list of unpacked parses to XML
     */
    public static final SubLObject parses_to_xml(SubLObject unpacked_parses) {
        SubLTrampolineFile.checkType(unpacked_parses, LISTP);
        {
            SubLObject cdolist_list_var = unpacked_parses;
            SubLObject unpacked = NIL;
            for (unpacked = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unpacked = cdolist_list_var.first()) {
                {
                    SubLObject name_var = $$$RTPParse;
                    xml_utilities.xml_start_tag_internal(name_var, list($$$rtpSpan, unpacked_span(unpacked), $$$parseId, unpacked_parse_id(unpacked)), NIL);
                    xml_utilities.xml_markup(write_to_string(unpacked_cycl(unpacked), EMPTY_SUBL_OBJECT_ARRAY));
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
        }
        return NIL;
    }

    /**
     * Writes a list of disapproved unpacked parses to XML
     */
    public static final SubLObject disapproved_parses_to_xml(SubLObject unpacked_parses) {
        SubLTrampolineFile.checkType(unpacked_parses, LISTP);
        {
            SubLObject cdolist_list_var = unpacked_parses;
            SubLObject unpacked = NIL;
            for (unpacked = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unpacked = cdolist_list_var.first()) {
                {
                    SubLObject name_var = $$$RTPParse;
                    xml_utilities.xml_start_tag_internal(name_var, list($$$rtpSpan, unpacked_span(unpacked), $$$parseId, unpacked_parse_id(unpacked), $$$failureReason, unpacked_failure_reason(unpacked)), NIL);
                    xml_utilities.xml_markup(write_to_string(unpacked_cycl(unpacked), EMPTY_SUBL_OBJECT_ARRAY));
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
        }
        return NIL;
    }

    /**
     * Expands a list of parses, as returned by the RTP, into a list of 2-element lists,
     * where the first element of each such list is a span and the second one is a single
     * cycl formula
     */
    public static final SubLObject unpack_parses(SubLObject parses) {
        {
            SubLObject unpacked = NIL;
            SubLObject sections = rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
            SubLObject cycls = NIL;
            while (NIL == rtp_iterators.itp_result_iterator_doneP(sections)) {
                cycls = rtp_iterators.itp_result_iterator_curr(sections);
                while (NIL == rtp_iterators.itp_section_iterator_doneP(cycls)) {
                    unpacked = cons(list(rtp_iterators.itp_section_iterator_curr_span(cycls), rtp_iterators.itp_section_iterator_curr_cycl(cycls)), unpacked);
                    rtp_iterators.itp_section_iterator_next(cycls);
                } 
                rtp_iterators.itp_result_iterator_next(sections);
            } 
            return unpacked;
        }
    }

    /**
     * Generates a new file path from GUID
     */
    public static final SubLObject new_logging_path(SubLObject guid, SubLObject cyclist_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cconcatenate($uia_logging_directory$.getDynamicValue(thread), new SubLObject[]{ cyclist_name, $str_alt31$_, guid, $str_alt32$_xml });
        }
    }

    public static final SubLObject unpacked_span(SubLObject unpacked) {
        return unpacked.first();
    }

    public static final SubLObject unpacked_cycl(SubLObject unpacked) {
        return second(unpacked);
    }

    public static final SubLObject unpacked_parse_id(SubLObject unpacked) {
        return Guids.guid_to_string(Guids.new_guid());
    }

    public static final SubLObject unpacked_failure_reason(SubLObject unpacked) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $default_failure_reason$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @param MT
     * 		Microtheory
     * @return microtheory; (one of) the min-genl-mt(s) of MT that is not an ephemeral term
     * @unknown we only want one, so just pick the first one
     */
    public static final SubLObject min_genl_mt_non_ephemeral(SubLObject mt) {
        return min_genl_mts_non_ephemeral(mt).first();
    }

    /**
     *
     *
     * @param MT
     * 		microtheory
     * @return list; the list of all the non-ephemeral-min-genl-mts of MT
     */
    public static final SubLObject min_genl_mts_non_ephemeral(SubLObject mt) {
        {
            SubLObject result = NIL;
            if (NIL != kb_cleanup.ephemeral_termP(mt)) {
                {
                    SubLObject cdolist_list_var = genl_mts.min_genl_mts(mt, UNPROVIDED, UNPROVIDED);
                    SubLObject genl_mt = NIL;
                    for (genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_mt = cdolist_list_var.first()) {
                        if (NIL != kb_cleanup.ephemeral_termP(genl_mt)) {
                            nconc(result, min_genl_mts_non_ephemeral(genl_mt));
                        } else {
                            result = cons(genl_mt, result);
                        }
                    }
                }
            } else {
                result = list(mt);
            }
            return result;
        }
    }

    public static final SubLObject new_junk_parses() {
        return $list_alt33;
    }

    public static final SubLObject test_uia_logging() {
        return log_parsing_event($$$dogs_are_green, unpack_parses(new_junk_parses()), unpack_parses(new_junk_parses()), NIL, unpack_parses(new_junk_parses()), NIL, TWO_INTEGER, $$$RKF, THREE_INTEGER, $str_alt36$rtp_parse, $$STemplateCategory, $$EnglishMt, $$EnglishMt, UNPROVIDED);
    }

    public static final SubLObject declare_nl_logging_file() {
        declareFunction("log_parsing_event", "LOG-PARSING-EVENT", 13, 1, false);
        declareFunction("handle_io_problem", "HANDLE-IO-PROBLEM", 1, 0, false);
        declareFunction("parses_to_xml", "PARSES-TO-XML", 1, 0, false);
        declareFunction("disapproved_parses_to_xml", "DISAPPROVED-PARSES-TO-XML", 1, 0, false);
        declareFunction("unpack_parses", "UNPACK-PARSES", 1, 0, false);
        declareFunction("new_logging_path", "NEW-LOGGING-PATH", 2, 0, false);
        declareFunction("unpacked_span", "UNPACKED-SPAN", 1, 0, false);
        declareFunction("unpacked_cycl", "UNPACKED-CYCL", 1, 0, false);
        declareFunction("unpacked_parse_id", "UNPACKED-PARSE-ID", 1, 0, false);
        declareFunction("unpacked_failure_reason", "UNPACKED-FAILURE-REASON", 1, 0, false);
        declareFunction("min_genl_mt_non_ephemeral", "MIN-GENL-MT-NON-EPHEMERAL", 1, 0, false);
        declareFunction("min_genl_mts_non_ephemeral", "MIN-GENL-MTS-NON-EPHEMERAL", 1, 0, false);
        declareFunction("new_junk_parses", "NEW-JUNK-PARSES", 0, 0, false);
        declareFunction("test_uia_logging", "TEST-UIA-LOGGING", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_nl_logging_file() {
        defparameter("*UIA-LOGGING-DIRECTORY*", $str_alt0$_cyc_projects_rkf_testing_parsing);
        defparameter("*DEFAULT-FAILURE-REASON*", $$$the_user_told_me_so);
        defparameter("*LOGGING-ADMIN*", $str_alt2$aldag_cyc_com);
        defparameter("*UIA-LOGGING-DTD*", $str_alt3$__DOCTYPE_RTPTestCase______ELEMEN);
        return NIL;
    }

    public static final SubLObject setup_nl_logging_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_cyc_projects_rkf_testing_parsing = makeString("/cyc/projects/rkf/testing/parsing/automated-pipeline/parsed-input-docs/uia/");

    static private final SubLString $$$the_user_told_me_so = makeString("the user told me so");

    static private final SubLString $str_alt2$aldag_cyc_com = makeString("aldag@cyc.com");

    static private final SubLString $str_alt3$__DOCTYPE_RTPTestCase______ELEMEN = makeString("<!DOCTYPE RTPTestCase [\n <!ELEMENT RTPTestCase (textInput, parsesToEvaluate, approvedParses, disapprovedParses, addedParses, discardedParses)>\n <!ATTLIST RTPTestCase kbState CDATA #REQUIRED\n                       patchLevel CDATA #REQUIRED\n                       testCaseId CDATA #REQUIRED\n                       originatorCaseId CDATA #REQUIRED\n                       testCaseCreator CDATA #REQUIRED\n                       testCaseProject CDATA #REQUIRED\n                       testCasePriority CDATA #REQUIRED\n                       parserFunction CDATA #REQUIRED\n                       templateCategory CDATA #REQUIRED\n                       lexicalMt CDATA #REQUIRED\n                       domainMt CDATA #REQUIRED>\n <!ELEMENT textInput (#PCDATA)>\n <!ELEMENT parsesToEvaluate (RTPParse)>\n <!ELEMENT approvedParses (RTPParse)>\n <!ELEMENT disapprovedParses (RTPFailedParse)>\n <!ELEMENT addedParses (RTPParse)>\n <!ELEMENT discardedParses (RTPParse)>\n <!ELEMENT RTPParse (#PCDATA)>\n <!ATTLIST RTPParse rtpSpan CDATA #REQUIRED\n                    parseId CDATA #REQUIRED>\n <!ELEMENT RTPFailedParse (#PCDATA)>\n <!ATTLIST RTPFailedParse rtpSpan CDATA #REQUIRED\n                          parseId CDATA #REQUIRED\n                          failureReason CDATA #IMPLIED>\n]>\n");





    static private final SubLString $$$kbState = makeString("kbState");

    static private final SubLString $$$patchLevel = makeString("patchLevel");

    static private final SubLString $$$testCaseId = makeString("testCaseId");

    static private final SubLString $$$originatorCaseId = makeString("originatorCaseId");

    static private final SubLString $$$testCaseCreator = makeString("testCaseCreator");

    static private final SubLString $$$testCaseProject = makeString("testCaseProject");

    static private final SubLString $$$testCasePriority = makeString("testCasePriority");

    static private final SubLString $$$parserFunction = makeString("parserFunction");

    static private final SubLString $$$templateCategory = makeString("templateCategory");

    static private final SubLString $$$lexicalMt = makeString("lexicalMt");

    static private final SubLString $$$domainMt = makeString("domainMt");





    static private final SubLString $str_alt19$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$RTPTestCase = makeString("RTPTestCase");

    static private final SubLString $$$textInput = makeString("textInput");

    static private final SubLString $$$parsesToEvaluate = makeString("parsesToEvaluate");

    static private final SubLString $$$approvedParses = makeString("approvedParses");

    static private final SubLString $$$disapprovedParses = makeString("disapprovedParses");

    static private final SubLString $$$addedParses = makeString("addedParses");

    static private final SubLString $$$discardedParses = makeString("discardedParses");

    static private final SubLString $$$RTPParse = makeString("RTPParse");

    static private final SubLString $$$rtpSpan = makeString("rtpSpan");

    static private final SubLString $$$parseId = makeString("parseId");

    static private final SubLString $$$failureReason = makeString("failureReason");

    static private final SubLString $str_alt31$_ = makeString("-");

    static private final SubLString $str_alt32$_xml = makeString(".xml");

    static private final SubLList $list_alt33 = list(list(list(ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER), list(list(constant_handles.reader_make_constant_shell(makeString("is-Underspecified")), list(constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing")), makeSymbol("DOGS"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), ZERO_INTEGER), constant_handles.reader_make_constant_shell(makeString("NPTemplate")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing"))))), list(constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing")), makeSymbol("GREEN"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), TWO_INTEGER), constant_handles.reader_make_constant_shell(makeString("AdjPTemplate-Predicative")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing")))))), list(constant_handles.reader_make_constant_shell(makeString("is-Underspecified")), list(constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing")), makeSymbol("DOGS"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), ZERO_INTEGER), constant_handles.reader_make_constant_shell(makeString("NPTemplate")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing"))))), list(constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing")), makeSymbol("GREEN"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), TWO_INTEGER), constant_handles.reader_make_constant_shell(makeString("NPTemplate")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing")))))))), list(list(ONE_INTEGER, TWO_INTEGER), list(list(constant_handles.reader_make_constant_shell(makeString("is-Underspecified")), constant_handles.reader_make_constant_shell(makeString("TheSentenceSubject")), list(constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing")), makeSymbol("GREEN"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), TWO_INTEGER), constant_handles.reader_make_constant_shell(makeString("AdjPTemplate-Predicative")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing")))))), list(constant_handles.reader_make_constant_shell(makeString("is-Underspecified")), constant_handles.reader_make_constant_shell(makeString("TheSentenceSubject")), list(constant_handles.reader_make_constant_shell(makeString("TheResultOfParsing")), makeSymbol("GREEN"), list(constant_handles.reader_make_constant_shell(makeString("TheList")), TWO_INTEGER), constant_handles.reader_make_constant_shell(makeString("NPTemplate")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thing")))))))), list(list(ZERO_INTEGER), list(list(constant_handles.reader_make_constant_shell(makeString("NLQuantFn-3")), constant_handles.reader_make_constant_shell(makeString("BareForm-NLAttr")), list(constant_handles.reader_make_constant_shell(makeString("NLNumberFn")), constant_handles.reader_make_constant_shell(makeString("Plural-NLAttr")), constant_handles.reader_make_constant_shell(makeString("HotDog"))), ZERO_INTEGER), list(constant_handles.reader_make_constant_shell(makeString("NLQuantFn-3")), constant_handles.reader_make_constant_shell(makeString("BareForm-NLAttr")), list(constant_handles.reader_make_constant_shell(makeString("NLNumberFn")), constant_handles.reader_make_constant_shell(makeString("Plural-NLAttr")), constant_handles.reader_make_constant_shell(makeString("Dog"))), ZERO_INTEGER))));

    static private final SubLString $$$dogs_are_green = makeString("dogs are green");

    static private final SubLString $$$RKF = makeString("RKF");

    static private final SubLString $str_alt36$rtp_parse = makeString("rtp-parse");

    public static final SubLObject $$STemplateCategory = constant_handles.reader_make_constant_shell(makeString("STemplateCategory"));

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

    // // Initializers
    public void declareFunctions() {
        declare_nl_logging_file();
    }

    public void initializeVariables() {
        init_nl_logging_file();
    }

    public void runTopLevelForms() {
        setup_nl_logging_file();
    }
}

