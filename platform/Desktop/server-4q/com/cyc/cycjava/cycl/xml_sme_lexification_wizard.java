package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_sme_lexification_wizard extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_sme_lexification_wizard";
    public static final String myFingerPrint = "73c0875bfe49330d24ccf57d70cd1b2ae978a5ce486f44802d3438341b97ec3a";
    private static final SubLSymbol $sym0$XML_SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym1$SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym2$OBJECT;
    private static final SubLSymbol $sym3$INSTANCE_COUNT;
    private static final SubLSymbol $sym4$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS;
    private static final SubLSymbol $sym5$ISOLATED_P;
    private static final SubLSymbol $sym6$INSTANCE_NUMBER;
    private static final SubLSymbol $sym7$STATE;
    private static final SubLSymbol $sym8$NEXT_STATES;
    private static final SubLSymbol $sym9$LEXWIZ_PARAMETERS;
    private static final SubLSymbol $sym10$CURRENT_INTERACTION;
    private static final SubLSymbol $sym11$NEW_CURRENT_INTERACTION;
    private static final SubLSymbol $sym12$PROXY;
    private static final SubLSymbol $sym13$QUESTION_ANSWERING_AGENT_CLASS;
    private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE;
    private static final SubLSymbol $sym15$INITIALIZE;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$XML_QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym19$XML_PROXY;
    private static final SubLSymbol $sym20$NEW;
    private static final SubLSymbol $sym21$XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD;
    private static final SubLSymbol $sym22$INTERFACE_PROXY;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE;
    private static final SubLSymbol $sym26$END_SESSION;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$XML_PROXY_END_SESSION_METHOD;
    private static final SubLSymbol $sym30$REPORT_RESULTS;
    private static final SubLList $list31;
    private static final SubLString $str32$lexificationDone;
    private static final SubLSymbol $kw33$ATOMIC;
    private static final SubLSymbol $kw34$UNINITIALIZED;
    private static final SubLSymbol $sym35$XML_PROXY_REPORT_RESULTS_METHOD;
    private static final SubLSymbol $sym36$INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM;
    private static final SubLSymbol $sym37$LEXIFY;
    private static final SubLSymbol $sym38$ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION;
    private static final SubLSymbol $sym39$INTERLOCUTOR_AGENT;
    private static final SubLSymbol $sym40$ANSWER_QUESTION;
    private static final SubLString $str41$_id_;
    private static final SubLString $str42$__id_;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1011L)
    public static SubLObject subloop_reserved_initialize_xml_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym2$OBJECT, (SubLObject)xml_sme_lexification_wizard.$sym3$INSTANCE_COUNT, (SubLObject)xml_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1011L)
    public static SubLObject subloop_reserved_initialize_xml_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym2$OBJECT, (SubLObject)xml_sme_lexification_wizard.$sym5$ISOLATED_P, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym2$OBJECT, (SubLObject)xml_sme_lexification_wizard.$sym6$INSTANCE_NUMBER, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym7$STATE, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym8$NEXT_STATES, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym9$LEXWIZ_PARAMETERS, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym10$CURRENT_INTERACTION, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym11$NEW_CURRENT_INTERACTION, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym12$PROXY, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym13$QUESTION_ANSWERING_AGENT_CLASS, (SubLObject)xml_sme_lexification_wizard.NIL);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1011L)
    public static SubLObject xml_sme_lexification_wizard_p(final SubLObject v_xml_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(v_xml_sme_lexification_wizard, (SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1190L)
    public static SubLObject xml_sme_lexification_wizard_initialize_method(final SubLObject self) {
        SubLObject question_answering_agent_class = sme_lexification_wizard.get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = sme_lexification_wizard.get_sme_lexification_wizard_proxy(self);
        sme_lexification_wizard.sme_lexification_wizard_initialize_method(self);
        question_answering_agent_class = (SubLObject)xml_sme_lexification_wizard.$sym18$XML_QUESTION_ANSWERING_AGENT;
        sme_lexification_wizard.set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        proxy = methods.funcall_class_method_with_0_args((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$sym20$NEW);
        sme_lexification_wizard.set_sme_lexification_wizard_proxy(self, proxy);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1564L)
    public static SubLObject subloop_reserved_initialize_xml_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym2$OBJECT, (SubLObject)xml_sme_lexification_wizard.$sym3$INSTANCE_COUNT, (SubLObject)xml_sme_lexification_wizard.ZERO_INTEGER);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1564L)
    public static SubLObject subloop_reserved_initialize_xml_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym2$OBJECT, (SubLObject)xml_sme_lexification_wizard.$sym5$ISOLATED_P, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_sme_lexification_wizard.$sym2$OBJECT, (SubLObject)xml_sme_lexification_wizard.$sym6$INSTANCE_NUMBER, (SubLObject)xml_sme_lexification_wizard.NIL);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1564L)
    public static SubLObject xml_proxy_p(final SubLObject xml_proxy) {
        return classes.subloop_instanceof_class(xml_proxy, (SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1758L)
    public static SubLObject xml_proxy_end_session_method(final SubLObject self) {
        xml_proxy_report_results_method(self);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1855L)
    public static SubLObject xml_proxy_report_results_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)xml_sme_lexification_wizard.$str32$lexificationDone, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.$kw33$ATOMIC, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.$kw34$UNINITIALIZED);
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)xml_sme_lexification_wizard.$kw34$UNINITIALIZED, thread);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_sme_lexification_wizard.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 1975L)
    public static SubLObject invoke_xml_sme_lexification_wizard_for_term(final SubLObject v_term, SubLObject phrase, SubLObject mt) {
        if (phrase == xml_sme_lexification_wizard.UNPROVIDED) {
            phrase = (SubLObject)xml_sme_lexification_wizard.NIL;
        }
        if (mt == xml_sme_lexification_wizard.UNPROVIDED) {
            mt = (SubLObject)xml_sme_lexification_wizard.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)xml_sme_lexification_wizard.NIL;
        if (xml_sme_lexification_wizard.NIL == hlmt.hlmt_p(mt)) {
            final SubLObject is_relational_termP = lexification_utilities.is_relationalP(v_term);
            mt = ((xml_sme_lexification_wizard.NIL != is_relational_termP) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread));
        }
        lexification_wizard.init_lexification_wizard((SubLObject)xml_sme_lexification_wizard.UNPROVIDED);
        final SubLObject params = lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread);
        final SubLObject lexwiz = methods.funcall_class_method_with_0_args((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym20$NEW);
        lexification_wizard._csetf_lexwiz_term(params, v_term);
        instances.set_slot(lexwiz, (SubLObject)xml_sme_lexification_wizard.$sym9$LEXWIZ_PARAMETERS, params);
        SubLObject stream = (SubLObject)xml_sme_lexification_wizard.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                methods.funcall_instance_method_with_3_args(lexwiz, (SubLObject)xml_sme_lexification_wizard.$sym37$LEXIFY, v_term, phrase, mt);
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            ans = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_sme_lexification_wizard.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        sme_lexification_wizard.reset_sme_lexification_parameters();
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 2770L)
    public static SubLObject answer_xml_sme_lexification_wizard_question(final SubLObject id, final SubLObject response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_params = lexification_wizard.get_lexification_object(id);
        final SubLObject agent = instances.get_slot(default_params, (SubLObject)xml_sme_lexification_wizard.$sym39$INTERLOCUTOR_AGENT);
        SubLObject ans = (SubLObject)xml_sme_lexification_wizard.NIL;
        sme_lexification_wizard.lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), agent);
        SubLObject stream = (SubLObject)xml_sme_lexification_wizard.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                methods.funcall_instance_method_with_1_args(agent, (SubLObject)xml_sme_lexification_wizard.$sym40$ANSWER_QUESTION, response);
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            ans = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_sme_lexification_wizard.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-sme-lexification-wizard.lisp", position = 3234L)
    public static SubLObject find_guid_in_sme_lexwiz_xml(final SubLObject reply) {
        final SubLObject start_tag_pos = Sequences.search((SubLObject)xml_sme_lexification_wizard.$str41$_id_, reply, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED);
        final SubLObject id_start_pos = (SubLObject)((xml_sme_lexification_wizard.NIL != start_tag_pos) ? Numbers.add((SubLObject)xml_sme_lexification_wizard.FOUR_INTEGER, start_tag_pos) : xml_sme_lexification_wizard.NIL);
        final SubLObject end_tag_pos = Sequences.search((SubLObject)xml_sme_lexification_wizard.$str42$__id_, reply, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED, (SubLObject)xml_sme_lexification_wizard.UNPROVIDED);
        return (SubLObject)((xml_sme_lexification_wizard.NIL != id_start_pos && xml_sme_lexification_wizard.NIL != end_tag_pos) ? string_utilities.substring(reply, id_start_pos, end_tag_pos) : xml_sme_lexification_wizard.NIL);
    }
    
    public static SubLObject declare_xml_sme_lexification_wizard_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "subloop_reserved_initialize_xml_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "subloop_reserved_initialize_xml_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "xml_sme_lexification_wizard_p", "XML-SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "xml_sme_lexification_wizard_initialize_method", "XML-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "subloop_reserved_initialize_xml_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "subloop_reserved_initialize_xml_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "xml_proxy_p", "XML-PROXY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "xml_proxy_end_session_method", "XML-PROXY-END-SESSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "xml_proxy_report_results_method", "XML-PROXY-REPORT-RESULTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "invoke_xml_sme_lexification_wizard_for_term", "INVOKE-XML-SME-LEXIFICATION-WIZARD-FOR-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "answer_xml_sme_lexification_wizard_question", "ANSWER-XML-SME-LEXIFICATION-WIZARD-QUESTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_sme_lexification_wizard", "find_guid_in_sme_lexwiz_xml", "FIND-GUID-IN-SME-LEXWIZ-XML", 1, 0, false);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    public static SubLObject init_xml_sme_lexification_wizard_file() {
        return (SubLObject)xml_sme_lexification_wizard.NIL;
    }
    
    public static SubLObject setup_xml_sme_lexification_wizard_file() {
        classes.subloop_new_class((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym1$SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym4$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym14$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE);
        subloop_reserved_initialize_xml_sme_lexification_wizard_class((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD);
        methods.methods_incorporate_instance_method((SubLObject)xml_sme_lexification_wizard.$sym15$INITIALIZE, (SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$list16, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.$list17);
        methods.subloop_register_instance_method((SubLObject)xml_sme_lexification_wizard.$sym0$XML_SME_LEXIFICATION_WIZARD, (SubLObject)xml_sme_lexification_wizard.$sym15$INITIALIZE, (SubLObject)xml_sme_lexification_wizard.$sym21$XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$sym22$INTERFACE_PROXY, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.$list23);
        classes.class_set_implements_slot_listeners((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$sym24$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$sym25$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE);
        subloop_reserved_initialize_xml_proxy_class((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY);
        methods.methods_incorporate_instance_method((SubLObject)xml_sme_lexification_wizard.$sym26$END_SESSION, (SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$list27, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.$list28);
        methods.subloop_register_instance_method((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$sym26$END_SESSION, (SubLObject)xml_sme_lexification_wizard.$sym29$XML_PROXY_END_SESSION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_sme_lexification_wizard.$sym30$REPORT_RESULTS, (SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$list27, (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)xml_sme_lexification_wizard.$list31);
        methods.subloop_register_instance_method((SubLObject)xml_sme_lexification_wizard.$sym19$XML_PROXY, (SubLObject)xml_sme_lexification_wizard.$sym30$REPORT_RESULTS, (SubLObject)xml_sme_lexification_wizard.$sym35$XML_PROXY_REPORT_RESULTS_METHOD);
        access_macros.register_external_symbol((SubLObject)xml_sme_lexification_wizard.$sym36$INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM);
        access_macros.register_external_symbol((SubLObject)xml_sme_lexification_wizard.$sym38$ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION);
        return (SubLObject)xml_sme_lexification_wizard.NIL;
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
    
    static {
        me = (SubLFile)new xml_sme_lexification_wizard();
        $sym0$XML_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("XML-SME-LEXIFICATION-WIZARD");
        $sym1$SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("SME-LEXIFICATION-WIZARD");
        $sym2$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym3$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym4$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-CLASS");
        $sym5$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym6$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym7$STATE = SubLObjectFactory.makeSymbol("STATE");
        $sym8$NEXT_STATES = SubLObjectFactory.makeSymbol("NEXT-STATES");
        $sym9$LEXWIZ_PARAMETERS = SubLObjectFactory.makeSymbol("LEXWIZ-PARAMETERS");
        $sym10$CURRENT_INTERACTION = SubLObjectFactory.makeSymbol("CURRENT-INTERACTION");
        $sym11$NEW_CURRENT_INTERACTION = SubLObjectFactory.makeSymbol("NEW-CURRENT-INTERACTION");
        $sym12$PROXY = SubLObjectFactory.makeSymbol("PROXY");
        $sym13$QUESTION_ANSWERING_AGENT_CLASS = SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT-CLASS");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_XML_SME_LEXIFICATION_WIZARD_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-SME-LEXIFICATION-WIZARD-INSTANCE");
        $sym15$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROXY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PROXY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym18$XML_QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT");
        $sym19$XML_PROXY = SubLObjectFactory.makeSymbol("XML-PROXY");
        $sym20$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym21$XML_SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("XML-SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");
        $sym22$INTERFACE_PROXY = SubLObjectFactory.makeSymbol("INTERFACE-PROXY");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REPORT-RESULTS"), (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym24$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-CLASS");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_PROXY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-PROXY-INSTANCE");
        $sym26$END_SESSION = SubLObjectFactory.makeSymbol("END-SESSION");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPORT-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)xml_sme_lexification_wizard.NIL));
        $sym29$XML_PROXY_END_SESSION_METHOD = SubLObjectFactory.makeSymbol("XML-PROXY-END-SESSION-METHOD");
        $sym30$REPORT_RESULTS = SubLObjectFactory.makeSymbol("REPORT-RESULTS");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexificationDone"), (SubLObject)xml_sme_lexification_wizard.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ATOMIC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)xml_sme_lexification_wizard.NIL));
        $str32$lexificationDone = SubLObjectFactory.makeString("lexificationDone");
        $kw33$ATOMIC = SubLObjectFactory.makeKeyword("ATOMIC");
        $kw34$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym35$XML_PROXY_REPORT_RESULTS_METHOD = SubLObjectFactory.makeSymbol("XML-PROXY-REPORT-RESULTS-METHOD");
        $sym36$INVOKE_XML_SME_LEXIFICATION_WIZARD_FOR_TERM = SubLObjectFactory.makeSymbol("INVOKE-XML-SME-LEXIFICATION-WIZARD-FOR-TERM");
        $sym37$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym38$ANSWER_XML_SME_LEXIFICATION_WIZARD_QUESTION = SubLObjectFactory.makeSymbol("ANSWER-XML-SME-LEXIFICATION-WIZARD-QUESTION");
        $sym39$INTERLOCUTOR_AGENT = SubLObjectFactory.makeSymbol("INTERLOCUTOR-AGENT");
        $sym40$ANSWER_QUESTION = SubLObjectFactory.makeSymbol("ANSWER-QUESTION");
        $str41$_id_ = SubLObjectFactory.makeString("<id>");
        $str42$__id_ = SubLObjectFactory.makeString("</id>");
    }
}

/*

	Total time: 118 ms
	
*/