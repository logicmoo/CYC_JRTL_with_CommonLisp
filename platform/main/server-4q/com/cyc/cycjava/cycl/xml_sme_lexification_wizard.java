package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_sme_lexification_wizard extends SubLTranslatedFile {
    public static final SubLFile me = new xml_sme_lexification_wizard();

    public static final String myName = "com.cyc.cycjava.cycl.xml_sme_lexification_wizard";

    public static final String myFingerPrint = "73c0875bfe49330d24ccf57d70cd1b2ae978a5ce486f44802d3438341b97ec3a";

    // Internal Constants
    public static final SubLSymbol XML_SME_LEXIFICATION_WIZARD = makeSymbol("XML-SME-LEXIFICATION-WIZARD");







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-INSTANCE");



    public static final SubLList $list16 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

    public static final SubLList $list17 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("XML-QUESTION-ANSWERING-AGENT"))), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("XML-PROXY")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol XML_QUESTION_ANSWERING_AGENT = makeSymbol("XML-QUESTION-ANSWERING-AGENT");

    public static final SubLSymbol XML_PROXY = makeSymbol("XML-PROXY");



    public static final SubLSymbol XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol("XML-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");

    public static final SubLSymbol INTERFACE_PROXY = makeSymbol("INTERFACE-PROXY");

    public static final SubLList $list23 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-RESULTS"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-INSTANCE");

    public static final SubLSymbol END_SESSION = makeSymbol("END-SESSION");

    public static final SubLList $list27 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list28 = list(list(makeSymbol("REPORT-RESULTS"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol XML_PROXY_END_SESSION_METHOD = makeSymbol("XML-PROXY-END-SESSION-METHOD");

    public static final SubLSymbol REPORT_RESULTS = makeSymbol("REPORT-RESULTS");

    public static final SubLList $list31 = list(list(makeSymbol("XML-TAG"), list(makeString("lexificationDone"), NIL, makeKeyword("ATOMIC"))), list(makeSymbol("RET"), NIL));

    public static final SubLString $$$lexificationDone = makeString("lexificationDone");





    private static final SubLSymbol XML_PROXY_REPORT_RESULTS_METHOD = makeSymbol("XML-PROXY-REPORT-RESULTS-METHOD");

    private static final SubLSymbol INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM = makeSymbol("INVOKE-XML-SME-LEXIFICATION-WIZARD-FOR-TERM");



    private static final SubLSymbol ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION = makeSymbol("ANSWER-XML-SME-LEXIFICATION-WIZARD-QUESTION");



    private static final SubLSymbol ANSWER_QUESTION = makeSymbol("ANSWER-QUESTION");

    private static final SubLString $str41$_id_ = makeString("<id>");

    private static final SubLString $str42$__id_ = makeString("</id>");

    public static SubLObject subloop_reserved_initialize_xml_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_xml_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEXT_STATES, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEW_CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, QUESTION_ANSWERING_AGENT_CLASS, NIL);
        return NIL;
    }

    public static SubLObject xml_sme_lexification_wizard_p(final SubLObject v_xml_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(v_xml_sme_lexification_wizard, XML_SME_LEXIFICATION_WIZARD);
    }

    public static SubLObject xml_sme_lexification_wizard_initialize_method(final SubLObject self) {
        SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        sme_lexification_wizard.sme_lexification_wizard_initialize_method(self);
        question_answering_agent_class = XML_QUESTION_ANSWERING_AGENT;
        sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        proxy = methods.funcall_class_method_with_0_args(XML_PROXY, NEW);
        sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
        return self;
    }

    public static SubLObject subloop_reserved_initialize_xml_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_xml_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject xml_proxy_p(final SubLObject xml_proxy) {
        return classes.subloop_instanceof_class(xml_proxy, XML_PROXY);
    }

    public static SubLObject xml_proxy_end_session_method(final SubLObject self) {
        xml_proxy_report_results_method(self);
        return NIL;
    }

    public static SubLObject xml_proxy_report_results_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$lexificationDone, NIL, $ATOMIC, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject invoke_xml_sme_lexification_wizard_for_term(final SubLObject v_term, SubLObject phrase, SubLObject mt) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL == hlmt.hlmt_p(mt)) {
            final SubLObject is_relational_termP = lexification_utilities.is_relationalP(v_term);
            mt = (NIL != is_relational_termP) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread);
        }
        lexification_wizard.init_lexification_wizard(UNPROVIDED);
        final SubLObject params = lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread);
        final SubLObject lexwiz = methods.funcall_class_method_with_0_args(XML_SME_LEXIFICATION_WIZARD, NEW);
        lexification_wizard._csetf_lexwiz_term(params, v_term);
        instances.set_slot(lexwiz, LEXWIZ_PARAMETERS, params);
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                methods.funcall_instance_method_with_3_args(lexwiz, LEXIFY, v_term, phrase, mt);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            ans = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        sme_lexification_wizard.reset_sme_lexification_parameters();
        return ans;
    }

    public static SubLObject answer_xml_sme_lexification_wizard_question(final SubLObject id, final SubLObject response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_params = lexification_wizard.get_lexification_object(id);
        final SubLObject agent = instances.get_slot(default_params, INTERLOCUTOR_AGENT);
        SubLObject ans = NIL;
        sme_lexification_wizard.lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), agent);
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                methods.funcall_instance_method_with_1_args(agent, ANSWER_QUESTION, response);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            ans = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return ans;
    }

    public static SubLObject find_guid_in_sme_lexwiz_xml(final SubLObject reply) {
        final SubLObject start_tag_pos = search($str41$_id_, reply, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject id_start_pos = (NIL != start_tag_pos) ? add(FOUR_INTEGER, start_tag_pos) : NIL;
        final SubLObject end_tag_pos = search($str42$__id_, reply, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return (NIL != id_start_pos) && (NIL != end_tag_pos) ? string_utilities.substring(reply, id_start_pos, end_tag_pos) : NIL;
    }

    public static SubLObject declare_xml_sme_lexification_wizard_file() {
        declareFunction(me, "subloop_reserved_initialize_xml_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_xml_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        declareFunction(me, "xml_sme_lexification_wizard_p", "XML-SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        declareFunction(me, "xml_sme_lexification_wizard_initialize_method", "XML-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_xml_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_xml_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-INSTANCE", 1, 0, false);
        declareFunction(me, "xml_proxy_p", "XML-PROXY-P", 1, 0, false);
        declareFunction(me, "xml_proxy_end_session_method", "XML-PROXY-END-SESSION-METHOD", 1, 0, false);
        declareFunction(me, "xml_proxy_report_results_method", "XML-PROXY-REPORT-RESULTS-METHOD", 1, 0, false);
        declareFunction(me, "invoke_xml_sme_lexification_wizard_for_term", "INVOKE-XML-SME-LEXIFICATION-WIZARD-FOR-TERM", 1, 2, false);
        declareFunction(me, "answer_xml_sme_lexification_wizard_question", "ANSWER-XML-SME-LEXIFICATION-WIZARD-QUESTION", 2, 0, false);
        declareFunction(me, "find_guid_in_sme_lexwiz_xml", "FIND-GUID-IN-SME-LEXWIZ-XML", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_xml_sme_lexification_wizard_file() {
        return NIL;
    }

    public static SubLObject setup_xml_sme_lexification_wizard_file() {
        classes.subloop_new_class(XML_SME_LEXIFICATION_WIZARD, SME_LEXIFICATION_WIZARD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(XML_SME_LEXIFICATION_WIZARD, NIL);
        classes.subloop_note_class_initialization_function(XML_SME_LEXIFICATION_WIZARD, SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function(XML_SME_LEXIFICATION_WIZARD, SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE);
        subloop_reserved_initialize_xml_sme_lexification_wizard_class(XML_SME_LEXIFICATION_WIZARD);
        methods.methods_incorporate_instance_method(INITIALIZE, XML_SME_LEXIFICATION_WIZARD, $list16, NIL, $list17);
        methods.subloop_register_instance_method(XML_SME_LEXIFICATION_WIZARD, INITIALIZE, XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        classes.subloop_new_class(XML_PROXY, INTERFACE_PROXY, NIL, NIL, $list23);
        classes.class_set_implements_slot_listeners(XML_PROXY, NIL);
        classes.subloop_note_class_initialization_function(XML_PROXY, SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function(XML_PROXY, SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE);
        subloop_reserved_initialize_xml_proxy_class(XML_PROXY);
        methods.methods_incorporate_instance_method(END_SESSION, XML_PROXY, $list27, NIL, $list28);
        methods.subloop_register_instance_method(XML_PROXY, END_SESSION, XML_PROXY_END_SESSION_METHOD);
        methods.methods_incorporate_instance_method(REPORT_RESULTS, XML_PROXY, $list27, NIL, $list31);
        methods.subloop_register_instance_method(XML_PROXY, REPORT_RESULTS, XML_PROXY_REPORT_RESULTS_METHOD);
        register_external_symbol(INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM);
        register_external_symbol(ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_xml_sme_lexification_wizard_file();
    }

    @Override
    public void initializeVariables() {
        init_xml_sme_lexification_wizard_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xml_sme_lexification_wizard_file();
    }

    
}

/**
 * Total time: 118 ms
 */
