package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_question_answering_agent extends SubLTranslatedFile {
    public static final SubLFile me = new xml_question_answering_agent();

    public static final String myName = "com.cyc.cycjava.cycl.xml_question_answering_agent";

    public static final String myFingerPrint = "d15409b8af4ef8d3e25732c474a78d89dca0acc19352d391f556118090e43099";

    // Internal Constants
    public static final SubLSymbol XML_QUESTION_ANSWERING_AGENT = makeSymbol("XML-QUESTION-ANSWERING-AGENT");

    public static final SubLSymbol QUESTION_ANSWERING_AGENT = makeSymbol("QUESTION-ANSWERING-AGENT");

    public static final SubLList $list2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-HEADER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION-PROPER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-TYPE-DEPENDENT-QUESTION-DATA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-FROM-RESPONSE"), list(makeSymbol("RESPONSE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-QUESTION"), list(makeSymbol("RESPONSE")), makeKeyword("PUBLIC")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-CLASS");





































    private static final SubLSymbol USER_DATA = makeSymbol("USER-DATA");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-INSTANCE");



    public static final SubLList $list27 = list(makeKeyword("PUBLIC"));

    private static final SubLList $list28 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DISPLAY-QUESTION-HEADER"))), list(makeSymbol("DISPLAY-QUESTION-PROPER"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol DISPLAY_QUESTION_HEADER = makeSymbol("DISPLAY-QUESTION-HEADER");

    private static final SubLSymbol XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol("XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");

    private static final SubLList $list31 = list(makeString("Output suitable XML header to *XML-STREAM*."), list(makeSymbol("XML-HEADER"), list(makeSymbol("XML-VERSION")), makeString("US-ASCII"), NIL), list(makeSymbol("GENERATE-XML-HEADER-ENTRY-FOR-DTD"), makeString("termLexifier"), makeString("http://www.opencyc.org/xml/termLexifier.dtd"), makeSymbol("*XML-STREAM*")), list(makeSymbol("RET"), NIL));

    private static final SubLString $str32$US_ASCII = makeString("US-ASCII");

    private static final SubLString $$$termLexifier = makeString("termLexifier");

    private static final SubLString $str34$http___www_opencyc_org_xml_termLe = makeString("http://www.opencyc.org/xml/termLexifier.dtd");

    private static final SubLSymbol XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD = makeSymbol("XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-HEADER-METHOD");

    private static final SubLSymbol DISPLAY_QUESTION_PROPER = makeSymbol("DISPLAY-QUESTION-PROPER");

    private static final SubLList $list37 = list(makeString("Outputs the question proper to *XML-STREAM*."), list(makeSymbol("XML-TAG"), list(makeString("question")), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("id"), NIL, list(makeSymbol("XML-PRINT"), makeSymbol("ID"))), list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("errorMessage"), NIL, list(makeSymbol("XML-PRINT"), makeSymbol("ERROR-MESSAGE")))), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("text"), NIL, list(makeSymbol("XML-PRINT"), makeSymbol("QUESTION"))), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("XML-TAG"), list(makeString("boolean")), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("positiveChoice"), NIL, list(makeSymbol("XML-PRINT"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")))), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("negativeChoice"), NIL, list(makeSymbol("XML-PRINT"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF")))))), list(makeKeyword("ENUMERATED"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CHOICES"), makeSymbol("LISTP")), list(makeSymbol("XML-TAG"), list(makeString("enumerated")), list(makeSymbol("XML-TAG"), list(makeString("choices")), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("CHOICE"), makeSymbol("I"), makeSymbol("CHOICES")), list(makeSymbol("XML-TAG"), list(makeString("choice")), list(makeSymbol("CYCML-SERIALIZE-NUMBER"), makeSymbol("I")), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("label"), NIL, list(makeSymbol("XML-PRINT"), makeSymbol("CHOICE")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(EQUAL, makeSymbol("DEFAULT"), makeSymbol("CHOICE")), list(EQUAL, makeSymbol("DEFAULT"), list(makeSymbol("NTH"), makeSymbol("I"), makeSymbol("VALUES")))), list(makeSymbol("XML-TAG"), list(makeString("default"), NIL, makeKeyword("ATOMIC")))))))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CHOICES"), makeSymbol("LISTP")), list(makeSymbol("XML-TAG"), list(makeString("multipleSelection")), list(makeSymbol("XML-TAG"), list(makeString("choices")), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("CHOICE"), makeSymbol("I"), makeSymbol("CHOICES")), list(makeSymbol("XML-TAG"), list(makeString("choice")), list(makeSymbol("CYCML-SERIALIZE-NUMBER"), makeSymbol("I")), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("label"), NIL, list(makeSymbol("XML-PRINT"), makeSymbol("CHOICE")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("MEMBER?"), makeSymbol("CHOICE"), makeSymbol("DEFAULT"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("MEMBER"), list(makeSymbol("NTH"), makeSymbol("I"), makeSymbol("VALUES")), makeSymbol("DEFAULT"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("XML-TAG"), list(makeString("default"), NIL, makeKeyword("ATOMIC")))))))), list(makeKeyword("FREE-FORM"), list(makeSymbol("XML-TAG"), list(makeString("freeForm")), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("FIELD-WIDTH")), list(makeSymbol("XML-TAG"), list(makeString("fieldWidth")), list(makeSymbol("CYCML-SERIALIZE-NUMBER"), makeSymbol("FIELD-WIDTH")))))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("XML-TAG"), list(makeString("multipleFreeForm")), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("FIELD-WIDTH")), list(makeSymbol("XML-TAG"), list(makeString("fieldWidth")), list(makeSymbol("CYCML-SERIALIZE-NUMBER"), makeSymbol("FIELD-WIDTH")))), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("LABEL"), makeSymbol("I"), makeSymbol("FIELD-LABELS")), list(makeSymbol("CLET"), list(list(makeSymbol("DEFAULT-VALUE"), list(makeSymbol("ELT"), makeSymbol("DEFAULT"), makeSymbol("I"))), list(makeSymbol("OPTIONAL-DESCRIPTION"), list(makeSymbol("ELT"), makeSymbol("DESCRIPTIONS"), makeSymbol("I")))), list(makeSymbol("XML-TAG"), list(makeString("freeFormQuestionOfMultiple")), list(makeSymbol("XML-TAG"), list(makeString("label")), list(makeSymbol("XML-PRINT"), makeSymbol("LABEL"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("DEFAULT-VALUE")), list(makeSymbol("XML-TAG"), list(makeString("default")), list(makeSymbol("XML-PRINT"), makeSymbol("DEFAULT-VALUE")))), list(makeSymbol("PWHEN"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("OPTIONAL-DESCRIPTION")), list(makeSymbol("XML-TAG"), list(makeString("description")), list(makeSymbol("XML-PRINT"), makeSymbol("OPTIONAL-DESCRIPTION"))))))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Unknown question type ~S"), makeSymbol("QUESTION-TYPE")))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("TIP")), list(makeSymbol("CYCML-PRIMITIVE-INDENTED-ELEMENT"), makeString("tip"), NIL, list(makeSymbol("XML-PRINT"), makeSymbol("TIP"))))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLString $$$question = makeString("question");



    private static final SubLString $str41$__ = makeString("~&");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$errorMessage = makeString("errorMessage");

    private static final SubLString $$$text = makeString("text");



    private static final SubLString $$$boolean = makeString("boolean");

    private static final SubLString $$$positiveChoice = makeString("positiveChoice");

    private static final SubLString $$$negativeChoice = makeString("negativeChoice");





    private static final SubLString $$$enumerated = makeString("enumerated");

    private static final SubLString $$$choices = makeString("choices");

    private static final SubLString $$$choice = makeString("choice");

    private static final SubLString $$$label = makeString("label");

    private static final SubLString $$$default = makeString("default");





    private static final SubLString $$$multipleSelection = makeString("multipleSelection");



    private static final SubLString $$$freeForm = makeString("freeForm");

    private static final SubLString $$$fieldWidth = makeString("fieldWidth");

    private static final SubLSymbol $MULTIPLE_FREE_FORM = makeKeyword("MULTIPLE-FREE-FORM");

    private static final SubLString $$$multipleFreeForm = makeString("multipleFreeForm");

    private static final SubLString $$$freeFormQuestionOfMultiple = makeString("freeFormQuestionOfMultiple");

    private static final SubLString $$$description = makeString("description");

    private static final SubLString $str66$Unknown_question_type__S = makeString("Unknown question type ~S");

    private static final SubLString $$$tip = makeString("tip");

    private static final SubLSymbol XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD = makeSymbol("XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD");

    private static final SubLSymbol ANSWER_QUESTION = makeSymbol("ANSWER-QUESTION");

    public static final SubLList $list70 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    private static final SubLList $list71 = list(makeSymbol("RESPONSE"));

    private static final SubLList $list72 = list(makeString("Send RESPONSE to the question posed by the agent."), list(makeSymbol("CLET"), list(list(makeSymbol("DECODED-ANSWER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER-FROM-RESPONSE")), makeSymbol("RESPONSE")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), makeSymbol("DECODED-ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NOTIFY-CLIENT")), makeKeyword("INPUT-READY"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol ANSWER_FROM_RESPONSE = makeSymbol("ANSWER-FROM-RESPONSE");





    private static final SubLSymbol XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD = makeSymbol("XML-QUESTION-ANSWERING-AGENT-ANSWER-QUESTION-METHOD");

    private static final SubLList $list77 = list(makeString("Validate and decode RESPONSE into an appropriate answer to send to the client."), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("CHECK-TYPE"), makeSymbol("RESPONSE"), makeSymbol("STRINGP")), list(makeSymbol("RET"), makeSymbol("RESPONSE"))), list(makeKeyword("ENUMERATED"), list(makeSymbol("CHECK-TYPE"), makeSymbol("RESPONSE"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("RET"), list(makeSymbol("NTH"), makeSymbol("RESPONSE"), list(makeSymbol("FIRST-OF"), makeSymbol("VALUES"), makeSymbol("CHOICES"))))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("CHECK-TYPE"), makeSymbol("RESPONSE"), makeSymbol("LIST-OF-NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("POINTER"), makeSymbol("RESPONSE")), list(makeSymbol("CPUSH"), list(makeSymbol("NTH"), makeSymbol("POINTER"), list(makeSymbol("FIRST-OF"), makeSymbol("VALUES"), makeSymbol("CHOICES"))), makeSymbol("ANSWER"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("ANSWER"))))), list(makeKeyword("FREE-FORM"), list(makeSymbol("CHECK-TYPE"), makeSymbol("RESPONSE"), makeSymbol("STRINGP")), list(makeSymbol("RET"), makeSymbol("RESPONSE"))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("CHECK-TYPE"), makeSymbol("RESPONSE"), makeSymbol("LIST-OF-STRING-P")), list(makeSymbol("RET"), makeSymbol("RESPONSE"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Unknown question type ~S.~% Can't extract answer from ~S~%"), makeSymbol("QUESTION-TYPE"), makeSymbol("RESPONSE")))));

    private static final SubLSymbol $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-XML-QUESTION-ANSWERING-AGENT-METHOD");





    private static final SubLSymbol LIST_OF_NON_NEGATIVE_INTEGER_P = makeSymbol("LIST-OF-NON-NEGATIVE-INTEGER-P");

    private static final SubLSymbol LIST_OF_STRING_P = makeSymbol("LIST-OF-STRING-P");

    private static final SubLString $str83$Unknown_question_type__S____Can_t = makeString("Unknown question type ~S.~% Can't extract answer from ~S~%");

    private static final SubLSymbol XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD = makeSymbol("XML-QUESTION-ANSWERING-AGENT-ANSWER-FROM-RESPONSE-METHOD");

    public static SubLObject subloop_reserved_initialize_xml_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_xml_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject xml_question_answering_agent_p(final SubLObject v_xml_question_answering_agent) {
        return classes.subloop_instanceof_class(v_xml_question_answering_agent, XML_QUESTION_ANSWERING_AGENT);
    }

    public static SubLObject xml_question_answering_agent_display_question_method(final SubLObject self) {
        methods.funcall_instance_method_with_0_args(self, DISPLAY_QUESTION_HEADER);
        xml_question_answering_agent_display_question_proper_method(self);
        return NIL;
    }

    public static SubLObject xml_question_answering_agent_display_question_header_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_header(xml_utilities.xml_version(), $str32$US_ASCII, NIL);
        xml_utilities.generate_xml_header_entry_for_dtd($$$termLexifier, $str34$http___www_opencyc_org_xml_termLe, xml_vars.$xml_stream$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject xml_question_answering_agent_display_question_proper_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_question_answering_agent_method = NIL;
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
            thread.throwStack.push($sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$question, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = $$$id;
                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(id, UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                            if ((NIL != error_message) && (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread))) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = $$$errorMessage;
                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(error_message, UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$3, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = $$$text;
                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(v_question, UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                            final SubLObject pcase_var = question_type;
                            if (pcase_var.eql($BOOLEAN)) {
                                try {
                                    final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$boolean, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                                cycml.cycml_indent();
                                                final SubLObject name_var2 = $$$positiveChoice;
                                                xml_utilities.xml_start_tag_internal(name_var2, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                    xml_utilities.xml_print(sme_lexification_wizard.question_answering_agent_positive_choice_method(self), UNPROVIDED);
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$7, thread);
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var2);
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                                cycml.cycml_indent();
                                                final SubLObject name_var2 = $$$negativeChoice;
                                                xml_utilities.xml_start_tag_internal(name_var2, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                    xml_utilities.xml_print(sme_lexification_wizard.question_answering_agent_negative_choice_method(self), UNPROVIDED);
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var2);
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($$$boolean);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            } else
                                if (pcase_var.eql($ENUMERATED)) {
                                    assert NIL != listp(choices) : "Types.listp(choices) " + "CommonSymbols.NIL != Types.listp(choices) " + choices;
                                    try {
                                        final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal($$$enumerated, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$choices, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            SubLObject list_var = NIL;
                                                            SubLObject choice = NIL;
                                                            SubLObject i = NIL;
                                                            list_var = choices;
                                                            choice = list_var.first();
                                                            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , choice = list_var.first() , i = add(ONE_INTEGER, i)) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$choice, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            cycml.cycml_serialize_number(i, UNPROVIDED);
                                                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                                                                cycml.cycml_indent();
                                                                                final SubLObject name_var3 = $$$label;
                                                                                xml_utilities.xml_start_tag_internal(name_var3, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                                                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                                    xml_utilities.xml_print(choice, UNPROVIDED);
                                                                                } finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                                                                }
                                                                                xml_utilities.xml_end_tag_internal(name_var3);
                                                                            }
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values2 = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$choice);
                                                                        restoreValuesFromVector(_values2);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                                    }
                                                                }
                                                                if (!v_default.equal(choice)) {
                                                                    if (!v_default.equal(nth(i, values))) {
                                                                        continue;
                                                                    }
                                                                }
                                                                try {
                                                                    final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$default, NIL, $ATOMIC, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values3 = getValuesAsVector();
                                                                        restoreValuesFromVector(_values3);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values4 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$choices);
                                                        restoreValuesFromVector(_values4);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values5 = getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal($$$enumerated);
                                            restoreValuesFromVector(_values5);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($MULTIPLE_SELECTION)) {
                                        assert NIL != listp(choices) : "Types.listp(choices) " + "CommonSymbols.NIL != Types.listp(choices) " + choices;
                                        try {
                                            final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$multipleSelection, NIL, NIL, NIL, $UNINITIALIZED);
                                                final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                            xml_utilities.xml_start_tag_internal($$$choices, NIL, NIL, NIL, $UNINITIALIZED);
                                                            final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                SubLObject list_var = NIL;
                                                                SubLObject choice = NIL;
                                                                SubLObject i = NIL;
                                                                list_var = choices;
                                                                choice = list_var.first();
                                                                for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , choice = list_var.first() , i = add(ONE_INTEGER, i)) {
                                                                    try {
                                                                        final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal($$$choice, NIL, NIL, NIL, $UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                cycml.cycml_serialize_number(i, UNPROVIDED);
                                                                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                                                                    cycml.cycml_indent();
                                                                                    final SubLObject name_var3 = $$$label;
                                                                                    xml_utilities.xml_start_tag_internal(name_var3, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                                                    final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                                        xml_utilities.xml_print(choice, UNPROVIDED);
                                                                                    } finally {
                                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                    xml_utilities.xml_end_tag_internal(name_var3);
                                                                                }
                                                                            } finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                                                            }
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$13, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                                                                        }
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values6 = getValuesAsVector();
                                                                            xml_utilities.xml_terpri();
                                                                            xml_utilities.xml_end_tag_internal($$$choice);
                                                                            restoreValuesFromVector(_values6);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                                        }
                                                                    }
                                                                    if (NIL == subl_promotions.memberP(choice, v_default, symbol_function(EQUAL), UNPROVIDED)) {
                                                                        if (NIL == member(nth(i, values), v_default, symbol_function(EQUAL), UNPROVIDED)) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                    try {
                                                                        final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                            xml_utilities.xml_start_tag_internal($$$default, NIL, $ATOMIC, NIL, $UNINITIALIZED);
                                                                            final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                            try {
                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            } finally {
                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                                            }
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$14, thread);
                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                                                                        }
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values7 = getValuesAsVector();
                                                                            restoreValuesFromVector(_values7);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values8 = getValuesAsVector();
                                                            xml_utilities.xml_terpri();
                                                            xml_utilities.xml_end_tag_internal($$$choices);
                                                            restoreValuesFromVector(_values8);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                                        }
                                                    }
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values9 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$multipleSelection);
                                                restoreValuesFromVector(_values9);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($FREE_FORM)) {
                                            try {
                                                final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$freeForm, NIL, NIL, NIL, $UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                        if (field_width.isNumber()) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$fieldWidth, NIL, NIL, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                        cycml.cycml_serialize_number(field_width, UNPROVIDED);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values10 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$fieldWidth);
                                                                    restoreValuesFromVector(_values10);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$15, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values11 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$freeForm);
                                                    restoreValuesFromVector(_values11);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                                }
                                            }
                                        } else
                                            if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                                                try {
                                                    final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$multipleFreeForm, NIL, NIL, NIL, $UNINITIALIZED);
                                                        final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                            if (field_width.isNumber()) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$fieldWidth, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            cycml.cycml_serialize_number(field_width, UNPROVIDED);
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values12 = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$fieldWidth);
                                                                        restoreValuesFromVector(_values12);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                                                    }
                                                                }
                                                            }
                                                            SubLObject list_var2 = NIL;
                                                            SubLObject label = NIL;
                                                            SubLObject j = NIL;
                                                            list_var2 = field_labels;
                                                            label = list_var2.first();
                                                            for (j = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , label = list_var2.first() , j = add(ONE_INTEGER, j)) {
                                                                final SubLObject default_value = elt(v_default, j);
                                                                final SubLObject optional_description = elt(descriptions, j);
                                                                try {
                                                                    final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$freeFormQuestionOfMultiple, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            try {
                                                                                final SubLObject _prev_bind_0_$49 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                try {
                                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                    xml_utilities.xml_start_tag_internal($$$label, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                    final SubLObject _prev_bind_0_$50 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                        xml_utilities.xml_print(label, UNPROVIDED);
                                                                                    } finally {
                                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$50, thread);
                                                                                    }
                                                                                } finally {
                                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$49, thread);
                                                                                }
                                                                            } finally {
                                                                                final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values13 = getValuesAsVector();
                                                                                    xml_utilities.xml_terpri();
                                                                                    xml_utilities.xml_end_tag_internal($$$label);
                                                                                    restoreValuesFromVector(_values13);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                                                                }
                                                                            }
                                                                            if (default_value.isString()) {
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$default, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                            xml_utilities.xml_print(default_value, UNPROVIDED);
                                                                                        } finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$53, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$52, thread);
                                                                                    }
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values14 = getValuesAsVector();
                                                                                        xml_utilities.xml_terpri();
                                                                                        xml_utilities.xml_end_tag_internal($$$default);
                                                                                        restoreValuesFromVector(_values14);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (NIL != string_utilities.non_empty_stringP(optional_description)) {
                                                                                try {
                                                                                    final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                    final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                    try {
                                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                        xml_utilities.xml_start_tag_internal($$$description, NIL, NIL, NIL, $UNINITIALIZED);
                                                                                        final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                            xml_utilities.xml_print(optional_description, UNPROVIDED);
                                                                                        } finally {
                                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$56, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$55, thread);
                                                                                    }
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values15 = getValuesAsVector();
                                                                                        xml_utilities.xml_terpri();
                                                                                        xml_utilities.xml_end_tag_internal($$$description);
                                                                                        restoreValuesFromVector(_values15);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values16 = getValuesAsVector();
                                                                        xml_utilities.xml_terpri();
                                                                        xml_utilities.xml_end_tag_internal($$$freeFormQuestionOfMultiple);
                                                                        restoreValuesFromVector(_values16);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$42, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values17 = getValuesAsVector();
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($$$multipleFreeForm);
                                                        restoreValuesFromVector(_values17);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                                    }
                                                }
                                            } else {
                                                Errors.error($str66$Unknown_question_type__S, question_type);
                                            }




                            if (tip.isString() && (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread))) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str41$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = $$$tip;
                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    xml_utilities.xml_print(tip, UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$60, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
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
                        final SubLObject _values18 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$question);
                        restoreValuesFromVector(_values18);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                sublisp_throw($sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values19 = getValuesAsVector();
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
                    restoreValuesFromVector(_values19);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym38$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_question_answering_agent_method;
    }

    public static SubLObject xml_question_answering_agent_answer_question_method(final SubLObject self, final SubLObject response) {
        SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        final SubLObject decoded_answer = v_answer = methods.funcall_instance_method_with_1_args(self, ANSWER_FROM_RESPONSE, response);
        sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
        methods.funcall_instance_method_with_1_args(self, NOTIFY_CLIENT, $INPUT_READY);
        return NIL;
    }

    public static SubLObject xml_question_answering_agent_answer_from_response_method(final SubLObject self, final SubLObject response) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_question_answering_agent_method = NIL;
        final SubLObject v_answer = sme_lexification_wizard.get_question_answering_agent_answer(self);
        final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values(self);
        final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices(self);
        final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type(self);
        try {
            thread.throwStack.push($sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                final SubLObject pcase_var = question_type;
                if (pcase_var.eql($BOOLEAN)) {
                    assert NIL != stringp(response) : "Types.stringp(response) " + "CommonSymbols.NIL != Types.stringp(response) " + response;
                    sublisp_throw($sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response);
                } else
                    if (pcase_var.eql($ENUMERATED)) {
                        assert NIL != subl_promotions.non_negative_integer_p(response) : "subl_promotions.non_negative_integer_p(response) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(response) " + response;
                        sublisp_throw($sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, nth(response, NIL != values ? values : choices));
                    } else
                        if (pcase_var.eql($MULTIPLE_SELECTION)) {
                            assert NIL != number_utilities.list_of_non_negative_integer_p(response) : "number_utilities.list_of_non_negative_integer_p(response) " + "CommonSymbols.NIL != number_utilities.list_of_non_negative_integer_p(response) " + response;
                            SubLObject v_answer_$78 = NIL;
                            SubLObject cdolist_list_var = response;
                            SubLObject pointer = NIL;
                            pointer = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                v_answer_$78 = cons(nth(pointer, NIL != values ? values : choices), v_answer_$78);
                                cdolist_list_var = cdolist_list_var.rest();
                                pointer = cdolist_list_var.first();
                            } 
                            sublisp_throw($sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, nreverse(v_answer_$78));
                        } else
                            if (pcase_var.eql($FREE_FORM)) {
                                assert NIL != stringp(response) : "Types.stringp(response) " + "CommonSymbols.NIL != Types.stringp(response) " + response;
                                sublisp_throw($sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response);
                            } else
                                if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                                    assert NIL != string_utilities.list_of_string_p(response) : "string_utilities.list_of_string_p(response) " + "CommonSymbols.NIL != string_utilities.list_of_string_p(response) " + response;
                                    sublisp_throw($sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD, response);
                                } else {
                                    Errors.error($str83$Unknown_question_type__S____Can_t, question_type, response);
                                }




            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sme_lexification_wizard.set_question_answering_agent_answer(self, v_answer);
                    sme_lexification_wizard.set_question_answering_agent_values(self, values);
                    sme_lexification_wizard.set_question_answering_agent_choices(self, choices);
                    sme_lexification_wizard.set_question_answering_agent_question_type(self, question_type);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_xml_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_XML_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_question_answering_agent_method;
    }

    public static SubLObject declare_xml_question_answering_agent_file() {
        declareFunction(me, "subloop_reserved_initialize_xml_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_xml_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction(me, "xml_question_answering_agent_p", "XML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction(me, "xml_question_answering_agent_display_question_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction(me, "xml_question_answering_agent_display_question_header_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-HEADER-METHOD", 1, 0, false);
        declareFunction(me, "xml_question_answering_agent_display_question_proper_method", "XML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false);
        declareFunction(me, "xml_question_answering_agent_answer_question_method", "XML-QUESTION-ANSWERING-AGENT-ANSWER-QUESTION-METHOD", 2, 0, false);
        declareFunction(me, "xml_question_answering_agent_answer_from_response_method", "XML-QUESTION-ANSWERING-AGENT-ANSWER-FROM-RESPONSE-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_xml_question_answering_agent_file() {
        return NIL;
    }

    public static SubLObject setup_xml_question_answering_agent_file() {
        classes.subloop_new_class(XML_QUESTION_ANSWERING_AGENT, QUESTION_ANSWERING_AGENT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(XML_QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(XML_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function(XML_QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_XML_QUESTION_ANSWERING_AGENT_INSTANCE);
        subloop_reserved_initialize_xml_question_answering_agent_class(XML_QUESTION_ANSWERING_AGENT);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, XML_QUESTION_ANSWERING_AGENT, $list27, NIL, $list28);
        methods.subloop_register_instance_method(XML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_HEADER, XML_QUESTION_ANSWERING_AGENT, $list27, NIL, $list31);
        methods.subloop_register_instance_method(XML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_HEADER, XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_HEADER_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PROPER, XML_QUESTION_ANSWERING_AGENT, $list27, NIL, $list37);
        methods.subloop_register_instance_method(XML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PROPER, XML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_QUESTION, XML_QUESTION_ANSWERING_AGENT, $list70, $list71, $list72);
        methods.subloop_register_instance_method(XML_QUESTION_ANSWERING_AGENT, ANSWER_QUESTION, XML_QUESTION_ANSWERING_AGENT_ANSWER_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_FROM_RESPONSE, XML_QUESTION_ANSWERING_AGENT, $list27, $list71, $list77);
        methods.subloop_register_instance_method(XML_QUESTION_ANSWERING_AGENT, ANSWER_FROM_RESPONSE, XML_QUESTION_ANSWERING_AGENT_ANSWER_FROM_RESPONSE_METHOD);
        return NIL;
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

    
}

/**
 * Total time: 3393 ms
 */
