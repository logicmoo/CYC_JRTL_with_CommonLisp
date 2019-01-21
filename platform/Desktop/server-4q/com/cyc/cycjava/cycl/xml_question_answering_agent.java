package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_question_answering_agent extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_question_answering_agent";
    public static final String myFingerPrint = "d15409b8af4ef8d3e25732c474a78d89dca0acc19352d391f556118090e43099";
    private static final SubLSymbol $sym0$XML_QUESTION_ANSWERING_AGENT;
    private static final SubLSymbol $sym1$QUESTION_ANSWERING_AGENT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS;
    private static final SubLSymbol $sym6$ISOLATED_P;
    private static final SubLSymbol $sym7$INSTANCE_NUMBER;
    private static final SubLSymbol $sym8$ID;
    private static final SubLSymbol $sym9$TITLE;
    private static final SubLSymbol $sym10$QUESTION;
    private static final SubLSymbol $sym11$TIP;
    private static final SubLSymbol $sym12$QUESTION_TYPE;
    private static final SubLSymbol $sym13$ERROR_MESSAGE;
    private static final SubLSymbol $sym14$CHOICES;
    private static final SubLSymbol $sym15$DESCRIPTIONS;
    private static final SubLSymbol $sym16$VALUES;
    private static final SubLSymbol $sym17$DEFAULT;
    private static final SubLSymbol $sym18$ANSWER;
    private static final SubLSymbol $sym19$FIELD_WIDTH;
    private static final SubLSymbol $sym20$FIELD_LABELS;
    private static final SubLSymbol $sym21$PROXY;
    private static final SubLSymbol $sym22$CALLBACK_FUNCTION;
    private static final SubLSymbol $sym23$CLIENT_DATA;
    private static final SubLSymbol $sym24$USER_DATA;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE;
    private static final SubLSymbol $sym26$DISPLAY_QUESTION;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$DISPLAY_QUESTION_HEADER;
    private static final SubLSymbol $sym30$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
    private static final SubLList $list31;
    private static final SubLString $str32$US_ASCII;
    private static final SubLString $str33$termLexifier;
    private static final SubLString $str34$http___www_opencyc_org_xml_termLe;
    private static final SubLSymbol $sym35$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD;
    private static final SubLSymbol $sym36$DISPLAY_QUESTION_PROPER;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD;
    private static final SubLString $str39$question;
    private static final SubLSymbol $kw40$UNINITIALIZED;
    private static final SubLString $str41$__;
    private static final SubLString $str42$id;
    private static final SubLString $str43$errorMessage;
    private static final SubLString $str44$text;
    private static final SubLSymbol $kw45$BOOLEAN;
    private static final SubLString $str46$boolean;
    private static final SubLString $str47$positiveChoice;
    private static final SubLString $str48$negativeChoice;
    private static final SubLSymbol $kw49$ENUMERATED;
    private static final SubLSymbol $sym50$LISTP;
    private static final SubLString $str51$enumerated;
    private static final SubLString $str52$choices;
    private static final SubLString $str53$choice;
    private static final SubLString $str54$label;
    private static final SubLString $str55$default;
    private static final SubLSymbol $kw56$ATOMIC;
    private static final SubLSymbol $kw57$MULTIPLE_SELECTION;
    private static final SubLString $str58$multipleSelection;
    private static final SubLSymbol $kw59$FREE_FORM;
    private static final SubLString $str60$freeForm;
    private static final SubLString $str61$fieldWidth;
    private static final SubLSymbol $kw62$MULTIPLE_FREE_FORM;
    private static final SubLString $str63$multipleFreeForm;
    private static final SubLString $str64$freeFormQuestionOfMultiple;
    private static final SubLString $str65$description;
    private static final SubLString $str66$Unknown_question_type__S;
    private static final SubLString $str67$tip;
    private static final SubLSymbol $sym68$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD;
    private static final SubLSymbol $sym69$ANSWER_QUESTION;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$ANSWER_FROM_RESPONSE;
    private static final SubLSymbol $sym74$NOTIFY_CLIENT;
    private static final SubLSymbol $kw75$INPUT_READY;
    private static final SubLSymbol $sym76$XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD;
    private static final SubLSymbol $sym79$STRINGP;
    private static final SubLSymbol $sym80$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym81$LIST_OF_NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym82$LIST_OF_STRING_P;
    private static final SubLString $str83$Unknown_question_type__S____Can_t;
    private static final SubLSymbol $sym84$XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 998L)
    public static SubLObject subloop_reserved_initialize_xml_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym3$OBJECT, (SubLObject)xml_question_answering_agent.$sym4$INSTANCE_COUNT, (SubLObject)xml_question_answering_agent.ZERO_INTEGER);
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 998L)
    public static SubLObject subloop_reserved_initialize_xml_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym3$OBJECT, (SubLObject)xml_question_answering_agent.$sym6$ISOLATED_P, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym3$OBJECT, (SubLObject)xml_question_answering_agent.$sym7$INSTANCE_NUMBER, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym8$ID, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym9$TITLE, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym10$QUESTION, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym11$TIP, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym12$QUESTION_TYPE, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym13$ERROR_MESSAGE, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym14$CHOICES, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym15$DESCRIPTIONS, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym16$VALUES, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym17$DEFAULT, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym18$ANSWER, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym19$FIELD_WIDTH, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym20$FIELD_LABELS, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym21$PROXY, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym22$CALLBACK_FUNCTION, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym23$CLIENT_DATA, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym24$USER_DATA, (SubLObject)xml_question_answering_agent.NIL);
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 998L)
    public static SubLObject xml_question_answering_agent_p(final SubLObject v_xml_question_answering_agent) {
        return classes.subloop_instanceof_class(v_xml_question_answering_agent, (SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 1519L)
    public static SubLObject xml_question_answering_agent_display_question_method(final SubLObject self) {
        methods.funcall_instance_method_with_0_args(self, (SubLObject)xml_question_answering_agent.$sym29$DISPLAY_QUESTION_HEADER);
        xml_question_answering_agent_display_question_proper_method(self);
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 1749L)
    public static SubLObject xml_question_answering_agent_display_question_header_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_header(xml_utilities.xml_version(), (SubLObject)xml_question_answering_agent.$str32$US_ASCII, (SubLObject)xml_question_answering_agent.NIL);
        xml_utilities.generate_xml_header_entry_for_dtd((SubLObject)xml_question_answering_agent.$str33$termLexifier, (SubLObject)xml_question_answering_agent.$str34$http___www_opencyc_org_xml_termLe, xml_vars.$xml_stream$.getDynamicValue(thread));
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 2060L)
    public static SubLObject xml_question_answering_agent_display_question_proper_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_question_answering_agent_method = (SubLObject)xml_question_answering_agent.NIL;
        final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels(self);
        final SubLObject field_width = sme_lexification_wizard.get_question_answering_agent_field_width(self);
        final SubLObject v_default = sme_lexification_wizard.get_question_answering_agent_default(self);
        final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values(self);
        final SubLObject descriptions = sme_lexification_wizard.get_question_answering_agent_descriptions(self);
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip(self);
        final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question(self);
        final SubLObject id = sme_lexification_wizard.get_question_answering_agent_id(self);
        try {
            thread.throwStack.push(xml_question_answering_agent.$sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str39$question, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                            if (xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = (SubLObject)xml_question_answering_agent.$str42$id;
                                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(id, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                            if (xml_question_answering_agent.NIL != error_message && xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = (SubLObject)xml_question_answering_agent.$str43$errorMessage;
                                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(error_message, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                            if (xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = (SubLObject)xml_question_answering_agent.$str44$text;
                                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(v_question, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                            final SubLObject pcase_var = question_type;
                            if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw45$BOOLEAN)) {
                                try {
                                    final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str46$boolean, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                            if (xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                                cycml.cycml_indent();
                                                final SubLObject name_var2 = (SubLObject)xml_question_answering_agent.$str47$positiveChoice;
                                                xml_utilities.xml_start_tag_internal(name_var2, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                    xml_utilities.xml_print(sme_lexification_wizard.question_answering_agent_positive_choice_method(self), (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var2);
                                            }
                                            if (xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                                cycml.cycml_indent();
                                                final SubLObject name_var2 = (SubLObject)xml_question_answering_agent.$str48$negativeChoice;
                                                xml_utilities.xml_start_tag_internal(name_var2, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                                final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                    xml_utilities.xml_print(sme_lexification_wizard.question_answering_agent_negative_choice_method(self), (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                }
                                                finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var2);
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str46$boolean);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw49$ENUMERATED)) {
                                assert xml_question_answering_agent.NIL != Types.listp(choices) : choices;
                                try {
                                    final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str51$enumerated, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str52$choices, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                        SubLObject list_var = (SubLObject)xml_question_answering_agent.NIL;
                                                        SubLObject choice = (SubLObject)xml_question_answering_agent.NIL;
                                                        SubLObject i = (SubLObject)xml_question_answering_agent.NIL;
                                                        list_var = choices;
                                                        choice = list_var.first();
                                                        for (i = (SubLObject)xml_question_answering_agent.ZERO_INTEGER; xml_question_answering_agent.NIL != list_var; list_var = list_var.rest(), choice = list_var.first(), i = Numbers.add((SubLObject)xml_question_answering_agent.ONE_INTEGER, i)) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str53$choice, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_number(i, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                        if (xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                                                            cycml.cycml_indent();
                                                                            final SubLObject name_var3 = (SubLObject)xml_question_answering_agent.$str54$label;
                                                                            xml_utilities.xml_start_tag_internal(name_var3, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                                                            final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                                xml_utilities.xml_print(choice, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                            }
                                                                            finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                                                            }
                                                                            xml_utilities.xml_end_tag_internal(name_var3);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str53$choice);
                                                                    Values.restoreValuesFromVector(_values2);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                                }
                                                            }
                                                            if (!v_default.equal(choice)) {
                                                                if (!v_default.equal(ConsesLow.nth(i, values))) {
                                                                    continue;
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str55$default, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw56$ATOMIC, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                                    Values.restoreValuesFromVector(_values3);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                    final SubLObject _values4 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str52$choices);
                                                    Values.restoreValuesFromVector(_values4);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                        final SubLObject _values5 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str51$enumerated);
                                        Values.restoreValuesFromVector(_values5);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                            }
                            else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw57$MULTIPLE_SELECTION)) {
                                assert xml_question_answering_agent.NIL != Types.listp(choices) : choices;
                                try {
                                    final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str58$multipleSelection, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str52$choices, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                        SubLObject list_var = (SubLObject)xml_question_answering_agent.NIL;
                                                        SubLObject choice = (SubLObject)xml_question_answering_agent.NIL;
                                                        SubLObject i = (SubLObject)xml_question_answering_agent.NIL;
                                                        list_var = choices;
                                                        choice = list_var.first();
                                                        for (i = (SubLObject)xml_question_answering_agent.ZERO_INTEGER; xml_question_answering_agent.NIL != list_var; list_var = list_var.rest(), choice = list_var.first(), i = Numbers.add((SubLObject)xml_question_answering_agent.ONE_INTEGER, i)) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str53$choice, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_number(i, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                        if (xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                                                            cycml.cycml_indent();
                                                                            final SubLObject name_var3 = (SubLObject)xml_question_answering_agent.$str54$label;
                                                                            xml_utilities.xml_start_tag_internal(name_var3, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                                                            final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                                xml_utilities.xml_print(choice, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                            }
                                                                            finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                                                            }
                                                                            xml_utilities.xml_end_tag_internal(name_var3);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$13, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                    final SubLObject _values6 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str53$choice);
                                                                    Values.restoreValuesFromVector(_values6);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                            }
                                                            if (xml_question_answering_agent.NIL == subl_promotions.memberP(choice, v_default, Symbols.symbol_function((SubLObject)xml_question_answering_agent.EQUAL), (SubLObject)xml_question_answering_agent.UNPROVIDED)) {
                                                                if (xml_question_answering_agent.NIL == conses_high.member(ConsesLow.nth(i, values), v_default, Symbols.symbol_function((SubLObject)xml_question_answering_agent.EQUAL), (SubLObject)xml_question_answering_agent.UNPROVIDED)) {
                                                                    continue;
                                                                }
                                                            }
                                                            try {
                                                                final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str55$default, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw56$ATOMIC, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$14, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                    final SubLObject _values7 = Values.getValuesAsVector();
                                                                    Values.restoreValuesFromVector(_values7);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                    final SubLObject _values8 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str52$choices);
                                                    Values.restoreValuesFromVector(_values8);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                        final SubLObject _values9 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str58$multipleSelection);
                                        Values.restoreValuesFromVector(_values9);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                    }
                                }
                            }
                            else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw59$FREE_FORM)) {
                                try {
                                    final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str60$freeForm, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                            if (field_width.isNumber()) {
                                                try {
                                                    final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str61$fieldWidth, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                            cycml.cycml_serialize_number(field_width, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                        final SubLObject _values10 = Values.getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str61$fieldWidth);
                                                        Values.restoreValuesFromVector(_values10);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$15, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                        final SubLObject _values11 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str60$freeForm);
                                        Values.restoreValuesFromVector(_values11);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                            }
                            else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw62$MULTIPLE_FREE_FORM)) {
                                try {
                                    final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str63$multipleFreeForm, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                            if (field_width.isNumber()) {
                                                try {
                                                    final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str61$fieldWidth, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                            cycml.cycml_serialize_number(field_width, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                        final SubLObject _values12 = Values.getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str61$fieldWidth);
                                                        Values.restoreValuesFromVector(_values12);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                                    }
                                                }
                                            }
                                            SubLObject list_var2 = (SubLObject)xml_question_answering_agent.NIL;
                                            SubLObject label = (SubLObject)xml_question_answering_agent.NIL;
                                            SubLObject j = (SubLObject)xml_question_answering_agent.NIL;
                                            list_var2 = field_labels;
                                            label = list_var2.first();
                                            for (j = (SubLObject)xml_question_answering_agent.ZERO_INTEGER; xml_question_answering_agent.NIL != list_var2; list_var2 = list_var2.rest(), label = list_var2.first(), j = Numbers.add((SubLObject)xml_question_answering_agent.ONE_INTEGER, j)) {
                                                final SubLObject default_value = Sequences.elt(v_default, j);
                                                final SubLObject optional_description = Sequences.elt(descriptions, j);
                                                try {
                                                    final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str64$freeFormQuestionOfMultiple, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                            try {
                                                                final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str54$label, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                        xml_utilities.xml_print(label, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$50, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$49, thread);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                    final SubLObject _values13 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str54$label);
                                                                    Values.restoreValuesFromVector(_values13);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                                                }
                                                            }
                                                            if (default_value.isString()) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str55$default, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                            xml_utilities.xml_print(default_value, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                        }
                                                                        finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$53, thread);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$52, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                        final SubLObject _values14 = Values.getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str55$default);
                                                                        Values.restoreValuesFromVector(_values14);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                                                                    }
                                                                }
                                                            }
                                                            if (xml_question_answering_agent.NIL != string_utilities.non_empty_stringP(optional_description)) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal((SubLObject)xml_question_answering_agent.$str65$description, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind((SubLObject)xml_question_answering_agent.$kw40$UNINITIALIZED, thread);
                                                                            xml_utilities.xml_print(optional_description, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                                                        }
                                                                        finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$56, thread);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$55, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                                        final SubLObject _values15 = Values.getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str65$description);
                                                                        Values.restoreValuesFromVector(_values15);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                                        }
                                                    }
                                                    finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                                        final SubLObject _values16 = Values.getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str64$freeFormQuestionOfMultiple);
                                                        Values.restoreValuesFromVector(_values16);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$42, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                                        final SubLObject _values17 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str63$multipleFreeForm);
                                        Values.restoreValuesFromVector(_values17);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                    }
                                }
                            }
                            else {
                                Errors.error((SubLObject)xml_question_answering_agent.$str66$Unknown_question_type__S, question_type);
                            }
                            if (tip.isString() && xml_question_answering_agent.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)xml_question_answering_agent.$str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = (SubLObject)xml_question_answering_agent.$str67$tip;
                                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(tip, (SubLObject)xml_question_answering_agent.UNPROVIDED);
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$60, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                        final SubLObject _values18 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)xml_question_answering_agent.$str39$question);
                        Values.restoreValuesFromVector(_values18);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)xml_question_answering_agent.$sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, (SubLObject)xml_question_answering_agent.NIL);
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                    final SubLObject _values19 = Values.getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_field_labels(self, field_labels);
                    sme_lexification_wizard.set_question_answering_agent_field_width(self, field_width);
                    sme_lexification_wizard.set_question_answering_agent_default(self, v_default);
                    sme_lexification_wizard.set_question_answering_agent_values(self, values);
                    sme_lexification_wizard.set_question_answering_agent_descriptions(self, descriptions);
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_error_message(self, error_message);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    sme_lexification_wizard.set_question_answering_agent_tip(self, tip);
                    sme_lexification_wizard.set_question_answering_agent_question(self, v_question);
                    sme_lexification_wizard.set_question_answering_agent_id(self, id);
                    Values.restoreValuesFromVector(_values19);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_question_answering_agent.$sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_question_answering_agent_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 4746L)
    public static SubLObject xml_question_answering_agent_answer_question_method(final SubLObject self, final SubLObject response) {
        SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        final SubLObject decoded_answer = v_answer = methods.funcall_instance_method_with_1_args(self, (SubLObject)xml_question_answering_agent.$sym73$ANSWER_FROM_RESPONSE, response);
        sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)xml_question_answering_agent.$sym74$NOTIFY_CLIENT, (SubLObject)xml_question_answering_agent.$kw75$INPUT_READY);
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-question-answering-agent.lisp", position = 5106L)
    public static SubLObject xml_question_answering_agent_answer_from_response_method(final SubLObject self, final SubLObject response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_question_answering_agent_method = (SubLObject)xml_question_answering_agent.NIL;
        final SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values(self);
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        try {
            thread.throwStack.push(xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                final SubLObject pcase_var = question_type;
                if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw45$BOOLEAN)) {
                    assert xml_question_answering_agent.NIL != Types.stringp(response) : response;
                    Dynamic.sublisp_throw((SubLObject)xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response);
                }
                else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw49$ENUMERATED)) {
                    assert xml_question_answering_agent.NIL != subl_promotions.non_negative_integer_p(response) : response;
                    Dynamic.sublisp_throw((SubLObject)xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, ConsesLow.nth(response, (xml_question_answering_agent.NIL != values) ? values : choices));
                }
                else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw57$MULTIPLE_SELECTION)) {
                    assert xml_question_answering_agent.NIL != number_utilities.list_of_non_negative_integer_p(response) : response;
                    SubLObject v_answer_$78 = (SubLObject)xml_question_answering_agent.NIL;
                    SubLObject cdolist_list_var = response;
                    SubLObject pointer = (SubLObject)xml_question_answering_agent.NIL;
                    pointer = cdolist_list_var.first();
                    while (xml_question_answering_agent.NIL != cdolist_list_var) {
                        v_answer_$78 = (SubLObject)ConsesLow.cons(ConsesLow.nth(pointer, (xml_question_answering_agent.NIL != values) ? values : choices), v_answer_$78);
                        cdolist_list_var = cdolist_list_var.rest();
                        pointer = cdolist_list_var.first();
                    }
                    Dynamic.sublisp_throw((SubLObject)xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, Sequences.nreverse(v_answer_$78));
                }
                else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw59$FREE_FORM)) {
                    assert xml_question_answering_agent.NIL != Types.stringp(response) : response;
                    Dynamic.sublisp_throw((SubLObject)xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response);
                }
                else if (pcase_var.eql((SubLObject)xml_question_answering_agent.$kw62$MULTIPLE_FREE_FORM)) {
                    assert xml_question_answering_agent.NIL != string_utilities.list_of_string_p(response) : response;
                    Dynamic.sublisp_throw((SubLObject)xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response);
                }
                else {
                    Errors.error((SubLObject)xml_question_answering_agent.$str83$Unknown_question_type__S____Can_t, question_type, response);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_question_answering_agent.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
                    sme_lexification_wizard.set_question_answering_agent_values(self, values);
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_question_answering_agent.$sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_question_answering_agent_method;
    }
    
    public static SubLObject declare_xml_question_answering_agent_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "subloop_reserved_initialize_xml_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "subloop_reserved_initialize_xml_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "xml_question_answering_agent_p", "XML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "xml_question_answering_agent_display_question_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "xml_question_answering_agent_display_question_header_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-HEADER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "xml_question_answering_agent_display_question_proper_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "xml_question_answering_agent_answer_question_method", "XML-QUESTION-ANSWERING-AGENT-ANSWER-QUESTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_question_answering_agent", "xml_question_answering_agent_answer_from_response_method", "XML-QUESTION-ANSWERING-AGENT-ANSWER-FROM-RESPONSE-METHOD", 2, 0, false);
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    public static SubLObject init_xml_question_answering_agent_file() {
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    public static SubLObject setup_xml_question_answering_agent_file() {
        classes.subloop_new_class((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym1$QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym5$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym25$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE);
        subloop_reserved_initialize_xml_question_answering_agent_class((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT);
        methods.methods_incorporate_instance_method((SubLObject)xml_question_answering_agent.$sym26$DISPLAY_QUESTION, (SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$list27, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$list28);
        methods.subloop_register_instance_method((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym26$DISPLAY_QUESTION, (SubLObject)xml_question_answering_agent.$sym30$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_question_answering_agent.$sym29$DISPLAY_QUESTION_HEADER, (SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$list27, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$list31);
        methods.subloop_register_instance_method((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym29$DISPLAY_QUESTION_HEADER, (SubLObject)xml_question_answering_agent.$sym35$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_question_answering_agent.$sym36$DISPLAY_QUESTION_PROPER, (SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$list27, (SubLObject)xml_question_answering_agent.NIL, (SubLObject)xml_question_answering_agent.$list37);
        methods.subloop_register_instance_method((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym36$DISPLAY_QUESTION_PROPER, (SubLObject)xml_question_answering_agent.$sym68$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_question_answering_agent.$sym69$ANSWER_QUESTION, (SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$list70, (SubLObject)xml_question_answering_agent.$list71, (SubLObject)xml_question_answering_agent.$list72);
        methods.subloop_register_instance_method((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym69$ANSWER_QUESTION, (SubLObject)xml_question_answering_agent.$sym76$XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_question_answering_agent.$sym73$ANSWER_FROM_RESPONSE, (SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$list27, (SubLObject)xml_question_answering_agent.$list71, (SubLObject)xml_question_answering_agent.$list77);
        methods.subloop_register_instance_method((SubLObject)xml_question_answering_agent.$sym0$XML_QUESTION_ANSWERING_AGENT, (SubLObject)xml_question_answering_agent.$sym73$ANSWER_FROM_RESPONSE, (SubLObject)xml_question_answering_agent.$sym84$XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD);
        return (SubLObject)xml_question_answering_agent.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_xml_question_answering_agent_file();
    }
    
    @Override
	public void initializeVariables() {
        init_xml_question_answering_agent_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_xml_question_answering_agent_file();
    }
    
    static {
        me = (SubLFile)new xml_question_answering_agent();
        $sym0$XML_QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT");
        $sym1$QUESTION_ANSWERING_AGENT = SubLObjectFactory.makeSymbol("QUESTION-ANSWERING-AGENT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-HEADER"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PROPER"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-TYPE-DEPENDENT-QUESTION-DATA"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-FROM-RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym8$ID = SubLObjectFactory.makeSymbol("ID");
        $sym9$TITLE = SubLObjectFactory.makeSymbol("TITLE");
        $sym10$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym11$TIP = SubLObjectFactory.makeSymbol("TIP");
        $sym12$QUESTION_TYPE = SubLObjectFactory.makeSymbol("QUESTION-TYPE");
        $sym13$ERROR_MESSAGE = SubLObjectFactory.makeSymbol("ERROR-MESSAGE");
        $sym14$CHOICES = SubLObjectFactory.makeSymbol("CHOICES");
        $sym15$DESCRIPTIONS = SubLObjectFactory.makeSymbol("DESCRIPTIONS");
        $sym16$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym17$DEFAULT = SubLObjectFactory.makeSymbol("DEFAULT");
        $sym18$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym19$FIELD_WIDTH = SubLObjectFactory.makeSymbol("FIELD-WIDTH");
        $sym20$FIELD_LABELS = SubLObjectFactory.makeSymbol("FIELD-LABELS");
        $sym21$PROXY = SubLObjectFactory.makeSymbol("PROXY");
        $sym22$CALLBACK_FUNCTION = SubLObjectFactory.makeSymbol("CALLBACK-FUNCTION");
        $sym23$CLIENT_DATA = SubLObjectFactory.makeSymbol("CLIENT-DATA");
        $sym24$USER_DATA = SubLObjectFactory.makeSymbol("USER-DATA");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-INSTANCE");
        $sym26$DISPLAY_QUESTION = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-HEADER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PROPER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)xml_question_answering_agent.NIL));
        $sym29$DISPLAY_QUESTION_HEADER = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-HEADER");
        $sym30$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Output suitable XML header to *XML-STREAM*."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-HEADER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-VERSION")), (SubLObject)SubLObjectFactory.makeString("US-ASCII"), (SubLObject)xml_question_answering_agent.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-XML-HEADER-ENTRY-FOR-DTD"), (SubLObject)SubLObjectFactory.makeString("termLexifier"), (SubLObject)SubLObjectFactory.makeString("http://www.opencyc.org/xml/termLexifier.dtd"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)xml_question_answering_agent.NIL));
        $str32$US_ASCII = SubLObjectFactory.makeString("US-ASCII");
        $str33$termLexifier = SubLObjectFactory.makeString("termLexifier");
        $str34$http___www_opencyc_org_xml_termLe = SubLObjectFactory.makeString("http://www.opencyc.org/xml/termLexifier.dtd");
        $sym35$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-HEADER-METHOD");
        $sym36$DISPLAY_QUESTION_PROPER = SubLObjectFactory.makeSymbol("DISPLAY-QUESTION-PROPER");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Outputs the question proper to *XML-STREAM*."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("question")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("id"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("errorMessage"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("text"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("boolean")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("positiveChoice"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("negativeChoice"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENUMERATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("enumerated")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("choices")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("choice")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("label"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)xml_question_answering_agent.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE")), (SubLObject)ConsesLow.list((SubLObject)xml_question_answering_agent.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ATOMIC")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("multipleSelection")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("choices")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("choice")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("label"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)xml_question_answering_agent.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES")), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)xml_question_answering_agent.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ATOMIC")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("freeForm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-WIDTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fieldWidth")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-WIDTH")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("multipleFreeForm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-WIDTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fieldWidth")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-WIDTH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-LABELS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELT"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-DESCRIPTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELT"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("I")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("freeFormQuestionOfMultiple")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("label")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("default")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-DESCRIPTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("description")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-DESCRIPTION"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unknown question type ~S"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TIP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), (SubLObject)SubLObjectFactory.makeString("tip"), (SubLObject)xml_question_answering_agent.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("TIP"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)xml_question_answering_agent.NIL));
        $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-QUESTION-ANSWERING-AGENT-METHOD");
        $str39$question = SubLObjectFactory.makeString("question");
        $kw40$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str41$__ = SubLObjectFactory.makeString("~&");
        $str42$id = SubLObjectFactory.makeString("id");
        $str43$errorMessage = SubLObjectFactory.makeString("errorMessage");
        $str44$text = SubLObjectFactory.makeString("text");
        $kw45$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $str46$boolean = SubLObjectFactory.makeString("boolean");
        $str47$positiveChoice = SubLObjectFactory.makeString("positiveChoice");
        $str48$negativeChoice = SubLObjectFactory.makeString("negativeChoice");
        $kw49$ENUMERATED = SubLObjectFactory.makeKeyword("ENUMERATED");
        $sym50$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str51$enumerated = SubLObjectFactory.makeString("enumerated");
        $str52$choices = SubLObjectFactory.makeString("choices");
        $str53$choice = SubLObjectFactory.makeString("choice");
        $str54$label = SubLObjectFactory.makeString("label");
        $str55$default = SubLObjectFactory.makeString("default");
        $kw56$ATOMIC = SubLObjectFactory.makeKeyword("ATOMIC");
        $kw57$MULTIPLE_SELECTION = SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION");
        $str58$multipleSelection = SubLObjectFactory.makeString("multipleSelection");
        $kw59$FREE_FORM = SubLObjectFactory.makeKeyword("FREE-FORM");
        $str60$freeForm = SubLObjectFactory.makeString("freeForm");
        $str61$fieldWidth = SubLObjectFactory.makeString("fieldWidth");
        $kw62$MULTIPLE_FREE_FORM = SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM");
        $str63$multipleFreeForm = SubLObjectFactory.makeString("multipleFreeForm");
        $str64$freeFormQuestionOfMultiple = SubLObjectFactory.makeString("freeFormQuestionOfMultiple");
        $str65$description = SubLObjectFactory.makeString("description");
        $str66$Unknown_question_type__S = SubLObjectFactory.makeString("Unknown question type ~S");
        $str67$tip = SubLObjectFactory.makeString("tip");
        $sym68$XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD");
        $sym69$ANSWER_QUESTION = SubLObjectFactory.makeSymbol("ANSWER-QUESTION");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Send RESPONSE to the question posed by the agent."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECODED-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-FROM-RESPONSE")), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("DECODED-ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOTIFY-CLIENT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT-READY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)xml_question_answering_agent.NIL));
        $sym73$ANSWER_FROM_RESPONSE = SubLObjectFactory.makeSymbol("ANSWER-FROM-RESPONSE");
        $sym74$NOTIFY_CLIENT = SubLObjectFactory.makeSymbol("NOTIFY-CLIENT");
        $kw75$INPUT_READY = SubLObjectFactory.makeKeyword("INPUT-READY");
        $sym76$XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT-ANSWER-QUESTION-METHOD");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Validate and decode RESPONSE into an appropriate answer to send to the client."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENUMERATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-SELECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)xml_question_answering_agent.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"))), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE-FREE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-STRING-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unknown question type ~S.~% Can't extract answer from ~S~%"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))));
        $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-QUESTION-ANSWERING-AGENT-METHOD");
        $sym79$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym80$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym81$LIST_OF_NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("LIST-OF-NON-NEGATIVE-INTEGER-P");
        $sym82$LIST_OF_STRING_P = SubLObjectFactory.makeSymbol("LIST-OF-STRING-P");
        $str83$Unknown_question_type__S____Can_t = SubLObjectFactory.makeString("Unknown question type ~S.~% Can't extract answer from ~S~%");
        $sym84$XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD = SubLObjectFactory.makeSymbol("XML-QUESTION-ANSWERING-AGENT-ANSWER-FROM-RESPONSE-METHOD");
    }
}

/*

	Total time: 3393 ms
	
*/