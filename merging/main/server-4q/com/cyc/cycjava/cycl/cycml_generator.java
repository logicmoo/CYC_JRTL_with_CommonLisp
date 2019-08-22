/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constants_high.constant_external_id;
import static com.cyc.cycjava.cycl.constants_high.constant_guid;
import static com.cyc.cycjava.cycl.constants_high.constant_name;
import static com.cyc.cycjava.cycl.constants_high.constant_name_within_namespace;
import static com.cyc.cycjava.cycl.constants_high.constant_namespace;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_constant_p;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_variable_p;
import static com.cyc.cycjava.cycl.numeric_date_utilities.decode_universal_date;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYCML-GENERATOR
 * source file: /cyc/top/cycl/cycml-generator.lisp
 * created:     2019/07/03 17:38:52
 */
public final class cycml_generator extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt106$ = makeString("");

    public static final class $cycml_kp_info_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.this.$knowledge_package_id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.this.$knowledge_package_dependencies;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.this.$operations;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.this.$knowledge_package_id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.this.$knowledge_package_dependencies = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.this.$operations = value;
        }

        public SubLObject $knowledge_package_id = Lisp.NIL;

        public SubLObject $knowledge_package_dependencies = Lisp.NIL;

        public SubLObject $operations = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.class, CYCML_KP_INFO, CYCML_KP_INFO_P, $list_alt29, $list_alt30, new String[]{ "$knowledge_package_id", "$knowledge_package_dependencies", "$operations" }, $list_alt31, $list_alt32, PRINT_CYCML_KP_INFO);
    }

    public static final SubLFile me = new cycml_generator();

 public static final String myName = "com.cyc.cycjava.cycl.cycml_generator";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cycml_kp_info$ = makeSymbol("*DTP-CYCML-KP-INFO*");

    // defparameter
    /**
     * When T the serialization context is within an atomic sentence and lists are
     * more likely to be interpreted as el nats.
     */
    @LispMethod(comment = "When T the serialization context is within an atomic sentence and lists are\r\nmore likely to be interpreted as el nats.\ndefparameter\nWhen T the serialization context is within an atomic sentence and lists are\nmore likely to be interpreted as el nats.")
    private static final SubLSymbol $within_cycl_atomic_sentenceP$ = makeSymbol("*WITHIN-CYCL-ATOMIC-SENTENCE?*");

    static private final SubLString $str3$__ = makeString("~&");

    static private final SubLString $str4$api_request_message = makeString("api-request-message");

    static private final SubLString $str5$api_request = makeString("api-request");

    static private final SubLString $str6$api_request_bindings = makeString("api-request-bindings");

    static private final SubLString $$$justification = makeString("justification");

    static private final SubLString $$$truth = makeString("truth");

    static private final SubLString $str9$api_request_requestor = makeString("api-request-requestor");

    static private final SubLString $str10$api_request_priority = makeString("api-request-priority");

    static private final SubLString $str11$api_request_id = makeString("api-request-id");

    static private final SubLString $$$nonnegativeinteger = makeString("nonnegativeinteger");

    static private final SubLString $$$positiveinteger = makeString("positiveinteger");

    static private final SubLString $str14$new_name = makeString("new-name");

    static private final SubLString $$$date = makeString("date");

    static private final SubLString $$$time = makeString("time");

    static private final SubLString $str17$cyc_image_id = makeString("cyc-image-id");

    static private final SubLString $str18$knowledge_package_id = makeString("knowledge-package-id");

    static private final SubLString $$$sublsymbol = makeString("sublsymbol");

    static private final SubLString $$$sublstring = makeString("sublstring");

    static private final SubLString $$$sublrealnumber = makeString("sublrealnumber");

    static private final SubLString $$$cyclvariable = makeString("cyclvariable");

    static private final SubLString $$$uri = makeString("uri");

    static private final SubLString $$$namespace = makeString("namespace");

    static private final SubLString $$$false = makeString("false");

    static private final SubLString $$$true = makeString("true");

    private static final SubLSymbol CYCML_KP_INFO = makeSymbol("CYCML-KP-INFO");

    private static final SubLSymbol CYCML_KP_INFO_P = makeSymbol("CYCML-KP-INFO-P");

    static private final SubLList $list29 = list(makeSymbol("KNOWLEDGE-PACKAGE-ID"), makeSymbol("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("OPERATIONS"));

    static private final SubLList $list30 = list(makeKeyword("KNOWLEDGE-PACKAGE-ID"), makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeKeyword("OPERATIONS"));

    static private final SubLList $list31 = list(makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("CYCML-KP-INFO-OPERATIONS"));

    static private final SubLList $list32 = list(makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS"));

    private static final SubLSymbol PRINT_CYCML_KP_INFO = makeSymbol("PRINT-CYCML-KP-INFO");

    private static final SubLSymbol CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list77 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $$$rename = makeString("rename");

    static private final SubLList $list79 = list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    private static final SubLString $$$merge = makeString("merge");

    static private final SubLList $list81 = list(makeSymbol("FORT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

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



    private static final SubLString $str112$ = makeString("");



    private static final SubLString $str114$__is_unknown_type_for_CycML_seria = makeString("~ is unknown type for CycML serialization.");

    private static final SubLSymbol CYCML_SERIALIZE_OBJECT_TO_STRING = makeSymbol("CYCML-SERIALIZE-OBJECT-TO-STRING");

    private static final SubLString $$$SubLList = makeString("SubLList");

    private static final SubLString $str117$dotted_item = makeString("dotted-item");



    private static final SubLString $$$not = makeString("not");



    private static final SubLString $$$and = makeString("and");



    private static final SubLString $$$or = makeString("or");



    private static final SubLString $$$xor = makeString("xor");



    private static final SubLString $$$implies = makeString("implies");



    private static final SubLString $$$equiv = makeString("equiv");



    private static final SubLString $$$forAll = makeString("forAll");



    private static final SubLString $$$thereExists = makeString("thereExists");



    private static final SubLString $$$thereExistExactly = makeString("thereExistExactly");



    private static final SubLString $$$thereExistAtMost = makeString("thereExistAtMost");



    private static final SubLString $$$thereExistAtLeast = makeString("thereExistAtLeast");

    private static final SubLSymbol CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");



    private static final SubLString $$$CycLAtomicSentence = makeString("CycLAtomicSentence");

    private static final SubLString $$$Predicate = makeString("Predicate");

    private static final SubLString $$$purpose = makeString("purpose");

    private static final SubLString $str145$_A__A__A = makeString("~A-~A-~A");

    private static final SubLString $str146$_6__0D = makeString("~6,'0D");

    private static final SubLString $str147$hl_support = makeString("hl-support");

    private static final SubLString $str148$module_token = makeString("module-token");

    // Definitions
    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		the CYCML-KP-INFO object to be serialized into CycML.
     * 		Serializes the given CYCML-KP-INFO into CycML.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tthe CYCML-KP-INFO object to be serialized into CycML.\r\n\t\tSerializes the given CYCML-KP-INFO into CycML.")
    public static final SubLObject cycml_serialize_knowledge_package_info_alt(SubLObject cycml_kp_info) {
        cycml.emit_cycml_prologue(UNPROVIDED);
        cycml_serialize_knowledge_package(cycml_kp_info);
        return NIL;
    }

    // Definitions
    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		the CYCML-KP-INFO object to be serialized into CycML.
     * 		Serializes the given CYCML-KP-INFO into CycML.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tthe CYCML-KP-INFO object to be serialized into CycML.\r\n\t\tSerializes the given CYCML-KP-INFO into CycML.")
    public static SubLObject cycml_serialize_knowledge_package_info(final SubLObject cycml_kp_info) {
        cycml.emit_cycml_prologue(UNPROVIDED);
        cycml_serialize_knowledge_package(cycml_kp_info);
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param BINDINGS;
     * 		consp of (var value) pairs
     * 		Serializes the given api REQUEST, ID, PRIORITY, REQUESTOR and BINDINGS into CycML.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n\t\tSerializes the given api REQUEST, ID, PRIORITY, REQUESTOR and BINDINGS into CycML.")
    public static final SubLObject cycml_serialize_api_request_alt(SubLObject request, SubLObject id, SubLObject priority, SubLObject requestor, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(request, CONSP);
            SubLTrampolineFile.checkType(id, INTEGERP);
            SubLTrampolineFile.checkType(priority, INTEGERP);
            SubLTrampolineFile.checkType(requestor, STRINGP);
            SubLTrampolineFile.checkType(v_bindings, CONSP);
            cycml.emit_cycml_prologue(UNPROVIDED);
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $str_alt4$api_request_message;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_1 = $str_alt5$api_request;
                                    xml_utilities.xml_start_tag_internal(name_var_1, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_subllist(request);
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_1);
                                }
                            }
                            cycml_serialize_api_request_id(id, UNPROVIDED);
                            cycml_serialize_api_request_priority(priority, UNPROVIDED);
                            cycml_serialize_api_request_requestor(requestor, UNPROVIDED);
                            if (NIL != v_bindings) {
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                    cycml.cycml_indent();
                                    {
                                        SubLObject name_var_3 = $str_alt6$api_request_bindings;
                                        xml_utilities.xml_start_tag_internal(name_var_3, NIL, NIL);
                                        {
                                            SubLObject _prev_bind_0_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                cycml_serialize_subllist(request);
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                            cycml.cycml_indent();
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var_3);
                                    }
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param BINDINGS;
     * 		consp of (var value) pairs
     * 		Serializes the given api REQUEST, ID, PRIORITY, REQUESTOR and BINDINGS into CycML.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n\t\tSerializes the given api REQUEST, ID, PRIORITY, REQUESTOR and BINDINGS into CycML.")
    public static SubLObject cycml_serialize_api_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != consp(request) : "! consp(request) " + ("Types.consp(request) " + "CommonSymbols.NIL != Types.consp(request) ") + request;
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        assert NIL != integerp(priority) : "! integerp(priority) " + ("Types.integerp(priority) " + "CommonSymbols.NIL != Types.integerp(priority) ") + priority;
        assert NIL != stringp(requestor) : "! stringp(requestor) " + ("Types.stringp(requestor) " + "CommonSymbols.NIL != Types.stringp(requestor) ") + requestor;
        assert NIL != consp(v_bindings) : "! consp(v_bindings) " + ("Types.consp(v_bindings) " + "CommonSymbols.NIL != Types.consp(v_bindings) ") + v_bindings;
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

    /**
     *
     *
     * @param SUPPORTS;
     * 		listp the list of supports which constitute the justification
     * 		Serializes the given justification (list of SUPPORTS) into CycML.
     */
    @LispMethod(comment = "@param SUPPORTS;\r\n\t\tlistp the list of supports which constitute the justification\r\n\t\tSerializes the given justification (list of SUPPORTS) into CycML.")
    public static final SubLObject cycml_serialize_justification_alt(SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            print(supports, UNPROVIDED);
            cycml.emit_cycml_prologue(UNPROVIDED);
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$justification;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            {
                                SubLObject cdolist_list_var = supports;
                                SubLObject support = NIL;
                                for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                    cycml_serialize_support(support);
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param SUPPORTS;
     * 		listp the list of supports which constitute the justification
     * 		Serializes the given justification (list of SUPPORTS) into CycML.
     */
    @LispMethod(comment = "@param SUPPORTS;\r\n\t\tlistp the list of supports which constitute the justification\r\n\t\tSerializes the given justification (list of SUPPORTS) into CycML.")
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

    public static final SubLObject cycml_serialize_truth_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$truth, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_truth(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$truth, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_api_request_requestor_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str_alt9$api_request_requestor, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request_requestor(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str9$api_request_requestor, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_api_request_priority_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str_alt10$api_request_priority, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request_priority(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str10$api_request_priority, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_api_request_id_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str_alt11$api_request_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_api_request_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str11$api_request_id, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_nonnegativeinteger_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$nonnegativeinteger, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_nonnegativeinteger(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$nonnegativeinteger, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_positiveinteger_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$positiveinteger, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_positiveinteger(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$positiveinteger, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_new_name_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str_alt14$new_name, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_new_name(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str14$new_name, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_date_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$date, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_date(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$date, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_time_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$time, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_time(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$time, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_cyc_image_id_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str_alt17$cyc_image_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_cyc_image_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str17$cyc_image_id, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_knowledge_package_id_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str_alt18$knowledge_package_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_knowledge_package_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($str18$knowledge_package_id, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_sublsymbol_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublsymbol, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_sublsymbol(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublsymbol, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_sublstring_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublstring, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_sublstring(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublstring, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_sublrealnumber_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublrealnumber, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_sublrealnumber(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$sublrealnumber, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_cyclvariable_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$cyclvariable, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_cyclvariable(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$cyclvariable, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_uri_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$uri, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_uri(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$uri, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_namespace_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$namespace, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_namespace(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$namespace, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_false_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$false, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_false(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$false, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_serialize_true_alt(SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$true, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_true(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml.cycml_serialize_primitive($$$true, body, attributes);
        return NIL;
    }

    public static final SubLObject cycml_kp_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_cycml_kp_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cycml_kp_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cycml_kp_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cycml_kp_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cycml_kp_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native.class ? T : NIL;
    }

    public static final SubLObject cycml_kp_info_knowledge_package_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCML_KP_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject cycml_kp_info_knowledge_package_id(final SubLObject v_object) {
        assert NIL != cycml_kp_info_p(v_object) : "! cycml_generator.cycml_kp_info_p(v_object) " + "cycml_generator.cycml_kp_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject cycml_kp_info_knowledge_package_dependencies_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCML_KP_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject cycml_kp_info_knowledge_package_dependencies(final SubLObject v_object) {
        assert NIL != cycml_kp_info_p(v_object) : "! cycml_generator.cycml_kp_info_p(v_object) " + "cycml_generator.cycml_kp_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject cycml_kp_info_operations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYCML_KP_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject cycml_kp_info_operations(final SubLObject v_object) {
        assert NIL != cycml_kp_info_p(v_object) : "! cycml_generator.cycml_kp_info_p(v_object) " + "cycml_generator.cycml_kp_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_cycml_kp_info_knowledge_package_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCML_KP_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cycml_kp_info_knowledge_package_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycml_kp_info_p(v_object) : "! cycml_generator.cycml_kp_info_p(v_object) " + "cycml_generator.cycml_kp_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cycml_kp_info_knowledge_package_dependencies_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCML_KP_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cycml_kp_info_knowledge_package_dependencies(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycml_kp_info_p(v_object) : "! cycml_generator.cycml_kp_info_p(v_object) " + "cycml_generator.cycml_kp_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cycml_kp_info_operations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYCML_KP_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cycml_kp_info_operations(final SubLObject v_object, final SubLObject value) {
        assert NIL != cycml_kp_info_p(v_object) : "! cycml_generator.cycml_kp_info_p(v_object) " + "cycml_generator.cycml_kp_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_cycml_kp_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($KNOWLEDGE_PACKAGE_ID)) {
                        _csetf_cycml_kp_info_knowledge_package_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KNOWLEDGE_PACKAGE_DEPENDENCIES)) {
                            _csetf_cycml_kp_info_knowledge_package_dependencies(v_new, current_value);
                        } else {
                            if (pcase_var.eql($OPERATIONS)) {
                                _csetf_cycml_kp_info_operations(v_new, current_value);
                            } else {
                                Errors.error($str_alt44$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cycml_kp_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cycml_generator.$cycml_kp_info_native();
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

    /**
     *
     *
     * @param OBJECT;
     * 		the object to be printed
     * @param STREAM;
     * 		streamp the stream upon which the output is directed
     * @param DEPTH;
     * 		ignored
     * 		Print the given cycml-kp-info structure to the given stream.
     */
    @LispMethod(comment = "@param OBJECT;\r\n\t\tthe object to be printed\r\n@param STREAM;\r\n\t\tstreamp the stream upon which the output is directed\r\n@param DEPTH;\r\n\t\tignored\r\n\t\tPrint the given cycml-kp-info structure to the given stream.")
    public static final SubLObject print_cycml_kp_info_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt45$__CYCML_KP_INFO_, stream, UNPROVIDED, UNPROVIDED);
        prin1(cycml_kp_info_knowledge_package_id(v_object), stream);
        terpri(stream);
        return NIL;
    }

    /**
     *
     *
     * @param OBJECT;
     * 		the object to be printed
     * @param STREAM;
     * 		streamp the stream upon which the output is directed
     * @param DEPTH;
     * 		ignored
     * 		Print the given cycml-kp-info structure to the given stream.
     */
    @LispMethod(comment = "@param OBJECT;\r\n\t\tthe object to be printed\r\n@param STREAM;\r\n\t\tstreamp the stream upon which the output is directed\r\n@param DEPTH;\r\n\t\tignored\r\n\t\tPrint the given cycml-kp-info structure to the given stream.")
    public static SubLObject print_cycml_kp_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str51$__CYCML_KP_INFO_, stream, UNPROVIDED, UNPROVIDED);
        prin1(cycml_kp_info_knowledge_package_id(v_object), stream);
        terpri(stream);
        return NIL;
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param CONSTANT;
     * 		cycl-constant-p the constant created by this operation
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the constant was originally created
     * @param OPERATION-TIME;
     * 		integerp the date on which the constant was created
     * @param OPERATION-SECOND;
     * 		integerp the second on which the constant was created
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for which the constant was created
     * 		Adds a create-constant operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param CONSTANT;\r\n\t\tcycl-constant-p the constant created by this operation\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the constant was originally created\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the constant was created\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the constant was created\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for which the constant was created\r\n\t\tAdds a create-constant operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_create_constant_oper_alt(SubLObject cycml_kp_info, SubLObject constant, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
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
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(constant, CYCL_CONSTANT_P);
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        if (NIL != operation_second) {
            SubLTrampolineFile.checkType(operation_second, INTEGERP);
        }
        if (NIL != purpose) {
            SubLTrampolineFile.checkType(purpose, CYCL_FORT_P);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($CREATE, constant, cyclist, cyc_image_id, operation_time, operation_second, purpose), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param CONSTANT;
     * 		cycl-constant-p the constant created by this operation
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the constant was originally created
     * @param OPERATION-TIME;
     * 		integerp the date on which the constant was created
     * @param OPERATION-SECOND;
     * 		integerp the second on which the constant was created
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for which the constant was created
     * 		Adds a create-constant operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param CONSTANT;\r\n\t\tcycl-constant-p the constant created by this operation\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the constant was originally created\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the constant was created\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the constant was created\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for which the constant was created\r\n\t\tAdds a create-constant operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "! cycl_grammar.cycl_constant_p(constant) " + ("cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) ") + constant;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param CONSTANT;
     * 		cycl-constant-p the constant found or created by this operation
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the constant was originally created
     * @param OPERATION-TIME;
     * 		integerp the date on which the constant was created
     * @param OPERATION-SECOND;
     * 		integerp the second on which the constant was created
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for which the constant was created
     * 		Adds a find-or-create-constant operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param CONSTANT;\r\n\t\tcycl-constant-p the constant found or created by this operation\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the constant was originally created\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the constant was created\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the constant was created\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for which the constant was created\r\n\t\tAdds a find-or-create-constant operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_find_or_create_constant_oper_alt(SubLObject cycml_kp_info, SubLObject constant, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
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
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(constant, CYCL_CONSTANT_P);
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        if (NIL != operation_second) {
            SubLTrampolineFile.checkType(operation_second, INTEGERP);
        }
        if (NIL != purpose) {
            SubLTrampolineFile.checkType(purpose, CYCL_FORT_P);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($FIND_OR_CREATE, constant, cyclist, cyc_image_id, operation_time, operation_second, purpose), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param CONSTANT;
     * 		cycl-constant-p the constant found or created by this operation
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the constant was originally created
     * @param OPERATION-TIME;
     * 		integerp the date on which the constant was created
     * @param OPERATION-SECOND;
     * 		integerp the second on which the constant was created
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for which the constant was created
     * 		Adds a find-or-create-constant operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param CONSTANT;\r\n\t\tcycl-constant-p the constant found or created by this operation\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the constant was originally created\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the constant was created\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the constant was created\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for which the constant was created\r\n\t\tAdds a find-or-create-constant operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "! cycl_grammar.cycl_constant_p(constant) " + ("cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) ") + constant;
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

    /**
     *
     *
     * @unknown CYCML-KP-INFO; cycml-kp-info-p the structure to which this operation will be added
     * @param CONSTANT;
     * 		cycl-constant-p the constant to be renamed by this operation
     * @param NEW-NAME;
     * 		valid-constant-name-p the new name for the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which this operation originated
     * @param OPERATION-TIME;
     * 		integerpthe date on which this operation originated
     * 		Adds a rename operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@unknown CYCML-KP-INFO; cycml-kp-info-p the structure to which this operation will be added\r\n@param CONSTANT;\r\n\t\tcycl-constant-p the constant to be renamed by this operation\r\n@param NEW-NAME;\r\n\t\tvalid-constant-name-p the new name for the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which this operation originated\r\n@param OPERATION-TIME;\r\n\t\tintegerpthe date on which this operation originated\r\n\t\tAdds a rename operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_rename_constant_oper_alt(SubLObject cycml_kp_info, SubLObject constant, SubLObject new_name, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(constant, CYCL_CONSTANT_P);
        SubLTrampolineFile.checkType(new_name, VALID_CONSTANT_NAME_P);
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($RENAME, constant, new_name, cyc_image_id, operation_time), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown CYCML-KP-INFO; cycml-kp-info-p the structure to which this operation will be added
     * @param CONSTANT;
     * 		cycl-constant-p the constant to be renamed by this operation
     * @param NEW-NAME;
     * 		valid-constant-name-p the new name for the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which this operation originated
     * @param OPERATION-TIME;
     * 		integerpthe date on which this operation originated
     * 		Adds a rename operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@unknown CYCML-KP-INFO; cycml-kp-info-p the structure to which this operation will be added\r\n@param CONSTANT;\r\n\t\tcycl-constant-p the constant to be renamed by this operation\r\n@param NEW-NAME;\r\n\t\tvalid-constant-name-p the new name for the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which this operation originated\r\n@param OPERATION-TIME;\r\n\t\tintegerpthe date on which this operation originated\r\n\t\tAdds a rename operation to the given CYCML-KP-INFO object.")
    public static SubLObject cycml_add_rename_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, final SubLObject new_name, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "! cycl_grammar.cycl_constant_p(constant) " + ("cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) ") + constant;
        assert NIL != constant_completion_high.valid_constant_name_p(new_name) : "! constant_completion_high.valid_constant_name_p(new_name) " + ("constant_completion_high.valid_constant_name_p(new_name) " + "CommonSymbols.NIL != constant_completion_high.valid_constant_name_p(new_name) ") + new_name;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param FORT-1;
     * 		cycl-fort-p the first term to be merged by this operation
     * @param FORT-2;
     * 		cycl-fort-p the second term to be merged by this operation
     * @param CYC-IMAGE-ID;
     * 		integerp the cyc image on which this operation originated
     * @param OPERATION-TIME;
     * 		integerp the date on which this operation originated
     * 		Adds a rename operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param FORT-1;\r\n\t\tcycl-fort-p the first term to be merged by this operation\r\n@param FORT-2;\r\n\t\tcycl-fort-p the second term to be merged by this operation\r\n@param CYC-IMAGE-ID;\r\n\t\tintegerp the cyc image on which this operation originated\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which this operation originated\r\n\t\tAdds a rename operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_merge_fort_oper_alt(SubLObject cycml_kp_info, SubLObject fort_1, SubLObject fort_2, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(fort_1, CYCL_FORT_P);
        SubLTrampolineFile.checkType(fort_2, CYCL_FORT_P);
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($MERGE, fort_1, fort_2, cyc_image_id, operation_time), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param FORT-1;
     * 		cycl-fort-p the first term to be merged by this operation
     * @param FORT-2;
     * 		cycl-fort-p the second term to be merged by this operation
     * @param CYC-IMAGE-ID;
     * 		integerp the cyc image on which this operation originated
     * @param OPERATION-TIME;
     * 		integerp the date on which this operation originated
     * 		Adds a rename operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param FORT-1;\r\n\t\tcycl-fort-p the first term to be merged by this operation\r\n@param FORT-2;\r\n\t\tcycl-fort-p the second term to be merged by this operation\r\n@param CYC-IMAGE-ID;\r\n\t\tintegerp the cyc image on which this operation originated\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which this operation originated\r\n\t\tAdds a rename operation to the given CYCML-KP-INFO object.")
    public static SubLObject cycml_add_merge_fort_oper(final SubLObject cycml_kp_info, final SubLObject fort_1, final SubLObject fort_2, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_fort_p(fort_1) : "! cycl_grammar.cycl_fort_p(fort_1) " + ("cycl_grammar.cycl_fort_p(fort_1) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(fort_1) ") + fort_1;
        assert NIL != cycl_grammar.cycl_fort_p(fort_2) : "! cycl_grammar.cycl_fort_p(fort_2) " + ("cycl_grammar.cycl_fort_p(fort_2) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(fort_2) ") + fort_2;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param FORT;
     * 		cycl-fort-p the fort killed by this operation
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who killed the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the constant was originally killed
     * 		Adds a kill-fort operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param FORT;\r\n\t\tcycl-fort-p the fort killed by this operation\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who killed the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the constant was originally killed\r\n\t\tAdds a kill-fort operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_kill_fort_oper_alt(SubLObject cycml_kp_info, SubLObject fort, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyclist == UNPROVIDED) {
            cyclist = NIL;
        }
        if (cyc_image_id == UNPROVIDED) {
            cyc_image_id = NIL;
        }
        if (operation_time == UNPROVIDED) {
            operation_time = NIL;
        }
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(fort, CYCL_FORT_P);
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($KILL, fort, cyclist, cyc_image_id, operation_time), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param FORT;
     * 		cycl-fort-p the fort killed by this operation
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who killed the constant
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the constant was originally killed
     * 		Adds a kill-fort operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param FORT;\r\n\t\tcycl-fort-p the fort killed by this operation\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who killed the constant\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the constant was originally killed\r\n\t\tAdds a kill-fort operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_fort_p(fort) : "! cycl_grammar.cycl_fort_p(fort) " + ("cycl_grammar.cycl_fort_p(fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(fort) ") + fort;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion asserted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param STRENGTH;
     * 		el-strength-p the strength of the assertion
     * @param DIRECTION;
     * 		direction-p the direction of the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was originally made
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was made
     * @param OPERATION-SECOND;
     * 		integerp the second on which the assertion was made
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for the assertion
     * 		Adds an assert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion asserted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param STRENGTH;\r\n\t\tel-strength-p the strength of the assertion\r\n@param DIRECTION;\r\n\t\tdirection-p the direction of the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was originally made\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was made\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the assertion was made\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for the assertion\r\n\t\tAdds an assert  operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_assert_oper_alt(SubLObject cycml_kp_info, SubLObject assertion, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
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
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(assertion, CYCL_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, CYCL_FORT_P);
        }
        if (NIL != strength) {
            SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
        }
        if (NIL != direction) {
            SubLTrampolineFile.checkType(direction, DIRECTION_P);
        }
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        if (NIL != operation_second) {
            SubLTrampolineFile.checkType(operation_second, INTEGERP);
        }
        if (NIL != purpose) {
            SubLTrampolineFile.checkType(purpose, CYCL_FORT_P);
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
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list(new SubLObject[]{ $ASSERT, assertion, mt, strength, direction, cyclist, cyc_image_id, operation_time, operation_second, purpose }), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion asserted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param STRENGTH;
     * 		el-strength-p the strength of the assertion
     * @param DIRECTION;
     * 		direction-p the direction of the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was originally made
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was made
     * @param OPERATION-SECOND;
     * 		integerp the second on which the assertion was made
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for the assertion
     * 		Adds an assert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion asserted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param STRENGTH;\r\n\t\tel-strength-p the strength of the assertion\r\n@param DIRECTION;\r\n\t\tdirection-p the direction of the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was originally made\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was made\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the assertion was made\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for the assertion\r\n\t\tAdds an assert  operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "! cycl_grammar.cycl_sentence_p(assertion) " + ("cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) ") + assertion;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion reasserted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param STRENGTH;
     * 		el-strength-p the strength of the assertion
     * @param DIRECTION;
     * 		direction-p the direction of the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was originally made
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was made
     * @param OPERATION-SECOND;
     * 		integerp the second on which the assertion was made
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for the assertion
     * 		Adds a reassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion reasserted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param STRENGTH;\r\n\t\tel-strength-p the strength of the assertion\r\n@param DIRECTION;\r\n\t\tdirection-p the direction of the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was originally made\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was made\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the assertion was made\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for the assertion\r\n\t\tAdds a reassert  operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_reassert_oper_alt(SubLObject cycml_kp_info, SubLObject assertion, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
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
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(assertion, CYCL_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, CYCL_FORT_P);
        }
        if (NIL != strength) {
            SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
        }
        if (NIL != direction) {
            SubLTrampolineFile.checkType(direction, DIRECTION_P);
        }
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        if (NIL != operation_second) {
            SubLTrampolineFile.checkType(operation_second, INTEGERP);
        }
        if (NIL != purpose) {
            SubLTrampolineFile.checkType(purpose, CYCL_FORT_P);
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
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list(new SubLObject[]{ $REASSERT, assertion, mt, strength, direction, cyclist, cyc_image_id, operation_time, operation_second, purpose }), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion reasserted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param STRENGTH;
     * 		el-strength-p the strength of the assertion
     * @param DIRECTION;
     * 		direction-p the direction of the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who created the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was originally made
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was made
     * @param OPERATION-SECOND;
     * 		integerp the second on which the assertion was made
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for the assertion
     * 		Adds a reassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion reasserted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param STRENGTH;\r\n\t\tel-strength-p the strength of the assertion\r\n@param DIRECTION;\r\n\t\tdirection-p the direction of the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who created the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was originally made\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was made\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the assertion was made\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for the assertion\r\n\t\tAdds a reassert  operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "! cycl_grammar.cycl_sentence_p(assertion) " + ("cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) ") + assertion;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion unasserted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who unasserted the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was unasserted
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was unasserted
     * 		Adds an unassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion unasserted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who unasserted the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was unasserted\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was unasserted\r\n\t\tAdds an unassert  operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_unassert_oper_alt(SubLObject cycml_kp_info, SubLObject assertion, SubLObject mt, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
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
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(assertion, CYCL_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, CYCL_FORT_P);
        }
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == mt)) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($UNASSERT, assertion, mt, cyclist, cyc_image_id, operation_time), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion unasserted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who unasserted the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was unasserted
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was unasserted
     * 		Adds an unassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion unasserted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who unasserted the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was unasserted\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was unasserted\r\n\t\tAdds an unassert  operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "! cycl_grammar.cycl_sentence_p(assertion) " + ("cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) ") + assertion;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion blasted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who blasted the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was blasted
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was blasted
     * 		Adds an unassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion blasted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who blasted the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was blasted\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was blasted\r\n\t\tAdds an unassert  operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_blast_assertion_oper_alt(SubLObject cycml_kp_info, SubLObject assertion, SubLObject mt, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
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
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(assertion, CYCL_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, CYCL_FORT_P);
        }
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == mt)) {
            mt = assertions_high.assertion_mt(assertion);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list($BLAST, assertion, mt, cyclist, cyc_image_id, operation_time), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param ASSERTION;
     * 		cycl-sentence-p the assertion blasted by this operation
     * @param MT;
     * 		cycl-fort-p the mt containing the assertion
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who blasted the assertion
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the assertion was blasted
     * @param OPERATION-TIME;
     * 		integerp the date on which the assertion was blasted
     * 		Adds an unassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param ASSERTION;\r\n\t\tcycl-sentence-p the assertion blasted by this operation\r\n@param MT;\r\n\t\tcycl-fort-p the mt containing the assertion\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who blasted the assertion\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the assertion was blasted\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the assertion was blasted\r\n\t\tAdds an unassert  operation to the given CYCML-KP-INFO object.")
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
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != cycl_grammar.cycl_sentence_p(assertion) : "! cycl_grammar.cycl_sentence_p(assertion) " + ("cycl_grammar.cycl_sentence_p(assertion) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion) ") + assertion;
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

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param EXTERNAL-ID;
     * 		constant-external-id-p the guid of the skolem
     * @param UNREIFIED-SK-TERM;
     * 		consp unreified skolem nat denoting the skolem function term
     * @param MT;
     * 		cycl-fort-p the mt in which the existential formula was asserted
     * @param CNFS;
     * 		listp a list of cnf clauses, each formatted as ( neg-lits pos-lits ) the neg-lits will exclude termOfUnit literals, the variables in the clauses will be el variables, the skolem function term will be the variable ?X-0 (see (sk-defn-var))
     * @param ARG-TYPES;
     * 		listp a list of argument types for each of the skolem function args
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who asserted the existential formula
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the existential formula was asserted
     * @param OPERATION-TIME;
     * 		integerp the date on which the existential formula was asserted
     * 		Adds an unassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param EXTERNAL-ID;\r\n\t\tconstant-external-id-p the guid of the skolem\r\n@param UNREIFIED-SK-TERM;\r\n\t\tconsp unreified skolem nat denoting the skolem function term\r\n@param MT;\r\n\t\tcycl-fort-p the mt in which the existential formula was asserted\r\n@param CNFS;\r\n\t\tlistp a list of cnf clauses, each formatted as ( neg-lits pos-lits ) the neg-lits will exclude termOfUnit literals, the variables in the clauses will be el variables, the skolem function term will be the variable ?X-0 (see (sk-defn-var))\r\n@param ARG-TYPES;\r\n\t\tlistp a list of argument types for each of the skolem function args\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who asserted the existential formula\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the existential formula was asserted\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the existential formula was asserted\r\n\t\tAdds an unassert  operation to the given CYCML-KP-INFO object.")
    public static final SubLObject cycml_add_create_skolem_oper_alt(SubLObject cycml_kp_info, SubLObject external_id, SubLObject unreified_sk_term, SubLObject mt, SubLObject cnfs, SubLObject arg_types, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        SubLTrampolineFile.checkType(cycml_kp_info, CYCML_KP_INFO_P);
        SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        SubLTrampolineFile.checkType(unreified_sk_term, CONSP);
        SubLTrampolineFile.checkType(mt, CYCL_FORT_P);
        SubLTrampolineFile.checkType(cnfs, LISTP);
        SubLTrampolineFile.checkType(arg_types, LISTP);
        if (NIL != cyclist) {
            SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
        }
        if (NIL != cyc_image_id) {
            SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
        }
        if (NIL != operation_time) {
            SubLTrampolineFile.checkType(operation_time, INTEGERP);
        }
        {
            SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
            operations = cons(list(new SubLObject[]{ $CREATE_SKOLEM, external_id, unreified_sk_term, mt, cnfs, arg_types, cyclist, cyc_image_id, operation_time }), operations);
            _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCML-KP-INFO;
     * 		cycml-kp-info-p the structure to which this operation will be added
     * @param EXTERNAL-ID;
     * 		constant-external-id-p the guid of the skolem
     * @param UNREIFIED-SK-TERM;
     * 		consp unreified skolem nat denoting the skolem function term
     * @param MT;
     * 		cycl-fort-p the mt in which the existential formula was asserted
     * @param CNFS;
     * 		listp a list of cnf clauses, each formatted as ( neg-lits pos-lits ) the neg-lits will exclude termOfUnit literals, the variables in the clauses will be el variables, the skolem function term will be the variable ?X-0 (see (sk-defn-var))
     * @param ARG-TYPES;
     * 		listp a list of argument types for each of the skolem function args
     * @param CYCLIST;
     * 		cycl-fort-p the cyclist who asserted the existential formula
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the existential formula was asserted
     * @param OPERATION-TIME;
     * 		integerp the date on which the existential formula was asserted
     * 		Adds an unassert  operation to the given CYCML-KP-INFO object.
     */
    @LispMethod(comment = "@param CYCML-KP-INFO;\r\n\t\tcycml-kp-info-p the structure to which this operation will be added\r\n@param EXTERNAL-ID;\r\n\t\tconstant-external-id-p the guid of the skolem\r\n@param UNREIFIED-SK-TERM;\r\n\t\tconsp unreified skolem nat denoting the skolem function term\r\n@param MT;\r\n\t\tcycl-fort-p the mt in which the existential formula was asserted\r\n@param CNFS;\r\n\t\tlistp a list of cnf clauses, each formatted as ( neg-lits pos-lits ) the neg-lits will exclude termOfUnit literals, the variables in the clauses will be el variables, the skolem function term will be the variable ?X-0 (see (sk-defn-var))\r\n@param ARG-TYPES;\r\n\t\tlistp a list of argument types for each of the skolem function args\r\n@param CYCLIST;\r\n\t\tcycl-fort-p the cyclist who asserted the existential formula\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the existential formula was asserted\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the existential formula was asserted\r\n\t\tAdds an unassert  operation to the given CYCML-KP-INFO object.")
    public static SubLObject cycml_add_create_skolem_oper(final SubLObject cycml_kp_info, final SubLObject external_id, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types, final SubLObject cyclist, final SubLObject cyc_image_id, final SubLObject operation_time) {
        assert NIL != cycml_kp_info_p(cycml_kp_info) : "! cycml_generator.cycml_kp_info_p(cycml_kp_info) " + ("cycml_generator.cycml_kp_info_p(cycml_kp_info) " + "CommonSymbols.NIL != cycml_generator.cycml_kp_info_p(cycml_kp_info) ") + cycml_kp_info;
        assert NIL != constants_high.constant_external_id_p(external_id) : "! constants_high.constant_external_id_p(external_id) " + ("constants_high.constant_external_id_p(external_id) " + "CommonSymbols.NIL != constants_high.constant_external_id_p(external_id) ") + external_id;
        assert NIL != consp(unreified_sk_term) : "! consp(unreified_sk_term) " + ("Types.consp(unreified_sk_term) " + "CommonSymbols.NIL != Types.consp(unreified_sk_term) ") + unreified_sk_term;
        assert NIL != cycl_grammar.cycl_fort_p(mt) : "! cycl_grammar.cycl_fort_p(mt) " + ("cycl_grammar.cycl_fort_p(mt) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(mt) ") + mt;
        assert NIL != listp(cnfs) : "! listp(cnfs) " + ("Types.listp(cnfs) " + "CommonSymbols.NIL != Types.listp(cnfs) ") + cnfs;
        assert NIL != listp(arg_types) : "! listp(arg_types) " + ("Types.listp(arg_types) " + "CommonSymbols.NIL != Types.listp(arg_types) ") + arg_types;
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

    /**
     *
     *
     * @param KNOWLEDGE-PACKAGE-ID;
     * 		cycl-fort-p a term denoting the knowledge package
     * @param KNOWLEDGE-PACKAGE-DEPENDENCIES;
     * 		listp a list of knowledge package terms
     * @return NIL
    Writes the knowledge-package element to *xml-stream*.
     */
    @LispMethod(comment = "@param KNOWLEDGE-PACKAGE-ID;\r\n\t\tcycl-fort-p a term denoting the knowledge package\r\n@param KNOWLEDGE-PACKAGE-DEPENDENCIES;\r\n\t\tlistp a list of knowledge package terms\r\n@return NIL\r\nWrites the knowledge-package element to *xml-stream*.")
    public static final SubLObject cycml_serialize_knowledge_package_alt(SubLObject cycml_kp_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$cycml;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_5 = $str_alt65$knowledge_package;
                                    xml_utilities.xml_start_tag_internal(name_var_5, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_knowledge_package_id(cycml_kp_info_knowledge_package_id(cycml_kp_info), UNPROVIDED);
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                                {
                                                    SubLObject name_var_7 = $str_alt66$knowledge_package_dependencies;
                                                    xml_utilities.xml_start_tag_internal(name_var_7, NIL, NIL);
                                                    {
                                                        SubLObject _prev_bind_0_8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                            {
                                                                SubLObject cdolist_list_var = cycml_kp_info_knowledge_package_dependencies(cycml_kp_info);
                                                                SubLObject knowledge_package_dependency = NIL;
                                                                for (knowledge_package_dependency = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_package_dependency = cdolist_list_var.first()) {
                                                                    cycml_serialize_knowledge_package_id(knowledge_package_dependency, UNPROVIDED);
                                                                }
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                        cycml.cycml_indent();
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var_7);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_5);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_9 = $$$operations;
                                    xml_utilities.xml_start_tag_internal(name_var_9, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = reverse(cycml_kp_info_operations(cycml_kp_info));
                                                SubLObject operation = NIL;
                                                for (operation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , operation = cdolist_list_var.first()) {
                                                    cycml_serialize_operation(operation);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_9);
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param KNOWLEDGE-PACKAGE-ID;
     * 		cycl-fort-p a term denoting the knowledge package
     * @param KNOWLEDGE-PACKAGE-DEPENDENCIES;
     * 		listp a list of knowledge package terms
     * @return NIL
    Writes the knowledge-package element to *xml-stream*.
     */
    @LispMethod(comment = "@param KNOWLEDGE-PACKAGE-ID;\r\n\t\tcycl-fort-p a term denoting the knowledge package\r\n@param KNOWLEDGE-PACKAGE-DEPENDENCIES;\r\n\t\tlistp a list of knowledge package terms\r\n@return NIL\r\nWrites the knowledge-package element to *xml-stream*.")
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

    /**
     *
     *
     * @param OPERATION;
     * 		consp the KB operation to be serialized into xml
     * 		Serializes the given KB operaion into CycML.
     */
    @LispMethod(comment = "@param OPERATION;\r\n\t\tconsp the KB operation to be serialized into xml\r\n\t\tSerializes the given KB operaion into CycML.")
    public static final SubLObject cycml_serialize_operation_alt(SubLObject operation) {
        {
            SubLObject operation_type = operation.first();
            SubLObject pcase_var = operation_type;
            if (pcase_var.eql($CREATE)) {
                cycml_serialize_create_constant_oper(operation.rest());
            } else {
                if (pcase_var.eql($FIND_OR_CREATE)) {
                    cycml_serialize_find_or_create_constant_oper(operation.rest());
                } else {
                    if (pcase_var.eql($RENAME)) {
                        cycml_serialize_rename_constant_oper(operation.rest());
                    } else {
                        if (pcase_var.eql($MERGE)) {
                            cycml_serialize_merge_forts_oper(operation.rest());
                        } else {
                            if (pcase_var.eql($KILL)) {
                                cycml_serialize_kill_fort_oper(operation.rest());
                            } else {
                                if (pcase_var.eql($ASSERT)) {
                                    cycml_serialize_assert_oper(operation.rest());
                                } else {
                                    if (pcase_var.eql($REASSERT)) {
                                        cycml_serialize_reassert_oper(operation.rest());
                                    } else {
                                        if (pcase_var.eql($UNASSERT)) {
                                            cycml_serialize_unassert_oper(operation.rest());
                                        } else {
                                            if (pcase_var.eql($BLAST)) {
                                                cycml_serialize_blast_assertion_oper(operation.rest());
                                            } else {
                                                if (pcase_var.eql($CREATE_SKOLEM)) {
                                                    cycml_serialize_create_skolem_oper(operation.rest());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OPERATION;
     * 		consp the KB operation to be serialized into xml
     * 		Serializes the given KB operaion into CycML.
     */
    @LispMethod(comment = "@param OPERATION;\r\n\t\tconsp the KB operation to be serialized into xml\r\n\t\tSerializes the given KB operaion into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the create KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the create KB operation into CycML.")
    public static final SubLObject cycml_serialize_create_constant_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject constant = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                SubLObject operation_second = NIL;
                SubLObject purpose = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt68);
                constant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                operation_time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                operation_second = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                purpose = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$create;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclconstant(constant);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt68);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the create KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the create KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the find-or-create KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the find-or-create KB operation into CycML.")
    public static final SubLObject cycml_serialize_find_or_create_constant_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject constant = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                SubLObject operation_second = NIL;
                SubLObject purpose = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt68);
                constant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                operation_time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                operation_second = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt68);
                purpose = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $str_alt70$find_or_create;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclconstant(constant);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt68);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the find-or-create KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of constant, cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the find-or-create KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of constant, new-name, cyc-image-id and operation-time
     * 		Serializes the rename KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of constant, new-name, cyc-image-id and operation-time\r\n\t\tSerializes the rename KB operation into CycML.")
    public static final SubLObject cycml_serialize_rename_constant_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject constant = NIL;
                SubLObject new_name = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt71);
                constant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt71);
                new_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt71);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt71);
                operation_time = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$rename;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclconstant(constant);
                                    cycml_serialize_new_name(new_name, UNPROVIDED);
                                    cycml_serialize_bookkeeping(NIL, cyc_image_id, operation_time, NIL, NIL);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt71);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of constant, new-name, cyc-image-id and operation-time
     * 		Serializes the rename KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of constant, new-name, cyc-image-id and operation-time\r\n\t\tSerializes the rename KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of fort-1, fort-2, cyc-image-id and operation-time
     * 		Serializes the merge forts KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of fort-1, fort-2, cyc-image-id and operation-time\r\n\t\tSerializes the merge forts KB operation into CycML.")
    public static final SubLObject cycml_serialize_merge_forts_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject fort_1 = NIL;
                SubLObject fort_2 = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt73);
                fort_1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt73);
                fort_2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt73);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt73);
                operation_time = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$merge;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_fort(fort_1);
                                    cycml_serialize_fort(fort_2);
                                    cycml_serialize_bookkeeping(NIL, cyc_image_id, operation_time, NIL, NIL);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt73);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of fort-1, fort-2, cyc-image-id and operation-time
     * 		Serializes the merge forts KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of fort-1, fort-2, cyc-image-id and operation-time\r\n\t\tSerializes the merge forts KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of fort, cyclist, cyc-image-id and operation-time
     * 		Serializes the kill KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of fort, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the kill KB operation into CycML.")
    public static final SubLObject cycml_serialize_kill_fort_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject fort = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt75);
                fort = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt75);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt75);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt75);
                operation_time = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$kill;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_fort(fort);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt75);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of fort, cyclist, cyc-image-id and operation-time
     * 		Serializes the kill KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of fort, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the kill KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the assert KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the assert KB operation into CycML.")
    public static final SubLObject cycml_serialize_assert_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject assertion = NIL;
                SubLObject mt = NIL;
                SubLObject strength = NIL;
                SubLObject direction = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                SubLObject operation_second = NIL;
                SubLObject purpose = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt77);
                assertion = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                strength = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                direction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                operation_time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                operation_second = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                purpose = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$assert;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclsentence(assertion);
                                    cycml.cycml_serialize_paraphrase(pph_main.generate_phrase(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $list_alt79);
                                    cycml_serialize_microtheory(mt);
                                    cycml.cycml_serialize_strength(strength);
                                    cycml.cycml_serialize_direction(direction);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt77);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the assert KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the assert KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the reassert KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the reassert KB operation into CycML.")
    public static final SubLObject cycml_serialize_reassert_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject assertion = NIL;
                SubLObject mt = NIL;
                SubLObject strength = NIL;
                SubLObject direction = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                SubLObject operation_second = NIL;
                SubLObject purpose = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt77);
                assertion = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                strength = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                direction = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                operation_time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                operation_second = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt77);
                purpose = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$reassert;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclsentence(assertion);
                                    cycml_serialize_microtheory(mt);
                                    cycml.cycml_serialize_strength(strength);
                                    cycml.cycml_serialize_direction(direction);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt77);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose
     * 		Serializes the reassert KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, strength, direction cyclist, cyc-image-id, operation-time, operation-second and purpose\r\n\t\tSerializes the reassert KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, cyclist, cyc-image-id and operation-time
     * 		Serializes the unassert KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the unassert KB operation into CycML.")
    public static final SubLObject cycml_serialize_unassert_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject assertion = NIL;
                SubLObject mt = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt81);
                assertion = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                operation_time = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$unassert;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclsentence(assertion);
                                    cycml_serialize_microtheory(mt);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt81);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, cyclist, cyc-image-id and operation-time
     * 		Serializes the unassert KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the unassert KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, cyclist, cyc-image-id and operation-time
     * 		Serializes the blast assertion KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the blast assertion KB operation into CycML.")
    public static final SubLObject cycml_serialize_blast_assertion_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject assertion = NIL;
                SubLObject mt = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt81);
                assertion = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                operation_time = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$blast;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclsentence(assertion);
                                    cycml_serialize_microtheory(mt);
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt81);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of assertion, mt, cyclist, cyc-image-id and operation-time
     * 		Serializes the blast assertion KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of assertion, mt, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the blast assertion KB operation into CycML.")
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

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of external-id, unreified-sk-term, mt, cnfs, arg-types, cyclist, cyc-image-id and operation-time
     * 		Serializes the create skolem KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of external-id, unreified-sk-term, mt, cnfs, arg-types, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the create skolem KB operation into CycML.")
    public static final SubLObject cycml_serialize_create_skolem_oper_alt(SubLObject parms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parms;
                SubLObject current = datum;
                SubLObject external_id = NIL;
                SubLObject unreified_sk_term = NIL;
                SubLObject mt = NIL;
                SubLObject cnfs = NIL;
                SubLObject arg_types = NIL;
                SubLObject cyclist = NIL;
                SubLObject cyc_image_id = NIL;
                SubLObject operation_time = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt84);
                external_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                unreified_sk_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                cnfs = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                arg_types = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                cyclist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                cyc_image_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt84);
                operation_time = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $str_alt85$create_skolem;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml.cycml_serialize_guid(external_id, UNPROVIDED);
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                        {
                                            SubLObject name_var_11 = $str_alt86$skolem_unreified_term;
                                            xml_utilities.xml_start_tag_internal(name_var_11, NIL, NIL);
                                            {
                                                SubLObject _prev_bind_0_12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_subllist(unreified_sk_term);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_12, thread);
                                                }
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var_11);
                                        }
                                    }
                                    cycml_serialize_microtheory(mt);
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                        {
                                            SubLObject name_var_13 = $str_alt87$skolem_conjunctive_normal_form;
                                            xml_utilities.xml_start_tag_internal(name_var_13, NIL, NIL);
                                            {
                                                SubLObject _prev_bind_0_14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_subllist(cnfs);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var_13);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                        {
                                            SubLObject name_var_15 = $str_alt88$skolem_arg_types;
                                            xml_utilities.xml_start_tag_internal(name_var_15, NIL, NIL);
                                            {
                                                SubLObject _prev_bind_0_16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_subllist(arg_types);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var_15);
                                        }
                                    }
                                    cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, NIL, NIL);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt84);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PARMS;
     * 		consp  list of external-id, unreified-sk-term, mt, cnfs, arg-types, cyclist, cyc-image-id and operation-time
     * 		Serializes the create skolem KB operation into CycML.
     */
    @LispMethod(comment = "@param PARMS;\r\n\t\tconsp  list of external-id, unreified-sk-term, mt, cnfs, arg-types, cyclist, cyc-image-id and operation-time\r\n\t\tSerializes the create skolem KB operation into CycML.")
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

    /**
     *
     *
     * @param CYCLIST;
     * 		the cyclist who created the object
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the object was originally created
     * @param OPERATION-TIME;
     * 		integerp the date on which the object was created
     * @param OPERATION-SECOND;
     * 		integerp the second on which the object was created
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for which the object was created
     * 		Serializes bookkeeping information into CycML.
     */
    @LispMethod(comment = "@param CYCLIST;\r\n\t\tthe cyclist who created the object\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the object was originally created\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the object was created\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the object was created\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for which the object was created\r\n\t\tSerializes bookkeeping information into CycML.")
    public static final SubLObject cycml_serialize_bookkeeping_alt(SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyclist) {
                SubLTrampolineFile.checkType(cyclist, CYCL_FORT_P);
            }
            if (NIL != cyc_image_id) {
                SubLTrampolineFile.checkType(cyc_image_id, STRINGP);
            }
            if (NIL != operation_time) {
                SubLTrampolineFile.checkType(operation_time, INTEGERP);
            }
            if (NIL != operation_second) {
                SubLTrampolineFile.checkType(operation_second, UNIVERSAL_SECOND_P);
            }
            if (NIL != purpose) {
                SubLTrampolineFile.checkType(purpose, CYCL_FORT_P);
            }
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $str_alt90$bookkeeping_info;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cyclist) {
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                    cycml.cycml_indent();
                                    {
                                        SubLObject name_var_17 = $$$Cyclist;
                                        xml_utilities.xml_start_tag_internal(name_var_17, NIL, NIL);
                                        {
                                            SubLObject _prev_bind_0_18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                cycml_serialize_cyclconstant(cyclist);
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                            cycml.cycml_indent();
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var_17);
                                    }
                                }
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
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param CYCLIST;
     * 		the cyclist who created the object
     * @param CYC-IMAGE-ID;
     * 		stringp the cyc image on which the object was originally created
     * @param OPERATION-TIME;
     * 		integerp the date on which the object was created
     * @param OPERATION-SECOND;
     * 		integerp the second on which the object was created
     * @param PURPOSE;
     * 		cycl-fort-p the purpose (usually a project) for which the object was created
     * 		Serializes bookkeeping information into CycML.
     */
    @LispMethod(comment = "@param CYCLIST;\r\n\t\tthe cyclist who created the object\r\n@param CYC-IMAGE-ID;\r\n\t\tstringp the cyc image on which the object was originally created\r\n@param OPERATION-TIME;\r\n\t\tintegerp the date on which the object was created\r\n@param OPERATION-SECOND;\r\n\t\tintegerp the second on which the object was created\r\n@param PURPOSE;\r\n\t\tcycl-fort-p the purpose (usually a project) for which the object was created\r\n\t\tSerializes bookkeeping information into CycML.")
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

    /**
     *
     *
     * @param EL-OR-HL-FORT;
     * 		cycl-fort-p the mt to be serialized into CycML
     * 		Serializes the given EL or HL mt into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-FORT;\r\n\t\tcycl-fort-p the mt to be serialized into CycML\r\n\t\tSerializes the given EL or HL mt into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_microtheory_alt(SubLObject el_or_hl_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(el_or_hl_fort, CYCL_FORT_P);
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$Microtheory;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycl_constant_p(el_or_hl_fort)) {
                                cycml_serialize_cyclconstant(el_or_hl_fort);
                            } else {
                                cycml_serialize_cyclreifiablenonatomicterm(el_or_hl_fort);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-OR-HL-FORT;
     * 		cycl-fort-p the mt to be serialized into CycML
     * 		Serializes the given EL or HL mt into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-FORT;\r\n\t\tcycl-fort-p the mt to be serialized into CycML\r\n\t\tSerializes the given EL or HL mt into CycML on *xml-stream*.")
    public static SubLObject cycml_serialize_microtheory(final SubLObject el_or_hl_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) : "! cycl_grammar.cycl_fort_p(el_or_hl_fort) " + ("cycl_grammar.cycl_fort_p(el_or_hl_fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) ") + el_or_hl_fort;
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

    /**
     *
     *
     * @param EL-OR-HL-FORT;
     * 		cycl-fort-p the fort to be serialized into CycML
     * 		Serializes the given first order reified term into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-FORT;\r\n\t\tcycl-fort-p the fort to be serialized into CycML\r\n\t\tSerializes the given first order reified term into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_fort_alt(SubLObject el_or_hl_fort) {
        SubLTrampolineFile.checkType(el_or_hl_fort, CYCL_FORT_P);
        if (NIL != cycl_constant_p(el_or_hl_fort)) {
            cycml_serialize_cyclconstant(el_or_hl_fort);
        } else {
            if (NIL != nart_handles.nart_p(el_or_hl_fort)) {
                cycml_serialize_cyclreifiednonatomicterm(el_or_hl_fort);
            } else {
                cycml_serialize_cyclreifiablenonatomicterm(el_or_hl_fort);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param EL-OR-HL-FORT;
     * 		cycl-fort-p the fort to be serialized into CycML
     * 		Serializes the given first order reified term into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-FORT;\r\n\t\tcycl-fort-p the fort to be serialized into CycML\r\n\t\tSerializes the given first order reified term into CycML on *xml-stream*.")
    public static SubLObject cycml_serialize_fort(final SubLObject el_or_hl_fort) {
        assert NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) : "! cycl_grammar.cycl_fort_p(el_or_hl_fort) " + ("cycl_grammar.cycl_fort_p(el_or_hl_fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) ") + el_or_hl_fort;
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

    /**
     *
     *
     * @param CONSTANT;
     * 		cycl-constant-p the constant to be serialized into CycML
     * 		Serializes the given constant into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param CONSTANT;\r\n\t\tcycl-constant-p the constant to be serialized into CycML\r\n\t\tSerializes the given constant into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_cyclconstant_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant, CYCL_CONSTANT_P);
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$CycLConstant;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            cycml.cycml_serialize_name(constant_name_within_namespace(constant), UNPROVIDED);
                            cycml_serialize_namespace(constant_namespace(constant), UNPROVIDED);
                            cycml.cycml_serialize_guid(constant_external_id(constant), UNPROVIDED);
                            cycml_serialize_uri(cconcatenate($str_alt94$urn_uuid_, Guids.guid_to_string(constant_guid(constant))), UNPROVIDED);
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param CONSTANT;
     * 		cycl-constant-p the constant to be serialized into CycML
     * 		Serializes the given constant into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param CONSTANT;\r\n\t\tcycl-constant-p the constant to be serialized into CycML\r\n\t\tSerializes the given constant into CycML on *xml-stream*.")
    public static SubLObject cycml_serialize_cyclconstant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_constant_p(constant) : "! cycl_grammar.cycl_constant_p(constant) " + ("cycl_grammar.cycl_constant_p(constant) " + "CommonSymbols.NIL != cycl_grammar.cycl_constant_p(constant) ") + constant;
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

    /**
     *
     *
     * @param EL-OR-HL-NART;
     * 		cycl-nart-p the reified nart to be serialized into CycML
     * 		Serializes the given non atomic reified term into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-NART;\r\n\t\tcycl-nart-p the reified nart to be serialized into CycML\r\n\t\tSerializes the given non atomic reified term into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_cyclreifiednonatomicterm_alt(SubLObject el_or_hl_nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(el_or_hl_nart, CYCL_NART_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != nart_handles.nart_p(el_or_hl_nart)) || (el_or_hl_nart.isList() && (NIL != nart_handles.nart_p(el_or_hl_nart))))) {
                    Errors.error($str_alt96$_S_is_not_a_reified_nart, el_or_hl_nart);
                }
            }
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$CycLReifiedNonAtomicTerm;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_19 = $str_alt98$Function_Denotational;
                                    xml_utilities.xml_start_tag_internal(name_var_19, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_object(cycl_utilities.nat_functor(el_or_hl_nart));
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_20, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_19);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_21 = $str_alt99$argument_list;
                                    xml_utilities.xml_start_tag_internal(name_var_21, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_or_hl_nart, UNPROVIDED);
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    cycml_serialize_object(arg);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_21);
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-OR-HL-NART;
     * 		cycl-nart-p the reified nart to be serialized into CycML
     * 		Serializes the given non atomic reified term into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-NART;\r\n\t\tcycl-nart-p the reified nart to be serialized into CycML\r\n\t\tSerializes the given non atomic reified term into CycML on *xml-stream*.")
    public static SubLObject cycml_serialize_cyclreifiednonatomicterm(final SubLObject el_or_hl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) : "! cycl_grammar.cycl_nart_p(el_or_hl_nart) " + ("cycl_grammar.cycl_nart_p(el_or_hl_nart) " + "CommonSymbols.NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) ") + el_or_hl_nart;
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

    /**
     *
     *
     * @param EL-OR-HL-NART;
     * 		cycl-nart-p the reifiable nart to be serialized into CycML
     * 		Serializes the given non atomic reified term into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-NART;\r\n\t\tcycl-nart-p the reifiable nart to be serialized into CycML\r\n\t\tSerializes the given non atomic reified term into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_cyclreifiablenonatomicterm_alt(SubLObject el_or_hl_nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(el_or_hl_nart, CYCL_NART_P);
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$CycLReifiableNonAtomicTerm;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_23 = $str_alt98$Function_Denotational;
                                    xml_utilities.xml_start_tag_internal(name_var_23, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_object(cycl_utilities.nat_functor(el_or_hl_nart));
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_24, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_23);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_25 = $str_alt99$argument_list;
                                    xml_utilities.xml_start_tag_internal(name_var_25, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_or_hl_nart, UNPROVIDED);
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    cycml_serialize_object(arg);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_26, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_25);
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-OR-HL-NART;
     * 		cycl-nart-p the reifiable nart to be serialized into CycML
     * 		Serializes the given non atomic reified term into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-NART;\r\n\t\tcycl-nart-p the reifiable nart to be serialized into CycML\r\n\t\tSerializes the given non atomic reified term into CycML on *xml-stream*.")
    public static SubLObject cycml_serialize_cyclreifiablenonatomicterm(final SubLObject el_or_hl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) : "! cycl_grammar.cycl_nart_p(el_or_hl_nart) " + ("cycl_grammar.cycl_nart_p(el_or_hl_nart) " + "CommonSymbols.NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) ") + el_or_hl_nart;
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

    /**
     *
     *
     * @param EL-NAT;
     * 		el-nat-p an EL NAT to be serialized into CycML
     * 		Serializes the given EL unreifiable NAT into CycML on *xml-stream*. Can contain
     * 		HL variables.
     */
    @LispMethod(comment = "@param EL-NAT;\r\n\t\tel-nat-p an EL NAT to be serialized into CycML\r\n\t\tSerializes the given EL unreifiable NAT into CycML on *xml-stream*. Can contain\r\n\t\tHL variables.")
    public static final SubLObject cycml_serialize_elnonatomicterm_alt(SubLObject el_nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(el_nat, CYCL_NAT_P);
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$ELNonAtomicTerm;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_27 = $str_alt98$Function_Denotational;
                                    xml_utilities.xml_start_tag_internal(name_var_27, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_object(cycl_utilities.nat_functor(el_nat));
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_27);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_29 = $str_alt99$argument_list;
                                    xml_utilities.xml_start_tag_internal(name_var_29, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_nat, UNPROVIDED);
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    cycml_serialize_object(arg);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_30, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_29);
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-NAT;
     * 		el-nat-p an EL NAT to be serialized into CycML
     * 		Serializes the given EL unreifiable NAT into CycML on *xml-stream*. Can contain
     * 		HL variables.
     */
    @LispMethod(comment = "@param EL-NAT;\r\n\t\tel-nat-p an EL NAT to be serialized into CycML\r\n\t\tSerializes the given EL unreifiable NAT into CycML on *xml-stream*. Can contain\r\n\t\tHL variables.")
    public static SubLObject cycml_serialize_elnonatomicterm(final SubLObject el_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_nat_p(el_nat) : "! cycl_grammar.cycl_nat_p(el_nat) " + ("cycl_grammar.cycl_nat_p(el_nat) " + "CommonSymbols.NIL != cycl_grammar.cycl_nat_p(el_nat) ") + el_nat;
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

    /**
     * Sets the private variable *within-cycl-atomic-sentence?* to T so that
     * lists are more likely to be interpreted as el nats.
     */
    @LispMethod(comment = "Sets the private variable *within-cycl-atomic-sentence?* to T so that\r\nlists are more likely to be interpreted as el nats.\nSets the private variable *within-cycl-atomic-sentence?* to T so that\nlists are more likely to be interpreted as el nats.")
    public static final SubLObject within_cycl_atomic_sentence_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt104, append(body, NIL));
        }
    }

    @LispMethod(comment = "Sets the private variable *within-cycl-atomic-sentence?* to T so that\r\nlists are more likely to be interpreted as el nats.\nSets the private variable *within-cycl-atomic-sentence?* to T so that\nlists are more likely to be interpreted as el nats.")
    public static SubLObject within_cycl_atomic_sentence(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list110, append(body, NIL));
    }

    /**
     *
     *
     * @param OBJ;
     * 		an object to be serialized into CycML
     * 		Serializes the given EL object into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param OBJ;\r\n\t\tan object to be serialized into CycML\r\n\t\tSerializes the given EL object into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_object_alt(SubLObject obj) {
        if (NIL != cycl_variable_p(obj)) {
            cycml_serialize_cyclvariable(obj, UNPROVIDED);
        } else {
            if (obj.isSymbol()) {
                cycml_serialize_sublsymbol(obj, UNPROVIDED);
            } else {
                if (NIL != nart_handles.nart_p(obj)) {
                    cycml_serialize_cyclreifiednonatomicterm(obj);
                } else {
                    if (NIL != assertion_handles.assertion_p(obj)) {
                        cycml_serialize_cyclsentence(assertions_high.assertion_formula(obj));
                    } else {
                        if (NIL != Guids.guid_p(obj)) {
                            cycml.cycml_serialize_guid(obj, UNPROVIDED);
                        } else {
                            if (obj.isNumber()) {
                                cycml_serialize_sublrealnumber(obj, UNPROVIDED);
                            } else {
                                if (obj.isString()) {
                                    cycml_serialize_sublstring(obj, UNPROVIDED);
                                } else {
                                    if (obj == $$True) {
                                        cycml_serialize_true($str_alt106$, UNPROVIDED);
                                    } else {
                                        if (obj == $$False) {
                                            cycml_serialize_false($str_alt106$, UNPROVIDED);
                                        } else {
                                            if (NIL != cycl_constant_p(obj)) {
                                                cycml_serialize_cyclconstant(obj);
                                            } else {
                                                if ((!obj.isList()) && (NIL != cycl_nat_p(obj))) {
                                                    cycml_serialize_cyclreifiablenonatomicterm(obj);
                                                } else {
                                                    if (obj.isList() && (NIL != cycl_nat_p(obj))) {
                                                        cycml_serialize_elnonatomicterm(obj);
                                                    } else {
                                                        if (obj.isList() && (NIL != el_grammar.el_sentence_p(obj))) {
                                                            cycml_serialize_cyclsentence(obj);
                                                        } else {
                                                            if (obj.isList()) {
                                                                cycml_serialize_subllist(obj);
                                                            } else {
                                                                Errors.error($str_alt108$__is_unknown_type_for_CycML_seria, obj);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OBJ;
     * 		an object to be serialized into CycML
     * 		Serializes the given EL object into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param OBJ;\r\n\t\tan object to be serialized into CycML\r\n\t\tSerializes the given EL object into CycML on *xml-stream*.")
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

    public static final SubLObject cycml_serialize_object_to_string_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            cycml_serialize_object(obj);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    output_string = get_output_stream_string(stream);
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
                return output_string;
            }
        }
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

    /**
     *
     *
     * @param LIST;
    listp
     * 		
     * @return NIL
    Writes an XML serialization of LIST to *xml-stream*.
     */
    @LispMethod(comment = "@param LIST;\nlistp\r\n\t\t\r\n@return NIL\r\nWrites an XML serialization of LIST to *xml-stream*.")
    public static final SubLObject cycml_serialize_subllist_alt(SubLObject list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$SubLList;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            {
                                SubLObject rest = NIL;
                                for (rest = list; rest.isCons(); rest = rest.rest()) {
                                    cycml_serialize_object(rest.first());
                                }
                                if (NIL != rest) {
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                        {
                                            SubLObject name_var_31 = $str_alt111$dotted_item;
                                            xml_utilities.xml_start_tag_internal(name_var_31, NIL, NIL);
                                            {
                                                SubLObject _prev_bind_0_32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_object(rest);
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_32, thread);
                                                }
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var_31);
                                        }
                                    }
                                }
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param LIST;
    listp
     * 		
     * @return NIL
    Writes an XML serialization of LIST to *xml-stream*.
     */
    @LispMethod(comment = "@param LIST;\nlistp\r\n\t\t\r\n@return NIL\r\nWrites an XML serialization of LIST to *xml-stream*.")
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

    /**
     *
     *
     * @param EL-OR-HL-FORMULA;
    cycl-sentence-p
     * 		
     * @return NIL
    Writes an XML serialization of EL-FORMULA to *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-FORMULA;\ncycl-sentence-p\r\n\t\t\r\n@return NIL\r\nWrites an XML serialization of EL-FORMULA to *xml-stream*.")
    public static final SubLObject cycml_serialize_cyclsentence_alt(SubLObject el_or_hl_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(el_or_hl_formula, CYCL_SENTENCE_P);
            {
                SubLObject arg0 = cycl_utilities.cycl_formula_arg0(el_or_hl_formula);
                if (arg0 == $$not) {
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                        {
                            SubLObject name_var = $$$not;
                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                            {
                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                            }
                            xml_utilities.xml_end_tag_internal(name_var);
                        }
                    }
                } else {
                    if (arg0 == $$and) {
                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                            cycml.cycml_indent();
                            {
                                SubLObject name_var = $$$and;
                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                {
                                    SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        {
                                            SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_formula);
                                            SubLObject sentence = NIL;
                                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                cycml_serialize_cyclsentence(sentence);
                                            }
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                    cycml.cycml_indent();
                                }
                                xml_utilities.xml_end_tag_internal(name_var);
                            }
                        }
                    } else {
                        if (arg0 == $$or) {
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var = $$$or;
                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_formula);
                                                SubLObject sentence = NIL;
                                                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                                    cycml_serialize_cyclsentence(sentence);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var);
                                }
                            }
                        } else {
                            if (arg0 == $$xor) {
                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                    cycml.cycml_indent();
                                    {
                                        SubLObject name_var = $$$xor;
                                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                        {
                                            SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                                cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                            cycml.cycml_indent();
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var);
                                    }
                                }
                            } else {
                                if (arg0 == $$implies) {
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                        {
                                            SubLObject name_var = $$$implies;
                                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                            {
                                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var);
                                        }
                                    }
                                } else {
                                    if (arg0 == $$equiv) {
                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                            cycml.cycml_indent();
                                            {
                                                SubLObject name_var = $$$equiv;
                                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                                {
                                                    SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                                                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                    cycml.cycml_indent();
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var);
                                            }
                                        }
                                    } else {
                                        if (arg0 == $$forAll) {
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                                {
                                                    SubLObject name_var = $$$forAll;
                                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                                    {
                                                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                            cycml.cycml_serialize_variable(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                            cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                        cycml.cycml_indent();
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var);
                                                }
                                            }
                                        } else {
                                            if (arg0 == $$thereExists) {
                                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                    cycml.cycml_indent();
                                                    {
                                                        SubLObject name_var = $$$thereExists;
                                                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                                        {
                                                            SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                                cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                            cycml.cycml_indent();
                                                        }
                                                        xml_utilities.xml_end_tag_internal(name_var);
                                                    }
                                                }
                                            } else {
                                                if (arg0 == $$thereExistExactly) {
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                        cycml.cycml_indent();
                                                        {
                                                            SubLObject name_var = $$$thereExistExactly;
                                                            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                                            {
                                                                SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                    cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                                    cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), UNPROVIDED);
                                                                    cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                                }
                                                            }
                                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                                cycml.cycml_indent();
                                                            }
                                                            xml_utilities.xml_end_tag_internal(name_var);
                                                        }
                                                    }
                                                } else {
                                                    if (arg0 == $$thereExistAtMost) {
                                                        if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                            cycml.cycml_indent();
                                                            {
                                                                SubLObject name_var = $$$thereExistAtMost;
                                                                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                                                {
                                                                    SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                        cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                                        cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), UNPROVIDED);
                                                                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                                if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                                    cycml.cycml_indent();
                                                                }
                                                                xml_utilities.xml_end_tag_internal(name_var);
                                                            }
                                                        }
                                                    } else {
                                                        if (arg0 == $$thereExistAtLeast) {
                                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                                cycml.cycml_indent();
                                                                {
                                                                    SubLObject name_var = $$$thereExistAtLeast;
                                                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                                                    {
                                                                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                            cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), UNPROVIDED);
                                                                            cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), UNPROVIDED);
                                                                            cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                                        cycml.cycml_indent();
                                                                    }
                                                                    xml_utilities.xml_end_tag_internal(name_var);
                                                                }
                                                            }
                                                        } else {
                                                            cycml_serialize_cyclatomicsentence(el_or_hl_formula);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-OR-HL-FORMULA;
    cycl-sentence-p
     * 		
     * @return NIL
    Writes an XML serialization of EL-FORMULA to *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-FORMULA;\ncycl-sentence-p\r\n\t\t\r\n@return NIL\r\nWrites an XML serialization of EL-FORMULA to *xml-stream*.")
    public static SubLObject cycml_serialize_cyclsentence(final SubLObject el_or_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_sentence_p(el_or_hl_formula) : "! cycl_grammar.cycl_sentence_p(el_or_hl_formula) " + ("cycl_grammar.cycl_sentence_p(el_or_hl_formula) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(el_or_hl_formula) ") + el_or_hl_formula;
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

    /**
     *
     *
     * @param EL-OR-HL-ATOMIC-SENTENCE;
     * 		cycl-atomic-sentence-p an atomic EL or HL formula
     * 		Serializes the given EL/HL formula, consisting of predicate and args,
     * 		into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-ATOMIC-SENTENCE;\r\n\t\tcycl-atomic-sentence-p an atomic EL or HL formula\r\n\t\tSerializes the given EL/HL formula, consisting of predicate and args,\r\n\t\tinto CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_cyclatomicsentence_alt(SubLObject el_or_hl_atomic_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(el_or_hl_atomic_sentence, CYCL_ATOMIC_SENTENCE_P);
            {
                SubLObject pred = cycl_utilities.cycl_formula_arg0(el_or_hl_atomic_sentence);
                {
                    SubLObject _prev_bind_0 = $within_cycl_atomic_sentenceP$.currentBinding(thread);
                    try {
                        $within_cycl_atomic_sentenceP$.bind(T, thread);
                        if (NIL != isa.isaP(pred, $$OpenCycDefinitionalPredicate, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var = constant_name(pred);
                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_atomic_sentence);
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                    cycml_serialize_object(arg);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_33, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var);
                                }
                            }
                        } else {
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var = $$$CycLAtomicSentence;
                                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                                {
                                                    SubLObject name_var_35 = $$$Predicate;
                                                    xml_utilities.xml_start_tag_internal(name_var_35, NIL, NIL);
                                                    {
                                                        SubLObject _prev_bind_0_36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                            cycml_serialize_object(cycl_utilities.cycl_formula_arg0(el_or_hl_atomic_sentence));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_36, thread);
                                                        }
                                                    }
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                        cycml.cycml_indent();
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var_35);
                                                }
                                            }
                                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                cycml.cycml_indent();
                                                {
                                                    SubLObject name_var_37 = $str_alt99$argument_list;
                                                    xml_utilities.xml_start_tag_internal(name_var_37, NIL, NIL);
                                                    {
                                                        SubLObject _prev_bind_0_38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                            {
                                                                SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_atomic_sentence);
                                                                SubLObject v_term = NIL;
                                                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                    cycml_serialize_object(v_term);
                                                                }
                                                            }
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_38, thread);
                                                        }
                                                    }
                                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                                        cycml.cycml_indent();
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var_37);
                                                }
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_34, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var);
                                }
                            }
                        }
                    } finally {
                        $within_cycl_atomic_sentenceP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param EL-OR-HL-ATOMIC-SENTENCE;
     * 		cycl-atomic-sentence-p an atomic EL or HL formula
     * 		Serializes the given EL/HL formula, consisting of predicate and args,
     * 		into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param EL-OR-HL-ATOMIC-SENTENCE;\r\n\t\tcycl-atomic-sentence-p an atomic EL or HL formula\r\n\t\tSerializes the given EL/HL formula, consisting of predicate and args,\r\n\t\tinto CycML on *xml-stream*.")
    public static SubLObject cycml_serialize_cyclatomicsentence(final SubLObject el_or_hl_atomic_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) : "! cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) " + ("cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) ") + el_or_hl_atomic_sentence;
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

    /**
     *
     *
     * @param PURPOSE;
     * 		cycl-fort-p the constant representing the purpose to be serialized into CycML
     * 		Serializes the given purpose into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param PURPOSE;\r\n\t\tcycl-fort-p the constant representing the purpose to be serialized into CycML\r\n\t\tSerializes the given purpose into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_purpose_alt(SubLObject purpose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $$$purpose;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            cycml_serialize_cyclconstant(purpose);
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PURPOSE;
     * 		cycl-fort-p the constant representing the purpose to be serialized into CycML
     * 		Serializes the given purpose into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param PURPOSE;\r\n\t\tcycl-fort-p the constant representing the purpose to be serialized into CycML\r\n\t\tSerializes the given purpose into CycML on *xml-stream*.")
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

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		the date to be serialized into CycML
     * 		Serializes the given date into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param UNIVERSAL-DATE;\r\n\t\tthe date to be serialized into CycML\r\n\t\tSerializes the given date into CycML on *xml-stream*.")
    public static final SubLObject cycml_serialize_universal_date_alt(SubLObject universal_date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject day = decode_universal_date(universal_date);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject formatted_date = format(NIL, $str_alt139$_A__A__A, new SubLObject[]{ year, month, day });
                    cycml_serialize_date(formatted_date, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		the date to be serialized into CycML
     * 		Serializes the given date into CycML on *xml-stream*.
     */
    @LispMethod(comment = "@param UNIVERSAL-DATE;\r\n\t\tthe date to be serialized into CycML\r\n\t\tSerializes the given date into CycML on *xml-stream*.")
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

    /**
     *
     *
     * @param UNIVERSAL-SECOND
     * 		universal-second-p; the second to be serialized into CycML
     * 		Serializes the given second into CycML as a 6-character HHMMSS string on *xml-stream*.
     */
    @LispMethod(comment = "@param UNIVERSAL-SECOND\r\n\t\tuniversal-second-p; the second to be serialized into CycML\r\n\t\tSerializes the given second into CycML as a 6-character HHMMSS string on *xml-stream*.")
    public static final SubLObject cycml_serialize_universal_second_alt(SubLObject universal_second) {
        SubLTrampolineFile.checkType(universal_second, UNIVERSAL_SECOND_P);
        {
            SubLObject formatted_second = format(NIL, $str_alt140$_6__0D, universal_second);
            cycml_serialize_time(formatted_second, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @param UNIVERSAL-SECOND
     * 		universal-second-p; the second to be serialized into CycML
     * 		Serializes the given second into CycML as a 6-character HHMMSS string on *xml-stream*.
     */
    @LispMethod(comment = "@param UNIVERSAL-SECOND\r\n\t\tuniversal-second-p; the second to be serialized into CycML\r\n\t\tSerializes the given second into CycML as a 6-character HHMMSS string on *xml-stream*.")
    public static SubLObject cycml_serialize_universal_second(final SubLObject universal_second) {
        assert NIL != numeric_date_utilities.universal_second_p(universal_second) : "! numeric_date_utilities.universal_second_p(universal_second) " + ("numeric_date_utilities.universal_second_p(universal_second) " + "CommonSymbols.NIL != numeric_date_utilities.universal_second_p(universal_second) ") + universal_second;
        final SubLObject formatted_second = format(NIL, $str146$_6__0D, universal_second);
        cycml_serialize_time(formatted_second, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param SUPPORT;
     * 		support-p
     * 		Serializes the given SUPPORT into CycML.
     */
    @LispMethod(comment = "@param SUPPORT;\r\n\t\tsupport-p\r\n\t\tSerializes the given SUPPORT into CycML.")
    public static final SubLObject cycml_serialize_support_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            cycml_serialize_cyclsentence(uncanonicalizer.assertion_el_formula(support));
        } else {
            cycml_serialize_hl_support(support);
        }
        return NIL;
    }

    /**
     *
     *
     * @param SUPPORT;
     * 		support-p
     * 		Serializes the given SUPPORT into CycML.
     */
    @LispMethod(comment = "@param SUPPORT;\r\n\t\tsupport-p\r\n\t\tSerializes the given SUPPORT into CycML.")
    public static SubLObject cycml_serialize_support(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            cycml_serialize_cyclsentence(uncanonicalizer.assertion_el_formula(support));
        } else {
            cycml_serialize_hl_support(support);
        }
        return NIL;
    }

    /**
     *
     *
     * @param HL-SUPPORT;
     * 		hl-support-p
     * 		Serializes the given HL-SUPPORT into CycML.
     */
    @LispMethod(comment = "@param HL-SUPPORT;\r\n\t\thl-support-p\r\n\t\tSerializes the given HL-SUPPORT into CycML.")
    public static final SubLObject cycml_serialize_hl_support_alt(SubLObject hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                cycml.cycml_indent();
                {
                    SubLObject name_var = $str_alt141$hl_support;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL);
                    {
                        SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                cycml.cycml_indent();
                                {
                                    SubLObject name_var_39 = $str_alt142$module_token;
                                    xml_utilities.xml_start_tag_internal(name_var_39, NIL, NIL);
                                    {
                                        SubLObject _prev_bind_0_40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_sublsymbol(arguments.support_module(hl_support), UNPROVIDED);
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_40, thread);
                                        }
                                    }
                                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                                        cycml.cycml_indent();
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_39);
                                }
                            }
                            cycml_serialize_cyclsentence(arguments.support_sentence(hl_support));
                            cycml_serialize_microtheory(arguments.support_mt(hl_support));
                            cycml_serialize_truth(arguments.support_truth(hl_support), UNPROVIDED);
                            cycml.cycml_serialize_strength(arguments.support_strength(hl_support));
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str_alt3$__);
                        cycml.cycml_indent();
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param HL-SUPPORT;
     * 		hl-support-p
     * 		Serializes the given HL-SUPPORT into CycML.
     */
    @LispMethod(comment = "@param HL-SUPPORT;\r\n\t\thl-support-p\r\n\t\tSerializes the given HL-SUPPORT into CycML.")
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
        declareFunction("cycml_serialize_knowledge_package_info", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-INFO", 1, 0, false);
        declareFunction("cycml_serialize_api_request", "CYCML-SERIALIZE-API-REQUEST", 5, 0, false);
        declareFunction("cycml_serialize_justification", "CYCML-SERIALIZE-JUSTIFICATION", 1, 0, false);
        declareFunction("cycml_serialize_truth", "CYCML-SERIALIZE-TRUTH", 1, 1, false);
        declareFunction("cycml_serialize_api_request_requestor", "CYCML-SERIALIZE-API-REQUEST-REQUESTOR", 1, 1, false);
        declareFunction("cycml_serialize_api_request_priority", "CYCML-SERIALIZE-API-REQUEST-PRIORITY", 1, 1, false);
        declareFunction("cycml_serialize_api_request_id", "CYCML-SERIALIZE-API-REQUEST-ID", 1, 1, false);
        declareFunction("cycml_serialize_nonnegativeinteger", "CYCML-SERIALIZE-NONNEGATIVEINTEGER", 1, 1, false);
        declareFunction("cycml_serialize_positiveinteger", "CYCML-SERIALIZE-POSITIVEINTEGER", 1, 1, false);
        declareFunction("cycml_serialize_new_name", "CYCML-SERIALIZE-NEW-NAME", 1, 1, false);
        declareFunction("cycml_serialize_date", "CYCML-SERIALIZE-DATE", 1, 1, false);
        declareFunction("cycml_serialize_time", "CYCML-SERIALIZE-TIME", 1, 1, false);
        declareFunction("cycml_serialize_cyc_image_id", "CYCML-SERIALIZE-CYC-IMAGE-ID", 1, 1, false);
        declareFunction("cycml_serialize_knowledge_package_id", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-ID", 1, 1, false);
        declareFunction("cycml_serialize_sublsymbol", "CYCML-SERIALIZE-SUBLSYMBOL", 1, 1, false);
        declareFunction("cycml_serialize_sublstring", "CYCML-SERIALIZE-SUBLSTRING", 1, 1, false);
        declareFunction("cycml_serialize_sublrealnumber", "CYCML-SERIALIZE-SUBLREALNUMBER", 1, 1, false);
        declareFunction("cycml_serialize_cyclvariable", "CYCML-SERIALIZE-CYCLVARIABLE", 1, 1, false);
        declareFunction("cycml_serialize_uri", "CYCML-SERIALIZE-URI", 1, 1, false);
        declareFunction("cycml_serialize_namespace", "CYCML-SERIALIZE-NAMESPACE", 1, 1, false);
        declareFunction("cycml_serialize_false", "CYCML-SERIALIZE-FALSE", 1, 1, false);
        declareFunction("cycml_serialize_true", "CYCML-SERIALIZE-TRUE", 1, 1, false);
        declareFunction("cycml_kp_info_print_function_trampoline", "CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cycml_kp_info_p", "CYCML-KP-INFO-P", 1, 0, false);
        new cycml_generator.$cycml_kp_info_p$UnaryFunction();
        declareFunction("cycml_kp_info_knowledge_package_id", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 1, 0, false);
        declareFunction("cycml_kp_info_knowledge_package_dependencies", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 1, 0, false);
        declareFunction("cycml_kp_info_operations", "CYCML-KP-INFO-OPERATIONS", 1, 0, false);
        declareFunction("_csetf_cycml_kp_info_knowledge_package_id", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 2, 0, false);
        declareFunction("_csetf_cycml_kp_info_knowledge_package_dependencies", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 2, 0, false);
        declareFunction("_csetf_cycml_kp_info_operations", "_CSETF-CYCML-KP-INFO-OPERATIONS", 2, 0, false);
        declareFunction("make_cycml_kp_info", "MAKE-CYCML-KP-INFO", 0, 1, false);
        declareFunction("visit_defstruct_cycml_kp_info", "VISIT-DEFSTRUCT-CYCML-KP-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_cycml_kp_info_method", "VISIT-DEFSTRUCT-OBJECT-CYCML-KP-INFO-METHOD", 2, 0, false);
        declareFunction("print_cycml_kp_info", "PRINT-CYCML-KP-INFO", 3, 0, false);
        declareFunction("cycml_add_create_constant_oper", "CYCML-ADD-CREATE-CONSTANT-OPER", 2, 5, false);
        declareFunction("cycml_add_find_or_create_constant_oper", "CYCML-ADD-FIND-OR-CREATE-CONSTANT-OPER", 2, 5, false);
        declareFunction("cycml_add_rename_constant_oper", "CYCML-ADD-RENAME-CONSTANT-OPER", 3, 2, false);
        declareFunction("cycml_add_merge_fort_oper", "CYCML-ADD-MERGE-FORT-OPER", 3, 2, false);
        declareFunction("cycml_add_kill_fort_oper", "CYCML-ADD-KILL-FORT-OPER", 2, 3, false);
        declareFunction("cycml_add_assert_oper", "CYCML-ADD-ASSERT-OPER", 2, 8, false);
        declareFunction("cycml_add_reassert_oper", "CYCML-ADD-REASSERT-OPER", 2, 8, false);
        declareFunction("cycml_add_unassert_oper", "CYCML-ADD-UNASSERT-OPER", 2, 4, false);
        declareFunction("cycml_add_blast_assertion_oper", "CYCML-ADD-BLAST-ASSERTION-OPER", 2, 4, false);
        declareFunction("cycml_add_create_skolem_oper", "CYCML-ADD-CREATE-SKOLEM-OPER", 9, 0, false);
        declareFunction("cycml_serialize_knowledge_package", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE", 1, 0, false);
        declareFunction("cycml_serialize_operation", "CYCML-SERIALIZE-OPERATION", 1, 0, false);
        declareFunction("cycml_serialize_create_constant_oper", "CYCML-SERIALIZE-CREATE-CONSTANT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_find_or_create_constant_oper", "CYCML-SERIALIZE-FIND-OR-CREATE-CONSTANT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_rename_constant_oper", "CYCML-SERIALIZE-RENAME-CONSTANT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_merge_forts_oper", "CYCML-SERIALIZE-MERGE-FORTS-OPER", 1, 0, false);
        declareFunction("cycml_serialize_kill_fort_oper", "CYCML-SERIALIZE-KILL-FORT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_assert_oper", "CYCML-SERIALIZE-ASSERT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_reassert_oper", "CYCML-SERIALIZE-REASSERT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_unassert_oper", "CYCML-SERIALIZE-UNASSERT-OPER", 1, 0, false);
        declareFunction("cycml_serialize_blast_assertion_oper", "CYCML-SERIALIZE-BLAST-ASSERTION-OPER", 1, 0, false);
        declareFunction("cycml_serialize_create_skolem_oper", "CYCML-SERIALIZE-CREATE-SKOLEM-OPER", 1, 0, false);
        declareFunction("cycml_serialize_bookkeeping", "CYCML-SERIALIZE-BOOKKEEPING", 5, 0, false);
        declareFunction("cycml_serialize_microtheory", "CYCML-SERIALIZE-MICROTHEORY", 1, 0, false);
        declareFunction("cycml_serialize_fort", "CYCML-SERIALIZE-FORT", 1, 0, false);
        declareFunction("cycml_serialize_cyclconstant", "CYCML-SERIALIZE-CYCLCONSTANT", 1, 0, false);
        declareFunction("cycml_serialize_cyclreifiednonatomicterm", "CYCML-SERIALIZE-CYCLREIFIEDNONATOMICTERM", 1, 0, false);
        declareFunction("cycml_serialize_cyclreifiablenonatomicterm", "CYCML-SERIALIZE-CYCLREIFIABLENONATOMICTERM", 1, 0, false);
        declareFunction("cycml_serialize_elnonatomicterm", "CYCML-SERIALIZE-ELNONATOMICTERM", 1, 0, false);
        declareMacro("within_cycl_atomic_sentence", "WITHIN-CYCL-ATOMIC-SENTENCE");
        declareFunction("cycml_serialize_object", "CYCML-SERIALIZE-OBJECT", 1, 0, false);
        declareFunction("cycml_serialize_object_to_string", "CYCML-SERIALIZE-OBJECT-TO-STRING", 1, 0, false);
        declareFunction("cycml_serialize_subllist", "CYCML-SERIALIZE-SUBLLIST", 1, 0, false);
        declareFunction("cycml_serialize_cyclsentence", "CYCML-SERIALIZE-CYCLSENTENCE", 1, 0, false);
        declareFunction("cycml_serialize_cyclatomicsentence", "CYCML-SERIALIZE-CYCLATOMICSENTENCE", 1, 0, false);
        declareFunction("cycml_serialize_purpose", "CYCML-SERIALIZE-PURPOSE", 1, 0, false);
        declareFunction("cycml_serialize_universal_date", "CYCML-SERIALIZE-UNIVERSAL-DATE", 1, 0, false);
        declareFunction("cycml_serialize_universal_second", "CYCML-SERIALIZE-UNIVERSAL-SECOND", 1, 0, false);
        declareFunction("cycml_serialize_support", "CYCML-SERIALIZE-SUPPORT", 1, 0, false);
        declareFunction("cycml_serialize_hl_support", "CYCML-SERIALIZE-HL-SUPPORT", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt3$__ = makeString("~&");

    static private final SubLString $str_alt4$api_request_message = makeString("api-request-message");

    static private final SubLString $str_alt5$api_request = makeString("api-request");

    static private final SubLString $str_alt6$api_request_bindings = makeString("api-request-bindings");

    static private final SubLString $str_alt9$api_request_requestor = makeString("api-request-requestor");

    static private final SubLString $str_alt10$api_request_priority = makeString("api-request-priority");

    static private final SubLString $str_alt11$api_request_id = makeString("api-request-id");

    static private final SubLString $str_alt14$new_name = makeString("new-name");

    static private final SubLString $str_alt17$cyc_image_id = makeString("cyc-image-id");

    static private final SubLString $str_alt18$knowledge_package_id = makeString("knowledge-package-id");

    static private final SubLList $list_alt29 = list(makeSymbol("KNOWLEDGE-PACKAGE-ID"), makeSymbol("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("OPERATIONS"));

    static private final SubLList $list_alt30 = list(makeKeyword("KNOWLEDGE-PACKAGE-ID"), makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeKeyword("OPERATIONS"));

    static private final SubLList $list_alt31 = list(makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("CYCML-KP-INFO-OPERATIONS"));

    static private final SubLList $list_alt32 = list(makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS"));

    public static SubLObject init_cycml_generator_file() {
        defconstant("*DTP-CYCML-KP-INFO*", CYCML_KP_INFO);
        defparameter("*WITHIN-CYCL-ATOMIC-SENTENCE?*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

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

    static private final SubLString $str_alt45$__CYCML_KP_INFO_ = makeString("#<CYCML-KP-INFO:");

    static private final SubLString $str_alt65$knowledge_package = makeString("knowledge-package");

    static private final SubLString $str_alt66$knowledge_package_dependencies = makeString("knowledge-package-dependencies");

    static private final SubLList $list_alt68 = list(makeSymbol("CONSTANT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"), makeSymbol("OPERATION-SECOND"), makeSymbol("PURPOSE"));

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

    static private final SubLString $str_alt70$find_or_create = makeString("find-or-create");

    

    static private final SubLList $list_alt71 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    static private final SubLList $list_alt73 = list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    static private final SubLList $list_alt75 = list(makeSymbol("FORT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    static private final SubLList $list_alt77 = list(new SubLObject[]{ makeSymbol("ASSERTION"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"), makeSymbol("OPERATION-SECOND"), makeSymbol("PURPOSE") });

    static private final SubLList $list_alt79 = list(makeString("lang"), makeString("en"));

    static private final SubLList $list_alt81 = list(makeSymbol("ASSERTION"), makeSymbol("MT"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    static private final SubLList $list_alt84 = list(makeSymbol("EXTERNAL-ID"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"), makeSymbol("ARG-TYPES"), makeSymbol("CYCLIST"), makeSymbol("CYC-IMAGE-ID"), makeSymbol("OPERATION-TIME"));

    static private final SubLString $str_alt85$create_skolem = makeString("create-skolem");

    static private final SubLString $str_alt86$skolem_unreified_term = makeString("skolem-unreified-term");

    static private final SubLString $str_alt87$skolem_conjunctive_normal_form = makeString("skolem-conjunctive-normal-form");

    public static final class $cycml_kp_info_p$UnaryFunction extends UnaryFunction {
        public $cycml_kp_info_p$UnaryFunction() {
            super(extractFunctionNamed("CYCML-KP-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cycml_kp_info_p(arg1);
        }
    }

    static private final SubLString $str_alt88$skolem_arg_types = makeString("skolem-arg-types");

    static private final SubLString $str_alt90$bookkeeping_info = makeString("bookkeeping-info");

    static private final SubLString $str_alt94$urn_uuid_ = makeString("urn:uuid:");

    static private final SubLString $str_alt96$_S_is_not_a_reified_nart = makeString("~S is not a reified nart");

    static private final SubLString $str_alt98$Function_Denotational = makeString("Function-Denotational");

    static private final SubLString $str_alt99$argument_list = makeString("argument-list");

    static private final SubLList $list_alt104 = list(list(makeSymbol("*WITHIN-CYCL-ATOMIC-SENTENCE?*"), T));

    static private final SubLString $str_alt108$__is_unknown_type_for_CycML_seria = makeString("~ is unknown type for CycML serialization.");

    static private final SubLString $str_alt111$dotted_item = makeString("dotted-item");

    static private final SubLString $str_alt139$_A__A__A = makeString("~A-~A-~A");

    static private final SubLString $str_alt140$_6__0D = makeString("~6,'0D");

    static private final SubLString $str_alt141$hl_support = makeString("hl-support");

    static private final SubLString $str_alt142$module_token = makeString("module-token");
}

/**
 * Total time: 1044 ms synthetic
 */
