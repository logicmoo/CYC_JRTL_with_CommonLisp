/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.cycjava.cycl.rtp.rtp_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      RTP-PIPELINE-INTEGRATION
 *  source file: /cyc/top/cycl/rtp-pipeline-integration.lisp
 *  created:     2019/07/03 17:38:39
 */
public final class rtp_pipeline_integration extends SubLTranslatedFile implements V02 {
    // // Constructor
    private rtp_pipeline_integration() {
    }

    public static final SubLFile me = new rtp_pipeline_integration();


    // // Definitions
    // deflexical
    private static final SubLSymbol $do_not_store_rtp_parses_in_pipeline$ = makeSymbol("*DO-NOT-STORE-RTP-PARSES-IN-PIPELINE*");

    /**
     *
     *
     * @param SENTENCE-STRING
     * 		string; the sentence whose parse is being stored
     * @param PARSE
     * 		list; a parse structure, in the return format used by the recursive template parser
     * @param PARSING-MT
     * 		microtheory
     * @param CATEGORY
     * 		instance of #$ParsingTemplateCategory
     * @return integer; the output_id of the parse just stored
     */
    public static final SubLObject store_rtp_parses_in_pipeline(SubLObject sentence_string, SubLObject parse, SubLObject parsing_mt, SubLObject category, SubLObject v_parser) {
        if (v_parser == UNPROVIDED) {
            v_parser = $$CycRecursiveTemplateParser;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL == $do_not_store_rtp_parses_in_pipeline$.getGlobalValue()) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        try {
                                            new_pipeline_connection();
                                            {
                                                SubLObject port = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                                                SubLObject host = Environment.get_machine_name(UNPROVIDED);
                                                SubLObject cyclist = (NIL != constant_handles.constant_p(api_control_vars.$the_cyclist$.getDynamicValue(thread))) ? ((SubLObject) (api_control_vars.$the_cyclist$.getDynamicValue(thread))) : $user_cyclist$.getDynamicValue(thread);
                                                SubLObject session_id = store_session(host, port, cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject tokenized_sentence = rkf_concept_harvester.rkf_ch_string_tokenize(sentence_string);
                                                SubLObject bunged_sentence_string = string_utilities.bunge(tokenized_sentence, UNPROVIDED);
                                                SubLObject input_id = get_input_id(bunged_sentence_string);
                                                SubLObject config_id = get_config_id(list($PARSING_MT, parsing_mt, $CATEGORY, category, $PARSER, v_parser));
                                                SubLObject parser_output_string = convert_parser_output_to_strings(parse, tokenized_sentence);
                                                result = store_output_with_parts(parser_output_string, input_id, config_id, session_id);
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close_pipeline_connection();
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
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
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject convert_parser_output_to_strings(SubLObject parse, SubLObject tokenized_sentence) {
        {
            SubLObject constituent_iterator = rtp_iterators.new_itp_result_iterator(parse, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            while (NIL == rtp_iterators.itp_result_iterator_doneP(constituent_iterator)) {
                {
                    SubLObject parse_iterator = rtp_iterators.itp_result_iterator_curr(constituent_iterator);
                    while (NIL == rtp_iterators.itp_section_iterator_doneP(parse_iterator)) {
                        {
                            SubLObject span = rtp_iterators.itp_section_iterator_curr_span(parse_iterator);
                            SubLObject my_string = string_utilities.bunge(subseq(tokenized_sentence, span.first(), add(ONE_INTEGER, last(span, UNPROVIDED).first())), UNPROVIDED);
                            result = cons(list(my_string, list(db_string(rtp_iterators.itp_section_iterator_curr_cycl(parse_iterator)), rtp_support_strings(rtp_iterators.itp_section_iterator_curr_assertion(parse_iterator)))), result);
                            rtp_iterators.itp_section_iterator_next(parse_iterator);
                        }
                    } 
                }
                rtp_iterators.itp_result_iterator_next(constituent_iterator);
            } 
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @param SUPPORT
     * 		list; a SubL list that represents a parse support; see @xref BUILD-RETURN-FORMAT for
     * 		format information.
     * @return list; a list of strings, mirroring the structure of SUPPORT, each of which is suitable for
    entry into a database
     */
    public static final SubLObject rtp_support_strings(SubLObject support) {
        if (support.isAtom()) {
            return list(db_string(support));
        } else
            if (support.isList()) {
                {
                    SubLObject result = NIL;
                    SubLObject cdolist_list_var = support;
                    SubLObject v_assert = NIL;
                    for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(v_assert)) {
                            result = cons(db_string(assertions_high.assertion_formula(v_assert)), result);
                        } else {
                            result = cons(db_string(v_assert), result);
                        }
                    }
                    return result;
                }
            }

        return NIL;
    }

    /**
     *
     *
     * @param CYCL
     * 		cycl-expression
     * @return string; a string representation of CycL, suitable for storing in a database (includes substituting
    single-quotes for escaped double-quotes
     */
    public static final SubLObject db_string(SubLObject cycl) {
        {
            SubLObject string = prin1_to_string(cycl);
            SubLObject result = string_utilities.string_subst($str_alt6$_, $str_alt7$_, string, UNPROVIDED);
            return result;
        }
    }

    /**
     *
     *
     * @param CONFIG-ID;
     * 		INTEGER -- the config-id for the parse
     * @unknown FORT -- the category  associated with CONFIG-ID
     * @unknown nancy
     */
    public static final SubLObject get_category_for_config_id(SubLObject config_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject category = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt8$select_param_name_from__a_where_c, new SubLObject[]{ $pipeline_params_table$.getGlobalValue(), config_id, $param_type_id_category$.getGlobalValue() }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    Errors.warn($str_alt9$There_is_no_category_with_that_co);
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    category = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    category = ke_utilities.fort_from_string(category);
                }
                return category;
            }
        }
    }

    /**
     *
     *
     * @param CONFIG-ID;
     * 		INTEGER -- the config-id for the parse
     * @unknown FORT -- the parsing mt associated with CONFIG-ID
     * @unknown nancy
     */
    public static final SubLObject get_parsing_mt_for_config_id(SubLObject config_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt8$select_param_name_from__a_where_c, new SubLObject[]{ $pipeline_params_table$.getGlobalValue(), config_id, $param_type_id_parsing_mt$.getGlobalValue() }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    Errors.warn($str_alt10$There_is_no_parsing_mt_with_that_);
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    mt = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    mt = ke_utilities.fort_from_string(mt);
                }
                return mt;
            }
        }
    }

    /**
     *
     *
     * @param INPUT;
     * 		string to be sent to parser
     * @param CONFIG-ID;
     * 		INTEGER -- the config-id for the parse
     * @param SESSION-ID;
     * 		INTEGER -- the session-id for the parse
     * @unknown INTEGER -- the output_id of the stored parse for INPUT
    Gets the category and parsing mt associated with CONFIG-ID and uses these to send INPUT to the RTP.
    The output from the RTP is then converted into a format which will be storable in the pipeline DB.
    This converted output is then stored in the pipeline DB using SESSION-ID as the session key and
    using the function store-output-with-parts so that the subparses and supports for INPUT are stored
    in separate tables.
     * @unknown nancy
     */
    public static final SubLObject get_and_store_rtp_parse(SubLObject input, SubLObject config_id, SubLObject session_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_id = NIL;
                SubLObject category = get_category_for_config_id(config_id);
                SubLObject mt = get_parsing_mt_for_config_id(config_id);
                SubLObject input_id = get_input_id(input);
                {
                    SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding(thread);
                    try {
                        rtp_vars.$rtp_return_style$.bind($ASSERTION, thread);
                        {
                            SubLObject raw_rtp_output = iterative_template_parser.itp_sequel(input, category, mt, UNPROVIDED);
                            SubLObject input_token = rkf_concept_harvester.rkf_ch_string_tokenize(input);
                            SubLObject rtp_output = convert_parser_output_to_strings(raw_rtp_output, input_token);
                            output_id = store_output_with_parts(rtp_output, input_id, config_id, session_id);
                        }
                    } finally {
                        rtp_vars.$rtp_return_style$.rebind(_prev_bind_0, thread);
                    }
                }
                return output_id;
            }
        }
    }

    /**
     *
     *
     * @param INPUT;
     * 		string to be sent to parser
     * @param INPUT-ID;
     * 		INTEGER -- the input-id of INPUT
     * @param CONFIG-ID;
     * 		INTEGER -- the config-id for the parse
     * @param SESSION-ID;
     * 		INTEGER -- the session-id for the parse
     * @unknown INTEGER -- the output_id of the stored parse for INPUT
    Gets the category and parsing mt associated with CONFIG-ID and uses these to send INPUT to the RTP. The output from the RTP is then converted into a format which will be storable in the pipeline DB. This converted output is then stored in the pipeline DB using SESSION-ID as the session key and using the function store-output-with-parts so that the subparses and supports for INPUT are stored in separate tables.
     * @unknown nancy
     */
    public static final SubLObject get_and_store_rtp_parse_for_group_item(SubLObject input, SubLObject input_id, SubLObject config_id, SubLObject session_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_id = NIL;
                SubLObject category = get_category_for_config_id(config_id);
                SubLObject mt = get_parsing_mt_for_config_id(config_id);
                {
                    SubLObject _prev_bind_0 = rtp_vars.$rtp_return_style$.currentBinding(thread);
                    try {
                        rtp_vars.$rtp_return_style$.bind($ASSERTION, thread);
                        {
                            SubLObject raw_rtp_output = iterative_template_parser.itp_sequel(input, category, mt, UNPROVIDED);
                            SubLObject input_token = rkf_concept_harvester.rkf_ch_string_tokenize(input);
                            SubLObject rtp_output = convert_parser_output_to_strings(raw_rtp_output, input_token);
                            output_id = store_output_with_parts(rtp_output, input_id, config_id, session_id);
                        }
                    } finally {
                        rtp_vars.$rtp_return_style$.rebind(_prev_bind_0, thread);
                    }
                }
                return output_id;
            }
        }
    }

    public static final SubLObject format_parses_from_zope_for_display(SubLObject output) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            cb_utilities.cb_form(output, ZERO_INTEGER, T);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return string;
            }
        }
    }











    // defparameter
    private static final SubLSymbol $user_host$ = makeSymbol("*USER-HOST*");

    // defparameter
    private static final SubLSymbol $user_port$ = makeSymbol("*USER-PORT*");

    // defparameter
    private static final SubLSymbol $user_cyclist$ = makeSymbol("*USER-CYCLIST*");

    // defparameter
    private static final SubLSymbol $user_system$ = makeSymbol("*USER-SYSTEM*");

    // defparameter
    private static final SubLSymbol $user_kb$ = makeSymbol("*USER-KB*");

    // defparameter
    private static final SubLSymbol $user_project$ = makeSymbol("*USER-PROJECT*");

    // defparameter
    private static final SubLSymbol $show_pipeline_messagesP$ = makeSymbol("*SHOW-PIPELINE-MESSAGES?*");

    // defconstant
    private static final SubLSymbol $pipeline_session_table$ = makeSymbol("*PIPELINE-SESSION-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_input_table$ = makeSymbol("*PIPELINE-INPUT-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_output_table$ = makeSymbol("*PIPELINE-OUTPUT-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_params_table$ = makeSymbol("*PIPELINE-PARAMS-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_param_config_table$ = makeSymbol("*PIPELINE-PARAM-CONFIG-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_param_option_table$ = makeSymbol("*PIPELINE-PARAM-OPTION-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_param_type_table$ = makeSymbol("*PIPELINE-PARAM-TYPE-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_support_table$ = makeSymbol("*PIPELINE-SUPPORT-TABLE*");

    // defconstant
    private static final SubLSymbol $pipeline_output_part_table$ = makeSymbol("*PIPELINE-OUTPUT-PART-TABLE*");

    // defconstant
    private static final SubLSymbol $param_type_id_parser$ = makeSymbol("*PARAM-TYPE-ID-PARSER*");

    // defconstant
    private static final SubLSymbol $param_type_id_parsing_mt$ = makeSymbol("*PARAM-TYPE-ID-PARSING-MT*");

    // defconstant
    private static final SubLSymbol $param_type_id_domain_mt$ = makeSymbol("*PARAM-TYPE-ID-DOMAIN-MT*");

    // defconstant
    private static final SubLSymbol $param_type_id_category$ = makeSymbol("*PARAM-TYPE-ID-CATEGORY*");

    // defconstant
    private static final SubLSymbol $param_option_id_rtp$ = makeSymbol("*PARAM-OPTION-ID-RTP*");

    // defconstant
    private static final SubLSymbol $part_input_group_id$ = makeSymbol("*PART-INPUT-GROUP-ID*");

    public static final SubLObject pipeline_warning(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject args = current;
            return list(PWHEN, $sym35$_SHOW_PIPELINE_MESSAGES__, bq_cons(WARN, append(args, NIL)));
        }
    }

    /**
     * Establishes a new connection to the pipeline database and creates a statement
     * used to write and read to and from the database
     * This should be called when  parse is returned from the RTP
     */
    public static final SubLObject new_pipeline_connection() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $pipeline_connection$.setDynamicValue(sdbc.new_sql_connection($$$pipeline, $pipeline_user_login$.getDynamicValue(thread), $pipeline_user_passwd$.getDynamicValue(thread), list($DBMS_SERVER, $str_alt39$db_server_cyc_com, $PORT, $int$9999, $SUBPROTOCOL, $$$mysql)), thread);
            if (NIL != sdbc.sql_open_connection_p($pipeline_connection$.getDynamicValue(thread))) {
                $pipeline_statement$.setDynamicValue(sdbc.sqlc_create_statement($pipeline_connection$.getDynamicValue(thread)), thread);
            }
            return $pipeline_connection$.getDynamicValue(thread);
        }
    }

    /**
     * Returns t if OBJECT is an open working connection to the pipeline database
     */
    public static final SubLObject pipeline_connection_p(SubLObject v_object) {
        return makeBoolean(((NIL != sdbc.sql_connection_p(v_object)) && (NIL != sdbc.sqlc_open_p(v_object))) && sdbc.sqlc_db(v_object).equal($$$pipeline));
    }

    /**
     * Closes an open pipeline connection
     *
     * @unknown nancy
     */
    public static final SubLObject close_pipeline_connection() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == pipeline_connection_p($pipeline_connection$.getDynamicValue(thread))) {
                if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                    Errors.warn($str_alt44$There_is_no_pipeline_connection_o);
                }
            } else {
                sdbc.sqls_close($pipeline_statement$.getDynamicValue(thread));
                sdbc.sqlc_close($pipeline_connection$.getDynamicValue(thread));
            }
            $pipeline_connection$.setDynamicValue(NIL, thread);
            $pipeline_statement$.setDynamicValue(NIL, thread);
            return NIL;
        }
    }

    /**
     *
     *
     * @param HOST
     * 		user's machine name
     * @param PORT;
     * 		port cyc image is running on
     * @param CYCLIST;
     * 		user's cyclist name, default is RTPTool
     * @param SYSTEM;
     * 		system of cyc image, default is 0
     * @param KB;
     * 		KB of cyc image, default us 0
     * @param PROJECT;
     * 		project user is working on, default is RTP Tool
     * @return INTEGER; session_id of current session
     * @unknown nancy
     */
    public static final SubLObject store_session(SubLObject host, SubLObject port, SubLObject cyclist, SubLObject system, SubLObject kb, SubLObject project) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (system == UNPROVIDED) {
            system = NIL;
        }
        if (kb == UNPROVIDED) {
            kb = NIL;
        }
        if (project == UNPROVIDED) {
            project = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $user_date$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $user_host$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $user_port$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $user_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $user_system$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $user_kb$.currentBinding(thread);
                    SubLObject _prev_bind_6 = $user_project$.currentBinding(thread);
                    try {
                        $user_date$.bind(numeric_date_utilities.datetime_string_from_template(get_universal_time(), $str_alt45$yyyy_mm_dd_hh_mm_ss), thread);
                        $user_host$.bind(host, thread);
                        $user_port$.bind(port, thread);
                        $user_cyclist$.bind(NIL != cyclist ? ((SubLObject) (cyclist)) : $user_cyclist$.getDynamicValue(thread), thread);
                        $user_system$.bind(NIL != system ? ((SubLObject) (system)) : $user_system$.getDynamicValue(thread), thread);
                        $user_kb$.bind(NIL != kb ? ((SubLObject) (kb)) : $user_kb$.getDynamicValue(thread), thread);
                        $user_project$.bind(NIL != project ? ((SubLObject) (project)) : $user_project$.getDynamicValue(thread), thread);
                        sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt46$INSERT_INTO__a__date__cyclist__ho, new SubLObject[]{ $pipeline_session_table$.getGlobalValue(), $user_date$.getDynamicValue(thread), $user_cyclist$.getDynamicValue(thread), $user_host$.getDynamicValue(thread), $user_port$.getDynamicValue(thread), $user_system$.getDynamicValue(thread), $user_kb$.getDynamicValue(thread), $user_project$.getDynamicValue(thread) }));
                        {
                            SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt47$SELECT_max_session_id__as_session, $pipeline_session_table$.getGlobalValue()), UNPROVIDED);
                            if (NIL != sdbc.sqlrs_emptyP(rs)) {
                                if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                                    Errors.warn($str_alt48$There_are_no_session_ids);
                                }
                            } else {
                                sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                                ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                            }
                        }
                    } finally {
                        $user_project$.rebind(_prev_bind_6, thread);
                        $user_kb$.rebind(_prev_bind_5, thread);
                        $user_system$.rebind(_prev_bind_4, thread);
                        $user_cyclist$.rebind(_prev_bind_3, thread);
                        $user_port$.rebind(_prev_bind_2, thread);
                        $user_host$.rebind(_prev_bind_1, thread);
                        $user_date$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param INPUT;
     * 		string to be sent to parser
     * @return BOOLEAN; true if INPUT, without an input_group_id, is already stored in the DB
     * @unknown nancy
     */
    public static final SubLObject input_in_pipelineP(SubLObject input) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt49$select_count_input_id__as_sentenc, $pipeline_input_table$.getGlobalValue(), input), UNPROVIDED);
                sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                if (ans != ZERO_INTEGER) {
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param INPUT;
     * 		string to be sent to parser
     * @return INTEGER; input_id of input (without input_group_id) in the pipeling DB
     * @unknown nancy
     */
    public static final SubLObject get_input_id_for_input(SubLObject input) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt50$select_distinct_input_id_from__a_, $pipeline_input_table$.getGlobalValue(), input), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($$$INPUT_is_not_stored_in_the_DB);
                    }
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    public static final SubLObject get_max_config_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt52$select_max_config_id__from__a, $pipeline_param_config_table$.getGlobalValue()), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($str_alt53$There_are_no_config_ids);
                    }
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param INPUT;
     * 		string to be sent to parser
     * 		Check if INPUT is already stored in the DB, get it's input_id if it is; otherwise, store INPUT and return the new input_id
     * @return INTEGER; input_id of input (without input_group_id) in the pipeline DB
     * @unknown nancy
     */
    public static final SubLObject get_input_id(SubLObject input) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != input_in_pipelineP(input)) {
                    ans = get_input_id_for_input(input);
                } else {
                    sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt54$INSERT_INTO__a__input__VALUES__s_, $pipeline_input_table$.getGlobalValue(), input));
                    ans = get_input_id_for_input(input);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param INPUT-PART;
     * 		part of a string sent to the parser
     * @return BOOLEAN; true if INPUT, with input_group_id=81 (the default for input-parts), is already stored in the DB
     * @unknown nancy
     */
    public static final SubLObject input_part_in_pipelineP(SubLObject input_part) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt55$select_count_input_id__as_sentenc, new SubLObject[]{ $pipeline_input_table$.getGlobalValue(), input_part, $part_input_group_id$.getGlobalValue() }), UNPROVIDED);
                sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                if (ans != ZERO_INTEGER) {
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param INPUT-PART;
     * 		part of a string sent to the parser
     * @return INTEGER; input_id of input-part (input with input_group_id=81) in the pipeling DB
     * @unknown nancy
     */
    public static final SubLObject get_input_id_for_input_part(SubLObject input_part) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt56$select_distinct_input_id_from__a_, new SubLObject[]{ $pipeline_input_table$.getGlobalValue(), input_part, $part_input_group_id$.getGlobalValue() }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($str_alt57$INPUT_PART_is_not_stored_inthe_DB);
                    }
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param INPUT-PART;
     * 		part of a string sent to the parser
     * 		Check if INPUT-PART is already stored in the DB, get it's input_id if it is; otherwise, store INPUT-PART and return the new input_id
     * @return INTEGER; input_id of INPUT-PART (with input_group_id=81) in the pipeline DB
     * @unknown nancy
     */
    public static final SubLObject get_input_part_id(SubLObject input_part) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != input_part_in_pipelineP(input_part)) {
                    ans = get_input_id_for_input_part(input_part);
                } else {
                    sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt58$INSERT_INTO__a__input_group_id__i, new SubLObject[]{ $pipeline_input_table$.getGlobalValue(), $part_input_group_id$.getGlobalValue(), input_part }));
                    ans = get_input_id_for_input_part(input_part);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param PARAM-OPTION;
     * 		string, the name of the param_option
     * @param PARAM-TYPE-ID;
     * 		integer, the id of the param-type which param-option belongs to. This is needded because while a param_option_id is unique in the table, param_option may not be since it's possible to have the same param_option in two different param_type categories, e.g. #$RKFParsingMt is a param_option both in LexcialMt and DomainMt categories
     * @return INTEGER; the param_option_id of PARAM-OPTION with param_type_id PARAM-TYPE-ID
     * @unknown nancy
     */
    public static final SubLObject get_param_option_id(SubLObject param_option, SubLObject param_type_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt59$select_param_option_id_from__a_wh, new SubLObject[]{ $pipeline_param_option_table$.getGlobalValue(), param_option, param_type_id }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($str_alt60$There_is_no_such_param_option_in_);
                    }
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param PARAM-OPTION-LIST;
     * 		plist consisting of param_type keyword followed by param_option -- object e.g. (:PARSING-MT #$RKFParsingMt :CATEGORY #$STemplate). The param_type_ids are hard-coded in the RTP tool and match the corresponding param_type_ids in the DB.
     * @return INTEGER; the config_id representing the chosen parser configuration
    Takes the param ojects and turns them into strings (which is how they are stored in the DB) and looks up their ids.  If a chosen param is not in the DB, first store it in the param_options table and then return its id. If this is the case then there won't already be a configuration using the option so a new one will need to be created. Otherwise, check to see if a configuration exists with those params: if yes, get the id; if no, create a new configuration and get the id.
     * @unknown nancy
     */
    public static final SubLObject get_config_id(SubLObject param_option_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject final_config_id = NIL;
                SubLObject param_type_id = NIL;
                SubLObject param_type_ids_list = NIL;
                SubLObject param_option_id_list = NIL;
                SubLObject pair_list = NIL;
                SubLObject complete_pair_list = NIL;
                {
                    SubLObject cdolist_list_var = param_option_list;
                    SubLObject indicator = NIL;
                    for (indicator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indicator = cdolist_list_var.first()) {
                        if (indicator.isKeyword()) {
                            {
                                SubLObject pcase_var = indicator;
                                if (pcase_var.eql($PARSER)) {
                                    param_type_id = $param_type_id_parser$.getGlobalValue();
                                } else
                                    if (pcase_var.eql($PARSING_MT)) {
                                        param_type_id = $param_type_id_parsing_mt$.getGlobalValue();
                                    } else
                                        if (pcase_var.eql($DOMAIN_MT)) {
                                            param_type_id = $param_type_id_domain_mt$.getGlobalValue();
                                        } else
                                            if (pcase_var.eql($CATEGORY)) {
                                                param_type_id = $param_type_id_category$.getGlobalValue();
                                            }



                            }
                            param_type_ids_list = cons(param_type_id, param_type_ids_list);
                            {
                                SubLObject option = getf(param_option_list, indicator, UNPROVIDED);
                                SubLObject option_string = Strings.string_trim($str_alt62$__, prin1_to_string(option));
                                SubLObject option_id = NIL;
                                option_id = get_param_option_id(option_string, param_type_id);
                                if (NIL != option_id) {
                                    param_option_id_list = cons(option_id, param_option_id_list);
                                    param_option_id_list = cons(indicator, param_option_id_list);
                                }
                                if (NIL == option_id) {
                                    sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt63$INSERT_INTO__a__param_type_id__pa, new SubLObject[]{ $pipeline_param_option_table$.getGlobalValue(), param_type_id, option_string }));
                                    option_id = get_param_option_id(option_string, param_type_id);
                                    param_option_id_list = cons(option_id, param_option_id_list);
                                    param_option_id_list = cons(indicator, param_option_id_list);
                                }
                                pair_list = list(param_type_id, option_id);
                                complete_pair_list = cons(pair_list, complete_pair_list);
                                complete_pair_list = Sort.sort(complete_pair_list, symbol_function($sym64$_), symbol_function(FIRST));
                            }
                        }
                    }
                }
                {
                    SubLObject params_string = $str_alt66$;
                    SubLObject first_string = NIL;
                    SubLObject second_string = NIL;
                    {
                        SubLObject cdolist_list_var = complete_pair_list;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            first_string = prin1_to_string(pair.first());
                            second_string = prin1_to_string(second(pair));
                            params_string = cconcatenate(params_string, new SubLObject[]{ $str_alt67$_, first_string, $str_alt68$_, second_string });
                        }
                    }
                    params_string = string_utilities.pre_remove(params_string, $str_alt67$_, UNPROVIDED);
                    {
                        SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt69$select_config_id_as_duplicate_con, $pipeline_param_config_table$.getGlobalValue(), params_string), UNPROVIDED);
                        if (NIL != sdbc.sqlrs_emptyP(rs)) {
                            {
                                SubLObject config_date = numeric_date_utilities.datetime_string_from_template(get_universal_time(), $str_alt45$yyyy_mm_dd_hh_mm_ss);
                                SubLObject name = cconcatenate($str_alt70$Automated_RTP_Configuration__, config_date);
                                SubLObject description = $$$no_description;
                                sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt72$INSERT_INTO__a__config_name__desc, new SubLObject[]{ $pipeline_param_config_table$.getGlobalValue(), name, description, params_string }));
                            }
                            final_config_id = get_max_config_id();
                            {
                                SubLObject cdolist_list_var = complete_pair_list;
                                SubLObject option_type_pair = NIL;
                                for (option_type_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option_type_pair = cdolist_list_var.first()) {
                                    {
                                        SubLObject type_id = option_type_pair.first();
                                        SubLObject option_id = second(option_type_pair);
                                        sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt73$INSERT_INTO__a__param_type_id__pa, new SubLObject[]{ $pipeline_params_table$.getGlobalValue(), type_id, option_id, final_config_id }));
                                    }
                                }
                            }
                        } else {
                            sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                            final_config_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                        }
                    }
                }
                return final_config_id;
            }
        }
    }

    /**
     *
     *
     * @param INPUT-ID;
     * 		integer, id of string to be parsed
     * @param SESSION-ID;
     * 		integer,id of  current session
     * @param CONFIG-ID;
     * 		integer, id of chosen configuration for the parse
     * @param OUTPUT;
     * 		string, cycl returned from parser
     * @return INTEGER; id of output OUTPUT with input_id INPUT_ID, session_id SESSION_ID, config_id CONFIG_ID
     * @unknown nancy
     */
    public static final SubLObject get_output_id_for_output(SubLObject input_id, SubLObject session_id, SubLObject config_id, SubLObject output) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_id = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt74$select_output_id_from__a_where_in, new SubLObject[]{ $pipeline_output_table$.getGlobalValue(), input_id, session_id, config_id, output }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($$$There_is_no_such_output);
                    }
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    output_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return output_id;
            }
        }
    }

    /**
     *
     *
     * @param SESSION_ID;
     * 		integer,id of  current session
     * @param CONFIG_ID;
     * 		integer, id of chosen configuration for the parse
     * @param INPUT_ID;
     * 		integer, id of string to be parsed
     * @param OUTPUT
     * 		string, result of parsing input of INPUT_ID with configuration CONFIG_ID
     * 		Stores the params in the pipeline DB
     * @return INTEGER; the output_id of output just stored
     * @unknown nancy
     */
    public static final SubLObject store_output(SubLObject session_id, SubLObject config_id, SubLObject input_id, SubLObject output) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_id = NIL;
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt76$select_count_output_id__from__a_w, new SubLObject[]{ $pipeline_output_table$.getGlobalValue(), session_id, config_id, input_id, output }), UNPROVIDED);
                sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                if (ans != ZERO_INTEGER) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($str_alt77$Parse_is_already_saved_in_the_dat);
                    }
                } else {
                    sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt78$INSERT_INTO__a__input_id__session, new SubLObject[]{ $pipeline_output_table$.getGlobalValue(), input_id, session_id, config_id, output }));
                }
                output_id = get_output_id_for_output(input_id, session_id, config_id, output);
                return output_id;
            }
        }
    }

    /**
     *
     *
     * @param OUTPUT-ID;
     * 		integer,id of current output of which OUTPUT-PART is a partial parse
     * @param INPUT-PART-ID;
     * 		integer, id of the part of string for which OUTPUT-PART is a parse
     * @param OUTPUT-PART;
     * 		the parse for INPUT-PART-ID
     * 		Stores the partial parses for output with OUTPUT_ID the pipeline DB
     * @return INTEGER; the output-part-id of OUTPUT-PART
     * @unknown nancy
     */
    public static final SubLObject get_output_part_id_for_output_part(SubLObject output_id, SubLObject input_part_id, SubLObject output_part) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_part_id = NIL;
                SubLObject rs = sdbc.sqls_execute_query($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt79$select_distinct_output_part_id_fr, new SubLObject[]{ $pipeline_output_part_table$.getGlobalValue(), output_id, input_part_id, output_part }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                        Errors.warn($str_alt80$There_is_no_such_output_part);
                    }
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    output_part_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return output_part_id;
            }
        }
    }

    /**
     *
     *
     * @param OUTPUT-ID;
     * 		integer,id of current output of which OUTPUT-PART is a partial parse
     * @param INPUT-PART-ID;
     * 		integer, id of the part of string for which OUTPUT-PART is a parse
     * @param OUTPUT-PART;
     * 		the parse for INPUT-PART-ID
     * 		Stores the partial parses for output with OUTPUT_ID the pipeline DB
     * @return INTEGER; the output-part-id of OUTPUT-PART just stored
     * @unknown nancy
     */
    public static final SubLObject store_output_part(SubLObject output_id, SubLObject input_part_id, SubLObject output_part) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_part_id = NIL;
                sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt81$INSERT_INTO__a__output_id__input_, new SubLObject[]{ $pipeline_output_part_table$.getGlobalValue(), output_id, input_part_id, output_part }));
                output_part_id = get_output_part_id_for_output_part(output_id, input_part_id, output_part);
                return output_part_id;
            }
        }
    }

    /**
     *
     *
     * @param OUTPUT-ID;
     * 		integer,id of output from parser for which SUPPORT is a support
     * @param SUPPORT;
     * 		string, cycl assertion from which the output for OUTPUT-ID was taken
     * 		Stores SUPPORT in the support table with id output-id and output_part_id NULL since this is a support for an entire phrase parse.
     * @unknown nancy
     */
    public static final SubLObject store_support(SubLObject output_id, SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt82$INSERT_INTO__a__output_id__suppor, new SubLObject[]{ $pipeline_support_table$.getGlobalValue(), output_id, support }));
            return T;
        }
    }

    /**
     *
     *
     * @param OUTPUT-ID;
     * 		integer,id of output from parser for which SUPPORT is a support of a subparse
     * @param OUTPUT-PART-ID;
     * 		integer, id of the output from the parser for the subparse of OUTPUT-ID
     * @param SUPPORT;
     * 		string, cycl assertion from which the output for OUTPUT-PART-ID was taken
     * 		Stores SUPPORT in the support table with id output_id and output_part_id OUTPUT-PART-ID.
     * @unknown nancy
     */
    public static final SubLObject store_support_part(SubLObject output_id, SubLObject output_part_id, SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sdbc.sqls_execute_update($pipeline_statement$.getDynamicValue(thread), format(NIL, $str_alt83$INSERT_INTO__a__output_id__output, new SubLObject[]{ $pipeline_support_table$.getGlobalValue(), output_id, output_part_id, support }));
            return T;
        }
    }

    /**
     *
     *
     * @param OUTPUT-FROM-RTP;
     * 		LIST of lists of this form ((input (output (support1 support2 support3...))) (input (output (support1 support2 support3...)))) NOTE that INPUT has single quotes around it, e.g. 'the cat is on the mat'
     * @param INPUT-ID;
     * 		INTEGER -- the input-id for the entire phrase sent to parser for which output-from-rtp is the result
     * @param CONFIG-ID;
     * 		INTEGER -- the config-id for the parse
     * @param SESSION-ID;
     * 		INTEGER -- the session-id for the parse
     * 		Takes output from RTP and stores each INPUT, OUTPUT, SUPPORT1-SUPPORTN group in the pipeline DB. The first list inthe list is the OUTPUT and SUPPORT for the parse for the entire phrase. This is stored with a unique output-id. Subsequent items are stored as output-parts to this output-id.
     * @unknown INTEGER, the output_id of the total parse.
     * @unknown nancy
     */
    public static final SubLObject store_output_with_parts(SubLObject output_from_rtp, SubLObject input_id, SubLObject config_id, SubLObject session_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_id = NIL;
                SubLObject cdolist_list_var = output_from_rtp;
                SubLObject output_list = NIL;
                for (output_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , output_list = cdolist_list_var.first()) {
                    if (length(output_list) != TWO_INTEGER) {
                        if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                            Errors.warn($$$List_does_not_have_2_members);
                        }
                    } else {
                        {
                            SubLObject current_input = output_list.first();
                            SubLObject item_list = second(output_list);
                            SubLObject output = item_list.first();
                            SubLObject support_list = second(item_list);
                            SubLObject input_part_id = NIL;
                            SubLObject output_part_id = NIL;
                            if (current_input.isList()) {
                                if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                                    Errors.warn($str_alt85$Input_should_be_a_string_not_a_li);
                                }
                            } else
                                if (!item_list.isList()) {
                                    if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                                        Errors.warn($str_alt86$Item_should_be_a_list_consisting_);
                                    }
                                } else
                                    if (NIL == list_utilities.lengthE(item_list, TWO_INTEGER, UNPROVIDED)) {
                                        if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                                            Errors.warn($str_alt87$list_of_output_and_list_of_suppor);
                                        }
                                    } else {
                                        if (output_list.equalp(output_from_rtp.first())) {
                                            if (get_input_id_for_input(current_input) != input_id) {
                                                if (NIL != $show_pipeline_messagesP$.getDynamicValue(thread)) {
                                                    Errors.warn($str_alt88$The_RTP_failed_to_provide_a_parse);
                                                }
                                                output = $$$No_Parse;
                                            }
                                            output_id = store_output(session_id, config_id, input_id, output);
                                            {
                                                SubLObject cdolist_list_var_2 = support_list;
                                                SubLObject support = NIL;
                                                for (support = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , support = cdolist_list_var_2.first()) {
                                                    store_support(output_id, support);
                                                }
                                            }
                                        } else {
                                            input_part_id = get_input_part_id(current_input);
                                            output_part_id = store_output_part(output_id, input_part_id, output);
                                            {
                                                SubLObject cdolist_list_var_3 = support_list;
                                                SubLObject support = NIL;
                                                for (support = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , support = cdolist_list_var_3.first()) {
                                                    store_support_part(output_id, output_part_id, support);
                                                }
                                            }
                                        }
                                    }


                        }
                    }
                }
                return output_id;
            }
        }
    }

    public static final SubLObject declare_rtp_pipeline_integration_file() {
        declareFunction("store_rtp_parses_in_pipeline", "STORE-RTP-PARSES-IN-PIPELINE", 4, 1, false);
        declareFunction("convert_parser_output_to_strings", "CONVERT-PARSER-OUTPUT-TO-STRINGS", 2, 0, false);
        declareFunction("rtp_support_strings", "RTP-SUPPORT-STRINGS", 1, 0, false);
        declareFunction("db_string", "DB-STRING", 1, 0, false);
        declareFunction("get_category_for_config_id", "GET-CATEGORY-FOR-CONFIG-ID", 1, 0, false);
        declareFunction("get_parsing_mt_for_config_id", "GET-PARSING-MT-FOR-CONFIG-ID", 1, 0, false);
        declareFunction("get_and_store_rtp_parse", "GET-AND-STORE-RTP-PARSE", 3, 0, false);
        declareFunction("get_and_store_rtp_parse_for_group_item", "GET-AND-STORE-RTP-PARSE-FOR-GROUP-ITEM", 4, 0, false);
        declareFunction("format_parses_from_zope_for_display", "FORMAT-PARSES-FROM-ZOPE-FOR-DISPLAY", 1, 0, false);
        declareMacro("pipeline_warning", "PIPELINE-WARNING");
        declareFunction("new_pipeline_connection", "NEW-PIPELINE-CONNECTION", 0, 0, false);
        declareFunction("pipeline_connection_p", "PIPELINE-CONNECTION-P", 1, 0, false);
        declareFunction("close_pipeline_connection", "CLOSE-PIPELINE-CONNECTION", 0, 0, false);
        declareFunction("store_session", "STORE-SESSION", 2, 4, false);
        declareFunction("input_in_pipelineP", "INPUT-IN-PIPELINE?", 1, 0, false);
        declareFunction("get_input_id_for_input", "GET-INPUT-ID-FOR-INPUT", 1, 0, false);
        declareFunction("get_max_config_id", "GET-MAX-CONFIG-ID", 0, 0, false);
        declareFunction("get_input_id", "GET-INPUT-ID", 1, 0, false);
        declareFunction("input_part_in_pipelineP", "INPUT-PART-IN-PIPELINE?", 1, 0, false);
        declareFunction("get_input_id_for_input_part", "GET-INPUT-ID-FOR-INPUT-PART", 1, 0, false);
        declareFunction("get_input_part_id", "GET-INPUT-PART-ID", 1, 0, false);
        declareFunction("get_param_option_id", "GET-PARAM-OPTION-ID", 2, 0, false);
        declareFunction("get_config_id", "GET-CONFIG-ID", 1, 0, false);
        declareFunction("get_output_id_for_output", "GET-OUTPUT-ID-FOR-OUTPUT", 4, 0, false);
        declareFunction("store_output", "STORE-OUTPUT", 4, 0, false);
        declareFunction("get_output_part_id_for_output_part", "GET-OUTPUT-PART-ID-FOR-OUTPUT-PART", 3, 0, false);
        declareFunction("store_output_part", "STORE-OUTPUT-PART", 3, 0, false);
        declareFunction("store_support", "STORE-SUPPORT", 2, 0, false);
        declareFunction("store_support_part", "STORE-SUPPORT-PART", 3, 0, false);
        declareFunction("store_output_with_parts", "STORE-OUTPUT-WITH-PARTS", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_rtp_pipeline_integration_file() {
        deflexical("*DO-NOT-STORE-RTP-PARSES-IN-PIPELINE*", T);
        defparameter("*PIPELINE-CONNECTION*", NIL);
        defparameter("*PIPELINE-STATEMENT*", NIL);
        defparameter("*PIPELINE-USER-LOGIN*", $str_alt14$nancy_localhost);
        defparameter("*PIPELINE-USER-PASSWD*", $$$freddie);
        defparameter("*USER-DATE*", NIL);
        defparameter("*USER-HOST*", $$$slinky);
        defparameter("*USER-PORT*", $int$3600);
        defparameter("*USER-CYCLIST*", $$$RTPTool);
        defparameter("*USER-SYSTEM*", $float$0_0);
        defparameter("*USER-KB*", ZERO_INTEGER);
        defparameter("*USER-PROJECT*", $$$RTP_Tool);
        defparameter("*SHOW-PIPELINE-MESSAGES?*", NIL);
        defconstant("*PIPELINE-SESSION-TABLE*", $$$session);
        defconstant("*PIPELINE-INPUT-TABLE*", $$$input);
        defconstant("*PIPELINE-OUTPUT-TABLE*", $$$output);
        defconstant("*PIPELINE-PARAMS-TABLE*", $$$params);
        defconstant("*PIPELINE-PARAM-CONFIG-TABLE*", $str_alt28$param_config);
        defconstant("*PIPELINE-PARAM-OPTION-TABLE*", $str_alt29$param_option);
        defconstant("*PIPELINE-PARAM-TYPE-TABLE*", $str_alt30$param_type);
        defconstant("*PIPELINE-SUPPORT-TABLE*", $$$support);
        defconstant("*PIPELINE-OUTPUT-PART-TABLE*", $str_alt32$output_part);
        defconstant("*PARAM-TYPE-ID-PARSER*", ONE_INTEGER);
        defconstant("*PARAM-TYPE-ID-PARSING-MT*", TWO_INTEGER);
        defconstant("*PARAM-TYPE-ID-DOMAIN-MT*", THREE_INTEGER);
        defconstant("*PARAM-TYPE-ID-CATEGORY*", FOUR_INTEGER);
        defconstant("*PARAM-OPTION-ID-RTP*", FOURTEEN_INTEGER);
        defconstant("*PART-INPUT-GROUP-ID*", $int$81);
        return NIL;
    }

    public static final SubLObject setup_rtp_pipeline_integration_file() {
                utilities_macros.register_html_state_variable($pipeline_connection$);
        utilities_macros.register_html_state_variable($pipeline_statement$);
        utilities_macros.register_html_state_variable($pipeline_user_login$);
        utilities_macros.register_html_state_variable($pipeline_user_passwd$);
        utilities_macros.register_html_state_variable($user_date$);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$CycRecursiveTemplateParser = constant_handles.reader_make_constant_shell(makeString("CycRecursiveTemplateParser"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");







    static private final SubLString $str_alt6$_ = makeString("'");

    static private final SubLString $str_alt7$_ = makeString("\"");

    static private final SubLString $str_alt8$select_param_name_from__a_where_c = makeString("select param_name from ~a where config_id=~a and param_type_id=~a");

    static private final SubLString $str_alt9$There_is_no_category_with_that_co = makeString("There is no category with that config_id");

    static private final SubLString $str_alt10$There_is_no_parsing_mt_with_that_ = makeString("There is no parsing mt with that config_id");



    public static final SubLSymbol $pipeline_connection$ = makeSymbol("*PIPELINE-CONNECTION*");

    public static final SubLSymbol $pipeline_statement$ = makeSymbol("*PIPELINE-STATEMENT*");

    static private final SubLString $str_alt14$nancy_localhost = makeString("nancy@localhost");

    public static final SubLSymbol $pipeline_user_login$ = makeSymbol("*PIPELINE-USER-LOGIN*");

    static private final SubLString $$$freddie = makeString("freddie");

    public static final SubLSymbol $pipeline_user_passwd$ = makeSymbol("*PIPELINE-USER-PASSWD*");

    public static final SubLSymbol $user_date$ = makeSymbol("*USER-DATE*");

    static private final SubLString $$$slinky = makeString("slinky");

    public static final SubLInteger $int$3600 = makeInteger(3600);

    static private final SubLString $$$RTPTool = makeString("RTPTool");

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    static private final SubLString $$$RTP_Tool = makeString("RTP Tool");

    static private final SubLString $$$session = makeString("session");

    static private final SubLString $$$input = makeString("input");

    static private final SubLString $$$output = makeString("output");

    static private final SubLString $$$params = makeString("params");

    static private final SubLString $str_alt28$param_config = makeString("param_config");

    static private final SubLString $str_alt29$param_option = makeString("param_option");

    static private final SubLString $str_alt30$param_type = makeString("param_type");

    static private final SubLString $$$support = makeString("support");

    static private final SubLString $str_alt32$output_part = makeString("output_part");

    public static final SubLInteger $int$81 = makeInteger(81);



    static private final SubLSymbol $sym35$_SHOW_PIPELINE_MESSAGES__ = makeSymbol("*SHOW-PIPELINE-MESSAGES?*");



    static private final SubLString $$$pipeline = makeString("pipeline");



    static private final SubLString $str_alt39$db_server_cyc_com = makeString("db-server.cyc.com");



    public static final SubLInteger $int$9999 = makeInteger(9999);



    static private final SubLString $$$mysql = makeString("mysql");

    static private final SubLString $str_alt44$There_is_no_pipeline_connection_o = makeString("There is no pipeline connection open");

    static private final SubLString $str_alt45$yyyy_mm_dd_hh_mm_ss = makeString("yyyy/mm/dd hh:mm:ss");

    static private final SubLString $str_alt46$INSERT_INTO__a__date__cyclist__ho = makeString("INSERT INTO ~a (date, cyclist, host, port, system, KB, project) VALUES(~s, ~s, ~s, ~a, ~a, ~a, ~s)");

    static private final SubLString $str_alt47$SELECT_max_session_id__as_session = makeString("SELECT max(session_id) as session_id from ~a");

    static private final SubLString $str_alt48$There_are_no_session_ids = makeString("There are no session_ids");

    static private final SubLString $str_alt49$select_count_input_id__as_sentenc = makeString("select count(input_id) as sentence_count from ~a where input=~s and input_group_id is null");

    static private final SubLString $str_alt50$select_distinct_input_id_from__a_ = makeString("select distinct input_id from ~a where input=~s and input_group_id is null");

    static private final SubLString $$$INPUT_is_not_stored_in_the_DB = makeString("INPUT is not stored in the DB");

    static private final SubLString $str_alt52$select_max_config_id__from__a = makeString("select max(config_id) from ~a");

    static private final SubLString $str_alt53$There_are_no_config_ids = makeString("There are no config_ids");

    static private final SubLString $str_alt54$INSERT_INTO__a__input__VALUES__s_ = makeString("INSERT INTO ~a (input) VALUES(~s)");

    static private final SubLString $str_alt55$select_count_input_id__as_sentenc = makeString("select count(input_id) as sentence_count from ~a where input=~s and input_group_id=~a");

    static private final SubLString $str_alt56$select_distinct_input_id_from__a_ = makeString("select distinct input_id from ~a where input=~s and input_group_id=~a");

    static private final SubLString $str_alt57$INPUT_PART_is_not_stored_inthe_DB = makeString("INPUT-PART is not stored inthe DB");

    static private final SubLString $str_alt58$INSERT_INTO__a__input_group_id__i = makeString("INSERT INTO ~a (input_group_id, input) VALUES(~a, ~s)");

    static private final SubLString $str_alt59$select_param_option_id_from__a_wh = makeString("select param_option_id from ~a where param_option=~s and param_type_id=~a");

    static private final SubLString $str_alt60$There_is_no_such_param_option_in_ = makeString("There is no such param_option in the DB");



    static private final SubLString $str_alt62$__ = makeString("#$");

    static private final SubLString $str_alt63$INSERT_INTO__a__param_type_id__pa = makeString("INSERT INTO ~a (param_type_id, param_option) VALUES(~a, ~s)");

    static private final SubLSymbol $sym64$_ = makeSymbol("<");



    static private final SubLString $str_alt66$ = makeString("");

    static private final SubLString $str_alt67$_ = makeString("_");

    static private final SubLString $str_alt68$_ = makeString("-");

    static private final SubLString $str_alt69$select_config_id_as_duplicate_con = makeString("select config_id as duplicate_config_id from ~a where params_string=~s");

    static private final SubLString $str_alt70$Automated_RTP_Configuration__ = makeString("Automated RTP Configuration: ");

    static private final SubLString $$$no_description = makeString("no description");

    static private final SubLString $str_alt72$INSERT_INTO__a__config_name__desc = makeString("INSERT INTO ~a (config_name, description, params_string) VALUES(~s, ~s, ~s)");

    static private final SubLString $str_alt73$INSERT_INTO__a__param_type_id__pa = makeString("INSERT INTO ~a (param_type_id, param_option_id, config_id) VALUES(~a, ~a, ~a)");

    static private final SubLString $str_alt74$select_output_id_from__a_where_in = makeString("select output_id from ~a where input_id=~a and session_id=~a and config_id=~a and output=~s");

    static private final SubLString $$$There_is_no_such_output = makeString("There is no such output");

    static private final SubLString $str_alt76$select_count_output_id__from__a_w = makeString("select count(output_id) from ~a where session_id=~a and config_id=~a and input_id=~a and output=~s");

    static private final SubLString $str_alt77$Parse_is_already_saved_in_the_dat = makeString("Parse is already saved in the database.");

    static private final SubLString $str_alt78$INSERT_INTO__a__input_id__session = makeString("INSERT INTO ~a (input_id, session_id, config_id, output) VALUES(~a, ~a, ~a, ~s)");

    static private final SubLString $str_alt79$select_distinct_output_part_id_fr = makeString("select distinct output_part_id from ~a where output_id=~a and input_id=~a and output_part=~s");

    static private final SubLString $str_alt80$There_is_no_such_output_part = makeString("There is no such output-part");

    static private final SubLString $str_alt81$INSERT_INTO__a__output_id__input_ = makeString("INSERT INTO ~a (output_id, input_id, output_part) VALUES(~a, ~a, ~s)");

    static private final SubLString $str_alt82$INSERT_INTO__a__output_id__suppor = makeString("INSERT INTO ~a (output_id, support) VALUES(~a, ~s)");

    static private final SubLString $str_alt83$INSERT_INTO__a__output_id__output = makeString("INSERT INTO ~a (output_id, output_part_id, support) VALUES(~a, ~a, ~s)");

    static private final SubLString $$$List_does_not_have_2_members = makeString("List does not have 2 members");

    static private final SubLString $str_alt85$Input_should_be_a_string_not_a_li = makeString("Input should be a string not a list");

    static private final SubLString $str_alt86$Item_should_be_a_list_consisting_ = makeString("Item should be a list consisting of output and list of supports");

    static private final SubLString $str_alt87$list_of_output_and_list_of_suppor = makeString("list of output and list of supports should have 2 members");

    static private final SubLString $str_alt88$The_RTP_failed_to_provide_a_parse = makeString("The RTP failed to provide a parse for the entire phrase.");

    static private final SubLString $$$No_Parse = makeString("No Parse");

    // // Initializers
    public void declareFunctions() {
        declare_rtp_pipeline_integration_file();
    }

    public void initializeVariables() {
        init_rtp_pipeline_integration_file();
    }

    public void runTopLevelForms() {
        setup_rtp_pipeline_integration_file();
    }
}

