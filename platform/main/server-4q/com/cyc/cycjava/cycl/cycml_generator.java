package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cycml_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cycml_generator.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cycml_generator extends SubLTranslatedFile {
    public static final SubLFile me = new cycml_generator();

    public static final String myName = "com.cyc.cycjava.cycl.cycml_generator";

    public static final String myFingerPrint = "828d82d47942b2e957ee9b208a90bd86ecef91657e1b04964f00769c15e9462d";

    // defconstant
    public static final SubLSymbol $dtp_cycml_kp_info$ = makeSymbol("*DTP-CYCML-KP-INFO*");

    // defparameter
    /**
     * When T the serialization context is within an atomic sentence and lists are
     * more likely to be interpreted as el nats.
     */
    private static final SubLSymbol $within_cycl_atomic_sentenceP$ = makeSymbol("*WITHIN-CYCL-ATOMIC-SENTENCE?*");







    public static final SubLString $str3$__ = makeString("~&");

    public static final SubLString $str4$api_request_message = makeString("api-request-message");

    public static final SubLString $str5$api_request = makeString("api-request");

    public static final SubLString $str6$api_request_bindings = makeString("api-request-bindings");

    public static final SubLString $$$justification = makeString("justification");

    public static final SubLString $$$truth = makeString("truth");

    public static final SubLString $str9$api_request_requestor = makeString("api-request-requestor");

    public static final SubLString $str10$api_request_priority = makeString("api-request-priority");

    public static final SubLString $str11$api_request_id = makeString("api-request-id");

    public static final SubLString $$$nonnegativeinteger = makeString("nonnegativeinteger");

    public static final SubLString $$$positiveinteger = makeString("positiveinteger");

    public static final SubLString $str14$new_name = makeString("new-name");

    public static final SubLString $$$date = makeString("date");

    public static final SubLString $$$time = makeString("time");

    public static final SubLString $str17$cyc_image_id = makeString("cyc-image-id");

    public static final SubLString $str18$knowledge_package_id = makeString("knowledge-package-id");

    public static final SubLString $$$sublsymbol = makeString("sublsymbol");

    public static final SubLString $$$sublstring = makeString("sublstring");

    public static final SubLString $$$sublrealnumber = makeString("sublrealnumber");

    public static final SubLString $$$cyclvariable = makeString("cyclvariable");

    public static final SubLString $$$uri = makeString("uri");

    public static final SubLString $$$namespace = makeString("namespace");

    public static final SubLString $$$false = makeString("false");

    public static final SubLString $$$true = makeString("true");

    public static final SubLSymbol CYCML_KP_INFO = makeSymbol("CYCML-KP-INFO");

    public static final SubLSymbol CYCML_KP_INFO_P = makeSymbol("CYCML-KP-INFO-P");

    public static final SubLList $list29 = list(makeSymbol("KNOWLEDGE-PACKAGE-ID"), makeSymbol("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("OPERATIONS"));

    public static final SubLList $list30 = list(makeKeyword("KNOWLEDGE-PACKAGE-ID"), makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeKeyword("OPERATIONS"));

    public static final SubLList $list31 = list(makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("CYCML-KP-INFO-OPERATIONS"));

    public static final SubLList $list32 = list(makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS"));

    public static final SubLSymbol PRINT_CYCML_KP_INFO = makeSymbol("PRINT-CYCML-KP-INFO");

    public static final SubLSymbol CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list35 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYCML-KP-INFO-P"));

    private static final SubLSymbol CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID = makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID");

    private static final SubLSymbol _CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID = makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID");

    private static final SubLSymbol CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES = makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES");

    private static final SubLSymbol _CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES = makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES");

    private static final SubLSymbol CYCML_KP_INFO_OPERATIONS = makeSymbol("CYCML-KP-INFO-OPERATIONS");

    private static final SubLSymbol _CSETF_CYCML_KP_INFO_OPERATIONS = makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS");

    private static final SubLSymbol $KNOWLEDGE_PACKAGE_ID = makeKeyword("KNOWLEDGE-PACKAGE-ID");

    private static final SubLSymbol $KNOWLEDGE_PACKAGE_DEPENDENCIES = makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES");



    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CYCML_KP_INFO = makeSymbol("MAKE-CYCML-KP-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYCML_KP_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCML-KP-INFO-METHOD");

    private static final SubLString $str51$__CYCML_KP_INFO_ = makeString("#<CYCML-KP-INFO:");

    private static final SubLSymbol CYCL_CONSTANT_P = makeSymbol("CYCL-CONSTANT-P");

    private static final SubLSymbol CYCL_FORT_P = makeSymbol("CYCL-FORT-P");



    private static final SubLSymbol $FIND_OR_CREATE = makeKeyword("FIND-OR-CREATE");





























    private static final SubLString $$$cycml = makeString("cycml");

    private static final SubLString $str71$knowledge_package = makeString("knowledge-package");

    private static final SubLString $str72$knowledge_package_dependencies = makeString("knowledge-package-dependencies");

    private static final SubLString $$$operations = makeString("operations");

    private static final SubLList $list74 = list(makeSymbol("CONSTANT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"), makeSymbol("OPERATION-SECOND"), makeSymbol("PURPOSE"));

    private static final SubLString $$$create = makeString("create");

    private static final SubLString $str76$find_or_create = makeString("find-or-create");

    public static final SubLList $list77 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $$$rename = makeString("rename");

    public static final SubLList $list79 = list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $$$merge = makeString("merge");

    public static final SubLList $list81 = list(makeSymbol("FORT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $$$kill = makeString("kill");

    private static final SubLList $list83 = list(new SubLObject[]{ makeSymbol("ASSERTION"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"), makeSymbol("OPERATION-SECOND"), makeSymbol("PURPOSE") });

    private static final SubLString $$$assert = makeString("assert");

    private static final SubLList $list85 = list(makeString("lang"), makeString("en"));

    private static final SubLString $$$reassert = makeString("reassert");

    private static final SubLList $list87 = list(makeSymbol("ASSERTION"), makeSymbol("MT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $$$unassert = makeString("unassert");

    private static final SubLString $$$blast = makeString("blast");

    private static final SubLList $list90 = list(makeSymbol("EXTERNAL-ID"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"), makeSymbol("ARG-TYPES"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $str91$create_skolem = makeString("create-skolem");

    private static final SubLString $str92$skolem_unreified_term = makeString("skolem-unreified-term");

    private static final SubLString $str93$skolem_conjunctive_normal_form = makeString("skolem-conjunctive-normal-form");

    private static final SubLString $str94$skolem_arg_types = makeString("skolem-arg-types");



    private static final SubLString $str96$bookkeeping_info = makeString("bookkeeping-info");

    private static final SubLString $$$Cyclist = makeString("Cyclist");

    private static final SubLString $$$Microtheory = makeString("Microtheory");

    private static final SubLString $$$CycLConstant = makeString("CycLConstant");

    private static final SubLString $str100$urn_uuid_ = makeString("urn:uuid:");

    private static final SubLSymbol CYCL_NART_P = makeSymbol("CYCL-NART-P");

    private static final SubLString $str102$_S_is_not_a_reified_nart = makeString("~S is not a reified nart");

    private static final SubLString $$$CycLReifiedNonAtomicTerm = makeString("CycLReifiedNonAtomicTerm");

    private static final SubLString $str104$Function_Denotational = makeString("Function-Denotational");

    private static final SubLString $str105$argument_list = makeString("argument-list");

    private static final SubLString $$$CycLReifiableNonAtomicTerm = makeString("CycLReifiableNonAtomicTerm");

    private static final SubLSymbol CYCL_NAT_P = makeSymbol("CYCL-NAT-P");

    private static final SubLString $$$ELNonAtomicTerm = makeString("ELNonAtomicTerm");



    private static final SubLList $list110 = list(list(makeSymbol("*WITHIN-CYCL-ATOMIC-SENTENCE?*"), T));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLString $str112$ = makeString("");

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLString $str114$__is_unknown_type_for_CycML_seria = makeString("~ is unknown type for CycML serialization.");

    private static final SubLSymbol CYCML_SERIALIZE_OBJECT_TO_STRING = makeSymbol("CYCML-SERIALIZE-OBJECT-TO-STRING");

    private static final SubLString $$$SubLList = makeString("SubLList");

    private static final SubLString $str117$dotted_item = makeString("dotted-item");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLString $$$not = makeString("not");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLString $$$and = makeString("and");

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLString $$$or = makeString("or");

    private static final SubLObject $$xor = reader_make_constant_shell(makeString("xor"));

    private static final SubLString $$$xor = makeString("xor");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLString $$$implies = makeString("implies");

    private static final SubLObject $$equiv = reader_make_constant_shell(makeString("equiv"));

    private static final SubLString $$$equiv = makeString("equiv");

    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    private static final SubLString $$$forAll = makeString("forAll");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLString $$$thereExists = makeString("thereExists");

    private static final SubLObject $$thereExistExactly = reader_make_constant_shell(makeString("thereExistExactly"));

    private static final SubLString $$$thereExistExactly = makeString("thereExistExactly");

    private static final SubLObject $$thereExistAtMost = reader_make_constant_shell(makeString("thereExistAtMost"));

    private static final SubLString $$$thereExistAtMost = makeString("thereExistAtMost");

    private static final SubLObject $$thereExistAtLeast = reader_make_constant_shell(makeString("thereExistAtLeast"));

    private static final SubLString $$$thereExistAtLeast = makeString("thereExistAtLeast");

    private static final SubLSymbol CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");

    private static final SubLObject $$OpenCycDefinitionalPredicate = reader_make_constant_shell(makeString("OpenCycDefinitionalPredicate"));

    private static final SubLString $$$CycLAtomicSentence = makeString("CycLAtomicSentence");

    private static final SubLString $$$Predicate = makeString("Predicate");

    private static final SubLString $$$purpose = makeString("purpose");

    private static final SubLString $str145$_A__A__A = makeString("~A-~A-~A");

    private static final SubLString $str146$_6__0D = makeString("~6,'0D");

    private static final SubLString $str147$hl_support = makeString("hl-support");

    private static final SubLString $str148$module_token = makeString("module-token");

    public static SubLObject cycml_serialize_knowledge_package_info(final SubLObject cycml_kp_info) {
        cycml.emit_cycml_prologue(UNPROVIDED);
        cycml_serialize_knowledge_package(cycml_kp_info);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != consp(request) : "Types.consp(request) " + "CommonSymbols.NIL != Types.consp(request) " + request;
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        assert NIL != integerp(priority) : "Types.integerp(priority) " + "CommonSymbols.NIL != Types.integerp(priority) " + priority;
        assert NIL != stringp(requestor) : "Types.stringp(requestor) " + "CommonSymbols.NIL != Types.stringp(requestor) " + requestor;
        assert NIL != consp(v_bindings) : "Types.consp(v_bindings) " + "CommonSymbols.NIL != Types.consp(v_bindings) " + v_bindings;
        cycml.emit_cycml_prologue(UNPROVIDED);
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $str4$api_request_message;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$2 = $str5$api_request;
                        xml_utilities.xml_start_tag_internal(name_var_$2, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_subllist(request);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$3, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$2);
                    }
                    cycml_serialize_api_request_id(id, UNPROVIDED);
                    cycml_serialize_api_request_priority(priority, UNPROVIDED);
                    cycml_serialize_api_request_requestor(requestor, UNPROVIDED);
                    if ((NIL != v_bindings) && (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread))) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$3 = $str6$api_request_bindings;
                        xml_utilities.xml_start_tag_internal(name_var_$3, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_subllist(request);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$5, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$3);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$1, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_justification(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        print(supports, UNPROVIDED);
        cycml.emit_cycml_prologue(UNPROVIDED);
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$justification;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var = supports;
                    SubLObject support = NIL;
                    support = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cycml_serialize_support(support);
                        cdolist_list_var = cdolist_list_var.rest();
                        support = cdolist_list_var.first();
                    } 
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$8, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_truth(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$truth, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request_requestor(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str9$api_request_requestor, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request_priority(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str10$api_request_priority, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str11$api_request_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_nonnegativeinteger(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$nonnegativeinteger, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_positiveinteger(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$positiveinteger, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_new_name(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str14$new_name, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_date(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$date, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_time(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$time, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_cyc_image_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str17$cyc_image_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_knowledge_package_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str18$knowledge_package_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_sublsymbol(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublsymbol, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_sublstring(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublstring, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_sublrealnumber(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublrealnumber, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_cyclvariable(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$cyclvariable, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_uri(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$uri, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_namespace(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$namespace, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_false(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$false, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_true(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$true, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_kp_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cycml_kp_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cycml_kp_info_p(final SubLObject v_object) {
        return v_object.getClass() == cycml_generator.$cycml_kp_info_native.class ? T : NIL;
    }

    public static SubLObject cycml_kp_info_knowledge_package_id(final SubLObject v_object) {
        assert NIL != cycml_kp_info_p(v_object) : "cycml_generator.cycml_kp_info_p(v_object) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject cycml_kp_info_knowledge_package_dependencies(final SubLObject v_object) {
        assert NIL != cycml_kp_info_p(v_object) : "cycml_generator.cycml_kp_info_p(v_object) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject cycml_kp_info_operations(final SubLObject v_object) {
        assert NIL != cycml_kp_info_p(v_object) : "cycml_generator.cycml_kp_info_p(v_object) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_cycml_kp_info_knowledge_package_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycml_kp_info_p(v_object) : "cycml_generator.cycml_kp_info_p(v_object) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cycml_kp_info_knowledge_package_dependencies(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycml_kp_info_p(v_object) : "cycml_generator.cycml_kp_info_p(v_object) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cycml_kp_info_operations(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycml_kp_info_p(v_object) : "cycml_generator.cycml_kp_info_p(v_object) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_cycml_kp_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cycml_generator.$cycml_kp_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($KNOWLEDGE_PACKAGE_ID)) {
                _csetf_cycml_kp_info_knowledge_package_id(v_new, current_value);
            } else
                if (pcase_var.eql($KNOWLEDGE_PACKAGE_DEPENDENCIES)) {
                    _csetf_cycml_kp_info_knowledge_package_dependencies(v_new, current_value);
                } else
                    if (pcase_var.eql($OPERATIONS)) {
                        _csetf_cycml_kp_info_operations(v_new, current_value);
                    } else {
                        Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cycml_kp_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CYCML_KP_INFO, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $KNOWLEDGE_PACKAGE_ID, cycml_kp_info_knowledge_package_id(obj));
        funcall(visitor_fn, obj, $SLOT, $KNOWLEDGE_PACKAGE_DEPENDENCIES, cycml_kp_info_knowledge_package_dependencies(obj));
        funcall(visitor_fn, obj, $SLOT, $OPERATIONS, cycml_kp_info_operations(obj));
        funcall(visitor_fn, obj, $END, MAKE_CYCML_KP_INFO, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cycml_kp_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cycml_kp_info(obj, visitor_fn);
    }

    public static SubLObject print_cycml_kp_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str51$__CYCML_KP_INFO_, stream, UNPROVIDED, UNPROVIDED);
        prin1(cycml_kp_info_knowledge_package_id(v_object), stream);
        terpri(stream);
        return NIL;
    }

    public static SubLObject cycml_add_create_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        if (operation_second == UNPROVIDED) {
            operation_second = NIL;
        }
        if (purpose == UNPROVIDED) {
            purpose = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) " + constant;
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if (((NIL != operation_second) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_second))) {
            throw new AssertionError(operation_second);
        }
        if (((NIL != purpose) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(purpose))) {
            throw new AssertionError(purpose);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($CREATE, constant, cyclist, cyc_image_id, operation_time, operation_second, purpose), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_find_or_create_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        if (operation_second == UNPROVIDED) {
            operation_second = NIL;
        }
        if (purpose == UNPROVIDED) {
            purpose = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) " + constant;
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if (((NIL != operation_second) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_second))) {
            throw new AssertionError(operation_second);
        }
        if (((NIL != purpose) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(purpose))) {
            throw new AssertionError(purpose);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($FIND_OR_CREATE, constant, cyclist, cyc_image_id, operation_time, operation_second, purpose), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_rename_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, final SubLObject new_name, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) " + constant;
        assert NIL != constant_completion_high.valid_constant_name_p(new_name) : "constant_completion_high.valid_constant_name_p(new_name) " + "CommonSymbols.NIL != constant_completion_high.valid_constant_name_p(new_name) " + new_name;
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($RENAME, constant, new_name, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_merge_fort_oper(final SubLObject cycml_kp_info, final SubLObject fort_1, final SubLObject fort_2, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_fort_p(fort_1) : "cycl_grammar.cycl_fort_p(fort_1) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(fort_1) " + fort_1;
        assert NIL != cycl_grammar.cycl_fort_p(fort_2) : "cycl_grammar.cycl_fort_p(fort_2) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(fort_2) " + fort_2;
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($MERGE, fort_1, fort_2, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_kill_fort_oper(final SubLObject cycml_kp_info, final SubLObject fort, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_fort_p(fort) : "cycl_grammar.cycl_fort_p(fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(fort) " + fort;
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($KILL, fort, cyclist, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_assert_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        if (operation_second == UNPROVIDED) {
            operation_second = NIL;
        }
        if (purpose == UNPROVIDED) {
            purpose = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) " + assertion;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != strength) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.el_strength_p(strength))) {
            throw new AssertionError(strength);
        }
        if (((NIL != direction) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.direction_p(direction))) {
            throw new AssertionError(direction);
        }
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if (((NIL != operation_second) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_second))) {
            throw new AssertionError(operation_second);
        }
        if (((NIL != purpose) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(purpose))) {
            throw new AssertionError(purpose);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == mt)) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == strength)) {
            strength = assertions_high.assertion_strength(assertion);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == direction)) {
            direction = assertions_high.assertion_direction(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list(new SubLObject[]{ $ASSERT, assertion, mt, strength, direction, cyclist, cyc_image_id, operation_time, operation_second, purpose }), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_reassert_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        if (operation_second == UNPROVIDED) {
            operation_second = NIL;
        }
        if (purpose == UNPROVIDED) {
            purpose = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) " + assertion;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != strength) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.el_strength_p(strength))) {
            throw new AssertionError(strength);
        }
        if (((NIL != direction) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.direction_p(direction))) {
            throw new AssertionError(direction);
        }
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if (((NIL != operation_second) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_second))) {
            throw new AssertionError(operation_second);
        }
        if (((NIL != purpose) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(purpose))) {
            throw new AssertionError(purpose);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == mt)) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == strength)) {
            strength = assertions_high.assertion_strength(assertion);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == direction)) {
            direction = assertions_high.assertion_direction(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list(new SubLObject[]{ $REASSERT, assertion, mt, strength, direction, cyclist, cyc_image_id, operation_time, operation_second, purpose }), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_unassert_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) " + assertion;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == mt)) {
            mt = assertions_high.assertion_mt(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($UNASSERT, assertion, mt, cyclist, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_blast_assertion_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) " + assertion;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == mt)) {
            mt = assertions_high.assertion_mt(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list($BLAST, assertion, mt, cyclist, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_add_create_skolem_oper(final SubLObject cycml_kp_info, final SubLObject external_id, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types, final SubLObject cyclist, final SubLObject cyc_image_id, final SubLObject operation_time) {
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) " + cycml_kp_info;
        assert NIL != constants_high.constant_external_id_p(external_id) : "constants_high.constant_external_id_p(external_id) " + "CommonSymbols.NIL != constants_high.constant_external_id_p(external_id) " + external_id;
        assert NIL != consp(unreified_sk_term) : "Types.consp(unreified_sk_term) " + "CommonSymbols.NIL != Types.consp(unreified_sk_term) " + unreified_sk_term;
        assert NIL != cycl_grammar.cycl_fort_p(mt) : "cycl_grammar.cycl_fort_p(mt) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(mt) " + mt;
        assert NIL != listp(cnfs) : "Types.listp(cnfs) " + "CommonSymbols.NIL != Types.listp(cnfs) " + cnfs;
        assert NIL != listp(arg_types) : "Types.listp(arg_types) " + "CommonSymbols.NIL != Types.listp(arg_types) " + arg_types;
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = cons(list(new SubLObject[]{ $CREATE_SKOLEM, external_id, unreified_sk_term, mt, cnfs, arg_types, cyclist, cyc_image_id, operation_time }), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return NIL;
    }

    public static SubLObject cycml_serialize_knowledge_package(final SubLObject cycml_kp_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$cycml;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$10 = $str71$knowledge_package;
                        xml_utilities.xml_start_tag_internal(name_var_$10, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_knowledge_package_id(cycml_kp_info_knowledge_package_id(cycml_kp_info), UNPROVIDED);
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                    cycml.cycml_indent();
                                    final SubLObject name_var_$11 = $str72$knowledge_package_dependencies;
                                    xml_utilities.xml_start_tag_internal(name_var_$11, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                    final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                        final SubLObject _prev_bind_0_$13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            SubLObject cdolist_list_var = cycml_kp_info_knowledge_package_dependencies(cycml_kp_info);
                                            SubLObject knowledge_package_dependency = NIL;
                                            knowledge_package_dependency = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                cycml_serialize_knowledge_package_id(knowledge_package_dependency, UNPROVIDED);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                knowledge_package_dependency = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                            cycml.cycml_indent();
                                        }
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_$11);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$11, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$10);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$12 = $$$operations;
                        xml_utilities.xml_start_tag_internal(name_var_$12, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var2 = reverse(cycml_kp_info_operations(cycml_kp_info));
                                SubLObject operation = NIL;
                                operation = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    cycml_serialize_operation(operation);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    operation = cdolist_list_var2.first();
                                } 
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$15, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$12);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$9, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_operation(final SubLObject operation) {
        final SubLObject pcase_var;
        final SubLObject operation_type = pcase_var = operation.first();
        if (pcase_var.eql($CREATE)) {
            cycml_serialize_create_constant_oper(operation.rest());
        } else
            if (pcase_var.eql($FIND_OR_CREATE)) {
                cycml_serialize_find_or_create_constant_oper(operation.rest());
            } else
                if (pcase_var.eql($RENAME)) {
                    cycml_serialize_rename_constant_oper(operation.rest());
                } else
                    if (pcase_var.eql($MERGE)) {
                        cycml_serialize_merge_forts_oper(operation.rest());
                    } else
                        if (pcase_var.eql($KILL)) {
                            cycml_serialize_kill_fort_oper(operation.rest());
                        } else
                            if (pcase_var.eql($ASSERT)) {
                                cycml_serialize_assert_oper(operation.rest());
                            } else
                                if (pcase_var.eql($REASSERT)) {
                                    cycml_serialize_reassert_oper(operation.rest());
                                } else
                                    if (pcase_var.eql($UNASSERT)) {
                                        cycml_serialize_unassert_oper(operation.rest());
                                    } else
                                        if (pcase_var.eql($BLAST)) {
                                            cycml_serialize_blast_assertion_oper(operation.rest());
                                        } else
                                            if (pcase_var.eql($CREATE_SKOLEM)) {
                                                cycml_serialize_create_skolem_oper(operation.rest());
                                            }









        return NIL;
    }

    public static SubLObject cycml_serialize_create_constant_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        SubLObject operation_second = NIL;
        SubLObject purpose = NIL;
        destructuring_bind_must_consp(parms, parms, $list74);
        constant = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        operation_time = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        operation_second = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        purpose = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$create;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclconstant(constant);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$19, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list74);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_find_or_create_constant_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        SubLObject operation_second = NIL;
        SubLObject purpose = NIL;
        destructuring_bind_must_consp(parms, parms, $list74);
        constant = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        operation_time = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        operation_second = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list74);
        purpose = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $str76$find_or_create;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclconstant(constant);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$20, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list74);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_rename_constant_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = NIL;
        SubLObject new_name = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        destructuring_bind_must_consp(parms, parms, $list77);
        constant = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list77);
        new_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list77);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list77);
        operation_time = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$rename;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclconstant(constant);
                        cycml_serialize_new_name(new_name, UNPROVIDED);
                        cycml_serialize_bookkeeping(NIL, cyc_image_id, operation_time, NIL, NIL);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$21, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list77);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_merge_forts_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fort_1 = NIL;
        SubLObject fort_2 = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        destructuring_bind_must_consp(parms, parms, $list79);
        fort_1 = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list79);
        fort_2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list79);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list79);
        operation_time = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$merge;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_fort(fort_1);
                        cycml_serialize_fort(fort_2);
                        cycml_serialize_bookkeeping(NIL, cyc_image_id, operation_time, NIL, NIL);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$22, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list79);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_kill_fort_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fort = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        destructuring_bind_must_consp(parms, parms, $list81);
        fort = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list81);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list81);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list81);
        operation_time = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$kill;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_fort(fort);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$23, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list81);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_assert_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        SubLObject operation_second = NIL;
        SubLObject purpose = NIL;
        destructuring_bind_must_consp(parms, parms, $list83);
        assertion = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        strength = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        operation_time = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        operation_second = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        purpose = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$assert;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml.cycml_serialize_paraphrase(pph_main.generate_phrase(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $list85);
                        cycml_serialize_microtheory(mt);
                        cycml.cycml_serialize_strength(strength);
                        cycml.cycml_serialize_direction(direction);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$24, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list83);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_reassert_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        SubLObject direction = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        SubLObject operation_second = NIL;
        SubLObject purpose = NIL;
        destructuring_bind_must_consp(parms, parms, $list83);
        assertion = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        strength = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        operation_time = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        operation_second = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list83);
        purpose = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$reassert;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml_serialize_microtheory(mt);
                        cycml.cycml_serialize_strength(strength);
                        cycml.cycml_serialize_direction(direction);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$25, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list83);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_unassert_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        SubLObject mt = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        destructuring_bind_must_consp(parms, parms, $list87);
        assertion = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        operation_time = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$unassert;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml_serialize_microtheory(mt);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$26, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list87);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_blast_assertion_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        SubLObject mt = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        destructuring_bind_must_consp(parms, parms, $list87);
        assertion = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list87);
        operation_time = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$blast;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml_serialize_microtheory(mt);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$27, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list87);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_create_skolem_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject external_id = NIL;
        SubLObject unreified_sk_term = NIL;
        SubLObject mt = NIL;
        SubLObject cnfs = NIL;
        SubLObject arg_types = NIL;
        SubLObject cyclist = NIL;
        SubLObject cyc_image_id = NIL;
        SubLObject operation_time = NIL;
        destructuring_bind_must_consp(parms, parms, $list90);
        external_id = parms.first();
        SubLObject current = parms.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        unreified_sk_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        cnfs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        arg_types = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        cyc_image_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, parms, $list90);
        operation_time = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $str91$create_skolem;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml.cycml_serialize_guid(external_id, UNPROVIDED);
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$29 = $str92$skolem_unreified_term;
                            xml_utilities.xml_start_tag_internal(name_var_$29, NIL, NIL, NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_subllist(unreified_sk_term);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$30, thread);
                                }
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                    cycml.cycml_indent();
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$29);
                        }
                        cycml_serialize_microtheory(mt);
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$30 = $str93$skolem_conjunctive_normal_form;
                            xml_utilities.xml_start_tag_internal(name_var_$30, NIL, NIL, NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_subllist(cnfs);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$32, thread);
                                }
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                    cycml.cycml_indent();
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$30);
                        }
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$31 = $str94$skolem_arg_types;
                            xml_utilities.xml_start_tag_internal(name_var_$31, NIL, NIL, NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_subllist(arg_types);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$34, thread);
                                }
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                    cycml.cycml_indent();
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$31);
                        }
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$28, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cdestructuring_bind_error(parms, $list90);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_bookkeeping(final SubLObject cyclist, final SubLObject cyc_image_id, final SubLObject operation_time, final SubLObject operation_second, final SubLObject purpose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != cyclist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(cyclist))) {
            throw new AssertionError(cyclist);
        }
        if (((NIL != cyc_image_id) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(cyc_image_id))) {
            throw new AssertionError(cyc_image_id);
        }
        if (((NIL != operation_time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(operation_time))) {
            throw new AssertionError(operation_time);
        }
        if (((NIL != operation_second) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numeric_date_utilities.universal_second_p(operation_second))) {
            throw new AssertionError(operation_second);
        }
        if (((NIL != purpose) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cycl_grammar.cycl_fort_p(purpose))) {
            throw new AssertionError(purpose);
        }
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $str96$bookkeeping_info;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if ((NIL != cyclist) && (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread))) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$39 = $$$Cyclist;
                        xml_utilities.xml_start_tag_internal(name_var_$39, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_cyclconstant(cyclist);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$40, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$39);
                    }
                    if (NIL != cyc_image_id) {
                        cycml_serialize_cyc_image_id(cyc_image_id, UNPROVIDED);
                    }
                    if (NIL != operation_time) {
                        cycml_serialize_universal_date(operation_time);
                    }
                    if (NIL != operation_second) {
                        cycml_serialize_universal_second(operation_second);
                    }
                    if (NIL != purpose) {
                        cycml_serialize_purpose(purpose);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$38, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_microtheory(final SubLObject el_or_hl_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) : "cycl_grammar.cycl_fort_p(el_or_hl_fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) " + el_or_hl_fort;
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$Microtheory;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycl_grammar.cycl_constant_p(el_or_hl_fort)) {
                        cycml_serialize_cyclconstant(el_or_hl_fort);
                    } else {
                        cycml_serialize_cyclreifiablenonatomicterm(el_or_hl_fort);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$42, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_fort(final SubLObject el_or_hl_fort) {
        assert NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) : "cycl_grammar.cycl_fort_p(el_or_hl_fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) " + el_or_hl_fort;
        if (NIL != cycl_grammar.cycl_constant_p(el_or_hl_fort)) {
            cycml_serialize_cyclconstant(el_or_hl_fort);
        } else
            if (NIL != nart_handles.nart_p(el_or_hl_fort)) {
                cycml_serialize_cyclreifiednonatomicterm(el_or_hl_fort);
            } else {
                cycml_serialize_cyclreifiablenonatomicterm(el_or_hl_fort);
            }

        return NIL;
    }

    public static SubLObject cycml_serialize_cyclconstant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) " + constant;
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$CycLConstant;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml.cycml_serialize_name(constants_high.constant_name_within_namespace(constant), UNPROVIDED);
                    cycml_serialize_namespace(constants_high.constant_namespace(constant), UNPROVIDED);
                    cycml.cycml_serialize_guid(constants_high.constant_external_id(constant), UNPROVIDED);
                    cycml_serialize_uri(cconcatenate($str100$urn_uuid_, Guids.guid_to_string(constants_high.constant_guid(constant))), UNPROVIDED);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$43, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_cyclreifiednonatomicterm(final SubLObject el_or_hl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) : "cycl_grammar.cycl_nart_p(el_or_hl_nart) " + "CommonSymbols.NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) " + el_or_hl_nart;
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == nart_handles.nart_p(el_or_hl_nart))) && ((!el_or_hl_nart.isList()) || (NIL == nart_handles.nart_p(el_or_hl_nart)))) {
            Errors.error($str102$_S_is_not_a_reified_nart, el_or_hl_nart);
        }
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$CycLReifiedNonAtomicTerm;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$45 = $str104$Function_Denotational;
                        xml_utilities.xml_start_tag_internal(name_var_$45, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(cycl_utilities.nat_functor(el_or_hl_nart));
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$46, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$45);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$46 = $str105$argument_list;
                        xml_utilities.xml_start_tag_internal(name_var_$46, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_or_hl_nart, UNPROVIDED);
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cycml_serialize_object(arg);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$48, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$46);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$44, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_cyclreifiablenonatomicterm(final SubLObject el_or_hl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) : "cycl_grammar.cycl_nart_p(el_or_hl_nart) " + "CommonSymbols.NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) " + el_or_hl_nart;
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$CycLReifiableNonAtomicTerm;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$52 = $str104$Function_Denotational;
                        xml_utilities.xml_start_tag_internal(name_var_$52, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$52 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(cycl_utilities.nat_functor(el_or_hl_nart));
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$53, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$52, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$52);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$53 = $str105$argument_list;
                        xml_utilities.xml_start_tag_internal(name_var_$53, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_or_hl_nart, UNPROVIDED);
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cycml_serialize_object(arg);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$55, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$53);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$51, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_elnonatomicterm(final SubLObject el_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_nat_p(el_nat) : "cycl_grammar.cycl_nat_p(el_nat) " + "CommonSymbols.NIL != cycl_grammar.cycl_nat_p(el_nat) " + el_nat;
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$ELNonAtomicTerm;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$58 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$59 = $str104$Function_Denotational;
                        xml_utilities.xml_start_tag_internal(name_var_$59, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(cycl_utilities.nat_functor(el_nat));
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$60, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$59);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$60 = $str105$argument_list;
                        xml_utilities.xml_start_tag_internal(name_var_$60, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$61 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_nat, UNPROVIDED);
                                SubLObject arg = NIL;
                                arg = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cycml_serialize_object(arg);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$62, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$61, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$60);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$58, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject within_cycl_atomic_sentence(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list110, append(body, NIL));
    }

    public static SubLObject cycml_serialize_object(final SubLObject obj) {
        if (NIL != cycl_grammar.cycl_variable_p(obj)) {
            cycml_serialize_cyclvariable(obj, UNPROVIDED);
        } else
            if (obj.isSymbol()) {
                cycml_serialize_sublsymbol(obj, UNPROVIDED);
            } else
                if (NIL != nart_handles.nart_p(obj)) {
                    cycml_serialize_cyclreifiednonatomicterm(obj);
                } else
                    if (NIL != assertion_handles.assertion_p(obj)) {
                        cycml_serialize_cyclsentence(assertions_high.assertion_formula(obj));
                    } else
                        if (NIL != Guids.guid_p(obj)) {
                            cycml.cycml_serialize_guid(obj, UNPROVIDED);
                        } else
                            if (obj.isNumber()) {
                                cycml_serialize_sublrealnumber(obj, UNPROVIDED);
                            } else
                                if (obj.isString()) {
                                    cycml_serialize_sublstring(obj, UNPROVIDED);
                                } else
                                    if (obj.eql($$True)) {
                                        cycml_serialize_true($str112$, UNPROVIDED);
                                    } else
                                        if (obj.eql($$False)) {
                                            cycml_serialize_false($str112$, UNPROVIDED);
                                        } else
                                            if (NIL != cycl_grammar.cycl_constant_p(obj)) {
                                                cycml_serialize_cyclconstant(obj);
                                            } else
                                                if ((!obj.isList()) && (NIL != cycl_grammar.cycl_nat_p(obj))) {
                                                    cycml_serialize_cyclreifiablenonatomicterm(obj);
                                                } else
                                                    if (obj.isList() && (NIL != cycl_grammar.cycl_nat_p(obj))) {
                                                        cycml_serialize_elnonatomicterm(obj);
                                                    } else
                                                        if (obj.isList() && (NIL != el_grammar.el_sentence_p(obj))) {
                                                            cycml_serialize_cyclsentence(obj);
                                                        } else
                                                            if (obj.isList()) {
                                                                cycml_serialize_subllist(obj);
                                                            } else {
                                                                Errors.error($str114$__is_unknown_type_for_CycML_seria, obj);
                                                            }













        return NIL;
    }

    public static SubLObject cycml_serialize_object_to_string(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                cycml_serialize_object(obj);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            output_string = get_output_stream_string(stream);
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
        return output_string;
    }

    public static SubLObject cycml_serialize_subllist(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$SubLList;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$65 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject rest;
                    for (rest = NIL, rest = list; rest.isCons(); rest = rest.rest()) {
                        cycml_serialize_object(rest.first());
                    }
                    if ((NIL != rest) && (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread))) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$66 = $str117$dotted_item;
                        xml_utilities.xml_start_tag_internal(name_var_$66, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$66 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$67 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(rest);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$67, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$66, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$66);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$65, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_cyclsentence(final SubLObject el_or_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_sentence_p(el_or_hl_formula) : "cycl_grammar.cycl_sentence_p(el_or_hl_formula) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(el_or_hl_formula) " + el_or_hl_formula;
        final SubLObject arg0 = cycl_utilities.cycl_formula_arg0(el_or_hl_formula);
        if (arg0.eql($$not)) {
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = $$$not;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$69 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$69, thread);
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else
            if (arg0.eql($$and)) {
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                    final SubLObject name_var = $$$and;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                    final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                        final SubLObject _prev_bind_0_$70 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_formula);
                            SubLObject sentence = NIL;
                            sentence = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cycml_serialize_cyclsentence(sentence);
                                cdolist_list_var = cdolist_list_var.rest();
                                sentence = cdolist_list_var.first();
                            } 
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$70, thread);
                        }
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            } else
                if (arg0.eql($$or)) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var = $$$or;
                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$71 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_formula);
                                SubLObject sentence = NIL;
                                sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cycml_serialize_cyclsentence(sentence);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sentence = cdolist_list_var.first();
                                } 
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$71, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    }
                } else
                    if (arg0.eql($$xor)) {
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var = $$$xor;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$72 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$72, thread);
                                }
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                    cycml.cycml_indent();
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    } else
                        if (arg0.eql($$implies)) {
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                                final SubLObject name_var = $$$implies;
                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$73 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$73, thread);
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                        cycml.cycml_indent();
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                        } else
                            if (arg0.eql($$equiv)) {
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                    cycml.cycml_indent();
                                    final SubLObject name_var = $$$equiv;
                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                    final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                        final SubLObject _prev_bind_0_$74 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                            cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$74, thread);
                                        }
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                            cycml.cycml_indent();
                                        }
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var);
                                }
                            } else
                                if (arg0.eql($$forAll)) {
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                        cycml.cycml_indent();
                                        final SubLObject name_var = $$$forAll;
                                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                        final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                            final SubLObject _prev_bind_0_$75 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                cycml.cycml_serialize_variable(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$75, thread);
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                cycml.cycml_indent();
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var);
                                    }
                                } else
                                    if (arg0.eql($$thereExists)) {
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                            cycml.cycml_indent();
                                            final SubLObject name_var = $$$thereExists;
                                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                final SubLObject _prev_bind_0_$76 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                    cycml.cycml_indent();
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var);
                                        }
                                    } else
                                        if (arg0.eql($$thereExistExactly)) {
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                cycml.cycml_indent();
                                                final SubLObject name_var = $$$thereExistExactly;
                                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                    final SubLObject _prev_bind_0_$77 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                        cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                        cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), UNPROVIDED);
                                                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$77, thread);
                                                    }
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                        cycml.cycml_indent();
                                                    }
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var);
                                            }
                                        } else
                                            if (arg0.eql($$thereExistAtMost)) {
                                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                    cycml.cycml_indent();
                                                    final SubLObject name_var = $$$thereExistAtMost;
                                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                    final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                        final SubLObject _prev_bind_0_$78 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                            cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                            cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), UNPROVIDED);
                                                            cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$78, thread);
                                                        }
                                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                            cycml.cycml_indent();
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var);
                                                }
                                            } else
                                                if (arg0.eql($$thereExistAtLeast)) {
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                        cycml.cycml_indent();
                                                        final SubLObject name_var = $$$thereExistAtLeast;
                                                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                        final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                            final SubLObject _prev_bind_0_$79 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                                cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), UNPROVIDED);
                                                                cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$79, thread);
                                                            }
                                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                                                cycml.cycml_indent();
                                                            }
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                                                        }
                                                        xml_utilities.xml_end_tag_internal(name_var);
                                                    }
                                                } else {
                                                    cycml_serialize_cyclatomicsentence(el_or_hl_formula);
                                                }










        return NIL;
    }

    public static SubLObject cycml_serialize_cyclatomicsentence(final SubLObject el_or_hl_atomic_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) : "cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) " + el_or_hl_atomic_sentence;
        final SubLObject pred = cycl_utilities.cycl_formula_arg0(el_or_hl_atomic_sentence);
        final SubLObject _prev_bind_0 = $within_cycl_atomic_sentenceP$.currentBinding(thread);
        try {
            $within_cycl_atomic_sentenceP$.bind(T, thread);
            if (NIL != isa.isaP(pred, $$OpenCycDefinitionalPredicate, UNPROVIDED, UNPROVIDED)) {
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                    final SubLObject name_var = constants_high.constant_name(pred);
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                    final SubLObject _prev_bind_0_$80 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                        final SubLObject _prev_bind_0_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_atomic_sentence);
                            SubLObject arg = NIL;
                            arg = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cycml_serialize_object(arg);
                                cdolist_list_var = cdolist_list_var.rest();
                                arg = cdolist_list_var.first();
                            } 
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$81, thread);
                        }
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$80, thread);
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            } else
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                    final SubLObject name_var = $$$CycLAtomicSentence;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                    final SubLObject _prev_bind_0_$82 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                        final SubLObject _prev_bind_0_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                                final SubLObject name_var_$84 = $$$Predicate;
                                xml_utilities.xml_start_tag_internal(name_var_$84, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$85 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_object(cycl_utilities.cycl_formula_arg0(el_or_hl_atomic_sentence));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$85, thread);
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                        cycml.cycml_indent();
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$84, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$84);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                                final SubLObject name_var_$85 = $str105$argument_list;
                                xml_utilities.xml_start_tag_internal(name_var_$85, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$87 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        SubLObject cdolist_list_var2 = cycl_utilities.cycl_formula_args(el_or_hl_atomic_sentence);
                                        SubLObject v_term = NIL;
                                        v_term = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            cycml_serialize_object(v_term);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            v_term = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$87, thread);
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                        cycml.cycml_indent();
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$86, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$85);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$83, thread);
                        }
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                            cycml.cycml_indent();
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$82, thread);
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }

        } finally {
            $within_cycl_atomic_sentenceP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_purpose(final SubLObject purpose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $$$purpose;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_cyclconstant(purpose);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$90, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_universal_date(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
        final SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject formatted_date = format(NIL, $str145$_A__A__A, new SubLObject[]{ year, month, day });
        cycml_serialize_date(formatted_date, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cycml_serialize_universal_second(final SubLObject universal_second) {
        assert NIL != numeric_date_utilities.universal_second_p(universal_second) : "numeric_date_utilities.universal_second_p(universal_second) " + "CommonSymbols.NIL != numeric_date_utilities.universal_second_p(universal_second) " + universal_second;
        final SubLObject formatted_second = format(NIL, $str146$_6__0D, universal_second);
        cycml_serialize_time(formatted_second, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cycml_serialize_support(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            cycml_serialize_cyclsentence(uncanonicalizer.assertion_el_formula(support));
        } else {
            cycml_serialize_hl_support(support);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_hl_support(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = $str147$hl_support;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$92 = $str148$module_token;
                        xml_utilities.xml_start_tag_internal(name_var_$92, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_sublsymbol(arguments.support_module(hl_support), UNPROVIDED);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$93, thread);
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                                cycml.cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$92);
                    }
                    cycml_serialize_cyclsentence(arguments.support_sentence(hl_support));
                    cycml_serialize_microtheory(arguments.support_mt(hl_support));
                    cycml_serialize_truth(arguments.support_truth(hl_support), UNPROVIDED);
                    cycml.cycml_serialize_strength(arguments.support_strength(hl_support));
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$91, thread);
                }
                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str3$__);
                    cycml.cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject declare_cycml_generator_file() {
        declareFunction(me, "cycml_serialize_knowledge_package_info", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-INFO", 1, 0, false);
        declareFunction(me, "cycml_serialize_api_request", "CYCML-SERIALIZE-API-REQUEST", 5, 0, false);
        declareFunction(me, "cycml_serialize_justification", "CYCML-SERIALIZE-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "cycml_serialize_truth", "CYCML-SERIALIZE-TRUTH", 1, 1, false);
        declareFunction(me, "cycml_serialize_api_request_requestor", "CYCML-SERIALIZE-API-REQUEST-REQUESTOR", 1, 1, false);
        declareFunction(me, "cycml_serialize_api_request_priority", "CYCML-SERIALIZE-API-REQUEST-PRIORITY", 1, 1, false);
        declareFunction(me, "cycml_serialize_api_request_id", "CYCML-SERIALIZE-API-REQUEST-ID", 1, 1, false);
        declareFunction(me, "cycml_serialize_nonnegativeinteger", "CYCML-SERIALIZE-NONNEGATIVEINTEGER", 1, 1, false);
        declareFunction(me, "cycml_serialize_positiveinteger", "CYCML-SERIALIZE-POSITIVEINTEGER", 1, 1, false);
        declareFunction(me, "cycml_serialize_new_name", "CYCML-SERIALIZE-NEW-NAME", 1, 1, false);
        declareFunction(me, "cycml_serialize_date", "CYCML-SERIALIZE-DATE", 1, 1, false);
        declareFunction(me, "cycml_serialize_time", "CYCML-SERIALIZE-TIME", 1, 1, false);
        declareFunction(me, "cycml_serialize_cyc_image_id", "CYCML-SERIALIZE-CYC-IMAGE-ID", 1, 1, false);
        declareFunction(me, "cycml_serialize_knowledge_package_id", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-ID", 1, 1, false);
        declareFunction(me, "cycml_serialize_sublsymbol", "CYCML-SERIALIZE-SUBLSYMBOL", 1, 1, false);
        declareFunction(me, "cycml_serialize_sublstring", "CYCML-SERIALIZE-SUBLSTRING", 1, 1, false);
        declareFunction(me, "cycml_serialize_sublrealnumber", "CYCML-SERIALIZE-SUBLREALNUMBER", 1, 1, false);
        declareFunction(me, "cycml_serialize_cyclvariable", "CYCML-SERIALIZE-CYCLVARIABLE", 1, 1, false);
        declareFunction(me, "cycml_serialize_uri", "CYCML-SERIALIZE-URI", 1, 1, false);
        declareFunction(me, "cycml_serialize_namespace", "CYCML-SERIALIZE-NAMESPACE", 1, 1, false);
        declareFunction(me, "cycml_serialize_false", "CYCML-SERIALIZE-FALSE", 1, 1, false);
        declareFunction(me, "cycml_serialize_true", "CYCML-SERIALIZE-TRUE", 1, 1, false);
        declareFunction(me, "cycml_kp_info_print_function_trampoline", "CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cycml_kp_info_p", "CYCML-KP-INFO-P", 1, 0, false);
        new cycml_generator.$cycml_kp_info_p$UnaryFunction();
        declareFunction(me, "cycml_kp_info_knowledge_package_id", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 1, 0, false);
        declareFunction(me, "cycml_kp_info_knowledge_package_dependencies", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 1, 0, false);
        declareFunction(me, "cycml_kp_info_operations", "CYCML-KP-INFO-OPERATIONS", 1, 0, false);
        declareFunction(me, "_csetf_cycml_kp_info_knowledge_package_id", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 2, 0, false);
        declareFunction(me, "_csetf_cycml_kp_info_knowledge_package_dependencies", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 2, 0, false);
        declareFunction(me, "_csetf_cycml_kp_info_operations", "_CSETF-CYCML-KP-INFO-OPERATIONS", 2, 0, false);
        declareFunction(me, "make_cycml_kp_info", "MAKE-CYCML-KP-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_cycml_kp_info", "VISIT-DEFSTRUCT-CYCML-KP-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cycml_kp_info_method", "VISIT-DEFSTRUCT-OBJECT-CYCML-KP-INFO-METHOD", 2, 0, false);
        declareFunction(me, "print_cycml_kp_info", "PRINT-CYCML-KP-INFO", 3, 0, false);
        declareFunction(me, "cycml_add_create_constant_oper", "CYCML-ADD-CREATE-CONSTANT-OPER", 2, 5, false);
        declareFunction(me, "cycml_add_find_or_create_constant_oper", "CYCML-ADD-FIND-OR-CREATE-CONSTANT-OPER", 2, 5, false);
        declareFunction(me, "cycml_add_rename_constant_oper", "CYCML-ADD-RENAME-CONSTANT-OPER", 3, 2, false);
        declareFunction(me, "cycml_add_merge_fort_oper", "CYCML-ADD-MERGE-FORT-OPER", 3, 2, false);
        declareFunction(me, "cycml_add_kill_fort_oper", "CYCML-ADD-KILL-FORT-OPER", 2, 3, false);
        declareFunction(me, "cycml_add_assert_oper", "CYCML-ADD-ASSERT-OPER", 2, 8, false);
        declareFunction(me, "cycml_add_reassert_oper", "CYCML-ADD-REASSERT-OPER", 2, 8, false);
        declareFunction(me, "cycml_add_unassert_oper", "CYCML-ADD-UNASSERT-OPER", 2, 4, false);
        declareFunction(me, "cycml_add_blast_assertion_oper", "CYCML-ADD-BLAST-ASSERTION-OPER", 2, 4, false);
        declareFunction(me, "cycml_add_create_skolem_oper", "CYCML-ADD-CREATE-SKOLEM-OPER", 9, 0, false);
        declareFunction(me, "cycml_serialize_knowledge_package", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE", 1, 0, false);
        declareFunction(me, "cycml_serialize_operation", "CYCML-SERIALIZE-OPERATION", 1, 0, false);
        declareFunction(me, "cycml_serialize_create_constant_oper", "CYCML-SERIALIZE-CREATE-CONSTANT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_find_or_create_constant_oper", "CYCML-SERIALIZE-FIND-OR-CREATE-CONSTANT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_rename_constant_oper", "CYCML-SERIALIZE-RENAME-CONSTANT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_merge_forts_oper", "CYCML-SERIALIZE-MERGE-FORTS-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_kill_fort_oper", "CYCML-SERIALIZE-KILL-FORT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_assert_oper", "CYCML-SERIALIZE-ASSERT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_reassert_oper", "CYCML-SERIALIZE-REASSERT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_unassert_oper", "CYCML-SERIALIZE-UNASSERT-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_blast_assertion_oper", "CYCML-SERIALIZE-BLAST-ASSERTION-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_create_skolem_oper", "CYCML-SERIALIZE-CREATE-SKOLEM-OPER", 1, 0, false);
        declareFunction(me, "cycml_serialize_bookkeeping", "CYCML-SERIALIZE-BOOKKEEPING", 5, 0, false);
        declareFunction(me, "cycml_serialize_microtheory", "CYCML-SERIALIZE-MICROTHEORY", 1, 0, false);
        declareFunction(me, "cycml_serialize_fort", "CYCML-SERIALIZE-FORT", 1, 0, false);
        declareFunction(me, "cycml_serialize_cyclconstant", "CYCML-SERIALIZE-CYCLCONSTANT", 1, 0, false);
        declareFunction(me, "cycml_serialize_cyclreifiednonatomicterm", "CYCML-SERIALIZE-CYCLREIFIEDNONATOMICTERM", 1, 0, false);
        declareFunction(me, "cycml_serialize_cyclreifiablenonatomicterm", "CYCML-SERIALIZE-CYCLREIFIABLENONATOMICTERM", 1, 0, false);
        declareFunction(me, "cycml_serialize_elnonatomicterm", "CYCML-SERIALIZE-ELNONATOMICTERM", 1, 0, false);
        declareMacro(me, "within_cycl_atomic_sentence", "WITHIN-CYCL-ATOMIC-SENTENCE");
        declareFunction(me, "cycml_serialize_object", "CYCML-SERIALIZE-OBJECT", 1, 0, false);
        declareFunction(me, "cycml_serialize_object_to_string", "CYCML-SERIALIZE-OBJECT-TO-STRING", 1, 0, false);
        declareFunction(me, "cycml_serialize_subllist", "CYCML-SERIALIZE-SUBLLIST", 1, 0, false);
        declareFunction(me, "cycml_serialize_cyclsentence", "CYCML-SERIALIZE-CYCLSENTENCE", 1, 0, false);
        declareFunction(me, "cycml_serialize_cyclatomicsentence", "CYCML-SERIALIZE-CYCLATOMICSENTENCE", 1, 0, false);
        declareFunction(me, "cycml_serialize_purpose", "CYCML-SERIALIZE-PURPOSE", 1, 0, false);
        declareFunction(me, "cycml_serialize_universal_date", "CYCML-SERIALIZE-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "cycml_serialize_universal_second", "CYCML-SERIALIZE-UNIVERSAL-SECOND", 1, 0, false);
        declareFunction(me, "cycml_serialize_support", "CYCML-SERIALIZE-SUPPORT", 1, 0, false);
        declareFunction(me, "cycml_serialize_hl_support", "CYCML-SERIALIZE-HL-SUPPORT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cycml_generator_file() {
        defconstant("*DTP-CYCML-KP-INFO*", CYCML_KP_INFO);
        defparameter("*WITHIN-CYCL-ATOMIC-SENTENCE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_cycml_generator_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cycml_kp_info$.getGlobalValue(), symbol_function(CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list35);
        def_csetf(CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID, _CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID);
        def_csetf(CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES, _CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES);
        def_csetf(CYCML_KP_INFO_OPERATIONS, _CSETF_CYCML_KP_INFO_OPERATIONS);
        identity(CYCML_KP_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cycml_kp_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYCML_KP_INFO_METHOD));
        register_external_symbol(CYCML_SERIALIZE_OBJECT_TO_STRING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycml_generator_file();
    }

    @Override
    public void initializeVariables() {
        init_cycml_generator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycml_generator_file();
    }

    static {
























































































































































    }

    public static final class $cycml_kp_info_native extends SubLStructNative {
        public SubLObject $knowledge_package_id;

        public SubLObject $knowledge_package_dependencies;

        public SubLObject $operations;

        private static final SubLStructDeclNative structDecl;

        public $cycml_kp_info_native() {
            this.$knowledge_package_id = Lisp.NIL;
            this.$knowledge_package_dependencies = Lisp.NIL;
            this.$operations = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$knowledge_package_id;
        }

        @Override
        public SubLObject getField3() {
            return this.$knowledge_package_dependencies;
        }

        @Override
        public SubLObject getField4() {
            return this.$operations;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$knowledge_package_id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$knowledge_package_dependencies = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$operations = value;
        }

        static {
            structDecl = makeStructDeclNative(cycml_generator.$cycml_kp_info_native.class, CYCML_KP_INFO, CYCML_KP_INFO_P, $list29, $list30, new String[]{ "$knowledge_package_id", "$knowledge_package_dependencies", "$operations" }, $list31, $list32, PRINT_CYCML_KP_INFO);
        }
    }

    public static final class $cycml_kp_info_p$UnaryFunction extends UnaryFunction {
        public $cycml_kp_info_p$UnaryFunction() {
            super(extractFunctionNamed("CYCML-KP-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycml_kp_info_p(arg1);
        }
    }
}

/**
 * Total time: 1044 ms synthetic
 */
